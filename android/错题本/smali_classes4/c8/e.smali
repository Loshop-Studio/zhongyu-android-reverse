.class public final Lc8/e;
.super Lretrofit2/f;
.source "SourceFile"


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lc8/e;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Lretrofit2/g;
    .locals 11

    .line 1
    iget p2, p0, Lc8/e;->a:I

    .line 2
    .line 3
    packed-switch p2, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lretrofit2/v;->h(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    const-class v0, Ljava/util/concurrent/CompletableFuture;

    .line 11
    .line 12
    if-eq p2, v0, :cond_0

    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    goto :goto_1

    .line 16
    :cond_0
    instance-of p2, p1, Ljava/lang/reflect/ParameterizedType;

    .line 17
    .line 18
    if-eqz p2, :cond_3

    .line 19
    .line 20
    check-cast p1, Ljava/lang/reflect/ParameterizedType;

    .line 21
    .line 22
    const/4 p2, 0x0

    .line 23
    invoke-static {p2, p1}, Lretrofit2/v;->g(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-static {p1}, Lretrofit2/v;->h(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    const-class v1, Lretrofit2/n0;

    .line 32
    .line 33
    if-eq v0, v1, :cond_1

    .line 34
    .line 35
    new-instance p2, Lretrofit2/j;

    .line 36
    .line 37
    const/4 v0, 0x0

    .line 38
    invoke-direct {p2, v0, p1}, Lretrofit2/j;-><init>(ILjava/lang/reflect/Type;)V

    .line 39
    .line 40
    .line 41
    :goto_0
    move-object p1, p2

    .line 42
    goto :goto_1

    .line 43
    :cond_1
    instance-of v0, p1, Ljava/lang/reflect/ParameterizedType;

    .line 44
    .line 45
    if-eqz v0, :cond_2

    .line 46
    .line 47
    check-cast p1, Ljava/lang/reflect/ParameterizedType;

    .line 48
    .line 49
    invoke-static {p2, p1}, Lretrofit2/v;->g(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    new-instance p2, Lretrofit2/j;

    .line 54
    .line 55
    const/4 v0, 0x1

    .line 56
    invoke-direct {p2, v0, p1}, Lretrofit2/j;-><init>(ILjava/lang/reflect/Type;)V

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :goto_1
    return-object p1

    .line 61
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 62
    .line 63
    const-string p2, "Response must be parameterized as Response<Foo> or Response<? extends Foo>"

    .line 64
    .line 65
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw p1

    .line 69
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 70
    .line 71
    const-string p2, "CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>"

    .line 72
    .line 73
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    throw p1

    .line 77
    :pswitch_0
    invoke-static {p1}, Lretrofit2/v;->h(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    const-class v0, Lio/reactivex/internal/operators/observable/c;

    .line 82
    .line 83
    if-ne p2, v0, :cond_4

    .line 84
    .line 85
    new-instance v1, Lc8/d;

    .line 86
    .line 87
    const/4 v7, 0x0

    .line 88
    const/4 v8, 0x1

    .line 89
    const-class v2, Ljava/lang/Void;

    .line 90
    .line 91
    const/4 v3, 0x0

    .line 92
    const/4 v4, 0x1

    .line 93
    const/4 v5, 0x0

    .line 94
    const/4 v6, 0x0

    .line 95
    invoke-direct/range {v1 .. v8}, Lc8/d;-><init>(Ljava/lang/reflect/Type;ZZZZZZ)V

    .line 96
    .line 97
    .line 98
    goto/16 :goto_7

    .line 99
    .line 100
    :cond_4
    const-class v0, Lq5/b;

    .line 101
    .line 102
    const/4 v1, 0x1

    .line 103
    const/4 v2, 0x0

    .line 104
    if-ne p2, v0, :cond_5

    .line 105
    .line 106
    move v7, v1

    .line 107
    goto :goto_2

    .line 108
    :cond_5
    move v7, v2

    .line 109
    :goto_2
    const-class v0, Lio/reactivex/internal/operators/observable/h;

    .line 110
    .line 111
    if-ne p2, v0, :cond_6

    .line 112
    .line 113
    move v8, v1

    .line 114
    goto :goto_3

    .line 115
    :cond_6
    move v8, v2

    .line 116
    :goto_3
    const-class v0, Lio/reactivex/internal/operators/observable/g;

    .line 117
    .line 118
    if-ne p2, v0, :cond_7

    .line 119
    .line 120
    move v9, v1

    .line 121
    goto :goto_4

    .line 122
    :cond_7
    move v9, v2

    .line 123
    :goto_4
    const-class v0, Lq5/e;

    .line 124
    .line 125
    if-eq p2, v0, :cond_8

    .line 126
    .line 127
    if-nez v7, :cond_8

    .line 128
    .line 129
    if-nez v8, :cond_8

    .line 130
    .line 131
    if-nez v9, :cond_8

    .line 132
    .line 133
    const/4 v1, 0x0

    .line 134
    goto/16 :goto_7

    .line 135
    .line 136
    :cond_8
    instance-of p2, p1, Ljava/lang/reflect/ParameterizedType;

    .line 137
    .line 138
    if-nez p2, :cond_c

    .line 139
    .line 140
    if-nez v7, :cond_b

    .line 141
    .line 142
    if-nez v8, :cond_a

    .line 143
    .line 144
    if-eqz v9, :cond_9

    .line 145
    .line 146
    const-string p1, "Maybe"

    .line 147
    .line 148
    goto :goto_5

    .line 149
    :cond_9
    const-string p1, "Observable"

    .line 150
    .line 151
    goto :goto_5

    .line 152
    :cond_a
    const-string p1, "Single"

    .line 153
    .line 154
    goto :goto_5

    .line 155
    :cond_b
    const-string p1, "Flowable"

    .line 156
    .line 157
    :goto_5
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 158
    .line 159
    new-instance v0, Ljava/lang/StringBuilder;

    .line 160
    .line 161
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    const-string v1, " return type must be parameterized as "

    .line 168
    .line 169
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    const-string v1, "<Foo> or "

    .line 176
    .line 177
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    const-string p1, "<? extends Foo>"

    .line 184
    .line 185
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    .line 188
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object p1

    .line 192
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    throw p2

    .line 196
    :cond_c
    check-cast p1, Ljava/lang/reflect/ParameterizedType;

    .line 197
    .line 198
    invoke-static {v2, p1}, Lretrofit2/v;->g(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    .line 199
    .line 200
    .line 201
    move-result-object p1

    .line 202
    invoke-static {p1}, Lretrofit2/v;->h(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 203
    .line 204
    .line 205
    move-result-object p2

    .line 206
    const-class v0, Lretrofit2/n0;

    .line 207
    .line 208
    if-ne p2, v0, :cond_e

    .line 209
    .line 210
    instance-of p2, p1, Ljava/lang/reflect/ParameterizedType;

    .line 211
    .line 212
    if-eqz p2, :cond_d

    .line 213
    .line 214
    check-cast p1, Ljava/lang/reflect/ParameterizedType;

    .line 215
    .line 216
    invoke-static {v2, p1}, Lretrofit2/v;->g(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    .line 217
    .line 218
    .line 219
    move-result-object p1

    .line 220
    move-object v4, p1

    .line 221
    move v5, v2

    .line 222
    move v6, v5

    .line 223
    goto :goto_6

    .line 224
    :cond_d
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 225
    .line 226
    const-string p2, "Response must be parameterized as Response<Foo> or Response<? extends Foo>"

    .line 227
    .line 228
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    throw p1

    .line 232
    :cond_e
    const-class v0, Lc8/c;

    .line 233
    .line 234
    if-ne p2, v0, :cond_10

    .line 235
    .line 236
    instance-of p2, p1, Ljava/lang/reflect/ParameterizedType;

    .line 237
    .line 238
    if-eqz p2, :cond_f

    .line 239
    .line 240
    check-cast p1, Ljava/lang/reflect/ParameterizedType;

    .line 241
    .line 242
    invoke-static {v2, p1}, Lretrofit2/v;->g(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    .line 243
    .line 244
    .line 245
    move-result-object p1

    .line 246
    move-object v4, p1

    .line 247
    move v5, v1

    .line 248
    move v6, v2

    .line 249
    goto :goto_6

    .line 250
    :cond_f
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 251
    .line 252
    const-string p2, "Result must be parameterized as Result<Foo> or Result<? extends Foo>"

    .line 253
    .line 254
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 255
    .line 256
    .line 257
    throw p1

    .line 258
    :cond_10
    move-object v4, p1

    .line 259
    move v6, v1

    .line 260
    move v5, v2

    .line 261
    :goto_6
    new-instance v3, Lc8/d;

    .line 262
    .line 263
    const/4 v10, 0x0

    .line 264
    invoke-direct/range {v3 .. v10}, Lc8/d;-><init>(Ljava/lang/reflect/Type;ZZZZZZ)V

    .line 265
    .line 266
    .line 267
    move-object v1, v3

    .line 268
    :goto_7
    return-object v1

    .line 269
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
