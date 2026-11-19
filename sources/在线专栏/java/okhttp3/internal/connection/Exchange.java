package okhttp3.internal.connection;

import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketException;
import kotlin.jvm.internal.C2769l;
import okhttp3.EventListener;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealResponseBody;
import okhttp3.internal.p130ws.RealWebSocket;
import okio.Buffer;
import okio.ForwardingSink;
import okio.ForwardingSource;
import okio.Okio;
import okio.Sink;
import okio.Source;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
public final class Exchange {

    @NotNull
    private final RealCall call;
    private final ExchangeCodec codec;

    @NotNull
    private final RealConnection connection;

    @NotNull
    private final EventListener eventListener;

    @NotNull
    private final ExchangeFinder finder;
    private boolean isDuplex;

    private final class RequestBodySink extends ForwardingSink {
        private long bytesReceived;
        private boolean closed;
        private boolean completed;
        private final long contentLength;
        final /* synthetic */ Exchange this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RequestBodySink(@NotNull Exchange exchange, Sink delegate, long j4) {
            super(delegate);
            C2769l.m9241e(delegate, "delegate");
            this.this$0 = exchange;
            this.contentLength = j4;
        }

        private final <E extends IOException> E complete(E e4) {
            if (this.completed) {
                return e4;
            }
            this.completed = true;
            return (E) this.this$0.bodyComplete(this.bytesReceived, false, true, e4);
        }

        @Override // okio.ForwardingSink, okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.closed) {
                return;
            }
            this.closed = true;
            long j4 = this.contentLength;
            if (j4 != -1 && this.bytesReceived != j4) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                complete(null);
            } catch (IOException e4) {
                throw complete(e4);
            }
        }

        @Override // okio.ForwardingSink, okio.Sink, java.io.Flushable
        public void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e4) {
                throw complete(e4);
            }
        }

        @Override // okio.ForwardingSink, okio.Sink
        public void write(@NotNull Buffer source, long j4) throws IOException {
            C2769l.m9241e(source, "source");
            if (!(!this.closed)) {
                throw new IllegalStateException("closed".toString());
            }
            long j5 = this.contentLength;
            if (j5 == -1 || this.bytesReceived + j4 <= j5) {
                try {
                    super.write(source, j4);
                    this.bytesReceived += j4;
                    return;
                } catch (IOException e4) {
                    throw complete(e4);
                }
            }
            throw new ProtocolException("expected " + this.contentLength + " bytes but received " + (this.bytesReceived + j4));
        }
    }

    public final class ResponseBodySource extends ForwardingSource {
        private long bytesReceived;
        private boolean closed;
        private boolean completed;
        private final long contentLength;
        private boolean invokeStartEvent;
        final /* synthetic */ Exchange this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ResponseBodySource(@NotNull Exchange exchange, Source delegate, long j4) {
            super(delegate);
            C2769l.m9241e(delegate, "delegate");
            this.this$0 = exchange;
            this.contentLength = j4;
            this.invokeStartEvent = true;
            if (j4 == 0) {
                complete(null);
            }
        }

        @Override // okio.ForwardingSource, okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.closed) {
                return;
            }
            this.closed = true;
            try {
                super.close();
                complete(null);
            } catch (IOException e4) {
                throw complete(e4);
            }
        }

        public final <E extends IOException> E complete(E e4) {
            if (this.completed) {
                return e4;
            }
            this.completed = true;
            if (e4 == null && this.invokeStartEvent) {
                this.invokeStartEvent = false;
                this.this$0.getEventListener$okhttp().responseBodyStart(this.this$0.getCall$okhttp());
            }
            return (E) this.this$0.bodyComplete(this.bytesReceived, true, false, e4);
        }

        @Override // okio.ForwardingSource, okio.Source
        public long read(@NotNull Buffer sink, long j4) throws IOException {
            C2769l.m9241e(sink, "sink");
            if (!(!this.closed)) {
                throw new IllegalStateException("closed".toString());
            }
            try {
                long j5 = delegate().read(sink, j4);
                if (this.invokeStartEvent) {
                    this.invokeStartEvent = false;
                    this.this$0.getEventListener$okhttp().responseBodyStart(this.this$0.getCall$okhttp());
                }
                if (j5 == -1) {
                    complete(null);
                    return -1L;
                }
                long j6 = this.bytesReceived + j5;
                long j7 = this.contentLength;
                if (j7 != -1 && j6 > j7) {
                    throw new ProtocolException("expected " + this.contentLength + " bytes but received " + j6);
                }
                this.bytesReceived = j6;
                if (j6 == j7) {
                    complete(null);
                }
                return j5;
            } catch (IOException e4) {
                throw complete(e4);
            }
        }
    }

    public Exchange(@NotNull RealCall call, @NotNull EventListener eventListener, @NotNull ExchangeFinder finder, @NotNull ExchangeCodec codec) {
        C2769l.m9241e(call, "call");
        C2769l.m9241e(eventListener, "eventListener");
        C2769l.m9241e(finder, "finder");
        C2769l.m9241e(codec, "codec");
        this.call = call;
        this.eventListener = eventListener;
        this.finder = finder;
        this.codec = codec;
        this.connection = codec.getConnection();
    }

    private final void trackFailure(IOException iOException) {
        this.finder.trackFailure(iOException);
        this.codec.getConnection().trackFailure$okhttp(this.call, iOException);
    }

    public final <E extends IOException> E bodyComplete(long j4, boolean z3, boolean z4, E e4) {
        if (e4 != null) {
            trackFailure(e4);
        }
        if (z4) {
            if (e4 != null) {
                this.eventListener.requestFailed(this.call, e4);
            } else {
                this.eventListener.requestBodyEnd(this.call, j4);
            }
        }
        if (z3) {
            if (e4 != null) {
                this.eventListener.responseFailed(this.call, e4);
            } else {
                this.eventListener.responseBodyEnd(this.call, j4);
            }
        }
        return (E) this.call.messageDone$okhttp(this, z4, z3, e4);
    }

    public final void cancel() {
        this.codec.cancel();
    }

    @NotNull
    public final Sink createRequestBody(@NotNull Request request, boolean z3) throws IOException {
        C2769l.m9241e(request, "request");
        this.isDuplex = z3;
        RequestBody requestBodyBody = request.body();
        C2769l.m9239c(requestBodyBody);
        long jContentLength = requestBodyBody.contentLength();
        this.eventListener.requestBodyStart(this.call);
        return new RequestBodySink(this, this.codec.createRequestBody(request, jContentLength), jContentLength);
    }

    public final void detachWithViolence() {
        this.codec.cancel();
        this.call.messageDone$okhttp(this, true, true, null);
    }

    public final void finishRequest() throws IOException {
        try {
            this.codec.finishRequest();
        } catch (IOException e4) {
            this.eventListener.requestFailed(this.call, e4);
            trackFailure(e4);
            throw e4;
        }
    }

    public final void flushRequest() throws IOException {
        try {
            this.codec.flushRequest();
        } catch (IOException e4) {
            this.eventListener.requestFailed(this.call, e4);
            trackFailure(e4);
            throw e4;
        }
    }

    @NotNull
    public final RealCall getCall$okhttp() {
        return this.call;
    }

    @NotNull
    public final RealConnection getConnection$okhttp() {
        return this.connection;
    }

    @NotNull
    public final EventListener getEventListener$okhttp() {
        return this.eventListener;
    }

    @NotNull
    public final ExchangeFinder getFinder$okhttp() {
        return this.finder;
    }

    public final boolean isCoalescedConnection$okhttp() {
        return !C2769l.m9237a(this.finder.getAddress$okhttp().url().host(), this.connection.route().address().url().host());
    }

    public final boolean isDuplex$okhttp() {
        return this.isDuplex;
    }

    @NotNull
    public final RealWebSocket.Streams newWebSocketStreams() throws SocketException {
        this.call.timeoutEarlyExit();
        return this.codec.getConnection().newWebSocketStreams$okhttp(this);
    }

    public final void noNewExchangesOnConnection() {
        this.codec.getConnection().noNewExchanges$okhttp();
    }

    public final void noRequestBody() {
        this.call.messageDone$okhttp(this, true, false, null);
    }

    @NotNull
    public final ResponseBody openResponseBody(@NotNull Response response) throws IOException {
        C2769l.m9241e(response, "response");
        try {
            String strHeader$default = Response.header$default(response, "Content-Type", null, 2, null);
            long jReportedContentLength = this.codec.reportedContentLength(response);
            return new RealResponseBody(strHeader$default, jReportedContentLength, Okio.buffer(new ResponseBodySource(this, this.codec.openResponseBodySource(response), jReportedContentLength)));
        } catch (IOException e4) {
            this.eventListener.responseFailed(this.call, e4);
            trackFailure(e4);
            throw e4;
        }
    }

    @Nullable
    public final Response.Builder readResponseHeaders(boolean z3) throws IOException {
        try {
            Response.Builder responseHeaders = this.codec.readResponseHeaders(z3);
            if (responseHeaders != null) {
                responseHeaders.initExchange$okhttp(this);
            }
            return responseHeaders;
        } catch (IOException e4) {
            this.eventListener.responseFailed(this.call, e4);
            trackFailure(e4);
            throw e4;
        }
    }

    public final void responseHeadersEnd(@NotNull Response response) {
        C2769l.m9241e(response, "response");
        this.eventListener.responseHeadersEnd(this.call, response);
    }

    public final void responseHeadersStart() {
        this.eventListener.responseHeadersStart(this.call);
    }

    @NotNull
    public final Headers trailers() throws IOException {
        return this.codec.trailers();
    }

    public final void webSocketUpgradeFailed() {
        bodyComplete(-1L, true, true, null);
    }

    public final void writeRequestHeaders(@NotNull Request request) throws IOException {
        C2769l.m9241e(request, "request");
        try {
            this.eventListener.requestHeadersStart(this.call);
            this.codec.writeRequestHeaders(request);
            this.eventListener.requestHeadersEnd(this.call, request);
        } catch (IOException e4) {
            this.eventListener.requestFailed(this.call, e4);
            trackFailure(e4);
            throw e4;
        }
    }
}
