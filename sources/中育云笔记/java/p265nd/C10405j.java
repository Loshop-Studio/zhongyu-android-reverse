package p265nd;

import kotlin.jvm.internal.AbstractC9972n;

/* renamed from: nd.j */
/* loaded from: classes6.dex */
public final class C10405j extends C10403h implements InterfaceC10402g {

    /* renamed from: g */
    public static final a f24760g = new a(null);

    /* renamed from: h */
    public static final C10405j f24761h = new C10405j(1, 0);

    /* renamed from: nd.j$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: a */
        public final C10405j m21742a() {
            return C10405j.f24761h;
        }

        public a() {
        }
    }

    public C10405j(int i10, int i11) {
        super(i10, i11, 1);
    }

    @Override // p265nd.C10403h
    public boolean equals(Object obj) {
        if (!(obj instanceof C10405j)) {
            return false;
        }
        if (isEmpty() && ((C10405j) obj).isEmpty()) {
            return true;
        }
        C10405j c10405j = (C10405j) obj;
        return m21733b() == c10405j.m21733b() && m21734c() == c10405j.m21734c();
    }

    /* renamed from: g */
    public boolean m21739g(int i10) {
        return m21733b() <= i10 && i10 <= m21734c();
    }

    @Override // p265nd.InterfaceC10402g
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public Integer getEndInclusive() {
        return Integer.valueOf(m21734c());
    }

    @Override // p265nd.C10403h
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (m21733b() * 31) + m21734c();
    }

    @Override // p265nd.InterfaceC10402g
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public Integer getStart() {
        return Integer.valueOf(m21733b());
    }

    @Override // p265nd.C10403h, p265nd.InterfaceC10402g
    public boolean isEmpty() {
        return m21733b() > m21734c();
    }

    @Override // p265nd.C10403h
    public String toString() {
        return m21733b() + ".." + m21734c();
    }
}
