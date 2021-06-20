package me.djtheredstoner.asmdsl;

import me.djtheredstoner.asmdsl.instructions.*;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.LabelNode;

import java.util.HashMap;
import java.util.Map;

public class InsnListBuilder implements
    MethodInstructions,
    VarInstructions,
    FieldInstructions,
    ConstantInstructions,
    JumpInstructions,
    GeneralInstructions,
    ArrayInstructions,
    TypeInstructions,
    StackInstructions,
    ArithmeticInstructions,
    ConvertInstructions,
    CompareInstructions
{

    private final InsnList list;
    private final Map<String, LabelNode> labels = new HashMap<>();

    public InsnListBuilder() {
        this(new InsnList());
    }

    public InsnListBuilder(InsnList list) {
        this.list = list;
    }

    @Override
    public InsnList l() {
        return list;
    }

    protected LabelNode L(String name) {
        return labels.computeIfAbsent(name, n -> new LabelNode());
    }

    protected void add(AbstractInsnNode insn) {
        l().add(insn);
    }

}
