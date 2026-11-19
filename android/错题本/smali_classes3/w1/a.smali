.class public final Lw1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La2/b;


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcoil3/r;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lw1/a;->a:Ljava/lang/Object;

    .line 3
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1a

    if-lt p1, v0, :cond_3

    sget-boolean v1, Lcoil3/util/e;->a:Z

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    if-eq p1, v0, :cond_2

    const/16 v0, 0x1b

    if-ne p1, v0, :cond_1

    goto :goto_0

    .line 4
    :cond_1
    new-instance p1, Lcoil3/util/f;

    const/4 v0, 0x1

    invoke-direct {p1, v0}, Lcoil3/util/f;-><init>(Z)V

    goto :goto_2

    .line 5
    :cond_2
    :goto_0
    new-instance p1, Lcoil3/util/h;

    .line 6
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    goto :goto_2

    .line 7
    :cond_3
    sget-boolean p1, Lcoil3/util/e;->a:Z

    .line 8
    :goto_1
    new-instance p1, Lcoil3/util/f;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Lcoil3/util/f;-><init>(Z)V

    .line 9
    :goto_2
    iput-object p1, p0, Lw1/a;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lcom/xuexiang/xui/widget/activity/BaseGuideActivity;Ljava/lang/Class;)V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw1/a;->b:Ljava/lang/Object;

    iput-object p2, p0, Lw1/a;->a:Ljava/lang/Object;

    return-void
.end method

.method public static a(Ls/f;)Landroidx/lifecycle/Lifecycle;
    .locals 3

    .line 1
    iget-object v0, p0, Ls/f;->c:Lu/a;

    .line 2
    .line 3
    instance-of v1, v0, Lcoil3/target/GenericViewTarget;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-nez v1, :cond_2

    .line 7
    .line 8
    iget-object p0, p0, Ls/f;->a:Landroid/content/Context;

    .line 9
    .line 10
    :goto_0
    instance-of v0, p0, Landroidx/lifecycle/LifecycleOwner;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    check-cast p0, Landroidx/lifecycle/LifecycleOwner;

    .line 15
    .line 16
    invoke-interface {p0}, Landroidx/lifecycle/LifecycleOwner;->getLifecycle()Landroidx/lifecycle/Lifecycle;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :cond_0
    instance-of v0, p0, Landroid/content/ContextWrapper;

    .line 22
    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    return-object v2

    .line 26
    :cond_1
    check-cast p0, Landroid/content/ContextWrapper;

    .line 27
    .line 28
    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    goto :goto_0

    .line 33
    :cond_2
    check-cast v0, Lcoil3/target/GenericViewTarget;

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    throw v2
.end method

.method public static b(Ls/f;Landroid/graphics/Bitmap$Config;)Z
    .locals 0

    .line 1
    invoke-static {p1}, Lkotlin/collections/u;->x(Landroid/graphics/Bitmap$Config;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    sget-object p1, Ls/h;->f:Lo2/a;

    .line 9
    .line 10
    invoke-static {p0, p1}, Lcoil3/o;->e(Ls/f;Lo2/a;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Ljava/lang/Boolean;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-nez p1, :cond_1

    .line 21
    .line 22
    const/4 p0, 0x0

    .line 23
    return p0

    .line 24
    :cond_1
    iget-object p0, p0, Ls/f;->c:Lu/a;

    .line 25
    .line 26
    instance-of p1, p0, Lcoil3/target/GenericViewTarget;

    .line 27
    .line 28
    if-nez p1, :cond_2

    .line 29
    .line 30
    :goto_0
    const/4 p0, 0x1

    .line 31
    return p0

    .line 32
    :cond_2
    check-cast p0, Lcoil3/target/GenericViewTarget;

    .line 33
    .line 34
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    const/4 p0, 0x0

    .line 38
    throw p0
.end method


# virtual methods
.method public c(Ls/f;Lt/f;)Ls/l;
    .locals 19

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    new-instance v1, Ls/l;

    .line 4
    .line 5
    move-object v2, v1

    .line 6
    iget-object v1, v0, Ls/f;->a:Landroid/content/Context;

    .line 7
    .line 8
    iget-object v3, v0, Ls/f;->p:Lcoil3/size/Scale;

    .line 9
    .line 10
    iget-object v4, v0, Ls/f;->q:Lcoil3/size/Precision;

    .line 11
    .line 12
    iget-object v6, v0, Ls/f;->e:Lokio/FileSystem;

    .line 13
    .line 14
    iget-object v7, v0, Ls/f;->i:Lcoil3/request/CachePolicy;

    .line 15
    .line 16
    iget-object v8, v0, Ls/f;->j:Lcoil3/request/CachePolicy;

    .line 17
    .line 18
    iget-object v9, v0, Ls/f;->k:Lcoil3/request/CachePolicy;

    .line 19
    .line 20
    sget-object v5, Ls/h;->b:Lo2/a;

    .line 21
    .line 22
    invoke-static {v0, v5}, Lcoil3/o;->e(Ls/f;Lo2/a;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v10

    .line 26
    check-cast v10, Landroid/graphics/Bitmap$Config;

    .line 27
    .line 28
    sget-object v11, Ls/h;->g:Lo2/a;

    .line 29
    .line 30
    invoke-static {v0, v11}, Lcoil3/o;->e(Ls/f;Lo2/a;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v12

    .line 34
    check-cast v12, Ljava/lang/Boolean;

    .line 35
    .line 36
    invoke-virtual {v12}, Ljava/lang/Boolean;->booleanValue()Z

    .line 37
    .line 38
    .line 39
    move-result v12

    .line 40
    sget-object v13, Ls/g;->a:Lo2/a;

    .line 41
    .line 42
    invoke-static {v0, v13}, Lcoil3/o;->e(Ls/f;Lo2/a;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v14

    .line 46
    check-cast v14, Ljava/util/List;

    .line 47
    .line 48
    invoke-interface {v14}, Ljava/util/List;->isEmpty()Z

    .line 49
    .line 50
    .line 51
    move-result v14

    .line 52
    const/16 v16, 0x0

    .line 53
    .line 54
    if-nez v14, :cond_1

    .line 55
    .line 56
    sget-object v14, Lcoil3/util/l;->a:[Landroid/graphics/Bitmap$Config;

    .line 57
    .line 58
    invoke-static {v0, v5}, Lcoil3/o;->e(Ls/f;Lo2/a;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v17

    .line 62
    move-object/from16 v15, v17

    .line 63
    .line 64
    check-cast v15, Landroid/graphics/Bitmap$Config;

    .line 65
    .line 66
    invoke-static {v14, v15}, Lkotlin/collections/q;->v([Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v14

    .line 70
    if-eqz v14, :cond_0

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_0
    move/from16 v14, v16

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_1
    :goto_0
    const/4 v14, 0x1

    .line 77
    :goto_1
    invoke-static {v0, v5}, Lcoil3/o;->e(Ls/f;Lo2/a;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v15

    .line 81
    check-cast v15, Landroid/graphics/Bitmap$Config;

    .line 82
    .line 83
    invoke-static {v15}, Lkotlin/collections/u;->x(Landroid/graphics/Bitmap$Config;)Z

    .line 84
    .line 85
    .line 86
    move-result v15

    .line 87
    if-eqz v15, :cond_4

    .line 88
    .line 89
    invoke-static {v0, v5}, Lcoil3/o;->e(Ls/f;Lo2/a;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v15

    .line 93
    check-cast v15, Landroid/graphics/Bitmap$Config;

    .line 94
    .line 95
    invoke-static {v0, v15}, Lw1/a;->b(Ls/f;Landroid/graphics/Bitmap$Config;)Z

    .line 96
    .line 97
    .line 98
    move-result v15

    .line 99
    if-eqz v15, :cond_2

    .line 100
    .line 101
    move-object/from16 v15, p0

    .line 102
    .line 103
    move-object/from16 v17, v1

    .line 104
    .line 105
    iget-object v1, v15, Lw1/a;->b:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v1, Lcoil3/util/d;

    .line 108
    .line 109
    move-object/from16 v18, v2

    .line 110
    .line 111
    move-object/from16 v2, p2

    .line 112
    .line 113
    invoke-interface {v1, v2}, Lcoil3/util/d;->a(Lt/f;)Z

    .line 114
    .line 115
    .line 116
    move-result v1

    .line 117
    if-eqz v1, :cond_3

    .line 118
    .line 119
    goto :goto_2

    .line 120
    :cond_2
    move-object/from16 v15, p0

    .line 121
    .line 122
    move-object/from16 v17, v1

    .line 123
    .line 124
    move-object/from16 v18, v2

    .line 125
    .line 126
    move-object/from16 v2, p2

    .line 127
    .line 128
    :cond_3
    move/from16 v1, v16

    .line 129
    .line 130
    goto :goto_3

    .line 131
    :cond_4
    move-object/from16 v15, p0

    .line 132
    .line 133
    move-object/from16 v17, v1

    .line 134
    .line 135
    move-object/from16 v18, v2

    .line 136
    .line 137
    move-object/from16 v2, p2

    .line 138
    .line 139
    :goto_2
    const/4 v1, 0x1

    .line 140
    :goto_3
    if-eqz v14, :cond_5

    .line 141
    .line 142
    if-eqz v1, :cond_5

    .line 143
    .line 144
    goto :goto_4

    .line 145
    :cond_5
    sget-object v10, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 146
    .line 147
    :goto_4
    if-eqz v12, :cond_6

    .line 148
    .line 149
    invoke-static {v0, v13}, Lcoil3/o;->e(Ls/f;Lo2/a;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    check-cast v1, Ljava/util/List;

    .line 154
    .line 155
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 156
    .line 157
    .line 158
    move-result v1

    .line 159
    if-eqz v1, :cond_6

    .line 160
    .line 161
    sget-object v1, Landroid/graphics/Bitmap$Config;->ALPHA_8:Landroid/graphics/Bitmap$Config;

    .line 162
    .line 163
    if-eq v10, v1, :cond_6

    .line 164
    .line 165
    const/4 v1, 0x1

    .line 166
    goto :goto_5

    .line 167
    :cond_6
    move/from16 v1, v16

    .line 168
    .line 169
    :goto_5
    iget-object v12, v0, Ls/f;->t:Ls/d;

    .line 170
    .line 171
    iget-object v12, v12, Ls/d;->n:Lcoil3/j;

    .line 172
    .line 173
    iget-object v12, v12, Lcoil3/j;->a:Ljava/util/Map;

    .line 174
    .line 175
    iget-object v13, v0, Ls/f;->r:Lcoil3/j;

    .line 176
    .line 177
    iget-object v13, v13, Lcoil3/j;->a:Ljava/util/Map;

    .line 178
    .line 179
    invoke-static {v12, v13}, Lkotlin/collections/e0;->F(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    .line 180
    .line 181
    .line 182
    move-result-object v12

    .line 183
    invoke-static {v12}, Lkotlin/collections/e0;->L(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    .line 184
    .line 185
    .line 186
    move-result-object v12

    .line 187
    invoke-static {v0, v5}, Lcoil3/o;->e(Ls/f;Lo2/a;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v13

    .line 191
    check-cast v13, Landroid/graphics/Bitmap$Config;

    .line 192
    .line 193
    if-eq v10, v13, :cond_8

    .line 194
    .line 195
    if-eqz v10, :cond_7

    .line 196
    .line 197
    invoke-interface {v12, v5, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    goto :goto_6

    .line 201
    :cond_7
    invoke-interface {v12, v5}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    :cond_8
    :goto_6
    invoke-static {v0, v11}, Lcoil3/o;->e(Ls/f;Lo2/a;)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    check-cast v0, Ljava/lang/Boolean;

    .line 209
    .line 210
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 211
    .line 212
    .line 213
    move-result v0

    .line 214
    if-eq v1, v0, :cond_9

    .line 215
    .line 216
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    invoke-interface {v12, v11, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    :cond_9
    new-instance v10, Lcoil3/j;

    .line 224
    .line 225
    invoke-static {v12}, Lt6/a;->x(Ljava/util/Map;)Ljava/util/Map;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    invoke-direct {v10, v0}, Lcoil3/j;-><init>(Ljava/util/Map;)V

    .line 230
    .line 231
    .line 232
    const/4 v5, 0x0

    .line 233
    move-object/from16 v1, v17

    .line 234
    .line 235
    move-object/from16 v0, v18

    .line 236
    .line 237
    invoke-direct/range {v0 .. v10}, Ls/l;-><init>(Landroid/content/Context;Lt/f;Lcoil3/size/Scale;Lcoil3/size/Precision;Ljava/lang/String;Lokio/FileSystem;Lcoil3/request/CachePolicy;Lcoil3/request/CachePolicy;Lcoil3/request/CachePolicy;Lcoil3/j;)V

    .line 238
    .line 239
    .line 240
    return-object v0
.end method

.method public d(Ls/l;)Ls/l;
    .locals 12

    .line 1
    iget-object v0, p1, Ls/l;->j:Lcoil3/j;

    .line 2
    .line 3
    sget-object v1, Ls/h;->b:Lo2/a;

    .line 4
    .line 5
    invoke-static {p1, v1}, Lcoil3/o;->f(Ls/l;Lo2/a;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    check-cast v2, Landroid/graphics/Bitmap$Config;

    .line 10
    .line 11
    invoke-static {v2}, Lkotlin/collections/u;->x(Landroid/graphics/Bitmap$Config;)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_2

    .line 16
    .line 17
    iget-object v2, p0, Lw1/a;->b:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v2, Lcoil3/util/d;

    .line 20
    .line 21
    invoke-interface {v2}, Lcoil3/util/d;->b()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    iget-object v0, v0, Lcoil3/j;->a:Ljava/util/Map;

    .line 32
    .line 33
    invoke-static {v0}, Lkotlin/collections/e0;->L(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 38
    .line 39
    if-eqz v2, :cond_1

    .line 40
    .line 41
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    :goto_0
    new-instance v1, Lcoil3/j;

    .line 49
    .line 50
    invoke-static {v0}, Lt6/a;->x(Ljava/util/Map;)Ljava/util/Map;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-direct {v1, v0}, Lcoil3/j;-><init>(Ljava/util/Map;)V

    .line 55
    .line 56
    .line 57
    const/4 v0, 0x1

    .line 58
    move-object v11, v1

    .line 59
    goto :goto_2

    .line 60
    :cond_2
    :goto_1
    const/4 v1, 0x0

    .line 61
    move-object v11, v0

    .line 62
    move v0, v1

    .line 63
    :goto_2
    if-eqz v0, :cond_3

    .line 64
    .line 65
    iget-object v2, p1, Ls/l;->a:Landroid/content/Context;

    .line 66
    .line 67
    iget-object v3, p1, Ls/l;->b:Lt/f;

    .line 68
    .line 69
    iget-object v4, p1, Ls/l;->c:Lcoil3/size/Scale;

    .line 70
    .line 71
    iget-object v5, p1, Ls/l;->d:Lcoil3/size/Precision;

    .line 72
    .line 73
    iget-object v6, p1, Ls/l;->e:Ljava/lang/String;

    .line 74
    .line 75
    iget-object v7, p1, Ls/l;->f:Lokio/FileSystem;

    .line 76
    .line 77
    iget-object v8, p1, Ls/l;->g:Lcoil3/request/CachePolicy;

    .line 78
    .line 79
    iget-object v9, p1, Ls/l;->h:Lcoil3/request/CachePolicy;

    .line 80
    .line 81
    iget-object v10, p1, Ls/l;->i:Lcoil3/request/CachePolicy;

    .line 82
    .line 83
    new-instance v1, Ls/l;

    .line 84
    .line 85
    invoke-direct/range {v1 .. v11}, Ls/l;-><init>(Landroid/content/Context;Lt/f;Lcoil3/size/Scale;Lcoil3/size/Precision;Ljava/lang/String;Lokio/FileSystem;Lcoil3/request/CachePolicy;Lcoil3/request/CachePolicy;Lcoil3/request/CachePolicy;Lcoil3/j;)V

    .line 86
    .line 87
    .line 88
    return-object v1

    .line 89
    :cond_3
    return-object p1
.end method
