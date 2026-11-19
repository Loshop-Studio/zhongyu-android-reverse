.class public final Lr2/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr2/b;
.implements Landroid/view/View$OnTouchListener;
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# static fields
.field public static final z:Z


# instance fields
.field public final a:Landroid/view/animation/AccelerateDecelerateInterpolator;

.field public b:I

.field public c:F

.field public d:F

.field public e:F

.field public f:Z

.field public g:Z

.field public h:Ljava/lang/ref/WeakReference;

.field public final i:Landroid/view/GestureDetector;

.field public final j:Ls2/b;

.field public final k:Landroid/graphics/Matrix;

.field public final l:Landroid/graphics/Matrix;

.field public final m:Landroid/graphics/Matrix;

.field public final n:Landroid/graphics/RectF;

.field public final o:[F

.field public p:Lr2/j;

.field public q:Landroid/view/View$OnLongClickListener;

.field public r:I

.field public s:I

.field public t:I

.field public u:I

.field public v:Lr2/e;

.field public w:I

.field public x:Z

.field public y:Landroid/widget/ImageView$ScaleType;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "PhotoViewAttacher"

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    sput-boolean v0, Lr2/k;->z:Z

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Lcom/xuexiang/xui/widget/imageview/photoview/PhotoView;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/view/animation/AccelerateDecelerateInterpolator;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lr2/k;->a:Landroid/view/animation/AccelerateDecelerateInterpolator;

    .line 10
    .line 11
    const/16 v0, 0xc8

    .line 12
    .line 13
    iput v0, p0, Lr2/k;->b:I

    .line 14
    .line 15
    const/high16 v0, 0x3f800000    # 1.0f

    .line 16
    .line 17
    iput v0, p0, Lr2/k;->c:F

    .line 18
    .line 19
    const/high16 v0, 0x3fe00000    # 1.75f

    .line 20
    .line 21
    iput v0, p0, Lr2/k;->d:F

    .line 22
    .line 23
    const/high16 v0, 0x40400000    # 3.0f

    .line 24
    .line 25
    iput v0, p0, Lr2/k;->e:F

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    iput-boolean v0, p0, Lr2/k;->f:Z

    .line 29
    .line 30
    const/4 v1, 0x0

    .line 31
    iput-boolean v1, p0, Lr2/k;->g:Z

    .line 32
    .line 33
    new-instance v1, Landroid/graphics/Matrix;

    .line 34
    .line 35
    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    .line 36
    .line 37
    .line 38
    iput-object v1, p0, Lr2/k;->k:Landroid/graphics/Matrix;

    .line 39
    .line 40
    new-instance v1, Landroid/graphics/Matrix;

    .line 41
    .line 42
    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    .line 43
    .line 44
    .line 45
    iput-object v1, p0, Lr2/k;->l:Landroid/graphics/Matrix;

    .line 46
    .line 47
    new-instance v1, Landroid/graphics/Matrix;

    .line 48
    .line 49
    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    .line 50
    .line 51
    .line 52
    iput-object v1, p0, Lr2/k;->m:Landroid/graphics/Matrix;

    .line 53
    .line 54
    new-instance v1, Landroid/graphics/RectF;

    .line 55
    .line 56
    invoke-direct {v1}, Landroid/graphics/RectF;-><init>()V

    .line 57
    .line 58
    .line 59
    iput-object v1, p0, Lr2/k;->n:Landroid/graphics/RectF;

    .line 60
    .line 61
    const/16 v1, 0x9

    .line 62
    .line 63
    new-array v1, v1, [F

    .line 64
    .line 65
    iput-object v1, p0, Lr2/k;->o:[F

    .line 66
    .line 67
    const/4 v1, 0x2

    .line 68
    iput v1, p0, Lr2/k;->w:I

    .line 69
    .line 70
    sget-object v1, Landroid/widget/ImageView$ScaleType;->FIT_CENTER:Landroid/widget/ImageView$ScaleType;

    .line 71
    .line 72
    iput-object v1, p0, Lr2/k;->y:Landroid/widget/ImageView$ScaleType;

    .line 73
    .line 74
    new-instance v1, Ljava/lang/ref/WeakReference;

    .line 75
    .line 76
    invoke-direct {v1, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    iput-object v1, p0, Lr2/k;->h:Ljava/lang/ref/WeakReference;

    .line 80
    .line 81
    invoke-virtual {p1, v0}, Landroid/view/View;->setDrawingCacheEnabled(Z)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1, p0}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    if-eqz v1, :cond_0

    .line 92
    .line 93
    invoke-virtual {v1, p0}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 94
    .line 95
    .line 96
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    new-instance v2, Ls2/b;

    .line 101
    .line 102
    invoke-direct {v2, v1}, Ls2/b;-><init>(Landroid/content/Context;)V

    .line 103
    .line 104
    .line 105
    iput-object p0, v2, Ls2/b;->a:Lr2/k;

    .line 106
    .line 107
    iput-object v2, p0, Lr2/k;->j:Ls2/b;

    .line 108
    .line 109
    new-instance v1, Landroid/view/GestureDetector;

    .line 110
    .line 111
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    new-instance v2, Lf3/a;

    .line 116
    .line 117
    invoke-direct {v2, p0}, Lf3/a;-><init>(Lr2/k;)V

    .line 118
    .line 119
    .line 120
    invoke-direct {v1, p1, v2}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    .line 121
    .line 122
    .line 123
    iput-object v1, p0, Lr2/k;->i:Landroid/view/GestureDetector;

    .line 124
    .line 125
    new-instance p1, Lr2/a;

    .line 126
    .line 127
    invoke-direct {p1, p0}, Lr2/a;-><init>(Lr2/k;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v1, p1}, Landroid/view/GestureDetector;->setOnDoubleTapListener(Landroid/view/GestureDetector$OnDoubleTapListener;)V

    .line 131
    .line 132
    .line 133
    iput-boolean v0, p0, Lr2/k;->x:Z

    .line 134
    .line 135
    invoke-virtual {p0}, Lr2/k;->o()V

    .line 136
    .line 137
    .line 138
    return-void
.end method

.method public static c(FFF)V
    .locals 0

    .line 1
    cmpl-float p0, p0, p1

    .line 2
    .line 3
    if-gez p0, :cond_1

    .line 4
    .line 5
    cmpl-float p0, p1, p2

    .line 6
    .line 7
    if-gez p0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 11
    .line 12
    const-string p1, "Medium zoom has to be less than Maximum zoom. Call setMaximumZoom() with a more appropriate value"

    .line 13
    .line 14
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    throw p0

    .line 18
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 19
    .line 20
    const-string p1, "Minimum zoom has to be less than Medium zoom. Call setMinimumZoom() with a more appropriate value"

    .line 21
    .line 22
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw p0
.end method

.method public static h(Landroid/widget/ImageView;)I
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return p0

    .line 5
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    sub-int/2addr v0, v1

    .line 14
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    sub-int/2addr v0, p0

    .line 19
    return v0
.end method

.method public static i(Landroid/widget/ImageView;)I
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return p0

    .line 5
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    sub-int/2addr v0, v1

    .line 14
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    sub-int/2addr v0, p0

    .line 19
    return v0
.end method


# virtual methods
.method public final a()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lr2/k;->b()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lr2/k;->f()Landroid/graphics/Matrix;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p0, v0}, Lr2/k;->m(Landroid/graphics/Matrix;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public final b()Z
    .locals 12

    .line 1
    invoke-virtual {p0}, Lr2/k;->g()Landroid/widget/ImageView;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    invoke-virtual {p0}, Lr2/k;->f()Landroid/graphics/Matrix;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {p0, v2}, Lr2/k;->e(Landroid/graphics/Matrix;)Landroid/graphics/RectF;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    if-nez v2, :cond_1

    .line 18
    .line 19
    :goto_0
    return v1

    .line 20
    :cond_1
    invoke-virtual {v2}, Landroid/graphics/RectF;->height()F

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    invoke-virtual {v2}, Landroid/graphics/RectF;->width()F

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    invoke-static {v0}, Lr2/k;->h(Landroid/widget/ImageView;)I

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    int-to-float v5, v5

    .line 33
    cmpg-float v6, v3, v5

    .line 34
    .line 35
    const/high16 v7, 0x40000000    # 2.0f

    .line 36
    .line 37
    const/4 v8, 0x3

    .line 38
    const/4 v9, 0x2

    .line 39
    const/4 v10, 0x0

    .line 40
    if-gtz v6, :cond_4

    .line 41
    .line 42
    sget-object v6, Lr2/c;->a:[I

    .line 43
    .line 44
    iget-object v11, p0, Lr2/k;->y:Landroid/widget/ImageView$ScaleType;

    .line 45
    .line 46
    invoke-virtual {v11}, Ljava/lang/Enum;->ordinal()I

    .line 47
    .line 48
    .line 49
    move-result v11

    .line 50
    aget v6, v6, v11

    .line 51
    .line 52
    if-eq v6, v9, :cond_3

    .line 53
    .line 54
    if-eq v6, v8, :cond_2

    .line 55
    .line 56
    sub-float/2addr v5, v3

    .line 57
    div-float/2addr v5, v7

    .line 58
    iget v3, v2, Landroid/graphics/RectF;->top:F

    .line 59
    .line 60
    :goto_1
    sub-float/2addr v5, v3

    .line 61
    goto :goto_3

    .line 62
    :cond_2
    sub-float/2addr v5, v3

    .line 63
    iget v3, v2, Landroid/graphics/RectF;->top:F

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_3
    iget v3, v2, Landroid/graphics/RectF;->top:F

    .line 67
    .line 68
    :goto_2
    neg-float v5, v3

    .line 69
    goto :goto_3

    .line 70
    :cond_4
    iget v3, v2, Landroid/graphics/RectF;->top:F

    .line 71
    .line 72
    cmpl-float v6, v3, v10

    .line 73
    .line 74
    if-lez v6, :cond_5

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_5
    iget v3, v2, Landroid/graphics/RectF;->bottom:F

    .line 78
    .line 79
    cmpg-float v6, v3, v5

    .line 80
    .line 81
    if-gez v6, :cond_6

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_6
    move v5, v10

    .line 85
    :goto_3
    invoke-static {v0}, Lr2/k;->i(Landroid/widget/ImageView;)I

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    int-to-float v0, v0

    .line 90
    cmpg-float v3, v4, v0

    .line 91
    .line 92
    const/4 v6, 0x1

    .line 93
    if-gtz v3, :cond_9

    .line 94
    .line 95
    sget-object v1, Lr2/c;->a:[I

    .line 96
    .line 97
    iget-object v3, p0, Lr2/k;->y:Landroid/widget/ImageView$ScaleType;

    .line 98
    .line 99
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 100
    .line 101
    .line 102
    move-result v3

    .line 103
    aget v1, v1, v3

    .line 104
    .line 105
    if-eq v1, v9, :cond_8

    .line 106
    .line 107
    if-eq v1, v8, :cond_7

    .line 108
    .line 109
    sub-float/2addr v0, v4

    .line 110
    div-float/2addr v0, v7

    .line 111
    iget v1, v2, Landroid/graphics/RectF;->left:F

    .line 112
    .line 113
    :goto_4
    sub-float/2addr v0, v1

    .line 114
    :goto_5
    move v10, v0

    .line 115
    goto :goto_6

    .line 116
    :cond_7
    sub-float/2addr v0, v4

    .line 117
    iget v1, v2, Landroid/graphics/RectF;->left:F

    .line 118
    .line 119
    goto :goto_4

    .line 120
    :cond_8
    iget v0, v2, Landroid/graphics/RectF;->left:F

    .line 121
    .line 122
    neg-float v0, v0

    .line 123
    goto :goto_5

    .line 124
    :goto_6
    iput v9, p0, Lr2/k;->w:I

    .line 125
    .line 126
    goto :goto_7

    .line 127
    :cond_9
    iget v3, v2, Landroid/graphics/RectF;->left:F

    .line 128
    .line 129
    cmpl-float v4, v3, v10

    .line 130
    .line 131
    if-lez v4, :cond_a

    .line 132
    .line 133
    iput v1, p0, Lr2/k;->w:I

    .line 134
    .line 135
    neg-float v10, v3

    .line 136
    goto :goto_7

    .line 137
    :cond_a
    iget v1, v2, Landroid/graphics/RectF;->right:F

    .line 138
    .line 139
    cmpg-float v2, v1, v0

    .line 140
    .line 141
    if-gez v2, :cond_b

    .line 142
    .line 143
    sub-float v10, v0, v1

    .line 144
    .line 145
    iput v6, p0, Lr2/k;->w:I

    .line 146
    .line 147
    goto :goto_7

    .line 148
    :cond_b
    const/4 v0, -0x1

    .line 149
    iput v0, p0, Lr2/k;->w:I

    .line 150
    .line 151
    :goto_7
    iget-object v0, p0, Lr2/k;->m:Landroid/graphics/Matrix;

    .line 152
    .line 153
    invoke-virtual {v0, v10, v5}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 154
    .line 155
    .line 156
    return v6
.end method

.method public final d()V
    .locals 4

    .line 1
    iget-object v0, p0, Lr2/k;->h:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Landroid/widget/ImageView;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    if-eqz v0, :cond_2

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    invoke-virtual {v2}, Landroid/view/ViewTreeObserver;->isAlive()Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-eqz v3, :cond_1

    .line 26
    .line 27
    invoke-virtual {v2, p0}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 28
    .line 29
    .line 30
    :cond_1
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, Lr2/k;->v:Lr2/e;

    .line 34
    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    iget-object v0, v0, Lr2/e;->a:Lt2/a;

    .line 38
    .line 39
    const/4 v2, 0x1

    .line 40
    iget-object v0, v0, Lt2/a;->b:Landroid/widget/OverScroller;

    .line 41
    .line 42
    invoke-virtual {v0, v2}, Landroid/widget/OverScroller;->forceFinished(Z)V

    .line 43
    .line 44
    .line 45
    iput-object v1, p0, Lr2/k;->v:Lr2/e;

    .line 46
    .line 47
    :cond_2
    iget-object v0, p0, Lr2/k;->i:Landroid/view/GestureDetector;

    .line 48
    .line 49
    if-eqz v0, :cond_3

    .line 50
    .line 51
    invoke-virtual {v0, v1}, Landroid/view/GestureDetector;->setOnDoubleTapListener(Landroid/view/GestureDetector$OnDoubleTapListener;)V

    .line 52
    .line 53
    .line 54
    :cond_3
    iput-object v1, p0, Lr2/k;->p:Lr2/j;

    .line 55
    .line 56
    iput-object v1, p0, Lr2/k;->q:Landroid/view/View$OnLongClickListener;

    .line 57
    .line 58
    iput-object v1, p0, Lr2/k;->h:Ljava/lang/ref/WeakReference;

    .line 59
    .line 60
    return-void
.end method

.method public final e(Landroid/graphics/Matrix;)Landroid/graphics/RectF;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lr2/k;->g()Landroid/widget/ImageView;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    int-to-float v1, v1

    .line 18
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    int-to-float v0, v0

    .line 23
    iget-object v2, p0, Lr2/k;->n:Landroid/graphics/RectF;

    .line 24
    .line 25
    const/4 v3, 0x0

    .line 26
    invoke-virtual {v2, v3, v3, v1, v0}, Landroid/graphics/RectF;->set(FFFF)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, v2}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 30
    .line 31
    .line 32
    return-object v2

    .line 33
    :cond_0
    const/4 p1, 0x0

    .line 34
    return-object p1
.end method

.method public final f()Landroid/graphics/Matrix;
    .locals 2

    .line 1
    iget-object v0, p0, Lr2/k;->k:Landroid/graphics/Matrix;

    .line 2
    .line 3
    iget-object v1, p0, Lr2/k;->l:Landroid/graphics/Matrix;

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lr2/k;->m:Landroid/graphics/Matrix;

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 11
    .line 12
    .line 13
    return-object v1
.end method

.method public final g()Landroid/widget/ImageView;
    .locals 1

    .line 1
    iget-object v0, p0, Lr2/k;->h:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Landroid/widget/ImageView;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    :goto_0
    if-nez v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0}, Lr2/k;->d()V

    .line 16
    .line 17
    .line 18
    :cond_1
    return-object v0
.end method

.method public final j()F
    .locals 6

    .line 1
    iget-object v0, p0, Lr2/k;->m:Landroid/graphics/Matrix;

    .line 2
    .line 3
    iget-object v1, p0, Lr2/k;->o:[F

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->getValues([F)V

    .line 6
    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    aget v2, v1, v2

    .line 10
    .line 11
    float-to-double v2, v2

    .line 12
    const-wide/high16 v4, 0x4000000000000000L    # 2.0

    .line 13
    .line 14
    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->pow(DD)D

    .line 15
    .line 16
    .line 17
    move-result-wide v2

    .line 18
    double-to-float v2, v2

    .line 19
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->getValues([F)V

    .line 20
    .line 21
    .line 22
    const/4 v0, 0x3

    .line 23
    aget v0, v1, v0

    .line 24
    .line 25
    float-to-double v0, v0

    .line 26
    invoke-static {v0, v1, v4, v5}, Ljava/lang/Math;->pow(DD)D

    .line 27
    .line 28
    .line 29
    move-result-wide v0

    .line 30
    double-to-float v0, v0

    .line 31
    add-float/2addr v2, v0

    .line 32
    float-to-double v0, v2

    .line 33
    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    .line 34
    .line 35
    .line 36
    move-result-wide v0

    .line 37
    double-to-float v0, v0

    .line 38
    return v0
.end method

.method public final k(FFF)V
    .locals 3

    .line 1
    sget-boolean v0, Lr2/k;->z:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-static {p3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    filled-new-array {v0, v1, v2}, [Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const-string v1, "onScale: scale: %.2f. fX: %.2f. fY: %.2f"

    .line 22
    .line 23
    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    :cond_0
    invoke-virtual {p0}, Lr2/k;->j()F

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iget v1, p0, Lr2/k;->e:F

    .line 31
    .line 32
    cmpg-float v0, v0, v1

    .line 33
    .line 34
    const/high16 v1, 0x3f800000    # 1.0f

    .line 35
    .line 36
    if-ltz v0, :cond_1

    .line 37
    .line 38
    cmpg-float v0, p1, v1

    .line 39
    .line 40
    if-gez v0, :cond_2

    .line 41
    .line 42
    :cond_1
    invoke-virtual {p0}, Lr2/k;->j()F

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget v2, p0, Lr2/k;->c:F

    .line 47
    .line 48
    cmpl-float v0, v0, v2

    .line 49
    .line 50
    if-gtz v0, :cond_3

    .line 51
    .line 52
    cmpl-float v0, p1, v1

    .line 53
    .line 54
    if-lez v0, :cond_2

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_2
    return-void

    .line 58
    :cond_3
    :goto_0
    iget-object v0, p0, Lr2/k;->m:Landroid/graphics/Matrix;

    .line 59
    .line 60
    invoke-virtual {v0, p1, p1, p2, p3}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0}, Lr2/k;->a()V

    .line 64
    .line 65
    .line 66
    return-void
.end method

.method public final l()V
    .locals 2

    .line 1
    iget-object v0, p0, Lr2/k;->m:Landroid/graphics/Matrix;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->postRotate(F)Z

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lr2/k;->a()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lr2/k;->f()Landroid/graphics/Matrix;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {p0, v0}, Lr2/k;->m(Landroid/graphics/Matrix;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Lr2/k;->b()Z

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final m(Landroid/graphics/Matrix;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lr2/k;->g()Landroid/widget/ImageView;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    invoke-virtual {p0}, Lr2/k;->g()Landroid/widget/ImageView;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    instance-of v2, v1, Lr2/b;

    .line 14
    .line 15
    if-nez v2, :cond_1

    .line 16
    .line 17
    sget-object v2, Landroid/widget/ImageView$ScaleType;->MATRIX:Landroid/widget/ImageView$ScaleType;

    .line 18
    .line 19
    invoke-virtual {v1}, Landroid/widget/ImageView;->getScaleType()Landroid/widget/ImageView$ScaleType;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 31
    .line 32
    const-string v0, "The ImageView\'s ScaleType has been changed since attaching a PhotoViewAttacher. You should call setScaleType on the PhotoViewAttacher instead of on the ImageView"

    .line 33
    .line 34
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw p1

    .line 38
    :cond_1
    :goto_0
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageMatrix(Landroid/graphics/Matrix;)V

    .line 39
    .line 40
    .line 41
    :cond_2
    return-void
.end method

.method public final n(FFFZ)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Lr2/k;->g()Landroid/widget/ImageView;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget v1, p0, Lr2/k;->c:F

    .line 8
    .line 9
    cmpg-float v1, p1, v1

    .line 10
    .line 11
    if-ltz v1, :cond_0

    .line 12
    .line 13
    iget v1, p0, Lr2/k;->e:F

    .line 14
    .line 15
    cmpl-float v1, p1, v1

    .line 16
    .line 17
    if-lez v1, :cond_1

    .line 18
    .line 19
    :cond_0
    move-object v3, p0

    .line 20
    goto :goto_0

    .line 21
    :cond_1
    if-eqz p4, :cond_2

    .line 22
    .line 23
    new-instance v2, Lr2/d;

    .line 24
    .line 25
    invoke-virtual {p0}, Lr2/k;->j()F

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    move-object v3, p0

    .line 30
    move v5, p1

    .line 31
    move v6, p2

    .line 32
    move v7, p3

    .line 33
    invoke-direct/range {v2 .. v7}, Lr2/d;-><init>(Lr2/k;FFFF)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_2
    move-object v3, p0

    .line 41
    move v5, p1

    .line 42
    move v6, p2

    .line 43
    move v7, p3

    .line 44
    iget-object p1, v3, Lr2/k;->m:Landroid/graphics/Matrix;

    .line 45
    .line 46
    invoke-virtual {p1, v5, v5, v6, v7}, Landroid/graphics/Matrix;->setScale(FFFF)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Lr2/k;->a()V

    .line 50
    .line 51
    .line 52
    :goto_0
    return-void
.end method

.method public final o()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lr2/k;->g()Landroid/widget/ImageView;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    iget-boolean v1, p0, Lr2/k;->x:Z

    .line 8
    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    instance-of v1, v0, Lr2/b;

    .line 12
    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    sget-object v1, Landroid/widget/ImageView$ScaleType;->MATRIX:Landroid/widget/ImageView$ScaleType;

    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/widget/ImageView;->getScaleType()Landroid/widget/ImageView$ScaleType;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-nez v2, :cond_0

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {p0, v0}, Lr2/k;->p(Landroid/graphics/drawable/Drawable;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_1
    invoke-virtual {p0}, Lr2/k;->l()V

    .line 39
    .line 40
    .line 41
    :cond_2
    return-void
.end method

.method public final onGlobalLayout()V
    .locals 6

    .line 1
    invoke-virtual {p0}, Lr2/k;->g()Landroid/widget/ImageView;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    iget-boolean v1, p0, Lr2/k;->x:Z

    .line 8
    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-virtual {v0}, Landroid/view/View;->getRight()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    invoke-virtual {v0}, Landroid/view/View;->getBottom()I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    iget v5, p0, Lr2/k;->r:I

    .line 28
    .line 29
    if-ne v1, v5, :cond_0

    .line 30
    .line 31
    iget v5, p0, Lr2/k;->t:I

    .line 32
    .line 33
    if-ne v3, v5, :cond_0

    .line 34
    .line 35
    iget v5, p0, Lr2/k;->u:I

    .line 36
    .line 37
    if-ne v4, v5, :cond_0

    .line 38
    .line 39
    iget v5, p0, Lr2/k;->s:I

    .line 40
    .line 41
    if-eq v2, v5, :cond_2

    .line 42
    .line 43
    :cond_0
    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {p0, v0}, Lr2/k;->p(Landroid/graphics/drawable/Drawable;)V

    .line 48
    .line 49
    .line 50
    iput v1, p0, Lr2/k;->r:I

    .line 51
    .line 52
    iput v2, p0, Lr2/k;->s:I

    .line 53
    .line 54
    iput v3, p0, Lr2/k;->t:I

    .line 55
    .line 56
    iput v4, p0, Lr2/k;->u:I

    .line 57
    .line 58
    return-void

    .line 59
    :cond_1
    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {p0, v0}, Lr2/k;->p(Landroid/graphics/drawable/Drawable;)V

    .line 64
    .line 65
    .line 66
    :cond_2
    return-void
.end method

.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 10

    .line 1
    iget-boolean v0, p0, Lr2/k;->x:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_a

    .line 5
    .line 6
    move-object v0, p1

    .line 7
    check-cast v0, Landroid/widget/ImageView;

    .line 8
    .line 9
    if-eqz v0, :cond_a

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_a

    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    const/4 v3, 0x1

    .line 26
    if-eqz v2, :cond_2

    .line 27
    .line 28
    if-eq v2, v3, :cond_1

    .line 29
    .line 30
    const/4 v0, 0x3

    .line 31
    if-eq v2, v0, :cond_1

    .line 32
    .line 33
    :cond_0
    move-object v5, p0

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    invoke-virtual {p0}, Lr2/k;->j()F

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    iget v2, p0, Lr2/k;->c:F

    .line 40
    .line 41
    cmpg-float v0, v0, v2

    .line 42
    .line 43
    if-gez v0, :cond_0

    .line 44
    .line 45
    invoke-virtual {p0}, Lr2/k;->b()Z

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Lr2/k;->f()Landroid/graphics/Matrix;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {p0, v0}, Lr2/k;->e(Landroid/graphics/Matrix;)Landroid/graphics/RectF;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    if-eqz v0, :cond_0

    .line 57
    .line 58
    new-instance v4, Lr2/d;

    .line 59
    .line 60
    invoke-virtual {p0}, Lr2/k;->j()F

    .line 61
    .line 62
    .line 63
    move-result v6

    .line 64
    iget v7, p0, Lr2/k;->c:F

    .line 65
    .line 66
    invoke-virtual {v0}, Landroid/graphics/RectF;->centerX()F

    .line 67
    .line 68
    .line 69
    move-result v8

    .line 70
    invoke-virtual {v0}, Landroid/graphics/RectF;->centerY()F

    .line 71
    .line 72
    .line 73
    move-result v9

    .line 74
    move-object v5, p0

    .line 75
    invoke-direct/range {v4 .. v9}, Lr2/d;-><init>(Lr2/k;FFFF)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1, v4}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 79
    .line 80
    .line 81
    move p1, v3

    .line 82
    goto :goto_1

    .line 83
    :cond_2
    move-object v5, p0

    .line 84
    if-eqz v0, :cond_3

    .line 85
    .line 86
    invoke-interface {v0, v3}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 87
    .line 88
    .line 89
    :cond_3
    iget-object p1, v5, Lr2/k;->v:Lr2/e;

    .line 90
    .line 91
    if-eqz p1, :cond_4

    .line 92
    .line 93
    iget-object p1, p1, Lr2/e;->a:Lt2/a;

    .line 94
    .line 95
    iget-object p1, p1, Lt2/a;->b:Landroid/widget/OverScroller;

    .line 96
    .line 97
    invoke-virtual {p1, v3}, Landroid/widget/OverScroller;->forceFinished(Z)V

    .line 98
    .line 99
    .line 100
    const/4 p1, 0x0

    .line 101
    iput-object p1, v5, Lr2/k;->v:Lr2/e;

    .line 102
    .line 103
    :cond_4
    :goto_0
    move p1, v1

    .line 104
    :goto_1
    iget-object v0, v5, Lr2/k;->j:Ls2/b;

    .line 105
    .line 106
    if-eqz v0, :cond_8

    .line 107
    .line 108
    iget-object p1, v0, Ls2/b;->j:Landroid/view/ScaleGestureDetector;

    .line 109
    .line 110
    invoke-virtual {p1}, Landroid/view/ScaleGestureDetector;->isInProgress()Z

    .line 111
    .line 112
    .line 113
    move-result v2

    .line 114
    iget-boolean v4, v0, Ls2/b;->g:Z

    .line 115
    .line 116
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    :try_start_0
    iget-object v6, v0, Ls2/b;->j:Landroid/view/ScaleGestureDetector;

    .line 120
    .line 121
    invoke-virtual {v6, p2}, Landroid/view/ScaleGestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 122
    .line 123
    .line 124
    invoke-virtual {v0, p2}, Ls2/b;->d(Landroid/view/MotionEvent;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 125
    .line 126
    .line 127
    :catch_0
    if-nez v2, :cond_5

    .line 128
    .line 129
    invoke-virtual {p1}, Landroid/view/ScaleGestureDetector;->isInProgress()Z

    .line 130
    .line 131
    .line 132
    move-result p1

    .line 133
    if-nez p1, :cond_5

    .line 134
    .line 135
    move p1, v3

    .line 136
    goto :goto_2

    .line 137
    :cond_5
    move p1, v1

    .line 138
    :goto_2
    if-nez v4, :cond_6

    .line 139
    .line 140
    iget-boolean v0, v0, Ls2/b;->g:Z

    .line 141
    .line 142
    if-nez v0, :cond_6

    .line 143
    .line 144
    move v0, v3

    .line 145
    goto :goto_3

    .line 146
    :cond_6
    move v0, v1

    .line 147
    :goto_3
    if-eqz p1, :cond_7

    .line 148
    .line 149
    if-eqz v0, :cond_7

    .line 150
    .line 151
    move v1, v3

    .line 152
    :cond_7
    iput-boolean v1, v5, Lr2/k;->g:Z

    .line 153
    .line 154
    move p1, v3

    .line 155
    :cond_8
    iget-object v0, v5, Lr2/k;->i:Landroid/view/GestureDetector;

    .line 156
    .line 157
    if-eqz v0, :cond_9

    .line 158
    .line 159
    invoke-virtual {v0, p2}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 160
    .line 161
    .line 162
    move-result p2

    .line 163
    if-eqz p2, :cond_9

    .line 164
    .line 165
    return v3

    .line 166
    :cond_9
    return p1

    .line 167
    :cond_a
    move-object v5, p0

    .line 168
    return v1
.end method

.method public final p(Landroid/graphics/drawable/Drawable;)V
    .locals 9

    .line 1
    invoke-virtual {p0}, Lr2/k;->g()Landroid/widget/ImageView;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_9

    .line 6
    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    goto/16 :goto_1

    .line 10
    .line 11
    :cond_0
    invoke-static {v0}, Lr2/k;->i(Landroid/widget/ImageView;)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    int-to-float v1, v1

    .line 16
    invoke-static {v0}, Lr2/k;->h(Landroid/widget/ImageView;)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    int-to-float v0, v0

    .line 21
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    iget-object v3, p0, Lr2/k;->k:Landroid/graphics/Matrix;

    .line 30
    .line 31
    invoke-virtual {v3}, Landroid/graphics/Matrix;->reset()V

    .line 32
    .line 33
    .line 34
    int-to-float v2, v2

    .line 35
    div-float v4, v1, v2

    .line 36
    .line 37
    int-to-float p1, p1

    .line 38
    div-float v5, v0, p1

    .line 39
    .line 40
    iget-object v6, p0, Lr2/k;->y:Landroid/widget/ImageView$ScaleType;

    .line 41
    .line 42
    sget-object v7, Landroid/widget/ImageView$ScaleType;->CENTER:Landroid/widget/ImageView$ScaleType;

    .line 43
    .line 44
    const/high16 v8, 0x40000000    # 2.0f

    .line 45
    .line 46
    if-ne v6, v7, :cond_1

    .line 47
    .line 48
    sub-float/2addr v1, v2

    .line 49
    div-float/2addr v1, v8

    .line 50
    sub-float/2addr v0, p1

    .line 51
    div-float/2addr v0, v8

    .line 52
    invoke-virtual {v3, v1, v0}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 53
    .line 54
    .line 55
    goto/16 :goto_0

    .line 56
    .line 57
    :cond_1
    sget-object v7, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    .line 58
    .line 59
    if-ne v6, v7, :cond_2

    .line 60
    .line 61
    invoke-static {v4, v5}, Ljava/lang/Math;->max(FF)F

    .line 62
    .line 63
    .line 64
    move-result v4

    .line 65
    invoke-virtual {v3, v4, v4}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 66
    .line 67
    .line 68
    mul-float/2addr v2, v4

    .line 69
    sub-float/2addr v1, v2

    .line 70
    div-float/2addr v1, v8

    .line 71
    invoke-static {p1, v4, v0, v8}, Landroidx/compose/material3/c;->a(FFFF)F

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    invoke-virtual {v3, v1, p1}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_2
    sget-object v7, Landroid/widget/ImageView$ScaleType;->CENTER_INSIDE:Landroid/widget/ImageView$ScaleType;

    .line 80
    .line 81
    if-ne v6, v7, :cond_3

    .line 82
    .line 83
    const/high16 v6, 0x3f800000    # 1.0f

    .line 84
    .line 85
    invoke-static {v4, v5}, Ljava/lang/Math;->min(FF)F

    .line 86
    .line 87
    .line 88
    move-result v4

    .line 89
    invoke-static {v6, v4}, Ljava/lang/Math;->min(FF)F

    .line 90
    .line 91
    .line 92
    move-result v4

    .line 93
    invoke-virtual {v3, v4, v4}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 94
    .line 95
    .line 96
    mul-float/2addr v2, v4

    .line 97
    sub-float/2addr v1, v2

    .line 98
    div-float/2addr v1, v8

    .line 99
    invoke-static {p1, v4, v0, v8}, Landroidx/compose/material3/c;->a(FFFF)F

    .line 100
    .line 101
    .line 102
    move-result p1

    .line 103
    invoke-virtual {v3, v1, p1}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 104
    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_3
    new-instance v4, Landroid/graphics/RectF;

    .line 108
    .line 109
    const/4 v5, 0x0

    .line 110
    invoke-direct {v4, v5, v5, v2, p1}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 111
    .line 112
    .line 113
    new-instance v6, Landroid/graphics/RectF;

    .line 114
    .line 115
    invoke-direct {v6, v5, v5, v1, v0}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 116
    .line 117
    .line 118
    float-to-int v0, v5

    .line 119
    rem-int/lit16 v0, v0, 0xb4

    .line 120
    .line 121
    if-eqz v0, :cond_4

    .line 122
    .line 123
    new-instance v4, Landroid/graphics/RectF;

    .line 124
    .line 125
    invoke-direct {v4, v5, v5, p1, v2}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 126
    .line 127
    .line 128
    :cond_4
    sget-object p1, Lr2/c;->a:[I

    .line 129
    .line 130
    iget-object v0, p0, Lr2/k;->y:Landroid/widget/ImageView$ScaleType;

    .line 131
    .line 132
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    aget p1, p1, v0

    .line 137
    .line 138
    const/4 v0, 0x2

    .line 139
    if-eq p1, v0, :cond_8

    .line 140
    .line 141
    const/4 v0, 0x3

    .line 142
    if-eq p1, v0, :cond_7

    .line 143
    .line 144
    const/4 v0, 0x4

    .line 145
    if-eq p1, v0, :cond_6

    .line 146
    .line 147
    const/4 v0, 0x5

    .line 148
    if-eq p1, v0, :cond_5

    .line 149
    .line 150
    goto :goto_0

    .line 151
    :cond_5
    sget-object p1, Landroid/graphics/Matrix$ScaleToFit;->FILL:Landroid/graphics/Matrix$ScaleToFit;

    .line 152
    .line 153
    invoke-virtual {v3, v4, v6, p1}, Landroid/graphics/Matrix;->setRectToRect(Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/Matrix$ScaleToFit;)Z

    .line 154
    .line 155
    .line 156
    goto :goto_0

    .line 157
    :cond_6
    sget-object p1, Landroid/graphics/Matrix$ScaleToFit;->CENTER:Landroid/graphics/Matrix$ScaleToFit;

    .line 158
    .line 159
    invoke-virtual {v3, v4, v6, p1}, Landroid/graphics/Matrix;->setRectToRect(Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/Matrix$ScaleToFit;)Z

    .line 160
    .line 161
    .line 162
    goto :goto_0

    .line 163
    :cond_7
    sget-object p1, Landroid/graphics/Matrix$ScaleToFit;->END:Landroid/graphics/Matrix$ScaleToFit;

    .line 164
    .line 165
    invoke-virtual {v3, v4, v6, p1}, Landroid/graphics/Matrix;->setRectToRect(Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/Matrix$ScaleToFit;)Z

    .line 166
    .line 167
    .line 168
    goto :goto_0

    .line 169
    :cond_8
    sget-object p1, Landroid/graphics/Matrix$ScaleToFit;->START:Landroid/graphics/Matrix$ScaleToFit;

    .line 170
    .line 171
    invoke-virtual {v3, v4, v6, p1}, Landroid/graphics/Matrix;->setRectToRect(Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/Matrix$ScaleToFit;)Z

    .line 172
    .line 173
    .line 174
    :goto_0
    invoke-virtual {p0}, Lr2/k;->l()V

    .line 175
    .line 176
    .line 177
    :cond_9
    :goto_1
    return-void
.end method
