package p085f1;

import android.database.Cursor;
import androidx.room.AbstractC0621h0;
import java.util.ArrayList;
import java.util.List;
import p136p0.AbstractC2990g;
import p136p0.AbstractC2995l;
import p136p0.C2994k;
import p144r0.C3020b;
import p144r0.C3021c;
import p149s0.InterfaceC3375f;

/* renamed from: f1.k */
/* loaded from: classes.dex */
public final class C2513k implements InterfaceC2512j {

    /* renamed from: a */
    private final AbstractC0621h0 f10144a;

    /* renamed from: b */
    private final AbstractC2990g<C2511i> f10145b;

    /* renamed from: c */
    private final AbstractC2995l f10146c;

    /* renamed from: f1.k$a */
    class a extends AbstractC2990g<C2511i> {
        a(AbstractC0621h0 abstractC0621h0) {
            super(abstractC0621h0);
        }

        @Override // p136p0.AbstractC2995l
        /* renamed from: d */
        public String mo8256d() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)";
        }

        @Override // p136p0.AbstractC2990g
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public void mo8257g(InterfaceC3375f interfaceC3375f, C2511i c2511i) {
            String str = c2511i.f10142a;
            if (str == null) {
                interfaceC3375f.mo3489k(1);
            } else {
                interfaceC3375f.mo3488c(1, str);
            }
            interfaceC3375f.mo3491w(2, c2511i.f10143b);
        }
    }

    /* renamed from: f1.k$b */
    class b extends AbstractC2995l {
        b(AbstractC0621h0 abstractC0621h0) {
            super(abstractC0621h0);
        }

        @Override // p136p0.AbstractC2995l
        /* renamed from: d */
        public String mo8256d() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public C2513k(AbstractC0621h0 abstractC0621h0) {
        this.f10144a = abstractC0621h0;
        this.f10145b = new a(abstractC0621h0);
        this.f10146c = new b(abstractC0621h0);
    }

    @Override // p085f1.InterfaceC2512j
    /* renamed from: a */
    public void mo8435a(C2511i c2511i) {
        this.f10144a.m3541d();
        this.f10144a.m3542e();
        try {
            this.f10145b.m10083h(c2511i);
            this.f10144a.m3539A();
        } finally {
            this.f10144a.m3546i();
        }
    }

    @Override // p085f1.InterfaceC2512j
    /* renamed from: b */
    public List<String> mo8436b() {
        C2994k c2994kM10086d = C2994k.m10086d("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        this.f10144a.m3541d();
        Cursor cursorM10145b = C3021c.m10145b(this.f10144a, c2994kM10086d, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorM10145b.getCount());
            while (cursorM10145b.moveToNext()) {
                arrayList.add(cursorM10145b.getString(0));
            }
            return arrayList;
        } finally {
            cursorM10145b.close();
            c2994kM10086d.m10091o();
        }
    }

    @Override // p085f1.InterfaceC2512j
    /* renamed from: c */
    public C2511i mo8437c(String str) {
        C2994k c2994kM10086d = C2994k.m10086d("SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?", 1);
        if (str == null) {
            c2994kM10086d.mo3489k(1);
        } else {
            c2994kM10086d.mo3488c(1, str);
        }
        this.f10144a.m3541d();
        Cursor cursorM10145b = C3021c.m10145b(this.f10144a, c2994kM10086d, false, null);
        try {
            return cursorM10145b.moveToFirst() ? new C2511i(cursorM10145b.getString(C3020b.m10143e(cursorM10145b, "work_spec_id")), cursorM10145b.getInt(C3020b.m10143e(cursorM10145b, "system_id"))) : null;
        } finally {
            cursorM10145b.close();
            c2994kM10086d.m10091o();
        }
    }

    @Override // p085f1.InterfaceC2512j
    /* renamed from: d */
    public void mo8438d(String str) {
        this.f10144a.m3541d();
        InterfaceC3375f interfaceC3375fM10094a = this.f10146c.m10094a();
        if (str == null) {
            interfaceC3375fM10094a.mo3489k(1);
        } else {
            interfaceC3375fM10094a.mo3488c(1, str);
        }
        this.f10144a.m3542e();
        try {
            interfaceC3375fM10094a.mo3521i();
            this.f10144a.m3539A();
        } finally {
            this.f10144a.m3546i();
            this.f10146c.m10096f(interfaceC3375fM10094a);
        }
    }
}
