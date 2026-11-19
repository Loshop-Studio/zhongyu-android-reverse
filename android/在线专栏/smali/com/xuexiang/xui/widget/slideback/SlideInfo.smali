.class public Lcom/xuexiang/xui/widget/slideback/SlideInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private mArrowSize:F

.field private mBackViewHeight:F

.field private mDragRate:F

.field private mIsAllowEdgeLeft:Z

.field private mIsAllowEdgeRight:Z

.field private mMaxSlideLength:F

.field private mScreenWidth:F

.field private mSideSlideLength:F


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getArrowSize()F
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/slideback/SlideInfo;->mArrowSize:F

    return v0
.end method

.method public getBackViewHeight()F
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/slideback/SlideInfo;->mBackViewHeight:F

    return v0
.end method

.method public getDragRate()F
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/slideback/SlideInfo;->mDragRate:F

    return v0
.end method

.method public getMaxSlideLength()F
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/slideback/SlideInfo;->mMaxSlideLength:F

    return v0
.end method

.method public getScreenWidth()F
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/slideback/SlideInfo;->mScreenWidth:F

    return v0
.end method

.method public getSideSlideLength()F
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/slideback/SlideInfo;->mSideSlideLength:F

    return v0
.end method

.method public isAllowEdgeLeft()Z
    .locals 1

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/slideback/SlideInfo;->mIsAllowEdgeLeft:Z

    return v0
.end method

.method public isAllowEdgeRight()Z
    .locals 1

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/slideback/SlideInfo;->mIsAllowEdgeRight:Z

    return v0
.end method

.method public setAllowEdgeLeft(Z)Lcom/xuexiang/xui/widget/slideback/SlideInfo;
    .locals 0

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/slideback/SlideInfo;->mIsAllowEdgeLeft:Z

    return-object p0
.end method

.method public setAllowEdgeRight(Z)Lcom/xuexiang/xui/widget/slideback/SlideInfo;
    .locals 0

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/slideback/SlideInfo;->mIsAllowEdgeRight:Z

    return-object p0
.end method

.method public setArrowSize(F)Lcom/xuexiang/xui/widget/slideback/SlideInfo;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/slideback/SlideInfo;->mArrowSize:F

    return-object p0
.end method

.method public setBackViewHeight(F)Lcom/xuexiang/xui/widget/slideback/SlideInfo;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/slideback/SlideInfo;->mBackViewHeight:F

    return-object p0
.end method

.method public setDragRate(F)Lcom/xuexiang/xui/widget/slideback/SlideInfo;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/slideback/SlideInfo;->mDragRate:F

    return-object p0
.end method

.method public setEdgeMode(ZZ)Lcom/xuexiang/xui/widget/slideback/SlideInfo;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/slideback/SlideInfo;->mIsAllowEdgeLeft:Z

    .line 2
    iput-boolean p2, p0, Lcom/xuexiang/xui/widget/slideback/SlideInfo;->mIsAllowEdgeRight:Z

    return-object p0
.end method

.method public setMaxSlideLength(F)Lcom/xuexiang/xui/widget/slideback/SlideInfo;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/slideback/SlideInfo;->mMaxSlideLength:F

    return-object p0
.end method

.method public setScreenWidth(F)Lcom/xuexiang/xui/widget/slideback/SlideInfo;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/slideback/SlideInfo;->mScreenWidth:F

    return-object p0
.end method

.method public setSideSlideLength(F)Lcom/xuexiang/xui/widget/slideback/SlideInfo;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/slideback/SlideInfo;->mSideSlideLength:F

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SlideInfo{mBackViewHeight="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/xuexiang/xui/widget/slideback/SlideInfo;->mBackViewHeight:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", mArrowSize="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/xuexiang/xui/widget/slideback/SlideInfo;->mArrowSize:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", mMaxSlideLength="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/xuexiang/xui/widget/slideback/SlideInfo;->mMaxSlideLength:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", mSideSlideLength="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/xuexiang/xui/widget/slideback/SlideInfo;->mSideSlideLength:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", mDragRate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/xuexiang/xui/widget/slideback/SlideInfo;->mDragRate:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", mIsAllowEdgeLeft="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/xuexiang/xui/widget/slideback/SlideInfo;->mIsAllowEdgeLeft:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", mIsAllowEdgeRight="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/xuexiang/xui/widget/slideback/SlideInfo;->mIsAllowEdgeRight:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", mScreenWidth="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/xuexiang/xui/widget/slideback/SlideInfo;->mScreenWidth:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
