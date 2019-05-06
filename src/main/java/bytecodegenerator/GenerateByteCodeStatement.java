package bytecodegenerator;

import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import tastgenerator.generalelements.TypedClass;

public interface GenerateByteCodeStatement {
    void generateByteCode(MethodVisitor visitor);
}
