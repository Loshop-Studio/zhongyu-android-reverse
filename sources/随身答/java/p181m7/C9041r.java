package p181m7;

import com.blankj.utilcode.constant.TimeConstants;
import com.google.android.material.timepicker.TimeModel;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* renamed from: m7.r */
/* loaded from: classes5.dex */
public final class C9041r {

    /* renamed from: a */
    public static final C9041r f15220a = new C9041r();

    /* renamed from: a */
    public final String m14452a(long j9) {
        long j10 = TimeConstants.MIN;
        long j11 = j9 / j10;
        long j12 = (j9 - (j10 * j11)) / 1000;
        StringBuffer stringBuffer = new StringBuffer();
        if (j11 >= 0) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Long.valueOf(j11)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            stringBuffer.append(str + ":");
        }
        if (j12 >= 0) {
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            String str2 = String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Long.valueOf(j12)}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
            stringBuffer.append(str2);
        }
        String string = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* renamed from: b */
    public final String m14453b(long j9) {
        long j10 = TimeConstants.HOUR;
        long j11 = j9 / j10;
        long j12 = j9 - (j10 * j11);
        long j13 = TimeConstants.MIN;
        long j14 = j12 / j13;
        long j15 = (j12 - (j13 * j14)) / 1000;
        StringBuffer stringBuffer = new StringBuffer();
        if (j11 > 0) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Long.valueOf(j11)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            stringBuffer.append(str + ":");
        }
        if (j14 >= 0) {
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            String str2 = String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Long.valueOf(j14)}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
            stringBuffer.append(str2 + ":");
        }
        if (j15 >= 0) {
            StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
            String str3 = String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Long.valueOf(j15)}, 1));
            Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
            stringBuffer.append(str3);
        }
        String string = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
