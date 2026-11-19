package p229s1;

import com.liulishuo.okdownload.C6327a;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p218r1.AbstractC8999c;
import p262v1.C9660g;

/* renamed from: s1.c */
/* loaded from: classes4.dex */
public class C9126c {

    /* renamed from: a */
    public final int f15837a;

    /* renamed from: b */
    public final String f15838b;

    /* renamed from: c */
    public String f15839c;

    /* renamed from: d */
    public final File f15840d;

    /* renamed from: e */
    public File f15841e;

    /* renamed from: f */
    public final C9660g.a f15842f;

    /* renamed from: g */
    public final List f15843g = new ArrayList();

    /* renamed from: h */
    public final boolean f15844h;

    /* renamed from: i */
    public boolean f15845i;

    public C9126c(int i10, String str, File file, String str2) {
        this.f15837a = i10;
        this.f15838b = str;
        this.f15840d = file;
        if (AbstractC8999c.m15132p(str2)) {
            this.f15842f = new C9660g.a();
            this.f15844h = true;
        } else {
            this.f15842f = new C9660g.a(str2);
            this.f15844h = false;
            this.f15841e = new File(file, str2);
        }
    }

    /* renamed from: a */
    public void m15466a(C9124a c9124a) {
        this.f15843g.add(c9124a);
    }

    /* renamed from: b */
    public C9126c m15467b() {
        C9126c c9126c = new C9126c(this.f15837a, this.f15838b, this.f15840d, this.f15842f.m16150a(), this.f15844h);
        c9126c.f15845i = this.f15845i;
        Iterator it = this.f15843g.iterator();
        while (it.hasNext()) {
            c9126c.f15843g.add(((C9124a) it.next()).m15456a());
        }
        return c9126c;
    }

    /* renamed from: c */
    public C9124a m15468c(int i10) {
        return (C9124a) this.f15843g.get(i10);
    }

    /* renamed from: d */
    public int m15469d() {
        return this.f15843g.size();
    }

    /* renamed from: e */
    public String m15470e() {
        return this.f15839c;
    }

    /* renamed from: f */
    public File m15471f() {
        String strM16150a = this.f15842f.m16150a();
        if (strM16150a == null) {
            return null;
        }
        if (this.f15841e == null) {
            this.f15841e = new File(this.f15840d, strM16150a);
        }
        return this.f15841e;
    }

    /* renamed from: g */
    public String m15472g() {
        return this.f15842f.m16150a();
    }

    /* renamed from: h */
    public C9660g.a m15473h() {
        return this.f15842f;
    }

    /* renamed from: i */
    public int m15474i() {
        return this.f15837a;
    }

    /* renamed from: j */
    public long m15475j() {
        if (m15478m()) {
            return m15476k();
        }
        Object[] array = this.f15843g.toArray();
        long jM15457b = 0;
        if (array != null) {
            for (Object obj : array) {
                if (obj instanceof C9124a) {
                    jM15457b += ((C9124a) obj).m15457b();
                }
            }
        }
        return jM15457b;
    }

    /* renamed from: k */
    public long m15476k() {
        Object[] array = this.f15843g.toArray();
        long jM15458c = 0;
        if (array != null) {
            for (Object obj : array) {
                if (obj instanceof C9124a) {
                    jM15458c += ((C9124a) obj).m15458c();
                }
            }
        }
        return jM15458c;
    }

    /* renamed from: l */
    public String m15477l() {
        return this.f15838b;
    }

    /* renamed from: m */
    public boolean m15478m() {
        return this.f15845i;
    }

    /* renamed from: n */
    public boolean m15479n(C6327a c6327a) {
        if (!this.f15840d.equals(c6327a.mo4386d()) || !this.f15838b.equals(c6327a.mo4388f())) {
            return false;
        }
        String strMo4384b = c6327a.mo4384b();
        if (strMo4384b != null && strMo4384b.equals(this.f15842f.m16150a())) {
            return true;
        }
        if (this.f15844h && c6327a.m4377C()) {
            return strMo4384b == null || strMo4384b.equals(this.f15842f.m16150a());
        }
        return false;
    }

    /* renamed from: o */
    public boolean m15480o() {
        return this.f15844h;
    }

    /* renamed from: p */
    public void m15481p() {
        this.f15843g.clear();
    }

    /* renamed from: q */
    public void m15482q(C9126c c9126c) {
        this.f15843g.clear();
        this.f15843g.addAll(c9126c.f15843g);
    }

    /* renamed from: r */
    public void m15483r(boolean z9) {
        this.f15845i = z9;
    }

    /* renamed from: s */
    public void m15484s(String str) {
        this.f15839c = str;
    }

    public String toString() {
        return "id[" + this.f15837a + "] url[" + this.f15838b + "] etag[" + this.f15839c + "] taskOnlyProvidedParentPath[" + this.f15844h + "] parent path[" + this.f15840d + "] filename[" + this.f15842f.m16150a() + "] block(s):" + this.f15843g.toString();
    }

    public C9126c(int i10, String str, File file, String str2, boolean z9) {
        this.f15837a = i10;
        this.f15838b = str;
        this.f15840d = file;
        if (AbstractC8999c.m15132p(str2)) {
            this.f15842f = new C9660g.a();
        } else {
            this.f15842f = new C9660g.a(str2);
        }
        this.f15844h = z9;
    }
}
