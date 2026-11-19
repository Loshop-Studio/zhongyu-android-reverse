package p181m7;

/* renamed from: m7.a */
/* loaded from: classes5.dex */
public final class C9024a {

    /* renamed from: a */
    public static final C9024a f15176a = new C9024a();

    /* renamed from: a */
    public final boolean m14383a(int i9) {
        return ((((double) ((i9 >> 16) & 255)) * 0.299d) + (((double) ((i9 >> 8) & 255)) * 0.578d)) + (((double) (i9 & 255)) * 0.114d) >= 192.0d;
    }
}
