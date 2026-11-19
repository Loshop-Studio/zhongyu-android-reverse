.class public final Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u00089\u0018\u00002\u00020\u0001B\u00cd\u0001\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\u0008\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\t\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\t\u0012\u0010\u0008\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000c\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0013\u001a\u00020\t\u0012\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u0002\u0012\u0010\u0008\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000c\u0012\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u0002\u0012\u0010\u0008\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000c\u00a2\u0006\u0004\u0008\u0018\u0010\u0019R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0003\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001c\"\u0004\u0008\u001d\u0010\u001eR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0004\u0010\u001a\u001a\u0004\u0008\u001f\u0010\u001c\"\u0004\u0008 \u0010\u001eR$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0006\u0010!\u001a\u0004\u0008\"\u0010#\"\u0004\u0008$\u0010%R$\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0007\u0010!\u001a\u0004\u0008&\u0010#\"\u0004\u0008\'\u0010%R\"\u0010\u0008\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0008\u0010\u001a\u001a\u0004\u0008(\u0010\u001c\"\u0004\u0008)\u0010\u001eR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\n\u0010*\u001a\u0004\u0008+\u0010,\"\u0004\u0008-\u0010.R\"\u0010\u000b\u001a\u00020\t8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000b\u0010*\u001a\u0004\u0008/\u0010,\"\u0004\u00080\u0010.R*\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000c8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000e\u00101\u001a\u0004\u00082\u00103\"\u0004\u00084\u00105R\"\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000f\u0010\u001a\u001a\u0004\u00086\u0010\u001c\"\u0004\u00087\u0010\u001eR\"\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0010\u0010\u001a\u001a\u0004\u00088\u0010\u001c\"\u0004\u00089\u0010\u001eR\"\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0011\u0010\u001a\u001a\u0004\u0008:\u0010\u001c\"\u0004\u0008;\u0010\u001eR\"\u0010\u0012\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0012\u0010\u001a\u001a\u0004\u0008<\u0010\u001c\"\u0004\u0008=\u0010\u001eR\"\u0010\u0013\u001a\u00020\t8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0013\u0010*\u001a\u0004\u0008>\u0010,\"\u0004\u0008?\u0010.R\"\u0010\u0014\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0014\u0010\u001a\u001a\u0004\u0008@\u0010\u001c\"\u0004\u0008A\u0010\u001eR\u001f\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u00101\u001a\u0004\u0008B\u00103R\"\u0010\u0016\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0016\u0010\u001a\u001a\u0004\u0008C\u0010\u001c\"\u0004\u0008D\u0010\u001eR\u001f\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u00101\u001a\u0004\u0008E\u00103\u00a8\u0006F"
    }
    d2 = {
        "Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;",
        "",
        "",
        "needDottedLine",
        "needCamera",
        "",
        "maxImageCount",
        "maxVerticalTime",
        "enableMove",
        "",
        "defaultLocationRatio",
        "bottomOffset",
        "Lkotlin/Function0;",
        "Ld6/s;",
        "callbackForSubmit",
        "needWithdraw",
        "needRecover",
        "needText",
        "needSelect",
        "defaultTextSize",
        "needQuestion",
        "onImportQuestionClick",
        "needAnswer",
        "onImportAnswerClick",
        "<init>",
        "(ZZLjava/lang/Integer;Ljava/lang/Integer;ZFFLr6/a;ZZZZFZLr6/a;ZLr6/a;)V",
        "Z",
        "getNeedDottedLine",
        "()Z",
        "setNeedDottedLine",
        "(Z)V",
        "getNeedCamera",
        "setNeedCamera",
        "Ljava/lang/Integer;",
        "getMaxImageCount",
        "()Ljava/lang/Integer;",
        "setMaxImageCount",
        "(Ljava/lang/Integer;)V",
        "getMaxVerticalTime",
        "setMaxVerticalTime",
        "getEnableMove",
        "setEnableMove",
        "F",
        "getDefaultLocationRatio",
        "()F",
        "setDefaultLocationRatio",
        "(F)V",
        "getBottomOffset",
        "setBottomOffset",
        "Lr6/a;",
        "getCallbackForSubmit",
        "()Lr6/a;",
        "setCallbackForSubmit",
        "(Lr6/a;)V",
        "getNeedWithdraw",
        "setNeedWithdraw",
        "getNeedRecover",
        "setNeedRecover",
        "getNeedText",
        "setNeedText",
        "getNeedSelect",
        "setNeedSelect",
        "getDefaultTextSize",
        "setDefaultTextSize",
        "getNeedQuestion",
        "setNeedQuestion",
        "getOnImportQuestionClick",
        "getNeedAnswer",
        "setNeedAnswer",
        "getOnImportAnswerClick",
        "view_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private bottomOffset:F

.field private callbackForSubmit:Lr6/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr6/a;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private defaultLocationRatio:F

.field private defaultTextSize:F

.field private enableMove:Z

.field private maxImageCount:Ljava/lang/Integer;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private maxVerticalTime:Ljava/lang/Integer;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private needAnswer:Z

.field private needCamera:Z

.field private needDottedLine:Z

.field private needQuestion:Z

.field private needRecover:Z

.field private needSelect:Z

.field private needText:Z

.field private needWithdraw:Z

.field private final onImportAnswerClick:Lr6/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr6/a;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final onImportQuestionClick:Lr6/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr6/a;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 20

    .line 1
    const v18, 0x1ffff

    const/16 v19, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

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

    move-object/from16 v0, p0

    invoke-direct/range {v0 .. v19}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;-><init>(ZZLjava/lang/Integer;Ljava/lang/Integer;ZFFLr6/a;ZZZZFZLr6/a;ZLr6/a;ILkotlin/jvm/internal/e;)V

    return-void
.end method

.method public constructor <init>(ZZLjava/lang/Integer;Ljava/lang/Integer;ZFFLr6/a;ZZZZFZLr6/a;ZLr6/a;)V
    .locals 0
    .param p3    # Ljava/lang/Integer;
        .annotation build Landroidx/annotation/IntRange;
            from = 0x0L
        .end annotation

        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p8    # Lr6/a;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p15    # Lr6/a;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p17    # Lr6/a;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "ZFF",
            "Lr6/a;",
            "ZZZZFZ",
            "Lr6/a;",
            "Z",
            "Lr6/a;",
            ")V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-boolean p1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;->needDottedLine:Z

    .line 4
    iput-boolean p2, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;->needCamera:Z

    .line 5
    iput-object p3, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;->maxImageCount:Ljava/lang/Integer;

    .line 6
    iput-object p4, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;->maxVerticalTime:Ljava/lang/Integer;

    .line 7
    iput-boolean p5, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;->enableMove:Z

    .line 8
    iput p6, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;->defaultLocationRatio:F

    .line 9
    iput p7, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;->bottomOffset:F

    .line 10
    iput-object p8, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;->callbackForSubmit:Lr6/a;

    .line 11
    iput-boolean p9, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;->needWithdraw:Z

    .line 12
    iput-boolean p10, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;->needRecover:Z

    .line 13
    iput-boolean p11, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;->needText:Z

    .line 14
    iput-boolean p12, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;->needSelect:Z

    .line 15
    iput p13, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;->defaultTextSize:F

    .line 16
    iput-boolean p14, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;->needQuestion:Z

    .line 17
    iput-object p15, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;->onImportQuestionClick:Lr6/a;

    move/from16 p1, p16

    .line 18
    iput-boolean p1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;->needAnswer:Z

    move-object/from16 p1, p17

    .line 19
    iput-object p1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;->onImportAnswerClick:Lr6/a;

    return-void
.end method

.method public synthetic constructor <init>(ZZLjava/lang/Integer;Ljava/lang/Integer;ZFFLr6/a;ZZZZFZLr6/a;ZLr6/a;ILkotlin/jvm/internal/e;)V
    .locals 18

    move/from16 v0, p18

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    move/from16 v1, p1

    :goto_0
    and-int/lit8 v3, v0, 0x2

    if-eqz v3, :cond_1

    const/4 v3, 0x0

    goto :goto_1

    :cond_1
    move/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v0, 0x4

    if-eqz v4, :cond_2

    const/4 v4, 0x0

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v6, v0, 0x8

    if-eqz v6, :cond_3

    const/4 v6, 0x0

    goto :goto_3

    :cond_3
    move-object/from16 v6, p4

    :goto_3
    and-int/lit8 v7, v0, 0x10

    if-eqz v7, :cond_4

    const/4 v7, 0x1

    goto :goto_4

    :cond_4
    move/from16 v7, p5

    :goto_4
    and-int/lit8 v8, v0, 0x20

    if-eqz v8, :cond_5

    const/high16 v8, 0x3f000000    # 0.5f

    goto :goto_5

    :cond_5
    move/from16 v8, p6

    :goto_5
    and-int/lit8 v9, v0, 0x40

    if-eqz v9, :cond_6

    const/4 v9, 0x0

    goto :goto_6

    :cond_6
    move/from16 v9, p7

    :goto_6
    and-int/lit16 v10, v0, 0x80

    if-eqz v10, :cond_7

    const/4 v10, 0x0

    goto :goto_7

    :cond_7
    move-object/from16 v10, p8

    :goto_7
    and-int/lit16 v11, v0, 0x100

    if-eqz v11, :cond_8

    const/4 v11, 0x0

    goto :goto_8

    :cond_8
    move/from16 v11, p9

    :goto_8
    and-int/lit16 v12, v0, 0x200

    if-eqz v12, :cond_9

    const/4 v12, 0x0

    goto :goto_9

    :cond_9
    move/from16 v12, p10

    :goto_9
    and-int/lit16 v13, v0, 0x400

    if-eqz v13, :cond_a

    const/4 v13, 0x0

    goto :goto_a

    :cond_a
    move/from16 v13, p11

    :goto_a
    and-int/lit16 v14, v0, 0x800

    if-eqz v14, :cond_b

    const/4 v14, 0x0

    goto :goto_b

    :cond_b
    move/from16 v14, p12

    :goto_b
    and-int/lit16 v15, v0, 0x1000

    if-eqz v15, :cond_c

    const/high16 v15, 0x42600000    # 56.0f

    goto :goto_c

    :cond_c
    move/from16 v15, p13

    :goto_c
    and-int/lit16 v2, v0, 0x2000

    if-eqz v2, :cond_d

    const/4 v2, 0x0

    goto :goto_d

    :cond_d
    move/from16 v2, p14

    :goto_d
    and-int/lit16 v5, v0, 0x4000

    if-eqz v5, :cond_e

    const/4 v5, 0x0

    goto :goto_e

    :cond_e
    move-object/from16 v5, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v0, v16

    if-eqz v16, :cond_f

    const/16 v16, 0x0

    goto :goto_f

    :cond_f
    move/from16 v16, p16

    :goto_f
    const/high16 v17, 0x10000

    and-int v0, v0, v17

    if-eqz v0, :cond_10

    const/16 p18, 0x0

    :goto_10
    move-object/from16 p1, p0

    move/from16 p2, v1

    move/from16 p15, v2

    move/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p16, v5

    move-object/from16 p5, v6

    move/from16 p6, v7

    move/from16 p7, v8

    move/from16 p8, v9

    move-object/from16 p9, v10

    move/from16 p10, v11

    move/from16 p11, v12

    move/from16 p12, v13

    move/from16 p13, v14

    move/from16 p14, v15

    move/from16 p17, v16

    goto :goto_11

    :cond_10
    move-object/from16 p18, p17

    goto :goto_10

    .line 20
    :goto_11
    invoke-direct/range {p1 .. p18}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;-><init>(ZZLjava/lang/Integer;Ljava/lang/Integer;ZFFLr6/a;ZZZZFZLr6/a;ZLr6/a;)V

    return-void
.end method


# virtual methods
.method public final getBottomOffset()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;->bottomOffset:F

    .line 2
    .line 3
    return v0
.end method

.method public final getCallbackForSubmit()Lr6/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lr6/a;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;->callbackForSubmit:Lr6/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getDefaultLocationRatio()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;->defaultLocationRatio:F

    .line 2
    .line 3
    return v0
.end method

.method public final getDefaultTextSize()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;->defaultTextSize:F

    .line 2
    .line 3
    return v0
.end method

.method public final getEnableMove()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;->enableMove:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getMaxImageCount()Ljava/lang/Integer;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;->maxImageCount:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getMaxVerticalTime()Ljava/lang/Integer;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;->maxVerticalTime:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getNeedAnswer()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;->needAnswer:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getNeedCamera()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;->needCamera:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getNeedDottedLine()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;->needDottedLine:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getNeedQuestion()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;->needQuestion:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getNeedRecover()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;->needRecover:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getNeedSelect()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;->needSelect:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getNeedText()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;->needText:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getNeedWithdraw()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;->needWithdraw:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getOnImportAnswerClick()Lr6/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lr6/a;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;->onImportAnswerClick:Lr6/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getOnImportQuestionClick()Lr6/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lr6/a;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;->onImportQuestionClick:Lr6/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final setBottomOffset(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;->bottomOffset:F

    .line 2
    .line 3
    return-void
.end method

.method public final setCallbackForSubmit(Lr6/a;)V
    .locals 0
    .param p1    # Lr6/a;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr6/a;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;->callbackForSubmit:Lr6/a;

    .line 2
    .line 3
    return-void
.end method

.method public final setDefaultLocationRatio(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;->defaultLocationRatio:F

    .line 2
    .line 3
    return-void
.end method

.method public final setDefaultTextSize(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;->defaultTextSize:F

    .line 2
    .line 3
    return-void
.end method

.method public final setEnableMove(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;->enableMove:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setMaxImageCount(Ljava/lang/Integer;)V
    .locals 0
    .param p1    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;->maxImageCount:Ljava/lang/Integer;

    .line 2
    .line 3
    return-void
.end method

.method public final setMaxVerticalTime(Ljava/lang/Integer;)V
    .locals 0
    .param p1    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;->maxVerticalTime:Ljava/lang/Integer;

    .line 2
    .line 3
    return-void
.end method

.method public final setNeedAnswer(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;->needAnswer:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setNeedCamera(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;->needCamera:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setNeedDottedLine(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;->needDottedLine:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setNeedQuestion(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;->needQuestion:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setNeedRecover(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;->needRecover:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setNeedSelect(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;->needSelect:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setNeedText(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;->needText:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setNeedWithdraw(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;->needWithdraw:Z

    .line 2
    .line 3
    return-void
.end method
