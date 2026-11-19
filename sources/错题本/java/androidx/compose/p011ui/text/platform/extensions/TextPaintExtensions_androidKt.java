package androidx.compose.p011ui.text.platform.extensions;

import android.graphics.Typeface;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawStyle;
import androidx.compose.p011ui.text.PlatformSpanStyle;
import androidx.compose.p011ui.text.SpanStyle;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontSynthesis;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.intl.LocaleList;
import androidx.compose.p011ui.text.platform.AndroidTextPaint;
import androidx.compose.p011ui.text.style.BaselineShift;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextGeometricTransform;
import androidx.compose.p011ui.text.style.TextMotion;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.TextUnit;
import androidx.compose.p011ui.unit.TextUnitType;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6475g;

@Metadata(m5109d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\u001aW\u0010\u000e\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012&\u0010\t\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00032\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a6\u0010\u0018\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001d\u0010\u001c\u001a\u00020\u001b*\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0013\u0010\u001e\u001a\u00020\f*\u00020\u0001H\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0017\u0010\"\u001a\u00020 2\u0006\u0010!\u001a\u00020 H\u0000¢\u0006\u0004\b\"\u0010#\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006$"}, m5110d2 = {"Landroidx/compose/ui/text/platform/AndroidTextPaint;", "Landroidx/compose/ui/text/SpanStyle;", "style", "Lkotlin/Function4;", "Landroidx/compose/ui/text/font/FontFamily;", "Landroidx/compose/ui/text/font/FontWeight;", "Landroidx/compose/ui/text/font/FontStyle;", "Landroidx/compose/ui/text/font/FontSynthesis;", "Landroid/graphics/Typeface;", "resolveTypeface", "Landroidx/compose/ui/unit/Density;", "density", "", "requiresLetterSpacing", "applySpanStyle", "(Landroidx/compose/ui/text/platform/AndroidTextPaint;Landroidx/compose/ui/text/SpanStyle;Lr6/g;Landroidx/compose/ui/unit/Density;Z)Landroidx/compose/ui/text/SpanStyle;", "Landroidx/compose/ui/unit/TextUnit;", "letterSpacing", "Landroidx/compose/ui/graphics/Color;", "background", "Landroidx/compose/ui/text/style/BaselineShift;", "baselineShift", "generateFallbackSpanStyle-62GTOB8", "(JZJLandroidx/compose/ui/text/style/BaselineShift;)Landroidx/compose/ui/text/SpanStyle;", "generateFallbackSpanStyle", "Landroidx/compose/ui/text/style/TextMotion;", "textMotion", "Ld6/s;", "setTextMotion", "(Landroidx/compose/ui/text/platform/AndroidTextPaint;Landroidx/compose/ui/text/style/TextMotion;)V", "hasFontAttributes", "(Landroidx/compose/ui/text/SpanStyle;)Z", "", "blurRadius", "correctBlurRadius", "(F)F", "ui-text_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nTextPaintExtensions.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextPaintExtensions.android.kt\nandroidx/compose/ui/text/platform/extensions/TextPaintExtensions_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,212:1\n1#2:213\n*E\n"})
/* loaded from: classes2.dex */
public final class TextPaintExtensions_androidKt {
    @Nullable
    public static final SpanStyle applySpanStyle(@NotNull AndroidTextPaint androidTextPaint, @NotNull SpanStyle spanStyle, @NotNull InterfaceC6475g interfaceC6475g, @NotNull Density density, boolean z8) {
        long jM13498getTypeUIouoOA = TextUnit.m13498getTypeUIouoOA(spanStyle.getFontSize());
        TextUnitType.Companion companion = TextUnitType.INSTANCE;
        if (TextUnitType.m13527equalsimpl0(jM13498getTypeUIouoOA, companion.m13532getSpUIouoOA())) {
            androidTextPaint.setTextSize(density.mo6902toPxR2X_6o(spanStyle.getFontSize()));
        } else if (TextUnitType.m13527equalsimpl0(jM13498getTypeUIouoOA, companion.m13531getEmUIouoOA())) {
            androidTextPaint.setTextSize(TextUnit.m13499getValueimpl(spanStyle.getFontSize()) * androidTextPaint.getTextSize());
        }
        if (hasFontAttributes(spanStyle)) {
            FontFamily fontFamily = spanStyle.getFontFamily();
            FontWeight fontWeight = spanStyle.getFontWeight();
            if (fontWeight == null) {
                fontWeight = FontWeight.INSTANCE.getNormal();
            }
            FontStyle fontStyle = spanStyle.getFontStyle();
            FontStyle fontStyleM12878boximpl = FontStyle.m12878boximpl(fontStyle != null ? fontStyle.m12884unboximpl() : FontStyle.INSTANCE.m12888getNormal_LCdwA());
            FontSynthesis fontSynthesis = spanStyle.getFontSynthesis();
            androidTextPaint.setTypeface((Typeface) interfaceC6475g.invoke(fontFamily, fontWeight, fontStyleM12878boximpl, FontSynthesis.m12889boximpl(fontSynthesis != null ? fontSynthesis.getValue() : FontSynthesis.INSTANCE.m12898getAllGVVA2EU())));
        }
        if (spanStyle.getLocaleList() != null && !AbstractC5830k.m5325b(spanStyle.getLocaleList(), LocaleList.INSTANCE.getCurrent())) {
            LocaleListHelperMethods.INSTANCE.setTextLocales(androidTextPaint, spanStyle.getLocaleList());
        }
        if (spanStyle.getFontFeatureSettings() != null && !AbstractC5830k.m5325b(spanStyle.getFontFeatureSettings(), "")) {
            androidTextPaint.setFontFeatureSettings(spanStyle.getFontFeatureSettings());
        }
        if (spanStyle.getTextGeometricTransform() != null && !AbstractC5830k.m5325b(spanStyle.getTextGeometricTransform(), TextGeometricTransform.INSTANCE.getNone$ui_text_release())) {
            androidTextPaint.setTextScaleX(spanStyle.getTextGeometricTransform().getScaleX() * androidTextPaint.getTextScaleX());
            androidTextPaint.setTextSkewX(spanStyle.getTextGeometricTransform().getSkewX() + androidTextPaint.getTextSkewX());
        }
        androidTextPaint.m13038setColor8_81llA(spanStyle.m12711getColor0d7_KjU());
        androidTextPaint.m13036setBrush12SF9DM(spanStyle.getBrush(), Size.INSTANCE.m10518getUnspecifiedNHjbRc(), spanStyle.getAlpha());
        androidTextPaint.setShadow(spanStyle.getShadow());
        androidTextPaint.setTextDecoration(spanStyle.getBackground());
        androidTextPaint.setDrawStyle(spanStyle.getDrawStyle());
        if (TextUnitType.m13527equalsimpl0(TextUnit.m13498getTypeUIouoOA(spanStyle.getLetterSpacing()), companion.m13532getSpUIouoOA()) && TextUnit.m13499getValueimpl(spanStyle.getLetterSpacing()) != 0.0f) {
            float textScaleX = androidTextPaint.getTextScaleX() * androidTextPaint.getTextSize();
            float fMo6902toPxR2X_6o = density.mo6902toPxR2X_6o(spanStyle.getLetterSpacing());
            if (textScaleX != 0.0f) {
                androidTextPaint.setLetterSpacing(fMo6902toPxR2X_6o / textScaleX);
            }
        } else if (TextUnitType.m13527equalsimpl0(TextUnit.m13498getTypeUIouoOA(spanStyle.getLetterSpacing()), companion.m13531getEmUIouoOA())) {
            androidTextPaint.setLetterSpacing(TextUnit.m13499getValueimpl(spanStyle.getLetterSpacing()));
        }
        return m13053generateFallbackSpanStyle62GTOB8(spanStyle.getLetterSpacing(), z8, spanStyle.getBackground(), spanStyle.getBaselineShift());
    }

    public static /* synthetic */ SpanStyle applySpanStyle$default(AndroidTextPaint androidTextPaint, SpanStyle spanStyle, InterfaceC6475g interfaceC6475g, Density density, boolean z8, int i, Object obj) {
        if ((i & 8) != 0) {
            z8 = false;
        }
        return applySpanStyle(androidTextPaint, spanStyle, interfaceC6475g, density, z8);
    }

    public static final float correctBlurRadius(float f) {
        if (f == 0.0f) {
            return Float.MIN_VALUE;
        }
        return f;
    }

    /* renamed from: generateFallbackSpanStyle-62GTOB8, reason: not valid java name */
    private static final SpanStyle m13053generateFallbackSpanStyle62GTOB8(long j7, boolean z8, long j8, BaselineShift baselineShift) {
        long jM10718getUnspecified0d7_KjU = j8;
        boolean z9 = false;
        boolean z10 = z8 && TextUnitType.m13527equalsimpl0(TextUnit.m13498getTypeUIouoOA(j7), TextUnitType.INSTANCE.m13532getSpUIouoOA()) && TextUnit.m13499getValueimpl(j7) != 0.0f;
        Color.Companion companion = Color.INSTANCE;
        boolean z11 = (Color.m10683equalsimpl0(jM10718getUnspecified0d7_KjU, companion.m10718getUnspecified0d7_KjU()) || Color.m10683equalsimpl0(jM10718getUnspecified0d7_KjU, companion.m10717getTransparent0d7_KjU())) ? false : true;
        if (baselineShift != null) {
            if (!BaselineShift.m13064equalsimpl0(baselineShift.m13067unboximpl(), BaselineShift.INSTANCE.m13071getNoney9eOQZs())) {
                z9 = true;
            }
        }
        if (!z10 && !z11 && !z9) {
            return null;
        }
        long jM13510getUnspecifiedXSAIIZE = z10 ? j7 : TextUnit.INSTANCE.m13510getUnspecifiedXSAIIZE();
        if (!z11) {
            jM10718getUnspecified0d7_KjU = companion.m10718getUnspecified0d7_KjU();
        }
        return new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, jM13510getUnspecifiedXSAIIZE, z9 ? baselineShift : null, (TextGeometricTransform) null, (LocaleList) null, jM10718getUnspecified0d7_KjU, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 63103, (AbstractC5824e) null);
    }

    public static final boolean hasFontAttributes(@NotNull SpanStyle spanStyle) {
        return (spanStyle.getFontFamily() == null && spanStyle.getFontStyle() == null && spanStyle.getFontWeight() == null) ? false : true;
    }

    public static final void setTextMotion(@NotNull AndroidTextPaint androidTextPaint, @Nullable TextMotion textMotion) {
        if (textMotion == null) {
            textMotion = TextMotion.INSTANCE.getStatic();
        }
        androidTextPaint.setFlags(textMotion.getSubpixelTextPositioning() ? androidTextPaint.getFlags() | 128 : androidTextPaint.getFlags() & (-129));
        int linearity = textMotion.getLinearity();
        TextMotion.Linearity.Companion companion = TextMotion.Linearity.INSTANCE;
        if (TextMotion.Linearity.m13221equalsimpl0(linearity, companion.m13226getLinear4e0Vf04())) {
            androidTextPaint.setFlags(androidTextPaint.getFlags() | 64);
            androidTextPaint.setHinting(0);
        } else if (TextMotion.Linearity.m13221equalsimpl0(linearity, companion.m13225getFontHinting4e0Vf04())) {
            androidTextPaint.getFlags();
            androidTextPaint.setHinting(1);
        } else if (!TextMotion.Linearity.m13221equalsimpl0(linearity, companion.m13227getNone4e0Vf04())) {
            androidTextPaint.getFlags();
        } else {
            androidTextPaint.getFlags();
            androidTextPaint.setHinting(0);
        }
    }
}
