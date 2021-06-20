package me.djtheredstoner.asmdsl.instructions;

import me.djtheredstoner.asmdsl.AsmDsl;
import org.objectweb.asm.tree.InsnNode;

import static org.objectweb.asm.Opcodes.*;

public interface CompareInstructions extends AsmDsl {

    default void lcmp() {
        l().add(new InsnNode(LCMP));
    }

    default void fcmpl() {
        l().add(new InsnNode(FCMPL));
    }

    default void fcmpg() {
        l().add(new InsnNode(FCMPG));
    }

    default void dcmpl() {
        l().add(new InsnNode(DCMPL));
    }

    default void dcmpg() {
        l().add(new InsnNode(DCMPG));
    }

}
