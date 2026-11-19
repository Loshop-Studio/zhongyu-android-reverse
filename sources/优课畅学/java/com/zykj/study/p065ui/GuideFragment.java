package com.zykj.study.p065ui;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.navigation.fragment.FragmentKt;
import com.zykj.study.R$layout;
import com.zykj.study.databinding.FragmentGuideBinding;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.DelayKt;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class GuideFragment extends Hilt_GuideFragment<FragmentGuideBinding> {

    @InterfaceC9539d(m17800c = "com.zykj.study.ui.GuideFragment", m17801f = "GuideFragment.kt", m17802l = {21}, m17803m = "initData")
    /* renamed from: com.zykj.study.ui.GuideFragment$initData$1 */
    public static final class C77521 extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f11554a;

        /* renamed from: c */
        public int f11556c;

        public C77521(InterfaceC9324c interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f11554a = obj;
            this.f11556c |= Integer.MIN_VALUE;
            return GuideFragment.this.initData(this);
        }
    }

    @InterfaceC9539d(m17800c = "com.zykj.study.ui.GuideFragment$initData$2", m17801f = "GuideFragment.kt", m17802l = {24}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.study.ui.GuideFragment$initData$2 */
    public static final class C77532 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public int f11557a;

        public C77532(InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            return GuideFragment.this.new C77532(interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
            return ((C77532) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.f11557a;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                this.f11557a = 1;
                if (DelayKt.m16227b(1000L, this) == objM17291f) {
                    return objM17291f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
            }
            try {
                FragmentKt.findNavController(GuideFragment.this).navigate(AbstractC7773a.f11723a.m10508a());
            } catch (Throwable th) {
                th.printStackTrace();
            }
            return C8736p.f16368a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.zykj.base.BaseFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object initData(p179m7.InterfaceC9324c r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.zykj.study.p065ui.GuideFragment.C77521
            if (r0 == 0) goto L13
            r0 = r5
            com.zykj.study.ui.GuideFragment$initData$1 r0 = (com.zykj.study.p065ui.GuideFragment.C77521) r0
            int r1 = r0.f11556c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11556c = r1
            goto L18
        L13:
            com.zykj.study.ui.GuideFragment$initData$1 r0 = new com.zykj.study.ui.GuideFragment$initData$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f11554a
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.f11556c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.AbstractC9079b.m15926b(r5)
            goto L3d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.AbstractC9079b.m15926b(r5)
            r0.f11556c = r3
            java.lang.Object r5 = super.initData(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            androidx.lifecycle.LifecycleCoroutineScope r5 = androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(r4)
            com.zykj.study.ui.GuideFragment$initData$2 r0 = new com.zykj.study.ui.GuideFragment$initData$2
            r1 = 0
            r0.<init>(r1)
            r5.launchWhenResumed(r0)
            h7.p r5 = p123h7.C8736p.f16368a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.p065ui.GuideFragment.initData(m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes5/com/zykj/study/ui/GuideFragment.smali:41
    }

    @Override // com.zykj.base.BaseFragment
    public Object initView(Bundle bundle, InterfaceC9324c interfaceC9324c) {
        return C8736p.f16368a;
    }

    @Override // com.zykj.base.BaseFragment
    public int layoutId() {
        return R$layout.fragment_guide;
    }
}
