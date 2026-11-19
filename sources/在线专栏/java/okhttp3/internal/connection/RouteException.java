package okhttp3.internal.connection;

import java.io.IOException;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import p128o2.C2909b;

/* loaded from: classes.dex */
public final class RouteException extends RuntimeException {

    @NotNull
    private final IOException firstConnectException;

    @NotNull
    private IOException lastConnectException;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteException(@NotNull IOException firstConnectException) {
        super(firstConnectException);
        C2769l.m9241e(firstConnectException, "firstConnectException");
        this.firstConnectException = firstConnectException;
        this.lastConnectException = firstConnectException;
    }

    public final void addConnectException(@NotNull IOException e4) {
        C2769l.m9241e(e4, "e");
        C2909b.m9982a(this.firstConnectException, e4);
        this.lastConnectException = e4;
    }

    @NotNull
    public final IOException getFirstConnectException() {
        return this.firstConnectException;
    }

    @NotNull
    public final IOException getLastConnectException() {
        return this.lastConnectException;
    }
}
