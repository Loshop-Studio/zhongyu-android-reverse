.class public abstract Lcom/xuexiang/xui/utils/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(IIF)I
    .locals 4

    .line 1
    const/high16 v0, 0x3f800000    # 1.0f

    .line 2
    .line 3
    invoke-static {p2, v0}, Ljava/lang/Math;->min(FF)F

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-static {p2, v0}, Ljava/lang/Math;->max(FF)F

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    invoke-static {p0}, Landroid/graphics/Color;->alpha(I)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    invoke-static {p1}, Landroid/graphics/Color;->alpha(I)I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    sub-int/2addr v1, v0

    .line 21
    int-to-float v1, v1

    .line 22
    mul-float/2addr v1, p2

    .line 23
    float-to-int v1, v1

    .line 24
    add-int/2addr v1, v0

    .line 25
    invoke-static {p0}, Landroid/graphics/Color;->red(I)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    invoke-static {p1}, Landroid/graphics/Color;->red(I)I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    sub-int/2addr v2, v0

    .line 34
    int-to-float v2, v2

    .line 35
    mul-float/2addr v2, p2

    .line 36
    float-to-int v2, v2

    .line 37
    add-int/2addr v2, v0

    .line 38
    invoke-static {p0}, Landroid/graphics/Color;->green(I)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    invoke-static {p1}, Landroid/graphics/Color;->green(I)I

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    sub-int/2addr v3, v0

    .line 47
    int-to-float v3, v3

    .line 48
    mul-float/2addr v3, p2

    .line 49
    float-to-int v3, v3

    .line 50
    add-int/2addr v3, v0

    .line 51
    invoke-static {p0}, Landroid/graphics/Color;->blue(I)I

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    invoke-static {p1}, Landroid/graphics/Color;->blue(I)I

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    sub-int/2addr p1, p0

    .line 60
    int-to-float p1, p1

    .line 61
    mul-float/2addr p1, p2

    .line 62
    float-to-int p1, p1

    .line 63
    add-int/2addr p1, p0

    .line 64
    invoke-static {v1, v2, v3, p1}, Landroid/graphics/Color;->argb(IIII)I

    .line 65
    .line 66
    .line 67
    move-result p0

    .line 68
    return p0
.end method
