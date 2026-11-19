package p294x6;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material3.TextKt;
import androidx.compose.p012ui.Modifier;
import androidx.compose.p012ui.graphics.Shape;
import androidx.compose.p012ui.text.TextLayoutResult;
import androidx.compose.p012ui.text.TextStyle;
import androidx.compose.p012ui.text.font.FontFamily;
import androidx.compose.p012ui.text.font.FontStyle;
import androidx.compose.p012ui.text.font.FontWeight;
import androidx.compose.p012ui.text.style.TextAlign;
import androidx.compose.p012ui.text.style.TextDecoration;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: x6.g */
/* loaded from: classes5.dex */
public abstract class AbstractC9892g {
    /* JADX WARN: Removed duplicated region for block: B:103:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02f1  */
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
    public static final void m16950e(androidx.compose.p012ui.Modifier r33, androidx.compose.p012ui.graphics.Shape r34, long r35, long r37, final long r39, final java.lang.String r41, androidx.compose.foundation.BorderStroke r42, boolean r43, androidx.compose.foundation.layout.PaddingValues r44, kotlin.jvm.functions.Function0 r45, androidx.compose.runtime.Composer r46, final int r47, final int r48) {
        /*
            Method dump skipped, instructions count: 771
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p294x6.AbstractC9892g.m16950e(androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, long, long, long, java.lang.String, androidx.compose.foundation.BorderStroke, boolean, androidx.compose.foundation.layout.PaddingValues, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* renamed from: f */
    public static final Unit m16951f() {
        return Unit.INSTANCE;
    }

    /* renamed from: g */
    public static final Unit m16952g(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* renamed from: h */
    public static final Unit m16953h(String str, long j9, long j10, RowScope Button, Composer composer, int i9) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        if (composer.shouldExecute((i9 & 17) != 16, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1851345616, i9, -1, "com.zykj.student.dialogue.ui.widget.RoundedButton.<anonymous> (ButtonWidget.kt:45)");
            }
            TextKt.m19863Text4IGK_g(str, (Modifier) null, j9, j10, (FontStyle) null, FontWeight.INSTANCE.getNormal(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, ProfileVerifier.CompilationStatus.f1945xf2722a21, 0, 131026);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: i */
    public static final Unit m16954i(Modifier modifier, Shape shape, long j9, long j10, long j11, String str, BorderStroke borderStroke, boolean z9, PaddingValues paddingValues, Function0 function0, int i9, int i10, Composer composer, int i11) {
        m16950e(modifier, shape, j9, j10, j11, str, borderStroke, z9, paddingValues, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i9 | 1), i10);
        return Unit.INSTANCE;
    }
}
