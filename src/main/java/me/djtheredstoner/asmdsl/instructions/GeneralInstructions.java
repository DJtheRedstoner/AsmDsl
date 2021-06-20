package me.djtheredstoner.asmdsl.instructions;

import me.djtheredstoner.asmdsl.AsmDsl;
import org.objectweb.asm.tree.InsnNode;

import static org.objectweb.asm.Opcodes.*;

public interface GeneralInstructions extends AsmDsl {

    default void nop() {
        l().add(new InsnNode(NOP));
    }

    default void athrow() {
        l().add(new InsnNode(ATHROW));
    }

    default void monitorenter() {
        l().add(new InsnNode(MONITORENTER));
    }

    default void monitorexit() {
        l().add(new InsnNode(MONITOREXIT));
    }

}
