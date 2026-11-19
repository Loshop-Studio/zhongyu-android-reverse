package androidx.compose.p011ui.text;

import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.font.Font;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.platform.AndroidParagraph_androidKt;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.ConstraintsKt;
import androidx.compose.p011ui.unit.Density;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.EmptyList;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000h\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a4\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\nø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a6\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a,\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012H\u0007\u001ax\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0014\b\u0002\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u001c2\u0014\b\u0002\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001d0\u001c2\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\nø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001az\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0014\b\u0002\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u001c2\u0014\b\u0002\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001d0\u001c2\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001ap\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0014\b\u0002\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u001c2\u0014\b\u0002\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001d0\u001c2\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007\u001ap\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0014\b\u0002\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u001c2\u0014\b\u0002\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001d0\u001c2\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010%\u001a\u00020&H\u0007\u001a\f\u0010'\u001a\u00020\u0001*\u00020\u0012H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006("}, m5110d2 = {"DefaultMaxLines", "", "Paragraph", "Landroidx/compose/ui/text/Paragraph;", "paragraphIntrinsics", "Landroidx/compose/ui/text/ParagraphIntrinsics;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "maxLines", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "Paragraph-czeN-Hc", "(Landroidx/compose/ui/text/ParagraphIntrinsics;JII)Landroidx/compose/ui/text/Paragraph;", "ellipsis", "", "Paragraph-_EkL_-Y", "(Landroidx/compose/ui/text/ParagraphIntrinsics;JIZ)Landroidx/compose/ui/text/Paragraph;", "width", "", "text", "", "style", "Landroidx/compose/ui/text/TextStyle;", "density", "Landroidx/compose/ui/unit/Density;", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "spanStyles", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/SpanStyle;", "placeholders", "Landroidx/compose/ui/text/Placeholder;", "Paragraph-Ul8oQg4", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;JLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Ljava/util/List;Ljava/util/List;II)Landroidx/compose/ui/text/Paragraph;", "Paragraph-UdtVg6A", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;JLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Ljava/util/List;Ljava/util/List;IZ)Landroidx/compose/ui/text/Paragraph;", "resourceLoader", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "ceilToInt", "ui-text_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class ParagraphKt {
    public static final int DefaultMaxLines = Integer.MAX_VALUE;

    @Deprecated(message = "Font.ResourceLoader is deprecated, instead pass FontFamily.Resolver", replaceWith = @ReplaceWith(expression = "Paragraph(text, style, spanStyles, placeholders, maxLines, ellipsis, width, density, fontFamilyResolver)", imports = {}))
    @NotNull
    public static final Paragraph Paragraph(@NotNull String str, @NotNull TextStyle textStyle, @NotNull List<AnnotatedString.Range<SpanStyle>> list, @NotNull List<AnnotatedString.Range<Placeholder>> list2, int i, boolean z8, float f, @NotNull Density density, @NotNull Font.ResourceLoader resourceLoader) {
        return AndroidParagraph_androidKt.ActualParagraph(str, textStyle, list, list2, i, z8, f, density, resourceLoader);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Paragraph that takes `ellipsis: Boolean` is deprecated, pass TextOverflow instead.")
    /* renamed from: Paragraph-UdtVg6A, reason: not valid java name */
    public static final /* synthetic */ Paragraph m12637ParagraphUdtVg6A(String str, TextStyle textStyle, long j7, Density density, FontFamily.Resolver resolver, List list, List list2, int i, boolean z8) {
        TextOverflow.Companion companion = TextOverflow.INSTANCE;
        return AndroidParagraph_androidKt.m13030ActualParagraphXGqx6AY(str, textStyle, list, list2, i, z8 ? companion.m13241getEllipsisgIe3tQ8() : companion.m13240getClipgIe3tQ8(), j7, density, resolver);
    }

    @NotNull
    /* renamed from: Paragraph-Ul8oQg4, reason: not valid java name */
    public static final Paragraph m12639ParagraphUl8oQg4(@NotNull String str, @NotNull TextStyle textStyle, long j7, @NotNull Density density, @NotNull FontFamily.Resolver resolver, @NotNull List<AnnotatedString.Range<SpanStyle>> list, @NotNull List<AnnotatedString.Range<Placeholder>> list2, int i, int i8) {
        return AndroidParagraph_androidKt.m13030ActualParagraphXGqx6AY(str, textStyle, list, list2, i, i8, j7, density, resolver);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Paragraph that takes ellipsis: Boolean is deprecated, pass TextOverflow instead.", replaceWith = @ReplaceWith(expression = "Paragraph(paragraphIntrinsics, constraints, maxLines, if (ellipsis) TextOverflow.Ellipsis else TextOverflow.Clip", imports = {}))
    /* renamed from: Paragraph-_EkL_-Y, reason: not valid java name */
    public static final /* synthetic */ Paragraph m12641Paragraph_EkL_Y(ParagraphIntrinsics paragraphIntrinsics, long j7, int i, boolean z8) {
        return AndroidParagraph_androidKt.m13029ActualParagraph4FmOz70(paragraphIntrinsics, i, z8 ? TextOverflow.INSTANCE.m13241getEllipsisgIe3tQ8() : TextOverflow.INSTANCE.m13240getClipgIe3tQ8(), j7);
    }

    /* renamed from: Paragraph-_EkL_-Y$default, reason: not valid java name */
    public static /* synthetic */ Paragraph m12642Paragraph_EkL_Y$default(ParagraphIntrinsics paragraphIntrinsics, long j7, int i, boolean z8, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            i = Integer.MAX_VALUE;
        }
        if ((i8 & 8) != 0) {
            z8 = false;
        }
        return m12641Paragraph_EkL_Y(paragraphIntrinsics, j7, i, z8);
    }

    @NotNull
    /* renamed from: Paragraph-czeN-Hc, reason: not valid java name */
    public static final Paragraph m12643ParagraphczeNHc(@NotNull ParagraphIntrinsics paragraphIntrinsics, long j7, int i, int i8) {
        return AndroidParagraph_androidKt.m13029ActualParagraph4FmOz70(paragraphIntrinsics, i, i8, j7);
    }

    /* renamed from: Paragraph-czeN-Hc$default, reason: not valid java name */
    public static /* synthetic */ Paragraph m12644ParagraphczeNHc$default(ParagraphIntrinsics paragraphIntrinsics, long j7, int i, int i8, int i9, Object obj) {
        if ((i9 & 4) != 0) {
            i = Integer.MAX_VALUE;
        }
        if ((i9 & 8) != 0) {
            i8 = TextOverflow.INSTANCE.m13240getClipgIe3tQ8();
        }
        return m12643ParagraphczeNHc(paragraphIntrinsics, j7, i, i8);
    }

    public static final int ceilToInt(float f) {
        return (int) Math.ceil(f);
    }

    @Deprecated(message = "Paragraph that takes maximum allowed width is deprecated, pass constraints instead.", replaceWith = @ReplaceWith(expression = "Paragraph(text, style, Constraints(maxWidth = ceil(width).toInt()), density, fontFamilyResolver, spanStyles, placeholders, maxLines, ellipsis)", imports = {"kotlin.math.ceil", "androidx.compose.ui.unit.Constraints"}))
    @NotNull
    public static final Paragraph Paragraph(@NotNull String str, @NotNull TextStyle textStyle, float f, @NotNull Density density, @NotNull FontFamily.Resolver resolver, @NotNull List<AnnotatedString.Range<SpanStyle>> list, @NotNull List<AnnotatedString.Range<Placeholder>> list2, int i, boolean z8) {
        TextOverflow.Companion companion = TextOverflow.INSTANCE;
        return AndroidParagraph_androidKt.m13030ActualParagraphXGqx6AY(str, textStyle, list, list2, i, z8 ? companion.m13241getEllipsisgIe3tQ8() : companion.m13240getClipgIe3tQ8(), ConstraintsKt.Constraints$default(0, ceilToInt(f), 0, 0, 13, null), density, resolver);
    }

    public static Paragraph Paragraph$default(String str, TextStyle textStyle, List list, List list2, int i, boolean z8, float f, Density density, Font.ResourceLoader resourceLoader, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            list = EmptyList.INSTANCE;
        }
        List list3 = list;
        if ((i8 & 8) != 0) {
            list2 = EmptyList.INSTANCE;
        }
        List list4 = list2;
        if ((i8 & 16) != 0) {
            i = Integer.MAX_VALUE;
        }
        int i9 = i;
        if ((i8 & 32) != 0) {
            z8 = false;
        }
        return Paragraph(str, textStyle, (List<AnnotatedString.Range<SpanStyle>>) list3, (List<AnnotatedString.Range<Placeholder>>) list4, i9, z8, f, density, resourceLoader);
    }

    @Deprecated(message = "Paragraph that takes maximum allowed width is deprecated, pass constraints instead.", replaceWith = @ReplaceWith(expression = "Paragraph(paragraphIntrinsics, Constraints(maxWidth = ceil(width).toInt()), maxLines, ellipsis)", imports = {"kotlin.math.ceil", "androidx.compose.ui.unit.Constraints"}))
    @NotNull
    public static final Paragraph Paragraph(@NotNull ParagraphIntrinsics paragraphIntrinsics, int i, boolean z8, float f) {
        return AndroidParagraph_androidKt.m13029ActualParagraph4FmOz70(paragraphIntrinsics, i, z8 ? TextOverflow.INSTANCE.m13241getEllipsisgIe3tQ8() : TextOverflow.INSTANCE.m13240getClipgIe3tQ8(), ConstraintsKt.Constraints$default(0, ceilToInt(f), 0, 0, 13, null));
    }

    public static /* synthetic */ Paragraph Paragraph$default(ParagraphIntrinsics paragraphIntrinsics, int i, boolean z8, float f, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            i = Integer.MAX_VALUE;
        }
        if ((i8 & 4) != 0) {
            z8 = false;
        }
        return Paragraph(paragraphIntrinsics, i, z8, f);
    }
}
