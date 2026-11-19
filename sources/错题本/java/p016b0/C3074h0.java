package p016b0;

import android.support.v4.media.C0039h;
import androidx.collection.ArrayMap;
import com.bumptech.glide.C3410d;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.RunnableC3416b;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p055f0.C5510o;
import p055f0.C5514s;
import p055f0.InterfaceC5511p;
import p180v0.C6662i;
import p202y.InterfaceC6760c;
import p202y.InterfaceC6766i;
import p208z.InterfaceC6799d;

/* renamed from: b0.h0 */
/* loaded from: classes2.dex */
public final class C3074h0 implements InterfaceC3075i, InterfaceC6799d {

    /* renamed from: a */
    public final RunnableC3416b f1423a;

    /* renamed from: b */
    public final C3077j f1424b;

    /* renamed from: c */
    public int f1425c;

    /* renamed from: d */
    public int f1426d = -1;

    /* renamed from: e */
    public InterfaceC6760c f1427e;

    /* renamed from: f */
    public List f1428f;

    /* renamed from: g */
    public int f1429g;

    /* renamed from: h */
    public volatile C5510o f1430h;

    /* renamed from: i */
    public File f1431i;

    /* renamed from: j */
    public C3076i0 f1432j;

    public C3074h0(C3077j c3077j, RunnableC3416b runnableC3416b) {
        this.f1424b = c3077j;
        this.f1423a = runnableC3416b;
    }

    @Override // p208z.InterfaceC6799d
    /* renamed from: c */
    public final void mo109c(Exception exc) {
        this.f1423a.mo2023a(this.f1432j, exc, this.f1430h.f8531c, DataSource.RESOURCE_DISK_CACHE);
    }

    @Override // p016b0.InterfaceC3075i
    public final void cancel() {
        C5510o c5510o = this.f1430h;
        if (c5510o != null) {
            c5510o.f8531c.cancel();
        }
    }

    @Override // p016b0.InterfaceC3075i
    /* renamed from: d */
    public final boolean mo2011d() {
        List list;
        boolean z8;
        List list2;
        boolean z9;
        ArrayList arrayListM4891c;
        ArrayList arrayListM2025a = this.f1424b.m2025a();
        if (arrayListM2025a.isEmpty()) {
            return false;
        }
        C3077j c3077j = this.f1424b;
        C3410d c3410d = c3077j.f1444c.f2209b;
        Class<?> cls = c3077j.f1445d.getClass();
        Class cls2 = c3077j.f1448g;
        Class cls3 = c3077j.f1452k;
        C0039h c0039h = c3410d.f2224h;
        C6662i c6662i = (C6662i) ((AtomicReference) c0039h.f96b).getAndSet(null);
        if (c6662i == null) {
            c6662i = new C6662i(cls, cls2, cls3);
        } else {
            c6662i.f11239a = cls;
            c6662i.f11240b = cls2;
            c6662i.f11241c = cls3;
        }
        synchronized (((ArrayMap) c0039h.f97c)) {
            list = (List) ((ArrayMap) c0039h.f97c).get(c6662i);
        }
        ((AtomicReference) c0039h.f96b).set(c6662i);
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            C5514s c5514s = c3410d.f2217a;
            synchronized (c5514s) {
                arrayListM4891c = c5514s.f8533a.m4891c(cls);
            }
            int size = arrayListM4891c.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayListM4891c.get(i);
                i++;
                ArrayList arrayListM130y = c3410d.f2219c.m130y((Class) obj, cls2);
                int size2 = arrayListM130y.size();
                int i8 = 0;
                while (i8 < size2) {
                    Object obj2 = arrayListM130y.get(i8);
                    i8++;
                    Class cls4 = (Class) obj2;
                    if (!c3410d.f2222f.m5350h(cls4, cls3).isEmpty() && !arrayList.contains(cls4)) {
                        arrayList.add(cls4);
                    }
                }
            }
            z8 = false;
            C0039h c0039h2 = c3410d.f2224h;
            List listUnmodifiableList = Collections.unmodifiableList(arrayList);
            synchronized (((ArrayMap) c0039h2.f97c)) {
                ((ArrayMap) c0039h2.f97c).put(new C6662i(cls, cls2, cls3), listUnmodifiableList);
            }
            list2 = arrayList;
        } else {
            z8 = false;
            list2 = list;
        }
        if (list2.isEmpty()) {
            if (File.class.equals(this.f1424b.f1452k)) {
                return z8;
            }
            throw new IllegalStateException("Failed to find any load path from " + this.f1424b.f1445d.getClass() + " to " + this.f1424b.f1452k);
        }
        while (true) {
            List list3 = this.f1428f;
            if (list3 != null && this.f1429g < list3.size()) {
                this.f1430h = null;
                while (!z8 && this.f1429g < this.f1428f.size()) {
                    List list4 = this.f1428f;
                    int i9 = this.f1429g;
                    this.f1429g = i9 + 1;
                    InterfaceC5511p interfaceC5511p = (InterfaceC5511p) list4.get(i9);
                    File file = this.f1431i;
                    C3077j c3077j2 = this.f1424b;
                    this.f1430h = interfaceC5511p.mo4874b(file, c3077j2.f1446e, c3077j2.f1447f, c3077j2.f1450i);
                    if (this.f1430h != null && this.f1424b.m2027c(this.f1430h.f8531c.mo22b()) != null) {
                        this.f1430h.f8531c.mo24e(this.f1424b.f1456o, this);
                        z8 = true;
                    }
                }
                return z8;
            }
            int i10 = this.f1426d + 1;
            this.f1426d = i10;
            if (i10 >= list2.size()) {
                int i11 = this.f1425c + 1;
                this.f1425c = i11;
                if (i11 >= arrayListM2025a.size()) {
                    return z8;
                }
                this.f1426d = z8 ? 1 : 0;
            }
            InterfaceC6760c interfaceC6760c = (InterfaceC6760c) arrayListM2025a.get(this.f1425c);
            Class cls5 = (Class) list2.get(this.f1426d);
            InterfaceC6766i interfaceC6766iM2029e = this.f1424b.m2029e(cls5);
            C3077j c3077j3 = this.f1424b;
            this.f1432j = new C3076i0(c3077j3.f1444c.f2208a, interfaceC6760c, c3077j3.f1455n, c3077j3.f1446e, c3077j3.f1447f, interfaceC6766iM2029e, cls5, c3077j3.f1450i);
            File fileMo4793a = c3077j3.f1449h.m2053a().mo4793a(this.f1432j);
            this.f1431i = fileMo4793a;
            if (fileMo4793a != null) {
                this.f1427e = interfaceC6760c;
                this.f1428f = this.f1424b.f1444c.f2209b.m2370f(fileMo4793a);
                z9 = false;
                this.f1429g = 0;
            } else {
                z9 = false;
            }
            z8 = z9;
        }
    }

    @Override // p208z.InterfaceC6799d
    /* renamed from: o */
    public final void mo121o(Object obj) {
        this.f1423a.mo2024b(this.f1427e, obj, this.f1430h.f8531c, DataSource.RESOURCE_DISK_CACHE, this.f1432j);
    }
}
