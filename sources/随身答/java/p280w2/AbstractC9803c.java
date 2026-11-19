package p280w2;

import androidx.core.os.EnvironmentCompat;
import com.umeng.commonsdk.statistics.proto.C6790a;
import com.umeng.commonsdk.statistics.proto.C6791b;
import com.umeng.commonsdk.statistics.proto.C6792c;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: w2.c */
/* loaded from: classes4.dex */
public abstract class AbstractC9803c {

    /* renamed from: a */
    public final int f17458a = 10;

    /* renamed from: b */
    public final int f17459b = 100;

    /* renamed from: c */
    public final String f17460c;

    /* renamed from: d */
    public List f17461d;

    /* renamed from: e */
    public C6791b f17462e;

    public AbstractC9803c(String str) {
        this.f17460c = str;
    }

    /* renamed from: j */
    private boolean m16642j() {
        C6791b c6791b = this.f17462e;
        String strM6353u = c6791b == null ? null : c6791b.m6353u();
        int iM6358z = c6791b == null ? 0 : c6791b.m6358z();
        String strM16643a = m16643a(mo16651i());
        if (strM16643a == null || strM16643a.equals(strM6353u)) {
            return false;
        }
        if (c6791b == null) {
            c6791b = new C6791b();
        }
        c6791b.m6351q(strM16643a);
        c6791b.m6350n(System.currentTimeMillis());
        c6791b.m6349g(iM6358z + 1);
        C6790a c6790a = new C6790a();
        c6790a.m6327n(this.f17460c);
        c6790a.m6331v(strM16643a);
        c6790a.m6329t(strM6353u);
        c6790a.m6326g(c6791b.m6356x());
        if (this.f17461d == null) {
            this.f17461d = new ArrayList(2);
        }
        this.f17461d.add(c6790a);
        if (this.f17461d.size() > 10) {
            this.f17461d.remove(0);
        }
        this.f17462e = c6791b;
        return true;
    }

    /* renamed from: a */
    public String m16643a(String str) {
        if (str == null) {
            return null;
        }
        String strTrim = str.trim();
        if (strTrim.length() == 0 || "0".equals(strTrim) || EnvironmentCompat.MEDIA_UNKNOWN.equals(strTrim.toLowerCase(Locale.US))) {
            return null;
        }
        return strTrim;
    }

    /* renamed from: b */
    public void m16644b(C6792c c6792c) {
        this.f17462e = (C6791b) c6792c.m6374u().get(this.f17460c);
        List<C6790a> listM6376w = c6792c.m6376w();
        if (listM6376w == null || listM6376w.size() <= 0) {
            return;
        }
        if (this.f17461d == null) {
            this.f17461d = new ArrayList();
        }
        for (C6790a c6790a : listM6376w) {
            if (this.f17460c.equals(c6790a.f6892a)) {
                this.f17461d.add(c6790a);
            }
        }
    }

    /* renamed from: c */
    public void m16645c(List list) {
        this.f17461d = list;
    }

    /* renamed from: d */
    public boolean m16646d() {
        return m16642j();
    }

    /* renamed from: e */
    public String m16647e() {
        return this.f17460c;
    }

    /* renamed from: f */
    public boolean m16648f() {
        C6791b c6791b = this.f17462e;
        return c6791b == null || c6791b.m6358z() <= 100;
    }

    /* renamed from: g */
    public C6791b m16649g() {
        return this.f17462e;
    }

    /* renamed from: h */
    public List m16650h() {
        return this.f17461d;
    }

    /* renamed from: i */
    public abstract String mo16651i();
}
