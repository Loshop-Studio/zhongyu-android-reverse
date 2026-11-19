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
.field private static final synthetic $VALUES:[Lcom/xuexiang/xui/widget/imageview/crop/Edge;

.field public static final enum BOTTOM:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

.field public static final enum LEFT:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

.field public static final MIN_CROP_LENGTH_PX:I = 0x28

.field public static final enum RIGHT:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

.field public static final enum TOP:Lcom/xuexiang/xui/widget/imageview/crop/Edge;


# instance fields
.field private mCoordinate:F


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    const-string v1, "LEFT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->LEFT:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 2
    new-instance v1, Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    const-string v3, "TOP"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->TOP:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 3
    new-instance v3, Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    const-string v5, "RIGHT"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->RIGHT:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 4
    new-instance v5, Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    const-string v7, "BOTTOM"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->BOTTOM:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    const/4 v7, 0x4

    new-array v7, v7, [Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    .line 5
    sput-object v7, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->$VALUES:[Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static adjustBottom(FLandroid/graphics/Rect;FF)F
    .locals 3

    .line 1
    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    int-to-float v0, p1

    sub-float/2addr v0, p0

    cmpg-float p2, v0, p2

    if-gez p2, :cond_0

    int-to-float p0, p1

    goto :goto_1

    .line 2
    :cond_0
    sget-object p1, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->TOP:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result p2

    const/high16 v0, 0x42200000    # 40.0f

    add-float/2addr p2, v0

    const/high16 v1, -0x800000    # Float.NEGATIVE_INFINITY

    cmpg-float p2, p0, p2

    if-gtz p2, :cond_1

    .line 3
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result p2

    add-float/2addr p2, v0

    goto :goto_0

    :cond_1
    const/high16 p2, -0x800000    # Float.NEGATIVE_INFINITY

    .line 4
    :goto_0
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result v2

    sub-float v2, p0, v2

    mul-float v2, v2, p3

    cmpg-float v2, v2, v0

    if-gtz v2, :cond_2

    .line 5
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result p1

    div-float/2addr v0, p3

    add-float v1, p1, v0

    .line 6
    :cond_2
    invoke-static {v1, p2}, Ljava/lang/Math;->max(FF)F

    move-result p1

    invoke-static {p0, p1}, Ljava/lang/Math;->max(FF)F

    move-result p0

    :goto_1
    return p0
.end method

.method private static adjustLeft(FLandroid/graphics/Rect;FF)F
    .locals 3

    .line 1
    iget p1, p1, Landroid/graphics/Rect;->left:I

    int-to-float v0, p1

    sub-float v0, p0, v0

    cmpg-float p2, v0, p2

    if-gez p2, :cond_0

    int-to-float p0, p1

    goto :goto_1

    .line 2
    :cond_0
    sget-object p1, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->RIGHT:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result p2

    const/high16 v0, 0x42200000    # 40.0f

    sub-float/2addr p2, v0

    const/high16 v1, 0x7f800000    # Float.POSITIVE_INFINITY

    cmpl-float p2, p0, p2

    if-ltz p2, :cond_1

    .line 3
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result p2

    sub-float/2addr p2, v0

    goto :goto_0

    :cond_1
    const/high16 p2, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 4
    :goto_0
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result v2

    sub-float/2addr v2, p0

    div-float/2addr v2, p3

    cmpg-float v2, v2, v0

    if-gtz v2, :cond_2

    .line 5
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result p1

    mul-float p3, p3, v0

    sub-float v1, p1, p3

    .line 6
    :cond_2
    invoke-static {p2, v1}, Ljava/lang/Math;->min(FF)F

    move-result p1

    invoke-static {p0, p1}, Ljava/lang/Math;->min(FF)F

    move-result p0

    :goto_1
    return p0
.end method

.method private static adjustRight(FLandroid/graphics/Rect;FF)F
    .locals 3

    .line 1
    iget p1, p1, Landroid/graphics/Rect;->right:I

    int-to-float v0, p1

    sub-float/2addr v0, p0

    cmpg-float p2, v0, p2

    if-gez p2, :cond_0

    int-to-float p0, p1

    goto :goto_1

    .line 2
    :cond_0
    sget-object p1, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->LEFT:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result p2

    const/high16 v0, 0x42200000    # 40.0f

    add-float/2addr p2, v0

    const/high16 v1, -0x800000    # Float.NEGATIVE_INFINITY

    cmpg-float p2, p0, p2

    if-gtz p2, :cond_1

    .line 3
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result p2

    add-float/2addr p2, v0

    goto :goto_0

    :cond_1
    const/high16 p2, -0x800000    # Float.NEGATIVE_INFINITY

    .line 4
    :goto_0
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result v2

    sub-float v2, p0, v2

    div-float/2addr v2, p3

    cmpg-float v2, v2, v0

    if-gtz v2, :cond_2

    .line 5
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result p1

    mul-float p3, p3, v0

    add-float v1, p1, p3

    .line 6
    :cond_2
    invoke-static {p2, v1}, Ljava/lang/Math;->max(FF)F

    move-result p1

    invoke-static {p0, p1}, Ljava/lang/Math;->max(FF)F

    move-result p0

    :goto_1
    return p0
.end method

.method private static adjustTop(FLandroid/graphics/Rect;FF)F
    .locals 3

    .line 1
    iget p1, p1, Landroid/graphics/Rect;->top:I

    int-to-float v0, p1

    sub-float v0, p0, v0

    cmpg-float p2, v0, p2

    if-gez p2, :cond_0

    int-to-float p0, p1

    goto :goto_1

    .line 2
    :cond_0
    sget-object p1, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->BOTTOM:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result p2

    const/high16 v0, 0x42200000    # 40.0f

    sub-float/2addr p2, v0

    const/high16 v1, 0x7f800000    # Float.POSITIVE_INFINITY

    cmpl-float p2, p0, p2

    if-ltz p2, :cond_1

    .line 3
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result p2

    sub-float/2addr p2, v0

    goto :goto_0

    :cond_1
    const/high16 p2, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 4
    :goto_0
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result v2

    sub-float/2addr v2, p0

    mul-float v2, v2, p3

    cmpg-float v2, v2, v0

    if-gtz v2, :cond_2

    .line 5
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result p1

    div-float/2addr v0, p3

    sub-float v1, p1, v0

    .line 6
    :cond_2
    invoke-static {p2, v1}, Ljava/lang/Math;->min(FF)F

    move-result p1

    invoke-static {p0, p1}, Ljava/lang/Math;->min(FF)F

    move-result p0

    :goto_1
    return p0
.end method

.method public static getHeight()F
    .locals 2

    sget-object v0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->BOTTOM:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result v0

    sget-object v1, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->TOP:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result v1

    sub-float/2addr v0, v1

    return v0
.end method

.method public static getWidth()F
    .locals 2

    sget-object v0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->RIGHT:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result v0

    sget-object v1, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->LEFT:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result v1

    sub-float/2addr v0, v1

    return v0
.end method

.method private isOutOfBounds(FFFFLandroid/graphics/Rect;)Z
    .locals 1

    iget v0, p5, Landroid/graphics/Rect;->top:I

    int-to-float v0, v0

    cmpg-float p1, p1, v0

    if-ltz p1, :cond_1

    iget p1, p5, Landroid/graphics/Rect;->left:I

    int-to-float p1, p1

    cmpg-float p1, p2, p1

    if-ltz p1, :cond_1

    iget p1, p5, Landroid/graphics/Rect;->bottom:I

    int-to-float p1, p1

    cmpl-float p1, p3, p1

    if-gtz p1, :cond_1

    iget p1, p5, Landroid/graphics/Rect;->right:I

    int-to-float p1, p1

    cmpl-float p1, p4, p1

    if-lez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/xuexiang/xui/widget/imageview/crop/Edge;
    .locals 1

    const-class v0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    return-object p0
.end method

.method public static values()[Lcom/xuexiang/xui/widget/imageview/crop/Edge;
    .locals 1

    sget-object v0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->$VALUES:[Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    invoke-virtual {v0}, [Lcom/xuexiang/xui/widget/imageview/crop/Edge;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    return-object v0
.end method


# virtual methods
.method public adjustCoordinate(F)V
    .locals 6

    .line 6
    sget-object v0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->LEFT:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result v0

    .line 7
    sget-object v1, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->TOP:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result v1

    .line 8
    sget-object v2, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->RIGHT:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    invoke-virtual {v2}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result v2

    .line 9
    sget-object v3, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->BOTTOM:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    invoke-virtual {v3}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result v3

    .line 10
    sget-object v4, Lcom/xuexiang/xui/widget/imageview/crop/Edge$1;->$SwitchMap$com$xuexiang$xui$widget$imageview$crop$Edge:[I

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

    goto :goto_0

    .line 11
    :cond_0
    invoke-static {v0, v1, v2, p1}, Lcom/xuexiang/xui/widget/imageview/crop/AspectRatioUtil;->calculateBottom(FFFF)F

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->mCoordinate:F

    goto :goto_0

    .line 12
    :cond_1
    invoke-static {v0, v1, v3, p1}, Lcom/xuexiang/xui/widget/imageview/crop/AspectRatioUtil;->calculateRight(FFFF)F

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->mCoordinate:F

    goto :goto_0

    .line 13
    :cond_2
    invoke-static {v0, v2, v3, p1}, Lcom/xuexiang/xui/widget/imageview/crop/AspectRatioUtil;->calculateTop(FFFF)F

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->mCoordinate:F

    goto :goto_0

    .line 14
    :cond_3
    invoke-static {v1, v2, v3, p1}, Lcom/xuexiang/xui/widget/imageview/crop/AspectRatioUtil;->calculateLeft(FFFF)F

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->mCoordinate:F

    :goto_0
    return-void
.end method

.method public adjustCoordinate(FFLandroid/graphics/Rect;FF)V
    .locals 2

    .line 1
    sget-object v0, Lcom/xuexiang/xui/widget/imageview/crop/Edge$1;->$SwitchMap$com$xuexiang$xui$widget$imageview$crop$Edge:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 p1, 0x4

    if-eq v0, p1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-static {p2, p3, p4, p5}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->adjustBottom(FLandroid/graphics/Rect;FF)F

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->mCoordinate:F

    goto :goto_0

    .line 3
    :cond_1
    invoke-static {p1, p3, p4, p5}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->adjustRight(FLandroid/graphics/Rect;FF)F

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->mCoordinate:F

    goto :goto_0

    .line 4
    :cond_2
    invoke-static {p2, p3, p4, p5}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->adjustTop(FLandroid/graphics/Rect;FF)F

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->mCoordinate:F

    goto :goto_0

    .line 5
    :cond_3
    invoke-static {p1, p3, p4, p5}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->adjustLeft(FLandroid/graphics/Rect;FF)F

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->mCoordinate:F

    :goto_0
    return-void
.end method

.method public getCoordinate()F
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->mCoordinate:F

    return v0
.end method

.method public isNewRectangleOutOfBounds(Lcom/xuexiang/xui/widget/imageview/crop/Edge;Landroid/graphics/Rect;F)Z
    .locals 8

    .line 1
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->snapOffset(Landroid/graphics/Rect;)F

    move-result v0

    .line 2
    sget-object v1, Lcom/xuexiang/xui/widget/imageview/crop/Edge$1;->$SwitchMap$com$xuexiang$xui$widget$imageview$crop$Edge:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const/4 v2, 0x1

    if-eq v1, v2, :cond_6

    const/4 v3, 0x2

    if-eq v1, v3, :cond_4

    const/4 v3, 0x3

    if-eq v1, v3, :cond_2

    const/4 v3, 0x4

    if-eq v1, v3, :cond_0

    goto/16 :goto_0

    .line 3
    :cond_0
    sget-object v1, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->LEFT:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    invoke-virtual {p1, v1}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 4
    iget p1, p2, Landroid/graphics/Rect;->left:I

    int-to-float v3, p1

    .line 5
    sget-object p1, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->RIGHT:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result p1

    sub-float v5, p1, v0

    .line 6
    sget-object p1, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->TOP:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result v2

    .line 7
    invoke-static {v3, v2, v5, p3}, Lcom/xuexiang/xui/widget/imageview/crop/AspectRatioUtil;->calculateBottom(FFFF)F

    move-result v4

    move-object v1, p0

    move-object v6, p2

    .line 8
    invoke-direct/range {v1 .. v6}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->isOutOfBounds(FFFFLandroid/graphics/Rect;)Z

    move-result p1

    return p1

    .line 9
    :cond_1
    sget-object v3, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->RIGHT:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    invoke-virtual {p1, v3}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_8

    .line 10
    iget p1, p2, Landroid/graphics/Rect;->right:I

    int-to-float v6, p1

    .line 11
    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result p1

    sub-float v4, p1, v0

    .line 12
    sget-object p1, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->TOP:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result v3

    .line 13
    invoke-static {v4, v3, v6, p3}, Lcom/xuexiang/xui/widget/imageview/crop/AspectRatioUtil;->calculateBottom(FFFF)F

    move-result v5

    move-object v2, p0

    move-object v7, p2

    .line 14
    invoke-direct/range {v2 .. v7}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->isOutOfBounds(FFFFLandroid/graphics/Rect;)Z

    move-result p1

    return p1

    .line 15
    :cond_2
    sget-object v1, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->TOP:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    invoke-virtual {p1, v1}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 16
    iget p1, p2, Landroid/graphics/Rect;->top:I

    int-to-float v2, p1

    .line 17
    sget-object p1, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->BOTTOM:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result p1

    sub-float v4, p1, v0

    .line 18
    sget-object p1, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->LEFT:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result v3

    .line 19
    invoke-static {v3, v2, v4, p3}, Lcom/xuexiang/xui/widget/imageview/crop/AspectRatioUtil;->calculateRight(FFFF)F

    move-result v5

    move-object v1, p0

    move-object v6, p2

    .line 20
    invoke-direct/range {v1 .. v6}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->isOutOfBounds(FFFFLandroid/graphics/Rect;)Z

    move-result p1

    return p1

    .line 21
    :cond_3
    sget-object v3, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->BOTTOM:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    invoke-virtual {p1, v3}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_8

    .line 22
    iget p1, p2, Landroid/graphics/Rect;->bottom:I

    int-to-float v5, p1

    .line 23
    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result p1

    sub-float v3, p1, v0

    .line 24
    sget-object p1, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->LEFT:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result v4

    .line 25
    invoke-static {v4, v3, v5, p3}, Lcom/xuexiang/xui/widget/imageview/crop/AspectRatioUtil;->calculateRight(FFFF)F

    move-result v6

    move-object v2, p0

    move-object v7, p2

    .line 26
    invoke-direct/range {v2 .. v7}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->isOutOfBounds(FFFFLandroid/graphics/Rect;)Z

    move-result p1

    return p1

    .line 27
    :cond_4
    sget-object v1, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->LEFT:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    invoke-virtual {p1, v1}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    .line 28
    iget p1, p2, Landroid/graphics/Rect;->left:I

    int-to-float v3, p1

    .line 29
    sget-object p1, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->RIGHT:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result p1

    sub-float v5, p1, v0

    .line 30
    sget-object p1, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->BOTTOM:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result v4

    .line 31
    invoke-static {v3, v5, v4, p3}, Lcom/xuexiang/xui/widget/imageview/crop/AspectRatioUtil;->calculateTop(FFFF)F

    move-result v2

    move-object v1, p0

    move-object v6, p2

    .line 32
    invoke-direct/range {v1 .. v6}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->isOutOfBounds(FFFFLandroid/graphics/Rect;)Z

    move-result p1

    return p1

    .line 33
    :cond_5
    sget-object v3, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->RIGHT:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    invoke-virtual {p1, v3}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_8

    .line 34
    iget p1, p2, Landroid/graphics/Rect;->right:I

    int-to-float v6, p1

    .line 35
    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result p1

    sub-float v4, p1, v0

    .line 36
    sget-object p1, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->BOTTOM:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result v5

    .line 37
    invoke-static {v4, v6, v5, p3}, Lcom/xuexiang/xui/widget/imageview/crop/AspectRatioUtil;->calculateTop(FFFF)F

    move-result v3

    move-object v2, p0

    move-object v7, p2

    .line 38
    invoke-direct/range {v2 .. v7}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->isOutOfBounds(FFFFLandroid/graphics/Rect;)Z

    move-result p1

    return p1

    .line 39
    :cond_6
    sget-object v1, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->TOP:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    invoke-virtual {p1, v1}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    .line 40
    iget p1, p2, Landroid/graphics/Rect;->top:I

    int-to-float v2, p1

    .line 41
    sget-object p1, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->BOTTOM:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result p1

    sub-float v4, p1, v0

    .line 42
    sget-object p1, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->RIGHT:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result v5

    .line 43
    invoke-static {v2, v5, v4, p3}, Lcom/xuexiang/xui/widget/imageview/crop/AspectRatioUtil;->calculateLeft(FFFF)F

    move-result v3

    move-object v1, p0

    move-object v6, p2

    .line 44
    invoke-direct/range {v1 .. v6}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->isOutOfBounds(FFFFLandroid/graphics/Rect;)Z

    move-result p1

    return p1

    .line 45
    :cond_7
    sget-object v3, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->BOTTOM:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    invoke-virtual {p1, v3}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_8

    .line 46
    iget p1, p2, Landroid/graphics/Rect;->bottom:I

    int-to-float v5, p1

    .line 47
    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result p1

    sub-float v3, p1, v0

    .line 48
    sget-object p1, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->RIGHT:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->getCoordinate()F

    move-result v6

    .line 49
    invoke-static {v3, v6, v5, p3}, Lcom/xuexiang/xui/widget/imageview/crop/AspectRatioUtil;->calculateLeft(FFFF)F

    move-result v4

    move-object v2, p0

    move-object v7, p2

    .line 50
    invoke-direct/range {v2 .. v7}, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->isOutOfBounds(FFFFLandroid/graphics/Rect;)Z

    move-result p1

    return p1

    :cond_8
    :goto_0
    return v2
.end method

.method public isOutsideFrame(Landroid/graphics/Rect;)Z
    .locals 7

    .line 1
    sget-object v0, Lcom/xuexiang/xui/widget/imageview/crop/Edge$1;->$SwitchMap$com$xuexiang$xui$widget$imageview$crop$Edge:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    if-eq v0, v1, :cond_3

    const/4 v5, 0x2

    if-eq v0, v5, :cond_2

    const/4 v5, 0x3

    if-eq v0, v5, :cond_1

    const/4 v5, 0x4

    if-eq v0, v5, :cond_0

    goto :goto_1

    .line 2
    :cond_0
    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    int-to-float p1, p1

    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->mCoordinate:F

    sub-float/2addr p1, v0

    float-to-double v5, p1

    cmpg-double p1, v5, v3

    if-gez p1, :cond_4

    goto :goto_0

    .line 3
    :cond_1
    iget p1, p1, Landroid/graphics/Rect;->right:I

    int-to-float p1, p1

    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->mCoordinate:F

    sub-float/2addr p1, v0

    float-to-double v5, p1

    cmpg-double p1, v5, v3

    if-gez p1, :cond_4

    goto :goto_0

    .line 4
    :cond_2
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->mCoordinate:F

    iget p1, p1, Landroid/graphics/Rect;->top:I

    int-to-float p1, p1

    sub-float/2addr v0, p1

    float-to-double v5, v0

    cmpg-double p1, v5, v3

    if-gez p1, :cond_4

    goto :goto_0

    .line 5
    :cond_3
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->mCoordinate:F

    iget p1, p1, Landroid/graphics/Rect;->left:I

    int-to-float p1, p1

    sub-float/2addr v0, p1

    float-to-double v5, v0

    cmpg-double p1, v5, v3

    if-gez p1, :cond_4

    goto :goto_0

    :cond_4
    const/4 v1, 0x0

    :goto_0
    move v2, v1

    :goto_1
    return v2
.end method

.method public isOutsideMargin(Landroid/graphics/Rect;F)Z
    .locals 4

    .line 1
    sget-object v0, Lcom/xuexiang/xui/widget/imageview/crop/Edge$1;->$SwitchMap$com$xuexiang$xui$widget$imageview$crop$Edge:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eq v0, v1, :cond_3

    const/4 v3, 0x2

    if-eq v0, v3, :cond_2

    const/4 v3, 0x3

    if-eq v0, v3, :cond_1

    const/4 v3, 0x4

    if-eq v0, v3, :cond_0

    goto :goto_1

    .line 2
    :cond_0
    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    int-to-float p1, p1

    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->mCoordinate:F

    sub-float/2addr p1, v0

    cmpg-float p1, p1, p2

    if-gez p1, :cond_4

    goto :goto_0

    .line 3
    :cond_1
    iget p1, p1, Landroid/graphics/Rect;->right:I

    int-to-float p1, p1

    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->mCoordinate:F

    sub-float/2addr p1, v0

    cmpg-float p1, p1, p2

    if-gez p1, :cond_4

    goto :goto_0

    .line 4
    :cond_2
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->mCoordinate:F

    iget p1, p1, Landroid/graphics/Rect;->top:I

    int-to-float p1, p1

    sub-float/2addr v0, p1

    cmpg-float p1, v0, p2

    if-gez p1, :cond_4

    goto :goto_0

    .line 5
    :cond_3
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->mCoordinate:F

    iget p1, p1, Landroid/graphics/Rect;->left:I

    int-to-float p1, p1

    sub-float/2addr v0, p1

    cmpg-float p1, v0, p2

    if-gez p1, :cond_4

    goto :goto_0

    :cond_4
    const/4 v1, 0x0

    :goto_0
    move v2, v1

    :goto_1
    return v2
.end method

.method public offset(F)V
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->mCoordinate:F

    add-float/2addr v0, p1

    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->mCoordinate:F

    return-void
.end method

.method public setCoordinate(F)V
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->mCoordinate:F

    return-void
.end method

.method public snapOffset(Landroid/graphics/Rect;)F
    .locals 3

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->mCoordinate:F

    .line 2
    sget-object v1, Lcom/xuexiang/xui/widget/imageview/crop/Edge$1;->$SwitchMap$com$xuexiang$xui$widget$imageview$crop$Edge:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const/4 v2, 0x1

    if-eq v1, v2, :cond_3

    const/4 v2, 0x2

    if-eq v1, v2, :cond_2

    const/4 v2, 0x3

    if-eq v1, v2, :cond_1

    const/4 v2, 0x4

    if-eq v1, v2, :cond_0

    move p1, v0

    goto :goto_1

    .line 3
    :cond_0
    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    goto :goto_0

    .line 4
    :cond_1
    iget p1, p1, Landroid/graphics/Rect;->right:I

    goto :goto_0

    .line 5
    :cond_2
    iget p1, p1, Landroid/graphics/Rect;->top:I

    goto :goto_0

    .line 6
    :cond_3
    iget p1, p1, Landroid/graphics/Rect;->left:I

    :goto_0
    int-to-float p1, p1

    :goto_1
    sub-float/2addr p1, v0

    return p1
.end method

.method public snapToRect(Landroid/graphics/Rect;)F
    .locals 3

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->mCoordinate:F

    .line 2
    sget-object v1, Lcom/xuexiang/xui/widget/imageview/crop/Edge$1;->$SwitchMap$com$xuexiang$xui$widget$imageview$crop$Edge:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const/4 v2, 0x1

    if-eq v1, v2, :cond_3

    const/4 v2, 0x2

    if-eq v1, v2, :cond_2

    const/4 v2, 0x3

    if-eq v1, v2, :cond_1

    const/4 v2, 0x4

    if-eq v1, v2, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    int-to-float p1, p1

    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->mCoordinate:F

    goto :goto_0

    .line 4
    :cond_1
    iget p1, p1, Landroid/graphics/Rect;->right:I

    int-to-float p1, p1

    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->mCoordinate:F

    goto :goto_0

    .line 5
    :cond_2
    iget p1, p1, Landroid/graphics/Rect;->top:I

    int-to-float p1, p1

    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->mCoordinate:F

    goto :goto_0

    .line 6
    :cond_3
    iget p1, p1, Landroid/graphics/Rect;->left:I

    int-to-float p1, p1

    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->mCoordinate:F

    .line 7
    :goto_0
    iget p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->mCoordinate:F

    sub-float/2addr p1, v0

    return p1
.end method

.method public snapToView(Landroid/view/View;)V
    .locals 3

    .line 1
    sget-object v0, Lcom/xuexiang/xui/widget/imageview/crop/Edge$1;->$SwitchMap$com$xuexiang$xui$widget$imageview$crop$Edge:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    int-to-float p1, p1

    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->mCoordinate:F

    goto :goto_0

    .line 3
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result p1

    int-to-float p1, p1

    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->mCoordinate:F

    goto :goto_0

    .line 4
    :cond_2
    iput v2, p0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->mCoordinate:F

    goto :goto_0

    .line 5
    :cond_3
    iput v2, p0, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->mCoordinate:F

    :goto_0
    return-void
.end method
