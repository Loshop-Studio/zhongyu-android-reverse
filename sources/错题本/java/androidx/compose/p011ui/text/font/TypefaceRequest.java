package androidx.compose.p011ui.text.font;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0013\u001a\u00020\u0006HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0015\u001a\u00020\bHÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0012J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017JI\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0001HÆ\u0001ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0012J\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0010R\u001d\u0010\u0007\u001a\u00020\u00068\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010\u0012R\u001d\u0010\t\u001a\u00020\b8\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b*\u0010\u0012R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b,\u0010\u0017\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006-"}, m5110d2 = {"Landroidx/compose/ui/text/font/TypefaceRequest;", "", "Landroidx/compose/ui/text/font/FontFamily;", "fontFamily", "Landroidx/compose/ui/text/font/FontWeight;", "fontWeight", "Landroidx/compose/ui/text/font/FontStyle;", "fontStyle", "Landroidx/compose/ui/text/font/FontSynthesis;", "fontSynthesis", "resourceLoaderCacheKey", "<init>", "(Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/font/FontWeight;IILjava/lang/Object;Lkotlin/jvm/internal/e;)V", "component1", "()Landroidx/compose/ui/text/font/FontFamily;", "component2", "()Landroidx/compose/ui/text/font/FontWeight;", "component3-_-LCdwA", "()I", "component3", "component4-GVVA2EU", "component4", "component5", "()Ljava/lang/Object;", "copy-e1PVR60", "(Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/font/FontWeight;IILjava/lang/Object;)Landroidx/compose/ui/text/font/TypefaceRequest;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/ui/text/font/FontFamily;", "getFontFamily", "Landroidx/compose/ui/text/font/FontWeight;", "getFontWeight", "I", "getFontStyle-_-LCdwA", "getFontSynthesis-GVVA2EU", "Ljava/lang/Object;", "getResourceLoaderCacheKey", "ui-text_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final /* data */ class TypefaceRequest {
    public static final int $stable = 8;

    @Nullable
    private final FontFamily fontFamily;
    private final int fontStyle;
    private final int fontSynthesis;

    @NotNull
    private final FontWeight fontWeight;

    @Nullable
    private final Object resourceLoaderCacheKey;

    public /* synthetic */ TypefaceRequest(FontFamily fontFamily, FontWeight fontWeight, int i, int i8, Object obj, AbstractC5824e abstractC5824e) {
        this(fontFamily, fontWeight, i, i8, obj);
    }

    /* renamed from: copy-e1PVR60$default, reason: not valid java name */
    public static /* synthetic */ TypefaceRequest m12922copye1PVR60$default(TypefaceRequest typefaceRequest, FontFamily fontFamily, FontWeight fontWeight, int i, int i8, Object obj, int i9, Object obj2) {
        if ((i9 & 1) != 0) {
            fontFamily = typefaceRequest.fontFamily;
        }
        if ((i9 & 2) != 0) {
            fontWeight = typefaceRequest.fontWeight;
        }
        if ((i9 & 4) != 0) {
            i = typefaceRequest.fontStyle;
        }
        if ((i9 & 8) != 0) {
            i8 = typefaceRequest.fontSynthesis;
        }
        if ((i9 & 16) != 0) {
            obj = typefaceRequest.resourceLoaderCacheKey;
        }
        Object obj3 = obj;
        int i10 = i;
        return typefaceRequest.m12925copye1PVR60(fontFamily, fontWeight, i10, i8, obj3);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final FontFamily getFontFamily() {
        return this.fontFamily;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final FontWeight getFontWeight() {
        return this.fontWeight;
    }

    /* renamed from: component3-_-LCdwA, reason: not valid java name and from getter */
    public final int getFontStyle() {
        return this.fontStyle;
    }

    /* renamed from: component4-GVVA2EU, reason: not valid java name and from getter */
    public final int getFontSynthesis() {
        return this.fontSynthesis;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Object getResourceLoaderCacheKey() {
        return this.resourceLoaderCacheKey;
    }

    @NotNull
    /* renamed from: copy-e1PVR60, reason: not valid java name */
    public final TypefaceRequest m12925copye1PVR60(@Nullable FontFamily fontFamily, @NotNull FontWeight fontWeight, int fontStyle, int fontSynthesis, @Nullable Object resourceLoaderCacheKey) {
        return new TypefaceRequest(fontFamily, fontWeight, fontStyle, fontSynthesis, resourceLoaderCacheKey, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TypefaceRequest)) {
            return false;
        }
        TypefaceRequest typefaceRequest = (TypefaceRequest) other;
        return AbstractC5830k.m5325b(this.fontFamily, typefaceRequest.fontFamily) && AbstractC5830k.m5325b(this.fontWeight, typefaceRequest.fontWeight) && FontStyle.m12881equalsimpl0(this.fontStyle, typefaceRequest.fontStyle) && FontSynthesis.m12892equalsimpl0(this.fontSynthesis, typefaceRequest.fontSynthesis) && AbstractC5830k.m5325b(this.resourceLoaderCacheKey, typefaceRequest.resourceLoaderCacheKey);
    }

    @Nullable
    public final FontFamily getFontFamily() {
        return this.fontFamily;
    }

    /* renamed from: getFontStyle-_-LCdwA, reason: not valid java name */
    public final int m12926getFontStyle_LCdwA() {
        return this.fontStyle;
    }

    /* renamed from: getFontSynthesis-GVVA2EU, reason: not valid java name */
    public final int m12927getFontSynthesisGVVA2EU() {
        return this.fontSynthesis;
    }

    @NotNull
    public final FontWeight getFontWeight() {
        return this.fontWeight;
    }

    @Nullable
    public final Object getResourceLoaderCacheKey() {
        return this.resourceLoaderCacheKey;
    }

    public int hashCode() {
        FontFamily fontFamily = this.fontFamily;
        int iM12893hashCodeimpl = (FontSynthesis.m12893hashCodeimpl(this.fontSynthesis) + ((FontStyle.m12882hashCodeimpl(this.fontStyle) + ((this.fontWeight.hashCode() + ((fontFamily == null ? 0 : fontFamily.hashCode()) * 31)) * 31)) * 31)) * 31;
        Object obj = this.resourceLoaderCacheKey;
        return iM12893hashCodeimpl + (obj != null ? obj.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "TypefaceRequest(fontFamily=" + this.fontFamily + ", fontWeight=" + this.fontWeight + ", fontStyle=" + ((Object) FontStyle.m12883toStringimpl(this.fontStyle)) + ", fontSynthesis=" + ((Object) FontSynthesis.m12896toStringimpl(this.fontSynthesis)) + ", resourceLoaderCacheKey=" + this.resourceLoaderCacheKey + ')';
    }

    private TypefaceRequest(FontFamily fontFamily, FontWeight fontWeight, int i, int i8, Object obj) {
        this.fontFamily = fontFamily;
        this.fontWeight = fontWeight;
        this.fontStyle = i;
        this.fontSynthesis = i8;
        this.resourceLoaderCacheKey = obj;
    }
}
