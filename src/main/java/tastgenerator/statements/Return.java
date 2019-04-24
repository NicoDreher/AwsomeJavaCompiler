package tastgenerator.statements;

import tastgenerator.expressions.Expression;

public class Return extends Statement
{
    private Expression exp;
    public Return(Expression exp)
    {
        this.exp = exp;
    }

    public Expression getExp()
    {
        return exp;
    }
}
