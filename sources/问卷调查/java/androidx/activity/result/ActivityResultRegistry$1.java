package androidx.activity.result;

import p000a.p057m.AbstractC0355d;
import p000a.p057m.InterfaceC0356e;
import p000a.p057m.InterfaceC0358g;

/* loaded from: classes.dex */
public class ActivityResultRegistry$1 implements InterfaceC0356e {
    @Override // p000a.p057m.InterfaceC0356e
    /* renamed from: g */
    public void mo1278g(InterfaceC0358g interfaceC0358g, AbstractC0355d.a aVar) {
        if (AbstractC0355d.a.ON_START.equals(aVar) || AbstractC0355d.a.ON_STOP.equals(aVar) || AbstractC0355d.a.ON_DESTROY.equals(aVar)) {
            throw null;
        }
    }
}
