package com.zykj.base;

import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.LayoutRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.LifecycleOwnerKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

@Keep
@Metadata(m5174d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b'\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u0011\u0010\u000b\u001a\u00020\fH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\rJ\u001b\u0010\u000e\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H¤@ø\u0001\u0000¢\u0006\u0002\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0013H%J\u0012\u0010\u0014\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u001c\u0010\u0005\u001a\u00028\u0000X\u0096.¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, m5175d2 = {"Lcom/zykj/base/BaseActivity;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/databinding/ViewDataBinding;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "mBindView", "getMBindView", "()Landroidx/databinding/ViewDataBinding;", "setMBindView", "(Landroidx/databinding/ViewDataBinding;)V", "Landroidx/databinding/ViewDataBinding;", "initData", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initView", "savedInstanceState", "Landroid/os/Bundle;", "(Landroid/os/Bundle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "layoutId", "", "onCreate", "onSupportNavigateUp", "", "base_release"}, m5176k = 1, m5177mv = {1, 5, 1}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public abstract class BaseActivity<T extends ViewDataBinding> extends AppCompatActivity {
    public T mBindView;

    @Metadata(m5174d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\u008a@"}, m5175d2 = {"Landroidx/databinding/ViewDataBinding;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m5176k = 3, m5177mv = {1, 5, 1})
    @DebugMetadata(m5191c = "com.zykj.base.BaseActivity$onCreate$1", m5192f = "BaseActivity.kt", m5193i = {}, m5194l = {25, 27}, m5195m = "invokeSuspend", m5196n = {}, m5197s = {})
    /* renamed from: com.zykj.base.BaseActivity$onCreate$1 */
    public static final class C36401 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f3998a;

        /* renamed from: c */
        public final /* synthetic */ Bundle f4000c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C36401(Bundle bundle, Continuation continuation) {
            super(2, continuation);
            this.f4000c = bundle;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C36401(this.f4000c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return invoke2(coroutineScope, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i4 = this.f3998a;
            if (i4 == 0) {
                ResultKt.throwOnFailure(obj);
                BaseActivity baseActivity = BaseActivity.this;
                this.f3998a = 1;
                if (baseActivity.initData(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i4 != 1) {
                    if (i4 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            BaseActivity baseActivity2 = BaseActivity.this;
            Bundle bundle = this.f4000c;
            this.f3998a = 2;
            if (baseActivity2.initView(bundle, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C36401) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static /* synthetic */ Object initData$suspendImpl(BaseActivity baseActivity, Continuation continuation) {
        return Unit.INSTANCE;
    }

    public T getMBindView() {
        T t3 = this.mBindView;
        if (t3 != null) {
            return t3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mBindView");
        throw null;
    }

    public Object initData(Continuation<? super Unit> continuation) {
        return initData$suspendImpl(this, continuation);
    }

    public abstract Object initView(Bundle bundle, Continuation<? super Unit> continuation);

    @LayoutRes
    public abstract int layoutId();

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ViewDataBinding contentView = DataBindingUtil.setContentView(this, layoutId());
        Intrinsics.checkNotNullExpressionValue(contentView, "setContentView(this, layoutId())");
        setMBindView(contentView);
        getMBindView().setLifecycleOwner(this);
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenCreated(new C36401(savedInstanceState, null));
    }

    @Override // androidx.appcompat.app.AppCompatActivity
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    public void setMBindView(T t3) {
        Intrinsics.checkNotNullParameter(t3, "<set-?>");
        this.mBindView = t3;
    }
}
