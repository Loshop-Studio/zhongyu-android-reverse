package p144k6;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.navigation.NavController;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator;
import com.zykj.evaluation.bean.bundle.DetailBundle;
import com.zykj.evaluation.p057ui.guide.normal.correcting.CorrectingGuideViewModel;
import kotlin.Unit;
import p101g7.AbstractC7586b;

/* renamed from: k6.c */
/* loaded from: classes4.dex */
public abstract class AbstractC7894c {
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
    public static final void m13513c(final androidx.navigation.NavController r20, long r21, com.zykj.evaluation.p057ui.guide.normal.correcting.CorrectingGuideViewModel r23, androidx.compose.runtime.Composer r24, final int r25, final int r26) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p144k6.AbstractC7894c.m13513c(androidx.navigation.NavController, long, com.zykj.evaluation.ui.guide.normal.correcting.CorrectingGuideViewModel, androidx.compose.runtime.Composer, int, int):void");
    }

    /* renamed from: d */
    public static final Unit m13514d(CorrectingGuideViewModel correctingGuideViewModel, NavController navController, long j10, long j11) {
        DetailBundle detailBundleM9858N = correctingGuideViewModel.m9858N(j11);
        if (detailBundleM9858N != null) {
            AbstractC7586b.m12450a().putParcelable("KEY_DETAIL_BUNDLE", detailBundleM9858N);
            NavController.navigate$default(navController, "DETAIL_CORRECTING/" + j10, (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        }
        return Unit.INSTANCE;
    }

    /* renamed from: e */
    public static final Unit m13515e(NavController navController, long j10, CorrectingGuideViewModel correctingGuideViewModel, int i10, int i11, Composer composer, int i12) {
        m13513c(navController, j10, correctingGuideViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
        return Unit.INSTANCE;
    }
}
