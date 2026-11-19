.class public final Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0008\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u00085\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u00c1\u0001\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u0010\u0012\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u0010\u0012\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u0010\u0012\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0010\u0008\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0010\u0010#\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010 J\u0012\u0010$\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010\u001eJ\u0012\u0010%\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010\u001eJ\u0012\u0010&\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\u001eJ\u0012\u0010\'\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010\u001eJ\u0012\u0010(\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010\u001eJ\u0012\u0010)\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010\u001eJ\u0012\u0010*\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008*\u0010\u001eJ\u0012\u0010+\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008+\u0010\u001eJ\u0010\u0010,\u001a\u00020\u0010H\u00c6\u0003\u00a2\u0006\u0004\u0008,\u0010-J\u0010\u0010.\u001a\u00020\u0010H\u00c6\u0003\u00a2\u0006\u0004\u0008.\u0010-J\u0010\u0010/\u001a\u00020\u0010H\u00c6\u0003\u00a2\u0006\u0004\u0008/\u0010-J\u0012\u00100\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003\u00a2\u0006\u0004\u00080\u00101J\u0018\u00102\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0016H\u00c6\u0003\u00a2\u0006\u0004\u00082\u00103J\u00ca\u0001\u00104\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00022\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u00102\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0010\u0008\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0016H\u00c6\u0001\u00a2\u0006\u0004\u00084\u00105J\u0010\u00106\u001a\u00020\u0007H\u00d6\u0001\u00a2\u0006\u0004\u00086\u0010\u001eJ\u0010\u00107\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u00087\u0010\"J\u001a\u00109\u001a\u00020\u00102\u0008\u00108\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u00089\u0010:R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010;\u001a\u0004\u0008<\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010=\u001a\u0004\u0008>\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010;\u001a\u0004\u0008?\u0010 R\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010@\u001a\u0004\u0008A\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010@\u001a\u0004\u0008B\u0010\u001eR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010@\u001a\u0004\u0008C\u0010\u001eR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010@\u001a\u0004\u0008D\u0010\u001eR\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010@\u001a\u0004\u0008E\u0010\u001eR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010@\u001a\u0004\u0008F\u0010\u001eR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010@\u001a\u0004\u0008G\u0010\u001eR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010@\u001a\u0004\u0008H\u0010\u001eR\u0017\u0010\u0011\u001a\u00020\u00108\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010I\u001a\u0004\u0008\u0011\u0010-R\u0017\u0010\u0012\u001a\u00020\u00108\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010I\u001a\u0004\u0008\u0012\u0010-R\u0017\u0010\u0013\u001a\u00020\u00108\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010I\u001a\u0004\u0008J\u0010-R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010K\u001a\u0004\u0008L\u00101R\u001f\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00168\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010M\u001a\u0004\u0008N\u00103\u00a8\u0006O"
    }
    d2 = {
        "Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;",
        "",
        "",
        "id",
        "",
        "itemId",
        "topicId",
        "",
        "subject",
        "topicName",
        "examName",
        "source",
        "title",
        "name",
        "number",
        "stemShoot",
        "",
        "isCustomMistake",
        "isRelatedQstGroup",
        "hasStem",
        "Lcom/zykj/mistake/entity/resp/MistakeDetail;",
        "questionDetail",
        "",
        "questionDetails",
        "<init>",
        "(JIJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLcom/zykj/mistake/entity/resp/MistakeDetail;Ljava/util/List;)V",
        "Lp4/e;",
        "toNavItem",
        "()Lp4/e;",
        "getRealTitle",
        "()Ljava/lang/String;",
        "component1",
        "()J",
        "component2",
        "()I",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "component10",
        "component11",
        "component12",
        "()Z",
        "component13",
        "component14",
        "component15",
        "()Lcom/zykj/mistake/entity/resp/MistakeDetail;",
        "component16",
        "()Ljava/util/List;",
        "copy",
        "(JIJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLcom/zykj/mistake/entity/resp/MistakeDetail;Ljava/util/List;)Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;",
        "toString",
        "hashCode",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "J",
        "getId",
        "I",
        "getItemId",
        "getTopicId",
        "Ljava/lang/String;",
        "getSubject",
        "getTopicName",
        "getExamName",
        "getSource",
        "getTitle",
        "getName",
        "getNumber",
        "getStemShoot",
        "Z",
        "getHasStem",
        "Lcom/zykj/mistake/entity/resp/MistakeDetail;",
        "getQuestionDetail",
        "Ljava/util/List;",
        "getQuestionDetails",
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nGetNextReviewQuestionResp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetNextReviewQuestionResp.kt\ncom/zykj/mistake/entity/resp/NextReviewQuestionResult\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,57:1\n1#2:58\n*E\n"
    }
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final examName:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final hasStem:Z

.field private final id:J

.field private final isCustomMistake:Z

.field private final isRelatedQstGroup:Z

.field private final itemId:I

.field private final name:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final number:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final questionDetail:Lcom/zykj/mistake/entity/resp/MistakeDetail;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final questionDetails:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/zykj/mistake/entity/resp/MistakeDetail;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final source:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final stemShoot:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final subject:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final title:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final topicId:J

.field private final topicName:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 21

    .line 1
    const v19, 0xffff

    const/16 v20, 0x0

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v0, p0

    invoke-direct/range {v0 .. v20}, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;-><init>(JIJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLcom/zykj/mistake/entity/resp/MistakeDetail;Ljava/util/List;ILkotlin/jvm/internal/e;)V

    return-void
.end method

.method public constructor <init>(JIJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLcom/zykj/mistake/entity/resp/MistakeDetail;Ljava/util/List;)V
    .locals 0
    .param p6    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p8    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p9    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p10    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p11    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p12    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p13    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p17    # Lcom/zykj/mistake/entity/resp/MistakeDetail;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p18    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JIJ",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "ZZZ",
            "Lcom/zykj/mistake/entity/resp/MistakeDetail;",
            "Ljava/util/List<",
            "Lcom/zykj/mistake/entity/resp/MistakeDetail;",
            ">;)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-wide p1, p0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->id:J

    .line 4
    iput p3, p0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->itemId:I

    .line 5
    iput-wide p4, p0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->topicId:J

    .line 6
    iput-object p6, p0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->subject:Ljava/lang/String;

    .line 7
    iput-object p7, p0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->topicName:Ljava/lang/String;

    .line 8
    iput-object p8, p0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->examName:Ljava/lang/String;

    .line 9
    iput-object p9, p0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->source:Ljava/lang/String;

    .line 10
    iput-object p10, p0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->title:Ljava/lang/String;

    .line 11
    iput-object p11, p0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->name:Ljava/lang/String;

    .line 12
    iput-object p12, p0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->number:Ljava/lang/String;

    .line 13
    iput-object p13, p0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->stemShoot:Ljava/lang/String;

    .line 14
    iput-boolean p14, p0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->isCustomMistake:Z

    .line 15
    iput-boolean p15, p0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->isRelatedQstGroup:Z

    move/from16 p1, p16

    .line 16
    iput-boolean p1, p0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->hasStem:Z

    move-object/from16 p1, p17

    .line 17
    iput-object p1, p0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->questionDetail:Lcom/zykj/mistake/entity/resp/MistakeDetail;

    move-object/from16 p1, p18

    .line 18
    iput-object p1, p0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->questionDetails:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(JIJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLcom/zykj/mistake/entity/resp/MistakeDetail;Ljava/util/List;ILkotlin/jvm/internal/e;)V
    .locals 18

    move/from16 v0, p19

    and-int/lit8 v1, v0, 0x1

    const-wide/16 v2, 0x0

    if-eqz v1, :cond_0

    move-wide v4, v2

    goto :goto_0

    :cond_0
    move-wide/from16 v4, p1

    :goto_0
    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_1

    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    move/from16 v1, p3

    :goto_1
    and-int/lit8 v7, v0, 0x4

    if-eqz v7, :cond_2

    goto :goto_2

    :cond_2
    move-wide/from16 v2, p4

    :goto_2
    and-int/lit8 v7, v0, 0x8

    .line 19
    const-string v8, ""

    if-eqz v7, :cond_3

    move-object v7, v8

    goto :goto_3

    :cond_3
    move-object/from16 v7, p6

    :goto_3
    and-int/lit8 v9, v0, 0x10

    if-eqz v9, :cond_4

    move-object v9, v8

    goto :goto_4

    :cond_4
    move-object/from16 v9, p7

    :goto_4
    and-int/lit8 v10, v0, 0x20

    if-eqz v10, :cond_5

    move-object v10, v8

    goto :goto_5

    :cond_5
    move-object/from16 v10, p8

    :goto_5
    and-int/lit8 v11, v0, 0x40

    if-eqz v11, :cond_6

    move-object v11, v8

    goto :goto_6

    :cond_6
    move-object/from16 v11, p9

    :goto_6
    and-int/lit16 v12, v0, 0x80

    if-eqz v12, :cond_7

    move-object v12, v8

    goto :goto_7

    :cond_7
    move-object/from16 v12, p10

    :goto_7
    and-int/lit16 v13, v0, 0x100

    if-eqz v13, :cond_8

    move-object v13, v8

    goto :goto_8

    :cond_8
    move-object/from16 v13, p11

    :goto_8
    and-int/lit16 v14, v0, 0x200

    if-eqz v14, :cond_9

    move-object v14, v8

    goto :goto_9

    :cond_9
    move-object/from16 v14, p12

    :goto_9
    and-int/lit16 v15, v0, 0x400

    if-eqz v15, :cond_a

    goto :goto_a

    :cond_a
    move-object/from16 v8, p13

    :goto_a
    and-int/lit16 v15, v0, 0x800

    if-eqz v15, :cond_b

    const/4 v15, 0x0

    goto :goto_b

    :cond_b
    move/from16 v15, p14

    :goto_b
    and-int/lit16 v6, v0, 0x1000

    if-eqz v6, :cond_c

    const/4 v6, 0x0

    goto :goto_c

    :cond_c
    move/from16 v6, p15

    :goto_c
    move/from16 p2, v1

    and-int/lit16 v1, v0, 0x2000

    if-eqz v1, :cond_d

    const/4 v1, 0x0

    goto :goto_d

    :cond_d
    move/from16 v1, p16

    :goto_d
    move/from16 p1, v1

    and-int/lit16 v1, v0, 0x4000

    const/16 v16, 0x0

    if-eqz v1, :cond_e

    move-object/from16 v1, v16

    goto :goto_e

    :cond_e
    move-object/from16 v1, p17

    :goto_e
    const v17, 0x8000

    and-int v0, v0, v17

    if-eqz v0, :cond_f

    move-object/from16 p19, v16

    :goto_f
    move/from16 p17, p1

    move/from16 p4, p2

    move-object/from16 p18, v1

    move-wide/from16 p5, v2

    move-wide/from16 p2, v4

    move/from16 p16, v6

    move-object/from16 p7, v7

    move-object/from16 p14, v8

    move-object/from16 p8, v9

    move-object/from16 p9, v10

    move-object/from16 p10, v11

    move-object/from16 p11, v12

    move-object/from16 p12, v13

    move-object/from16 p13, v14

    move/from16 p15, v15

    move-object/from16 p1, p0

    goto :goto_10

    :cond_f
    move-object/from16 p19, p18

    goto :goto_f

    :goto_10
    invoke-direct/range {p1 .. p19}, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;-><init>(JIJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLcom/zykj/mistake/entity/resp/MistakeDetail;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;JIJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLcom/zykj/mistake/entity/resp/MistakeDetail;Ljava/util/List;ILjava/lang/Object;)Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;
    .locals 19

    move-object/from16 v0, p0

    move/from16 v1, p19

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-wide v2, v0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->id:J

    goto :goto_0

    :cond_0
    move-wide/from16 v2, p1

    :goto_0
    and-int/lit8 v4, v1, 0x2

    if-eqz v4, :cond_1

    iget v4, v0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->itemId:I

    goto :goto_1

    :cond_1
    move/from16 v4, p3

    :goto_1
    and-int/lit8 v5, v1, 0x4

    if-eqz v5, :cond_2

    iget-wide v5, v0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->topicId:J

    goto :goto_2

    :cond_2
    move-wide/from16 v5, p4

    :goto_2
    and-int/lit8 v7, v1, 0x8

    if-eqz v7, :cond_3

    iget-object v7, v0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->subject:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v7, p6

    :goto_3
    and-int/lit8 v8, v1, 0x10

    if-eqz v8, :cond_4

    iget-object v8, v0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->topicName:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object/from16 v8, p7

    :goto_4
    and-int/lit8 v9, v1, 0x20

    if-eqz v9, :cond_5

    iget-object v9, v0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->examName:Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object/from16 v9, p8

    :goto_5
    and-int/lit8 v10, v1, 0x40

    if-eqz v10, :cond_6

    iget-object v10, v0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->source:Ljava/lang/String;

    goto :goto_6

    :cond_6
    move-object/from16 v10, p9

    :goto_6
    and-int/lit16 v11, v1, 0x80

    if-eqz v11, :cond_7

    iget-object v11, v0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->title:Ljava/lang/String;

    goto :goto_7

    :cond_7
    move-object/from16 v11, p10

    :goto_7
    and-int/lit16 v12, v1, 0x100

    if-eqz v12, :cond_8

    iget-object v12, v0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->name:Ljava/lang/String;

    goto :goto_8

    :cond_8
    move-object/from16 v12, p11

    :goto_8
    and-int/lit16 v13, v1, 0x200

    if-eqz v13, :cond_9

    iget-object v13, v0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->number:Ljava/lang/String;

    goto :goto_9

    :cond_9
    move-object/from16 v13, p12

    :goto_9
    and-int/lit16 v14, v1, 0x400

    if-eqz v14, :cond_a

    iget-object v14, v0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->stemShoot:Ljava/lang/String;

    goto :goto_a

    :cond_a
    move-object/from16 v14, p13

    :goto_a
    and-int/lit16 v15, v1, 0x800

    if-eqz v15, :cond_b

    iget-boolean v15, v0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->isCustomMistake:Z

    goto :goto_b

    :cond_b
    move/from16 v15, p14

    :goto_b
    move-wide/from16 v16, v2

    and-int/lit16 v2, v1, 0x1000

    if-eqz v2, :cond_c

    iget-boolean v2, v0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->isRelatedQstGroup:Z

    goto :goto_c

    :cond_c
    move/from16 v2, p15

    :goto_c
    and-int/lit16 v3, v1, 0x2000

    if-eqz v3, :cond_d

    iget-boolean v3, v0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->hasStem:Z

    goto :goto_d

    :cond_d
    move/from16 v3, p16

    :goto_d
    move/from16 p1, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget-object v2, v0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->questionDetail:Lcom/zykj/mistake/entity/resp/MistakeDetail;

    goto :goto_e

    :cond_e
    move-object/from16 v2, p17

    :goto_e
    const v18, 0x8000

    and-int v1, v1, v18

    if-eqz v1, :cond_f

    iget-object v1, v0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->questionDetails:Ljava/util/List;

    move-object/from16 p19, v1

    :goto_f
    move/from16 p16, p1

    move-object/from16 p1, v0

    move-object/from16 p18, v2

    move/from16 p17, v3

    move/from16 p4, v4

    move-wide/from16 p5, v5

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move-object/from16 p9, v9

    move-object/from16 p10, v10

    move-object/from16 p11, v11

    move-object/from16 p12, v12

    move-object/from16 p13, v13

    move-object/from16 p14, v14

    move/from16 p15, v15

    move-wide/from16 p2, v16

    goto :goto_10

    :cond_f
    move-object/from16 p19, p18

    goto :goto_f

    :goto_10
    invoke-virtual/range {p1 .. p19}, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->copy(JIJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLcom/zykj/mistake/entity/resp/MistakeDetail;Ljava/util/List;)Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()J
    .locals 2

    iget-wide v0, p0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->id:J

    return-wide v0
.end method

.method public final component10()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->number:Ljava/lang/String;

    return-object v0
.end method

.method public final component11()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->stemShoot:Ljava/lang/String;

    return-object v0
.end method

.method public final component12()Z
    .locals 1

    iget-boolean v0, p0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->isCustomMistake:Z

    return v0
.end method

.method public final component13()Z
    .locals 1

    iget-boolean v0, p0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->isRelatedQstGroup:Z

    return v0
.end method

.method public final component14()Z
    .locals 1

    iget-boolean v0, p0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->hasStem:Z

    return v0
.end method

.method public final component15()Lcom/zykj/mistake/entity/resp/MistakeDetail;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->questionDetail:Lcom/zykj/mistake/entity/resp/MistakeDetail;

    return-object v0
.end method

.method public final component16()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/mistake/entity/resp/MistakeDetail;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->questionDetails:Ljava/util/List;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->itemId:I

    return v0
.end method

.method public final component3()J
    .locals 2

    iget-wide v0, p0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->topicId:J

    return-wide v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->subject:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->topicName:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->examName:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->source:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(JIJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLcom/zykj/mistake/entity/resp/MistakeDetail;Ljava/util/List;)Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;
    .locals 19
    .param p6    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p8    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p9    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p10    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p11    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p12    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p13    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p17    # Lcom/zykj/mistake/entity/resp/MistakeDetail;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p18    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JIJ",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "ZZZ",
            "Lcom/zykj/mistake/entity/resp/MistakeDetail;",
            "Ljava/util/List<",
            "Lcom/zykj/mistake/entity/resp/MistakeDetail;",
            ">;)",
            "Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;

    move-wide/from16 v1, p1

    move/from16 v3, p3

    move-wide/from16 v4, p4

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    move-object/from16 v11, p11

    move-object/from16 v12, p12

    move-object/from16 v13, p13

    move/from16 v14, p14

    move/from16 v15, p15

    move/from16 v16, p16

    move-object/from16 v17, p17

    move-object/from16 v18, p18

    invoke-direct/range {v0 .. v18}, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;-><init>(JIJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLcom/zykj/mistake/entity/resp/MistakeDetail;Ljava/util/List;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;

    iget-wide v3, p0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->id:J

    iget-wide v5, p1, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->id:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->itemId:I

    iget v3, p1, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->itemId:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->topicId:J

    iget-wide v5, p1, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->topicId:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->subject:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->subject:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->topicName:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->topicName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->examName:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->examName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->source:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->source:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->name:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->name:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->number:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->number:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->stemShoot:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->stemShoot:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-boolean v1, p0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->isCustomMistake:Z

    iget-boolean v3, p1, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->isCustomMistake:Z

    if-eq v1, v3, :cond_d

    return v2

    :cond_d
    iget-boolean v1, p0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->isRelatedQstGroup:Z

    iget-boolean v3, p1, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->isRelatedQstGroup:Z

    if-eq v1, v3, :cond_e

    return v2

    :cond_e
    iget-boolean v1, p0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->hasStem:Z

    iget-boolean v3, p1, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->hasStem:Z

    if-eq v1, v3, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->questionDetail:Lcom/zykj/mistake/entity/resp/MistakeDetail;

    iget-object v3, p1, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->questionDetail:Lcom/zykj/mistake/entity/resp/MistakeDetail;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->questionDetails:Ljava/util/List;

    iget-object p1, p1, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->questionDetails:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_11

    return v2

    :cond_11
    return v0
.end method

.method public final getExamName()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->examName:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getHasStem()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->hasStem:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getId()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->id:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getItemId()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->itemId:I

    .line 2
    .line 3
    return v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->name:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getNumber()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->number:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getQuestionDetail()Lcom/zykj/mistake/entity/resp/MistakeDetail;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->questionDetail:Lcom/zykj/mistake/entity/resp/MistakeDetail;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getQuestionDetails()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/mistake/entity/resp/MistakeDetail;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->questionDetails:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getRealTitle()Ljava/lang/String;
    .locals 4
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->title:Ljava/lang/String;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    if-lez v2, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object v0, v1

    .line 14
    :goto_0
    if-eqz v0, :cond_1

    .line 15
    .line 16
    return-object v0

    .line 17
    :cond_1
    iget-object v0, p0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->name:Ljava/lang/String;

    .line 18
    .line 19
    if-eqz v0, :cond_4

    .line 20
    .line 21
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-lez v2, :cond_2

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_2
    move-object v0, v1

    .line 29
    :goto_1
    if-nez v0, :cond_3

    .line 30
    .line 31
    goto :goto_3

    .line 32
    :cond_3
    :goto_2
    move-object v1, v0

    .line 33
    goto :goto_4

    .line 34
    :cond_4
    :goto_3
    iget-object v0, p0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->number:Ljava/lang/String;

    .line 35
    .line 36
    if-eqz v0, :cond_5

    .line 37
    .line 38
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-lez v2, :cond_5

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_5
    :goto_4
    const-string v0, ""

    .line 46
    .line 47
    if-eqz v1, :cond_8

    .line 48
    .line 49
    sget v2, Lcom/zykj/mistake/R$string;->mistake_title:I

    .line 50
    .line 51
    iget-object v3, p0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->source:Ljava/lang/String;

    .line 52
    .line 53
    if-nez v3, :cond_6

    .line 54
    .line 55
    move-object v3, v0

    .line 56
    :cond_6
    filled-new-array {v3, v1}, [Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-static {v2, v1}, Lcom/blankj/utilcode/util/c;->h(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    if-nez v1, :cond_7

    .line 65
    .line 66
    goto :goto_5

    .line 67
    :cond_7
    return-object v1

    .line 68
    :cond_8
    :goto_5
    iget-object v1, p0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->source:Ljava/lang/String;

    .line 69
    .line 70
    if-nez v1, :cond_9

    .line 71
    .line 72
    return-object v0

    .line 73
    :cond_9
    return-object v1
.end method

.method public final getSource()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->source:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getStemShoot()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->stemShoot:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getSubject()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->subject:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->title:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getTopicId()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->topicId:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getTopicName()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->topicName:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 4

    .line 1
    iget-wide v0, p0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->id:J

    .line 2
    .line 3
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget v2, p0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->itemId:I

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->c(III)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-wide v2, p0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->topicId:J

    .line 17
    .line 18
    invoke-static {v2, v3, v0, v1}, Landroidx/collection/a;->B(JII)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->subject:Ljava/lang/String;

    .line 23
    .line 24
    const/4 v3, 0x0

    .line 25
    if-nez v2, :cond_0

    .line 26
    .line 27
    move v2, v3

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    :goto_0
    add-int/2addr v0, v2

    .line 34
    mul-int/2addr v0, v1

    .line 35
    iget-object v2, p0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->topicName:Ljava/lang/String;

    .line 36
    .line 37
    if-nez v2, :cond_1

    .line 38
    .line 39
    move v2, v3

    .line 40
    goto :goto_1

    .line 41
    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    :goto_1
    add-int/2addr v0, v2

    .line 46
    mul-int/2addr v0, v1

    .line 47
    iget-object v2, p0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->examName:Ljava/lang/String;

    .line 48
    .line 49
    if-nez v2, :cond_2

    .line 50
    .line 51
    move v2, v3

    .line 52
    goto :goto_2

    .line 53
    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    :goto_2
    add-int/2addr v0, v2

    .line 58
    mul-int/2addr v0, v1

    .line 59
    iget-object v2, p0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->source:Ljava/lang/String;

    .line 60
    .line 61
    if-nez v2, :cond_3

    .line 62
    .line 63
    move v2, v3

    .line 64
    goto :goto_3

    .line 65
    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    :goto_3
    add-int/2addr v0, v2

    .line 70
    mul-int/2addr v0, v1

    .line 71
    iget-object v2, p0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->title:Ljava/lang/String;

    .line 72
    .line 73
    if-nez v2, :cond_4

    .line 74
    .line 75
    move v2, v3

    .line 76
    goto :goto_4

    .line 77
    :cond_4
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    :goto_4
    add-int/2addr v0, v2

    .line 82
    mul-int/2addr v0, v1

    .line 83
    iget-object v2, p0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->name:Ljava/lang/String;

    .line 84
    .line 85
    if-nez v2, :cond_5

    .line 86
    .line 87
    move v2, v3

    .line 88
    goto :goto_5

    .line 89
    :cond_5
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    :goto_5
    add-int/2addr v0, v2

    .line 94
    mul-int/2addr v0, v1

    .line 95
    iget-object v2, p0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->number:Ljava/lang/String;

    .line 96
    .line 97
    if-nez v2, :cond_6

    .line 98
    .line 99
    move v2, v3

    .line 100
    goto :goto_6

    .line 101
    :cond_6
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 102
    .line 103
    .line 104
    move-result v2

    .line 105
    :goto_6
    add-int/2addr v0, v2

    .line 106
    mul-int/2addr v0, v1

    .line 107
    iget-object v2, p0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->stemShoot:Ljava/lang/String;

    .line 108
    .line 109
    if-nez v2, :cond_7

    .line 110
    .line 111
    move v2, v3

    .line 112
    goto :goto_7

    .line 113
    :cond_7
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 114
    .line 115
    .line 116
    move-result v2

    .line 117
    :goto_7
    add-int/2addr v0, v2

    .line 118
    mul-int/2addr v0, v1

    .line 119
    iget-boolean v2, p0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->isCustomMistake:Z

    .line 120
    .line 121
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    iget-boolean v2, p0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->isRelatedQstGroup:Z

    .line 126
    .line 127
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    iget-boolean v2, p0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->hasStem:Z

    .line 132
    .line 133
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 134
    .line 135
    .line 136
    move-result v0

    .line 137
    iget-object v2, p0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->questionDetail:Lcom/zykj/mistake/entity/resp/MistakeDetail;

    .line 138
    .line 139
    if-nez v2, :cond_8

    .line 140
    .line 141
    move v2, v3

    .line 142
    goto :goto_8

    .line 143
    :cond_8
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 144
    .line 145
    .line 146
    move-result v2

    .line 147
    :goto_8
    add-int/2addr v0, v2

    .line 148
    mul-int/2addr v0, v1

    .line 149
    iget-object v1, p0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->questionDetails:Ljava/util/List;

    .line 150
    .line 151
    if-nez v1, :cond_9

    .line 152
    .line 153
    goto :goto_9

    .line 154
    :cond_9
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 155
    .line 156
    .line 157
    move-result v3

    .line 158
    :goto_9
    add-int/2addr v0, v3

    .line 159
    return v0
.end method

.method public final isCustomMistake()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->isCustomMistake:Z

    .line 2
    .line 3
    return v0
.end method

.method public final isRelatedQstGroup()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->isRelatedQstGroup:Z

    .line 2
    .line 3
    return v0
.end method

.method public final toNavItem()Lp4/e;
    .locals 14
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget v0, p0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->itemId:I

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-lez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v1, 0x0

    .line 11
    :goto_0
    if-eqz v1, :cond_1

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    :goto_1
    move v2, v0

    .line 18
    goto :goto_2

    .line 19
    :cond_1
    iget-wide v0, p0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->id:J

    .line 20
    .line 21
    long-to-int v0, v0

    .line 22
    goto :goto_1

    .line 23
    :goto_2
    iget-wide v3, p0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->topicId:J

    .line 24
    .line 25
    iget-object v0, p0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->subject:Ljava/lang/String;

    .line 26
    .line 27
    const-string v1, ""

    .line 28
    .line 29
    if-nez v0, :cond_2

    .line 30
    .line 31
    move-object v0, v1

    .line 32
    :cond_2
    invoke-static {v0}, Lkotlin/text/p;->P(Ljava/lang/CharSequence;)Z

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    if-eqz v5, :cond_3

    .line 37
    .line 38
    iget-object v0, p0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->topicName:Ljava/lang/String;

    .line 39
    .line 40
    if-nez v0, :cond_3

    .line 41
    .line 42
    move-object v0, v1

    .line 43
    :cond_3
    move-object v5, v0

    .line 44
    invoke-virtual {p0}, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->getRealTitle()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v6

    .line 48
    iget-object v0, p0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->title:Ljava/lang/String;

    .line 49
    .line 50
    if-nez v0, :cond_4

    .line 51
    .line 52
    move-object v7, v1

    .line 53
    goto :goto_3

    .line 54
    :cond_4
    move-object v7, v0

    .line 55
    :goto_3
    iget-object v0, p0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->stemShoot:Ljava/lang/String;

    .line 56
    .line 57
    if-nez v0, :cond_5

    .line 58
    .line 59
    move-object v8, v1

    .line 60
    goto :goto_4

    .line 61
    :cond_5
    move-object v8, v0

    .line 62
    :goto_4
    iget-boolean v9, p0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->isCustomMistake:Z

    .line 63
    .line 64
    iget-boolean v10, p0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->isRelatedQstGroup:Z

    .line 65
    .line 66
    iget-boolean v11, p0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->hasStem:Z

    .line 67
    .line 68
    new-instance v1, Lp4/e;

    .line 69
    .line 70
    const/4 v12, 0x0

    .line 71
    const/16 v13, 0x600

    .line 72
    .line 73
    invoke-direct/range {v1 .. v13}, Lp4/e;-><init>(IJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLjava/util/List;I)V

    .line 74
    .line 75
    .line 76
    return-object v1
.end method

.method public toString()Ljava/lang/String;
    .locals 20
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-wide v1, v0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->id:J

    .line 4
    .line 5
    iget v3, v0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->itemId:I

    .line 6
    .line 7
    iget-wide v4, v0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->topicId:J

    .line 8
    .line 9
    iget-object v6, v0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->subject:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v7, v0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->topicName:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v8, v0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->examName:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v9, v0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->source:Ljava/lang/String;

    .line 16
    .line 17
    iget-object v10, v0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->title:Ljava/lang/String;

    .line 18
    .line 19
    iget-object v11, v0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->name:Ljava/lang/String;

    .line 20
    .line 21
    iget-object v12, v0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->number:Ljava/lang/String;

    .line 22
    .line 23
    iget-object v13, v0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->stemShoot:Ljava/lang/String;

    .line 24
    .line 25
    iget-boolean v14, v0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->isCustomMistake:Z

    .line 26
    .line 27
    iget-boolean v15, v0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->isRelatedQstGroup:Z

    .line 28
    .line 29
    move/from16 v16, v14

    .line 30
    .line 31
    iget-boolean v14, v0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->hasStem:Z

    .line 32
    .line 33
    move/from16 v17, v14

    .line 34
    .line 35
    iget-object v14, v0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->questionDetail:Lcom/zykj/mistake/entity/resp/MistakeDetail;

    .line 36
    .line 37
    move-object/from16 v18, v14

    .line 38
    .line 39
    iget-object v14, v0, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->questionDetails:Ljava/util/List;

    .line 40
    .line 41
    new-instance v0, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    move-object/from16 v19, v14

    .line 44
    .line 45
    const-string v14, "NextReviewQuestionResult(id="

    .line 46
    .line 47
    invoke-direct {v0, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v1, ", itemId="

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    const-string v1, ", topicId="

    .line 62
    .line 63
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    const-string v1, ", subject="

    .line 70
    .line 71
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    const-string v1, ", topicName="

    .line 75
    .line 76
    const-string v2, ", examName="

    .line 77
    .line 78
    invoke-static {v0, v6, v1, v7, v2}, Landroidx/compose/material3/c;->x(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    const-string v1, ", source="

    .line 82
    .line 83
    const-string v2, ", title="

    .line 84
    .line 85
    invoke-static {v0, v8, v1, v9, v2}, Landroidx/compose/material3/c;->x(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    const-string v1, ", name="

    .line 89
    .line 90
    const-string v2, ", number="

    .line 91
    .line 92
    invoke-static {v0, v10, v1, v11, v2}, Landroidx/compose/material3/c;->x(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    const-string v1, ", stemShoot="

    .line 96
    .line 97
    const-string v2, ", isCustomMistake="

    .line 98
    .line 99
    invoke-static {v0, v12, v1, v13, v2}, Landroidx/compose/material3/c;->x(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    const-string v1, ", isRelatedQstGroup="

    .line 103
    .line 104
    const-string v2, ", hasStem="

    .line 105
    .line 106
    move/from16 v3, v16

    .line 107
    .line 108
    invoke-static {v1, v2, v0, v3, v15}, Landroidx/compose/material3/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 109
    .line 110
    .line 111
    move/from16 v1, v17

    .line 112
    .line 113
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    const-string v1, ", questionDetail="

    .line 117
    .line 118
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    move-object/from16 v1, v18

    .line 122
    .line 123
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    const-string v1, ", questionDetails="

    .line 127
    .line 128
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    move-object/from16 v1, v19

    .line 132
    .line 133
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    const-string v1, ")"

    .line 137
    .line 138
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    return-object v0
.end method
