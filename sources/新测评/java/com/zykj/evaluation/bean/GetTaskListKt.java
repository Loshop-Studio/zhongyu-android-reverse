package com.zykj.evaluation.bean;

import com.zykj.evaluation.bean.TaskState;
import kotlin.Metadata;

@Metadata(m13557d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m13558d2 = {"convertToTaskState", "Lcom/zykj/evaluation/bean/TaskState;", "", "app_release"}, m13559k = 2, m13560mv = {2, 2, 0}, m13562xi = 48)
/* loaded from: classes4.dex */
public final class GetTaskListKt {
    public static final TaskState convertToTaskState(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? TaskState.Done.INSTANCE : TaskState.Revising.INSTANCE : TaskState.WaitRevise.INSTANCE : TaskState.ToCorrect.INSTANCE : TaskState.Correcting.INSTANCE : TaskState.WaitCorrect.INSTANCE : TaskState.ToDo.INSTANCE;
    }
}
