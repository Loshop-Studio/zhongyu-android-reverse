package p070b.p074b.p075a.p076a.p091m;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: b.b.a.a.m.a */
/* loaded from: classes.dex */
public final class C0606a implements Parcelable {
    public static final Parcelable.Creator<C0606a> CREATOR = new a();

    /* renamed from: b */
    public final C0627s f3702b;

    /* renamed from: c */
    public final C0627s f3703c;

    /* renamed from: d */
    public final C0627s f3704d;

    /* renamed from: e */
    public final c f3705e;

    /* renamed from: f */
    public final int f3706f;

    /* renamed from: g */
    public final int f3707g;

    /* renamed from: b.b.a.a.m.a$a */
    public static class a implements Parcelable.Creator<C0606a> {
        @Override // android.os.Parcelable.Creator
        public C0606a createFromParcel(Parcel parcel) {
            return new C0606a((C0627s) parcel.readParcelable(C0627s.class.getClassLoader()), (C0627s) parcel.readParcelable(C0627s.class.getClassLoader()), (C0627s) parcel.readParcelable(C0627s.class.getClassLoader()), (c) parcel.readParcelable(c.class.getClassLoader()), null);
        }

        @Override // android.os.Parcelable.Creator
        public C0606a[] newArray(int i) {
            return new C0606a[i];
        }
    }

    /* renamed from: b.b.a.a.m.a$b */
    public static final class b {

        /* renamed from: e */
        public static final long f3708e = C0607a0.m2177a(C0627s.m2205n(1900, 0).f3800h);

        /* renamed from: f */
        public static final long f3709f = C0607a0.m2177a(C0627s.m2205n(2100, 11).f3800h);

        /* renamed from: a */
        public long f3710a;

        /* renamed from: b */
        public long f3711b;

        /* renamed from: c */
        public Long f3712c;

        /* renamed from: d */
        public c f3713d;

        public b(C0606a c0606a) {
            this.f3710a = f3708e;
            this.f3711b = f3709f;
            this.f3713d = new C0613e(Long.MIN_VALUE);
            this.f3710a = c0606a.f3702b.f3800h;
            this.f3711b = c0606a.f3703c.f3800h;
            this.f3712c = Long.valueOf(c0606a.f3704d.f3800h);
            this.f3713d = c0606a.f3705e;
        }
    }

    /* renamed from: b.b.a.a.m.a$c */
    public interface c extends Parcelable {
        /* renamed from: k */
        boolean mo2176k(long j);
    }

    public C0606a(C0627s c0627s, C0627s c0627s2, C0627s c0627s3, c cVar, a aVar) {
        this.f3702b = c0627s;
        this.f3703c = c0627s2;
        this.f3704d = c0627s3;
        this.f3705e = cVar;
        if (c0627s.f3794b.compareTo(c0627s3.f3794b) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (c0627s3.f3794b.compareTo(c0627s2.f3794b) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        this.f3707g = c0627s.m2211s(c0627s2) + 1;
        this.f3706f = (c0627s2.f3797e - c0627s.f3797e) + 1;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0606a)) {
            return false;
        }
        C0606a c0606a = (C0606a) obj;
        return this.f3702b.equals(c0606a.f3702b) && this.f3703c.equals(c0606a.f3703c) && this.f3704d.equals(c0606a.f3704d) && this.f3705e.equals(c0606a.f3705e);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3702b, this.f3703c, this.f3704d, this.f3705e});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f3702b, 0);
        parcel.writeParcelable(this.f3703c, 0);
        parcel.writeParcelable(this.f3704d, 0);
        parcel.writeParcelable(this.f3705e, 0);
    }
}
