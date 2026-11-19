package com.blankj.utilcode.util;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/* renamed from: com.blankj.utilcode.util.i0 */
/* loaded from: classes3.dex */
public abstract class AbstractC4651i0 {

    /* renamed from: a */
    public static final String f2082a = System.getProperty("line.separator");

    /* renamed from: a */
    public static String m2195a(Throwable th) {
        List listM2196b;
        ArrayList arrayList = new ArrayList();
        while (th != null && !arrayList.contains(th)) {
            arrayList.add(th);
            th = th.getCause();
        }
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList();
        int i6 = size - 1;
        List listM2196b2 = m2196b((Throwable) arrayList.get(i6));
        while (true) {
            int i7 = size - 1;
            if (i7 < 0) {
                break;
            }
            if (i7 != 0) {
                listM2196b = m2196b((Throwable) arrayList.get(size - 2));
                m2197c(listM2196b2, listM2196b);
            } else {
                listM2196b = listM2196b2;
            }
            if (i7 == i6) {
                arrayList2.add(((Throwable) arrayList.get(i7)).toString());
            } else {
                arrayList2.add(" Caused by: " + ((Throwable) arrayList.get(i7)).toString());
            }
            arrayList2.addAll(listM2196b2);
            listM2196b2 = listM2196b;
            size = i7;
        }
        StringBuilder sb = new StringBuilder();
        int size2 = arrayList2.size();
        int i8 = 0;
        while (i8 < size2) {
            Object obj = arrayList2.get(i8);
            i8++;
            sb.append((String) obj);
            sb.append(f2082a);
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static List m2196b(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter((Writer) stringWriter, true));
        StringTokenizer stringTokenizer = new StringTokenizer(stringWriter.toString(), f2082a);
        ArrayList arrayList = new ArrayList();
        boolean z6 = false;
        while (stringTokenizer.hasMoreTokens()) {
            String strNextToken = stringTokenizer.nextToken();
            int iIndexOf = strNextToken.indexOf("at");
            if (iIndexOf != -1 && strNextToken.substring(0, iIndexOf).trim().isEmpty()) {
                arrayList.add(strNextToken);
                z6 = true;
            } else if (z6) {
                break;
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public static void m2197c(List list, List list2) {
        int size = list.size() - 1;
        for (int size2 = list2.size() - 1; size >= 0 && size2 >= 0; size2--) {
            if (((String) list.get(size)).equals((String) list2.get(size2))) {
                list.remove(size);
            }
            size--;
        }
    }
}
