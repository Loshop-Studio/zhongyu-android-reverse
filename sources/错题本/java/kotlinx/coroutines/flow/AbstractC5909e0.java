package kotlinx.coroutines.flow;

import kotlinx.coroutines.channels.BufferOverflow;

/* renamed from: kotlinx.coroutines.flow.e0 */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC5909e0 {

    /* renamed from: a */
    public static final /* synthetic */ int[] f9363a;

    static {
        int[] iArr = new int[BufferOverflow.values().length];
        try {
            iArr[BufferOverflow.SUSPEND.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BufferOverflow.DROP_LATEST.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[BufferOverflow.DROP_OLDEST.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f9363a = iArr;
    }
}
