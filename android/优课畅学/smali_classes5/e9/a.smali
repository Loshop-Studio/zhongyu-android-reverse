.class public Le9/a;
.super Ld9/b;
.source "SourceFile"


# instance fields
.field public a:Lz8/e;

.field public final b:Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;

.field public c:Le9/b$f;

.field public final d:Le9/b$f;

.field public final e:Le9/b;

.field public f:Lz8/j;

.field public g:Ld9/a$a;


# direct methods
.method public constructor <init>(Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ld9/b;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Le9/a$a;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Le9/a$a;-><init>(Le9/a;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Le9/a;->d:Le9/b$f;

    .line 10
    .line 11
    iput-object p1, p0, Le9/a;->b:Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;

    .line 12
    .line 13
    new-instance v0, Le9/b;

    .line 14
    .line 15
    invoke-virtual {p1}, Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;->c()Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    invoke-direct {v0, p1}, Le9/b;-><init>(Z)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Le9/a;->e:Le9/b;

    .line 23
    .line 24
    return-void
.end method

.method public static synthetic f(Le9/a;)Lz8/e;
    .locals 0

    .line 1
    iget-object p0, p0, Le9/a;->a:Lz8/e;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic g(Le9/a;)Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;
    .locals 0

    .line 1
    iget-object p0, p0, Le9/a;->b:Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public a(Lz8/m;Lz8/l;JLd9/a$b;)V
    .locals 9

    .line 1
    iget-object v0, p5, Ld9/a$b;->b:Lz8/e;

    .line 2
    .line 3
    iput-object v0, p0, Le9/a;->a:Lz8/e;

    .line 4
    .line 5
    invoke-interface {p2}, Lz8/l;->iterator()Lz8/k;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    const/4 v0, 0x0

    .line 10
    :goto_0
    invoke-interface {p2}, Lz8/k;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_e

    .line 15
    .line 16
    invoke-interface {p2}, Lz8/k;->next()Lz8/c;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    invoke-virtual {v3}, Lz8/c;->w()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    invoke-interface {p1, v3}, Lz8/m;->j(Lz8/c;)V

    .line 27
    .line 28
    .line 29
    goto/16 :goto_2

    .line 30
    .line 31
    :cond_0
    iget-boolean v0, p5, Ld9/a$b;->a:Z

    .line 32
    .line 33
    if-nez v0, :cond_1

    .line 34
    .line 35
    invoke-virtual {v3}, Lz8/c;->r()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_1

    .line 40
    .line 41
    invoke-interface {p2}, Lz8/k;->remove()V

    .line 42
    .line 43
    .line 44
    goto/16 :goto_2

    .line 45
    .line 46
    :cond_1
    invoke-virtual {v3}, Lz8/c;->n()Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-nez v0, :cond_2

    .line 51
    .line 52
    iget-object v8, p0, Le9/a;->b:Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;

    .line 53
    .line 54
    iget-object v2, v8, Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;->z:Ly8/b;

    .line 55
    .line 56
    iget v4, p5, Ld9/a$b;->c:I

    .line 57
    .line 58
    iget v5, p5, Ld9/a$b;->d:I

    .line 59
    .line 60
    iget-object v6, p5, Ld9/a$b;->b:Lz8/e;

    .line 61
    .line 62
    const/4 v7, 0x0

    .line 63
    invoke-virtual/range {v2 .. v8}, Ly8/b;->b(Lz8/c;IILz8/e;ZLmaster/flame/danmaku/danmaku/model/android/DanmakuContext;)V

    .line 64
    .line 65
    .line 66
    :cond_2
    invoke-virtual {v3}, Lz8/c;->b()J

    .line 67
    .line 68
    .line 69
    move-result-wide v0

    .line 70
    cmp-long v0, v0, p3

    .line 71
    .line 72
    if-ltz v0, :cond_d

    .line 73
    .line 74
    iget-byte v0, v3, Lz8/c;->n:B

    .line 75
    .line 76
    if-nez v0, :cond_3

    .line 77
    .line 78
    invoke-virtual {v3}, Lz8/c;->o()Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-eqz v0, :cond_3

    .line 83
    .line 84
    goto/16 :goto_2

    .line 85
    .line 86
    :cond_3
    invoke-virtual {v3}, Lz8/c;->p()Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-eqz v0, :cond_6

    .line 91
    .line 92
    invoke-virtual {v3}, Lz8/c;->e()Lz8/n;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    iget-object p2, p0, Le9/a;->f:Lz8/j;

    .line 97
    .line 98
    if-eqz p2, :cond_5

    .line 99
    .line 100
    if-eqz p1, :cond_4

    .line 101
    .line 102
    invoke-interface {p1}, Lz8/n;->get()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    if-nez p1, :cond_5

    .line 107
    .line 108
    :cond_4
    iget-object p1, p0, Le9/a;->f:Lz8/j;

    .line 109
    .line 110
    invoke-interface {p1, v3}, Lz8/j;->a(Lz8/c;)V

    .line 111
    .line 112
    .line 113
    :cond_5
    move-object v0, v3

    .line 114
    goto/16 :goto_3

    .line 115
    .line 116
    :cond_6
    invoke-virtual {v3}, Lz8/c;->m()I

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    const/4 v1, 0x1

    .line 121
    if-ne v0, v1, :cond_7

    .line 122
    .line 123
    iget v0, p5, Ld9/a$b;->c:I

    .line 124
    .line 125
    add-int/2addr v0, v1

    .line 126
    iput v0, p5, Ld9/a$b;->c:I

    .line 127
    .line 128
    :cond_7
    invoke-virtual {v3}, Lz8/c;->q()Z

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    const/4 v2, 0x0

    .line 133
    if-nez v0, :cond_8

    .line 134
    .line 135
    invoke-virtual {v3, p1, v2}, Lz8/c;->z(Lz8/m;Z)V

    .line 136
    .line 137
    .line 138
    :cond_8
    invoke-virtual {v3}, Lz8/c;->u()Z

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    if-nez v0, :cond_9

    .line 143
    .line 144
    invoke-virtual {v3, p1, v2}, Lz8/c;->A(Lz8/m;Z)V

    .line 145
    .line 146
    .line 147
    :cond_9
    iget-object v0, p0, Le9/a;->e:Le9/b;

    .line 148
    .line 149
    iget-object v2, p0, Le9/a;->c:Le9/b$f;

    .line 150
    .line 151
    invoke-virtual {v0, v3, p1, v2}, Le9/b;->c(Lz8/c;Lz8/m;Le9/b$f;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v3}, Lz8/c;->v()Z

    .line 155
    .line 156
    .line 157
    move-result v0

    .line 158
    if-eqz v0, :cond_d

    .line 159
    .line 160
    iget-object v0, v3, Lz8/c;->d:[Ljava/lang/String;

    .line 161
    .line 162
    if-nez v0, :cond_a

    .line 163
    .line 164
    invoke-virtual {v3}, Lz8/c;->d()F

    .line 165
    .line 166
    .line 167
    move-result v0

    .line 168
    invoke-interface {p1}, Lz8/m;->getHeight()I

    .line 169
    .line 170
    .line 171
    move-result v2

    .line 172
    int-to-float v2, v2

    .line 173
    cmpl-float v0, v0, v2

    .line 174
    .line 175
    if-lez v0, :cond_a

    .line 176
    .line 177
    goto :goto_2

    .line 178
    :cond_a
    invoke-virtual {v3, p1}, Lz8/c;->a(Lz8/m;)I

    .line 179
    .line 180
    .line 181
    move-result v0

    .line 182
    const-wide/16 v4, 0x1

    .line 183
    .line 184
    if-ne v0, v1, :cond_b

    .line 185
    .line 186
    iget-wide v6, p5, Ld9/a$b;->r:J

    .line 187
    .line 188
    add-long/2addr v6, v4

    .line 189
    iput-wide v6, p5, Ld9/a$b;->r:J

    .line 190
    .line 191
    goto :goto_1

    .line 192
    :cond_b
    const/4 v2, 0x2

    .line 193
    if-ne v0, v2, :cond_c

    .line 194
    .line 195
    iget-wide v6, p5, Ld9/a$b;->s:J

    .line 196
    .line 197
    add-long/2addr v6, v4

    .line 198
    iput-wide v6, p5, Ld9/a$b;->s:J

    .line 199
    .line 200
    iget-object v0, p0, Le9/a;->f:Lz8/j;

    .line 201
    .line 202
    if-eqz v0, :cond_c

    .line 203
    .line 204
    invoke-interface {v0, v3}, Lz8/j;->a(Lz8/c;)V

    .line 205
    .line 206
    .line 207
    :cond_c
    :goto_1
    invoke-virtual {v3}, Lz8/c;->m()I

    .line 208
    .line 209
    .line 210
    move-result v0

    .line 211
    invoke-virtual {p5, v0, v1}, Ld9/a$b;->a(II)I

    .line 212
    .line 213
    .line 214
    invoke-virtual {p5, v1}, Ld9/a$b;->b(I)I

    .line 215
    .line 216
    .line 217
    invoke-virtual {p5, v3}, Ld9/a$b;->c(Lz8/c;)V

    .line 218
    .line 219
    .line 220
    iget-object v0, p0, Le9/a;->g:Ld9/a$a;

    .line 221
    .line 222
    if-eqz v0, :cond_d

    .line 223
    .line 224
    iget v1, v3, Lz8/c;->J:I

    .line 225
    .line 226
    iget-object v2, p0, Le9/a;->b:Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;

    .line 227
    .line 228
    iget-object v2, v2, Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;->y:Lz8/i;

    .line 229
    .line 230
    iget v2, v2, Lz8/i;->d:I

    .line 231
    .line 232
    if-eq v1, v2, :cond_d

    .line 233
    .line 234
    iput v2, v3, Lz8/c;->J:I

    .line 235
    .line 236
    invoke-interface {v0, v3}, Ld9/a$a;->a(Lz8/c;)V

    .line 237
    .line 238
    .line 239
    :cond_d
    :goto_2
    move-object v0, v3

    .line 240
    goto/16 :goto_0

    .line 241
    .line 242
    :cond_e
    :goto_3
    iput-object v0, p5, Ld9/a$b;->e:Lz8/c;

    .line 243
    .line 244
    return-void
.end method

.method public b(Lz8/j;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le9/a;->f:Lz8/j;

    .line 2
    .line 3
    return-void
.end method

.method public c(Ld9/a$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le9/a;->g:Ld9/a$a;

    .line 2
    .line 3
    return-void
.end method

.method public clear()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Le9/a;->e()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Le9/a;->b:Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;

    .line 5
    .line 6
    iget-object v0, v0, Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;->z:Ly8/b;

    .line 7
    .line 8
    invoke-virtual {v0}, Ly8/b;->a()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public d(Z)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object p1, p0, Le9/a;->d:Le9/b$f;

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const/4 p1, 0x0

    .line 7
    :goto_0
    iput-object p1, p0, Le9/a;->c:Le9/b$f;

    .line 8
    .line 9
    return-void
.end method

.method public e()V
    .locals 1

    .line 1
    iget-object v0, p0, Le9/a;->e:Le9/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Le9/b;->b()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public release()V
    .locals 1

    .line 1
    iget-object v0, p0, Le9/a;->e:Le9/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Le9/b;->d()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Le9/a;->b:Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;

    .line 7
    .line 8
    iget-object v0, v0, Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;->z:Ly8/b;

    .line 9
    .line 10
    invoke-virtual {v0}, Ly8/b;->a()V

    .line 11
    .line 12
    .line 13
    return-void
.end method
