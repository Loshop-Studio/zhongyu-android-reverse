package com.google.gson.internal;

import com.bumptech.glide.request.C3420a;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import p147r0.InterfaceC6444b;

/* renamed from: com.google.gson.internal.b */
/* loaded from: classes2.dex */
public final class C3845b {

    /* renamed from: a */
    public final /* synthetic */ int f3017a;

    /* renamed from: b */
    public boolean f3018b;

    /* renamed from: c */
    public final Object f3019c;

    /* renamed from: d */
    public final List f3020d;

    public C3845b() {
        this.f3017a = 1;
        this.f3019c = Collections.newSetFromMap(new WeakHashMap());
        this.f3020d = new ArrayList();
    }

    /* renamed from: a */
    public static String m2795a(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (!Modifier.isAbstract(modifiers)) {
            return null;
        }
        return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("r8-abstract-class");
    }

    /* renamed from: b */
    public boolean m2796b(InterfaceC6444b interfaceC6444b) {
        boolean z8 = true;
        if (interfaceC6444b == null) {
            return true;
        }
        boolean zRemove = ((Set) this.f3019c).remove(interfaceC6444b);
        if (!((ArrayList) this.f3020d).remove(interfaceC6444b) && !zRemove) {
            z8 = false;
        }
        if (z8) {
            ((C3420a) interfaceC6444b).m2421c();
        }
        return z8;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013f  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.gson.internal.InterfaceC3854k m2797c(p095k1.C5752a r10, boolean r11) throws java.lang.NoSuchMethodException, java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 515
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.C3845b.m2797c(k1.a, boolean):com.google.gson.internal.k");
    }

    public final String toString() {
        switch (this.f3017a) {
            case 0:
                return ((Map) this.f3019c).toString();
            default:
                return super.toString() + "{numRequests=" + ((Set) this.f3019c).size() + ", isPaused=" + this.f3018b + "}";
        }
    }

    public C3845b(Map map, boolean z8, List list) {
        this.f3017a = 0;
        this.f3019c = map;
        this.f3018b = z8;
        this.f3020d = list;
    }
}
