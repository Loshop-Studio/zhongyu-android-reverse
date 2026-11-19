package com.canhub.cropper;

import android.graphics.Rect;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.canhub.cropper.CropImageView;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes3.dex */
public class CropImage$ActivityResult extends CropImageView.C5472b implements Parcelable {

    /* renamed from: k */
    public static final C5465b f3366k = new C5465b(null);
    public static final Parcelable.Creator<CropImage$ActivityResult> CREATOR = new C5464a();

    /* renamed from: com.canhub.cropper.CropImage$ActivityResult$a */
    public static final class C5464a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public CropImage$ActivityResult createFromParcel(Parcel in) {
            AbstractC9133u.m16133g(in, "in");
            return new CropImage$ActivityResult(in);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public CropImage$ActivityResult[] newArray(int i10) {
            return new CropImage$ActivityResult[i10];
        }
    }

    /* renamed from: com.canhub.cropper.CropImage$ActivityResult$b */
    public static final class C5465b {
        public /* synthetic */ C5465b(AbstractC9126n abstractC9126n) {
            this();
        }

        public C5465b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CropImage$ActivityResult(Uri uri, Uri uri2, Exception exc, float[] fArr, Rect rect, int i10, Rect rect2, int i11) {
        super(null, uri, null, uri2, exc, fArr, rect, rect2, i10, i11);
        AbstractC9133u.m16130d(fArr);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i10) {
        AbstractC9133u.m16133g(dest, "dest");
        dest.writeParcelable(m3303f(), i10);
        dest.writeParcelable(m3306j(), i10);
        dest.writeSerializable(m3302d());
        dest.writeFloatArray(m3300a());
        dest.writeParcelable(m3301b(), i10);
        dest.writeParcelable(m3307k(), i10);
        dest.writeInt(m3304h());
        dest.writeInt(m3305i());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CropImage$ActivityResult(Parcel in) {
        AbstractC9133u.m16133g(in, "in");
        Uri uri = (Uri) in.readParcelable(Uri.class.getClassLoader());
        Uri uri2 = (Uri) in.readParcelable(Uri.class.getClassLoader());
        Exception exc = (Exception) in.readSerializable();
        float[] fArrCreateFloatArray = in.createFloatArray();
        AbstractC9133u.m16130d(fArrCreateFloatArray);
        super(null, uri, null, uri2, exc, fArrCreateFloatArray, (Rect) in.readParcelable(Rect.class.getClassLoader()), (Rect) in.readParcelable(Rect.class.getClassLoader()), in.readInt(), in.readInt());
    }
}
