package me.djtheredstoner.asmdsl.instructions;

import me.djtheredstoner.asmdsl.AsmDsl;
import org.objectweb.asm.tree.IincInsnNode;
import org.objectweb.asm.tree.VarInsnNode;

import static org.objectweb.asm.Opcodes.*;

public interface VarInstructions extends AsmDsl {

    default void aload(int var) {
        l().add(new VarInsnNode(ALOAD, var));
    }

    default void iload(int var) {
        l().add(new VarInsnNode(ILOAD, var));
    }

    default void lload(int var) {
        l().add(new VarInsnNode(LLOAD, var));
    }

    default void fload(int var) {
        l().add(new VarInsnNode(FLOAD, var));
    }

    default void dload(int var) {
        l().add(new VarInsnNode(DLOAD, var));
    }

    default void astore(int var) {
        l().add(new VarInsnNode(ASTORE, var));
    }

    default void istore(int var) {
        l().add(new VarInsnNode(ISTORE, var));
    }

    default void lstore(int var) {
        l().add(new VarInsnNode(LSTORE, var));
    }

    default void fstore(int var) {
        l().add(new VarInsnNode(FSTORE, var));
    }

    default void dstore(int var) {
        l().add(new VarInsnNode(DSTORE, var));
    }

    default void iinc(int var, int value) {
        l().add(new IincInsnNode(var, value));
    }

}
