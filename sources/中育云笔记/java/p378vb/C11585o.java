package p378vb;

import com.blankj.utilcode.constant.TimeConstants;
import com.google.android.material.timepicker.TimeModel;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.C9960c0;

/* renamed from: vb.o */
/* loaded from: classes6.dex */
public final class C11585o {

    /* renamed from: a */
    public static final C11585o f27488a = new C11585o();

    /* renamed from: a */
    public final String m25521a(long j10) {
        long j11 = TimeConstants.MIN;
        long j12 = j10 / j11;
        long j13 = (j10 - (j11 * j12)) / 1000;
        StringBuffer stringBuffer = new StringBuffer();
        if (j12 >= 0) {
            C9960c0 c9960c0 = C9960c0.f23411a;
            String str = String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Long.valueOf(j12)}, 1));
            AbstractC9979u.m20293f(str, "format(...)");
            stringBuffer.append(str + ":");
        }
        if (j13 >= 0) {
            C9960c0 c9960c02 = C9960c0.f23411a;
            String str2 = String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Long.valueOf(j13)}, 1));
            AbstractC9979u.m20293f(str2, "format(...)");
            stringBuffer.append(str2);
        }
        String string = stringBuffer.toString();
        AbstractC9979u.m20293f(string, "toString(...)");
        return string;
    }

    /* renamed from: b */
    public final String m25522b(long j10) {
        long j11 = TimeConstants.HOUR;
        long j12 = j10 / j11;
        long j13 = j10 - (j11 * j12);
        long j14 = TimeConstants.MIN;
        long j15 = j13 / j14;
        long j16 = (j13 - (j14 * j15)) / 1000;
        StringBuffer stringBuffer = new StringBuffer();
        if (j12 > 0) {
            C9960c0 c9960c0 = C9960c0.f23411a;
            String str = String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Long.valueOf(j12)}, 1));
            AbstractC9979u.m20293f(str, "format(...)");
            stringBuffer.append(str + ":");
        }
        if (j15 >= 0) {
            C9960c0 c9960c02 = C9960c0.f23411a;
            String str2 = String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Long.valueOf(j15)}, 1));
            AbstractC9979u.m20293f(str2, "format(...)");
            stringBuffer.append(str2 + ":");
        }
        if (j16 >= 0) {
            C9960c0 c9960c03 = C9960c0.f23411a;
            String str3 = String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Long.valueOf(j16)}, 1));
            AbstractC9979u.m20293f(str3, "format(...)");
            stringBuffer.append(str3);
        }
        String string = stringBuffer.toString();
        AbstractC9979u.m20293f(string, "toString(...)");
        return string;
    }
}
