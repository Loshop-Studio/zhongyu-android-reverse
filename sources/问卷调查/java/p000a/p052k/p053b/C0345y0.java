package p000a.p052k.p053b;

import android.util.Log;
import java.io.Writer;

/* renamed from: a.k.b.y0 */
/* loaded from: classes.dex */
public final class C0345y0 extends Writer {

    /* renamed from: b */
    public final String f2119b;

    /* renamed from: c */
    public StringBuilder f2120c = new StringBuilder(128);

    public C0345y0(String str) {
        this.f2119b = str;
    }

    /* renamed from: a */
    public final void m1248a() {
        if (this.f2120c.length() > 0) {
            Log.d(this.f2119b, this.f2120c.toString());
            StringBuilder sb = this.f2120c;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m1248a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        m1248a();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c2 = cArr[i + i3];
            if (c2 == '\n') {
                m1248a();
            } else {
                this.f2120c.append(c2);
            }
        }
    }
}
