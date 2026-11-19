package androidx.compose.p013ui.text;

import androidx.compose.p013ui.text.AnnotatedString;
import androidx.compose.p013ui.text.font.Font;
import androidx.compose.p013ui.text.font.FontFamily;
import androidx.compose.p013ui.text.platform.AndroidParagraph_androidKt;
import androidx.compose.p013ui.text.style.TextOverflow;
import androidx.compose.p013ui.unit.ConstraintsKt;
import androidx.compose.p013ui.unit.Density;
import java.util.List;
import p123h7.InterfaceC8721a;
import p134i7.AbstractC8809v;

/* loaded from: classes2.dex */
public final class ParagraphKt {
    public static final int DefaultMaxLines = Integer.MAX_VALUE;

    @InterfaceC8721a
    public static final Paragraph Paragraph(String str, TextStyle textStyle, List<AnnotatedString.Range<SpanStyle>> list, List<AnnotatedString.Range<Placeholder>> list2, int i10, boolean z10, float f10, Density density, Font.ResourceLoader resourceLoader) {
        return AndroidParagraph_androidKt.ActualParagraph(str, textStyle, list, list2, i10, z10, f10, density, resourceLoader);
    }

    public static /* synthetic */ Paragraph Paragraph$default(String str, TextStyle textStyle, List list, List list2, int i10, boolean z10, float f10, Density density, Font.ResourceLoader resourceLoader, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            list = AbstractC8809v.m14771n();
        }
        List list3 = list;
        if ((i11 & 8) != 0) {
            list2 = AbstractC8809v.m14771n();
        }
        List list4 = list2;
        if ((i11 & 16) != 0) {
            i10 = Integer.MAX_VALUE;
        }
        int i12 = i10;
        if ((i11 & 32) != 0) {
            z10 = false;
        }
        return Paragraph(str, textStyle, (List<AnnotatedString.Range<SpanStyle>>) list3, (List<AnnotatedString.Range<Placeholder>>) list4, i12, z10, f10, density, resourceLoader);
    }

    @InterfaceC8721a
    /* renamed from: Paragraph-UdtVg6A, reason: not valid java name */
    public static final /* synthetic */ Paragraph m26231ParagraphUdtVg6A(String str, TextStyle textStyle, long j10, Density density, FontFamily.Resolver resolver, List list, List list2, int i10, boolean z10) {
        TextOverflow.Companion companion = TextOverflow.Companion;
        return AndroidParagraph_androidKt.m26624ActualParagraphXGqx6AY(str, textStyle, list, list2, i10, z10 ? companion.m26835getEllipsisgIe3tQ8() : companion.m26834getClipgIe3tQ8(), j10, density, resolver);
    }

    /* renamed from: Paragraph-Ul8oQg4, reason: not valid java name */
    public static final Paragraph m26233ParagraphUl8oQg4(String str, TextStyle textStyle, long j10, Density density, FontFamily.Resolver resolver, List<AnnotatedString.Range<SpanStyle>> list, List<AnnotatedString.Range<Placeholder>> list2, int i10, int i11) {
        return AndroidParagraph_androidKt.m26624ActualParagraphXGqx6AY(str, textStyle, list, list2, i10, i11, j10, density, resolver);
    }

    @InterfaceC8721a
    /* renamed from: Paragraph-_EkL_-Y, reason: not valid java name */
    public static final /* synthetic */ Paragraph m26235Paragraph_EkL_Y(ParagraphIntrinsics paragraphIntrinsics, long j10, int i10, boolean z10) {
        return AndroidParagraph_androidKt.m26623ActualParagraph4FmOz70(paragraphIntrinsics, i10, z10 ? TextOverflow.Companion.m26835getEllipsisgIe3tQ8() : TextOverflow.Companion.m26834getClipgIe3tQ8(), j10);
    }

    /* renamed from: Paragraph-_EkL_-Y$default, reason: not valid java name */
    public static /* synthetic */ Paragraph m26236Paragraph_EkL_Y$default(ParagraphIntrinsics paragraphIntrinsics, long j10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = Integer.MAX_VALUE;
        }
        if ((i11 & 8) != 0) {
            z10 = false;
        }
        return m26235Paragraph_EkL_Y(paragraphIntrinsics, j10, i10, z10);
    }

    /* renamed from: Paragraph-czeN-Hc, reason: not valid java name */
    public static final Paragraph m26237ParagraphczeNHc(ParagraphIntrinsics paragraphIntrinsics, long j10, int i10, int i11) {
        return AndroidParagraph_androidKt.m26623ActualParagraph4FmOz70(paragraphIntrinsics, i10, i11, j10);
    }

    /* renamed from: Paragraph-czeN-Hc$default, reason: not valid java name */
    public static /* synthetic */ Paragraph m26238ParagraphczeNHc$default(ParagraphIntrinsics paragraphIntrinsics, long j10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i10 = Integer.MAX_VALUE;
        }
        if ((i12 & 8) != 0) {
            i11 = TextOverflow.Companion.m26834getClipgIe3tQ8();
        }
        return m26237ParagraphczeNHc(paragraphIntrinsics, j10, i10, i11);
    }

    public static final int ceilToInt(float f10) {
        return (int) Math.ceil(f10);
    }

    @InterfaceC8721a
    public static final Paragraph Paragraph(String str, TextStyle textStyle, float f10, Density density, FontFamily.Resolver resolver, List<AnnotatedString.Range<SpanStyle>> list, List<AnnotatedString.Range<Placeholder>> list2, int i10, boolean z10) {
        TextOverflow.Companion companion = TextOverflow.Companion;
        return AndroidParagraph_androidKt.m26624ActualParagraphXGqx6AY(str, textStyle, list, list2, i10, z10 ? companion.m26835getEllipsisgIe3tQ8() : companion.m26834getClipgIe3tQ8(), ConstraintsKt.Constraints$default(0, ceilToInt(f10), 0, 0, 13, null), density, resolver);
    }

    @InterfaceC8721a
    public static final Paragraph Paragraph(ParagraphIntrinsics paragraphIntrinsics, int i10, boolean z10, float f10) {
        return AndroidParagraph_androidKt.m26623ActualParagraph4FmOz70(paragraphIntrinsics, i10, z10 ? TextOverflow.Companion.m26835getEllipsisgIe3tQ8() : TextOverflow.Companion.m26834getClipgIe3tQ8(), ConstraintsKt.Constraints$default(0, ceilToInt(f10), 0, 0, 13, null));
    }

    public static /* synthetic */ Paragraph Paragraph$default(ParagraphIntrinsics paragraphIntrinsics, int i10, boolean z10, float f10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = Integer.MAX_VALUE;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return Paragraph(paragraphIntrinsics, i10, z10, f10);
    }
}
