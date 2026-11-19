.class Lcom/xuexiang/xui/widget/imageview/crop/VerticalHandleHelper;
.super Lcom/xuexiang/xui/widget/imageview/crop/HandleHelper;
.source "SourceFile"


# instance fields
.field private mEdge:Lcom/xuexiang/xui/widget/imageview/crop/Edge;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/imageview/crop/Edge;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0, p1}, Lcom/xuexiang/xui/widget/imageview/crop/HandleHelper;-><init>(Lcom/xuexiang/xui/widget/imageview/crop/Edge;Lcom/xuexiang/xui/widget/imageview/crop/Edge;)V

    .line 2
    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/VerticalHandleHelper;->mEdge:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    return-void
.end method


# virtual methods
.method updateCropWindow(FFFLandroid/graphics/Rect;F)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/VerticalHandleHelper;->mEdge:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    move v1, p1

    move v2, p2

    move-object v3, p4

    move v4, p5

    move v5, p3

    invoke-virtual/range {v0 .. v5}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->adjustCoordinate(FFLandroid/graphics/Rect;FF)V

    .line 2
    sget-object p1, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->LEFT:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result p1

    .line 3
    sget-object p2, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->TOP:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    invoke-virtual {p2}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result v0

    .line 4
    sget-object v1, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->RIGHT:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result v1

    .line 5
    sget-object v2, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->BOTTOM:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    invoke-virtual {v2}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result v3

    .line 6
    invoke-static {p1, v1, p3}, Lcom/xuexiang/xui/widget/imageview/crop/AspectRatioUtil;->calculateHeight(FFF)F

    move-result p1

    sub-float v1, v3, v0

    sub-float/2addr p1, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr p1, v1

    sub-float/2addr v0, p1

    add-float/2addr v3, p1

    .line 7
    invoke-virtual {p2, v0}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->setCoordinate(F)V

    .line 8
    invoke-virtual {v2, v3}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->setCoordinate(F)V

    .line 9
    invoke-virtual {p2, p4, p5}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->isOutsideMargin(Landroid/graphics/Rect;F)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/VerticalHandleHelper;->mEdge:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    invoke-virtual {p1, p2, p4, p3}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->isNewRectangleOutOfBounds(Lcom/xuexiang/xui/widget/imageview/crop/Edge;Landroid/graphics/Rect;F)Z

    move-result p1

    if-nez p1, :cond_0

    .line 10
    invoke-virtual {p2, p4}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->snapToRect(Landroid/graphics/Rect;)F

    move-result p1

    neg-float p1, p1

    .line 11
    invoke-virtual {v2, p1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->offset(F)V

    .line 12
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/VerticalHandleHelper;->mEdge:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    invoke-virtual {p1, p3}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->adjustCoordinate(F)V

    .line 13
    :cond_0
    invoke-virtual {v2, p4, p5}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->isOutsideMargin(Landroid/graphics/Rect;F)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/VerticalHandleHelper;->mEdge:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    invoke-virtual {p1, v2, p4, p3}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->isNewRectangleOutOfBounds(Lcom/xuexiang/xui/widget/imageview/crop/Edge;Landroid/graphics/Rect;F)Z

    move-result p1

    if-nez p1, :cond_1

    .line 14
    invoke-virtual {v2, p4}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->snapToRect(Landroid/graphics/Rect;)F

    move-result p1

    neg-float p1, p1

    .line 15
    invoke-virtual {p2, p1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->offset(F)V

    .line 16
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/VerticalHandleHelper;->mEdge:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    invoke-virtual {p1, p3}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->adjustCoordinate(F)V

    :cond_1
    return-void
.end method
