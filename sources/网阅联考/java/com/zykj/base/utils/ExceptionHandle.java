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
@Metadata(m5174d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\b"}, m5175d2 = {"Lcom/zykj/base/utils/ExceptionHandle;", "", "()V", "caseRemoteCodeException", "Lcom/zykj/http/exception/RemoteCodeException;", "e", "", "handleException", "base_release"}, m5176k = 1, m5177mv = {1, 5, 1}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class ExceptionHandle {
    public static final ExceptionHandle INSTANCE = new ExceptionHandle();

    private ExceptionHandle() {
    }

    public final RemoteCodeException caseRemoteCodeException(Throwable e4) {
        RemoteCodeException remoteCodeException;
        Intrinsics.checkNotNullParameter(e4, "e");
        Log.m2266e("ExceptionHandle", e4.toString());
        if (e4 instanceof RemoteCodeException) {
            return (RemoteCodeException) e4;
        }
        if (e4 instanceof HttpException) {
            remoteCodeException = new RemoteCodeException(ErrorCodeHandler.INSTANCE.getErrorCode(((HttpException) e4).m6162a()));
        } else {
            if (e4 instanceof ConnectException) {
                return new RemoteCodeException(ErrorCode.NET_NO_CONNECT);
            }
            if (e4 instanceof SocketTimeoutException) {
                return new RemoteCodeException(ErrorCode.NET_SOCKET_TIME_OUT);
            }
            if (e4 instanceof UnknownHostException) {
                return new RemoteCodeException(ErrorCode.NET_NO_CONNECT);
            }
            if (e4 instanceof JsonParseException ? true : e4 instanceof JSONException ? true : e4 instanceof ParseException) {
                return new RemoteCodeException(ErrorCode.JSON_PARSE_FAIL);
            }
            remoteCodeException = new RemoteCodeException(ErrorCode.DEFAULT_ERROR, e4);
        }
        return remoteCodeException;
    }

    public final RemoteCodeException handleException(Throwable e4) {
        Throwable cause;
        Intrinsics.checkNotNullParameter(e4, "e");
        return (!(e4 instanceof UndeclaredThrowableException) || (cause = e4.getCause()) == null) ? caseRemoteCodeException(e4) : INSTANCE.caseRemoteCodeException(cause);
    }
}
