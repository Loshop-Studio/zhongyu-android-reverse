package androidx.compose.p014ui.text.font;

import android.content.Context;
import androidx.compose.p014ui.text.font.Font;
import androidx.compose.runtime.internal.StabilityInferred;
import vc.InterfaceC11588c;

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

    @Override // androidx.compose.p014ui.text.font.PlatformFontLoader
    public Object awaitLoad(Font font, InterfaceC11588c<Object> interfaceC11588c) {
        if (!(font instanceof AndroidFont)) {
            return this.loader.load(font);
        }
        AndroidFont androidFont = (AndroidFont) font;
        return androidFont.getTypefaceLoader().awaitLoad(this.context, androidFont, interfaceC11588c);
    }

    @Override // androidx.compose.p014ui.text.font.PlatformFontLoader
    public Object getCacheKey() {
        return this.cacheKey;
    }

    public final Font.ResourceLoader getLoader$ui_text_release() {
        return this.loader;
    }

    @Override // androidx.compose.p014ui.text.font.PlatformFontLoader
    public Object loadBlocking(Font font) {
        if (!(font instanceof AndroidFont)) {
            return this.loader.load(font);
        }
        AndroidFont androidFont = (AndroidFont) font;
        return androidFont.getTypefaceLoader().loadBlocking(this.context, androidFont);
    }
}
