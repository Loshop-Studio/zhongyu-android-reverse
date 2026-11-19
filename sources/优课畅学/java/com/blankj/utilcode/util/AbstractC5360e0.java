package com.blankj.utilcode.util;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

/* renamed from: com.blankj.utilcode.util.e0 */
/* loaded from: classes3.dex */
public abstract class AbstractC5360e0 {

    /* renamed from: a */
    public static final String f2694a = System.getProperty("line.separator");

    /* renamed from: a */
    public static String m2447a(Throwable th) {
        List listM2448b;
        ArrayList arrayList = new ArrayList();
        while (th != null && !arrayList.contains(th)) {
            arrayList.add(th);
            th = th.getCause();
        }
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList();
        int i10 = size - 1;
        List listM2448b2 = m2448b((Throwable) arrayList.get(i10));
        while (true) {
            int i11 = size - 1;
            if (i11 < 0) {
                break;
            }
            if (i11 != 0) {
                listM2448b = m2448b((Throwable) arrayList.get(size - 2));
                m2449c(listM2448b2, listM2448b);
            } else {
                listM2448b = listM2448b2;
            }
            if (i11 == i10) {
                arrayList2.add(((Throwable) arrayList.get(i11)).toString());
            } else {
                arrayList2.add(" Caused by: " + ((Throwable) arrayList.get(i11)).toString());
            }
            arrayList2.addAll(listM2448b2);
            listM2448b2 = listM2448b;
            size = i11;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            sb.append(f2694a);
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static List m2448b(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter((Writer) stringWriter, true));
        StringTokenizer stringTokenizer = new StringTokenizer(stringWriter.toString(), f2694a);
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        while (stringTokenizer.hasMoreTokens()) {
            String strNextToken = stringTokenizer.nextToken();
            int iIndexOf = strNextToken.indexOf("at");
            if (iIndexOf != -1 && strNextToken.substring(0, iIndexOf).trim().isEmpty()) {
                arrayList.add(strNextToken);
                z10 = true;
            } else if (z10) {
                break;
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public static void m2449c(List list, List list2) {
        int size = list.size() - 1;
        for (int size2 = list2.size() - 1; size >= 0 && size2 >= 0; size2--) {
            if (((String) list.get(size)).equals((String) list2.get(size2))) {
                list.remove(size);
            }
            size--;
        }
    }
}
