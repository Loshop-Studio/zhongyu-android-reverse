package com.zykj.base.utils;

import android.net.ParseException;
import androidx.annotation.Keep;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.gson.JsonParseException;
import com.tencent.mars.xlog.Log;
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
@Metadata(m13412d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\b"}, m13413d2 = {"Lcom/zykj/base/utils/ExceptionHandle;", "", "()V", "caseRemoteCodeException", "Lcom/zykj/http/exception/RemoteCodeException;", "e", "", "handleException", "base_release"}, m13414k = 1, m13415mv = {1, 5, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes4.dex */
public final class ExceptionHandle {
    public static final ExceptionHandle INSTANCE = new ExceptionHandle();

    private ExceptionHandle() {
    }

    public final RemoteCodeException caseRemoteCodeException(Throwable e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        Log.m5510e("ExceptionHandle", e10.toString());
        if (e10 instanceof RemoteCodeException) {
            return (RemoteCodeException) e10;
        }
        if (e10 instanceof HttpException) {
            return new RemoteCodeException(ErrorCodeHandler.INSTANCE.getErrorCode(((HttpException) e10).m15620a()));
        }
        if (e10 instanceof ConnectException) {
            return new RemoteCodeException(ErrorCode.NET_NO_CONNECT);
        }
        if (e10 instanceof SocketTimeoutException) {
            return new RemoteCodeException(ErrorCode.NET_SOCKET_TIME_OUT);
        }
        if (e10 instanceof UnknownHostException) {
            return new RemoteCodeException(ErrorCode.NET_NO_CONNECT);
        }
        return e10 instanceof JsonParseException ? true : e10 instanceof JSONException ? true : e10 instanceof ParseException ? new RemoteCodeException(ErrorCode.JSON_PARSE_FAIL) : new RemoteCodeException(ErrorCode.DEFAULT_ERROR, e10);
    }

    public final RemoteCodeException handleException(Throwable e10) {
        Throwable cause;
        Intrinsics.checkNotNullParameter(e10, "e");
        return (!(e10 instanceof UndeclaredThrowableException) || (cause = e10.getCause()) == null) ? caseRemoteCodeException(e10) : INSTANCE.caseRemoteCodeException(cause);
    }
}
