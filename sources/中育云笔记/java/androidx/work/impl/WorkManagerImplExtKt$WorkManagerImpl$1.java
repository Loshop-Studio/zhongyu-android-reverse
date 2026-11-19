package androidx.work.impl;

import android.content.Context;
import androidx.work.Configuration;
import androidx.work.impl.constraints.trackers.Trackers;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p181hd.InterfaceC9548t;

/* loaded from: classes3.dex */
public /* synthetic */ class WorkManagerImplExtKt$WorkManagerImpl$1 extends FunctionReferenceImpl implements InterfaceC9548t {
    public static final WorkManagerImplExtKt$WorkManagerImpl$1 INSTANCE = new WorkManagerImplExtKt$WorkManagerImpl$1();

    public WorkManagerImplExtKt$WorkManagerImpl$1() {
        super(6, WorkManagerImplExtKt.class, "createSchedulers", "createSchedulers(Landroid/content/Context;Landroidx/work/Configuration;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/constraints/trackers/Trackers;Landroidx/work/impl/Processor;)Ljava/util/List;", 1);
    }

    @Override // p181hd.InterfaceC9548t
    public final List<Scheduler> invoke(Context p02, Configuration p12, TaskExecutor p22, WorkDatabase p32, Trackers p42, Processor p52) {
        AbstractC9979u.m20294g(p02, "p0");
        AbstractC9979u.m20294g(p12, "p1");
        AbstractC9979u.m20294g(p22, "p2");
        AbstractC9979u.m20294g(p32, "p3");
        AbstractC9979u.m20294g(p42, "p4");
        AbstractC9979u.m20294g(p52, "p5");
        return WorkManagerImplExtKt.createSchedulers(p02, p12, p22, p32, p42, p52);
    }
}
