package com.zykj.lib.login.p062ui.teacher.pwd;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.zykj.base.BaseViewModel;
import com.zykj.base.utils.XToastUtils;
import com.zykj.lib.login.R$string;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.text.Regex;
import p123h7.C8736p;
import p135i8.AbstractC8839h;
import p135i8.InterfaceC8822b0;
import p169l8.AbstractC9268e;
import p169l8.AbstractC9276m;
import p169l8.InterfaceC9266c;
import p169l8.InterfaceC9270g;
import p169l8.InterfaceC9275l;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9536a;
import p201o7.InterfaceC9539d;
import p208p3.InterfaceC9643a;
import p300x7.InterfaceC10574p;
import p300x7.InterfaceC10575q;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class ChangePwdViewModel extends BaseViewModel {

    /* renamed from: a */
    public final InterfaceC9643a f10040a;

    /* renamed from: b */
    public final MutableLiveData f10041b;

    /* renamed from: c */
    public final MutableLiveData f10042c;

    /* renamed from: d */
    public final MutableLiveData f10043d;

    /* renamed from: e */
    public final InterfaceC9270g f10044e;

    /* renamed from: f */
    public final InterfaceC9275l f10045f;

    /* renamed from: g */
    public final Regex f10046g;

    @InterfaceC9539d(m17800c = "com.zykj.lib.login.ui.teacher.pwd.ChangePwdViewModel$1", m17801f = "ChangePwdViewModel.kt", m17802l = {43}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.lib.login.ui.teacher.pwd.ChangePwdViewModel$1 */
    public static final class C73451 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public int f10047a;

        @InterfaceC9539d(m17800c = "com.zykj.lib.login.ui.teacher.pwd.ChangePwdViewModel$1$1", m17801f = "ChangePwdViewModel.kt", m17802l = {}, m17803m = "invokeSuspend")
        /* renamed from: com.zykj.lib.login.ui.teacher.pwd.ChangePwdViewModel$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC10575q {

            /* renamed from: a */
            public int f10049a;

            /* renamed from: b */
            public /* synthetic */ Object f10050b;

            /* renamed from: c */
            public /* synthetic */ Object f10051c;

            public AnonymousClass1(InterfaceC9324c interfaceC9324c) {
                super(3, interfaceC9324c);
            }

            @Override // p300x7.InterfaceC10575q
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Object invoke(String str, String str2, InterfaceC9324c interfaceC9324c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(interfaceC9324c);
                anonymousClass1.f10050b = str;
                anonymousClass1.f10051c = str2;
                return anonymousClass1.invokeSuspend(C8736p.f16368a);
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r4) throws java.lang.Throwable {
                /*
                    r3 = this;
                    java.lang.Object r0 = r3.f10050b
                    java.lang.String r0 = (java.lang.String) r0
                    java.lang.Object r1 = r3.f10051c
                    java.lang.String r1 = (java.lang.String) r1
                    p190n7.AbstractC9434a.m17291f()
                    int r2 = r3.f10049a
                    if (r2 != 0) goto L32
                    kotlin.AbstractC9079b.m15926b(r4)
                    kotlin.jvm.internal.AbstractC9133u.m16130d(r0)
                    int r4 = r0.length()
                    if (r4 <= 0) goto L2c
                    kotlin.jvm.internal.AbstractC9133u.m16130d(r1)
                    int r4 = r1.length()
                    if (r4 <= 0) goto L2c
                    boolean r4 = kotlin.jvm.internal.AbstractC9133u.m16128b(r0, r1)
                    if (r4 == 0) goto L2c
                    r4 = 1
                    goto L2d
                L2c:
                    r4 = 0
                L2d:
                    java.lang.Boolean r4 = p201o7.AbstractC9536a.m17796a(r4)
                    return r4
                L32:
                    java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r4.<init>(r0)
                    throw r4
                */
                throw new UnsupportedOperationException("Method not decompiled: com.zykj.lib.login.p062ui.teacher.pwd.ChangePwdViewModel.C73451.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/优课畅学/smali_classes4/com/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel$1$1.smali:112
            }
        }

        @InterfaceC9539d(m17800c = "com.zykj.lib.login.ui.teacher.pwd.ChangePwdViewModel$1$2", m17801f = "ChangePwdViewModel.kt", m17802l = {}, m17803m = "invokeSuspend")
        /* renamed from: com.zykj.lib.login.ui.teacher.pwd.ChangePwdViewModel$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC10574p {

            /* renamed from: a */
            public int f10052a;

            /* renamed from: b */
            public /* synthetic */ boolean f10053b;

            /* renamed from: c */
            public final /* synthetic */ ChangePwdViewModel f10054c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(ChangePwdViewModel changePwdViewModel, InterfaceC9324c interfaceC9324c) {
                super(2, interfaceC9324c);
                this.f10054c = changePwdViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f10054c, interfaceC9324c);
                anonymousClass2.f10053b = ((Boolean) obj).booleanValue();
                return anonymousClass2;
            }

            @Override // p300x7.InterfaceC10574p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Boolean) obj).booleanValue(), (InterfaceC9324c) obj2);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                boolean z10 = this.f10053b;
                AbstractC9434a.m17291f();
                if (this.f10052a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
                this.f10054c.m9345b().postValue(AbstractC9536a.m17796a(z10));
                return C8736p.f16368a;
            }

            public final Object invoke(boolean z10, InterfaceC9324c interfaceC9324c) {
                return ((AnonymousClass2) create(Boolean.valueOf(z10), interfaceC9324c)).invokeSuspend(C8736p.f16368a);
            }
        }

        public C73451(InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            return ChangePwdViewModel.this.new C73451(interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
            return ((C73451) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.f10047a;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                InterfaceC9266c interfaceC9266cM17021k = AbstractC9268e.m17021k(FlowLiveDataConversions.asFlow(ChangePwdViewModel.this.m9348e()), FlowLiveDataConversions.asFlow(ChangePwdViewModel.this.m9347d()), new AnonymousClass1(null));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(ChangePwdViewModel.this, null);
                this.f10047a = 1;
                if (AbstractC9268e.m17019i(interfaceC9266cM17021k, anonymousClass2, this) == objM17291f) {
                    return objM17291f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
            }
            return C8736p.f16368a;
        }
    }

    public ChangePwdViewModel(InterfaceC9643a repository) {
        AbstractC9133u.m16133g(repository, "repository");
        this.f10040a = repository;
        this.f10041b = new MutableLiveData("");
        this.f10042c = new MutableLiveData("");
        this.f10043d = new MutableLiveData(Boolean.FALSE);
        InterfaceC9270g interfaceC9270gM17044b = AbstractC9276m.m17044b(0, 0, null, 7, null);
        this.f10044e = interfaceC9270gM17044b;
        this.f10045f = AbstractC9268e.m17011a(interfaceC9270gM17044b);
        this.f10046g = new Regex("^(?=.*\\d)(?=.*[a-zA-Z]).{8,16}$");
        AbstractC8839h.m14861d(ViewModelKt.getViewModelScope(this), null, null, new C73451(null), 3, null);
    }

    /* renamed from: b */
    public final MutableLiveData m9345b() {
        return this.f10043d;
    }

    /* renamed from: c */
    public final InterfaceC9275l m9346c() {
        return this.f10045f;
    }

    /* renamed from: d */
    public final MutableLiveData m9347d() {
        return this.f10042c;
    }

    /* renamed from: e */
    public final MutableLiveData m9348e() {
        return this.f10041b;
    }

    /* renamed from: f */
    public final InterfaceC9643a m9349f() {
        return this.f10040a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: g */
    public final void m9350g() {
        if (AbstractC9133u.m16128b(this.f10043d.getValue(), Boolean.TRUE)) {
            T value = this.f10041b.getValue();
            AbstractC9133u.m16130d(value);
            String str = (String) value;
            if (this.f10046g.m16181h(str)) {
                AbstractC8839h.m14861d(ViewModelKt.getViewModelScope(this), null, null, new ChangePwdViewModel$modifyPwd$1(this, str, null), 3, null);
            } else {
                XToastUtils.INSTANCE.info(R$string.input_pwd_less);
            }
        }
    }
}
