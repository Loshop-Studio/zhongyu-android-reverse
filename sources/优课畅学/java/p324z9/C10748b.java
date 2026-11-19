package p324z9;

/* renamed from: z9.b */
/* loaded from: classes5.dex */
public class C10748b {

    /* renamed from: a */
    public a[] f21369a;

    /* renamed from: b */
    public int f21370b;

    /* renamed from: c */
    public int f21371c;

    /* renamed from: d */
    public volatile int f21372d;

    /* renamed from: z9.b$a */
    public static final class a {

        /* renamed from: a */
        public final long f21373a;

        /* renamed from: b */
        public Object f21374b;

        /* renamed from: c */
        public a f21375c;

        public a(long j10, Object obj, a aVar) {
            this.f21373a = j10;
            this.f21374b = obj;
            this.f21375c = aVar;
        }
    }

    public C10748b() {
        this(16);
    }

    /* renamed from: a */
    public Object m20091a(long j10) {
        for (a aVar = this.f21369a[((((int) (j10 >>> 32)) ^ ((int) j10)) & Integer.MAX_VALUE) % this.f21370b]; aVar != null; aVar = aVar.f21375c) {
            if (aVar.f21373a == j10) {
                return aVar.f21374b;
            }
        }
        return null;
    }

    /* renamed from: b */
    public long[] m20092b() {
        long[] jArr = new long[this.f21372d];
        int i10 = 0;
        for (a aVar : this.f21369a) {
            while (aVar != null) {
                jArr[i10] = aVar.f21373a;
                aVar = aVar.f21375c;
                i10++;
            }
        }
        return jArr;
    }

    /* renamed from: c */
    public Object m20093c(long j10, Object obj) {
        int i10 = ((((int) (j10 >>> 32)) ^ ((int) j10)) & Integer.MAX_VALUE) % this.f21370b;
        a aVar = this.f21369a[i10];
        for (a aVar2 = aVar; aVar2 != null; aVar2 = aVar2.f21375c) {
            if (aVar2.f21373a == j10) {
                Object obj2 = aVar2.f21374b;
                aVar2.f21374b = obj;
                return obj2;
            }
        }
        this.f21369a[i10] = new a(j10, obj, aVar);
        this.f21372d++;
        if (this.f21372d <= this.f21371c) {
            return null;
        }
        m20094d(this.f21370b * 2);
        return null;
    }

    /* renamed from: d */
    public void m20094d(int i10) {
        a[] aVarArr = new a[i10];
        for (a aVar : this.f21369a) {
            while (aVar != null) {
                long j10 = aVar.f21373a;
                int i11 = ((((int) j10) ^ ((int) (j10 >>> 32))) & Integer.MAX_VALUE) % i10;
                a aVar2 = aVar.f21375c;
                aVar.f21375c = aVarArr[i11];
                aVarArr[i11] = aVar;
                aVar = aVar2;
            }
        }
        this.f21369a = aVarArr;
        this.f21370b = i10;
        this.f21371c = (i10 * 4) / 3;
    }

    /* renamed from: e */
    public int m20095e() {
        return this.f21372d;
    }

    public C10748b(int i10) {
        this.f21370b = i10;
        this.f21371c = (i10 * 4) / 3;
        this.f21369a = new a[i10];
    }
}
