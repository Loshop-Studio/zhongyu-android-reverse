package com.zykj.huiwei.launcher.p035ui.fragment;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m7879d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m7880d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "com.zykj.huiwei.launcher.ui.fragment.LoginFragment$initView$5$1", m7918f = "LoginFragment.kt", m7919i = {0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5}, m7920l = {158, 159, 161, 164, 164, 165}, m7921m = "invokeSuspend", m7922n = {"intent", "$i$a$-also-LoginFragment$initView$5$1$1", "intent", "$i$a$-also-LoginFragment$initView$5$1$1", "intent", "$i$a$-also-LoginFragment$initView$5$1$1", "intent", "$i$a$-also-LoginFragment$initView$5$1$1", "intent", "$i$a$-also-LoginFragment$initView$5$1$1", "intent", "$i$a$-also-LoginFragment$initView$5$1$1"}, m7923s = {"L$2", "I$0", "L$2", "I$0", "L$2", "I$0", "L$2", "I$0", "L$2", "I$0", "L$1", "I$0"})
/* loaded from: classes4.dex */
public final class LoginFragment$initView$5$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public Object f6724a;

    /* renamed from: b */
    public Object f6725b;

    /* renamed from: c */
    public Object f6726c;

    /* renamed from: d */
    public Object f6727d;

    /* renamed from: e */
    public Object f6728e;

    /* renamed from: f */
    public Object f6729f;

    /* renamed from: g */
    public Object f6730g;

    /* renamed from: h */
    public int f6731h;

    /* renamed from: i */
    public int f6732i;

    /* renamed from: j */
    public final /* synthetic */ Boolean f6733j;

    /* renamed from: k */
    public final /* synthetic */ LoginFragment f6734k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginFragment$initView$5$1(Boolean bool, LoginFragment loginFragment, Continuation continuation) {
        super(2, continuation);
        this.f6733j = bool;
        this.f6734k = loginFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LoginFragment$initView$5$1(this.f6733j, this.f6734k, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01f0  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.huiwei.launcher.p035ui.fragment.LoginFragment$initView$5$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/ui/fragment/LoginFragment$initView$5$1.smali:197
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((LoginFragment$initView$5$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
