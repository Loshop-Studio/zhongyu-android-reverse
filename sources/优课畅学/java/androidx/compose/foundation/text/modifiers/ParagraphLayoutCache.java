package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.TextDelegateKt;
import androidx.compose.foundation.text.modifiers.MinLinesConstrainer;
import androidx.compose.p013ui.text.AnnotatedString;
import androidx.compose.p013ui.text.MultiParagraph;
import androidx.compose.p013ui.text.MultiParagraphIntrinsics;
import androidx.compose.p013ui.text.Paragraph;
import androidx.compose.p013ui.text.ParagraphIntrinsics;
import androidx.compose.p013ui.text.ParagraphIntrinsicsKt;
import androidx.compose.p013ui.text.ParagraphKt;
import androidx.compose.p013ui.text.Placeholder;
import androidx.compose.p013ui.text.TextLayoutInput;
import androidx.compose.p013ui.text.TextLayoutResult;
import androidx.compose.p013ui.text.TextStyle;
import androidx.compose.p013ui.text.TextStyleKt;
import androidx.compose.p013ui.text.font.FontFamily;
import androidx.compose.p013ui.text.style.TextOverflow;
import androidx.compose.p013ui.unit.Constraints;
import androidx.compose.p013ui.unit.ConstraintsKt;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.p013ui.unit.IntSize;
import androidx.compose.p013ui.unit.LayoutDirection;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p077d8.AbstractC8323h;
import p123h7.C8736p;
import p134i7.AbstractC8809v;

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

    public /* synthetic */ ParagraphLayoutCache(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i10, boolean z10, int i11, int i12, AbstractC9126n abstractC9126n) {
        this(str, textStyle, resolver, i10, z10, i11, i12);
    }

    private final void markDirty() {
        this.paragraph = null;
        this.paragraphIntrinsics = null;
        this.intrinsicsLayoutDirection = null;
        this.cachedIntrinsicHeightInputWidth = -1;
        this.cachedIntrinsicHeight = -1;
        this.prevConstraints = Constraints.Companion.m26862fixedJhjzzOo(0, 0);
        long j10 = 0;
        this.layoutSize = IntSize.m27065constructorimpl((j10 & 4294967295L) | (j10 << 32));
        this.didOverflow = false;
    }

    /* renamed from: newLayoutWillBeDifferent-K40F9xA, reason: not valid java name */
    private final boolean m21591newLayoutWillBeDifferentK40F9xA(long j10, LayoutDirection layoutDirection) {
        ParagraphIntrinsics paragraphIntrinsics;
        Paragraph paragraph = this.paragraph;
        if (paragraph == null || (paragraphIntrinsics = this.paragraphIntrinsics) == null || paragraphIntrinsics.getHasStaleResolvedFonts() || layoutDirection != this.intrinsicsLayoutDirection) {
            return true;
        }
        if (Constraints.m26845equalsimpl0(j10, this.prevConstraints)) {
            return false;
        }
        return Constraints.m26852getMaxWidthimpl(j10) != Constraints.m26852getMaxWidthimpl(this.prevConstraints) || Constraints.m26854getMinWidthimpl(j10) != Constraints.m26854getMinWidthimpl(this.prevConstraints) || ((float) Constraints.m26851getMaxHeightimpl(j10)) < paragraph.getHeight() || paragraph.getDidExceedMaxLines();
    }

    private final ParagraphIntrinsics setLayoutDirection(LayoutDirection layoutDirection) {
        ParagraphIntrinsics ParagraphIntrinsics = this.paragraphIntrinsics;
        if (ParagraphIntrinsics == null || layoutDirection != this.intrinsicsLayoutDirection || ParagraphIntrinsics.getHasStaleResolvedFonts()) {
            this.intrinsicsLayoutDirection = layoutDirection;
            String str = this.text;
            TextStyle textStyleResolveDefaults = TextStyleKt.resolveDefaults(this.style, layoutDirection);
            List listM14771n = AbstractC8809v.m14771n();
            Density density = this.density;
            AbstractC9133u.m16130d(density);
            ParagraphIntrinsics = ParagraphIntrinsicsKt.ParagraphIntrinsics(str, textStyleResolveDefaults, (List<? extends AnnotatedString.Range<? extends AnnotatedString.Annotation>>) listM14771n, density, this.fontFamilyResolver, (List<AnnotatedString.Range<Placeholder>>) AbstractC8809v.m14771n());
        }
        this.paragraphIntrinsics = ParagraphIntrinsics;
        return ParagraphIntrinsics;
    }

    /* renamed from: useMinLinesConstrainer-euUD3Qg, reason: not valid java name */
    private final long m21592useMinLinesConstrainereuUD3Qg(long j10, LayoutDirection layoutDirection, TextStyle textStyle) {
        MinLinesConstrainer.Companion companion = MinLinesConstrainer.Companion;
        MinLinesConstrainer minLinesConstrainer = this.mMinLinesConstrainer;
        Density density = this.density;
        AbstractC9133u.m16130d(density);
        MinLinesConstrainer minLinesConstrainerFrom = companion.from(minLinesConstrainer, layoutDirection, textStyle, density, this.fontFamilyResolver);
        this.mMinLinesConstrainer = minLinesConstrainerFrom;
        return minLinesConstrainerFrom.m21577coerceMinLinesOh53vG4$foundation_release(j10, this.minLines);
    }

    /* renamed from: useMinLinesConstrainer-euUD3Qg$default, reason: not valid java name */
    public static /* synthetic */ long m21593useMinLinesConstrainereuUD3Qg$default(ParagraphLayoutCache paragraphLayoutCache, long j10, LayoutDirection layoutDirection, TextStyle textStyle, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            textStyle = paragraphLayoutCache.style;
        }
        return paragraphLayoutCache.m21592useMinLinesConstrainereuUD3Qg(j10, layoutDirection, textStyle);
    }

    public final Density getDensity$foundation_release() {
        return this.density;
    }

    public final boolean getDidOverflow$foundation_release() {
        return this.didOverflow;
    }

    /* renamed from: getLayoutSize-YbymL2g$foundation_release, reason: not valid java name */
    public final long m21594getLayoutSizeYbymL2g$foundation_release() {
        return this.layoutSize;
    }

    public final C8736p getObserveFontChanges$foundation_release() {
        ParagraphIntrinsics paragraphIntrinsics = this.paragraphIntrinsics;
        if (paragraphIntrinsics != null) {
            paragraphIntrinsics.getHasStaleResolvedFonts();
        }
        return C8736p.f16368a;
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
            jConstraints = m21593useMinLinesConstrainereuUD3Qg$default(paragraphLayoutCache, jConstraints, layoutDirection2, null, 4, null);
        } else {
            paragraphLayoutCache = this;
            layoutDirection2 = layoutDirection;
        }
        int iM13510e = AbstractC8323h.m13510e(TextDelegateKt.ceilToIntPx(m21595layoutTextK40F9xA$foundation_release(jConstraints, layoutDirection2).getHeight()), Constraints.m26853getMinHeightimpl(jConstraints));
        paragraphLayoutCache.cachedIntrinsicHeightInputWidth = i10;
        paragraphLayoutCache.cachedIntrinsicHeight = iM13510e;
        return iM13510e;
    }

    /* renamed from: layoutText-K40F9xA$foundation_release, reason: not valid java name */
    public final Paragraph m21595layoutTextK40F9xA$foundation_release(long j10, LayoutDirection layoutDirection) {
        ParagraphIntrinsics layoutDirection2 = setLayoutDirection(layoutDirection);
        return ParagraphKt.m26237ParagraphczeNHc(layoutDirection2, LayoutUtilsKt.m21573finalConstraintstfFHcEY(j10, this.softWrap, this.overflow, layoutDirection2.getMaxIntrinsicWidth()), LayoutUtilsKt.m21574finalMaxLinesxdlQI24(this.softWrap, this.overflow, this.maxLines), this.overflow);
    }

    /* renamed from: layoutWithConstraints-K40F9xA, reason: not valid java name */
    public final boolean m21596layoutWithConstraintsK40F9xA(long j10, LayoutDirection layoutDirection) {
        ParagraphLayoutCache paragraphLayoutCache;
        LayoutDirection layoutDirection2;
        boolean z10 = true;
        if (this.minLines > 1) {
            paragraphLayoutCache = this;
            layoutDirection2 = layoutDirection;
            j10 = m21593useMinLinesConstrainereuUD3Qg$default(paragraphLayoutCache, j10, layoutDirection2, null, 4, null);
        } else {
            paragraphLayoutCache = this;
            layoutDirection2 = layoutDirection;
        }
        boolean z11 = false;
        if (m21591newLayoutWillBeDifferentK40F9xA(j10, layoutDirection2)) {
            Paragraph paragraphM21595layoutTextK40F9xA$foundation_release = m21595layoutTextK40F9xA$foundation_release(j10, layoutDirection2);
            paragraphLayoutCache.prevConstraints = j10;
            paragraphLayoutCache.layoutSize = ConstraintsKt.m26866constrain4WqzIAM(j10, IntSize.m27065constructorimpl((TextDelegateKt.ceilToIntPx(paragraphM21595layoutTextK40F9xA$foundation_release.getWidth()) << 32) | (TextDelegateKt.ceilToIntPx(paragraphM21595layoutTextK40F9xA$foundation_release.getHeight()) & 4294967295L)));
            if (!TextOverflow.m26825equalsimpl0(paragraphLayoutCache.overflow, TextOverflow.Companion.m26838getVisiblegIe3tQ8()) && (((int) (r13 >> 32)) < paragraphM21595layoutTextK40F9xA$foundation_release.getWidth() || ((int) (r13 & 4294967295L)) < paragraphM21595layoutTextK40F9xA$foundation_release.getHeight())) {
                z11 = true;
            }
            paragraphLayoutCache.didOverflow = z11;
            paragraphLayoutCache.paragraph = paragraphM21595layoutTextK40F9xA$foundation_release;
            return true;
        }
        if (!Constraints.m26845equalsimpl0(j10, paragraphLayoutCache.prevConstraints)) {
            Paragraph paragraph = paragraphLayoutCache.paragraph;
            AbstractC9133u.m16130d(paragraph);
            paragraphLayoutCache.layoutSize = ConstraintsKt.m26866constrain4WqzIAM(j10, IntSize.m27065constructorimpl((TextDelegateKt.ceilToIntPx(Math.min(paragraph.getMaxIntrinsicWidth(), paragraph.getWidth())) << 32) | (TextDelegateKt.ceilToIntPx(paragraph.getHeight()) & 4294967295L)));
            if (TextOverflow.m26825equalsimpl0(paragraphLayoutCache.overflow, TextOverflow.Companion.m26838getVisiblegIe3tQ8()) || (((int) (r7 >> 32)) >= paragraph.getWidth() && ((int) (4294967295L & r7)) >= paragraph.getHeight())) {
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
        long jM21564constructorimpl = density != null ? InlineDensity.m21564constructorimpl(density) : InlineDensity.Companion.m21572getUnspecifiedL26CHvs();
        if (density2 == null) {
            this.density = density;
            this.lastDensity = jM21564constructorimpl;
        } else if (density == null || !InlineDensity.m21566equalsimpl0(this.lastDensity, jM21564constructorimpl)) {
            this.density = density;
            this.lastDensity = jM21564constructorimpl;
            markDirty();
        }
    }

    public final void setDidOverflow$foundation_release(boolean z10) {
        this.didOverflow = z10;
    }

    /* renamed from: setLayoutSize-ozmzZPI$foundation_release, reason: not valid java name */
    public final void m21597setLayoutSizeozmzZPI$foundation_release(long j10) {
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
        long jM26840constructorimpl = Constraints.m26840constructorimpl(this.prevConstraints & ConstraintsKt.MaxDimensionsAndFocusMask);
        return new TextLayoutResult(new TextLayoutInput(annotatedString, textStyle, AbstractC8809v.m14771n(), this.maxLines, this.softWrap, this.overflow, density, layoutDirection, this.fontFamilyResolver, jM26840constructorimpl, (AbstractC9126n) null), new MultiParagraph(new MultiParagraphIntrinsics(annotatedString, textStyle, (List<AnnotatedString.Range<Placeholder>>) AbstractC8809v.m14771n(), density, this.fontFamilyResolver), jM26840constructorimpl, this.maxLines, this.overflow, (AbstractC9126n) null), this.layoutSize, null);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ParagraphLayoutCache(paragraph=");
        sb.append(this.paragraph != null ? "<paragraph>" : "null");
        sb.append(", lastDensity=");
        sb.append((Object) InlineDensity.m21570toStringimpl(this.lastDensity));
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: update-L6sJoHM, reason: not valid java name */
    public final void m21598updateL6sJoHM(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i10, boolean z10, int i11, int i12) {
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
        this.lastDensity = InlineDensity.Companion.m21572getUnspecifiedL26CHvs();
        long j10 = 0;
        this.layoutSize = IntSize.m27065constructorimpl((j10 & 4294967295L) | (j10 << 32));
        this.prevConstraints = Constraints.Companion.m26862fixedJhjzzOo(0, 0);
        this.cachedIntrinsicHeightInputWidth = -1;
        this.cachedIntrinsicHeight = -1;
    }

    public /* synthetic */ ParagraphLayoutCache(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i10, boolean z10, int i11, int i12, int i13, AbstractC9126n abstractC9126n) {
        this(str, textStyle, resolver, (i13 & 8) != 0 ? TextOverflow.Companion.m26834getClipgIe3tQ8() : i10, (i13 & 16) != 0 ? true : z10, (i13 & 32) != 0 ? Integer.MAX_VALUE : i11, (i13 & 64) != 0 ? 1 : i12, null);
    }
}
