package com.zykj.huiwei.launcher.viewmodels;

import com.zykj.huiwei.launcher.bean.HomeTime;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

@Metadata(m7879d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m7880d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "com.zykj.huiwei.launcher.viewmodels.HomeViewModel$startShowHomeTime$1", m7918f = "HomeViewModel.kt", m7919i = {}, m7920l = {200}, m7921m = "invokeSuspend", m7922n = {}, m7923s = {})
/* loaded from: classes4.dex */
public final class HomeViewModel$startShowHomeTime$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f7109a;

    /* renamed from: b */
    public final /* synthetic */ HomeViewModel f7110b;

    @Metadata(m7879d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m7880d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/zykj/huiwei/launcher/bean/HomeTime;"}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
    @DebugMetadata(m7917c = "com.zykj.huiwei.launcher.viewmodels.HomeViewModel$startShowHomeTime$1$1", m7918f = "HomeViewModel.kt", m7919i = {0, 0, 0, 0, 0, 1, 1, 1}, m7920l = {194, 197}, m7921m = "invokeSuspend", m7922n = {"$this$flow", "homeTime", "it", "time", "$i$a$-let-HomeViewModel$startShowHomeTime$1$1$1", "$this$flow", "homeTime", "time"}, m7923s = {"L$0", "L$1", "L$2", "J$0", "I$0", "L$0", "L$1", "J$0"})
    /* renamed from: com.zykj.huiwei.launcher.viewmodels.HomeViewModel$startShowHomeTime$1$1 */
    public static final class C61841 extends SuspendLambda implements Function2<FlowCollector<? super HomeTime>, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public Object f7111a;

        /* renamed from: b */
        public Object f7112b;

        /* renamed from: c */
        public long f7113c;

        /* renamed from: d */
        public int f7114d;

        /* renamed from: e */
        public int f7115e;

        /* renamed from: f */
        public /* synthetic */ Object f7116f;

        public C61841(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C61841 c61841 = new C61841(continuation);
            c61841.f7116f = obj;
            return c61841;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super HomeTime> flowCollector, Continuation<? super Unit> continuation) {
            return invoke2((FlowCollector) flowCollector, (Continuation) continuation);
        }

        /* JADX WARN: Path cross not found for [B:13:0x004b, B:16:0x0085], limit reached: 18 */
        /* JADX WARN: Path cross not found for [B:16:0x0085, B:13:0x004b], limit reached: 18 */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0039 A[PHI: r2
          0x0039: PHI (r2v3 com.zykj.huiwei.launcher.bean.HomeTime) = 
          (r2v1 com.zykj.huiwei.launcher.bean.HomeTime)
          (r2v2 com.zykj.huiwei.launcher.bean.HomeTime)
          (r2v9 com.zykj.huiwei.launcher.bean.HomeTime)
         binds: [B:10:0x0030, B:17:0x0096, B:6:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:13:0x004b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0096 -> B:11:0x0039). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = r10.f7116f
                kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r10.f7115e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L30
                if (r2 == r4) goto L22
                if (r2 != r3) goto L1a
                java.lang.Object r2 = r10.f7111a
                com.zykj.huiwei.launcher.bean.HomeTime r2 = (com.zykj.huiwei.launcher.bean.HomeTime) r2
                kotlin.ResultKt.throwOnFailure(r11)
                goto L39
            L1a:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L22:
                long r5 = r10.f7113c
                java.lang.Object r2 = r10.f7112b
                java.lang.String r2 = (java.lang.String) r2
                java.lang.Object r2 = r10.f7111a
                com.zykj.huiwei.launcher.bean.HomeTime r2 = (com.zykj.huiwei.launcher.bean.HomeTime) r2
                kotlin.ResultKt.throwOnFailure(r11)
                goto L85
            L30:
                kotlin.ResultKt.throwOnFailure(r11)
                com.zykj.huiwei.launcher.bean.HomeTime r11 = new com.zykj.huiwei.launcher.bean.HomeTime
                r11.<init>()
                r2 = r11
            L39:
                long r5 = java.lang.System.currentTimeMillis()
                java.lang.String r11 = p163u3.AbstractC7772d.m9302b(r5)
                java.lang.String r7 = r2.getTime()
                boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r11, r7)
                if (r7 != 0) goto L85
                r2.setTime(r11)
                java.lang.String r7 = p163u3.AbstractC7772d.m9301a(r5)
                java.lang.String r8 = p163u3.AbstractC7772d.m9303c(r5)
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                r9.append(r7)
                java.lang.String r7 = "/"
                r9.append(r7)
                r9.append(r8)
                java.lang.String r7 = r9.toString()
                r2.setDate(r7)
                r10.f7116f = r0
                r10.f7111a = r2
                java.lang.Object r11 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r11)
                r10.f7112b = r11
                r10.f7113c = r5
                r11 = 0
                r10.f7114d = r11
                r10.f7115e = r4
                java.lang.Object r11 = r0.emit(r2, r10)
                if (r11 != r1) goto L85
                goto L98
            L85:
                r10.f7116f = r0
                r10.f7111a = r2
                r11 = 0
                r10.f7112b = r11
                r10.f7113c = r5
                r10.f7115e = r3
                r5 = 1000(0x3e8, double:4.94E-321)
                java.lang.Object r11 = kotlinx.coroutines.DelayKt.delay(r5, r10)
                if (r11 != r1) goto L39
            L98:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zykj.huiwei.launcher.viewmodels.HomeViewModel$startShowHomeTime$1.C61841.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/viewmodels/HomeViewModel$startShowHomeTime$1$1.smali:169
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(FlowCollector flowCollector, Continuation continuation) {
            return ((C61841) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* renamed from: com.zykj.huiwei.launcher.viewmodels.HomeViewModel$startShowHomeTime$1$a */
    public static final class C6185a implements FlowCollector {

        /* renamed from: a */
        public final /* synthetic */ HomeViewModel f7117a;

        public C6185a(HomeViewModel homeViewModel) {
            this.f7117a = homeViewModel;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(HomeTime homeTime, Continuation continuation) {
            this.f7117a._showHomeTime.setValue(homeTime);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeViewModel$startShowHomeTime$1(HomeViewModel homeViewModel, Continuation continuation) {
        super(2, continuation);
        this.f7110b = homeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HomeViewModel$startShowHomeTime$1(this.f7110b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i6 = this.f7109a;
        if (i6 == 0) {
            ResultKt.throwOnFailure(obj);
            Flow flowFlowOn = FlowKt.flowOn(FlowKt.flow(new C61841(null)), Dispatchers.getMain());
            C6185a c6185a = new C6185a(this.f7110b);
            this.f7109a = 1;
            if (flowFlowOn.collect(c6185a, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((HomeViewModel$startShowHomeTime$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
