package p186w;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

/* renamed from: w.e */
/* loaded from: classes2.dex */
public final class C6690e extends ByteArrayOutputStream {

    /* renamed from: a */
    public final /* synthetic */ C6691f f11300a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6690e(C6691f c6691f, int i) {
        super(i);
        this.f11300a = c6691f;
    }

    @Override // java.io.ByteArrayOutputStream
    public final String toString() {
        int i = ((ByteArrayOutputStream) this).count;
        if (i > 0 && ((ByteArrayOutputStream) this).buf[i - 1] == 13) {
            i--;
        }
        try {
            return new String(((ByteArrayOutputStream) this).buf, 0, i, this.f11300a.f11302b.name());
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }
}
