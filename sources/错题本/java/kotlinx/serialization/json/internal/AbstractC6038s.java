package kotlinx.serialization.json.internal;

/* renamed from: kotlinx.serialization.json.internal.s */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC6038s {

    /* renamed from: a */
    public static final /* synthetic */ int[] f9577a;

    static {
        int[] iArr = new int[WriteMode.values().length];
        try {
            iArr[WriteMode.LIST.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[WriteMode.MAP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[WriteMode.POLY_OBJ.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[WriteMode.OBJ.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f9577a = iArr;
    }
}
