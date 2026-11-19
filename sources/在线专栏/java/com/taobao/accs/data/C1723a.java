package com.taobao.accs.data;

import com.taobao.accs.common.ThreadPoolExecutorFactory;
import com.umeng.analytics.pro.C1892bw;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.taobao.accs.data.a */
/* loaded from: classes.dex */
public class C1723a {
    public static final int SPLIT_DATA_INDEX = 17;
    public static final int SPLIT_DATA_MD5 = 18;
    public static final int SPLIT_DATA_NUMS = 16;
    public static final int SPLIT_TIME_OUT = 15;

    /* renamed from: a */
    private static final char[] f7575a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: b */
    private final String f7576b;

    /* renamed from: c */
    private final int f7577c;

    /* renamed from: d */
    private final String f7578d;

    /* renamed from: e */
    private long f7579e;

    /* renamed from: g */
    private ScheduledFuture<?> f7581g;

    /* renamed from: f */
    private volatile int f7580f = 0;

    /* renamed from: h */
    private final Map<Integer, byte[]> f7582h = new TreeMap(new C1724b(this));

    public C1723a(String str, int i4, String str2) {
        this.f7576b = str;
        this.f7577c = i4;
        this.f7578d = str2;
    }

    /* renamed from: a */
    public void m5897a(long j4) {
        if (j4 <= 0) {
            j4 = 30000;
        }
        this.f7581g = ThreadPoolExecutorFactory.getScheduledExecutor().schedule(new RunnableC1725c(this), j4, TimeUnit.MILLISECONDS);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00e6  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public byte[] m5898a(int r13, int r14, byte[] r15) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.data.C1723a.m5898a(int, int, byte[]):byte[]");
    }

    /* renamed from: a */
    private static char[] m5894a(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length << 1];
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5++) {
            int i6 = i4 + 1;
            char[] cArr2 = f7575a;
            cArr[i4] = cArr2[(bArr[i5] & 240) >>> 4];
            i4 = i6 + 1;
            cArr[i6] = cArr2[bArr[i5] & C1892bw.f8538m];
        }
        return cArr;
    }
}
