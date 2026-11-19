.class public final Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;
.super Li4/a;
.source "SourceFile"

# interfaces
.implements Li4/f;


# instance fields
.field public final A:Landroid/graphics/PointF;

.field public final B:Landroid/graphics/PointF;

.field public u:Ljava/lang/Integer;

.field public final v:Ljava/util/ArrayList;

.field public final w:Ljava/util/ArrayList;

.field public final x:Ljava/util/ArrayList;

.field public y:F

.field public z:F


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
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;->v:Ljava/util/ArrayList;

    .line 15
    .line 16
    new-instance p1, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;->w:Ljava/util/ArrayList;

    .line 22
    .line 23
    new-instance p1, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;->x:Ljava/util/ArrayList;

    .line 29
    .line 30
    new-instance p1, Landroid/graphics/PointF;

    .line 31
    .line 32
    invoke-direct {p1}, Landroid/graphics/PointF;-><init>()V

    .line 33
    .line 34
    .line 35
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;->A:Landroid/graphics/PointF;

    .line 36
    .line 37
    new-instance p1, Landroid/graphics/PointF;

    .line 38
    .line 39
    invoke-direct {p1}, Landroid/graphics/PointF;-><init>()V

    .line 40
    .line 41
    .line 42
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;->B:Landroid/graphics/PointF;

    .line 43
    .line 44
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;->f0()V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;->e0()V

    .line 48
    .line 49
    .line 50
    return-void
.end method


# virtual methods
.method public A(FF)Z
    .locals 4

    .line 1
    invoke-super {p0, p1, p2}, Li4/a;->A(FF)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 p2, 0x0

    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    return p2

    .line 9
    :cond_0
    invoke-virtual {p0}, Li4/a;->g()Lh4/b;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    instance-of v0, p1, Lh4/b$d;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    if-eqz v0, :cond_3

    .line 17
    .line 18
    invoke-virtual {p0}, Li4/a;->g()Lh4/b;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    const-string v0, "null cannot be cast to non-null type com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionMode.Function"

    .line 23
    .line 24
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    check-cast p1, Lh4/b$d;

    .line 28
    .line 29
    invoke-virtual {p1}, Lh4/b$d;->a()I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-eqz p1, :cond_2

    .line 34
    .line 35
    if-eq p1, v1, :cond_1

    .line 36
    .line 37
    goto/16 :goto_4

    .line 38
    .line 39
    :cond_1
    invoke-virtual {p0}, Li4/a;->o()Lk4/c;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {p0}, Li4/a;->u()Ljava/util/ArrayList;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    invoke-interface {p1, p2}, Lk4/c;->q(Ljava/util/List;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Li4/a;->o()Lk4/c;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-interface {p1}, Lk4/c;->d()V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Li4/a;->q()Lg4/b;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-virtual {p0}, Li4/a;->u()Ljava/util/ArrayList;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 66
    .line 67
    .line 68
    move-result-wide v2

    .line 69
    invoke-interface {p1, p2, v2, v3}, Lg4/b;->n(Ljava/util/List;J)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0}, Li4/a;->q()Lg4/b;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-interface {p1}, Lg4/b;->l()V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;->L()V

    .line 80
    .line 81
    .line 82
    goto/16 :goto_4

    .line 83
    .line 84
    :cond_2
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;->v:Ljava/util/ArrayList;

    .line 85
    .line 86
    invoke-static {p1}, Lh4/d;->d(Ljava/util/List;)Lh4/c$b;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    if-eqz p1, :cond_c

    .line 91
    .line 92
    invoke-virtual {p1}, Lh4/c;->b()Z

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    xor-int/2addr v0, v1

    .line 97
    invoke-virtual {p1, v0}, Lh4/c;->c(Z)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p0, p2}, Li4/a;->U(Z)V

    .line 101
    .line 102
    .line 103
    goto/16 :goto_4

    .line 104
    .line 105
    :cond_3
    instance-of p1, p1, Lh4/b$a;

    .line 106
    .line 107
    if-eqz p1, :cond_c

    .line 108
    .line 109
    invoke-virtual {p0}, Li4/a;->g()Lh4/b;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    const-string v0, "null cannot be cast to non-null type com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionMode.Color"

    .line 114
    .line 115
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    check-cast p1, Lh4/b$a;

    .line 119
    .line 120
    invoke-virtual {p1}, Lh4/b$a;->a()I

    .line 121
    .line 122
    .line 123
    move-result p1

    .line 124
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;->Z()Ljava/util/List;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    if-nez v0, :cond_4

    .line 129
    .line 130
    return v1

    .line 131
    :cond_4
    new-instance v2, Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction$handleClick$changeColor$1;

    .line 132
    .line 133
    invoke-direct {v2, p0, v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction$handleClick$changeColor$1;-><init>(Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;Ljava/util/List;)V

    .line 134
    .line 135
    .line 136
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v3

    .line 140
    instance-of v3, v3, Lh4/f$b;

    .line 141
    .line 142
    if-eqz v3, :cond_b

    .line 143
    .line 144
    invoke-static {v0}, Lh4/d;->c(Ljava/util/List;)Lh4/f$b;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    if-eqz p1, :cond_6

    .line 149
    .line 150
    invoke-virtual {p1}, Lh4/f$b;->e()Z

    .line 151
    .line 152
    .line 153
    move-result v3

    .line 154
    if-ne v3, v1, :cond_6

    .line 155
    .line 156
    invoke-virtual {p1, p2}, Lh4/f$b;->f(Z)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {p0}, Li4/a;->f()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    invoke-virtual {p1}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectCustomColorView()Ld5/a;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    if-nez p1, :cond_5

    .line 168
    .line 169
    goto :goto_0

    .line 170
    :cond_5
    const/4 v0, 0x0

    .line 171
    invoke-interface {p1, v0}, Ld5/a;->d(Lkotlin/jvm/functions/Function1;)V

    .line 172
    .line 173
    .line 174
    :goto_0
    invoke-virtual {p0, p2}, Li4/a;->U(Z)V

    .line 175
    .line 176
    .line 177
    goto :goto_4

    .line 178
    :cond_6
    if-nez p1, :cond_7

    .line 179
    .line 180
    goto :goto_1

    .line 181
    :cond_7
    invoke-virtual {p1, v1}, Lh4/f$b;->f(Z)V

    .line 182
    .line 183
    .line 184
    :goto_1
    invoke-virtual {p0}, Li4/a;->f()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 185
    .line 186
    .line 187
    move-result-object p1

    .line 188
    invoke-virtual {p1}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectCustomColorView()Ld5/a;

    .line 189
    .line 190
    .line 191
    move-result-object p1

    .line 192
    if-nez p1, :cond_8

    .line 193
    .line 194
    goto :goto_2

    .line 195
    :cond_8
    invoke-interface {p1, v2}, Ld5/a;->d(Lkotlin/jvm/functions/Function1;)V

    .line 196
    .line 197
    .line 198
    :goto_2
    invoke-static {v0}, Lh4/d;->c(Ljava/util/List;)Lh4/f$b;

    .line 199
    .line 200
    .line 201
    move-result-object p1

    .line 202
    if-eqz p1, :cond_9

    .line 203
    .line 204
    invoke-virtual {p1}, Lh4/f;->a()I

    .line 205
    .line 206
    .line 207
    move-result p1

    .line 208
    goto :goto_3

    .line 209
    :cond_9
    move p1, p2

    .line 210
    :goto_3
    invoke-virtual {p0}, Li4/a;->f()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 211
    .line 212
    .line 213
    move-result-object v3

    .line 214
    invoke-virtual {v3}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectCustomColorView()Ld5/a;

    .line 215
    .line 216
    .line 217
    move-result-object v3

    .line 218
    if-eqz v3, :cond_a

    .line 219
    .line 220
    invoke-interface {v3, p1}, Ld5/a;->c(I)Z

    .line 221
    .line 222
    .line 223
    move-result v3

    .line 224
    if-ne v3, v1, :cond_a

    .line 225
    .line 226
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 227
    .line 228
    .line 229
    move-result-object p1

    .line 230
    invoke-interface {v2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    goto :goto_4

    .line 234
    :cond_a
    invoke-static {v0}, Lh4/d;->h(Ljava/util/List;)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {p0, p2}, Li4/a;->U(Z)V

    .line 238
    .line 239
    .line 240
    goto :goto_4

    .line 241
    :cond_b
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object p1

    .line 245
    check-cast p1, Lh4/f;

    .line 246
    .line 247
    invoke-virtual {p1}, Lh4/f;->a()I

    .line 248
    .line 249
    .line 250
    move-result p1

    .line 251
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 252
    .line 253
    .line 254
    move-result-object p1

    .line 255
    invoke-interface {v2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    :cond_c
    :goto_4
    return v1
.end method

.method public C(FF)Z
    .locals 23

    .line 1
    invoke-super/range {p0 .. p2}, Li4/a;->C(FF)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    invoke-virtual/range {p0 .. p0}, Li4/a;->g()Lh4/b;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    instance-of v2, v0, Lh4/b$c;

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    if-eqz v2, :cond_3

    .line 17
    .line 18
    invoke-virtual/range {p0 .. p0}, Li4/a;->g()Lh4/b;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-string v2, "null cannot be cast to non-null type com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionMode.Frame"

    .line 23
    .line 24
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    check-cast v0, Lh4/b$c;

    .line 28
    .line 29
    move-object/from16 v2, p0

    .line 30
    .line 31
    move/from16 v4, p1

    .line 32
    .line 33
    move/from16 v5, p2

    .line 34
    .line 35
    invoke-virtual {v2, v0, v4, v5}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;->d0(Lh4/b$c;FF)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;->i0()V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;->Y()V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2}, Li4/a;->z()Landroid/graphics/PointF;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    if-eqz v0, :cond_1

    .line 49
    .line 50
    sget-object v3, Le5/n;->a:Le5/n;

    .line 51
    .line 52
    invoke-virtual {v2}, Li4/a;->i()Landroid/graphics/Matrix;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    invoke-virtual {v3, v0, v4}, Le5/n;->e(Landroid/graphics/PointF;Landroid/graphics/Matrix;)Landroid/graphics/PointF;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    :cond_1
    move-object v11, v3

    .line 61
    invoke-virtual {v2}, Li4/a;->u()Ljava/util/ArrayList;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    move-object v13, v0

    .line 70
    check-cast v13, Lq4/c;

    .line 71
    .line 72
    if-eqz v13, :cond_2

    .line 73
    .line 74
    invoke-virtual {v2}, Li4/a;->o()Lk4/c;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    invoke-virtual {v2}, Li4/a;->v()Landroid/graphics/RectF;

    .line 79
    .line 80
    .line 81
    move-result-object v5

    .line 82
    invoke-virtual {v2}, Li4/a;->i()Landroid/graphics/Matrix;

    .line 83
    .line 84
    .line 85
    move-result-object v6

    .line 86
    invoke-virtual {v2}, Li4/a;->t()Landroid/graphics/RectF;

    .line 87
    .line 88
    .line 89
    move-result-object v7

    .line 90
    invoke-virtual {v2}, Li4/a;->m()Li4/e;

    .line 91
    .line 92
    .line 93
    move-result-object v8

    .line 94
    invoke-virtual {v2}, Li4/a;->l()Li4/c;

    .line 95
    .line 96
    .line 97
    move-result-object v9

    .line 98
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;->h()Ljava/util/List;

    .line 99
    .line 100
    .line 101
    move-result-object v10

    .line 102
    invoke-interface/range {v4 .. v11}, Lk4/c;->C(Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/RectF;Li4/e;Li4/c;Ljava/util/List;Landroid/graphics/PointF;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v2}, Li4/a;->q()Lg4/b;

    .line 106
    .line 107
    .line 108
    move-result-object v12

    .line 109
    sget-object v14, Lcom/zykj/board/EzyGraphEnum$GraphEnum;->h:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    .line 110
    .line 111
    invoke-interface {v13}, Lq4/c;->g()Landroid/graphics/RectF;

    .line 112
    .line 113
    .line 114
    move-result-object v15

    .line 115
    const/16 v21, 0xf8

    .line 116
    .line 117
    const/16 v22, 0x0

    .line 118
    .line 119
    const/16 v16, 0x0

    .line 120
    .line 121
    const/16 v17, 0x0

    .line 122
    .line 123
    const/16 v18, 0x0

    .line 124
    .line 125
    const/16 v19, 0x0

    .line 126
    .line 127
    const/16 v20, 0x0

    .line 128
    .line 129
    invoke-static/range {v12 .. v22}, Lg4/b$a;->a(Lg4/b;Lq4/c;Lcom/zykj/board/EzyGraphEnum$GraphEnum;Landroid/graphics/RectF;Ljava/lang/String;Landroid/graphics/Paint;Ljava/util/List;Landroid/graphics/Matrix;Ljava/lang/String;ILjava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    :cond_2
    invoke-virtual {v2}, Li4/a;->q()Lg4/b;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    invoke-interface {v0}, Lg4/b;->l()V

    .line 137
    .line 138
    .line 139
    goto :goto_0

    .line 140
    :cond_3
    move-object/from16 v2, p0

    .line 141
    .line 142
    move/from16 v4, p1

    .line 143
    .line 144
    move/from16 v5, p2

    .line 145
    .line 146
    instance-of v0, v0, Lh4/b$f;

    .line 147
    .line 148
    if-eqz v0, :cond_6

    .line 149
    .line 150
    invoke-virtual/range {p0 .. p2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;->c0(FF)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v2}, Li4/a;->z()Landroid/graphics/PointF;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    if-eqz v0, :cond_4

    .line 158
    .line 159
    sget-object v3, Le5/n;->a:Le5/n;

    .line 160
    .line 161
    invoke-virtual {v2}, Li4/a;->i()Landroid/graphics/Matrix;

    .line 162
    .line 163
    .line 164
    move-result-object v4

    .line 165
    invoke-virtual {v3, v0, v4}, Le5/n;->e(Landroid/graphics/PointF;Landroid/graphics/Matrix;)Landroid/graphics/PointF;

    .line 166
    .line 167
    .line 168
    move-result-object v3

    .line 169
    :cond_4
    move-object v11, v3

    .line 170
    invoke-virtual {v2}, Li4/a;->u()Ljava/util/ArrayList;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    move-object v13, v0

    .line 179
    check-cast v13, Lq4/c;

    .line 180
    .line 181
    if-eqz v13, :cond_5

    .line 182
    .line 183
    invoke-virtual {v2}, Li4/a;->o()Lk4/c;

    .line 184
    .line 185
    .line 186
    move-result-object v4

    .line 187
    invoke-virtual {v2}, Li4/a;->v()Landroid/graphics/RectF;

    .line 188
    .line 189
    .line 190
    move-result-object v5

    .line 191
    invoke-virtual {v2}, Li4/a;->i()Landroid/graphics/Matrix;

    .line 192
    .line 193
    .line 194
    move-result-object v6

    .line 195
    invoke-virtual {v2}, Li4/a;->t()Landroid/graphics/RectF;

    .line 196
    .line 197
    .line 198
    move-result-object v7

    .line 199
    invoke-virtual {v2}, Li4/a;->m()Li4/e;

    .line 200
    .line 201
    .line 202
    move-result-object v8

    .line 203
    invoke-virtual {v2}, Li4/a;->l()Li4/c;

    .line 204
    .line 205
    .line 206
    move-result-object v9

    .line 207
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;->h()Ljava/util/List;

    .line 208
    .line 209
    .line 210
    move-result-object v10

    .line 211
    invoke-interface/range {v4 .. v11}, Lk4/c;->C(Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/RectF;Li4/e;Li4/c;Ljava/util/List;Landroid/graphics/PointF;)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {v2}, Li4/a;->q()Lg4/b;

    .line 215
    .line 216
    .line 217
    move-result-object v12

    .line 218
    sget-object v14, Lcom/zykj/board/EzyGraphEnum$GraphEnum;->h:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    .line 219
    .line 220
    move-object v0, v13

    .line 221
    check-cast v0, Lr4/b;

    .line 222
    .line 223
    invoke-virtual {v0}, Lr4/b;->K()Ljava/util/List;

    .line 224
    .line 225
    .line 226
    move-result-object v18

    .line 227
    const/16 v21, 0xdc

    .line 228
    .line 229
    const/16 v22, 0x0

    .line 230
    .line 231
    const/4 v15, 0x0

    .line 232
    const/16 v16, 0x0

    .line 233
    .line 234
    const/16 v17, 0x0

    .line 235
    .line 236
    const/16 v19, 0x0

    .line 237
    .line 238
    const/16 v20, 0x0

    .line 239
    .line 240
    invoke-static/range {v12 .. v22}, Lg4/b$a;->a(Lg4/b;Lq4/c;Lcom/zykj/board/EzyGraphEnum$GraphEnum;Landroid/graphics/RectF;Ljava/lang/String;Landroid/graphics/Paint;Ljava/util/List;Landroid/graphics/Matrix;Ljava/lang/String;ILjava/lang/Object;)V

    .line 241
    .line 242
    .line 243
    :cond_5
    invoke-virtual {v2}, Li4/a;->q()Lg4/b;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    invoke-interface {v0}, Lg4/b;->l()V

    .line 248
    .line 249
    .line 250
    :goto_0
    return v1

    .line 251
    :cond_6
    const/4 v0, 0x0

    .line 252
    return v0
.end method

.method public D(FF)Z
    .locals 11

    .line 1
    invoke-virtual {p0}, Li4/a;->g()Lh4/b;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    instance-of p2, p1, Lh4/b$c;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    const/4 v1, 0x0

    .line 9
    if-eqz p2, :cond_2

    .line 10
    .line 11
    invoke-virtual {p0}, Li4/a;->u()Ljava/util/ArrayList;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    check-cast p1, Lq4/c;

    .line 20
    .line 21
    if-eqz p1, :cond_1

    .line 22
    .line 23
    check-cast p1, Lr4/b;

    .line 24
    .line 25
    new-instance p2, Landroid/graphics/Matrix;

    .line 26
    .line 27
    invoke-direct {p2}, Landroid/graphics/Matrix;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Lq4/a;->b()Landroid/graphics/Matrix;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {p2, v0}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Li4/a;->r()Lj4/a;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {v0}, Lj4/a;->b()Landroid/graphics/Matrix;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {p2, v0}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1}, Lq4/a;->g()Landroid/graphics/RectF;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    invoke-virtual {p2, v0}, Landroid/graphics/Matrix;->mapRadius(F)F

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    iput v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;->y:F

    .line 61
    .line 62
    invoke-virtual {p1}, Lq4/a;->g()Landroid/graphics/RectF;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    invoke-virtual {p2, v0}, Landroid/graphics/Matrix;->mapRadius(F)F

    .line 71
    .line 72
    .line 73
    move-result p2

    .line 74
    iput p2, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;->z:F

    .line 75
    .line 76
    new-instance p2, Ljava/lang/StringBuilder;

    .line 77
    .line 78
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 79
    .line 80
    .line 81
    const-string v0, "GeometryFunction:changeFrame -> start graph:"

    .line 82
    .line 83
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {p1}, Lq4/a;->getId()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;->i0()V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;->Y()V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p0}, Li4/a;->z()Landroid/graphics/PointF;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    if-eqz p1, :cond_0

    .line 115
    .line 116
    sget-object p2, Le5/n;->a:Le5/n;

    .line 117
    .line 118
    invoke-virtual {p0}, Li4/a;->i()Landroid/graphics/Matrix;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    invoke-virtual {p2, p1, v0}, Le5/n;->e(Landroid/graphics/PointF;Landroid/graphics/Matrix;)Landroid/graphics/PointF;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    :cond_0
    move-object v10, v1

    .line 127
    invoke-virtual {p0}, Li4/a;->u()Ljava/util/ArrayList;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    check-cast p1, Lq4/c;

    .line 136
    .line 137
    if-eqz p1, :cond_5

    .line 138
    .line 139
    invoke-virtual {p0}, Li4/a;->o()Lk4/c;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    move-object v3, p1

    .line 144
    check-cast v3, Lr4/b;

    .line 145
    .line 146
    invoke-virtual {p0}, Li4/a;->v()Landroid/graphics/RectF;

    .line 147
    .line 148
    .line 149
    move-result-object v4

    .line 150
    invoke-virtual {p0}, Li4/a;->i()Landroid/graphics/Matrix;

    .line 151
    .line 152
    .line 153
    move-result-object v5

    .line 154
    invoke-virtual {p0}, Li4/a;->t()Landroid/graphics/RectF;

    .line 155
    .line 156
    .line 157
    move-result-object v6

    .line 158
    invoke-virtual {p0}, Li4/a;->m()Li4/e;

    .line 159
    .line 160
    .line 161
    move-result-object v7

    .line 162
    invoke-virtual {p0}, Li4/a;->l()Li4/c;

    .line 163
    .line 164
    .line 165
    move-result-object v8

    .line 166
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;->h()Ljava/util/List;

    .line 167
    .line 168
    .line 169
    move-result-object v9

    .line 170
    invoke-interface/range {v2 .. v10}, Lk4/c;->l(Lcom/zykj/blackboard/core/graph/group/GroupGraph;Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/RectF;Li4/e;Li4/c;Ljava/util/List;Landroid/graphics/PointF;)V

    .line 171
    .line 172
    .line 173
    goto/16 :goto_0

    .line 174
    .line 175
    :cond_1
    return v0

    .line 176
    :cond_2
    instance-of p1, p1, Lh4/b$f;

    .line 177
    .line 178
    if-eqz p1, :cond_5

    .line 179
    .line 180
    invoke-virtual {p0}, Li4/a;->u()Ljava/util/ArrayList;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object p1

    .line 188
    check-cast p1, Lq4/c;

    .line 189
    .line 190
    if-eqz p1, :cond_4

    .line 191
    .line 192
    check-cast p1, Lr4/b;

    .line 193
    .line 194
    new-instance p2, Landroid/graphics/Matrix;

    .line 195
    .line 196
    invoke-direct {p2}, Landroid/graphics/Matrix;-><init>()V

    .line 197
    .line 198
    .line 199
    invoke-virtual {p1}, Lq4/a;->b()Landroid/graphics/Matrix;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    invoke-virtual {p2, v0}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 204
    .line 205
    .line 206
    invoke-virtual {p0}, Li4/a;->r()Lj4/a;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    invoke-virtual {v0}, Lj4/a;->b()Landroid/graphics/Matrix;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    invoke-virtual {p2, v0}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 215
    .line 216
    .line 217
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;->A:Landroid/graphics/PointF;

    .line 218
    .line 219
    sget-object v2, Le5/n;->a:Le5/n;

    .line 220
    .line 221
    invoke-virtual {p1}, Lq4/a;->g()Landroid/graphics/RectF;

    .line 222
    .line 223
    .line 224
    move-result-object v3

    .line 225
    iget v3, v3, Landroid/graphics/RectF;->left:F

    .line 226
    .line 227
    invoke-virtual {p1}, Lq4/a;->g()Landroid/graphics/RectF;

    .line 228
    .line 229
    .line 230
    move-result-object v4

    .line 231
    iget v4, v4, Landroid/graphics/RectF;->top:F

    .line 232
    .line 233
    invoke-virtual {v2, v3, v4, p2}, Le5/n;->d(FFLandroid/graphics/Matrix;)Landroid/graphics/PointF;

    .line 234
    .line 235
    .line 236
    move-result-object v3

    .line 237
    invoke-virtual {v0, v3}, Landroid/graphics/PointF;->set(Landroid/graphics/PointF;)V

    .line 238
    .line 239
    .line 240
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;->B:Landroid/graphics/PointF;

    .line 241
    .line 242
    invoke-virtual {p1}, Lq4/a;->g()Landroid/graphics/RectF;

    .line 243
    .line 244
    .line 245
    move-result-object v3

    .line 246
    iget v3, v3, Landroid/graphics/RectF;->right:F

    .line 247
    .line 248
    invoke-virtual {p1}, Lq4/a;->g()Landroid/graphics/RectF;

    .line 249
    .line 250
    .line 251
    move-result-object p1

    .line 252
    iget p1, p1, Landroid/graphics/RectF;->top:F

    .line 253
    .line 254
    invoke-virtual {v2, v3, p1, p2}, Le5/n;->d(FFLandroid/graphics/Matrix;)Landroid/graphics/PointF;

    .line 255
    .line 256
    .line 257
    move-result-object p1

    .line 258
    invoke-virtual {v0, p1}, Landroid/graphics/PointF;->set(Landroid/graphics/PointF;)V

    .line 259
    .line 260
    .line 261
    invoke-virtual {p0}, Li4/a;->z()Landroid/graphics/PointF;

    .line 262
    .line 263
    .line 264
    move-result-object p1

    .line 265
    if-eqz p1, :cond_3

    .line 266
    .line 267
    invoke-virtual {p0}, Li4/a;->i()Landroid/graphics/Matrix;

    .line 268
    .line 269
    .line 270
    move-result-object p2

    .line 271
    invoke-virtual {v2, p1, p2}, Le5/n;->e(Landroid/graphics/PointF;Landroid/graphics/Matrix;)Landroid/graphics/PointF;

    .line 272
    .line 273
    .line 274
    move-result-object v1

    .line 275
    :cond_3
    move-object v10, v1

    .line 276
    invoke-virtual {p0}, Li4/a;->u()Ljava/util/ArrayList;

    .line 277
    .line 278
    .line 279
    move-result-object p1

    .line 280
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object p1

    .line 284
    check-cast p1, Lq4/c;

    .line 285
    .line 286
    if-eqz p1, :cond_5

    .line 287
    .line 288
    invoke-virtual {p0}, Li4/a;->o()Lk4/c;

    .line 289
    .line 290
    .line 291
    move-result-object v2

    .line 292
    move-object v3, p1

    .line 293
    check-cast v3, Lr4/b;

    .line 294
    .line 295
    invoke-virtual {p0}, Li4/a;->v()Landroid/graphics/RectF;

    .line 296
    .line 297
    .line 298
    move-result-object v4

    .line 299
    invoke-virtual {p0}, Li4/a;->i()Landroid/graphics/Matrix;

    .line 300
    .line 301
    .line 302
    move-result-object v5

    .line 303
    invoke-virtual {p0}, Li4/a;->t()Landroid/graphics/RectF;

    .line 304
    .line 305
    .line 306
    move-result-object v6

    .line 307
    invoke-virtual {p0}, Li4/a;->m()Li4/e;

    .line 308
    .line 309
    .line 310
    move-result-object v7

    .line 311
    invoke-virtual {p0}, Li4/a;->l()Li4/c;

    .line 312
    .line 313
    .line 314
    move-result-object v8

    .line 315
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;->h()Ljava/util/List;

    .line 316
    .line 317
    .line 318
    move-result-object v9

    .line 319
    invoke-interface/range {v2 .. v10}, Lk4/c;->l(Lcom/zykj/blackboard/core/graph/group/GroupGraph;Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/RectF;Li4/e;Li4/c;Ljava/util/List;Landroid/graphics/PointF;)V

    .line 320
    .line 321
    .line 322
    goto :goto_0

    .line 323
    :cond_4
    return v0

    .line 324
    :cond_5
    :goto_0
    const/4 p1, 0x1

    .line 325
    return p1
.end method

.method public E(FF)Z
    .locals 13

    .line 1
    invoke-super {p0, p1, p2}, Li4/a;->E(FF)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    invoke-virtual {p0}, Li4/a;->g()Lh4/b;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    instance-of v2, v0, Lh4/b$c;

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    if-eqz v2, :cond_2

    .line 17
    .line 18
    invoke-virtual {p0}, Li4/a;->g()Lh4/b;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-string v2, "null cannot be cast to non-null type com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionMode.Frame"

    .line 23
    .line 24
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    check-cast v0, Lh4/b$c;

    .line 28
    .line 29
    invoke-virtual {p0, v0, p1, p2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;->d0(Lh4/b$c;FF)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;->i0()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;->Y()V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Li4/a;->z()Landroid/graphics/PointF;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    if-eqz p1, :cond_1

    .line 43
    .line 44
    sget-object p2, Le5/n;->a:Le5/n;

    .line 45
    .line 46
    invoke-virtual {p0}, Li4/a;->i()Landroid/graphics/Matrix;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {p2, p1, v0}, Le5/n;->e(Landroid/graphics/PointF;Landroid/graphics/Matrix;)Landroid/graphics/PointF;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    :cond_1
    move-object v12, v3

    .line 55
    invoke-virtual {p0}, Li4/a;->u()Ljava/util/ArrayList;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    check-cast p1, Lq4/c;

    .line 64
    .line 65
    if-eqz p1, :cond_4

    .line 66
    .line 67
    invoke-virtual {p0}, Li4/a;->o()Lk4/c;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    move-object v5, p1

    .line 72
    check-cast v5, Lr4/b;

    .line 73
    .line 74
    invoke-virtual {p0}, Li4/a;->v()Landroid/graphics/RectF;

    .line 75
    .line 76
    .line 77
    move-result-object v6

    .line 78
    invoke-virtual {p0}, Li4/a;->i()Landroid/graphics/Matrix;

    .line 79
    .line 80
    .line 81
    move-result-object v7

    .line 82
    invoke-virtual {p0}, Li4/a;->t()Landroid/graphics/RectF;

    .line 83
    .line 84
    .line 85
    move-result-object v8

    .line 86
    invoke-virtual {p0}, Li4/a;->m()Li4/e;

    .line 87
    .line 88
    .line 89
    move-result-object v9

    .line 90
    invoke-virtual {p0}, Li4/a;->l()Li4/c;

    .line 91
    .line 92
    .line 93
    move-result-object v10

    .line 94
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;->h()Ljava/util/List;

    .line 95
    .line 96
    .line 97
    move-result-object v11

    .line 98
    invoke-interface/range {v4 .. v12}, Lk4/c;->k(Lcom/zykj/blackboard/core/graph/group/GroupGraph;Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/RectF;Li4/e;Li4/c;Ljava/util/List;Landroid/graphics/PointF;)V

    .line 99
    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_2
    instance-of v0, v0, Lh4/b$f;

    .line 103
    .line 104
    if-eqz v0, :cond_5

    .line 105
    .line 106
    invoke-virtual {p0, p1, p2}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;->c0(FF)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p0}, Li4/a;->z()Landroid/graphics/PointF;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    if-eqz p1, :cond_3

    .line 114
    .line 115
    sget-object p2, Le5/n;->a:Le5/n;

    .line 116
    .line 117
    invoke-virtual {p0}, Li4/a;->i()Landroid/graphics/Matrix;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    invoke-virtual {p2, p1, v0}, Le5/n;->e(Landroid/graphics/PointF;Landroid/graphics/Matrix;)Landroid/graphics/PointF;

    .line 122
    .line 123
    .line 124
    move-result-object v3

    .line 125
    :cond_3
    move-object v12, v3

    .line 126
    invoke-virtual {p0}, Li4/a;->u()Ljava/util/ArrayList;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    check-cast p1, Lq4/c;

    .line 135
    .line 136
    if-eqz p1, :cond_4

    .line 137
    .line 138
    invoke-virtual {p0}, Li4/a;->o()Lk4/c;

    .line 139
    .line 140
    .line 141
    move-result-object v4

    .line 142
    move-object v5, p1

    .line 143
    check-cast v5, Lr4/b;

    .line 144
    .line 145
    invoke-virtual {p0}, Li4/a;->v()Landroid/graphics/RectF;

    .line 146
    .line 147
    .line 148
    move-result-object v6

    .line 149
    invoke-virtual {p0}, Li4/a;->i()Landroid/graphics/Matrix;

    .line 150
    .line 151
    .line 152
    move-result-object v7

    .line 153
    invoke-virtual {p0}, Li4/a;->t()Landroid/graphics/RectF;

    .line 154
    .line 155
    .line 156
    move-result-object v8

    .line 157
    invoke-virtual {p0}, Li4/a;->m()Li4/e;

    .line 158
    .line 159
    .line 160
    move-result-object v9

    .line 161
    invoke-virtual {p0}, Li4/a;->l()Li4/c;

    .line 162
    .line 163
    .line 164
    move-result-object v10

    .line 165
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;->h()Ljava/util/List;

    .line 166
    .line 167
    .line 168
    move-result-object v11

    .line 169
    invoke-interface/range {v4 .. v12}, Lk4/c;->k(Lcom/zykj/blackboard/core/graph/group/GroupGraph;Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/RectF;Li4/e;Li4/c;Ljava/util/List;Landroid/graphics/PointF;)V

    .line 170
    .line 171
    .line 172
    :cond_4
    :goto_0
    return v1

    .line 173
    :cond_5
    const/4 p1, 0x0

    .line 174
    return p1
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
    invoke-virtual {v0}, Li4/e;->d()Landroid/graphics/RectF;

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
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;->v:Ljava/util/ArrayList;

    .line 70
    .line 71
    invoke-static {v0}, Lh4/d;->d(Ljava/util/List;)Lh4/c$b;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    if-eqz v0, :cond_7

    .line 76
    .line 77
    invoke-virtual {v0}, Lh4/c;->b()Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-ne v0, v2, :cond_7

    .line 82
    .line 83
    invoke-virtual {p0}, Li4/a;->m()Li4/e;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-virtual {v0}, Li4/e;->a()Ljava/util/ArrayList;

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
    invoke-virtual {v4}, Li4/e;->a()Ljava/util/ArrayList;

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
    new-instance p1, Lh4/b$a;

    .line 119
    .line 120
    invoke-direct {p1, v3}, Lh4/b$a;-><init>(I)V

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
    invoke-virtual {v0}, Li4/c;->a()Landroid/graphics/RectF;

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
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;->Z()Ljava/util/List;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    if-eqz v0, :cond_7

    .line 155
    .line 156
    invoke-static {v0}, Lh4/d;->c(Ljava/util/List;)Lh4/f$b;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    if-eqz v0, :cond_7

    .line 161
    .line 162
    invoke-virtual {v0}, Lh4/f$b;->e()Z

    .line 163
    .line 164
    .line 165
    move-result v0

    .line 166
    if-ne v0, v2, :cond_7

    .line 167
    .line 168
    invoke-virtual {p0}, Li4/a;->m()Li4/e;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    invoke-virtual {v0}, Li4/e;->b()Landroid/graphics/RectF;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    invoke-virtual {v0, p1, p2}, Landroid/graphics/RectF;->contains(FF)Z

    .line 177
    .line 178
    .line 179
    move-result v0

    .line 180
    if-eqz v0, :cond_6

    .line 181
    .line 182
    sget-object p1, Lh4/b$e;->a:Lh4/b$e;

    .line 183
    .line 184
    invoke-virtual {p0, p1}, Li4/a;->M(Lh4/b;)V

    .line 185
    .line 186
    .line 187
    return v2

    .line 188
    :cond_6
    invoke-virtual {p0}, Li4/a;->l()Li4/c;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    invoke-virtual {v0}, Li4/c;->b()Landroid/graphics/RectF;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    invoke-virtual {v0, p1, p2}, Landroid/graphics/RectF;->contains(FF)Z

    .line 197
    .line 198
    .line 199
    move-result v0

    .line 200
    if-eqz v0, :cond_7

    .line 201
    .line 202
    sget-object p1, Lh4/b$e;->a:Lh4/b$e;

    .line 203
    .line 204
    invoke-virtual {p0, p1}, Li4/a;->M(Lh4/b;)V

    .line 205
    .line 206
    .line 207
    return v2

    .line 208
    :cond_7
    invoke-virtual {p0}, Li4/a;->i()Landroid/graphics/Matrix;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    invoke-static {v0}, Le5/m;->b(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    const/4 v3, 0x2

    .line 217
    new-array v4, v3, [F

    .line 218
    .line 219
    aput p1, v4, v1

    .line 220
    .line 221
    aput p2, v4, v2

    .line 222
    .line 223
    invoke-virtual {v0, v4}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 224
    .line 225
    .line 226
    aget p1, v4, v1

    .line 227
    .line 228
    aget p2, v4, v2

    .line 229
    .line 230
    invoke-virtual {p0}, Li4/a;->f()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 231
    .line 232
    .line 233
    move-result-object v4

    .line 234
    invoke-virtual {v4}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectIconWidth()F

    .line 235
    .line 236
    .line 237
    move-result v4

    .line 238
    invoke-virtual {v0, v4}, Landroid/graphics/Matrix;->mapRadius(F)F

    .line 239
    .line 240
    .line 241
    move-result v0

    .line 242
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;->b0()Z

    .line 243
    .line 244
    .line 245
    move-result v4

    .line 246
    if-eqz v4, :cond_c

    .line 247
    .line 248
    invoke-virtual {p0}, Li4/a;->z()Landroid/graphics/PointF;

    .line 249
    .line 250
    .line 251
    move-result-object v4

    .line 252
    if-eqz v4, :cond_8

    .line 253
    .line 254
    new-instance v5, Landroid/graphics/RectF;

    .line 255
    .line 256
    iget v6, v4, Landroid/graphics/PointF;->x:F

    .line 257
    .line 258
    int-to-float v7, v3

    .line 259
    div-float v7, v0, v7

    .line 260
    .line 261
    sub-float v8, v6, v7

    .line 262
    .line 263
    iget v4, v4, Landroid/graphics/PointF;->y:F

    .line 264
    .line 265
    sub-float v9, v4, v7

    .line 266
    .line 267
    add-float/2addr v6, v7

    .line 268
    add-float/2addr v4, v7

    .line 269
    invoke-direct {v5, v8, v9, v6, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {v5, p1, p2}, Landroid/graphics/RectF;->contains(FF)Z

    .line 273
    .line 274
    .line 275
    move-result v4

    .line 276
    if-eqz v4, :cond_8

    .line 277
    .line 278
    sget-object p1, Lh4/b$f;->a:Lh4/b$f;

    .line 279
    .line 280
    invoke-virtual {p0, p1}, Li4/a;->M(Lh4/b;)V

    .line 281
    .line 282
    .line 283
    return v2

    .line 284
    :cond_8
    new-instance v4, Landroid/graphics/RectF;

    .line 285
    .line 286
    invoke-virtual {p0}, Li4/a;->v()Landroid/graphics/RectF;

    .line 287
    .line 288
    .line 289
    move-result-object v5

    .line 290
    iget v5, v5, Landroid/graphics/RectF;->left:F

    .line 291
    .line 292
    int-to-float v6, v3

    .line 293
    div-float v6, v0, v6

    .line 294
    .line 295
    sub-float/2addr v5, v6

    .line 296
    invoke-virtual {p0}, Li4/a;->v()Landroid/graphics/RectF;

    .line 297
    .line 298
    .line 299
    move-result-object v7

    .line 300
    invoke-virtual {v7}, Landroid/graphics/RectF;->centerY()F

    .line 301
    .line 302
    .line 303
    move-result v7

    .line 304
    sub-float/2addr v7, v6

    .line 305
    invoke-virtual {p0}, Li4/a;->v()Landroid/graphics/RectF;

    .line 306
    .line 307
    .line 308
    move-result-object v8

    .line 309
    iget v8, v8, Landroid/graphics/RectF;->left:F

    .line 310
    .line 311
    add-float/2addr v8, v6

    .line 312
    invoke-virtual {p0}, Li4/a;->v()Landroid/graphics/RectF;

    .line 313
    .line 314
    .line 315
    move-result-object v9

    .line 316
    invoke-virtual {v9}, Landroid/graphics/RectF;->centerY()F

    .line 317
    .line 318
    .line 319
    move-result v9

    .line 320
    add-float/2addr v9, v6

    .line 321
    invoke-direct {v4, v5, v7, v8, v9}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 322
    .line 323
    .line 324
    invoke-virtual {v4, p1, p2}, Landroid/graphics/RectF;->contains(FF)Z

    .line 325
    .line 326
    .line 327
    move-result v4

    .line 328
    if-eqz v4, :cond_9

    .line 329
    .line 330
    sget-object p1, Lh4/b$c$b;->a:Lh4/b$c$b;

    .line 331
    .line 332
    invoke-virtual {p0, p1}, Li4/a;->M(Lh4/b;)V

    .line 333
    .line 334
    .line 335
    return v2

    .line 336
    :cond_9
    new-instance v4, Landroid/graphics/RectF;

    .line 337
    .line 338
    invoke-virtual {p0}, Li4/a;->v()Landroid/graphics/RectF;

    .line 339
    .line 340
    .line 341
    move-result-object v5

    .line 342
    invoke-virtual {v5}, Landroid/graphics/RectF;->centerX()F

    .line 343
    .line 344
    .line 345
    move-result v5

    .line 346
    sub-float/2addr v5, v6

    .line 347
    invoke-virtual {p0}, Li4/a;->v()Landroid/graphics/RectF;

    .line 348
    .line 349
    .line 350
    move-result-object v7

    .line 351
    iget v7, v7, Landroid/graphics/RectF;->top:F

    .line 352
    .line 353
    sub-float/2addr v7, v6

    .line 354
    invoke-virtual {p0}, Li4/a;->v()Landroid/graphics/RectF;

    .line 355
    .line 356
    .line 357
    move-result-object v8

    .line 358
    invoke-virtual {v8}, Landroid/graphics/RectF;->centerX()F

    .line 359
    .line 360
    .line 361
    move-result v8

    .line 362
    add-float/2addr v8, v6

    .line 363
    invoke-virtual {p0}, Li4/a;->v()Landroid/graphics/RectF;

    .line 364
    .line 365
    .line 366
    move-result-object v9

    .line 367
    iget v9, v9, Landroid/graphics/RectF;->top:F

    .line 368
    .line 369
    add-float/2addr v9, v6

    .line 370
    invoke-direct {v4, v5, v7, v8, v9}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 371
    .line 372
    .line 373
    invoke-virtual {v4, p1, p2}, Landroid/graphics/RectF;->contains(FF)Z

    .line 374
    .line 375
    .line 376
    move-result v4

    .line 377
    if-eqz v4, :cond_a

    .line 378
    .line 379
    sget-object p1, Lh4/b$c$d;->a:Lh4/b$c$d;

    .line 380
    .line 381
    invoke-virtual {p0, p1}, Li4/a;->M(Lh4/b;)V

    .line 382
    .line 383
    .line 384
    return v2

    .line 385
    :cond_a
    new-instance v4, Landroid/graphics/RectF;

    .line 386
    .line 387
    invoke-virtual {p0}, Li4/a;->v()Landroid/graphics/RectF;

    .line 388
    .line 389
    .line 390
    move-result-object v5

    .line 391
    iget v5, v5, Landroid/graphics/RectF;->right:F

    .line 392
    .line 393
    sub-float/2addr v5, v6

    .line 394
    invoke-virtual {p0}, Li4/a;->v()Landroid/graphics/RectF;

    .line 395
    .line 396
    .line 397
    move-result-object v7

    .line 398
    invoke-virtual {v7}, Landroid/graphics/RectF;->centerY()F

    .line 399
    .line 400
    .line 401
    move-result v7

    .line 402
    sub-float/2addr v7, v6

    .line 403
    invoke-virtual {p0}, Li4/a;->v()Landroid/graphics/RectF;

    .line 404
    .line 405
    .line 406
    move-result-object v8

    .line 407
    iget v8, v8, Landroid/graphics/RectF;->right:F

    .line 408
    .line 409
    add-float/2addr v8, v6

    .line 410
    invoke-virtual {p0}, Li4/a;->v()Landroid/graphics/RectF;

    .line 411
    .line 412
    .line 413
    move-result-object v9

    .line 414
    invoke-virtual {v9}, Landroid/graphics/RectF;->centerY()F

    .line 415
    .line 416
    .line 417
    move-result v9

    .line 418
    add-float/2addr v9, v6

    .line 419
    invoke-direct {v4, v5, v7, v8, v9}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 420
    .line 421
    .line 422
    invoke-virtual {v4, p1, p2}, Landroid/graphics/RectF;->contains(FF)Z

    .line 423
    .line 424
    .line 425
    move-result v4

    .line 426
    if-eqz v4, :cond_b

    .line 427
    .line 428
    sget-object p1, Lh4/b$c$c;->a:Lh4/b$c$c;

    .line 429
    .line 430
    invoke-virtual {p0, p1}, Li4/a;->M(Lh4/b;)V

    .line 431
    .line 432
    .line 433
    return v2

    .line 434
    :cond_b
    new-instance v4, Landroid/graphics/RectF;

    .line 435
    .line 436
    invoke-virtual {p0}, Li4/a;->v()Landroid/graphics/RectF;

    .line 437
    .line 438
    .line 439
    move-result-object v5

    .line 440
    invoke-virtual {v5}, Landroid/graphics/RectF;->centerX()F

    .line 441
    .line 442
    .line 443
    move-result v5

    .line 444
    sub-float/2addr v5, v6

    .line 445
    invoke-virtual {p0}, Li4/a;->v()Landroid/graphics/RectF;

    .line 446
    .line 447
    .line 448
    move-result-object v7

    .line 449
    iget v7, v7, Landroid/graphics/RectF;->bottom:F

    .line 450
    .line 451
    sub-float/2addr v7, v6

    .line 452
    invoke-virtual {p0}, Li4/a;->v()Landroid/graphics/RectF;

    .line 453
    .line 454
    .line 455
    move-result-object v8

    .line 456
    invoke-virtual {v8}, Landroid/graphics/RectF;->centerX()F

    .line 457
    .line 458
    .line 459
    move-result v8

    .line 460
    add-float/2addr v8, v6

    .line 461
    invoke-virtual {p0}, Li4/a;->v()Landroid/graphics/RectF;

    .line 462
    .line 463
    .line 464
    move-result-object v9

    .line 465
    iget v9, v9, Landroid/graphics/RectF;->bottom:F

    .line 466
    .line 467
    add-float/2addr v9, v6

    .line 468
    invoke-direct {v4, v5, v7, v8, v9}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 469
    .line 470
    .line 471
    invoke-virtual {v4, p1, p2}, Landroid/graphics/RectF;->contains(FF)Z

    .line 472
    .line 473
    .line 474
    move-result v4

    .line 475
    if-eqz v4, :cond_c

    .line 476
    .line 477
    sget-object p1, Lh4/b$c$a;->a:Lh4/b$c$a;

    .line 478
    .line 479
    invoke-virtual {p0, p1}, Li4/a;->M(Lh4/b;)V

    .line 480
    .line 481
    .line 482
    return v2

    .line 483
    :cond_c
    new-instance v4, Landroid/graphics/RectF;

    .line 484
    .line 485
    invoke-virtual {p0}, Li4/a;->v()Landroid/graphics/RectF;

    .line 486
    .line 487
    .line 488
    move-result-object v5

    .line 489
    invoke-virtual {v5}, Landroid/graphics/RectF;->centerX()F

    .line 490
    .line 491
    .line 492
    move-result v5

    .line 493
    int-to-float v3, v3

    .line 494
    div-float v6, v0, v3

    .line 495
    .line 496
    sub-float/2addr v5, v6

    .line 497
    invoke-virtual {p0}, Li4/a;->v()Landroid/graphics/RectF;

    .line 498
    .line 499
    .line 500
    move-result-object v7

    .line 501
    iget v7, v7, Landroid/graphics/RectF;->top:F

    .line 502
    .line 503
    const/4 v8, 0x5

    .line 504
    int-to-float v8, v8

    .line 505
    mul-float/2addr v8, v0

    .line 506
    div-float/2addr v8, v3

    .line 507
    sub-float/2addr v7, v8

    .line 508
    invoke-virtual {p0}, Li4/a;->v()Landroid/graphics/RectF;

    .line 509
    .line 510
    .line 511
    move-result-object v8

    .line 512
    invoke-virtual {v8}, Landroid/graphics/RectF;->centerX()F

    .line 513
    .line 514
    .line 515
    move-result v8

    .line 516
    add-float/2addr v8, v6

    .line 517
    invoke-virtual {p0}, Li4/a;->v()Landroid/graphics/RectF;

    .line 518
    .line 519
    .line 520
    move-result-object v9

    .line 521
    iget v9, v9, Landroid/graphics/RectF;->top:F

    .line 522
    .line 523
    const/4 v10, 0x3

    .line 524
    int-to-float v10, v10

    .line 525
    mul-float/2addr v0, v10

    .line 526
    div-float/2addr v0, v3

    .line 527
    sub-float/2addr v9, v0

    .line 528
    invoke-direct {v4, v5, v7, v8, v9}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 529
    .line 530
    .line 531
    invoke-virtual {v4, p1, p2}, Landroid/graphics/RectF;->contains(FF)Z

    .line 532
    .line 533
    .line 534
    move-result v0

    .line 535
    if-eqz v0, :cond_d

    .line 536
    .line 537
    sget-object p1, Lh4/b$h;->a:Lh4/b$h;

    .line 538
    .line 539
    invoke-virtual {p0, p1}, Li4/a;->M(Lh4/b;)V

    .line 540
    .line 541
    .line 542
    return v2

    .line 543
    :cond_d
    new-instance v0, Landroid/graphics/RectF;

    .line 544
    .line 545
    invoke-virtual {p0}, Li4/a;->v()Landroid/graphics/RectF;

    .line 546
    .line 547
    .line 548
    move-result-object v3

    .line 549
    iget v3, v3, Landroid/graphics/RectF;->right:F

    .line 550
    .line 551
    sub-float/2addr v3, v6

    .line 552
    invoke-virtual {p0}, Li4/a;->v()Landroid/graphics/RectF;

    .line 553
    .line 554
    .line 555
    move-result-object v4

    .line 556
    iget v4, v4, Landroid/graphics/RectF;->bottom:F

    .line 557
    .line 558
    sub-float/2addr v4, v6

    .line 559
    invoke-virtual {p0}, Li4/a;->v()Landroid/graphics/RectF;

    .line 560
    .line 561
    .line 562
    move-result-object v5

    .line 563
    iget v5, v5, Landroid/graphics/RectF;->right:F

    .line 564
    .line 565
    add-float/2addr v5, v6

    .line 566
    invoke-virtual {p0}, Li4/a;->v()Landroid/graphics/RectF;

    .line 567
    .line 568
    .line 569
    move-result-object v7

    .line 570
    iget v7, v7, Landroid/graphics/RectF;->bottom:F

    .line 571
    .line 572
    add-float/2addr v7, v6

    .line 573
    invoke-direct {v0, v3, v4, v5, v7}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 574
    .line 575
    .line 576
    invoke-virtual {v0, p1, p2}, Landroid/graphics/RectF;->contains(FF)Z

    .line 577
    .line 578
    .line 579
    move-result v0

    .line 580
    if-eqz v0, :cond_e

    .line 581
    .line 582
    sget-object p1, Lh4/b$i;->a:Lh4/b$i;

    .line 583
    .line 584
    invoke-virtual {p0, p1}, Li4/a;->M(Lh4/b;)V

    .line 585
    .line 586
    .line 587
    return v2

    .line 588
    :cond_e
    invoke-virtual {p0}, Li4/a;->v()Landroid/graphics/RectF;

    .line 589
    .line 590
    .line 591
    move-result-object v0

    .line 592
    invoke-virtual {v0, p1, p2}, Landroid/graphics/RectF;->contains(FF)Z

    .line 593
    .line 594
    .line 595
    move-result p1

    .line 596
    if-eqz p1, :cond_f

    .line 597
    .line 598
    sget-object p1, Lh4/b$b;->a:Lh4/b$b;

    .line 599
    .line 600
    invoke-virtual {p0, p1}, Li4/a;->M(Lh4/b;)V

    .line 601
    .line 602
    .line 603
    return v2

    .line 604
    :cond_f
    sget-object p1, Lh4/b$g;->a:Lh4/b$g;

    .line 605
    .line 606
    invoke-virtual {p0, p1}, Li4/a;->M(Lh4/b;)V

    .line 607
    .line 608
    .line 609
    return v1
.end method

.method public L()V
    .locals 2

    .line 1
    invoke-super {p0}, Li4/a;->L()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;->f0()V

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
    invoke-virtual {p0, v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;->h0(Ljava/lang/Integer;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public P(Ljava/util/List;)V
    .locals 12

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
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;->v:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-static {v0}, Lh4/d;->d(Ljava/util/List;)Lh4/c$b;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_14

    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;->b0()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    invoke-virtual {v0, v1}, Lh4/c$b;->g(Z)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Lh4/c$b;->e()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    const/4 v2, 0x0

    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    const-string v1, "null cannot be cast to non-null type com.zykj.blackboard.core.graph.group.GeometryGraph"

    .line 36
    .line 37
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    check-cast p1, Lr4/b;

    .line 41
    .line 42
    invoke-virtual {p1}, Lr4/b;->J()Landroid/graphics/Paint;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    if-eqz p1, :cond_0

    .line 47
    .line 48
    invoke-virtual {p1}, Landroid/graphics/Paint;->getColor()I

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    goto :goto_0

    .line 57
    :cond_0
    move-object p1, v2

    .line 58
    :goto_0
    invoke-virtual {p0}, Li4/a;->f()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-virtual {v1}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectEditColorList()Ljava/util/List;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-static {v1}, Lh4/d;->a(Ljava/util/List;)Ljava/util/List;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    new-instance v3, Ljava/util/ArrayList;

    .line 71
    .line 72
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 73
    .line 74
    .line 75
    const/4 v4, -0x1

    .line 76
    const/4 v5, 0x0

    .line 77
    if-nez p1, :cond_2

    .line 78
    .line 79
    :cond_1
    move v7, v4

    .line 80
    goto :goto_2

    .line 81
    :cond_2
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 82
    .line 83
    .line 84
    move-result-object v6

    .line 85
    move v7, v5

    .line 86
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 87
    .line 88
    .line 89
    move-result v8

    .line 90
    if-eqz v8, :cond_1

    .line 91
    .line 92
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v8

    .line 96
    check-cast v8, Lh4/f;

    .line 97
    .line 98
    instance-of v9, v8, Lh4/f$b;

    .line 99
    .line 100
    if-nez v9, :cond_3

    .line 101
    .line 102
    invoke-virtual {v8}, Lh4/f;->a()I

    .line 103
    .line 104
    .line 105
    move-result v8

    .line 106
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 107
    .line 108
    .line 109
    move-result v9

    .line 110
    if-ne v8, v9, :cond_3

    .line 111
    .line 112
    goto :goto_2

    .line 113
    :cond_3
    add-int/lit8 v7, v7, 0x1

    .line 114
    .line 115
    goto :goto_1

    .line 116
    :goto_2
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    move v6, v5

    .line 121
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 122
    .line 123
    .line 124
    move-result v8

    .line 125
    if-eqz v8, :cond_11

    .line 126
    .line 127
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v8

    .line 131
    add-int/lit8 v9, v6, 0x1

    .line 132
    .line 133
    if-gez v6, :cond_4

    .line 134
    .line 135
    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    .line 136
    .line 137
    .line 138
    :cond_4
    check-cast v8, Lh4/f;

    .line 139
    .line 140
    instance-of v10, v8, Lh4/f$b;

    .line 141
    .line 142
    const/4 v11, 0x1

    .line 143
    if-eqz v10, :cond_8

    .line 144
    .line 145
    if-eqz p1, :cond_6

    .line 146
    .line 147
    if-ne v7, v4, :cond_6

    .line 148
    .line 149
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 150
    .line 151
    .line 152
    move-result v6

    .line 153
    invoke-virtual {p0}, Li4/a;->f()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 154
    .line 155
    .line 156
    move-result-object v8

    .line 157
    invoke-virtual {v8}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectCustomColorView()Ld5/a;

    .line 158
    .line 159
    .line 160
    move-result-object v8

    .line 161
    if-eqz v8, :cond_5

    .line 162
    .line 163
    invoke-interface {v8, v6}, Ld5/a;->c(I)Z

    .line 164
    .line 165
    .line 166
    move-result v6

    .line 167
    goto :goto_4

    .line 168
    :cond_5
    move v6, v5

    .line 169
    :goto_4
    if-eqz v6, :cond_6

    .line 170
    .line 171
    goto :goto_5

    .line 172
    :cond_6
    move v11, v5

    .line 173
    :goto_5
    new-instance v6, Lh4/f$b;

    .line 174
    .line 175
    if-eqz v11, :cond_7

    .line 176
    .line 177
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 181
    .line 182
    .line 183
    move-result v8

    .line 184
    goto :goto_6

    .line 185
    :cond_7
    move v8, v5

    .line 186
    :goto_6
    invoke-direct {v6, v8, v11, v5}, Lh4/f$b;-><init>(IZZ)V

    .line 187
    .line 188
    .line 189
    goto :goto_c

    .line 190
    :cond_8
    instance-of v10, v8, Lh4/f$a;

    .line 191
    .line 192
    if-eqz v10, :cond_a

    .line 193
    .line 194
    new-instance v8, Lh4/f$a;

    .line 195
    .line 196
    if-ne v6, v7, :cond_9

    .line 197
    .line 198
    goto :goto_7

    .line 199
    :cond_9
    move v11, v5

    .line 200
    :goto_7
    invoke-direct {v8, v11}, Lh4/f$a;-><init>(Z)V

    .line 201
    .line 202
    .line 203
    :goto_8
    move-object v6, v8

    .line 204
    goto :goto_c

    .line 205
    :cond_a
    instance-of v10, v8, Lh4/f$e;

    .line 206
    .line 207
    if-eqz v10, :cond_c

    .line 208
    .line 209
    new-instance v8, Lh4/f$e;

    .line 210
    .line 211
    if-ne v6, v7, :cond_b

    .line 212
    .line 213
    goto :goto_9

    .line 214
    :cond_b
    move v11, v5

    .line 215
    :goto_9
    invoke-direct {v8, v11}, Lh4/f$e;-><init>(Z)V

    .line 216
    .line 217
    .line 218
    goto :goto_8

    .line 219
    :cond_c
    instance-of v10, v8, Lh4/f$d;

    .line 220
    .line 221
    if-eqz v10, :cond_e

    .line 222
    .line 223
    new-instance v8, Lh4/f$d;

    .line 224
    .line 225
    if-ne v6, v7, :cond_d

    .line 226
    .line 227
    goto :goto_a

    .line 228
    :cond_d
    move v11, v5

    .line 229
    :goto_a
    invoke-direct {v8, v11}, Lh4/f$d;-><init>(Z)V

    .line 230
    .line 231
    .line 232
    goto :goto_8

    .line 233
    :cond_e
    instance-of v10, v8, Lh4/f$c;

    .line 234
    .line 235
    if-eqz v10, :cond_10

    .line 236
    .line 237
    new-instance v10, Lh4/f$c;

    .line 238
    .line 239
    invoke-virtual {v8}, Lh4/f;->a()I

    .line 240
    .line 241
    .line 242
    move-result v8

    .line 243
    if-ne v6, v7, :cond_f

    .line 244
    .line 245
    goto :goto_b

    .line 246
    :cond_f
    move v11, v5

    .line 247
    :goto_b
    invoke-direct {v10, v8, v11}, Lh4/f$c;-><init>(IZ)V

    .line 248
    .line 249
    .line 250
    move-object v6, v10

    .line 251
    :goto_c
    invoke-interface {v3, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 252
    .line 253
    .line 254
    move v6, v9

    .line 255
    goto/16 :goto_3

    .line 256
    .line 257
    :cond_10
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 258
    .line 259
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 260
    .line 261
    .line 262
    throw p1

    .line 263
    :cond_11
    invoke-virtual {v0, v3}, Lh4/c$b;->f(Ljava/util/List;)V

    .line 264
    .line 265
    .line 266
    invoke-virtual {p0}, Li4/a;->f()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 267
    .line 268
    .line 269
    move-result-object p1

    .line 270
    invoke-virtual {p1}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectCustomColorView()Ld5/a;

    .line 271
    .line 272
    .line 273
    move-result-object p1

    .line 274
    if-eqz p1, :cond_13

    .line 275
    .line 276
    invoke-virtual {v0}, Lh4/c$b;->d()Ljava/util/List;

    .line 277
    .line 278
    .line 279
    move-result-object v0

    .line 280
    invoke-static {v0}, Lh4/d;->c(Ljava/util/List;)Lh4/f$b;

    .line 281
    .line 282
    .line 283
    move-result-object v0

    .line 284
    if-eqz v0, :cond_12

    .line 285
    .line 286
    invoke-virtual {v0}, Lh4/f;->a()I

    .line 287
    .line 288
    .line 289
    move-result v0

    .line 290
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 291
    .line 292
    .line 293
    move-result-object v2

    .line 294
    :cond_12
    invoke-interface {p1, v2}, Ld5/a;->a(Ljava/lang/Integer;)V

    .line 295
    .line 296
    .line 297
    :cond_13
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;->g0()V

    .line 298
    .line 299
    .line 300
    :cond_14
    return-void
.end method

.method public X()V
    .locals 14

    .line 1
    invoke-virtual {p0}, Li4/a;->m()Li4/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Li4/e;->d()Landroid/graphics/RectF;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {p0}, Li4/a;->t()Landroid/graphics/RectF;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    iget v2, v2, Landroid/graphics/RectF;->left:F

    .line 14
    .line 15
    iget-object v3, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;->w:Ljava/util/ArrayList;

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
    invoke-virtual {p0}, Li4/a;->t()Landroid/graphics/RectF;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    iget v5, v5, Landroid/graphics/RectF;->top:F

    .line 35
    .line 36
    invoke-virtual {p0}, Li4/a;->t()Landroid/graphics/RectF;

    .line 37
    .line 38
    .line 39
    move-result-object v6

    .line 40
    iget v6, v6, Landroid/graphics/RectF;->left:F

    .line 41
    .line 42
    iget-object v7, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;->w:Ljava/util/ArrayList;

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
    invoke-virtual {p0}, Li4/a;->t()Landroid/graphics/RectF;

    .line 55
    .line 56
    .line 57
    move-result-object v7

    .line 58
    iget v7, v7, Landroid/graphics/RectF;->top:F

    .line 59
    .line 60
    invoke-virtual {p0}, Li4/a;->f()Lcom/zykj/blackboard/bean/BoardConfig;

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
    invoke-virtual {v0}, Li4/e;->c()Landroid/graphics/RectF;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-virtual {p0}, Li4/a;->t()Landroid/graphics/RectF;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    iget v2, v2, Landroid/graphics/RectF;->left:F

    .line 81
    .line 82
    iget-object v5, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;->w:Ljava/util/ArrayList;

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
    invoke-virtual {p0}, Li4/a;->t()Landroid/graphics/RectF;

    .line 96
    .line 97
    .line 98
    move-result-object v5

    .line 99
    iget v5, v5, Landroid/graphics/RectF;->top:F

    .line 100
    .line 101
    invoke-virtual {p0}, Li4/a;->t()Landroid/graphics/RectF;

    .line 102
    .line 103
    .line 104
    move-result-object v7

    .line 105
    iget v7, v7, Landroid/graphics/RectF;->left:F

    .line 106
    .line 107
    iget-object v8, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;->w:Ljava/util/ArrayList;

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
    invoke-virtual {p0}, Li4/a;->t()Landroid/graphics/RectF;

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    iget v3, v3, Landroid/graphics/RectF;->top:F

    .line 124
    .line 125
    invoke-virtual {p0}, Li4/a;->f()Lcom/zykj/blackboard/bean/BoardConfig;

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
    invoke-virtual {v0}, Li4/e;->a()Ljava/util/ArrayList;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 142
    .line 143
    .line 144
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;->x:Ljava/util/ArrayList;

    .line 145
    .line 146
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 147
    .line 148
    .line 149
    move-result v2

    .line 150
    move v3, v4

    .line 151
    :goto_0
    const/high16 v5, 0x41500000    # 13.0f

    .line 152
    .line 153
    if-ge v3, v2, :cond_0

    .line 154
    .line 155
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v6

    .line 159
    add-int/lit8 v3, v3, 0x1

    .line 160
    .line 161
    check-cast v6, Landroid/graphics/RectF;

    .line 162
    .line 163
    invoke-virtual {v0}, Li4/e;->a()Ljava/util/ArrayList;

    .line 164
    .line 165
    .line 166
    move-result-object v7

    .line 167
    new-instance v8, Landroid/graphics/RectF;

    .line 168
    .line 169
    invoke-virtual {p0}, Li4/a;->t()Landroid/graphics/RectF;

    .line 170
    .line 171
    .line 172
    move-result-object v9

    .line 173
    iget v9, v9, Landroid/graphics/RectF;->left:F

    .line 174
    .line 175
    iget v10, v6, Landroid/graphics/RectF;->left:F

    .line 176
    .line 177
    add-float/2addr v9, v10

    .line 178
    invoke-virtual {p0}, Li4/a;->t()Landroid/graphics/RectF;

    .line 179
    .line 180
    .line 181
    move-result-object v10

    .line 182
    iget v10, v10, Landroid/graphics/RectF;->top:F

    .line 183
    .line 184
    invoke-virtual {p0}, Li4/a;->f()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 185
    .line 186
    .line 187
    move-result-object v11

    .line 188
    invoke-virtual {v11}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectButtonHeight()F

    .line 189
    .line 190
    .line 191
    move-result v11

    .line 192
    add-float/2addr v11, v5

    .line 193
    add-float/2addr v10, v11

    .line 194
    iget v11, v6, Landroid/graphics/RectF;->top:F

    .line 195
    .line 196
    add-float/2addr v10, v11

    .line 197
    invoke-virtual {p0}, Li4/a;->t()Landroid/graphics/RectF;

    .line 198
    .line 199
    .line 200
    move-result-object v11

    .line 201
    iget v11, v11, Landroid/graphics/RectF;->left:F

    .line 202
    .line 203
    iget v12, v6, Landroid/graphics/RectF;->right:F

    .line 204
    .line 205
    add-float/2addr v11, v12

    .line 206
    invoke-virtual {p0}, Li4/a;->t()Landroid/graphics/RectF;

    .line 207
    .line 208
    .line 209
    move-result-object v12

    .line 210
    iget v12, v12, Landroid/graphics/RectF;->top:F

    .line 211
    .line 212
    invoke-virtual {p0}, Li4/a;->f()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 213
    .line 214
    .line 215
    move-result-object v13

    .line 216
    invoke-virtual {v13}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectButtonHeight()F

    .line 217
    .line 218
    .line 219
    move-result v13

    .line 220
    add-float/2addr v13, v5

    .line 221
    add-float/2addr v12, v13

    .line 222
    iget v5, v6, Landroid/graphics/RectF;->bottom:F

    .line 223
    .line 224
    add-float/2addr v12, v5

    .line 225
    invoke-direct {v8, v9, v10, v11, v12}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 229
    .line 230
    .line 231
    goto :goto_0

    .line 232
    :cond_0
    invoke-virtual {p0}, Li4/a;->m()Li4/e;

    .line 233
    .line 234
    .line 235
    move-result-object v1

    .line 236
    invoke-virtual {v1}, Li4/e;->b()Landroid/graphics/RectF;

    .line 237
    .line 238
    .line 239
    move-result-object v1

    .line 240
    invoke-virtual {v1}, Landroid/graphics/RectF;->setEmpty()V

    .line 241
    .line 242
    .line 243
    invoke-virtual {p0}, Li4/a;->f()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 244
    .line 245
    .line 246
    move-result-object v1

    .line 247
    invoke-virtual {v1}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectCustomColorView()Ld5/a;

    .line 248
    .line 249
    .line 250
    move-result-object v1

    .line 251
    if-eqz v1, :cond_3

    .line 252
    .line 253
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;->Z()Ljava/util/List;

    .line 254
    .line 255
    .line 256
    move-result-object v2

    .line 257
    const/4 v3, 0x0

    .line 258
    if-eqz v2, :cond_1

    .line 259
    .line 260
    invoke-static {v2}, Lh4/d;->c(Ljava/util/List;)Lh4/f$b;

    .line 261
    .line 262
    .line 263
    move-result-object v2

    .line 264
    goto :goto_1

    .line 265
    :cond_1
    move-object v2, v3

    .line 266
    :goto_1
    if-eqz v2, :cond_2

    .line 267
    .line 268
    goto :goto_2

    .line 269
    :cond_2
    move-object v1, v3

    .line 270
    :goto_2
    if-eqz v1, :cond_3

    .line 271
    .line 272
    invoke-virtual {v0}, Li4/e;->b()Landroid/graphics/RectF;

    .line 273
    .line 274
    .line 275
    move-result-object v2

    .line 276
    invoke-virtual {p0}, Li4/a;->t()Landroid/graphics/RectF;

    .line 277
    .line 278
    .line 279
    move-result-object v3

    .line 280
    iget v3, v3, Landroid/graphics/RectF;->left:F

    .line 281
    .line 282
    invoke-virtual {p0}, Li4/a;->t()Landroid/graphics/RectF;

    .line 283
    .line 284
    .line 285
    move-result-object v6

    .line 286
    iget v6, v6, Landroid/graphics/RectF;->top:F

    .line 287
    .line 288
    invoke-virtual {p0}, Li4/a;->f()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 289
    .line 290
    .line 291
    move-result-object v7

    .line 292
    invoke-virtual {v7}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectButtonHeight()F

    .line 293
    .line 294
    .line 295
    move-result v7

    .line 296
    add-float/2addr v7, v5

    .line 297
    const/4 v8, 0x2

    .line 298
    int-to-float v8, v8

    .line 299
    mul-float/2addr v7, v8

    .line 300
    add-float/2addr v6, v7

    .line 301
    invoke-virtual {p0}, Li4/a;->t()Landroid/graphics/RectF;

    .line 302
    .line 303
    .line 304
    move-result-object v7

    .line 305
    iget v7, v7, Landroid/graphics/RectF;->left:F

    .line 306
    .line 307
    invoke-interface {v1}, Ld5/a;->getWidth()F

    .line 308
    .line 309
    .line 310
    move-result v9

    .line 311
    add-float/2addr v7, v9

    .line 312
    invoke-virtual {p0}, Li4/a;->t()Landroid/graphics/RectF;

    .line 313
    .line 314
    .line 315
    move-result-object v9

    .line 316
    iget v9, v9, Landroid/graphics/RectF;->top:F

    .line 317
    .line 318
    invoke-virtual {p0}, Li4/a;->f()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 319
    .line 320
    .line 321
    move-result-object v10

    .line 322
    invoke-virtual {v10}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectButtonHeight()F

    .line 323
    .line 324
    .line 325
    move-result v10

    .line 326
    add-float/2addr v10, v5

    .line 327
    mul-float/2addr v10, v8

    .line 328
    add-float/2addr v9, v10

    .line 329
    invoke-interface {v1}, Ld5/a;->getHeight()F

    .line 330
    .line 331
    .line 332
    move-result v1

    .line 333
    add-float/2addr v9, v1

    .line 334
    invoke-virtual {v2, v3, v6, v7, v9}, Landroid/graphics/RectF;->set(FFFF)V

    .line 335
    .line 336
    .line 337
    :cond_3
    invoke-virtual {p0}, Li4/a;->K()Z

    .line 338
    .line 339
    .line 340
    move-result v1

    .line 341
    if-nez v1, :cond_5

    .line 342
    .line 343
    invoke-virtual {v0}, Li4/e;->c()Landroid/graphics/RectF;

    .line 344
    .line 345
    .line 346
    move-result-object v1

    .line 347
    iget v1, v1, Landroid/graphics/RectF;->right:F

    .line 348
    .line 349
    invoke-virtual {v0}, Li4/e;->d()Landroid/graphics/RectF;

    .line 350
    .line 351
    .line 352
    move-result-object v2

    .line 353
    iget v2, v2, Landroid/graphics/RectF;->left:F

    .line 354
    .line 355
    sub-float/2addr v1, v2

    .line 356
    const/high16 v2, 0x41800000    # 16.0f

    .line 357
    .line 358
    add-float/2addr v1, v2

    .line 359
    invoke-virtual {v0}, Li4/e;->d()Landroid/graphics/RectF;

    .line 360
    .line 361
    .line 362
    move-result-object v2

    .line 363
    invoke-virtual {p0}, Li4/a;->t()Landroid/graphics/RectF;

    .line 364
    .line 365
    .line 366
    move-result-object v3

    .line 367
    invoke-virtual {v3}, Landroid/graphics/RectF;->width()F

    .line 368
    .line 369
    .line 370
    move-result v3

    .line 371
    sub-float/2addr v3, v1

    .line 372
    const/4 v5, 0x0

    .line 373
    invoke-virtual {v2, v3, v5}, Landroid/graphics/RectF;->offset(FF)V

    .line 374
    .line 375
    .line 376
    invoke-virtual {v0}, Li4/e;->c()Landroid/graphics/RectF;

    .line 377
    .line 378
    .line 379
    move-result-object v2

    .line 380
    invoke-virtual {p0}, Li4/a;->t()Landroid/graphics/RectF;

    .line 381
    .line 382
    .line 383
    move-result-object v3

    .line 384
    invoke-virtual {v3}, Landroid/graphics/RectF;->width()F

    .line 385
    .line 386
    .line 387
    move-result v3

    .line 388
    sub-float/2addr v3, v1

    .line 389
    invoke-virtual {v2, v3, v5}, Landroid/graphics/RectF;->offset(FF)V

    .line 390
    .line 391
    .line 392
    invoke-virtual {v0}, Li4/e;->a()Ljava/util/ArrayList;

    .line 393
    .line 394
    .line 395
    move-result-object v1

    .line 396
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->last(Ljava/util/List;)Ljava/lang/Object;

    .line 397
    .line 398
    .line 399
    move-result-object v1

    .line 400
    check-cast v1, Landroid/graphics/RectF;

    .line 401
    .line 402
    iget v1, v1, Landroid/graphics/RectF;->right:F

    .line 403
    .line 404
    invoke-virtual {v0}, Li4/e;->a()Ljava/util/ArrayList;

    .line 405
    .line 406
    .line 407
    move-result-object v2

    .line 408
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    .line 409
    .line 410
    .line 411
    move-result-object v2

    .line 412
    check-cast v2, Landroid/graphics/RectF;

    .line 413
    .line 414
    iget v2, v2, Landroid/graphics/RectF;->left:F

    .line 415
    .line 416
    sub-float/2addr v1, v2

    .line 417
    const/high16 v2, 0x42380000    # 46.0f

    .line 418
    .line 419
    add-float/2addr v1, v2

    .line 420
    invoke-virtual {v0}, Li4/e;->a()Ljava/util/ArrayList;

    .line 421
    .line 422
    .line 423
    move-result-object v2

    .line 424
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 425
    .line 426
    .line 427
    move-result v3

    .line 428
    :goto_3
    if-ge v4, v3, :cond_4

    .line 429
    .line 430
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 431
    .line 432
    .line 433
    move-result-object v6

    .line 434
    add-int/lit8 v4, v4, 0x1

    .line 435
    .line 436
    check-cast v6, Landroid/graphics/RectF;

    .line 437
    .line 438
    invoke-virtual {p0}, Li4/a;->t()Landroid/graphics/RectF;

    .line 439
    .line 440
    .line 441
    move-result-object v7

    .line 442
    invoke-virtual {v7}, Landroid/graphics/RectF;->width()F

    .line 443
    .line 444
    .line 445
    move-result v7

    .line 446
    sub-float/2addr v7, v1

    .line 447
    invoke-virtual {v6, v7, v5}, Landroid/graphics/RectF;->offset(FF)V

    .line 448
    .line 449
    .line 450
    goto :goto_3

    .line 451
    :cond_4
    invoke-virtual {v0}, Li4/e;->b()Landroid/graphics/RectF;

    .line 452
    .line 453
    .line 454
    move-result-object v1

    .line 455
    invoke-virtual {v1}, Landroid/graphics/RectF;->width()F

    .line 456
    .line 457
    .line 458
    move-result v1

    .line 459
    invoke-virtual {v0}, Li4/e;->b()Landroid/graphics/RectF;

    .line 460
    .line 461
    .line 462
    move-result-object v0

    .line 463
    invoke-virtual {p0}, Li4/a;->t()Landroid/graphics/RectF;

    .line 464
    .line 465
    .line 466
    move-result-object v2

    .line 467
    invoke-virtual {v2}, Landroid/graphics/RectF;->width()F

    .line 468
    .line 469
    .line 470
    move-result v2

    .line 471
    sub-float/2addr v2, v1

    .line 472
    invoke-virtual {v0, v2, v5}, Landroid/graphics/RectF;->offset(FF)V

    .line 473
    .line 474
    .line 475
    :cond_5
    return-void
.end method

.method public final Y()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Li4/a;->t()Landroid/graphics/RectF;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;->s()Landroid/graphics/RectF;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Li4/a;->t()Landroid/graphics/RectF;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {p0}, Li4/a;->w()Landroid/graphics/RectF;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {p0}, Li4/a;->p()Landroid/graphics/RectF;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {p0}, Li4/a;->x()Lkotlin/Pair;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-virtual {p0, v0, v1, v2, v3}, Li4/a;->n(Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/RectF;Lkotlin/Pair;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    invoke-virtual {p0, v0}, Li4/a;->N(Z)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;->X()V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Li4/a;->W()V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public final Z()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;->v:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-static {v0}, Lh4/d;->d(Ljava/util/List;)Lh4/c$b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Lh4/c$b;->d()Ljava/util/List;

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

.method public a0()Ljava/lang/Integer;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;->u:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object v0
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
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;->a0()Ljava/lang/Integer;

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

.method public final b0()Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Li4/a;->u()Ljava/util/ArrayList;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x1

    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    return v1

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return v0
.end method

.method public final c(FF)F
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpg-float v1, p1, v0

    .line 3
    .line 4
    if-nez v1, :cond_1

    .line 5
    .line 6
    cmpl-float p1, p2, v0

    .line 7
    .line 8
    if-lez p1, :cond_0

    .line 9
    .line 10
    const-wide p1, 0x4056800000000000L    # 90.0

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const-wide p1, -0x3fa9800000000000L    # -90.0

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    :goto_0
    invoke-static {p1, p2}, Ljava/lang/Math;->toRadians(D)D

    .line 22
    .line 23
    .line 24
    move-result-wide p1

    .line 25
    double-to-float p1, p1

    .line 26
    return p1

    .line 27
    :cond_1
    cmpl-float v1, p1, v0

    .line 28
    .line 29
    if-lez v1, :cond_2

    .line 30
    .line 31
    move v1, v0

    .line 32
    goto :goto_1

    .line 33
    :cond_2
    const-wide v1, 0x4066800000000000L    # 180.0

    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    invoke-static {v1, v2}, Ljava/lang/Math;->toRadians(D)D

    .line 39
    .line 40
    .line 41
    move-result-wide v1

    .line 42
    double-to-float v1, v1

    .line 43
    :goto_1
    cmpl-float v0, p2, v0

    .line 44
    .line 45
    if-lez v0, :cond_3

    .line 46
    .line 47
    const/4 v0, -0x1

    .line 48
    goto :goto_2

    .line 49
    :cond_3
    const/4 v0, 0x1

    .line 50
    :goto_2
    div-float/2addr p2, p1

    .line 51
    float-to-double p1, p2

    .line 52
    invoke-static {p1, p2}, Ljava/lang/Math;->atan(D)D

    .line 53
    .line 54
    .line 55
    move-result-wide p1

    .line 56
    double-to-float p1, p1

    .line 57
    int-to-float p2, v0

    .line 58
    mul-float/2addr v1, p2

    .line 59
    add-float/2addr v1, p1

    .line 60
    return v1
.end method

.method public final c0(FF)V
    .locals 11

    .line 1
    new-instance v0, Landroid/graphics/PointF;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;->A:Landroid/graphics/PointF;

    .line 7
    .line 8
    iget v3, v1, Landroid/graphics/PointF;->x:F

    .line 9
    .line 10
    iget v4, v1, Landroid/graphics/PointF;->y:F

    .line 11
    .line 12
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;->B:Landroid/graphics/PointF;

    .line 13
    .line 14
    iget v5, v1, Landroid/graphics/PointF;->x:F

    .line 15
    .line 16
    iget v6, v1, Landroid/graphics/PointF;->y:F

    .line 17
    .line 18
    move v7, v3

    .line 19
    move v8, v4

    .line 20
    move-object v2, p0

    .line 21
    move v9, p1

    .line 22
    move v10, p2

    .line 23
    invoke-virtual/range {v2 .. v10}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;->d(FFFFFFFF)F

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    const/4 p2, 0x0

    .line 28
    cmpg-float p2, p1, p2

    .line 29
    .line 30
    if-gez p2, :cond_0

    .line 31
    .line 32
    iget-object p1, v2, Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;->A:Landroid/graphics/PointF;

    .line 33
    .line 34
    invoke-virtual {v0, p1}, Landroid/graphics/PointF;->set(Landroid/graphics/PointF;)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    iget-object p2, v2, Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;->A:Landroid/graphics/PointF;

    .line 39
    .line 40
    iget v1, p2, Landroid/graphics/PointF;->x:F

    .line 41
    .line 42
    iget-object v3, v2, Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;->B:Landroid/graphics/PointF;

    .line 43
    .line 44
    iget v4, v3, Landroid/graphics/PointF;->x:F

    .line 45
    .line 46
    sub-float v5, v1, v4

    .line 47
    .line 48
    sub-float/2addr v1, v4

    .line 49
    mul-float/2addr v5, v1

    .line 50
    iget p2, p2, Landroid/graphics/PointF;->y:F

    .line 51
    .line 52
    iget v1, v3, Landroid/graphics/PointF;->y:F

    .line 53
    .line 54
    sub-float v3, p2, v1

    .line 55
    .line 56
    sub-float/2addr p2, v1

    .line 57
    mul-float/2addr v3, p2

    .line 58
    add-float/2addr v5, v3

    .line 59
    float-to-double v3, v5

    .line 60
    invoke-static {v3, v4}, Ljava/lang/Math;->sqrt(D)D

    .line 61
    .line 62
    .line 63
    move-result-wide v3

    .line 64
    double-to-float p2, v3

    .line 65
    cmpl-float v1, p1, p2

    .line 66
    .line 67
    if-lez v1, :cond_1

    .line 68
    .line 69
    iget-object p1, v2, Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;->B:Landroid/graphics/PointF;

    .line 70
    .line 71
    invoke-virtual {v0, p1}, Landroid/graphics/PointF;->set(Landroid/graphics/PointF;)V

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_1
    div-float/2addr p1, p2

    .line 76
    iget-object p2, v2, Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;->A:Landroid/graphics/PointF;

    .line 77
    .line 78
    iget v1, p2, Landroid/graphics/PointF;->x:F

    .line 79
    .line 80
    iget-object v3, v2, Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;->B:Landroid/graphics/PointF;

    .line 81
    .line 82
    iget v4, v3, Landroid/graphics/PointF;->x:F

    .line 83
    .line 84
    sub-float/2addr v4, v1

    .line 85
    mul-float/2addr v4, p1

    .line 86
    add-float/2addr v1, v4

    .line 87
    iget p2, p2, Landroid/graphics/PointF;->y:F

    .line 88
    .line 89
    iget v3, v3, Landroid/graphics/PointF;->y:F

    .line 90
    .line 91
    sub-float/2addr v3, p2

    .line 92
    mul-float/2addr v3, p1

    .line 93
    add-float/2addr p2, v3

    .line 94
    invoke-virtual {v0, v1, p2}, Landroid/graphics/PointF;->set(FF)V

    .line 95
    .line 96
    .line 97
    :goto_0
    sget-object p1, Le5/n;->a:Le5/n;

    .line 98
    .line 99
    invoke-virtual {p0}, Li4/a;->i()Landroid/graphics/Matrix;

    .line 100
    .line 101
    .line 102
    move-result-object p2

    .line 103
    invoke-static {p2}, Le5/m;->b(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 104
    .line 105
    .line 106
    move-result-object p2

    .line 107
    invoke-virtual {p1, v0, p2}, Le5/n;->e(Landroid/graphics/PointF;Landroid/graphics/Matrix;)Landroid/graphics/PointF;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    invoke-virtual {v0, p1}, Landroid/graphics/PointF;->set(Landroid/graphics/PointF;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p0}, Li4/a;->u()Ljava/util/ArrayList;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    check-cast p1, Lq4/c;

    .line 123
    .line 124
    if-eqz p1, :cond_2

    .line 125
    .line 126
    check-cast p1, Lr4/b;

    .line 127
    .line 128
    new-instance p2, Landroid/graphics/PointF;

    .line 129
    .line 130
    invoke-virtual {p1}, Lq4/a;->g()Landroid/graphics/RectF;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    iget v1, v1, Landroid/graphics/RectF;->left:F

    .line 135
    .line 136
    invoke-virtual {p1}, Lq4/a;->g()Landroid/graphics/RectF;

    .line 137
    .line 138
    .line 139
    move-result-object v3

    .line 140
    iget v3, v3, Landroid/graphics/RectF;->bottom:F

    .line 141
    .line 142
    invoke-direct {p2, v1, v3}, Landroid/graphics/PointF;-><init>(FF)V

    .line 143
    .line 144
    .line 145
    new-instance v1, Landroid/graphics/PointF;

    .line 146
    .line 147
    invoke-virtual {p1}, Lq4/a;->g()Landroid/graphics/RectF;

    .line 148
    .line 149
    .line 150
    move-result-object v3

    .line 151
    iget v3, v3, Landroid/graphics/RectF;->right:F

    .line 152
    .line 153
    invoke-virtual {p1}, Lq4/a;->g()Landroid/graphics/RectF;

    .line 154
    .line 155
    .line 156
    move-result-object v4

    .line 157
    iget v4, v4, Landroid/graphics/RectF;->bottom:F

    .line 158
    .line 159
    invoke-direct {v1, v3, v4}, Landroid/graphics/PointF;-><init>(FF)V

    .line 160
    .line 161
    .line 162
    filled-new-array {v0, p2, v1}, [Landroid/graphics/PointF;

    .line 163
    .line 164
    .line 165
    move-result-object p2

    .line 166
    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    .line 167
    .line 168
    .line 169
    move-result-object p2

    .line 170
    invoke-virtual {p1, p2}, Lr4/b;->N(Ljava/util/List;)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {p0}, Li4/a;->z()Landroid/graphics/PointF;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    if-eqz p1, :cond_2

    .line 178
    .line 179
    invoke-virtual {p1, v0}, Landroid/graphics/PointF;->set(Landroid/graphics/PointF;)V

    .line 180
    .line 181
    .line 182
    :cond_2
    return-void
.end method

.method public final d(FFFFFFFF)F
    .locals 0

    .line 1
    sub-float/2addr p3, p1

    .line 2
    sub-float/2addr p4, p2

    .line 3
    invoke-virtual {p0, p3, p4}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;->c(FF)F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    sub-float/2addr p7, p5

    .line 8
    sub-float/2addr p8, p6

    .line 9
    invoke-virtual {p0, p7, p8}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;->c(FF)F

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    sub-float/2addr p1, p2

    .line 14
    mul-float/2addr p7, p7

    .line 15
    mul-float/2addr p8, p8

    .line 16
    add-float/2addr p7, p8

    .line 17
    float-to-double p2, p7

    .line 18
    invoke-static {p2, p3}, Ljava/lang/Math;->sqrt(D)D

    .line 19
    .line 20
    .line 21
    move-result-wide p2

    .line 22
    double-to-float p2, p2

    .line 23
    float-to-double p3, p1

    .line 24
    invoke-static {p3, p4}, Ljava/lang/Math;->cos(D)D

    .line 25
    .line 26
    .line 27
    move-result-wide p3

    .line 28
    double-to-float p1, p3

    .line 29
    mul-float/2addr p1, p2

    .line 30
    return p1
.end method

.method public final d0(Lh4/b$c;FF)V
    .locals 12

    .line 1
    invoke-virtual {p0}, Li4/a;->u()Ljava/util/ArrayList;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lq4/c;

    .line 10
    .line 11
    if-eqz v0, :cond_e

    .line 12
    .line 13
    move-object v9, v0

    .line 14
    check-cast v9, Lr4/b;

    .line 15
    .line 16
    new-instance v10, Landroid/graphics/Matrix;

    .line 17
    .line 18
    invoke-direct {v10}, Landroid/graphics/Matrix;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v9}, Lq4/a;->b()Landroid/graphics/Matrix;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v10, v0}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Li4/a;->r()Lj4/a;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v0}, Lj4/a;->b()Landroid/graphics/Matrix;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v10, v0}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 37
    .line 38
    .line 39
    sget-object v0, Le5/n;->a:Le5/n;

    .line 40
    .line 41
    invoke-virtual {v9}, Lq4/a;->g()Landroid/graphics/RectF;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    iget v1, v1, Landroid/graphics/RectF;->left:F

    .line 46
    .line 47
    invoke-virtual {v9}, Lq4/a;->g()Landroid/graphics/RectF;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    iget v2, v2, Landroid/graphics/RectF;->top:F

    .line 52
    .line 53
    invoke-virtual {v0, v1, v2, v10}, Le5/n;->d(FFLandroid/graphics/Matrix;)Landroid/graphics/PointF;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-virtual {v9}, Lq4/a;->g()Landroid/graphics/RectF;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    iget v2, v2, Landroid/graphics/RectF;->right:F

    .line 62
    .line 63
    invoke-virtual {v9}, Lq4/a;->g()Landroid/graphics/RectF;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    iget v3, v3, Landroid/graphics/RectF;->top:F

    .line 68
    .line 69
    invoke-virtual {v0, v2, v3, v10}, Le5/n;->d(FFLandroid/graphics/Matrix;)Landroid/graphics/PointF;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    invoke-virtual {v9}, Lq4/a;->g()Landroid/graphics/RectF;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    iget v3, v3, Landroid/graphics/RectF;->left:F

    .line 78
    .line 79
    invoke-virtual {v9}, Lq4/a;->g()Landroid/graphics/RectF;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    iget v4, v4, Landroid/graphics/RectF;->bottom:F

    .line 84
    .line 85
    invoke-virtual {v0, v3, v4, v10}, Le5/n;->d(FFLandroid/graphics/Matrix;)Landroid/graphics/PointF;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    instance-of v11, p1, Lh4/b$c$b;

    .line 90
    .line 91
    if-eqz v11, :cond_0

    .line 92
    .line 93
    iget v0, v2, Landroid/graphics/PointF;->x:F

    .line 94
    .line 95
    iget v2, v2, Landroid/graphics/PointF;->y:F

    .line 96
    .line 97
    iget v3, v1, Landroid/graphics/PointF;->x:F

    .line 98
    .line 99
    iget v1, v1, Landroid/graphics/PointF;->y:F

    .line 100
    .line 101
    move v4, v1

    .line 102
    :goto_0
    move v1, v0

    .line 103
    goto :goto_1

    .line 104
    :cond_0
    instance-of v3, p1, Lh4/b$c$d;

    .line 105
    .line 106
    if-eqz v3, :cond_1

    .line 107
    .line 108
    iget v2, v0, Landroid/graphics/PointF;->x:F

    .line 109
    .line 110
    iget v0, v0, Landroid/graphics/PointF;->y:F

    .line 111
    .line 112
    iget v3, v1, Landroid/graphics/PointF;->x:F

    .line 113
    .line 114
    iget v1, v1, Landroid/graphics/PointF;->y:F

    .line 115
    .line 116
    move v4, v1

    .line 117
    move v1, v2

    .line 118
    move v2, v0

    .line 119
    goto :goto_1

    .line 120
    :cond_1
    instance-of v3, p1, Lh4/b$c$c;

    .line 121
    .line 122
    if-eqz v3, :cond_2

    .line 123
    .line 124
    iget v0, v1, Landroid/graphics/PointF;->x:F

    .line 125
    .line 126
    iget v1, v1, Landroid/graphics/PointF;->y:F

    .line 127
    .line 128
    iget v3, v2, Landroid/graphics/PointF;->x:F

    .line 129
    .line 130
    iget v2, v2, Landroid/graphics/PointF;->y:F

    .line 131
    .line 132
    move v4, v2

    .line 133
    move v2, v1

    .line 134
    goto :goto_0

    .line 135
    :cond_2
    instance-of v2, p1, Lh4/b$c$a;

    .line 136
    .line 137
    if-eqz v2, :cond_d

    .line 138
    .line 139
    iget v2, v1, Landroid/graphics/PointF;->x:F

    .line 140
    .line 141
    iget v1, v1, Landroid/graphics/PointF;->y:F

    .line 142
    .line 143
    iget v3, v0, Landroid/graphics/PointF;->x:F

    .line 144
    .line 145
    iget v0, v0, Landroid/graphics/PointF;->y:F

    .line 146
    .line 147
    move v4, v2

    .line 148
    move v2, v1

    .line 149
    move v1, v4

    .line 150
    move v4, v0

    .line 151
    :goto_1
    invoke-virtual {p0}, Li4/a;->j()F

    .line 152
    .line 153
    .line 154
    move-result v5

    .line 155
    invoke-virtual {p0}, Li4/a;->k()F

    .line 156
    .line 157
    .line 158
    move-result v6

    .line 159
    move-object v0, p0

    .line 160
    move v7, p2

    .line 161
    move v8, p3

    .line 162
    invoke-virtual/range {v0 .. v8}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;->d(FFFFFFFF)F

    .line 163
    .line 164
    .line 165
    move-result v1

    .line 166
    iget v2, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;->y:F

    .line 167
    .line 168
    iget v3, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;->z:F

    .line 169
    .line 170
    const/4 v4, 0x1

    .line 171
    if-eqz v11, :cond_3

    .line 172
    .line 173
    move v5, v4

    .line 174
    goto :goto_2

    .line 175
    :cond_3
    instance-of v5, p1, Lh4/b$c$c;

    .line 176
    .line 177
    :goto_2
    if-eqz v5, :cond_4

    .line 178
    .line 179
    add-float/2addr v2, v1

    .line 180
    goto :goto_4

    .line 181
    :cond_4
    instance-of v5, p1, Lh4/b$c$d;

    .line 182
    .line 183
    if-eqz v5, :cond_5

    .line 184
    .line 185
    goto :goto_3

    .line 186
    :cond_5
    instance-of v4, p1, Lh4/b$c$a;

    .line 187
    .line 188
    :goto_3
    if-eqz v4, :cond_6

    .line 189
    .line 190
    add-float/2addr v3, v1

    .line 191
    :cond_6
    :goto_4
    invoke-virtual {p0}, Li4/a;->f()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    invoke-virtual {v1}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectIconWidth()F

    .line 196
    .line 197
    .line 198
    move-result v1

    .line 199
    const/4 v4, 0x2

    .line 200
    int-to-float v4, v4

    .line 201
    mul-float/2addr v1, v4

    .line 202
    cmpg-float v4, v2, v1

    .line 203
    .line 204
    if-gez v4, :cond_7

    .line 205
    .line 206
    move v2, v1

    .line 207
    :cond_7
    cmpg-float v4, v3, v1

    .line 208
    .line 209
    if-gez v4, :cond_8

    .line 210
    .line 211
    move v3, v1

    .line 212
    :cond_8
    invoke-static {v10}, Le5/m;->b(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 213
    .line 214
    .line 215
    move-result-object v1

    .line 216
    invoke-virtual {v1, v2}, Landroid/graphics/Matrix;->mapRadius(F)F

    .line 217
    .line 218
    .line 219
    move-result v2

    .line 220
    invoke-virtual {v1, v3}, Landroid/graphics/Matrix;->mapRadius(F)F

    .line 221
    .line 222
    .line 223
    move-result v1

    .line 224
    new-instance v3, Landroid/graphics/RectF;

    .line 225
    .line 226
    invoke-virtual {p0}, Li4/a;->v()Landroid/graphics/RectF;

    .line 227
    .line 228
    .line 229
    move-result-object v4

    .line 230
    invoke-direct {v3, v4}, Landroid/graphics/RectF;-><init>(Landroid/graphics/RectF;)V

    .line 231
    .line 232
    .line 233
    if-eqz v11, :cond_9

    .line 234
    .line 235
    iget v1, v3, Landroid/graphics/RectF;->right:F

    .line 236
    .line 237
    sub-float/2addr v1, v2

    .line 238
    iput v1, v3, Landroid/graphics/RectF;->left:F

    .line 239
    .line 240
    goto :goto_5

    .line 241
    :cond_9
    instance-of v4, p1, Lh4/b$c$d;

    .line 242
    .line 243
    if-eqz v4, :cond_a

    .line 244
    .line 245
    iget v2, v3, Landroid/graphics/RectF;->bottom:F

    .line 246
    .line 247
    sub-float/2addr v2, v1

    .line 248
    iput v2, v3, Landroid/graphics/RectF;->top:F

    .line 249
    .line 250
    goto :goto_5

    .line 251
    :cond_a
    instance-of v4, p1, Lh4/b$c$c;

    .line 252
    .line 253
    if-eqz v4, :cond_b

    .line 254
    .line 255
    iget v1, v3, Landroid/graphics/RectF;->left:F

    .line 256
    .line 257
    add-float/2addr v1, v2

    .line 258
    iput v1, v3, Landroid/graphics/RectF;->right:F

    .line 259
    .line 260
    goto :goto_5

    .line 261
    :cond_b
    instance-of v2, p1, Lh4/b$c$a;

    .line 262
    .line 263
    if-eqz v2, :cond_c

    .line 264
    .line 265
    iget v2, v3, Landroid/graphics/RectF;->top:F

    .line 266
    .line 267
    add-float/2addr v2, v1

    .line 268
    iput v2, v3, Landroid/graphics/RectF;->bottom:F

    .line 269
    .line 270
    :cond_c
    :goto_5
    invoke-virtual {v9, v3}, Lr4/b;->o(Landroid/graphics/RectF;)V

    .line 271
    .line 272
    .line 273
    return-void

    .line 274
    :cond_d
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    .line 275
    .line 276
    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 277
    .line 278
    .line 279
    throw v1

    .line 280
    :cond_e
    return-void
.end method

.method public final e0()V
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
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;->v:Ljava/util/ArrayList;

    .line 53
    .line 54
    new-instance v3, Ljava/util/ArrayList;

    .line 55
    .line 56
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    const/4 v6, 0x0

    .line 64
    move v7, v6

    .line 65
    :cond_0
    :goto_0
    if-ge v7, v5, :cond_1

    .line 66
    .line 67
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v8

    .line 71
    add-int/lit8 v7, v7, 0x1

    .line 72
    .line 73
    move-object v9, v8

    .line 74
    check-cast v9, Lh4/c;

    .line 75
    .line 76
    invoke-virtual {v9}, Lh4/c;->a()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v9

    .line 80
    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    .line 81
    .line 82
    .line 83
    move-result v9

    .line 84
    if-lez v9, :cond_0

    .line 85
    .line 86
    invoke-interface {v3, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_1
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    const/high16 v5, 0x41b80000    # 23.0f

    .line 95
    .line 96
    :goto_1
    if-ge v6, v1, :cond_2

    .line 97
    .line 98
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v7

    .line 102
    add-int/lit8 v6, v6, 0x1

    .line 103
    .line 104
    check-cast v7, Lh4/c;

    .line 105
    .line 106
    invoke-virtual {v7}, Lh4/c;->a()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v7

    .line 110
    invoke-virtual {v0, v7}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 111
    .line 112
    .line 113
    move-result v7

    .line 114
    iget-object v8, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;->w:Ljava/util/ArrayList;

    .line 115
    .line 116
    new-instance v9, Landroid/graphics/RectF;

    .line 117
    .line 118
    add-float v10, v5, v7

    .line 119
    .line 120
    invoke-direct {v9, v5, v2, v10, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    const/high16 v8, 0x41f00000    # 30.0f

    .line 127
    .line 128
    add-float/2addr v7, v8

    .line 129
    add-float/2addr v5, v7

    .line 130
    goto :goto_1

    .line 131
    :cond_2
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;->g0()V

    .line 132
    .line 133
    .line 134
    return-void
.end method

.method public final f0()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;->v:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;->v:Ljava/util/ArrayList;

    .line 7
    .line 8
    sget-object v1, Lh4/c$d;->c:Lh4/c$d;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;->v:Ljava/util/ArrayList;

    .line 14
    .line 15
    sget-object v1, Lh4/c$e;->c:Lh4/c$e;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;->v:Ljava/util/ArrayList;

    .line 21
    .line 22
    new-instance v1, Lh4/c$b;

    .line 23
    .line 24
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;->b0()Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    invoke-virtual {p0}, Li4/a;->f()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    invoke-virtual {v3}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectEditColorList()Ljava/util/List;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    invoke-static {v3}, Lh4/d;->a(Ljava/util/List;)Ljava/util/List;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    invoke-direct {v1, v2, v3}, Lh4/c$b;-><init>(ZLjava/util/List;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;->v:Ljava/util/ArrayList;

    .line 47
    .line 48
    sget-object v1, Lh4/c$a;->c:Lh4/c$a;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public final g0()V
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;->x:Ljava/util/ArrayList;

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
    iget-object v5, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;->x:Ljava/util/ArrayList;

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

.method public h()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;->v:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object v0
.end method

.method public h0(Ljava/lang/Integer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;->u:Ljava/lang/Integer;

    .line 2
    .line 3
    return-void
.end method

.method public final i0()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Li4/a;->u()Ljava/util/ArrayList;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lq4/c;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Li4/a;->v()Landroid/graphics/RectF;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-interface {v0}, Lq4/c;->g()Landroid/graphics/RectF;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {v1, v2}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Li4/a;->y()Landroid/graphics/Matrix;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v1}, Landroid/graphics/Matrix;->reset()V

    .line 29
    .line 30
    .line 31
    invoke-interface {v0}, Lq4/c;->b()Landroid/graphics/Matrix;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {v1, v2}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Li4/a;->r()Lj4/a;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-virtual {v2}, Lj4/a;->b()Landroid/graphics/Matrix;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-virtual {v1, v2}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 47
    .line 48
    .line 49
    check-cast v0, Lr4/b;

    .line 50
    .line 51
    invoke-virtual {v0}, Lr4/b;->I()Ljava/util/List;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    check-cast v0, Landroid/graphics/PointF;

    .line 60
    .line 61
    invoke-virtual {p0, v0}, Li4/a;->T(Landroid/graphics/PointF;)V

    .line 62
    .line 63
    .line 64
    :cond_0
    return-void
.end method

.method public s()Landroid/graphics/RectF;
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;->w:Ljava/util/ArrayList;

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
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;->x:Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->last(Ljava/util/List;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Landroid/graphics/RectF;

    .line 24
    .line 25
    iget v1, v1, Landroid/graphics/RectF;->right:F

    .line 26
    .line 27
    const/high16 v2, 0x41b80000    # 23.0f

    .line 28
    .line 29
    add-float/2addr v1, v2

    .line 30
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction;->Z()Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    const/4 v3, 0x0

    .line 35
    if-eqz v2, :cond_0

    .line 36
    .line 37
    invoke-static {v2}, Lh4/d;->c(Ljava/util/List;)Lh4/f$b;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    move-object v2, v3

    .line 43
    :goto_0
    if-eqz v2, :cond_1

    .line 44
    .line 45
    const/4 v2, 0x1

    .line 46
    goto :goto_1

    .line 47
    :cond_1
    const/4 v2, 0x0

    .line 48
    :goto_1
    invoke-virtual {p0}, Li4/a;->f()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    invoke-virtual {v4}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectCustomColorView()Ld5/a;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    const/4 v5, 0x0

    .line 57
    if-eqz v4, :cond_3

    .line 58
    .line 59
    if-eqz v2, :cond_2

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_2
    move-object v4, v3

    .line 63
    :goto_2
    if-eqz v4, :cond_3

    .line 64
    .line 65
    invoke-interface {v4}, Ld5/a;->getWidth()F

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    goto :goto_3

    .line 70
    :cond_3
    move v4, v5

    .line 71
    :goto_3
    invoke-virtual {p0}, Li4/a;->f()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 72
    .line 73
    .line 74
    move-result-object v6

    .line 75
    invoke-virtual {v6}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectCustomColorView()Ld5/a;

    .line 76
    .line 77
    .line 78
    move-result-object v6

    .line 79
    const/high16 v7, 0x41500000    # 13.0f

    .line 80
    .line 81
    if-eqz v6, :cond_5

    .line 82
    .line 83
    if-eqz v2, :cond_4

    .line 84
    .line 85
    move-object v3, v6

    .line 86
    :cond_4
    if-eqz v3, :cond_5

    .line 87
    .line 88
    invoke-interface {v3}, Ld5/a;->getHeight()F

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    add-float/2addr v2, v7

    .line 93
    goto :goto_4

    .line 94
    :cond_5
    move v2, v5

    .line 95
    :goto_4
    new-instance v3, Lkotlin/Pair;

    .line 96
    .line 97
    invoke-static {v0, v1}, Ljava/lang/Math;->max(FF)F

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-virtual {p0}, Li4/a;->f()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    invoke-virtual {v1}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectButtonHeight()F

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    const/4 v6, 0x2

    .line 114
    int-to-float v6, v6

    .line 115
    mul-float/2addr v1, v6

    .line 116
    add-float/2addr v1, v7

    .line 117
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    invoke-direct {v3, v0, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {p0, v3}, Li4/a;->R(Lkotlin/Pair;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p0}, Li4/a;->x()Lkotlin/Pair;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-virtual {v0}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    check-cast v0, Ljava/lang/Number;

    .line 136
    .line 137
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    invoke-static {v0, v4}, Ljava/lang/Math;->max(FF)F

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    invoke-virtual {p0}, Li4/a;->x()Lkotlin/Pair;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    invoke-virtual {v1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    check-cast v1, Ljava/lang/Number;

    .line 154
    .line 155
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 156
    .line 157
    .line 158
    move-result v1

    .line 159
    add-float/2addr v1, v2

    .line 160
    new-instance v2, Landroid/graphics/RectF;

    .line 161
    .line 162
    invoke-direct {v2, v5, v5, v0, v1}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 163
    .line 164
    .line 165
    return-object v2
.end method
