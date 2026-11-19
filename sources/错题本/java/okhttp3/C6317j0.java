package okhttp3;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import kotlin.jvm.internal.AbstractC5830k;
import okio.BufferedSource;
import p045d6.C5443s;
import p139p7.AbstractC6396c;

/* renamed from: okhttp3.j0 */
/* loaded from: classes4.dex */
public final class C6317j0 extends Reader {

    /* renamed from: a */
    public final BufferedSource f10222a;

    /* renamed from: b */
    public final Charset f10223b;

    /* renamed from: c */
    public boolean f10224c;

    /* renamed from: d */
    public InputStreamReader f10225d;

    public C6317j0(BufferedSource source, Charset charset) {
        AbstractC5830k.m5330g(source, "source");
        AbstractC5830k.m5330g(charset, "charset");
        this.f10222a = source;
        this.f10223b = charset;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        C5443s c5443s;
        this.f10224c = true;
        InputStreamReader inputStreamReader = this.f10225d;
        if (inputStreamReader != null) {
            inputStreamReader.close();
            c5443s = C5443s.f8405a;
        } else {
            c5443s = null;
        }
        if (c5443s == null) {
            this.f10222a.close();
        }
    }

    @Override // java.io.Reader
    public final int read(char[] cbuf, int i, int i8) throws IOException {
        AbstractC5830k.m5330g(cbuf, "cbuf");
        if (this.f10224c) {
            throw new IOException("Stream closed");
        }
        InputStreamReader inputStreamReader = this.f10225d;
        if (inputStreamReader == null) {
            BufferedSource bufferedSource = this.f10222a;
            inputStreamReader = new InputStreamReader(bufferedSource.inputStream(), AbstractC6396c.m6057q(bufferedSource, this.f10223b));
            this.f10225d = inputStreamReader;
        }
        return inputStreamReader.read(cbuf, i, i8);
    }
}
