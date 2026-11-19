.class public abstract Lr0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;


# instance fields
.field public a:I

.field public b:Lb0/o;

.field public c:Lcom/bumptech/glide/Priority;

.field public d:I

.field public e:I

.field public f:Z

.field public g:I

.field public h:I

.field public i:Ly/c;

.field public j:Z

.field public k:Ly/f;

.field public l:Lcom/bumptech/glide/util/CachedHashCodeArrayMap;

.field public m:Ljava/lang/Class;

.field public n:Z

.field public o:Z

.field public p:Z

.field public q:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lb0/o;->d:Lb0/m;

    .line 5
    .line 6
    iput-object v0, p0, Lr0/a;->b:Lb0/o;

    .line 7
    .line 8
    sget-object v0, Lcom/bumptech/glide/Priority;->NORMAL:Lcom/bumptech/glide/Priority;

    .line 9
    .line 10
    iput-object v0, p0, Lr0/a;->c:Lcom/bumptech/glide/Priority;

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    iput-boolean v0, p0, Lr0/a;->f:Z

    .line 14
    .line 15
    const/4 v1, -0x1

    .line 16
    iput v1, p0, Lr0/a;->g:I

    .line 17
    .line 18
    iput v1, p0, Lr0/a;->h:I

    .line 19
    .line 20
    sget-object v1, Lu0/a;->b:Lu0/a;

    .line 21
    .line 22
    iput-object v1, p0, Lr0/a;->i:Ly/c;

    .line 23
    .line 24
    new-instance v1, Ly/f;

    .line 25
    .line 26
    invoke-direct {v1}, Ly/f;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object v1, p0, Lr0/a;->k:Ly/f;

    .line 30
    .line 31
    new-instance v1, Lcom/bumptech/glide/util/CachedHashCodeArrayMap;

    .line 32
    .line 33
    invoke-direct {v1}, Lcom/bumptech/glide/util/CachedHashCodeArrayMap;-><init>()V

    .line 34
    .line 35
    .line 36
    iput-object v1, p0, Lr0/a;->l:Lcom/bumptech/glide/util/CachedHashCodeArrayMap;

    .line 37
    .line 38
    const-class v1, Ljava/lang/Object;

    .line 39
    .line 40
    iput-object v1, p0, Lr0/a;->m:Ljava/lang/Class;

    .line 41
    .line 42
    iput-boolean v0, p0, Lr0/a;->p:Z

    .line 43
    .line 44
    return-void
.end method

.method public static i(II)Z
    .locals 0

    .line 1
    and-int/2addr p0, p1

    .line 2
    if-eqz p0, :cond_0

    .line 3
    .line 4
    const/4 p0, 0x1

    .line 5
    return p0

    .line 6
    :cond_0
    const/4 p0, 0x0

    .line 7
    return p0
.end method


# virtual methods
.method public c(Lr0/a;)Lr0/a;
    .locals 3

    .line 1
    iget-boolean v0, p0, Lr0/a;->o:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lr0/a;->e()Lr0/a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1}, Lr0/a;->c(Lr0/a;)Lr0/a;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    :cond_0
    iget v0, p1, Lr0/a;->a:I

    .line 15
    .line 16
    iget v0, p1, Lr0/a;->a:I

    .line 17
    .line 18
    const/high16 v1, 0x100000

    .line 19
    .line 20
    invoke-static {v0, v1}, Lr0/a;->i(II)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    iget-boolean v0, p1, Lr0/a;->q:Z

    .line 27
    .line 28
    iput-boolean v0, p0, Lr0/a;->q:Z

    .line 29
    .line 30
    :cond_1
    iget v0, p1, Lr0/a;->a:I

    .line 31
    .line 32
    const/4 v1, 0x4

    .line 33
    invoke-static {v0, v1}, Lr0/a;->i(II)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    iget-object v0, p1, Lr0/a;->b:Lb0/o;

    .line 40
    .line 41
    iput-object v0, p0, Lr0/a;->b:Lb0/o;

    .line 42
    .line 43
    :cond_2
    iget v0, p1, Lr0/a;->a:I

    .line 44
    .line 45
    const/16 v1, 0x8

    .line 46
    .line 47
    invoke-static {v0, v1}, Lr0/a;->i(II)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_3

    .line 52
    .line 53
    iget-object v0, p1, Lr0/a;->c:Lcom/bumptech/glide/Priority;

    .line 54
    .line 55
    iput-object v0, p0, Lr0/a;->c:Lcom/bumptech/glide/Priority;

    .line 56
    .line 57
    :cond_3
    iget v0, p1, Lr0/a;->a:I

    .line 58
    .line 59
    const/16 v1, 0x10

    .line 60
    .line 61
    invoke-static {v0, v1}, Lr0/a;->i(II)Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    const/4 v1, 0x0

    .line 66
    if-eqz v0, :cond_4

    .line 67
    .line 68
    iput v1, p0, Lr0/a;->d:I

    .line 69
    .line 70
    iget v0, p0, Lr0/a;->a:I

    .line 71
    .line 72
    and-int/lit8 v0, v0, -0x21

    .line 73
    .line 74
    iput v0, p0, Lr0/a;->a:I

    .line 75
    .line 76
    :cond_4
    iget v0, p1, Lr0/a;->a:I

    .line 77
    .line 78
    const/16 v2, 0x20

    .line 79
    .line 80
    invoke-static {v0, v2}, Lr0/a;->i(II)Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-eqz v0, :cond_5

    .line 85
    .line 86
    iget v0, p1, Lr0/a;->d:I

    .line 87
    .line 88
    iput v0, p0, Lr0/a;->d:I

    .line 89
    .line 90
    iget v0, p0, Lr0/a;->a:I

    .line 91
    .line 92
    and-int/lit8 v0, v0, -0x11

    .line 93
    .line 94
    iput v0, p0, Lr0/a;->a:I

    .line 95
    .line 96
    :cond_5
    iget v0, p1, Lr0/a;->a:I

    .line 97
    .line 98
    const/16 v2, 0x40

    .line 99
    .line 100
    invoke-static {v0, v2}, Lr0/a;->i(II)Z

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    if-eqz v0, :cond_6

    .line 105
    .line 106
    iput v1, p0, Lr0/a;->e:I

    .line 107
    .line 108
    iget v0, p0, Lr0/a;->a:I

    .line 109
    .line 110
    and-int/lit16 v0, v0, -0x81

    .line 111
    .line 112
    iput v0, p0, Lr0/a;->a:I

    .line 113
    .line 114
    :cond_6
    iget v0, p1, Lr0/a;->a:I

    .line 115
    .line 116
    const/16 v1, 0x80

    .line 117
    .line 118
    invoke-static {v0, v1}, Lr0/a;->i(II)Z

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    if-eqz v0, :cond_7

    .line 123
    .line 124
    iget v0, p1, Lr0/a;->e:I

    .line 125
    .line 126
    iput v0, p0, Lr0/a;->e:I

    .line 127
    .line 128
    iget v0, p0, Lr0/a;->a:I

    .line 129
    .line 130
    and-int/lit8 v0, v0, -0x41

    .line 131
    .line 132
    iput v0, p0, Lr0/a;->a:I

    .line 133
    .line 134
    :cond_7
    iget v0, p1, Lr0/a;->a:I

    .line 135
    .line 136
    const/16 v1, 0x100

    .line 137
    .line 138
    invoke-static {v0, v1}, Lr0/a;->i(II)Z

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    if-eqz v0, :cond_8

    .line 143
    .line 144
    iget-boolean v0, p1, Lr0/a;->f:Z

    .line 145
    .line 146
    iput-boolean v0, p0, Lr0/a;->f:Z

    .line 147
    .line 148
    :cond_8
    iget v0, p1, Lr0/a;->a:I

    .line 149
    .line 150
    const/16 v1, 0x200

    .line 151
    .line 152
    invoke-static {v0, v1}, Lr0/a;->i(II)Z

    .line 153
    .line 154
    .line 155
    move-result v0

    .line 156
    if-eqz v0, :cond_9

    .line 157
    .line 158
    iget v0, p1, Lr0/a;->h:I

    .line 159
    .line 160
    iput v0, p0, Lr0/a;->h:I

    .line 161
    .line 162
    iget v0, p1, Lr0/a;->g:I

    .line 163
    .line 164
    iput v0, p0, Lr0/a;->g:I

    .line 165
    .line 166
    :cond_9
    iget v0, p1, Lr0/a;->a:I

    .line 167
    .line 168
    const/16 v1, 0x400

    .line 169
    .line 170
    invoke-static {v0, v1}, Lr0/a;->i(II)Z

    .line 171
    .line 172
    .line 173
    move-result v0

    .line 174
    if-eqz v0, :cond_a

    .line 175
    .line 176
    iget-object v0, p1, Lr0/a;->i:Ly/c;

    .line 177
    .line 178
    iput-object v0, p0, Lr0/a;->i:Ly/c;

    .line 179
    .line 180
    :cond_a
    iget v0, p1, Lr0/a;->a:I

    .line 181
    .line 182
    const/16 v1, 0x1000

    .line 183
    .line 184
    invoke-static {v0, v1}, Lr0/a;->i(II)Z

    .line 185
    .line 186
    .line 187
    move-result v0

    .line 188
    if-eqz v0, :cond_b

    .line 189
    .line 190
    iget-object v0, p1, Lr0/a;->m:Ljava/lang/Class;

    .line 191
    .line 192
    iput-object v0, p0, Lr0/a;->m:Ljava/lang/Class;

    .line 193
    .line 194
    :cond_b
    iget v0, p1, Lr0/a;->a:I

    .line 195
    .line 196
    const/16 v1, 0x2000

    .line 197
    .line 198
    invoke-static {v0, v1}, Lr0/a;->i(II)Z

    .line 199
    .line 200
    .line 201
    move-result v0

    .line 202
    if-eqz v0, :cond_c

    .line 203
    .line 204
    iget v0, p0, Lr0/a;->a:I

    .line 205
    .line 206
    and-int/lit16 v0, v0, -0x4001

    .line 207
    .line 208
    iput v0, p0, Lr0/a;->a:I

    .line 209
    .line 210
    :cond_c
    iget v0, p1, Lr0/a;->a:I

    .line 211
    .line 212
    const/16 v1, 0x4000

    .line 213
    .line 214
    invoke-static {v0, v1}, Lr0/a;->i(II)Z

    .line 215
    .line 216
    .line 217
    move-result v0

    .line 218
    if-eqz v0, :cond_d

    .line 219
    .line 220
    iget v0, p0, Lr0/a;->a:I

    .line 221
    .line 222
    and-int/lit16 v0, v0, -0x2001

    .line 223
    .line 224
    iput v0, p0, Lr0/a;->a:I

    .line 225
    .line 226
    :cond_d
    iget v0, p1, Lr0/a;->a:I

    .line 227
    .line 228
    const/high16 v1, 0x20000

    .line 229
    .line 230
    invoke-static {v0, v1}, Lr0/a;->i(II)Z

    .line 231
    .line 232
    .line 233
    move-result v0

    .line 234
    if-eqz v0, :cond_e

    .line 235
    .line 236
    iget-boolean v0, p1, Lr0/a;->j:Z

    .line 237
    .line 238
    iput-boolean v0, p0, Lr0/a;->j:Z

    .line 239
    .line 240
    :cond_e
    iget v0, p1, Lr0/a;->a:I

    .line 241
    .line 242
    const/16 v1, 0x800

    .line 243
    .line 244
    invoke-static {v0, v1}, Lr0/a;->i(II)Z

    .line 245
    .line 246
    .line 247
    move-result v0

    .line 248
    if-eqz v0, :cond_f

    .line 249
    .line 250
    iget-object v0, p0, Lr0/a;->l:Lcom/bumptech/glide/util/CachedHashCodeArrayMap;

    .line 251
    .line 252
    iget-object v1, p1, Lr0/a;->l:Lcom/bumptech/glide/util/CachedHashCodeArrayMap;

    .line 253
    .line 254
    invoke-interface {v0, v1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 255
    .line 256
    .line 257
    iget-boolean v0, p1, Lr0/a;->p:Z

    .line 258
    .line 259
    iput-boolean v0, p0, Lr0/a;->p:Z

    .line 260
    .line 261
    :cond_f
    iget v0, p0, Lr0/a;->a:I

    .line 262
    .line 263
    iget v1, p1, Lr0/a;->a:I

    .line 264
    .line 265
    or-int/2addr v0, v1

    .line 266
    iput v0, p0, Lr0/a;->a:I

    .line 267
    .line 268
    iget-object v0, p0, Lr0/a;->k:Ly/f;

    .line 269
    .line 270
    iget-object p1, p1, Lr0/a;->k:Ly/f;

    .line 271
    .line 272
    iget-object v0, v0, Ly/f;->b:Lcom/bumptech/glide/util/CachedHashCodeArrayMap;

    .line 273
    .line 274
    iget-object p1, p1, Ly/f;->b:Lcom/bumptech/glide/util/CachedHashCodeArrayMap;

    .line 275
    .line 276
    invoke-virtual {v0, p1}, Lcom/bumptech/glide/util/CachedHashCodeArrayMap;->putAll(Landroidx/collection/SimpleArrayMap;)V

    .line 277
    .line 278
    .line 279
    invoke-virtual {p0}, Lr0/a;->o()V

    .line 280
    .line 281
    .line 282
    return-object p0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lr0/a;->e()Lr0/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public e()Lr0/a;
    .locals 3

    .line 1
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lr0/a;

    .line 6
    .line 7
    new-instance v1, Ly/f;

    .line 8
    .line 9
    invoke-direct {v1}, Ly/f;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v1, v0, Lr0/a;->k:Ly/f;

    .line 13
    .line 14
    iget-object v2, p0, Lr0/a;->k:Ly/f;

    .line 15
    .line 16
    iget-object v1, v1, Ly/f;->b:Lcom/bumptech/glide/util/CachedHashCodeArrayMap;

    .line 17
    .line 18
    iget-object v2, v2, Ly/f;->b:Lcom/bumptech/glide/util/CachedHashCodeArrayMap;

    .line 19
    .line 20
    invoke-virtual {v1, v2}, Lcom/bumptech/glide/util/CachedHashCodeArrayMap;->putAll(Landroidx/collection/SimpleArrayMap;)V

    .line 21
    .line 22
    .line 23
    new-instance v1, Lcom/bumptech/glide/util/CachedHashCodeArrayMap;

    .line 24
    .line 25
    invoke-direct {v1}, Lcom/bumptech/glide/util/CachedHashCodeArrayMap;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object v1, v0, Lr0/a;->l:Lcom/bumptech/glide/util/CachedHashCodeArrayMap;

    .line 29
    .line 30
    iget-object v2, p0, Lr0/a;->l:Lcom/bumptech/glide/util/CachedHashCodeArrayMap;

    .line 31
    .line 32
    invoke-interface {v1, v2}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 33
    .line 34
    .line 35
    const/4 v1, 0x0

    .line 36
    iput-boolean v1, v0, Lr0/a;->n:Z

    .line 37
    .line 38
    iput-boolean v1, v0, Lr0/a;->o:Z
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 39
    .line 40
    return-object v0

    .line 41
    :catch_0
    move-exception v0

    .line 42
    new-instance v1, Ljava/lang/RuntimeException;

    .line 43
    .line 44
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 45
    .line 46
    .line 47
    throw v1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, Lr0/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lr0/a;

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const/high16 v0, 0x3f800000    # 1.0f

    .line 11
    .line 12
    invoke-static {v0, v0}, Ljava/lang/Float;->compare(FF)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    iget v0, p0, Lr0/a;->d:I

    .line 19
    .line 20
    iget v1, p1, Lr0/a;->d:I

    .line 21
    .line 22
    if-ne v0, v1, :cond_0

    .line 23
    .line 24
    sget-object v0, Lv0/k;->a:[C

    .line 25
    .line 26
    iget v0, p0, Lr0/a;->e:I

    .line 27
    .line 28
    iget v1, p1, Lr0/a;->e:I

    .line 29
    .line 30
    if-ne v0, v1, :cond_0

    .line 31
    .line 32
    iget-boolean v0, p0, Lr0/a;->f:Z

    .line 33
    .line 34
    iget-boolean v1, p1, Lr0/a;->f:Z

    .line 35
    .line 36
    if-ne v0, v1, :cond_0

    .line 37
    .line 38
    iget v0, p0, Lr0/a;->g:I

    .line 39
    .line 40
    iget v1, p1, Lr0/a;->g:I

    .line 41
    .line 42
    if-ne v0, v1, :cond_0

    .line 43
    .line 44
    iget v0, p0, Lr0/a;->h:I

    .line 45
    .line 46
    iget v1, p1, Lr0/a;->h:I

    .line 47
    .line 48
    if-ne v0, v1, :cond_0

    .line 49
    .line 50
    iget-boolean v0, p0, Lr0/a;->j:Z

    .line 51
    .line 52
    iget-boolean v1, p1, Lr0/a;->j:Z

    .line 53
    .line 54
    if-ne v0, v1, :cond_0

    .line 55
    .line 56
    iget-object v0, p0, Lr0/a;->b:Lb0/o;

    .line 57
    .line 58
    iget-object v1, p1, Lr0/a;->b:Lb0/o;

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-eqz v0, :cond_0

    .line 65
    .line 66
    iget-object v0, p0, Lr0/a;->c:Lcom/bumptech/glide/Priority;

    .line 67
    .line 68
    iget-object v1, p1, Lr0/a;->c:Lcom/bumptech/glide/Priority;

    .line 69
    .line 70
    if-ne v0, v1, :cond_0

    .line 71
    .line 72
    iget-object v0, p0, Lr0/a;->k:Ly/f;

    .line 73
    .line 74
    iget-object v1, p1, Lr0/a;->k:Ly/f;

    .line 75
    .line 76
    invoke-virtual {v0, v1}, Ly/f;->equals(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-eqz v0, :cond_0

    .line 81
    .line 82
    iget-object v0, p0, Lr0/a;->l:Lcom/bumptech/glide/util/CachedHashCodeArrayMap;

    .line 83
    .line 84
    iget-object v1, p1, Lr0/a;->l:Lcom/bumptech/glide/util/CachedHashCodeArrayMap;

    .line 85
    .line 86
    invoke-interface {v0, v1}, Ljava/util/Map;->equals(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-eqz v0, :cond_0

    .line 91
    .line 92
    iget-object v0, p0, Lr0/a;->m:Ljava/lang/Class;

    .line 93
    .line 94
    iget-object v1, p1, Lr0/a;->m:Ljava/lang/Class;

    .line 95
    .line 96
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    if-eqz v0, :cond_0

    .line 101
    .line 102
    iget-object v0, p0, Lr0/a;->i:Ly/c;

    .line 103
    .line 104
    iget-object p1, p1, Lr0/a;->i:Ly/c;

    .line 105
    .line 106
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result p1

    .line 110
    if-eqz p1, :cond_0

    .line 111
    .line 112
    const/4 p1, 0x1

    .line 113
    return p1

    .line 114
    :cond_0
    const/4 p1, 0x0

    .line 115
    return p1
.end method

.method public final f(Ljava/lang/Class;)Lr0/a;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lr0/a;->o:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lr0/a;->e()Lr0/a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1}, Lr0/a;->f(Ljava/lang/Class;)Lr0/a;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    :cond_0
    iput-object p1, p0, Lr0/a;->m:Ljava/lang/Class;

    .line 15
    .line 16
    iget p1, p0, Lr0/a;->a:I

    .line 17
    .line 18
    or-int/lit16 p1, p1, 0x1000

    .line 19
    .line 20
    iput p1, p0, Lr0/a;->a:I

    .line 21
    .line 22
    invoke-virtual {p0}, Lr0/a;->o()V

    .line 23
    .line 24
    .line 25
    return-object p0
.end method

.method public final g(Lb0/o;)Lr0/a;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lr0/a;->o:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lr0/a;->e()Lr0/a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1}, Lr0/a;->g(Lb0/o;)Lr0/a;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    :cond_0
    iput-object p1, p0, Lr0/a;->b:Lb0/o;

    .line 15
    .line 16
    iget p1, p0, Lr0/a;->a:I

    .line 17
    .line 18
    or-int/lit8 p1, p1, 0x4

    .line 19
    .line 20
    iput p1, p0, Lr0/a;->a:I

    .line 21
    .line 22
    invoke-virtual {p0}, Lr0/a;->o()V

    .line 23
    .line 24
    .line 25
    return-object p0
.end method

.method public final h(I)Lr0/a;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lr0/a;->o:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lr0/a;->e()Lr0/a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1}, Lr0/a;->h(I)Lr0/a;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    :cond_0
    iput p1, p0, Lr0/a;->d:I

    .line 15
    .line 16
    iget p1, p0, Lr0/a;->a:I

    .line 17
    .line 18
    or-int/lit8 p1, p1, 0x20

    .line 19
    .line 20
    and-int/lit8 p1, p1, -0x11

    .line 21
    .line 22
    iput p1, p0, Lr0/a;->a:I

    .line 23
    .line 24
    invoke-virtual {p0}, Lr0/a;->o()V

    .line 25
    .line 26
    .line 27
    return-object p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    sget-object v0, Lv0/k;->a:[C

    .line 2
    .line 3
    const/16 v0, 0x11

    .line 4
    .line 5
    const/high16 v1, 0x3f800000    # 1.0f

    .line 6
    .line 7
    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-static {v1, v0}, Lv0/k;->e(II)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    iget v1, p0, Lr0/a;->d:I

    .line 16
    .line 17
    invoke-static {v1, v0}, Lv0/k;->e(II)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    const/4 v1, 0x0

    .line 22
    invoke-static {v0, v1}, Lv0/k;->f(ILjava/lang/Object;)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    iget v2, p0, Lr0/a;->e:I

    .line 27
    .line 28
    invoke-static {v2, v0}, Lv0/k;->e(II)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    invoke-static {v0, v1}, Lv0/k;->f(ILjava/lang/Object;)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    const/4 v2, 0x0

    .line 37
    invoke-static {v2, v0}, Lv0/k;->e(II)I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    invoke-static {v0, v1}, Lv0/k;->f(ILjava/lang/Object;)I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    iget-boolean v3, p0, Lr0/a;->f:Z

    .line 46
    .line 47
    invoke-static {v3, v0}, Lv0/k;->e(II)I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    iget v3, p0, Lr0/a;->g:I

    .line 52
    .line 53
    invoke-static {v3, v0}, Lv0/k;->e(II)I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    iget v3, p0, Lr0/a;->h:I

    .line 58
    .line 59
    invoke-static {v3, v0}, Lv0/k;->e(II)I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    iget-boolean v3, p0, Lr0/a;->j:Z

    .line 64
    .line 65
    invoke-static {v3, v0}, Lv0/k;->e(II)I

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    const/4 v3, 0x1

    .line 70
    invoke-static {v3, v0}, Lv0/k;->e(II)I

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    invoke-static {v2, v0}, Lv0/k;->e(II)I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    invoke-static {v2, v0}, Lv0/k;->e(II)I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    iget-object v2, p0, Lr0/a;->b:Lb0/o;

    .line 83
    .line 84
    invoke-static {v0, v2}, Lv0/k;->f(ILjava/lang/Object;)I

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    iget-object v2, p0, Lr0/a;->c:Lcom/bumptech/glide/Priority;

    .line 89
    .line 90
    invoke-static {v0, v2}, Lv0/k;->f(ILjava/lang/Object;)I

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    iget-object v2, p0, Lr0/a;->k:Ly/f;

    .line 95
    .line 96
    invoke-static {v0, v2}, Lv0/k;->f(ILjava/lang/Object;)I

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    iget-object v2, p0, Lr0/a;->l:Lcom/bumptech/glide/util/CachedHashCodeArrayMap;

    .line 101
    .line 102
    invoke-static {v0, v2}, Lv0/k;->f(ILjava/lang/Object;)I

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    iget-object v2, p0, Lr0/a;->m:Ljava/lang/Class;

    .line 107
    .line 108
    invoke-static {v0, v2}, Lv0/k;->f(ILjava/lang/Object;)I

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    iget-object v2, p0, Lr0/a;->i:Ly/c;

    .line 113
    .line 114
    invoke-static {v0, v2}, Lv0/k;->f(ILjava/lang/Object;)I

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    invoke-static {v0, v1}, Lv0/k;->f(ILjava/lang/Object;)I

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    return v0
.end method

.method public final j(Li0/k;Li0/d;)Lr0/a;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lr0/a;->o:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lr0/a;->e()Lr0/a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1, p2}, Lr0/a;->j(Li0/k;Li0/d;)Lr0/a;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    :cond_0
    sget-object v0, Li0/k;->g:Ly/e;

    .line 15
    .line 16
    invoke-virtual {p0, v0, p1}, Lr0/a;->p(Ly/e;Ljava/lang/Object;)Lr0/a;

    .line 17
    .line 18
    .line 19
    const/4 p1, 0x0

    .line 20
    invoke-virtual {p0, p2, p1}, Lr0/a;->u(Ly/i;Z)Lr0/a;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    return-object p1
.end method

.method public final k(II)Lr0/a;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lr0/a;->o:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lr0/a;->e()Lr0/a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1, p2}, Lr0/a;->k(II)Lr0/a;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    :cond_0
    iput p1, p0, Lr0/a;->h:I

    .line 15
    .line 16
    iput p2, p0, Lr0/a;->g:I

    .line 17
    .line 18
    iget p1, p0, Lr0/a;->a:I

    .line 19
    .line 20
    or-int/lit16 p1, p1, 0x200

    .line 21
    .line 22
    iput p1, p0, Lr0/a;->a:I

    .line 23
    .line 24
    invoke-virtual {p0}, Lr0/a;->o()V

    .line 25
    .line 26
    .line 27
    return-object p0
.end method

.method public final l(I)Lr0/a;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lr0/a;->o:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lr0/a;->e()Lr0/a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1}, Lr0/a;->l(I)Lr0/a;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    :cond_0
    iput p1, p0, Lr0/a;->e:I

    .line 15
    .line 16
    iget p1, p0, Lr0/a;->a:I

    .line 17
    .line 18
    or-int/lit16 p1, p1, 0x80

    .line 19
    .line 20
    and-int/lit8 p1, p1, -0x41

    .line 21
    .line 22
    iput p1, p0, Lr0/a;->a:I

    .line 23
    .line 24
    invoke-virtual {p0}, Lr0/a;->o()V

    .line 25
    .line 26
    .line 27
    return-object p0
.end method

.method public final m(Lcom/bumptech/glide/Priority;)Lr0/a;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lr0/a;->o:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lr0/a;->e()Lr0/a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1}, Lr0/a;->m(Lcom/bumptech/glide/Priority;)Lr0/a;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    :cond_0
    const-string v0, "Argument must not be null"

    .line 15
    .line 16
    invoke-static {p1, v0}, Lv7/d;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lr0/a;->c:Lcom/bumptech/glide/Priority;

    .line 20
    .line 21
    iget p1, p0, Lr0/a;->a:I

    .line 22
    .line 23
    or-int/lit8 p1, p1, 0x8

    .line 24
    .line 25
    iput p1, p0, Lr0/a;->a:I

    .line 26
    .line 27
    invoke-virtual {p0}, Lr0/a;->o()V

    .line 28
    .line 29
    .line 30
    return-object p0
.end method

.method public final n(Li0/k;Li0/d;Z)Lr0/a;
    .locals 0

    .line 1
    if-eqz p3, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lr0/a;->s(Li0/k;Li0/d;)Lr0/a;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {p0, p1, p2}, Lr0/a;->j(Li0/k;Li0/d;)Lr0/a;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    :goto_0
    const/4 p2, 0x1

    .line 13
    iput-boolean p2, p1, Lr0/a;->p:Z

    .line 14
    .line 15
    return-object p1
.end method

.method public final o()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lr0/a;->n:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 7
    .line 8
    const-string v1, "You cannot modify locked T, consider clone()"

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw v0
.end method

.method public final p(Ly/e;Ljava/lang/Object;)Lr0/a;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lr0/a;->o:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lr0/a;->e()Lr0/a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1, p2}, Lr0/a;->p(Ly/e;Ljava/lang/Object;)Lr0/a;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    :cond_0
    invoke-static {p1}, Lv7/d;->e(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lr0/a;->k:Ly/f;

    .line 18
    .line 19
    iget-object v0, v0, Ly/f;->b:Lcom/bumptech/glide/util/CachedHashCodeArrayMap;

    .line 20
    .line 21
    invoke-virtual {v0, p1, p2}, Lcom/bumptech/glide/util/CachedHashCodeArrayMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Lr0/a;->o()V

    .line 25
    .line 26
    .line 27
    return-object p0
.end method

.method public final q(Lu0/b;)Lr0/a;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lr0/a;->o:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lr0/a;->e()Lr0/a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1}, Lr0/a;->q(Lu0/b;)Lr0/a;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    :cond_0
    iput-object p1, p0, Lr0/a;->i:Ly/c;

    .line 15
    .line 16
    iget p1, p0, Lr0/a;->a:I

    .line 17
    .line 18
    or-int/lit16 p1, p1, 0x400

    .line 19
    .line 20
    iput p1, p0, Lr0/a;->a:I

    .line 21
    .line 22
    invoke-virtual {p0}, Lr0/a;->o()V

    .line 23
    .line 24
    .line 25
    return-object p0
.end method

.method public final r()Lr0/a;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lr0/a;->o:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lr0/a;->e()Lr0/a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Lr0/a;->r()Lr0/a;

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
    iput-boolean v0, p0, Lr0/a;->f:Z

    .line 16
    .line 17
    iget v0, p0, Lr0/a;->a:I

    .line 18
    .line 19
    or-int/lit16 v0, v0, 0x100

    .line 20
    .line 21
    iput v0, p0, Lr0/a;->a:I

    .line 22
    .line 23
    invoke-virtual {p0}, Lr0/a;->o()V

    .line 24
    .line 25
    .line 26
    return-object p0
.end method

.method public final s(Li0/k;Li0/d;)Lr0/a;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lr0/a;->o:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lr0/a;->e()Lr0/a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1, p2}, Lr0/a;->s(Li0/k;Li0/d;)Lr0/a;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    :cond_0
    sget-object v0, Li0/k;->g:Ly/e;

    .line 15
    .line 16
    invoke-virtual {p0, v0, p1}, Lr0/a;->p(Ly/e;Ljava/lang/Object;)Lr0/a;

    .line 17
    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    invoke-virtual {p0, p2, p1}, Lr0/a;->u(Ly/i;Z)Lr0/a;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    return-object p1
.end method

.method public final t(Ljava/lang/Class;Ly/i;Z)Lr0/a;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lr0/a;->o:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lr0/a;->e()Lr0/a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1, p2, p3}, Lr0/a;->t(Ljava/lang/Class;Ly/i;Z)Lr0/a;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    :cond_0
    invoke-static {p2}, Lv7/d;->e(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lr0/a;->l:Lcom/bumptech/glide/util/CachedHashCodeArrayMap;

    .line 18
    .line 19
    invoke-virtual {v0, p1, p2}, Lcom/bumptech/glide/util/CachedHashCodeArrayMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    iget p1, p0, Lr0/a;->a:I

    .line 23
    .line 24
    const p2, 0x10800

    .line 25
    .line 26
    .line 27
    or-int/2addr p2, p1

    .line 28
    iput p2, p0, Lr0/a;->a:I

    .line 29
    .line 30
    const/4 p2, 0x0

    .line 31
    iput-boolean p2, p0, Lr0/a;->p:Z

    .line 32
    .line 33
    if-eqz p3, :cond_1

    .line 34
    .line 35
    const p2, 0x30800

    .line 36
    .line 37
    .line 38
    or-int/2addr p1, p2

    .line 39
    iput p1, p0, Lr0/a;->a:I

    .line 40
    .line 41
    const/4 p1, 0x1

    .line 42
    iput-boolean p1, p0, Lr0/a;->j:Z

    .line 43
    .line 44
    :cond_1
    invoke-virtual {p0}, Lr0/a;->o()V

    .line 45
    .line 46
    .line 47
    return-object p0
.end method

.method public final u(Ly/i;Z)Lr0/a;
    .locals 2

    .line 1
    iget-boolean v0, p0, Lr0/a;->o:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lr0/a;->e()Lr0/a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1, p2}, Lr0/a;->u(Ly/i;Z)Lr0/a;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    :cond_0
    new-instance v0, Li0/p;

    .line 15
    .line 16
    invoke-direct {v0, p1, p2}, Li0/p;-><init>(Ly/i;Z)V

    .line 17
    .line 18
    .line 19
    const-class v1, Landroid/graphics/Bitmap;

    .line 20
    .line 21
    invoke-virtual {p0, v1, p1, p2}, Lr0/a;->t(Ljava/lang/Class;Ly/i;Z)Lr0/a;

    .line 22
    .line 23
    .line 24
    const-class v1, Landroid/graphics/drawable/Drawable;

    .line 25
    .line 26
    invoke-virtual {p0, v1, v0, p2}, Lr0/a;->t(Ljava/lang/Class;Ly/i;Z)Lr0/a;

    .line 27
    .line 28
    .line 29
    const-class v1, Landroid/graphics/drawable/BitmapDrawable;

    .line 30
    .line 31
    invoke-virtual {p0, v1, v0, p2}, Lr0/a;->t(Ljava/lang/Class;Ly/i;Z)Lr0/a;

    .line 32
    .line 33
    .line 34
    new-instance v0, Lm0/b;

    .line 35
    .line 36
    invoke-direct {v0, p1}, Lm0/b;-><init>(Ly/i;)V

    .line 37
    .line 38
    .line 39
    const-class p1, Lcom/bumptech/glide/load/resource/gif/GifDrawable;

    .line 40
    .line 41
    invoke-virtual {p0, p1, v0, p2}, Lr0/a;->t(Ljava/lang/Class;Ly/i;Z)Lr0/a;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, Lr0/a;->o()V

    .line 45
    .line 46
    .line 47
    return-object p0
.end method

.method public final v()Lr0/a;
    .locals 2

    .line 1
    iget-boolean v0, p0, Lr0/a;->o:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lr0/a;->e()Lr0/a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Lr0/a;->v()Lr0/a;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0

    .line 14
    :cond_0
    const/4 v0, 0x1

    .line 15
    iput-boolean v0, p0, Lr0/a;->q:Z

    .line 16
    .line 17
    iget v0, p0, Lr0/a;->a:I

    .line 18
    .line 19
    const/high16 v1, 0x100000

    .line 20
    .line 21
    or-int/2addr v0, v1

    .line 22
    iput v0, p0, Lr0/a;->a:I

    .line 23
    .line 24
    invoke-virtual {p0}, Lr0/a;->o()V

    .line 25
    .line 26
    .line 27
    return-object p0
.end method
