package com.zykj.mistake.entity.resp;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.mistake.network.ApiResp;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0002\n\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\f"}, m5110d2 = {"Lcom/zykj/mistake/entity/resp/MistakeListResp;", "Lcom/zykj/mistake/network/ApiResp;", "<init>", "()V", "result", "Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeListInfo;", "getResult", "()Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeListInfo;", "setResult", "(Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeListInfo;)V", "MistakeListInfo", "MistakeInfo", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class MistakeListResp extends ApiResp {
    public static final int $stable = 8;

    @NotNull
    private MistakeListInfo result = new MistakeListInfo();

    @StabilityInferred(parameters = 0)
    @Metadata(m5109d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u00103\u001a\u00020%R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u0016\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001d\"\u0004\b!\u0010\u001fR\u001a\u0010\"\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001d\"\u0004\b#\u0010\u001fR\u001c\u0010$\u001a\u0004\u0018\u00010%X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001c\u0010*\u001a\u0004\u0018\u00010%X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010'\"\u0004\b,\u0010)R\u001c\u0010-\u001a\u0004\u0018\u00010%X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010'\"\u0004\b/\u0010)R\u001c\u00100\u001a\u0004\u0018\u00010%X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010'\"\u0004\b2\u0010)R\u001c\u00104\u001a\u0004\u0018\u00010%X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010'\"\u0004\b6\u0010)R\u001c\u00107\u001a\u0004\u0018\u00010%X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010'\"\u0004\b9\u0010)R\u001a\u0010:\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u001d\"\u0004\b<\u0010\u001fR\u001e\u0010=\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010B\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u001e\u0010C\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010B\u001a\u0004\bD\u0010?\"\u0004\bE\u0010AR\u001e\u0010F\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010B\u001a\u0004\bG\u0010?\"\u0004\bH\u0010AR.\u0010I\u001a\u0016\u0012\u0004\u0012\u00020%\u0018\u00010Jj\n\u0012\u0004\u0012\u00020%\u0018\u0001`KX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u001a\u0010P\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010\r\"\u0004\bR\u0010\u000fR\u001a\u0010S\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010\r\"\u0004\bU\u0010\u000fR\u001a\u0010V\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010\r\"\u0004\bX\u0010\u000fR\u001a\u0010Y\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010\u0007\"\u0004\b[\u0010\tR\u001c\u0010\\\u001a\u0004\u0018\u00010%X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b]\u0010'\"\u0004\b^\u0010)R\u001c\u0010_\u001a\u0004\u0018\u00010%X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b`\u0010'\"\u0004\ba\u0010)R\u001a\u0010b\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bb\u0010\u001d\"\u0004\bc\u0010\u001f¨\u0006d"}, m5110d2 = {"Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;", "", "<init>", "()V", "id", "", "getId", "()J", "setId", "(J)V", "bookId", "", "getBookId", "()I", "setBookId", "(I)V", "collectionIds", "", "getCollectionIds", "()Ljava/util/List;", "setCollectionIds", "(Ljava/util/List;)V", "isMastered", "", "()Ljava/lang/Boolean;", "setMastered", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "isInCurrentCollection", "()Z", "setInCurrentCollection", "(Z)V", "isInOtherCollection", "setInOtherCollection", "isRelatedQstGroup", "setRelatedQstGroup", "source", "", "getSource", "()Ljava/lang/String;", "setSource", "(Ljava/lang/String;)V", "title", "getTitle", "setTitle", "number", "getNumber", "setNumber", HintConstants.AUTOFILL_HINT_NAME, "getName", "setName", "getRealTitle", "creationTime", "getCreationTime", "setCreationTime", "stemShoot", "getStemShoot", "setStemShoot", "hasStem", "getHasStem", "setHasStem", "diff", "getDiff", "()Ljava/lang/Integer;", "setDiff", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "attainedLevel", "getAttainedLevel", "setAttainedLevel", "errorReason", "getErrorReason", "setErrorReason", "tagNames", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getTagNames", "()Ljava/util/ArrayList;", "setTagNames", "(Ljava/util/ArrayList;)V", "exerciseCount", "getExerciseCount", "setExerciseCount", "wrongCount", "getWrongCount", "setWrongCount", "rightCount", "getRightCount", "setRightCount", "topicId", "getTopicId", "setTopicId", "topicName", "getTopicName", "setTopicName", "examName", "getExamName", "setExamName", "isSelected", "setSelected", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @SourceDebugExtension({"SMAP\nMistakeListResp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MistakeListResp.kt\ncom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,103:1\n1#2:104\n*E\n"})
    public static final class MistakeInfo {
        public static final int $stable = 8;

        @Nullable
        private Integer attainedLevel;
        private int bookId;

        @Nullable
        private List<Integer> collectionIds;

        @Nullable
        private String creationTime;

        @Nullable
        private Integer diff;

        @Nullable
        private Integer errorReason;

        @Nullable
        private String examName;
        private int exerciseCount;
        private long id;
        private boolean isInCurrentCollection;
        private boolean isInOtherCollection;

        @Nullable
        private Boolean isMastered;
        private boolean isRelatedQstGroup;
        private boolean isSelected;

        @Nullable
        private String name;

        @Nullable
        private String number;
        private int rightCount;

        @Nullable
        private String source;

        @Nullable
        private String stemShoot;

        @Nullable
        private String title;
        private long topicId;

        @Nullable
        private String topicName;
        private int wrongCount;
        private boolean hasStem = true;

        @Nullable
        private ArrayList<String> tagNames = new ArrayList<>();

        @Nullable
        public final Integer getAttainedLevel() {
            return this.attainedLevel;
        }

        public final int getBookId() {
            return this.bookId;
        }

        @Nullable
        public final List<Integer> getCollectionIds() {
            return this.collectionIds;
        }

        @Nullable
        public final String getCreationTime() {
            return this.creationTime;
        }

        @Nullable
        public final Integer getDiff() {
            return this.diff;
        }

        @Nullable
        public final Integer getErrorReason() {
            return this.errorReason;
        }

        @Nullable
        public final String getExamName() {
            return this.examName;
        }

        public final int getExerciseCount() {
            return this.exerciseCount;
        }

        public final boolean getHasStem() {
            return this.hasStem;
        }

        public final long getId() {
            return this.id;
        }

        @Nullable
        public final String getName() {
            return this.name;
        }

        @Nullable
        public final String getNumber() {
            return this.number;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x001f A[PHI: r0
          0x001f: PHI (r0v6 java.lang.String) = (r0v4 java.lang.String), (r0v7 java.lang.String) binds: [B:22:0x0029, B:16:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0021  */
        @org.jetbrains.annotations.NotNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.String getRealTitle() {
            /*
                r4 = this;
                java.lang.String r0 = r4.title
                r1 = 0
                if (r0 == 0) goto Lc
                int r2 = r0.length()
                if (r2 <= 0) goto Lc
                goto Ld
            Lc:
                r0 = r1
            Ld:
                if (r0 == 0) goto L10
                return r0
            L10:
                java.lang.String r0 = r4.name
                if (r0 == 0) goto L21
                int r2 = r0.length()
                if (r2 <= 0) goto L1b
                goto L1c
            L1b:
                r0 = r1
            L1c:
                if (r0 != 0) goto L1f
                goto L21
            L1f:
                r1 = r0
                goto L2c
            L21:
                java.lang.String r0 = r4.number
                if (r0 == 0) goto L2c
                int r2 = r0.length()
                if (r2 <= 0) goto L2c
                goto L1f
            L2c:
                java.lang.String r0 = ""
                if (r1 == 0) goto L43
                int r2 = com.zykj.mistake.R.string.mistake_title
                java.lang.String r3 = r4.source
                if (r3 != 0) goto L37
                r3 = r0
            L37:
                java.lang.Object[] r1 = new java.lang.Object[]{r3, r1}
                java.lang.String r1 = com.blankj.utilcode.util.AbstractC3382c.m2307h(r2, r1)
                if (r1 != 0) goto L42
                goto L43
            L42:
                return r1
            L43:
                java.lang.String r1 = r4.source
                if (r1 != 0) goto L48
                return r0
            L48:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zykj.mistake.entity.resp.MistakeListResp.MistakeInfo.getRealTitle():java.lang.String"); // DEX body: android/错题本/smali_classes3/com/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo.smali:449
        }

        public final int getRightCount() {
            return this.rightCount;
        }

        @Nullable
        public final String getSource() {
            return this.source;
        }

        @Nullable
        public final String getStemShoot() {
            return this.stemShoot;
        }

        @Nullable
        public final ArrayList<String> getTagNames() {
            return this.tagNames;
        }

        @Nullable
        public final String getTitle() {
            return this.title;
        }

        public final long getTopicId() {
            return this.topicId;
        }

        @Nullable
        public final String getTopicName() {
            return this.topicName;
        }

        public final int getWrongCount() {
            return this.wrongCount;
        }

        /* renamed from: isInCurrentCollection, reason: from getter */
        public final boolean getIsInCurrentCollection() {
            return this.isInCurrentCollection;
        }

        /* renamed from: isInOtherCollection, reason: from getter */
        public final boolean getIsInOtherCollection() {
            return this.isInOtherCollection;
        }

        @Nullable
        /* renamed from: isMastered, reason: from getter */
        public final Boolean getIsMastered() {
            return this.isMastered;
        }

        /* renamed from: isRelatedQstGroup, reason: from getter */
        public final boolean getIsRelatedQstGroup() {
            return this.isRelatedQstGroup;
        }

        /* renamed from: isSelected, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }

        public final void setAttainedLevel(@Nullable Integer num) {
            this.attainedLevel = num;
        }

        public final void setBookId(int i) {
            this.bookId = i;
        }

        public final void setCollectionIds(@Nullable List<Integer> list) {
            this.collectionIds = list;
        }

        public final void setCreationTime(@Nullable String str) {
            this.creationTime = str;
        }

        public final void setDiff(@Nullable Integer num) {
            this.diff = num;
        }

        public final void setErrorReason(@Nullable Integer num) {
            this.errorReason = num;
        }

        public final void setExamName(@Nullable String str) {
            this.examName = str;
        }

        public final void setExerciseCount(int i) {
            this.exerciseCount = i;
        }

        public final void setHasStem(boolean z8) {
            this.hasStem = z8;
        }

        public final void setId(long j7) {
            this.id = j7;
        }

        public final void setInCurrentCollection(boolean z8) {
            this.isInCurrentCollection = z8;
        }

        public final void setInOtherCollection(boolean z8) {
            this.isInOtherCollection = z8;
        }

        public final void setMastered(@Nullable Boolean bool) {
            this.isMastered = bool;
        }

        public final void setName(@Nullable String str) {
            this.name = str;
        }

        public final void setNumber(@Nullable String str) {
            this.number = str;
        }

        public final void setRelatedQstGroup(boolean z8) {
            this.isRelatedQstGroup = z8;
        }

        public final void setRightCount(int i) {
            this.rightCount = i;
        }

        public final void setSelected(boolean z8) {
            this.isSelected = z8;
        }

        public final void setSource(@Nullable String str) {
            this.source = str;
        }

        public final void setStemShoot(@Nullable String str) {
            this.stemShoot = str;
        }

        public final void setTagNames(@Nullable ArrayList<String> arrayList) {
            this.tagNames = arrayList;
        }

        public final void setTitle(@Nullable String str) {
            this.title = str;
        }

        public final void setTopicId(long j7) {
            this.topicId = j7;
        }

        public final void setTopicName(@Nullable String str) {
            this.topicName = str;
        }

        public final void setWrongCount(int i) {
            this.wrongCount = i;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m5109d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m5110d2 = {"Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeListInfo;", "", "<init>", "()V", "totalCount", "", "getTotalCount", "()I", "setTotalCount", "(I)V", "masteredCount", "getMasteredCount", "setMasteredCount", "items", "", "Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class MistakeListInfo {
        public static final int $stable = 8;

        @NotNull
        private List<MistakeInfo> items = new ArrayList();
        private int masteredCount;
        private int totalCount;

        @NotNull
        public final List<MistakeInfo> getItems() {
            return this.items;
        }

        public final int getMasteredCount() {
            return this.masteredCount;
        }

        public final int getTotalCount() {
            return this.totalCount;
        }

        public final void setItems(@NotNull List<MistakeInfo> list) {
            AbstractC5830k.m5330g(list, "<set-?>");
            this.items = list;
        }

        public final void setMasteredCount(int i) {
            this.masteredCount = i;
        }

        public final void setTotalCount(int i) {
            this.totalCount = i;
        }
    }

    @NotNull
    public final MistakeListInfo getResult() {
        return this.result;
    }

    public final void setResult(@NotNull MistakeListInfo mistakeListInfo) {
        AbstractC5830k.m5330g(mistakeListInfo, "<set-?>");
        this.result = mistakeListInfo;
    }
}
