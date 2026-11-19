.class public final Lw7/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lw7/c;

.field public final b:Landroid/graphics/Matrix;

.field public final c:Ly7/d;

.field public d:Landroid/graphics/Bitmap;

.field public e:Landroid/graphics/RectF;

.field public f:Landroid/graphics/Matrix;

.field public final g:Ljava/util/ArrayList;

.field public h:Landroid/graphics/Path;

.field public i:Lkotlin/jvm/functions/Function0;

.field public final j:Landroid/graphics/Path;

.field public final k:Landroid/graphics/Matrix;

.field public final l:[F

.field public final m:Landroid/graphics/Paint;

.field public final n:Landroid/graphics/Paint;


# direct methods
.method public constructor <init>(Lw7/c;Landroid/graphics/Matrix;Ly7/d;)V
    .locals 3

    .line 1
    const-string v0, "mBoardConfig"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "mCameraMatrix"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "mDrawView"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lw7/b;->a:Lw7/c;

    .line 20
    .line 21
    iput-object p2, p0, Lw7/b;->b:Landroid/graphics/Matrix;

    .line 22
    .line 23
    iput-object p3, p0, Lw7/b;->c:Ly7/d;

    .line 24
    .line 25
    new-instance p1, Landroid/graphics/RectF;

    .line 26
    .line 27
    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Lw7/b;->e:Landroid/graphics/RectF;

    .line 31
    .line 32
    new-instance p1, Landroid/graphics/Matrix;

    .line 33
    .line 34
    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object p1, p0, Lw7/b;->f:Landroid/graphics/Matrix;

    .line 38
    .line 39
    new-instance p1, Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 42
    .line 43
    .line 44
    iput-object p1, p0, Lw7/b;->g:Ljava/util/ArrayList;

    .line 45
    .line 46
    new-instance p1, Landroid/graphics/Path;

    .line 47
    .line 48
    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    .line 49
    .line 50
    .line 51
    iput-object p1, p0, Lw7/b;->h:Landroid/graphics/Path;

    .line 52
    .line 53
    new-instance p1, Landroid/graphics/Path;

    .line 54
    .line 55
    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    .line 56
    .line 57
    .line 58
    iput-object p1, p0, Lw7/b;->j:Landroid/graphics/Path;

    .line 59
    .line 60
    new-instance p1, Landroid/graphics/Matrix;

    .line 61
    .line 62
    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    .line 63
    .line 64
    .line 65
    iput-object p1, p0, Lw7/b;->k:Landroid/graphics/Matrix;

    .line 66
    .line 67
    const/16 p1, 0x9

    .line 68
    .line 69
    new-array p2, p1, [F

    .line 70
    .line 71
    const/4 p3, 0x0

    .line 72
    :goto_0
    if-ge p3, p1, :cond_0

    .line 73
    .line 74
    const/4 v0, 0x0

    .line 75
    aput v0, p2, p3

    .line 76
    .line 77
    add-int/lit8 p3, p3, 0x1

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_0
    iput-object p2, p0, Lw7/b;->l:[F

    .line 81
    .line 82
    new-instance p1, Landroid/graphics/Paint;

    .line 83
    .line 84
    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    .line 85
    .line 86
    .line 87
    sget-object p2, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    .line 88
    .line 89
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 90
    .line 91
    .line 92
    sget-object p3, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    .line 93
    .line 94
    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 95
    .line 96
    .line 97
    const/4 v0, 0x1

    .line 98
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setDither(Z)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 102
    .line 103
    .line 104
    new-instance v1, Landroid/graphics/PorterDuffXfermode;

    .line 105
    .line 106
    sget-object v2, Landroid/graphics/PorterDuff$Mode;->SRC_OVER:Landroid/graphics/PorterDuff$Mode;

    .line 107
    .line 108
    invoke-direct {v1, v2}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 112
    .line 113
    .line 114
    iput-object p1, p0, Lw7/b;->m:Landroid/graphics/Paint;

    .line 115
    .line 116
    new-instance p1, Landroid/graphics/Paint;

    .line 117
    .line 118
    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    .line 119
    .line 120
    .line 121
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setDither(Z)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 131
    .line 132
    .line 133
    new-instance p2, Landroid/graphics/PorterDuffXfermode;

    .line 134
    .line 135
    invoke-direct {p2, v2}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 139
    .line 140
    .line 141
    iput-object p1, p0, Lw7/b;->n:Landroid/graphics/Paint;

    .line 142
    .line 143
    return-void
.end method

.method public static synthetic c(Lw7/b;Ljava/util/List;Landroid/graphics/Paint;Landroid/graphics/Path;ILjava/lang/Object;)Lx7/j;
    .locals 0

    .line 1
    and-int/lit8 p4, p4, 0x4

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    const/4 p3, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lw7/b;->b(Ljava/util/List;Landroid/graphics/Paint;Landroid/graphics/Path;)Lx7/j;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method


# virtual methods
.method public final a()Landroid/graphics/Bitmap;
    .locals 8

    .line 1
    iget-object v0, p0, Lw7/b;->e:Landroid/graphics/RectF;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lw7/b;->e:Landroid/graphics/RectF;

    .line 8
    .line 9
    invoke-virtual {v1}, Landroid/graphics/RectF;->height()F

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    :try_start_0
    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 14
    .line 15
    float-to-int v0, v0

    .line 16
    float-to-int v1, v1

    .line 17
    sget-object v2, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    .line 18
    .line 19
    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    goto :goto_0

    .line 28
    :catchall_0
    move-exception v0

    .line 29
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 30
    .line 31
    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    :goto_0
    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    const/4 v2, 0x0

    .line 44
    if-eqz v1, :cond_0

    .line 45
    .line 46
    move-object v0, v2

    .line 47
    :cond_0
    check-cast v0, Landroid/graphics/Bitmap;

    .line 48
    .line 49
    if-eqz v0, :cond_3

    .line 50
    .line 51
    new-instance v1, Landroid/graphics/Canvas;

    .line 52
    .line 53
    invoke-direct {v1, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 54
    .line 55
    .line 56
    iget-object v3, p0, Lw7/b;->d:Landroid/graphics/Bitmap;

    .line 57
    .line 58
    iget-object v4, p0, Lw7/b;->k:Landroid/graphics/Matrix;

    .line 59
    .line 60
    iget-object v5, p0, Lw7/b;->f:Landroid/graphics/Matrix;

    .line 61
    .line 62
    invoke-virtual {v4, v5}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 63
    .line 64
    .line 65
    if-eqz v3, :cond_1

    .line 66
    .line 67
    iget-object v4, p0, Lw7/b;->k:Landroid/graphics/Matrix;

    .line 68
    .line 69
    invoke-virtual {v1, v3, v4, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    .line 70
    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_1
    const/4 v2, -0x1

    .line 74
    invoke-virtual {v1, v2}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 75
    .line 76
    .line 77
    :goto_1
    iget-object v2, p0, Lw7/b;->g:Ljava/util/ArrayList;

    .line 78
    .line 79
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    const/4 v4, 0x0

    .line 84
    :goto_2
    if-ge v4, v3, :cond_2

    .line 85
    .line 86
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    add-int/lit8 v4, v4, 0x1

    .line 91
    .line 92
    check-cast v5, Lx7/j;

    .line 93
    .line 94
    iget-object v6, p0, Lw7/b;->j:Landroid/graphics/Path;

    .line 95
    .line 96
    invoke-virtual {v5}, Lx7/j;->b()Landroid/graphics/Path;

    .line 97
    .line 98
    .line 99
    move-result-object v7

    .line 100
    invoke-virtual {v6, v7}, Landroid/graphics/Path;->set(Landroid/graphics/Path;)V

    .line 101
    .line 102
    .line 103
    iget-object v6, p0, Lw7/b;->j:Landroid/graphics/Path;

    .line 104
    .line 105
    invoke-virtual {v5}, Lx7/j;->a()Landroid/graphics/Paint;

    .line 106
    .line 107
    .line 108
    move-result-object v5

    .line 109
    invoke-virtual {v1, v6, v5}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 110
    .line 111
    .line 112
    goto :goto_2

    .line 113
    :cond_2
    return-object v0

    .line 114
    :cond_3
    new-instance v0, Ljava/lang/Exception;

    .line 115
    .line 116
    const-string v1, "view have not init"

    .line 117
    .line 118
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    throw v0
.end method

.method public final b(Ljava/util/List;Landroid/graphics/Paint;Landroid/graphics/Path;)Lx7/j;
    .locals 11

    .line 1
    new-instance v0, Landroid/graphics/Path;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x2

    .line 7
    const/4 v2, 0x1

    .line 8
    if-eqz p3, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0, p3}, Landroid/graphics/Path;->set(Landroid/graphics/Path;)V

    .line 11
    .line 12
    .line 13
    goto :goto_2

    .line 14
    :cond_0
    new-instance p3, Landroid/graphics/PointF;

    .line 15
    .line 16
    invoke-direct {p3}, Landroid/graphics/PointF;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    const/4 v4, 0x0

    .line 24
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    if-eqz v5, :cond_4

    .line 29
    .line 30
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    add-int/lit8 v6, v4, 0x1

    .line 35
    .line 36
    if-gez v4, :cond_1

    .line 37
    .line 38
    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    .line 39
    .line 40
    .line 41
    :cond_1
    check-cast v5, Landroid/graphics/PointF;

    .line 42
    .line 43
    if-nez v4, :cond_2

    .line 44
    .line 45
    iget v4, v5, Landroid/graphics/PointF;->x:F

    .line 46
    .line 47
    iget v7, v5, Landroid/graphics/PointF;->y:F

    .line 48
    .line 49
    invoke-virtual {v0, v4, v7}, Landroid/graphics/Path;->moveTo(FF)V

    .line 50
    .line 51
    .line 52
    iget v4, v5, Landroid/graphics/PointF;->x:F

    .line 53
    .line 54
    iget v7, v5, Landroid/graphics/PointF;->y:F

    .line 55
    .line 56
    invoke-virtual {v0, v4, v7}, Landroid/graphics/Path;->lineTo(FF)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p3, v5}, Landroid/graphics/PointF;->set(Landroid/graphics/PointF;)V

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_2
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 64
    .line 65
    .line 66
    move-result v7

    .line 67
    sub-int/2addr v7, v2

    .line 68
    if-ne v4, v7, :cond_3

    .line 69
    .line 70
    iget v4, p3, Landroid/graphics/PointF;->x:F

    .line 71
    .line 72
    iget v7, p3, Landroid/graphics/PointF;->y:F

    .line 73
    .line 74
    iget v8, v5, Landroid/graphics/PointF;->x:F

    .line 75
    .line 76
    add-float/2addr v8, v4

    .line 77
    int-to-float v9, v1

    .line 78
    div-float/2addr v8, v9

    .line 79
    iget v10, v5, Landroid/graphics/PointF;->y:F

    .line 80
    .line 81
    add-float/2addr v10, v7

    .line 82
    div-float/2addr v10, v9

    .line 83
    invoke-virtual {v0, v4, v7, v8, v10}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 84
    .line 85
    .line 86
    iget v4, v5, Landroid/graphics/PointF;->x:F

    .line 87
    .line 88
    iget v5, v5, Landroid/graphics/PointF;->y:F

    .line 89
    .line 90
    invoke-virtual {v0, v4, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 91
    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_3
    iget v4, p3, Landroid/graphics/PointF;->x:F

    .line 95
    .line 96
    iget v7, p3, Landroid/graphics/PointF;->y:F

    .line 97
    .line 98
    iget v8, v5, Landroid/graphics/PointF;->x:F

    .line 99
    .line 100
    add-float/2addr v8, v4

    .line 101
    int-to-float v9, v1

    .line 102
    div-float/2addr v8, v9

    .line 103
    iget v10, v5, Landroid/graphics/PointF;->y:F

    .line 104
    .line 105
    add-float/2addr v10, v7

    .line 106
    div-float/2addr v10, v9

    .line 107
    invoke-virtual {v0, v4, v7, v8, v10}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p3, v5}, Landroid/graphics/PointF;->set(Landroid/graphics/PointF;)V

    .line 111
    .line 112
    .line 113
    :goto_1
    move v4, v6

    .line 114
    goto :goto_0

    .line 115
    :cond_4
    :goto_2
    new-instance p3, Landroid/graphics/Paint;

    .line 116
    .line 117
    invoke-direct {p3, p2}, Landroid/graphics/Paint;-><init>(Landroid/graphics/Paint;)V

    .line 118
    .line 119
    .line 120
    new-instance p2, Landroid/graphics/RectF;

    .line 121
    .line 122
    invoke-direct {p2}, Landroid/graphics/RectF;-><init>()V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0, p2, v2}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    .line 126
    .line 127
    .line 128
    iget-object v2, p0, Lw7/b;->b:Landroid/graphics/Matrix;

    .line 129
    .line 130
    invoke-static {v2}, Le5/m;->b(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    iget-object v3, p0, Lw7/b;->a:Lw7/c;

    .line 135
    .line 136
    invoke-virtual {v3}, Lw7/c;->d()F

    .line 137
    .line 138
    .line 139
    move-result v3

    .line 140
    invoke-virtual {v2, v3}, Landroid/graphics/Matrix;->mapRadius(F)F

    .line 141
    .line 142
    .line 143
    move-result v2

    .line 144
    invoke-virtual {p2}, Landroid/graphics/RectF;->width()F

    .line 145
    .line 146
    .line 147
    move-result v3

    .line 148
    int-to-float v1, v1

    .line 149
    mul-float/2addr v1, v2

    .line 150
    cmpg-float v3, v3, v1

    .line 151
    .line 152
    if-gez v3, :cond_5

    .line 153
    .line 154
    iget v3, p2, Landroid/graphics/RectF;->left:F

    .line 155
    .line 156
    sub-float/2addr v3, v2

    .line 157
    iput v3, p2, Landroid/graphics/RectF;->left:F

    .line 158
    .line 159
    iget v3, p2, Landroid/graphics/RectF;->right:F

    .line 160
    .line 161
    add-float/2addr v3, v2

    .line 162
    iput v3, p2, Landroid/graphics/RectF;->right:F

    .line 163
    .line 164
    :cond_5
    invoke-virtual {p2}, Landroid/graphics/RectF;->height()F

    .line 165
    .line 166
    .line 167
    move-result v3

    .line 168
    cmpg-float v1, v3, v1

    .line 169
    .line 170
    if-gez v1, :cond_6

    .line 171
    .line 172
    iget v1, p2, Landroid/graphics/RectF;->top:F

    .line 173
    .line 174
    sub-float/2addr v1, v2

    .line 175
    iput v1, p2, Landroid/graphics/RectF;->top:F

    .line 176
    .line 177
    iget v1, p2, Landroid/graphics/RectF;->bottom:F

    .line 178
    .line 179
    add-float/2addr v1, v2

    .line 180
    iput v1, p2, Landroid/graphics/RectF;->bottom:F

    .line 181
    .line 182
    :cond_6
    new-instance v1, Ljava/util/ArrayList;

    .line 183
    .line 184
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 188
    .line 189
    .line 190
    new-instance p1, Lx7/j;

    .line 191
    .line 192
    invoke-direct {p1, v0, p3, p2, v1}, Lx7/j;-><init>(Landroid/graphics/Path;Landroid/graphics/Paint;Landroid/graphics/RectF;Ljava/util/List;)V

    .line 193
    .line 194
    .line 195
    return-object p1
.end method

.method public final d(Landroid/graphics/PointF;Ljava/util/List;F)Z
    .locals 11

    .line 1
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    sub-int/2addr v0, v1

    .line 7
    const/4 v2, 0x0

    .line 8
    move v3, v2

    .line 9
    :cond_0
    if-ge v3, v0, :cond_1

    .line 10
    .line 11
    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    check-cast v4, Landroid/graphics/PointF;

    .line 16
    .line 17
    iget v5, v4, Landroid/graphics/PointF;->x:F

    .line 18
    .line 19
    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    check-cast v4, Landroid/graphics/PointF;

    .line 24
    .line 25
    iget v6, v4, Landroid/graphics/PointF;->y:F

    .line 26
    .line 27
    add-int/lit8 v3, v3, 0x1

    .line 28
    .line 29
    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    check-cast v4, Landroid/graphics/PointF;

    .line 34
    .line 35
    iget v7, v4, Landroid/graphics/PointF;->x:F

    .line 36
    .line 37
    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    check-cast v4, Landroid/graphics/PointF;

    .line 42
    .line 43
    iget v8, v4, Landroid/graphics/PointF;->y:F

    .line 44
    .line 45
    iget v9, p1, Landroid/graphics/PointF;->x:F

    .line 46
    .line 47
    iget v10, p1, Landroid/graphics/PointF;->y:F

    .line 48
    .line 49
    invoke-static/range {v5 .. v10}, Lb5/a;->b(FFFFFF)F

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    cmpg-float v4, v4, p3

    .line 54
    .line 55
    if-gtz v4, :cond_0

    .line 56
    .line 57
    return v1

    .line 58
    :cond_1
    return v2
.end method

.method public final e()V
    .locals 1

    .line 1
    iget-object v0, p0, Lw7/b;->g:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lw7/b;->i:Lkotlin/jvm/functions/Function0;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lw7/b;->c:Ly7/d;

    .line 14
    .line 15
    invoke-interface {v0}, Ly7/d;->c()V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final f(Landroid/graphics/Canvas;)V
    .locals 3

    .line 1
    const-string v0, "canvas"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lw7/b;->d:Landroid/graphics/Bitmap;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v1, p0, Lw7/b;->k:Landroid/graphics/Matrix;

    .line 11
    .line 12
    iget-object v2, p0, Lw7/b;->f:Landroid/graphics/Matrix;

    .line 13
    .line 14
    invoke-virtual {v1, v2}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 15
    .line 16
    .line 17
    iget-object v1, p0, Lw7/b;->k:Landroid/graphics/Matrix;

    .line 18
    .line 19
    iget-object v2, p0, Lw7/b;->b:Landroid/graphics/Matrix;

    .line 20
    .line 21
    invoke-virtual {v1, v2}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 22
    .line 23
    .line 24
    sget-object v1, Le5/d;->a:Le5/d;

    .line 25
    .line 26
    iget-object v2, p0, Lw7/b;->k:Landroid/graphics/Matrix;

    .line 27
    .line 28
    invoke-virtual {v1, p1, v0, v2}, Le5/d;->a(Landroid/graphics/Canvas;Landroid/graphics/Bitmap;Landroid/graphics/Matrix;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_0
    const/4 v0, -0x1

    .line 33
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public final g(Landroid/graphics/Canvas;)V
    .locals 6

    .line 1
    const-string v0, "canvas"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lw7/b;->k:Landroid/graphics/Matrix;

    .line 7
    .line 8
    iget-object v1, p0, Lw7/b;->b:Landroid/graphics/Matrix;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lw7/b;->g:Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const/4 v2, 0x0

    .line 20
    :goto_0
    if-ge v2, v1, :cond_0

    .line 21
    .line 22
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    add-int/lit8 v2, v2, 0x1

    .line 27
    .line 28
    check-cast v3, Lx7/j;

    .line 29
    .line 30
    iget-object v4, p0, Lw7/b;->j:Landroid/graphics/Path;

    .line 31
    .line 32
    invoke-virtual {v3}, Lx7/j;->b()Landroid/graphics/Path;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    invoke-virtual {v4, v5}, Landroid/graphics/Path;->set(Landroid/graphics/Path;)V

    .line 37
    .line 38
    .line 39
    iget-object v4, p0, Lw7/b;->j:Landroid/graphics/Path;

    .line 40
    .line 41
    iget-object v5, p0, Lw7/b;->k:Landroid/graphics/Matrix;

    .line 42
    .line 43
    invoke-virtual {v4, v5}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    .line 44
    .line 45
    .line 46
    iget-object v4, p0, Lw7/b;->j:Landroid/graphics/Path;

    .line 47
    .line 48
    invoke-virtual {v3}, Lx7/j;->a()Landroid/graphics/Paint;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    invoke-virtual {p1, v4, v3}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    return-void
.end method

.method public final h(Landroid/graphics/Canvas;)V
    .locals 2

    .line 1
    const-string v0, "canvas"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lw7/b;->h:Landroid/graphics/Path;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/graphics/Path;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lw7/b;->h:Landroid/graphics/Path;

    .line 15
    .line 16
    iget-object v1, p0, Lw7/b;->n:Landroid/graphics/Paint;

    .line 17
    .line 18
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method public final i()Landroid/graphics/Bitmap;
    .locals 1

    .line 1
    iget-object v0, p0, Lw7/b;->d:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    return-object v0
.end method

.method public final j()Ljava/util/ArrayList;
    .locals 1

    .line 1
    iget-object v0, p0, Lw7/b;->g:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object v0
.end method

.method public final k(Landroid/graphics/Matrix;)V
    .locals 13

    .line 1
    const-string v0, "matrix"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lw7/b;->c:Ly7/d;

    .line 7
    .line 8
    const-string v1, "null cannot be cast to non-null type android.view.View"

    .line 9
    .line 10
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    check-cast v0, Landroid/view/View;

    .line 14
    .line 15
    invoke-virtual {p1}, Landroid/graphics/Matrix;->toShortString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    new-instance v1, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    .line 23
    .line 24
    const-string v2, "before -> "

    .line 25
    .line 26
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    const-string v1, "DrawControl"

    .line 37
    .line 38
    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 39
    .line 40
    .line 41
    iget-object v0, p0, Lw7/b;->l:[F

    .line 42
    .line 43
    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->getValues([F)V

    .line 44
    .line 45
    .line 46
    iget-object v0, p0, Lw7/b;->l:[F

    .line 47
    .line 48
    const/4 v2, 0x0

    .line 49
    aget v3, v0, v2

    .line 50
    .line 51
    const/4 v4, 0x4

    .line 52
    aget v5, v0, v4

    .line 53
    .line 54
    const/4 v6, 0x2

    .line 55
    aget v7, v0, v6

    .line 56
    .line 57
    const/4 v8, 0x5

    .line 58
    aget v0, v0, v8

    .line 59
    .line 60
    iget-object v9, p0, Lw7/b;->a:Lw7/c;

    .line 61
    .line 62
    invoke-virtual {v9}, Lw7/c;->e()F

    .line 63
    .line 64
    .line 65
    move-result v9

    .line 66
    const/high16 v10, 0x3f800000    # 1.0f

    .line 67
    .line 68
    cmpl-float v9, v9, v10

    .line 69
    .line 70
    if-lez v9, :cond_0

    .line 71
    .line 72
    iget-object v9, p0, Lw7/b;->a:Lw7/c;

    .line 73
    .line 74
    invoke-virtual {v9}, Lw7/c;->e()F

    .line 75
    .line 76
    .line 77
    move-result v9

    .line 78
    goto :goto_0

    .line 79
    :cond_0
    move v9, v10

    .line 80
    :goto_0
    cmpg-float v11, v3, v10

    .line 81
    .line 82
    if-gez v11, :cond_1

    .line 83
    .line 84
    iget-object v11, p0, Lw7/b;->l:[F

    .line 85
    .line 86
    aput v10, v11, v2

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_1
    cmpl-float v11, v3, v9

    .line 90
    .line 91
    if-lez v11, :cond_2

    .line 92
    .line 93
    iget-object v11, p0, Lw7/b;->l:[F

    .line 94
    .line 95
    aput v9, v11, v2

    .line 96
    .line 97
    :cond_2
    :goto_1
    cmpg-float v11, v5, v10

    .line 98
    .line 99
    if-gez v11, :cond_3

    .line 100
    .line 101
    iget-object v9, p0, Lw7/b;->l:[F

    .line 102
    .line 103
    aput v10, v9, v4

    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_3
    cmpl-float v10, v3, v9

    .line 107
    .line 108
    if-lez v10, :cond_4

    .line 109
    .line 110
    iget-object v10, p0, Lw7/b;->l:[F

    .line 111
    .line 112
    aput v9, v10, v4

    .line 113
    .line 114
    :cond_4
    :goto_2
    const/4 v9, 0x0

    .line 115
    cmpl-float v10, v7, v9

    .line 116
    .line 117
    const/4 v11, 0x1

    .line 118
    if-lez v10, :cond_5

    .line 119
    .line 120
    iget-object v2, p0, Lw7/b;->l:[F

    .line 121
    .line 122
    aput v9, v2, v6

    .line 123
    .line 124
    goto/16 :goto_3

    .line 125
    .line 126
    :cond_5
    iget-object v10, p0, Lw7/b;->e:Landroid/graphics/RectF;

    .line 127
    .line 128
    invoke-virtual {v10}, Landroid/graphics/RectF;->width()F

    .line 129
    .line 130
    .line 131
    move-result v10

    .line 132
    mul-float/2addr v10, v3

    .line 133
    iget-object v12, p0, Lw7/b;->c:Ly7/d;

    .line 134
    .line 135
    check-cast v12, Landroid/view/View;

    .line 136
    .line 137
    invoke-virtual {v12}, Landroid/view/View;->getWidth()I

    .line 138
    .line 139
    .line 140
    move-result v12

    .line 141
    int-to-float v12, v12

    .line 142
    sub-float/2addr v10, v12

    .line 143
    neg-float v10, v10

    .line 144
    cmpg-float v10, v7, v10

    .line 145
    .line 146
    if-gez v10, :cond_6

    .line 147
    .line 148
    iget-object v3, p0, Lw7/b;->l:[F

    .line 149
    .line 150
    iget-object v7, p0, Lw7/b;->e:Landroid/graphics/RectF;

    .line 151
    .line 152
    invoke-virtual {v7}, Landroid/graphics/RectF;->width()F

    .line 153
    .line 154
    .line 155
    move-result v7

    .line 156
    iget-object v10, p0, Lw7/b;->l:[F

    .line 157
    .line 158
    aget v2, v10, v2

    .line 159
    .line 160
    mul-float/2addr v7, v2

    .line 161
    iget-object v2, p0, Lw7/b;->c:Ly7/d;

    .line 162
    .line 163
    check-cast v2, Landroid/view/View;

    .line 164
    .line 165
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    .line 166
    .line 167
    .line 168
    move-result v2

    .line 169
    int-to-float v2, v2

    .line 170
    sub-float/2addr v7, v2

    .line 171
    neg-float v2, v7

    .line 172
    aput v2, v3, v6

    .line 173
    .line 174
    goto :goto_3

    .line 175
    :cond_6
    iget-object v10, p0, Lw7/b;->e:Landroid/graphics/RectF;

    .line 176
    .line 177
    invoke-virtual {v10}, Landroid/graphics/RectF;->width()F

    .line 178
    .line 179
    .line 180
    move-result v10

    .line 181
    mul-float/2addr v10, v3

    .line 182
    iget-object v12, p0, Lw7/b;->c:Ly7/d;

    .line 183
    .line 184
    check-cast v12, Landroid/view/View;

    .line 185
    .line 186
    invoke-virtual {v12}, Landroid/view/View;->getWidth()I

    .line 187
    .line 188
    .line 189
    move-result v12

    .line 190
    int-to-float v12, v12

    .line 191
    cmpg-float v10, v10, v12

    .line 192
    .line 193
    if-nez v10, :cond_7

    .line 194
    .line 195
    iget-object v2, p0, Lw7/b;->l:[F

    .line 196
    .line 197
    aput v9, v2, v6

    .line 198
    .line 199
    goto :goto_3

    .line 200
    :cond_7
    int-to-float v10, v11

    .line 201
    iget-object v12, p0, Lw7/b;->e:Landroid/graphics/RectF;

    .line 202
    .line 203
    invoke-virtual {v12}, Landroid/graphics/RectF;->width()F

    .line 204
    .line 205
    .line 206
    move-result v12

    .line 207
    mul-float/2addr v12, v3

    .line 208
    iget-object v3, p0, Lw7/b;->c:Ly7/d;

    .line 209
    .line 210
    check-cast v3, Landroid/view/View;

    .line 211
    .line 212
    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    .line 213
    .line 214
    .line 215
    move-result v3

    .line 216
    int-to-float v3, v3

    .line 217
    sub-float/2addr v12, v3

    .line 218
    div-float/2addr v7, v12

    .line 219
    add-float/2addr v7, v10

    .line 220
    iget-object v3, p0, Lw7/b;->l:[F

    .line 221
    .line 222
    sub-float/2addr v7, v10

    .line 223
    iget-object v10, p0, Lw7/b;->e:Landroid/graphics/RectF;

    .line 224
    .line 225
    invoke-virtual {v10}, Landroid/graphics/RectF;->width()F

    .line 226
    .line 227
    .line 228
    move-result v10

    .line 229
    iget-object v12, p0, Lw7/b;->l:[F

    .line 230
    .line 231
    aget v2, v12, v2

    .line 232
    .line 233
    mul-float/2addr v10, v2

    .line 234
    iget-object v2, p0, Lw7/b;->c:Ly7/d;

    .line 235
    .line 236
    check-cast v2, Landroid/view/View;

    .line 237
    .line 238
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    .line 239
    .line 240
    .line 241
    move-result v2

    .line 242
    int-to-float v2, v2

    .line 243
    sub-float/2addr v10, v2

    .line 244
    mul-float/2addr v7, v10

    .line 245
    aput v7, v3, v6

    .line 246
    .line 247
    :goto_3
    cmpl-float v2, v0, v9

    .line 248
    .line 249
    if-lez v2, :cond_8

    .line 250
    .line 251
    iget-object v0, p0, Lw7/b;->l:[F

    .line 252
    .line 253
    aput v9, v0, v8

    .line 254
    .line 255
    goto/16 :goto_4

    .line 256
    .line 257
    :cond_8
    iget-object v2, p0, Lw7/b;->e:Landroid/graphics/RectF;

    .line 258
    .line 259
    invoke-virtual {v2}, Landroid/graphics/RectF;->height()F

    .line 260
    .line 261
    .line 262
    move-result v2

    .line 263
    mul-float/2addr v2, v5

    .line 264
    iget-object v3, p0, Lw7/b;->c:Ly7/d;

    .line 265
    .line 266
    check-cast v3, Landroid/view/View;

    .line 267
    .line 268
    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    .line 269
    .line 270
    .line 271
    move-result v3

    .line 272
    int-to-float v3, v3

    .line 273
    sub-float/2addr v2, v3

    .line 274
    neg-float v2, v2

    .line 275
    cmpg-float v2, v0, v2

    .line 276
    .line 277
    if-gez v2, :cond_9

    .line 278
    .line 279
    iget-object v0, p0, Lw7/b;->l:[F

    .line 280
    .line 281
    iget-object v2, p0, Lw7/b;->e:Landroid/graphics/RectF;

    .line 282
    .line 283
    invoke-virtual {v2}, Landroid/graphics/RectF;->height()F

    .line 284
    .line 285
    .line 286
    move-result v2

    .line 287
    iget-object v3, p0, Lw7/b;->l:[F

    .line 288
    .line 289
    aget v3, v3, v4

    .line 290
    .line 291
    mul-float/2addr v2, v3

    .line 292
    iget-object v3, p0, Lw7/b;->c:Ly7/d;

    .line 293
    .line 294
    check-cast v3, Landroid/view/View;

    .line 295
    .line 296
    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    .line 297
    .line 298
    .line 299
    move-result v3

    .line 300
    int-to-float v3, v3

    .line 301
    sub-float/2addr v2, v3

    .line 302
    neg-float v2, v2

    .line 303
    aput v2, v0, v8

    .line 304
    .line 305
    goto :goto_4

    .line 306
    :cond_9
    iget-object v2, p0, Lw7/b;->e:Landroid/graphics/RectF;

    .line 307
    .line 308
    invoke-virtual {v2}, Landroid/graphics/RectF;->height()F

    .line 309
    .line 310
    .line 311
    move-result v2

    .line 312
    mul-float/2addr v2, v5

    .line 313
    iget-object v3, p0, Lw7/b;->c:Ly7/d;

    .line 314
    .line 315
    check-cast v3, Landroid/view/View;

    .line 316
    .line 317
    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    .line 318
    .line 319
    .line 320
    move-result v3

    .line 321
    int-to-float v3, v3

    .line 322
    cmpg-float v2, v2, v3

    .line 323
    .line 324
    if-nez v2, :cond_a

    .line 325
    .line 326
    iget-object v0, p0, Lw7/b;->l:[F

    .line 327
    .line 328
    aput v9, v0, v8

    .line 329
    .line 330
    goto :goto_4

    .line 331
    :cond_a
    int-to-float v2, v11

    .line 332
    iget-object v3, p0, Lw7/b;->e:Landroid/graphics/RectF;

    .line 333
    .line 334
    invoke-virtual {v3}, Landroid/graphics/RectF;->height()F

    .line 335
    .line 336
    .line 337
    move-result v3

    .line 338
    mul-float/2addr v3, v5

    .line 339
    iget-object v5, p0, Lw7/b;->c:Ly7/d;

    .line 340
    .line 341
    check-cast v5, Landroid/view/View;

    .line 342
    .line 343
    invoke-virtual {v5}, Landroid/view/View;->getHeight()I

    .line 344
    .line 345
    .line 346
    move-result v5

    .line 347
    int-to-float v5, v5

    .line 348
    sub-float/2addr v3, v5

    .line 349
    div-float/2addr v0, v3

    .line 350
    add-float/2addr v0, v2

    .line 351
    iget-object v3, p0, Lw7/b;->l:[F

    .line 352
    .line 353
    sub-float/2addr v0, v2

    .line 354
    iget-object v2, p0, Lw7/b;->e:Landroid/graphics/RectF;

    .line 355
    .line 356
    invoke-virtual {v2}, Landroid/graphics/RectF;->height()F

    .line 357
    .line 358
    .line 359
    move-result v2

    .line 360
    iget-object v5, p0, Lw7/b;->l:[F

    .line 361
    .line 362
    aget v4, v5, v4

    .line 363
    .line 364
    mul-float/2addr v2, v4

    .line 365
    iget-object v4, p0, Lw7/b;->c:Ly7/d;

    .line 366
    .line 367
    check-cast v4, Landroid/view/View;

    .line 368
    .line 369
    invoke-virtual {v4}, Landroid/view/View;->getHeight()I

    .line 370
    .line 371
    .line 372
    move-result v4

    .line 373
    int-to-float v4, v4

    .line 374
    sub-float/2addr v2, v4

    .line 375
    mul-float/2addr v0, v2

    .line 376
    aput v0, v3, v8

    .line 377
    .line 378
    :goto_4
    iget-object v0, p0, Lw7/b;->l:[F

    .line 379
    .line 380
    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->setValues([F)V

    .line 381
    .line 382
    .line 383
    invoke-virtual {p1}, Landroid/graphics/Matrix;->toShortString()Ljava/lang/String;

    .line 384
    .line 385
    .line 386
    move-result-object v0

    .line 387
    new-instance v2, Ljava/lang/StringBuilder;

    .line 388
    .line 389
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 390
    .line 391
    .line 392
    const-string v3, "after -> "

    .line 393
    .line 394
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 395
    .line 396
    .line 397
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 398
    .line 399
    .line 400
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 401
    .line 402
    .line 403
    move-result-object v0

    .line 404
    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 405
    .line 406
    .line 407
    iget-object v0, p0, Lw7/b;->b:Landroid/graphics/Matrix;

    .line 408
    .line 409
    invoke-virtual {v0, p1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 410
    .line 411
    .line 412
    iget-object p1, p0, Lw7/b;->c:Ly7/d;

    .line 413
    .line 414
    invoke-interface {p1}, Ly7/d;->a()V

    .line 415
    .line 416
    .line 417
    iget-object p1, p0, Lw7/b;->c:Ly7/d;

    .line 418
    .line 419
    invoke-interface {p1}, Ly7/d;->c()V

    .line 420
    .line 421
    .line 422
    iget-object p1, p0, Lw7/b;->c:Ly7/d;

    .line 423
    .line 424
    invoke-interface {p1}, Ly7/d;->b()V

    .line 425
    .line 426
    .line 427
    return-void
.end method

.method public final l(Landroid/graphics/PointF;)V
    .locals 6

    .line 1
    const-string v0, "currentPointF"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lw7/b;->b:Landroid/graphics/Matrix;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lcom/zykj/sketch/core/graph/GraphExtKt;->mapPoint(Landroid/graphics/Matrix;Landroid/graphics/PointF;)Landroid/graphics/PointF;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v1, p0, Lw7/b;->h:Landroid/graphics/Path;

    .line 13
    .line 14
    invoke-virtual {v1}, Landroid/graphics/Path;->reset()V

    .line 15
    .line 16
    .line 17
    iget-object v1, p0, Lw7/b;->h:Landroid/graphics/Path;

    .line 18
    .line 19
    iget v2, v0, Landroid/graphics/PointF;->x:F

    .line 20
    .line 21
    iget v0, v0, Landroid/graphics/PointF;->y:F

    .line 22
    .line 23
    iget-object v3, p0, Lw7/b;->a:Lw7/c;

    .line 24
    .line 25
    invoke-virtual {v3}, Lw7/c;->d()F

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    sget-object v4, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 30
    .line 31
    invoke-virtual {v1, v2, v0, v3, v4}, Landroid/graphics/Path;->addCircle(FFFLandroid/graphics/Path$Direction;)V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Lw7/b;->n:Landroid/graphics/Paint;

    .line 35
    .line 36
    invoke-virtual {p0, v0}, Lw7/b;->q(Landroid/graphics/Paint;)V

    .line 37
    .line 38
    .line 39
    iget-object v0, p0, Lw7/b;->g:Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    const-string v1, "iterator(...)"

    .line 46
    .line 47
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const/4 v1, 0x0

    .line 51
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    if-eqz v2, :cond_1

    .line 56
    .line 57
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    const-string v3, "next(...)"

    .line 62
    .line 63
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    check-cast v2, Lx7/j;

    .line 67
    .line 68
    invoke-virtual {v2}, Lx7/j;->d()Landroid/graphics/RectF;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    iget v4, p1, Landroid/graphics/PointF;->x:F

    .line 73
    .line 74
    iget v5, p1, Landroid/graphics/PointF;->y:F

    .line 75
    .line 76
    invoke-virtual {v3, v4, v5}, Landroid/graphics/RectF;->contains(FF)Z

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    if-eqz v3, :cond_0

    .line 81
    .line 82
    invoke-virtual {v2}, Lx7/j;->c()Ljava/util/List;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    iget-object v3, p0, Lw7/b;->b:Landroid/graphics/Matrix;

    .line 87
    .line 88
    invoke-static {v3}, Le5/m;->b(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    iget-object v4, p0, Lw7/b;->a:Lw7/c;

    .line 93
    .line 94
    invoke-virtual {v4}, Lw7/c;->d()F

    .line 95
    .line 96
    .line 97
    move-result v4

    .line 98
    invoke-virtual {v3, v4}, Landroid/graphics/Matrix;->mapRadius(F)F

    .line 99
    .line 100
    .line 101
    move-result v3

    .line 102
    invoke-virtual {p0, p1, v2, v3}, Lw7/b;->d(Landroid/graphics/PointF;Ljava/util/List;F)Z

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    if-eqz v2, :cond_0

    .line 107
    .line 108
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 109
    .line 110
    .line 111
    const/4 v1, 0x1

    .line 112
    goto :goto_0

    .line 113
    :cond_1
    if-eqz v1, :cond_2

    .line 114
    .line 115
    iget-object p1, p0, Lw7/b;->i:Lkotlin/jvm/functions/Function0;

    .line 116
    .line 117
    if-eqz p1, :cond_2

    .line 118
    .line 119
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    :cond_2
    iget-object p1, p0, Lw7/b;->c:Ly7/d;

    .line 123
    .line 124
    invoke-interface {p1}, Ly7/d;->c()V

    .line 125
    .line 126
    .line 127
    iget-object p1, p0, Lw7/b;->c:Ly7/d;

    .line 128
    .line 129
    invoke-interface {p1}, Ly7/d;->b()V

    .line 130
    .line 131
    .line 132
    return-void
.end method

.method public final m(Landroid/graphics/PointF;)V
    .locals 6

    .line 1
    const-string v0, "currentPointF"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lw7/b;->h:Landroid/graphics/Path;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lw7/b;->g:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const-string v1, "iterator(...)"

    .line 18
    .line 19
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    const-string v3, "next(...)"

    .line 34
    .line 35
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    check-cast v2, Lx7/j;

    .line 39
    .line 40
    invoke-virtual {v2}, Lx7/j;->d()Landroid/graphics/RectF;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    iget v4, p1, Landroid/graphics/PointF;->x:F

    .line 45
    .line 46
    iget v5, p1, Landroid/graphics/PointF;->y:F

    .line 47
    .line 48
    invoke-virtual {v3, v4, v5}, Landroid/graphics/RectF;->contains(FF)Z

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    if-eqz v3, :cond_0

    .line 53
    .line 54
    invoke-virtual {v2}, Lx7/j;->c()Ljava/util/List;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    iget-object v3, p0, Lw7/b;->b:Landroid/graphics/Matrix;

    .line 59
    .line 60
    invoke-static {v3}, Le5/m;->b(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    iget-object v4, p0, Lw7/b;->a:Lw7/c;

    .line 65
    .line 66
    invoke-virtual {v4}, Lw7/c;->d()F

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    invoke-virtual {v3, v4}, Landroid/graphics/Matrix;->mapRadius(F)F

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    invoke-virtual {p0, p1, v2, v3}, Lw7/b;->d(Landroid/graphics/PointF;Ljava/util/List;F)Z

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    if-eqz v2, :cond_0

    .line 79
    .line 80
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 81
    .line 82
    .line 83
    const/4 v1, 0x1

    .line 84
    goto :goto_0

    .line 85
    :cond_1
    if-eqz v1, :cond_2

    .line 86
    .line 87
    iget-object p1, p0, Lw7/b;->i:Lkotlin/jvm/functions/Function0;

    .line 88
    .line 89
    if-eqz p1, :cond_2

    .line 90
    .line 91
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    :cond_2
    iget-object p1, p0, Lw7/b;->c:Ly7/d;

    .line 95
    .line 96
    invoke-interface {p1}, Ly7/d;->c()V

    .line 97
    .line 98
    .line 99
    iget-object p1, p0, Lw7/b;->c:Ly7/d;

    .line 100
    .line 101
    invoke-interface {p1}, Ly7/d;->b()V

    .line 102
    .line 103
    .line 104
    return-void
.end method

.method public final n(Landroid/graphics/Path;)V
    .locals 1

    .line 1
    const-string v0, "path"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lw7/b;->j:Landroid/graphics/Path;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Landroid/graphics/Path;->set(Landroid/graphics/Path;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lw7/b;->j:Landroid/graphics/Path;

    .line 12
    .line 13
    iget-object v0, p0, Lw7/b;->b:Landroid/graphics/Matrix;

    .line 14
    .line 15
    invoke-virtual {p1, v0}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lw7/b;->h:Landroid/graphics/Path;

    .line 19
    .line 20
    iget-object v0, p0, Lw7/b;->j:Landroid/graphics/Path;

    .line 21
    .line 22
    invoke-virtual {p1, v0}, Landroid/graphics/Path;->set(Landroid/graphics/Path;)V

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, Lw7/b;->n:Landroid/graphics/Paint;

    .line 26
    .line 27
    invoke-virtual {p0, p1}, Lw7/b;->r(Landroid/graphics/Paint;)V

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, Lw7/b;->c:Ly7/d;

    .line 31
    .line 32
    invoke-interface {p1}, Ly7/d;->b()V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public final o()V
    .locals 1

    .line 1
    iget-object v0, p0, Lw7/b;->h:Landroid/graphics/Path;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lw7/b;->c:Ly7/d;

    .line 7
    .line 8
    invoke-interface {v0}, Ly7/d;->b()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final p(Landroid/graphics/Path;Ljava/util/List;)V
    .locals 2

    .line 1
    const-string v0, "path"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "pointFList"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lw7/b;->h:Landroid/graphics/Path;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lw7/b;->m:Landroid/graphics/Paint;

    .line 17
    .line 18
    invoke-virtual {p0, v0}, Lw7/b;->r(Landroid/graphics/Paint;)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lw7/b;->g:Ljava/util/ArrayList;

    .line 22
    .line 23
    iget-object v1, p0, Lw7/b;->m:Landroid/graphics/Paint;

    .line 24
    .line 25
    invoke-virtual {p0, p2, v1, p1}, Lw7/b;->b(Ljava/util/List;Landroid/graphics/Paint;Landroid/graphics/Path;)Lx7/j;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, Lw7/b;->i:Lkotlin/jvm/functions/Function0;

    .line 33
    .line 34
    if-eqz p1, :cond_0

    .line 35
    .line 36
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    :cond_0
    iget-object p1, p0, Lw7/b;->c:Ly7/d;

    .line 40
    .line 41
    invoke-interface {p1}, Ly7/d;->c()V

    .line 42
    .line 43
    .line 44
    iget-object p1, p0, Lw7/b;->c:Ly7/d;

    .line 45
    .line 46
    invoke-interface {p1}, Ly7/d;->b()V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public final q(Landroid/graphics/Paint;)V
    .locals 1

    .line 1
    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lw7/b;->a:Lw7/c;

    .line 7
    .line 8
    invoke-virtual {v0}, Lw7/c;->c()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final r(Landroid/graphics/Paint;)V
    .locals 3

    .line 1
    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lw7/b;->a:Lw7/c;

    .line 7
    .line 8
    invoke-virtual {v0}, Lw7/c;->g()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lw7/b;->a:Lw7/c;

    .line 16
    .line 17
    invoke-virtual {v0}, Lw7/c;->h()F

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lw7/b;->a:Lw7/c;

    .line 25
    .line 26
    invoke-virtual {v0}, Lw7/c;->i()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    new-instance v0, Landroid/graphics/DashPathEffect;

    .line 33
    .line 34
    const/4 v1, 0x2

    .line 35
    new-array v1, v1, [F

    .line 36
    .line 37
    fill-array-data v1, :array_0

    .line 38
    .line 39
    .line 40
    const/4 v2, 0x0

    .line 41
    invoke-direct {v0, v1, v2}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    const/4 v0, 0x0

    .line 46
    :goto_0
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    nop

    .line 51
    :array_0
    .array-data 4
        0x41f00000    # 30.0f
        0x41700000    # 15.0f
    .end array-data
.end method

.method public final s()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lw7/b;->g:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Lw7/b;->d:Landroid/graphics/Bitmap;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    return v0

    .line 16
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 17
    return v0
.end method

.method public final t()V
    .locals 4

    .line 1
    iget-object v0, p0, Lw7/b;->c:Ly7/d;

    .line 2
    .line 3
    const-string v1, "null cannot be cast to non-null type android.view.View"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    check-cast v0, Landroid/view/View;

    .line 9
    .line 10
    iget-object v1, p0, Lw7/b;->g:Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 13
    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    iput-object v1, p0, Lw7/b;->d:Landroid/graphics/Bitmap;

    .line 17
    .line 18
    iget-object v1, p0, Lw7/b;->e:Landroid/graphics/RectF;

    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    int-to-float v2, v2

    .line 25
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    int-to-float v0, v0

    .line 30
    const/4 v3, 0x0

    .line 31
    invoke-virtual {v1, v3, v3, v2, v0}, Landroid/graphics/RectF;->set(FFFF)V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Lw7/b;->f:Landroid/graphics/Matrix;

    .line 35
    .line 36
    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    .line 37
    .line 38
    .line 39
    iget-object v0, p0, Lw7/b;->b:Landroid/graphics/Matrix;

    .line 40
    .line 41
    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    .line 42
    .line 43
    .line 44
    iget-object v0, p0, Lw7/b;->c:Ly7/d;

    .line 45
    .line 46
    invoke-interface {v0}, Ly7/d;->a()V

    .line 47
    .line 48
    .line 49
    iget-object v0, p0, Lw7/b;->c:Ly7/d;

    .line 50
    .line 51
    invoke-interface {v0}, Ly7/d;->c()V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public final u(Landroid/graphics/Bitmap;)V
    .locals 3

    .line 1
    const-string v0, "bitmap"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 7
    .line 8
    invoke-static {p1}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    goto :goto_0

    .line 17
    :catchall_0
    move-exception p1

    .line 18
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 19
    .line 20
    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    :goto_0
    invoke-static {p1}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_0

    .line 33
    .line 34
    const/4 p1, 0x0

    .line 35
    :cond_0
    check-cast p1, Landroid/graphics/Bitmap;

    .line 36
    .line 37
    if-eqz p1, :cond_1

    .line 38
    .line 39
    iput-object p1, p0, Lw7/b;->d:Landroid/graphics/Bitmap;

    .line 40
    .line 41
    iget-object v0, p0, Lw7/b;->c:Ly7/d;

    .line 42
    .line 43
    const-string v1, "null cannot be cast to non-null type android.view.View"

    .line 44
    .line 45
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    check-cast v0, Landroid/view/View;

    .line 49
    .line 50
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-lez v0, :cond_1

    .line 55
    .line 56
    int-to-float v0, v0

    .line 57
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    int-to-float v1, v1

    .line 62
    div-float v1, v0, v1

    .line 63
    .line 64
    iget-object v2, p0, Lw7/b;->f:Landroid/graphics/Matrix;

    .line 65
    .line 66
    invoke-virtual {v2, v1, v1}, Landroid/graphics/Matrix;->setScale(FF)V

    .line 67
    .line 68
    .line 69
    iget-object v2, p0, Lw7/b;->e:Landroid/graphics/RectF;

    .line 70
    .line 71
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    int-to-float p1, p1

    .line 76
    mul-float/2addr p1, v1

    .line 77
    const/4 v1, 0x0

    .line 78
    invoke-virtual {v2, v1, v1, v0, p1}, Landroid/graphics/RectF;->set(FFFF)V

    .line 79
    .line 80
    .line 81
    :cond_1
    iget-object p1, p0, Lw7/b;->c:Ly7/d;

    .line 82
    .line 83
    invoke-interface {p1}, Ly7/d;->a()V

    .line 84
    .line 85
    .line 86
    return-void
.end method

.method public final v(Lkotlin/jvm/functions/Function0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lw7/b;->i:Lkotlin/jvm/functions/Function0;

    .line 2
    .line 3
    return-void
.end method

.method public final w(Ljava/util/List;)V
    .locals 9

    .line 1
    const-string v0, "pathList"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lw7/b;->g:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lw7/b;->g:Ljava/util/ArrayList;

    .line 12
    .line 13
    new-instance v1, Ljava/util/ArrayList;

    .line 14
    .line 15
    const/16 v2, 0xa

    .line 16
    .line 17
    invoke-static {p1, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 22
    .line 23
    .line 24
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_0

    .line 33
    .line 34
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    check-cast v2, Lcom/zykj/view/utils/ProtoPath;

    .line 39
    .line 40
    invoke-virtual {v2}, Lcom/zykj/view/utils/ProtoPath;->getPointList()Ljava/util/List;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    invoke-virtual {v2}, Lcom/zykj/view/utils/ProtoPath;->getPaint()Landroid/graphics/Paint;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    const/4 v7, 0x4

    .line 49
    const/4 v8, 0x0

    .line 50
    const/4 v6, 0x0

    .line 51
    move-object v3, p0

    .line 52
    invoke-static/range {v3 .. v8}, Lw7/b;->c(Lw7/b;Ljava/util/List;Landroid/graphics/Paint;Landroid/graphics/Path;ILjava/lang/Object;)Lx7/j;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_0
    move-object v3, p0

    .line 61
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 62
    .line 63
    .line 64
    iget-object p1, v3, Lw7/b;->c:Ly7/d;

    .line 65
    .line 66
    invoke-interface {p1}, Ly7/d;->c()V

    .line 67
    .line 68
    .line 69
    return-void
.end method

.method public final x(F)V
    .locals 2

    .line 1
    iget-object v0, p0, Lw7/b;->a:Lw7/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Lw7/c;->f()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    cmpl-float v0, p1, v0

    .line 8
    .line 9
    if-ltz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lw7/b;->a:Lw7/c;

    .line 12
    .line 13
    invoke-virtual {v0}, Lw7/c;->e()F

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    cmpg-float v0, p1, v0

    .line 18
    .line 19
    if-gtz v0, :cond_0

    .line 20
    .line 21
    iget-object v0, p0, Lw7/b;->b:Landroid/graphics/Matrix;

    .line 22
    .line 23
    iget-object v1, p0, Lw7/b;->l:[F

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->getValues([F)V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Lw7/b;->l:[F

    .line 29
    .line 30
    const/4 v1, 0x0

    .line 31
    aput p1, v0, v1

    .line 32
    .line 33
    const/4 v1, 0x4

    .line 34
    aput p1, v0, v1

    .line 35
    .line 36
    iget-object p1, p0, Lw7/b;->k:Landroid/graphics/Matrix;

    .line 37
    .line 38
    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->setValues([F)V

    .line 39
    .line 40
    .line 41
    iget-object p1, p0, Lw7/b;->k:Landroid/graphics/Matrix;

    .line 42
    .line 43
    invoke-virtual {p0, p1}, Lw7/b;->k(Landroid/graphics/Matrix;)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_0
    new-instance p1, Ljava/lang/Exception;

    .line 48
    .line 49
    const-string v0, "scale is not in range at config"

    .line 50
    .line 51
    invoke-direct {p1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw p1
.end method

.method public final y(II)V
    .locals 3

    .line 1
    iget-object v0, p0, Lw7/b;->d:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    int-to-float p1, p1

    .line 7
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    int-to-float p2, p2

    .line 12
    div-float p2, p1, p2

    .line 13
    .line 14
    iget-object v2, p0, Lw7/b;->f:Landroid/graphics/Matrix;

    .line 15
    .line 16
    invoke-virtual {v2, p2, p2}, Landroid/graphics/Matrix;->setScale(FF)V

    .line 17
    .line 18
    .line 19
    iget-object v2, p0, Lw7/b;->e:Landroid/graphics/RectF;

    .line 20
    .line 21
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    int-to-float v0, v0

    .line 26
    mul-float/2addr v0, p2

    .line 27
    invoke-virtual {v2, v1, v1, p1, v0}, Landroid/graphics/RectF;->set(FFFF)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    iget-object v0, p0, Lw7/b;->e:Landroid/graphics/RectF;

    .line 32
    .line 33
    int-to-float p1, p1

    .line 34
    int-to-float p2, p2

    .line 35
    invoke-virtual {v0, v1, v1, p1, p2}, Landroid/graphics/RectF;->set(FFFF)V

    .line 36
    .line 37
    .line 38
    return-void
.end method
