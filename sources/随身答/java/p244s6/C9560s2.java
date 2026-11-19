package p244s6;

import com.zykj.student.dialogue.bean.resp.CatalogResp;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: s6.s2 */
/* loaded from: classes5.dex */
public final class C9560s2 {

    /* renamed from: a */
    public final String f16704a;

    /* renamed from: b */
    public final List f16705b;

    /* renamed from: c */
    public final Long f16706c;

    /* renamed from: d */
    public final boolean f16707d;

    /* renamed from: e */
    public final List f16708e;

    /* renamed from: f */
    public final boolean f16709f;

    /* renamed from: g */
    public final String f16710g;

    /* renamed from: h */
    public final String f16711h;

    public C9560s2(String keyword, List catalogList, Long l9, boolean z9, List selectedList, boolean z10, String name, String avatar) {
        Intrinsics.checkNotNullParameter(keyword, "keyword");
        Intrinsics.checkNotNullParameter(catalogList, "catalogList");
        Intrinsics.checkNotNullParameter(selectedList, "selectedList");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        this.f16704a = keyword;
        this.f16705b = catalogList;
        this.f16706c = l9;
        this.f16707d = z9;
        this.f16708e = selectedList;
        this.f16709f = z10;
        this.f16710g = name;
        this.f16711h = avatar;
    }

    /* renamed from: b */
    public static /* synthetic */ C9560s2 m15748b(C9560s2 c9560s2, String str, List list, Long l9, boolean z9, List list2, boolean z10, String str2, String str3, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            str = c9560s2.f16704a;
        }
        if ((i9 & 2) != 0) {
            list = c9560s2.f16705b;
        }
        if ((i9 & 4) != 0) {
            l9 = c9560s2.f16706c;
        }
        if ((i9 & 8) != 0) {
            z9 = c9560s2.f16707d;
        }
        if ((i9 & 16) != 0) {
            list2 = c9560s2.f16708e;
        }
        if ((i9 & 32) != 0) {
            z10 = c9560s2.f16709f;
        }
        if ((i9 & 64) != 0) {
            str2 = c9560s2.f16710g;
        }
        if ((i9 & 128) != 0) {
            str3 = c9560s2.f16711h;
        }
        String str4 = str2;
        String str5 = str3;
        List list3 = list2;
        boolean z11 = z10;
        return c9560s2.m15749a(str, list, l9, z9, list3, z11, str4, str5);
    }

    /* renamed from: a */
    public final C9560s2 m15749a(String keyword, List catalogList, Long l9, boolean z9, List selectedList, boolean z10, String name, String avatar) {
        Intrinsics.checkNotNullParameter(keyword, "keyword");
        Intrinsics.checkNotNullParameter(catalogList, "catalogList");
        Intrinsics.checkNotNullParameter(selectedList, "selectedList");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        return new C9560s2(keyword, catalogList, l9, z9, selectedList, z10, name, avatar);
    }

    /* renamed from: c */
    public final String m15750c() {
        return this.f16711h;
    }

    /* renamed from: d */
    public final List m15751d() {
        return this.f16705b;
    }

    /* renamed from: e */
    public final List m15752e() {
        return CollectionsKt.plus((Collection) this.f16705b, (Iterable) CollectionsKt.listOf(CatalogResp.INSTANCE.getHISTORY_COLLECT()));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9560s2)) {
            return false;
        }
        C9560s2 c9560s2 = (C9560s2) obj;
        return Intrinsics.areEqual(this.f16704a, c9560s2.f16704a) && Intrinsics.areEqual(this.f16705b, c9560s2.f16705b) && Intrinsics.areEqual(this.f16706c, c9560s2.f16706c) && this.f16707d == c9560s2.f16707d && Intrinsics.areEqual(this.f16708e, c9560s2.f16708e) && this.f16709f == c9560s2.f16709f && Intrinsics.areEqual(this.f16710g, c9560s2.f16710g) && Intrinsics.areEqual(this.f16711h, c9560s2.f16711h);
    }

    /* renamed from: f */
    public final Long m15753f() {
        return this.f16706c;
    }

    /* renamed from: g */
    public final boolean m15754g() {
        return this.f16707d;
    }

    /* renamed from: h */
    public final String m15755h() {
        return this.f16704a;
    }

    public int hashCode() {
        int iHashCode = ((this.f16704a.hashCode() * 31) + this.f16705b.hashCode()) * 31;
        Long l9 = this.f16706c;
        return ((((((((((iHashCode + (l9 == null ? 0 : l9.hashCode())) * 31) + Boolean.hashCode(this.f16707d)) * 31) + this.f16708e.hashCode()) * 31) + Boolean.hashCode(this.f16709f)) * 31) + this.f16710g.hashCode()) * 31) + this.f16711h.hashCode();
    }

    /* renamed from: i */
    public final String m15756i() {
        return this.f16710g;
    }

    /* renamed from: j */
    public final List m15757j() {
        return this.f16708e;
    }

    /* renamed from: k */
    public final boolean m15758k() {
        return this.f16709f;
    }

    public String toString() {
        return "HomeUiState(keyword=" + this.f16704a + ", catalogList=" + this.f16705b + ", checkedCatalogId=" + this.f16706c + ", inEditMode=" + this.f16707d + ", selectedList=" + this.f16708e + ", isRefreshing=" + this.f16709f + ", name=" + this.f16710g + ", avatar=" + this.f16711h + ")";
    }

    public /* synthetic */ C9560s2(String str, List list, Long l9, boolean z9, List list2, boolean z10, String str2, String str3, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? "" : str, (i9 & 2) != 0 ? CollectionsKt.emptyList() : list, (i9 & 4) != 0 ? null : l9, (i9 & 8) != 0 ? false : z9, (i9 & 16) != 0 ? CollectionsKt.emptyList() : list2, (i9 & 32) != 0 ? false : z10, (i9 & 64) != 0 ? "" : str2, (i9 & 128) != 0 ? "" : str3);
    }
}
