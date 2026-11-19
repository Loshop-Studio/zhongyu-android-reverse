package p063g1;

import com.google.gson.stream.JsonToken;

/* renamed from: g1.q */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC5579q {

    /* renamed from: a */
    public static final /* synthetic */ int[] f8657a;

    static {
        int[] iArr = new int[JsonToken.values().length];
        f8657a = iArr;
        try {
            iArr[JsonToken.NULL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f8657a[JsonToken.NUMBER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f8657a[JsonToken.STRING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
