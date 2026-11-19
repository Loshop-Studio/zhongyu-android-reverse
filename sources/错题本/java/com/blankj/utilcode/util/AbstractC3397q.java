package com.blankj.utilcode.util;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.StringTokenizer;

/* renamed from: com.blankj.utilcode.util.q */
/* loaded from: classes2.dex */
public abstract class AbstractC3397q {

    /* renamed from: a */
    public static final String f2175a = System.getProperty("line.separator");

    /* renamed from: a */
    public static ArrayList m2349a(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter((Writer) stringWriter, true));
        StringTokenizer stringTokenizer = new StringTokenizer(stringWriter.toString(), f2175a);
        ArrayList arrayList = new ArrayList();
        boolean z8 = false;
        while (stringTokenizer.hasMoreTokens()) {
            String strNextToken = stringTokenizer.nextToken();
            int iIndexOf = strNextToken.indexOf("at");
            if (iIndexOf != -1 && strNextToken.substring(0, iIndexOf).trim().isEmpty()) {
                arrayList.add(strNextToken);
                z8 = true;
            } else if (z8) {
                break;
            }
        }
        return arrayList;
    }
}
