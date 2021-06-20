package me.djtheredstoner.asmdsl.instructions;

import me.djtheredstoner.asmdsl.AsmDsl;
import org.objectweb.asm.Handle;
import org.objectweb.asm.tree.InsnNode;
import org.objectweb.asm.tree.InvokeDynamicInsnNode;
import org.objectweb.asm.tree.MethodInsnNode;

import static org.objectweb.asm.Opcodes.*;

public interface MethodInstructions extends AsmDsl {

    default void invokevirtual(String owner, String name, String type) {
        l().add(new MethodInsnNode(INVOKEVIRTUAL, owner, name, type, false));
    }

    default void invokestatic(String owner, String name, String type) {
        l().add(new MethodInsnNode(INVOKESTATIC, owner, name, type, false));
    }

    default void invokespecial(String owner, String name, String type) {
        l().add(new MethodInsnNode(INVOKESPECIAL, owner, name, type, false));
    }

    default void invokeinterface(String owner, String name, String type) {
        l().add(new MethodInsnNode(INVOKEINTERFACE, owner, name, type, true));
    }

    default void invokedynamic(String name, String desc, Handle bootstrap, Object... bootstrapArgs) {
        l().add(new InvokeDynamicInsnNode(name, desc, bootstrap, bootstrapArgs));
    }

    default void _return() {
        l().add(new InsnNode(RETURN));
    }

    default void areturn() {
        l().add(new InsnNode(ARETURN));
    }

    default void ireturn() {
        l().add(new InsnNode(IRETURN));
    }

    default void lreturn() {
        l().add(new InsnNode(LRETURN));
    }

    default void freturn() {
        l().add(new InsnNode(FRETURN));
    }

    default void dreturn() {
        l().add(new InsnNode(DRETURN));
    }

}
