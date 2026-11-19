package com.zykj.base;

import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.LayoutRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.LifecycleOwnerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

@Keep
@Metadata(m13557d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b'\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014J\u000e\u0010\u0010\u001a\u00020\rH\u0096@¢\u0006\u0002\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0013H%J\u0018\u0010\u0014\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH¤@¢\u0006\u0002\u0010\u0015R\u001c\u0010\u0006\u001a\u00028\u0000X\u0096.¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0016"}, m13558d2 = {"Lcom/zykj/base/BaseActivity;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/databinding/ViewDataBinding;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "mBindView", "getMBindView", "()Landroidx/databinding/ViewDataBinding;", "setMBindView", "(Landroidx/databinding/ViewDataBinding;)V", "Landroidx/databinding/ViewDataBinding;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "initData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "layoutId", "", "initView", "(Landroid/os/Bundle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "base_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
/* loaded from: classes4.dex */
public abstract class BaseActivity<T extends ViewDataBinding> extends AppCompatActivity {
    public T mBindView;

    @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "com.zykj.base.BaseActivity$onCreate$1", m13596f = "BaseActivity.kt", m13597i = {}, m13598l = {26, 28}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
    /* renamed from: com.zykj.base.BaseActivity$onCreate$1 */
    public static final class C66051 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f6827a;

        /* renamed from: c */
        public final /* synthetic */ Bundle f6829c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C66051(Bundle bundle, Continuation continuation) {
            super(2, continuation);
            this.f6829c = bundle;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C66051(this.f6829c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return invoke2(coroutineScope, (Continuation) continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
        
            if (r5.initView(r1, r4) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r4.f6827a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.ResultKt.throwOnFailure(r5)
                goto L39
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                kotlin.ResultKt.throwOnFailure(r5)
                goto L2c
            L1e:
                kotlin.ResultKt.throwOnFailure(r5)
                com.zykj.base.BaseActivity r5 = com.zykj.base.BaseActivity.this
                r4.f6827a = r3
                java.lang.Object r5 = r5.initData(r4)
                if (r5 != r0) goto L2c
                goto L38
            L2c:
                com.zykj.base.BaseActivity r5 = com.zykj.base.BaseActivity.this
                android.os.Bundle r1 = r4.f6829c
                r4.f6827a = r2
                java.lang.Object r5 = r5.initView(r1, r4)
                if (r5 != r0) goto L39
            L38:
                return r0
            L39:
                kotlin.Unit r5 = kotlin.Unit.INSTANCE
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zykj.base.BaseActivity.C66051.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/新测评/smali_classes4/com/zykj/base/BaseActivity$onCreate$1.smali:138
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C66051) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static /* synthetic */ <T extends ViewDataBinding> Object initData$suspendImpl(BaseActivity<T> baseActivity, Continuation<? super Unit> continuation) {
        return Unit.INSTANCE;
    }

    public T getMBindView() {
        T t10 = this.mBindView;
        if (t10 != null) {
            return t10;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mBindView");
        return null;
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
        Intrinsics.checkNotNullExpressionValue(contentView, "setContentView(...)");
        setMBindView(contentView);
        getMBindView().setLifecycleOwner(this);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C66051(savedInstanceState, null), 3, null);
    }

    public void setMBindView(T t10) {
        Intrinsics.checkNotNullParameter(t10, "<set-?>");
        this.mBindView = t10;
    }
}
