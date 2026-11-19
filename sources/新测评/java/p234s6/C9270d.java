package p234s6;

import com.zykj.evaluation.p057ui.home.AbstractC6930c;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: s6.d */
/* loaded from: classes4.dex */
public final class C9270d {

    /* renamed from: a */
    public final String f16017a;

    /* renamed from: b */
    public final List f16018b;

    /* renamed from: c */
    public final List f16019c;

    public C9270d(String title, List dataList, List checkedList) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        Intrinsics.checkNotNullParameter(checkedList, "checkedList");
        this.f16017a = title;
        this.f16018b = dataList;
        this.f16019c = checkedList;
    }

    /* renamed from: b */
    public static /* synthetic */ C9270d m15534b(C9270d c9270d, String str, List list, List list2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = c9270d.f16017a;
        }
        if ((i10 & 2) != 0) {
            list = c9270d.f16018b;
        }
        if ((i10 & 4) != 0) {
            list2 = c9270d.f16019c;
        }
        return c9270d.m15535a(str, list, list2);
    }

    /* renamed from: a */
    public final C9270d m15535a(String title, List dataList, List checkedList) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        Intrinsics.checkNotNullParameter(checkedList, "checkedList");
        return new C9270d(title, dataList, checkedList);
    }

    /* renamed from: c */
    public final List m15536c() {
        return this.f16019c;
    }

    /* renamed from: d */
    public final List m15537d() {
        return this.f16018b;
    }

    /* renamed from: e */
    public final String m15538e() {
        if (this.f16019c.contains(CollectionsKt.first(this.f16018b))) {
            return "";
        }
        if (this.f16019c.size() <= 2) {
            StringBuilder sb = new StringBuilder();
            Iterator it = this.f16019c.iterator();
            while (it.hasNext()) {
                sb.append(((AbstractC6930c) it.next()).m10075a());
                sb.append("、");
            }
            String string = StringsKt.removeSuffix(sb, "、").toString();
            if (string.length() <= 20) {
                return string;
            }
            String strSubstring = string.substring(0, 17);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            return strSubstring + "...";
        }
        String str = ((AbstractC6930c) this.f16019c.get(0)).m10075a() + "、" + ((AbstractC6930c) this.f16019c.get(1)).m10075a();
        String str2 = "...等共" + this.f16019c.size() + "个";
        StringBuilder sb2 = new StringBuilder();
        if (str.length() + str2.length() > 20) {
            sb2.append(str.subSequence(0, 20 - str2.length()));
            sb2.append(str2);
        } else {
            sb2.append(str);
            sb2.append(str2);
        }
        String string2 = sb2.toString();
        Intrinsics.checkNotNull(string2);
        return string2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9270d)) {
            return false;
        }
        C9270d c9270d = (C9270d) obj;
        return Intrinsics.areEqual(this.f16017a, c9270d.f16017a) && Intrinsics.areEqual(this.f16018b, c9270d.f16018b) && Intrinsics.areEqual(this.f16019c, c9270d.f16019c);
    }

    /* renamed from: f */
    public final String m15539f() {
        return this.f16017a;
    }

    /* renamed from: g */
    public final AbstractC6930c m15540g() {
        return (AbstractC6930c) CollectionsKt.first(this.f16018b);
    }

    public int hashCode() {
        return (((this.f16017a.hashCode() * 31) + this.f16018b.hashCode()) * 31) + this.f16019c.hashCode();
    }

    public String toString() {
        return "FilterData(title=" + this.f16017a + ", dataList=" + this.f16018b + ", checkedList=" + this.f16019c + ")";
    }

    public /* synthetic */ C9270d(String str, List list, List list2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, (i10 & 4) != 0 ? CollectionsKt.listOf(CollectionsKt.first(list)) : list2);
    }
}
