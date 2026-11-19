package retrofit2;

import java.lang.reflect.InvocationHandler;

/* renamed from: retrofit2.o0 */
/* loaded from: classes4.dex */
public final class C6511o0 implements InvocationHandler {

    /* renamed from: a */
    public final Object[] f10765a = new Object[0];

    /* renamed from: b */
    public final /* synthetic */ Class f10766b;

    /* renamed from: c */
    public final /* synthetic */ C6513p0 f10767c;

    public C6511o0(C6513p0 c6513p0, Class cls) {
        this.f10767c = c6513p0;
        this.f10766b = cls;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0047, code lost:
    
        r1 = retrofit2.AbstractC6516r.m6159b(r10, r0, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004b, code lost:
    
        ((java.util.concurrent.ConcurrentHashMap) r10.f10770a).put(r9, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0075, code lost:
    
        r9 = (retrofit2.AbstractC6516r) r2;
     */
    @Override // java.lang.reflect.InvocationHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r8, java.lang.reflect.Method r9, java.lang.Object[] r10) {
        /*
            r7 = this;
            java.lang.Class r0 = r7.f10766b
            java.lang.Class r1 = r9.getDeclaringClass()
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            if (r1 != r2) goto Lf
            java.lang.Object r8 = r9.invoke(r7, r10)
            return r8
        Lf:
            if (r10 == 0) goto L13
        L11:
            r4 = r10
            goto L16
        L13:
            java.lang.Object[] r10 = r7.f10765a
            goto L11
        L16:
            retrofit2.b r10 = retrofit2.AbstractC6499i0.f10703b
            boolean r1 = r10.mo6142e(r9)
            if (r1 == 0) goto L23
            java.lang.Object r8 = r10.mo6141d(r9, r0, r8, r4)
            return r8
        L23:
            retrofit2.p0 r10 = r7.f10767c
        L25:
            java.lang.Object r1 = r10.f10770a
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1
            java.lang.Object r1 = r1.get(r9)
            boolean r2 = r1 instanceof retrofit2.AbstractC6516r
            if (r2 == 0) goto L35
            retrofit2.r r1 = (retrofit2.AbstractC6516r) r1
        L33:
            r9 = r1
            goto L79
        L35:
            if (r1 != 0) goto L65
            java.lang.Object r2 = new java.lang.Object
            r2.<init>()
            monitor-enter(r2)
            java.lang.Object r1 = r10.f10770a     // Catch: java.lang.Throwable -> L54
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1     // Catch: java.lang.Throwable -> L54
            java.lang.Object r1 = r1.putIfAbsent(r9, r2)     // Catch: java.lang.Throwable -> L54
            if (r1 != 0) goto L61
            retrofit2.r r1 = retrofit2.AbstractC6516r.m6159b(r10, r0, r9)     // Catch: java.lang.Throwable -> L57
            java.lang.Object r10 = r10.f10770a     // Catch: java.lang.Throwable -> L54
            java.util.concurrent.ConcurrentHashMap r10 = (java.util.concurrent.ConcurrentHashMap) r10     // Catch: java.lang.Throwable -> L54
            r10.put(r9, r1)     // Catch: java.lang.Throwable -> L54
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L54
            goto L33
        L54:
            r0 = move-exception
            r8 = r0
            goto L63
        L57:
            r0 = move-exception
            r8 = r0
            java.lang.Object r10 = r10.f10770a     // Catch: java.lang.Throwable -> L54
            java.util.concurrent.ConcurrentHashMap r10 = (java.util.concurrent.ConcurrentHashMap) r10     // Catch: java.lang.Throwable -> L54
            r10.remove(r9)     // Catch: java.lang.Throwable -> L54
            throw r8     // Catch: java.lang.Throwable -> L54
        L61:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L54
            goto L65
        L63:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L54
            throw r8
        L65:
            monitor-enter(r1)
            java.lang.Object r2 = r10.f10770a     // Catch: java.lang.Throwable -> L72
            java.util.concurrent.ConcurrentHashMap r2 = (java.util.concurrent.ConcurrentHashMap) r2     // Catch: java.lang.Throwable -> L72
            java.lang.Object r2 = r2.get(r9)     // Catch: java.lang.Throwable -> L72
            if (r2 != 0) goto L75
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L72
            goto L25
        L72:
            r0 = move-exception
            r8 = r0
            goto L8a
        L75:
            r9 = r2
            retrofit2.r r9 = (retrofit2.AbstractC6516r) r9     // Catch: java.lang.Throwable -> L72
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L72
        L79:
            retrofit2.x r1 = new retrofit2.x
            retrofit2.m0 r2 = r9.f10779a
            okhttp3.d r5 = r9.f10780b
            retrofit2.m r6 = r9.f10781c
            r3 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            java.lang.Object r8 = r9.mo6153a(r1, r4)
            return r8
        L8a:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L72
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit2.C6511o0.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object");
    }
}
