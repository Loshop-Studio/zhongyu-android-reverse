package p085f1;

import android.database.Cursor;
import androidx.room.AbstractC0621h0;
import p136p0.AbstractC2990g;
import p136p0.C2994k;
import p144r0.C3021c;
import p149s0.InterfaceC3375f;

/* renamed from: f1.f */
/* loaded from: classes.dex */
public final class C2508f implements InterfaceC2507e {

    /* renamed from: a */
    private final AbstractC0621h0 f10138a;

    /* renamed from: b */
    private final AbstractC2990g<C2506d> f10139b;

    /* renamed from: f1.f$a */
    class a extends AbstractC2990g<C2506d> {
        a(AbstractC0621h0 abstractC0621h0) {
            super(abstractC0621h0);
        }

        @Override // p136p0.AbstractC2995l
        /* renamed from: d */
        public String mo8256d() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }

        @Override // p136p0.AbstractC2990g
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public void mo8257g(InterfaceC3375f interfaceC3375f, C2506d c2506d) {
            String str = c2506d.f10136a;
            if (str == null) {
                interfaceC3375f.mo3489k(1);
            } else {
                interfaceC3375f.mo3488c(1, str);
            }
            Long l3 = c2506d.f10137b;
            if (l3 == null) {
                interfaceC3375f.mo3489k(2);
            } else {
                interfaceC3375f.mo3491w(2, l3.longValue());
            }
        }
    }

    public C2508f(AbstractC0621h0 abstractC0621h0) {
        this.f10138a = abstractC0621h0;
        this.f10139b = new a(abstractC0621h0);
    }

    @Override // p085f1.InterfaceC2507e
    /* renamed from: a */
    public Long mo8429a(String str) {
        C2994k c2994kM10086d = C2994k.m10086d("SELECT long_value FROM Preference where `key`=?", 1);
        if (str == null) {
            c2994kM10086d.mo3489k(1);
        } else {
            c2994kM10086d.mo3488c(1, str);
        }
        this.f10138a.m3541d();
        Long lValueOf = null;
        Cursor cursorM10145b = C3021c.m10145b(this.f10138a, c2994kM10086d, false, null);
        try {
            if (cursorM10145b.moveToFirst() && !cursorM10145b.isNull(0)) {
                lValueOf = Long.valueOf(cursorM10145b.getLong(0));
            }
            return lValueOf;
        } finally {
            cursorM10145b.close();
            c2994kM10086d.m10091o();
        }
    }

    @Override // p085f1.InterfaceC2507e
    /* renamed from: b */
    public void mo8430b(C2506d c2506d) {
        this.f10138a.m3541d();
        this.f10138a.m3542e();
        try {
            this.f10139b.m10083h(c2506d);
            this.f10138a.m3539A();
        } finally {
            this.f10138a.m3546i();
        }
    }
}
