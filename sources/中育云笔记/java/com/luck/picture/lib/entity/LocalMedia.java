package com.luck.picture.lib.entity;

import android.content.Context;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.io.File;
import p008a7.AbstractC0075h;
import p008a7.AbstractC0076i;
import p235l6.AbstractC10149c;
import p273o6.C10446b;
import p374v6.C11547b;

/* loaded from: classes5.dex */
public class LocalMedia implements Parcelable {
    public static final Parcelable.Creator<LocalMedia> CREATOR = new C7485a();

    /* renamed from: L */
    public static C11547b f12393L;

    /* renamed from: A */
    public long f12394A;

    /* renamed from: B */
    public boolean f12395B;

    /* renamed from: C */
    public String f12396C;

    /* renamed from: D */
    public String f12397D;

    /* renamed from: E */
    public long f12398E;

    /* renamed from: F */
    public long f12399F;

    /* renamed from: G */
    public String f12400G;

    /* renamed from: H */
    public boolean f12401H;

    /* renamed from: I */
    public boolean f12402I;

    /* renamed from: J */
    public boolean f12403J;

    /* renamed from: K */
    public LocalMedia f12404K;

    /* renamed from: c */
    public long f12405c;

    /* renamed from: d */
    public String f12406d;

    /* renamed from: e */
    public String f12407e;

    /* renamed from: f */
    public String f12408f;

    /* renamed from: g */
    public String f12409g;

    /* renamed from: h */
    public String f12410h;

    /* renamed from: i */
    public String f12411i;

    /* renamed from: j */
    public String f12412j;

    /* renamed from: k */
    public String f12413k;

    /* renamed from: l */
    public long f12414l;

    /* renamed from: m */
    public boolean f12415m;

    /* renamed from: n */
    public boolean f12416n;

    /* renamed from: o */
    public int f12417o;

    /* renamed from: p */
    public int f12418p;

    /* renamed from: q */
    public String f12419q;

    /* renamed from: r */
    public int f12420r;

    /* renamed from: s */
    public boolean f12421s;

    /* renamed from: t */
    public int f12422t;

    /* renamed from: u */
    public int f12423u;

    /* renamed from: v */
    public int f12424v;

    /* renamed from: w */
    public int f12425w;

    /* renamed from: x */
    public int f12426x;

    /* renamed from: y */
    public int f12427y;

    /* renamed from: z */
    public float f12428z;

    /* renamed from: com.luck.picture.lib.entity.LocalMedia$a */
    public class C7485a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public LocalMedia createFromParcel(Parcel parcel) {
            return new LocalMedia(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public LocalMedia[] newArray(int i10) {
            return new LocalMedia[i10];
        }
    }

    public LocalMedia() {
        this.f12398E = -1L;
    }

    /* renamed from: N */
    public static LocalMedia m9336N() {
        if (f12393L == null) {
            f12393L = new C11547b();
        }
        LocalMedia localMedia = (LocalMedia) f12393L.mo25405a();
        return localMedia == null ? m9337a() : localMedia;
    }

    /* renamed from: a */
    public static LocalMedia m9337a() {
        return new LocalMedia();
    }

    /* renamed from: b */
    public static void m9338b() {
        C11547b c11547b = f12393L;
        if (c11547b != null) {
            c11547b.mo25406b();
            f12393L = null;
        }
    }

    /* renamed from: c */
    public static LocalMedia m9339c(Context context, String str) {
        LocalMedia localMediaM9337a = m9337a();
        File file = AbstractC10149c.m21174c(str) ? new File(AbstractC0076i.m203h(context, Uri.parse(str))) : new File(str);
        localMediaM9337a.m9386n0(str);
        localMediaM9337a.m9390p0(file.getAbsolutePath());
        localMediaM9337a.m9368d0(file.getName());
        localMediaM9337a.m9384m0(AbstractC0075h.m180c(file.getAbsolutePath()));
        localMediaM9337a.m9376i0(AbstractC0075h.m185h(file.getAbsolutePath()));
        localMediaM9337a.m9394r0(file.length());
        localMediaM9337a.m9365a0(file.lastModified() / 1000);
        String absolutePath = file.getAbsolutePath();
        if (absolutePath.contains("Android/data/") || absolutePath.contains("data/user/")) {
            localMediaM9337a.m9372g0(System.currentTimeMillis());
            localMediaM9337a.m9354P(file.getParentFile() != null ? r1.getName().hashCode() : 0L);
        } else {
            Long[] lArrM186i = AbstractC0075h.m186i(context, localMediaM9337a.m9403z());
            localMediaM9337a.m9372g0(lArrM186i[0].longValue() == 0 ? System.currentTimeMillis() : lArrM186i[0].longValue());
            localMediaM9337a.m9354P(lArrM186i[1].longValue());
        }
        if (AbstractC10149c.m21180i(localMediaM9337a.m9397t())) {
            C10446b c10446bM188k = AbstractC0075h.m188k(context, str);
            localMediaM9337a.m9396s0(c10446bM188k.m21829c());
            localMediaM9337a.m9370f0(c10446bM188k.m21828b());
            localMediaM9337a.m9366b0(c10446bM188k.m21827a());
            return localMediaM9337a;
        }
        if (AbstractC10149c.m21175d(localMediaM9337a.m9397t())) {
            localMediaM9337a.m9366b0(AbstractC0075h.m181d(context, str).m21827a());
            return localMediaM9337a;
        }
        C10446b c10446bM183f = AbstractC0075h.m183f(context, str);
        localMediaM9337a.m9396s0(c10446bM183f.m21829c());
        localMediaM9337a.m9370f0(c10446bM183f.m21828b());
        return localMediaM9337a;
    }

    /* renamed from: A */
    public String m9340A() {
        return this.f12413k;
    }

    /* renamed from: B */
    public long m9341B() {
        return this.f12394A;
    }

    /* renamed from: C */
    public String m9342C() {
        return this.f12411i;
    }

    /* renamed from: D */
    public int m9343D() {
        return this.f12422t;
    }

    /* renamed from: E */
    public boolean m9344E() {
        return this.f12415m;
    }

    /* renamed from: F */
    public boolean m9345F() {
        return this.f12421s && !TextUtils.isEmpty(m9377j());
    }

    /* renamed from: G */
    public boolean m9346G() {
        return this.f12416n && !TextUtils.isEmpty(m9385n());
    }

    /* renamed from: H */
    public boolean m9347H() {
        return this.f12403J && !TextUtils.isEmpty(m9385n());
    }

    /* renamed from: I */
    public boolean m9348I() {
        return this.f12402I;
    }

    /* renamed from: J */
    public boolean m9349J() {
        return this.f12401H;
    }

    /* renamed from: K */
    public boolean m9350K() {
        return this.f12395B && !TextUtils.isEmpty(m9399v());
    }

    /* renamed from: L */
    public boolean m9351L() {
        return !TextUtils.isEmpty(m9340A());
    }

    /* renamed from: M */
    public boolean m9352M() {
        return !TextUtils.isEmpty(m9342C());
    }

    /* renamed from: O */
    public void m9353O() {
        C11547b c11547b = f12393L;
        if (c11547b != null) {
            c11547b.mo25408d(this);
        }
    }

    /* renamed from: P */
    public void m9354P(long j10) {
        this.f12398E = j10;
    }

    /* renamed from: Q */
    public void m9355Q(boolean z10) {
        this.f12415m = z10;
    }

    /* renamed from: R */
    public void m9356R(int i10) {
        this.f12420r = i10;
    }

    /* renamed from: S */
    public void m9357S(int i10) {
        this.f12425w = i10;
    }

    /* renamed from: T */
    public void m9358T(int i10) {
        this.f12424v = i10;
    }

    /* renamed from: U */
    public void m9359U(int i10) {
        this.f12426x = i10;
    }

    /* renamed from: V */
    public void m9360V(int i10) {
        this.f12427y = i10;
    }

    /* renamed from: W */
    public void m9361W(float f10) {
        this.f12428z = f10;
    }

    /* renamed from: X */
    public void m9362X(String str) {
        this.f12400G = str;
    }

    /* renamed from: Y */
    public void m9363Y(boolean z10) {
        this.f12416n = z10;
    }

    /* renamed from: Z */
    public void m9364Z(String str) {
        this.f12410h = str;
    }

    /* renamed from: a0 */
    public void m9365a0(long j10) {
        this.f12399F = j10;
    }

    /* renamed from: b0 */
    public void m9366b0(long j10) {
        this.f12414l = j10;
    }

    /* renamed from: c0 */
    public void m9367c0(boolean z10) {
        this.f12403J = z10;
    }

    /* renamed from: d0 */
    public void m9368d0(String str) {
        this.f12396C = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e0 */
    public void m9369e0(boolean z10) {
        this.f12402I = z10;
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalMedia)) {
            return false;
        }
        LocalMedia localMedia = (LocalMedia) obj;
        if (!TextUtils.equals(m9401x(), localMedia.m9401x()) && !TextUtils.equals(m9403z(), localMedia.m9403z()) && m9395s() != localMedia.m9395s()) {
            z10 = false;
        }
        if (!z10) {
            localMedia = null;
        }
        this.f12404K = localMedia;
        return z10;
    }

    /* renamed from: f0 */
    public void m9370f0(int i10) {
        this.f12423u = i10;
    }

    /* renamed from: g */
    public String m9371g() {
        String strM9401x = m9401x();
        if (m9346G()) {
            strM9401x = m9385n();
        }
        if (m9345F()) {
            strM9401x = m9377j();
        }
        if (m9351L()) {
            strM9401x = m9340A();
        }
        if (m9350K()) {
            strM9401x = m9399v();
        }
        return m9352M() ? m9342C() : strM9401x;
    }

    /* renamed from: g0 */
    public void m9372g0(long j10) {
        this.f12405c = j10;
    }

    /* renamed from: h */
    public long m9373h() {
        return this.f12398E;
    }

    /* renamed from: h0 */
    public void m9374h0(boolean z10) {
        this.f12401H = z10;
    }

    /* renamed from: i */
    public LocalMedia m9375i() {
        return this.f12404K;
    }

    /* renamed from: i0 */
    public void m9376i0(String str) {
        this.f12419q = str;
    }

    /* renamed from: j */
    public String m9377j() {
        return this.f12409g;
    }

    /* renamed from: j0 */
    public void m9378j0(int i10) {
        this.f12418p = i10;
    }

    /* renamed from: k */
    public int m9379k() {
        return this.f12425w;
    }

    /* renamed from: k0 */
    public void m9380k0(boolean z10) {
        this.f12395B = z10;
    }

    /* renamed from: l */
    public int m9381l() {
        return this.f12424v;
    }

    /* renamed from: l0 */
    public void m9382l0(String str) {
        this.f12408f = str;
    }

    /* renamed from: m */
    public String m9383m() {
        return this.f12400G;
    }

    /* renamed from: m0 */
    public void m9384m0(String str) {
        this.f12397D = str;
    }

    /* renamed from: n */
    public String m9385n() {
        return this.f12410h;
    }

    /* renamed from: n0 */
    public void m9386n0(String str) {
        this.f12406d = str;
    }

    /* renamed from: o */
    public long m9387o() {
        return this.f12399F;
    }

    /* renamed from: o0 */
    public void m9388o0(int i10) {
        this.f12417o = i10;
    }

    /* renamed from: p */
    public long m9389p() {
        return this.f12414l;
    }

    /* renamed from: p0 */
    public void m9390p0(String str) {
        this.f12407e = str;
    }

    /* renamed from: q */
    public String m9391q() {
        return this.f12396C;
    }

    /* renamed from: q0 */
    public void m9392q0(String str) {
        this.f12413k = str;
    }

    /* renamed from: r */
    public int m9393r() {
        return this.f12423u;
    }

    /* renamed from: r0 */
    public void m9394r0(long j10) {
        this.f12394A = j10;
    }

    /* renamed from: s */
    public long m9395s() {
        return this.f12405c;
    }

    /* renamed from: s0 */
    public void m9396s0(int i10) {
        this.f12422t = i10;
    }

    /* renamed from: t */
    public String m9397t() {
        return this.f12419q;
    }

    /* renamed from: u */
    public int m9398u() {
        return this.f12418p;
    }

    /* renamed from: v */
    public String m9399v() {
        return this.f12408f;
    }

    /* renamed from: w */
    public String m9400w() {
        return this.f12397D;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f12405c);
        parcel.writeString(this.f12406d);
        parcel.writeString(this.f12407e);
        parcel.writeString(this.f12408f);
        parcel.writeString(this.f12409g);
        parcel.writeString(this.f12410h);
        parcel.writeString(this.f12411i);
        parcel.writeString(this.f12412j);
        parcel.writeString(this.f12413k);
        parcel.writeLong(this.f12414l);
        parcel.writeByte(this.f12415m ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f12416n ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f12417o);
        parcel.writeInt(this.f12418p);
        parcel.writeString(this.f12419q);
        parcel.writeInt(this.f12420r);
        parcel.writeByte(this.f12421s ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f12422t);
        parcel.writeInt(this.f12423u);
        parcel.writeInt(this.f12424v);
        parcel.writeInt(this.f12425w);
        parcel.writeInt(this.f12426x);
        parcel.writeInt(this.f12427y);
        parcel.writeFloat(this.f12428z);
        parcel.writeLong(this.f12394A);
        parcel.writeByte(this.f12395B ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f12396C);
        parcel.writeString(this.f12397D);
        parcel.writeLong(this.f12398E);
        parcel.writeLong(this.f12399F);
        parcel.writeString(this.f12400G);
        parcel.writeByte(this.f12401H ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f12402I ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f12403J ? (byte) 1 : (byte) 0);
    }

    /* renamed from: x */
    public String m9401x() {
        return this.f12406d;
    }

    /* renamed from: y */
    public int m9402y() {
        return this.f12417o;
    }

    /* renamed from: z */
    public String m9403z() {
        return this.f12407e;
    }

    public LocalMedia(Parcel parcel) {
        this.f12398E = -1L;
        this.f12405c = parcel.readLong();
        this.f12406d = parcel.readString();
        this.f12407e = parcel.readString();
        this.f12408f = parcel.readString();
        this.f12409g = parcel.readString();
        this.f12410h = parcel.readString();
        this.f12411i = parcel.readString();
        this.f12412j = parcel.readString();
        this.f12413k = parcel.readString();
        this.f12414l = parcel.readLong();
        this.f12415m = parcel.readByte() != 0;
        this.f12416n = parcel.readByte() != 0;
        this.f12417o = parcel.readInt();
        this.f12418p = parcel.readInt();
        this.f12419q = parcel.readString();
        this.f12420r = parcel.readInt();
        this.f12421s = parcel.readByte() != 0;
        this.f12422t = parcel.readInt();
        this.f12423u = parcel.readInt();
        this.f12424v = parcel.readInt();
        this.f12425w = parcel.readInt();
        this.f12426x = parcel.readInt();
        this.f12427y = parcel.readInt();
        this.f12428z = parcel.readFloat();
        this.f12394A = parcel.readLong();
        this.f12395B = parcel.readByte() != 0;
        this.f12396C = parcel.readString();
        this.f12397D = parcel.readString();
        this.f12398E = parcel.readLong();
        this.f12399F = parcel.readLong();
        this.f12400G = parcel.readString();
        this.f12401H = parcel.readByte() != 0;
        this.f12402I = parcel.readByte() != 0;
        this.f12403J = parcel.readByte() != 0;
    }
}
