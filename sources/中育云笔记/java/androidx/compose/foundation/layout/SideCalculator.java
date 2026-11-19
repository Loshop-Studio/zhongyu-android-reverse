package androidx.compose.foundation.layout;

import android.graphics.Insets;
import androidx.annotation.RequiresApi;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.unit.LayoutDirection;
import androidx.compose.p014ui.unit.Velocity;
import androidx.compose.p014ui.unit.VelocityKt;
import p265nd.AbstractC10410o;

@RequiresApi(30)
/* loaded from: classes.dex */
interface SideCalculator {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final SideCalculator$Companion$LeftSideCalculator$1 LeftSideCalculator = new SideCalculator() { // from class: androidx.compose.foundation.layout.SideCalculator$Companion$LeftSideCalculator$1
            @Override // androidx.compose.foundation.layout.SideCalculator
            public Insets adjustInsets(Insets insets, int i10) {
                return Insets.of(i10, insets.top, insets.right, insets.bottom);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* renamed from: consumedOffsets-MK-Hz9U */
            public long mo27486consumedOffsetsMKHz9U(long j10) {
                return Offset.m30629constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (j10 >> 32))) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L));
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* renamed from: consumedVelocity-QWom1Mo */
            public long mo27487consumedVelocityQWom1Mo(long j10, float f10) {
                return VelocityKt.Velocity(Velocity.m33739getXimpl(j10) - f10, 0.0f);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public float motionOf(float f10, float f11) {
                return f10;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public int valueOf(Insets insets) {
                return insets.left;
            }
        };
        private static final SideCalculator$Companion$TopSideCalculator$1 TopSideCalculator = new SideCalculator() { // from class: androidx.compose.foundation.layout.SideCalculator$Companion$TopSideCalculator$1
            @Override // androidx.compose.foundation.layout.SideCalculator
            public Insets adjustInsets(Insets insets, int i10) {
                return Insets.of(insets.left, i10, insets.right, insets.bottom);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* renamed from: consumedOffsets-MK-Hz9U */
            public long mo27486consumedOffsetsMKHz9U(long j10) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 & 4294967295L));
                return Offset.m30629constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32));
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* renamed from: consumedVelocity-QWom1Mo */
            public long mo27487consumedVelocityQWom1Mo(long j10, float f10) {
                return VelocityKt.Velocity(0.0f, Velocity.m33740getYimpl(j10) - f10);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public float motionOf(float f10, float f11) {
                return f11;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public int valueOf(Insets insets) {
                return insets.top;
            }
        };
        private static final SideCalculator$Companion$RightSideCalculator$1 RightSideCalculator = new SideCalculator() { // from class: androidx.compose.foundation.layout.SideCalculator$Companion$RightSideCalculator$1
            @Override // androidx.compose.foundation.layout.SideCalculator
            public Insets adjustInsets(Insets insets, int i10) {
                return Insets.of(insets.left, insets.top, i10, insets.bottom);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* renamed from: consumedOffsets-MK-Hz9U */
            public long mo27486consumedOffsetsMKHz9U(long j10) {
                return Offset.m30629constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (j10 >> 32))) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L));
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* renamed from: consumedVelocity-QWom1Mo */
            public long mo27487consumedVelocityQWom1Mo(long j10, float f10) {
                return VelocityKt.Velocity(Velocity.m33739getXimpl(j10) + f10, 0.0f);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public float motionOf(float f10, float f11) {
                return -f10;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public int valueOf(Insets insets) {
                return insets.right;
            }
        };
        private static final SideCalculator$Companion$BottomSideCalculator$1 BottomSideCalculator = new SideCalculator() { // from class: androidx.compose.foundation.layout.SideCalculator$Companion$BottomSideCalculator$1
            @Override // androidx.compose.foundation.layout.SideCalculator
            public Insets adjustInsets(Insets insets, int i10) {
                return Insets.of(insets.left, insets.top, insets.right, i10);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* renamed from: consumedOffsets-MK-Hz9U */
            public long mo27486consumedOffsetsMKHz9U(long j10) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 & 4294967295L));
                return Offset.m30629constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32));
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* renamed from: consumedVelocity-QWom1Mo */
            public long mo27487consumedVelocityQWom1Mo(long j10, float f10) {
                return VelocityKt.Velocity(0.0f, Velocity.m33740getYimpl(j10) + f10);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public float motionOf(float f10, float f11) {
                return -f11;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public int valueOf(Insets insets) {
                return insets.bottom;
            }
        };

        private Companion() {
        }

        /* renamed from: chooseCalculator-ni1skBw, reason: not valid java name */
        public final SideCalculator m27488chooseCalculatorni1skBw(int i10, LayoutDirection layoutDirection) {
            WindowInsetsSides.Companion companion = WindowInsetsSides.Companion;
            if (WindowInsetsSides.m27540equalsimpl0(i10, companion.m27554getLeftJoeWqyM())) {
                return LeftSideCalculator;
            }
            if (WindowInsetsSides.m27540equalsimpl0(i10, companion.m27557getTopJoeWqyM())) {
                return TopSideCalculator;
            }
            if (WindowInsetsSides.m27540equalsimpl0(i10, companion.m27555getRightJoeWqyM())) {
                return RightSideCalculator;
            }
            if (WindowInsetsSides.m27540equalsimpl0(i10, companion.m27551getBottomJoeWqyM())) {
                return BottomSideCalculator;
            }
            if (WindowInsetsSides.m27540equalsimpl0(i10, companion.m27556getStartJoeWqyM())) {
                return layoutDirection == LayoutDirection.Ltr ? LeftSideCalculator : RightSideCalculator;
            }
            if (WindowInsetsSides.m27540equalsimpl0(i10, companion.m27552getEndJoeWqyM())) {
                return layoutDirection == LayoutDirection.Ltr ? RightSideCalculator : LeftSideCalculator;
            }
            throw new IllegalStateException("Only Left, Top, Right, Bottom, Start and End are allowed");
        }
    }

    Insets adjustInsets(Insets insets, int i10);

    /* renamed from: consumedOffsets-MK-Hz9U, reason: not valid java name */
    long mo27486consumedOffsetsMKHz9U(long j10);

    /* renamed from: consumedVelocity-QWom1Mo, reason: not valid java name */
    long mo27487consumedVelocityQWom1Mo(long j10, float f10);

    default float hideMotion(float f10, float f11) {
        return AbstractC10410o.m21755h(motionOf(f10, f11), 0.0f);
    }

    float motionOf(float f10, float f11);

    default float showMotion(float f10, float f11) {
        return AbstractC10410o.m21751d(motionOf(f10, f11), 0.0f);
    }

    int valueOf(Insets insets);
}
