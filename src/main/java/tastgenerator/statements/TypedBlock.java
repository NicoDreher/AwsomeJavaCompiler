package tastgenerator.statements;

import bytecodegenerator.Context;
import bytecodegenerator.Generator;
import common.ObjectType;
import org.objectweb.asm.MethodVisitor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TypedBlock extends TypedStatement
{
    private List<TypedStatement> blockedStatements;

    public TypedBlock(List<TypedStatement> blockedStatements, ObjectType objectType)
    {
        this.blockedStatements = blockedStatements;
        this.objectType = objectType;
    }

    public List<TypedStatement> getBlockedStatements()
    {
        return blockedStatements;
    }

    @Override
    public void generateByteCode(MethodVisitor visitor, Context context) {
        Generator.generate(this, visitor, context);
    }
}
