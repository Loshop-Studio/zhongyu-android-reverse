package androidx.compose.foundation.text.input.internal;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p379vd.InterfaceC11602k;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$2$1", m26211f = "AndroidTextInputSession.android.kt", m26212l = {111, 112}, m26213m = "invokeSuspend")
/* renamed from: androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$2$1 */
/* loaded from: classes.dex */
public final class C1772x2b7eadeb extends SuspendLambda implements InterfaceC9544p {
    final /* synthetic */ ComposeInputMethodManager $composeImm;
    final /* synthetic */ InterfaceC11602k $it;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1772x2b7eadeb(InterfaceC11602k interfaceC11602k, ComposeInputMethodManager composeInputMethodManager, InterfaceC11588c<? super C1772x2b7eadeb> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.$it = interfaceC11602k;
        this.$composeImm = composeInputMethodManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        return new C1772x2b7eadeb(this.$it, this.$composeImm, interfaceC11588c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        if (r5.collect(r1, r4) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) throws java.lang.Throwable {
        /*
            r4 = this;
            java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
            int r1 = r4.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 == r2) goto L16
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L16:
            kotlin.AbstractC9924b.m20071b(r5)
            goto L3e
        L1a:
            kotlin.AbstractC9924b.m20071b(r5)
            goto L2c
        L1e:
            kotlin.AbstractC9924b.m20071b(r5)
            androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$2$1$1 r5 = new p181hd.InterfaceC9540l() { // from class: androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$2$1.1
                static {
                    /*
                        androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$2$1$1 r0 = new androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$2$1$1
                        r0.<init>()
                        
                        // error: 0x0005: SPUT 
  (r0 I:androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$2$1$1)
 androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$2$1.1.INSTANCE androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$2$1$1
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.C1772x2b7eadeb.AnonymousClass1.<clinit>():void");
                }

                {
                    /*
                        r1 = this;
                        r0 = 1
                        r1.<init>(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.C1772x2b7eadeb.AnonymousClass1.<init>():void");
                }

                public final void invoke(long r1) {
                    /*
                        r0 = this;
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.C1772x2b7eadeb.AnonymousClass1.invoke(long):void");
                }

                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r3) {
                    /*
                        r2 = this;
                        java.lang.Number r3 = (java.lang.Number) r3
                        long r0 = r3.longValue()
                        r2.invoke(r0)
                        qc.q r3 = p309qc.C10786q.f26013a
                        return r3
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.C1772x2b7eadeb.AnonymousClass1.invoke(java.lang.Object):java.lang.Object");
                }
            }
            r4.label = r3
            java.lang.Object r5 = androidx.compose.runtime.MonotonicFrameClockKt.withFrameMillis(r5, r4)
            if (r5 != r0) goto L2c
            goto L3d
        L2c:
            vd.k r5 = r4.$it
            androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$2$1$2 r1 = new androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$2$1$2
            androidx.compose.foundation.text.input.internal.ComposeInputMethodManager r3 = r4.$composeImm
            r1.<init>()
            r4.label = r2
            java.lang.Object r5 = r5.collect(r1, r4)
            if (r5 != r0) goto L3e
        L3d:
            return r0
        L3e:
            kotlin.KotlinNothingValueException r5 = new kotlin.KotlinNothingValueException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.C1772x2b7eadeb.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        return ((C1772x2b7eadeb) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
