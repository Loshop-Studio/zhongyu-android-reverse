package p068d7;

import androidx.compose.material3.Typography;
import androidx.compose.p013ui.graphics.Shadow;
import androidx.compose.p013ui.graphics.drawscope.DrawStyle;
import androidx.compose.p013ui.text.PlatformTextStyle;
import androidx.compose.p013ui.text.TextStyle;
import androidx.compose.p013ui.text.font.FontFamily;
import androidx.compose.p013ui.text.font.FontStyle;
import androidx.compose.p013ui.text.font.FontSynthesis;
import androidx.compose.p013ui.text.font.FontWeight;
import androidx.compose.p013ui.text.font.SystemFontFamily;
import androidx.compose.p013ui.text.intl.LocaleList;
import androidx.compose.p013ui.text.style.BaselineShift;
import androidx.compose.p013ui.text.style.LineHeightStyle;
import androidx.compose.p013ui.text.style.TextDecoration;
import androidx.compose.p013ui.text.style.TextGeometricTransform;
import androidx.compose.p013ui.text.style.TextIndent;
import androidx.compose.p013ui.text.style.TextMotion;
import androidx.compose.p013ui.unit.TextUnitKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: d7.d */
/* loaded from: classes4.dex */
public abstract class AbstractC7308d {

    /* renamed from: a */
    public static final Typography f11819a;

    static {
        SystemFontFamily systemFontFamily = FontFamily.INSTANCE.getDefault();
        FontWeight normal = FontWeight.INSTANCE.getNormal();
        f11819a = new Typography(null, null, null, null, null, null, null, null, null, new TextStyle(0L, TextUnitKt.getSp(16), normal, (FontStyle) null, (FontSynthesis) null, systemFontFamily, (String) null, TextUnitKt.getSp(0.5d), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.getSp(24), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645977, (DefaultConstructorMarker) null), null, null, null, null, null, 32255, null);
    }

    /* renamed from: a */
    public static final Typography m11594a() {
        return f11819a;
    }
}
