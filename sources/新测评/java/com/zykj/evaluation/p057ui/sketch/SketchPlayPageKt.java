package com.zykj.evaluation.p057ui.sketch;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.navigation.NavController;
import com.zykj.evaluation.p057ui.sketch.SketchPlayPageKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p037c7.AbstractC5157r;
import p037c7.C5142c;
import p037c7.C5150k;

/* loaded from: classes4.dex */
public abstract class SketchPlayPageKt {
    /* JADX WARN: Removed duplicated region for block: B:103:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x019e  */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9, types: [boolean, int] */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m10405h(final long r20, final long r22, final java.lang.String r24, final androidx.navigation.NavController r25, com.zykj.evaluation.p057ui.sketch.SketchPlayViewModel r26, androidx.compose.runtime.Composer r27, final int r28, final int r29) {
        /*
            Method dump skipped, instructions count: 528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.p057ui.sketch.SketchPlayPageKt.m10405h(long, long, java.lang.String, androidx.navigation.NavController, com.zykj.evaluation.ui.sketch.SketchPlayViewModel, androidx.compose.runtime.Composer, int, int):void"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/ui/sketch/SketchPlayPageKt.smali:84
    }

    /* renamed from: i */
    public static final Unit m10406i(long j10, long j11, String str, NavController navController, SketchPlayViewModel sketchPlayViewModel, int i10, int i11, Composer composer, int i12) {
        m10405h(j10, j11, str, navController, sketchPlayViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
        return Unit.INSTANCE;
    }

    /* renamed from: j */
    public static final Unit m10407j(SketchPlayViewModel sketchPlayViewModel, final NavController navController, float f10) {
        sketchPlayViewModel.m10424w(Float.valueOf(f10), new Function0() { // from class: c7.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SketchPlayPageKt.m10408k(navController);
            }
        });
        return Unit.INSTANCE;
    }

    /* renamed from: k */
    public static final Unit m10408k(NavController navController) {
        navController.navigateUp();
        return Unit.INSTANCE;
    }

    /* renamed from: l */
    public static final Unit m10409l(SketchPlayViewModel sketchPlayViewModel, C5142c c5142c, final NavController navController) {
        sketchPlayViewModel.m10424w((Float) c5142c.m2794f().invoke(), new Function0() { // from class: c7.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SketchPlayPageKt.m10410m(navController);
            }
        });
        return Unit.INSTANCE;
    }

    /* renamed from: m */
    public static final Unit m10410m(NavController navController) {
        navController.navigateUp();
        return Unit.INSTANCE;
    }

    /* renamed from: n */
    public static final Unit m10411n(SketchPlayViewModel sketchPlayViewModel) {
        sketchPlayViewModel.m8646c();
        return Unit.INSTANCE;
    }

    /* renamed from: o */
    public static final Unit m10412o(C5150k c5150k, C5142c c5142c, BoxScope BoxWithLoadState, Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(BoxWithLoadState, "$this$BoxWithLoadState");
        if (composer.shouldExecute((i10 & 17) != 16, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1501755366, i10, -1, "com.zykj.evaluation.ui.sketch.SketchPlayPage.<anonymous> (SketchPlayPage.kt:58)");
            }
            AbstractC5157r.m2804g(null, c5150k.m2797b(), c5142c, composer, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }
}
