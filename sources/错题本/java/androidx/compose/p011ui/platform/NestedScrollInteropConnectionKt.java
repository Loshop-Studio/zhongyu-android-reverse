package androidx.compose.p011ui.platform;

import android.view.View;
import androidx.compose.p011ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.p011ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u00002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0001H\u0000\u001a\u0017\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007¢\u0006\u0002\u0010\r\u001a\"\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0004H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\f\u0010\u0014\u001a\u00020\u0001*\u00020\u0001H\u0002\u001a\f\u0010\u0015\u001a\u00020\u0001*\u00020\u0003H\u0002\u001a\u0016\u0010\u0016\u001a\u00020\u0003*\u00020\u0017H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\f\u0010\u001a\u001a\u00020\u0001*\u00020\u0001H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0018\u0010\u0002\u001a\u00020\u0003*\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, m5110d2 = {"ScrollingAxesThreshold", "", "scrollAxes", "", "Landroidx/compose/ui/geometry/Offset;", "getScrollAxes-k-4lQ0M", "(J)I", "composeToViewOffset", TypedValues.CycleType.S_WAVE_OFFSET, "rememberNestedScrollInteropConnection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "hostView", "Landroid/view/View;", "(Landroid/view/View;Landroidx/compose/runtime/Composer;II)Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "toOffset", "consumed", "", "available", "toOffset-Uv8p0NA", "([IJ)J", "ceilAwayFromZero", "reverseAxis", "toViewType", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "toViewType-GyEprt8", "(I)I", "toViewVelocity", "ui_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@JvmName(name = "NestedScrollInteropConnectionKt")
@SourceDebugExtension({"SMAP\nNestedScrollInteropConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestedScrollInteropConnection.android.kt\nandroidx/compose/ui/platform/NestedScrollInteropConnectionKt\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,233:1\n65#2:234\n65#2:237\n65#2:240\n69#2:243\n69#2:246\n69#2:249\n65#2:256\n69#2:259\n60#3:235\n60#3:238\n60#3:241\n70#3:244\n70#3:247\n70#3:250\n53#3,3:253\n60#3:257\n70#3:260\n22#4:236\n22#4:239\n22#4:242\n22#4:245\n22#4:248\n22#4:251\n22#4:258\n22#4:261\n30#5:252\n75#6:262\n1247#7,6:263\n*S KotlinDebug\n*F\n+ 1 NestedScrollInteropConnection.android.kt\nandroidx/compose/ui/platform/NestedScrollInteropConnectionKt\n*L\n171#1:234\n172#1:237\n174#1:240\n178#1:243\n179#1:246\n181#1:249\n203#1:256\n206#1:259\n171#1:235\n172#1:238\n174#1:241\n178#1:244\n179#1:247\n181#1:250\n184#1:253,3\n203#1:257\n206#1:260\n171#1:236\n172#1:239\n174#1:242\n178#1:245\n179#1:248\n181#1:251\n203#1:258\n206#1:261\n184#1:252\n231#1:262\n232#1:263,6\n*E\n"})
/* loaded from: classes2.dex */
public final class NestedScrollInteropConnectionKt {
    private static final float ScrollingAxesThreshold = 0.5f;

    private static final float ceilAwayFromZero(float f) {
        return (float) (f >= 0.0f ? Math.ceil(f) : Math.floor(f));
    }

    public static final int composeToViewOffset(float f) {
        return ((int) ceilAwayFromZero(f)) * (-1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getScrollAxes-k-4lQ0M, reason: not valid java name */
    public static final int m12497getScrollAxesk4lQ0M(long j7) {
        int i = Math.abs(Float.intBitsToFloat((int) (j7 >> 32))) >= 0.5f ? 1 : 0;
        return Math.abs(Float.intBitsToFloat((int) (j7 & 4294967295L))) >= 0.5f ? i | 2 : i;
    }

    @Composable
    @NotNull
    public static final NestedScrollConnection rememberNestedScrollInteropConnection(@Nullable View view, @Nullable Composer composer, int i, int i8) {
        if ((i8 & 1) != 0) {
            view = (View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView());
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1075877987, i, -1, "androidx.compose.ui.platform.rememberNestedScrollInteropConnection (NestedScrollInteropConnection.android.kt:231)");
        }
        boolean zChanged = composer.changed(view);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new NestedScrollInteropConnection(view);
            composer.updateRememberedValue(objRememberedValue);
        }
        NestedScrollInteropConnection nestedScrollInteropConnection = (NestedScrollInteropConnection) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return nestedScrollInteropConnection;
    }

    private static final float reverseAxis(int i) {
        return i * (-1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004c A[PHI: r7
      0x004c: PHI (r7v6 float) = (r7v3 float), (r7v7 float) binds: [B:16:0x005a, B:13:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001d A[PHI: r1
      0x001d: PHI (r1v5 float) = (r1v2 float), (r1v6 float) binds: [B:8:0x002b, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: toOffset-Uv8p0NA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long m12498toOffsetUv8p0NA(int[] r6, long r7) {
        /*
            r0 = 32
            long r1 = r7 >> r0
            int r1 = (int) r1
            float r2 = java.lang.Float.intBitsToFloat(r1)
            r3 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            r4 = 0
            if (r2 < 0) goto L1f
            r2 = r6[r4]
            float r2 = reverseAxis(r2)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 <= 0) goto L2e
        L1d:
            r2 = r1
            goto L2e
        L1f:
            r2 = r6[r4]
            float r2 = reverseAxis(r2)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 >= 0) goto L2e
            goto L1d
        L2e:
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r7 = r7 & r4
            int r7 = (int) r7
            float r8 = java.lang.Float.intBitsToFloat(r7)
            int r8 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            r1 = 1
            if (r8 < 0) goto L4e
            r6 = r6[r1]
            float r6 = reverseAxis(r6)
            float r7 = java.lang.Float.intBitsToFloat(r7)
            int r8 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r8 <= 0) goto L5d
        L4c:
            r6 = r7
            goto L5d
        L4e:
            r6 = r6[r1]
            float r6 = reverseAxis(r6)
            float r7 = java.lang.Float.intBitsToFloat(r7)
            int r8 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r8 >= 0) goto L5d
            goto L4c
        L5d:
            int r7 = java.lang.Float.floatToRawIntBits(r2)
            long r7 = (long) r7
            int r6 = java.lang.Float.floatToRawIntBits(r6)
            long r1 = (long) r6
            long r6 = r7 << r0
            long r0 = r1 & r4
            long r6 = r6 | r0
            long r6 = androidx.compose.p011ui.geometry.Offset.m10433constructorimpl(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p011ui.platform.NestedScrollInteropConnectionKt.m12498toOffsetUv8p0NA(int[], long):long");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toViewType-GyEprt8, reason: not valid java name */
    public static final int m12499toViewTypeGyEprt8(int i) {
        return !NestedScrollSource.m11788equalsimpl0(i, NestedScrollSource.INSTANCE.m11800getUserInputWNlRxjI()) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float toViewVelocity(float f) {
        return f * (-1.0f);
    }
}
