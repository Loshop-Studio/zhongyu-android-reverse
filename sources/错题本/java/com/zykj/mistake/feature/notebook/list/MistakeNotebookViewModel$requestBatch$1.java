package com.zykj.mistake.feature.notebook.list;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6009v;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
@DebugMetadata(m5302c = "com.zykj.mistake.feature.notebook.list.MistakeNotebookViewModel$requestBatch$1", m5303f = "MistakeNotebookViewModel.kt", m5304i = {0, 0}, m5305l = {749}, m5306m = "invokeSuspend", m5307n = {"error", "request"}, m5308s = {"L$0", "L$2"})
/* loaded from: classes3.dex */
final class MistakeNotebookViewModel$requestBatch$1 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ InterfaceC6469a $onSuccess;
    final /* synthetic */ List<InterfaceC6471c> $requests;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ MistakeNotebookViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MistakeNotebookViewModel$requestBatch$1(MistakeNotebookViewModel mistakeNotebookViewModel, List<? extends InterfaceC6471c> list, InterfaceC6469a interfaceC6469a, InterfaceC5631c<? super MistakeNotebookViewModel$requestBatch$1> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.this$0 = mistakeNotebookViewModel;
        this.$requests = list;
        this.$onSuccess = interfaceC6469a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        return new MistakeNotebookViewModel$requestBatch$1(this.this$0, this.$requests, this.$onSuccess, interfaceC5631c);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003a A[PHI: r1 r6
      0x003a: PHI (r1v4 java.util.Iterator<r6.c>) = (r1v2 java.util.Iterator<r6.c>), (r1v5 java.util.Iterator<r6.c>) binds: [B:8:0x0028, B:15:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x003a: PHI (r6v12 java.lang.Throwable) = (r6v4 java.lang.Throwable), (r6v17 java.lang.Throwable) binds: [B:8:0x0028, B:15:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0052 -> B:14:0x0055). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r5.label
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L28
            if (r1 != r2) goto L20
            java.lang.Object r1 = r5.L$2
            r6.c r1 = (p152r6.InterfaceC6471c) r1
            java.lang.Object r1 = r5.L$1
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r4 = r5.L$0
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            kotlin.AbstractC5774b.m5119b(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r6 = r6.getValue()
            goto L55
        L20:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L28:
            kotlin.AbstractC5774b.m5119b(r6)
            com.zykj.mistake.feature.notebook.list.MistakeNotebookViewModel r6 = r5.this$0
            com.zykj.mistake.feature.notebook.list.w r1 = com.zykj.mistake.feature.notebook.list.C4984w.f7620a
            r6.m4296h(r1)
            java.util.List<r6.c> r6 = r5.$requests
            java.util.Iterator r6 = r6.iterator()
            r1 = r6
            r6 = r3
        L3a:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L5b
            java.lang.Object r6 = r1.next()
            r6.c r6 = (p152r6.InterfaceC6471c) r6
            r5.L$0 = r3
            r5.L$1 = r1
            r5.L$2 = r3
            r5.label = r2
            java.lang.Object r6 = com.zykj.mistake.data.AbstractC4496e.m3978a(r6, r5)
            if (r6 != r0) goto L55
            return r0
        L55:
            java.lang.Throwable r6 = kotlin.Result.m13959exceptionOrNullimpl(r6)
            if (r6 == 0) goto L3a
        L5b:
            if (r6 != 0) goto L63
            r6.a r6 = r5.$onSuccess
            r6.invoke()
            goto L75
        L63:
            com.zykj.mistake.feature.notebook.list.MistakeNotebookViewModel r0 = r5.this$0
            com.zykj.mistake.feature.notebook.list.x r1 = new com.zykj.mistake.feature.notebook.list.x
            java.lang.String r6 = r6.getMessage()
            if (r6 != 0) goto L6f
            java.lang.String r6 = ""
        L6f:
            r1.<init>(r6)
            r0.m4296h(r1)
        L75:
            com.zykj.mistake.feature.notebook.list.MistakeNotebookViewModel r6 = r5.this$0
            com.zykj.mistake.feature.notebook.list.o r0 = com.zykj.mistake.feature.notebook.list.C4968o.f7589a
            r6.m4296h(r0)
            d6.s r6 = p045d6.C5443s.f8405a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.mistake.feature.notebook.list.MistakeNotebookViewModel$requestBatch$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/错题本/smali_classes3/com/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel$requestBatch$1.smali:216
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
        return ((MistakeNotebookViewModel$requestBatch$1) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
