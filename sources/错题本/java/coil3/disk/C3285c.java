package coil3.disk;

import java.io.IOException;
import java.util.ArrayList;
import okio.Path;

/* renamed from: coil3.disk.c */
/* loaded from: classes2.dex */
public final class C3285c {

    /* renamed from: a */
    public final String f1937a;

    /* renamed from: b */
    public final long[] f1938b = new long[2];

    /* renamed from: c */
    public final ArrayList f1939c = new ArrayList(2);

    /* renamed from: d */
    public final ArrayList f1940d = new ArrayList(2);

    /* renamed from: e */
    public boolean f1941e;

    /* renamed from: f */
    public boolean f1942f;

    /* renamed from: g */
    public C3284b f1943g;

    /* renamed from: h */
    public int f1944h;

    /* renamed from: i */
    public final /* synthetic */ C3288f f1945i;

    public C3285c(C3288f c3288f, String str) {
        this.f1945i = c3288f;
        this.f1937a = str;
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i = 0; i < 2; i++) {
            sb.append(i);
            this.f1939c.add(this.f1945i.f1950a.resolve(sb.toString()));
            sb.append(".tmp");
            this.f1940d.add(this.f1945i.f1950a.resolve(sb.toString()));
            sb.setLength(length);
        }
    }

    /* renamed from: a */
    public final C3286d m2213a() {
        if (!this.f1941e || this.f1943g != null || this.f1942f) {
            return null;
        }
        ArrayList arrayList = this.f1939c;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            C3288f c3288f = this.f1945i;
            if (i >= size) {
                this.f1944h++;
                return new C3286d(c3288f, this);
            }
            if (!c3288f.f1966q.exists((Path) arrayList.get(i))) {
                try {
                    c3288f.m2223k(this);
                } catch (IOException unused) {
                }
                return null;
            }
            i++;
        }
    }
}
