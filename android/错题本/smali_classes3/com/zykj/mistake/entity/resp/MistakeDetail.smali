.class public final Lcom/zykj/mistake/entity/resp/MistakeDetail;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;,
        Lcom/zykj/mistake/entity/resp/MistakeDetail$QstAnswerBean;,
        Lcom/zykj/mistake/entity/resp/MistakeDetail$QstFlowBean;,
        Lcom/zykj/mistake/entity/resp/MistakeDetail$QstMicroLessonBean;,
        Lcom/zykj/mistake/entity/resp/MistakeDetail$RevisingRecord;,
        Lcom/zykj/mistake/entity/resp/MistakeDetail$SubQuestionsBean;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u000e\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0018\u0002\n\u0002\u0008\u001b\u0008\u0007\u0018\u00002\u00020\u0001:\u0006qrstuvB\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\"\u0004\u0008\u0008\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000b\u0010\u0007\"\u0004\u0008\u000c\u0010\tR\u001a\u0010\r\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000e\u0010\u0007\"\u0004\u0008\u000f\u0010\tR\u001a\u0010\u0010\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0011\u0010\u0007\"\u0004\u0008\u0012\u0010\tR\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016\"\u0004\u0008\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001b\u0010\u001c\"\u0004\u0008\u001d\u0010\u001eR*\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u001a0 j\u0008\u0012\u0004\u0012\u00020\u001a`!X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\"\u0010#\"\u0004\u0008$\u0010%R\u001a\u0010&\u001a\u00020\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\'\u0010\u001c\"\u0004\u0008(\u0010\u001eR\u001a\u0010)\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008*\u0010\u0016\"\u0004\u0008+\u0010\u0018R*\u0010,\u001a\u0012\u0012\u0004\u0012\u00020-0 j\u0008\u0012\u0004\u0012\u00020-`!X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008.\u0010#\"\u0004\u0008/\u0010%R*\u00100\u001a\u0012\u0012\u0004\u0012\u0002010 j\u0008\u0012\u0004\u0012\u000201`!X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u00082\u0010#\"\u0004\u00083\u0010%R\u001a\u00104\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u00085\u0010\u0016\"\u0004\u00086\u0010\u0018R\u001a\u00107\u001a\u000208X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u00089\u0010:\"\u0004\u0008;\u0010<R \u0010=\u001a\u0008\u0012\u0004\u0012\u00020?0>X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008@\u0010A\"\u0004\u0008B\u0010CR \u0010D\u001a\u0008\u0012\u0004\u0012\u00020E0>X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008F\u0010A\"\u0004\u0008G\u0010CR \u0010H\u001a\u0008\u0012\u0004\u0012\u00020E0>X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008I\u0010A\"\u0004\u0008J\u0010CR\"\u0010K\u001a\n\u0012\u0004\u0012\u00020L\u0018\u00010>X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008M\u0010A\"\u0004\u0008N\u0010CR\"\u0010O\u001a\n\u0012\u0004\u0012\u00020L\u0018\u00010>X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008P\u0010A\"\u0004\u0008Q\u0010CR\u001a\u0010R\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008S\u0010\u0016\"\u0004\u0008T\u0010\u0018R\u001a\u0010U\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008V\u0010\u0016\"\u0004\u0008W\u0010\u0018R\u001a\u0010X\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008Y\u0010\u0016\"\u0004\u0008Z\u0010\u0018R*\u0010[\u001a\u0012\u0012\u0004\u0012\u00020\\0 j\u0008\u0012\u0004\u0012\u00020\\`!X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008]\u0010#\"\u0004\u0008^\u0010%R\"\u0010_\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010>X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008`\u0010A\"\u0004\u0008a\u0010CR\u001c\u0010b\u001a\u0004\u0018\u00010\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008c\u0010\u001c\"\u0004\u0008d\u0010\u001eR\"\u0010e\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010>X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008f\u0010A\"\u0004\u0008g\u0010CR\u001c\u0010h\u001a\u0004\u0018\u00010\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008i\u0010\u001c\"\u0004\u0008j\u0010\u001eR\u001a\u0010k\u001a\u000208X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008k\u0010:\"\u0004\u0008l\u0010<R\u001a\u0010m\u001a\u000208X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008m\u0010:\"\u0004\u0008n\u0010<R\u001a\u0010o\u001a\u000208X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008o\u0010:\"\u0004\u0008p\u0010<\u00a8\u0006w"
    }
    d2 = {
        "Lcom/zykj/mistake/entity/resp/MistakeDetail;",
        "",
        "<init>",
        "()V",
        "itemId",
        "",
        "getItemId",
        "()J",
        "setItemId",
        "(J)V",
        "bookId",
        "getBookId",
        "setBookId",
        "examId",
        "getExamId",
        "setExamId",
        "questionId",
        "getQuestionId",
        "setQuestionId",
        "number",
        "",
        "getNumber",
        "()I",
        "setNumber",
        "(I)V",
        "qstPath",
        "",
        "getQstPath",
        "()Ljava/lang/String;",
        "setQstPath",
        "(Ljava/lang/String;)V",
        "extraStems",
        "Ljava/util/ArrayList;",
        "Lkotlin/collections/ArrayList;",
        "getExtraStems",
        "()Ljava/util/ArrayList;",
        "setExtraStems",
        "(Ljava/util/ArrayList;)V",
        "attachments",
        "getAttachments",
        "setAttachments",
        "itemType",
        "getItemType",
        "setItemType",
        "answerInfos",
        "Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;",
        "getAnswerInfos",
        "setAnswerInfos",
        "qstFlows",
        "Lcom/zykj/mistake/entity/resp/MistakeDetail$QstFlowBean;",
        "getQstFlows",
        "setQstFlows",
        "revisingResult",
        "getRevisingResult",
        "setRevisingResult",
        "revisingAnswerd",
        "",
        "getRevisingAnswerd",
        "()Z",
        "setRevisingAnswerd",
        "(Z)V",
        "lastRoundRevisingRecords",
        "",
        "Lcom/zykj/mistake/entity/resp/MistakeDetail$RevisingRecord;",
        "getLastRoundRevisingRecords",
        "()Ljava/util/List;",
        "setLastRoundRevisingRecords",
        "(Ljava/util/List;)V",
        "microClassToQuestionList",
        "Lcom/zykj/mistake/entity/resp/MistakeDetail$QstMicroLessonBean;",
        "getMicroClassToQuestionList",
        "setMicroClassToQuestionList",
        "microClassToStudentList",
        "getMicroClassToStudentList",
        "setMicroClassToStudentList",
        "typicalErrorAnswers",
        "Lcom/zykj/mistake/entity/resp/MistakeDetail$QstAnswerBean;",
        "getTypicalErrorAnswers",
        "setTypicalErrorAnswers",
        "typicalRightAnswers",
        "getTypicalRightAnswers",
        "setTypicalRightAnswers",
        "diff",
        "getDiff",
        "setDiff",
        "attainedLevel",
        "getAttainedLevel",
        "setAttainedLevel",
        "errorReason",
        "getErrorReason",
        "setErrorReason",
        "mistakeTags",
        "Lcom/zykj/mistake/entity/resp/CustomTagInfo;",
        "getMistakeTags",
        "setMistakeTags",
        "collectionIds",
        "getCollectionIds",
        "setCollectionIds",
        "note",
        "getNote",
        "setNote",
        "pictureNote",
        "getPictureNote",
        "setPictureNote",
        "draft",
        "getDraft",
        "setDraft",
        "isShowAnswer",
        "setShowAnswer",
        "isShowMicroLesson",
        "setShowMicroLesson",
        "isInReviewState",
        "setInReviewState",
        "AnswerListBean",
        "RevisingRecord",
        "QstFlowBean",
        "SubQuestionsBean",
        "QstMicroLessonBean",
        "QstAnswerBean",
        "app_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private answerInfos:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private attachments:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private attainedLevel:I

.field private bookId:J

.field private collectionIds:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private diff:I

.field private draft:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private errorReason:I

.field private examId:J

.field private extraStems:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private isInReviewState:Z

.field private isShowAnswer:Z

.field private isShowMicroLesson:Z

.field private itemId:J

.field private itemType:I

.field private lastRoundRevisingRecords:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/zykj/mistake/entity/resp/MistakeDetail$RevisingRecord;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private microClassToQuestionList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/zykj/mistake/entity/resp/MistakeDetail$QstMicroLessonBean;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private microClassToStudentList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/zykj/mistake/entity/resp/MistakeDetail$QstMicroLessonBean;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private mistakeTags:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/zykj/mistake/entity/resp/CustomTagInfo;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private note:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private number:I

.field private pictureNote:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private qstFlows:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/zykj/mistake/entity/resp/MistakeDetail$QstFlowBean;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private qstPath:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private questionId:J

.field private revisingAnswerd:Z

.field private revisingResult:I

.field private typicalErrorAnswers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/zykj/mistake/entity/resp/MistakeDetail$QstAnswerBean;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private typicalRightAnswers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/zykj/mistake/entity/resp/MistakeDetail$QstAnswerBean;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, ""

    .line 5
    .line 6
    iput-object v0, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail;->qstPath:Ljava/lang/String;

    .line 7
    .line 8
    new-instance v1, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object v1, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail;->extraStems:Ljava/util/ArrayList;

    .line 14
    .line 15
    iput-object v0, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail;->attachments:Ljava/lang/String;

    .line 16
    .line 17
    new-instance v0, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail;->answerInfos:Ljava/util/ArrayList;

    .line 23
    .line 24
    new-instance v0, Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail;->qstFlows:Ljava/util/ArrayList;

    .line 30
    .line 31
    sget-object v0, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 32
    .line 33
    iput-object v0, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail;->lastRoundRevisingRecords:Ljava/util/List;

    .line 34
    .line 35
    new-instance v0, Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 38
    .line 39
    .line 40
    iput-object v0, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail;->microClassToQuestionList:Ljava/util/List;

    .line 41
    .line 42
    new-instance v0, Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 45
    .line 46
    .line 47
    iput-object v0, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail;->microClassToStudentList:Ljava/util/List;

    .line 48
    .line 49
    new-instance v0, Ljava/util/ArrayList;

    .line 50
    .line 51
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 52
    .line 53
    .line 54
    iput-object v0, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail;->typicalErrorAnswers:Ljava/util/List;

    .line 55
    .line 56
    new-instance v0, Ljava/util/ArrayList;

    .line 57
    .line 58
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 59
    .line 60
    .line 61
    iput-object v0, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail;->typicalRightAnswers:Ljava/util/List;

    .line 62
    .line 63
    new-instance v0, Ljava/util/ArrayList;

    .line 64
    .line 65
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 66
    .line 67
    .line 68
    iput-object v0, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail;->mistakeTags:Ljava/util/ArrayList;

    .line 69
    .line 70
    return-void
.end method


# virtual methods
.method public final getAnswerInfos()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail;->answerInfos:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getAttachments()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail;->attachments:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getAttainedLevel()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail;->attainedLevel:I

    .line 2
    .line 3
    return v0
.end method

.method public final getBookId()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail;->bookId:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getCollectionIds()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail;->collectionIds:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getDiff()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail;->diff:I

    .line 2
    .line 3
    return v0
.end method

.method public final getDraft()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail;->draft:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getErrorReason()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail;->errorReason:I

    .line 2
    .line 3
    return v0
.end method

.method public final getExamId()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail;->examId:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getExtraStems()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail;->extraStems:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getItemId()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail;->itemId:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getItemType()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail;->itemType:I

    .line 2
    .line 3
    return v0
.end method

.method public final getLastRoundRevisingRecords()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/mistake/entity/resp/MistakeDetail$RevisingRecord;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail;->lastRoundRevisingRecords:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getMicroClassToQuestionList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/mistake/entity/resp/MistakeDetail$QstMicroLessonBean;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail;->microClassToQuestionList:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getMicroClassToStudentList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/mistake/entity/resp/MistakeDetail$QstMicroLessonBean;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail;->microClassToStudentList:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getMistakeTags()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/zykj/mistake/entity/resp/CustomTagInfo;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail;->mistakeTags:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getNote()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail;->note:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getNumber()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail;->number:I

    .line 2
    .line 3
    return v0
.end method

.method public final getPictureNote()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail;->pictureNote:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getQstFlows()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/zykj/mistake/entity/resp/MistakeDetail$QstFlowBean;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail;->qstFlows:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getQstPath()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail;->qstPath:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getQuestionId()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail;->questionId:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getRevisingAnswerd()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail;->revisingAnswerd:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getRevisingResult()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail;->revisingResult:I

    .line 2
    .line 3
    return v0
.end method

.method public final getTypicalErrorAnswers()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/mistake/entity/resp/MistakeDetail$QstAnswerBean;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail;->typicalErrorAnswers:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getTypicalRightAnswers()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/mistake/entity/resp/MistakeDetail$QstAnswerBean;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail;->typicalRightAnswers:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final isInReviewState()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail;->isInReviewState:Z

    .line 2
    .line 3
    return v0
.end method

.method public final isShowAnswer()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail;->isShowAnswer:Z

    .line 2
    .line 3
    return v0
.end method

.method public final isShowMicroLesson()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail;->isShowMicroLesson:Z

    .line 2
    .line 3
    return v0
.end method

.method public final setAnswerInfos(Ljava/util/ArrayList;)V
    .locals 1
    .param p1    # Ljava/util/ArrayList;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail;->answerInfos:Ljava/util/ArrayList;

    .line 7
    .line 8
    return-void
.end method

.method public final setAttachments(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail;->attachments:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method

.method public final setAttainedLevel(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail;->attainedLevel:I

    .line 2
    .line 3
    return-void
.end method

.method public final setBookId(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail;->bookId:J

    .line 2
    .line 3
    return-void
.end method

.method public final setCollectionIds(Ljava/util/List;)V
    .locals 0
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail;->collectionIds:Ljava/util/List;

    .line 2
    .line 3
    return-void
.end method

.method public final setDiff(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail;->diff:I

    .line 2
    .line 3
    return-void
.end method

.method public final setDraft(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail;->draft:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setErrorReason(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail;->errorReason:I

    .line 2
    .line 3
    return-void
.end method

.method public final setExamId(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail;->examId:J

    .line 2
    .line 3
    return-void
.end method

.method public final setExtraStems(Ljava/util/ArrayList;)V
    .locals 1
    .param p1    # Ljava/util/ArrayList;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail;->extraStems:Ljava/util/ArrayList;

    .line 7
    .line 8
    return-void
.end method

.method public final setInReviewState(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail;->isInReviewState:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setItemId(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail;->itemId:J

    .line 2
    .line 3
    return-void
.end method

.method public final setItemType(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail;->itemType:I

    .line 2
    .line 3
    return-void
.end method

.method public final setLastRoundRevisingRecords(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/zykj/mistake/entity/resp/MistakeDetail$RevisingRecord;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail;->lastRoundRevisingRecords:Ljava/util/List;

    .line 7
    .line 8
    return-void
.end method

.method public final setMicroClassToQuestionList(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/zykj/mistake/entity/resp/MistakeDetail$QstMicroLessonBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail;->microClassToQuestionList:Ljava/util/List;

    .line 7
    .line 8
    return-void
.end method

.method public final setMicroClassToStudentList(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/zykj/mistake/entity/resp/MistakeDetail$QstMicroLessonBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail;->microClassToStudentList:Ljava/util/List;

    .line 7
    .line 8
    return-void
.end method

.method public final setMistakeTags(Ljava/util/ArrayList;)V
    .locals 1
    .param p1    # Ljava/util/ArrayList;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/zykj/mistake/entity/resp/CustomTagInfo;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail;->mistakeTags:Ljava/util/ArrayList;

    .line 7
    .line 8
    return-void
.end method

.method public final setNote(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail;->note:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setNumber(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail;->number:I

    .line 2
    .line 3
    return-void
.end method

.method public final setPictureNote(Ljava/util/List;)V
    .locals 0
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail;->pictureNote:Ljava/util/List;

    .line 2
    .line 3
    return-void
.end method

.method public final setQstFlows(Ljava/util/ArrayList;)V
    .locals 1
    .param p1    # Ljava/util/ArrayList;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/zykj/mistake/entity/resp/MistakeDetail$QstFlowBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail;->qstFlows:Ljava/util/ArrayList;

    .line 7
    .line 8
    return-void
.end method

.method public final setQstPath(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail;->qstPath:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method

.method public final setQuestionId(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail;->questionId:J

    .line 2
    .line 3
    return-void
.end method

.method public final setRevisingAnswerd(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail;->revisingAnswerd:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setRevisingResult(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail;->revisingResult:I

    .line 2
    .line 3
    return-void
.end method

.method public final setShowAnswer(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail;->isShowAnswer:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setShowMicroLesson(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail;->isShowMicroLesson:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setTypicalErrorAnswers(Ljava/util/List;)V
    .locals 0
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/zykj/mistake/entity/resp/MistakeDetail$QstAnswerBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail;->typicalErrorAnswers:Ljava/util/List;

    .line 2
    .line 3
    return-void
.end method

.method public final setTypicalRightAnswers(Ljava/util/List;)V
    .locals 0
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/zykj/mistake/entity/resp/MistakeDetail$QstAnswerBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail;->typicalRightAnswers:Ljava/util/List;

    .line 2
    .line 3
    return-void
.end method
