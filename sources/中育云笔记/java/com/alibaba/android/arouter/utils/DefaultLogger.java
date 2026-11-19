package com.alibaba.android.arouter.utils;

import android.util.Log;
import com.alibaba.android.arouter.facade.template.ILogger;

/* loaded from: classes3.dex */
public class DefaultLogger implements ILogger {
    private static boolean isMonitorMode = false;
    private static boolean isShowLog = false;
    private static boolean isShowStackTrace = false;
    private String defaultTag;

    public DefaultLogger() {
        this.defaultTag = Consts.SDK_NAME;
    }

    public static String getExtInfo(StackTraceElement stackTraceElement) {
        StringBuilder sb2 = new StringBuilder("[");
        if (isShowStackTrace) {
            String name = Thread.currentThread().getName();
            String fileName = stackTraceElement.getFileName();
            String className = stackTraceElement.getClassName();
            String methodName = stackTraceElement.getMethodName();
            long id2 = Thread.currentThread().getId();
            int lineNumber = stackTraceElement.getLineNumber();
            sb2.append("ThreadId=");
            sb2.append(id2);
            sb2.append(" & ");
            sb2.append("ThreadName=");
            sb2.append(name);
            sb2.append(" & ");
            sb2.append("FileName=");
            sb2.append(fileName);
            sb2.append(" & ");
            sb2.append("ClassName=");
            sb2.append(className);
            sb2.append(" & ");
            sb2.append("MethodName=");
            sb2.append(methodName);
            sb2.append(" & ");
            sb2.append("LineNumber=");
            sb2.append(lineNumber);
        }
        sb2.append(" ] ");
        return sb2.toString();
    }

    @Override // com.alibaba.android.arouter.facade.template.ILogger
    public void debug(String str, String str2) {
        if (isShowLog) {
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
            if (android.text.TextUtils.isEmpty(str)) {
                getDefaultTag();
            }
            getExtInfo(stackTraceElement);
        }
    }

    @Override // com.alibaba.android.arouter.facade.template.ILogger
    public void error(String str, String str2) {
        if (isShowLog) {
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
            if (android.text.TextUtils.isEmpty(str)) {
                str = getDefaultTag();
            }
            Log.e(str, str2 + getExtInfo(stackTraceElement));
        }
    }

    @Override // com.alibaba.android.arouter.facade.template.ILogger
    public String getDefaultTag() {
        return this.defaultTag;
    }

    @Override // com.alibaba.android.arouter.facade.template.ILogger
    public void info(String str, String str2) {
        if (isShowLog) {
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
            if (android.text.TextUtils.isEmpty(str)) {
                str = getDefaultTag();
            }
            Log.i(str, str2 + getExtInfo(stackTraceElement));
        }
    }

    @Override // com.alibaba.android.arouter.facade.template.ILogger
    public boolean isMonitorMode() {
        return isMonitorMode;
    }

    @Override // com.alibaba.android.arouter.facade.template.ILogger
    public void monitor(String str) {
        if (isShowLog && isMonitorMode()) {
            getExtInfo(Thread.currentThread().getStackTrace()[3]);
        }
    }

    @Override // com.alibaba.android.arouter.facade.template.ILogger
    public void showLog(boolean z10) {
        isShowLog = z10;
    }

    public void showMonitor(boolean z10) {
        isMonitorMode = z10;
    }

    @Override // com.alibaba.android.arouter.facade.template.ILogger
    public void showStackTrace(boolean z10) {
        isShowStackTrace = z10;
    }

    @Override // com.alibaba.android.arouter.facade.template.ILogger
    public void warning(String str, String str2) {
        if (isShowLog) {
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
            if (android.text.TextUtils.isEmpty(str)) {
                str = getDefaultTag();
            }
            Log.w(str, str2 + getExtInfo(stackTraceElement));
        }
    }

    public DefaultLogger(String str) {
        this.defaultTag = str;
    }

    @Override // com.alibaba.android.arouter.facade.template.ILogger
    public void error(String str, String str2, Throwable th) {
        if (isShowLog) {
            if (android.text.TextUtils.isEmpty(str)) {
                str = getDefaultTag();
            }
            Log.e(str, str2, th);
        }
    }
}
