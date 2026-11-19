package androidx.compose.p013ui.text;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@Immutable
/* loaded from: classes2.dex */
public final class TextLinkStyles {
    public static final int $stable = 0;
    private final SpanStyle focusedStyle;
    private final SpanStyle hoveredStyle;
    private final SpanStyle pressedStyle;
    private final SpanStyle style;

    public TextLinkStyles() {
        this(null, null, null, null, 15, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof TextLinkStyles)) {
            return false;
        }
        TextLinkStyles textLinkStyles = (TextLinkStyles) obj;
        return AbstractC9133u.m16128b(this.style, textLinkStyles.style) && AbstractC9133u.m16128b(this.focusedStyle, textLinkStyles.focusedStyle) && AbstractC9133u.m16128b(this.hoveredStyle, textLinkStyles.hoveredStyle) && AbstractC9133u.m16128b(this.pressedStyle, textLinkStyles.pressedStyle);
    }

    public final SpanStyle getFocusedStyle() {
        return this.focusedStyle;
    }

    public final SpanStyle getHoveredStyle() {
        return this.hoveredStyle;
    }

    public final SpanStyle getPressedStyle() {
        return this.pressedStyle;
    }

    public final SpanStyle getStyle() {
        return this.style;
    }

    public int hashCode() {
        SpanStyle spanStyle = this.style;
        int iHashCode = (spanStyle != null ? spanStyle.hashCode() : 0) * 31;
        SpanStyle spanStyle2 = this.focusedStyle;
        int iHashCode2 = (iHashCode + (spanStyle2 != null ? spanStyle2.hashCode() : 0)) * 31;
        SpanStyle spanStyle3 = this.hoveredStyle;
        int iHashCode3 = (iHashCode2 + (spanStyle3 != null ? spanStyle3.hashCode() : 0)) * 31;
        SpanStyle spanStyle4 = this.pressedStyle;
        return iHashCode3 + (spanStyle4 != null ? spanStyle4.hashCode() : 0);
    }

    public TextLinkStyles(SpanStyle spanStyle, SpanStyle spanStyle2, SpanStyle spanStyle3, SpanStyle spanStyle4) {
        this.style = spanStyle;
        this.focusedStyle = spanStyle2;
        this.hoveredStyle = spanStyle3;
        this.pressedStyle = spanStyle4;
    }

    public /* synthetic */ TextLinkStyles(SpanStyle spanStyle, SpanStyle spanStyle2, SpanStyle spanStyle3, SpanStyle spanStyle4, int i10, AbstractC9126n abstractC9126n) {
        this((i10 & 1) != 0 ? null : spanStyle, (i10 & 2) != 0 ? null : spanStyle2, (i10 & 4) != 0 ? null : spanStyle3, (i10 & 8) != 0 ? null : spanStyle4);
    }
}
