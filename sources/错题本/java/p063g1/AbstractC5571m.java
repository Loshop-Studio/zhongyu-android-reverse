package p063g1;

import com.google.gson.stream.JsonToken;

/* renamed from: g1.m */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC5571m {

    /* renamed from: a */
    public static final /* synthetic */ int[] f8649a;

    static {
        int[] iArr = new int[JsonToken.values().length];
        f8649a = iArr;
        try {
            iArr[JsonToken.BEGIN_ARRAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f8649a[JsonToken.BEGIN_OBJECT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f8649a[JsonToken.STRING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f8649a[JsonToken.NUMBER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f8649a[JsonToken.BOOLEAN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f8649a[JsonToken.NULL.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
