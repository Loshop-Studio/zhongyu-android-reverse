.class public final Lcoil3/disk/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/AutoCloseable;


# static fields
.field public static final r:Lkotlin/text/Regex;


# instance fields
.field public final a:Lokio/Path;

.field public final b:J

.field public final c:Lokio/Path;

.field public final d:Lokio/Path;

.field public final e:Lokio/Path;

.field public final f:Ljava/util/LinkedHashMap;

.field public final g:Le7/c;

.field public final h:Ljava/lang/Object;

.field public i:J

.field public j:I

.field public k:Lokio/BufferedSink;

.field public l:Z

.field public m:Z

.field public n:Z

.field public o:Z

.field public p:Z

.field public final q:Lcoil3/disk/e;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lkotlin/text/Regex;

    .line 2
    .line 3
    const-string v1, "[a-z0-9_-]{1,120}"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lcoil3/disk/f;->r:Lkotlin/text/Regex;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Lokio/FileSystem;Lokio/Path;Lh6/h;J)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lcoil3/disk/f;->a:Lokio/Path;

    .line 5
    .line 6
    iput-wide p4, p0, Lcoil3/disk/f;->b:J

    .line 7
    .line 8
    const-wide/16 v0, 0x0

    .line 9
    .line 10
    cmp-long p4, p4, v0

    .line 11
    .line 12
    if-lez p4, :cond_1

    .line 13
    .line 14
    const-string p4, "journal"

    .line 15
    .line 16
    invoke-virtual {p2, p4}, Lokio/Path;->resolve(Ljava/lang/String;)Lokio/Path;

    .line 17
    .line 18
    .line 19
    move-result-object p4

    .line 20
    iput-object p4, p0, Lcoil3/disk/f;->c:Lokio/Path;

    .line 21
    .line 22
    const-string p4, "journal.tmp"

    .line 23
    .line 24
    invoke-virtual {p2, p4}, Lokio/Path;->resolve(Ljava/lang/String;)Lokio/Path;

    .line 25
    .line 26
    .line 27
    move-result-object p4

    .line 28
    iput-object p4, p0, Lcoil3/disk/f;->d:Lokio/Path;

    .line 29
    .line 30
    const-string p4, "journal.bkp"

    .line 31
    .line 32
    invoke-virtual {p2, p4}, Lokio/Path;->resolve(Ljava/lang/String;)Lokio/Path;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    iput-object p2, p0, Lcoil3/disk/f;->e:Lokio/Path;

    .line 37
    .line 38
    new-instance p2, Ljava/util/LinkedHashMap;

    .line 39
    .line 40
    const/4 p4, 0x0

    .line 41
    const/high16 p5, 0x3f400000    # 0.75f

    .line 42
    .line 43
    const/4 v0, 0x1

    .line 44
    invoke-direct {p2, p4, p5, v0}, Ljava/util/LinkedHashMap;-><init>(IFZ)V

    .line 45
    .line 46
    .line 47
    iput-object p2, p0, Lcoil3/disk/f;->f:Ljava/util/LinkedHashMap;

    .line 48
    .line 49
    invoke-static {}, Lkotlinx/coroutines/x;->c()Lkotlinx/coroutines/m1;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    invoke-interface {p3, p2}, Lh6/h;->plus(Lh6/h;)Lh6/h;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    sget-object p4, Lkotlinx/coroutines/r;->Key:Lkotlinx/coroutines/q;

    .line 58
    .line 59
    invoke-interface {p3, p4}, Lh6/h;->get(Lh6/g;)Lh6/f;

    .line 60
    .line 61
    .line 62
    move-result-object p3

    .line 63
    check-cast p3, Lkotlinx/coroutines/r;

    .line 64
    .line 65
    if-nez p3, :cond_0

    .line 66
    .line 67
    sget-object p3, Lkotlinx/coroutines/f0;->a:Lg7/e;

    .line 68
    .line 69
    sget-object p3, Lg7/d;->a:Lg7/d;

    .line 70
    .line 71
    :cond_0
    const/4 p4, 0x2

    .line 72
    const/4 p5, 0x0

    .line 73
    invoke-static {p3, v0, p5, p4, p5}, Lkotlinx/coroutines/r;->limitedParallelism$default(Lkotlinx/coroutines/r;ILjava/lang/String;ILjava/lang/Object;)Lkotlinx/coroutines/r;

    .line 74
    .line 75
    .line 76
    move-result-object p3

    .line 77
    invoke-interface {p2, p3}, Lh6/h;->plus(Lh6/h;)Lh6/h;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    invoke-static {p2}, Lkotlinx/coroutines/x;->a(Lh6/h;)Le7/c;

    .line 82
    .line 83
    .line 84
    move-result-object p2

    .line 85
    iput-object p2, p0, Lcoil3/disk/f;->g:Le7/c;

    .line 86
    .line 87
    new-instance p2, Ljava/lang/Object;

    .line 88
    .line 89
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 90
    .line 91
    .line 92
    iput-object p2, p0, Lcoil3/disk/f;->h:Ljava/lang/Object;

    .line 93
    .line 94
    new-instance p2, Lcoil3/disk/e;

    .line 95
    .line 96
    invoke-direct {p2, p1}, Lokio/ForwardingFileSystem;-><init>(Lokio/FileSystem;)V

    .line 97
    .line 98
    .line 99
    iput-object p2, p0, Lcoil3/disk/f;->q:Lcoil3/disk/e;

    .line 100
    .line 101
    return-void

    .line 102
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 103
    .line 104
    const-string p2, "maxSize <= 0"

    .line 105
    .line 106
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    throw p1
.end method

.method public static final a(Lcoil3/disk/f;Lcoil3/disk/b;Z)V
    .locals 10

    .line 1
    iget-object v0, p0, Lcoil3/disk/f;->h:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p1, Lcoil3/disk/b;->c:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v1, Lcoil3/disk/c;

    .line 7
    .line 8
    iget-object v2, v1, Lcoil3/disk/c;->g:Lcoil3/disk/b;

    .line 9
    .line 10
    invoke-static {v2, p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-eqz v2, :cond_d

    .line 15
    .line 16
    const/4 v2, 0x2

    .line 17
    const/4 v3, 0x0

    .line 18
    if-eqz p2, :cond_4

    .line 19
    .line 20
    iget-boolean v4, v1, Lcoil3/disk/c;->f:Z

    .line 21
    .line 22
    if-nez v4, :cond_4

    .line 23
    .line 24
    move v4, v3

    .line 25
    :goto_0
    if-ge v4, v2, :cond_1

    .line 26
    .line 27
    iget-object v5, p1, Lcoil3/disk/b;->a:[Z

    .line 28
    .line 29
    aget-boolean v5, v5, v4

    .line 30
    .line 31
    if-eqz v5, :cond_0

    .line 32
    .line 33
    iget-object v5, p0, Lcoil3/disk/f;->q:Lcoil3/disk/e;

    .line 34
    .line 35
    iget-object v6, v1, Lcoil3/disk/c;->d:Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v6

    .line 41
    check-cast v6, Lokio/Path;

    .line 42
    .line 43
    invoke-virtual {v5, v6}, Lokio/FileSystem;->exists(Lokio/Path;)Z

    .line 44
    .line 45
    .line 46
    move-result v5

    .line 47
    if-nez v5, :cond_0

    .line 48
    .line 49
    invoke-virtual {p1, v3}, Lcoil3/disk/b;->b(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    .line 51
    .line 52
    monitor-exit v0

    .line 53
    return-void

    .line 54
    :catchall_0
    move-exception p0

    .line 55
    goto/16 :goto_8

    .line 56
    .line 57
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_1
    move p1, v3

    .line 61
    :goto_1
    if-ge p1, v2, :cond_5

    .line 62
    .line 63
    :try_start_1
    iget-object v4, v1, Lcoil3/disk/c;->d:Ljava/util/ArrayList;

    .line 64
    .line 65
    invoke-virtual {v4, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    check-cast v4, Lokio/Path;

    .line 70
    .line 71
    iget-object v5, v1, Lcoil3/disk/c;->c:Ljava/util/ArrayList;

    .line 72
    .line 73
    invoke-virtual {v5, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    check-cast v5, Lokio/Path;

    .line 78
    .line 79
    iget-object v6, p0, Lcoil3/disk/f;->q:Lcoil3/disk/e;

    .line 80
    .line 81
    invoke-virtual {v6, v4}, Lokio/FileSystem;->exists(Lokio/Path;)Z

    .line 82
    .line 83
    .line 84
    move-result v6

    .line 85
    if-eqz v6, :cond_2

    .line 86
    .line 87
    iget-object v6, p0, Lcoil3/disk/f;->q:Lcoil3/disk/e;

    .line 88
    .line 89
    invoke-virtual {v6, v4, v5}, Lokio/ForwardingFileSystem;->atomicMove(Lokio/Path;Lokio/Path;)V

    .line 90
    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_2
    iget-object v4, p0, Lcoil3/disk/f;->q:Lcoil3/disk/e;

    .line 94
    .line 95
    iget-object v6, v1, Lcoil3/disk/c;->c:Ljava/util/ArrayList;

    .line 96
    .line 97
    invoke-virtual {v6, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v6

    .line 101
    check-cast v6, Lokio/Path;

    .line 102
    .line 103
    invoke-static {v4, v6}, Lv7/l;->f(Lokio/FileSystem;Lokio/Path;)V

    .line 104
    .line 105
    .line 106
    :goto_2
    iget-object v4, v1, Lcoil3/disk/c;->b:[J

    .line 107
    .line 108
    aget-wide v6, v4, p1

    .line 109
    .line 110
    iget-object v4, p0, Lcoil3/disk/f;->q:Lcoil3/disk/e;

    .line 111
    .line 112
    invoke-virtual {v4, v5}, Lokio/FileSystem;->metadata(Lokio/Path;)Lokio/FileMetadata;

    .line 113
    .line 114
    .line 115
    move-result-object v4

    .line 116
    invoke-virtual {v4}, Lokio/FileMetadata;->getSize()Ljava/lang/Long;

    .line 117
    .line 118
    .line 119
    move-result-object v4

    .line 120
    if-eqz v4, :cond_3

    .line 121
    .line 122
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 123
    .line 124
    .line 125
    move-result-wide v4

    .line 126
    goto :goto_3

    .line 127
    :cond_3
    const-wide/16 v4, 0x0

    .line 128
    .line 129
    :goto_3
    iget-object v8, v1, Lcoil3/disk/c;->b:[J

    .line 130
    .line 131
    aput-wide v4, v8, p1

    .line 132
    .line 133
    iget-wide v8, p0, Lcoil3/disk/f;->i:J

    .line 134
    .line 135
    sub-long/2addr v8, v6

    .line 136
    add-long/2addr v8, v4

    .line 137
    iput-wide v8, p0, Lcoil3/disk/f;->i:J

    .line 138
    .line 139
    add-int/lit8 p1, p1, 0x1

    .line 140
    .line 141
    goto :goto_1

    .line 142
    :cond_4
    move p1, v3

    .line 143
    :goto_4
    if-ge p1, v2, :cond_5

    .line 144
    .line 145
    iget-object v4, p0, Lcoil3/disk/f;->q:Lcoil3/disk/e;

    .line 146
    .line 147
    iget-object v5, v1, Lcoil3/disk/c;->d:Ljava/util/ArrayList;

    .line 148
    .line 149
    invoke-virtual {v5, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v5

    .line 153
    check-cast v5, Lokio/Path;

    .line 154
    .line 155
    invoke-virtual {v4, v5}, Lokio/FileSystem;->delete(Lokio/Path;)V

    .line 156
    .line 157
    .line 158
    add-int/lit8 p1, p1, 0x1

    .line 159
    .line 160
    goto :goto_4

    .line 161
    :cond_5
    const/4 p1, 0x0

    .line 162
    iput-object p1, v1, Lcoil3/disk/c;->g:Lcoil3/disk/b;

    .line 163
    .line 164
    iget-boolean p1, v1, Lcoil3/disk/c;->f:Z

    .line 165
    .line 166
    if-eqz p1, :cond_6

    .line 167
    .line 168
    invoke-virtual {p0, v1}, Lcoil3/disk/f;->k(Lcoil3/disk/c;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 169
    .line 170
    .line 171
    monitor-exit v0

    .line 172
    return-void

    .line 173
    :cond_6
    :try_start_2
    iget p1, p0, Lcoil3/disk/f;->j:I

    .line 174
    .line 175
    const/4 v2, 0x1

    .line 176
    add-int/2addr p1, v2

    .line 177
    iput p1, p0, Lcoil3/disk/f;->j:I

    .line 178
    .line 179
    iget-object p1, p0, Lcoil3/disk/f;->k:Lokio/BufferedSink;

    .line 180
    .line 181
    invoke-static {p1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 182
    .line 183
    .line 184
    const/16 v4, 0xa

    .line 185
    .line 186
    const/16 v5, 0x20

    .line 187
    .line 188
    if-nez p2, :cond_8

    .line 189
    .line 190
    iget-boolean p2, v1, Lcoil3/disk/c;->e:Z

    .line 191
    .line 192
    if-eqz p2, :cond_7

    .line 193
    .line 194
    goto :goto_5

    .line 195
    :cond_7
    iget-object p2, p0, Lcoil3/disk/f;->f:Ljava/util/LinkedHashMap;

    .line 196
    .line 197
    iget-object v6, v1, Lcoil3/disk/c;->a:Ljava/lang/String;

    .line 198
    .line 199
    invoke-interface {p2, v6}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    const-string p2, "REMOVE"

    .line 203
    .line 204
    invoke-interface {p1, p2}, Lokio/BufferedSink;->writeUtf8(Ljava/lang/String;)Lokio/BufferedSink;

    .line 205
    .line 206
    .line 207
    invoke-interface {p1, v5}, Lokio/BufferedSink;->writeByte(I)Lokio/BufferedSink;

    .line 208
    .line 209
    .line 210
    iget-object p2, v1, Lcoil3/disk/c;->a:Ljava/lang/String;

    .line 211
    .line 212
    invoke-interface {p1, p2}, Lokio/BufferedSink;->writeUtf8(Ljava/lang/String;)Lokio/BufferedSink;

    .line 213
    .line 214
    .line 215
    invoke-interface {p1, v4}, Lokio/BufferedSink;->writeByte(I)Lokio/BufferedSink;

    .line 216
    .line 217
    .line 218
    goto :goto_7

    .line 219
    :cond_8
    :goto_5
    iput-boolean v2, v1, Lcoil3/disk/c;->e:Z

    .line 220
    .line 221
    const-string p2, "CLEAN"

    .line 222
    .line 223
    invoke-interface {p1, p2}, Lokio/BufferedSink;->writeUtf8(Ljava/lang/String;)Lokio/BufferedSink;

    .line 224
    .line 225
    .line 226
    invoke-interface {p1, v5}, Lokio/BufferedSink;->writeByte(I)Lokio/BufferedSink;

    .line 227
    .line 228
    .line 229
    iget-object p2, v1, Lcoil3/disk/c;->a:Ljava/lang/String;

    .line 230
    .line 231
    invoke-interface {p1, p2}, Lokio/BufferedSink;->writeUtf8(Ljava/lang/String;)Lokio/BufferedSink;

    .line 232
    .line 233
    .line 234
    iget-object p2, v1, Lcoil3/disk/c;->b:[J

    .line 235
    .line 236
    array-length v1, p2

    .line 237
    move v6, v3

    .line 238
    :goto_6
    if-ge v6, v1, :cond_9

    .line 239
    .line 240
    aget-wide v7, p2, v6

    .line 241
    .line 242
    invoke-interface {p1, v5}, Lokio/BufferedSink;->writeByte(I)Lokio/BufferedSink;

    .line 243
    .line 244
    .line 245
    move-result-object v9

    .line 246
    invoke-interface {v9, v7, v8}, Lokio/BufferedSink;->writeDecimalLong(J)Lokio/BufferedSink;

    .line 247
    .line 248
    .line 249
    add-int/lit8 v6, v6, 0x1

    .line 250
    .line 251
    goto :goto_6

    .line 252
    :cond_9
    invoke-interface {p1, v4}, Lokio/BufferedSink;->writeByte(I)Lokio/BufferedSink;

    .line 253
    .line 254
    .line 255
    :goto_7
    invoke-interface {p1}, Lokio/BufferedSink;->flush()V

    .line 256
    .line 257
    .line 258
    iget-wide p1, p0, Lcoil3/disk/f;->i:J

    .line 259
    .line 260
    iget-wide v4, p0, Lcoil3/disk/f;->b:J

    .line 261
    .line 262
    cmp-long p1, p1, v4

    .line 263
    .line 264
    if-gtz p1, :cond_b

    .line 265
    .line 266
    iget p1, p0, Lcoil3/disk/f;->j:I

    .line 267
    .line 268
    const/16 p2, 0x7d0

    .line 269
    .line 270
    if-lt p1, p2, :cond_a

    .line 271
    .line 272
    move v3, v2

    .line 273
    :cond_a
    if-eqz v3, :cond_c

    .line 274
    .line 275
    :cond_b
    invoke-virtual {p0}, Lcoil3/disk/f;->e()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 276
    .line 277
    .line 278
    :cond_c
    monitor-exit v0

    .line 279
    return-void

    .line 280
    :cond_d
    :try_start_3
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 281
    .line 282
    const-string p1, "Check failed."

    .line 283
    .line 284
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 288
    :goto_8
    monitor-exit v0

    .line 289
    throw p0
.end method

.method public static m(Ljava/lang/String;)V
    .locals 2

    .line 1
    sget-object v0, Lcoil3/disk/f;->r:Lkotlin/text/Regex;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lkotlin/text/Regex;->matches(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    const-string v0, "keys must match regex [a-z0-9_-]{1,120}: \""

    .line 11
    .line 12
    const/16 v1, 0x22

    .line 13
    .line 14
    invoke-static {v1, v0, p0}, Landroidx/compose/material3/c;->k(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw v0
.end method


# virtual methods
.method public final b(Ljava/lang/String;)Lcoil3/disk/b;
    .locals 5

    .line 1
    iget-object v0, p0, Lcoil3/disk/f;->h:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Lcoil3/disk/f;->n:Z

    .line 5
    .line 6
    if-nez v1, :cond_7

    .line 7
    .line 8
    invoke-static {p1}, Lcoil3/disk/f;->m(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcoil3/disk/f;->d()V

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, Lcoil3/disk/f;->f:Ljava/util/LinkedHashMap;

    .line 15
    .line 16
    invoke-virtual {v1, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Lcoil3/disk/c;

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    iget-object v3, v1, Lcoil3/disk/c;->g:Lcoil3/disk/b;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :catchall_0
    move-exception p1

    .line 29
    goto :goto_2

    .line 30
    :cond_0
    move-object v3, v2

    .line 31
    :goto_0
    if-eqz v3, :cond_1

    .line 32
    .line 33
    monitor-exit v0

    .line 34
    return-object v2

    .line 35
    :cond_1
    if-eqz v1, :cond_2

    .line 36
    .line 37
    :try_start_1
    iget v3, v1, Lcoil3/disk/c;->h:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 38
    .line 39
    if-eqz v3, :cond_2

    .line 40
    .line 41
    monitor-exit v0

    .line 42
    return-object v2

    .line 43
    :cond_2
    :try_start_2
    iget-boolean v3, p0, Lcoil3/disk/f;->o:Z

    .line 44
    .line 45
    if-nez v3, :cond_6

    .line 46
    .line 47
    iget-boolean v3, p0, Lcoil3/disk/f;->p:Z

    .line 48
    .line 49
    if-eqz v3, :cond_3

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_3
    iget-object v3, p0, Lcoil3/disk/f;->k:Lokio/BufferedSink;

    .line 53
    .line 54
    invoke-static {v3}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    const-string v4, "DIRTY"

    .line 58
    .line 59
    invoke-interface {v3, v4}, Lokio/BufferedSink;->writeUtf8(Ljava/lang/String;)Lokio/BufferedSink;

    .line 60
    .line 61
    .line 62
    const/16 v4, 0x20

    .line 63
    .line 64
    invoke-interface {v3, v4}, Lokio/BufferedSink;->writeByte(I)Lokio/BufferedSink;

    .line 65
    .line 66
    .line 67
    invoke-interface {v3, p1}, Lokio/BufferedSink;->writeUtf8(Ljava/lang/String;)Lokio/BufferedSink;

    .line 68
    .line 69
    .line 70
    const/16 v4, 0xa

    .line 71
    .line 72
    invoke-interface {v3, v4}, Lokio/BufferedSink;->writeByte(I)Lokio/BufferedSink;

    .line 73
    .line 74
    .line 75
    invoke-interface {v3}, Lokio/BufferedSink;->flush()V

    .line 76
    .line 77
    .line 78
    iget-boolean v3, p0, Lcoil3/disk/f;->l:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 79
    .line 80
    if-eqz v3, :cond_4

    .line 81
    .line 82
    monitor-exit v0

    .line 83
    return-object v2

    .line 84
    :cond_4
    if-nez v1, :cond_5

    .line 85
    .line 86
    :try_start_3
    new-instance v1, Lcoil3/disk/c;

    .line 87
    .line 88
    invoke-direct {v1, p0, p1}, Lcoil3/disk/c;-><init>(Lcoil3/disk/f;Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    iget-object v2, p0, Lcoil3/disk/f;->f:Ljava/util/LinkedHashMap;

    .line 92
    .line 93
    invoke-interface {v2, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    :cond_5
    new-instance p1, Lcoil3/disk/b;

    .line 97
    .line 98
    invoke-direct {p1, p0, v1}, Lcoil3/disk/b;-><init>(Lcoil3/disk/f;Lcoil3/disk/c;)V

    .line 99
    .line 100
    .line 101
    iput-object p1, v1, Lcoil3/disk/c;->g:Lcoil3/disk/b;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 102
    .line 103
    monitor-exit v0

    .line 104
    return-object p1

    .line 105
    :cond_6
    :goto_1
    :try_start_4
    invoke-virtual {p0}, Lcoil3/disk/f;->e()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 106
    .line 107
    .line 108
    monitor-exit v0

    .line 109
    return-object v2

    .line 110
    :cond_7
    :try_start_5
    const-string p1, "cache is closed"

    .line 111
    .line 112
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 113
    .line 114
    invoke-direct {v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    throw v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 118
    :goto_2
    monitor-exit v0

    .line 119
    throw p1
.end method

.method public final c(Ljava/lang/String;)Lcoil3/disk/d;
    .locals 5

    .line 1
    iget-object v0, p0, Lcoil3/disk/f;->h:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Lcoil3/disk/f;->n:Z

    .line 5
    .line 6
    if-nez v1, :cond_4

    .line 7
    .line 8
    invoke-static {p1}, Lcoil3/disk/f;->m(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcoil3/disk/f;->d()V

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, Lcoil3/disk/f;->f:Ljava/util/LinkedHashMap;

    .line 15
    .line 16
    invoke-virtual {v1, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Lcoil3/disk/c;

    .line 21
    .line 22
    if-eqz v1, :cond_3

    .line 23
    .line 24
    invoke-virtual {v1}, Lcoil3/disk/c;->a()Lcoil3/disk/d;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    if-nez v1, :cond_0

    .line 29
    .line 30
    goto :goto_2

    .line 31
    :cond_0
    iget v2, p0, Lcoil3/disk/f;->j:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    add-int/2addr v2, v3

    .line 35
    iput v2, p0, Lcoil3/disk/f;->j:I

    .line 36
    .line 37
    iget-object v2, p0, Lcoil3/disk/f;->k:Lokio/BufferedSink;

    .line 38
    .line 39
    invoke-static {v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    const-string v4, "READ"

    .line 43
    .line 44
    invoke-interface {v2, v4}, Lokio/BufferedSink;->writeUtf8(Ljava/lang/String;)Lokio/BufferedSink;

    .line 45
    .line 46
    .line 47
    const/16 v4, 0x20

    .line 48
    .line 49
    invoke-interface {v2, v4}, Lokio/BufferedSink;->writeByte(I)Lokio/BufferedSink;

    .line 50
    .line 51
    .line 52
    invoke-interface {v2, p1}, Lokio/BufferedSink;->writeUtf8(Ljava/lang/String;)Lokio/BufferedSink;

    .line 53
    .line 54
    .line 55
    const/16 p1, 0xa

    .line 56
    .line 57
    invoke-interface {v2, p1}, Lokio/BufferedSink;->writeByte(I)Lokio/BufferedSink;

    .line 58
    .line 59
    .line 60
    invoke-interface {v2}, Lokio/BufferedSink;->flush()V

    .line 61
    .line 62
    .line 63
    iget p1, p0, Lcoil3/disk/f;->j:I

    .line 64
    .line 65
    const/16 v2, 0x7d0

    .line 66
    .line 67
    if-lt p1, v2, :cond_1

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_1
    const/4 v3, 0x0

    .line 71
    :goto_0
    if-eqz v3, :cond_2

    .line 72
    .line 73
    invoke-virtual {p0}, Lcoil3/disk/f;->e()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 74
    .line 75
    .line 76
    goto :goto_1

    .line 77
    :catchall_0
    move-exception p1

    .line 78
    goto :goto_3

    .line 79
    :cond_2
    :goto_1
    monitor-exit v0

    .line 80
    return-object v1

    .line 81
    :cond_3
    :goto_2
    monitor-exit v0

    .line 82
    const/4 p1, 0x0

    .line 83
    return-object p1

    .line 84
    :cond_4
    :try_start_1
    const-string p1, "cache is closed"

    .line 85
    .line 86
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 87
    .line 88
    invoke-direct {v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 92
    :goto_3
    monitor-exit v0

    .line 93
    throw p1
.end method

.method public final close()V
    .locals 8

    .line 1
    iget-object v0, p0, Lcoil3/disk/f;->h:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Lcoil3/disk/f;->m:Z

    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    if-eqz v1, :cond_3

    .line 8
    .line 9
    iget-boolean v1, p0, Lcoil3/disk/f;->n:Z

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    iget-object v1, p0, Lcoil3/disk/f;->f:Ljava/util/LinkedHashMap;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const/4 v3, 0x0

    .line 21
    new-array v4, v3, [Lcoil3/disk/c;

    .line 22
    .line 23
    invoke-interface {v1, v4}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, [Lcoil3/disk/c;

    .line 28
    .line 29
    array-length v4, v1

    .line 30
    :goto_0
    if-ge v3, v4, :cond_2

    .line 31
    .line 32
    aget-object v5, v1, v3

    .line 33
    .line 34
    iget-object v5, v5, Lcoil3/disk/c;->g:Lcoil3/disk/b;

    .line 35
    .line 36
    if-eqz v5, :cond_1

    .line 37
    .line 38
    iget-object v6, v5, Lcoil3/disk/b;->c:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v6, Lcoil3/disk/c;

    .line 41
    .line 42
    iget-object v7, v6, Lcoil3/disk/c;->g:Lcoil3/disk/b;

    .line 43
    .line 44
    invoke-static {v7, v5}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v5

    .line 48
    if-eqz v5, :cond_1

    .line 49
    .line 50
    iput-boolean v2, v6, Lcoil3/disk/c;->f:Z

    .line 51
    .line 52
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :catchall_0
    move-exception v1

    .line 56
    goto :goto_2

    .line 57
    :cond_2
    invoke-virtual {p0}, Lcoil3/disk/f;->l()V

    .line 58
    .line 59
    .line 60
    iget-object v1, p0, Lcoil3/disk/f;->g:Le7/c;

    .line 61
    .line 62
    const/4 v3, 0x0

    .line 63
    invoke-static {v1, v3}, Lkotlinx/coroutines/x;->f(Lkotlinx/coroutines/v;Ljava/util/concurrent/CancellationException;)V

    .line 64
    .line 65
    .line 66
    iget-object v1, p0, Lcoil3/disk/f;->k:Lokio/BufferedSink;

    .line 67
    .line 68
    invoke-static {v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    invoke-interface {v1}, Lokio/Sink;->close()V

    .line 72
    .line 73
    .line 74
    iput-object v3, p0, Lcoil3/disk/f;->k:Lokio/BufferedSink;

    .line 75
    .line 76
    iput-boolean v2, p0, Lcoil3/disk/f;->n:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 77
    .line 78
    monitor-exit v0

    .line 79
    return-void

    .line 80
    :cond_3
    :goto_1
    :try_start_1
    iput-boolean v2, p0, Lcoil3/disk/f;->n:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 81
    .line 82
    monitor-exit v0

    .line 83
    return-void

    .line 84
    :goto_2
    monitor-exit v0

    .line 85
    throw v1
.end method

.method public final d()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcoil3/disk/f;->h:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Lcoil3/disk/f;->m:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    monitor-exit v0

    .line 9
    return-void

    .line 10
    :cond_0
    :try_start_1
    iget-object v1, p0, Lcoil3/disk/f;->q:Lcoil3/disk/e;

    .line 11
    .line 12
    iget-object v2, p0, Lcoil3/disk/f;->d:Lokio/Path;

    .line 13
    .line 14
    invoke-virtual {v1, v2}, Lokio/FileSystem;->delete(Lokio/Path;)V

    .line 15
    .line 16
    .line 17
    iget-object v1, p0, Lcoil3/disk/f;->q:Lcoil3/disk/e;

    .line 18
    .line 19
    iget-object v2, p0, Lcoil3/disk/f;->e:Lokio/Path;

    .line 20
    .line 21
    invoke-virtual {v1, v2}, Lokio/FileSystem;->exists(Lokio/Path;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_2

    .line 26
    .line 27
    iget-object v1, p0, Lcoil3/disk/f;->q:Lcoil3/disk/e;

    .line 28
    .line 29
    iget-object v2, p0, Lcoil3/disk/f;->c:Lokio/Path;

    .line 30
    .line 31
    invoke-virtual {v1, v2}, Lokio/FileSystem;->exists(Lokio/Path;)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    iget-object v1, p0, Lcoil3/disk/f;->q:Lcoil3/disk/e;

    .line 38
    .line 39
    iget-object v2, p0, Lcoil3/disk/f;->e:Lokio/Path;

    .line 40
    .line 41
    invoke-virtual {v1, v2}, Lokio/FileSystem;->delete(Lokio/Path;)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :catchall_0
    move-exception v1

    .line 46
    goto :goto_2

    .line 47
    :cond_1
    iget-object v1, p0, Lcoil3/disk/f;->q:Lcoil3/disk/e;

    .line 48
    .line 49
    iget-object v2, p0, Lcoil3/disk/f;->e:Lokio/Path;

    .line 50
    .line 51
    iget-object v3, p0, Lcoil3/disk/f;->c:Lokio/Path;

    .line 52
    .line 53
    invoke-virtual {v1, v2, v3}, Lokio/ForwardingFileSystem;->atomicMove(Lokio/Path;Lokio/Path;)V

    .line 54
    .line 55
    .line 56
    :cond_2
    :goto_0
    iget-object v1, p0, Lcoil3/disk/f;->q:Lcoil3/disk/e;

    .line 57
    .line 58
    iget-object v2, p0, Lcoil3/disk/f;->c:Lokio/Path;

    .line 59
    .line 60
    invoke-virtual {v1, v2}, Lokio/FileSystem;->exists(Lokio/Path;)Z

    .line 61
    .line 62
    .line 63
    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 64
    const/4 v2, 0x1

    .line 65
    if-eqz v1, :cond_3

    .line 66
    .line 67
    :try_start_2
    invoke-virtual {p0}, Lcoil3/disk/f;->g()V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0}, Lcoil3/disk/f;->f()V

    .line 71
    .line 72
    .line 73
    iput-boolean v2, p0, Lcoil3/disk/f;->m:Z
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 74
    .line 75
    monitor-exit v0

    .line 76
    return-void

    .line 77
    :catch_0
    const/4 v1, 0x0

    .line 78
    :try_start_3
    invoke-virtual {p0}, Lcoil3/disk/f;->close()V

    .line 79
    .line 80
    .line 81
    iget-object v3, p0, Lcoil3/disk/f;->q:Lcoil3/disk/e;

    .line 82
    .line 83
    iget-object v4, p0, Lcoil3/disk/f;->a:Lokio/Path;

    .line 84
    .line 85
    invoke-static {v3, v4}, Lv7/l;->g(Lokio/FileSystem;Lokio/Path;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 86
    .line 87
    .line 88
    :try_start_4
    iput-boolean v1, p0, Lcoil3/disk/f;->n:Z

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :catchall_1
    move-exception v2

    .line 92
    iput-boolean v1, p0, Lcoil3/disk/f;->n:Z

    .line 93
    .line 94
    throw v2

    .line 95
    :cond_3
    :goto_1
    invoke-virtual {p0}, Lcoil3/disk/f;->n()V

    .line 96
    .line 97
    .line 98
    iput-boolean v2, p0, Lcoil3/disk/f;->m:Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 99
    .line 100
    monitor-exit v0

    .line 101
    return-void

    .line 102
    :goto_2
    monitor-exit v0

    .line 103
    throw v1
.end method

.method public final e()V
    .locals 4

    .line 1
    new-instance v0, Lcoil3/disk/DiskLruCache$launchCleanup$1;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lcoil3/disk/DiskLruCache$launchCleanup$1;-><init>(Lcoil3/disk/f;Lh6/c;)V

    .line 5
    .line 6
    .line 7
    const/4 v2, 0x3

    .line 8
    iget-object v3, p0, Lcoil3/disk/f;->g:Le7/c;

    .line 9
    .line 10
    invoke-static {v3, v1, v1, v0, v2}, Lkotlinx/coroutines/x;->v(Lkotlinx/coroutines/v;Lh6/h;Lkotlinx/coroutines/CoroutineStart;Lr6/e;I)Lkotlinx/coroutines/k1;

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final f()V
    .locals 9

    .line 1
    iget-object v0, p0, Lcoil3/disk/f;->f:Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-wide/16 v1, 0x0

    .line 12
    .line 13
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    if-eqz v3, :cond_3

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    check-cast v3, Lcoil3/disk/c;

    .line 24
    .line 25
    iget-object v4, v3, Lcoil3/disk/c;->g:Lcoil3/disk/b;

    .line 26
    .line 27
    const/4 v5, 0x2

    .line 28
    const/4 v6, 0x0

    .line 29
    if-nez v4, :cond_1

    .line 30
    .line 31
    :goto_1
    if-ge v6, v5, :cond_0

    .line 32
    .line 33
    iget-object v4, v3, Lcoil3/disk/c;->b:[J

    .line 34
    .line 35
    aget-wide v7, v4, v6

    .line 36
    .line 37
    add-long/2addr v1, v7

    .line 38
    add-int/lit8 v6, v6, 0x1

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    const/4 v4, 0x0

    .line 42
    iput-object v4, v3, Lcoil3/disk/c;->g:Lcoil3/disk/b;

    .line 43
    .line 44
    :goto_2
    if-ge v6, v5, :cond_2

    .line 45
    .line 46
    iget-object v4, v3, Lcoil3/disk/c;->c:Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    check-cast v4, Lokio/Path;

    .line 53
    .line 54
    iget-object v7, p0, Lcoil3/disk/f;->q:Lcoil3/disk/e;

    .line 55
    .line 56
    invoke-virtual {v7, v4}, Lokio/FileSystem;->delete(Lokio/Path;)V

    .line 57
    .line 58
    .line 59
    iget-object v4, v3, Lcoil3/disk/c;->d:Ljava/util/ArrayList;

    .line 60
    .line 61
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    check-cast v4, Lokio/Path;

    .line 66
    .line 67
    invoke-virtual {v7, v4}, Lokio/FileSystem;->delete(Lokio/Path;)V

    .line 68
    .line 69
    .line 70
    add-int/lit8 v6, v6, 0x1

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_3
    iput-wide v1, p0, Lcoil3/disk/f;->i:J

    .line 78
    .line 79
    return-void
.end method

.method public final g()V
    .locals 11

    .line 1
    const-string v0, ", "

    .line 2
    .line 3
    const-string/jumbo v1, "unexpected journal header: ["

    .line 4
    .line 5
    .line 6
    iget-object v2, p0, Lcoil3/disk/f;->q:Lcoil3/disk/e;

    .line 7
    .line 8
    iget-object v3, p0, Lcoil3/disk/f;->c:Lokio/Path;

    .line 9
    .line 10
    invoke-virtual {v2, v3}, Lokio/ForwardingFileSystem;->source(Lokio/Path;)Lokio/Source;

    .line 11
    .line 12
    .line 13
    move-result-object v4

    .line 14
    invoke-static {v4}, Lokio/Okio;->buffer(Lokio/Source;)Lokio/BufferedSource;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    :try_start_0
    invoke-interface {v4}, Lokio/BufferedSource;->readUtf8LineStrict()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v5

    .line 22
    invoke-interface {v4}, Lokio/BufferedSource;->readUtf8LineStrict()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v6

    .line 26
    invoke-interface {v4}, Lokio/BufferedSource;->readUtf8LineStrict()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v7

    .line 30
    invoke-interface {v4}, Lokio/BufferedSource;->readUtf8LineStrict()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v8

    .line 34
    invoke-interface {v4}, Lokio/BufferedSource;->readUtf8LineStrict()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v9

    .line 38
    const-string v10, "libcore.io.DiskLruCache"

    .line 39
    .line 40
    invoke-virtual {v10, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v10

    .line 44
    if-eqz v10, :cond_1

    .line 45
    .line 46
    const-string v10, "1"

    .line 47
    .line 48
    invoke-virtual {v10, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v10

    .line 52
    if-eqz v10, :cond_1

    .line 53
    .line 54
    const/4 v10, 0x3

    .line 55
    invoke-static {v10}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v10

    .line 59
    invoke-static {v10, v7}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v10

    .line 63
    if-eqz v10, :cond_1

    .line 64
    .line 65
    const/4 v10, 0x2

    .line 66
    invoke-static {v10}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v10

    .line 70
    invoke-static {v10, v8}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v10

    .line 74
    if-eqz v10, :cond_1

    .line 75
    .line 76
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 77
    .line 78
    .line 79
    move-result v10
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 80
    if-gtz v10, :cond_1

    .line 81
    .line 82
    const/4 v0, 0x0

    .line 83
    :goto_0
    :try_start_1
    invoke-interface {v4}, Lokio/BufferedSource;->readUtf8LineStrict()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    invoke-virtual {p0, v1}, Lcoil3/disk/f;->h(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/io/EOFException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 88
    .line 89
    .line 90
    add-int/lit8 v0, v0, 0x1

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :catchall_0
    move-exception v0

    .line 94
    goto :goto_2

    .line 95
    :catch_0
    :try_start_2
    iget-object v1, p0, Lcoil3/disk/f;->f:Ljava/util/LinkedHashMap;

    .line 96
    .line 97
    invoke-interface {v1}, Ljava/util/Map;->size()I

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    sub-int/2addr v0, v1

    .line 102
    iput v0, p0, Lcoil3/disk/f;->j:I

    .line 103
    .line 104
    invoke-interface {v4}, Lokio/BufferedSource;->exhausted()Z

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    if-nez v0, :cond_0

    .line 109
    .line 110
    invoke-virtual {p0}, Lcoil3/disk/f;->n()V

    .line 111
    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_0
    invoke-virtual {v2, v3}, Lokio/FileSystem;->appendingSink(Lokio/Path;)Lokio/Sink;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    new-instance v1, Lcoil3/disk/g;

    .line 119
    .line 120
    new-instance v2, Landroidx/navigation/i;

    .line 121
    .line 122
    const/4 v3, 0x2

    .line 123
    invoke-direct {v2, p0, v3}, Landroidx/navigation/i;-><init>(Ljava/lang/Object;I)V

    .line 124
    .line 125
    .line 126
    invoke-direct {v1, v0, v2}, Lcoil3/disk/g;-><init>(Lokio/Sink;Landroidx/navigation/i;)V

    .line 127
    .line 128
    .line 129
    invoke-static {v1}, Lokio/Okio;->buffer(Lokio/Sink;)Lokio/BufferedSink;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    iput-object v0, p0, Lcoil3/disk/f;->k:Lokio/BufferedSink;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 134
    .line 135
    :goto_1
    :try_start_3
    invoke-interface {v4}, Ljava/io/Closeable;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 136
    .line 137
    .line 138
    const/4 v0, 0x0

    .line 139
    goto :goto_3

    .line 140
    :catchall_1
    move-exception v0

    .line 141
    goto :goto_3

    .line 142
    :cond_1
    :try_start_4
    new-instance v2, Ljava/io/IOException;

    .line 143
    .line 144
    new-instance v3, Ljava/lang/StringBuilder;

    .line 145
    .line 146
    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    const/16 v0, 0x5d

    .line 177
    .line 178
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    invoke-direct {v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    throw v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 189
    :goto_2
    if-eqz v4, :cond_2

    .line 190
    .line 191
    :try_start_5
    invoke-interface {v4}, Ljava/io/Closeable;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 192
    .line 193
    .line 194
    goto :goto_3

    .line 195
    :catchall_2
    move-exception v1

    .line 196
    invoke-static {v0, v1}, Lkotlin/collections/u;->e(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 197
    .line 198
    .line 199
    :cond_2
    :goto_3
    if-nez v0, :cond_3

    .line 200
    .line 201
    return-void

    .line 202
    :cond_3
    throw v0
.end method

.method public final h(Ljava/lang/String;)V
    .locals 11

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x6

    .line 5
    invoke-static {p1, v0, v1, v2}, Lkotlin/text/p;->M(Ljava/lang/CharSequence;CII)I

    .line 6
    .line 7
    .line 8
    move-result v3

    .line 9
    const-string/jumbo v4, "unexpected journal line: "

    .line 10
    .line 11
    .line 12
    const/4 v5, -0x1

    .line 13
    if-eq v3, v5, :cond_8

    .line 14
    .line 15
    add-int/lit8 v6, v3, 0x1

    .line 16
    .line 17
    const/4 v7, 0x4

    .line 18
    invoke-static {p1, v0, v6, v7}, Lkotlin/text/p;->M(Ljava/lang/CharSequence;CII)I

    .line 19
    .line 20
    .line 21
    move-result v8

    .line 22
    iget-object v9, p0, Lcoil3/disk/f;->f:Ljava/util/LinkedHashMap;

    .line 23
    .line 24
    const-string/jumbo v10, "substring(...)"

    .line 25
    .line 26
    .line 27
    if-ne v8, v5, :cond_0

    .line 28
    .line 29
    invoke-virtual {p1, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v6

    .line 33
    invoke-static {v6, v10}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    if-ne v3, v2, :cond_1

    .line 37
    .line 38
    const-string v2, "REMOVE"

    .line 39
    .line 40
    invoke-static {p1, v2, v1}, Lkotlin/text/w;->C(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-eqz v2, :cond_1

    .line 45
    .line 46
    invoke-interface {v9, v6}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :cond_0
    invoke-virtual {p1, v6, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v6

    .line 54
    invoke-static {v6, v10}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    :cond_1
    invoke-virtual {v9, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    if-nez v2, :cond_2

    .line 62
    .line 63
    new-instance v2, Lcoil3/disk/c;

    .line 64
    .line 65
    invoke-direct {v2, p0, v6}, Lcoil3/disk/c;-><init>(Lcoil3/disk/f;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    invoke-interface {v9, v6, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    :cond_2
    check-cast v2, Lcoil3/disk/c;

    .line 72
    .line 73
    const/4 v6, 0x5

    .line 74
    if-eq v8, v5, :cond_4

    .line 75
    .line 76
    if-ne v3, v6, :cond_4

    .line 77
    .line 78
    const-string v9, "CLEAN"

    .line 79
    .line 80
    invoke-static {p1, v9, v1}, Lkotlin/text/w;->C(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 81
    .line 82
    .line 83
    move-result v9

    .line 84
    if-eqz v9, :cond_4

    .line 85
    .line 86
    const/4 v3, 0x1

    .line 87
    add-int/2addr v8, v3

    .line 88
    invoke-virtual {p1, v8}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    invoke-static {p1, v10}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    new-array v5, v3, [C

    .line 96
    .line 97
    aput-char v0, v5, v1

    .line 98
    .line 99
    invoke-static {p1, v5}, Lkotlin/text/p;->a0(Ljava/lang/String;[C)Ljava/util/List;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    iput-boolean v3, v2, Lcoil3/disk/c;->e:Z

    .line 104
    .line 105
    const/4 v0, 0x0

    .line 106
    iput-object v0, v2, Lcoil3/disk/c;->g:Lcoil3/disk/b;

    .line 107
    .line 108
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    const/4 v3, 0x2

    .line 113
    if-ne v0, v3, :cond_3

    .line 114
    .line 115
    :try_start_0
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    :goto_0
    if-ge v1, v0, :cond_6

    .line 120
    .line 121
    iget-object v3, v2, Lcoil3/disk/c;->b:[J

    .line 122
    .line 123
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v5

    .line 127
    check-cast v5, Ljava/lang/String;

    .line 128
    .line 129
    invoke-static {v5}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 130
    .line 131
    .line 132
    move-result-wide v5

    .line 133
    aput-wide v5, v3, v1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 134
    .line 135
    add-int/lit8 v1, v1, 0x1

    .line 136
    .line 137
    goto :goto_0

    .line 138
    :catch_0
    new-instance v0, Ljava/io/IOException;

    .line 139
    .line 140
    new-instance v1, Ljava/lang/StringBuilder;

    .line 141
    .line 142
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    throw v0

    .line 156
    :cond_3
    new-instance v0, Ljava/io/IOException;

    .line 157
    .line 158
    new-instance v1, Ljava/lang/StringBuilder;

    .line 159
    .line 160
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    throw v0

    .line 174
    :cond_4
    if-ne v8, v5, :cond_5

    .line 175
    .line 176
    if-ne v3, v6, :cond_5

    .line 177
    .line 178
    const-string v0, "DIRTY"

    .line 179
    .line 180
    invoke-static {p1, v0, v1}, Lkotlin/text/w;->C(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 181
    .line 182
    .line 183
    move-result v0

    .line 184
    if-eqz v0, :cond_5

    .line 185
    .line 186
    new-instance p1, Lcoil3/disk/b;

    .line 187
    .line 188
    invoke-direct {p1, p0, v2}, Lcoil3/disk/b;-><init>(Lcoil3/disk/f;Lcoil3/disk/c;)V

    .line 189
    .line 190
    .line 191
    iput-object p1, v2, Lcoil3/disk/c;->g:Lcoil3/disk/b;

    .line 192
    .line 193
    return-void

    .line 194
    :cond_5
    if-ne v8, v5, :cond_7

    .line 195
    .line 196
    if-ne v3, v7, :cond_7

    .line 197
    .line 198
    const-string v0, "READ"

    .line 199
    .line 200
    invoke-static {p1, v0, v1}, Lkotlin/text/w;->C(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 201
    .line 202
    .line 203
    move-result v0

    .line 204
    if-eqz v0, :cond_7

    .line 205
    .line 206
    :cond_6
    return-void

    .line 207
    :cond_7
    new-instance v0, Ljava/io/IOException;

    .line 208
    .line 209
    invoke-virtual {v4, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object p1

    .line 213
    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    throw v0

    .line 217
    :cond_8
    new-instance v0, Ljava/io/IOException;

    .line 218
    .line 219
    invoke-virtual {v4, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object p1

    .line 223
    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    throw v0
.end method

.method public final k(Lcoil3/disk/c;)V
    .locals 10

    .line 1
    iget v0, p1, Lcoil3/disk/c;->h:I

    .line 2
    .line 3
    iget-object v1, p1, Lcoil3/disk/c;->a:Ljava/lang/String;

    .line 4
    .line 5
    const/16 v2, 0xa

    .line 6
    .line 7
    const/16 v3, 0x20

    .line 8
    .line 9
    if-lez v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcoil3/disk/f;->k:Lokio/BufferedSink;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const-string v4, "DIRTY"

    .line 16
    .line 17
    invoke-interface {v0, v4}, Lokio/BufferedSink;->writeUtf8(Ljava/lang/String;)Lokio/BufferedSink;

    .line 18
    .line 19
    .line 20
    invoke-interface {v0, v3}, Lokio/BufferedSink;->writeByte(I)Lokio/BufferedSink;

    .line 21
    .line 22
    .line 23
    invoke-interface {v0, v1}, Lokio/BufferedSink;->writeUtf8(Ljava/lang/String;)Lokio/BufferedSink;

    .line 24
    .line 25
    .line 26
    invoke-interface {v0, v2}, Lokio/BufferedSink;->writeByte(I)Lokio/BufferedSink;

    .line 27
    .line 28
    .line 29
    invoke-interface {v0}, Lokio/BufferedSink;->flush()V

    .line 30
    .line 31
    .line 32
    :cond_0
    iget v0, p1, Lcoil3/disk/c;->h:I

    .line 33
    .line 34
    const/4 v4, 0x1

    .line 35
    if-gtz v0, :cond_5

    .line 36
    .line 37
    iget-object v0, p1, Lcoil3/disk/c;->g:Lcoil3/disk/b;

    .line 38
    .line 39
    if-eqz v0, :cond_1

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    const/4 v0, 0x0

    .line 43
    :goto_0
    const/4 v5, 0x2

    .line 44
    if-ge v0, v5, :cond_2

    .line 45
    .line 46
    iget-object v5, p1, Lcoil3/disk/c;->c:Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    check-cast v5, Lokio/Path;

    .line 53
    .line 54
    iget-object v6, p0, Lcoil3/disk/f;->q:Lcoil3/disk/e;

    .line 55
    .line 56
    invoke-virtual {v6, v5}, Lokio/FileSystem;->delete(Lokio/Path;)V

    .line 57
    .line 58
    .line 59
    iget-wide v5, p0, Lcoil3/disk/f;->i:J

    .line 60
    .line 61
    iget-object v7, p1, Lcoil3/disk/c;->b:[J

    .line 62
    .line 63
    aget-wide v8, v7, v0

    .line 64
    .line 65
    sub-long/2addr v5, v8

    .line 66
    iput-wide v5, p0, Lcoil3/disk/f;->i:J

    .line 67
    .line 68
    const-wide/16 v5, 0x0

    .line 69
    .line 70
    aput-wide v5, v7, v0

    .line 71
    .line 72
    add-int/lit8 v0, v0, 0x1

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_2
    iget p1, p0, Lcoil3/disk/f;->j:I

    .line 76
    .line 77
    add-int/2addr p1, v4

    .line 78
    iput p1, p0, Lcoil3/disk/f;->j:I

    .line 79
    .line 80
    iget-object p1, p0, Lcoil3/disk/f;->k:Lokio/BufferedSink;

    .line 81
    .line 82
    if-eqz p1, :cond_3

    .line 83
    .line 84
    const-string v0, "REMOVE"

    .line 85
    .line 86
    invoke-interface {p1, v0}, Lokio/BufferedSink;->writeUtf8(Ljava/lang/String;)Lokio/BufferedSink;

    .line 87
    .line 88
    .line 89
    invoke-interface {p1, v3}, Lokio/BufferedSink;->writeByte(I)Lokio/BufferedSink;

    .line 90
    .line 91
    .line 92
    invoke-interface {p1, v1}, Lokio/BufferedSink;->writeUtf8(Ljava/lang/String;)Lokio/BufferedSink;

    .line 93
    .line 94
    .line 95
    invoke-interface {p1, v2}, Lokio/BufferedSink;->writeByte(I)Lokio/BufferedSink;

    .line 96
    .line 97
    .line 98
    invoke-interface {p1}, Lokio/BufferedSink;->flush()V

    .line 99
    .line 100
    .line 101
    :cond_3
    iget-object p1, p0, Lcoil3/disk/f;->f:Ljava/util/LinkedHashMap;

    .line 102
    .line 103
    invoke-interface {p1, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    iget p1, p0, Lcoil3/disk/f;->j:I

    .line 107
    .line 108
    const/16 v0, 0x7d0

    .line 109
    .line 110
    if-lt p1, v0, :cond_4

    .line 111
    .line 112
    invoke-virtual {p0}, Lcoil3/disk/f;->e()V

    .line 113
    .line 114
    .line 115
    :cond_4
    return-void

    .line 116
    :cond_5
    :goto_1
    iput-boolean v4, p1, Lcoil3/disk/c;->f:Z

    .line 117
    .line 118
    return-void
.end method

.method public final l()V
    .locals 4

    .line 1
    :goto_0
    iget-wide v0, p0, Lcoil3/disk/f;->i:J

    .line 2
    .line 3
    iget-wide v2, p0, Lcoil3/disk/f;->b:J

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    if-lez v0, :cond_2

    .line 8
    .line 9
    iget-object v0, p0, Lcoil3/disk/f;->f:Ljava/util/LinkedHashMap;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    check-cast v1, Lcoil3/disk/c;

    .line 30
    .line 31
    iget-boolean v2, v1, Lcoil3/disk/c;->f:Z

    .line 32
    .line 33
    if-nez v2, :cond_0

    .line 34
    .line 35
    invoke-virtual {p0, v1}, Lcoil3/disk/f;->k(Lcoil3/disk/c;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    return-void

    .line 40
    :cond_2
    const/4 v0, 0x0

    .line 41
    iput-boolean v0, p0, Lcoil3/disk/f;->o:Z

    .line 42
    .line 43
    return-void
.end method

.method public final n()V
    .locals 12

    .line 1
    iget-object v0, p0, Lcoil3/disk/f;->h:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcoil3/disk/f;->k:Lokio/BufferedSink;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    invoke-interface {v1}, Lokio/Sink;->close()V

    .line 9
    .line 10
    .line 11
    goto :goto_0

    .line 12
    :catchall_0
    move-exception v1

    .line 13
    goto/16 :goto_7

    .line 14
    .line 15
    :cond_0
    :goto_0
    iget-object v1, p0, Lcoil3/disk/f;->q:Lcoil3/disk/e;

    .line 16
    .line 17
    iget-object v2, p0, Lcoil3/disk/f;->d:Lokio/Path;

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    invoke-virtual {v1, v2, v3}, Lcoil3/disk/e;->sink(Lokio/Path;Z)Lokio/Sink;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-static {v1}, Lokio/Okio;->buffer(Lokio/Sink;)Lokio/BufferedSink;

    .line 25
    .line 26
    .line 27
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    :try_start_1
    const-string v2, "libcore.io.DiskLruCache"

    .line 29
    .line 30
    invoke-interface {v1, v2}, Lokio/BufferedSink;->writeUtf8(Ljava/lang/String;)Lokio/BufferedSink;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    const/16 v4, 0xa

    .line 35
    .line 36
    invoke-interface {v2, v4}, Lokio/BufferedSink;->writeByte(I)Lokio/BufferedSink;

    .line 37
    .line 38
    .line 39
    const-string v2, "1"

    .line 40
    .line 41
    invoke-interface {v1, v2}, Lokio/BufferedSink;->writeUtf8(Ljava/lang/String;)Lokio/BufferedSink;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-interface {v2, v4}, Lokio/BufferedSink;->writeByte(I)Lokio/BufferedSink;

    .line 46
    .line 47
    .line 48
    const/4 v2, 0x3

    .line 49
    int-to-long v5, v2

    .line 50
    invoke-interface {v1, v5, v6}, Lokio/BufferedSink;->writeDecimalLong(J)Lokio/BufferedSink;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-interface {v2, v4}, Lokio/BufferedSink;->writeByte(I)Lokio/BufferedSink;

    .line 55
    .line 56
    .line 57
    const/4 v2, 0x2

    .line 58
    int-to-long v5, v2

    .line 59
    invoke-interface {v1, v5, v6}, Lokio/BufferedSink;->writeDecimalLong(J)Lokio/BufferedSink;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-interface {v2, v4}, Lokio/BufferedSink;->writeByte(I)Lokio/BufferedSink;

    .line 64
    .line 65
    .line 66
    invoke-interface {v1, v4}, Lokio/BufferedSink;->writeByte(I)Lokio/BufferedSink;

    .line 67
    .line 68
    .line 69
    iget-object v2, p0, Lcoil3/disk/f;->f:Ljava/util/LinkedHashMap;

    .line 70
    .line 71
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 80
    .line 81
    .line 82
    move-result v5

    .line 83
    if-eqz v5, :cond_3

    .line 84
    .line 85
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v5

    .line 89
    check-cast v5, Lcoil3/disk/c;

    .line 90
    .line 91
    iget-object v6, v5, Lcoil3/disk/c;->g:Lcoil3/disk/b;

    .line 92
    .line 93
    const/16 v7, 0x20

    .line 94
    .line 95
    if-eqz v6, :cond_1

    .line 96
    .line 97
    const-string v6, "DIRTY"

    .line 98
    .line 99
    invoke-interface {v1, v6}, Lokio/BufferedSink;->writeUtf8(Ljava/lang/String;)Lokio/BufferedSink;

    .line 100
    .line 101
    .line 102
    invoke-interface {v1, v7}, Lokio/BufferedSink;->writeByte(I)Lokio/BufferedSink;

    .line 103
    .line 104
    .line 105
    iget-object v5, v5, Lcoil3/disk/c;->a:Ljava/lang/String;

    .line 106
    .line 107
    invoke-interface {v1, v5}, Lokio/BufferedSink;->writeUtf8(Ljava/lang/String;)Lokio/BufferedSink;

    .line 108
    .line 109
    .line 110
    invoke-interface {v1, v4}, Lokio/BufferedSink;->writeByte(I)Lokio/BufferedSink;

    .line 111
    .line 112
    .line 113
    goto :goto_1

    .line 114
    :catchall_1
    move-exception v2

    .line 115
    goto :goto_3

    .line 116
    :cond_1
    const-string v6, "CLEAN"

    .line 117
    .line 118
    invoke-interface {v1, v6}, Lokio/BufferedSink;->writeUtf8(Ljava/lang/String;)Lokio/BufferedSink;

    .line 119
    .line 120
    .line 121
    invoke-interface {v1, v7}, Lokio/BufferedSink;->writeByte(I)Lokio/BufferedSink;

    .line 122
    .line 123
    .line 124
    iget-object v6, v5, Lcoil3/disk/c;->a:Ljava/lang/String;

    .line 125
    .line 126
    invoke-interface {v1, v6}, Lokio/BufferedSink;->writeUtf8(Ljava/lang/String;)Lokio/BufferedSink;

    .line 127
    .line 128
    .line 129
    iget-object v5, v5, Lcoil3/disk/c;->b:[J

    .line 130
    .line 131
    array-length v6, v5

    .line 132
    move v8, v3

    .line 133
    :goto_2
    if-ge v8, v6, :cond_2

    .line 134
    .line 135
    aget-wide v9, v5, v8

    .line 136
    .line 137
    invoke-interface {v1, v7}, Lokio/BufferedSink;->writeByte(I)Lokio/BufferedSink;

    .line 138
    .line 139
    .line 140
    move-result-object v11

    .line 141
    invoke-interface {v11, v9, v10}, Lokio/BufferedSink;->writeDecimalLong(J)Lokio/BufferedSink;

    .line 142
    .line 143
    .line 144
    add-int/lit8 v8, v8, 0x1

    .line 145
    .line 146
    goto :goto_2

    .line 147
    :cond_2
    invoke-interface {v1, v4}, Lokio/BufferedSink;->writeByte(I)Lokio/BufferedSink;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 148
    .line 149
    .line 150
    goto :goto_1

    .line 151
    :cond_3
    :try_start_2
    invoke-interface {v1}, Ljava/io/Closeable;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 152
    .line 153
    .line 154
    const/4 v1, 0x0

    .line 155
    goto :goto_5

    .line 156
    :catchall_2
    move-exception v1

    .line 157
    goto :goto_5

    .line 158
    :goto_3
    if-eqz v1, :cond_4

    .line 159
    .line 160
    :try_start_3
    invoke-interface {v1}, Ljava/io/Closeable;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 161
    .line 162
    .line 163
    goto :goto_4

    .line 164
    :catchall_3
    move-exception v1

    .line 165
    :try_start_4
    invoke-static {v2, v1}, Lkotlin/collections/u;->e(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 166
    .line 167
    .line 168
    :cond_4
    :goto_4
    move-object v1, v2

    .line 169
    :goto_5
    if-nez v1, :cond_6

    .line 170
    .line 171
    iget-object v1, p0, Lcoil3/disk/f;->q:Lcoil3/disk/e;

    .line 172
    .line 173
    iget-object v2, p0, Lcoil3/disk/f;->c:Lokio/Path;

    .line 174
    .line 175
    invoke-virtual {v1, v2}, Lokio/FileSystem;->exists(Lokio/Path;)Z

    .line 176
    .line 177
    .line 178
    move-result v1

    .line 179
    if-eqz v1, :cond_5

    .line 180
    .line 181
    iget-object v1, p0, Lcoil3/disk/f;->q:Lcoil3/disk/e;

    .line 182
    .line 183
    iget-object v2, p0, Lcoil3/disk/f;->c:Lokio/Path;

    .line 184
    .line 185
    iget-object v4, p0, Lcoil3/disk/f;->e:Lokio/Path;

    .line 186
    .line 187
    invoke-virtual {v1, v2, v4}, Lokio/ForwardingFileSystem;->atomicMove(Lokio/Path;Lokio/Path;)V

    .line 188
    .line 189
    .line 190
    iget-object v1, p0, Lcoil3/disk/f;->q:Lcoil3/disk/e;

    .line 191
    .line 192
    iget-object v2, p0, Lcoil3/disk/f;->d:Lokio/Path;

    .line 193
    .line 194
    iget-object v4, p0, Lcoil3/disk/f;->c:Lokio/Path;

    .line 195
    .line 196
    invoke-virtual {v1, v2, v4}, Lokio/ForwardingFileSystem;->atomicMove(Lokio/Path;Lokio/Path;)V

    .line 197
    .line 198
    .line 199
    iget-object v1, p0, Lcoil3/disk/f;->q:Lcoil3/disk/e;

    .line 200
    .line 201
    iget-object v2, p0, Lcoil3/disk/f;->e:Lokio/Path;

    .line 202
    .line 203
    invoke-virtual {v1, v2}, Lokio/FileSystem;->delete(Lokio/Path;)V

    .line 204
    .line 205
    .line 206
    goto :goto_6

    .line 207
    :cond_5
    iget-object v1, p0, Lcoil3/disk/f;->q:Lcoil3/disk/e;

    .line 208
    .line 209
    iget-object v2, p0, Lcoil3/disk/f;->d:Lokio/Path;

    .line 210
    .line 211
    iget-object v4, p0, Lcoil3/disk/f;->c:Lokio/Path;

    .line 212
    .line 213
    invoke-virtual {v1, v2, v4}, Lokio/ForwardingFileSystem;->atomicMove(Lokio/Path;Lokio/Path;)V

    .line 214
    .line 215
    .line 216
    :goto_6
    iget-object v1, p0, Lcoil3/disk/f;->q:Lcoil3/disk/e;

    .line 217
    .line 218
    iget-object v2, p0, Lcoil3/disk/f;->c:Lokio/Path;

    .line 219
    .line 220
    invoke-virtual {v1, v2}, Lokio/FileSystem;->appendingSink(Lokio/Path;)Lokio/Sink;

    .line 221
    .line 222
    .line 223
    move-result-object v1

    .line 224
    new-instance v2, Lcoil3/disk/g;

    .line 225
    .line 226
    new-instance v4, Landroidx/navigation/i;

    .line 227
    .line 228
    const/4 v5, 0x2

    .line 229
    invoke-direct {v4, p0, v5}, Landroidx/navigation/i;-><init>(Ljava/lang/Object;I)V

    .line 230
    .line 231
    .line 232
    invoke-direct {v2, v1, v4}, Lcoil3/disk/g;-><init>(Lokio/Sink;Landroidx/navigation/i;)V

    .line 233
    .line 234
    .line 235
    invoke-static {v2}, Lokio/Okio;->buffer(Lokio/Sink;)Lokio/BufferedSink;

    .line 236
    .line 237
    .line 238
    move-result-object v1

    .line 239
    iput-object v1, p0, Lcoil3/disk/f;->k:Lokio/BufferedSink;

    .line 240
    .line 241
    iput v3, p0, Lcoil3/disk/f;->j:I

    .line 242
    .line 243
    iput-boolean v3, p0, Lcoil3/disk/f;->l:Z

    .line 244
    .line 245
    iput-boolean v3, p0, Lcoil3/disk/f;->p:Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 246
    .line 247
    monitor-exit v0

    .line 248
    return-void

    .line 249
    :cond_6
    :try_start_5
    throw v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 250
    :goto_7
    monitor-exit v0

    .line 251
    throw v1
.end method
