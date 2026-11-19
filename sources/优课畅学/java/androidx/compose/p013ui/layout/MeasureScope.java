package androidx.compose.p013ui.layout;

import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.p013ui.internal.InlineClassHelperKt;
import androidx.compose.p013ui.node.LookaheadCapablePlaceable;
import androidx.compose.p013ui.unit.DpRect;
import androidx.compose.runtime.Stable;
import java.util.Map;
import kotlin.collections.AbstractC9080a;
import p300x7.InterfaceC10570l;

@MeasureScopeMarker
/* loaded from: classes2.dex */
public interface MeasureScope extends IntrinsicMeasureScope {

    public static final class DefaultImpls {
        @Deprecated
        public static boolean isLookingAhead(MeasureScope measureScope) {
            return MeasureScope.super.isLookingAhead();
        }

        @Deprecated
        public static MeasureResult layout(MeasureScope measureScope, int i10, int i11, Map<AlignmentLine, Integer> map, InterfaceC10570l interfaceC10570l) {
            return MeasureScope.super.layout(i10, i11, map, interfaceC10570l);
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m25669roundToPxR2X_6o(MeasureScope measureScope, long j10) {
            return MeasureScope.super.mo20490roundToPxR2X_6o(j10);
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m25670roundToPx0680j_4(MeasureScope measureScope, float f10) {
            return MeasureScope.super.mo20491roundToPx0680j_4(f10);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m25671toDpGaN1DYA(MeasureScope measureScope, long j10) {
            return MeasureScope.super.mo20492toDpGaN1DYA(j10);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m25672toDpu2uoSUM(MeasureScope measureScope, float f10) {
            return MeasureScope.super.mo20493toDpu2uoSUM(f10);
        }

        @Stable
        @Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m25674toDpSizekrfVVM(MeasureScope measureScope, long j10) {
            return MeasureScope.super.mo20495toDpSizekrfVVM(j10);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m25675toPxR2X_6o(MeasureScope measureScope, long j10) {
            return MeasureScope.super.mo20496toPxR2X_6o(j10);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m25676toPx0680j_4(MeasureScope measureScope, float f10) {
            return MeasureScope.super.mo20497toPx0680j_4(f10);
        }

        @Stable
        @Deprecated
        public static Rect toRect(MeasureScope measureScope, DpRect dpRect) {
            return MeasureScope.super.toRect(dpRect);
        }

        @Stable
        @Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m25677toSizeXkaWNTQ(MeasureScope measureScope, long j10) {
            return MeasureScope.super.mo20498toSizeXkaWNTQ(j10);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m25678toSp0xMU5do(MeasureScope measureScope, float f10) {
            return MeasureScope.super.mo20499toSp0xMU5do(f10);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m25679toSpkPz2Gy4(MeasureScope measureScope, float f10) {
            return MeasureScope.super.mo20500toSpkPz2Gy4(f10);
        }

        @Deprecated
        public static MeasureResult layout(MeasureScope measureScope, int i10, int i11, Map<AlignmentLine, Integer> map, InterfaceC10570l interfaceC10570l, InterfaceC10570l interfaceC10570l2) {
            return MeasureScope.super.layout(i10, i11, map, interfaceC10570l, interfaceC10570l2);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m25673toDpu2uoSUM(MeasureScope measureScope, int i10) {
            return MeasureScope.super.mo20494toDpu2uoSUM(i10);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m25680toSpkPz2Gy4(MeasureScope measureScope, int i10) {
            return MeasureScope.super.mo20501toSpkPz2Gy4(i10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ MeasureResult layout$default(MeasureScope measureScope, int i10, int i11, Map map, InterfaceC10570l interfaceC10570l, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: layout");
        }
        if ((i12 & 4) != 0) {
            map = AbstractC9080a.m15943h();
        }
        return measureScope.layout(i10, i11, map, interfaceC10570l);
    }

    default MeasureResult layout(int i10, int i11, Map<AlignmentLine, Integer> map, InterfaceC10570l interfaceC10570l) {
        return layout(i10, i11, map, null, interfaceC10570l);
    }

    default MeasureResult layout(int i10, int i11, Map<AlignmentLine, Integer> map, InterfaceC10570l interfaceC10570l, InterfaceC10570l interfaceC10570l2) {
        if (!((i10 & (-16777216)) == 0 && ((-16777216) & i11) == 0)) {
            InlineClassHelperKt.throwIllegalStateException("Size(" + i10 + " x " + i11 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new MeasureResult(i10, i11, map, interfaceC10570l, this, interfaceC10570l2) { // from class: androidx.compose.ui.layout.MeasureScope.layout.1
            final /* synthetic */ InterfaceC10570l $placementBlock;
            final /* synthetic */ int $width;
            private final Map<AlignmentLine, Integer> alignmentLines;
            private final int height;
            private final InterfaceC10570l rulers;
            final /* synthetic */ MeasureScope this$0;
            private final int width;

            {
                this.$width = i10;
                this.this$0 = this;
                this.$placementBlock = interfaceC10570l2;
                this.width = i10;
                this.height = i11;
                this.alignmentLines = map;
                this.rulers = interfaceC10570l;
            }

            @Override // androidx.compose.p013ui.layout.MeasureResult
            public Map<AlignmentLine, Integer> getAlignmentLines() {
                return this.alignmentLines;
            }

            @Override // androidx.compose.p013ui.layout.MeasureResult
            public int getHeight() {
                return this.height;
            }

            @Override // androidx.compose.p013ui.layout.MeasureResult
            public InterfaceC10570l getRulers() {
                return this.rulers;
            }

            @Override // androidx.compose.p013ui.layout.MeasureResult
            public int getWidth() {
                return this.width;
            }

            @Override // androidx.compose.p013ui.layout.MeasureResult
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

    static /* synthetic */ MeasureResult layout$default(MeasureScope measureScope, int i10, int i11, Map map, InterfaceC10570l interfaceC10570l, InterfaceC10570l interfaceC10570l2, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: layout");
        }
        if ((i12 & 4) != 0) {
            map = AbstractC9080a.m15943h();
        }
        Map map2 = map;
        if ((i12 & 8) != 0) {
            interfaceC10570l = null;
        }
        return measureScope.layout(i10, i11, map2, interfaceC10570l, interfaceC10570l2);
    }
}
