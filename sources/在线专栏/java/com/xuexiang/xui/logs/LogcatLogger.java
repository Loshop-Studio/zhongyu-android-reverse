package com.xuexiang.xui.logs;

import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;

/* loaded from: classes.dex */
public class LogcatLogger implements ILogger {
    private static final int MAX_LOG_LENGTH = 4000;

    private String getStackTraceString(Throwable th) {
        StringWriter stringWriter = new StringWriter(256);
        PrintWriter printWriter = new PrintWriter((Writer) stringWriter, false);
        th.printStackTrace(printWriter);
        printWriter.flush();
        return stringWriter.toString();
    }

    private void logSub(int i4, String str, String str2) {
        switch (i4) {
            case 2:
                Log.v(str, str2);
                break;
            case 3:
                Log.d(str, str2);
                break;
            case 4:
                Log.i(str, str2);
                break;
            case 5:
                Log.w(str, str2);
                break;
            case 6:
                Log.e(str, str2);
                break;
            case 7:
                Log.wtf(str, str2);
                break;
            default:
                Log.v(str, str2);
                break;
        }
    }

    @Override // com.xuexiang.xui.logs.ILogger
    public void log(int i4, String str, String str2, Throwable th) {
        if (str2 != null && str2.length() == 0) {
            str2 = null;
        }
        if (str2 == null) {
            if (th == null) {
                return;
            } else {
                str2 = getStackTraceString(th);
            }
        } else if (th != null) {
            str2 = str2 + "\n" + getStackTraceString(th);
        }
        log(i4, str, str2);
    }

    public void log(int i4, String str, String str2) {
        int length = str2.length() / MAX_LOG_LENGTH;
        if (length > 0) {
            int i5 = 0;
            int i6 = 0;
            while (i5 < length) {
                int i7 = i6 + MAX_LOG_LENGTH;
                logSub(i4, str, str2.substring(i6, i7));
                i5++;
                i6 = i7;
            }
            logSub(i4, str, str2.substring(i6));
            return;
        }
        logSub(i4, str, str2);
    }
}
