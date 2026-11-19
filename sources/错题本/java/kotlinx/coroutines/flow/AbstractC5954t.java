package kotlinx.coroutines.flow;

/* renamed from: kotlinx.coroutines.flow.t */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC5954t {

    /* renamed from: a */
    public static final /* synthetic */ int[] f9440a;

    static {
        int[] iArr = new int[SharingCommand.values().length];
        try {
            iArr[SharingCommand.START.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SharingCommand.STOP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SharingCommand.STOP_AND_RESET_REPLAY_CACHE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f9440a = iArr;
    }
}
