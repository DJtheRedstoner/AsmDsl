package me.djtheredstoner.asmdsl.instructions;

import me.djtheredstoner.asmdsl.AsmDsl;
import org.objectweb.asm.tree.InsnNode;

import static org.objectweb.asm.Opcodes.*;

public interface StackInstructions extends AsmDsl {

    default void pop() {
        l().add(new InsnNode(POP));
    }

    default void pop2() {
        l().add(new InsnNode(POP2));
    }

    default void dup() {
        l().add(new InsnNode(DUP));
    }

    default void dup_x1() {
        l().add(new InsnNode(DUP_X1));
    }

    default void dup_x2() {
        l().add(new InsnNode(DUP_X2));
    }

    default void dup2() {
        l().add(new InsnNode(DUP2));
    }

    default void dup2_x1() {
        l().add(new InsnNode(DUP2_X1));
    }

    default void dup2_x2() {
        l().add(new InsnNode(DUP2_X2));
    }

    default void swap() {
        l().add(new InsnNode(SWAP));
    }

}
