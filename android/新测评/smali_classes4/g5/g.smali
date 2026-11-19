.class public Lg5/g;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field public A:Z

.field public B:Ljava/lang/String;

.field public C:Ljava/lang/String;

.field public D:Ljava/lang/String;

.field public E:I

.field public F:I

.field public G:Z

.field public H:I

.field public I:Z

.field public J:I

.field public K:Z

.field public L:Z

.field public M:Z

.field public N:Landroid/graphics/drawable/Drawable;

.field public O:Landroid/graphics/Bitmap;

.field public P:F

.field public Q:F

.field public R:Landroid/graphics/Bitmap;

.field public S:Landroid/graphics/Bitmap;

.field public T:Landroid/graphics/Bitmap;

.field public U:Landroid/graphics/Bitmap;

.field public V:F

.field public W:Landroid/text/StaticLayout;

.field public a:I

.field public b:I

.field public c:Landroid/graphics/Rect;

.field public c0:I

.field public d:F

.field public d0:Z

.field public e:F

.field public f:Landroid/graphics/Paint;

.field public g:Landroid/text/TextPaint;

.field public h:I

.field public i:I

.field public j:I

.field public k:I

.field public l:I

.field public m:I

.field public n:I

.field public o:I

.field public p:I

.field public q:I

.field public r:I

.field public s:Z

.field public t:Landroid/graphics/drawable/Drawable;

.field public u:Landroid/graphics/Bitmap;

.field public v:I

.field public w:I

.field public x:I

.field public y:Z

.field public z:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 6

    .line 1
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/graphics/Paint;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lg5/g;->f:Landroid/graphics/Paint;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 13
    .line 14
    .line 15
    const-string v0, "#33FFFFFF"

    .line 16
    .line 17
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    iput v0, p0, Lg5/g;->h:I

    .line 22
    .line 23
    const/4 v0, -0x1

    .line 24
    iput v0, p0, Lg5/g;->i:I

    .line 25
    .line 26
    const/high16 v2, 0x41a00000    # 20.0f

    .line 27
    .line 28
    invoke-static {p1, v2}, Lg5/a;->b(Landroid/content/Context;F)I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    iput v3, p0, Lg5/g;->j:I

    .line 33
    .line 34
    const/high16 v3, 0x40400000    # 3.0f

    .line 35
    .line 36
    invoke-static {p1, v3}, Lg5/a;->b(Landroid/content/Context;F)I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    iput v3, p0, Lg5/g;->k:I

    .line 41
    .line 42
    const/high16 v3, 0x3f800000    # 1.0f

    .line 43
    .line 44
    invoke-static {p1, v3}, Lg5/a;->b(Landroid/content/Context;F)I

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    iput v4, p0, Lg5/g;->p:I

    .line 49
    .line 50
    iput v0, p0, Lg5/g;->q:I

    .line 51
    .line 52
    const/high16 v4, 0x42b40000    # 90.0f

    .line 53
    .line 54
    invoke-static {p1, v4}, Lg5/a;->b(Landroid/content/Context;F)I

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    iput v4, p0, Lg5/g;->o:I

    .line 59
    .line 60
    const/high16 v4, 0x43480000    # 200.0f

    .line 61
    .line 62
    invoke-static {p1, v4}, Lg5/a;->b(Landroid/content/Context;F)I

    .line 63
    .line 64
    .line 65
    move-result v5

    .line 66
    iput v5, p0, Lg5/g;->l:I

    .line 67
    .line 68
    invoke-static {p1, v4}, Lg5/a;->b(Landroid/content/Context;F)I

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    iput v4, p0, Lg5/g;->m:I

    .line 73
    .line 74
    const/high16 v4, 0x430c0000    # 140.0f

    .line 75
    .line 76
    invoke-static {p1, v4}, Lg5/a;->b(Landroid/content/Context;F)I

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    iput v4, p0, Lg5/g;->n:I

    .line 81
    .line 82
    const/4 v4, 0x0

    .line 83
    iput v4, p0, Lg5/g;->r:I

    .line 84
    .line 85
    iput-boolean v4, p0, Lg5/g;->s:Z

    .line 86
    .line 87
    const/4 v5, 0x0

    .line 88
    iput-object v5, p0, Lg5/g;->t:Landroid/graphics/drawable/Drawable;

    .line 89
    .line 90
    iput-object v5, p0, Lg5/g;->u:Landroid/graphics/Bitmap;

    .line 91
    .line 92
    invoke-static {p1, v3}, Lg5/a;->b(Landroid/content/Context;F)I

    .line 93
    .line 94
    .line 95
    move-result v3

    .line 96
    iput v3, p0, Lg5/g;->v:I

    .line 97
    .line 98
    iput v0, p0, Lg5/g;->w:I

    .line 99
    .line 100
    const/16 v3, 0x3e8

    .line 101
    .line 102
    iput v3, p0, Lg5/g;->x:I

    .line 103
    .line 104
    iput-boolean v4, p0, Lg5/g;->y:Z

    .line 105
    .line 106
    iput v4, p0, Lg5/g;->z:I

    .line 107
    .line 108
    iput-boolean v4, p0, Lg5/g;->A:Z

    .line 109
    .line 110
    const/high16 v3, 0x41200000    # 10.0f

    .line 111
    .line 112
    invoke-static {p1, v3}, Lg5/a;->b(Landroid/content/Context;F)I

    .line 113
    .line 114
    .line 115
    move-result v3

    .line 116
    iput v3, p0, Lg5/g;->a:I

    .line 117
    .line 118
    iput-object v5, p0, Lg5/g;->D:Ljava/lang/String;

    .line 119
    .line 120
    const/high16 v3, 0x41600000    # 14.0f

    .line 121
    .line 122
    invoke-static {p1, v3}, Lg5/a;->e(Landroid/content/Context;F)I

    .line 123
    .line 124
    .line 125
    move-result v3

    .line 126
    iput v3, p0, Lg5/g;->E:I

    .line 127
    .line 128
    iput v0, p0, Lg5/g;->F:I

    .line 129
    .line 130
    iput-boolean v4, p0, Lg5/g;->G:Z

    .line 131
    .line 132
    invoke-static {p1, v2}, Lg5/a;->b(Landroid/content/Context;F)I

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    iput v0, p0, Lg5/g;->H:I

    .line 137
    .line 138
    iput-boolean v4, p0, Lg5/g;->I:Z

    .line 139
    .line 140
    const-string v0, "#22000000"

    .line 141
    .line 142
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    iput v0, p0, Lg5/g;->J:I

    .line 147
    .line 148
    iput-boolean v4, p0, Lg5/g;->K:Z

    .line 149
    .line 150
    iput-boolean v4, p0, Lg5/g;->L:Z

    .line 151
    .line 152
    iput-boolean v4, p0, Lg5/g;->M:Z

    .line 153
    .line 154
    new-instance v0, Landroid/text/TextPaint;

    .line 155
    .line 156
    invoke-direct {v0}, Landroid/text/TextPaint;-><init>()V

    .line 157
    .line 158
    .line 159
    iput-object v0, p0, Lg5/g;->g:Landroid/text/TextPaint;

    .line 160
    .line 161
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 162
    .line 163
    .line 164
    const/high16 v0, 0x40800000    # 4.0f

    .line 165
    .line 166
    invoke-static {p1, v0}, Lg5/a;->b(Landroid/content/Context;F)I

    .line 167
    .line 168
    .line 169
    move-result p1

    .line 170
    iput p1, p0, Lg5/g;->c0:I

    .line 171
    .line 172
    iput-boolean v4, p0, Lg5/g;->d0:Z

    .line 173
    .line 174
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    iget-object v0, p0, Lg5/g;->N:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Lg5/g;->T:Landroid/graphics/Bitmap;

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lg5/g;->T:Landroid/graphics/Bitmap;

    .line 14
    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sget v1, Lcom/zykj/camera/R$mipmap;->qrcode_default_grid_scan_line:I

    .line 22
    .line 23
    invoke-static {v0, v1}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iput-object v0, p0, Lg5/g;->T:Landroid/graphics/Bitmap;

    .line 28
    .line 29
    iget v1, p0, Lg5/g;->q:I

    .line 30
    .line 31
    invoke-static {v0, v1}, Lg5/a;->d(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iput-object v0, p0, Lg5/g;->T:Landroid/graphics/Bitmap;

    .line 36
    .line 37
    :cond_1
    iget-object v0, p0, Lg5/g;->T:Landroid/graphics/Bitmap;

    .line 38
    .line 39
    const/16 v1, 0x5a

    .line 40
    .line 41
    invoke-static {v0, v1}, Lg5/a;->a(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iput-object v0, p0, Lg5/g;->U:Landroid/graphics/Bitmap;

    .line 46
    .line 47
    invoke-static {v0, v1}, Lg5/a;->a(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    iput-object v0, p0, Lg5/g;->U:Landroid/graphics/Bitmap;

    .line 52
    .line 53
    invoke-static {v0, v1}, Lg5/a;->a(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    iput-object v0, p0, Lg5/g;->U:Landroid/graphics/Bitmap;

    .line 58
    .line 59
    iget-object v0, p0, Lg5/g;->t:Landroid/graphics/drawable/Drawable;

    .line 60
    .line 61
    if-eqz v0, :cond_2

    .line 62
    .line 63
    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    .line 64
    .line 65
    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    iput-object v0, p0, Lg5/g;->R:Landroid/graphics/Bitmap;

    .line 70
    .line 71
    :cond_2
    iget-object v0, p0, Lg5/g;->R:Landroid/graphics/Bitmap;

    .line 72
    .line 73
    if-nez v0, :cond_3

    .line 74
    .line 75
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    sget v2, Lcom/zykj/camera/R$mipmap;->qrcode_default_scan_line:I

    .line 80
    .line 81
    invoke-static {v0, v2}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    iput-object v0, p0, Lg5/g;->R:Landroid/graphics/Bitmap;

    .line 86
    .line 87
    iget v2, p0, Lg5/g;->q:I

    .line 88
    .line 89
    invoke-static {v0, v2}, Lg5/a;->d(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    iput-object v0, p0, Lg5/g;->R:Landroid/graphics/Bitmap;

    .line 94
    .line 95
    :cond_3
    iget-object v0, p0, Lg5/g;->R:Landroid/graphics/Bitmap;

    .line 96
    .line 97
    invoke-static {v0, v1}, Lg5/a;->a(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    iput-object v0, p0, Lg5/g;->S:Landroid/graphics/Bitmap;

    .line 102
    .line 103
    iget v0, p0, Lg5/g;->o:I

    .line 104
    .line 105
    iget v1, p0, Lg5/g;->z:I

    .line 106
    .line 107
    add-int/2addr v0, v1

    .line 108
    iput v0, p0, Lg5/g;->o:I

    .line 109
    .line 110
    iget v0, p0, Lg5/g;->k:I

    .line 111
    .line 112
    int-to-float v0, v0

    .line 113
    const/high16 v1, 0x3f800000    # 1.0f

    .line 114
    .line 115
    mul-float/2addr v0, v1

    .line 116
    const/high16 v1, 0x40000000    # 2.0f

    .line 117
    .line 118
    div-float/2addr v0, v1

    .line 119
    iput v0, p0, Lg5/g;->V:F

    .line 120
    .line 121
    iget-object v0, p0, Lg5/g;->g:Landroid/text/TextPaint;

    .line 122
    .line 123
    iget v1, p0, Lg5/g;->E:I

    .line 124
    .line 125
    int-to-float v1, v1

    .line 126
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 127
    .line 128
    .line 129
    iget-object v0, p0, Lg5/g;->g:Landroid/text/TextPaint;

    .line 130
    .line 131
    iget v1, p0, Lg5/g;->F:I

    .line 132
    .line 133
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 134
    .line 135
    .line 136
    iget-boolean v0, p0, Lg5/g;->A:Z

    .line 137
    .line 138
    invoke-virtual {p0, v0}, Lg5/g;->setIsBarcode(Z)V

    .line 139
    .line 140
    .line 141
    return-void
.end method

.method public final b()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lg5/a;->c(Landroid/content/Context;)Landroid/graphics/Point;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget v0, v0, Landroid/graphics/Point;->x:I

    .line 10
    .line 11
    iget v1, p0, Lg5/g;->l:I

    .line 12
    .line 13
    sub-int/2addr v0, v1

    .line 14
    div-int/lit8 v0, v0, 0x2

    .line 15
    .line 16
    new-instance v1, Landroid/graphics/Rect;

    .line 17
    .line 18
    iget v2, p0, Lg5/g;->o:I

    .line 19
    .line 20
    iget v3, p0, Lg5/g;->l:I

    .line 21
    .line 22
    add-int/2addr v3, v0

    .line 23
    iget v4, p0, Lg5/g;->m:I

    .line 24
    .line 25
    add-int/2addr v4, v2

    .line 26
    invoke-direct {v1, v0, v2, v3, v4}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 27
    .line 28
    .line 29
    iput-object v1, p0, Lg5/g;->c:Landroid/graphics/Rect;

    .line 30
    .line 31
    iget-boolean v0, p0, Lg5/g;->A:Z

    .line 32
    .line 33
    const/high16 v2, 0x3f000000    # 0.5f

    .line 34
    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    iget v0, v1, Landroid/graphics/Rect;->left:I

    .line 38
    .line 39
    int-to-float v0, v0

    .line 40
    iget v1, p0, Lg5/g;->V:F

    .line 41
    .line 42
    add-float/2addr v0, v1

    .line 43
    add-float/2addr v0, v2

    .line 44
    iput v0, p0, Lg5/g;->e:F

    .line 45
    .line 46
    iput v0, p0, Lg5/g;->Q:F

    .line 47
    .line 48
    return-void

    .line 49
    :cond_0
    iget v0, v1, Landroid/graphics/Rect;->top:I

    .line 50
    .line 51
    int-to-float v0, v0

    .line 52
    iget v1, p0, Lg5/g;->V:F

    .line 53
    .line 54
    add-float/2addr v0, v1

    .line 55
    add-float/2addr v0, v2

    .line 56
    iput v0, p0, Lg5/g;->d:F

    .line 57
    .line 58
    iput v0, p0, Lg5/g;->P:F

    .line 59
    .line 60
    return-void
.end method

.method public final c(Landroid/graphics/Canvas;)V
    .locals 2

    .line 1
    iget v0, p0, Lg5/g;->v:I

    .line 2
    .line 3
    if-lez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lg5/g;->f:Landroid/graphics/Paint;

    .line 6
    .line 7
    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lg5/g;->f:Landroid/graphics/Paint;

    .line 13
    .line 14
    iget v1, p0, Lg5/g;->w:I

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lg5/g;->f:Landroid/graphics/Paint;

    .line 20
    .line 21
    iget v1, p0, Lg5/g;->v:I

    .line 22
    .line 23
    int-to-float v1, v1

    .line 24
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Lg5/g;->c:Landroid/graphics/Rect;

    .line 28
    .line 29
    iget-object v1, p0, Lg5/g;->f:Landroid/graphics/Paint;

    .line 30
    .line 31
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 32
    .line 33
    .line 34
    :cond_0
    return-void
.end method

.method public final d(Landroid/graphics/Canvas;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lg5/g;->V:F

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    cmpl-float v1, v1, v2

    .line 7
    .line 8
    if-lez v1, :cond_0

    .line 9
    .line 10
    iget-object v1, v0, Lg5/g;->f:Landroid/graphics/Paint;

    .line 11
    .line 12
    sget-object v2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 13
    .line 14
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 15
    .line 16
    .line 17
    iget-object v1, v0, Lg5/g;->f:Landroid/graphics/Paint;

    .line 18
    .line 19
    iget v2, v0, Lg5/g;->i:I

    .line 20
    .line 21
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 22
    .line 23
    .line 24
    iget-object v1, v0, Lg5/g;->f:Landroid/graphics/Paint;

    .line 25
    .line 26
    iget v2, v0, Lg5/g;->k:I

    .line 27
    .line 28
    int-to-float v2, v2

    .line 29
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 30
    .line 31
    .line 32
    iget-object v1, v0, Lg5/g;->c:Landroid/graphics/Rect;

    .line 33
    .line 34
    iget v2, v1, Landroid/graphics/Rect;->left:I

    .line 35
    .line 36
    int-to-float v3, v2

    .line 37
    iget v4, v0, Lg5/g;->V:F

    .line 38
    .line 39
    sub-float v6, v3, v4

    .line 40
    .line 41
    iget v1, v1, Landroid/graphics/Rect;->top:I

    .line 42
    .line 43
    int-to-float v7, v1

    .line 44
    int-to-float v2, v2

    .line 45
    sub-float/2addr v2, v4

    .line 46
    iget v3, v0, Lg5/g;->j:I

    .line 47
    .line 48
    int-to-float v3, v3

    .line 49
    add-float v8, v2, v3

    .line 50
    .line 51
    int-to-float v9, v1

    .line 52
    iget-object v10, v0, Lg5/g;->f:Landroid/graphics/Paint;

    .line 53
    .line 54
    move-object/from16 v5, p1

    .line 55
    .line 56
    invoke-virtual/range {v5 .. v10}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 57
    .line 58
    .line 59
    iget-object v1, v0, Lg5/g;->c:Landroid/graphics/Rect;

    .line 60
    .line 61
    iget v2, v1, Landroid/graphics/Rect;->left:I

    .line 62
    .line 63
    int-to-float v12, v2

    .line 64
    iget v1, v1, Landroid/graphics/Rect;->top:I

    .line 65
    .line 66
    int-to-float v3, v1

    .line 67
    iget v4, v0, Lg5/g;->V:F

    .line 68
    .line 69
    sub-float v13, v3, v4

    .line 70
    .line 71
    int-to-float v14, v2

    .line 72
    int-to-float v1, v1

    .line 73
    sub-float/2addr v1, v4

    .line 74
    iget v2, v0, Lg5/g;->j:I

    .line 75
    .line 76
    int-to-float v2, v2

    .line 77
    add-float v15, v1, v2

    .line 78
    .line 79
    iget-object v1, v0, Lg5/g;->f:Landroid/graphics/Paint;

    .line 80
    .line 81
    move-object/from16 v11, p1

    .line 82
    .line 83
    move-object/from16 v16, v1

    .line 84
    .line 85
    invoke-virtual/range {v11 .. v16}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 86
    .line 87
    .line 88
    iget-object v1, v0, Lg5/g;->c:Landroid/graphics/Rect;

    .line 89
    .line 90
    iget v2, v1, Landroid/graphics/Rect;->right:I

    .line 91
    .line 92
    int-to-float v3, v2

    .line 93
    iget v4, v0, Lg5/g;->V:F

    .line 94
    .line 95
    add-float v12, v3, v4

    .line 96
    .line 97
    iget v1, v1, Landroid/graphics/Rect;->top:I

    .line 98
    .line 99
    int-to-float v13, v1

    .line 100
    int-to-float v2, v2

    .line 101
    add-float/2addr v2, v4

    .line 102
    iget v3, v0, Lg5/g;->j:I

    .line 103
    .line 104
    int-to-float v3, v3

    .line 105
    sub-float v14, v2, v3

    .line 106
    .line 107
    int-to-float v15, v1

    .line 108
    iget-object v1, v0, Lg5/g;->f:Landroid/graphics/Paint;

    .line 109
    .line 110
    move-object/from16 v16, v1

    .line 111
    .line 112
    invoke-virtual/range {v11 .. v16}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 113
    .line 114
    .line 115
    iget-object v1, v0, Lg5/g;->c:Landroid/graphics/Rect;

    .line 116
    .line 117
    iget v2, v1, Landroid/graphics/Rect;->right:I

    .line 118
    .line 119
    int-to-float v12, v2

    .line 120
    iget v1, v1, Landroid/graphics/Rect;->top:I

    .line 121
    .line 122
    int-to-float v3, v1

    .line 123
    iget v4, v0, Lg5/g;->V:F

    .line 124
    .line 125
    sub-float v13, v3, v4

    .line 126
    .line 127
    int-to-float v14, v2

    .line 128
    int-to-float v1, v1

    .line 129
    sub-float/2addr v1, v4

    .line 130
    iget v2, v0, Lg5/g;->j:I

    .line 131
    .line 132
    int-to-float v2, v2

    .line 133
    add-float v15, v1, v2

    .line 134
    .line 135
    iget-object v1, v0, Lg5/g;->f:Landroid/graphics/Paint;

    .line 136
    .line 137
    move-object/from16 v16, v1

    .line 138
    .line 139
    invoke-virtual/range {v11 .. v16}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 140
    .line 141
    .line 142
    iget-object v1, v0, Lg5/g;->c:Landroid/graphics/Rect;

    .line 143
    .line 144
    iget v2, v1, Landroid/graphics/Rect;->left:I

    .line 145
    .line 146
    int-to-float v3, v2

    .line 147
    iget v4, v0, Lg5/g;->V:F

    .line 148
    .line 149
    sub-float v12, v3, v4

    .line 150
    .line 151
    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    .line 152
    .line 153
    int-to-float v13, v1

    .line 154
    int-to-float v2, v2

    .line 155
    sub-float/2addr v2, v4

    .line 156
    iget v3, v0, Lg5/g;->j:I

    .line 157
    .line 158
    int-to-float v3, v3

    .line 159
    add-float v14, v2, v3

    .line 160
    .line 161
    int-to-float v15, v1

    .line 162
    iget-object v1, v0, Lg5/g;->f:Landroid/graphics/Paint;

    .line 163
    .line 164
    move-object/from16 v16, v1

    .line 165
    .line 166
    invoke-virtual/range {v11 .. v16}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 167
    .line 168
    .line 169
    iget-object v1, v0, Lg5/g;->c:Landroid/graphics/Rect;

    .line 170
    .line 171
    iget v2, v1, Landroid/graphics/Rect;->left:I

    .line 172
    .line 173
    int-to-float v12, v2

    .line 174
    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    .line 175
    .line 176
    int-to-float v3, v1

    .line 177
    iget v4, v0, Lg5/g;->V:F

    .line 178
    .line 179
    add-float v13, v3, v4

    .line 180
    .line 181
    int-to-float v14, v2

    .line 182
    int-to-float v1, v1

    .line 183
    add-float/2addr v1, v4

    .line 184
    iget v2, v0, Lg5/g;->j:I

    .line 185
    .line 186
    int-to-float v2, v2

    .line 187
    sub-float v15, v1, v2

    .line 188
    .line 189
    iget-object v1, v0, Lg5/g;->f:Landroid/graphics/Paint;

    .line 190
    .line 191
    move-object/from16 v16, v1

    .line 192
    .line 193
    invoke-virtual/range {v11 .. v16}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 194
    .line 195
    .line 196
    iget-object v1, v0, Lg5/g;->c:Landroid/graphics/Rect;

    .line 197
    .line 198
    iget v2, v1, Landroid/graphics/Rect;->right:I

    .line 199
    .line 200
    int-to-float v3, v2

    .line 201
    iget v4, v0, Lg5/g;->V:F

    .line 202
    .line 203
    add-float v12, v3, v4

    .line 204
    .line 205
    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    .line 206
    .line 207
    int-to-float v13, v1

    .line 208
    int-to-float v2, v2

    .line 209
    add-float/2addr v2, v4

    .line 210
    iget v3, v0, Lg5/g;->j:I

    .line 211
    .line 212
    int-to-float v3, v3

    .line 213
    sub-float v14, v2, v3

    .line 214
    .line 215
    int-to-float v15, v1

    .line 216
    iget-object v1, v0, Lg5/g;->f:Landroid/graphics/Paint;

    .line 217
    .line 218
    move-object/from16 v16, v1

    .line 219
    .line 220
    invoke-virtual/range {v11 .. v16}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 221
    .line 222
    .line 223
    iget-object v1, v0, Lg5/g;->c:Landroid/graphics/Rect;

    .line 224
    .line 225
    iget v2, v1, Landroid/graphics/Rect;->right:I

    .line 226
    .line 227
    int-to-float v12, v2

    .line 228
    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    .line 229
    .line 230
    int-to-float v3, v1

    .line 231
    iget v4, v0, Lg5/g;->V:F

    .line 232
    .line 233
    add-float v13, v3, v4

    .line 234
    .line 235
    int-to-float v14, v2

    .line 236
    int-to-float v1, v1

    .line 237
    add-float/2addr v1, v4

    .line 238
    iget v2, v0, Lg5/g;->j:I

    .line 239
    .line 240
    int-to-float v2, v2

    .line 241
    sub-float v15, v1, v2

    .line 242
    .line 243
    iget-object v1, v0, Lg5/g;->f:Landroid/graphics/Paint;

    .line 244
    .line 245
    move-object/from16 v16, v1

    .line 246
    .line 247
    invoke-virtual/range {v11 .. v16}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 248
    .line 249
    .line 250
    :cond_0
    return-void
.end method

.method public final e(Landroid/graphics/Canvas;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->getWidth()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->getHeight()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    iget v3, v0, Lg5/g;->h:I

    .line 12
    .line 13
    if-eqz v3, :cond_0

    .line 14
    .line 15
    iget-object v3, v0, Lg5/g;->f:Landroid/graphics/Paint;

    .line 16
    .line 17
    sget-object v4, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 18
    .line 19
    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 20
    .line 21
    .line 22
    iget-object v3, v0, Lg5/g;->f:Landroid/graphics/Paint;

    .line 23
    .line 24
    iget v4, v0, Lg5/g;->h:I

    .line 25
    .line 26
    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 27
    .line 28
    .line 29
    int-to-float v8, v1

    .line 30
    iget-object v1, v0, Lg5/g;->c:Landroid/graphics/Rect;

    .line 31
    .line 32
    iget v1, v1, Landroid/graphics/Rect;->top:I

    .line 33
    .line 34
    int-to-float v9, v1

    .line 35
    iget-object v10, v0, Lg5/g;->f:Landroid/graphics/Paint;

    .line 36
    .line 37
    const/4 v6, 0x0

    .line 38
    const/4 v7, 0x0

    .line 39
    move-object/from16 v5, p1

    .line 40
    .line 41
    invoke-virtual/range {v5 .. v10}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 42
    .line 43
    .line 44
    iget-object v1, v0, Lg5/g;->c:Landroid/graphics/Rect;

    .line 45
    .line 46
    iget v3, v1, Landroid/graphics/Rect;->top:I

    .line 47
    .line 48
    int-to-float v13, v3

    .line 49
    iget v3, v1, Landroid/graphics/Rect;->left:I

    .line 50
    .line 51
    int-to-float v14, v3

    .line 52
    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    .line 53
    .line 54
    add-int/lit8 v1, v1, 0x1

    .line 55
    .line 56
    int-to-float v15, v1

    .line 57
    iget-object v1, v0, Lg5/g;->f:Landroid/graphics/Paint;

    .line 58
    .line 59
    const/4 v12, 0x0

    .line 60
    move-object/from16 v11, p1

    .line 61
    .line 62
    move-object/from16 v16, v1

    .line 63
    .line 64
    invoke-virtual/range {v11 .. v16}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 65
    .line 66
    .line 67
    iget-object v1, v0, Lg5/g;->c:Landroid/graphics/Rect;

    .line 68
    .line 69
    iget v3, v1, Landroid/graphics/Rect;->right:I

    .line 70
    .line 71
    add-int/lit8 v3, v3, 0x1

    .line 72
    .line 73
    int-to-float v6, v3

    .line 74
    iget v3, v1, Landroid/graphics/Rect;->top:I

    .line 75
    .line 76
    int-to-float v7, v3

    .line 77
    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    .line 78
    .line 79
    add-int/lit8 v1, v1, 0x1

    .line 80
    .line 81
    int-to-float v9, v1

    .line 82
    iget-object v10, v0, Lg5/g;->f:Landroid/graphics/Paint;

    .line 83
    .line 84
    invoke-virtual/range {v5 .. v10}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 85
    .line 86
    .line 87
    iget-object v1, v0, Lg5/g;->c:Landroid/graphics/Rect;

    .line 88
    .line 89
    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    .line 90
    .line 91
    add-int/lit8 v1, v1, 0x1

    .line 92
    .line 93
    int-to-float v7, v1

    .line 94
    int-to-float v9, v2

    .line 95
    iget-object v10, v0, Lg5/g;->f:Landroid/graphics/Paint;

    .line 96
    .line 97
    const/4 v6, 0x0

    .line 98
    invoke-virtual/range {v5 .. v10}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 99
    .line 100
    .line 101
    :cond_0
    return-void
.end method

.method public final f(Landroid/graphics/Canvas;)V
    .locals 14

    .line 1
    iget-boolean v0, p0, Lg5/g;->A:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/high16 v2, 0x3f000000    # 0.5f

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    if-eqz v0, :cond_3

    .line 8
    .line 9
    iget-object v0, p0, Lg5/g;->O:Landroid/graphics/Bitmap;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    new-instance v0, Landroid/graphics/RectF;

    .line 14
    .line 15
    iget-object v1, p0, Lg5/g;->c:Landroid/graphics/Rect;

    .line 16
    .line 17
    iget v4, v1, Landroid/graphics/Rect;->left:I

    .line 18
    .line 19
    int-to-float v4, v4

    .line 20
    iget v5, p0, Lg5/g;->V:F

    .line 21
    .line 22
    add-float/2addr v4, v5

    .line 23
    add-float/2addr v4, v2

    .line 24
    iget v2, v1, Landroid/graphics/Rect;->top:I

    .line 25
    .line 26
    int-to-float v2, v2

    .line 27
    add-float/2addr v2, v5

    .line 28
    iget v6, p0, Lg5/g;->r:I

    .line 29
    .line 30
    int-to-float v7, v6

    .line 31
    add-float/2addr v2, v7

    .line 32
    iget v7, p0, Lg5/g;->Q:F

    .line 33
    .line 34
    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    .line 35
    .line 36
    int-to-float v1, v1

    .line 37
    sub-float/2addr v1, v5

    .line 38
    int-to-float v5, v6

    .line 39
    sub-float/2addr v1, v5

    .line 40
    invoke-direct {v0, v4, v2, v7, v1}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 41
    .line 42
    .line 43
    new-instance v1, Landroid/graphics/Rect;

    .line 44
    .line 45
    iget-object v2, p0, Lg5/g;->O:Landroid/graphics/Bitmap;

    .line 46
    .line 47
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    int-to-float v2, v2

    .line 52
    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    sub-float/2addr v2, v4

    .line 57
    float-to-int v2, v2

    .line 58
    iget-object v4, p0, Lg5/g;->O:Landroid/graphics/Bitmap;

    .line 59
    .line 60
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getWidth()I

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    iget-object v5, p0, Lg5/g;->O:Landroid/graphics/Bitmap;

    .line 65
    .line 66
    invoke-virtual {v5}, Landroid/graphics/Bitmap;->getHeight()I

    .line 67
    .line 68
    .line 69
    move-result v5

    .line 70
    invoke-direct {v1, v2, v3, v4, v5}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 71
    .line 72
    .line 73
    iget v2, v1, Landroid/graphics/Rect;->left:I

    .line 74
    .line 75
    if-gez v2, :cond_0

    .line 76
    .line 77
    iput v3, v1, Landroid/graphics/Rect;->left:I

    .line 78
    .line 79
    iget v2, v0, Landroid/graphics/RectF;->right:F

    .line 80
    .line 81
    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    int-to-float v3, v3

    .line 86
    sub-float/2addr v2, v3

    .line 87
    iput v2, v0, Landroid/graphics/RectF;->left:F

    .line 88
    .line 89
    :cond_0
    iget-object v2, p0, Lg5/g;->O:Landroid/graphics/Bitmap;

    .line 90
    .line 91
    iget-object v3, p0, Lg5/g;->f:Landroid/graphics/Paint;

    .line 92
    .line 93
    invoke-virtual {p1, v2, v1, v0, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 94
    .line 95
    .line 96
    return-void

    .line 97
    :cond_1
    iget-object v0, p0, Lg5/g;->u:Landroid/graphics/Bitmap;

    .line 98
    .line 99
    if-eqz v0, :cond_2

    .line 100
    .line 101
    new-instance v0, Landroid/graphics/RectF;

    .line 102
    .line 103
    iget v2, p0, Lg5/g;->e:F

    .line 104
    .line 105
    iget-object v3, p0, Lg5/g;->c:Landroid/graphics/Rect;

    .line 106
    .line 107
    iget v3, v3, Landroid/graphics/Rect;->top:I

    .line 108
    .line 109
    int-to-float v3, v3

    .line 110
    iget v4, p0, Lg5/g;->V:F

    .line 111
    .line 112
    add-float/2addr v3, v4

    .line 113
    iget v4, p0, Lg5/g;->r:I

    .line 114
    .line 115
    int-to-float v4, v4

    .line 116
    add-float/2addr v3, v4

    .line 117
    iget-object v4, p0, Lg5/g;->u:Landroid/graphics/Bitmap;

    .line 118
    .line 119
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getWidth()I

    .line 120
    .line 121
    .line 122
    move-result v4

    .line 123
    int-to-float v4, v4

    .line 124
    add-float/2addr v4, v2

    .line 125
    iget-object v5, p0, Lg5/g;->c:Landroid/graphics/Rect;

    .line 126
    .line 127
    iget v5, v5, Landroid/graphics/Rect;->bottom:I

    .line 128
    .line 129
    int-to-float v5, v5

    .line 130
    iget v6, p0, Lg5/g;->V:F

    .line 131
    .line 132
    sub-float/2addr v5, v6

    .line 133
    iget v6, p0, Lg5/g;->r:I

    .line 134
    .line 135
    int-to-float v6, v6

    .line 136
    sub-float/2addr v5, v6

    .line 137
    invoke-direct {v0, v2, v3, v4, v5}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 138
    .line 139
    .line 140
    iget-object v2, p0, Lg5/g;->u:Landroid/graphics/Bitmap;

    .line 141
    .line 142
    iget-object v3, p0, Lg5/g;->f:Landroid/graphics/Paint;

    .line 143
    .line 144
    invoke-virtual {p1, v2, v1, v0, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 145
    .line 146
    .line 147
    return-void

    .line 148
    :cond_2
    iget-object v0, p0, Lg5/g;->f:Landroid/graphics/Paint;

    .line 149
    .line 150
    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 151
    .line 152
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 153
    .line 154
    .line 155
    iget-object v0, p0, Lg5/g;->f:Landroid/graphics/Paint;

    .line 156
    .line 157
    iget v1, p0, Lg5/g;->q:I

    .line 158
    .line 159
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 160
    .line 161
    .line 162
    iget v3, p0, Lg5/g;->e:F

    .line 163
    .line 164
    iget-object v0, p0, Lg5/g;->c:Landroid/graphics/Rect;

    .line 165
    .line 166
    iget v1, v0, Landroid/graphics/Rect;->top:I

    .line 167
    .line 168
    int-to-float v1, v1

    .line 169
    iget v2, p0, Lg5/g;->V:F

    .line 170
    .line 171
    add-float/2addr v1, v2

    .line 172
    iget v4, p0, Lg5/g;->r:I

    .line 173
    .line 174
    int-to-float v5, v4

    .line 175
    add-float/2addr v1, v5

    .line 176
    iget v5, p0, Lg5/g;->p:I

    .line 177
    .line 178
    int-to-float v5, v5

    .line 179
    add-float/2addr v5, v3

    .line 180
    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    .line 181
    .line 182
    int-to-float v0, v0

    .line 183
    sub-float/2addr v0, v2

    .line 184
    int-to-float v2, v4

    .line 185
    sub-float v6, v0, v2

    .line 186
    .line 187
    iget-object v7, p0, Lg5/g;->f:Landroid/graphics/Paint;

    .line 188
    .line 189
    move-object v2, p1

    .line 190
    move v4, v1

    .line 191
    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 192
    .line 193
    .line 194
    return-void

    .line 195
    :cond_3
    move-object v8, p1

    .line 196
    iget-object p1, p0, Lg5/g;->O:Landroid/graphics/Bitmap;

    .line 197
    .line 198
    if-eqz p1, :cond_5

    .line 199
    .line 200
    new-instance p1, Landroid/graphics/RectF;

    .line 201
    .line 202
    iget-object v0, p0, Lg5/g;->c:Landroid/graphics/Rect;

    .line 203
    .line 204
    iget v1, v0, Landroid/graphics/Rect;->left:I

    .line 205
    .line 206
    int-to-float v1, v1

    .line 207
    iget v4, p0, Lg5/g;->V:F

    .line 208
    .line 209
    add-float/2addr v1, v4

    .line 210
    iget v5, p0, Lg5/g;->r:I

    .line 211
    .line 212
    int-to-float v6, v5

    .line 213
    add-float/2addr v1, v6

    .line 214
    iget v6, v0, Landroid/graphics/Rect;->top:I

    .line 215
    .line 216
    int-to-float v6, v6

    .line 217
    add-float/2addr v6, v4

    .line 218
    add-float/2addr v6, v2

    .line 219
    iget v0, v0, Landroid/graphics/Rect;->right:I

    .line 220
    .line 221
    int-to-float v0, v0

    .line 222
    sub-float/2addr v0, v4

    .line 223
    int-to-float v2, v5

    .line 224
    sub-float/2addr v0, v2

    .line 225
    iget v2, p0, Lg5/g;->P:F

    .line 226
    .line 227
    invoke-direct {p1, v1, v6, v0, v2}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 228
    .line 229
    .line 230
    new-instance v0, Landroid/graphics/Rect;

    .line 231
    .line 232
    iget-object v1, p0, Lg5/g;->O:Landroid/graphics/Bitmap;

    .line 233
    .line 234
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 235
    .line 236
    .line 237
    move-result v1

    .line 238
    int-to-float v1, v1

    .line 239
    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    .line 240
    .line 241
    .line 242
    move-result v2

    .line 243
    sub-float/2addr v1, v2

    .line 244
    float-to-int v1, v1

    .line 245
    iget-object v2, p0, Lg5/g;->O:Landroid/graphics/Bitmap;

    .line 246
    .line 247
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 248
    .line 249
    .line 250
    move-result v2

    .line 251
    iget-object v4, p0, Lg5/g;->O:Landroid/graphics/Bitmap;

    .line 252
    .line 253
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I

    .line 254
    .line 255
    .line 256
    move-result v4

    .line 257
    invoke-direct {v0, v3, v1, v2, v4}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 258
    .line 259
    .line 260
    iget v1, v0, Landroid/graphics/Rect;->top:I

    .line 261
    .line 262
    if-gez v1, :cond_4

    .line 263
    .line 264
    iput v3, v0, Landroid/graphics/Rect;->top:I

    .line 265
    .line 266
    iget v1, p1, Landroid/graphics/RectF;->bottom:F

    .line 267
    .line 268
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    .line 269
    .line 270
    .line 271
    move-result v2

    .line 272
    int-to-float v2, v2

    .line 273
    sub-float/2addr v1, v2

    .line 274
    iput v1, p1, Landroid/graphics/RectF;->top:F

    .line 275
    .line 276
    :cond_4
    iget-object v1, p0, Lg5/g;->O:Landroid/graphics/Bitmap;

    .line 277
    .line 278
    iget-object v2, p0, Lg5/g;->f:Landroid/graphics/Paint;

    .line 279
    .line 280
    invoke-virtual {v8, v1, v0, p1, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 281
    .line 282
    .line 283
    return-void

    .line 284
    :cond_5
    iget-object p1, p0, Lg5/g;->u:Landroid/graphics/Bitmap;

    .line 285
    .line 286
    if-eqz p1, :cond_6

    .line 287
    .line 288
    new-instance p1, Landroid/graphics/RectF;

    .line 289
    .line 290
    iget-object v0, p0, Lg5/g;->c:Landroid/graphics/Rect;

    .line 291
    .line 292
    iget v2, v0, Landroid/graphics/Rect;->left:I

    .line 293
    .line 294
    int-to-float v2, v2

    .line 295
    iget v3, p0, Lg5/g;->V:F

    .line 296
    .line 297
    add-float/2addr v2, v3

    .line 298
    iget v4, p0, Lg5/g;->r:I

    .line 299
    .line 300
    int-to-float v5, v4

    .line 301
    add-float/2addr v2, v5

    .line 302
    iget v5, p0, Lg5/g;->d:F

    .line 303
    .line 304
    iget v0, v0, Landroid/graphics/Rect;->right:I

    .line 305
    .line 306
    int-to-float v0, v0

    .line 307
    sub-float/2addr v0, v3

    .line 308
    int-to-float v3, v4

    .line 309
    sub-float/2addr v0, v3

    .line 310
    iget-object v3, p0, Lg5/g;->u:Landroid/graphics/Bitmap;

    .line 311
    .line 312
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    .line 313
    .line 314
    .line 315
    move-result v3

    .line 316
    int-to-float v3, v3

    .line 317
    add-float/2addr v3, v5

    .line 318
    invoke-direct {p1, v2, v5, v0, v3}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 319
    .line 320
    .line 321
    iget-object v0, p0, Lg5/g;->u:Landroid/graphics/Bitmap;

    .line 322
    .line 323
    iget-object v2, p0, Lg5/g;->f:Landroid/graphics/Paint;

    .line 324
    .line 325
    invoke-virtual {v8, v0, v1, p1, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 326
    .line 327
    .line 328
    return-void

    .line 329
    :cond_6
    iget-object p1, p0, Lg5/g;->f:Landroid/graphics/Paint;

    .line 330
    .line 331
    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 332
    .line 333
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 334
    .line 335
    .line 336
    iget-object p1, p0, Lg5/g;->f:Landroid/graphics/Paint;

    .line 337
    .line 338
    iget v0, p0, Lg5/g;->q:I

    .line 339
    .line 340
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 341
    .line 342
    .line 343
    iget-object p1, p0, Lg5/g;->c:Landroid/graphics/Rect;

    .line 344
    .line 345
    iget v0, p1, Landroid/graphics/Rect;->left:I

    .line 346
    .line 347
    int-to-float v0, v0

    .line 348
    iget v1, p0, Lg5/g;->V:F

    .line 349
    .line 350
    add-float/2addr v0, v1

    .line 351
    iget v2, p0, Lg5/g;->r:I

    .line 352
    .line 353
    int-to-float v3, v2

    .line 354
    add-float v9, v0, v3

    .line 355
    .line 356
    iget v10, p0, Lg5/g;->d:F

    .line 357
    .line 358
    iget p1, p1, Landroid/graphics/Rect;->right:I

    .line 359
    .line 360
    int-to-float p1, p1

    .line 361
    sub-float/2addr p1, v1

    .line 362
    int-to-float v0, v2

    .line 363
    sub-float v11, p1, v0

    .line 364
    .line 365
    iget p1, p0, Lg5/g;->p:I

    .line 366
    .line 367
    int-to-float p1, p1

    .line 368
    add-float v12, v10, p1

    .line 369
    .line 370
    iget-object v13, p0, Lg5/g;->f:Landroid/graphics/Paint;

    .line 371
    .line 372
    invoke-virtual/range {v8 .. v13}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 373
    .line 374
    .line 375
    return-void
.end method

.method public final g(Landroid/graphics/Canvas;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lg5/g;->D:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_8

    .line 8
    .line 9
    iget-object v0, p0, Lg5/g;->W:Landroid/text/StaticLayout;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto/16 :goto_4

    .line 14
    .line 15
    :cond_0
    iget-boolean v0, p0, Lg5/g;->G:Z

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    const/4 v2, 0x0

    .line 19
    if-eqz v0, :cond_4

    .line 20
    .line 21
    iget-boolean v0, p0, Lg5/g;->K:Z

    .line 22
    .line 23
    if-eqz v0, :cond_2

    .line 24
    .line 25
    iget-object v0, p0, Lg5/g;->f:Landroid/graphics/Paint;

    .line 26
    .line 27
    iget v3, p0, Lg5/g;->J:I

    .line 28
    .line 29
    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Lg5/g;->f:Landroid/graphics/Paint;

    .line 33
    .line 34
    sget-object v3, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 35
    .line 36
    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 37
    .line 38
    .line 39
    iget-boolean v0, p0, Lg5/g;->I:Z

    .line 40
    .line 41
    if-eqz v0, :cond_1

    .line 42
    .line 43
    new-instance v0, Landroid/graphics/Rect;

    .line 44
    .line 45
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 46
    .line 47
    .line 48
    iget-object v3, p0, Lg5/g;->g:Landroid/text/TextPaint;

    .line 49
    .line 50
    iget-object v4, p0, Lg5/g;->D:Ljava/lang/String;

    .line 51
    .line 52
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 53
    .line 54
    .line 55
    move-result v5

    .line 56
    invoke-virtual {v3, v4, v2, v5, v0}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    sub-int/2addr v2, v3

    .line 68
    div-int/lit8 v2, v2, 0x2

    .line 69
    .line 70
    iget v3, p0, Lg5/g;->c0:I

    .line 71
    .line 72
    sub-int/2addr v2, v3

    .line 73
    int-to-float v2, v2

    .line 74
    new-instance v3, Landroid/graphics/RectF;

    .line 75
    .line 76
    iget-object v4, p0, Lg5/g;->c:Landroid/graphics/Rect;

    .line 77
    .line 78
    iget v4, v4, Landroid/graphics/Rect;->bottom:I

    .line 79
    .line 80
    iget v5, p0, Lg5/g;->H:I

    .line 81
    .line 82
    add-int/2addr v4, v5

    .line 83
    iget v5, p0, Lg5/g;->c0:I

    .line 84
    .line 85
    sub-int/2addr v4, v5

    .line 86
    int-to-float v4, v4

    .line 87
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    int-to-float v0, v0

    .line 92
    add-float/2addr v0, v2

    .line 93
    iget v5, p0, Lg5/g;->c0:I

    .line 94
    .line 95
    mul-int/lit8 v5, v5, 0x2

    .line 96
    .line 97
    int-to-float v5, v5

    .line 98
    add-float/2addr v0, v5

    .line 99
    iget-object v5, p0, Lg5/g;->c:Landroid/graphics/Rect;

    .line 100
    .line 101
    iget v5, v5, Landroid/graphics/Rect;->bottom:I

    .line 102
    .line 103
    iget v6, p0, Lg5/g;->H:I

    .line 104
    .line 105
    add-int/2addr v5, v6

    .line 106
    iget-object v6, p0, Lg5/g;->W:Landroid/text/StaticLayout;

    .line 107
    .line 108
    invoke-virtual {v6}, Landroid/text/Layout;->getHeight()I

    .line 109
    .line 110
    .line 111
    move-result v6

    .line 112
    add-int/2addr v5, v6

    .line 113
    iget v6, p0, Lg5/g;->c0:I

    .line 114
    .line 115
    add-int/2addr v5, v6

    .line 116
    int-to-float v5, v5

    .line 117
    invoke-direct {v3, v2, v4, v0, v5}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 118
    .line 119
    .line 120
    iget v0, p0, Lg5/g;->c0:I

    .line 121
    .line 122
    int-to-float v2, v0

    .line 123
    int-to-float v0, v0

    .line 124
    iget-object v4, p0, Lg5/g;->f:Landroid/graphics/Paint;

    .line 125
    .line 126
    invoke-virtual {p1, v3, v2, v0, v4}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 127
    .line 128
    .line 129
    goto :goto_0

    .line 130
    :cond_1
    new-instance v0, Landroid/graphics/RectF;

    .line 131
    .line 132
    iget-object v2, p0, Lg5/g;->c:Landroid/graphics/Rect;

    .line 133
    .line 134
    iget v3, v2, Landroid/graphics/Rect;->left:I

    .line 135
    .line 136
    int-to-float v3, v3

    .line 137
    iget v4, v2, Landroid/graphics/Rect;->bottom:I

    .line 138
    .line 139
    iget v5, p0, Lg5/g;->H:I

    .line 140
    .line 141
    add-int v6, v4, v5

    .line 142
    .line 143
    iget v7, p0, Lg5/g;->c0:I

    .line 144
    .line 145
    sub-int/2addr v6, v7

    .line 146
    int-to-float v6, v6

    .line 147
    iget v2, v2, Landroid/graphics/Rect;->right:I

    .line 148
    .line 149
    int-to-float v2, v2

    .line 150
    add-int/2addr v4, v5

    .line 151
    iget-object v5, p0, Lg5/g;->W:Landroid/text/StaticLayout;

    .line 152
    .line 153
    invoke-virtual {v5}, Landroid/text/Layout;->getHeight()I

    .line 154
    .line 155
    .line 156
    move-result v5

    .line 157
    add-int/2addr v4, v5

    .line 158
    iget v5, p0, Lg5/g;->c0:I

    .line 159
    .line 160
    add-int/2addr v4, v5

    .line 161
    int-to-float v4, v4

    .line 162
    invoke-direct {v0, v3, v6, v2, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 163
    .line 164
    .line 165
    iget v2, p0, Lg5/g;->c0:I

    .line 166
    .line 167
    int-to-float v3, v2

    .line 168
    int-to-float v2, v2

    .line 169
    iget-object v4, p0, Lg5/g;->f:Landroid/graphics/Paint;

    .line 170
    .line 171
    invoke-virtual {p1, v0, v3, v2, v4}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 172
    .line 173
    .line 174
    :cond_2
    :goto_0
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 175
    .line 176
    .line 177
    iget-boolean v0, p0, Lg5/g;->I:Z

    .line 178
    .line 179
    if-eqz v0, :cond_3

    .line 180
    .line 181
    iget-object v0, p0, Lg5/g;->c:Landroid/graphics/Rect;

    .line 182
    .line 183
    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    .line 184
    .line 185
    iget v2, p0, Lg5/g;->H:I

    .line 186
    .line 187
    add-int/2addr v0, v2

    .line 188
    int-to-float v0, v0

    .line 189
    invoke-virtual {p1, v1, v0}, Landroid/graphics/Canvas;->translate(FF)V

    .line 190
    .line 191
    .line 192
    goto :goto_1

    .line 193
    :cond_3
    iget-object v0, p0, Lg5/g;->c:Landroid/graphics/Rect;

    .line 194
    .line 195
    iget v1, v0, Landroid/graphics/Rect;->left:I

    .line 196
    .line 197
    iget v2, p0, Lg5/g;->c0:I

    .line 198
    .line 199
    add-int/2addr v1, v2

    .line 200
    int-to-float v1, v1

    .line 201
    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    .line 202
    .line 203
    iget v2, p0, Lg5/g;->H:I

    .line 204
    .line 205
    add-int/2addr v0, v2

    .line 206
    int-to-float v0, v0

    .line 207
    invoke-virtual {p1, v1, v0}, Landroid/graphics/Canvas;->translate(FF)V

    .line 208
    .line 209
    .line 210
    :goto_1
    iget-object v0, p0, Lg5/g;->W:Landroid/text/StaticLayout;

    .line 211
    .line 212
    invoke-virtual {v0, p1}, Landroid/text/Layout;->draw(Landroid/graphics/Canvas;)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 216
    .line 217
    .line 218
    return-void

    .line 219
    :cond_4
    iget-boolean v0, p0, Lg5/g;->K:Z

    .line 220
    .line 221
    if-eqz v0, :cond_6

    .line 222
    .line 223
    iget-object v0, p0, Lg5/g;->f:Landroid/graphics/Paint;

    .line 224
    .line 225
    iget v3, p0, Lg5/g;->J:I

    .line 226
    .line 227
    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 228
    .line 229
    .line 230
    iget-object v0, p0, Lg5/g;->f:Landroid/graphics/Paint;

    .line 231
    .line 232
    sget-object v3, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 233
    .line 234
    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 235
    .line 236
    .line 237
    iget-boolean v0, p0, Lg5/g;->I:Z

    .line 238
    .line 239
    if-eqz v0, :cond_5

    .line 240
    .line 241
    new-instance v0, Landroid/graphics/Rect;

    .line 242
    .line 243
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 244
    .line 245
    .line 246
    iget-object v3, p0, Lg5/g;->g:Landroid/text/TextPaint;

    .line 247
    .line 248
    iget-object v4, p0, Lg5/g;->D:Ljava/lang/String;

    .line 249
    .line 250
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 251
    .line 252
    .line 253
    move-result v5

    .line 254
    invoke-virtual {v3, v4, v2, v5, v0}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    .line 258
    .line 259
    .line 260
    move-result v2

    .line 261
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 262
    .line 263
    .line 264
    move-result v3

    .line 265
    sub-int/2addr v2, v3

    .line 266
    div-int/lit8 v2, v2, 0x2

    .line 267
    .line 268
    iget v3, p0, Lg5/g;->c0:I

    .line 269
    .line 270
    sub-int/2addr v2, v3

    .line 271
    int-to-float v2, v2

    .line 272
    new-instance v3, Landroid/graphics/RectF;

    .line 273
    .line 274
    iget-object v4, p0, Lg5/g;->c:Landroid/graphics/Rect;

    .line 275
    .line 276
    iget v4, v4, Landroid/graphics/Rect;->top:I

    .line 277
    .line 278
    iget v5, p0, Lg5/g;->H:I

    .line 279
    .line 280
    sub-int/2addr v4, v5

    .line 281
    iget-object v5, p0, Lg5/g;->W:Landroid/text/StaticLayout;

    .line 282
    .line 283
    invoke-virtual {v5}, Landroid/text/Layout;->getHeight()I

    .line 284
    .line 285
    .line 286
    move-result v5

    .line 287
    sub-int/2addr v4, v5

    .line 288
    iget v5, p0, Lg5/g;->c0:I

    .line 289
    .line 290
    sub-int/2addr v4, v5

    .line 291
    int-to-float v4, v4

    .line 292
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 293
    .line 294
    .line 295
    move-result v0

    .line 296
    int-to-float v0, v0

    .line 297
    add-float/2addr v0, v2

    .line 298
    iget v5, p0, Lg5/g;->c0:I

    .line 299
    .line 300
    mul-int/lit8 v6, v5, 0x2

    .line 301
    .line 302
    int-to-float v6, v6

    .line 303
    add-float/2addr v0, v6

    .line 304
    iget-object v6, p0, Lg5/g;->c:Landroid/graphics/Rect;

    .line 305
    .line 306
    iget v6, v6, Landroid/graphics/Rect;->top:I

    .line 307
    .line 308
    iget v7, p0, Lg5/g;->H:I

    .line 309
    .line 310
    sub-int/2addr v6, v7

    .line 311
    add-int/2addr v6, v5

    .line 312
    int-to-float v5, v6

    .line 313
    invoke-direct {v3, v2, v4, v0, v5}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 314
    .line 315
    .line 316
    iget v0, p0, Lg5/g;->c0:I

    .line 317
    .line 318
    int-to-float v2, v0

    .line 319
    int-to-float v0, v0

    .line 320
    iget-object v4, p0, Lg5/g;->f:Landroid/graphics/Paint;

    .line 321
    .line 322
    invoke-virtual {p1, v3, v2, v0, v4}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 323
    .line 324
    .line 325
    goto :goto_2

    .line 326
    :cond_5
    new-instance v0, Landroid/graphics/RectF;

    .line 327
    .line 328
    iget-object v2, p0, Lg5/g;->c:Landroid/graphics/Rect;

    .line 329
    .line 330
    iget v3, v2, Landroid/graphics/Rect;->left:I

    .line 331
    .line 332
    int-to-float v3, v3

    .line 333
    iget v2, v2, Landroid/graphics/Rect;->top:I

    .line 334
    .line 335
    iget v4, p0, Lg5/g;->H:I

    .line 336
    .line 337
    sub-int/2addr v2, v4

    .line 338
    iget-object v4, p0, Lg5/g;->W:Landroid/text/StaticLayout;

    .line 339
    .line 340
    invoke-virtual {v4}, Landroid/text/Layout;->getHeight()I

    .line 341
    .line 342
    .line 343
    move-result v4

    .line 344
    sub-int/2addr v2, v4

    .line 345
    iget v4, p0, Lg5/g;->c0:I

    .line 346
    .line 347
    sub-int/2addr v2, v4

    .line 348
    int-to-float v2, v2

    .line 349
    iget-object v5, p0, Lg5/g;->c:Landroid/graphics/Rect;

    .line 350
    .line 351
    iget v6, v5, Landroid/graphics/Rect;->right:I

    .line 352
    .line 353
    int-to-float v6, v6

    .line 354
    iget v5, v5, Landroid/graphics/Rect;->top:I

    .line 355
    .line 356
    iget v7, p0, Lg5/g;->H:I

    .line 357
    .line 358
    sub-int/2addr v5, v7

    .line 359
    add-int/2addr v5, v4

    .line 360
    int-to-float v4, v5

    .line 361
    invoke-direct {v0, v3, v2, v6, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 362
    .line 363
    .line 364
    iget v2, p0, Lg5/g;->c0:I

    .line 365
    .line 366
    int-to-float v3, v2

    .line 367
    int-to-float v2, v2

    .line 368
    iget-object v4, p0, Lg5/g;->f:Landroid/graphics/Paint;

    .line 369
    .line 370
    invoke-virtual {p1, v0, v3, v2, v4}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 371
    .line 372
    .line 373
    :cond_6
    :goto_2
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 374
    .line 375
    .line 376
    iget-boolean v0, p0, Lg5/g;->I:Z

    .line 377
    .line 378
    if-eqz v0, :cond_7

    .line 379
    .line 380
    iget-object v0, p0, Lg5/g;->c:Landroid/graphics/Rect;

    .line 381
    .line 382
    iget v0, v0, Landroid/graphics/Rect;->top:I

    .line 383
    .line 384
    iget v2, p0, Lg5/g;->H:I

    .line 385
    .line 386
    sub-int/2addr v0, v2

    .line 387
    iget-object v2, p0, Lg5/g;->W:Landroid/text/StaticLayout;

    .line 388
    .line 389
    invoke-virtual {v2}, Landroid/text/Layout;->getHeight()I

    .line 390
    .line 391
    .line 392
    move-result v2

    .line 393
    sub-int/2addr v0, v2

    .line 394
    int-to-float v0, v0

    .line 395
    invoke-virtual {p1, v1, v0}, Landroid/graphics/Canvas;->translate(FF)V

    .line 396
    .line 397
    .line 398
    goto :goto_3

    .line 399
    :cond_7
    iget-object v0, p0, Lg5/g;->c:Landroid/graphics/Rect;

    .line 400
    .line 401
    iget v1, v0, Landroid/graphics/Rect;->left:I

    .line 402
    .line 403
    iget v2, p0, Lg5/g;->c0:I

    .line 404
    .line 405
    add-int/2addr v1, v2

    .line 406
    int-to-float v1, v1

    .line 407
    iget v0, v0, Landroid/graphics/Rect;->top:I

    .line 408
    .line 409
    iget v2, p0, Lg5/g;->H:I

    .line 410
    .line 411
    sub-int/2addr v0, v2

    .line 412
    iget-object v2, p0, Lg5/g;->W:Landroid/text/StaticLayout;

    .line 413
    .line 414
    invoke-virtual {v2}, Landroid/text/Layout;->getHeight()I

    .line 415
    .line 416
    .line 417
    move-result v2

    .line 418
    sub-int/2addr v0, v2

    .line 419
    int-to-float v0, v0

    .line 420
    invoke-virtual {p1, v1, v0}, Landroid/graphics/Canvas;->translate(FF)V

    .line 421
    .line 422
    .line 423
    :goto_3
    iget-object v0, p0, Lg5/g;->W:Landroid/text/StaticLayout;

    .line 424
    .line 425
    invoke-virtual {v0, p1}, Landroid/text/Layout;->draw(Landroid/graphics/Canvas;)V

    .line 426
    .line 427
    .line 428
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 429
    .line 430
    .line 431
    :cond_8
    :goto_4
    return-void
.end method

.method public getIsBarcode()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lg5/g;->A:Z

    .line 2
    .line 3
    return v0
.end method

.method public final h(ILandroid/content/res/TypedArray;)V
    .locals 1

    .line 1
    sget v0, Lcom/zykj/camera/R$styleable;->QRCodeView_asv_topOffset:I

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Lg5/g;->o:I

    .line 6
    .line 7
    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    iput p1, p0, Lg5/g;->o:I

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    sget v0, Lcom/zykj/camera/R$styleable;->QRCodeView_asv_cornerSize:I

    .line 15
    .line 16
    if-ne p1, v0, :cond_1

    .line 17
    .line 18
    iget v0, p0, Lg5/g;->k:I

    .line 19
    .line 20
    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    iput p1, p0, Lg5/g;->k:I

    .line 25
    .line 26
    return-void

    .line 27
    :cond_1
    sget v0, Lcom/zykj/camera/R$styleable;->QRCodeView_asv_cornerLength:I

    .line 28
    .line 29
    if-ne p1, v0, :cond_2

    .line 30
    .line 31
    iget v0, p0, Lg5/g;->j:I

    .line 32
    .line 33
    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    iput p1, p0, Lg5/g;->j:I

    .line 38
    .line 39
    return-void

    .line 40
    :cond_2
    sget v0, Lcom/zykj/camera/R$styleable;->QRCodeView_asv_scanLineSize:I

    .line 41
    .line 42
    if-ne p1, v0, :cond_3

    .line 43
    .line 44
    iget v0, p0, Lg5/g;->p:I

    .line 45
    .line 46
    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    iput p1, p0, Lg5/g;->p:I

    .line 51
    .line 52
    return-void

    .line 53
    :cond_3
    sget v0, Lcom/zykj/camera/R$styleable;->QRCodeView_asv_rectWidth:I

    .line 54
    .line 55
    if-ne p1, v0, :cond_4

    .line 56
    .line 57
    iget v0, p0, Lg5/g;->l:I

    .line 58
    .line 59
    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    iput p1, p0, Lg5/g;->l:I

    .line 64
    .line 65
    return-void

    .line 66
    :cond_4
    sget v0, Lcom/zykj/camera/R$styleable;->QRCodeView_asv_rectHeight:I

    .line 67
    .line 68
    if-ne p1, v0, :cond_5

    .line 69
    .line 70
    iget v0, p0, Lg5/g;->m:I

    .line 71
    .line 72
    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    iput p1, p0, Lg5/g;->m:I

    .line 77
    .line 78
    return-void

    .line 79
    :cond_5
    sget v0, Lcom/zykj/camera/R$styleable;->QRCodeView_asv_maskColor:I

    .line 80
    .line 81
    if-ne p1, v0, :cond_6

    .line 82
    .line 83
    iget v0, p0, Lg5/g;->h:I

    .line 84
    .line 85
    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    iput p1, p0, Lg5/g;->h:I

    .line 90
    .line 91
    return-void

    .line 92
    :cond_6
    sget v0, Lcom/zykj/camera/R$styleable;->QRCodeView_asv_cornerColor:I

    .line 93
    .line 94
    if-ne p1, v0, :cond_7

    .line 95
    .line 96
    iget v0, p0, Lg5/g;->i:I

    .line 97
    .line 98
    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    iput p1, p0, Lg5/g;->i:I

    .line 103
    .line 104
    return-void

    .line 105
    :cond_7
    sget v0, Lcom/zykj/camera/R$styleable;->QRCodeView_asv_scanLineColor:I

    .line 106
    .line 107
    if-ne p1, v0, :cond_8

    .line 108
    .line 109
    iget v0, p0, Lg5/g;->q:I

    .line 110
    .line 111
    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 112
    .line 113
    .line 114
    move-result p1

    .line 115
    iput p1, p0, Lg5/g;->q:I

    .line 116
    .line 117
    return-void

    .line 118
    :cond_8
    sget v0, Lcom/zykj/camera/R$styleable;->QRCodeView_asv_scanLineMargin:I

    .line 119
    .line 120
    if-ne p1, v0, :cond_9

    .line 121
    .line 122
    iget v0, p0, Lg5/g;->r:I

    .line 123
    .line 124
    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 125
    .line 126
    .line 127
    move-result p1

    .line 128
    iput p1, p0, Lg5/g;->r:I

    .line 129
    .line 130
    return-void

    .line 131
    :cond_9
    sget v0, Lcom/zykj/camera/R$styleable;->QRCodeView_asv_isShowDefaultScanLineDrawable:I

    .line 132
    .line 133
    if-ne p1, v0, :cond_a

    .line 134
    .line 135
    iget-boolean v0, p0, Lg5/g;->s:Z

    .line 136
    .line 137
    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 138
    .line 139
    .line 140
    move-result p1

    .line 141
    iput-boolean p1, p0, Lg5/g;->s:Z

    .line 142
    .line 143
    return-void

    .line 144
    :cond_a
    sget v0, Lcom/zykj/camera/R$styleable;->QRCodeView_asv_customScanLineDrawable:I

    .line 145
    .line 146
    if-ne p1, v0, :cond_b

    .line 147
    .line 148
    invoke-virtual {p2, p1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    iput-object p1, p0, Lg5/g;->t:Landroid/graphics/drawable/Drawable;

    .line 153
    .line 154
    return-void

    .line 155
    :cond_b
    sget v0, Lcom/zykj/camera/R$styleable;->QRCodeView_asv_borderSize:I

    .line 156
    .line 157
    if-ne p1, v0, :cond_c

    .line 158
    .line 159
    iget v0, p0, Lg5/g;->v:I

    .line 160
    .line 161
    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 162
    .line 163
    .line 164
    move-result p1

    .line 165
    iput p1, p0, Lg5/g;->v:I

    .line 166
    .line 167
    return-void

    .line 168
    :cond_c
    sget v0, Lcom/zykj/camera/R$styleable;->QRCodeView_asv_borderColor:I

    .line 169
    .line 170
    if-ne p1, v0, :cond_d

    .line 171
    .line 172
    iget v0, p0, Lg5/g;->w:I

    .line 173
    .line 174
    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 175
    .line 176
    .line 177
    move-result p1

    .line 178
    iput p1, p0, Lg5/g;->w:I

    .line 179
    .line 180
    return-void

    .line 181
    :cond_d
    sget v0, Lcom/zykj/camera/R$styleable;->QRCodeView_asv_animTime:I

    .line 182
    .line 183
    if-ne p1, v0, :cond_e

    .line 184
    .line 185
    iget v0, p0, Lg5/g;->x:I

    .line 186
    .line 187
    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getInteger(II)I

    .line 188
    .line 189
    .line 190
    move-result p1

    .line 191
    iput p1, p0, Lg5/g;->x:I

    .line 192
    .line 193
    return-void

    .line 194
    :cond_e
    sget v0, Lcom/zykj/camera/R$styleable;->QRCodeView_asv_isCenterVertical:I

    .line 195
    .line 196
    if-ne p1, v0, :cond_f

    .line 197
    .line 198
    iget-boolean v0, p0, Lg5/g;->y:Z

    .line 199
    .line 200
    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 201
    .line 202
    .line 203
    move-result p1

    .line 204
    iput-boolean p1, p0, Lg5/g;->y:Z

    .line 205
    .line 206
    return-void

    .line 207
    :cond_f
    sget v0, Lcom/zykj/camera/R$styleable;->QRCodeView_asv_toolbarHeight:I

    .line 208
    .line 209
    if-ne p1, v0, :cond_10

    .line 210
    .line 211
    iget v0, p0, Lg5/g;->z:I

    .line 212
    .line 213
    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 214
    .line 215
    .line 216
    move-result p1

    .line 217
    iput p1, p0, Lg5/g;->z:I

    .line 218
    .line 219
    return-void

    .line 220
    :cond_10
    sget v0, Lcom/zykj/camera/R$styleable;->QRCodeView_asv_barcodeRectHeight:I

    .line 221
    .line 222
    if-ne p1, v0, :cond_11

    .line 223
    .line 224
    iget v0, p0, Lg5/g;->n:I

    .line 225
    .line 226
    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 227
    .line 228
    .line 229
    move-result p1

    .line 230
    iput p1, p0, Lg5/g;->n:I

    .line 231
    .line 232
    return-void

    .line 233
    :cond_11
    sget v0, Lcom/zykj/camera/R$styleable;->QRCodeView_asv_isBarcode:I

    .line 234
    .line 235
    if-ne p1, v0, :cond_12

    .line 236
    .line 237
    iget-boolean v0, p0, Lg5/g;->A:Z

    .line 238
    .line 239
    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 240
    .line 241
    .line 242
    move-result p1

    .line 243
    iput-boolean p1, p0, Lg5/g;->A:Z

    .line 244
    .line 245
    return-void

    .line 246
    :cond_12
    sget v0, Lcom/zykj/camera/R$styleable;->QRCodeView_asv_barCodeTipText:I

    .line 247
    .line 248
    if-ne p1, v0, :cond_13

    .line 249
    .line 250
    invoke-virtual {p2, p1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object p1

    .line 254
    iput-object p1, p0, Lg5/g;->C:Ljava/lang/String;

    .line 255
    .line 256
    return-void

    .line 257
    :cond_13
    sget v0, Lcom/zykj/camera/R$styleable;->QRCodeView_asv_qrCodeTipText:I

    .line 258
    .line 259
    if-ne p1, v0, :cond_14

    .line 260
    .line 261
    invoke-virtual {p2, p1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object p1

    .line 265
    iput-object p1, p0, Lg5/g;->B:Ljava/lang/String;

    .line 266
    .line 267
    return-void

    .line 268
    :cond_14
    sget v0, Lcom/zykj/camera/R$styleable;->QRCodeView_asv_tipTextSize:I

    .line 269
    .line 270
    if-ne p1, v0, :cond_15

    .line 271
    .line 272
    iget v0, p0, Lg5/g;->E:I

    .line 273
    .line 274
    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 275
    .line 276
    .line 277
    move-result p1

    .line 278
    iput p1, p0, Lg5/g;->E:I

    .line 279
    .line 280
    return-void

    .line 281
    :cond_15
    sget v0, Lcom/zykj/camera/R$styleable;->QRCodeView_asv_tipTextColor:I

    .line 282
    .line 283
    if-ne p1, v0, :cond_16

    .line 284
    .line 285
    iget v0, p0, Lg5/g;->F:I

    .line 286
    .line 287
    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 288
    .line 289
    .line 290
    move-result p1

    .line 291
    iput p1, p0, Lg5/g;->F:I

    .line 292
    .line 293
    return-void

    .line 294
    :cond_16
    sget v0, Lcom/zykj/camera/R$styleable;->QRCodeView_asv_isTipTextBelowRect:I

    .line 295
    .line 296
    if-ne p1, v0, :cond_17

    .line 297
    .line 298
    iget-boolean v0, p0, Lg5/g;->G:Z

    .line 299
    .line 300
    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 301
    .line 302
    .line 303
    move-result p1

    .line 304
    iput-boolean p1, p0, Lg5/g;->G:Z

    .line 305
    .line 306
    return-void

    .line 307
    :cond_17
    sget v0, Lcom/zykj/camera/R$styleable;->QRCodeView_asv_tipTextMargin:I

    .line 308
    .line 309
    if-ne p1, v0, :cond_18

    .line 310
    .line 311
    iget v0, p0, Lg5/g;->H:I

    .line 312
    .line 313
    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 314
    .line 315
    .line 316
    move-result p1

    .line 317
    iput p1, p0, Lg5/g;->H:I

    .line 318
    .line 319
    return-void

    .line 320
    :cond_18
    sget v0, Lcom/zykj/camera/R$styleable;->QRCodeView_asv_isShowTipTextAsSingleLine:I

    .line 321
    .line 322
    if-ne p1, v0, :cond_19

    .line 323
    .line 324
    iget-boolean v0, p0, Lg5/g;->I:Z

    .line 325
    .line 326
    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 327
    .line 328
    .line 329
    move-result p1

    .line 330
    iput-boolean p1, p0, Lg5/g;->I:Z

    .line 331
    .line 332
    return-void

    .line 333
    :cond_19
    sget v0, Lcom/zykj/camera/R$styleable;->QRCodeView_asv_isShowTipBackground:I

    .line 334
    .line 335
    if-ne p1, v0, :cond_1a

    .line 336
    .line 337
    iget-boolean v0, p0, Lg5/g;->K:Z

    .line 338
    .line 339
    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 340
    .line 341
    .line 342
    move-result p1

    .line 343
    iput-boolean p1, p0, Lg5/g;->K:Z

    .line 344
    .line 345
    return-void

    .line 346
    :cond_1a
    sget v0, Lcom/zykj/camera/R$styleable;->QRCodeView_asv_tipBackgroundColor:I

    .line 347
    .line 348
    if-ne p1, v0, :cond_1b

    .line 349
    .line 350
    iget v0, p0, Lg5/g;->J:I

    .line 351
    .line 352
    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 353
    .line 354
    .line 355
    move-result p1

    .line 356
    iput p1, p0, Lg5/g;->J:I

    .line 357
    .line 358
    return-void

    .line 359
    :cond_1b
    sget v0, Lcom/zykj/camera/R$styleable;->QRCodeView_asv_isScanLineReverse:I

    .line 360
    .line 361
    if-ne p1, v0, :cond_1c

    .line 362
    .line 363
    iget-boolean v0, p0, Lg5/g;->L:Z

    .line 364
    .line 365
    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 366
    .line 367
    .line 368
    move-result p1

    .line 369
    iput-boolean p1, p0, Lg5/g;->L:Z

    .line 370
    .line 371
    return-void

    .line 372
    :cond_1c
    sget v0, Lcom/zykj/camera/R$styleable;->QRCodeView_asv_isShowDefaultGridScanLineDrawable:I

    .line 373
    .line 374
    if-ne p1, v0, :cond_1d

    .line 375
    .line 376
    iget-boolean v0, p0, Lg5/g;->M:Z

    .line 377
    .line 378
    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 379
    .line 380
    .line 381
    move-result p1

    .line 382
    iput-boolean p1, p0, Lg5/g;->M:Z

    .line 383
    .line 384
    return-void

    .line 385
    :cond_1d
    sget v0, Lcom/zykj/camera/R$styleable;->QRCodeView_asv_customGridScanLineDrawable:I

    .line 386
    .line 387
    if-ne p1, v0, :cond_1e

    .line 388
    .line 389
    invoke-virtual {p2, p1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 390
    .line 391
    .line 392
    move-result-object p1

    .line 393
    iput-object p1, p0, Lg5/g;->N:Landroid/graphics/drawable/Drawable;

    .line 394
    .line 395
    return-void

    .line 396
    :cond_1e
    sget v0, Lcom/zykj/camera/R$styleable;->QRCodeView_asv_isOnlyDecodeScanBoxArea:I

    .line 397
    .line 398
    if-ne p1, v0, :cond_1f

    .line 399
    .line 400
    iget-boolean v0, p0, Lg5/g;->d0:Z

    .line 401
    .line 402
    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 403
    .line 404
    .line 405
    move-result p1

    .line 406
    iput-boolean p1, p0, Lg5/g;->d0:Z

    .line 407
    .line 408
    :cond_1f
    return-void
.end method

.method public i(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 1
    sget-object v0, Lcom/zykj/camera/R$styleable;->QRCodeView:[I

    .line 2
    .line 3
    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    const/4 v0, 0x0

    .line 12
    :goto_0
    if-ge v0, p2, :cond_0

    .line 13
    .line 14
    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getIndex(I)I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    invoke-virtual {p0, v1, p1}, Lg5/g;->h(ILandroid/content/res/TypedArray;)V

    .line 19
    .line 20
    .line 21
    add-int/lit8 v0, v0, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Lg5/g;->a()V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final j()V
    .locals 8

    .line 1
    iget-boolean v0, p0, Lg5/g;->A:Z

    .line 2
    .line 3
    const/high16 v1, 0x3f000000    # 0.5f

    .line 4
    .line 5
    if-eqz v0, :cond_4

    .line 6
    .line 7
    iget-object v0, p0, Lg5/g;->O:Landroid/graphics/Bitmap;

    .line 8
    .line 9
    if-nez v0, :cond_3

    .line 10
    .line 11
    iget v0, p0, Lg5/g;->e:F

    .line 12
    .line 13
    iget v2, p0, Lg5/g;->a:I

    .line 14
    .line 15
    int-to-float v2, v2

    .line 16
    add-float/2addr v0, v2

    .line 17
    iput v0, p0, Lg5/g;->e:F

    .line 18
    .line 19
    iget v0, p0, Lg5/g;->p:I

    .line 20
    .line 21
    iget-object v2, p0, Lg5/g;->u:Landroid/graphics/Bitmap;

    .line 22
    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    :cond_0
    iget-boolean v2, p0, Lg5/g;->L:Z

    .line 30
    .line 31
    if-eqz v2, :cond_2

    .line 32
    .line 33
    iget v1, p0, Lg5/g;->e:F

    .line 34
    .line 35
    int-to-float v0, v0

    .line 36
    add-float/2addr v0, v1

    .line 37
    iget-object v2, p0, Lg5/g;->c:Landroid/graphics/Rect;

    .line 38
    .line 39
    iget v3, v2, Landroid/graphics/Rect;->right:I

    .line 40
    .line 41
    int-to-float v3, v3

    .line 42
    iget v4, p0, Lg5/g;->V:F

    .line 43
    .line 44
    sub-float/2addr v3, v4

    .line 45
    cmpl-float v0, v0, v3

    .line 46
    .line 47
    if-gtz v0, :cond_1

    .line 48
    .line 49
    iget v0, v2, Landroid/graphics/Rect;->left:I

    .line 50
    .line 51
    int-to-float v0, v0

    .line 52
    add-float/2addr v0, v4

    .line 53
    cmpg-float v0, v1, v0

    .line 54
    .line 55
    if-gez v0, :cond_9

    .line 56
    .line 57
    :cond_1
    iget v0, p0, Lg5/g;->a:I

    .line 58
    .line 59
    neg-int v0, v0

    .line 60
    iput v0, p0, Lg5/g;->a:I

    .line 61
    .line 62
    goto/16 :goto_0

    .line 63
    .line 64
    :cond_2
    iget v2, p0, Lg5/g;->e:F

    .line 65
    .line 66
    int-to-float v0, v0

    .line 67
    add-float/2addr v2, v0

    .line 68
    iget-object v0, p0, Lg5/g;->c:Landroid/graphics/Rect;

    .line 69
    .line 70
    iget v3, v0, Landroid/graphics/Rect;->right:I

    .line 71
    .line 72
    int-to-float v3, v3

    .line 73
    iget v4, p0, Lg5/g;->V:F

    .line 74
    .line 75
    sub-float/2addr v3, v4

    .line 76
    cmpl-float v2, v2, v3

    .line 77
    .line 78
    if-lez v2, :cond_9

    .line 79
    .line 80
    iget v0, v0, Landroid/graphics/Rect;->left:I

    .line 81
    .line 82
    int-to-float v0, v0

    .line 83
    add-float/2addr v0, v4

    .line 84
    add-float/2addr v0, v1

    .line 85
    iput v0, p0, Lg5/g;->e:F

    .line 86
    .line 87
    goto/16 :goto_0

    .line 88
    .line 89
    :cond_3
    iget v0, p0, Lg5/g;->Q:F

    .line 90
    .line 91
    iget v2, p0, Lg5/g;->a:I

    .line 92
    .line 93
    int-to-float v2, v2

    .line 94
    add-float/2addr v0, v2

    .line 95
    iput v0, p0, Lg5/g;->Q:F

    .line 96
    .line 97
    iget-object v2, p0, Lg5/g;->c:Landroid/graphics/Rect;

    .line 98
    .line 99
    iget v3, v2, Landroid/graphics/Rect;->right:I

    .line 100
    .line 101
    int-to-float v3, v3

    .line 102
    iget v4, p0, Lg5/g;->V:F

    .line 103
    .line 104
    sub-float/2addr v3, v4

    .line 105
    cmpl-float v0, v0, v3

    .line 106
    .line 107
    if-lez v0, :cond_9

    .line 108
    .line 109
    iget v0, v2, Landroid/graphics/Rect;->left:I

    .line 110
    .line 111
    int-to-float v0, v0

    .line 112
    add-float/2addr v0, v4

    .line 113
    add-float/2addr v0, v1

    .line 114
    iput v0, p0, Lg5/g;->Q:F

    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_4
    iget-object v0, p0, Lg5/g;->O:Landroid/graphics/Bitmap;

    .line 118
    .line 119
    if-nez v0, :cond_8

    .line 120
    .line 121
    iget v0, p0, Lg5/g;->d:F

    .line 122
    .line 123
    iget v2, p0, Lg5/g;->a:I

    .line 124
    .line 125
    int-to-float v2, v2

    .line 126
    add-float/2addr v0, v2

    .line 127
    iput v0, p0, Lg5/g;->d:F

    .line 128
    .line 129
    iget v0, p0, Lg5/g;->p:I

    .line 130
    .line 131
    iget-object v2, p0, Lg5/g;->u:Landroid/graphics/Bitmap;

    .line 132
    .line 133
    if-eqz v2, :cond_5

    .line 134
    .line 135
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 136
    .line 137
    .line 138
    move-result v0

    .line 139
    :cond_5
    iget-boolean v2, p0, Lg5/g;->L:Z

    .line 140
    .line 141
    if-eqz v2, :cond_7

    .line 142
    .line 143
    iget v1, p0, Lg5/g;->d:F

    .line 144
    .line 145
    int-to-float v0, v0

    .line 146
    add-float/2addr v0, v1

    .line 147
    iget-object v2, p0, Lg5/g;->c:Landroid/graphics/Rect;

    .line 148
    .line 149
    iget v3, v2, Landroid/graphics/Rect;->bottom:I

    .line 150
    .line 151
    int-to-float v3, v3

    .line 152
    iget v4, p0, Lg5/g;->V:F

    .line 153
    .line 154
    sub-float/2addr v3, v4

    .line 155
    cmpl-float v0, v0, v3

    .line 156
    .line 157
    if-gtz v0, :cond_6

    .line 158
    .line 159
    iget v0, v2, Landroid/graphics/Rect;->top:I

    .line 160
    .line 161
    int-to-float v0, v0

    .line 162
    add-float/2addr v0, v4

    .line 163
    cmpg-float v0, v1, v0

    .line 164
    .line 165
    if-gez v0, :cond_9

    .line 166
    .line 167
    :cond_6
    iget v0, p0, Lg5/g;->a:I

    .line 168
    .line 169
    neg-int v0, v0

    .line 170
    iput v0, p0, Lg5/g;->a:I

    .line 171
    .line 172
    goto :goto_0

    .line 173
    :cond_7
    iget v2, p0, Lg5/g;->d:F

    .line 174
    .line 175
    int-to-float v0, v0

    .line 176
    add-float/2addr v2, v0

    .line 177
    iget-object v0, p0, Lg5/g;->c:Landroid/graphics/Rect;

    .line 178
    .line 179
    iget v3, v0, Landroid/graphics/Rect;->bottom:I

    .line 180
    .line 181
    int-to-float v3, v3

    .line 182
    iget v4, p0, Lg5/g;->V:F

    .line 183
    .line 184
    sub-float/2addr v3, v4

    .line 185
    cmpl-float v2, v2, v3

    .line 186
    .line 187
    if-lez v2, :cond_9

    .line 188
    .line 189
    iget v0, v0, Landroid/graphics/Rect;->top:I

    .line 190
    .line 191
    int-to-float v0, v0

    .line 192
    add-float/2addr v0, v4

    .line 193
    add-float/2addr v0, v1

    .line 194
    iput v0, p0, Lg5/g;->d:F

    .line 195
    .line 196
    goto :goto_0

    .line 197
    :cond_8
    iget v0, p0, Lg5/g;->P:F

    .line 198
    .line 199
    iget v2, p0, Lg5/g;->a:I

    .line 200
    .line 201
    int-to-float v2, v2

    .line 202
    add-float/2addr v0, v2

    .line 203
    iput v0, p0, Lg5/g;->P:F

    .line 204
    .line 205
    iget-object v2, p0, Lg5/g;->c:Landroid/graphics/Rect;

    .line 206
    .line 207
    iget v3, v2, Landroid/graphics/Rect;->bottom:I

    .line 208
    .line 209
    int-to-float v3, v3

    .line 210
    iget v4, p0, Lg5/g;->V:F

    .line 211
    .line 212
    sub-float/2addr v3, v4

    .line 213
    cmpl-float v0, v0, v3

    .line 214
    .line 215
    if-lez v0, :cond_9

    .line 216
    .line 217
    iget v0, v2, Landroid/graphics/Rect;->top:I

    .line 218
    .line 219
    int-to-float v0, v0

    .line 220
    add-float/2addr v0, v4

    .line 221
    add-float/2addr v0, v1

    .line 222
    iput v0, p0, Lg5/g;->P:F

    .line 223
    .line 224
    :cond_9
    :goto_0
    iget v0, p0, Lg5/g;->b:I

    .line 225
    .line 226
    int-to-long v2, v0

    .line 227
    iget-object v0, p0, Lg5/g;->c:Landroid/graphics/Rect;

    .line 228
    .line 229
    iget v4, v0, Landroid/graphics/Rect;->left:I

    .line 230
    .line 231
    iget v5, v0, Landroid/graphics/Rect;->top:I

    .line 232
    .line 233
    iget v6, v0, Landroid/graphics/Rect;->right:I

    .line 234
    .line 235
    iget v7, v0, Landroid/graphics/Rect;->bottom:I

    .line 236
    .line 237
    move-object v1, p0

    .line 238
    invoke-virtual/range {v1 .. v7}, Landroid/view/View;->postInvalidateDelayed(JIIII)V

    .line 239
    .line 240
    .line 241
    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lg5/g;->c:Landroid/graphics/Rect;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-virtual {p0, p1}, Lg5/g;->e(Landroid/graphics/Canvas;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lg5/g;->c(Landroid/graphics/Canvas;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p1}, Lg5/g;->d(Landroid/graphics/Canvas;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, p1}, Lg5/g;->f(Landroid/graphics/Canvas;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, p1}, Lg5/g;->g(Landroid/graphics/Canvas;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lg5/g;->j()V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public onSizeChanged(IIII)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lg5/g;->b()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public setIsBarcode(Z)V
    .locals 9

    .line 1
    iput-boolean p1, p0, Lg5/g;->A:Z

    .line 2
    .line 3
    iget-object v0, p0, Lg5/g;->N:Landroid/graphics/drawable/Drawable;

    .line 4
    .line 5
    if-nez v0, :cond_3

    .line 6
    .line 7
    iget-boolean v0, p0, Lg5/g;->M:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v0, p0, Lg5/g;->t:Landroid/graphics/drawable/Drawable;

    .line 13
    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    iget-boolean v0, p0, Lg5/g;->s:Z

    .line 17
    .line 18
    if-eqz v0, :cond_5

    .line 19
    .line 20
    :cond_1
    if-eqz p1, :cond_2

    .line 21
    .line 22
    iget-object v0, p0, Lg5/g;->S:Landroid/graphics/Bitmap;

    .line 23
    .line 24
    iput-object v0, p0, Lg5/g;->u:Landroid/graphics/Bitmap;

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_2
    iget-object v0, p0, Lg5/g;->R:Landroid/graphics/Bitmap;

    .line 28
    .line 29
    iput-object v0, p0, Lg5/g;->u:Landroid/graphics/Bitmap;

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_3
    :goto_0
    if-eqz p1, :cond_4

    .line 33
    .line 34
    iget-object v0, p0, Lg5/g;->U:Landroid/graphics/Bitmap;

    .line 35
    .line 36
    iput-object v0, p0, Lg5/g;->O:Landroid/graphics/Bitmap;

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_4
    iget-object v0, p0, Lg5/g;->T:Landroid/graphics/Bitmap;

    .line 40
    .line 41
    iput-object v0, p0, Lg5/g;->O:Landroid/graphics/Bitmap;

    .line 42
    .line 43
    :cond_5
    :goto_1
    const/high16 v0, 0x3f800000    # 1.0f

    .line 44
    .line 45
    if-eqz p1, :cond_6

    .line 46
    .line 47
    iget-object p1, p0, Lg5/g;->C:Ljava/lang/String;

    .line 48
    .line 49
    iput-object p1, p0, Lg5/g;->D:Ljava/lang/String;

    .line 50
    .line 51
    iget p1, p0, Lg5/g;->n:I

    .line 52
    .line 53
    iput p1, p0, Lg5/g;->m:I

    .line 54
    .line 55
    iget p1, p0, Lg5/g;->x:I

    .line 56
    .line 57
    int-to-float p1, p1

    .line 58
    mul-float/2addr p1, v0

    .line 59
    iget v0, p0, Lg5/g;->a:I

    .line 60
    .line 61
    int-to-float v0, v0

    .line 62
    mul-float/2addr p1, v0

    .line 63
    iget v0, p0, Lg5/g;->l:I

    .line 64
    .line 65
    int-to-float v0, v0

    .line 66
    div-float/2addr p1, v0

    .line 67
    float-to-int p1, p1

    .line 68
    iput p1, p0, Lg5/g;->b:I

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_6
    iget-object p1, p0, Lg5/g;->B:Ljava/lang/String;

    .line 72
    .line 73
    iput-object p1, p0, Lg5/g;->D:Ljava/lang/String;

    .line 74
    .line 75
    iget p1, p0, Lg5/g;->x:I

    .line 76
    .line 77
    int-to-float p1, p1

    .line 78
    mul-float/2addr p1, v0

    .line 79
    iget v0, p0, Lg5/g;->a:I

    .line 80
    .line 81
    int-to-float v0, v0

    .line 82
    mul-float/2addr p1, v0

    .line 83
    iget v0, p0, Lg5/g;->m:I

    .line 84
    .line 85
    int-to-float v0, v0

    .line 86
    div-float/2addr p1, v0

    .line 87
    float-to-int p1, p1

    .line 88
    iput p1, p0, Lg5/g;->b:I

    .line 89
    .line 90
    :goto_2
    iget-object p1, p0, Lg5/g;->D:Ljava/lang/String;

    .line 91
    .line 92
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 93
    .line 94
    .line 95
    move-result p1

    .line 96
    if-nez p1, :cond_8

    .line 97
    .line 98
    iget-boolean p1, p0, Lg5/g;->I:Z

    .line 99
    .line 100
    if-eqz p1, :cond_7

    .line 101
    .line 102
    new-instance v0, Landroid/text/StaticLayout;

    .line 103
    .line 104
    iget-object v1, p0, Lg5/g;->D:Ljava/lang/String;

    .line 105
    .line 106
    iget-object v2, p0, Lg5/g;->g:Landroid/text/TextPaint;

    .line 107
    .line 108
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    invoke-static {p1}, Lg5/a;->c(Landroid/content/Context;)Landroid/graphics/Point;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    iget v3, p1, Landroid/graphics/Point;->x:I

    .line 117
    .line 118
    sget-object v4, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;

    .line 119
    .line 120
    const/4 v6, 0x0

    .line 121
    const/4 v7, 0x1

    .line 122
    const/high16 v5, 0x3f800000    # 1.0f

    .line 123
    .line 124
    invoke-direct/range {v0 .. v7}, Landroid/text/StaticLayout;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFZ)V

    .line 125
    .line 126
    .line 127
    iput-object v0, p0, Lg5/g;->W:Landroid/text/StaticLayout;

    .line 128
    .line 129
    goto :goto_3

    .line 130
    :cond_7
    new-instance v1, Landroid/text/StaticLayout;

    .line 131
    .line 132
    iget-object v2, p0, Lg5/g;->D:Ljava/lang/String;

    .line 133
    .line 134
    iget-object v3, p0, Lg5/g;->g:Landroid/text/TextPaint;

    .line 135
    .line 136
    iget p1, p0, Lg5/g;->l:I

    .line 137
    .line 138
    iget v0, p0, Lg5/g;->c0:I

    .line 139
    .line 140
    mul-int/lit8 v0, v0, 0x2

    .line 141
    .line 142
    sub-int v4, p1, v0

    .line 143
    .line 144
    sget-object v5, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;

    .line 145
    .line 146
    const/4 v7, 0x0

    .line 147
    const/4 v8, 0x1

    .line 148
    const/high16 v6, 0x3f800000    # 1.0f

    .line 149
    .line 150
    invoke-direct/range {v1 .. v8}, Landroid/text/StaticLayout;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFZ)V

    .line 151
    .line 152
    .line 153
    iput-object v1, p0, Lg5/g;->W:Landroid/text/StaticLayout;

    .line 154
    .line 155
    :cond_8
    :goto_3
    iget-boolean p1, p0, Lg5/g;->y:Z

    .line 156
    .line 157
    if-eqz p1, :cond_a

    .line 158
    .line 159
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    invoke-static {p1}, Lg5/a;->c(Landroid/content/Context;)Landroid/graphics/Point;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    iget p1, p1, Landroid/graphics/Point;->y:I

    .line 168
    .line 169
    iget v0, p0, Lg5/g;->z:I

    .line 170
    .line 171
    if-nez v0, :cond_9

    .line 172
    .line 173
    iget v0, p0, Lg5/g;->m:I

    .line 174
    .line 175
    sub-int/2addr p1, v0

    .line 176
    div-int/lit8 p1, p1, 0x2

    .line 177
    .line 178
    iput p1, p0, Lg5/g;->o:I

    .line 179
    .line 180
    goto :goto_4

    .line 181
    :cond_9
    iget v1, p0, Lg5/g;->m:I

    .line 182
    .line 183
    sub-int/2addr p1, v1

    .line 184
    div-int/lit8 p1, p1, 0x2

    .line 185
    .line 186
    div-int/lit8 v0, v0, 0x2

    .line 187
    .line 188
    add-int/2addr p1, v0

    .line 189
    iput p1, p0, Lg5/g;->o:I

    .line 190
    .line 191
    :cond_a
    :goto_4
    invoke-virtual {p0}, Lg5/g;->b()V

    .line 192
    .line 193
    .line 194
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 195
    .line 196
    .line 197
    return-void
.end method
