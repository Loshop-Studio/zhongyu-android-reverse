.class public final Lr/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lr/e$a;,
        Lr/e$b;
    }
.end annotation


# static fields
.field public static final c:Lr/e$a;


# instance fields
.field public final a:Lcoil3/e;

.field public final b:Lw/p;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lr/e$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lr/e$a;-><init>(Lkotlin/jvm/internal/n;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lr/e;->c:Lr/e$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lcoil3/e;Lw/p;Lcoil3/util/Logger;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lr/e;->a:Lcoil3/e;

    .line 5
    .line 6
    iput-object p2, p0, Lr/e;->b:Lw/p;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Lw/g;Lr/d$b;Lx/e;Lcoil3/size/Scale;)Lr/d$c;
    .locals 8

    .line 1
    invoke-virtual {p1}, Lw/g;->s()Lcoil3/request/CachePolicy;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcoil3/request/CachePolicy;->c()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    return-object v1

    .line 13
    :cond_0
    iget-object v0, p0, Lr/e;->a:Lcoil3/e;

    .line 14
    .line 15
    invoke-interface {v0}, Lcoil3/e;->e()Lr/d;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    invoke-interface {v0, p2}, Lr/d;->a(Lr/d$b;)Lr/d$c;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    move-object v5, v0

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    move-object v5, v1

    .line 28
    :goto_0
    if-eqz v5, :cond_2

    .line 29
    .line 30
    move-object v2, p0

    .line 31
    move-object v3, p1

    .line 32
    move-object v4, p2

    .line 33
    move-object v6, p3

    .line 34
    move-object v7, p4

    .line 35
    invoke-virtual/range {v2 .. v7}, Lr/e;->c(Lw/g;Lr/d$b;Lr/d$c;Lx/e;Lcoil3/size/Scale;)Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-eqz p1, :cond_2

    .line 40
    .line 41
    return-object v5

    .line 42
    :cond_2
    return-object v1
.end method

.method public final b(Lr/d$c;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p1}, Lr/d$c;->a()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const-string v0, "coil#disk_cache_key"

    .line 6
    .line 7
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    instance-of v0, p1, Ljava/lang/String;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    check-cast p1, Ljava/lang/String;

    .line 16
    .line 17
    return-object p1

    .line 18
    :cond_0
    const/4 p1, 0x0

    .line 19
    return-object p1
.end method

.method public final c(Lw/g;Lr/d$b;Lr/d$c;Lx/e;Lcoil3/size/Scale;)Z
    .locals 6

    .line 1
    iget-object v0, p0, Lr/e;->b:Lw/p;

    .line 2
    .line 3
    invoke-interface {v0, p1, p3}, Lw/p;->d(Lw/g;Lr/d$c;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    return p1

    .line 11
    :cond_0
    move-object v0, p0

    .line 12
    move-object v1, p1

    .line 13
    move-object v2, p2

    .line 14
    move-object v3, p3

    .line 15
    move-object v4, p4

    .line 16
    move-object v5, p5

    .line 17
    invoke-virtual/range {v0 .. v5}, Lr/e;->d(Lw/g;Lr/d$b;Lr/d$c;Lx/e;Lcoil3/size/Scale;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1
.end method

.method public final d(Lw/g;Lr/d$b;Lr/d$c;Lx/e;Lcoil3/size/Scale;)Z
    .locals 14

    .line 1
    invoke-virtual/range {p2 .. p2}, Lr/d$b;->a()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "coil#size"

    .line 6
    .line 7
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ljava/lang/String;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    const/4 v2, 0x1

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    invoke-virtual/range {p4 .. p4}, Lx/e;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    invoke-static {v0, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    return v2

    .line 28
    :cond_0
    return v1

    .line 29
    :cond_1
    move-object/from16 v0, p3

    .line 30
    .line 31
    invoke-virtual {p0, v0}, Lr/e;->e(Lr/d$c;)Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-nez v3, :cond_3

    .line 36
    .line 37
    invoke-static/range {p4 .. p4}, Lx/f;->b(Lx/e;)Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-nez v3, :cond_2

    .line 42
    .line 43
    invoke-virtual {p1}, Lw/g;->v()Lcoil3/size/Precision;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    sget-object v4, Lcoil3/size/Precision;->d:Lcoil3/size/Precision;

    .line 48
    .line 49
    if-ne v3, v4, :cond_3

    .line 50
    .line 51
    :cond_2
    return v2

    .line 52
    :cond_3
    invoke-virtual {v0}, Lr/d$c;->b()Lk/j;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    invoke-interface {v3}, Lk/j;->getWidth()I

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    invoke-virtual {v0}, Lr/d$c;->b()Lk/j;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    invoke-interface {v4}, Lk/j;->getHeight()I

    .line 65
    .line 66
    .line 67
    move-result v4

    .line 68
    invoke-virtual {v0}, Lr/d$c;->b()Lk/j;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    instance-of v0, v0, Lk/a;

    .line 73
    .line 74
    if-eqz v0, :cond_4

    .line 75
    .line 76
    invoke-static {p1}, Lw/h;->c(Lw/g;)Lx/e;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    goto :goto_0

    .line 81
    :cond_4
    sget-object v0, Lx/e;->d:Lx/e;

    .line 82
    .line 83
    :goto_0
    invoke-virtual/range {p4 .. p4}, Lx/e;->b()Lx/a;

    .line 84
    .line 85
    .line 86
    move-result-object v5

    .line 87
    instance-of v6, v5, Lx/a$a;

    .line 88
    .line 89
    const v7, 0x7fffffff

    .line 90
    .line 91
    .line 92
    if-eqz v6, :cond_5

    .line 93
    .line 94
    check-cast v5, Lx/a$a;

    .line 95
    .line 96
    invoke-virtual {v5}, Lx/a$a;->f()I

    .line 97
    .line 98
    .line 99
    move-result v5

    .line 100
    goto :goto_1

    .line 101
    :cond_5
    move v5, v7

    .line 102
    :goto_1
    invoke-virtual {v0}, Lx/e;->b()Lx/a;

    .line 103
    .line 104
    .line 105
    move-result-object v6

    .line 106
    instance-of v8, v6, Lx/a$a;

    .line 107
    .line 108
    if-eqz v8, :cond_6

    .line 109
    .line 110
    check-cast v6, Lx/a$a;

    .line 111
    .line 112
    invoke-virtual {v6}, Lx/a$a;->f()I

    .line 113
    .line 114
    .line 115
    move-result v6

    .line 116
    goto :goto_2

    .line 117
    :cond_6
    move v6, v7

    .line 118
    :goto_2
    invoke-static {v5, v6}, Ljava/lang/Math;->min(II)I

    .line 119
    .line 120
    .line 121
    move-result v5

    .line 122
    invoke-virtual/range {p4 .. p4}, Lx/e;->a()Lx/a;

    .line 123
    .line 124
    .line 125
    move-result-object v6

    .line 126
    instance-of v8, v6, Lx/a$a;

    .line 127
    .line 128
    if-eqz v8, :cond_7

    .line 129
    .line 130
    check-cast v6, Lx/a$a;

    .line 131
    .line 132
    invoke-virtual {v6}, Lx/a$a;->f()I

    .line 133
    .line 134
    .line 135
    move-result v6

    .line 136
    goto :goto_3

    .line 137
    :cond_7
    move v6, v7

    .line 138
    :goto_3
    invoke-virtual {v0}, Lx/e;->a()Lx/a;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    instance-of v8, v0, Lx/a$a;

    .line 143
    .line 144
    if-eqz v8, :cond_8

    .line 145
    .line 146
    check-cast v0, Lx/a$a;

    .line 147
    .line 148
    invoke-virtual {v0}, Lx/a$a;->f()I

    .line 149
    .line 150
    .line 151
    move-result v0

    .line 152
    goto :goto_4

    .line 153
    :cond_8
    move v0, v7

    .line 154
    :goto_4
    invoke-static {v6, v0}, Ljava/lang/Math;->min(II)I

    .line 155
    .line 156
    .line 157
    move-result v0

    .line 158
    int-to-double v8, v5

    .line 159
    int-to-double v10, v3

    .line 160
    div-double/2addr v8, v10

    .line 161
    int-to-double v10, v0

    .line 162
    int-to-double v12, v4

    .line 163
    div-double/2addr v10, v12

    .line 164
    if-eq v5, v7, :cond_9

    .line 165
    .line 166
    if-eq v0, v7, :cond_9

    .line 167
    .line 168
    move-object/from16 v6, p5

    .line 169
    .line 170
    goto :goto_5

    .line 171
    :cond_9
    sget-object v6, Lcoil3/size/Scale;->d:Lcoil3/size/Scale;

    .line 172
    .line 173
    :goto_5
    sget-object v7, Lr/e$b;->a:[I

    .line 174
    .line 175
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 176
    .line 177
    .line 178
    move-result v6

    .line 179
    aget v6, v7, v6

    .line 180
    .line 181
    const/4 v7, 0x2

    .line 182
    if-eq v6, v2, :cond_c

    .line 183
    .line 184
    if-ne v6, v7, :cond_b

    .line 185
    .line 186
    cmpg-double v6, v8, v10

    .line 187
    .line 188
    if-gez v6, :cond_a

    .line 189
    .line 190
    sub-int/2addr v5, v3

    .line 191
    invoke-static {v5}, Ljava/lang/Math;->abs(I)I

    .line 192
    .line 193
    .line 194
    move-result v0

    .line 195
    goto :goto_7

    .line 196
    :cond_a
    sub-int/2addr v0, v4

    .line 197
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    .line 198
    .line 199
    .line 200
    move-result v0

    .line 201
    :goto_6
    move-wide v8, v10

    .line 202
    goto :goto_7

    .line 203
    :cond_b
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    .line 204
    .line 205
    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 206
    .line 207
    .line 208
    throw v0

    .line 209
    :cond_c
    cmpl-double v6, v8, v10

    .line 210
    .line 211
    if-lez v6, :cond_d

    .line 212
    .line 213
    sub-int/2addr v5, v3

    .line 214
    invoke-static {v5}, Ljava/lang/Math;->abs(I)I

    .line 215
    .line 216
    .line 217
    move-result v0

    .line 218
    goto :goto_7

    .line 219
    :cond_d
    sub-int/2addr v0, v4

    .line 220
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    .line 221
    .line 222
    .line 223
    move-result v0

    .line 224
    goto :goto_6

    .line 225
    :goto_7
    if-gt v0, v2, :cond_e

    .line 226
    .line 227
    return v2

    .line 228
    :cond_e
    invoke-virtual {p1}, Lw/g;->v()Lcoil3/size/Precision;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    sget-object v3, Lr/e$b;->b:[I

    .line 233
    .line 234
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 235
    .line 236
    .line 237
    move-result v0

    .line 238
    aget v0, v3, v0

    .line 239
    .line 240
    const-wide/high16 v3, 0x3ff0000000000000L    # 1.0

    .line 241
    .line 242
    if-eq v0, v2, :cond_11

    .line 243
    .line 244
    if-ne v0, v7, :cond_10

    .line 245
    .line 246
    cmpg-double v0, v8, v3

    .line 247
    .line 248
    if-gtz v0, :cond_f

    .line 249
    .line 250
    return v2

    .line 251
    :cond_f
    return v1

    .line 252
    :cond_10
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    .line 253
    .line 254
    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 255
    .line 256
    .line 257
    throw v0

    .line 258
    :cond_11
    cmpg-double v0, v8, v3

    .line 259
    .line 260
    if-nez v0, :cond_12

    .line 261
    .line 262
    return v2

    .line 263
    :cond_12
    return v1
.end method

.method public final e(Lr/d$c;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Lr/d$c;->a()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const-string v0, "coil#is_sampled"

    .line 6
    .line 7
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    instance-of v0, p1, Ljava/lang/Boolean;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    check-cast p1, Ljava/lang/Boolean;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 p1, 0x0

    .line 19
    :goto_0
    if-eqz p1, :cond_1

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    return p1

    .line 26
    :cond_1
    const/4 p1, 0x0

    .line 27
    return p1
.end method

.method public final f(Lw/g;Ljava/lang/Object;Lw/n;Lcoil3/b;)Lr/d$b;
    .locals 3

    .line 1
    invoke-virtual {p1}, Lw/g;->s()Lcoil3/request/CachePolicy;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lcoil3/request/CachePolicy;->h:Lcoil3/request/CachePolicy;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    return-object v2

    .line 11
    :cond_0
    invoke-virtual {p1}, Lw/g;->q()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    new-instance p2, Lr/d$b;

    .line 18
    .line 19
    invoke-virtual {p1}, Lw/g;->q()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p3

    .line 23
    invoke-virtual {p1}, Lw/g;->r()Ljava/util/Map;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-direct {p2, p3, p1}, Lr/d$b;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    .line 28
    .line 29
    .line 30
    return-object p2

    .line 31
    :cond_1
    invoke-virtual {p4, p1, p2}, Lcoil3/b;->j(Lw/g;Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Lr/e;->a:Lcoil3/e;

    .line 35
    .line 36
    invoke-interface {v0}, Lcoil3/e;->d()Lcoil3/a;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    const-string v1, "MemoryCacheService"

    .line 41
    .line 42
    invoke-static {v0, p2, p3, v2, v1}, Lcoil3/util/c;->p(Lcoil3/a;Ljava/lang/Object;Lw/n;Lcoil3/util/Logger;Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    invoke-virtual {p4, p1, p2}, Lcoil3/b;->i(Lw/g;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    if-nez p2, :cond_2

    .line 50
    .line 51
    return-object v2

    .line 52
    :cond_2
    invoke-static {p1}, Lw/h;->e(Lw/g;)Ljava/util/List;

    .line 53
    .line 54
    .line 55
    move-result-object p4

    .line 56
    check-cast p4, Ljava/util/Collection;

    .line 57
    .line 58
    invoke-interface {p4}, Ljava/util/Collection;->isEmpty()Z

    .line 59
    .line 60
    .line 61
    move-result p4

    .line 62
    if-nez p4, :cond_3

    .line 63
    .line 64
    invoke-virtual {p1}, Lw/g;->r()Ljava/util/Map;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-static {p1}, Lkotlin/collections/a;->x(Ljava/util/Map;)Ljava/util/Map;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-virtual {p3}, Lw/n;->k()Lx/e;

    .line 73
    .line 74
    .line 75
    move-result-object p3

    .line 76
    invoke-virtual {p3}, Lx/e;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p3

    .line 80
    const-string p4, "coil#size"

    .line 81
    .line 82
    invoke-interface {p1, p4, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    new-instance p3, Lr/d$b;

    .line 86
    .line 87
    invoke-direct {p3, p2, p1}, Lr/d$b;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    .line 88
    .line 89
    .line 90
    return-object p3

    .line 91
    :cond_3
    new-instance p3, Lr/d$b;

    .line 92
    .line 93
    invoke-virtual {p1}, Lw/g;->r()Ljava/util/Map;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    invoke-direct {p3, p2, p1}, Lr/d$b;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    .line 98
    .line 99
    .line 100
    return-object p3
.end method

.method public final g(Lcoil3/intercept/a$a;Lw/g;Lr/d$b;Lr/d$c;)Lw/r;
    .locals 8

    .line 1
    new-instance v0, Lw/r;

    .line 2
    .line 3
    invoke-virtual {p4}, Lr/d$c;->b()Lk/j;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    sget-object v3, Lcoil3/decode/DataSource;->c:Lcoil3/decode/DataSource;

    .line 8
    .line 9
    invoke-virtual {p0, p4}, Lr/e;->b(Lr/d$c;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v5

    .line 13
    invoke-virtual {p0, p4}, Lr/e;->e(Lr/d$c;)Z

    .line 14
    .line 15
    .line 16
    move-result v6

    .line 17
    invoke-static {p1}, Lcoil3/util/c;->o(Lcoil3/intercept/a$a;)Z

    .line 18
    .line 19
    .line 20
    move-result v7

    .line 21
    move-object v2, p2

    .line 22
    move-object v4, p3

    .line 23
    invoke-direct/range {v0 .. v7}, Lw/r;-><init>(Lk/j;Lw/g;Lcoil3/decode/DataSource;Lr/d$b;Ljava/lang/String;ZZ)V

    .line 24
    .line 25
    .line 26
    return-object v0
.end method

.method public final h(Lr/d$b;Lw/g;Lcoil3/intercept/EngineInterceptor$b;)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_3

    .line 3
    .line 4
    invoke-virtual {p2}, Lw/g;->s()Lcoil3/request/CachePolicy;

    .line 5
    .line 6
    .line 7
    move-result-object p2

    .line 8
    invoke-virtual {p2}, Lcoil3/request/CachePolicy;->d()Z

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    if-eqz p2, :cond_3

    .line 13
    .line 14
    invoke-virtual {p3}, Lcoil3/intercept/EngineInterceptor$b;->e()Lk/j;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    invoke-interface {p2}, Lk/j;->a()Z

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    if-nez p2, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iget-object p2, p0, Lr/e;->a:Lcoil3/e;

    .line 26
    .line 27
    invoke-interface {p2}, Lcoil3/e;->e()Lr/d;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    if-nez p2, :cond_1

    .line 32
    .line 33
    return v0

    .line 34
    :cond_1
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 35
    .line 36
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p3}, Lcoil3/intercept/EngineInterceptor$b;->f()Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    const-string v2, "coil#is_sampled"

    .line 48
    .line 49
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    invoke-virtual {p3}, Lcoil3/intercept/EngineInterceptor$b;->d()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    if-eqz v1, :cond_2

    .line 57
    .line 58
    const-string v2, "coil#disk_cache_key"

    .line 59
    .line 60
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    :cond_2
    new-instance v1, Lr/d$c;

    .line 64
    .line 65
    invoke-virtual {p3}, Lcoil3/intercept/EngineInterceptor$b;->e()Lk/j;

    .line 66
    .line 67
    .line 68
    move-result-object p3

    .line 69
    invoke-direct {v1, p3, v0}, Lr/d$c;-><init>(Lk/j;Ljava/util/Map;)V

    .line 70
    .line 71
    .line 72
    invoke-interface {p2, p1, v1}, Lr/d;->f(Lr/d$b;Lr/d$c;)V

    .line 73
    .line 74
    .line 75
    const/4 p1, 0x1

    .line 76
    return p1

    .line 77
    :cond_3
    :goto_0
    return v0
.end method
