package androidx.compose.p014ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.p014ui.text.font.AndroidFont;
import vc.InterfaceC11588c;

/* loaded from: classes2.dex */
final class AndroidPreloadedFontTypefaceLoader implements AndroidFont.TypefaceLoader {
    public static final AndroidPreloadedFontTypefaceLoader INSTANCE = new AndroidPreloadedFontTypefaceLoader();

    private AndroidPreloadedFontTypefaceLoader() {
    }

    @Override // androidx.compose.ui.text.font.AndroidFont.TypefaceLoader
    public Object awaitLoad(Context context, AndroidFont androidFont, InterfaceC11588c<?> interfaceC11588c) {
        throw new UnsupportedOperationException("All preloaded fonts are blocking.");
    }

    @Override // androidx.compose.ui.text.font.AndroidFont.TypefaceLoader
    public Typeface loadBlocking(Context context, AndroidFont androidFont) {
        AndroidPreloadedFont androidPreloadedFont = androidFont instanceof AndroidPreloadedFont ? (AndroidPreloadedFont) androidFont : null;
        if (androidPreloadedFont != null) {
            return androidPreloadedFont.loadCached$ui_text_release(context);
        }
        return null;
    }
}
