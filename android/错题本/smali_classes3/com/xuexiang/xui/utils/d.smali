.class public final Lcom/xuexiang/xui/utils/d;
.super Landroid/text/style/ReplacementSpan;
.source "SourceFile"


# instance fields
.field public final a:I

.field public b:Ljava/lang/ref/WeakReference;

.field public c:Landroid/graphics/drawable/Drawable;

.field public d:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/text/style/ReplacementSpan;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lcom/xuexiang/xui/utils/d;->a:I

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()Landroid/graphics/drawable/Drawable;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/utils/d;->c:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const/4 v0, 0x0

    .line 7
    :try_start_0
    invoke-static {}, Lt1/a;->a()V

    .line 8
    .line 9
    .line 10
    throw v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    :catch_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v2, "Unable to find resource: "

    .line 14
    .line 15
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget v2, p0, Lcom/xuexiang/xui/utils/d;->d:I

    .line 19
    .line 20
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    const-string v2, "sms"

    .line 28
    .line 29
    invoke-static {v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 30
    .line 31
    .line 32
    return-object v0
.end method

.method public final draw(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFIIILandroid/graphics/Paint;)V
    .locals 0

    .line 1
    iget-object p2, p0, Lcom/xuexiang/xui/utils/d;->b:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    check-cast p2, Landroid/graphics/drawable/Drawable;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p2, 0x0

    .line 13
    :goto_0
    if-nez p2, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/xuexiang/xui/utils/d;->a()Landroid/graphics/drawable/Drawable;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    new-instance p3, Ljava/lang/ref/WeakReference;

    .line 20
    .line 21
    invoke-direct {p3, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iput-object p3, p0, Lcom/xuexiang/xui/utils/d;->b:Ljava/lang/ref/WeakReference;

    .line 25
    .line 26
    :cond_1
    invoke-virtual {p0}, Lcom/xuexiang/xui/utils/d;->a()Landroid/graphics/drawable/Drawable;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    invoke-virtual {p2}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 31
    .line 32
    .line 33
    move-result-object p3

    .line 34
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 35
    .line 36
    .line 37
    invoke-virtual {p9}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    .line 38
    .line 39
    .line 40
    move-result-object p4

    .line 41
    iget p4, p4, Landroid/graphics/Paint$FontMetrics;->descent:F

    .line 42
    .line 43
    invoke-virtual {p9}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    .line 44
    .line 45
    .line 46
    move-result-object p6

    .line 47
    iget p6, p6, Landroid/graphics/Paint$FontMetrics;->ascent:F

    .line 48
    .line 49
    sub-float/2addr p4, p6

    .line 50
    iget p6, p3, Landroid/graphics/Rect;->bottom:I

    .line 51
    .line 52
    sub-int/2addr p8, p6

    .line 53
    invoke-virtual {p3}, Landroid/graphics/Rect;->height()I

    .line 54
    .line 55
    .line 56
    move-result p6

    .line 57
    int-to-float p6, p6

    .line 58
    cmpg-float p6, p6, p4

    .line 59
    .line 60
    if-gez p6, :cond_4

    .line 61
    .line 62
    const/4 p6, 0x1

    .line 63
    iget p7, p0, Lcom/xuexiang/xui/utils/d;->a:I

    .line 64
    .line 65
    if-ne p7, p6, :cond_2

    .line 66
    .line 67
    invoke-virtual {p9}, Landroid/graphics/Paint;->getFontMetricsInt()Landroid/graphics/Paint$FontMetricsInt;

    .line 68
    .line 69
    .line 70
    move-result-object p3

    .line 71
    iget p3, p3, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    .line 72
    .line 73
    sub-int/2addr p8, p3

    .line 74
    goto :goto_2

    .line 75
    :cond_2
    const/4 p6, 0x2

    .line 76
    if-ne p7, p6, :cond_3

    .line 77
    .line 78
    int-to-float p6, p8

    .line 79
    invoke-virtual {p3}, Landroid/graphics/Rect;->height()I

    .line 80
    .line 81
    .line 82
    move-result p3

    .line 83
    int-to-float p3, p3

    .line 84
    sub-float/2addr p4, p3

    .line 85
    const/high16 p3, 0x40000000    # 2.0f

    .line 86
    .line 87
    div-float/2addr p4, p3

    .line 88
    :goto_1
    sub-float/2addr p6, p4

    .line 89
    float-to-int p8, p6

    .line 90
    goto :goto_2

    .line 91
    :cond_3
    const/4 p6, 0x3

    .line 92
    if-ne p7, p6, :cond_4

    .line 93
    .line 94
    int-to-float p6, p8

    .line 95
    invoke-virtual {p3}, Landroid/graphics/Rect;->height()I

    .line 96
    .line 97
    .line 98
    move-result p3

    .line 99
    int-to-float p3, p3

    .line 100
    sub-float/2addr p4, p3

    .line 101
    goto :goto_1

    .line 102
    :cond_4
    :goto_2
    int-to-float p3, p8

    .line 103
    invoke-virtual {p1, p5, p3}, Landroid/graphics/Canvas;->translate(FF)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p2, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 110
    .line 111
    .line 112
    return-void
.end method

.method public final getSize(Landroid/graphics/Paint;Ljava/lang/CharSequence;IILandroid/graphics/Paint$FontMetricsInt;)I
    .locals 1

    .line 1
    iget-object p2, p0, Lcom/xuexiang/xui/utils/d;->b:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    check-cast p2, Landroid/graphics/drawable/Drawable;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p2, 0x0

    .line 13
    :goto_0
    if-nez p2, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/xuexiang/xui/utils/d;->a()Landroid/graphics/drawable/Drawable;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    new-instance p3, Ljava/lang/ref/WeakReference;

    .line 20
    .line 21
    invoke-direct {p3, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iput-object p3, p0, Lcom/xuexiang/xui/utils/d;->b:Ljava/lang/ref/WeakReference;

    .line 25
    .line 26
    :cond_1
    invoke-virtual {p0}, Lcom/xuexiang/xui/utils/d;->a()Landroid/graphics/drawable/Drawable;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    invoke-virtual {p2}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    invoke-virtual {p1}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    .line 35
    .line 36
    .line 37
    move-result-object p3

    .line 38
    iget p3, p3, Landroid/graphics/Paint$FontMetrics;->descent:F

    .line 39
    .line 40
    invoke-virtual {p1}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    iget p1, p1, Landroid/graphics/Paint$FontMetrics;->ascent:F

    .line 45
    .line 46
    sub-float/2addr p3, p1

    .line 47
    float-to-int p1, p3

    .line 48
    if-eqz p5, :cond_4

    .line 49
    .line 50
    invoke-virtual {p2}, Landroid/graphics/Rect;->height()I

    .line 51
    .line 52
    .line 53
    move-result p3

    .line 54
    if-le p3, p1, :cond_4

    .line 55
    .line 56
    const/4 p3, 0x3

    .line 57
    iget p4, p0, Lcom/xuexiang/xui/utils/d;->a:I

    .line 58
    .line 59
    if-ne p4, p3, :cond_2

    .line 60
    .line 61
    iget p3, p5, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    .line 62
    .line 63
    invoke-virtual {p2}, Landroid/graphics/Rect;->height()I

    .line 64
    .line 65
    .line 66
    move-result p4

    .line 67
    sub-int/2addr p4, p1

    .line 68
    add-int/2addr p4, p3

    .line 69
    iput p4, p5, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_2
    const/4 p3, 0x2

    .line 73
    if-ne p4, p3, :cond_3

    .line 74
    .line 75
    iget p4, p5, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    .line 76
    .line 77
    invoke-virtual {p2}, Landroid/graphics/Rect;->height()I

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    sub-int/2addr v0, p1

    .line 82
    div-int/2addr v0, p3

    .line 83
    sub-int/2addr p4, v0

    .line 84
    iput p4, p5, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    .line 85
    .line 86
    iget p4, p5, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    .line 87
    .line 88
    invoke-virtual {p2}, Landroid/graphics/Rect;->height()I

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    sub-int/2addr v0, p1

    .line 93
    div-int/2addr v0, p3

    .line 94
    add-int/2addr v0, p4

    .line 95
    iput v0, p5, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_3
    iget p3, p5, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    .line 99
    .line 100
    invoke-virtual {p2}, Landroid/graphics/Rect;->height()I

    .line 101
    .line 102
    .line 103
    move-result p4

    .line 104
    sub-int/2addr p4, p1

    .line 105
    sub-int/2addr p3, p4

    .line 106
    iput p3, p5, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    .line 107
    .line 108
    :cond_4
    :goto_1
    iget p1, p2, Landroid/graphics/Rect;->right:I

    .line 109
    .line 110
    return p1
.end method
