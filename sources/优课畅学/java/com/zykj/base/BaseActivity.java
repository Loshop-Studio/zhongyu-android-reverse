package com.zykj.base;

import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.LayoutRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwnerKt;
import com.blankj.utilcode.util.AbstractC5380q;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p135i8.AbstractC8839h;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@Keep
/* loaded from: classes4.dex */
public abstract class BaseActivity<T extends ViewDataBinding> extends AppCompatActivity {
    public T mBindView;

    @InterfaceC9539d(m17800c = "com.zykj.base.BaseActivity$onCreate$1", m17801f = "BaseActivity.kt", m17802l = {29, 31}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.base.BaseActivity$onCreate$1 */
    public static final class C70321 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public int f8601a;

        /* renamed from: c */
        public final /* synthetic */ Bundle f8603c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C70321(Bundle bundle, InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
            this.f8603c = bundle;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            return new C70321(this.f8603c, interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
            return ((C70321) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
        
            if (r5.initView(r1, r4) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) throws java.lang.Throwable {
            /*
                r4 = this;
                java.lang.Object r0 = p190n7.AbstractC9434a.m17291f()
                int r1 = r4.f8601a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.AbstractC9079b.m15926b(r5)
                goto L39
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                kotlin.AbstractC9079b.m15926b(r5)
                goto L2c
            L1e:
                kotlin.AbstractC9079b.m15926b(r5)
                com.zykj.base.BaseActivity r5 = com.zykj.base.BaseActivity.this
                r4.f8601a = r3
                java.lang.Object r5 = r5.initData(r4)
                if (r5 != r0) goto L2c
                goto L38
            L2c:
                com.zykj.base.BaseActivity r5 = com.zykj.base.BaseActivity.this
                android.os.Bundle r1 = r4.f8603c
                r4.f8601a = r2
                java.lang.Object r5 = r5.initView(r1, r4)
                if (r5 != r0) goto L39
            L38:
                return r0
            L39:
                h7.p r5 = p123h7.C8736p.f16368a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zykj.base.BaseActivity.C70321.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/优课畅学/smali_classes4/com/zykj/base/BaseActivity$onCreate$1.smali:129
        }
    }

    public static /* synthetic */ <T extends ViewDataBinding> Object initData$suspendImpl(BaseActivity<T> baseActivity, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        return C8736p.f16368a;
    }

    public T getMBindView() {
        T t10 = this.mBindView;
        if (t10 != null) {
            return t10;
        }
        AbstractC9133u.m16151y("mBindView");
        return null;
    }

    public Object initData(InterfaceC9324c<? super C8736p> interfaceC9324c) {
        return initData$suspendImpl(this, interfaceC9324c);
    }

    public abstract Object initView(Bundle bundle, InterfaceC9324c<? super C8736p> interfaceC9324c);

    @LayoutRes
    public abstract int layoutId();

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AbstractC5380q.m2613i("当前的activity是" + getClass().getSimpleName() + ",视图已就绪");
        ViewDataBinding contentView = DataBindingUtil.setContentView(this, layoutId());
        AbstractC9133u.m16132f(contentView, "setContentView(...)");
        setMBindView(contentView);
        getMBindView().setLifecycleOwner(this);
        AbstractC8839h.m14861d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C70321(bundle, null), 3, null);
    }

    public void setMBindView(T t10) {
        AbstractC9133u.m16133g(t10, "<set-?>");
        this.mBindView = t10;
    }
}
