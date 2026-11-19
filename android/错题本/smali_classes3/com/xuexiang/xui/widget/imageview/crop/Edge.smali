.class public final enum Lcom/xuexiang/xui/widget/imageview/crop/Edge;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/xuexiang/xui/widget/imageview/crop/Edge;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum BOTTOM:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

.field public static final enum LEFT:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

.field public static final MIN_CROP_LENGTH_PX:I = 0x28

.field public static final enum RIGHT:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

.field public static final enum TOP:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

.field public static final synthetic a:[Lcom/xuexiang/xui/widget/imageview/crop/Edge;


# instance fields
.field private mCoordinate:F


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 2
    .line 3
    const-string v1, "LEFT"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->LEFT:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 10
    .line 11
    new-instance v1, Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 12
    .line 13
    const-string v2, "TOP"

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->TOP:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 20
    .line 21
    new-instance v2, Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 22
    .line 23
    const-string v3, "RIGHT"

    .line 24
    .line 25
    const/4 v4, 0x2

    .line 26
    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v2, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->RIGHT:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 30
    .line 31
    new-instance v3, Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 32
    .line 33
    const-string v4, "BOTTOM"

    .line 34
    .line 35
    const/4 v5, 0x3

    .line 36
    invoke-direct {v3, v4, v5}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    sput-object v3, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->BOTTOM:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 40
    .line 41
    filled-new-array {v0, v1, v2, v3}, [Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    sput-object v0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->a:[Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 46
    .line 47
    return-void
.end method

.method public static a(FFFLandroid/graphics/Rect;F)Z
    .locals 1

    .line 1
    iget v0, p3, Landroid/graphics/Rect;->top:I

    .line 2
    .line 3
    int-to-float v0, v0

    .line 4
    cmpg-float p0, p0, v0

    .line 5
    .line 6
    if-ltz p0, :cond_1

    .line 7
    .line 8
    iget p0, p3, Landroid/graphics/Rect;->left:I

    .line 9
    .line 10
    int-to-float p0, p0

    .line 11
    cmpg-float p0, p1, p0

    .line 12
    .line 13
    if-ltz p0, :cond_1

    .line 14
    .line 15
    iget p0, p3, Landroid/graphics/Rect;->bottom:I

    .line 16
    .line 17
    int-to-float p0, p0

    .line 18
    cmpl-float p0, p2, p0

    .line 19
    .line 20
    if-gtz p0, :cond_1

    .line 21
    .line 22
    iget p0, p3, Landroid/graphics/Rect;->right:I

    .line 23
    .line 24
    int-to-float p0, p0

    .line 25
    cmpl-float p0, p4, p0

    .line 26
    .line 27
    if-lez p0, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 p0, 0x0

    .line 31
    return p0

    .line 32
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 33
    return p0
.end method

.method public static getHeight()F
    .locals 2

    .line 1
    sget-object v0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->BOTTOM:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    sget-object v1, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->TOP:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 8
    .line 9
    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    sub-float/2addr v0, v1

    .line 14
    return v0
.end method

.method public static getWidth()F
    .locals 2

    .line 1
    sget-object v0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->RIGHT:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    sget-object v1, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->LEFT:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 8
    .line 9
    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    sub-float/2addr v0, v1

    .line 14
    return v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/xuexiang/xui/widget/imageview/crop/Edge;
    .locals 1

    .line 1
    const-class v0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lcom/xuexiang/xui/widget/imageview/crop/Edge;
    .locals 1

    .line 1
    sget-object v0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->a:[Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lcom/xuexiang/xui/widget/imageview/crop/Edge;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public adjustCoordinate(F)V
    .locals 6

    .line 30
    sget-object v0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->LEFT:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result v0

    .line 31
    sget-object v1, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->TOP:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result v1

    .line 32
    sget-object v2, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->RIGHT:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    invoke-virtual {v2}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result v2

    .line 33
    sget-object v3, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->BOTTOM:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    invoke-virtual {v3}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result v3

    .line 34
    sget-object v4, Lp2/b;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aget v4, v4, v5

    const/4 v5, 0x1

    if-eq v4, v5, :cond_3

    const/4 v5, 0x2

    if-eq v4, v5, :cond_2

    const/4 v5, 0x3

    if-eq v4, v5, :cond_1

    const/4 v3, 0x4

    if-eq v4, v3, :cond_0

    return-void

    .line 35
    :cond_0
    invoke-static {v2, v0, p1, v1}, Landroidx/collection/a;->a(FFFF)F

    move-result p1

    .line 36
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->mCoordinate:F

    return-void

    .line 37
    :cond_1
    invoke-static {v3, v1, p1, v0}, Landroid/support/v4/media/f;->b(FFFF)F

    move-result p1

    .line 38
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->mCoordinate:F

    return-void

    :cond_2
    sub-float/2addr v2, v0

    div-float/2addr v2, p1

    sub-float/2addr v3, v2

    .line 39
    iput v3, p0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->mCoordinate:F

    return-void

    :cond_3
    sub-float/2addr v3, v1

    mul-float/2addr v3, p1

    sub-float/2addr v2, v3

    .line 40
    iput v2, p0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->mCoordinate:F

    return-void
.end method

.method public adjustCoordinate(FFLandroid/graphics/Rect;FF)V
    .locals 4

    .line 1
    sget-object v0, Lp2/b;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    const/high16 v2, 0x7f800000    # Float.POSITIVE_INFINITY

    const/high16 v3, 0x42200000    # 40.0f

    if-eq v0, v1, :cond_c

    const/4 v1, 0x2

    if-eq v0, v1, :cond_8

    const/4 v1, 0x3

    const/high16 v2, -0x800000    # Float.NEGATIVE_INFINITY

    if-eq v0, v1, :cond_4

    const/4 p1, 0x4

    if-eq v0, p1, :cond_0

    return-void

    .line 2
    :cond_0
    iget p1, p3, Landroid/graphics/Rect;->bottom:I

    int-to-float p1, p1

    sub-float p3, p1, p2

    cmpg-float p3, p3, p4

    if-gez p3, :cond_1

    goto :goto_1

    .line 3
    :cond_1
    sget-object p1, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->TOP:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result p3

    add-float/2addr p3, v3

    cmpg-float p3, p2, p3

    if-gtz p3, :cond_2

    .line 4
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result p3

    add-float/2addr p3, v3

    goto :goto_0

    :cond_2
    move p3, v2

    .line 5
    :goto_0
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result p4

    sub-float p4, p2, p4

    mul-float/2addr p4, p5

    cmpg-float p4, p4, v3

    if-gtz p4, :cond_3

    .line 6
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result p1

    div-float/2addr v3, p5

    add-float v2, v3, p1

    .line 7
    :cond_3
    invoke-static {v2, p3}, Ljava/lang/Math;->max(FF)F

    move-result p1

    invoke-static {p2, p1}, Ljava/lang/Math;->max(FF)F

    move-result p1

    .line 8
    :goto_1
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->mCoordinate:F

    return-void

    .line 9
    :cond_4
    iget p2, p3, Landroid/graphics/Rect;->right:I

    int-to-float p2, p2

    sub-float p3, p2, p1

    cmpg-float p3, p3, p4

    if-gez p3, :cond_5

    goto :goto_3

    .line 10
    :cond_5
    sget-object p2, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->LEFT:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    invoke-virtual {p2}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result p3

    add-float/2addr p3, v3

    cmpg-float p3, p1, p3

    if-gtz p3, :cond_6

    .line 11
    invoke-virtual {p2}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result p3

    add-float/2addr p3, v3

    goto :goto_2

    :cond_6
    move p3, v2

    .line 12
    :goto_2
    invoke-virtual {p2}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result p4

    sub-float p4, p1, p4

    div-float/2addr p4, p5

    cmpg-float p4, p4, v3

    if-gtz p4, :cond_7

    .line 13
    invoke-virtual {p2}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result p2

    mul-float/2addr p5, v3

    add-float v2, p5, p2

    .line 14
    :cond_7
    invoke-static {p3, v2}, Ljava/lang/Math;->max(FF)F

    move-result p2

    invoke-static {p1, p2}, Ljava/lang/Math;->max(FF)F

    move-result p2

    .line 15
    :goto_3
    iput p2, p0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->mCoordinate:F

    return-void

    .line 16
    :cond_8
    iget p1, p3, Landroid/graphics/Rect;->top:I

    int-to-float p1, p1

    sub-float p3, p2, p1

    cmpg-float p3, p3, p4

    if-gez p3, :cond_9

    goto :goto_5

    .line 17
    :cond_9
    sget-object p1, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->BOTTOM:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result p3

    sub-float/2addr p3, v3

    cmpl-float p3, p2, p3

    if-ltz p3, :cond_a

    .line 18
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result p3

    sub-float/2addr p3, v3

    goto :goto_4

    :cond_a
    move p3, v2

    .line 19
    :goto_4
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result p4

    sub-float/2addr p4, p2

    mul-float/2addr p4, p5

    cmpg-float p4, p4, v3

    if-gtz p4, :cond_b

    .line 20
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result p1

    div-float/2addr v3, p5

    sub-float v2, p1, v3

    .line 21
    :cond_b
    invoke-static {p3, v2}, Ljava/lang/Math;->min(FF)F

    move-result p1

    invoke-static {p2, p1}, Ljava/lang/Math;->min(FF)F

    move-result p1

    .line 22
    :goto_5
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->mCoordinate:F

    return-void

    .line 23
    :cond_c
    iget p2, p3, Landroid/graphics/Rect;->left:I

    int-to-float p2, p2

    sub-float p3, p1, p2

    cmpg-float p3, p3, p4

    if-gez p3, :cond_d

    goto :goto_7

    .line 24
    :cond_d
    sget-object p2, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->RIGHT:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    invoke-virtual {p2}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result p3

    sub-float/2addr p3, v3

    cmpl-float p3, p1, p3

    if-ltz p3, :cond_e

    .line 25
    invoke-virtual {p2}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result p3

    sub-float/2addr p3, v3

    goto :goto_6

    :cond_e
    move p3, v2

    .line 26
    :goto_6
    invoke-virtual {p2}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result p4

    sub-float/2addr p4, p1

    div-float/2addr p4, p5

    cmpg-float p4, p4, v3

    if-gtz p4, :cond_f

    .line 27
    invoke-virtual {p2}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result p2

    mul-float/2addr p5, v3

    sub-float v2, p2, p5

    .line 28
    :cond_f
    invoke-static {p3, v2}, Ljava/lang/Math;->min(FF)F

    move-result p2

    invoke-static {p1, p2}, Ljava/lang/Math;->min(FF)F

    move-result p2

    .line 29
    :goto_7
    iput p2, p0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->mCoordinate:F

    return-void
.end method

.method public getCoordinate()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->mCoordinate:F

    .line 2
    .line 3
    return v0
.end method

.method public isNewRectangleOutOfBounds(Lcom/xuexiang/xui/widget/imageview/crop/Edge;Landroid/graphics/Rect;F)Z
    .locals 4

    .line 1
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->snapOffset(Landroid/graphics/Rect;)F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    sget-object v1, Lp2/b;->a:[I

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    aget v1, v1, v2

    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    if-eq v1, v2, :cond_6

    .line 15
    .line 16
    const/4 v3, 0x2

    .line 17
    if-eq v1, v3, :cond_4

    .line 18
    .line 19
    const/4 v3, 0x3

    .line 20
    if-eq v1, v3, :cond_2

    .line 21
    .line 22
    const/4 v3, 0x4

    .line 23
    if-eq v1, v3, :cond_0

    .line 24
    .line 25
    goto/16 :goto_0

    .line 26
    .line 27
    :cond_0
    sget-object v1, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->LEFT:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 28
    .line 29
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-eqz v3, :cond_1

    .line 34
    .line 35
    iget p1, p2, Landroid/graphics/Rect;->left:I

    .line 36
    .line 37
    int-to-float p1, p1

    .line 38
    sget-object v1, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->RIGHT:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 39
    .line 40
    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    sub-float/2addr v1, v0

    .line 45
    sget-object v0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->TOP:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 46
    .line 47
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    invoke-static {v1, p1, p3, v0}, Landroidx/collection/a;->a(FFFF)F

    .line 52
    .line 53
    .line 54
    move-result p3

    .line 55
    invoke-static {v0, p1, p3, p2, v1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->a(FFFLandroid/graphics/Rect;F)Z

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    return p1

    .line 60
    :cond_1
    sget-object v3, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->RIGHT:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 61
    .line 62
    invoke-virtual {p1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    if-eqz p1, :cond_8

    .line 67
    .line 68
    iget p1, p2, Landroid/graphics/Rect;->right:I

    .line 69
    .line 70
    int-to-float p1, p1

    .line 71
    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    sub-float/2addr v1, v0

    .line 76
    sget-object v0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->TOP:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 77
    .line 78
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    invoke-static {p1, v1, p3, v0}, Landroidx/collection/a;->a(FFFF)F

    .line 83
    .line 84
    .line 85
    move-result p3

    .line 86
    invoke-static {v0, v1, p3, p2, p1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->a(FFFLandroid/graphics/Rect;F)Z

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    return p1

    .line 91
    :cond_2
    sget-object v1, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->TOP:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 92
    .line 93
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v3

    .line 97
    if-eqz v3, :cond_3

    .line 98
    .line 99
    iget p1, p2, Landroid/graphics/Rect;->top:I

    .line 100
    .line 101
    int-to-float p1, p1

    .line 102
    sget-object v1, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->BOTTOM:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 103
    .line 104
    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    sub-float/2addr v1, v0

    .line 109
    sget-object v0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->LEFT:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 110
    .line 111
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    invoke-static {v1, p1, p3, v0}, Landroid/support/v4/media/f;->b(FFFF)F

    .line 116
    .line 117
    .line 118
    move-result p3

    .line 119
    invoke-static {p1, v0, v1, p2, p3}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->a(FFFLandroid/graphics/Rect;F)Z

    .line 120
    .line 121
    .line 122
    move-result p1

    .line 123
    return p1

    .line 124
    :cond_3
    sget-object v3, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->BOTTOM:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 125
    .line 126
    invoke-virtual {p1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result p1

    .line 130
    if-eqz p1, :cond_8

    .line 131
    .line 132
    iget p1, p2, Landroid/graphics/Rect;->bottom:I

    .line 133
    .line 134
    int-to-float p1, p1

    .line 135
    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    .line 136
    .line 137
    .line 138
    move-result v1

    .line 139
    sub-float/2addr v1, v0

    .line 140
    sget-object v0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->LEFT:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 141
    .line 142
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    invoke-static {p1, v1, p3, v0}, Landroid/support/v4/media/f;->b(FFFF)F

    .line 147
    .line 148
    .line 149
    move-result p3

    .line 150
    invoke-static {v1, v0, p1, p2, p3}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->a(FFFLandroid/graphics/Rect;F)Z

    .line 151
    .line 152
    .line 153
    move-result p1

    .line 154
    return p1

    .line 155
    :cond_4
    sget-object v1, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->LEFT:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 156
    .line 157
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-result v3

    .line 161
    if-eqz v3, :cond_5

    .line 162
    .line 163
    iget p1, p2, Landroid/graphics/Rect;->left:I

    .line 164
    .line 165
    int-to-float p1, p1

    .line 166
    sget-object v1, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->RIGHT:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 167
    .line 168
    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    .line 169
    .line 170
    .line 171
    move-result v1

    .line 172
    sub-float/2addr v1, v0

    .line 173
    sget-object v0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->BOTTOM:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 174
    .line 175
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    .line 176
    .line 177
    .line 178
    move-result v0

    .line 179
    sub-float v2, v1, p1

    .line 180
    .line 181
    div-float/2addr v2, p3

    .line 182
    sub-float p3, v0, v2

    .line 183
    .line 184
    invoke-static {p3, p1, v0, p2, v1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->a(FFFLandroid/graphics/Rect;F)Z

    .line 185
    .line 186
    .line 187
    move-result p1

    .line 188
    return p1

    .line 189
    :cond_5
    sget-object v3, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->RIGHT:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 190
    .line 191
    invoke-virtual {p1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    move-result p1

    .line 195
    if-eqz p1, :cond_8

    .line 196
    .line 197
    iget p1, p2, Landroid/graphics/Rect;->right:I

    .line 198
    .line 199
    int-to-float p1, p1

    .line 200
    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    .line 201
    .line 202
    .line 203
    move-result v1

    .line 204
    sub-float/2addr v1, v0

    .line 205
    sget-object v0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->BOTTOM:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 206
    .line 207
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    .line 208
    .line 209
    .line 210
    move-result v0

    .line 211
    sub-float v2, p1, v1

    .line 212
    .line 213
    div-float/2addr v2, p3

    .line 214
    sub-float p3, v0, v2

    .line 215
    .line 216
    invoke-static {p3, v1, v0, p2, p1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->a(FFFLandroid/graphics/Rect;F)Z

    .line 217
    .line 218
    .line 219
    move-result p1

    .line 220
    return p1

    .line 221
    :cond_6
    sget-object v1, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->TOP:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 222
    .line 223
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 224
    .line 225
    .line 226
    move-result v3

    .line 227
    if-eqz v3, :cond_7

    .line 228
    .line 229
    iget p1, p2, Landroid/graphics/Rect;->top:I

    .line 230
    .line 231
    int-to-float p1, p1

    .line 232
    sget-object v1, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->BOTTOM:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 233
    .line 234
    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    .line 235
    .line 236
    .line 237
    move-result v1

    .line 238
    sub-float/2addr v1, v0

    .line 239
    sget-object v0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->RIGHT:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 240
    .line 241
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    .line 242
    .line 243
    .line 244
    move-result v0

    .line 245
    sub-float v2, v1, p1

    .line 246
    .line 247
    mul-float/2addr v2, p3

    .line 248
    sub-float p3, v0, v2

    .line 249
    .line 250
    invoke-static {p1, p3, v1, p2, v0}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->a(FFFLandroid/graphics/Rect;F)Z

    .line 251
    .line 252
    .line 253
    move-result p1

    .line 254
    return p1

    .line 255
    :cond_7
    sget-object v3, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->BOTTOM:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 256
    .line 257
    invoke-virtual {p1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 258
    .line 259
    .line 260
    move-result p1

    .line 261
    if-eqz p1, :cond_8

    .line 262
    .line 263
    iget p1, p2, Landroid/graphics/Rect;->bottom:I

    .line 264
    .line 265
    int-to-float p1, p1

    .line 266
    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    .line 267
    .line 268
    .line 269
    move-result v1

    .line 270
    sub-float/2addr v1, v0

    .line 271
    sget-object v0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->RIGHT:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 272
    .line 273
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    .line 274
    .line 275
    .line 276
    move-result v0

    .line 277
    sub-float v2, p1, v1

    .line 278
    .line 279
    mul-float/2addr v2, p3

    .line 280
    sub-float p3, v0, v2

    .line 281
    .line 282
    invoke-static {v1, p3, p1, p2, v0}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->a(FFFLandroid/graphics/Rect;F)Z

    .line 283
    .line 284
    .line 285
    move-result p1

    .line 286
    return p1

    .line 287
    :cond_8
    :goto_0
    return v2
.end method

.method public isOutsideFrame(Landroid/graphics/Rect;)Z
    .locals 7

    .line 1
    sget-object v0, Lp2/b;->a:[I

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    aget v0, v0, v1

    .line 8
    .line 9
    const-wide/16 v1, 0x0

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    const/4 v4, 0x1

    .line 13
    if-eq v0, v4, :cond_6

    .line 14
    .line 15
    const/4 v5, 0x2

    .line 16
    if-eq v0, v5, :cond_4

    .line 17
    .line 18
    const/4 v5, 0x3

    .line 19
    if-eq v0, v5, :cond_2

    .line 20
    .line 21
    const/4 v5, 0x4

    .line 22
    if-eq v0, v5, :cond_0

    .line 23
    .line 24
    return v3

    .line 25
    :cond_0
    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    .line 26
    .line 27
    int-to-float p1, p1

    .line 28
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->mCoordinate:F

    .line 29
    .line 30
    sub-float/2addr p1, v0

    .line 31
    float-to-double v5, p1

    .line 32
    cmpg-double p1, v5, v1

    .line 33
    .line 34
    if-gez p1, :cond_1

    .line 35
    .line 36
    return v4

    .line 37
    :cond_1
    return v3

    .line 38
    :cond_2
    iget p1, p1, Landroid/graphics/Rect;->right:I

    .line 39
    .line 40
    int-to-float p1, p1

    .line 41
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->mCoordinate:F

    .line 42
    .line 43
    sub-float/2addr p1, v0

    .line 44
    float-to-double v5, p1

    .line 45
    cmpg-double p1, v5, v1

    .line 46
    .line 47
    if-gez p1, :cond_3

    .line 48
    .line 49
    return v4

    .line 50
    :cond_3
    return v3

    .line 51
    :cond_4
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->mCoordinate:F

    .line 52
    .line 53
    iget p1, p1, Landroid/graphics/Rect;->top:I

    .line 54
    .line 55
    int-to-float p1, p1

    .line 56
    sub-float/2addr v0, p1

    .line 57
    float-to-double v5, v0

    .line 58
    cmpg-double p1, v5, v1

    .line 59
    .line 60
    if-gez p1, :cond_5

    .line 61
    .line 62
    return v4

    .line 63
    :cond_5
    return v3

    .line 64
    :cond_6
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->mCoordinate:F

    .line 65
    .line 66
    iget p1, p1, Landroid/graphics/Rect;->left:I

    .line 67
    .line 68
    int-to-float p1, p1

    .line 69
    sub-float/2addr v0, p1

    .line 70
    float-to-double v5, v0

    .line 71
    cmpg-double p1, v5, v1

    .line 72
    .line 73
    if-gez p1, :cond_7

    .line 74
    .line 75
    return v4

    .line 76
    :cond_7
    return v3
.end method

.method public isOutsideMargin(Landroid/graphics/Rect;F)Z
    .locals 4

    .line 1
    sget-object v0, Lp2/b;->a:[I

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    aget v0, v0, v1

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    const/4 v2, 0x1

    .line 11
    if-eq v0, v2, :cond_6

    .line 12
    .line 13
    const/4 v3, 0x2

    .line 14
    if-eq v0, v3, :cond_4

    .line 15
    .line 16
    const/4 v3, 0x3

    .line 17
    if-eq v0, v3, :cond_2

    .line 18
    .line 19
    const/4 v3, 0x4

    .line 20
    if-eq v0, v3, :cond_0

    .line 21
    .line 22
    return v1

    .line 23
    :cond_0
    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    .line 24
    .line 25
    int-to-float p1, p1

    .line 26
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->mCoordinate:F

    .line 27
    .line 28
    sub-float/2addr p1, v0

    .line 29
    cmpg-float p1, p1, p2

    .line 30
    .line 31
    if-gez p1, :cond_1

    .line 32
    .line 33
    return v2

    .line 34
    :cond_1
    return v1

    .line 35
    :cond_2
    iget p1, p1, Landroid/graphics/Rect;->right:I

    .line 36
    .line 37
    int-to-float p1, p1

    .line 38
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->mCoordinate:F

    .line 39
    .line 40
    sub-float/2addr p1, v0

    .line 41
    cmpg-float p1, p1, p2

    .line 42
    .line 43
    if-gez p1, :cond_3

    .line 44
    .line 45
    return v2

    .line 46
    :cond_3
    return v1

    .line 47
    :cond_4
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->mCoordinate:F

    .line 48
    .line 49
    iget p1, p1, Landroid/graphics/Rect;->top:I

    .line 50
    .line 51
    int-to-float p1, p1

    .line 52
    sub-float/2addr v0, p1

    .line 53
    cmpg-float p1, v0, p2

    .line 54
    .line 55
    if-gez p1, :cond_5

    .line 56
    .line 57
    return v2

    .line 58
    :cond_5
    return v1

    .line 59
    :cond_6
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->mCoordinate:F

    .line 60
    .line 61
    iget p1, p1, Landroid/graphics/Rect;->left:I

    .line 62
    .line 63
    int-to-float p1, p1

    .line 64
    sub-float/2addr v0, p1

    .line 65
    cmpg-float p1, v0, p2

    .line 66
    .line 67
    if-gez p1, :cond_7

    .line 68
    .line 69
    return v2

    .line 70
    :cond_7
    return v1
.end method

.method public offset(F)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->mCoordinate:F

    .line 2
    .line 3
    add-float/2addr v0, p1

    .line 4
    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->mCoordinate:F

    .line 5
    .line 6
    return-void
.end method

.method public setCoordinate(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->mCoordinate:F

    .line 2
    .line 3
    return-void
.end method

.method public snapOffset(Landroid/graphics/Rect;)F
    .locals 3

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->mCoordinate:F

    .line 2
    .line 3
    sget-object v1, Lp2/b;->a:[I

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    aget v1, v1, v2

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    if-eq v1, v2, :cond_3

    .line 13
    .line 14
    const/4 v2, 0x2

    .line 15
    if-eq v1, v2, :cond_2

    .line 16
    .line 17
    const/4 v2, 0x3

    .line 18
    if-eq v1, v2, :cond_1

    .line 19
    .line 20
    const/4 v2, 0x4

    .line 21
    if-eq v1, v2, :cond_0

    .line 22
    .line 23
    move p1, v0

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    .line 26
    .line 27
    :goto_0
    int-to-float p1, p1

    .line 28
    goto :goto_1

    .line 29
    :cond_1
    iget p1, p1, Landroid/graphics/Rect;->right:I

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_2
    iget p1, p1, Landroid/graphics/Rect;->top:I

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_3
    iget p1, p1, Landroid/graphics/Rect;->left:I

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :goto_1
    sub-float/2addr p1, v0

    .line 39
    return p1
.end method

.method public snapToRect(Landroid/graphics/Rect;)F
    .locals 3

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->mCoordinate:F

    .line 2
    .line 3
    sget-object v1, Lp2/b;->a:[I

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    aget v1, v1, v2

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    if-eq v1, v2, :cond_3

    .line 13
    .line 14
    const/4 v2, 0x2

    .line 15
    if-eq v1, v2, :cond_2

    .line 16
    .line 17
    const/4 v2, 0x3

    .line 18
    if-eq v1, v2, :cond_1

    .line 19
    .line 20
    const/4 v2, 0x4

    .line 21
    if-eq v1, v2, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    .line 25
    .line 26
    int-to-float p1, p1

    .line 27
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->mCoordinate:F

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    iget p1, p1, Landroid/graphics/Rect;->right:I

    .line 31
    .line 32
    int-to-float p1, p1

    .line 33
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->mCoordinate:F

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    iget p1, p1, Landroid/graphics/Rect;->top:I

    .line 37
    .line 38
    int-to-float p1, p1

    .line 39
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->mCoordinate:F

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_3
    iget p1, p1, Landroid/graphics/Rect;->left:I

    .line 43
    .line 44
    int-to-float p1, p1

    .line 45
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->mCoordinate:F

    .line 46
    .line 47
    :goto_0
    iget p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->mCoordinate:F

    .line 48
    .line 49
    sub-float/2addr p1, v0

    .line 50
    return p1
.end method

.method public snapToView(Landroid/view/View;)V
    .locals 3

    .line 1
    sget-object v0, Lp2/b;->a:[I

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    aget v0, v0, v1

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    const/4 v2, 0x0

    .line 11
    if-eq v0, v1, :cond_3

    .line 12
    .line 13
    const/4 v1, 0x2

    .line 14
    if-eq v0, v1, :cond_2

    .line 15
    .line 16
    const/4 v1, 0x3

    .line 17
    if-eq v0, v1, :cond_1

    .line 18
    .line 19
    const/4 v1, 0x4

    .line 20
    if-eq v0, v1, :cond_0

    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    int-to-float p1, p1

    .line 28
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->mCoordinate:F

    .line 29
    .line 30
    return-void

    .line 31
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    int-to-float p1, p1

    .line 36
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->mCoordinate:F

    .line 37
    .line 38
    return-void

    .line 39
    :cond_2
    iput v2, p0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->mCoordinate:F

    .line 40
    .line 41
    return-void

    .line 42
    :cond_3
    iput v2, p0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->mCoordinate:F

    .line 43
    .line 44
    return-void
.end method
