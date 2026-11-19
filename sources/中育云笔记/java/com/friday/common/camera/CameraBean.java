package com.friday.common.camera;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blankj.utilcode.util.PathUtils;
import java.io.File;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class CameraBean implements Parcelable {
    public static final Parcelable.Creator<CameraBean> CREATOR = new C5932a();

    /* renamed from: k */
    public static final int f5643k = 8;

    /* renamed from: c */
    public final int f5644c;

    /* renamed from: d */
    public final String f5645d;

    /* renamed from: e */
    public final boolean f5646e;

    /* renamed from: f */
    public final int f5647f;

    /* renamed from: g */
    public final int f5648g;

    /* renamed from: h */
    public final boolean f5649h;

    /* renamed from: i */
    public final String f5650i;

    /* renamed from: j */
    public final int f5651j;

    /* renamed from: com.friday.common.camera.CameraBean$a */
    public static final class C5932a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CameraBean createFromParcel(Parcel parcel) {
            boolean z10;
            boolean z11;
            AbstractC9979u.m20294g(parcel, "parcel");
            int i10 = parcel.readInt();
            String string = parcel.readString();
            boolean z12 = false;
            if (parcel.readInt() != 0) {
                z10 = false;
                z12 = true;
                z11 = true;
            } else {
                z10 = false;
                z11 = true;
            }
            int i11 = parcel.readInt();
            boolean z13 = z11;
            int i12 = parcel.readInt();
            if (parcel.readInt() == 0) {
                z13 = z10;
            }
            return new CameraBean(i10, string, z12, i11, i12, z13, parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CameraBean[] newArray(int i10) {
            return new CameraBean[i10];
        }
    }

    public CameraBean(int i10, String path, boolean z10, int i11, int i12, boolean z11, String str, int i13) {
        AbstractC9979u.m20294g(path, "path");
        this.f5644c = i10;
        this.f5645d = path;
        this.f5646e = z10;
        this.f5647f = i11;
        this.f5648g = i12;
        this.f5649h = z11;
        this.f5650i = str;
        this.f5651j = i13;
    }

    /* renamed from: b */
    public static /* synthetic */ CameraBean m4812b(CameraBean cameraBean, int i10, String str, boolean z10, int i11, int i12, boolean z11, String str2, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = cameraBean.f5644c;
        }
        if ((i14 & 2) != 0) {
            str = cameraBean.f5645d;
        }
        if ((i14 & 4) != 0) {
            z10 = cameraBean.f5646e;
        }
        if ((i14 & 8) != 0) {
            i11 = cameraBean.f5647f;
        }
        if ((i14 & 16) != 0) {
            i12 = cameraBean.f5648g;
        }
        if ((i14 & 32) != 0) {
            z11 = cameraBean.f5649h;
        }
        if ((i14 & 64) != 0) {
            str2 = cameraBean.f5650i;
        }
        if ((i14 & 128) != 0) {
            i13 = cameraBean.f5651j;
        }
        String str3 = str2;
        int i15 = i13;
        int i16 = i12;
        boolean z12 = z11;
        return cameraBean.m4813a(i10, str, z10, i11, i16, z12, str3, i15);
    }

    /* renamed from: a */
    public final CameraBean m4813a(int i10, String path, boolean z10, int i11, int i12, boolean z11, String str, int i13) {
        AbstractC9979u.m20294g(path, "path");
        return new CameraBean(i10, path, z10, i11, i12, z11, str, i13);
    }

    /* renamed from: c */
    public final String m4814c() {
        return this.f5650i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraBean)) {
            return false;
        }
        CameraBean cameraBean = (CameraBean) obj;
        return this.f5644c == cameraBean.f5644c && AbstractC9979u.m20289b(this.f5645d, cameraBean.f5645d) && this.f5646e == cameraBean.f5646e && this.f5647f == cameraBean.f5647f && this.f5648g == cameraBean.f5648g && this.f5649h == cameraBean.f5649h && AbstractC9979u.m20289b(this.f5650i, cameraBean.f5650i) && this.f5651j == cameraBean.f5651j;
    }

    /* renamed from: g */
    public final boolean m4815g() {
        return this.f5646e;
    }

    /* renamed from: h */
    public final int m4816h() {
        return this.f5644c;
    }

    public int hashCode() {
        int iHashCode = ((((((((((Integer.hashCode(this.f5644c) * 31) + this.f5645d.hashCode()) * 31) + Boolean.hashCode(this.f5646e)) * 31) + Integer.hashCode(this.f5647f)) * 31) + Integer.hashCode(this.f5648g)) * 31) + Boolean.hashCode(this.f5649h)) * 31;
        String str = this.f5650i;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.f5651j);
    }

    /* renamed from: i */
    public final String m4817i() {
        return this.f5645d;
    }

    /* renamed from: j */
    public final int m4818j() {
        return this.f5647f;
    }

    /* renamed from: k */
    public final int m4819k() {
        return this.f5648g;
    }

    /* renamed from: l */
    public final int m4820l() {
        return this.f5651j;
    }

    public String toString() {
        return "CameraBean(imageType=" + this.f5644c + ", path=" + this.f5645d + ", fixAspectRatio=" + this.f5646e + ", ratioX=" + this.f5647f + ", ratioY=" + this.f5648g + ", compress=" + this.f5649h + ", deviceCode=" + this.f5650i + ", source=" + this.f5651j + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        AbstractC9979u.m20294g(dest, "dest");
        dest.writeInt(this.f5644c);
        dest.writeString(this.f5645d);
        dest.writeInt(this.f5646e ? 1 : 0);
        dest.writeInt(this.f5647f);
        dest.writeInt(this.f5648g);
        dest.writeInt(this.f5649h ? 1 : 0);
        dest.writeString(this.f5650i);
        dest.writeInt(this.f5651j);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CameraBean(int i10, String str, boolean z10, int i11, int i12, boolean z11, String str2, int i13, int i14, AbstractC9972n abstractC9972n) {
        i10 = (i14 & 1) != 0 ? 0 : i10;
        if ((i14 & 2) != 0) {
            str = PathUtils.getExternalAppCachePath() + File.separator + UUID.randomUUID() + ".jpg";
        }
        this(i10, str, (i14 & 4) != 0 ? false : z10, (i14 & 8) != 0 ? 0 : i11, (i14 & 16) != 0 ? 0 : i12, (i14 & 32) != 0 ? false : z11, (i14 & 64) != 0 ? null : str2, (i14 & 128) != 0 ? 1 : i13);
    }
}
