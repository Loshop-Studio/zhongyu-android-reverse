package androidx.compose.foundation.text;

import androidx.compose.p013ui.text.AnnotatedString;
import androidx.compose.p013ui.text.Placeholder;
import androidx.compose.p013ui.text.TextStyle;
import androidx.compose.p013ui.text.font.FontFamily;
import androidx.compose.p013ui.text.style.TextOverflow;
import androidx.compose.p013ui.unit.Density;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes.dex */
public final class TextDelegateKt {
    public static final int ceilToIntPx(float f10) {
        return Math.round((float) Math.ceil(f10));
    }

    /* renamed from: updateTextDelegate-rm0N8CA, reason: not valid java name */
    public static final TextDelegate m21284updateTextDelegaterm0N8CA(TextDelegate textDelegate, AnnotatedString annotatedString, TextStyle textStyle, Density density, FontFamily.Resolver resolver, boolean z10, int i10, int i11, int i12, List<AnnotatedString.Range<Placeholder>> list) {
        FontFamily.Resolver resolver2;
        boolean z11;
        int i13;
        int i14;
        int i15;
        List<AnnotatedString.Range<Placeholder>> list2;
        if (AbstractC9133u.m16128b(textDelegate.getText(), annotatedString) && AbstractC9133u.m16128b(textDelegate.getStyle(), textStyle)) {
            z11 = z10;
            if (textDelegate.getSoftWrap() == z11) {
                i13 = i10;
                if (!TextOverflow.m26825equalsimpl0(textDelegate.m21282getOverflowgIe3tQ8(), i13)) {
                    resolver2 = resolver;
                    i14 = i11;
                    i15 = i12;
                    list2 = list;
                    return new TextDelegate(annotatedString, textStyle, i14, i15, z11, i13, density, resolver2, list2, null);
                }
                i14 = i11;
                if (textDelegate.getMaxLines() != i14) {
                    resolver2 = resolver;
                    i15 = i12;
                    list2 = list;
                    return new TextDelegate(annotatedString, textStyle, i14, i15, z11, i13, density, resolver2, list2, null);
                }
                i15 = i12;
                if (textDelegate.getMinLines() != i15 || !AbstractC9133u.m16128b(textDelegate.getDensity(), density)) {
                    resolver2 = resolver;
                    list2 = list;
                    return new TextDelegate(annotatedString, textStyle, i14, i15, z11, i13, density, resolver2, list2, null);
                }
                list2 = list;
                if (AbstractC9133u.m16128b(textDelegate.getPlaceholders(), list2)) {
                    resolver2 = resolver;
                    if (textDelegate.getFontFamilyResolver() == resolver2) {
                        return textDelegate;
                    }
                } else {
                    resolver2 = resolver;
                }
                return new TextDelegate(annotatedString, textStyle, i14, i15, z11, i13, density, resolver2, list2, null);
            }
            resolver2 = resolver;
        } else {
            resolver2 = resolver;
            z11 = z10;
        }
        i13 = i10;
        i14 = i11;
        i15 = i12;
        list2 = list;
        return new TextDelegate(annotatedString, textStyle, i14, i15, z11, i13, density, resolver2, list2, null);
    }

    /* renamed from: updateTextDelegate-rm0N8CA$default, reason: not valid java name */
    public static /* synthetic */ TextDelegate m21285updateTextDelegaterm0N8CA$default(TextDelegate textDelegate, AnnotatedString annotatedString, TextStyle textStyle, Density density, FontFamily.Resolver resolver, boolean z10, int i10, int i11, int i12, List list, int i13, Object obj) {
        if ((i13 & 32) != 0) {
            z10 = true;
        }
        if ((i13 & 64) != 0) {
            i10 = TextOverflow.Companion.m26834getClipgIe3tQ8();
        }
        if ((i13 & 128) != 0) {
            i11 = Integer.MAX_VALUE;
        }
        if ((i13 & 256) != 0) {
            i12 = 1;
        }
        return m21284updateTextDelegaterm0N8CA(textDelegate, annotatedString, textStyle, density, resolver, z10, i10, i11, i12, list);
    }
}
