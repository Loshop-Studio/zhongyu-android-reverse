.class public Ld6/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;
.implements Ls6/a;


# instance fields
.field public final synthetic a:I

.field public b:I

.field public final c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Ld6/j;->a:I

    iput-object p1, p0, Ld6/j;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lm7/x;)V
    .locals 1

    const/4 v0, 0x4

    iput v0, p0, Ld6/j;->a:I

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    iput-object p1, p0, Ld6/j;->c:Ljava/lang/Object;

    .line 9
    iget p1, p1, Lm7/a1;->c:I

    .line 10
    iput p1, p0, Ld6/j;->b:I

    return-void
.end method

.method public constructor <init>([D)V
    .locals 1

    const/4 v0, 0x6

    iput v0, p0, Ld6/j;->a:I

    const-string v0, "array"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, Ld6/j;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>([F)V
    .locals 1

    const/4 v0, 0x7

    iput v0, p0, Ld6/j;->a:I

    const-string v0, "array"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Ld6/j;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>([Ljava/lang/Object;)V
    .locals 1

    const/16 v0, 0x8

    iput v0, p0, Ld6/j;->a:I

    const-string v0, "array"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld6/j;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 2

    .line 1
    iget v0, p0, Ld6/j;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget v0, p0, Ld6/j;->b:I

    .line 7
    .line 8
    iget-object v1, p0, Ld6/j;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, [Ljava/lang/Object;

    .line 11
    .line 12
    array-length v1, v1

    .line 13
    if-ge v0, v1, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    :goto_0
    return v0

    .line 19
    :pswitch_0
    iget v0, p0, Ld6/j;->b:I

    .line 20
    .line 21
    iget-object v1, p0, Ld6/j;->c:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v1, [F

    .line 24
    .line 25
    array-length v1, v1

    .line 26
    if-ge v0, v1, :cond_1

    .line 27
    .line 28
    const/4 v0, 0x1

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    const/4 v0, 0x0

    .line 31
    :goto_1
    return v0

    .line 32
    :pswitch_1
    iget v0, p0, Ld6/j;->b:I

    .line 33
    .line 34
    iget-object v1, p0, Ld6/j;->c:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v1, [D

    .line 37
    .line 38
    array-length v1, v1

    .line 39
    if-ge v0, v1, :cond_2

    .line 40
    .line 41
    const/4 v0, 0x1

    .line 42
    goto :goto_2

    .line 43
    :cond_2
    const/4 v0, 0x0

    .line 44
    :goto_2
    return v0

    .line 45
    :pswitch_2
    iget v0, p0, Ld6/j;->b:I

    .line 46
    .line 47
    iget-object v1, p0, Ld6/j;->c:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v1, Lkotlin/collections/f;

    .line 50
    .line 51
    invoke-virtual {v1}, Lkotlin/collections/a;->size()I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-ge v0, v1, :cond_3

    .line 56
    .line 57
    const/4 v0, 0x1

    .line 58
    goto :goto_3

    .line 59
    :cond_3
    const/4 v0, 0x0

    .line 60
    :goto_3
    return v0

    .line 61
    :pswitch_3
    iget v0, p0, Ld6/j;->b:I

    .line 62
    .line 63
    if-lez v0, :cond_4

    .line 64
    .line 65
    const/4 v0, 0x1

    .line 66
    goto :goto_4

    .line 67
    :cond_4
    const/4 v0, 0x0

    .line 68
    :goto_4
    return v0

    .line 69
    :pswitch_4
    iget v0, p0, Ld6/j;->b:I

    .line 70
    .line 71
    iget-object v1, p0, Ld6/j;->c:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v1, [S

    .line 74
    .line 75
    array-length v1, v1

    .line 76
    if-ge v0, v1, :cond_5

    .line 77
    .line 78
    const/4 v0, 0x1

    .line 79
    goto :goto_5

    .line 80
    :cond_5
    const/4 v0, 0x0

    .line 81
    :goto_5
    return v0

    .line 82
    :pswitch_5
    iget v0, p0, Ld6/j;->b:I

    .line 83
    .line 84
    iget-object v1, p0, Ld6/j;->c:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v1, [J

    .line 87
    .line 88
    array-length v1, v1

    .line 89
    if-ge v0, v1, :cond_6

    .line 90
    .line 91
    const/4 v0, 0x1

    .line 92
    goto :goto_6

    .line 93
    :cond_6
    const/4 v0, 0x0

    .line 94
    :goto_6
    return v0

    .line 95
    :pswitch_6
    iget v0, p0, Ld6/j;->b:I

    .line 96
    .line 97
    iget-object v1, p0, Ld6/j;->c:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v1, [I

    .line 100
    .line 101
    array-length v1, v1

    .line 102
    if-ge v0, v1, :cond_7

    .line 103
    .line 104
    const/4 v0, 0x1

    .line 105
    goto :goto_7

    .line 106
    :cond_7
    const/4 v0, 0x0

    .line 107
    :goto_7
    return v0

    .line 108
    :pswitch_7
    iget v0, p0, Ld6/j;->b:I

    .line 109
    .line 110
    iget-object v1, p0, Ld6/j;->c:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v1, [B

    .line 113
    .line 114
    array-length v1, v1

    .line 115
    if-ge v0, v1, :cond_8

    .line 116
    .line 117
    const/4 v0, 0x1

    .line 118
    goto :goto_8

    .line 119
    :cond_8
    const/4 v0, 0x0

    .line 120
    :goto_8
    return v0

    .line 121
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final next()Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Ld6/j;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :try_start_0
    iget-object v0, p0, Ld6/j;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, [Ljava/lang/Object;

    .line 9
    .line 10
    iget v1, p0, Ld6/j;->b:I

    .line 11
    .line 12
    add-int/lit8 v2, v1, 0x1

    .line 13
    .line 14
    iput v2, p0, Ld6/j;->b:I

    .line 15
    .line 16
    aget-object v0, v0, v1
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    .line 18
    return-object v0

    .line 19
    :catch_0
    move-exception v0

    .line 20
    iget v1, p0, Ld6/j;->b:I

    .line 21
    .line 22
    add-int/lit8 v1, v1, -0x1

    .line 23
    .line 24
    iput v1, p0, Ld6/j;->b:I

    .line 25
    .line 26
    new-instance v1, Ljava/util/NoSuchElementException;

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-direct {v1, v0}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw v1

    .line 36
    :pswitch_0
    :try_start_1
    iget-object v0, p0, Ld6/j;->c:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v0, [F

    .line 39
    .line 40
    iget v1, p0, Ld6/j;->b:I

    .line 41
    .line 42
    add-int/lit8 v2, v1, 0x1

    .line 43
    .line 44
    iput v2, p0, Ld6/j;->b:I

    .line 45
    .line 46
    aget v0, v0, v1
    :try_end_1
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_1

    .line 47
    .line 48
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    return-object v0

    .line 53
    :catch_1
    move-exception v0

    .line 54
    iget v1, p0, Ld6/j;->b:I

    .line 55
    .line 56
    add-int/lit8 v1, v1, -0x1

    .line 57
    .line 58
    iput v1, p0, Ld6/j;->b:I

    .line 59
    .line 60
    new-instance v1, Ljava/util/NoSuchElementException;

    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-direct {v1, v0}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    throw v1

    .line 70
    :pswitch_1
    :try_start_2
    iget-object v0, p0, Ld6/j;->c:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v0, [D

    .line 73
    .line 74
    iget v1, p0, Ld6/j;->b:I

    .line 75
    .line 76
    add-int/lit8 v2, v1, 0x1

    .line 77
    .line 78
    iput v2, p0, Ld6/j;->b:I

    .line 79
    .line 80
    aget-wide v1, v0, v1
    :try_end_2
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_2 .. :try_end_2} :catch_2

    .line 81
    .line 82
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    return-object v0

    .line 87
    :catch_2
    move-exception v0

    .line 88
    iget v1, p0, Ld6/j;->b:I

    .line 89
    .line 90
    add-int/lit8 v1, v1, -0x1

    .line 91
    .line 92
    iput v1, p0, Ld6/j;->b:I

    .line 93
    .line 94
    new-instance v1, Ljava/util/NoSuchElementException;

    .line 95
    .line 96
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-direct {v1, v0}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    throw v1

    .line 104
    :pswitch_2
    invoke-virtual {p0}, Ld6/j;->hasNext()Z

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    if-eqz v0, :cond_0

    .line 109
    .line 110
    iget-object v0, p0, Ld6/j;->c:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v0, Lkotlin/collections/f;

    .line 113
    .line 114
    iget v1, p0, Ld6/j;->b:I

    .line 115
    .line 116
    add-int/lit8 v2, v1, 0x1

    .line 117
    .line 118
    iput v2, p0, Ld6/j;->b:I

    .line 119
    .line 120
    invoke-virtual {v0, v1}, Lkotlin/collections/f;->get(I)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    return-object v0

    .line 125
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 126
    .line 127
    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 128
    .line 129
    .line 130
    throw v0

    .line 131
    :pswitch_3
    iget-object v0, p0, Ld6/j;->c:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast v0, Lm7/x;

    .line 134
    .line 135
    iget v1, v0, Lm7/a1;->c:I

    .line 136
    .line 137
    iget v2, p0, Ld6/j;->b:I

    .line 138
    .line 139
    add-int/lit8 v3, v2, -0x1

    .line 140
    .line 141
    iput v3, p0, Ld6/j;->b:I

    .line 142
    .line 143
    sub-int/2addr v1, v2

    .line 144
    iget-object v0, v0, Lm7/a1;->e:[Ljava/lang/String;

    .line 145
    .line 146
    aget-object v0, v0, v1

    .line 147
    .line 148
    return-object v0

    .line 149
    :pswitch_4
    iget v0, p0, Ld6/j;->b:I

    .line 150
    .line 151
    iget-object v1, p0, Ld6/j;->c:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast v1, [S

    .line 154
    .line 155
    array-length v2, v1

    .line 156
    if-ge v0, v2, :cond_1

    .line 157
    .line 158
    add-int/lit8 v2, v0, 0x1

    .line 159
    .line 160
    iput v2, p0, Ld6/j;->b:I

    .line 161
    .line 162
    aget-short v0, v1, v0

    .line 163
    .line 164
    new-instance v1, Ld6/q;

    .line 165
    .line 166
    invoke-direct {v1, v0}, Ld6/q;-><init>(S)V

    .line 167
    .line 168
    .line 169
    return-object v1

    .line 170
    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 171
    .line 172
    iget v1, p0, Ld6/j;->b:I

    .line 173
    .line 174
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v1

    .line 178
    invoke-direct {v0, v1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    throw v0

    .line 182
    :pswitch_5
    iget v0, p0, Ld6/j;->b:I

    .line 183
    .line 184
    iget-object v1, p0, Ld6/j;->c:Ljava/lang/Object;

    .line 185
    .line 186
    check-cast v1, [J

    .line 187
    .line 188
    array-length v2, v1

    .line 189
    if-ge v0, v2, :cond_2

    .line 190
    .line 191
    add-int/lit8 v2, v0, 0x1

    .line 192
    .line 193
    iput v2, p0, Ld6/j;->b:I

    .line 194
    .line 195
    aget-wide v0, v1, v0

    .line 196
    .line 197
    new-instance v2, Ld6/n;

    .line 198
    .line 199
    invoke-direct {v2, v0, v1}, Ld6/n;-><init>(J)V

    .line 200
    .line 201
    .line 202
    return-object v2

    .line 203
    :cond_2
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 204
    .line 205
    iget v1, p0, Ld6/j;->b:I

    .line 206
    .line 207
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v1

    .line 211
    invoke-direct {v0, v1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    throw v0

    .line 215
    :pswitch_6
    iget v0, p0, Ld6/j;->b:I

    .line 216
    .line 217
    iget-object v1, p0, Ld6/j;->c:Ljava/lang/Object;

    .line 218
    .line 219
    check-cast v1, [I

    .line 220
    .line 221
    array-length v2, v1

    .line 222
    if-ge v0, v2, :cond_3

    .line 223
    .line 224
    add-int/lit8 v2, v0, 0x1

    .line 225
    .line 226
    iput v2, p0, Ld6/j;->b:I

    .line 227
    .line 228
    aget v0, v1, v0

    .line 229
    .line 230
    new-instance v1, Ld6/l;

    .line 231
    .line 232
    invoke-direct {v1, v0}, Ld6/l;-><init>(I)V

    .line 233
    .line 234
    .line 235
    return-object v1

    .line 236
    :cond_3
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 237
    .line 238
    iget v1, p0, Ld6/j;->b:I

    .line 239
    .line 240
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v1

    .line 244
    invoke-direct {v0, v1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    throw v0

    .line 248
    :pswitch_7
    iget v0, p0, Ld6/j;->b:I

    .line 249
    .line 250
    iget-object v1, p0, Ld6/j;->c:Ljava/lang/Object;

    .line 251
    .line 252
    check-cast v1, [B

    .line 253
    .line 254
    array-length v2, v1

    .line 255
    if-ge v0, v2, :cond_4

    .line 256
    .line 257
    add-int/lit8 v2, v0, 0x1

    .line 258
    .line 259
    iput v2, p0, Ld6/j;->b:I

    .line 260
    .line 261
    aget-byte v0, v1, v0

    .line 262
    .line 263
    new-instance v1, Ld6/i;

    .line 264
    .line 265
    invoke-direct {v1, v0}, Ld6/i;-><init>(B)V

    .line 266
    .line 267
    .line 268
    return-object v1

    .line 269
    :cond_4
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 270
    .line 271
    iget v1, p0, Ld6/j;->b:I

    .line 272
    .line 273
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v1

    .line 277
    invoke-direct {v0, v1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 278
    .line 279
    .line 280
    throw v0

    .line 281
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final remove()V
    .locals 2

    .line 1
    iget v0, p0, Ld6/j;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 7
    .line 8
    const-string v1, "Operation is not supported for read-only collection"

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw v0

    .line 14
    :pswitch_0
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 15
    .line 16
    const-string v1, "Operation is not supported for read-only collection"

    .line 17
    .line 18
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw v0

    .line 22
    :pswitch_1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 23
    .line 24
    const-string v1, "Operation is not supported for read-only collection"

    .line 25
    .line 26
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw v0

    .line 30
    :pswitch_2
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 31
    .line 32
    const-string v1, "Operation is not supported for read-only collection"

    .line 33
    .line 34
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw v0

    .line 38
    :pswitch_3
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 39
    .line 40
    const-string v1, "Operation is not supported for read-only collection"

    .line 41
    .line 42
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw v0

    .line 46
    :pswitch_4
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 47
    .line 48
    const-string v1, "Operation is not supported for read-only collection"

    .line 49
    .line 50
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw v0

    .line 54
    :pswitch_5
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 55
    .line 56
    const-string v1, "Operation is not supported for read-only collection"

    .line 57
    .line 58
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    throw v0

    .line 62
    :pswitch_6
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 63
    .line 64
    const-string v1, "Operation is not supported for read-only collection"

    .line 65
    .line 66
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    throw v0

    .line 70
    :pswitch_7
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 71
    .line 72
    const-string v1, "Operation is not supported for read-only collection"

    .line 73
    .line 74
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    throw v0

    .line 78
    nop

    .line 79
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
