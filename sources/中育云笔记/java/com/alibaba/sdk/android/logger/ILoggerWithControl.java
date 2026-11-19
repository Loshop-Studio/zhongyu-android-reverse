package com.alibaba.sdk.android.logger;

/* loaded from: classes3.dex */
public interface ILoggerWithControl extends ILogger {
    boolean isEnabled();

    boolean isPrint(LogLevel logLevel);
}
