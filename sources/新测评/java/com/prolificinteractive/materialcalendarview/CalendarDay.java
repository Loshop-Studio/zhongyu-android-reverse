package com.prolificinteractive.materialcalendarview;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Calendar;
import java.util.Date;
import p021b2.AbstractC4965e;

/* loaded from: classes4.dex */
public final class CalendarDay implements Parcelable {
    public static final Parcelable.Creator<CalendarDay> CREATOR = new C6330a();

    /* renamed from: a */
    public final int f4730a;

    /* renamed from: b */
    public final int f4731b;

    /* renamed from: c */
    public final int f4732c;

    /* renamed from: d */
    public transient Calendar f4733d;

    /* renamed from: e */
    public transient Date f4734e;

    /* renamed from: com.prolificinteractive.materialcalendarview.CalendarDay$a */
    public static class C6330a implements Parcelable.Creator {
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
        this.f4730a = i10;
        this.f4731b = i11;
        this.f4732c = i12;
    }

    /* renamed from: b */
    public static CalendarDay m4413b(int i10, int i11, int i12) {
        return new CalendarDay(i10, i11, i12);
    }

    /* renamed from: c */
    public static CalendarDay m4414c(Calendar calendar) {
        if (calendar == null) {
            return null;
        }
        return m4413b(AbstractC4965e.m2416g(calendar), AbstractC4965e.m2415f(calendar), AbstractC4965e.m2411b(calendar));
    }

    /* renamed from: d */
    public static CalendarDay m4415d(Date date) {
        if (date == null) {
            return null;
        }
        return m4414c(AbstractC4965e.m2414e(date));
    }

    /* renamed from: l */
    public static int m4416l(int i10, int i11, int i12) {
        return (i10 * 10000) + (i11 * 100) + i12;
    }

    /* renamed from: q */
    public static CalendarDay m4417q() {
        return m4414c(AbstractC4965e.m2413d());
    }

    /* renamed from: a */
    public void m4418a(Calendar calendar) {
        calendar.clear();
        calendar.set(this.f4730a, this.f4731b, this.f4732c);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public Calendar m4419e() {
        if (this.f4733d == null) {
            Calendar calendarM2413d = AbstractC4965e.m2413d();
            this.f4733d = calendarM2413d;
            m4418a(calendarM2413d);
        }
        return this.f4733d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && CalendarDay.class == obj.getClass()) {
            CalendarDay calendarDay = (CalendarDay) obj;
            if (this.f4732c == calendarDay.f4732c && this.f4731b == calendarDay.f4731b && this.f4730a == calendarDay.f4730a) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public Date m4420g() {
        if (this.f4734e == null) {
            this.f4734e = m4419e().getTime();
        }
        return this.f4734e;
    }

    /* renamed from: h */
    public int m4421h() {
        return this.f4732c;
    }

    public int hashCode() {
        return m4416l(this.f4730a, this.f4731b, this.f4732c);
    }

    /* renamed from: i */
    public int m4422i() {
        return this.f4731b;
    }

    /* renamed from: j */
    public int m4423j() {
        return this.f4730a;
    }

    /* renamed from: n */
    public boolean m4424n(CalendarDay calendarDay) {
        if (calendarDay == null) {
            throw new IllegalArgumentException("other cannot be null");
        }
        int i10 = this.f4730a;
        int i11 = calendarDay.f4730a;
        if (i10 != i11) {
            return i10 > i11;
        }
        int i12 = this.f4731b;
        int i13 = calendarDay.f4731b;
        return i12 == i13 ? this.f4732c > calendarDay.f4732c : i12 > i13;
    }

    /* renamed from: o */
    public boolean m4425o(CalendarDay calendarDay) {
        if (calendarDay == null) {
            throw new IllegalArgumentException("other cannot be null");
        }
        int i10 = this.f4730a;
        int i11 = calendarDay.f4730a;
        if (i10 != i11) {
            return i10 < i11;
        }
        int i12 = this.f4731b;
        int i13 = calendarDay.f4731b;
        return i12 == i13 ? this.f4732c < calendarDay.f4732c : i12 < i13;
    }

    /* renamed from: p */
    public boolean m4426p(CalendarDay calendarDay, CalendarDay calendarDay2) {
        if (calendarDay == null || !calendarDay.m4424n(this)) {
            return calendarDay2 == null || !calendarDay2.m4425o(this);
        }
        return false;
    }

    public String toString() {
        return "CalendarDay{" + this.f4730a + "-" + this.f4731b + "-" + this.f4732c + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f4730a);
        parcel.writeInt(this.f4731b);
        parcel.writeInt(this.f4732c);
    }

    public CalendarDay(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt());
    }
}
