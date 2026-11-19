.class final Lcom/friday/document/repositroy/FileRepository$clearNoteCacheInternal$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/repositroy/FileRepository;->d(Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;
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
    c = "com.friday.document.repositroy.FileRepository$clearNoteCacheInternal$2"
    f = "FileRepository.kt"
    l = {
        0x20,
        0x29,
        0x2b,
        0x2f
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:I

.field public final synthetic g:Lcom/friday/common/entity/FileEntity;

.field public final synthetic h:Lcom/friday/document/repositroy/FileRepository;


# direct methods
.method public constructor <init>(Lcom/friday/common/entity/FileEntity;Lcom/friday/document/repositroy/FileRepository;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/repositroy/FileRepository$clearNoteCacheInternal$2;->g:Lcom/friday/common/entity/FileEntity;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/document/repositroy/FileRepository$clearNoteCacheInternal$2;->h:Lcom/friday/document/repositroy/FileRepository;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 2

    .line 1
    new-instance p1, Lcom/friday/document/repositroy/FileRepository$clearNoteCacheInternal$2;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/document/repositroy/FileRepository$clearNoteCacheInternal$2;->g:Lcom/friday/common/entity/FileEntity;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/friday/document/repositroy/FileRepository$clearNoteCacheInternal$2;->h:Lcom/friday/document/repositroy/FileRepository;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/friday/document/repositroy/FileRepository$clearNoteCacheInternal$2;-><init>(Lcom/friday/common/entity/FileEntity;Lcom/friday/document/repositroy/FileRepository;Lvc/c;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/friday/document/repositroy/FileRepository$clearNoteCacheInternal$2;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/repositroy/FileRepository$clearNoteCacheInternal$2;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/document/repositroy/FileRepository$clearNoteCacheInternal$2;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/document/repositroy/FileRepository$clearNoteCacheInternal$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v7

    .line 5
    iget v0, p0, Lcom/friday/document/repositroy/FileRepository$clearNoteCacheInternal$2;->f:I

    .line 6
    .line 7
    const/4 v8, 0x4

    .line 8
    const/4 v6, 0x3

    .line 9
    const/4 v9, 0x2

    .line 10
    const/4 v1, 0x1

    .line 11
    if-eqz v0, :cond_3

    .line 12
    .line 13
    if-eq v0, v1, :cond_2

    .line 14
    .line 15
    if-eq v0, v9, :cond_1

    .line 16
    .line 17
    if-eq v0, v6, :cond_1

    .line 18
    .line 19
    if-ne v0, v8, :cond_0

    .line 20
    .line 21
    iget-object v0, p0, Lcom/friday/document/repositroy/FileRepository$clearNoteCacheInternal$2;->e:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v0, Ljava/util/List;

    .line 24
    .line 25
    iget-object v1, p0, Lcom/friday/document/repositroy/FileRepository$clearNoteCacheInternal$2;->d:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v1, Ljava/util/List;

    .line 28
    .line 29
    iget-object v1, p0, Lcom/friday/document/repositroy/FileRepository$clearNoteCacheInternal$2;->c:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v1, Ljava/lang/String;

    .line 32
    .line 33
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    goto/16 :goto_4

    .line 37
    .line 38
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 39
    .line 40
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw v0

    .line 46
    :cond_1
    iget-object v0, p0, Lcom/friday/document/repositroy/FileRepository$clearNoteCacheInternal$2;->e:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v0, Ljava/util/List;

    .line 49
    .line 50
    iget-object v1, p0, Lcom/friday/document/repositroy/FileRepository$clearNoteCacheInternal$2;->d:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v1, Ljava/util/List;

    .line 53
    .line 54
    iget-object v2, p0, Lcom/friday/document/repositroy/FileRepository$clearNoteCacheInternal$2;->c:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v2, Ljava/lang/String;

    .line 57
    .line 58
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    goto/16 :goto_2

    .line 62
    .line 63
    :cond_2
    iget-object v0, p0, Lcom/friday/document/repositroy/FileRepository$clearNoteCacheInternal$2;->e:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v0, Ljava/util/List;

    .line 66
    .line 67
    iget-object v1, p0, Lcom/friday/document/repositroy/FileRepository$clearNoteCacheInternal$2;->d:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v1, Ljava/util/List;

    .line 70
    .line 71
    iget-object v2, p0, Lcom/friday/document/repositroy/FileRepository$clearNoteCacheInternal$2;->c:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v2, Ljava/lang/String;

    .line 74
    .line 75
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    move-object v10, v0

    .line 79
    move-object v11, v1

    .line 80
    :goto_0
    move-object v1, v2

    .line 81
    goto :goto_1

    .line 82
    :cond_3
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    iget-object v0, p0, Lcom/friday/document/repositroy/FileRepository$clearNoteCacheInternal$2;->g:Lcom/friday/common/entity/FileEntity;

    .line 86
    .line 87
    invoke-virtual {v0}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    new-instance v3, Ljava/util/ArrayList;

    .line 92
    .line 93
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 94
    .line 95
    .line 96
    new-instance v0, Ljava/util/ArrayList;

    .line 97
    .line 98
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 99
    .line 100
    .line 101
    iget-object v5, p0, Lcom/friday/document/repositroy/FileRepository$clearNoteCacheInternal$2;->h:Lcom/friday/document/repositroy/FileRepository;

    .line 102
    .line 103
    iget-object v10, p0, Lcom/friday/document/repositroy/FileRepository$clearNoteCacheInternal$2;->g:Lcom/friday/common/entity/FileEntity;

    .line 104
    .line 105
    invoke-virtual {v10}, Lcom/friday/common/entity/FileEntity;->getLocalFileUrl()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v10

    .line 109
    iput-object v2, p0, Lcom/friday/document/repositroy/FileRepository$clearNoteCacheInternal$2;->c:Ljava/lang/Object;

    .line 110
    .line 111
    iput-object v3, p0, Lcom/friday/document/repositroy/FileRepository$clearNoteCacheInternal$2;->d:Ljava/lang/Object;

    .line 112
    .line 113
    iput-object v0, p0, Lcom/friday/document/repositroy/FileRepository$clearNoteCacheInternal$2;->e:Ljava/lang/Object;

    .line 114
    .line 115
    iput v1, p0, Lcom/friday/document/repositroy/FileRepository$clearNoteCacheInternal$2;->f:I

    .line 116
    .line 117
    move-object v4, v0

    .line 118
    move-object v0, v5

    .line 119
    move-object v1, v10

    .line 120
    move-object v5, p0

    .line 121
    invoke-static/range {v0 .. v5}, Lcom/friday/document/repositroy/FileRepository;->a(Lcom/friday/document/repositroy/FileRepository;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lvc/c;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    move-object v1, v4

    .line 126
    if-ne v0, v7, :cond_4

    .line 127
    .line 128
    goto/16 :goto_3

    .line 129
    .line 130
    :cond_4
    move-object v10, v1

    .line 131
    move-object v11, v3

    .line 132
    goto :goto_0

    .line 133
    :goto_1
    move-object v0, v11

    .line 134
    check-cast v0, Ljava/util/Collection;

    .line 135
    .line 136
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    if-nez v0, :cond_6

    .line 141
    .line 142
    iget-object v0, p0, Lcom/friday/document/repositroy/FileRepository$clearNoteCacheInternal$2;->h:Lcom/friday/document/repositroy/FileRepository;

    .line 143
    .line 144
    invoke-static {v0}, Lcom/friday/document/repositroy/FileRepository;->c(Lcom/friday/document/repositroy/FileRepository;)Lcom/friday/common/dao/ResourceDao;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    iput-object v1, p0, Lcom/friday/document/repositroy/FileRepository$clearNoteCacheInternal$2;->c:Ljava/lang/Object;

    .line 149
    .line 150
    invoke-static {v11}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    iput-object v2, p0, Lcom/friday/document/repositroy/FileRepository$clearNoteCacheInternal$2;->d:Ljava/lang/Object;

    .line 155
    .line 156
    iput-object v10, p0, Lcom/friday/document/repositroy/FileRepository$clearNoteCacheInternal$2;->e:Ljava/lang/Object;

    .line 157
    .line 158
    iput v9, p0, Lcom/friday/document/repositroy/FileRepository$clearNoteCacheInternal$2;->f:I

    .line 159
    .line 160
    invoke-interface {v0, v11, p0}, Lcom/friday/common/dao/ResourceDao;->O(Ljava/util/List;Lvc/c;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    if-ne v0, v7, :cond_5

    .line 165
    .line 166
    goto :goto_3

    .line 167
    :cond_5
    move-object v2, v1

    .line 168
    move-object v0, v10

    .line 169
    move-object v1, v11

    .line 170
    goto :goto_2

    .line 171
    :cond_6
    iget-object v0, p0, Lcom/friday/document/repositroy/FileRepository$clearNoteCacheInternal$2;->h:Lcom/friday/document/repositroy/FileRepository;

    .line 172
    .line 173
    invoke-static {v0}, Lcom/friday/document/repositroy/FileRepository;->c(Lcom/friday/document/repositroy/FileRepository;)Lcom/friday/common/dao/ResourceDao;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    iput-object v1, p0, Lcom/friday/document/repositroy/FileRepository$clearNoteCacheInternal$2;->c:Ljava/lang/Object;

    .line 178
    .line 179
    invoke-static {v11}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v2

    .line 183
    iput-object v2, p0, Lcom/friday/document/repositroy/FileRepository$clearNoteCacheInternal$2;->d:Ljava/lang/Object;

    .line 184
    .line 185
    iput-object v10, p0, Lcom/friday/document/repositroy/FileRepository$clearNoteCacheInternal$2;->e:Ljava/lang/Object;

    .line 186
    .line 187
    iput v6, p0, Lcom/friday/document/repositroy/FileRepository$clearNoteCacheInternal$2;->f:I

    .line 188
    .line 189
    const-wide/16 v2, 0x0

    .line 190
    .line 191
    const/4 v5, 0x2

    .line 192
    const/4 v6, 0x0

    .line 193
    move-object v4, p0

    .line 194
    invoke-static/range {v0 .. v6}, Lcom/friday/common/dao/ResourceDao;->U(Lcom/friday/common/dao/ResourceDao;Ljava/lang/String;JLvc/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    if-ne v0, v7, :cond_5

    .line 199
    .line 200
    goto :goto_3

    .line 201
    :goto_2
    iget-object v3, p0, Lcom/friday/document/repositroy/FileRepository$clearNoteCacheInternal$2;->h:Lcom/friday/document/repositroy/FileRepository;

    .line 202
    .line 203
    invoke-static {v3}, Lcom/friday/document/repositroy/FileRepository;->b(Lcom/friday/document/repositroy/FileRepository;)Lcom/friday/common/dao/FileDao;

    .line 204
    .line 205
    .line 206
    move-result-object v3

    .line 207
    invoke-static {v2}, Lrc/v;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 208
    .line 209
    .line 210
    move-result-object v5

    .line 211
    invoke-static {v2}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v2

    .line 215
    iput-object v2, p0, Lcom/friday/document/repositroy/FileRepository$clearNoteCacheInternal$2;->c:Ljava/lang/Object;

    .line 216
    .line 217
    invoke-static {v1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v1

    .line 221
    iput-object v1, p0, Lcom/friday/document/repositroy/FileRepository$clearNoteCacheInternal$2;->d:Ljava/lang/Object;

    .line 222
    .line 223
    iput-object v0, p0, Lcom/friday/document/repositroy/FileRepository$clearNoteCacheInternal$2;->e:Ljava/lang/Object;

    .line 224
    .line 225
    iput v8, p0, Lcom/friday/document/repositroy/FileRepository$clearNoteCacheInternal$2;->f:I

    .line 226
    .line 227
    invoke-interface {v3, v5, p0}, Lcom/friday/common/dao/FileDao;->z(Ljava/util/List;Lvc/c;)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v1

    .line 231
    if-ne v1, v7, :cond_7

    .line 232
    .line 233
    :goto_3
    return-object v7

    .line 234
    :cond_7
    :goto_4
    check-cast v0, Ljava/lang/Iterable;

    .line 235
    .line 236
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 237
    .line 238
    .line 239
    move-result-object v0

    .line 240
    :cond_8
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 241
    .line 242
    .line 243
    move-result v1

    .line 244
    if-eqz v1, :cond_9

    .line 245
    .line 246
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v1

    .line 250
    check-cast v1, Ljava/io/File;

    .line 251
    .line 252
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 253
    .line 254
    .line 255
    move-result v2

    .line 256
    if-eqz v2, :cond_8

    .line 257
    .line 258
    invoke-static {v1}, Lcom/blankj/utilcode/util/FileUtils;->delete(Ljava/io/File;)Z

    .line 259
    .line 260
    .line 261
    goto :goto_5

    .line 262
    :cond_9
    sget-object v0, Lqc/q;->a:Lqc/q;

    .line 263
    .line 264
    return-object v0
.end method
