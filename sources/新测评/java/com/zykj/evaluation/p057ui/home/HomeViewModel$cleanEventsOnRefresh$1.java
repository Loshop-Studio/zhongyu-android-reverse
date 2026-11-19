package com.zykj.evaluation.p057ui.home;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.ui.home.HomeViewModel$cleanEventsOnRefresh$1", m13596f = "HomeViewModel.kt", m13597i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, m13598l = {696}, m13599m = "invokeSuspend", m13600n = {"$this$update$iv", "prevValue$iv", "data", "$this$invokeSuspend_u24lambda_u243_u24lambda_u242", "$this$forEach$iv", "element$iv", "modifyInfo", "$i$f$update", "$i$a$-update-HomeViewModel$cleanEventsOnRefresh$1$1", "$i$a$-apply-HomeViewModel$cleanEventsOnRefresh$1$1$1", "$i$f$forEach", "$i$a$-forEach-HomeViewModel$cleanEventsOnRefresh$1$1$1$1", "taskId", "isCommitting"}, m13601s = {"L$0", "L$2", "L$3", "L$5", "L$6", "L$8", "L$9", "I$0", "I$1", "I$2", "I$3", "I$4", "J$0", "I$5"})
@SourceDebugExtension({"SMAP\nHomeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeViewModel.kt\ncom/zykj/evaluation/ui/home/HomeViewModel$cleanEventsOnRefresh$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,715:1\n230#2,3:716\n233#2,2:721\n216#3,2:719\n*S KotlinDebug\n*F\n+ 1 HomeViewModel.kt\ncom/zykj/evaluation/ui/home/HomeViewModel$cleanEventsOnRefresh$1\n*L\n691#1:716,3\n691#1:721,2\n693#1:719,2\n*E\n"})
/* loaded from: classes4.dex */
public final class HomeViewModel$cleanEventsOnRefresh$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public Object f9823a;

    /* renamed from: b */
    public Object f9824b;

    /* renamed from: c */
    public Object f9825c;

    /* renamed from: d */
    public Object f9826d;

    /* renamed from: e */
    public Object f9827e;

    /* renamed from: f */
    public Object f9828f;

    /* renamed from: g */
    public Object f9829g;

    /* renamed from: h */
    public Object f9830h;

    /* renamed from: i */
    public Object f9831i;

    /* renamed from: j */
    public Object f9832j;

    /* renamed from: k */
    public int f9833k;

    /* renamed from: l */
    public int f9834l;

    /* renamed from: m */
    public int f9835m;

    /* renamed from: n */
    public int f9836n;

    /* renamed from: o */
    public int f9837o;

    /* renamed from: p */
    public int f9838p;

    /* renamed from: q */
    public long f9839q;

    /* renamed from: r */
    public int f9840r;

    /* renamed from: s */
    public final /* synthetic */ HomeViewModel f9841s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeViewModel$cleanEventsOnRefresh$1(HomeViewModel homeViewModel, Continuation continuation) {
        super(2, continuation);
        this.f9841s = homeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HomeViewModel$cleanEventsOnRefresh$1(this.f9841s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:22:0x0138, B:24:0x013d], limit reached: 38 */
    /* JADX WARN: Path cross not found for [B:26:0x0140, B:27:0x0142], limit reached: 38 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0112 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x015f  */
    /* JADX WARN: Type inference failed for: r14v8, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r15v6, types: [java.util.Map] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0113 -> B:16:0x0121). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.p057ui.home.HomeViewModel$cleanEventsOnRefresh$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/ui/home/HomeViewModel$cleanEventsOnRefresh$1.smali:216
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((HomeViewModel$cleanEventsOnRefresh$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
