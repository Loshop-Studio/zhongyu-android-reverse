package p063g1;

import com.google.gson.stream.JsonToken;

/* renamed from: g1.x0 */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC5594x0 {

    /* renamed from: a */
    public static final /* synthetic */ int[] f8684a;

    static {
        int[] iArr = new int[JsonToken.values().length];
        f8684a = iArr;
        try {
            iArr[JsonToken.NUMBER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f8684a[JsonToken.STRING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f8684a[JsonToken.BOOLEAN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
