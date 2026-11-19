package okhttp3;

import kotlin.jvm.internal.C2769l;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
public abstract class WebSocketListener {
    public void onClosed(@NotNull WebSocket webSocket, int i4, @NotNull String reason) {
        C2769l.m9241e(webSocket, "webSocket");
        C2769l.m9241e(reason, "reason");
    }

    public void onClosing(@NotNull WebSocket webSocket, int i4, @NotNull String reason) {
        C2769l.m9241e(webSocket, "webSocket");
        C2769l.m9241e(reason, "reason");
    }

    public void onFailure(@NotNull WebSocket webSocket, @NotNull Throwable t3, @Nullable Response response) {
        C2769l.m9241e(webSocket, "webSocket");
        C2769l.m9241e(t3, "t");
    }

    public void onMessage(@NotNull WebSocket webSocket, @NotNull String text) {
        C2769l.m9241e(webSocket, "webSocket");
        C2769l.m9241e(text, "text");
    }

    public void onMessage(@NotNull WebSocket webSocket, @NotNull ByteString bytes) {
        C2769l.m9241e(webSocket, "webSocket");
        C2769l.m9241e(bytes, "bytes");
    }

    public void onOpen(@NotNull WebSocket webSocket, @NotNull Response response) {
        C2769l.m9241e(webSocket, "webSocket");
        C2769l.m9241e(response, "response");
    }
}
