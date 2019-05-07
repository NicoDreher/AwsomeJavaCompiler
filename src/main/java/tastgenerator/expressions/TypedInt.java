package tastgenerator.expressions;

import bytecodegenerator.Generator;
import common.ObjectType;
import org.objectweb.asm.MethodVisitor;

import java.util.HashMap;
import java.util.Map;

public class TypedInt extends TypedExpression
{
    private int jint;

    public TypedInt(String jint)
    {
        this.jint = Integer.parseInt(jint);
        this.objectType = ObjectType.IntType;
    }

    public int getJint() {
        return jint;
    }

    @Override
    public void generateByteCode(MethodVisitor visitor, Map<String, Integer> localVar) {
        Generator.generate(this, visitor, localVar);
    }
}