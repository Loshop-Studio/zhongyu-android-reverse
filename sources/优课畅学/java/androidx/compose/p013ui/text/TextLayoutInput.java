package androidx.compose.p013ui.text;

import androidx.compose.p013ui.text.AnnotatedString;
import androidx.compose.p013ui.text.font.DelegatingFontLoaderForDeprecatedUsage_androidKt;
import androidx.compose.p013ui.text.font.Font;
import androidx.compose.p013ui.text.font.FontFamily;
import androidx.compose.p013ui.text.style.TextOverflow;
import androidx.compose.p013ui.unit.Constraints;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.p013ui.unit.LayoutDirection;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.InterfaceC8721a;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class TextLayoutInput {
    public static final int $stable = 8;
    private Font.ResourceLoader _developerSuppliedResourceLoader;
    private final long constraints;
    private final Density density;
    private final FontFamily.Resolver fontFamilyResolver;
    private final LayoutDirection layoutDirection;
    private final int maxLines;
    private final int overflow;
    private final List<AnnotatedString.Range<Placeholder>> placeholders;
    private final boolean softWrap;
    private final TextStyle style;
    private final AnnotatedString text;

    @InterfaceC8721a
    public /* synthetic */ TextLayoutInput(AnnotatedString annotatedString, TextStyle textStyle, List list, int i10, boolean z10, int i11, Density density, LayoutDirection layoutDirection, Font.ResourceLoader resourceLoader, long j10, AbstractC9126n abstractC9126n) {
        this(annotatedString, textStyle, (List<AnnotatedString.Range<Placeholder>>) list, i10, z10, i11, density, layoutDirection, resourceLoader, j10);
    }

    /* renamed from: copy-hu-1Yfo$default, reason: not valid java name */
    public static /* synthetic */ TextLayoutInput m26328copyhu1Yfo$default(TextLayoutInput textLayoutInput, AnnotatedString annotatedString, TextStyle textStyle, List list, int i10, boolean z10, int i11, Density density, LayoutDirection layoutDirection, Font.ResourceLoader resourceLoader, long j10, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            annotatedString = textLayoutInput.text;
        }
        if ((i12 & 2) != 0) {
            textStyle = textLayoutInput.style;
        }
        if ((i12 & 4) != 0) {
            list = textLayoutInput.placeholders;
        }
        if ((i12 & 8) != 0) {
            i10 = textLayoutInput.maxLines;
        }
        if ((i12 & 16) != 0) {
            z10 = textLayoutInput.softWrap;
        }
        if ((i12 & 32) != 0) {
            i11 = textLayoutInput.overflow;
        }
        if ((i12 & 64) != 0) {
            density = textLayoutInput.density;
        }
        if ((i12 & 128) != 0) {
            layoutDirection = textLayoutInput.layoutDirection;
        }
        if ((i12 & 256) != 0) {
            resourceLoader = textLayoutInput.getResourceLoader();
        }
        if ((i12 & 512) != 0) {
            j10 = textLayoutInput.constraints;
        }
        long j11 = j10;
        LayoutDirection layoutDirection2 = layoutDirection;
        Font.ResourceLoader resourceLoader2 = resourceLoader;
        int i13 = i11;
        Density density2 = density;
        boolean z11 = z10;
        List list2 = list;
        return textLayoutInput.m26329copyhu1Yfo(annotatedString, textStyle, list2, i10, z11, i13, density2, layoutDirection2, resourceLoader2, j11);
    }

    @InterfaceC8721a
    public static /* synthetic */ void getResourceLoader$annotations() {
    }

    @InterfaceC8721a
    /* renamed from: copy-hu-1Yfo, reason: not valid java name */
    public final TextLayoutInput m26329copyhu1Yfo(AnnotatedString annotatedString, TextStyle textStyle, List<AnnotatedString.Range<Placeholder>> list, int i10, boolean z10, int i11, Density density, LayoutDirection layoutDirection, Font.ResourceLoader resourceLoader, long j10) {
        return new TextLayoutInput(annotatedString, textStyle, list, i10, z10, i11, density, layoutDirection, resourceLoader, this.fontFamilyResolver, j10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextLayoutInput)) {
            return false;
        }
        TextLayoutInput textLayoutInput = (TextLayoutInput) obj;
        return AbstractC9133u.m16128b(this.text, textLayoutInput.text) && AbstractC9133u.m16128b(this.style, textLayoutInput.style) && AbstractC9133u.m16128b(this.placeholders, textLayoutInput.placeholders) && this.maxLines == textLayoutInput.maxLines && this.softWrap == textLayoutInput.softWrap && TextOverflow.m26825equalsimpl0(this.overflow, textLayoutInput.overflow) && AbstractC9133u.m16128b(this.density, textLayoutInput.density) && this.layoutDirection == textLayoutInput.layoutDirection && AbstractC9133u.m16128b(this.fontFamilyResolver, textLayoutInput.fontFamilyResolver) && Constraints.m26845equalsimpl0(this.constraints, textLayoutInput.constraints);
    }

    /* renamed from: getConstraints-msEJaDk, reason: not valid java name */
    public final long m26330getConstraintsmsEJaDk() {
        return this.constraints;
    }

    public final Density getDensity() {
        return this.density;
    }

    public final FontFamily.Resolver getFontFamilyResolver() {
        return this.fontFamilyResolver;
    }

    public final LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }

    public final int getMaxLines() {
        return this.maxLines;
    }

    /* renamed from: getOverflow-gIe3tQ8, reason: not valid java name */
    public final int m26331getOverflowgIe3tQ8() {
        return this.overflow;
    }

    public final List<AnnotatedString.Range<Placeholder>> getPlaceholders() {
        return this.placeholders;
    }

    public final Font.ResourceLoader getResourceLoader() {
        Font.ResourceLoader resourceLoader = this._developerSuppliedResourceLoader;
        return resourceLoader == null ? DeprecatedBridgeFontResourceLoader.Companion.from(this.fontFamilyResolver) : resourceLoader;
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

    public int hashCode() {
        return (((((((((((((((((this.text.hashCode() * 31) + this.style.hashCode()) * 31) + this.placeholders.hashCode()) * 31) + this.maxLines) * 31) + Boolean.hashCode(this.softWrap)) * 31) + TextOverflow.m26826hashCodeimpl(this.overflow)) * 31) + this.density.hashCode()) * 31) + this.layoutDirection.hashCode()) * 31) + this.fontFamilyResolver.hashCode()) * 31) + Constraints.m26855hashCodeimpl(this.constraints);
    }

    public String toString() {
        return "TextLayoutInput(text=" + ((Object) this.text) + ", style=" + this.style + ", placeholders=" + this.placeholders + ", maxLines=" + this.maxLines + ", softWrap=" + this.softWrap + ", overflow=" + ((Object) TextOverflow.m26827toStringimpl(this.overflow)) + ", density=" + this.density + ", layoutDirection=" + this.layoutDirection + ", fontFamilyResolver=" + this.fontFamilyResolver + ", constraints=" + ((Object) Constraints.m26857toStringimpl(this.constraints)) + ')';
    }

    public /* synthetic */ TextLayoutInput(AnnotatedString annotatedString, TextStyle textStyle, List list, int i10, boolean z10, int i11, Density density, LayoutDirection layoutDirection, FontFamily.Resolver resolver, long j10, AbstractC9126n abstractC9126n) {
        this(annotatedString, textStyle, (List<AnnotatedString.Range<Placeholder>>) list, i10, z10, i11, density, layoutDirection, resolver, j10);
    }

    private TextLayoutInput(AnnotatedString annotatedString, TextStyle textStyle, List<AnnotatedString.Range<Placeholder>> list, int i10, boolean z10, int i11, Density density, LayoutDirection layoutDirection, Font.ResourceLoader resourceLoader, FontFamily.Resolver resolver, long j10) {
        this.text = annotatedString;
        this.style = textStyle;
        this.placeholders = list;
        this.maxLines = i10;
        this.softWrap = z10;
        this.overflow = i11;
        this.density = density;
        this.layoutDirection = layoutDirection;
        this.fontFamilyResolver = resolver;
        this.constraints = j10;
        this._developerSuppliedResourceLoader = resourceLoader;
    }

    private TextLayoutInput(AnnotatedString annotatedString, TextStyle textStyle, List<AnnotatedString.Range<Placeholder>> list, int i10, boolean z10, int i11, Density density, LayoutDirection layoutDirection, Font.ResourceLoader resourceLoader, long j10) {
        this(annotatedString, textStyle, list, i10, z10, i11, density, layoutDirection, resourceLoader, DelegatingFontLoaderForDeprecatedUsage_androidKt.createFontFamilyResolver(resourceLoader), j10);
    }

    private TextLayoutInput(AnnotatedString annotatedString, TextStyle textStyle, List<AnnotatedString.Range<Placeholder>> list, int i10, boolean z10, int i11, Density density, LayoutDirection layoutDirection, FontFamily.Resolver resolver, long j10) {
        this(annotatedString, textStyle, list, i10, z10, i11, density, layoutDirection, (Font.ResourceLoader) null, resolver, j10);
    }
}
