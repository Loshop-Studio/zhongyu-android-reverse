package p113g8;

import java.util.Iterator;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import kotlin.jvm.internal.AbstractC9133u;
import p077d8.C8321f;
import p101f8.AbstractC8479q;
import p113g8.C8673l;
import p134i7.AbstractC8769b;
import p134i7.AbstractC8773d;
import p134i7.AbstractC8778f0;
import p134i7.AbstractC8809v;
import p300x7.InterfaceC10570l;

/* renamed from: g8.l */
/* loaded from: classes5.dex */
public final class C8673l implements InterfaceC8672k {

    /* renamed from: a */
    public final Matcher f16263a;

    /* renamed from: b */
    public final CharSequence f16264b;

    /* renamed from: c */
    public final InterfaceC8671j f16265c;

    /* renamed from: d */
    public List f16266d;

    /* renamed from: g8.l$a */
    public static final class a extends AbstractC8773d {
        public a() {
        }

        @Override // p134i7.AbstractC8773d, java.util.List
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public String get(int i10) {
            String strGroup = C8673l.this.m14058e().group(i10);
            return strGroup == null ? "" : strGroup;
        }

        @Override // p134i7.AbstractC8769b, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof String) {
                return contains((String) obj);
            }
            return false;
        }

        /* renamed from: d */
        public /* bridge */ int m14060d(String str) {
            return super.indexOf(str);
        }

        /* renamed from: e */
        public /* bridge */ int m14061e(String str) {
            return super.lastIndexOf(str);
        }

        @Override // p134i7.AbstractC8773d, p134i7.AbstractC8769b
        public int getSize() {
            return C8673l.this.m14058e().groupCount() + 1;
        }

        @Override // p134i7.AbstractC8773d, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof String) {
                return m14060d((String) obj);
            }
            return -1;
        }

        @Override // p134i7.AbstractC8773d, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof String) {
                return m14061e((String) obj);
            }
            return -1;
        }

        public /* bridge */ boolean contains(String str) {
            return super.contains((Object) str);
        }
    }

    /* renamed from: g8.l$b */
    public static final class b extends AbstractC8769b implements InterfaceC8671j {
        public b() {
        }

        /* renamed from: e */
        public static final C8670i m14063e(b bVar, int i10) {
            return bVar.get(i10);
        }

        @Override // p134i7.AbstractC8769b, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj == null ? true : obj instanceof C8670i) {
                return m14064d((C8670i) obj);
            }
            return false;
        }

        /* renamed from: d */
        public /* bridge */ boolean m14064d(C8670i c8670i) {
            return super.contains(c8670i);
        }

        @Override // p113g8.InterfaceC8671j
        public C8670i get(int i10) {
            C8321f c8321fM14072h = AbstractC8675n.m14072h(C8673l.this.m14058e(), i10);
            if (c8321fM14072h.getStart().intValue() < 0) {
                return null;
            }
            String strGroup = C8673l.this.m14058e().group(i10);
            AbstractC9133u.m16132f(strGroup, "group(...)");
            return new C8670i(strGroup, c8321fM14072h);
        }

        @Override // p134i7.AbstractC8769b
        public int getSize() {
            return C8673l.this.m14058e().groupCount() + 1;
        }

        @Override // p134i7.AbstractC8769b, java.util.Collection
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return AbstractC8479q.m13839B(AbstractC8778f0.m14554c0(AbstractC8809v.m14772o(this)), new InterfaceC10570l() { // from class: g8.m
                @Override // p300x7.InterfaceC10570l
                public final Object invoke(Object obj) {
                    return C8673l.b.m14063e(this.f16269a, ((Integer) obj).intValue());
                }
            }).iterator();
        }
    }

    public C8673l(Matcher matcher, CharSequence input) {
        AbstractC9133u.m16133g(matcher, "matcher");
        AbstractC9133u.m16133g(input, "input");
        this.f16263a = matcher;
        this.f16264b = input;
        this.f16265c = new b();
    }

    @Override // p113g8.InterfaceC8672k
    /* renamed from: a */
    public List mo14054a() {
        if (this.f16266d == null) {
            this.f16266d = new a();
        }
        List list = this.f16266d;
        AbstractC9133u.m16130d(list);
        return list;
    }

    @Override // p113g8.InterfaceC8672k
    /* renamed from: b */
    public C8321f mo14055b() {
        return AbstractC8675n.m14071g(m14058e());
    }

    @Override // p113g8.InterfaceC8672k
    /* renamed from: c */
    public InterfaceC8671j mo14056c() {
        return this.f16265c;
    }

    /* renamed from: e */
    public final MatchResult m14058e() {
        return this.f16263a;
    }

    @Override // p113g8.InterfaceC8672k
    public InterfaceC8672k next() {
        int iEnd = m14058e().end() + (m14058e().end() == m14058e().start() ? 1 : 0);
        if (iEnd > this.f16264b.length()) {
            return null;
        }
        Matcher matcher = this.f16263a.pattern().matcher(this.f16264b);
        AbstractC9133u.m16132f(matcher, "matcher(...)");
        return AbstractC8675n.m14069e(matcher, iEnd, this.f16264b);
    }
}
