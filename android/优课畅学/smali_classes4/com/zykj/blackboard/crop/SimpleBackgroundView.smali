.class public final Lcom/zykj/blackboard/crop/SimpleBackgroundView;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/blackboard/core/canvas/view/BackgroundLayer;


# instance fields
.field private final height:I

.field private lineSpacing:F

.field private lineType:Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;

.field private mBackgroundColor:I

.field private final mLinePaint:Landroid/graphics/Paint;

.field private final width:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lcom/zykj/blackboard/crop/SimpleBackgroundView;->width:I

    .line 5
    .line 6
    iput p2, p0, Lcom/zykj/blackboard/crop/SimpleBackgroundView;->height:I

    .line 7
    .line 8
    const/4 p1, -0x1

    .line 9
    iput p1, p0, Lcom/zykj/blackboard/crop/SimpleBackgroundView;->mBackgroundColor:I

    .line 10
    .line 11
    new-instance p1, Landroid/graphics/Paint;

    .line 12
    .line 13
    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    .line 14
    .line 15
    .line 16
    sget-object p2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 19
    .line 20
    .line 21
    sget-object p2, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    .line 22
    .line 23
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 24
    .line 25
    .line 26
    sget-object p2, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    .line 27
    .line 28
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 29
    .line 30
    .line 31
    const/4 p2, 0x1

    .line 32
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setDither(Z)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 36
    .line 37
    .line 38
    const/high16 p2, -0x1000000

    .line 39
    .line 40
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 41
    .line 42
    .line 43
    const/high16 p2, 0x40400000    # 3.0f

    .line 44
    .line 45
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 46
    .line 47
    .line 48
    iput-object p1, p0, Lcom/zykj/blackboard/crop/SimpleBackgroundView;->mLinePaint:Landroid/graphics/Paint;

    .line 49
    .line 50
    sget-object p1, Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;->Horizontal:Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;

    .line 51
    .line 52
    iput-object p1, p0, Lcom/zykj/blackboard/crop/SimpleBackgroundView;->lineType:Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;

    .line 53
    .line 54
    const/high16 p1, 0x42c00000    # 96.0f

    .line 55
    .line 56
    iput p1, p0, Lcom/zykj/blackboard/crop/SimpleBackgroundView;->lineSpacing:F

    .line 57
    .line 58
    return-void
.end method


# virtual methods
.method public drawBackground(Landroid/graphics/Canvas;Landroid/graphics/Matrix;)V
    .locals 1

    const-string v0, "canvas"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "matrix"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public getBackgroundLineConfig()Lcom/zykj/blackboard/bean/BackgroundLineConfig;
    .locals 5

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/crop/SimpleBackgroundView;->lineSpacing:F

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/blackboard/crop/SimpleBackgroundView;->mLinePaint:Landroid/graphics/Paint;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroid/graphics/Paint;->getColor()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    iget-object v2, p0, Lcom/zykj/blackboard/crop/SimpleBackgroundView;->lineType:Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;

    .line 10
    .line 11
    iget-object v3, p0, Lcom/zykj/blackboard/crop/SimpleBackgroundView;->mLinePaint:Landroid/graphics/Paint;

    .line 12
    .line 13
    invoke-virtual {v3}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    new-instance v4, Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    .line 18
    .line 19
    invoke-direct {v4, v1, v0, v2, v3}, Lcom/zykj/blackboard/bean/BackgroundLineConfig;-><init>(IFLcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;F)V

    .line 20
    .line 21
    .line 22
    return-object v4
.end method

.method public getMyBackgroundColor()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/crop/SimpleBackgroundView;->mBackgroundColor:I

    .line 2
    .line 3
    return v0
.end method

.method public refresh()V
    .locals 0

    return-void
.end method

.method public setBackgroundLineConfig(Lcom/zykj/blackboard/bean/BackgroundLineConfig;)V
    .locals 2

    .line 1
    const-string v0, "backgroundLineConfig"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->getLineSpace()F

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    iput v0, p0, Lcom/zykj/blackboard/crop/SimpleBackgroundView;->lineSpacing:F

    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->getLineType()Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iput-object v0, p0, Lcom/zykj/blackboard/crop/SimpleBackgroundView;->lineType:Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;

    .line 17
    .line 18
    iget-object v0, p0, Lcom/zykj/blackboard/crop/SimpleBackgroundView;->mLinePaint:Landroid/graphics/Paint;

    .line 19
    .line 20
    invoke-virtual {p1}, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->getLineColor()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Lcom/zykj/blackboard/crop/SimpleBackgroundView;->mLinePaint:Landroid/graphics/Paint;

    .line 28
    .line 29
    invoke-virtual {p1}, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->getLineWidth()F

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public setMatrix(Landroid/graphics/Matrix;)V
    .locals 1

    const-string v0, "adapterMatrix"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public setMyBackgroundColor(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/blackboard/crop/SimpleBackgroundView;->mBackgroundColor:I

    .line 2
    .line 3
    return-void
.end method
