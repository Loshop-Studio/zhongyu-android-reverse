package androidx.compose.p014ui.text.font;

import androidx.compose.p014ui.text.font.Font;
import androidx.compose.runtime.internal.StabilityInferred;
import vc.InterfaceC11588c;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class DelegatingFontLoaderForDeprecatedUsage implements PlatformFontLoader {
    public static final int $stable = 8;
    private final Object cacheKey = new Object();
    private final Font.ResourceLoader loader;

    public DelegatingFontLoaderForDeprecatedUsage(Font.ResourceLoader resourceLoader) {
        this.loader = resourceLoader;
    }

    @Override // androidx.compose.p014ui.text.font.PlatformFontLoader
    public Object awaitLoad(Font font, InterfaceC11588c<Object> interfaceC11588c) {
        return this.loader.load(font);
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
        return this.loader.load(font);
    }
}
