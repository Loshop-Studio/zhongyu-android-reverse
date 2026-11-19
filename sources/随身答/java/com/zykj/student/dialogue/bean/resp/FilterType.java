package com.zykj.student.dialogue.bean.resp;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p314z6.C10003a;

@StabilityInferred(parameters = 1)
@Metadata(m13412d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\n\u000b\f\r\u000e\u000fB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0006\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, m13413d2 = {"Lcom/zykj/student/dialogue/bean/resp/FilterType;", "", "label", "", "<init>", "(Ljava/lang/String;)V", "getLabel", "()Ljava/lang/String;", "isCustomTime", "", "ViewStatus", "TeacherViewStatus", "QuestionState", "Subject", "Time", "Sort", "Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState;", "Lcom/zykj/student/dialogue/bean/resp/FilterType$Sort;", "Lcom/zykj/student/dialogue/bean/resp/FilterType$Subject;", "Lcom/zykj/student/dialogue/bean/resp/FilterType$TeacherViewStatus;", "Lcom/zykj/student/dialogue/bean/resp/FilterType$Time;", "Lcom/zykj/student/dialogue/bean/resp/FilterType$ViewStatus;", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes5.dex */
public abstract class FilterType {
    public static final int $stable = 0;
    private final String label;

    @StabilityInferred(parameters = 1)
    @Metadata(m13412d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\f\r\u000eB\u0019\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0003\u000f\u0010\u0011¨\u0006\u0012"}, m13413d2 = {"Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState;", "Lcom/zykj/student/dialogue/bean/resp/FilterType;", "quoraState", "", "value", "", "<init>", "(ILjava/lang/String;)V", "getQuoraState", "()I", "getValue", "()Ljava/lang/String;", "Unlimited", "Ongoing", "Closed", "Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState$Closed;", "Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState$Ongoing;", "Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState$Unlimited;", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static abstract class QuestionState extends FilterType {
        public static final int $stable = 0;
        private final int quoraState;
        private final String value;

        @StabilityInferred(parameters = 1)
        @Metadata(m13412d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13413d2 = {"Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState$Closed;", "Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState;", "<init>", "()V", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        public static final class Closed extends QuestionState {
            public static final int $stable = 0;
            public static final Closed INSTANCE = new Closed();

            private Closed() {
                super(2, "已关闭", null);
            }
        }

        @StabilityInferred(parameters = 1)
        @Metadata(m13412d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13413d2 = {"Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState$Ongoing;", "Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState;", "<init>", "()V", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        public static final class Ongoing extends QuestionState {
            public static final int $stable = 0;
            public static final Ongoing INSTANCE = new Ongoing();

            private Ongoing() {
                super(1, "进行中", null);
            }
        }

        @StabilityInferred(parameters = 1)
        @Metadata(m13412d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13413d2 = {"Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState$Unlimited;", "Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState;", "<init>", "()V", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        public static final class Unlimited extends QuestionState {
            public static final int $stable = 0;
            public static final Unlimited INSTANCE = new Unlimited();

            private Unlimited() {
                super(0, "不限", null);
            }
        }

        public /* synthetic */ QuestionState(int i9, String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(i9, str);
        }

        public final int getQuoraState() {
            return this.quoraState;
        }

        public final String getValue() {
            return this.value;
        }

        private QuestionState(int i9, String str) {
            super(str, null);
            this.quoraState = i9;
            this.value = str;
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(m13412d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\f\r\u000eB\u0019\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0003\u000f\u0010\u0011¨\u0006\u0012"}, m13413d2 = {"Lcom/zykj/student/dialogue/bean/resp/FilterType$Sort;", "Lcom/zykj/student/dialogue/bean/resp/FilterType;", "sortKey", "", "sortLabel", "", "<init>", "(ILjava/lang/String;)V", "getSortKey", "()I", "getSortLabel", "()Ljava/lang/String;", "SortByUpdatedTime", "SortByJoinedTime", "SortByDiscuss", "Lcom/zykj/student/dialogue/bean/resp/FilterType$Sort$SortByDiscuss;", "Lcom/zykj/student/dialogue/bean/resp/FilterType$Sort$SortByJoinedTime;", "Lcom/zykj/student/dialogue/bean/resp/FilterType$Sort$SortByUpdatedTime;", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static abstract class Sort extends FilterType {
        public static final int $stable = 0;
        private final int sortKey;
        private final String sortLabel;

        @StabilityInferred(parameters = 1)
        @Metadata(m13412d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13413d2 = {"Lcom/zykj/student/dialogue/bean/resp/FilterType$Sort$SortByDiscuss;", "Lcom/zykj/student/dialogue/bean/resp/FilterType$Sort;", "<init>", "()V", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        public static final class SortByDiscuss extends Sort {
            public static final int $stable = 0;
            public static final SortByDiscuss INSTANCE = new SortByDiscuss();

            private SortByDiscuss() {
                super(2, "按评论数排序", null);
            }
        }

        @StabilityInferred(parameters = 1)
        @Metadata(m13412d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13413d2 = {"Lcom/zykj/student/dialogue/bean/resp/FilterType$Sort$SortByJoinedTime;", "Lcom/zykj/student/dialogue/bean/resp/FilterType$Sort;", "<init>", "()V", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        public static final class SortByJoinedTime extends Sort {
            public static final int $stable = 0;
            public static final SortByJoinedTime INSTANCE = new SortByJoinedTime();

            private SortByJoinedTime() {
                super(1, "按加入时间排序", null);
            }
        }

        @StabilityInferred(parameters = 1)
        @Metadata(m13412d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13413d2 = {"Lcom/zykj/student/dialogue/bean/resp/FilterType$Sort$SortByUpdatedTime;", "Lcom/zykj/student/dialogue/bean/resp/FilterType$Sort;", "<init>", "()V", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        public static final class SortByUpdatedTime extends Sort {
            public static final int $stable = 0;
            public static final SortByUpdatedTime INSTANCE = new SortByUpdatedTime();

            private SortByUpdatedTime() {
                super(0, "按更新时间排序", null);
            }
        }

        public /* synthetic */ Sort(int i9, String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(i9, str);
        }

        public final int getSortKey() {
            return this.sortKey;
        }

        public final String getSortLabel() {
            return this.sortLabel;
        }

        private Sort(int i9, String str) {
            super(str, null);
            this.sortKey = i9;
            this.sortLabel = str;
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(m13412d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m13413d2 = {"Lcom/zykj/student/dialogue/bean/resp/FilterType$Subject;", "Lcom/zykj/student/dialogue/bean/resp/FilterType;", "topicId", "", "topicName", "", "<init>", "(ILjava/lang/String;)V", "getTopicId", "()I", "getTopicName", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Subject extends FilterType {
        public static final int $stable = 0;
        private final int topicId;
        private final String topicName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Subject(int i9, String topicName) {
            super(topicName, null);
            Intrinsics.checkNotNullParameter(topicName, "topicName");
            this.topicId = i9;
            this.topicName = topicName;
        }

        public static /* synthetic */ Subject copy$default(Subject subject, int i9, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                i9 = subject.topicId;
            }
            if ((i10 & 2) != 0) {
                str = subject.topicName;
            }
            return subject.copy(i9, str);
        }

        /* renamed from: component1, reason: from getter */
        public final int getTopicId() {
            return this.topicId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTopicName() {
            return this.topicName;
        }

        public final Subject copy(int topicId, String topicName) {
            Intrinsics.checkNotNullParameter(topicName, "topicName");
            return new Subject(topicId, topicName);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Subject)) {
                return false;
            }
            Subject subject = (Subject) other;
            return this.topicId == subject.topicId && Intrinsics.areEqual(this.topicName, subject.topicName);
        }

        public final int getTopicId() {
            return this.topicId;
        }

        public final String getTopicName() {
            return this.topicName;
        }

        public int hashCode() {
            return (Integer.hashCode(this.topicId) * 31) + this.topicName.hashCode();
        }

        public String toString() {
            return "Subject(topicId=" + this.topicId + ", topicName=" + this.topicName + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(m13412d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\f\r\u000eB\u0019\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0003\u000f\u0010\u0011¨\u0006\u0012"}, m13413d2 = {"Lcom/zykj/student/dialogue/bean/resp/FilterType$TeacherViewStatus;", "Lcom/zykj/student/dialogue/bean/resp/FilterType;", "key", "", "value", "", "<init>", "(ILjava/lang/String;)V", "getKey", "()I", "getValue", "()Ljava/lang/String;", "Unlimited", "Started", "Replied", "Lcom/zykj/student/dialogue/bean/resp/FilterType$TeacherViewStatus$Replied;", "Lcom/zykj/student/dialogue/bean/resp/FilterType$TeacherViewStatus$Started;", "Lcom/zykj/student/dialogue/bean/resp/FilterType$TeacherViewStatus$Unlimited;", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static abstract class TeacherViewStatus extends FilterType {
        public static final int $stable = 0;
        private final int key;
        private final String value;

        @StabilityInferred(parameters = 1)
        @Metadata(m13412d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13413d2 = {"Lcom/zykj/student/dialogue/bean/resp/FilterType$TeacherViewStatus$Replied;", "Lcom/zykj/student/dialogue/bean/resp/FilterType$TeacherViewStatus;", "<init>", "()V", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        public static final class Replied extends TeacherViewStatus {
            public static final int $stable = 0;
            public static final Replied INSTANCE = new Replied();

            private Replied() {
                super(6, "教师回复过", null);
            }
        }

        @StabilityInferred(parameters = 1)
        @Metadata(m13412d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13413d2 = {"Lcom/zykj/student/dialogue/bean/resp/FilterType$TeacherViewStatus$Started;", "Lcom/zykj/student/dialogue/bean/resp/FilterType$TeacherViewStatus;", "<init>", "()V", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        public static final class Started extends TeacherViewStatus {
            public static final int $stable = 0;
            public static final Started INSTANCE = new Started();

            private Started() {
                super(5, "教师发起的", null);
            }
        }

        @StabilityInferred(parameters = 1)
        @Metadata(m13412d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13413d2 = {"Lcom/zykj/student/dialogue/bean/resp/FilterType$TeacherViewStatus$Unlimited;", "Lcom/zykj/student/dialogue/bean/resp/FilterType$TeacherViewStatus;", "<init>", "()V", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        public static final class Unlimited extends TeacherViewStatus {
            public static final int $stable = 0;
            public static final Unlimited INSTANCE = new Unlimited();

            private Unlimited() {
                super(0, "不限", null);
            }
        }

        public /* synthetic */ TeacherViewStatus(int i9, String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(i9, str);
        }

        public final int getKey() {
            return this.key;
        }

        public final String getValue() {
            return this.value;
        }

        private TeacherViewStatus(int i9, String str) {
            super(str, null);
            this.key = i9;
            this.value = str;
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(m13412d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\r\u000e\u000fB!\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u000b\u001a\u00020\u0003J\u0006\u0010\f\u001a\u00020\u0003R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t\u0082\u0001\u0003\u0010\u0011\u0012¨\u0006\u0013"}, m13413d2 = {"Lcom/zykj/student/dialogue/bean/resp/FilterType$Time;", "Lcom/zykj/student/dialogue/bean/resp/FilterType;", "time", "", "startDateTime", "endDateTime", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getStartDateTime", "()Ljava/lang/String;", "getEndDateTime", "parseStartTime", "parseEndTime", "JoinedTime", "UpdatedTime", "FavoriteTime", "Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime;", "Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime;", "Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime;", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static abstract class Time extends FilterType {
        public static final int $stable = 0;
        private final String endDateTime;
        private final String startDateTime;

        @StabilityInferred(parameters = 1)
        @Metadata(m13412d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\f\r\u000e\u000fB!\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t\u0082\u0001\u0004\u0010\u0011\u0012\u0013¨\u0006\u0014"}, m13413d2 = {"Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime;", "Lcom/zykj/student/dialogue/bean/resp/FilterType$Time;", "timeRange", "", "start", "end", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTimeRange", "()Ljava/lang/String;", "getStart", "getEnd", "Unlimited", "ThisWeek", "ThisMonth", TypedValues.Custom.NAME, "Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime$Custom;", "Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime$ThisMonth;", "Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime$ThisWeek;", "Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime$Unlimited;", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        public static abstract class FavoriteTime extends Time {
            public static final int $stable = 0;
            private final String end;
            private final String start;
            private final String timeRange;

            @StabilityInferred(parameters = 1)
            @Metadata(m13412d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\n\u001a\u00020\u000bJ\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0015"}, m13413d2 = {"Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime$Custom;", "Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime;", "customStart", "", "customEnd", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getCustomStart", "()Ljava/lang/String;", "getCustomEnd", "hasTimeRange", "", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
            public static final /* data */ class Custom extends FavoriteTime {
                public static final int $stable = 0;
                private final String customEnd;
                private final String customStart;

                /* JADX WARN: Multi-variable type inference failed */
                public Custom() {
                    this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                }

                public static /* synthetic */ Custom copy$default(Custom custom, String str, String str2, int i9, Object obj) {
                    if ((i9 & 1) != 0) {
                        str = custom.customStart;
                    }
                    if ((i9 & 2) != 0) {
                        str2 = custom.customEnd;
                    }
                    return custom.copy(str, str2);
                }

                /* renamed from: component1, reason: from getter */
                public final String getCustomStart() {
                    return this.customStart;
                }

                /* renamed from: component2, reason: from getter */
                public final String getCustomEnd() {
                    return this.customEnd;
                }

                public final Custom copy(String customStart, String customEnd) {
                    Intrinsics.checkNotNullParameter(customStart, "customStart");
                    Intrinsics.checkNotNullParameter(customEnd, "customEnd");
                    return new Custom(customStart, customEnd);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Custom)) {
                        return false;
                    }
                    Custom custom = (Custom) other;
                    return Intrinsics.areEqual(this.customStart, custom.customStart) && Intrinsics.areEqual(this.customEnd, custom.customEnd);
                }

                public final String getCustomEnd() {
                    return this.customEnd;
                }

                public final String getCustomStart() {
                    return this.customStart;
                }

                public final boolean hasTimeRange() {
                    return getStart().length() > 0 || getEnd().length() > 0;
                }

                public int hashCode() {
                    return (this.customStart.hashCode() * 31) + this.customEnd.hashCode();
                }

                public String toString() {
                    return "Custom(customStart=" + this.customStart + ", customEnd=" + this.customEnd + ")";
                }

                public /* synthetic */ Custom(String str, String str2, int i9, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i9 & 1) != 0 ? "" : str, (i9 & 2) != 0 ? "" : str2);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Custom(String customStart, String customEnd) {
                    super("自定义", customStart, customEnd, null);
                    Intrinsics.checkNotNullParameter(customStart, "customStart");
                    Intrinsics.checkNotNullParameter(customEnd, "customEnd");
                    this.customStart = customStart;
                    this.customEnd = customEnd;
                }
            }

            @StabilityInferred(parameters = 1)
            @Metadata(m13412d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13413d2 = {"Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime$ThisMonth;", "Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime;", "<init>", "()V", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
            public static final class ThisMonth extends FavoriteTime {
                public static final int $stable = 0;
                public static final ThisMonth INSTANCE = new ThisMonth();

                /* JADX WARN: Illegal instructions before constructor call */
                private ThisMonth() {
                    String str = "本月";
                    super(str, C10003a.m17359b(C10003a.f18026a, null, 1, null), "", null);
                }
            }

            @StabilityInferred(parameters = 1)
            @Metadata(m13412d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13413d2 = {"Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime$ThisWeek;", "Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime;", "<init>", "()V", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
            public static final class ThisWeek extends FavoriteTime {
                public static final int $stable = 0;
                public static final ThisWeek INSTANCE = new ThisWeek();

                /* JADX WARN: Illegal instructions before constructor call */
                private ThisWeek() {
                    String str = "本周";
                    super(str, C10003a.m17360d(C10003a.f18026a, null, 1, null), "", null);
                }
            }

            @StabilityInferred(parameters = 1)
            @Metadata(m13412d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13413d2 = {"Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime$Unlimited;", "Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime;", "<init>", "()V", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
            public static final class Unlimited extends FavoriteTime {
                public static final int $stable = 0;
                public static final Unlimited INSTANCE = new Unlimited();

                /* JADX WARN: Illegal instructions before constructor call */
                private Unlimited() {
                    String str = "";
                    super("不限", str, str, null);
                }
            }

            public /* synthetic */ FavoriteTime(String str, String str2, String str3, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, str3);
            }

            public final String getEnd() {
                return this.end;
            }

            public final String getStart() {
                return this.start;
            }

            public final String getTimeRange() {
                return this.timeRange;
            }

            private FavoriteTime(String str, String str2, String str3) {
                super(str, str2, str3, null);
                this.timeRange = str;
                this.start = str2;
                this.end = str3;
            }
        }

        @StabilityInferred(parameters = 0)
        @Metadata(m13412d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0010\u0011\u0012\u0013B+\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u0082\u0001\u0004\u0014\u0015\u0016\u0017¨\u0006\u0018"}, m13413d2 = {"Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime;", "Lcom/zykj/student/dialogue/bean/resp/FilterType$Time;", "timeRange", "", "start", "end", "uuid", "Ljava/util/UUID;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/UUID;)V", "getTimeRange", "()Ljava/lang/String;", "getStart", "getEnd", "getUuid", "()Ljava/util/UUID;", "Unlimited", "ThisWeek", "ThisMonth", TypedValues.Custom.NAME, "Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime$Custom;", "Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime$ThisMonth;", "Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime$ThisWeek;", "Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime$Unlimited;", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        public static abstract class JoinedTime extends Time {
            public static final int $stable = 8;
            private final String end;
            private final String start;
            private final String timeRange;
            private final UUID uuid;

            @StabilityInferred(parameters = 0)
            @Metadata(m13412d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\n\u001a\u00020\u000bJ\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0015"}, m13413d2 = {"Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime$Custom;", "Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime;", "customStart", "", "customEnd", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getCustomStart", "()Ljava/lang/String;", "getCustomEnd", "hasTimeRange", "", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
            public static final /* data */ class Custom extends JoinedTime {
                public static final int $stable = 8;
                private final String customEnd;
                private final String customStart;

                /* JADX WARN: Multi-variable type inference failed */
                public Custom() {
                    this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                }

                public static /* synthetic */ Custom copy$default(Custom custom, String str, String str2, int i9, Object obj) {
                    if ((i9 & 1) != 0) {
                        str = custom.customStart;
                    }
                    if ((i9 & 2) != 0) {
                        str2 = custom.customEnd;
                    }
                    return custom.copy(str, str2);
                }

                /* renamed from: component1, reason: from getter */
                public final String getCustomStart() {
                    return this.customStart;
                }

                /* renamed from: component2, reason: from getter */
                public final String getCustomEnd() {
                    return this.customEnd;
                }

                public final Custom copy(String customStart, String customEnd) {
                    Intrinsics.checkNotNullParameter(customStart, "customStart");
                    Intrinsics.checkNotNullParameter(customEnd, "customEnd");
                    return new Custom(customStart, customEnd);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Custom)) {
                        return false;
                    }
                    Custom custom = (Custom) other;
                    return Intrinsics.areEqual(this.customStart, custom.customStart) && Intrinsics.areEqual(this.customEnd, custom.customEnd);
                }

                public final String getCustomEnd() {
                    return this.customEnd;
                }

                public final String getCustomStart() {
                    return this.customStart;
                }

                public final boolean hasTimeRange() {
                    return getStart().length() > 0 || getEnd().length() > 0;
                }

                public int hashCode() {
                    return (this.customStart.hashCode() * 31) + this.customEnd.hashCode();
                }

                public String toString() {
                    return "Custom(customStart=" + this.customStart + ", customEnd=" + this.customEnd + ")";
                }

                public /* synthetic */ Custom(String str, String str2, int i9, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i9 & 1) != 0 ? "" : str, (i9 & 2) != 0 ? "" : str2);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Custom(String customStart, String customEnd) {
                    super("自定义", customStart, customEnd, null, 8, null);
                    Intrinsics.checkNotNullParameter(customStart, "customStart");
                    Intrinsics.checkNotNullParameter(customEnd, "customEnd");
                    this.customStart = customStart;
                    this.customEnd = customEnd;
                }
            }

            @StabilityInferred(parameters = 0)
            @Metadata(m13412d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13413d2 = {"Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime$ThisMonth;", "Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime;", "<init>", "()V", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
            public static final class ThisMonth extends JoinedTime {
                public static final ThisMonth INSTANCE = new ThisMonth();
                public static final int $stable = 8;

                private ThisMonth() {
                    super("本月", C10003a.m17359b(C10003a.f18026a, null, 1, null), "", null, 8, null);
                }
            }

            @StabilityInferred(parameters = 0)
            @Metadata(m13412d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13413d2 = {"Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime$ThisWeek;", "Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime;", "<init>", "()V", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
            public static final class ThisWeek extends JoinedTime {
                public static final ThisWeek INSTANCE = new ThisWeek();
                public static final int $stable = 8;

                private ThisWeek() {
                    super("本周", C10003a.m17360d(C10003a.f18026a, null, 1, null), "", null, 8, null);
                }
            }

            @StabilityInferred(parameters = 0)
            @Metadata(m13412d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13413d2 = {"Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime$Unlimited;", "Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime;", "<init>", "()V", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
            public static final class Unlimited extends JoinedTime {
                public static final Unlimited INSTANCE = new Unlimited();
                public static final int $stable = 8;

                private Unlimited() {
                    super("不限", "", "", null, 8, null);
                }
            }

            public /* synthetic */ JoinedTime(String str, String str2, String str3, UUID uuid, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, str3, uuid);
            }

            public final String getEnd() {
                return this.end;
            }

            public final String getStart() {
                return this.start;
            }

            public final String getTimeRange() {
                return this.timeRange;
            }

            public final UUID getUuid() {
                return this.uuid;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public /* synthetic */ JoinedTime(String str, String str2, String str3, UUID uuid, int i9, DefaultConstructorMarker defaultConstructorMarker) {
                if ((i9 & 8) != 0) {
                    uuid = UUID.randomUUID();
                    Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID(...)");
                }
                this(str, str2, str3, uuid, null);
            }

            private JoinedTime(String str, String str2, String str3, UUID uuid) {
                super(str, str2, str3, null);
                this.timeRange = str;
                this.start = str2;
                this.end = str3;
                this.uuid = uuid;
            }
        }

        @StabilityInferred(parameters = 1)
        @Metadata(m13412d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\f\r\u000e\u000fB!\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t\u0082\u0001\u0004\u0010\u0011\u0012\u0013¨\u0006\u0014"}, m13413d2 = {"Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime;", "Lcom/zykj/student/dialogue/bean/resp/FilterType$Time;", "timeRange", "", "start", "end", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTimeRange", "()Ljava/lang/String;", "getStart", "getEnd", "Unlimited", "ThisWeek", "ThisMonth", TypedValues.Custom.NAME, "Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime$Custom;", "Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime$ThisMonth;", "Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime$ThisWeek;", "Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime$Unlimited;", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        public static abstract class UpdatedTime extends Time {
            public static final int $stable = 0;
            private final String end;
            private final String start;
            private final String timeRange;

            @StabilityInferred(parameters = 1)
            @Metadata(m13412d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\n\u001a\u00020\u000bJ\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0015"}, m13413d2 = {"Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime$Custom;", "Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime;", "customStart", "", "customEnd", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getCustomStart", "()Ljava/lang/String;", "getCustomEnd", "hasTimeRange", "", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
            public static final /* data */ class Custom extends UpdatedTime {
                public static final int $stable = 0;
                private final String customEnd;
                private final String customStart;

                /* JADX WARN: Multi-variable type inference failed */
                public Custom() {
                    this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                }

                public static /* synthetic */ Custom copy$default(Custom custom, String str, String str2, int i9, Object obj) {
                    if ((i9 & 1) != 0) {
                        str = custom.customStart;
                    }
                    if ((i9 & 2) != 0) {
                        str2 = custom.customEnd;
                    }
                    return custom.copy(str, str2);
                }

                /* renamed from: component1, reason: from getter */
                public final String getCustomStart() {
                    return this.customStart;
                }

                /* renamed from: component2, reason: from getter */
                public final String getCustomEnd() {
                    return this.customEnd;
                }

                public final Custom copy(String customStart, String customEnd) {
                    Intrinsics.checkNotNullParameter(customStart, "customStart");
                    Intrinsics.checkNotNullParameter(customEnd, "customEnd");
                    return new Custom(customStart, customEnd);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Custom)) {
                        return false;
                    }
                    Custom custom = (Custom) other;
                    return Intrinsics.areEqual(this.customStart, custom.customStart) && Intrinsics.areEqual(this.customEnd, custom.customEnd);
                }

                public final String getCustomEnd() {
                    return this.customEnd;
                }

                public final String getCustomStart() {
                    return this.customStart;
                }

                public final boolean hasTimeRange() {
                    return getStart().length() > 0 || getEnd().length() > 0;
                }

                public int hashCode() {
                    return (this.customStart.hashCode() * 31) + this.customEnd.hashCode();
                }

                public String toString() {
                    return "Custom(customStart=" + this.customStart + ", customEnd=" + this.customEnd + ")";
                }

                public /* synthetic */ Custom(String str, String str2, int i9, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i9 & 1) != 0 ? "" : str, (i9 & 2) != 0 ? "" : str2);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Custom(String customStart, String customEnd) {
                    super("自定义", customStart, customEnd, null);
                    Intrinsics.checkNotNullParameter(customStart, "customStart");
                    Intrinsics.checkNotNullParameter(customEnd, "customEnd");
                    this.customStart = customStart;
                    this.customEnd = customEnd;
                }
            }

            @StabilityInferred(parameters = 1)
            @Metadata(m13412d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13413d2 = {"Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime$ThisMonth;", "Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime;", "<init>", "()V", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
            public static final class ThisMonth extends UpdatedTime {
                public static final int $stable = 0;
                public static final ThisMonth INSTANCE = new ThisMonth();

                /* JADX WARN: Illegal instructions before constructor call */
                private ThisMonth() {
                    String str = "本月";
                    super(str, C10003a.m17359b(C10003a.f18026a, null, 1, null), "", null);
                }
            }

            @StabilityInferred(parameters = 1)
            @Metadata(m13412d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13413d2 = {"Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime$ThisWeek;", "Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime;", "<init>", "()V", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
            public static final class ThisWeek extends UpdatedTime {
                public static final int $stable = 0;
                public static final ThisWeek INSTANCE = new ThisWeek();

                /* JADX WARN: Illegal instructions before constructor call */
                private ThisWeek() {
                    String str = "本周";
                    super(str, C10003a.m17360d(C10003a.f18026a, null, 1, null), "", null);
                }
            }

            @StabilityInferred(parameters = 1)
            @Metadata(m13412d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13413d2 = {"Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime$Unlimited;", "Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime;", "<init>", "()V", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
            public static final class Unlimited extends UpdatedTime {
                public static final int $stable = 0;
                public static final Unlimited INSTANCE = new Unlimited();

                /* JADX WARN: Illegal instructions before constructor call */
                private Unlimited() {
                    String str = "";
                    super("不限", str, str, null);
                }
            }

            public /* synthetic */ UpdatedTime(String str, String str2, String str3, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, str3);
            }

            public final String getEnd() {
                return this.end;
            }

            public final String getStart() {
                return this.start;
            }

            public final String getTimeRange() {
                return this.timeRange;
            }

            private UpdatedTime(String str, String str2, String str3) {
                super(str, str2, str3, null);
                this.timeRange = str;
                this.start = str2;
                this.end = str3;
            }
        }

        public /* synthetic */ Time(String str, String str2, String str3, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3);
        }

        public final String getEndDateTime() {
            return this.endDateTime;
        }

        public final String getStartDateTime() {
            return this.startDateTime;
        }

        public final String parseEndTime() {
            if ((!(this instanceof UpdatedTime.Custom) && !(this instanceof JoinedTime.Custom) && !(this instanceof FavoriteTime.Custom)) || this.endDateTime.length() <= 0) {
                return this.endDateTime;
            }
            if (this.endDateTime.length() != 19) {
                return this.endDateTime;
            }
            String strSubstring = this.endDateTime.substring(0, r0.length() - 3);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            return strSubstring;
        }

        public final String parseStartTime() {
            if ((!(this instanceof UpdatedTime.Custom) && !(this instanceof JoinedTime.Custom) && !(this instanceof FavoriteTime.Custom)) || this.startDateTime.length() <= 0) {
                return this.startDateTime;
            }
            if (this.startDateTime.length() != 19) {
                return this.startDateTime;
            }
            String strSubstring = this.startDateTime.substring(0, r0.length() - 3);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            return strSubstring;
        }

        private Time(String str, String str2, String str3) {
            super(str, null);
            this.startDateTime = str2;
            this.endDateTime = str3;
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(m13412d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\f\r\u000e\u000f\u0010B\u0019\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0005\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, m13413d2 = {"Lcom/zykj/student/dialogue/bean/resp/FilterType$ViewStatus;", "Lcom/zykj/student/dialogue/bean/resp/FilterType;", "key", "", "value", "", "<init>", "(ILjava/lang/String;)V", "getKey", "()I", "getValue", "()Ljava/lang/String;", "Unlimited", "MyQuestion", "Replied", "Unanswered", "NotViewed", "Lcom/zykj/student/dialogue/bean/resp/FilterType$ViewStatus$MyQuestion;", "Lcom/zykj/student/dialogue/bean/resp/FilterType$ViewStatus$NotViewed;", "Lcom/zykj/student/dialogue/bean/resp/FilterType$ViewStatus$Replied;", "Lcom/zykj/student/dialogue/bean/resp/FilterType$ViewStatus$Unanswered;", "Lcom/zykj/student/dialogue/bean/resp/FilterType$ViewStatus$Unlimited;", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static abstract class ViewStatus extends FilterType {
        public static final int $stable = 0;
        private final int key;
        private final String value;

        @StabilityInferred(parameters = 1)
        @Metadata(m13412d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13413d2 = {"Lcom/zykj/student/dialogue/bean/resp/FilterType$ViewStatus$MyQuestion;", "Lcom/zykj/student/dialogue/bean/resp/FilterType$ViewStatus;", "<init>", "()V", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        public static final class MyQuestion extends ViewStatus {
            public static final int $stable = 0;
            public static final MyQuestion INSTANCE = new MyQuestion();

            private MyQuestion() {
                super(1, "我问的", null);
            }
        }

        @StabilityInferred(parameters = 1)
        @Metadata(m13412d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13413d2 = {"Lcom/zykj/student/dialogue/bean/resp/FilterType$ViewStatus$NotViewed;", "Lcom/zykj/student/dialogue/bean/resp/FilterType$ViewStatus;", "<init>", "()V", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        public static final class NotViewed extends ViewStatus {
            public static final int $stable = 0;
            public static final NotViewed INSTANCE = new NotViewed();

            private NotViewed() {
                super(4, "我未查看", null);
            }
        }

        @StabilityInferred(parameters = 1)
        @Metadata(m13412d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13413d2 = {"Lcom/zykj/student/dialogue/bean/resp/FilterType$ViewStatus$Replied;", "Lcom/zykj/student/dialogue/bean/resp/FilterType$ViewStatus;", "<init>", "()V", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        public static final class Replied extends ViewStatus {
            public static final int $stable = 0;
            public static final Replied INSTANCE = new Replied();

            private Replied() {
                super(2, "我回复过", null);
            }
        }

        @StabilityInferred(parameters = 1)
        @Metadata(m13412d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13413d2 = {"Lcom/zykj/student/dialogue/bean/resp/FilterType$ViewStatus$Unanswered;", "Lcom/zykj/student/dialogue/bean/resp/FilterType$ViewStatus;", "<init>", "()V", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        public static final class Unanswered extends ViewStatus {
            public static final int $stable = 0;
            public static final Unanswered INSTANCE = new Unanswered();

            private Unanswered() {
                super(3, "我未回复", null);
            }
        }

        @StabilityInferred(parameters = 1)
        @Metadata(m13412d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13413d2 = {"Lcom/zykj/student/dialogue/bean/resp/FilterType$ViewStatus$Unlimited;", "Lcom/zykj/student/dialogue/bean/resp/FilterType$ViewStatus;", "<init>", "()V", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        public static final class Unlimited extends ViewStatus {
            public static final int $stable = 0;
            public static final Unlimited INSTANCE = new Unlimited();

            private Unlimited() {
                super(0, "不限", null);
            }
        }

        public /* synthetic */ ViewStatus(int i9, String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(i9, str);
        }

        public final int getKey() {
            return this.key;
        }

        public final String getValue() {
            return this.value;
        }

        private ViewStatus(int i9, String str) {
            super(str, null);
            this.key = i9;
            this.value = str;
        }
    }

    public /* synthetic */ FilterType(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public final String getLabel() {
        return this.label;
    }

    public final boolean isCustomTime() {
        return (this instanceof Time.JoinedTime.Custom) || (this instanceof Time.UpdatedTime.Custom) || (this instanceof Time.FavoriteTime.Custom);
    }

    private FilterType(String str) {
        this.label = str;
    }
}
