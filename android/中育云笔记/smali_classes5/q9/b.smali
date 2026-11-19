.class public final Lq9/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lq9/b$a;
    }
.end annotation


# instance fields
.field public A:F

.field public B:Z

.field public C:Z

.field public D:Ljava/util/List;

.field public E:I

.field public final F:F

.field public G:F

.field public H:Ljava/util/List;

.field public I:Ljava/util/List;

.field public J:Ljava/util/List;

.field public K:F

.field public L:Lcom/zykj/blackboard/core/action/GeometryActionEnum;

.field public M:F

.field public N:I

.field public O:F

.field public P:Lma/f;

.field public Q:Z

.field public final a:I

.field public final b:I

.field public c:I

.field public d:Z

.field public e:I

.field public f:I

.field public g:F

.field public h:F

.field public i:F

.field public j:Z

.field public k:F

.field public l:F

.field public m:Lcom/zykj/board/EzyModeEnum$ModeEnum;

.field public n:Lma/j;

.field public o:Landroid/graphics/RectF;

.field public p:Ljava/lang/String;

.field public q:F

.field public r:F

.field public s:F

.field public t:I

.field public u:I

.field public final v:Lcom/zykj/blackboard/bean/BackgroundLineConfig;

.field public w:I

.field public x:F

.field public y:F

.field public final z:Lq9/d;


# direct methods
.method public constructor <init>(II)V
    .locals 13

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lq9/b;->a:I

    .line 5
    .line 6
    iput p2, p0, Lq9/b;->b:I

    .line 7
    .line 8
    const/4 p1, 0x3

    .line 9
    iput p1, p0, Lq9/b;->c:I

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    iput-boolean p1, p0, Lq9/b;->d:Z

    .line 13
    .line 14
    const/high16 p2, -0x1000000

    .line 15
    .line 16
    iput p2, p0, Lq9/b;->e:I

    .line 17
    .line 18
    iput p2, p0, Lq9/b;->f:I

    .line 19
    .line 20
    const/high16 v0, 0x40a00000    # 5.0f

    .line 21
    .line 22
    iput v0, p0, Lq9/b;->g:F

    .line 23
    .line 24
    iput v0, p0, Lq9/b;->h:F

    .line 25
    .line 26
    const/high16 v0, 0x42200000    # 40.0f

    .line 27
    .line 28
    iput v0, p0, Lq9/b;->i:F

    .line 29
    .line 30
    const/high16 v0, 0x41f00000    # 30.0f

    .line 31
    .line 32
    iput v0, p0, Lq9/b;->k:F

    .line 33
    .line 34
    const/high16 v0, 0x41700000    # 15.0f

    .line 35
    .line 36
    iput v0, p0, Lq9/b;->l:F

    .line 37
    .line 38
    sget-object v1, Lcom/zykj/board/EzyModeEnum$ModeEnum;->e:Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 39
    .line 40
    iput-object v1, p0, Lq9/b;->m:Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 41
    .line 42
    new-instance v1, Landroid/graphics/RectF;

    .line 43
    .line 44
    const/high16 v2, 0x43c80000    # 400.0f

    .line 45
    .line 46
    const/high16 v3, 0x42c80000    # 100.0f

    .line 47
    .line 48
    const/4 v4, 0x0

    .line 49
    invoke-direct {v1, v4, v4, v2, v3}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 50
    .line 51
    .line 52
    iput-object v1, p0, Lq9/b;->o:Landroid/graphics/RectF;

    .line 53
    .line 54
    const-string v1, "\u8bf7\u8f93\u5165\u6587\u5b57"

    .line 55
    .line 56
    iput-object v1, p0, Lq9/b;->p:Ljava/lang/String;

    .line 57
    .line 58
    const/high16 v1, 0x41e00000    # 28.0f

    .line 59
    .line 60
    iput v1, p0, Lq9/b;->q:F

    .line 61
    .line 62
    const/high16 v2, 0x41a00000    # 20.0f

    .line 63
    .line 64
    iput v2, p0, Lq9/b;->r:F

    .line 65
    .line 66
    const/high16 v3, 0x42400000    # 48.0f

    .line 67
    .line 68
    iput v3, p0, Lq9/b;->s:F

    .line 69
    .line 70
    iput p2, p0, Lq9/b;->t:I

    .line 71
    .line 72
    new-instance v4, Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    .line 73
    .line 74
    const/16 v9, 0xf

    .line 75
    .line 76
    const/4 v10, 0x0

    .line 77
    const/4 v5, 0x0

    .line 78
    const/4 v6, 0x0

    .line 79
    const/4 v7, 0x0

    .line 80
    const/4 v8, 0x0

    .line 81
    invoke-direct/range {v4 .. v10}, Lcom/zykj/blackboard/bean/BackgroundLineConfig;-><init>(IFLcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;FILkotlin/jvm/internal/n;)V

    .line 82
    .line 83
    .line 84
    iput-object v4, p0, Lq9/b;->v:Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    .line 85
    .line 86
    const/high16 v3, -0x10000

    .line 87
    .line 88
    iput v3, p0, Lq9/b;->w:I

    .line 89
    .line 90
    iput v2, p0, Lq9/b;->x:F

    .line 91
    .line 92
    const/high16 v2, 0x42480000    # 50.0f

    .line 93
    .line 94
    iput v2, p0, Lq9/b;->y:F

    .line 95
    .line 96
    new-instance v3, Lq9/d;

    .line 97
    .line 98
    const/16 v11, 0x7f

    .line 99
    .line 100
    const/4 v12, 0x0

    .line 101
    const/4 v4, 0x0

    .line 102
    const/4 v6, 0x0

    .line 103
    const/4 v7, 0x0

    .line 104
    const/4 v8, 0x0

    .line 105
    const/4 v9, 0x0

    .line 106
    const/4 v10, 0x0

    .line 107
    invoke-direct/range {v3 .. v12}, Lq9/d;-><init>(ZZZZZIIILkotlin/jvm/internal/n;)V

    .line 108
    .line 109
    .line 110
    iput-object v3, p0, Lq9/b;->z:Lq9/d;

    .line 111
    .line 112
    iput v2, p0, Lq9/b;->A:F

    .line 113
    .line 114
    invoke-static {}, Lrc/w;->n()Ljava/util/List;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    iput-object v2, p0, Lq9/b;->D:Ljava/util/List;

    .line 119
    .line 120
    const/4 v2, -0x1

    .line 121
    iput v2, p0, Lq9/b;->E:I

    .line 122
    .line 123
    const/high16 v2, 0x42700000    # 60.0f

    .line 124
    .line 125
    iput v2, p0, Lq9/b;->F:F

    .line 126
    .line 127
    const/high16 v2, 0x42100000    # 36.0f

    .line 128
    .line 129
    iput v2, p0, Lq9/b;->G:F

    .line 130
    .line 131
    const/high16 v3, 0x40400000    # 3.0f

    .line 132
    .line 133
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 134
    .line 135
    .line 136
    move-result-object v4

    .line 137
    const/high16 v5, 0x41000000    # 8.0f

    .line 138
    .line 139
    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 140
    .line 141
    .line 142
    move-result-object v5

    .line 143
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    filled-new-array {v4, v5, v0}, [Ljava/lang/Float;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    invoke-static {v0}, Lrc/w;->q([Ljava/lang/Object;)Ljava/util/List;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    iput-object v0, p0, Lq9/b;->H:Ljava/util/List;

    .line 156
    .line 157
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 158
    .line 159
    .line 160
    move-result-object v4

    .line 161
    const v0, -0x111112

    .line 162
    .line 163
    .line 164
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 165
    .line 166
    .line 167
    move-result-object v5

    .line 168
    const v0, -0xb6cf

    .line 169
    .line 170
    .line 171
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 172
    .line 173
    .line 174
    move-result-object v6

    .line 175
    const/16 v0, -0x47d2

    .line 176
    .line 177
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 178
    .line 179
    .line 180
    move-result-object v7

    .line 181
    const v0, -0xbf3600

    .line 182
    .line 183
    .line 184
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 185
    .line 186
    .line 187
    move-result-object v8

    .line 188
    const v0, -0xcc6601

    .line 189
    .line 190
    .line 191
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 192
    .line 193
    .line 194
    move-result-object v9

    .line 195
    const v0, -0x39b601

    .line 196
    .line 197
    .line 198
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 199
    .line 200
    .line 201
    move-result-object v10

    .line 202
    const v0, -0xaa2f

    .line 203
    .line 204
    .line 205
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 206
    .line 207
    .line 208
    move-result-object v11

    .line 209
    filled-new-array/range {v4 .. v11}, [Ljava/lang/Integer;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    invoke-static {v0}, Lrc/w;->q([Ljava/lang/Object;)Ljava/util/List;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    iput-object v0, p0, Lq9/b;->I:Ljava/util/List;

    .line 218
    .line 219
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 224
    .line 225
    .line 226
    move-result-object v1

    .line 227
    const/high16 v4, 0x42600000    # 56.0f

    .line 228
    .line 229
    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 230
    .line 231
    .line 232
    move-result-object v4

    .line 233
    filled-new-array {v0, v1, v4}, [Ljava/lang/Float;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    invoke-static {v0}, Lrc/w;->q([Ljava/lang/Object;)Ljava/util/List;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    iput-object v0, p0, Lq9/b;->J:Ljava/util/List;

    .line 242
    .line 243
    const/high16 v0, 0x3f000000    # 0.5f

    .line 244
    .line 245
    iput v0, p0, Lq9/b;->K:F

    .line 246
    .line 247
    sget-object v0, Lcom/zykj/blackboard/core/action/GeometryActionEnum;->d:Lcom/zykj/blackboard/core/action/GeometryActionEnum;

    .line 248
    .line 249
    iput-object v0, p0, Lq9/b;->L:Lcom/zykj/blackboard/core/action/GeometryActionEnum;

    .line 250
    .line 251
    iput v3, p0, Lq9/b;->M:F

    .line 252
    .line 253
    iput p2, p0, Lq9/b;->N:I

    .line 254
    .line 255
    iput v2, p0, Lq9/b;->O:F

    .line 256
    .line 257
    iput-boolean p1, p0, Lq9/b;->Q:Z

    .line 258
    .line 259
    return-void
.end method

.method public static synthetic a0(Lq9/b;ZFFILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p5, p4, 0x2

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    const/high16 p2, 0x41f00000    # 30.0f

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p4, p4, 0x4

    .line 8
    .line 9
    if-eqz p4, :cond_1

    .line 10
    .line 11
    const/high16 p3, 0x41700000    # 15.0f

    .line 12
    .line 13
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lq9/b;->Z(ZFF)V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final A()I
    .locals 1

    .line 1
    iget v0, p0, Lq9/b;->e:I

    .line 2
    .line 3
    return v0
.end method

.method public final B()F
    .locals 1

    .line 1
    iget v0, p0, Lq9/b;->k:F

    .line 2
    .line 3
    return v0
.end method

.method public final C()F
    .locals 1

    .line 1
    iget v0, p0, Lq9/b;->l:F

    .line 2
    .line 3
    return v0
.end method

.method public final D()F
    .locals 1

    .line 1
    iget v0, p0, Lq9/b;->h:F

    .line 2
    .line 3
    return v0
.end method

.method public final E()F
    .locals 1

    .line 1
    iget v0, p0, Lq9/b;->F:F

    .line 2
    .line 3
    return v0
.end method

.method public final F()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lq9/b;->D:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final G()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lq9/b;->J:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final H()F
    .locals 1

    .line 1
    iget v0, p0, Lq9/b;->G:F

    .line 2
    .line 3
    return v0
.end method

.method public final I()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lq9/b;->I:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final J()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lq9/b;->H:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final K()Lma/j;
    .locals 1

    .line 1
    iget-object v0, p0, Lq9/b;->n:Lma/j;

    .line 2
    .line 3
    return-object v0
.end method

.method public final L()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lq9/b;->Q:Z

    .line 2
    .line 3
    return v0
.end method

.method public final M()I
    .locals 1

    .line 1
    iget v0, p0, Lq9/b;->a:I

    .line 2
    .line 3
    return v0
.end method

.method public final N()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lq9/b;->j:Z

    .line 2
    .line 3
    return v0
.end method

.method public final O()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lq9/b;->d:Z

    .line 2
    .line 3
    return v0
.end method

.method public final P()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lq9/b;->C:Z

    .line 2
    .line 3
    return v0
.end method

.method public final Q()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lq9/b;->B:Z

    .line 2
    .line 3
    return v0
.end method

.method public final R(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lq9/b;->p:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method

.method public final S(I)V
    .locals 0

    .line 1
    iput p1, p0, Lq9/b;->t:I

    .line 2
    .line 3
    return-void
.end method

.method public final T(F)V
    .locals 0

    .line 1
    iput p1, p0, Lq9/b;->s:F

    .line 2
    .line 3
    return-void
.end method

.method public final U(F)V
    .locals 0

    .line 1
    iput p1, p0, Lq9/b;->r:F

    .line 2
    .line 3
    return-void
.end method

.method public final V(F)V
    .locals 0

    .line 1
    iput p1, p0, Lq9/b;->q:F

    .line 2
    .line 3
    return-void
.end method

.method public final W(I)V
    .locals 0

    .line 1
    iput p1, p0, Lq9/b;->u:I

    .line 2
    .line 3
    return-void
.end method

.method public final X(I)V
    .locals 0

    .line 1
    iput p1, p0, Lq9/b;->f:I

    .line 2
    .line 3
    return-void
.end method

.method public final Y(F)V
    .locals 0

    .line 1
    iput p1, p0, Lq9/b;->g:F

    .line 2
    .line 3
    return-void
.end method

.method public final Z(ZFF)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lq9/b;->j:Z

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    sget-object v0, Lna/i;->a:Lna/i;

    .line 6
    .line 7
    sget-object v1, Lcom/zykj/blackboard/utils/EventKey;->g:Lcom/zykj/blackboard/utils/EventKey;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lna/i;->b(Lcom/zykj/blackboard/utils/EventKey;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    iput-boolean p1, p0, Lq9/b;->j:Z

    .line 13
    .line 14
    iput p2, p0, Lq9/b;->k:F

    .line 15
    .line 16
    iput p3, p0, Lq9/b;->l:F

    .line 17
    .line 18
    return-void
.end method

.method public final a()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lq9/b;->p:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()I
    .locals 1

    .line 1
    iget v0, p0, Lq9/b;->t:I

    .line 2
    .line 3
    return v0
.end method

.method public final b0(F)V
    .locals 0

    .line 1
    iput p1, p0, Lq9/b;->i:F

    .line 2
    .line 3
    return-void
.end method

.method public final c()F
    .locals 1

    .line 1
    iget v0, p0, Lq9/b;->s:F

    .line 2
    .line 3
    return v0
.end method

.method public final c0(Z)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lq9/b;->d:Z

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    sget-object v0, Lna/i;->a:Lna/i;

    .line 6
    .line 7
    sget-object v1, Lcom/zykj/blackboard/utils/EventKey;->f:Lcom/zykj/blackboard/utils/EventKey;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lna/i;->b(Lcom/zykj/blackboard/utils/EventKey;)V

    .line 10
    .line 11
    .line 12
    sget-object v1, Lcom/zykj/blackboard/utils/EventKey;->g:Lcom/zykj/blackboard/utils/EventKey;

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lna/i;->b(Lcom/zykj/blackboard/utils/EventKey;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    iput-boolean p1, p0, Lq9/b;->d:Z

    .line 18
    .line 19
    return-void
.end method

.method public final d()F
    .locals 1

    .line 1
    iget v0, p0, Lq9/b;->r:F

    .line 2
    .line 3
    return v0
.end method

.method public final d0(Lcom/zykj/blackboard/core/action/GeometryActionEnum;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lq9/b;->L:Lcom/zykj/blackboard/core/action/GeometryActionEnum;

    .line 7
    .line 8
    return-void
.end method

.method public final e()F
    .locals 1

    .line 1
    iget v0, p0, Lq9/b;->q:F

    .line 2
    .line 3
    return v0
.end method

.method public final e0(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lq9/b;->B:Z

    .line 2
    .line 3
    return-void
.end method

.method public final f()Landroid/graphics/RectF;
    .locals 1

    .line 1
    iget-object v0, p0, Lq9/b;->o:Landroid/graphics/RectF;

    .line 2
    .line 3
    return-object v0
.end method

.method public final f0(Lma/f;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lq9/b;->P:Lma/f;

    .line 2
    .line 3
    return-void
.end method

.method public final g()Lq9/a;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public final g0(I)V
    .locals 0

    .line 1
    iput p1, p0, Lq9/b;->c:I

    .line 2
    .line 3
    return-void
.end method

.method public final h()I
    .locals 1

    .line 1
    iget v0, p0, Lq9/b;->u:I

    .line 2
    .line 3
    return v0
.end method

.method public final h0(Lcom/zykj/board/EzyModeEnum$ModeEnum;)V
    .locals 2

    .line 1
    const-string v0, "mode"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lq9/b$a;->a:[I

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    aget v0, v0, v1

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    if-eq v0, v1, :cond_4

    .line 16
    .line 17
    const/4 v1, 0x2

    .line 18
    if-eq v0, v1, :cond_3

    .line 19
    .line 20
    const/4 v1, 0x3

    .line 21
    if-eq v0, v1, :cond_2

    .line 22
    .line 23
    const/4 v1, 0x4

    .line 24
    if-eq v0, v1, :cond_1

    .line 25
    .line 26
    const/4 v1, 0x5

    .line 27
    if-eq v0, v1, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    sget-object v0, Lna/i;->a:Lna/i;

    .line 31
    .line 32
    sget-object v1, Lcom/zykj/blackboard/utils/EventKey;->f:Lcom/zykj/blackboard/utils/EventKey;

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Lna/i;->b(Lcom/zykj/blackboard/utils/EventKey;)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    sget-object v0, Lna/i;->a:Lna/i;

    .line 39
    .line 40
    sget-object v1, Lcom/zykj/blackboard/utils/EventKey;->c:Lcom/zykj/blackboard/utils/EventKey;

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Lna/i;->b(Lcom/zykj/blackboard/utils/EventKey;)V

    .line 43
    .line 44
    .line 45
    sget-object v1, Lcom/zykj/blackboard/utils/EventKey;->f:Lcom/zykj/blackboard/utils/EventKey;

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Lna/i;->b(Lcom/zykj/blackboard/utils/EventKey;)V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    sget-object v0, Lna/i;->a:Lna/i;

    .line 52
    .line 53
    sget-object v1, Lcom/zykj/blackboard/utils/EventKey;->e:Lcom/zykj/blackboard/utils/EventKey;

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Lna/i;->b(Lcom/zykj/blackboard/utils/EventKey;)V

    .line 56
    .line 57
    .line 58
    sget-object v1, Lcom/zykj/blackboard/utils/EventKey;->f:Lcom/zykj/blackboard/utils/EventKey;

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Lna/i;->b(Lcom/zykj/blackboard/utils/EventKey;)V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_3
    iget-object v0, p0, Lq9/b;->m:Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 65
    .line 66
    if-eq v0, p1, :cond_5

    .line 67
    .line 68
    sget-object v0, Lna/i;->a:Lna/i;

    .line 69
    .line 70
    sget-object v1, Lcom/zykj/blackboard/utils/EventKey;->g:Lcom/zykj/blackboard/utils/EventKey;

    .line 71
    .line 72
    invoke-virtual {v0, v1}, Lna/i;->b(Lcom/zykj/blackboard/utils/EventKey;)V

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_4
    sget-object v0, Lna/i;->a:Lna/i;

    .line 77
    .line 78
    sget-object v1, Lcom/zykj/blackboard/utils/EventKey;->d:Lcom/zykj/blackboard/utils/EventKey;

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Lna/i;->b(Lcom/zykj/blackboard/utils/EventKey;)V

    .line 81
    .line 82
    .line 83
    sget-object v1, Lcom/zykj/blackboard/utils/EventKey;->f:Lcom/zykj/blackboard/utils/EventKey;

    .line 84
    .line 85
    invoke-virtual {v0, v1}, Lna/i;->b(Lcom/zykj/blackboard/utils/EventKey;)V

    .line 86
    .line 87
    .line 88
    :cond_5
    :goto_0
    iput-object p1, p0, Lq9/b;->m:Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 89
    .line 90
    return-void
.end method

.method public final i()I
    .locals 1

    .line 1
    iget v0, p0, Lq9/b;->E:I

    .line 2
    .line 3
    return v0
.end method

.method public final i0(I)V
    .locals 2

    .line 1
    iget v0, p0, Lq9/b;->e:I

    .line 2
    .line 3
    if-eq p1, v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lna/i;->a:Lna/i;

    .line 6
    .line 7
    sget-object v1, Lcom/zykj/blackboard/utils/EventKey;->f:Lcom/zykj/blackboard/utils/EventKey;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lna/i;->b(Lcom/zykj/blackboard/utils/EventKey;)V

    .line 10
    .line 11
    .line 12
    sget-object v1, Lcom/zykj/blackboard/utils/EventKey;->g:Lcom/zykj/blackboard/utils/EventKey;

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lna/i;->b(Lcom/zykj/blackboard/utils/EventKey;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    iput p1, p0, Lq9/b;->e:I

    .line 18
    .line 19
    return-void
.end method

.method public final j()Lcom/zykj/blackboard/bean/BackgroundLineConfig;
    .locals 1

    .line 1
    iget-object v0, p0, Lq9/b;->v:Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    .line 2
    .line 3
    return-object v0
.end method

.method public final j0(F)V
    .locals 2

    .line 1
    iget v0, p0, Lq9/b;->h:F

    .line 2
    .line 3
    cmpg-float v0, p1, v0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    sget-object v0, Lna/i;->a:Lna/i;

    .line 9
    .line 10
    sget-object v1, Lcom/zykj/blackboard/utils/EventKey;->f:Lcom/zykj/blackboard/utils/EventKey;

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lna/i;->b(Lcom/zykj/blackboard/utils/EventKey;)V

    .line 13
    .line 14
    .line 15
    sget-object v1, Lcom/zykj/blackboard/utils/EventKey;->g:Lcom/zykj/blackboard/utils/EventKey;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lna/i;->b(Lcom/zykj/blackboard/utils/EventKey;)V

    .line 18
    .line 19
    .line 20
    :goto_0
    iput p1, p0, Lq9/b;->h:F

    .line 21
    .line 22
    return-void
.end method

.method public final k()I
    .locals 1

    .line 1
    iget v0, p0, Lq9/b;->f:I

    .line 2
    .line 3
    return v0
.end method

.method public final k0(F)V
    .locals 0

    .line 1
    iput p1, p0, Lq9/b;->G:F

    .line 2
    .line 3
    return-void
.end method

.method public final l()F
    .locals 1

    .line 1
    iget v0, p0, Lq9/b;->g:F

    .line 2
    .line 3
    return v0
.end method

.method public final l0(Lma/j;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lq9/b;->n:Lma/j;

    .line 2
    .line 3
    return-void
.end method

.method public final m()I
    .locals 1

    .line 1
    iget v0, p0, Lq9/b;->w:I

    .line 2
    .line 3
    return v0
.end method

.method public final n()F
    .locals 1

    .line 1
    iget v0, p0, Lq9/b;->y:F

    .line 2
    .line 3
    return v0
.end method

.method public final o()F
    .locals 1

    .line 1
    iget v0, p0, Lq9/b;->x:F

    .line 2
    .line 3
    return v0
.end method

.method public final p()F
    .locals 1

    .line 1
    iget v0, p0, Lq9/b;->i:F

    .line 2
    .line 3
    return v0
.end method

.method public final q()Lcom/zykj/blackboard/core/action/GeometryActionEnum;
    .locals 1

    .line 1
    iget-object v0, p0, Lq9/b;->L:Lcom/zykj/blackboard/core/action/GeometryActionEnum;

    .line 2
    .line 3
    return-object v0
.end method

.method public final r()F
    .locals 1

    .line 1
    iget v0, p0, Lq9/b;->O:F

    .line 2
    .line 3
    return v0
.end method

.method public final s()I
    .locals 1

    .line 1
    iget v0, p0, Lq9/b;->N:I

    .line 2
    .line 3
    return v0
.end method

.method public final t()F
    .locals 1

    .line 1
    iget v0, p0, Lq9/b;->M:F

    .line 2
    .line 3
    return v0
.end method

.method public final u()I
    .locals 1

    .line 1
    iget v0, p0, Lq9/b;->b:I

    .line 2
    .line 3
    return v0
.end method

.method public final v()F
    .locals 1

    .line 1
    iget v0, p0, Lq9/b;->K:F

    .line 2
    .line 3
    return v0
.end method

.method public final w()Lma/f;
    .locals 1

    .line 1
    iget-object v0, p0, Lq9/b;->P:Lma/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public final x()I
    .locals 1

    .line 1
    iget v0, p0, Lq9/b;->c:I

    .line 2
    .line 3
    return v0
.end method

.method public final y()Lcom/zykj/board/EzyModeEnum$ModeEnum;
    .locals 1

    .line 1
    iget-object v0, p0, Lq9/b;->m:Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 2
    .line 3
    return-object v0
.end method

.method public final z()Lq9/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lq9/b;->z:Lq9/d;

    .line 2
    .line 3
    return-object v0
.end method
