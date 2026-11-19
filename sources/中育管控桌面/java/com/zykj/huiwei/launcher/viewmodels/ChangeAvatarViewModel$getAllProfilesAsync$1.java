package com.zykj.huiwei.launcher.viewmodels;

import com.zykj.huiwei.launcher.bean.AvatarItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata(m7879d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m7880d2 = {"<anonymous>", "", "it", "", "Lcom/zykj/huiwei/launcher/bean/AvatarItem;"}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "com.zykj.huiwei.launcher.viewmodels.ChangeAvatarViewModel$getAllProfilesAsync$1", m7918f = "ChangeAvatarViewModel.kt", m7919i = {}, m7920l = {}, m7921m = "invokeSuspend", m7922n = {}, m7923s = {})
/* loaded from: classes4.dex */
public final class ChangeAvatarViewModel$getAllProfilesAsync$1 extends SuspendLambda implements Function2<List<AvatarItem>, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f6988a;

    /* renamed from: b */
    public /* synthetic */ Object f6989b;

    /* renamed from: c */
    public final /* synthetic */ ChangeAvatarViewModel f6990c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChangeAvatarViewModel$getAllProfilesAsync$1(ChangeAvatarViewModel changeAvatarViewModel, Continuation continuation) {
        super(2, continuation);
        this.f6990c = changeAvatarViewModel;
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(List list, Continuation continuation) {
        return ((ChangeAvatarViewModel$getAllProfilesAsync$1) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChangeAvatarViewModel$getAllProfilesAsync$1 changeAvatarViewModel$getAllProfilesAsync$1 = new ChangeAvatarViewModel$getAllProfilesAsync$1(this.f6990c, continuation);
        changeAvatarViewModel$getAllProfilesAsync$1.f6989b = obj;
        return changeAvatarViewModel$getAllProfilesAsync$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list = (List) this.f6989b;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f6988a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.f6990c.getAvatarItems().setValue(list);
        return Unit.INSTANCE;
    }
}
