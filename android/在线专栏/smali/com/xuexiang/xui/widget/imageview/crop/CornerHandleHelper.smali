.class Lcom/xuexiang/xui/widget/imageview/crop/CornerHandleHelper;
.super Lcom/xuexiang/xui/widget/imageview/crop/HandleHelper;
.source "SourceFile"


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/imageview/crop/Edge;Lcom/xuexiang/xui/widget/imageview/crop/Edge;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/xuexiang/xui/widget/imageview/crop/HandleHelper;-><init>(Lcom/xuexiang/xui/widget/imageview/crop/Edge;Lcom/xuexiang/xui/widget/imageview/crop/Edge;)V

    return-void
.end method


# virtual methods
.method updateCropWindow(FFFLandroid/graphics/Rect;F)V
    .locals 8

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/imageview/crop/HandleHelper;->getActiveEdges(FFF)Lcom/xuexiang/xui/widget/imageview/crop/EdgePair;

    move-result-object v0

    .line 2
    iget-object v7, v0, Lcom/xuexiang/xui/widget/imageview/crop/EdgePair;->primary:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 3
    iget-object v0, v0, Lcom/xuexiang/xui/widget/imageview/crop/EdgePair;->secondary:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    move-object v1, v7

    move v2, p1

    move v3, p2

    move-object v4, p4

    move v5, p5

    move v6, p3

    .line 4
    invoke-virtual/range {v1 .. v6}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->adjustCoordinate(FFLandroid/graphics/Rect;FF)V

    .line 5
    invoke-virtual {v0, p3}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->adjustCoordinate(F)V

    .line 6
    invoke-virtual {v0, p4, p5}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->isOutsideMargin(Landroid/graphics/Rect;F)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 7
    invoke-virtual {v0, p4}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->snapToRect(Landroid/graphics/Rect;)F

    .line 8
    invoke-virtual {v7, p3}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->adjustCoordinate(F)V

    :cond_0
    return-void
.end method
