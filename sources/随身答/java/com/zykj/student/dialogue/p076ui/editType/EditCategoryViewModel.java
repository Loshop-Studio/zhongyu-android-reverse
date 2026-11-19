package com.zykj.student.dialogue.p076ui.editType;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import com.zykj.base.BaseViewModel;
import com.zykj.student.dialogue.p076ui.editType.AbstractC7542a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import p158k6.InterfaceC8287g;
import p234r6.C9434d;

@StabilityInferred(parameters = 0)
@Metadata(m13412d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\rR+\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000b\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, m13413d2 = {"Lcom/zykj/student/dialogue/ui/editType/EditCategoryViewModel;", "Lcom/zykj/base/BaseViewModel;", "Lk6/g;", NotificationCompat.CATEGORY_SERVICE, "<init>", "(Lk6/g;)V", "Lcom/zykj/student/dialogue/ui/editType/a;", "action", "", "a", "(Lcom/zykj/student/dialogue/ui/editType/a;)V", "b", "()V", "Lk6/g;", "Lr6/d;", "<set-?>", "Landroidx/compose/runtime/MutableState;", "getEditCategoryViewStates", "()Lr6/d;", "setEditCategoryViewStates", "(Lr6/d;)V", "editCategoryViewStates", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "", "c", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "getCategoryEvents", "()Lkotlinx/coroutines/flow/MutableSharedFlow;", "categoryEvents", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nEditCategoryViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditCategoryViewModel.kt\ncom/zykj/student/dialogue/ui/editType/EditCategoryViewModel\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,135:1\n85#2:136\n113#2,2:137\n*S KotlinDebug\n*F\n+ 1 EditCategoryViewModel.kt\ncom/zykj/student/dialogue/ui/editType/EditCategoryViewModel\n*L\n23#1:136\n23#1:137,2\n*E\n"})
/* loaded from: classes5.dex */
public final class EditCategoryViewModel extends BaseViewModel {

    /* renamed from: a, reason: from kotlin metadata */
    public final InterfaceC8287g service;

    /* renamed from: b, reason: from kotlin metadata */
    public final MutableState editCategoryViewStates;

    /* renamed from: c, reason: from kotlin metadata */
    public final MutableSharedFlow categoryEvents;

    public EditCategoryViewModel(InterfaceC8287g service) {
        Intrinsics.checkNotNullParameter(service, "service");
        this.service = service;
        this.editCategoryViewStates = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new C9434d(null, 1, null), null, 2, null);
        this.categoryEvents = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        m10519a(AbstractC7542a.a.f11270a);
    }

    /* renamed from: a */
    public final void m10519a(AbstractC7542a action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof AbstractC7542a.a) {
            m10520b();
        }
    }

    /* renamed from: b */
    public final void m10520b() {
    }
}
