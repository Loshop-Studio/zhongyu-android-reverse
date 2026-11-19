.class public final Lp4/c;
.super Lo4/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lp4/c$a;
    }
.end annotation


# instance fields
.field public final a:Lp4/g;

.field public final b:Lp4/i;

.field public final c:Lp4/h;

.field public final d:Lp4/b;

.field public final e:Lp4/a;

.field public final f:Lp4/d;

.field public final g:Lp4/f;

.field public final h:Lp4/k;

.field public final i:Lp4/e;

.field public final j:Lp4/j;


# direct methods
.method public constructor <init>(Lv4/d;Lj4/a;Lk4/c;)V
    .locals 1

    .line 1
    const-string v0, "sourceLoader"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "matrixAdapter"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "graphControl"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Lo4/a;-><init>()V

    .line 17
    .line 18
    .line 19
    new-instance v0, Lp4/g;

    .line 20
    .line 21
    invoke-direct {v0, p1, p2, p3}, Lp4/g;-><init>(Lv4/d;Lj4/a;Lk4/c;)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Lp4/c;->a:Lp4/g;

    .line 25
    .line 26
    new-instance v0, Lp4/i;

    .line 27
    .line 28
    invoke-direct {v0, p1, p3}, Lp4/i;-><init>(Lv4/d;Lk4/c;)V

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, Lp4/c;->b:Lp4/i;

    .line 32
    .line 33
    new-instance v0, Lp4/h;

    .line 34
    .line 35
    invoke-direct {v0, p1, p3}, Lp4/h;-><init>(Lv4/d;Lk4/c;)V

    .line 36
    .line 37
    .line 38
    iput-object v0, p0, Lp4/c;->c:Lp4/h;

    .line 39
    .line 40
    new-instance v0, Lp4/b;

    .line 41
    .line 42
    invoke-direct {v0, p1, p2, p3}, Lp4/b;-><init>(Lv4/d;Lj4/a;Lk4/c;)V

    .line 43
    .line 44
    .line 45
    iput-object v0, p0, Lp4/c;->d:Lp4/b;

    .line 46
    .line 47
    new-instance v0, Lp4/a;

    .line 48
    .line 49
    invoke-direct {v0, p2, p3}, Lp4/a;-><init>(Lj4/a;Lk4/c;)V

    .line 50
    .line 51
    .line 52
    iput-object v0, p0, Lp4/c;->e:Lp4/a;

    .line 53
    .line 54
    new-instance v0, Lp4/d;

    .line 55
    .line 56
    invoke-direct {v0, p1, p3}, Lp4/d;-><init>(Lv4/d;Lk4/c;)V

    .line 57
    .line 58
    .line 59
    iput-object v0, p0, Lp4/c;->f:Lp4/d;

    .line 60
    .line 61
    new-instance v0, Lp4/f;

    .line 62
    .line 63
    invoke-direct {v0, p1, p3}, Lp4/f;-><init>(Lv4/d;Lk4/c;)V

    .line 64
    .line 65
    .line 66
    iput-object v0, p0, Lp4/c;->g:Lp4/f;

    .line 67
    .line 68
    new-instance v0, Lp4/k;

    .line 69
    .line 70
    invoke-direct {v0, p1, p3}, Lp4/k;-><init>(Lv4/d;Lk4/c;)V

    .line 71
    .line 72
    .line 73
    iput-object v0, p0, Lp4/c;->h:Lp4/k;

    .line 74
    .line 75
    new-instance v0, Lp4/e;

    .line 76
    .line 77
    invoke-direct {v0, p1, p2, p3}, Lp4/e;-><init>(Lv4/d;Lj4/a;Lk4/c;)V

    .line 78
    .line 79
    .line 80
    iput-object v0, p0, Lp4/c;->i:Lp4/e;

    .line 81
    .line 82
    new-instance p2, Lp4/j;

    .line 83
    .line 84
    invoke-direct {p2, p1, p3}, Lp4/j;-><init>(Lv4/d;Lk4/c;)V

    .line 85
    .line 86
    .line 87
    iput-object p2, p0, Lp4/c;->j:Lp4/j;

    .line 88
    .line 89
    return-void
.end method


# virtual methods
.method public c(ZLcom/zykj/board/EzyCommand$CommandSource$CommandInfo;J)Lo4/e;
    .locals 2

    .line 1
    const-string v0, "command"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->q()Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const/4 v0, -0x1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    sget-object v1, Lp4/c$a;->a:[I

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    aget v0, v1, v0

    .line 21
    .line 22
    :goto_0
    const-string v1, "data"

    .line 23
    .line 24
    packed-switch v0, :pswitch_data_0

    .line 25
    .line 26
    .line 27
    goto/16 :goto_1

    .line 28
    .line 29
    :pswitch_0
    invoke-virtual {p2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->s()Lcom/google/protobuf/ByteString;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    invoke-static {p2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;->y(Lcom/google/protobuf/ByteString;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    if-eqz p1, :cond_1

    .line 38
    .line 39
    iget-object p1, p0, Lp4/c;->j:Lp4/j;

    .line 40
    .line 41
    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1, p2, p3, p4}, Lp4/j;->a(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;J)Lo4/e;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    return-object p1

    .line 49
    :cond_1
    iget-object p1, p0, Lp4/c;->j:Lp4/j;

    .line 50
    .line 51
    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1, p2}, Lp4/j;->b(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;)V

    .line 55
    .line 56
    .line 57
    goto/16 :goto_1

    .line 58
    .line 59
    :pswitch_1
    invoke-virtual {p2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->s()Lcom/google/protobuf/ByteString;

    .line 60
    .line 61
    .line 62
    move-result-object p2

    .line 63
    invoke-static {p2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CursorMove;->u(Lcom/google/protobuf/ByteString;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CursorMove;

    .line 64
    .line 65
    .line 66
    move-result-object p2

    .line 67
    if-eqz p1, :cond_2

    .line 68
    .line 69
    iget-object p1, p0, Lp4/c;->i:Lp4/e;

    .line 70
    .line 71
    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1, p2, p3, p4}, Lp4/e;->a(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CursorMove;J)Lo4/e;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    return-object p1

    .line 79
    :cond_2
    iget-object p1, p0, Lp4/c;->i:Lp4/e;

    .line 80
    .line 81
    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1, p2}, Lp4/e;->b(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CursorMove;)V

    .line 85
    .line 86
    .line 87
    goto/16 :goto_1

    .line 88
    .line 89
    :pswitch_2
    invoke-virtual {p2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->s()Lcom/google/protobuf/ByteString;

    .line 90
    .line 91
    .line 92
    move-result-object p2

    .line 93
    invoke-static {p2}, Lcom/google/protobuf/Any;->parseFrom(Lcom/google/protobuf/ByteString;)Lcom/google/protobuf/Any;

    .line 94
    .line 95
    .line 96
    move-result-object p2

    .line 97
    if-eqz p1, :cond_3

    .line 98
    .line 99
    iget-object p1, p0, Lp4/c;->h:Lp4/k;

    .line 100
    .line 101
    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {p1, p2, p3, p4}, Lp4/k;->a(Lcom/google/protobuf/Any;J)Lo4/e;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    return-object p1

    .line 109
    :cond_3
    iget-object p1, p0, Lp4/c;->h:Lp4/k;

    .line 110
    .line 111
    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p1, p2}, Lp4/k;->b(Lcom/google/protobuf/Any;)V

    .line 115
    .line 116
    .line 117
    goto/16 :goto_1

    .line 118
    .line 119
    :pswitch_3
    invoke-virtual {p2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->s()Lcom/google/protobuf/ByteString;

    .line 120
    .line 121
    .line 122
    move-result-object p2

    .line 123
    invoke-static {p2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->M(Lcom/google/protobuf/ByteString;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;

    .line 124
    .line 125
    .line 126
    move-result-object p2

    .line 127
    if-eqz p1, :cond_4

    .line 128
    .line 129
    iget-object p1, p0, Lp4/c;->g:Lp4/f;

    .line 130
    .line 131
    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {p1, p2, p3, p4}, Lp4/f;->a(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;J)Lo4/e;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    return-object p1

    .line 139
    :cond_4
    iget-object p1, p0, Lp4/c;->g:Lp4/f;

    .line 140
    .line 141
    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {p1, p2}, Lp4/f;->b(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;)V

    .line 145
    .line 146
    .line 147
    goto/16 :goto_1

    .line 148
    .line 149
    :pswitch_4
    invoke-virtual {p2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->s()Lcom/google/protobuf/ByteString;

    .line 150
    .line 151
    .line 152
    move-result-object p2

    .line 153
    invoke-static {p2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$Config;->B(Lcom/google/protobuf/ByteString;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$Config;

    .line 154
    .line 155
    .line 156
    move-result-object p2

    .line 157
    if-eqz p1, :cond_5

    .line 158
    .line 159
    iget-object p1, p0, Lp4/c;->f:Lp4/d;

    .line 160
    .line 161
    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {p1, p2, p3, p4}, Lp4/d;->a(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$Config;J)Lo4/e;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    return-object p1

    .line 169
    :cond_5
    iget-object p1, p0, Lp4/c;->f:Lp4/d;

    .line 170
    .line 171
    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {p1, p2}, Lp4/d;->b(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$Config;)V

    .line 175
    .line 176
    .line 177
    goto/16 :goto_1

    .line 178
    .line 179
    :pswitch_5
    invoke-virtual {p2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->s()Lcom/google/protobuf/ByteString;

    .line 180
    .line 181
    .line 182
    move-result-object p2

    .line 183
    invoke-static {p2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix;->B(Lcom/google/protobuf/ByteString;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix;

    .line 184
    .line 185
    .line 186
    move-result-object p2

    .line 187
    if-eqz p1, :cond_6

    .line 188
    .line 189
    iget-object p1, p0, Lp4/c;->d:Lp4/b;

    .line 190
    .line 191
    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {p1, p2, p3, p4}, Lp4/b;->a(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix;J)Lo4/e;

    .line 195
    .line 196
    .line 197
    move-result-object p1

    .line 198
    return-object p1

    .line 199
    :cond_6
    iget-object p1, p0, Lp4/c;->d:Lp4/b;

    .line 200
    .line 201
    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {p1, p2}, Lp4/b;->b(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix;)V

    .line 205
    .line 206
    .line 207
    goto/16 :goto_1

    .line 208
    .line 209
    :pswitch_6
    invoke-virtual {p2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->s()Lcom/google/protobuf/ByteString;

    .line 210
    .line 211
    .line 212
    move-result-object p2

    .line 213
    invoke-static {p2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$Camera;->w(Lcom/google/protobuf/ByteString;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$Camera;

    .line 214
    .line 215
    .line 216
    move-result-object p2

    .line 217
    if-eqz p1, :cond_7

    .line 218
    .line 219
    iget-object p1, p0, Lp4/c;->e:Lp4/a;

    .line 220
    .line 221
    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {p1, p2, p3, p4}, Lp4/a;->a(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$Camera;J)Lo4/e;

    .line 225
    .line 226
    .line 227
    move-result-object p1

    .line 228
    return-object p1

    .line 229
    :cond_7
    iget-object p1, p0, Lp4/c;->e:Lp4/a;

    .line 230
    .line 231
    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {p1, p2}, Lp4/a;->b(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$Camera;)V

    .line 235
    .line 236
    .line 237
    goto :goto_1

    .line 238
    :pswitch_7
    invoke-virtual {p2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->s()Lcom/google/protobuf/ByteString;

    .line 239
    .line 240
    .line 241
    move-result-object p2

    .line 242
    invoke-static {p2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix;->H(Lcom/google/protobuf/ByteString;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix;

    .line 243
    .line 244
    .line 245
    move-result-object p2

    .line 246
    if-eqz p1, :cond_8

    .line 247
    .line 248
    iget-object p1, p0, Lp4/c;->c:Lp4/h;

    .line 249
    .line 250
    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {p1, p2, p3, p4}, Lp4/h;->a(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix;J)Lo4/e;

    .line 254
    .line 255
    .line 256
    move-result-object p1

    .line 257
    return-object p1

    .line 258
    :cond_8
    iget-object p1, p0, Lp4/c;->c:Lp4/h;

    .line 259
    .line 260
    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 261
    .line 262
    .line 263
    invoke-virtual {p1, p2}, Lp4/h;->b(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix;)V

    .line 264
    .line 265
    .line 266
    goto :goto_1

    .line 267
    :pswitch_8
    invoke-virtual {p2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->s()Lcom/google/protobuf/ByteString;

    .line 268
    .line 269
    .line 270
    move-result-object p2

    .line 271
    invoke-static {p2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphRemove;->u(Lcom/google/protobuf/ByteString;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphRemove;

    .line 272
    .line 273
    .line 274
    move-result-object p2

    .line 275
    if-eqz p1, :cond_9

    .line 276
    .line 277
    iget-object p1, p0, Lp4/c;->b:Lp4/i;

    .line 278
    .line 279
    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 280
    .line 281
    .line 282
    invoke-virtual {p1, p2, p3, p4}, Lp4/i;->a(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphRemove;J)Lo4/e;

    .line 283
    .line 284
    .line 285
    goto :goto_1

    .line 286
    :cond_9
    iget-object p1, p0, Lp4/c;->b:Lp4/i;

    .line 287
    .line 288
    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 289
    .line 290
    .line 291
    invoke-virtual {p1, p2}, Lp4/i;->b(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphRemove;)V

    .line 292
    .line 293
    .line 294
    goto :goto_1

    .line 295
    :pswitch_9
    invoke-virtual {p2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->s()Lcom/google/protobuf/ByteString;

    .line 296
    .line 297
    .line 298
    move-result-object p2

    .line 299
    invoke-static {p2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;->L(Lcom/google/protobuf/ByteString;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;

    .line 300
    .line 301
    .line 302
    move-result-object p2

    .line 303
    if-eqz p1, :cond_a

    .line 304
    .line 305
    iget-object p1, p0, Lp4/c;->a:Lp4/g;

    .line 306
    .line 307
    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 308
    .line 309
    .line 310
    invoke-virtual {p1, p2, p3, p4}, Lp4/g;->a(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;J)Lo4/e;

    .line 311
    .line 312
    .line 313
    move-result-object p1

    .line 314
    return-object p1

    .line 315
    :cond_a
    iget-object p1, p0, Lp4/c;->a:Lp4/g;

    .line 316
    .line 317
    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 318
    .line 319
    .line 320
    invoke-virtual {p1, p2}, Lp4/g;->b(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;)V

    .line 321
    .line 322
    .line 323
    :goto_1
    const/4 p1, 0x0

    .line 324
    return-object p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_9
        :pswitch_8
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

.method public d(Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;)V
    .locals 2

    .line 1
    const-string v0, "command"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;->a()Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sget-object v1, Lp4/c$a;->a:[I

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    aget v0, v1, v0

    .line 17
    .line 18
    const-string v1, "data"

    .line 19
    .line 20
    packed-switch v0, :pswitch_data_0

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :pswitch_0
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;->b()[B

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-static {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;->z([B)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iget-object v0, p0, Lp4/c;->j:Lp4/j;

    .line 33
    .line 34
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, p1}, Lp4/j;->b(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :pswitch_1
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;->b()[B

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-static {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CursorMove;->v([B)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CursorMove;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    iget-object v0, p0, Lp4/c;->i:Lp4/e;

    .line 50
    .line 51
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, p1}, Lp4/e;->b(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CursorMove;)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :pswitch_2
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;->b()[B

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-static {p1}, Lcom/google/protobuf/Any;->parseFrom([B)Lcom/google/protobuf/Any;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    iget-object v0, p0, Lp4/c;->h:Lp4/k;

    .line 67
    .line 68
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0, p1}, Lp4/k;->b(Lcom/google/protobuf/Any;)V

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :pswitch_3
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;->b()[B

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-static {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->N([B)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    iget-object v0, p0, Lp4/c;->g:Lp4/f;

    .line 84
    .line 85
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0, p1}, Lp4/f;->b(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;)V

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    :pswitch_4
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;->b()[B

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    invoke-static {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$Config;->C([B)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$Config;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    iget-object v0, p0, Lp4/c;->f:Lp4/d;

    .line 101
    .line 102
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0, p1}, Lp4/d;->b(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$Config;)V

    .line 106
    .line 107
    .line 108
    return-void

    .line 109
    :pswitch_5
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;->b()[B

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    invoke-static {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix;->C([B)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    iget-object v0, p0, Lp4/c;->d:Lp4/b;

    .line 118
    .line 119
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0, p1}, Lp4/b;->b(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix;)V

    .line 123
    .line 124
    .line 125
    return-void

    .line 126
    :pswitch_6
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;->b()[B

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    invoke-static {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$Camera;->x([B)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$Camera;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    iget-object v0, p0, Lp4/c;->e:Lp4/a;

    .line 135
    .line 136
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v0, p1}, Lp4/a;->b(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$Camera;)V

    .line 140
    .line 141
    .line 142
    return-void

    .line 143
    :pswitch_7
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;->b()[B

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    invoke-static {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix;->I([B)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    iget-object v0, p0, Lp4/c;->c:Lp4/h;

    .line 152
    .line 153
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v0, p1}, Lp4/h;->b(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix;)V

    .line 157
    .line 158
    .line 159
    return-void

    .line 160
    :pswitch_8
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;->b()[B

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    invoke-static {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphRemove;->v([B)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphRemove;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    iget-object v0, p0, Lp4/c;->b:Lp4/i;

    .line 169
    .line 170
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v0, p1}, Lp4/i;->b(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphRemove;)V

    .line 174
    .line 175
    .line 176
    return-void

    .line 177
    :pswitch_9
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;->b()[B

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    invoke-static {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;->M([B)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    iget-object v0, p0, Lp4/c;->a:Lp4/g;

    .line 186
    .line 187
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v0, p1}, Lp4/g;->b(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;)V

    .line 191
    .line 192
    .line 193
    return-void

    .line 194
    nop

    .line 195
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_9
        :pswitch_8
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
