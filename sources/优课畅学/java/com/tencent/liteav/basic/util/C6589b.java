package com.tencent.liteav.basic.util;

import android.os.Process;
import android.text.TextUtils;
import com.tencent.liteav.basic.log.TXCLog;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: com.tencent.liteav.basic.util.b */
/* loaded from: classes4.dex */
public class C6589b {

    /* renamed from: a */
    private static final long f5507a = TimeUnit.SECONDS.toMillis(2);

    /* renamed from: d */
    private RandomAccessFile f5510d;

    /* renamed from: e */
    private RandomAccessFile f5511e;

    /* renamed from: f */
    private long f5512f = 0;

    /* renamed from: g */
    private float f5513g = 0.0f;

    /* renamed from: h */
    private float f5514h = 0.0f;

    /* renamed from: i */
    private long f5515i = 0;

    /* renamed from: j */
    private long f5516j = 0;

    /* renamed from: k */
    private float f5517k = 0.0f;

    /* renamed from: b */
    private final long f5508b = TXCTimeUtil.getClockTickInHz();

    /* renamed from: c */
    private final int f5509c = Runtime.getRuntime().availableProcessors();

    public C6589b() {
        try {
            this.f5510d = new RandomAccessFile(String.format(Locale.ENGLISH, "/proc/%d/stat", Integer.valueOf(Process.myPid())), "r");
        } catch (IOException e10) {
            TXCLog.m4991e("CpuUsageMeasurer", "open /proc/[PID]/stat failed. " + e10.getMessage());
        }
        try {
            this.f5511e = new RandomAccessFile("/proc/stat", "r");
        } catch (IOException unused) {
        }
    }

    /* renamed from: b */
    private void m5022b() throws IOException {
        long timeTick;
        long j10;
        String[] strArrM5021a = m5021a(this.f5510d);
        if (strArrM5021a == null || strArrM5021a.length < 52) {
            return;
        }
        long j11 = (long) (((((Long.parseLong(strArrM5021a[13]) + Long.parseLong(strArrM5021a[14])) + Long.parseLong(strArrM5021a[15])) + Long.parseLong(strArrM5021a[16])) * 1000.0f) / this.f5508b);
        String[] strArrM5021a2 = m5021a(this.f5511e);
        if (strArrM5021a2 == null || strArrM5021a2.length < 8) {
            timeTick = TXCTimeUtil.getTimeTick() * this.f5509c;
            j10 = timeTick;
        } else {
            long j12 = Long.parseLong(strArrM5021a2[1]) + Long.parseLong(strArrM5021a2[2]) + Long.parseLong(strArrM5021a2[3]) + Long.parseLong(strArrM5021a2[4]) + Long.parseLong(strArrM5021a2[5]) + Long.parseLong(strArrM5021a2[6]) + Long.parseLong(strArrM5021a2[7]);
            long j13 = Long.parseLong(strArrM5021a2[4]) + Long.parseLong(strArrM5021a2[5]);
            float f10 = j12 * 1000.0f;
            long j14 = this.f5508b;
            timeTick = (long) (f10 / j14);
            j10 = (long) ((j13 * 1000.0f) / j14);
        }
        float f11 = j11;
        float f12 = timeTick - this.f5515i;
        this.f5514h = ((f11 - this.f5513g) * 100.0f) / f12;
        this.f5517k = ((r4 - (j10 - this.f5516j)) * 100.0f) / f12;
        this.f5513g = f11;
        this.f5516j = j10;
        this.f5515i = timeTick;
        this.f5512f = TXCTimeUtil.getTimeTick();
    }

    /* renamed from: a */
    public int[] m5023a() {
        int[] iArr;
        synchronized (this) {
            try {
                if (TXCTimeUtil.getTimeTick() - this.f5512f >= f5507a) {
                    m5022b();
                }
                iArr = new int[]{(int) (this.f5514h * 10.0f), (int) (this.f5517k * 10.0f)};
            } catch (Throwable th) {
                throw th;
            }
        }
        return iArr;
    }

    public void finalize() throws Throwable {
        super.finalize();
        C6590c.m5027a(this.f5510d);
        C6590c.m5027a(this.f5511e);
        TXCLog.m4994i("CpuUsageMeasurer", "measurer is released");
    }

    /* renamed from: a */
    private static String[] m5021a(RandomAccessFile randomAccessFile) throws IOException {
        String line;
        if (randomAccessFile == null) {
            return null;
        }
        try {
            randomAccessFile.seek(0L);
            line = randomAccessFile.readLine();
        } catch (IOException e10) {
            TXCLog.m4991e("CpuUsageMeasurer", "read line failed. " + e10.getMessage());
            line = null;
        }
        if (TextUtils.isEmpty(line)) {
            return null;
        }
        return line.split("\\s+");
    }
}
