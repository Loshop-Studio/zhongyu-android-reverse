package com.zykj.huiwei.launcher.p035ui.fragment.applist;

import com.zykj.huiwei.launcher.bean.BaseAppInfo;
import com.zykj.huiwei.launcher.bean.resp.AppData;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata(m7879d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001H\n"}, m7880d2 = {"<anonymous>", "", "Lcom/zykj/huiwei/launcher/bean/resp/AppData;", "it", "Lcom/zykj/huiwei/launcher/bean/BaseAppInfo;"}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "com.zykj.huiwei.launcher.ui.fragment.applist.LCAppListViewModel$lCFilterAppList$1", m7918f = "LCAppListViewModel.kt", m7919i = {}, m7920l = {}, m7921m = "invokeSuspend", m7922n = {}, m7923s = {})
/* loaded from: classes4.dex */
public final class LCAppListViewModel$lCFilterAppList$1 extends SuspendLambda implements Function2<List<? extends BaseAppInfo>, Continuation<? super List<? extends AppData>>, Object> {

    /* renamed from: a */
    public int f6879a;

    /* renamed from: b */
    public /* synthetic */ Object f6880b;

    /* renamed from: c */
    public final /* synthetic */ LCAppListViewModel f6881c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LCAppListViewModel$lCFilterAppList$1(LCAppListViewModel lCAppListViewModel, Continuation continuation) {
        super(2, continuation);
        this.f6881c = lCAppListViewModel;
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(List list, Continuation continuation) {
        return ((LCAppListViewModel$lCFilterAppList$1) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        LCAppListViewModel$lCFilterAppList$1 lCAppListViewModel$lCFilterAppList$1 = new LCAppListViewModel$lCFilterAppList$1(this.f6881c, continuation);
        lCAppListViewModel$lCFilterAppList$1.f6880b = obj;
        return lCAppListViewModel$lCFilterAppList$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list = (List) this.f6880b;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f6879a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return this.f6881c.m5990a(list);
    }
}
