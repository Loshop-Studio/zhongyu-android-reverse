package com.zykj.huiwei.launcher.bean.resp;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@StabilityInferred(parameters = 1)
@Metadata(m7879d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/bean/resp/TodoResp;", "", "homeworkCount", "", "reviseCount", "quoraCount", "unReadSpecialCount", "unReplySpecialCount", "<init>", "(IIIII)V", "getHomeworkCount", "()I", "getReviseCount", "getQuoraCount", "getUnReadSpecialCount", "getUnReplySpecialCount", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TodoResp {
    public static final int $stable = 0;
    private final int homeworkCount;
    private final int quoraCount;
    private final int reviseCount;
    private final int unReadSpecialCount;
    private final int unReplySpecialCount;

    public TodoResp() {
        this(0, 0, 0, 0, 0, 31, null);
    }

    public static /* synthetic */ TodoResp copy$default(TodoResp todoResp, int i6, int i7, int i8, int i9, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i6 = todoResp.homeworkCount;
        }
        if ((i11 & 2) != 0) {
            i7 = todoResp.reviseCount;
        }
        if ((i11 & 4) != 0) {
            i8 = todoResp.quoraCount;
        }
        if ((i11 & 8) != 0) {
            i9 = todoResp.unReadSpecialCount;
        }
        if ((i11 & 16) != 0) {
            i10 = todoResp.unReplySpecialCount;
        }
        int i12 = i10;
        int i13 = i8;
        return todoResp.copy(i6, i7, i13, i9, i12);
    }

    /* renamed from: component1, reason: from getter */
    public final int getHomeworkCount() {
        return this.homeworkCount;
    }

    /* renamed from: component2, reason: from getter */
    public final int getReviseCount() {
        return this.reviseCount;
    }

    /* renamed from: component3, reason: from getter */
    public final int getQuoraCount() {
        return this.quoraCount;
    }

    /* renamed from: component4, reason: from getter */
    public final int getUnReadSpecialCount() {
        return this.unReadSpecialCount;
    }

    /* renamed from: component5, reason: from getter */
    public final int getUnReplySpecialCount() {
        return this.unReplySpecialCount;
    }

    public final TodoResp copy(int homeworkCount, int reviseCount, int quoraCount, int unReadSpecialCount, int unReplySpecialCount) {
        return new TodoResp(homeworkCount, reviseCount, quoraCount, unReadSpecialCount, unReplySpecialCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TodoResp)) {
            return false;
        }
        TodoResp todoResp = (TodoResp) other;
        return this.homeworkCount == todoResp.homeworkCount && this.reviseCount == todoResp.reviseCount && this.quoraCount == todoResp.quoraCount && this.unReadSpecialCount == todoResp.unReadSpecialCount && this.unReplySpecialCount == todoResp.unReplySpecialCount;
    }

    public final int getHomeworkCount() {
        return this.homeworkCount;
    }

    public final int getQuoraCount() {
        return this.quoraCount;
    }

    public final int getReviseCount() {
        return this.reviseCount;
    }

    public final int getUnReadSpecialCount() {
        return this.unReadSpecialCount;
    }

    public final int getUnReplySpecialCount() {
        return this.unReplySpecialCount;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.homeworkCount) * 31) + Integer.hashCode(this.reviseCount)) * 31) + Integer.hashCode(this.quoraCount)) * 31) + Integer.hashCode(this.unReadSpecialCount)) * 31) + Integer.hashCode(this.unReplySpecialCount);
    }

    public String toString() {
        return "TodoResp(homeworkCount=" + this.homeworkCount + ", reviseCount=" + this.reviseCount + ", quoraCount=" + this.quoraCount + ", unReadSpecialCount=" + this.unReadSpecialCount + ", unReplySpecialCount=" + this.unReplySpecialCount + ")";
    }

    public TodoResp(int i6, int i7, int i8, int i9, int i10) {
        this.homeworkCount = i6;
        this.reviseCount = i7;
        this.quoraCount = i8;
        this.unReadSpecialCount = i9;
        this.unReplySpecialCount = i10;
    }

    public /* synthetic */ TodoResp(int i6, int i7, int i8, int i9, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i6, (i11 & 2) != 0 ? 0 : i7, (i11 & 4) != 0 ? 0 : i8, (i11 & 8) != 0 ? 0 : i9, (i11 & 16) != 0 ? 0 : i10);
    }
}
