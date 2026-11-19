package androidx.compose.material3.tokens;

import androidx.compose.material3.internal.DefaultPlatformTextStyle_androidKt;
import androidx.compose.p014ui.text.TextStyle;
import androidx.compose.p014ui.text.style.LineHeightStyle;
import kotlin.jvm.internal.AbstractC9972n;

/* loaded from: classes2.dex */
public final class TypographyTokensKt {
    private static final LineHeightStyle DefaultLineHeightStyle;
    private static final TextStyle DefaultTextStyle;

    static {
        LineHeightStyle lineHeightStyle = new LineHeightStyle(LineHeightStyle.Alignment.Companion.m33353getCenterPIaL0Z0(), LineHeightStyle.Trim.Companion.m33377getNoneEVpEnUU(), (AbstractC9972n) null);
        DefaultLineHeightStyle = lineHeightStyle;
        DefaultTextStyle = TextStyle.m32979copyp1EtxEg$default(TextStyle.Companion.getDefault(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, DefaultPlatformTextStyle_androidKt.defaultPlatformTextStyle(), lineHeightStyle, 0, 0, null, 15204351, null);
    }

    public static final LineHeightStyle getDefaultLineHeightStyle() {
        return DefaultLineHeightStyle;
    }

    public static final TextStyle getDefaultTextStyle() {
        return DefaultTextStyle;
    }
}
