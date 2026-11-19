package p168m6;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.navigation.NavController;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator;
import com.zykj.evaluation.bean.bundle.DetailBundle;
import com.zykj.evaluation.p057ui.guide.normal.revising.RevisingGuideViewModel;
import kotlin.Unit;
import p101g7.AbstractC7586b;

/* renamed from: m6.c */
/* loaded from: classes4.dex */
public abstract class AbstractC8562c {
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m14104c(final androidx.navigation.NavController r20, long r21, com.zykj.evaluation.p057ui.guide.normal.revising.RevisingGuideViewModel r23, androidx.compose.runtime.Composer r24, final int r25, final int r26) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p168m6.AbstractC8562c.m14104c(androidx.navigation.NavController, long, com.zykj.evaluation.ui.guide.normal.revising.RevisingGuideViewModel, androidx.compose.runtime.Composer, int, int):void");
    }

    /* renamed from: d */
    public static final Unit m14105d(RevisingGuideViewModel revisingGuideViewModel, NavController navController, long j10, long j11) {
        DetailBundle detailBundleM9858N = revisingGuideViewModel.m9858N(j11);
        if (detailBundleM9858N != null) {
            AbstractC7586b.m12450a().putParcelable("KEY_DETAIL_BUNDLE", detailBundleM9858N);
            NavController.navigate$default(navController, "DETAIL_REVISING/" + j10, (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        }
        return Unit.INSTANCE;
    }

    /* renamed from: e */
    public static final Unit m14106e(NavController navController, long j10, RevisingGuideViewModel revisingGuideViewModel, int i10, int i11, Composer composer, int i12) {
        m14104c(navController, j10, revisingGuideViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
        return Unit.INSTANCE;
    }
}
