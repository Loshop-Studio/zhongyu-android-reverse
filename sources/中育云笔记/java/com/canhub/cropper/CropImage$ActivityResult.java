package com.canhub.cropper;

import android.graphics.Rect;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.canhub.cropper.CropImageView;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes3.dex */
public class CropImage$ActivityResult extends CropImageView.C5891b implements Parcelable {

    /* renamed from: m */
    public static final C5884b f5136m = new C5884b(null);
    public static final Parcelable.Creator<CropImage$ActivityResult> CREATOR = new C5883a();

    /* renamed from: com.canhub.cropper.CropImage$ActivityResult$a */
    public static final class C5883a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public CropImage$ActivityResult createFromParcel(Parcel in) {
            AbstractC9979u.m20294g(in, "in");
            return new CropImage$ActivityResult(in);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public CropImage$ActivityResult[] newArray(int i10) {
            return new CropImage$ActivityResult[i10];
        }
    }

    /* renamed from: com.canhub.cropper.CropImage$ActivityResult$b */
    public static final class C5884b {
        public /* synthetic */ C5884b(AbstractC9972n abstractC9972n) {
            this();
        }

        public C5884b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CropImage$ActivityResult(Uri uri, Uri uri2, Exception exc, float[] fArr, Rect rect, int i10, Rect rect2, int i11) {
        super(null, uri, null, uri2, exc, fArr, rect, rect2, i10, i11);
        AbstractC9979u.m20291d(fArr);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i10) {
        AbstractC9979u.m20294g(dest, "dest");
        dest.writeParcelable(m4505g(), i10);
        dest.writeParcelable(m4508j(), i10);
        dest.writeSerializable(m4504c());
        dest.writeFloatArray(m4502a());
        dest.writeParcelable(m4503b(), i10);
        dest.writeParcelable(m4509k(), i10);
        dest.writeInt(m4506h());
        dest.writeInt(m4507i());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CropImage$ActivityResult(Parcel in) {
        AbstractC9979u.m20294g(in, "in");
        Uri uri = (Uri) in.readParcelable(Uri.class.getClassLoader());
        Uri uri2 = (Uri) in.readParcelable(Uri.class.getClassLoader());
        Exception exc = (Exception) in.readSerializable();
        float[] fArrCreateFloatArray = in.createFloatArray();
        AbstractC9979u.m20291d(fArrCreateFloatArray);
        super(null, uri, null, uri2, exc, fArrCreateFloatArray, (Rect) in.readParcelable(Rect.class.getClassLoader()), (Rect) in.readParcelable(Rect.class.getClassLoader()), in.readInt(), in.readInt());
    }
}
