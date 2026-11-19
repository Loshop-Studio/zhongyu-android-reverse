package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import androidx.collection.C0247a;
import java.lang.reflect.Method;

/* renamed from: androidx.versionedparcelable.b */
/* loaded from: classes.dex */
class C0765b extends AbstractC0764a {

    /* renamed from: d */
    private final SparseIntArray f4599d;

    /* renamed from: e */
    private final Parcel f4600e;

    /* renamed from: f */
    private final int f4601f;

    /* renamed from: g */
    private final int f4602g;

    /* renamed from: h */
    private final String f4603h;

    /* renamed from: i */
    private int f4604i;

    /* renamed from: j */
    private int f4605j;

    /* renamed from: k */
    private int f4606k;

    C0765b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C0247a(), new C0247a(), new C0247a());
    }

    @Override // androidx.versionedparcelable.AbstractC0764a
    /* renamed from: A */
    public void mo4000A(byte[] bArr) {
        if (bArr == null) {
            this.f4600e.writeInt(-1);
        } else {
            this.f4600e.writeInt(bArr.length);
            this.f4600e.writeByteArray(bArr);
        }
    }

    @Override // androidx.versionedparcelable.AbstractC0764a
    /* renamed from: C */
    protected void mo4002C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f4600e, 0);
    }

    @Override // androidx.versionedparcelable.AbstractC0764a
    /* renamed from: E */
    public void mo4004E(int i4) {
        this.f4600e.writeInt(i4);
    }

    @Override // androidx.versionedparcelable.AbstractC0764a
    /* renamed from: G */
    public void mo4006G(Parcelable parcelable) {
        this.f4600e.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.AbstractC0764a
    /* renamed from: I */
    public void mo4008I(String str) {
        this.f4600e.writeString(str);
    }

    @Override // androidx.versionedparcelable.AbstractC0764a
    /* renamed from: a */
    public void mo4013a() {
        int i4 = this.f4604i;
        if (i4 >= 0) {
            int i5 = this.f4599d.get(i4);
            int iDataPosition = this.f4600e.dataPosition();
            this.f4600e.setDataPosition(i5);
            this.f4600e.writeInt(iDataPosition - i5);
            this.f4600e.setDataPosition(iDataPosition);
        }
    }

    @Override // androidx.versionedparcelable.AbstractC0764a
    /* renamed from: b */
    protected AbstractC0764a mo4014b() {
        Parcel parcel = this.f4600e;
        int iDataPosition = parcel.dataPosition();
        int i4 = this.f4605j;
        if (i4 == this.f4601f) {
            i4 = this.f4602g;
        }
        return new C0765b(parcel, iDataPosition, i4, this.f4603h + "  ", this.f4596a, this.f4597b, this.f4598c);
    }

    @Override // androidx.versionedparcelable.AbstractC0764a
    /* renamed from: g */
    public boolean mo4016g() {
        return this.f4600e.readInt() != 0;
    }

    @Override // androidx.versionedparcelable.AbstractC0764a
    /* renamed from: i */
    public byte[] mo4018i() {
        int i4 = this.f4600e.readInt();
        if (i4 < 0) {
            return null;
        }
        byte[] bArr = new byte[i4];
        this.f4600e.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.AbstractC0764a
    /* renamed from: k */
    protected CharSequence mo4020k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f4600e);
    }

    @Override // androidx.versionedparcelable.AbstractC0764a
    /* renamed from: m */
    public boolean mo4022m(int i4) {
        while (this.f4605j < this.f4602g) {
            int i5 = this.f4606k;
            if (i5 == i4) {
                return true;
            }
            if (String.valueOf(i5).compareTo(String.valueOf(i4)) > 0) {
                return false;
            }
            this.f4600e.setDataPosition(this.f4605j);
            int i6 = this.f4600e.readInt();
            this.f4606k = this.f4600e.readInt();
            this.f4605j += i6;
        }
        return this.f4606k == i4;
    }

    @Override // androidx.versionedparcelable.AbstractC0764a
    /* renamed from: o */
    public int mo4024o() {
        return this.f4600e.readInt();
    }

    @Override // androidx.versionedparcelable.AbstractC0764a
    /* renamed from: q */
    public <T extends Parcelable> T mo4026q() {
        return (T) this.f4600e.readParcelable(getClass().getClassLoader());
    }

    @Override // androidx.versionedparcelable.AbstractC0764a
    /* renamed from: s */
    public String mo4028s() {
        return this.f4600e.readString();
    }

    @Override // androidx.versionedparcelable.AbstractC0764a
    /* renamed from: w */
    public void mo4032w(int i4) {
        mo4013a();
        this.f4604i = i4;
        this.f4599d.put(i4, this.f4600e.dataPosition());
        mo4004E(0);
        mo4004E(i4);
    }

    @Override // androidx.versionedparcelable.AbstractC0764a
    /* renamed from: y */
    public void mo4034y(boolean z3) {
        this.f4600e.writeInt(z3 ? 1 : 0);
    }

    private C0765b(Parcel parcel, int i4, int i5, String str, C0247a<String, Method> c0247a, C0247a<String, Method> c0247a2, C0247a<String, Class> c0247a3) {
        super(c0247a, c0247a2, c0247a3);
        this.f4599d = new SparseIntArray();
        this.f4604i = -1;
        this.f4606k = -1;
        this.f4600e = parcel;
        this.f4601f = i4;
        this.f4602g = i5;
        this.f4605j = i4;
        this.f4603h = str;
    }
}
