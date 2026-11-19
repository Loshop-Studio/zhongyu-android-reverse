package androidx.compose.foundation.layout;

import androidx.compose.p014ui.layout.AlignmentLine;
import androidx.compose.p014ui.layout.Placeable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public abstract class AlignmentLineProvider {
    public static final int $stable = 0;

    @StabilityInferred(parameters = 1)
    public static final class Block extends AlignmentLineProvider {
        public static final int $stable = 0;
        private final InterfaceC9540l lineProviderBlock;

        public Block(InterfaceC9540l interfaceC9540l) {
            super(null);
            this.lineProviderBlock = interfaceC9540l;
        }

        public static /* synthetic */ Block copy$default(Block block, InterfaceC9540l interfaceC9540l, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                interfaceC9540l = block.lineProviderBlock;
            }
            return block.copy(interfaceC9540l);
        }

        @Override // androidx.compose.foundation.layout.AlignmentLineProvider
        public int calculateAlignmentLinePosition(Placeable placeable) {
            return ((Number) this.lineProviderBlock.invoke(placeable)).intValue();
        }

        public final InterfaceC9540l component1() {
            return this.lineProviderBlock;
        }

        public final Block copy(InterfaceC9540l interfaceC9540l) {
            return new Block(interfaceC9540l);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Block) && AbstractC9979u.m20289b(this.lineProviderBlock, ((Block) obj).lineProviderBlock);
        }

        public final InterfaceC9540l getLineProviderBlock() {
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
            return (obj instanceof Value) && AbstractC9979u.m20289b(this.alignmentLine, ((Value) obj).alignmentLine);
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

    public /* synthetic */ AlignmentLineProvider(AbstractC9972n abstractC9972n) {
        this();
    }

    public abstract int calculateAlignmentLinePosition(Placeable placeable);

    private AlignmentLineProvider() {
    }
}
