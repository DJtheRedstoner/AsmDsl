package me.djtheredstoner.asmdsl.instructions;

import me.djtheredstoner.asmdsl.AsmDsl;
import org.objectweb.asm.tree.FieldInsnNode;

import static org.objectweb.asm.Opcodes.*;

public interface FieldInstructions extends AsmDsl {

    default void getfield(String owner, String name, String desc) {
        l().add(new FieldInsnNode(GETFIELD, owner, name, desc));
    }

    default void putfield(String owner, String name, String desc) {
        l().add(new FieldInsnNode(PUTFIELD, owner, name, desc));
    }

    default void getstatic(String owner, String name, String desc) {
        l().add(new FieldInsnNode(GETSTATIC, owner, name, desc));
    }

    default void putstatic(String owner, String name, String desc) {
        l().add(new FieldInsnNode(PUTSTATIC, owner, name, desc));
    }

}
