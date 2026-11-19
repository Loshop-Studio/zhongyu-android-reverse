package p265nd;

import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: nd.c */
/* loaded from: classes6.dex */
public final class C10398c extends AbstractC10396a implements InterfaceC10402g {

    /* renamed from: g */
    public static final a f24748g = new a(null);

    /* renamed from: h */
    public static final C10398c f24749h = new C10398c(1, 0);

    /* renamed from: nd.c$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9972n abstractC9972n) {
            this();
        }

        public a() {
        }
    }

    public C10398c(char c10, char c11) {
        super(c10, c11, 1);
    }

    @Override // p265nd.InterfaceC10402g
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public Character getEndInclusive() {
        return Character.valueOf(m21721c());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C10398c)) {
            return false;
        }
        if (isEmpty() && ((C10398c) obj).isEmpty()) {
            return true;
        }
        C10398c c10398c = (C10398c) obj;
        return m21720b() == c10398c.m21720b() && m21721c() == c10398c.m21721c();
    }

    @Override // p265nd.InterfaceC10402g
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Character getStart() {
        return Character.valueOf(m21720b());
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (m21720b() * 31) + m21721c();
    }

    @Override // p265nd.InterfaceC10402g
    public boolean isEmpty() {
        return AbstractC9979u.m20296i(m21720b(), m21721c()) > 0;
    }

    public String toString() {
        return m21720b() + ".." + m21721c();
    }
}
