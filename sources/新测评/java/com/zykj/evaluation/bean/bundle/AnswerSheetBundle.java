package com.zykj.evaluation.bean.bundle;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 1)
@Metadata(m13557d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u000bHÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003JY\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u0007HÆ\u0001J\u0013\u0010$\u001a\u00020\u000b2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\u0005HÖ\u0001J\t\u0010'\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0018R\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0011\u0010\r\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015¨\u0006("}, m13558d2 = {"Lcom/zykj/evaluation/bean/bundle/AnswerSheetBundle;", "", "taskId", "", "taskState", "", "address", "", "testPagerId", "serialNum", "isNoStem", "", "uuid", "path", "<init>", "(JILjava/lang/String;JIZLjava/lang/String;Ljava/lang/String;)V", "getTaskId", "()J", "getTaskState", "()I", "getAddress", "()Ljava/lang/String;", "getTestPagerId", "getSerialNum", "()Z", "getUuid", "getPath", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AnswerSheetBundle {
    public static final int $stable = 0;
    private final String address;
    private final boolean isNoStem;
    private final String path;
    private final int serialNum;
    private final long taskId;
    private final int taskState;
    private final long testPagerId;
    private final String uuid;

    public AnswerSheetBundle(long j10, int i10, String address, long j11, int i11, boolean z9, String uuid, String path) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(path, "path");
        this.taskId = j10;
        this.taskState = i10;
        this.address = address;
        this.testPagerId = j11;
        this.serialNum = i11;
        this.isNoStem = z9;
        this.uuid = uuid;
        this.path = path;
    }

    public static /* synthetic */ AnswerSheetBundle copy$default(AnswerSheetBundle answerSheetBundle, long j10, int i10, String str, long j11, int i11, boolean z9, String str2, String str3, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            j10 = answerSheetBundle.taskId;
        }
        long j12 = j10;
        if ((i12 & 2) != 0) {
            i10 = answerSheetBundle.taskState;
        }
        int i13 = i10;
        if ((i12 & 4) != 0) {
            str = answerSheetBundle.address;
        }
        return answerSheetBundle.copy(j12, i13, str, (i12 & 8) != 0 ? answerSheetBundle.testPagerId : j11, (i12 & 16) != 0 ? answerSheetBundle.serialNum : i11, (i12 & 32) != 0 ? answerSheetBundle.isNoStem : z9, (i12 & 64) != 0 ? answerSheetBundle.uuid : str2, (i12 & 128) != 0 ? answerSheetBundle.path : str3);
    }

    /* renamed from: component1, reason: from getter */
    public final long getTaskId() {
        return this.taskId;
    }

    /* renamed from: component2, reason: from getter */
    public final int getTaskState() {
        return this.taskState;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    /* renamed from: component4, reason: from getter */
    public final long getTestPagerId() {
        return this.testPagerId;
    }

    /* renamed from: component5, reason: from getter */
    public final int getSerialNum() {
        return this.serialNum;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsNoStem() {
        return this.isNoStem;
    }

    /* renamed from: component7, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    /* renamed from: component8, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    public final AnswerSheetBundle copy(long taskId, int taskState, String address, long testPagerId, int serialNum, boolean isNoStem, String uuid, String path) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(path, "path");
        return new AnswerSheetBundle(taskId, taskState, address, testPagerId, serialNum, isNoStem, uuid, path);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnswerSheetBundle)) {
            return false;
        }
        AnswerSheetBundle answerSheetBundle = (AnswerSheetBundle) other;
        return this.taskId == answerSheetBundle.taskId && this.taskState == answerSheetBundle.taskState && Intrinsics.areEqual(this.address, answerSheetBundle.address) && this.testPagerId == answerSheetBundle.testPagerId && this.serialNum == answerSheetBundle.serialNum && this.isNoStem == answerSheetBundle.isNoStem && Intrinsics.areEqual(this.uuid, answerSheetBundle.uuid) && Intrinsics.areEqual(this.path, answerSheetBundle.path);
    }

    public final String getAddress() {
        return this.address;
    }

    public final String getPath() {
        return this.path;
    }

    public final int getSerialNum() {
        return this.serialNum;
    }

    public final long getTaskId() {
        return this.taskId;
    }

    public final int getTaskState() {
        return this.taskState;
    }

    public final long getTestPagerId() {
        return this.testPagerId;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        return (((((((((((((Long.hashCode(this.taskId) * 31) + Integer.hashCode(this.taskState)) * 31) + this.address.hashCode()) * 31) + Long.hashCode(this.testPagerId)) * 31) + Integer.hashCode(this.serialNum)) * 31) + Boolean.hashCode(this.isNoStem)) * 31) + this.uuid.hashCode()) * 31) + this.path.hashCode();
    }

    public final boolean isNoStem() {
        return this.isNoStem;
    }

    public String toString() {
        return "AnswerSheetBundle(taskId=" + this.taskId + ", taskState=" + this.taskState + ", address=" + this.address + ", testPagerId=" + this.testPagerId + ", serialNum=" + this.serialNum + ", isNoStem=" + this.isNoStem + ", uuid=" + this.uuid + ", path=" + this.path + ")";
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ AnswerSheetBundle(long r14, int r16, java.lang.String r17, long r18, int r20, boolean r21, java.lang.String r22, java.lang.String r23, int r24, kotlin.jvm.internal.DefaultConstructorMarker r25) {
        /*
            r13 = this;
            r0 = r24
            r1 = r0 & 2
            if (r1 == 0) goto Le
            com.zykj.evaluation.bean.TaskState$ToDo r1 = com.zykj.evaluation.bean.TaskState.ToDo.INSTANCE
            int r1 = r1.getState()
            r5 = r1
            goto L10
        Le:
            r5 = r16
        L10:
            r1 = r0 & 4
            java.lang.String r2 = ""
            if (r1 == 0) goto L18
            r6 = r2
            goto L1a
        L18:
            r6 = r17
        L1a:
            r1 = r0 & 8
            if (r1 == 0) goto L22
            r3 = 0
            r7 = r3
            goto L24
        L22:
            r7 = r18
        L24:
            r1 = r0 & 16
            r3 = 0
            if (r1 == 0) goto L2b
            r9 = r3
            goto L2d
        L2b:
            r9 = r20
        L2d:
            r1 = r0 & 32
            if (r1 == 0) goto L33
            r10 = r3
            goto L35
        L33:
            r10 = r21
        L35:
            r1 = r0 & 64
            if (r1 == 0) goto L3b
            r11 = r2
            goto L3d
        L3b:
            r11 = r22
        L3d:
            r0 = r0 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L45
            r12 = r2
            r3 = r14
            r2 = r13
            goto L49
        L45:
            r12 = r23
            r2 = r13
            r3 = r14
        L49:
            r2.<init>(r3, r5, r6, r7, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.bean.bundle.AnswerSheetBundle.<init>(long, int, java.lang.String, long, int, boolean, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/bean/bundle/AnswerSheetBundle.smali:142
    }
}
