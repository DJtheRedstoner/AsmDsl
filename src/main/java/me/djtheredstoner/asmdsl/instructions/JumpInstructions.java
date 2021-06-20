package me.djtheredstoner.asmdsl.instructions;

import me.djtheredstoner.asmdsl.AsmDsl;
import org.objectweb.asm.tree.*;

import static org.objectweb.asm.Opcodes.*;

public interface JumpInstructions extends AsmDsl {

    default void ifeq(LabelNode target) {
        l().add(new JumpInsnNode(IFEQ, target));
    }

    default void ifne(LabelNode target) {
        l().add(new JumpInsnNode(IFNE, target));
    }

    default void iflt(LabelNode target) {
        l().add(new JumpInsnNode(IFLT, target));
    }

    default void ifge(LabelNode target) {
        l().add(new JumpInsnNode(IFGE, target));
    }

    default void ifgt(LabelNode target) {
        l().add(new JumpInsnNode(IFGT, target));
    }

    default void ifle(LabelNode target) {
        l().add(new JumpInsnNode(IFLE, target));
    }

    default void if_icmpeq(LabelNode target) {
        l().add(new JumpInsnNode(IF_ICMPEQ, target));
    }

    default void if_icmpne(LabelNode target) {
        l().add(new JumpInsnNode(IF_ICMPNE, target));
    }

    default void if_icmplt(LabelNode target) {
        l().add(new JumpInsnNode(IF_ICMPLT, target));
    }

    default void if_icmpge(LabelNode target) {
        l().add(new JumpInsnNode(IF_ICMPGE, target));
    }

    default void if_icmpgt(LabelNode target) {
        l().add(new JumpInsnNode(IF_ICMPGT, target));
    }

    default void if_icmple(LabelNode target) {
        l().add(new JumpInsnNode(IF_ICMPLE, target));
    }

    default void if_acmpeq(LabelNode target) {
        l().add(new JumpInsnNode(IF_ACMPEQ, target));
    }

    default void if_acmpne(LabelNode target) {
        l().add(new JumpInsnNode(IF_ACMPNE, target));
    }

    default void _goto(LabelNode target) {
        l().add(new JumpInsnNode(GOTO, target));
    }

    default void jsr(LabelNode target) {
        l().add(new JumpInsnNode(JSR, target));
    }

    default void ret(int index) {
        l().add(new VarInsnNode(RET, index));
    }

    default void tableswitch(int min, int max, LabelNode defaultHandler, LabelNode... labels) {
        l().add(new TableSwitchInsnNode(min, max, defaultHandler, labels));
    }

    default void lookupswitch(LabelNode defaultHandler, int[] keys, LabelNode[] labels) {
        l().add(new LookupSwitchInsnNode(defaultHandler, keys, labels));
    }

    default void ifnull(LabelNode target) {
        l().add(new JumpInsnNode(IFNULL, target));
    }

    default void ifnonnull(LabelNode target) {
        l().add(new JumpInsnNode(IFNONNULL, target));
    }

}
