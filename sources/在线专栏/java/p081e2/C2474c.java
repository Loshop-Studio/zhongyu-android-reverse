package p081e2;

import android.database.Cursor;
import androidx.room.AbstractC0621h0;
import java.util.Collections;
import java.util.List;
import p136p0.AbstractC2990g;
import p136p0.C2994k;
import p144r0.C3020b;
import p144r0.C3021c;
import p149s0.InterfaceC3375f;

/* renamed from: e2.c */
/* loaded from: classes.dex */
public final class C2474c implements InterfaceC2473b {

    /* renamed from: a */
    private final AbstractC0621h0 f10078a;

    /* renamed from: b */
    private final AbstractC2990g<C2472a> f10079b;

    /* renamed from: e2.c$a */
    class a extends AbstractC2990g<C2472a> {
        a(AbstractC0621h0 abstractC0621h0) {
            super(abstractC0621h0);
        }

        @Override // p136p0.AbstractC2995l
        /* renamed from: d */
        public String mo8256d() {
            return "INSERT OR REPLACE INTO `previewInfo` (`path`,`pageIndex`,`pageOffset`) VALUES (?,?,?)";
        }

        @Override // p136p0.AbstractC2990g
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public void mo8257g(InterfaceC3375f interfaceC3375f, C2472a c2472a) {
            if (c2472a.m8252c() == null) {
                interfaceC3375f.mo3489k(1);
            } else {
                interfaceC3375f.mo3488c(1, c2472a.m8252c());
            }
            interfaceC3375f.mo3491w(2, c2472a.m8250a());
            interfaceC3375f.mo3490l(3, c2472a.m8251b());
        }
    }

    public C2474c(AbstractC0621h0 abstractC0621h0) {
        this.f10078a = abstractC0621h0;
        this.f10079b = new a(abstractC0621h0);
    }

    /* renamed from: c */
    public static List<Class<?>> m8255c() {
        return Collections.emptyList();
    }

    @Override // p081e2.InterfaceC2473b
    /* renamed from: a */
    public C2472a mo8253a(String str) {
        C2994k c2994kM10086d = C2994k.m10086d("SELECT * FROM previewInfo WHERE path = ?", 1);
        if (str == null) {
            c2994kM10086d.mo3489k(1);
        } else {
            c2994kM10086d.mo3488c(1, str);
        }
        this.f10078a.m3541d();
        C2472a c2472a = null;
        String string = null;
        Cursor cursorM10145b = C3021c.m10145b(this.f10078a, c2994kM10086d, false, null);
        try {
            int iM10143e = C3020b.m10143e(cursorM10145b, "path");
            int iM10143e2 = C3020b.m10143e(cursorM10145b, "pageIndex");
            int iM10143e3 = C3020b.m10143e(cursorM10145b, "pageOffset");
            if (cursorM10145b.moveToFirst()) {
                if (!cursorM10145b.isNull(iM10143e)) {
                    string = cursorM10145b.getString(iM10143e);
                }
                c2472a = new C2472a(string, cursorM10145b.getInt(iM10143e2), cursorM10145b.getFloat(iM10143e3));
            }
            return c2472a;
        } finally {
            cursorM10145b.close();
            c2994kM10086d.m10091o();
        }
    }

    @Override // p081e2.InterfaceC2473b
    /* renamed from: b */
    public void mo8254b(C2472a c2472a) {
        this.f10078a.m3541d();
        this.f10078a.m3542e();
        try {
            this.f10079b.m10083h(c2472a);
            this.f10078a.m3539A();
        } finally {
            this.f10078a.m3546i();
        }
    }
}
