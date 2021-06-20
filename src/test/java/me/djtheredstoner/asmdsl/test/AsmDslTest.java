package me.djtheredstoner.asmdsl.test;

import me.djtheredstoner.asmdsl.InsnListBuilder;
import org.junit.jupiter.api.Test;
import org.objectweb.asm.tree.InsnList;

public class AsmDslTest {

    @Test
    public void test() {
        InsnList list = new InsnListBuilder() {{
            getstatic("java/lang/System", "out", "Ljava/io/PrintStream;");
            ldc("Hello, World!");
            invokevirtual("java/io/PrintStream", "println", "(Ljava/lang/String;)V");
        }}.l();
    }

    @Test
    public void labelTest() {
        InsnList list = new InsnListBuilder() {{
            iconst_0();
            ifeq(L("ifeq"));
            add(L("ifeq"));
        }}.l();
    }

}
