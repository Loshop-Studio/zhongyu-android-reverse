.class public final Lw1/g$h;
.super Lw1/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw1/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "h"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lw1/g$h$a;
    }
.end annotation


# instance fields
.field public A:Lgc/f;

.field public B:Lgc/f;

.field public C:Lgc/f;

.field public D:Lgc/f;

.field public E:Lgc/f;

.field public F:Lgc/f;

.field public final a:Ld2/a;

.field public final b:Lec/a;

.field public final c:Lc3/a;

.field public final d:Lg4/a;

.field public final e:Lp2/a;

.field public final f:Lt3/a;

.field public final g:Lz3/a;

.field public final h:Lsa/a;

.field public final i:Lw1/g$h;

.field public j:Lgc/f;

.field public k:Lgc/f;

.field public l:Lgc/f;

.field public m:Lgc/f;

.field public n:Lgc/f;

.field public o:Lgc/f;

.field public p:Lgc/f;

.field public q:Lgc/f;

.field public r:Lgc/f;

.field public s:Lgc/f;

.field public t:Lgc/f;

.field public u:Lgc/f;

.field public v:Lgc/f;

.field public w:Lgc/f;

.field public x:Lgc/f;

.field public y:Lgc/f;

.field public z:Lgc/f;


# direct methods
.method public constructor <init>(Lec/a;Ld2/a;Lp2/a;Lt3/a;Lc3/a;Lz3/a;Lsa/a;Lg4/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lw1/e;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p0, p0, Lw1/g$h;->i:Lw1/g$h;

    .line 5
    .line 6
    iput-object p2, p0, Lw1/g$h;->a:Ld2/a;

    .line 7
    .line 8
    iput-object p1, p0, Lw1/g$h;->b:Lec/a;

    .line 9
    .line 10
    iput-object p5, p0, Lw1/g$h;->c:Lc3/a;

    .line 11
    .line 12
    iput-object p8, p0, Lw1/g$h;->d:Lg4/a;

    .line 13
    .line 14
    iput-object p3, p0, Lw1/g$h;->e:Lp2/a;

    .line 15
    .line 16
    iput-object p4, p0, Lw1/g$h;->f:Lt3/a;

    .line 17
    .line 18
    iput-object p6, p0, Lw1/g$h;->g:Lz3/a;

    .line 19
    .line 20
    iput-object p7, p0, Lw1/g$h;->h:Lsa/a;

    .line 21
    .line 22
    invoke-virtual/range {p0 .. p8}, Lw1/g$h;->o(Lec/a;Ld2/a;Lp2/a;Lt3/a;Lc3/a;Lz3/a;Lsa/a;Lg4/a;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public static bridge synthetic e(Lw1/g$h;)Lec/a;
    .locals 0

    .line 1
    iget-object p0, p0, Lw1/g$h;->b:Lec/a;

    return-object p0
.end method

.method public static bridge synthetic f(Lw1/g$h;)Ld2/a;
    .locals 0

    .line 1
    iget-object p0, p0, Lw1/g$h;->a:Ld2/a;

    return-object p0
.end method

.method public static bridge synthetic g(Lw1/g$h;)Lp2/a;
    .locals 0

    .line 1
    iget-object p0, p0, Lw1/g$h;->e:Lp2/a;

    return-object p0
.end method

.method public static bridge synthetic h(Lw1/g$h;)Lt3/a;
    .locals 0

    .line 1
    iget-object p0, p0, Lw1/g$h;->f:Lt3/a;

    return-object p0
.end method

.method public static bridge synthetic i(Lw1/g$h;)Lc3/a;
    .locals 0

    .line 1
    iget-object p0, p0, Lw1/g$h;->c:Lc3/a;

    return-object p0
.end method

.method public static bridge synthetic j(Lw1/g$h;)Lz3/a;
    .locals 0

    .line 1
    iget-object p0, p0, Lw1/g$h;->g:Lz3/a;

    return-object p0
.end method

.method public static bridge synthetic k(Lw1/g$h;)Lsa/a;
    .locals 0

    .line 1
    iget-object p0, p0, Lw1/g$h;->h:Lsa/a;

    return-object p0
.end method

.method public static bridge synthetic l(Lw1/g$h;)Lg4/a;
    .locals 0

    .line 1
    iget-object p0, p0, Lw1/g$h;->d:Lg4/a;

    return-object p0
.end method


# virtual methods
.method public a(Lcom/friday/document/receiver/AliMessageReceiver;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lw1/g$h;->p(Lcom/friday/document/receiver/AliMessageReceiver;)Lcom/friday/document/receiver/AliMessageReceiver;

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

.method public c(Lcom/friday/cloudsnote/App;)V
    .locals 0

    .line 1
    return-void
.end method

.method public d()Lbc/b;
    .locals 3

    .line 1
    new-instance v0, Lw1/g$c;

    .line 2
    .line 3
    iget-object v1, p0, Lw1/g$h;->i:Lw1/g$h;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lw1/g$c;-><init>(Lw1/g$h;Lw1/h;)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method public m()Lje/v;
    .locals 6

    .line 1
    new-instance v0, Lcom/zykj/http/interceptor/NetworkInterceptor;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/zykj/http/interceptor/NetworkInterceptor;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lw1/g$h;->u()Lcom/friday/common/network/StudentSessionInterceptor;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {p0}, Lw1/g$h;->n()Lcom/zykj/http/interceptor/HeadInterceptor;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-virtual {p0}, Lw1/g$h;->s()Lcom/zykj/http/interceptor/RefreshTokenInterceptor;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    new-instance v4, Lh2/e;

    .line 19
    .line 20
    invoke-direct {v4}, Lh2/e;-><init>()V

    .line 21
    .line 22
    .line 23
    new-instance v5, Lh2/f;

    .line 24
    .line 25
    invoke-direct {v5}, Lh2/f;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-static/range {v0 .. v5}, Ld2/j;->a(Lcom/zykj/http/interceptor/NetworkInterceptor;Lcom/friday/common/network/StudentSessionInterceptor;Lcom/zykj/http/interceptor/HeadInterceptor;Lcom/zykj/http/interceptor/RefreshTokenInterceptor;Lh2/e;Lh2/f;)Lje/v;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    return-object v0
.end method

.method public n()Lcom/zykj/http/interceptor/HeadInterceptor;
    .locals 1

    .line 1
    invoke-static {}, Lza/a;->a()Lcom/zykj/http/interceptor/HeadInterceptor;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0, v0}, Lw1/g$h;->q(Lcom/zykj/http/interceptor/HeadInterceptor;)Lcom/zykj/http/interceptor/HeadInterceptor;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public final o(Lec/a;Ld2/a;Lp2/a;Lt3/a;Lc3/a;Lz3/a;Lsa/a;Lg4/a;)V
    .locals 0

    .line 1
    new-instance p1, Lw1/g$h$a;

    .line 2
    .line 3
    iget-object p2, p0, Lw1/g$h;->i:Lw1/g$h;

    .line 4
    .line 5
    const/4 p3, 0x1

    .line 6
    invoke-direct {p1, p2, p3}, Lw1/g$h$a;-><init>(Lw1/g$h;I)V

    .line 7
    .line 8
    .line 9
    invoke-static {p1}, Lgc/b;->b(Lgc/f;)Lgc/f;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iput-object p1, p0, Lw1/g$h;->j:Lgc/f;

    .line 14
    .line 15
    new-instance p1, Lw1/g$h$a;

    .line 16
    .line 17
    iget-object p2, p0, Lw1/g$h;->i:Lw1/g$h;

    .line 18
    .line 19
    const/4 p3, 0x0

    .line 20
    invoke-direct {p1, p2, p3}, Lw1/g$h$a;-><init>(Lw1/g$h;I)V

    .line 21
    .line 22
    .line 23
    invoke-static {p1}, Lgc/b;->b(Lgc/f;)Lgc/f;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iput-object p1, p0, Lw1/g$h;->k:Lgc/f;

    .line 28
    .line 29
    new-instance p1, Lw1/g$h$a;

    .line 30
    .line 31
    iget-object p2, p0, Lw1/g$h;->i:Lw1/g$h;

    .line 32
    .line 33
    const/4 p3, 0x2

    .line 34
    invoke-direct {p1, p2, p3}, Lw1/g$h$a;-><init>(Lw1/g$h;I)V

    .line 35
    .line 36
    .line 37
    invoke-static {p1}, Lgc/b;->b(Lgc/f;)Lgc/f;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    iput-object p1, p0, Lw1/g$h;->l:Lgc/f;

    .line 42
    .line 43
    new-instance p1, Lw1/g$h$a;

    .line 44
    .line 45
    iget-object p2, p0, Lw1/g$h;->i:Lw1/g$h;

    .line 46
    .line 47
    const/4 p3, 0x3

    .line 48
    invoke-direct {p1, p2, p3}, Lw1/g$h$a;-><init>(Lw1/g$h;I)V

    .line 49
    .line 50
    .line 51
    invoke-static {p1}, Lgc/b;->b(Lgc/f;)Lgc/f;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    iput-object p1, p0, Lw1/g$h;->m:Lgc/f;

    .line 56
    .line 57
    new-instance p1, Lw1/g$h$a;

    .line 58
    .line 59
    iget-object p2, p0, Lw1/g$h;->i:Lw1/g$h;

    .line 60
    .line 61
    const/4 p3, 0x4

    .line 62
    invoke-direct {p1, p2, p3}, Lw1/g$h$a;-><init>(Lw1/g$h;I)V

    .line 63
    .line 64
    .line 65
    invoke-static {p1}, Lgc/b;->b(Lgc/f;)Lgc/f;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    iput-object p1, p0, Lw1/g$h;->n:Lgc/f;

    .line 70
    .line 71
    new-instance p1, Lw1/g$h$a;

    .line 72
    .line 73
    iget-object p2, p0, Lw1/g$h;->i:Lw1/g$h;

    .line 74
    .line 75
    const/4 p3, 0x5

    .line 76
    invoke-direct {p1, p2, p3}, Lw1/g$h$a;-><init>(Lw1/g$h;I)V

    .line 77
    .line 78
    .line 79
    invoke-static {p1}, Lgc/b;->b(Lgc/f;)Lgc/f;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    iput-object p1, p0, Lw1/g$h;->o:Lgc/f;

    .line 84
    .line 85
    new-instance p1, Lw1/g$h$a;

    .line 86
    .line 87
    iget-object p2, p0, Lw1/g$h;->i:Lw1/g$h;

    .line 88
    .line 89
    const/16 p3, 0x8

    .line 90
    .line 91
    invoke-direct {p1, p2, p3}, Lw1/g$h$a;-><init>(Lw1/g$h;I)V

    .line 92
    .line 93
    .line 94
    invoke-static {p1}, Lgc/b;->b(Lgc/f;)Lgc/f;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    iput-object p1, p0, Lw1/g$h;->p:Lgc/f;

    .line 99
    .line 100
    new-instance p1, Lw1/g$h$a;

    .line 101
    .line 102
    iget-object p2, p0, Lw1/g$h;->i:Lw1/g$h;

    .line 103
    .line 104
    const/4 p3, 0x7

    .line 105
    invoke-direct {p1, p2, p3}, Lw1/g$h$a;-><init>(Lw1/g$h;I)V

    .line 106
    .line 107
    .line 108
    invoke-static {p1}, Lgc/b;->b(Lgc/f;)Lgc/f;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    iput-object p1, p0, Lw1/g$h;->q:Lgc/f;

    .line 113
    .line 114
    new-instance p1, Lw1/g$h$a;

    .line 115
    .line 116
    iget-object p2, p0, Lw1/g$h;->i:Lw1/g$h;

    .line 117
    .line 118
    const/16 p3, 0x9

    .line 119
    .line 120
    invoke-direct {p1, p2, p3}, Lw1/g$h$a;-><init>(Lw1/g$h;I)V

    .line 121
    .line 122
    .line 123
    invoke-static {p1}, Lgc/b;->b(Lgc/f;)Lgc/f;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    iput-object p1, p0, Lw1/g$h;->r:Lgc/f;

    .line 128
    .line 129
    new-instance p1, Lw1/g$h$a;

    .line 130
    .line 131
    iget-object p2, p0, Lw1/g$h;->i:Lw1/g$h;

    .line 132
    .line 133
    const/16 p3, 0xa

    .line 134
    .line 135
    invoke-direct {p1, p2, p3}, Lw1/g$h$a;-><init>(Lw1/g$h;I)V

    .line 136
    .line 137
    .line 138
    invoke-static {p1}, Lgc/b;->b(Lgc/f;)Lgc/f;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    iput-object p1, p0, Lw1/g$h;->s:Lgc/f;

    .line 143
    .line 144
    new-instance p1, Lw1/g$h$a;

    .line 145
    .line 146
    iget-object p2, p0, Lw1/g$h;->i:Lw1/g$h;

    .line 147
    .line 148
    const/4 p3, 0x6

    .line 149
    invoke-direct {p1, p2, p3}, Lw1/g$h$a;-><init>(Lw1/g$h;I)V

    .line 150
    .line 151
    .line 152
    invoke-static {p1}, Lgc/b;->b(Lgc/f;)Lgc/f;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    iput-object p1, p0, Lw1/g$h;->t:Lgc/f;

    .line 157
    .line 158
    new-instance p1, Lw1/g$h$a;

    .line 159
    .line 160
    iget-object p2, p0, Lw1/g$h;->i:Lw1/g$h;

    .line 161
    .line 162
    const/16 p3, 0xb

    .line 163
    .line 164
    invoke-direct {p1, p2, p3}, Lw1/g$h$a;-><init>(Lw1/g$h;I)V

    .line 165
    .line 166
    .line 167
    invoke-static {p1}, Lgc/b;->b(Lgc/f;)Lgc/f;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    iput-object p1, p0, Lw1/g$h;->u:Lgc/f;

    .line 172
    .line 173
    new-instance p1, Lw1/g$h$a;

    .line 174
    .line 175
    iget-object p2, p0, Lw1/g$h;->i:Lw1/g$h;

    .line 176
    .line 177
    const/16 p3, 0xd

    .line 178
    .line 179
    invoke-direct {p1, p2, p3}, Lw1/g$h$a;-><init>(Lw1/g$h;I)V

    .line 180
    .line 181
    .line 182
    invoke-static {p1}, Lgc/b;->b(Lgc/f;)Lgc/f;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    iput-object p1, p0, Lw1/g$h;->v:Lgc/f;

    .line 187
    .line 188
    new-instance p1, Lw1/g$h$a;

    .line 189
    .line 190
    iget-object p2, p0, Lw1/g$h;->i:Lw1/g$h;

    .line 191
    .line 192
    const/16 p3, 0xe

    .line 193
    .line 194
    invoke-direct {p1, p2, p3}, Lw1/g$h$a;-><init>(Lw1/g$h;I)V

    .line 195
    .line 196
    .line 197
    invoke-static {p1}, Lgc/b;->b(Lgc/f;)Lgc/f;

    .line 198
    .line 199
    .line 200
    move-result-object p1

    .line 201
    iput-object p1, p0, Lw1/g$h;->w:Lgc/f;

    .line 202
    .line 203
    new-instance p1, Lw1/g$h$a;

    .line 204
    .line 205
    iget-object p2, p0, Lw1/g$h;->i:Lw1/g$h;

    .line 206
    .line 207
    const/16 p3, 0xf

    .line 208
    .line 209
    invoke-direct {p1, p2, p3}, Lw1/g$h$a;-><init>(Lw1/g$h;I)V

    .line 210
    .line 211
    .line 212
    invoke-static {p1}, Lgc/b;->b(Lgc/f;)Lgc/f;

    .line 213
    .line 214
    .line 215
    move-result-object p1

    .line 216
    iput-object p1, p0, Lw1/g$h;->x:Lgc/f;

    .line 217
    .line 218
    new-instance p1, Lw1/g$h$a;

    .line 219
    .line 220
    iget-object p2, p0, Lw1/g$h;->i:Lw1/g$h;

    .line 221
    .line 222
    const/16 p3, 0x10

    .line 223
    .line 224
    invoke-direct {p1, p2, p3}, Lw1/g$h$a;-><init>(Lw1/g$h;I)V

    .line 225
    .line 226
    .line 227
    invoke-static {p1}, Lgc/b;->b(Lgc/f;)Lgc/f;

    .line 228
    .line 229
    .line 230
    move-result-object p1

    .line 231
    iput-object p1, p0, Lw1/g$h;->y:Lgc/f;

    .line 232
    .line 233
    new-instance p1, Lw1/g$h$a;

    .line 234
    .line 235
    iget-object p2, p0, Lw1/g$h;->i:Lw1/g$h;

    .line 236
    .line 237
    const/16 p3, 0xc

    .line 238
    .line 239
    invoke-direct {p1, p2, p3}, Lw1/g$h$a;-><init>(Lw1/g$h;I)V

    .line 240
    .line 241
    .line 242
    invoke-static {p1}, Lgc/b;->b(Lgc/f;)Lgc/f;

    .line 243
    .line 244
    .line 245
    move-result-object p1

    .line 246
    iput-object p1, p0, Lw1/g$h;->z:Lgc/f;

    .line 247
    .line 248
    new-instance p1, Lw1/g$h$a;

    .line 249
    .line 250
    iget-object p2, p0, Lw1/g$h;->i:Lw1/g$h;

    .line 251
    .line 252
    const/16 p3, 0x11

    .line 253
    .line 254
    invoke-direct {p1, p2, p3}, Lw1/g$h$a;-><init>(Lw1/g$h;I)V

    .line 255
    .line 256
    .line 257
    invoke-static {p1}, Lgc/b;->b(Lgc/f;)Lgc/f;

    .line 258
    .line 259
    .line 260
    move-result-object p1

    .line 261
    iput-object p1, p0, Lw1/g$h;->A:Lgc/f;

    .line 262
    .line 263
    new-instance p1, Lw1/g$h$a;

    .line 264
    .line 265
    iget-object p2, p0, Lw1/g$h;->i:Lw1/g$h;

    .line 266
    .line 267
    const/16 p3, 0x12

    .line 268
    .line 269
    invoke-direct {p1, p2, p3}, Lw1/g$h$a;-><init>(Lw1/g$h;I)V

    .line 270
    .line 271
    .line 272
    invoke-static {p1}, Lgc/b;->b(Lgc/f;)Lgc/f;

    .line 273
    .line 274
    .line 275
    move-result-object p1

    .line 276
    iput-object p1, p0, Lw1/g$h;->B:Lgc/f;

    .line 277
    .line 278
    new-instance p1, Lw1/g$h$a;

    .line 279
    .line 280
    iget-object p2, p0, Lw1/g$h;->i:Lw1/g$h;

    .line 281
    .line 282
    const/16 p3, 0x13

    .line 283
    .line 284
    invoke-direct {p1, p2, p3}, Lw1/g$h$a;-><init>(Lw1/g$h;I)V

    .line 285
    .line 286
    .line 287
    invoke-static {p1}, Lgc/b;->b(Lgc/f;)Lgc/f;

    .line 288
    .line 289
    .line 290
    move-result-object p1

    .line 291
    iput-object p1, p0, Lw1/g$h;->C:Lgc/f;

    .line 292
    .line 293
    new-instance p1, Lw1/g$h$a;

    .line 294
    .line 295
    iget-object p2, p0, Lw1/g$h;->i:Lw1/g$h;

    .line 296
    .line 297
    const/16 p3, 0x14

    .line 298
    .line 299
    invoke-direct {p1, p2, p3}, Lw1/g$h$a;-><init>(Lw1/g$h;I)V

    .line 300
    .line 301
    .line 302
    invoke-static {p1}, Lgc/b;->b(Lgc/f;)Lgc/f;

    .line 303
    .line 304
    .line 305
    move-result-object p1

    .line 306
    iput-object p1, p0, Lw1/g$h;->D:Lgc/f;

    .line 307
    .line 308
    new-instance p1, Lw1/g$h$a;

    .line 309
    .line 310
    iget-object p2, p0, Lw1/g$h;->i:Lw1/g$h;

    .line 311
    .line 312
    const/16 p3, 0x15

    .line 313
    .line 314
    invoke-direct {p1, p2, p3}, Lw1/g$h$a;-><init>(Lw1/g$h;I)V

    .line 315
    .line 316
    .line 317
    invoke-static {p1}, Lgc/b;->b(Lgc/f;)Lgc/f;

    .line 318
    .line 319
    .line 320
    move-result-object p1

    .line 321
    iput-object p1, p0, Lw1/g$h;->E:Lgc/f;

    .line 322
    .line 323
    new-instance p1, Lw1/g$h$a;

    .line 324
    .line 325
    iget-object p2, p0, Lw1/g$h;->i:Lw1/g$h;

    .line 326
    .line 327
    const/16 p3, 0x16

    .line 328
    .line 329
    invoke-direct {p1, p2, p3}, Lw1/g$h$a;-><init>(Lw1/g$h;I)V

    .line 330
    .line 331
    .line 332
    invoke-static {p1}, Lgc/b;->b(Lgc/f;)Lgc/f;

    .line 333
    .line 334
    .line 335
    move-result-object p1

    .line 336
    iput-object p1, p0, Lw1/g$h;->F:Lgc/f;

    .line 337
    .line 338
    return-void
.end method

.method public final p(Lcom/friday/document/receiver/AliMessageReceiver;)Lcom/friday/document/receiver/AliMessageReceiver;
    .locals 1

    .line 1
    iget-object v0, p0, Lw1/g$h;->k:Lgc/f;

    .line 2
    .line 3
    invoke-interface {v0}, Lpc/a;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/friday/common/dao/ResourceDao;

    .line 8
    .line 9
    invoke-static {p1, v0}, Lq2/b;->a(Lcom/friday/document/receiver/AliMessageReceiver;Lcom/friday/common/dao/ResourceDao;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public final q(Lcom/zykj/http/interceptor/HeadInterceptor;)Lcom/zykj/http/interceptor/HeadInterceptor;
    .locals 1

    .line 1
    iget-object v0, p0, Lw1/g$h;->p:Lgc/f;

    .line 2
    .line 3
    invoke-interface {v0}, Lpc/a;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lvd/l;

    .line 8
    .line 9
    invoke-static {p1, v0}, Lza/b;->a(Lcom/zykj/http/interceptor/HeadInterceptor;Lvd/l;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public final r(Lcom/zykj/http/interceptor/RefreshTokenInterceptor;)Lcom/zykj/http/interceptor/RefreshTokenInterceptor;
    .locals 1

    .line 1
    iget-object v0, p0, Lw1/g$h;->r:Lgc/f;

    .line 2
    .line 3
    invoke-interface {v0}, Lpc/a;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lvd/k;

    .line 8
    .line 9
    invoke-static {p1, v0}, Lza/d;->b(Lcom/zykj/http/interceptor/RefreshTokenInterceptor;Lvd/k;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lw1/g$h;->s:Lgc/f;

    .line 13
    .line 14
    invoke-interface {v0}, Lpc/a;->get()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Lab/a;

    .line 19
    .line 20
    invoke-static {p1, v0}, Lza/d;->a(Lcom/zykj/http/interceptor/RefreshTokenInterceptor;Lab/a;)V

    .line 21
    .line 22
    .line 23
    return-object p1
.end method

.method public s()Lcom/zykj/http/interceptor/RefreshTokenInterceptor;
    .locals 1

    .line 1
    invoke-static {}, Lza/c;->a()Lcom/zykj/http/interceptor/RefreshTokenInterceptor;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0, v0}, Lw1/g$h;->r(Lcom/zykj/http/interceptor/RefreshTokenInterceptor;)Lcom/zykj/http/interceptor/RefreshTokenInterceptor;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public t()Lje/v;
    .locals 4

    .line 1
    new-instance v0, Lcom/zykj/http/interceptor/NetworkInterceptor;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/zykj/http/interceptor/NetworkInterceptor;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lw1/g$h;->u()Lcom/friday/common/network/StudentSessionInterceptor;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {p0}, Lw1/g$h;->n()Lcom/zykj/http/interceptor/HeadInterceptor;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-virtual {p0}, Lw1/g$h;->s()Lcom/zykj/http/interceptor/RefreshTokenInterceptor;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    invoke-static {v0, v1, v2, v3}, Ld2/m;->a(Lcom/zykj/http/interceptor/NetworkInterceptor;Lcom/friday/common/network/StudentSessionInterceptor;Lcom/zykj/http/interceptor/HeadInterceptor;Lcom/zykj/http/interceptor/RefreshTokenInterceptor;)Lje/v;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    return-object v0
.end method

.method public u()Lcom/friday/common/network/StudentSessionInterceptor;
    .locals 2

    .line 1
    new-instance v0, Lcom/friday/common/network/StudentSessionInterceptor;

    .line 2
    .line 3
    iget-object v1, p0, Lw1/g$h;->q:Lgc/f;

    .line 4
    .line 5
    invoke-interface {v1}, Lpc/a;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Lcom/friday/common/network/StudentSession;

    .line 10
    .line 11
    invoke-direct {v0, v1}, Lcom/friday/common/network/StudentSessionInterceptor;-><init>(Lcom/friday/common/network/StudentSession;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method
