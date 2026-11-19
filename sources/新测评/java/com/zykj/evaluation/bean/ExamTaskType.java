package com.zykj.evaluation.bean;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@StabilityInferred(parameters = 1)
@Metadata(m13557d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\b\t\nB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, m13558d2 = {"Lcom/zykj/evaluation/bean/ExamTaskType;", "", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "", "<init>", "(I)V", "getType", "()I", "NoNeedCommit", "CorrectBySelf", "CorrectOnline", "Lcom/zykj/evaluation/bean/ExamTaskType$CorrectBySelf;", "Lcom/zykj/evaluation/bean/ExamTaskType$CorrectOnline;", "Lcom/zykj/evaluation/bean/ExamTaskType$NoNeedCommit;", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
/* loaded from: classes4.dex */
public abstract class ExamTaskType {
    public static final int $stable = 0;
    private final int type;

    @StabilityInferred(parameters = 1)
    @Metadata(m13557d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m13558d2 = {"Lcom/zykj/evaluation/bean/ExamTaskType$CorrectBySelf;", "Lcom/zykj/evaluation/bean/ExamTaskType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
    public static final /* data */ class CorrectBySelf extends ExamTaskType {
        public static final int $stable = 0;
        public static final CorrectBySelf INSTANCE = new CorrectBySelf();

        private CorrectBySelf() {
            super(2, null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof CorrectBySelf);
        }

        public int hashCode() {
            return 505422316;
        }

        public String toString() {
            return "CorrectBySelf";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(m13557d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m13558d2 = {"Lcom/zykj/evaluation/bean/ExamTaskType$CorrectOnline;", "Lcom/zykj/evaluation/bean/ExamTaskType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
    public static final /* data */ class CorrectOnline extends ExamTaskType {
        public static final int $stable = 0;
        public static final CorrectOnline INSTANCE = new CorrectOnline();

        private CorrectOnline() {
            super(3, null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof CorrectOnline);
        }

        public int hashCode() {
            return 868191228;
        }

        public String toString() {
            return "CorrectOnline";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(m13557d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m13558d2 = {"Lcom/zykj/evaluation/bean/ExamTaskType$NoNeedCommit;", "Lcom/zykj/evaluation/bean/ExamTaskType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
    public static final /* data */ class NoNeedCommit extends ExamTaskType {
        public static final int $stable = 0;
        public static final NoNeedCommit INSTANCE = new NoNeedCommit();

        private NoNeedCommit() {
            super(1, null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof NoNeedCommit);
        }

        public int hashCode() {
            return 1053096335;
        }

        public String toString() {
            return "NoNeedCommit";
        }
    }

    public /* synthetic */ ExamTaskType(int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10);
    }

    public final int getType() {
        return this.type;
    }

    private ExamTaskType(int i10) {
        this.type = i10;
    }
}
