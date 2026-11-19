package p162v1;

import android.database.Cursor;
import androidx.room.AbstractC0621h0;
import java.util.Collections;
import java.util.List;
import org.android.agoo.common.AgooConstants;
import p136p0.AbstractC2989f;
import p136p0.AbstractC2990g;
import p136p0.C2994k;
import p144r0.C3020b;
import p144r0.C3021c;
import p149s0.InterfaceC3375f;

/* renamed from: v1.d */
/* loaded from: classes.dex */
public final class C3421d implements InterfaceC3420c {

    /* renamed from: a */
    private final AbstractC0621h0 f11995a;

    /* renamed from: b */
    private final AbstractC2990g<C3419b> f11996b;

    /* renamed from: c */
    private final C3418a f11997c = new C3418a();

    /* renamed from: d */
    private final AbstractC2989f<C3419b> f11998d;

    /* renamed from: e */
    private final AbstractC2989f<C3419b> f11999e;

    /* renamed from: v1.d$a */
    class a extends AbstractC2990g<C3419b> {
        a(AbstractC0621h0 abstractC0621h0) {
            super(abstractC0621h0);
        }

        @Override // p136p0.AbstractC2995l
        /* renamed from: d */
        public String mo8256d() {
            return "INSERT OR REPLACE INTO `download` (`id`,`downloadUrl`,`localPath`,`totalSize`,`downloadSize`,`verifyCode`,`flag`) VALUES (nullif(?, 0),?,?,?,?,?,?)";
        }

        @Override // p136p0.AbstractC2990g
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public void mo8257g(InterfaceC3375f interfaceC3375f, C3419b c3419b) {
            interfaceC3375f.mo3491w(1, c3419b.m10424f());
            if (c3419b.m10422d() == null) {
                interfaceC3375f.mo3489k(2);
            } else {
                interfaceC3375f.mo3488c(2, c3419b.m10422d());
            }
            if (c3419b.m10425g() == null) {
                interfaceC3375f.mo3489k(3);
            } else {
                interfaceC3375f.mo3488c(3, c3419b.m10425g());
            }
            interfaceC3375f.mo3491w(4, c3419b.m10426h());
            interfaceC3375f.mo3491w(5, c3419b.m10421c());
            if (c3419b.m10427i() == null) {
                interfaceC3375f.mo3489k(6);
            } else {
                interfaceC3375f.mo3488c(6, c3419b.m10427i());
            }
            interfaceC3375f.mo3491w(7, C3421d.this.f11997c.m10417a(c3419b.m10423e()));
        }
    }

    /* renamed from: v1.d$b */
    class b extends AbstractC2989f<C3419b> {
        b(AbstractC0621h0 abstractC0621h0) {
            super(abstractC0621h0);
        }

        @Override // p136p0.AbstractC2995l
        /* renamed from: d */
        public String mo8256d() {
            return "DELETE FROM `download` WHERE `id` = ?";
        }

        @Override // p136p0.AbstractC2989f
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void mo10081g(InterfaceC3375f interfaceC3375f, C3419b c3419b) {
            interfaceC3375f.mo3491w(1, c3419b.m10424f());
        }
    }

    /* renamed from: v1.d$c */
    class c extends AbstractC2989f<C3419b> {
        c(AbstractC0621h0 abstractC0621h0) {
            super(abstractC0621h0);
        }

        @Override // p136p0.AbstractC2995l
        /* renamed from: d */
        public String mo8256d() {
            return "UPDATE OR ABORT `download` SET `id` = ?,`downloadUrl` = ?,`localPath` = ?,`totalSize` = ?,`downloadSize` = ?,`verifyCode` = ?,`flag` = ? WHERE `id` = ?";
        }

        @Override // p136p0.AbstractC2989f
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void mo10081g(InterfaceC3375f interfaceC3375f, C3419b c3419b) {
            interfaceC3375f.mo3491w(1, c3419b.m10424f());
            if (c3419b.m10422d() == null) {
                interfaceC3375f.mo3489k(2);
            } else {
                interfaceC3375f.mo3488c(2, c3419b.m10422d());
            }
            if (c3419b.m10425g() == null) {
                interfaceC3375f.mo3489k(3);
            } else {
                interfaceC3375f.mo3488c(3, c3419b.m10425g());
            }
            interfaceC3375f.mo3491w(4, c3419b.m10426h());
            interfaceC3375f.mo3491w(5, c3419b.m10421c());
            if (c3419b.m10427i() == null) {
                interfaceC3375f.mo3489k(6);
            } else {
                interfaceC3375f.mo3488c(6, c3419b.m10427i());
            }
            interfaceC3375f.mo3491w(7, C3421d.this.f11997c.m10417a(c3419b.m10423e()));
            interfaceC3375f.mo3491w(8, c3419b.m10424f());
        }
    }

    public C3421d(AbstractC0621h0 abstractC0621h0) {
        this.f11995a = abstractC0621h0;
        this.f11996b = new a(abstractC0621h0);
        this.f11998d = new b(abstractC0621h0);
        this.f11999e = new c(abstractC0621h0);
    }

    /* renamed from: e */
    public static List<Class<?>> m10436e() {
        return Collections.emptyList();
    }

    @Override // p162v1.InterfaceC3420c
    /* renamed from: a */
    public void mo10432a(C3419b c3419b) {
        this.f11995a.m3541d();
        this.f11995a.m3542e();
        try {
            this.f11999e.m10082h(c3419b);
            this.f11995a.m3539A();
        } finally {
            this.f11995a.m3546i();
        }
    }

    @Override // p162v1.InterfaceC3420c
    /* renamed from: b */
    public long mo10433b(C3419b c3419b) {
        this.f11995a.m3541d();
        this.f11995a.m3542e();
        try {
            long jM10084i = this.f11996b.m10084i(c3419b);
            this.f11995a.m3539A();
            return jM10084i;
        } finally {
            this.f11995a.m3546i();
        }
    }

    @Override // p162v1.InterfaceC3420c
    /* renamed from: c */
    public C3419b mo10434c(String str, String str2) {
        C2994k c2994kM10086d = C2994k.m10086d("select * from download where downloadUrl = ? AND localPath = ?", 2);
        if (str == null) {
            c2994kM10086d.mo3489k(1);
        } else {
            c2994kM10086d.mo3488c(1, str);
        }
        if (str2 == null) {
            c2994kM10086d.mo3489k(2);
        } else {
            c2994kM10086d.mo3488c(2, str2);
        }
        this.f11995a.m3541d();
        C3419b c3419b = null;
        Cursor cursorM10145b = C3021c.m10145b(this.f11995a, c2994kM10086d, false, null);
        try {
            int iM10143e = C3020b.m10143e(cursorM10145b, "id");
            int iM10143e2 = C3020b.m10143e(cursorM10145b, "downloadUrl");
            int iM10143e3 = C3020b.m10143e(cursorM10145b, "localPath");
            int iM10143e4 = C3020b.m10143e(cursorM10145b, "totalSize");
            int iM10143e5 = C3020b.m10143e(cursorM10145b, "downloadSize");
            int iM10143e6 = C3020b.m10143e(cursorM10145b, "verifyCode");
            int iM10143e7 = C3020b.m10143e(cursorM10145b, AgooConstants.MESSAGE_FLAG);
            if (cursorM10145b.moveToFirst()) {
                c3419b = new C3419b(cursorM10145b.getInt(iM10143e), cursorM10145b.getString(iM10143e2), cursorM10145b.getString(iM10143e3), cursorM10145b.getLong(iM10143e4), cursorM10145b.getLong(iM10143e5), cursorM10145b.getString(iM10143e6), this.f11997c.m10418b(cursorM10145b.getInt(iM10143e7)));
            }
            return c3419b;
        } finally {
            cursorM10145b.close();
            c2994kM10086d.m10091o();
        }
    }
}
