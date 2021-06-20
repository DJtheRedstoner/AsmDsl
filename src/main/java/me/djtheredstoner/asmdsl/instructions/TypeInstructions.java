package me.djtheredstoner.asmdsl.instructions;

import me.djtheredstoner.asmdsl.AsmDsl;
import org.objectweb.asm.tree.InsnNode;
import org.objectweb.asm.tree.TypeInsnNode;

import static org.objectweb.asm.Opcodes.*;

public interface TypeInstructions extends AsmDsl {

    default void _new(String type) {
        l().add(new TypeInsnNode(NEW, type));
    }

    default void checkcast(String type) {
        l().add(new TypeInsnNode(CHECKCAST, type));
    }

    default void _instanceof(String type) {
        l().add(new TypeInsnNode(INSTANCEOF, type));
    }

}
