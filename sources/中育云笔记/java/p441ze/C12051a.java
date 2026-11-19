package p441ze;

import java.io.BufferedReader;
import java.io.Reader;

/* renamed from: ze.a */
/* loaded from: classes6.dex */
public final class C12051a extends BufferedReader {
    public C12051a(Reader reader) {
        super(reader);
    }

    @Override // java.io.BufferedReader
    public String readLine() {
        StringBuilder sb2 = new StringBuilder();
        synchronized (((BufferedReader) this).lock) {
            boolean z10 = false;
            while (true) {
                try {
                    int i10 = read();
                    if (i10 == -1) {
                        String string = sb2.toString();
                        if (string.isEmpty()) {
                            return null;
                        }
                        return string;
                    }
                    if (z10 && i10 == 10) {
                        return sb2.substring(0, sb2.length() - 1);
                    }
                    z10 = i10 == 13;
                    sb2.append((char) i10);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
