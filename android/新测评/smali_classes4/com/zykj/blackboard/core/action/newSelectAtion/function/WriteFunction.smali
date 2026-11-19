.class public final Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;
.super Li4/a;
.source "SourceFile"

# interfaces
.implements Li4/f;


# instance fields
.field public u:Ljava/lang/Integer;

.field public v:Z

.field public final w:Ljava/util/ArrayList;

.field public final x:Ljava/util/ArrayList;

.field public final y:Ljava/util/ArrayList;

.field public final z:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Lg4/b;)V
    .locals 1

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Li4/a;-><init>(Lg4/b;)V

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
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->w:Ljava/util/ArrayList;

    .line 15
    .line 16
    new-instance p1, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->x:Ljava/util/ArrayList;

    .line 22
    .line 23
    new-instance p1, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->y:Ljava/util/ArrayList;

    .line 29
    .line 30
    new-instance p1, Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 33
    .line 34
    .line 35
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->z:Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-direct {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->b0()V

    .line 38
    .line 39
    .line 40
    invoke-direct {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->a0()V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method private final Y()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->w:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-static {v0}, Lh4/d;->f(Ljava/util/List;)Lh4/c$g;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Lh4/c$g;->d()Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    return-object v0
.end method

.method private final a0()V
    .locals 13

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
    invoke-virtual {p0}, Li4/a;->f()Lcom/zykj/blackboard/bean/BoardConfig;

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
    invoke-virtual {p0}, Li4/a;->f()Lcom/zykj/blackboard/bean/BoardConfig;

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
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->w:Ljava/util/ArrayList;

    .line 53
    .line 54
    new-instance v5, Ljava/util/ArrayList;

    .line 55
    .line 56
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 60
    .line 61
    .line 62
    move-result v6

    .line 63
    const/4 v7, 0x0

    .line 64
    move v8, v7

    .line 65
    :cond_0
    :goto_0
    if-ge v8, v6, :cond_1

    .line 66
    .line 67
    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v9

    .line 71
    add-int/lit8 v8, v8, 0x1

    .line 72
    .line 73
    move-object v10, v9

    .line 74
    check-cast v10, Lh4/c;

    .line 75
    .line 76
    invoke-virtual {v10}, Lh4/c;->a()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v10

    .line 80
    invoke-interface {v10}, Ljava/lang/CharSequence;->length()I

    .line 81
    .line 82
    .line 83
    move-result v10

    .line 84
    if-lez v10, :cond_0

    .line 85
    .line 86
    invoke-interface {v5, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_1
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    const/high16 v6, 0x41b80000    # 23.0f

    .line 95
    .line 96
    move v8, v7

    .line 97
    :goto_1
    if-ge v8, v1, :cond_2

    .line 98
    .line 99
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v9

    .line 103
    add-int/lit8 v8, v8, 0x1

    .line 104
    .line 105
    check-cast v9, Lh4/c;

    .line 106
    .line 107
    invoke-virtual {v9}, Lh4/c;->a()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v9

    .line 111
    invoke-virtual {v0, v9}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 112
    .line 113
    .line 114
    move-result v9

    .line 115
    iget-object v10, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->x:Ljava/util/ArrayList;

    .line 116
    .line 117
    new-instance v11, Landroid/graphics/RectF;

    .line 118
    .line 119
    add-float v12, v6, v9

    .line 120
    .line 121
    invoke-direct {v11, v6, v2, v12, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    const/high16 v10, 0x41f00000    # 30.0f

    .line 128
    .line 129
    add-float/2addr v9, v10

    .line 130
    add-float/2addr v6, v9

    .line 131
    goto :goto_1

    .line 132
    :cond_2
    invoke-virtual {p0}, Li4/a;->f()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    invoke-virtual {v0}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectWriteLevel()Ljava/util/List;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 141
    .line 142
    .line 143
    move-result v0

    .line 144
    const/high16 v1, 0x41800000    # 16.0f

    .line 145
    .line 146
    :goto_2
    if-ge v7, v0, :cond_3

    .line 147
    .line 148
    int-to-float v2, v7

    .line 149
    const/high16 v4, 0x40400000    # 3.0f

    .line 150
    .line 151
    mul-float/2addr v2, v4

    .line 152
    const/high16 v4, 0x41000000    # 8.0f

    .line 153
    .line 154
    add-float/2addr v2, v4

    .line 155
    div-float/2addr v2, v3

    .line 156
    const/high16 v4, 0x41980000    # 19.0f

    .line 157
    .line 158
    add-float/2addr v2, v4

    .line 159
    add-float/2addr v1, v2

    .line 160
    iget-object v4, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->y:Ljava/util/ArrayList;

    .line 161
    .line 162
    new-instance v5, Landroid/graphics/PointF;

    .line 163
    .line 164
    invoke-virtual {p0}, Li4/a;->f()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 165
    .line 166
    .line 167
    move-result-object v6

    .line 168
    invoke-virtual {v6}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectButtonHeight()F

    .line 169
    .line 170
    .line 171
    move-result v6

    .line 172
    div-float/2addr v6, v3

    .line 173
    invoke-direct {v5, v1, v6}, Landroid/graphics/PointF;-><init>(FF)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    add-float/2addr v1, v2

    .line 180
    add-int/lit8 v7, v7, 0x1

    .line 181
    .line 182
    goto :goto_2

    .line 183
    :cond_3
    invoke-direct {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->d0()V

    .line 184
    .line 185
    .line 186
    return-void
.end method

.method private final b0()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->w:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->w:Ljava/util/ArrayList;

    .line 7
    .line 8
    sget-object v1, Lh4/c$d;->c:Lh4/c$d;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->w:Ljava/util/ArrayList;

    .line 14
    .line 15
    sget-object v1, Lh4/c$e;->c:Lh4/c$e;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->w:Ljava/util/ArrayList;

    .line 21
    .line 22
    new-instance v1, Lh4/c$g;

    .line 23
    .line 24
    invoke-virtual {p0}, Li4/a;->f()Lcom/zykj/blackboard/bean/BoardConfig;

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
    invoke-virtual {p0}, Li4/a;->f()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    invoke-virtual {v4}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectEditColorList()Ljava/util/List;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    invoke-static {v4}, Lh4/d;->a(Ljava/util/List;)Ljava/util/List;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    invoke-direct {v1, v3, v2, v4}, Lh4/c$g;-><init>(ZFLjava/util/List;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->w:Ljava/util/ArrayList;

    .line 62
    .line 63
    sget-object v1, Lh4/c$a;->c:Lh4/c$a;

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    return-void
.end method

.method private final d0()V
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->z:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Li4/a;->f()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectButtonHeight()F

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/high16 v1, 0x42180000    # 38.0f

    .line 15
    .line 16
    sub-float/2addr v0, v1

    .line 17
    const/4 v2, 0x2

    .line 18
    int-to-float v2, v2

    .line 19
    div-float/2addr v0, v2

    .line 20
    invoke-virtual {p0}, Li4/a;->f()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-virtual {v3}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectButtonHeight()F

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    sub-float/2addr v3, v1

    .line 29
    div-float/2addr v3, v2

    .line 30
    add-float/2addr v3, v1

    .line 31
    invoke-virtual {p0}, Li4/a;->f()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {v2}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectEditColorList()Ljava/util/List;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-static {v2}, Lh4/d;->a(Ljava/util/List;)Ljava/util/List;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    const/4 v4, 0x0

    .line 48
    :goto_0
    if-ge v4, v2, :cond_0

    .line 49
    .line 50
    iget-object v5, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->z:Ljava/util/ArrayList;

    .line 51
    .line 52
    new-instance v6, Landroid/graphics/RectF;

    .line 53
    .line 54
    const/high16 v7, 0x42740000    # 61.0f

    .line 55
    .line 56
    int-to-float v8, v4

    .line 57
    mul-float/2addr v8, v7

    .line 58
    const/high16 v7, 0x41b80000    # 23.0f

    .line 59
    .line 60
    add-float/2addr v8, v7

    .line 61
    add-float v7, v8, v1

    .line 62
    .line 63
    invoke-direct {v6, v8, v0, v7, v3}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    add-int/lit8 v4, v4, 0x1

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_0
    return-void
.end method


# virtual methods
.method public A(FF)Z
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-super/range {p0 .. p2}, Li4/a;->A(FF)Z

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
    invoke-virtual {v0}, Li4/a;->g()Lh4/b;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    instance-of v3, v1, Lh4/b$d;

    .line 16
    .line 17
    const/4 v4, 0x1

    .line 18
    if-eqz v3, :cond_3

    .line 19
    .line 20
    invoke-virtual {v0}, Li4/a;->g()Lh4/b;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    const-string v3, "null cannot be cast to non-null type com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionMode.Function"

    .line 25
    .line 26
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    check-cast v1, Lh4/b$d;

    .line 30
    .line 31
    invoke-virtual {v1}, Lh4/b$d;->a()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_2

    .line 36
    .line 37
    if-eq v1, v4, :cond_1

    .line 38
    .line 39
    goto/16 :goto_7

    .line 40
    .line 41
    :cond_1
    invoke-virtual {v0}, Li4/a;->o()Lk4/c;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v0}, Li4/a;->u()Ljava/util/ArrayList;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-interface {v1, v2}, Lk4/c;->q(Ljava/util/List;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Li4/a;->o()Lk4/c;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-interface {v1}, Lk4/c;->d()V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0}, Li4/a;->q()Lg4/b;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-virtual {v0}, Li4/a;->u()Ljava/util/ArrayList;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 68
    .line 69
    .line 70
    move-result-wide v5

    .line 71
    invoke-interface {v1, v2, v5, v6}, Lg4/b;->n(Ljava/util/List;J)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0}, Li4/a;->q()Lg4/b;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-interface {v1}, Lg4/b;->l()V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->L()V

    .line 82
    .line 83
    .line 84
    goto/16 :goto_7

    .line 85
    .line 86
    :cond_2
    iget-object v1, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->w:Ljava/util/ArrayList;

    .line 87
    .line 88
    invoke-static {v1}, Lh4/d;->f(Ljava/util/List;)Lh4/c$g;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    if-eqz v1, :cond_13

    .line 93
    .line 94
    invoke-virtual {v1}, Lh4/c;->b()Z

    .line 95
    .line 96
    .line 97
    move-result v3

    .line 98
    xor-int/2addr v3, v4

    .line 99
    invoke-virtual {v1, v3}, Lh4/c;->c(Z)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0, v2}, Li4/a;->U(Z)V

    .line 103
    .line 104
    .line 105
    goto/16 :goto_7

    .line 106
    .line 107
    :cond_3
    instance-of v3, v1, Lh4/b$k;

    .line 108
    .line 109
    if-eqz v3, :cond_a

    .line 110
    .line 111
    invoke-virtual {v0}, Li4/a;->g()Lh4/b;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    const-string v3, "null cannot be cast to non-null type com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionMode.WriteSize"

    .line 116
    .line 117
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    check-cast v1, Lh4/b$k;

    .line 121
    .line 122
    invoke-virtual {v1}, Lh4/b$k;->a()I

    .line 123
    .line 124
    .line 125
    move-result v1

    .line 126
    invoke-virtual {v0}, Li4/a;->f()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 127
    .line 128
    .line 129
    move-result-object v3

    .line 130
    iget-boolean v5, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->v:Z

    .line 131
    .line 132
    invoke-virtual {v3, v5}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectStrokeWidthList(Z)Ljava/util/List;

    .line 133
    .line 134
    .line 135
    move-result-object v3

    .line 136
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    check-cast v1, Ljava/lang/Number;

    .line 141
    .line 142
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 143
    .line 144
    .line 145
    move-result v1

    .line 146
    invoke-virtual {v0}, Li4/a;->u()Ljava/util/ArrayList;

    .line 147
    .line 148
    .line 149
    move-result-object v3

    .line 150
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 151
    .line 152
    .line 153
    move-result v5

    .line 154
    move v6, v2

    .line 155
    :cond_4
    if-ge v6, v5, :cond_7

    .line 156
    .line 157
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v7

    .line 161
    add-int/lit8 v6, v6, 0x1

    .line 162
    .line 163
    check-cast v7, Lq4/c;

    .line 164
    .line 165
    invoke-interface {v7}, Lq4/c;->f()Ljava/util/List;

    .line 166
    .line 167
    .line 168
    move-result-object v8

    .line 169
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 170
    .line 171
    .line 172
    move-result-object v8

    .line 173
    :cond_5
    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 174
    .line 175
    .line 176
    move-result v9

    .line 177
    if-eqz v9, :cond_4

    .line 178
    .line 179
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v9

    .line 183
    move-object v11, v9

    .line 184
    check-cast v11, Lq4/c;

    .line 185
    .line 186
    instance-of v9, v11, Lt4/c;

    .line 187
    .line 188
    if-eqz v9, :cond_6

    .line 189
    .line 190
    move-object v9, v11

    .line 191
    check-cast v9, Lt4/c;

    .line 192
    .line 193
    invoke-virtual {v9}, Lt4/c;->z()Landroid/graphics/Paint;

    .line 194
    .line 195
    .line 196
    move-result-object v9

    .line 197
    if-eqz v9, :cond_6

    .line 198
    .line 199
    invoke-virtual {v9, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v0}, Li4/a;->q()Lg4/b;

    .line 203
    .line 204
    .line 205
    move-result-object v10

    .line 206
    sget-object v12, Lcom/zykj/board/EzyGraphEnum$GraphEnum;->e:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    .line 207
    .line 208
    new-instance v15, Landroid/graphics/Paint;

    .line 209
    .line 210
    invoke-direct {v15, v9}, Landroid/graphics/Paint;-><init>(Landroid/graphics/Paint;)V

    .line 211
    .line 212
    .line 213
    const/16 v19, 0xec

    .line 214
    .line 215
    const/16 v20, 0x0

    .line 216
    .line 217
    const/4 v13, 0x0

    .line 218
    const/4 v14, 0x0

    .line 219
    const/16 v16, 0x0

    .line 220
    .line 221
    const/16 v17, 0x0

    .line 222
    .line 223
    const/16 v18, 0x0

    .line 224
    .line 225
    invoke-static/range {v10 .. v20}, Lg4/b$a;->a(Lg4/b;Lq4/c;Lcom/zykj/board/EzyGraphEnum$GraphEnum;Landroid/graphics/RectF;Ljava/lang/String;Landroid/graphics/Paint;Ljava/util/List;Landroid/graphics/Matrix;Ljava/lang/String;ILjava/lang/Object;)V

    .line 226
    .line 227
    .line 228
    :cond_6
    instance-of v9, v7, Lr4/c;

    .line 229
    .line 230
    if-eqz v9, :cond_5

    .line 231
    .line 232
    move-object v9, v7

    .line 233
    check-cast v9, Lr4/c;

    .line 234
    .line 235
    invoke-interface {v9, v4}, Lr4/c;->l(Z)V

    .line 236
    .line 237
    .line 238
    goto :goto_0

    .line 239
    :cond_7
    new-instance v3, Ljava/lang/StringBuilder;

    .line 240
    .line 241
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 242
    .line 243
    .line 244
    const-string v5, "WriteFunction:WriteSize -> size:"

    .line 245
    .line 246
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 247
    .line 248
    .line 249
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 250
    .line 251
    .line 252
    const-string v5, " list: "

    .line 253
    .line 254
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 255
    .line 256
    .line 257
    invoke-virtual {v0}, Li4/a;->u()Ljava/util/ArrayList;

    .line 258
    .line 259
    .line 260
    move-result-object v5

    .line 261
    new-instance v6, Ljava/util/ArrayList;

    .line 262
    .line 263
    const/16 v7, 0xa

    .line 264
    .line 265
    invoke-static {v5, v7}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 266
    .line 267
    .line 268
    move-result v7

    .line 269
    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 273
    .line 274
    .line 275
    move-result v7

    .line 276
    move v8, v2

    .line 277
    :goto_1
    if-ge v8, v7, :cond_8

    .line 278
    .line 279
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object v9

    .line 283
    add-int/lit8 v8, v8, 0x1

    .line 284
    .line 285
    check-cast v9, Lq4/c;

    .line 286
    .line 287
    invoke-interface {v9}, Lq4/c;->getId()Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object v9

    .line 291
    invoke-interface {v6, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 292
    .line 293
    .line 294
    goto :goto_1

    .line 295
    :cond_8
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 296
    .line 297
    .line 298
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    move-result-object v3

    .line 302
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object v3

    .line 306
    invoke-static {v3}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 307
    .line 308
    .line 309
    invoke-virtual {v0}, Li4/a;->o()Lk4/c;

    .line 310
    .line 311
    .line 312
    move-result-object v3

    .line 313
    invoke-interface {v3}, Lk4/c;->e()V

    .line 314
    .line 315
    .line 316
    invoke-virtual {v0}, Li4/a;->q()Lg4/b;

    .line 317
    .line 318
    .line 319
    move-result-object v3

    .line 320
    invoke-interface {v3}, Lg4/b;->l()V

    .line 321
    .line 322
    .line 323
    iget-object v3, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->w:Ljava/util/ArrayList;

    .line 324
    .line 325
    invoke-static {v3}, Lh4/d;->f(Ljava/util/List;)Lh4/c$g;

    .line 326
    .line 327
    .line 328
    move-result-object v3

    .line 329
    if-nez v3, :cond_9

    .line 330
    .line 331
    goto :goto_2

    .line 332
    :cond_9
    invoke-virtual {v3, v1}, Lh4/c$g;->i(F)V

    .line 333
    .line 334
    .line 335
    :goto_2
    invoke-virtual {v0, v2}, Li4/a;->U(Z)V

    .line 336
    .line 337
    .line 338
    goto/16 :goto_7

    .line 339
    .line 340
    :cond_a
    instance-of v1, v1, Lh4/b$a;

    .line 341
    .line 342
    if-eqz v1, :cond_13

    .line 343
    .line 344
    invoke-virtual {v0}, Li4/a;->g()Lh4/b;

    .line 345
    .line 346
    .line 347
    move-result-object v1

    .line 348
    const-string v3, "null cannot be cast to non-null type com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionMode.Color"

    .line 349
    .line 350
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 351
    .line 352
    .line 353
    check-cast v1, Lh4/b$a;

    .line 354
    .line 355
    invoke-virtual {v1}, Lh4/b$a;->a()I

    .line 356
    .line 357
    .line 358
    move-result v1

    .line 359
    invoke-direct {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->Y()Ljava/util/List;

    .line 360
    .line 361
    .line 362
    move-result-object v3

    .line 363
    if-nez v3, :cond_b

    .line 364
    .line 365
    return v4

    .line 366
    :cond_b
    new-instance v5, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction$handleClick$changeColor$1;

    .line 367
    .line 368
    invoke-direct {v5, v0, v3}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction$handleClick$changeColor$1;-><init>(Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;Ljava/util/List;)V

    .line 369
    .line 370
    .line 371
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 372
    .line 373
    .line 374
    move-result-object v6

    .line 375
    instance-of v6, v6, Lh4/f$b;

    .line 376
    .line 377
    if-eqz v6, :cond_12

    .line 378
    .line 379
    invoke-static {v3}, Lh4/d;->c(Ljava/util/List;)Lh4/f$b;

    .line 380
    .line 381
    .line 382
    move-result-object v1

    .line 383
    if-eqz v1, :cond_d

    .line 384
    .line 385
    invoke-virtual {v1}, Lh4/f$b;->e()Z

    .line 386
    .line 387
    .line 388
    move-result v6

    .line 389
    if-ne v6, v4, :cond_d

    .line 390
    .line 391
    invoke-virtual {v1, v2}, Lh4/f$b;->f(Z)V

    .line 392
    .line 393
    .line 394
    invoke-virtual {v0}, Li4/a;->f()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 395
    .line 396
    .line 397
    move-result-object v1

    .line 398
    invoke-virtual {v1}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectCustomColorView()Ld5/a;

    .line 399
    .line 400
    .line 401
    move-result-object v1

    .line 402
    if-nez v1, :cond_c

    .line 403
    .line 404
    goto :goto_3

    .line 405
    :cond_c
    const/4 v3, 0x0

    .line 406
    invoke-interface {v1, v3}, Ld5/a;->d(Lkotlin/jvm/functions/Function1;)V

    .line 407
    .line 408
    .line 409
    :goto_3
    invoke-virtual {v0, v2}, Li4/a;->U(Z)V

    .line 410
    .line 411
    .line 412
    goto :goto_7

    .line 413
    :cond_d
    if-nez v1, :cond_e

    .line 414
    .line 415
    goto :goto_4

    .line 416
    :cond_e
    invoke-virtual {v1, v4}, Lh4/f$b;->f(Z)V

    .line 417
    .line 418
    .line 419
    :goto_4
    invoke-virtual {v0}, Li4/a;->f()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 420
    .line 421
    .line 422
    move-result-object v6

    .line 423
    invoke-virtual {v6}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectCustomColorView()Ld5/a;

    .line 424
    .line 425
    .line 426
    move-result-object v6

    .line 427
    if-nez v6, :cond_f

    .line 428
    .line 429
    goto :goto_5

    .line 430
    :cond_f
    invoke-interface {v6, v5}, Ld5/a;->d(Lkotlin/jvm/functions/Function1;)V

    .line 431
    .line 432
    .line 433
    :goto_5
    if-eqz v1, :cond_10

    .line 434
    .line 435
    invoke-virtual {v1}, Lh4/f;->a()I

    .line 436
    .line 437
    .line 438
    move-result v1

    .line 439
    goto :goto_6

    .line 440
    :cond_10
    move v1, v2

    .line 441
    :goto_6
    invoke-virtual {v0}, Li4/a;->f()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 442
    .line 443
    .line 444
    move-result-object v6

    .line 445
    invoke-virtual {v6}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectCustomColorView()Ld5/a;

    .line 446
    .line 447
    .line 448
    move-result-object v6

    .line 449
    if-eqz v6, :cond_11

    .line 450
    .line 451
    invoke-interface {v6, v1}, Ld5/a;->c(I)Z

    .line 452
    .line 453
    .line 454
    move-result v6

    .line 455
    if-ne v6, v4, :cond_11

    .line 456
    .line 457
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 458
    .line 459
    .line 460
    move-result-object v1

    .line 461
    invoke-interface {v5, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 462
    .line 463
    .line 464
    goto :goto_7

    .line 465
    :cond_11
    invoke-static {v3}, Lh4/d;->h(Ljava/util/List;)V

    .line 466
    .line 467
    .line 468
    invoke-virtual {v0, v2}, Li4/a;->U(Z)V

    .line 469
    .line 470
    .line 471
    goto :goto_7

    .line 472
    :cond_12
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 473
    .line 474
    .line 475
    move-result-object v1

    .line 476
    check-cast v1, Lh4/f;

    .line 477
    .line 478
    invoke-virtual {v1}, Lh4/f;->a()I

    .line 479
    .line 480
    .line 481
    move-result v1

    .line 482
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 483
    .line 484
    .line 485
    move-result-object v1

    .line 486
    invoke-interface {v5, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 487
    .line 488
    .line 489
    :cond_13
    :goto_7
    return v4
.end method

.method public J(FF)Z
    .locals 11

    .line 1
    invoke-virtual {p0}, Li4/a;->m()Li4/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Li4/e;->i()Landroid/graphics/RectF;

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
    new-instance p1, Lh4/b$d;

    .line 18
    .line 19
    invoke-direct {p1, v1}, Lh4/b$d;-><init>(I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, p1}, Li4/a;->M(Lh4/b;)V

    .line 23
    .line 24
    .line 25
    return v2

    .line 26
    :cond_0
    invoke-virtual {p0}, Li4/a;->m()Li4/e;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0}, Li4/e;->c()Landroid/graphics/RectF;

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
    new-instance p1, Lh4/b$d;

    .line 41
    .line 42
    invoke-direct {p1, v2}, Lh4/b$d;-><init>(I)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0, p1}, Li4/a;->M(Lh4/b;)V

    .line 46
    .line 47
    .line 48
    return v2

    .line 49
    :cond_1
    invoke-virtual {p0}, Li4/a;->l()Li4/c;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {v0}, Li4/c;->c()Landroid/graphics/RectF;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {v0, p1, p2}, Landroid/graphics/RectF;->contains(FF)Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-eqz v0, :cond_2

    .line 62
    .line 63
    sget-object p1, Lh4/b$e;->a:Lh4/b$e;

    .line 64
    .line 65
    invoke-virtual {p0, p1}, Li4/a;->M(Lh4/b;)V

    .line 66
    .line 67
    .line 68
    return v2

    .line 69
    :cond_2
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->w:Ljava/util/ArrayList;

    .line 70
    .line 71
    invoke-static {v0}, Lh4/d;->f(Ljava/util/List;)Lh4/c$g;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    if-eqz v0, :cond_a

    .line 76
    .line 77
    invoke-virtual {v0}, Lh4/c;->b()Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-ne v0, v2, :cond_a

    .line 82
    .line 83
    invoke-virtual {p0}, Li4/a;->m()Li4/e;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-virtual {v0}, Li4/e;->j()Ljava/util/ArrayList;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    move v3, v1

    .line 96
    :goto_0
    if-ge v3, v0, :cond_4

    .line 97
    .line 98
    invoke-virtual {p0}, Li4/a;->m()Li4/e;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    invoke-virtual {v4}, Li4/e;->j()Ljava/util/ArrayList;

    .line 103
    .line 104
    .line 105
    move-result-object v4

    .line 106
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    check-cast v4, Landroid/graphics/RectF;

    .line 111
    .line 112
    invoke-virtual {v4, p1, p2}, Landroid/graphics/RectF;->contains(FF)Z

    .line 113
    .line 114
    .line 115
    move-result v4

    .line 116
    if-eqz v4, :cond_3

    .line 117
    .line 118
    new-instance p1, Lh4/b$k;

    .line 119
    .line 120
    invoke-direct {p1, v3}, Lh4/b$k;-><init>(I)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {p0, p1}, Li4/a;->M(Lh4/b;)V

    .line 124
    .line 125
    .line 126
    return v2

    .line 127
    :cond_3
    add-int/lit8 v3, v3, 0x1

    .line 128
    .line 129
    goto :goto_0

    .line 130
    :cond_4
    invoke-virtual {p0}, Li4/a;->l()Li4/c;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    invoke-virtual {v0}, Li4/c;->e()Landroid/graphics/RectF;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    invoke-virtual {v0, p1, p2}, Landroid/graphics/RectF;->contains(FF)Z

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    if-eqz v0, :cond_5

    .line 143
    .line 144
    sget-object p1, Lh4/b$e;->a:Lh4/b$e;

    .line 145
    .line 146
    invoke-virtual {p0, p1}, Li4/a;->M(Lh4/b;)V

    .line 147
    .line 148
    .line 149
    return v2

    .line 150
    :cond_5
    invoke-virtual {p0}, Li4/a;->m()Li4/e;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    invoke-virtual {v0}, Li4/e;->a()Ljava/util/ArrayList;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 159
    .line 160
    .line 161
    move-result v0

    .line 162
    move v3, v1

    .line 163
    :goto_1
    if-ge v3, v0, :cond_7

    .line 164
    .line 165
    invoke-virtual {p0}, Li4/a;->m()Li4/e;

    .line 166
    .line 167
    .line 168
    move-result-object v4

    .line 169
    invoke-virtual {v4}, Li4/e;->a()Ljava/util/ArrayList;

    .line 170
    .line 171
    .line 172
    move-result-object v4

    .line 173
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v4

    .line 177
    check-cast v4, Landroid/graphics/RectF;

    .line 178
    .line 179
    invoke-virtual {v4, p1, p2}, Landroid/graphics/RectF;->contains(FF)Z

    .line 180
    .line 181
    .line 182
    move-result v4

    .line 183
    if-eqz v4, :cond_6

    .line 184
    .line 185
    new-instance p1, Lh4/b$a;

    .line 186
    .line 187
    invoke-direct {p1, v3}, Lh4/b$a;-><init>(I)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {p0, p1}, Li4/a;->M(Lh4/b;)V

    .line 191
    .line 192
    .line 193
    return v2

    .line 194
    :cond_6
    add-int/lit8 v3, v3, 0x1

    .line 195
    .line 196
    goto :goto_1

    .line 197
    :cond_7
    invoke-virtual {p0}, Li4/a;->l()Li4/c;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    invoke-virtual {v0}, Li4/c;->a()Landroid/graphics/RectF;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    invoke-virtual {v0, p1, p2}, Landroid/graphics/RectF;->contains(FF)Z

    .line 206
    .line 207
    .line 208
    move-result v0

    .line 209
    if-eqz v0, :cond_8

    .line 210
    .line 211
    sget-object p1, Lh4/b$e;->a:Lh4/b$e;

    .line 212
    .line 213
    invoke-virtual {p0, p1}, Li4/a;->M(Lh4/b;)V

    .line 214
    .line 215
    .line 216
    return v2

    .line 217
    :cond_8
    invoke-direct {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->Y()Ljava/util/List;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    if-eqz v0, :cond_a

    .line 222
    .line 223
    invoke-static {v0}, Lh4/d;->c(Ljava/util/List;)Lh4/f$b;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    if-eqz v0, :cond_a

    .line 228
    .line 229
    invoke-virtual {v0}, Lh4/f$b;->e()Z

    .line 230
    .line 231
    .line 232
    move-result v0

    .line 233
    if-ne v0, v2, :cond_a

    .line 234
    .line 235
    invoke-virtual {p0}, Li4/a;->m()Li4/e;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    invoke-virtual {v0}, Li4/e;->b()Landroid/graphics/RectF;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    invoke-virtual {v0, p1, p2}, Landroid/graphics/RectF;->contains(FF)Z

    .line 244
    .line 245
    .line 246
    move-result v0

    .line 247
    if-eqz v0, :cond_9

    .line 248
    .line 249
    sget-object p1, Lh4/b$e;->a:Lh4/b$e;

    .line 250
    .line 251
    invoke-virtual {p0, p1}, Li4/a;->M(Lh4/b;)V

    .line 252
    .line 253
    .line 254
    return v2

    .line 255
    :cond_9
    invoke-virtual {p0}, Li4/a;->l()Li4/c;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    invoke-virtual {v0}, Li4/c;->b()Landroid/graphics/RectF;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    invoke-virtual {v0, p1, p2}, Landroid/graphics/RectF;->contains(FF)Z

    .line 264
    .line 265
    .line 266
    move-result v0

    .line 267
    if-eqz v0, :cond_a

    .line 268
    .line 269
    sget-object p1, Lh4/b$e;->a:Lh4/b$e;

    .line 270
    .line 271
    invoke-virtual {p0, p1}, Li4/a;->M(Lh4/b;)V

    .line 272
    .line 273
    .line 274
    return v2

    .line 275
    :cond_a
    invoke-virtual {p0}, Li4/a;->i()Landroid/graphics/Matrix;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    invoke-static {v0}, Le5/m;->b(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 280
    .line 281
    .line 282
    move-result-object v0

    .line 283
    const/4 v3, 0x2

    .line 284
    new-array v4, v3, [F

    .line 285
    .line 286
    aput p1, v4, v1

    .line 287
    .line 288
    aput p2, v4, v2

    .line 289
    .line 290
    invoke-virtual {v0, v4}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 291
    .line 292
    .line 293
    aget p1, v4, v1

    .line 294
    .line 295
    aget p2, v4, v2

    .line 296
    .line 297
    invoke-virtual {p0}, Li4/a;->f()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 298
    .line 299
    .line 300
    move-result-object v4

    .line 301
    invoke-virtual {v4}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectIconWidth()F

    .line 302
    .line 303
    .line 304
    move-result v4

    .line 305
    invoke-virtual {v0, v4}, Landroid/graphics/Matrix;->mapRadius(F)F

    .line 306
    .line 307
    .line 308
    move-result v0

    .line 309
    new-instance v4, Landroid/graphics/RectF;

    .line 310
    .line 311
    invoke-virtual {p0}, Li4/a;->v()Landroid/graphics/RectF;

    .line 312
    .line 313
    .line 314
    move-result-object v5

    .line 315
    invoke-virtual {v5}, Landroid/graphics/RectF;->centerX()F

    .line 316
    .line 317
    .line 318
    move-result v5

    .line 319
    int-to-float v3, v3

    .line 320
    div-float v6, v0, v3

    .line 321
    .line 322
    sub-float/2addr v5, v6

    .line 323
    invoke-virtual {p0}, Li4/a;->v()Landroid/graphics/RectF;

    .line 324
    .line 325
    .line 326
    move-result-object v7

    .line 327
    iget v7, v7, Landroid/graphics/RectF;->top:F

    .line 328
    .line 329
    const/4 v8, 0x5

    .line 330
    int-to-float v8, v8

    .line 331
    mul-float/2addr v8, v0

    .line 332
    div-float/2addr v8, v3

    .line 333
    sub-float/2addr v7, v8

    .line 334
    invoke-virtual {p0}, Li4/a;->v()Landroid/graphics/RectF;

    .line 335
    .line 336
    .line 337
    move-result-object v8

    .line 338
    invoke-virtual {v8}, Landroid/graphics/RectF;->centerX()F

    .line 339
    .line 340
    .line 341
    move-result v8

    .line 342
    add-float/2addr v8, v6

    .line 343
    invoke-virtual {p0}, Li4/a;->v()Landroid/graphics/RectF;

    .line 344
    .line 345
    .line 346
    move-result-object v9

    .line 347
    iget v9, v9, Landroid/graphics/RectF;->top:F

    .line 348
    .line 349
    const/4 v10, 0x3

    .line 350
    int-to-float v10, v10

    .line 351
    mul-float/2addr v0, v10

    .line 352
    div-float/2addr v0, v3

    .line 353
    sub-float/2addr v9, v0

    .line 354
    invoke-direct {v4, v5, v7, v8, v9}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 355
    .line 356
    .line 357
    invoke-virtual {v4, p1, p2}, Landroid/graphics/RectF;->contains(FF)Z

    .line 358
    .line 359
    .line 360
    move-result v0

    .line 361
    if-eqz v0, :cond_b

    .line 362
    .line 363
    sget-object p1, Lh4/b$h;->a:Lh4/b$h;

    .line 364
    .line 365
    invoke-virtual {p0, p1}, Li4/a;->M(Lh4/b;)V

    .line 366
    .line 367
    .line 368
    return v2

    .line 369
    :cond_b
    new-instance v0, Landroid/graphics/RectF;

    .line 370
    .line 371
    invoke-virtual {p0}, Li4/a;->v()Landroid/graphics/RectF;

    .line 372
    .line 373
    .line 374
    move-result-object v3

    .line 375
    iget v3, v3, Landroid/graphics/RectF;->right:F

    .line 376
    .line 377
    sub-float/2addr v3, v6

    .line 378
    invoke-virtual {p0}, Li4/a;->v()Landroid/graphics/RectF;

    .line 379
    .line 380
    .line 381
    move-result-object v4

    .line 382
    iget v4, v4, Landroid/graphics/RectF;->bottom:F

    .line 383
    .line 384
    sub-float/2addr v4, v6

    .line 385
    invoke-virtual {p0}, Li4/a;->v()Landroid/graphics/RectF;

    .line 386
    .line 387
    .line 388
    move-result-object v5

    .line 389
    iget v5, v5, Landroid/graphics/RectF;->right:F

    .line 390
    .line 391
    add-float/2addr v5, v6

    .line 392
    invoke-virtual {p0}, Li4/a;->v()Landroid/graphics/RectF;

    .line 393
    .line 394
    .line 395
    move-result-object v7

    .line 396
    iget v7, v7, Landroid/graphics/RectF;->bottom:F

    .line 397
    .line 398
    add-float/2addr v7, v6

    .line 399
    invoke-direct {v0, v3, v4, v5, v7}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 400
    .line 401
    .line 402
    invoke-virtual {v0, p1, p2}, Landroid/graphics/RectF;->contains(FF)Z

    .line 403
    .line 404
    .line 405
    move-result v0

    .line 406
    if-eqz v0, :cond_c

    .line 407
    .line 408
    sget-object p1, Lh4/b$i;->a:Lh4/b$i;

    .line 409
    .line 410
    invoke-virtual {p0, p1}, Li4/a;->M(Lh4/b;)V

    .line 411
    .line 412
    .line 413
    return v2

    .line 414
    :cond_c
    invoke-virtual {p0}, Li4/a;->v()Landroid/graphics/RectF;

    .line 415
    .line 416
    .line 417
    move-result-object v0

    .line 418
    invoke-virtual {v0, p1, p2}, Landroid/graphics/RectF;->contains(FF)Z

    .line 419
    .line 420
    .line 421
    move-result p1

    .line 422
    if-eqz p1, :cond_d

    .line 423
    .line 424
    sget-object p1, Lh4/b$b;->a:Lh4/b$b;

    .line 425
    .line 426
    invoke-virtual {p0, p1}, Li4/a;->M(Lh4/b;)V

    .line 427
    .line 428
    .line 429
    return v2

    .line 430
    :cond_d
    sget-object p1, Lh4/b$g;->a:Lh4/b$g;

    .line 431
    .line 432
    invoke-virtual {p0, p1}, Li4/a;->M(Lh4/b;)V

    .line 433
    .line 434
    .line 435
    return v1
.end method

.method public L()V
    .locals 2

    .line 1
    invoke-super {p0}, Li4/a;->L()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->b0()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Li4/a;->f()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectCustomColorView()Ld5/a;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const/4 v1, 0x0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-interface {v0, v1}, Ld5/a;->d(Lkotlin/jvm/functions/Function1;)V

    .line 20
    .line 21
    .line 22
    :goto_0
    invoke-virtual {p0, v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->f0(Ljava/lang/Integer;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public P(Ljava/util/List;)V
    .locals 14

    .line 1
    const-string v0, "graphList"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Li4/a;->P(Ljava/util/List;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->w:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-static {v0}, Lh4/d;->f(Ljava/util/List;)Lh4/c$g;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_1e

    .line 16
    .line 17
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const/4 v1, 0x0

    .line 22
    const/4 v2, 0x1

    .line 23
    move-object v4, v1

    .line 24
    move-object v5, v4

    .line 25
    move v3, v2

    .line 26
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v6

    .line 30
    const/4 v7, 0x0

    .line 31
    if-eqz v6, :cond_9

    .line 32
    .line 33
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v6

    .line 37
    check-cast v6, Lq4/c;

    .line 38
    .line 39
    invoke-interface {v6}, Lq4/c;->f()Ljava/util/List;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object v6

    .line 47
    :cond_1
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v8

    .line 51
    if-eqz v8, :cond_0

    .line 52
    .line 53
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v8

    .line 57
    check-cast v8, Lq4/c;

    .line 58
    .line 59
    instance-of v9, v8, Lt4/c;

    .line 60
    .line 61
    if-eqz v9, :cond_8

    .line 62
    .line 63
    check-cast v8, Lt4/c;

    .line 64
    .line 65
    invoke-virtual {v8}, Lt4/c;->z()Landroid/graphics/Paint;

    .line 66
    .line 67
    .line 68
    move-result-object v8

    .line 69
    if-eqz v8, :cond_7

    .line 70
    .line 71
    if-nez v5, :cond_2

    .line 72
    .line 73
    invoke-virtual {v8}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    invoke-virtual {v8}, Landroid/graphics/Paint;->getColor()I

    .line 82
    .line 83
    .line 84
    move-result v5

    .line 85
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 86
    .line 87
    .line 88
    move-result-object v5

    .line 89
    move-object v13, v5

    .line 90
    move-object v5, v4

    .line 91
    move-object v4, v13

    .line 92
    goto :goto_2

    .line 93
    :cond_2
    invoke-virtual {v8}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 94
    .line 95
    .line 96
    move-result v9

    .line 97
    invoke-static {v5, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Float;F)Z

    .line 98
    .line 99
    .line 100
    move-result v9

    .line 101
    if-nez v9, :cond_3

    .line 102
    .line 103
    const/high16 v5, -0x40800000    # -1.0f

    .line 104
    .line 105
    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 106
    .line 107
    .line 108
    move-result-object v5

    .line 109
    :cond_3
    invoke-virtual {v8}, Landroid/graphics/Paint;->getColor()I

    .line 110
    .line 111
    .line 112
    move-result v9

    .line 113
    if-nez v4, :cond_4

    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_4
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 117
    .line 118
    .line 119
    move-result v10

    .line 120
    if-eq v10, v9, :cond_5

    .line 121
    .line 122
    :goto_1
    move-object v4, v1

    .line 123
    :cond_5
    :goto_2
    invoke-virtual {v8}, Landroid/graphics/Paint;->getColor()I

    .line 124
    .line 125
    .line 126
    move-result v8

    .line 127
    invoke-static {v8}, Landroid/graphics/Color;->alpha(I)I

    .line 128
    .line 129
    .line 130
    move-result v8

    .line 131
    const/16 v9, 0xff

    .line 132
    .line 133
    if-ne v8, v9, :cond_6

    .line 134
    .line 135
    move v3, v7

    .line 136
    :cond_6
    sget-object v8, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 137
    .line 138
    goto :goto_3

    .line 139
    :cond_7
    move-object v8, v1

    .line 140
    :goto_3
    if-nez v8, :cond_1

    .line 141
    .line 142
    :cond_8
    move v3, v7

    .line 143
    goto :goto_0

    .line 144
    :cond_9
    invoke-virtual {v0, v3}, Lh4/c$g;->h(Z)V

    .line 145
    .line 146
    .line 147
    if-eqz v4, :cond_a

    .line 148
    .line 149
    sget-object p1, Le5/e;->a:Le5/e;

    .line 150
    .line 151
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 152
    .line 153
    .line 154
    move-result v3

    .line 155
    invoke-virtual {p1, v3}, Le5/e;->b(I)I

    .line 156
    .line 157
    .line 158
    move-result p1

    .line 159
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    goto :goto_4

    .line 164
    :cond_a
    move-object p1, v1

    .line 165
    :goto_4
    invoke-virtual {p0}, Li4/a;->f()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 166
    .line 167
    .line 168
    move-result-object v3

    .line 169
    invoke-virtual {v3}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectEditColorList()Ljava/util/List;

    .line 170
    .line 171
    .line 172
    move-result-object v3

    .line 173
    invoke-static {v3}, Lh4/d;->a(Ljava/util/List;)Ljava/util/List;

    .line 174
    .line 175
    .line 176
    move-result-object v3

    .line 177
    new-instance v4, Ljava/util/ArrayList;

    .line 178
    .line 179
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 180
    .line 181
    .line 182
    const/4 v6, -0x1

    .line 183
    if-nez p1, :cond_c

    .line 184
    .line 185
    :cond_b
    move v9, v6

    .line 186
    goto :goto_6

    .line 187
    :cond_c
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 188
    .line 189
    .line 190
    move-result-object v8

    .line 191
    move v9, v7

    .line 192
    :goto_5
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 193
    .line 194
    .line 195
    move-result v10

    .line 196
    if-eqz v10, :cond_b

    .line 197
    .line 198
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v10

    .line 202
    check-cast v10, Lh4/f;

    .line 203
    .line 204
    instance-of v11, v10, Lh4/f$b;

    .line 205
    .line 206
    if-nez v11, :cond_d

    .line 207
    .line 208
    invoke-virtual {v10}, Lh4/f;->a()I

    .line 209
    .line 210
    .line 211
    move-result v10

    .line 212
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 213
    .line 214
    .line 215
    move-result v11

    .line 216
    if-ne v10, v11, :cond_d

    .line 217
    .line 218
    goto :goto_6

    .line 219
    :cond_d
    add-int/lit8 v9, v9, 0x1

    .line 220
    .line 221
    goto :goto_5

    .line 222
    :goto_6
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 223
    .line 224
    .line 225
    move-result-object v3

    .line 226
    move v8, v7

    .line 227
    :goto_7
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 228
    .line 229
    .line 230
    move-result v10

    .line 231
    if-eqz v10, :cond_1b

    .line 232
    .line 233
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v10

    .line 237
    add-int/lit8 v11, v8, 0x1

    .line 238
    .line 239
    if-gez v8, :cond_e

    .line 240
    .line 241
    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    .line 242
    .line 243
    .line 244
    :cond_e
    check-cast v10, Lh4/f;

    .line 245
    .line 246
    instance-of v12, v10, Lh4/f$b;

    .line 247
    .line 248
    if-eqz v12, :cond_12

    .line 249
    .line 250
    if-eqz p1, :cond_10

    .line 251
    .line 252
    if-ne v9, v6, :cond_10

    .line 253
    .line 254
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 255
    .line 256
    .line 257
    move-result v8

    .line 258
    invoke-virtual {p0}, Li4/a;->f()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 259
    .line 260
    .line 261
    move-result-object v10

    .line 262
    invoke-virtual {v10}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectCustomColorView()Ld5/a;

    .line 263
    .line 264
    .line 265
    move-result-object v10

    .line 266
    if-eqz v10, :cond_f

    .line 267
    .line 268
    invoke-interface {v10, v8}, Ld5/a;->c(I)Z

    .line 269
    .line 270
    .line 271
    move-result v8

    .line 272
    goto :goto_8

    .line 273
    :cond_f
    move v8, v7

    .line 274
    :goto_8
    if-eqz v8, :cond_10

    .line 275
    .line 276
    move v8, v2

    .line 277
    goto :goto_9

    .line 278
    :cond_10
    move v8, v7

    .line 279
    :goto_9
    new-instance v10, Lh4/f$b;

    .line 280
    .line 281
    if-eqz v8, :cond_11

    .line 282
    .line 283
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 284
    .line 285
    .line 286
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 287
    .line 288
    .line 289
    move-result v12

    .line 290
    goto :goto_a

    .line 291
    :cond_11
    move v12, v7

    .line 292
    :goto_a
    invoke-direct {v10, v12, v8, v7}, Lh4/f$b;-><init>(IZZ)V

    .line 293
    .line 294
    .line 295
    goto :goto_f

    .line 296
    :cond_12
    instance-of v12, v10, Lh4/f$a;

    .line 297
    .line 298
    if-eqz v12, :cond_14

    .line 299
    .line 300
    new-instance v10, Lh4/f$a;

    .line 301
    .line 302
    if-ne v8, v9, :cond_13

    .line 303
    .line 304
    move v8, v2

    .line 305
    goto :goto_b

    .line 306
    :cond_13
    move v8, v7

    .line 307
    :goto_b
    invoke-direct {v10, v8}, Lh4/f$a;-><init>(Z)V

    .line 308
    .line 309
    .line 310
    goto :goto_f

    .line 311
    :cond_14
    instance-of v12, v10, Lh4/f$e;

    .line 312
    .line 313
    if-eqz v12, :cond_16

    .line 314
    .line 315
    new-instance v10, Lh4/f$e;

    .line 316
    .line 317
    if-ne v8, v9, :cond_15

    .line 318
    .line 319
    move v8, v2

    .line 320
    goto :goto_c

    .line 321
    :cond_15
    move v8, v7

    .line 322
    :goto_c
    invoke-direct {v10, v8}, Lh4/f$e;-><init>(Z)V

    .line 323
    .line 324
    .line 325
    goto :goto_f

    .line 326
    :cond_16
    instance-of v12, v10, Lh4/f$d;

    .line 327
    .line 328
    if-eqz v12, :cond_18

    .line 329
    .line 330
    new-instance v10, Lh4/f$d;

    .line 331
    .line 332
    if-ne v8, v9, :cond_17

    .line 333
    .line 334
    move v8, v2

    .line 335
    goto :goto_d

    .line 336
    :cond_17
    move v8, v7

    .line 337
    :goto_d
    invoke-direct {v10, v8}, Lh4/f$d;-><init>(Z)V

    .line 338
    .line 339
    .line 340
    goto :goto_f

    .line 341
    :cond_18
    instance-of v12, v10, Lh4/f$c;

    .line 342
    .line 343
    if-eqz v12, :cond_1a

    .line 344
    .line 345
    new-instance v12, Lh4/f$c;

    .line 346
    .line 347
    invoke-virtual {v10}, Lh4/f;->a()I

    .line 348
    .line 349
    .line 350
    move-result v10

    .line 351
    if-ne v8, v9, :cond_19

    .line 352
    .line 353
    move v8, v2

    .line 354
    goto :goto_e

    .line 355
    :cond_19
    move v8, v7

    .line 356
    :goto_e
    invoke-direct {v12, v10, v8}, Lh4/f$c;-><init>(IZ)V

    .line 357
    .line 358
    .line 359
    move-object v10, v12

    .line 360
    :goto_f
    invoke-interface {v4, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 361
    .line 362
    .line 363
    move v8, v11

    .line 364
    goto/16 :goto_7

    .line 365
    .line 366
    :cond_1a
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 367
    .line 368
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 369
    .line 370
    .line 371
    throw p1

    .line 372
    :cond_1b
    invoke-virtual {v0, v4}, Lh4/c$g;->g(Ljava/util/List;)V

    .line 373
    .line 374
    .line 375
    invoke-virtual {p0}, Li4/a;->f()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 376
    .line 377
    .line 378
    move-result-object p1

    .line 379
    invoke-virtual {p1}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectCustomColorView()Ld5/a;

    .line 380
    .line 381
    .line 382
    move-result-object p1

    .line 383
    if-eqz p1, :cond_1d

    .line 384
    .line 385
    invoke-virtual {v0}, Lh4/c$g;->d()Ljava/util/List;

    .line 386
    .line 387
    .line 388
    move-result-object v2

    .line 389
    invoke-static {v2}, Lh4/d;->c(Ljava/util/List;)Lh4/f$b;

    .line 390
    .line 391
    .line 392
    move-result-object v2

    .line 393
    if-eqz v2, :cond_1c

    .line 394
    .line 395
    invoke-virtual {v2}, Lh4/f;->a()I

    .line 396
    .line 397
    .line 398
    move-result v1

    .line 399
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 400
    .line 401
    .line 402
    move-result-object v1

    .line 403
    :cond_1c
    invoke-interface {p1, v1}, Ld5/a;->a(Ljava/lang/Integer;)V

    .line 404
    .line 405
    .line 406
    :cond_1d
    invoke-direct {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->d0()V

    .line 407
    .line 408
    .line 409
    if-eqz v5, :cond_1e

    .line 410
    .line 411
    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    .line 412
    .line 413
    .line 414
    move-result p1

    .line 415
    invoke-virtual {v0, p1}, Lh4/c$g;->i(F)V

    .line 416
    .line 417
    .line 418
    :cond_1e
    return-void
.end method

.method public X()V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Li4/a;->m()Li4/e;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Li4/e;->i()Landroid/graphics/RectF;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-virtual {v0}, Li4/a;->t()Landroid/graphics/RectF;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    iget v3, v3, Landroid/graphics/RectF;->left:F

    .line 16
    .line 17
    iget-object v4, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->x:Ljava/util/ArrayList;

    .line 18
    .line 19
    const/4 v5, 0x0

    .line 20
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    check-cast v4, Landroid/graphics/RectF;

    .line 25
    .line 26
    iget v4, v4, Landroid/graphics/RectF;->left:F

    .line 27
    .line 28
    add-float/2addr v3, v4

    .line 29
    const/high16 v4, 0x41700000    # 15.0f

    .line 30
    .line 31
    sub-float/2addr v3, v4

    .line 32
    invoke-virtual {v0}, Li4/a;->t()Landroid/graphics/RectF;

    .line 33
    .line 34
    .line 35
    move-result-object v6

    .line 36
    iget v6, v6, Landroid/graphics/RectF;->top:F

    .line 37
    .line 38
    invoke-virtual {v0}, Li4/a;->t()Landroid/graphics/RectF;

    .line 39
    .line 40
    .line 41
    move-result-object v7

    .line 42
    iget v7, v7, Landroid/graphics/RectF;->left:F

    .line 43
    .line 44
    iget-object v8, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->x:Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-virtual {v8, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v8

    .line 50
    check-cast v8, Landroid/graphics/RectF;

    .line 51
    .line 52
    iget v8, v8, Landroid/graphics/RectF;->right:F

    .line 53
    .line 54
    add-float/2addr v7, v8

    .line 55
    add-float/2addr v7, v4

    .line 56
    invoke-virtual {v0}, Li4/a;->t()Landroid/graphics/RectF;

    .line 57
    .line 58
    .line 59
    move-result-object v8

    .line 60
    iget v8, v8, Landroid/graphics/RectF;->top:F

    .line 61
    .line 62
    invoke-virtual {v0}, Li4/a;->f()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 63
    .line 64
    .line 65
    move-result-object v9

    .line 66
    invoke-virtual {v9}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectButtonHeight()F

    .line 67
    .line 68
    .line 69
    move-result v9

    .line 70
    add-float/2addr v8, v9

    .line 71
    invoke-virtual {v2, v3, v6, v7, v8}, Landroid/graphics/RectF;->set(FFFF)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v1}, Li4/e;->c()Landroid/graphics/RectF;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    invoke-virtual {v0}, Li4/a;->t()Landroid/graphics/RectF;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    iget v3, v3, Landroid/graphics/RectF;->left:F

    .line 83
    .line 84
    iget-object v6, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->x:Ljava/util/ArrayList;

    .line 85
    .line 86
    const/4 v7, 0x1

    .line 87
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v6

    .line 91
    check-cast v6, Landroid/graphics/RectF;

    .line 92
    .line 93
    iget v6, v6, Landroid/graphics/RectF;->left:F

    .line 94
    .line 95
    add-float/2addr v3, v6

    .line 96
    sub-float/2addr v3, v4

    .line 97
    invoke-virtual {v0}, Li4/a;->t()Landroid/graphics/RectF;

    .line 98
    .line 99
    .line 100
    move-result-object v6

    .line 101
    iget v6, v6, Landroid/graphics/RectF;->top:F

    .line 102
    .line 103
    invoke-virtual {v0}, Li4/a;->t()Landroid/graphics/RectF;

    .line 104
    .line 105
    .line 106
    move-result-object v8

    .line 107
    iget v8, v8, Landroid/graphics/RectF;->left:F

    .line 108
    .line 109
    iget-object v9, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->x:Ljava/util/ArrayList;

    .line 110
    .line 111
    invoke-virtual {v9, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v7

    .line 115
    check-cast v7, Landroid/graphics/RectF;

    .line 116
    .line 117
    iget v7, v7, Landroid/graphics/RectF;->right:F

    .line 118
    .line 119
    add-float/2addr v8, v7

    .line 120
    add-float/2addr v8, v4

    .line 121
    invoke-virtual {v0}, Li4/a;->t()Landroid/graphics/RectF;

    .line 122
    .line 123
    .line 124
    move-result-object v4

    .line 125
    iget v4, v4, Landroid/graphics/RectF;->top:F

    .line 126
    .line 127
    invoke-virtual {v0}, Li4/a;->f()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 128
    .line 129
    .line 130
    move-result-object v7

    .line 131
    invoke-virtual {v7}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectButtonHeight()F

    .line 132
    .line 133
    .line 134
    move-result v7

    .line 135
    add-float/2addr v4, v7

    .line 136
    invoke-virtual {v2, v3, v6, v8, v4}, Landroid/graphics/RectF;->set(FFFF)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v1}, Li4/e;->j()Ljava/util/ArrayList;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 144
    .line 145
    .line 146
    iget-object v2, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->y:Ljava/util/ArrayList;

    .line 147
    .line 148
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 149
    .line 150
    .line 151
    move-result v3

    .line 152
    move v4, v5

    .line 153
    move v6, v4

    .line 154
    :goto_0
    const/4 v7, 0x2

    .line 155
    const/high16 v8, 0x41500000    # 13.0f

    .line 156
    .line 157
    if-ge v6, v3, :cond_1

    .line 158
    .line 159
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v9

    .line 163
    add-int/lit8 v6, v6, 0x1

    .line 164
    .line 165
    add-int/lit8 v10, v4, 0x1

    .line 166
    .line 167
    if-gez v4, :cond_0

    .line 168
    .line 169
    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    .line 170
    .line 171
    .line 172
    :cond_0
    check-cast v9, Landroid/graphics/PointF;

    .line 173
    .line 174
    invoke-virtual {v1}, Li4/e;->j()Ljava/util/ArrayList;

    .line 175
    .line 176
    .line 177
    move-result-object v11

    .line 178
    new-instance v12, Landroid/graphics/RectF;

    .line 179
    .line 180
    invoke-virtual {v0}, Li4/a;->t()Landroid/graphics/RectF;

    .line 181
    .line 182
    .line 183
    move-result-object v13

    .line 184
    iget v13, v13, Landroid/graphics/RectF;->left:F

    .line 185
    .line 186
    iget v14, v9, Landroid/graphics/PointF;->x:F

    .line 187
    .line 188
    add-float/2addr v13, v14

    .line 189
    int-to-float v4, v4

    .line 190
    const/high16 v14, 0x40400000    # 3.0f

    .line 191
    .line 192
    mul-float/2addr v4, v14

    .line 193
    const/high16 v14, 0x41000000    # 8.0f

    .line 194
    .line 195
    add-float/2addr v4, v14

    .line 196
    int-to-float v7, v7

    .line 197
    div-float/2addr v4, v7

    .line 198
    sub-float/2addr v13, v4

    .line 199
    const/high16 v14, 0x41980000    # 19.0f

    .line 200
    .line 201
    sub-float/2addr v13, v14

    .line 202
    invoke-virtual {v0}, Li4/a;->t()Landroid/graphics/RectF;

    .line 203
    .line 204
    .line 205
    move-result-object v15

    .line 206
    iget v15, v15, Landroid/graphics/RectF;->top:F

    .line 207
    .line 208
    invoke-virtual {v0}, Li4/a;->f()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 209
    .line 210
    .line 211
    move-result-object v16

    .line 212
    invoke-virtual/range {v16 .. v16}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectButtonHeight()F

    .line 213
    .line 214
    .line 215
    move-result v16

    .line 216
    add-float v15, v15, v16

    .line 217
    .line 218
    add-float/2addr v15, v8

    .line 219
    invoke-virtual {v0}, Li4/a;->t()Landroid/graphics/RectF;

    .line 220
    .line 221
    .line 222
    move-result-object v5

    .line 223
    iget v5, v5, Landroid/graphics/RectF;->left:F

    .line 224
    .line 225
    iget v9, v9, Landroid/graphics/PointF;->x:F

    .line 226
    .line 227
    add-float/2addr v5, v9

    .line 228
    add-float/2addr v5, v4

    .line 229
    add-float/2addr v5, v14

    .line 230
    invoke-virtual {v0}, Li4/a;->t()Landroid/graphics/RectF;

    .line 231
    .line 232
    .line 233
    move-result-object v4

    .line 234
    iget v4, v4, Landroid/graphics/RectF;->top:F

    .line 235
    .line 236
    invoke-virtual {v0}, Li4/a;->f()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 237
    .line 238
    .line 239
    move-result-object v9

    .line 240
    invoke-virtual {v9}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectButtonHeight()F

    .line 241
    .line 242
    .line 243
    move-result v9

    .line 244
    mul-float/2addr v9, v7

    .line 245
    add-float/2addr v4, v9

    .line 246
    add-float/2addr v4, v8

    .line 247
    invoke-direct {v12, v13, v15, v5, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 248
    .line 249
    .line 250
    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 251
    .line 252
    .line 253
    move v4, v10

    .line 254
    const/4 v5, 0x0

    .line 255
    goto :goto_0

    .line 256
    :cond_1
    invoke-virtual {v0}, Li4/a;->m()Li4/e;

    .line 257
    .line 258
    .line 259
    move-result-object v2

    .line 260
    invoke-virtual {v2}, Li4/e;->j()Ljava/util/ArrayList;

    .line 261
    .line 262
    .line 263
    move-result-object v2

    .line 264
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->last(Ljava/util/List;)Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object v2

    .line 268
    check-cast v2, Landroid/graphics/RectF;

    .line 269
    .line 270
    iget v2, v2, Landroid/graphics/RectF;->right:F

    .line 271
    .line 272
    const/high16 v3, 0x41800000    # 16.0f

    .line 273
    .line 274
    add-float/2addr v2, v3

    .line 275
    add-float/2addr v2, v8

    .line 276
    invoke-virtual {v1}, Li4/e;->a()Ljava/util/ArrayList;

    .line 277
    .line 278
    .line 279
    move-result-object v4

    .line 280
    invoke-virtual {v4}, Ljava/util/ArrayList;->clear()V

    .line 281
    .line 282
    .line 283
    iget-object v4, v0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->z:Ljava/util/ArrayList;

    .line 284
    .line 285
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 286
    .line 287
    .line 288
    move-result v5

    .line 289
    const/4 v6, 0x0

    .line 290
    :goto_1
    if-ge v6, v5, :cond_2

    .line 291
    .line 292
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v9

    .line 296
    add-int/lit8 v6, v6, 0x1

    .line 297
    .line 298
    check-cast v9, Landroid/graphics/RectF;

    .line 299
    .line 300
    invoke-virtual {v1}, Li4/e;->a()Ljava/util/ArrayList;

    .line 301
    .line 302
    .line 303
    move-result-object v10

    .line 304
    new-instance v11, Landroid/graphics/RectF;

    .line 305
    .line 306
    iget v12, v9, Landroid/graphics/RectF;->left:F

    .line 307
    .line 308
    add-float/2addr v12, v2

    .line 309
    invoke-virtual {v0}, Li4/a;->t()Landroid/graphics/RectF;

    .line 310
    .line 311
    .line 312
    move-result-object v13

    .line 313
    iget v13, v13, Landroid/graphics/RectF;->top:F

    .line 314
    .line 315
    invoke-virtual {v0}, Li4/a;->f()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 316
    .line 317
    .line 318
    move-result-object v14

    .line 319
    invoke-virtual {v14}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectButtonHeight()F

    .line 320
    .line 321
    .line 322
    move-result v14

    .line 323
    add-float/2addr v13, v14

    .line 324
    add-float/2addr v13, v8

    .line 325
    iget v14, v9, Landroid/graphics/RectF;->top:F

    .line 326
    .line 327
    add-float/2addr v13, v14

    .line 328
    iget v14, v9, Landroid/graphics/RectF;->right:F

    .line 329
    .line 330
    add-float/2addr v14, v2

    .line 331
    invoke-virtual {v0}, Li4/a;->t()Landroid/graphics/RectF;

    .line 332
    .line 333
    .line 334
    move-result-object v15

    .line 335
    iget v15, v15, Landroid/graphics/RectF;->top:F

    .line 336
    .line 337
    invoke-virtual {v0}, Li4/a;->f()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 338
    .line 339
    .line 340
    move-result-object v17

    .line 341
    invoke-virtual/range {v17 .. v17}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectButtonHeight()F

    .line 342
    .line 343
    .line 344
    move-result v17

    .line 345
    add-float v15, v15, v17

    .line 346
    .line 347
    add-float/2addr v15, v8

    .line 348
    iget v9, v9, Landroid/graphics/RectF;->bottom:F

    .line 349
    .line 350
    add-float/2addr v15, v9

    .line 351
    invoke-direct {v11, v12, v13, v14, v15}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 352
    .line 353
    .line 354
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 355
    .line 356
    .line 357
    goto :goto_1

    .line 358
    :cond_2
    invoke-virtual {v0}, Li4/a;->m()Li4/e;

    .line 359
    .line 360
    .line 361
    move-result-object v2

    .line 362
    invoke-virtual {v2}, Li4/e;->b()Landroid/graphics/RectF;

    .line 363
    .line 364
    .line 365
    move-result-object v2

    .line 366
    invoke-virtual {v2}, Landroid/graphics/RectF;->setEmpty()V

    .line 367
    .line 368
    .line 369
    invoke-virtual {v0}, Li4/a;->f()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 370
    .line 371
    .line 372
    move-result-object v2

    .line 373
    invoke-virtual {v2}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectCustomColorView()Ld5/a;

    .line 374
    .line 375
    .line 376
    move-result-object v2

    .line 377
    if-eqz v2, :cond_5

    .line 378
    .line 379
    invoke-direct {v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->Y()Ljava/util/List;

    .line 380
    .line 381
    .line 382
    move-result-object v4

    .line 383
    const/4 v5, 0x0

    .line 384
    if-eqz v4, :cond_3

    .line 385
    .line 386
    invoke-static {v4}, Lh4/d;->c(Ljava/util/List;)Lh4/f$b;

    .line 387
    .line 388
    .line 389
    move-result-object v4

    .line 390
    goto :goto_2

    .line 391
    :cond_3
    move-object v4, v5

    .line 392
    :goto_2
    if-eqz v4, :cond_4

    .line 393
    .line 394
    goto :goto_3

    .line 395
    :cond_4
    move-object v2, v5

    .line 396
    :goto_3
    if-eqz v2, :cond_5

    .line 397
    .line 398
    invoke-virtual {v1}, Li4/e;->b()Landroid/graphics/RectF;

    .line 399
    .line 400
    .line 401
    move-result-object v4

    .line 402
    invoke-virtual {v0}, Li4/a;->t()Landroid/graphics/RectF;

    .line 403
    .line 404
    .line 405
    move-result-object v5

    .line 406
    iget v5, v5, Landroid/graphics/RectF;->left:F

    .line 407
    .line 408
    invoke-virtual {v0}, Li4/a;->t()Landroid/graphics/RectF;

    .line 409
    .line 410
    .line 411
    move-result-object v6

    .line 412
    iget v6, v6, Landroid/graphics/RectF;->top:F

    .line 413
    .line 414
    invoke-virtual {v0}, Li4/a;->f()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 415
    .line 416
    .line 417
    move-result-object v9

    .line 418
    invoke-virtual {v9}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectButtonHeight()F

    .line 419
    .line 420
    .line 421
    move-result v9

    .line 422
    add-float/2addr v9, v8

    .line 423
    int-to-float v7, v7

    .line 424
    mul-float/2addr v9, v7

    .line 425
    add-float/2addr v6, v9

    .line 426
    invoke-virtual {v0}, Li4/a;->t()Landroid/graphics/RectF;

    .line 427
    .line 428
    .line 429
    move-result-object v9

    .line 430
    iget v9, v9, Landroid/graphics/RectF;->left:F

    .line 431
    .line 432
    invoke-interface {v2}, Ld5/a;->getWidth()F

    .line 433
    .line 434
    .line 435
    move-result v10

    .line 436
    add-float/2addr v9, v10

    .line 437
    invoke-virtual {v0}, Li4/a;->t()Landroid/graphics/RectF;

    .line 438
    .line 439
    .line 440
    move-result-object v10

    .line 441
    iget v10, v10, Landroid/graphics/RectF;->top:F

    .line 442
    .line 443
    invoke-virtual {v0}, Li4/a;->f()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 444
    .line 445
    .line 446
    move-result-object v11

    .line 447
    invoke-virtual {v11}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectButtonHeight()F

    .line 448
    .line 449
    .line 450
    move-result v11

    .line 451
    add-float/2addr v11, v8

    .line 452
    mul-float/2addr v11, v7

    .line 453
    add-float/2addr v10, v11

    .line 454
    invoke-interface {v2}, Ld5/a;->getHeight()F

    .line 455
    .line 456
    .line 457
    move-result v2

    .line 458
    add-float/2addr v10, v2

    .line 459
    invoke-virtual {v4, v5, v6, v9, v10}, Landroid/graphics/RectF;->set(FFFF)V

    .line 460
    .line 461
    .line 462
    :cond_5
    invoke-virtual {v0}, Li4/a;->K()Z

    .line 463
    .line 464
    .line 465
    move-result v2

    .line 466
    if-nez v2, :cond_8

    .line 467
    .line 468
    invoke-virtual {v1}, Li4/e;->c()Landroid/graphics/RectF;

    .line 469
    .line 470
    .line 471
    move-result-object v2

    .line 472
    iget v2, v2, Landroid/graphics/RectF;->right:F

    .line 473
    .line 474
    invoke-virtual {v1}, Li4/e;->i()Landroid/graphics/RectF;

    .line 475
    .line 476
    .line 477
    move-result-object v4

    .line 478
    iget v4, v4, Landroid/graphics/RectF;->left:F

    .line 479
    .line 480
    sub-float/2addr v2, v4

    .line 481
    add-float/2addr v2, v3

    .line 482
    invoke-virtual {v1}, Li4/e;->i()Landroid/graphics/RectF;

    .line 483
    .line 484
    .line 485
    move-result-object v3

    .line 486
    invoke-virtual {v0}, Li4/a;->t()Landroid/graphics/RectF;

    .line 487
    .line 488
    .line 489
    move-result-object v4

    .line 490
    invoke-virtual {v4}, Landroid/graphics/RectF;->width()F

    .line 491
    .line 492
    .line 493
    move-result v4

    .line 494
    sub-float/2addr v4, v2

    .line 495
    const/4 v5, 0x0

    .line 496
    invoke-virtual {v3, v4, v5}, Landroid/graphics/RectF;->offset(FF)V

    .line 497
    .line 498
    .line 499
    invoke-virtual {v1}, Li4/e;->c()Landroid/graphics/RectF;

    .line 500
    .line 501
    .line 502
    move-result-object v3

    .line 503
    invoke-virtual {v0}, Li4/a;->t()Landroid/graphics/RectF;

    .line 504
    .line 505
    .line 506
    move-result-object v4

    .line 507
    invoke-virtual {v4}, Landroid/graphics/RectF;->width()F

    .line 508
    .line 509
    .line 510
    move-result v4

    .line 511
    sub-float/2addr v4, v2

    .line 512
    invoke-virtual {v3, v4, v5}, Landroid/graphics/RectF;->offset(FF)V

    .line 513
    .line 514
    .line 515
    invoke-virtual {v1}, Li4/e;->j()Ljava/util/ArrayList;

    .line 516
    .line 517
    .line 518
    move-result-object v2

    .line 519
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->last(Ljava/util/List;)Ljava/lang/Object;

    .line 520
    .line 521
    .line 522
    move-result-object v2

    .line 523
    check-cast v2, Landroid/graphics/RectF;

    .line 524
    .line 525
    iget v2, v2, Landroid/graphics/RectF;->right:F

    .line 526
    .line 527
    invoke-virtual {v1}, Li4/e;->j()Ljava/util/ArrayList;

    .line 528
    .line 529
    .line 530
    move-result-object v3

    .line 531
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    .line 532
    .line 533
    .line 534
    move-result-object v3

    .line 535
    check-cast v3, Landroid/graphics/RectF;

    .line 536
    .line 537
    iget v3, v3, Landroid/graphics/RectF;->left:F

    .line 538
    .line 539
    sub-float/2addr v2, v3

    .line 540
    const/high16 v3, 0x42000000    # 32.0f

    .line 541
    .line 542
    add-float/2addr v2, v3

    .line 543
    invoke-virtual {v1}, Li4/e;->a()Ljava/util/ArrayList;

    .line 544
    .line 545
    .line 546
    move-result-object v3

    .line 547
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->last(Ljava/util/List;)Ljava/lang/Object;

    .line 548
    .line 549
    .line 550
    move-result-object v3

    .line 551
    check-cast v3, Landroid/graphics/RectF;

    .line 552
    .line 553
    iget v3, v3, Landroid/graphics/RectF;->right:F

    .line 554
    .line 555
    invoke-virtual {v1}, Li4/e;->a()Ljava/util/ArrayList;

    .line 556
    .line 557
    .line 558
    move-result-object v4

    .line 559
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    .line 560
    .line 561
    .line 562
    move-result-object v4

    .line 563
    check-cast v4, Landroid/graphics/RectF;

    .line 564
    .line 565
    iget v4, v4, Landroid/graphics/RectF;->left:F

    .line 566
    .line 567
    sub-float/2addr v3, v4

    .line 568
    const/high16 v4, 0x42380000    # 46.0f

    .line 569
    .line 570
    add-float/2addr v3, v4

    .line 571
    add-float/2addr v2, v8

    .line 572
    add-float/2addr v2, v3

    .line 573
    invoke-virtual {v0}, Li4/a;->t()Landroid/graphics/RectF;

    .line 574
    .line 575
    .line 576
    move-result-object v3

    .line 577
    invoke-virtual {v3}, Landroid/graphics/RectF;->width()F

    .line 578
    .line 579
    .line 580
    move-result v3

    .line 581
    sub-float/2addr v3, v2

    .line 582
    invoke-virtual {v1}, Li4/e;->j()Ljava/util/ArrayList;

    .line 583
    .line 584
    .line 585
    move-result-object v2

    .line 586
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 587
    .line 588
    .line 589
    move-result v4

    .line 590
    const/4 v6, 0x0

    .line 591
    :goto_4
    if-ge v6, v4, :cond_6

    .line 592
    .line 593
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 594
    .line 595
    .line 596
    move-result-object v7

    .line 597
    add-int/lit8 v6, v6, 0x1

    .line 598
    .line 599
    check-cast v7, Landroid/graphics/RectF;

    .line 600
    .line 601
    invoke-virtual {v7, v3, v5}, Landroid/graphics/RectF;->offset(FF)V

    .line 602
    .line 603
    .line 604
    goto :goto_4

    .line 605
    :cond_6
    invoke-virtual {v1}, Li4/e;->a()Ljava/util/ArrayList;

    .line 606
    .line 607
    .line 608
    move-result-object v2

    .line 609
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 610
    .line 611
    .line 612
    move-result v4

    .line 613
    const/4 v6, 0x0

    .line 614
    :goto_5
    if-ge v6, v4, :cond_7

    .line 615
    .line 616
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 617
    .line 618
    .line 619
    move-result-object v7

    .line 620
    add-int/lit8 v6, v6, 0x1

    .line 621
    .line 622
    check-cast v7, Landroid/graphics/RectF;

    .line 623
    .line 624
    invoke-virtual {v7, v3, v5}, Landroid/graphics/RectF;->offset(FF)V

    .line 625
    .line 626
    .line 627
    goto :goto_5

    .line 628
    :cond_7
    invoke-virtual {v1}, Li4/e;->b()Landroid/graphics/RectF;

    .line 629
    .line 630
    .line 631
    move-result-object v2

    .line 632
    invoke-virtual {v2}, Landroid/graphics/RectF;->width()F

    .line 633
    .line 634
    .line 635
    move-result v2

    .line 636
    invoke-virtual {v1}, Li4/e;->b()Landroid/graphics/RectF;

    .line 637
    .line 638
    .line 639
    move-result-object v1

    .line 640
    invoke-virtual {v0}, Li4/a;->t()Landroid/graphics/RectF;

    .line 641
    .line 642
    .line 643
    move-result-object v3

    .line 644
    invoke-virtual {v3}, Landroid/graphics/RectF;->width()F

    .line 645
    .line 646
    .line 647
    move-result v3

    .line 648
    sub-float/2addr v3, v2

    .line 649
    invoke-virtual {v1, v3, v5}, Landroid/graphics/RectF;->offset(FF)V

    .line 650
    .line 651
    .line 652
    :cond_8
    return-void
.end method

.method public Z()Ljava/lang/Integer;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->u:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object v0
.end method

.method public a(Landroid/view/MotionEvent;)V
    .locals 4

    .line 1
    const-string v0, "motionEvent"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Li4/a;->f()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectCustomColorView()Ld5/a;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    invoke-virtual {p0}, Li4/a;->m()Li4/e;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {v2}, Li4/e;->b()Landroid/graphics/RectF;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    iget v2, v2, Landroid/graphics/RectF;->left:F

    .line 29
    .line 30
    sub-float/2addr v1, v2

    .line 31
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    invoke-virtual {p0}, Li4/a;->m()Li4/e;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-virtual {v3}, Li4/e;->b()Landroid/graphics/RectF;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    iget v3, v3, Landroid/graphics/RectF;->top:F

    .line 44
    .line 45
    sub-float/2addr v2, v3

    .line 46
    invoke-virtual {p1, v1, v2}, Landroid/view/MotionEvent;->setLocation(FF)V

    .line 47
    .line 48
    .line 49
    invoke-interface {v0, p1}, Ld5/a;->dispatchTouchEvent(Landroid/view/MotionEvent;)V

    .line 50
    .line 51
    .line 52
    :cond_0
    return-void
.end method

.method public b()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Li4/a;->f()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectCustomColorView()Ld5/a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->Z()Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-interface {v0, v1}, Ld5/a;->b(Ljava/lang/Integer;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public final c0()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->v:Z

    .line 2
    .line 3
    return v0
.end method

.method public final e0(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->v:Z

    .line 2
    .line 3
    return-void
.end method

.method public f0(Ljava/lang/Integer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->u:Ljava/lang/Integer;

    .line 2
    .line 3
    return-void
.end method

.method public h()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->w:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object v0
.end method

.method public s()Landroid/graphics/RectF;
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->x:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->last(Ljava/util/List;)Ljava/lang/Object;

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
    iget-object v2, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->y:Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->last(Ljava/util/List;)Ljava/lang/Object;

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
    iget-object v3, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->y:Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    const/4 v4, 0x1

    .line 34
    sub-int/2addr v3, v4

    .line 35
    int-to-float v3, v3

    .line 36
    const/high16 v5, 0x40400000    # 3.0f

    .line 37
    .line 38
    mul-float/2addr v3, v5

    .line 39
    add-float/2addr v3, v1

    .line 40
    const/4 v1, 0x2

    .line 41
    int-to-float v1, v1

    .line 42
    div-float/2addr v3, v1

    .line 43
    add-float/2addr v2, v3

    .line 44
    const/high16 v3, 0x41980000    # 19.0f

    .line 45
    .line 46
    add-float/2addr v2, v3

    .line 47
    const/high16 v3, 0x41800000    # 16.0f

    .line 48
    .line 49
    add-float/2addr v2, v3

    .line 50
    iget-object v3, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->z:Ljava/util/ArrayList;

    .line 51
    .line 52
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->last(Ljava/util/List;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    check-cast v3, Landroid/graphics/RectF;

    .line 57
    .line 58
    iget v3, v3, Landroid/graphics/RectF;->right:F

    .line 59
    .line 60
    const/high16 v5, 0x41b80000    # 23.0f

    .line 61
    .line 62
    add-float/2addr v3, v5

    .line 63
    const/high16 v5, 0x41500000    # 13.0f

    .line 64
    .line 65
    add-float/2addr v2, v5

    .line 66
    add-float/2addr v2, v3

    .line 67
    invoke-direct {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/WriteFunction;->Y()Ljava/util/List;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    const/4 v6, 0x0

    .line 72
    if-eqz v3, :cond_0

    .line 73
    .line 74
    invoke-static {v3}, Lh4/d;->c(Ljava/util/List;)Lh4/f$b;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    goto :goto_0

    .line 79
    :cond_0
    move-object v3, v6

    .line 80
    :goto_0
    if-eqz v3, :cond_1

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_1
    const/4 v4, 0x0

    .line 84
    :goto_1
    invoke-virtual {p0}, Li4/a;->f()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    invoke-virtual {v3}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectCustomColorView()Ld5/a;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    const/4 v7, 0x0

    .line 93
    if-eqz v3, :cond_3

    .line 94
    .line 95
    if-eqz v4, :cond_2

    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_2
    move-object v3, v6

    .line 99
    :goto_2
    if-eqz v3, :cond_3

    .line 100
    .line 101
    invoke-interface {v3}, Ld5/a;->getWidth()F

    .line 102
    .line 103
    .line 104
    move-result v3

    .line 105
    goto :goto_3

    .line 106
    :cond_3
    move v3, v7

    .line 107
    :goto_3
    invoke-virtual {p0}, Li4/a;->f()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 108
    .line 109
    .line 110
    move-result-object v8

    .line 111
    invoke-virtual {v8}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectCustomColorView()Ld5/a;

    .line 112
    .line 113
    .line 114
    move-result-object v8

    .line 115
    if-eqz v8, :cond_5

    .line 116
    .line 117
    if-eqz v4, :cond_4

    .line 118
    .line 119
    move-object v6, v8

    .line 120
    :cond_4
    if-eqz v6, :cond_5

    .line 121
    .line 122
    invoke-interface {v6}, Ld5/a;->getHeight()F

    .line 123
    .line 124
    .line 125
    move-result v4

    .line 126
    add-float/2addr v4, v5

    .line 127
    goto :goto_4

    .line 128
    :cond_5
    move v4, v7

    .line 129
    :goto_4
    new-instance v6, Lkotlin/Pair;

    .line 130
    .line 131
    invoke-static {v0, v2}, Ljava/lang/Math;->max(FF)F

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    invoke-virtual {p0}, Li4/a;->f()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    invoke-virtual {v2}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectButtonHeight()F

    .line 144
    .line 145
    .line 146
    move-result v2

    .line 147
    mul-float/2addr v2, v1

    .line 148
    add-float/2addr v2, v5

    .line 149
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    invoke-direct {v6, v0, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {p0, v6}, Li4/a;->R(Lkotlin/Pair;)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {p0}, Li4/a;->x()Lkotlin/Pair;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    invoke-virtual {v0}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    check-cast v0, Ljava/lang/Number;

    .line 168
    .line 169
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 170
    .line 171
    .line 172
    move-result v0

    .line 173
    invoke-static {v0, v3}, Ljava/lang/Math;->max(FF)F

    .line 174
    .line 175
    .line 176
    move-result v0

    .line 177
    invoke-virtual {p0}, Li4/a;->x()Lkotlin/Pair;

    .line 178
    .line 179
    .line 180
    move-result-object v1

    .line 181
    invoke-virtual {v1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v1

    .line 185
    check-cast v1, Ljava/lang/Number;

    .line 186
    .line 187
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 188
    .line 189
    .line 190
    move-result v1

    .line 191
    add-float/2addr v1, v4

    .line 192
    new-instance v2, Landroid/graphics/RectF;

    .line 193
    .line 194
    invoke-direct {v2, v7, v7, v0, v1}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 195
    .line 196
    .line 197
    return-object v2
.end method
