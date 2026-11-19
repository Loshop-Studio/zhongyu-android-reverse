package p310qd;

import java.util.Iterator;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p265nd.C10405j;
import p296pd.AbstractC10669q;
import p310qd.C10806m;
import p325rc.AbstractC10936b;
import p325rc.AbstractC10947g0;
import p325rc.AbstractC10978w;

/* renamed from: qd.m */
/* loaded from: classes6.dex */
public final class C10806m implements InterfaceC10804k {

    /* renamed from: a */
    public final Matcher f26077a;

    /* renamed from: b */
    public final CharSequence f26078b;

    /* renamed from: c */
    public final InterfaceC10803j f26079c;

    /* renamed from: qd.m$a */
    public static final class a extends AbstractC10936b implements InterfaceC10803j {
        public a() {
        }

        /* renamed from: f */
        public static final C10802i m23198f(a aVar, int i10) {
            return aVar.get(i10);
        }

        @Override // p325rc.AbstractC10936b, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj == null ? true : obj instanceof C10802i) {
                return m23199e((C10802i) obj);
            }
            return false;
        }

        /* renamed from: e */
        public /* bridge */ boolean m23199e(C10802i c10802i) {
            return super.contains(c10802i);
        }

        @Override // p310qd.InterfaceC10803j
        public C10802i get(int i10) {
            C10405j c10405jM23207h = AbstractC10807n.m23207h(C10806m.this.m23196d(), i10);
            if (c10405jM23207h.getStart().intValue() < 0) {
                return null;
            }
            String strGroup = C10806m.this.m23196d().group(i10);
            AbstractC9979u.m20293f(strGroup, "group(...)");
            return new C10802i(strGroup, c10405jM23207h);
        }

        @Override // p325rc.AbstractC10936b
        public int getSize() {
            return C10806m.this.m23196d().groupCount() + 1;
        }

        @Override // p325rc.AbstractC10936b, java.util.Collection
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return AbstractC10669q.m22570B(AbstractC10947g0.m23930d0(AbstractC10978w.m24137o(this)), new InterfaceC9540l() { // from class: qd.l
                @Override // p181hd.InterfaceC9540l
                public final Object invoke(Object obj) {
                    return C10806m.a.m23198f(this.f26076c, ((Integer) obj).intValue());
                }
            }).iterator();
        }
    }

    public C10806m(Matcher matcher, CharSequence input) {
        AbstractC9979u.m20294g(matcher, "matcher");
        AbstractC9979u.m20294g(input, "input");
        this.f26077a = matcher;
        this.f26078b = input;
        this.f26079c = new a();
    }

    @Override // p310qd.InterfaceC10804k
    /* renamed from: a */
    public C10405j mo23193a() {
        return AbstractC10807n.m23206g(m23196d());
    }

    @Override // p310qd.InterfaceC10804k
    /* renamed from: b */
    public InterfaceC10803j mo23194b() {
        return this.f26079c;
    }

    /* renamed from: d */
    public final MatchResult m23196d() {
        return this.f26077a;
    }

    @Override // p310qd.InterfaceC10804k
    public InterfaceC10804k next() {
        int iEnd = m23196d().end() + (m23196d().end() == m23196d().start() ? 1 : 0);
        if (iEnd > this.f26078b.length()) {
            return null;
        }
        Matcher matcher = this.f26077a.pattern().matcher(this.f26078b);
        AbstractC9979u.m20293f(matcher, "matcher(...)");
        return AbstractC10807n.m23204e(matcher, iEnd, this.f26078b);
    }
}
