package androidx.compose.p014ui.text.font;

import androidx.compose.p014ui.text.ExperimentalTextApi;
import androidx.compose.p014ui.text.font.FontVariation;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class ResourceFont implements Font {
    public static final int $stable = 0;
    private final int loadingStrategy;
    private final int resId;
    private final int style;
    private final FontVariation.Settings variationSettings;
    private final FontWeight weight;

    public /* synthetic */ ResourceFont(int i10, FontWeight fontWeight, int i11, @ExperimentalTextApi FontVariation.Settings settings, int i12, AbstractC9972n abstractC9972n) {
        this(i10, fontWeight, i11, settings, i12);
    }

    /* renamed from: copy-F3nL8kk$default, reason: not valid java name */
    public static /* synthetic */ ResourceFont m33113copyF3nL8kk$default(ResourceFont resourceFont, int i10, FontWeight fontWeight, int i11, int i12, FontVariation.Settings settings, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i10 = resourceFont.resId;
        }
        if ((i13 & 2) != 0) {
            fontWeight = resourceFont.getWeight();
        }
        if ((i13 & 4) != 0) {
            i11 = resourceFont.mo33030getStyle_LCdwA();
        }
        if ((i13 & 8) != 0) {
            i12 = resourceFont.mo33022getLoadingStrategyPKNRLFQ();
        }
        if ((i13 & 16) != 0) {
            settings = resourceFont.variationSettings;
        }
        FontVariation.Settings settings2 = settings;
        int i14 = i11;
        return resourceFont.m33116copyF3nL8kk(i10, fontWeight, i14, i12, settings2);
    }

    /* renamed from: copy-RetOiIg$default, reason: not valid java name */
    public static /* synthetic */ ResourceFont m33114copyRetOiIg$default(ResourceFont resourceFont, int i10, FontWeight fontWeight, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = resourceFont.resId;
        }
        if ((i12 & 2) != 0) {
            fontWeight = resourceFont.getWeight();
        }
        if ((i12 & 4) != 0) {
            i11 = resourceFont.mo33030getStyle_LCdwA();
        }
        return resourceFont.m33117copyRetOiIg(i10, fontWeight, i11);
    }

    @ExperimentalTextApi
    /* renamed from: getLoadingStrategy-PKNRLFQ$annotations, reason: not valid java name */
    public static /* synthetic */ void m33115getLoadingStrategyPKNRLFQ$annotations() {
    }

    @ExperimentalTextApi
    /* renamed from: copy-F3nL8kk, reason: not valid java name */
    public final ResourceFont m33116copyF3nL8kk(int i10, FontWeight fontWeight, int i11, int i12, FontVariation.Settings settings) {
        return new ResourceFont(i10, fontWeight, i11, settings, i12, null);
    }

    /* renamed from: copy-RetOiIg, reason: not valid java name */
    public final ResourceFont m33117copyRetOiIg(int i10, FontWeight fontWeight, int i11) {
        return m33113copyF3nL8kk$default(this, i10, fontWeight, i11, mo33022getLoadingStrategyPKNRLFQ(), null, 16, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResourceFont)) {
            return false;
        }
        ResourceFont resourceFont = (ResourceFont) obj;
        return this.resId == resourceFont.resId && AbstractC9979u.m20289b(getWeight(), resourceFont.getWeight()) && FontStyle.m33077equalsimpl0(mo33030getStyle_LCdwA(), resourceFont.mo33030getStyle_LCdwA()) && AbstractC9979u.m20289b(this.variationSettings, resourceFont.variationSettings) && FontLoadingStrategy.m33064equalsimpl0(mo33022getLoadingStrategyPKNRLFQ(), resourceFont.mo33022getLoadingStrategyPKNRLFQ());
    }

    @Override // androidx.compose.p014ui.text.font.Font
    @ExperimentalTextApi
    /* renamed from: getLoadingStrategy-PKNRLFQ */
    public int mo33022getLoadingStrategyPKNRLFQ() {
        return this.loadingStrategy;
    }

    public final int getResId() {
        return this.resId;
    }

    @Override // androidx.compose.p014ui.text.font.Font
    /* renamed from: getStyle-_-LCdwA */
    public int mo33030getStyle_LCdwA() {
        return this.style;
    }

    @ExperimentalTextApi
    public final FontVariation.Settings getVariationSettings() {
        return this.variationSettings;
    }

    @Override // androidx.compose.p014ui.text.font.Font
    public FontWeight getWeight() {
        return this.weight;
    }

    public int hashCode() {
        return (((((((this.resId * 31) + getWeight().hashCode()) * 31) + FontStyle.m33078hashCodeimpl(mo33030getStyle_LCdwA())) * 31) + FontLoadingStrategy.m33065hashCodeimpl(mo33022getLoadingStrategyPKNRLFQ())) * 31) + this.variationSettings.hashCode();
    }

    public String toString() {
        return "ResourceFont(resId=" + this.resId + ", weight=" + getWeight() + ", style=" + ((Object) FontStyle.m33079toStringimpl(mo33030getStyle_LCdwA())) + ", loadingStrategy=" + ((Object) FontLoadingStrategy.m33066toStringimpl(mo33022getLoadingStrategyPKNRLFQ())) + ')';
    }

    private ResourceFont(int i10, FontWeight fontWeight, int i11, FontVariation.Settings settings, int i12) {
        this.resId = i10;
        this.weight = fontWeight;
        this.style = i11;
        this.variationSettings = settings;
        this.loadingStrategy = i12;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ResourceFont(int i10, FontWeight fontWeight, int i11, FontVariation.Settings settings, int i12, int i13, AbstractC9972n abstractC9972n) {
        FontWeight normal = (i13 & 2) != 0 ? FontWeight.Companion.getNormal() : fontWeight;
        int iM33084getNormal_LCdwA = (i13 & 4) != 0 ? FontStyle.Companion.m33084getNormal_LCdwA() : i11;
        this(i10, normal, iM33084getNormal_LCdwA, (i13 & 8) != 0 ? FontVariation.INSTANCE.m33099Settings6EWAqTQ(normal, iM33084getNormal_LCdwA, new FontVariation.Setting[0]) : settings, (i13 & 16) != 0 ? FontLoadingStrategy.Companion.m33068getAsyncPKNRLFQ() : i12, null);
    }
}
