package com.zykj.huiwei.launcher.viewmodels;

import com.zykj.huiwei.launcher.bean.resp.MessageType;
import com.zykj.huiwei.launcher.bean.resp.UnReadMessageBean;
import com.zykj.huiwei.launcher.repository.NotificationRepository;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m7879d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m7880d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "com.zykj.huiwei.launcher.viewmodels.HomeViewModel$getUnReadCount$1", m7918f = "HomeViewModel.kt", m7919i = {}, m7920l = {229}, m7921m = "invokeSuspend", m7922n = {}, m7923s = {})
@SourceDebugExtension({"SMAP\nHomeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeViewModel.kt\ncom/zykj/huiwei/launcher/viewmodels/HomeViewModel$getUnReadCount$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,373:1\n295#2,2:374\n*S KotlinDebug\n*F\n+ 1 HomeViewModel.kt\ncom/zykj/huiwei/launcher/viewmodels/HomeViewModel$getUnReadCount$1\n*L\n231#1:374,2\n*E\n"})
/* loaded from: classes4.dex */
public final class HomeViewModel$getUnReadCount$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f7101a;

    /* renamed from: b */
    public final /* synthetic */ HomeViewModel f7102b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeViewModel$getUnReadCount$1(HomeViewModel homeViewModel, Continuation continuation) {
        super(2, continuation);
        this.f7102b = homeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HomeViewModel$getUnReadCount$1(this.f7102b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object next;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i6 = this.f7101a;
        if (i6 == 0) {
            ResultKt.throwOnFailure(obj);
            NotificationRepository notificationRepository = this.f7102b.notificationRepository;
            this.f7101a = 1;
            obj = notificationRepository.m5428f(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        Iterator it = ((List) obj).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((UnReadMessageBean) next).getType() == MessageType.NoticePublish.getType()) {
                break;
            }
        }
        UnReadMessageBean unReadMessageBean = (UnReadMessageBean) next;
        int count = unReadMessageBean != null ? unReadMessageBean.getCount() : 0;
        this.f7102b._unReadNoticeCount.postValue(Boxing.boxInt(count));
        this.f7102b._unReadMessageCount.postValue(Boxing.boxInt(0));
        this.f7102b._isMsgDotVisible.postValue(Boxing.boxBoolean(count > 0));
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((HomeViewModel$getUnReadCount$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
