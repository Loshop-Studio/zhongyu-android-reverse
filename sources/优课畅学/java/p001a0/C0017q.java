package p001a0;

import android.util.Log;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import p069d0.InterfaceC8270b;
import p116h0.AbstractC8707k;

/* renamed from: a0.q */
/* loaded from: classes3.dex */
public class C0017q {

    /* renamed from: a */
    public final Set f37a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    public final Set f38b = new HashSet();

    /* renamed from: c */
    public boolean f39c;

    /* renamed from: a */
    public boolean m24a(InterfaceC8270b interfaceC8270b) {
        boolean z10 = true;
        if (interfaceC8270b == null) {
            return true;
        }
        boolean zRemove = this.f37a.remove(interfaceC8270b);
        if (!this.f38b.remove(interfaceC8270b) && !zRemove) {
            z10 = false;
        }
        if (z10) {
            interfaceC8270b.clear();
        }
        return z10;
    }

    /* renamed from: b */
    public void m25b() {
        Iterator it = AbstractC8707k.m14192j(this.f37a).iterator();
        while (it.hasNext()) {
            m24a((InterfaceC8270b) it.next());
        }
        this.f38b.clear();
    }

    /* renamed from: c */
    public void m26c() {
        this.f39c = true;
        for (InterfaceC8270b interfaceC8270b : AbstractC8707k.m14192j(this.f37a)) {
            if (interfaceC8270b.isRunning() || interfaceC8270b.isComplete()) {
                interfaceC8270b.clear();
                this.f38b.add(interfaceC8270b);
            }
        }
    }

    /* renamed from: d */
    public void m27d() {
        this.f39c = true;
        for (InterfaceC8270b interfaceC8270b : AbstractC8707k.m14192j(this.f37a)) {
            if (interfaceC8270b.isRunning()) {
                interfaceC8270b.pause();
                this.f38b.add(interfaceC8270b);
            }
        }
    }

    /* renamed from: e */
    public void m28e() {
        for (InterfaceC8270b interfaceC8270b : AbstractC8707k.m14192j(this.f37a)) {
            if (!interfaceC8270b.isComplete() && !interfaceC8270b.mo3164e()) {
                interfaceC8270b.clear();
                if (this.f39c) {
                    this.f38b.add(interfaceC8270b);
                } else {
                    interfaceC8270b.mo3168i();
                }
            }
        }
    }

    /* renamed from: f */
    public void m29f() {
        this.f39c = false;
        for (InterfaceC8270b interfaceC8270b : AbstractC8707k.m14192j(this.f37a)) {
            if (!interfaceC8270b.isComplete() && !interfaceC8270b.isRunning()) {
                interfaceC8270b.mo3168i();
            }
        }
        this.f38b.clear();
    }

    /* renamed from: g */
    public void m30g(InterfaceC8270b interfaceC8270b) {
        this.f37a.add(interfaceC8270b);
        if (!this.f39c) {
            interfaceC8270b.mo3168i();
            return;
        }
        interfaceC8270b.clear();
        Log.isLoggable("RequestTracker", 2);
        this.f38b.add(interfaceC8270b);
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.f37a.size() + ", isPaused=" + this.f39c + "}";
    }
}
