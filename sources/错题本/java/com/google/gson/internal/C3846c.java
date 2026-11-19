package com.google.gson.internal;

import com.google.gson.AbstractC3869p;
import com.google.gson.C3841g;
import p095k1.C5752a;

/* renamed from: com.google.gson.internal.c */
/* loaded from: classes2.dex */
public final class C3846c extends AbstractC3869p {

    /* renamed from: a */
    public volatile AbstractC3869p f3021a;

    /* renamed from: b */
    public final /* synthetic */ boolean f3022b;

    /* renamed from: c */
    public final /* synthetic */ boolean f3023c;

    /* renamed from: d */
    public final /* synthetic */ C3841g f3024d;

    /* renamed from: e */
    public final /* synthetic */ C5752a f3025e;

    /* renamed from: f */
    public final /* synthetic */ C3847d f3026f;

    public C3846c(C3847d c3847d, boolean z8, boolean z9, C3841g c3841g, C5752a c5752a) {
        this.f3026f = c3847d;
        this.f3022b = z8;
        this.f3023c = z9;
        this.f3024d = c3841g;
        this.f3025e = c5752a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0083 A[SYNTHETIC] */
    @Override // com.google.gson.AbstractC3869p
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo2779b(p104l1.C6046a r11) throws java.io.IOException {
        /*
            r10 = this;
            boolean r0 = r10.f3022b
            if (r0 == 0) goto L9
            r11.m5740E()
            r11 = 0
            return r11
        L9:
            com.google.gson.p r0 = r10.f3021a
            if (r0 != 0) goto La0
            com.google.gson.g r0 = r10.f3024d
            com.google.gson.internal.d r1 = r10.f3026f
            k1.a r2 = r10.f3025e
            g1.l r3 = r0.f2988d
            r3.getClass()
            java.util.concurrent.ConcurrentHashMap r4 = r3.f8648b
            g1.k r5 = p063g1.C5569l.f8646c
            r6 = 1
            if (r1 != r5) goto L20
            goto L61
        L20:
            java.lang.Class r5 = r2.f9103a
            java.lang.Object r7 = r4.get(r5)
            com.google.gson.q r7 = (com.google.gson.InterfaceC3870q) r7
            if (r7 == 0) goto L2d
            if (r7 != r1) goto L62
            goto L61
        L2d:
            java.lang.Class<com.google.gson.annotations.JsonAdapter> r7 = com.google.gson.annotations.JsonAdapter.class
            java.lang.annotation.Annotation r7 = r5.getAnnotation(r7)
            com.google.gson.annotations.JsonAdapter r7 = (com.google.gson.annotations.JsonAdapter) r7
            if (r7 != 0) goto L38
            goto L62
        L38:
            java.lang.Class r7 = r7.value()
            java.lang.Class<com.google.gson.q> r8 = com.google.gson.InterfaceC3870q.class
            boolean r8 = r8.isAssignableFrom(r7)
            if (r8 != 0) goto L45
            goto L62
        L45:
            com.google.gson.internal.b r8 = r3.f8647a
            k1.a r9 = new k1.a
            r9.<init>(r7)
            com.google.gson.internal.k r7 = r8.m2797c(r9, r6)
            java.lang.Object r7 = r7.mo671a()
            com.google.gson.q r7 = (com.google.gson.InterfaceC3870q) r7
            java.lang.Object r4 = r4.putIfAbsent(r5, r7)
            com.google.gson.q r4 = (com.google.gson.InterfaceC3870q) r4
            if (r4 == 0) goto L5f
            r7 = r4
        L5f:
            if (r7 != r1) goto L62
        L61:
            r1 = r3
        L62:
            java.util.List r3 = r0.f2989e
            java.util.Iterator r3 = r3.iterator()
            r4 = 0
        L69:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L83
            java.lang.Object r5 = r3.next()
            com.google.gson.q r5 = (com.google.gson.InterfaceC3870q) r5
            if (r4 != 0) goto L7b
            if (r5 != r1) goto L69
            r4 = r6
            goto L69
        L7b:
            com.google.gson.p r5 = r5.mo2798c(r0, r2)
            if (r5 == 0) goto L69
            r0 = r5
            goto L89
        L83:
            if (r4 != 0) goto L8c
            com.google.gson.p r0 = r0.m2785d(r2)
        L89:
            r10.f3021a = r0
            goto La0
        L8c:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "GSON cannot serialize or deserialize "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r11.<init>(r0)
            throw r11
        La0:
            java.lang.Object r11 = r0.mo2779b(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.C3846c.mo2779b(l1.a):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0082 A[SYNTHETIC] */
    @Override // com.google.gson.AbstractC3869p
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo2780c(p104l1.C6047b r11, java.lang.Object r12) throws java.io.IOException {
        /*
            r10 = this;
            boolean r0 = r10.f3023c
            if (r0 == 0) goto L8
            r11.m5775k()
            return
        L8:
            com.google.gson.p r0 = r10.f3021a
            if (r0 != 0) goto L9f
            com.google.gson.g r0 = r10.f3024d
            com.google.gson.internal.d r1 = r10.f3026f
            k1.a r2 = r10.f3025e
            g1.l r3 = r0.f2988d
            r3.getClass()
            java.util.concurrent.ConcurrentHashMap r4 = r3.f8648b
            g1.k r5 = p063g1.C5569l.f8646c
            r6 = 1
            if (r1 != r5) goto L1f
            goto L60
        L1f:
            java.lang.Class r5 = r2.f9103a
            java.lang.Object r7 = r4.get(r5)
            com.google.gson.q r7 = (com.google.gson.InterfaceC3870q) r7
            if (r7 == 0) goto L2c
            if (r7 != r1) goto L61
            goto L60
        L2c:
            java.lang.Class<com.google.gson.annotations.JsonAdapter> r7 = com.google.gson.annotations.JsonAdapter.class
            java.lang.annotation.Annotation r7 = r5.getAnnotation(r7)
            com.google.gson.annotations.JsonAdapter r7 = (com.google.gson.annotations.JsonAdapter) r7
            if (r7 != 0) goto L37
            goto L61
        L37:
            java.lang.Class r7 = r7.value()
            java.lang.Class<com.google.gson.q> r8 = com.google.gson.InterfaceC3870q.class
            boolean r8 = r8.isAssignableFrom(r7)
            if (r8 != 0) goto L44
            goto L61
        L44:
            com.google.gson.internal.b r8 = r3.f8647a
            k1.a r9 = new k1.a
            r9.<init>(r7)
            com.google.gson.internal.k r7 = r8.m2797c(r9, r6)
            java.lang.Object r7 = r7.mo671a()
            com.google.gson.q r7 = (com.google.gson.InterfaceC3870q) r7
            java.lang.Object r4 = r4.putIfAbsent(r5, r7)
            com.google.gson.q r4 = (com.google.gson.InterfaceC3870q) r4
            if (r4 == 0) goto L5e
            r7 = r4
        L5e:
            if (r7 != r1) goto L61
        L60:
            r1 = r3
        L61:
            java.util.List r3 = r0.f2989e
            java.util.Iterator r3 = r3.iterator()
            r4 = 0
        L68:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L82
            java.lang.Object r5 = r3.next()
            com.google.gson.q r5 = (com.google.gson.InterfaceC3870q) r5
            if (r4 != 0) goto L7a
            if (r5 != r1) goto L68
            r4 = r6
            goto L68
        L7a:
            com.google.gson.p r5 = r5.mo2798c(r0, r2)
            if (r5 == 0) goto L68
            r0 = r5
            goto L88
        L82:
            if (r4 != 0) goto L8b
            com.google.gson.p r0 = r0.m2785d(r2)
        L88:
            r10.f3021a = r0
            goto L9f
        L8b:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r0 = "GSON cannot serialize or deserialize "
            r12.<init>(r0)
            r12.append(r2)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L9f:
            r0.mo2780c(r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.C3846c.mo2780c(l1.b, java.lang.Object):void");
    }
}
