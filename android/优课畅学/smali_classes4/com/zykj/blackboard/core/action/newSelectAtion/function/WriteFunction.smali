.class public final Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;
.super Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;
.source "SourceFile"


# instance fields
.field private final colorRectFList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/graphics/RectF;",
            ">;"
        }
    .end annotation
.end field

.field private final funcRelativeRectFList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/graphics/RectF;",
            ">;"
        }
    .end annotation
.end field

.field private final functionTypeList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;",
            ">;"
        }
    .end annotation
.end field

.field private isHighlighter:Z

.field private final strokeWidthPointFList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/zykj/blackboard/core/action/IActionListener;)V
    .locals 1

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;-><init>(Lcom/zykj/blackboard/core/action/IActionListener;)V

    .line 7
    .line 8
    .line 9
    new-instance p1, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->functionTypeList:Ljava/util/ArrayList;

    .line 15
    .line 16
    new-instance p1, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->funcRelativeRectFList:Ljava/util/ArrayList;

    .line 22
    .line 23
    new-instance p1, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->strokeWidthPointFList:Ljava/util/ArrayList;

    .line 29
    .line 30
    new-instance p1, Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 33
    .line 34
    .line 35
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->colorRectFList:Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-direct {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->initFunctionTypeList()V

    .line 38
    .line 39
    .line 40
    invoke-direct {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->initFunctionRelativeRectF()V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method private final initFunctionRelativeRectF()V
    .locals 11

    .line 1
    new-instance v0, Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 4
    .line 5
    .line 6
    const/high16 v1, 0x41c80000    # 25.0f

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 9
    .line 10
    .line 11
    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    iget v1, v1, Landroid/graphics/Paint$FontMetrics;->bottom:F

    .line 21
    .line 22
    invoke-virtual {v0}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    iget v2, v2, Landroid/graphics/Paint$FontMetrics;->top:F

    .line 27
    .line 28
    sub-float/2addr v1, v2

    .line 29
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-virtual {v2}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectButtonHeight()F

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    sub-float/2addr v2, v1

    .line 38
    const/4 v3, 0x2

    .line 39
    int-to-float v3, v3

    .line 40
    div-float/2addr v2, v3

    .line 41
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    invoke-virtual {v4}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectButtonHeight()F

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    sub-float/2addr v4, v1

    .line 50
    div-float/2addr v4, v3

    .line 51
    add-float/2addr v4, v1

    .line 52
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->functionTypeList:Ljava/util/ArrayList;

    .line 53
    .line 54
    new-instance v5, Ljava/util/ArrayList;

    .line 55
    .line 56
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 57
    .line 58
    .line 59
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 64
    .line 65
    .line 66
    move-result v6

    .line 67
    if-eqz v6, :cond_1

    .line 68
    .line 69
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v6

    .line 73
    move-object v7, v6

    .line 74
    check-cast v7, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;

    .line 75
    .line 76
    invoke-virtual {v7}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;->getText()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v7

    .line 80
    invoke-interface {v7}, Ljava/lang/CharSequence;->length()I

    .line 81
    .line 82
    .line 83
    move-result v7

    .line 84
    if-lez v7, :cond_0

    .line 85
    .line 86
    invoke-interface {v5, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_1
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    const/high16 v5, 0x41b80000    # 23.0f

    .line 95
    .line 96
    move v6, v5

    .line 97
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 98
    .line 99
    .line 100
    move-result v7

    .line 101
    if-eqz v7, :cond_2

    .line 102
    .line 103
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v7

    .line 107
    check-cast v7, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;

    .line 108
    .line 109
    invoke-virtual {v7}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;->getText()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v7

    .line 113
    invoke-virtual {v0, v7}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 114
    .line 115
    .line 116
    move-result v7

    .line 117
    iget-object v8, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->funcRelativeRectFList:Ljava/util/ArrayList;

    .line 118
    .line 119
    new-instance v9, Landroid/graphics/RectF;

    .line 120
    .line 121
    add-float v10, v6, v7

    .line 122
    .line 123
    invoke-direct {v9, v6, v2, v10, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    const/high16 v8, 0x41f00000    # 30.0f

    .line 130
    .line 131
    add-float/2addr v7, v8

    .line 132
    add-float/2addr v6, v7

    .line 133
    goto :goto_1

    .line 134
    :cond_2
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    invoke-virtual {v0}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectWriteLevel()Ljava/util/List;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    const/4 v1, 0x0

    .line 147
    const/high16 v2, 0x41800000    # 16.0f

    .line 148
    .line 149
    move v4, v1

    .line 150
    :goto_2
    if-ge v4, v0, :cond_3

    .line 151
    .line 152
    int-to-float v6, v4

    .line 153
    const/high16 v7, 0x40400000    # 3.0f

    .line 154
    .line 155
    mul-float/2addr v6, v7

    .line 156
    const/high16 v7, 0x41000000    # 8.0f

    .line 157
    .line 158
    add-float/2addr v6, v7

    .line 159
    div-float/2addr v6, v3

    .line 160
    const/high16 v7, 0x41980000    # 19.0f

    .line 161
    .line 162
    add-float/2addr v6, v7

    .line 163
    add-float/2addr v2, v6

    .line 164
    iget-object v7, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->strokeWidthPointFList:Ljava/util/ArrayList;

    .line 165
    .line 166
    new-instance v8, Landroid/graphics/PointF;

    .line 167
    .line 168
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 169
    .line 170
    .line 171
    move-result-object v9

    .line 172
    invoke-virtual {v9}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectButtonHeight()F

    .line 173
    .line 174
    .line 175
    move-result v9

    .line 176
    div-float/2addr v9, v3

    .line 177
    invoke-direct {v8, v2, v9}, Landroid/graphics/PointF;-><init>(FF)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    add-float/2addr v2, v6

    .line 184
    add-int/lit8 v4, v4, 0x1

    .line 185
    .line 186
    goto :goto_2

    .line 187
    :cond_3
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    invoke-virtual {v0}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectButtonHeight()F

    .line 192
    .line 193
    .line 194
    move-result v0

    .line 195
    const/high16 v2, 0x42180000    # 38.0f

    .line 196
    .line 197
    sub-float/2addr v0, v2

    .line 198
    div-float/2addr v0, v3

    .line 199
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 200
    .line 201
    .line 202
    move-result-object v4

    .line 203
    invoke-virtual {v4}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectButtonHeight()F

    .line 204
    .line 205
    .line 206
    move-result v4

    .line 207
    sub-float/2addr v4, v2

    .line 208
    div-float/2addr v4, v3

    .line 209
    add-float/2addr v4, v2

    .line 210
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 211
    .line 212
    .line 213
    move-result-object v3

    .line 214
    invoke-virtual {v3}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectNormalColor()Ljava/util/List;

    .line 215
    .line 216
    .line 217
    move-result-object v3

    .line 218
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 219
    .line 220
    .line 221
    move-result v3

    .line 222
    :goto_3
    if-ge v1, v3, :cond_4

    .line 223
    .line 224
    iget-object v6, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->colorRectFList:Ljava/util/ArrayList;

    .line 225
    .line 226
    new-instance v7, Landroid/graphics/RectF;

    .line 227
    .line 228
    const/high16 v8, 0x42740000    # 61.0f

    .line 229
    .line 230
    int-to-float v9, v1

    .line 231
    mul-float/2addr v9, v8

    .line 232
    add-float/2addr v9, v5

    .line 233
    add-float v8, v9, v2

    .line 234
    .line 235
    invoke-direct {v7, v9, v0, v8, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 236
    .line 237
    .line 238
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 239
    .line 240
    .line 241
    add-int/lit8 v1, v1, 0x1

    .line 242
    .line 243
    goto :goto_3

    .line 244
    :cond_4
    return-void
.end method

.method private final initFunctionTypeList()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->functionTypeList:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->functionTypeList:Ljava/util/ArrayList;

    .line 7
    .line 8
    sget-object v1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$Rotate;->INSTANCE:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$Rotate;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->functionTypeList:Ljava/util/ArrayList;

    .line 14
    .line 15
    sget-object v1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$Scale;->INSTANCE:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$Scale;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->functionTypeList:Ljava/util/ArrayList;

    .line 21
    .line 22
    new-instance v1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$WriteEdit;

    .line 23
    .line 24
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {v2}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectWriteLevel()Ljava/util/List;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    const/4 v3, 0x0

    .line 33
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    check-cast v2, Ljava/lang/Number;

    .line 38
    .line 39
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    invoke-virtual {v4}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectNormalColor()Ljava/util/List;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    check-cast v4, Ljava/lang/Number;

    .line 56
    .line 57
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    invoke-direct {v1, v3, v2, v4}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$WriteEdit;-><init>(ZFI)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->functionTypeList:Ljava/util/ArrayList;

    .line 68
    .line 69
    sget-object v1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$Delete;->INSTANCE:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$Delete;

    .line 70
    .line 71
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    return-void
.end method


# virtual methods
.method public getCurrentFunctionTypeList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->functionTypeList:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object v0
.end method

.method public getMaxFunctionRectF()Landroid/graphics/RectF;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->funcRelativeRectFList:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-static {v0}, Li7/f0;->x0(Ljava/util/List;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/graphics/RectF;

    .line 8
    .line 9
    iget v0, v0, Landroid/graphics/RectF;->right:F

    .line 10
    .line 11
    const/high16 v1, 0x41700000    # 15.0f

    .line 12
    .line 13
    add-float/2addr v0, v1

    .line 14
    const/high16 v1, 0x41000000    # 8.0f

    .line 15
    .line 16
    add-float/2addr v0, v1

    .line 17
    iget-object v2, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->strokeWidthPointFList:Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-static {v2}, Li7/f0;->x0(Ljava/util/List;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Landroid/graphics/PointF;

    .line 24
    .line 25
    iget v2, v2, Landroid/graphics/PointF;->x:F

    .line 26
    .line 27
    iget-object v3, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->strokeWidthPointFList:Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    add-int/lit8 v3, v3, -0x1

    .line 34
    .line 35
    int-to-float v3, v3

    .line 36
    const/high16 v4, 0x40400000    # 3.0f

    .line 37
    .line 38
    mul-float/2addr v3, v4

    .line 39
    add-float/2addr v2, v3

    .line 40
    add-float/2addr v2, v1

    .line 41
    const/high16 v1, 0x41800000    # 16.0f

    .line 42
    .line 43
    add-float/2addr v2, v1

    .line 44
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->colorRectFList:Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-static {v1}, Li7/f0;->x0(Ljava/util/List;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    check-cast v1, Landroid/graphics/RectF;

    .line 51
    .line 52
    iget v1, v1, Landroid/graphics/RectF;->right:F

    .line 53
    .line 54
    const/high16 v3, 0x41b80000    # 23.0f

    .line 55
    .line 56
    add-float/2addr v1, v3

    .line 57
    invoke-static {v2, v1}, Ljava/lang/Math;->max(FF)F

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    invoke-static {v0, v1}, Ljava/lang/Math;->max(FF)F

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-virtual {v1}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectButtonHeight()F

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    const/4 v2, 0x3

    .line 74
    int-to-float v2, v2

    .line 75
    mul-float/2addr v1, v2

    .line 76
    const/high16 v2, 0x41d00000    # 26.0f

    .line 77
    .line 78
    add-float/2addr v1, v2

    .line 79
    new-instance v2, Landroid/graphics/RectF;

    .line 80
    .line 81
    const/4 v3, 0x0

    .line 82
    invoke-direct {v2, v3, v3, v0, v1}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 83
    .line 84
    .line 85
    return-object v2
.end method

.method public handleClick(FF)Z
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-super/range {p0 .. p2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->handleClick(FF)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    return v2

    .line 11
    :cond_0
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getCurrentFunctionMode()Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    instance-of v3, v1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Function;

    .line 16
    .line 17
    const/4 v4, 0x0

    .line 18
    const/4 v5, 0x1

    .line 19
    if-eqz v3, :cond_6

    .line 20
    .line 21
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getCurrentFunctionMode()Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    const-string v3, "null cannot be cast to non-null type com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionMode.Function"

    .line 26
    .line 27
    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    check-cast v1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Function;

    .line 31
    .line 32
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Function;->getIndex()I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_2

    .line 37
    .line 38
    if-eq v1, v5, :cond_1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectGraphList()Ljava/util/ArrayList;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-interface {v1, v2}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->delete(Ljava/util/List;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-interface {v1}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->selectCancel()V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getListener()Lcom/zykj/blackboard/core/action/IActionListener;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectGraphList()Ljava/util/ArrayList;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 68
    .line 69
    .line 70
    move-result-wide v3

    .line 71
    invoke-interface {v1, v2, v3, v4}, Lcom/zykj/blackboard/core/action/IActionListener;->deleteGraphEvent(Ljava/util/List;J)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getListener()Lcom/zykj/blackboard/core/action/IActionListener;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-interface {v1}, Lcom/zykj/blackboard/core/action/IActionListener;->saveSnapshot()V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->reset()V

    .line 82
    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_2
    iget-object v1, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->functionTypeList:Ljava/util/ArrayList;

    .line 86
    .line 87
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    :cond_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 92
    .line 93
    .line 94
    move-result v3

    .line 95
    if-eqz v3, :cond_4

    .line 96
    .line 97
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    move-object v6, v3

    .line 102
    check-cast v6, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;

    .line 103
    .line 104
    instance-of v6, v6, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$WriteEdit;

    .line 105
    .line 106
    if-eqz v6, :cond_3

    .line 107
    .line 108
    move-object v4, v3

    .line 109
    :cond_4
    check-cast v4, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;

    .line 110
    .line 111
    if-eqz v4, :cond_5

    .line 112
    .line 113
    invoke-virtual {v4}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;->isSelected()Z

    .line 114
    .line 115
    .line 116
    move-result v1

    .line 117
    xor-int/2addr v1, v5

    .line 118
    invoke-virtual {v4, v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;->setSelected(Z)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v0, v2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->showSelectRectF(Z)V

    .line 122
    .line 123
    .line 124
    :cond_5
    :goto_0
    return v5

    .line 125
    :cond_6
    instance-of v3, v1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$WriteSize;

    .line 126
    .line 127
    const/16 v6, 0xa

    .line 128
    .line 129
    const-string v7, " list: "

    .line 130
    .line 131
    if-eqz v3, :cond_10

    .line 132
    .line 133
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getCurrentFunctionMode()Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    const-string v3, "null cannot be cast to non-null type com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionMode.WriteSize"

    .line 138
    .line 139
    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    check-cast v1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$WriteSize;

    .line 143
    .line 144
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$WriteSize;->getIndex()I

    .line 145
    .line 146
    .line 147
    move-result v1

    .line 148
    iget-boolean v3, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->isHighlighter:Z

    .line 149
    .line 150
    if-eqz v3, :cond_7

    .line 151
    .line 152
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 153
    .line 154
    .line 155
    move-result-object v3

    .line 156
    invoke-virtual {v3}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectHighlighterLevel()Ljava/util/List;

    .line 157
    .line 158
    .line 159
    move-result-object v3

    .line 160
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    check-cast v1, Ljava/lang/Number;

    .line 165
    .line 166
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 167
    .line 168
    .line 169
    move-result v1

    .line 170
    goto :goto_1

    .line 171
    :cond_7
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 172
    .line 173
    .line 174
    move-result-object v3

    .line 175
    invoke-virtual {v3}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectWriteLevel()Ljava/util/List;

    .line 176
    .line 177
    .line 178
    move-result-object v3

    .line 179
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v1

    .line 183
    check-cast v1, Ljava/lang/Number;

    .line 184
    .line 185
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 186
    .line 187
    .line 188
    move-result v1

    .line 189
    :goto_1
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectGraphList()Ljava/util/ArrayList;

    .line 190
    .line 191
    .line 192
    move-result-object v3

    .line 193
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 194
    .line 195
    .line 196
    move-result-object v3

    .line 197
    :cond_8
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 198
    .line 199
    .line 200
    move-result v8

    .line 201
    if-eqz v8, :cond_b

    .line 202
    .line 203
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v8

    .line 207
    check-cast v8, Lcom/zykj/blackboard/core/graph/IGraph;

    .line 208
    .line 209
    invoke-interface {v8}, Lcom/zykj/blackboard/core/graph/IGraph;->getChildGraph()Ljava/util/List;

    .line 210
    .line 211
    .line 212
    move-result-object v9

    .line 213
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 214
    .line 215
    .line 216
    move-result-object v9

    .line 217
    :cond_9
    :goto_2
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 218
    .line 219
    .line 220
    move-result v10

    .line 221
    if-eqz v10, :cond_8

    .line 222
    .line 223
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v10

    .line 227
    move-object v12, v10

    .line 228
    check-cast v12, Lcom/zykj/blackboard/core/graph/IGraph;

    .line 229
    .line 230
    instance-of v10, v12, Lcom/zykj/blackboard/core/graph/stroke/WritingGraph;

    .line 231
    .line 232
    if-eqz v10, :cond_a

    .line 233
    .line 234
    move-object v10, v12

    .line 235
    check-cast v10, Lcom/zykj/blackboard/core/graph/stroke/WritingGraph;

    .line 236
    .line 237
    invoke-virtual {v10}, Lcom/zykj/blackboard/core/graph/stroke/WritingGraph;->getMPaint()Landroid/graphics/Paint;

    .line 238
    .line 239
    .line 240
    move-result-object v10

    .line 241
    if-eqz v10, :cond_a

    .line 242
    .line 243
    invoke-virtual {v10, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getListener()Lcom/zykj/blackboard/core/action/IActionListener;

    .line 247
    .line 248
    .line 249
    move-result-object v11

    .line 250
    sget-object v13, Lcom/zykj/board/EzyGraphEnum$GraphEnum;->e:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    .line 251
    .line 252
    new-instance v14, Landroid/graphics/Paint;

    .line 253
    .line 254
    invoke-direct {v14, v10}, Landroid/graphics/Paint;-><init>(Landroid/graphics/Paint;)V

    .line 255
    .line 256
    .line 257
    const/16 v20, 0xec

    .line 258
    .line 259
    const/16 v21, 0x0

    .line 260
    .line 261
    move-object/from16 v16, v14

    .line 262
    .line 263
    const/4 v14, 0x0

    .line 264
    const/4 v15, 0x0

    .line 265
    const/16 v17, 0x0

    .line 266
    .line 267
    const/16 v18, 0x0

    .line 268
    .line 269
    const/16 v19, 0x0

    .line 270
    .line 271
    invoke-static/range {v11 .. v21}, Lcom/zykj/blackboard/core/action/IActionListener$DefaultImpls;->changeGraph$default(Lcom/zykj/blackboard/core/action/IActionListener;Lcom/zykj/blackboard/core/graph/IGraph;Lcom/zykj/board/EzyGraphEnum$GraphEnum;Landroid/graphics/RectF;Ljava/lang/String;Landroid/graphics/Paint;Ljava/util/List;Landroid/graphics/Matrix;Ljava/lang/String;ILjava/lang/Object;)V

    .line 272
    .line 273
    .line 274
    :cond_a
    instance-of v10, v8, Lcom/zykj/blackboard/core/graph/group/IChangeField;

    .line 275
    .line 276
    if-eqz v10, :cond_9

    .line 277
    .line 278
    move-object v10, v8

    .line 279
    check-cast v10, Lcom/zykj/blackboard/core/graph/group/IChangeField;

    .line 280
    .line 281
    invoke-interface {v10, v5}, Lcom/zykj/blackboard/core/graph/group/IChangeField;->changeUpdate(Z)V

    .line 282
    .line 283
    .line 284
    goto :goto_2

    .line 285
    :cond_b
    new-instance v3, Ljava/lang/StringBuilder;

    .line 286
    .line 287
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 288
    .line 289
    .line 290
    const-string v8, "WriteFunction:WriteSize -> size:"

    .line 291
    .line 292
    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 293
    .line 294
    .line 295
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 296
    .line 297
    .line 298
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 299
    .line 300
    .line 301
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectGraphList()Ljava/util/ArrayList;

    .line 302
    .line 303
    .line 304
    move-result-object v7

    .line 305
    new-instance v8, Ljava/util/ArrayList;

    .line 306
    .line 307
    invoke-static {v7, v6}, Li7/w;->x(Ljava/lang/Iterable;I)I

    .line 308
    .line 309
    .line 310
    move-result v6

    .line 311
    invoke-direct {v8, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 312
    .line 313
    .line 314
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 315
    .line 316
    .line 317
    move-result-object v6

    .line 318
    :goto_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 319
    .line 320
    .line 321
    move-result v7

    .line 322
    if-eqz v7, :cond_c

    .line 323
    .line 324
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 325
    .line 326
    .line 327
    move-result-object v7

    .line 328
    check-cast v7, Lcom/zykj/blackboard/core/graph/IGraph;

    .line 329
    .line 330
    invoke-interface {v7}, Lcom/zykj/blackboard/core/graph/IGraph;->getId()Ljava/lang/String;

    .line 331
    .line 332
    .line 333
    move-result-object v7

    .line 334
    invoke-interface {v8, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 335
    .line 336
    .line 337
    goto :goto_3

    .line 338
    :cond_c
    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 339
    .line 340
    .line 341
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object v3

    .line 345
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 346
    .line 347
    .line 348
    move-result-object v3

    .line 349
    invoke-static {v3}, Lcom/blankj/utilcode/util/q;->s([Ljava/lang/Object;)V

    .line 350
    .line 351
    .line 352
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    .line 353
    .line 354
    .line 355
    move-result-object v3

    .line 356
    invoke-interface {v3}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->reDrawFixView()V

    .line 357
    .line 358
    .line 359
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getListener()Lcom/zykj/blackboard/core/action/IActionListener;

    .line 360
    .line 361
    .line 362
    move-result-object v3

    .line 363
    invoke-interface {v3}, Lcom/zykj/blackboard/core/action/IActionListener;->saveSnapshot()V

    .line 364
    .line 365
    .line 366
    iget-object v3, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->functionTypeList:Ljava/util/ArrayList;

    .line 367
    .line 368
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 369
    .line 370
    .line 371
    move-result-object v3

    .line 372
    :cond_d
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 373
    .line 374
    .line 375
    move-result v6

    .line 376
    if-eqz v6, :cond_e

    .line 377
    .line 378
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 379
    .line 380
    .line 381
    move-result-object v6

    .line 382
    move-object v7, v6

    .line 383
    check-cast v7, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;

    .line 384
    .line 385
    instance-of v7, v7, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$WriteEdit;

    .line 386
    .line 387
    if-eqz v7, :cond_d

    .line 388
    .line 389
    move-object v4, v6

    .line 390
    :cond_e
    check-cast v4, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;

    .line 391
    .line 392
    if-eqz v4, :cond_f

    .line 393
    .line 394
    check-cast v4, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$WriteEdit;

    .line 395
    .line 396
    invoke-virtual {v4, v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$WriteEdit;->setWidth(F)V

    .line 397
    .line 398
    .line 399
    :cond_f
    invoke-virtual {v0, v2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->showSelectRectF(Z)V

    .line 400
    .line 401
    .line 402
    return v5

    .line 403
    :cond_10
    instance-of v1, v1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Color;

    .line 404
    .line 405
    if-eqz v1, :cond_1a

    .line 406
    .line 407
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getCurrentFunctionMode()Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode;

    .line 408
    .line 409
    .line 410
    move-result-object v1

    .line 411
    const-string v3, "null cannot be cast to non-null type com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionMode.Color"

    .line 412
    .line 413
    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 414
    .line 415
    .line 416
    check-cast v1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Color;

    .line 417
    .line 418
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Color;->getIndex()I

    .line 419
    .line 420
    .line 421
    move-result v1

    .line 422
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 423
    .line 424
    .line 425
    move-result-object v3

    .line 426
    invoke-virtual {v3}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectNormalColor()Ljava/util/List;

    .line 427
    .line 428
    .line 429
    move-result-object v3

    .line 430
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 431
    .line 432
    .line 433
    move-result-object v1

    .line 434
    check-cast v1, Ljava/lang/Number;

    .line 435
    .line 436
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 437
    .line 438
    .line 439
    move-result v1

    .line 440
    iget-boolean v3, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->isHighlighter:Z

    .line 441
    .line 442
    if-eqz v3, :cond_11

    .line 443
    .line 444
    const v3, 0xffffff

    .line 445
    .line 446
    .line 447
    and-int/2addr v1, v3

    .line 448
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 449
    .line 450
    .line 451
    move-result-object v3

    .line 452
    invoke-virtual {v3}, Lcom/zykj/blackboard/bean/BoardConfig;->getHighlighterColorAlpha()F

    .line 453
    .line 454
    .line 455
    move-result v3

    .line 456
    const/16 v8, 0xff

    .line 457
    .line 458
    int-to-float v8, v8

    .line 459
    mul-float/2addr v3, v8

    .line 460
    float-to-int v3, v3

    .line 461
    shl-int/lit8 v3, v3, 0x18

    .line 462
    .line 463
    or-int/2addr v1, v3

    .line 464
    :cond_11
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectGraphList()Ljava/util/ArrayList;

    .line 465
    .line 466
    .line 467
    move-result-object v3

    .line 468
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 469
    .line 470
    .line 471
    move-result-object v3

    .line 472
    :cond_12
    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 473
    .line 474
    .line 475
    move-result v8

    .line 476
    if-eqz v8, :cond_15

    .line 477
    .line 478
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 479
    .line 480
    .line 481
    move-result-object v8

    .line 482
    check-cast v8, Lcom/zykj/blackboard/core/graph/IGraph;

    .line 483
    .line 484
    invoke-interface {v8}, Lcom/zykj/blackboard/core/graph/IGraph;->getChildGraph()Ljava/util/List;

    .line 485
    .line 486
    .line 487
    move-result-object v9

    .line 488
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 489
    .line 490
    .line 491
    move-result-object v9

    .line 492
    :cond_13
    :goto_5
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 493
    .line 494
    .line 495
    move-result v10

    .line 496
    if-eqz v10, :cond_14

    .line 497
    .line 498
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 499
    .line 500
    .line 501
    move-result-object v10

    .line 502
    move-object v12, v10

    .line 503
    check-cast v12, Lcom/zykj/blackboard/core/graph/IGraph;

    .line 504
    .line 505
    instance-of v10, v12, Lcom/zykj/blackboard/core/graph/stroke/WritingGraph;

    .line 506
    .line 507
    if-eqz v10, :cond_13

    .line 508
    .line 509
    move-object v10, v12

    .line 510
    check-cast v10, Lcom/zykj/blackboard/core/graph/stroke/WritingGraph;

    .line 511
    .line 512
    invoke-virtual {v10}, Lcom/zykj/blackboard/core/graph/stroke/WritingGraph;->getMPaint()Landroid/graphics/Paint;

    .line 513
    .line 514
    .line 515
    move-result-object v10

    .line 516
    if-eqz v10, :cond_13

    .line 517
    .line 518
    invoke-virtual {v10, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 519
    .line 520
    .line 521
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getListener()Lcom/zykj/blackboard/core/action/IActionListener;

    .line 522
    .line 523
    .line 524
    move-result-object v11

    .line 525
    sget-object v13, Lcom/zykj/board/EzyGraphEnum$GraphEnum;->e:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    .line 526
    .line 527
    new-instance v14, Landroid/graphics/Paint;

    .line 528
    .line 529
    invoke-direct {v14, v10}, Landroid/graphics/Paint;-><init>(Landroid/graphics/Paint;)V

    .line 530
    .line 531
    .line 532
    const/16 v20, 0xec

    .line 533
    .line 534
    const/16 v21, 0x0

    .line 535
    .line 536
    move-object/from16 v16, v14

    .line 537
    .line 538
    const/4 v14, 0x0

    .line 539
    const/4 v15, 0x0

    .line 540
    const/16 v17, 0x0

    .line 541
    .line 542
    const/16 v18, 0x0

    .line 543
    .line 544
    const/16 v19, 0x0

    .line 545
    .line 546
    invoke-static/range {v11 .. v21}, Lcom/zykj/blackboard/core/action/IActionListener$DefaultImpls;->changeGraph$default(Lcom/zykj/blackboard/core/action/IActionListener;Lcom/zykj/blackboard/core/graph/IGraph;Lcom/zykj/board/EzyGraphEnum$GraphEnum;Landroid/graphics/RectF;Ljava/lang/String;Landroid/graphics/Paint;Ljava/util/List;Landroid/graphics/Matrix;Ljava/lang/String;ILjava/lang/Object;)V

    .line 547
    .line 548
    .line 549
    goto :goto_5

    .line 550
    :cond_14
    instance-of v9, v8, Lcom/zykj/blackboard/core/graph/group/IChangeField;

    .line 551
    .line 552
    if-eqz v9, :cond_12

    .line 553
    .line 554
    check-cast v8, Lcom/zykj/blackboard/core/graph/group/IChangeField;

    .line 555
    .line 556
    invoke-interface {v8, v5}, Lcom/zykj/blackboard/core/graph/group/IChangeField;->changeUpdate(Z)V

    .line 557
    .line 558
    .line 559
    goto :goto_4

    .line 560
    :cond_15
    new-instance v3, Ljava/lang/StringBuilder;

    .line 561
    .line 562
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 563
    .line 564
    .line 565
    const-string v8, "WriteFunction:Color -> color:"

    .line 566
    .line 567
    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 568
    .line 569
    .line 570
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 571
    .line 572
    .line 573
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 574
    .line 575
    .line 576
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectGraphList()Ljava/util/ArrayList;

    .line 577
    .line 578
    .line 579
    move-result-object v7

    .line 580
    new-instance v8, Ljava/util/ArrayList;

    .line 581
    .line 582
    invoke-static {v7, v6}, Li7/w;->x(Ljava/lang/Iterable;I)I

    .line 583
    .line 584
    .line 585
    move-result v6

    .line 586
    invoke-direct {v8, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 587
    .line 588
    .line 589
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 590
    .line 591
    .line 592
    move-result-object v6

    .line 593
    :goto_6
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 594
    .line 595
    .line 596
    move-result v7

    .line 597
    if-eqz v7, :cond_16

    .line 598
    .line 599
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 600
    .line 601
    .line 602
    move-result-object v7

    .line 603
    check-cast v7, Lcom/zykj/blackboard/core/graph/IGraph;

    .line 604
    .line 605
    invoke-interface {v7}, Lcom/zykj/blackboard/core/graph/IGraph;->getId()Ljava/lang/String;

    .line 606
    .line 607
    .line 608
    move-result-object v7

    .line 609
    invoke-interface {v8, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 610
    .line 611
    .line 612
    goto :goto_6

    .line 613
    :cond_16
    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 614
    .line 615
    .line 616
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 617
    .line 618
    .line 619
    move-result-object v3

    .line 620
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 621
    .line 622
    .line 623
    move-result-object v3

    .line 624
    invoke-static {v3}, Lcom/blankj/utilcode/util/q;->s([Ljava/lang/Object;)V

    .line 625
    .line 626
    .line 627
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    .line 628
    .line 629
    .line 630
    move-result-object v3

    .line 631
    invoke-interface {v3}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->reDrawFixView()V

    .line 632
    .line 633
    .line 634
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getListener()Lcom/zykj/blackboard/core/action/IActionListener;

    .line 635
    .line 636
    .line 637
    move-result-object v3

    .line 638
    invoke-interface {v3}, Lcom/zykj/blackboard/core/action/IActionListener;->saveSnapshot()V

    .line 639
    .line 640
    .line 641
    iget-object v3, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->functionTypeList:Ljava/util/ArrayList;

    .line 642
    .line 643
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 644
    .line 645
    .line 646
    move-result-object v3

    .line 647
    :cond_17
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 648
    .line 649
    .line 650
    move-result v6

    .line 651
    if-eqz v6, :cond_18

    .line 652
    .line 653
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 654
    .line 655
    .line 656
    move-result-object v6

    .line 657
    move-object v7, v6

    .line 658
    check-cast v7, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;

    .line 659
    .line 660
    instance-of v7, v7, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$WriteEdit;

    .line 661
    .line 662
    if-eqz v7, :cond_17

    .line 663
    .line 664
    move-object v4, v6

    .line 665
    :cond_18
    check-cast v4, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;

    .line 666
    .line 667
    if-eqz v4, :cond_19

    .line 668
    .line 669
    check-cast v4, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$WriteEdit;

    .line 670
    .line 671
    invoke-virtual {v4, v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$WriteEdit;->setColor(I)V

    .line 672
    .line 673
    .line 674
    :cond_19
    invoke-virtual {v0, v2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->showSelectRectF(Z)V

    .line 675
    .line 676
    .line 677
    return v5

    .line 678
    :cond_1a
    return v2
.end method

.method public isClickInSelectFunction(FF)Z
    .locals 11

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getFunctionRectF()Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getWriteEdit()Landroid/graphics/RectF;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1, p2}, Landroid/graphics/RectF;->contains(FF)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x0

    .line 14
    const/4 v2, 0x1

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    new-instance p1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Function;

    .line 18
    .line 19
    invoke-direct {p1, v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Function;-><init>(I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->setCurrentFunctionMode(Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode;)V

    .line 23
    .line 24
    .line 25
    return v2

    .line 26
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getFunctionRectF()Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getDelete()Landroid/graphics/RectF;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {v0, p1, p2}, Landroid/graphics/RectF;->contains(FF)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    new-instance p1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Function;

    .line 41
    .line 42
    invoke-direct {p1, v2}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Function;-><init>(I)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->setCurrentFunctionMode(Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode;)V

    .line 46
    .line 47
    .line 48
    return v2

    .line 49
    :cond_1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->functionTypeList:Ljava/util/ArrayList;

    .line 50
    .line 51
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    if-eqz v3, :cond_3

    .line 60
    .line 61
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    move-object v4, v3

    .line 66
    check-cast v4, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;

    .line 67
    .line 68
    instance-of v4, v4, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$WriteEdit;

    .line 69
    .line 70
    if-eqz v4, :cond_2

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_3
    const/4 v3, 0x0

    .line 74
    :goto_0
    check-cast v3, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;

    .line 75
    .line 76
    if-eqz v3, :cond_7

    .line 77
    .line 78
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;->isSelected()Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-ne v0, v2, :cond_7

    .line 83
    .line 84
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getFunctionRectF()Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getWriteStrokeWidthList()Ljava/util/ArrayList;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    move v3, v1

    .line 97
    :goto_1
    if-ge v3, v0, :cond_5

    .line 98
    .line 99
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getFunctionRectF()Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    invoke-virtual {v4}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getWriteStrokeWidthList()Ljava/util/ArrayList;

    .line 104
    .line 105
    .line 106
    move-result-object v4

    .line 107
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v4

    .line 111
    check-cast v4, Landroid/graphics/RectF;

    .line 112
    .line 113
    invoke-virtual {v4, p1, p2}, Landroid/graphics/RectF;->contains(FF)Z

    .line 114
    .line 115
    .line 116
    move-result v4

    .line 117
    if-eqz v4, :cond_4

    .line 118
    .line 119
    new-instance p1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$WriteSize;

    .line 120
    .line 121
    invoke-direct {p1, v3}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$WriteSize;-><init>(I)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->setCurrentFunctionMode(Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode;)V

    .line 125
    .line 126
    .line 127
    return v2

    .line 128
    :cond_4
    add-int/lit8 v3, v3, 0x1

    .line 129
    .line 130
    goto :goto_1

    .line 131
    :cond_5
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getFunctionRectF()Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getColorList()Ljava/util/ArrayList;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 140
    .line 141
    .line 142
    move-result v0

    .line 143
    move v3, v1

    .line 144
    :goto_2
    if-ge v3, v0, :cond_7

    .line 145
    .line 146
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getFunctionRectF()Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;

    .line 147
    .line 148
    .line 149
    move-result-object v4

    .line 150
    invoke-virtual {v4}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getColorList()Ljava/util/ArrayList;

    .line 151
    .line 152
    .line 153
    move-result-object v4

    .line 154
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v4

    .line 158
    check-cast v4, Landroid/graphics/RectF;

    .line 159
    .line 160
    invoke-virtual {v4, p1, p2}, Landroid/graphics/RectF;->contains(FF)Z

    .line 161
    .line 162
    .line 163
    move-result v4

    .line 164
    if-eqz v4, :cond_6

    .line 165
    .line 166
    new-instance p1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Color;

    .line 167
    .line 168
    invoke-direct {p1, v3}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Color;-><init>(I)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->setCurrentFunctionMode(Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode;)V

    .line 172
    .line 173
    .line 174
    return v2

    .line 175
    :cond_6
    add-int/lit8 v3, v3, 0x1

    .line 176
    .line 177
    goto :goto_2

    .line 178
    :cond_7
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getCurrentMatrix()Landroid/graphics/Matrix;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    invoke-static {v0}, Lcom/zykj/blackboard/utils/MatrixExtKt;->invert(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    const/4 v3, 0x2

    .line 187
    new-array v4, v3, [F

    .line 188
    .line 189
    aput p1, v4, v1

    .line 190
    .line 191
    aput p2, v4, v2

    .line 192
    .line 193
    invoke-virtual {v0, v4}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 194
    .line 195
    .line 196
    aget p1, v4, v1

    .line 197
    .line 198
    aget p2, v4, v2

    .line 199
    .line 200
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 201
    .line 202
    .line 203
    move-result-object v4

    .line 204
    invoke-virtual {v4}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectIconWidth()F

    .line 205
    .line 206
    .line 207
    move-result v4

    .line 208
    invoke-virtual {v0, v4}, Landroid/graphics/Matrix;->mapRadius(F)F

    .line 209
    .line 210
    .line 211
    move-result v0

    .line 212
    new-instance v4, Landroid/graphics/RectF;

    .line 213
    .line 214
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectRectF()Landroid/graphics/RectF;

    .line 215
    .line 216
    .line 217
    move-result-object v5

    .line 218
    invoke-virtual {v5}, Landroid/graphics/RectF;->centerX()F

    .line 219
    .line 220
    .line 221
    move-result v5

    .line 222
    int-to-float v3, v3

    .line 223
    div-float v6, v0, v3

    .line 224
    .line 225
    sub-float/2addr v5, v6

    .line 226
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectRectF()Landroid/graphics/RectF;

    .line 227
    .line 228
    .line 229
    move-result-object v7

    .line 230
    iget v7, v7, Landroid/graphics/RectF;->top:F

    .line 231
    .line 232
    const/4 v8, 0x5

    .line 233
    int-to-float v8, v8

    .line 234
    mul-float/2addr v8, v0

    .line 235
    div-float/2addr v8, v3

    .line 236
    sub-float/2addr v7, v8

    .line 237
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectRectF()Landroid/graphics/RectF;

    .line 238
    .line 239
    .line 240
    move-result-object v8

    .line 241
    invoke-virtual {v8}, Landroid/graphics/RectF;->centerX()F

    .line 242
    .line 243
    .line 244
    move-result v8

    .line 245
    add-float/2addr v8, v6

    .line 246
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectRectF()Landroid/graphics/RectF;

    .line 247
    .line 248
    .line 249
    move-result-object v9

    .line 250
    iget v9, v9, Landroid/graphics/RectF;->top:F

    .line 251
    .line 252
    const/4 v10, 0x3

    .line 253
    int-to-float v10, v10

    .line 254
    mul-float/2addr v0, v10

    .line 255
    div-float/2addr v0, v3

    .line 256
    sub-float/2addr v9, v0

    .line 257
    invoke-direct {v4, v5, v7, v8, v9}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 258
    .line 259
    .line 260
    invoke-virtual {v4, p1, p2}, Landroid/graphics/RectF;->contains(FF)Z

    .line 261
    .line 262
    .line 263
    move-result v0

    .line 264
    if-eqz v0, :cond_8

    .line 265
    .line 266
    sget-object p1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Rotate;->INSTANCE:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Rotate;

    .line 267
    .line 268
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->setCurrentFunctionMode(Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode;)V

    .line 269
    .line 270
    .line 271
    return v2

    .line 272
    :cond_8
    new-instance v0, Landroid/graphics/RectF;

    .line 273
    .line 274
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectRectF()Landroid/graphics/RectF;

    .line 275
    .line 276
    .line 277
    move-result-object v3

    .line 278
    iget v3, v3, Landroid/graphics/RectF;->right:F

    .line 279
    .line 280
    sub-float/2addr v3, v6

    .line 281
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectRectF()Landroid/graphics/RectF;

    .line 282
    .line 283
    .line 284
    move-result-object v4

    .line 285
    iget v4, v4, Landroid/graphics/RectF;->bottom:F

    .line 286
    .line 287
    sub-float/2addr v4, v6

    .line 288
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectRectF()Landroid/graphics/RectF;

    .line 289
    .line 290
    .line 291
    move-result-object v5

    .line 292
    iget v5, v5, Landroid/graphics/RectF;->right:F

    .line 293
    .line 294
    add-float/2addr v5, v6

    .line 295
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectRectF()Landroid/graphics/RectF;

    .line 296
    .line 297
    .line 298
    move-result-object v7

    .line 299
    iget v7, v7, Landroid/graphics/RectF;->bottom:F

    .line 300
    .line 301
    add-float/2addr v7, v6

    .line 302
    invoke-direct {v0, v3, v4, v5, v7}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 303
    .line 304
    .line 305
    invoke-virtual {v0, p1, p2}, Landroid/graphics/RectF;->contains(FF)Z

    .line 306
    .line 307
    .line 308
    move-result v0

    .line 309
    if-eqz v0, :cond_9

    .line 310
    .line 311
    sget-object p1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Scale;->INSTANCE:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Scale;

    .line 312
    .line 313
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->setCurrentFunctionMode(Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode;)V

    .line 314
    .line 315
    .line 316
    return v2

    .line 317
    :cond_9
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectRectF()Landroid/graphics/RectF;

    .line 318
    .line 319
    .line 320
    move-result-object v0

    .line 321
    invoke-virtual {v0, p1, p2}, Landroid/graphics/RectF;->contains(FF)Z

    .line 322
    .line 323
    .line 324
    move-result p1

    .line 325
    if-eqz p1, :cond_a

    .line 326
    .line 327
    sget-object p1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Content;->INSTANCE:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Content;

    .line 328
    .line 329
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->setCurrentFunctionMode(Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode;)V

    .line 330
    .line 331
    .line 332
    return v2

    .line 333
    :cond_a
    sget-object p1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Nothing;->INSTANCE:Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Nothing;

    .line 334
    .line 335
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->setCurrentFunctionMode(Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode;)V

    .line 336
    .line 337
    .line 338
    return v1
.end method

.method public final isHighlighter()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->isHighlighter:Z

    .line 2
    .line 3
    return v0
.end method

.method public reset()V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->reset()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->initFunctionTypeList()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final setHighlighter(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->isHighlighter:Z

    .line 2
    .line 3
    return-void
.end method

.method public setSelectGraphList(Ljava/util/List;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/zykj/blackboard/core/graph/IGraph;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "graphList"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->setSelectGraphList(Ljava/util/List;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->functionTypeList:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const/4 v2, 0x0

    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    move-object v3, v1

    .line 27
    check-cast v3, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;

    .line 28
    .line 29
    instance-of v3, v3, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$WriteEdit;

    .line 30
    .line 31
    if-eqz v3, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    move-object v1, v2

    .line 35
    :goto_0
    check-cast v1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;

    .line 36
    .line 37
    if-eqz v1, :cond_d

    .line 38
    .line 39
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    const/4 v0, 0x1

    .line 44
    move-object v3, v2

    .line 45
    move-object v4, v3

    .line 46
    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    if-eqz v5, :cond_b

    .line 51
    .line 52
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    check-cast v5, Lcom/zykj/blackboard/core/graph/IGraph;

    .line 57
    .line 58
    invoke-interface {v5}, Lcom/zykj/blackboard/core/graph/IGraph;->getChildGraph()Ljava/util/List;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    :cond_3
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 67
    .line 68
    .line 69
    move-result v6

    .line 70
    if-eqz v6, :cond_2

    .line 71
    .line 72
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v6

    .line 76
    check-cast v6, Lcom/zykj/blackboard/core/graph/IGraph;

    .line 77
    .line 78
    instance-of v7, v6, Lcom/zykj/blackboard/core/graph/stroke/WritingGraph;

    .line 79
    .line 80
    const/4 v8, 0x0

    .line 81
    if-eqz v7, :cond_a

    .line 82
    .line 83
    check-cast v6, Lcom/zykj/blackboard/core/graph/stroke/WritingGraph;

    .line 84
    .line 85
    invoke-virtual {v6}, Lcom/zykj/blackboard/core/graph/stroke/WritingGraph;->getMPaint()Landroid/graphics/Paint;

    .line 86
    .line 87
    .line 88
    move-result-object v6

    .line 89
    if-eqz v6, :cond_9

    .line 90
    .line 91
    if-nez v4, :cond_4

    .line 92
    .line 93
    invoke-virtual {v6}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 94
    .line 95
    .line 96
    move-result v3

    .line 97
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    invoke-virtual {v6}, Landroid/graphics/Paint;->getColor()I

    .line 102
    .line 103
    .line 104
    move-result v4

    .line 105
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 106
    .line 107
    .line 108
    move-result-object v4

    .line 109
    move-object v10, v4

    .line 110
    move-object v4, v3

    .line 111
    move-object v3, v10

    .line 112
    goto :goto_3

    .line 113
    :cond_4
    invoke-virtual {v6}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 114
    .line 115
    .line 116
    move-result v7

    .line 117
    invoke-static {v4, v7}, Lkotlin/jvm/internal/u;->a(Ljava/lang/Float;F)Z

    .line 118
    .line 119
    .line 120
    move-result v7

    .line 121
    if-nez v7, :cond_5

    .line 122
    .line 123
    const/high16 v4, -0x40800000    # -1.0f

    .line 124
    .line 125
    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 126
    .line 127
    .line 128
    move-result-object v4

    .line 129
    :cond_5
    invoke-virtual {v6}, Landroid/graphics/Paint;->getColor()I

    .line 130
    .line 131
    .line 132
    move-result v7

    .line 133
    if-nez v3, :cond_6

    .line 134
    .line 135
    goto :goto_2

    .line 136
    :cond_6
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 137
    .line 138
    .line 139
    move-result v9

    .line 140
    if-eq v9, v7, :cond_7

    .line 141
    .line 142
    :goto_2
    const v3, 0x7fffffff

    .line 143
    .line 144
    .line 145
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 146
    .line 147
    .line 148
    move-result-object v3

    .line 149
    :cond_7
    :goto_3
    invoke-virtual {v6}, Landroid/graphics/Paint;->getColor()I

    .line 150
    .line 151
    .line 152
    move-result v6

    .line 153
    invoke-static {v6}, Landroid/graphics/Color;->alpha(I)I

    .line 154
    .line 155
    .line 156
    move-result v6

    .line 157
    const/16 v7, 0xff

    .line 158
    .line 159
    if-ne v6, v7, :cond_8

    .line 160
    .line 161
    move v0, v8

    .line 162
    :cond_8
    sget-object v6, Lh7/p;->a:Lh7/p;

    .line 163
    .line 164
    goto :goto_4

    .line 165
    :cond_9
    move-object v6, v2

    .line 166
    :goto_4
    if-nez v6, :cond_3

    .line 167
    .line 168
    :cond_a
    move v0, v8

    .line 169
    goto :goto_1

    .line 170
    :cond_b
    check-cast v1, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$WriteEdit;

    .line 171
    .line 172
    invoke-virtual {v1, v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$WriteEdit;->setHighlighter(Z)V

    .line 173
    .line 174
    .line 175
    if-eqz v3, :cond_c

    .line 176
    .line 177
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 178
    .line 179
    .line 180
    move-result p1

    .line 181
    invoke-virtual {v1, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$WriteEdit;->setColor(I)V

    .line 182
    .line 183
    .line 184
    :cond_c
    if-eqz v4, :cond_d

    .line 185
    .line 186
    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    .line 187
    .line 188
    .line 189
    move-result p1

    .line 190
    invoke-virtual {v1, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$WriteEdit;->setWidth(F)V

    .line 191
    .line 192
    .line 193
    :cond_d
    return-void
.end method

.method public updateFunctionRectF()V
    .locals 13

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getFunctionRectF()Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getWriteEdit()Landroid/graphics/RectF;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectFunctionRectF()Landroid/graphics/RectF;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    iget v2, v2, Landroid/graphics/RectF;->left:F

    .line 14
    .line 15
    iget-object v3, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->funcRelativeRectFList:Ljava/util/ArrayList;

    .line 16
    .line 17
    const/4 v4, 0x0

    .line 18
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    check-cast v3, Landroid/graphics/RectF;

    .line 23
    .line 24
    iget v3, v3, Landroid/graphics/RectF;->left:F

    .line 25
    .line 26
    add-float/2addr v2, v3

    .line 27
    const/high16 v3, 0x41700000    # 15.0f

    .line 28
    .line 29
    sub-float/2addr v2, v3

    .line 30
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectFunctionRectF()Landroid/graphics/RectF;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    iget v5, v5, Landroid/graphics/RectF;->top:F

    .line 35
    .line 36
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectFunctionRectF()Landroid/graphics/RectF;

    .line 37
    .line 38
    .line 39
    move-result-object v6

    .line 40
    iget v6, v6, Landroid/graphics/RectF;->left:F

    .line 41
    .line 42
    iget-object v7, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->funcRelativeRectFList:Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v7

    .line 48
    check-cast v7, Landroid/graphics/RectF;

    .line 49
    .line 50
    iget v7, v7, Landroid/graphics/RectF;->right:F

    .line 51
    .line 52
    add-float/2addr v6, v7

    .line 53
    add-float/2addr v6, v3

    .line 54
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectFunctionRectF()Landroid/graphics/RectF;

    .line 55
    .line 56
    .line 57
    move-result-object v7

    .line 58
    iget v7, v7, Landroid/graphics/RectF;->top:F

    .line 59
    .line 60
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 61
    .line 62
    .line 63
    move-result-object v8

    .line 64
    invoke-virtual {v8}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectButtonHeight()F

    .line 65
    .line 66
    .line 67
    move-result v8

    .line 68
    add-float/2addr v7, v8

    .line 69
    invoke-virtual {v1, v2, v5, v6, v7}, Landroid/graphics/RectF;->set(FFFF)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getDelete()Landroid/graphics/RectF;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectFunctionRectF()Landroid/graphics/RectF;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    iget v2, v2, Landroid/graphics/RectF;->left:F

    .line 81
    .line 82
    iget-object v5, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->funcRelativeRectFList:Ljava/util/ArrayList;

    .line 83
    .line 84
    const/4 v6, 0x1

    .line 85
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v5

    .line 89
    check-cast v5, Landroid/graphics/RectF;

    .line 90
    .line 91
    iget v5, v5, Landroid/graphics/RectF;->left:F

    .line 92
    .line 93
    add-float/2addr v2, v5

    .line 94
    sub-float/2addr v2, v3

    .line 95
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectFunctionRectF()Landroid/graphics/RectF;

    .line 96
    .line 97
    .line 98
    move-result-object v5

    .line 99
    iget v5, v5, Landroid/graphics/RectF;->top:F

    .line 100
    .line 101
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectFunctionRectF()Landroid/graphics/RectF;

    .line 102
    .line 103
    .line 104
    move-result-object v7

    .line 105
    iget v7, v7, Landroid/graphics/RectF;->left:F

    .line 106
    .line 107
    iget-object v8, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->funcRelativeRectFList:Ljava/util/ArrayList;

    .line 108
    .line 109
    invoke-virtual {v8, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v6

    .line 113
    check-cast v6, Landroid/graphics/RectF;

    .line 114
    .line 115
    iget v6, v6, Landroid/graphics/RectF;->right:F

    .line 116
    .line 117
    add-float/2addr v7, v6

    .line 118
    add-float/2addr v7, v3

    .line 119
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectFunctionRectF()Landroid/graphics/RectF;

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    iget v3, v3, Landroid/graphics/RectF;->top:F

    .line 124
    .line 125
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 126
    .line 127
    .line 128
    move-result-object v6

    .line 129
    invoke-virtual {v6}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectButtonHeight()F

    .line 130
    .line 131
    .line 132
    move-result v6

    .line 133
    add-float/2addr v3, v6

    .line 134
    invoke-virtual {v1, v2, v5, v7, v3}, Landroid/graphics/RectF;->set(FFFF)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getWriteStrokeWidthList()Ljava/util/ArrayList;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 142
    .line 143
    .line 144
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->strokeWidthPointFList:Ljava/util/ArrayList;

    .line 145
    .line 146
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 151
    .line 152
    .line 153
    move-result v2

    .line 154
    const/4 v3, 0x2

    .line 155
    const/high16 v5, 0x41500000    # 13.0f

    .line 156
    .line 157
    if-eqz v2, :cond_1

    .line 158
    .line 159
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    add-int/lit8 v6, v4, 0x1

    .line 164
    .line 165
    if-gez v4, :cond_0

    .line 166
    .line 167
    invoke-static {}, Li7/v;->w()V

    .line 168
    .line 169
    .line 170
    :cond_0
    check-cast v2, Landroid/graphics/PointF;

    .line 171
    .line 172
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getWriteStrokeWidthList()Ljava/util/ArrayList;

    .line 173
    .line 174
    .line 175
    move-result-object v7

    .line 176
    new-instance v8, Landroid/graphics/RectF;

    .line 177
    .line 178
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectFunctionRectF()Landroid/graphics/RectF;

    .line 179
    .line 180
    .line 181
    move-result-object v9

    .line 182
    iget v9, v9, Landroid/graphics/RectF;->left:F

    .line 183
    .line 184
    iget v10, v2, Landroid/graphics/PointF;->x:F

    .line 185
    .line 186
    add-float/2addr v9, v10

    .line 187
    int-to-float v4, v4

    .line 188
    const/high16 v10, 0x40400000    # 3.0f

    .line 189
    .line 190
    mul-float/2addr v4, v10

    .line 191
    const/high16 v10, 0x41000000    # 8.0f

    .line 192
    .line 193
    add-float/2addr v4, v10

    .line 194
    int-to-float v3, v3

    .line 195
    div-float/2addr v4, v3

    .line 196
    sub-float/2addr v9, v4

    .line 197
    const/high16 v10, 0x41980000    # 19.0f

    .line 198
    .line 199
    sub-float/2addr v9, v10

    .line 200
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectFunctionRectF()Landroid/graphics/RectF;

    .line 201
    .line 202
    .line 203
    move-result-object v11

    .line 204
    iget v11, v11, Landroid/graphics/RectF;->top:F

    .line 205
    .line 206
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 207
    .line 208
    .line 209
    move-result-object v12

    .line 210
    invoke-virtual {v12}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectButtonHeight()F

    .line 211
    .line 212
    .line 213
    move-result v12

    .line 214
    add-float/2addr v11, v12

    .line 215
    add-float/2addr v11, v5

    .line 216
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectFunctionRectF()Landroid/graphics/RectF;

    .line 217
    .line 218
    .line 219
    move-result-object v12

    .line 220
    iget v12, v12, Landroid/graphics/RectF;->left:F

    .line 221
    .line 222
    iget v2, v2, Landroid/graphics/PointF;->x:F

    .line 223
    .line 224
    add-float/2addr v12, v2

    .line 225
    add-float/2addr v12, v4

    .line 226
    add-float/2addr v12, v10

    .line 227
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectFunctionRectF()Landroid/graphics/RectF;

    .line 228
    .line 229
    .line 230
    move-result-object v2

    .line 231
    iget v2, v2, Landroid/graphics/RectF;->top:F

    .line 232
    .line 233
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 234
    .line 235
    .line 236
    move-result-object v4

    .line 237
    invoke-virtual {v4}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectButtonHeight()F

    .line 238
    .line 239
    .line 240
    move-result v4

    .line 241
    mul-float/2addr v4, v3

    .line 242
    add-float/2addr v2, v4

    .line 243
    add-float/2addr v2, v5

    .line 244
    invoke-direct {v8, v9, v11, v12, v2}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 248
    .line 249
    .line 250
    move v4, v6

    .line 251
    goto :goto_0

    .line 252
    :cond_1
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getColorList()Ljava/util/ArrayList;

    .line 253
    .line 254
    .line 255
    move-result-object v1

    .line 256
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 257
    .line 258
    .line 259
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->colorRectFList:Ljava/util/ArrayList;

    .line 260
    .line 261
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 262
    .line 263
    .line 264
    move-result-object v1

    .line 265
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 266
    .line 267
    .line 268
    move-result v2

    .line 269
    if-eqz v2, :cond_2

    .line 270
    .line 271
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v2

    .line 275
    check-cast v2, Landroid/graphics/RectF;

    .line 276
    .line 277
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getColorList()Ljava/util/ArrayList;

    .line 278
    .line 279
    .line 280
    move-result-object v4

    .line 281
    new-instance v6, Landroid/graphics/RectF;

    .line 282
    .line 283
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectFunctionRectF()Landroid/graphics/RectF;

    .line 284
    .line 285
    .line 286
    move-result-object v7

    .line 287
    iget v7, v7, Landroid/graphics/RectF;->left:F

    .line 288
    .line 289
    iget v8, v2, Landroid/graphics/RectF;->left:F

    .line 290
    .line 291
    add-float/2addr v7, v8

    .line 292
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectFunctionRectF()Landroid/graphics/RectF;

    .line 293
    .line 294
    .line 295
    move-result-object v8

    .line 296
    iget v8, v8, Landroid/graphics/RectF;->top:F

    .line 297
    .line 298
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 299
    .line 300
    .line 301
    move-result-object v9

    .line 302
    invoke-virtual {v9}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectButtonHeight()F

    .line 303
    .line 304
    .line 305
    move-result v9

    .line 306
    add-float/2addr v9, v5

    .line 307
    int-to-float v10, v3

    .line 308
    mul-float/2addr v9, v10

    .line 309
    add-float/2addr v8, v9

    .line 310
    iget v9, v2, Landroid/graphics/RectF;->top:F

    .line 311
    .line 312
    add-float/2addr v8, v9

    .line 313
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectFunctionRectF()Landroid/graphics/RectF;

    .line 314
    .line 315
    .line 316
    move-result-object v9

    .line 317
    iget v9, v9, Landroid/graphics/RectF;->left:F

    .line 318
    .line 319
    iget v11, v2, Landroid/graphics/RectF;->right:F

    .line 320
    .line 321
    add-float/2addr v9, v11

    .line 322
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectFunctionRectF()Landroid/graphics/RectF;

    .line 323
    .line 324
    .line 325
    move-result-object v11

    .line 326
    iget v11, v11, Landroid/graphics/RectF;->top:F

    .line 327
    .line 328
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 329
    .line 330
    .line 331
    move-result-object v12

    .line 332
    invoke-virtual {v12}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectButtonHeight()F

    .line 333
    .line 334
    .line 335
    move-result v12

    .line 336
    add-float/2addr v12, v5

    .line 337
    mul-float/2addr v12, v10

    .line 338
    add-float/2addr v11, v12

    .line 339
    iget v2, v2, Landroid/graphics/RectF;->bottom:F

    .line 340
    .line 341
    add-float/2addr v11, v2

    .line 342
    invoke-direct {v6, v7, v8, v9, v11}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 343
    .line 344
    .line 345
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 346
    .line 347
    .line 348
    goto :goto_1

    .line 349
    :cond_2
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->isDirectionLeft()Z

    .line 350
    .line 351
    .line 352
    move-result v1

    .line 353
    if-nez v1, :cond_4

    .line 354
    .line 355
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getDelete()Landroid/graphics/RectF;

    .line 356
    .line 357
    .line 358
    move-result-object v1

    .line 359
    iget v1, v1, Landroid/graphics/RectF;->right:F

    .line 360
    .line 361
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getWriteEdit()Landroid/graphics/RectF;

    .line 362
    .line 363
    .line 364
    move-result-object v2

    .line 365
    iget v2, v2, Landroid/graphics/RectF;->left:F

    .line 366
    .line 367
    sub-float/2addr v1, v2

    .line 368
    const/high16 v2, 0x41800000    # 16.0f

    .line 369
    .line 370
    add-float/2addr v1, v2

    .line 371
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getWriteEdit()Landroid/graphics/RectF;

    .line 372
    .line 373
    .line 374
    move-result-object v2

    .line 375
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectFunctionRectF()Landroid/graphics/RectF;

    .line 376
    .line 377
    .line 378
    move-result-object v3

    .line 379
    invoke-virtual {v3}, Landroid/graphics/RectF;->width()F

    .line 380
    .line 381
    .line 382
    move-result v3

    .line 383
    sub-float/2addr v3, v1

    .line 384
    const/4 v4, 0x0

    .line 385
    invoke-virtual {v2, v3, v4}, Landroid/graphics/RectF;->offset(FF)V

    .line 386
    .line 387
    .line 388
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getDelete()Landroid/graphics/RectF;

    .line 389
    .line 390
    .line 391
    move-result-object v2

    .line 392
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectFunctionRectF()Landroid/graphics/RectF;

    .line 393
    .line 394
    .line 395
    move-result-object v3

    .line 396
    invoke-virtual {v3}, Landroid/graphics/RectF;->width()F

    .line 397
    .line 398
    .line 399
    move-result v3

    .line 400
    sub-float/2addr v3, v1

    .line 401
    invoke-virtual {v2, v3, v4}, Landroid/graphics/RectF;->offset(FF)V

    .line 402
    .line 403
    .line 404
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getWriteStrokeWidthList()Ljava/util/ArrayList;

    .line 405
    .line 406
    .line 407
    move-result-object v1

    .line 408
    invoke-static {v1}, Li7/f0;->x0(Ljava/util/List;)Ljava/lang/Object;

    .line 409
    .line 410
    .line 411
    move-result-object v1

    .line 412
    check-cast v1, Landroid/graphics/RectF;

    .line 413
    .line 414
    iget v1, v1, Landroid/graphics/RectF;->right:F

    .line 415
    .line 416
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getWriteStrokeWidthList()Ljava/util/ArrayList;

    .line 417
    .line 418
    .line 419
    move-result-object v2

    .line 420
    invoke-static {v2}, Li7/f0;->l0(Ljava/util/List;)Ljava/lang/Object;

    .line 421
    .line 422
    .line 423
    move-result-object v2

    .line 424
    check-cast v2, Landroid/graphics/RectF;

    .line 425
    .line 426
    iget v2, v2, Landroid/graphics/RectF;->left:F

    .line 427
    .line 428
    sub-float/2addr v1, v2

    .line 429
    const/high16 v2, 0x42000000    # 32.0f

    .line 430
    .line 431
    add-float/2addr v1, v2

    .line 432
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getWriteStrokeWidthList()Ljava/util/ArrayList;

    .line 433
    .line 434
    .line 435
    move-result-object v2

    .line 436
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 437
    .line 438
    .line 439
    move-result-object v2

    .line 440
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 441
    .line 442
    .line 443
    move-result v3

    .line 444
    if-eqz v3, :cond_3

    .line 445
    .line 446
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 447
    .line 448
    .line 449
    move-result-object v3

    .line 450
    check-cast v3, Landroid/graphics/RectF;

    .line 451
    .line 452
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectFunctionRectF()Landroid/graphics/RectF;

    .line 453
    .line 454
    .line 455
    move-result-object v5

    .line 456
    invoke-virtual {v5}, Landroid/graphics/RectF;->width()F

    .line 457
    .line 458
    .line 459
    move-result v5

    .line 460
    sub-float/2addr v5, v1

    .line 461
    invoke-virtual {v3, v5, v4}, Landroid/graphics/RectF;->offset(FF)V

    .line 462
    .line 463
    .line 464
    goto :goto_2

    .line 465
    :cond_3
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getColorList()Ljava/util/ArrayList;

    .line 466
    .line 467
    .line 468
    move-result-object v1

    .line 469
    invoke-static {v1}, Li7/f0;->x0(Ljava/util/List;)Ljava/lang/Object;

    .line 470
    .line 471
    .line 472
    move-result-object v1

    .line 473
    check-cast v1, Landroid/graphics/RectF;

    .line 474
    .line 475
    iget v1, v1, Landroid/graphics/RectF;->right:F

    .line 476
    .line 477
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getColorList()Ljava/util/ArrayList;

    .line 478
    .line 479
    .line 480
    move-result-object v2

    .line 481
    invoke-static {v2}, Li7/f0;->l0(Ljava/util/List;)Ljava/lang/Object;

    .line 482
    .line 483
    .line 484
    move-result-object v2

    .line 485
    check-cast v2, Landroid/graphics/RectF;

    .line 486
    .line 487
    iget v2, v2, Landroid/graphics/RectF;->left:F

    .line 488
    .line 489
    sub-float/2addr v1, v2

    .line 490
    const/high16 v2, 0x42380000    # 46.0f

    .line 491
    .line 492
    add-float/2addr v1, v2

    .line 493
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;->getColorList()Ljava/util/ArrayList;

    .line 494
    .line 495
    .line 496
    move-result-object v0

    .line 497
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 498
    .line 499
    .line 500
    move-result-object v0

    .line 501
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 502
    .line 503
    .line 504
    move-result v2

    .line 505
    if-eqz v2, :cond_4

    .line 506
    .line 507
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 508
    .line 509
    .line 510
    move-result-object v2

    .line 511
    check-cast v2, Landroid/graphics/RectF;

    .line 512
    .line 513
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;->getSelectFunctionRectF()Landroid/graphics/RectF;

    .line 514
    .line 515
    .line 516
    move-result-object v3

    .line 517
    invoke-virtual {v3}, Landroid/graphics/RectF;->width()F

    .line 518
    .line 519
    .line 520
    move-result v3

    .line 521
    sub-float/2addr v3, v1

    .line 522
    invoke-virtual {v2, v3, v4}, Landroid/graphics/RectF;->offset(FF)V

    .line 523
    .line 524
    .line 525
    goto :goto_3

    .line 526
    :cond_4
    return-void
.end method
