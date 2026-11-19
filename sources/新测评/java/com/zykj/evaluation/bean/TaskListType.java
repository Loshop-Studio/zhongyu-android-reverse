package com.zykj.evaluation.bean;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@StabilityInferred(parameters = 1)
@Metadata(m13557d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\b\t\n\u000bB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0004\f\r\u000e\u000f¨\u0006\u0010"}, m13558d2 = {"Lcom/zykj/evaluation/bean/TaskListType;", "", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "", "<init>", "(I)V", "getType", "()I", "ToHandleTask", "TotalTask", "FavoriteTask", "CompletedTask", "Lcom/zykj/evaluation/bean/TaskListType$CompletedTask;", "Lcom/zykj/evaluation/bean/TaskListType$FavoriteTask;", "Lcom/zykj/evaluation/bean/TaskListType$ToHandleTask;", "Lcom/zykj/evaluation/bean/TaskListType$TotalTask;", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
/* loaded from: classes4.dex */
public abstract class TaskListType {
    public static final int $stable = 0;
    private final int type;

    @StabilityInferred(parameters = 1)
    @Metadata(m13557d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m13558d2 = {"Lcom/zykj/evaluation/bean/TaskListType$CompletedTask;", "Lcom/zykj/evaluation/bean/TaskListType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
    public static final /* data */ class CompletedTask extends TaskListType {
        public static final int $stable = 0;
        public static final CompletedTask INSTANCE = new CompletedTask();

        private CompletedTask() {
            super(4, null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof CompletedTask);
        }

        public int hashCode() {
            return 805195470;
        }

        public String toString() {
            return "CompletedTask";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(m13557d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m13558d2 = {"Lcom/zykj/evaluation/bean/TaskListType$FavoriteTask;", "Lcom/zykj/evaluation/bean/TaskListType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
    public static final /* data */ class FavoriteTask extends TaskListType {
        public static final int $stable = 0;
        public static final FavoriteTask INSTANCE = new FavoriteTask();

        private FavoriteTask() {
            super(3, null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof FavoriteTask);
        }

        public int hashCode() {
            return 2069460259;
        }

        public String toString() {
            return "FavoriteTask";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(m13557d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m13558d2 = {"Lcom/zykj/evaluation/bean/TaskListType$ToHandleTask;", "Lcom/zykj/evaluation/bean/TaskListType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
    public static final /* data */ class ToHandleTask extends TaskListType {
        public static final int $stable = 0;
        public static final ToHandleTask INSTANCE = new ToHandleTask();

        private ToHandleTask() {
            super(1, null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof ToHandleTask);
        }

        public int hashCode() {
            return 1425490058;
        }

        public String toString() {
            return "ToHandleTask";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(m13557d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m13558d2 = {"Lcom/zykj/evaluation/bean/TaskListType$TotalTask;", "Lcom/zykj/evaluation/bean/TaskListType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
    public static final /* data */ class TotalTask extends TaskListType {
        public static final int $stable = 0;
        public static final TotalTask INSTANCE = new TotalTask();

        private TotalTask() {
            super(2, null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof TotalTask);
        }

        public int hashCode() {
            return -2089292217;
        }

        public String toString() {
            return "TotalTask";
        }
    }

    public /* synthetic */ TaskListType(int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10);
    }

    public final int getType() {
        return this.type;
    }

    private TaskListType(int i10) {
        this.type = i10;
    }
}
