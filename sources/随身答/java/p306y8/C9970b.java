package p306y8;

/* renamed from: y8.b */
/* loaded from: classes5.dex */
public class C9970b {

    /* renamed from: a */
    public a[] f17931a;

    /* renamed from: b */
    public int f17932b;

    /* renamed from: c */
    public int f17933c;

    /* renamed from: d */
    public volatile int f17934d;

    /* renamed from: y8.b$a */
    public static final class a {

        /* renamed from: a */
        public final long f17935a;

        /* renamed from: b */
        public Object f17936b;

        /* renamed from: c */
        public a f17937c;

        public a(long j9, Object obj, a aVar) {
            this.f17935a = j9;
            this.f17936b = obj;
            this.f17937c = aVar;
        }
    }

    public C9970b() {
        this(16);
    }

    /* renamed from: a */
    public Object m17245a(long j9) {
        for (a aVar = this.f17931a[((((int) (j9 >>> 32)) ^ ((int) j9)) & Integer.MAX_VALUE) % this.f17932b]; aVar != null; aVar = aVar.f17937c) {
            if (aVar.f17935a == j9) {
                return aVar.f17936b;
            }
        }
        return null;
    }

    /* renamed from: b */
    public long[] m17246b() {
        long[] jArr = new long[this.f17934d];
        int i9 = 0;
        for (a aVar : this.f17931a) {
            while (aVar != null) {
                jArr[i9] = aVar.f17935a;
                aVar = aVar.f17937c;
                i9++;
            }
        }
        return jArr;
    }

    /* renamed from: c */
    public Object m17247c(long j9, Object obj) {
        int i9 = ((((int) (j9 >>> 32)) ^ ((int) j9)) & Integer.MAX_VALUE) % this.f17932b;
        a aVar = this.f17931a[i9];
        for (a aVar2 = aVar; aVar2 != null; aVar2 = aVar2.f17937c) {
            if (aVar2.f17935a == j9) {
                Object obj2 = aVar2.f17936b;
                aVar2.f17936b = obj;
                return obj2;
            }
        }
        this.f17931a[i9] = new a(j9, obj, aVar);
        this.f17934d++;
        if (this.f17934d <= this.f17933c) {
            return null;
        }
        m17248d(this.f17932b * 2);
        return null;
    }

    /* renamed from: d */
    public void m17248d(int i9) {
        a[] aVarArr = new a[i9];
        for (a aVar : this.f17931a) {
            while (aVar != null) {
                long j9 = aVar.f17935a;
                int i10 = ((((int) j9) ^ ((int) (j9 >>> 32))) & Integer.MAX_VALUE) % i9;
                a aVar2 = aVar.f17937c;
                aVar.f17937c = aVarArr[i10];
                aVarArr[i10] = aVar;
                aVar = aVar2;
            }
        }
        this.f17931a = aVarArr;
        this.f17932b = i9;
        this.f17933c = (i9 * 4) / 3;
    }

    /* renamed from: e */
    public int m17249e() {
        return this.f17934d;
    }

    public C9970b(int i9) {
        this.f17932b = i9;
        this.f17933c = (i9 * 4) / 3;
        this.f17931a = new a[i9];
    }
}
