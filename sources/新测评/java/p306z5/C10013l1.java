package p306z5;

import com.zykj.evaluation.bean.constant.MistakeTag;
import com.zykj.evaluation.p057ui.detail.mistake.TagData;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: z5.l1 */
/* loaded from: classes4.dex */
public final class C10013l1 {

    /* renamed from: a */
    public final List f17974a;

    /* renamed from: b */
    public final long f17975b;

    /* renamed from: c */
    public final boolean f17976c;

    /* renamed from: d */
    public final String f17977d;

    /* renamed from: e */
    public final List f17978e;

    /* renamed from: f */
    public final boolean f17979f;

    /* renamed from: g */
    public final List f17980g;

    /* renamed from: h */
    public final List f17981h;

    /* renamed from: i */
    public final List f17982i;

    /* renamed from: j */
    public final List f17983j;

    /* renamed from: k */
    public final List f17984k;

    public C10013l1(List topicList, long j10, boolean z9, String title, List stemList, boolean z10, List diffList, List attainedLevelList, List errorReasonList, List customTagList, List selectedTagList) {
        Intrinsics.checkNotNullParameter(topicList, "topicList");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(stemList, "stemList");
        Intrinsics.checkNotNullParameter(diffList, "diffList");
        Intrinsics.checkNotNullParameter(attainedLevelList, "attainedLevelList");
        Intrinsics.checkNotNullParameter(errorReasonList, "errorReasonList");
        Intrinsics.checkNotNullParameter(customTagList, "customTagList");
        Intrinsics.checkNotNullParameter(selectedTagList, "selectedTagList");
        this.f17974a = topicList;
        this.f17975b = j10;
        this.f17976c = z9;
        this.f17977d = title;
        this.f17978e = stemList;
        this.f17979f = z10;
        this.f17980g = diffList;
        this.f17981h = attainedLevelList;
        this.f17982i = errorReasonList;
        this.f17983j = customTagList;
        this.f17984k = selectedTagList;
    }

    /* renamed from: b */
    public static /* synthetic */ C10013l1 m16845b(C10013l1 c10013l1, List list, long j10, boolean z9, String str, List list2, boolean z10, List list3, List list4, List list5, List list6, List list7, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = c10013l1.f17974a;
        }
        if ((i10 & 2) != 0) {
            j10 = c10013l1.f17975b;
        }
        if ((i10 & 4) != 0) {
            z9 = c10013l1.f17976c;
        }
        if ((i10 & 8) != 0) {
            str = c10013l1.f17977d;
        }
        if ((i10 & 16) != 0) {
            list2 = c10013l1.f17978e;
        }
        if ((i10 & 32) != 0) {
            z10 = c10013l1.f17979f;
        }
        if ((i10 & 64) != 0) {
            list3 = c10013l1.f17980g;
        }
        if ((i10 & 128) != 0) {
            list4 = c10013l1.f17981h;
        }
        if ((i10 & 256) != 0) {
            list5 = c10013l1.f17982i;
        }
        if ((i10 & 512) != 0) {
            list6 = c10013l1.f17983j;
        }
        if ((i10 & 1024) != 0) {
            list7 = c10013l1.f17984k;
        }
        List list8 = list6;
        List list9 = list7;
        List list10 = list4;
        List list11 = list5;
        List list12 = list3;
        List list13 = list2;
        boolean z11 = z9;
        return c10013l1.m16846a(list, j10, z11, str, list13, z10, list12, list10, list11, list8, list9);
    }

    /* renamed from: a */
    public final C10013l1 m16846a(List topicList, long j10, boolean z9, String title, List stemList, boolean z10, List diffList, List attainedLevelList, List errorReasonList, List customTagList, List selectedTagList) {
        Intrinsics.checkNotNullParameter(topicList, "topicList");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(stemList, "stemList");
        Intrinsics.checkNotNullParameter(diffList, "diffList");
        Intrinsics.checkNotNullParameter(attainedLevelList, "attainedLevelList");
        Intrinsics.checkNotNullParameter(errorReasonList, "errorReasonList");
        Intrinsics.checkNotNullParameter(customTagList, "customTagList");
        Intrinsics.checkNotNullParameter(selectedTagList, "selectedTagList");
        return new C10013l1(topicList, j10, z9, title, stemList, z10, diffList, attainedLevelList, errorReasonList, customTagList, selectedTagList);
    }

    /* renamed from: c */
    public final List m16847c() {
        return this.f17981h;
    }

    /* renamed from: d */
    public final boolean m16848d() {
        return this.f17979f;
    }

    /* renamed from: e */
    public final List m16849e() {
        return this.f17983j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10013l1)) {
            return false;
        }
        C10013l1 c10013l1 = (C10013l1) obj;
        return Intrinsics.areEqual(this.f17974a, c10013l1.f17974a) && this.f17975b == c10013l1.f17975b && this.f17976c == c10013l1.f17976c && Intrinsics.areEqual(this.f17977d, c10013l1.f17977d) && Intrinsics.areEqual(this.f17978e, c10013l1.f17978e) && this.f17979f == c10013l1.f17979f && Intrinsics.areEqual(this.f17980g, c10013l1.f17980g) && Intrinsics.areEqual(this.f17981h, c10013l1.f17981h) && Intrinsics.areEqual(this.f17982i, c10013l1.f17982i) && Intrinsics.areEqual(this.f17983j, c10013l1.f17983j) && Intrinsics.areEqual(this.f17984k, c10013l1.f17984k);
    }

    /* renamed from: f */
    public final List m16850f() {
        return this.f17980g;
    }

    /* renamed from: g */
    public final List m16851g() {
        return this.f17982i;
    }

    /* renamed from: h */
    public final List m16852h() {
        return this.f17984k;
    }

    public int hashCode() {
        return (((((((((((((((((((this.f17974a.hashCode() * 31) + Long.hashCode(this.f17975b)) * 31) + Boolean.hashCode(this.f17976c)) * 31) + this.f17977d.hashCode()) * 31) + this.f17978e.hashCode()) * 31) + Boolean.hashCode(this.f17979f)) * 31) + this.f17980g.hashCode()) * 31) + this.f17981h.hashCode()) * 31) + this.f17982i.hashCode()) * 31) + this.f17983j.hashCode()) * 31) + this.f17984k.hashCode();
    }

    /* renamed from: i */
    public final long m16853i() {
        return this.f17975b;
    }

    /* renamed from: j */
    public final List m16854j() {
        return this.f17978e;
    }

    /* renamed from: k */
    public final String m16855k() {
        return this.f17977d;
    }

    /* renamed from: l */
    public final List m16856l() {
        return this.f17974a;
    }

    /* renamed from: m */
    public final boolean m16857m() {
        return this.f17976c;
    }

    public String toString() {
        return "MistakeUIState(topicList=" + this.f17974a + ", selectedTopicId=" + this.f17975b + ", isShowTopicDiffTip=" + this.f17976c + ", title=" + this.f17977d + ", stemList=" + this.f17978e + ", canOpenCamera=" + this.f17979f + ", diffList=" + this.f17980g + ", attainedLevelList=" + this.f17981h + ", errorReasonList=" + this.f17982i + ", customTagList=" + this.f17983j + ", selectedTagList=" + this.f17984k + ")";
    }

    public /* synthetic */ C10013l1(List list, long j10, boolean z9, String str, List list2, boolean z10, List list3, List list4, List list5, List list6, List list7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        List arrayList;
        char c10;
        List arrayList2;
        List arrayList3;
        List listEmptyList = (i10 & 1) != 0 ? CollectionsKt.emptyList() : list;
        long j11 = (i10 & 2) != 0 ? -1L : j10;
        boolean z11 = (i10 & 4) != 0 ? false : z9;
        String str2 = (i10 & 8) != 0 ? "" : str;
        List listEmptyList2 = (i10 & 16) != 0 ? CollectionsKt.emptyList() : list2;
        boolean z12 = (i10 & 32) != 0 ? false : z10;
        if ((i10 & 64) != 0) {
            List<MistakeTag.Diff> listListOf = CollectionsKt.listOf((Object[]) new MistakeTag.Diff[]{MistakeTag.Diff.Easy.INSTANCE, MistakeTag.Diff.Normal.INSTANCE, MistakeTag.Diff.Hard.INSTANCE});
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listListOf, 10));
            for (MistakeTag.Diff diff : listListOf) {
                arrayList.add(new TagData(diff.getId(), diff.getName(), false, 4, null));
            }
        } else {
            arrayList = list3;
        }
        if ((i10 & 128) != 0) {
            List<MistakeTag.AttainedLevel> listListOf2 = CollectionsKt.listOf((Object[]) new MistakeTag.AttainedLevel[]{MistakeTag.AttainedLevel.Unknown.INSTANCE, MistakeTag.AttainedLevel.Generally.INSTANCE, MistakeTag.AttainedLevel.Obviously.INSTANCE});
            c10 = 0;
            arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listListOf2, 10));
            for (MistakeTag.AttainedLevel attainedLevel : listListOf2) {
                arrayList2.add(new TagData(attainedLevel.getId(), attainedLevel.getName(), false, 4, null));
            }
        } else {
            c10 = 0;
            arrayList2 = list4;
        }
        if ((i10 & 256) != 0) {
            MistakeTag.ErrorReason[] errorReasonArr = new MistakeTag.ErrorReason[4];
            errorReasonArr[c10] = MistakeTag.ErrorReason.Concept.INSTANCE;
            errorReasonArr[1] = MistakeTag.ErrorReason.Examination.INSTANCE;
            errorReasonArr[2] = MistakeTag.ErrorReason.Calculate.INSTANCE;
            errorReasonArr[3] = MistakeTag.ErrorReason.Careless.INSTANCE;
            List<MistakeTag.ErrorReason> listListOf3 = CollectionsKt.listOf((Object[]) errorReasonArr);
            arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listListOf3, 10));
            for (MistakeTag.ErrorReason errorReason : listListOf3) {
                arrayList3.add(new TagData(errorReason.getId(), errorReason.getName(), false, 4, null));
            }
        } else {
            arrayList3 = list5;
        }
        this(listEmptyList, j11, z11, str2, listEmptyList2, z12, arrayList, arrayList2, arrayList3, (i10 & 512) != 0 ? CollectionsKt.emptyList() : list6, (i10 & 1024) != 0 ? CollectionsKt.emptyList() : list7);
    }
}
