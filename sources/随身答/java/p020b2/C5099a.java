package p020b2;

/* renamed from: b2.a */
/* loaded from: classes4.dex */
public class C5099a implements InterfaceC5106h {

    /* renamed from: b */
    public final CharSequence[] f2207b;

    public C5099a(CharSequence[] charSequenceArr) {
        if (charSequenceArr == null) {
            throw new IllegalArgumentException("Cannot be null");
        }
        if (charSequenceArr.length != 7) {
            throw new IllegalArgumentException("Array must contain exactly 7 elements");
        }
        this.f2207b = charSequenceArr;
    }

    @Override // p020b2.InterfaceC5106h
    public CharSequence format(int i9) {
        return this.f2207b[i9 - 1];
    }
}
