package com.zykj.base.utils;

import android.net.ParseException;
import androidx.annotation.Keep;
import com.google.gson.JsonParseException;
import com.zykj.http.exception.RemoteCodeException;
import com.zykj.lib.error.code.ErrorCode;
import com.zykj.lib.error.code.ErrorCodeHandler;
import java.lang.reflect.UndeclaredThrowableException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import retrofit2.HttpException;

@Keep
@Metadata(m7879d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\t"}, m7880d2 = {"Lcom/zykj/base/utils/ExceptionHandle;", "", "<init>", "()V", "handleException", "Lcom/zykj/http/exception/RemoteCodeException;", "e", "", "caseRemoteCodeException", "base_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes3.dex */
public final class ExceptionHandle {
    public static final ExceptionHandle INSTANCE = new ExceptionHandle();

    private ExceptionHandle() {
    }

    public final RemoteCodeException caseRemoteCodeException(Throwable e6) {
        Intrinsics.checkNotNullParameter(e6, "e");
        return e6 instanceof RemoteCodeException ? (RemoteCodeException) e6 : e6 instanceof HttpException ? new RemoteCodeException(ErrorCodeHandler.INSTANCE.getErrorCode(((HttpException) e6).m9114a())) : e6 instanceof ConnectException ? new RemoteCodeException(ErrorCode.NET_NO_CONNECT) : e6 instanceof SocketTimeoutException ? new RemoteCodeException(ErrorCode.NET_SOCKET_TIME_OUT) : e6 instanceof UnknownHostException ? new RemoteCodeException(ErrorCode.NET_NO_CONNECT) : ((e6 instanceof JsonParseException) || (e6 instanceof JSONException) || (e6 instanceof ParseException)) ? new RemoteCodeException(ErrorCode.JSON_PARSE_FAIL) : new RemoteCodeException(ErrorCode.DEFAULT_ERROR, e6);
    }

    public final RemoteCodeException handleException(Throwable e6) {
        Throwable cause;
        Intrinsics.checkNotNullParameter(e6, "e");
        return (!(e6 instanceof UndeclaredThrowableException) || (cause = ((UndeclaredThrowableException) e6).getCause()) == null) ? caseRemoteCodeException(e6) : INSTANCE.caseRemoteCodeException(cause);
    }
}
