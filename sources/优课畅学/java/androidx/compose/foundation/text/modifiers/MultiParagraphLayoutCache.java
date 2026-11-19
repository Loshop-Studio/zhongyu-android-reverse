package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.TextAutoSize;
import androidx.compose.foundation.text.TextDelegateKt;
import androidx.compose.foundation.text.modifiers.MinLinesConstrainer;
import androidx.compose.p013ui.text.AnnotatedString;
import androidx.compose.p013ui.text.MultiParagraph;
import androidx.compose.p013ui.text.MultiParagraphIntrinsics;
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
import androidx.compose.p013ui.unit.TextUnit;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p077d8.AbstractC8323h;
import p134i7.AbstractC8809v;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class MultiParagraphLayoutCache {
    public static final int $stable = 8;
    private TextAutoSizeLayoutScopeImpl _textAutoSizeLayoutScope;
    private TextAutoSize autoSize;
    private int cachedIntrinsicHeight;
    private int cachedIntrinsicHeightInputWidth;
    private Density density;
    private FontFamily.Resolver fontFamilyResolver;
    private LayoutDirection intrinsicsLayoutDirection;
    private long lastDensity;
    private TextLayoutResult layoutCache;
    private MinLinesConstrainer mMinLinesConstrainer;
    private int maxLines;
    private int minLines;
    private int overflow;
    private MultiParagraphIntrinsics paragraphIntrinsics;
    private List<AnnotatedString.Range<Placeholder>> placeholders;
    private boolean softWrap;
    private TextStyle style;
    private AnnotatedString text;

    public final class TextAutoSizeLayoutScopeImpl implements TextAutoSizeLayoutScope {
        private TextLayoutResult lastLayoutResult;

        public TextAutoSizeLayoutScopeImpl() {
        }

        @Override // androidx.compose.p013ui.unit.Density
        public float getDensity() {
            Density density$foundation_release = MultiParagraphLayoutCache.this.getDensity$foundation_release();
            AbstractC9133u.m16130d(density$foundation_release);
            return density$foundation_release.getDensity();
        }

        @Override // androidx.compose.p013ui.unit.FontScaling
        public float getFontScale() {
            Density density$foundation_release = MultiParagraphLayoutCache.this.getDensity$foundation_release();
            AbstractC9133u.m16130d(density$foundation_release);
            return density$foundation_release.getFontScale();
        }

        public final TextLayoutResult getLastLayoutResult() {
            return this.lastLayoutResult;
        }

        @Override // androidx.compose.foundation.text.modifiers.TextAutoSizeLayoutScope
        /* renamed from: performLayout-5ZSfY2I, reason: not valid java name */
        public TextLayoutResult mo21588performLayout5ZSfY2I(long j10, AnnotatedString annotatedString, long j11) {
            long jM21585useMinLinesConstrainerOh53vG4;
            TextStyle textStyle = MultiParagraphLayoutCache.this.style;
            long jM21590timesNB67dxo = TextUnit.m27095isEmimpl(j11) ? MultiParagraphLayoutCacheKt.m21590timesNB67dxo(MultiParagraphLayoutCache.this.style.m26395getFontSizeXSAIIZE(), j11) : j11;
            if (!TextUnit.m27090equalsimpl0(jM21590timesNB67dxo, MultiParagraphLayoutCache.this.style.m26395getFontSizeXSAIIZE())) {
                MultiParagraphLayoutCache multiParagraphLayoutCache = MultiParagraphLayoutCache.this;
                multiParagraphLayoutCache.setStyle(TextStyle.m26377copyp1EtxEg$default(multiParagraphLayoutCache.style, 0L, jM21590timesNB67dxo, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777213, null));
            }
            if (MultiParagraphLayoutCache.this.minLines > 1) {
                MultiParagraphLayoutCache multiParagraphLayoutCache2 = MultiParagraphLayoutCache.this;
                LayoutDirection layoutDirection = multiParagraphLayoutCache2.intrinsicsLayoutDirection;
                AbstractC9133u.m16130d(layoutDirection);
                jM21585useMinLinesConstrainerOh53vG4 = multiParagraphLayoutCache2.m21585useMinLinesConstrainerOh53vG4(j10, layoutDirection);
            } else {
                jM21585useMinLinesConstrainerOh53vG4 = j10;
            }
            MultiParagraphLayoutCache multiParagraphLayoutCache3 = MultiParagraphLayoutCache.this;
            LayoutDirection layoutDirection2 = multiParagraphLayoutCache3.intrinsicsLayoutDirection;
            AbstractC9133u.m16130d(layoutDirection2);
            MultiParagraph multiParagraphM21582layoutTextK40F9xA = multiParagraphLayoutCache3.m21582layoutTextK40F9xA(jM21585useMinLinesConstrainerOh53vG4, layoutDirection2);
            MultiParagraphLayoutCache multiParagraphLayoutCache4 = MultiParagraphLayoutCache.this;
            LayoutDirection layoutDirection3 = multiParagraphLayoutCache4.intrinsicsLayoutDirection;
            AbstractC9133u.m16130d(layoutDirection3);
            TextLayoutResult textLayoutResultM21584textLayoutResultVKLhPVY = multiParagraphLayoutCache4.m21584textLayoutResultVKLhPVY(layoutDirection3, jM21585useMinLinesConstrainerOh53vG4, multiParagraphM21582layoutTextK40F9xA);
            this.lastLayoutResult = textLayoutResultM21584textLayoutResultVKLhPVY;
            MultiParagraphLayoutCache.this.setStyle(textStyle);
            return textLayoutResultM21584textLayoutResultVKLhPVY;
        }

        @Override // androidx.compose.p013ui.unit.Density
        /* renamed from: toPx--R2X_6o */
        public float mo20496toPxR2X_6o(long j10) {
            if (!TextUnit.m27095isEmimpl(j10)) {
                return mo20497toPx0680j_4(mo20492toDpGaN1DYA(j10));
            }
            if (TextUnit.m27095isEmimpl(MultiParagraphLayoutCache.this.style.m26395getFontSizeXSAIIZE())) {
                throw new IllegalStateException("InternalAutoSize -> toPx(): Cannot convert Em to Px when style.fontSize is Em\nDeclare the composable's style.fontSize with Sp units instead.");
            }
            if (TextUnit.m27090equalsimpl0(MultiParagraphLayoutCache.this.style.m26395getFontSizeXSAIIZE(), TextUnit.Companion.m27104getUnspecifiedXSAIIZE())) {
                throw new IllegalStateException("InternalAutoSize -> toPx(): Cannot convert Em to Px when style.fontSize is not set. Please specify a font size.");
            }
            return mo20496toPxR2X_6o(MultiParagraphLayoutCache.this.style.m26395getFontSizeXSAIIZE()) * TextUnit.m27093getValueimpl(j10);
        }
    }

    public /* synthetic */ MultiParagraphLayoutCache(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, int i10, boolean z10, int i11, int i12, List list, TextAutoSize textAutoSize, AbstractC9126n abstractC9126n) {
        this(annotatedString, textStyle, resolver, i10, z10, i11, i12, list, textAutoSize);
    }

    private final TextAutoSizeLayoutScopeImpl getFontSizeSearchScope() {
        if (this._textAutoSizeLayoutScope == null) {
            this._textAutoSizeLayoutScope = new TextAutoSizeLayoutScopeImpl();
        }
        TextAutoSizeLayoutScopeImpl textAutoSizeLayoutScopeImpl = this._textAutoSizeLayoutScope;
        AbstractC9133u.m16130d(textAutoSizeLayoutScopeImpl);
        return textAutoSizeLayoutScopeImpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: layoutText-K40F9xA, reason: not valid java name */
    public final MultiParagraph m21582layoutTextK40F9xA(long j10, LayoutDirection layoutDirection) {
        MultiParagraphIntrinsics layoutDirection2 = setLayoutDirection(layoutDirection);
        return new MultiParagraph(layoutDirection2, LayoutUtilsKt.m21573finalConstraintstfFHcEY(j10, this.softWrap, this.overflow, layoutDirection2.getMaxIntrinsicWidth()), LayoutUtilsKt.m21574finalMaxLinesxdlQI24(this.softWrap, this.overflow, this.maxLines), this.overflow, (AbstractC9126n) null);
    }

    private final void markDirty() {
        this.paragraphIntrinsics = null;
        this.layoutCache = null;
        this.cachedIntrinsicHeight = -1;
        this.cachedIntrinsicHeightInputWidth = -1;
        this._textAutoSizeLayoutScope = null;
    }

    private final void markStyleAffectedDirty() {
        this.paragraphIntrinsics = null;
        this.layoutCache = null;
        this.cachedIntrinsicHeight = -1;
        this.cachedIntrinsicHeightInputWidth = -1;
    }

    /* renamed from: newLayoutWillBeDifferent-VKLhPVY, reason: not valid java name */
    private final boolean m21583newLayoutWillBeDifferentVKLhPVY(TextLayoutResult textLayoutResult, long j10, LayoutDirection layoutDirection) {
        if (textLayoutResult == null || textLayoutResult.getMultiParagraph().getIntrinsics().getHasStaleResolvedFonts() || layoutDirection != textLayoutResult.getLayoutInput().getLayoutDirection()) {
            return true;
        }
        if (Constraints.m26845equalsimpl0(j10, textLayoutResult.getLayoutInput().m26330getConstraintsmsEJaDk())) {
            return false;
        }
        return Constraints.m26852getMaxWidthimpl(j10) != Constraints.m26852getMaxWidthimpl(textLayoutResult.getLayoutInput().m26330getConstraintsmsEJaDk()) || Constraints.m26854getMinWidthimpl(j10) != Constraints.m26854getMinWidthimpl(textLayoutResult.getLayoutInput().m26330getConstraintsmsEJaDk()) || ((float) Constraints.m26851getMaxHeightimpl(j10)) < textLayoutResult.getMultiParagraph().getHeight() || textLayoutResult.getMultiParagraph().getDidExceedMaxLines();
    }

    private final MultiParagraphIntrinsics setLayoutDirection(LayoutDirection layoutDirection) {
        MultiParagraphIntrinsics multiParagraphIntrinsics = this.paragraphIntrinsics;
        if (multiParagraphIntrinsics == null || layoutDirection != this.intrinsicsLayoutDirection || multiParagraphIntrinsics.getHasStaleResolvedFonts()) {
            this.intrinsicsLayoutDirection = layoutDirection;
            AnnotatedString annotatedString = this.text;
            TextStyle textStyleResolveDefaults = TextStyleKt.resolveDefaults(this.style, layoutDirection);
            Density density = this.density;
            AbstractC9133u.m16130d(density);
            FontFamily.Resolver resolver = this.fontFamilyResolver;
            List<AnnotatedString.Range<Placeholder>> listM14771n = this.placeholders;
            if (listM14771n == null) {
                listM14771n = AbstractC8809v.m14771n();
            }
            multiParagraphIntrinsics = new MultiParagraphIntrinsics(annotatedString, textStyleResolveDefaults, listM14771n, density, resolver);
        }
        this.paragraphIntrinsics = multiParagraphIntrinsics;
        return multiParagraphIntrinsics;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setStyle(TextStyle textStyle) {
        boolean zHasSameLayoutAffectingAttributes = textStyle.hasSameLayoutAffectingAttributes(this.style);
        this.style = textStyle;
        if (zHasSameLayoutAffectingAttributes) {
            return;
        }
        markStyleAffectedDirty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: textLayoutResult-VKLhPVY, reason: not valid java name */
    public final TextLayoutResult m21584textLayoutResultVKLhPVY(LayoutDirection layoutDirection, long j10, MultiParagraph multiParagraph) {
        float fMin = Math.min(multiParagraph.getIntrinsics().getMaxIntrinsicWidth(), multiParagraph.getWidth());
        AnnotatedString annotatedString = this.text;
        TextStyle textStyle = this.style;
        List<AnnotatedString.Range<Placeholder>> listM14771n = this.placeholders;
        if (listM14771n == null) {
            listM14771n = AbstractC8809v.m14771n();
        }
        int i10 = this.maxLines;
        boolean z10 = this.softWrap;
        int i11 = this.overflow;
        Density density = this.density;
        AbstractC9133u.m16130d(density);
        return new TextLayoutResult(new TextLayoutInput(annotatedString, textStyle, listM14771n, i10, z10, i11, density, layoutDirection, this.fontFamilyResolver, j10, (AbstractC9126n) null), multiParagraph, ConstraintsKt.m26866constrain4WqzIAM(j10, IntSize.m27065constructorimpl((TextDelegateKt.ceilToIntPx(fMin) << 32) | (TextDelegateKt.ceilToIntPx(multiParagraph.getHeight()) & 4294967295L))), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: useMinLinesConstrainer-Oh53vG4, reason: not valid java name */
    public final long m21585useMinLinesConstrainerOh53vG4(long j10, LayoutDirection layoutDirection) {
        MinLinesConstrainer.Companion companion = MinLinesConstrainer.Companion;
        MinLinesConstrainer minLinesConstrainer = this.mMinLinesConstrainer;
        TextStyle textStyle = this.style;
        Density density = this.density;
        AbstractC9133u.m16130d(density);
        MinLinesConstrainer minLinesConstrainerFrom = companion.from(minLinesConstrainer, layoutDirection, textStyle, density, this.fontFamilyResolver);
        this.mMinLinesConstrainer = minLinesConstrainerFrom;
        return minLinesConstrainerFrom.m21577coerceMinLinesOh53vG4$foundation_release(j10, this.minLines);
    }

    public final Density getDensity$foundation_release() {
        return this.density;
    }

    public final TextLayoutResult getLayoutOrNull() {
        return this.layoutCache;
    }

    public final TextLayoutResult getTextLayoutResult() {
        TextLayoutResult textLayoutResult = this.layoutCache;
        if (textLayoutResult != null) {
            return textLayoutResult;
        }
        throw new IllegalStateException("You must call layoutWithConstraints first");
    }

    public final int intrinsicHeight(int i10, LayoutDirection layoutDirection) {
        int i11 = this.cachedIntrinsicHeightInputWidth;
        int i12 = this.cachedIntrinsicHeight;
        if (i10 == i11 && i11 != -1) {
            return i12;
        }
        long jConstraints = ConstraintsKt.Constraints(0, i10, 0, Integer.MAX_VALUE);
        if (this.minLines > 1) {
            jConstraints = m21585useMinLinesConstrainerOh53vG4(jConstraints, layoutDirection);
        }
        int iM13510e = AbstractC8323h.m13510e(TextDelegateKt.ceilToIntPx(m21582layoutTextK40F9xA(jConstraints, layoutDirection).getHeight()), Constraints.m26853getMinHeightimpl(jConstraints));
        this.cachedIntrinsicHeightInputWidth = i10;
        this.cachedIntrinsicHeight = iM13510e;
        return iM13510e;
    }

    /* renamed from: layoutWithConstraints-K40F9xA, reason: not valid java name */
    public final boolean m21586layoutWithConstraintsK40F9xA(long j10, LayoutDirection layoutDirection) {
        long jM21585useMinLinesConstrainerOh53vG4 = this.minLines > 1 ? m21585useMinLinesConstrainerOh53vG4(j10, layoutDirection) : j10;
        if (!m21583newLayoutWillBeDifferentVKLhPVY(this.layoutCache, jM21585useMinLinesConstrainerOh53vG4, layoutDirection)) {
            TextLayoutResult textLayoutResult = this.layoutCache;
            AbstractC9133u.m16130d(textLayoutResult);
            if (Constraints.m26845equalsimpl0(jM21585useMinLinesConstrainerOh53vG4, textLayoutResult.getLayoutInput().m26330getConstraintsmsEJaDk())) {
                return false;
            }
            TextLayoutResult textLayoutResult2 = this.layoutCache;
            AbstractC9133u.m16130d(textLayoutResult2);
            this.layoutCache = m21584textLayoutResultVKLhPVY(layoutDirection, jM21585useMinLinesConstrainerOh53vG4, textLayoutResult2.getMultiParagraph());
            return true;
        }
        if (this.autoSize != null) {
            this.intrinsicsLayoutDirection = layoutDirection;
            long jM26395getFontSizeXSAIIZE = this.style.m26395getFontSizeXSAIIZE();
            TextAutoSize textAutoSize = this.autoSize;
            AbstractC9133u.m16130d(textAutoSize);
            long jMo21157getFontSizeCi0_558 = textAutoSize.mo21157getFontSizeCi0_558(getFontSizeSearchScope(), j10, this.text);
            if (TextUnit.m27095isEmimpl(jMo21157getFontSizeCi0_558)) {
                jMo21157getFontSizeCi0_558 = MultiParagraphLayoutCacheKt.m21590timesNB67dxo(jM26395getFontSizeXSAIIZE, jMo21157getFontSizeCi0_558);
            }
            long j11 = jMo21157getFontSizeCi0_558;
            TextLayoutResult lastLayoutResult = getFontSizeSearchScope().getLastLayoutResult();
            if (lastLayoutResult != null && TextUnit.m27090equalsimpl0(j11, lastLayoutResult.getLayoutInput().getStyle().m26395getFontSizeXSAIIZE()) && TextOverflow.m26825equalsimpl0(lastLayoutResult.getLayoutInput().m26331getOverflowgIe3tQ8(), this.overflow)) {
                this.layoutCache = lastLayoutResult;
                return true;
            }
            setStyle(TextStyle.m26377copyp1EtxEg$default(this.style, 0L, j11, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777213, null));
        }
        this.layoutCache = m21584textLayoutResultVKLhPVY(layoutDirection, jM21585useMinLinesConstrainerOh53vG4, m21582layoutTextK40F9xA(jM21585useMinLinesConstrainerOh53vG4, layoutDirection));
        return true;
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

    /* renamed from: update-J2qo7bo, reason: not valid java name */
    public final void m21587updateJ2qo7bo(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, int i10, boolean z10, int i11, int i12, List<AnnotatedString.Range<Placeholder>> list, TextAutoSize textAutoSize) {
        this.text = annotatedString;
        setStyle(textStyle);
        this.fontFamilyResolver = resolver;
        this.overflow = i10;
        this.softWrap = z10;
        this.maxLines = i11;
        this.minLines = i12;
        this.placeholders = list;
        this.autoSize = textAutoSize;
        markDirty();
    }

    private MultiParagraphLayoutCache(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, int i10, boolean z10, int i11, int i12, List<AnnotatedString.Range<Placeholder>> list, TextAutoSize textAutoSize) {
        this.text = annotatedString;
        this.fontFamilyResolver = resolver;
        this.overflow = i10;
        this.softWrap = z10;
        this.maxLines = i11;
        this.minLines = i12;
        this.placeholders = list;
        this.autoSize = textAutoSize;
        this.lastDensity = InlineDensity.Companion.m21572getUnspecifiedL26CHvs();
        this.style = textStyle;
        this.cachedIntrinsicHeightInputWidth = -1;
        this.cachedIntrinsicHeight = -1;
    }

    public /* synthetic */ MultiParagraphLayoutCache(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, int i10, boolean z10, int i11, int i12, List list, TextAutoSize textAutoSize, int i13, AbstractC9126n abstractC9126n) {
        this(annotatedString, textStyle, resolver, (i13 & 8) != 0 ? TextOverflow.Companion.m26834getClipgIe3tQ8() : i10, (i13 & 16) != 0 ? true : z10, (i13 & 32) != 0 ? Integer.MAX_VALUE : i11, (i13 & 64) != 0 ? 1 : i12, (i13 & 128) != 0 ? null : list, (i13 & 256) != 0 ? null : textAutoSize, null);
    }
}
