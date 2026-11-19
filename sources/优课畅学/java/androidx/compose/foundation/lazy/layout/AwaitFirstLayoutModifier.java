package androidx.compose.foundation.lazy.layout;

import androidx.compose.p013ui.layout.LayoutCoordinates;
import androidx.compose.p013ui.layout.OnGloballyPositionedModifier;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class AwaitFirstLayoutModifier implements OnGloballyPositionedModifier {
    public static final int $stable = 0;
    private InterfaceC9324c<? super C8736p> continuation;
    private boolean wasPositioned;

    @InterfaceC9539d(m17800c = "androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier", m17801f = "AwaitFirstLayoutModifier.kt", m17802l = {49}, m17803m = "waitForFirstLayout")
    /* renamed from: androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier$waitForFirstLayout$1 */
    public static final class C15451 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C15451(InterfaceC9324c<? super C15451> interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AwaitFirstLayoutModifier.this.waitForFirstLayout(this);
        }
    }

    @Override // androidx.compose.p013ui.layout.OnGloballyPositionedModifier
    public void onGloballyPositioned(LayoutCoordinates layoutCoordinates) {
        if (this.wasPositioned) {
            return;
        }
        this.wasPositioned = true;
        InterfaceC9324c<? super C8736p> interfaceC9324c = this.continuation;
        if (interfaceC9324c != null) {
            Result.C9076a c9076a = Result.f17350b;
            interfaceC9324c.resumeWith(Result.m15909b(C8736p.f16368a));
        }
        this.continuation = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object waitForFirstLayout(p179m7.InterfaceC9324c<? super p123h7.C8736p> r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier.C15451
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier$waitForFirstLayout$1 r0 = (androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier.C15451) r0
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
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r1 = r0.L$1
            m7.c r1 = (p179m7.InterfaceC9324c) r1
            java.lang.Object r0 = r0.L$0
            androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier r0 = (androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier) r0
            kotlin.AbstractC9079b.m15926b(r6)
            goto L68
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L39:
            kotlin.AbstractC9079b.m15926b(r6)
            boolean r6 = r5.wasPositioned
            if (r6 != 0) goto L75
            m7.c<? super h7.p> r6 = r5.continuation
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r3
            kotlinx.coroutines.c r2 = new kotlinx.coroutines.c
            m7.c r4 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.m16079d(r0)
            r2.<init>(r4, r3)
            r2.m16343D()
            access$setContinuation$p(r5, r2)
            java.lang.Object r2 = r2.m16372x()
            java.lang.Object r3 = p190n7.AbstractC9434a.m17291f()
            if (r2 != r3) goto L64
            p201o7.AbstractC9541f.m17811c(r0)
        L64:
            if (r2 != r1) goto L67
            return r1
        L67:
            r1 = r6
        L68:
            if (r1 == 0) goto L75
            kotlin.Result$a r6 = kotlin.Result.f17350b
            h7.p r6 = p123h7.C8736p.f16368a
            java.lang.Object r6 = kotlin.Result.m15909b(r6)
            r1.resumeWith(r6)
        L75:
            h7.p r6 = p123h7.C8736p.f16368a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier.waitForFirstLayout(m7.c):java.lang.Object");
    }
}
