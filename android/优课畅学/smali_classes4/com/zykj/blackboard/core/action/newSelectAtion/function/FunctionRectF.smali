.class public final Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final colorList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/graphics/RectF;",
            ">;"
        }
    .end annotation
.end field

.field private final delete:Landroid/graphics/RectF;

.field private final geometryStroke:Landroid/graphics/RectF;

.field private final imageCrop:Landroid/graphics/RectF;

.field private final textEdit:Landroid/graphics/RectF;

.field private final textSizeAdd:Landroid/graphics/RectF;

.field private final textSizeReduce:Landroid/graphics/RectF;

.field private final writeEdit:Landroid/graphics/RectF;

.field private final writeStrokeWidthList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/graphics/RectF;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 12

    .line 1
    const/16 v10, 0x1ff

    const/4 v11, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v11}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;-><init>(Landroid/graphics/RectF;Ljava/util/ArrayList;Landroid/graphics/RectF;Ljava/util/ArrayList;Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/RectF;ILkotlin/jvm/internal/n;)V

    return-void
.end method

.method public constructor <init>(Landroid/graphics/RectF;Ljava/util/ArrayList;Landroid/graphics/RectF;Ljava/util/ArrayList;Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/RectF;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/RectF;",
            "Ljava/util/ArrayList<",
            "Landroid/graphics/RectF;",
            ">;",
            "Landroid/graphics/RectF;",
            "Ljava/util/ArrayList<",
            "Landroid/graphics/RectF;",
            ">;",
            "Landroid/graphics/RectF;",
            "Landroid/graphics/RectF;",
            "Landroid/graphics/RectF;",
            "Landroid/graphics/RectF;",
            "Landroid/graphics/RectF;",
            ")V"
        }
    .end annotation

    const-string v0, "delete"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "colorList"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "writeEdit"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "writeStrokeWidthList"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "textEdit"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "textSizeReduce"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "textSizeAdd"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "geometryStroke"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "imageCrop"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->delete:Landroid/graphics/RectF;

    .line 4
    iput-object p2, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->colorList:Ljava/util/ArrayList;

    .line 5
    iput-object p3, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->writeEdit:Landroid/graphics/RectF;

    .line 6
    iput-object p4, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->writeStrokeWidthList:Ljava/util/ArrayList;

    .line 7
    iput-object p5, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->textEdit:Landroid/graphics/RectF;

    .line 8
    iput-object p6, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->textSizeReduce:Landroid/graphics/RectF;

    .line 9
    iput-object p7, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->textSizeAdd:Landroid/graphics/RectF;

    .line 10
    iput-object p8, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->geometryStroke:Landroid/graphics/RectF;

    .line 11
    iput-object p9, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->imageCrop:Landroid/graphics/RectF;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/graphics/RectF;Ljava/util/ArrayList;Landroid/graphics/RectF;Ljava/util/ArrayList;Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/RectF;ILkotlin/jvm/internal/n;)V
    .locals 0

    and-int/lit8 p11, p10, 0x1

    if-eqz p11, :cond_0

    .line 12
    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    .line 13
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    .line 14
    new-instance p3, Landroid/graphics/RectF;

    invoke-direct {p3}, Landroid/graphics/RectF;-><init>()V

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    .line 15
    new-instance p4, Ljava/util/ArrayList;

    invoke-direct {p4}, Ljava/util/ArrayList;-><init>()V

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    .line 16
    new-instance p5, Landroid/graphics/RectF;

    invoke-direct {p5}, Landroid/graphics/RectF;-><init>()V

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    .line 17
    new-instance p6, Landroid/graphics/RectF;

    invoke-direct {p6}, Landroid/graphics/RectF;-><init>()V

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    .line 18
    new-instance p7, Landroid/graphics/RectF;

    invoke-direct {p7}, Landroid/graphics/RectF;-><init>()V

    :cond_6
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_7

    .line 19
    new-instance p8, Landroid/graphics/RectF;

    invoke-direct {p8}, Landroid/graphics/RectF;-><init>()V

    :cond_7
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_8

    .line 20
    new-instance p9, Landroid/graphics/RectF;

    invoke-direct {p9}, Landroid/graphics/RectF;-><init>()V

    :cond_8
    move-object p10, p8

    move-object p11, p9

    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    .line 21
    invoke-direct/range {p2 .. p11}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;-><init>(Landroid/graphics/RectF;Ljava/util/ArrayList;Landroid/graphics/RectF;Ljava/util/ArrayList;Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/RectF;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;Landroid/graphics/RectF;Ljava/util/ArrayList;Landroid/graphics/RectF;Ljava/util/ArrayList;Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/RectF;ILjava/lang/Object;)Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;
    .locals 0

    and-int/lit8 p11, p10, 0x1

    if-eqz p11, :cond_0

    iget-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->delete:Landroid/graphics/RectF;

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    iget-object p2, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->colorList:Ljava/util/ArrayList;

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    iget-object p3, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->writeEdit:Landroid/graphics/RectF;

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    iget-object p4, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->writeStrokeWidthList:Ljava/util/ArrayList;

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    iget-object p5, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->textEdit:Landroid/graphics/RectF;

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    iget-object p6, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->textSizeReduce:Landroid/graphics/RectF;

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    iget-object p7, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->textSizeAdd:Landroid/graphics/RectF;

    :cond_6
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_7

    iget-object p8, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->geometryStroke:Landroid/graphics/RectF;

    :cond_7
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_8

    iget-object p9, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->imageCrop:Landroid/graphics/RectF;

    :cond_8
    move-object p10, p8

    move-object p11, p9

    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p11}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->copy(Landroid/graphics/RectF;Ljava/util/ArrayList;Landroid/graphics/RectF;Ljava/util/ArrayList;Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/RectF;)Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Landroid/graphics/RectF;
    .locals 1

    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->delete:Landroid/graphics/RectF;

    return-object v0
.end method

.method public final component2()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Landroid/graphics/RectF;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->colorList:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final component3()Landroid/graphics/RectF;
    .locals 1

    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->writeEdit:Landroid/graphics/RectF;

    return-object v0
.end method

.method public final component4()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Landroid/graphics/RectF;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->writeStrokeWidthList:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final component5()Landroid/graphics/RectF;
    .locals 1

    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->textEdit:Landroid/graphics/RectF;

    return-object v0
.end method

.method public final component6()Landroid/graphics/RectF;
    .locals 1

    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->textSizeReduce:Landroid/graphics/RectF;

    return-object v0
.end method

.method public final component7()Landroid/graphics/RectF;
    .locals 1

    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->textSizeAdd:Landroid/graphics/RectF;

    return-object v0
.end method

.method public final component8()Landroid/graphics/RectF;
    .locals 1

    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->geometryStroke:Landroid/graphics/RectF;

    return-object v0
.end method

.method public final component9()Landroid/graphics/RectF;
    .locals 1

    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->imageCrop:Landroid/graphics/RectF;

    return-object v0
.end method

.method public final copy(Landroid/graphics/RectF;Ljava/util/ArrayList;Landroid/graphics/RectF;Ljava/util/ArrayList;Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/RectF;)Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/RectF;",
            "Ljava/util/ArrayList<",
            "Landroid/graphics/RectF;",
            ">;",
            "Landroid/graphics/RectF;",
            "Ljava/util/ArrayList<",
            "Landroid/graphics/RectF;",
            ">;",
            "Landroid/graphics/RectF;",
            "Landroid/graphics/RectF;",
            "Landroid/graphics/RectF;",
            "Landroid/graphics/RectF;",
            "Landroid/graphics/RectF;",
            ")",
            "Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;"
        }
    .end annotation

    const-string v0, "delete"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "colorList"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "writeEdit"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "writeStrokeWidthList"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "textEdit"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "textSizeReduce"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "textSizeAdd"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "geometryStroke"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "imageCrop"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v1 .. v10}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;-><init>(Landroid/graphics/RectF;Ljava/util/ArrayList;Landroid/graphics/RectF;Ljava/util/ArrayList;Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/RectF;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;

    iget-object v1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->delete:Landroid/graphics/RectF;

    iget-object v3, p1, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->delete:Landroid/graphics/RectF;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->colorList:Ljava/util/ArrayList;

    iget-object v3, p1, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->colorList:Ljava/util/ArrayList;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->writeEdit:Landroid/graphics/RectF;

    iget-object v3, p1, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->writeEdit:Landroid/graphics/RectF;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->writeStrokeWidthList:Ljava/util/ArrayList;

    iget-object v3, p1, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->writeStrokeWidthList:Ljava/util/ArrayList;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->textEdit:Landroid/graphics/RectF;

    iget-object v3, p1, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->textEdit:Landroid/graphics/RectF;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->textSizeReduce:Landroid/graphics/RectF;

    iget-object v3, p1, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->textSizeReduce:Landroid/graphics/RectF;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->textSizeAdd:Landroid/graphics/RectF;

    iget-object v3, p1, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->textSizeAdd:Landroid/graphics/RectF;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->geometryStroke:Landroid/graphics/RectF;

    iget-object v3, p1, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->geometryStroke:Landroid/graphics/RectF;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->imageCrop:Landroid/graphics/RectF;

    iget-object p1, p1, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->imageCrop:Landroid/graphics/RectF;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public final getColorList()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Landroid/graphics/RectF;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->colorList:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getDelete()Landroid/graphics/RectF;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->delete:Landroid/graphics/RectF;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getGeometryStroke()Landroid/graphics/RectF;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->geometryStroke:Landroid/graphics/RectF;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getImageCrop()Landroid/graphics/RectF;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->imageCrop:Landroid/graphics/RectF;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getTextEdit()Landroid/graphics/RectF;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->textEdit:Landroid/graphics/RectF;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getTextSizeAdd()Landroid/graphics/RectF;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->textSizeAdd:Landroid/graphics/RectF;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getTextSizeReduce()Landroid/graphics/RectF;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->textSizeReduce:Landroid/graphics/RectF;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getWriteEdit()Landroid/graphics/RectF;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->writeEdit:Landroid/graphics/RectF;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getWriteStrokeWidthList()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Landroid/graphics/RectF;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->writeStrokeWidthList:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->delete:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->colorList:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->writeEdit:Landroid/graphics/RectF;

    invoke-virtual {v1}, Landroid/graphics/RectF;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->writeStrokeWidthList:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->textEdit:Landroid/graphics/RectF;

    invoke-virtual {v1}, Landroid/graphics/RectF;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->textSizeReduce:Landroid/graphics/RectF;

    invoke-virtual {v1}, Landroid/graphics/RectF;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->textSizeAdd:Landroid/graphics/RectF;

    invoke-virtual {v1}, Landroid/graphics/RectF;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->geometryStroke:Landroid/graphics/RectF;

    invoke-virtual {v1}, Landroid/graphics/RectF;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->imageCrop:Landroid/graphics/RectF;

    invoke-virtual {v1}, Landroid/graphics/RectF;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "FunctionRectF(delete="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->delete:Landroid/graphics/RectF;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", colorList="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->colorList:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", writeEdit="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->writeEdit:Landroid/graphics/RectF;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", writeStrokeWidthList="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->writeStrokeWidthList:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", textEdit="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->textEdit:Landroid/graphics/RectF;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", textSizeReduce="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->textSizeReduce:Landroid/graphics/RectF;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", textSizeAdd="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->textSizeAdd:Landroid/graphics/RectF;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", geometryStroke="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->geometryStroke:Landroid/graphics/RectF;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", imageCrop="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->imageCrop:Landroid/graphics/RectF;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
