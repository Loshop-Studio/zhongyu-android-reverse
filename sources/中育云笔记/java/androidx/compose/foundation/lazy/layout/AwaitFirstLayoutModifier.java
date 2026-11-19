package androidx.compose.foundation.lazy.layout;

import androidx.compose.p014ui.layout.LayoutCoordinates;
import androidx.compose.p014ui.layout.OnGloballyPositionedModifier;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p309qc.C10786q;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class AwaitFirstLayoutModifier implements OnGloballyPositionedModifier {
    public static final int $stable = 0;
    private InterfaceC11588c<? super C10786q> continuation;
    private boolean wasPositioned;

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier", m26211f = "AwaitFirstLayoutModifier.kt", m26212l = {49}, m26213m = "waitForFirstLayout")
    /* renamed from: androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier$waitForFirstLayout$1 */
    public static final class C15751 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C15751(InterfaceC11588c<? super C15751> interfaceC11588c) {
            super(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AwaitFirstLayoutModifier.this.waitForFirstLayout(this);
        }
    }

    @Override // androidx.compose.p014ui.layout.OnGloballyPositionedModifier
    public void onGloballyPositioned(LayoutCoordinates layoutCoordinates) {
        if (this.wasPositioned) {
            return;
        }
        this.wasPositioned = true;
        InterfaceC11588c<? super C10786q> interfaceC11588c = this.continuation;
        if (interfaceC11588c != null) {
            Result.C9921a c9921a = Result.f23263d;
            interfaceC11588c.resumeWith(Result.m20054c(C10786q.f26013a));
        }
        this.continuation = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object waitForFirstLayout(vc.InterfaceC11588c<? super p309qc.C10786q> r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier.C15751
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier$waitForFirstLayout$1 r0 = (androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier.C15751) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier$waitForFirstLayout$1 r0 = new androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier$waitForFirstLayout$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r1 = r0.L$1
            vc.c r1 = (vc.InterfaceC11588c) r1
            java.lang.Object r0 = r0.L$0
            androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier r0 = (androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier) r0
            kotlin.AbstractC9924b.m20071b(r6)
            goto L68
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L39:
            kotlin.AbstractC9924b.m20071b(r6)
            boolean r6 = r5.wasPositioned
            if (r6 != 0) goto L75
            vc.c<? super qc.q> r6 = r5.continuation
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r3
            kotlinx.coroutines.c r2 = new kotlinx.coroutines.c
            vc.c r4 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.m20224d(r0)
            r2.<init>(r4, r3)
            r2.m20503F()
            access$setContinuation$p(r5, r2)
            java.lang.Object r2 = r2.m20538x()
            java.lang.Object r3 = p393wc.AbstractC11725a.m25952f()
            if (r2 != r3) goto L64
            p409xc.AbstractC11831f.m26221c(r0)
        L64:
            if (r2 != r1) goto L67
            return r1
        L67:
            r1 = r6
        L68:
            if (r1 == 0) goto L75
            kotlin.Result$a r6 = kotlin.Result.f23263d
            qc.q r6 = p309qc.C10786q.f26013a
            java.lang.Object r6 = kotlin.Result.m20054c(r6)
            r1.resumeWith(r6)
        L75:
            qc.q r6 = p309qc.C10786q.f26013a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier.waitForFirstLayout(vc.c):java.lang.Object");
    }
}
