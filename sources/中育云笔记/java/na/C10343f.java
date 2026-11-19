package na;

/* renamed from: na.f */
/* loaded from: classes5.dex */
public final class C10343f {

    /* renamed from: a */
    public static final C10343f f24649a = new C10343f();

    /* renamed from: a */
    public final boolean m21631a(int i10) {
        return ((((double) ((i10 >> 16) & 255)) * 0.299d) + (((double) ((i10 >> 8) & 255)) * 0.578d)) + (((double) (i10 & 255)) * 0.114d) >= 192.0d;
    }
}
