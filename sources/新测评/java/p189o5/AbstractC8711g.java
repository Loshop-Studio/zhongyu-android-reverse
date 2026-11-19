package p189o5;

import com.zykj.http.bean.ApiResp;
import com.zykj.http.bean.ErrorInfo;
import com.zykj.http.exception.RemoteCodeException;
import com.zykj.lib.error.code.ErrorCodeInfo;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: o5.g */
/* loaded from: classes4.dex */
public abstract class AbstractC8711g {
    /* renamed from: a */
    public static final Object m14346a(ApiResp apiResp) throws RemoteCodeException {
        String message;
        String message2;
        Intrinsics.checkNotNullParameter(apiResp, "<this>");
        if (apiResp.getSuccess()) {
            Object result = apiResp.getResult();
            Intrinsics.checkNotNull(result);
            return result;
        }
        ErrorInfo error = apiResp.getError();
        int code = error != null ? error.getCode() : 0;
        ErrorInfo error2 = apiResp.getError();
        String str = "";
        if (error2 == null || (message = error2.getMessage()) == null) {
            message = "";
        }
        ErrorInfo error3 = apiResp.getError();
        if (error3 != null && (message2 = error3.getMessage()) != null) {
            str = message2;
        }
        throw new RemoteCodeException(new ErrorCodeInfo(code, message, null, str));
    }

    /* renamed from: b */
    public static final Object m14347b(ApiResp apiResp) throws RemoteCodeException {
        String message;
        String message2;
        Intrinsics.checkNotNullParameter(apiResp, "<this>");
        if (apiResp.getSuccess()) {
            return apiResp.getResult();
        }
        ErrorInfo error = apiResp.getError();
        int code = error != null ? error.getCode() : 0;
        ErrorInfo error2 = apiResp.getError();
        String str = "";
        if (error2 == null || (message = error2.getMessage()) == null) {
            message = "";
        }
        ErrorInfo error3 = apiResp.getError();
        if (error3 != null && (message2 = error3.getMessage()) != null) {
            str = message2;
        }
        throw new RemoteCodeException(new ErrorCodeInfo(code, message, null, str));
    }
}
