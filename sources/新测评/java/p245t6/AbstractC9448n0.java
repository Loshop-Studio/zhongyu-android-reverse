package p245t6;

import com.zykj.evaluation.bean.PageSize;
import com.zykj.evaluation.bean.SpecificTrainingType;
import com.zykj.evaluation.bean.TaskInfo;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: t6.n0 */
/* loaded from: classes4.dex */
public abstract class AbstractC9448n0 {
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01c6  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final p245t6.C9450o0 m15730a(com.zykj.evaluation.bean.TaskInfo r30, com.zykj.evaluation.p057ui.home.AbstractC6928a r31) {
        /*
            Method dump skipped, instructions count: 467
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p245t6.AbstractC9448n0.m15730a(com.zykj.evaluation.bean.TaskInfo, com.zykj.evaluation.ui.home.a):t6.o0");
    }

    /* renamed from: b */
    public static final boolean m15731b(TaskInfo taskInfo) {
        Intrinsics.checkNotNullParameter(taskInfo, "<this>");
        return taskInfo.getSize() == PageSize.A3Special.INSTANCE.getValue();
    }

    /* renamed from: c */
    public static final boolean m15732c(TaskInfo taskInfo) {
        Intrinsics.checkNotNullParameter(taskInfo, "<this>");
        return CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(SpecificTrainingType.Normal.INSTANCE.getType()), Integer.valueOf(SpecificTrainingType.TeachMaterial.INSTANCE.getType())}).contains(Integer.valueOf(taskInfo.getSpecificTrainingType()));
    }
}
