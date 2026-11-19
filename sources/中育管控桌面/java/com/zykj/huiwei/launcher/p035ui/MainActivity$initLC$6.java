package com.zykj.huiwei.launcher.p035ui;

import com.zykj.huiwei.launcher.bean.BaseAppInfo;
import com.zykj.huiwei.launcher.bean.LcAppInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

@Metadata(m7879d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m7880d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "com.zykj.huiwei.launcher.ui.MainActivity$initLC$6", m7918f = "MainActivity.kt", m7919i = {}, m7920l = {350}, m7921m = "invokeSuspend", m7922n = {}, m7923s = {})
/* loaded from: classes4.dex */
public final class MainActivity$initLC$6 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f6337a;

    /* renamed from: b */
    public final /* synthetic */ MainActivity f6338b;

    @Metadata(m7879d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00040\u0003H\n"}, m7880d2 = {"<anonymous>", "", "pair", "Lkotlin/Triple;", "", "Lcom/zykj/huiwei/launcher/bean/LcAppInfo;", "Lcom/zykj/huiwei/launcher/bean/BaseAppInfo;"}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
    @DebugMetadata(m7917c = "com.zykj.huiwei.launcher.ui.MainActivity$initLC$6$1", m7918f = "MainActivity.kt", m7919i = {}, m7920l = {}, m7921m = "invokeSuspend", m7922n = {}, m7923s = {})
    @SourceDebugExtension({"SMAP\nMainActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainActivity.kt\ncom/zykj/huiwei/launcher/ui/MainActivity$initLC$6$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,456:1\n774#2:457\n865#2:458\n295#2,2:459\n295#2,2:461\n866#2:463\n*S KotlinDebug\n*F\n+ 1 MainActivity.kt\ncom/zykj/huiwei/launcher/ui/MainActivity$initLC$6$1\n*L\n351#1:457\n351#1:458\n358#1:459,2\n360#1:461,2\n351#1:463\n*E\n"})
    /* renamed from: com.zykj.huiwei.launcher.ui.MainActivity$initLC$6$1 */
    public static final class C60941 extends SuspendLambda implements Function2<Triple<? extends List<? extends LcAppInfo>, ? extends List<? extends LcAppInfo>, ? extends List<? extends BaseAppInfo>>, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f6339a;

        /* renamed from: b */
        public /* synthetic */ Object f6340b;

        /* renamed from: c */
        public final /* synthetic */ MainActivity f6341c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C60941(MainActivity mainActivity, Continuation continuation) {
            super(2, continuation);
            this.f6341c = mainActivity;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Triple triple, Continuation continuation) {
            return ((C60941) create(triple, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C60941 c60941 = new C60941(this.f6341c, continuation);
            c60941.f6340b = obj;
            return c60941;
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x00ca  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r0 = r13.f6340b
                kotlin.Triple r0 = (kotlin.Triple) r0
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r13.f6339a
                if (r1 != 0) goto Ld8
                kotlin.ResultKt.throwOnFailure(r14)
                com.zykj.huiwei.launcher.ui.MainActivity r14 = r13.f6341c
                com.zykj.huiwei.launcher.viewmodels.MainViewModel r14 = com.zykj.huiwei.launcher.p035ui.MainActivity.m5519D(r14)
                kotlinx.coroutines.flow.MutableStateFlow r14 = r14.getAppList()
                java.lang.Object r1 = r0.getThird()
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                com.zykj.huiwei.launcher.ui.MainActivity r2 = r13.f6341c
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                java.util.Iterator r1 = r1.iterator()
            L29:
                boolean r4 = r1.hasNext()
                if (r4 == 0) goto Ld2
                java.lang.Object r4 = r1.next()
                r5 = r4
                com.zykj.huiwei.launcher.bean.BaseAppInfo r5 = (com.zykj.huiwei.launcher.bean.BaseAppInfo) r5
                java.lang.String r6 = r5.getPackageName()
                java.lang.String r7 = r2.getPackageName()
                boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r7)
                r7 = 0
                if (r6 != 0) goto Lcb
                java.lang.String r6 = r5.getActivityName()
                java.lang.String r8 = "com.innofidei.guardsecure.dataclean.PullNewsActivity"
                boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r8)
                if (r6 != 0) goto Lca
                java.lang.String r6 = r5.getActivityName()
                java.lang.String r8 = "com.android.launcher3.activity.PullNewsActivity"
                boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r8)
                if (r6 != 0) goto Lca
                java.lang.Object r6 = r0.getSecond()
                java.lang.Iterable r6 = (java.lang.Iterable) r6
                java.util.Iterator r6 = r6.iterator()
            L67:
                boolean r8 = r6.hasNext()
                r9 = 0
                if (r8 == 0) goto L92
                java.lang.Object r8 = r6.next()
                r10 = r8
                com.zykj.huiwei.launcher.bean.LcAppInfo r10 = (com.zykj.huiwei.launcher.bean.LcAppInfo) r10
                java.lang.String r11 = r10.getName()
                java.lang.String r12 = r5.getActivityName()
                boolean r11 = kotlin.jvm.internal.Intrinsics.areEqual(r11, r12)
                if (r11 != 0) goto L93
                java.lang.String r10 = r10.getName()
                java.lang.String r11 = r5.getPackageName()
                boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual(r10, r11)
                if (r10 == 0) goto L67
                goto L93
            L92:
                r8 = r9
            L93:
                com.zykj.huiwei.launcher.bean.LcAppInfo r8 = (com.zykj.huiwei.launcher.bean.LcAppInfo) r8
                if (r8 != 0) goto Lc0
                java.lang.Object r6 = r0.getFirst()
                java.lang.Iterable r6 = (java.lang.Iterable) r6
                java.util.Iterator r6 = r6.iterator()
            La1:
                boolean r8 = r6.hasNext()
                if (r8 == 0) goto Lbd
                java.lang.Object r8 = r6.next()
                r10 = r8
                com.zykj.huiwei.launcher.bean.LcAppInfo r10 = (com.zykj.huiwei.launcher.bean.LcAppInfo) r10
                java.lang.String r10 = r10.getName()
                java.lang.String r11 = r5.getPackageName()
                boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual(r10, r11)
                if (r10 == 0) goto La1
                r9 = r8
            Lbd:
                r8 = r9
                com.zykj.huiwei.launcher.bean.LcAppInfo r8 = (com.zykj.huiwei.launcher.bean.LcAppInfo) r8
            Lc0:
                if (r8 == 0) goto Lc7
                boolean r5 = r8.getVisible()
                goto Lc8
            Lc7:
                r5 = r7
            Lc8:
                if (r5 == 0) goto Lcb
            Lca:
                r7 = 1
            Lcb:
                if (r7 == 0) goto L29
                r3.add(r4)
                goto L29
            Ld2:
                r14.setValue(r3)
                kotlin.Unit r14 = kotlin.Unit.INSTANCE
                return r14
            Ld8:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zykj.huiwei.launcher.p035ui.MainActivity$initLC$6.C60941.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/ui/MainActivity$initLC$6$1.smali:155
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainActivity$initLC$6(MainActivity mainActivity, Continuation continuation) {
        super(2, continuation);
        this.f6338b = mainActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MainActivity$initLC$6(this.f6338b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i6 = this.f6337a;
        if (i6 == 0) {
            ResultKt.throwOnFailure(obj);
            StateFlow shownAppList = this.f6338b.m5552S().getShownAppList();
            C60941 c60941 = new C60941(this.f6338b, null);
            this.f6337a = 1;
            if (FlowKt.collectLatest(shownAppList, c60941, this) == coroutine_suspended) {
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
        return ((MainActivity$initLC$6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
