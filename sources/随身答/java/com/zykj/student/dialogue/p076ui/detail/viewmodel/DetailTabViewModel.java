package com.zykj.student.dialogue.p076ui.detail.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.student.dialogue.base.BaseViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import p158k6.InterfaceC8287g;

@StabilityInferred(parameters = 0)
@Metadata(m13412d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, m13413d2 = {"Lcom/zykj/student/dialogue/ui/detail/viewmodel/DetailTabViewModel;", "Lcom/zykj/student/dialogue/base/BaseViewModel;", "Lk6/g;", "dialogueApi", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/zykj/message/server/bean/UserInfo;", "userInfoFlow", "<init>", "(Lk6/g;Lkotlinx/coroutines/flow/MutableStateFlow;)V", "c", "Lk6/g;", "d", "Lkotlinx/coroutines/flow/MutableStateFlow;", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes5.dex */
public final class DetailTabViewModel extends BaseViewModel {

    /* renamed from: c, reason: from kotlin metadata */
    public final InterfaceC8287g dialogueApi;

    /* renamed from: d, reason: from kotlin metadata */
    public final MutableStateFlow userInfoFlow;

    public DetailTabViewModel(InterfaceC8287g dialogueApi, MutableStateFlow userInfoFlow) {
        Intrinsics.checkNotNullParameter(dialogueApi, "dialogueApi");
        Intrinsics.checkNotNullParameter(userInfoFlow, "userInfoFlow");
        this.dialogueApi = dialogueApi;
        this.userInfoFlow = userInfoFlow;
    }
}
