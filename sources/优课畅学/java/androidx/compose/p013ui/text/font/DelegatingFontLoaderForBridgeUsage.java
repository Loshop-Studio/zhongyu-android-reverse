package androidx.compose.p013ui.text.font;

import android.content.Context;
import androidx.compose.p013ui.text.font.Font;
import androidx.compose.runtime.internal.StabilityInferred;
import p179m7.InterfaceC9324c;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class DelegatingFontLoaderForBridgeUsage implements PlatformFontLoader {
    public static final int $stable = 8;
    private final Object cacheKey = new Object();
    private final Context context;
    private final Font.ResourceLoader loader;

    public DelegatingFontLoaderForBridgeUsage(Font.ResourceLoader resourceLoader, Context context) {
        this.loader = resourceLoader;
        this.context = context;
    }

    @Override // androidx.compose.p013ui.text.font.PlatformFontLoader
    public Object awaitLoad(Font font, InterfaceC9324c<Object> interfaceC9324c) {
        if (!(font instanceof AndroidFont)) {
            return this.loader.load(font);
        }
        AndroidFont androidFont = (AndroidFont) font;
        return androidFont.getTypefaceLoader().awaitLoad(this.context, androidFont, interfaceC9324c);
    }

    @Override // androidx.compose.p013ui.text.font.PlatformFontLoader
    public Object getCacheKey() {
        return this.cacheKey;
    }

    public final Font.ResourceLoader getLoader$ui_text_release() {
        return this.loader;
    }

    @Override // androidx.compose.p013ui.text.font.PlatformFontLoader
    public Object loadBlocking(Font font) {
        if (!(font instanceof AndroidFont)) {
            return this.loader.load(font);
        }
        AndroidFont androidFont = (AndroidFont) font;
        return androidFont.getTypefaceLoader().loadBlocking(this.context, androidFont);
    }
}
