package com.zykj.study.bean.course;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p227r0.AbstractC9900a;
import p227r0.AbstractC9901b;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class CatalogBean extends AbstractC9900a {
    public static final int $stable = 8;
    private final List<AbstractC9901b> childNode;
    private final List<CatalogBean> children;

    /* renamed from: id */
    private final int f10998id;
    private final boolean isChild;
    private final boolean isLeaf;
    private final int locked;
    private final int parentId;
    private final int progress;
    private final int sort;
    private final StudyStatus status;
    private final String title;

    public /* synthetic */ CatalogBean(int i10, String str, boolean z10, int i11, List list, List list2, int i12, StudyStatus studyStatus, boolean z11, int i13, int i14, int i15, AbstractC9126n abstractC9126n) {
        this(i10, (i15 & 2) != 0 ? "" : str, (i15 & 4) != 0 ? false : z10, (i15 & 8) != 0 ? 0 : i11, list, (i15 & 32) != 0 ? new ArrayList() : list2, i12, (i15 & 128) != 0 ? StudyStatus.NOT_COMPLETE : studyStatus, z11, i13, i14);
    }

    public static /* synthetic */ CatalogBean copy$default(CatalogBean catalogBean, int i10, String str, boolean z10, int i11, List list, List list2, int i12, StudyStatus studyStatus, boolean z11, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i10 = catalogBean.f10998id;
        }
        if ((i15 & 2) != 0) {
            str = catalogBean.title;
        }
        if ((i15 & 4) != 0) {
            z10 = catalogBean.isLeaf;
        }
        if ((i15 & 8) != 0) {
            i11 = catalogBean.progress;
        }
        if ((i15 & 16) != 0) {
            list = catalogBean.children;
        }
        if ((i15 & 32) != 0) {
            list2 = catalogBean.childNode;
        }
        if ((i15 & 64) != 0) {
            i12 = catalogBean.sort;
        }
        if ((i15 & 128) != 0) {
            studyStatus = catalogBean.status;
        }
        if ((i15 & 256) != 0) {
            z11 = catalogBean.isChild;
        }
        if ((i15 & 512) != 0) {
            i13 = catalogBean.parentId;
        }
        if ((i15 & 1024) != 0) {
            i14 = catalogBean.locked;
        }
        int i16 = i13;
        int i17 = i14;
        StudyStatus studyStatus2 = studyStatus;
        boolean z12 = z11;
        List list3 = list2;
        int i18 = i12;
        List list4 = list;
        boolean z13 = z10;
        return catalogBean.copy(i10, str, z13, i11, list4, list3, i18, studyStatus2, z12, i16, i17);
    }

    public final int component1() {
        return this.f10998id;
    }

    public final int component10() {
        return this.parentId;
    }

    public final int component11() {
        return this.locked;
    }

    public final String component2() {
        return this.title;
    }

    public final boolean component3() {
        return this.isLeaf;
    }

    public final int component4() {
        return this.progress;
    }

    public final List<CatalogBean> component5() {
        return this.children;
    }

    public final List<AbstractC9901b> component6() {
        return this.childNode;
    }

    public final int component7() {
        return this.sort;
    }

    public final StudyStatus component8() {
        return this.status;
    }

    public final boolean component9() {
        return this.isChild;
    }

    public final CatalogBean copy(int i10, String title, boolean z10, int i11, List<CatalogBean> list, List<AbstractC9901b> list2, int i12, StudyStatus studyStatus, boolean z11, int i13, int i14) {
        AbstractC9133u.m16133g(title, "title");
        return new CatalogBean(i10, title, z10, i11, list, list2, i12, studyStatus, z11, i13, i14);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogBean)) {
            return false;
        }
        CatalogBean catalogBean = (CatalogBean) obj;
        return this.f10998id == catalogBean.f10998id && AbstractC9133u.m16128b(this.title, catalogBean.title) && this.isLeaf == catalogBean.isLeaf && this.progress == catalogBean.progress && AbstractC9133u.m16128b(this.children, catalogBean.children) && AbstractC9133u.m16128b(this.childNode, catalogBean.childNode) && this.sort == catalogBean.sort && this.status == catalogBean.status && this.isChild == catalogBean.isChild && this.parentId == catalogBean.parentId && this.locked == catalogBean.locked;
    }

    @Override // p227r0.AbstractC9901b
    public List<AbstractC9901b> getChildNode() {
        return this.childNode;
    }

    public final List<CatalogBean> getChildren() {
        return this.children;
    }

    public final int getId() {
        return this.f10998id;
    }

    public final int getLocked() {
        return this.locked;
    }

    public final int getParentId() {
        return this.parentId;
    }

    public final int getProgress() {
        return this.progress;
    }

    public final int getSort() {
        return this.sort;
    }

    public final StudyStatus getStatus() {
        return this.status;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = ((((((Integer.hashCode(this.f10998id) * 31) + this.title.hashCode()) * 31) + Boolean.hashCode(this.isLeaf)) * 31) + Integer.hashCode(this.progress)) * 31;
        List<CatalogBean> list = this.children;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<AbstractC9901b> list2 = this.childNode;
        int iHashCode3 = (((iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31) + Integer.hashCode(this.sort)) * 31;
        StudyStatus studyStatus = this.status;
        return ((((((iHashCode3 + (studyStatus != null ? studyStatus.hashCode() : 0)) * 31) + Boolean.hashCode(this.isChild)) * 31) + Integer.hashCode(this.parentId)) * 31) + Integer.hashCode(this.locked);
    }

    public final boolean isChild() {
        return this.isChild;
    }

    public final boolean isLeaf() {
        return this.isLeaf;
    }

    public String toString() {
        return "CatalogBean(id=" + this.f10998id + ", title=" + this.title + ", isLeaf=" + this.isLeaf + ", progress=" + this.progress + ", children=" + this.children + ", childNode=" + this.childNode + ", sort=" + this.sort + ", status=" + this.status + ", isChild=" + this.isChild + ", parentId=" + this.parentId + ", locked=" + this.locked + ")";
    }

    public CatalogBean(int i10, String title, boolean z10, int i11, List<CatalogBean> list, List<AbstractC9901b> list2, int i12, StudyStatus studyStatus, boolean z11, int i13, int i14) {
        AbstractC9133u.m16133g(title, "title");
        this.f10998id = i10;
        this.title = title;
        this.isLeaf = z10;
        this.progress = i11;
        this.children = list;
        this.childNode = list2;
        this.sort = i12;
        this.status = studyStatus;
        this.isChild = z11;
        this.parentId = i13;
        this.locked = i14;
        setExpanded(false);
    }
}
