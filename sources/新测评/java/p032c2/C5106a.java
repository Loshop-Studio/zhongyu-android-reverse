package p032c2;

/* renamed from: c2.a */
/* loaded from: classes4.dex */
public class C5106a implements InterfaceC5113h {

    /* renamed from: b */
    public final CharSequence[] f2666b;

    public C5106a(CharSequence[] charSequenceArr) {
        if (charSequenceArr == null) {
            throw new IllegalArgumentException("Cannot be null");
        }
        if (charSequenceArr.length != 7) {
            throw new IllegalArgumentException("Array must contain exactly 7 elements");
        }
        this.f2666b = charSequenceArr;
    }

    @Override // p032c2.InterfaceC5113h
    public CharSequence format(int i10) {
        return this.f2666b[i10 - 1];
    }
}
