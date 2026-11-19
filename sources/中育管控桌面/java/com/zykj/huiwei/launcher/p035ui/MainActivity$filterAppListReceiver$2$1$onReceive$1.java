package com.zykj.huiwei.launcher.p035ui;

// RE note 本类字节码直接引用的读写或显示接口包括DataStore。

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.PreferencesKt;
import com.zykj.huiwei.launcher.bean.LcAppInfo;
import com.zykj.huiwei.launcher.ext.CommonExtKt;
import com.zykj.huiwei.launcher.viewmodels.MainViewModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m7879d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m7880d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "com.zykj.huiwei.launcher.ui.MainActivity$filterAppListReceiver$2$1$onReceive$1", m7918f = "MainActivity.kt", m7919i = {0, 0}, m7920l = {255}, m7921m = "invokeSuspend", m7922n = {"list", "$i$a$-runCatching-MainActivity$filterAppListReceiver$2$1$onReceive$1$1"}, m7923s = {"L$1", "I$0"})
@SourceDebugExtension({"SMAP\nMainActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainActivity.kt\ncom/zykj/huiwei/launcher/ui/MainActivity$filterAppListReceiver$2$1$onReceive$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,456:1\n1563#2:457\n1634#2,3:458\n*S KotlinDebug\n*F\n+ 1 MainActivity.kt\ncom/zykj/huiwei/launcher/ui/MainActivity$filterAppListReceiver$2$1$onReceive$1\n*L\n259#1:457\n259#1:458,3\n*E\n"})
/* loaded from: classes4.dex */
public final class MainActivity$filterAppListReceiver$2$1$onReceive$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public Object f6325a;

    /* renamed from: b */
    public Object f6326b;

    /* renamed from: c */
    public int f6327c;

    /* renamed from: d */
    public int f6328d;

    /* renamed from: e */
    public final /* synthetic */ Intent f6329e;

    /* renamed from: f */
    public final /* synthetic */ MainActivity f6330f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainActivity$filterAppListReceiver$2$1$onReceive$1(Intent intent, MainActivity mainActivity, Continuation continuation) {
        super(2, continuation);
        this.f6329e = intent;
        this.f6330f = mainActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MainActivity$filterAppListReceiver$2$1$onReceive$1(this.f6329e, this.f6330f, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM17183constructorimpl;
        MainActivity mainActivity;
        List list;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i6 = this.f6328d;
        try {
            if (i6 == 0) {
                ResultKt.throwOnFailure(obj);
                Intent intent = this.f6329e;
                mainActivity = this.f6330f;
                Result.Companion companion = Result.INSTANCE;
                Serializable serializableExtra = intent != null ? intent.getSerializableExtra("applist") : null;
                Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                List list2 = (List) serializableExtra;
                Context baseContext = mainActivity.getBaseContext();
                Intrinsics.checkNotNullExpressionValue(baseContext, "getBaseContext(...)");
                DataStore dataStoreM5311d = CommonExtKt.m5311d(baseContext);
                MainActivity$filterAppListReceiver$2$1$onReceive$1$1$1 mainActivity$filterAppListReceiver$2$1$onReceive$1$1$1 = new MainActivity$filterAppListReceiver$2$1$onReceive$1$1$1(list2, null);
                this.f6325a = mainActivity;
                this.f6326b = list2;
                this.f6327c = 0;
                this.f6328d = 1;
                if (PreferencesKt.edit(dataStoreM5311d, mainActivity$filterAppListReceiver$2$1$onReceive$1$1$1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                list = list2;
            } else {
                if (i6 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) this.f6326b;
                mainActivity = (MainActivity) this.f6325a;
                ResultKt.throwOnFailure(obj);
            }
            MainViewModel mainViewModelM5552S = mainActivity.m5552S();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new LcAppInfo((String) it.next(), true));
            }
            mainViewModelM5552S.m6160p(arrayList);
            objM17183constructorimpl = Result.m17183constructorimpl(Boxing.boxInt(Log.e("-----", "onReceive: filterReceiver1 " + list)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM17183constructorimpl = Result.m17183constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM17186exceptionOrNullimpl = Result.m17186exceptionOrNullimpl(objM17183constructorimpl);
        if (thM17186exceptionOrNullimpl != null) {
            thM17186exceptionOrNullimpl.printStackTrace();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((MainActivity$filterAppListReceiver$2$1$onReceive$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
