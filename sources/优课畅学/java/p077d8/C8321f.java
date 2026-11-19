package p077d8;

import kotlin.jvm.internal.AbstractC9126n;

/* renamed from: d8.f */
/* loaded from: classes5.dex */
public final class C8321f extends C8319d implements InterfaceC8318c {

    /* renamed from: e */
    public static final a f15784e = new a(null);

    /* renamed from: f */
    public static final C8321f f15785f = new C8321f(1, 0);

    /* renamed from: d8.f$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final C8321f m13505a() {
            return C8321f.f15785f;
        }

        public a() {
        }
    }

    public C8321f(int i10, int i11) {
        super(i10, i11, 1);
    }

    @Override // p077d8.C8319d
    public boolean equals(Object obj) {
        if (!(obj instanceof C8321f)) {
            return false;
        }
        if (isEmpty() && ((C8321f) obj).isEmpty()) {
            return true;
        }
        C8321f c8321f = (C8321f) obj;
        return m13496b() == c8321f.m13496b() && m13497c() == c8321f.m13497c();
    }

    /* renamed from: g */
    public boolean m13502g(int i10) {
        return m13496b() <= i10 && i10 <= m13497c();
    }

    @Override // p077d8.InterfaceC8318c
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public Integer getEndInclusive() {
        return Integer.valueOf(m13497c());
    }

    @Override // p077d8.C8319d
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (m13496b() * 31) + m13497c();
    }

    @Override // p077d8.InterfaceC8318c
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public Integer getStart() {
        return Integer.valueOf(m13496b());
    }

    @Override // p077d8.C8319d, p077d8.InterfaceC8318c
    public boolean isEmpty() {
        return m13496b() > m13497c();
    }

    @Override // p077d8.C8319d
    public String toString() {
        return m13496b() + ".." + m13497c();
    }
}
