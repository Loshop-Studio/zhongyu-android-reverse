package com.zykj.student.dialogue.bean.resp;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.gson.annotations.SerializedName;
import com.zykj.lib.error.code.ErrorCodeInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 0)
@Metadata(m13412d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m13413d2 = {"Lcom/zykj/student/dialogue/bean/resp/VersionUpdate;", "", "success", "", "error", "Lcom/zykj/lib/error/code/ErrorCodeInfo;", "result", "Lcom/zykj/student/dialogue/bean/resp/VersionResult;", "<init>", "(ZLcom/zykj/lib/error/code/ErrorCodeInfo;Lcom/zykj/student/dialogue/bean/resp/VersionResult;)V", "getSuccess", "()Z", "getError", "()Lcom/zykj/lib/error/code/ErrorCodeInfo;", "getResult", "()Lcom/zykj/student/dialogue/bean/resp/VersionResult;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes5.dex */
public final /* data */ class VersionUpdate {
    public static final int $stable = 8;

    @SerializedName("error")
    private final ErrorCodeInfo error;

    @SerializedName("result")
    private final VersionResult result;

    @SerializedName("success")
    private final boolean success;

    public VersionUpdate(boolean z9, ErrorCodeInfo errorCodeInfo, VersionResult versionResult) {
        this.success = z9;
        this.error = errorCodeInfo;
        this.result = versionResult;
    }

    public static /* synthetic */ VersionUpdate copy$default(VersionUpdate versionUpdate, boolean z9, ErrorCodeInfo errorCodeInfo, VersionResult versionResult, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            z9 = versionUpdate.success;
        }
        if ((i9 & 2) != 0) {
            errorCodeInfo = versionUpdate.error;
        }
        if ((i9 & 4) != 0) {
            versionResult = versionUpdate.result;
        }
        return versionUpdate.copy(z9, errorCodeInfo, versionResult);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    /* renamed from: component2, reason: from getter */
    public final ErrorCodeInfo getError() {
        return this.error;
    }

    /* renamed from: component3, reason: from getter */
    public final VersionResult getResult() {
        return this.result;
    }

    public final VersionUpdate copy(boolean success, ErrorCodeInfo error, VersionResult result) {
        return new VersionUpdate(success, error, result);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VersionUpdate)) {
            return false;
        }
        VersionUpdate versionUpdate = (VersionUpdate) other;
        return this.success == versionUpdate.success && Intrinsics.areEqual(this.error, versionUpdate.error) && Intrinsics.areEqual(this.result, versionUpdate.result);
    }

    public final ErrorCodeInfo getError() {
        return this.error;
    }

    public final VersionResult getResult() {
        return this.result;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.success) * 31;
        ErrorCodeInfo errorCodeInfo = this.error;
        int iHashCode2 = (iHashCode + (errorCodeInfo == null ? 0 : errorCodeInfo.hashCode())) * 31;
        VersionResult versionResult = this.result;
        return iHashCode2 + (versionResult != null ? versionResult.hashCode() : 0);
    }

    public String toString() {
        return "VersionUpdate(success=" + this.success + ", error=" + this.error + ", result=" + this.result + ")";
    }
}
