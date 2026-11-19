package p186w;

import coil3.disk.C3284b;
import java.io.File;

/* renamed from: w.c */
/* loaded from: classes2.dex */
public final class C6688c {

    /* renamed from: a */
    public final String f11279a;

    /* renamed from: b */
    public final long[] f11280b;

    /* renamed from: c */
    public final File[] f11281c;

    /* renamed from: d */
    public final File[] f11282d;

    /* renamed from: e */
    public boolean f11283e;

    /* renamed from: f */
    public C3284b f11284f;

    /* renamed from: g */
    public final /* synthetic */ C6689d f11285g;

    public C6688c(C6689d c6689d, String str) {
        this.f11285g = c6689d;
        this.f11279a = str;
        int i = c6689d.f11292g;
        File file = c6689d.f11286a;
        this.f11280b = new long[i];
        this.f11281c = new File[i];
        this.f11282d = new File[i];
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i8 = 0; i8 < i; i8++) {
            sb.append(i8);
            this.f11281c[i8] = new File(file, sb.toString());
            sb.append(".tmp");
            this.f11282d[i8] = new File(file, sb.toString());
            sb.setLength(length);
        }
    }

    /* renamed from: a */
    public final String m6381a() {
        StringBuilder sb = new StringBuilder();
        for (long j7 : this.f11280b) {
            sb.append(' ');
            sb.append(j7);
        }
        return sb.toString();
    }
}
