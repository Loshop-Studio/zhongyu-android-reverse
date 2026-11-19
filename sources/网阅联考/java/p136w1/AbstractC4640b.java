package p136w1;

import androidx.compose.material3.Typography;
import androidx.compose.p006ui.graphics.Shadow;
import androidx.compose.p006ui.text.PlatformTextStyle;
import androidx.compose.p006ui.text.TextStyle;
import androidx.compose.p006ui.text.font.FontFamily;
import androidx.compose.p006ui.text.font.FontStyle;
import androidx.compose.p006ui.text.font.FontSynthesis;
import androidx.compose.p006ui.text.font.FontWeight;
import androidx.compose.p006ui.text.font.SystemFontFamily;
import androidx.compose.p006ui.text.intl.LocaleList;
import androidx.compose.p006ui.text.style.BaselineShift;
import androidx.compose.p006ui.text.style.Hyphens;
import androidx.compose.p006ui.text.style.LineBreak;
import androidx.compose.p006ui.text.style.LineHeightStyle;
import androidx.compose.p006ui.text.style.TextAlign;
import androidx.compose.p006ui.text.style.TextDecoration;
import androidx.compose.p006ui.text.style.TextDirection;
import androidx.compose.p006ui.text.style.TextGeometricTransform;
import androidx.compose.p006ui.text.style.TextIndent;
import androidx.compose.p006ui.unit.TextUnitKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: w1.b */
/* loaded from: classes2.dex */
public abstract class AbstractC4640b {

    /* renamed from: a */
    public static final Typography f5867a;

    static {
        SystemFontFamily systemFontFamily = FontFamily.INSTANCE.getDefault();
        FontWeight normal = FontWeight.INSTANCE.getNormal();
        f5867a = new Typography(null, null, null, null, null, null, null, null, null, new TextStyle(0L, TextUnitKt.getSp(16), normal, (FontStyle) null, (FontSynthesis) null, systemFontFamily, (String) null, TextUnitKt.getSp(0.5d), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, TextUnitKt.getSp(24), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, 4128601, (DefaultConstructorMarker) null), null, null, null, null, null, 32255, null);
    }

    /* renamed from: a */
    public static final Typography m6469a() {
        return f5867a;
    }
}
