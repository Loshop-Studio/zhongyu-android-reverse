package p055f0;

import com.bumptech.glide.Registry$NoModelLoaderAvailableException;
import java.util.ArrayList;
import java.util.HashSet;
import p187w0.C6696d;

/* renamed from: f0.x */
/* loaded from: classes2.dex */
public final class C5519x {

    /* renamed from: e */
    public static final C5518w f8547e = new C5518w();

    /* renamed from: f */
    public static final C5494b0 f8548f = new C5494b0(2);

    /* renamed from: d */
    public final C6696d f8552d;

    /* renamed from: a */
    public final ArrayList f8549a = new ArrayList();

    /* renamed from: c */
    public final HashSet f8551c = new HashSet();

    /* renamed from: b */
    public final C5518w f8550b = f8547e;

    public C5519x(C6696d c6696d) {
        this.f8552d = c6696d;
    }

    /* renamed from: a */
    public final synchronized InterfaceC5511p m4889a(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = this.f8549a;
            int size = arrayList2.size();
            boolean z8 = false;
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                C5517v c5517v = (C5517v) obj;
                if (this.f8551c.contains(c5517v)) {
                    z8 = true;
                } else if (c5517v.f8544a.isAssignableFrom(cls) && c5517v.f8545b.isAssignableFrom(cls2)) {
                    this.f8551c.add(c5517v);
                    arrayList.add(c5517v.f8546c.mo2140r(this));
                    this.f8551c.remove(c5517v);
                }
            }
            if (arrayList.size() > 1) {
                C5518w c5518w = this.f8550b;
                C6696d c6696d = this.f8552d;
                c5518w.getClass();
                return new C5516u(arrayList, c6696d);
            }
            if (arrayList.size() == 1) {
                return (InterfaceC5511p) arrayList.get(0);
            }
            if (!z8) {
                throw new Registry$NoModelLoaderAvailableException((Class<?>) cls, (Class<?>) cls2);
            }
            return f8548f;
        } catch (Throwable th) {
            this.f8551c.clear();
            throw th;
        }
    }

    /* renamed from: b */
    public final synchronized ArrayList m4890b(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            ArrayList arrayList2 = this.f8549a;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                C5517v c5517v = (C5517v) obj;
                if (!this.f8551c.contains(c5517v) && c5517v.f8544a.isAssignableFrom(cls)) {
                    this.f8551c.add(c5517v);
                    arrayList.add(c5517v.f8546c.mo2140r(this));
                    this.f8551c.remove(c5517v);
                }
            }
        } finally {
        }
        return arrayList;
    }

    /* renamed from: c */
    public final synchronized ArrayList m4891c(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        ArrayList arrayList2 = this.f8549a;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            C5517v c5517v = (C5517v) obj;
            if (!arrayList.contains(c5517v.f8545b) && c5517v.f8544a.isAssignableFrom(cls)) {
                arrayList.add(c5517v.f8545b);
            }
        }
        return arrayList;
    }
}
