package p016b0;

import com.bumptech.glide.load.engine.C3417c;
import com.zykj.mistake.feature.notebook.detail.C4916z4;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import okhttp3.C6330r;
import okhttp3.C6338z;
import okhttp3.InterfaceC6290d;
import p202y.InterfaceC6760c;
import retrofit2.AbstractC6499i0;
import retrofit2.C6484b;
import retrofit2.C6486c;
import retrofit2.C6513p0;
import retrofit2.ExecutorC6482a;

/* renamed from: b0.d */
/* loaded from: classes2.dex */
public final class C3065d {

    /* renamed from: a */
    public Object f1395a;

    /* renamed from: b */
    public Object f1396b;

    /* renamed from: c */
    public final Object f1397c;

    /* renamed from: d */
    public Object f1398d;

    public C3065d(int i) {
        switch (i) {
            case 1:
                this.f1397c = new ArrayList();
                this.f1398d = new ArrayList();
                break;
            default:
                ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new ThreadFactoryC3061b(0));
                this.f1396b = new HashMap();
                this.f1397c = new ReferenceQueue();
                this.f1395a = executorServiceNewSingleThreadExecutor;
                executorServiceNewSingleThreadExecutor.execute(new RunnableC3059a(this, 1));
                break;
        }
    }

    /* renamed from: a */
    public synchronized void m2007a(InterfaceC6760c interfaceC6760c, C3060a0 c3060a0) {
        C3063c c3063c = (C3063c) ((HashMap) this.f1396b).put(interfaceC6760c, new C3063c(interfaceC6760c, c3060a0, (ReferenceQueue) this.f1397c));
        if (c3063c != null) {
            c3063c.f1394c = null;
            c3063c.clear();
        }
    }

    /* renamed from: b */
    public void m2008b(String str) {
        Objects.requireNonNull(str, "baseUrl == null");
        C4916z4 c4916z4 = new C4916z4();
        c4916z4.m4288d(null, str);
        C6330r c6330rM4285a = c4916z4.m4285a();
        if ("".equals(c6330rM4285a.f10270f.get(r0.size() - 1))) {
            this.f1396b = c6330rM4285a;
        } else {
            throw new IllegalArgumentException("baseUrl must end in /: " + c6330rM4285a);
        }
    }

    /* renamed from: c */
    public C6513p0 m2009c() {
        ArrayList arrayList = (ArrayList) this.f1397c;
        if (((C6330r) this.f1396b) == null) {
            throw new IllegalStateException("Base URL required.");
        }
        InterfaceC6290d c6338z = (InterfaceC6290d) this.f1395a;
        if (c6338z == null) {
            c6338z = new C6338z();
        }
        InterfaceC6290d interfaceC6290d = c6338z;
        ExecutorC6482a executorC6482a = AbstractC6499i0.f10702a;
        C6484b c6484b = AbstractC6499i0.f10704c;
        ArrayList arrayList2 = new ArrayList((ArrayList) this.f1398d);
        List listMo6138a = c6484b.mo6138a(executorC6482a);
        arrayList2.addAll(listMo6138a);
        List listMo6139b = c6484b.mo6139b();
        ArrayList arrayList3 = new ArrayList(arrayList.size() + 1 + listMo6139b.size());
        arrayList3.add(new C6486c(0));
        arrayList3.addAll(arrayList);
        arrayList3.addAll(listMo6139b);
        C6330r c6330r = (C6330r) this.f1396b;
        List listUnmodifiableList = Collections.unmodifiableList(arrayList3);
        List listUnmodifiableList2 = Collections.unmodifiableList(arrayList2);
        listMo6138a.size();
        return new C6513p0(interfaceC6290d, c6330r, listUnmodifiableList, listUnmodifiableList2, executorC6482a);
    }

    /* renamed from: d */
    public void m2010d(C3063c c3063c) {
        InterfaceC3072g0 interfaceC3072g0;
        synchronized (this) {
            ((HashMap) this.f1396b).remove(c3063c.f1392a);
            if (c3063c.f1393b && (interfaceC3072g0 = c3063c.f1394c) != null) {
                ((C3417c) this.f1398d).m2411e(c3063c.f1392a, new C3060a0(interfaceC3072g0, true, false, c3063c.f1392a, (C3417c) this.f1398d));
            }
        }
    }
}
