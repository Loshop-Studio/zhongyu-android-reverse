package com.alibaba.sdk.android.logger.p027b;

import com.alibaba.sdk.android.logger.ILogger;
import com.alibaba.sdk.android.logger.LogLevel;
import com.alibaba.sdk.android.logger.interceptor.InterfaceC1130d;
import com.alibaba.sdk.android.logger.p026a.C1118a;
import java.util.ArrayList;
import okhttp3.HttpUrl;

/* renamed from: com.alibaba.sdk.android.logger.b.h */
/* loaded from: classes.dex */
public class C1126h implements InterfaceC1130d {

    /* renamed from: a */
    private static final String[] f6572a = {"null"};

    /* renamed from: b */
    private static final String[] f6573b = {HttpUrl.PATH_SEGMENT_ENCODE_SET_URI};

    /* renamed from: c */
    private C1118a f6574c;

    public C1126h(C1118a c1118a) {
        this.f6574c = c1118a;
    }

    /* renamed from: a */
    private String[] m5106a(Object[] objArr) {
        if (objArr == null) {
            return f6572a;
        }
        if (objArr.length == 0) {
            return f6573b;
        }
        String[] strArr = new String[objArr.length];
        for (int i4 = 0; i4 < objArr.length; i4++) {
            strArr[i4] = this.f6574c.m5093a(objArr[i4]);
        }
        return strArr;
    }

    /* renamed from: a */
    private String[] m5107a(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        boolean z3 = true;
        for (String str : strArr) {
            if (str == null) {
                str = "";
            }
            if (z3) {
                z3 = false;
            } else {
                sb.append(" ");
            }
            if (str.contains("\n")) {
                String[] strArrSplit = str.split("\n");
                for (int i4 = 0; i4 < strArrSplit.length; i4++) {
                    sb.append(strArrSplit[i4]);
                    if (i4 < strArrSplit.length - 1) {
                        arrayList.add(sb.toString());
                        sb = new StringBuilder();
                    } else if (i4 == strArrSplit.length - 1 && str.endsWith("\n")) {
                        arrayList.add(sb.toString());
                        sb = new StringBuilder();
                        z3 = true;
                    }
                }
            } else {
                sb.append(str);
            }
        }
        arrayList.add(sb.toString());
        return (String[]) arrayList.toArray(new String[0]);
    }

    @Override // com.alibaba.sdk.android.logger.interceptor.InterfaceC1130d
    /* renamed from: a */
    public void mo5108a(LogLevel logLevel, String str, Object[] objArr, ILogger iLogger) {
        for (String str2 : m5107a(m5106a(objArr))) {
            iLogger.print(logLevel, str, str2);
        }
    }
}
