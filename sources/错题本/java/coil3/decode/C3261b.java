package coil3.decode;

import java.io.IOException;
import okio.Buffer;
import okio.BufferedSource;
import okio.ForwardingSource;
import okio.Source;
import p115m4.C6108f;

/* renamed from: coil3.decode.b */
/* loaded from: classes2.dex */
public final class C3261b extends ForwardingSource {

    /* renamed from: a */
    public final /* synthetic */ int f1891a = 1;

    /* renamed from: b */
    public Object f1892b;

    public /* synthetic */ C3261b(Source source) {
        super(source);
    }

    @Override // okio.ForwardingSource, okio.Source
    public final long read(Buffer buffer, long j7) throws Exception {
        switch (this.f1891a) {
            case 0:
                try {
                    return super.read(buffer, j7);
                } catch (Exception e) {
                    this.f1892b = e;
                    throw e;
                }
            default:
                try {
                    return super.read(buffer, j7);
                } catch (IOException e4) {
                    ((C6108f) this.f1892b).f9753d = e4;
                    throw e4;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3261b(C6108f c6108f, BufferedSource bufferedSource) {
        super(bufferedSource);
        this.f1892b = c6108f;
    }
}
