package com.zykj.huiwei.launcher.viewmodels;

// RE note 本类字节码直接引用的读写或显示接口包括DataStore。

import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import androidx.datastore.preferences.core.PreferencesKt;
import com.zykj.huiwei.launcher.ext.CommonExtKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m7879d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m7880d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "com.zykj.huiwei.launcher.viewmodels.MainViewModel$setDeviceId$1", m7918f = "MainViewModel.kt", m7919i = {}, m7920l = {125}, m7921m = "invokeSuspend", m7922n = {}, m7923s = {})
/* loaded from: classes4.dex */
public final class MainViewModel$setDeviceId$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f7250a;

    /* renamed from: b */
    public final /* synthetic */ MainViewModel f7251b;

    /* renamed from: c */
    public final /* synthetic */ String f7252c;

    @Metadata(m7879d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m7880d2 = {"<anonymous>", "", "it", "Landroidx/datastore/preferences/core/MutablePreferences;"}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
    @DebugMetadata(m7917c = "com.zykj.huiwei.launcher.viewmodels.MainViewModel$setDeviceId$1$1", m7918f = "MainViewModel.kt", m7919i = {}, m7920l = {}, m7921m = "invokeSuspend", m7922n = {}, m7923s = {})
    /* renamed from: com.zykj.huiwei.launcher.viewmodels.MainViewModel$setDeviceId$1$1 */
    public static final class C61901 extends SuspendLambda implements Function2<MutablePreferences, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f7253a;

        /* renamed from: b */
        public /* synthetic */ Object f7254b;

        /* renamed from: c */
        public final /* synthetic */ String f7255c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C61901(String str, Continuation continuation) {
            super(2, continuation);
            this.f7255c = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(MutablePreferences mutablePreferences, Continuation continuation) {
            return ((C61901) create(mutablePreferences, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C61901 c61901 = new C61901(this.f7255c, continuation);
            c61901.f7254b = obj;
            return c61901;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            MutablePreferences mutablePreferences = (MutablePreferences) this.f7254b;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f7253a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            mutablePreferences.set(PreferencesKeys.stringKey("deviceId"), this.f7255c);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainViewModel$setDeviceId$1(MainViewModel mainViewModel, String str, Continuation continuation) {
        super(2, continuation);
        this.f7251b = mainViewModel;
        this.f7252c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MainViewModel$setDeviceId$1(this.f7251b, this.f7252c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i6 = this.f7250a;
        if (i6 == 0) {
            ResultKt.throwOnFailure(obj);
            this.f7251b.m6152h().setValue(this.f7252c);
            DataStore dataStoreM5311d = CommonExtKt.m5311d(this.f7251b.application);
            C61901 c61901 = new C61901(this.f7252c, null);
            this.f7250a = 1;
            if (PreferencesKt.edit(dataStoreM5311d, c61901, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((MainViewModel$setDeviceId$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
