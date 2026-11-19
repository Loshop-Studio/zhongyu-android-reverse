package androidx.work;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m13412d1 = {"\u0000L\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0018\n\u0000\n\u0002\u0010\u0005\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0006\n\u0002\u0010\u0013\n\u0000\n\u0002\u0010\u0007\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\t\n\u0002\u0010\u0016\n\u0002\b\u0002\u001a\u001b\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¢\u0006\u0002\u0010\u0007\u001a\u001b\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\u0006\u0010\u0005\u001a\u00020\tH\u0002¢\u0006\u0002\u0010\n\u001a\u001b\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\u0006\u0010\u0005\u001a\u00020\fH\u0002¢\u0006\u0002\u0010\r\u001a\u001b\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\u0006\u0010\u0005\u001a\u00020\u000fH\u0002¢\u0006\u0002\u0010\u0010\u001a\u001b\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00110\u00032\u0006\u0010\u0005\u001a\u00020\u0012H\u0002¢\u0006\u0002\u0010\u0013\u001a\u001b\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00140\u00032\u0006\u0010\u0005\u001a\u00020\u0015H\u0002¢\u0006\u0002\u0010\u0016\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m13413d2 = {"TAG", "", "convertPrimitiveArray", "", "", "value", "", "([Z)[Ljava/lang/Boolean;", "", "", "([B)[Ljava/lang/Byte;", "", "", "([D)[Ljava/lang/Double;", "", "", "([F)[Ljava/lang/Float;", "", "", "([I)[Ljava/lang/Integer;", "", "", "([J)[Ljava/lang/Long;", "work-runtime_release"}, m13414k = 2, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class Data_Kt {
    private static final String TAG;

    static {
        String strTagWithPrefix = Logger.tagWithPrefix("Data");
        Intrinsics.checkNotNullExpressionValue(strTagWithPrefix, "tagWithPrefix(\"Data\")");
        TAG = strTagWithPrefix;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean[] convertPrimitiveArray(boolean[] zArr) {
        int length = zArr.length;
        Boolean[] boolArr = new Boolean[length];
        for (int i9 = 0; i9 < length; i9++) {
            boolArr[i9] = Boolean.valueOf(zArr[i9]);
        }
        return boolArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Byte[] convertPrimitiveArray(byte[] bArr) {
        int length = bArr.length;
        Byte[] bArr2 = new Byte[length];
        for (int i9 = 0; i9 < length; i9++) {
            bArr2[i9] = Byte.valueOf(bArr[i9]);
        }
        return bArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer[] convertPrimitiveArray(int[] iArr) {
        int length = iArr.length;
        Integer[] numArr = new Integer[length];
        for (int i9 = 0; i9 < length; i9++) {
            numArr[i9] = Integer.valueOf(iArr[i9]);
        }
        return numArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long[] convertPrimitiveArray(long[] jArr) {
        int length = jArr.length;
        Long[] lArr = new Long[length];
        for (int i9 = 0; i9 < length; i9++) {
            lArr[i9] = Long.valueOf(jArr[i9]);
        }
        return lArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Float[] convertPrimitiveArray(float[] fArr) {
        int length = fArr.length;
        Float[] fArr2 = new Float[length];
        for (int i9 = 0; i9 < length; i9++) {
            fArr2[i9] = Float.valueOf(fArr[i9]);
        }
        return fArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Double[] convertPrimitiveArray(double[] dArr) {
        int length = dArr.length;
        Double[] dArr2 = new Double[length];
        for (int i9 = 0; i9 < length; i9++) {
            dArr2[i9] = Double.valueOf(dArr[i9]);
        }
        return dArr2;
    }
}
