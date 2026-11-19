package p128u1;

import com.zykj.http.exception.RemoteCodeException;
import com.zykj.insight.network.BaseResponse;
import com.zykj.lib.error.code.ErrorCodeInfo;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: u1.h */
/* loaded from: classes2.dex */
public abstract class AbstractC4610h {
    /* renamed from: a */
    public static final Object m6357a(BaseResponse baseResponse) throws RemoteCodeException {
        String message;
        String message2;
        Intrinsics.checkNotNullParameter(baseResponse, "<this>");
        if (baseResponse.getSuccess()) {
            Object result = baseResponse.getResult();
            Intrinsics.checkNotNull(result);
            return result;
        }
        ErrorCodeInfo error = baseResponse.getError();
        int code = error != null ? error.getCode() : 0;
        ErrorCodeInfo error2 = baseResponse.getError();
        String str = "";
        if (error2 == null || (message = error2.getMessage()) == null) {
            message = "";
        }
        ErrorCodeInfo error3 = baseResponse.getError();
        Integer messageResId = error3 != null ? error3.getMessageResId() : null;
        ErrorCodeInfo error4 = baseResponse.getError();
        if (error4 != null && (message2 = error4.getMessage()) != null) {
            str = message2;
        }
        throw new RemoteCodeException(new ErrorCodeInfo(code, message, messageResId, str));
    }
}
