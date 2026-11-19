package androidx.compose.foundation.layout;

import androidx.compose.p013ui.layout.AlignmentLine;
import androidx.compose.p013ui.layout.Placeable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10570l;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public abstract class AlignmentLineProvider {
    public static final int $stable = 0;

    @StabilityInferred(parameters = 1)
    public static final class Block extends AlignmentLineProvider {
        public static final int $stable = 0;
        private final InterfaceC10570l lineProviderBlock;

        public Block(InterfaceC10570l interfaceC10570l) {
            super(null);
            this.lineProviderBlock = interfaceC10570l;
        }

        public static /* synthetic */ Block copy$default(Block block, InterfaceC10570l interfaceC10570l, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                interfaceC10570l = block.lineProviderBlock;
            }
            return block.copy(interfaceC10570l);
        }

        @Override // androidx.compose.foundation.layout.AlignmentLineProvider
        public int calculateAlignmentLinePosition(Placeable placeable) {
            return ((Number) this.lineProviderBlock.invoke(placeable)).intValue();
        }

        public final InterfaceC10570l component1() {
            return this.lineProviderBlock;
        }

        public final Block copy(InterfaceC10570l interfaceC10570l) {
            return new Block(interfaceC10570l);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Block) && AbstractC9133u.m16128b(this.lineProviderBlock, ((Block) obj).lineProviderBlock);
        }

        public final InterfaceC10570l getLineProviderBlock() {
            return this.lineProviderBlock;
        }

        public int hashCode() {
            return this.lineProviderBlock.hashCode();
        }

        public String toString() {
            return "Block(lineProviderBlock=" + this.lineProviderBlock + ')';
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class Value extends AlignmentLineProvider {
        public static final int $stable = 0;
        private final AlignmentLine alignmentLine;

        public Value(AlignmentLine alignmentLine) {
            super(null);
            this.alignmentLine = alignmentLine;
        }

        public static /* synthetic */ Value copy$default(Value value, AlignmentLine alignmentLine, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                alignmentLine = value.alignmentLine;
            }
            return value.copy(alignmentLine);
        }

        @Override // androidx.compose.foundation.layout.AlignmentLineProvider
        public int calculateAlignmentLinePosition(Placeable placeable) {
            return placeable.get(this.alignmentLine);
        }

        public final AlignmentLine component1() {
            return this.alignmentLine;
        }

        public final Value copy(AlignmentLine alignmentLine) {
            return new Value(alignmentLine);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Value) && AbstractC9133u.m16128b(this.alignmentLine, ((Value) obj).alignmentLine);
        }

        public final AlignmentLine getAlignmentLine() {
            return this.alignmentLine;
        }

        public int hashCode() {
            return this.alignmentLine.hashCode();
        }

        public String toString() {
            return "Value(alignmentLine=" + this.alignmentLine + ')';
        }
    }

    public /* synthetic */ AlignmentLineProvider(AbstractC9126n abstractC9126n) {
        this();
    }

    public abstract int calculateAlignmentLinePosition(Placeable placeable);

    private AlignmentLineProvider() {
    }
}
