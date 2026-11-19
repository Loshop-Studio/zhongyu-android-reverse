package com.taobao.accs.data;

import com.taobao.accs.common.ThreadPoolExecutorFactory;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.taobao.accs.data.a */
/* loaded from: classes5.dex */
public class C7620a {
    public static final int SPLIT_DATA_INDEX = 17;
    public static final int SPLIT_DATA_MD5 = 18;
    public static final int SPLIT_DATA_NUMS = 16;
    public static final int SPLIT_TIME_OUT = 15;

    /* renamed from: a */
    private static final char[] f12973a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: b */
    private final String f12974b;

    /* renamed from: c */
    private final int f12975c;

    /* renamed from: d */
    private final String f12976d;

    /* renamed from: e */
    private long f12977e;

    /* renamed from: g */
    private ScheduledFuture<?> f12979g;

    /* renamed from: f */
    private volatile int f12978f = 0;

    /* renamed from: h */
    private final Map<Integer, byte[]> f12980h = new TreeMap(new C7621b(this));

    public C7620a(String str, int i10, String str2) {
        this.f12974b = str;
        this.f12975c = i10;
        this.f12976d = str2;
    }

    /* renamed from: a */
    public void m9923a(long j10) {
        if (j10 <= 0) {
            j10 = 30000;
        }
        this.f12979g = ThreadPoolExecutorFactory.getScheduledExecutor().schedule(new RunnableC7622c(this), j10, TimeUnit.MILLISECONDS);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00d5  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public byte[] m9924a(int r12, int r13, byte[] r14) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.data.C7620a.m9924a(int, int, byte[]):byte[]");
    }

    /* renamed from: a */
    private static char[] m9920a(byte[] bArr) {
        char[] cArr = new char[bArr.length << 1];
        int i10 = 0;
        for (byte b10 : bArr) {
            int i11 = i10 + 1;
            char[] cArr2 = f12973a;
            cArr[i10] = cArr2[(b10 & 240) >>> 4];
            i10 += 2;
            cArr[i11] = cArr2[b10 & 15];
        }
        return cArr;
    }
}
