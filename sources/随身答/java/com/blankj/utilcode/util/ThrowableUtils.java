package com.blankj.utilcode.util;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/* loaded from: classes3.dex */
public class ThrowableUtils {
    private static final String LINE_SEP = System.getProperty("line.separator");

    private ThrowableUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static String getFullStackTrace(Throwable th) {
        List<String> stackFrameList;
        ArrayList arrayList = new ArrayList();
        while (th != null && !arrayList.contains(th)) {
            arrayList.add(th);
            th = th.getCause();
        }
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList();
        int i9 = size - 1;
        List<String> stackFrameList2 = getStackFrameList((Throwable) arrayList.get(i9));
        while (true) {
            int i10 = size - 1;
            if (i10 < 0) {
                break;
            }
            if (i10 != 0) {
                stackFrameList = getStackFrameList((Throwable) arrayList.get(size - 2));
                removeCommonFrames(stackFrameList2, stackFrameList);
            } else {
                stackFrameList = stackFrameList2;
            }
            if (i10 == i9) {
                arrayList2.add(((Throwable) arrayList.get(i10)).toString());
            } else {
                arrayList2.add(" Caused by: " + ((Throwable) arrayList.get(i10)).toString());
            }
            arrayList2.addAll(stackFrameList2);
            stackFrameList2 = stackFrameList;
            size = i10;
        }
        StringBuilder sb = new StringBuilder();
        int size2 = arrayList2.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj = arrayList2.get(i11);
            i11++;
            sb.append((String) obj);
            sb.append(LINE_SEP);
        }
        return sb.toString();
    }

    private static List<String> getStackFrameList(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter((Writer) stringWriter, true));
        StringTokenizer stringTokenizer = new StringTokenizer(stringWriter.toString(), LINE_SEP);
        ArrayList arrayList = new ArrayList();
        boolean z9 = false;
        while (stringTokenizer.hasMoreTokens()) {
            String strNextToken = stringTokenizer.nextToken();
            int iIndexOf = strNextToken.indexOf("at");
            if (iIndexOf != -1 && strNextToken.substring(0, iIndexOf).trim().isEmpty()) {
                arrayList.add(strNextToken);
                z9 = true;
            } else if (z9) {
                break;
            }
        }
        return arrayList;
    }

    private static void removeCommonFrames(List<String> list, List<String> list2) {
        int size = list.size() - 1;
        for (int size2 = list2.size() - 1; size >= 0 && size2 >= 0; size2--) {
            if (list.get(size).equals(list2.get(size2))) {
                list.remove(size);
            }
            size--;
        }
    }
}
