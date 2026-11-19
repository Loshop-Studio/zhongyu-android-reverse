package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.C0491c0;
import androidx.savedstate.InterfaceC0651c;
import androidx.savedstate.SavedStateRegistry;
import java.lang.reflect.Constructor;
import java.util.Arrays;

/* renamed from: androidx.lifecycle.z */
/* loaded from: classes.dex */
public final class C0518z extends C0491c0.c {

    /* renamed from: f */
    private static final Class<?>[] f3462f = {Application.class, C0517y.class};

    /* renamed from: g */
    private static final Class<?>[] f3463g = {C0517y.class};

    /* renamed from: a */
    private final Application f3464a;

    /* renamed from: b */
    private final C0491c0.b f3465b;

    /* renamed from: c */
    private final Bundle f3466c;

    /* renamed from: d */
    private final AbstractC0496f f3467d;

    /* renamed from: e */
    private final SavedStateRegistry f3468e;

    @SuppressLint({"LambdaLast"})
    public C0518z(Application application, InterfaceC0651c interfaceC0651c, Bundle bundle) {
        this.f3468e = interfaceC0651c.getSavedStateRegistry();
        this.f3467d = interfaceC0651c.getLifecycle();
        this.f3466c = bundle;
        this.f3464a = application;
        this.f3465b = application != null ? C0491c0.a.m2852c(application) : C0491c0.d.m2854b();
    }

    /* renamed from: d */
    private static <T> Constructor<T> m2921d(Class<T> cls, Class<?>[] clsArr) throws SecurityException {
        for (Object obj : cls.getConstructors()) {
            Constructor<T> constructor = (Constructor<T>) obj;
            if (Arrays.equals(clsArr, constructor.getParameterTypes())) {
                return constructor;
            }
        }
        return null;
    }

    @Override // androidx.lifecycle.C0491c0.c, androidx.lifecycle.C0491c0.b
    /* renamed from: a */
    public <T extends AbstractC0489b0> T mo2650a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) mo2853c(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.C0491c0.e
    /* renamed from: b */
    void mo2855b(AbstractC0489b0 abstractC0489b0) throws NoSuchMethodException, SecurityException {
        SavedStateHandleController.m2817e(abstractC0489b0, this.f3468e, this.f3467d);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0046 A[Catch: InvocationTargetException -> 0x005a, InstantiationException -> 0x0076, IllegalAccessException -> 0x0093, TryCatch #2 {IllegalAccessException -> 0x0093, InstantiationException -> 0x0076, InvocationTargetException -> 0x005a, blocks: (B:13:0x0030, B:15:0x0034, B:17:0x0054, B:16:0x0046), top: B:28:0x0030 }] */
    @Override // androidx.lifecycle.C0491c0.c
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <T extends androidx.lifecycle.AbstractC0489b0> T mo2853c(java.lang.String r6, java.lang.Class<T> r7) throws java.lang.NoSuchMethodException, java.lang.SecurityException, java.io.IOException {
        /*
            r5 = this;
            java.lang.Class<androidx.lifecycle.a> r0 = androidx.lifecycle.C0486a.class
            boolean r0 = r0.isAssignableFrom(r7)
            if (r0 == 0) goto L13
            android.app.Application r1 = r5.f3464a
            if (r1 == 0) goto L13
            java.lang.Class<?>[] r1 = androidx.lifecycle.C0518z.f3462f
            java.lang.reflect.Constructor r1 = m2921d(r7, r1)
            goto L19
        L13:
            java.lang.Class<?>[] r1 = androidx.lifecycle.C0518z.f3463g
            java.lang.reflect.Constructor r1 = m2921d(r7, r1)
        L19:
            if (r1 != 0) goto L22
            androidx.lifecycle.c0$b r6 = r5.f3465b
            androidx.lifecycle.b0 r6 = r6.mo2650a(r7)
            return r6
        L22:
            androidx.savedstate.SavedStateRegistry r2 = r5.f3468e
            androidx.lifecycle.f r3 = r5.f3467d
            android.os.Bundle r4 = r5.f3466c
            androidx.lifecycle.SavedStateHandleController r6 = androidx.lifecycle.SavedStateHandleController.m2818j(r2, r3, r6, r4)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L46
            android.app.Application r0 = r5.f3464a     // Catch: java.lang.reflect.InvocationTargetException -> L5a java.lang.InstantiationException -> L76 java.lang.IllegalAccessException -> L93
            if (r0 == 0) goto L46
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.reflect.InvocationTargetException -> L5a java.lang.InstantiationException -> L76 java.lang.IllegalAccessException -> L93
            r4[r2] = r0     // Catch: java.lang.reflect.InvocationTargetException -> L5a java.lang.InstantiationException -> L76 java.lang.IllegalAccessException -> L93
            androidx.lifecycle.y r0 = r6.m2821k()     // Catch: java.lang.reflect.InvocationTargetException -> L5a java.lang.InstantiationException -> L76 java.lang.IllegalAccessException -> L93
            r4[r3] = r0     // Catch: java.lang.reflect.InvocationTargetException -> L5a java.lang.InstantiationException -> L76 java.lang.IllegalAccessException -> L93
            java.lang.Object r0 = r1.newInstance(r4)     // Catch: java.lang.reflect.InvocationTargetException -> L5a java.lang.InstantiationException -> L76 java.lang.IllegalAccessException -> L93
            androidx.lifecycle.b0 r0 = (androidx.lifecycle.AbstractC0489b0) r0     // Catch: java.lang.reflect.InvocationTargetException -> L5a java.lang.InstantiationException -> L76 java.lang.IllegalAccessException -> L93
            goto L54
        L46:
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch: java.lang.reflect.InvocationTargetException -> L5a java.lang.InstantiationException -> L76 java.lang.IllegalAccessException -> L93
            androidx.lifecycle.y r3 = r6.m2821k()     // Catch: java.lang.reflect.InvocationTargetException -> L5a java.lang.InstantiationException -> L76 java.lang.IllegalAccessException -> L93
            r0[r2] = r3     // Catch: java.lang.reflect.InvocationTargetException -> L5a java.lang.InstantiationException -> L76 java.lang.IllegalAccessException -> L93
            java.lang.Object r0 = r1.newInstance(r0)     // Catch: java.lang.reflect.InvocationTargetException -> L5a java.lang.InstantiationException -> L76 java.lang.IllegalAccessException -> L93
            androidx.lifecycle.b0 r0 = (androidx.lifecycle.AbstractC0489b0) r0     // Catch: java.lang.reflect.InvocationTargetException -> L5a java.lang.InstantiationException -> L76 java.lang.IllegalAccessException -> L93
        L54:
            java.lang.String r1 = "androidx.lifecycle.savedstate.vm.tag"
            r0.m2841e(r1, r6)     // Catch: java.lang.reflect.InvocationTargetException -> L5a java.lang.InstantiationException -> L76 java.lang.IllegalAccessException -> L93
            return r0
        L5a:
            r6 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "An exception happened in constructor of "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            java.lang.Throwable r6 = r6.getCause()
            r0.<init>(r7, r6)
            throw r0
        L76:
            r6 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "A "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = " cannot be instantiated."
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7, r6)
            throw r0
        L93:
            r6 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to access "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7, r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C0518z.mo2853c(java.lang.String, java.lang.Class):androidx.lifecycle.b0");
    }
}
