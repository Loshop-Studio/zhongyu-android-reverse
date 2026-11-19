package androidx.compose.p014ui.platform;

import android.view.View;
import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.p014ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import p265nd.AbstractC10410o;

/* loaded from: classes2.dex */
public final class NestedScrollInteropConnectionKt {
    private static final float ScrollingAxesThreshold = 0.5f;

    private static final float ceilAwayFromZero(float f10) {
        return (float) (f10 >= 0.0f ? Math.ceil(f10) : Math.floor(f10));
    }

    public static final int composeToViewOffset(float f10) {
        return ((int) ceilAwayFromZero(f10)) * (-1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getScrollAxes-k-4lQ0M, reason: not valid java name */
    public static final int m32693getScrollAxesk4lQ0M(long j10) {
        int i10 = Math.abs(Float.intBitsToFloat((int) (j10 >> 32))) >= 0.5f ? 1 : 0;
        return Math.abs(Float.intBitsToFloat((int) (j10 & 4294967295L))) >= 0.5f ? i10 | 2 : i10;
    }

    @Composable
    public static final NestedScrollConnection rememberNestedScrollInteropConnection(View view, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            view = (View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView());
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1075877987, i10, -1, "androidx.compose.ui.platform.rememberNestedScrollInteropConnection (NestedScrollInteropConnection.android.kt:231)");
        }
        boolean zChanged = composer.changed(view);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new NestedScrollInteropConnection(view);
            composer.updateRememberedValue(objRememberedValue);
        }
        NestedScrollInteropConnection nestedScrollInteropConnection = (NestedScrollInteropConnection) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return nestedScrollInteropConnection;
    }

    private static final float reverseAxis(int i10) {
        return i10 * (-1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toOffset-Uv8p0NA, reason: not valid java name */
    public static final long m32694toOffsetUv8p0NA(int[] iArr, long j10) {
        return Offset.m30629constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (j10 >> 32)) >= 0.0f ? AbstractC10410o.m21755h(reverseAxis(iArr[0]), Float.intBitsToFloat(r1)) : AbstractC10410o.m21751d(reverseAxis(iArr[0]), Float.intBitsToFloat(r1))) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j10 & 4294967295L)) >= 0.0f ? AbstractC10410o.m21755h(reverseAxis(iArr[1]), Float.intBitsToFloat(r7)) : AbstractC10410o.m21751d(reverseAxis(iArr[1]), Float.intBitsToFloat(r7))) & 4294967295L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toViewType-GyEprt8, reason: not valid java name */
    public static final int m32695toViewTypeGyEprt8(int i10) {
        return !NestedScrollSource.m31984equalsimpl0(i10, NestedScrollSource.Companion.m31996getUserInputWNlRxjI()) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float toViewVelocity(float f10) {
        return f10 * (-1.0f);
    }
}
