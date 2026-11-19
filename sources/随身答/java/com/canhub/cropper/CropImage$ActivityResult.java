package com.canhub.cropper;

import android.graphics.Rect;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.constraintlayout.motion.widget.Key;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.canhub.cropper.CropImageView;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m13412d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 \u001d2\u00020\u00012\u00020\u0002:\u0001\u001eB[\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012B\u0011\b\u0014\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0011\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, m13413d2 = {"com/canhub/cropper/CropImage$ActivityResult", "Lcom/canhub/cropper/CropImageView$b;", "Landroid/os/Parcelable;", "Landroid/net/Uri;", "originalUri", "uriContent", "Ljava/lang/Exception;", "Lkotlin/Exception;", "error", "", "cropPoints", "Landroid/graphics/Rect;", "cropRect", "", Key.ROTATION, "wholeImageRect", "sampleSize", "<init>", "(Landroid/net/Uri;Landroid/net/Uri;Ljava/lang/Exception;[FLandroid/graphics/Rect;ILandroid/graphics/Rect;I)V", "Landroid/os/Parcel;", "in", "(Landroid/os/Parcel;)V", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "k", "b", "cropper_release"}, m13414k = 1, m13415mv = {2, 0, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public class CropImage$ActivityResult extends CropImageView.C5528b implements Parcelable {

    @JvmField
    public static final Parcelable.Creator<CropImage$ActivityResult> CREATOR = new C5520a();

    /* renamed from: com.canhub.cropper.CropImage$ActivityResult$a */
    public static final class C5520a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public CropImage$ActivityResult createFromParcel(Parcel in) {
            Intrinsics.checkNotNullParameter(in, "in");
            return new CropImage$ActivityResult(in);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public CropImage$ActivityResult[] newArray(int i9) {
            return new CropImage$ActivityResult[i9];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CropImage$ActivityResult(Uri uri, Uri uri2, Exception exc, float[] fArr, Rect rect, int i9, Rect rect2, int i10) {
        super(null, uri, null, uri2, exc, fArr, rect, rect2, i9, i10);
        Intrinsics.checkNotNull(fArr);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(m3485d(), flags);
        dest.writeParcelable(m3488h(), flags);
        dest.writeSerializable(m3484c());
        dest.writeFloatArray(m3482a());
        dest.writeParcelable(m3483b(), flags);
        dest.writeParcelable(m3489i(), flags);
        dest.writeInt(m3486e());
        dest.writeInt(m3487f());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CropImage$ActivityResult(Parcel in) {
        Intrinsics.checkNotNullParameter(in, "in");
        Uri uri = (Uri) in.readParcelable(Uri.class.getClassLoader());
        Uri uri2 = (Uri) in.readParcelable(Uri.class.getClassLoader());
        Exception exc = (Exception) in.readSerializable();
        float[] fArrCreateFloatArray = in.createFloatArray();
        Intrinsics.checkNotNull(fArrCreateFloatArray);
        super(null, uri, null, uri2, exc, fArrCreateFloatArray, (Rect) in.readParcelable(Rect.class.getClassLoader()), (Rect) in.readParcelable(Rect.class.getClassLoader()), in.readInt(), in.readInt());
    }
}
