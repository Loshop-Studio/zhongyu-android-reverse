package com.zykj.student.dialogue.p076ui.home;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.home.HomeFilterViewModel$getSubjectList$1", m13451f = "HomeFilterViewModel.kt", m13452i = {0}, m13453l = {208}, m13454m = "invokeSuspend", m13455n = {"$i$a$-runCatching-HomeFilterViewModel$getSubjectList$1$1"}, m13456s = {"I$0"})
@SourceDebugExtension({"SMAP\nHomeFilterViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeFilterViewModel.kt\ncom/zykj/student/dialogue/ui/home/HomeFilterViewModel$getSubjectList$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,380:1\n1563#2:381\n1634#2,3:382\n*S KotlinDebug\n*F\n+ 1 HomeFilterViewModel.kt\ncom/zykj/student/dialogue/ui/home/HomeFilterViewModel$getSubjectList$1\n*L\n211#1:381\n211#1:382,3\n*E\n"})
/* loaded from: classes5.dex */
public final class HomeFilterViewModel$getSubjectList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f11404a;

    /* renamed from: b */
    public int f11405b;

    /* renamed from: c */
    public final /* synthetic */ HomeFilterViewModel f11406c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeFilterViewModel$getSubjectList$1(HomeFilterViewModel homeFilterViewModel, Continuation continuation) {
        super(2, continuation);
        this.f11406c = homeFilterViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HomeFilterViewModel$getSubjectList$1(this.f11406c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0078 A[Catch: all -> 0x0013, TryCatch #0 {all -> 0x0013, blocks: (B:5:0x000d, B:15:0x0034, B:17:0x003e, B:18:0x0055, B:20:0x005b, B:21:0x0072, B:24:0x007c, B:23:0x0078, B:12:0x0022), top: B:35:0x0009 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.student.dialogue.p076ui.home.HomeFilterViewModel$getSubjectList$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/随身答/smali_classes5/com/zykj/student/dialogue/ui/home/HomeFilterViewModel$getSubjectList$1.smali:145
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((HomeFilterViewModel$getSubjectList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
