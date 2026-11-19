package p229r1;

import com.liulishuo.okdownload.C6593a;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p219q1.AbstractC9353c;
import p259u1.C9665g;

/* renamed from: r1.c */
/* loaded from: classes4.dex */
public class C9419c {

    /* renamed from: a */
    public final int f16424a;

    /* renamed from: b */
    public final String f16425b;

    /* renamed from: c */
    public String f16426c;

    /* renamed from: d */
    public final File f16427d;

    /* renamed from: e */
    public File f16428e;

    /* renamed from: f */
    public final C9665g.a f16429f;

    /* renamed from: g */
    public final List f16430g = new ArrayList();

    /* renamed from: h */
    public final boolean f16431h;

    /* renamed from: i */
    public boolean f16432i;

    public C9419c(int i9, String str, File file, String str2) {
        this.f16424a = i9;
        this.f16425b = str;
        this.f16427d = file;
        if (AbstractC9353c.m15313p(str2)) {
            this.f16429f = new C9665g.a();
            this.f16431h = true;
        } else {
            this.f16429f = new C9665g.a(str2);
            this.f16431h = false;
            this.f16428e = new File(file, str2);
        }
    }

    /* renamed from: a */
    public void m15520a(C9417a c9417a) {
        this.f16430g.add(c9417a);
    }

    /* renamed from: b */
    public C9419c m15521b() {
        C9419c c9419c = new C9419c(this.f16424a, this.f16425b, this.f16427d, this.f16429f.m16111a(), this.f16431h);
        c9419c.f16432i = this.f16432i;
        Iterator it = this.f16430g.iterator();
        while (it.hasNext()) {
            c9419c.f16430g.add(((C9417a) it.next()).m15510a());
        }
        return c9419c;
    }

    /* renamed from: c */
    public C9417a m15522c(int i9) {
        return (C9417a) this.f16430g.get(i9);
    }

    /* renamed from: d */
    public int m15523d() {
        return this.f16430g.size();
    }

    /* renamed from: e */
    public String m15524e() {
        return this.f16426c;
    }

    /* renamed from: f */
    public File m15525f() {
        String strM16111a = this.f16429f.m16111a();
        if (strM16111a == null) {
            return null;
        }
        if (this.f16428e == null) {
            this.f16428e = new File(this.f16427d, strM16111a);
        }
        return this.f16428e;
    }

    /* renamed from: g */
    public String m15526g() {
        return this.f16429f.m16111a();
    }

    /* renamed from: h */
    public C9665g.a m15527h() {
        return this.f16429f;
    }

    /* renamed from: i */
    public int m15528i() {
        return this.f16424a;
    }

    /* renamed from: j */
    public long m15529j() {
        if (m15532m()) {
            return m15530k();
        }
        Object[] array = this.f16430g.toArray();
        long jM15511b = 0;
        if (array != null) {
            for (Object obj : array) {
                if (obj instanceof C9417a) {
                    jM15511b += ((C9417a) obj).m15511b();
                }
            }
        }
        return jM15511b;
    }

    /* renamed from: k */
    public long m15530k() {
        Object[] array = this.f16430g.toArray();
        long jM15512c = 0;
        if (array != null) {
            for (Object obj : array) {
                if (obj instanceof C9417a) {
                    jM15512c += ((C9417a) obj).m15512c();
                }
            }
        }
        return jM15512c;
    }

    /* renamed from: l */
    public String m15531l() {
        return this.f16425b;
    }

    /* renamed from: m */
    public boolean m15532m() {
        return this.f16432i;
    }

    /* renamed from: n */
    public boolean m15533n(C6593a c6593a) {
        if (!this.f16427d.equals(c6593a.mo4590d()) || !this.f16425b.equals(c6593a.mo4592f())) {
            return false;
        }
        String strMo4588b = c6593a.mo4588b();
        if (strMo4588b != null && strMo4588b.equals(this.f16429f.m16111a())) {
            return true;
        }
        if (this.f16431h && c6593a.m4581C()) {
            return strMo4588b == null || strMo4588b.equals(this.f16429f.m16111a());
        }
        return false;
    }

    /* renamed from: o */
    public boolean m15534o() {
        return this.f16431h;
    }

    /* renamed from: p */
    public void m15535p() {
        this.f16430g.clear();
    }

    /* renamed from: q */
    public void m15536q(C9419c c9419c) {
        this.f16430g.clear();
        this.f16430g.addAll(c9419c.f16430g);
    }

    /* renamed from: r */
    public void m15537r(boolean z9) {
        this.f16432i = z9;
    }

    /* renamed from: s */
    public void m15538s(String str) {
        this.f16426c = str;
    }

    public String toString() {
        return "id[" + this.f16424a + "] url[" + this.f16425b + "] etag[" + this.f16426c + "] taskOnlyProvidedParentPath[" + this.f16431h + "] parent path[" + this.f16427d + "] filename[" + this.f16429f.m16111a() + "] block(s):" + this.f16430g.toString();
    }

    public C9419c(int i9, String str, File file, String str2, boolean z9) {
        this.f16424a = i9;
        this.f16425b = str;
        this.f16427d = file;
        if (AbstractC9353c.m15313p(str2)) {
            this.f16429f = new C9665g.a();
        } else {
            this.f16429f = new C9665g.a(str2);
        }
        this.f16431h = z9;
    }
}
