package p193o9;

/* renamed from: o9.b */
/* loaded from: classes5.dex */
public class C8730b {

    /* renamed from: a */
    public a[] f14511a;

    /* renamed from: b */
    public int f14512b;

    /* renamed from: c */
    public int f14513c;

    /* renamed from: d */
    public volatile int f14514d;

    /* renamed from: o9.b$a */
    public static final class a {

        /* renamed from: a */
        public final long f14515a;

        /* renamed from: b */
        public Object f14516b;

        /* renamed from: c */
        public a f14517c;

        public a(long j10, Object obj, a aVar) {
            this.f14515a = j10;
            this.f14516b = obj;
            this.f14517c = aVar;
        }
    }

    public C8730b() {
        this(16);
    }

    /* renamed from: a */
    public Object m14373a(long j10) {
        for (a aVar = this.f14511a[((((int) (j10 >>> 32)) ^ ((int) j10)) & Integer.MAX_VALUE) % this.f14512b]; aVar != null; aVar = aVar.f14517c) {
            if (aVar.f14515a == j10) {
                return aVar.f14516b;
            }
        }
        return null;
    }

    /* renamed from: b */
    public long[] m14374b() {
        long[] jArr = new long[this.f14514d];
        int i10 = 0;
        for (a aVar : this.f14511a) {
            while (aVar != null) {
                jArr[i10] = aVar.f14515a;
                aVar = aVar.f14517c;
                i10++;
            }
        }
        return jArr;
    }

    /* renamed from: c */
    public Object m14375c(long j10, Object obj) {
        int i10 = ((((int) (j10 >>> 32)) ^ ((int) j10)) & Integer.MAX_VALUE) % this.f14512b;
        a aVar = this.f14511a[i10];
        for (a aVar2 = aVar; aVar2 != null; aVar2 = aVar2.f14517c) {
            if (aVar2.f14515a == j10) {
                Object obj2 = aVar2.f14516b;
                aVar2.f14516b = obj;
                return obj2;
            }
        }
        this.f14511a[i10] = new a(j10, obj, aVar);
        this.f14514d++;
        if (this.f14514d <= this.f14513c) {
            return null;
        }
        m14376d(this.f14512b * 2);
        return null;
    }

    /* renamed from: d */
    public void m14376d(int i10) {
        a[] aVarArr = new a[i10];
        for (a aVar : this.f14511a) {
            while (aVar != null) {
                long j10 = aVar.f14515a;
                int i11 = ((((int) j10) ^ ((int) (j10 >>> 32))) & Integer.MAX_VALUE) % i10;
                a aVar2 = aVar.f14517c;
                aVar.f14517c = aVarArr[i11];
                aVarArr[i11] = aVar;
                aVar = aVar2;
            }
        }
        this.f14511a = aVarArr;
        this.f14512b = i10;
        this.f14513c = (i10 * 4) / 3;
    }

    /* renamed from: e */
    public int m14377e() {
        return this.f14514d;
    }

    public C8730b(int i10) {
        this.f14512b = i10;
        this.f14513c = (i10 * 4) / 3;
        this.f14511a = new a[i10];
    }
}
