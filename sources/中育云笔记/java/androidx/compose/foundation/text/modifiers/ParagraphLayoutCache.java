package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.TextDelegateKt;
import androidx.compose.foundation.text.modifiers.MinLinesConstrainer;
import androidx.compose.p014ui.text.AnnotatedString;
import androidx.compose.p014ui.text.MultiParagraph;
import androidx.compose.p014ui.text.MultiParagraphIntrinsics;
import androidx.compose.p014ui.text.Paragraph;
import androidx.compose.p014ui.text.ParagraphIntrinsics;
import androidx.compose.p014ui.text.ParagraphIntrinsicsKt;
import androidx.compose.p014ui.text.ParagraphKt;
import androidx.compose.p014ui.text.Placeholder;
import androidx.compose.p014ui.text.TextLayoutInput;
import androidx.compose.p014ui.text.TextLayoutResult;
import androidx.compose.p014ui.text.TextStyle;
import androidx.compose.p014ui.text.TextStyleKt;
import androidx.compose.p014ui.text.font.FontFamily;
import androidx.compose.p014ui.text.style.TextOverflow;
import androidx.compose.p014ui.unit.Constraints;
import androidx.compose.p014ui.unit.ConstraintsKt;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.p014ui.unit.IntSize;
import androidx.compose.p014ui.unit.LayoutDirection;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p265nd.AbstractC10410o;
import p309qc.C10786q;
import p325rc.AbstractC10978w;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class ParagraphLayoutCache {
    public static final int $stable = 8;
    private int cachedIntrinsicHeight;
    private int cachedIntrinsicHeightInputWidth;
    private Density density;
    private boolean didOverflow;
    private FontFamily.Resolver fontFamilyResolver;
    private LayoutDirection intrinsicsLayoutDirection;
    private long lastDensity;
    private long layoutSize;
    private MinLinesConstrainer mMinLinesConstrainer;
    private int maxLines;
    private int minLines;
    private int overflow;
    private Paragraph paragraph;
    private ParagraphIntrinsics paragraphIntrinsics;
    private long prevConstraints;
    private boolean softWrap;
    private TextStyle style;
    private String text;

    public /* synthetic */ ParagraphLayoutCache(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i10, boolean z10, int i11, int i12, AbstractC9972n abstractC9972n) {
        this(str, textStyle, resolver, i10, z10, i11, i12);
    }

    private final void markDirty() {
        this.paragraph = null;
        this.paragraphIntrinsics = null;
        this.intrinsicsLayoutDirection = null;
        this.cachedIntrinsicHeightInputWidth = -1;
        this.cachedIntrinsicHeight = -1;
        this.prevConstraints = Constraints.Companion.m33464fixedJhjzzOo(0, 0);
        long j10 = 0;
        this.layoutSize = IntSize.m33667constructorimpl((j10 & 4294967295L) | (j10 << 32));
        this.didOverflow = false;
    }

    /* renamed from: newLayoutWillBeDifferent-K40F9xA, reason: not valid java name */
    private final boolean m28193newLayoutWillBeDifferentK40F9xA(long j10, LayoutDirection layoutDirection) {
        ParagraphIntrinsics paragraphIntrinsics;
        Paragraph paragraph = this.paragraph;
        if (paragraph == null || (paragraphIntrinsics = this.paragraphIntrinsics) == null || paragraphIntrinsics.getHasStaleResolvedFonts() || layoutDirection != this.intrinsicsLayoutDirection) {
            return true;
        }
        if (Constraints.m33447equalsimpl0(j10, this.prevConstraints)) {
            return false;
        }
        return Constraints.m33454getMaxWidthimpl(j10) != Constraints.m33454getMaxWidthimpl(this.prevConstraints) || Constraints.m33456getMinWidthimpl(j10) != Constraints.m33456getMinWidthimpl(this.prevConstraints) || ((float) Constraints.m33453getMaxHeightimpl(j10)) < paragraph.getHeight() || paragraph.getDidExceedMaxLines();
    }

    private final ParagraphIntrinsics setLayoutDirection(LayoutDirection layoutDirection) {
        ParagraphIntrinsics ParagraphIntrinsics = this.paragraphIntrinsics;
        if (ParagraphIntrinsics == null || layoutDirection != this.intrinsicsLayoutDirection || ParagraphIntrinsics.getHasStaleResolvedFonts()) {
            this.intrinsicsLayoutDirection = layoutDirection;
            String str = this.text;
            TextStyle textStyleResolveDefaults = TextStyleKt.resolveDefaults(this.style, layoutDirection);
            List listM24136n = AbstractC10978w.m24136n();
            Density density = this.density;
            AbstractC9979u.m20291d(density);
            ParagraphIntrinsics = ParagraphIntrinsicsKt.ParagraphIntrinsics(str, textStyleResolveDefaults, (List<? extends AnnotatedString.Range<? extends AnnotatedString.Annotation>>) listM24136n, density, this.fontFamilyResolver, (List<AnnotatedString.Range<Placeholder>>) AbstractC10978w.m24136n());
        }
        this.paragraphIntrinsics = ParagraphIntrinsics;
        return ParagraphIntrinsics;
    }

    /* renamed from: useMinLinesConstrainer-euUD3Qg, reason: not valid java name */
    private final long m28194useMinLinesConstrainereuUD3Qg(long j10, LayoutDirection layoutDirection, TextStyle textStyle) {
        MinLinesConstrainer.Companion companion = MinLinesConstrainer.Companion;
        MinLinesConstrainer minLinesConstrainer = this.mMinLinesConstrainer;
        Density density = this.density;
        AbstractC9979u.m20291d(density);
        MinLinesConstrainer minLinesConstrainerFrom = companion.from(minLinesConstrainer, layoutDirection, textStyle, density, this.fontFamilyResolver);
        this.mMinLinesConstrainer = minLinesConstrainerFrom;
        return minLinesConstrainerFrom.m28179coerceMinLinesOh53vG4$foundation_release(j10, this.minLines);
    }

    /* renamed from: useMinLinesConstrainer-euUD3Qg$default, reason: not valid java name */
    public static /* synthetic */ long m28195useMinLinesConstrainereuUD3Qg$default(ParagraphLayoutCache paragraphLayoutCache, long j10, LayoutDirection layoutDirection, TextStyle textStyle, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            textStyle = paragraphLayoutCache.style;
        }
        return paragraphLayoutCache.m28194useMinLinesConstrainereuUD3Qg(j10, layoutDirection, textStyle);
    }

    public final Density getDensity$foundation_release() {
        return this.density;
    }

    public final boolean getDidOverflow$foundation_release() {
        return this.didOverflow;
    }

    /* renamed from: getLayoutSize-YbymL2g$foundation_release, reason: not valid java name */
    public final long m28196getLayoutSizeYbymL2g$foundation_release() {
        return this.layoutSize;
    }

    public final C10786q getObserveFontChanges$foundation_release() {
        ParagraphIntrinsics paragraphIntrinsics = this.paragraphIntrinsics;
        if (paragraphIntrinsics != null) {
            paragraphIntrinsics.getHasStaleResolvedFonts();
        }
        return C10786q.f26013a;
    }

    public final Paragraph getParagraph$foundation_release() {
        return this.paragraph;
    }

    public final int intrinsicHeight(int i10, LayoutDirection layoutDirection) {
        ParagraphLayoutCache paragraphLayoutCache;
        LayoutDirection layoutDirection2;
        int i11 = this.cachedIntrinsicHeightInputWidth;
        int i12 = this.cachedIntrinsicHeight;
        if (i10 == i11 && i11 != -1) {
            return i12;
        }
        long jConstraints = ConstraintsKt.Constraints(0, i10, 0, Integer.MAX_VALUE);
        if (this.minLines > 1) {
            paragraphLayoutCache = this;
            layoutDirection2 = layoutDirection;
            jConstraints = m28195useMinLinesConstrainereuUD3Qg$default(paragraphLayoutCache, jConstraints, layoutDirection2, null, 4, null);
        } else {
            paragraphLayoutCache = this;
            layoutDirection2 = layoutDirection;
        }
        int iM21752e = AbstractC10410o.m21752e(TextDelegateKt.ceilToIntPx(m28197layoutTextK40F9xA$foundation_release(jConstraints, layoutDirection2).getHeight()), Constraints.m33455getMinHeightimpl(jConstraints));
        paragraphLayoutCache.cachedIntrinsicHeightInputWidth = i10;
        paragraphLayoutCache.cachedIntrinsicHeight = iM21752e;
        return iM21752e;
    }

    /* renamed from: layoutText-K40F9xA$foundation_release, reason: not valid java name */
    public final Paragraph m28197layoutTextK40F9xA$foundation_release(long j10, LayoutDirection layoutDirection) {
        ParagraphIntrinsics layoutDirection2 = setLayoutDirection(layoutDirection);
        return ParagraphKt.m32839ParagraphczeNHc(layoutDirection2, LayoutUtilsKt.m28175finalConstraintstfFHcEY(j10, this.softWrap, this.overflow, layoutDirection2.getMaxIntrinsicWidth()), LayoutUtilsKt.m28176finalMaxLinesxdlQI24(this.softWrap, this.overflow, this.maxLines), this.overflow);
    }

    /* renamed from: layoutWithConstraints-K40F9xA, reason: not valid java name */
    public final boolean m28198layoutWithConstraintsK40F9xA(long j10, LayoutDirection layoutDirection) {
        ParagraphLayoutCache paragraphLayoutCache;
        LayoutDirection layoutDirection2;
        boolean z10 = true;
        if (this.minLines > 1) {
            paragraphLayoutCache = this;
            layoutDirection2 = layoutDirection;
            j10 = m28195useMinLinesConstrainereuUD3Qg$default(paragraphLayoutCache, j10, layoutDirection2, null, 4, null);
        } else {
            paragraphLayoutCache = this;
            layoutDirection2 = layoutDirection;
        }
        boolean z11 = false;
        if (m28193newLayoutWillBeDifferentK40F9xA(j10, layoutDirection2)) {
            Paragraph paragraphM28197layoutTextK40F9xA$foundation_release = m28197layoutTextK40F9xA$foundation_release(j10, layoutDirection2);
            paragraphLayoutCache.prevConstraints = j10;
            paragraphLayoutCache.layoutSize = ConstraintsKt.m33468constrain4WqzIAM(j10, IntSize.m33667constructorimpl((TextDelegateKt.ceilToIntPx(paragraphM28197layoutTextK40F9xA$foundation_release.getWidth()) << 32) | (TextDelegateKt.ceilToIntPx(paragraphM28197layoutTextK40F9xA$foundation_release.getHeight()) & 4294967295L)));
            if (!TextOverflow.m33427equalsimpl0(paragraphLayoutCache.overflow, TextOverflow.Companion.m33440getVisiblegIe3tQ8()) && (((int) (r13 >> 32)) < paragraphM28197layoutTextK40F9xA$foundation_release.getWidth() || ((int) (r13 & 4294967295L)) < paragraphM28197layoutTextK40F9xA$foundation_release.getHeight())) {
                z11 = true;
            }
            paragraphLayoutCache.didOverflow = z11;
            paragraphLayoutCache.paragraph = paragraphM28197layoutTextK40F9xA$foundation_release;
            return true;
        }
        if (!Constraints.m33447equalsimpl0(j10, paragraphLayoutCache.prevConstraints)) {
            Paragraph paragraph = paragraphLayoutCache.paragraph;
            AbstractC9979u.m20291d(paragraph);
            paragraphLayoutCache.layoutSize = ConstraintsKt.m33468constrain4WqzIAM(j10, IntSize.m33667constructorimpl((TextDelegateKt.ceilToIntPx(Math.min(paragraph.getMaxIntrinsicWidth(), paragraph.getWidth())) << 32) | (TextDelegateKt.ceilToIntPx(paragraph.getHeight()) & 4294967295L)));
            if (TextOverflow.m33427equalsimpl0(paragraphLayoutCache.overflow, TextOverflow.Companion.m33440getVisiblegIe3tQ8()) || (((int) (r7 >> 32)) >= paragraph.getWidth() && ((int) (4294967295L & r7)) >= paragraph.getHeight())) {
                z10 = false;
            }
            paragraphLayoutCache.didOverflow = z10;
            paragraphLayoutCache.prevConstraints = j10;
        }
        return false;
    }

    public final int maxIntrinsicWidth(LayoutDirection layoutDirection) {
        return TextDelegateKt.ceilToIntPx(setLayoutDirection(layoutDirection).getMaxIntrinsicWidth());
    }

    public final int minIntrinsicWidth(LayoutDirection layoutDirection) {
        return TextDelegateKt.ceilToIntPx(setLayoutDirection(layoutDirection).getMinIntrinsicWidth());
    }

    public final void setDensity$foundation_release(Density density) {
        Density density2 = this.density;
        long jM28166constructorimpl = density != null ? InlineDensity.m28166constructorimpl(density) : InlineDensity.Companion.m28174getUnspecifiedL26CHvs();
        if (density2 == null) {
            this.density = density;
            this.lastDensity = jM28166constructorimpl;
        } else if (density == null || !InlineDensity.m28168equalsimpl0(this.lastDensity, jM28166constructorimpl)) {
            this.density = density;
            this.lastDensity = jM28166constructorimpl;
            markDirty();
        }
    }

    public final void setDidOverflow$foundation_release(boolean z10) {
        this.didOverflow = z10;
    }

    /* renamed from: setLayoutSize-ozmzZPI$foundation_release, reason: not valid java name */
    public final void m28199setLayoutSizeozmzZPI$foundation_release(long j10) {
        this.layoutSize = j10;
    }

    public final void setParagraph$foundation_release(Paragraph paragraph) {
        this.paragraph = paragraph;
    }

    public final TextLayoutResult slowCreateTextLayoutResultOrNull(TextStyle textStyle) {
        Density density;
        LayoutDirection layoutDirection = this.intrinsicsLayoutDirection;
        if (layoutDirection == null || (density = this.density) == null) {
            return null;
        }
        AnnotatedString annotatedString = new AnnotatedString(this.text, null, 2, null);
        if (this.paragraph == null || this.paragraphIntrinsics == null) {
            return null;
        }
        long jM33442constructorimpl = Constraints.m33442constructorimpl(this.prevConstraints & ConstraintsKt.MaxDimensionsAndFocusMask);
        return new TextLayoutResult(new TextLayoutInput(annotatedString, textStyle, AbstractC10978w.m24136n(), this.maxLines, this.softWrap, this.overflow, density, layoutDirection, this.fontFamilyResolver, jM33442constructorimpl, (AbstractC9972n) null), new MultiParagraph(new MultiParagraphIntrinsics(annotatedString, textStyle, (List<AnnotatedString.Range<Placeholder>>) AbstractC10978w.m24136n(), density, this.fontFamilyResolver), jM33442constructorimpl, this.maxLines, this.overflow, (AbstractC9972n) null), this.layoutSize, null);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ParagraphLayoutCache(paragraph=");
        sb2.append(this.paragraph != null ? "<paragraph>" : "null");
        sb2.append(", lastDensity=");
        sb2.append((Object) InlineDensity.m28172toStringimpl(this.lastDensity));
        sb2.append(')');
        return sb2.toString();
    }

    /* renamed from: update-L6sJoHM, reason: not valid java name */
    public final void m28200updateL6sJoHM(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i10, boolean z10, int i11, int i12) {
        this.text = str;
        this.style = textStyle;
        this.fontFamilyResolver = resolver;
        this.overflow = i10;
        this.softWrap = z10;
        this.maxLines = i11;
        this.minLines = i12;
        markDirty();
    }

    private ParagraphLayoutCache(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i10, boolean z10, int i11, int i12) {
        this.text = str;
        this.style = textStyle;
        this.fontFamilyResolver = resolver;
        this.overflow = i10;
        this.softWrap = z10;
        this.maxLines = i11;
        this.minLines = i12;
        this.lastDensity = InlineDensity.Companion.m28174getUnspecifiedL26CHvs();
        long j10 = 0;
        this.layoutSize = IntSize.m33667constructorimpl((j10 & 4294967295L) | (j10 << 32));
        this.prevConstraints = Constraints.Companion.m33464fixedJhjzzOo(0, 0);
        this.cachedIntrinsicHeightInputWidth = -1;
        this.cachedIntrinsicHeight = -1;
    }

    public /* synthetic */ ParagraphLayoutCache(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i10, boolean z10, int i11, int i12, int i13, AbstractC9972n abstractC9972n) {
        this(str, textStyle, resolver, (i13 & 8) != 0 ? TextOverflow.Companion.m33436getClipgIe3tQ8() : i10, (i13 & 16) != 0 ? true : z10, (i13 & 32) != 0 ? Integer.MAX_VALUE : i11, (i13 & 64) != 0 ? 1 : i12, null);
    }
}
