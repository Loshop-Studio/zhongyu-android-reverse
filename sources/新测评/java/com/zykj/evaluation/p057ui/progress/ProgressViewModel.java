package com.zykj.evaluation.p057ui.progress;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.zykj.evaluation.base.BaseViewModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p256u6.C9576p;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\t\u001a\u00020\b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\t\u0010\nR+\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m13558d2 = {"Lcom/zykj/evaluation/ui/progress/ProgressViewModel;", "Lcom/zykj/evaluation/base/BaseViewModel;", "<init>", "()V", "", "", "todoStudents", "correctStudents", "", "n", "(Ljava/util/List;Ljava/util/List;)V", "Lu6/p;", "<set-?>", "c", "Landroidx/compose/runtime/MutableState;", "m", "()Lu6/p;", "o", "(Lu6/p;)V", "progressViewState", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nProgressViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProgressViewModel.kt\ncom/zykj/evaluation/ui/progress/ProgressViewModel\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,40:1\n85#2:41\n113#2,2:42\n*S KotlinDebug\n*F\n+ 1 ProgressViewModel.kt\ncom/zykj/evaluation/ui/progress/ProgressViewModel\n*L\n20#1:41\n20#1:42,2\n*E\n"})
/* loaded from: classes4.dex */
public final class ProgressViewModel extends BaseViewModel {

    /* renamed from: c, reason: from kotlin metadata */
    public final MutableState progressViewState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new C9576p(CollectionsKt.listOf((Object[]) new String[]{"未交作业：0人", "未交订正：0人"}), null, null, 6, null), null, 2, null);

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: m */
    public final C9576p m10123m() {
        return (C9576p) this.progressViewState.getValue();
    }

    /* renamed from: n */
    public final void m10124n(List todoStudents, List correctStudents) {
        Intrinsics.checkNotNullParameter(todoStudents, "todoStudents");
        Intrinsics.checkNotNullParameter(correctStudents, "correctStudents");
        m10125o(m10123m().m15981a(CollectionsKt.listOf((Object[]) new String[]{"未交作业：" + todoStudents.size() + "人", "未交订正：" + correctStudents.size() + "人"}), todoStudents, correctStudents));
    }

    /* renamed from: o */
    public final void m10125o(C9576p c9576p) {
        this.progressViewState.setValue(c9576p);
    }
}
