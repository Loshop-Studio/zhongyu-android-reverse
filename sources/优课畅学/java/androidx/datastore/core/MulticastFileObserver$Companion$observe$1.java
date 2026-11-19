package androidx.datastore.core;

import java.io.File;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p157k8.InterfaceC9071g;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "androidx.datastore.core.MulticastFileObserver$Companion$observe$1", m17801f = "MulticastFileObserver.android.kt", m17802l = {84, 85}, m17803m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class MulticastFileObserver$Companion$observe$1 extends SuspendLambda implements InterfaceC10574p {
    final /* synthetic */ File $file;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MulticastFileObserver$Companion$observe$1(File file, InterfaceC9324c<? super MulticastFileObserver$Companion$observe$1> interfaceC9324c) {
        super(2, interfaceC9324c);
        this.$file = file;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
        MulticastFileObserver$Companion$observe$1 multicastFileObserver$Companion$observe$1 = new MulticastFileObserver$Companion$observe$1(this.$file, interfaceC9324c);
        multicastFileObserver$Companion$observe$1.L$0 = obj;
        return multicastFileObserver$Companion$observe$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0063, code lost:
    
        if (kotlinx.coroutines.channels.ProduceKt.m16521a(r3, r7, r6) == r0) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            java.lang.Object r0 = p190n7.AbstractC9434a.m17291f()
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L26
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.AbstractC9079b.m15926b(r7)
            goto L66
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            java.lang.Object r1 = r6.L$1
            i8.k0 r1 = (p135i8.InterfaceC8849k0) r1
            java.lang.Object r3 = r6.L$0
            k8.g r3 = (p157k8.InterfaceC9071g) r3
            kotlin.AbstractC9079b.m15926b(r7)
            goto L53
        L26:
            kotlin.AbstractC9079b.m15926b(r7)
            java.lang.Object r7 = r6.L$0
            k8.g r7 = (p157k8.InterfaceC9071g) r7
            androidx.datastore.core.MulticastFileObserver$Companion$observe$1$flowObserver$1 r1 = new androidx.datastore.core.MulticastFileObserver$Companion$observe$1$flowObserver$1
            java.io.File r4 = r6.$file
            r1.<init>()
            androidx.datastore.core.MulticastFileObserver$Companion r4 = androidx.datastore.core.MulticastFileObserver.Companion
            java.io.File r5 = r6.$file
            java.io.File r5 = r5.getParentFile()
            kotlin.jvm.internal.AbstractC9133u.m16130d(r5)
            i8.k0 r1 = androidx.datastore.core.MulticastFileObserver.Companion.access$observe(r4, r5, r1)
            h7.p r4 = p123h7.C8736p.f16368a
            r6.L$0 = r7
            r6.L$1 = r1
            r6.label = r3
            java.lang.Object r3 = r7.send(r4, r6)
            if (r3 != r0) goto L52
            goto L65
        L52:
            r3 = r7
        L53:
            androidx.datastore.core.MulticastFileObserver$Companion$observe$1$1 r7 = new androidx.datastore.core.MulticastFileObserver$Companion$observe$1$1
            r7.<init>()
            r1 = 0
            r6.L$0 = r1
            r6.L$1 = r1
            r6.label = r2
            java.lang.Object r7 = kotlinx.coroutines.channels.ProduceKt.m16521a(r3, r7, r6)
            if (r7 != r0) goto L66
        L65:
            return r0
        L66:
            h7.p r7 = p123h7.C8736p.f16368a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.MulticastFileObserver$Companion$observe$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC9071g interfaceC9071g, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        return ((MulticastFileObserver$Companion$observe$1) create(interfaceC9071g, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }
}
