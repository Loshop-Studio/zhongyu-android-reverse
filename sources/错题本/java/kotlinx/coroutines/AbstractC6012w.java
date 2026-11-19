package kotlinx.coroutines;

/* renamed from: kotlinx.coroutines.w */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC6012w {

    /* renamed from: a */
    public static final /* synthetic */ int[] f9516a;

    static {
        int[] iArr = new int[CoroutineStart.values().length];
        try {
            iArr[CoroutineStart.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CoroutineStart.ATOMIC.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CoroutineStart.UNDISPATCHED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[CoroutineStart.LAZY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f9516a = iArr;
    }
}
