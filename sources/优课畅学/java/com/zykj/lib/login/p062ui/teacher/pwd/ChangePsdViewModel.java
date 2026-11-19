package com.zykj.lib.login.p062ui.teacher.pwd;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.zykj.base.BaseViewModel;
import com.zykj.lib.login.p062ui.teacher.pwd.AbstractC7356c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC9133u;
import p135i8.AbstractC8839h;
import p169l8.AbstractC9268e;
import p169l8.AbstractC9276m;
import p169l8.AbstractC9281r;
import p169l8.InterfaceC9270g;
import p169l8.InterfaceC9271h;
import p169l8.InterfaceC9275l;
import p169l8.InterfaceC9280q;
import p208p3.InterfaceC9643a;
import p219q3.C9794n;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class ChangePsdViewModel extends BaseViewModel {

    /* renamed from: a */
    public final InterfaceC9643a f10011a;

    /* renamed from: b */
    public final SavedStateHandle f10012b;

    /* renamed from: c */
    public final int f10013c;

    /* renamed from: d */
    public final InterfaceC9271h f10014d;

    /* renamed from: e */
    public final InterfaceC9280q f10015e;

    /* renamed from: f */
    public final InterfaceC9270g f10016f;

    /* renamed from: g */
    public final InterfaceC9275l f10017g;

    public ChangePsdViewModel(InterfaceC9643a repository, SavedStateHandle savedStateHandle) {
        AbstractC9133u.m16133g(repository, "repository");
        AbstractC9133u.m16133g(savedStateHandle, "savedStateHandle");
        this.f10011a = repository;
        this.f10012b = savedStateHandle;
        Integer num = (Integer) savedStateHandle.get("arg_pwd_level");
        int iIntValue = num != null ? num.intValue() : 1;
        this.f10013c = iIntValue;
        InterfaceC9271h interfaceC9271hM17054a = AbstractC9281r.m17054a(new C9794n(null, null, false, false, PasswordSecurityLevel.f10084e.m9366a(iIntValue), false, null, false, null, 495, null));
        this.f10014d = interfaceC9271hM17054a;
        this.f10015e = AbstractC9268e.m17012b(interfaceC9271hM17054a);
        InterfaceC9270g interfaceC9270gM17044b = AbstractC9276m.m17044b(0, 0, null, 7, null);
        this.f10016f = interfaceC9270gM17044b;
        this.f10017g = AbstractC9268e.m17011a(interfaceC9270gM17044b);
    }

    /* renamed from: e */
    public final InterfaceC9275l m9336e() {
        return this.f10017g;
    }

    /* renamed from: f */
    public final InterfaceC9280q m9337f() {
        return this.f10015e;
    }

    /* renamed from: g */
    public final void m9338g(AbstractC7356c event) {
        Object value;
        Object value2;
        AbstractC9133u.m16133g(event, "event");
        if (event instanceof AbstractC7356c.b) {
            InterfaceC9271h interfaceC9271h = this.f10014d;
            do {
                value2 = interfaceC9271h.getValue();
            } while (!interfaceC9271h.mo16686e(value2, C9794n.m18342b((C9794n) value2, ((AbstractC7356c.b) event).m9390a(), null, false, false, null, false, null, false, null, 510, null)));
            m9341j();
            return;
        }
        if (!(event instanceof AbstractC7356c.a)) {
            if (!(event instanceof AbstractC7356c.c)) {
                throw new NoWhenBranchMatchedException();
            }
            m9339h();
        } else {
            InterfaceC9271h interfaceC9271h2 = this.f10014d;
            do {
                value = interfaceC9271h2.getValue();
            } while (!interfaceC9271h2.mo16686e(value, C9794n.m18342b((C9794n) value, null, ((AbstractC7356c.a) event).m9389a(), false, false, null, false, null, false, null, 509, null)));
            m9341j();
        }
    }

    /* renamed from: h */
    public final void m9339h() {
        AbstractC8839h.m14861d(ViewModelKt.getViewModelScope(this), null, null, new ChangePsdViewModel$performSubmit$1(this, (C9794n) this.f10014d.getValue(), null), 3, null);
    }

    /* renamed from: i */
    public final void m9340i(AbstractC7355b abstractC7355b) {
        AbstractC8839h.m14861d(ViewModelKt.getViewModelScope(this), null, null, new ChangePsdViewModel$sendEffect$1(this, abstractC7355b, null), 3, null);
    }

    /* renamed from: j */
    public final void m9341j() {
        Object value;
        C9794n c9794n = (C9794n) this.f10014d.getValue();
        String strM18347f = c9794n.m18347f();
        String strM18345d = c9794n.m18345d();
        PasswordSecurityLevel passwordSecurityLevelM18346e = c9794n.m18346e();
        boolean z10 = strM18347f.length() >= 8 && !passwordSecurityLevelM18346e.m9364c().m16181h(strM18347f);
        boolean z11 = strM18347f.length() >= 8 && passwordSecurityLevelM18346e.m9364c().m16181h(strM18347f);
        boolean z12 = strM18345d.length() > 0 && !AbstractC9133u.m16128b(strM18345d, strM18347f);
        boolean z13 = z11 && (strM18345d.length() > 0 && AbstractC9133u.m16128b(strM18345d, strM18347f));
        InterfaceC9271h interfaceC9271h = this.f10014d;
        do {
            value = interfaceC9271h.getValue();
        } while (!interfaceC9271h.mo16686e(value, C9794n.m18342b((C9794n) value, null, null, false, z13, null, z10, null, z12, z12 ? "两次密码输入不一致" : "", 87, null)));
    }
}
