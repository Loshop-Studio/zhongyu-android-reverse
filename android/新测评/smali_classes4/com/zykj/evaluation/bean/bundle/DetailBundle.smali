.class public final Lcom/zykj/evaluation/bean/bundle/DetailBundle;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008&\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\t\u0010&\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010(\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0003J\t\u0010)\u001a\u00020\tH\u00c6\u0003J\t\u0010*\u001a\u00020\u000bH\u00c6\u0003J\t\u0010+\u001a\u00020\u000bH\u00c6\u0003J\t\u0010,\u001a\u00020\u000bH\u00c6\u0003J\t\u0010-\u001a\u00020\u000bH\u00c6\u0003J\t\u0010.\u001a\u00020\u0010H\u00c6\u0003J\t\u0010/\u001a\u00020\u000bH\u00c6\u0003J\t\u00100\u001a\u00020\tH\u00c6\u0003J\t\u00101\u001a\u00020\u0010H\u00c6\u0003J\t\u00102\u001a\u00020\u0003H\u00c6\u0003J\u0091\u0001\u00103\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0008\u0002\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\u0008\u0008\u0002\u0010\n\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u0012\u001a\u00020\t2\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u0003H\u00c6\u0001J\u0006\u00104\u001a\u00020\tJ\u0013\u00105\u001a\u00020\u000b2\u0008\u00106\u001a\u0004\u0018\u000107H\u00d6\u0003J\t\u00108\u001a\u00020\tH\u00d6\u0001J\t\u00109\u001a\u00020\u0010H\u00d6\u0001J\u0016\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u0018R\u0017\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u001bR\u0011\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u001dR\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u001eR\u0011\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\u001eR\u0011\u0010\r\u001a\u00020\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010\u001eR\u0011\u0010\u000e\u001a\u00020\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010\u001eR\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010\"R\u0011\u0010\u0011\u001a\u00020\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u001eR\u0011\u0010\u0012\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008#\u0010\u001dR\u0011\u0010\u0013\u001a\u00020\u0010\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008$\u0010\"R\u0011\u0010\u0014\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008%\u0010\u0018\u00a8\u0006?"
    }
    d2 = {
        "Lcom/zykj/evaluation/bean/bundle/DetailBundle;",
        "Landroid/os/Parcelable;",
        "taskId",
        "",
        "examId",
        "questionList",
        "",
        "Lcom/zykj/evaluation/ui/detail/GuideQuestion;",
        "currentIndex",
        "",
        "isNoStem",
        "",
        "isEnableScore",
        "canShowAnswer",
        "canShowMicroClass",
        "examDescription",
        "",
        "isRepresentative",
        "specificTrainingType",
        "examName",
        "topicId",
        "<init>",
        "(JJLjava/util/List;IZZZZLjava/lang/String;ZILjava/lang/String;J)V",
        "getTaskId",
        "()J",
        "getExamId",
        "getQuestionList",
        "()Ljava/util/List;",
        "getCurrentIndex",
        "()I",
        "()Z",
        "getCanShowAnswer",
        "getCanShowMicroClass",
        "getExamDescription",
        "()Ljava/lang/String;",
        "getSpecificTrainingType",
        "getExamName",
        "getTopicId",
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
        "describeContents",
        "equals",
        "other",
        "",
        "hashCode",
        "toString",
        "writeToParcel",
        "",
        "dest",
        "Landroid/os/Parcel;",
        "flags",
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

.annotation build Lkotlinx/parcelize/Parcelize;
.end annotation


# static fields
.field public static final $stable:I = 0x8

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/zykj/evaluation/bean/bundle/DetailBundle;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final canShowAnswer:Z

.field private final canShowMicroClass:Z

.field private final currentIndex:I

.field private final examDescription:Ljava/lang/String;

.field private final examId:J

.field private final examName:Ljava/lang/String;

.field private final isEnableScore:Z

.field private final isNoStem:Z

.field private final isRepresentative:Z

.field private final questionList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/zykj/evaluation/ui/detail/GuideQuestion;",
            ">;"
        }
    .end annotation
.end field

.field private final specificTrainingType:I

.field private final taskId:J

.field private final topicId:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/zykj/evaluation/bean/bundle/DetailBundle$Creator;

    invoke-direct {v0}, Lcom/zykj/evaluation/bean/bundle/DetailBundle$Creator;-><init>()V

    sput-object v0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(JJLjava/util/List;IZZZZLjava/lang/String;ZILjava/lang/String;J)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJ",
            "Ljava/util/List<",
            "Lcom/zykj/evaluation/ui/detail/GuideQuestion;",
            ">;IZZZZ",
            "Ljava/lang/String;",
            "ZI",
            "Ljava/lang/String;",
            "J)V"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p14

    .line 2
    .line 3
    const-string v1, "questionList"

    .line 4
    .line 5
    invoke-static {p5, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string v1, "examDescription"

    .line 9
    .line 10
    invoke-static {p11, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const-string v1, "examName"

    .line 14
    .line 15
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-wide p1, p0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->taskId:J

    .line 22
    .line 23
    iput-wide p3, p0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->examId:J

    .line 24
    .line 25
    iput-object p5, p0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->questionList:Ljava/util/List;

    .line 26
    .line 27
    iput p6, p0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->currentIndex:I

    .line 28
    .line 29
    iput-boolean p7, p0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->isNoStem:Z

    .line 30
    .line 31
    iput-boolean p8, p0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->isEnableScore:Z

    .line 32
    .line 33
    iput-boolean p9, p0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->canShowAnswer:Z

    .line 34
    .line 35
    iput-boolean p10, p0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->canShowMicroClass:Z

    .line 36
    .line 37
    iput-object p11, p0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->examDescription:Ljava/lang/String;

    .line 38
    .line 39
    iput-boolean p12, p0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->isRepresentative:Z

    .line 40
    .line 41
    iput p13, p0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->specificTrainingType:I

    .line 42
    .line 43
    iput-object v0, p0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->examName:Ljava/lang/String;

    .line 44
    .line 45
    move-wide/from16 p1, p15

    .line 46
    .line 47
    iput-wide p1, p0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->topicId:J

    .line 48
    .line 49
    return-void
.end method

.method public static synthetic copy$default(Lcom/zykj/evaluation/bean/bundle/DetailBundle;JJLjava/util/List;IZZZZLjava/lang/String;ZILjava/lang/String;JILjava/lang/Object;)Lcom/zykj/evaluation/bean/bundle/DetailBundle;
    .locals 18

    move-object/from16 v0, p0

    move/from16 v1, p17

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-wide v2, v0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->taskId:J

    goto :goto_0

    :cond_0
    move-wide/from16 v2, p1

    :goto_0
    and-int/lit8 v4, v1, 0x2

    if-eqz v4, :cond_1

    iget-wide v4, v0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->examId:J

    goto :goto_1

    :cond_1
    move-wide/from16 v4, p3

    :goto_1
    and-int/lit8 v6, v1, 0x4

    if-eqz v6, :cond_2

    iget-object v6, v0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->questionList:Ljava/util/List;

    goto :goto_2

    :cond_2
    move-object/from16 v6, p5

    :goto_2
    and-int/lit8 v7, v1, 0x8

    if-eqz v7, :cond_3

    iget v7, v0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->currentIndex:I

    goto :goto_3

    :cond_3
    move/from16 v7, p6

    :goto_3
    and-int/lit8 v8, v1, 0x10

    if-eqz v8, :cond_4

    iget-boolean v8, v0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->isNoStem:Z

    goto :goto_4

    :cond_4
    move/from16 v8, p7

    :goto_4
    and-int/lit8 v9, v1, 0x20

    if-eqz v9, :cond_5

    iget-boolean v9, v0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->isEnableScore:Z

    goto :goto_5

    :cond_5
    move/from16 v9, p8

    :goto_5
    and-int/lit8 v10, v1, 0x40

    if-eqz v10, :cond_6

    iget-boolean v10, v0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->canShowAnswer:Z

    goto :goto_6

    :cond_6
    move/from16 v10, p9

    :goto_6
    and-int/lit16 v11, v1, 0x80

    if-eqz v11, :cond_7

    iget-boolean v11, v0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->canShowMicroClass:Z

    goto :goto_7

    :cond_7
    move/from16 v11, p10

    :goto_7
    and-int/lit16 v12, v1, 0x100

    if-eqz v12, :cond_8

    iget-object v12, v0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->examDescription:Ljava/lang/String;

    goto :goto_8

    :cond_8
    move-object/from16 v12, p11

    :goto_8
    and-int/lit16 v13, v1, 0x200

    if-eqz v13, :cond_9

    iget-boolean v13, v0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->isRepresentative:Z

    goto :goto_9

    :cond_9
    move/from16 v13, p12

    :goto_9
    and-int/lit16 v14, v1, 0x400

    if-eqz v14, :cond_a

    iget v14, v0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->specificTrainingType:I

    goto :goto_a

    :cond_a
    move/from16 v14, p13

    :goto_a
    and-int/lit16 v15, v1, 0x800

    if-eqz v15, :cond_b

    iget-object v15, v0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->examName:Ljava/lang/String;

    goto :goto_b

    :cond_b
    move-object/from16 v15, p14

    :goto_b
    and-int/lit16 v1, v1, 0x1000

    if-eqz v1, :cond_c

    move-wide/from16 v16, v2

    iget-wide v1, v0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->topicId:J

    move-wide/from16 p16, v1

    move-wide/from16 p2, v16

    :goto_c
    move-object/from16 p1, v0

    move-wide/from16 p4, v4

    move-object/from16 p6, v6

    move/from16 p7, v7

    move/from16 p8, v8

    move/from16 p9, v9

    move/from16 p10, v10

    move/from16 p11, v11

    move-object/from16 p12, v12

    move/from16 p13, v13

    move/from16 p14, v14

    move-object/from16 p15, v15

    goto :goto_d

    :cond_c
    move-wide/from16 p16, p15

    move-wide/from16 p2, v2

    goto :goto_c

    :goto_d
    invoke-virtual/range {p1 .. p17}, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->copy(JJLjava/util/List;IZZZZLjava/lang/String;ZILjava/lang/String;J)Lcom/zykj/evaluation/bean/bundle/DetailBundle;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()J
    .locals 2

    iget-wide v0, p0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->taskId:J

    return-wide v0
.end method

.method public final component10()Z
    .locals 1

    iget-boolean v0, p0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->isRepresentative:Z

    return v0
.end method

.method public final component11()I
    .locals 1

    iget v0, p0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->specificTrainingType:I

    return v0
.end method

.method public final component12()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->examName:Ljava/lang/String;

    return-object v0
.end method

.method public final component13()J
    .locals 2

    iget-wide v0, p0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->topicId:J

    return-wide v0
.end method

.method public final component2()J
    .locals 2

    iget-wide v0, p0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->examId:J

    return-wide v0
.end method

.method public final component3()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/evaluation/ui/detail/GuideQuestion;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->questionList:Ljava/util/List;

    return-object v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->currentIndex:I

    return v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->isNoStem:Z

    return v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->isEnableScore:Z

    return v0
.end method

.method public final component7()Z
    .locals 1

    iget-boolean v0, p0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->canShowAnswer:Z

    return v0
.end method

.method public final component8()Z
    .locals 1

    iget-boolean v0, p0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->canShowMicroClass:Z

    return v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->examDescription:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(JJLjava/util/List;IZZZZLjava/lang/String;ZILjava/lang/String;J)Lcom/zykj/evaluation/bean/bundle/DetailBundle;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJ",
            "Ljava/util/List<",
            "Lcom/zykj/evaluation/ui/detail/GuideQuestion;",
            ">;IZZZZ",
            "Ljava/lang/String;",
            "ZI",
            "Ljava/lang/String;",
            "J)",
            "Lcom/zykj/evaluation/bean/bundle/DetailBundle;"
        }
    .end annotation

    const-string v0, "questionList"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "examDescription"

    move-object/from16 v12, p11

    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "examName"

    move-object/from16 v15, p14

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/zykj/evaluation/bean/bundle/DetailBundle;

    move-wide/from16 v2, p1

    move-wide/from16 v4, p3

    move/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    move/from16 v10, p9

    move/from16 v11, p10

    move/from16 v13, p12

    move/from16 v14, p13

    move-wide/from16 v16, p15

    invoke-direct/range {v1 .. v17}, Lcom/zykj/evaluation/bean/bundle/DetailBundle;-><init>(JJLjava/util/List;IZZZZLjava/lang/String;ZILjava/lang/String;J)V

    return-object v1
.end method

.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/evaluation/bean/bundle/DetailBundle;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/evaluation/bean/bundle/DetailBundle;

    iget-wide v3, p0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->taskId:J

    iget-wide v5, p1, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->taskId:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->examId:J

    iget-wide v5, p1, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->examId:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->questionList:Ljava/util/List;

    iget-object v3, p1, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->questionList:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->currentIndex:I

    iget v3, p1, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->currentIndex:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->isNoStem:Z

    iget-boolean v3, p1, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->isNoStem:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->isEnableScore:Z

    iget-boolean v3, p1, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->isEnableScore:Z

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-boolean v1, p0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->canShowAnswer:Z

    iget-boolean v3, p1, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->canShowAnswer:Z

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-boolean v1, p0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->canShowMicroClass:Z

    iget-boolean v3, p1, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->canShowMicroClass:Z

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->examDescription:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->examDescription:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-boolean v1, p0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->isRepresentative:Z

    iget-boolean v3, p1, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->isRepresentative:Z

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget v1, p0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->specificTrainingType:I

    iget v3, p1, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->specificTrainingType:I

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->examName:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->examName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-wide v3, p0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->topicId:J

    iget-wide v5, p1, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->topicId:J

    cmp-long p1, v3, v5

    if-eqz p1, :cond_e

    return v2

    :cond_e
    return v0
.end method

.method public final getCanShowAnswer()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->canShowAnswer:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getCanShowMicroClass()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->canShowMicroClass:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getCurrentIndex()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->currentIndex:I

    .line 2
    .line 3
    return v0
.end method

.method public final getExamDescription()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->examDescription:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getExamId()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->examId:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getExamName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->examName:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getQuestionList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/evaluation/ui/detail/GuideQuestion;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->questionList:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getSpecificTrainingType()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->specificTrainingType:I

    .line 2
    .line 3
    return v0
.end method

.method public final getTaskId()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->taskId:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getTopicId()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->topicId:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public hashCode()I
    .locals 3

    iget-wide v0, p0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->taskId:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->examId:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->questionList:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->currentIndex:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->isNoStem:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->isEnableScore:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->canShowAnswer:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->canShowMicroClass:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->examDescription:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->isRepresentative:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->specificTrainingType:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->examName:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->topicId:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final isEnableScore()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->isEnableScore:Z

    .line 2
    .line 3
    return v0
.end method

.method public final isNoStem()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->isNoStem:Z

    .line 2
    .line 3
    return v0
.end method

.method public final isRepresentative()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->isRepresentative:Z

    .line 2
    .line 3
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 19

    move-object/from16 v0, p0

    iget-wide v1, v0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->taskId:J

    iget-wide v3, v0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->examId:J

    iget-object v5, v0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->questionList:Ljava/util/List;

    iget v6, v0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->currentIndex:I

    iget-boolean v7, v0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->isNoStem:Z

    iget-boolean v8, v0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->isEnableScore:Z

    iget-boolean v9, v0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->canShowAnswer:Z

    iget-boolean v10, v0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->canShowMicroClass:Z

    iget-object v11, v0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->examDescription:Ljava/lang/String;

    iget-boolean v12, v0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->isRepresentative:Z

    iget v13, v0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->specificTrainingType:I

    iget-object v14, v0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->examName:Ljava/lang/String;

    move-object/from16 v16, v14

    iget-wide v14, v0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->topicId:J

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-wide/from16 v17, v14

    const-string v14, "DetailBundle(taskId="

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", examId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", questionList="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", currentIndex="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", isNoStem="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", isEnableScore="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", canShowAnswer="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", canShowMicroClass="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", examDescription="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", isRepresentative="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", specificTrainingType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", examName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", topicId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-wide/from16 v1, v17

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-wide v0, p0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->taskId:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget-wide v0, p0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->examId:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget-object v0, p0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->questionList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/zykj/evaluation/ui/detail/GuideQuestion;

    invoke-virtual {v1, p1, p2}, Lcom/zykj/evaluation/ui/detail/GuideQuestion;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    :cond_0
    iget p2, p0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->currentIndex:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean p2, p0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->isNoStem:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean p2, p0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->isEnableScore:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean p2, p0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->canShowAnswer:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean p2, p0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->canShowMicroClass:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->examDescription:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean p2, p0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->isRepresentative:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->specificTrainingType:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->examName:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-wide v0, p0, Lcom/zykj/evaluation/bean/bundle/DetailBundle;->topicId:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    return-void
.end method
