package org.slf4j.helpers;

import java.io.PrintStream;

/* loaded from: classes5.dex */
public class Util {
    public static final void report(String str, Throwable th) {
        System.err.println(str);
        System.err.println("Reported exception:");
        th.printStackTrace();
    }

    public static final void report(String str) {
        PrintStream printStream = System.err;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("SLF4J: ");
        stringBuffer.append(str);
        printStream.println(stringBuffer.toString());
    }
}
