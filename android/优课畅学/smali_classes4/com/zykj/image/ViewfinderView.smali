.class public final Lcom/zykj/image/ViewfinderView;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field public final a:Landroid/graphics/Paint;

.field public final b:Landroid/graphics/Paint;

.field public c:I

.field public d:I

.field public e:I

.field public f:Landroid/graphics/Bitmap;

.field public g:Ljava/util/Collection;

.field public h:Ljava/util/Collection;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    .line 3
    .line 4
    new-instance p2, Landroid/graphics/Paint;

    .line 5
    .line 6
    invoke-direct {p2}, Landroid/graphics/Paint;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p2, p0, Lcom/zykj/image/ViewfinderView;->a:Landroid/graphics/Paint;

    .line 10
    .line 11
    new-instance p2, Landroid/graphics/Paint;

    .line 12
    .line 13
    invoke-direct {p2}, Landroid/graphics/Paint;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p2, p0, Lcom/zykj/image/ViewfinderView;->b:Landroid/graphics/Paint;

    .line 17
    .line 18
    const/16 p2, 0x14

    .line 19
    .line 20
    iput p2, p0, Lcom/zykj/image/ViewfinderView;->c:I

    .line 21
    .line 22
    iput p2, p0, Lcom/zykj/image/ViewfinderView;->d:I

    .line 23
    .line 24
    new-instance p2, Ljava/util/HashSet;

    .line 25
    .line 26
    const/4 v0, 0x5

    .line 27
    invoke-direct {p2, v0}, Ljava/util/HashSet;-><init>(I)V

    .line 28
    .line 29
    .line 30
    iput-object p2, p0, Lcom/zykj/image/ViewfinderView;->g:Ljava/util/Collection;

    .line 31
    .line 32
    new-instance p2, Ljava/util/HashSet;

    .line 33
    .line 34
    invoke-direct {p2, v0}, Ljava/util/HashSet;-><init>(I)V

    .line 35
    .line 36
    .line 37
    iput-object p2, p0, Lcom/zykj/image/ViewfinderView;->h:Ljava/util/Collection;

    .line 38
    .line 39
    invoke-virtual {p0, p1}, Lcom/zykj/image/ViewfinderView;->d(Landroid/content/Context;)V

    .line 40
    .line 41
    .line 42
    return-void
.end method


# virtual methods
.method public final a(Lcom/google/zxing/ResultPoint;)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/zykj/image/ViewfinderView;->g:Ljava/util/Collection;

    .line 5
    .line 6
    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    const-string v0, "addPossibleResultPoint"

    .line 10
    .line 11
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {v0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final b(Landroid/graphics/Canvas;Landroid/graphics/Rect;)V
    .locals 13

    .line 1
    iget v0, p2, Landroid/graphics/Rect;->left:I

    .line 2
    .line 3
    int-to-float v2, v0

    .line 4
    iget v1, p2, Landroid/graphics/Rect;->top:I

    .line 5
    .line 6
    int-to-float v3, v1

    .line 7
    iget v4, p0, Lcom/zykj/image/ViewfinderView;->d:I

    .line 8
    .line 9
    add-int/2addr v0, v4

    .line 10
    int-to-float v4, v0

    .line 11
    iget v0, p0, Lcom/zykj/image/ViewfinderView;->c:I

    .line 12
    .line 13
    add-int/2addr v1, v0

    .line 14
    int-to-float v5, v1

    .line 15
    iget-object v6, p0, Lcom/zykj/image/ViewfinderView;->a:Landroid/graphics/Paint;

    .line 16
    .line 17
    move-object v1, p1

    .line 18
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 19
    .line 20
    .line 21
    move-object v7, v1

    .line 22
    iget p1, p2, Landroid/graphics/Rect;->left:I

    .line 23
    .line 24
    int-to-float v8, p1

    .line 25
    iget v0, p2, Landroid/graphics/Rect;->top:I

    .line 26
    .line 27
    int-to-float v9, v0

    .line 28
    iget v1, p0, Lcom/zykj/image/ViewfinderView;->c:I

    .line 29
    .line 30
    add-int/2addr p1, v1

    .line 31
    int-to-float v10, p1

    .line 32
    iget p1, p0, Lcom/zykj/image/ViewfinderView;->d:I

    .line 33
    .line 34
    add-int/2addr v0, p1

    .line 35
    int-to-float v11, v0

    .line 36
    iget-object v12, p0, Lcom/zykj/image/ViewfinderView;->a:Landroid/graphics/Paint;

    .line 37
    .line 38
    invoke-virtual/range {v7 .. v12}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 39
    .line 40
    .line 41
    iget p1, p2, Landroid/graphics/Rect;->right:I

    .line 42
    .line 43
    iget v0, p0, Lcom/zykj/image/ViewfinderView;->d:I

    .line 44
    .line 45
    sub-int v0, p1, v0

    .line 46
    .line 47
    int-to-float v8, v0

    .line 48
    iget v0, p2, Landroid/graphics/Rect;->top:I

    .line 49
    .line 50
    int-to-float v9, v0

    .line 51
    int-to-float v10, p1

    .line 52
    iget p1, p0, Lcom/zykj/image/ViewfinderView;->c:I

    .line 53
    .line 54
    add-int/2addr v0, p1

    .line 55
    int-to-float v11, v0

    .line 56
    iget-object v12, p0, Lcom/zykj/image/ViewfinderView;->a:Landroid/graphics/Paint;

    .line 57
    .line 58
    invoke-virtual/range {v7 .. v12}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 59
    .line 60
    .line 61
    iget p1, p2, Landroid/graphics/Rect;->right:I

    .line 62
    .line 63
    iget v0, p0, Lcom/zykj/image/ViewfinderView;->c:I

    .line 64
    .line 65
    sub-int v0, p1, v0

    .line 66
    .line 67
    int-to-float v8, v0

    .line 68
    iget v0, p2, Landroid/graphics/Rect;->top:I

    .line 69
    .line 70
    int-to-float v9, v0

    .line 71
    int-to-float v10, p1

    .line 72
    iget p1, p0, Lcom/zykj/image/ViewfinderView;->d:I

    .line 73
    .line 74
    add-int/2addr v0, p1

    .line 75
    int-to-float v11, v0

    .line 76
    iget-object v12, p0, Lcom/zykj/image/ViewfinderView;->a:Landroid/graphics/Paint;

    .line 77
    .line 78
    invoke-virtual/range {v7 .. v12}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 79
    .line 80
    .line 81
    iget p1, p2, Landroid/graphics/Rect;->left:I

    .line 82
    .line 83
    int-to-float v8, p1

    .line 84
    iget v0, p2, Landroid/graphics/Rect;->bottom:I

    .line 85
    .line 86
    iget v1, p0, Lcom/zykj/image/ViewfinderView;->c:I

    .line 87
    .line 88
    sub-int v1, v0, v1

    .line 89
    .line 90
    int-to-float v9, v1

    .line 91
    iget v1, p0, Lcom/zykj/image/ViewfinderView;->d:I

    .line 92
    .line 93
    add-int/2addr p1, v1

    .line 94
    int-to-float v10, p1

    .line 95
    int-to-float v11, v0

    .line 96
    iget-object v12, p0, Lcom/zykj/image/ViewfinderView;->a:Landroid/graphics/Paint;

    .line 97
    .line 98
    invoke-virtual/range {v7 .. v12}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 99
    .line 100
    .line 101
    iget p1, p2, Landroid/graphics/Rect;->left:I

    .line 102
    .line 103
    int-to-float v8, p1

    .line 104
    iget v0, p2, Landroid/graphics/Rect;->bottom:I

    .line 105
    .line 106
    iget v1, p0, Lcom/zykj/image/ViewfinderView;->d:I

    .line 107
    .line 108
    sub-int v1, v0, v1

    .line 109
    .line 110
    int-to-float v9, v1

    .line 111
    iget v1, p0, Lcom/zykj/image/ViewfinderView;->c:I

    .line 112
    .line 113
    add-int/2addr p1, v1

    .line 114
    int-to-float v10, p1

    .line 115
    int-to-float v11, v0

    .line 116
    iget-object v12, p0, Lcom/zykj/image/ViewfinderView;->a:Landroid/graphics/Paint;

    .line 117
    .line 118
    invoke-virtual/range {v7 .. v12}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 119
    .line 120
    .line 121
    iget p1, p2, Landroid/graphics/Rect;->right:I

    .line 122
    .line 123
    iget v0, p0, Lcom/zykj/image/ViewfinderView;->d:I

    .line 124
    .line 125
    sub-int v0, p1, v0

    .line 126
    .line 127
    int-to-float v8, v0

    .line 128
    iget v0, p2, Landroid/graphics/Rect;->bottom:I

    .line 129
    .line 130
    iget v1, p0, Lcom/zykj/image/ViewfinderView;->c:I

    .line 131
    .line 132
    sub-int v1, v0, v1

    .line 133
    .line 134
    int-to-float v9, v1

    .line 135
    int-to-float v10, p1

    .line 136
    int-to-float v11, v0

    .line 137
    iget-object v12, p0, Lcom/zykj/image/ViewfinderView;->a:Landroid/graphics/Paint;

    .line 138
    .line 139
    invoke-virtual/range {v7 .. v12}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 140
    .line 141
    .line 142
    iget p1, p2, Landroid/graphics/Rect;->right:I

    .line 143
    .line 144
    iget v0, p0, Lcom/zykj/image/ViewfinderView;->c:I

    .line 145
    .line 146
    sub-int v0, p1, v0

    .line 147
    .line 148
    int-to-float v8, v0

    .line 149
    iget p2, p2, Landroid/graphics/Rect;->bottom:I

    .line 150
    .line 151
    iget v0, p0, Lcom/zykj/image/ViewfinderView;->d:I

    .line 152
    .line 153
    sub-int v0, p2, v0

    .line 154
    .line 155
    int-to-float v9, v0

    .line 156
    int-to-float v10, p1

    .line 157
    int-to-float v11, p2

    .line 158
    iget-object v12, p0, Lcom/zykj/image/ViewfinderView;->a:Landroid/graphics/Paint;

    .line 159
    .line 160
    invoke-virtual/range {v7 .. v12}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 161
    .line 162
    .line 163
    return-void
.end method

.method public final c(Landroid/graphics/Canvas;Landroid/graphics/Rect;)V
    .locals 4

    .line 1
    iget v0, p0, Lcom/zykj/image/ViewfinderView;->e:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget v0, p2, Landroid/graphics/Rect;->top:I

    .line 6
    .line 7
    add-int/lit8 v0, v0, 0xa

    .line 8
    .line 9
    iput v0, p0, Lcom/zykj/image/ViewfinderView;->e:I

    .line 10
    .line 11
    :cond_0
    iget v0, p0, Lcom/zykj/image/ViewfinderView;->e:I

    .line 12
    .line 13
    iget v1, p2, Landroid/graphics/Rect;->bottom:I

    .line 14
    .line 15
    add-int/lit8 v1, v1, -0xa

    .line 16
    .line 17
    if-lt v0, v1, :cond_1

    .line 18
    .line 19
    iget v0, p2, Landroid/graphics/Rect;->top:I

    .line 20
    .line 21
    iput v0, p0, Lcom/zykj/image/ViewfinderView;->e:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    add-int/lit8 v0, v0, 0xa

    .line 25
    .line 26
    iput v0, p0, Lcom/zykj/image/ViewfinderView;->e:I

    .line 27
    .line 28
    :goto_0
    new-instance v0, Landroid/graphics/Rect;

    .line 29
    .line 30
    iget v1, p2, Landroid/graphics/Rect;->left:I

    .line 31
    .line 32
    iget v2, p0, Lcom/zykj/image/ViewfinderView;->e:I

    .line 33
    .line 34
    iget p2, p2, Landroid/graphics/Rect;->right:I

    .line 35
    .line 36
    add-int/lit8 v3, v2, 0xa

    .line 37
    .line 38
    invoke-direct {v0, v1, v2, p2, v3}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 39
    .line 40
    .line 41
    iget-object p2, p0, Lcom/zykj/image/ViewfinderView;->f:Landroid/graphics/Bitmap;

    .line 42
    .line 43
    const/4 v1, 0x0

    .line 44
    iget-object v2, p0, Lcom/zykj/image/ViewfinderView;->a:Landroid/graphics/Paint;

    .line 45
    .line 46
    invoke-virtual {p1, p2, v1, v0, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public final d(Landroid/content/Context;)V
    .locals 4

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/zykj/image/ViewfinderView;->a:Landroid/graphics/Paint;

    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    sget v2, Lcom/zykj/image/R$color;->colorPrimary:I

    .line 11
    .line 12
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lcom/zykj/image/ViewfinderView;->a:Landroid/graphics/Paint;

    .line 20
    .line 21
    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lcom/zykj/image/ViewfinderView;->b:Landroid/graphics/Paint;

    .line 27
    .line 28
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    sget v3, Lcom/zykj/image/R$color;->xui_config_color_pure_yellow:I

    .line 33
    .line 34
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 39
    .line 40
    .line 41
    iget-object v0, p0, Lcom/zykj/image/ViewfinderView;->a:Landroid/graphics/Paint;

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    sget v1, Lcom/zykj/image/R$dimen;->view_25:I

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    iput v0, p0, Lcom/zykj/image/ViewfinderView;->c:I

    .line 57
    .line 58
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    sget v1, Lcom/zykj/image/R$dimen;->view_2:I

    .line 63
    .line 64
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    iput v0, p0, Lcom/zykj/image/ViewfinderView;->d:I

    .line 69
    .line 70
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    sget v0, Lcom/zykj/image/R$drawable;->xqrcode_ic_scan_light:I

    .line 75
    .line 76
    invoke-static {p1, v0}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    iput-object p1, p0, Lcom/zykj/image/ViewfinderView;->f:Landroid/graphics/Bitmap;

    .line 81
    .line 82
    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 13

    .line 1
    const-string v0, "canvas"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroid/graphics/Rect;

    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    const/4 v3, 0x0

    .line 17
    invoke-direct {v0, v3, v3, v1, v2}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, p1, v0}, Lcom/zykj/image/ViewfinderView;->b(Landroid/graphics/Canvas;Landroid/graphics/Rect;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, p1, v0}, Lcom/zykj/image/ViewfinderView;->c(Landroid/graphics/Canvas;Landroid/graphics/Rect;)V

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, Lcom/zykj/image/ViewfinderView;->g:Ljava/util/Collection;

    .line 27
    .line 28
    iget-object v2, p0, Lcom/zykj/image/ViewfinderView;->h:Ljava/util/Collection;

    .line 29
    .line 30
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    if-eqz v3, :cond_0

    .line 35
    .line 36
    const/4 v1, 0x0

    .line 37
    iput-object v1, p0, Lcom/zykj/image/ViewfinderView;->h:Ljava/util/Collection;

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_0
    new-instance v3, Ljava/util/HashSet;

    .line 41
    .line 42
    const/4 v4, 0x5

    .line 43
    invoke-direct {v3, v4}, Ljava/util/HashSet;-><init>(I)V

    .line 44
    .line 45
    .line 46
    iput-object v3, p0, Lcom/zykj/image/ViewfinderView;->g:Ljava/util/Collection;

    .line 47
    .line 48
    iput-object v1, p0, Lcom/zykj/image/ViewfinderView;->h:Ljava/util/Collection;

    .line 49
    .line 50
    iget-object v3, p0, Lcom/zykj/image/ViewfinderView;->b:Landroid/graphics/Paint;

    .line 51
    .line 52
    const/16 v4, 0xff

    .line 53
    .line 54
    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 55
    .line 56
    .line 57
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    if-eqz v3, :cond_1

    .line 66
    .line 67
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    check-cast v3, Lcom/google/zxing/ResultPoint;

    .line 72
    .line 73
    invoke-virtual {v3}, Lcom/google/zxing/ResultPoint;->getX()F

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    invoke-virtual {v3}, Lcom/google/zxing/ResultPoint;->getY()F

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    const/high16 v5, 0x40c00000    # 6.0f

    .line 82
    .line 83
    iget-object v6, p0, Lcom/zykj/image/ViewfinderView;->b:Landroid/graphics/Paint;

    .line 84
    .line 85
    invoke-virtual {p1, v4, v3, v5, v6}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_1
    :goto_1
    if-eqz v2, :cond_2

    .line 90
    .line 91
    iget-object v1, p0, Lcom/zykj/image/ViewfinderView;->b:Landroid/graphics/Paint;

    .line 92
    .line 93
    const/16 v3, 0x7f

    .line 94
    .line 95
    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 96
    .line 97
    .line 98
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    if-eqz v2, :cond_2

    .line 107
    .line 108
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    check-cast v2, Lcom/google/zxing/ResultPoint;

    .line 113
    .line 114
    invoke-virtual {v2}, Lcom/google/zxing/ResultPoint;->getX()F

    .line 115
    .line 116
    .line 117
    move-result v3

    .line 118
    invoke-virtual {v2}, Lcom/google/zxing/ResultPoint;->getY()F

    .line 119
    .line 120
    .line 121
    move-result v2

    .line 122
    const/high16 v4, 0x40400000    # 3.0f

    .line 123
    .line 124
    iget-object v5, p0, Lcom/zykj/image/ViewfinderView;->b:Landroid/graphics/Paint;

    .line 125
    .line 126
    invoke-virtual {p1, v3, v2, v4, v5}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 127
    .line 128
    .line 129
    goto :goto_2

    .line 130
    :cond_2
    iget v9, v0, Landroid/graphics/Rect;->left:I

    .line 131
    .line 132
    iget v10, v0, Landroid/graphics/Rect;->top:I

    .line 133
    .line 134
    iget v11, v0, Landroid/graphics/Rect;->right:I

    .line 135
    .line 136
    iget v12, v0, Landroid/graphics/Rect;->bottom:I

    .line 137
    .line 138
    const-wide/16 v7, 0x18

    .line 139
    .line 140
    move-object v6, p0

    .line 141
    invoke-virtual/range {v6 .. v12}, Landroid/view/View;->postInvalidateDelayed(JIIII)V

    .line 142
    .line 143
    .line 144
    return-void
.end method
