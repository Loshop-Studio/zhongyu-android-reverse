package com.zykj.huiwei.launcher.viewmodels;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import com.zykj.base.BaseViewModel;
import com.zykj.huiwei.launcher.repository.UserRepository;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

@StabilityInferred(parameters = 0)
@Metadata(m7879d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\u000e"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/viewmodels/CustomerServiceViewModel;", "Lcom/zykj/base/BaseViewModel;", "Lcom/zykj/huiwei/launcher/repository/UserRepository;", "userRepository", "<init>", "(Lcom/zykj/huiwei/launcher/repository/UserRepository;)V", "a", "Lcom/zykj/huiwei/launcher/repository/UserRepository;", "Landroidx/lifecycle/MutableLiveData;", "Lcom/zykj/huiwei/launcher/bean/resp/SchoolSettingResp;", "b", "Landroidx/lifecycle/MutableLiveData;", "()Landroidx/lifecycle/MutableLiveData;", "schoolSetting", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public final class CustomerServiceViewModel extends BaseViewModel {

    /* renamed from: a, reason: from kotlin metadata */
    public final UserRepository userRepository;

    /* renamed from: b, reason: from kotlin metadata */
    public final MutableLiveData schoolSetting;

    @Metadata(m7879d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m7880d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
    @DebugMetadata(m7917c = "com.zykj.huiwei.launcher.viewmodels.CustomerServiceViewModel$1", m7918f = "CustomerServiceViewModel.kt", m7919i = {}, m7920l = {17}, m7921m = "invokeSuspend", m7922n = {}, m7923s = {})
    /* renamed from: com.zykj.huiwei.launcher.viewmodels.CustomerServiceViewModel$1 */
    public static final class C61781 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public Object f6999a;

        /* renamed from: b */
        public int f7000b;

        public C61781(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return CustomerServiceViewModel.this.new C61781(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return invoke2(coroutineScope, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            MutableLiveData mutableLiveData;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i6 = this.f7000b;
            if (i6 == 0) {
                ResultKt.throwOnFailure(obj);
                MutableLiveData schoolSetting = CustomerServiceViewModel.this.getSchoolSetting();
                UserRepository userRepository = CustomerServiceViewModel.this.userRepository;
                this.f6999a = schoolSetting;
                this.f7000b = 1;
                Object objM5434c = userRepository.m5434c(this);
                if (objM5434c == coroutine_suspended) {
                    return coroutine_suspended;
                }
                mutableLiveData = schoolSetting;
                obj = objM5434c;
            } else {
                if (i6 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutableLiveData = (MutableLiveData) this.f6999a;
                ResultKt.throwOnFailure(obj);
            }
            mutableLiveData.postValue(obj);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C61781) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public CustomerServiceViewModel(UserRepository userRepository) {
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.userRepository = userRepository;
        this.schoolSetting = new MutableLiveData();
        launch(getToastLiveData(), isDialogVisible(), new C61781(null));
    }

    /* renamed from: b, reason: from getter */
    public final MutableLiveData getSchoolSetting() {
        return this.schoolSetting;
    }
}
