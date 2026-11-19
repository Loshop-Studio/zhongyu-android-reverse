package com.zykj.huiwei.launcher.p035ui;

import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import com.blankj.utilcode.util.AbstractC4658m;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata(m7879d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m7880d2 = {"<anonymous>", "", "it", "Landroidx/datastore/preferences/core/MutablePreferences;"}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "com.zykj.huiwei.launcher.ui.MainActivity$appStatusFilterReceiver$2$1$onReceive$1$1$1", m7918f = "MainActivity.kt", m7919i = {}, m7920l = {}, m7921m = "invokeSuspend", m7922n = {}, m7923s = {})
/* loaded from: classes4.dex */
public final class MainActivity$appStatusFilterReceiver$2$1$onReceive$1$1$1 extends SuspendLambda implements Function2<MutablePreferences, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f6317a;

    /* renamed from: b */
    public /* synthetic */ Object f6318b;

    /* renamed from: c */
    public final /* synthetic */ List f6319c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainActivity$appStatusFilterReceiver$2$1$onReceive$1$1$1(List list, Continuation continuation) {
        super(2, continuation);
        this.f6319c = list;
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(MutablePreferences mutablePreferences, Continuation continuation) {
        return ((MainActivity$appStatusFilterReceiver$2$1$onReceive$1$1$1) create(mutablePreferences, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MainActivity$appStatusFilterReceiver$2$1$onReceive$1$1$1 mainActivity$appStatusFilterReceiver$2$1$onReceive$1$1$1 = new MainActivity$appStatusFilterReceiver$2$1$onReceive$1$1$1(this.f6319c, continuation);
        mainActivity$appStatusFilterReceiver$2$1$onReceive$1$1$1.f6318b = obj;
        return mainActivity$appStatusFilterReceiver$2$1$onReceive$1$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutablePreferences mutablePreferences = (MutablePreferences) this.f6318b;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f6317a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        mutablePreferences.set(PreferencesKeys.stringKey("apps_status_list"), AbstractC4658m.m2265h(this.f6319c));
        return Unit.INSTANCE;
    }
}
