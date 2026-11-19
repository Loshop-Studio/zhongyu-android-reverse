package p079e7;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.unit.C3127Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.ranges.RangesKt;

/* renamed from: e7.h */
/* loaded from: classes4.dex */
public abstract class AbstractC7384h {
    /* JADX WARN: Removed duplicated region for block: B:23:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m11841d(final boolean r23, androidx.compose.p013ui.Modifier r24, final kotlin.jvm.functions.Function0 r25, final kotlin.jvm.functions.Function3 r26, androidx.compose.runtime.Composer r27, final int r28, final int r29) {
        /*
            Method dump skipped, instructions count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p079e7.AbstractC7384h.m11841d(boolean, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* renamed from: e */
    public static final Unit m11842e(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* renamed from: f */
    public static final Unit m11843f(boolean z9, Modifier modifier, Function0 function0, Function3 function3, int i10, int i11, Composer composer, int i12) {
        m11841d(z9, modifier, function0, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
        return Unit.INSTANCE;
    }

    /* renamed from: g */
    public static final void m11844g(Modifier modifier, Composer composer, final int i10, final int i11) {
        Modifier modifier2;
        int i12;
        final Modifier modifier3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1515502683);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
            modifier2 = modifier;
        } else if ((i10 & 6) == 0) {
            modifier2 = modifier;
            i12 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i10;
        } else {
            modifier2 = modifier;
            i12 = i10;
        }
        if (composerStartRestartGroup.shouldExecute((i12 & 3) != 2, i12 & 1)) {
            Modifier modifier4 = i13 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1515502683, i12, -1, "com.zykj.evaluation.ui.widget.LoadingView (BoxWithLoadState.kt:48)");
            }
            RoundedCornerShape circleShape = RoundedCornerShapeKt.getCircleShape();
            long jM21013getWhite0d7_KjU = Color.INSTANCE.m21013getWhite0d7_KjU();
            float f10 = 600;
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            float fM23561constructorimpl = C3127Dp.m23561constructorimpl((2 / f10) * (RangesKt.coerceAtLeast(displayMetrics.widthPixels, displayMetrics.heightPixels) / Resources.getSystem().getDisplayMetrics().density));
            DisplayMetrics displayMetrics2 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM17728size3ABfNKs = SizeKt.m17728size3ABfNKs(modifier4, C3127Dp.m23561constructorimpl((40 / f10) * (RangesKt.coerceAtLeast(displayMetrics2.widthPixels, displayMetrics2.heightPixels) / Resources.getSystem().getDisplayMetrics().density)));
            float f11 = 5 / f10;
            DisplayMetrics displayMetrics3 = Resources.getSystem().getDisplayMetrics();
            modifier3 = modifier4;
            SurfaceKt.m19280SurfaceT9BRK9s(PaddingKt.m17681padding3ABfNKs(modifierM17728size3ABfNKs, C3127Dp.m23561constructorimpl(f11 * (RangesKt.coerceAtLeast(displayMetrics3.widthPixels, displayMetrics3.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), circleShape, jM21013getWhite0d7_KjU, 0L, 0.0f, fM23561constructorimpl, null, C7400p.f12064a.m11892d(), composerStartRestartGroup, 12779904, 88);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: e7.e
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC7384h.m11845h(modifier3, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: h */
    public static final Unit m11845h(Modifier modifier, int i10, int i11, Composer composer, int i12) {
        m11844g(modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
        return Unit.INSTANCE;
    }
}
