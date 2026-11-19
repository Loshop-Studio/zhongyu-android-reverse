.class public Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static SCROLL_ORIENTATION_HORIZONTAL:I = 0x1

.field private static SCROLL_ORIENTATION_NONE:I = -0x1

.field private static SCROLL_ORIENTATION_VERTICAL:I = 0x0

.field public static final TAG:Ljava/lang/String; = "PosIndicator"


# instance fields
.field private mConfigurationHasChanged:Z

.field private mCurrentPos:I

.field private mDistanceToDownX:F

.field private mDistanceToDownY:F

.field private mDownPoint:Landroid/graphics/PointF;

.field public mEndPos:I

.field private mIsDragging:Z

.field private mIsUnderTouch:Z

.field private mLastMovePoint:Landroid/graphics/PointF;

.field private mLastPos:I

.field private mOffsetX:F

.field private mOffsetY:F

.field private mPressedPos:I

.field private mReleasePoint:Landroid/graphics/PointF;

.field private mSaveCurrentPosRatio:F

.field private mScrollOrientation:I

.field private mStartPos:I

.field private mTouchAction:I

.field private mTouchSlop:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mStartPos:I

    .line 3
    iput v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mEndPos:I

    .line 4
    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mLastMovePoint:Landroid/graphics/PointF;

    .line 5
    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mDownPoint:Landroid/graphics/PointF;

    .line 6
    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mReleasePoint:Landroid/graphics/PointF;

    const/4 v0, -0x1

    .line 7
    iput v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mTouchAction:I

    .line 8
    sget v0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->SCROLL_ORIENTATION_NONE:I

    iput v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mScrollOrientation:I

    return-void
.end method

.method private restorePosIfNeeded()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mConfigurationHasChanged:Z

    if-eqz v0, :cond_0

    .line 2
    iget v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mStartPos:I

    int-to-float v1, v0

    iget v2, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mEndPos:I

    sub-int/2addr v2, v0

    int-to-float v0, v2

    iget v2, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mSaveCurrentPosRatio:F

    mul-float v0, v0, v2

    add-float/2addr v1, v0

    float-to-int v0, v1

    iput v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mCurrentPos:I

    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Need restore current pos, mCurrentPos: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mCurrentPos:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "PosIndicator"

    invoke-static {v1, v0}, Lcom/xuexiang/xui/logs/UILog;->dTag(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method private setDistanceToDown(FF)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mDownPoint:Landroid/graphics/PointF;

    iget v1, v0, Landroid/graphics/PointF;->x:F

    sub-float/2addr p1, v1

    iput p1, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mDistanceToDownX:F

    .line 2
    iget p1, v0, Landroid/graphics/PointF;->y:F

    sub-float/2addr p2, p1

    iput p2, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mDistanceToDownY:F

    return-void
.end method

.method private setOffset(FF)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mOffsetX:F

    .line 2
    iput p2, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mOffsetY:F

    return-void
.end method


# virtual methods
.method public checkPosBoundary(I)I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mStartPos:I

    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    move-result p1

    .line 2
    iget v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mEndPos:I

    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result p1

    return p1
.end method

.method public getCurrentPos()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mCurrentPos:I

    return v0
.end method

.method public getDistanceToDownX()F
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mDistanceToDownX:F

    return v0
.end method

.method public getDistanceToDownY()F
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mDistanceToDownY:F

    return v0
.end method

.method public getEndPos()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mEndPos:I

    return v0
.end method

.method public getFingerDownPoint()Landroid/graphics/PointF;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mDownPoint:Landroid/graphics/PointF;

    return-object v0
.end method

.method public getFingerMovePoint()Landroid/graphics/PointF;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mLastMovePoint:Landroid/graphics/PointF;

    return-object v0
.end method

.method public getFingerReleasePoint()Landroid/graphics/PointF;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mReleasePoint:Landroid/graphics/PointF;

    return-object v0
.end method

.method public getLastPos()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mLastPos:I

    return v0
.end method

.method public getOffsetX()F
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mOffsetX:F

    return v0
.end method

.method public getOffsetY()F
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mOffsetY:F

    return v0
.end method

.method public getPosDistanceFromStart()I
    .locals 2

    iget v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mCurrentPos:I

    iget v1, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mStartPos:I

    sub-int/2addr v0, v1

    return v0
.end method

.method public getPosOffset()I
    .locals 2

    iget v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mCurrentPos:I

    iget v1, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mLastPos:I

    sub-int/2addr v0, v1

    return v0
.end method

.method public getStartPos()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mStartPos:I

    return v0
.end method

.method public getTouchAction()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mTouchAction:I

    return v0
.end method

.method public getTouchSlop()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mTouchSlop:I

    return v0
.end method

.method public hasJustBackEndPos()Z
    .locals 2

    iget v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mLastPos:I

    iget v1, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mEndPos:I

    if-eq v0, v1, :cond_0

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->isInEndPos()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hasJustBackStartPos()Z
    .locals 2

    iget v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mLastPos:I

    iget v1, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mStartPos:I

    if-eq v0, v1, :cond_0

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->isInStartPos()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hasJustLeftEndPos()Z
    .locals 2

    iget v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mLastPos:I

    iget v1, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mEndPos:I

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->hasLeftEndPos()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hasJustLeftStartPos()Z
    .locals 2

    iget v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mLastPos:I

    iget v1, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mStartPos:I

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->hasLeftStartPos()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hasLeftEndPos()Z
    .locals 2

    iget v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mCurrentPos:I

    iget v1, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mEndPos:I

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hasLeftStartPos()Z
    .locals 2

    iget v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mCurrentPos:I

    iget v1, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mStartPos:I

    if-le v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hasMovedAfterPressedDown()Z
    .locals 2

    iget v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mCurrentPos:I

    iget v1, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mPressedPos:I

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public initStartAndEndPos(II)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mStartPos:I

    .line 2
    iput p2, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mEndPos:I

    return-void
.end method

.method public isDragging()Z
    .locals 1

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mIsDragging:Z

    return v0
.end method

.method public isInEndPos()Z
    .locals 2

    iget v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mCurrentPos:I

    iget v1, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mEndPos:I

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isInStartPos()Z
    .locals 2

    iget v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mCurrentPos:I

    iget v1, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mStartPos:I

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isMoveDown()Z
    .locals 2

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->getOffsetY()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isMoveUp()Z
    .locals 2

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->getOffsetY()F

    move-result v0

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isScrollHorizontal()Z
    .locals 2

    iget v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mScrollOrientation:I

    sget v1, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->SCROLL_ORIENTATION_HORIZONTAL:I

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isScrollVertical()Z
    .locals 2

    iget v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mScrollOrientation:I

    sget v1, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->SCROLL_ORIENTATION_VERTICAL:I

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isUnderTouch()Z
    .locals 1

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mIsUnderTouch:Z

    return v0
.end method

.method public onDown(FF)V
    .locals 1

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mIsUnderTouch:Z

    .line 2
    iget v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mCurrentPos:I

    iput v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mPressedPos:I

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mLastMovePoint:Landroid/graphics/PointF;

    invoke-virtual {v0, p1, p2}, Landroid/graphics/PointF;->set(FF)V

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mDownPoint:Landroid/graphics/PointF;

    invoke-virtual {v0, p1, p2}, Landroid/graphics/PointF;->set(FF)V

    const/4 p1, 0x0

    .line 5
    iput p1, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mTouchAction:I

    return-void
.end method

.method public onMove(FF)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mLastMovePoint:Landroid/graphics/PointF;

    iget v1, v0, Landroid/graphics/PointF;->x:F

    sub-float v1, p1, v1

    .line 2
    iget v0, v0, Landroid/graphics/PointF;->y:F

    sub-float v0, p2, v0

    .line 3
    iget-boolean v2, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mIsDragging:Z

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-nez v2, :cond_1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v2

    iget v5, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mTouchSlop:I

    int-to-float v6, v5

    cmpl-float v2, v2, v6

    if-lez v2, :cond_1

    .line 4
    iput-boolean v4, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mIsDragging:Z

    cmpg-float v2, v0, v3

    if-gez v2, :cond_0

    int-to-float v2, v5

    add-float/2addr v0, v2

    goto :goto_0

    :cond_0
    int-to-float v2, v5

    sub-float/2addr v0, v2

    .line 5
    :goto_0
    sget v2, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->SCROLL_ORIENTATION_VERTICAL:I

    iput v2, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mScrollOrientation:I

    .line 6
    :cond_1
    iget-boolean v2, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mIsDragging:Z

    if-nez v2, :cond_3

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v2

    iget v5, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mTouchSlop:I

    int-to-float v6, v5

    cmpl-float v2, v2, v6

    if-lez v2, :cond_3

    .line 7
    iput-boolean v4, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mIsDragging:Z

    cmpg-float v2, v1, v3

    if-gez v2, :cond_2

    int-to-float v2, v5

    add-float/2addr v1, v2

    goto :goto_1

    :cond_2
    int-to-float v2, v5

    sub-float/2addr v1, v2

    .line 8
    :goto_1
    sget v2, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->SCROLL_ORIENTATION_HORIZONTAL:I

    iput v2, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mScrollOrientation:I

    .line 9
    :cond_3
    iget-boolean v2, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mIsDragging:Z

    if-eqz v2, :cond_4

    .line 10
    invoke-direct {p0, v1, v0}, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->setOffset(FF)V

    .line 11
    invoke-direct {p0, p1, p2}, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->setDistanceToDown(FF)V

    .line 12
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mLastMovePoint:Landroid/graphics/PointF;

    invoke-virtual {v0, p1, p2}, Landroid/graphics/PointF;->set(FF)V

    const/4 p1, 0x2

    .line 13
    iput p1, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mTouchAction:I

    :cond_4
    return-void
.end method

.method public onPointerDown(FF)V
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mLastMovePoint:Landroid/graphics/PointF;

    invoke-virtual {v0, p1, p2}, Landroid/graphics/PointF;->set(FF)V

    return-void
.end method

.method public onPointerUp(FF)V
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mLastMovePoint:Landroid/graphics/PointF;

    invoke-virtual {v0, p1, p2}, Landroid/graphics/PointF;->set(FF)V

    return-void
.end method

.method public onRelease(FF)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mIsUnderTouch:Z

    .line 2
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mIsDragging:Z

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mReleasePoint:Landroid/graphics/PointF;

    invoke-virtual {v0, p1, p2}, Landroid/graphics/PointF;->set(FF)V

    const/4 p1, 0x1

    .line 4
    iput p1, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mTouchAction:I

    .line 5
    sget p1, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->SCROLL_ORIENTATION_NONE:I

    iput p1, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mScrollOrientation:I

    return-void
.end method

.method public savePosOnConfigurationChanged()V
    .locals 4

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mCurrentPos:I

    iget v1, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mStartPos:I

    sub-int/2addr v0, v1

    int-to-float v0, v0

    const/high16 v2, 0x3f800000    # 1.0f

    mul-float v0, v0, v2

    iget v3, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mEndPos:I

    sub-int/2addr v3, v1

    int-to-float v1, v3

    div-float/2addr v0, v1

    iput v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mSaveCurrentPosRatio:F

    const/high16 v1, 0x41200000    # 10.0f

    mul-float v0, v0, v1

    .line 2
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    int-to-float v0, v0

    mul-float v0, v0, v2

    div-float/2addr v0, v1

    iput v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mSaveCurrentPosRatio:F

    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "savePosOnConfigurationChanged, mSaveCurrentPosRation: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mSaveCurrentPosRatio:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "PosIndicator"

    invoke-static {v1, v0}, Lcom/xuexiang/xui/logs/UILog;->dTag(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public setCurrentPos(I)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mCurrentPos:I

    iput v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mLastPos:I

    .line 2
    iput p1, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mCurrentPos:I

    return-void
.end method

.method public setTouchSlop(I)V
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mTouchSlop:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "mCurrentPos: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mCurrentPos:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mLastPos: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mLastPos:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mPressedPos: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mPressedPos:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", isInStartPos: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->isInStartPos()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", isInEndPos: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->isInEndPos()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public willOverEndPos()Z
    .locals 2

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mCurrentPos:I

    int-to-float v0, v0

    iget v1, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mOffsetY:F

    sub-float/2addr v0, v1

    float-to-int v0, v0

    .line 2
    iget v1, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mEndPos:I

    if-le v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public willOverStartPos()Z
    .locals 2

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mCurrentPos:I

    int-to-float v0, v0

    iget v1, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mOffsetY:F

    sub-float/2addr v0, v1

    float-to-int v0, v0

    .line 2
    iget v1, p0, Lcom/xuexiang/xui/widget/layout/linkage/PosIndicator;->mStartPos:I

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
