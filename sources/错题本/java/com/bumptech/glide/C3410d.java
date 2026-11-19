package com.bumptech.glide;

import android.support.v4.media.C0039h;
import androidx.core.util.Pools;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.C5834o;
import p055f0.C5513r;
import p055f0.C5514s;
import p055f0.C5517v;
import p055f0.C5519x;
import p055f0.InterfaceC5511p;
import p055f0.InterfaceC5512q;
import p120n0.C6208b;
import p120n0.InterfaceC6207a;
import p141q0.C6406a;
import p141q0.C6407b;
import p141q0.C6408c;
import p141q0.C6409d;
import p187w0.C6693a;
import p187w0.C6694b;
import p187w0.C6696d;
import p202y.InterfaceC6758a;
import p202y.InterfaceC6764g;
import p202y.InterfaceC6765h;
import p208z.C6803h;
import p208z.InterfaceC6801f;

/* renamed from: com.bumptech.glide.d */
/* loaded from: classes2.dex */
public final class C3410d {

    /* renamed from: a */
    public final C5514s f2217a;

    /* renamed from: b */
    public final C5834o f2218b;

    /* renamed from: c */
    public final C0039h f2219c;

    /* renamed from: d */
    public final C5834o f2220d;

    /* renamed from: e */
    public final C6803h f2221e;

    /* renamed from: f */
    public final C5834o f2222f;

    /* renamed from: g */
    public final C5834o f2223g;

    /* renamed from: h */
    public final C0039h f2224h = new C0039h(23);

    /* renamed from: i */
    public final C6407b f2225i = new C6407b();

    /* renamed from: j */
    public final C6696d f2226j;

    public C3410d() {
        C6696d c6696d = new C6696d(new Pools.SynchronizedPool(20), new C6693a(), new C6694b());
        this.f2226j = c6696d;
        this.f2217a = new C5514s(c6696d);
        this.f2218b = new C5834o(3, false);
        C0039h c0039h = new C0039h(24);
        this.f2219c = c0039h;
        this.f2220d = new C5834o(5, false);
        this.f2221e = new C6803h();
        this.f2222f = new C5834o(1, false);
        this.f2223g = new C5834o(4, false);
        List listAsList = Arrays.asList("Gif", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(listAsList.size());
        arrayList.addAll(listAsList);
        int i = 0;
        arrayList.add(0, "legacy_prepend_all");
        arrayList.add("legacy_append");
        synchronized (c0039h) {
            try {
                ArrayList arrayList2 = new ArrayList((ArrayList) c0039h.f96b);
                ((ArrayList) c0039h.f96b).clear();
                int size = arrayList.size();
                int i8 = 0;
                while (i8 < size) {
                    Object obj = arrayList.get(i8);
                    i8++;
                    ((ArrayList) c0039h.f96b).add((String) obj);
                }
                int size2 = arrayList2.size();
                while (i < size2) {
                    Object obj2 = arrayList2.get(i);
                    i++;
                    String str = (String) obj2;
                    if (!arrayList.contains(str)) {
                        ((ArrayList) c0039h.f96b).add(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    public final void m2365a(Class cls, Class cls2, InterfaceC5512q interfaceC5512q) {
        C5514s c5514s = this.f2217a;
        synchronized (c5514s) {
            C5519x c5519x = c5514s.f8533a;
            synchronized (c5519x) {
                try {
                    C5517v c5517v = new C5517v(cls, cls2, interfaceC5512q);
                    ArrayList arrayList = c5519x.f8549a;
                    arrayList.add(arrayList.size(), c5517v);
                } catch (Throwable th) {
                    throw th;
                }
            }
            c5514s.f8534b.f1399a.clear();
        }
    }

    /* renamed from: b */
    public final void m2366b(Class cls, InterfaceC6758a interfaceC6758a) {
        C5834o c5834o = this.f2218b;
        synchronized (c5834o) {
            c5834o.f9224a.add(new C6406a(cls, interfaceC6758a));
        }
    }

    /* renamed from: c */
    public final void m2367c(Class cls, InterfaceC6765h interfaceC6765h) {
        C5834o c5834o = this.f2220d;
        synchronized (c5834o) {
            c5834o.f9224a.add(new C6409d(cls, interfaceC6765h));
        }
    }

    /* renamed from: d */
    public final void m2368d(String str, Class cls, Class cls2, InterfaceC6764g interfaceC6764g) {
        C0039h c0039h = this.f2219c;
        synchronized (c0039h) {
            c0039h.m129x(str).add(new C6408c(cls, cls2, interfaceC6764g));
        }
    }

    /* renamed from: e */
    public final ArrayList m2369e() {
        ArrayList arrayList;
        C5834o c5834o = this.f2223g;
        synchronized (c5834o) {
            arrayList = c5834o.f9224a;
        }
        if (arrayList.isEmpty()) {
            throw new Registry$MissingComponentException() { // from class: com.bumptech.glide.Registry$NoImageHeaderParserException
            };
        }
        return arrayList;
    }

    /* renamed from: f */
    public final List m2370f(Object obj) {
        List listUnmodifiableList;
        C5514s c5514s = this.f2217a;
        c5514s.getClass();
        Class<?> cls = obj.getClass();
        synchronized (c5514s) {
            C5513r c5513r = (C5513r) c5514s.f8534b.f1399a.get(cls);
            listUnmodifiableList = c5513r == null ? null : c5513r.f8532a;
            if (listUnmodifiableList == null) {
                listUnmodifiableList = Collections.unmodifiableList(c5514s.f8533a.m4890b(cls));
                if (((C5513r) c5514s.f8534b.f1399a.put(cls, new C5513r(listUnmodifiableList))) != null) {
                    throw new IllegalStateException("Already cached loaders for model: " + cls);
                }
            }
        }
        if (listUnmodifiableList.isEmpty()) {
            throw new Registry$NoModelLoaderAvailableException(obj);
        }
        int size = listUnmodifiableList.size();
        List arrayList = Collections.EMPTY_LIST;
        boolean z8 = true;
        for (int i = 0; i < size; i++) {
            InterfaceC5511p interfaceC5511p = (InterfaceC5511p) listUnmodifiableList.get(i);
            if (interfaceC5511p.mo4873a(obj)) {
                if (z8) {
                    arrayList = new ArrayList(size - i);
                    z8 = false;
                }
                arrayList.add(interfaceC5511p);
            }
        }
        if (arrayList.isEmpty()) {
            throw new Registry$NoModelLoaderAvailableException(obj, (List<InterfaceC5511p>) listUnmodifiableList);
        }
        return arrayList;
    }

    /* renamed from: g */
    public final void m2371g(Class cls, Class cls2, InterfaceC6207a interfaceC6207a) {
        C5834o c5834o = this.f2222f;
        synchronized (c5834o) {
            c5834o.f9224a.add(new C6208b(cls, cls2, interfaceC6207a));
        }
    }

    /* renamed from: h */
    public final void m2372h(InterfaceC6801f interfaceC6801f) {
        C6803h c6803h = this.f2221e;
        synchronized (c6803h) {
            ((HashMap) c6803h.f11475b).put(interfaceC6801f.mo5091b(), interfaceC6801f);
        }
    }
}
