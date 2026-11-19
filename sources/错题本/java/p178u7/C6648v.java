package p178u7;

import android.support.v4.media.AbstractC0037f;
import java.io.IOException;
import java.net.SocketTimeoutException;
import okhttp3.internal.connection.C6313l;
import okhttp3.internal.http2.ErrorCode;
import okio.AsyncTimeout;

/* renamed from: u7.v */
/* loaded from: classes4.dex */
public final class C6648v extends AsyncTimeout {

    /* renamed from: a */
    public final /* synthetic */ C6649w f11197a;

    public C6648v(C6649w c6649w) {
        this.f11197a = c6649w;
    }

    /* renamed from: a */
    public final void m6293a() {
        if (exit()) {
            throw newTimeoutException(null);
        }
    }

    @Override // okio.AsyncTimeout
    public final IOException newTimeoutException(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // okio.AsyncTimeout
    public final void timedOut() {
        this.f11197a.m6298e(ErrorCode.CANCEL);
        C6641o c6641o = this.f11197a.f11199b;
        synchronized (c6641o) {
            long j7 = c6641o.f11157n;
            long j8 = c6641o.f11156m;
            if (j7 < j8) {
                return;
            }
            c6641o.f11156m = j8 + 1;
            c6641o.f11158o = System.nanoTime() + 1000000000;
            c6641o.f11151h.m6129b(new C6313l(c6641o, AbstractC0037f.m91p(new StringBuilder(), c6641o.f11146c, " ping"), 2), 0L);
        }
    }
}
