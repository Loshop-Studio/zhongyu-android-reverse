package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* renamed from: androidx.fragment.app.x */
/* loaded from: classes.dex */
final class C0475x extends Writer {

    /* renamed from: a */
    private final String f3319a;

    /* renamed from: b */
    private StringBuilder f3320b = new StringBuilder(128);

    C0475x(String str) {
        this.f3319a = str;
    }

    /* renamed from: a */
    private void m2772a() {
        if (this.f3320b.length() > 0) {
            Log.d(this.f3319a, this.f3320b.toString());
            StringBuilder sb = this.f3320b;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m2772a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        m2772a();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i4, int i5) {
        for (int i6 = 0; i6 < i5; i6++) {
            char c4 = cArr[i4 + i6];
            if (c4 == '\n') {
                m2772a();
            } else {
                this.f3320b.append(c4);
            }
        }
    }
}
