package androidx.compose.p006ui.text.platform.extensions;

import androidx.compose.p006ui.text.SpanStyle;
import androidx.compose.p006ui.text.platform.AndroidTextPaint;
import androidx.compose.p006ui.text.style.TextMotion;
import androidx.compose.p006ui.unit.Density;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m5174d1 = {"\u0000`\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a9\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000e\u001aS\u0010\u000f\u001a\u0004\u0018\u00010\u0004*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00042&\u0010\u0012\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u00132\u0006\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0000ø\u0001\u0001\u001a\f\u0010\u001b\u001a\u00020\b*\u00020\u0004H\u0000\u001a\u0016\u0010\u001c\u001a\u00020\u001d*\u00020\u00102\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006 "}, m5175d2 = {"correctBlurRadius", "", "blurRadius", "generateFallbackSpanStyle", "Landroidx/compose/ui/text/SpanStyle;", "letterSpacing", "Landroidx/compose/ui/unit/TextUnit;", "requiresLetterSpacing", "", "background", "Landroidx/compose/ui/graphics/Color;", "baselineShift", "Landroidx/compose/ui/text/style/BaselineShift;", "generateFallbackSpanStyle-62GTOB8", "(JZJLandroidx/compose/ui/text/style/BaselineShift;)Landroidx/compose/ui/text/SpanStyle;", "applySpanStyle", "Landroidx/compose/ui/text/platform/AndroidTextPaint;", "style", "resolveTypeface", "Lkotlin/Function4;", "Landroidx/compose/ui/text/font/FontFamily;", "Landroidx/compose/ui/text/font/FontWeight;", "Landroidx/compose/ui/text/font/FontStyle;", "Landroidx/compose/ui/text/font/FontSynthesis;", "Landroid/graphics/Typeface;", "density", "Landroidx/compose/ui/unit/Density;", "hasFontAttributes", "setTextMotion", "", "textMotion", "Landroidx/compose/ui/text/style/TextMotion;", "ui-text_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class TextPaintExtensions_androidKt {
    /* JADX WARN: Removed duplicated region for block: B:56:0x019d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.p006ui.text.SpanStyle applySpanStyle(androidx.compose.p006ui.text.platform.AndroidTextPaint r7, androidx.compose.p006ui.text.SpanStyle r8, kotlin.jvm.functions.Function4<? super androidx.compose.p006ui.text.font.FontFamily, ? super androidx.compose.p006ui.text.font.FontWeight, ? super androidx.compose.p006ui.text.font.FontStyle, ? super androidx.compose.p006ui.text.font.FontSynthesis, ? extends android.graphics.Typeface> r9, androidx.compose.p006ui.unit.Density r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p006ui.text.platform.extensions.TextPaintExtensions_androidKt.applySpanStyle(androidx.compose.ui.text.platform.AndroidTextPaint, androidx.compose.ui.text.SpanStyle, kotlin.jvm.functions.Function4, androidx.compose.ui.unit.Density, boolean):androidx.compose.ui.text.SpanStyle");
    }

    public static /* synthetic */ SpanStyle applySpanStyle$default(AndroidTextPaint androidTextPaint, SpanStyle spanStyle, Function4 function4, Density density, boolean z3, int i4, Object obj) {
        if ((i4 & 8) != 0) {
            z3 = false;
        }
        return applySpanStyle(androidTextPaint, spanStyle, function4, density, z3);
    }

    public static final float correctBlurRadius(float f4) {
        if (f4 == 0.0f) {
            return Float.MIN_VALUE;
        }
        return f4;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0053  */
    /* renamed from: generateFallbackSpanStyle-62GTOB8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final androidx.compose.p006ui.text.SpanStyle m11315generateFallbackSpanStyle62GTOB8(long r30, boolean r32, long r33, androidx.compose.p006ui.text.style.BaselineShift r35) {
        /*
            r0 = r33
            r2 = 1
            r3 = 0
            if (r32 == 0) goto L26
            long r4 = androidx.compose.p006ui.unit.TextUnit.m11705getTypeUIouoOA(r30)
            androidx.compose.ui.unit.TextUnitType$Companion r6 = androidx.compose.p006ui.unit.TextUnitType.INSTANCE
            long r6 = r6.m11739getSpUIouoOA()
            boolean r4 = androidx.compose.p006ui.unit.TextUnitType.m11734equalsimpl0(r4, r6)
            if (r4 == 0) goto L26
            float r4 = androidx.compose.p006ui.unit.TextUnit.m11706getValueimpl(r30)
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 != 0) goto L21
            r4 = r2
            goto L22
        L21:
            r4 = r3
        L22:
            if (r4 != 0) goto L26
            r4 = r2
            goto L27
        L26:
            r4 = r3
        L27:
            androidx.compose.ui.graphics.Color$Companion r5 = androidx.compose.p006ui.graphics.Color.INSTANCE
            long r6 = r5.m9214getUnspecified0d7_KjU()
            boolean r6 = androidx.compose.p006ui.graphics.Color.m9179equalsimpl0(r0, r6)
            if (r6 != 0) goto L3f
            long r6 = r5.m9213getTransparent0d7_KjU()
            boolean r6 = androidx.compose.p006ui.graphics.Color.m9179equalsimpl0(r0, r6)
            if (r6 != 0) goto L3f
            r6 = r2
            goto L40
        L3f:
            r6 = r3
        L40:
            if (r35 == 0) goto L53
            androidx.compose.ui.text.style.BaselineShift$Companion r7 = androidx.compose.p006ui.text.style.BaselineShift.INSTANCE
            float r7 = r7.m11330getNoney9eOQZs()
            float r8 = r35.m11326unboximpl()
            boolean r7 = androidx.compose.p006ui.text.style.BaselineShift.m11323equalsimpl0(r8, r7)
            if (r7 != 0) goto L53
            goto L54
        L53:
            r2 = r3
        L54:
            r3 = 0
            if (r4 != 0) goto L5c
            if (r6 != 0) goto L5c
            if (r2 != 0) goto L5c
            goto L97
        L5c:
            if (r4 == 0) goto L61
            r19 = r30
            goto L69
        L61:
            androidx.compose.ui.unit.TextUnit$Companion r4 = androidx.compose.p006ui.unit.TextUnit.INSTANCE
            long r7 = r4.m11717getUnspecifiedXSAIIZE()
            r19 = r7
        L69:
            if (r6 == 0) goto L6c
            goto L70
        L6c:
            long r0 = r5.m9214getUnspecified0d7_KjU()
        L70:
            r24 = r0
            if (r2 == 0) goto L77
            r21 = r35
            goto L79
        L77:
            r21 = r3
        L79:
            androidx.compose.ui.text.SpanStyle r3 = new androidx.compose.ui.text.SpanStyle
            r9 = r3
            r10 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r22 = 0
            r23 = 0
            r26 = 0
            r27 = 0
            r28 = 13951(0x367f, float:1.955E-41)
            r29 = 0
            r9.<init>(r10, r12, r14, r15, r16, r17, r18, r19, r21, r22, r23, r24, r26, r27, r28, r29)
        L97:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p006ui.text.platform.extensions.TextPaintExtensions_androidKt.m11315generateFallbackSpanStyle62GTOB8(long, boolean, long, androidx.compose.ui.text.style.BaselineShift):androidx.compose.ui.text.SpanStyle");
    }

    public static final boolean hasFontAttributes(SpanStyle spanStyle) {
        Intrinsics.checkNotNullParameter(spanStyle, "<this>");
        return (spanStyle.getFontFamily() == null && spanStyle.getFontStyle() == null && spanStyle.getFontWeight() == null) ? false : true;
    }

    public static final void setTextMotion(AndroidTextPaint androidTextPaint, TextMotion textMotion) {
        Intrinsics.checkNotNullParameter(androidTextPaint, "<this>");
        if (textMotion == null) {
            textMotion = TextMotion.INSTANCE.getStatic();
        }
        androidTextPaint.setFlags(textMotion.getSubpixelTextPositioning() ? androidTextPaint.getFlags() | 128 : androidTextPaint.getFlags() & (-129));
        int iM11457getLinearity4e0Vf04$ui_text_release = textMotion.getLinearity();
        TextMotion.Linearity.Companion companion = TextMotion.Linearity.INSTANCE;
        if (TextMotion.Linearity.m11461equalsimpl0(iM11457getLinearity4e0Vf04$ui_text_release, companion.m11466getLinear4e0Vf04())) {
            androidTextPaint.setFlags(androidTextPaint.getFlags() | 64);
            androidTextPaint.setHinting(0);
        } else if (TextMotion.Linearity.m11461equalsimpl0(iM11457getLinearity4e0Vf04$ui_text_release, companion.m11465getFontHinting4e0Vf04())) {
            androidTextPaint.getFlags();
            androidTextPaint.setHinting(1);
        } else if (!TextMotion.Linearity.m11461equalsimpl0(iM11457getLinearity4e0Vf04$ui_text_release, companion.m11467getNone4e0Vf04())) {
            androidTextPaint.getFlags();
        } else {
            androidTextPaint.getFlags();
            androidTextPaint.setHinting(0);
        }
    }
}
