package androidx.compose.p014ui.text.font;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class TypefaceRequest {
    public static final int $stable = 8;
    private final FontFamily fontFamily;
    private final int fontStyle;
    private final int fontSynthesis;
    private final FontWeight fontWeight;
    private final Object resourceLoaderCacheKey;

    public /* synthetic */ TypefaceRequest(FontFamily fontFamily, FontWeight fontWeight, int i10, int i11, Object obj, AbstractC9972n abstractC9972n) {
        this(fontFamily, fontWeight, i10, i11, obj);
    }

    /* renamed from: copy-e1PVR60$default, reason: not valid java name */
    public static /* synthetic */ TypefaceRequest m33118copye1PVR60$default(TypefaceRequest typefaceRequest, FontFamily fontFamily, FontWeight fontWeight, int i10, int i11, Object obj, int i12, Object obj2) {
        if ((i12 & 1) != 0) {
            fontFamily = typefaceRequest.fontFamily;
        }
        if ((i12 & 2) != 0) {
            fontWeight = typefaceRequest.fontWeight;
        }
        if ((i12 & 4) != 0) {
            i10 = typefaceRequest.fontStyle;
        }
        if ((i12 & 8) != 0) {
            i11 = typefaceRequest.fontSynthesis;
        }
        if ((i12 & 16) != 0) {
            obj = typefaceRequest.resourceLoaderCacheKey;
        }
        Object obj3 = obj;
        int i13 = i10;
        return typefaceRequest.m33121copye1PVR60(fontFamily, fontWeight, i13, i11, obj3);
    }

    public final FontFamily component1() {
        return this.fontFamily;
    }

    public final FontWeight component2() {
        return this.fontWeight;
    }

    /* renamed from: component3-_-LCdwA, reason: not valid java name */
    public final int m33119component3_LCdwA() {
        return this.fontStyle;
    }

    /* renamed from: component4-GVVA2EU, reason: not valid java name */
    public final int m33120component4GVVA2EU() {
        return this.fontSynthesis;
    }

    public final Object component5() {
        return this.resourceLoaderCacheKey;
    }

    /* renamed from: copy-e1PVR60, reason: not valid java name */
    public final TypefaceRequest m33121copye1PVR60(FontFamily fontFamily, FontWeight fontWeight, int i10, int i11, Object obj) {
        return new TypefaceRequest(fontFamily, fontWeight, i10, i11, obj, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TypefaceRequest)) {
            return false;
        }
        TypefaceRequest typefaceRequest = (TypefaceRequest) obj;
        return AbstractC9979u.m20289b(this.fontFamily, typefaceRequest.fontFamily) && AbstractC9979u.m20289b(this.fontWeight, typefaceRequest.fontWeight) && FontStyle.m33077equalsimpl0(this.fontStyle, typefaceRequest.fontStyle) && FontSynthesis.m33088equalsimpl0(this.fontSynthesis, typefaceRequest.fontSynthesis) && AbstractC9979u.m20289b(this.resourceLoaderCacheKey, typefaceRequest.resourceLoaderCacheKey);
    }

    public final FontFamily getFontFamily() {
        return this.fontFamily;
    }

    /* renamed from: getFontStyle-_-LCdwA, reason: not valid java name */
    public final int m33122getFontStyle_LCdwA() {
        return this.fontStyle;
    }

    /* renamed from: getFontSynthesis-GVVA2EU, reason: not valid java name */
    public final int m33123getFontSynthesisGVVA2EU() {
        return this.fontSynthesis;
    }

    public final FontWeight getFontWeight() {
        return this.fontWeight;
    }

    public final Object getResourceLoaderCacheKey() {
        return this.resourceLoaderCacheKey;
    }

    public int hashCode() {
        FontFamily fontFamily = this.fontFamily;
        int iHashCode = (((((((fontFamily == null ? 0 : fontFamily.hashCode()) * 31) + this.fontWeight.hashCode()) * 31) + FontStyle.m33078hashCodeimpl(this.fontStyle)) * 31) + FontSynthesis.m33089hashCodeimpl(this.fontSynthesis)) * 31;
        Object obj = this.resourceLoaderCacheKey;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    public String toString() {
        return "TypefaceRequest(fontFamily=" + this.fontFamily + ", fontWeight=" + this.fontWeight + ", fontStyle=" + ((Object) FontStyle.m33079toStringimpl(this.fontStyle)) + ", fontSynthesis=" + ((Object) FontSynthesis.m33092toStringimpl(this.fontSynthesis)) + ", resourceLoaderCacheKey=" + this.resourceLoaderCacheKey + ')';
    }

    private TypefaceRequest(FontFamily fontFamily, FontWeight fontWeight, int i10, int i11, Object obj) {
        this.fontFamily = fontFamily;
        this.fontWeight = fontWeight;
        this.fontStyle = i10;
        this.fontSynthesis = i11;
        this.resourceLoaderCacheKey = obj;
    }
}
