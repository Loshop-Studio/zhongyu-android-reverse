# RE note 本类字节码直接引用的读写或显示接口包括JSON。
.class final Lcom/friday/main/viewmodel/FullScreenViewModel$getPreviewList$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/main/viewmodel/FullScreenViewModel;->k(Lcom/friday/common/entity/FileEntity;)V
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
    c = "com.friday.main.viewmodel.FullScreenViewModel$getPreviewList$1"
    f = "FullScreenViewModel.kt"
    l = {
        0x29
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public final synthetic d:Lcom/friday/main/viewmodel/FullScreenViewModel;

.field public final synthetic e:Lcom/friday/common/entity/FileEntity;


# direct methods
.method public constructor <init>(Lcom/friday/main/viewmodel/FullScreenViewModel;Lcom/friday/common/entity/FileEntity;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/main/viewmodel/FullScreenViewModel$getPreviewList$1;->d:Lcom/friday/main/viewmodel/FullScreenViewModel;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/main/viewmodel/FullScreenViewModel$getPreviewList$1;->e:Lcom/friday/common/entity/FileEntity;

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
    new-instance p1, Lcom/friday/main/viewmodel/FullScreenViewModel$getPreviewList$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/main/viewmodel/FullScreenViewModel$getPreviewList$1;->d:Lcom/friday/main/viewmodel/FullScreenViewModel;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/friday/main/viewmodel/FullScreenViewModel$getPreviewList$1;->e:Lcom/friday/common/entity/FileEntity;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/friday/main/viewmodel/FullScreenViewModel$getPreviewList$1;-><init>(Lcom/friday/main/viewmodel/FullScreenViewModel;Lcom/friday/common/entity/FileEntity;Lvc/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/friday/main/viewmodel/FullScreenViewModel$getPreviewList$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/main/viewmodel/FullScreenViewModel$getPreviewList$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/main/viewmodel/FullScreenViewModel$getPreviewList$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/main/viewmodel/FullScreenViewModel$getPreviewList$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

# RE I/O 读取 JSON（Gson.fromJson）。
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/friday/main/viewmodel/FullScreenViewModel$getPreviewList$1;->c:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    move-object v7, p0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 18
    .line 19
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 20
    .line 21
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    throw p1

    .line 25
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iget-object p1, p0, Lcom/friday/main/viewmodel/FullScreenViewModel$getPreviewList$1;->d:Lcom/friday/main/viewmodel/FullScreenViewModel;

    .line 29
    .line 30
    invoke-static {p1}, Lcom/friday/main/viewmodel/FullScreenViewModel;->f(Lcom/friday/main/viewmodel/FullScreenViewModel;)Lcom/friday/common/dao/ResourceDao;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    iget-object p1, p0, Lcom/friday/main/viewmodel/FullScreenViewModel$getPreviewList$1;->e:Lcom/friday/common/entity/FileEntity;

    .line 35
    .line 36
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    iput v2, p0, Lcom/friday/main/viewmodel/FullScreenViewModel$getPreviewList$1;->c:I

    .line 41
    .line 42
    const-wide/16 v5, 0x0

    .line 43
    .line 44
    const/4 v8, 0x2

    .line 45
    const/4 v9, 0x0

    .line 46
    move-object v7, p0

    .line 47
    invoke-static/range {v3 .. v9}, Lcom/friday/common/dao/ResourceDao;->c(Lcom/friday/common/dao/ResourceDao;Ljava/lang/String;JLvc/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    if-ne p1, v0, :cond_2

    .line 52
    .line 53
    return-object v0

    .line 54
    :cond_2
    :goto_0
    check-cast p1, Ljava/util/List;

    .line 55
    .line 56
    move-object v0, p1

    .line 57
    check-cast v0, Ljava/util/Collection;

    .line 58
    .line 59
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-nez v0, :cond_6

    .line 64
    .line 65
    iget-object v0, v7, Lcom/friday/main/viewmodel/FullScreenViewModel$getPreviewList$1;->d:Lcom/friday/main/viewmodel/FullScreenViewModel;

    .line 66
    .line 67
    invoke-virtual {v0}, Lcom/friday/main/viewmodel/FullScreenViewModel;->h()Landroidx/lifecycle/MutableLiveData;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    check-cast p1, Ljava/lang/Iterable;

    .line 72
    .line 73
    new-instance v1, Ljava/util/HashSet;

    .line 74
    .line 75
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 76
    .line 77
    .line 78
    new-instance v2, Ljava/util/ArrayList;

    .line 79
    .line 80
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 81
    .line 82
    .line 83
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    :cond_3
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 88
    .line 89
    .line 90
    move-result v3

    .line 91
    if-eqz v3, :cond_4

    .line 92
    .line 93
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    move-object v4, v3

    .line 98
    check-cast v4, Lcom/friday/common/entity/ResourceEntity;

    .line 99
    .line 100
    invoke-virtual {v4}, Lcom/friday/common/entity/ResourceEntity;->getPageName()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v4

    .line 104
    invoke-virtual {v1, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v4

    .line 108
    if-eqz v4, :cond_3

    .line 109
    .line 110
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_4
    new-instance p1, Lcom/friday/main/viewmodel/FullScreenViewModel$getPreviewList$1$a;

    .line 115
    .line 116
    invoke-direct {p1}, Lcom/friday/main/viewmodel/FullScreenViewModel$getPreviewList$1$a;-><init>()V

    .line 117
    .line 118
    .line 119
    invoke-static {v2, p1}, Lrc/g0;->P0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    check-cast p1, Ljava/lang/Iterable;

    .line 124
    .line 125
    new-instance v1, Ljava/util/ArrayList;

    .line 126
    .line 127
    const/16 v2, 0xa

    .line 128
    .line 129
    invoke-static {p1, v2}, Lrc/x;->x(Ljava/lang/Iterable;I)I

    .line 130
    .line 131
    .line 132
    move-result v2

    .line 133
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 134
    .line 135
    .line 136
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 141
    .line 142
    .line 143
    move-result v2

    .line 144
    if-eqz v2, :cond_5

    .line 145
    .line 146
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    check-cast v2, Lcom/friday/common/entity/ResourceEntity;

    .line 151
    .line 152
    new-instance v3, Ljava/io/File;

    .line 153
    .line 154
    invoke-virtual {v2}, Lcom/friday/common/entity/ResourceEntity;->getPageName()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    invoke-direct {v3, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    goto :goto_2

    .line 165
    :cond_5
    invoke-virtual {v0, v1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    goto/16 :goto_4

    .line 169
    .line 170
    :cond_6
    new-instance p1, Ljava/util/ArrayList;

    .line 171
    .line 172
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 173
    .line 174
    .line 175
    iget-object v0, v7, Lcom/friday/main/viewmodel/FullScreenViewModel$getPreviewList$1;->e:Lcom/friday/common/entity/FileEntity;

    .line 176
    .line 177
    invoke-virtual {v0}, Lcom/friday/common/entity/FileEntity;->getLocalFileUrl()Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    .line 182
    .line 183
    new-instance v3, Ljava/lang/StringBuilder;

    .line 184
    .line 185
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    const-string v0, "index.json"

    .line 195
    .line 196
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    invoke-static {v0}, Lcom/blankj/utilcode/util/FileUtils;->isFileExists(Ljava/lang/String;)Z

    .line 204
    .line 205
    .line 206
    move-result v1

    .line 207
    if-nez v1, :cond_7

    .line 208
    .line 209
    iget-object v1, v7, Lcom/friday/main/viewmodel/FullScreenViewModel$getPreviewList$1;->d:Lcom/friday/main/viewmodel/FullScreenViewModel;

    .line 210
    .line 211
    invoke-virtual {v1}, Lcom/friday/main/viewmodel/FullScreenViewModel;->h()Landroidx/lifecycle/MutableLiveData;

    .line 212
    .line 213
    .line 214
    move-result-object v1

    .line 215
    invoke-static {}, Lrc/w;->n()Ljava/util/List;

    .line 216
    .line 217
    .line 218
    move-result-object v3

    .line 219
    invoke-virtual {v1, v3}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 220
    .line 221
    .line 222
    :cond_7
    new-instance v1, Ljava/io/File;

    .line 223
    .line 224
    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    const/4 v0, 0x0

    .line 228
    invoke-static {v1, v0, v2, v0}, Lcd/g;->e(Ljava/io/File;Ljava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    new-instance v1, Lcom/friday/main/viewmodel/FullScreenViewModel$getPreviewList$1$b;

    .line 233
    .line 234
    invoke-direct {v1}, Lcom/friday/main/viewmodel/FullScreenViewModel$getPreviewList$1$b;-><init>()V

    .line 235
    .line 236
    .line 237
    invoke-virtual {v1}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    .line 238
    .line 239
    .line 240
    move-result-object v1

    .line 241
    new-instance v2, Lcom/google/gson/Gson;

    .line 242
    .line 243
    invoke-direct {v2}, Lcom/google/gson/Gson;-><init>()V

    .line 244
    .line 245
    .line 246
    invoke-virtual {v2, v0, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    check-cast v0, Ljava/util/ArrayList;

    .line 251
    .line 252
    if-eqz v0, :cond_9

    .line 253
    .line 254
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 255
    .line 256
    .line 257
    move-result v1

    .line 258
    const/4 v2, 0x0

    .line 259
    :cond_8
    :goto_3
    if-ge v2, v1, :cond_9

    .line 260
    .line 261
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v3

    .line 265
    add-int/lit8 v2, v2, 0x1

    .line 266
    .line 267
    check-cast v3, Ljava/lang/String;

    .line 268
    .line 269
    invoke-static {v3}, Lcom/blankj/utilcode/util/FileUtils;->isFileExists(Ljava/lang/String;)Z

    .line 270
    .line 271
    .line 272
    move-result v4

    .line 273
    if-eqz v4, :cond_8

    .line 274
    .line 275
    new-instance v4, Ljava/io/File;

    .line 276
    .line 277
    invoke-direct {v4, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 281
    .line 282
    .line 283
    goto :goto_3

    .line 284
    :cond_9
    iget-object v0, v7, Lcom/friday/main/viewmodel/FullScreenViewModel$getPreviewList$1;->d:Lcom/friday/main/viewmodel/FullScreenViewModel;

    .line 285
    .line 286
    invoke-virtual {v0}, Lcom/friday/main/viewmodel/FullScreenViewModel;->h()Landroidx/lifecycle/MutableLiveData;

    .line 287
    .line 288
    .line 289
    move-result-object v0

    .line 290
    invoke-virtual {v0, p1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 291
    .line 292
    .line 293
    :goto_4
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 294
    .line 295
    return-object p1
.end method
