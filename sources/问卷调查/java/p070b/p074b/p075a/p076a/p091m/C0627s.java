package p070b.p074b.p075a.p076a.p091m;

import android.os.Parcel;
import android.os.Parcelable;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

/* renamed from: b.b.a.a.m.s */
/* loaded from: classes.dex */
public final class C0627s implements Comparable<C0627s>, Parcelable {
    public static final Parcelable.Creator<C0627s> CREATOR = new a();

    /* renamed from: b */
    public final Calendar f3794b;

    /* renamed from: c */
    public final String f3795c;

    /* renamed from: d */
    public final int f3796d;

    /* renamed from: e */
    public final int f3797e;

    /* renamed from: f */
    public final int f3798f;

    /* renamed from: g */
    public final int f3799g;

    /* renamed from: h */
    public final long f3800h;

    /* renamed from: b.b.a.a.m.s$a */
    public static class a implements Parcelable.Creator<C0627s> {
        @Override // android.os.Parcelable.Creator
        public C0627s createFromParcel(Parcel parcel) {
            return C0627s.m2205n(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public C0627s[] newArray(int i) {
            return new C0627s[i];
        }
    }

    public C0627s(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarM2178b = C0607a0.m2178b(calendar);
        this.f3794b = calendarM2178b;
        this.f3796d = calendarM2178b.get(2);
        this.f3797e = calendarM2178b.get(1);
        this.f3798f = calendarM2178b.getMaximum(7);
        this.f3799g = calendarM2178b.getActualMaximum(5);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("LLLL, yyyy", Locale.getDefault());
        simpleDateFormat.setTimeZone(C0607a0.m2179c());
        this.f3795c = simpleDateFormat.format(calendarM2178b.getTime());
        this.f3800h = calendarM2178b.getTimeInMillis();
    }

    /* renamed from: n */
    public static C0627s m2205n(int i, int i2) {
        Calendar calendarM2181e = C0607a0.m2181e();
        calendarM2181e.set(1, i);
        calendarM2181e.set(2, i2);
        return new C0627s(calendarM2181e);
    }

    /* renamed from: o */
    public static C0627s m2206o(long j) {
        Calendar calendarM2181e = C0607a0.m2181e();
        calendarM2181e.setTimeInMillis(j);
        return new C0627s(calendarM2181e);
    }

    /* renamed from: p */
    public static C0627s m2207p() {
        return new C0627s(C0607a0.m2180d());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0627s)) {
            return false;
        }
        C0627s c0627s = (C0627s) obj;
        return this.f3796d == c0627s.f3796d && this.f3797e == c0627s.f3797e;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f3796d), Integer.valueOf(this.f3797e)});
    }

    @Override // java.lang.Comparable
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public int compareTo(C0627s c0627s) {
        return this.f3794b.compareTo(c0627s.f3794b);
    }

    /* renamed from: q */
    public int m2209q() {
        int firstDayOfWeek = this.f3794b.get(7) - this.f3794b.getFirstDayOfWeek();
        return firstDayOfWeek < 0 ? firstDayOfWeek + this.f3798f : firstDayOfWeek;
    }

    /* renamed from: r */
    public C0627s m2210r(int i) {
        Calendar calendarM2178b = C0607a0.m2178b(this.f3794b);
        calendarM2178b.add(2, i);
        return new C0627s(calendarM2178b);
    }

    /* renamed from: s */
    public int m2211s(C0627s c0627s) {
        if (!(this.f3794b instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        return (c0627s.f3796d - this.f3796d) + ((c0627s.f3797e - this.f3797e) * 12);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f3797e);
        parcel.writeInt(this.f3796d);
    }
}
