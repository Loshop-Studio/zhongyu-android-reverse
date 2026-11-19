package com.alibaba.sdk.android.oss.network;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC5810y;
import okhttp3.C6299h0;
import okhttp3.C6301i0;
import okhttp3.C6337y;
import okhttp3.C6338z;
import okhttp3.InterfaceC6331s;
import okhttp3.InterfaceC6332t;
import p161s7.C6570e;

/* loaded from: classes2.dex */
public class NetworkProgressHelper {
    public static ProgressTouchableRequestBody addProgressRequestBody(InputStream inputStream, long j7, String str, ExecutionContext executionContext) {
        return new ProgressTouchableRequestBody(inputStream, j7, str, executionContext);
    }

    public static C6338z addProgressResponseListener(C6338z c6338z, final ExecutionContext executionContext) {
        c6338z.getClass();
        C6337y c6337y = new C6337y();
        c6337y.f10295a = c6338z.f10324a;
        c6337y.f10296b = c6338z.f10325b;
        AbstractC5810y.m5291S(c6338z.f10326c, c6337y.f10297c);
        List list = c6338z.f10327d;
        ArrayList arrayList = c6337y.f10298d;
        AbstractC5810y.m5291S(list, arrayList);
        c6337y.f10299e = c6338z.f10328e;
        c6337y.f10300f = c6338z.f10329f;
        c6337y.f10301g = c6338z.f10330g;
        c6337y.f10302h = c6338z.f10331h;
        c6337y.f10303i = c6338z.f10332i;
        c6337y.f10304j = c6338z.f10333j;
        c6337y.f10305k = c6338z.f10334k;
        c6337y.f10306l = c6338z.f10335l;
        c6337y.f10307m = c6338z.f10336m;
        c6337y.f10308n = c6338z.f10337n;
        c6337y.f10309o = c6338z.f10338o;
        c6337y.f10310p = c6338z.f10339p;
        c6337y.f10311q = c6338z.f10340q;
        c6337y.f10312r = c6338z.f10341r;
        c6337y.f10313s = c6338z.f10342s;
        c6337y.f10314t = c6338z.f10343t;
        c6337y.f10315u = c6338z.f10344u;
        c6337y.f10316v = c6338z.f10345v;
        c6337y.f10317w = c6338z.f10346w;
        c6337y.f10318x = c6338z.f10347x;
        c6337y.f10319y = c6338z.f10348y;
        c6337y.f10320z = c6338z.f10349z;
        c6337y.f10294A = c6338z.f10323A;
        arrayList.add(new InterfaceC6332t() { // from class: com.alibaba.sdk.android.oss.network.NetworkProgressHelper.1
            @Override // okhttp3.InterfaceC6332t
            public C6301i0 intercept(InterfaceC6331s interfaceC6331s) throws IOException {
                C6301i0 c6301i0M6214b = ((C6570e) interfaceC6331s).m6214b(((C6570e) interfaceC6331s).f10969e);
                C6299h0 c6299h0M5900c = c6301i0M6214b.m5900c();
                c6299h0M5900c.f10097g = new ProgressTouchableResponseBody(c6301i0M6214b.f10110g, executionContext);
                return c6299h0M5900c.m5897a();
            }
        });
        return new C6338z(c6337y);
    }
}
