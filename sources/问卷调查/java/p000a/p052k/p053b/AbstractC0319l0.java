package p000a.p052k.p053b;

import java.util.ArrayList;
import p000a.p057m.AbstractC0355d;

/* renamed from: a.k.b.l0 */
/* loaded from: classes.dex */
public abstract class AbstractC0319l0 {

    /* renamed from: b */
    public int f1934b;

    /* renamed from: c */
    public int f1935c;

    /* renamed from: d */
    public int f1936d;

    /* renamed from: e */
    public int f1937e;

    /* renamed from: f */
    public int f1938f;

    /* renamed from: g */
    public boolean f1939g;

    /* renamed from: h */
    public String f1940h;

    /* renamed from: i */
    public int f1941i;

    /* renamed from: j */
    public CharSequence f1942j;

    /* renamed from: k */
    public int f1943k;

    /* renamed from: l */
    public CharSequence f1944l;

    /* renamed from: m */
    public ArrayList<String> f1945m;

    /* renamed from: n */
    public ArrayList<String> f1946n;

    /* renamed from: a */
    public ArrayList<a> f1933a = new ArrayList<>();

    /* renamed from: o */
    public boolean f1947o = false;

    /* renamed from: a.k.b.l0$a */
    public static final class a {

        /* renamed from: a */
        public int f1948a;

        /* renamed from: b */
        public ComponentCallbacksC0320m f1949b;

        /* renamed from: c */
        public int f1950c;

        /* renamed from: d */
        public int f1951d;

        /* renamed from: e */
        public int f1952e;

        /* renamed from: f */
        public int f1953f;

        /* renamed from: g */
        public AbstractC0355d.b f1954g;

        /* renamed from: h */
        public AbstractC0355d.b f1955h;

        public a() {
        }

        public a(int i, ComponentCallbacksC0320m componentCallbacksC0320m) {
            this.f1948a = i;
            this.f1949b = componentCallbacksC0320m;
            AbstractC0355d.b bVar = AbstractC0355d.b.RESUMED;
            this.f1954g = bVar;
            this.f1955h = bVar;
        }

        public a(int i, ComponentCallbacksC0320m componentCallbacksC0320m, AbstractC0355d.b bVar) {
            this.f1948a = i;
            this.f1949b = componentCallbacksC0320m;
            this.f1954g = componentCallbacksC0320m.f1971O;
            this.f1955h = bVar;
        }
    }

    public AbstractC0319l0(C0344y c0344y, ClassLoader classLoader) {
    }

    /* renamed from: b */
    public void m1129b(a aVar) {
        this.f1933a.add(aVar);
        aVar.f1950c = this.f1934b;
        aVar.f1951d = this.f1935c;
        aVar.f1952e = this.f1936d;
        aVar.f1953f = this.f1937e;
    }

    /* renamed from: c */
    public abstract void mo974c(int i, ComponentCallbacksC0320m componentCallbacksC0320m, String str, int i2);

    /* renamed from: d */
    public abstract AbstractC0319l0 mo975d(ComponentCallbacksC0320m componentCallbacksC0320m, AbstractC0355d.b bVar);
}
