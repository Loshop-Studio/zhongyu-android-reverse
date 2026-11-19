package com.zykj.evaluation.submit;

import com.tencent.bugly.crashreport.BuglyLog;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import p167m5.AbstractC8555e;

@Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.submit.SubmitWork$doWork$2$job$1", m13596f = "SubmitWork.kt", m13597i = {}, m13598l = {91, 91}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
/* loaded from: classes4.dex */
public final class SubmitWork$doWork$2$job$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f8953a;

    /* renamed from: b */
    public final /* synthetic */ SubmitWork f8954b;

    /* renamed from: c */
    public final /* synthetic */ long f8955c;

    /* renamed from: d */
    public final /* synthetic */ long f8956d;

    /* renamed from: e */
    public final /* synthetic */ int f8957e;

    /* renamed from: f */
    public final /* synthetic */ Ref.ObjectRef f8958f;

    @Metadata(m13557d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m13558d2 = {"<anonymous>", "", "list", "", ""}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "com.zykj.evaluation.submit.SubmitWork$doWork$2$job$1$1", m13596f = "SubmitWork.kt", m13597i = {}, m13598l = {}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
    @SourceDebugExtension({"SMAP\nSubmitWork.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubmitWork.kt\ncom/zykj/evaluation/submit/SubmitWork$doWork$2$job$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,206:1\n1869#2,2:207\n*S KotlinDebug\n*F\n+ 1 SubmitWork.kt\ncom/zykj/evaluation/submit/SubmitWork$doWork$2$job$1$1\n*L\n95#1:207,2\n*E\n"})
    /* renamed from: com.zykj.evaluation.submit.SubmitWork$doWork$2$job$1$1 */
    public static final class C68751 extends SuspendLambda implements Function2<List<? extends Integer>, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f8959a;

        /* renamed from: b */
        public /* synthetic */ Object f8960b;

        /* renamed from: c */
        public final /* synthetic */ Ref.ObjectRef f8961c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C68751(Ref.ObjectRef objectRef, Continuation continuation) {
            super(2, continuation);
            this.f8961c = objectRef;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(List list, Continuation continuation) {
            return ((C68751) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C68751 c68751 = new C68751(this.f8961c, continuation);
            c68751.f8960b = obj;
            return c68751;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List list = (List) this.f8960b;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f8959a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Iterator it = list.iterator();
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                if (iIntValue == AbstractC8555e.c.f14191b.m14097a()) {
                    i10++;
                } else if (iIntValue == AbstractC8555e.b.f14190b.m14097a()) {
                    i12++;
                } else if (iIntValue == AbstractC8555e.a.f14189b.m14097a()) {
                    i11++;
                }
            }
            this.f8961c.element = i10 > 0 ? AbstractC8555e.c.f14191b : i11 > 0 ? AbstractC8555e.a.f14189b : AbstractC8555e.b.f14190b;
            BuglyLog.m4754i("SubmitWork", "committing: " + i10 + ", success: " + i12 + ", fail: " + i11);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubmitWork$doWork$2$job$1(SubmitWork submitWork, long j10, long j11, int i10, Ref.ObjectRef objectRef, Continuation continuation) {
        super(2, continuation);
        this.f8954b = submitWork;
        this.f8955c = j10;
        this.f8956d = j11;
        this.f8957e = i10;
        this.f8958f = objectRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SubmitWork$doWork$2$job$1(this.f8954b, this.f8955c, this.f8956d, this.f8957e, this.f8958f, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.collectLatest((kotlinx.coroutines.flow.Flow) r11, r1, r10) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r10.f8953a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L20
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L13
            kotlin.ResultKt.throwOnFailure(r11)
            r9 = r10
            goto L49
        L13:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1b:
            kotlin.ResultKt.throwOnFailure(r11)
            r9 = r10
            goto L36
        L20:
            kotlin.ResultKt.throwOnFailure(r11)
            r11 = r3
            com.zykj.evaluation.submit.SubmitWork r3 = r10.f8954b
            long r4 = r10.f8955c
            long r6 = r10.f8956d
            int r8 = r10.f8957e
            r10.f8953a = r11
            r9 = r10
            java.lang.Object r11 = r3.mo8782o(r4, r6, r8, r9)
            if (r11 != r0) goto L36
            goto L48
        L36:
            kotlinx.coroutines.flow.Flow r11 = (kotlinx.coroutines.flow.Flow) r11
            com.zykj.evaluation.submit.SubmitWork$doWork$2$job$1$1 r1 = new com.zykj.evaluation.submit.SubmitWork$doWork$2$job$1$1
            kotlin.jvm.internal.Ref$ObjectRef r3 = r9.f8958f
            r4 = 0
            r1.<init>(r3, r4)
            r9.f8953a = r2
            java.lang.Object r11 = kotlinx.coroutines.flow.FlowKt.collectLatest(r11, r1, r10)
            if (r11 != r0) goto L49
        L48:
            return r0
        L49:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.submit.SubmitWork$doWork$2$job$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/submit/SubmitWork$doWork$2$job$1.smali:158
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((SubmitWork$doWork$2$job$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
