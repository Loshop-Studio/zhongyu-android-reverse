package com.zykj.study.bean.course;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.exifinterface.media.ExifInterface;
import com.google.gson.annotations.SerializedName;
import kotlin.enums.AbstractC9108a;
import kotlin.jvm.internal.AbstractC9133u;
import p212p7.InterfaceC9760a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class CourseType implements Parcelable {
    private static final /* synthetic */ InterfaceC9760a $ENTRIES;
    private static final /* synthetic */ CourseType[] $VALUES;
    public static final Parcelable.Creator<CourseType> CREATOR;

    @SerializedName("0")
    public static final CourseType UNDERCARRIAGE = new CourseType("UNDERCARRIAGE", 0);

    @SerializedName("1")
    public static final CourseType GROUNDING = new CourseType("GROUNDING", 1);

    @SerializedName(ExifInterface.GPS_MEASUREMENT_2D)
    public static final CourseType DELETE = new CourseType("DELETE", 2);

    private static final /* synthetic */ CourseType[] $values() {
        return new CourseType[]{UNDERCARRIAGE, GROUNDING, DELETE};
    }

    static {
        CourseType[] courseTypeArr$values = $values();
        $VALUES = courseTypeArr$values;
        $ENTRIES = AbstractC9108a.m16085a(courseTypeArr$values);
        CREATOR = new Parcelable.Creator<CourseType>() { // from class: com.zykj.study.bean.course.CourseType.Creator
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CourseType createFromParcel(Parcel parcel) {
                AbstractC9133u.m16133g(parcel, "parcel");
                return CourseType.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CourseType[] newArray(int i10) {
                return new CourseType[i10];
            }
        };
    }

    private CourseType(String str, int i10) {
    }

    public static InterfaceC9760a getEntries() {
        return $ENTRIES;
    }

    public static CourseType valueOf(String str) {
        return (CourseType) Enum.valueOf(CourseType.class, str);
    }

    public static CourseType[] values() {
        return (CourseType[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        AbstractC9133u.m16133g(dest, "dest");
        dest.writeString(name());
    }
}
