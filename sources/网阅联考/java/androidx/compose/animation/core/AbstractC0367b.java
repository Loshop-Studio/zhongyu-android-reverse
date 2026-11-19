package androidx.compose.animation.core;

/* renamed from: androidx.compose.animation.core.b */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0367b {
    /* renamed from: a */
    public static /* synthetic */ int m141a(double d4) {
        long jDoubleToLongBits = Double.doubleToLongBits(d4);
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }
}
