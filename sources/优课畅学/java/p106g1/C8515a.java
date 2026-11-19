package p106g1;

/* renamed from: g1.a */
/* loaded from: classes4.dex */
public class C8515a implements InterfaceC8522h {

    /* renamed from: b */
    public final CharSequence[] f16100b;

    public C8515a(CharSequence[] charSequenceArr) {
        if (charSequenceArr == null) {
            throw new IllegalArgumentException("Cannot be null");
        }
        if (charSequenceArr.length != 7) {
            throw new IllegalArgumentException("Array must contain exactly 7 elements");
        }
        this.f16100b = charSequenceArr;
    }

    @Override // p106g1.InterfaceC8522h
    public CharSequence format(int i10) {
        return this.f16100b[i10 - 1];
    }
}
