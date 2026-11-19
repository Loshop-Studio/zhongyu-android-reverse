package com.alibaba.sdk.android.logger.p057b;

import com.alibaba.sdk.android.logger.ILogger;
import com.alibaba.sdk.android.logger.LogLevel;
import com.alibaba.sdk.android.logger.interceptor.InterfaceC5614d;
import com.alibaba.sdk.android.logger.p056a.C5602a;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import java.util.ArrayList;

/* renamed from: com.alibaba.sdk.android.logger.b.h */
/* loaded from: classes3.dex */
public class C5610h implements InterfaceC5614d {

    /* renamed from: a */
    private static final String[] f4091a = {"null"};

    /* renamed from: b */
    private static final String[] f4092b = {"[]"};

    /* renamed from: c */
    private C5602a f4093c;

    public C5610h(C5602a c5602a) {
        this.f4093c = c5602a;
    }

    @Override // com.alibaba.sdk.android.logger.interceptor.InterfaceC5614d
    /* renamed from: a */
    public void mo3558a(LogLevel logLevel, String str, Object[] objArr, ILogger iLogger) {
        for (String str2 : m3557a(m3556a(objArr))) {
            iLogger.print(logLevel, str, str2);
        }
    }

    /* renamed from: a */
    private String[] m3556a(Object[] objArr) {
        if (objArr == null) {
            return f4091a;
        }
        if (objArr.length == 0) {
            return f4092b;
        }
        String[] strArr = new String[objArr.length];
        for (int i10 = 0; i10 < objArr.length; i10++) {
            strArr[i10] = this.f4093c.m3543a(objArr[i10]);
        }
        return strArr;
    }

    /* renamed from: a */
    private String[] m3557a(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = true;
        for (String str : strArr) {
            if (str == null) {
                str = "";
            }
            if (z10) {
                z10 = false;
            } else {
                sb2.append(" ");
            }
            if (str.contains(SignParameters.NEW_LINE)) {
                String[] strArrSplit = str.split(SignParameters.NEW_LINE);
                for (int i10 = 0; i10 < strArrSplit.length; i10++) {
                    sb2.append(strArrSplit[i10]);
                    if (i10 < strArrSplit.length - 1) {
                        arrayList.add(sb2.toString());
                        sb2 = new StringBuilder();
                    } else if (i10 == strArrSplit.length - 1 && str.endsWith(SignParameters.NEW_LINE)) {
                        arrayList.add(sb2.toString());
                        sb2 = new StringBuilder();
                        z10 = true;
                    }
                }
            } else {
                sb2.append(str);
            }
        }
        arrayList.add(sb2.toString());
        return (String[]) arrayList.toArray(new String[0]);
    }
}
