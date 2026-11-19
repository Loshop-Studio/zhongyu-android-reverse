package androidx.compose.p013ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.p013ui.text.font.FontVariation;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9126n;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public abstract class AndroidPreloadedFont extends AndroidFont {
    public static final int $stable = 0;
    private boolean didInitWithContext;
    private final int style;
    private Typeface typeface;
    private final FontWeight weight;

    public /* synthetic */ AndroidPreloadedFont(FontWeight fontWeight, int i10, FontVariation.Settings settings, AbstractC9126n abstractC9126n) {
        this(fontWeight, i10, settings);
    }

    public abstract Typeface doLoad$ui_text_release(Context context);

    public abstract String getCacheKey();

    @Override // androidx.compose.p013ui.text.font.Font
    /* renamed from: getStyle-_-LCdwA, reason: not valid java name */
    public final int mo26428getStyle_LCdwA() {
        return this.style;
    }

    public final Typeface getTypeface$ui_text_release() {
        return this.typeface;
    }

    @Override // androidx.compose.p013ui.text.font.Font
    public final FontWeight getWeight() {
        return this.weight;
    }

    public final Typeface loadCached$ui_text_release(Context context) {
        if (!this.didInitWithContext && this.typeface == null) {
            this.typeface = doLoad$ui_text_release(context);
        }
        this.didInitWithContext = true;
        return this.typeface;
    }

    public final void setTypeface$ui_text_release(Typeface typeface) {
        this.typeface = typeface;
    }

    private AndroidPreloadedFont(FontWeight fontWeight, int i10, FontVariation.Settings settings) {
        super(FontLoadingStrategy.Companion.m26467getBlockingPKNRLFQ(), AndroidPreloadedFontTypefaceLoader.INSTANCE, settings, null);
        this.weight = fontWeight;
        this.style = i10;
    }
}
