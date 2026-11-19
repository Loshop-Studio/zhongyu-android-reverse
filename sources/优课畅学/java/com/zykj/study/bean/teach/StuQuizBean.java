package com.zykj.study.bean.teach;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class StuQuizBean {
    public static final int $stable = 8;
    private final Map<String, List<String>> answerForStu;

    @SerializedName("avg")
    private final double avgRaw;
    private final List<String> completeList;
    private final int completeNum;

    @SerializedName("id")
    private final int groupId;
    private final String groupName;
    private final int totalNum;
    private final List<String> unCompleteList;

    /* JADX WARN: Multi-variable type inference failed */
    public StuQuizBean(int i10, String groupName, int i11, int i12, double d10, Map<String, ? extends List<String>> answerForStu, List<String> completeList, List<String> unCompleteList) {
        AbstractC9133u.m16133g(groupName, "groupName");
        AbstractC9133u.m16133g(answerForStu, "answerForStu");
        AbstractC9133u.m16133g(completeList, "completeList");
        AbstractC9133u.m16133g(unCompleteList, "unCompleteList");
        this.groupId = i10;
        this.groupName = groupName;
        this.completeNum = i11;
        this.totalNum = i12;
        this.avgRaw = d10;
        this.answerForStu = answerForStu;
        this.completeList = completeList;
        this.unCompleteList = unCompleteList;
    }

    public static /* synthetic */ StuQuizBean copy$default(StuQuizBean stuQuizBean, int i10, String str, int i11, int i12, double d10, Map map, List list, List list2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i10 = stuQuizBean.groupId;
        }
        if ((i13 & 2) != 0) {
            str = stuQuizBean.groupName;
        }
        if ((i13 & 4) != 0) {
            i11 = stuQuizBean.completeNum;
        }
        if ((i13 & 8) != 0) {
            i12 = stuQuizBean.totalNum;
        }
        if ((i13 & 16) != 0) {
            d10 = stuQuizBean.avgRaw;
        }
        if ((i13 & 32) != 0) {
            map = stuQuizBean.answerForStu;
        }
        if ((i13 & 64) != 0) {
            list = stuQuizBean.completeList;
        }
        if ((i13 & 128) != 0) {
            list2 = stuQuizBean.unCompleteList;
        }
        List list3 = list2;
        Map map2 = map;
        double d11 = d10;
        int i14 = i11;
        int i15 = i12;
        return stuQuizBean.copy(i10, str, i14, i15, d11, map2, list, list3);
    }

    public final int component1() {
        return this.groupId;
    }

    public final String component2() {
        return this.groupName;
    }

    public final int component3() {
        return this.completeNum;
    }

    public final int component4() {
        return this.totalNum;
    }

    public final double component5() {
        return this.avgRaw;
    }

    public final Map<String, List<String>> component6() {
        return this.answerForStu;
    }

    public final List<String> component7() {
        return this.completeList;
    }

    public final List<String> component8() {
        return this.unCompleteList;
    }

    public final StuQuizBean copy(int i10, String groupName, int i11, int i12, double d10, Map<String, ? extends List<String>> answerForStu, List<String> completeList, List<String> unCompleteList) {
        AbstractC9133u.m16133g(groupName, "groupName");
        AbstractC9133u.m16133g(answerForStu, "answerForStu");
        AbstractC9133u.m16133g(completeList, "completeList");
        AbstractC9133u.m16133g(unCompleteList, "unCompleteList");
        return new StuQuizBean(i10, groupName, i11, i12, d10, answerForStu, completeList, unCompleteList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StuQuizBean)) {
            return false;
        }
        StuQuizBean stuQuizBean = (StuQuizBean) obj;
        return this.groupId == stuQuizBean.groupId && AbstractC9133u.m16128b(this.groupName, stuQuizBean.groupName) && this.completeNum == stuQuizBean.completeNum && this.totalNum == stuQuizBean.totalNum && Double.compare(this.avgRaw, stuQuizBean.avgRaw) == 0 && AbstractC9133u.m16128b(this.answerForStu, stuQuizBean.answerForStu) && AbstractC9133u.m16128b(this.completeList, stuQuizBean.completeList) && AbstractC9133u.m16128b(this.unCompleteList, stuQuizBean.unCompleteList);
    }

    public final Map<String, List<String>> getAnswerForStu() {
        return this.answerForStu;
    }

    public final int getAvg() {
        return (int) this.avgRaw;
    }

    public final double getAvgRaw() {
        return this.avgRaw;
    }

    public final List<String> getCompleteList() {
        return this.completeList;
    }

    public final int getCompleteNum() {
        return this.completeNum;
    }

    public final int getGroupId() {
        return this.groupId;
    }

    public final String getGroupName() {
        return this.groupName;
    }

    public final int getTotalNum() {
        return this.totalNum;
    }

    public final List<String> getUnCompleteList() {
        return this.unCompleteList;
    }

    public int hashCode() {
        return (((((((((((((Integer.hashCode(this.groupId) * 31) + this.groupName.hashCode()) * 31) + Integer.hashCode(this.completeNum)) * 31) + Integer.hashCode(this.totalNum)) * 31) + Double.hashCode(this.avgRaw)) * 31) + this.answerForStu.hashCode()) * 31) + this.completeList.hashCode()) * 31) + this.unCompleteList.hashCode();
    }

    public String toString() {
        return "StuQuizBean(groupId=" + this.groupId + ", groupName=" + this.groupName + ", completeNum=" + this.completeNum + ", totalNum=" + this.totalNum + ", avgRaw=" + this.avgRaw + ", answerForStu=" + this.answerForStu + ", completeList=" + this.completeList + ", unCompleteList=" + this.unCompleteList + ")";
    }

    public /* synthetic */ StuQuizBean(int i10, String str, int i11, int i12, double d10, Map map, List list, List list2, int i13, AbstractC9126n abstractC9126n) {
        this((i13 & 1) != 0 ? 0 : i10, str, i11, i12, d10, map, list, list2);
    }
}
