# RE note 本类字节码直接引用的读写或显示接口包括DataStore。
.class public final Lcom/zykj/huiwei/launcher/app/a$j;
.super Lr3/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/huiwei/launcher/app/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "j"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/huiwei/launcher/app/a$j$a;
    }
.end annotation


# instance fields
.field public final a:Ly4/a;

.field public final b:Lcom/zykj/huiwei/launcher/providers/GlobalObjectProvide;

.field public final c:Lcom/zykj/huiwei/launcher/app/a$j;

.field public d:La5/f;

.field public e:La5/f;

.field public f:La5/f;

.field public g:La5/f;

.field public h:La5/f;

.field public i:La5/f;

.field public j:La5/f;

.field public k:La5/f;

.field public l:La5/f;

.field public m:La5/f;

.field public n:La5/f;

.field public o:La5/f;

.field public p:La5/f;

.field public q:La5/f;

.field public r:La5/f;

.field public s:La5/f;

.field public t:La5/f;


# direct methods
.method public constructor <init>(Ly4/a;Lcom/zykj/huiwei/launcher/providers/GlobalObjectProvide;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lr3/g;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p0, p0, Lcom/zykj/huiwei/launcher/app/a$j;->c:Lcom/zykj/huiwei/launcher/app/a$j;

    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/app/a$j;->a:Ly4/a;

    .line 7
    .line 8
    iput-object p2, p0, Lcom/zykj/huiwei/launcher/app/a$j;->b:Lcom/zykj/huiwei/launcher/providers/GlobalObjectProvide;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, Lcom/zykj/huiwei/launcher/app/a$j;->k(Ly4/a;Lcom/zykj/huiwei/launcher/providers/GlobalObjectProvide;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public static bridge synthetic f(Lcom/zykj/huiwei/launcher/app/a$j;)Ly4/a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/huiwei/launcher/app/a$j;->a:Ly4/a;

    return-object p0
.end method

.method public static bridge synthetic g(Lcom/zykj/huiwei/launcher/app/a$j;)Lcom/zykj/huiwei/launcher/providers/GlobalObjectProvide;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/huiwei/launcher/app/a$j;->b:Lcom/zykj/huiwei/launcher/providers/GlobalObjectProvide;

    return-object p0
.end method


# virtual methods
.method public a()Lv4/d;
    .locals 3

    .line 1
    new-instance v0, Lcom/zykj/huiwei/launcher/app/a$h;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/huiwei/launcher/app/a$j;->c:Lcom/zykj/huiwei/launcher/app/a$j;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lcom/zykj/huiwei/launcher/app/a$h;-><init>(Lcom/zykj/huiwei/launcher/app/a$j;Lr3/i;)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method public b()Ljava/util/Set;
    .locals 1

    .line 1
    sget-object v0, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 2
    .line 3
    return-object v0
.end method

.method public c(Lcom/zykj/huiwei/launcher/app/App;)V
    .locals 0

    .line 1
    return-void
.end method

.method public d(Lcom/zykj/huiwei/launcher/receiver/LogoutReceiver;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/huiwei/launcher/app/a$j;->m(Lcom/zykj/huiwei/launcher/receiver/LogoutReceiver;)Lcom/zykj/huiwei/launcher/receiver/LogoutReceiver;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public e()Lv4/b;
    .locals 3

    .line 1
    new-instance v0, Lcom/zykj/huiwei/launcher/app/a$c;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/huiwei/launcher/app/a$j;->c:Lcom/zykj/huiwei/launcher/app/a$j;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lcom/zykj/huiwei/launcher/app/a$c;-><init>(Lcom/zykj/huiwei/launcher/app/a$j;Lr3/i;)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method public h()Lf5/a0;
    .locals 2

    .line 1
    new-instance v0, Lcom/zykj/http/interceptor/NetworkInterceptor;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/zykj/http/interceptor/NetworkInterceptor;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lcom/zykj/http/interceptor/GzipInterceptor;

    .line 7
    .line 8
    invoke-direct {v1}, Lcom/zykj/http/interceptor/GzipInterceptor;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1}, Lcom/zykj/huiwei/launcher/providers/OkHttpClientProvide_ProvideAuthOkHttpClientFactory;->provideAuthOkHttpClient(Lcom/zykj/http/interceptor/NetworkInterceptor;Lcom/zykj/http/interceptor/GzipInterceptor;)Lf5/a0;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0
.end method

.method public i()Lf5/a0;
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/http/interceptor/NetworkInterceptor;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/zykj/http/interceptor/NetworkInterceptor;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lcom/zykj/huiwei/launcher/providers/OkHttpClientProvide_ProvideCommonOkHttpClientFactory;->provideCommonOkHttpClient(Lcom/zykj/http/interceptor/NetworkInterceptor;)Lf5/a0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0
.end method

.method public j()Lcom/zykj/http/interceptor/HeadInterceptor;
    .locals 1

    .line 1
    invoke-static {}, Lp3/a;->a()Lcom/zykj/http/interceptor/HeadInterceptor;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0, v0}, Lcom/zykj/huiwei/launcher/app/a$j;->l(Lcom/zykj/http/interceptor/HeadInterceptor;)Lcom/zykj/http/interceptor/HeadInterceptor;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public final k(Ly4/a;Lcom/zykj/huiwei/launcher/providers/GlobalObjectProvide;)V
    .locals 1

    .line 1
    new-instance p1, Lcom/zykj/huiwei/launcher/app/a$j$a;

    .line 2
    .line 3
    iget-object p2, p0, Lcom/zykj/huiwei/launcher/app/a$j;->c:Lcom/zykj/huiwei/launcher/app/a$j;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-direct {p1, p2, v0}, Lcom/zykj/huiwei/launcher/app/a$j$a;-><init>(Lcom/zykj/huiwei/launcher/app/a$j;I)V

    .line 7
    .line 8
    .line 9
    invoke-static {p1}, La5/b;->b(La5/f;)La5/f;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/app/a$j;->d:La5/f;

    .line 14
    .line 15
    new-instance p1, Lcom/zykj/huiwei/launcher/app/a$j$a;

    .line 16
    .line 17
    iget-object p2, p0, Lcom/zykj/huiwei/launcher/app/a$j;->c:Lcom/zykj/huiwei/launcher/app/a$j;

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    invoke-direct {p1, p2, v0}, Lcom/zykj/huiwei/launcher/app/a$j$a;-><init>(Lcom/zykj/huiwei/launcher/app/a$j;I)V

    .line 21
    .line 22
    .line 23
    invoke-static {p1}, La5/b;->b(La5/f;)La5/f;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/app/a$j;->e:La5/f;

    .line 28
    .line 29
    new-instance p1, Lcom/zykj/huiwei/launcher/app/a$j$a;

    .line 30
    .line 31
    iget-object p2, p0, Lcom/zykj/huiwei/launcher/app/a$j;->c:Lcom/zykj/huiwei/launcher/app/a$j;

    .line 32
    .line 33
    const/4 v0, 0x2

    .line 34
    invoke-direct {p1, p2, v0}, Lcom/zykj/huiwei/launcher/app/a$j$a;-><init>(Lcom/zykj/huiwei/launcher/app/a$j;I)V

    .line 35
    .line 36
    .line 37
    invoke-static {p1}, La5/b;->b(La5/f;)La5/f;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/app/a$j;->f:La5/f;

    .line 42
    .line 43
    new-instance p1, Lcom/zykj/huiwei/launcher/app/a$j$a;

    .line 44
    .line 45
    iget-object p2, p0, Lcom/zykj/huiwei/launcher/app/a$j;->c:Lcom/zykj/huiwei/launcher/app/a$j;

    .line 46
    .line 47
    const/4 v0, 0x3

    .line 48
    invoke-direct {p1, p2, v0}, Lcom/zykj/huiwei/launcher/app/a$j$a;-><init>(Lcom/zykj/huiwei/launcher/app/a$j;I)V

    .line 49
    .line 50
    .line 51
    invoke-static {p1}, La5/b;->b(La5/f;)La5/f;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/app/a$j;->g:La5/f;

    .line 56
    .line 57
    new-instance p1, Lcom/zykj/huiwei/launcher/app/a$j$a;

    .line 58
    .line 59
    iget-object p2, p0, Lcom/zykj/huiwei/launcher/app/a$j;->c:Lcom/zykj/huiwei/launcher/app/a$j;

    .line 60
    .line 61
    const/4 v0, 0x5

    .line 62
    invoke-direct {p1, p2, v0}, Lcom/zykj/huiwei/launcher/app/a$j$a;-><init>(Lcom/zykj/huiwei/launcher/app/a$j;I)V

    .line 63
    .line 64
    .line 65
    invoke-static {p1}, La5/b;->b(La5/f;)La5/f;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/app/a$j;->h:La5/f;

    .line 70
    .line 71
    new-instance p1, Lcom/zykj/huiwei/launcher/app/a$j$a;

    .line 72
    .line 73
    iget-object p2, p0, Lcom/zykj/huiwei/launcher/app/a$j;->c:Lcom/zykj/huiwei/launcher/app/a$j;

    .line 74
    .line 75
    const/4 v0, 0x6

    .line 76
    invoke-direct {p1, p2, v0}, Lcom/zykj/huiwei/launcher/app/a$j$a;-><init>(Lcom/zykj/huiwei/launcher/app/a$j;I)V

    .line 77
    .line 78
    .line 79
    invoke-static {p1}, La5/b;->b(La5/f;)La5/f;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/app/a$j;->i:La5/f;

    .line 84
    .line 85
    new-instance p1, Lcom/zykj/huiwei/launcher/app/a$j$a;

    .line 86
    .line 87
    iget-object p2, p0, Lcom/zykj/huiwei/launcher/app/a$j;->c:Lcom/zykj/huiwei/launcher/app/a$j;

    .line 88
    .line 89
    const/16 v0, 0x8

    .line 90
    .line 91
    invoke-direct {p1, p2, v0}, Lcom/zykj/huiwei/launcher/app/a$j$a;-><init>(Lcom/zykj/huiwei/launcher/app/a$j;I)V

    .line 92
    .line 93
    .line 94
    invoke-static {p1}, La5/b;->b(La5/f;)La5/f;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/app/a$j;->j:La5/f;

    .line 99
    .line 100
    new-instance p1, Lcom/zykj/huiwei/launcher/app/a$j$a;

    .line 101
    .line 102
    iget-object p2, p0, Lcom/zykj/huiwei/launcher/app/a$j;->c:Lcom/zykj/huiwei/launcher/app/a$j;

    .line 103
    .line 104
    const/4 v0, 0x7

    .line 105
    invoke-direct {p1, p2, v0}, Lcom/zykj/huiwei/launcher/app/a$j$a;-><init>(Lcom/zykj/huiwei/launcher/app/a$j;I)V

    .line 106
    .line 107
    .line 108
    invoke-static {p1}, La5/b;->b(La5/f;)La5/f;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/app/a$j;->k:La5/f;

    .line 113
    .line 114
    new-instance p1, Lcom/zykj/huiwei/launcher/app/a$j$a;

    .line 115
    .line 116
    iget-object p2, p0, Lcom/zykj/huiwei/launcher/app/a$j;->c:Lcom/zykj/huiwei/launcher/app/a$j;

    .line 117
    .line 118
    const/4 v0, 0x4

    .line 119
    invoke-direct {p1, p2, v0}, Lcom/zykj/huiwei/launcher/app/a$j$a;-><init>(Lcom/zykj/huiwei/launcher/app/a$j;I)V

    .line 120
    .line 121
    .line 122
    invoke-static {p1}, La5/b;->b(La5/f;)La5/f;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/app/a$j;->l:La5/f;

    .line 127
    .line 128
    new-instance p1, Lcom/zykj/huiwei/launcher/app/a$j$a;

    .line 129
    .line 130
    iget-object p2, p0, Lcom/zykj/huiwei/launcher/app/a$j;->c:Lcom/zykj/huiwei/launcher/app/a$j;

    .line 131
    .line 132
    const/16 v0, 0x9

    .line 133
    .line 134
    invoke-direct {p1, p2, v0}, Lcom/zykj/huiwei/launcher/app/a$j$a;-><init>(Lcom/zykj/huiwei/launcher/app/a$j;I)V

    .line 135
    .line 136
    .line 137
    invoke-static {p1}, La5/b;->b(La5/f;)La5/f;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/app/a$j;->m:La5/f;

    .line 142
    .line 143
    new-instance p1, Lcom/zykj/huiwei/launcher/app/a$j$a;

    .line 144
    .line 145
    iget-object p2, p0, Lcom/zykj/huiwei/launcher/app/a$j;->c:Lcom/zykj/huiwei/launcher/app/a$j;

    .line 146
    .line 147
    const/16 v0, 0xa

    .line 148
    .line 149
    invoke-direct {p1, p2, v0}, Lcom/zykj/huiwei/launcher/app/a$j$a;-><init>(Lcom/zykj/huiwei/launcher/app/a$j;I)V

    .line 150
    .line 151
    .line 152
    invoke-static {p1}, La5/b;->b(La5/f;)La5/f;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/app/a$j;->n:La5/f;

    .line 157
    .line 158
    new-instance p1, Lcom/zykj/huiwei/launcher/app/a$j$a;

    .line 159
    .line 160
    iget-object p2, p0, Lcom/zykj/huiwei/launcher/app/a$j;->c:Lcom/zykj/huiwei/launcher/app/a$j;

    .line 161
    .line 162
    const/16 v0, 0xb

    .line 163
    .line 164
    invoke-direct {p1, p2, v0}, Lcom/zykj/huiwei/launcher/app/a$j$a;-><init>(Lcom/zykj/huiwei/launcher/app/a$j;I)V

    .line 165
    .line 166
    .line 167
    invoke-static {p1}, La5/b;->b(La5/f;)La5/f;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/app/a$j;->o:La5/f;

    .line 172
    .line 173
    new-instance p1, Lcom/zykj/huiwei/launcher/app/a$j$a;

    .line 174
    .line 175
    iget-object p2, p0, Lcom/zykj/huiwei/launcher/app/a$j;->c:Lcom/zykj/huiwei/launcher/app/a$j;

    .line 176
    .line 177
    const/16 v0, 0xc

    .line 178
    .line 179
    invoke-direct {p1, p2, v0}, Lcom/zykj/huiwei/launcher/app/a$j$a;-><init>(Lcom/zykj/huiwei/launcher/app/a$j;I)V

    .line 180
    .line 181
    .line 182
    invoke-static {p1}, La5/b;->b(La5/f;)La5/f;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/app/a$j;->p:La5/f;

    .line 187
    .line 188
    new-instance p1, Lcom/zykj/huiwei/launcher/app/a$j$a;

    .line 189
    .line 190
    iget-object p2, p0, Lcom/zykj/huiwei/launcher/app/a$j;->c:Lcom/zykj/huiwei/launcher/app/a$j;

    .line 191
    .line 192
    const/16 v0, 0xd

    .line 193
    .line 194
    invoke-direct {p1, p2, v0}, Lcom/zykj/huiwei/launcher/app/a$j$a;-><init>(Lcom/zykj/huiwei/launcher/app/a$j;I)V

    .line 195
    .line 196
    .line 197
    invoke-static {p1}, La5/b;->b(La5/f;)La5/f;

    .line 198
    .line 199
    .line 200
    move-result-object p1

    .line 201
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/app/a$j;->q:La5/f;

    .line 202
    .line 203
    new-instance p1, Lcom/zykj/huiwei/launcher/app/a$j$a;

    .line 204
    .line 205
    iget-object p2, p0, Lcom/zykj/huiwei/launcher/app/a$j;->c:Lcom/zykj/huiwei/launcher/app/a$j;

    .line 206
    .line 207
    const/16 v0, 0xe

    .line 208
    .line 209
    invoke-direct {p1, p2, v0}, Lcom/zykj/huiwei/launcher/app/a$j$a;-><init>(Lcom/zykj/huiwei/launcher/app/a$j;I)V

    .line 210
    .line 211
    .line 212
    invoke-static {p1}, La5/b;->b(La5/f;)La5/f;

    .line 213
    .line 214
    .line 215
    move-result-object p1

    .line 216
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/app/a$j;->r:La5/f;

    .line 217
    .line 218
    new-instance p1, Lcom/zykj/huiwei/launcher/app/a$j$a;

    .line 219
    .line 220
    iget-object p2, p0, Lcom/zykj/huiwei/launcher/app/a$j;->c:Lcom/zykj/huiwei/launcher/app/a$j;

    .line 221
    .line 222
    const/16 v0, 0xf

    .line 223
    .line 224
    invoke-direct {p1, p2, v0}, Lcom/zykj/huiwei/launcher/app/a$j$a;-><init>(Lcom/zykj/huiwei/launcher/app/a$j;I)V

    .line 225
    .line 226
    .line 227
    invoke-static {p1}, La5/b;->b(La5/f;)La5/f;

    .line 228
    .line 229
    .line 230
    move-result-object p1

    .line 231
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/app/a$j;->s:La5/f;

    .line 232
    .line 233
    new-instance p1, Lcom/zykj/huiwei/launcher/app/a$j$a;

    .line 234
    .line 235
    iget-object p2, p0, Lcom/zykj/huiwei/launcher/app/a$j;->c:Lcom/zykj/huiwei/launcher/app/a$j;

    .line 236
    .line 237
    const/16 v0, 0x10

    .line 238
    .line 239
    invoke-direct {p1, p2, v0}, Lcom/zykj/huiwei/launcher/app/a$j$a;-><init>(Lcom/zykj/huiwei/launcher/app/a$j;I)V

    .line 240
    .line 241
    .line 242
    invoke-static {p1}, La5/b;->b(La5/f;)La5/f;

    .line 243
    .line 244
    .line 245
    move-result-object p1

    .line 246
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/app/a$j;->t:La5/f;

    .line 247
    .line 248
    return-void
.end method

.method public final l(Lcom/zykj/http/interceptor/HeadInterceptor;)Lcom/zykj/http/interceptor/HeadInterceptor;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/app/a$j;->h:La5/f;

    .line 2
    .line 3
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 8
    .line 9
    invoke-static {p1, v0}, Lp3/b;->a(Lcom/zykj/http/interceptor/HeadInterceptor;Lkotlinx/coroutines/flow/MutableStateFlow;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public final m(Lcom/zykj/huiwei/launcher/receiver/LogoutReceiver;)Lcom/zykj/huiwei/launcher/receiver/LogoutReceiver;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/app/a$j;->d:La5/f;

    .line 2
    .line 3
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroidx/datastore/core/DataStore;

    .line 8
    .line 9
    invoke-static {p1, v0}, Lv3/c;->a(Lcom/zykj/huiwei/launcher/receiver/LogoutReceiver;Landroidx/datastore/core/DataStore;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/app/a$j;->e:La5/f;

    .line 13
    .line 14
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Landroidx/datastore/core/DataStore;

    .line 19
    .line 20
    invoke-static {p1, v0}, Lv3/c;->d(Lcom/zykj/huiwei/launcher/receiver/LogoutReceiver;Landroidx/datastore/core/DataStore;)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/app/a$j;->f:La5/f;

    .line 24
    .line 25
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, Landroidx/datastore/core/DataStore;

    .line 30
    .line 31
    invoke-static {p1, v0}, Lv3/c;->b(Lcom/zykj/huiwei/launcher/receiver/LogoutReceiver;Landroidx/datastore/core/DataStore;)V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/app/a$j;->g:La5/f;

    .line 35
    .line 36
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    check-cast v0, Landroidx/datastore/core/DataStore;

    .line 41
    .line 42
    invoke-static {p1, v0}, Lv3/c;->c(Lcom/zykj/huiwei/launcher/receiver/LogoutReceiver;Landroidx/datastore/core/DataStore;)V

    .line 43
    .line 44
    .line 45
    return-object p1
.end method

.method public final n(Lcom/zykj/http/interceptor/RefreshTokenInterceptor;)Lcom/zykj/http/interceptor/RefreshTokenInterceptor;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/app/a$j;->i:La5/f;

    .line 2
    .line 3
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lkotlinx/coroutines/flow/MutableSharedFlow;

    .line 8
    .line 9
    invoke-static {p1, v0}, Lp3/d;->b(Lcom/zykj/http/interceptor/RefreshTokenInterceptor;Lkotlinx/coroutines/flow/MutableSharedFlow;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/app/a$j;->k:La5/f;

    .line 13
    .line 14
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Lq3/a;

    .line 19
    .line 20
    invoke-static {p1, v0}, Lp3/d;->a(Lcom/zykj/http/interceptor/RefreshTokenInterceptor;Lq3/a;)V

    .line 21
    .line 22
    .line 23
    return-object p1
.end method

.method public o()Lcom/zykj/http/interceptor/RefreshTokenInterceptor;
    .locals 1

    .line 1
    invoke-static {}, Lp3/c;->a()Lcom/zykj/http/interceptor/RefreshTokenInterceptor;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0, v0}, Lcom/zykj/huiwei/launcher/app/a$j;->n(Lcom/zykj/http/interceptor/RefreshTokenInterceptor;)Lcom/zykj/http/interceptor/RefreshTokenInterceptor;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public p()Lf5/a0;
    .locals 4

    .line 1
    new-instance v0, Lcom/zykj/http/interceptor/NetworkInterceptor;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/zykj/http/interceptor/NetworkInterceptor;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/app/a$j;->j()Lcom/zykj/http/interceptor/HeadInterceptor;

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
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/app/a$j;->o()Lcom/zykj/http/interceptor/RefreshTokenInterceptor;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-static {v0, v1, v2, v3}, Lcom/zykj/huiwei/launcher/providers/OkHttpClientProvide_ProvideResponseOkHttpClientFactory;->provideResponseOkHttpClient(Lcom/zykj/http/interceptor/NetworkInterceptor;Lcom/zykj/http/interceptor/HeadInterceptor;Lcom/zykj/http/interceptor/GzipInterceptor;Lcom/zykj/http/interceptor/RefreshTokenInterceptor;)Lf5/a0;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    return-object v0
.end method
