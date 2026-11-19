package androidx.compose.p011ui.text.platform.extensions;

import android.graphics.Typeface;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.ScaleXSpan;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.ColorKt;
import androidx.compose.p011ui.graphics.ShaderBrush;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.SolidColor;
import androidx.compose.p011ui.graphics.drawscope.DrawStyle;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.AnnotatedStringKt;
import androidx.compose.p011ui.text.Bullet;
import androidx.compose.p011ui.text.PlatformSpanStyle;
import androidx.compose.p011ui.text.SpanStyle;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.android.style.BaselineShiftSpan;
import androidx.compose.p011ui.text.android.style.FontFeatureSpan;
import androidx.compose.p011ui.text.android.style.LetterSpacingSpanEm;
import androidx.compose.p011ui.text.android.style.LetterSpacingSpanPx;
import androidx.compose.p011ui.text.android.style.LineHeightSpan;
import androidx.compose.p011ui.text.android.style.LineHeightStyleSpan;
import androidx.compose.p011ui.text.android.style.ShadowSpan;
import androidx.compose.p011ui.text.android.style.SkewXSpan;
import androidx.compose.p011ui.text.android.style.TextDecorationSpan;
import androidx.compose.p011ui.text.android.style.TypefaceSpan;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontSynthesis;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.intl.LocaleList;
import androidx.compose.p011ui.text.platform.style.CustomBulletSpan;
import androidx.compose.p011ui.text.platform.style.DrawStyleSpan;
import androidx.compose.p011ui.text.platform.style.ShaderBrushSpan;
import androidx.compose.p011ui.text.style.BaselineShift;
import androidx.compose.p011ui.text.style.LineHeightStyle;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextGeometricTransform;
import androidx.compose.p011ui.text.style.TextIndent;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.TextUnit;
import androidx.compose.p011ui.unit.TextUnitKt;
import androidx.compose.p011ui.unit.TextUnitType;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.AbstractC5855p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6474f;
import p152r6.InterfaceC6475g;
import p169t6.AbstractC6600a;

@Metadata(m5109d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\u001a+\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a-\u0010\u000f\u001a\u00020\u0006*\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001aC\u0010\u0015\u001a\u00020\u0006*\u00020\u00002\u0014\u0010\u0014\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u00120\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a*\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a6\u0010!\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001dH\u0000ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001a.\u0010!\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0000ø\u0001\u0000¢\u0006\u0004\b\"\u0010#\u001a*\u0010%\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002ø\u0001\u0000¢\u0006\u0004\b$\u0010\u001a\u001a\u0017\u0010'\u001a\u00020&2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b'\u0010(\u001aa\u00102\u001a\u00020\u0006*\u00020\u00002\u0006\u0010*\u001a\u00020)2\u0014\u0010\u0014\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u00120\u00112\u0006\u0010\u000e\u001a\u00020\r2&\u00101\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010,\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u0002000+H\u0000¢\u0006\u0004\b2\u00103\u001a3\u00106\u001a\u00020\u0006*\u00020\u00002\u0006\u00105\u001a\u0002042\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b6\u00107\u001aY\u00108\u001a\u00020\u0006*\u00020\u00002\u0006\u0010*\u001a\u00020)2\u0014\u0010\u0014\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u00120\u00112&\u00101\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010,\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u0002000+H\u0002¢\u0006\u0004\b8\u00109\u001aM\u0010>\u001a\u00020\u00062\b\u0010:\u001a\u0004\u0018\u0001042\u0012\u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002040\u00120\u00112\u001e\u0010=\u001a\u001a\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060<H\u0000¢\u0006\u0004\b>\u0010?\u001a$\u0010D\u001a\u0004\u0018\u00010A2\u0006\u0010@\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\rH\u0002ø\u0001\u0000¢\u0006\u0004\bB\u0010C\u001a-\u0010G\u001a\u00020\u0006*\u00020\u00002\b\u0010F\u001a\u0004\u0018\u00010E2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\bG\u0010H\u001a-\u0010K\u001a\u00020\u0006*\u00020\u00002\b\u0010J\u001a\u0004\u0018\u00010I2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\bK\u0010L\u001a.\u0010Q\u001a\u00020\u0006*\u00020\u00002\u0006\u0010N\u001a\u00020M2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\bO\u0010P\u001a-\u0010T\u001a\u00020\u0006*\u00020\u00002\b\u0010S\u001a\u0004\u0018\u00010R2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0004\bT\u0010U\u001a-\u0010X\u001a\u00020\u0006*\u00020\u00002\b\u0010W\u001a\u0004\u0018\u00010V2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\bX\u0010Y\u001a-\u0010\\\u001a\u00020\u0006*\u00020\u00002\b\u0010[\u001a\u0004\u0018\u00010Z2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\\\u0010]\u001a6\u0010a\u001a\u00020\u0006*\u00020\u00002\u0006\u0010^\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b_\u0010`\u001a-\u0010d\u001a\u00020\u0006*\u00020\u00002\b\u0010c\u001a\u0004\u0018\u00010b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0004\bd\u0010e\u001a.\u0010g\u001a\u00020\u0006*\u00020\u00002\u0006\u0010N\u001a\u00020M2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\bf\u0010P\u001a0\u0010l\u001a\u00020\u0006*\u00020\u00002\b\u0010i\u001a\u0004\u0018\u00010h2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\bj\u0010k\u001a5\u0010p\u001a\u00020\u0006*\u00020\u00002\b\u0010n\u001a\u0004\u0018\u00010m2\u0006\u0010o\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\bp\u0010q\u001a\u0013\u0010r\u001a\u00020&*\u00020)H\u0002¢\u0006\u0004\br\u0010s\u001a\u001d\u0010u\u001a\u000204*\u0004\u0018\u0001042\u0006\u0010t\u001a\u000204H\u0002¢\u0006\u0004\bu\u0010v\"\u0018\u0010y\u001a\u00020&*\u0002048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bw\u0010x\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006z"}, m5110d2 = {"Landroid/text/Spannable;", "", "span", "", "start", "end", "Ld6/s;", "setSpan", "(Landroid/text/Spannable;Ljava/lang/Object;II)V", "Landroidx/compose/ui/text/style/TextIndent;", "textIndent", "", "contextFontSize", "Landroidx/compose/ui/unit/Density;", "density", "setTextIndent", "(Landroid/text/Spannable;Landroidx/compose/ui/text/style/TextIndent;FLandroidx/compose/ui/unit/Density;)V", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "annotations", "setBulletSpans", "(Landroid/text/Spannable;Ljava/util/List;FLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/style/TextIndent;)V", "Landroidx/compose/ui/unit/TextUnit;", "size", "resolveBulletTextUnitToPx-o2QH7mI", "(JFLandroidx/compose/ui/unit/Density;)F", "resolveBulletTextUnitToPx", "lineHeight", "Landroidx/compose/ui/text/style/LineHeightStyle;", "lineHeightStyle", "setLineHeight-KmRG4DE", "(Landroid/text/Spannable;JFLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/style/LineHeightStyle;)V", "setLineHeight", "setLineHeight-r9BaKPg", "(Landroid/text/Spannable;JFLandroidx/compose/ui/unit/Density;)V", "resolveLineHeightInPx-o2QH7mI", "resolveLineHeightInPx", "", "isNonLinearFontScalingActive", "(Landroidx/compose/ui/unit/Density;)Z", "Landroidx/compose/ui/text/TextStyle;", "contextTextStyle", "Lkotlin/Function4;", "Landroidx/compose/ui/text/font/FontFamily;", "Landroidx/compose/ui/text/font/FontWeight;", "Landroidx/compose/ui/text/font/FontStyle;", "Landroidx/compose/ui/text/font/FontSynthesis;", "Landroid/graphics/Typeface;", "resolveTypeface", "setSpanStyles", "(Landroid/text/Spannable;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;Landroidx/compose/ui/unit/Density;Lr6/g;)V", "Landroidx/compose/ui/text/SpanStyle;", "style", "setSpanStyle", "(Landroid/text/Spannable;Landroidx/compose/ui/text/SpanStyle;IILandroidx/compose/ui/unit/Density;)V", "setFontAttributes", "(Landroid/text/Spannable;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;Lr6/g;)V", "contextFontSpanStyle", "spanStyles", "Lkotlin/Function3;", "block", "flattenFontStylesAndApply", "(Landroidx/compose/ui/text/SpanStyle;Ljava/util/List;Lr6/f;)V", "letterSpacing", "Landroid/text/style/MetricAffectingSpan;", "createLetterSpacingSpan-eAf_CNQ", "(JLandroidx/compose/ui/unit/Density;)Landroid/text/style/MetricAffectingSpan;", "createLetterSpacingSpan", "Landroidx/compose/ui/graphics/Shadow;", "shadow", "setShadow", "(Landroid/text/Spannable;Landroidx/compose/ui/graphics/Shadow;II)V", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "drawStyle", "setDrawStyle", "(Landroid/text/Spannable;Landroidx/compose/ui/graphics/drawscope/DrawStyle;II)V", "Landroidx/compose/ui/graphics/Color;", TypedValues.Custom.S_COLOR, "setBackground-RPmYEkk", "(Landroid/text/Spannable;JII)V", "setBackground", "Landroidx/compose/ui/text/intl/LocaleList;", "localeList", "setLocaleList", "(Landroid/text/Spannable;Landroidx/compose/ui/text/intl/LocaleList;II)V", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "textGeometricTransform", "setGeometricTransform", "(Landroid/text/Spannable;Landroidx/compose/ui/text/style/TextGeometricTransform;II)V", "", "fontFeatureSettings", "setFontFeatureSettings", "(Landroid/text/Spannable;Ljava/lang/String;II)V", "fontSize", "setFontSize-KmRG4DE", "(Landroid/text/Spannable;JLandroidx/compose/ui/unit/Density;II)V", "setFontSize", "Landroidx/compose/ui/text/style/TextDecoration;", "textDecoration", "setTextDecoration", "(Landroid/text/Spannable;Landroidx/compose/ui/text/style/TextDecoration;II)V", "setColor-RPmYEkk", "setColor", "Landroidx/compose/ui/text/style/BaselineShift;", "baselineShift", "setBaselineShift-0ocSgnM", "(Landroid/text/Spannable;Landroidx/compose/ui/text/style/BaselineShift;II)V", "setBaselineShift", "Landroidx/compose/ui/graphics/Brush;", "brush", "alpha", "setBrush", "(Landroid/text/Spannable;Landroidx/compose/ui/graphics/Brush;FII)V", "hasFontAttributes", "(Landroidx/compose/ui/text/TextStyle;)Z", "spanStyle", "merge", "(Landroidx/compose/ui/text/SpanStyle;Landroidx/compose/ui/text/SpanStyle;)Landroidx/compose/ui/text/SpanStyle;", "getNeedsLetterSpacingSpan", "(Landroidx/compose/ui/text/SpanStyle;)Z", "needsLetterSpacingSpan", "ui-text_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSpannableExtensions.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpannableExtensions.android.kt\nandroidx/compose/ui/text/platform/extensions/SpannableExtensions_androidKt\n+ 2 TextUnit.kt\nandroidx/compose/ui/unit/TextUnitKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 6 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 7 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 8 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,603:1\n247#2:604\n34#3,6:605\n247#3,6:612\n34#3,6:618\n253#3:624\n70#3,6:625\n34#3,6:631\n1#4:611\n65#5:637\n69#5:640\n60#6:638\n70#6:641\n22#7:639\n22#7:642\n635#8:643\n635#8:644\n*S KotlinDebug\n*F\n+ 1 SpannableExtensions.android.kt\nandroidx/compose/ui/text/platform/extensions/SpannableExtensions_androidKt\n*L\n92#1:604\n139#1:605,6\n346#1:612,6\n346#1:618,6\n346#1:624\n415#1:625,6\n435#1:631,6\n482#1:637\n483#1:640\n482#1:638\n483#1:641\n482#1:639\n483#1:642\n498#1:643\n566#1:644\n*E\n"})
/* loaded from: classes2.dex */
public final class SpannableExtensions_androidKt {
    /* renamed from: createLetterSpacingSpan-eAf_CNQ, reason: not valid java name */
    private static final MetricAffectingSpan m13044createLetterSpacingSpaneAf_CNQ(long j7, Density density) {
        long jM13498getTypeUIouoOA = TextUnit.m13498getTypeUIouoOA(j7);
        TextUnitType.Companion companion = TextUnitType.INSTANCE;
        if (TextUnitType.m13527equalsimpl0(jM13498getTypeUIouoOA, companion.m13532getSpUIouoOA())) {
            return new LetterSpacingSpanPx(density.mo6902toPxR2X_6o(j7));
        }
        if (TextUnitType.m13527equalsimpl0(jM13498getTypeUIouoOA, companion.m13531getEmUIouoOA())) {
            return new LetterSpacingSpanEm(TextUnit.m13499getValueimpl(j7));
        }
        return null;
    }

    public static final void flattenFontStylesAndApply(@Nullable SpanStyle spanStyle, @NotNull List<AnnotatedString.Range<SpanStyle>> list, @NotNull InterfaceC6474f interfaceC6474f) {
        if (list.size() <= 1) {
            if (list.isEmpty()) {
                return;
            }
            interfaceC6474f.invoke(merge(spanStyle, list.get(0).getItem()), Integer.valueOf(list.get(0).getStart()), Integer.valueOf(list.get(0).getEnd()));
            return;
        }
        int size = list.size();
        int i = size * 2;
        int[] iArr = new int[i];
        int size2 = list.size();
        for (int i8 = 0; i8 < size2; i8++) {
            AnnotatedString.Range<SpanStyle> range = list.get(i8);
            iArr[i8] = range.getStart();
            iArr[i8 + size] = range.getEnd();
        }
        if (i > 1) {
            Arrays.sort(iArr);
        }
        if (i == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        int i9 = iArr[0];
        for (int i10 = 0; i10 < i; i10++) {
            int i11 = iArr[i10];
            if (i11 != i9) {
                int size3 = list.size();
                SpanStyle spanStyleMerge = spanStyle;
                for (int i12 = 0; i12 < size3; i12++) {
                    AnnotatedString.Range<SpanStyle> range2 = list.get(i12);
                    if (range2.getStart() != range2.getEnd() && AnnotatedStringKt.intersect(i9, i11, range2.getStart(), range2.getEnd())) {
                        spanStyleMerge = merge(spanStyleMerge, range2.getItem());
                    }
                }
                if (spanStyleMerge != null) {
                    interfaceC6474f.invoke(spanStyleMerge, Integer.valueOf(i9), Integer.valueOf(i11));
                }
                i9 = i11;
            }
        }
    }

    private static final boolean getNeedsLetterSpacingSpan(SpanStyle spanStyle) {
        long jM13498getTypeUIouoOA = TextUnit.m13498getTypeUIouoOA(spanStyle.getLetterSpacing());
        TextUnitType.Companion companion = TextUnitType.INSTANCE;
        return TextUnitType.m13527equalsimpl0(jM13498getTypeUIouoOA, companion.m13532getSpUIouoOA()) || TextUnitType.m13527equalsimpl0(TextUnit.m13498getTypeUIouoOA(spanStyle.getLetterSpacing()), companion.m13531getEmUIouoOA());
    }

    private static final boolean hasFontAttributes(TextStyle textStyle) {
        return TextPaintExtensions_androidKt.hasFontAttributes(textStyle.toSpanStyle()) || textStyle.m12803getFontSynthesisZQGJjVo() != null;
    }

    private static final boolean isNonLinearFontScalingActive(Density density) {
        return ((double) density.getFontScale()) > 1.05d;
    }

    private static final SpanStyle merge(SpanStyle spanStyle, SpanStyle spanStyle2) {
        return spanStyle == null ? spanStyle2 : spanStyle.merge(spanStyle2);
    }

    /* renamed from: resolveBulletTextUnitToPx-o2QH7mI, reason: not valid java name */
    private static final float m13045resolveBulletTextUnitToPxo2QH7mI(long j7, float f, Density density) {
        if (TextUnit.m13496equalsimpl0(j7, TextUnit.INSTANCE.m13510getUnspecifiedXSAIIZE())) {
            return f;
        }
        long jM13498getTypeUIouoOA = TextUnit.m13498getTypeUIouoOA(j7);
        TextUnitType.Companion companion = TextUnitType.INSTANCE;
        if (TextUnitType.m13527equalsimpl0(jM13498getTypeUIouoOA, companion.m13532getSpUIouoOA())) {
            return density.mo6902toPxR2X_6o(j7);
        }
        if (TextUnitType.m13527equalsimpl0(jM13498getTypeUIouoOA, companion.m13531getEmUIouoOA())) {
            return TextUnit.m13499getValueimpl(j7) * f;
        }
        return Float.NaN;
    }

    /* renamed from: resolveLineHeightInPx-o2QH7mI, reason: not valid java name */
    private static final float m13046resolveLineHeightInPxo2QH7mI(long j7, float f, Density density) {
        float fM13499getValueimpl;
        long jM13498getTypeUIouoOA = TextUnit.m13498getTypeUIouoOA(j7);
        TextUnitType.Companion companion = TextUnitType.INSTANCE;
        if (TextUnitType.m13527equalsimpl0(jM13498getTypeUIouoOA, companion.m13532getSpUIouoOA())) {
            if (!isNonLinearFontScalingActive(density)) {
                return density.mo6902toPxR2X_6o(j7);
            }
            fM13499getValueimpl = TextUnit.m13499getValueimpl(j7) / TextUnit.m13499getValueimpl(density.mo6906toSpkPz2Gy4(f));
        } else {
            if (!TextUnitType.m13527equalsimpl0(jM13498getTypeUIouoOA, companion.m13531getEmUIouoOA())) {
                return Float.NaN;
            }
            fM13499getValueimpl = TextUnit.m13499getValueimpl(j7);
        }
        return fM13499getValueimpl * f;
    }

    /* renamed from: setBackground-RPmYEkk, reason: not valid java name */
    public static final void m13047setBackgroundRPmYEkk(@NotNull Spannable spannable, long j7, int i, int i8) {
        if (j7 != 16) {
            setSpan(spannable, new BackgroundColorSpan(ColorKt.m10736toArgb8_81llA(j7)), i, i8);
        }
    }

    /* renamed from: setBaselineShift-0ocSgnM, reason: not valid java name */
    private static final void m13048setBaselineShift0ocSgnM(Spannable spannable, BaselineShift baselineShift, int i, int i8) {
        if (baselineShift != null) {
            setSpan(spannable, new BaselineShiftSpan(baselineShift.m13067unboximpl()), i, i8);
        }
    }

    private static final void setBrush(Spannable spannable, Brush brush, float f, int i, int i8) {
        if (brush != null) {
            if (brush instanceof SolidColor) {
                m13049setColorRPmYEkk(spannable, ((SolidColor) brush).getValue(), i, i8);
            } else if (brush instanceof ShaderBrush) {
                setSpan(spannable, new ShaderBrushSpan((ShaderBrush) brush, f), i, i8);
            }
        }
    }

    public static final void setBulletSpans(@NotNull Spannable spannable, @NotNull List<? extends AnnotatedString.Range<? extends AnnotatedString.Annotation>> list, float f, @NotNull Density density, @Nullable TextIndent textIndent) {
        Density density2 = density;
        float fM13499getValueimpl = 0.0f;
        if (textIndent != null) {
            long jM13498getTypeUIouoOA = TextUnit.m13498getTypeUIouoOA(textIndent.getFirstLine());
            TextUnitType.Companion companion = TextUnitType.INSTANCE;
            if (TextUnitType.m13527equalsimpl0(jM13498getTypeUIouoOA, companion.m13532getSpUIouoOA())) {
                fM13499getValueimpl = density2.mo6902toPxR2X_6o(textIndent.getFirstLine());
            } else if (TextUnitType.m13527equalsimpl0(jM13498getTypeUIouoOA, companion.m13531getEmUIouoOA())) {
                fM13499getValueimpl = TextUnit.m13499getValueimpl(textIndent.getFirstLine()) * f;
            }
        }
        float f7 = fM13499getValueimpl;
        int size = list.size();
        int i = 0;
        while (i < size) {
            AnnotatedString.Range<? extends AnnotatedString.Annotation> range = list.get(i);
            AnnotatedString.Annotation item = range.getItem();
            Bullet bullet = item instanceof Bullet ? (Bullet) item : null;
            if (bullet != null) {
                float fM13045resolveBulletTextUnitToPxo2QH7mI = m13045resolveBulletTextUnitToPxo2QH7mI(bullet.getSize(), f, density2);
                float fM13045resolveBulletTextUnitToPxo2QH7mI2 = m13045resolveBulletTextUnitToPxo2QH7mI(bullet.getPadding(), f, density2);
                if (!Float.isNaN(fM13045resolveBulletTextUnitToPxo2QH7mI) && !Float.isNaN(fM13045resolveBulletTextUnitToPxo2QH7mI2)) {
                    setSpan(spannable, new CustomBulletSpan(bullet.getShape(), fM13045resolveBulletTextUnitToPxo2QH7mI, fM13045resolveBulletTextUnitToPxo2QH7mI, fM13045resolveBulletTextUnitToPxo2QH7mI2, bullet.getBrush(), bullet.getAlpha(), bullet.getDrawStyle(), density2, f7), range.getStart(), range.getEnd());
                }
            }
            i++;
            density2 = density;
        }
    }

    /* renamed from: setColor-RPmYEkk, reason: not valid java name */
    public static final void m13049setColorRPmYEkk(@NotNull Spannable spannable, long j7, int i, int i8) {
        if (j7 != 16) {
            setSpan(spannable, new ForegroundColorSpan(ColorKt.m10736toArgb8_81llA(j7)), i, i8);
        }
    }

    private static final void setDrawStyle(Spannable spannable, DrawStyle drawStyle, int i, int i8) {
        if (drawStyle != null) {
            setSpan(spannable, new DrawStyleSpan(drawStyle), i, i8);
        }
    }

    private static final void setFontAttributes(final Spannable spannable, TextStyle textStyle, List<? extends AnnotatedString.Range<? extends AnnotatedString.Annotation>> list, final InterfaceC6475g interfaceC6475g) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            AnnotatedString.Range<? extends AnnotatedString.Annotation> range = list.get(i);
            if ((range.getItem() instanceof SpanStyle) && (TextPaintExtensions_androidKt.hasFontAttributes((SpanStyle) range.getItem()) || ((SpanStyle) range.getItem()).getFontSynthesis() != null)) {
                AbstractC5830k.m5328e(range, "null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.SpanStyle>");
                arrayList.add(range);
            }
        }
        flattenFontStylesAndApply(hasFontAttributes(textStyle) ? new SpanStyle(0L, 0L, textStyle.getFontWeight(), textStyle.m12802getFontStyle4Lr2A7w(), textStyle.m12803getFontSynthesisZQGJjVo(), textStyle.getFontFamily(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65475, (AbstractC5824e) null) : null, arrayList, new InterfaceC6474f() { // from class: androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt.setFontAttributes.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // p152r6.InterfaceC6474f
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((SpanStyle) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
                return C5443s.f8405a;
            }

            public final void invoke(SpanStyle spanStyle, int i8, int i9) {
                Spannable spannable2 = spannable;
                InterfaceC6475g interfaceC6475g2 = interfaceC6475g;
                FontFamily fontFamily = spanStyle.getFontFamily();
                FontWeight fontWeight = spanStyle.getFontWeight();
                if (fontWeight == null) {
                    fontWeight = FontWeight.INSTANCE.getNormal();
                }
                FontStyle fontStyle = spanStyle.getFontStyle();
                FontStyle fontStyleM12878boximpl = FontStyle.m12878boximpl(fontStyle != null ? fontStyle.m12884unboximpl() : FontStyle.INSTANCE.m12888getNormal_LCdwA());
                FontSynthesis fontSynthesis = spanStyle.getFontSynthesis();
                spannable2.setSpan(new TypefaceSpan((Typeface) interfaceC6475g2.invoke(fontFamily, fontWeight, fontStyleM12878boximpl, FontSynthesis.m12889boximpl(fontSynthesis != null ? fontSynthesis.getValue() : FontSynthesis.INSTANCE.m12898getAllGVVA2EU()))), i8, i9, 33);
            }
        });
    }

    private static final void setFontFeatureSettings(Spannable spannable, String str, int i, int i8) {
        if (str != null) {
            setSpan(spannable, new FontFeatureSpan(str), i, i8);
        }
    }

    /* renamed from: setFontSize-KmRG4DE, reason: not valid java name */
    public static final void m13050setFontSizeKmRG4DE(@NotNull Spannable spannable, long j7, @NotNull Density density, int i, int i8) {
        long jM13498getTypeUIouoOA = TextUnit.m13498getTypeUIouoOA(j7);
        TextUnitType.Companion companion = TextUnitType.INSTANCE;
        if (TextUnitType.m13527equalsimpl0(jM13498getTypeUIouoOA, companion.m13532getSpUIouoOA())) {
            setSpan(spannable, new AbsoluteSizeSpan(AbstractC6600a.m6241q(density.mo6902toPxR2X_6o(j7)), false), i, i8);
        } else if (TextUnitType.m13527equalsimpl0(jM13498getTypeUIouoOA, companion.m13531getEmUIouoOA())) {
            setSpan(spannable, new RelativeSizeSpan(TextUnit.m13499getValueimpl(j7)), i, i8);
        }
    }

    private static final void setGeometricTransform(Spannable spannable, TextGeometricTransform textGeometricTransform, int i, int i8) {
        if (textGeometricTransform != null) {
            setSpan(spannable, new ScaleXSpan(textGeometricTransform.getScaleX()), i, i8);
            setSpan(spannable, new SkewXSpan(textGeometricTransform.getSkewX()), i, i8);
        }
    }

    /* renamed from: setLineHeight-KmRG4DE, reason: not valid java name */
    public static final void m13051setLineHeightKmRG4DE(@NotNull Spannable spannable, long j7, float f, @NotNull Density density, @NotNull LineHeightStyle lineHeightStyle) {
        float fM13046resolveLineHeightInPxo2QH7mI = m13046resolveLineHeightInPxo2QH7mI(j7, f, density);
        if (Float.isNaN(fM13046resolveLineHeightInPxo2QH7mI)) {
            return;
        }
        setSpan(spannable, new LineHeightStyleSpan(fM13046resolveLineHeightInPxo2QH7mI, 0, (spannable.length() == 0 || AbstractC5855p.m5383Q(spannable) == '\n') ? spannable.length() + 1 : spannable.length(), LineHeightStyle.Trim.m13174isTrimFirstLineTopimpl$ui_text_release(lineHeightStyle.getTrim()), LineHeightStyle.Trim.m13175isTrimLastLineBottomimpl$ui_text_release(lineHeightStyle.getTrim()), lineHeightStyle.getAlignment(), LineHeightStyle.Mode.m13163equalsimpl0(lineHeightStyle.getMode(), LineHeightStyle.Mode.INSTANCE.m13168getMinimumlzQqcRY())), 0, spannable.length());
    }

    /* renamed from: setLineHeight-r9BaKPg, reason: not valid java name */
    public static final void m13052setLineHeightr9BaKPg(@NotNull Spannable spannable, long j7, float f, @NotNull Density density) {
        float fM13046resolveLineHeightInPxo2QH7mI = m13046resolveLineHeightInPxo2QH7mI(j7, f, density);
        if (Float.isNaN(fM13046resolveLineHeightInPxo2QH7mI)) {
            return;
        }
        setSpan(spannable, new LineHeightSpan(fM13046resolveLineHeightInPxo2QH7mI), 0, spannable.length());
    }

    public static final void setLocaleList(@NotNull Spannable spannable, @Nullable LocaleList localeList, int i, int i8) {
        if (localeList != null) {
            setSpan(spannable, LocaleListHelperMethods.INSTANCE.localeSpan(localeList), i, i8);
        }
    }

    private static final void setShadow(Spannable spannable, Shadow shadow, int i, int i8) {
        if (shadow != null) {
            setSpan(spannable, new ShadowSpan(ColorKt.m10736toArgb8_81llA(shadow.getColor()), Float.intBitsToFloat((int) (shadow.getOffset() >> 32)), Float.intBitsToFloat((int) (shadow.getOffset() & 4294967295L)), TextPaintExtensions_androidKt.correctBlurRadius(shadow.getBlurRadius())), i, i8);
        }
    }

    public static final void setSpan(@NotNull Spannable spannable, @NotNull Object obj, int i, int i8) {
        spannable.setSpan(obj, i, i8, 33);
    }

    private static final void setSpanStyle(Spannable spannable, SpanStyle spanStyle, int i, int i8, Density density) {
        m13048setBaselineShift0ocSgnM(spannable, spanStyle.getBaselineShift(), i, i8);
        m13049setColorRPmYEkk(spannable, spanStyle.m12711getColor0d7_KjU(), i, i8);
        setBrush(spannable, spanStyle.getBrush(), spanStyle.getAlpha(), i, i8);
        setTextDecoration(spannable, spanStyle.getBackground(), i, i8);
        m13050setFontSizeKmRG4DE(spannable, spanStyle.getFontSize(), density, i, i8);
        setFontFeatureSettings(spannable, spanStyle.getFontFeatureSettings(), i, i8);
        setGeometricTransform(spannable, spanStyle.getTextGeometricTransform(), i, i8);
        setLocaleList(spannable, spanStyle.getLocaleList(), i, i8);
        m13047setBackgroundRPmYEkk(spannable, spanStyle.getBackground(), i, i8);
        setShadow(spannable, spanStyle.getShadow(), i, i8);
        setDrawStyle(spannable, spanStyle.getDrawStyle(), i, i8);
    }

    public static final void setSpanStyles(@NotNull Spannable spannable, @NotNull TextStyle textStyle, @NotNull List<? extends AnnotatedString.Range<? extends AnnotatedString.Annotation>> list, @NotNull Density density, @NotNull InterfaceC6475g interfaceC6475g) {
        MetricAffectingSpan metricAffectingSpanM13044createLetterSpacingSpaneAf_CNQ;
        setFontAttributes(spannable, textStyle, list, interfaceC6475g);
        int size = list.size();
        boolean z8 = false;
        for (int i = 0; i < size; i++) {
            AnnotatedString.Range<? extends AnnotatedString.Annotation> range = list.get(i);
            if (range.getItem() instanceof SpanStyle) {
                int start = range.getStart();
                int end = range.getEnd();
                if (start >= 0 && start < spannable.length() && end > start && end <= spannable.length()) {
                    setSpanStyle(spannable, (SpanStyle) range.getItem(), start, end, density);
                    if (getNeedsLetterSpacingSpan((SpanStyle) range.getItem())) {
                        z8 = true;
                    }
                }
            }
        }
        if (z8) {
            int size2 = list.size();
            for (int i8 = 0; i8 < size2; i8++) {
                AnnotatedString.Range<? extends AnnotatedString.Annotation> range2 = list.get(i8);
                AnnotatedString.Annotation item = range2.getItem();
                if (item instanceof SpanStyle) {
                    int start2 = range2.getStart();
                    int end2 = range2.getEnd();
                    if (start2 >= 0 && start2 < spannable.length() && end2 > start2 && end2 <= spannable.length() && (metricAffectingSpanM13044createLetterSpacingSpaneAf_CNQ = m13044createLetterSpacingSpaneAf_CNQ(((SpanStyle) item).getLetterSpacing(), density)) != null) {
                        setSpan(spannable, metricAffectingSpanM13044createLetterSpacingSpaneAf_CNQ, start2, end2);
                    }
                }
            }
        }
    }

    public static final void setTextDecoration(@NotNull Spannable spannable, @Nullable TextDecoration textDecoration, int i, int i8) {
        if (textDecoration != null) {
            TextDecoration.Companion companion = TextDecoration.INSTANCE;
            setSpan(spannable, new TextDecorationSpan(textDecoration.contains(companion.getUnderline()), textDecoration.contains(companion.getLineThrough())), i, i8);
        }
    }

    public static final void setTextIndent(@NotNull Spannable spannable, @Nullable TextIndent textIndent, float f, @NotNull Density density) {
        if (textIndent != null) {
            if ((TextUnit.m13496equalsimpl0(textIndent.getFirstLine(), TextUnitKt.getSp(0)) && TextUnit.m13496equalsimpl0(textIndent.getRestLine(), TextUnitKt.getSp(0))) || TextUnit.m13497getRawTypeimpl(textIndent.getFirstLine()) == 0 || TextUnit.m13497getRawTypeimpl(textIndent.getRestLine()) == 0) {
                return;
            }
            long jM13498getTypeUIouoOA = TextUnit.m13498getTypeUIouoOA(textIndent.getFirstLine());
            TextUnitType.Companion companion = TextUnitType.INSTANCE;
            float fM13499getValueimpl = 0.0f;
            float fMo6902toPxR2X_6o = TextUnitType.m13527equalsimpl0(jM13498getTypeUIouoOA, companion.m13532getSpUIouoOA()) ? density.mo6902toPxR2X_6o(textIndent.getFirstLine()) : TextUnitType.m13527equalsimpl0(jM13498getTypeUIouoOA, companion.m13531getEmUIouoOA()) ? TextUnit.m13499getValueimpl(textIndent.getFirstLine()) * f : 0.0f;
            long jM13498getTypeUIouoOA2 = TextUnit.m13498getTypeUIouoOA(textIndent.getRestLine());
            if (TextUnitType.m13527equalsimpl0(jM13498getTypeUIouoOA2, companion.m13532getSpUIouoOA())) {
                fM13499getValueimpl = density.mo6902toPxR2X_6o(textIndent.getRestLine());
            } else if (TextUnitType.m13527equalsimpl0(jM13498getTypeUIouoOA2, companion.m13531getEmUIouoOA())) {
                fM13499getValueimpl = TextUnit.m13499getValueimpl(textIndent.getRestLine()) * f;
            }
            setSpan(spannable, new LeadingMarginSpan.Standard((int) Math.ceil(fMo6902toPxR2X_6o), (int) Math.ceil(fM13499getValueimpl)), 0, spannable.length());
        }
    }
}
