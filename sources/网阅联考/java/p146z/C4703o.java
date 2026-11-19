package p146z;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import p016c0.InterfaceC2751b;
import p062g0.AbstractC3750j;

/* renamed from: z.o */
/* loaded from: classes2.dex */
public class C4703o {

    /* renamed from: a */
    public final Set f6060a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    public final List f6061b = new ArrayList();

    /* renamed from: c */
    public boolean f6062c;

    /* renamed from: a */
    public boolean m6697a(InterfaceC2751b interfaceC2751b) {
        boolean z3 = true;
        if (interfaceC2751b == null) {
            return true;
        }
        boolean zRemove = this.f6060a.remove(interfaceC2751b);
        if (!this.f6061b.remove(interfaceC2751b) && !zRemove) {
            z3 = false;
        }
        if (z3) {
            interfaceC2751b.clear();
        }
        return z3;
    }

    /* renamed from: b */
    public void m6698b() {
        Iterator it = AbstractC3750j.m4778i(this.f6060a).iterator();
        while (it.hasNext()) {
            m6697a((InterfaceC2751b) it.next());
        }
        this.f6061b.clear();
    }

    /* renamed from: c */
    public void m6699c() {
        this.f6062c = true;
        for (InterfaceC2751b interfaceC2751b : AbstractC3750j.m4778i(this.f6060a)) {
            if (interfaceC2751b.isRunning() || interfaceC2751b.mo1618j()) {
                interfaceC2751b.clear();
                this.f6061b.add(interfaceC2751b);
            }
        }
    }

    /* renamed from: d */
    public void m6700d() {
        this.f6062c = true;
        for (InterfaceC2751b interfaceC2751b : AbstractC3750j.m4778i(this.f6060a)) {
            if (interfaceC2751b.isRunning()) {
                interfaceC2751b.pause();
                this.f6061b.add(interfaceC2751b);
            }
        }
    }

    /* renamed from: e */
    public void m6701e() {
        for (InterfaceC2751b interfaceC2751b : AbstractC3750j.m4778i(this.f6060a)) {
            if (!interfaceC2751b.mo1618j() && !interfaceC2751b.mo1616f()) {
                interfaceC2751b.clear();
                if (this.f6062c) {
                    this.f6061b.add(interfaceC2751b);
                } else {
                    interfaceC2751b.mo1617h();
                }
            }
        }
    }

    /* renamed from: f */
    public void m6702f() {
        this.f6062c = false;
        for (InterfaceC2751b interfaceC2751b : AbstractC3750j.m4778i(this.f6060a)) {
            if (!interfaceC2751b.mo1618j() && !interfaceC2751b.isRunning()) {
                interfaceC2751b.mo1617h();
            }
        }
        this.f6061b.clear();
    }

    /* renamed from: g */
    public void m6703g(InterfaceC2751b interfaceC2751b) {
        this.f6060a.add(interfaceC2751b);
        if (!this.f6062c) {
            interfaceC2751b.mo1617h();
            return;
        }
        interfaceC2751b.clear();
        Log.isLoggable("RequestTracker", 2);
        this.f6061b.add(interfaceC2751b);
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.f6060a.size() + ", isPaused=" + this.f6062c + "}";
    }
}
