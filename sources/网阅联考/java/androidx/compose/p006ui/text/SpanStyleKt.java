package androidx.compose.p006ui.text;

import androidx.compose.p006ui.graphics.Color;
import androidx.compose.p006ui.graphics.ColorKt;
import androidx.compose.p006ui.graphics.Shadow;
import androidx.compose.p006ui.graphics.ShadowKt;
import androidx.compose.p006ui.graphics.drawscope.DrawStyle;
import androidx.compose.p006ui.graphics.drawscope.Fill;
import androidx.compose.p006ui.text.font.FontFamily;
import androidx.compose.p006ui.text.font.FontStyle;
import androidx.compose.p006ui.text.font.FontSynthesis;
import androidx.compose.p006ui.text.font.FontWeight;
import androidx.compose.p006ui.text.font.FontWeightKt;
import androidx.compose.p006ui.text.intl.LocaleList;
import androidx.compose.p006ui.text.style.BaselineShift;
import androidx.compose.p006ui.text.style.BaselineShiftKt;
import androidx.compose.p006ui.text.style.TextDecoration;
import androidx.compose.p006ui.text.style.TextDrawStyleKt;
import androidx.compose.p006ui.text.style.TextForegroundStyle;
import androidx.compose.p006ui.text.style.TextGeometricTransform;
import androidx.compose.p006ui.text.style.TextGeometricTransformKt;
import androidx.compose.p006ui.unit.TextUnit;
import androidx.compose.p006ui.unit.TextUnitKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import com.umeng.analytics.pro.C3335ai;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m5174d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f\u001a+\u0010\r\u001a\u0002H\u000e\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\u000f\u001a\u0002H\u000e2\u0006\u0010\u0010\u001a\u0002H\u000e2\u0006\u0010\u000b\u001a\u00020\fH\u0000¢\u0006\u0002\u0010\u0011\u001a&\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\t\u001a\u0004\u0018\u00010\u00132\b\u0010\n\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000b\u001a\u00020\fH\u0002\u001a-\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\fH\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0010\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\bH\u0000\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0003\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0004\u001a\u00020\u0005X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0006\u001a\u00020\u0005X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, m5175d2 = {"DefaultBackgroundColor", "Landroidx/compose/ui/graphics/Color;", "J", "DefaultColor", "DefaultFontSize", "Landroidx/compose/ui/unit/TextUnit;", "DefaultLetterSpacing", "lerp", "Landroidx/compose/ui/text/SpanStyle;", "start", "stop", "fraction", "", "lerpDiscrete", ExifInterface.GPS_DIRECTION_TRUE, C3335ai.f1705at, "b", "(Ljava/lang/Object;Ljava/lang/Object;F)Ljava/lang/Object;", "lerpPlatformStyle", "Landroidx/compose/ui/text/PlatformSpanStyle;", "lerpTextUnitInheritable", C3335ai.f1665aF, "lerpTextUnitInheritable-C3pnCVY", "(JJF)J", "resolveSpanStyleDefaults", "style", "ui-text_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSpanStyle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpanStyle.kt\nandroidx/compose/ui/text/SpanStyleKt\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,856:1\n658#2:857\n646#2:858\n*S KotlinDebug\n*F\n+ 1 SpanStyle.kt\nandroidx/compose/ui/text/SpanStyleKt\n*L\n851#1:857\n851#1:858\n*E\n"})
/* loaded from: classes.dex */
public final class SpanStyleKt {
    private static final long DefaultBackgroundColor;
    private static final long DefaultColor;
    private static final long DefaultFontSize = TextUnitKt.getSp(14);
    private static final long DefaultLetterSpacing = TextUnitKt.getSp(0);

    static {
        Color.Companion companion = Color.INSTANCE;
        DefaultBackgroundColor = companion.m9213getTransparent0d7_KjU();
        DefaultColor = companion.m9204getBlack0d7_KjU();
    }

    public static final SpanStyle lerp(SpanStyle start, SpanStyle stop, float f4) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(stop, "stop");
        TextForegroundStyle textForegroundStyleLerp = TextDrawStyleKt.lerp(start.getTextForegroundStyle(), stop.getTextForegroundStyle(), f4);
        FontFamily fontFamily = (FontFamily) lerpDiscrete(start.getFontFamily(), stop.getFontFamily(), f4);
        long jM11042lerpTextUnitInheritableC3pnCVY = m11042lerpTextUnitInheritableC3pnCVY(start.getFontSize(), stop.getFontSize(), f4);
        FontWeight fontWeight = start.getFontWeight();
        if (fontWeight == null) {
            fontWeight = FontWeight.INSTANCE.getNormal();
        }
        FontWeight fontWeight2 = stop.getFontWeight();
        if (fontWeight2 == null) {
            fontWeight2 = FontWeight.INSTANCE.getNormal();
        }
        FontWeight fontWeightLerp = FontWeightKt.lerp(fontWeight, fontWeight2, f4);
        FontStyle fontStyle = (FontStyle) lerpDiscrete(start.getFontStyle(), stop.getFontStyle(), f4);
        FontSynthesis fontSynthesis = (FontSynthesis) lerpDiscrete(start.getFontSynthesis(), stop.getFontSynthesis(), f4);
        String str = (String) lerpDiscrete(start.getFontFeatureSettings(), stop.getFontFeatureSettings(), f4);
        long jM11042lerpTextUnitInheritableC3pnCVY2 = m11042lerpTextUnitInheritableC3pnCVY(start.getLetterSpacing(), stop.getLetterSpacing(), f4);
        BaselineShift baselineShift = start.getBaselineShift();
        float fM11326unboximpl = baselineShift != null ? baselineShift.m11326unboximpl() : BaselineShift.m11321constructorimpl(0.0f);
        BaselineShift baselineShift2 = stop.getBaselineShift();
        float fM11333lerpjWV1Mfo = BaselineShiftKt.m11333lerpjWV1Mfo(fM11326unboximpl, baselineShift2 != null ? baselineShift2.m11326unboximpl() : BaselineShift.m11321constructorimpl(0.0f), f4);
        TextGeometricTransform textGeometricTransform = start.getTextGeometricTransform();
        if (textGeometricTransform == null) {
            textGeometricTransform = TextGeometricTransform.INSTANCE.getNone$ui_text_release();
        }
        TextGeometricTransform textGeometricTransform2 = stop.getTextGeometricTransform();
        if (textGeometricTransform2 == null) {
            textGeometricTransform2 = TextGeometricTransform.INSTANCE.getNone$ui_text_release();
        }
        TextGeometricTransform textGeometricTransformLerp = TextGeometricTransformKt.lerp(textGeometricTransform, textGeometricTransform2, f4);
        LocaleList localeList = (LocaleList) lerpDiscrete(start.getLocaleList(), stop.getLocaleList(), f4);
        long jM9229lerpjxsXWHM = ColorKt.m9229lerpjxsXWHM(start.getBackground(), stop.getBackground(), f4);
        TextDecoration textDecoration = (TextDecoration) lerpDiscrete(start.getTextDecoration(), stop.getTextDecoration(), f4);
        Shadow shadow = start.getShadow();
        if (shadow == null) {
            shadow = new Shadow(0L, 0L, 0.0f, 7, null);
        }
        Shadow shadow2 = stop.getShadow();
        if (shadow2 == null) {
            shadow2 = new Shadow(0L, 0L, 0.0f, 7, null);
        }
        return new SpanStyle(textForegroundStyleLerp, jM11042lerpTextUnitInheritableC3pnCVY, fontWeightLerp, fontStyle, fontSynthesis, fontFamily, str, jM11042lerpTextUnitInheritableC3pnCVY2, BaselineShift.m11320boximpl(fM11333lerpjWV1Mfo), textGeometricTransformLerp, localeList, jM9229lerpjxsXWHM, textDecoration, ShadowKt.lerp(shadow, shadow2, f4), lerpPlatformStyle(start.getPlatformStyle(), stop.getPlatformStyle(), f4), (DrawStyle) lerpDiscrete(start.getDrawStyle(), stop.getDrawStyle(), f4), (DefaultConstructorMarker) null);
    }

    public static final <T> T lerpDiscrete(T t3, T t4, float f4) {
        return ((double) f4) < 0.5d ? t3 : t4;
    }

    private static final PlatformSpanStyle lerpPlatformStyle(PlatformSpanStyle platformSpanStyle, PlatformSpanStyle platformSpanStyle2, float f4) {
        if (platformSpanStyle == null && platformSpanStyle2 == null) {
            return null;
        }
        if (platformSpanStyle == null) {
            platformSpanStyle = PlatformSpanStyle.INSTANCE.getDefault();
        }
        if (platformSpanStyle2 == null) {
            platformSpanStyle2 = PlatformSpanStyle.INSTANCE.getDefault();
        }
        return AndroidTextStyle_androidKt.lerp(platformSpanStyle, platformSpanStyle2, f4);
    }

    /* renamed from: lerpTextUnitInheritable-C3pnCVY, reason: not valid java name */
    public static final long m11042lerpTextUnitInheritableC3pnCVY(long j4, long j5, float f4) {
        return (TextUnitKt.m11724isUnspecifiedR2X_6o(j4) || TextUnitKt.m11724isUnspecifiedR2X_6o(j5)) ? ((TextUnit) lerpDiscrete(TextUnit.m11696boximpl(j4), TextUnit.m11696boximpl(j5), f4)).getPackedValue() : TextUnitKt.m11726lerpC3pnCVY(j4, j5, f4);
    }

    public static final SpanStyle resolveSpanStyleDefaults(SpanStyle style) {
        Intrinsics.checkNotNullParameter(style, "style");
        TextForegroundStyle textForegroundStyleTakeOrElse = style.getTextForegroundStyle().takeOrElse(new Function0<TextForegroundStyle>() { // from class: androidx.compose.ui.text.SpanStyleKt.resolveSpanStyleDefaults.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final TextForegroundStyle invoke() {
                return TextForegroundStyle.INSTANCE.m11450from8_81llA(SpanStyleKt.DefaultColor);
            }
        });
        long fontSize = TextUnitKt.m11724isUnspecifiedR2X_6o(style.getFontSize()) ? DefaultFontSize : style.getFontSize();
        FontWeight fontWeight = style.getFontWeight();
        if (fontWeight == null) {
            fontWeight = FontWeight.INSTANCE.getNormal();
        }
        FontWeight fontWeight2 = fontWeight;
        FontStyle fontStyle = style.getFontStyle();
        FontStyle fontStyleM11159boximpl = FontStyle.m11159boximpl(fontStyle != null ? fontStyle.m11165unboximpl() : FontStyle.INSTANCE.m11167getNormal_LCdwA());
        FontSynthesis fontSynthesis = style.getFontSynthesis();
        FontSynthesis fontSynthesisM11168boximpl = FontSynthesis.m11168boximpl(fontSynthesis != null ? fontSynthesis.getValue() : FontSynthesis.INSTANCE.m11177getAllGVVA2EU());
        FontFamily fontFamily = style.getFontFamily();
        if (fontFamily == null) {
            fontFamily = FontFamily.INSTANCE.getDefault();
        }
        FontFamily fontFamily2 = fontFamily;
        String fontFeatureSettings = style.getFontFeatureSettings();
        if (fontFeatureSettings == null) {
            fontFeatureSettings = "";
        }
        String str = fontFeatureSettings;
        long letterSpacing = TextUnitKt.m11724isUnspecifiedR2X_6o(style.getLetterSpacing()) ? DefaultLetterSpacing : style.getLetterSpacing();
        BaselineShift baselineShift = style.getBaselineShift();
        BaselineShift baselineShiftM11320boximpl = BaselineShift.m11320boximpl(baselineShift != null ? baselineShift.m11326unboximpl() : BaselineShift.INSTANCE.m11330getNoney9eOQZs());
        TextGeometricTransform textGeometricTransform = style.getTextGeometricTransform();
        if (textGeometricTransform == null) {
            textGeometricTransform = TextGeometricTransform.INSTANCE.getNone$ui_text_release();
        }
        TextGeometricTransform textGeometricTransform2 = textGeometricTransform;
        LocaleList localeList = style.getLocaleList();
        if (localeList == null) {
            localeList = LocaleList.INSTANCE.getCurrent();
        }
        LocaleList localeList2 = localeList;
        long background = style.getBackground();
        if (!(background != Color.INSTANCE.m9214getUnspecified0d7_KjU())) {
            background = DefaultBackgroundColor;
        }
        long j4 = background;
        TextDecoration textDecoration = style.getTextDecoration();
        if (textDecoration == null) {
            textDecoration = TextDecoration.INSTANCE.getNone();
        }
        TextDecoration textDecoration2 = textDecoration;
        Shadow shadow = style.getShadow();
        if (shadow == null) {
            shadow = Shadow.INSTANCE.getNone();
        }
        Shadow shadow2 = shadow;
        PlatformSpanStyle platformStyle = style.getPlatformStyle();
        DrawStyle drawStyle = style.getDrawStyle();
        if (drawStyle == null) {
            drawStyle = Fill.INSTANCE;
        }
        return new SpanStyle(textForegroundStyleTakeOrElse, fontSize, fontWeight2, fontStyleM11159boximpl, fontSynthesisM11168boximpl, fontFamily2, str, letterSpacing, baselineShiftM11320boximpl, textGeometricTransform2, localeList2, j4, textDecoration2, shadow2, platformStyle, drawStyle, (DefaultConstructorMarker) null);
    }
}
