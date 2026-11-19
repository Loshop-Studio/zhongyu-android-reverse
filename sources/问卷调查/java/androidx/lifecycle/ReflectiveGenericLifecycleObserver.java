package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import p000a.p057m.AbstractC0355d;
import p000a.p057m.C0352a;
import p000a.p057m.InterfaceC0356e;
import p000a.p057m.InterfaceC0358g;

/* loaded from: classes.dex */
public class ReflectiveGenericLifecycleObserver implements InterfaceC0356e {

    /* renamed from: a */
    public final Object f3205a;

    /* renamed from: b */
    public final C0352a.a f3206b;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f3205a = obj;
        this.f3206b = C0352a.f2157c.m1265b(obj.getClass());
    }

    @Override // p000a.p057m.InterfaceC0356e
    /* renamed from: g */
    public void mo1278g(InterfaceC0358g interfaceC0358g, AbstractC0355d.a aVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        C0352a.a aVar2 = this.f3206b;
        Object obj = this.f3205a;
        C0352a.a.m1267a(aVar2.f2160a.get(aVar), interfaceC0358g, aVar, obj);
        C0352a.a.m1267a(aVar2.f2160a.get(AbstractC0355d.a.ON_ANY), interfaceC0358g, aVar, obj);
    }
}
