package coil3;

import coil3.C5452a;
import coil3.decode.InterfaceC5461a;
import coil3.intercept.InterfaceC5477a;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC9923a;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p001a0.AbstractC0005b;
import p181hd.InterfaceC9529a;
import p253n.C10286p;
import p253n.InterfaceC10281k;
import p280od.InterfaceC10469c;
import p283p.InterfaceC10592c;
import p297q.InterfaceC10687c;
import p309qc.AbstractC10776g;
import p309qc.InterfaceC10773d;
import p325rc.AbstractC10937b0;
import p325rc.AbstractC10947g0;
import p325rc.AbstractC10976v;
import p325rc.AbstractC10978w;
import p380w.C11634n;

/* renamed from: coil3.a */
/* loaded from: classes3.dex */
public final class C5452a {

    /* renamed from: a */
    public final List f3573a;

    /* renamed from: b */
    public final List f3574b;

    /* renamed from: c */
    public final List f3575c;

    /* renamed from: d */
    public List f3576d;

    /* renamed from: e */
    public List f3577e;

    /* renamed from: f */
    public final InterfaceC10773d f3578f;

    /* renamed from: g */
    public final InterfaceC10773d f3579g;

    /* renamed from: coil3.a$a */
    public static final class a {

        /* renamed from: a */
        public final List f3580a;

        /* renamed from: b */
        public final List f3581b;

        /* renamed from: c */
        public final List f3582c;

        /* renamed from: d */
        public final List f3583d;

        /* renamed from: e */
        public final List f3584e;

        public a(C5452a c5452a) {
            this.f3580a = AbstractC10947g0.m23925a1(c5452a.m3000g());
            this.f3581b = AbstractC10947g0.m23925a1(c5452a.m3002i());
            this.f3582c = AbstractC10947g0.m23925a1(c5452a.m3001h());
            List<Pair> listM2999f = c5452a.m2999f();
            ArrayList arrayList = new ArrayList();
            for (final Pair pair : listM2999f) {
                arrayList.add(new InterfaceC9529a() { // from class: k.d
                    @Override // p181hd.InterfaceC9529a
                    public final Object invoke() {
                        return C5452a.a.m3011e(pair);
                    }
                });
            }
            this.f3583d = arrayList;
            List<InterfaceC5461a.a> listM2998e = c5452a.m2998e();
            ArrayList arrayList2 = new ArrayList();
            for (final InterfaceC5461a.a aVar : listM2998e) {
                arrayList2.add(new InterfaceC9529a() { // from class: k.e
                    @Override // p181hd.InterfaceC9529a
                    public final Object invoke() {
                        return C5452a.a.m3012f(aVar);
                    }
                });
            }
            this.f3584e = arrayList2;
        }

        /* renamed from: e */
        public static final List m3011e(Pair pair) {
            return AbstractC10976v.m24126e(pair);
        }

        /* renamed from: f */
        public static final List m3012f(InterfaceC5461a.a aVar) {
            return AbstractC10976v.m24126e(aVar);
        }

        /* renamed from: l */
        public static final List m3013l(InterfaceC5461a.a aVar) {
            return AbstractC10976v.m24126e(aVar);
        }

        /* renamed from: m */
        public static final List m3014m(InterfaceC10281k.a aVar, InterfaceC10469c interfaceC10469c) {
            return AbstractC10976v.m24126e(AbstractC10776g.m22975a(aVar, interfaceC10469c));
        }

        /* renamed from: g */
        public final a m3015g(final InterfaceC5461a.a aVar) {
            this.f3584e.add(new InterfaceC9529a() { // from class: k.g
                @Override // p181hd.InterfaceC9529a
                public final Object invoke() {
                    return C5452a.a.m3013l(aVar);
                }
            });
            return this;
        }

        /* renamed from: h */
        public final a m3016h(InterfaceC5477a interfaceC5477a) {
            this.f3580a.add(interfaceC5477a);
            return this;
        }

        /* renamed from: i */
        public final a m3017i(final InterfaceC10281k.a aVar, final InterfaceC10469c interfaceC10469c) {
            this.f3583d.add(new InterfaceC9529a() { // from class: k.f
                @Override // p181hd.InterfaceC9529a
                public final Object invoke() {
                    return C5452a.a.m3014m(aVar, interfaceC10469c);
                }
            });
            return this;
        }

        /* renamed from: j */
        public final a m3018j(InterfaceC10592c interfaceC10592c, InterfaceC10469c interfaceC10469c) {
            this.f3582c.add(AbstractC10776g.m22975a(interfaceC10592c, interfaceC10469c));
            return this;
        }

        /* renamed from: k */
        public final a m3019k(InterfaceC10687c interfaceC10687c, InterfaceC10469c interfaceC10469c) {
            this.f3581b.add(AbstractC10776g.m22975a(interfaceC10687c, interfaceC10469c));
            return this;
        }

        /* renamed from: n */
        public final a m3020n(InterfaceC9529a interfaceC9529a) {
            this.f3584e.add(interfaceC9529a);
            return this;
        }

        /* renamed from: o */
        public final a m3021o(InterfaceC9529a interfaceC9529a) {
            this.f3583d.add(interfaceC9529a);
            return this;
        }

        /* renamed from: p */
        public final C5452a m3022p() {
            return new C5452a(AbstractC0005b.m10c(this.f3580a), AbstractC0005b.m10c(this.f3581b), AbstractC0005b.m10c(this.f3582c), AbstractC0005b.m10c(this.f3583d), AbstractC0005b.m10c(this.f3584e), null);
        }

        /* renamed from: q */
        public final List m3023q() {
            return this.f3584e;
        }

        /* renamed from: r */
        public final List m3024r() {
            return this.f3583d;
        }
    }

    public /* synthetic */ C5452a(List list, List list2, List list3, List list4, List list5, AbstractC9972n abstractC9972n) {
        this(list, list2, list3, list4, list5);
    }

    /* renamed from: c */
    public static final List m2996c(C5452a c5452a) {
        List list = c5452a.f3577e;
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC10937b0.m23857B(arrayList, (List) ((InterfaceC9529a) list.get(i10)).invoke());
        }
        c5452a.f3577e = AbstractC10978w.m24136n();
        return arrayList;
    }

    /* renamed from: d */
    public static final List m2997d(C5452a c5452a) {
        List list = c5452a.f3576d;
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC10937b0.m23857B(arrayList, (List) ((InterfaceC9529a) list.get(i10)).invoke());
        }
        c5452a.f3576d = AbstractC10978w.m24136n();
        return arrayList;
    }

    /* renamed from: e */
    public final List m2998e() {
        return (List) this.f3579g.getValue();
    }

    /* renamed from: f */
    public final List m2999f() {
        return (List) this.f3578f.getValue();
    }

    /* renamed from: g */
    public final List m3000g() {
        return this.f3573a;
    }

    /* renamed from: h */
    public final List m3001h() {
        return this.f3575c;
    }

    /* renamed from: i */
    public final List m3002i() {
        return this.f3574b;
    }

    /* renamed from: j */
    public final Object m3003j(Object obj, C11634n c11634n) {
        List list = this.f3574b;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Pair pair = (Pair) list.get(i10);
            InterfaceC10687c interfaceC10687c = (InterfaceC10687c) pair.m20048a();
            if (((InterfaceC10469c) pair.m20049c()).mo20275d(obj)) {
                AbstractC9979u.m20292e(interfaceC10687c, "null cannot be cast to non-null type coil3.map.Mapper<kotlin.Any, *>");
                Object objMo22645a = interfaceC10687c.mo22645a(obj, c11634n);
                if (objMo22645a != null) {
                    obj = objMo22645a;
                }
            }
        }
        return obj;
    }

    /* renamed from: k */
    public final a m3004k() {
        return new a(this);
    }

    /* renamed from: l */
    public final Pair m3005l(C10286p c10286p, C11634n c11634n, InterfaceC5470e interfaceC5470e, int i10) {
        int size = m2998e().size();
        while (i10 < size) {
            InterfaceC5461a interfaceC5461aMo3063a = ((InterfaceC5461a.a) m2998e().get(i10)).mo3063a(c10286p, c11634n, interfaceC5470e);
            if (interfaceC5461aMo3063a != null) {
                return AbstractC10776g.m22975a(interfaceC5461aMo3063a, Integer.valueOf(i10));
            }
            i10++;
        }
        return null;
    }

    /* renamed from: m */
    public final Pair m3006m(Object obj, C11634n c11634n, InterfaceC5470e interfaceC5470e, int i10) {
        int size = m2999f().size();
        while (i10 < size) {
            Pair pair = (Pair) m2999f().get(i10);
            InterfaceC10281k.a aVar = (InterfaceC10281k.a) pair.m20048a();
            if (((InterfaceC10469c) pair.m20049c()).mo20275d(obj)) {
                AbstractC9979u.m20292e(aVar, "null cannot be cast to non-null type coil3.fetch.Fetcher.Factory<kotlin.Any>");
                InterfaceC10281k interfaceC10281kMo3225a = aVar.mo3225a(obj, c11634n, interfaceC5470e);
                if (interfaceC10281kMo3225a != null) {
                    return AbstractC10776g.m22975a(interfaceC10281kMo3225a, Integer.valueOf(i10));
                }
            }
            i10++;
        }
        return null;
    }

    public C5452a(List list, List list2, List list3, List list4, List list5) {
        this.f3573a = list;
        this.f3574b = list2;
        this.f3575c = list3;
        this.f3576d = list4;
        this.f3577e = list5;
        this.f3578f = AbstractC9923a.m20068a(new InterfaceC9529a() { // from class: k.b
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return C5452a.m2997d(this.f22913c);
            }
        });
        this.f3579g = AbstractC9923a.m20068a(new InterfaceC9529a() { // from class: k.c
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return C5452a.m2996c(this.f22914c);
            }
        });
    }

    public C5452a() {
        this(AbstractC10978w.m24136n(), AbstractC10978w.m24136n(), AbstractC10978w.m24136n(), AbstractC10978w.m24136n(), AbstractC10978w.m24136n());
    }
}
