package okhttp3.internal.http2;

import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.C2764g;
import kotlin.jvm.internal.C2769l;
import okio.BufferedSource;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public interface PushObserver {
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final PushObserver CANCEL = new Companion.PushObserverCancel();

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = null;

        private static final class PushObserverCancel implements PushObserver {
            @Override // okhttp3.internal.http2.PushObserver
            public boolean onData(int i4, @NotNull BufferedSource source, int i5, boolean z3) throws IOException {
                C2769l.m9241e(source, "source");
                source.skip(i5);
                return true;
            }

            @Override // okhttp3.internal.http2.PushObserver
            public boolean onHeaders(int i4, @NotNull List<Header> responseHeaders, boolean z3) {
                C2769l.m9241e(responseHeaders, "responseHeaders");
                return true;
            }

            @Override // okhttp3.internal.http2.PushObserver
            public boolean onRequest(int i4, @NotNull List<Header> requestHeaders) {
                C2769l.m9241e(requestHeaders, "requestHeaders");
                return true;
            }

            @Override // okhttp3.internal.http2.PushObserver
            public void onReset(int i4, @NotNull ErrorCode errorCode) {
                C2769l.m9241e(errorCode, "errorCode");
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(C2764g c2764g) {
            this();
        }
    }

    boolean onData(int i4, @NotNull BufferedSource bufferedSource, int i5, boolean z3) throws IOException;

    boolean onHeaders(int i4, @NotNull List<Header> list, boolean z3);

    boolean onRequest(int i4, @NotNull List<Header> list);

    void onReset(int i4, @NotNull ErrorCode errorCode);
}
