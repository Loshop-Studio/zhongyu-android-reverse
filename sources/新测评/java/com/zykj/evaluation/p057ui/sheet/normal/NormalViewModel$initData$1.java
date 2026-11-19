package com.zykj.evaluation.p057ui.sheet.normal;

import com.zykj.evaluation.bean.bundle.AnswerSheetBundle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.ui.sheet.normal.NormalViewModel$initData$1", m13596f = "NormalViewModel.kt", m13597i = {2, 2}, m13598l = {211, 214, 231}, m13599m = "invokeSuspend", m13600n = {"config", "pageSize"}, m13601s = {"L$0", "I$0"})
/* loaded from: classes4.dex */
public final class NormalViewModel$initData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public Object f10104a;

    /* renamed from: b */
    public int f10105b;

    /* renamed from: c */
    public int f10106c;

    /* renamed from: d */
    public final /* synthetic */ NormalViewModel f10107d;

    /* renamed from: e */
    public final /* synthetic */ AnswerSheetBundle f10108e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NormalViewModel$initData$1(NormalViewModel normalViewModel, AnswerSheetBundle answerSheetBundle, Continuation continuation) {
        super(2, continuation);
        this.f10107d = normalViewModel;
        this.f10108e = answerSheetBundle;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NormalViewModel$initData$1(this.f10107d, this.f10108e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Exception {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r8.f10106c
            r2 = 0
            r3 = 3
            r4 = 1
            r5 = 2
            if (r1 == 0) goto L31
            if (r1 == r4) goto L29
            if (r1 == r5) goto L25
            if (r1 != r3) goto L1d
            int r0 = r8.f10105b
            java.lang.Object r1 = r8.f10104a
            com.zykj.evaluation.bean.PaperConfig r1 = (com.zykj.evaluation.bean.PaperConfig) r1
            kotlin.ResultKt.throwOnFailure(r9)
            goto Lc1
        L1d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L25:
            kotlin.ResultKt.throwOnFailure(r9)
            goto L71
        L29:
            java.lang.Object r1 = r8.f10104a
            com.zykj.evaluation.ui.sheet.normal.NormalViewModel r1 = (com.zykj.evaluation.p057ui.sheet.normal.NormalViewModel) r1
            kotlin.ResultKt.throwOnFailure(r9)
            goto L51
        L31:
            kotlin.ResultKt.throwOnFailure(r9)
            com.zykj.evaluation.ui.sheet.normal.NormalViewModel r9 = r8.f10107d
            v6.v r1 = r9.m10202u()
            v6.w$c r6 = p267v6.AbstractC9706w.c.f17033a
            r7 = 0
            v6.v r1 = p267v6.C9705v.m16210b(r1, r6, r7, r5, r2)
            r9.m10188P(r1)
            com.zykj.evaluation.ui.sheet.normal.NormalViewModel r1 = r8.f10107d
            r8.f10104a = r1
            r8.f10106c = r4
            java.lang.Object r9 = com.zykj.evaluation.p057ui.sheet.normal.NormalViewModel.m10244i0(r1, r8)
            if (r9 != r0) goto L51
            goto Lbf
        L51:
            byte[] r9 = (byte[]) r9
            if (r9 == 0) goto Lc9
            com.zykj.evaluation.p057ui.sheet.normal.NormalViewModel.m10258w0(r1, r9)
            com.zykj.evaluation.ui.sheet.normal.NormalViewModel r9 = r8.f10107d
            com.zykj.evaluation.bean.bundle.AnswerSheetBundle r1 = r8.f10108e
            java.lang.String r1 = r1.getAddress()
            com.zykj.evaluation.bean.bundle.AnswerSheetBundle r4 = r8.f10108e
            long r6 = r4.getTestPagerId()
            r8.f10104a = r2
            r8.f10106c = r5
            java.lang.Object r9 = com.zykj.evaluation.p057ui.sheet.normal.NormalViewModel.m10252q0(r9, r1, r6, r8)
            if (r9 != r0) goto L71
            goto Lbf
        L71:
            com.zykj.evaluation.ui.sheet.normal.NormalViewModel r9 = r8.f10107d
            com.zykj.evaluation.bean.PaperConfig r9 = com.zykj.evaluation.p057ui.sheet.normal.NormalViewModel.m10238d0(r9)
            if (r9 != 0) goto L7c
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        L7c:
            com.zykj.evaluation.ui.sheet.normal.NormalViewModel r1 = r8.f10107d
            com.zykj.evaluation.p057ui.sheet.normal.NormalViewModel.m10250o0(r1, r9)
            com.zykj.evaluation.ui.sheet.normal.NormalViewModel r1 = r8.f10107d
            g7.j r2 = p101g7.C7594j.f12739a
            java.lang.String r4 = r9.getVersion()
            com.zykj.evaluation.bean.bundle.AnswerSheetBundle r5 = r8.f10108e
            boolean r5 = r5.isNoStem()
            boolean r2 = r2.m12484a(r4, r5)
            com.zykj.evaluation.p057ui.sheet.normal.NormalViewModel.m10257v0(r1, r2)
            java.util.List r1 = r9.getPages()
            int r1 = r1.size()
            com.zykj.evaluation.ui.sheet.normal.NormalViewModel r2 = r8.f10107d
            com.zykj.evaluation.p057ui.sheet.normal.NormalViewModel.m10233Y(r2, r1)
            com.zykj.evaluation.ui.sheet.normal.NormalViewModel r2 = r8.f10107d
            com.zykj.evaluation.p057ui.sheet.normal.NormalViewModel.m10249n0(r2, r1)
            com.zykj.evaluation.ui.sheet.normal.NormalViewModel r2 = r8.f10107d
            com.zykj.evaluation.p057ui.sheet.normal.NormalViewModel.m10251p0(r2, r1)
            com.zykj.evaluation.ui.sheet.normal.NormalViewModel r2 = r8.f10107d
            java.lang.Object r9 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r9)
            r8.f10104a = r9
            r8.f10105b = r1
            r8.f10106c = r3
            java.lang.Object r9 = com.zykj.evaluation.p057ui.sheet.normal.NormalViewModel.m10254s0(r2, r8)
            if (r9 != r0) goto Lc0
        Lbf:
            return r0
        Lc0:
            r0 = r1
        Lc1:
            com.zykj.evaluation.ui.sheet.normal.NormalViewModel r9 = r8.f10107d
            com.zykj.evaluation.p057ui.sheet.normal.NormalViewModel.m10253r0(r9, r0)
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        Lc9:
            java.lang.Exception r9 = new java.lang.Exception
            java.lang.String r0 = "TFLite init Failed"
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.p057ui.sheet.normal.NormalViewModel$initData$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/ui/sheet/normal/NormalViewModel$initData$1.smali:152
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((NormalViewModel$initData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
