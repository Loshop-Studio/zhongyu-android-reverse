package p027b8;

import com.blankj.utilcode.constant.TimeConstants;
import com.google.android.material.timepicker.TimeModel;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* renamed from: b8.w */
/* loaded from: classes5.dex */
public final class C5066w {

    /* renamed from: a */
    public static final C5066w f2629a = new C5066w();

    /* renamed from: a */
    public final String m2603a(long j10) {
        long j11 = TimeConstants.MIN;
        long j12 = j10 / j11;
        long j13 = (j10 - (j11 * j12)) / 1000;
        StringBuffer stringBuffer = new StringBuffer();
        if (j12 >= 0) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Long.valueOf(j12)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            stringBuffer.append(str + ":");
        }
        if (j13 >= 0) {
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            String str2 = String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Long.valueOf(j13)}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
            stringBuffer.append(str2);
        }
        String string = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* renamed from: b */
    public final String m2604b(long j10) {
        long j11 = TimeConstants.HOUR;
        long j12 = j10 / j11;
        long j13 = j10 - (j11 * j12);
        long j14 = TimeConstants.MIN;
        long j15 = j13 / j14;
        long j16 = (j13 - (j14 * j15)) / 1000;
        StringBuffer stringBuffer = new StringBuffer();
        if (j12 > 0) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Long.valueOf(j12)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            stringBuffer.append(str + ":");
        }
        if (j15 >= 0) {
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            String str2 = String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Long.valueOf(j15)}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
            stringBuffer.append(str2 + ":");
        }
        if (j16 >= 0) {
            StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
            String str3 = String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Long.valueOf(j16)}, 1));
            Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
            stringBuffer.append(str3);
        }
        String string = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
