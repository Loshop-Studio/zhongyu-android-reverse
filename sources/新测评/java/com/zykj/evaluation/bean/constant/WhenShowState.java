package com.zykj.evaluation.bean.constant;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@StabilityInferred(parameters = 1)
@Metadata(m13557d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\b\t\n\u000b\f\rB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0006\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, m13558d2 = {"Lcom/zykj/evaluation/bean/constant/WhenShowState;", "", "state", "", "<init>", "(I)V", "getState", "()I", "ToDo", "Correcting", "ToCorrect", "Completed", "ExamFinished", "NEVER", "Lcom/zykj/evaluation/bean/constant/WhenShowState$Completed;", "Lcom/zykj/evaluation/bean/constant/WhenShowState$Correcting;", "Lcom/zykj/evaluation/bean/constant/WhenShowState$ExamFinished;", "Lcom/zykj/evaluation/bean/constant/WhenShowState$NEVER;", "Lcom/zykj/evaluation/bean/constant/WhenShowState$ToCorrect;", "Lcom/zykj/evaluation/bean/constant/WhenShowState$ToDo;", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
/* loaded from: classes4.dex */
public abstract class WhenShowState {
    public static final int $stable = 0;
    private final int state;

    @StabilityInferred(parameters = 1)
    @Metadata(m13557d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13558d2 = {"Lcom/zykj/evaluation/bean/constant/WhenShowState$Completed;", "Lcom/zykj/evaluation/bean/constant/WhenShowState;", "<init>", "()V", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
    public static final class Completed extends WhenShowState {
        public static final int $stable = 0;
        public static final Completed INSTANCE = new Completed();

        private Completed() {
            super(3, null);
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(m13557d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13558d2 = {"Lcom/zykj/evaluation/bean/constant/WhenShowState$Correcting;", "Lcom/zykj/evaluation/bean/constant/WhenShowState;", "<init>", "()V", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
    public static final class Correcting extends WhenShowState {
        public static final int $stable = 0;
        public static final Correcting INSTANCE = new Correcting();

        private Correcting() {
            super(5, null);
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(m13557d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13558d2 = {"Lcom/zykj/evaluation/bean/constant/WhenShowState$ExamFinished;", "Lcom/zykj/evaluation/bean/constant/WhenShowState;", "<init>", "()V", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
    public static final class ExamFinished extends WhenShowState {
        public static final int $stable = 0;
        public static final ExamFinished INSTANCE = new ExamFinished();

        private ExamFinished() {
            super(4, null);
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(m13557d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13558d2 = {"Lcom/zykj/evaluation/bean/constant/WhenShowState$NEVER;", "Lcom/zykj/evaluation/bean/constant/WhenShowState;", "<init>", "()V", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
    public static final class NEVER extends WhenShowState {
        public static final int $stable = 0;
        public static final NEVER INSTANCE = new NEVER();

        private NEVER() {
            super(0, null);
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(m13557d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13558d2 = {"Lcom/zykj/evaluation/bean/constant/WhenShowState$ToCorrect;", "Lcom/zykj/evaluation/bean/constant/WhenShowState;", "<init>", "()V", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
    public static final class ToCorrect extends WhenShowState {
        public static final int $stable = 0;
        public static final ToCorrect INSTANCE = new ToCorrect();

        private ToCorrect() {
            super(2, null);
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(m13557d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13558d2 = {"Lcom/zykj/evaluation/bean/constant/WhenShowState$ToDo;", "Lcom/zykj/evaluation/bean/constant/WhenShowState;", "<init>", "()V", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
    public static final class ToDo extends WhenShowState {
        public static final int $stable = 0;
        public static final ToDo INSTANCE = new ToDo();

        private ToDo() {
            super(1, null);
        }
    }

    public /* synthetic */ WhenShowState(int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10);
    }

    public final int getState() {
        return this.state;
    }

    private WhenShowState(int i10) {
        this.state = i10;
    }
}
