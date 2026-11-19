package androidx.compose.runtime;

import kotlin.coroutines.InterfaceC9945d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p181hd.InterfaceC9540l;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

/* loaded from: classes2.dex */
final class ProduceStateScopeImpl<T> implements ProduceStateScope<T>, MutableState<T> {
    private final /* synthetic */ MutableState<T> $$delegate_0;
    private final InterfaceC9945d coroutineContext;

    @InterfaceC11829d(m26210c = "androidx.compose.runtime.ProduceStateScopeImpl", m26211f = "ProduceState.kt", m26212l = {205}, m26213m = "awaitDispose")
    /* renamed from: androidx.compose.runtime.ProduceStateScopeImpl$awaitDispose$1 */
    public static final class C25611 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ ProduceStateScopeImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25611(ProduceStateScopeImpl<T> produceStateScopeImpl, InterfaceC11588c<? super C25611> interfaceC11588c) {
            super(interfaceC11588c);
            this.this$0 = produceStateScopeImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.awaitDispose(null, this);
        }
    }

    public ProduceStateScopeImpl(MutableState<T> mutableState, InterfaceC9945d interfaceC9945d) {
        this.coroutineContext = interfaceC9945d;
        this.$$delegate_0 = mutableState;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.runtime.ProduceStateScope
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object awaitDispose(p181hd.InterfaceC9529a r5, vc.InterfaceC11588c<?> r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.compose.runtime.ProduceStateScopeImpl.C25611
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.runtime.ProduceStateScopeImpl$awaitDispose$1 r0 = (androidx.compose.runtime.ProduceStateScopeImpl.C25611) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.runtime.ProduceStateScopeImpl$awaitDispose$1 r0 = new androidx.compose.runtime.ProduceStateScopeImpl$awaitDispose$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2d:
            java.lang.Object r5 = r0.L$0
            hd.a r5 = (p181hd.InterfaceC9529a) r5
            kotlin.AbstractC9924b.m20071b(r6)     // Catch: java.lang.Throwable -> L35
            goto L5a
        L35:
            r6 = move-exception
            goto L60
        L37:
            kotlin.AbstractC9924b.m20071b(r6)
            r0.L$0 = r5     // Catch: java.lang.Throwable -> L35
            r0.label = r3     // Catch: java.lang.Throwable -> L35
            kotlinx.coroutines.c r6 = new kotlinx.coroutines.c     // Catch: java.lang.Throwable -> L35
            vc.c r2 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.m20224d(r0)     // Catch: java.lang.Throwable -> L35
            r6.<init>(r2, r3)     // Catch: java.lang.Throwable -> L35
            r6.m20503F()     // Catch: java.lang.Throwable -> L35
            java.lang.Object r6 = r6.m20538x()     // Catch: java.lang.Throwable -> L35
            java.lang.Object r2 = p393wc.AbstractC11725a.m25952f()     // Catch: java.lang.Throwable -> L35
            if (r6 != r2) goto L57
            p409xc.AbstractC11831f.m26221c(r0)     // Catch: java.lang.Throwable -> L35
        L57:
            if (r6 != r1) goto L5a
            return r1
        L5a:
            kotlin.KotlinNothingValueException r6 = new kotlin.KotlinNothingValueException     // Catch: java.lang.Throwable -> L35
            r6.<init>()     // Catch: java.lang.Throwable -> L35
            throw r6     // Catch: java.lang.Throwable -> L35
        L60:
            r5.invoke()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ProduceStateScopeImpl.awaitDispose(hd.a, vc.c):java.lang.Object");
    }

    @Override // androidx.compose.runtime.MutableState
    public T component1() {
        return this.$$delegate_0.component1();
    }

    @Override // androidx.compose.runtime.MutableState
    public InterfaceC9540l component2() {
        return this.$$delegate_0.component2();
    }

    @Override // androidx.compose.runtime.ProduceStateScope, sd.InterfaceC11122i0
    public InterfaceC9945d getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // androidx.compose.runtime.MutableState, androidx.compose.runtime.State
    public T getValue() {
        return this.$$delegate_0.getValue();
    }

    @Override // androidx.compose.runtime.MutableState
    public void setValue(T t10) {
        this.$$delegate_0.setValue(t10);
    }
}
