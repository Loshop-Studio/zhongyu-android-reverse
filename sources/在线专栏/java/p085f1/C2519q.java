package p085f1;

import androidx.room.AbstractC0621h0;
import androidx.work.C0810a;
import p136p0.AbstractC2990g;
import p136p0.AbstractC2995l;
import p149s0.InterfaceC3375f;

/* renamed from: f1.q */
/* loaded from: classes.dex */
public final class C2519q implements InterfaceC2518p {

    /* renamed from: a */
    private final AbstractC0621h0 f10156a;

    /* renamed from: b */
    private final AbstractC2990g<C2517o> f10157b;

    /* renamed from: c */
    private final AbstractC2995l f10158c;

    /* renamed from: d */
    private final AbstractC2995l f10159d;

    /* renamed from: f1.q$a */
    class a extends AbstractC2990g<C2517o> {
        a(AbstractC0621h0 abstractC0621h0) {
            super(abstractC0621h0);
        }

        @Override // p136p0.AbstractC2995l
        /* renamed from: d */
        public String mo8256d() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }

        @Override // p136p0.AbstractC2990g
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public void mo8257g(InterfaceC3375f interfaceC3375f, C2517o c2517o) throws Throwable {
            String str = c2517o.f10154a;
            if (str == null) {
                interfaceC3375f.mo3489k(1);
            } else {
                interfaceC3375f.mo3488c(1, str);
            }
            byte[] bArrM4149m = C0810a.m4149m(c2517o.f10155b);
            if (bArrM4149m == null) {
                interfaceC3375f.mo3489k(2);
            } else {
                interfaceC3375f.mo3486C(2, bArrM4149m);
            }
        }
    }

    /* renamed from: f1.q$b */
    class b extends AbstractC2995l {
        b(AbstractC0621h0 abstractC0621h0) {
            super(abstractC0621h0);
        }

        @Override // p136p0.AbstractC2995l
        /* renamed from: d */
        public String mo8256d() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    /* renamed from: f1.q$c */
    class c extends AbstractC2995l {
        c(AbstractC0621h0 abstractC0621h0) {
            super(abstractC0621h0);
        }

        @Override // p136p0.AbstractC2995l
        /* renamed from: d */
        public String mo8256d() {
            return "DELETE FROM WorkProgress";
        }
    }

    public C2519q(AbstractC0621h0 abstractC0621h0) {
        this.f10156a = abstractC0621h0;
        this.f10157b = new a(abstractC0621h0);
        this.f10158c = new b(abstractC0621h0);
        this.f10159d = new c(abstractC0621h0);
    }

    @Override // p085f1.InterfaceC2518p
    /* renamed from: a */
    public void mo8443a(String str) {
        this.f10156a.m3541d();
        InterfaceC3375f interfaceC3375fM10094a = this.f10158c.m10094a();
        if (str == null) {
            interfaceC3375fM10094a.mo3489k(1);
        } else {
            interfaceC3375fM10094a.mo3488c(1, str);
        }
        this.f10156a.m3542e();
        try {
            interfaceC3375fM10094a.mo3521i();
            this.f10156a.m3539A();
        } finally {
            this.f10156a.m3546i();
            this.f10158c.m10096f(interfaceC3375fM10094a);
        }
    }

    @Override // p085f1.InterfaceC2518p
    /* renamed from: b */
    public void mo8444b(C2517o c2517o) {
        this.f10156a.m3541d();
        this.f10156a.m3542e();
        try {
            this.f10157b.m10083h(c2517o);
            this.f10156a.m3539A();
        } finally {
            this.f10156a.m3546i();
        }
    }

    @Override // p085f1.InterfaceC2518p
    /* renamed from: c */
    public void mo8445c() {
        this.f10156a.m3541d();
        InterfaceC3375f interfaceC3375fM10094a = this.f10159d.m10094a();
        this.f10156a.m3542e();
        try {
            interfaceC3375fM10094a.mo3521i();
            this.f10156a.m3539A();
        } finally {
            this.f10156a.m3546i();
            this.f10159d.m10096f(interfaceC3375fM10094a);
        }
    }
}
