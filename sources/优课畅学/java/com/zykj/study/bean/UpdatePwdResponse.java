package com.zykj.study.bean;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class UpdatePwdResponse {
    public static final int $stable = 8;
    private final ErrorRemote error;
    private final boolean success;

    public UpdatePwdResponse(boolean z10, ErrorRemote errorRemote) {
        this.success = z10;
        this.error = errorRemote;
    }

    public static /* synthetic */ UpdatePwdResponse copy$default(UpdatePwdResponse updatePwdResponse, boolean z10, ErrorRemote errorRemote, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = updatePwdResponse.success;
        }
        if ((i10 & 2) != 0) {
            errorRemote = updatePwdResponse.error;
        }
        return updatePwdResponse.copy(z10, errorRemote);
    }

    public final boolean component1() {
        return this.success;
    }

    public final ErrorRemote component2() {
        return this.error;
    }

    public final UpdatePwdResponse copy(boolean z10, ErrorRemote errorRemote) {
        return new UpdatePwdResponse(z10, errorRemote);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdatePwdResponse)) {
            return false;
        }
        UpdatePwdResponse updatePwdResponse = (UpdatePwdResponse) obj;
        return this.success == updatePwdResponse.success && AbstractC9133u.m16128b(this.error, updatePwdResponse.error);
    }

    public final ErrorRemote getError() {
        return this.error;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.success) * 31;
        ErrorRemote errorRemote = this.error;
        return iHashCode + (errorRemote == null ? 0 : errorRemote.hashCode());
    }

    public String toString() {
        return "UpdatePwdResponse(success=" + this.success + ", error=" + this.error + ")";
    }
}
