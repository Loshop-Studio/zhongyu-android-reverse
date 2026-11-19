package com.zykj.mistake.entity.resp;

import androidx.autofill.HintConstants;
import androidx.collection.AbstractC0584a;
import androidx.compose.material3.AbstractC1923c;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.AbstractC5855p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137p4.C6386e;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b5\b\u0087\b\u0018\u00002\u00020\u0001BÁ\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010 J\u0012\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b$\u0010\u001eJ\u0012\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b%\u0010\u001eJ\u0012\u0010&\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b&\u0010\u001eJ\u0012\u0010'\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b'\u0010\u001eJ\u0012\u0010(\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b(\u0010\u001eJ\u0012\u0010)\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b)\u0010\u001eJ\u0012\u0010*\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b*\u0010\u001eJ\u0012\u0010+\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b+\u0010\u001eJ\u0010\u0010,\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b.\u0010-J\u0010\u0010/\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b/\u0010-J\u0012\u00100\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b0\u00101J\u0018\u00102\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\b2\u00103JÊ\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00102\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0016HÆ\u0001¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b6\u0010\u001eJ\u0010\u00107\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b7\u0010\"J\u001a\u00109\u001a\u00020\u00102\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b9\u0010:R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010;\u001a\u0004\b<\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010=\u001a\u0004\b>\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010;\u001a\u0004\b?\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010@\u001a\u0004\bA\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010@\u001a\u0004\bB\u0010\u001eR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\n\u0010@\u001a\u0004\bC\u0010\u001eR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u0010@\u001a\u0004\bD\u0010\u001eR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\f\u0010@\u001a\u0004\bE\u0010\u001eR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\r\u0010@\u001a\u0004\bF\u0010\u001eR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u000e\u0010@\u001a\u0004\bG\u0010\u001eR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u000f\u0010@\u001a\u0004\bH\u0010\u001eR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010I\u001a\u0004\b\u0011\u0010-R\u0017\u0010\u0012\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u0010I\u001a\u0004\b\u0012\u0010-R\u0017\u0010\u0013\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0013\u0010I\u001a\u0004\bJ\u0010-R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010K\u001a\u0004\bL\u00101R\u001f\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010M\u001a\u0004\bN\u00103¨\u0006O"}, m5110d2 = {"Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;", "", "", "id", "", "itemId", "topicId", "", "subject", "topicName", "examName", "source", "title", HintConstants.AUTOFILL_HINT_NAME, "number", "stemShoot", "", "isCustomMistake", "isRelatedQstGroup", "hasStem", "Lcom/zykj/mistake/entity/resp/MistakeDetail;", "questionDetail", "", "questionDetails", "<init>", "(JIJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLcom/zykj/mistake/entity/resp/MistakeDetail;Ljava/util/List;)V", "Lp4/e;", "toNavItem", "()Lp4/e;", "getRealTitle", "()Ljava/lang/String;", "component1", "()J", "component2", "()I", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "()Z", "component13", "component14", "component15", "()Lcom/zykj/mistake/entity/resp/MistakeDetail;", "component16", "()Ljava/util/List;", "copy", "(JIJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLcom/zykj/mistake/entity/resp/MistakeDetail;Ljava/util/List;)Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "I", "getItemId", "getTopicId", "Ljava/lang/String;", "getSubject", "getTopicName", "getExamName", "getSource", "getTitle", "getName", "getNumber", "getStemShoot", "Z", "getHasStem", "Lcom/zykj/mistake/entity/resp/MistakeDetail;", "getQuestionDetail", "Ljava/util/List;", "getQuestionDetails", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nGetNextReviewQuestionResp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetNextReviewQuestionResp.kt\ncom/zykj/mistake/entity/resp/NextReviewQuestionResult\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,57:1\n1#2:58\n*E\n"})
/* loaded from: classes3.dex */
public final /* data */ class NextReviewQuestionResult {
    public static final int $stable = 8;

    @Nullable
    private final String examName;
    private final boolean hasStem;
    private final long id;
    private final boolean isCustomMistake;
    private final boolean isRelatedQstGroup;
    private final int itemId;

    @Nullable
    private final String name;

    @Nullable
    private final String number;

    @Nullable
    private final MistakeDetail questionDetail;

    @Nullable
    private final List<MistakeDetail> questionDetails;

    @Nullable
    private final String source;

    @Nullable
    private final String stemShoot;

    @Nullable
    private final String subject;

    @Nullable
    private final String title;
    private final long topicId;

    @Nullable
    private final String topicName;

    public NextReviewQuestionResult() {
        this(0L, 0, 0L, null, null, null, null, null, null, null, null, false, false, false, null, null, 65535, null);
    }

    public static /* synthetic */ NextReviewQuestionResult copy$default(NextReviewQuestionResult nextReviewQuestionResult, long j7, int i, long j8, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z8, boolean z9, boolean z10, MistakeDetail mistakeDetail, List list, int i8, Object obj) {
        long j9 = (i8 & 1) != 0 ? nextReviewQuestionResult.id : j7;
        return nextReviewQuestionResult.copy(j9, (i8 & 2) != 0 ? nextReviewQuestionResult.itemId : i, (i8 & 4) != 0 ? nextReviewQuestionResult.topicId : j8, (i8 & 8) != 0 ? nextReviewQuestionResult.subject : str, (i8 & 16) != 0 ? nextReviewQuestionResult.topicName : str2, (i8 & 32) != 0 ? nextReviewQuestionResult.examName : str3, (i8 & 64) != 0 ? nextReviewQuestionResult.source : str4, (i8 & 128) != 0 ? nextReviewQuestionResult.title : str5, (i8 & 256) != 0 ? nextReviewQuestionResult.name : str6, (i8 & 512) != 0 ? nextReviewQuestionResult.number : str7, (i8 & 1024) != 0 ? nextReviewQuestionResult.stemShoot : str8, (i8 & 2048) != 0 ? nextReviewQuestionResult.isCustomMistake : z8, (i8 & 4096) != 0 ? nextReviewQuestionResult.isRelatedQstGroup : z9, (i8 & 8192) != 0 ? nextReviewQuestionResult.hasStem : z10, (i8 & 16384) != 0 ? nextReviewQuestionResult.questionDetail : mistakeDetail, (i8 & 32768) != 0 ? nextReviewQuestionResult.questionDetails : list);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final String getNumber() {
        return this.number;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final String getStemShoot() {
        return this.stemShoot;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getIsCustomMistake() {
        return this.isCustomMistake;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getIsRelatedQstGroup() {
        return this.isRelatedQstGroup;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getHasStem() {
        return this.hasStem;
    }

    @Nullable
    /* renamed from: component15, reason: from getter */
    public final MistakeDetail getQuestionDetail() {
        return this.questionDetail;
    }

    @Nullable
    public final List<MistakeDetail> component16() {
        return this.questionDetails;
    }

    /* renamed from: component2, reason: from getter */
    public final int getItemId() {
        return this.itemId;
    }

    /* renamed from: component3, reason: from getter */
    public final long getTopicId() {
        return this.topicId;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getSubject() {
        return this.subject;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getTopicName() {
        return this.topicName;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getExamName() {
        return this.examName;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final NextReviewQuestionResult copy(long id, int itemId, long topicId, @Nullable String subject, @Nullable String topicName, @Nullable String examName, @Nullable String source, @Nullable String title, @Nullable String name, @Nullable String number, @Nullable String stemShoot, boolean isCustomMistake, boolean isRelatedQstGroup, boolean hasStem, @Nullable MistakeDetail questionDetail, @Nullable List<MistakeDetail> questionDetails) {
        return new NextReviewQuestionResult(id, itemId, topicId, subject, topicName, examName, source, title, name, number, stemShoot, isCustomMistake, isRelatedQstGroup, hasStem, questionDetail, questionDetails);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NextReviewQuestionResult)) {
            return false;
        }
        NextReviewQuestionResult nextReviewQuestionResult = (NextReviewQuestionResult) other;
        return this.id == nextReviewQuestionResult.id && this.itemId == nextReviewQuestionResult.itemId && this.topicId == nextReviewQuestionResult.topicId && AbstractC5830k.m5325b(this.subject, nextReviewQuestionResult.subject) && AbstractC5830k.m5325b(this.topicName, nextReviewQuestionResult.topicName) && AbstractC5830k.m5325b(this.examName, nextReviewQuestionResult.examName) && AbstractC5830k.m5325b(this.source, nextReviewQuestionResult.source) && AbstractC5830k.m5325b(this.title, nextReviewQuestionResult.title) && AbstractC5830k.m5325b(this.name, nextReviewQuestionResult.name) && AbstractC5830k.m5325b(this.number, nextReviewQuestionResult.number) && AbstractC5830k.m5325b(this.stemShoot, nextReviewQuestionResult.stemShoot) && this.isCustomMistake == nextReviewQuestionResult.isCustomMistake && this.isRelatedQstGroup == nextReviewQuestionResult.isRelatedQstGroup && this.hasStem == nextReviewQuestionResult.hasStem && AbstractC5830k.m5325b(this.questionDetail, nextReviewQuestionResult.questionDetail) && AbstractC5830k.m5325b(this.questionDetails, nextReviewQuestionResult.questionDetails);
    }

    @Nullable
    public final String getExamName() {
        return this.examName;
    }

    public final boolean getHasStem() {
        return this.hasStem;
    }

    public final long getId() {
        return this.id;
    }

    public final int getItemId() {
        return this.itemId;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getNumber() {
        return this.number;
    }

    @Nullable
    public final MistakeDetail getQuestionDetail() {
        return this.questionDetail;
    }

    @Nullable
    public final List<MistakeDetail> getQuestionDetails() {
        return this.questionDetails;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x001f A[PHI: r0
      0x001f: PHI (r0v4 java.lang.String) = (r0v2 java.lang.String), (r0v5 java.lang.String) binds: [B:22:0x0029, B:16:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
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
            if (r0 == 0) goto L10
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
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.mistake.entity.resp.NextReviewQuestionResult.getRealTitle():java.lang.String"); // DEX body: android/错题本/smali_classes3/com/zykj/mistake/entity/resp/NextReviewQuestionResult.smali:1439
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
    public final String getSubject() {
        return this.subject;
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

    public int hashCode() {
        int iM897B = AbstractC0584a.m897B(this.topicId, AbstractC0584a.m902c(this.itemId, Long.hashCode(this.id) * 31, 31), 31);
        String str = this.subject;
        int iHashCode = (iM897B + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.topicName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.examName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.source;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.title;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.name;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.number;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.stemShoot;
        int iM908i = AbstractC0584a.m908i(this.hasStem, AbstractC0584a.m908i(this.isRelatedQstGroup, AbstractC0584a.m908i(this.isCustomMistake, (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31, 31), 31), 31);
        MistakeDetail mistakeDetail = this.questionDetail;
        int iHashCode8 = (iM908i + (mistakeDetail == null ? 0 : mistakeDetail.hashCode())) * 31;
        List<MistakeDetail> list = this.questionDetails;
        return iHashCode8 + (list != null ? list.hashCode() : 0);
    }

    public final boolean isCustomMistake() {
        return this.isCustomMistake;
    }

    public final boolean isRelatedQstGroup() {
        return this.isRelatedQstGroup;
    }

    @NotNull
    public final C6386e toNavItem() {
        int i = this.itemId;
        Integer numValueOf = Integer.valueOf(i);
        if (i <= 0) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : (int) this.id;
        long j7 = this.topicId;
        String str = this.subject;
        if (str == null) {
            str = "";
        }
        if (AbstractC5855p.m5382P(str) && (str = this.topicName) == null) {
            str = "";
        }
        String str2 = str;
        String realTitle = getRealTitle();
        String str3 = this.title;
        String str4 = str3 == null ? "" : str3;
        String str5 = this.stemShoot;
        return new C6386e(iIntValue, j7, str2, realTitle, str4, str5 == null ? "" : str5, this.isCustomMistake, this.isRelatedQstGroup, this.hasStem, (List) null, 1536);
    }

    @NotNull
    public String toString() {
        long j7 = this.id;
        int i = this.itemId;
        long j8 = this.topicId;
        String str = this.subject;
        String str2 = this.topicName;
        String str3 = this.examName;
        String str4 = this.source;
        String str5 = this.title;
        String str6 = this.name;
        String str7 = this.number;
        String str8 = this.stemShoot;
        boolean z8 = this.isCustomMistake;
        boolean z9 = this.isRelatedQstGroup;
        boolean z10 = this.hasStem;
        MistakeDetail mistakeDetail = this.questionDetail;
        List<MistakeDetail> list = this.questionDetails;
        StringBuilder sb = new StringBuilder("NextReviewQuestionResult(id=");
        sb.append(j7);
        sb.append(", itemId=");
        sb.append(i);
        sb.append(", topicId=");
        sb.append(j8);
        sb.append(", subject=");
        AbstractC1923c.m1060x(sb, str, ", topicName=", str2, ", examName=");
        AbstractC1923c.m1060x(sb, str3, ", source=", str4, ", title=");
        AbstractC1923c.m1060x(sb, str5, ", name=", str6, ", number=");
        AbstractC1923c.m1060x(sb, str7, ", stemShoot=", str8, ", isCustomMistake=");
        AbstractC1923c.m1058v(", isRelatedQstGroup=", ", hasStem=", sb, z8, z9);
        sb.append(z10);
        sb.append(", questionDetail=");
        sb.append(mistakeDetail);
        sb.append(", questionDetails=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public NextReviewQuestionResult(long j7, int i, long j8, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, boolean z8, boolean z9, boolean z10, @Nullable MistakeDetail mistakeDetail, @Nullable List<MistakeDetail> list) {
        this.id = j7;
        this.itemId = i;
        this.topicId = j8;
        this.subject = str;
        this.topicName = str2;
        this.examName = str3;
        this.source = str4;
        this.title = str5;
        this.name = str6;
        this.number = str7;
        this.stemShoot = str8;
        this.isCustomMistake = z8;
        this.isRelatedQstGroup = z9;
        this.hasStem = z10;
        this.questionDetail = mistakeDetail;
        this.questionDetails = list;
    }

    public /* synthetic */ NextReviewQuestionResult(long j7, int i, long j8, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z8, boolean z9, boolean z10, MistakeDetail mistakeDetail, List list, int i8, AbstractC5824e abstractC5824e) {
        this((i8 & 1) != 0 ? 0L : j7, (i8 & 2) != 0 ? 0 : i, (i8 & 4) == 0 ? j8 : 0L, (i8 & 8) != 0 ? "" : str, (i8 & 16) != 0 ? "" : str2, (i8 & 32) != 0 ? "" : str3, (i8 & 64) != 0 ? "" : str4, (i8 & 128) != 0 ? "" : str5, (i8 & 256) != 0 ? "" : str6, (i8 & 512) != 0 ? "" : str7, (i8 & 1024) == 0 ? str8 : "", (i8 & 2048) != 0 ? false : z8, (i8 & 4096) != 0 ? false : z9, (i8 & 8192) != 0 ? false : z10, (i8 & 16384) != 0 ? null : mistakeDetail, (i8 & 32768) != 0 ? null : list);
    }
}
