package me.djtheredstoner.asmdsl.test;

import me.djtheredstoner.asmdsl.InsnListBuilder;
import org.junit.jupiter.api.Test;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.InsnList;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InstructionsTest {

    @Test
    public void test() {
        InsnList list = new InsnListBuilder() {{
            nop();
            aconst_null();
            iconst_m1();
            iconst_0();
            iconst_1();
            iconst_2();
            iconst_3();
            iconst_4();
            iconst_5();
            lconst_0();
            lconst_1();
            fconst_0();
            fconst_1();
            fconst_2();
            dconst_0();
            dconst_1();
            bipush(0);
            sipush(0);
            ldc(null);
            iload(0);
            lload(0);
            fload(0);
            dload(0);
            aload(0);
            iaload();
            laload();
            faload();
            daload();
            aaload();
            baload();
            caload();
            saload();
            istore(0);
            lstore(0);
            fstore(0);
            dstore(0);
            astore(0);
            iastore();
            lastore();
            fastore();
            dastore();
            aastore();
            bastore();
            castore();
            sastore();
            pop();
            pop2();
            dup();
            dup_x1();
            dup_x2();
            dup2();
            dup2_x1();
            dup2_x2();
            swap();
            iadd();
            ladd();
            fadd();
            dadd();
            isub();
            lsub();
            fsub();
            dsub();
            imul();
            lmul();
            fmul();
            dmul();
            idiv();
            ldiv();
            fdiv();
            ddiv();
            irem();
            lrem();
            frem();
            drem();
            ineg();
            lneg();
            fneg();
            dneg();
            ishl();
            lshl();
            ishr();
            lshr();
            iushr();
            lushr();
            iand();
            land();
            ior();
            lor();
            ixor();
            lxor();
            iinc(0, 0);
            i2l();
            i2f();
            i2d();
            l2i();
            l2f();
            l2d();
            f2i();
            f2l();
            f2d();
            d2i();
            d2l();
            d2f();
            i2b();
            i2c();
            i2s();
            lcmp();
            fcmpl();
            fcmpg();
            dcmpl();
            dcmpg();
            ifeq(null);
            ifne(null);
            iflt(null);
            ifge(null);
            ifgt(null);
            ifle(null);
            if_icmpeq(null);
            if_icmpne(null);
            if_icmplt(null);
            if_icmpge(null);
            if_icmpgt(null);
            if_icmple(null);
            if_acmpeq(null);
            if_acmpne(null);
            _goto(null);
            jsr(null);
            ret(0);
            tableswitch(0, 0, null);
            lookupswitch(null, null, null);
            ireturn();
            lreturn();
            freturn();
            dreturn();
            areturn();
            _return();
            getstatic(null, null, null);
            putstatic(null, null, null);
            getfield(null, null, null);
            putfield(null, null, null);
            invokevirtual(null, null, null);
            invokespecial(null, null, null);
            invokestatic(null, null, null);
            invokeinterface(null, null, null);
            invokedynamic(null, null, null);
            _new(null);
            newarray(0);
            anewarray(null);
            arraylength();
            athrow();
            checkcast(null);
            _instanceof(null);
            monitorenter();
            monitorexit();
            multianewarray(null, 0);
            ifnull(null);
            ifnonnull(null);
        }}.l();

        List<Integer> opcodes = new ArrayList<>();

        try {
            Field[] fields = Opcodes.class.getDeclaredFields();
            for (Field f : fields) {
                if (f.getType() != int.class) continue;
                String name = f.getName();
                if (name.startsWith("ASM") ||
                    name.startsWith("SOURCE_") ||
                    name.startsWith("V") ||
                    name.startsWith("ACC_") ||
                    name.startsWith("T_") ||
                    name.startsWith("H_") ||
                    name.startsWith("F_")
                ) continue;

                opcodes.add(f.getInt(null));
            }
        } catch (Throwable t) {
            throw new RuntimeException("Failed to fetch opcodes", t);
        }

        int i = 0;

        for (AbstractInsnNode node : list) {
            int target = opcodes.get(i);
            assertEquals(target, node.getOpcode());
            i++;
        }
    }

}
