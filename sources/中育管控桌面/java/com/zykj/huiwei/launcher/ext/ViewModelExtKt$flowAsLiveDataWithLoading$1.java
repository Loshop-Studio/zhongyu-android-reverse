package com.zykj.huiwei.launcher.ext;

import androidx.exifinterface.media.ExifInterface;
import com.zykj.base.BaseViewModel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(m7879d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, m7880d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/FlowCollector;"}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "com.zykj.huiwei.launcher.ext.ViewModelExtKt$flowAsLiveDataWithLoading$1", m7918f = "ViewModelExt.kt", m7919i = {}, m7920l = {52}, m7921m = "invokeSuspend", m7922n = {}, m7923s = {})
@SourceDebugExtension({"SMAP\nViewModelExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewModelExt.kt\ncom/zykj/huiwei/launcher/ext/ViewModelExtKt$flowAsLiveDataWithLoading$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,161:1\n1#2:162\n*E\n"})
/* loaded from: classes4.dex */
public final class ViewModelExtKt$flowAsLiveDataWithLoading$1 extends SuspendLambda implements Function2<FlowCollector<Object>, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f6083a;

    /* renamed from: b */
    public final /* synthetic */ Function1 f6084b;

    /* renamed from: c */
    public final /* synthetic */ BaseViewModel f6085c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewModelExtKt$flowAsLiveDataWithLoading$1(Function1 function1, BaseViewModel baseViewModel, Continuation continuation) {
        super(2, continuation);
        this.f6084b = function1;
        this.f6085c = baseViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ViewModelExtKt$flowAsLiveDataWithLoading$1(this.f6084b, this.f6085c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(FlowCollector<Object> flowCollector, Continuation<? super Unit> continuation) {
        return invoke2((FlowCollector) flowCollector, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i6 = this.f6083a;
        if (i6 == 0) {
            ResultKt.throwOnFailure(obj);
            Function1 function1 = this.f6084b;
            if (function1 != null) {
                this.f6083a = 1;
                if (function1.invoke(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                Boolean boolBoxBoolean = Boxing.boxBoolean(true);
                this.f6085c.isDialogVisible().setValue(Boxing.boxBoolean(boolBoxBoolean.booleanValue()));
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
    public final Object invoke2(FlowCollector flowCollector, Continuation continuation) {
        return ((ViewModelExtKt$flowAsLiveDataWithLoading$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
