package com.zykj.student.dialogue.p076ui.home;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.navigation.NavArgs;
import java.io.Serializable;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 0)
@Metadata(m13412d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0001\u0016BA\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u0016\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u0011R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 ¨\u0006\""}, m13413d2 = {"Lcom/zykj/student/dialogue/ui/home/DatePickerFragmentArgs;", "Landroidx/navigation/NavArgs;", "Ljava/util/Date;", "startDate", "endDate", "startTime", "endTime", "", "type", "", "isJoinedTime", "<init>", "(Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;IZ)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/Date;", "c", "()Ljava/util/Date;", "b", "d", "e", "I", "f", "Z", "()Z", "g", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes5.dex */
public final /* data */ class DatePickerFragmentArgs implements NavArgs {

    /* renamed from: g, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: h */
    public static final int f11306h = 8;

    /* renamed from: a, reason: from kotlin metadata and from toString */
    public final Date startDate;

    /* renamed from: b, reason: from kotlin metadata and from toString */
    public final Date endDate;

    /* renamed from: c, reason: from kotlin metadata and from toString */
    public final Date startTime;

    /* renamed from: d, reason: from kotlin metadata and from toString */
    public final Date endTime;

    /* renamed from: e, reason: from kotlin metadata and from toString */
    public final int type;

    /* renamed from: f, reason: from kotlin metadata and from toString */
    public final boolean isJoinedTime;

    /* renamed from: com.zykj.student.dialogue.ui.home.DatePickerFragmentArgs$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final DatePickerFragmentArgs m10561a(Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(DatePickerFragmentArgs.class.getClassLoader());
            if (!bundle.containsKey("startDate")) {
                throw new IllegalArgumentException("Required argument \"startDate\" is missing and does not have an android:defaultValue");
            }
            if (!Parcelable.class.isAssignableFrom(Date.class) && !Serializable.class.isAssignableFrom(Date.class)) {
                throw new UnsupportedOperationException(Date.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
            }
            Date date = (Date) bundle.get("startDate");
            if (!bundle.containsKey("endDate")) {
                throw new IllegalArgumentException("Required argument \"endDate\" is missing and does not have an android:defaultValue");
            }
            if (!Parcelable.class.isAssignableFrom(Date.class) && !Serializable.class.isAssignableFrom(Date.class)) {
                throw new UnsupportedOperationException(Date.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
            }
            Date date2 = (Date) bundle.get("endDate");
            if (!bundle.containsKey("startTime")) {
                throw new IllegalArgumentException("Required argument \"startTime\" is missing and does not have an android:defaultValue");
            }
            if (!Parcelable.class.isAssignableFrom(Date.class) && !Serializable.class.isAssignableFrom(Date.class)) {
                throw new UnsupportedOperationException(Date.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
            }
            Date date3 = (Date) bundle.get("startTime");
            if (!bundle.containsKey("endTime")) {
                throw new IllegalArgumentException("Required argument \"endTime\" is missing and does not have an android:defaultValue");
            }
            if (Parcelable.class.isAssignableFrom(Date.class) || Serializable.class.isAssignableFrom(Date.class)) {
                Date date4 = (Date) bundle.get("endTime");
                boolean z9 = bundle.containsKey("isJoinedTime") ? bundle.getBoolean("isJoinedTime") : true;
                if (bundle.containsKey("type")) {
                    return new DatePickerFragmentArgs(date, date2, date3, date4, bundle.getInt("type"), z9);
                }
                throw new IllegalArgumentException("Required argument \"type\" is missing and does not have an android:defaultValue");
            }
            throw new UnsupportedOperationException(Date.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }

        public Companion() {
        }
    }

    public DatePickerFragmentArgs(Date date, Date date2, Date date3, Date date4, int i9, boolean z9) {
        this.startDate = date;
        this.endDate = date2;
        this.startTime = date3;
        this.endTime = date4;
        this.type = i9;
        this.isJoinedTime = z9;
    }

    @JvmStatic
    public static final DatePickerFragmentArgs fromBundle(Bundle bundle) {
        return INSTANCE.m10561a(bundle);
    }

    /* renamed from: a, reason: from getter */
    public final Date getEndDate() {
        return this.endDate;
    }

    /* renamed from: b, reason: from getter */
    public final Date getEndTime() {
        return this.endTime;
    }

    /* renamed from: c, reason: from getter */
    public final Date getStartDate() {
        return this.startDate;
    }

    /* renamed from: d, reason: from getter */
    public final Date getStartTime() {
        return this.startTime;
    }

    /* renamed from: e, reason: from getter */
    public final int getType() {
        return this.type;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DatePickerFragmentArgs)) {
            return false;
        }
        DatePickerFragmentArgs datePickerFragmentArgs = (DatePickerFragmentArgs) other;
        return Intrinsics.areEqual(this.startDate, datePickerFragmentArgs.startDate) && Intrinsics.areEqual(this.endDate, datePickerFragmentArgs.endDate) && Intrinsics.areEqual(this.startTime, datePickerFragmentArgs.startTime) && Intrinsics.areEqual(this.endTime, datePickerFragmentArgs.endTime) && this.type == datePickerFragmentArgs.type && this.isJoinedTime == datePickerFragmentArgs.isJoinedTime;
    }

    /* renamed from: f, reason: from getter */
    public final boolean getIsJoinedTime() {
        return this.isJoinedTime;
    }

    public int hashCode() {
        Date date = this.startDate;
        int iHashCode = (date == null ? 0 : date.hashCode()) * 31;
        Date date2 = this.endDate;
        int iHashCode2 = (iHashCode + (date2 == null ? 0 : date2.hashCode())) * 31;
        Date date3 = this.startTime;
        int iHashCode3 = (iHashCode2 + (date3 == null ? 0 : date3.hashCode())) * 31;
        Date date4 = this.endTime;
        return ((((iHashCode3 + (date4 != null ? date4.hashCode() : 0)) * 31) + Integer.hashCode(this.type)) * 31) + Boolean.hashCode(this.isJoinedTime);
    }

    public String toString() {
        return "DatePickerFragmentArgs(startDate=" + this.startDate + ", endDate=" + this.endDate + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", type=" + this.type + ", isJoinedTime=" + this.isJoinedTime + ")";
    }
}
