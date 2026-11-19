package com.alibaba.sdk.android.tbrest.rest;

import com.alibaba.sdk.android.tbrest.utils.StringUtils;
import java.util.Arrays;
import java.util.Comparator;

/* renamed from: com.alibaba.sdk.android.tbrest.rest.c */
/* loaded from: classes3.dex */
public class C5703c {

    /* renamed from: a */
    private static C5703c f4512a;

    /* renamed from: a */
    private a f4513a;

    /* renamed from: a */
    private b f4514a;

    /* renamed from: com.alibaba.sdk.android.tbrest.rest.c$a */
    public class a implements Comparator<String> {
        private a() {
        }

        @Override // java.util.Comparator
        public int compare(String str, String str2) {
            if (StringUtils.isEmpty(str) || StringUtils.isEmpty(str2)) {
                return 0;
            }
            return str.compareTo(str2);
        }
    }

    /* renamed from: com.alibaba.sdk.android.tbrest.rest.c$b */
    public class b implements Comparator<String> {
        private b() {
        }

        @Override // java.util.Comparator
        public int compare(String str, String str2) {
            if (StringUtils.isEmpty(str) || StringUtils.isEmpty(str2)) {
                return 0;
            }
            return str.compareTo(str2) * (-1);
        }
    }

    private C5703c() {
        this.f4514a = new b();
        this.f4513a = new a();
    }

    /* renamed from: a */
    public static synchronized C5703c m3854a() {
        try {
            if (f4512a == null) {
                f4512a = new C5703c();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f4512a;
    }

    /* renamed from: a */
    public String[] m3855a(String[] strArr, boolean z10) {
        Comparator comparator;
        if (z10) {
            comparator = this.f4513a;
        } else {
            comparator = this.f4514a;
        }
        if (comparator == null || strArr == null || strArr.length <= 0) {
            return null;
        }
        Arrays.sort(strArr, comparator);
        return strArr;
    }
}
