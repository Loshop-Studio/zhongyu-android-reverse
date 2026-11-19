package androidx.compose.foundation;

import android.view.View;
import android.widget.Magnifier;
import androidx.annotation.RequiresApi;
import androidx.compose.foundation.PlatformMagnifierFactoryApi28Impl;
import androidx.compose.p013ui.geometry.InlineClassHelperKt;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.runtime.internal.StabilityInferred;
import p322z7.AbstractC10729c;

@StabilityInferred(parameters = 1)
@RequiresApi(29)
/* loaded from: classes.dex */
public final class PlatformMagnifierFactoryApi29Impl implements PlatformMagnifierFactory {
    public static final int $stable = 0;
    public static final PlatformMagnifierFactoryApi29Impl INSTANCE = new PlatformMagnifierFactoryApi29Impl();
    private static final boolean canUpdateZoom = true;

    @StabilityInferred(parameters = 1)
    @RequiresApi(29)
    public static final class PlatformMagnifierImpl extends PlatformMagnifierFactoryApi28Impl.PlatformMagnifierImpl {
        public static final int $stable = 0;

        public PlatformMagnifierImpl(Magnifier magnifier) {
            super(magnifier);
        }

        @Override // androidx.compose.foundation.PlatformMagnifierFactoryApi28Impl.PlatformMagnifierImpl, androidx.compose.foundation.PlatformMagnifier
        /* renamed from: update-Wko1d7g */
        public void mo20443updateWko1d7g(long j10, long j11, float f10) {
            if (!Float.isNaN(f10)) {
                getMagnifier().setZoom(f10);
            }
            if ((9223372034707292159L & j11) != InlineClassHelperKt.UnspecifiedPackedFloats) {
                getMagnifier().show(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)), Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j11 & 4294967295L)));
            } else {
                getMagnifier().show(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)));
            }
        }
    }

    private PlatformMagnifierFactoryApi29Impl() {
    }

    @Override // androidx.compose.foundation.PlatformMagnifierFactory
    public boolean getCanUpdateZoom() {
        return canUpdateZoom;
    }

    @Override // androidx.compose.foundation.PlatformMagnifierFactory
    /* renamed from: create-nHHXs2Y */
    public PlatformMagnifierImpl mo20444createnHHXs2Y(View view, boolean z10, long j10, float f10, float f11, boolean z11, Density density, float f12) {
        if (z10) {
            return new PlatformMagnifierImpl(new Magnifier(view));
        }
        long jMo20498toSizeXkaWNTQ = density.mo20498toSizeXkaWNTQ(j10);
        float fMo20497toPx0680j_4 = density.mo20497toPx0680j_4(f10);
        float fMo20497toPx0680j_42 = density.mo20497toPx0680j_4(f11);
        Magnifier.Builder builder = new Magnifier.Builder(view);
        if (jMo20498toSizeXkaWNTQ != InlineClassHelperKt.UnspecifiedPackedFloats) {
            builder.setSize(AbstractC10729c.m20035d(Float.intBitsToFloat((int) (jMo20498toSizeXkaWNTQ >> 32))), AbstractC10729c.m20035d(Float.intBitsToFloat((int) (jMo20498toSizeXkaWNTQ & 4294967295L))));
        }
        if (!Float.isNaN(fMo20497toPx0680j_4)) {
            builder.setCornerRadius(fMo20497toPx0680j_4);
        }
        if (!Float.isNaN(fMo20497toPx0680j_42)) {
            builder.setElevation(fMo20497toPx0680j_42);
        }
        if (!Float.isNaN(f12)) {
            builder.setInitialZoom(f12);
        }
        builder.setClippingEnabled(z11);
        return new PlatformMagnifierImpl(builder.build());
    }
}
