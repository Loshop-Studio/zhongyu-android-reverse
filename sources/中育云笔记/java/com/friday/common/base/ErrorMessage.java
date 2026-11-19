package com.friday.common.base;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 1)
@Keep
/* loaded from: classes3.dex */
public final class ErrorMessage {
    public static final int $stable = 0;
    private final String CurrentUserDidNotLoginToTheApplication;
    private final int code;
    private final String details;
    private final String message;
    private final String validationErrors;

    public ErrorMessage(int i10, String message, String details, String validationErrors, String CurrentUserDidNotLoginToTheApplication) {
        AbstractC9979u.m20294g(message, "message");
        AbstractC9979u.m20294g(details, "details");
        AbstractC9979u.m20294g(validationErrors, "validationErrors");
        AbstractC9979u.m20294g(CurrentUserDidNotLoginToTheApplication, "CurrentUserDidNotLoginToTheApplication");
        this.code = i10;
        this.message = message;
        this.details = details;
        this.validationErrors = validationErrors;
        this.CurrentUserDidNotLoginToTheApplication = CurrentUserDidNotLoginToTheApplication;
    }

    public static /* synthetic */ ErrorMessage copy$default(ErrorMessage errorMessage, int i10, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = errorMessage.code;
        }
        if ((i11 & 2) != 0) {
            str = errorMessage.message;
        }
        if ((i11 & 4) != 0) {
            str2 = errorMessage.details;
        }
        if ((i11 & 8) != 0) {
            str3 = errorMessage.validationErrors;
        }
        if ((i11 & 16) != 0) {
            str4 = errorMessage.CurrentUserDidNotLoginToTheApplication;
        }
        String str5 = str4;
        String str6 = str2;
        return errorMessage.copy(i10, str, str6, str3, str5);
    }

    public final int component1() {
        return this.code;
    }

    public final String component2() {
        return this.message;
    }

    public final String component3() {
        return this.details;
    }

    public final String component4() {
        return this.validationErrors;
    }

    public final String component5() {
        return this.CurrentUserDidNotLoginToTheApplication;
    }

    public final ErrorMessage copy(int i10, String message, String details, String validationErrors, String CurrentUserDidNotLoginToTheApplication) {
        AbstractC9979u.m20294g(message, "message");
        AbstractC9979u.m20294g(details, "details");
        AbstractC9979u.m20294g(validationErrors, "validationErrors");
        AbstractC9979u.m20294g(CurrentUserDidNotLoginToTheApplication, "CurrentUserDidNotLoginToTheApplication");
        return new ErrorMessage(i10, message, details, validationErrors, CurrentUserDidNotLoginToTheApplication);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ErrorMessage)) {
            return false;
        }
        ErrorMessage errorMessage = (ErrorMessage) obj;
        return this.code == errorMessage.code && AbstractC9979u.m20289b(this.message, errorMessage.message) && AbstractC9979u.m20289b(this.details, errorMessage.details) && AbstractC9979u.m20289b(this.validationErrors, errorMessage.validationErrors) && AbstractC9979u.m20289b(this.CurrentUserDidNotLoginToTheApplication, errorMessage.CurrentUserDidNotLoginToTheApplication);
    }

    public final int getCode() {
        return this.code;
    }

    public final String getCurrentUserDidNotLoginToTheApplication() {
        return this.CurrentUserDidNotLoginToTheApplication;
    }

    public final String getDetails() {
        return this.details;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getValidationErrors() {
        return this.validationErrors;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.code) * 31) + this.message.hashCode()) * 31) + this.details.hashCode()) * 31) + this.validationErrors.hashCode()) * 31) + this.CurrentUserDidNotLoginToTheApplication.hashCode();
    }

    public String toString() {
        return "ErrorMessage(code=" + this.code + ", message=" + this.message + ", details=" + this.details + ", validationErrors=" + this.validationErrors + ", CurrentUserDidNotLoginToTheApplication=" + this.CurrentUserDidNotLoginToTheApplication + ")";
    }
}
