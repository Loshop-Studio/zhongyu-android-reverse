package p085f1;

import android.database.Cursor;
import androidx.room.AbstractC0621h0;
import java.util.ArrayList;
import java.util.List;
import p136p0.AbstractC2990g;
import p136p0.C2994k;
import p144r0.C3021c;
import p149s0.InterfaceC3375f;

/* renamed from: f1.c */
/* loaded from: classes.dex */
public final class C2505c implements InterfaceC2504b {

    /* renamed from: a */
    private final AbstractC0621h0 f10133a;

    /* renamed from: b */
    private final AbstractC2990g<C2503a> f10134b;

    /* renamed from: f1.c$a */
    class a extends AbstractC2990g<C2503a> {
        a(AbstractC0621h0 abstractC0621h0) {
            super(abstractC0621h0);
        }

        @Override // p136p0.AbstractC2995l
        /* renamed from: d */
        public String mo8256d() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }

        @Override // p136p0.AbstractC2990g
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public void mo8257g(InterfaceC3375f interfaceC3375f, C2503a c2503a) {
            String str = c2503a.f10131a;
            if (str == null) {
                interfaceC3375f.mo3489k(1);
            } else {
                interfaceC3375f.mo3488c(1, str);
            }
            String str2 = c2503a.f10132b;
            if (str2 == null) {
                interfaceC3375f.mo3489k(2);
            } else {
                interfaceC3375f.mo3488c(2, str2);
            }
        }
    }

    public C2505c(AbstractC0621h0 abstractC0621h0) {
        this.f10133a = abstractC0621h0;
        this.f10134b = new a(abstractC0621h0);
    }

    @Override // p085f1.InterfaceC2504b
    /* renamed from: a */
    public boolean mo8424a(String str) {
        C2994k c2994kM10086d = C2994k.m10086d("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if (str == null) {
            c2994kM10086d.mo3489k(1);
        } else {
            c2994kM10086d.mo3488c(1, str);
        }
        this.f10133a.m3541d();
        boolean z3 = false;
        Cursor cursorM10145b = C3021c.m10145b(this.f10133a, c2994kM10086d, false, null);
        try {
            if (cursorM10145b.moveToFirst()) {
                z3 = cursorM10145b.getInt(0) != 0;
            }
            return z3;
        } finally {
            cursorM10145b.close();
            c2994kM10086d.m10091o();
        }
    }

    @Override // p085f1.InterfaceC2504b
    /* renamed from: b */
    public boolean mo8425b(String str) {
        C2994k c2994kM10086d = C2994k.m10086d("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            c2994kM10086d.mo3489k(1);
        } else {
            c2994kM10086d.mo3488c(1, str);
        }
        this.f10133a.m3541d();
        boolean z3 = false;
        Cursor cursorM10145b = C3021c.m10145b(this.f10133a, c2994kM10086d, false, null);
        try {
            if (cursorM10145b.moveToFirst()) {
                z3 = cursorM10145b.getInt(0) != 0;
            }
            return z3;
        } finally {
            cursorM10145b.close();
            c2994kM10086d.m10091o();
        }
    }

    @Override // p085f1.InterfaceC2504b
    /* renamed from: c */
    public void mo8426c(C2503a c2503a) {
        this.f10133a.m3541d();
        this.f10133a.m3542e();
        try {
            this.f10134b.m10083h(c2503a);
            this.f10133a.m3539A();
        } finally {
            this.f10133a.m3546i();
        }
    }

    @Override // p085f1.InterfaceC2504b
    /* renamed from: d */
    public List<String> mo8427d(String str) {
        C2994k c2994kM10086d = C2994k.m10086d("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            c2994kM10086d.mo3489k(1);
        } else {
            c2994kM10086d.mo3488c(1, str);
        }
        this.f10133a.m3541d();
        Cursor cursorM10145b = C3021c.m10145b(this.f10133a, c2994kM10086d, false, null);
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
