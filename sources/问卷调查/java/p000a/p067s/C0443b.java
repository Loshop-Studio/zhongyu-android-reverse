package p000a.p067s;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import io.github.inflationx.calligraphy3.BuildConfig;
import java.lang.reflect.Method;
import p000a.p021e.C0129a;

/* renamed from: a.s.b */
/* loaded from: classes.dex */
public class C0443b extends AbstractC0442a {

    /* renamed from: d */
    public final SparseIntArray f2574d;

    /* renamed from: e */
    public final Parcel f2575e;

    /* renamed from: f */
    public final int f2576f;

    /* renamed from: g */
    public final int f2577g;

    /* renamed from: h */
    public final String f2578h;

    /* renamed from: i */
    public int f2579i;

    /* renamed from: j */
    public int f2580j;

    /* renamed from: k */
    public int f2581k;

    public C0443b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), BuildConfig.FLAVOR, new C0129a(), new C0129a(), new C0129a());
    }

    public C0443b(Parcel parcel, int i, int i2, String str, C0129a<String, Method> c0129a, C0129a<String, Method> c0129a2, C0129a<String, Class> c0129a3) {
        super(c0129a, c0129a2, c0129a3);
        this.f2574d = new SparseIntArray();
        this.f2579i = -1;
        this.f2580j = 0;
        this.f2581k = -1;
        this.f2575e = parcel;
        this.f2576f = i;
        this.f2577g = i2;
        this.f2580j = i;
        this.f2578h = str;
    }

    @Override // p000a.p067s.AbstractC0442a
    /* renamed from: a */
    public void mo1501a() {
        int i = this.f2579i;
        if (i >= 0) {
            int i2 = this.f2574d.get(i);
            int iDataPosition = this.f2575e.dataPosition();
            this.f2575e.setDataPosition(i2);
            this.f2575e.writeInt(iDataPosition - i2);
            this.f2575e.setDataPosition(iDataPosition);
        }
    }

    @Override // p000a.p067s.AbstractC0442a
    /* renamed from: b */
    public AbstractC0442a mo1502b() {
        Parcel parcel = this.f2575e;
        int iDataPosition = parcel.dataPosition();
        int i = this.f2580j;
        if (i == this.f2576f) {
            i = this.f2577g;
        }
        return new C0443b(parcel, iDataPosition, i, this.f2578h + "  ", this.f2571a, this.f2572b, this.f2573c);
    }

    @Override // p000a.p067s.AbstractC0442a
    /* renamed from: f */
    public boolean mo1506f() {
        return this.f2575e.readInt() != 0;
    }

    @Override // p000a.p067s.AbstractC0442a
    /* renamed from: g */
    public byte[] mo1507g() {
        int i = this.f2575e.readInt();
        if (i < 0) {
            return null;
        }
        byte[] bArr = new byte[i];
        this.f2575e.readByteArray(bArr);
        return bArr;
    }

    @Override // p000a.p067s.AbstractC0442a
    /* renamed from: h */
    public CharSequence mo1508h() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f2575e);
    }

    @Override // p000a.p067s.AbstractC0442a
    /* renamed from: i */
    public boolean mo1509i(int i) {
        while (this.f2580j < this.f2577g) {
            int i2 = this.f2581k;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            this.f2575e.setDataPosition(this.f2580j);
            int i3 = this.f2575e.readInt();
            this.f2581k = this.f2575e.readInt();
            this.f2580j += i3;
        }
        return this.f2581k == i;
    }

    @Override // p000a.p067s.AbstractC0442a
    /* renamed from: j */
    public int mo1510j() {
        return this.f2575e.readInt();
    }

    @Override // p000a.p067s.AbstractC0442a
    /* renamed from: l */
    public <T extends Parcelable> T mo1512l() {
        return (T) this.f2575e.readParcelable(C0443b.class.getClassLoader());
    }

    @Override // p000a.p067s.AbstractC0442a
    /* renamed from: n */
    public String mo1514n() {
        return this.f2575e.readString();
    }

    @Override // p000a.p067s.AbstractC0442a
    /* renamed from: p */
    public void mo1516p(int i) {
        mo1501a();
        this.f2579i = i;
        this.f2574d.put(i, this.f2575e.dataPosition());
        this.f2575e.writeInt(0);
        this.f2575e.writeInt(i);
    }

    @Override // p000a.p067s.AbstractC0442a
    /* renamed from: q */
    public void mo1517q(boolean z) {
        this.f2575e.writeInt(z ? 1 : 0);
    }

    @Override // p000a.p067s.AbstractC0442a
    /* renamed from: r */
    public void mo1518r(byte[] bArr) {
        if (bArr == null) {
            this.f2575e.writeInt(-1);
        } else {
            this.f2575e.writeInt(bArr.length);
            this.f2575e.writeByteArray(bArr);
        }
    }

    @Override // p000a.p067s.AbstractC0442a
    /* renamed from: s */
    public void mo1519s(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f2575e, 0);
    }

    @Override // p000a.p067s.AbstractC0442a
    /* renamed from: t */
    public void mo1520t(int i) {
        this.f2575e.writeInt(i);
    }

    @Override // p000a.p067s.AbstractC0442a
    /* renamed from: u */
    public void mo1521u(Parcelable parcelable) {
        this.f2575e.writeParcelable(parcelable, 0);
    }

    @Override // p000a.p067s.AbstractC0442a
    /* renamed from: v */
    public void mo1522v(String str) {
        this.f2575e.writeString(str);
    }
}
