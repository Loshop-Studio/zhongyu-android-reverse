.class public final Lk5/h$h;
.super Lk5/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk5/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "h"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lk5/h$h$a;
    }
.end annotation


# instance fields
.field public final a:Lm8/a;

.field public final b:Lk5/h$h;

.field public c:Lo8/f;

.field public d:Lo8/f;

.field public e:Lo8/f;

.field public f:Lo8/f;

.field public g:Lo8/f;

.field public h:Lo8/f;

.field public i:Lo8/f;

.field public j:Lo8/f;

.field public k:Lo8/f;

.field public l:Lo8/f;

.field public m:Lo8/f;

.field public n:Lo8/f;

.field public o:Lo8/f;

.field public p:Lo8/f;

.field public q:Lo8/f;

.field public r:Lo8/f;

.field public s:Lo8/f;

.field public t:Lo8/f;

.field public u:Lo8/f;

.field public v:Lo8/f;

.field public w:Lo8/f;

.field public x:Lo8/f;


# direct methods
.method public constructor <init>(Lm8/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lk5/e;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p0, p0, Lk5/h$h;->b:Lk5/h$h;

    .line 5
    .line 6
    iput-object p1, p0, Lk5/h$h;->a:Lm8/a;

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lk5/h$h;->g(Lm8/a;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public static bridge synthetic d(Lk5/h$h;)Lm8/a;
    .locals 0

    .line 1
    iget-object p0, p0, Lk5/h$h;->a:Lm8/a;

    return-object p0
.end method


# virtual methods
.method public a(Lcom/zykj/evaluation/App;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lk5/h$h;->h(Lcom/zykj/evaluation/App;)Lcom/zykj/evaluation/App;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public b()Ljava/util/Set;
    .locals 1

    .line 1
    sget-object v0, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 2
    .line 3
    return-object v0
.end method

.method public c()Lj8/b;
    .locals 3

    .line 1
    new-instance v0, Lk5/h$c;

    .line 2
    .line 3
    iget-object v1, p0, Lk5/h$h;->b:Lk5/h$h;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lk5/h$c;-><init>(Lk5/h$h;Lk5/i;)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method public e()Lcom/zykj/http/interceptor/HeadInterceptor;
    .locals 1

    .line 1
    invoke-static {}, Li7/a;->a()Lcom/zykj/http/interceptor/HeadInterceptor;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0, v0}, Lk5/h$h;->i(Lcom/zykj/http/interceptor/HeadInterceptor;)Lcom/zykj/http/interceptor/HeadInterceptor;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public f()Landroidx/hilt/work/HiltWorkerFactory;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lk5/h$h;->k()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Landroidx/hilt/work/WorkerFactoryModule_ProvideFactoryFactory;->provideFactory(Ljava/util/Map;)Landroidx/hilt/work/HiltWorkerFactory;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public final g(Lm8/a;)V
    .locals 2

    .line 1
    new-instance p1, Lk5/h$h$a;

    .line 2
    .line 3
    iget-object v0, p0, Lk5/h$h;->b:Lk5/h$h;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-direct {p1, v0, v1}, Lk5/h$h$a;-><init>(Lk5/h$h;I)V

    .line 7
    .line 8
    .line 9
    invoke-static {p1}, Lo8/b;->b(Lo8/f;)Lo8/f;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iput-object p1, p0, Lk5/h$h;->c:Lo8/f;

    .line 14
    .line 15
    new-instance p1, Lk5/h$h$a;

    .line 16
    .line 17
    iget-object v0, p0, Lk5/h$h;->b:Lk5/h$h;

    .line 18
    .line 19
    const/4 v1, 0x5

    .line 20
    invoke-direct {p1, v0, v1}, Lk5/h$h$a;-><init>(Lk5/h$h;I)V

    .line 21
    .line 22
    .line 23
    invoke-static {p1}, Lo8/b;->b(Lo8/f;)Lo8/f;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iput-object p1, p0, Lk5/h$h;->d:Lo8/f;

    .line 28
    .line 29
    new-instance p1, Lk5/h$h$a;

    .line 30
    .line 31
    iget-object v0, p0, Lk5/h$h;->b:Lk5/h$h;

    .line 32
    .line 33
    const/4 v1, 0x6

    .line 34
    invoke-direct {p1, v0, v1}, Lk5/h$h$a;-><init>(Lk5/h$h;I)V

    .line 35
    .line 36
    .line 37
    invoke-static {p1}, Lo8/b;->b(Lo8/f;)Lo8/f;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    iput-object p1, p0, Lk5/h$h;->e:Lo8/f;

    .line 42
    .line 43
    new-instance p1, Lk5/h$h$a;

    .line 44
    .line 45
    iget-object v0, p0, Lk5/h$h;->b:Lk5/h$h;

    .line 46
    .line 47
    const/4 v1, 0x7

    .line 48
    invoke-direct {p1, v0, v1}, Lk5/h$h$a;-><init>(Lk5/h$h;I)V

    .line 49
    .line 50
    .line 51
    invoke-static {p1}, Lo8/b;->b(Lo8/f;)Lo8/f;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    iput-object p1, p0, Lk5/h$h;->f:Lo8/f;

    .line 56
    .line 57
    new-instance p1, Lk5/h$h$a;

    .line 58
    .line 59
    iget-object v0, p0, Lk5/h$h;->b:Lk5/h$h;

    .line 60
    .line 61
    const/4 v1, 0x4

    .line 62
    invoke-direct {p1, v0, v1}, Lk5/h$h$a;-><init>(Lk5/h$h;I)V

    .line 63
    .line 64
    .line 65
    invoke-static {p1}, Lo8/b;->b(Lo8/f;)Lo8/f;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    iput-object p1, p0, Lk5/h$h;->g:Lo8/f;

    .line 70
    .line 71
    new-instance p1, Lk5/h$h$a;

    .line 72
    .line 73
    iget-object v0, p0, Lk5/h$h;->b:Lk5/h$h;

    .line 74
    .line 75
    const/4 v1, 0x3

    .line 76
    invoke-direct {p1, v0, v1}, Lk5/h$h$a;-><init>(Lk5/h$h;I)V

    .line 77
    .line 78
    .line 79
    invoke-static {p1}, Lo8/b;->b(Lo8/f;)Lo8/f;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    iput-object p1, p0, Lk5/h$h;->h:Lo8/f;

    .line 84
    .line 85
    new-instance p1, Lk5/h$h$a;

    .line 86
    .line 87
    iget-object v0, p0, Lk5/h$h;->b:Lk5/h$h;

    .line 88
    .line 89
    const/4 v1, 0x2

    .line 90
    invoke-direct {p1, v0, v1}, Lk5/h$h$a;-><init>(Lk5/h$h;I)V

    .line 91
    .line 92
    .line 93
    invoke-static {p1}, Lo8/b;->b(Lo8/f;)Lo8/f;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    iput-object p1, p0, Lk5/h$h;->i:Lo8/f;

    .line 98
    .line 99
    new-instance p1, Lk5/h$h$a;

    .line 100
    .line 101
    iget-object v0, p0, Lk5/h$h;->b:Lk5/h$h;

    .line 102
    .line 103
    const/16 v1, 0x8

    .line 104
    .line 105
    invoke-direct {p1, v0, v1}, Lk5/h$h$a;-><init>(Lk5/h$h;I)V

    .line 106
    .line 107
    .line 108
    invoke-static {p1}, Lo8/b;->b(Lo8/f;)Lo8/f;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    iput-object p1, p0, Lk5/h$h;->j:Lo8/f;

    .line 113
    .line 114
    new-instance p1, Lk5/h$h$a;

    .line 115
    .line 116
    iget-object v0, p0, Lk5/h$h;->b:Lk5/h$h;

    .line 117
    .line 118
    const/4 v1, 0x0

    .line 119
    invoke-direct {p1, v0, v1}, Lk5/h$h$a;-><init>(Lk5/h$h;I)V

    .line 120
    .line 121
    .line 122
    invoke-static {p1}, Lo8/b;->b(Lo8/f;)Lo8/f;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    iput-object p1, p0, Lk5/h$h;->k:Lo8/f;

    .line 127
    .line 128
    new-instance p1, Lk5/h$h$a;

    .line 129
    .line 130
    iget-object v0, p0, Lk5/h$h;->b:Lk5/h$h;

    .line 131
    .line 132
    const/16 v1, 0x9

    .line 133
    .line 134
    invoke-direct {p1, v0, v1}, Lk5/h$h$a;-><init>(Lk5/h$h;I)V

    .line 135
    .line 136
    .line 137
    invoke-static {p1}, Lo8/g;->a(Lo8/f;)Lo8/f;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    iput-object p1, p0, Lk5/h$h;->l:Lo8/f;

    .line 142
    .line 143
    new-instance p1, Lk5/h$h$a;

    .line 144
    .line 145
    iget-object v0, p0, Lk5/h$h;->b:Lk5/h$h;

    .line 146
    .line 147
    const/16 v1, 0xa

    .line 148
    .line 149
    invoke-direct {p1, v0, v1}, Lk5/h$h$a;-><init>(Lk5/h$h;I)V

    .line 150
    .line 151
    .line 152
    invoke-static {p1}, Lo8/g;->a(Lo8/f;)Lo8/f;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    iput-object p1, p0, Lk5/h$h;->m:Lo8/f;

    .line 157
    .line 158
    new-instance p1, Lk5/h$h$a;

    .line 159
    .line 160
    iget-object v0, p0, Lk5/h$h;->b:Lk5/h$h;

    .line 161
    .line 162
    const/16 v1, 0xb

    .line 163
    .line 164
    invoke-direct {p1, v0, v1}, Lk5/h$h$a;-><init>(Lk5/h$h;I)V

    .line 165
    .line 166
    .line 167
    invoke-static {p1}, Lo8/g;->a(Lo8/f;)Lo8/f;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    iput-object p1, p0, Lk5/h$h;->n:Lo8/f;

    .line 172
    .line 173
    new-instance p1, Lk5/h$h$a;

    .line 174
    .line 175
    iget-object v0, p0, Lk5/h$h;->b:Lk5/h$h;

    .line 176
    .line 177
    const/16 v1, 0xd

    .line 178
    .line 179
    invoke-direct {p1, v0, v1}, Lk5/h$h$a;-><init>(Lk5/h$h;I)V

    .line 180
    .line 181
    .line 182
    invoke-static {p1}, Lo8/b;->b(Lo8/f;)Lo8/f;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    iput-object p1, p0, Lk5/h$h;->o:Lo8/f;

    .line 187
    .line 188
    new-instance p1, Lk5/h$h$a;

    .line 189
    .line 190
    iget-object v0, p0, Lk5/h$h;->b:Lk5/h$h;

    .line 191
    .line 192
    const/16 v1, 0xc

    .line 193
    .line 194
    invoke-direct {p1, v0, v1}, Lk5/h$h$a;-><init>(Lk5/h$h;I)V

    .line 195
    .line 196
    .line 197
    invoke-static {p1}, Lo8/g;->a(Lo8/f;)Lo8/f;

    .line 198
    .line 199
    .line 200
    move-result-object p1

    .line 201
    iput-object p1, p0, Lk5/h$h;->p:Lo8/f;

    .line 202
    .line 203
    new-instance p1, Lk5/h$h$a;

    .line 204
    .line 205
    iget-object v0, p0, Lk5/h$h;->b:Lk5/h$h;

    .line 206
    .line 207
    const/16 v1, 0xe

    .line 208
    .line 209
    invoke-direct {p1, v0, v1}, Lk5/h$h$a;-><init>(Lk5/h$h;I)V

    .line 210
    .line 211
    .line 212
    invoke-static {p1}, Lo8/g;->a(Lo8/f;)Lo8/f;

    .line 213
    .line 214
    .line 215
    move-result-object p1

    .line 216
    iput-object p1, p0, Lk5/h$h;->q:Lo8/f;

    .line 217
    .line 218
    new-instance p1, Lk5/h$h$a;

    .line 219
    .line 220
    iget-object v0, p0, Lk5/h$h;->b:Lk5/h$h;

    .line 221
    .line 222
    const/16 v1, 0xf

    .line 223
    .line 224
    invoke-direct {p1, v0, v1}, Lk5/h$h$a;-><init>(Lk5/h$h;I)V

    .line 225
    .line 226
    .line 227
    invoke-static {p1}, Lo8/g;->a(Lo8/f;)Lo8/f;

    .line 228
    .line 229
    .line 230
    move-result-object p1

    .line 231
    iput-object p1, p0, Lk5/h$h;->r:Lo8/f;

    .line 232
    .line 233
    new-instance p1, Lk5/h$h$a;

    .line 234
    .line 235
    iget-object v0, p0, Lk5/h$h;->b:Lk5/h$h;

    .line 236
    .line 237
    const/16 v1, 0x10

    .line 238
    .line 239
    invoke-direct {p1, v0, v1}, Lk5/h$h$a;-><init>(Lk5/h$h;I)V

    .line 240
    .line 241
    .line 242
    invoke-static {p1}, Lo8/g;->a(Lo8/f;)Lo8/f;

    .line 243
    .line 244
    .line 245
    move-result-object p1

    .line 246
    iput-object p1, p0, Lk5/h$h;->s:Lo8/f;

    .line 247
    .line 248
    new-instance p1, Lk5/h$h$a;

    .line 249
    .line 250
    iget-object v0, p0, Lk5/h$h;->b:Lk5/h$h;

    .line 251
    .line 252
    const/16 v1, 0x11

    .line 253
    .line 254
    invoke-direct {p1, v0, v1}, Lk5/h$h$a;-><init>(Lk5/h$h;I)V

    .line 255
    .line 256
    .line 257
    invoke-static {p1}, Lo8/g;->a(Lo8/f;)Lo8/f;

    .line 258
    .line 259
    .line 260
    move-result-object p1

    .line 261
    iput-object p1, p0, Lk5/h$h;->t:Lo8/f;

    .line 262
    .line 263
    new-instance p1, Lk5/h$h$a;

    .line 264
    .line 265
    iget-object v0, p0, Lk5/h$h;->b:Lk5/h$h;

    .line 266
    .line 267
    const/16 v1, 0x12

    .line 268
    .line 269
    invoke-direct {p1, v0, v1}, Lk5/h$h$a;-><init>(Lk5/h$h;I)V

    .line 270
    .line 271
    .line 272
    invoke-static {p1}, Lo8/b;->b(Lo8/f;)Lo8/f;

    .line 273
    .line 274
    .line 275
    move-result-object p1

    .line 276
    iput-object p1, p0, Lk5/h$h;->u:Lo8/f;

    .line 277
    .line 278
    new-instance p1, Lk5/h$h$a;

    .line 279
    .line 280
    iget-object v0, p0, Lk5/h$h;->b:Lk5/h$h;

    .line 281
    .line 282
    const/16 v1, 0x13

    .line 283
    .line 284
    invoke-direct {p1, v0, v1}, Lk5/h$h$a;-><init>(Lk5/h$h;I)V

    .line 285
    .line 286
    .line 287
    invoke-static {p1}, Lo8/b;->b(Lo8/f;)Lo8/f;

    .line 288
    .line 289
    .line 290
    move-result-object p1

    .line 291
    iput-object p1, p0, Lk5/h$h;->v:Lo8/f;

    .line 292
    .line 293
    new-instance p1, Lk5/h$h$a;

    .line 294
    .line 295
    iget-object v0, p0, Lk5/h$h;->b:Lk5/h$h;

    .line 296
    .line 297
    const/16 v1, 0x15

    .line 298
    .line 299
    invoke-direct {p1, v0, v1}, Lk5/h$h$a;-><init>(Lk5/h$h;I)V

    .line 300
    .line 301
    .line 302
    invoke-static {p1}, Lo8/b;->b(Lo8/f;)Lo8/f;

    .line 303
    .line 304
    .line 305
    move-result-object p1

    .line 306
    iput-object p1, p0, Lk5/h$h;->w:Lo8/f;

    .line 307
    .line 308
    new-instance p1, Lk5/h$h$a;

    .line 309
    .line 310
    iget-object v0, p0, Lk5/h$h;->b:Lk5/h$h;

    .line 311
    .line 312
    const/16 v1, 0x14

    .line 313
    .line 314
    invoke-direct {p1, v0, v1}, Lk5/h$h$a;-><init>(Lk5/h$h;I)V

    .line 315
    .line 316
    .line 317
    invoke-static {p1}, Lo8/b;->b(Lo8/f;)Lo8/f;

    .line 318
    .line 319
    .line 320
    move-result-object p1

    .line 321
    iput-object p1, p0, Lk5/h$h;->x:Lo8/f;

    .line 322
    .line 323
    return-void
.end method

.method public final h(Lcom/zykj/evaluation/App;)Lcom/zykj/evaluation/App;
    .locals 1

    .line 1
    iget-object v0, p0, Lk5/h$h;->k:Lo8/f;

    .line 2
    .line 3
    invoke-interface {v0}, Lw8/a;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/evaluation/upload/OssTaskManger;

    .line 8
    .line 9
    invoke-static {p1, v0}, Lk5/g;->a(Lcom/zykj/evaluation/App;Lcom/zykj/evaluation/upload/OssTaskManger;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lk5/h$h;->f()Landroidx/hilt/work/HiltWorkerFactory;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-static {p1, v0}, Lk5/g;->b(Lcom/zykj/evaluation/App;Landroidx/hilt/work/HiltWorkerFactory;)V

    .line 17
    .line 18
    .line 19
    return-object p1
.end method

.method public final i(Lcom/zykj/http/interceptor/HeadInterceptor;)Lcom/zykj/http/interceptor/HeadInterceptor;
    .locals 1

    .line 1
    iget-object v0, p0, Lk5/h$h;->d:Lo8/f;

    .line 2
    .line 3
    invoke-interface {v0}, Lw8/a;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 8
    .line 9
    invoke-static {p1, v0}, Li7/b;->a(Lcom/zykj/http/interceptor/HeadInterceptor;Lkotlinx/coroutines/flow/MutableStateFlow;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public final j(Lcom/zykj/http/interceptor/RefreshTokenInterceptor;)Lcom/zykj/http/interceptor/RefreshTokenInterceptor;
    .locals 1

    .line 1
    iget-object v0, p0, Lk5/h$h;->e:Lo8/f;

    .line 2
    .line 3
    invoke-interface {v0}, Lw8/a;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lkotlinx/coroutines/flow/MutableSharedFlow;

    .line 8
    .line 9
    invoke-static {p1, v0}, Li7/d;->b(Lcom/zykj/http/interceptor/RefreshTokenInterceptor;Lkotlinx/coroutines/flow/MutableSharedFlow;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lk5/h$h;->f:Lo8/f;

    .line 13
    .line 14
    invoke-interface {v0}, Lw8/a;->get()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Lj7/a;

    .line 19
    .line 20
    invoke-static {p1, v0}, Li7/d;->a(Lcom/zykj/http/interceptor/RefreshTokenInterceptor;Lj7/a;)V

    .line 21
    .line 22
    .line 23
    return-object p1
.end method

.method public k()Ljava/util/Map;
    .locals 3

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-static {v0}, Lo8/d;->b(I)Lo8/d;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "com.zykj.evaluation.upload.AnswerUploadWork"

    .line 8
    .line 9
    iget-object v2, p0, Lk5/h$h;->l:Lo8/f;

    .line 10
    .line 11
    invoke-virtual {v0, v1, v2}, Lo8/d;->c(Ljava/lang/Object;Ljava/lang/Object;)Lo8/d;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, "com.zykj.evaluation.upload.FileUploadWork"

    .line 16
    .line 17
    iget-object v2, p0, Lk5/h$h;->m:Lo8/f;

    .line 18
    .line 19
    invoke-virtual {v0, v1, v2}, Lo8/d;->c(Ljava/lang/Object;Ljava/lang/Object;)Lo8/d;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const-string v1, "com.zykj.evaluation.upload.MultiAnswerUploadWork"

    .line 24
    .line 25
    iget-object v2, p0, Lk5/h$h;->n:Lo8/f;

    .line 26
    .line 27
    invoke-virtual {v0, v1, v2}, Lo8/d;->c(Ljava/lang/Object;Ljava/lang/Object;)Lo8/d;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    const-string v1, "com.zykj.evaluation.upload.QuestionUploadWork"

    .line 32
    .line 33
    iget-object v2, p0, Lk5/h$h;->p:Lo8/f;

    .line 34
    .line 35
    invoke-virtual {v0, v1, v2}, Lo8/d;->c(Ljava/lang/Object;Ljava/lang/Object;)Lo8/d;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    const-string v1, "com.zykj.evaluation.upload.SelfCorrectQuestionUploadWork"

    .line 40
    .line 41
    iget-object v2, p0, Lk5/h$h;->q:Lo8/f;

    .line 42
    .line 43
    invoke-virtual {v0, v1, v2}, Lo8/d;->c(Ljava/lang/Object;Ljava/lang/Object;)Lo8/d;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    const-string v1, "com.zykj.evaluation.submit.SubmitCorrectSelfWork"

    .line 48
    .line 49
    iget-object v2, p0, Lk5/h$h;->r:Lo8/f;

    .line 50
    .line 51
    invoke-virtual {v0, v1, v2}, Lo8/d;->c(Ljava/lang/Object;Ljava/lang/Object;)Lo8/d;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    const-string v1, "com.zykj.evaluation.submit.SubmitNoStemWork"

    .line 56
    .line 57
    iget-object v2, p0, Lk5/h$h;->s:Lo8/f;

    .line 58
    .line 59
    invoke-virtual {v0, v1, v2}, Lo8/d;->c(Ljava/lang/Object;Ljava/lang/Object;)Lo8/d;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    const-string v1, "com.zykj.evaluation.submit.SubmitNormalWork"

    .line 64
    .line 65
    iget-object v2, p0, Lk5/h$h;->t:Lo8/f;

    .line 66
    .line 67
    invoke-virtual {v0, v1, v2}, Lo8/d;->c(Ljava/lang/Object;Ljava/lang/Object;)Lo8/d;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-virtual {v0}, Lo8/d;->a()Ljava/util/Map;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    return-object v0
.end method

.method public l()Lcom/zykj/http/interceptor/RefreshTokenInterceptor;
    .locals 1

    .line 1
    invoke-static {}, Li7/c;->a()Lcom/zykj/http/interceptor/RefreshTokenInterceptor;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0, v0}, Lk5/h$h;->j(Lcom/zykj/http/interceptor/RefreshTokenInterceptor;)Lcom/zykj/http/interceptor/RefreshTokenInterceptor;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method
