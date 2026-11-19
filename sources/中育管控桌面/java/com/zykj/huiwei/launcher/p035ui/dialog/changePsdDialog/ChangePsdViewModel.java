package com.zykj.huiwei.launcher.p035ui.dialog.changePsdDialog;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.zykj.base.BaseViewModel;
import com.zykj.huiwei.launcher.p035ui.dialog.changePsdDialog.AbstractC6128b;
import com.zykj.huiwei.launcher.repository.UserRepository;
import com.zykj.huiwei.launcher.viewmodels.PasswordSecurityLevel;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import p043d4.C6237q;

@StabilityInferred(parameters = 0)
@Metadata(m7879d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001d\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001d0!8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00100'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010(R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100*8\u0006¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b\"\u0010,¨\u0006-"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel;", "Lcom/zykj/base/BaseViewModel;", "Lcom/zykj/huiwei/launcher/repository/UserRepository;", "userRepository", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "<init>", "(Lcom/zykj/huiwei/launcher/repository/UserRepository;Landroidx/lifecycle/SavedStateHandle;)V", "Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/b;", NotificationCompat.CATEGORY_EVENT, "", "g", "(Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/b;)V", "j", "()V", "h", "Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/c;", "effect", "i", "(Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/c;)V", "a", "Lcom/zykj/huiwei/launcher/repository/UserRepository;", "b", "Landroidx/lifecycle/SavedStateHandle;", "", "c", "I", "passwordLevel", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Ld4/q;", "d", "Lkotlinx/coroutines/flow/MutableStateFlow;", "_uiState", "Lkotlinx/coroutines/flow/StateFlow;", "e", "Lkotlinx/coroutines/flow/StateFlow;", "f", "()Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "_effect", "Lkotlinx/coroutines/flow/SharedFlow;", "Lkotlinx/coroutines/flow/SharedFlow;", "()Lkotlinx/coroutines/flow/SharedFlow;", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nChangePsdViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChangePsdViewModel.kt\ncom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,141:1\n230#2,5:142\n230#2,5:147\n230#2,5:152\n230#2,5:157\n*S KotlinDebug\n*F\n+ 1 ChangePsdViewModel.kt\ncom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel\n*L\n65#1:142,5\n69#1:147,5\n73#1:152,5\n107#1:157,5\n*E\n"})
/* loaded from: classes4.dex */
public final class ChangePsdViewModel extends BaseViewModel {

    /* renamed from: a, reason: from kotlin metadata */
    public final UserRepository userRepository;

    /* renamed from: b, reason: from kotlin metadata */
    public final SavedStateHandle savedStateHandle;

    /* renamed from: c, reason: from kotlin metadata */
    public final int passwordLevel;

    /* renamed from: d, reason: from kotlin metadata */
    public final MutableStateFlow _uiState;

    /* renamed from: e, reason: from kotlin metadata */
    public final StateFlow uiState;

    /* renamed from: f, reason: from kotlin metadata */
    public final MutableSharedFlow _effect;

    /* renamed from: g, reason: from kotlin metadata */
    public final SharedFlow effect;

    public ChangePsdViewModel(UserRepository userRepository, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.userRepository = userRepository;
        this.savedStateHandle = savedStateHandle;
        Integer num = (Integer) savedStateHandle.get("arg_pwd_level");
        int iIntValue = num != null ? num.intValue() : 1;
        this.passwordLevel = iIntValue;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(new C6237q(null, null, null, false, false, PasswordSecurityLevel.INSTANCE.m6188a(iIntValue), false, false, null, 479, null));
        this._uiState = MutableStateFlow;
        this.uiState = FlowKt.asStateFlow(MutableStateFlow);
        MutableSharedFlow mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this._effect = mutableSharedFlowMutableSharedFlow$default;
        this.effect = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
    }

    /* renamed from: e, reason: from getter */
    public final SharedFlow getEffect() {
        return this.effect;
    }

    /* renamed from: f, reason: from getter */
    public final StateFlow getUiState() {
        return this.uiState;
    }

    /* renamed from: g */
    public final void m5761g(AbstractC6128b event) {
        Object value;
        Object value2;
        Object value3;
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof AbstractC6128b.c) {
            MutableStateFlow mutableStateFlow = this._uiState;
            do {
                value3 = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value3, C6237q.m6326b((C6237q) value3, ((AbstractC6128b.c) event).m5811a(), null, null, false, false, null, false, false, null, TypedValues.PositionType.TYPE_POSITION_TYPE, null)));
            m5764j();
            return;
        }
        if (event instanceof AbstractC6128b.b) {
            MutableStateFlow mutableStateFlow2 = this._uiState;
            do {
                value2 = mutableStateFlow2.getValue();
            } while (!mutableStateFlow2.compareAndSet(value2, C6237q.m6326b((C6237q) value2, null, ((AbstractC6128b.b) event).m5810a(), null, false, false, null, false, false, null, 509, null)));
            m5764j();
            return;
        }
        if (!(event instanceof AbstractC6128b.a)) {
            if (!(event instanceof AbstractC6128b.d)) {
                throw new NoWhenBranchMatchedException();
            }
            m5762h();
        } else {
            MutableStateFlow mutableStateFlow3 = this._uiState;
            do {
                value = mutableStateFlow3.getValue();
            } while (!mutableStateFlow3.compareAndSet(value, C6237q.m6326b((C6237q) value, null, null, ((AbstractC6128b.a) event).m5809a(), false, false, null, false, false, null, TypedValues.PositionType.TYPE_PERCENT_Y, null)));
            m5764j();
        }
    }

    /* renamed from: h */
    public final void m5762h() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ChangePsdViewModel$performSubmit$1(this, (C6237q) this._uiState.getValue(), null), 3, null);
    }

    /* renamed from: i */
    public final void m5763i(AbstractC6129c effect) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ChangePsdViewModel$sendEffect$1(this, effect, null), 3, null);
    }

    /* renamed from: j */
    public final void m5764j() {
        Object value;
        C6237q c6237q = (C6237q) this._uiState.getValue();
        String strM6332g = c6237q.m6332g();
        String strM6331f = c6237q.m6331f();
        String strM6329d = c6237q.m6329d();
        PasswordSecurityLevel passwordSecurityLevelM6330e = c6237q.m6330e();
        boolean z6 = strM6331f.length() >= 8 && !passwordSecurityLevelM6330e.getRegex().matches(strM6331f);
        boolean z7 = strM6331f.length() >= 8 && passwordSecurityLevelM6330e.getRegex().matches(strM6331f);
        boolean z8 = strM6329d.length() > 0 && !Intrinsics.areEqual(strM6329d, strM6331f);
        boolean z9 = !StringsKt.isBlank(strM6332g) && z7 && (strM6329d.length() > 0 && Intrinsics.areEqual(strM6329d, strM6331f));
        MutableStateFlow mutableStateFlow = this._uiState;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, C6237q.m6326b((C6237q) value, null, null, null, false, z9, null, z6, z8, z8 ? "两次密码输入不一致" : "", 47, null)));
    }
}
