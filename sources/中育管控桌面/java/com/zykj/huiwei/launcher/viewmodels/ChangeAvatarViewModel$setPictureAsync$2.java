package com.zykj.huiwei.launcher.viewmodels;

import com.zykj.huiwei.launcher.proto.C6075m;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata(m7879d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/proto/m;", "it", "", "<anonymous>", "(Lcom/zykj/huiwei/launcher/proto/m;)V"}, m7881k = 3, m7882mv = {2, 2, 0})
@DebugMetadata(m7917c = "com.zykj.huiwei.launcher.viewmodels.ChangeAvatarViewModel$setPictureAsync$2", m7918f = "ChangeAvatarViewModel.kt", m7919i = {}, m7920l = {}, m7921m = "invokeSuspend", m7922n = {}, m7923s = {})
/* loaded from: classes4.dex */
public final class ChangeAvatarViewModel$setPictureAsync$2 extends SuspendLambda implements Function2<C6075m, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f6994a;

    /* renamed from: b */
    public /* synthetic */ Object f6995b;

    /* renamed from: c */
    public final /* synthetic */ ChangeAvatarViewModel f6996c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChangeAvatarViewModel$setPictureAsync$2(ChangeAvatarViewModel changeAvatarViewModel, Continuation continuation) {
        super(2, continuation);
        this.f6996c = changeAvatarViewModel;
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(C6075m c6075m, Continuation continuation) {
        return ((ChangeAvatarViewModel$setPictureAsync$2) create(c6075m, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChangeAvatarViewModel$setPictureAsync$2 changeAvatarViewModel$setPictureAsync$2 = new ChangeAvatarViewModel$setPictureAsync$2(this.f6996c, continuation);
        changeAvatarViewModel$setPictureAsync$2.f6995b = obj;
        return changeAvatarViewModel$setPictureAsync$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C6075m c6075m = (C6075m) this.f6995b;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f6994a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.f6996c.getUserCacheBean().setValue(c6075m);
        return Unit.INSTANCE;
    }
}
