package com.zykj.mistake.entity.resp;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.mistake.network.ApiResp;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0002\n\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\f"}, m5110d2 = {"Lcom/zykj/mistake/entity/resp/MistakeBookFilterOptionsResp;", "Lcom/zykj/mistake/network/ApiResp;", "<init>", "()V", "result", "Lcom/zykj/mistake/entity/resp/MistakeBookFilterOptionsResp$FilterOptions;", "getResult", "()Lcom/zykj/mistake/entity/resp/MistakeBookFilterOptionsResp$FilterOptions;", "setResult", "(Lcom/zykj/mistake/entity/resp/MistakeBookFilterOptionsResp$FilterOptions;)V", "FilterOptions", "FilterTopic", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class MistakeBookFilterOptionsResp extends ApiResp {
    public static final int $stable = 8;

    @NotNull
    private FilterOptions result = new FilterOptions();

    @StabilityInferred(parameters = 0)
    @Metadata(m5109d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u000f"}, m5110d2 = {"Lcom/zykj/mistake/entity/resp/MistakeBookFilterOptionsResp$FilterOptions;", "", "<init>", "()V", "topics", "", "Lcom/zykj/mistake/entity/resp/MistakeBookFilterOptionsResp$FilterTopic;", "getTopics", "()Ljava/util/List;", "setTopics", "(Ljava/util/List;)V", "tags", "Lcom/zykj/mistake/entity/resp/CustomTagInfo;", "getTags", "setTags", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class FilterOptions {
        public static final int $stable = 8;

        @NotNull
        private List<CustomTagInfo> tags;

        @NotNull
        private List<FilterTopic> topics;

        public FilterOptions() {
            EmptyList emptyList = EmptyList.INSTANCE;
            this.topics = emptyList;
            this.tags = emptyList;
        }

        @NotNull
        public final List<CustomTagInfo> getTags() {
            return this.tags;
        }

        @NotNull
        public final List<FilterTopic> getTopics() {
            return this.topics;
        }

        public final void setTags(@NotNull List<CustomTagInfo> list) {
            AbstractC5830k.m5330g(list, "<set-?>");
            this.tags = list;
        }

        public final void setTopics(@NotNull List<FilterTopic> list) {
            AbstractC5830k.m5330g(list, "<set-?>");
            this.topics = list;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m5109d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001b¨\u0006\u001f"}, m5110d2 = {"Lcom/zykj/mistake/entity/resp/MistakeBookFilterOptionsResp$FilterTopic;", "", "<init>", "()V", "bookId", "", "getBookId", "()J", "setBookId", "(J)V", "topicId", "getTopicId", "setTopicId", "topicName", "", "getTopicName", "()Ljava/lang/String;", "setTopicName", "(Ljava/lang/String;)V", "topicColor", "getTopicColor", "setTopicColor", "totalQstCount", "", "getTotalQstCount", "()I", "setTotalQstCount", "(I)V", "sort", "getSort", "setSort", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class FilterTopic {
        public static final int $stable = 8;
        private long bookId;
        private int sort;
        private long topicId;
        private int totalQstCount;

        @NotNull
        private String topicName = "";

        @NotNull
        private String topicColor = "";

        public final long getBookId() {
            return this.bookId;
        }

        public final int getSort() {
            return this.sort;
        }

        @NotNull
        public final String getTopicColor() {
            return this.topicColor;
        }

        public final long getTopicId() {
            return this.topicId;
        }

        @NotNull
        public final String getTopicName() {
            return this.topicName;
        }

        public final int getTotalQstCount() {
            return this.totalQstCount;
        }

        public final void setBookId(long j7) {
            this.bookId = j7;
        }

        public final void setSort(int i) {
            this.sort = i;
        }

        public final void setTopicColor(@NotNull String str) {
            AbstractC5830k.m5330g(str, "<set-?>");
            this.topicColor = str;
        }

        public final void setTopicId(long j7) {
            this.topicId = j7;
        }

        public final void setTopicName(@NotNull String str) {
            AbstractC5830k.m5330g(str, "<set-?>");
            this.topicName = str;
        }

        public final void setTotalQstCount(int i) {
            this.totalQstCount = i;
        }
    }

    @NotNull
    public final FilterOptions getResult() {
        return this.result;
    }

    public final void setResult(@NotNull FilterOptions filterOptions) {
        AbstractC5830k.m5330g(filterOptions, "<set-?>");
        this.result = filterOptions;
    }
}
