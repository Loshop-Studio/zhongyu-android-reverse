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
@DebugMetadata(m7917c = "com.zykj.huiwei.launcher.ui.MainActivity$filterAppListReceiver$2$1$onReceive$1$1$1", m7918f = "MainActivity.kt", m7919i = {}, m7920l = {}, m7921m = "invokeSuspend", m7922n = {}, m7923s = {})
/* loaded from: classes4.dex */
public final class MainActivity$filterAppListReceiver$2$1$onReceive$1$1$1 extends SuspendLambda implements Function2<MutablePreferences, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f6331a;

    /* renamed from: b */
    public /* synthetic */ Object f6332b;

    /* renamed from: c */
    public final /* synthetic */ List f6333c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainActivity$filterAppListReceiver$2$1$onReceive$1$1$1(List list, Continuation continuation) {
        super(2, continuation);
        this.f6333c = list;
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(MutablePreferences mutablePreferences, Continuation continuation) {
        return ((MainActivity$filterAppListReceiver$2$1$onReceive$1$1$1) create(mutablePreferences, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MainActivity$filterAppListReceiver$2$1$onReceive$1$1$1 mainActivity$filterAppListReceiver$2$1$onReceive$1$1$1 = new MainActivity$filterAppListReceiver$2$1$onReceive$1$1$1(this.f6333c, continuation);
        mainActivity$filterAppListReceiver$2$1$onReceive$1$1$1.f6332b = obj;
        return mainActivity$filterAppListReceiver$2$1$onReceive$1$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutablePreferences mutablePreferences = (MutablePreferences) this.f6332b;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f6331a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        mutablePreferences.set(PreferencesKeys.stringKey("applist"), AbstractC4658m.m2265h(this.f6333c));
        return Unit.INSTANCE;
    }
}
