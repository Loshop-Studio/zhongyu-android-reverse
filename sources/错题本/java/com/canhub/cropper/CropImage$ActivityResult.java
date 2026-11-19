package com.canhub.cropper;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.C0038g;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m5110d2 = {"com/canhub/cropper/CropImage$ActivityResult", "Lcom/canhub/cropper/u;", "Landroid/os/Parcelable;", "cropper_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public class CropImage$ActivityResult extends C3450u implements Parcelable {

    @JvmField
    @NotNull
    public static final Parcelable.Creator<CropImage$ActivityResult> CREATOR = new C0038g(10);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        AbstractC5830k.m5330g(dest, "dest");
        dest.writeParcelable(this.f2630a, i);
        dest.writeParcelable(this.f2631b, i);
        dest.writeSerializable(this.f2632c);
        dest.writeFloatArray(this.f2633d);
        dest.writeParcelable(this.f2634e, i);
        dest.writeParcelable(this.f2635f, i);
        dest.writeInt(this.f2636g);
        dest.writeInt(this.f2637h);
    }
}
