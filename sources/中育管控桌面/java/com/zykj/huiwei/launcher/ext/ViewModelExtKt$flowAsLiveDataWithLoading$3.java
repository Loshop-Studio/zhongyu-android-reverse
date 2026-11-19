package com.zykj.huiwei.launcher.ext;

import androidx.exifinterface.media.ExifInterface;
import com.blankj.utilcode.util.AbstractC4668s;
import com.zykj.base.BaseViewModel;
import com.zykj.base.bean.toast.ToastErrorCodeMessage;
import com.zykj.base.bean.toast.ToastErrorMessage;
import com.zykj.http.exception.RemoteCodeException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(m7879d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m7880d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/FlowCollector;", "it", ""}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "com.zykj.huiwei.launcher.ext.ViewModelExtKt$flowAsLiveDataWithLoading$3", m7918f = "ViewModelExt.kt", m7919i = {0, 0}, m7920l = {62}, m7921m = "invokeSuspend", m7922n = {"it", "toastMessage"}, m7923s = {"L$0", "L$1"})
/* loaded from: classes4.dex */
public final class ViewModelExtKt$flowAsLiveDataWithLoading$3 extends SuspendLambda implements Function3<FlowCollector<Object>, Throwable, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public Object f6089a;

    /* renamed from: b */
    public int f6090b;

    /* renamed from: c */
    public /* synthetic */ Object f6091c;

    /* renamed from: d */
    public final /* synthetic */ Function2 f6092d;

    /* renamed from: e */
    public final /* synthetic */ BaseViewModel f6093e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewModelExtKt$flowAsLiveDataWithLoading$3(Function2 function2, BaseViewModel baseViewModel, Continuation continuation) {
        super(3, continuation);
        this.f6092d = function2;
        this.f6093e = baseViewModel;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(FlowCollector<Object> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
        return invoke2((FlowCollector) flowCollector, th, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Throwable th = (Throwable) this.f6091c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i6 = this.f6090b;
        if (i6 == 0) {
            ResultKt.throwOnFailure(obj);
            AbstractC4668s.m2377i("flow.catch--->" + Thread.currentThread().getName());
            Throwable cause = th.getCause();
            if (cause != null) {
                cause.printStackTrace();
            }
            Throwable cause2 = th.getCause();
            Object toastErrorCodeMessage = cause2 instanceof RemoteCodeException ? new ToastErrorCodeMessage(((RemoteCodeException) cause2).getErrorCodeInfo()) : new ToastErrorMessage(Boxing.boxInt(-1), "未知错误", null, 4, null);
            Function2 function2 = this.f6092d;
            if (function2 != null) {
                this.f6091c = SpillingKt.nullOutSpilledVariable(th);
                this.f6089a = toastErrorCodeMessage;
                this.f6090b = 1;
                if (function2.invoke(toastErrorCodeMessage, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                this.f6093e.getToastLiveData().setValue(toastErrorCodeMessage);
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
    public final Object invoke2(FlowCollector flowCollector, Throwable th, Continuation continuation) {
        ViewModelExtKt$flowAsLiveDataWithLoading$3 viewModelExtKt$flowAsLiveDataWithLoading$3 = new ViewModelExtKt$flowAsLiveDataWithLoading$3(this.f6092d, this.f6093e, continuation);
        viewModelExtKt$flowAsLiveDataWithLoading$3.f6091c = th;
        return viewModelExtKt$flowAsLiveDataWithLoading$3.invokeSuspend(Unit.INSTANCE);
    }
}
