.class public final Lcom/zykj/study/bean/exercise/QuestionBean;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# static fields
.field public static final $stable:I

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/zykj/study/bean/exercise/QuestionBean;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final analysis:Ljava/lang/String;

.field private final answer:Ljava/lang/String;

.field private answerEx:Ljava/lang/String;

.field private final answerForStu:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field private final answerSubmitString:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "answerSubmited"
    .end annotation
.end field

.field private final content:Ljava/lang/String;

.field private final correct:Z

.field private correctAnswers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final extra:Lcom/zykj/study/bean/exercise/QuestionExtra;

.field private final id:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        alternate = {
            "questionId"
        }
        value = "id"
    .end annotation
.end field

.field private final progress:Ljava/lang/Integer;

.field private final questionType:Lcom/zykj/study/bean/exercise/QuestionType;

.field private final rawOptions:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "options"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private status:Lcom/zykj/study/bean/exercise/QuestionStatus;

.field private final totalNum:Ljava/lang/Integer;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/zykj/study/bean/exercise/QuestionBean$Creator;

    invoke-direct {v0}, Lcom/zykj/study/bean/exercise/QuestionBean$Creator;-><init>()V

    sput-object v0, Lcom/zykj/study/bean/exercise/QuestionBean;->CREATOR:Landroid/os/Parcelable$Creator;

    const/16 v0, 0x8

    sput v0, Lcom/zykj/study/bean/exercise/QuestionBean;->$stable:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ZLjava/lang/String;Lcom/zykj/study/bean/exercise/QuestionType;Lcom/zykj/study/bean/exercise/QuestionStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/study/bean/exercise/QuestionExtra;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z",
            "Ljava/lang/String;",
            "Lcom/zykj/study/bean/exercise/QuestionType;",
            "Lcom/zykj/study/bean/exercise/QuestionStatus;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/zykj/study/bean/exercise/QuestionExtra;",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/Integer;",
            ")V"
        }
    .end annotation

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/zykj/study/bean/exercise/QuestionBean;->id:Ljava/lang/String;

    .line 3
    iput-boolean p2, p0, Lcom/zykj/study/bean/exercise/QuestionBean;->correct:Z

    .line 4
    iput-object p3, p0, Lcom/zykj/study/bean/exercise/QuestionBean;->content:Ljava/lang/String;

    .line 5
    iput-object p4, p0, Lcom/zykj/study/bean/exercise/QuestionBean;->questionType:Lcom/zykj/study/bean/exercise/QuestionType;

    .line 6
    iput-object p5, p0, Lcom/zykj/study/bean/exercise/QuestionBean;->status:Lcom/zykj/study/bean/exercise/QuestionStatus;

    .line 7
    iput-object p6, p0, Lcom/zykj/study/bean/exercise/QuestionBean;->answer:Ljava/lang/String;

    .line 8
    iput-object p7, p0, Lcom/zykj/study/bean/exercise/QuestionBean;->answerEx:Ljava/lang/String;

    .line 9
    iput-object p8, p0, Lcom/zykj/study/bean/exercise/QuestionBean;->analysis:Ljava/lang/String;

    .line 10
    iput-object p9, p0, Lcom/zykj/study/bean/exercise/QuestionBean;->extra:Lcom/zykj/study/bean/exercise/QuestionExtra;

    .line 11
    iput-object p10, p0, Lcom/zykj/study/bean/exercise/QuestionBean;->answerSubmitString:Ljava/lang/String;

    .line 12
    iput-object p11, p0, Lcom/zykj/study/bean/exercise/QuestionBean;->progress:Ljava/lang/Integer;

    .line 13
    iput-object p12, p0, Lcom/zykj/study/bean/exercise/QuestionBean;->answerForStu:Ljava/util/Map;

    .line 14
    iput-object p13, p0, Lcom/zykj/study/bean/exercise/QuestionBean;->correctAnswers:Ljava/util/List;

    .line 15
    iput-object p14, p0, Lcom/zykj/study/bean/exercise/QuestionBean;->rawOptions:Ljava/util/List;

    move-object/from16 p1, p15

    .line 16
    iput-object p1, p0, Lcom/zykj/study/bean/exercise/QuestionBean;->totalNum:Ljava/lang/Integer;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ZLjava/lang/String;Lcom/zykj/study/bean/exercise/QuestionType;Lcom/zykj/study/bean/exercise/QuestionStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/study/bean/exercise/QuestionExtra;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;ILkotlin/jvm/internal/n;)V
    .locals 18

    move/from16 v0, p16

    and-int/lit16 v1, v0, 0x800

    if-eqz v1, :cond_0

    .line 17
    invoke-static {}, Lkotlin/collections/a;->h()Ljava/util/Map;

    move-result-object v1

    move-object v14, v1

    goto :goto_0

    :cond_0
    move-object/from16 v14, p12

    :goto_0
    and-int/lit16 v1, v0, 0x1000

    if-eqz v1, :cond_1

    .line 18
    invoke-static {}, Li7/v;->n()Ljava/util/List;

    move-result-object v1

    move-object v15, v1

    goto :goto_1

    :cond_1
    move-object/from16 v15, p13

    :goto_1
    and-int/lit16 v1, v0, 0x2000

    if-eqz v1, :cond_2

    const/4 v1, 0x0

    move-object/from16 v16, v1

    goto :goto_2

    :cond_2
    move-object/from16 v16, p14

    :goto_2
    and-int/lit16 v0, v0, 0x4000

    if-eqz v0, :cond_3

    const/4 v0, 0x0

    .line 19
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    move-object/from16 v17, v0

    :goto_3
    move-object/from16 v2, p0

    move-object/from16 v3, p1

    move/from16 v4, p2

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    move-object/from16 v10, p8

    move-object/from16 v11, p9

    move-object/from16 v12, p10

    move-object/from16 v13, p11

    goto :goto_4

    :cond_3
    move-object/from16 v17, p15

    goto :goto_3

    .line 20
    :goto_4
    invoke-direct/range {v2 .. v17}, Lcom/zykj/study/bean/exercise/QuestionBean;-><init>(Ljava/lang/String;ZLjava/lang/String;Lcom/zykj/study/bean/exercise/QuestionType;Lcom/zykj/study/bean/exercise/QuestionStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/study/bean/exercise/QuestionExtra;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;)V

    return-void
.end method

.method private final component14()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/zykj/study/bean/exercise/QuestionBean;->rawOptions:Ljava/util/List;

    return-object v0
.end method

.method private final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zykj/study/bean/exercise/QuestionBean;->answer:Ljava/lang/String;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/zykj/study/bean/exercise/QuestionBean;Ljava/lang/String;ZLjava/lang/String;Lcom/zykj/study/bean/exercise/QuestionType;Lcom/zykj/study/bean/exercise/QuestionStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/study/bean/exercise/QuestionExtra;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;ILjava/lang/Object;)Lcom/zykj/study/bean/exercise/QuestionBean;
    .locals 16

    move-object/from16 v0, p0

    move/from16 v1, p16

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/zykj/study/bean/exercise/QuestionBean;->id:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-boolean v3, v0, Lcom/zykj/study/bean/exercise/QuestionBean;->correct:Z

    goto :goto_1

    :cond_1
    move/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/zykj/study/bean/exercise/QuestionBean;->content:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lcom/zykj/study/bean/exercise/QuestionBean;->questionType:Lcom/zykj/study/bean/exercise/QuestionType;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lcom/zykj/study/bean/exercise/QuestionBean;->status:Lcom/zykj/study/bean/exercise/QuestionStatus;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lcom/zykj/study/bean/exercise/QuestionBean;->answer:Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lcom/zykj/study/bean/exercise/QuestionBean;->answerEx:Ljava/lang/String;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lcom/zykj/study/bean/exercise/QuestionBean;->analysis:Ljava/lang/String;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lcom/zykj/study/bean/exercise/QuestionBean;->extra:Lcom/zykj/study/bean/exercise/QuestionExtra;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lcom/zykj/study/bean/exercise/QuestionBean;->answerSubmitString:Ljava/lang/String;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lcom/zykj/study/bean/exercise/QuestionBean;->progress:Ljava/lang/Integer;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Lcom/zykj/study/bean/exercise/QuestionBean;->answerForStu:Ljava/util/Map;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Lcom/zykj/study/bean/exercise/QuestionBean;->correctAnswers:Ljava/util/List;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lcom/zykj/study/bean/exercise/QuestionBean;->rawOptions:Ljava/util/List;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    and-int/lit16 v1, v1, 0x4000

    if-eqz v1, :cond_e

    iget-object v1, v0, Lcom/zykj/study/bean/exercise/QuestionBean;->totalNum:Ljava/lang/Integer;

    move-object/from16 p16, v1

    :goto_e
    move-object/from16 p1, v0

    move-object/from16 p2, v2

    move/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move-object/from16 p9, v9

    move-object/from16 p10, v10

    move-object/from16 p11, v11

    move-object/from16 p12, v12

    move-object/from16 p13, v13

    move-object/from16 p14, v14

    move-object/from16 p15, v15

    goto :goto_f

    :cond_e
    move-object/from16 p16, p15

    goto :goto_e

    :goto_f
    invoke-virtual/range {p1 .. p16}, Lcom/zykj/study/bean/exercise/QuestionBean;->copy(Ljava/lang/String;ZLjava/lang/String;Lcom/zykj/study/bean/exercise/QuestionType;Lcom/zykj/study/bean/exercise/QuestionStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/study/bean/exercise/QuestionExtra;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;)Lcom/zykj/study/bean/exercise/QuestionBean;

    move-result-object v0

    return-object v0
.end method

.method private final screenWidthDp()F
    .locals 2

    .line 1
    sget-object v0, Lcom/zykj/utils/AppUtils;->a:Lcom/zykj/utils/AppUtils;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/utils/AppUtils;->a()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "window"

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, "null cannot be cast to non-null type android.view.WindowManager"

    .line 14
    .line 15
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    check-cast v0, Landroid/view/WindowManager;

    .line 19
    .line 20
    new-instance v1, Landroid/util/DisplayMetrics;

    .line 21
    .line 22
    invoke-direct {v1}, Landroid/util/DisplayMetrics;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0, v1}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 30
    .line 31
    .line 32
    iget v0, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 33
    .line 34
    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    .line 35
    .line 36
    int-to-float v0, v0

    .line 37
    div-float/2addr v0, v1

    .line 38
    return v0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zykj/study/bean/exercise/QuestionBean;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zykj/study/bean/exercise/QuestionBean;->answerSubmitString:Ljava/lang/String;

    return-object v0
.end method

.method public final component11()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/zykj/study/bean/exercise/QuestionBean;->progress:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component12()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/zykj/study/bean/exercise/QuestionBean;->answerForStu:Ljava/util/Map;

    return-object v0
.end method

.method public final component13()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/zykj/study/bean/exercise/QuestionBean;->correctAnswers:Ljava/util/List;

    return-object v0
.end method

.method public final component15()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/zykj/study/bean/exercise/QuestionBean;->totalNum:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lcom/zykj/study/bean/exercise/QuestionBean;->correct:Z

    return v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zykj/study/bean/exercise/QuestionBean;->content:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Lcom/zykj/study/bean/exercise/QuestionType;
    .locals 1

    iget-object v0, p0, Lcom/zykj/study/bean/exercise/QuestionBean;->questionType:Lcom/zykj/study/bean/exercise/QuestionType;

    return-object v0
.end method

.method public final component5()Lcom/zykj/study/bean/exercise/QuestionStatus;
    .locals 1

    iget-object v0, p0, Lcom/zykj/study/bean/exercise/QuestionBean;->status:Lcom/zykj/study/bean/exercise/QuestionStatus;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zykj/study/bean/exercise/QuestionBean;->answerEx:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zykj/study/bean/exercise/QuestionBean;->analysis:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Lcom/zykj/study/bean/exercise/QuestionExtra;
    .locals 1

    iget-object v0, p0, Lcom/zykj/study/bean/exercise/QuestionBean;->extra:Lcom/zykj/study/bean/exercise/QuestionExtra;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;ZLjava/lang/String;Lcom/zykj/study/bean/exercise/QuestionType;Lcom/zykj/study/bean/exercise/QuestionStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/study/bean/exercise/QuestionExtra;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;)Lcom/zykj/study/bean/exercise/QuestionBean;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z",
            "Ljava/lang/String;",
            "Lcom/zykj/study/bean/exercise/QuestionType;",
            "Lcom/zykj/study/bean/exercise/QuestionStatus;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/zykj/study/bean/exercise/QuestionExtra;",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/Integer;",
            ")",
            "Lcom/zykj/study/bean/exercise/QuestionBean;"
        }
    .end annotation

    const-string v0, "id"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/zykj/study/bean/exercise/QuestionBean;

    move/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    invoke-direct/range {v1 .. v16}, Lcom/zykj/study/bean/exercise/QuestionBean;-><init>(Ljava/lang/String;ZLjava/lang/String;Lcom/zykj/study/bean/exercise/QuestionType;Lcom/zykj/study/bean/exercise/QuestionStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/study/bean/exercise/QuestionExtra;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;)V

    return-object v1
.end method

.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/study/bean/exercise/QuestionBean;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/study/bean/exercise/QuestionBean;

    iget-object v1, p0, Lcom/zykj/study/bean/exercise/QuestionBean;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/study/bean/exercise/QuestionBean;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lcom/zykj/study/bean/exercise/QuestionBean;->correct:Z

    iget-boolean v3, p1, Lcom/zykj/study/bean/exercise/QuestionBean;->correct:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/zykj/study/bean/exercise/QuestionBean;->content:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/study/bean/exercise/QuestionBean;->content:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/zykj/study/bean/exercise/QuestionBean;->questionType:Lcom/zykj/study/bean/exercise/QuestionType;

    iget-object v3, p1, Lcom/zykj/study/bean/exercise/QuestionBean;->questionType:Lcom/zykj/study/bean/exercise/QuestionType;

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/zykj/study/bean/exercise/QuestionBean;->status:Lcom/zykj/study/bean/exercise/QuestionStatus;

    iget-object v3, p1, Lcom/zykj/study/bean/exercise/QuestionBean;->status:Lcom/zykj/study/bean/exercise/QuestionStatus;

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/zykj/study/bean/exercise/QuestionBean;->answer:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/study/bean/exercise/QuestionBean;->answer:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/zykj/study/bean/exercise/QuestionBean;->answerEx:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/study/bean/exercise/QuestionBean;->answerEx:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/zykj/study/bean/exercise/QuestionBean;->analysis:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/study/bean/exercise/QuestionBean;->analysis:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/zykj/study/bean/exercise/QuestionBean;->extra:Lcom/zykj/study/bean/exercise/QuestionExtra;

    iget-object v3, p1, Lcom/zykj/study/bean/exercise/QuestionBean;->extra:Lcom/zykj/study/bean/exercise/QuestionExtra;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/zykj/study/bean/exercise/QuestionBean;->answerSubmitString:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/study/bean/exercise/QuestionBean;->answerSubmitString:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/zykj/study/bean/exercise/QuestionBean;->progress:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/zykj/study/bean/exercise/QuestionBean;->progress:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/zykj/study/bean/exercise/QuestionBean;->answerForStu:Ljava/util/Map;

    iget-object v3, p1, Lcom/zykj/study/bean/exercise/QuestionBean;->answerForStu:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/zykj/study/bean/exercise/QuestionBean;->correctAnswers:Ljava/util/List;

    iget-object v3, p1, Lcom/zykj/study/bean/exercise/QuestionBean;->correctAnswers:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lcom/zykj/study/bean/exercise/QuestionBean;->rawOptions:Ljava/util/List;

    iget-object v3, p1, Lcom/zykj/study/bean/exercise/QuestionBean;->rawOptions:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lcom/zykj/study/bean/exercise/QuestionBean;->totalNum:Ljava/lang/Integer;

    iget-object p1, p1, Lcom/zykj/study/bean/exercise/QuestionBean;->totalNum:Ljava/lang/Integer;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_10

    return v2

    :cond_10
    return v0
.end method

.method public final fetchAdaptAnalysis()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/study/bean/exercise/QuestionBean;->analysis:Ljava/lang/String;

    .line 2
    .line 3
    invoke-direct {p0}, Lcom/zykj/study/bean/exercise/QuestionBean;->screenWidthDp()F

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x2

    .line 8
    int-to-float v2, v2

    .line 9
    div-float/2addr v1, v2

    .line 10
    const v2, 0x3f666666    # 0.9f

    .line 11
    .line 12
    .line 13
    mul-float/2addr v1, v2

    .line 14
    new-instance v2, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string v0, "<style>img{max-width:"

    .line 23
    .line 24
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v0, "px !important;height:auto !important;}p{width:100%;word-break:break-all;overflow-x:hidden;}</style>"

    .line 31
    .line 32
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    return-object v0
.end method

.method public final fetchAdaptContent()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/study/bean/exercise/QuestionBean;->content:Ljava/lang/String;

    .line 2
    .line 3
    invoke-direct {p0}, Lcom/zykj/study/bean/exercise/QuestionBean;->screenWidthDp()F

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x2

    .line 8
    int-to-float v2, v2

    .line 9
    div-float/2addr v1, v2

    .line 10
    const v2, 0x3f666666    # 0.9f

    .line 11
    .line 12
    .line 13
    mul-float/2addr v1, v2

    .line 14
    new-instance v2, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string v0, "<style>img{width:auto !important;max-width:"

    .line 23
    .line 24
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v0, "px !important;}p{width:100%;word-break:break-all;overflow-x:hidden;}</style>"

    .line 31
    .line 32
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    return-object v0
.end method

.method public final getAdaptStandardAnswerStr()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/study/bean/exercise/QuestionBean;->questionType:Lcom/zykj/study/bean/exercise/QuestionType;

    .line 2
    .line 3
    sget-object v1, Lcom/zykj/study/bean/exercise/QuestionType;->ANSWER:Lcom/zykj/study/bean/exercise/QuestionType;

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/zykj/study/bean/exercise/QuestionBean;->answer:Ljava/lang/String;

    .line 8
    .line 9
    invoke-direct {p0}, Lcom/zykj/study/bean/exercise/QuestionBean;->screenWidthDp()F

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x2

    .line 14
    int-to-float v2, v2

    .line 15
    div-float/2addr v1, v2

    .line 16
    const v2, 0x3f666666    # 0.9f

    .line 17
    .line 18
    .line 19
    mul-float/2addr v1, v2

    .line 20
    new-instance v2, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v0, "<style>img{max-width:"

    .line 29
    .line 30
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string v0, "px !important;height:auto !important;}p{width:100%;word-break:break-all;overflow-x:hidden;}</style>"

    .line 37
    .line 38
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    return-object v0

    .line 46
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/study/bean/exercise/QuestionBean;->getStandardAnswerList()Lcom/zykj/study/utils/ChoiceList;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {v0}, Lcom/zykj/study/utils/ChoiceList;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    return-object v0
.end method

.method public final getAnalysis()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/bean/exercise/QuestionBean;->analysis:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getAnswerEx()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/bean/exercise/QuestionBean;->answerEx:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getAnswerForStu()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/study/bean/exercise/QuestionBean;->answerForStu:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getAnswerSubmit()Lcom/zykj/study/utils/ChoiceList;
    .locals 7

    .line 1
    new-instance v0, Lcom/zykj/study/utils/ChoiceList;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/zykj/study/utils/ChoiceList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/zykj/study/bean/exercise/QuestionBean;->answerSubmitString:Ljava/lang/String;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    const-string v2, ","

    .line 11
    .line 12
    filled-new-array {v2}, [Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    const/4 v5, 0x6

    .line 17
    const/4 v6, 0x0

    .line 18
    const/4 v3, 0x0

    .line 19
    const/4 v4, 0x0

    .line 20
    invoke-static/range {v1 .. v6}, Lg8/c0;->I0(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    new-instance v2, Ljava/util/ArrayList;

    .line 27
    .line 28
    const/16 v3, 0xa

    .line 29
    .line 30
    invoke-static {v1, v3}, Li7/w;->x(Ljava/lang/Iterable;I)I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 35
    .line 36
    .line 37
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-eqz v3, :cond_0

    .line 46
    .line 47
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    check-cast v3, Ljava/lang/String;

    .line 52
    .line 53
    invoke-virtual {v0, v3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_0
    return-object v0
.end method

.method public final getAnswerSubmitString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/bean/exercise/QuestionBean;->answerSubmitString:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getContent()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/bean/exercise/QuestionBean;->content:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getCorrect()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/study/bean/exercise/QuestionBean;->correct:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getCorrectAnswers()Ljava/util/List;
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
    iget-object v0, p0, Lcom/zykj/study/bean/exercise/QuestionBean;->correctAnswers:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getExtra()Lcom/zykj/study/bean/exercise/QuestionExtra;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/bean/exercise/QuestionBean;->extra:Lcom/zykj/study/bean/exercise/QuestionExtra;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/bean/exercise/QuestionBean;->id:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getOptions()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/study/bean/exercise/QuestionBean;->questionType:Lcom/zykj/study/bean/exercise/QuestionType;

    .line 2
    .line 3
    sget-object v1, Lcom/zykj/study/bean/exercise/QuestionType;->ANSWER:Lcom/zykj/study/bean/exercise/QuestionType;

    .line 4
    .line 5
    if-ne v0, v1, :cond_1

    .line 6
    .line 7
    iget-object v0, p0, Lcom/zykj/study/bean/exercise/QuestionBean;->rawOptions:Ljava/util/List;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    :cond_0
    const-string v0, "A"

    .line 18
    .line 19
    const-string v1, "B"

    .line 20
    .line 21
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-static {v0}, Li7/v;->q([Ljava/lang/Object;)Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    return-object v0

    .line 30
    :cond_1
    iget-object v0, p0, Lcom/zykj/study/bean/exercise/QuestionBean;->rawOptions:Ljava/util/List;

    .line 31
    .line 32
    if-nez v0, :cond_2

    .line 33
    .line 34
    invoke-static {}, Li7/v;->n()Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    :cond_2
    return-object v0
.end method

.method public final getProgress()Ljava/lang/Integer;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/bean/exercise/QuestionBean;->progress:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getQuestionType()Lcom/zykj/study/bean/exercise/QuestionType;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/bean/exercise/QuestionBean;->questionType:Lcom/zykj/study/bean/exercise/QuestionType;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getStandardAnswerList()Lcom/zykj/study/utils/ChoiceList;
    .locals 13

    .line 1
    new-instance v0, Lcom/zykj/study/utils/ChoiceList;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/zykj/study/utils/ChoiceList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/zykj/study/bean/exercise/QuestionBean;->answer:Ljava/lang/String;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    const/4 v5, 0x4

    .line 11
    const/4 v6, 0x0

    .line 12
    const-string v2, "["

    .line 13
    .line 14
    const-string v3, ""

    .line 15
    .line 16
    const/4 v4, 0x0

    .line 17
    invoke-static/range {v1 .. v6}, Lg8/z;->I(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v7

    .line 21
    if-eqz v7, :cond_0

    .line 22
    .line 23
    const/4 v11, 0x4

    .line 24
    const/4 v12, 0x0

    .line 25
    const-string v8, "]"

    .line 26
    .line 27
    const-string v9, ""

    .line 28
    .line 29
    const/4 v10, 0x0

    .line 30
    invoke-static/range {v7 .. v12}, Lg8/z;->I(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    if-eqz v1, :cond_0

    .line 35
    .line 36
    const/4 v5, 0x4

    .line 37
    const/4 v6, 0x0

    .line 38
    const-string v2, "\""

    .line 39
    .line 40
    const-string v3, ""

    .line 41
    .line 42
    const/4 v4, 0x0

    .line 43
    invoke-static/range {v1 .. v6}, Lg8/z;->I(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v7

    .line 47
    if-eqz v7, :cond_0

    .line 48
    .line 49
    const-string v1, ","

    .line 50
    .line 51
    filled-new-array {v1}, [Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v8

    .line 55
    const/4 v11, 0x6

    .line 56
    const/4 v12, 0x0

    .line 57
    const/4 v9, 0x0

    .line 58
    const/4 v10, 0x0

    .line 59
    invoke-static/range {v7 .. v12}, Lg8/c0;->I0(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    if-eqz v1, :cond_0

    .line 64
    .line 65
    new-instance v2, Ljava/util/ArrayList;

    .line 66
    .line 67
    const/16 v3, 0xa

    .line 68
    .line 69
    invoke-static {v1, v3}, Li7/w;->x(Ljava/lang/Iterable;I)I

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 74
    .line 75
    .line 76
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    if-eqz v3, :cond_0

    .line 85
    .line 86
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    check-cast v3, Ljava/lang/String;

    .line 91
    .line 92
    invoke-virtual {v0, v3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v3

    .line 96
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_0
    return-object v0
.end method

.method public final getStatus()Lcom/zykj/study/bean/exercise/QuestionStatus;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/bean/exercise/QuestionBean;->status:Lcom/zykj/study/bean/exercise/QuestionStatus;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getTotalNum()Ljava/lang/Integer;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/bean/exercise/QuestionBean;->totalNum:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/zykj/study/bean/exercise/QuestionBean;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/zykj/study/bean/exercise/QuestionBean;->correct:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/study/bean/exercise/QuestionBean;->content:Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/study/bean/exercise/QuestionBean;->questionType:Lcom/zykj/study/bean/exercise/QuestionType;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/study/bean/exercise/QuestionBean;->status:Lcom/zykj/study/bean/exercise/QuestionStatus;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/study/bean/exercise/QuestionBean;->answer:Ljava/lang/String;

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/study/bean/exercise/QuestionBean;->answerEx:Ljava/lang/String;

    if-nez v1, :cond_4

    move v1, v2

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_4
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/study/bean/exercise/QuestionBean;->analysis:Ljava/lang/String;

    if-nez v1, :cond_5

    move v1, v2

    goto :goto_5

    :cond_5
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_5
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/study/bean/exercise/QuestionBean;->extra:Lcom/zykj/study/bean/exercise/QuestionExtra;

    if-nez v1, :cond_6

    move v1, v2

    goto :goto_6

    :cond_6
    invoke-virtual {v1}, Lcom/zykj/study/bean/exercise/QuestionExtra;->hashCode()I

    move-result v1

    :goto_6
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/study/bean/exercise/QuestionBean;->answerSubmitString:Ljava/lang/String;

    if-nez v1, :cond_7

    move v1, v2

    goto :goto_7

    :cond_7
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_7
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/study/bean/exercise/QuestionBean;->progress:Ljava/lang/Integer;

    if-nez v1, :cond_8

    move v1, v2

    goto :goto_8

    :cond_8
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_8
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/study/bean/exercise/QuestionBean;->answerForStu:Ljava/util/Map;

    if-nez v1, :cond_9

    move v1, v2

    goto :goto_9

    :cond_9
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_9
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/study/bean/exercise/QuestionBean;->correctAnswers:Ljava/util/List;

    if-nez v1, :cond_a

    move v1, v2

    goto :goto_a

    :cond_a
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_a
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/study/bean/exercise/QuestionBean;->rawOptions:Ljava/util/List;

    if-nez v1, :cond_b

    move v1, v2

    goto :goto_b

    :cond_b
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_b
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/study/bean/exercise/QuestionBean;->totalNum:Ljava/lang/Integer;

    if-nez v1, :cond_c

    goto :goto_c

    :cond_c
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_c
    add-int/2addr v0, v2

    return v0
.end method

.method public final setAnswerEx(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/bean/exercise/QuestionBean;->answerEx:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setCorrectAnswers(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/study/bean/exercise/QuestionBean;->correctAnswers:Ljava/util/List;

    .line 2
    .line 3
    return-void
.end method

.method public final setStatus(Lcom/zykj/study/bean/exercise/QuestionStatus;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/bean/exercise/QuestionBean;->status:Lcom/zykj/study/bean/exercise/QuestionStatus;

    .line 2
    .line 3
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 17

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/zykj/study/bean/exercise/QuestionBean;->id:Ljava/lang/String;

    iget-boolean v2, v0, Lcom/zykj/study/bean/exercise/QuestionBean;->correct:Z

    iget-object v3, v0, Lcom/zykj/study/bean/exercise/QuestionBean;->content:Ljava/lang/String;

    iget-object v4, v0, Lcom/zykj/study/bean/exercise/QuestionBean;->questionType:Lcom/zykj/study/bean/exercise/QuestionType;

    iget-object v5, v0, Lcom/zykj/study/bean/exercise/QuestionBean;->status:Lcom/zykj/study/bean/exercise/QuestionStatus;

    iget-object v6, v0, Lcom/zykj/study/bean/exercise/QuestionBean;->answer:Ljava/lang/String;

    iget-object v7, v0, Lcom/zykj/study/bean/exercise/QuestionBean;->answerEx:Ljava/lang/String;

    iget-object v8, v0, Lcom/zykj/study/bean/exercise/QuestionBean;->analysis:Ljava/lang/String;

    iget-object v9, v0, Lcom/zykj/study/bean/exercise/QuestionBean;->extra:Lcom/zykj/study/bean/exercise/QuestionExtra;

    iget-object v10, v0, Lcom/zykj/study/bean/exercise/QuestionBean;->answerSubmitString:Ljava/lang/String;

    iget-object v11, v0, Lcom/zykj/study/bean/exercise/QuestionBean;->progress:Ljava/lang/Integer;

    iget-object v12, v0, Lcom/zykj/study/bean/exercise/QuestionBean;->answerForStu:Ljava/util/Map;

    iget-object v13, v0, Lcom/zykj/study/bean/exercise/QuestionBean;->correctAnswers:Ljava/util/List;

    iget-object v14, v0, Lcom/zykj/study/bean/exercise/QuestionBean;->rawOptions:Ljava/util/List;

    iget-object v15, v0, Lcom/zykj/study/bean/exercise/QuestionBean;->totalNum:Ljava/lang/Integer;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v16, v15

    const-string v15, "QuestionBean(id="

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", correct="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", content="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", questionType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", status="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", answer="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", answerEx="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", analysis="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", extra="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", answerSubmitString="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", progress="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", answerForStu="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", correctAnswers="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", rawOptions="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", totalNum="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    .line 1
    const-string v0, "dest"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/study/bean/exercise/QuestionBean;->id:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-boolean v0, p0, Lcom/zykj/study/bean/exercise/QuestionBean;->correct:Z

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/zykj/study/bean/exercise/QuestionBean;->content:Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lcom/zykj/study/bean/exercise/QuestionBean;->questionType:Lcom/zykj/study/bean/exercise/QuestionType;

    .line 22
    .line 23
    const/4 v1, 0x1

    .line 24
    const/4 v2, 0x0

    .line 25
    if-nez v0, :cond_0

    .line 26
    .line 27
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    :goto_0
    iget-object v0, p0, Lcom/zykj/study/bean/exercise/QuestionBean;->status:Lcom/zykj/study/bean/exercise/QuestionStatus;

    .line 42
    .line 43
    if-nez v0, :cond_1

    .line 44
    .line 45
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 46
    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    :goto_1
    iget-object v0, p0, Lcom/zykj/study/bean/exercise/QuestionBean;->answer:Ljava/lang/String;

    .line 60
    .line 61
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    iget-object v0, p0, Lcom/zykj/study/bean/exercise/QuestionBean;->answerEx:Ljava/lang/String;

    .line 65
    .line 66
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    iget-object v0, p0, Lcom/zykj/study/bean/exercise/QuestionBean;->analysis:Ljava/lang/String;

    .line 70
    .line 71
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    iget-object v0, p0, Lcom/zykj/study/bean/exercise/QuestionBean;->extra:Lcom/zykj/study/bean/exercise/QuestionExtra;

    .line 75
    .line 76
    if-nez v0, :cond_2

    .line 77
    .line 78
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 79
    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_2
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0, p1, p2}, Lcom/zykj/study/bean/exercise/QuestionExtra;->writeToParcel(Landroid/os/Parcel;I)V

    .line 86
    .line 87
    .line 88
    :goto_2
    iget-object p2, p0, Lcom/zykj/study/bean/exercise/QuestionBean;->answerSubmitString:Ljava/lang/String;

    .line 89
    .line 90
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    iget-object p2, p0, Lcom/zykj/study/bean/exercise/QuestionBean;->progress:Ljava/lang/Integer;

    .line 94
    .line 95
    if-nez p2, :cond_3

    .line 96
    .line 97
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 98
    .line 99
    .line 100
    goto :goto_3

    .line 101
    :cond_3
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 105
    .line 106
    .line 107
    move-result p2

    .line 108
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 109
    .line 110
    .line 111
    :goto_3
    iget-object p2, p0, Lcom/zykj/study/bean/exercise/QuestionBean;->answerForStu:Ljava/util/Map;

    .line 112
    .line 113
    if-nez p2, :cond_4

    .line 114
    .line 115
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 116
    .line 117
    .line 118
    goto :goto_5

    .line 119
    :cond_4
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 120
    .line 121
    .line 122
    invoke-interface {p2}, Ljava/util/Map;->size()I

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 127
    .line 128
    .line 129
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 130
    .line 131
    .line 132
    move-result-object p2

    .line 133
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 134
    .line 135
    .line 136
    move-result-object p2

    .line 137
    :goto_4
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    if-eqz v0, :cond_5

    .line 142
    .line 143
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    check-cast v0, Ljava/util/Map$Entry;

    .line 148
    .line 149
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v3

    .line 153
    check-cast v3, Ljava/lang/String;

    .line 154
    .line 155
    invoke-virtual {p1, v3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    check-cast v0, Ljava/util/List;

    .line 163
    .line 164
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    .line 165
    .line 166
    .line 167
    goto :goto_4

    .line 168
    :cond_5
    :goto_5
    iget-object p2, p0, Lcom/zykj/study/bean/exercise/QuestionBean;->correctAnswers:Ljava/util/List;

    .line 169
    .line 170
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    .line 171
    .line 172
    .line 173
    iget-object p2, p0, Lcom/zykj/study/bean/exercise/QuestionBean;->rawOptions:Ljava/util/List;

    .line 174
    .line 175
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    .line 176
    .line 177
    .line 178
    iget-object p2, p0, Lcom/zykj/study/bean/exercise/QuestionBean;->totalNum:Ljava/lang/Integer;

    .line 179
    .line 180
    if-nez p2, :cond_6

    .line 181
    .line 182
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 183
    .line 184
    .line 185
    return-void

    .line 186
    :cond_6
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 190
    .line 191
    .line 192
    move-result p2

    .line 193
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 194
    .line 195
    .line 196
    return-void
.end method
