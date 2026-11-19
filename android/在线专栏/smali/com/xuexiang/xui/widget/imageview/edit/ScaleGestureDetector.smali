.class Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector$SimpleOnScaleGestureListener;,
        Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector$OnScaleGestureListener;
    }
.end annotation


# static fields
.field private static final PRESSURE_THRESHOLD:F = 0.67f

.field private static final TAG:Ljava/lang/String; = "ScaleGestureDetector"


# instance fields
.field private mActive0MostRecent:Z

.field private mActiveId0:I

.field private mActiveId1:I

.field private mCurrEvent:Landroid/view/MotionEvent;

.field private mCurrFingerDiffX:F

.field private mCurrFingerDiffY:F

.field private mCurrLen:F

.field private mCurrPressure:F

.field private mCurrSpanVector:Lcom/xuexiang/xui/widget/imageview/edit/Vector2D;

.field private mFocusX:F

.field private mFocusY:F

.field private mGestureInProgress:Z

.field private mInvalidGesture:Z

.field private final mListener:Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector$OnScaleGestureListener;

.field private mPrevEvent:Landroid/view/MotionEvent;

.field private mPrevFingerDiffX:F

.field private mPrevFingerDiffY:F

.field private mPrevLen:F

.field private mPrevPressure:F

.field private mScaleFactor:F

.field private mTimeDelta:J


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector$OnScaleGestureListener;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mListener:Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector$OnScaleGestureListener;

    .line 3
    new-instance p1, Lcom/xuexiang/xui/widget/imageview/edit/Vector2D;

    invoke-direct {p1}, Lcom/xuexiang/xui/widget/imageview/edit/Vector2D;-><init>()V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mCurrSpanVector:Lcom/xuexiang/xui/widget/imageview/edit/Vector2D;

    return-void
.end method

.method private findNewActiveIndex(Landroid/view/MotionEvent;II)I
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v0

    .line 2
    invoke-virtual {p1, p2}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result p1

    const/4 p2, 0x0

    :goto_0
    if-ge p2, v0, :cond_1

    if-eq p2, p3, :cond_0

    if-eq p2, p1, :cond_0

    return p2

    :cond_0
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, -0x1

    return p1
.end method

.method private getCurrentSpan()F
    .locals 2

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mCurrLen:F

    const/high16 v1, -0x40800000    # -1.0f

    cmpl-float v0, v0, v1

    if-nez v0, :cond_0

    .line 2
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mCurrFingerDiffX:F

    .line 3
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mCurrFingerDiffY:F

    mul-float v0, v0, v0

    mul-float v1, v1, v1

    add-float/2addr v0, v1

    float-to-double v0, v0

    .line 4
    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    double-to-float v0, v0

    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mCurrLen:F

    .line 5
    :cond_0
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mCurrLen:F

    return v0
.end method

.method private getPreviousSpan()F
    .locals 2

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mPrevLen:F

    const/high16 v1, -0x40800000    # -1.0f

    cmpl-float v0, v0, v1

    if-nez v0, :cond_0

    .line 2
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mPrevFingerDiffX:F

    .line 3
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mPrevFingerDiffY:F

    mul-float v0, v0, v0

    mul-float v1, v1, v1

    add-float/2addr v0, v1

    float-to-double v0, v0

    .line 4
    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    double-to-float v0, v0

    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mPrevLen:F

    .line 5
    :cond_0
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mPrevLen:F

    return v0
.end method

.method private reset()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mPrevEvent:Landroid/view/MotionEvent;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/view/MotionEvent;->recycle()V

    .line 3
    iput-object v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mPrevEvent:Landroid/view/MotionEvent;

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mCurrEvent:Landroid/view/MotionEvent;

    if-eqz v0, :cond_1

    .line 5
    invoke-virtual {v0}, Landroid/view/MotionEvent;->recycle()V

    .line 6
    iput-object v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mCurrEvent:Landroid/view/MotionEvent;

    :cond_1
    const/4 v0, 0x0

    .line 7
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mGestureInProgress:Z

    const/4 v1, -0x1

    .line 8
    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mActiveId0:I

    .line 9
    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mActiveId1:I

    .line 10
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mInvalidGesture:Z

    return-void
.end method

.method private setContext(Landroid/view/View;Landroid/view/MotionEvent;)V
    .locals 12

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mCurrEvent:Landroid/view/MotionEvent;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/view/MotionEvent;->recycle()V

    .line 3
    :cond_0
    invoke-static {p2}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mCurrEvent:Landroid/view/MotionEvent;

    const/high16 v0, -0x40800000    # -1.0f

    .line 4
    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mCurrLen:F

    .line 5
    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mPrevLen:F

    .line 6
    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mScaleFactor:F

    .line 7
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mCurrSpanVector:Lcom/xuexiang/xui/widget/imageview/edit/Vector2D;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v1}, Landroid/graphics/PointF;->set(FF)V

    .line 8
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mPrevEvent:Landroid/view/MotionEvent;

    .line 9
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mActiveId0:I

    invoke-virtual {v0, v1}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v1

    .line 10
    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mActiveId1:I

    invoke-virtual {v0, v2}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v2

    .line 11
    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mActiveId0:I

    invoke-virtual {p2, v3}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v3

    .line 12
    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mActiveId1:I

    invoke-virtual {p2, v4}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v4

    if-ltz v1, :cond_2

    if-ltz v2, :cond_2

    if-ltz v3, :cond_2

    if-gez v4, :cond_1

    goto :goto_0

    .line 13
    :cond_1
    invoke-virtual {v0, v1}, Landroid/view/MotionEvent;->getX(I)F

    move-result p1

    .line 14
    invoke-virtual {v0, v1}, Landroid/view/MotionEvent;->getY(I)F

    move-result v5

    .line 15
    invoke-virtual {v0, v2}, Landroid/view/MotionEvent;->getX(I)F

    move-result v6

    .line 16
    invoke-virtual {v0, v2}, Landroid/view/MotionEvent;->getY(I)F

    move-result v7

    .line 17
    invoke-virtual {p2, v3}, Landroid/view/MotionEvent;->getX(I)F

    move-result v8

    .line 18
    invoke-virtual {p2, v3}, Landroid/view/MotionEvent;->getY(I)F

    move-result v9

    .line 19
    invoke-virtual {p2, v4}, Landroid/view/MotionEvent;->getX(I)F

    move-result v10

    .line 20
    invoke-virtual {p2, v4}, Landroid/view/MotionEvent;->getY(I)F

    move-result v11

    sub-float/2addr v6, p1

    sub-float/2addr v7, v5

    sub-float/2addr v10, v8

    sub-float/2addr v11, v9

    .line 21
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mCurrSpanVector:Lcom/xuexiang/xui/widget/imageview/edit/Vector2D;

    invoke-virtual {p1, v10, v11}, Landroid/graphics/PointF;->set(FF)V

    .line 22
    iput v6, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mPrevFingerDiffX:F

    .line 23
    iput v7, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mPrevFingerDiffY:F

    .line 24
    iput v10, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mCurrFingerDiffX:F

    .line 25
    iput v11, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mCurrFingerDiffY:F

    const/high16 p1, 0x3f000000    # 0.5f

    mul-float v10, v10, p1

    add-float/2addr v8, v10

    .line 26
    iput v8, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mFocusX:F

    mul-float v11, v11, p1

    add-float/2addr v9, v11

    .line 27
    iput v9, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mFocusY:F

    .line 28
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getEventTime()J

    move-result-wide v5

    invoke-virtual {v0}, Landroid/view/MotionEvent;->getEventTime()J

    move-result-wide v7

    sub-long/2addr v5, v7

    iput-wide v5, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mTimeDelta:J

    .line 29
    invoke-virtual {p2, v3}, Landroid/view/MotionEvent;->getPressure(I)F

    move-result p1

    invoke-virtual {p2, v4}, Landroid/view/MotionEvent;->getPressure(I)F

    move-result p2

    add-float/2addr p1, p2

    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mCurrPressure:F

    .line 30
    invoke-virtual {v0, v1}, Landroid/view/MotionEvent;->getPressure(I)F

    move-result p1

    invoke-virtual {v0, v2}, Landroid/view/MotionEvent;->getPressure(I)F

    move-result p2

    add-float/2addr p1, p2

    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mPrevPressure:F

    return-void

    :cond_2
    :goto_0
    const/4 p2, 0x1

    .line 31
    iput-boolean p2, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mInvalidGesture:Z

    .line 32
    new-instance p2, Ljava/lang/Throwable;

    invoke-direct {p2}, Ljava/lang/Throwable;-><init>()V

    const-string v0, "ScaleGestureDetector"

    const-string v1, "Invalid MotionEvent stream detected."

    invoke-static {v0, v1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 33
    iget-boolean p2, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mGestureInProgress:Z

    if-eqz p2, :cond_3

    .line 34
    iget-object p2, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mListener:Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector$OnScaleGestureListener;

    invoke-interface {p2, p1, p0}, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector$OnScaleGestureListener;->onScaleEnd(Landroid/view/View;Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;)V

    :cond_3
    return-void
.end method


# virtual methods
.method getCurrentSpanVector()Lcom/xuexiang/xui/widget/imageview/edit/Vector2D;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mCurrSpanVector:Lcom/xuexiang/xui/widget/imageview/edit/Vector2D;

    return-object v0
.end method

.method public getCurrentSpanX()F
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mCurrFingerDiffX:F

    return v0
.end method

.method public getCurrentSpanY()F
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mCurrFingerDiffY:F

    return v0
.end method

.method public getEventTime()J
    .locals 2

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mCurrEvent:Landroid/view/MotionEvent;

    invoke-virtual {v0}, Landroid/view/MotionEvent;->getEventTime()J

    move-result-wide v0

    return-wide v0
.end method

.method getFocusX()F
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mFocusX:F

    return v0
.end method

.method getFocusY()F
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mFocusY:F

    return v0
.end method

.method public getPreviousSpanX()F
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mPrevFingerDiffX:F

    return v0
.end method

.method public getPreviousSpanY()F
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mPrevFingerDiffY:F

    return v0
.end method

.method public getScaleFactor()F
    .locals 2

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mScaleFactor:F

    const/high16 v1, -0x40800000    # -1.0f

    cmpl-float v0, v0, v1

    if-nez v0, :cond_0

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->getCurrentSpan()F

    move-result v0

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->getPreviousSpan()F

    move-result v1

    div-float/2addr v0, v1

    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mScaleFactor:F

    .line 3
    :cond_0
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mScaleFactor:F

    return v0
.end method

.method public getTimeDelta()J
    .locals 2

    iget-wide v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mTimeDelta:J

    return-wide v0
.end method

.method isInProgress()Z
    .locals 1

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mGestureInProgress:Z

    return v0
.end method

.method onTouchEvent(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 7

    .line 1
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    if-nez v0, :cond_0

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->reset()V

    .line 3
    :cond_0
    iget-boolean v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mInvalidGesture:Z

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    goto/16 :goto_4

    .line 4
    :cond_1
    iget-boolean v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mGestureInProgress:Z

    const/4 v4, -0x1

    const/4 v5, 0x5

    if-nez v1, :cond_8

    if-eqz v0, :cond_7

    if-eq v0, v3, :cond_6

    if-eq v0, v5, :cond_2

    goto/16 :goto_3

    .line 5
    :cond_2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mPrevEvent:Landroid/view/MotionEvent;

    if-eqz v0, :cond_3

    .line 6
    invoke-virtual {v0}, Landroid/view/MotionEvent;->recycle()V

    .line 7
    :cond_3
    invoke-static {p2}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mPrevEvent:Landroid/view/MotionEvent;

    const-wide/16 v0, 0x0

    .line 8
    iput-wide v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mTimeDelta:J

    .line 9
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v0

    .line 10
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mActiveId0:I

    invoke-virtual {p2, v1}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v1

    .line 11
    invoke-virtual {p2, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v5

    iput v5, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mActiveId1:I

    if-ltz v1, :cond_4

    if-ne v1, v0, :cond_5

    .line 12
    :cond_4
    invoke-direct {p0, p2, v5, v4}, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->findNewActiveIndex(Landroid/view/MotionEvent;II)I

    move-result v0

    .line 13
    invoke-virtual {p2, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mActiveId0:I

    .line 14
    :cond_5
    iput-boolean v2, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mActive0MostRecent:Z

    .line 15
    invoke-direct {p0, p1, p2}, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->setContext(Landroid/view/View;Landroid/view/MotionEvent;)V

    .line 16
    iget-object p2, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mListener:Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector$OnScaleGestureListener;

    invoke-interface {p2, p1, p0}, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector$OnScaleGestureListener;->onScaleBegin(Landroid/view/View;Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mGestureInProgress:Z

    goto/16 :goto_3

    .line 17
    :cond_6
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->reset()V

    goto/16 :goto_3

    .line 18
    :cond_7
    invoke-virtual {p2, v2}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mActiveId0:I

    .line 19
    iput-boolean v3, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mActive0MostRecent:Z

    goto/16 :goto_3

    :cond_8
    if-eq v0, v3, :cond_15

    const/4 v1, 0x2

    if-eq v0, v1, :cond_14

    const/4 v6, 0x3

    if-eq v0, v6, :cond_13

    if-eq v0, v5, :cond_f

    const/4 v4, 0x6

    if-eq v0, v4, :cond_9

    goto/16 :goto_3

    .line 20
    :cond_9
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v0

    .line 21
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v4

    .line 22
    invoke-virtual {p2, v4}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v5

    if-le v0, v1, :cond_d

    .line 23
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mActiveId0:I

    if-ne v5, v0, :cond_a

    .line 24
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mActiveId1:I

    invoke-direct {p0, p2, v0, v4}, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->findNewActiveIndex(Landroid/view/MotionEvent;II)I

    move-result v0

    if-ltz v0, :cond_b

    .line 25
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mListener:Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector$OnScaleGestureListener;

    invoke-interface {v1, p1, p0}, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector$OnScaleGestureListener;->onScaleEnd(Landroid/view/View;Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;)V

    .line 26
    invoke-virtual {p2, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mActiveId0:I

    .line 27
    iput-boolean v3, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mActive0MostRecent:Z

    .line 28
    invoke-static {p2}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mPrevEvent:Landroid/view/MotionEvent;

    .line 29
    invoke-direct {p0, p1, p2}, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->setContext(Landroid/view/View;Landroid/view/MotionEvent;)V

    .line 30
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mListener:Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector$OnScaleGestureListener;

    invoke-interface {v0, p1, p0}, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector$OnScaleGestureListener;->onScaleBegin(Landroid/view/View;Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mGestureInProgress:Z

    goto :goto_0

    .line 31
    :cond_a
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mActiveId1:I

    if-ne v5, v1, :cond_c

    .line 32
    invoke-direct {p0, p2, v0, v4}, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->findNewActiveIndex(Landroid/view/MotionEvent;II)I

    move-result v0

    if-ltz v0, :cond_b

    .line 33
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mListener:Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector$OnScaleGestureListener;

    invoke-interface {v1, p1, p0}, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector$OnScaleGestureListener;->onScaleEnd(Landroid/view/View;Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;)V

    .line 34
    invoke-virtual {p2, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mActiveId1:I

    .line 35
    iput-boolean v2, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mActive0MostRecent:Z

    .line 36
    invoke-static {p2}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mPrevEvent:Landroid/view/MotionEvent;

    .line 37
    invoke-direct {p0, p1, p2}, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->setContext(Landroid/view/View;Landroid/view/MotionEvent;)V

    .line 38
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mListener:Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector$OnScaleGestureListener;

    invoke-interface {v0, p1, p0}, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector$OnScaleGestureListener;->onScaleBegin(Landroid/view/View;Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mGestureInProgress:Z

    goto :goto_0

    :cond_b
    const/4 v2, 0x1

    .line 39
    :cond_c
    :goto_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mPrevEvent:Landroid/view/MotionEvent;

    invoke-virtual {v0}, Landroid/view/MotionEvent;->recycle()V

    .line 40
    invoke-static {p2}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mPrevEvent:Landroid/view/MotionEvent;

    .line 41
    invoke-direct {p0, p1, p2}, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->setContext(Landroid/view/View;Landroid/view/MotionEvent;)V

    goto :goto_1

    :cond_d
    const/4 v2, 0x1

    :goto_1
    if-eqz v2, :cond_16

    .line 42
    invoke-direct {p0, p1, p2}, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->setContext(Landroid/view/View;Landroid/view/MotionEvent;)V

    .line 43
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mActiveId0:I

    if-ne v5, v0, :cond_e

    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mActiveId1:I

    .line 44
    :cond_e
    invoke-virtual {p2, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v1

    .line 45
    invoke-virtual {p2, v1}, Landroid/view/MotionEvent;->getX(I)F

    move-result v2

    iput v2, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mFocusX:F

    .line 46
    invoke-virtual {p2, v1}, Landroid/view/MotionEvent;->getY(I)F

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mFocusY:F

    .line 47
    iget-object p2, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mListener:Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector$OnScaleGestureListener;

    invoke-interface {p2, p1, p0}, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector$OnScaleGestureListener;->onScaleEnd(Landroid/view/View;Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;)V

    .line 48
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->reset()V

    .line 49
    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mActiveId0:I

    .line 50
    iput-boolean v3, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mActive0MostRecent:Z

    goto/16 :goto_3

    .line 51
    :cond_f
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mListener:Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector$OnScaleGestureListener;

    invoke-interface {v0, p1, p0}, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector$OnScaleGestureListener;->onScaleEnd(Landroid/view/View;Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;)V

    .line 52
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mActiveId0:I

    .line 53
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mActiveId1:I

    .line 54
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->reset()V

    .line 55
    invoke-static {p2}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object v5

    iput-object v5, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mPrevEvent:Landroid/view/MotionEvent;

    .line 56
    iget-boolean v5, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mActive0MostRecent:Z

    if-eqz v5, :cond_10

    goto :goto_2

    :cond_10
    move v0, v1

    :goto_2
    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mActiveId0:I

    .line 57
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v0

    invoke-virtual {p2, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mActiveId1:I

    .line 58
    iput-boolean v2, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mActive0MostRecent:Z

    .line 59
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mActiveId0:I

    invoke-virtual {p2, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v0

    if-ltz v0, :cond_11

    .line 60
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mActiveId0:I

    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mActiveId1:I

    if-ne v0, v1, :cond_12

    .line 61
    :cond_11
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mActiveId1:I

    invoke-direct {p0, p2, v0, v4}, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->findNewActiveIndex(Landroid/view/MotionEvent;II)I

    move-result v0

    .line 62
    invoke-virtual {p2, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mActiveId0:I

    .line 63
    :cond_12
    invoke-direct {p0, p1, p2}, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->setContext(Landroid/view/View;Landroid/view/MotionEvent;)V

    .line 64
    iget-object p2, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mListener:Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector$OnScaleGestureListener;

    invoke-interface {p2, p1, p0}, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector$OnScaleGestureListener;->onScaleBegin(Landroid/view/View;Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mGestureInProgress:Z

    goto :goto_3

    .line 65
    :cond_13
    iget-object p2, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mListener:Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector$OnScaleGestureListener;

    invoke-interface {p2, p1, p0}, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector$OnScaleGestureListener;->onScaleEnd(Landroid/view/View;Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;)V

    .line 66
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->reset()V

    goto :goto_3

    .line 67
    :cond_14
    invoke-direct {p0, p1, p2}, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->setContext(Landroid/view/View;Landroid/view/MotionEvent;)V

    .line 68
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mCurrPressure:F

    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mPrevPressure:F

    div-float/2addr v0, v1

    const v1, 0x3f2b851f    # 0.67f

    cmpl-float v0, v0, v1

    if-lez v0, :cond_16

    .line 69
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mListener:Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector$OnScaleGestureListener;

    invoke-interface {v0, p1, p0}, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector$OnScaleGestureListener;->onScale(Landroid/view/View;Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;)Z

    move-result p1

    if-eqz p1, :cond_16

    .line 70
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mPrevEvent:Landroid/view/MotionEvent;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->recycle()V

    .line 71
    invoke-static {p2}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object p1

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->mPrevEvent:Landroid/view/MotionEvent;

    goto :goto_3

    .line 72
    :cond_15
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/imageview/edit/ScaleGestureDetector;->reset()V

    :cond_16
    :goto_3
    const/4 v2, 0x1

    :goto_4
    return v2
.end method
