.class public final Lcom/zykj/study/a$h;
.super Lm4/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/study/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "h"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/study/a$h$a;
    }
.end annotation


# instance fields
.field public A:Ll6/f;

.field public B:Ll6/f;

.field public C:Ll6/f;

.field public D:Ll6/f;

.field public E:Ll6/f;

.field public F:Ll6/f;

.field public G:Ll6/f;

.field public H:Ll6/f;

.field public I:Ll6/f;

.field public J:Ll6/f;

.field public K:Ll6/f;

.field public L:Ll6/f;

.field public M:Ll6/f;

.field public N:Ll6/f;

.field public O:Ll6/f;

.field public P:Ll6/f;

.field public final a:Lj6/a;

.field public final b:Ls4/o;

.field public final c:Lcom/zykj/study/provide/GlobalObjectProvide;

.field public final d:Lcom/zykj/study/a$h;

.field public e:Ll6/f;

.field public f:Ll6/f;

.field public g:Ll6/f;

.field public h:Ll6/f;

.field public i:Ll6/f;

.field public j:Ll6/f;

.field public k:Ll6/f;

.field public l:Ll6/f;

.field public m:Ll6/f;

.field public n:Ll6/f;

.field public o:Ll6/f;

.field public p:Ll6/f;

.field public q:Ll6/f;

.field public r:Ll6/f;

.field public s:Ll6/f;

.field public t:Ll6/f;

.field public u:Ll6/f;

.field public v:Ll6/f;

.field public w:Ll6/f;

.field public x:Ll6/f;

.field public y:Ll6/f;

.field public z:Ll6/f;


# direct methods
.method public constructor <init>(Lj6/a;Ls4/o;Lcom/zykj/study/provide/GlobalObjectProvide;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lm4/g;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p0, p0, Lcom/zykj/study/a$h;->d:Lcom/zykj/study/a$h;

    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/study/a$h;->a:Lj6/a;

    .line 7
    .line 8
    iput-object p2, p0, Lcom/zykj/study/a$h;->b:Ls4/o;

    .line 9
    .line 10
    iput-object p3, p0, Lcom/zykj/study/a$h;->c:Lcom/zykj/study/provide/GlobalObjectProvide;

    .line 11
    .line 12
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/study/a$h;->k(Lj6/a;Ls4/o;Lcom/zykj/study/provide/GlobalObjectProvide;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/study/a$h;->l(Lj6/a;Ls4/o;Lcom/zykj/study/provide/GlobalObjectProvide;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public static bridge synthetic d(Lcom/zykj/study/a$h;)Lj6/a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/study/a$h;->a:Lj6/a;

    return-object p0
.end method

.method public static bridge synthetic e(Lcom/zykj/study/a$h;)Ls4/o;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/study/a$h;->b:Ls4/o;

    return-object p0
.end method

.method public static bridge synthetic f(Lcom/zykj/study/a$h;)Lcom/zykj/study/provide/GlobalObjectProvide;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/study/a$h;->c:Lcom/zykj/study/provide/GlobalObjectProvide;

    return-object p0
.end method


# virtual methods
.method public a()Ljava/util/Set;
    .locals 1

    .line 1
    sget-object v0, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 2
    .line 3
    return-object v0
.end method

.method public b(Lcom/zykj/study/MyApplication;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/study/a$h;->o(Lcom/zykj/study/MyApplication;)Lcom/zykj/study/MyApplication;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public c()Lg6/b;
    .locals 3

    .line 1
    new-instance v0, Lcom/zykj/study/a$c;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/study/a$h;->d:Lcom/zykj/study/a$h;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lcom/zykj/study/a$c;-><init>(Lcom/zykj/study/a$h;Lm4/a;)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method public g()Lcom/zykj/study/provide/ClientCodeInterceptor;
    .locals 1

    .line 1
    invoke-static {}, Ls4/m;->a()Lcom/zykj/study/provide/ClientCodeInterceptor;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0, v0}, Lcom/zykj/study/a$h;->m(Lcom/zykj/study/provide/ClientCodeInterceptor;)Lcom/zykj/study/provide/ClientCodeInterceptor;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public h()Li9/a0;
    .locals 3

    .line 1
    new-instance v0, Lcom/zykj/http/interceptor/NetworkInterceptor;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/zykj/http/interceptor/NetworkInterceptor;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/study/a$h;->j()Lcom/zykj/http/interceptor/HeadInterceptor;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {p0}, Lcom/zykj/study/a$h;->g()Lcom/zykj/study/provide/ClientCodeInterceptor;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-static {v0, v1, v2}, Ls4/b0;->a(Lcom/zykj/http/interceptor/NetworkInterceptor;Lcom/zykj/http/interceptor/HeadInterceptor;Lcom/zykj/study/provide/ClientCodeInterceptor;)Li9/a0;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    return-object v0
.end method

.method public i()Li9/a0;
    .locals 5

    .line 1
    new-instance v0, Lcom/zykj/http/interceptor/NetworkInterceptor;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/zykj/http/interceptor/NetworkInterceptor;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/study/a$h;->j()Lcom/zykj/http/interceptor/HeadInterceptor;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    new-instance v2, Lcom/zykj/http/interceptor/GzipInterceptor;

    .line 11
    .line 12
    invoke-direct {v2}, Lcom/zykj/http/interceptor/GzipInterceptor;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/zykj/study/a$h;->q()Lcom/zykj/study/provide/ResponseRefreshTokenInterceptor;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-virtual {p0}, Lcom/zykj/study/a$h;->g()Lcom/zykj/study/provide/ClientCodeInterceptor;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    invoke-static {v0, v1, v2, v3, v4}, Ls4/c0;->a(Lcom/zykj/http/interceptor/NetworkInterceptor;Lcom/zykj/http/interceptor/HeadInterceptor;Lcom/zykj/http/interceptor/GzipInterceptor;Lcom/zykj/study/provide/ResponseRefreshTokenInterceptor;Lcom/zykj/study/provide/ClientCodeInterceptor;)Li9/a0;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    return-object v0
.end method

.method public j()Lcom/zykj/http/interceptor/HeadInterceptor;
    .locals 1

    .line 1
    invoke-static {}, Lh3/a;->a()Lcom/zykj/http/interceptor/HeadInterceptor;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0, v0}, Lcom/zykj/study/a$h;->n(Lcom/zykj/http/interceptor/HeadInterceptor;)Lcom/zykj/http/interceptor/HeadInterceptor;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public final k(Lj6/a;Ls4/o;Lcom/zykj/study/provide/GlobalObjectProvide;)V
    .locals 0

    .line 1
    new-instance p1, Lcom/zykj/study/a$h$a;

    .line 2
    .line 3
    iget-object p2, p0, Lcom/zykj/study/a$h;->d:Lcom/zykj/study/a$h;

    .line 4
    .line 5
    const/4 p3, 0x0

    .line 6
    invoke-direct {p1, p2, p3}, Lcom/zykj/study/a$h$a;-><init>(Lcom/zykj/study/a$h;I)V

    .line 7
    .line 8
    .line 9
    invoke-static {p1}, Ll6/b;->b(Ll6/f;)Ll6/f;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iput-object p1, p0, Lcom/zykj/study/a$h;->e:Ll6/f;

    .line 14
    .line 15
    new-instance p1, Lcom/zykj/study/a$h$a;

    .line 16
    .line 17
    iget-object p2, p0, Lcom/zykj/study/a$h;->d:Lcom/zykj/study/a$h;

    .line 18
    .line 19
    const/4 p3, 0x1

    .line 20
    invoke-direct {p1, p2, p3}, Lcom/zykj/study/a$h$a;-><init>(Lcom/zykj/study/a$h;I)V

    .line 21
    .line 22
    .line 23
    invoke-static {p1}, Ll6/b;->b(Ll6/f;)Ll6/f;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iput-object p1, p0, Lcom/zykj/study/a$h;->f:Ll6/f;

    .line 28
    .line 29
    new-instance p1, Lcom/zykj/study/a$h$a;

    .line 30
    .line 31
    iget-object p2, p0, Lcom/zykj/study/a$h;->d:Lcom/zykj/study/a$h;

    .line 32
    .line 33
    const/4 p3, 0x2

    .line 34
    invoke-direct {p1, p2, p3}, Lcom/zykj/study/a$h$a;-><init>(Lcom/zykj/study/a$h;I)V

    .line 35
    .line 36
    .line 37
    invoke-static {p1}, Ll6/b;->b(Ll6/f;)Ll6/f;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    iput-object p1, p0, Lcom/zykj/study/a$h;->g:Ll6/f;

    .line 42
    .line 43
    new-instance p1, Lcom/zykj/study/a$h$a;

    .line 44
    .line 45
    iget-object p2, p0, Lcom/zykj/study/a$h;->d:Lcom/zykj/study/a$h;

    .line 46
    .line 47
    const/4 p3, 0x5

    .line 48
    invoke-direct {p1, p2, p3}, Lcom/zykj/study/a$h$a;-><init>(Lcom/zykj/study/a$h;I)V

    .line 49
    .line 50
    .line 51
    invoke-static {p1}, Ll6/b;->b(Ll6/f;)Ll6/f;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    iput-object p1, p0, Lcom/zykj/study/a$h;->h:Ll6/f;

    .line 56
    .line 57
    new-instance p1, Lcom/zykj/study/a$h$a;

    .line 58
    .line 59
    iget-object p2, p0, Lcom/zykj/study/a$h;->d:Lcom/zykj/study/a$h;

    .line 60
    .line 61
    const/4 p3, 0x7

    .line 62
    invoke-direct {p1, p2, p3}, Lcom/zykj/study/a$h$a;-><init>(Lcom/zykj/study/a$h;I)V

    .line 63
    .line 64
    .line 65
    invoke-static {p1}, Ll6/b;->b(Ll6/f;)Ll6/f;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    iput-object p1, p0, Lcom/zykj/study/a$h;->i:Ll6/f;

    .line 70
    .line 71
    new-instance p1, Lcom/zykj/study/a$h$a;

    .line 72
    .line 73
    iget-object p2, p0, Lcom/zykj/study/a$h;->d:Lcom/zykj/study/a$h;

    .line 74
    .line 75
    const/16 p3, 0x8

    .line 76
    .line 77
    invoke-direct {p1, p2, p3}, Lcom/zykj/study/a$h$a;-><init>(Lcom/zykj/study/a$h;I)V

    .line 78
    .line 79
    .line 80
    invoke-static {p1}, Ll6/b;->b(Ll6/f;)Ll6/f;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    iput-object p1, p0, Lcom/zykj/study/a$h;->j:Ll6/f;

    .line 85
    .line 86
    new-instance p1, Lcom/zykj/study/a$h$a;

    .line 87
    .line 88
    iget-object p2, p0, Lcom/zykj/study/a$h;->d:Lcom/zykj/study/a$h;

    .line 89
    .line 90
    const/4 p3, 0x6

    .line 91
    invoke-direct {p1, p2, p3}, Lcom/zykj/study/a$h$a;-><init>(Lcom/zykj/study/a$h;I)V

    .line 92
    .line 93
    .line 94
    invoke-static {p1}, Ll6/b;->b(Ll6/f;)Ll6/f;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    iput-object p1, p0, Lcom/zykj/study/a$h;->k:Ll6/f;

    .line 99
    .line 100
    new-instance p1, Lcom/zykj/study/a$h$a;

    .line 101
    .line 102
    iget-object p2, p0, Lcom/zykj/study/a$h;->d:Lcom/zykj/study/a$h;

    .line 103
    .line 104
    const/4 p3, 0x4

    .line 105
    invoke-direct {p1, p2, p3}, Lcom/zykj/study/a$h$a;-><init>(Lcom/zykj/study/a$h;I)V

    .line 106
    .line 107
    .line 108
    invoke-static {p1}, Ll6/b;->b(Ll6/f;)Ll6/f;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    iput-object p1, p0, Lcom/zykj/study/a$h;->l:Ll6/f;

    .line 113
    .line 114
    new-instance p1, Lcom/zykj/study/a$h$a;

    .line 115
    .line 116
    iget-object p2, p0, Lcom/zykj/study/a$h;->d:Lcom/zykj/study/a$h;

    .line 117
    .line 118
    const/4 p3, 0x3

    .line 119
    invoke-direct {p1, p2, p3}, Lcom/zykj/study/a$h$a;-><init>(Lcom/zykj/study/a$h;I)V

    .line 120
    .line 121
    .line 122
    invoke-static {p1}, Ll6/b;->b(Ll6/f;)Ll6/f;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    iput-object p1, p0, Lcom/zykj/study/a$h;->m:Ll6/f;

    .line 127
    .line 128
    new-instance p1, Lcom/zykj/study/a$h$a;

    .line 129
    .line 130
    iget-object p2, p0, Lcom/zykj/study/a$h;->d:Lcom/zykj/study/a$h;

    .line 131
    .line 132
    const/16 p3, 0xa

    .line 133
    .line 134
    invoke-direct {p1, p2, p3}, Lcom/zykj/study/a$h$a;-><init>(Lcom/zykj/study/a$h;I)V

    .line 135
    .line 136
    .line 137
    invoke-static {p1}, Ll6/b;->b(Ll6/f;)Ll6/f;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    iput-object p1, p0, Lcom/zykj/study/a$h;->n:Ll6/f;

    .line 142
    .line 143
    new-instance p1, Lcom/zykj/study/a$h$a;

    .line 144
    .line 145
    iget-object p2, p0, Lcom/zykj/study/a$h;->d:Lcom/zykj/study/a$h;

    .line 146
    .line 147
    const/16 p3, 0xc

    .line 148
    .line 149
    invoke-direct {p1, p2, p3}, Lcom/zykj/study/a$h$a;-><init>(Lcom/zykj/study/a$h;I)V

    .line 150
    .line 151
    .line 152
    invoke-static {p1}, Ll6/b;->b(Ll6/f;)Ll6/f;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    iput-object p1, p0, Lcom/zykj/study/a$h;->o:Ll6/f;

    .line 157
    .line 158
    new-instance p1, Lcom/zykj/study/a$h$a;

    .line 159
    .line 160
    iget-object p2, p0, Lcom/zykj/study/a$h;->d:Lcom/zykj/study/a$h;

    .line 161
    .line 162
    const/16 p3, 0xb

    .line 163
    .line 164
    invoke-direct {p1, p2, p3}, Lcom/zykj/study/a$h$a;-><init>(Lcom/zykj/study/a$h;I)V

    .line 165
    .line 166
    .line 167
    invoke-static {p1}, Ll6/b;->b(Ll6/f;)Ll6/f;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    iput-object p1, p0, Lcom/zykj/study/a$h;->p:Ll6/f;

    .line 172
    .line 173
    new-instance p1, Lcom/zykj/study/a$h$a;

    .line 174
    .line 175
    iget-object p2, p0, Lcom/zykj/study/a$h;->d:Lcom/zykj/study/a$h;

    .line 176
    .line 177
    const/16 p3, 0x9

    .line 178
    .line 179
    invoke-direct {p1, p2, p3}, Lcom/zykj/study/a$h$a;-><init>(Lcom/zykj/study/a$h;I)V

    .line 180
    .line 181
    .line 182
    invoke-static {p1}, Ll6/b;->b(Ll6/f;)Ll6/f;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    iput-object p1, p0, Lcom/zykj/study/a$h;->q:Ll6/f;

    .line 187
    .line 188
    new-instance p1, Lcom/zykj/study/a$h$a;

    .line 189
    .line 190
    iget-object p2, p0, Lcom/zykj/study/a$h;->d:Lcom/zykj/study/a$h;

    .line 191
    .line 192
    const/16 p3, 0xd

    .line 193
    .line 194
    invoke-direct {p1, p2, p3}, Lcom/zykj/study/a$h$a;-><init>(Lcom/zykj/study/a$h;I)V

    .line 195
    .line 196
    .line 197
    invoke-static {p1}, Ll6/b;->b(Ll6/f;)Ll6/f;

    .line 198
    .line 199
    .line 200
    move-result-object p1

    .line 201
    iput-object p1, p0, Lcom/zykj/study/a$h;->r:Ll6/f;

    .line 202
    .line 203
    new-instance p1, Lcom/zykj/study/a$h$a;

    .line 204
    .line 205
    iget-object p2, p0, Lcom/zykj/study/a$h;->d:Lcom/zykj/study/a$h;

    .line 206
    .line 207
    const/16 p3, 0xf

    .line 208
    .line 209
    invoke-direct {p1, p2, p3}, Lcom/zykj/study/a$h$a;-><init>(Lcom/zykj/study/a$h;I)V

    .line 210
    .line 211
    .line 212
    invoke-static {p1}, Ll6/b;->b(Ll6/f;)Ll6/f;

    .line 213
    .line 214
    .line 215
    move-result-object p1

    .line 216
    iput-object p1, p0, Lcom/zykj/study/a$h;->s:Ll6/f;

    .line 217
    .line 218
    new-instance p1, Lcom/zykj/study/a$h$a;

    .line 219
    .line 220
    iget-object p2, p0, Lcom/zykj/study/a$h;->d:Lcom/zykj/study/a$h;

    .line 221
    .line 222
    const/16 p3, 0xe

    .line 223
    .line 224
    invoke-direct {p1, p2, p3}, Lcom/zykj/study/a$h$a;-><init>(Lcom/zykj/study/a$h;I)V

    .line 225
    .line 226
    .line 227
    invoke-static {p1}, Ll6/b;->b(Ll6/f;)Ll6/f;

    .line 228
    .line 229
    .line 230
    move-result-object p1

    .line 231
    iput-object p1, p0, Lcom/zykj/study/a$h;->t:Ll6/f;

    .line 232
    .line 233
    new-instance p1, Lcom/zykj/study/a$h$a;

    .line 234
    .line 235
    iget-object p2, p0, Lcom/zykj/study/a$h;->d:Lcom/zykj/study/a$h;

    .line 236
    .line 237
    const/16 p3, 0x11

    .line 238
    .line 239
    invoke-direct {p1, p2, p3}, Lcom/zykj/study/a$h$a;-><init>(Lcom/zykj/study/a$h;I)V

    .line 240
    .line 241
    .line 242
    invoke-static {p1}, Ll6/b;->b(Ll6/f;)Ll6/f;

    .line 243
    .line 244
    .line 245
    move-result-object p1

    .line 246
    iput-object p1, p0, Lcom/zykj/study/a$h;->u:Ll6/f;

    .line 247
    .line 248
    new-instance p1, Lcom/zykj/study/a$h$a;

    .line 249
    .line 250
    iget-object p2, p0, Lcom/zykj/study/a$h;->d:Lcom/zykj/study/a$h;

    .line 251
    .line 252
    const/16 p3, 0x10

    .line 253
    .line 254
    invoke-direct {p1, p2, p3}, Lcom/zykj/study/a$h$a;-><init>(Lcom/zykj/study/a$h;I)V

    .line 255
    .line 256
    .line 257
    invoke-static {p1}, Ll6/b;->b(Ll6/f;)Ll6/f;

    .line 258
    .line 259
    .line 260
    move-result-object p1

    .line 261
    iput-object p1, p0, Lcom/zykj/study/a$h;->v:Ll6/f;

    .line 262
    .line 263
    new-instance p1, Lcom/zykj/study/a$h$a;

    .line 264
    .line 265
    iget-object p2, p0, Lcom/zykj/study/a$h;->d:Lcom/zykj/study/a$h;

    .line 266
    .line 267
    const/16 p3, 0x13

    .line 268
    .line 269
    invoke-direct {p1, p2, p3}, Lcom/zykj/study/a$h$a;-><init>(Lcom/zykj/study/a$h;I)V

    .line 270
    .line 271
    .line 272
    invoke-static {p1}, Ll6/b;->b(Ll6/f;)Ll6/f;

    .line 273
    .line 274
    .line 275
    move-result-object p1

    .line 276
    iput-object p1, p0, Lcom/zykj/study/a$h;->w:Ll6/f;

    .line 277
    .line 278
    new-instance p1, Lcom/zykj/study/a$h$a;

    .line 279
    .line 280
    iget-object p2, p0, Lcom/zykj/study/a$h;->d:Lcom/zykj/study/a$h;

    .line 281
    .line 282
    const/16 p3, 0x12

    .line 283
    .line 284
    invoke-direct {p1, p2, p3}, Lcom/zykj/study/a$h$a;-><init>(Lcom/zykj/study/a$h;I)V

    .line 285
    .line 286
    .line 287
    invoke-static {p1}, Ll6/b;->b(Ll6/f;)Ll6/f;

    .line 288
    .line 289
    .line 290
    move-result-object p1

    .line 291
    iput-object p1, p0, Lcom/zykj/study/a$h;->x:Ll6/f;

    .line 292
    .line 293
    new-instance p1, Lcom/zykj/study/a$h$a;

    .line 294
    .line 295
    iget-object p2, p0, Lcom/zykj/study/a$h;->d:Lcom/zykj/study/a$h;

    .line 296
    .line 297
    const/16 p3, 0x15

    .line 298
    .line 299
    invoke-direct {p1, p2, p3}, Lcom/zykj/study/a$h$a;-><init>(Lcom/zykj/study/a$h;I)V

    .line 300
    .line 301
    .line 302
    invoke-static {p1}, Ll6/b;->b(Ll6/f;)Ll6/f;

    .line 303
    .line 304
    .line 305
    move-result-object p1

    .line 306
    iput-object p1, p0, Lcom/zykj/study/a$h;->y:Ll6/f;

    .line 307
    .line 308
    new-instance p1, Lcom/zykj/study/a$h$a;

    .line 309
    .line 310
    iget-object p2, p0, Lcom/zykj/study/a$h;->d:Lcom/zykj/study/a$h;

    .line 311
    .line 312
    const/16 p3, 0x16

    .line 313
    .line 314
    invoke-direct {p1, p2, p3}, Lcom/zykj/study/a$h$a;-><init>(Lcom/zykj/study/a$h;I)V

    .line 315
    .line 316
    .line 317
    invoke-static {p1}, Ll6/b;->b(Ll6/f;)Ll6/f;

    .line 318
    .line 319
    .line 320
    move-result-object p1

    .line 321
    iput-object p1, p0, Lcom/zykj/study/a$h;->z:Ll6/f;

    .line 322
    .line 323
    new-instance p1, Lcom/zykj/study/a$h$a;

    .line 324
    .line 325
    iget-object p2, p0, Lcom/zykj/study/a$h;->d:Lcom/zykj/study/a$h;

    .line 326
    .line 327
    const/16 p3, 0x17

    .line 328
    .line 329
    invoke-direct {p1, p2, p3}, Lcom/zykj/study/a$h$a;-><init>(Lcom/zykj/study/a$h;I)V

    .line 330
    .line 331
    .line 332
    invoke-static {p1}, Ll6/b;->b(Ll6/f;)Ll6/f;

    .line 333
    .line 334
    .line 335
    move-result-object p1

    .line 336
    iput-object p1, p0, Lcom/zykj/study/a$h;->A:Ll6/f;

    .line 337
    .line 338
    new-instance p1, Lcom/zykj/study/a$h$a;

    .line 339
    .line 340
    iget-object p2, p0, Lcom/zykj/study/a$h;->d:Lcom/zykj/study/a$h;

    .line 341
    .line 342
    const/16 p3, 0x18

    .line 343
    .line 344
    invoke-direct {p1, p2, p3}, Lcom/zykj/study/a$h$a;-><init>(Lcom/zykj/study/a$h;I)V

    .line 345
    .line 346
    .line 347
    invoke-static {p1}, Ll6/b;->b(Ll6/f;)Ll6/f;

    .line 348
    .line 349
    .line 350
    move-result-object p1

    .line 351
    iput-object p1, p0, Lcom/zykj/study/a$h;->B:Ll6/f;

    .line 352
    .line 353
    new-instance p1, Lcom/zykj/study/a$h$a;

    .line 354
    .line 355
    iget-object p2, p0, Lcom/zykj/study/a$h;->d:Lcom/zykj/study/a$h;

    .line 356
    .line 357
    const/16 p3, 0x14

    .line 358
    .line 359
    invoke-direct {p1, p2, p3}, Lcom/zykj/study/a$h$a;-><init>(Lcom/zykj/study/a$h;I)V

    .line 360
    .line 361
    .line 362
    invoke-static {p1}, Ll6/b;->b(Ll6/f;)Ll6/f;

    .line 363
    .line 364
    .line 365
    move-result-object p1

    .line 366
    iput-object p1, p0, Lcom/zykj/study/a$h;->C:Ll6/f;

    .line 367
    .line 368
    return-void
.end method

.method public final l(Lj6/a;Ls4/o;Lcom/zykj/study/provide/GlobalObjectProvide;)V
    .locals 0

    .line 1
    new-instance p1, Lcom/zykj/study/a$h$a;

    .line 2
    .line 3
    iget-object p2, p0, Lcom/zykj/study/a$h;->d:Lcom/zykj/study/a$h;

    .line 4
    .line 5
    const/16 p3, 0x19

    .line 6
    .line 7
    invoke-direct {p1, p2, p3}, Lcom/zykj/study/a$h$a;-><init>(Lcom/zykj/study/a$h;I)V

    .line 8
    .line 9
    .line 10
    invoke-static {p1}, Ll6/b;->b(Ll6/f;)Ll6/f;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iput-object p1, p0, Lcom/zykj/study/a$h;->D:Ll6/f;

    .line 15
    .line 16
    new-instance p1, Lcom/zykj/study/a$h$a;

    .line 17
    .line 18
    iget-object p2, p0, Lcom/zykj/study/a$h;->d:Lcom/zykj/study/a$h;

    .line 19
    .line 20
    const/16 p3, 0x1a

    .line 21
    .line 22
    invoke-direct {p1, p2, p3}, Lcom/zykj/study/a$h$a;-><init>(Lcom/zykj/study/a$h;I)V

    .line 23
    .line 24
    .line 25
    invoke-static {p1}, Ll6/b;->b(Ll6/f;)Ll6/f;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iput-object p1, p0, Lcom/zykj/study/a$h;->E:Ll6/f;

    .line 30
    .line 31
    new-instance p1, Lcom/zykj/study/a$h$a;

    .line 32
    .line 33
    iget-object p2, p0, Lcom/zykj/study/a$h;->d:Lcom/zykj/study/a$h;

    .line 34
    .line 35
    const/16 p3, 0x1b

    .line 36
    .line 37
    invoke-direct {p1, p2, p3}, Lcom/zykj/study/a$h$a;-><init>(Lcom/zykj/study/a$h;I)V

    .line 38
    .line 39
    .line 40
    invoke-static {p1}, Ll6/b;->b(Ll6/f;)Ll6/f;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    iput-object p1, p0, Lcom/zykj/study/a$h;->F:Ll6/f;

    .line 45
    .line 46
    new-instance p1, Lcom/zykj/study/a$h$a;

    .line 47
    .line 48
    iget-object p2, p0, Lcom/zykj/study/a$h;->d:Lcom/zykj/study/a$h;

    .line 49
    .line 50
    const/16 p3, 0x1d

    .line 51
    .line 52
    invoke-direct {p1, p2, p3}, Lcom/zykj/study/a$h$a;-><init>(Lcom/zykj/study/a$h;I)V

    .line 53
    .line 54
    .line 55
    invoke-static {p1}, Ll6/b;->b(Ll6/f;)Ll6/f;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    iput-object p1, p0, Lcom/zykj/study/a$h;->G:Ll6/f;

    .line 60
    .line 61
    new-instance p1, Lcom/zykj/study/a$h$a;

    .line 62
    .line 63
    iget-object p2, p0, Lcom/zykj/study/a$h;->d:Lcom/zykj/study/a$h;

    .line 64
    .line 65
    const/16 p3, 0x1c

    .line 66
    .line 67
    invoke-direct {p1, p2, p3}, Lcom/zykj/study/a$h$a;-><init>(Lcom/zykj/study/a$h;I)V

    .line 68
    .line 69
    .line 70
    invoke-static {p1}, Ll6/b;->b(Ll6/f;)Ll6/f;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    iput-object p1, p0, Lcom/zykj/study/a$h;->H:Ll6/f;

    .line 75
    .line 76
    new-instance p1, Lcom/zykj/study/a$h$a;

    .line 77
    .line 78
    iget-object p2, p0, Lcom/zykj/study/a$h;->d:Lcom/zykj/study/a$h;

    .line 79
    .line 80
    const/16 p3, 0x1f

    .line 81
    .line 82
    invoke-direct {p1, p2, p3}, Lcom/zykj/study/a$h$a;-><init>(Lcom/zykj/study/a$h;I)V

    .line 83
    .line 84
    .line 85
    invoke-static {p1}, Ll6/b;->b(Ll6/f;)Ll6/f;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    iput-object p1, p0, Lcom/zykj/study/a$h;->I:Ll6/f;

    .line 90
    .line 91
    new-instance p1, Lcom/zykj/study/a$h$a;

    .line 92
    .line 93
    iget-object p2, p0, Lcom/zykj/study/a$h;->d:Lcom/zykj/study/a$h;

    .line 94
    .line 95
    const/16 p3, 0x1e

    .line 96
    .line 97
    invoke-direct {p1, p2, p3}, Lcom/zykj/study/a$h$a;-><init>(Lcom/zykj/study/a$h;I)V

    .line 98
    .line 99
    .line 100
    invoke-static {p1}, Ll6/b;->b(Ll6/f;)Ll6/f;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    iput-object p1, p0, Lcom/zykj/study/a$h;->J:Ll6/f;

    .line 105
    .line 106
    new-instance p1, Lcom/zykj/study/a$h$a;

    .line 107
    .line 108
    iget-object p2, p0, Lcom/zykj/study/a$h;->d:Lcom/zykj/study/a$h;

    .line 109
    .line 110
    const/16 p3, 0x20

    .line 111
    .line 112
    invoke-direct {p1, p2, p3}, Lcom/zykj/study/a$h$a;-><init>(Lcom/zykj/study/a$h;I)V

    .line 113
    .line 114
    .line 115
    invoke-static {p1}, Ll6/b;->b(Ll6/f;)Ll6/f;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    iput-object p1, p0, Lcom/zykj/study/a$h;->K:Ll6/f;

    .line 120
    .line 121
    new-instance p1, Lcom/zykj/study/a$h$a;

    .line 122
    .line 123
    iget-object p2, p0, Lcom/zykj/study/a$h;->d:Lcom/zykj/study/a$h;

    .line 124
    .line 125
    const/16 p3, 0x22

    .line 126
    .line 127
    invoke-direct {p1, p2, p3}, Lcom/zykj/study/a$h$a;-><init>(Lcom/zykj/study/a$h;I)V

    .line 128
    .line 129
    .line 130
    invoke-static {p1}, Ll6/b;->b(Ll6/f;)Ll6/f;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    iput-object p1, p0, Lcom/zykj/study/a$h;->L:Ll6/f;

    .line 135
    .line 136
    new-instance p1, Lcom/zykj/study/a$h$a;

    .line 137
    .line 138
    iget-object p2, p0, Lcom/zykj/study/a$h;->d:Lcom/zykj/study/a$h;

    .line 139
    .line 140
    const/16 p3, 0x21

    .line 141
    .line 142
    invoke-direct {p1, p2, p3}, Lcom/zykj/study/a$h$a;-><init>(Lcom/zykj/study/a$h;I)V

    .line 143
    .line 144
    .line 145
    invoke-static {p1}, Ll6/b;->b(Ll6/f;)Ll6/f;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    iput-object p1, p0, Lcom/zykj/study/a$h;->M:Ll6/f;

    .line 150
    .line 151
    new-instance p1, Lcom/zykj/study/a$h$a;

    .line 152
    .line 153
    iget-object p2, p0, Lcom/zykj/study/a$h;->d:Lcom/zykj/study/a$h;

    .line 154
    .line 155
    const/16 p3, 0x23

    .line 156
    .line 157
    invoke-direct {p1, p2, p3}, Lcom/zykj/study/a$h$a;-><init>(Lcom/zykj/study/a$h;I)V

    .line 158
    .line 159
    .line 160
    invoke-static {p1}, Ll6/b;->b(Ll6/f;)Ll6/f;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    iput-object p1, p0, Lcom/zykj/study/a$h;->N:Ll6/f;

    .line 165
    .line 166
    new-instance p1, Lcom/zykj/study/a$h$a;

    .line 167
    .line 168
    iget-object p2, p0, Lcom/zykj/study/a$h;->d:Lcom/zykj/study/a$h;

    .line 169
    .line 170
    const/16 p3, 0x24

    .line 171
    .line 172
    invoke-direct {p1, p2, p3}, Lcom/zykj/study/a$h$a;-><init>(Lcom/zykj/study/a$h;I)V

    .line 173
    .line 174
    .line 175
    invoke-static {p1}, Ll6/b;->b(Ll6/f;)Ll6/f;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    iput-object p1, p0, Lcom/zykj/study/a$h;->O:Ll6/f;

    .line 180
    .line 181
    new-instance p1, Lcom/zykj/study/a$h$a;

    .line 182
    .line 183
    iget-object p2, p0, Lcom/zykj/study/a$h;->d:Lcom/zykj/study/a$h;

    .line 184
    .line 185
    const/16 p3, 0x25

    .line 186
    .line 187
    invoke-direct {p1, p2, p3}, Lcom/zykj/study/a$h$a;-><init>(Lcom/zykj/study/a$h;I)V

    .line 188
    .line 189
    .line 190
    invoke-static {p1}, Ll6/b;->b(Ll6/f;)Ll6/f;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    iput-object p1, p0, Lcom/zykj/study/a$h;->P:Ll6/f;

    .line 195
    .line 196
    return-void
.end method

.method public final m(Lcom/zykj/study/provide/ClientCodeInterceptor;)Lcom/zykj/study/provide/ClientCodeInterceptor;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/a$h;->e:Ll6/f;

    .line 2
    .line 3
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/bean/ClientCodeLiveData;

    .line 8
    .line 9
    invoke-static {p1, v0}, Ls4/n;->a(Lcom/zykj/study/provide/ClientCodeInterceptor;Lcom/zykj/study/bean/ClientCodeLiveData;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public final n(Lcom/zykj/http/interceptor/HeadInterceptor;)Lcom/zykj/http/interceptor/HeadInterceptor;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/a$h;->h:Ll6/f;

    .line 2
    .line 3
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ll8/h;

    .line 8
    .line 9
    invoke-static {p1, v0}, Lh3/b;->a(Lcom/zykj/http/interceptor/HeadInterceptor;Ll8/h;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public final o(Lcom/zykj/study/MyApplication;)Lcom/zykj/study/MyApplication;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/a$h;->e:Ll6/f;

    .line 2
    .line 3
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/bean/ClientCodeLiveData;

    .line 8
    .line 9
    invoke-static {p1, v0}, Lm4/i;->a(Lcom/zykj/study/MyApplication;Lcom/zykj/study/bean/ClientCodeLiveData;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public p()Li9/a0;
    .locals 4

    .line 1
    new-instance v0, Lcom/zykj/http/interceptor/NetworkInterceptor;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/zykj/http/interceptor/NetworkInterceptor;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/study/a$h;->j()Lcom/zykj/http/interceptor/HeadInterceptor;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    new-instance v2, Lcom/zykj/http/interceptor/GzipInterceptor;

    .line 11
    .line 12
    invoke-direct {v2}, Lcom/zykj/http/interceptor/GzipInterceptor;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/zykj/study/a$h;->g()Lcom/zykj/study/provide/ClientCodeInterceptor;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-static {v0, v1, v2, v3}, Ls4/f0;->a(Lcom/zykj/http/interceptor/NetworkInterceptor;Lcom/zykj/http/interceptor/HeadInterceptor;Lcom/zykj/http/interceptor/GzipInterceptor;Lcom/zykj/study/provide/ClientCodeInterceptor;)Li9/a0;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    return-object v0
.end method

.method public q()Lcom/zykj/study/provide/ResponseRefreshTokenInterceptor;
    .locals 3

    .line 1
    new-instance v0, Lcom/zykj/study/provide/ResponseRefreshTokenInterceptor;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/study/a$h;->f:Ll6/f;

    .line 4
    .line 5
    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Ll8/g;

    .line 10
    .line 11
    iget-object v2, p0, Lcom/zykj/study/a$h;->k:Ll6/f;

    .line 12
    .line 13
    invoke-interface {v2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    check-cast v2, Li3/a;

    .line 18
    .line 19
    invoke-direct {v0, v1, v2}, Lcom/zykj/study/provide/ResponseRefreshTokenInterceptor;-><init>(Ll8/g;Li3/a;)V

    .line 20
    .line 21
    .line 22
    return-object v0
.end method
