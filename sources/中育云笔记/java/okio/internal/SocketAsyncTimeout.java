package okio.internal;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import kotlin.jvm.internal.AbstractC9979u;
import okio.AsyncTimeout;

/* loaded from: classes6.dex */
public final class SocketAsyncTimeout extends AsyncTimeout {
    private final Socket socket;

    public SocketAsyncTimeout(Socket socket) {
        AbstractC9979u.m20294g(socket, "socket");
        this.socket = socket;
    }

    @Override // okio.AsyncTimeout
    public IOException newTimeoutException(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // okio.AsyncTimeout
    public void timedOut() throws IOException {
        try {
            this.socket.close();
        } catch (AssertionError e10) {
            if (!_JavaIoKt.isAndroidGetsocknameError(e10)) {
                throw e10;
            }
            _JavaIoKt.logger.log(Level.WARNING, "Failed to close timed out socket " + this.socket, (Throwable) e10);
        } catch (Exception e11) {
            _JavaIoKt.logger.log(Level.WARNING, "Failed to close timed out socket " + this.socket, (Throwable) e11);
        }
    }
}
