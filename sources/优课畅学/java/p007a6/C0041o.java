package p007a6;

import com.google.android.material.timepicker.TimeModel;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.C9114c0;

/* renamed from: a6.o */
/* loaded from: classes5.dex */
public final class C0041o {

    /* renamed from: a */
    public static final C0041o f109a = new C0041o();

    /* renamed from: a */
    public final String m114a(long j10) {
        long j11 = 60000;
        long j12 = j10 / j11;
        long j13 = (j10 - (j11 * j12)) / 1000;
        StringBuffer stringBuffer = new StringBuffer();
        if (j12 >= 0) {
            C9114c0 c9114c0 = C9114c0.f17482a;
            String str = String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Long.valueOf(j12)}, 1));
            AbstractC9133u.m16132f(str, "format(...)");
            stringBuffer.append(str + ":");
        }
        if (j13 >= 0) {
            C9114c0 c9114c02 = C9114c0.f17482a;
            String str2 = String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Long.valueOf(j13)}, 1));
            AbstractC9133u.m16132f(str2, "format(...)");
            stringBuffer.append(str2);
        }
        String string = stringBuffer.toString();
        AbstractC9133u.m16132f(string, "toString(...)");
        return string;
    }

    /* renamed from: b */
    public final String m115b(long j10) {
        long j11 = 3600000;
        long j12 = j10 / j11;
        long j13 = j10 - (j11 * j12);
        long j14 = 60000;
        long j15 = j13 / j14;
        long j16 = (j13 - (j14 * j15)) / 1000;
        StringBuffer stringBuffer = new StringBuffer();
        if (j12 > 0) {
            C9114c0 c9114c0 = C9114c0.f17482a;
            String str = String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Long.valueOf(j12)}, 1));
            AbstractC9133u.m16132f(str, "format(...)");
            stringBuffer.append(str + ":");
        }
        if (j15 >= 0) {
            C9114c0 c9114c02 = C9114c0.f17482a;
            String str2 = String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Long.valueOf(j15)}, 1));
            AbstractC9133u.m16132f(str2, "format(...)");
            stringBuffer.append(str2 + ":");
        }
        if (j16 >= 0) {
            C9114c0 c9114c03 = C9114c0.f17482a;
            String str3 = String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Long.valueOf(j16)}, 1));
            AbstractC9133u.m16132f(str3, "format(...)");
            stringBuffer.append(str3);
        }
        String string = stringBuffer.toString();
        AbstractC9133u.m16132f(string, "toString(...)");
        return string;
    }
}
