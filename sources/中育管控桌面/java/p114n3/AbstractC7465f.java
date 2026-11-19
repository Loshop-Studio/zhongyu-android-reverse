package p114n3;

import androidx.compose.material3.Typography;
import androidx.compose.p009ui.graphics.Shadow;
import androidx.compose.p009ui.graphics.drawscope.DrawStyle;
import androidx.compose.p009ui.text.PlatformTextStyle;
import androidx.compose.p009ui.text.TextStyle;
import androidx.compose.p009ui.text.font.FontFamily;
import androidx.compose.p009ui.text.font.FontStyle;
import androidx.compose.p009ui.text.font.FontSynthesis;
import androidx.compose.p009ui.text.font.FontWeight;
import androidx.compose.p009ui.text.font.SystemFontFamily;
import androidx.compose.p009ui.text.intl.LocaleList;
import androidx.compose.p009ui.text.style.BaselineShift;
import androidx.compose.p009ui.text.style.LineHeightStyle;
import androidx.compose.p009ui.text.style.TextDecoration;
import androidx.compose.p009ui.text.style.TextGeometricTransform;
import androidx.compose.p009ui.text.style.TextIndent;
import androidx.compose.p009ui.text.style.TextMotion;
import androidx.compose.p009ui.unit.TextUnitKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: n3.f */
/* loaded from: classes4.dex */
public abstract class AbstractC7465f {

    /* renamed from: a */
    public static final Typography f9555a;

    static {
        SystemFontFamily systemFontFamily = FontFamily.INSTANCE.getDefault();
        FontWeight normal = FontWeight.INSTANCE.getNormal();
        f9555a = new Typography(null, null, null, null, null, null, null, null, null, new TextStyle(0L, TextUnitKt.getSp(16), normal, (FontStyle) null, (FontSynthesis) null, systemFontFamily, (String) null, TextUnitKt.getSp(0.5d), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.getSp(24), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645977, (DefaultConstructorMarker) null), null, null, null, null, null, 32255, null);
    }

    /* renamed from: a */
    public static final Typography m8524a() {
        return f9555a;
    }
}
