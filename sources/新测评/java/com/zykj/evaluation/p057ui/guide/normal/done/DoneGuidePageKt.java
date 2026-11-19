package com.zykj.evaluation.p057ui.guide.normal.done;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.navigation.NavController;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator;
import com.zykj.evaluation.bean.bundle.DetailBundle;
import kotlin.Unit;
import p101g7.AbstractC7586b;

/* loaded from: classes4.dex */
public abstract class DoneGuidePageKt {
    /* JADX WARN: Removed duplicated region for block: B:109:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008a  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m9872c(final androidx.navigation.NavController r21, long r22, boolean r24, com.zykj.evaluation.p057ui.guide.normal.done.DoneGuideViewModel r25, androidx.compose.runtime.Composer r26, final int r27, final int r28) {
        /*
            Method dump skipped, instructions count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.p057ui.guide.normal.done.DoneGuidePageKt.m9872c(androidx.navigation.NavController, long, boolean, com.zykj.evaluation.ui.guide.normal.done.DoneGuideViewModel, androidx.compose.runtime.Composer, int, int):void"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/ui/guide/normal/done/DoneGuidePageKt.smali:29
    }

    /* renamed from: d */
    public static final Unit m9873d(DoneGuideViewModel doneGuideViewModel, NavController navController, long j10, boolean z9, long j11) {
        DetailBundle detailBundleM9858N = doneGuideViewModel.m9858N(j11);
        if (detailBundleM9858N != null) {
            AbstractC7586b.m12450a().putParcelable("KEY_DETAIL_BUNDLE", detailBundleM9858N);
            NavController.navigate$default(navController, "DETAIL_DONE/" + j10 + "/" + z9, (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        }
        return Unit.INSTANCE;
    }

    /* renamed from: e */
    public static final Unit m9874e(NavController navController, long j10, boolean z9, DoneGuideViewModel doneGuideViewModel, int i10, int i11, Composer composer, int i12) {
        m9872c(navController, j10, z9, doneGuideViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
        return Unit.INSTANCE;
    }
}
