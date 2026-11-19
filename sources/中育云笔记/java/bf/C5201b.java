package bf;

/* renamed from: bf.b */
/* loaded from: classes6.dex */
public class C5201b {

    /* renamed from: a */
    public a[] f3072a;

    /* renamed from: b */
    public int f3073b;

    /* renamed from: c */
    public int f3074c;

    /* renamed from: d */
    public volatile int f3075d;

    /* renamed from: bf.b$a */
    public static final class a {

        /* renamed from: a */
        public final long f3076a;

        /* renamed from: b */
        public Object f3077b;

        /* renamed from: c */
        public a f3078c;

        public a(long j10, Object obj, a aVar) {
            this.f3076a = j10;
            this.f3077b = obj;
            this.f3078c = aVar;
        }
    }

    public C5201b() {
        this(16);
    }

    /* renamed from: a */
    public Object m2768a(long j10) {
        for (a aVar = this.f3072a[((((int) (j10 >>> 32)) ^ ((int) j10)) & Integer.MAX_VALUE) % this.f3073b]; aVar != null; aVar = aVar.f3078c) {
            if (aVar.f3076a == j10) {
                return aVar.f3077b;
            }
        }
        return null;
    }

    /* renamed from: b */
    public long[] m2769b() {
        long[] jArr = new long[this.f3075d];
        int i10 = 0;
        for (a aVar : this.f3072a) {
            while (aVar != null) {
                jArr[i10] = aVar.f3076a;
                aVar = aVar.f3078c;
                i10++;
            }
        }
        return jArr;
    }

    /* renamed from: c */
    public Object m2770c(long j10, Object obj) {
        int i10 = ((((int) (j10 >>> 32)) ^ ((int) j10)) & Integer.MAX_VALUE) % this.f3073b;
        a aVar = this.f3072a[i10];
        for (a aVar2 = aVar; aVar2 != null; aVar2 = aVar2.f3078c) {
            if (aVar2.f3076a == j10) {
                Object obj2 = aVar2.f3077b;
                aVar2.f3077b = obj;
                return obj2;
            }
        }
        this.f3072a[i10] = new a(j10, obj, aVar);
        this.f3075d++;
        if (this.f3075d <= this.f3074c) {
            return null;
        }
        m2771d(this.f3073b * 2);
        return null;
    }

    /* renamed from: d */
    public void m2771d(int i10) {
        a[] aVarArr = new a[i10];
        for (a aVar : this.f3072a) {
            while (aVar != null) {
                long j10 = aVar.f3076a;
                int i11 = ((((int) j10) ^ ((int) (j10 >>> 32))) & Integer.MAX_VALUE) % i10;
                a aVar2 = aVar.f3078c;
                aVar.f3078c = aVarArr[i11];
                aVarArr[i11] = aVar;
                aVar = aVar2;
            }
        }
        this.f3072a = aVarArr;
        this.f3073b = i10;
        this.f3074c = (i10 * 4) / 3;
    }

    /* renamed from: e */
    public int m2772e() {
        return this.f3075d;
    }

    public C5201b(int i10) {
        this.f3073b = i10;
        this.f3074c = (i10 * 4) / 3;
        this.f3072a = new a[i10];
    }
}
