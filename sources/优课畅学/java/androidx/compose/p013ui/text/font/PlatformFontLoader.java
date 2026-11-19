package androidx.compose.p013ui.text.font;

import p179m7.InterfaceC9324c;

/* loaded from: classes2.dex */
public interface PlatformFontLoader {
    Object awaitLoad(Font font, InterfaceC9324c<Object> interfaceC9324c);

    Object getCacheKey();

    Object loadBlocking(Font font);
}
