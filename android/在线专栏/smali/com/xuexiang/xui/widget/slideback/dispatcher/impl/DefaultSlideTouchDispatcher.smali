.class public Lcom/xuexiang/xui/widget/slideback/dispatcher/impl/DefaultSlideTouchDispatcher;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/xuexiang/xui/widget/slideback/dispatcher/ISlideTouchEventDispatcher;


# instance fields
.field protected mCallBack:Lcom/xuexiang/xui/widget/slideback/callback/SlideCallBack;

.field protected mDownX:F

.field protected mIsSideSlideLeft:Z

.field protected mIsSideSlideRight:Z

.field protected mMoveXLength:F

.field protected mOnSlideUpdateListener:Lcom/xuexiang/xui/widget/slideback/dispatcher/OnSlideUpdateListener;

.field protected mSlideInfo:Lcom/xuexiang/xui/widget/slideback/SlideInfo;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/slideback/dispatcher/impl/DefaultSlideTouchDispatcher;->mIsSideSlideLeft:Z

    .line 3
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/slideback/dispatcher/impl/DefaultSlideTouchDispatcher;->mIsSideSlideRight:Z

    const/4 v0, 0x0

    .line 4
    iput v0, p0, Lcom/xuexiang/xui/widget/slideback/dispatcher/impl/DefaultSlideTouchDispatcher;->mDownX:F

    .line 5
    iput v0, p0, Lcom/xuexiang/xui/widget/slideback/dispatcher/impl/DefaultSlideTouchDispatcher;->mMoveXLength:F

    return-void
.end method


# virtual methods
.method public init(Lcom/xuexiang/xui/widget/slideback/SlideInfo;Lcom/xuexiang/xui/widget/slideback/callback/SlideCallBack;Lcom/xuexiang/xui/widget/slideback/dispatcher/OnSlideUpdateListener;)Lcom/xuexiang/xui/widget/slideback/dispatcher/ISlideTouchEventDispatcher;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/slideback/dispatcher/impl/DefaultSlideTouchDispatcher;->mSlideInfo:Lcom/xuexiang/xui/widget/slideback/SlideInfo;

    .line 2
    iput-object p2, p0, Lcom/xuexiang/xui/widget/slideback/dispatcher/impl/DefaultSlideTouchDispatcher;->mCallBack:Lcom/xuexiang/xui/widget/slideback/callback/SlideCallBack;

    .line 3
    iput-object p3, p0, Lcom/xuexiang/xui/widget/slideback/dispatcher/impl/DefaultSlideTouchDispatcher;->mOnSlideUpdateListener:Lcom/xuexiang/xui/widget/slideback/dispatcher/OnSlideUpdateListener;

    return-object p0
.end method

.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 3

    .line 1
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result p1

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p1, :cond_a

    if-eq p1, v1, :cond_5

    const/4 v2, 0x2

    if-eq p1, v2, :cond_0

    goto/16 :goto_2

    .line 2
    :cond_0
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/slideback/dispatcher/impl/DefaultSlideTouchDispatcher;->mIsSideSlideLeft:Z

    if-nez p1, :cond_1

    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/slideback/dispatcher/impl/DefaultSlideTouchDispatcher;->mIsSideSlideRight:Z

    if-eqz p1, :cond_c

    .line 3
    :cond_1
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F

    move-result p1

    iget v2, p0, Lcom/xuexiang/xui/widget/slideback/dispatcher/impl/DefaultSlideTouchDispatcher;->mDownX:F

    sub-float/2addr p1, v2

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/slideback/dispatcher/impl/DefaultSlideTouchDispatcher;->mMoveXLength:F

    .line 4
    iget-object v2, p0, Lcom/xuexiang/xui/widget/slideback/dispatcher/impl/DefaultSlideTouchDispatcher;->mSlideInfo:Lcom/xuexiang/xui/widget/slideback/SlideInfo;

    invoke-virtual {v2}, Lcom/xuexiang/xui/widget/slideback/SlideInfo;->getDragRate()F

    move-result v2

    div-float/2addr p1, v2

    iget-object v2, p0, Lcom/xuexiang/xui/widget/slideback/dispatcher/impl/DefaultSlideTouchDispatcher;->mSlideInfo:Lcom/xuexiang/xui/widget/slideback/SlideInfo;

    invoke-virtual {v2}, Lcom/xuexiang/xui/widget/slideback/SlideInfo;->getMaxSlideLength()F

    move-result v2

    cmpg-float p1, p1, v2

    if-gtz p1, :cond_3

    .line 5
    iget-object p1, p0, Lcom/xuexiang/xui/widget/slideback/dispatcher/impl/DefaultSlideTouchDispatcher;->mSlideInfo:Lcom/xuexiang/xui/widget/slideback/SlideInfo;

    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/slideback/SlideInfo;->isAllowEdgeLeft()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/slideback/dispatcher/impl/DefaultSlideTouchDispatcher;->mIsSideSlideLeft:Z

    if-eqz p1, :cond_2

    .line 6
    iget p1, p0, Lcom/xuexiang/xui/widget/slideback/dispatcher/impl/DefaultSlideTouchDispatcher;->mMoveXLength:F

    iget-object v2, p0, Lcom/xuexiang/xui/widget/slideback/dispatcher/impl/DefaultSlideTouchDispatcher;->mSlideInfo:Lcom/xuexiang/xui/widget/slideback/SlideInfo;

    invoke-virtual {v2}, Lcom/xuexiang/xui/widget/slideback/SlideInfo;->getDragRate()F

    move-result v2

    div-float/2addr p1, v2

    invoke-virtual {p0, v1, p1}, Lcom/xuexiang/xui/widget/slideback/dispatcher/impl/DefaultSlideTouchDispatcher;->updateSlideLength(ZF)V

    goto :goto_0

    .line 7
    :cond_2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/slideback/dispatcher/impl/DefaultSlideTouchDispatcher;->mSlideInfo:Lcom/xuexiang/xui/widget/slideback/SlideInfo;

    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/slideback/SlideInfo;->isAllowEdgeRight()Z

    move-result p1

    if-eqz p1, :cond_3

    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/slideback/dispatcher/impl/DefaultSlideTouchDispatcher;->mIsSideSlideRight:Z

    if-eqz p1, :cond_3

    .line 8
    iget p1, p0, Lcom/xuexiang/xui/widget/slideback/dispatcher/impl/DefaultSlideTouchDispatcher;->mMoveXLength:F

    iget-object v2, p0, Lcom/xuexiang/xui/widget/slideback/dispatcher/impl/DefaultSlideTouchDispatcher;->mSlideInfo:Lcom/xuexiang/xui/widget/slideback/SlideInfo;

    invoke-virtual {v2}, Lcom/xuexiang/xui/widget/slideback/SlideInfo;->getDragRate()F

    move-result v2

    div-float/2addr p1, v2

    invoke-virtual {p0, v0, p1}, Lcom/xuexiang/xui/widget/slideback/dispatcher/impl/DefaultSlideTouchDispatcher;->updateSlideLength(ZF)V

    .line 9
    :cond_3
    :goto_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/slideback/dispatcher/impl/DefaultSlideTouchDispatcher;->mSlideInfo:Lcom/xuexiang/xui/widget/slideback/SlideInfo;

    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/slideback/SlideInfo;->isAllowEdgeLeft()Z

    move-result p1

    if-eqz p1, :cond_4

    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/slideback/dispatcher/impl/DefaultSlideTouchDispatcher;->mIsSideSlideLeft:Z

    if-eqz p1, :cond_4

    .line 10
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawY()F

    move-result p1

    float-to-int p1, p1

    invoke-virtual {p0, v1, p1}, Lcom/xuexiang/xui/widget/slideback/dispatcher/impl/DefaultSlideTouchDispatcher;->updateSlidePosition(ZI)V

    goto/16 :goto_2

    .line 11
    :cond_4
    iget-object p1, p0, Lcom/xuexiang/xui/widget/slideback/dispatcher/impl/DefaultSlideTouchDispatcher;->mSlideInfo:Lcom/xuexiang/xui/widget/slideback/SlideInfo;

    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/slideback/SlideInfo;->isAllowEdgeRight()Z

    move-result p1

    if-eqz p1, :cond_c

    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/slideback/dispatcher/impl/DefaultSlideTouchDispatcher;->mIsSideSlideRight:Z

    if-eqz p1, :cond_c

    .line 12
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawY()F

    move-result p1

    float-to-int p1, p1

    invoke-virtual {p0, v0, p1}, Lcom/xuexiang/xui/widget/slideback/dispatcher/impl/DefaultSlideTouchDispatcher;->updateSlidePosition(ZI)V

    goto/16 :goto_2

    .line 13
    :cond_5
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/slideback/dispatcher/impl/DefaultSlideTouchDispatcher;->mIsSideSlideLeft:Z

    if-nez p1, :cond_6

    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/slideback/dispatcher/impl/DefaultSlideTouchDispatcher;->mIsSideSlideRight:Z

    if-eqz p1, :cond_7

    :cond_6
    iget p1, p0, Lcom/xuexiang/xui/widget/slideback/dispatcher/impl/DefaultSlideTouchDispatcher;->mMoveXLength:F

    iget-object p2, p0, Lcom/xuexiang/xui/widget/slideback/dispatcher/impl/DefaultSlideTouchDispatcher;->mSlideInfo:Lcom/xuexiang/xui/widget/slideback/SlideInfo;

    invoke-virtual {p2}, Lcom/xuexiang/xui/widget/slideback/SlideInfo;->getDragRate()F

    move-result p2

    div-float/2addr p1, p2

    iget-object p2, p0, Lcom/xuexiang/xui/widget/slideback/dispatcher/impl/DefaultSlideTouchDispatcher;->mSlideInfo:Lcom/xuexiang/xui/widget/slideback/SlideInfo;

    invoke-virtual {p2}, Lcom/xuexiang/xui/widget/slideback/SlideInfo;->getMaxSlideLength()F

    move-result p2

    cmpl-float p1, p1, p2

    if-ltz p1, :cond_7

    iget-object p1, p0, Lcom/xuexiang/xui/widget/slideback/dispatcher/impl/DefaultSlideTouchDispatcher;->mCallBack:Lcom/xuexiang/xui/widget/slideback/callback/SlideCallBack;

    if-eqz p1, :cond_7

    .line 14
    iget-boolean p2, p0, Lcom/xuexiang/xui/widget/slideback/dispatcher/impl/DefaultSlideTouchDispatcher;->mIsSideSlideLeft:Z

    xor-int/2addr p2, v1

    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/slideback/callback/SlideCallBack;->onSlide(I)V

    .line 15
    :cond_7
    iget-object p1, p0, Lcom/xuexiang/xui/widget/slideback/dispatcher/impl/DefaultSlideTouchDispatcher;->mSlideInfo:Lcom/xuexiang/xui/widget/slideback/SlideInfo;

    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/slideback/SlideInfo;->isAllowEdgeLeft()Z

    move-result p1

    const/4 p2, 0x0

    if-eqz p1, :cond_8

    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/slideback/dispatcher/impl/DefaultSlideTouchDispatcher;->mIsSideSlideLeft:Z

    if-eqz p1, :cond_8

    .line 16
    invoke-virtual {p0, v1, p2}, Lcom/xuexiang/xui/widget/slideback/dispatcher/impl/DefaultSlideTouchDispatcher;->updateSlideLength(ZF)V

    goto :goto_1

    .line 17
    :cond_8
    iget-object p1, p0, Lcom/xuexiang/xui/widget/slideback/dispatcher/impl/DefaultSlideTouchDispatcher;->mSlideInfo:Lcom/xuexiang/xui/widget/slideback/SlideInfo;

    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/slideback/SlideInfo;->isAllowEdgeRight()Z

    move-result p1

    if-eqz p1, :cond_9

    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/slideback/dispatcher/impl/DefaultSlideTouchDispatcher;->mIsSideSlideRight:Z

    if-eqz p1, :cond_9

    .line 18
    invoke-virtual {p0, v0, p2}, Lcom/xuexiang/xui/widget/slideback/dispatcher/impl/DefaultSlideTouchDispatcher;->updateSlideLength(ZF)V

    .line 19
    :cond_9
    :goto_1
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/slideback/dispatcher/impl/DefaultSlideTouchDispatcher;->mIsSideSlideLeft:Z

    .line 20
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/slideback/dispatcher/impl/DefaultSlideTouchDispatcher;->mIsSideSlideRight:Z

    goto :goto_2

    .line 21
    :cond_a
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/slideback/dispatcher/impl/DefaultSlideTouchDispatcher;->mDownX:F

    .line 22
    iget-object p1, p0, Lcom/xuexiang/xui/widget/slideback/dispatcher/impl/DefaultSlideTouchDispatcher;->mSlideInfo:Lcom/xuexiang/xui/widget/slideback/SlideInfo;

    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/slideback/SlideInfo;->isAllowEdgeLeft()Z

    move-result p1

    if-eqz p1, :cond_b

    iget p1, p0, Lcom/xuexiang/xui/widget/slideback/dispatcher/impl/DefaultSlideTouchDispatcher;->mDownX:F

    iget-object p2, p0, Lcom/xuexiang/xui/widget/slideback/dispatcher/impl/DefaultSlideTouchDispatcher;->mSlideInfo:Lcom/xuexiang/xui/widget/slideback/SlideInfo;

    invoke-virtual {p2}, Lcom/xuexiang/xui/widget/slideback/SlideInfo;->getSideSlideLength()F

    move-result p2

    cmpg-float p1, p1, p2

    if-gtz p1, :cond_b

    .line 23
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/slideback/dispatcher/impl/DefaultSlideTouchDispatcher;->mIsSideSlideLeft:Z

    goto :goto_2

    .line 24
    :cond_b
    iget-object p1, p0, Lcom/xuexiang/xui/widget/slideback/dispatcher/impl/DefaultSlideTouchDispatcher;->mSlideInfo:Lcom/xuexiang/xui/widget/slideback/SlideInfo;

    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/slideback/SlideInfo;->isAllowEdgeRight()Z

    move-result p1

    if-eqz p1, :cond_c

    iget p1, p0, Lcom/xuexiang/xui/widget/slideback/dispatcher/impl/DefaultSlideTouchDispatcher;->mDownX:F

    iget-object p2, p0, Lcom/xuexiang/xui/widget/slideback/dispatcher/impl/DefaultSlideTouchDispatcher;->mSlideInfo:Lcom/xuexiang/xui/widget/slideback/SlideInfo;

    invoke-virtual {p2}, Lcom/xuexiang/xui/widget/slideback/SlideInfo;->getScreenWidth()F

    move-result p2

    iget-object v2, p0, Lcom/xuexiang/xui/widget/slideback/dispatcher/impl/DefaultSlideTouchDispatcher;->mSlideInfo:Lcom/xuexiang/xui/widget/slideback/SlideInfo;

    invoke-virtual {v2}, Lcom/xuexiang/xui/widget/slideback/SlideInfo;->getSideSlideLength()F

    move-result v2

    sub-float/2addr p2, v2

    cmpl-float p1, p1, p2

    if-ltz p1, :cond_c

    .line 25
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/slideback/dispatcher/impl/DefaultSlideTouchDispatcher;->mIsSideSlideRight:Z

    .line 26
    :cond_c
    :goto_2
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/slideback/dispatcher/impl/DefaultSlideTouchDispatcher;->mIsSideSlideLeft:Z

    if-nez p1, :cond_d

    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/slideback/dispatcher/impl/DefaultSlideTouchDispatcher;->mIsSideSlideRight:Z

    if-eqz p1, :cond_e

    :cond_d
    const/4 v0, 0x1

    :cond_e
    return v0
.end method

.method public updateSlideLength(ZF)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/slideback/dispatcher/impl/DefaultSlideTouchDispatcher;->mOnSlideUpdateListener:Lcom/xuexiang/xui/widget/slideback/dispatcher/OnSlideUpdateListener;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0, p1, p2}, Lcom/xuexiang/xui/widget/slideback/dispatcher/OnSlideUpdateListener;->updateSlideLength(ZF)V

    :cond_0
    return-void
.end method

.method public updateSlidePosition(ZI)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/slideback/dispatcher/impl/DefaultSlideTouchDispatcher;->mOnSlideUpdateListener:Lcom/xuexiang/xui/widget/slideback/dispatcher/OnSlideUpdateListener;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0, p1, p2}, Lcom/xuexiang/xui/widget/slideback/dispatcher/OnSlideUpdateListener;->updateSlidePosition(ZI)V

    :cond_0
    return-void
.end method
