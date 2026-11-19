package androidx.compose.foundation.text;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.p013ui.graphics.Canvas;
import androidx.compose.p013ui.text.AnnotatedString;
import androidx.compose.p013ui.text.MultiParagraph;
import androidx.compose.p013ui.text.MultiParagraphIntrinsics;
import androidx.compose.p013ui.text.Placeholder;
import androidx.compose.p013ui.text.TextLayoutInput;
import androidx.compose.p013ui.text.TextLayoutResult;
import androidx.compose.p013ui.text.TextPainter;
import androidx.compose.p013ui.text.TextStyle;
import androidx.compose.p013ui.text.TextStyleKt;
import androidx.compose.p013ui.text.font.FontFamily;
import androidx.compose.p013ui.text.style.TextOverflow;
import androidx.compose.p013ui.unit.Constraints;
import androidx.compose.p013ui.unit.ConstraintsKt;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.p013ui.unit.IntSize;
import androidx.compose.p013ui.unit.LayoutDirection;
import androidx.compose.runtime.Stable;
import java.util.List;
import kotlin.jvm.internal.AbstractC9126n;
import p077d8.AbstractC8323h;
import p134i7.AbstractC8809v;

@Stable
/* loaded from: classes.dex */
public final class TextDelegate {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final Density density;
    private final FontFamily.Resolver fontFamilyResolver;
    private LayoutDirection intrinsicsLayoutDirection;
    private final int maxLines;
    private final int minLines;
    private final int overflow;
    private MultiParagraphIntrinsics paragraphIntrinsics;
    private final List<AnnotatedString.Range<Placeholder>> placeholders;
    private final boolean softWrap;
    private final TextStyle style;
    private final AnnotatedString text;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        public final void paint(Canvas canvas, TextLayoutResult textLayoutResult) {
            TextPainter.INSTANCE.paint(canvas, textLayoutResult);
        }

        private Companion() {
        }
    }

    public /* synthetic */ TextDelegate(AnnotatedString annotatedString, TextStyle textStyle, int i10, int i11, boolean z10, int i12, Density density, FontFamily.Resolver resolver, List list, AbstractC9126n abstractC9126n) {
        this(annotatedString, textStyle, i10, i11, z10, i12, density, resolver, list);
    }

    private final MultiParagraphIntrinsics getNonNullIntrinsics() {
        MultiParagraphIntrinsics multiParagraphIntrinsics = this.paragraphIntrinsics;
        if (multiParagraphIntrinsics != null) {
            return multiParagraphIntrinsics;
        }
        throw new IllegalStateException("layoutIntrinsics must be called first");
    }

    /* renamed from: layout-NN6Ew-U$default, reason: not valid java name */
    public static /* synthetic */ TextLayoutResult m21280layoutNN6EwU$default(TextDelegate textDelegate, long j10, LayoutDirection layoutDirection, TextLayoutResult textLayoutResult, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            textLayoutResult = null;
        }
        return textDelegate.m21283layoutNN6EwU(j10, layoutDirection, textLayoutResult);
    }

    /* renamed from: layoutText-K40F9xA, reason: not valid java name */
    private final MultiParagraph m21281layoutTextK40F9xA(long j10, LayoutDirection layoutDirection) {
        layoutIntrinsics(layoutDirection);
        int iM26854getMinWidthimpl = Constraints.m26854getMinWidthimpl(j10);
        int iM26852getMaxWidthimpl = ((this.softWrap || TextOverflow.m26825equalsimpl0(this.overflow, TextOverflow.Companion.m26835getEllipsisgIe3tQ8())) && Constraints.m26848getHasBoundedWidthimpl(j10)) ? Constraints.m26852getMaxWidthimpl(j10) : Integer.MAX_VALUE;
        int i10 = (this.softWrap || !TextOverflow.m26825equalsimpl0(this.overflow, TextOverflow.Companion.m26835getEllipsisgIe3tQ8())) ? this.maxLines : 1;
        if (iM26854getMinWidthimpl != iM26852getMaxWidthimpl) {
            iM26852getMaxWidthimpl = AbstractC8323h.m13518m(getMaxIntrinsicWidth(), iM26854getMinWidthimpl, iM26852getMaxWidthimpl);
        }
        return new MultiParagraph(getNonNullIntrinsics(), Constraints.Companion.m26861fitPrioritizingWidthZbe2FdA(0, iM26852getMaxWidthimpl, 0, Constraints.m26851getMaxHeightimpl(j10)), i10, this.overflow, (AbstractC9126n) null);
    }

    public final Density getDensity() {
        return this.density;
    }

    public final FontFamily.Resolver getFontFamilyResolver() {
        return this.fontFamilyResolver;
    }

    public final LayoutDirection getIntrinsicsLayoutDirection$foundation_release() {
        return this.intrinsicsLayoutDirection;
    }

    public final int getMaxIntrinsicWidth() {
        return TextDelegateKt.ceilToIntPx(getNonNullIntrinsics().getMaxIntrinsicWidth());
    }

    public final int getMaxLines() {
        return this.maxLines;
    }

    public final int getMinIntrinsicWidth() {
        return TextDelegateKt.ceilToIntPx(getNonNullIntrinsics().getMinIntrinsicWidth());
    }

    public final int getMinLines() {
        return this.minLines;
    }

    /* renamed from: getOverflow-gIe3tQ8, reason: not valid java name */
    public final int m21282getOverflowgIe3tQ8() {
        return this.overflow;
    }

    public final MultiParagraphIntrinsics getParagraphIntrinsics$foundation_release() {
        return this.paragraphIntrinsics;
    }

    public final List<AnnotatedString.Range<Placeholder>> getPlaceholders() {
        return this.placeholders;
    }

    public final boolean getSoftWrap() {
        return this.softWrap;
    }

    public final TextStyle getStyle() {
        return this.style;
    }

    public final AnnotatedString getText() {
        return this.text;
    }

    /* renamed from: layout-NN6Ew-U, reason: not valid java name */
    public final TextLayoutResult m21283layoutNN6EwU(long j10, LayoutDirection layoutDirection, TextLayoutResult textLayoutResult) {
        if (textLayoutResult != null && TextLayoutHelperKt.m21316canReuse7_7YC6M(textLayoutResult, this.text, this.style, this.placeholders, this.maxLines, this.softWrap, this.overflow, this.density, layoutDirection, this.fontFamilyResolver, j10)) {
            return textLayoutResult.m26333copyO0kMr_c(new TextLayoutInput(textLayoutResult.getLayoutInput().getText(), this.style, textLayoutResult.getLayoutInput().getPlaceholders(), textLayoutResult.getLayoutInput().getMaxLines(), textLayoutResult.getLayoutInput().getSoftWrap(), textLayoutResult.getLayoutInput().m26331getOverflowgIe3tQ8(), textLayoutResult.getLayoutInput().getDensity(), textLayoutResult.getLayoutInput().getLayoutDirection(), textLayoutResult.getLayoutInput().getFontFamilyResolver(), j10, (AbstractC9126n) null), ConstraintsKt.m26866constrain4WqzIAM(j10, IntSize.m27065constructorimpl((TextDelegateKt.ceilToIntPx(textLayoutResult.getMultiParagraph().getHeight()) & 4294967295L) | (TextDelegateKt.ceilToIntPx(textLayoutResult.getMultiParagraph().getWidth()) << 32))));
        }
        return new TextLayoutResult(new TextLayoutInput(this.text, this.style, this.placeholders, this.maxLines, this.softWrap, this.overflow, this.density, layoutDirection, this.fontFamilyResolver, j10, (AbstractC9126n) null), m21281layoutTextK40F9xA(j10, layoutDirection), ConstraintsKt.m26866constrain4WqzIAM(j10, IntSize.m27065constructorimpl((TextDelegateKt.ceilToIntPx(r14.getHeight()) & 4294967295L) | (TextDelegateKt.ceilToIntPx(r14.getWidth()) << 32))), null);
    }

    public final void layoutIntrinsics(LayoutDirection layoutDirection) {
        MultiParagraphIntrinsics multiParagraphIntrinsics = this.paragraphIntrinsics;
        if (multiParagraphIntrinsics == null || layoutDirection != this.intrinsicsLayoutDirection || multiParagraphIntrinsics.getHasStaleResolvedFonts()) {
            this.intrinsicsLayoutDirection = layoutDirection;
            multiParagraphIntrinsics = new MultiParagraphIntrinsics(this.text, TextStyleKt.resolveDefaults(this.style, layoutDirection), this.placeholders, this.density, this.fontFamilyResolver);
        }
        this.paragraphIntrinsics = multiParagraphIntrinsics;
    }

    public final void setIntrinsicsLayoutDirection$foundation_release(LayoutDirection layoutDirection) {
        this.intrinsicsLayoutDirection = layoutDirection;
    }

    public final void setParagraphIntrinsics$foundation_release(MultiParagraphIntrinsics multiParagraphIntrinsics) {
        this.paragraphIntrinsics = multiParagraphIntrinsics;
    }

    private TextDelegate(AnnotatedString annotatedString, TextStyle textStyle, int i10, int i11, boolean z10, int i12, Density density, FontFamily.Resolver resolver, List<AnnotatedString.Range<Placeholder>> list) {
        this.text = annotatedString;
        this.style = textStyle;
        this.maxLines = i10;
        this.minLines = i11;
        this.softWrap = z10;
        this.overflow = i12;
        this.density = density;
        this.fontFamilyResolver = resolver;
        this.placeholders = list;
        if (!(i10 > 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("no maxLines");
        }
        if (!(i11 > 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("no minLines");
        }
        if (i11 <= i10) {
            return;
        }
        InlineClassHelperKt.throwIllegalArgumentException("minLines greater than maxLines");
    }

    public /* synthetic */ TextDelegate(AnnotatedString annotatedString, TextStyle textStyle, int i10, int i11, boolean z10, int i12, Density density, FontFamily.Resolver resolver, List list, int i13, AbstractC9126n abstractC9126n) {
        this(annotatedString, textStyle, (i13 & 4) != 0 ? Integer.MAX_VALUE : i10, (i13 & 8) != 0 ? 1 : i11, (i13 & 16) != 0 ? true : z10, (i13 & 32) != 0 ? TextOverflow.Companion.m26834getClipgIe3tQ8() : i12, density, resolver, (i13 & 256) != 0 ? AbstractC8809v.m14771n() : list, null);
    }
}
