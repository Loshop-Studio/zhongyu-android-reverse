package com.zykj.evaluation.p057ui.guide.noStem;

import com.zykj.evaluation.bean.AskForHelpReq;
import com.zykj.http.bean.ApiResp;
import com.zykj.http.exception.RemoteCodeException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import p122i6.C7670b;
import p122i6.C7690l;
import p122i6.C7697o0;
import p189o5.AbstractC8711g;
import p200p5.InterfaceC8843j;

@Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.ui.guide.noStem.NoStemViewModel$setAskForHelp$1", m13596f = "NoStemViewModel.kt", m13597i = {}, m13598l = {122}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
@SourceDebugExtension({"SMAP\nNoStemViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NoStemViewModel.kt\ncom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$setAskForHelp$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,336:1\n1563#2:337\n1634#2,2:338\n1563#2:340\n1634#2,3:341\n1636#2:344\n*S KotlinDebug\n*F\n+ 1 NoStemViewModel.kt\ncom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$setAskForHelp$1\n*L\n130#1:337\n130#1:338,2\n132#1:340\n132#1:341,3\n130#1:344\n*E\n"})
/* loaded from: classes4.dex */
public final class NoStemViewModel$setAskForHelp$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f9586a;

    /* renamed from: b */
    public final /* synthetic */ NoStemViewModel f9587b;

    /* renamed from: c */
    public final /* synthetic */ long f9588c;

    /* renamed from: d */
    public final /* synthetic */ boolean f9589d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoStemViewModel$setAskForHelp$1(NoStemViewModel noStemViewModel, long j10, boolean z9, Continuation continuation) {
        super(2, continuation);
        this.f9587b = noStemViewModel;
        this.f9588c = j10;
        this.f9589d = z9;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NoStemViewModel$setAskForHelp$1(this.f9587b, this.f9588c, this.f9589d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws RemoteCodeException {
        Object objM14826h;
        long j10;
        C7697o0 c7697o0;
        ArrayList arrayList;
        int i10;
        ArrayList arrayList2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f9586a;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC8843j interfaceC8843j = this.f9587b.androidx.core.app.NotificationCompat.CATEGORY_SERVICE java.lang.String;
            AskForHelpReq askForHelpReq = new AskForHelpReq(this.f9587b.m9776q(), this.f9588c, this.f9589d);
            this.f9586a = 1;
            objM14826h = interfaceC8843j.m14826h(askForHelpReq, this);
            if (objM14826h == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objM14826h = obj;
        }
        AbstractC8711g.m14347b((ApiResp) objM14826h);
        NoStemViewModel noStemViewModel = this.f9587b;
        long j11 = this.f9588c;
        boolean z9 = this.f9589d;
        C7697o0 c7697o0M9827V = noStemViewModel.m9827V();
        List<C7670b> listM12880b = noStemViewModel.m9827V().m12880b();
        int i12 = 10;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM12880b, 10));
        for (C7670b c7670b : listM12880b) {
            List<C7690l> listM12811e = c7670b.m12811e();
            ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM12811e, i12));
            for (C7690l c7690lM12868b : listM12811e) {
                if (c7690lM12868b.m12873f() == j11) {
                    j10 = j11;
                    arrayList = arrayList3;
                    i10 = i12;
                    arrayList2 = arrayList4;
                    c7697o0 = c7697o0M9827V;
                    c7690lM12868b = C7690l.m12868b(c7690lM12868b, null, 0L, false, z9, 0, null, null, null, 247, null);
                } else {
                    j10 = j11;
                    c7697o0 = c7697o0M9827V;
                    arrayList = arrayList3;
                    i10 = i12;
                    arrayList2 = arrayList4;
                }
                arrayList2.add(c7690lM12868b);
                c7697o0M9827V = c7697o0;
                arrayList3 = arrayList;
                arrayList4 = arrayList2;
                j11 = j10;
                i12 = i10;
            }
            arrayList3.add(C7670b.m12807b(c7670b, null, null, null, arrayList4, 7, null));
            j11 = j11;
        }
        noStemViewModel.m9831Z(c7697o0M9827V.m12879a(arrayList3));
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((NoStemViewModel$setAskForHelp$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
