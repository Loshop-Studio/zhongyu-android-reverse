package kotlinx.serialization.json.internal;

import kotlinx.serialization.json.ClassDiscriminatorMode;

/* renamed from: kotlinx.serialization.json.internal.r */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC6037r {

    /* renamed from: a */
    public static final /* synthetic */ int[] f9576a;

    static {
        int[] iArr = new int[ClassDiscriminatorMode.values().length];
        try {
            iArr[ClassDiscriminatorMode.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ClassDiscriminatorMode.POLYMORPHIC.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ClassDiscriminatorMode.ALL_JSON_OBJECTS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f9576a = iArr;
    }
}
