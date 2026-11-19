package androidx.lifecycle;

import androidx.lifecycle.AbstractC0496f;
import androidx.lifecycle.C0488b;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
class ReflectiveGenericLifecycleObserver implements InterfaceC0501i {

    /* renamed from: a */
    private final Object f3377a;

    /* renamed from: b */
    private final C0488b.a f3378b;

    ReflectiveGenericLifecycleObserver(Object obj) {
        this.f3377a = obj;
        this.f3378b = C0488b.f3395c.m2833c(obj.getClass());
    }

    @Override // androidx.lifecycle.InterfaceC0501i
    /* renamed from: d */
    public void mo63d(InterfaceC0504l interfaceC0504l, AbstractC0496f.b bVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.f3378b.m2836a(interfaceC0504l, bVar, this.f3377a);
    }
}
