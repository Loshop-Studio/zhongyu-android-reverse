package okhttp3.internal.connection;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m13412d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR$\u0010\u0010\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00038\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\f¨\u0006\u0011"}, m13413d2 = {"Lokhttp3/internal/connection/RouteException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Ljava/io/IOException;", "firstConnectException", "<init>", "(Ljava/io/IOException;)V", "e", "", "a", "Ljava/io/IOException;", "c", "()Ljava/io/IOException;", "<set-?>", "b", "g", "lastConnectException", "okhttp"}, m13414k = 1, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes5.dex */
public final class RouteException extends RuntimeException {

    /* renamed from: a, reason: from kotlin metadata */
    public final IOException firstConnectException;

    /* renamed from: b, reason: from kotlin metadata */
    public IOException lastConnectException;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteException(IOException firstConnectException) {
        super(firstConnectException);
        Intrinsics.checkNotNullParameter(firstConnectException, "firstConnectException");
        this.firstConnectException = firstConnectException;
        this.lastConnectException = firstConnectException;
    }

    /* renamed from: a */
    public final void m14890a(IOException e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        ExceptionsKt.addSuppressed(this.firstConnectException, e10);
        this.lastConnectException = e10;
    }

    /* renamed from: c, reason: from getter */
    public final IOException getFirstConnectException() {
        return this.firstConnectException;
    }

    /* renamed from: g, reason: from getter */
    public final IOException getLastConnectException() {
        return this.lastConnectException;
    }
}
