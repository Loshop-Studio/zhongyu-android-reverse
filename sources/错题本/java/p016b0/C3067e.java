package p016b0;

import com.bumptech.glide.load.DataSource;
import java.io.File;
import java.util.List;
import p055f0.C5510o;
import p055f0.InterfaceC5511p;
import p202y.InterfaceC6760c;
import p208z.InterfaceC6799d;

/* renamed from: b0.e */
/* loaded from: classes2.dex */
public final class C3067e implements InterfaceC3075i, InterfaceC6799d {

    /* renamed from: a */
    public final List f1400a;

    /* renamed from: b */
    public final C3077j f1401b;

    /* renamed from: c */
    public final InterfaceC3073h f1402c;

    /* renamed from: d */
    public int f1403d = -1;

    /* renamed from: e */
    public InterfaceC6760c f1404e;

    /* renamed from: f */
    public List f1405f;

    /* renamed from: g */
    public int f1406g;

    /* renamed from: h */
    public volatile C5510o f1407h;

    /* renamed from: i */
    public File f1408i;

    public C3067e(List list, C3077j c3077j, InterfaceC3073h interfaceC3073h) {
        this.f1400a = list;
        this.f1401b = c3077j;
        this.f1402c = interfaceC3073h;
    }

    @Override // p208z.InterfaceC6799d
    /* renamed from: c */
    public final void mo109c(Exception exc) {
        this.f1402c.mo2023a(this.f1404e, exc, this.f1407h.f8531c, DataSource.DATA_DISK_CACHE);
    }

    @Override // p016b0.InterfaceC3075i
    public final void cancel() {
        C5510o c5510o = this.f1407h;
        if (c5510o != null) {
            c5510o.f8531c.cancel();
        }
    }

    @Override // p016b0.InterfaceC3075i
    /* renamed from: d */
    public final boolean mo2011d() {
        while (true) {
            List list = this.f1405f;
            boolean z8 = false;
            if (list != null && this.f1406g < list.size()) {
                this.f1407h = null;
                while (!z8 && this.f1406g < this.f1405f.size()) {
                    List list2 = this.f1405f;
                    int i = this.f1406g;
                    this.f1406g = i + 1;
                    InterfaceC5511p interfaceC5511p = (InterfaceC5511p) list2.get(i);
                    File file = this.f1408i;
                    C3077j c3077j = this.f1401b;
                    this.f1407h = interfaceC5511p.mo4874b(file, c3077j.f1446e, c3077j.f1447f, c3077j.f1450i);
                    if (this.f1407h != null && this.f1401b.m2027c(this.f1407h.f8531c.mo22b()) != null) {
                        this.f1407h.f8531c.mo24e(this.f1401b.f1456o, this);
                        z8 = true;
                    }
                }
                return z8;
            }
            int i8 = this.f1403d + 1;
            this.f1403d = i8;
            if (i8 >= this.f1400a.size()) {
                return false;
            }
            InterfaceC6760c interfaceC6760c = (InterfaceC6760c) this.f1400a.get(this.f1403d);
            C3077j c3077j2 = this.f1401b;
            File fileMo4793a = c3077j2.f1449h.m2053a().mo4793a(new C3069f(interfaceC6760c, c3077j2.f1455n));
            this.f1408i = fileMo4793a;
            if (fileMo4793a != null) {
                this.f1404e = interfaceC6760c;
                this.f1405f = this.f1401b.f1444c.f2209b.m2370f(fileMo4793a);
                this.f1406g = 0;
            }
        }
    }

    @Override // p208z.InterfaceC6799d
    /* renamed from: o */
    public final void mo121o(Object obj) {
        this.f1402c.mo2024b(this.f1404e, obj, this.f1407h.f8531c, DataSource.DATA_DISK_CACHE, this.f1404e);
    }
}
