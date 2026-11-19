package p000a.p060o.p061b;

import android.view.View;

/* renamed from: a.o.b.a0 */
/* loaded from: classes.dex */
public class C0377a0 {

    /* renamed from: a */
    public final b f2198a;

    /* renamed from: b */
    public a f2199b = new a();

    /* renamed from: a.o.b.a0$a */
    public static class a {

        /* renamed from: a */
        public int f2200a = 0;

        /* renamed from: b */
        public int f2201b;

        /* renamed from: c */
        public int f2202c;

        /* renamed from: d */
        public int f2203d;

        /* renamed from: e */
        public int f2204e;

        /* renamed from: a */
        public boolean m1317a() {
            int i = this.f2200a;
            if ((i & 7) != 0 && (i & (m1318b(this.f2203d, this.f2201b) << 0)) == 0) {
                return false;
            }
            int i2 = this.f2200a;
            if ((i2 & 112) != 0 && (i2 & (m1318b(this.f2203d, this.f2202c) << 4)) == 0) {
                return false;
            }
            int i3 = this.f2200a;
            if ((i3 & 1792) != 0 && (i3 & (m1318b(this.f2204e, this.f2201b) << 8)) == 0) {
                return false;
            }
            int i4 = this.f2200a;
            return (i4 & 28672) == 0 || (i4 & (m1318b(this.f2204e, this.f2202c) << 12)) != 0;
        }

        /* renamed from: b */
        public int m1318b(int i, int i2) {
            if (i > i2) {
                return 1;
            }
            return i == i2 ? 2 : 4;
        }
    }

    /* renamed from: a.o.b.a0$b */
    public interface b {
        /* renamed from: a */
        int mo1319a();

        /* renamed from: b */
        int mo1320b();

        /* renamed from: c */
        int mo1321c(View view);

        /* renamed from: d */
        int mo1322d(View view);

        /* renamed from: e */
        View mo1323e(int i);
    }

    public C0377a0(b bVar) {
        this.f2198a = bVar;
    }

    /* renamed from: a */
    public View m1315a(int i, int i2, int i3, int i4) {
        int iMo1320b = this.f2198a.mo1320b();
        int iMo1319a = this.f2198a.mo1319a();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View viewMo1323e = this.f2198a.mo1323e(i);
            int iMo1322d = this.f2198a.mo1322d(viewMo1323e);
            int iMo1321c = this.f2198a.mo1321c(viewMo1323e);
            a aVar = this.f2199b;
            aVar.f2201b = iMo1320b;
            aVar.f2202c = iMo1319a;
            aVar.f2203d = iMo1322d;
            aVar.f2204e = iMo1321c;
            if (i3 != 0) {
                aVar.f2200a = 0;
                aVar.f2200a = i3 | 0;
                if (aVar.m1317a()) {
                    return viewMo1323e;
                }
            }
            if (i4 != 0) {
                a aVar2 = this.f2199b;
                aVar2.f2200a = 0;
                aVar2.f2200a = i4 | 0;
                if (aVar2.m1317a()) {
                    view = viewMo1323e;
                }
            }
            i += i5;
        }
        return view;
    }

    /* renamed from: b */
    public boolean m1316b(View view, int i) {
        a aVar = this.f2199b;
        int iMo1320b = this.f2198a.mo1320b();
        int iMo1319a = this.f2198a.mo1319a();
        int iMo1322d = this.f2198a.mo1322d(view);
        int iMo1321c = this.f2198a.mo1321c(view);
        aVar.f2201b = iMo1320b;
        aVar.f2202c = iMo1319a;
        aVar.f2203d = iMo1322d;
        aVar.f2204e = iMo1321c;
        if (i == 0) {
            return false;
        }
        a aVar2 = this.f2199b;
        aVar2.f2200a = 0;
        aVar2.f2200a = 0 | i;
        return aVar2.m1317a();
    }
}
