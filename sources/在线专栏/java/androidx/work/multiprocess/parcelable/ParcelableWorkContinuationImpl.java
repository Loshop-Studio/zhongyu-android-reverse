package androidx.work.multiprocess.parcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import p105j1.C2691b;
import p169x0.AbstractC3456y;
import p169x0.EnumC3439h;
import p173y0.C3492g;
import p173y0.C3494i;
import p173y0.C3495j;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class ParcelableWorkContinuationImpl implements Parcelable {

    /* renamed from: a */
    private C0839b f4928a;

    /* renamed from: b */
    private static final EnumC3439h[] f4927b = EnumC3439h.values();
    public static final Parcelable.Creator<ParcelableWorkContinuationImpl> CREATOR = new C0838a();

    /* renamed from: androidx.work.multiprocess.parcelable.ParcelableWorkContinuationImpl$a */
    class C0838a implements Parcelable.Creator<ParcelableWorkContinuationImpl> {
        C0838a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ParcelableWorkContinuationImpl createFromParcel(Parcel parcel) {
            return new ParcelableWorkContinuationImpl(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ParcelableWorkContinuationImpl[] newArray(int i4) {
            return new ParcelableWorkContinuationImpl[i4];
        }
    }

    /* renamed from: androidx.work.multiprocess.parcelable.ParcelableWorkContinuationImpl$b */
    public static class C0839b {

        /* renamed from: a */
        private final String f4929a;

        /* renamed from: b */
        private final EnumC3439h f4930b;

        /* renamed from: c */
        private final List<? extends AbstractC3456y> f4931c;

        /* renamed from: d */
        private List<C0839b> f4932d;

        public C0839b(String str, EnumC3439h enumC3439h, List<? extends AbstractC3456y> list, List<C0839b> list2) {
            this.f4929a = str;
            this.f4930b = enumC3439h;
            this.f4931c = list;
            this.f4932d = list2;
        }

        /* renamed from: e */
        private static List<C3492g> m4316e(C3494i c3494i, List<C0839b> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (C0839b c0839b : list) {
                arrayList.add(new C3492g(c3494i, c0839b.m4318b(), c0839b.m4317a(), c0839b.m4320d(), m4316e(c3494i, c0839b.m4319c())));
            }
            return arrayList;
        }

        /* renamed from: a */
        public EnumC3439h m4317a() {
            return this.f4930b;
        }

        /* renamed from: b */
        public String m4318b() {
            return this.f4929a;
        }

        /* renamed from: c */
        public List<C0839b> m4319c() {
            return this.f4932d;
        }

        /* renamed from: d */
        public List<? extends AbstractC3456y> m4320d() {
            return this.f4931c;
        }

        /* renamed from: f */
        public C3492g m4321f(C3494i c3494i) {
            return new C3492g(c3494i, m4318b(), m4317a(), m4320d(), m4316e(c3494i, m4319c()));
        }
    }

    public ParcelableWorkContinuationImpl(C0839b c0839b) {
        this.f4928a = c0839b;
    }

    /* renamed from: a */
    public C0839b m4312a() {
        return this.f4928a;
    }

    /* renamed from: b */
    public C3492g m4313b(C3494i c3494i) {
        return this.f4928a.m4321f(c3494i);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        String strM4318b = this.f4928a.m4318b();
        boolean z3 = !TextUtils.isEmpty(strM4318b);
        C2691b.m9004b(parcel, z3);
        if (z3) {
            parcel.writeString(strM4318b);
        }
        parcel.writeInt(this.f4928a.m4317a().ordinal());
        List<? extends AbstractC3456y> listM4320d = this.f4928a.m4320d();
        parcel.writeInt(listM4320d.size());
        if (!listM4320d.isEmpty()) {
            for (int i5 = 0; i5 < listM4320d.size(); i5++) {
                parcel.writeParcelable(new ParcelableWorkRequest(listM4320d.get(i5)), i4);
            }
        }
        List<C0839b> listM4319c = this.f4928a.m4319c();
        boolean z4 = (listM4319c == null || listM4319c.isEmpty()) ? false : true;
        C2691b.m9004b(parcel, z4);
        if (z4) {
            parcel.writeInt(listM4319c.size());
            for (int i6 = 0; i6 < listM4319c.size(); i6++) {
                parcel.writeParcelable(new ParcelableWorkContinuationImpl(listM4319c.get(i6)), i4);
            }
        }
    }

    protected ParcelableWorkContinuationImpl(Parcel parcel) {
        ArrayList arrayList = null;
        String string = C2691b.m9003a(parcel) ? parcel.readString() : null;
        EnumC3439h enumC3439h = f4927b[parcel.readInt()];
        int i4 = parcel.readInt();
        ArrayList arrayList2 = new ArrayList(i4);
        ClassLoader classLoader = getClass().getClassLoader();
        for (int i5 = 0; i5 < i4; i5++) {
            arrayList2.add((C3495j) ((ParcelableWorkRequest) parcel.readParcelable(classLoader)).m4330a());
        }
        if (C2691b.m9003a(parcel)) {
            int i6 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i6);
            for (int i7 = 0; i7 < i6; i7++) {
                arrayList3.add(((ParcelableWorkContinuationImpl) parcel.readParcelable(classLoader)).m4312a());
            }
            arrayList = arrayList3;
        }
        this.f4928a = new C0839b(string, enumC3439h, arrayList2, arrayList);
    }
}
