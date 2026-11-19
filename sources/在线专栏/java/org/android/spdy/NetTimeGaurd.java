package org.android.spdy;

import android.util.Log;

/* loaded from: classes.dex */
public class NetTimeGaurd {
    public static final int CREATE = 0;
    public static final int ERROR = 2;
    public static final int PING = 1;
    public static final int STREAM = 3;
    private static final long calltime = 10;
    private static final long total = 50;
    private static long[] totaltime = new long[4];

    static long begin() {
        if (SpdyAgent.enableTimeGaurd) {
            return System.currentTimeMillis();
        }
        return 0L;
    }

    static void end(String str, int i4, long j4) {
        if (SpdyAgent.enableTimeGaurd) {
            long jCurrentTimeMillis = System.currentTimeMillis() - j4;
            long[] jArr = totaltime;
            jArr[i4] = jArr[i4] + jCurrentTimeMillis;
            Log.i("NetTimeGaurd", "NetTimeGaurd[end]" + str + " time=" + jCurrentTimeMillis + " total=" + totaltime[i4]);
            if (jCurrentTimeMillis <= calltime) {
                return;
            }
            throw new SpdyErrorException("CallBack:" + str + " timeconsuming:" + jCurrentTimeMillis + "  mustlessthan:" + calltime, -1);
        }
    }

    static void finish(int i4) {
        if (SpdyAgent.enableTimeGaurd) {
            Log.i("NetTimeGaurd", "NetTimeGaurd[finish]:time=" + totaltime[i4]);
            if (totaltime[i4] <= total) {
                return;
            }
            throw new SpdyErrorException("CallBack totaltimeconsuming:" + totaltime[i4] + "  mustlessthan:" + total, -1);
        }
    }

    static void start(int i4) {
        if (SpdyAgent.enableTimeGaurd) {
            totaltime[i4] = 0;
        }
    }
}
