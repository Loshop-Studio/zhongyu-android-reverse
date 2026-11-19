.class public abstract Lcoil3/intercept/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lcoil3/intercept/a;Ls/f;Ls/l;Lcoil3/h;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Lcoil3/intercept/a;
    .locals 10

    .line 1
    instance-of v0, p4, Lcoil3/intercept/EngineInterceptorKt$transform$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, Lcoil3/intercept/EngineInterceptorKt$transform$1;

    .line 7
    .line 8
    iget v1, v0, Lcoil3/intercept/EngineInterceptorKt$transform$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcoil3/intercept/EngineInterceptorKt$transform$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcoil3/intercept/EngineInterceptorKt$transform$1;

    .line 21
    .line 22
    invoke-direct {v0, p4}, Lcoil3/intercept/EngineInterceptorKt$transform$1;-><init>(Lh6/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, Lcoil3/intercept/EngineInterceptorKt$transform$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v1, v0, Lcoil3/intercept/EngineInterceptorKt$transform$1;->label:I

    .line 30
    .line 31
    const/4 v2, 0x1

    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    if-ne v1, v2, :cond_1

    .line 35
    .line 36
    iget p0, v0, Lcoil3/intercept/EngineInterceptorKt$transform$1;->I$1:I

    .line 37
    .line 38
    iget p1, v0, Lcoil3/intercept/EngineInterceptorKt$transform$1;->I$0:I

    .line 39
    .line 40
    iget-object p2, v0, Lcoil3/intercept/EngineInterceptorKt$transform$1;->L$4:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p2, Ljava/util/List;

    .line 43
    .line 44
    iget-object p3, v0, Lcoil3/intercept/EngineInterceptorKt$transform$1;->L$3:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p3, Lcoil3/h;

    .line 47
    .line 48
    iget-object v1, v0, Lcoil3/intercept/EngineInterceptorKt$transform$1;->L$2:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v1, Ls/l;

    .line 51
    .line 52
    iget-object v3, v0, Lcoil3/intercept/EngineInterceptorKt$transform$1;->L$1:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v3, Ls/f;

    .line 55
    .line 56
    iget-object v4, v0, Lcoil3/intercept/EngineInterceptorKt$transform$1;->L$0:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v4, Lcoil3/intercept/a;

    .line 59
    .line 60
    invoke-static {p4}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    check-cast p4, Landroid/graphics/Bitmap;

    .line 64
    .line 65
    invoke-interface {v0}, Lh6/c;->getContext()Lh6/h;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    invoke-static {v5}, Lkotlinx/coroutines/x;->j(Lh6/h;)V

    .line 70
    .line 71
    .line 72
    add-int/2addr p1, v2

    .line 73
    goto/16 :goto_3

    .line 74
    .line 75
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 76
    .line 77
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 78
    .line 79
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    throw p0

    .line 83
    :cond_2
    invoke-static {p4}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    sget-object p4, Ls/g;->a:Lo2/a;

    .line 87
    .line 88
    invoke-static {p1, p4}, Lcoil3/o;->e(Ls/f;Lo2/a;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p4

    .line 92
    check-cast p4, Ljava/util/List;

    .line 93
    .line 94
    invoke-interface {p4}, Ljava/util/List;->isEmpty()Z

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    if-eqz v1, :cond_3

    .line 99
    .line 100
    return-object p0

    .line 101
    :cond_3
    iget-object v1, p0, Lcoil3/intercept/a;->a:Lcoil3/k;

    .line 102
    .line 103
    instance-of v3, v1, Lcoil3/a;

    .line 104
    .line 105
    if-nez v3, :cond_4

    .line 106
    .line 107
    sget-object v4, Ls/g;->d:Lo2/a;

    .line 108
    .line 109
    invoke-static {p1, v4}, Lcoil3/o;->e(Ls/f;Lo2/a;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v4

    .line 113
    check-cast v4, Ljava/lang/Boolean;

    .line 114
    .line 115
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 116
    .line 117
    .line 118
    move-result v4

    .line 119
    if-nez v4, :cond_4

    .line 120
    .line 121
    return-object p0

    .line 122
    :cond_4
    const/4 v4, 0x0

    .line 123
    if-eqz v3, :cond_6

    .line 124
    .line 125
    move-object v3, v1

    .line 126
    check-cast v3, Lcoil3/a;

    .line 127
    .line 128
    iget-object v3, v3, Lcoil3/a;->a:Landroid/graphics/Bitmap;

    .line 129
    .line 130
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    .line 131
    .line 132
    .line 133
    move-result-object v5

    .line 134
    if-nez v5, :cond_5

    .line 135
    .line 136
    sget-object v5, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 137
    .line 138
    :cond_5
    sget-object v6, Lcoil3/util/l;->a:[Landroid/graphics/Bitmap$Config;

    .line 139
    .line 140
    invoke-static {v6, v5}, Lkotlin/collections/q;->v([Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result v5

    .line 144
    if-eqz v5, :cond_6

    .line 145
    .line 146
    move-object v1, v3

    .line 147
    goto :goto_2

    .line 148
    :cond_6
    iget-object v3, p2, Ls/l;->a:Landroid/content/Context;

    .line 149
    .line 150
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 151
    .line 152
    .line 153
    move-result-object v3

    .line 154
    invoke-static {v1, v3}, Lcoil3/o;->b(Lcoil3/k;Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    sget-object v3, Ls/h;->b:Lo2/a;

    .line 159
    .line 160
    invoke-static {p2, v3}, Lcoil3/o;->f(Ls/l;Lo2/a;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v3

    .line 164
    check-cast v3, Landroid/graphics/Bitmap$Config;

    .line 165
    .line 166
    iget-object v5, p2, Ls/l;->b:Lt/f;

    .line 167
    .line 168
    iget-object v6, p2, Ls/l;->c:Lcoil3/size/Scale;

    .line 169
    .line 170
    iget-object v7, p2, Ls/l;->d:Lcoil3/size/Precision;

    .line 171
    .line 172
    sget-object v8, Lcoil3/size/Precision;->INEXACT:Lcoil3/size/Precision;

    .line 173
    .line 174
    if-ne v7, v8, :cond_7

    .line 175
    .line 176
    move v7, v2

    .line 177
    goto :goto_1

    .line 178
    :cond_7
    move v7, v4

    .line 179
    :goto_1
    invoke-static {v1, v3, v5, v6, v7}, Lv7/d;->g(Landroid/graphics/drawable/Drawable;Landroid/graphics/Bitmap$Config;Lt/f;Lcoil3/size/Scale;Z)Landroid/graphics/Bitmap;

    .line 180
    .line 181
    .line 182
    move-result-object v1

    .line 183
    :goto_2
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    invoke-interface {p4}, Ljava/util/Collection;->size()I

    .line 187
    .line 188
    .line 189
    move-result v3

    .line 190
    move v9, v4

    .line 191
    move-object v4, p0

    .line 192
    move p0, v3

    .line 193
    move-object v3, p1

    .line 194
    move p1, v9

    .line 195
    move-object v9, v1

    .line 196
    move-object v1, p2

    .line 197
    move-object p2, p4

    .line 198
    move-object p4, v9

    .line 199
    :goto_3
    if-lt p1, p0, :cond_8

    .line 200
    .line 201
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 202
    .line 203
    .line 204
    new-instance p0, Lcoil3/a;

    .line 205
    .line 206
    invoke-direct {p0, p4}, Lcoil3/a;-><init>(Landroid/graphics/Bitmap;)V

    .line 207
    .line 208
    .line 209
    iget-boolean p1, v4, Lcoil3/intercept/a;->b:Z

    .line 210
    .line 211
    iget-object p2, v4, Lcoil3/intercept/a;->c:Lcoil3/decode/DataSource;

    .line 212
    .line 213
    iget-object p3, v4, Lcoil3/intercept/a;->d:Ljava/lang/String;

    .line 214
    .line 215
    new-instance p4, Lcoil3/intercept/a;

    .line 216
    .line 217
    invoke-direct {p4, p0, p1, p2, p3}, Lcoil3/intercept/a;-><init>(Lcoil3/k;ZLcoil3/decode/DataSource;Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    return-object p4

    .line 221
    :cond_8
    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object p4

    .line 225
    if-nez p4, :cond_9

    .line 226
    .line 227
    iget-object p4, v1, Ls/l;->b:Lt/f;

    .line 228
    .line 229
    iput-object v4, v0, Lcoil3/intercept/EngineInterceptorKt$transform$1;->L$0:Ljava/lang/Object;

    .line 230
    .line 231
    iput-object v3, v0, Lcoil3/intercept/EngineInterceptorKt$transform$1;->L$1:Ljava/lang/Object;

    .line 232
    .line 233
    iput-object v1, v0, Lcoil3/intercept/EngineInterceptorKt$transform$1;->L$2:Ljava/lang/Object;

    .line 234
    .line 235
    iput-object p3, v0, Lcoil3/intercept/EngineInterceptorKt$transform$1;->L$3:Ljava/lang/Object;

    .line 236
    .line 237
    iput-object p2, v0, Lcoil3/intercept/EngineInterceptorKt$transform$1;->L$4:Ljava/lang/Object;

    .line 238
    .line 239
    iput p1, v0, Lcoil3/intercept/EngineInterceptorKt$transform$1;->I$0:I

    .line 240
    .line 241
    iput p0, v0, Lcoil3/intercept/EngineInterceptorKt$transform$1;->I$1:I

    .line 242
    .line 243
    iput v2, v0, Lcoil3/intercept/EngineInterceptorKt$transform$1;->label:I

    .line 244
    .line 245
    const/4 p0, 0x0

    .line 246
    throw p0

    .line 247
    :cond_9
    new-instance p0, Ljava/lang/ClassCastException;

    .line 248
    .line 249
    invoke-direct {p0}, Ljava/lang/ClassCastException;-><init>()V

    .line 250
    .line 251
    .line 252
    throw p0
.end method
