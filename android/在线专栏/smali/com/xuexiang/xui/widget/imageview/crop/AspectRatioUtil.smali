.class final Lcom/xuexiang/xui/widget/imageview/crop/AspectRatioUtil;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "u can\'t instantiate me..."

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method static calculateAspectRatio(FFFF)F
    .locals 0

    sub-float/2addr p2, p0

    sub-float/2addr p3, p1

    div-float/2addr p2, p3

    return p2
.end method

.method static calculateAspectRatio(Landroid/graphics/Rect;)F
    .locals 1

    invoke-virtual {p0}, Landroid/graphics/Rect;->width()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p0}, Landroid/graphics/Rect;->height()I

    move-result p0

    int-to-float p0, p0

    div-float/2addr v0, p0

    return v0
.end method

.method static calculateBottom(FFFF)F
    .locals 0

    sub-float/2addr p2, p0

    div-float/2addr p2, p3

    add-float/2addr p2, p1

    return p2
.end method

.method static calculateHeight(FFF)F
    .locals 0

    sub-float/2addr p1, p0

    div-float/2addr p1, p2

    return p1
.end method

.method static calculateLeft(FFFF)F
    .locals 0

    sub-float/2addr p2, p0

    mul-float p3, p3, p2

    sub-float/2addr p1, p3

    return p1
.end method

.method static calculateRight(FFFF)F
    .locals 0

    sub-float/2addr p2, p1

    mul-float p3, p3, p2

    add-float/2addr p3, p0

    return p3
.end method

.method static calculateTop(FFFF)F
    .locals 0

    sub-float/2addr p1, p0

    div-float/2addr p1, p3

    sub-float/2addr p2, p1

    return p2
.end method

.method static calculateWidth(FFF)F
    .locals 0

    sub-float/2addr p1, p0

    mul-float p2, p2, p1

    return p2
.end method
