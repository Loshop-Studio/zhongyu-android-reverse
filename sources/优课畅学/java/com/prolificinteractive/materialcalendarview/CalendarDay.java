package com.prolificinteractive.materialcalendarview;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.smtt.audio.core.utils.TbsDialogBase;
import java.util.Calendar;
import java.util.Date;
import p094f1.AbstractC8410e;

/* loaded from: classes4.dex */
public final class CalendarDay implements Parcelable {
    public static final Parcelable.Creator<CalendarDay> CREATOR = new C6399a();

    /* renamed from: a */
    public final int f4219a;

    /* renamed from: b */
    public final int f4220b;

    /* renamed from: c */
    public final int f4221c;

    /* renamed from: d */
    public transient Calendar f4222d;

    /* renamed from: e */
    public transient Date f4223e;

    /* renamed from: com.prolificinteractive.materialcalendarview.CalendarDay$a */
    public static class C6399a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public CalendarDay createFromParcel(Parcel parcel) {
            return new CalendarDay(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public CalendarDay[] newArray(int i10) {
            return new CalendarDay[i10];
        }
    }

    public CalendarDay(int i10, int i11, int i12) {
        this.f4219a = i10;
        this.f4220b = i11;
        this.f4221c = i12;
    }

    /* renamed from: b */
    public static CalendarDay m3983b(int i10, int i11, int i12) {
        return new CalendarDay(i10, i11, i12);
    }

    /* renamed from: d */
    public static CalendarDay m3984d(Calendar calendar) {
        if (calendar == null) {
            return null;
        }
        return m3983b(AbstractC8410e.m13720g(calendar), AbstractC8410e.m13719f(calendar), AbstractC8410e.m13715b(calendar));
    }

    /* renamed from: f */
    public static CalendarDay m3985f(Date date) {
        if (date == null) {
            return null;
        }
        return m3984d(AbstractC8410e.m13718e(date));
    }

    /* renamed from: m */
    public static int m3986m(int i10, int i11, int i12) {
        return (i10 * TbsDialogBase.BTN_ID_POSITIVE) + (i11 * 100) + i12;
    }

    /* renamed from: q */
    public static CalendarDay m3987q() {
        return m3984d(AbstractC8410e.m13717d());
    }

    /* renamed from: a */
    public void m3988a(Calendar calendar) {
        calendar.clear();
        calendar.set(this.f4219a, this.f4220b, this.f4221c);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && CalendarDay.class == obj.getClass()) {
            CalendarDay calendarDay = (CalendarDay) obj;
            if (this.f4221c == calendarDay.f4221c && this.f4220b == calendarDay.f4220b && this.f4219a == calendarDay.f4219a) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    public Calendar m3989h() {
        if (this.f4222d == null) {
            Calendar calendarM13717d = AbstractC8410e.m13717d();
            this.f4222d = calendarM13717d;
            m3988a(calendarM13717d);
        }
        return this.f4222d;
    }

    public int hashCode() {
        return m3986m(this.f4219a, this.f4220b, this.f4221c);
    }

    /* renamed from: i */
    public Date m3990i() {
        if (this.f4223e == null) {
            this.f4223e = m3989h().getTime();
        }
        return this.f4223e;
    }

    /* renamed from: j */
    public int m3991j() {
        return this.f4221c;
    }

    /* renamed from: k */
    public int m3992k() {
        return this.f4220b;
    }

    /* renamed from: l */
    public int m3993l() {
        return this.f4219a;
    }

    /* renamed from: n */
    public boolean m3994n(CalendarDay calendarDay) {
        if (calendarDay == null) {
            throw new IllegalArgumentException("other cannot be null");
        }
        int i10 = this.f4219a;
        int i11 = calendarDay.f4219a;
        if (i10 != i11) {
            return i10 > i11;
        }
        int i12 = this.f4220b;
        int i13 = calendarDay.f4220b;
        return i12 == i13 ? this.f4221c > calendarDay.f4221c : i12 > i13;
    }

    /* renamed from: o */
    public boolean m3995o(CalendarDay calendarDay) {
        if (calendarDay == null) {
            throw new IllegalArgumentException("other cannot be null");
        }
        int i10 = this.f4219a;
        int i11 = calendarDay.f4219a;
        if (i10 != i11) {
            return i10 < i11;
        }
        int i12 = this.f4220b;
        int i13 = calendarDay.f4220b;
        return i12 == i13 ? this.f4221c < calendarDay.f4221c : i12 < i13;
    }

    /* renamed from: p */
    public boolean m3996p(CalendarDay calendarDay, CalendarDay calendarDay2) {
        if (calendarDay == null || !calendarDay.m3994n(this)) {
            return calendarDay2 == null || !calendarDay2.m3995o(this);
        }
        return false;
    }

    public String toString() {
        return "CalendarDay{" + this.f4219a + "-" + this.f4220b + "-" + this.f4221c + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f4219a);
        parcel.writeInt(this.f4220b);
        parcel.writeInt(this.f4221c);
    }

    public CalendarDay(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt());
    }
}
