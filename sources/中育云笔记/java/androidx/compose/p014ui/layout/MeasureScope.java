package androidx.compose.p014ui.layout;

import androidx.compose.p014ui.geometry.Rect;
import androidx.compose.p014ui.internal.InlineClassHelperKt;
import androidx.compose.p014ui.node.LookaheadCapablePlaceable;
import androidx.compose.p014ui.unit.DpRect;
import androidx.compose.runtime.Stable;
import androidx.core.view.ViewCompat;
import java.util.Map;
import kotlin.collections.AbstractC9925a;
import p181hd.InterfaceC9540l;

@MeasureScopeMarker
/* loaded from: classes2.dex */
public interface MeasureScope extends IntrinsicMeasureScope {

    public static final class DefaultImpls {
        @Deprecated
        public static boolean isLookingAhead(MeasureScope measureScope) {
            return MeasureScope.super.isLookingAhead();
        }

        @Deprecated
        public static MeasureResult layout(MeasureScope measureScope, int i10, int i11, Map<AlignmentLine, Integer> map, InterfaceC9540l interfaceC9540l) {
            return MeasureScope.super.layout(i10, i11, map, interfaceC9540l);
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m32271roundToPxR2X_6o(MeasureScope measureScope, long j10) {
            return MeasureScope.super.mo27092roundToPxR2X_6o(j10);
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m32272roundToPx0680j_4(MeasureScope measureScope, float f10) {
            return MeasureScope.super.mo27093roundToPx0680j_4(f10);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m32273toDpGaN1DYA(MeasureScope measureScope, long j10) {
            return MeasureScope.super.mo27094toDpGaN1DYA(j10);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m32274toDpu2uoSUM(MeasureScope measureScope, float f10) {
            return MeasureScope.super.mo27095toDpu2uoSUM(f10);
        }

        @Stable
        @Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m32276toDpSizekrfVVM(MeasureScope measureScope, long j10) {
            return MeasureScope.super.mo27097toDpSizekrfVVM(j10);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m32277toPxR2X_6o(MeasureScope measureScope, long j10) {
            return MeasureScope.super.mo27098toPxR2X_6o(j10);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m32278toPx0680j_4(MeasureScope measureScope, float f10) {
            return MeasureScope.super.mo27099toPx0680j_4(f10);
        }

        @Stable
        @Deprecated
        public static Rect toRect(MeasureScope measureScope, DpRect dpRect) {
            return MeasureScope.super.toRect(dpRect);
        }

        @Stable
        @Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m32279toSizeXkaWNTQ(MeasureScope measureScope, long j10) {
            return MeasureScope.super.mo27100toSizeXkaWNTQ(j10);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m32280toSp0xMU5do(MeasureScope measureScope, float f10) {
            return MeasureScope.super.mo27101toSp0xMU5do(f10);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m32281toSpkPz2Gy4(MeasureScope measureScope, float f10) {
            return MeasureScope.super.mo27102toSpkPz2Gy4(f10);
        }

        @Deprecated
        public static MeasureResult layout(MeasureScope measureScope, int i10, int i11, Map<AlignmentLine, Integer> map, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2) {
            return MeasureScope.super.layout(i10, i11, map, interfaceC9540l, interfaceC9540l2);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m32275toDpu2uoSUM(MeasureScope measureScope, int i10) {
            return MeasureScope.super.mo27096toDpu2uoSUM(i10);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m32282toSpkPz2Gy4(MeasureScope measureScope, int i10) {
            return MeasureScope.super.mo27103toSpkPz2Gy4(i10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ MeasureResult layout$default(MeasureScope measureScope, int i10, int i11, Map map, InterfaceC9540l interfaceC9540l, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: layout");
        }
        if ((i12 & 4) != 0) {
            map = AbstractC9925a.m20088h();
        }
        return measureScope.layout(i10, i11, map, interfaceC9540l);
    }

    default MeasureResult layout(int i10, int i11, Map<AlignmentLine, Integer> map, InterfaceC9540l interfaceC9540l) {
        return layout(i10, i11, map, null, interfaceC9540l);
    }

    default MeasureResult layout(int i10, int i11, Map<AlignmentLine, Integer> map, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2) {
        if (!((i10 & ViewCompat.MEASURED_STATE_MASK) == 0 && ((-16777216) & i11) == 0)) {
            InlineClassHelperKt.throwIllegalStateException("Size(" + i10 + " x " + i11 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new MeasureResult(i10, i11, map, interfaceC9540l, this, interfaceC9540l2) { // from class: androidx.compose.ui.layout.MeasureScope.layout.1
            final /* synthetic */ InterfaceC9540l $placementBlock;
            final /* synthetic */ int $width;
            private final Map<AlignmentLine, Integer> alignmentLines;
            private final int height;
            private final InterfaceC9540l rulers;
            final /* synthetic */ MeasureScope this$0;
            private final int width;

            {
                this.$width = i10;
                this.this$0 = this;
                this.$placementBlock = interfaceC9540l2;
                this.width = i10;
                this.height = i11;
                this.alignmentLines = map;
                this.rulers = interfaceC9540l;
            }

            @Override // androidx.compose.p014ui.layout.MeasureResult
            public Map<AlignmentLine, Integer> getAlignmentLines() {
                return this.alignmentLines;
            }

            @Override // androidx.compose.p014ui.layout.MeasureResult
            public int getHeight() {
                return this.height;
            }

            @Override // androidx.compose.p014ui.layout.MeasureResult
            public InterfaceC9540l getRulers() {
                return this.rulers;
            }

            @Override // androidx.compose.p014ui.layout.MeasureResult
            public int getWidth() {
                return this.width;
            }

            @Override // androidx.compose.p014ui.layout.MeasureResult
            public void placeChildren() {
                MeasureScope measureScope = this.this$0;
                if (measureScope instanceof LookaheadCapablePlaceable) {
                    this.$placementBlock.invoke(((LookaheadCapablePlaceable) measureScope).getPlacementScope());
                } else {
                    this.$placementBlock.invoke(new SimplePlacementScope(this.$width, this.this$0.getLayoutDirection()));
                }
            }
        };
    }

    static /* synthetic */ MeasureResult layout$default(MeasureScope measureScope, int i10, int i11, Map map, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: layout");
        }
        if ((i12 & 4) != 0) {
            map = AbstractC9925a.m20088h();
        }
        Map map2 = map;
        if ((i12 & 8) != 0) {
            interfaceC9540l = null;
        }
        return measureScope.layout(i10, i11, map2, interfaceC9540l, interfaceC9540l2);
    }
}
