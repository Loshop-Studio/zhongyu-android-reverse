.class public Lcom/jaredrummler/android/colorpicker/ColorPanelView;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field public a:Landroid/graphics/drawable/Drawable;

.field public b:Landroid/graphics/Paint;

.field public c:Landroid/graphics/Paint;

.field public d:Landroid/graphics/Paint;

.field public e:Landroid/graphics/Paint;

.field public f:Landroid/graphics/Rect;

.field public g:Landroid/graphics/Rect;

.field public h:Landroid/graphics/RectF;

.field public i:Z

.field public j:I

.field public k:I

.field public l:I

.field public m:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, p2, v0}, Lcom/jaredrummler/android/colorpicker/ColorPanelView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 3
    new-instance p3, Landroid/graphics/RectF;

    invoke-direct {p3}, Landroid/graphics/RectF;-><init>()V

    iput-object p3, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->h:Landroid/graphics/RectF;

    const p3, -0x919192

    .line 4
    iput p3, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->k:I

    const/high16 p3, -0x1000000

    .line 5
    iput p3, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->l:I

    .line 6
    invoke-virtual {p0, p1, p2}, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->a(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lcom/jaredrummler/android/colorpicker/R$styleable;->ColorPanelView:[I

    .line 6
    .line 7
    invoke-virtual {v0, p2, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    sget v0, Lcom/jaredrummler/android/colorpicker/R$styleable;->ColorPanelView_cpv_colorShape:I

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iput v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->m:I

    .line 19
    .line 20
    sget v0, Lcom/jaredrummler/android/colorpicker/R$styleable;->ColorPanelView_cpv_showOldColor:I

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    invoke-virtual {p2, v0, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    iput-boolean v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->i:Z

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    iget v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->m:I

    .line 32
    .line 33
    if-ne v0, v1, :cond_0

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 37
    .line 38
    const-string p2, "Color preview is only available in circle mode"

    .line 39
    .line 40
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    throw p1

    .line 44
    :cond_1
    :goto_0
    sget v0, Lcom/jaredrummler/android/colorpicker/R$styleable;->ColorPanelView_cpv_borderColor:I

    .line 45
    .line 46
    const v3, -0x919192

    .line 47
    .line 48
    .line 49
    invoke-virtual {p2, v0, v3}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    iput v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->k:I

    .line 54
    .line 55
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 56
    .line 57
    .line 58
    iget p2, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->k:I

    .line 59
    .line 60
    if-ne p2, v3, :cond_2

    .line 61
    .line 62
    new-instance p2, Landroid/util/TypedValue;

    .line 63
    .line 64
    invoke-direct {p2}, Landroid/util/TypedValue;-><init>()V

    .line 65
    .line 66
    .line 67
    iget p2, p2, Landroid/util/TypedValue;->data:I

    .line 68
    .line 69
    const v0, 0x1010038

    .line 70
    .line 71
    .line 72
    filled-new-array {v0}, [I

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    .line 77
    .line 78
    .line 79
    move-result-object p2

    .line 80
    iget v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->k:I

    .line 81
    .line 82
    invoke-virtual {p2, v2, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    iput v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->k:I

    .line 87
    .line 88
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 89
    .line 90
    .line 91
    :cond_2
    const/high16 p2, 0x3f800000    # 1.0f

    .line 92
    .line 93
    invoke-static {p1, p2}, Lp1/c;->a(Landroid/content/Context;F)I

    .line 94
    .line 95
    .line 96
    move-result p2

    .line 97
    iput p2, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->j:I

    .line 98
    .line 99
    new-instance p2, Landroid/graphics/Paint;

    .line 100
    .line 101
    invoke-direct {p2}, Landroid/graphics/Paint;-><init>()V

    .line 102
    .line 103
    .line 104
    iput-object p2, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->b:Landroid/graphics/Paint;

    .line 105
    .line 106
    invoke-virtual {p2, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 107
    .line 108
    .line 109
    new-instance p2, Landroid/graphics/Paint;

    .line 110
    .line 111
    invoke-direct {p2}, Landroid/graphics/Paint;-><init>()V

    .line 112
    .line 113
    .line 114
    iput-object p2, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->c:Landroid/graphics/Paint;

    .line 115
    .line 116
    invoke-virtual {p2, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 117
    .line 118
    .line 119
    iget-boolean p2, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->i:Z

    .line 120
    .line 121
    if-eqz p2, :cond_3

    .line 122
    .line 123
    new-instance p2, Landroid/graphics/Paint;

    .line 124
    .line 125
    invoke-direct {p2}, Landroid/graphics/Paint;-><init>()V

    .line 126
    .line 127
    .line 128
    iput-object p2, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->e:Landroid/graphics/Paint;

    .line 129
    .line 130
    :cond_3
    iget p2, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->m:I

    .line 131
    .line 132
    if-ne p2, v1, :cond_4

    .line 133
    .line 134
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    sget p2, Lcom/jaredrummler/android/colorpicker/R$drawable;->cpv_alpha:I

    .line 139
    .line 140
    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    check-cast p1, Landroid/graphics/drawable/BitmapDrawable;

    .line 145
    .line 146
    invoke-virtual {p1}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    new-instance p2, Landroid/graphics/Paint;

    .line 151
    .line 152
    invoke-direct {p2}, Landroid/graphics/Paint;-><init>()V

    .line 153
    .line 154
    .line 155
    iput-object p2, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->d:Landroid/graphics/Paint;

    .line 156
    .line 157
    invoke-virtual {p2, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 158
    .line 159
    .line 160
    new-instance p2, Landroid/graphics/BitmapShader;

    .line 161
    .line 162
    sget-object v0, Landroid/graphics/Shader$TileMode;->REPEAT:Landroid/graphics/Shader$TileMode;

    .line 163
    .line 164
    invoke-direct {p2, p1, v0, v0}, Landroid/graphics/BitmapShader;-><init>(Landroid/graphics/Bitmap;Landroid/graphics/Shader$TileMode;Landroid/graphics/Shader$TileMode;)V

    .line 165
    .line 166
    .line 167
    iget-object p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->d:Landroid/graphics/Paint;

    .line 168
    .line 169
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 170
    .line 171
    .line 172
    :cond_4
    return-void
.end method

.method public final b()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->f:Landroid/graphics/Rect;

    .line 2
    .line 3
    iget v1, v0, Landroid/graphics/Rect;->left:I

    .line 4
    .line 5
    iget v2, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->j:I

    .line 6
    .line 7
    add-int/2addr v1, v2

    .line 8
    iget v3, v0, Landroid/graphics/Rect;->top:I

    .line 9
    .line 10
    add-int/2addr v3, v2

    .line 11
    iget v4, v0, Landroid/graphics/Rect;->bottom:I

    .line 12
    .line 13
    sub-int/2addr v4, v2

    .line 14
    iget v0, v0, Landroid/graphics/Rect;->right:I

    .line 15
    .line 16
    sub-int/2addr v0, v2

    .line 17
    new-instance v2, Landroid/graphics/RectF;

    .line 18
    .line 19
    int-to-float v1, v1

    .line 20
    int-to-float v3, v3

    .line 21
    int-to-float v0, v0

    .line 22
    int-to-float v4, v4

    .line 23
    invoke-direct {v2, v1, v3, v0, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 24
    .line 25
    .line 26
    iput-object v2, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->h:Landroid/graphics/RectF;

    .line 27
    .line 28
    return-void
.end method

.method public final c()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->f:Landroid/graphics/Rect;

    .line 2
    .line 3
    iget v1, v0, Landroid/graphics/Rect;->left:I

    .line 4
    .line 5
    iget v2, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->j:I

    .line 6
    .line 7
    add-int/2addr v1, v2

    .line 8
    iget v3, v0, Landroid/graphics/Rect;->top:I

    .line 9
    .line 10
    add-int/2addr v3, v2

    .line 11
    iget v4, v0, Landroid/graphics/Rect;->bottom:I

    .line 12
    .line 13
    sub-int/2addr v4, v2

    .line 14
    iget v0, v0, Landroid/graphics/Rect;->right:I

    .line 15
    .line 16
    sub-int/2addr v0, v2

    .line 17
    new-instance v2, Landroid/graphics/Rect;

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v0, v4}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 20
    .line 21
    .line 22
    iput-object v2, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->g:Landroid/graphics/Rect;

    .line 23
    .line 24
    new-instance v0, Lp1/a;

    .line 25
    .line 26
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    const/high16 v2, 0x40800000    # 4.0f

    .line 31
    .line 32
    invoke-static {v1, v2}, Lp1/c;->a(Landroid/content/Context;F)I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    invoke-direct {v0, v1}, Lp1/a;-><init>(I)V

    .line 37
    .line 38
    .line 39
    iput-object v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->a:Landroid/graphics/drawable/Drawable;

    .line 40
    .line 41
    iget-object v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->g:Landroid/graphics/Rect;

    .line 42
    .line 43
    iget v1, v1, Landroid/graphics/Rect;->left:I

    .line 44
    .line 45
    int-to-float v1, v1

    .line 46
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    iget-object v2, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->g:Landroid/graphics/Rect;

    .line 51
    .line 52
    iget v2, v2, Landroid/graphics/Rect;->top:I

    .line 53
    .line 54
    int-to-float v2, v2

    .line 55
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    iget-object v3, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->g:Landroid/graphics/Rect;

    .line 60
    .line 61
    iget v3, v3, Landroid/graphics/Rect;->right:I

    .line 62
    .line 63
    int-to-float v3, v3

    .line 64
    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    iget-object v4, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->g:Landroid/graphics/Rect;

    .line 69
    .line 70
    iget v4, v4, Landroid/graphics/Rect;->bottom:I

    .line 71
    .line 72
    int-to-float v4, v4

    .line 73
    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 78
    .line 79
    .line 80
    return-void
.end method

.method public d()V
    .locals 11

    .line 1
    const/4 v0, 0x2

    .line 2
    new-array v1, v0, [I

    .line 3
    .line 4
    new-instance v2, Landroid/graphics/Rect;

    .line 5
    .line 6
    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v1}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v2}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    const/4 v6, 0x1

    .line 28
    aget v7, v1, v6

    .line 29
    .line 30
    div-int/lit8 v8, v5, 0x2

    .line 31
    .line 32
    add-int/2addr v7, v8

    .line 33
    const/4 v8, 0x0

    .line 34
    aget v9, v1, v8

    .line 35
    .line 36
    div-int/2addr v4, v0

    .line 37
    add-int/2addr v9, v4

    .line 38
    invoke-static {p0}, Landroidx/core/view/ViewCompat;->getLayoutDirection(Landroid/view/View;)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-nez v0, :cond_0

    .line 43
    .line 44
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 53
    .line 54
    sub-int v9, v0, v9

    .line 55
    .line 56
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 57
    .line 58
    const-string v4, "#"

    .line 59
    .line 60
    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    iget v4, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->l:I

    .line 64
    .line 65
    invoke-static {v4}, Landroid/graphics/Color;->alpha(I)I

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    const/16 v10, 0xff

    .line 70
    .line 71
    if-eq v4, v10, :cond_1

    .line 72
    .line 73
    iget v4, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->l:I

    .line 74
    .line 75
    invoke-static {v4}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    sget-object v10, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 80
    .line 81
    invoke-virtual {v4, v10}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_1
    const v4, 0xffffff

    .line 90
    .line 91
    .line 92
    iget v10, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->l:I

    .line 93
    .line 94
    and-int/2addr v4, v10

    .line 95
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 96
    .line 97
    .line 98
    move-result-object v4

    .line 99
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    const-string v10, "%06X"

    .line 104
    .line 105
    invoke-static {v10, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v4

    .line 109
    sget-object v10, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 110
    .line 111
    invoke-virtual {v4, v10}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v4

    .line 115
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    :goto_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    invoke-static {v3, v0, v8}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    .line 127
    .line 128
    .line 129
    move-result v3

    .line 130
    if-ge v7, v3, :cond_2

    .line 131
    .line 132
    aget v1, v1, v6

    .line 133
    .line 134
    add-int/2addr v1, v5

    .line 135
    iget v2, v2, Landroid/graphics/Rect;->top:I

    .line 136
    .line 137
    sub-int/2addr v1, v2

    .line 138
    const v2, 0x800035

    .line 139
    .line 140
    .line 141
    invoke-virtual {v0, v2, v9, v1}, Landroid/widget/Toast;->setGravity(III)V

    .line 142
    .line 143
    .line 144
    goto :goto_1

    .line 145
    :cond_2
    const/16 v1, 0x51

    .line 146
    .line 147
    invoke-virtual {v0, v1, v8, v5}, Landroid/widget/Toast;->setGravity(III)V

    .line 148
    .line 149
    .line 150
    :goto_1
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 151
    .line 152
    .line 153
    return-void
.end method

.method public getBorderColor()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->k:I

    .line 2
    .line 3
    return v0
.end method

.method public getColor()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->l:I

    .line 2
    .line 3
    return v0
.end method

.method public getShape()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->m:I

    .line 2
    .line 3
    return v0
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 14

    .line 1
    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->b:Landroid/graphics/Paint;

    .line 2
    .line 3
    iget v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->k:I

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->c:Landroid/graphics/Paint;

    .line 9
    .line 10
    iget v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->l:I

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 13
    .line 14
    .line 15
    iget v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->m:I

    .line 16
    .line 17
    if-nez v0, :cond_2

    .line 18
    .line 19
    iget v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->j:I

    .line 20
    .line 21
    if-lez v0, :cond_0

    .line 22
    .line 23
    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->f:Landroid/graphics/Rect;

    .line 24
    .line 25
    iget-object v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->b:Landroid/graphics/Paint;

    .line 26
    .line 27
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->a:Landroid/graphics/drawable/Drawable;

    .line 31
    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 35
    .line 36
    .line 37
    :cond_1
    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->g:Landroid/graphics/Rect;

    .line 38
    .line 39
    iget-object v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->c:Landroid/graphics/Paint;

    .line 40
    .line 41
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_2
    const/4 v1, 0x1

    .line 46
    if-ne v0, v1, :cond_6

    .line 47
    .line 48
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    div-int/lit8 v0, v0, 0x2

    .line 53
    .line 54
    iget v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->j:I

    .line 55
    .line 56
    if-lez v1, :cond_3

    .line 57
    .line 58
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    div-int/lit8 v1, v1, 0x2

    .line 63
    .line 64
    int-to-float v1, v1

    .line 65
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    div-int/lit8 v2, v2, 0x2

    .line 70
    .line 71
    int-to-float v2, v2

    .line 72
    int-to-float v3, v0

    .line 73
    iget-object v4, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->b:Landroid/graphics/Paint;

    .line 74
    .line 75
    invoke-virtual {p1, v1, v2, v3, v4}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 76
    .line 77
    .line 78
    :cond_3
    iget v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->l:I

    .line 79
    .line 80
    invoke-static {v1}, Landroid/graphics/Color;->alpha(I)I

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    const/16 v2, 0xff

    .line 85
    .line 86
    if-ge v1, v2, :cond_4

    .line 87
    .line 88
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    div-int/lit8 v1, v1, 0x2

    .line 93
    .line 94
    int-to-float v1, v1

    .line 95
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 96
    .line 97
    .line 98
    move-result v2

    .line 99
    div-int/lit8 v2, v2, 0x2

    .line 100
    .line 101
    int-to-float v2, v2

    .line 102
    iget v3, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->j:I

    .line 103
    .line 104
    sub-int v3, v0, v3

    .line 105
    .line 106
    int-to-float v3, v3

    .line 107
    iget-object v4, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->d:Landroid/graphics/Paint;

    .line 108
    .line 109
    invoke-virtual {p1, v1, v2, v3, v4}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 110
    .line 111
    .line 112
    :cond_4
    iget-boolean v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->i:Z

    .line 113
    .line 114
    if-eqz v1, :cond_5

    .line 115
    .line 116
    iget-object v3, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->h:Landroid/graphics/RectF;

    .line 117
    .line 118
    const/4 v6, 0x1

    .line 119
    iget-object v7, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->e:Landroid/graphics/Paint;

    .line 120
    .line 121
    const/high16 v4, 0x42b40000    # 90.0f

    .line 122
    .line 123
    const/high16 v5, 0x43340000    # 180.0f

    .line 124
    .line 125
    move-object v2, p1

    .line 126
    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 127
    .line 128
    .line 129
    iget-object v9, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->h:Landroid/graphics/RectF;

    .line 130
    .line 131
    const/4 v12, 0x1

    .line 132
    iget-object v13, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->c:Landroid/graphics/Paint;

    .line 133
    .line 134
    const/high16 v10, 0x43870000    # 270.0f

    .line 135
    .line 136
    const/high16 v11, 0x43340000    # 180.0f

    .line 137
    .line 138
    move-object v8, v2

    .line 139
    invoke-virtual/range {v8 .. v13}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 140
    .line 141
    .line 142
    return-void

    .line 143
    :cond_5
    move-object v2, p1

    .line 144
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 145
    .line 146
    .line 147
    move-result p1

    .line 148
    div-int/lit8 p1, p1, 0x2

    .line 149
    .line 150
    int-to-float p1, p1

    .line 151
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 152
    .line 153
    .line 154
    move-result v1

    .line 155
    div-int/lit8 v1, v1, 0x2

    .line 156
    .line 157
    int-to-float v1, v1

    .line 158
    iget v3, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->j:I

    .line 159
    .line 160
    sub-int/2addr v0, v3

    .line 161
    int-to-float v0, v0

    .line 162
    iget-object v3, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->c:Landroid/graphics/Paint;

    .line 163
    .line 164
    invoke-virtual {v2, p1, v1, v0, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 165
    .line 166
    .line 167
    :cond_6
    return-void
.end method

.method public onMeasure(II)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->m:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    const/4 v1, 0x1

    .line 18
    if-ne v0, v1, :cond_1

    .line 19
    .line 20
    invoke-super {p0, p1, p1}, Landroid/view/View;->onMeasure(II)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_1
    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    .line 1
    instance-of v0, p1, Landroid/os/Bundle;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Landroid/os/Bundle;

    .line 6
    .line 7
    const-string v0, "color"

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iput v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->l:I

    .line 14
    .line 15
    const-string/jumbo v0, "instanceState"

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    :cond_0
    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .locals 3

    .line 1
    new-instance v0, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string/jumbo v1, "instanceState"

    .line 7
    .line 8
    .line 9
    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 14
    .line 15
    .line 16
    const-string v1, "color"

    .line 17
    .line 18
    iget v2, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->l:I

    .line 19
    .line 20
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 21
    .line 22
    .line 23
    return-object v0
.end method

.method public onSizeChanged(IIII)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 2
    .line 3
    .line 4
    iget p3, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->m:I

    .line 5
    .line 6
    if-eqz p3, :cond_1

    .line 7
    .line 8
    iget-boolean p3, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->i:Z

    .line 9
    .line 10
    if-eqz p3, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    return-void

    .line 14
    :cond_1
    :goto_0
    new-instance p3, Landroid/graphics/Rect;

    .line 15
    .line 16
    invoke-direct {p3}, Landroid/graphics/Rect;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p3, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->f:Landroid/graphics/Rect;

    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 22
    .line 23
    .line 24
    move-result p4

    .line 25
    iput p4, p3, Landroid/graphics/Rect;->left:I

    .line 26
    .line 27
    iget-object p3, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->f:Landroid/graphics/Rect;

    .line 28
    .line 29
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 30
    .line 31
    .line 32
    move-result p4

    .line 33
    sub-int/2addr p1, p4

    .line 34
    iput p1, p3, Landroid/graphics/Rect;->right:I

    .line 35
    .line 36
    iget-object p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->f:Landroid/graphics/Rect;

    .line 37
    .line 38
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 39
    .line 40
    .line 41
    move-result p3

    .line 42
    iput p3, p1, Landroid/graphics/Rect;->top:I

    .line 43
    .line 44
    iget-object p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->f:Landroid/graphics/Rect;

    .line 45
    .line 46
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 47
    .line 48
    .line 49
    move-result p3

    .line 50
    sub-int/2addr p2, p3

    .line 51
    iput p2, p1, Landroid/graphics/Rect;->bottom:I

    .line 52
    .line 53
    iget-boolean p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->i:Z

    .line 54
    .line 55
    if-eqz p1, :cond_2

    .line 56
    .line 57
    invoke-virtual {p0}, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->b()V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :cond_2
    invoke-virtual {p0}, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->c()V

    .line 62
    .line 63
    .line 64
    return-void
.end method

.method public setBorderColor(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->k:I

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setColor(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->l:I

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setOriginalColor(I)V
    .locals 1
    .param p1    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->e:Landroid/graphics/Paint;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public setShape(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->m:I

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
