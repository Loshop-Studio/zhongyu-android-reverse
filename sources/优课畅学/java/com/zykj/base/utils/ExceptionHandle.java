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
import kotlin.jvm.internal.AbstractC9133u;
import org.json.JSONException;
import retrofit2.HttpException;

@Keep
/* loaded from: classes4.dex */
public final class ExceptionHandle {
    public static final ExceptionHandle INSTANCE = new ExceptionHandle();

    private ExceptionHandle() {
    }

    public final RemoteCodeException caseRemoteCodeException(Throwable e10) {
        AbstractC9133u.m16133g(e10, "e");
        return e10 instanceof RemoteCodeException ? (RemoteCodeException) e10 : e10 instanceof HttpException ? new RemoteCodeException(ErrorCodeHandler.INSTANCE.getErrorCode(((HttpException) e10).m18589a())) : e10 instanceof ConnectException ? new RemoteCodeException(ErrorCode.NET_NO_CONNECT) : e10 instanceof SocketTimeoutException ? new RemoteCodeException(ErrorCode.NET_SOCKET_TIME_OUT) : e10 instanceof UnknownHostException ? new RemoteCodeException(ErrorCode.NET_NO_CONNECT) : ((e10 instanceof JsonParseException) || (e10 instanceof JSONException) || (e10 instanceof ParseException)) ? new RemoteCodeException(ErrorCode.JSON_PARSE_FAIL) : new RemoteCodeException(ErrorCode.DEFAULT_ERROR, e10);
    }

    public final RemoteCodeException handleException(Throwable e10) {
        Throwable cause;
        AbstractC9133u.m16133g(e10, "e");
        return (!(e10 instanceof UndeclaredThrowableException) || (cause = ((UndeclaredThrowableException) e10).getCause()) == null) ? caseRemoteCodeException(e10) : INSTANCE.caseRemoteCodeException(cause);
    }
}
