package androidx.compose.foundation.gestures;

import android.content.Context;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.p014ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.CompositionLocalAccessorScope;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import p181hd.InterfaceC9540l;

/* loaded from: classes.dex */
public final class BringIntoViewSpec_androidKt {
    private static final ProvidableCompositionLocal<BringIntoViewSpec> LocalBringIntoViewSpec = CompositionLocalKt.compositionLocalWithComputedDefaultOf(new InterfaceC9540l() { // from class: androidx.compose.foundation.gestures.BringIntoViewSpec_androidKt$LocalBringIntoViewSpec$1
        @Override // p181hd.InterfaceC9540l
        public final BringIntoViewSpec invoke(CompositionLocalAccessorScope compositionLocalAccessorScope) {
            return !((Context) compositionLocalAccessorScope.getCurrentValue(AndroidCompositionLocals_androidKt.getLocalContext())).getPackageManager().hasSystemFeature("android.software.leanback") ? BringIntoViewSpec.Companion.getDefaultBringIntoViewSpec$foundation_release() : BringIntoViewSpec_androidKt.getPivotBringIntoViewSpec();
        }
    });
    private static final BringIntoViewSpec PivotBringIntoViewSpec = new BringIntoViewSpec() { // from class: androidx.compose.foundation.gestures.BringIntoViewSpec_androidKt$PivotBringIntoViewSpec$1
        private final float childFraction;
        private final float parentFraction = 0.3f;

        @Override // androidx.compose.foundation.gestures.BringIntoViewSpec
        public float calculateScrollDistance(float f10, float f11, float f12) {
            float fAbs = Math.abs((f11 + f10) - f10);
            boolean z10 = fAbs <= f12;
            float f13 = (this.parentFraction * f12) - (this.childFraction * fAbs);
            float f14 = f12 - f13;
            if (z10 && f14 < fAbs) {
                f13 = f12 - fAbs;
            }
            return f10 - f13;
        }

        public final float getChildFraction() {
            return this.childFraction;
        }

        public final float getParentFraction() {
            return this.parentFraction;
        }
    };

    @ExperimentalFoundationApi
    public static final ProvidableCompositionLocal<BringIntoViewSpec> getLocalBringIntoViewSpec() {
        return LocalBringIntoViewSpec;
    }

    @ExperimentalFoundationApi
    public static /* synthetic */ void getLocalBringIntoViewSpec$annotations() {
    }

    public static final BringIntoViewSpec getPivotBringIntoViewSpec() {
        return PivotBringIntoViewSpec;
    }

    public static /* synthetic */ void getPivotBringIntoViewSpec$annotations() {
    }
}
