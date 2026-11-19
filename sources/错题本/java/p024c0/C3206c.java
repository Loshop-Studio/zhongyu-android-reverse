package p024c0;

/* renamed from: c0.c */
/* loaded from: classes2.dex */
public final class C3206c {

    /* renamed from: a */
    public final /* synthetic */ int f1741a;

    /* renamed from: a */
    public final int m2146a(Object obj) {
        switch (this.f1741a) {
            case 0:
                return ((byte[]) obj).length;
            default:
                return ((int[]) obj).length;
        }
    }

    /* renamed from: b */
    public final int m2147b() {
        switch (this.f1741a) {
            case 0:
                return 1;
            default:
                return 4;
        }
    }

    /* renamed from: c */
    public final String m2148c() {
        switch (this.f1741a) {
            case 0:
                return "ByteArrayPool";
            default:
                return "IntegerArrayPool";
        }
    }
}
