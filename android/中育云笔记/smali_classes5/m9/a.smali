.class public Lm9/a;
.super Landroid/animation/ValueAnimator;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm9/a$c;
    }
.end annotation


# instance fields
.field public c:[[Lm9/a$c;

.field public d:Ljava/lang/ref/WeakReference;


# direct methods
.method public constructor <init>(Landroid/graphics/Bitmap;Landroid/graphics/PointF;Lcom/xuexiang/xui/widget/textview/badge/BadgeView;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroid/animation/ValueAnimator;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 5
    .line 6
    invoke-direct {v0, p3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lm9/a;->d:Ljava/lang/ref/WeakReference;

    .line 10
    .line 11
    const/4 p3, 0x2

    .line 12
    new-array p3, p3, [F

    .line 13
    .line 14
    fill-array-data p3, :array_0

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, p3}, Landroid/animation/ValueAnimator;->setFloatValues([F)V

    .line 18
    .line 19
    .line 20
    const-wide/16 v0, 0x1f4

    .line 21
    .line 22
    invoke-virtual {p0, v0, v1}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, p1, p2}, Lm9/a;->e(Landroid/graphics/Bitmap;Landroid/graphics/PointF;)[[Lm9/a$c;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iput-object p1, p0, Lm9/a;->c:[[Lm9/a$c;

    .line 30
    .line 31
    new-instance p1, Lm9/a$a;

    .line 32
    .line 33
    invoke-direct {p1, p0}, Lm9/a$a;-><init>(Lm9/a;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, p1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 37
    .line 38
    .line 39
    new-instance p1, Lm9/a$b;

    .line 40
    .line 41
    invoke-direct {p1, p0}, Lm9/a$b;-><init>(Lm9/a;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0, p1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    nop

    .line 49
    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public static synthetic b(Lm9/a;)Ljava/lang/ref/WeakReference;
    .locals 0

    .line 1
    iget-object p0, p0, Lm9/a;->d:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public d(Landroid/graphics/Canvas;)V
    .locals 9

    .line 1
    iget-object v0, p0, Lm9/a;->c:[[Lm9/a$c;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    move v3, v2

    .line 6
    :goto_0
    if-ge v3, v1, :cond_1

    .line 7
    .line 8
    aget-object v4, v0, v3

    .line 9
    .line 10
    array-length v5, v4

    .line 11
    move v6, v2

    .line 12
    :goto_1
    if-ge v6, v5, :cond_0

    .line 13
    .line 14
    aget-object v7, v4, v6

    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v8

    .line 20
    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v8

    .line 24
    invoke-static {v8}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 25
    .line 26
    .line 27
    move-result v8

    .line 28
    invoke-virtual {v7, v8, p1}, Lm9/a$c;->a(FLandroid/graphics/Canvas;)V

    .line 29
    .line 30
    .line 31
    add-int/lit8 v6, v6, 0x1

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    return-void
.end method

.method public final e(Landroid/graphics/Bitmap;Landroid/graphics/PointF;)[[Lm9/a$c;
    .locals 13

    .line 1
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    int-to-float v2, v2

    .line 14
    const/high16 v3, 0x40c00000    # 6.0f

    .line 15
    .line 16
    div-float/2addr v2, v3

    .line 17
    iget v3, p2, Landroid/graphics/PointF;->x:F

    .line 18
    .line 19
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    int-to-float v4, v4

    .line 24
    const/high16 v5, 0x40000000    # 2.0f

    .line 25
    .line 26
    div-float/2addr v4, v5

    .line 27
    sub-float/2addr v3, v4

    .line 28
    iget p2, p2, Landroid/graphics/PointF;->y:F

    .line 29
    .line 30
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    int-to-float v4, v4

    .line 35
    div-float/2addr v4, v5

    .line 36
    sub-float/2addr p2, v4

    .line 37
    int-to-float v4, v1

    .line 38
    div-float/2addr v4, v2

    .line 39
    float-to-int v4, v4

    .line 40
    int-to-float v5, v0

    .line 41
    div-float/2addr v5, v2

    .line 42
    float-to-int v5, v5

    .line 43
    const/4 v6, 0x2

    .line 44
    new-array v6, v6, [I

    .line 45
    .line 46
    const/4 v7, 0x1

    .line 47
    aput v5, v6, v7

    .line 48
    .line 49
    const/4 v5, 0x0

    .line 50
    aput v4, v6, v5

    .line 51
    .line 52
    const-class v4, Lm9/a$c;

    .line 53
    .line 54
    invoke-static {v4, v6}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    check-cast v4, [[Lm9/a$c;

    .line 59
    .line 60
    move v6, v5

    .line 61
    :goto_0
    array-length v7, v4

    .line 62
    if-ge v6, v7, :cond_1

    .line 63
    .line 64
    move v7, v5

    .line 65
    :goto_1
    aget-object v8, v4, v6

    .line 66
    .line 67
    array-length v8, v8

    .line 68
    if-ge v7, v8, :cond_0

    .line 69
    .line 70
    new-instance v8, Lm9/a$c;

    .line 71
    .line 72
    invoke-direct {v8}, Lm9/a$c;-><init>()V

    .line 73
    .line 74
    .line 75
    int-to-float v9, v7

    .line 76
    mul-float/2addr v9, v2

    .line 77
    float-to-int v10, v9

    .line 78
    int-to-float v11, v6

    .line 79
    mul-float/2addr v11, v2

    .line 80
    float-to-int v12, v11

    .line 81
    invoke-virtual {p1, v10, v12}, Landroid/graphics/Bitmap;->getPixel(II)I

    .line 82
    .line 83
    .line 84
    move-result v10

    .line 85
    iput v10, v8, Lm9/a$c;->e:I

    .line 86
    .line 87
    add-float/2addr v9, v3

    .line 88
    iput v9, v8, Lm9/a$c;->b:F

    .line 89
    .line 90
    add-float/2addr v11, p2

    .line 91
    iput v11, v8, Lm9/a$c;->c:F

    .line 92
    .line 93
    iput v2, v8, Lm9/a$c;->d:F

    .line 94
    .line 95
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 96
    .line 97
    .line 98
    move-result v9

    .line 99
    iput v9, v8, Lm9/a$c;->f:I

    .line 100
    .line 101
    aget-object v9, v4, v6

    .line 102
    .line 103
    aput-object v8, v9, v7

    .line 104
    .line 105
    add-int/lit8 v7, v7, 0x1

    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_0
    add-int/lit8 v6, v6, 0x1

    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_1
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->recycle()V

    .line 112
    .line 113
    .line 114
    return-object v4
.end method
