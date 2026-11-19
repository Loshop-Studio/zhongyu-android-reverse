.class public abstract Lp2/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

.field public final b:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

.field public final c:Landroid/support/v4/media/h;


# direct methods
.method public constructor <init>(Lcom/xuexiang/xui/widget/imageview/crop/Edge;Lcom/xuexiang/xui/widget/imageview/crop/Edge;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lp2/c;->a:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 5
    .line 6
    iput-object p2, p0, Lp2/c;->b:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 7
    .line 8
    new-instance v0, Landroid/support/v4/media/h;

    .line 9
    .line 10
    const/16 v1, 0x15

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-direct {v0, v1, v2}, Landroid/support/v4/media/h;-><init>(IZ)V

    .line 14
    .line 15
    .line 16
    iput-object p1, v0, Landroid/support/v4/media/h;->b:Ljava/lang/Object;

    .line 17
    .line 18
    iput-object p2, v0, Landroid/support/v4/media/h;->c:Ljava/lang/Object;

    .line 19
    .line 20
    iput-object v0, p0, Lp2/c;->c:Landroid/support/v4/media/h;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public abstract a(FFFLandroid/graphics/Rect;F)V
.end method

.method public b(FFLandroid/graphics/Rect;F)V
    .locals 9

    .line 1
    iget-object v0, p0, Lp2/c;->c:Landroid/support/v4/media/h;

    .line 2
    .line 3
    iget-object v1, v0, Landroid/support/v4/media/h;->b:Ljava/lang/Object;

    .line 4
    .line 5
    move-object v2, v1

    .line 6
    check-cast v2, Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 7
    .line 8
    iget-object v0, v0, Landroid/support/v4/media/h;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 11
    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    const/high16 v7, 0x3f800000    # 1.0f

    .line 15
    .line 16
    move v3, p1

    .line 17
    move v4, p2

    .line 18
    move-object v5, p3

    .line 19
    move v6, p4

    .line 20
    invoke-virtual/range {v2 .. v7}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->adjustCoordinate(FFLandroid/graphics/Rect;FF)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move v3, p1

    .line 25
    move v4, p2

    .line 26
    move-object v5, p3

    .line 27
    move v6, p4

    .line 28
    :goto_0
    if-eqz v0, :cond_1

    .line 29
    .line 30
    const/high16 v8, 0x3f800000    # 1.0f

    .line 31
    .line 32
    move v7, v6

    .line 33
    move-object v6, v5

    .line 34
    move v5, v4

    .line 35
    move v4, v3

    .line 36
    move-object v3, v0

    .line 37
    invoke-virtual/range {v3 .. v8}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->adjustCoordinate(FFLandroid/graphics/Rect;FF)V

    .line 38
    .line 39
    .line 40
    :cond_1
    return-void
.end method
