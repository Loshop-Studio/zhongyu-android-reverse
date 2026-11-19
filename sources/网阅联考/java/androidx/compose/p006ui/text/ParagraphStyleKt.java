package androidx.compose.p006ui.text;

import androidx.compose.p006ui.text.style.Hyphens;
import androidx.compose.p006ui.text.style.LineBreak;
import androidx.compose.p006ui.text.style.LineHeightStyle;
import androidx.compose.p006ui.text.style.TextAlign;
import androidx.compose.p006ui.text.style.TextDirection;
import androidx.compose.p006ui.text.style.TextIndent;
import androidx.compose.p006ui.text.style.TextIndentKt;
import androidx.compose.p006ui.text.style.TextMotion;
import androidx.compose.p006ui.unit.LayoutDirection;
import androidx.compose.p006ui.unit.TextUnit;
import androidx.compose.p006ui.unit.TextUnitKt;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m5174d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0007\u001a&\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\n2\b\u0010\u0006\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\bH\u0002\u001a\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0000\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, m5175d2 = {"DefaultLineHeight", "Landroidx/compose/ui/unit/TextUnit;", "J", "lerp", "Landroidx/compose/ui/text/ParagraphStyle;", "start", "stop", "fraction", "", "lerpPlatformStyle", "Landroidx/compose/ui/text/PlatformParagraphStyle;", "resolveParagraphStyleDefaults", "style", "direction", "Landroidx/compose/ui/unit/LayoutDirection;", "ui-text_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class ParagraphStyleKt {
    private static final long DefaultLineHeight = TextUnit.INSTANCE.m11717getUnspecifiedXSAIIZE();

    @Stable
    public static final ParagraphStyle lerp(ParagraphStyle start, ParagraphStyle stop, float f4) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(stop, "stop");
        TextAlign textAlign = (TextAlign) SpanStyleKt.lerpDiscrete(start.getTextAlign(), stop.getTextAlign(), f4);
        TextDirection textDirection = (TextDirection) SpanStyleKt.lerpDiscrete(start.getTextDirection(), stop.getTextDirection(), f4);
        long jM11042lerpTextUnitInheritableC3pnCVY = SpanStyleKt.m11042lerpTextUnitInheritableC3pnCVY(start.getLineHeight(), stop.getLineHeight(), f4);
        TextIndent textIndent = start.getTextIndent();
        if (textIndent == null) {
            textIndent = TextIndent.INSTANCE.getNone();
        }
        TextIndent textIndent2 = stop.getTextIndent();
        if (textIndent2 == null) {
            textIndent2 = TextIndent.INSTANCE.getNone();
        }
        return new ParagraphStyle(textAlign, textDirection, jM11042lerpTextUnitInheritableC3pnCVY, TextIndentKt.lerp(textIndent, textIndent2, f4), lerpPlatformStyle(start.getPlatformStyle(), stop.getPlatformStyle(), f4), (LineHeightStyle) SpanStyleKt.lerpDiscrete(start.getLineHeightStyle(), stop.getLineHeightStyle(), f4), (LineBreak) SpanStyleKt.lerpDiscrete(start.getLineBreak(), stop.getLineBreak(), f4), (Hyphens) SpanStyleKt.lerpDiscrete(start.getHyphens(), stop.getHyphens(), f4), (TextMotion) SpanStyleKt.lerpDiscrete(start.getTextMotion(), stop.getTextMotion(), f4), (DefaultConstructorMarker) null);
    }

    private static final PlatformParagraphStyle lerpPlatformStyle(PlatformParagraphStyle platformParagraphStyle, PlatformParagraphStyle platformParagraphStyle2, float f4) {
        if (platformParagraphStyle == null && platformParagraphStyle2 == null) {
            return null;
        }
        if (platformParagraphStyle == null) {
            platformParagraphStyle = PlatformParagraphStyle.INSTANCE.getDefault();
        }
        if (platformParagraphStyle2 == null) {
            platformParagraphStyle2 = PlatformParagraphStyle.INSTANCE.getDefault();
        }
        return AndroidTextStyle_androidKt.lerp(platformParagraphStyle, platformParagraphStyle2, f4);
    }

    public static final ParagraphStyle resolveParagraphStyleDefaults(ParagraphStyle style, LayoutDirection direction) {
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(direction, "direction");
        TextAlign textAlignM11424boximpl = TextAlign.m11424boximpl(style.getTextAlignOrDefault());
        TextDirection textDirectionM11437boximpl = TextDirection.m11437boximpl(TextStyleKt.m11107resolveTextDirectionYj3eThk(direction, style.getTextDirection()));
        long lineHeight = TextUnitKt.m11724isUnspecifiedR2X_6o(style.getLineHeight()) ? DefaultLineHeight : style.getLineHeight();
        TextIndent textIndent = style.getTextIndent();
        if (textIndent == null) {
            textIndent = TextIndent.INSTANCE.getNone();
        }
        TextIndent textIndent2 = textIndent;
        PlatformParagraphStyle platformStyle = style.getPlatformStyle();
        LineHeightStyle lineHeightStyle = style.getLineHeightStyle();
        LineBreak lineBreakM11348boximpl = LineBreak.m11348boximpl(style.getLineBreakOrDefault());
        Hyphens hyphensM11339boximpl = Hyphens.m11339boximpl(style.getHyphensOrDefault());
        TextMotion textMotion = style.getTextMotion();
        if (textMotion == null) {
            textMotion = TextMotion.INSTANCE.getStatic();
        }
        return new ParagraphStyle(textAlignM11424boximpl, textDirectionM11437boximpl, lineHeight, textIndent2, platformStyle, lineHeightStyle, lineBreakM11348boximpl, hyphensM11339boximpl, textMotion, (DefaultConstructorMarker) null);
    }
}
