package com.zykj.huiwei.launcher.viewmodels;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import androidx.core.view.PointerIconCompat;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.zykj.base.BaseViewModel;
import com.zykj.huiwei.launcher.repository.UserRepository;
import com.zykj.huiwei.launcher.viewmodels.AbstractC6194a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import p101l4.C7315g;

@StabilityInferred(parameters = 0)
@Metadata(m7879d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0015\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001dR\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001f8\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b\u0015\u0010!¨\u0006#"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;", "Lcom/zykj/base/BaseViewModel;", "Lcom/zykj/huiwei/launcher/repository/UserRepository;", "userRepository", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "<init>", "(Lcom/zykj/huiwei/launcher/repository/UserRepository;Landroidx/lifecycle/SavedStateHandle;)V", "", "f", "()V", "e", "Lcom/zykj/huiwei/launcher/viewmodels/a;", NotificationCompat.CATEGORY_EVENT, "d", "(Lcom/zykj/huiwei/launcher/viewmodels/a;)V", "a", "Lcom/zykj/huiwei/launcher/repository/UserRepository;", "b", "Landroidx/lifecycle/SavedStateHandle;", "", "c", "I", "passwordLevel", "Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;", "Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;", "currentPolicy", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Ll4/g;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "_uiState", "Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "()Lkotlinx/coroutines/flow/StateFlow;", "uiState", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nResetPwdViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResetPwdViewModel.kt\ncom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,155:1\n230#2,5:156\n230#2,5:161\n230#2,5:166\n*S KotlinDebug\n*F\n+ 1 ResetPwdViewModel.kt\ncom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel\n*L\n54#1:156,5\n59#1:161,5\n85#1:166,5\n*E\n"})
/* loaded from: classes4.dex */
public final class ResetPwdViewModel extends BaseViewModel {

    /* renamed from: a, reason: from kotlin metadata */
    public final UserRepository userRepository;

    /* renamed from: b, reason: from kotlin metadata */
    public final SavedStateHandle savedStateHandle;

    /* renamed from: c, reason: from kotlin metadata */
    public final int passwordLevel;

    /* renamed from: d, reason: from kotlin metadata */
    public final PasswordSecurityLevel currentPolicy;

    /* renamed from: e, reason: from kotlin metadata */
    public final MutableStateFlow _uiState;

    /* renamed from: f, reason: from kotlin metadata */
    public final StateFlow uiState;

    public ResetPwdViewModel(UserRepository userRepository, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.userRepository = userRepository;
        this.savedStateHandle = savedStateHandle;
        Integer num = (Integer) savedStateHandle.get("arg_pwd_level");
        int iIntValue = num != null ? num.intValue() : 1;
        this.passwordLevel = iIntValue;
        PasswordSecurityLevel passwordSecurityLevelM6188a = PasswordSecurityLevel.INSTANCE.m6188a(iIntValue);
        this.currentPolicy = passwordSecurityLevelM6188a;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(new C7315g(null, null, false, false, passwordSecurityLevelM6188a, false, null, false, false, null, PointerIconCompat.TYPE_CROSSHAIR, null));
        this._uiState = MutableStateFlow;
        this.uiState = FlowKt.asStateFlow(MutableStateFlow);
    }

    /* renamed from: e */
    private final void m6191e() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ResetPwdViewModel$performSubmit$1(this, (C7315g) this._uiState.getValue(), null), 3, null);
    }

    /* renamed from: f */
    private final void m6192f() {
        Object value;
        C7315g c7315g = (C7315g) this._uiState.getValue();
        String strM8303g = c7315g.m8303g();
        String strM8300d = c7315g.m8300d();
        PasswordSecurityLevel passwordSecurityLevelM8301e = c7315g.m8301e();
        boolean z6 = strM8303g.length() >= 8 && !passwordSecurityLevelM8301e.getRegex().matches(strM8303g);
        boolean z7 = strM8303g.length() > 0 && passwordSecurityLevelM8301e.getRegex().matches(strM8303g);
        boolean z8 = strM8300d.length() > 0 && !Intrinsics.areEqual(strM8300d, strM8303g);
        boolean z9 = z7 && (strM8300d.length() > 0 && Intrinsics.areEqual(strM8300d, strM8303g));
        MutableStateFlow mutableStateFlow = this._uiState;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, C7315g.m8297b((C7315g) value, null, null, false, z9, null, false, null, z6, z8, z8 ? "两次密码输入不一致" : "", 119, null)));
    }

    /* renamed from: c, reason: from getter */
    public final StateFlow getUiState() {
        return this.uiState;
    }

    /* renamed from: d */
    public final void m6194d(AbstractC6194a event) {
        Object value;
        Object value2;
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof AbstractC6194a.b) {
            MutableStateFlow mutableStateFlow = this._uiState;
            do {
                value2 = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value2, C7315g.m8297b((C7315g) value2, ((AbstractC6194a.b) event).m6202a(), null, false, false, null, false, null, false, false, null, 1022, null)));
            m6192f();
            return;
        }
        if (!(event instanceof AbstractC6194a.a)) {
            if (!(event instanceof AbstractC6194a.c)) {
                throw new NoWhenBranchMatchedException();
            }
            m6191e();
        } else {
            MutableStateFlow mutableStateFlow2 = this._uiState;
            do {
                value = mutableStateFlow2.getValue();
            } while (!mutableStateFlow2.compareAndSet(value, C7315g.m8297b((C7315g) value, null, ((AbstractC6194a.a) event).m6201a(), false, false, null, false, null, false, false, null, PointerIconCompat.TYPE_GRABBING, null)));
            m6192f();
        }
    }
}
