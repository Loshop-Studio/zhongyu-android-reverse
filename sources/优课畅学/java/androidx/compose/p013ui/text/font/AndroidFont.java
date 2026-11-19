package androidx.compose.p013ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.p013ui.text.font.FontVariation;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9126n;
import p123h7.InterfaceC8721a;
import p179m7.InterfaceC9324c;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public abstract class AndroidFont implements Font {
    public static final int $stable = 0;
    private final int loadingStrategy;
    private final TypefaceLoader typefaceLoader;
    private final FontVariation.Settings variationSettings;

    public interface TypefaceLoader {
        Object awaitLoad(Context context, AndroidFont androidFont, InterfaceC9324c<? super Typeface> interfaceC9324c);

        Typeface loadBlocking(Context context, AndroidFont androidFont);
    }

    public /* synthetic */ AndroidFont(int i10, TypefaceLoader typefaceLoader, FontVariation.Settings settings, AbstractC9126n abstractC9126n) {
        this(i10, typefaceLoader, settings);
    }

    @Override // androidx.compose.p013ui.text.font.Font
    /* renamed from: getLoadingStrategy-PKNRLFQ, reason: not valid java name */
    public final int mo26420getLoadingStrategyPKNRLFQ() {
        return this.loadingStrategy;
    }

    public final TypefaceLoader getTypefaceLoader() {
        return this.typefaceLoader;
    }

    public final FontVariation.Settings getVariationSettings() {
        return this.variationSettings;
    }

    @InterfaceC8721a
    public /* synthetic */ AndroidFont(int i10, TypefaceLoader typefaceLoader, AbstractC9126n abstractC9126n) {
        this(i10, typefaceLoader);
    }

    private AndroidFont(int i10, TypefaceLoader typefaceLoader, FontVariation.Settings settings) {
        this.loadingStrategy = i10;
        this.typefaceLoader = typefaceLoader;
        this.variationSettings = settings;
    }

    private AndroidFont(int i10, TypefaceLoader typefaceLoader) {
        this(i10, typefaceLoader, new FontVariation.Settings(new FontVariation.Setting[0]), null);
    }
}
