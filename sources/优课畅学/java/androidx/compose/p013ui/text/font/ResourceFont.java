package androidx.compose.p013ui.text.font;

import androidx.compose.p013ui.text.ExperimentalTextApi;
import androidx.compose.p013ui.text.font.FontVariation;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class ResourceFont implements Font {
    public static final int $stable = 0;
    private final int loadingStrategy;
    private final int resId;
    private final int style;
    private final FontVariation.Settings variationSettings;
    private final FontWeight weight;

    public /* synthetic */ ResourceFont(int i10, FontWeight fontWeight, int i11, @ExperimentalTextApi FontVariation.Settings settings, int i12, AbstractC9126n abstractC9126n) {
        this(i10, fontWeight, i11, settings, i12);
    }

    /* renamed from: copy-F3nL8kk$default, reason: not valid java name */
    public static /* synthetic */ ResourceFont m26511copyF3nL8kk$default(ResourceFont resourceFont, int i10, FontWeight fontWeight, int i11, int i12, FontVariation.Settings settings, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i10 = resourceFont.resId;
        }
        if ((i13 & 2) != 0) {
            fontWeight = resourceFont.getWeight();
        }
        if ((i13 & 4) != 0) {
            i11 = resourceFont.mo26428getStyle_LCdwA();
        }
        if ((i13 & 8) != 0) {
            i12 = resourceFont.mo26420getLoadingStrategyPKNRLFQ();
        }
        if ((i13 & 16) != 0) {
            settings = resourceFont.variationSettings;
        }
        FontVariation.Settings settings2 = settings;
        int i14 = i11;
        return resourceFont.m26514copyF3nL8kk(i10, fontWeight, i14, i12, settings2);
    }

    /* renamed from: copy-RetOiIg$default, reason: not valid java name */
    public static /* synthetic */ ResourceFont m26512copyRetOiIg$default(ResourceFont resourceFont, int i10, FontWeight fontWeight, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = resourceFont.resId;
        }
        if ((i12 & 2) != 0) {
            fontWeight = resourceFont.getWeight();
        }
        if ((i12 & 4) != 0) {
            i11 = resourceFont.mo26428getStyle_LCdwA();
        }
        return resourceFont.m26515copyRetOiIg(i10, fontWeight, i11);
    }

    @ExperimentalTextApi
    /* renamed from: getLoadingStrategy-PKNRLFQ$annotations, reason: not valid java name */
    public static /* synthetic */ void m26513getLoadingStrategyPKNRLFQ$annotations() {
    }

    @ExperimentalTextApi
    /* renamed from: copy-F3nL8kk, reason: not valid java name */
    public final ResourceFont m26514copyF3nL8kk(int i10, FontWeight fontWeight, int i11, int i12, FontVariation.Settings settings) {
        return new ResourceFont(i10, fontWeight, i11, settings, i12, null);
    }

    /* renamed from: copy-RetOiIg, reason: not valid java name */
    public final ResourceFont m26515copyRetOiIg(int i10, FontWeight fontWeight, int i11) {
        return m26511copyF3nL8kk$default(this, i10, fontWeight, i11, mo26420getLoadingStrategyPKNRLFQ(), null, 16, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResourceFont)) {
            return false;
        }
        ResourceFont resourceFont = (ResourceFont) obj;
        return this.resId == resourceFont.resId && AbstractC9133u.m16128b(getWeight(), resourceFont.getWeight()) && FontStyle.m26475equalsimpl0(mo26428getStyle_LCdwA(), resourceFont.mo26428getStyle_LCdwA()) && AbstractC9133u.m16128b(this.variationSettings, resourceFont.variationSettings) && FontLoadingStrategy.m26462equalsimpl0(mo26420getLoadingStrategyPKNRLFQ(), resourceFont.mo26420getLoadingStrategyPKNRLFQ());
    }

    @Override // androidx.compose.p013ui.text.font.Font
    @ExperimentalTextApi
    /* renamed from: getLoadingStrategy-PKNRLFQ */
    public int mo26420getLoadingStrategyPKNRLFQ() {
        return this.loadingStrategy;
    }

    public final int getResId() {
        return this.resId;
    }

    @Override // androidx.compose.p013ui.text.font.Font
    /* renamed from: getStyle-_-LCdwA */
    public int mo26428getStyle_LCdwA() {
        return this.style;
    }

    @ExperimentalTextApi
    public final FontVariation.Settings getVariationSettings() {
        return this.variationSettings;
    }

    @Override // androidx.compose.p013ui.text.font.Font
    public FontWeight getWeight() {
        return this.weight;
    }

    public int hashCode() {
        return (((((((this.resId * 31) + getWeight().hashCode()) * 31) + FontStyle.m26476hashCodeimpl(mo26428getStyle_LCdwA())) * 31) + FontLoadingStrategy.m26463hashCodeimpl(mo26420getLoadingStrategyPKNRLFQ())) * 31) + this.variationSettings.hashCode();
    }

    public String toString() {
        return "ResourceFont(resId=" + this.resId + ", weight=" + getWeight() + ", style=" + ((Object) FontStyle.m26477toStringimpl(mo26428getStyle_LCdwA())) + ", loadingStrategy=" + ((Object) FontLoadingStrategy.m26464toStringimpl(mo26420getLoadingStrategyPKNRLFQ())) + ')';
    }

    private ResourceFont(int i10, FontWeight fontWeight, int i11, FontVariation.Settings settings, int i12) {
        this.resId = i10;
        this.weight = fontWeight;
        this.style = i11;
        this.variationSettings = settings;
        this.loadingStrategy = i12;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ResourceFont(int i10, FontWeight fontWeight, int i11, FontVariation.Settings settings, int i12, int i13, AbstractC9126n abstractC9126n) {
        FontWeight normal = (i13 & 2) != 0 ? FontWeight.Companion.getNormal() : fontWeight;
        int iM26482getNormal_LCdwA = (i13 & 4) != 0 ? FontStyle.Companion.m26482getNormal_LCdwA() : i11;
        this(i10, normal, iM26482getNormal_LCdwA, (i13 & 8) != 0 ? FontVariation.INSTANCE.m26497Settings6EWAqTQ(normal, iM26482getNormal_LCdwA, new FontVariation.Setting[0]) : settings, (i13 & 16) != 0 ? FontLoadingStrategy.Companion.m26466getAsyncPKNRLFQ() : i12, null);
    }
}
