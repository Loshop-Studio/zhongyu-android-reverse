package com.zykj.evaluation.utils;

import android.net.ParseException;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
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

@StabilityInferred(parameters = 1)
@Keep
@Metadata(m13557d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¨\u0006\t"}, m13558d2 = {"Lcom/zykj/evaluation/utils/ExceptionHandle;", "", "<init>", "()V", "handleException", "Lcom/zykj/http/exception/RemoteCodeException;", "e", "", "caseRemoteCodeException", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
/* loaded from: classes4.dex */
public final class ExceptionHandle {
    public static final int $stable = 0;
    public static final ExceptionHandle INSTANCE = new ExceptionHandle();

    private ExceptionHandle() {
    }

    private final RemoteCodeException caseRemoteCodeException(Throwable e10) {
        Log.e("ExceptionHandle", e10.toString());
        return e10 instanceof RemoteCodeException ? (RemoteCodeException) e10 : e10 instanceof HttpException ? new RemoteCodeException(ErrorCodeHandler.INSTANCE.getErrorCode(((HttpException) e10).m15338a())) : e10 instanceof ConnectException ? new RemoteCodeException(ErrorCode.NET_NO_CONNECT) : e10 instanceof SocketTimeoutException ? new RemoteCodeException(ErrorCode.NET_SOCKET_TIME_OUT) : e10 instanceof UnknownHostException ? new RemoteCodeException(ErrorCode.NET_NO_CONNECT) : ((e10 instanceof JsonParseException) || (e10 instanceof JSONException) || (e10 instanceof ParseException)) ? new RemoteCodeException(ErrorCode.JSON_PARSE_FAIL) : new RemoteCodeException(ErrorCode.DEFAULT_ERROR, e10);
    }

    public final RemoteCodeException handleException(Throwable e10) {
        Throwable cause;
        Intrinsics.checkNotNullParameter(e10, "e");
        return (!(e10 instanceof UndeclaredThrowableException) || (cause = ((UndeclaredThrowableException) e10).getCause()) == null) ? caseRemoteCodeException(e10) : INSTANCE.caseRemoteCodeException(cause);
    }
}
