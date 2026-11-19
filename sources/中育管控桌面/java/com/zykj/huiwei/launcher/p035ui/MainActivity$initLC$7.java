package com.zykj.huiwei.launcher.p035ui;

// RE note 本类字节码直接引用的读写或显示接口包括DataStore。

import android.content.Context;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import com.blankj.utilcode.util.AbstractC4658m;
import com.zykj.huiwei.launcher.bean.LcAppInfo;
import com.zykj.huiwei.launcher.ext.CommonExtKt;
import com.zykj.huiwei.launcher.viewmodels.MainViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@Metadata(m7879d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m7880d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "com.zykj.huiwei.launcher.ui.MainActivity$initLC$7", m7918f = "MainActivity.kt", m7919i = {}, m7920l = {370}, m7921m = "invokeSuspend", m7922n = {}, m7923s = {})
@SourceDebugExtension({"SMAP\nMainActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainActivity.kt\ncom/zykj/huiwei/launcher/ui/MainActivity$initLC$7\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,456:1\n1563#2:457\n1634#2,3:458\n1563#2:461\n1634#2,3:462\n*S KotlinDebug\n*F\n+ 1 MainActivity.kt\ncom/zykj/huiwei/launcher/ui/MainActivity$initLC$7\n*L\n375#1:457\n375#1:458,3\n388#1:461\n388#1:462,3\n*E\n"})
/* loaded from: classes4.dex */
public final class MainActivity$initLC$7 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f6342a;

    /* renamed from: b */
    public final /* synthetic */ MainActivity f6343b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainActivity$initLC$7(MainActivity mainActivity, Continuation continuation) {
        super(2, continuation);
        this.f6343b = mainActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MainActivity$initLC$7(this.f6343b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List listEmptyList;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i6 = this.f6342a;
        if (i6 == 0) {
            ResultKt.throwOnFailure(obj);
            Context baseContext = this.f6343b.getBaseContext();
            Intrinsics.checkNotNullExpressionValue(baseContext, "getBaseContext(...)");
            Flow data = CommonExtKt.m5311d(baseContext).getData();
            this.f6342a = 1;
            obj = FlowKt.firstOrNull(data, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        Preferences preferences = (Preferences) obj;
        if (preferences != null) {
            MainActivity mainActivity = this.f6343b;
            String str = null;
            try {
                Result.Companion companion = Result.INSTANCE;
                String str2 = (String) preferences.get(PreferencesKeys.stringKey("applist"));
                if (str2 != null) {
                    Object objM2260c = AbstractC4658m.m2260c(str2, AbstractC4658m.m2263f(String.class));
                    Intrinsics.checkNotNullExpressionValue(objM2260c, "fromJson(...)");
                    List list = (List) objM2260c;
                    MainViewModel mainViewModelM5552S = mainActivity.m5552S();
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new LcAppInfo((String) it.next(), true));
                    }
                    mainViewModelM5552S.m6160p(arrayList);
                } else {
                    str2 = null;
                }
                Result.m17183constructorimpl(str2);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m17183constructorimpl(ResultKt.createFailure(th));
            }
            try {
                String str3 = (String) preferences.get(PreferencesKeys.stringKey("apps_status_list"));
                if (str3 != null) {
                    Object objM2260c2 = AbstractC4658m.m2260c(str3, AbstractC4658m.m2263f(Map.class));
                    Intrinsics.checkNotNullExpressionValue(objM2260c2, "fromJson(...)");
                    MainViewModel mainViewModelM5552S2 = mainActivity.m5552S();
                    Map map = (Map) CollectionsKt.getOrNull((List) objM2260c2, 0);
                    if (map != null) {
                        List<String> list2 = CollectionsKt.toList(map.keySet());
                        listEmptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                        for (String str4 : list2) {
                            Integer num = (Integer) map.get(str4);
                            listEmptyList.add(new LcAppInfo(str4, num != null && num.intValue() == 0));
                        }
                    } else {
                        listEmptyList = CollectionsKt.emptyList();
                    }
                    mainViewModelM5552S2.m6162r(listEmptyList);
                    str = str3;
                }
                Result.m17183constructorimpl(str);
            } catch (Throwable th2) {
                Result.Companion companion3 = Result.INSTANCE;
                Result.m17183constructorimpl(ResultKt.createFailure(th2));
            }
        }
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((MainActivity$initLC$7) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
