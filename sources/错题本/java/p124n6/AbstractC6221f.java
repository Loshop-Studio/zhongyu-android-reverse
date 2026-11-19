package p124n6;

import kotlin.p102io.FileWalkDirection;

/* renamed from: n6.f */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC6221f {

    /* renamed from: a */
    public static final /* synthetic */ int[] f9957a;

    static {
        int[] iArr = new int[FileWalkDirection.values().length];
        try {
            iArr[FileWalkDirection.TOP_DOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[FileWalkDirection.BOTTOM_UP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f9957a = iArr;
    }
}
