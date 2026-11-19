.class public final synthetic Lcom/zykj/mistake/feature/notebook/detail/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/c;


# instance fields
.field public final synthetic a:Lcom/zykj/mistake/feature/notebook/detail/a5;

.field public final synthetic b:Lcom/zykj/mistake/feature/notebook/detail/m3;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Lcom/zykj/mistake/feature/notebook/detail/q0;

.field public final synthetic e:Z

.field public final synthetic f:Z

.field public final synthetic g:Lr6/e;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/mistake/feature/notebook/detail/a5;Lcom/zykj/mistake/feature/notebook/detail/m3;Ljava/lang/String;Lcom/zykj/mistake/feature/notebook/detail/q0;ZZLr6/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/mistake/feature/notebook/detail/w;->a:Lcom/zykj/mistake/feature/notebook/detail/a5;

    iput-object p2, p0, Lcom/zykj/mistake/feature/notebook/detail/w;->b:Lcom/zykj/mistake/feature/notebook/detail/m3;

    iput-object p3, p0, Lcom/zykj/mistake/feature/notebook/detail/w;->c:Ljava/lang/String;

    iput-object p4, p0, Lcom/zykj/mistake/feature/notebook/detail/w;->d:Lcom/zykj/mistake/feature/notebook/detail/q0;

    iput-boolean p5, p0, Lcom/zykj/mistake/feature/notebook/detail/w;->e:Z

    iput-boolean p6, p0, Lcom/zykj/mistake/feature/notebook/detail/w;->f:Z

    iput-object p7, p0, Lcom/zykj/mistake/feature/notebook/detail/w;->g:Lr6/e;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v2, v1, Lcom/zykj/mistake/feature/notebook/detail/w;->a:Lcom/zykj/mistake/feature/notebook/detail/a5;

    .line 4
    .line 5
    iget-object v0, v1, Lcom/zykj/mistake/feature/notebook/detail/w;->b:Lcom/zykj/mistake/feature/notebook/detail/m3;

    .line 6
    .line 7
    iget-object v3, v1, Lcom/zykj/mistake/feature/notebook/detail/w;->c:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, v1, Lcom/zykj/mistake/feature/notebook/detail/w;->d:Lcom/zykj/mistake/feature/notebook/detail/q0;

    .line 10
    .line 11
    iget-boolean v5, v1, Lcom/zykj/mistake/feature/notebook/detail/w;->e:Z

    .line 12
    .line 13
    iget-boolean v6, v1, Lcom/zykj/mistake/feature/notebook/detail/w;->f:Z

    .line 14
    .line 15
    iget-object v7, v1, Lcom/zykj/mistake/feature/notebook/detail/w;->g:Lr6/e;

    .line 16
    .line 17
    move-object/from16 v8, p1

    .line 18
    .line 19
    check-cast v8, Lcom/zykj/view/simpleBoard/SimpleBoardView;

    .line 20
    .line 21
    const-string v9, "board"

    .line 22
    .line 23
    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    iget-object v9, v2, Lcom/zykj/mistake/feature/notebook/detail/a5;->a:Lcom/zykj/view/simpleBoard/SimpleBoardView;

    .line 30
    .line 31
    const/4 v10, 0x0

    .line 32
    if-eq v9, v8, :cond_1

    .line 33
    .line 34
    if-eqz v9, :cond_0

    .line 35
    .line 36
    invoke-virtual {v9, v10}, Lcom/zykj/view/simpleBoard/SimpleBoardView;->setOnActionListener(Lr6/a;)V

    .line 37
    .line 38
    .line 39
    :cond_0
    iput-object v8, v2, Lcom/zykj/mistake/feature/notebook/detail/a5;->a:Lcom/zykj/view/simpleBoard/SimpleBoardView;

    .line 40
    .line 41
    iput-object v10, v2, Lcom/zykj/mistake/feature/notebook/detail/a5;->m:Lcom/zykj/mistake/feature/notebook/detail/f;

    .line 42
    .line 43
    iput-object v10, v2, Lcom/zykj/mistake/feature/notebook/detail/a5;->n:Lcom/zykj/mistake/feature/notebook/detail/f;

    .line 44
    .line 45
    :cond_1
    new-instance v9, Lcom/zykj/mistake/feature/notebook/detail/c0;

    .line 46
    .line 47
    const/4 v11, 0x3

    .line 48
    invoke-direct {v9, v2, v11}, Lcom/zykj/mistake/feature/notebook/detail/c0;-><init>(Lcom/zykj/mistake/feature/notebook/detail/a5;I)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v8, v9}, Lcom/zykj/view/simpleBoard/SimpleBoardView;->setOnActionListener(Lr6/a;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v8}, Lcom/zykj/view/simpleBoard/SimpleBoardView;->getSimpleBoardConfig()Lcom/zykj/view/simpleBoard/SimpleBoardConfig;

    .line 55
    .line 56
    .line 57
    move-result-object v9

    .line 58
    const/4 v11, 0x0

    .line 59
    invoke-virtual {v9, v11}, Lcom/zykj/view/simpleBoard/SimpleBoardConfig;->setEnableControl(Z)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v8}, Lcom/zykj/view/simpleBoard/SimpleBoardView;->getSimpleBoardConfig()Lcom/zykj/view/simpleBoard/SimpleBoardConfig;

    .line 63
    .line 64
    .line 65
    move-result-object v9

    .line 66
    const/high16 v12, 0x3f800000    # 1.0f

    .line 67
    .line 68
    invoke-virtual {v9, v12}, Lcom/zykj/view/simpleBoard/SimpleBoardConfig;->setMinScaleTime(F)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v8}, Lcom/zykj/view/simpleBoard/SimpleBoardView;->getSimpleBoardConfig()Lcom/zykj/view/simpleBoard/SimpleBoardConfig;

    .line 72
    .line 73
    .line 74
    move-result-object v9

    .line 75
    const/high16 v13, 0x3fc00000    # 1.5f

    .line 76
    .line 77
    invoke-virtual {v9, v13}, Lcom/zykj/view/simpleBoard/SimpleBoardConfig;->setMaxScaleTime(F)V

    .line 78
    .line 79
    .line 80
    const/4 v9, 0x1

    .line 81
    invoke-virtual {v8, v9}, Landroid/view/View;->setEnabled(Z)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v2}, Lcom/zykj/mistake/feature/notebook/detail/a5;->c()V

    .line 85
    .line 86
    .line 87
    iget v8, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->b:I

    .line 88
    .line 89
    iget-object v13, v4, Lcom/zykj/mistake/feature/notebook/detail/q0;->a:Ljava/lang/String;

    .line 90
    .line 91
    iget-object v4, v4, Lcom/zykj/mistake/feature/notebook/detail/q0;->b:Ljava/util/List;

    .line 92
    .line 93
    iget v0, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->Q:I

    .line 94
    .line 95
    const-string v14, "path"

    .line 96
    .line 97
    invoke-static {v3, v14}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    const-string v14, "paths"

    .line 101
    .line 102
    invoke-static {v4, v14}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    const-string v14, "onStemSnapshotReady"

    .line 106
    .line 107
    invoke-static {v7, v14}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    new-instance v14, Lcom/zykj/mistake/feature/notebook/detail/f;

    .line 111
    .line 112
    invoke-direct {v14, v3, v13, v4, v0}, Lcom/zykj/mistake/feature/notebook/detail/f;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;I)V

    .line 113
    .line 114
    .line 115
    iget-object v15, v2, Lcom/zykj/mistake/feature/notebook/detail/a5;->g:Ljava/lang/String;

    .line 116
    .line 117
    invoke-static {v15, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v15

    .line 121
    if-eqz v15, :cond_3

    .line 122
    .line 123
    iget-object v15, v2, Lcom/zykj/mistake/feature/notebook/detail/a5;->h:Ljava/lang/String;

    .line 124
    .line 125
    invoke-static {v15, v13}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result v15

    .line 129
    if-eqz v15, :cond_3

    .line 130
    .line 131
    iget-object v15, v2, Lcom/zykj/mistake/feature/notebook/detail/a5;->i:Ljava/util/List;

    .line 132
    .line 133
    invoke-static {v15, v4}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result v15

    .line 137
    if-eqz v15, :cond_3

    .line 138
    .line 139
    iget v15, v2, Lcom/zykj/mistake/feature/notebook/detail/a5;->j:I

    .line 140
    .line 141
    if-eq v15, v0, :cond_2

    .line 142
    .line 143
    goto :goto_0

    .line 144
    :cond_2
    move v15, v11

    .line 145
    goto :goto_1

    .line 146
    :cond_3
    :goto_0
    move v15, v9

    .line 147
    :goto_1
    iget-boolean v10, v2, Lcom/zykj/mistake/feature/notebook/detail/a5;->l:Z

    .line 148
    .line 149
    if-eq v10, v5, :cond_4

    .line 150
    .line 151
    move v10, v9

    .line 152
    goto :goto_2

    .line 153
    :cond_4
    move v10, v11

    .line 154
    :goto_2
    iput-boolean v6, v2, Lcom/zykj/mistake/feature/notebook/detail/a5;->c:Z

    .line 155
    .line 156
    iput-boolean v5, v2, Lcom/zykj/mistake/feature/notebook/detail/a5;->l:Z

    .line 157
    .line 158
    iput v8, v2, Lcom/zykj/mistake/feature/notebook/detail/a5;->f:I

    .line 159
    .line 160
    iput-object v7, v2, Lcom/zykj/mistake/feature/notebook/detail/a5;->k:Lr6/e;

    .line 161
    .line 162
    invoke-virtual {v2}, Lcom/zykj/mistake/feature/notebook/detail/a5;->c()V

    .line 163
    .line 164
    .line 165
    if-nez v15, :cond_5

    .line 166
    .line 167
    if-nez v10, :cond_5

    .line 168
    .line 169
    iget-object v5, v2, Lcom/zykj/mistake/feature/notebook/detail/a5;->m:Lcom/zykj/mistake/feature/notebook/detail/f;

    .line 170
    .line 171
    invoke-static {v5, v14}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    move-result v5

    .line 175
    if-eqz v5, :cond_5

    .line 176
    .line 177
    goto :goto_5

    .line 178
    :cond_5
    iput-object v3, v2, Lcom/zykj/mistake/feature/notebook/detail/a5;->g:Ljava/lang/String;

    .line 179
    .line 180
    iput-object v13, v2, Lcom/zykj/mistake/feature/notebook/detail/a5;->h:Ljava/lang/String;

    .line 181
    .line 182
    iput-object v4, v2, Lcom/zykj/mistake/feature/notebook/detail/a5;->i:Ljava/util/List;

    .line 183
    .line 184
    iput v0, v2, Lcom/zykj/mistake/feature/notebook/detail/a5;->j:I

    .line 185
    .line 186
    new-instance v0, Ljava/io/File;

    .line 187
    .line 188
    iget-object v3, v2, Lcom/zykj/mistake/feature/notebook/detail/a5;->g:Ljava/lang/String;

    .line 189
    .line 190
    invoke-direct {v0, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 194
    .line 195
    .line 196
    if-nez v15, :cond_7

    .line 197
    .line 198
    iget-object v0, v2, Lcom/zykj/mistake/feature/notebook/detail/a5;->m:Lcom/zykj/mistake/feature/notebook/detail/f;

    .line 199
    .line 200
    invoke-static {v0, v14}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    move-result v0

    .line 204
    if-nez v0, :cond_6

    .line 205
    .line 206
    goto :goto_3

    .line 207
    :cond_6
    if-eqz v10, :cond_9

    .line 208
    .line 209
    iget-object v0, v2, Lcom/zykj/mistake/feature/notebook/detail/a5;->a:Lcom/zykj/view/simpleBoard/SimpleBoardView;

    .line 210
    .line 211
    if-eqz v0, :cond_9

    .line 212
    .line 213
    invoke-virtual {v2, v0}, Lcom/zykj/mistake/feature/notebook/detail/a5;->d(Lcom/zykj/view/simpleBoard/SimpleBoardView;)V

    .line 214
    .line 215
    .line 216
    goto :goto_5

    .line 217
    :cond_7
    :goto_3
    iput-boolean v11, v2, Lcom/zykj/mistake/feature/notebook/detail/a5;->o:Z

    .line 218
    .line 219
    iget-boolean v3, v2, Lcom/zykj/mistake/feature/notebook/detail/a5;->p:Z

    .line 220
    .line 221
    iput-boolean v9, v2, Lcom/zykj/mistake/feature/notebook/detail/a5;->p:Z

    .line 222
    .line 223
    :try_start_0
    iget-object v0, v2, Lcom/zykj/mistake/feature/notebook/detail/a5;->a:Lcom/zykj/view/simpleBoard/SimpleBoardView;

    .line 224
    .line 225
    if-eqz v0, :cond_8

    .line 226
    .line 227
    invoke-virtual {v0}, Lcom/zykj/view/simpleBoard/SimpleBoardView;->clean()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 228
    .line 229
    .line 230
    goto :goto_4

    .line 231
    :catchall_0
    move-exception v0

    .line 232
    goto :goto_6

    .line 233
    :cond_8
    :goto_4
    iput-boolean v3, v2, Lcom/zykj/mistake/feature/notebook/detail/a5;->p:Z

    .line 234
    .line 235
    iput v12, v2, Lcom/zykj/mistake/feature/notebook/detail/a5;->e:F

    .line 236
    .line 237
    const/4 v0, 0x0

    .line 238
    iput-object v0, v2, Lcom/zykj/mistake/feature/notebook/detail/a5;->m:Lcom/zykj/mistake/feature/notebook/detail/f;

    .line 239
    .line 240
    iput-object v0, v2, Lcom/zykj/mistake/feature/notebook/detail/a5;->n:Lcom/zykj/mistake/feature/notebook/detail/f;

    .line 241
    .line 242
    invoke-virtual {v2}, Lcom/zykj/mistake/feature/notebook/detail/a5;->e()V

    .line 243
    .line 244
    .line 245
    invoke-virtual {v2}, Lcom/zykj/mistake/feature/notebook/detail/a5;->i()V

    .line 246
    .line 247
    .line 248
    :cond_9
    :goto_5
    sget-object v0, Ld6/s;->a:Ld6/s;

    .line 249
    .line 250
    return-object v0

    .line 251
    :goto_6
    iput-boolean v3, v2, Lcom/zykj/mistake/feature/notebook/detail/a5;->p:Z

    .line 252
    .line 253
    throw v0
.end method
