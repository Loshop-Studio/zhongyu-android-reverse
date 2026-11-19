package com.zykj.evaluation.bean;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u0011\u0010&\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u0010\u0010'\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u000b\u0010*\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0086\u0001\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010.J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u00020\u0003HÖ\u0001J\t\u00103\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001e\u0010\u001cR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010 ¨\u00064"}, m13558d2 = {"Lcom/zykj/evaluation/bean/GetTaskListReq;", "", "taskListType", "", "skipCount", "maxResultCount", "topicIds", "", "", "gradeId", "examTaskType", "submitAllow", "startTime", "", "endTime", "keyword", "<init>", "(IIILjava/util/List;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTaskListType", "()I", "getSkipCount", "getMaxResultCount", "getTopicIds", "()Ljava/util/List;", "getGradeId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getExamTaskType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSubmitAllow", "getStartTime", "()Ljava/lang/String;", "getEndTime", "getKeyword", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(IIILjava/util/List;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/zykj/evaluation/bean/GetTaskListReq;", "equals", "", "other", "hashCode", "toString", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class GetTaskListReq {
    public static final int $stable = 8;
    private final String endTime;
    private final Integer examTaskType;
    private final Long gradeId;
    private final String keyword;
    private final int maxResultCount;
    private final int skipCount;
    private final String startTime;
    private final Integer submitAllow;
    private final int taskListType;
    private final List<Long> topicIds;

    public GetTaskListReq() {
        this(0, 0, 0, null, null, null, null, null, null, null, 1023, null);
    }

    public static /* synthetic */ GetTaskListReq copy$default(GetTaskListReq getTaskListReq, int i10, int i11, int i12, List list, Long l10, Integer num, Integer num2, String str, String str2, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i10 = getTaskListReq.taskListType;
        }
        if ((i13 & 2) != 0) {
            i11 = getTaskListReq.skipCount;
        }
        if ((i13 & 4) != 0) {
            i12 = getTaskListReq.maxResultCount;
        }
        if ((i13 & 8) != 0) {
            list = getTaskListReq.topicIds;
        }
        if ((i13 & 16) != 0) {
            l10 = getTaskListReq.gradeId;
        }
        if ((i13 & 32) != 0) {
            num = getTaskListReq.examTaskType;
        }
        if ((i13 & 64) != 0) {
            num2 = getTaskListReq.submitAllow;
        }
        if ((i13 & 128) != 0) {
            str = getTaskListReq.startTime;
        }
        if ((i13 & 256) != 0) {
            str2 = getTaskListReq.endTime;
        }
        if ((i13 & 512) != 0) {
            str3 = getTaskListReq.keyword;
        }
        String str4 = str2;
        String str5 = str3;
        Integer num3 = num2;
        String str6 = str;
        Long l11 = l10;
        Integer num4 = num;
        return getTaskListReq.copy(i10, i11, i12, list, l11, num4, num3, str6, str4, str5);
    }

    /* renamed from: component1, reason: from getter */
    public final int getTaskListType() {
        return this.taskListType;
    }

    /* renamed from: component10, reason: from getter */
    public final String getKeyword() {
        return this.keyword;
    }

    /* renamed from: component2, reason: from getter */
    public final int getSkipCount() {
        return this.skipCount;
    }

    /* renamed from: component3, reason: from getter */
    public final int getMaxResultCount() {
        return this.maxResultCount;
    }

    public final List<Long> component4() {
        return this.topicIds;
    }

    /* renamed from: component5, reason: from getter */
    public final Long getGradeId() {
        return this.gradeId;
    }

    /* renamed from: component6, reason: from getter */
    public final Integer getExamTaskType() {
        return this.examTaskType;
    }

    /* renamed from: component7, reason: from getter */
    public final Integer getSubmitAllow() {
        return this.submitAllow;
    }

    /* renamed from: component8, reason: from getter */
    public final String getStartTime() {
        return this.startTime;
    }

    /* renamed from: component9, reason: from getter */
    public final String getEndTime() {
        return this.endTime;
    }

    public final GetTaskListReq copy(int taskListType, int skipCount, int maxResultCount, List<Long> topicIds, Long gradeId, Integer examTaskType, Integer submitAllow, String startTime, String endTime, String keyword) {
        return new GetTaskListReq(taskListType, skipCount, maxResultCount, topicIds, gradeId, examTaskType, submitAllow, startTime, endTime, keyword);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetTaskListReq)) {
            return false;
        }
        GetTaskListReq getTaskListReq = (GetTaskListReq) other;
        return this.taskListType == getTaskListReq.taskListType && this.skipCount == getTaskListReq.skipCount && this.maxResultCount == getTaskListReq.maxResultCount && Intrinsics.areEqual(this.topicIds, getTaskListReq.topicIds) && Intrinsics.areEqual(this.gradeId, getTaskListReq.gradeId) && Intrinsics.areEqual(this.examTaskType, getTaskListReq.examTaskType) && Intrinsics.areEqual(this.submitAllow, getTaskListReq.submitAllow) && Intrinsics.areEqual(this.startTime, getTaskListReq.startTime) && Intrinsics.areEqual(this.endTime, getTaskListReq.endTime) && Intrinsics.areEqual(this.keyword, getTaskListReq.keyword);
    }

    public final String getEndTime() {
        return this.endTime;
    }

    public final Integer getExamTaskType() {
        return this.examTaskType;
    }

    public final Long getGradeId() {
        return this.gradeId;
    }

    public final String getKeyword() {
        return this.keyword;
    }

    public final int getMaxResultCount() {
        return this.maxResultCount;
    }

    public final int getSkipCount() {
        return this.skipCount;
    }

    public final String getStartTime() {
        return this.startTime;
    }

    public final Integer getSubmitAllow() {
        return this.submitAllow;
    }

    public final int getTaskListType() {
        return this.taskListType;
    }

    public final List<Long> getTopicIds() {
        return this.topicIds;
    }

    public int hashCode() {
        int iHashCode = ((((Integer.hashCode(this.taskListType) * 31) + Integer.hashCode(this.skipCount)) * 31) + Integer.hashCode(this.maxResultCount)) * 31;
        List<Long> list = this.topicIds;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Long l10 = this.gradeId;
        int iHashCode3 = (iHashCode2 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Integer num = this.examTaskType;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.submitAllow;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.startTime;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.endTime;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.keyword;
        return iHashCode7 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "GetTaskListReq(taskListType=" + this.taskListType + ", skipCount=" + this.skipCount + ", maxResultCount=" + this.maxResultCount + ", topicIds=" + this.topicIds + ", gradeId=" + this.gradeId + ", examTaskType=" + this.examTaskType + ", submitAllow=" + this.submitAllow + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", keyword=" + this.keyword + ")";
    }

    public GetTaskListReq(int i10, int i11, int i12, List<Long> list, Long l10, Integer num, Integer num2, String str, String str2, String str3) {
        this.taskListType = i10;
        this.skipCount = i11;
        this.maxResultCount = i12;
        this.topicIds = list;
        this.gradeId = l10;
        this.examTaskType = num;
        this.submitAllow = num2;
        this.startTime = str;
        this.endTime = str2;
        this.keyword = str3;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ GetTaskListReq(int r2, int r3, int r4, java.util.List r5, java.lang.Long r6, java.lang.Integer r7, java.lang.Integer r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r1 = this;
            r13 = r12 & 1
            if (r13 == 0) goto La
            com.zykj.evaluation.bean.TaskListType$TotalTask r2 = com.zykj.evaluation.bean.TaskListType.TotalTask.INSTANCE
            int r2 = r2.getType()
        La:
            r13 = r12 & 2
            if (r13 == 0) goto Lf
            r3 = 0
        Lf:
            r13 = r12 & 4
            if (r13 == 0) goto L15
            r4 = 30
        L15:
            r13 = r12 & 8
            r0 = 0
            if (r13 == 0) goto L1b
            r5 = r0
        L1b:
            r13 = r12 & 16
            if (r13 == 0) goto L20
            r6 = r0
        L20:
            r13 = r12 & 32
            if (r13 == 0) goto L25
            r7 = r0
        L25:
            r13 = r12 & 64
            if (r13 == 0) goto L2a
            r8 = r0
        L2a:
            r13 = r12 & 128(0x80, float:1.8E-43)
            if (r13 == 0) goto L2f
            r9 = r0
        L2f:
            r13 = r12 & 256(0x100, float:3.59E-43)
            if (r13 == 0) goto L34
            r10 = r0
        L34:
            r12 = r12 & 512(0x200, float:7.17E-43)
            if (r12 == 0) goto L44
            r13 = r0
            r11 = r9
            r12 = r10
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L4f
        L44:
            r13 = r11
            r12 = r10
            r10 = r8
            r11 = r9
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L4f:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.bean.GetTaskListReq.<init>(int, int, int, java.util.List, java.lang.Long, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/bean/GetTaskListReq.smali:210
    }
}
