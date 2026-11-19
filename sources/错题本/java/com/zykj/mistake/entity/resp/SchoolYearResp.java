package com.zykj.mistake.entity.resp;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.mistake.network.ApiResp;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R*\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\r"}, m5110d2 = {"Lcom/zykj/mistake/entity/resp/SchoolYearResp;", "Lcom/zykj/mistake/network/ApiResp;", "<init>", "()V", "result", "Ljava/util/ArrayList;", "Lcom/zykj/mistake/entity/resp/SchoolYearResp$SchoolYearInfo;", "Lkotlin/collections/ArrayList;", "getResult", "()Ljava/util/ArrayList;", "setResult", "(Ljava/util/ArrayList;)V", "SchoolYearInfo", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class SchoolYearResp extends ApiResp {
    public static final int $stable = 8;

    @NotNull
    private ArrayList<SchoolYearInfo> result = new ArrayList<>();

    @StabilityInferred(parameters = 0)
    @Metadata(m5109d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m5110d2 = {"Lcom/zykj/mistake/entity/resp/SchoolYearResp$SchoolYearInfo;", "", "<init>", "()V", "id", "", "getId", "()I", "setId", "(I)V", "content", "", "getContent", "()Ljava/lang/String;", "setContent", "(Ljava/lang/String;)V", "sort", "getSort", "setSort", "isActive", "", "()Z", "setActive", "(Z)V", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class SchoolYearInfo {
        public static final int $stable = 8;

        @NotNull
        private String content = "";
        private int id;
        private boolean isActive;
        private int sort;

        @NotNull
        public final String getContent() {
            return this.content;
        }

        public final int getId() {
            return this.id;
        }

        public final int getSort() {
            return this.sort;
        }

        /* renamed from: isActive, reason: from getter */
        public final boolean getIsActive() {
            return this.isActive;
        }

        public final void setActive(boolean z8) {
            this.isActive = z8;
        }

        public final void setContent(@NotNull String str) {
            AbstractC5830k.m5330g(str, "<set-?>");
            this.content = str;
        }

        public final void setId(int i) {
            this.id = i;
        }

        public final void setSort(int i) {
            this.sort = i;
        }
    }

    @NotNull
    public final ArrayList<SchoolYearInfo> getResult() {
        return this.result;
    }

    public final void setResult(@NotNull ArrayList<SchoolYearInfo> arrayList) {
        AbstractC5830k.m5330g(arrayList, "<set-?>");
        this.result = arrayList;
    }
}
