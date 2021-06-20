package me.djtheredstoner.asmdsl.instructions;

import me.djtheredstoner.asmdsl.AsmDsl;
import org.objectweb.asm.tree.InsnNode;
import org.objectweb.asm.tree.IntInsnNode;
import org.objectweb.asm.tree.MultiANewArrayInsnNode;
import org.objectweb.asm.tree.TypeInsnNode;

import static org.objectweb.asm.Opcodes.*;

public interface ArrayInstructions extends AsmDsl {

    default void iaload() {
        l().add(new InsnNode(IALOAD));
    }

    default void laload() {
        l().add(new InsnNode(LALOAD));
    }

    default void faload() {
        l().add(new InsnNode(FALOAD));
    }

    default void daload() {
        l().add(new InsnNode(DALOAD));
    }

    default void aaload() {
        l().add(new InsnNode(AALOAD));
    }

    default void baload() {
        l().add(new InsnNode(BALOAD));
    }

    default void caload() {
        l().add(new InsnNode(CALOAD));
    }

    default void saload() {
        l().add(new InsnNode(SALOAD));
    }

    default void iastore() {
        l().add(new InsnNode(IASTORE));
    }

    default void lastore() {
        l().add(new InsnNode(LASTORE));
    }

    default void fastore() {
        l().add(new InsnNode(FASTORE));
    }

    default void dastore() {
        l().add(new InsnNode(DASTORE));
    }

    default void aastore() {
        l().add(new InsnNode(AASTORE));
    }

    default void bastore() {
        l().add(new InsnNode(BASTORE));
    }

    default void castore() {
        l().add(new InsnNode(CASTORE));
    }

    default void sastore() {
        l().add(new InsnNode(SASTORE));
    }

    default void newarray(int type) {
        l().add(new IntInsnNode(NEWARRAY, type));
    }

    default void anewarray(String type) {
        l().add(new TypeInsnNode(ANEWARRAY, type));
    }

    default void arraylength() {
        l().add(new InsnNode(ARRAYLENGTH));
    }

    default void multianewarray(String type, int dimensions) {
        l().add(new MultiANewArrayInsnNode(type, dimensions));
    }

}
