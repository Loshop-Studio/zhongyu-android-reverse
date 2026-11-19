package com.zykj.mistake.entity.resp;

import android.view.serialization.ClassDiscriminatorModeKt;
import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0007\u0018\u00002\u00020\u0001:\u0006qrstuvB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001a\u0010\u0010\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR*\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u001a0 j\b\u0012\u0004\u0012\u00020\u001a`!X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u001c\"\u0004\b(\u0010\u001eR\u001a\u0010)\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0016\"\u0004\b+\u0010\u0018R*\u0010,\u001a\u0012\u0012\u0004\u0012\u00020-0 j\b\u0012\u0004\u0012\u00020-`!X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010#\"\u0004\b/\u0010%R*\u00100\u001a\u0012\u0012\u0004\u0012\u0002010 j\b\u0012\u0004\u0012\u000201`!X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010#\"\u0004\b3\u0010%R\u001a\u00104\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u0016\"\u0004\b6\u0010\u0018R\u001a\u00107\u001a\u000208X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R \u0010=\u001a\b\u0012\u0004\u0012\u00020?0>X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR \u0010D\u001a\b\u0012\u0004\u0012\u00020E0>X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010A\"\u0004\bG\u0010CR \u0010H\u001a\b\u0012\u0004\u0012\u00020E0>X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010A\"\u0004\bJ\u0010CR\"\u0010K\u001a\n\u0012\u0004\u0012\u00020L\u0018\u00010>X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010A\"\u0004\bN\u0010CR\"\u0010O\u001a\n\u0012\u0004\u0012\u00020L\u0018\u00010>X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010A\"\u0004\bQ\u0010CR\u001a\u0010R\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010\u0016\"\u0004\bT\u0010\u0018R\u001a\u0010U\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010\u0016\"\u0004\bW\u0010\u0018R\u001a\u0010X\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bY\u0010\u0016\"\u0004\bZ\u0010\u0018R*\u0010[\u001a\u0012\u0012\u0004\u0012\u00020\\0 j\b\u0012\u0004\u0012\u00020\\`!X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b]\u0010#\"\u0004\b^\u0010%R\"\u0010_\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010>X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b`\u0010A\"\u0004\ba\u0010CR\u001c\u0010b\u001a\u0004\u0018\u00010\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bc\u0010\u001c\"\u0004\bd\u0010\u001eR\"\u0010e\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010>X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bf\u0010A\"\u0004\bg\u0010CR\u001c\u0010h\u001a\u0004\u0018\u00010\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bi\u0010\u001c\"\u0004\bj\u0010\u001eR\u001a\u0010k\u001a\u000208X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bk\u0010:\"\u0004\bl\u0010<R\u001a\u0010m\u001a\u000208X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bm\u0010:\"\u0004\bn\u0010<R\u001a\u0010o\u001a\u000208X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bo\u0010:\"\u0004\bp\u0010<¨\u0006w"}, m5110d2 = {"Lcom/zykj/mistake/entity/resp/MistakeDetail;", "", "<init>", "()V", "itemId", "", "getItemId", "()J", "setItemId", "(J)V", "bookId", "getBookId", "setBookId", "examId", "getExamId", "setExamId", "questionId", "getQuestionId", "setQuestionId", "number", "", "getNumber", "()I", "setNumber", "(I)V", "qstPath", "", "getQstPath", "()Ljava/lang/String;", "setQstPath", "(Ljava/lang/String;)V", "extraStems", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getExtraStems", "()Ljava/util/ArrayList;", "setExtraStems", "(Ljava/util/ArrayList;)V", "attachments", "getAttachments", "setAttachments", "itemType", "getItemType", "setItemType", "answerInfos", "Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;", "getAnswerInfos", "setAnswerInfos", "qstFlows", "Lcom/zykj/mistake/entity/resp/MistakeDetail$QstFlowBean;", "getQstFlows", "setQstFlows", "revisingResult", "getRevisingResult", "setRevisingResult", "revisingAnswerd", "", "getRevisingAnswerd", "()Z", "setRevisingAnswerd", "(Z)V", "lastRoundRevisingRecords", "", "Lcom/zykj/mistake/entity/resp/MistakeDetail$RevisingRecord;", "getLastRoundRevisingRecords", "()Ljava/util/List;", "setLastRoundRevisingRecords", "(Ljava/util/List;)V", "microClassToQuestionList", "Lcom/zykj/mistake/entity/resp/MistakeDetail$QstMicroLessonBean;", "getMicroClassToQuestionList", "setMicroClassToQuestionList", "microClassToStudentList", "getMicroClassToStudentList", "setMicroClassToStudentList", "typicalErrorAnswers", "Lcom/zykj/mistake/entity/resp/MistakeDetail$QstAnswerBean;", "getTypicalErrorAnswers", "setTypicalErrorAnswers", "typicalRightAnswers", "getTypicalRightAnswers", "setTypicalRightAnswers", "diff", "getDiff", "setDiff", "attainedLevel", "getAttainedLevel", "setAttainedLevel", "errorReason", "getErrorReason", "setErrorReason", "mistakeTags", "Lcom/zykj/mistake/entity/resp/CustomTagInfo;", "getMistakeTags", "setMistakeTags", "collectionIds", "getCollectionIds", "setCollectionIds", "note", "getNote", "setNote", "pictureNote", "getPictureNote", "setPictureNote", "draft", "getDraft", "setDraft", "isShowAnswer", "setShowAnswer", "isShowMicroLesson", "setShowMicroLesson", "isInReviewState", "setInReviewState", "AnswerListBean", "RevisingRecord", "QstFlowBean", "SubQuestionsBean", "QstMicroLessonBean", "QstAnswerBean", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class MistakeDetail {
    public static final int $stable = 8;
    private int attainedLevel;
    private long bookId;

    @Nullable
    private List<Integer> collectionIds;
    private int diff;

    @Nullable
    private String draft;
    private int errorReason;
    private long examId;
    private boolean isInReviewState;
    private boolean isShowAnswer;
    private boolean isShowMicroLesson;
    private long itemId;
    private int itemType;

    @Nullable
    private String note;
    private int number;

    @Nullable
    private List<String> pictureNote;
    private long questionId;
    private boolean revisingAnswerd;
    private int revisingResult;

    @NotNull
    private String qstPath = "";

    @NotNull
    private ArrayList<String> extraStems = new ArrayList<>();

    @NotNull
    private String attachments = "";

    @NotNull
    private ArrayList<AnswerListBean> answerInfos = new ArrayList<>();

    @NotNull
    private ArrayList<QstFlowBean> qstFlows = new ArrayList<>();

    @NotNull
    private List<RevisingRecord> lastRoundRevisingRecords = EmptyList.INSTANCE;

    @NotNull
    private List<QstMicroLessonBean> microClassToQuestionList = new ArrayList();

    @NotNull
    private List<QstMicroLessonBean> microClassToStudentList = new ArrayList();

    @Nullable
    private List<QstAnswerBean> typicalErrorAnswers = new ArrayList();

    @Nullable
    private List<QstAnswerBean> typicalRightAnswers = new ArrayList();

    @NotNull
    private ArrayList<CustomTagInfo> mistakeTags = new ArrayList<>();

    @StabilityInferred(parameters = 0)
    @Metadata(m5109d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001a\u0010\u0013\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001a\u0010\u0016\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000fR\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010 \u001a\u0004\u0018\u00010!X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\r\"\u0004\b(\u0010\u000fR\u001e\u0010)\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010.\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001e\u0010/\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010.\u001a\u0004\b0\u0010+\"\u0004\b1\u0010-R*\u00102\u001a\u0012\u0012\u0004\u0012\u00020\u000503j\b\u0012\u0004\u0012\u00020\u0005`4X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R*\u00109\u001a\u0012\u0012\u0004\u0012\u00020\u000503j\b\u0012\u0004\u0012\u00020\u0005`4X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u00106\"\u0004\b;\u00108R*\u0010<\u001a\u0012\u0012\u0004\u0012\u00020\u000503j\b\u0012\u0004\u0012\u00020\u0005`4X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u00106\"\u0004\b>\u00108R*\u0010?\u001a\u0012\u0012\u0004\u0012\u00020\u000503j\b\u0012\u0004\u0012\u00020\u0005`4X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u00106\"\u0004\bA\u00108R\u001c\u0010B\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u0007\"\u0004\bD\u0010\tR\u001c\u0010E\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\u0007\"\u0004\bG\u0010\t¨\u0006H"}, m5110d2 = {"Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;", "", "<init>", "()V", "uuid", "", "getUuid", "()Ljava/lang/String;", "setUuid", "(Ljava/lang/String;)V", "number", "", "getNumber", "()I", "setNumber", "(I)V", "index", "getIndex", "setIndex", "itemType", "getItemType", "setItemType", "revisingResult", "getRevisingResult", "setRevisingResult", "parentRevisingAnswerd", "", "getParentRevisingAnswerd", "()Ljava/lang/Boolean;", "setParentRevisingAnswerd", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "lastRoundRevisingRecord", "Lcom/zykj/mistake/entity/resp/MistakeDetail$RevisingRecord;", "getLastRoundRevisingRecord", "()Lcom/zykj/mistake/entity/resp/MistakeDetail$RevisingRecord;", "setLastRoundRevisingRecord", "(Lcom/zykj/mistake/entity/resp/MistakeDetail$RevisingRecord;)V", "result", "getResult", "setResult", "originResult", "getOriginResult", "()Ljava/lang/Integer;", "setOriginResult", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "taskState", "getTaskState", "setTaskState", "examAnswers", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getExamAnswers", "()Ljava/util/ArrayList;", "setExamAnswers", "(Ljava/util/ArrayList;)V", "examComments", "getExamComments", "setExamComments", "revisingAnswers", "getRevisingAnswers", "setRevisingAnswers", "revisingComments", "getRevisingComments", "setRevisingComments", "examMicroLessonComment", "getExamMicroLessonComment", "setExamMicroLessonComment", "reviseMicroLessonComment", "getReviseMicroLessonComment", "setReviseMicroLessonComment", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class AnswerListBean {
        public static final int $stable = 8;
        private int itemType;

        @Nullable
        private transient RevisingRecord lastRoundRevisingRecord;
        private int number;

        @Nullable
        private Integer originResult;

        @Nullable
        private transient Boolean parentRevisingAnswerd;
        private int result;

        @Nullable
        private Integer taskState;

        @NotNull
        private String uuid = "";

        @NotNull
        private String index = "";
        private int revisingResult = -1;

        @NotNull
        private ArrayList<String> examAnswers = new ArrayList<>();

        @NotNull
        private ArrayList<String> examComments = new ArrayList<>();

        @NotNull
        private ArrayList<String> revisingAnswers = new ArrayList<>();

        @NotNull
        private ArrayList<String> revisingComments = new ArrayList<>();

        @Nullable
        private String examMicroLessonComment = "";

        @Nullable
        private String reviseMicroLessonComment = "";

        @NotNull
        public final ArrayList<String> getExamAnswers() {
            return this.examAnswers;
        }

        @NotNull
        public final ArrayList<String> getExamComments() {
            return this.examComments;
        }

        @Nullable
        public final String getExamMicroLessonComment() {
            return this.examMicroLessonComment;
        }

        @NotNull
        public final String getIndex() {
            return this.index;
        }

        public final int getItemType() {
            return this.itemType;
        }

        @Nullable
        public final RevisingRecord getLastRoundRevisingRecord() {
            return this.lastRoundRevisingRecord;
        }

        public final int getNumber() {
            return this.number;
        }

        @Nullable
        public final Integer getOriginResult() {
            return this.originResult;
        }

        @Nullable
        public final Boolean getParentRevisingAnswerd() {
            return this.parentRevisingAnswerd;
        }

        public final int getResult() {
            return this.result;
        }

        @Nullable
        public final String getReviseMicroLessonComment() {
            return this.reviseMicroLessonComment;
        }

        @NotNull
        public final ArrayList<String> getRevisingAnswers() {
            return this.revisingAnswers;
        }

        @NotNull
        public final ArrayList<String> getRevisingComments() {
            return this.revisingComments;
        }

        public final int getRevisingResult() {
            return this.revisingResult;
        }

        @Nullable
        public final Integer getTaskState() {
            return this.taskState;
        }

        @NotNull
        public final String getUuid() {
            return this.uuid;
        }

        public final void setExamAnswers(@NotNull ArrayList<String> arrayList) {
            AbstractC5830k.m5330g(arrayList, "<set-?>");
            this.examAnswers = arrayList;
        }

        public final void setExamComments(@NotNull ArrayList<String> arrayList) {
            AbstractC5830k.m5330g(arrayList, "<set-?>");
            this.examComments = arrayList;
        }

        public final void setExamMicroLessonComment(@Nullable String str) {
            this.examMicroLessonComment = str;
        }

        public final void setIndex(@NotNull String str) {
            AbstractC5830k.m5330g(str, "<set-?>");
            this.index = str;
        }

        public final void setItemType(int i) {
            this.itemType = i;
        }

        public final void setLastRoundRevisingRecord(@Nullable RevisingRecord revisingRecord) {
            this.lastRoundRevisingRecord = revisingRecord;
        }

        public final void setNumber(int i) {
            this.number = i;
        }

        public final void setOriginResult(@Nullable Integer num) {
            this.originResult = num;
        }

        public final void setParentRevisingAnswerd(@Nullable Boolean bool) {
            this.parentRevisingAnswerd = bool;
        }

        public final void setResult(int i) {
            this.result = i;
        }

        public final void setReviseMicroLessonComment(@Nullable String str) {
            this.reviseMicroLessonComment = str;
        }

        public final void setRevisingAnswers(@NotNull ArrayList<String> arrayList) {
            AbstractC5830k.m5330g(arrayList, "<set-?>");
            this.revisingAnswers = arrayList;
        }

        public final void setRevisingComments(@NotNull ArrayList<String> arrayList) {
            AbstractC5830k.m5330g(arrayList, "<set-?>");
            this.revisingComments = arrayList;
        }

        public final void setRevisingResult(int i) {
            this.revisingResult = i;
        }

        public final void setTaskState(@Nullable Integer num) {
            this.taskState = num;
        }

        public final void setUuid(@NotNull String str) {
            AbstractC5830k.m5330g(str, "<set-?>");
            this.uuid = str;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m5109d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R*\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR*\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013¨\u0006\u0017"}, m5110d2 = {"Lcom/zykj/mistake/entity/resp/MistakeDetail$QstAnswerBean;", "", "<init>", "()V", "answers", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "getAnswers", "()Ljava/util/ArrayList;", "setAnswers", "(Ljava/util/ArrayList;)V", "comments", "getComments", "setComments", "userName", "getUserName", "()Ljava/lang/String;", "setUserName", "(Ljava/lang/String;)V", "fullname", "getFullname", "setFullname", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class QstAnswerBean {
        public static final int $stable = 8;

        @NotNull
        private ArrayList<String> answers = new ArrayList<>();

        @NotNull
        private ArrayList<String> comments = new ArrayList<>();

        @NotNull
        private String userName = "";

        @NotNull
        private String fullname = "";

        @NotNull
        public final ArrayList<String> getAnswers() {
            return this.answers;
        }

        @NotNull
        public final ArrayList<String> getComments() {
            return this.comments;
        }

        @NotNull
        public final String getFullname() {
            return this.fullname;
        }

        @NotNull
        public final String getUserName() {
            return this.userName;
        }

        public final void setAnswers(@NotNull ArrayList<String> arrayList) {
            AbstractC5830k.m5330g(arrayList, "<set-?>");
            this.answers = arrayList;
        }

        public final void setComments(@NotNull ArrayList<String> arrayList) {
            AbstractC5830k.m5330g(arrayList, "<set-?>");
            this.comments = arrayList;
        }

        public final void setFullname(@NotNull String str) {
            AbstractC5830k.m5330g(str, "<set-?>");
            this.fullname = str;
        }

        public final void setUserName(@NotNull String str) {
            AbstractC5830k.m5330g(str, "<set-?>");
            this.userName = str;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m5109d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0011\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\u001a\u0010\u0019\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0007\"\u0004\b\u001b\u0010\tR\u001a\u0010\u001c\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\r\"\u0004\b\u001e\u0010\u000fR\u001a\u0010\u001f\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0007\"\u0004\b!\u0010\tR\"\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010#X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010(\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010#X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010%\"\u0004\b+\u0010'¨\u0006,"}, m5110d2 = {"Lcom/zykj/mistake/entity/resp/MistakeDetail$QstFlowBean;", "", "<init>", "()V", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "", "getType", "()I", "setType", "(I)V", "content", "", "getContent", "()Ljava/lang/String;", "setContent", "(Ljava/lang/String;)V", "score", "", "getScore", "()D", "setScore", "(D)V", "missScore", "getMissScore", "setMissScore", "number", "getNumber", "setNumber", "uuid", "getUuid", "setUuid", "qstType", "getQstType", "setQstType", "options", "", "getOptions", "()Ljava/util/List;", "setOptions", "(Ljava/util/List;)V", "subQuestions", "Lcom/zykj/mistake/entity/resp/MistakeDetail$SubQuestionsBean;", "getSubQuestions", "setSubQuestions", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class QstFlowBean {
        public static final int $stable = 8;

        @Nullable
        private String content;
        private double missScore;
        private int number;

        @Nullable
        private List<String> options;
        private int qstType;
        private double score;

        @Nullable
        private List<SubQuestionsBean> subQuestions;
        private int type;

        @NotNull
        private String uuid = "";

        @Nullable
        public final String getContent() {
            return this.content;
        }

        public final double getMissScore() {
            return this.missScore;
        }

        public final int getNumber() {
            return this.number;
        }

        @Nullable
        public final List<String> getOptions() {
            return this.options;
        }

        public final int getQstType() {
            return this.qstType;
        }

        public final double getScore() {
            return this.score;
        }

        @Nullable
        public final List<SubQuestionsBean> getSubQuestions() {
            return this.subQuestions;
        }

        public final int getType() {
            return this.type;
        }

        @NotNull
        public final String getUuid() {
            return this.uuid;
        }

        public final void setContent(@Nullable String str) {
            this.content = str;
        }

        public final void setMissScore(double d9) {
            this.missScore = d9;
        }

        public final void setNumber(int i) {
            this.number = i;
        }

        public final void setOptions(@Nullable List<String> list) {
            this.options = list;
        }

        public final void setQstType(int i) {
            this.qstType = i;
        }

        public final void setScore(double d9) {
            this.score = d9;
        }

        public final void setSubQuestions(@Nullable List<SubQuestionsBean> list) {
            this.subQuestions = list;
        }

        public final void setType(int i) {
            this.type = i;
        }

        public final void setUuid(@NotNull String str) {
            AbstractC5830k.m5330g(str, "<set-?>");
            this.uuid = str;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m5109d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000fR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000fR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\r\"\u0004\b\u001e\u0010\u000fR\u001e\u0010\u001f\u001a\u0004\u0018\u00010 X\u0086\u000e¢\u0006\u0010\n\u0002\u0010$\u001a\u0004\b\u001f\u0010!\"\u0004\b\"\u0010#R\u001e\u0010%\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010*\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006+"}, m5110d2 = {"Lcom/zykj/mistake/entity/resp/MistakeDetail$QstMicroLessonBean;", "", "<init>", "()V", "id", "", "getId", "()J", "setId", "(J)V", HintConstants.AUTOFILL_HINT_NAME, "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "address", "getAddress", "setAddress", "snapshot", "getSnapshot", "setSnapshot", "creationTime", "getCreationTime", "setCreationTime", "createTime", "getCreateTime", "setCreateTime", "time", "getTime", "setTime", "isRevising", "", "()Ljava/lang/Boolean;", "setRevising", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "creatorUserId", "getCreatorUserId", "()Ljava/lang/Long;", "setCreatorUserId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class QstMicroLessonBean {
        public static final int $stable = 8;

        @Nullable
        private Long creatorUserId;
        private long id;

        @Nullable
        private Boolean isRevising;

        @NotNull
        private String name = "";

        @NotNull
        private String address = "";

        @NotNull
        private String snapshot = "";

        @Nullable
        private String creationTime = "";

        @Nullable
        private String createTime = "";

        @Nullable
        private String time = "";

        @NotNull
        public final String getAddress() {
            return this.address;
        }

        @Nullable
        public final String getCreateTime() {
            return this.createTime;
        }

        @Nullable
        public final String getCreationTime() {
            return this.creationTime;
        }

        @Nullable
        public final Long getCreatorUserId() {
            return this.creatorUserId;
        }

        public final long getId() {
            return this.id;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        @NotNull
        public final String getSnapshot() {
            return this.snapshot;
        }

        @Nullable
        public final String getTime() {
            return this.time;
        }

        @Nullable
        /* renamed from: isRevising, reason: from getter */
        public final Boolean getIsRevising() {
            return this.isRevising;
        }

        public final void setAddress(@NotNull String str) {
            AbstractC5830k.m5330g(str, "<set-?>");
            this.address = str;
        }

        public final void setCreateTime(@Nullable String str) {
            this.createTime = str;
        }

        public final void setCreationTime(@Nullable String str) {
            this.creationTime = str;
        }

        public final void setCreatorUserId(@Nullable Long l) {
            this.creatorUserId = l;
        }

        public final void setId(long j7) {
            this.id = j7;
        }

        public final void setName(@NotNull String str) {
            AbstractC5830k.m5330g(str, "<set-?>");
            this.name = str;
        }

        public final void setRevising(@Nullable Boolean bool) {
            this.isRevising = bool;
        }

        public final void setSnapshot(@NotNull String str) {
            AbstractC5830k.m5330g(str, "<set-?>");
            this.snapshot = str;
        }

        public final void setTime(@Nullable String str) {
            this.time = str;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m5109d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR*\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u000bj\b\u0012\u0004\u0012\u00020\u0005`\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R*\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u000bj\b\u0012\u0004\u0012\u00020\u0005`\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m5110d2 = {"Lcom/zykj/mistake/entity/resp/MistakeDetail$RevisingRecord;", "", "<init>", "()V", "uuid", "", "getUuid", "()Ljava/lang/String;", "setUuid", "(Ljava/lang/String;)V", "revisingAnswers", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getRevisingAnswers", "()Ljava/util/ArrayList;", "setRevisingAnswers", "(Ljava/util/ArrayList;)V", "revisingComments", "getRevisingComments", "setRevisingComments", "result", "", "getResult", "()I", "setResult", "(I)V", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class RevisingRecord {
        public static final int $stable = 8;
        private int result;

        @NotNull
        private String uuid = "";

        @NotNull
        private ArrayList<String> revisingAnswers = new ArrayList<>();

        @NotNull
        private ArrayList<String> revisingComments = new ArrayList<>();

        public final int getResult() {
            return this.result;
        }

        @NotNull
        public final ArrayList<String> getRevisingAnswers() {
            return this.revisingAnswers;
        }

        @NotNull
        public final ArrayList<String> getRevisingComments() {
            return this.revisingComments;
        }

        @NotNull
        public final String getUuid() {
            return this.uuid;
        }

        public final void setResult(int i) {
            this.result = i;
        }

        public final void setRevisingAnswers(@NotNull ArrayList<String> arrayList) {
            AbstractC5830k.m5330g(arrayList, "<set-?>");
            this.revisingAnswers = arrayList;
        }

        public final void setRevisingComments(@NotNull ArrayList<String> arrayList) {
            AbstractC5830k.m5330g(arrayList, "<set-?>");
            this.revisingComments = arrayList;
        }

        public final void setUuid(@NotNull String str) {
            AbstractC5830k.m5330g(str, "<set-?>");
            this.uuid = str;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m5109d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u001a\u0010\u0018\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0007\"\u0004\b\u001a\u0010\tR\u001a\u0010\u001b\u001a\u00020\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0007\"\u0004\b#\u0010\tR\u001c\u0010$\u001a\u0004\u0018\u00010\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\f\"\u0004\b&\u0010\u000eR\"\u0010'\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010(X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u0006-"}, m5110d2 = {"Lcom/zykj/mistake/entity/resp/MistakeDetail$SubQuestionsBean;", "", "<init>", "()V", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "", "getType", "()I", "setType", "(I)V", "content", "getContent", "()Ljava/lang/Object;", "setContent", "(Ljava/lang/Object;)V", "score", "", "getScore", "()D", "setScore", "(D)V", "missScore", "getMissScore", "setMissScore", "number", "getNumber", "setNumber", "uuid", "", "getUuid", "()Ljava/lang/String;", "setUuid", "(Ljava/lang/String;)V", "qstType", "getQstType", "setQstType", "subQuestions", "getSubQuestions", "setSubQuestions", "options", "", "getOptions", "()Ljava/util/List;", "setOptions", "(Ljava/util/List;)V", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class SubQuestionsBean {
        public static final int $stable = 8;

        @Nullable
        private Object content;
        private double missScore;
        private int number;

        @Nullable
        private List<String> options;
        private int qstType;
        private double score;

        @Nullable
        private Object subQuestions;
        private int type;

        @NotNull
        private String uuid = "";

        @Nullable
        public final Object getContent() {
            return this.content;
        }

        public final double getMissScore() {
            return this.missScore;
        }

        public final int getNumber() {
            return this.number;
        }

        @Nullable
        public final List<String> getOptions() {
            return this.options;
        }

        public final int getQstType() {
            return this.qstType;
        }

        public final double getScore() {
            return this.score;
        }

        @Nullable
        public final Object getSubQuestions() {
            return this.subQuestions;
        }

        public final int getType() {
            return this.type;
        }

        @NotNull
        public final String getUuid() {
            return this.uuid;
        }

        public final void setContent(@Nullable Object obj) {
            this.content = obj;
        }

        public final void setMissScore(double d9) {
            this.missScore = d9;
        }

        public final void setNumber(int i) {
            this.number = i;
        }

        public final void setOptions(@Nullable List<String> list) {
            this.options = list;
        }

        public final void setQstType(int i) {
            this.qstType = i;
        }

        public final void setScore(double d9) {
            this.score = d9;
        }

        public final void setSubQuestions(@Nullable Object obj) {
            this.subQuestions = obj;
        }

        public final void setType(int i) {
            this.type = i;
        }

        public final void setUuid(@NotNull String str) {
            AbstractC5830k.m5330g(str, "<set-?>");
            this.uuid = str;
        }
    }

    @NotNull
    public final ArrayList<AnswerListBean> getAnswerInfos() {
        return this.answerInfos;
    }

    @NotNull
    public final String getAttachments() {
        return this.attachments;
    }

    public final int getAttainedLevel() {
        return this.attainedLevel;
    }

    public final long getBookId() {
        return this.bookId;
    }

    @Nullable
    public final List<Integer> getCollectionIds() {
        return this.collectionIds;
    }

    public final int getDiff() {
        return this.diff;
    }

    @Nullable
    public final String getDraft() {
        return this.draft;
    }

    public final int getErrorReason() {
        return this.errorReason;
    }

    public final long getExamId() {
        return this.examId;
    }

    @NotNull
    public final ArrayList<String> getExtraStems() {
        return this.extraStems;
    }

    public final long getItemId() {
        return this.itemId;
    }

    public final int getItemType() {
        return this.itemType;
    }

    @NotNull
    public final List<RevisingRecord> getLastRoundRevisingRecords() {
        return this.lastRoundRevisingRecords;
    }

    @NotNull
    public final List<QstMicroLessonBean> getMicroClassToQuestionList() {
        return this.microClassToQuestionList;
    }

    @NotNull
    public final List<QstMicroLessonBean> getMicroClassToStudentList() {
        return this.microClassToStudentList;
    }

    @NotNull
    public final ArrayList<CustomTagInfo> getMistakeTags() {
        return this.mistakeTags;
    }

    @Nullable
    public final String getNote() {
        return this.note;
    }

    public final int getNumber() {
        return this.number;
    }

    @Nullable
    public final List<String> getPictureNote() {
        return this.pictureNote;
    }

    @NotNull
    public final ArrayList<QstFlowBean> getQstFlows() {
        return this.qstFlows;
    }

    @NotNull
    public final String getQstPath() {
        return this.qstPath;
    }

    public final long getQuestionId() {
        return this.questionId;
    }

    public final boolean getRevisingAnswerd() {
        return this.revisingAnswerd;
    }

    public final int getRevisingResult() {
        return this.revisingResult;
    }

    @Nullable
    public final List<QstAnswerBean> getTypicalErrorAnswers() {
        return this.typicalErrorAnswers;
    }

    @Nullable
    public final List<QstAnswerBean> getTypicalRightAnswers() {
        return this.typicalRightAnswers;
    }

    /* renamed from: isInReviewState, reason: from getter */
    public final boolean getIsInReviewState() {
        return this.isInReviewState;
    }

    /* renamed from: isShowAnswer, reason: from getter */
    public final boolean getIsShowAnswer() {
        return this.isShowAnswer;
    }

    /* renamed from: isShowMicroLesson, reason: from getter */
    public final boolean getIsShowMicroLesson() {
        return this.isShowMicroLesson;
    }

    public final void setAnswerInfos(@NotNull ArrayList<AnswerListBean> arrayList) {
        AbstractC5830k.m5330g(arrayList, "<set-?>");
        this.answerInfos = arrayList;
    }

    public final void setAttachments(@NotNull String str) {
        AbstractC5830k.m5330g(str, "<set-?>");
        this.attachments = str;
    }

    public final void setAttainedLevel(int i) {
        this.attainedLevel = i;
    }

    public final void setBookId(long j7) {
        this.bookId = j7;
    }

    public final void setCollectionIds(@Nullable List<Integer> list) {
        this.collectionIds = list;
    }

    public final void setDiff(int i) {
        this.diff = i;
    }

    public final void setDraft(@Nullable String str) {
        this.draft = str;
    }

    public final void setErrorReason(int i) {
        this.errorReason = i;
    }

    public final void setExamId(long j7) {
        this.examId = j7;
    }

    public final void setExtraStems(@NotNull ArrayList<String> arrayList) {
        AbstractC5830k.m5330g(arrayList, "<set-?>");
        this.extraStems = arrayList;
    }

    public final void setInReviewState(boolean z8) {
        this.isInReviewState = z8;
    }

    public final void setItemId(long j7) {
        this.itemId = j7;
    }

    public final void setItemType(int i) {
        this.itemType = i;
    }

    public final void setLastRoundRevisingRecords(@NotNull List<RevisingRecord> list) {
        AbstractC5830k.m5330g(list, "<set-?>");
        this.lastRoundRevisingRecords = list;
    }

    public final void setMicroClassToQuestionList(@NotNull List<QstMicroLessonBean> list) {
        AbstractC5830k.m5330g(list, "<set-?>");
        this.microClassToQuestionList = list;
    }

    public final void setMicroClassToStudentList(@NotNull List<QstMicroLessonBean> list) {
        AbstractC5830k.m5330g(list, "<set-?>");
        this.microClassToStudentList = list;
    }

    public final void setMistakeTags(@NotNull ArrayList<CustomTagInfo> arrayList) {
        AbstractC5830k.m5330g(arrayList, "<set-?>");
        this.mistakeTags = arrayList;
    }

    public final void setNote(@Nullable String str) {
        this.note = str;
    }

    public final void setNumber(int i) {
        this.number = i;
    }

    public final void setPictureNote(@Nullable List<String> list) {
        this.pictureNote = list;
    }

    public final void setQstFlows(@NotNull ArrayList<QstFlowBean> arrayList) {
        AbstractC5830k.m5330g(arrayList, "<set-?>");
        this.qstFlows = arrayList;
    }

    public final void setQstPath(@NotNull String str) {
        AbstractC5830k.m5330g(str, "<set-?>");
        this.qstPath = str;
    }

    public final void setQuestionId(long j7) {
        this.questionId = j7;
    }

    public final void setRevisingAnswerd(boolean z8) {
        this.revisingAnswerd = z8;
    }

    public final void setRevisingResult(int i) {
        this.revisingResult = i;
    }

    public final void setShowAnswer(boolean z8) {
        this.isShowAnswer = z8;
    }

    public final void setShowMicroLesson(boolean z8) {
        this.isShowMicroLesson = z8;
    }

    public final void setTypicalErrorAnswers(@Nullable List<QstAnswerBean> list) {
        this.typicalErrorAnswers = list;
    }

    public final void setTypicalRightAnswers(@Nullable List<QstAnswerBean> list) {
        this.typicalRightAnswers = list;
    }
}
