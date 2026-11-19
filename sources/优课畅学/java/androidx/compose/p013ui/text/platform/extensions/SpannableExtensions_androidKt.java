package androidx.compose.p013ui.text.platform.extensions;

import android.graphics.Typeface;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.ScaleXSpan;
import androidx.compose.p013ui.graphics.Brush;
import androidx.compose.p013ui.graphics.ColorKt;
import androidx.compose.p013ui.graphics.ShaderBrush;
import androidx.compose.p013ui.graphics.Shadow;
import androidx.compose.p013ui.graphics.SolidColor;
import androidx.compose.p013ui.graphics.drawscope.DrawStyle;
import androidx.compose.p013ui.text.AnnotatedString;
import androidx.compose.p013ui.text.AnnotatedStringKt;
import androidx.compose.p013ui.text.Bullet;
import androidx.compose.p013ui.text.PlatformSpanStyle;
import androidx.compose.p013ui.text.SpanStyle;
import androidx.compose.p013ui.text.TextStyle;
import androidx.compose.p013ui.text.android.style.BaselineShiftSpan;
import androidx.compose.p013ui.text.android.style.FontFeatureSpan;
import androidx.compose.p013ui.text.android.style.LetterSpacingSpanEm;
import androidx.compose.p013ui.text.android.style.LetterSpacingSpanPx;
import androidx.compose.p013ui.text.android.style.LineHeightSpan;
import androidx.compose.p013ui.text.android.style.LineHeightStyleSpan;
import androidx.compose.p013ui.text.android.style.ShadowSpan;
import androidx.compose.p013ui.text.android.style.SkewXSpan;
import androidx.compose.p013ui.text.android.style.TextDecorationSpan;
import androidx.compose.p013ui.text.android.style.TypefaceSpan;
import androidx.compose.p013ui.text.font.FontFamily;
import androidx.compose.p013ui.text.font.FontStyle;
import androidx.compose.p013ui.text.font.FontSynthesis;
import androidx.compose.p013ui.text.font.FontWeight;
import androidx.compose.p013ui.text.intl.LocaleList;
import androidx.compose.p013ui.text.platform.style.CustomBulletSpan;
import androidx.compose.p013ui.text.platform.style.DrawStyleSpan;
import androidx.compose.p013ui.text.platform.style.ShaderBrushSpan;
import androidx.compose.p013ui.text.style.BaselineShift;
import androidx.compose.p013ui.text.style.LineHeightStyle;
import androidx.compose.p013ui.text.style.TextDecoration;
import androidx.compose.p013ui.text.style.TextGeometricTransform;
import androidx.compose.p013ui.text.style.TextIndent;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.p013ui.unit.TextUnit;
import androidx.compose.p013ui.unit.TextUnitKt;
import androidx.compose.p013ui.unit.TextUnitType;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p113g8.AbstractC8665e0;
import p123h7.C8736p;
import p134i7.AbstractC8797p;
import p134i7.AbstractC8801r;
import p300x7.InterfaceC10575q;
import p300x7.InterfaceC10576r;
import p322z7.AbstractC10729c;

/* loaded from: classes2.dex */
public final class SpannableExtensions_androidKt {
    /* renamed from: createLetterSpacingSpan-eAf_CNQ, reason: not valid java name */
    private static final MetricAffectingSpan m26638createLetterSpacingSpaneAf_CNQ(long j10, Density density) {
        long jM27092getTypeUIouoOA = TextUnit.m27092getTypeUIouoOA(j10);
        TextUnitType.Companion companion = TextUnitType.Companion;
        if (TextUnitType.m27121equalsimpl0(jM27092getTypeUIouoOA, companion.m27126getSpUIouoOA())) {
            return new LetterSpacingSpanPx(density.mo20496toPxR2X_6o(j10));
        }
        if (TextUnitType.m27121equalsimpl0(jM27092getTypeUIouoOA, companion.m27125getEmUIouoOA())) {
            return new LetterSpacingSpanEm(TextUnit.m27093getValueimpl(j10));
        }
        return null;
    }

    public static final void flattenFontStylesAndApply(SpanStyle spanStyle, List<AnnotatedString.Range<SpanStyle>> list, InterfaceC10575q interfaceC10575q) {
        if (list.size() <= 1) {
            if (list.isEmpty()) {
                return;
            }
            interfaceC10575q.invoke(merge(spanStyle, list.get(0).getItem()), Integer.valueOf(list.get(0).getStart()), Integer.valueOf(list.get(0).getEnd()));
            return;
        }
        int size = list.size();
        int i10 = size * 2;
        int[] iArr = new int[i10];
        int size2 = list.size();
        for (int i11 = 0; i11 < size2; i11++) {
            AnnotatedString.Range<SpanStyle> range = list.get(i11);
            iArr[i11] = range.getStart();
            iArr[i11 + size] = range.getEnd();
        }
        AbstractC8797p.m14629S(iArr);
        int iM14733t0 = AbstractC8801r.m14733t0(iArr);
        for (int i12 = 0; i12 < i10; i12++) {
            int i13 = iArr[i12];
            if (i13 != iM14733t0) {
                int size3 = list.size();
                SpanStyle spanStyleMerge = spanStyle;
                for (int i14 = 0; i14 < size3; i14++) {
                    AnnotatedString.Range<SpanStyle> range2 = list.get(i14);
                    if (range2.getStart() != range2.getEnd() && AnnotatedStringKt.intersect(iM14733t0, i13, range2.getStart(), range2.getEnd())) {
                        spanStyleMerge = merge(spanStyleMerge, range2.getItem());
                    }
                }
                if (spanStyleMerge != null) {
                    interfaceC10575q.invoke(spanStyleMerge, Integer.valueOf(iM14733t0), Integer.valueOf(i13));
                }
                iM14733t0 = i13;
            }
        }
    }

    private static final boolean getNeedsLetterSpacingSpan(SpanStyle spanStyle) {
        long jM27092getTypeUIouoOA = TextUnit.m27092getTypeUIouoOA(spanStyle.m26309getLetterSpacingXSAIIZE());
        TextUnitType.Companion companion = TextUnitType.Companion;
        return TextUnitType.m27121equalsimpl0(jM27092getTypeUIouoOA, companion.m27126getSpUIouoOA()) || TextUnitType.m27121equalsimpl0(TextUnit.m27092getTypeUIouoOA(spanStyle.m26309getLetterSpacingXSAIIZE()), companion.m27125getEmUIouoOA());
    }

    private static final boolean hasFontAttributes(TextStyle textStyle) {
        return TextPaintExtensions_androidKt.hasFontAttributes(textStyle.toSpanStyle()) || textStyle.m26397getFontSynthesisZQGJjVo() != null;
    }

    private static final boolean isNonLinearFontScalingActive(Density density) {
        return ((double) density.getFontScale()) > 1.05d;
    }

    private static final SpanStyle merge(SpanStyle spanStyle, SpanStyle spanStyle2) {
        return spanStyle == null ? spanStyle2 : spanStyle.merge(spanStyle2);
    }

    /* renamed from: resolveBulletTextUnitToPx-o2QH7mI, reason: not valid java name */
    private static final float m26639resolveBulletTextUnitToPxo2QH7mI(long j10, float f10, Density density) {
        if (TextUnit.m27090equalsimpl0(j10, TextUnit.Companion.m27104getUnspecifiedXSAIIZE())) {
            return f10;
        }
        long jM27092getTypeUIouoOA = TextUnit.m27092getTypeUIouoOA(j10);
        TextUnitType.Companion companion = TextUnitType.Companion;
        if (TextUnitType.m27121equalsimpl0(jM27092getTypeUIouoOA, companion.m27126getSpUIouoOA())) {
            return density.mo20496toPxR2X_6o(j10);
        }
        if (TextUnitType.m27121equalsimpl0(jM27092getTypeUIouoOA, companion.m27125getEmUIouoOA())) {
            return TextUnit.m27093getValueimpl(j10) * f10;
        }
        return Float.NaN;
    }

    /* renamed from: resolveLineHeightInPx-o2QH7mI, reason: not valid java name */
    private static final float m26640resolveLineHeightInPxo2QH7mI(long j10, float f10, Density density) {
        float fM27093getValueimpl;
        long jM27092getTypeUIouoOA = TextUnit.m27092getTypeUIouoOA(j10);
        TextUnitType.Companion companion = TextUnitType.Companion;
        if (TextUnitType.m27121equalsimpl0(jM27092getTypeUIouoOA, companion.m27126getSpUIouoOA())) {
            if (!isNonLinearFontScalingActive(density)) {
                return density.mo20496toPxR2X_6o(j10);
            }
            fM27093getValueimpl = TextUnit.m27093getValueimpl(j10) / TextUnit.m27093getValueimpl(density.mo20500toSpkPz2Gy4(f10));
        } else {
            if (!TextUnitType.m27121equalsimpl0(jM27092getTypeUIouoOA, companion.m27125getEmUIouoOA())) {
                return Float.NaN;
            }
            fM27093getValueimpl = TextUnit.m27093getValueimpl(j10);
        }
        return fM27093getValueimpl * f10;
    }

    /* renamed from: setBackground-RPmYEkk, reason: not valid java name */
    public static final void m26641setBackgroundRPmYEkk(Spannable spannable, long j10, int i10, int i11) {
        if (j10 != 16) {
            setSpan(spannable, new BackgroundColorSpan(ColorKt.m24330toArgb8_81llA(j10)), i10, i11);
        }
    }

    /* renamed from: setBaselineShift-0ocSgnM, reason: not valid java name */
    private static final void m26642setBaselineShift0ocSgnM(Spannable spannable, BaselineShift baselineShift, int i10, int i11) {
        if (baselineShift != null) {
            setSpan(spannable, new BaselineShiftSpan(baselineShift.m26661unboximpl()), i10, i11);
        }
    }

    private static final void setBrush(Spannable spannable, Brush brush, float f10, int i10, int i11) {
        if (brush != null) {
            if (brush instanceof SolidColor) {
                m26643setColorRPmYEkk(spannable, ((SolidColor) brush).m24611getValue0d7_KjU(), i10, i11);
            } else if (brush instanceof ShaderBrush) {
                setSpan(spannable, new ShaderBrushSpan((ShaderBrush) brush, f10), i10, i11);
            }
        }
    }

    public static final void setBulletSpans(Spannable spannable, List<? extends AnnotatedString.Range<? extends AnnotatedString.Annotation>> list, float f10, Density density, TextIndent textIndent) {
        Density density2 = density;
        float fM27093getValueimpl = 0.0f;
        if (textIndent != null) {
            long jM27092getTypeUIouoOA = TextUnit.m27092getTypeUIouoOA(textIndent.m26807getFirstLineXSAIIZE());
            TextUnitType.Companion companion = TextUnitType.Companion;
            if (TextUnitType.m27121equalsimpl0(jM27092getTypeUIouoOA, companion.m27126getSpUIouoOA())) {
                fM27093getValueimpl = density2.mo20496toPxR2X_6o(textIndent.m26807getFirstLineXSAIIZE());
            } else if (TextUnitType.m27121equalsimpl0(jM27092getTypeUIouoOA, companion.m27125getEmUIouoOA())) {
                fM27093getValueimpl = TextUnit.m27093getValueimpl(textIndent.m26807getFirstLineXSAIIZE()) * f10;
            }
        }
        float f11 = fM27093getValueimpl;
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            AnnotatedString.Range<? extends AnnotatedString.Annotation> range = list.get(i10);
            AnnotatedString.Annotation item = range.getItem();
            Bullet bullet = item instanceof Bullet ? (Bullet) item : null;
            if (bullet != null) {
                float fM26639resolveBulletTextUnitToPxo2QH7mI = m26639resolveBulletTextUnitToPxo2QH7mI(bullet.m26200getSizeXSAIIZE(), f10, density2);
                float fM26639resolveBulletTextUnitToPxo2QH7mI2 = m26639resolveBulletTextUnitToPxo2QH7mI(bullet.m26199getPaddingXSAIIZE(), f10, density2);
                if (!Float.isNaN(fM26639resolveBulletTextUnitToPxo2QH7mI) && !Float.isNaN(fM26639resolveBulletTextUnitToPxo2QH7mI2)) {
                    setSpan(spannable, new CustomBulletSpan(bullet.getShape(), fM26639resolveBulletTextUnitToPxo2QH7mI, fM26639resolveBulletTextUnitToPxo2QH7mI, fM26639resolveBulletTextUnitToPxo2QH7mI2, bullet.getBrush(), bullet.getAlpha(), bullet.getDrawStyle(), density2, f11), range.getStart(), range.getEnd());
                }
            }
            i10++;
            density2 = density;
        }
    }

    /* renamed from: setColor-RPmYEkk, reason: not valid java name */
    public static final void m26643setColorRPmYEkk(Spannable spannable, long j10, int i10, int i11) {
        if (j10 != 16) {
            setSpan(spannable, new ForegroundColorSpan(ColorKt.m24330toArgb8_81llA(j10)), i10, i11);
        }
    }

    private static final void setDrawStyle(Spannable spannable, DrawStyle drawStyle, int i10, int i11) {
        if (drawStyle != null) {
            setSpan(spannable, new DrawStyleSpan(drawStyle), i10, i11);
        }
    }

    private static final void setFontAttributes(final Spannable spannable, TextStyle textStyle, List<? extends AnnotatedString.Range<? extends AnnotatedString.Annotation>> list, final InterfaceC10576r interfaceC10576r) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            AnnotatedString.Range<? extends AnnotatedString.Annotation> range = list.get(i10);
            if ((range.getItem() instanceof SpanStyle) && (TextPaintExtensions_androidKt.hasFontAttributes((SpanStyle) range.getItem()) || ((SpanStyle) range.getItem()).m26308getFontSynthesisZQGJjVo() != null)) {
                AbstractC9133u.m16131e(range, "null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.SpanStyle>");
                arrayList.add(range);
            }
        }
        flattenFontStylesAndApply(hasFontAttributes(textStyle) ? new SpanStyle(0L, 0L, textStyle.getFontWeight(), textStyle.m26396getFontStyle4Lr2A7w(), textStyle.m26397getFontSynthesisZQGJjVo(), textStyle.getFontFamily(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65475, (AbstractC9126n) null) : null, arrayList, new InterfaceC10575q() { // from class: androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt.setFontAttributes.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // p300x7.InterfaceC10575q
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((SpanStyle) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
                return C8736p.f16368a;
            }

            public final void invoke(SpanStyle spanStyle, int i11, int i12) {
                Spannable spannable2 = spannable;
                InterfaceC10576r interfaceC10576r2 = interfaceC10576r;
                FontFamily fontFamily = spanStyle.getFontFamily();
                FontWeight fontWeight = spanStyle.getFontWeight();
                if (fontWeight == null) {
                    fontWeight = FontWeight.Companion.getNormal();
                }
                FontStyle fontStyleM26307getFontStyle4Lr2A7w = spanStyle.m26307getFontStyle4Lr2A7w();
                FontStyle fontStyleM26472boximpl = FontStyle.m26472boximpl(fontStyleM26307getFontStyle4Lr2A7w != null ? fontStyleM26307getFontStyle4Lr2A7w.m26478unboximpl() : FontStyle.Companion.m26482getNormal_LCdwA());
                FontSynthesis fontSynthesisM26308getFontSynthesisZQGJjVo = spanStyle.m26308getFontSynthesisZQGJjVo();
                spannable2.setSpan(new TypefaceSpan((Typeface) interfaceC10576r2.invoke(fontFamily, fontWeight, fontStyleM26472boximpl, FontSynthesis.m26483boximpl(fontSynthesisM26308getFontSynthesisZQGJjVo != null ? fontSynthesisM26308getFontSynthesisZQGJjVo.m26491unboximpl() : FontSynthesis.Companion.m26492getAllGVVA2EU()))), i11, i12, 33);
            }
        });
    }

    private static final void setFontFeatureSettings(Spannable spannable, String str, int i10, int i11) {
        if (str != null) {
            setSpan(spannable, new FontFeatureSpan(str), i10, i11);
        }
    }

    /* renamed from: setFontSize-KmRG4DE, reason: not valid java name */
    public static final void m26644setFontSizeKmRG4DE(Spannable spannable, long j10, Density density, int i10, int i11) {
        long jM27092getTypeUIouoOA = TextUnit.m27092getTypeUIouoOA(j10);
        TextUnitType.Companion companion = TextUnitType.Companion;
        if (TextUnitType.m27121equalsimpl0(jM27092getTypeUIouoOA, companion.m27126getSpUIouoOA())) {
            setSpan(spannable, new AbsoluteSizeSpan(AbstractC10729c.m20035d(density.mo20496toPxR2X_6o(j10)), false), i10, i11);
        } else if (TextUnitType.m27121equalsimpl0(jM27092getTypeUIouoOA, companion.m27125getEmUIouoOA())) {
            setSpan(spannable, new RelativeSizeSpan(TextUnit.m27093getValueimpl(j10)), i10, i11);
        }
    }

    private static final void setGeometricTransform(Spannable spannable, TextGeometricTransform textGeometricTransform, int i10, int i11) {
        if (textGeometricTransform != null) {
            setSpan(spannable, new ScaleXSpan(textGeometricTransform.getScaleX()), i10, i11);
            setSpan(spannable, new SkewXSpan(textGeometricTransform.getSkewX()), i10, i11);
        }
    }

    /* renamed from: setLineHeight-KmRG4DE, reason: not valid java name */
    public static final void m26645setLineHeightKmRG4DE(Spannable spannable, long j10, float f10, Density density, LineHeightStyle lineHeightStyle) {
        float fM26640resolveLineHeightInPxo2QH7mI = m26640resolveLineHeightInPxo2QH7mI(j10, f10, density);
        if (Float.isNaN(fM26640resolveLineHeightInPxo2QH7mI)) {
            return;
        }
        setSpan(spannable, new LineHeightStyleSpan(fM26640resolveLineHeightInPxo2QH7mI, 0, (spannable.length() == 0 || AbstractC8665e0.m14032Z0(spannable) == '\n') ? spannable.length() + 1 : spannable.length(), LineHeightStyle.Trim.m26768isTrimFirstLineTopimpl$ui_text_release(lineHeightStyle.m26742getTrimEVpEnUU()), LineHeightStyle.Trim.m26769isTrimLastLineBottomimpl$ui_text_release(lineHeightStyle.m26742getTrimEVpEnUU()), lineHeightStyle.m26740getAlignmentPIaL0Z0(), LineHeightStyle.Mode.m26757equalsimpl0(lineHeightStyle.m26741getModelzQqcRY(), LineHeightStyle.Mode.Companion.m26762getMinimumlzQqcRY())), 0, spannable.length());
    }

    /* renamed from: setLineHeight-r9BaKPg, reason: not valid java name */
    public static final void m26646setLineHeightr9BaKPg(Spannable spannable, long j10, float f10, Density density) {
        float fM26640resolveLineHeightInPxo2QH7mI = m26640resolveLineHeightInPxo2QH7mI(j10, f10, density);
        if (Float.isNaN(fM26640resolveLineHeightInPxo2QH7mI)) {
            return;
        }
        setSpan(spannable, new LineHeightSpan(fM26640resolveLineHeightInPxo2QH7mI), 0, spannable.length());
    }

    public static final void setLocaleList(Spannable spannable, LocaleList localeList, int i10, int i11) {
        if (localeList != null) {
            setSpan(spannable, LocaleListHelperMethods.INSTANCE.localeSpan(localeList), i10, i11);
        }
    }

    private static final void setShadow(Spannable spannable, Shadow shadow, int i10, int i11) {
        if (shadow != null) {
            setSpan(spannable, new ShadowSpan(ColorKt.m24330toArgb8_81llA(shadow.m24601getColor0d7_KjU()), Float.intBitsToFloat((int) (shadow.m24602getOffsetF1C5BW0() >> 32)), Float.intBitsToFloat((int) (shadow.m24602getOffsetF1C5BW0() & 4294967295L)), TextPaintExtensions_androidKt.correctBlurRadius(shadow.getBlurRadius())), i10, i11);
        }
    }

    public static final void setSpan(Spannable spannable, Object obj, int i10, int i11) {
        spannable.setSpan(obj, i10, i11, 33);
    }

    private static final void setSpanStyle(Spannable spannable, SpanStyle spanStyle, int i10, int i11, Density density) {
        m26642setBaselineShift0ocSgnM(spannable, spanStyle.m26304getBaselineShift5SSeXJ0(), i10, i11);
        m26643setColorRPmYEkk(spannable, spanStyle.m26305getColor0d7_KjU(), i10, i11);
        setBrush(spannable, spanStyle.getBrush(), spanStyle.getAlpha(), i10, i11);
        setTextDecoration(spannable, spanStyle.getTextDecoration(), i10, i11);
        m26644setFontSizeKmRG4DE(spannable, spanStyle.m26306getFontSizeXSAIIZE(), density, i10, i11);
        setFontFeatureSettings(spannable, spanStyle.getFontFeatureSettings(), i10, i11);
        setGeometricTransform(spannable, spanStyle.getTextGeometricTransform(), i10, i11);
        setLocaleList(spannable, spanStyle.getLocaleList(), i10, i11);
        m26641setBackgroundRPmYEkk(spannable, spanStyle.m26303getBackground0d7_KjU(), i10, i11);
        setShadow(spannable, spanStyle.getShadow(), i10, i11);
        setDrawStyle(spannable, spanStyle.getDrawStyle(), i10, i11);
    }

    public static final void setSpanStyles(Spannable spannable, TextStyle textStyle, List<? extends AnnotatedString.Range<? extends AnnotatedString.Annotation>> list, Density density, InterfaceC10576r interfaceC10576r) {
        MetricAffectingSpan metricAffectingSpanM26638createLetterSpacingSpaneAf_CNQ;
        setFontAttributes(spannable, textStyle, list, interfaceC10576r);
        int size = list.size();
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
            int size2 = list.size();
            for (int i11 = 0; i11 < size2; i11++) {
                AnnotatedString.Range<? extends AnnotatedString.Annotation> range2 = list.get(i11);
                AnnotatedString.Annotation item = range2.getItem();
                if (item instanceof SpanStyle) {
                    int start2 = range2.getStart();
                    int end2 = range2.getEnd();
                    if (start2 >= 0 && start2 < spannable.length() && end2 > start2 && end2 <= spannable.length() && (metricAffectingSpanM26638createLetterSpacingSpaneAf_CNQ = m26638createLetterSpacingSpaneAf_CNQ(((SpanStyle) item).m26309getLetterSpacingXSAIIZE(), density)) != null) {
                        setSpan(spannable, metricAffectingSpanM26638createLetterSpacingSpaneAf_CNQ, start2, end2);
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
            if ((TextUnit.m27090equalsimpl0(textIndent.m26807getFirstLineXSAIIZE(), TextUnitKt.getSp(0)) && TextUnit.m27090equalsimpl0(textIndent.m26808getRestLineXSAIIZE(), TextUnitKt.getSp(0))) || TextUnit.m27091getRawTypeimpl(textIndent.m26807getFirstLineXSAIIZE()) == 0 || TextUnit.m27091getRawTypeimpl(textIndent.m26808getRestLineXSAIIZE()) == 0) {
                return;
            }
            long jM27092getTypeUIouoOA = TextUnit.m27092getTypeUIouoOA(textIndent.m26807getFirstLineXSAIIZE());
            TextUnitType.Companion companion = TextUnitType.Companion;
            float fM27093getValueimpl = 0.0f;
            float fMo20496toPxR2X_6o = TextUnitType.m27121equalsimpl0(jM27092getTypeUIouoOA, companion.m27126getSpUIouoOA()) ? density.mo20496toPxR2X_6o(textIndent.m26807getFirstLineXSAIIZE()) : TextUnitType.m27121equalsimpl0(jM27092getTypeUIouoOA, companion.m27125getEmUIouoOA()) ? TextUnit.m27093getValueimpl(textIndent.m26807getFirstLineXSAIIZE()) * f10 : 0.0f;
            long jM27092getTypeUIouoOA2 = TextUnit.m27092getTypeUIouoOA(textIndent.m26808getRestLineXSAIIZE());
            if (TextUnitType.m27121equalsimpl0(jM27092getTypeUIouoOA2, companion.m27126getSpUIouoOA())) {
                fM27093getValueimpl = density.mo20496toPxR2X_6o(textIndent.m26808getRestLineXSAIIZE());
            } else if (TextUnitType.m27121equalsimpl0(jM27092getTypeUIouoOA2, companion.m27125getEmUIouoOA())) {
                fM27093getValueimpl = TextUnit.m27093getValueimpl(textIndent.m26808getRestLineXSAIIZE()) * f10;
            }
            setSpan(spannable, new LeadingMarginSpan.Standard((int) Math.ceil(fMo20496toPxR2X_6o), (int) Math.ceil(fM27093getValueimpl)), 0, spannable.length());
        }
    }
}
