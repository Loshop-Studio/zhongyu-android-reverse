package androidx.compose.p006ui.text.platform.extensions;

import android.graphics.Typeface;
import android.os.Build;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.LocaleSpan;
import android.text.style.MetricAffectingSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.ScaleXSpan;
import androidx.compose.p006ui.geometry.Offset;
import androidx.compose.p006ui.graphics.Brush;
import androidx.compose.p006ui.graphics.Color;
import androidx.compose.p006ui.graphics.ColorKt;
import androidx.compose.p006ui.graphics.ShaderBrush;
import androidx.compose.p006ui.graphics.Shadow;
import androidx.compose.p006ui.graphics.SolidColor;
import androidx.compose.p006ui.graphics.drawscope.DrawStyle;
import androidx.compose.p006ui.text.AnnotatedString;
import androidx.compose.p006ui.text.AnnotatedStringKt;
import androidx.compose.p006ui.text.SpanStyle;
import androidx.compose.p006ui.text.TextStyle;
import androidx.compose.p006ui.text.android.style.BaselineShiftSpan;
import androidx.compose.p006ui.text.android.style.FontFeatureSpan;
import androidx.compose.p006ui.text.android.style.LetterSpacingSpanEm;
import androidx.compose.p006ui.text.android.style.LetterSpacingSpanPx;
import androidx.compose.p006ui.text.android.style.LineHeightSpan;
import androidx.compose.p006ui.text.android.style.LineHeightStyleSpan;
import androidx.compose.p006ui.text.android.style.ShadowSpan;
import androidx.compose.p006ui.text.android.style.SkewXSpan;
import androidx.compose.p006ui.text.android.style.TextDecorationSpan;
import androidx.compose.p006ui.text.android.style.TypefaceSpan;
import androidx.compose.p006ui.text.font.FontFamily;
import androidx.compose.p006ui.text.font.FontStyle;
import androidx.compose.p006ui.text.font.FontSynthesis;
import androidx.compose.p006ui.text.font.FontWeight;
import androidx.compose.p006ui.text.intl.Locale;
import androidx.compose.p006ui.text.intl.LocaleList;
import androidx.compose.p006ui.text.platform.style.DrawStyleSpan;
import androidx.compose.p006ui.text.platform.style.ShaderBrushSpan;
import androidx.compose.p006ui.text.style.BaselineShift;
import androidx.compose.p006ui.text.style.LineHeightStyle;
import androidx.compose.p006ui.text.style.TextDecoration;
import androidx.compose.p006ui.text.style.TextGeometricTransform;
import androidx.compose.p006ui.text.style.TextIndent;
import androidx.compose.p006ui.unit.Density;
import androidx.compose.p006ui.unit.TextUnit;
import androidx.compose.p006ui.unit.TextUnitKt;
import androidx.compose.p006ui.unit.TextUnitType;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.text.StringsKt___StringsKt;

@Metadata(m5174d1 = {"\u0000Î\u0001\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a'\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\u001aF\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00120\u00112\u001e\u0010\u0013\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000e0\u0014H\u0000\u001a-\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\nH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001b\u001a\f\u0010\u001c\u001a\u00020\u0001*\u00020\u001dH\u0002\u001a\u0016\u0010\u001e\u001a\u00020\u0002*\u0004\u0018\u00010\u00022\u0006\u0010\u001f\u001a\u00020\u0002H\u0002\u001a1\u0010 \u001a\u00020\u000e*\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\u0015H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010'\u001a1\u0010(\u001a\u00020\u000e*\u00020!2\b\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010$\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\u0015H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\b+\u001a.\u0010,\u001a\u00020\u000e*\u00020!2\b\u0010-\u001a\u0004\u0018\u00010.2\u0006\u0010/\u001a\u00020\u00172\u0006\u0010$\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\u0015H\u0002\u001a1\u00100\u001a\u00020\u000e*\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\u0015H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b1\u0010'\u001a&\u00102\u001a\u00020\u000e*\u00020!2\b\u00103\u001a\u0004\u0018\u0001042\u0006\u0010$\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\u0015H\u0002\u001aS\u00105\u001a\u00020\u000e*\u00020!2\u0006\u00106\u001a\u00020\u001d2\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00120\u00112&\u00107\u001a\"\u0012\u0006\u0012\u0004\u0018\u000109\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020=08H\u0002ø\u0001\u0001\u001a&\u0010>\u001a\u00020\u000e*\u00020!2\b\u0010?\u001a\u0004\u0018\u00010@2\u0006\u0010$\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\u0015H\u0002\u001a9\u0010A\u001a\u00020\u000e*\u00020!2\u0006\u0010B\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010$\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\u0015H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bC\u0010D\u001a&\u0010E\u001a\u00020\u000e*\u00020!2\b\u0010F\u001a\u0004\u0018\u00010G2\u0006\u0010$\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\u0015H\u0002\u001a1\u0010H\u001a\u00020\u000e*\u00020!2\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\nH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bI\u0010J\u001a9\u0010H\u001a\u00020\u000e*\u00020!2\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\n2\u0006\u0010K\u001a\u00020LH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bM\u0010N\u001a&\u0010O\u001a\u00020\u000e*\u00020!2\b\u0010P\u001a\u0004\u0018\u00010Q2\u0006\u0010$\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\u0015H\u0000\u001a&\u0010R\u001a\u00020\u000e*\u00020!2\b\u0010S\u001a\u0004\u0018\u00010T2\u0006\u0010$\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\u0015H\u0002\u001a$\u0010U\u001a\u00020\u000e*\u00020!2\u0006\u0010V\u001a\u00020W2\u0006\u0010$\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\u0015H\u0000\u001a\"\u0010X\u001a\u00020\u000e*\u00020!2\f\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u00020\u00122\u0006\u0010\t\u001a\u00020\nH\u0002\u001a[\u0010Z\u001a\u00020\u000e*\u00020!2\u0006\u00106\u001a\u00020\u001d2\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00120\u00112\u0006\u0010\t\u001a\u00020\n2&\u00107\u001a\"\u0012\u0006\u0012\u0004\u0018\u000109\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020=08H\u0000ø\u0001\u0001\u001a&\u0010[\u001a\u00020\u000e*\u00020!2\b\u0010\\\u001a\u0004\u0018\u00010]2\u0006\u0010$\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\u0015H\u0000\u001a&\u0010^\u001a\u00020\u000e*\u00020!2\b\u0010_\u001a\u0004\u0018\u00010`2\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\nH\u0000\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006a"}, m5175d2 = {"needsLetterSpacingSpan", "", "Landroidx/compose/ui/text/SpanStyle;", "getNeedsLetterSpacingSpan", "(Landroidx/compose/ui/text/SpanStyle;)Z", "createLetterSpacingSpan", "Landroid/text/style/MetricAffectingSpan;", "letterSpacing", "Landroidx/compose/ui/unit/TextUnit;", "density", "Landroidx/compose/ui/unit/Density;", "createLetterSpacingSpan-eAf_CNQ", "(JLandroidx/compose/ui/unit/Density;)Landroid/text/style/MetricAffectingSpan;", "flattenFontStylesAndApply", "", "contextFontSpanStyle", "spanStyles", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "block", "Lkotlin/Function3;", "", "resolveLineHeightInPx", "", "lineHeight", "contextFontSize", "resolveLineHeightInPx-o2QH7mI", "(JFLandroidx/compose/ui/unit/Density;)F", "hasFontAttributes", "Landroidx/compose/ui/text/TextStyle;", "merge", "spanStyle", "setBackground", "Landroid/text/Spannable;", "color", "Landroidx/compose/ui/graphics/Color;", "start", "end", "setBackground-RPmYEkk", "(Landroid/text/Spannable;JII)V", "setBaselineShift", "baselineShift", "Landroidx/compose/ui/text/style/BaselineShift;", "setBaselineShift-0ocSgnM", "setBrush", "brush", "Landroidx/compose/ui/graphics/Brush;", "alpha", "setColor", "setColor-RPmYEkk", "setDrawStyle", "drawStyle", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "setFontAttributes", "contextTextStyle", "resolveTypeface", "Lkotlin/Function4;", "Landroidx/compose/ui/text/font/FontFamily;", "Landroidx/compose/ui/text/font/FontWeight;", "Landroidx/compose/ui/text/font/FontStyle;", "Landroidx/compose/ui/text/font/FontSynthesis;", "Landroid/graphics/Typeface;", "setFontFeatureSettings", "fontFeatureSettings", "", "setFontSize", "fontSize", "setFontSize-KmRG4DE", "(Landroid/text/Spannable;JLandroidx/compose/ui/unit/Density;II)V", "setGeometricTransform", "textGeometricTransform", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "setLineHeight", "setLineHeight-r9BaKPg", "(Landroid/text/Spannable;JFLandroidx/compose/ui/unit/Density;)V", "lineHeightStyle", "Landroidx/compose/ui/text/style/LineHeightStyle;", "setLineHeight-KmRG4DE", "(Landroid/text/Spannable;JFLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/style/LineHeightStyle;)V", "setLocaleList", "localeList", "Landroidx/compose/ui/text/intl/LocaleList;", "setShadow", "shadow", "Landroidx/compose/ui/graphics/Shadow;", "setSpan", "span", "", "setSpanStyle", "spanStyleRange", "setSpanStyles", "setTextDecoration", "textDecoration", "Landroidx/compose/ui/text/style/TextDecoration;", "setTextIndent", "textIndent", "Landroidx/compose/ui/text/style/TextIndent;", "ui-text_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSpannableExtensions.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpannableExtensions.android.kt\nandroidx/compose/ui/text/platform/extensions/SpannableExtensions_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 TempListUtils.kt\nandroidx/compose/ui/text/TempListUtilsKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 5 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,552:1\n1#2:553\n35#3,3:554\n38#3,2:561\n40#3:564\n33#4,4:557\n38#4:563\n69#4,6:565\n33#4,6:571\n646#5:577\n646#5:578\n*S KotlinDebug\n*F\n+ 1 SpannableExtensions.android.kt\nandroidx/compose/ui/text/platform/extensions/SpannableExtensions_androidKt\n*L\n282#1:554,3\n282#1:561,2\n282#1:564\n282#1:557,4\n282#1:563\n350#1:565,6\n370#1:571,6\n434#1:577\n507#1:578\n*E\n"})
/* loaded from: classes.dex */
public final class SpannableExtensions_androidKt {
    /* renamed from: createLetterSpacingSpan-eAf_CNQ, reason: not valid java name */
    private static final MetricAffectingSpan m11307createLetterSpacingSpaneAf_CNQ(long j4, Density density) {
        long jM11705getTypeUIouoOA = TextUnit.m11705getTypeUIouoOA(j4);
        TextUnitType.Companion companion = TextUnitType.INSTANCE;
        if (TextUnitType.m11734equalsimpl0(jM11705getTypeUIouoOA, companion.m11739getSpUIouoOA())) {
            return new LetterSpacingSpanPx(density.mo7205toPxR2X_6o(j4));
        }
        if (TextUnitType.m11734equalsimpl0(jM11705getTypeUIouoOA, companion.m11738getEmUIouoOA())) {
            return new LetterSpacingSpanEm(TextUnit.m11706getValueimpl(j4));
        }
        return null;
    }

    public static final void flattenFontStylesAndApply(SpanStyle spanStyle, List<AnnotatedString.Range<SpanStyle>> spanStyles, Function3<? super SpanStyle, ? super Integer, ? super Integer, Unit> block) {
        Intrinsics.checkNotNullParameter(spanStyles, "spanStyles");
        Intrinsics.checkNotNullParameter(block, "block");
        if (spanStyles.size() <= 1) {
            if (!spanStyles.isEmpty()) {
                block.invoke(merge(spanStyle, spanStyles.get(0).getItem()), Integer.valueOf(spanStyles.get(0).getStart()), Integer.valueOf(spanStyles.get(0).getEnd()));
                return;
            }
            return;
        }
        int size = spanStyles.size();
        int i4 = size * 2;
        Integer[] numArr = new Integer[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            numArr[i5] = 0;
        }
        int size2 = spanStyles.size();
        for (int i6 = 0; i6 < size2; i6++) {
            AnnotatedString.Range<SpanStyle> range = spanStyles.get(i6);
            numArr[i6] = Integer.valueOf(range.getStart());
            numArr[i6 + size] = Integer.valueOf(range.getEnd());
        }
        ArraysKt___ArraysJvmKt.sort((Object[]) numArr);
        int iIntValue = ((Number) ArraysKt___ArraysKt.first(numArr)).intValue();
        for (int i7 = 0; i7 < i4; i7++) {
            int iIntValue2 = numArr[i7].intValue();
            if (iIntValue2 != iIntValue) {
                int size3 = spanStyles.size();
                SpanStyle spanStyleMerge = spanStyle;
                for (int i8 = 0; i8 < size3; i8++) {
                    AnnotatedString.Range<SpanStyle> range2 = spanStyles.get(i8);
                    if (range2.getStart() != range2.getEnd() && AnnotatedStringKt.intersect(iIntValue, iIntValue2, range2.getStart(), range2.getEnd())) {
                        spanStyleMerge = merge(spanStyleMerge, range2.getItem());
                    }
                }
                if (spanStyleMerge != null) {
                    block.invoke(spanStyleMerge, Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2));
                }
                iIntValue = iIntValue2;
            }
        }
    }

    private static final boolean getNeedsLetterSpacingSpan(SpanStyle spanStyle) {
        long jM11705getTypeUIouoOA = TextUnit.m11705getTypeUIouoOA(spanStyle.getLetterSpacing());
        TextUnitType.Companion companion = TextUnitType.INSTANCE;
        return TextUnitType.m11734equalsimpl0(jM11705getTypeUIouoOA, companion.m11739getSpUIouoOA()) || TextUnitType.m11734equalsimpl0(TextUnit.m11705getTypeUIouoOA(spanStyle.getLetterSpacing()), companion.m11738getEmUIouoOA());
    }

    private static final boolean hasFontAttributes(TextStyle textStyle) {
        return TextPaintExtensions_androidKt.hasFontAttributes(textStyle.toSpanStyle()) || textStyle.m11100getFontSynthesisZQGJjVo() != null;
    }

    private static final SpanStyle merge(SpanStyle spanStyle, SpanStyle spanStyle2) {
        return spanStyle == null ? spanStyle2 : spanStyle.merge(spanStyle2);
    }

    /* renamed from: resolveLineHeightInPx-o2QH7mI, reason: not valid java name */
    private static final float m11308resolveLineHeightInPxo2QH7mI(long j4, float f4, Density density) {
        long jM11705getTypeUIouoOA = TextUnit.m11705getTypeUIouoOA(j4);
        TextUnitType.Companion companion = TextUnitType.INSTANCE;
        if (TextUnitType.m11734equalsimpl0(jM11705getTypeUIouoOA, companion.m11739getSpUIouoOA())) {
            return density.mo7205toPxR2X_6o(j4);
        }
        if (TextUnitType.m11734equalsimpl0(jM11705getTypeUIouoOA, companion.m11738getEmUIouoOA())) {
            return TextUnit.m11706getValueimpl(j4) * f4;
        }
        return Float.NaN;
    }

    /* renamed from: setBackground-RPmYEkk, reason: not valid java name */
    public static final void m11309setBackgroundRPmYEkk(Spannable setBackground, long j4, int i4, int i5) {
        Intrinsics.checkNotNullParameter(setBackground, "$this$setBackground");
        if (j4 != Color.INSTANCE.m9214getUnspecified0d7_KjU()) {
            setSpan(setBackground, new BackgroundColorSpan(ColorKt.m9232toArgb8_81llA(j4)), i4, i5);
        }
    }

    /* renamed from: setBaselineShift-0ocSgnM, reason: not valid java name */
    private static final void m11310setBaselineShift0ocSgnM(Spannable spannable, BaselineShift baselineShift, int i4, int i5) {
        if (baselineShift != null) {
            setSpan(spannable, new BaselineShiftSpan(baselineShift.m11326unboximpl()), i4, i5);
        }
    }

    private static final void setBrush(Spannable spannable, Brush brush, float f4, int i4, int i5) {
        if (brush != null) {
            if (brush instanceof SolidColor) {
                m11311setColorRPmYEkk(spannable, ((SolidColor) brush).getValue(), i4, i5);
            } else if (brush instanceof ShaderBrush) {
                setSpan(spannable, new ShaderBrushSpan((ShaderBrush) brush, f4), i4, i5);
            }
        }
    }

    /* renamed from: setColor-RPmYEkk, reason: not valid java name */
    public static final void m11311setColorRPmYEkk(Spannable setColor, long j4, int i4, int i5) {
        Intrinsics.checkNotNullParameter(setColor, "$this$setColor");
        if (j4 != Color.INSTANCE.m9214getUnspecified0d7_KjU()) {
            setSpan(setColor, new ForegroundColorSpan(ColorKt.m9232toArgb8_81llA(j4)), i4, i5);
        }
    }

    private static final void setDrawStyle(Spannable spannable, DrawStyle drawStyle, int i4, int i5) {
        if (drawStyle != null) {
            setSpan(spannable, new DrawStyleSpan(drawStyle), i4, i5);
        }
    }

    private static final void setFontAttributes(final Spannable spannable, TextStyle textStyle, List<AnnotatedString.Range<SpanStyle>> list, final Function4<? super FontFamily, ? super FontWeight, ? super FontStyle, ? super FontSynthesis, ? extends Typeface> function4) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            AnnotatedString.Range<SpanStyle> range = list.get(i4);
            AnnotatedString.Range<SpanStyle> range2 = range;
            if (TextPaintExtensions_androidKt.hasFontAttributes(range2.getItem()) || range2.getItem().getFontSynthesis() != null) {
                arrayList.add(range);
            }
        }
        flattenFontStylesAndApply(hasFontAttributes(textStyle) ? new SpanStyle(0L, 0L, textStyle.getFontWeight(), textStyle.m11099getFontStyle4Lr2A7w(), textStyle.m11100getFontSynthesisZQGJjVo(), textStyle.getFontFamily(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, 16323, (DefaultConstructorMarker) null) : null, arrayList, new Function3<SpanStyle, Integer, Integer, Unit>() { // from class: androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt.setFontAttributes.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(SpanStyle spanStyle, Integer num, Integer num2) {
                invoke(spanStyle, num.intValue(), num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(SpanStyle spanStyle, int i5, int i6) {
                Intrinsics.checkNotNullParameter(spanStyle, "spanStyle");
                Spannable spannable2 = spannable;
                Function4<FontFamily, FontWeight, FontStyle, FontSynthesis, Typeface> function42 = function4;
                FontFamily fontFamily = spanStyle.getFontFamily();
                FontWeight fontWeight = spanStyle.getFontWeight();
                if (fontWeight == null) {
                    fontWeight = FontWeight.INSTANCE.getNormal();
                }
                FontStyle fontStyle = spanStyle.getFontStyle();
                FontStyle fontStyleM11159boximpl = FontStyle.m11159boximpl(fontStyle != null ? fontStyle.m11165unboximpl() : FontStyle.INSTANCE.m11167getNormal_LCdwA());
                FontSynthesis fontSynthesis = spanStyle.getFontSynthesis();
                spannable2.setSpan(new TypefaceSpan(function42.invoke(fontFamily, fontWeight, fontStyleM11159boximpl, FontSynthesis.m11168boximpl(fontSynthesis != null ? fontSynthesis.getValue() : FontSynthesis.INSTANCE.m11177getAllGVVA2EU()))), i5, i6, 33);
            }
        });
    }

    private static final void setFontFeatureSettings(Spannable spannable, String str, int i4, int i5) {
        if (str != null) {
            setSpan(spannable, new FontFeatureSpan(str), i4, i5);
        }
    }

    /* renamed from: setFontSize-KmRG4DE, reason: not valid java name */
    public static final void m11312setFontSizeKmRG4DE(Spannable setFontSize, long j4, Density density, int i4, int i5) {
        Intrinsics.checkNotNullParameter(setFontSize, "$this$setFontSize");
        Intrinsics.checkNotNullParameter(density, "density");
        long jM11705getTypeUIouoOA = TextUnit.m11705getTypeUIouoOA(j4);
        TextUnitType.Companion companion = TextUnitType.INSTANCE;
        if (TextUnitType.m11734equalsimpl0(jM11705getTypeUIouoOA, companion.m11739getSpUIouoOA())) {
            setSpan(setFontSize, new AbsoluteSizeSpan(MathKt__MathJVMKt.roundToInt(density.mo7205toPxR2X_6o(j4)), false), i4, i5);
        } else if (TextUnitType.m11734equalsimpl0(jM11705getTypeUIouoOA, companion.m11738getEmUIouoOA())) {
            setSpan(setFontSize, new RelativeSizeSpan(TextUnit.m11706getValueimpl(j4)), i4, i5);
        }
    }

    private static final void setGeometricTransform(Spannable spannable, TextGeometricTransform textGeometricTransform, int i4, int i5) {
        if (textGeometricTransform != null) {
            setSpan(spannable, new ScaleXSpan(textGeometricTransform.getScaleX()), i4, i5);
            setSpan(spannable, new SkewXSpan(textGeometricTransform.getSkewX()), i4, i5);
        }
    }

    /* renamed from: setLineHeight-KmRG4DE, reason: not valid java name */
    public static final void m11313setLineHeightKmRG4DE(Spannable setLineHeight, long j4, float f4, Density density, LineHeightStyle lineHeightStyle) {
        Intrinsics.checkNotNullParameter(setLineHeight, "$this$setLineHeight");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(lineHeightStyle, "lineHeightStyle");
        float fM11308resolveLineHeightInPxo2QH7mI = m11308resolveLineHeightInPxo2QH7mI(j4, f4, density);
        if (Float.isNaN(fM11308resolveLineHeightInPxo2QH7mI)) {
            return;
        }
        setSpan(setLineHeight, new LineHeightStyleSpan(fM11308resolveLineHeightInPxo2QH7mI, 0, ((setLineHeight.length() == 0) || StringsKt___StringsKt.last(setLineHeight) == '\n') ? setLineHeight.length() + 1 : setLineHeight.length(), LineHeightStyle.Trim.m11416isTrimFirstLineTopimpl$ui_text_release(lineHeightStyle.getTrim()), LineHeightStyle.Trim.m11417isTrimLastLineBottomimpl$ui_text_release(lineHeightStyle.getTrim()), lineHeightStyle.getAlignment()), 0, setLineHeight.length());
    }

    /* renamed from: setLineHeight-r9BaKPg, reason: not valid java name */
    public static final void m11314setLineHeightr9BaKPg(Spannable setLineHeight, long j4, float f4, Density density) {
        Intrinsics.checkNotNullParameter(setLineHeight, "$this$setLineHeight");
        Intrinsics.checkNotNullParameter(density, "density");
        float fM11308resolveLineHeightInPxo2QH7mI = m11308resolveLineHeightInPxo2QH7mI(j4, f4, density);
        if (Float.isNaN(fM11308resolveLineHeightInPxo2QH7mI)) {
            return;
        }
        setSpan(setLineHeight, new LineHeightSpan(fM11308resolveLineHeightInPxo2QH7mI), 0, setLineHeight.length());
    }

    public static final void setLocaleList(Spannable spannable, LocaleList localeList, int i4, int i5) {
        Object localeSpan;
        Intrinsics.checkNotNullParameter(spannable, "<this>");
        if (localeList != null) {
            if (Build.VERSION.SDK_INT >= 24) {
                localeSpan = LocaleListHelperMethods.INSTANCE.localeSpan(localeList);
            } else {
                localeSpan = new LocaleSpan(LocaleExtensions_androidKt.toJavaLocale(localeList.isEmpty() ? Locale.INSTANCE.getCurrent() : localeList.get(0)));
            }
            setSpan(spannable, localeSpan, i4, i5);
        }
    }

    private static final void setShadow(Spannable spannable, Shadow shadow, int i4, int i5) {
        if (shadow != null) {
            setSpan(spannable, new ShadowSpan(ColorKt.m9232toArgb8_81llA(shadow.getColor()), Offset.m8945getXimpl(shadow.getOffset()), Offset.m8946getYimpl(shadow.getOffset()), TextPaintExtensions_androidKt.correctBlurRadius(shadow.getBlurRadius())), i4, i5);
        }
    }

    public static final void setSpan(Spannable spannable, Object span, int i4, int i5) {
        Intrinsics.checkNotNullParameter(spannable, "<this>");
        Intrinsics.checkNotNullParameter(span, "span");
        spannable.setSpan(span, i4, i5, 33);
    }

    private static final void setSpanStyle(Spannable spannable, AnnotatedString.Range<SpanStyle> range, Density density) {
        int start = range.getStart();
        int end = range.getEnd();
        SpanStyle item = range.getItem();
        m11310setBaselineShift0ocSgnM(spannable, item.getBaselineShift(), start, end);
        m11311setColorRPmYEkk(spannable, item.m11037getColor0d7_KjU(), start, end);
        setBrush(spannable, item.getBrush(), item.getAlpha(), start, end);
        setTextDecoration(spannable, item.getTextDecoration(), start, end);
        m11312setFontSizeKmRG4DE(spannable, item.getFontSize(), density, start, end);
        setFontFeatureSettings(spannable, item.getFontFeatureSettings(), start, end);
        setGeometricTransform(spannable, item.getTextGeometricTransform(), start, end);
        setLocaleList(spannable, item.getLocaleList(), start, end);
        m11309setBackgroundRPmYEkk(spannable, item.getBackground(), start, end);
        setShadow(spannable, item.getShadow(), start, end);
        setDrawStyle(spannable, item.getDrawStyle(), start, end);
    }

    public static final void setSpanStyles(Spannable spannable, TextStyle contextTextStyle, List<AnnotatedString.Range<SpanStyle>> spanStyles, Density density, Function4<? super FontFamily, ? super FontWeight, ? super FontStyle, ? super FontSynthesis, ? extends Typeface> resolveTypeface) {
        MetricAffectingSpan metricAffectingSpanM11307createLetterSpacingSpaneAf_CNQ;
        Intrinsics.checkNotNullParameter(spannable, "<this>");
        Intrinsics.checkNotNullParameter(contextTextStyle, "contextTextStyle");
        Intrinsics.checkNotNullParameter(spanStyles, "spanStyles");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(resolveTypeface, "resolveTypeface");
        setFontAttributes(spannable, contextTextStyle, spanStyles, resolveTypeface);
        int size = spanStyles.size();
        boolean z3 = false;
        for (int i4 = 0; i4 < size; i4++) {
            AnnotatedString.Range<SpanStyle> range = spanStyles.get(i4);
            int start = range.getStart();
            int end = range.getEnd();
            if (start >= 0 && start < spannable.length() && end > start && end <= spannable.length()) {
                setSpanStyle(spannable, range, density);
                if (getNeedsLetterSpacingSpan(range.getItem())) {
                    z3 = true;
                }
            }
        }
        if (z3) {
            int size2 = spanStyles.size();
            for (int i5 = 0; i5 < size2; i5++) {
                AnnotatedString.Range<SpanStyle> range2 = spanStyles.get(i5);
                int start2 = range2.getStart();
                int end2 = range2.getEnd();
                SpanStyle item = range2.getItem();
                if (start2 >= 0 && start2 < spannable.length() && end2 > start2 && end2 <= spannable.length() && (metricAffectingSpanM11307createLetterSpacingSpaneAf_CNQ = m11307createLetterSpacingSpaneAf_CNQ(item.getLetterSpacing(), density)) != null) {
                    setSpan(spannable, metricAffectingSpanM11307createLetterSpacingSpaneAf_CNQ, start2, end2);
                }
            }
        }
    }

    public static final void setTextDecoration(Spannable spannable, TextDecoration textDecoration, int i4, int i5) {
        Intrinsics.checkNotNullParameter(spannable, "<this>");
        if (textDecoration != null) {
            TextDecoration.Companion companion = TextDecoration.INSTANCE;
            setSpan(spannable, new TextDecorationSpan(textDecoration.contains(companion.getUnderline()), textDecoration.contains(companion.getLineThrough())), i4, i5);
        }
    }

    public static final void setTextIndent(Spannable spannable, TextIndent textIndent, float f4, Density density) {
        Intrinsics.checkNotNullParameter(spannable, "<this>");
        Intrinsics.checkNotNullParameter(density, "density");
        if (textIndent != null) {
            if ((TextUnit.m11703equalsimpl0(textIndent.getFirstLine(), TextUnitKt.getSp(0)) && TextUnit.m11703equalsimpl0(textIndent.getRestLine(), TextUnitKt.getSp(0))) || TextUnitKt.m11724isUnspecifiedR2X_6o(textIndent.getFirstLine()) || TextUnitKt.m11724isUnspecifiedR2X_6o(textIndent.getRestLine())) {
                return;
            }
            long jM11705getTypeUIouoOA = TextUnit.m11705getTypeUIouoOA(textIndent.getFirstLine());
            TextUnitType.Companion companion = TextUnitType.INSTANCE;
            float fM11706getValueimpl = 0.0f;
            float fMo7205toPxR2X_6o = TextUnitType.m11734equalsimpl0(jM11705getTypeUIouoOA, companion.m11739getSpUIouoOA()) ? density.mo7205toPxR2X_6o(textIndent.getFirstLine()) : TextUnitType.m11734equalsimpl0(jM11705getTypeUIouoOA, companion.m11738getEmUIouoOA()) ? TextUnit.m11706getValueimpl(textIndent.getFirstLine()) * f4 : 0.0f;
            long jM11705getTypeUIouoOA2 = TextUnit.m11705getTypeUIouoOA(textIndent.getRestLine());
            if (TextUnitType.m11734equalsimpl0(jM11705getTypeUIouoOA2, companion.m11739getSpUIouoOA())) {
                fM11706getValueimpl = density.mo7205toPxR2X_6o(textIndent.getRestLine());
            } else if (TextUnitType.m11734equalsimpl0(jM11705getTypeUIouoOA2, companion.m11738getEmUIouoOA())) {
                fM11706getValueimpl = TextUnit.m11706getValueimpl(textIndent.getRestLine()) * f4;
            }
            setSpan(spannable, new LeadingMarginSpan.Standard((int) Math.ceil(fMo7205toPxR2X_6o), (int) Math.ceil(fM11706getValueimpl)), 0, spannable.length());
        }
    }
}
