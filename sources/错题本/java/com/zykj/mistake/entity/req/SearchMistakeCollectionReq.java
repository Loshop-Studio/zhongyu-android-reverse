package com.zykj.mistake.entity.req;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.view.board.play.C5353b;
import java.util.ArrayList;
import kotlin.AbstractC5773a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlinx.serialization.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.InterfaceC5429e;
import p084i7.InterfaceC5686b;
import p084i7.InterfaceC5689e;
import p101k7.InterfaceC5765g;
import p109l7.InterfaceC6070d;
import p118m7.AbstractC6144i1;
import p118m7.C6127d;
import p118m7.C6146j0;
import p118m7.C6156m1;
import p118m7.C6161o0;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0007\u0018\u0000 L2\u00020\u0001:\u0002MLB\u0007¢\u0006\u0004\b\u0002\u0010\u0003B¹\u0001\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0014\u001a\u00020\u0004\u0012\u0006\u0010\u0015\u001a\u00020\u0004\u0012\u0006\u0010\u0016\u001a\u00020\u0004\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0002\u0010\u0019J'\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b \u0010!R$\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R$\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R$\u0010\n\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010-\u001a\u0004\b2\u0010/\"\u0004\b3\u00101R2\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`48\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R2\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u000bj\b\u0012\u0004\u0012\u00020\u0004`48\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u00105\u001a\u0004\b:\u00107\"\u0004\b;\u00109R2\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u000bj\b\u0012\u0004\u0012\u00020\u0004`48\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u00105\u001a\u0004\b<\u00107\"\u0004\b=\u00109R2\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u000bj\b\u0012\u0004\u0012\u00020\u0004`48\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u00105\u001a\u0004\b>\u00107\"\u0004\b?\u00109R\"\u0010\u0011\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010(\u001a\u0004\b@\u0010*\"\u0004\bA\u0010,R\"\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010(\u001a\u0004\bB\u0010*\"\u0004\bC\u0010,R2\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u000bj\b\u0012\u0004\u0012\u00020\u0004`48\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u00105\u001a\u0004\bD\u00107\"\u0004\bE\u00109R\"\u0010\u0014\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010(\u001a\u0004\bF\u0010*\"\u0004\bG\u0010,R\"\u0010\u0015\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010(\u001a\u0004\bH\u0010*\"\u0004\bI\u0010,R\"\u0010\u0016\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010(\u001a\u0004\bJ\u0010*\"\u0004\bK\u0010,¨\u0006N"}, m5110d2 = {"Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;", "", "<init>", "()V", "", "seen0", "collectionId", "timeRange", "", "startTime", "endTime", "Ljava/util/ArrayList;", "", "topicIds", "diff", "attainedLevel", "errorReason", "currentCollectionStatus", "otherCollectionStatus", "tagIdList", "sortType", "skipCount", "maxResultCount", "Lm7/i1;", "serializationConstructorMarker", "(ILjava/lang/Integer;ILjava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;IILjava/util/ArrayList;IIILm7/i1;)V", "self", "Ll7/d;", "output", "Lk7/g;", "serialDesc", "Ld6/s;", "write$Self$app_release", "(Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;Ll7/d;Lk7/g;)V", "write$Self", "Ljava/lang/Integer;", "getCollectionId", "()Ljava/lang/Integer;", "setCollectionId", "(Ljava/lang/Integer;)V", "I", "getTimeRange", "()I", "setTimeRange", "(I)V", "Ljava/lang/String;", "getStartTime", "()Ljava/lang/String;", "setStartTime", "(Ljava/lang/String;)V", "getEndTime", "setEndTime", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "getTopicIds", "()Ljava/util/ArrayList;", "setTopicIds", "(Ljava/util/ArrayList;)V", "getDiff", "setDiff", "getAttainedLevel", "setAttainedLevel", "getErrorReason", "setErrorReason", "getCurrentCollectionStatus", "setCurrentCollectionStatus", "getOtherCollectionStatus", "setOtherCollectionStatus", "getTagIdList", "setTagIdList", "getSortType", "setSortType", "getSkipCount", "setSkipCount", "getMaxResultCount", "setMaxResultCount", "Companion", "$serializer", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@Serializable
/* loaded from: classes3.dex */
public final class SearchMistakeCollectionReq {

    @JvmField
    @NotNull
    private static final InterfaceC5429e[] $childSerializers;

    @NotNull
    private ArrayList<Integer> attainedLevel;

    @Nullable
    private Integer collectionId;
    private int currentCollectionStatus;

    @NotNull
    private ArrayList<Integer> diff;

    @Nullable
    private String endTime;

    @NotNull
    private ArrayList<Integer> errorReason;
    private int maxResultCount;
    private int otherCollectionStatus;
    private int skipCount;
    private int sortType;

    @Nullable
    private String startTime;

    @NotNull
    private ArrayList<Integer> tagIdList;
    private int timeRange;

    @NotNull
    private ArrayList<Long> topicIds;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m5109d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m5110d2 = {"Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq$Companion;", "", "<init>", "()V", "Li7/b;", "Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;", "serializer", "()Li7/b;", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final InterfaceC5686b serializer() {
            return SearchMistakeCollectionReq$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(AbstractC5824e abstractC5824e) {
            this();
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        $childSerializers = new InterfaceC5429e[]{null, null, null, null, AbstractC5773a.m5116a(lazyThreadSafetyMode, new C5353b(11)), AbstractC5773a.m5116a(lazyThreadSafetyMode, new C5353b(12)), AbstractC5773a.m5116a(lazyThreadSafetyMode, new C5353b(13)), AbstractC5773a.m5116a(lazyThreadSafetyMode, new C5353b(14)), null, null, AbstractC5773a.m5116a(lazyThreadSafetyMode, new C5353b(15)), null, null, null};
    }

    public SearchMistakeCollectionReq() {
        this.topicIds = new ArrayList<>();
        this.diff = new ArrayList<>();
        this.attainedLevel = new ArrayList<>();
        this.errorReason = new ArrayList<>();
        this.tagIdList = new ArrayList<>();
        this.maxResultCount = 20;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC5686b _childSerializers$_anonymous_() {
        return new C6127d(C6161o0.f9839a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC5686b _childSerializers$_anonymous_$0() {
        return new C6127d(C6146j0.f9816a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC5686b _childSerializers$_anonymous_$1() {
        return new C6127d(C6146j0.f9816a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC5686b _childSerializers$_anonymous_$2() {
        return new C6127d(C6146j0.f9816a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC5686b _childSerializers$_anonymous_$3() {
        return new C6127d(C6146j0.f9816a, 0);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$app_release(SearchMistakeCollectionReq self, InterfaceC6070d output, InterfaceC5765g serialDesc) {
        InterfaceC5429e[] interfaceC5429eArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.collectionId != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, C6146j0.f9816a, self.collectionId);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.timeRange != 0) {
            output.encodeIntElement(serialDesc, 1, self.timeRange);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.startTime != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, C6156m1.f9829a, self.startTime);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.endTime != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, C6156m1.f9829a, self.endTime);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || !AbstractC5830k.m5325b(self.topicIds, new ArrayList())) {
            output.encodeSerializableElement(serialDesc, 4, (InterfaceC5689e) interfaceC5429eArr[4].getValue(), self.topicIds);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || !AbstractC5830k.m5325b(self.diff, new ArrayList())) {
            output.encodeSerializableElement(serialDesc, 5, (InterfaceC5689e) interfaceC5429eArr[5].getValue(), self.diff);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || !AbstractC5830k.m5325b(self.attainedLevel, new ArrayList())) {
            output.encodeSerializableElement(serialDesc, 6, (InterfaceC5689e) interfaceC5429eArr[6].getValue(), self.attainedLevel);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || !AbstractC5830k.m5325b(self.errorReason, new ArrayList())) {
            output.encodeSerializableElement(serialDesc, 7, (InterfaceC5689e) interfaceC5429eArr[7].getValue(), self.errorReason);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.currentCollectionStatus != 0) {
            output.encodeIntElement(serialDesc, 8, self.currentCollectionStatus);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || self.otherCollectionStatus != 0) {
            output.encodeIntElement(serialDesc, 9, self.otherCollectionStatus);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 10) || !AbstractC5830k.m5325b(self.tagIdList, new ArrayList())) {
            output.encodeSerializableElement(serialDesc, 10, (InterfaceC5689e) interfaceC5429eArr[10].getValue(), self.tagIdList);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 11) || self.sortType != 0) {
            output.encodeIntElement(serialDesc, 11, self.sortType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 12) || self.skipCount != 0) {
            output.encodeIntElement(serialDesc, 12, self.skipCount);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 13) && self.maxResultCount == 20) {
            return;
        }
        output.encodeIntElement(serialDesc, 13, self.maxResultCount);
    }

    @NotNull
    public final ArrayList<Integer> getAttainedLevel() {
        return this.attainedLevel;
    }

    @Nullable
    public final Integer getCollectionId() {
        return this.collectionId;
    }

    public final int getCurrentCollectionStatus() {
        return this.currentCollectionStatus;
    }

    @NotNull
    public final ArrayList<Integer> getDiff() {
        return this.diff;
    }

    @Nullable
    public final String getEndTime() {
        return this.endTime;
    }

    @NotNull
    public final ArrayList<Integer> getErrorReason() {
        return this.errorReason;
    }

    public final int getMaxResultCount() {
        return this.maxResultCount;
    }

    public final int getOtherCollectionStatus() {
        return this.otherCollectionStatus;
    }

    public final int getSkipCount() {
        return this.skipCount;
    }

    public final int getSortType() {
        return this.sortType;
    }

    @Nullable
    public final String getStartTime() {
        return this.startTime;
    }

    @NotNull
    public final ArrayList<Integer> getTagIdList() {
        return this.tagIdList;
    }

    public final int getTimeRange() {
        return this.timeRange;
    }

    @NotNull
    public final ArrayList<Long> getTopicIds() {
        return this.topicIds;
    }

    public final void setAttainedLevel(@NotNull ArrayList<Integer> arrayList) {
        AbstractC5830k.m5330g(arrayList, "<set-?>");
        this.attainedLevel = arrayList;
    }

    public final void setCollectionId(@Nullable Integer num) {
        this.collectionId = num;
    }

    public final void setCurrentCollectionStatus(int i) {
        this.currentCollectionStatus = i;
    }

    public final void setDiff(@NotNull ArrayList<Integer> arrayList) {
        AbstractC5830k.m5330g(arrayList, "<set-?>");
        this.diff = arrayList;
    }

    public final void setEndTime(@Nullable String str) {
        this.endTime = str;
    }

    public final void setErrorReason(@NotNull ArrayList<Integer> arrayList) {
        AbstractC5830k.m5330g(arrayList, "<set-?>");
        this.errorReason = arrayList;
    }

    public final void setMaxResultCount(int i) {
        this.maxResultCount = i;
    }

    public final void setOtherCollectionStatus(int i) {
        this.otherCollectionStatus = i;
    }

    public final void setSkipCount(int i) {
        this.skipCount = i;
    }

    public final void setSortType(int i) {
        this.sortType = i;
    }

    public final void setStartTime(@Nullable String str) {
        this.startTime = str;
    }

    public final void setTagIdList(@NotNull ArrayList<Integer> arrayList) {
        AbstractC5830k.m5330g(arrayList, "<set-?>");
        this.tagIdList = arrayList;
    }

    public final void setTimeRange(int i) {
        this.timeRange = i;
    }

    public final void setTopicIds(@NotNull ArrayList<Long> arrayList) {
        AbstractC5830k.m5330g(arrayList, "<set-?>");
        this.topicIds = arrayList;
    }

    public /* synthetic */ SearchMistakeCollectionReq(int i, Integer num, int i8, String str, String str2, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, int i9, int i10, ArrayList arrayList5, int i11, int i12, int i13, AbstractC6144i1 abstractC6144i1) {
        if ((i & 1) == 0) {
            this.collectionId = null;
        } else {
            this.collectionId = num;
        }
        if ((i & 2) == 0) {
            this.timeRange = 0;
        } else {
            this.timeRange = i8;
        }
        if ((i & 4) == 0) {
            this.startTime = null;
        } else {
            this.startTime = str;
        }
        if ((i & 8) == 0) {
            this.endTime = null;
        } else {
            this.endTime = str2;
        }
        if ((i & 16) == 0) {
            this.topicIds = new ArrayList<>();
        } else {
            this.topicIds = arrayList;
        }
        if ((i & 32) == 0) {
            this.diff = new ArrayList<>();
        } else {
            this.diff = arrayList2;
        }
        if ((i & 64) == 0) {
            this.attainedLevel = new ArrayList<>();
        } else {
            this.attainedLevel = arrayList3;
        }
        if ((i & 128) == 0) {
            this.errorReason = new ArrayList<>();
        } else {
            this.errorReason = arrayList4;
        }
        if ((i & 256) == 0) {
            this.currentCollectionStatus = 0;
        } else {
            this.currentCollectionStatus = i9;
        }
        if ((i & 512) == 0) {
            this.otherCollectionStatus = 0;
        } else {
            this.otherCollectionStatus = i10;
        }
        if ((i & 1024) == 0) {
            this.tagIdList = new ArrayList<>();
        } else {
            this.tagIdList = arrayList5;
        }
        if ((i & 2048) == 0) {
            this.sortType = 0;
        } else {
            this.sortType = i11;
        }
        if ((i & 4096) == 0) {
            this.skipCount = 0;
        } else {
            this.skipCount = i12;
        }
        this.maxResultCount = (i & 8192) == 0 ? 20 : i13;
    }
}
