package androidx.compose.foundation.text.modifiers;

import androidx.compose.p013ui.text.ParagraphKt;
import androidx.compose.p013ui.text.TextStyle;
import androidx.compose.p013ui.text.TextStyleKt;
import androidx.compose.p013ui.text.font.FontFamily;
import androidx.compose.p013ui.text.style.TextOverflow;
import androidx.compose.p013ui.unit.Constraints;
import androidx.compose.p013ui.unit.ConstraintsKt;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.p013ui.unit.DensityKt;
import androidx.compose.p013ui.unit.LayoutDirection;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p077d8.AbstractC8323h;
import p134i7.AbstractC8809v;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class MinLinesConstrainer {
    private static MinLinesConstrainer last;
    private final Density density;
    private final FontFamily.Resolver fontFamilyResolver;
    private final TextStyle inputTextStyle;
    private final LayoutDirection layoutDirection;
    private float lineHeightCache = Float.NaN;
    private float oneLineHeightCache = Float.NaN;
    private final TextStyle resolvedStyle;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        public final MinLinesConstrainer from(MinLinesConstrainer minLinesConstrainer, LayoutDirection layoutDirection, TextStyle textStyle, Density density, FontFamily.Resolver resolver) {
            if (minLinesConstrainer != null && layoutDirection == minLinesConstrainer.getLayoutDirection() && AbstractC9133u.m16128b(TextStyleKt.resolveDefaults(textStyle, layoutDirection), minLinesConstrainer.getInputTextStyle()) && density.getDensity() == minLinesConstrainer.getDensity().getDensity() && resolver == minLinesConstrainer.getFontFamilyResolver()) {
                return minLinesConstrainer;
            }
            MinLinesConstrainer minLinesConstrainer2 = MinLinesConstrainer.last;
            if (minLinesConstrainer2 != null && layoutDirection == minLinesConstrainer2.getLayoutDirection() && AbstractC9133u.m16128b(TextStyleKt.resolveDefaults(textStyle, layoutDirection), minLinesConstrainer2.getInputTextStyle()) && density.getDensity() == minLinesConstrainer2.getDensity().getDensity() && resolver == minLinesConstrainer2.getFontFamilyResolver()) {
                return minLinesConstrainer2;
            }
            MinLinesConstrainer minLinesConstrainer3 = new MinLinesConstrainer(layoutDirection, TextStyleKt.resolveDefaults(textStyle, layoutDirection), DensityKt.Density(density.getDensity(), density.getFontScale()), resolver);
            MinLinesConstrainer.last = minLinesConstrainer3;
            return minLinesConstrainer3;
        }

        private Companion() {
        }
    }

    public MinLinesConstrainer(LayoutDirection layoutDirection, TextStyle textStyle, Density density, FontFamily.Resolver resolver) {
        this.layoutDirection = layoutDirection;
        this.inputTextStyle = textStyle;
        this.density = density;
        this.fontFamilyResolver = resolver;
        this.resolvedStyle = TextStyleKt.resolveDefaults(textStyle, layoutDirection);
    }

    /* renamed from: coerceMinLines-Oh53vG4$foundation_release, reason: not valid java name */
    public final long m21577coerceMinLinesOh53vG4$foundation_release(long j10, int i10) {
        float f10 = this.oneLineHeightCache;
        float f11 = this.lineHeightCache;
        if (Float.isNaN(f10) || Float.isNaN(f11)) {
            String str = MinLinesConstrainerKt.EmptyTextReplacement;
            TextStyle textStyle = this.resolvedStyle;
            long jConstraints$default = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
            Density density = this.density;
            FontFamily.Resolver resolver = this.fontFamilyResolver;
            TextOverflow.Companion companion = TextOverflow.Companion;
            float height = ParagraphKt.m26233ParagraphUl8oQg4(str, textStyle, jConstraints$default, density, resolver, (64 & 32) != 0 ? AbstractC8809v.m14771n() : null, (64 & 64) != 0 ? AbstractC8809v.m14771n() : null, (64 & 128) != 0 ? Integer.MAX_VALUE : 1, (64 & 256) != 0 ? TextOverflow.Companion.m26834getClipgIe3tQ8() : companion.m26834getClipgIe3tQ8()).getHeight();
            float height2 = ParagraphKt.m26233ParagraphUl8oQg4(MinLinesConstrainerKt.TwoLineTextReplacement, this.resolvedStyle, ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null), this.density, this.fontFamilyResolver, (64 & 32) != 0 ? AbstractC8809v.m14771n() : null, (64 & 64) != 0 ? AbstractC8809v.m14771n() : null, (64 & 128) != 0 ? Integer.MAX_VALUE : 2, (64 & 256) != 0 ? TextOverflow.Companion.m26834getClipgIe3tQ8() : companion.m26834getClipgIe3tQ8()).getHeight() - height;
            this.oneLineHeightCache = height;
            this.lineHeightCache = height2;
            f11 = height2;
            f10 = height;
        }
        return ConstraintsKt.Constraints(Constraints.m26854getMinWidthimpl(j10), Constraints.m26852getMaxWidthimpl(j10), i10 != 1 ? AbstractC8323h.m13513h(AbstractC8323h.m13510e(Math.round(f10 + (f11 * (i10 - 1))), 0), Constraints.m26851getMaxHeightimpl(j10)) : Constraints.m26853getMinHeightimpl(j10), Constraints.m26851getMaxHeightimpl(j10));
    }

    public final Density getDensity() {
        return this.density;
    }

    public final FontFamily.Resolver getFontFamilyResolver() {
        return this.fontFamilyResolver;
    }

    public final TextStyle getInputTextStyle() {
        return this.inputTextStyle;
    }

    public final LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }
}
