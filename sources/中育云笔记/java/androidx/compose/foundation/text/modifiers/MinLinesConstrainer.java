package androidx.compose.foundation.text.modifiers;

import androidx.compose.p014ui.text.ParagraphKt;
import androidx.compose.p014ui.text.TextStyle;
import androidx.compose.p014ui.text.TextStyleKt;
import androidx.compose.p014ui.text.font.FontFamily;
import androidx.compose.p014ui.text.style.TextOverflow;
import androidx.compose.p014ui.unit.Constraints;
import androidx.compose.p014ui.unit.ConstraintsKt;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.p014ui.unit.DensityKt;
import androidx.compose.p014ui.unit.LayoutDirection;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p265nd.AbstractC10410o;
import p325rc.AbstractC10978w;

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
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        public final MinLinesConstrainer from(MinLinesConstrainer minLinesConstrainer, LayoutDirection layoutDirection, TextStyle textStyle, Density density, FontFamily.Resolver resolver) {
            if (minLinesConstrainer != null && layoutDirection == minLinesConstrainer.getLayoutDirection() && AbstractC9979u.m20289b(TextStyleKt.resolveDefaults(textStyle, layoutDirection), minLinesConstrainer.getInputTextStyle()) && density.getDensity() == minLinesConstrainer.getDensity().getDensity() && resolver == minLinesConstrainer.getFontFamilyResolver()) {
                return minLinesConstrainer;
            }
            MinLinesConstrainer minLinesConstrainer2 = MinLinesConstrainer.last;
            if (minLinesConstrainer2 != null && layoutDirection == minLinesConstrainer2.getLayoutDirection() && AbstractC9979u.m20289b(TextStyleKt.resolveDefaults(textStyle, layoutDirection), minLinesConstrainer2.getInputTextStyle()) && density.getDensity() == minLinesConstrainer2.getDensity().getDensity() && resolver == minLinesConstrainer2.getFontFamilyResolver()) {
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
    public final long m28179coerceMinLinesOh53vG4$foundation_release(long j10, int i10) {
        float f10 = this.oneLineHeightCache;
        float f11 = this.lineHeightCache;
        if (Float.isNaN(f10) || Float.isNaN(f11)) {
            String str = MinLinesConstrainerKt.EmptyTextReplacement;
            TextStyle textStyle = this.resolvedStyle;
            long jConstraints$default = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
            Density density = this.density;
            FontFamily.Resolver resolver = this.fontFamilyResolver;
            TextOverflow.Companion companion = TextOverflow.Companion;
            float height = ParagraphKt.m32835ParagraphUl8oQg4(str, textStyle, jConstraints$default, density, resolver, (64 & 32) != 0 ? AbstractC10978w.m24136n() : null, (64 & 64) != 0 ? AbstractC10978w.m24136n() : null, (64 & 128) != 0 ? Integer.MAX_VALUE : 1, (64 & 256) != 0 ? TextOverflow.Companion.m33436getClipgIe3tQ8() : companion.m33436getClipgIe3tQ8()).getHeight();
            float height2 = ParagraphKt.m32835ParagraphUl8oQg4(MinLinesConstrainerKt.TwoLineTextReplacement, this.resolvedStyle, ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null), this.density, this.fontFamilyResolver, (64 & 32) != 0 ? AbstractC10978w.m24136n() : null, (64 & 64) != 0 ? AbstractC10978w.m24136n() : null, (64 & 128) != 0 ? Integer.MAX_VALUE : 2, (64 & 256) != 0 ? TextOverflow.Companion.m33436getClipgIe3tQ8() : companion.m33436getClipgIe3tQ8()).getHeight() - height;
            this.oneLineHeightCache = height;
            this.lineHeightCache = height2;
            f11 = height2;
            f10 = height;
        }
        return ConstraintsKt.Constraints(Constraints.m33456getMinWidthimpl(j10), Constraints.m33454getMaxWidthimpl(j10), i10 != 1 ? AbstractC10410o.m21756i(AbstractC10410o.m21752e(Math.round(f10 + (f11 * (i10 - 1))), 0), Constraints.m33453getMaxHeightimpl(j10)) : Constraints.m33455getMinHeightimpl(j10), Constraints.m33453getMaxHeightimpl(j10));
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
