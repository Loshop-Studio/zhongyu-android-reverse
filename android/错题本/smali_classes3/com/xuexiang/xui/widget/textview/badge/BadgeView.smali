.class public Lcom/xuexiang/xui/widget/textview/badge/BadgeView;
.super Landroid/view/View;
.source "SourceFile"

# interfaces
.implements Lt3/a;


# instance fields
.field public final a:I

.field public final b:I

.field public final c:F

.field public final d:F

.field public e:I

.field public f:Ljava/lang/String;

.field public g:Z

.field public final h:Z

.field public final i:I

.field public final j:F

.field public final k:F

.field public l:I

.field public final m:Landroid/graphics/RectF;

.field public final n:Landroid/graphics/RectF;

.field public o:Landroid/graphics/Paint$FontMetrics;

.field public final p:Landroid/graphics/PointF;

.field public final q:Landroid/graphics/PointF;

.field public final r:Landroid/graphics/PointF;

.field public s:Landroid/view/View;

.field public t:I

.field public u:I

.field public final v:Landroid/text/TextPaint;

.field public final w:Landroid/graphics/Paint;

.field public final x:Landroid/graphics/Paint;

.field public y:Lt3/c;

.field public z:Landroid/view/ViewGroup;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-direct {p0, p1, v0, v1}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    invoke-virtual {p0, p1, v0}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    .line 8
    .line 9
    .line 10
    new-instance v0, Landroid/graphics/RectF;

    .line 11
    .line 12
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->m:Landroid/graphics/RectF;

    .line 16
    .line 17
    new-instance v0, Landroid/graphics/RectF;

    .line 18
    .line 19
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->n:Landroid/graphics/RectF;

    .line 23
    .line 24
    new-instance v0, Landroid/graphics/Path;

    .line 25
    .line 26
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 27
    .line 28
    .line 29
    new-instance v0, Landroid/graphics/PointF;

    .line 30
    .line 31
    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->p:Landroid/graphics/PointF;

    .line 35
    .line 36
    new-instance v0, Landroid/graphics/PointF;

    .line 37
    .line 38
    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    .line 39
    .line 40
    .line 41
    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->q:Landroid/graphics/PointF;

    .line 42
    .line 43
    new-instance v0, Landroid/graphics/PointF;

    .line 44
    .line 45
    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    .line 46
    .line 47
    .line 48
    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->r:Landroid/graphics/PointF;

    .line 49
    .line 50
    new-instance v0, Landroid/graphics/PointF;

    .line 51
    .line 52
    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    .line 53
    .line 54
    .line 55
    new-instance v0, Ljava/util/ArrayList;

    .line 56
    .line 57
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 58
    .line 59
    .line 60
    new-instance v0, Landroid/text/TextPaint;

    .line 61
    .line 62
    invoke-direct {v0}, Landroid/text/TextPaint;-><init>()V

    .line 63
    .line 64
    .line 65
    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->v:Landroid/text/TextPaint;

    .line 66
    .line 67
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 68
    .line 69
    .line 70
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->v:Landroid/text/TextPaint;

    .line 71
    .line 72
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setSubpixelText(Z)V

    .line 73
    .line 74
    .line 75
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->v:Landroid/text/TextPaint;

    .line 76
    .line 77
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setFakeBoldText(Z)V

    .line 78
    .line 79
    .line 80
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->v:Landroid/text/TextPaint;

    .line 81
    .line 82
    new-instance v2, Landroid/graphics/PorterDuffXfermode;

    .line 83
    .line 84
    sget-object v3, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    .line 85
    .line 86
    invoke-direct {v2, v3}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 90
    .line 91
    .line 92
    new-instance v0, Landroid/graphics/Paint;

    .line 93
    .line 94
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 95
    .line 96
    .line 97
    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->w:Landroid/graphics/Paint;

    .line 98
    .line 99
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 100
    .line 101
    .line 102
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->w:Landroid/graphics/Paint;

    .line 103
    .line 104
    sget-object v2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 105
    .line 106
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 107
    .line 108
    .line 109
    new-instance v0, Landroid/graphics/Paint;

    .line 110
    .line 111
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 112
    .line 113
    .line 114
    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->x:Landroid/graphics/Paint;

    .line 115
    .line 116
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 117
    .line 118
    .line 119
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->x:Landroid/graphics/Paint;

    .line 120
    .line 121
    sget-object v2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 122
    .line 123
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 124
    .line 125
    .line 126
    const v0, -0x17b1c0

    .line 127
    .line 128
    .line 129
    iput v0, p0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->a:I

    .line 130
    .line 131
    const/4 v0, -0x1

    .line 132
    iput v0, p0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->b:I

    .line 133
    .line 134
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    const/high16 v2, 0x41300000    # 11.0f

    .line 139
    .line 140
    invoke-static {v0, v2}, Lh4/a;->n(Landroid/content/Context;F)I

    .line 141
    .line 142
    .line 143
    move-result v0

    .line 144
    int-to-float v0, v0

    .line 145
    iput v0, p0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->c:F

    .line 146
    .line 147
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    const/high16 v2, 0x40a00000    # 5.0f

    .line 152
    .line 153
    invoke-static {v0, v2}, Lh4/a;->h(Landroid/content/Context;F)I

    .line 154
    .line 155
    .line 156
    move-result v0

    .line 157
    int-to-float v0, v0

    .line 158
    iput v0, p0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->d:F

    .line 159
    .line 160
    iput v1, p0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->e:I

    .line 161
    .line 162
    const v0, 0x800035

    .line 163
    .line 164
    .line 165
    iput v0, p0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->i:I

    .line 166
    .line 167
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    const/high16 v1, 0x3f800000    # 1.0f

    .line 172
    .line 173
    invoke-static {v0, v1}, Lh4/a;->h(Landroid/content/Context;F)I

    .line 174
    .line 175
    .line 176
    move-result v0

    .line 177
    int-to-float v0, v0

    .line 178
    iput v0, p0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->j:F

    .line 179
    .line 180
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    invoke-static {v0, v1}, Lh4/a;->h(Landroid/content/Context;F)I

    .line 185
    .line 186
    .line 187
    move-result v0

    .line 188
    int-to-float v0, v0

    .line 189
    iput v0, p0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->k:F

    .line 190
    .line 191
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    const/high16 v1, 0x42b40000    # 90.0f

    .line 196
    .line 197
    invoke-static {v0, v1}, Lh4/a;->h(Landroid/content/Context;F)I

    .line 198
    .line 199
    .line 200
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->h:Z

    .line 201
    .line 202
    const/high16 p1, 0x447a0000    # 1000.0f

    .line 203
    .line 204
    invoke-virtual {p0, p1}, Landroid/view/View;->setTranslationZ(F)V

    .line 205
    .line 206
    .line 207
    return-void
.end method

.method private getBadgeCircleRadius()F
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->f:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget v0, p0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->d:F

    .line 10
    .line 11
    return v0

    .line 12
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->f:Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/4 v1, 0x1

    .line 19
    const/high16 v2, 0x40000000    # 2.0f

    .line 20
    .line 21
    if-ne v0, v1, :cond_2

    .line 22
    .line 23
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->m:Landroid/graphics/RectF;

    .line 24
    .line 25
    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->m:Landroid/graphics/RectF;

    .line 30
    .line 31
    invoke-virtual {v1}, Landroid/graphics/RectF;->width()F

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    cmpl-float v0, v0, v1

    .line 36
    .line 37
    const/high16 v1, 0x3f000000    # 0.5f

    .line 38
    .line 39
    if-lez v0, :cond_1

    .line 40
    .line 41
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->m:Landroid/graphics/RectF;

    .line 42
    .line 43
    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    div-float/2addr v0, v2

    .line 48
    iget v2, p0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->d:F

    .line 49
    .line 50
    :goto_0
    mul-float/2addr v2, v1

    .line 51
    add-float/2addr v2, v0

    .line 52
    return v2

    .line 53
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->m:Landroid/graphics/RectF;

    .line 54
    .line 55
    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    div-float/2addr v0, v2

    .line 60
    iget v2, p0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->d:F

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->n:Landroid/graphics/RectF;

    .line 64
    .line 65
    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    div-float/2addr v0, v2

    .line 70
    return v0
.end method


# virtual methods
.method public final a(Landroid/view/View;)V
    .locals 5

    .line 1
    if-eqz p1, :cond_4

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Landroid/view/ViewGroup;

    .line 14
    .line 15
    invoke-virtual {v0, p0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    instance-of v1, v0, Landroid/view/ViewGroup;

    .line 23
    .line 24
    if-eqz v1, :cond_3

    .line 25
    .line 26
    iput-object p1, p0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->s:Landroid/view/View;

    .line 27
    .line 28
    instance-of v1, v0, Lt3/d;

    .line 29
    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    check-cast v0, Lt3/d;

    .line 33
    .line 34
    invoke-virtual {v0, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_1
    check-cast v0, Landroid/view/ViewGroup;

    .line 39
    .line 40
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 49
    .line 50
    .line 51
    new-instance v3, Lt3/d;

    .line 52
    .line 53
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    invoke-direct {v3, v4}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V

    .line 58
    .line 59
    .line 60
    instance-of v4, v0, Landroid/widget/RelativeLayout;

    .line 61
    .line 62
    if-eqz v4, :cond_2

    .line 63
    .line 64
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 65
    .line 66
    .line 67
    move-result v4

    .line 68
    invoke-virtual {v3, v4}, Landroid/view/View;->setId(I)V

    .line 69
    .line 70
    .line 71
    :cond_2
    invoke-virtual {v0, v3, v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v3, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v3, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 82
    .line 83
    const-string v0, "targetView must have a parent"

    .line 84
    .line 85
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    throw p1

    .line 89
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 90
    .line 91
    const-string v0, "targetView can not be null"

    .line 92
    .line 93
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    throw p1
.end method

.method public final b(Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    instance-of v0, v0, Landroid/view/View;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    check-cast p1, Landroid/view/View;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->b(Landroid/view/View;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    instance-of v0, p1, Landroid/view/ViewGroup;

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    check-cast p1, Landroid/view/ViewGroup;

    .line 30
    .line 31
    iput-object p1, p0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->z:Landroid/view/ViewGroup;

    .line 32
    .line 33
    :cond_1
    return-void
.end method

.method public c(Z)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Landroid/view/ViewGroup;

    .line 12
    .line 13
    invoke-virtual {v0, p0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    if-eqz p1, :cond_1

    .line 17
    .line 18
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->z:Landroid/view/ViewGroup;

    .line 19
    .line 20
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 21
    .line 22
    const/4 v1, -0x1

    .line 23
    invoke-direct {v0, v1, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->s:Landroid/view/View;

    .line 31
    .line 32
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->a(Landroid/view/View;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public getBadgeBackground()Landroid/graphics/drawable/Drawable;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getBadgeBackgroundColor()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->a:I

    .line 2
    .line 3
    return v0
.end method

.method public getBadgeGravity()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->i:I

    .line 2
    .line 3
    return v0
.end method

.method public getBadgeNumber()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->e:I

    .line 2
    .line 3
    return v0
.end method

.method public getBadgeText()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->f:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getBadgeTextColor()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->b:I

    .line 2
    .line 3
    return v0
.end method

.method public getDragCenter()Landroid/graphics/PointF;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getTargetView()Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->s:Landroid/view/View;

    .line 2
    .line 3
    return-object v0
.end method

.method public final onAttachedToWindow()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->z:Landroid/view/ViewGroup;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->s:Landroid/view/View;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    check-cast v1, Landroid/view/ViewGroup;

    .line 15
    .line 16
    iput-object v1, p0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->z:Landroid/view/ViewGroup;

    .line 17
    .line 18
    if-nez v1, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->b(Landroid/view/View;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->y:Lt3/c;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    if-eqz v2, :cond_1

    .line 9
    .line 10
    invoke-virtual {v2}, Landroid/animation/Animator;->isRunning()Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-eqz v2, :cond_1

    .line 15
    .line 16
    iget-object v2, v0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->y:Lt3/c;

    .line 17
    .line 18
    iget-object v4, v2, Lt3/c;->a:[[Lt3/b;

    .line 19
    .line 20
    array-length v5, v4

    .line 21
    move v6, v3

    .line 22
    :goto_0
    if-ge v6, v5, :cond_e

    .line 23
    .line 24
    aget-object v7, v4, v6

    .line 25
    .line 26
    array-length v8, v7

    .line 27
    move v9, v3

    .line 28
    :goto_1
    if-ge v9, v8, :cond_0

    .line 29
    .line 30
    aget-object v10, v7, v9

    .line 31
    .line 32
    invoke-virtual {v2}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v11

    .line 36
    invoke-virtual {v11}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v11

    .line 40
    invoke-static {v11}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 41
    .line 42
    .line 43
    move-result v11

    .line 44
    iget-object v12, v10, Lt3/b;->g:Landroid/graphics/Paint;

    .line 45
    .line 46
    iget v13, v10, Lt3/b;->e:I

    .line 47
    .line 48
    invoke-virtual {v12, v13}, Landroid/graphics/Paint;->setColor(I)V

    .line 49
    .line 50
    .line 51
    iget v13, v10, Lt3/b;->b:F

    .line 52
    .line 53
    iget-object v14, v10, Lt3/b;->a:Ljava/util/Random;

    .line 54
    .line 55
    iget v15, v10, Lt3/b;->f:I

    .line 56
    .line 57
    invoke-virtual {v14, v15}, Ljava/util/Random;->nextInt(I)I

    .line 58
    .line 59
    .line 60
    move-result v15

    .line 61
    int-to-float v15, v15

    .line 62
    const v16, 0x3dcccccd    # 0.1f

    .line 63
    .line 64
    .line 65
    mul-float v15, v15, v16

    .line 66
    .line 67
    invoke-virtual {v14}, Ljava/util/Random;->nextFloat()F

    .line 68
    .line 69
    .line 70
    move-result v17

    .line 71
    const/high16 v18, 0x3f000000    # 0.5f

    .line 72
    .line 73
    sub-float v17, v17, v18

    .line 74
    .line 75
    mul-float v17, v17, v15

    .line 76
    .line 77
    add-float v13, v17, v13

    .line 78
    .line 79
    iput v13, v10, Lt3/b;->b:F

    .line 80
    .line 81
    iget v13, v10, Lt3/b;->c:F

    .line 82
    .line 83
    iget v15, v10, Lt3/b;->f:I

    .line 84
    .line 85
    invoke-virtual {v14, v15}, Ljava/util/Random;->nextInt(I)I

    .line 86
    .line 87
    .line 88
    move-result v15

    .line 89
    int-to-float v15, v15

    .line 90
    mul-float v15, v15, v16

    .line 91
    .line 92
    invoke-virtual {v14}, Ljava/util/Random;->nextFloat()F

    .line 93
    .line 94
    .line 95
    move-result v14

    .line 96
    sub-float v14, v14, v18

    .line 97
    .line 98
    mul-float/2addr v14, v15

    .line 99
    add-float/2addr v14, v13

    .line 100
    iput v14, v10, Lt3/b;->c:F

    .line 101
    .line 102
    iget v13, v10, Lt3/b;->b:F

    .line 103
    .line 104
    iget v10, v10, Lt3/b;->d:F

    .line 105
    .line 106
    mul-float/2addr v11, v10

    .line 107
    sub-float/2addr v10, v11

    .line 108
    invoke-virtual {v1, v13, v14, v10, v12}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 109
    .line 110
    .line 111
    add-int/lit8 v9, v9, 0x1

    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_0
    add-int/lit8 v6, v6, 0x1

    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_1
    iget-object v2, v0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->f:Ljava/lang/String;

    .line 118
    .line 119
    if-eqz v2, :cond_e

    .line 120
    .line 121
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    const/high16 v4, 0x3f800000    # 1.0f

    .line 126
    .line 127
    invoke-static {v2, v4}, Lh4/a;->h(Landroid/content/Context;F)I

    .line 128
    .line 129
    .line 130
    move-result v2

    .line 131
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 132
    .line 133
    .line 134
    move-result-object v5

    .line 135
    const/high16 v6, 0x3fc00000    # 1.5f

    .line 136
    .line 137
    invoke-static {v5, v6}, Lh4/a;->h(Landroid/content/Context;F)I

    .line 138
    .line 139
    .line 140
    move-result v5

    .line 141
    iget v7, v0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->l:I

    .line 142
    .line 143
    const/4 v8, 0x1

    .line 144
    const/high16 v9, -0x40400000    # -1.5f

    .line 145
    .line 146
    if-eq v7, v8, :cond_5

    .line 147
    .line 148
    const/4 v8, 0x2

    .line 149
    const/high16 v10, -0x40800000    # -1.0f

    .line 150
    .line 151
    if-eq v7, v8, :cond_4

    .line 152
    .line 153
    const/4 v8, 0x3

    .line 154
    if-eq v7, v8, :cond_3

    .line 155
    .line 156
    const/4 v8, 0x4

    .line 157
    if-eq v7, v8, :cond_2

    .line 158
    .line 159
    goto :goto_2

    .line 160
    :cond_2
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    invoke-static {v2, v4}, Lh4/a;->h(Landroid/content/Context;F)I

    .line 165
    .line 166
    .line 167
    move-result v2

    .line 168
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 169
    .line 170
    .line 171
    move-result-object v4

    .line 172
    invoke-static {v4, v6}, Lh4/a;->h(Landroid/content/Context;F)I

    .line 173
    .line 174
    .line 175
    move-result v5

    .line 176
    goto :goto_2

    .line 177
    :cond_3
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 178
    .line 179
    .line 180
    move-result-object v2

    .line 181
    invoke-static {v2, v10}, Lh4/a;->h(Landroid/content/Context;F)I

    .line 182
    .line 183
    .line 184
    move-result v2

    .line 185
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 186
    .line 187
    .line 188
    move-result-object v4

    .line 189
    invoke-static {v4, v6}, Lh4/a;->h(Landroid/content/Context;F)I

    .line 190
    .line 191
    .line 192
    move-result v5

    .line 193
    goto :goto_2

    .line 194
    :cond_4
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 195
    .line 196
    .line 197
    move-result-object v2

    .line 198
    invoke-static {v2, v10}, Lh4/a;->h(Landroid/content/Context;F)I

    .line 199
    .line 200
    .line 201
    move-result v2

    .line 202
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 203
    .line 204
    .line 205
    move-result-object v4

    .line 206
    invoke-static {v4, v9}, Lh4/a;->h(Landroid/content/Context;F)I

    .line 207
    .line 208
    .line 209
    move-result v5

    .line 210
    goto :goto_2

    .line 211
    :cond_5
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 212
    .line 213
    .line 214
    move-result-object v2

    .line 215
    invoke-static {v2, v4}, Lh4/a;->h(Landroid/content/Context;F)I

    .line 216
    .line 217
    .line 218
    move-result v2

    .line 219
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 220
    .line 221
    .line 222
    move-result-object v4

    .line 223
    invoke-static {v4, v9}, Lh4/a;->h(Landroid/content/Context;F)I

    .line 224
    .line 225
    .line 226
    move-result v5

    .line 227
    :goto_2
    iget-boolean v4, v0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->h:Z

    .line 228
    .line 229
    if-eqz v4, :cond_6

    .line 230
    .line 231
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 232
    .line 233
    .line 234
    move-result-object v4

    .line 235
    const/high16 v6, 0x40000000    # 2.0f

    .line 236
    .line 237
    invoke-static {v4, v6}, Lh4/a;->h(Landroid/content/Context;F)I

    .line 238
    .line 239
    .line 240
    move-result v4

    .line 241
    int-to-float v4, v4

    .line 242
    goto :goto_3

    .line 243
    :cond_6
    const/4 v4, 0x0

    .line 244
    :goto_3
    int-to-float v2, v2

    .line 245
    int-to-float v5, v5

    .line 246
    const/high16 v6, 0x33000000

    .line 247
    .line 248
    iget-object v7, v0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->w:Landroid/graphics/Paint;

    .line 249
    .line 250
    invoke-virtual {v7, v4, v2, v5, v6}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    .line 251
    .line 252
    .line 253
    iget-object v2, v0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->w:Landroid/graphics/Paint;

    .line 254
    .line 255
    iget v4, v0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->a:I

    .line 256
    .line 257
    invoke-virtual {v2, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 258
    .line 259
    .line 260
    iget-object v2, v0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->x:Landroid/graphics/Paint;

    .line 261
    .line 262
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 263
    .line 264
    .line 265
    iget-object v2, v0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->x:Landroid/graphics/Paint;

    .line 266
    .line 267
    const/4 v3, 0x0

    .line 268
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 269
    .line 270
    .line 271
    iget-object v2, v0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->v:Landroid/text/TextPaint;

    .line 272
    .line 273
    iget v3, v0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->b:I

    .line 274
    .line 275
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 276
    .line 277
    .line 278
    iget-object v2, v0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->v:Landroid/text/TextPaint;

    .line 279
    .line 280
    sget-object v3, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    .line 281
    .line 282
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 283
    .line 284
    .line 285
    invoke-direct {v0}, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->getBadgeCircleRadius()F

    .line 286
    .line 287
    .line 288
    move-result v2

    .line 289
    iget-object v3, v0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->r:Landroid/graphics/PointF;

    .line 290
    .line 291
    iget v4, v3, Landroid/graphics/PointF;->x:F

    .line 292
    .line 293
    iget-object v5, v0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->q:Landroid/graphics/PointF;

    .line 294
    .line 295
    iget v6, v5, Landroid/graphics/PointF;->x:F

    .line 296
    .line 297
    sub-float/2addr v4, v6

    .line 298
    float-to-double v6, v4

    .line 299
    const-wide/high16 v8, 0x4000000000000000L    # 2.0

    .line 300
    .line 301
    invoke-static {v6, v7, v8, v9}, Ljava/lang/Math;->pow(DD)D

    .line 302
    .line 303
    .line 304
    move-result-wide v6

    .line 305
    iget v3, v3, Landroid/graphics/PointF;->y:F

    .line 306
    .line 307
    iget v4, v5, Landroid/graphics/PointF;->y:F

    .line 308
    .line 309
    sub-float/2addr v3, v4

    .line 310
    float-to-double v3, v3

    .line 311
    invoke-static {v3, v4, v8, v9}, Ljava/lang/Math;->pow(DD)D

    .line 312
    .line 313
    .line 314
    move-result-wide v3

    .line 315
    add-double/2addr v3, v6

    .line 316
    invoke-static {v3, v4}, Ljava/lang/Math;->sqrt(D)D

    .line 317
    .line 318
    .line 319
    iget-object v3, v0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->m:Landroid/graphics/RectF;

    .line 320
    .line 321
    invoke-virtual {v3}, Landroid/graphics/RectF;->height()F

    .line 322
    .line 323
    .line 324
    move-result v3

    .line 325
    iget-object v4, v0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->m:Landroid/graphics/RectF;

    .line 326
    .line 327
    invoke-virtual {v4}, Landroid/graphics/RectF;->width()F

    .line 328
    .line 329
    .line 330
    move-result v4

    .line 331
    invoke-static {v3, v4}, Ljava/lang/Math;->max(FF)F

    .line 332
    .line 333
    .line 334
    move-result v3

    .line 335
    const/16 v4, 0x11

    .line 336
    .line 337
    const/high16 v5, 0x40000000    # 2.0f

    .line 338
    .line 339
    iget v6, v0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->i:I

    .line 340
    .line 341
    if-eq v6, v4, :cond_a

    .line 342
    .line 343
    const/16 v4, 0x31

    .line 344
    .line 345
    if-eq v6, v4, :cond_9

    .line 346
    .line 347
    const v4, 0x800015

    .line 348
    .line 349
    .line 350
    if-eq v6, v4, :cond_8

    .line 351
    .line 352
    const v4, 0x800035

    .line 353
    .line 354
    .line 355
    if-eq v6, v4, :cond_7

    .line 356
    .line 357
    goto :goto_4

    .line 358
    :cond_7
    iget v4, v0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->t:I

    .line 359
    .line 360
    int-to-float v4, v4

    .line 361
    iget v6, v0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->j:F

    .line 362
    .line 363
    iget v7, v0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->d:F

    .line 364
    .line 365
    add-float/2addr v6, v7

    .line 366
    div-float/2addr v3, v5

    .line 367
    add-float/2addr v3, v6

    .line 368
    sub-float/2addr v4, v3

    .line 369
    iget-object v3, v0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->p:Landroid/graphics/PointF;

    .line 370
    .line 371
    iput v4, v3, Landroid/graphics/PointF;->x:F

    .line 372
    .line 373
    iget v4, v0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->k:F

    .line 374
    .line 375
    add-float/2addr v4, v7

    .line 376
    iget-object v6, v0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->m:Landroid/graphics/RectF;

    .line 377
    .line 378
    invoke-virtual {v6}, Landroid/graphics/RectF;->height()F

    .line 379
    .line 380
    .line 381
    move-result v6

    .line 382
    div-float/2addr v6, v5

    .line 383
    add-float/2addr v6, v4

    .line 384
    iput v6, v3, Landroid/graphics/PointF;->y:F

    .line 385
    .line 386
    goto :goto_4

    .line 387
    :cond_8
    iget v4, v0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->t:I

    .line 388
    .line 389
    int-to-float v4, v4

    .line 390
    iget v6, v0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->j:F

    .line 391
    .line 392
    iget v7, v0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->d:F

    .line 393
    .line 394
    add-float/2addr v6, v7

    .line 395
    div-float/2addr v3, v5

    .line 396
    add-float/2addr v3, v6

    .line 397
    sub-float/2addr v4, v3

    .line 398
    iget-object v3, v0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->p:Landroid/graphics/PointF;

    .line 399
    .line 400
    iput v4, v3, Landroid/graphics/PointF;->x:F

    .line 401
    .line 402
    iget v4, v0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->u:I

    .line 403
    .line 404
    int-to-float v4, v4

    .line 405
    div-float/2addr v4, v5

    .line 406
    iput v4, v3, Landroid/graphics/PointF;->y:F

    .line 407
    .line 408
    goto :goto_4

    .line 409
    :cond_9
    iget v3, v0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->t:I

    .line 410
    .line 411
    int-to-float v3, v3

    .line 412
    div-float/2addr v3, v5

    .line 413
    iget-object v4, v0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->p:Landroid/graphics/PointF;

    .line 414
    .line 415
    iput v3, v4, Landroid/graphics/PointF;->x:F

    .line 416
    .line 417
    iget v3, v0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->k:F

    .line 418
    .line 419
    iget v6, v0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->d:F

    .line 420
    .line 421
    add-float/2addr v3, v6

    .line 422
    iget-object v6, v0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->m:Landroid/graphics/RectF;

    .line 423
    .line 424
    invoke-virtual {v6}, Landroid/graphics/RectF;->height()F

    .line 425
    .line 426
    .line 427
    move-result v6

    .line 428
    div-float/2addr v6, v5

    .line 429
    add-float/2addr v6, v3

    .line 430
    iput v6, v4, Landroid/graphics/PointF;->y:F

    .line 431
    .line 432
    goto :goto_4

    .line 433
    :cond_a
    iget v3, v0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->t:I

    .line 434
    .line 435
    int-to-float v3, v3

    .line 436
    div-float/2addr v3, v5

    .line 437
    iget-object v4, v0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->p:Landroid/graphics/PointF;

    .line 438
    .line 439
    iput v3, v4, Landroid/graphics/PointF;->x:F

    .line 440
    .line 441
    iget v3, v0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->u:I

    .line 442
    .line 443
    int-to-float v3, v3

    .line 444
    div-float/2addr v3, v5

    .line 445
    iput v3, v4, Landroid/graphics/PointF;->y:F

    .line 446
    .line 447
    :goto_4
    const/4 v3, 0x2

    .line 448
    new-array v3, v3, [I

    .line 449
    .line 450
    invoke-virtual {v0, v3}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 451
    .line 452
    .line 453
    iget-object v4, v0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->p:Landroid/graphics/PointF;

    .line 454
    .line 455
    iget v5, v4, Landroid/graphics/PointF;->x:F

    .line 456
    .line 457
    const/4 v6, 0x0

    .line 458
    aget v6, v3, v6

    .line 459
    .line 460
    int-to-float v6, v6

    .line 461
    add-float/2addr v5, v6

    .line 462
    iget-object v6, v0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->r:Landroid/graphics/PointF;

    .line 463
    .line 464
    iput v5, v6, Landroid/graphics/PointF;->x:F

    .line 465
    .line 466
    iget v4, v4, Landroid/graphics/PointF;->y:F

    .line 467
    .line 468
    const/4 v5, 0x1

    .line 469
    aget v3, v3, v5

    .line 470
    .line 471
    int-to-float v3, v3

    .line 472
    add-float/2addr v4, v3

    .line 473
    iput v4, v6, Landroid/graphics/PointF;->y:F

    .line 474
    .line 475
    iget-object v3, v0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->p:Landroid/graphics/PointF;

    .line 476
    .line 477
    iget v4, v3, Landroid/graphics/PointF;->x:F

    .line 478
    .line 479
    const/high16 v5, -0x3b860000    # -1000.0f

    .line 480
    .line 481
    cmpl-float v4, v4, v5

    .line 482
    .line 483
    if-nez v4, :cond_b

    .line 484
    .line 485
    iget v4, v3, Landroid/graphics/PointF;->y:F

    .line 486
    .line 487
    cmpl-float v4, v4, v5

    .line 488
    .line 489
    if-nez v4, :cond_b

    .line 490
    .line 491
    goto/16 :goto_7

    .line 492
    .line 493
    :cond_b
    iget-object v4, v0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->f:Ljava/lang/String;

    .line 494
    .line 495
    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    .line 496
    .line 497
    .line 498
    move-result v4

    .line 499
    const/high16 v5, 0x40000000    # 2.0f

    .line 500
    .line 501
    if-nez v4, :cond_d

    .line 502
    .line 503
    iget-object v4, v0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->f:Ljava/lang/String;

    .line 504
    .line 505
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 506
    .line 507
    .line 508
    move-result v4

    .line 509
    const/4 v6, 0x1

    .line 510
    if-ne v4, v6, :cond_c

    .line 511
    .line 512
    goto :goto_5

    .line 513
    :cond_c
    iget v2, v3, Landroid/graphics/PointF;->x:F

    .line 514
    .line 515
    iget-object v4, v0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->m:Landroid/graphics/RectF;

    .line 516
    .line 517
    invoke-virtual {v4}, Landroid/graphics/RectF;->width()F

    .line 518
    .line 519
    .line 520
    move-result v4

    .line 521
    div-float/2addr v4, v5

    .line 522
    iget v6, v0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->d:F

    .line 523
    .line 524
    add-float/2addr v4, v6

    .line 525
    sub-float/2addr v2, v4

    .line 526
    iget-object v4, v0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->n:Landroid/graphics/RectF;

    .line 527
    .line 528
    iput v2, v4, Landroid/graphics/RectF;->left:F

    .line 529
    .line 530
    iget v2, v3, Landroid/graphics/PointF;->y:F

    .line 531
    .line 532
    iget-object v4, v0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->m:Landroid/graphics/RectF;

    .line 533
    .line 534
    invoke-virtual {v4}, Landroid/graphics/RectF;->height()F

    .line 535
    .line 536
    .line 537
    move-result v4

    .line 538
    div-float/2addr v4, v5

    .line 539
    iget v6, v0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->d:F

    .line 540
    .line 541
    const/high16 v7, 0x3f000000    # 0.5f

    .line 542
    .line 543
    mul-float/2addr v6, v7

    .line 544
    add-float/2addr v6, v4

    .line 545
    sub-float/2addr v2, v6

    .line 546
    iget-object v4, v0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->n:Landroid/graphics/RectF;

    .line 547
    .line 548
    iput v2, v4, Landroid/graphics/RectF;->top:F

    .line 549
    .line 550
    iget v2, v3, Landroid/graphics/PointF;->x:F

    .line 551
    .line 552
    iget-object v4, v0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->m:Landroid/graphics/RectF;

    .line 553
    .line 554
    invoke-virtual {v4}, Landroid/graphics/RectF;->width()F

    .line 555
    .line 556
    .line 557
    move-result v4

    .line 558
    div-float/2addr v4, v5

    .line 559
    iget v6, v0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->d:F

    .line 560
    .line 561
    add-float/2addr v4, v6

    .line 562
    add-float/2addr v4, v2

    .line 563
    iget-object v2, v0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->n:Landroid/graphics/RectF;

    .line 564
    .line 565
    iput v4, v2, Landroid/graphics/RectF;->right:F

    .line 566
    .line 567
    iget v2, v3, Landroid/graphics/PointF;->y:F

    .line 568
    .line 569
    iget-object v4, v0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->m:Landroid/graphics/RectF;

    .line 570
    .line 571
    invoke-virtual {v4}, Landroid/graphics/RectF;->height()F

    .line 572
    .line 573
    .line 574
    move-result v4

    .line 575
    div-float/2addr v4, v5

    .line 576
    iget v6, v0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->d:F

    .line 577
    .line 578
    mul-float/2addr v6, v7

    .line 579
    add-float/2addr v6, v4

    .line 580
    add-float/2addr v6, v2

    .line 581
    iget-object v2, v0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->n:Landroid/graphics/RectF;

    .line 582
    .line 583
    iput v6, v2, Landroid/graphics/RectF;->bottom:F

    .line 584
    .line 585
    iget-object v2, v0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->n:Landroid/graphics/RectF;

    .line 586
    .line 587
    invoke-virtual {v2}, Landroid/graphics/RectF;->height()F

    .line 588
    .line 589
    .line 590
    move-result v2

    .line 591
    div-float/2addr v2, v5

    .line 592
    iget-object v4, v0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->n:Landroid/graphics/RectF;

    .line 593
    .line 594
    iget-object v6, v0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->w:Landroid/graphics/Paint;

    .line 595
    .line 596
    invoke-virtual {v1, v4, v2, v2, v6}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 597
    .line 598
    .line 599
    goto :goto_6

    .line 600
    :cond_d
    :goto_5
    iget v4, v3, Landroid/graphics/PointF;->x:F

    .line 601
    .line 602
    float-to-int v6, v2

    .line 603
    int-to-float v6, v6

    .line 604
    sub-float v7, v4, v6

    .line 605
    .line 606
    iget-object v8, v0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->n:Landroid/graphics/RectF;

    .line 607
    .line 608
    iput v7, v8, Landroid/graphics/RectF;->left:F

    .line 609
    .line 610
    iget v7, v3, Landroid/graphics/PointF;->y:F

    .line 611
    .line 612
    sub-float v9, v7, v6

    .line 613
    .line 614
    iput v9, v8, Landroid/graphics/RectF;->top:F

    .line 615
    .line 616
    add-float v9, v4, v6

    .line 617
    .line 618
    iput v9, v8, Landroid/graphics/RectF;->right:F

    .line 619
    .line 620
    add-float/2addr v6, v7

    .line 621
    iput v6, v8, Landroid/graphics/RectF;->bottom:F

    .line 622
    .line 623
    iget-object v6, v0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->w:Landroid/graphics/Paint;

    .line 624
    .line 625
    invoke-virtual {v1, v4, v7, v2, v6}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 626
    .line 627
    .line 628
    :goto_6
    iget-object v2, v0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->f:Ljava/lang/String;

    .line 629
    .line 630
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    .line 631
    .line 632
    .line 633
    move-result v2

    .line 634
    if-nez v2, :cond_e

    .line 635
    .line 636
    iget-object v2, v0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->f:Ljava/lang/String;

    .line 637
    .line 638
    iget v3, v3, Landroid/graphics/PointF;->x:F

    .line 639
    .line 640
    iget-object v4, v0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->n:Landroid/graphics/RectF;

    .line 641
    .line 642
    iget v6, v4, Landroid/graphics/RectF;->bottom:F

    .line 643
    .line 644
    iget v4, v4, Landroid/graphics/RectF;->top:F

    .line 645
    .line 646
    add-float/2addr v6, v4

    .line 647
    iget-object v4, v0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->o:Landroid/graphics/Paint$FontMetrics;

    .line 648
    .line 649
    iget v7, v4, Landroid/graphics/Paint$FontMetrics;->bottom:F

    .line 650
    .line 651
    sub-float/2addr v6, v7

    .line 652
    iget v4, v4, Landroid/graphics/Paint$FontMetrics;->top:F

    .line 653
    .line 654
    sub-float/2addr v6, v4

    .line 655
    div-float/2addr v6, v5

    .line 656
    iget-object v4, v0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->v:Landroid/text/TextPaint;

    .line 657
    .line 658
    invoke-virtual {v1, v2, v3, v6, v4}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 659
    .line 660
    .line 661
    :cond_e
    :goto_7
    return-void
.end method

.method public final onSizeChanged(IIII)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->t:I

    .line 5
    .line 6
    iput p2, p0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->u:I

    .line 7
    .line 8
    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 4

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    if-eq v0, v2, :cond_1

    .line 10
    .line 11
    const/4 v3, 0x2

    .line 12
    if-eq v0, v3, :cond_0

    .line 13
    .line 14
    const/4 v3, 0x3

    .line 15
    if-eq v0, v3, :cond_1

    .line 16
    .line 17
    const/4 v3, 0x5

    .line 18
    if-eq v0, v3, :cond_2

    .line 19
    .line 20
    const/4 v3, 0x6

    .line 21
    if-eq v0, v3, :cond_1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->g:Z

    .line 25
    .line 26
    if-eqz v0, :cond_3

    .line 27
    .line 28
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->q:Landroid/graphics/PointF;

    .line 29
    .line 30
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    iput v3, v0, Landroid/graphics/PointF;->x:F

    .line 35
    .line 36
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->q:Landroid/graphics/PointF;

    .line 37
    .line 38
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    iput v3, v0, Landroid/graphics/PointF;->y:F

    .line 43
    .line 44
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-nez v0, :cond_3

    .line 57
    .line 58
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->g:Z

    .line 59
    .line 60
    if-eqz v0, :cond_3

    .line 61
    .line 62
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->g:Z

    .line 63
    .line 64
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->q:Landroid/graphics/PointF;

    .line 65
    .line 66
    const/high16 v3, -0x3b860000    # -1000.0f

    .line 67
    .line 68
    iput v3, v0, Landroid/graphics/PointF;->x:F

    .line 69
    .line 70
    iput v3, v0, Landroid/graphics/PointF;->y:F

    .line 71
    .line 72
    const/4 v0, 0x4

    .line 73
    iput v0, p0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->l:I

    .line 74
    .line 75
    invoke-virtual {p0, v1}, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->c(Z)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-interface {v0, v1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_2
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 90
    .line 91
    .line 92
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 93
    .line 94
    .line 95
    :cond_3
    :goto_0
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->g:Z

    .line 96
    .line 97
    if-nez v0, :cond_5

    .line 98
    .line 99
    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 100
    .line 101
    .line 102
    move-result p1

    .line 103
    if-eqz p1, :cond_4

    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_4
    return v1

    .line 107
    :cond_5
    :goto_1
    return v2
.end method
