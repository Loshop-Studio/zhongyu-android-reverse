package com.luck.picture.lib.config;

import android.os.Parcel;
import android.os.Parcelable;
import com.luck.picture.lib.entity.LocalMedia;
import com.luck.picture.lib.thread.PictureThreadUtils;
import java.util.ArrayList;
import java.util.List;
import p008a7.AbstractC0077j;
import p235l6.AbstractC10150d;
import p260n6.InterfaceC10322a;
import p260n6.InterfaceC10325d;
import p304q6.InterfaceC10752l;
import p345t6.AbstractC11246a;
import p359u6.AbstractC11370a;
import p434z6.C12023a;

/* loaded from: classes5.dex */
public final class PictureSelectionConfig implements Parcelable {
    public static final Parcelable.Creator<PictureSelectionConfig> CREATOR = new C7483a();

    /* renamed from: N0 */
    public static InterfaceC10322a f12293N0;

    /* renamed from: O0 */
    public static InterfaceC10325d f12294O0;

    /* renamed from: P0 */
    public static C12023a f12295P0;

    /* renamed from: Q0 */
    public static InterfaceC10752l f12296Q0;

    /* renamed from: R0 */
    public static volatile PictureSelectionConfig f12297R0;

    /* renamed from: A */
    public long f12298A;

    /* renamed from: A0 */
    public boolean f12299A0;

    /* renamed from: B */
    public long f12300B;

    /* renamed from: B0 */
    public boolean f12301B0;

    /* renamed from: C */
    public long f12302C;

    /* renamed from: C0 */
    public boolean f12303C0;

    /* renamed from: D */
    public int f12304D;

    /* renamed from: D0 */
    public boolean f12305D0;

    /* renamed from: E */
    public boolean f12306E;

    /* renamed from: E0 */
    public boolean f12307E0;

    /* renamed from: F */
    public boolean f12308F;

    /* renamed from: F0 */
    public boolean f12309F0;

    /* renamed from: G */
    public boolean f12310G;

    /* renamed from: G0 */
    public boolean f12311G0;

    /* renamed from: H */
    public boolean f12312H;

    /* renamed from: H0 */
    public boolean f12313H0;

    /* renamed from: I */
    public boolean f12314I;

    /* renamed from: I0 */
    public boolean f12315I0;

    /* renamed from: J */
    public boolean f12316J;

    /* renamed from: J0 */
    public boolean f12317J0;

    /* renamed from: K */
    public boolean f12318K;

    /* renamed from: K0 */
    public boolean f12319K0;

    /* renamed from: L */
    public boolean f12320L;

    /* renamed from: L0 */
    public boolean f12321L0;

    /* renamed from: M */
    public boolean f12322M;

    /* renamed from: M0 */
    public boolean f12323M0;

    /* renamed from: N */
    public boolean f12324N;

    /* renamed from: O */
    public boolean f12325O;

    /* renamed from: P */
    public boolean f12326P;

    /* renamed from: Q */
    public boolean f12327Q;

    /* renamed from: R */
    public List f12328R;

    /* renamed from: S */
    public List f12329S;

    /* renamed from: T */
    public boolean f12330T;

    /* renamed from: U */
    public String f12331U;

    /* renamed from: V */
    public String f12332V;

    /* renamed from: W */
    public String f12333W;

    /* renamed from: X */
    public String f12334X;

    /* renamed from: Y */
    public String f12335Y;

    /* renamed from: Z */
    public String f12336Z;

    /* renamed from: c */
    public int f12337c;

    /* renamed from: d */
    public boolean f12338d;

    /* renamed from: e */
    public boolean f12339e;

    /* renamed from: e0 */
    public String f12340e0;

    /* renamed from: f */
    public String f12341f;

    /* renamed from: f0 */
    public String f12342f0;

    /* renamed from: g */
    public String f12343g;

    /* renamed from: g0 */
    public String f12344g0;

    /* renamed from: h */
    public String f12345h;

    /* renamed from: h0 */
    public String f12346h0;

    /* renamed from: i */
    public String f12347i;

    /* renamed from: i0 */
    public int f12348i0;

    /* renamed from: j */
    public int f12349j;

    /* renamed from: j0 */
    public boolean f12350j0;

    /* renamed from: k */
    public boolean f12351k;

    /* renamed from: k0 */
    public boolean f12352k0;

    /* renamed from: l */
    public int f12353l;

    /* renamed from: l0 */
    public boolean f12354l0;

    /* renamed from: m */
    public int f12355m;

    /* renamed from: m0 */
    public int f12356m0;

    /* renamed from: n */
    public int f12357n;

    /* renamed from: n0 */
    public boolean f12358n0;

    /* renamed from: o */
    public int f12359o;

    /* renamed from: o0 */
    public boolean f12360o0;

    /* renamed from: p */
    public int f12361p;

    /* renamed from: p0 */
    public boolean f12362p0;

    /* renamed from: q */
    public int f12363q;

    /* renamed from: q0 */
    public boolean f12364q0;

    /* renamed from: r */
    public int f12365r;

    /* renamed from: r0 */
    public boolean f12366r0;

    /* renamed from: s */
    public int f12367s;

    /* renamed from: s0 */
    public int f12368s0;

    /* renamed from: t */
    public int f12369t;

    /* renamed from: t0 */
    public boolean f12370t0;

    /* renamed from: u */
    public int f12371u;

    /* renamed from: u0 */
    public boolean f12372u0;

    /* renamed from: v */
    public int f12373v;

    /* renamed from: v0 */
    public boolean f12374v0;

    /* renamed from: w */
    public int f12375w;

    /* renamed from: w0 */
    public boolean f12376w0;

    /* renamed from: x */
    public int f12377x;

    /* renamed from: x0 */
    public boolean f12378x0;

    /* renamed from: y */
    public int f12379y;

    /* renamed from: y0 */
    public boolean f12380y0;

    /* renamed from: z */
    public long f12381z;

    /* renamed from: z0 */
    public boolean f12382z0;

    /* renamed from: com.luck.picture.lib.config.PictureSelectionConfig$a */
    public class C7483a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PictureSelectionConfig createFromParcel(Parcel parcel) {
            return new PictureSelectionConfig(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public PictureSelectionConfig[] newArray(int i10) {
            return new PictureSelectionConfig[i10];
        }
    }

    public /* synthetic */ PictureSelectionConfig(Parcel parcel, C7483a c7483a) {
        this(parcel);
    }

    /* renamed from: a */
    public static void m9326a() {
        f12293N0 = null;
        f12296Q0 = null;
        f12294O0 = null;
        PictureThreadUtils.m9581e(PictureThreadUtils.m9586j());
        AbstractC11370a.m25300h();
        AbstractC11246a.m25085a();
        LocalMedia.m9338b();
        AbstractC11370a.m25308p(null);
    }

    /* renamed from: b */
    public static PictureSelectionConfig m9327b() {
        PictureSelectionConfig pictureSelectionConfigM9328c = m9328c();
        pictureSelectionConfigM9328c.m9329g();
        return pictureSelectionConfigM9328c;
    }

    /* renamed from: c */
    public static PictureSelectionConfig m9328c() {
        if (f12297R0 == null) {
            synchronized (PictureSelectionConfig.class) {
                try {
                    if (f12297R0 == null) {
                        f12297R0 = new PictureSelectionConfig();
                        f12297R0.m9329g();
                    }
                } finally {
                }
            }
        }
        return f12297R0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: g */
    public final void m9329g() {
        this.f12337c = AbstractC10150d.m21192c();
        this.f12338d = false;
        this.f12353l = 2;
        f12295P0 = new C12023a();
        this.f12355m = 9;
        this.f12357n = 0;
        this.f12359o = 1;
        this.f12361p = 0;
        this.f12363q = 0;
        this.f12365r = 1;
        this.f12304D = -2;
        this.f12367s = 0;
        this.f12369t = 0;
        this.f12371u = 0;
        this.f12373v = 0;
        this.f12381z = 0L;
        this.f12298A = 0L;
        this.f12300B = 0L;
        this.f12302C = 0L;
        this.f12375w = 60;
        this.f12377x = 0;
        this.f12379y = 4;
        this.f12351k = false;
        this.f12327Q = false;
        this.f12306E = true;
        this.f12308F = false;
        this.f12310G = true;
        this.f12312H = true;
        this.f12330T = false;
        this.f12339e = false;
        this.f12314I = true;
        this.f12316J = true;
        this.f12318K = true;
        this.f12326P = false;
        this.f12324N = false;
        this.f12325O = false;
        this.f12341f = ".jpeg";
        this.f12343g = ".mp4";
        this.f12345h = "image/jpeg";
        this.f12347i = "video/mp4";
        this.f12331U = "";
        this.f12332V = "";
        this.f12333W = "";
        this.f12328R = new ArrayList();
        this.f12334X = "";
        this.f12335Y = "";
        this.f12336Z = "";
        this.f12340e0 = "";
        this.f12342f0 = "";
        this.f12348i0 = 60;
        this.f12350j0 = true;
        this.f12352k0 = false;
        this.f12354l0 = false;
        this.f12356m0 = -1;
        this.f12358n0 = true;
        this.f12360o0 = true;
        this.f12362p0 = true;
        this.f12364q0 = true;
        this.f12366r0 = !AbstractC0077j.m217e();
        this.f12368s0 = AbstractC10150d.m21190a();
        this.f12370t0 = false;
        this.f12349j = -1;
        this.f12372u0 = false;
        this.f12374v0 = true;
        this.f12378x0 = false;
        this.f12380y0 = false;
        this.f12382z0 = false;
        this.f12299A0 = false;
        this.f12301B0 = false;
        this.f12320L = true;
        this.f12322M = this.f12337c != AbstractC10150d.m21191b();
        this.f12303C0 = false;
        this.f12376w0 = false;
        this.f12305D0 = true;
        this.f12307E0 = false;
        this.f12329S = new ArrayList();
        this.f12344g0 = "";
        this.f12309F0 = true;
        this.f12346h0 = "";
        this.f12311G0 = false;
        this.f12313H0 = false;
        this.f12315I0 = true;
        this.f12317J0 = false;
        this.f12319K0 = false;
        this.f12321L0 = false;
        this.f12323M0 = true;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f12337c);
        parcel.writeByte(this.f12338d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f12339e ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f12341f);
        parcel.writeString(this.f12343g);
        parcel.writeString(this.f12345h);
        parcel.writeString(this.f12347i);
        parcel.writeInt(this.f12349j);
        parcel.writeByte(this.f12351k ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f12353l);
        parcel.writeInt(this.f12355m);
        parcel.writeInt(this.f12357n);
        parcel.writeInt(this.f12359o);
        parcel.writeInt(this.f12361p);
        parcel.writeInt(this.f12363q);
        parcel.writeInt(this.f12365r);
        parcel.writeInt(this.f12367s);
        parcel.writeInt(this.f12369t);
        parcel.writeInt(this.f12371u);
        parcel.writeInt(this.f12373v);
        parcel.writeInt(this.f12375w);
        parcel.writeInt(this.f12377x);
        parcel.writeInt(this.f12379y);
        parcel.writeLong(this.f12381z);
        parcel.writeLong(this.f12298A);
        parcel.writeLong(this.f12300B);
        parcel.writeLong(this.f12302C);
        parcel.writeInt(this.f12304D);
        parcel.writeByte(this.f12306E ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f12308F ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f12310G ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f12312H ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f12314I ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f12316J ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f12318K ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f12320L ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f12322M ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f12324N ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f12325O ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f12326P ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f12327Q ? (byte) 1 : (byte) 0);
        parcel.writeStringList(this.f12328R);
        parcel.writeStringList(this.f12329S);
        parcel.writeByte(this.f12330T ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f12331U);
        parcel.writeString(this.f12332V);
        parcel.writeString(this.f12333W);
        parcel.writeString(this.f12334X);
        parcel.writeString(this.f12335Y);
        parcel.writeString(this.f12336Z);
        parcel.writeString(this.f12340e0);
        parcel.writeString(this.f12342f0);
        parcel.writeString(this.f12344g0);
        parcel.writeString(this.f12346h0);
        parcel.writeInt(this.f12348i0);
        parcel.writeByte(this.f12350j0 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f12352k0 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f12354l0 ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f12356m0);
        parcel.writeByte(this.f12358n0 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f12360o0 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f12362p0 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f12364q0 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f12366r0 ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f12368s0);
        parcel.writeByte(this.f12370t0 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f12372u0 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f12374v0 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f12376w0 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f12378x0 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f12380y0 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f12382z0 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f12299A0 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f12301B0 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f12303C0 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f12305D0 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f12307E0 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f12309F0 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f12311G0 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f12313H0 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f12315I0 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f12317J0 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f12319K0 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f12321L0 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f12323M0 ? (byte) 1 : (byte) 0);
    }

    public PictureSelectionConfig(Parcel parcel) {
        this.f12337c = parcel.readInt();
        this.f12338d = parcel.readByte() != 0;
        this.f12339e = parcel.readByte() != 0;
        this.f12341f = parcel.readString();
        this.f12343g = parcel.readString();
        this.f12345h = parcel.readString();
        this.f12347i = parcel.readString();
        this.f12349j = parcel.readInt();
        this.f12351k = parcel.readByte() != 0;
        this.f12353l = parcel.readInt();
        this.f12355m = parcel.readInt();
        this.f12357n = parcel.readInt();
        this.f12359o = parcel.readInt();
        this.f12361p = parcel.readInt();
        this.f12363q = parcel.readInt();
        this.f12365r = parcel.readInt();
        this.f12367s = parcel.readInt();
        this.f12369t = parcel.readInt();
        this.f12371u = parcel.readInt();
        this.f12373v = parcel.readInt();
        this.f12375w = parcel.readInt();
        this.f12377x = parcel.readInt();
        this.f12379y = parcel.readInt();
        this.f12381z = parcel.readLong();
        this.f12298A = parcel.readLong();
        this.f12300B = parcel.readLong();
        this.f12302C = parcel.readLong();
        this.f12304D = parcel.readInt();
        this.f12306E = parcel.readByte() != 0;
        this.f12308F = parcel.readByte() != 0;
        this.f12310G = parcel.readByte() != 0;
        this.f12312H = parcel.readByte() != 0;
        this.f12314I = parcel.readByte() != 0;
        this.f12316J = parcel.readByte() != 0;
        this.f12318K = parcel.readByte() != 0;
        this.f12320L = parcel.readByte() != 0;
        this.f12322M = parcel.readByte() != 0;
        this.f12324N = parcel.readByte() != 0;
        this.f12325O = parcel.readByte() != 0;
        this.f12326P = parcel.readByte() != 0;
        this.f12327Q = parcel.readByte() != 0;
        this.f12328R = parcel.createStringArrayList();
        this.f12329S = parcel.createStringArrayList();
        this.f12330T = parcel.readByte() != 0;
        this.f12331U = parcel.readString();
        this.f12332V = parcel.readString();
        this.f12333W = parcel.readString();
        this.f12334X = parcel.readString();
        this.f12335Y = parcel.readString();
        this.f12336Z = parcel.readString();
        this.f12340e0 = parcel.readString();
        this.f12342f0 = parcel.readString();
        this.f12344g0 = parcel.readString();
        this.f12346h0 = parcel.readString();
        this.f12348i0 = parcel.readInt();
        this.f12350j0 = parcel.readByte() != 0;
        this.f12352k0 = parcel.readByte() != 0;
        this.f12354l0 = parcel.readByte() != 0;
        this.f12356m0 = parcel.readInt();
        this.f12358n0 = parcel.readByte() != 0;
        this.f12360o0 = parcel.readByte() != 0;
        this.f12362p0 = parcel.readByte() != 0;
        this.f12364q0 = parcel.readByte() != 0;
        this.f12366r0 = parcel.readByte() != 0;
        this.f12368s0 = parcel.readInt();
        this.f12370t0 = parcel.readByte() != 0;
        this.f12372u0 = parcel.readByte() != 0;
        this.f12374v0 = parcel.readByte() != 0;
        this.f12376w0 = parcel.readByte() != 0;
        this.f12378x0 = parcel.readByte() != 0;
        this.f12380y0 = parcel.readByte() != 0;
        this.f12382z0 = parcel.readByte() != 0;
        this.f12299A0 = parcel.readByte() != 0;
        this.f12301B0 = parcel.readByte() != 0;
        this.f12303C0 = parcel.readByte() != 0;
        this.f12305D0 = parcel.readByte() != 0;
        this.f12307E0 = parcel.readByte() != 0;
        this.f12309F0 = parcel.readByte() != 0;
        this.f12311G0 = parcel.readByte() != 0;
        this.f12313H0 = parcel.readByte() != 0;
        this.f12315I0 = parcel.readByte() != 0;
        this.f12317J0 = parcel.readByte() != 0;
        this.f12319K0 = parcel.readByte() != 0;
        this.f12321L0 = parcel.readByte() != 0;
        this.f12323M0 = parcel.readByte() != 0;
    }

    public PictureSelectionConfig() {
    }
}
