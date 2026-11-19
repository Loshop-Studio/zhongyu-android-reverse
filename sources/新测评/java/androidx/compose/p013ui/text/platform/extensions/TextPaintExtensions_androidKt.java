package androidx.compose.p013ui.text.platform.extensions;

import android.graphics.Typeface;
import androidx.compose.p013ui.geometry.Size;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.Shadow;
import androidx.compose.p013ui.graphics.drawscope.DrawStyle;
import androidx.compose.p013ui.text.PlatformSpanStyle;
import androidx.compose.p013ui.text.SpanStyle;
import androidx.compose.p013ui.text.font.FontFamily;
import androidx.compose.p013ui.text.font.FontStyle;
import androidx.compose.p013ui.text.font.FontSynthesis;
import androidx.compose.p013ui.text.font.FontWeight;
import androidx.compose.p013ui.text.intl.LocaleList;
import androidx.compose.p013ui.text.platform.AndroidTextPaint;
import androidx.compose.p013ui.text.style.BaselineShift;
import androidx.compose.p013ui.text.style.TextDecoration;
import androidx.compose.p013ui.text.style.TextGeometricTransform;
import androidx.compose.p013ui.text.style.TextMotion;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.p013ui.unit.TextUnit;
import androidx.compose.p013ui.unit.TextUnitType;
import kotlin.Metadata;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000`\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a6\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001aP\u0010\u000f\u001a\u0004\u0018\u00010\u0004*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00042&\u0010\u0012\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u00132\u0006\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0000\u001a\f\u0010\u001b\u001a\u00020\b*\u00020\u0004H\u0000\u001a\u0016\u0010\u001c\u001a\u00020\u001d*\u00020\u00102\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006 "}, m13558d2 = {"correctBlurRadius", "", "blurRadius", "generateFallbackSpanStyle", "Landroidx/compose/ui/text/SpanStyle;", "letterSpacing", "Landroidx/compose/ui/unit/TextUnit;", "requiresLetterSpacing", "", "background", "Landroidx/compose/ui/graphics/Color;", "baselineShift", "Landroidx/compose/ui/text/style/BaselineShift;", "generateFallbackSpanStyle-62GTOB8", "(JZJLandroidx/compose/ui/text/style/BaselineShift;)Landroidx/compose/ui/text/SpanStyle;", "applySpanStyle", "Landroidx/compose/ui/text/platform/AndroidTextPaint;", "style", "resolveTypeface", "Lkotlin/Function4;", "Landroidx/compose/ui/text/font/FontFamily;", "Landroidx/compose/ui/text/font/FontWeight;", "Landroidx/compose/ui/text/font/FontStyle;", "Landroidx/compose/ui/text/font/FontSynthesis;", "Landroid/graphics/Typeface;", "density", "Landroidx/compose/ui/unit/Density;", "hasFontAttributes", "setTextMotion", "", "textMotion", "Landroidx/compose/ui/text/style/TextMotion;", "ui-text_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nTextPaintExtensions.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextPaintExtensions.android.kt\nandroidx/compose/ui/text/platform/extensions/TextPaintExtensions_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,212:1\n1#2:213\n*E\n"})
/* loaded from: classes2.dex */
public final class TextPaintExtensions_androidKt {
    public static final SpanStyle applySpanStyle(AndroidTextPaint androidTextPaint, SpanStyle spanStyle, Function4<? super FontFamily, ? super FontWeight, ? super FontStyle, ? super FontSynthesis, ? extends Typeface> function4, Density density, boolean z9) {
        long jM23754getTypeUIouoOA = TextUnit.m23754getTypeUIouoOA(spanStyle.getFontSize());
        TextUnitType.Companion companion = TextUnitType.INSTANCE;
        if (TextUnitType.m23783equalsimpl0(jM23754getTypeUIouoOA, companion.m23788getSpUIouoOA())) {
            androidTextPaint.setTextSize(density.mo17331toPxR2X_6o(spanStyle.getFontSize()));
        } else if (TextUnitType.m23783equalsimpl0(jM23754getTypeUIouoOA, companion.m23787getEmUIouoOA())) {
            androidTextPaint.setTextSize(androidTextPaint.getTextSize() * TextUnit.m23755getValueimpl(spanStyle.getFontSize()));
        }
        if (hasFontAttributes(spanStyle)) {
            FontFamily fontFamily = spanStyle.getFontFamily();
            FontWeight fontWeight = spanStyle.getFontWeight();
            if (fontWeight == null) {
                fontWeight = FontWeight.INSTANCE.getNormal();
            }
            FontStyle fontStyle = spanStyle.getFontStyle();
            FontStyle fontStyleM23135boximpl = FontStyle.m23135boximpl(fontStyle != null ? fontStyle.m23141unboximpl() : FontStyle.INSTANCE.m23145getNormal_LCdwA());
            FontSynthesis fontSynthesis = spanStyle.getFontSynthesis();
            androidTextPaint.setTypeface(function4.invoke(fontFamily, fontWeight, fontStyleM23135boximpl, FontSynthesis.m23146boximpl(fontSynthesis != null ? fontSynthesis.getValue() : FontSynthesis.INSTANCE.m23155getAllGVVA2EU())));
        }
        if (spanStyle.getLocaleList() != null && !Intrinsics.areEqual(spanStyle.getLocaleList(), LocaleList.INSTANCE.getCurrent())) {
            LocaleListHelperMethods.INSTANCE.setTextLocales(androidTextPaint, spanStyle.getLocaleList());
        }
        if (spanStyle.getFontFeatureSettings() != null && !Intrinsics.areEqual(spanStyle.getFontFeatureSettings(), "")) {
            androidTextPaint.setFontFeatureSettings(spanStyle.getFontFeatureSettings());
        }
        if (spanStyle.getTextGeometricTransform() != null && !Intrinsics.areEqual(spanStyle.getTextGeometricTransform(), TextGeometricTransform.INSTANCE.getNone$ui_text_release())) {
            androidTextPaint.setTextScaleX(androidTextPaint.getTextScaleX() * spanStyle.getTextGeometricTransform().getScaleX());
            androidTextPaint.setTextSkewX(androidTextPaint.getTextSkewX() + spanStyle.getTextGeometricTransform().getSkewX());
        }
        androidTextPaint.m23295setColor8_81llA(spanStyle.m22968getColor0d7_KjU());
        androidTextPaint.m23293setBrush12SF9DM(spanStyle.getBrush(), Size.INSTANCE.m20812getUnspecifiedNHjbRc(), spanStyle.getAlpha());
        androidTextPaint.setShadow(spanStyle.getShadow());
        androidTextPaint.setTextDecoration(spanStyle.getTextDecoration());
        androidTextPaint.setDrawStyle(spanStyle.getDrawStyle());
        if (TextUnitType.m23783equalsimpl0(TextUnit.m23754getTypeUIouoOA(spanStyle.getLetterSpacing()), companion.m23788getSpUIouoOA()) && TextUnit.m23755getValueimpl(spanStyle.getLetterSpacing()) != 0.0f) {
            float textSize = androidTextPaint.getTextSize() * androidTextPaint.getTextScaleX();
            float fMo17331toPxR2X_6o = density.mo17331toPxR2X_6o(spanStyle.getLetterSpacing());
            if (textSize != 0.0f) {
                androidTextPaint.setLetterSpacing(fMo17331toPxR2X_6o / textSize);
            }
        } else if (TextUnitType.m23783equalsimpl0(TextUnit.m23754getTypeUIouoOA(spanStyle.getLetterSpacing()), companion.m23787getEmUIouoOA())) {
            androidTextPaint.setLetterSpacing(TextUnit.m23755getValueimpl(spanStyle.getLetterSpacing()));
        }
        return m23310generateFallbackSpanStyle62GTOB8(spanStyle.getLetterSpacing(), z9, spanStyle.getBackground(), spanStyle.getBaselineShift());
    }

    public static /* synthetic */ SpanStyle applySpanStyle$default(AndroidTextPaint androidTextPaint, SpanStyle spanStyle, Function4 function4, Density density, boolean z9, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z9 = false;
        }
        return applySpanStyle(androidTextPaint, spanStyle, function4, density, z9);
    }

    public static final float correctBlurRadius(float f10) {
        if (f10 == 0.0f) {
            return Float.MIN_VALUE;
        }
        return f10;
    }

    /* renamed from: generateFallbackSpanStyle-62GTOB8, reason: not valid java name */
    private static final SpanStyle m23310generateFallbackSpanStyle62GTOB8(long j10, boolean z9, long j11, BaselineShift baselineShift) {
        long jM21012getUnspecified0d7_KjU = j11;
        boolean z10 = false;
        boolean z11 = z9 && TextUnitType.m23783equalsimpl0(TextUnit.m23754getTypeUIouoOA(j10), TextUnitType.INSTANCE.m23788getSpUIouoOA()) && TextUnit.m23755getValueimpl(j10) != 0.0f;
        Color.Companion companion = Color.INSTANCE;
        boolean z12 = (Color.m20977equalsimpl0(jM21012getUnspecified0d7_KjU, companion.m21012getUnspecified0d7_KjU()) || Color.m20977equalsimpl0(jM21012getUnspecified0d7_KjU, companion.m21011getTransparent0d7_KjU())) ? false : true;
        if (baselineShift != null) {
            if (!BaselineShift.m23320equalsimpl0(baselineShift.m23323unboximpl(), BaselineShift.INSTANCE.m23327getNoney9eOQZs())) {
                z10 = true;
            }
        }
        if (!z11 && !z12 && !z10) {
            return null;
        }
        long jM23766getUnspecifiedXSAIIZE = z11 ? j10 : TextUnit.INSTANCE.m23766getUnspecifiedXSAIIZE();
        if (!z12) {
            jM21012getUnspecified0d7_KjU = companion.m21012getUnspecified0d7_KjU();
        }
        return new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, jM23766getUnspecifiedXSAIIZE, z10 ? baselineShift : null, (TextGeometricTransform) null, (LocaleList) null, jM21012getUnspecified0d7_KjU, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 63103, (DefaultConstructorMarker) null);
    }

    public static final boolean hasFontAttributes(SpanStyle spanStyle) {
        return (spanStyle.getFontFamily() == null && spanStyle.getFontStyle() == null && spanStyle.getFontWeight() == null) ? false : true;
    }

    public static final void setTextMotion(AndroidTextPaint androidTextPaint, TextMotion textMotion) {
        if (textMotion == null) {
            textMotion = TextMotion.INSTANCE.getStatic();
        }
        androidTextPaint.setFlags(textMotion.getSubpixelTextPositioning() ? androidTextPaint.getFlags() | 128 : androidTextPaint.getFlags() & (-129));
        int linearity = textMotion.getLinearity();
        TextMotion.Linearity.Companion companion = TextMotion.Linearity.INSTANCE;
        if (TextMotion.Linearity.m23477equalsimpl0(linearity, companion.m23482getLinear4e0Vf04())) {
            androidTextPaint.setFlags(androidTextPaint.getFlags() | 64);
            androidTextPaint.setHinting(0);
        } else if (TextMotion.Linearity.m23477equalsimpl0(linearity, companion.m23481getFontHinting4e0Vf04())) {
            androidTextPaint.getFlags();
            androidTextPaint.setHinting(1);
        } else if (!TextMotion.Linearity.m23477equalsimpl0(linearity, companion.m23483getNone4e0Vf04())) {
            androidTextPaint.getFlags();
        } else {
            androidTextPaint.getFlags();
            androidTextPaint.setHinting(0);
        }
    }
}
