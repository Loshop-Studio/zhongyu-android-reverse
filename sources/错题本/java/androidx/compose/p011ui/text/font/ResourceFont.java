package androidx.compose.p011ui.text.font;

import androidx.compose.p011ui.text.ExperimentalTextApi;
import androidx.compose.p011ui.text.font.FontVariation;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(m5109d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B9\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0003\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJD\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\t\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010!R \u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\"\u0010\u0019R\u0017\u0010\t\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010%R&\u0010\u000b\u001a\u00020\n8WX\u0097\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u000b\u0010\u001d\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u0019\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006)"}, m5110d2 = {"Landroidx/compose/ui/text/font/ResourceFont;", "Landroidx/compose/ui/text/font/Font;", "", "resId", "Landroidx/compose/ui/text/font/FontWeight;", "weight", "Landroidx/compose/ui/text/font/FontStyle;", "style", "Landroidx/compose/ui/text/font/FontVariation$Settings;", "variationSettings", "Landroidx/compose/ui/text/font/FontLoadingStrategy;", "loadingStrategy", "<init>", "(ILandroidx/compose/ui/text/font/FontWeight;ILandroidx/compose/ui/text/font/FontVariation$Settings;ILkotlin/jvm/internal/e;)V", "copy-RetOiIg", "(ILandroidx/compose/ui/text/font/FontWeight;I)Landroidx/compose/ui/text/font/ResourceFont;", "copy", "copy-F3nL8kk", "(ILandroidx/compose/ui/text/font/FontWeight;IILandroidx/compose/ui/text/font/FontVariation$Settings;)Landroidx/compose/ui/text/font/ResourceFont;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "I", "getResId", "Landroidx/compose/ui/text/font/FontWeight;", "getWeight", "()Landroidx/compose/ui/text/font/FontWeight;", "getStyle-_-LCdwA", "Landroidx/compose/ui/text/font/FontVariation$Settings;", "getVariationSettings", "()Landroidx/compose/ui/text/font/FontVariation$Settings;", "getLoadingStrategy-PKNRLFQ", "getLoadingStrategy-PKNRLFQ$annotations", "()V", "ui-text_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class ResourceFont implements Font {
    public static final int $stable = 0;
    private final int loadingStrategy;
    private final int resId;
    private final int style;

    @NotNull
    private final FontVariation.Settings variationSettings;

    @NotNull
    private final FontWeight weight;

    public /* synthetic */ ResourceFont(int i, FontWeight fontWeight, int i8, @ExperimentalTextApi FontVariation.Settings settings, int i9, AbstractC5824e abstractC5824e) {
        this(i, fontWeight, i8, settings, i9);
    }

    /* renamed from: copy-F3nL8kk$default, reason: not valid java name */
    public static /* synthetic */ ResourceFont m12917copyF3nL8kk$default(ResourceFont resourceFont, int i, FontWeight fontWeight, int i8, int i9, FontVariation.Settings settings, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i = resourceFont.resId;
        }
        if ((i10 & 2) != 0) {
            fontWeight = resourceFont.getWeight();
        }
        if ((i10 & 4) != 0) {
            i8 = resourceFont.getStyle();
        }
        if ((i10 & 8) != 0) {
            i9 = resourceFont.getLoadingStrategy();
        }
        if ((i10 & 16) != 0) {
            settings = resourceFont.variationSettings;
        }
        FontVariation.Settings settings2 = settings;
        int i11 = i8;
        return resourceFont.m12920copyF3nL8kk(i, fontWeight, i11, i9, settings2);
    }

    /* renamed from: copy-RetOiIg$default, reason: not valid java name */
    public static /* synthetic */ ResourceFont m12918copyRetOiIg$default(ResourceFont resourceFont, int i, FontWeight fontWeight, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i = resourceFont.resId;
        }
        if ((i9 & 2) != 0) {
            fontWeight = resourceFont.getWeight();
        }
        if ((i9 & 4) != 0) {
            i8 = resourceFont.getStyle();
        }
        return resourceFont.m12921copyRetOiIg(i, fontWeight, i8);
    }

    @ExperimentalTextApi
    /* renamed from: getLoadingStrategy-PKNRLFQ$annotations, reason: not valid java name */
    public static /* synthetic */ void m12919getLoadingStrategyPKNRLFQ$annotations() {
    }

    @ExperimentalTextApi
    @NotNull
    /* renamed from: copy-F3nL8kk, reason: not valid java name */
    public final ResourceFont m12920copyF3nL8kk(int resId, @NotNull FontWeight weight, int style, int loadingStrategy, @NotNull FontVariation.Settings variationSettings) {
        return new ResourceFont(resId, weight, style, variationSettings, loadingStrategy, null);
    }

    @NotNull
    /* renamed from: copy-RetOiIg, reason: not valid java name */
    public final ResourceFont m12921copyRetOiIg(int resId, @NotNull FontWeight weight, int style) {
        return m12917copyF3nL8kk$default(this, resId, weight, style, getLoadingStrategy(), null, 16, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResourceFont)) {
            return false;
        }
        ResourceFont resourceFont = (ResourceFont) other;
        return this.resId == resourceFont.resId && AbstractC5830k.m5325b(getWeight(), resourceFont.getWeight()) && FontStyle.m12881equalsimpl0(getStyle(), resourceFont.getStyle()) && AbstractC5830k.m5325b(this.variationSettings, resourceFont.variationSettings) && FontLoadingStrategy.m12868equalsimpl0(getLoadingStrategy(), resourceFont.getLoadingStrategy());
    }

    @Override // androidx.compose.p011ui.text.font.Font
    @ExperimentalTextApi
    /* renamed from: getLoadingStrategy-PKNRLFQ, reason: from getter */
    public int getLoadingStrategy() {
        return this.loadingStrategy;
    }

    public final int getResId() {
        return this.resId;
    }

    @Override // androidx.compose.p011ui.text.font.Font
    /* renamed from: getStyle-_-LCdwA, reason: from getter */
    public int getStyle() {
        return this.style;
    }

    @ExperimentalTextApi
    @NotNull
    public final FontVariation.Settings getVariationSettings() {
        return this.variationSettings;
    }

    @Override // androidx.compose.p011ui.text.font.Font
    @NotNull
    public FontWeight getWeight() {
        return this.weight;
    }

    public int hashCode() {
        return this.variationSettings.hashCode() + ((FontLoadingStrategy.m12869hashCodeimpl(getLoadingStrategy()) + ((FontStyle.m12882hashCodeimpl(getStyle()) + ((getWeight().hashCode() + (this.resId * 31)) * 31)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "ResourceFont(resId=" + this.resId + ", weight=" + getWeight() + ", style=" + ((Object) FontStyle.m12883toStringimpl(getStyle())) + ", loadingStrategy=" + ((Object) FontLoadingStrategy.m12870toStringimpl(getLoadingStrategy())) + ')';
    }

    private ResourceFont(int i, FontWeight fontWeight, int i8, FontVariation.Settings settings, int i9) {
        this.resId = i;
        this.weight = fontWeight;
        this.style = i8;
        this.variationSettings = settings;
        this.loadingStrategy = i9;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ResourceFont(int i, FontWeight fontWeight, int i8, FontVariation.Settings settings, int i9, int i10, AbstractC5824e abstractC5824e) {
        FontWeight normal = (i10 & 2) != 0 ? FontWeight.INSTANCE.getNormal() : fontWeight;
        int iM12888getNormal_LCdwA = (i10 & 4) != 0 ? FontStyle.INSTANCE.m12888getNormal_LCdwA() : i8;
        this(i, normal, iM12888getNormal_LCdwA, (i10 & 8) != 0 ? FontVariation.INSTANCE.m12903Settings6EWAqTQ(normal, iM12888getNormal_LCdwA, new FontVariation.Setting[0]) : settings, (i10 & 16) != 0 ? FontLoadingStrategy.INSTANCE.m12872getAsyncPKNRLFQ() : i9, null);
    }
}
