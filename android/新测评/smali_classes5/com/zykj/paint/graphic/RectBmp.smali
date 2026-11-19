.class public Lcom/zykj/paint/graphic/RectBmp;
.super Lcom/zykj/paint/graphic/Graph;
.source "SourceFile"


# static fields
.field private static final TAG:Ljava/lang/String; = "RectBmp"


# instance fields
.field public bitmap:Landroid/graphics/Bitmap;

.field public dstVector2D:Lcom/zykj/paint/data/Vector2D;

.field public filePath:Ljava/lang/String;

.field public vector2D:Lcom/zykj/paint/data/Vector2D;


# direct methods
.method public constructor <init>(Lcom/zykj/paint/graphic/Map;Landroid/graphics/Bitmap;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/paint/graphic/Graph;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/zykj/paint/graphic/Graph;->map:Lcom/zykj/paint/graphic/Map;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/zykj/paint/graphic/RectBmp;->bitmap:Landroid/graphics/Bitmap;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public directRender(Lcom/zykj/paint/render/MapRender;Landroid/graphics/Canvas;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/zykj/paint/graphic/Graph;->isVisable()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    new-instance v0, Landroid/graphics/Matrix;

    .line 9
    .line 10
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lcom/zykj/paint/graphic/Graph;->graphMatrix:Landroid/graphics/Matrix;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lcom/zykj/paint/graphic/Graph;->matrix:Landroid/graphics/Matrix;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 21
    .line 22
    .line 23
    iget-object v1, p0, Lcom/zykj/paint/graphic/RectBmp;->bitmap:Landroid/graphics/Bitmap;

    .line 24
    .line 25
    invoke-virtual {p1, p0, v1, p2, v0}, Lcom/zykj/paint/render/MapRender;->directDrawBitmap(Lcom/zykj/paint/graphic/RectBmp;Landroid/graphics/Bitmap;Landroid/graphics/Canvas;Landroid/graphics/Matrix;)V

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lcom/zykj/paint/graphic/Graph;->graphs:Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    new-instance v2, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 37
    .line 38
    .line 39
    const-string v3, "[graphId="

    .line 40
    .line 41
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    iget v3, p0, Lcom/zykj/paint/graphic/Graph;->graphId:I

    .line 45
    .line 46
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const-string v3, "]--->>>size="

    .line 50
    .line 51
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    const-string v3, "RectBmp"

    .line 62
    .line 63
    invoke-static {v3, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 64
    .line 65
    .line 66
    const/4 v2, 0x0

    .line 67
    :goto_0
    if-ge v2, v1, :cond_1

    .line 68
    .line 69
    iget-object v3, p0, Lcom/zykj/paint/graphic/Graph;->graphs:Ljava/util/ArrayList;

    .line 70
    .line 71
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    check-cast v3, Lcom/zykj/paint/graphic/PolyLine;

    .line 76
    .line 77
    invoke-virtual {v3, p1, p2, v0}, Lcom/zykj/paint/graphic/PolyLine;->directRender(Lcom/zykj/paint/render/MapRender;Landroid/graphics/Canvas;Landroid/graphics/Matrix;)V

    .line 78
    .line 79
    .line 80
    add-int/lit8 v2, v2, 0x1

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_1
    :goto_1
    return-void
.end method

.method public getBoundBox()Lcom/zykj/paint/data/Rect2D;
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/graphic/RectBmp;->bitmap:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/zykj/paint/data/Rect2D;

    .line 6
    .line 7
    invoke-direct {v0}, Lcom/zykj/paint/data/Rect2D;-><init>()V

    .line 8
    .line 9
    .line 10
    return-object v0

    .line 11
    :cond_0
    new-instance v1, Lcom/zykj/paint/data/Rect2D;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    int-to-double v6, v0

    .line 18
    iget-object v0, p0, Lcom/zykj/paint/graphic/RectBmp;->bitmap:Landroid/graphics/Bitmap;

    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    int-to-double v8, v0

    .line 25
    const-wide/16 v2, 0x0

    .line 26
    .line 27
    const-wide/16 v4, 0x0

    .line 28
    .line 29
    invoke-direct/range {v1 .. v9}, Lcom/zykj/paint/data/Rect2D;-><init>(DDDD)V

    .line 30
    .line 31
    .line 32
    return-object v1
.end method

.method public hide(I)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/graphic/Graph;->graphs:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    move v2, v1

    .line 9
    :goto_0
    if-ge v2, v0, :cond_1

    .line 10
    .line 11
    iget-object v3, p0, Lcom/zykj/paint/graphic/Graph;->graphs:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    check-cast v3, Lcom/zykj/paint/graphic/PolyLine;

    .line 18
    .line 19
    iget v4, v3, Lcom/zykj/paint/graphic/Graph;->graphId:I

    .line 20
    .line 21
    if-ne v4, p1, :cond_0

    .line 22
    .line 23
    invoke-virtual {v3, v1}, Lcom/zykj/paint/graphic/Graph;->setVisable(Z)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    return-void
.end method

.method public release()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/graphic/RectBmp;->bitmap:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/paint/graphic/RectBmp;->bitmap:Landroid/graphics/Bitmap;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    iput-object v0, p0, Lcom/zykj/paint/graphic/RectBmp;->bitmap:Landroid/graphics/Bitmap;

    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public render(Lcom/zykj/paint/render/MapRender;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/paint/graphic/Graph;->isVisable()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/zykj/paint/graphic/RectBmp;->bitmap:Landroid/graphics/Bitmap;

    invoke-virtual {p1, p0, v0}, Lcom/zykj/paint/render/MapRender;->drawBitmap(Lcom/zykj/paint/graphic/RectBmp;Landroid/graphics/Bitmap;)V

    return-void
.end method

.method public render(Lcom/zykj/paint/render/MapRender;Lcom/zykj/paint/data/Rect2D;)V
    .locals 2

    .line 3
    iget-object v0, p0, Lcom/zykj/paint/graphic/RectBmp;->bitmap:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Lcom/zykj/paint/graphic/RectBmp;->getBoundBox()Lcom/zykj/paint/data/Rect2D;

    move-result-object v1

    invoke-virtual {p1, v0, p2, v1}, Lcom/zykj/paint/render/MapRender;->drawBitmap(Landroid/graphics/Bitmap;Lcom/zykj/paint/data/Rect2D;Lcom/zykj/paint/data/Rect2D;)V

    return-void
.end method

.method public setDstVector(Lcom/zykj/paint/data/Vector2D;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/paint/graphic/RectBmp;->dstVector2D:Lcom/zykj/paint/data/Vector2D;

    .line 2
    .line 3
    return-void
.end method

.method public setFilePath(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/paint/graphic/RectBmp;->filePath:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setVector2D(Lcom/zykj/paint/data/Vector2D;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/paint/graphic/RectBmp;->vector2D:Lcom/zykj/paint/data/Vector2D;

    .line 2
    .line 3
    return-void
.end method
