package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.AlignmentLineProvider;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.layout.AlignmentLine;
import androidx.compose.p014ui.node.ParentDataModifierNode;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9972n;
import p181hd.InterfaceC9540l;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public abstract class SiblingsAlignedNode extends Modifier.Node implements ParentDataModifierNode {
    public static final int $stable = 0;

    @StabilityInferred(parameters = 0)
    public static final class WithAlignmentLineBlockNode extends SiblingsAlignedNode {
        public static final int $stable = 8;
        private InterfaceC9540l block;

        public WithAlignmentLineBlockNode(InterfaceC9540l interfaceC9540l) {
            super(null);
            this.block = interfaceC9540l;
        }

        public final InterfaceC9540l getBlock() {
            return this.block;
        }

        @Override // androidx.compose.foundation.layout.SiblingsAlignedNode, androidx.compose.p014ui.node.ParentDataModifierNode
        public Object modifyParentData(Density density, Object obj) {
            RowColumnParentData rowColumnParentData = obj instanceof RowColumnParentData ? (RowColumnParentData) obj : null;
            if (rowColumnParentData == null) {
                rowColumnParentData = new RowColumnParentData(0.0f, false, null, null, 15, null);
            }
            rowColumnParentData.setCrossAxisAlignment(CrossAxisAlignment.Companion.Relative$foundation_layout_release(new AlignmentLineProvider.Block(this.block)));
            return rowColumnParentData;
        }

        public final void setBlock(InterfaceC9540l interfaceC9540l) {
            this.block = interfaceC9540l;
        }
    }

    @StabilityInferred(parameters = 0)
    public static final class WithAlignmentLineNode extends SiblingsAlignedNode {
        public static final int $stable = 8;
        private AlignmentLine alignmentLine;

        public WithAlignmentLineNode(AlignmentLine alignmentLine) {
            super(null);
            this.alignmentLine = alignmentLine;
        }

        public final AlignmentLine getAlignmentLine() {
            return this.alignmentLine;
        }

        @Override // androidx.compose.foundation.layout.SiblingsAlignedNode, androidx.compose.p014ui.node.ParentDataModifierNode
        public Object modifyParentData(Density density, Object obj) {
            RowColumnParentData rowColumnParentData = obj instanceof RowColumnParentData ? (RowColumnParentData) obj : null;
            if (rowColumnParentData == null) {
                rowColumnParentData = new RowColumnParentData(0.0f, false, null, null, 15, null);
            }
            rowColumnParentData.setCrossAxisAlignment(CrossAxisAlignment.Companion.Relative$foundation_layout_release(new AlignmentLineProvider.Value(this.alignmentLine)));
            return rowColumnParentData;
        }

        public final void setAlignmentLine(AlignmentLine alignmentLine) {
            this.alignmentLine = alignmentLine;
        }
    }

    public /* synthetic */ SiblingsAlignedNode(AbstractC9972n abstractC9972n) {
        this();
    }

    @Override // androidx.compose.p014ui.node.ParentDataModifierNode
    public abstract Object modifyParentData(Density density, Object obj);

    private SiblingsAlignedNode() {
    }
}
