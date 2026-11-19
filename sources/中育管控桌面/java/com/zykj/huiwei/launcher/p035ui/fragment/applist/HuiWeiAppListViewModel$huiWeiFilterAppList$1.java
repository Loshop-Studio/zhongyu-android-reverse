package com.zykj.huiwei.launcher.p035ui.fragment.applist;

import com.zykj.huiwei.launcher.bean.BaseAppInfo;
import com.zykj.huiwei.launcher.bean.resp.AppData;
import com.zykj.huiwei.launcher.bean.resp.DisableAppInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m7879d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001H\n"}, m7880d2 = {"<anonymous>", "", "Lcom/zykj/huiwei/launcher/bean/resp/AppData;", "appList", "Lcom/zykj/huiwei/launcher/bean/BaseAppInfo;", "disableAppList", "Lcom/zykj/huiwei/launcher/bean/resp/DisableAppInfo;"}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "com.zykj.huiwei.launcher.ui.fragment.applist.HuiWeiAppListViewModel$huiWeiFilterAppList$1", m7918f = "HuiWeiAppListViewModel.kt", m7919i = {}, m7920l = {}, m7921m = "invokeSuspend", m7922n = {}, m7923s = {})
@SourceDebugExtension({"SMAP\nHuiWeiAppListViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HuiWeiAppListViewModel.kt\ncom/zykj/huiwei/launcher/ui/fragment/applist/HuiWeiAppListViewModel$huiWeiFilterAppList$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,36:1\n827#2:37\n855#2:38\n1761#2,3:39\n856#2:42\n*S KotlinDebug\n*F\n+ 1 HuiWeiAppListViewModel.kt\ncom/zykj/huiwei/launcher/ui/fragment/applist/HuiWeiAppListViewModel$huiWeiFilterAppList$1\n*L\n22#1:37\n22#1:38\n23#1:39,3\n22#1:42\n*E\n"})
/* loaded from: classes4.dex */
public final class HuiWeiAppListViewModel$huiWeiFilterAppList$1 extends SuspendLambda implements Function3<List<? extends BaseAppInfo>, List<? extends DisableAppInfo>, Continuation<? super List<? extends AppData>>, Object> {

    /* renamed from: a */
    public int f6848a;

    /* renamed from: b */
    public /* synthetic */ Object f6849b;

    /* renamed from: c */
    public /* synthetic */ Object f6850c;

    /* renamed from: d */
    public final /* synthetic */ HuiWeiAppListViewModel f6851d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HuiWeiAppListViewModel$huiWeiFilterAppList$1(HuiWeiAppListViewModel huiWeiAppListViewModel, Continuation continuation) {
        super(3, continuation);
        this.f6851d = huiWeiAppListViewModel;
    }

    @Override // kotlin.jvm.functions.Function3
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(List list, List list2, Continuation continuation) {
        HuiWeiAppListViewModel$huiWeiFilterAppList$1 huiWeiAppListViewModel$huiWeiFilterAppList$1 = new HuiWeiAppListViewModel$huiWeiFilterAppList$1(this.f6851d, continuation);
        huiWeiAppListViewModel$huiWeiFilterAppList$1.f6849b = list;
        huiWeiAppListViewModel$huiWeiFilterAppList$1.f6850c = list2;
        return huiWeiAppListViewModel$huiWeiFilterAppList$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list = (List) this.f6849b;
        List list2 = (List) this.f6850c;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f6848a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            BaseAppInfo baseAppInfo = (BaseAppInfo) obj2;
            if (list2 == null || !list2.isEmpty()) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    if (Intrinsics.areEqual(baseAppInfo.getPackageName(), ((DisableAppInfo) it.next()).getPackageName())) {
                        break;
                    }
                }
            }
            arrayList.add(obj2);
        }
        return this.f6851d.m5990a(arrayList);
    }
}
