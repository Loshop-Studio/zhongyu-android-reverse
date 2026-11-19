package p188n5;

/* renamed from: n5.d */
/* loaded from: classes5.dex */
public abstract class AbstractC9424d {
    /* renamed from: a */
    public static String m17268a(long j10) {
        return (j10 < 10 ? "0" : "") + String.valueOf(j10);
    }

    /* renamed from: b */
    public static String m17269b(long j10) {
        long j11 = j10 / 3600;
        long j12 = j10 % 3600;
        long j13 = j12 / 60;
        long j14 = j12 % 60;
        if (j11 == 0) {
            return m17268a(j13) + ":" + m17268a(j14);
        }
        return m17268a(j11) + ":" + m17268a(j13) + ":" + m17268a(j14);
    }
}
