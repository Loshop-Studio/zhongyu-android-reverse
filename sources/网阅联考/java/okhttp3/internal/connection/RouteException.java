package okhttp3.internal.connection;

import com.umeng.analytics.pro.C3335ai;
import java.io.IOException;
import kotlin.ExceptionsKt__ExceptionsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m5174d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0011\b\u0000\u0012\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003R$\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00038\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0006\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\r\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\u0010"}, m5175d2 = {"Lokhttp3/internal/connection/RouteException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Ljava/io/IOException;", "e", "", C3335ai.f1705at, "<set-?>", "Ljava/io/IOException;", C3335ai.f1663aD, "()Ljava/io/IOException;", "lastConnectException", "b", "firstConnectException", "<init>", "(Ljava/io/IOException;)V", "okhttp"}, m5176k = 1, m5177mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class RouteException extends RuntimeException {

    /* renamed from: a, reason: from kotlin metadata */
    public IOException lastConnectException;

    /* renamed from: b, reason: from kotlin metadata */
    public final IOException firstConnectException;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteException(IOException firstConnectException) {
        super(firstConnectException);
        Intrinsics.checkNotNullParameter(firstConnectException, "firstConnectException");
        this.firstConnectException = firstConnectException;
        this.lastConnectException = firstConnectException;
    }

    /* renamed from: a */
    public final void m5620a(IOException e4) {
        Intrinsics.checkNotNullParameter(e4, "e");
        ExceptionsKt__ExceptionsKt.addSuppressed(this.firstConnectException, e4);
        this.lastConnectException = e4;
    }

    /* renamed from: b, reason: from getter */
    public final IOException getFirstConnectException() {
        return this.firstConnectException;
    }

    /* renamed from: c, reason: from getter */
    public final IOException getLastConnectException() {
        return this.lastConnectException;
    }
}
