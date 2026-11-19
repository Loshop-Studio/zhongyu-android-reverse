.class final Lcom/friday/document/viewmodel/StudentShareViewModel$doesFileExits$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/viewmodel/StudentShareViewModel;->p(Lcom/friday/document/model/ShareFile;ZLvc/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lhd/p;"
    }
.end annotation

.annotation runtime Lxc/d;
    c = "com.friday.document.viewmodel.StudentShareViewModel$doesFileExits$2"
    f = "StudentShareViewModel.kt"
    l = {
        0x19f,
        0x1a8,
        0x1ac,
        0x1ad
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:I

.field public final synthetic f:Lcom/friday/document/viewmodel/StudentShareViewModel;

.field public final synthetic g:Lcom/friday/document/model/ShareFile;

.field public final synthetic h:Z


# direct methods
.method public constructor <init>(Lcom/friday/document/viewmodel/StudentShareViewModel;Lcom/friday/document/model/ShareFile;ZLvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/viewmodel/StudentShareViewModel$doesFileExits$2;->f:Lcom/friday/document/viewmodel/StudentShareViewModel;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/document/viewmodel/StudentShareViewModel$doesFileExits$2;->g:Lcom/friday/document/model/ShareFile;

    .line 4
    .line 5
    iput-boolean p3, p0, Lcom/friday/document/viewmodel/StudentShareViewModel$doesFileExits$2;->h:Z

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 3

    .line 1
    new-instance p1, Lcom/friday/document/viewmodel/StudentShareViewModel$doesFileExits$2;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/document/viewmodel/StudentShareViewModel$doesFileExits$2;->f:Lcom/friday/document/viewmodel/StudentShareViewModel;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/friday/document/viewmodel/StudentShareViewModel$doesFileExits$2;->g:Lcom/friday/document/model/ShareFile;

    .line 6
    .line 7
    iget-boolean v2, p0, Lcom/friday/document/viewmodel/StudentShareViewModel$doesFileExits$2;->h:Z

    .line 8
    .line 9
    invoke-direct {p1, v0, v1, v2, p2}, Lcom/friday/document/viewmodel/StudentShareViewModel$doesFileExits$2;-><init>(Lcom/friday/document/viewmodel/StudentShareViewModel;Lcom/friday/document/model/ShareFile;ZLvc/c;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/friday/document/viewmodel/StudentShareViewModel$doesFileExits$2;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/viewmodel/StudentShareViewModel$doesFileExits$2;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/document/viewmodel/StudentShareViewModel$doesFileExits$2;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/document/viewmodel/StudentShareViewModel$doesFileExits$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v7

    .line 5
    iget v0, p0, Lcom/friday/document/viewmodel/StudentShareViewModel$doesFileExits$2;->e:I

    .line 6
    .line 7
    const/4 v8, 0x4

    .line 8
    const/4 v9, 0x3

    .line 9
    const/4 v1, 0x2

    .line 10
    const/4 v2, 0x1

    .line 11
    const/4 v10, 0x0

    .line 12
    if-eqz v0, :cond_4

    .line 13
    .line 14
    if-eq v0, v2, :cond_3

    .line 15
    .line 16
    if-eq v0, v1, :cond_2

    .line 17
    .line 18
    if-eq v0, v9, :cond_1

    .line 19
    .line 20
    if-ne v0, v8, :cond_0

    .line 21
    .line 22
    iget-object v0, p0, Lcom/friday/document/viewmodel/StudentShareViewModel$doesFileExits$2;->d:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Ljava/util/List;

    .line 25
    .line 26
    iget-object v0, p0, Lcom/friday/document/viewmodel/StudentShareViewModel$doesFileExits$2;->c:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, Lcom/friday/common/entity/ShareCacheEntity;

    .line 29
    .line 30
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 35
    .line 36
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 37
    .line 38
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    throw v0

    .line 42
    :cond_1
    iget-object v0, p0, Lcom/friday/document/viewmodel/StudentShareViewModel$doesFileExits$2;->d:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v0, Ljava/util/List;

    .line 45
    .line 46
    iget-object v1, p0, Lcom/friday/document/viewmodel/StudentShareViewModel$doesFileExits$2;->c:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v1, Lcom/friday/common/entity/ShareCacheEntity;

    .line 49
    .line 50
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    goto/16 :goto_4

    .line 54
    .line 55
    :cond_2
    iget-object v0, p0, Lcom/friday/document/viewmodel/StudentShareViewModel$doesFileExits$2;->c:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v0, Lcom/friday/common/entity/ShareCacheEntity;

    .line 58
    .line 59
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    move-object v11, v0

    .line 63
    move-object v0, p1

    .line 64
    goto :goto_2

    .line 65
    :cond_3
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    move-object v0, p1

    .line 69
    goto :goto_0

    .line 70
    :cond_4
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    iget-object v0, p0, Lcom/friday/document/viewmodel/StudentShareViewModel$doesFileExits$2;->f:Lcom/friday/document/viewmodel/StudentShareViewModel;

    .line 74
    .line 75
    invoke-static {v0}, Lcom/friday/document/viewmodel/StudentShareViewModel;->k(Lcom/friday/document/viewmodel/StudentShareViewModel;)Lc2/g2;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    iget-object v3, p0, Lcom/friday/document/viewmodel/StudentShareViewModel$doesFileExits$2;->g:Lcom/friday/document/model/ShareFile;

    .line 80
    .line 81
    invoke-virtual {v3}, Lcom/friday/document/model/ShareFile;->getFileId()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    iget-object v5, p0, Lcom/friday/document/viewmodel/StudentShareViewModel$doesFileExits$2;->f:Lcom/friday/document/viewmodel/StudentShareViewModel;

    .line 86
    .line 87
    invoke-static {v5}, Lcom/friday/document/viewmodel/StudentShareViewModel;->n(Lcom/friday/document/viewmodel/StudentShareViewModel;)J

    .line 88
    .line 89
    .line 90
    move-result-wide v5

    .line 91
    iput v2, p0, Lcom/friday/document/viewmodel/StudentShareViewModel$doesFileExits$2;->e:I

    .line 92
    .line 93
    invoke-interface {v0, v3, v5, v6, p0}, Lc2/g2;->c(Ljava/lang/String;JLvc/c;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    if-ne v0, v7, :cond_5

    .line 98
    .line 99
    goto/16 :goto_5

    .line 100
    .line 101
    :cond_5
    :goto_0
    move-object v11, v0

    .line 102
    check-cast v11, Lcom/friday/common/entity/ShareCacheEntity;

    .line 103
    .line 104
    if-nez v11, :cond_7

    .line 105
    .line 106
    :cond_6
    :goto_1
    move v2, v10

    .line 107
    goto/16 :goto_6

    .line 108
    .line 109
    :cond_7
    invoke-virtual {v11}, Lcom/friday/common/entity/ShareCacheEntity;->getVersion()I

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    iget-object v3, p0, Lcom/friday/document/viewmodel/StudentShareViewModel$doesFileExits$2;->g:Lcom/friday/document/model/ShareFile;

    .line 114
    .line 115
    invoke-virtual {v3}, Lcom/friday/document/model/ShareFile;->getVersion()I

    .line 116
    .line 117
    .line 118
    move-result v3

    .line 119
    if-ge v0, v3, :cond_c

    .line 120
    .line 121
    iget-boolean v0, p0, Lcom/friday/document/viewmodel/StudentShareViewModel$doesFileExits$2;->h:Z

    .line 122
    .line 123
    if-nez v0, :cond_8

    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_8
    iget-object v0, p0, Lcom/friday/document/viewmodel/StudentShareViewModel$doesFileExits$2;->f:Lcom/friday/document/viewmodel/StudentShareViewModel;

    .line 127
    .line 128
    invoke-static {v0}, Lcom/friday/document/viewmodel/StudentShareViewModel;->i(Lcom/friday/document/viewmodel/StudentShareViewModel;)Lcom/friday/common/dao/ResourceDao;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    iget-object v2, p0, Lcom/friday/document/viewmodel/StudentShareViewModel$doesFileExits$2;->g:Lcom/friday/document/model/ShareFile;

    .line 133
    .line 134
    invoke-virtual {v2}, Lcom/friday/document/model/ShareFile;->getFileId()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    invoke-static {v11}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v3

    .line 142
    iput-object v3, p0, Lcom/friday/document/viewmodel/StudentShareViewModel$doesFileExits$2;->c:Ljava/lang/Object;

    .line 143
    .line 144
    iput v1, p0, Lcom/friday/document/viewmodel/StudentShareViewModel$doesFileExits$2;->e:I

    .line 145
    .line 146
    move-object v1, v2

    .line 147
    const-wide/16 v2, 0x0

    .line 148
    .line 149
    const/4 v5, 0x2

    .line 150
    const/4 v6, 0x0

    .line 151
    move-object v4, p0

    .line 152
    invoke-static/range {v0 .. v6}, Lcom/friday/common/dao/ResourceDao;->c(Lcom/friday/common/dao/ResourceDao;Ljava/lang/String;JLvc/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    if-ne v0, v7, :cond_9

    .line 157
    .line 158
    goto :goto_5

    .line 159
    :cond_9
    :goto_2
    move-object v12, v0

    .line 160
    check-cast v12, Ljava/util/List;

    .line 161
    .line 162
    move-object v0, v12

    .line 163
    check-cast v0, Ljava/lang/Iterable;

    .line 164
    .line 165
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 170
    .line 171
    .line 172
    move-result v1

    .line 173
    if-eqz v1, :cond_a

    .line 174
    .line 175
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    check-cast v1, Lcom/friday/common/entity/ResourceEntity;

    .line 180
    .line 181
    invoke-virtual {v1}, Lcom/friday/common/entity/ResourceEntity;->getId()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v1

    .line 185
    invoke-static {v1}, Lcom/blankj/utilcode/util/FileUtils;->delete(Ljava/lang/String;)Z

    .line 186
    .line 187
    .line 188
    goto :goto_3

    .line 189
    :cond_a
    iget-object v0, p0, Lcom/friday/document/viewmodel/StudentShareViewModel$doesFileExits$2;->f:Lcom/friday/document/viewmodel/StudentShareViewModel;

    .line 190
    .line 191
    invoke-static {v0}, Lcom/friday/document/viewmodel/StudentShareViewModel;->i(Lcom/friday/document/viewmodel/StudentShareViewModel;)Lcom/friday/common/dao/ResourceDao;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    iget-object v1, p0, Lcom/friday/document/viewmodel/StudentShareViewModel$doesFileExits$2;->g:Lcom/friday/document/model/ShareFile;

    .line 196
    .line 197
    invoke-virtual {v1}, Lcom/friday/document/model/ShareFile;->getFileId()Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v1

    .line 201
    invoke-static {v11}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v2

    .line 205
    iput-object v2, p0, Lcom/friday/document/viewmodel/StudentShareViewModel$doesFileExits$2;->c:Ljava/lang/Object;

    .line 206
    .line 207
    invoke-static {v12}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v2

    .line 211
    iput-object v2, p0, Lcom/friday/document/viewmodel/StudentShareViewModel$doesFileExits$2;->d:Ljava/lang/Object;

    .line 212
    .line 213
    iput v9, p0, Lcom/friday/document/viewmodel/StudentShareViewModel$doesFileExits$2;->e:I

    .line 214
    .line 215
    const-wide/16 v2, 0x0

    .line 216
    .line 217
    const/4 v5, 0x2

    .line 218
    const/4 v6, 0x0

    .line 219
    move-object v4, p0

    .line 220
    invoke-static/range {v0 .. v6}, Lcom/friday/common/dao/ResourceDao;->U(Lcom/friday/common/dao/ResourceDao;Ljava/lang/String;JLvc/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    if-ne v0, v7, :cond_b

    .line 225
    .line 226
    goto :goto_5

    .line 227
    :cond_b
    move-object v1, v11

    .line 228
    move-object v0, v12

    .line 229
    :goto_4
    iget-object v2, p0, Lcom/friday/document/viewmodel/StudentShareViewModel$doesFileExits$2;->f:Lcom/friday/document/viewmodel/StudentShareViewModel;

    .line 230
    .line 231
    invoke-static {v2}, Lcom/friday/document/viewmodel/StudentShareViewModel;->k(Lcom/friday/document/viewmodel/StudentShareViewModel;)Lc2/g2;

    .line 232
    .line 233
    .line 234
    move-result-object v2

    .line 235
    iget-object v3, p0, Lcom/friday/document/viewmodel/StudentShareViewModel$doesFileExits$2;->g:Lcom/friday/document/model/ShareFile;

    .line 236
    .line 237
    invoke-virtual {v3}, Lcom/friday/document/model/ShareFile;->getFileId()Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v3

    .line 241
    iget-object v5, p0, Lcom/friday/document/viewmodel/StudentShareViewModel$doesFileExits$2;->f:Lcom/friday/document/viewmodel/StudentShareViewModel;

    .line 242
    .line 243
    invoke-static {v5}, Lcom/friday/document/viewmodel/StudentShareViewModel;->n(Lcom/friday/document/viewmodel/StudentShareViewModel;)J

    .line 244
    .line 245
    .line 246
    move-result-wide v5

    .line 247
    invoke-static {v1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object v1

    .line 251
    iput-object v1, p0, Lcom/friday/document/viewmodel/StudentShareViewModel$doesFileExits$2;->c:Ljava/lang/Object;

    .line 252
    .line 253
    invoke-static {v0}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    iput-object v0, p0, Lcom/friday/document/viewmodel/StudentShareViewModel$doesFileExits$2;->d:Ljava/lang/Object;

    .line 258
    .line 259
    iput v8, p0, Lcom/friday/document/viewmodel/StudentShareViewModel$doesFileExits$2;->e:I

    .line 260
    .line 261
    invoke-interface {v2, v3, v5, v6, p0}, Lc2/g2;->d(Ljava/lang/String;JLvc/c;)Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    if-ne v0, v7, :cond_6

    .line 266
    .line 267
    :goto_5
    return-object v7

    .line 268
    :cond_c
    iget-object v0, p0, Lcom/friday/document/viewmodel/StudentShareViewModel$doesFileExits$2;->g:Lcom/friday/document/model/ShareFile;

    .line 269
    .line 270
    invoke-virtual {v0}, Lcom/friday/document/model/ShareFile;->isOfficeFile()Z

    .line 271
    .line 272
    .line 273
    move-result v0

    .line 274
    if-eqz v0, :cond_d

    .line 275
    .line 276
    iget-object v0, p0, Lcom/friday/document/viewmodel/StudentShareViewModel$doesFileExits$2;->g:Lcom/friday/document/model/ShareFile;

    .line 277
    .line 278
    invoke-virtual {v0}, Lcom/friday/document/model/ShareFile;->getOthersPath()Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object v0

    .line 282
    invoke-static {v0}, Lcom/blankj/utilcode/util/FileUtils;->isFileExists(Ljava/lang/String;)Z

    .line 283
    .line 284
    .line 285
    move-result v0

    .line 286
    if-eqz v0, :cond_6

    .line 287
    .line 288
    :cond_d
    :goto_6
    invoke-static {v2}, Lxc/a;->a(Z)Ljava/lang/Boolean;

    .line 289
    .line 290
    .line 291
    move-result-object v0

    .line 292
    return-object v0
.end method
