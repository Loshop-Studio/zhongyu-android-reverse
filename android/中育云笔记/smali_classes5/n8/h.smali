.class public abstract Ln8/h;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(IIII)Landroid/graphics/Rect;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Ln8/h;->c(IIII)Landroid/graphics/Rect;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static b(Landroid/graphics/Bitmap;Landroid/view/View;)Landroid/graphics/Rect;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    invoke-static {v0, p0, v1, p1}, Ln8/h;->c(IIII)Landroid/graphics/Rect;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method

.method public static c(IIII)Landroid/graphics/Rect;
    .locals 10

    .line 1
    const-wide/high16 v0, 0x7ff0000000000000L    # Double.POSITIVE_INFINITY

    .line 2
    .line 3
    if-ge p2, p0, :cond_0

    .line 4
    .line 5
    int-to-double v2, p2

    .line 6
    int-to-double v4, p0

    .line 7
    div-double/2addr v2, v4

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move-wide v2, v0

    .line 10
    :goto_0
    if-ge p3, p1, :cond_1

    .line 11
    .line 12
    int-to-double v4, p3

    .line 13
    int-to-double v6, p1

    .line 14
    div-double/2addr v4, v6

    .line 15
    goto :goto_1

    .line 16
    :cond_1
    move-wide v4, v0

    .line 17
    :goto_1
    cmpl-double v6, v2, v0

    .line 18
    .line 19
    if-nez v6, :cond_3

    .line 20
    .line 21
    cmpl-double v0, v4, v0

    .line 22
    .line 23
    if-eqz v0, :cond_2

    .line 24
    .line 25
    goto :goto_2

    .line 26
    :cond_2
    int-to-double v0, p1

    .line 27
    int-to-double p0, p0

    .line 28
    goto :goto_3

    .line 29
    :cond_3
    :goto_2
    cmpg-double v0, v2, v4

    .line 30
    .line 31
    if-gtz v0, :cond_4

    .line 32
    .line 33
    int-to-double v0, p2

    .line 34
    int-to-double v2, p1

    .line 35
    mul-double/2addr v2, v0

    .line 36
    int-to-double p0, p0

    .line 37
    div-double p0, v2, p0

    .line 38
    .line 39
    move-wide v8, v0

    .line 40
    move-wide v0, p0

    .line 41
    move-wide p0, v8

    .line 42
    goto :goto_3

    .line 43
    :cond_4
    int-to-double v0, p3

    .line 44
    int-to-double v2, p0

    .line 45
    mul-double/2addr v2, v0

    .line 46
    int-to-double p0, p1

    .line 47
    div-double p0, v2, p0

    .line 48
    .line 49
    :goto_3
    int-to-double v2, p2

    .line 50
    cmpl-double p2, p0, v2

    .line 51
    .line 52
    const/4 v4, 0x0

    .line 53
    const-wide/high16 v5, 0x4000000000000000L    # 2.0

    .line 54
    .line 55
    if-nez p2, :cond_5

    .line 56
    .line 57
    int-to-double p2, p3

    .line 58
    sub-double/2addr p2, v0

    .line 59
    div-double/2addr p2, v5

    .line 60
    invoke-static {p2, p3}, Ljava/lang/Math;->round(D)J

    .line 61
    .line 62
    .line 63
    move-result-wide p2

    .line 64
    :goto_4
    long-to-int p2, p2

    .line 65
    goto :goto_5

    .line 66
    :cond_5
    int-to-double p2, p3

    .line 67
    cmpl-double v7, v0, p2

    .line 68
    .line 69
    if-nez v7, :cond_6

    .line 70
    .line 71
    sub-double/2addr v2, p0

    .line 72
    div-double/2addr v2, v5

    .line 73
    invoke-static {v2, v3}, Ljava/lang/Math;->round(D)J

    .line 74
    .line 75
    .line 76
    move-result-wide p2

    .line 77
    long-to-int p2, p2

    .line 78
    move v8, v4

    .line 79
    move v4, p2

    .line 80
    move p2, v8

    .line 81
    goto :goto_5

    .line 82
    :cond_6
    sub-double/2addr v2, p0

    .line 83
    div-double/2addr v2, v5

    .line 84
    invoke-static {v2, v3}, Ljava/lang/Math;->round(D)J

    .line 85
    .line 86
    .line 87
    move-result-wide v2

    .line 88
    long-to-int v4, v2

    .line 89
    sub-double/2addr p2, v0

    .line 90
    div-double/2addr p2, v5

    .line 91
    invoke-static {p2, p3}, Ljava/lang/Math;->round(D)J

    .line 92
    .line 93
    .line 94
    move-result-wide p2

    .line 95
    goto :goto_4

    .line 96
    :goto_5
    new-instance p3, Landroid/graphics/Rect;

    .line 97
    .line 98
    invoke-static {p0, p1}, Ljava/lang/Math;->ceil(D)D

    .line 99
    .line 100
    .line 101
    move-result-wide p0

    .line 102
    double-to-int p0, p0

    .line 103
    add-int/2addr p0, v4

    .line 104
    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    .line 105
    .line 106
    .line 107
    move-result-wide v0

    .line 108
    double-to-int p1, v0

    .line 109
    add-int/2addr p1, p2

    .line 110
    invoke-direct {p3, v4, p2, p0, p1}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 111
    .line 112
    .line 113
    return-object p3
.end method
