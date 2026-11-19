package p027b8;

/* renamed from: b8.a */
/* loaded from: classes5.dex */
public final class C5044a {

    /* renamed from: a */
    public static final C5044a f2578a = new C5044a();

    /* renamed from: a */
    public final boolean m2520a(int i10) {
        return ((((double) ((i10 >> 16) & 255)) * 0.299d) + (((double) ((i10 >> 8) & 255)) * 0.578d)) + (((double) (i10 & 255)) * 0.114d) >= 192.0d;
    }
}
