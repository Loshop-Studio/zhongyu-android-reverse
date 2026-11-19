package androidx.compose.p014ui.text.platform.extensions;

import android.graphics.Typeface;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.ScaleXSpan;
import androidx.compose.p014ui.graphics.Brush;
import androidx.compose.p014ui.graphics.ColorKt;
import androidx.compose.p014ui.graphics.ShaderBrush;
import androidx.compose.p014ui.graphics.Shadow;
import androidx.compose.p014ui.graphics.SolidColor;
import androidx.compose.p014ui.graphics.drawscope.DrawStyle;
import androidx.compose.p014ui.text.AnnotatedString;
import androidx.compose.p014ui.text.AnnotatedStringKt;
import androidx.compose.p014ui.text.Bullet;
import androidx.compose.p014ui.text.PlatformSpanStyle;
import androidx.compose.p014ui.text.SpanStyle;
import androidx.compose.p014ui.text.TextStyle;
import androidx.compose.p014ui.text.android.style.BaselineShiftSpan;
import androidx.compose.p014ui.text.android.style.FontFeatureSpan;
import androidx.compose.p014ui.text.android.style.LetterSpacingSpanEm;
import androidx.compose.p014ui.text.android.style.LetterSpacingSpanPx;
import androidx.compose.p014ui.text.android.style.LineHeightSpan;
import androidx.compose.p014ui.text.android.style.LineHeightStyleSpan;
import androidx.compose.p014ui.text.android.style.ShadowSpan;
import androidx.compose.p014ui.text.android.style.SkewXSpan;
import androidx.compose.p014ui.text.android.style.TextDecorationSpan;
import androidx.compose.p014ui.text.android.style.TypefaceSpan;
import androidx.compose.p014ui.text.font.FontFamily;
import androidx.compose.p014ui.text.font.FontStyle;
import androidx.compose.p014ui.text.font.FontSynthesis;
import androidx.compose.p014ui.text.font.FontWeight;
import androidx.compose.p014ui.text.intl.LocaleList;
import androidx.compose.p014ui.text.platform.style.CustomBulletSpan;
import androidx.compose.p014ui.text.platform.style.DrawStyleSpan;
import androidx.compose.p014ui.text.platform.style.ShaderBrushSpan;
import androidx.compose.p014ui.text.style.BaselineShift;
import androidx.compose.p014ui.text.style.LineHeightStyle;
import androidx.compose.p014ui.text.style.TextDecoration;
import androidx.compose.p014ui.text.style.TextGeometricTransform;
import androidx.compose.p014ui.text.style.TextIndent;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.p014ui.unit.TextUnit;
import androidx.compose.p014ui.unit.TextUnitKt;
import androidx.compose.p014ui.unit.TextUnitType;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9545q;
import p181hd.InterfaceC9546r;
import p211jd.AbstractC9719c;
import p309qc.C10786q;
import p310qd.AbstractC10797e0;
import p325rc.AbstractC10964p;
import p325rc.AbstractC10968r;

/* loaded from: classes2.dex */
public final class SpannableExtensions_androidKt {
    /* renamed from: createLetterSpacingSpan-eAf_CNQ, reason: not valid java name */
    private static final MetricAffectingSpan m33240createLetterSpacingSpaneAf_CNQ(long j10, Density density) {
        long jM33694getTypeUIouoOA = TextUnit.m33694getTypeUIouoOA(j10);
        TextUnitType.Companion companion = TextUnitType.Companion;
        if (TextUnitType.m33723equalsimpl0(jM33694getTypeUIouoOA, companion.m33728getSpUIouoOA())) {
            return new LetterSpacingSpanPx(density.mo27098toPxR2X_6o(j10));
        }
        if (TextUnitType.m33723equalsimpl0(jM33694getTypeUIouoOA, companion.m33727getEmUIouoOA())) {
            return new LetterSpacingSpanEm(TextUnit.m33695getValueimpl(j10));
        }
        return null;
    }

    public static final void flattenFontStylesAndApply(SpanStyle spanStyle, List<AnnotatedString.Range<SpanStyle>> list, InterfaceC9545q interfaceC9545q) {
        if (list.size() <= 1) {
            if (list.isEmpty()) {
                return;
            }
            interfaceC9545q.invoke(merge(spanStyle, list.get(0).getItem()), Integer.valueOf(list.get(0).getStart()), Integer.valueOf(list.get(0).getEnd()));
            return;
        }
        int size = list.size();
        int i10 = size * 2;
        int[] iArr = new int[i10];
        List<AnnotatedString.Range<SpanStyle>> list2 = list;
        int size2 = list2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            AnnotatedString.Range<SpanStyle> range = list.get(i11);
            iArr[i11] = range.getStart();
            iArr[i11 + size] = range.getEnd();
        }
        AbstractC10964p.m24003R(iArr);
        int iM24102s0 = AbstractC10968r.m24102s0(iArr);
        for (int i12 = 0; i12 < i10; i12++) {
            int i13 = iArr[i12];
            if (i13 != iM24102s0) {
                int size3 = list2.size();
                SpanStyle spanStyleMerge = spanStyle;
                for (int i14 = 0; i14 < size3; i14++) {
                    AnnotatedString.Range<SpanStyle> range2 = list.get(i14);
                    if (range2.getStart() != range2.getEnd() && AnnotatedStringKt.intersect(iM24102s0, i13, range2.getStart(), range2.getEnd())) {
                        spanStyleMerge = merge(spanStyleMerge, range2.getItem());
                    }
                }
                if (spanStyleMerge != null) {
                    interfaceC9545q.invoke(spanStyleMerge, Integer.valueOf(iM24102s0), Integer.valueOf(i13));
                }
                iM24102s0 = i13;
            }
        }
    }

    private static final boolean getNeedsLetterSpacingSpan(SpanStyle spanStyle) {
        long jM33694getTypeUIouoOA = TextUnit.m33694getTypeUIouoOA(spanStyle.m32911getLetterSpacingXSAIIZE());
        TextUnitType.Companion companion = TextUnitType.Companion;
        return TextUnitType.m33723equalsimpl0(jM33694getTypeUIouoOA, companion.m33728getSpUIouoOA()) || TextUnitType.m33723equalsimpl0(TextUnit.m33694getTypeUIouoOA(spanStyle.m32911getLetterSpacingXSAIIZE()), companion.m33727getEmUIouoOA());
    }

    private static final boolean hasFontAttributes(TextStyle textStyle) {
        return TextPaintExtensions_androidKt.hasFontAttributes(textStyle.toSpanStyle()) || textStyle.m32999getFontSynthesisZQGJjVo() != null;
    }

    private static final boolean isNonLinearFontScalingActive(Density density) {
        return ((double) density.getFontScale()) > 1.05d;
    }

    private static final SpanStyle merge(SpanStyle spanStyle, SpanStyle spanStyle2) {
        return spanStyle == null ? spanStyle2 : spanStyle.merge(spanStyle2);
    }

    /* renamed from: resolveBulletTextUnitToPx-o2QH7mI, reason: not valid java name */
    private static final float m33241resolveBulletTextUnitToPxo2QH7mI(long j10, float f10, Density density) {
        if (TextUnit.m33692equalsimpl0(j10, TextUnit.Companion.m33706getUnspecifiedXSAIIZE())) {
            return f10;
        }
        long jM33694getTypeUIouoOA = TextUnit.m33694getTypeUIouoOA(j10);
        TextUnitType.Companion companion = TextUnitType.Companion;
        if (TextUnitType.m33723equalsimpl0(jM33694getTypeUIouoOA, companion.m33728getSpUIouoOA())) {
            return density.mo27098toPxR2X_6o(j10);
        }
        if (TextUnitType.m33723equalsimpl0(jM33694getTypeUIouoOA, companion.m33727getEmUIouoOA())) {
            return TextUnit.m33695getValueimpl(j10) * f10;
        }
        return Float.NaN;
    }

    /* renamed from: resolveLineHeightInPx-o2QH7mI, reason: not valid java name */
    private static final float m33242resolveLineHeightInPxo2QH7mI(long j10, float f10, Density density) {
        float fM33695getValueimpl;
        long jM33694getTypeUIouoOA = TextUnit.m33694getTypeUIouoOA(j10);
        TextUnitType.Companion companion = TextUnitType.Companion;
        if (TextUnitType.m33723equalsimpl0(jM33694getTypeUIouoOA, companion.m33728getSpUIouoOA())) {
            if (!isNonLinearFontScalingActive(density)) {
                return density.mo27098toPxR2X_6o(j10);
            }
            fM33695getValueimpl = TextUnit.m33695getValueimpl(j10) / TextUnit.m33695getValueimpl(density.mo27102toSpkPz2Gy4(f10));
        } else {
            if (!TextUnitType.m33723equalsimpl0(jM33694getTypeUIouoOA, companion.m33727getEmUIouoOA())) {
                return Float.NaN;
            }
            fM33695getValueimpl = TextUnit.m33695getValueimpl(j10);
        }
        return fM33695getValueimpl * f10;
    }

    /* renamed from: setBackground-RPmYEkk, reason: not valid java name */
    public static final void m33243setBackgroundRPmYEkk(Spannable spannable, long j10, int i10, int i11) {
        if (j10 != 16) {
            setSpan(spannable, new BackgroundColorSpan(ColorKt.m30932toArgb8_81llA(j10)), i10, i11);
        }
    }

    /* renamed from: setBaselineShift-0ocSgnM, reason: not valid java name */
    private static final void m33244setBaselineShift0ocSgnM(Spannable spannable, BaselineShift baselineShift, int i10, int i11) {
        if (baselineShift != null) {
            setSpan(spannable, new BaselineShiftSpan(baselineShift.m33263unboximpl()), i10, i11);
        }
    }

    private static final void setBrush(Spannable spannable, Brush brush, float f10, int i10, int i11) {
        if (brush != null) {
            if (brush instanceof SolidColor) {
                m33245setColorRPmYEkk(spannable, ((SolidColor) brush).m31213getValue0d7_KjU(), i10, i11);
            } else if (brush instanceof ShaderBrush) {
                setSpan(spannable, new ShaderBrushSpan((ShaderBrush) brush, f10), i10, i11);
            }
        }
    }

    public static final void setBulletSpans(Spannable spannable, List<? extends AnnotatedString.Range<? extends AnnotatedString.Annotation>> list, float f10, Density density, TextIndent textIndent) {
        Density density2 = density;
        float fM33695getValueimpl = 0.0f;
        if (textIndent != null) {
            long jM33694getTypeUIouoOA = TextUnit.m33694getTypeUIouoOA(textIndent.m33409getFirstLineXSAIIZE());
            TextUnitType.Companion companion = TextUnitType.Companion;
            if (TextUnitType.m33723equalsimpl0(jM33694getTypeUIouoOA, companion.m33728getSpUIouoOA())) {
                fM33695getValueimpl = density2.mo27098toPxR2X_6o(textIndent.m33409getFirstLineXSAIIZE());
            } else if (TextUnitType.m33723equalsimpl0(jM33694getTypeUIouoOA, companion.m33727getEmUIouoOA())) {
                fM33695getValueimpl = TextUnit.m33695getValueimpl(textIndent.m33409getFirstLineXSAIIZE()) * f10;
            }
        }
        float f11 = fM33695getValueimpl;
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            AnnotatedString.Range<? extends AnnotatedString.Annotation> range = list.get(i10);
            AnnotatedString.Annotation item = range.getItem();
            Bullet bullet = item instanceof Bullet ? (Bullet) item : null;
            if (bullet != null) {
                float fM33241resolveBulletTextUnitToPxo2QH7mI = m33241resolveBulletTextUnitToPxo2QH7mI(bullet.m32802getSizeXSAIIZE(), f10, density2);
                float fM33241resolveBulletTextUnitToPxo2QH7mI2 = m33241resolveBulletTextUnitToPxo2QH7mI(bullet.m32801getPaddingXSAIIZE(), f10, density2);
                if (!Float.isNaN(fM33241resolveBulletTextUnitToPxo2QH7mI) && !Float.isNaN(fM33241resolveBulletTextUnitToPxo2QH7mI2)) {
                    setSpan(spannable, new CustomBulletSpan(bullet.getShape(), fM33241resolveBulletTextUnitToPxo2QH7mI, fM33241resolveBulletTextUnitToPxo2QH7mI, fM33241resolveBulletTextUnitToPxo2QH7mI2, bullet.getBrush(), bullet.getAlpha(), bullet.getDrawStyle(), density2, f11), range.getStart(), range.getEnd());
                }
            }
            i10++;
            density2 = density;
        }
    }

    /* renamed from: setColor-RPmYEkk, reason: not valid java name */
    public static final void m33245setColorRPmYEkk(Spannable spannable, long j10, int i10, int i11) {
        if (j10 != 16) {
            setSpan(spannable, new ForegroundColorSpan(ColorKt.m30932toArgb8_81llA(j10)), i10, i11);
        }
    }

    private static final void setDrawStyle(Spannable spannable, DrawStyle drawStyle, int i10, int i11) {
        if (drawStyle != null) {
            setSpan(spannable, new DrawStyleSpan(drawStyle), i10, i11);
        }
    }

    private static final void setFontAttributes(final Spannable spannable, TextStyle textStyle, List<? extends AnnotatedString.Range<? extends AnnotatedString.Annotation>> list, final InterfaceC9546r interfaceC9546r) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            AnnotatedString.Range<? extends AnnotatedString.Annotation> range = list.get(i10);
            if ((range.getItem() instanceof SpanStyle) && (TextPaintExtensions_androidKt.hasFontAttributes((SpanStyle) range.getItem()) || ((SpanStyle) range.getItem()).m32910getFontSynthesisZQGJjVo() != null)) {
                AbstractC9979u.m20292e(range, "null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.SpanStyle>");
                arrayList.add(range);
            }
        }
        flattenFontStylesAndApply(hasFontAttributes(textStyle) ? new SpanStyle(0L, 0L, textStyle.getFontWeight(), textStyle.m32998getFontStyle4Lr2A7w(), textStyle.m32999getFontSynthesisZQGJjVo(), textStyle.getFontFamily(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65475, (AbstractC9972n) null) : null, arrayList, new InterfaceC9545q() { // from class: androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt.setFontAttributes.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // p181hd.InterfaceC9545q
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((SpanStyle) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
                return C10786q.f26013a;
            }

            public final void invoke(SpanStyle spanStyle, int i11, int i12) {
                Spannable spannable2 = spannable;
                InterfaceC9546r interfaceC9546r2 = interfaceC9546r;
                FontFamily fontFamily = spanStyle.getFontFamily();
                FontWeight fontWeight = spanStyle.getFontWeight();
                if (fontWeight == null) {
                    fontWeight = FontWeight.Companion.getNormal();
                }
                FontStyle fontStyleM32909getFontStyle4Lr2A7w = spanStyle.m32909getFontStyle4Lr2A7w();
                FontStyle fontStyleM33074boximpl = FontStyle.m33074boximpl(fontStyleM32909getFontStyle4Lr2A7w != null ? fontStyleM32909getFontStyle4Lr2A7w.m33080unboximpl() : FontStyle.Companion.m33084getNormal_LCdwA());
                FontSynthesis fontSynthesisM32910getFontSynthesisZQGJjVo = spanStyle.m32910getFontSynthesisZQGJjVo();
                spannable2.setSpan(new TypefaceSpan((Typeface) interfaceC9546r2.invoke(fontFamily, fontWeight, fontStyleM33074boximpl, FontSynthesis.m33085boximpl(fontSynthesisM32910getFontSynthesisZQGJjVo != null ? fontSynthesisM32910getFontSynthesisZQGJjVo.m33093unboximpl() : FontSynthesis.Companion.m33094getAllGVVA2EU()))), i11, i12, 33);
            }
        });
    }

    private static final void setFontFeatureSettings(Spannable spannable, String str, int i10, int i11) {
        if (str != null) {
            setSpan(spannable, new FontFeatureSpan(str), i10, i11);
        }
    }

    /* renamed from: setFontSize-KmRG4DE, reason: not valid java name */
    public static final void m33246setFontSizeKmRG4DE(Spannable spannable, long j10, Density density, int i10, int i11) {
        long jM33694getTypeUIouoOA = TextUnit.m33694getTypeUIouoOA(j10);
        TextUnitType.Companion companion = TextUnitType.Companion;
        if (TextUnitType.m33723equalsimpl0(jM33694getTypeUIouoOA, companion.m33728getSpUIouoOA())) {
            setSpan(spannable, new AbsoluteSizeSpan(AbstractC9719c.m19282d(density.mo27098toPxR2X_6o(j10)), false), i10, i11);
        } else if (TextUnitType.m33723equalsimpl0(jM33694getTypeUIouoOA, companion.m33727getEmUIouoOA())) {
            setSpan(spannable, new RelativeSizeSpan(TextUnit.m33695getValueimpl(j10)), i10, i11);
        }
    }

    private static final void setGeometricTransform(Spannable spannable, TextGeometricTransform textGeometricTransform, int i10, int i11) {
        if (textGeometricTransform != null) {
            setSpan(spannable, new ScaleXSpan(textGeometricTransform.getScaleX()), i10, i11);
            setSpan(spannable, new SkewXSpan(textGeometricTransform.getSkewX()), i10, i11);
        }
    }

    /* renamed from: setLineHeight-KmRG4DE, reason: not valid java name */
    public static final void m33247setLineHeightKmRG4DE(Spannable spannable, long j10, float f10, Density density, LineHeightStyle lineHeightStyle) {
        float fM33242resolveLineHeightInPxo2QH7mI = m33242resolveLineHeightInPxo2QH7mI(j10, f10, density);
        if (Float.isNaN(fM33242resolveLineHeightInPxo2QH7mI)) {
            return;
        }
        setSpan(spannable, new LineHeightStyleSpan(fM33242resolveLineHeightInPxo2QH7mI, 0, (spannable.length() == 0 || AbstractC10797e0.m23171h1(spannable) == '\n') ? spannable.length() + 1 : spannable.length(), LineHeightStyle.Trim.m33370isTrimFirstLineTopimpl$ui_text_release(lineHeightStyle.m33344getTrimEVpEnUU()), LineHeightStyle.Trim.m33371isTrimLastLineBottomimpl$ui_text_release(lineHeightStyle.m33344getTrimEVpEnUU()), lineHeightStyle.m33342getAlignmentPIaL0Z0(), LineHeightStyle.Mode.m33359equalsimpl0(lineHeightStyle.m33343getModelzQqcRY(), LineHeightStyle.Mode.Companion.m33364getMinimumlzQqcRY())), 0, spannable.length());
    }

    /* renamed from: setLineHeight-r9BaKPg, reason: not valid java name */
    public static final void m33248setLineHeightr9BaKPg(Spannable spannable, long j10, float f10, Density density) {
        float fM33242resolveLineHeightInPxo2QH7mI = m33242resolveLineHeightInPxo2QH7mI(j10, f10, density);
        if (Float.isNaN(fM33242resolveLineHeightInPxo2QH7mI)) {
            return;
        }
        setSpan(spannable, new LineHeightSpan(fM33242resolveLineHeightInPxo2QH7mI), 0, spannable.length());
    }

    public static final void setLocaleList(Spannable spannable, LocaleList localeList, int i10, int i11) {
        if (localeList != null) {
            setSpan(spannable, LocaleListHelperMethods.INSTANCE.localeSpan(localeList), i10, i11);
        }
    }

    private static final void setShadow(Spannable spannable, Shadow shadow, int i10, int i11) {
        if (shadow != null) {
            setSpan(spannable, new ShadowSpan(ColorKt.m30932toArgb8_81llA(shadow.m31203getColor0d7_KjU()), Float.intBitsToFloat((int) (shadow.m31204getOffsetF1C5BW0() >> 32)), Float.intBitsToFloat((int) (shadow.m31204getOffsetF1C5BW0() & 4294967295L)), TextPaintExtensions_androidKt.correctBlurRadius(shadow.getBlurRadius())), i10, i11);
        }
    }

    public static final void setSpan(Spannable spannable, Object obj, int i10, int i11) {
        spannable.setSpan(obj, i10, i11, 33);
    }

    private static final void setSpanStyle(Spannable spannable, SpanStyle spanStyle, int i10, int i11, Density density) {
        m33244setBaselineShift0ocSgnM(spannable, spanStyle.m32906getBaselineShift5SSeXJ0(), i10, i11);
        m33245setColorRPmYEkk(spannable, spanStyle.m32907getColor0d7_KjU(), i10, i11);
        setBrush(spannable, spanStyle.getBrush(), spanStyle.getAlpha(), i10, i11);
        setTextDecoration(spannable, spanStyle.getTextDecoration(), i10, i11);
        m33246setFontSizeKmRG4DE(spannable, spanStyle.m32908getFontSizeXSAIIZE(), density, i10, i11);
        setFontFeatureSettings(spannable, spanStyle.getFontFeatureSettings(), i10, i11);
        setGeometricTransform(spannable, spanStyle.getTextGeometricTransform(), i10, i11);
        setLocaleList(spannable, spanStyle.getLocaleList(), i10, i11);
        m33243setBackgroundRPmYEkk(spannable, spanStyle.m32905getBackground0d7_KjU(), i10, i11);
        setShadow(spannable, spanStyle.getShadow(), i10, i11);
        setDrawStyle(spannable, spanStyle.getDrawStyle(), i10, i11);
    }

    public static final void setSpanStyles(Spannable spannable, TextStyle textStyle, List<? extends AnnotatedString.Range<? extends AnnotatedString.Annotation>> list, Density density, InterfaceC9546r interfaceC9546r) {
        MetricAffectingSpan metricAffectingSpanM33240createLetterSpacingSpaneAf_CNQ;
        setFontAttributes(spannable, textStyle, list, interfaceC9546r);
        List<? extends AnnotatedString.Range<? extends AnnotatedString.Annotation>> list2 = list;
        int size = list2.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            AnnotatedString.Range<? extends AnnotatedString.Annotation> range = list.get(i10);
            if (range.getItem() instanceof SpanStyle) {
                int start = range.getStart();
                int end = range.getEnd();
                if (start >= 0 && start < spannable.length() && end > start && end <= spannable.length()) {
                    setSpanStyle(spannable, (SpanStyle) range.getItem(), start, end, density);
                    if (getNeedsLetterSpacingSpan((SpanStyle) range.getItem())) {
                        z10 = true;
                    }
                }
            }
        }
        if (z10) {
            int size2 = list2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                AnnotatedString.Range<? extends AnnotatedString.Annotation> range2 = list.get(i11);
                AnnotatedString.Annotation item = range2.getItem();
                if (item instanceof SpanStyle) {
                    int start2 = range2.getStart();
                    int end2 = range2.getEnd();
                    if (start2 >= 0 && start2 < spannable.length() && end2 > start2 && end2 <= spannable.length() && (metricAffectingSpanM33240createLetterSpacingSpaneAf_CNQ = m33240createLetterSpacingSpaneAf_CNQ(((SpanStyle) item).m32911getLetterSpacingXSAIIZE(), density)) != null) {
                        setSpan(spannable, metricAffectingSpanM33240createLetterSpacingSpaneAf_CNQ, start2, end2);
                    }
                }
            }
        }
    }

    public static final void setTextDecoration(Spannable spannable, TextDecoration textDecoration, int i10, int i11) {
        if (textDecoration != null) {
            TextDecoration.Companion companion = TextDecoration.Companion;
            setSpan(spannable, new TextDecorationSpan(textDecoration.contains(companion.getUnderline()), textDecoration.contains(companion.getLineThrough())), i10, i11);
        }
    }

    public static final void setTextIndent(Spannable spannable, TextIndent textIndent, float f10, Density density) {
        if (textIndent != null) {
            if ((TextUnit.m33692equalsimpl0(textIndent.m33409getFirstLineXSAIIZE(), TextUnitKt.getSp(0)) && TextUnit.m33692equalsimpl0(textIndent.m33410getRestLineXSAIIZE(), TextUnitKt.getSp(0))) || TextUnit.m33693getRawTypeimpl(textIndent.m33409getFirstLineXSAIIZE()) == 0 || TextUnit.m33693getRawTypeimpl(textIndent.m33410getRestLineXSAIIZE()) == 0) {
                return;
            }
            long jM33694getTypeUIouoOA = TextUnit.m33694getTypeUIouoOA(textIndent.m33409getFirstLineXSAIIZE());
            TextUnitType.Companion companion = TextUnitType.Companion;
            float fM33695getValueimpl = 0.0f;
            float fMo27098toPxR2X_6o = TextUnitType.m33723equalsimpl0(jM33694getTypeUIouoOA, companion.m33728getSpUIouoOA()) ? density.mo27098toPxR2X_6o(textIndent.m33409getFirstLineXSAIIZE()) : TextUnitType.m33723equalsimpl0(jM33694getTypeUIouoOA, companion.m33727getEmUIouoOA()) ? TextUnit.m33695getValueimpl(textIndent.m33409getFirstLineXSAIIZE()) * f10 : 0.0f;
            long jM33694getTypeUIouoOA2 = TextUnit.m33694getTypeUIouoOA(textIndent.m33410getRestLineXSAIIZE());
            if (TextUnitType.m33723equalsimpl0(jM33694getTypeUIouoOA2, companion.m33728getSpUIouoOA())) {
                fM33695getValueimpl = density.mo27098toPxR2X_6o(textIndent.m33410getRestLineXSAIIZE());
            } else if (TextUnitType.m33723equalsimpl0(jM33694getTypeUIouoOA2, companion.m33727getEmUIouoOA())) {
                fM33695getValueimpl = TextUnit.m33695getValueimpl(textIndent.m33410getRestLineXSAIIZE()) * f10;
            }
            setSpan(spannable, new LeadingMarginSpan.Standard((int) Math.ceil(fMo27098toPxR2X_6o), (int) Math.ceil(fM33695getValueimpl)), 0, spannable.length());
        }
    }
}
