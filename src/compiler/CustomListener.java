package compiler;

import gen.ToorlaListener;
import gen.ToorlaParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.BufferedWriter;


public class CustomListener implements ToorlaListener {

    private BufferedWriter out;

    public CustomListener(BufferedWriter out)  {
        this.out = out;
    }
    public void enterProgram(ToorlaParser.ProgramContext ctx) {
    }

    public void exitProgram(ToorlaParser.ProgramContext ctx) {
    }

    public void enterClassDeclaration(ToorlaParser.ClassDeclarationContext ctx) {
    }

    public void exitClassDeclaration(ToorlaParser.ClassDeclarationContext ctx) {
    }

    public void enterEntryClassDeclaration(ToorlaParser.EntryClassDeclarationContext ctx) {
    }

    public void exitEntryClassDeclaration(ToorlaParser.EntryClassDeclarationContext ctx) {
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
    }

    public void exitMethodDeclaration(ToorlaParser.MethodDeclarationContext ctx) {
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
