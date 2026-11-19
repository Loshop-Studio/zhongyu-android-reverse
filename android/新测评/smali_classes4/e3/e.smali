.class public abstract Le3/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

.field public b:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

.field public c:Le3/d;


# direct methods
.method public constructor <init>(Lcom/xuexiang/xui/widget/imageview/crop/Edge;Lcom/xuexiang/xui/widget/imageview/crop/Edge;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Le3/e;->a:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 5
    .line 6
    iput-object p2, p0, Le3/e;->b:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 7
    .line 8
    new-instance v0, Le3/d;

    .line 9
    .line 10
    invoke-direct {v0, p1, p2}, Le3/d;-><init>(Lcom/xuexiang/xui/widget/imageview/crop/Edge;Lcom/xuexiang/xui/widget/imageview/crop/Edge;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Le3/e;->c:Le3/d;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public a()Le3/d;
    .locals 1

    .line 1
    iget-object v0, p0, Le3/e;->c:Le3/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public b(FFF)Le3/d;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Le3/e;->c(FF)F

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    cmpl-float p1, p1, p3

    .line 6
    .line 7
    if-lez p1, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, Le3/e;->c:Le3/d;

    .line 10
    .line 11
    iget-object p2, p0, Le3/e;->b:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 12
    .line 13
    iput-object p2, p1, Le3/d;->a:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 14
    .line 15
    iget-object p2, p0, Le3/e;->a:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 16
    .line 17
    iput-object p2, p1, Le3/d;->b:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    iget-object p1, p0, Le3/e;->c:Le3/d;

    .line 21
    .line 22
    iget-object p2, p0, Le3/e;->a:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 23
    .line 24
    iput-object p2, p1, Le3/d;->a:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 25
    .line 26
    iget-object p2, p0, Le3/e;->b:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 27
    .line 28
    iput-object p2, p1, Le3/d;->b:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 29
    .line 30
    :goto_0
    iget-object p1, p0, Le3/e;->c:Le3/d;

    .line 31
    .line 32
    return-object p1
.end method

.method public final c(FF)F
    .locals 4

    .line 1
    iget-object v0, p0, Le3/e;->b:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 2
    .line 3
    sget-object v1, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->b:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    move v0, p1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->q()F

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    :goto_0
    iget-object v1, p0, Le3/e;->a:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 14
    .line 15
    sget-object v2, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->c:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 16
    .line 17
    if-ne v1, v2, :cond_1

    .line 18
    .line 19
    move v1, p2

    .line 20
    goto :goto_1

    .line 21
    :cond_1
    invoke-virtual {v2}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->q()F

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    :goto_1
    iget-object v2, p0, Le3/e;->b:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 26
    .line 27
    sget-object v3, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->d:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 28
    .line 29
    if-ne v2, v3, :cond_2

    .line 30
    .line 31
    goto :goto_2

    .line 32
    :cond_2
    invoke-virtual {v3}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->q()F

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    :goto_2
    iget-object v2, p0, Le3/e;->a:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 37
    .line 38
    sget-object v3, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->e:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 39
    .line 40
    if-ne v2, v3, :cond_3

    .line 41
    .line 42
    goto :goto_3

    .line 43
    :cond_3
    invoke-virtual {v3}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->q()F

    .line 44
    .line 45
    .line 46
    move-result p2

    .line 47
    :goto_3
    invoke-static {v0, v1, p1, p2}, Le3/a;->a(FFFF)F

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    return p1
.end method

.method public abstract d(FFFLandroid/graphics/Rect;F)V
.end method

.method public e(FFLandroid/graphics/Rect;F)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Le3/e;->a()Le3/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, v0, Le3/d;->a:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 6
    .line 7
    iget-object v0, v0, Le3/d;->b:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    const/high16 v6, 0x3f800000    # 1.0f

    .line 12
    .line 13
    move v2, p1

    .line 14
    move v3, p2

    .line 15
    move-object v4, p3

    .line 16
    move v5, p4

    .line 17
    invoke-virtual/range {v1 .. v6}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->j(FFLandroid/graphics/Rect;FF)V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move v2, p1

    .line 22
    move v3, p2

    .line 23
    move-object v4, p3

    .line 24
    move v5, p4

    .line 25
    :goto_0
    if-eqz v0, :cond_1

    .line 26
    .line 27
    const/high16 v7, 0x3f800000    # 1.0f

    .line 28
    .line 29
    move v6, v5

    .line 30
    move-object v5, v4

    .line 31
    move v4, v3

    .line 32
    move v3, v2

    .line 33
    move-object v2, v0

    .line 34
    invoke-virtual/range {v2 .. v7}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->j(FFLandroid/graphics/Rect;FF)V

    .line 35
    .line 36
    .line 37
    :cond_1
    return-void
.end method
