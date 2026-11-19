package androidx.compose.p012ui.text;

import androidx.compose.p012ui.text.AnnotatedString;
import androidx.compose.p012ui.text.font.Font;
import androidx.compose.p012ui.text.font.FontFamily;
import androidx.compose.p012ui.text.platform.AndroidParagraph_androidKt;
import androidx.compose.p012ui.text.style.TextOverflow;
import androidx.compose.p012ui.unit.ConstraintsKt;
import androidx.compose.p012ui.unit.Density;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt;

@Metadata(m13412d1 = {"\u0000h\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a4\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\nø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a6\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a,\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012H\u0007\u001ax\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0014\b\u0002\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u001c2\u0014\b\u0002\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001d0\u001c2\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\nø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001az\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0014\b\u0002\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u001c2\u0014\b\u0002\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001d0\u001c2\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001ap\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0014\b\u0002\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u001c2\u0014\b\u0002\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001d0\u001c2\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007\u001ap\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0014\b\u0002\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u001c2\u0014\b\u0002\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001d0\u001c2\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010%\u001a\u00020&H\u0007\u001a\f\u0010'\u001a\u00020\u0001*\u00020\u0012H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006("}, m13413d2 = {"DefaultMaxLines", "", "Paragraph", "Landroidx/compose/ui/text/Paragraph;", "paragraphIntrinsics", "Landroidx/compose/ui/text/ParagraphIntrinsics;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "maxLines", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "Paragraph-czeN-Hc", "(Landroidx/compose/ui/text/ParagraphIntrinsics;JII)Landroidx/compose/ui/text/Paragraph;", "ellipsis", "", "Paragraph-_EkL_-Y", "(Landroidx/compose/ui/text/ParagraphIntrinsics;JIZ)Landroidx/compose/ui/text/Paragraph;", "width", "", "text", "", "style", "Landroidx/compose/ui/text/TextStyle;", "density", "Landroidx/compose/ui/unit/Density;", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "spanStyles", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/SpanStyle;", "placeholders", "Landroidx/compose/ui/text/Placeholder;", "Paragraph-Ul8oQg4", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;JLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Ljava/util/List;Ljava/util/List;II)Landroidx/compose/ui/text/Paragraph;", "Paragraph-UdtVg6A", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;JLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Ljava/util/List;Ljava/util/List;IZ)Landroidx/compose/ui/text/Paragraph;", "resourceLoader", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "ceilToInt", "ui-text_release"}, m13414k = 2, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class ParagraphKt {
    public static final int DefaultMaxLines = Integer.MAX_VALUE;

    @Deprecated(message = "Font.ResourceLoader is deprecated, instead pass FontFamily.Resolver", replaceWith = @ReplaceWith(expression = "Paragraph(text, style, spanStyles, placeholders, maxLines, ellipsis, width, density, fontFamilyResolver)", imports = {}))
    public static final Paragraph Paragraph(String str, TextStyle textStyle, List<AnnotatedString.Range<SpanStyle>> list, List<AnnotatedString.Range<Placeholder>> list2, int i9, boolean z9, float f10, Density density, Font.ResourceLoader resourceLoader) {
        return AndroidParagraph_androidKt.ActualParagraph(str, textStyle, list, list2, i9, z9, f10, density, resourceLoader);
    }

    public static /* synthetic */ Paragraph Paragraph$default(String str, TextStyle textStyle, List list, List list2, int i9, boolean z9, float f10, Density density, Font.ResourceLoader resourceLoader, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            list = CollectionsKt.emptyList();
        }
        List list3 = list;
        if ((i10 & 8) != 0) {
            list2 = CollectionsKt.emptyList();
        }
        List list4 = list2;
        if ((i10 & 16) != 0) {
            i9 = Integer.MAX_VALUE;
        }
        int i11 = i9;
        if ((i10 & 32) != 0) {
            z9 = false;
        }
        return Paragraph(str, textStyle, (List<AnnotatedString.Range<SpanStyle>>) list3, (List<AnnotatedString.Range<Placeholder>>) list4, i11, z9, f10, density, resourceLoader);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Paragraph that takes `ellipsis: Boolean` is deprecated, pass TextOverflow instead.")
    /* renamed from: Paragraph-UdtVg6A, reason: not valid java name */
    public static final /* synthetic */ Paragraph m23327ParagraphUdtVg6A(String str, TextStyle textStyle, long j9, Density density, FontFamily.Resolver resolver, List list, List list2, int i9, boolean z9) {
        TextOverflow.Companion companion = TextOverflow.INSTANCE;
        return AndroidParagraph_androidKt.m23720ActualParagraphXGqx6AY(str, textStyle, list, list2, i9, z9 ? companion.m23930getEllipsisgIe3tQ8() : companion.m23929getClipgIe3tQ8(), j9, density, resolver);
    }

    /* renamed from: Paragraph-Ul8oQg4, reason: not valid java name */
    public static final Paragraph m23329ParagraphUl8oQg4(String str, TextStyle textStyle, long j9, Density density, FontFamily.Resolver resolver, List<AnnotatedString.Range<SpanStyle>> list, List<AnnotatedString.Range<Placeholder>> list2, int i9, int i10) {
        return AndroidParagraph_androidKt.m23720ActualParagraphXGqx6AY(str, textStyle, list, list2, i9, i10, j9, density, resolver);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Paragraph that takes ellipsis: Boolean is deprecated, pass TextOverflow instead.", replaceWith = @ReplaceWith(expression = "Paragraph(paragraphIntrinsics, constraints, maxLines, if (ellipsis) TextOverflow.Ellipsis else TextOverflow.Clip", imports = {}))
    /* renamed from: Paragraph-_EkL_-Y, reason: not valid java name */
    public static final /* synthetic */ Paragraph m23331Paragraph_EkL_Y(ParagraphIntrinsics paragraphIntrinsics, long j9, int i9, boolean z9) {
        return AndroidParagraph_androidKt.m23719ActualParagraph4FmOz70(paragraphIntrinsics, i9, z9 ? TextOverflow.INSTANCE.m23930getEllipsisgIe3tQ8() : TextOverflow.INSTANCE.m23929getClipgIe3tQ8(), j9);
    }

    /* renamed from: Paragraph-_EkL_-Y$default, reason: not valid java name */
    public static /* synthetic */ Paragraph m23332Paragraph_EkL_Y$default(ParagraphIntrinsics paragraphIntrinsics, long j9, int i9, boolean z9, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            i9 = Integer.MAX_VALUE;
        }
        if ((i10 & 8) != 0) {
            z9 = false;
        }
        return m23331Paragraph_EkL_Y(paragraphIntrinsics, j9, i9, z9);
    }

    /* renamed from: Paragraph-czeN-Hc, reason: not valid java name */
    public static final Paragraph m23333ParagraphczeNHc(ParagraphIntrinsics paragraphIntrinsics, long j9, int i9, int i10) {
        return AndroidParagraph_androidKt.m23719ActualParagraph4FmOz70(paragraphIntrinsics, i9, i10, j9);
    }

    /* renamed from: Paragraph-czeN-Hc$default, reason: not valid java name */
    public static /* synthetic */ Paragraph m23334ParagraphczeNHc$default(ParagraphIntrinsics paragraphIntrinsics, long j9, int i9, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i9 = Integer.MAX_VALUE;
        }
        if ((i11 & 8) != 0) {
            i10 = TextOverflow.INSTANCE.m23929getClipgIe3tQ8();
        }
        return m23333ParagraphczeNHc(paragraphIntrinsics, j9, i9, i10);
    }

    public static final int ceilToInt(float f10) {
        return (int) Math.ceil(f10);
    }

    @Deprecated(message = "Paragraph that takes maximum allowed width is deprecated, pass constraints instead.", replaceWith = @ReplaceWith(expression = "Paragraph(text, style, Constraints(maxWidth = ceil(width).toInt()), density, fontFamilyResolver, spanStyles, placeholders, maxLines, ellipsis)", imports = {"kotlin.math.ceil", "androidx.compose.ui.unit.Constraints"}))
    public static final Paragraph Paragraph(String str, TextStyle textStyle, float f10, Density density, FontFamily.Resolver resolver, List<AnnotatedString.Range<SpanStyle>> list, List<AnnotatedString.Range<Placeholder>> list2, int i9, boolean z9) {
        TextOverflow.Companion companion = TextOverflow.INSTANCE;
        return AndroidParagraph_androidKt.m23720ActualParagraphXGqx6AY(str, textStyle, list, list2, i9, z9 ? companion.m23930getEllipsisgIe3tQ8() : companion.m23929getClipgIe3tQ8(), ConstraintsKt.Constraints$default(0, ceilToInt(f10), 0, 0, 13, null), density, resolver);
    }

    @Deprecated(message = "Paragraph that takes maximum allowed width is deprecated, pass constraints instead.", replaceWith = @ReplaceWith(expression = "Paragraph(paragraphIntrinsics, Constraints(maxWidth = ceil(width).toInt()), maxLines, ellipsis)", imports = {"kotlin.math.ceil", "androidx.compose.ui.unit.Constraints"}))
    public static final Paragraph Paragraph(ParagraphIntrinsics paragraphIntrinsics, int i9, boolean z9, float f10) {
        return AndroidParagraph_androidKt.m23719ActualParagraph4FmOz70(paragraphIntrinsics, i9, z9 ? TextOverflow.INSTANCE.m23930getEllipsisgIe3tQ8() : TextOverflow.INSTANCE.m23929getClipgIe3tQ8(), ConstraintsKt.Constraints$default(0, ceilToInt(f10), 0, 0, 13, null));
    }

    public static /* synthetic */ Paragraph Paragraph$default(ParagraphIntrinsics paragraphIntrinsics, int i9, boolean z9, float f10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i9 = Integer.MAX_VALUE;
        }
        if ((i10 & 4) != 0) {
            z9 = false;
        }
        return Paragraph(paragraphIntrinsics, i9, z9, f10);
    }
}
