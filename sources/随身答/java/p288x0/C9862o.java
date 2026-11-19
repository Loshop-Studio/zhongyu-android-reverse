package p288x0;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import p002a1.InterfaceC0010b;
import p091e1.AbstractC7838j;

/* renamed from: x0.o */
/* loaded from: classes3.dex */
public class C9862o {

    /* renamed from: a */
    public final Set f17603a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    public final List f17604b = new ArrayList();

    /* renamed from: c */
    public boolean f17605c;

    /* renamed from: a */
    public boolean m16830a(InterfaceC0010b interfaceC0010b) {
        boolean z9 = true;
        if (interfaceC0010b == null) {
            return true;
        }
        boolean zRemove = this.f17603a.remove(interfaceC0010b);
        if (!this.f17604b.remove(interfaceC0010b) && !zRemove) {
            z9 = false;
        }
        if (z9) {
            interfaceC0010b.clear();
        }
        return z9;
    }

    /* renamed from: b */
    public void m16831b() {
        Iterator it = AbstractC7838j.m12266i(this.f17603a).iterator();
        while (it.hasNext()) {
            m16830a((InterfaceC0010b) it.next());
        }
        this.f17604b.clear();
    }

    /* renamed from: c */
    public void m16832c() {
        this.f17605c = true;
        for (InterfaceC0010b interfaceC0010b : AbstractC7838j.m12266i(this.f17603a)) {
            if (interfaceC0010b.isRunning() || interfaceC0010b.isComplete()) {
                interfaceC0010b.clear();
                this.f17604b.add(interfaceC0010b);
            }
        }
    }

    /* renamed from: d */
    public void m16833d() {
        this.f17605c = true;
        for (InterfaceC0010b interfaceC0010b : AbstractC7838j.m12266i(this.f17603a)) {
            if (interfaceC0010b.isRunning()) {
                interfaceC0010b.pause();
                this.f17604b.add(interfaceC0010b);
            }
        }
    }

    /* renamed from: e */
    public void m16834e() {
        for (InterfaceC0010b interfaceC0010b : AbstractC7838j.m12266i(this.f17603a)) {
            if (!interfaceC0010b.isComplete() && !interfaceC0010b.mo72e()) {
                interfaceC0010b.clear();
                if (this.f17605c) {
                    this.f17604b.add(interfaceC0010b);
                } else {
                    interfaceC0010b.mo74i();
                }
            }
        }
    }

    /* renamed from: f */
    public void m16835f() {
        this.f17605c = false;
        for (InterfaceC0010b interfaceC0010b : AbstractC7838j.m12266i(this.f17603a)) {
            if (!interfaceC0010b.isComplete() && !interfaceC0010b.isRunning()) {
                interfaceC0010b.mo74i();
            }
        }
        this.f17604b.clear();
    }

    /* renamed from: g */
    public void m16836g(InterfaceC0010b interfaceC0010b) {
        this.f17603a.add(interfaceC0010b);
        if (!this.f17605c) {
            interfaceC0010b.mo74i();
            return;
        }
        interfaceC0010b.clear();
        Log.isLoggable("RequestTracker", 2);
        this.f17604b.add(interfaceC0010b);
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.f17603a.size() + ", isPaused=" + this.f17605c + "}";
    }
}
