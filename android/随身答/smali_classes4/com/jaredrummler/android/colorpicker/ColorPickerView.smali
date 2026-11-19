.class public Lcom/jaredrummler/android/colorpicker/ColorPickerView;
.super Landroid/view/View;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/jaredrummler/android/colorpicker/ColorPickerView$b;,
        Lcom/jaredrummler/android/colorpicker/ColorPickerView$c;
    }
.end annotation


# instance fields
.field public A:Landroid/graphics/Rect;

.field public B:Landroid/graphics/Rect;

.field public C:Landroid/graphics/Rect;

.field public D:Landroid/graphics/Rect;

.field public E:Landroid/graphics/Point;

.field public F:Ln1/a;

.field public G:Lcom/jaredrummler/android/colorpicker/ColorPickerView$c;

.field public a:I

.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public f:I

.field public g:Landroid/graphics/Paint;

.field public h:Landroid/graphics/Paint;

.field public i:Landroid/graphics/Paint;

.field public j:Landroid/graphics/Paint;

.field public k:Landroid/graphics/Paint;

.field public l:Landroid/graphics/Paint;

.field public m:Landroid/graphics/Shader;

.field public n:Landroid/graphics/Shader;

.field public o:Landroid/graphics/Shader;

.field public p:Lcom/jaredrummler/android/colorpicker/ColorPickerView$b;

.field public q:Lcom/jaredrummler/android/colorpicker/ColorPickerView$b;

.field public r:I

.field public s:F

.field public t:F

.field public u:F

.field public v:Z

.field public w:Ljava/lang/String;

.field public x:I

.field public y:I

.field public z:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, p2, v0}, Lcom/jaredrummler/android/colorpicker/ColorPickerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 2
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/16 p3, 0xff

    .line 3
    iput p3, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->r:I

    const/high16 p3, 0x43b40000    # 360.0f

    .line 4
    iput p3, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->s:F

    const/4 p3, 0x0

    .line 5
    iput p3, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->t:F

    .line 6
    iput p3, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->u:F

    const/4 p3, 0x0

    .line 7
    iput-boolean p3, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->v:Z

    const/4 p3, 0x0

    .line 8
    iput-object p3, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->w:Ljava/lang/String;

    const v0, -0x424243

    .line 9
    iput v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->x:I

    const v0, -0x919192

    .line 10
    iput v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->y:I

    .line 11
    iput-object p3, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->E:Landroid/graphics/Point;

    .line 12
    invoke-virtual {p0, p1, p2}, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->g(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method private getPreferredHeight()I
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/high16 v1, 0x43480000    # 200.0f

    .line 6
    .line 7
    invoke-static {v0, v1}, Ln1/c;->a(Landroid/content/Context;F)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iget-boolean v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->v:Z

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    iget v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->c:I

    .line 16
    .line 17
    iget v2, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->b:I

    .line 18
    .line 19
    add-int/2addr v1, v2

    .line 20
    add-int/2addr v0, v1

    .line 21
    :cond_0
    return v0
.end method

.method private getPreferredWidth()I
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/high16 v1, 0x43480000    # 200.0f

    .line 6
    .line 7
    invoke-static {v0, v1}, Ln1/c;->a(Landroid/content/Context;F)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iget v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->a:I

    .line 12
    .line 13
    add-int/2addr v0, v1

    .line 14
    iget v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->c:I

    .line 15
    .line 16
    add-int/2addr v0, v1

    .line 17
    return v0
.end method


# virtual methods
.method public final a(I)Landroid/graphics/Point;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->D:Landroid/graphics/Rect;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    int-to-float v1, v1

    .line 8
    new-instance v2, Landroid/graphics/Point;

    .line 9
    .line 10
    invoke-direct {v2}, Landroid/graphics/Point;-><init>()V

    .line 11
    .line 12
    .line 13
    int-to-float p1, p1

    .line 14
    mul-float/2addr p1, v1

    .line 15
    const/high16 v3, 0x437f0000    # 255.0f

    .line 16
    .line 17
    div-float/2addr p1, v3

    .line 18
    sub-float/2addr v1, p1

    .line 19
    iget p1, v0, Landroid/graphics/Rect;->left:I

    .line 20
    .line 21
    int-to-float p1, p1

    .line 22
    add-float/2addr v1, p1

    .line 23
    float-to-int p1, v1

    .line 24
    iput p1, v2, Landroid/graphics/Point;->x:I

    .line 25
    .line 26
    iget p1, v0, Landroid/graphics/Rect;->top:I

    .line 27
    .line 28
    iput p1, v2, Landroid/graphics/Point;->y:I

    .line 29
    .line 30
    return-object v2
.end method

.method public final b(Landroid/content/Context;)V
    .locals 3

    .line 1
    new-instance v0, Landroid/util/TypedValue;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    .line 4
    .line 5
    .line 6
    iget v0, v0, Landroid/util/TypedValue;->data:I

    .line 7
    .line 8
    const v1, 0x1010038

    .line 9
    .line 10
    .line 11
    filled-new-array {v1}, [I

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iget v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->y:I

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    const v2, -0x919192

    .line 23
    .line 24
    .line 25
    if-ne v0, v2, :cond_0

    .line 26
    .line 27
    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    iput v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->y:I

    .line 32
    .line 33
    :cond_0
    iget v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->x:I

    .line 34
    .line 35
    const v2, -0x424243

    .line 36
    .line 37
    .line 38
    if-ne v0, v2, :cond_1

    .line 39
    .line 40
    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    iput v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->x:I

    .line 45
    .line 46
    :cond_1
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public final c(Landroid/graphics/Canvas;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-boolean v1, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->v:Z

    .line 4
    .line 5
    if-eqz v1, :cond_2

    .line 6
    .line 7
    iget-object v7, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->D:Landroid/graphics/Rect;

    .line 8
    .line 9
    if-eqz v7, :cond_2

    .line 10
    .line 11
    iget-object v1, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->F:Ln1/a;

    .line 12
    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    goto/16 :goto_0

    .line 16
    .line 17
    :cond_0
    iget-object v1, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->l:Landroid/graphics/Paint;

    .line 18
    .line 19
    iget v2, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->y:I

    .line 20
    .line 21
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 22
    .line 23
    .line 24
    iget v1, v7, Landroid/graphics/Rect;->left:I

    .line 25
    .line 26
    const/4 v8, 0x1

    .line 27
    sub-int/2addr v1, v8

    .line 28
    int-to-float v2, v1

    .line 29
    iget v1, v7, Landroid/graphics/Rect;->top:I

    .line 30
    .line 31
    sub-int/2addr v1, v8

    .line 32
    int-to-float v3, v1

    .line 33
    iget v1, v7, Landroid/graphics/Rect;->right:I

    .line 34
    .line 35
    add-int/2addr v1, v8

    .line 36
    int-to-float v4, v1

    .line 37
    iget v1, v7, Landroid/graphics/Rect;->bottom:I

    .line 38
    .line 39
    add-int/2addr v1, v8

    .line 40
    int-to-float v5, v1

    .line 41
    iget-object v6, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->l:Landroid/graphics/Paint;

    .line 42
    .line 43
    move-object/from16 v1, p1

    .line 44
    .line 45
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 46
    .line 47
    .line 48
    iget-object v2, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->F:Ln1/a;

    .line 49
    .line 50
    invoke-virtual {v2, v1}, Ln1/a;->draw(Landroid/graphics/Canvas;)V

    .line 51
    .line 52
    .line 53
    iget v2, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->s:F

    .line 54
    .line 55
    iget v3, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->t:F

    .line 56
    .line 57
    iget v4, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->u:F

    .line 58
    .line 59
    const/4 v5, 0x3

    .line 60
    new-array v5, v5, [F

    .line 61
    .line 62
    const/4 v6, 0x0

    .line 63
    aput v2, v5, v6

    .line 64
    .line 65
    aput v3, v5, v8

    .line 66
    .line 67
    const/4 v2, 0x2

    .line 68
    aput v4, v5, v2

    .line 69
    .line 70
    invoke-static {v5}, Landroid/graphics/Color;->HSVToColor([F)I

    .line 71
    .line 72
    .line 73
    move-result v13

    .line 74
    invoke-static {v6, v5}, Landroid/graphics/Color;->HSVToColor(I[F)I

    .line 75
    .line 76
    .line 77
    move-result v14

    .line 78
    new-instance v8, Landroid/graphics/LinearGradient;

    .line 79
    .line 80
    iget v3, v7, Landroid/graphics/Rect;->left:I

    .line 81
    .line 82
    int-to-float v9, v3

    .line 83
    iget v3, v7, Landroid/graphics/Rect;->top:I

    .line 84
    .line 85
    int-to-float v10, v3

    .line 86
    iget v4, v7, Landroid/graphics/Rect;->right:I

    .line 87
    .line 88
    int-to-float v11, v4

    .line 89
    int-to-float v12, v3

    .line 90
    sget-object v15, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    .line 91
    .line 92
    invoke-direct/range {v8 .. v15}, Landroid/graphics/LinearGradient;-><init>(FFFFIILandroid/graphics/Shader$TileMode;)V

    .line 93
    .line 94
    .line 95
    iput-object v8, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->o:Landroid/graphics/Shader;

    .line 96
    .line 97
    iget-object v3, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->i:Landroid/graphics/Paint;

    .line 98
    .line 99
    invoke-virtual {v3, v8}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 100
    .line 101
    .line 102
    iget-object v3, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->i:Landroid/graphics/Paint;

    .line 103
    .line 104
    invoke-virtual {v1, v7, v3}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 105
    .line 106
    .line 107
    iget-object v3, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->w:Ljava/lang/String;

    .line 108
    .line 109
    if-eqz v3, :cond_1

    .line 110
    .line 111
    const-string v4, ""

    .line 112
    .line 113
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v3

    .line 117
    if-nez v3, :cond_1

    .line 118
    .line 119
    iget-object v3, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->w:Ljava/lang/String;

    .line 120
    .line 121
    invoke-virtual {v7}, Landroid/graphics/Rect;->centerX()I

    .line 122
    .line 123
    .line 124
    move-result v4

    .line 125
    int-to-float v4, v4

    .line 126
    invoke-virtual {v7}, Landroid/graphics/Rect;->centerY()I

    .line 127
    .line 128
    .line 129
    move-result v5

    .line 130
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 131
    .line 132
    .line 133
    move-result-object v6

    .line 134
    const/high16 v8, 0x40800000    # 4.0f

    .line 135
    .line 136
    invoke-static {v6, v8}, Ln1/c;->a(Landroid/content/Context;F)I

    .line 137
    .line 138
    .line 139
    move-result v6

    .line 140
    add-int/2addr v5, v6

    .line 141
    int-to-float v5, v5

    .line 142
    iget-object v6, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->j:Landroid/graphics/Paint;

    .line 143
    .line 144
    invoke-virtual {v1, v3, v4, v5, v6}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 145
    .line 146
    .line 147
    :cond_1
    iget v3, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->r:I

    .line 148
    .line 149
    invoke-virtual {v0, v3}, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->a(I)Landroid/graphics/Point;

    .line 150
    .line 151
    .line 152
    move-result-object v3

    .line 153
    new-instance v4, Landroid/graphics/RectF;

    .line 154
    .line 155
    invoke-direct {v4}, Landroid/graphics/RectF;-><init>()V

    .line 156
    .line 157
    .line 158
    iget v3, v3, Landroid/graphics/Point;->x:I

    .line 159
    .line 160
    iget v5, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->f:I

    .line 161
    .line 162
    div-int/lit8 v6, v5, 0x2

    .line 163
    .line 164
    sub-int v6, v3, v6

    .line 165
    .line 166
    int-to-float v6, v6

    .line 167
    iput v6, v4, Landroid/graphics/RectF;->left:F

    .line 168
    .line 169
    div-int/2addr v5, v2

    .line 170
    add-int/2addr v3, v5

    .line 171
    int-to-float v2, v3

    .line 172
    iput v2, v4, Landroid/graphics/RectF;->right:F

    .line 173
    .line 174
    iget v2, v7, Landroid/graphics/Rect;->top:I

    .line 175
    .line 176
    iget v3, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->e:I

    .line 177
    .line 178
    sub-int/2addr v2, v3

    .line 179
    int-to-float v2, v2

    .line 180
    iput v2, v4, Landroid/graphics/RectF;->top:F

    .line 181
    .line 182
    iget v2, v7, Landroid/graphics/Rect;->bottom:I

    .line 183
    .line 184
    add-int/2addr v2, v3

    .line 185
    int-to-float v2, v2

    .line 186
    iput v2, v4, Landroid/graphics/RectF;->bottom:F

    .line 187
    .line 188
    iget-object v2, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->k:Landroid/graphics/Paint;

    .line 189
    .line 190
    const/high16 v3, 0x40000000    # 2.0f

    .line 191
    .line 192
    invoke-virtual {v1, v4, v3, v3, v2}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 193
    .line 194
    .line 195
    :cond_2
    :goto_0
    return-void
.end method

.method public final d(Landroid/graphics/Canvas;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v7, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->C:Landroid/graphics/Rect;

    .line 4
    .line 5
    iget-object v1, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->l:Landroid/graphics/Paint;

    .line 6
    .line 7
    iget v2, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->y:I

    .line 8
    .line 9
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 10
    .line 11
    .line 12
    iget v1, v7, Landroid/graphics/Rect;->left:I

    .line 13
    .line 14
    const/4 v8, 0x1

    .line 15
    sub-int/2addr v1, v8

    .line 16
    int-to-float v2, v1

    .line 17
    iget v1, v7, Landroid/graphics/Rect;->top:I

    .line 18
    .line 19
    sub-int/2addr v1, v8

    .line 20
    int-to-float v3, v1

    .line 21
    iget v1, v7, Landroid/graphics/Rect;->right:I

    .line 22
    .line 23
    add-int/2addr v1, v8

    .line 24
    int-to-float v4, v1

    .line 25
    iget v1, v7, Landroid/graphics/Rect;->bottom:I

    .line 26
    .line 27
    add-int/2addr v1, v8

    .line 28
    int-to-float v5, v1

    .line 29
    iget-object v6, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->l:Landroid/graphics/Paint;

    .line 30
    .line 31
    move-object/from16 v1, p1

    .line 32
    .line 33
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 34
    .line 35
    .line 36
    iget-object v2, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->q:Lcom/jaredrummler/android/colorpicker/ColorPickerView$b;

    .line 37
    .line 38
    const/4 v3, 0x2

    .line 39
    const/4 v4, 0x0

    .line 40
    if-nez v2, :cond_1

    .line 41
    .line 42
    new-instance v2, Lcom/jaredrummler/android/colorpicker/ColorPickerView$b;

    .line 43
    .line 44
    invoke-direct {v2, v0, v4}, Lcom/jaredrummler/android/colorpicker/ColorPickerView$b;-><init>(Lcom/jaredrummler/android/colorpicker/ColorPickerView;Lcom/jaredrummler/android/colorpicker/ColorPickerView$a;)V

    .line 45
    .line 46
    .line 47
    iput-object v2, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->q:Lcom/jaredrummler/android/colorpicker/ColorPickerView$b;

    .line 48
    .line 49
    invoke-virtual {v7}, Landroid/graphics/Rect;->width()I

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    invoke-virtual {v7}, Landroid/graphics/Rect;->height()I

    .line 54
    .line 55
    .line 56
    move-result v6

    .line 57
    sget-object v9, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 58
    .line 59
    invoke-static {v5, v6, v9}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 60
    .line 61
    .line 62
    move-result-object v5

    .line 63
    iput-object v5, v2, Lcom/jaredrummler/android/colorpicker/ColorPickerView$b;->b:Landroid/graphics/Bitmap;

    .line 64
    .line 65
    iget-object v2, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->q:Lcom/jaredrummler/android/colorpicker/ColorPickerView$b;

    .line 66
    .line 67
    new-instance v5, Landroid/graphics/Canvas;

    .line 68
    .line 69
    iget-object v6, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->q:Lcom/jaredrummler/android/colorpicker/ColorPickerView$b;

    .line 70
    .line 71
    iget-object v6, v6, Lcom/jaredrummler/android/colorpicker/ColorPickerView$b;->b:Landroid/graphics/Bitmap;

    .line 72
    .line 73
    invoke-direct {v5, v6}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 74
    .line 75
    .line 76
    iput-object v5, v2, Lcom/jaredrummler/android/colorpicker/ColorPickerView$b;->a:Landroid/graphics/Canvas;

    .line 77
    .line 78
    invoke-virtual {v7}, Landroid/graphics/Rect;->height()I

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    int-to-float v2, v2

    .line 83
    const/high16 v5, 0x3f000000    # 0.5f

    .line 84
    .line 85
    add-float/2addr v2, v5

    .line 86
    float-to-int v2, v2

    .line 87
    new-array v5, v2, [I

    .line 88
    .line 89
    const/4 v6, 0x0

    .line 90
    const/high16 v9, 0x43b40000    # 360.0f

    .line 91
    .line 92
    move v10, v6

    .line 93
    move v11, v9

    .line 94
    :goto_0
    if-ge v10, v2, :cond_0

    .line 95
    .line 96
    const/4 v12, 0x3

    .line 97
    new-array v12, v12, [F

    .line 98
    .line 99
    aput v11, v12, v6

    .line 100
    .line 101
    const/high16 v13, 0x3f800000    # 1.0f

    .line 102
    .line 103
    aput v13, v12, v8

    .line 104
    .line 105
    aput v13, v12, v3

    .line 106
    .line 107
    invoke-static {v12}, Landroid/graphics/Color;->HSVToColor([F)I

    .line 108
    .line 109
    .line 110
    move-result v12

    .line 111
    aput v12, v5, v10

    .line 112
    .line 113
    int-to-float v12, v2

    .line 114
    div-float v12, v9, v12

    .line 115
    .line 116
    sub-float/2addr v11, v12

    .line 117
    add-int/lit8 v10, v10, 0x1

    .line 118
    .line 119
    goto :goto_0

    .line 120
    :cond_0
    new-instance v8, Landroid/graphics/Paint;

    .line 121
    .line 122
    invoke-direct {v8}, Landroid/graphics/Paint;-><init>()V

    .line 123
    .line 124
    .line 125
    const/4 v9, 0x0

    .line 126
    invoke-virtual {v8, v9}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 127
    .line 128
    .line 129
    :goto_1
    if-ge v6, v2, :cond_1

    .line 130
    .line 131
    aget v9, v5, v6

    .line 132
    .line 133
    invoke-virtual {v8, v9}, Landroid/graphics/Paint;->setColor(I)V

    .line 134
    .line 135
    .line 136
    iget-object v9, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->q:Lcom/jaredrummler/android/colorpicker/ColorPickerView$b;

    .line 137
    .line 138
    iget-object v12, v9, Lcom/jaredrummler/android/colorpicker/ColorPickerView$b;->a:Landroid/graphics/Canvas;

    .line 139
    .line 140
    int-to-float v14, v6

    .line 141
    iget-object v9, v9, Lcom/jaredrummler/android/colorpicker/ColorPickerView$b;->b:Landroid/graphics/Bitmap;

    .line 142
    .line 143
    invoke-virtual {v9}, Landroid/graphics/Bitmap;->getWidth()I

    .line 144
    .line 145
    .line 146
    move-result v9

    .line 147
    int-to-float v15, v9

    .line 148
    const/4 v13, 0x0

    .line 149
    move/from16 v16, v14

    .line 150
    .line 151
    move-object/from16 v17, v8

    .line 152
    .line 153
    invoke-virtual/range {v12 .. v17}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 154
    .line 155
    .line 156
    add-int/lit8 v6, v6, 0x1

    .line 157
    .line 158
    goto :goto_1

    .line 159
    :cond_1
    iget-object v2, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->q:Lcom/jaredrummler/android/colorpicker/ColorPickerView$b;

    .line 160
    .line 161
    iget-object v2, v2, Lcom/jaredrummler/android/colorpicker/ColorPickerView$b;->b:Landroid/graphics/Bitmap;

    .line 162
    .line 163
    invoke-virtual {v1, v2, v4, v7, v4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 164
    .line 165
    .line 166
    iget v2, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->s:F

    .line 167
    .line 168
    invoke-virtual {v0, v2}, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->f(F)Landroid/graphics/Point;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    new-instance v4, Landroid/graphics/RectF;

    .line 173
    .line 174
    invoke-direct {v4}, Landroid/graphics/RectF;-><init>()V

    .line 175
    .line 176
    .line 177
    iget v5, v7, Landroid/graphics/Rect;->left:I

    .line 178
    .line 179
    iget v6, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->e:I

    .line 180
    .line 181
    sub-int/2addr v5, v6

    .line 182
    int-to-float v5, v5

    .line 183
    iput v5, v4, Landroid/graphics/RectF;->left:F

    .line 184
    .line 185
    iget v5, v7, Landroid/graphics/Rect;->right:I

    .line 186
    .line 187
    add-int/2addr v5, v6

    .line 188
    int-to-float v5, v5

    .line 189
    iput v5, v4, Landroid/graphics/RectF;->right:F

    .line 190
    .line 191
    iget v2, v2, Landroid/graphics/Point;->y:I

    .line 192
    .line 193
    iget v5, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->f:I

    .line 194
    .line 195
    div-int/lit8 v6, v5, 0x2

    .line 196
    .line 197
    sub-int v6, v2, v6

    .line 198
    .line 199
    int-to-float v6, v6

    .line 200
    iput v6, v4, Landroid/graphics/RectF;->top:F

    .line 201
    .line 202
    div-int/2addr v5, v3

    .line 203
    add-int/2addr v2, v5

    .line 204
    int-to-float v2, v2

    .line 205
    iput v2, v4, Landroid/graphics/RectF;->bottom:F

    .line 206
    .line 207
    iget-object v2, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->k:Landroid/graphics/Paint;

    .line 208
    .line 209
    const/high16 v3, 0x40000000    # 2.0f

    .line 210
    .line 211
    invoke-virtual {v1, v4, v3, v3, v2}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 212
    .line 213
    .line 214
    return-void
.end method

.method public final e(Landroid/graphics/Canvas;)V
    .locals 14

    .line 1
    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->B:Landroid/graphics/Rect;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->l:Landroid/graphics/Paint;

    .line 4
    .line 5
    iget v2, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->y:I

    .line 6
    .line 7
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->A:Landroid/graphics/Rect;

    .line 11
    .line 12
    iget v2, v1, Landroid/graphics/Rect;->left:I

    .line 13
    .line 14
    int-to-float v4, v2

    .line 15
    iget v1, v1, Landroid/graphics/Rect;->top:I

    .line 16
    .line 17
    int-to-float v5, v1

    .line 18
    iget v1, v0, Landroid/graphics/Rect;->right:I

    .line 19
    .line 20
    const/4 v2, 0x1

    .line 21
    add-int/2addr v1, v2

    .line 22
    int-to-float v6, v1

    .line 23
    iget v1, v0, Landroid/graphics/Rect;->bottom:I

    .line 24
    .line 25
    add-int/2addr v1, v2

    .line 26
    int-to-float v7, v1

    .line 27
    iget-object v8, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->l:Landroid/graphics/Paint;

    .line 28
    .line 29
    move-object v3, p1

    .line 30
    invoke-virtual/range {v3 .. v8}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 31
    .line 32
    .line 33
    iget-object p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->m:Landroid/graphics/Shader;

    .line 34
    .line 35
    if-nez p1, :cond_0

    .line 36
    .line 37
    new-instance v4, Landroid/graphics/LinearGradient;

    .line 38
    .line 39
    iget p1, v0, Landroid/graphics/Rect;->left:I

    .line 40
    .line 41
    int-to-float v5, p1

    .line 42
    iget v1, v0, Landroid/graphics/Rect;->top:I

    .line 43
    .line 44
    int-to-float v6, v1

    .line 45
    int-to-float v7, p1

    .line 46
    iget p1, v0, Landroid/graphics/Rect;->bottom:I

    .line 47
    .line 48
    int-to-float v8, p1

    .line 49
    const/high16 v10, -0x1000000

    .line 50
    .line 51
    sget-object v11, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    .line 52
    .line 53
    const/4 v9, -0x1

    .line 54
    invoke-direct/range {v4 .. v11}, Landroid/graphics/LinearGradient;-><init>(FFFFIILandroid/graphics/Shader$TileMode;)V

    .line 55
    .line 56
    .line 57
    iput-object v4, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->m:Landroid/graphics/Shader;

    .line 58
    .line 59
    :cond_0
    iget-object p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->p:Lcom/jaredrummler/android/colorpicker/ColorPickerView$b;

    .line 60
    .line 61
    const/high16 v1, 0x3f800000    # 1.0f

    .line 62
    .line 63
    const/4 v4, 0x0

    .line 64
    if-eqz p1, :cond_1

    .line 65
    .line 66
    iget v5, p1, Lcom/jaredrummler/android/colorpicker/ColorPickerView$b;->c:F

    .line 67
    .line 68
    iget v6, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->s:F

    .line 69
    .line 70
    cmpl-float v5, v5, v6

    .line 71
    .line 72
    if-eqz v5, :cond_5

    .line 73
    .line 74
    :cond_1
    if-nez p1, :cond_2

    .line 75
    .line 76
    new-instance p1, Lcom/jaredrummler/android/colorpicker/ColorPickerView$b;

    .line 77
    .line 78
    invoke-direct {p1, p0, v4}, Lcom/jaredrummler/android/colorpicker/ColorPickerView$b;-><init>(Lcom/jaredrummler/android/colorpicker/ColorPickerView;Lcom/jaredrummler/android/colorpicker/ColorPickerView$a;)V

    .line 79
    .line 80
    .line 81
    iput-object p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->p:Lcom/jaredrummler/android/colorpicker/ColorPickerView$b;

    .line 82
    .line 83
    :cond_2
    iget-object p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->p:Lcom/jaredrummler/android/colorpicker/ColorPickerView$b;

    .line 84
    .line 85
    iget-object v5, p1, Lcom/jaredrummler/android/colorpicker/ColorPickerView$b;->b:Landroid/graphics/Bitmap;

    .line 86
    .line 87
    if-nez v5, :cond_3

    .line 88
    .line 89
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 90
    .line 91
    .line 92
    move-result v5

    .line 93
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    .line 94
    .line 95
    .line 96
    move-result v6

    .line 97
    sget-object v7, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 98
    .line 99
    invoke-static {v5, v6, v7}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 100
    .line 101
    .line 102
    move-result-object v5

    .line 103
    iput-object v5, p1, Lcom/jaredrummler/android/colorpicker/ColorPickerView$b;->b:Landroid/graphics/Bitmap;

    .line 104
    .line 105
    :cond_3
    iget-object p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->p:Lcom/jaredrummler/android/colorpicker/ColorPickerView$b;

    .line 106
    .line 107
    iget-object v5, p1, Lcom/jaredrummler/android/colorpicker/ColorPickerView$b;->a:Landroid/graphics/Canvas;

    .line 108
    .line 109
    if-nez v5, :cond_4

    .line 110
    .line 111
    new-instance v5, Landroid/graphics/Canvas;

    .line 112
    .line 113
    iget-object v6, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->p:Lcom/jaredrummler/android/colorpicker/ColorPickerView$b;

    .line 114
    .line 115
    iget-object v6, v6, Lcom/jaredrummler/android/colorpicker/ColorPickerView$b;->b:Landroid/graphics/Bitmap;

    .line 116
    .line 117
    invoke-direct {v5, v6}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 118
    .line 119
    .line 120
    iput-object v5, p1, Lcom/jaredrummler/android/colorpicker/ColorPickerView$b;->a:Landroid/graphics/Canvas;

    .line 121
    .line 122
    :cond_4
    iget p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->s:F

    .line 123
    .line 124
    const/4 v5, 0x3

    .line 125
    new-array v5, v5, [F

    .line 126
    .line 127
    const/4 v6, 0x0

    .line 128
    aput p1, v5, v6

    .line 129
    .line 130
    aput v1, v5, v2

    .line 131
    .line 132
    const/4 p1, 0x2

    .line 133
    aput v1, v5, p1

    .line 134
    .line 135
    invoke-static {v5}, Landroid/graphics/Color;->HSVToColor([F)I

    .line 136
    .line 137
    .line 138
    move-result v12

    .line 139
    new-instance v6, Landroid/graphics/LinearGradient;

    .line 140
    .line 141
    iget p1, v0, Landroid/graphics/Rect;->left:I

    .line 142
    .line 143
    int-to-float v7, p1

    .line 144
    iget p1, v0, Landroid/graphics/Rect;->top:I

    .line 145
    .line 146
    int-to-float v8, p1

    .line 147
    iget v2, v0, Landroid/graphics/Rect;->right:I

    .line 148
    .line 149
    int-to-float v9, v2

    .line 150
    int-to-float v10, p1

    .line 151
    const/4 v11, -0x1

    .line 152
    sget-object v13, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    .line 153
    .line 154
    invoke-direct/range {v6 .. v13}, Landroid/graphics/LinearGradient;-><init>(FFFFIILandroid/graphics/Shader$TileMode;)V

    .line 155
    .line 156
    .line 157
    iput-object v6, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->n:Landroid/graphics/Shader;

    .line 158
    .line 159
    new-instance p1, Landroid/graphics/ComposeShader;

    .line 160
    .line 161
    iget-object v2, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->m:Landroid/graphics/Shader;

    .line 162
    .line 163
    iget-object v5, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->n:Landroid/graphics/Shader;

    .line 164
    .line 165
    sget-object v6, Landroid/graphics/PorterDuff$Mode;->MULTIPLY:Landroid/graphics/PorterDuff$Mode;

    .line 166
    .line 167
    invoke-direct {p1, v2, v5, v6}, Landroid/graphics/ComposeShader;-><init>(Landroid/graphics/Shader;Landroid/graphics/Shader;Landroid/graphics/PorterDuff$Mode;)V

    .line 168
    .line 169
    .line 170
    iget-object v2, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->g:Landroid/graphics/Paint;

    .line 171
    .line 172
    invoke-virtual {v2, p1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 173
    .line 174
    .line 175
    iget-object p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->p:Lcom/jaredrummler/android/colorpicker/ColorPickerView$b;

    .line 176
    .line 177
    iget-object v5, p1, Lcom/jaredrummler/android/colorpicker/ColorPickerView$b;->a:Landroid/graphics/Canvas;

    .line 178
    .line 179
    iget-object p1, p1, Lcom/jaredrummler/android/colorpicker/ColorPickerView$b;->b:Landroid/graphics/Bitmap;

    .line 180
    .line 181
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 182
    .line 183
    .line 184
    move-result p1

    .line 185
    int-to-float v8, p1

    .line 186
    iget-object p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->p:Lcom/jaredrummler/android/colorpicker/ColorPickerView$b;

    .line 187
    .line 188
    iget-object p1, p1, Lcom/jaredrummler/android/colorpicker/ColorPickerView$b;->b:Landroid/graphics/Bitmap;

    .line 189
    .line 190
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 191
    .line 192
    .line 193
    move-result p1

    .line 194
    int-to-float v9, p1

    .line 195
    iget-object v10, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->g:Landroid/graphics/Paint;

    .line 196
    .line 197
    const/4 v6, 0x0

    .line 198
    const/4 v7, 0x0

    .line 199
    invoke-virtual/range {v5 .. v10}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 200
    .line 201
    .line 202
    iget-object p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->p:Lcom/jaredrummler/android/colorpicker/ColorPickerView$b;

    .line 203
    .line 204
    iget v2, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->s:F

    .line 205
    .line 206
    iput v2, p1, Lcom/jaredrummler/android/colorpicker/ColorPickerView$b;->c:F

    .line 207
    .line 208
    :cond_5
    iget-object p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->p:Lcom/jaredrummler/android/colorpicker/ColorPickerView$b;

    .line 209
    .line 210
    iget-object p1, p1, Lcom/jaredrummler/android/colorpicker/ColorPickerView$b;->b:Landroid/graphics/Bitmap;

    .line 211
    .line 212
    invoke-virtual {v3, p1, v4, v0, v4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 213
    .line 214
    .line 215
    iget p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->t:F

    .line 216
    .line 217
    iget v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->u:F

    .line 218
    .line 219
    invoke-virtual {p0, p1, v0}, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->m(FF)Landroid/graphics/Point;

    .line 220
    .line 221
    .line 222
    move-result-object p1

    .line 223
    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->h:Landroid/graphics/Paint;

    .line 224
    .line 225
    const/high16 v2, -0x1000000

    .line 226
    .line 227
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 228
    .line 229
    .line 230
    iget v0, p1, Landroid/graphics/Point;->x:I

    .line 231
    .line 232
    int-to-float v0, v0

    .line 233
    iget v2, p1, Landroid/graphics/Point;->y:I

    .line 234
    .line 235
    int-to-float v2, v2

    .line 236
    iget v4, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->d:I

    .line 237
    .line 238
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 239
    .line 240
    .line 241
    move-result-object v5

    .line 242
    invoke-static {v5, v1}, Ln1/c;->a(Landroid/content/Context;F)I

    .line 243
    .line 244
    .line 245
    move-result v1

    .line 246
    sub-int/2addr v4, v1

    .line 247
    int-to-float v1, v4

    .line 248
    iget-object v4, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->h:Landroid/graphics/Paint;

    .line 249
    .line 250
    invoke-virtual {v3, v0, v2, v1, v4}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 251
    .line 252
    .line 253
    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->h:Landroid/graphics/Paint;

    .line 254
    .line 255
    const v1, -0x222223

    .line 256
    .line 257
    .line 258
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 259
    .line 260
    .line 261
    iget v0, p1, Landroid/graphics/Point;->x:I

    .line 262
    .line 263
    int-to-float v0, v0

    .line 264
    iget p1, p1, Landroid/graphics/Point;->y:I

    .line 265
    .line 266
    int-to-float p1, p1

    .line 267
    iget v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->d:I

    .line 268
    .line 269
    int-to-float v1, v1

    .line 270
    iget-object v2, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->h:Landroid/graphics/Paint;

    .line 271
    .line 272
    invoke-virtual {v3, v0, p1, v1, v2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 273
    .line 274
    .line 275
    return-void
.end method

.method public final f(F)Landroid/graphics/Point;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->C:Landroid/graphics/Rect;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    int-to-float v1, v1

    .line 8
    new-instance v2, Landroid/graphics/Point;

    .line 9
    .line 10
    invoke-direct {v2}, Landroid/graphics/Point;-><init>()V

    .line 11
    .line 12
    .line 13
    mul-float/2addr p1, v1

    .line 14
    const/high16 v3, 0x43b40000    # 360.0f

    .line 15
    .line 16
    div-float/2addr p1, v3

    .line 17
    sub-float/2addr v1, p1

    .line 18
    iget p1, v0, Landroid/graphics/Rect;->top:I

    .line 19
    .line 20
    int-to-float p1, p1

    .line 21
    add-float/2addr v1, p1

    .line 22
    float-to-int p1, v1

    .line 23
    iput p1, v2, Landroid/graphics/Point;->y:I

    .line 24
    .line 25
    iget p1, v0, Landroid/graphics/Rect;->left:I

    .line 26
    .line 27
    iput p1, v2, Landroid/graphics/Point;->x:I

    .line 28
    .line 29
    return-object v2
.end method

.method public final g(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lcom/jaredrummler/android/colorpicker/R$styleable;->ColorPickerView:[I

    .line 6
    .line 7
    invoke-virtual {v0, p2, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    sget v0, Lcom/jaredrummler/android/colorpicker/R$styleable;->ColorPickerView_cpv_alphaChannelVisible:I

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iput-boolean v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->v:Z

    .line 19
    .line 20
    sget v0, Lcom/jaredrummler/android/colorpicker/R$styleable;->ColorPickerView_cpv_alphaChannelText:I

    .line 21
    .line 22
    invoke-virtual {p2, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iput-object v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->w:Ljava/lang/String;

    .line 27
    .line 28
    sget v0, Lcom/jaredrummler/android/colorpicker/R$styleable;->ColorPickerView_cpv_sliderColor:I

    .line 29
    .line 30
    const v1, -0x424243

    .line 31
    .line 32
    .line 33
    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    iput v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->x:I

    .line 38
    .line 39
    sget v0, Lcom/jaredrummler/android/colorpicker/R$styleable;->ColorPickerView_cpv_borderColor:I

    .line 40
    .line 41
    const v1, -0x919192

    .line 42
    .line 43
    .line 44
    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    iput v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->y:I

    .line 49
    .line 50
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0, p1}, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->b(Landroid/content/Context;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    const/high16 p2, 0x41f00000    # 30.0f

    .line 61
    .line 62
    invoke-static {p1, p2}, Ln1/c;->a(Landroid/content/Context;F)I

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    iput p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->a:I

    .line 67
    .line 68
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    const/high16 p2, 0x41a00000    # 20.0f

    .line 73
    .line 74
    invoke-static {p1, p2}, Ln1/c;->a(Landroid/content/Context;F)I

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    iput p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->b:I

    .line 79
    .line 80
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    const/high16 p2, 0x41200000    # 10.0f

    .line 85
    .line 86
    invoke-static {p1, p2}, Ln1/c;->a(Landroid/content/Context;F)I

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    iput p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->c:I

    .line 91
    .line 92
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    const/high16 p2, 0x40a00000    # 5.0f

    .line 97
    .line 98
    invoke-static {p1, p2}, Ln1/c;->a(Landroid/content/Context;F)I

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    iput p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->d:I

    .line 103
    .line 104
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    const/high16 p2, 0x40800000    # 4.0f

    .line 109
    .line 110
    invoke-static {p1, p2}, Ln1/c;->a(Landroid/content/Context;F)I

    .line 111
    .line 112
    .line 113
    move-result p1

    .line 114
    iput p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->f:I

    .line 115
    .line 116
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    const/high16 p2, 0x40000000    # 2.0f

    .line 121
    .line 122
    invoke-static {p1, p2}, Ln1/c;->a(Landroid/content/Context;F)I

    .line 123
    .line 124
    .line 125
    move-result p1

    .line 126
    iput p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->e:I

    .line 127
    .line 128
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    sget p2, Lcom/jaredrummler/android/colorpicker/R$dimen;->cpv_required_padding:I

    .line 133
    .line 134
    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 135
    .line 136
    .line 137
    move-result p1

    .line 138
    iput p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->z:I

    .line 139
    .line 140
    invoke-virtual {p0}, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->h()V

    .line 141
    .line 142
    .line 143
    const/4 p1, 0x1

    .line 144
    invoke-virtual {p0, p1}, Landroid/view/View;->setFocusable(Z)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {p0, p1}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 148
    .line 149
    .line 150
    return-void
.end method

.method public getAlphaSliderText()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->w:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getBorderColor()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->y:I

    .line 2
    .line 3
    return v0
.end method

.method public getColor()I
    .locals 6

    .line 1
    iget v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->r:I

    .line 2
    .line 3
    iget v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->s:F

    .line 4
    .line 5
    iget v2, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->t:F

    .line 6
    .line 7
    iget v3, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->u:F

    .line 8
    .line 9
    const/4 v4, 0x3

    .line 10
    new-array v4, v4, [F

    .line 11
    .line 12
    const/4 v5, 0x0

    .line 13
    aput v1, v4, v5

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    aput v2, v4, v1

    .line 17
    .line 18
    const/4 v1, 0x2

    .line 19
    aput v3, v4, v1

    .line 20
    .line 21
    invoke-static {v0, v4}, Landroid/graphics/Color;->HSVToColor(I[F)I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    return v0
.end method

.method public getPaddingBottom()I
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->z:I

    .line 6
    .line 7
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method public getPaddingLeft()I
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->z:I

    .line 6
    .line 7
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method public getPaddingRight()I
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/view/View;->getPaddingRight()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->z:I

    .line 6
    .line 7
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method public getPaddingTop()I
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/view/View;->getPaddingTop()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->z:I

    .line 6
    .line 7
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method public getSliderTrackerColor()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->x:I

    .line 2
    .line 3
    return v0
.end method

.method public final h()V
    .locals 5

    .line 1
    new-instance v0, Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->g:Landroid/graphics/Paint;

    .line 7
    .line 8
    new-instance v0, Landroid/graphics/Paint;

    .line 9
    .line 10
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->h:Landroid/graphics/Paint;

    .line 14
    .line 15
    new-instance v0, Landroid/graphics/Paint;

    .line 16
    .line 17
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->k:Landroid/graphics/Paint;

    .line 21
    .line 22
    new-instance v0, Landroid/graphics/Paint;

    .line 23
    .line 24
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->i:Landroid/graphics/Paint;

    .line 28
    .line 29
    new-instance v0, Landroid/graphics/Paint;

    .line 30
    .line 31
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->j:Landroid/graphics/Paint;

    .line 35
    .line 36
    new-instance v0, Landroid/graphics/Paint;

    .line 37
    .line 38
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 39
    .line 40
    .line 41
    iput-object v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->l:Landroid/graphics/Paint;

    .line 42
    .line 43
    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->h:Landroid/graphics/Paint;

    .line 44
    .line 45
    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 48
    .line 49
    .line 50
    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->h:Landroid/graphics/Paint;

    .line 51
    .line 52
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    const/high16 v3, 0x40000000    # 2.0f

    .line 57
    .line 58
    invoke-static {v2, v3}, Ln1/c;->a(Landroid/content/Context;F)I

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    int-to-float v2, v2

    .line 63
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 64
    .line 65
    .line 66
    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->h:Landroid/graphics/Paint;

    .line 67
    .line 68
    const/4 v2, 0x1

    .line 69
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 70
    .line 71
    .line 72
    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->k:Landroid/graphics/Paint;

    .line 73
    .line 74
    iget v4, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->x:I

    .line 75
    .line 76
    invoke-virtual {v0, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 77
    .line 78
    .line 79
    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->k:Landroid/graphics/Paint;

    .line 80
    .line 81
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 82
    .line 83
    .line 84
    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->k:Landroid/graphics/Paint;

    .line 85
    .line 86
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-static {v1, v3}, Ln1/c;->a(Landroid/content/Context;F)I

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    int-to-float v1, v1

    .line 95
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 96
    .line 97
    .line 98
    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->k:Landroid/graphics/Paint;

    .line 99
    .line 100
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 101
    .line 102
    .line 103
    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->j:Landroid/graphics/Paint;

    .line 104
    .line 105
    const v1, -0xe3e3e4

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 109
    .line 110
    .line 111
    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->j:Landroid/graphics/Paint;

    .line 112
    .line 113
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    const/high16 v3, 0x41600000    # 14.0f

    .line 118
    .line 119
    invoke-static {v1, v3}, Ln1/c;->a(Landroid/content/Context;F)I

    .line 120
    .line 121
    .line 122
    move-result v1

    .line 123
    int-to-float v1, v1

    .line 124
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 125
    .line 126
    .line 127
    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->j:Landroid/graphics/Paint;

    .line 128
    .line 129
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 130
    .line 131
    .line 132
    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->j:Landroid/graphics/Paint;

    .line 133
    .line 134
    sget-object v1, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    .line 135
    .line 136
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 137
    .line 138
    .line 139
    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->j:Landroid/graphics/Paint;

    .line 140
    .line 141
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setFakeBoldText(Z)V

    .line 142
    .line 143
    .line 144
    return-void
.end method

.method public final i(Landroid/view/MotionEvent;)Z
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->E:Landroid/graphics/Point;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    iget v2, v0, Landroid/graphics/Point;->x:I

    .line 8
    .line 9
    iget v0, v0, Landroid/graphics/Point;->y:I

    .line 10
    .line 11
    iget-object v3, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->C:Landroid/graphics/Rect;

    .line 12
    .line 13
    invoke-virtual {v3, v2, v0}, Landroid/graphics/Rect;->contains(II)Z

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    const/4 v4, 0x1

    .line 18
    if-eqz v3, :cond_1

    .line 19
    .line 20
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    invoke-virtual {p0, p1}, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->k(F)F

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    iput p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->s:F

    .line 29
    .line 30
    return v4

    .line 31
    :cond_1
    iget-object v3, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->B:Landroid/graphics/Rect;

    .line 32
    .line 33
    invoke-virtual {v3, v2, v0}, Landroid/graphics/Rect;->contains(II)Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-eqz v3, :cond_2

    .line 38
    .line 39
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    invoke-virtual {p0, v0, p1}, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->l(FF)[F

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    aget v0, p1, v1

    .line 52
    .line 53
    iput v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->t:F

    .line 54
    .line 55
    aget p1, p1, v4

    .line 56
    .line 57
    iput p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->u:F

    .line 58
    .line 59
    return v4

    .line 60
    :cond_2
    iget-object v3, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->D:Landroid/graphics/Rect;

    .line 61
    .line 62
    if-eqz v3, :cond_3

    .line 63
    .line 64
    invoke-virtual {v3, v2, v0}, Landroid/graphics/Rect;->contains(II)Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-eqz v0, :cond_3

    .line 69
    .line 70
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    float-to-int p1, p1

    .line 75
    invoke-virtual {p0, p1}, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->j(I)I

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    iput p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->r:I

    .line 80
    .line 81
    return v4

    .line 82
    :cond_3
    return v1
.end method

.method public final j(I)I
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->D:Landroid/graphics/Rect;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    iget v2, v0, Landroid/graphics/Rect;->left:I

    .line 8
    .line 9
    if-ge p1, v2, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iget v0, v0, Landroid/graphics/Rect;->right:I

    .line 14
    .line 15
    if-le p1, v0, :cond_1

    .line 16
    .line 17
    move p1, v1

    .line 18
    goto :goto_0

    .line 19
    :cond_1
    sub-int/2addr p1, v2

    .line 20
    :goto_0
    mul-int/lit16 p1, p1, 0xff

    .line 21
    .line 22
    div-int/2addr p1, v1

    .line 23
    rsub-int p1, p1, 0xff

    .line 24
    .line 25
    return p1
.end method

.method public final k(F)F
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->C:Landroid/graphics/Rect;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    int-to-float v1, v1

    .line 8
    iget v2, v0, Landroid/graphics/Rect;->top:I

    .line 9
    .line 10
    int-to-float v3, v2

    .line 11
    cmpg-float v3, p1, v3

    .line 12
    .line 13
    if-gez v3, :cond_0

    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    .line 18
    .line 19
    int-to-float v0, v0

    .line 20
    cmpl-float v0, p1, v0

    .line 21
    .line 22
    if-lez v0, :cond_1

    .line 23
    .line 24
    move p1, v1

    .line 25
    goto :goto_0

    .line 26
    :cond_1
    int-to-float v0, v2

    .line 27
    sub-float/2addr p1, v0

    .line 28
    :goto_0
    const/high16 v0, 0x43b40000    # 360.0f

    .line 29
    .line 30
    mul-float/2addr p1, v0

    .line 31
    div-float/2addr p1, v1

    .line 32
    sub-float/2addr v0, p1

    .line 33
    return v0
.end method

.method public final l(FF)[F
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->B:Landroid/graphics/Rect;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    int-to-float v1, v1

    .line 8
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    int-to-float v2, v2

    .line 13
    iget v3, v0, Landroid/graphics/Rect;->left:I

    .line 14
    .line 15
    int-to-float v4, v3

    .line 16
    cmpg-float v4, p1, v4

    .line 17
    .line 18
    const/4 v5, 0x0

    .line 19
    if-gez v4, :cond_0

    .line 20
    .line 21
    move p1, v5

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget v4, v0, Landroid/graphics/Rect;->right:I

    .line 24
    .line 25
    int-to-float v4, v4

    .line 26
    cmpl-float v4, p1, v4

    .line 27
    .line 28
    if-lez v4, :cond_1

    .line 29
    .line 30
    move p1, v1

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    int-to-float v3, v3

    .line 33
    sub-float/2addr p1, v3

    .line 34
    :goto_0
    iget v3, v0, Landroid/graphics/Rect;->top:I

    .line 35
    .line 36
    int-to-float v4, v3

    .line 37
    cmpg-float v4, p2, v4

    .line 38
    .line 39
    if-gez v4, :cond_2

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_2
    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    .line 43
    .line 44
    int-to-float v0, v0

    .line 45
    cmpl-float v0, p2, v0

    .line 46
    .line 47
    if-lez v0, :cond_3

    .line 48
    .line 49
    move v5, v2

    .line 50
    goto :goto_1

    .line 51
    :cond_3
    int-to-float v0, v3

    .line 52
    sub-float v5, p2, v0

    .line 53
    .line 54
    :goto_1
    const/high16 p2, 0x3f800000    # 1.0f

    .line 55
    .line 56
    div-float v0, p2, v1

    .line 57
    .line 58
    mul-float/2addr v0, p1

    .line 59
    div-float p1, p2, v2

    .line 60
    .line 61
    mul-float/2addr p1, v5

    .line 62
    sub-float/2addr p2, p1

    .line 63
    const/4 p1, 0x2

    .line 64
    new-array p1, p1, [F

    .line 65
    .line 66
    const/4 v1, 0x0

    .line 67
    aput v0, p1, v1

    .line 68
    .line 69
    const/4 v0, 0x1

    .line 70
    aput p2, p1, v0

    .line 71
    .line 72
    return-object p1
.end method

.method public final m(FF)Landroid/graphics/Point;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->B:Landroid/graphics/Rect;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    int-to-float v1, v1

    .line 8
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    int-to-float v2, v2

    .line 13
    new-instance v3, Landroid/graphics/Point;

    .line 14
    .line 15
    invoke-direct {v3}, Landroid/graphics/Point;-><init>()V

    .line 16
    .line 17
    .line 18
    mul-float/2addr p1, v2

    .line 19
    iget v2, v0, Landroid/graphics/Rect;->left:I

    .line 20
    .line 21
    int-to-float v2, v2

    .line 22
    add-float/2addr p1, v2

    .line 23
    float-to-int p1, p1

    .line 24
    iput p1, v3, Landroid/graphics/Point;->x:I

    .line 25
    .line 26
    const/high16 p1, 0x3f800000    # 1.0f

    .line 27
    .line 28
    sub-float/2addr p1, p2

    .line 29
    mul-float/2addr p1, v1

    .line 30
    iget p2, v0, Landroid/graphics/Rect;->top:I

    .line 31
    .line 32
    int-to-float p2, p2

    .line 33
    add-float/2addr p1, p2

    .line 34
    float-to-int p1, p1

    .line 35
    iput p1, v3, Landroid/graphics/Point;->y:I

    .line 36
    .line 37
    return-object v3
.end method

.method public n(IZ)V
    .locals 7

    .line 1
    invoke-static {p1}, Landroid/graphics/Color;->alpha(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p1}, Landroid/graphics/Color;->red(I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-static {p1}, Landroid/graphics/Color;->blue(I)I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-static {p1}, Landroid/graphics/Color;->green(I)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    const/4 v3, 0x3

    .line 18
    new-array v4, v3, [F

    .line 19
    .line 20
    invoke-static {v1, p1, v2, v4}, Landroid/graphics/Color;->RGBToHSV(III[F)V

    .line 21
    .line 22
    .line 23
    iput v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->r:I

    .line 24
    .line 25
    const/4 p1, 0x0

    .line 26
    aget v1, v4, p1

    .line 27
    .line 28
    iput v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->s:F

    .line 29
    .line 30
    const/4 v2, 0x1

    .line 31
    aget v5, v4, v2

    .line 32
    .line 33
    iput v5, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->t:F

    .line 34
    .line 35
    const/4 v6, 0x2

    .line 36
    aget v4, v4, v6

    .line 37
    .line 38
    iput v4, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->u:F

    .line 39
    .line 40
    if-eqz p2, :cond_0

    .line 41
    .line 42
    iget-object p2, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->G:Lcom/jaredrummler/android/colorpicker/ColorPickerView$c;

    .line 43
    .line 44
    if-eqz p2, :cond_0

    .line 45
    .line 46
    new-array v3, v3, [F

    .line 47
    .line 48
    aput v1, v3, p1

    .line 49
    .line 50
    aput v5, v3, v2

    .line 51
    .line 52
    aput v4, v3, v6

    .line 53
    .line 54
    invoke-static {v0, v3}, Landroid/graphics/Color;->HSVToColor(I[F)I

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    invoke-interface {p2, p1}, Lcom/jaredrummler/android/colorpicker/ColorPickerView$c;->a(I)V

    .line 59
    .line 60
    .line 61
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 62
    .line 63
    .line 64
    return-void
.end method

.method public final o()V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->v:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->A:Landroid/graphics/Rect;

    .line 7
    .line 8
    iget v1, v0, Landroid/graphics/Rect;->left:I

    .line 9
    .line 10
    add-int/lit8 v1, v1, 0x1

    .line 11
    .line 12
    iget v2, v0, Landroid/graphics/Rect;->bottom:I

    .line 13
    .line 14
    iget v3, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->b:I

    .line 15
    .line 16
    sub-int v3, v2, v3

    .line 17
    .line 18
    add-int/lit8 v3, v3, 0x1

    .line 19
    .line 20
    add-int/lit8 v2, v2, -0x1

    .line 21
    .line 22
    iget v0, v0, Landroid/graphics/Rect;->right:I

    .line 23
    .line 24
    add-int/lit8 v0, v0, -0x1

    .line 25
    .line 26
    new-instance v4, Landroid/graphics/Rect;

    .line 27
    .line 28
    invoke-direct {v4, v1, v3, v0, v2}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 29
    .line 30
    .line 31
    iput-object v4, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->D:Landroid/graphics/Rect;

    .line 32
    .line 33
    new-instance v0, Ln1/a;

    .line 34
    .line 35
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    const/high16 v2, 0x40800000    # 4.0f

    .line 40
    .line 41
    invoke-static {v1, v2}, Ln1/c;->a(Landroid/content/Context;F)I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    invoke-direct {v0, v1}, Ln1/a;-><init>(I)V

    .line 46
    .line 47
    .line 48
    iput-object v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->F:Ln1/a;

    .line 49
    .line 50
    iget-object v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->D:Landroid/graphics/Rect;

    .line 51
    .line 52
    iget v1, v1, Landroid/graphics/Rect;->left:I

    .line 53
    .line 54
    int-to-float v1, v1

    .line 55
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    iget-object v2, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->D:Landroid/graphics/Rect;

    .line 60
    .line 61
    iget v2, v2, Landroid/graphics/Rect;->top:I

    .line 62
    .line 63
    int-to-float v2, v2

    .line 64
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    iget-object v3, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->D:Landroid/graphics/Rect;

    .line 69
    .line 70
    iget v3, v3, Landroid/graphics/Rect;->right:I

    .line 71
    .line 72
    int-to-float v3, v3

    .line 73
    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    iget-object v4, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->D:Landroid/graphics/Rect;

    .line 78
    .line 79
    iget v4, v4, Landroid/graphics/Rect;->bottom:I

    .line 80
    .line 81
    int-to-float v4, v4

    .line 82
    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    .line 83
    .line 84
    .line 85
    move-result v4

    .line 86
    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 87
    .line 88
    .line 89
    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->A:Landroid/graphics/Rect;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-lez v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->A:Landroid/graphics/Rect;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-gtz v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {p0, p1}, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->e(Landroid/graphics/Canvas;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, p1}, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->d(Landroid/graphics/Canvas;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, p1}, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->c(Landroid/graphics/Canvas;)V

    .line 25
    .line 26
    .line 27
    :cond_1
    :goto_0
    return-void
.end method

.method public onMeasure(II)V
    .locals 5

    .line 1
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-virtual {p0}, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->getPaddingLeft()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    sub-int/2addr p1, v2

    .line 18
    invoke-virtual {p0}, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->getPaddingRight()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    sub-int/2addr p1, v2

    .line 23
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    invoke-virtual {p0}, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->getPaddingBottom()I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    sub-int/2addr p2, v2

    .line 32
    invoke-virtual {p0}, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->getPaddingTop()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    sub-int/2addr p2, v2

    .line 37
    const/high16 v2, 0x40000000    # 2.0f

    .line 38
    .line 39
    if-eq v0, v2, :cond_7

    .line 40
    .line 41
    if-ne v1, v2, :cond_0

    .line 42
    .line 43
    goto :goto_3

    .line 44
    :cond_0
    iget v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->c:I

    .line 45
    .line 46
    add-int v1, p2, v0

    .line 47
    .line 48
    iget v2, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->a:I

    .line 49
    .line 50
    add-int/2addr v1, v2

    .line 51
    sub-int v3, p1, v0

    .line 52
    .line 53
    sub-int/2addr v3, v2

    .line 54
    iget-boolean v2, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->v:Z

    .line 55
    .line 56
    if-eqz v2, :cond_1

    .line 57
    .line 58
    iget v2, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->b:I

    .line 59
    .line 60
    add-int v4, v0, v2

    .line 61
    .line 62
    sub-int/2addr v1, v4

    .line 63
    add-int/2addr v0, v2

    .line 64
    add-int/2addr v3, v0

    .line 65
    :cond_1
    const/4 v0, 0x1

    .line 66
    const/4 v2, 0x0

    .line 67
    if-gt v1, p1, :cond_2

    .line 68
    .line 69
    move v4, v0

    .line 70
    goto :goto_0

    .line 71
    :cond_2
    move v4, v2

    .line 72
    :goto_0
    if-gt v3, p2, :cond_3

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_3
    move v0, v2

    .line 76
    :goto_1
    if-eqz v4, :cond_4

    .line 77
    .line 78
    if-eqz v0, :cond_4

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_4
    if-nez v0, :cond_6

    .line 82
    .line 83
    if-eqz v4, :cond_6

    .line 84
    .line 85
    :cond_5
    move p1, v1

    .line 86
    goto :goto_4

    .line 87
    :cond_6
    if-nez v4, :cond_c

    .line 88
    .line 89
    if-eqz v0, :cond_c

    .line 90
    .line 91
    :goto_2
    move p2, v3

    .line 92
    goto :goto_4

    .line 93
    :cond_7
    :goto_3
    if-ne v0, v2, :cond_a

    .line 94
    .line 95
    if-eq v1, v2, :cond_a

    .line 96
    .line 97
    iget v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->c:I

    .line 98
    .line 99
    sub-int v1, p1, v0

    .line 100
    .line 101
    iget v2, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->a:I

    .line 102
    .line 103
    sub-int/2addr v1, v2

    .line 104
    iget-boolean v2, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->v:Z

    .line 105
    .line 106
    if-eqz v2, :cond_8

    .line 107
    .line 108
    iget v2, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->b:I

    .line 109
    .line 110
    add-int/2addr v0, v2

    .line 111
    add-int/2addr v1, v0

    .line 112
    :cond_8
    if-le v1, p2, :cond_9

    .line 113
    .line 114
    goto :goto_4

    .line 115
    :cond_9
    move p2, v1

    .line 116
    goto :goto_4

    .line 117
    :cond_a
    if-ne v1, v2, :cond_c

    .line 118
    .line 119
    if-eq v0, v2, :cond_c

    .line 120
    .line 121
    iget v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->c:I

    .line 122
    .line 123
    add-int v1, p2, v0

    .line 124
    .line 125
    iget v2, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->a:I

    .line 126
    .line 127
    add-int/2addr v1, v2

    .line 128
    iget-boolean v2, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->v:Z

    .line 129
    .line 130
    if-eqz v2, :cond_b

    .line 131
    .line 132
    iget v2, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->b:I

    .line 133
    .line 134
    add-int/2addr v0, v2

    .line 135
    sub-int/2addr v1, v0

    .line 136
    :cond_b
    if-le v1, p1, :cond_5

    .line 137
    .line 138
    :cond_c
    :goto_4
    invoke-virtual {p0}, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->getPaddingLeft()I

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    add-int/2addr p1, v0

    .line 143
    invoke-virtual {p0}, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->getPaddingRight()I

    .line 144
    .line 145
    .line 146
    move-result v0

    .line 147
    add-int/2addr p1, v0

    .line 148
    invoke-virtual {p0}, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->getPaddingTop()I

    .line 149
    .line 150
    .line 151
    move-result v0

    .line 152
    add-int/2addr p2, v0

    .line 153
    invoke-virtual {p0}, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->getPaddingBottom()I

    .line 154
    .line 155
    .line 156
    move-result v0

    .line 157
    add-int/2addr p2, v0

    .line 158
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 159
    .line 160
    .line 161
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
    const-string v0, "alpha"

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iput v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->r:I

    .line 14
    .line 15
    const-string v0, "hue"

    .line 16
    .line 17
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    iput v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->s:F

    .line 22
    .line 23
    const-string v0, "sat"

    .line 24
    .line 25
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    iput v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->t:F

    .line 30
    .line 31
    const-string v0, "val"

    .line 32
    .line 33
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    iput v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->u:F

    .line 38
    .line 39
    const-string v0, "show_alpha"

    .line 40
    .line 41
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    iput-boolean v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->v:Z

    .line 46
    .line 47
    const-string v0, "alpha_text"

    .line 48
    .line 49
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    iput-object v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->w:Ljava/lang/String;

    .line 54
    .line 55
    const-string v0, "instanceState"

    .line 56
    .line 57
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    :cond_0
    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 62
    .line 63
    .line 64
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
    const-string v1, "instanceState"

    .line 7
    .line 8
    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 13
    .line 14
    .line 15
    const-string v1, "alpha"

    .line 16
    .line 17
    iget v2, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->r:I

    .line 18
    .line 19
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    const-string v1, "hue"

    .line 23
    .line 24
    iget v2, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->s:F

    .line 25
    .line 26
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 27
    .line 28
    .line 29
    const-string v1, "sat"

    .line 30
    .line 31
    iget v2, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->t:F

    .line 32
    .line 33
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 34
    .line 35
    .line 36
    const-string v1, "val"

    .line 37
    .line 38
    iget v2, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->u:F

    .line 39
    .line 40
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 41
    .line 42
    .line 43
    const-string v1, "show_alpha"

    .line 44
    .line 45
    iget-boolean v2, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->v:Z

    .line 46
    .line 47
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 48
    .line 49
    .line 50
    const-string v1, "alpha_text"

    .line 51
    .line 52
    iget-object v2, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->w:Ljava/lang/String;

    .line 53
    .line 54
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    return-object v0
.end method

.method public onSizeChanged(IIII)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 2
    .line 3
    .line 4
    new-instance p3, Landroid/graphics/Rect;

    .line 5
    .line 6
    invoke-direct {p3}, Landroid/graphics/Rect;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p3, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->A:Landroid/graphics/Rect;

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->getPaddingLeft()I

    .line 12
    .line 13
    .line 14
    move-result p4

    .line 15
    iput p4, p3, Landroid/graphics/Rect;->left:I

    .line 16
    .line 17
    iget-object p3, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->A:Landroid/graphics/Rect;

    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->getPaddingRight()I

    .line 20
    .line 21
    .line 22
    move-result p4

    .line 23
    sub-int/2addr p1, p4

    .line 24
    iput p1, p3, Landroid/graphics/Rect;->right:I

    .line 25
    .line 26
    iget-object p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->A:Landroid/graphics/Rect;

    .line 27
    .line 28
    invoke-virtual {p0}, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->getPaddingTop()I

    .line 29
    .line 30
    .line 31
    move-result p3

    .line 32
    iput p3, p1, Landroid/graphics/Rect;->top:I

    .line 33
    .line 34
    iget-object p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->A:Landroid/graphics/Rect;

    .line 35
    .line 36
    invoke-virtual {p0}, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->getPaddingBottom()I

    .line 37
    .line 38
    .line 39
    move-result p3

    .line 40
    sub-int/2addr p2, p3

    .line 41
    iput p2, p1, Landroid/graphics/Rect;->bottom:I

    .line 42
    .line 43
    const/4 p1, 0x0

    .line 44
    iput-object p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->m:Landroid/graphics/Shader;

    .line 45
    .line 46
    iput-object p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->n:Landroid/graphics/Shader;

    .line 47
    .line 48
    iput-object p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->o:Landroid/graphics/Shader;

    .line 49
    .line 50
    iput-object p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->p:Lcom/jaredrummler/android/colorpicker/ColorPickerView$b;

    .line 51
    .line 52
    iput-object p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->q:Lcom/jaredrummler/android/colorpicker/ColorPickerView$b;

    .line 53
    .line 54
    invoke-virtual {p0}, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->q()V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->p()V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0}, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->o()V

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 8

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x2

    .line 6
    const/4 v2, 0x1

    .line 7
    const/4 v3, 0x0

    .line 8
    if-eqz v0, :cond_2

    .line 9
    .line 10
    if-eq v0, v2, :cond_1

    .line 11
    .line 12
    if-eq v0, v1, :cond_0

    .line 13
    .line 14
    move v0, v3

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {p0, p1}, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->i(Landroid/view/MotionEvent;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    goto :goto_0

    .line 21
    :cond_1
    const/4 v0, 0x0

    .line 22
    iput-object v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->E:Landroid/graphics/Point;

    .line 23
    .line 24
    invoke-virtual {p0, p1}, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->i(Landroid/view/MotionEvent;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    goto :goto_0

    .line 29
    :cond_2
    new-instance v0, Landroid/graphics/Point;

    .line 30
    .line 31
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    float-to-int v4, v4

    .line 36
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    float-to-int v5, v5

    .line 41
    invoke-direct {v0, v4, v5}, Landroid/graphics/Point;-><init>(II)V

    .line 42
    .line 43
    .line 44
    iput-object v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->E:Landroid/graphics/Point;

    .line 45
    .line 46
    invoke-virtual {p0, p1}, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->i(Landroid/view/MotionEvent;)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    :goto_0
    if-eqz v0, :cond_4

    .line 51
    .line 52
    iget-object p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->G:Lcom/jaredrummler/android/colorpicker/ColorPickerView$c;

    .line 53
    .line 54
    if-eqz p1, :cond_3

    .line 55
    .line 56
    iget v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->r:I

    .line 57
    .line 58
    iget v4, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->s:F

    .line 59
    .line 60
    iget v5, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->t:F

    .line 61
    .line 62
    iget v6, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->u:F

    .line 63
    .line 64
    const/4 v7, 0x3

    .line 65
    new-array v7, v7, [F

    .line 66
    .line 67
    aput v4, v7, v3

    .line 68
    .line 69
    aput v5, v7, v2

    .line 70
    .line 71
    aput v6, v7, v1

    .line 72
    .line 73
    invoke-static {v0, v7}, Landroid/graphics/Color;->HSVToColor(I[F)I

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    invoke-interface {p1, v0}, Lcom/jaredrummler/android/colorpicker/ColorPickerView$c;->a(I)V

    .line 78
    .line 79
    .line 80
    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 81
    .line 82
    .line 83
    return v2

    .line 84
    :cond_4
    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    return p1
.end method

.method public final p()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->A:Landroid/graphics/Rect;

    .line 2
    .line 3
    iget v1, v0, Landroid/graphics/Rect;->right:I

    .line 4
    .line 5
    iget v2, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->a:I

    .line 6
    .line 7
    sub-int v2, v1, v2

    .line 8
    .line 9
    add-int/lit8 v2, v2, 0x1

    .line 10
    .line 11
    iget v3, v0, Landroid/graphics/Rect;->top:I

    .line 12
    .line 13
    add-int/lit8 v3, v3, 0x1

    .line 14
    .line 15
    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    .line 16
    .line 17
    add-int/lit8 v0, v0, -0x1

    .line 18
    .line 19
    iget-boolean v4, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->v:Z

    .line 20
    .line 21
    if-eqz v4, :cond_0

    .line 22
    .line 23
    iget v4, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->c:I

    .line 24
    .line 25
    iget v5, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->b:I

    .line 26
    .line 27
    add-int/2addr v4, v5

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/4 v4, 0x0

    .line 30
    :goto_0
    sub-int/2addr v0, v4

    .line 31
    add-int/lit8 v1, v1, -0x1

    .line 32
    .line 33
    new-instance v4, Landroid/graphics/Rect;

    .line 34
    .line 35
    invoke-direct {v4, v2, v3, v1, v0}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 36
    .line 37
    .line 38
    iput-object v4, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->C:Landroid/graphics/Rect;

    .line 39
    .line 40
    return-void
.end method

.method public final q()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->A:Landroid/graphics/Rect;

    .line 2
    .line 3
    iget v1, v0, Landroid/graphics/Rect;->left:I

    .line 4
    .line 5
    add-int/lit8 v1, v1, 0x1

    .line 6
    .line 7
    iget v2, v0, Landroid/graphics/Rect;->top:I

    .line 8
    .line 9
    add-int/lit8 v2, v2, 0x1

    .line 10
    .line 11
    iget v3, v0, Landroid/graphics/Rect;->bottom:I

    .line 12
    .line 13
    add-int/lit8 v3, v3, -0x1

    .line 14
    .line 15
    iget v0, v0, Landroid/graphics/Rect;->right:I

    .line 16
    .line 17
    add-int/lit8 v0, v0, -0x1

    .line 18
    .line 19
    iget v4, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->c:I

    .line 20
    .line 21
    sub-int/2addr v0, v4

    .line 22
    iget v5, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->a:I

    .line 23
    .line 24
    sub-int/2addr v0, v5

    .line 25
    iget-boolean v5, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->v:Z

    .line 26
    .line 27
    if-eqz v5, :cond_0

    .line 28
    .line 29
    iget v5, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->b:I

    .line 30
    .line 31
    add-int/2addr v5, v4

    .line 32
    sub-int/2addr v3, v5

    .line 33
    :cond_0
    new-instance v4, Landroid/graphics/Rect;

    .line 34
    .line 35
    invoke-direct {v4, v1, v2, v0, v3}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 36
    .line 37
    .line 38
    iput-object v4, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->B:Landroid/graphics/Rect;

    .line 39
    .line 40
    return-void
.end method

.method public setAlphaSliderText(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    .line 2
    invoke-virtual {p0, p1}, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->setAlphaSliderText(Ljava/lang/String;)V

    return-void
.end method

.method public setAlphaSliderText(Ljava/lang/String;)V
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->w:Ljava/lang/String;

    .line 4
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setAlphaSliderVisible(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->v:Z

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput-boolean p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->v:Z

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    iput-object p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->m:Landroid/graphics/Shader;

    .line 9
    .line 10
    iput-object p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->n:Landroid/graphics/Shader;

    .line 11
    .line 12
    iput-object p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->o:Landroid/graphics/Shader;

    .line 13
    .line 14
    iput-object p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->q:Lcom/jaredrummler/android/colorpicker/ColorPickerView$b;

    .line 15
    .line 16
    iput-object p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->p:Lcom/jaredrummler/android/colorpicker/ColorPickerView$b;

    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method public setBorderColor(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->y:I

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setColor(I)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0}, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->n(IZ)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public setOnColorChangedListener(Lcom/jaredrummler/android/colorpicker/ColorPickerView$c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->G:Lcom/jaredrummler/android/colorpicker/ColorPickerView$c;

    .line 2
    .line 3
    return-void
.end method

.method public setSliderTrackerColor(I)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->x:I

    .line 2
    .line 3
    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->k:Landroid/graphics/Paint;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 9
    .line 10
    .line 11
    return-void
.end method
