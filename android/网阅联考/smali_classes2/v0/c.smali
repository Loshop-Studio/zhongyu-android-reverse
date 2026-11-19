.class public Lv0/c;
.super Lv0/e;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lcom/xuexiang/xui/widget/imageview/crop/Edge;Lcom/xuexiang/xui/widget/imageview/crop/Edge;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lv0/e;-><init>(Lcom/xuexiang/xui/widget/imageview/crop/Edge;Lcom/xuexiang/xui/widget/imageview/crop/Edge;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public d(FFFLandroid/graphics/Rect;F)V
    .locals 8

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lv0/e;->b(FFF)Lv0/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v7, v0, Lv0/d;->a:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 6
    .line 7
    iget-object v0, v0, Lv0/d;->b:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 8
    .line 9
    move-object v1, v7

    .line 10
    move v2, p1

    .line 11
    move v3, p2

    .line 12
    move-object v4, p4

    .line 13
    move v5, p5

    .line 14
    move v6, p3

    .line 15
    invoke-virtual/range {v1 .. v6}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->c(FFLandroid/graphics/Rect;FF)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p3}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->b(F)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p4, p5}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->l(Landroid/graphics/Rect;F)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    invoke-virtual {v0, p4}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->p(Landroid/graphics/Rect;)F

    .line 28
    .line 29
    .line 30
    invoke-virtual {v7, p3}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->b(F)V

    .line 31
    .line 32
    .line 33
    :cond_0
    return-void
.end method
