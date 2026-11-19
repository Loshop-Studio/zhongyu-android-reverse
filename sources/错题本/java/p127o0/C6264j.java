package p127o0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import p155s0.InterfaceC6550i;
import p180v0.AbstractC6664k;

/* renamed from: o0.j */
/* loaded from: classes2.dex */
public final class C6264j implements InterfaceC6260f {

    /* renamed from: a */
    public final Set f10017a = Collections.newSetFromMap(new WeakHashMap());

    @Override // p127o0.InterfaceC6260f
    public final void onDestroy() {
        ArrayList arrayListM6324d = AbstractC6664k.m6324d(this.f10017a);
        int size = arrayListM6324d.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListM6324d.get(i);
            i++;
            ((InterfaceC6550i) obj).onDestroy();
        }
    }

    @Override // p127o0.InterfaceC6260f
    public final void onStart() {
        ArrayList arrayListM6324d = AbstractC6664k.m6324d(this.f10017a);
        int size = arrayListM6324d.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListM6324d.get(i);
            i++;
            ((InterfaceC6550i) obj).onStart();
        }
    }

    @Override // p127o0.InterfaceC6260f
    public final void onStop() {
        ArrayList arrayListM6324d = AbstractC6664k.m6324d(this.f10017a);
        int size = arrayListM6324d.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListM6324d.get(i);
            i++;
            ((InterfaceC6550i) obj).onStop();
        }
    }
}
