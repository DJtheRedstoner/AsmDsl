package me.djtheredstoner.asmdsl.instructions;

import me.djtheredstoner.asmdsl.AsmDsl;
import org.objectweb.asm.tree.InsnNode;

import static org.objectweb.asm.Opcodes.*;

public interface ConvertInstructions extends AsmDsl {

    default void i2l() {
        l().add(new InsnNode(I2L));
    }

    default void i2f() {
        l().add(new InsnNode(I2F));
    }

    default void i2d() {
        l().add(new InsnNode(I2D));
    }

    default void l2i() {
        l().add(new InsnNode(L2I));
    }

    default void l2f() {
        l().add(new InsnNode(L2F));
    }

    default void l2d() {
        l().add(new InsnNode(L2D));
    }

    default void f2i() {
        l().add(new InsnNode(F2I));
    }

    default void f2l() {
        l().add(new InsnNode(F2L));
    }

    default void f2d() {
        l().add(new InsnNode(F2D));
    }

    default void d2i() {
        l().add(new InsnNode(D2I));
    }

    default void d2l() {
        l().add(new InsnNode(D2L));
    }

    default void d2f() {
        l().add(new InsnNode(D2F));
    }

    default void i2b() {
        l().add(new InsnNode(I2B));
    }

    default void i2c() {
        l().add(new InsnNode(I2C));
    }

    default void i2s() {
        l().add(new InsnNode(I2S));
    }

}
