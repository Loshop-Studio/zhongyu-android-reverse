package p127o0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import p180v0.AbstractC6664k;

/* renamed from: o0.a */
/* loaded from: classes2.dex */
public final class C6255a implements InterfaceC6259e {

    /* renamed from: a */
    public final Set f10002a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    public boolean f10003b;

    /* renamed from: c */
    public boolean f10004c;

    /* renamed from: a */
    public final void m5856a() {
        this.f10004c = true;
        ArrayList arrayListM6324d = AbstractC6664k.m6324d(this.f10002a);
        int size = arrayListM6324d.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListM6324d.get(i);
            i++;
            ((InterfaceC6260f) obj).onDestroy();
        }
    }

    /* renamed from: b */
    public final void m5857b() {
        this.f10003b = true;
        ArrayList arrayListM6324d = AbstractC6664k.m6324d(this.f10002a);
        int size = arrayListM6324d.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListM6324d.get(i);
            i++;
            ((InterfaceC6260f) obj).onStart();
        }
    }

    /* renamed from: c */
    public final void m5858c() {
        int i = 0;
        this.f10003b = false;
        ArrayList arrayListM6324d = AbstractC6664k.m6324d(this.f10002a);
        int size = arrayListM6324d.size();
        while (i < size) {
            Object obj = arrayListM6324d.get(i);
            i++;
            ((InterfaceC6260f) obj).onStop();
        }
    }

    @Override // p127o0.InterfaceC6259e
    /* renamed from: d */
    public final void mo5081d(InterfaceC6260f interfaceC6260f) {
        this.f10002a.add(interfaceC6260f);
        if (this.f10004c) {
            interfaceC6260f.onDestroy();
        } else if (this.f10003b) {
            interfaceC6260f.onStart();
        } else {
            interfaceC6260f.onStop();
        }
    }

    @Override // p127o0.InterfaceC6259e
    /* renamed from: f */
    public final void mo5082f(InterfaceC6260f interfaceC6260f) {
        this.f10002a.remove(interfaceC6260f);
    }
}
