.class public final Lcom/bumptech/glide/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/Map;

.field public b:Lcom/bumptech/glide/load/engine/f;

.field public c:Ll0/d;

.field public d:Ll0/b;

.field public e:Lm0/h;

.field public f:Ln0/a;

.field public g:Ln0/a;

.field public h:Lm0/a$a;

.field public i:Lm0/i;

.field public j:Lx0/d;

.field public k:I

.field public l:Lcom/bumptech/glide/b$a;

.field public m:Lx0/m$b;

.field public n:Ln0/a;

.field public o:Z

.field public p:Ljava/util/List;

.field public q:Z

.field public r:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroidx/collection/ArrayMap;

    .line 5
    .line 6
    invoke-direct {v0}, Landroidx/collection/ArrayMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/bumptech/glide/c;->a:Ljava/util/Map;

    .line 10
    .line 11
    const/4 v0, 0x4

    .line 12
    iput v0, p0, Lcom/bumptech/glide/c;->k:I

    .line 13
    .line 14
    new-instance v0, Lcom/bumptech/glide/c$a;

    .line 15
    .line 16
    invoke-direct {v0, p0}, Lcom/bumptech/glide/c$a;-><init>(Lcom/bumptech/glide/c;)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lcom/bumptech/glide/c;->l:Lcom/bumptech/glide/b$a;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;)Lcom/bumptech/glide/b;
    .locals 14

    .line 1
    move-object v1, p1

    .line 2
    iget-object v0, p0, Lcom/bumptech/glide/c;->f:Ln0/a;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    invoke-static {}, Ln0/a;->g()Ln0/a;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, Lcom/bumptech/glide/c;->f:Ln0/a;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lcom/bumptech/glide/c;->g:Ln0/a;

    .line 13
    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    invoke-static {}, Ln0/a;->e()Ln0/a;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iput-object v0, p0, Lcom/bumptech/glide/c;->g:Ln0/a;

    .line 21
    .line 22
    :cond_1
    iget-object v0, p0, Lcom/bumptech/glide/c;->n:Ln0/a;

    .line 23
    .line 24
    if-nez v0, :cond_2

    .line 25
    .line 26
    invoke-static {}, Ln0/a;->c()Ln0/a;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iput-object v0, p0, Lcom/bumptech/glide/c;->n:Ln0/a;

    .line 31
    .line 32
    :cond_2
    iget-object v0, p0, Lcom/bumptech/glide/c;->i:Lm0/i;

    .line 33
    .line 34
    if-nez v0, :cond_3

    .line 35
    .line 36
    new-instance v0, Lm0/i$a;

    .line 37
    .line 38
    invoke-direct {v0, p1}, Lm0/i$a;-><init>(Landroid/content/Context;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Lm0/i$a;->a()Lm0/i;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iput-object v0, p0, Lcom/bumptech/glide/c;->i:Lm0/i;

    .line 46
    .line 47
    :cond_3
    iget-object v0, p0, Lcom/bumptech/glide/c;->j:Lx0/d;

    .line 48
    .line 49
    if-nez v0, :cond_4

    .line 50
    .line 51
    new-instance v0, Lx0/f;

    .line 52
    .line 53
    invoke-direct {v0}, Lx0/f;-><init>()V

    .line 54
    .line 55
    .line 56
    iput-object v0, p0, Lcom/bumptech/glide/c;->j:Lx0/d;

    .line 57
    .line 58
    :cond_4
    iget-object v0, p0, Lcom/bumptech/glide/c;->c:Ll0/d;

    .line 59
    .line 60
    if-nez v0, :cond_6

    .line 61
    .line 62
    iget-object v0, p0, Lcom/bumptech/glide/c;->i:Lm0/i;

    .line 63
    .line 64
    invoke-virtual {v0}, Lm0/i;->b()I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-lez v0, :cond_5

    .line 69
    .line 70
    new-instance v2, Ll0/j;

    .line 71
    .line 72
    int-to-long v3, v0

    .line 73
    invoke-direct {v2, v3, v4}, Ll0/j;-><init>(J)V

    .line 74
    .line 75
    .line 76
    iput-object v2, p0, Lcom/bumptech/glide/c;->c:Ll0/d;

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_5
    new-instance v0, Ll0/e;

    .line 80
    .line 81
    invoke-direct {v0}, Ll0/e;-><init>()V

    .line 82
    .line 83
    .line 84
    iput-object v0, p0, Lcom/bumptech/glide/c;->c:Ll0/d;

    .line 85
    .line 86
    :cond_6
    :goto_0
    iget-object v0, p0, Lcom/bumptech/glide/c;->d:Ll0/b;

    .line 87
    .line 88
    if-nez v0, :cond_7

    .line 89
    .line 90
    new-instance v0, Ll0/i;

    .line 91
    .line 92
    iget-object v2, p0, Lcom/bumptech/glide/c;->i:Lm0/i;

    .line 93
    .line 94
    invoke-virtual {v2}, Lm0/i;->a()I

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    invoke-direct {v0, v2}, Ll0/i;-><init>(I)V

    .line 99
    .line 100
    .line 101
    iput-object v0, p0, Lcom/bumptech/glide/c;->d:Ll0/b;

    .line 102
    .line 103
    :cond_7
    iget-object v0, p0, Lcom/bumptech/glide/c;->e:Lm0/h;

    .line 104
    .line 105
    if-nez v0, :cond_8

    .line 106
    .line 107
    new-instance v0, Lm0/g;

    .line 108
    .line 109
    iget-object v2, p0, Lcom/bumptech/glide/c;->i:Lm0/i;

    .line 110
    .line 111
    invoke-virtual {v2}, Lm0/i;->d()I

    .line 112
    .line 113
    .line 114
    move-result v2

    .line 115
    int-to-long v2, v2

    .line 116
    invoke-direct {v0, v2, v3}, Lm0/g;-><init>(J)V

    .line 117
    .line 118
    .line 119
    iput-object v0, p0, Lcom/bumptech/glide/c;->e:Lm0/h;

    .line 120
    .line 121
    :cond_8
    iget-object v0, p0, Lcom/bumptech/glide/c;->h:Lm0/a$a;

    .line 122
    .line 123
    if-nez v0, :cond_9

    .line 124
    .line 125
    new-instance v0, Lm0/f;

    .line 126
    .line 127
    invoke-direct {v0, p1}, Lm0/f;-><init>(Landroid/content/Context;)V

    .line 128
    .line 129
    .line 130
    iput-object v0, p0, Lcom/bumptech/glide/c;->h:Lm0/a$a;

    .line 131
    .line 132
    :cond_9
    iget-object v0, p0, Lcom/bumptech/glide/c;->b:Lcom/bumptech/glide/load/engine/f;

    .line 133
    .line 134
    if-nez v0, :cond_a

    .line 135
    .line 136
    new-instance v2, Lcom/bumptech/glide/load/engine/f;

    .line 137
    .line 138
    iget-object v3, p0, Lcom/bumptech/glide/c;->e:Lm0/h;

    .line 139
    .line 140
    iget-object v4, p0, Lcom/bumptech/glide/c;->h:Lm0/a$a;

    .line 141
    .line 142
    iget-object v5, p0, Lcom/bumptech/glide/c;->g:Ln0/a;

    .line 143
    .line 144
    iget-object v6, p0, Lcom/bumptech/glide/c;->f:Ln0/a;

    .line 145
    .line 146
    invoke-static {}, Ln0/a;->h()Ln0/a;

    .line 147
    .line 148
    .line 149
    move-result-object v7

    .line 150
    iget-object v8, p0, Lcom/bumptech/glide/c;->n:Ln0/a;

    .line 151
    .line 152
    iget-boolean v9, p0, Lcom/bumptech/glide/c;->o:Z

    .line 153
    .line 154
    invoke-direct/range {v2 .. v9}, Lcom/bumptech/glide/load/engine/f;-><init>(Lm0/h;Lm0/a$a;Ln0/a;Ln0/a;Ln0/a;Ln0/a;Z)V

    .line 155
    .line 156
    .line 157
    iput-object v2, p0, Lcom/bumptech/glide/c;->b:Lcom/bumptech/glide/load/engine/f;

    .line 158
    .line 159
    :cond_a
    iget-object v0, p0, Lcom/bumptech/glide/c;->p:Ljava/util/List;

    .line 160
    .line 161
    if-nez v0, :cond_b

    .line 162
    .line 163
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 164
    .line 165
    iput-object v0, p0, Lcom/bumptech/glide/c;->p:Ljava/util/List;

    .line 166
    .line 167
    goto :goto_1

    .line 168
    :cond_b
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    iput-object v0, p0, Lcom/bumptech/glide/c;->p:Ljava/util/List;

    .line 173
    .line 174
    :goto_1
    new-instance v6, Lx0/m;

    .line 175
    .line 176
    iget-object v0, p0, Lcom/bumptech/glide/c;->m:Lx0/m$b;

    .line 177
    .line 178
    invoke-direct {v6, v0}, Lx0/m;-><init>(Lx0/m$b;)V

    .line 179
    .line 180
    .line 181
    new-instance v0, Lcom/bumptech/glide/b;

    .line 182
    .line 183
    iget-object v2, p0, Lcom/bumptech/glide/c;->b:Lcom/bumptech/glide/load/engine/f;

    .line 184
    .line 185
    iget-object v3, p0, Lcom/bumptech/glide/c;->e:Lm0/h;

    .line 186
    .line 187
    iget-object v4, p0, Lcom/bumptech/glide/c;->c:Ll0/d;

    .line 188
    .line 189
    iget-object v5, p0, Lcom/bumptech/glide/c;->d:Ll0/b;

    .line 190
    .line 191
    iget-object v7, p0, Lcom/bumptech/glide/c;->j:Lx0/d;

    .line 192
    .line 193
    iget v8, p0, Lcom/bumptech/glide/c;->k:I

    .line 194
    .line 195
    iget-object v9, p0, Lcom/bumptech/glide/c;->l:Lcom/bumptech/glide/b$a;

    .line 196
    .line 197
    iget-object v10, p0, Lcom/bumptech/glide/c;->a:Ljava/util/Map;

    .line 198
    .line 199
    iget-object v11, p0, Lcom/bumptech/glide/c;->p:Ljava/util/List;

    .line 200
    .line 201
    iget-boolean v12, p0, Lcom/bumptech/glide/c;->q:Z

    .line 202
    .line 203
    iget-boolean v13, p0, Lcom/bumptech/glide/c;->r:Z

    .line 204
    .line 205
    invoke-direct/range {v0 .. v13}, Lcom/bumptech/glide/b;-><init>(Landroid/content/Context;Lcom/bumptech/glide/load/engine/f;Lm0/h;Ll0/d;Ll0/b;Lx0/m;Lx0/d;ILcom/bumptech/glide/b$a;Ljava/util/Map;Ljava/util/List;ZZ)V

    .line 206
    .line 207
    .line 208
    return-object v0
.end method

.method public b(Lx0/m$b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bumptech/glide/c;->m:Lx0/m$b;

    .line 2
    .line 3
    return-void
.end method
