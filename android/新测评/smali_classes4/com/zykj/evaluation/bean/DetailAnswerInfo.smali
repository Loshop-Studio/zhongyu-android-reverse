.class public final Lcom/zykj/evaluation/bean/DetailAnswerInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0008.\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u008f\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000b\u0012\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000b\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000b\u0012\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000b\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0008\u0012\u0006\u0010\u0012\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\t\u0010*\u001a\u00020\u0003H\u00c6\u0003J\t\u0010+\u001a\u00020\u0005H\u00c6\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001aJ\t\u0010-\u001a\u00020\u0008H\u00c6\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001fJ\u000f\u0010/\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000bH\u00c6\u0003J\u000f\u00100\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000bH\u00c6\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000f\u00102\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000bH\u00c6\u0003J\u000f\u00103\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000bH\u00c6\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u00105\u001a\u00020\u0008H\u00c6\u0003J\t\u00106\u001a\u00020\u0008H\u00c6\u0003J\u00b0\u0001\u00107\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00082\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00082\u000e\u0008\u0002\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000b2\u000e\u0008\u0002\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000b2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\u000e\u0008\u0002\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000b2\u000e\u0008\u0002\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000b2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u0008H\u00c6\u0001\u00a2\u0006\u0002\u00108J\u0013\u00109\u001a\u00020:2\u0008\u0010;\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010<\u001a\u00020\u0008H\u00d6\u0001J\t\u0010=\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u001b\u001a\u0004\u0008\u0019\u0010\u001aR\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u001dR\u0015\u0010\t\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\n\n\u0002\u0010 \u001a\u0004\u0008\u001e\u0010\u001fR\u0017\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010\"R\u0017\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008#\u0010\"R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008$\u0010\u0016R\u0017\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008%\u0010\"R\u0017\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008&\u0010\"R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\'\u0010\u0016R\u0011\u0010\u0011\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008(\u0010\u001dR\u0011\u0010\u0012\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008)\u0010\u001d\u00a8\u0006>"
    }
    d2 = {
        "Lcom/zykj/evaluation/bean/DetailAnswerInfo;",
        "",
        "uuid",
        "",
        "score",
        "",
        "originScore",
        "result",
        "",
        "originResult",
        "examAnswers",
        "",
        "examComments",
        "examMicroLessonComment",
        "revisingAnswers",
        "revisingComments",
        "reviseMicroLessonComment",
        "whenShowAnswer",
        "whenShowMicroLesson",
        "<init>",
        "(Ljava/lang/String;DLjava/lang/Double;ILjava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;II)V",
        "getUuid",
        "()Ljava/lang/String;",
        "getScore",
        "()D",
        "getOriginScore",
        "()Ljava/lang/Double;",
        "Ljava/lang/Double;",
        "getResult",
        "()I",
        "getOriginResult",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "getExamAnswers",
        "()Ljava/util/List;",
        "getExamComments",
        "getExamMicroLessonComment",
        "getRevisingAnswers",
        "getRevisingComments",
        "getReviseMicroLessonComment",
        "getWhenShowAnswer",
        "getWhenShowMicroLesson",
        "component1",
        "component2",
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
        "component13",
        "copy",
        "(Ljava/lang/String;DLjava/lang/Double;ILjava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;II)Lcom/zykj/evaluation/bean/DetailAnswerInfo;",
        "equals",
        "",
        "other",
        "hashCode",
        "toString",
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
.field private final examAnswers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final examComments:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final examMicroLessonComment:Ljava/lang/String;

.field private final originResult:Ljava/lang/Integer;

.field private final originScore:Ljava/lang/Double;

.field private final result:I

.field private final reviseMicroLessonComment:Ljava/lang/String;

.field private final revisingAnswers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final revisingComments:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final score:D

.field private final uuid:Ljava/lang/String;

.field private final whenShowAnswer:I

.field private final whenShowMicroLesson:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;DLjava/lang/Double;ILjava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;II)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "D",
            "Ljava/lang/Double;",
            "I",
            "Ljava/lang/Integer;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "II)V"
        }
    .end annotation

    .line 1
    const-string v0, "uuid"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "examAnswers"

    .line 7
    .line 8
    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "examComments"

    .line 12
    .line 13
    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "revisingAnswers"

    .line 17
    .line 18
    invoke-static {p10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "revisingComments"

    .line 22
    .line 23
    invoke-static {p11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->uuid:Ljava/lang/String;

    .line 30
    .line 31
    iput-wide p2, p0, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->score:D

    .line 32
    .line 33
    iput-object p4, p0, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->originScore:Ljava/lang/Double;

    .line 34
    .line 35
    iput p5, p0, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->result:I

    .line 36
    .line 37
    iput-object p6, p0, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->originResult:Ljava/lang/Integer;

    .line 38
    .line 39
    iput-object p7, p0, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->examAnswers:Ljava/util/List;

    .line 40
    .line 41
    iput-object p8, p0, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->examComments:Ljava/util/List;

    .line 42
    .line 43
    iput-object p9, p0, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->examMicroLessonComment:Ljava/lang/String;

    .line 44
    .line 45
    iput-object p10, p0, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->revisingAnswers:Ljava/util/List;

    .line 46
    .line 47
    iput-object p11, p0, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->revisingComments:Ljava/util/List;

    .line 48
    .line 49
    iput-object p12, p0, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->reviseMicroLessonComment:Ljava/lang/String;

    .line 50
    .line 51
    iput p13, p0, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->whenShowAnswer:I

    .line 52
    .line 53
    iput p14, p0, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->whenShowMicroLesson:I

    .line 54
    .line 55
    return-void
.end method

.method public static synthetic copy$default(Lcom/zykj/evaluation/bean/DetailAnswerInfo;Ljava/lang/String;DLjava/lang/Double;ILjava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;IIILjava/lang/Object;)Lcom/zykj/evaluation/bean/DetailAnswerInfo;
    .locals 14

    move/from16 v0, p15

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->uuid:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object v1, p1

    :goto_0
    and-int/lit8 v2, v0, 0x2

    if-eqz v2, :cond_1

    iget-wide v2, p0, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->score:D

    goto :goto_1

    :cond_1
    move-wide/from16 v2, p2

    :goto_1
    and-int/lit8 v4, v0, 0x4

    if-eqz v4, :cond_2

    iget-object v4, p0, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->originScore:Ljava/lang/Double;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p4

    :goto_2
    and-int/lit8 v5, v0, 0x8

    if-eqz v5, :cond_3

    iget v5, p0, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->result:I

    goto :goto_3

    :cond_3
    move/from16 v5, p5

    :goto_3
    and-int/lit8 v6, v0, 0x10

    if-eqz v6, :cond_4

    iget-object v6, p0, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->originResult:Ljava/lang/Integer;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p6

    :goto_4
    and-int/lit8 v7, v0, 0x20

    if-eqz v7, :cond_5

    iget-object v7, p0, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->examAnswers:Ljava/util/List;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p7

    :goto_5
    and-int/lit8 v8, v0, 0x40

    if-eqz v8, :cond_6

    iget-object v8, p0, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->examComments:Ljava/util/List;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p8

    :goto_6
    and-int/lit16 v9, v0, 0x80

    if-eqz v9, :cond_7

    iget-object v9, p0, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->examMicroLessonComment:Ljava/lang/String;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p9

    :goto_7
    and-int/lit16 v10, v0, 0x100

    if-eqz v10, :cond_8

    iget-object v10, p0, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->revisingAnswers:Ljava/util/List;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p10

    :goto_8
    and-int/lit16 v11, v0, 0x200

    if-eqz v11, :cond_9

    iget-object v11, p0, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->revisingComments:Ljava/util/List;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p11

    :goto_9
    and-int/lit16 v12, v0, 0x400

    if-eqz v12, :cond_a

    iget-object v12, p0, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->reviseMicroLessonComment:Ljava/lang/String;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p12

    :goto_a
    and-int/lit16 v13, v0, 0x800

    if-eqz v13, :cond_b

    iget v13, p0, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->whenShowAnswer:I

    goto :goto_b

    :cond_b
    move/from16 v13, p13

    :goto_b
    and-int/lit16 v0, v0, 0x1000

    if-eqz v0, :cond_c

    iget v0, p0, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->whenShowMicroLesson:I

    move/from16 p15, v0

    :goto_c
    move-object p1, p0

    move-object/from16 p2, v1

    move-wide/from16 p3, v2

    move-object/from16 p5, v4

    move/from16 p6, v5

    move-object/from16 p7, v6

    move-object/from16 p8, v7

    move-object/from16 p9, v8

    move-object/from16 p10, v9

    move-object/from16 p11, v10

    move-object/from16 p12, v11

    move-object/from16 p13, v12

    move/from16 p14, v13

    goto :goto_d

    :cond_c
    move/from16 p15, p14

    goto :goto_c

    :goto_d
    invoke-virtual/range {p1 .. p15}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->copy(Ljava/lang/String;DLjava/lang/Double;ILjava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;II)Lcom/zykj/evaluation/bean/DetailAnswerInfo;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->uuid:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->revisingComments:Ljava/util/List;

    return-object v0
.end method

.method public final component11()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->reviseMicroLessonComment:Ljava/lang/String;

    return-object v0
.end method

.method public final component12()I
    .locals 1

    iget v0, p0, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->whenShowAnswer:I

    return v0
.end method

.method public final component13()I
    .locals 1

    iget v0, p0, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->whenShowMicroLesson:I

    return v0
.end method

.method public final component2()D
    .locals 2

    iget-wide v0, p0, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->score:D

    return-wide v0
.end method

.method public final component3()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->originScore:Ljava/lang/Double;

    return-object v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->result:I

    return v0
.end method

.method public final component5()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->originResult:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component6()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->examAnswers:Ljava/util/List;

    return-object v0
.end method

.method public final component7()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->examComments:Ljava/util/List;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->examMicroLessonComment:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->revisingAnswers:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;DLjava/lang/Double;ILjava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;II)Lcom/zykj/evaluation/bean/DetailAnswerInfo;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "D",
            "Ljava/lang/Double;",
            "I",
            "Ljava/lang/Integer;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "II)",
            "Lcom/zykj/evaluation/bean/DetailAnswerInfo;"
        }
    .end annotation

    const-string v0, "uuid"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "examAnswers"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "examComments"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "revisingAnswers"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "revisingComments"

    move-object/from16 v12, p11

    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/zykj/evaluation/bean/DetailAnswerInfo;

    move-wide/from16 v3, p2

    move-object/from16 v5, p4

    move/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v10, p9

    move-object/from16 v13, p12

    move/from16 v14, p13

    move/from16 v15, p14

    invoke-direct/range {v1 .. v15}, Lcom/zykj/evaluation/bean/DetailAnswerInfo;-><init>(Ljava/lang/String;DLjava/lang/Double;ILjava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;II)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/evaluation/bean/DetailAnswerInfo;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/evaluation/bean/DetailAnswerInfo;

    iget-object v1, p0, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->uuid:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->uuid:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->score:D

    iget-wide v5, p1, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->score:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->originScore:Ljava/lang/Double;

    iget-object v3, p1, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->originScore:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->result:I

    iget v3, p1, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->result:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->originResult:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->originResult:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->examAnswers:Ljava/util/List;

    iget-object v3, p1, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->examAnswers:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->examComments:Ljava/util/List;

    iget-object v3, p1, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->examComments:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->examMicroLessonComment:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->examMicroLessonComment:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->revisingAnswers:Ljava/util/List;

    iget-object v3, p1, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->revisingAnswers:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->revisingComments:Ljava/util/List;

    iget-object v3, p1, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->revisingComments:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->reviseMicroLessonComment:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->reviseMicroLessonComment:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget v1, p0, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->whenShowAnswer:I

    iget v3, p1, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->whenShowAnswer:I

    if-eq v1, v3, :cond_d

    return v2

    :cond_d
    iget v1, p0, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->whenShowMicroLesson:I

    iget p1, p1, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->whenShowMicroLesson:I

    if-eq v1, p1, :cond_e

    return v2

    :cond_e
    return v0
.end method

.method public final getExamAnswers()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->examAnswers:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getExamComments()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->examComments:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getExamMicroLessonComment()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->examMicroLessonComment:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getOriginResult()Ljava/lang/Integer;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->originResult:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getOriginScore()Ljava/lang/Double;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->originScore:Ljava/lang/Double;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getResult()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->result:I

    .line 2
    .line 3
    return v0
.end method

.method public final getReviseMicroLessonComment()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->reviseMicroLessonComment:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getRevisingAnswers()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->revisingAnswers:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getRevisingComments()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->revisingComments:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getScore()D
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->score:D

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getUuid()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->uuid:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getWhenShowAnswer()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->whenShowAnswer:I

    .line 2
    .line 3
    return v0
.end method

.method public final getWhenShowMicroLesson()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->whenShowMicroLesson:I

    .line 2
    .line 3
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->uuid:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->score:D

    invoke-static {v1, v2}, Ljava/lang/Double;->hashCode(D)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->originScore:Ljava/lang/Double;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->result:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->originResult:Ljava/lang/Integer;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->examAnswers:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->examComments:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->examMicroLessonComment:Ljava/lang/String;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->revisingAnswers:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->revisingComments:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->reviseMicroLessonComment:Ljava/lang/String;

    if-nez v1, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->whenShowAnswer:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->whenShowMicroLesson:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 16

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->uuid:Ljava/lang/String;

    iget-wide v2, v0, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->score:D

    iget-object v4, v0, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->originScore:Ljava/lang/Double;

    iget v5, v0, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->result:I

    iget-object v6, v0, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->originResult:Ljava/lang/Integer;

    iget-object v7, v0, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->examAnswers:Ljava/util/List;

    iget-object v8, v0, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->examComments:Ljava/util/List;

    iget-object v9, v0, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->examMicroLessonComment:Ljava/lang/String;

    iget-object v10, v0, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->revisingAnswers:Ljava/util/List;

    iget-object v11, v0, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->revisingComments:Ljava/util/List;

    iget-object v12, v0, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->reviseMicroLessonComment:Ljava/lang/String;

    iget v13, v0, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->whenShowAnswer:I

    iget v14, v0, Lcom/zykj/evaluation/bean/DetailAnswerInfo;->whenShowMicroLesson:I

    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "DetailAnswerInfo(uuid="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", score="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, ", originScore="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", result="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", originResult="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", examAnswers="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", examComments="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", examMicroLessonComment="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", revisingAnswers="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", revisingComments="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", reviseMicroLessonComment="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", whenShowAnswer="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", whenShowMicroLesson="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
