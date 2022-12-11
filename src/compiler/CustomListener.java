package compiler;

import gen.ToorlaListener;
import gen.ToorlaParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.List;


public class CustomListener implements ToorlaListener {

    private BufferedWriter out;
    private boolean isEntry = false;
    private String current_class_name = "";

    public CustomListener(BufferedWriter out) {
        this.out = out;
    }

    public void enterProgram(ToorlaParser.ProgramContext ctx) {
        try {
            out.write("program start{\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void exitProgram(ToorlaParser.ProgramContext ctx) {
        try {
            out.write("}");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void enterClassDeclaration(ToorlaParser.ClassDeclarationContext ctx) {
        current_class_name = ctx.className.getText();
        String str;
        if (ctx.classParent != null) {
            str = String.format("\tclass: %s / class parent: %s / isEntry: %b {\n",
                    current_class_name, ctx.classParent.getText(), isEntry);
        } else {
            str = String.format("\tclass: %s / class parent: none / isEntry: %b {\n",
                    current_class_name, isEntry);
        }
        isEntry = false;
        try {
            out.write(str);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void exitClassDeclaration(ToorlaParser.ClassDeclarationContext ctx) {
        try {
            out.write("\t}\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void enterEntryClassDeclaration(ToorlaParser.EntryClassDeclarationContext ctx) {
        isEntry = true;
    }

    public void exitEntryClassDeclaration(ToorlaParser.EntryClassDeclarationContext ctx) {
        //DONE : handled in class declaration
    }

    public void enterFieldDeclaration(ToorlaParser.FieldDeclarationContext ctx) {

    }

    public void exitFieldDeclaration(ToorlaParser.FieldDeclarationContext ctx) {
    }

    public void enterAccess_modifier(ToorlaParser.Access_modifierContext ctx) {
    }

    public void exitAccess_modifier(ToorlaParser.Access_modifierContext ctx) {
    }

    public void enterMethodDeclaration(ToorlaParser.MethodDeclarationContext ctx) {
        String method_name = ctx.methodName.getText();
        String declare_str;
        String param_str = "";
        //class methods and class constructor
        if (ctx.methodAccessModifier != null) {
            String type;
            if (method_name == current_class_name) {
                type = "constructor";
            } else {
                type = "method";
            }
            declare_str = String.format("\t\tclass %s: %s / return type: %s / type: %s {\n",
                    type, method_name, ctx.t.getText(), ctx.methodAccessModifier.getText());
            //parameters
            int param_length = ctx.toorlaType().toArray().length; //n
            List<ToorlaParser.ToorlaTypeContext> types = ctx.toorlaType(); // [n] -> 1 ta n-1 param types
            List<TerminalNode> ids = ctx.ID(); // [n] -> 2 ta n param names
            param_str = "\t\t\tparameter list: [";
            for (int i = 1; i < param_length; i++) {
                param_str += String.format("type : %s / name : %s", types.get(i).getText(), ids.get(i).getText());
                if (i != ctx.toorlaType().toArray().length - 1) {
                    param_str += " , ";
                }
            }
            param_str += "]\n";
        } else {
            declare_str = String.format("\t\tmain method / type: %s {\n", ctx.t.getText());
        }
        try {
            out.write(declare_str);
            out.write(param_str);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void exitMethodDeclaration(ToorlaParser.MethodDeclarationContext ctx) {
        try {
            out.write("\t\t}\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void enterClosedStatement(ToorlaParser.ClosedStatementContext ctx) {
    }

    public void exitClosedStatement(ToorlaParser.ClosedStatementContext ctx) {
    }

    public void enterClosedConditional(ToorlaParser.ClosedConditionalContext ctx) {
    }

    public void exitClosedConditional(ToorlaParser.ClosedConditionalContext ctx) {
    }

    public void enterOpenConditional(ToorlaParser.OpenConditionalContext ctx) {
    }

    public void exitOpenConditional(ToorlaParser.OpenConditionalContext ctx) {
    }

    public void enterOpenStatement(ToorlaParser.OpenStatementContext ctx) {
    }

    public void exitOpenStatement(ToorlaParser.OpenStatementContext ctx) {
    }

    public void enterStatement(ToorlaParser.StatementContext ctx) {
    }

    public void exitStatement(ToorlaParser.StatementContext ctx) {
    }

    public void enterStatementVarDef(ToorlaParser.StatementVarDefContext ctx) {
    }

    public void exitStatementVarDef(ToorlaParser.StatementVarDefContext ctx) {
    }

    public void enterStatementBlock(ToorlaParser.StatementBlockContext ctx) {
    }

    public void exitStatementBlock(ToorlaParser.StatementBlockContext ctx) {
    }

    public void enterStatementContinue(ToorlaParser.StatementContinueContext ctx) {
    }

    public void exitStatementContinue(ToorlaParser.StatementContinueContext ctx) {
    }

    public void enterStatementBreak(ToorlaParser.StatementBreakContext ctx) {
    }

    public void exitStatementBreak(ToorlaParser.StatementBreakContext ctx) {
    }

    public void enterStatementReturn(ToorlaParser.StatementReturnContext ctx) {
    }

    public void exitStatementReturn(ToorlaParser.StatementReturnContext ctx) {
    }

    public void enterStatementClosedLoop(ToorlaParser.StatementClosedLoopContext ctx) {
    }

    public void exitStatementClosedLoop(ToorlaParser.StatementClosedLoopContext ctx) {
    }

    public void enterStatementOpenLoop(ToorlaParser.StatementOpenLoopContext ctx) {
    }

    public void exitStatementOpenLoop(ToorlaParser.StatementOpenLoopContext ctx) {
    }

    public void enterStatementWrite(ToorlaParser.StatementWriteContext ctx) {
    }

    public void exitStatementWrite(ToorlaParser.StatementWriteContext ctx) {
    }

    public void enterStatementAssignment(ToorlaParser.StatementAssignmentContext ctx) {
    }

    public void exitStatementAssignment(ToorlaParser.StatementAssignmentContext ctx) {
    }

    public void enterStatementInc(ToorlaParser.StatementIncContext ctx) {
    }

    public void exitStatementInc(ToorlaParser.StatementIncContext ctx) {
    }

    public void enterStatementDec(ToorlaParser.StatementDecContext ctx) {
    }

    public void exitStatementDec(ToorlaParser.StatementDecContext ctx) {
    }

    public void enterExpression(ToorlaParser.ExpressionContext ctx) {
    }

    public void exitExpression(ToorlaParser.ExpressionContext ctx) {
    }

    public void enterExpressionOr(ToorlaParser.ExpressionOrContext ctx) {
    }

    public void exitExpressionOr(ToorlaParser.ExpressionOrContext ctx) {
    }

    public void enterExpressionOrTemp(ToorlaParser.ExpressionOrTempContext ctx) {
    }

    public void exitExpressionOrTemp(ToorlaParser.ExpressionOrTempContext ctx) {
    }

    public void enterExpressionAnd(ToorlaParser.ExpressionAndContext ctx) {
    }

    public void exitExpressionAnd(ToorlaParser.ExpressionAndContext ctx) {
    }

    public void enterExpressionAndTemp(ToorlaParser.ExpressionAndTempContext ctx) {
    }

    public void exitExpressionAndTemp(ToorlaParser.ExpressionAndTempContext ctx) {
    }

    public void enterExpressionEq(ToorlaParser.ExpressionEqContext ctx) {
    }

    public void exitExpressionEq(ToorlaParser.ExpressionEqContext ctx) {
    }

    public void enterExpressionEqTemp(ToorlaParser.ExpressionEqTempContext ctx) {
    }

    public void exitExpressionEqTemp(ToorlaParser.ExpressionEqTempContext ctx) {
    }

    public void enterExpressionCmp(ToorlaParser.ExpressionCmpContext ctx) {
    }

    public void exitExpressionCmp(ToorlaParser.ExpressionCmpContext ctx) {
    }

    public void enterExpressionCmpTemp(ToorlaParser.ExpressionCmpTempContext ctx) {
    }

    public void exitExpressionCmpTemp(ToorlaParser.ExpressionCmpTempContext ctx) {
    }

    public void enterExpressionAdd(ToorlaParser.ExpressionAddContext ctx) {
    }

    public void exitExpressionAdd(ToorlaParser.ExpressionAddContext ctx) {
    }

    public void enterExpressionAddTemp(ToorlaParser.ExpressionAddTempContext ctx) {
    }

    public void exitExpressionAddTemp(ToorlaParser.ExpressionAddTempContext ctx) {
    }

    public void enterExpressionMultMod(ToorlaParser.ExpressionMultModContext ctx) {
    }

    public void exitExpressionMultMod(ToorlaParser.ExpressionMultModContext ctx) {
    }

    public void enterExpressionMultModTemp(ToorlaParser.ExpressionMultModTempContext ctx) {
    }

    public void exitExpressionMultModTemp(ToorlaParser.ExpressionMultModTempContext ctx) {
    }

    public void enterExpressionUnary(ToorlaParser.ExpressionUnaryContext ctx) {
    }

    public void exitExpressionUnary(ToorlaParser.ExpressionUnaryContext ctx) {
    }

    public void enterExpressionMethods(ToorlaParser.ExpressionMethodsContext ctx) {
    }

    public void exitExpressionMethods(ToorlaParser.ExpressionMethodsContext ctx) {
    }

    public void enterExpressionMethodsTemp(ToorlaParser.ExpressionMethodsTempContext ctx) {
    }

    public void exitExpressionMethodsTemp(ToorlaParser.ExpressionMethodsTempContext ctx) {
    }

    public void enterExpressionOther(ToorlaParser.ExpressionOtherContext ctx) {
    }

    public void exitExpressionOther(ToorlaParser.ExpressionOtherContext ctx) {
    }

    public void enterToorlaType(ToorlaParser.ToorlaTypeContext ctx) {
    }

    public void exitToorlaType(ToorlaParser.ToorlaTypeContext ctx) {
    }

    public void enterSingleType(ToorlaParser.SingleTypeContext ctx) {
    }

    public void exitSingleType(ToorlaParser.SingleTypeContext ctx) {
    }

    public void enterEveryRule(ParserRuleContext ctx) {
    }

    public void exitEveryRule(ParserRuleContext ctx) {
    }

    public void visitTerminal(TerminalNode node) {
    }

    public void visitErrorNode(ErrorNode node) {
    }
}
