package androidx.lifecycle;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.AbstractC10006d;
import kotlinx.coroutines.InterfaceC10045g;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import sd.AbstractC11108e2;
import sd.C11157r0;

/* loaded from: classes2.dex */
public final class CoroutineLiveData<T> extends MediatorLiveData<T> {
    private BlockRunner<T> blockRunner;
    private EmittedSource emittedSource;

    public /* synthetic */ CoroutineLiveData(InterfaceC9945d interfaceC9945d, long j10, InterfaceC9544p interfaceC9544p, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? EmptyCoroutineContext.f23351c : interfaceC9945d, (i10 & 2) != 0 ? CoroutineLiveDataKt.DEFAULT_TIMEOUT : j10, interfaceC9544p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q _init_$lambda$0(CoroutineLiveData coroutineLiveData) {
        coroutineLiveData.blockRunner = null;
        return C10786q.f26013a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object clearSource$lifecycle_livedata_release(vc.InterfaceC11588c<? super p309qc.C10786q> r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.lifecycle.CoroutineLiveData$clearSource$1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.lifecycle.CoroutineLiveData$clearSource$1 r0 = (androidx.lifecycle.CoroutineLiveData$clearSource$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.lifecycle.CoroutineLiveData$clearSource$1 r0 = new androidx.lifecycle.CoroutineLiveData$clearSource$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.AbstractC9924b.m20071b(r5)
            goto L41
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.AbstractC9924b.m20071b(r5)
            androidx.lifecycle.EmittedSource r5 = r4.emittedSource
            if (r5 == 0) goto L41
            r0.label = r3
            java.lang.Object r5 = r5.disposeNow(r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            r5 = 0
            r4.emittedSource = r5
            qc.q r5 = p309qc.C10786q.f26013a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.CoroutineLiveData.clearSource$lifecycle_livedata_release(vc.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        if (r7 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emitSource$lifecycle_livedata_release(androidx.lifecycle.LiveData<T> r6, vc.InterfaceC11588c<? super sd.InterfaceC11163t0> r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.lifecycle.CoroutineLiveData$emitSource$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.lifecycle.CoroutineLiveData$emitSource$1 r0 = (androidx.lifecycle.CoroutineLiveData$emitSource$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.lifecycle.CoroutineLiveData$emitSource$1 r0 = new androidx.lifecycle.CoroutineLiveData$emitSource$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.AbstractC9924b.m20071b(r7)
            goto L56
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r6 = r0.L$0
            androidx.lifecycle.LiveData r6 = (androidx.lifecycle.LiveData) r6
            kotlin.AbstractC9924b.m20071b(r7)
            goto L4a
        L3c:
            kotlin.AbstractC9924b.m20071b(r7)
            r0.L$0 = r6
            r0.label = r4
            java.lang.Object r7 = r5.clearSource$lifecycle_livedata_release(r0)
            if (r7 != r1) goto L4a
            goto L55
        L4a:
            r7 = 0
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r7 = androidx.lifecycle.CoroutineLiveDataKt.addDisposableSource(r5, r6, r0)
            if (r7 != r1) goto L56
        L55:
            return r1
        L56:
            androidx.lifecycle.EmittedSource r7 = (androidx.lifecycle.EmittedSource) r7
            r5.emittedSource = r7
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.CoroutineLiveData.emitSource$lifecycle_livedata_release(androidx.lifecycle.LiveData, vc.c):java.lang.Object");
    }

    @Override // androidx.lifecycle.MediatorLiveData, androidx.lifecycle.LiveData
    public void onActive() {
        super.onActive();
        BlockRunner<T> blockRunner = this.blockRunner;
        if (blockRunner != null) {
            blockRunner.maybeRun();
        }
    }

    @Override // androidx.lifecycle.MediatorLiveData, androidx.lifecycle.LiveData
    public void onInactive() {
        super.onInactive();
        BlockRunner<T> blockRunner = this.blockRunner;
        if (blockRunner != null) {
            blockRunner.cancel();
        }
    }

    public CoroutineLiveData(InterfaceC9945d context, long j10, InterfaceC9544p block) {
        AbstractC9979u.m20294g(context, "context");
        AbstractC9979u.m20294g(block, "block");
        this.blockRunner = new BlockRunner<>(this, block, j10, AbstractC10006d.m20744a(C11157r0.m24800c().mo25209k().plus(context).plus(AbstractC11108e2.m24700a((InterfaceC10045g) context.get(InterfaceC10045g.f23976b0)))), new InterfaceC9529a() { // from class: androidx.lifecycle.c
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return CoroutineLiveData._init_$lambda$0(this.f1514c);
            }
        });
    }
}
