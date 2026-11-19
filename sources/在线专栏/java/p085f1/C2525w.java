package p085f1;

import android.database.Cursor;
import androidx.room.AbstractC0621h0;
import java.util.ArrayList;
import java.util.List;
import p136p0.AbstractC2990g;
import p136p0.C2994k;
import p144r0.C3021c;
import p149s0.InterfaceC3375f;

/* renamed from: f1.w */
/* loaded from: classes.dex */
public final class C2525w implements InterfaceC2524v {

    /* renamed from: a */
    private final AbstractC0621h0 f10213a;

    /* renamed from: b */
    private final AbstractC2990g<C2523u> f10214b;

    /* renamed from: f1.w$a */
    class a extends AbstractC2990g<C2523u> {
        a(AbstractC0621h0 abstractC0621h0) {
            super(abstractC0621h0);
        }

        @Override // p136p0.AbstractC2995l
        /* renamed from: d */
        public String mo8256d() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // p136p0.AbstractC2990g
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public void mo8257g(InterfaceC3375f interfaceC3375f, C2523u c2523u) {
            String str = c2523u.f10211a;
            if (str == null) {
                interfaceC3375f.mo3489k(1);
            } else {
                interfaceC3375f.mo3488c(1, str);
            }
            String str2 = c2523u.f10212b;
            if (str2 == null) {
                interfaceC3375f.mo3489k(2);
            } else {
                interfaceC3375f.mo3488c(2, str2);
            }
        }
    }

    public C2525w(AbstractC0621h0 abstractC0621h0) {
        this.f10213a = abstractC0621h0;
        this.f10214b = new a(abstractC0621h0);
    }

    @Override // p085f1.InterfaceC2524v
    /* renamed from: a */
    public void mo8482a(C2523u c2523u) {
        this.f10213a.m3541d();
        this.f10213a.m3542e();
        try {
            this.f10214b.m10083h(c2523u);
            this.f10213a.m3539A();
        } finally {
            this.f10213a.m3546i();
        }
    }

    @Override // p085f1.InterfaceC2524v
    /* renamed from: b */
    public List<String> mo8483b(String str) {
        C2994k c2994kM10086d = C2994k.m10086d("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        if (str == null) {
            c2994kM10086d.mo3489k(1);
        } else {
            c2994kM10086d.mo3488c(1, str);
        }
        this.f10213a.m3541d();
        Cursor cursorM10145b = C3021c.m10145b(this.f10213a, c2994kM10086d, false, null);
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
}
