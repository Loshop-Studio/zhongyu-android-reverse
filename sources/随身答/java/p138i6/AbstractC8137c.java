package p138i6;

import com.zykj.http.exception.RemoteCodeException;
import com.zykj.lib.error.code.ErrorCodeInfo;
import com.zykj.student.dialogue.network.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: i6.c */
/* loaded from: classes5.dex */
public abstract class AbstractC8137c {
    /* renamed from: a */
    public static final Object m13042a(BaseResponse baseResponse) throws RemoteCodeException {
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

    /* renamed from: b */
    public static final Object m13043b(BaseResponse baseResponse) throws RemoteCodeException {
        String message;
        String message2;
        Intrinsics.checkNotNullParameter(baseResponse, "<this>");
        if (baseResponse.getSuccess()) {
            return baseResponse.getResult();
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
