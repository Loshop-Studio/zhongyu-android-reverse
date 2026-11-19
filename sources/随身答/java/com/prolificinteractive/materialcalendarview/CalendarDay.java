package com.prolificinteractive.materialcalendarview;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Calendar;
import java.util.Date;
import p003a2.AbstractC0018e;

/* loaded from: classes4.dex */
public final class CalendarDay implements Parcelable {
    public static final Parcelable.Creator<CalendarDay> CREATOR = new C6596a();

    /* renamed from: a */
    public final int f5338a;

    /* renamed from: b */
    public final int f5339b;

    /* renamed from: c */
    public final int f5340c;

    /* renamed from: d */
    public transient Calendar f5341d;

    /* renamed from: e */
    public transient Date f5342e;

    /* renamed from: com.prolificinteractive.materialcalendarview.CalendarDay$a */
    public static class C6596a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public CalendarDay createFromParcel(Parcel parcel) {
            return new CalendarDay(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public CalendarDay[] newArray(int i9) {
            return new CalendarDay[i9];
        }
    }

    public CalendarDay(int i9, int i10, int i11) {
        this.f5338a = i9;
        this.f5339b = i10;
        this.f5340c = i11;
    }

    /* renamed from: b */
    public static CalendarDay m4618b(int i9, int i10, int i11) {
        return new CalendarDay(i9, i10, i11);
    }

    /* renamed from: c */
    public static CalendarDay m4619c(Calendar calendar) {
        if (calendar == null) {
            return null;
        }
        return m4618b(AbstractC0018e.m127g(calendar), AbstractC0018e.m126f(calendar), AbstractC0018e.m122b(calendar));
    }

    /* renamed from: d */
    public static CalendarDay m4620d(Date date) {
        if (date == null) {
            return null;
        }
        return m4619c(AbstractC0018e.m125e(date));
    }

    /* renamed from: k */
    public static int m4621k(int i9, int i10, int i11) {
        return (i9 * 10000) + (i10 * 100) + i11;
    }

    /* renamed from: p */
    public static CalendarDay m4622p() {
        return m4619c(AbstractC0018e.m124d());
    }

    /* renamed from: a */
    public void m4623a(Calendar calendar) {
        calendar.clear();
        calendar.set(this.f5338a, this.f5339b, this.f5340c);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public Calendar m4624e() {
        if (this.f5341d == null) {
            Calendar calendarM124d = AbstractC0018e.m124d();
            this.f5341d = calendarM124d;
            m4623a(calendarM124d);
        }
        return this.f5341d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && CalendarDay.class == obj.getClass()) {
            CalendarDay calendarDay = (CalendarDay) obj;
            if (this.f5340c == calendarDay.f5340c && this.f5339b == calendarDay.f5339b && this.f5338a == calendarDay.f5338a) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public Date m4625f() {
        if (this.f5342e == null) {
            this.f5342e = m4624e().getTime();
        }
        return this.f5342e;
    }

    /* renamed from: h */
    public int m4626h() {
        return this.f5340c;
    }

    public int hashCode() {
        return m4621k(this.f5338a, this.f5339b, this.f5340c);
    }

    /* renamed from: i */
    public int m4627i() {
        return this.f5339b;
    }

    /* renamed from: j */
    public int m4628j() {
        return this.f5338a;
    }

    /* renamed from: l */
    public boolean m4629l(CalendarDay calendarDay) {
        if (calendarDay == null) {
            throw new IllegalArgumentException("other cannot be null");
        }
        int i9 = this.f5338a;
        int i10 = calendarDay.f5338a;
        if (i9 != i10) {
            return i9 > i10;
        }
        int i11 = this.f5339b;
        int i12 = calendarDay.f5339b;
        return i11 == i12 ? this.f5340c > calendarDay.f5340c : i11 > i12;
    }

    /* renamed from: m */
    public boolean m4630m(CalendarDay calendarDay) {
        if (calendarDay == null) {
            throw new IllegalArgumentException("other cannot be null");
        }
        int i9 = this.f5338a;
        int i10 = calendarDay.f5338a;
        if (i9 != i10) {
            return i9 < i10;
        }
        int i11 = this.f5339b;
        int i12 = calendarDay.f5339b;
        return i11 == i12 ? this.f5340c < calendarDay.f5340c : i11 < i12;
    }

    /* renamed from: o */
    public boolean m4631o(CalendarDay calendarDay, CalendarDay calendarDay2) {
        if (calendarDay == null || !calendarDay.m4629l(this)) {
            return calendarDay2 == null || !calendarDay2.m4630m(this);
        }
        return false;
    }

    public String toString() {
        return "CalendarDay{" + this.f5338a + "-" + this.f5339b + "-" + this.f5340c + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        parcel.writeInt(this.f5338a);
        parcel.writeInt(this.f5339b);
        parcel.writeInt(this.f5340c);
    }

    public CalendarDay(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt());
    }
}
