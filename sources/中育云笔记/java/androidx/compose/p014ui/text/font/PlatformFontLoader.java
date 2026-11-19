package androidx.compose.p014ui.text.font;

import vc.InterfaceC11588c;

/* loaded from: classes2.dex */
public interface PlatformFontLoader {
    Object awaitLoad(Font font, InterfaceC11588c<Object> interfaceC11588c);

    Object getCacheKey();

    Object loadBlocking(Font font);
}
