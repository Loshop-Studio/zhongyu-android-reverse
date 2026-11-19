package androidx.compose.foundation.text;

import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.Placeholder;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.Density;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\u001av\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u0013H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\f\u0010\u0018\u001a\u00020\u0010*\u00020\u0019H\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, m5110d2 = {"updateTextDelegate", "Landroidx/compose/foundation/text/TextDelegate;", "current", "text", "Landroidx/compose/ui/text/AnnotatedString;", "style", "Landroidx/compose/ui/text/TextStyle;", "density", "Landroidx/compose/ui/unit/Density;", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "softWrap", "", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "maxLines", "", "minLines", "placeholders", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "updateTextDelegate-rm0N8CA", "(Landroidx/compose/foundation/text/TextDelegate;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;ZIIILjava/util/List;)Landroidx/compose/foundation/text/TextDelegate;", "ceilToIntPx", "", "foundation_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nTextDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextDelegate.kt\nandroidx/compose/foundation/text/TextDelegateKt\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,356:1\n26#2:357\n*S KotlinDebug\n*F\n+ 1 TextDelegate.kt\nandroidx/compose/foundation/text/TextDelegateKt\n*L\n310#1:357\n*E\n"})
/* loaded from: classes.dex */
public final class TextDelegateKt {
    public static final int ceilToIntPx(float f) {
        return Math.round((float) Math.ceil(f));
    }

    @NotNull
    /* renamed from: updateTextDelegate-rm0N8CA, reason: not valid java name */
    public static final TextDelegate m7690updateTextDelegaterm0N8CA(@NotNull TextDelegate textDelegate, @NotNull AnnotatedString annotatedString, @NotNull TextStyle textStyle, @NotNull Density density, @NotNull FontFamily.Resolver resolver, boolean z8, int i, int i8, int i9, @NotNull List<AnnotatedString.Range<Placeholder>> list) {
        FontFamily.Resolver resolver2;
        boolean z9;
        int i10;
        int i11;
        int i12;
        List<AnnotatedString.Range<Placeholder>> list2;
        if (AbstractC5830k.m5325b(textDelegate.getText(), annotatedString) && AbstractC5830k.m5325b(textDelegate.getStyle(), textStyle)) {
            z9 = z8;
            if (textDelegate.getSoftWrap() == z9) {
                i10 = i;
                if (!TextOverflow.m13231equalsimpl0(textDelegate.getOverflow(), i10)) {
                    resolver2 = resolver;
                    i11 = i8;
                    i12 = i9;
                    list2 = list;
                    return new TextDelegate(annotatedString, textStyle, i11, i12, z9, i10, density, resolver2, list2, null);
                }
                i11 = i8;
                if (textDelegate.getMaxLines() != i11) {
                    resolver2 = resolver;
                    i12 = i9;
                    list2 = list;
                    return new TextDelegate(annotatedString, textStyle, i11, i12, z9, i10, density, resolver2, list2, null);
                }
                i12 = i9;
                if (textDelegate.getMinLines() != i12 || !AbstractC5830k.m5325b(textDelegate.getDensity(), density)) {
                    resolver2 = resolver;
                    list2 = list;
                    return new TextDelegate(annotatedString, textStyle, i11, i12, z9, i10, density, resolver2, list2, null);
                }
                list2 = list;
                if (AbstractC5830k.m5325b(textDelegate.getPlaceholders(), list2)) {
                    resolver2 = resolver;
                    if (textDelegate.getFontFamilyResolver() == resolver2) {
                        return textDelegate;
                    }
                } else {
                    resolver2 = resolver;
                }
                return new TextDelegate(annotatedString, textStyle, i11, i12, z9, i10, density, resolver2, list2, null);
            }
            resolver2 = resolver;
        } else {
            resolver2 = resolver;
            z9 = z8;
        }
        i10 = i;
        i11 = i8;
        i12 = i9;
        list2 = list;
        return new TextDelegate(annotatedString, textStyle, i11, i12, z9, i10, density, resolver2, list2, null);
    }

    /* renamed from: updateTextDelegate-rm0N8CA$default, reason: not valid java name */
    public static /* synthetic */ TextDelegate m7691updateTextDelegaterm0N8CA$default(TextDelegate textDelegate, AnnotatedString annotatedString, TextStyle textStyle, Density density, FontFamily.Resolver resolver, boolean z8, int i, int i8, int i9, List list, int i10, Object obj) {
        if ((i10 & 32) != 0) {
            z8 = true;
        }
        if ((i10 & 64) != 0) {
            i = TextOverflow.INSTANCE.m13240getClipgIe3tQ8();
        }
        if ((i10 & 128) != 0) {
            i8 = Integer.MAX_VALUE;
        }
        if ((i10 & 256) != 0) {
            i9 = 1;
        }
        return m7690updateTextDelegaterm0N8CA(textDelegate, annotatedString, textStyle, density, resolver, z8, i, i8, i9, list);
    }
}
