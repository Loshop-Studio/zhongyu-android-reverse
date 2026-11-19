package androidx.compose.p012ui.text.platform.extensions;

import android.graphics.Typeface;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.ScaleXSpan;
import androidx.compose.p012ui.graphics.Brush;
import androidx.compose.p012ui.graphics.ColorKt;
import androidx.compose.p012ui.graphics.ShaderBrush;
import androidx.compose.p012ui.graphics.Shadow;
import androidx.compose.p012ui.graphics.SolidColor;
import androidx.compose.p012ui.graphics.drawscope.DrawStyle;
import androidx.compose.p012ui.text.AnnotatedString;
import androidx.compose.p012ui.text.AnnotatedStringKt;
import androidx.compose.p012ui.text.Bullet;
import androidx.compose.p012ui.text.PlatformSpanStyle;
import androidx.compose.p012ui.text.SpanStyle;
import androidx.compose.p012ui.text.TextStyle;
import androidx.compose.p012ui.text.android.style.BaselineShiftSpan;
import androidx.compose.p012ui.text.android.style.FontFeatureSpan;
import androidx.compose.p012ui.text.android.style.LetterSpacingSpanEm;
import androidx.compose.p012ui.text.android.style.LetterSpacingSpanPx;
import androidx.compose.p012ui.text.android.style.LineHeightSpan;
import androidx.compose.p012ui.text.android.style.LineHeightStyleSpan;
import androidx.compose.p012ui.text.android.style.ShadowSpan;
import androidx.compose.p012ui.text.android.style.SkewXSpan;
import androidx.compose.p012ui.text.android.style.TextDecorationSpan;
import androidx.compose.p012ui.text.android.style.TypefaceSpan;
import androidx.compose.p012ui.text.font.FontFamily;
import androidx.compose.p012ui.text.font.FontStyle;
import androidx.compose.p012ui.text.font.FontSynthesis;
import androidx.compose.p012ui.text.font.FontWeight;
import androidx.compose.p012ui.text.intl.LocaleList;
import androidx.compose.p012ui.text.platform.style.CustomBulletSpan;
import androidx.compose.p012ui.text.platform.style.DrawStyleSpan;
import androidx.compose.p012ui.text.platform.style.ShaderBrushSpan;
import androidx.compose.p012ui.text.style.BaselineShift;
import androidx.compose.p012ui.text.style.LineHeightStyle;
import androidx.compose.p012ui.text.style.TextDecoration;
import androidx.compose.p012ui.text.style.TextGeometricTransform;
import androidx.compose.p012ui.text.style.TextIndent;
import androidx.compose.p012ui.unit.Density;
import androidx.compose.p012ui.unit.TextUnit;
import androidx.compose.p012ui.unit.TextUnitKt;
import androidx.compose.p012ui.unit.TextUnitType;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.text.StringsKt;

@Metadata(m13412d1 = {"\u0000Ø\u0001\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a$\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001aF\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00120\u00112\u001e\u0010\u0013\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000e0\u0014H\u0000\u001a\u0010\u0010\u0016\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\nH\u0002\u001a*\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\nH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a*\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\nH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u001c\u001a\f\u0010 \u001a\u00020\u0001*\u00020!H\u0002\u001a\u0016\u0010\"\u001a\u00020\u0002*\u0004\u0018\u00010\u00022\u0006\u0010#\u001a\u00020\u0002H\u0002\u001a.\u0010$\u001a\u00020\u000e*\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u00152\u0006\u0010)\u001a\u00020\u0015H\u0000ø\u0001\u0000¢\u0006\u0004\b*\u0010+\u001a.\u0010,\u001a\u00020\u000e*\u00020%2\b\u0010-\u001a\u0004\u0018\u00010.2\u0006\u0010(\u001a\u00020\u00152\u0006\u0010)\u001a\u00020\u0015H\u0002ø\u0001\u0000¢\u0006\u0002\b/\u001a.\u00100\u001a\u00020\u000e*\u00020%2\b\u00101\u001a\u0004\u0018\u0001022\u0006\u00103\u001a\u00020\u00182\u0006\u0010(\u001a\u00020\u00152\u0006\u0010)\u001a\u00020\u0015H\u0002\u001a<\u00104\u001a\u00020\u000e*\u00020%2\u0014\u00105\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u0002060\u00120\u00112\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\n2\b\u00107\u001a\u0004\u0018\u000108H\u0000\u001a.\u00109\u001a\u00020\u000e*\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u00152\u0006\u0010)\u001a\u00020\u0015H\u0000ø\u0001\u0000¢\u0006\u0004\b:\u0010+\u001a&\u0010;\u001a\u00020\u000e*\u00020%2\b\u0010<\u001a\u0004\u0018\u00010=2\u0006\u0010(\u001a\u00020\u00152\u0006\u0010)\u001a\u00020\u0015H\u0002\u001aR\u0010>\u001a\u00020\u000e*\u00020%2\u0006\u0010?\u001a\u00020!2\u0014\u00105\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u0002060\u00120\u00112&\u0010@\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010B\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020E\u0012\u0004\u0012\u00020F0AH\u0002\u001a&\u0010G\u001a\u00020\u000e*\u00020%2\b\u0010H\u001a\u0004\u0018\u00010I2\u0006\u0010(\u001a\u00020\u00152\u0006\u0010)\u001a\u00020\u0015H\u0002\u001a6\u0010J\u001a\u00020\u000e*\u00020%2\u0006\u0010K\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010(\u001a\u00020\u00152\u0006\u0010)\u001a\u00020\u0015H\u0000ø\u0001\u0000¢\u0006\u0004\bL\u0010M\u001a&\u0010N\u001a\u00020\u000e*\u00020%2\b\u0010O\u001a\u0004\u0018\u00010P2\u0006\u0010(\u001a\u00020\u00152\u0006\u0010)\u001a\u00020\u0015H\u0002\u001a.\u0010Q\u001a\u00020\u000e*\u00020%2\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\nH\u0000ø\u0001\u0000¢\u0006\u0004\bR\u0010S\u001a6\u0010Q\u001a\u00020\u000e*\u00020%2\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\n2\u0006\u0010T\u001a\u00020UH\u0000ø\u0001\u0000¢\u0006\u0004\bV\u0010W\u001a&\u0010X\u001a\u00020\u000e*\u00020%2\b\u0010Y\u001a\u0004\u0018\u00010Z2\u0006\u0010(\u001a\u00020\u00152\u0006\u0010)\u001a\u00020\u0015H\u0000\u001a&\u0010[\u001a\u00020\u000e*\u00020%2\b\u0010\\\u001a\u0004\u0018\u00010]2\u0006\u0010(\u001a\u00020\u00152\u0006\u0010)\u001a\u00020\u0015H\u0002\u001a$\u0010^\u001a\u00020\u000e*\u00020%2\u0006\u0010_\u001a\u00020`2\u0006\u0010(\u001a\u00020\u00152\u0006\u0010)\u001a\u00020\u0015H\u0000\u001a,\u0010a\u001a\u00020\u000e*\u00020%2\u0006\u0010b\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00152\u0006\u0010)\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\nH\u0002\u001aZ\u0010c\u001a\u00020\u000e*\u00020%2\u0006\u0010?\u001a\u00020!2\u0014\u00105\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u0002060\u00120\u00112\u0006\u0010\t\u001a\u00020\n2&\u0010@\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010B\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020E\u0012\u0004\u0012\u00020F0AH\u0000\u001a&\u0010d\u001a\u00020\u000e*\u00020%2\b\u0010e\u001a\u0004\u0018\u00010f2\u0006\u0010(\u001a\u00020\u00152\u0006\u0010)\u001a\u00020\u0015H\u0000\u001a&\u0010g\u001a\u00020\u000e*\u00020%2\b\u00107\u001a\u0004\u0018\u0001082\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\nH\u0000\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006h"}, m13413d2 = {"needsLetterSpacingSpan", "", "Landroidx/compose/ui/text/SpanStyle;", "getNeedsLetterSpacingSpan", "(Landroidx/compose/ui/text/SpanStyle;)Z", "createLetterSpacingSpan", "Landroid/text/style/MetricAffectingSpan;", "letterSpacing", "Landroidx/compose/ui/unit/TextUnit;", "density", "Landroidx/compose/ui/unit/Density;", "createLetterSpacingSpan-eAf_CNQ", "(JLandroidx/compose/ui/unit/Density;)Landroid/text/style/MetricAffectingSpan;", "flattenFontStylesAndApply", "", "contextFontSpanStyle", "spanStyles", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "block", "Lkotlin/Function3;", "", "isNonLinearFontScalingActive", "resolveBulletTextUnitToPx", "", "size", "contextFontSize", "resolveBulletTextUnitToPx-o2QH7mI", "(JFLandroidx/compose/ui/unit/Density;)F", "resolveLineHeightInPx", "lineHeight", "resolveLineHeightInPx-o2QH7mI", "hasFontAttributes", "Landroidx/compose/ui/text/TextStyle;", "merge", "spanStyle", "setBackground", "Landroid/text/Spannable;", TypedValues.Custom.S_COLOR, "Landroidx/compose/ui/graphics/Color;", "start", "end", "setBackground-RPmYEkk", "(Landroid/text/Spannable;JII)V", "setBaselineShift", "baselineShift", "Landroidx/compose/ui/text/style/BaselineShift;", "setBaselineShift-0ocSgnM", "setBrush", "brush", "Landroidx/compose/ui/graphics/Brush;", "alpha", "setBulletSpans", "annotations", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "textIndent", "Landroidx/compose/ui/text/style/TextIndent;", "setColor", "setColor-RPmYEkk", "setDrawStyle", "drawStyle", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "setFontAttributes", "contextTextStyle", "resolveTypeface", "Lkotlin/Function4;", "Landroidx/compose/ui/text/font/FontFamily;", "Landroidx/compose/ui/text/font/FontWeight;", "Landroidx/compose/ui/text/font/FontStyle;", "Landroidx/compose/ui/text/font/FontSynthesis;", "Landroid/graphics/Typeface;", "setFontFeatureSettings", "fontFeatureSettings", "", "setFontSize", "fontSize", "setFontSize-KmRG4DE", "(Landroid/text/Spannable;JLandroidx/compose/ui/unit/Density;II)V", "setGeometricTransform", "textGeometricTransform", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "setLineHeight", "setLineHeight-r9BaKPg", "(Landroid/text/Spannable;JFLandroidx/compose/ui/unit/Density;)V", "lineHeightStyle", "Landroidx/compose/ui/text/style/LineHeightStyle;", "setLineHeight-KmRG4DE", "(Landroid/text/Spannable;JFLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/style/LineHeightStyle;)V", "setLocaleList", "localeList", "Landroidx/compose/ui/text/intl/LocaleList;", "setShadow", "shadow", "Landroidx/compose/ui/graphics/Shadow;", "setSpan", "span", "", "setSpanStyle", "style", "setSpanStyles", "setTextDecoration", "textDecoration", "Landroidx/compose/ui/text/style/TextDecoration;", "setTextIndent", "ui-text_release"}, m13414k = 2, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSpannableExtensions.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpannableExtensions.android.kt\nandroidx/compose/ui/text/platform/extensions/SpannableExtensions_androidKt\n+ 2 TextUnit.kt\nandroidx/compose/ui/unit/TextUnitKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 6 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 7 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 8 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,603:1\n247#2:604\n34#3,6:605\n247#3,6:612\n34#3,6:618\n253#3:624\n70#3,6:625\n34#3,6:631\n1#4:611\n65#5:637\n69#5:640\n60#6:638\n70#6:641\n22#7:639\n22#7:642\n635#8:643\n635#8:644\n*S KotlinDebug\n*F\n+ 1 SpannableExtensions.android.kt\nandroidx/compose/ui/text/platform/extensions/SpannableExtensions_androidKt\n*L\n92#1:604\n139#1:605,6\n346#1:612,6\n346#1:618,6\n346#1:624\n415#1:625,6\n435#1:631,6\n482#1:637\n483#1:640\n482#1:638\n483#1:641\n482#1:639\n483#1:642\n498#1:643\n566#1:644\n*E\n"})
/* loaded from: classes2.dex */
public final class SpannableExtensions_androidKt {
    /* renamed from: createLetterSpacingSpan-eAf_CNQ, reason: not valid java name */
    private static final MetricAffectingSpan m23734createLetterSpacingSpaneAf_CNQ(long j9, Density density) {
        long jM24187getTypeUIouoOA = TextUnit.m24187getTypeUIouoOA(j9);
        TextUnitType.Companion companion = TextUnitType.INSTANCE;
        if (TextUnitType.m24216equalsimpl0(jM24187getTypeUIouoOA, companion.m24221getSpUIouoOA())) {
            return new LetterSpacingSpanPx(density.mo17764toPxR2X_6o(j9));
        }
        if (TextUnitType.m24216equalsimpl0(jM24187getTypeUIouoOA, companion.m24220getEmUIouoOA())) {
            return new LetterSpacingSpanEm(TextUnit.m24188getValueimpl(j9));
        }
        return null;
    }

    public static final void flattenFontStylesAndApply(SpanStyle spanStyle, List<AnnotatedString.Range<SpanStyle>> list, Function3<? super SpanStyle, ? super Integer, ? super Integer, Unit> function3) {
        if (list.size() <= 1) {
            if (list.isEmpty()) {
                return;
            }
            function3.invoke(merge(spanStyle, list.get(0).getItem()), Integer.valueOf(list.get(0).getStart()), Integer.valueOf(list.get(0).getEnd()));
            return;
        }
        int size = list.size();
        int i9 = size * 2;
        int[] iArr = new int[i9];
        int size2 = list.size();
        for (int i10 = 0; i10 < size2; i10++) {
            AnnotatedString.Range<SpanStyle> range = list.get(i10);
            iArr[i10] = range.getStart();
            iArr[i10 + size] = range.getEnd();
        }
        ArraysKt.sort(iArr);
        int iFirst = ArraysKt.first(iArr);
        for (int i11 = 0; i11 < i9; i11++) {
            int i12 = iArr[i11];
            if (i12 != iFirst) {
                int size3 = list.size();
                SpanStyle spanStyleMerge = spanStyle;
                for (int i13 = 0; i13 < size3; i13++) {
                    AnnotatedString.Range<SpanStyle> range2 = list.get(i13);
                    if (range2.getStart() != range2.getEnd() && AnnotatedStringKt.intersect(iFirst, i12, range2.getStart(), range2.getEnd())) {
                        spanStyleMerge = merge(spanStyleMerge, range2.getItem());
                    }
                }
                if (spanStyleMerge != null) {
                    function3.invoke(spanStyleMerge, Integer.valueOf(iFirst), Integer.valueOf(i12));
                }
                iFirst = i12;
            }
        }
    }

    private static final boolean getNeedsLetterSpacingSpan(SpanStyle spanStyle) {
        long jM24187getTypeUIouoOA = TextUnit.m24187getTypeUIouoOA(spanStyle.getLetterSpacing());
        TextUnitType.Companion companion = TextUnitType.INSTANCE;
        return TextUnitType.m24216equalsimpl0(jM24187getTypeUIouoOA, companion.m24221getSpUIouoOA()) || TextUnitType.m24216equalsimpl0(TextUnit.m24187getTypeUIouoOA(spanStyle.getLetterSpacing()), companion.m24220getEmUIouoOA());
    }

    private static final boolean hasFontAttributes(TextStyle textStyle) {
        return TextPaintExtensions_androidKt.hasFontAttributes(textStyle.toSpanStyle()) || textStyle.m23493getFontSynthesisZQGJjVo() != null;
    }

    private static final boolean isNonLinearFontScalingActive(Density density) {
        return ((double) density.getFontScale()) > 1.05d;
    }

    private static final SpanStyle merge(SpanStyle spanStyle, SpanStyle spanStyle2) {
        return spanStyle == null ? spanStyle2 : spanStyle.merge(spanStyle2);
    }

    /* renamed from: resolveBulletTextUnitToPx-o2QH7mI, reason: not valid java name */
    private static final float m23735resolveBulletTextUnitToPxo2QH7mI(long j9, float f10, Density density) {
        if (TextUnit.m24185equalsimpl0(j9, TextUnit.INSTANCE.m24199getUnspecifiedXSAIIZE())) {
            return f10;
        }
        long jM24187getTypeUIouoOA = TextUnit.m24187getTypeUIouoOA(j9);
        TextUnitType.Companion companion = TextUnitType.INSTANCE;
        if (TextUnitType.m24216equalsimpl0(jM24187getTypeUIouoOA, companion.m24221getSpUIouoOA())) {
            return density.mo17764toPxR2X_6o(j9);
        }
        if (TextUnitType.m24216equalsimpl0(jM24187getTypeUIouoOA, companion.m24220getEmUIouoOA())) {
            return TextUnit.m24188getValueimpl(j9) * f10;
        }
        return Float.NaN;
    }

    /* renamed from: resolveLineHeightInPx-o2QH7mI, reason: not valid java name */
    private static final float m23736resolveLineHeightInPxo2QH7mI(long j9, float f10, Density density) {
        float fM24188getValueimpl;
        long jM24187getTypeUIouoOA = TextUnit.m24187getTypeUIouoOA(j9);
        TextUnitType.Companion companion = TextUnitType.INSTANCE;
        if (TextUnitType.m24216equalsimpl0(jM24187getTypeUIouoOA, companion.m24221getSpUIouoOA())) {
            if (!isNonLinearFontScalingActive(density)) {
                return density.mo17764toPxR2X_6o(j9);
            }
            fM24188getValueimpl = TextUnit.m24188getValueimpl(j9) / TextUnit.m24188getValueimpl(density.mo17768toSpkPz2Gy4(f10));
        } else {
            if (!TextUnitType.m24216equalsimpl0(jM24187getTypeUIouoOA, companion.m24220getEmUIouoOA())) {
                return Float.NaN;
            }
            fM24188getValueimpl = TextUnit.m24188getValueimpl(j9);
        }
        return fM24188getValueimpl * f10;
    }

    /* renamed from: setBackground-RPmYEkk, reason: not valid java name */
    public static final void m23737setBackgroundRPmYEkk(Spannable spannable, long j9, int i9, int i10) {
        if (j9 != 16) {
            setSpan(spannable, new BackgroundColorSpan(ColorKt.m21463toArgb8_81llA(j9)), i9, i10);
        }
    }

    /* renamed from: setBaselineShift-0ocSgnM, reason: not valid java name */
    private static final void m23738setBaselineShift0ocSgnM(Spannable spannable, BaselineShift baselineShift, int i9, int i10) {
        if (baselineShift != null) {
            setSpan(spannable, new BaselineShiftSpan(baselineShift.m23756unboximpl()), i9, i10);
        }
    }

    private static final void setBrush(Spannable spannable, Brush brush, float f10, int i9, int i10) {
        if (brush != null) {
            if (brush instanceof SolidColor) {
                m23739setColorRPmYEkk(spannable, ((SolidColor) brush).getValue(), i9, i10);
            } else if (brush instanceof ShaderBrush) {
                setSpan(spannable, new ShaderBrushSpan((ShaderBrush) brush, f10), i9, i10);
            }
        }
    }

    public static final void setBulletSpans(Spannable spannable, List<? extends AnnotatedString.Range<? extends AnnotatedString.Annotation>> list, float f10, Density density, TextIndent textIndent) {
        Density density2 = density;
        float fM24188getValueimpl = 0.0f;
        if (textIndent != null) {
            long jM24187getTypeUIouoOA = TextUnit.m24187getTypeUIouoOA(textIndent.getFirstLine());
            TextUnitType.Companion companion = TextUnitType.INSTANCE;
            if (TextUnitType.m24216equalsimpl0(jM24187getTypeUIouoOA, companion.m24221getSpUIouoOA())) {
                fM24188getValueimpl = density2.mo17764toPxR2X_6o(textIndent.getFirstLine());
            } else if (TextUnitType.m24216equalsimpl0(jM24187getTypeUIouoOA, companion.m24220getEmUIouoOA())) {
                fM24188getValueimpl = TextUnit.m24188getValueimpl(textIndent.getFirstLine()) * f10;
            }
        }
        float f11 = fM24188getValueimpl;
        int size = list.size();
        int i9 = 0;
        while (i9 < size) {
            AnnotatedString.Range<? extends AnnotatedString.Annotation> range = list.get(i9);
            AnnotatedString.Annotation item = range.getItem();
            Bullet bullet = item instanceof Bullet ? (Bullet) item : null;
            if (bullet != null) {
                float fM23735resolveBulletTextUnitToPxo2QH7mI = m23735resolveBulletTextUnitToPxo2QH7mI(bullet.getSize(), f10, density2);
                float fM23735resolveBulletTextUnitToPxo2QH7mI2 = m23735resolveBulletTextUnitToPxo2QH7mI(bullet.getPadding(), f10, density2);
                if (!Float.isNaN(fM23735resolveBulletTextUnitToPxo2QH7mI) && !Float.isNaN(fM23735resolveBulletTextUnitToPxo2QH7mI2)) {
                    setSpan(spannable, new CustomBulletSpan(bullet.getShape(), fM23735resolveBulletTextUnitToPxo2QH7mI, fM23735resolveBulletTextUnitToPxo2QH7mI, fM23735resolveBulletTextUnitToPxo2QH7mI2, bullet.getBrush(), bullet.getAlpha(), bullet.getDrawStyle(), density2, f11), range.getStart(), range.getEnd());
                }
            }
            i9++;
            density2 = density;
        }
    }

    /* renamed from: setColor-RPmYEkk, reason: not valid java name */
    public static final void m23739setColorRPmYEkk(Spannable spannable, long j9, int i9, int i10) {
        if (j9 != 16) {
            setSpan(spannable, new ForegroundColorSpan(ColorKt.m21463toArgb8_81llA(j9)), i9, i10);
        }
    }

    private static final void setDrawStyle(Spannable spannable, DrawStyle drawStyle, int i9, int i10) {
        if (drawStyle != null) {
            setSpan(spannable, new DrawStyleSpan(drawStyle), i9, i10);
        }
    }

    private static final void setFontAttributes(final Spannable spannable, TextStyle textStyle, List<? extends AnnotatedString.Range<? extends AnnotatedString.Annotation>> list, final Function4<? super FontFamily, ? super FontWeight, ? super FontStyle, ? super FontSynthesis, ? extends Typeface> function4) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            AnnotatedString.Range<? extends AnnotatedString.Annotation> range = list.get(i9);
            if ((range.getItem() instanceof SpanStyle) && (TextPaintExtensions_androidKt.hasFontAttributes((SpanStyle) range.getItem()) || ((SpanStyle) range.getItem()).getFontSynthesis() != null)) {
                Intrinsics.checkNotNull(range, "null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.SpanStyle>");
                arrayList.add(range);
            }
        }
        flattenFontStylesAndApply(hasFontAttributes(textStyle) ? new SpanStyle(0L, 0L, textStyle.getFontWeight(), textStyle.m23492getFontStyle4Lr2A7w(), textStyle.m23493getFontSynthesisZQGJjVo(), textStyle.getFontFamily(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65475, (DefaultConstructorMarker) null) : null, arrayList, new Function3<SpanStyle, Integer, Integer, Unit>() { // from class: androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt.setFontAttributes.1
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

            public final void invoke(SpanStyle spanStyle, int i10, int i11) {
                Spannable spannable2 = spannable;
                Function4<FontFamily, FontWeight, FontStyle, FontSynthesis, Typeface> function42 = function4;
                FontFamily fontFamily = spanStyle.getFontFamily();
                FontWeight fontWeight = spanStyle.getFontWeight();
                if (fontWeight == null) {
                    fontWeight = FontWeight.INSTANCE.getNormal();
                }
                FontStyle fontStyle = spanStyle.getFontStyle();
                FontStyle fontStyleM23568boximpl = FontStyle.m23568boximpl(fontStyle != null ? fontStyle.m23574unboximpl() : FontStyle.INSTANCE.m23578getNormal_LCdwA());
                FontSynthesis fontSynthesis = spanStyle.getFontSynthesis();
                spannable2.setSpan(new TypefaceSpan(function42.invoke(fontFamily, fontWeight, fontStyleM23568boximpl, FontSynthesis.m23579boximpl(fontSynthesis != null ? fontSynthesis.getValue() : FontSynthesis.INSTANCE.m23588getAllGVVA2EU()))), i10, i11, 33);
            }
        });
    }

    private static final void setFontFeatureSettings(Spannable spannable, String str, int i9, int i10) {
        if (str != null) {
            setSpan(spannable, new FontFeatureSpan(str), i9, i10);
        }
    }

    /* renamed from: setFontSize-KmRG4DE, reason: not valid java name */
    public static final void m23740setFontSizeKmRG4DE(Spannable spannable, long j9, Density density, int i9, int i10) {
        long jM24187getTypeUIouoOA = TextUnit.m24187getTypeUIouoOA(j9);
        TextUnitType.Companion companion = TextUnitType.INSTANCE;
        if (TextUnitType.m24216equalsimpl0(jM24187getTypeUIouoOA, companion.m24221getSpUIouoOA())) {
            setSpan(spannable, new AbsoluteSizeSpan(MathKt.roundToInt(density.mo17764toPxR2X_6o(j9)), false), i9, i10);
        } else if (TextUnitType.m24216equalsimpl0(jM24187getTypeUIouoOA, companion.m24220getEmUIouoOA())) {
            setSpan(spannable, new RelativeSizeSpan(TextUnit.m24188getValueimpl(j9)), i9, i10);
        }
    }

    private static final void setGeometricTransform(Spannable spannable, TextGeometricTransform textGeometricTransform, int i9, int i10) {
        if (textGeometricTransform != null) {
            setSpan(spannable, new ScaleXSpan(textGeometricTransform.getScaleX()), i9, i10);
            setSpan(spannable, new SkewXSpan(textGeometricTransform.getSkewX()), i9, i10);
        }
    }

    /* renamed from: setLineHeight-KmRG4DE, reason: not valid java name */
    public static final void m23741setLineHeightKmRG4DE(Spannable spannable, long j9, float f10, Density density, LineHeightStyle lineHeightStyle) {
        float fM23736resolveLineHeightInPxo2QH7mI = m23736resolveLineHeightInPxo2QH7mI(j9, f10, density);
        if (Float.isNaN(fM23736resolveLineHeightInPxo2QH7mI)) {
            return;
        }
        setSpan(spannable, new LineHeightStyleSpan(fM23736resolveLineHeightInPxo2QH7mI, 0, (spannable.length() == 0 || StringsKt.last(spannable) == '\n') ? spannable.length() + 1 : spannable.length(), LineHeightStyle.Trim.m23863isTrimFirstLineTopimpl$ui_text_release(lineHeightStyle.getTrim()), LineHeightStyle.Trim.m23864isTrimLastLineBottomimpl$ui_text_release(lineHeightStyle.getTrim()), lineHeightStyle.getAlignment(), LineHeightStyle.Mode.m23852equalsimpl0(lineHeightStyle.getMode(), LineHeightStyle.Mode.INSTANCE.m23857getMinimumlzQqcRY())), 0, spannable.length());
    }

    /* renamed from: setLineHeight-r9BaKPg, reason: not valid java name */
    public static final void m23742setLineHeightr9BaKPg(Spannable spannable, long j9, float f10, Density density) {
        float fM23736resolveLineHeightInPxo2QH7mI = m23736resolveLineHeightInPxo2QH7mI(j9, f10, density);
        if (Float.isNaN(fM23736resolveLineHeightInPxo2QH7mI)) {
            return;
        }
        setSpan(spannable, new LineHeightSpan(fM23736resolveLineHeightInPxo2QH7mI), 0, spannable.length());
    }

    public static final void setLocaleList(Spannable spannable, LocaleList localeList, int i9, int i10) {
        if (localeList != null) {
            setSpan(spannable, LocaleListHelperMethods.INSTANCE.localeSpan(localeList), i9, i10);
        }
    }

    private static final void setShadow(Spannable spannable, Shadow shadow, int i9, int i10) {
        if (shadow != null) {
            setSpan(spannable, new ShadowSpan(ColorKt.m21463toArgb8_81llA(shadow.getColor()), Float.intBitsToFloat((int) (shadow.getOffset() >> 32)), Float.intBitsToFloat((int) (shadow.getOffset() & 4294967295L)), TextPaintExtensions_androidKt.correctBlurRadius(shadow.getBlurRadius())), i9, i10);
        }
    }

    public static final void setSpan(Spannable spannable, Object obj, int i9, int i10) {
        spannable.setSpan(obj, i9, i10, 33);
    }

    private static final void setSpanStyle(Spannable spannable, SpanStyle spanStyle, int i9, int i10, Density density) {
        m23738setBaselineShift0ocSgnM(spannable, spanStyle.getBaselineShift(), i9, i10);
        m23739setColorRPmYEkk(spannable, spanStyle.m23401getColor0d7_KjU(), i9, i10);
        setBrush(spannable, spanStyle.getBrush(), spanStyle.getAlpha(), i9, i10);
        setTextDecoration(spannable, spanStyle.getTextDecoration(), i9, i10);
        m23740setFontSizeKmRG4DE(spannable, spanStyle.getFontSize(), density, i9, i10);
        setFontFeatureSettings(spannable, spanStyle.getFontFeatureSettings(), i9, i10);
        setGeometricTransform(spannable, spanStyle.getTextGeometricTransform(), i9, i10);
        setLocaleList(spannable, spanStyle.getLocaleList(), i9, i10);
        m23737setBackgroundRPmYEkk(spannable, spanStyle.getBackground(), i9, i10);
        setShadow(spannable, spanStyle.getShadow(), i9, i10);
        setDrawStyle(spannable, spanStyle.getDrawStyle(), i9, i10);
    }

    public static final void setSpanStyles(Spannable spannable, TextStyle textStyle, List<? extends AnnotatedString.Range<? extends AnnotatedString.Annotation>> list, Density density, Function4<? super FontFamily, ? super FontWeight, ? super FontStyle, ? super FontSynthesis, ? extends Typeface> function4) {
        MetricAffectingSpan metricAffectingSpanM23734createLetterSpacingSpaneAf_CNQ;
        setFontAttributes(spannable, textStyle, list, function4);
        int size = list.size();
        boolean z9 = false;
        for (int i9 = 0; i9 < size; i9++) {
            AnnotatedString.Range<? extends AnnotatedString.Annotation> range = list.get(i9);
            if (range.getItem() instanceof SpanStyle) {
                int start = range.getStart();
                int end = range.getEnd();
                if (start >= 0 && start < spannable.length() && end > start && end <= spannable.length()) {
                    setSpanStyle(spannable, (SpanStyle) range.getItem(), start, end, density);
                    if (getNeedsLetterSpacingSpan((SpanStyle) range.getItem())) {
                        z9 = true;
                    }
                }
            }
        }
        if (z9) {
            int size2 = list.size();
            for (int i10 = 0; i10 < size2; i10++) {
                AnnotatedString.Range<? extends AnnotatedString.Annotation> range2 = list.get(i10);
                AnnotatedString.Annotation item = range2.getItem();
                if (item instanceof SpanStyle) {
                    int start2 = range2.getStart();
                    int end2 = range2.getEnd();
                    if (start2 >= 0 && start2 < spannable.length() && end2 > start2 && end2 <= spannable.length() && (metricAffectingSpanM23734createLetterSpacingSpaneAf_CNQ = m23734createLetterSpacingSpaneAf_CNQ(((SpanStyle) item).getLetterSpacing(), density)) != null) {
                        setSpan(spannable, metricAffectingSpanM23734createLetterSpacingSpaneAf_CNQ, start2, end2);
                    }
                }
            }
        }
    }

    public static final void setTextDecoration(Spannable spannable, TextDecoration textDecoration, int i9, int i10) {
        if (textDecoration != null) {
            TextDecoration.Companion companion = TextDecoration.INSTANCE;
            setSpan(spannable, new TextDecorationSpan(textDecoration.contains(companion.getUnderline()), textDecoration.contains(companion.getLineThrough())), i9, i10);
        }
    }

    public static final void setTextIndent(Spannable spannable, TextIndent textIndent, float f10, Density density) {
        if (textIndent != null) {
            if ((TextUnit.m24185equalsimpl0(textIndent.getFirstLine(), TextUnitKt.getSp(0)) && TextUnit.m24185equalsimpl0(textIndent.getRestLine(), TextUnitKt.getSp(0))) || TextUnit.m24186getRawTypeimpl(textIndent.getFirstLine()) == 0 || TextUnit.m24186getRawTypeimpl(textIndent.getRestLine()) == 0) {
                return;
            }
            long jM24187getTypeUIouoOA = TextUnit.m24187getTypeUIouoOA(textIndent.getFirstLine());
            TextUnitType.Companion companion = TextUnitType.INSTANCE;
            float fM24188getValueimpl = 0.0f;
            float fMo17764toPxR2X_6o = TextUnitType.m24216equalsimpl0(jM24187getTypeUIouoOA, companion.m24221getSpUIouoOA()) ? density.mo17764toPxR2X_6o(textIndent.getFirstLine()) : TextUnitType.m24216equalsimpl0(jM24187getTypeUIouoOA, companion.m24220getEmUIouoOA()) ? TextUnit.m24188getValueimpl(textIndent.getFirstLine()) * f10 : 0.0f;
            long jM24187getTypeUIouoOA2 = TextUnit.m24187getTypeUIouoOA(textIndent.getRestLine());
            if (TextUnitType.m24216equalsimpl0(jM24187getTypeUIouoOA2, companion.m24221getSpUIouoOA())) {
                fM24188getValueimpl = density.mo17764toPxR2X_6o(textIndent.getRestLine());
            } else if (TextUnitType.m24216equalsimpl0(jM24187getTypeUIouoOA2, companion.m24220getEmUIouoOA())) {
                fM24188getValueimpl = TextUnit.m24188getValueimpl(textIndent.getRestLine()) * f10;
            }
            setSpan(spannable, new LeadingMarginSpan.Standard((int) Math.ceil(fMo17764toPxR2X_6o), (int) Math.ceil(fM24188getValueimpl)), 0, spannable.length());
        }
    }
}
