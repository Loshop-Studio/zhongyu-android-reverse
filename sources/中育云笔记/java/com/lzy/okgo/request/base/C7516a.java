package com.lzy.okgo.request.base;

import com.lzy.okgo.model.Progress;
import java.io.IOException;
import je.AbstractC9744x;
import je.C9740t;
import okio.Buffer;
import okio.BufferedSink;
import okio.ForwardingSink;
import okio.Okio;
import okio.Sink;
import p045c7.InterfaceC5405a;
import p146f7.AbstractC9202a;
import p146f7.AbstractC9204c;

/* renamed from: com.lzy.okgo.request.base.a */
/* loaded from: classes5.dex */
public class C7516a extends AbstractC9744x {

    /* renamed from: a */
    public AbstractC9744x f12727a;

    /* renamed from: com.lzy.okgo.request.base.a$a */
    public class a implements Runnable {

        /* renamed from: c */
        public final /* synthetic */ Progress f12728c;

        public a(Progress progress) {
            this.f12728c = progress;
        }

        @Override // java.lang.Runnable
        public void run() {
            C7516a.m9687c(C7516a.this);
        }
    }

    /* renamed from: com.lzy.okgo.request.base.a$b */
    public final class b extends ForwardingSink {

        /* renamed from: c */
        public Progress f12730c;

        /* renamed from: com.lzy.okgo.request.base.a$b$a */
        public class a implements Progress.InterfaceC7515a {
            public a() {
            }

            @Override // com.lzy.okgo.model.Progress.InterfaceC7515a
            /* renamed from: a */
            public void mo9675a(Progress progress) {
                C7516a.m9685a(C7516a.this);
                C7516a.this.m9688d(progress);
            }
        }

        public b(Sink sink) {
            super(sink);
            Progress progress = new Progress();
            this.f12730c = progress;
            progress.f12703i = C7516a.this.contentLength();
        }

        @Override // okio.ForwardingSink, okio.Sink
        public void write(Buffer buffer, long j10) {
            super.write(buffer, j10);
            Progress.m9672f(this.f12730c, j10, new a());
        }
    }

    /* renamed from: com.lzy.okgo.request.base.a$c */
    public interface c {
    }

    public C7516a(AbstractC9744x abstractC9744x, InterfaceC5405a interfaceC5405a) {
        this.f12727a = abstractC9744x;
    }

    /* renamed from: a */
    public static /* synthetic */ c m9685a(C7516a c7516a) {
        c7516a.getClass();
        return null;
    }

    /* renamed from: c */
    public static /* synthetic */ InterfaceC5405a m9687c(C7516a c7516a) {
        c7516a.getClass();
        return null;
    }

    @Override // je.AbstractC9744x
    public long contentLength() {
        try {
            return this.f12727a.contentLength();
        } catch (IOException e10) {
            AbstractC9204c.m18111a(e10);
            return -1L;
        }
    }

    @Override // je.AbstractC9744x
    public C9740t contentType() {
        return this.f12727a.contentType();
    }

    /* renamed from: d */
    public final void m9688d(Progress progress) {
        AbstractC9202a.m18101g(new a(progress));
    }

    /* renamed from: e */
    public void m9689e(c cVar) {
    }

    @Override // je.AbstractC9744x
    public void writeTo(BufferedSink bufferedSink) {
        BufferedSink bufferedSinkBuffer = Okio.buffer(new b(bufferedSink));
        this.f12727a.writeTo(bufferedSinkBuffer);
        bufferedSinkBuffer.flush();
    }
}
