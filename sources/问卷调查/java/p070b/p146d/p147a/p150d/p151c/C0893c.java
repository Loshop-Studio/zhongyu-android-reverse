package p070b.p146d.p147a.p150d.p151c;

import android.os.Parcel;
import android.os.Parcelable;
import io.github.inflationx.calligraphy3.BuildConfig;
import p070b.p071a.p072a.p073a.C0561a;

/* renamed from: b.d.a.d.c.c */
/* loaded from: classes.dex */
public class C0893c implements Parcelable {
    public static final Parcelable.Creator<C0893c> CREATOR = new a();

    /* renamed from: b */
    public Long f4739b;

    /* renamed from: c */
    public String f4740c;

    /* renamed from: d */
    public String f4741d;

    /* renamed from: e */
    public String f4742e;

    /* renamed from: f */
    public String f4743f;

    /* renamed from: g */
    public String f4744g;

    /* renamed from: h */
    public Integer f4745h;

    /* renamed from: b.d.a.d.c.c$a */
    public class a implements Parcelable.Creator<C0893c> {
        @Override // android.os.Parcelable.Creator
        public C0893c createFromParcel(Parcel parcel) {
            return new C0893c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public C0893c[] newArray(int i) {
            return new C0893c[i];
        }
    }

    public C0893c() {
        this.f4739b = 0L;
        this.f4740c = BuildConfig.FLAVOR;
        this.f4741d = BuildConfig.FLAVOR;
        this.f4742e = BuildConfig.FLAVOR;
        this.f4743f = BuildConfig.FLAVOR;
        this.f4744g = BuildConfig.FLAVOR;
        this.f4745h = 0;
    }

    public C0893c(Parcel parcel) {
        this.f4739b = (Long) parcel.readValue(Long.class.getClassLoader());
        this.f4740c = parcel.readString();
        this.f4741d = parcel.readString();
        this.f4742e = parcel.readString();
        this.f4743f = parcel.readString();
        this.f4744g = parcel.readString();
        this.f4745h = Integer.valueOf(parcel.readInt());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sbM2079g = C0561a.m2079g("UserInfo{id=");
        sbM2079g.append(this.f4739b);
        sbM2079g.append(", schoolCode='");
        sbM2079g.append(this.f4740c);
        sbM2079g.append('\'');
        sbM2079g.append(", userName='");
        sbM2079g.append(this.f4741d);
        sbM2079g.append('\'');
        sbM2079g.append(", realName='");
        sbM2079g.append(this.f4742e);
        sbM2079g.append('\'');
        sbM2079g.append(", password='");
        sbM2079g.append(this.f4743f);
        sbM2079g.append('\'');
        sbM2079g.append(", photo='");
        sbM2079g.append(this.f4744g);
        sbM2079g.append('\'');
        sbM2079g.append(", role=");
        sbM2079g.append(this.f4745h);
        sbM2079g.append('}');
        return sbM2079g.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.f4739b);
        parcel.writeString(this.f4740c);
        parcel.writeString(this.f4741d);
        parcel.writeString(this.f4742e);
        parcel.writeString(this.f4743f);
        parcel.writeString(this.f4744g);
        parcel.writeInt(this.f4745h.intValue());
    }
}
