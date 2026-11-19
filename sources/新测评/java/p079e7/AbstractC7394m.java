package p079e7;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material3.TextKt;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.graphics.Shape;
import androidx.compose.p013ui.text.TextLayoutResult;
import androidx.compose.p013ui.text.TextStyle;
import androidx.compose.p013ui.text.font.FontFamily;
import androidx.compose.p013ui.text.font.FontStyle;
import androidx.compose.p013ui.text.font.FontWeight;
import androidx.compose.p013ui.text.style.TextAlign;
import androidx.compose.p013ui.text.style.TextDecoration;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: e7.m */
/* loaded from: classes4.dex */
public abstract class AbstractC7394m {
    /* JADX WARN: Removed duplicated region for block: B:103:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:170:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0115  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m11873e(androidx.compose.p013ui.Modifier r33, androidx.compose.p013ui.graphics.Shape r34, long r35, long r37, final long r39, final java.lang.String r41, androidx.compose.foundation.BorderStroke r42, boolean r43, androidx.compose.foundation.layout.PaddingValues r44, kotlin.jvm.functions.Function0 r45, androidx.compose.runtime.Composer r46, final int r47, final int r48) {
        /*
            Method dump skipped, instructions count: 783
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p079e7.AbstractC7394m.m11873e(androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, long, long, long, java.lang.String, androidx.compose.foundation.BorderStroke, boolean, androidx.compose.foundation.layout.PaddingValues, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* renamed from: f */
    public static final Unit m11874f() {
        return Unit.INSTANCE;
    }

    /* renamed from: g */
    public static final Unit m11875g(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* renamed from: h */
    public static final Unit m11876h(String str, long j10, long j11, RowScope Button, Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        if (composer.shouldExecute((i10 & 17) != 16, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1153296129, i10, -1, "com.zykj.evaluation.ui.widget.RoundedButton.<anonymous> (ButtonWidget.kt:45)");
            }
            TextKt.m19430Text4IGK_g(str, (Modifier) null, j10, j11, (FontStyle) null, FontWeight.INSTANCE.getNormal(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, ProfileVerifier.CompilationStatus.f2100xf2722a21, 0, 131026);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: i */
    public static final Unit m11877i(Modifier modifier, Shape shape, long j10, long j11, long j12, String str, BorderStroke borderStroke, boolean z9, PaddingValues paddingValues, Function0 function0, int i10, int i11, Composer composer, int i12) {
        m11873e(modifier, shape, j10, j11, j12, str, borderStroke, z9, paddingValues, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
        return Unit.INSTANCE;
    }
}
