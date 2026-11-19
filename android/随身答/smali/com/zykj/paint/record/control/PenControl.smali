.class public Lcom/zykj/paint/record/control/PenControl;
.super Lcom/zykj/paint/record/control/BaseControl;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/paint/record/control/ISketchControl;


# static fields
.field private static final TAG:Ljava/lang/String; = "PenControl"


# instance fields
.field private mX:F

.field private mY:F

.field private m_hasDrawn:Z

.field private m_paint:Landroid/graphics/Paint;

.field public m_path:Landroid/graphics/Path;


# direct methods
.method public constructor <init>(II)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/zykj/paint/record/control/BaseControl;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/graphics/Paint;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/zykj/paint/record/control/PenControl;->m_paint:Landroid/graphics/Paint;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-boolean v0, p0, Lcom/zykj/paint/record/control/PenControl;->m_hasDrawn:Z

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    iput v0, p0, Lcom/zykj/paint/record/control/PenControl;->mX:F

    .line 16
    .line 17
    iput v0, p0, Lcom/zykj/paint/record/control/PenControl;->mY:F

    .line 18
    .line 19
    new-instance v0, Landroid/graphics/Path;

    .line 20
    .line 21
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Lcom/zykj/paint/record/control/PenControl;->m_path:Landroid/graphics/Path;

    .line 25
    .line 26
    iget-object v0, p0, Lcom/zykj/paint/record/control/PenControl;->m_paint:Landroid/graphics/Paint;

    .line 27
    .line 28
    const/4 v1, 0x1

    .line 29
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Lcom/zykj/paint/record/control/PenControl;->m_paint:Landroid/graphics/Paint;

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setDither(Z)V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Lcom/zykj/paint/record/control/PenControl;->m_paint:Landroid/graphics/Paint;

    .line 38
    .line 39
    invoke-virtual {v0, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 40
    .line 41
    .line 42
    iget-object p2, p0, Lcom/zykj/paint/record/control/PenControl;->m_paint:Landroid/graphics/Paint;

    .line 43
    .line 44
    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 45
    .line 46
    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 47
    .line 48
    .line 49
    iget-object p2, p0, Lcom/zykj/paint/record/control/PenControl;->m_paint:Landroid/graphics/Paint;

    .line 50
    .line 51
    sget-object v0, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    .line 52
    .line 53
    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 54
    .line 55
    .line 56
    iget-object p2, p0, Lcom/zykj/paint/record/control/PenControl;->m_paint:Landroid/graphics/Paint;

    .line 57
    .line 58
    sget-object v0, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    .line 59
    .line 60
    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 61
    .line 62
    .line 63
    iget-object p2, p0, Lcom/zykj/paint/record/control/PenControl;->m_paint:Landroid/graphics/Paint;

    .line 64
    .line 65
    int-to-float p1, p1

    .line 66
    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 67
    .line 68
    .line 69
    return-void
.end method


# virtual methods
.method public cleanAll()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/record/control/PenControl;->m_path:Landroid/graphics/Path;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 2

    if-eqz p1, :cond_0

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/record/control/PenControl;->m_path:Landroid/graphics/Path;

    iget-object v1, p0, Lcom/zykj/paint/record/control/PenControl;->m_paint:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    :cond_0
    return-void
.end method

.method public draw(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 2
    iget-object v0, p0, Lcom/zykj/paint/record/control/PenControl;->m_path:Landroid/graphics/Path;

    invoke-virtual {p1, v0, p2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    :cond_0
    return-void
.end method

.method public getGraphSnapShot()Lcom/zykj/paint/record/model/GraphSnapShot;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public hasDraw()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/paint/record/control/PenControl;->m_hasDrawn:Z

    .line 2
    .line 3
    return v0
.end method

.method public touchDown(Landroid/view/MotionEvent;)V
    .locals 2

    .line 1
    const-string v0, "PenControl"

    .line 2
    .line 3
    const-string/jumbo v1, "pen touchDown"

    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    float-to-int v0, v0

    .line 14
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    float-to-int p1, p1

    .line 19
    iget-object v1, p0, Lcom/zykj/paint/record/control/PenControl;->m_path:Landroid/graphics/Path;

    .line 20
    .line 21
    int-to-float v0, v0

    .line 22
    int-to-float p1, p1

    .line 23
    invoke-virtual {v1, v0, p1}, Landroid/graphics/Path;->moveTo(FF)V

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, Lcom/zykj/paint/record/control/PenControl;->m_path:Landroid/graphics/Path;

    .line 27
    .line 28
    invoke-virtual {v1, v0, p1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 29
    .line 30
    .line 31
    iput v0, p0, Lcom/zykj/paint/record/control/PenControl;->mX:F

    .line 32
    .line 33
    iput p1, p0, Lcom/zykj/paint/record/control/PenControl;->mY:F

    .line 34
    .line 35
    return-void
.end method

.method public touchMove(Landroid/view/MotionEvent;)V
    .locals 7

    .line 1
    const-string v0, "PenControl"

    .line 2
    .line 3
    const-string/jumbo v1, "pen touchMove"

    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    float-to-int v0, v0

    .line 14
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    float-to-int p1, p1

    .line 19
    iget-object v1, p0, Lcom/zykj/paint/record/control/PenControl;->m_path:Landroid/graphics/Path;

    .line 20
    .line 21
    iget v2, p0, Lcom/zykj/paint/record/control/PenControl;->mX:F

    .line 22
    .line 23
    iget v3, p0, Lcom/zykj/paint/record/control/PenControl;->mY:F

    .line 24
    .line 25
    int-to-float v0, v0

    .line 26
    add-float v4, v0, v2

    .line 27
    .line 28
    const/high16 v5, 0x40000000    # 2.0f

    .line 29
    .line 30
    div-float/2addr v4, v5

    .line 31
    int-to-float p1, p1

    .line 32
    add-float v6, p1, v3

    .line 33
    .line 34
    div-float/2addr v6, v5

    .line 35
    invoke-virtual {v1, v2, v3, v4, v6}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 36
    .line 37
    .line 38
    const/4 v1, 0x1

    .line 39
    iput-boolean v1, p0, Lcom/zykj/paint/record/control/PenControl;->m_hasDrawn:Z

    .line 40
    .line 41
    iput v0, p0, Lcom/zykj/paint/record/control/PenControl;->mX:F

    .line 42
    .line 43
    iput p1, p0, Lcom/zykj/paint/record/control/PenControl;->mY:F

    .line 44
    .line 45
    return-void
.end method

.method public touchPointerDown(Landroid/view/MotionEvent;)V
    .locals 2

    .line 1
    const-string v0, "PenControl"

    .line 2
    .line 3
    const-string/jumbo v1, "pen touchPointerDown"

    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public touchPointerUp(Landroid/view/MotionEvent;)V
    .locals 2

    .line 1
    const-string v0, "PenControl"

    .line 2
    .line 3
    const-string/jumbo v1, "pen touchPointerUp"

    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public touchUp(Landroid/view/MotionEvent;)V
    .locals 4

    .line 1
    const-string v0, "PenControl"

    .line 2
    .line 3
    const-string/jumbo v1, "pen touchUp"

    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    float-to-int v0, v0

    .line 14
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    float-to-int p1, p1

    .line 19
    iget-object v1, p0, Lcom/zykj/paint/record/control/PenControl;->m_path:Landroid/graphics/Path;

    .line 20
    .line 21
    iget v2, p0, Lcom/zykj/paint/record/control/PenControl;->mX:F

    .line 22
    .line 23
    iget v3, p0, Lcom/zykj/paint/record/control/PenControl;->mY:F

    .line 24
    .line 25
    invoke-virtual {v1, v2, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 26
    .line 27
    .line 28
    int-to-float v0, v0

    .line 29
    iput v0, p0, Lcom/zykj/paint/record/control/PenControl;->mX:F

    .line 30
    .line 31
    int-to-float p1, p1

    .line 32
    iput p1, p0, Lcom/zykj/paint/record/control/PenControl;->mY:F

    .line 33
    .line 34
    return-void
.end method
