.class public final Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl$Companion;

.field public static final backgroundRadius:F = 6.0f


# instance fields
.field private final boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;

.field private final paint:Landroid/graphics/Paint;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl$Companion;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->Companion:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl$Companion;

    return-void
.end method

.method public constructor <init>(Lcom/zykj/blackboard/bean/BoardConfig;)V
    .locals 1

    .line 1
    const-string v0, "boardConfig"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 10
    .line 11
    new-instance p1, Landroid/graphics/Paint;

    .line 12
    .line 13
    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setDither(Z)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 21
    .line 22
    .line 23
    sget-object v0, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    .line 24
    .line 25
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 26
    .line 27
    .line 28
    sget-object v0, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    .line 29
    .line 30
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 31
    .line 32
    .line 33
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->paint:Landroid/graphics/Paint;

    .line 34
    .line 35
    return-void
.end method

.method private final checkColorLight(I)Z
    .locals 6

    shr-int/lit8 v0, p1, 0x10

    and-int/lit16 v0, v0, 0xff

    shr-int/lit8 v1, p1, 0x8

    and-int/lit16 v1, v1, 0xff

    and-int/lit16 p1, p1, 0xff

    int-to-double v2, v0

    const-wide v4, 0x3fd322d0e5604189L    # 0.299

    mul-double/2addr v2, v4

    int-to-double v0, v1

    const-wide v4, 0x3fe27ef9db22d0e5L    # 0.578

    mul-double/2addr v0, v4

    add-double/2addr v2, v0

    int-to-double v0, p1

    const-wide v4, 0x3fbd2f1a9fbe76c9L    # 0.114

    mul-double/2addr v0, v4

    add-double/2addr v2, v0

    const-wide/high16 v0, 0x4068000000000000L    # 192.0

    cmpl-double p1, v2, v0

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private final drawColorView(Landroid/graphics/Canvas;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;Landroid/graphics/Paint;ILjava/util/List;I)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Canvas;",
            "Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;",
            "Landroid/graphics/Paint;",
            "I",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;I)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectButtonHeight()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/high16 v1, 0x42180000    # 38.0f

    .line 8
    .line 9
    sub-float/2addr v0, v1

    .line 10
    const/4 v1, 0x2

    .line 11
    int-to-float v1, v1

    .line 12
    div-float/2addr v0, v1

    .line 13
    new-instance v1, Landroid/graphics/RectF;

    .line 14
    .line 15
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getColorList()Ljava/util/ArrayList;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-static {v2}, Li7/f0;->l0(Ljava/util/List;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Landroid/graphics/RectF;

    .line 24
    .line 25
    iget v2, v2, Landroid/graphics/RectF;->left:F

    .line 26
    .line 27
    const/high16 v3, 0x41b80000    # 23.0f

    .line 28
    .line 29
    sub-float/2addr v2, v3

    .line 30
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getColorList()Ljava/util/ArrayList;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    invoke-static {v4}, Li7/f0;->l0(Ljava/util/List;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    check-cast v4, Landroid/graphics/RectF;

    .line 39
    .line 40
    iget v4, v4, Landroid/graphics/RectF;->top:F

    .line 41
    .line 42
    sub-float/2addr v4, v0

    .line 43
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getColorList()Ljava/util/ArrayList;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    invoke-static {v5}, Li7/f0;->x0(Ljava/util/List;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    check-cast v5, Landroid/graphics/RectF;

    .line 52
    .line 53
    iget v5, v5, Landroid/graphics/RectF;->right:F

    .line 54
    .line 55
    add-float/2addr v5, v3

    .line 56
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getColorList()Ljava/util/ArrayList;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    invoke-static {v3}, Li7/f0;->x0(Ljava/util/List;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    check-cast v3, Landroid/graphics/RectF;

    .line 65
    .line 66
    iget v3, v3, Landroid/graphics/RectF;->bottom:F

    .line 67
    .line 68
    add-float/2addr v3, v0

    .line 69
    invoke-direct {v1, v2, v4, v5, v3}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 70
    .line 71
    .line 72
    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 73
    .line 74
    invoke-virtual {p3, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p3, p4}, Landroid/graphics/Paint;->setColor(I)V

    .line 78
    .line 79
    .line 80
    const/high16 p4, 0x40c00000    # 6.0f

    .line 81
    .line 82
    invoke-virtual {p1, v1, p4, p4, p3}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 83
    .line 84
    .line 85
    invoke-interface {p5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 86
    .line 87
    .line 88
    move-result-object p5

    .line 89
    const/4 v0, 0x0

    .line 90
    :goto_0
    invoke-interface {p5}, Ljava/util/Iterator;->hasNext()Z

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    if-eqz v1, :cond_3

    .line 95
    .line 96
    invoke-interface {p5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    add-int/lit8 v2, v0, 0x1

    .line 101
    .line 102
    if-gez v0, :cond_0

    .line 103
    .line 104
    invoke-static {}, Li7/v;->w()V

    .line 105
    .line 106
    .line 107
    :cond_0
    check-cast v1, Ljava/lang/Number;

    .line 108
    .line 109
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    sget-object v3, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 114
    .line 115
    invoke-virtual {p3, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 116
    .line 117
    .line 118
    const v3, 0xffffff

    .line 119
    .line 120
    .line 121
    and-int/2addr v3, v1

    .line 122
    const/high16 v4, -0x1000000

    .line 123
    .line 124
    or-int/2addr v3, v4

    .line 125
    invoke-virtual {p3, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 126
    .line 127
    .line 128
    new-instance v3, Landroid/graphics/RectF;

    .line 129
    .line 130
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getColorList()Ljava/util/ArrayList;

    .line 131
    .line 132
    .line 133
    move-result-object v5

    .line 134
    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v5

    .line 138
    check-cast v5, Landroid/graphics/RectF;

    .line 139
    .line 140
    iget v5, v5, Landroid/graphics/RectF;->left:F

    .line 141
    .line 142
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getColorList()Ljava/util/ArrayList;

    .line 143
    .line 144
    .line 145
    move-result-object v6

    .line 146
    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v6

    .line 150
    check-cast v6, Landroid/graphics/RectF;

    .line 151
    .line 152
    iget v6, v6, Landroid/graphics/RectF;->top:F

    .line 153
    .line 154
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getColorList()Ljava/util/ArrayList;

    .line 155
    .line 156
    .line 157
    move-result-object v7

    .line 158
    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v7

    .line 162
    check-cast v7, Landroid/graphics/RectF;

    .line 163
    .line 164
    iget v7, v7, Landroid/graphics/RectF;->right:F

    .line 165
    .line 166
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getColorList()Ljava/util/ArrayList;

    .line 167
    .line 168
    .line 169
    move-result-object v8

    .line 170
    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    check-cast v0, Landroid/graphics/RectF;

    .line 175
    .line 176
    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    .line 177
    .line 178
    invoke-direct {v3, v5, v6, v7, v0}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {p1, v3, p4, p4, p3}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 182
    .line 183
    .line 184
    if-ne v1, p6, :cond_2

    .line 185
    .line 186
    sget-object v0, Lcom/zykj/blackboard/utils/ShapeUtils;->INSTANCE:Lcom/zykj/blackboard/utils/ShapeUtils;

    .line 187
    .line 188
    invoke-virtual {v0, v3}, Lcom/zykj/blackboard/utils/ShapeUtils;->drawTickInRectFToPath(Landroid/graphics/RectF;)Landroid/graphics/Path;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    invoke-direct {p0, p6}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->checkColorLight(I)Z

    .line 193
    .line 194
    .line 195
    move-result v1

    .line 196
    if-eqz v1, :cond_1

    .line 197
    .line 198
    goto :goto_1

    .line 199
    :cond_1
    const/4 v4, -0x1

    .line 200
    :goto_1
    invoke-virtual {p3, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 201
    .line 202
    .line 203
    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 204
    .line 205
    invoke-virtual {p3, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 206
    .line 207
    .line 208
    const/high16 v1, 0x40400000    # 3.0f

    .line 209
    .line 210
    invoke-virtual {p3, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {p1, v0, p3}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 214
    .line 215
    .line 216
    :cond_2
    move v0, v2

    .line 217
    goto :goto_0

    .line 218
    :cond_3
    return-void
.end method

.method private final drawTextSizeView(Landroid/graphics/Canvas;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;Landroid/graphics/Paint;I)V
    .locals 8

    .line 1
    new-instance v6, Landroid/graphics/RectF;

    .line 2
    .line 3
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getTextSizeReduce()Landroid/graphics/RectF;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget v0, v0, Landroid/graphics/RectF;->left:F

    .line 8
    .line 9
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getTextSizeReduce()Landroid/graphics/RectF;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget v1, v1, Landroid/graphics/RectF;->top:F

    .line 14
    .line 15
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getTextSizeAdd()Landroid/graphics/RectF;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    iget v2, v2, Landroid/graphics/RectF;->right:F

    .line 20
    .line 21
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getTextSizeAdd()Landroid/graphics/RectF;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    iget v3, v3, Landroid/graphics/RectF;->bottom:F

    .line 26
    .line 27
    invoke-direct {v6, v0, v1, v2, v3}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 28
    .line 29
    .line 30
    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 31
    .line 32
    invoke-virtual {p3, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual/range {p3 .. p4}, Landroid/graphics/Paint;->setColor(I)V

    .line 36
    .line 37
    .line 38
    const/high16 v0, 0x40c00000    # 6.0f

    .line 39
    .line 40
    invoke-virtual {p1, v6, v0, v0, p3}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 41
    .line 42
    .line 43
    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 44
    .line 45
    invoke-virtual {p3, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 46
    .line 47
    .line 48
    const/4 v0, -0x1

    .line 49
    invoke-virtual {p3, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 50
    .line 51
    .line 52
    const/high16 v0, 0x40400000    # 3.0f

    .line 53
    .line 54
    invoke-virtual {p3, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getTextSizeReduce()Landroid/graphics/RectF;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-virtual {v0}, Landroid/graphics/RectF;->centerX()F

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    const/high16 v7, 0x41400000    # 12.0f

    .line 66
    .line 67
    sub-float/2addr v0, v7

    .line 68
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getTextSizeReduce()Landroid/graphics/RectF;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    invoke-virtual {v2}, Landroid/graphics/RectF;->centerY()F

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getTextSizeReduce()Landroid/graphics/RectF;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    invoke-virtual {v3}, Landroid/graphics/RectF;->centerX()F

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    add-float/2addr v3, v7

    .line 85
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getTextSizeReduce()Landroid/graphics/RectF;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    invoke-virtual {v4}, Landroid/graphics/RectF;->centerY()F

    .line 90
    .line 91
    .line 92
    move-result v4

    .line 93
    move-object v5, p3

    .line 94
    move v1, v0

    .line 95
    move-object v0, p1

    .line 96
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getTextSizeAdd()Landroid/graphics/RectF;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    invoke-virtual {v0}, Landroid/graphics/RectF;->centerX()F

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    sub-float v1, v0, v7

    .line 108
    .line 109
    invoke-virtual {v6}, Landroid/graphics/RectF;->centerY()F

    .line 110
    .line 111
    .line 112
    move-result v2

    .line 113
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getTextSizeAdd()Landroid/graphics/RectF;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    invoke-virtual {v0}, Landroid/graphics/RectF;->centerX()F

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    add-float v3, v0, v7

    .line 122
    .line 123
    invoke-virtual {v6}, Landroid/graphics/RectF;->centerY()F

    .line 124
    .line 125
    .line 126
    move-result v4

    .line 127
    move-object v0, p1

    .line 128
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getTextSizeAdd()Landroid/graphics/RectF;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    invoke-virtual {v0}, Landroid/graphics/RectF;->centerX()F

    .line 136
    .line 137
    .line 138
    move-result v1

    .line 139
    invoke-virtual {v6}, Landroid/graphics/RectF;->centerY()F

    .line 140
    .line 141
    .line 142
    move-result v0

    .line 143
    sub-float v2, v0, v7

    .line 144
    .line 145
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getTextSizeAdd()Landroid/graphics/RectF;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    invoke-virtual {v0}, Landroid/graphics/RectF;->centerX()F

    .line 150
    .line 151
    .line 152
    move-result v3

    .line 153
    invoke-virtual {v6}, Landroid/graphics/RectF;->centerY()F

    .line 154
    .line 155
    .line 156
    move-result v0

    .line 157
    add-float v4, v0, v7

    .line 158
    .line 159
    move-object v0, p1

    .line 160
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 161
    .line 162
    .line 163
    const/high16 v0, 0x40000000    # 2.0f

    .line 164
    .line 165
    invoke-virtual {p3, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 166
    .line 167
    .line 168
    const v0, -0x7f000001

    .line 169
    .line 170
    .line 171
    invoke-virtual {p3, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v6}, Landroid/graphics/RectF;->centerX()F

    .line 175
    .line 176
    .line 177
    move-result v1

    .line 178
    invoke-virtual {v6}, Landroid/graphics/RectF;->centerY()F

    .line 179
    .line 180
    .line 181
    move-result v0

    .line 182
    sub-float v2, v0, v7

    .line 183
    .line 184
    invoke-virtual {v6}, Landroid/graphics/RectF;->centerX()F

    .line 185
    .line 186
    .line 187
    move-result v3

    .line 188
    invoke-virtual {v6}, Landroid/graphics/RectF;->centerY()F

    .line 189
    .line 190
    .line 191
    move-result v0

    .line 192
    add-float v4, v0, v7

    .line 193
    .line 194
    move-object v0, p1

    .line 195
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 196
    .line 197
    .line 198
    return-void
.end method

.method private final drawWriteSizeView(Landroid/graphics/Canvas;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;Landroid/graphics/Paint;ILjava/util/List;F)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Canvas;",
            "Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;",
            "Landroid/graphics/Paint;",
            "I",
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;F)V"
        }
    .end annotation

    .line 1
    new-instance v0, Landroid/graphics/RectF;

    .line 2
    .line 3
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getWriteStrokeWidthList()Ljava/util/ArrayList;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-static {v1}, Li7/f0;->l0(Ljava/util/List;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, Landroid/graphics/RectF;

    .line 12
    .line 13
    iget v1, v1, Landroid/graphics/RectF;->left:F

    .line 14
    .line 15
    const/high16 v2, 0x41800000    # 16.0f

    .line 16
    .line 17
    sub-float/2addr v1, v2

    .line 18
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getWriteStrokeWidthList()Ljava/util/ArrayList;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-static {v3}, Li7/f0;->l0(Ljava/util/List;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    check-cast v3, Landroid/graphics/RectF;

    .line 27
    .line 28
    iget v3, v3, Landroid/graphics/RectF;->top:F

    .line 29
    .line 30
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getWriteStrokeWidthList()Ljava/util/ArrayList;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    invoke-static {v4}, Li7/f0;->x0(Ljava/util/List;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    check-cast v4, Landroid/graphics/RectF;

    .line 39
    .line 40
    iget v4, v4, Landroid/graphics/RectF;->right:F

    .line 41
    .line 42
    add-float/2addr v4, v2

    .line 43
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getWriteStrokeWidthList()Ljava/util/ArrayList;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-static {v2}, Li7/f0;->l0(Ljava/util/List;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    check-cast v2, Landroid/graphics/RectF;

    .line 52
    .line 53
    iget v2, v2, Landroid/graphics/RectF;->bottom:F

    .line 54
    .line 55
    invoke-direct {v0, v1, v3, v4, v2}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 56
    .line 57
    .line 58
    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 59
    .line 60
    invoke-virtual {p3, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p3, p4}, Landroid/graphics/Paint;->setColor(I)V

    .line 64
    .line 65
    .line 66
    const/high16 p4, 0x40c00000    # 6.0f

    .line 67
    .line 68
    invoke-virtual {p1, v0, p4, p4, p3}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 69
    .line 70
    .line 71
    invoke-interface {p5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 72
    .line 73
    .line 74
    move-result-object p4

    .line 75
    const/4 p5, 0x0

    .line 76
    :goto_0
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-eqz v0, :cond_2

    .line 81
    .line 82
    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    add-int/lit8 v1, p5, 0x1

    .line 87
    .line 88
    if-gez p5, :cond_0

    .line 89
    .line 90
    invoke-static {}, Li7/v;->w()V

    .line 91
    .line 92
    .line 93
    :cond_0
    check-cast v0, Ljava/lang/Number;

    .line 94
    .line 95
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    cmpg-float v0, v0, p6

    .line 100
    .line 101
    if-nez v0, :cond_1

    .line 102
    .line 103
    const v0, -0xea8901

    .line 104
    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_1
    const v0, -0x363637

    .line 108
    .line 109
    .line 110
    :goto_1
    invoke-virtual {p3, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 111
    .line 112
    .line 113
    int-to-float v0, p5

    .line 114
    const/high16 v2, 0x40400000    # 3.0f

    .line 115
    .line 116
    mul-float/2addr v0, v2

    .line 117
    const/high16 v2, 0x41000000    # 8.0f

    .line 118
    .line 119
    add-float/2addr v0, v2

    .line 120
    const/4 v2, 0x2

    .line 121
    int-to-float v2, v2

    .line 122
    div-float/2addr v0, v2

    .line 123
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getWriteStrokeWidthList()Ljava/util/ArrayList;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    invoke-virtual {v2, p5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    check-cast v2, Landroid/graphics/RectF;

    .line 132
    .line 133
    invoke-virtual {v2}, Landroid/graphics/RectF;->centerX()F

    .line 134
    .line 135
    .line 136
    move-result v2

    .line 137
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getWriteStrokeWidthList()Ljava/util/ArrayList;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    invoke-virtual {v3, p5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object p5

    .line 145
    check-cast p5, Landroid/graphics/RectF;

    .line 146
    .line 147
    invoke-virtual {p5}, Landroid/graphics/RectF;->centerY()F

    .line 148
    .line 149
    .line 150
    move-result p5

    .line 151
    invoke-virtual {p1, v2, p5, v0, p3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 152
    .line 153
    .line 154
    move p5, v1

    .line 155
    goto :goto_0

    .line 156
    :cond_2
    return-void
.end method


# virtual methods
.method public final drawSelect(Landroid/graphics/Canvas;ILandroid/graphics/Path;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;Ljava/util/List;Landroid/graphics/PointF;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Canvas;",
            "I",
            "Landroid/graphics/Path;",
            "Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;",
            "Ljava/util/List<",
            "+",
            "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;",
            ">;",
            "Landroid/graphics/PointF;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "canvas"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "path"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "functionRectF"

    .line 12
    .line 13
    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "typeList"

    .line 17
    .line 18
    invoke-static {p5, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    new-instance v0, Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-interface {p5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object p5

    .line 30
    :cond_0
    :goto_0
    invoke-interface {p5}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    invoke-interface {p5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    move-object v2, v1

    .line 41
    check-cast v2, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;

    .line 42
    .line 43
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;->getText()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-lez v2, :cond_0

    .line 52
    .line 53
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 58
    .line 59
    .line 60
    move-result p5

    .line 61
    if-eqz p5, :cond_2

    .line 62
    .line 63
    goto/16 :goto_c

    .line 64
    .line 65
    :cond_2
    invoke-direct {p0, p2}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->checkColorLight(I)Z

    .line 66
    .line 67
    .line 68
    move-result p2

    .line 69
    if-eqz p2, :cond_3

    .line 70
    .line 71
    const/high16 p5, -0x41000000    # -0.5f

    .line 72
    .line 73
    :goto_1
    move v5, p5

    .line 74
    goto :goto_2

    .line 75
    :cond_3
    const p5, 0x33ffffff

    .line 76
    .line 77
    .line 78
    goto :goto_1

    .line 79
    :goto_2
    iget-object p5, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->paint:Landroid/graphics/Paint;

    .line 80
    .line 81
    const/high16 v1, 0x40400000    # 3.0f

    .line 82
    .line 83
    invoke-virtual {p5, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 84
    .line 85
    .line 86
    iget-object p5, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->paint:Landroid/graphics/Paint;

    .line 87
    .line 88
    if-eqz p2, :cond_4

    .line 89
    .line 90
    const p2, -0xb8680d

    .line 91
    .line 92
    .line 93
    goto :goto_3

    .line 94
    :cond_4
    const p2, -0x333334

    .line 95
    .line 96
    .line 97
    :goto_3
    invoke-virtual {p5, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 98
    .line 99
    .line 100
    iget-object p2, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->paint:Landroid/graphics/Paint;

    .line 101
    .line 102
    sget-object p5, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 103
    .line 104
    invoke-virtual {p2, p5}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 105
    .line 106
    .line 107
    iget-object p2, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->paint:Landroid/graphics/Paint;

    .line 108
    .line 109
    const/4 v1, 0x0

    .line 110
    invoke-virtual {p2, v1}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 111
    .line 112
    .line 113
    iget-object p2, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->paint:Landroid/graphics/Paint;

    .line 114
    .line 115
    invoke-virtual {p1, p3, p2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 116
    .line 117
    .line 118
    if-eqz p6, :cond_5

    .line 119
    .line 120
    iget-object p2, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->paint:Landroid/graphics/Paint;

    .line 121
    .line 122
    sget-object p3, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 123
    .line 124
    invoke-virtual {p2, p3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 125
    .line 126
    .line 127
    iget-object p2, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->paint:Landroid/graphics/Paint;

    .line 128
    .line 129
    const p3, -0x9a00

    .line 130
    .line 131
    .line 132
    invoke-virtual {p2, p3}, Landroid/graphics/Paint;->setColor(I)V

    .line 133
    .line 134
    .line 135
    iget p2, p6, Landroid/graphics/PointF;->x:F

    .line 136
    .line 137
    iget p3, p6, Landroid/graphics/PointF;->y:F

    .line 138
    .line 139
    iget-object p6, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 140
    .line 141
    invoke-virtual {p6}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectIconWidth()F

    .line 142
    .line 143
    .line 144
    move-result p6

    .line 145
    const/16 v2, 0x8

    .line 146
    .line 147
    int-to-float v2, v2

    .line 148
    div-float/2addr p6, v2

    .line 149
    iget-object v2, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->paint:Landroid/graphics/Paint;

    .line 150
    .line 151
    invoke-virtual {p1, p2, p3, p6, v2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 152
    .line 153
    .line 154
    :cond_5
    iget-object p2, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->paint:Landroid/graphics/Paint;

    .line 155
    .line 156
    const/high16 p3, 0x41c80000    # 25.0f

    .line 157
    .line 158
    invoke-virtual {p2, p3}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 159
    .line 160
    .line 161
    iget-object p2, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->paint:Landroid/graphics/Paint;

    .line 162
    .line 163
    invoke-virtual {p2, p5}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 164
    .line 165
    .line 166
    new-instance p2, Landroid/graphics/RectF;

    .line 167
    .line 168
    invoke-direct {p2}, Landroid/graphics/RectF;-><init>()V

    .line 169
    .line 170
    .line 171
    invoke-virtual {p4}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getWriteEdit()Landroid/graphics/RectF;

    .line 172
    .line 173
    .line 174
    move-result-object p5

    .line 175
    invoke-virtual {p2, p5}, Landroid/graphics/RectF;->union(Landroid/graphics/RectF;)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {p4}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getTextEdit()Landroid/graphics/RectF;

    .line 179
    .line 180
    .line 181
    move-result-object p5

    .line 182
    invoke-virtual {p2, p5}, Landroid/graphics/RectF;->union(Landroid/graphics/RectF;)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {p4}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getGeometryStroke()Landroid/graphics/RectF;

    .line 186
    .line 187
    .line 188
    move-result-object p5

    .line 189
    invoke-virtual {p2, p5}, Landroid/graphics/RectF;->union(Landroid/graphics/RectF;)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {p4}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getImageCrop()Landroid/graphics/RectF;

    .line 193
    .line 194
    .line 195
    move-result-object p5

    .line 196
    invoke-virtual {p2, p5}, Landroid/graphics/RectF;->union(Landroid/graphics/RectF;)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {p4}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getDelete()Landroid/graphics/RectF;

    .line 200
    .line 201
    .line 202
    move-result-object p5

    .line 203
    invoke-virtual {p2, p5}, Landroid/graphics/RectF;->union(Landroid/graphics/RectF;)V

    .line 204
    .line 205
    .line 206
    iget p5, p2, Landroid/graphics/RectF;->left:F

    .line 207
    .line 208
    const/high16 p6, 0x41000000    # 8.0f

    .line 209
    .line 210
    sub-float/2addr p5, p6

    .line 211
    iput p5, p2, Landroid/graphics/RectF;->left:F

    .line 212
    .line 213
    iget p5, p2, Landroid/graphics/RectF;->right:F

    .line 214
    .line 215
    add-float/2addr p5, p6

    .line 216
    iput p5, p2, Landroid/graphics/RectF;->right:F

    .line 217
    .line 218
    iget-object p5, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->paint:Landroid/graphics/Paint;

    .line 219
    .line 220
    sget-object v2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 221
    .line 222
    invoke-virtual {p5, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 223
    .line 224
    .line 225
    iget-object p5, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->paint:Landroid/graphics/Paint;

    .line 226
    .line 227
    invoke-virtual {p5, v5}, Landroid/graphics/Paint;->setColor(I)V

    .line 228
    .line 229
    .line 230
    iget-object p5, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->paint:Landroid/graphics/Paint;

    .line 231
    .line 232
    const/high16 v3, 0x40c00000    # 6.0f

    .line 233
    .line 234
    invoke-virtual {p1, p2, v3, v3, p5}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 235
    .line 236
    .line 237
    iget-object p5, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->paint:Landroid/graphics/Paint;

    .line 238
    .line 239
    invoke-virtual {p5, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 240
    .line 241
    .line 242
    iget-object p5, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->paint:Landroid/graphics/Paint;

    .line 243
    .line 244
    const/high16 v2, -0x1000000

    .line 245
    .line 246
    invoke-virtual {p5, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 247
    .line 248
    .line 249
    iget-object p5, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->paint:Landroid/graphics/Paint;

    .line 250
    .line 251
    invoke-virtual {p5, p3}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 252
    .line 253
    .line 254
    iget p3, p2, Landroid/graphics/RectF;->bottom:F

    .line 255
    .line 256
    invoke-virtual {p2}, Landroid/graphics/RectF;->height()F

    .line 257
    .line 258
    .line 259
    move-result p2

    .line 260
    iget-object p5, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->paint:Landroid/graphics/Paint;

    .line 261
    .line 262
    invoke-virtual {p5}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    .line 263
    .line 264
    .line 265
    move-result-object p5

    .line 266
    iget p5, p5, Landroid/graphics/Paint$FontMetrics;->bottom:F

    .line 267
    .line 268
    iget-object v2, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->paint:Landroid/graphics/Paint;

    .line 269
    .line 270
    invoke-virtual {v2}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    .line 271
    .line 272
    .line 273
    move-result-object v2

    .line 274
    iget v2, v2, Landroid/graphics/Paint$FontMetrics;->top:F

    .line 275
    .line 276
    sub-float/2addr p5, v2

    .line 277
    sub-float/2addr p2, p5

    .line 278
    const/4 p5, 0x2

    .line 279
    int-to-float p5, p5

    .line 280
    div-float/2addr p2, p5

    .line 281
    sub-float/2addr p3, p2

    .line 282
    iget-object p2, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->paint:Landroid/graphics/Paint;

    .line 283
    .line 284
    invoke-virtual {p2}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    .line 285
    .line 286
    .line 287
    move-result-object p2

    .line 288
    iget p2, p2, Landroid/graphics/Paint$FontMetrics;->bottom:F

    .line 289
    .line 290
    sub-float/2addr p3, p2

    .line 291
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 292
    .line 293
    .line 294
    move-result-object p2

    .line 295
    :goto_4
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 296
    .line 297
    .line 298
    move-result p5

    .line 299
    if-eqz p5, :cond_c

    .line 300
    .line 301
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move-result-object p5

    .line 305
    check-cast p5, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;

    .line 306
    .line 307
    instance-of v2, p5, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$WriteEdit;

    .line 308
    .line 309
    if-eqz v2, :cond_6

    .line 310
    .line 311
    invoke-virtual {p4}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getWriteEdit()Landroid/graphics/RectF;

    .line 312
    .line 313
    .line 314
    move-result-object v2

    .line 315
    iget v2, v2, Landroid/graphics/RectF;->left:F

    .line 316
    .line 317
    goto :goto_5

    .line 318
    :cond_6
    instance-of v2, p5, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$TextEdit;

    .line 319
    .line 320
    if-eqz v2, :cond_7

    .line 321
    .line 322
    invoke-virtual {p4}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getTextEdit()Landroid/graphics/RectF;

    .line 323
    .line 324
    .line 325
    move-result-object v2

    .line 326
    iget v2, v2, Landroid/graphics/RectF;->left:F

    .line 327
    .line 328
    goto :goto_5

    .line 329
    :cond_7
    instance-of v2, p5, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$GeometryStroke;

    .line 330
    .line 331
    if-eqz v2, :cond_8

    .line 332
    .line 333
    invoke-virtual {p4}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getGeometryStroke()Landroid/graphics/RectF;

    .line 334
    .line 335
    .line 336
    move-result-object v2

    .line 337
    iget v2, v2, Landroid/graphics/RectF;->left:F

    .line 338
    .line 339
    goto :goto_5

    .line 340
    :cond_8
    instance-of v2, p5, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$ImageCrop;

    .line 341
    .line 342
    if-eqz v2, :cond_9

    .line 343
    .line 344
    invoke-virtual {p4}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getImageCrop()Landroid/graphics/RectF;

    .line 345
    .line 346
    .line 347
    move-result-object v2

    .line 348
    iget v2, v2, Landroid/graphics/RectF;->left:F

    .line 349
    .line 350
    goto :goto_5

    .line 351
    :cond_9
    instance-of v2, p5, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$Delete;

    .line 352
    .line 353
    if-eqz v2, :cond_a

    .line 354
    .line 355
    invoke-virtual {p4}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getDelete()Landroid/graphics/RectF;

    .line 356
    .line 357
    .line 358
    move-result-object v2

    .line 359
    iget v2, v2, Landroid/graphics/RectF;->left:F

    .line 360
    .line 361
    goto :goto_5

    .line 362
    :cond_a
    move v2, p6

    .line 363
    :goto_5
    const/high16 v3, 0x41700000    # 15.0f

    .line 364
    .line 365
    add-float/2addr v2, v3

    .line 366
    iget-object v3, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->paint:Landroid/graphics/Paint;

    .line 367
    .line 368
    invoke-virtual {p5}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;->isSelected()Z

    .line 369
    .line 370
    .line 371
    move-result v4

    .line 372
    if-eqz v4, :cond_b

    .line 373
    .line 374
    const v4, -0xea8901

    .line 375
    .line 376
    .line 377
    goto :goto_6

    .line 378
    :cond_b
    const/4 v4, -0x1

    .line 379
    :goto_6
    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 380
    .line 381
    .line 382
    invoke-virtual {p5}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;->getText()Ljava/lang/String;

    .line 383
    .line 384
    .line 385
    move-result-object p5

    .line 386
    iget-object v3, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->paint:Landroid/graphics/Paint;

    .line 387
    .line 388
    invoke-virtual {p1, p5, v2, p3, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 389
    .line 390
    .line 391
    goto :goto_4

    .line 392
    :cond_c
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 393
    .line 394
    .line 395
    move-result-object p2

    .line 396
    :cond_d
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 397
    .line 398
    .line 399
    move-result p3

    .line 400
    if-eqz p3, :cond_e

    .line 401
    .line 402
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 403
    .line 404
    .line 405
    move-result-object p3

    .line 406
    move-object p5, p3

    .line 407
    check-cast p5, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;

    .line 408
    .line 409
    invoke-virtual {p5}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;->isSelected()Z

    .line 410
    .line 411
    .line 412
    move-result p5

    .line 413
    if-eqz p5, :cond_d

    .line 414
    .line 415
    move-object v1, p3

    .line 416
    :cond_e
    check-cast v1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;

    .line 417
    .line 418
    instance-of p2, v1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$WriteEdit;

    .line 419
    .line 420
    if-eqz p2, :cond_12

    .line 421
    .line 422
    iget-object v4, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->paint:Landroid/graphics/Paint;

    .line 423
    .line 424
    move-object p2, v1

    .line 425
    check-cast p2, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$WriteEdit;

    .line 426
    .line 427
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$WriteEdit;->isHighlighter()Z

    .line 428
    .line 429
    .line 430
    move-result p3

    .line 431
    if-eqz p3, :cond_f

    .line 432
    .line 433
    iget-object p3, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 434
    .line 435
    invoke-virtual {p3}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectHighlighterLevel()Ljava/util/List;

    .line 436
    .line 437
    .line 438
    move-result-object p3

    .line 439
    :goto_7
    move-object v6, p3

    .line 440
    goto :goto_8

    .line 441
    :cond_f
    iget-object p3, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 442
    .line 443
    invoke-virtual {p3}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectWriteLevel()Ljava/util/List;

    .line 444
    .line 445
    .line 446
    move-result-object p3

    .line 447
    goto :goto_7

    .line 448
    :goto_8
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$WriteEdit;->getWidth()F

    .line 449
    .line 450
    .line 451
    move-result v7

    .line 452
    move-object v1, p0

    .line 453
    move-object v2, p1

    .line 454
    move-object v3, p4

    .line 455
    invoke-direct/range {v1 .. v7}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->drawWriteSizeView(Landroid/graphics/Canvas;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;Landroid/graphics/Paint;ILjava/util/List;F)V

    .line 456
    .line 457
    .line 458
    iget-object v4, v1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->paint:Landroid/graphics/Paint;

    .line 459
    .line 460
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$WriteEdit;->isHighlighter()Z

    .line 461
    .line 462
    .line 463
    move-result p1

    .line 464
    if-eqz p1, :cond_11

    .line 465
    .line 466
    iget-object p1, v1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 467
    .line 468
    invoke-virtual {p1}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectNormalColor()Ljava/util/List;

    .line 469
    .line 470
    .line 471
    move-result-object p1

    .line 472
    new-instance p3, Ljava/util/ArrayList;

    .line 473
    .line 474
    const/16 p4, 0xa

    .line 475
    .line 476
    invoke-static {p1, p4}, Li7/w;->x(Ljava/lang/Iterable;I)I

    .line 477
    .line 478
    .line 479
    move-result p4

    .line 480
    invoke-direct {p3, p4}, Ljava/util/ArrayList;-><init>(I)V

    .line 481
    .line 482
    .line 483
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 484
    .line 485
    .line 486
    move-result-object p1

    .line 487
    :goto_9
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 488
    .line 489
    .line 490
    move-result p4

    .line 491
    if-eqz p4, :cond_10

    .line 492
    .line 493
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 494
    .line 495
    .line 496
    move-result-object p4

    .line 497
    check-cast p4, Ljava/lang/Number;

    .line 498
    .line 499
    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    .line 500
    .line 501
    .line 502
    move-result p4

    .line 503
    const p5, 0xffffff

    .line 504
    .line 505
    .line 506
    and-int/2addr p4, p5

    .line 507
    iget-object p5, v1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 508
    .line 509
    invoke-virtual {p5}, Lcom/zykj/blackboard/bean/BoardConfig;->getHighlighterColorAlpha()F

    .line 510
    .line 511
    .line 512
    move-result p5

    .line 513
    const/16 p6, 0xff

    .line 514
    .line 515
    int-to-float p6, p6

    .line 516
    mul-float/2addr p5, p6

    .line 517
    float-to-int p5, p5

    .line 518
    shl-int/lit8 p5, p5, 0x18

    .line 519
    .line 520
    or-int/2addr p4, p5

    .line 521
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 522
    .line 523
    .line 524
    move-result-object p4

    .line 525
    invoke-interface {p3, p4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 526
    .line 527
    .line 528
    goto :goto_9

    .line 529
    :cond_10
    :goto_a
    move-object v6, p3

    .line 530
    goto :goto_b

    .line 531
    :cond_11
    iget-object p1, v1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 532
    .line 533
    invoke-virtual {p1}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectNormalColor()Ljava/util/List;

    .line 534
    .line 535
    .line 536
    move-result-object p3

    .line 537
    goto :goto_a

    .line 538
    :goto_b
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$WriteEdit;->getColor()I

    .line 539
    .line 540
    .line 541
    move-result v7

    .line 542
    invoke-direct/range {v1 .. v7}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->drawColorView(Landroid/graphics/Canvas;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;Landroid/graphics/Paint;ILjava/util/List;I)V

    .line 543
    .line 544
    .line 545
    move-object p1, v1

    .line 546
    return-void

    .line 547
    :cond_12
    move-object v2, p1

    .line 548
    move-object v3, p4

    .line 549
    move-object p1, p0

    .line 550
    instance-of p2, v1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$TextEdit;

    .line 551
    .line 552
    if-eqz p2, :cond_13

    .line 553
    .line 554
    iget-object p2, p1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->paint:Landroid/graphics/Paint;

    .line 555
    .line 556
    invoke-direct {p0, v2, v3, p2, v5}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->drawTextSizeView(Landroid/graphics/Canvas;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;Landroid/graphics/Paint;I)V

    .line 557
    .line 558
    .line 559
    iget-object v4, p1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->paint:Landroid/graphics/Paint;

    .line 560
    .line 561
    iget-object p2, p1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 562
    .line 563
    invoke-virtual {p2}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectNormalColor()Ljava/util/List;

    .line 564
    .line 565
    .line 566
    move-result-object v6

    .line 567
    check-cast v1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$TextEdit;

    .line 568
    .line 569
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$TextEdit;->getColor()I

    .line 570
    .line 571
    .line 572
    move-result v7

    .line 573
    move-object v1, p1

    .line 574
    invoke-direct/range {v1 .. v7}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->drawColorView(Landroid/graphics/Canvas;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;Landroid/graphics/Paint;ILjava/util/List;I)V

    .line 575
    .line 576
    .line 577
    return-void

    .line 578
    :cond_13
    instance-of p2, v1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$GeometryStroke;

    .line 579
    .line 580
    if-eqz p2, :cond_14

    .line 581
    .line 582
    iget-object v4, p1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->paint:Landroid/graphics/Paint;

    .line 583
    .line 584
    iget-object p2, p1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 585
    .line 586
    invoke-virtual {p2}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectNormalColor()Ljava/util/List;

    .line 587
    .line 588
    .line 589
    move-result-object v6

    .line 590
    check-cast v1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$GeometryStroke;

    .line 591
    .line 592
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$GeometryStroke;->getColor()I

    .line 593
    .line 594
    .line 595
    move-result v7

    .line 596
    move-object v1, p1

    .line 597
    invoke-direct/range {v1 .. v7}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->drawColorView(Landroid/graphics/Canvas;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;Landroid/graphics/Paint;ILjava/util/List;I)V

    .line 598
    .line 599
    .line 600
    :cond_14
    :goto_c
    return-void
.end method

.method public final drawSelectingPaint(I)Landroid/graphics/Paint;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->paint:Landroid/graphics/Paint;

    .line 2
    .line 3
    const/high16 v1, 0x40400000    # 3.0f

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->paint:Landroid/graphics/Paint;

    .line 9
    .line 10
    invoke-direct {p0, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->checkColorLight(I)Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    const/high16 p1, -0x1000000

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const p1, -0x333334

    .line 20
    .line 21
    .line 22
    :goto_0
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->paint:Landroid/graphics/Paint;

    .line 26
    .line 27
    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 28
    .line 29
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->paint:Landroid/graphics/Paint;

    .line 33
    .line 34
    new-instance v0, Landroid/graphics/DashPathEffect;

    .line 35
    .line 36
    const/4 v1, 0x2

    .line 37
    new-array v1, v1, [F

    .line 38
    .line 39
    fill-array-data v1, :array_0

    .line 40
    .line 41
    .line 42
    const/4 v2, 0x0

    .line 43
    invoke-direct {v0, v1, v2}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 47
    .line 48
    .line 49
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->paint:Landroid/graphics/Paint;

    .line 50
    .line 51
    return-object p1

    .line 52
    nop

    .line 53
    :array_0
    .array-data 4
        0x41f00000    # 30.0f
        0x41700000    # 15.0f
    .end array-data
.end method

.method public final drawSelectingPath(FFFF)Landroid/graphics/Path;
    .locals 6

    .line 1
    new-instance v0, Landroid/graphics/Path;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v5, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 7
    .line 8
    move v1, p1

    .line 9
    move v2, p2

    .line 10
    move v3, p3

    .line 11
    move v4, p4

    .line 12
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Path;->addRect(FFFFLandroid/graphics/Path$Direction;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/graphics/Path;->close()V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method

.method public final getSelectPath(Landroid/graphics/RectF;Ljava/util/List;Landroid/graphics/Matrix;)Landroid/graphics/Path;
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/RectF;",
            "Ljava/util/List<",
            "+",
            "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;",
            ">;",
            "Landroid/graphics/Matrix;",
            ")",
            "Landroid/graphics/Path;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    const-string v3, "selectRectF"

    .line 8
    .line 9
    invoke-static {v0, v3}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v3, "typeList"

    .line 13
    .line 14
    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const-string v3, "matrix"

    .line 18
    .line 19
    invoke-static {v2, v3}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    new-instance v4, Landroid/graphics/Path;

    .line 23
    .line 24
    invoke-direct {v4}, Landroid/graphics/Path;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-static {v2}, Lcom/zykj/blackboard/utils/MatrixExtKt;->invert(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    move-object/from16 v10, p0

    .line 32
    .line 33
    iget-object v5, v10, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;->boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 34
    .line 35
    invoke-virtual {v5}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectIconWidth()F

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    invoke-virtual {v3, v5}, Landroid/graphics/Matrix;->mapRadius(F)F

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    const/4 v5, 0x2

    .line 44
    int-to-float v5, v5

    .line 45
    div-float v11, v3, v5

    .line 46
    .line 47
    const/4 v6, 0x4

    .line 48
    int-to-float v12, v6

    .line 49
    div-float v13, v11, v12

    .line 50
    .line 51
    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    .line 52
    .line 53
    .line 54
    move-result v6

    .line 55
    div-float v14, v6, v5

    .line 56
    .line 57
    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    .line 58
    .line 59
    .line 60
    move-result v6

    .line 61
    div-float v15, v6, v5

    .line 62
    .line 63
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    :cond_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 68
    .line 69
    .line 70
    move-result v6

    .line 71
    const/4 v7, 0x0

    .line 72
    if-eqz v6, :cond_1

    .line 73
    .line 74
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v6

    .line 78
    move-object v8, v6

    .line 79
    check-cast v8, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;

    .line 80
    .line 81
    instance-of v8, v8, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$GeometryStroke;

    .line 82
    .line 83
    if-eqz v8, :cond_0

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_1
    move-object v6, v7

    .line 87
    :goto_0
    check-cast v6, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;

    .line 88
    .line 89
    const/4 v5, 0x0

    .line 90
    if-eqz v6, :cond_2

    .line 91
    .line 92
    check-cast v6, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$GeometryStroke;

    .line 93
    .line 94
    invoke-virtual {v6}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$GeometryStroke;->isSingle()Z

    .line 95
    .line 96
    .line 97
    move-result v6

    .line 98
    move/from16 v16, v6

    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_2
    move/from16 v16, v5

    .line 102
    .line 103
    :goto_1
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 104
    .line 105
    .line 106
    move-result-object v6

    .line 107
    :cond_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 108
    .line 109
    .line 110
    move-result v8

    .line 111
    if-eqz v8, :cond_4

    .line 112
    .line 113
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v8

    .line 117
    move-object v9, v8

    .line 118
    check-cast v9, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;

    .line 119
    .line 120
    instance-of v9, v9, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$TextEdit;

    .line 121
    .line 122
    if-eqz v9, :cond_3

    .line 123
    .line 124
    move-object v7, v8

    .line 125
    :cond_4
    check-cast v7, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;

    .line 126
    .line 127
    if-eqz v7, :cond_5

    .line 128
    .line 129
    check-cast v7, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$TextEdit;

    .line 130
    .line 131
    invoke-virtual {v7}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$TextEdit;->isSingle()Z

    .line 132
    .line 133
    .line 134
    move-result v6

    .line 135
    move/from16 v17, v6

    .line 136
    .line 137
    goto :goto_2

    .line 138
    :cond_5
    move/from16 v17, v16

    .line 139
    .line 140
    :goto_2
    const/4 v6, 0x1

    .line 141
    if-eqz v1, :cond_7

    .line 142
    .line 143
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 144
    .line 145
    .line 146
    move-result v7

    .line 147
    if-eqz v7, :cond_7

    .line 148
    .line 149
    :cond_6
    move/from16 v18, v5

    .line 150
    .line 151
    goto :goto_3

    .line 152
    :cond_7
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 153
    .line 154
    .line 155
    move-result-object v7

    .line 156
    :cond_8
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 157
    .line 158
    .line 159
    move-result v8

    .line 160
    if-eqz v8, :cond_6

    .line 161
    .line 162
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v8

    .line 166
    check-cast v8, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;

    .line 167
    .line 168
    instance-of v8, v8, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$Rotate;

    .line 169
    .line 170
    if-eqz v8, :cond_8

    .line 171
    .line 172
    move/from16 v18, v6

    .line 173
    .line 174
    :goto_3
    if-eqz v1, :cond_a

    .line 175
    .line 176
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 177
    .line 178
    .line 179
    move-result v7

    .line 180
    if-eqz v7, :cond_a

    .line 181
    .line 182
    :cond_9
    move v1, v5

    .line 183
    goto :goto_4

    .line 184
    :cond_a
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    :cond_b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 189
    .line 190
    .line 191
    move-result v7

    .line 192
    if-eqz v7, :cond_9

    .line 193
    .line 194
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v7

    .line 198
    check-cast v7, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;

    .line 199
    .line 200
    instance-of v7, v7, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$Scale;

    .line 201
    .line 202
    if-eqz v7, :cond_b

    .line 203
    .line 204
    move v1, v6

    .line 205
    :goto_4
    iget v5, v0, Landroid/graphics/RectF;->left:F

    .line 206
    .line 207
    iget v6, v0, Landroid/graphics/RectF;->top:F

    .line 208
    .line 209
    invoke-virtual {v4, v5, v6}, Landroid/graphics/Path;->moveTo(FF)V

    .line 210
    .line 211
    .line 212
    iget v5, v0, Landroid/graphics/RectF;->left:F

    .line 213
    .line 214
    iget v6, v0, Landroid/graphics/RectF;->top:F

    .line 215
    .line 216
    add-float/2addr v6, v15

    .line 217
    sub-float/2addr v6, v13

    .line 218
    invoke-virtual {v4, v5, v6}, Landroid/graphics/Path;->lineTo(FF)V

    .line 219
    .line 220
    .line 221
    if-nez v16, :cond_c

    .line 222
    .line 223
    iget v5, v0, Landroid/graphics/RectF;->left:F

    .line 224
    .line 225
    iget v6, v0, Landroid/graphics/RectF;->top:F

    .line 226
    .line 227
    add-float/2addr v6, v15

    .line 228
    add-float/2addr v6, v13

    .line 229
    invoke-virtual {v4, v5, v6}, Landroid/graphics/Path;->lineTo(FF)V

    .line 230
    .line 231
    .line 232
    goto :goto_5

    .line 233
    :cond_c
    iget v5, v0, Landroid/graphics/RectF;->left:F

    .line 234
    .line 235
    move v6, v5

    .line 236
    sub-float v5, v6, v13

    .line 237
    .line 238
    iget v7, v0, Landroid/graphics/RectF;->top:F

    .line 239
    .line 240
    add-float v8, v7, v15

    .line 241
    .line 242
    sub-float/2addr v8, v13

    .line 243
    add-float/2addr v6, v13

    .line 244
    add-float/2addr v7, v15

    .line 245
    add-float/2addr v7, v13

    .line 246
    sget-object v9, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 247
    .line 248
    move/from16 v19, v7

    .line 249
    .line 250
    move v7, v6

    .line 251
    move v6, v8

    .line 252
    move/from16 v8, v19

    .line 253
    .line 254
    invoke-virtual/range {v4 .. v9}, Landroid/graphics/Path;->addRect(FFFFLandroid/graphics/Path$Direction;)V

    .line 255
    .line 256
    .line 257
    iget v5, v0, Landroid/graphics/RectF;->left:F

    .line 258
    .line 259
    iget v6, v0, Landroid/graphics/RectF;->top:F

    .line 260
    .line 261
    add-float/2addr v6, v15

    .line 262
    add-float/2addr v6, v13

    .line 263
    invoke-virtual {v4, v5, v6}, Landroid/graphics/Path;->moveTo(FF)V

    .line 264
    .line 265
    .line 266
    :goto_5
    iget v5, v0, Landroid/graphics/RectF;->left:F

    .line 267
    .line 268
    iget v6, v0, Landroid/graphics/RectF;->bottom:F

    .line 269
    .line 270
    invoke-virtual {v4, v5, v6}, Landroid/graphics/Path;->lineTo(FF)V

    .line 271
    .line 272
    .line 273
    iget v5, v0, Landroid/graphics/RectF;->left:F

    .line 274
    .line 275
    add-float/2addr v5, v14

    .line 276
    sub-float/2addr v5, v13

    .line 277
    iget v6, v0, Landroid/graphics/RectF;->bottom:F

    .line 278
    .line 279
    invoke-virtual {v4, v5, v6}, Landroid/graphics/Path;->lineTo(FF)V

    .line 280
    .line 281
    .line 282
    if-nez v16, :cond_d

    .line 283
    .line 284
    iget v5, v0, Landroid/graphics/RectF;->left:F

    .line 285
    .line 286
    add-float/2addr v5, v14

    .line 287
    add-float/2addr v5, v13

    .line 288
    iget v6, v0, Landroid/graphics/RectF;->bottom:F

    .line 289
    .line 290
    invoke-virtual {v4, v5, v6}, Landroid/graphics/Path;->lineTo(FF)V

    .line 291
    .line 292
    .line 293
    goto :goto_6

    .line 294
    :cond_d
    iget v5, v0, Landroid/graphics/RectF;->left:F

    .line 295
    .line 296
    add-float v6, v5, v14

    .line 297
    .line 298
    sub-float/2addr v6, v13

    .line 299
    iget v7, v0, Landroid/graphics/RectF;->bottom:F

    .line 300
    .line 301
    move v8, v5

    .line 302
    move v5, v6

    .line 303
    sub-float v6, v7, v13

    .line 304
    .line 305
    add-float/2addr v8, v14

    .line 306
    add-float/2addr v8, v13

    .line 307
    add-float/2addr v7, v13

    .line 308
    sget-object v9, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 309
    .line 310
    move/from16 v19, v8

    .line 311
    .line 312
    move v8, v7

    .line 313
    move/from16 v7, v19

    .line 314
    .line 315
    invoke-virtual/range {v4 .. v9}, Landroid/graphics/Path;->addRect(FFFFLandroid/graphics/Path$Direction;)V

    .line 316
    .line 317
    .line 318
    iget v5, v0, Landroid/graphics/RectF;->left:F

    .line 319
    .line 320
    add-float/2addr v5, v14

    .line 321
    add-float/2addr v5, v13

    .line 322
    iget v6, v0, Landroid/graphics/RectF;->bottom:F

    .line 323
    .line 324
    invoke-virtual {v4, v5, v6}, Landroid/graphics/Path;->moveTo(FF)V

    .line 325
    .line 326
    .line 327
    :goto_6
    iget v5, v0, Landroid/graphics/RectF;->right:F

    .line 328
    .line 329
    sub-float/2addr v5, v11

    .line 330
    iget v6, v0, Landroid/graphics/RectF;->bottom:F

    .line 331
    .line 332
    invoke-virtual {v4, v5, v6}, Landroid/graphics/Path;->lineTo(FF)V

    .line 333
    .line 334
    .line 335
    if-eqz v1, :cond_e

    .line 336
    .line 337
    sget-object v1, Lcom/zykj/blackboard/utils/ShapeUtils;->INSTANCE:Lcom/zykj/blackboard/utils/ShapeUtils;

    .line 338
    .line 339
    iget v5, v0, Landroid/graphics/RectF;->right:F

    .line 340
    .line 341
    iget v6, v0, Landroid/graphics/RectF;->bottom:F

    .line 342
    .line 343
    invoke-virtual {v1, v4, v5, v6, v11}, Lcom/zykj/blackboard/utils/ShapeUtils;->drawNewScaleIconToPath(Landroid/graphics/Path;FFF)Landroid/graphics/Path;

    .line 344
    .line 345
    .line 346
    goto :goto_7

    .line 347
    :cond_e
    iget v1, v0, Landroid/graphics/RectF;->right:F

    .line 348
    .line 349
    iget v5, v0, Landroid/graphics/RectF;->bottom:F

    .line 350
    .line 351
    invoke-virtual {v4, v1, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 352
    .line 353
    .line 354
    iget v1, v0, Landroid/graphics/RectF;->right:F

    .line 355
    .line 356
    iget v5, v0, Landroid/graphics/RectF;->bottom:F

    .line 357
    .line 358
    sub-float/2addr v5, v11

    .line 359
    invoke-virtual {v4, v1, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 360
    .line 361
    .line 362
    :goto_7
    iget v1, v0, Landroid/graphics/RectF;->right:F

    .line 363
    .line 364
    iget v5, v0, Landroid/graphics/RectF;->bottom:F

    .line 365
    .line 366
    sub-float/2addr v5, v11

    .line 367
    invoke-virtual {v4, v1, v5}, Landroid/graphics/Path;->moveTo(FF)V

    .line 368
    .line 369
    .line 370
    iget v1, v0, Landroid/graphics/RectF;->right:F

    .line 371
    .line 372
    iget v5, v0, Landroid/graphics/RectF;->top:F

    .line 373
    .line 374
    add-float/2addr v5, v15

    .line 375
    add-float/2addr v5, v13

    .line 376
    invoke-virtual {v4, v1, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 377
    .line 378
    .line 379
    if-nez v17, :cond_f

    .line 380
    .line 381
    iget v1, v0, Landroid/graphics/RectF;->right:F

    .line 382
    .line 383
    iget v5, v0, Landroid/graphics/RectF;->top:F

    .line 384
    .line 385
    add-float/2addr v5, v15

    .line 386
    sub-float/2addr v5, v13

    .line 387
    invoke-virtual {v4, v1, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 388
    .line 389
    .line 390
    goto :goto_8

    .line 391
    :cond_f
    iget v1, v0, Landroid/graphics/RectF;->right:F

    .line 392
    .line 393
    sub-float v5, v1, v13

    .line 394
    .line 395
    iget v6, v0, Landroid/graphics/RectF;->top:F

    .line 396
    .line 397
    add-float v7, v6, v15

    .line 398
    .line 399
    sub-float/2addr v7, v13

    .line 400
    add-float/2addr v1, v13

    .line 401
    add-float/2addr v6, v15

    .line 402
    add-float v8, v6, v13

    .line 403
    .line 404
    sget-object v9, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 405
    .line 406
    move v6, v7

    .line 407
    move v7, v1

    .line 408
    invoke-virtual/range {v4 .. v9}, Landroid/graphics/Path;->addRect(FFFFLandroid/graphics/Path$Direction;)V

    .line 409
    .line 410
    .line 411
    iget v1, v0, Landroid/graphics/RectF;->right:F

    .line 412
    .line 413
    iget v5, v0, Landroid/graphics/RectF;->top:F

    .line 414
    .line 415
    add-float/2addr v5, v15

    .line 416
    sub-float/2addr v5, v13

    .line 417
    invoke-virtual {v4, v1, v5}, Landroid/graphics/Path;->moveTo(FF)V

    .line 418
    .line 419
    .line 420
    :goto_8
    iget v1, v0, Landroid/graphics/RectF;->right:F

    .line 421
    .line 422
    iget v5, v0, Landroid/graphics/RectF;->top:F

    .line 423
    .line 424
    invoke-virtual {v4, v1, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 425
    .line 426
    .line 427
    iget v1, v0, Landroid/graphics/RectF;->right:F

    .line 428
    .line 429
    iget v5, v0, Landroid/graphics/RectF;->top:F

    .line 430
    .line 431
    invoke-virtual {v4, v1, v5}, Landroid/graphics/Path;->moveTo(FF)V

    .line 432
    .line 433
    .line 434
    iget v1, v0, Landroid/graphics/RectF;->left:F

    .line 435
    .line 436
    add-float/2addr v1, v14

    .line 437
    add-float/2addr v1, v13

    .line 438
    iget v5, v0, Landroid/graphics/RectF;->top:F

    .line 439
    .line 440
    invoke-virtual {v4, v1, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 441
    .line 442
    .line 443
    if-nez v16, :cond_10

    .line 444
    .line 445
    iget v1, v0, Landroid/graphics/RectF;->left:F

    .line 446
    .line 447
    add-float/2addr v1, v14

    .line 448
    sub-float/2addr v1, v13

    .line 449
    iget v5, v0, Landroid/graphics/RectF;->top:F

    .line 450
    .line 451
    invoke-virtual {v4, v1, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 452
    .line 453
    .line 454
    goto :goto_9

    .line 455
    :cond_10
    iget v1, v0, Landroid/graphics/RectF;->left:F

    .line 456
    .line 457
    add-float v5, v1, v14

    .line 458
    .line 459
    sub-float/2addr v5, v13

    .line 460
    iget v6, v0, Landroid/graphics/RectF;->top:F

    .line 461
    .line 462
    move v7, v6

    .line 463
    sub-float v6, v7, v13

    .line 464
    .line 465
    add-float/2addr v1, v14

    .line 466
    add-float/2addr v1, v13

    .line 467
    add-float v8, v7, v13

    .line 468
    .line 469
    sget-object v9, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 470
    .line 471
    move v7, v1

    .line 472
    invoke-virtual/range {v4 .. v9}, Landroid/graphics/Path;->addRect(FFFFLandroid/graphics/Path$Direction;)V

    .line 473
    .line 474
    .line 475
    iget v1, v0, Landroid/graphics/RectF;->left:F

    .line 476
    .line 477
    add-float/2addr v1, v14

    .line 478
    sub-float/2addr v1, v13

    .line 479
    iget v5, v0, Landroid/graphics/RectF;->top:F

    .line 480
    .line 481
    invoke-virtual {v4, v1, v5}, Landroid/graphics/Path;->moveTo(FF)V

    .line 482
    .line 483
    .line 484
    :goto_9
    iget v1, v0, Landroid/graphics/RectF;->left:F

    .line 485
    .line 486
    iget v5, v0, Landroid/graphics/RectF;->top:F

    .line 487
    .line 488
    invoke-virtual {v4, v1, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 489
    .line 490
    .line 491
    if-eqz v18, :cond_12

    .line 492
    .line 493
    const/4 v1, 0x5

    .line 494
    int-to-float v1, v1

    .line 495
    mul-float/2addr v3, v1

    .line 496
    div-float/2addr v3, v12

    .line 497
    iget v1, v0, Landroid/graphics/RectF;->left:F

    .line 498
    .line 499
    add-float/2addr v1, v14

    .line 500
    iget v5, v0, Landroid/graphics/RectF;->top:F

    .line 501
    .line 502
    sub-float/2addr v5, v13

    .line 503
    sub-float/2addr v5, v3

    .line 504
    invoke-virtual {v4, v1, v5}, Landroid/graphics/Path;->moveTo(FF)V

    .line 505
    .line 506
    .line 507
    iget v1, v0, Landroid/graphics/RectF;->left:F

    .line 508
    .line 509
    add-float/2addr v1, v14

    .line 510
    iget v5, v0, Landroid/graphics/RectF;->top:F

    .line 511
    .line 512
    sub-float/2addr v5, v13

    .line 513
    invoke-virtual {v4, v1, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 514
    .line 515
    .line 516
    if-nez v16, :cond_11

    .line 517
    .line 518
    iget v1, v0, Landroid/graphics/RectF;->left:F

    .line 519
    .line 520
    add-float/2addr v1, v14

    .line 521
    iget v5, v0, Landroid/graphics/RectF;->top:F

    .line 522
    .line 523
    invoke-virtual {v4, v1, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 524
    .line 525
    .line 526
    :cond_11
    sget-object v1, Lcom/zykj/blackboard/utils/ShapeUtils;->INSTANCE:Lcom/zykj/blackboard/utils/ShapeUtils;

    .line 527
    .line 528
    iget v5, v0, Landroid/graphics/RectF;->left:F

    .line 529
    .line 530
    add-float/2addr v5, v14

    .line 531
    iget v0, v0, Landroid/graphics/RectF;->top:F

    .line 532
    .line 533
    sub-float/2addr v0, v13

    .line 534
    sub-float/2addr v0, v3

    .line 535
    sub-float/2addr v0, v11

    .line 536
    invoke-virtual {v1, v4, v5, v0, v11}, Lcom/zykj/blackboard/utils/ShapeUtils;->drawNewRotateIconToPath(Landroid/graphics/Path;FFF)Landroid/graphics/Path;

    .line 537
    .line 538
    .line 539
    :cond_12
    invoke-virtual {v4, v2}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    .line 540
    .line 541
    .line 542
    return-object v4
.end method
