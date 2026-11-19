package com.zykj.mistake.entity.resp;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.mistake.network.ApiResp;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0002\u000b\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\r"}, m5110d2 = {"Lcom/zykj/mistake/entity/resp/MistakeBookResp;", "Lcom/zykj/mistake/network/ApiResp;", "<init>", "()V", "result", "", "Lcom/zykj/mistake/entity/resp/MistakeBookResp$MistakeBook;", "getResult", "()Ljava/util/List;", "setResult", "(Ljava/util/List;)V", "MistakeBook", "TopicInfo", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class MistakeBookResp extends ApiResp {
    public static final int $stable = 8;

    @NotNull
    private List<MistakeBook> result = new ArrayList();

    @StabilityInferred(parameters = 0)
    @Metadata(m5109d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001a\u0010\u0013\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001a\u0010\u0016\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000fR\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m5110d2 = {"Lcom/zykj/mistake/entity/resp/MistakeBookResp$MistakeBook;", "", "<init>", "()V", "id", "", "getId", "()J", "setId", "(J)V", "topicId", "", "getTopicId", "()I", "setTopicId", "(I)V", "studentUserId", "getStudentUserId", "setStudentUserId", "newQstCount", "getNewQstCount", "setNewQstCount", "totalQstCount", "getTotalQstCount", "setTotalQstCount", "topic", "Lcom/zykj/mistake/entity/resp/MistakeBookResp$TopicInfo;", "getTopic", "()Lcom/zykj/mistake/entity/resp/MistakeBookResp$TopicInfo;", "setTopic", "(Lcom/zykj/mistake/entity/resp/MistakeBookResp$TopicInfo;)V", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class MistakeBook {
        public static final int $stable = 8;
        private long id;
        private int newQstCount;
        private long studentUserId;

        @NotNull
        private TopicInfo topic = new TopicInfo();
        private int topicId;
        private int totalQstCount;

        public final long getId() {
            return this.id;
        }

        public final int getNewQstCount() {
            return this.newQstCount;
        }

        public final long getStudentUserId() {
            return this.studentUserId;
        }

        @NotNull
        public final TopicInfo getTopic() {
            return this.topic;
        }

        public final int getTopicId() {
            return this.topicId;
        }

        public final int getTotalQstCount() {
            return this.totalQstCount;
        }

        public final void setId(long j7) {
            this.id = j7;
        }

        public final void setNewQstCount(int i) {
            this.newQstCount = i;
        }

        public final void setStudentUserId(long j7) {
            this.studentUserId = j7;
        }

        public final void setTopic(@NotNull TopicInfo topicInfo) {
            AbstractC5830k.m5330g(topicInfo, "<set-?>");
            this.topic = topicInfo;
        }

        public final void setTopicId(int i) {
            this.topicId = i;
        }

        public final void setTotalQstCount(int i) {
            this.totalQstCount = i;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m5109d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m5110d2 = {"Lcom/zykj/mistake/entity/resp/MistakeBookResp$TopicInfo;", "", "<init>", "()V", "id", "", "getId", "()J", "setId", "(J)V", HintConstants.AUTOFILL_HINT_NAME, "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "content", "getContent", "setContent", "sort", "", "getSort", "()I", "setSort", "(I)V", "isActive", "", "()Z", "setActive", "(Z)V", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class TopicInfo {
        public static final int $stable = 8;
        private long id;
        private boolean isActive;

        @NotNull
        private String name = "";

        @NotNull
        private String content = "";
        private int sort = 3;

        @NotNull
        public final String getContent() {
            return this.content;
        }

        public final long getId() {
            return this.id;
        }

        @NotNull
        public final String getName() {
            return this.name;
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

        public final void setId(long j7) {
            this.id = j7;
        }

        public final void setName(@NotNull String str) {
            AbstractC5830k.m5330g(str, "<set-?>");
            this.name = str;
        }

        public final void setSort(int i) {
            this.sort = i;
        }
    }

    @NotNull
    public final List<MistakeBook> getResult() {
        return this.result;
    }

    public final void setResult(@NotNull List<MistakeBook> list) {
        AbstractC5830k.m5330g(list, "<set-?>");
        this.result = list;
    }
}
