package com.alibaba.sdk.android.logger.p026a;

import android.util.Log;
import com.alibaba.sdk.android.logger.IObjectLogFormat;
import java.util.HashMap;

/* renamed from: com.alibaba.sdk.android.logger.a.a */
/* loaded from: classes.dex */
public class C1118a {

    /* renamed from: a */
    private HashMap<Class, IObjectLogFormat> f6559a = new HashMap<>();

    /* renamed from: a */
    public String m5093a(Object obj) {
        if (obj == null) {
            return "null";
        }
        int i4 = 0;
        if (obj instanceof Object[]) {
            StringBuilder sb = new StringBuilder();
            Object[] objArr = (Object[]) obj;
            sb.append("[");
            while (i4 < objArr.length) {
                if (i4 != 0) {
                    sb.append(", ");
                }
                sb.append(m5093a(objArr[i4]));
                i4++;
            }
            sb.append("]");
            return sb.toString();
        }
        if (obj instanceof short[]) {
            StringBuilder sb2 = new StringBuilder();
            short[] sArr = (short[]) obj;
            sb2.append("[");
            while (i4 < sArr.length) {
                if (i4 != 0) {
                    sb2.append(", ");
                }
                sb2.append((int) sArr[i4]);
                i4++;
            }
            sb2.append("]");
            return sb2.toString();
        }
        if (obj instanceof int[]) {
            StringBuilder sb3 = new StringBuilder();
            int[] iArr = (int[]) obj;
            sb3.append("[");
            while (i4 < iArr.length) {
                if (i4 != 0) {
                    sb3.append(", ");
                }
                sb3.append(iArr[i4]);
                i4++;
            }
            sb3.append("]");
            return sb3.toString();
        }
        if (obj instanceof long[]) {
            StringBuilder sb4 = new StringBuilder();
            long[] jArr = (long[]) obj;
            sb4.append("[");
            while (i4 < jArr.length) {
                if (i4 != 0) {
                    sb4.append(", ");
                }
                sb4.append(jArr[i4]);
                i4++;
            }
            sb4.append("]");
            return sb4.toString();
        }
        if (obj instanceof boolean[]) {
            StringBuilder sb5 = new StringBuilder();
            boolean[] zArr = (boolean[]) obj;
            sb5.append("[");
            while (i4 < zArr.length) {
                if (i4 != 0) {
                    sb5.append(", ");
                }
                sb5.append(zArr[i4]);
                i4++;
            }
            sb5.append("]");
            return sb5.toString();
        }
        if (obj instanceof char[]) {
            StringBuilder sb6 = new StringBuilder();
            char[] cArr = (char[]) obj;
            sb6.append("[");
            while (i4 < cArr.length) {
                if (i4 != 0) {
                    sb6.append(", ");
                }
                sb6.append(cArr[i4]);
                i4++;
            }
            sb6.append("]");
            return sb6.toString();
        }
        if (obj instanceof float[]) {
            StringBuilder sb7 = new StringBuilder();
            float[] fArr = (float[]) obj;
            sb7.append("[");
            while (i4 < fArr.length) {
                if (i4 != 0) {
                    sb7.append(", ");
                }
                sb7.append(fArr[i4]);
                i4++;
            }
            sb7.append("]");
            return sb7.toString();
        }
        if (obj instanceof double[]) {
            StringBuilder sb8 = new StringBuilder();
            double[] dArr = (double[]) obj;
            sb8.append("[");
            while (i4 < dArr.length) {
                if (i4 != 0) {
                    sb8.append(", ");
                }
                sb8.append(dArr[i4]);
                i4++;
            }
            sb8.append("]");
            return sb8.toString();
        }
        if (!(obj instanceof byte[])) {
            if (obj instanceof Throwable) {
                return Log.getStackTraceString((Throwable) obj);
            }
            IObjectLogFormat iObjectLogFormat = this.f6559a.get(obj.getClass());
            return iObjectLogFormat != null ? iObjectLogFormat.format(obj) : obj.toString();
        }
        StringBuilder sb9 = new StringBuilder();
        byte[] bArr = (byte[]) obj;
        sb9.append("[");
        while (i4 < bArr.length) {
            if (i4 != 0) {
                sb9.append(", ");
            }
            sb9.append((int) bArr[i4]);
            i4++;
        }
        sb9.append("]");
        return sb9.toString();
    }

    /* renamed from: a */
    public <T> void m5094a(Class<T> cls, IObjectLogFormat<T> iObjectLogFormat) {
        this.f6559a.put(cls, iObjectLogFormat);
    }
}
