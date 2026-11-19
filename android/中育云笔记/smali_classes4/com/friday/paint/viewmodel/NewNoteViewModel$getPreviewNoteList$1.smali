.class final Lcom/friday/paint/viewmodel/NewNoteViewModel$getPreviewNoteList$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/paint/viewmodel/NewNoteViewModel;->M()V
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
    c = "com.friday.paint.viewmodel.NewNoteViewModel$getPreviewNoteList$1"
    f = "NewNoteViewModel.kt"
    l = {
        0x76,
        0x86
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:I

.field public final synthetic f:Lcom/friday/paint/viewmodel/NewNoteViewModel;


# direct methods
.method public constructor <init>(Lcom/friday/paint/viewmodel/NewNoteViewModel;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel$getPreviewNoteList$1;->f:Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 1

    .line 1
    new-instance p1, Lcom/friday/paint/viewmodel/NewNoteViewModel$getPreviewNoteList$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel$getPreviewNoteList$1;->f:Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcom/friday/paint/viewmodel/NewNoteViewModel$getPreviewNoteList$1;-><init>(Lcom/friday/paint/viewmodel/NewNoteViewModel;Lvc/c;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/friday/paint/viewmodel/NewNoteViewModel$getPreviewNoteList$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/paint/viewmodel/NewNoteViewModel$getPreviewNoteList$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/paint/viewmodel/NewNoteViewModel$getPreviewNoteList$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/paint/viewmodel/NewNoteViewModel$getPreviewNoteList$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel$getPreviewNoteList$1;->e:I

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    const/4 v3, 0x1

    .line 9
    if-eqz v1, :cond_2

    .line 10
    .line 11
    if-eq v1, v3, :cond_1

    .line 12
    .line 13
    if-ne v1, v2, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel$getPreviewNoteList$1;->d:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Ljava/util/List;

    .line 18
    .line 19
    iget-object v0, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel$getPreviewNoteList$1;->c:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Ljava/util/List;

    .line 22
    .line 23
    :try_start_0
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    .line 25
    .line 26
    move-object v8, p0

    .line 27
    goto/16 :goto_7

    .line 28
    .line 29
    :catch_0
    move-exception v0

    .line 30
    move-object p1, v0

    .line 31
    move-object v8, p0

    .line 32
    goto/16 :goto_6

    .line 33
    .line 34
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 35
    .line 36
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 37
    .line 38
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    throw p1

    .line 42
    :cond_1
    :try_start_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 43
    .line 44
    .line 45
    move-object v8, p0

    .line 46
    goto :goto_0

    .line 47
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    :try_start_2
    iget-object p1, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel$getPreviewNoteList$1;->f:Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 51
    .line 52
    invoke-static {p1}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->k(Lcom/friday/paint/viewmodel/NewNoteViewModel;)Lcom/friday/common/dao/ResourceDao;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    iget-object p1, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel$getPreviewNoteList$1;->f:Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 57
    .line 58
    invoke-virtual {p1}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->G()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    iput v3, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel$getPreviewNoteList$1;->e:I
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 63
    .line 64
    const-wide/16 v6, 0x0

    .line 65
    .line 66
    const/4 v9, 0x2

    .line 67
    const/4 v10, 0x0

    .line 68
    move-object v8, p0

    .line 69
    :try_start_3
    invoke-static/range {v4 .. v10}, Lcom/friday/common/dao/ResourceDao;->c(Lcom/friday/common/dao/ResourceDao;Ljava/lang/String;JLvc/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    if-ne p1, v0, :cond_3

    .line 74
    .line 75
    goto/16 :goto_5

    .line 76
    .line 77
    :cond_3
    :goto_0
    check-cast p1, Ljava/util/List;

    .line 78
    .line 79
    move-object v1, p1

    .line 80
    check-cast v1, Ljava/util/Collection;

    .line 81
    .line 82
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    const/16 v4, 0xa

    .line 87
    .line 88
    if-nez v1, :cond_4

    .line 89
    .line 90
    sget-object v1, Lcom/friday/common/helper/NotePageOrder;->a:Lcom/friday/common/helper/NotePageOrder;

    .line 91
    .line 92
    invoke-virtual {v1, p1}, Lcom/friday/common/helper/NotePageOrder;->b(Ljava/util/List;)Ljava/util/List;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    check-cast v1, Ljava/lang/Iterable;

    .line 97
    .line 98
    new-instance v5, Ljava/util/ArrayList;

    .line 99
    .line 100
    invoke-static {v1, v4}, Lrc/x;->x(Ljava/lang/Iterable;I)I

    .line 101
    .line 102
    .line 103
    move-result v6

    .line 104
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 105
    .line 106
    .line 107
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 112
    .line 113
    .line 114
    move-result v6

    .line 115
    if-eqz v6, :cond_5

    .line 116
    .line 117
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v6

    .line 121
    check-cast v6, Lcom/friday/common/entity/ResourceEntity;

    .line 122
    .line 123
    new-instance v7, Ljava/io/File;

    .line 124
    .line 125
    invoke-virtual {v6}, Lcom/friday/common/entity/ResourceEntity;->getPageName()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v6

    .line 129
    invoke-direct {v7, v6}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    invoke-interface {v5, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    goto :goto_1

    .line 136
    :catch_1
    move-exception v0

    .line 137
    :goto_2
    move-object p1, v0

    .line 138
    goto/16 :goto_6

    .line 139
    .line 140
    :cond_4
    invoke-static {}, Lrc/w;->n()Ljava/util/List;

    .line 141
    .line 142
    .line 143
    move-result-object v5

    .line 144
    :cond_5
    check-cast v5, Ljava/lang/Iterable;

    .line 145
    .line 146
    iget-object v1, v8, Lcom/friday/paint/viewmodel/NewNoteViewModel$getPreviewNoteList$1;->f:Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 147
    .line 148
    new-instance v6, Ljava/util/ArrayList;

    .line 149
    .line 150
    invoke-static {v5, v4}, Lrc/x;->x(Ljava/lang/Iterable;I)I

    .line 151
    .line 152
    .line 153
    move-result v4

    .line 154
    invoke-direct {v6, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 155
    .line 156
    .line 157
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 158
    .line 159
    .line 160
    move-result-object v4

    .line 161
    const/4 v5, 0x0

    .line 162
    move v7, v5

    .line 163
    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 164
    .line 165
    .line 166
    move-result v9

    .line 167
    if-eqz v9, :cond_8

    .line 168
    .line 169
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v9

    .line 173
    add-int/lit8 v10, v7, 0x1

    .line 174
    .line 175
    if-gez v7, :cond_6

    .line 176
    .line 177
    invoke-static {}, Lrc/w;->w()V

    .line 178
    .line 179
    .line 180
    :cond_6
    check-cast v9, Ljava/io/File;

    .line 181
    .line 182
    invoke-virtual {v9}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v9

    .line 186
    invoke-static {v9}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v1, v9}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->J(Ljava/lang/String;)Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v11

    .line 193
    new-instance v12, Ljava/lang/StringBuilder;

    .line 194
    .line 195
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 196
    .line 197
    .line 198
    const-string v13, "\u9875\u9762NewNoteViewModel.kt -> getPreviewNoteList, \u67e5\u627e\u5230\u672c\u5730\u5feb\u7167"

    .line 199
    .line 200
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 201
    .line 202
    .line 203
    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 204
    .line 205
    .line 206
    const-string v13, "\u53ca\u7b14\u8bb0\u7f29\u7565\u56fe\u5730\u5740"

    .line 207
    .line 208
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 209
    .line 210
    .line 211
    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 212
    .line 213
    .line 214
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v12

    .line 218
    filled-new-array {v12}, [Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v12

    .line 222
    invoke-static {v12}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    .line 223
    .line 224
    .line 225
    new-instance v12, Lcom/friday/paint/model/NoteListEntity;

    .line 226
    .line 227
    if-nez v7, :cond_7

    .line 228
    .line 229
    move v7, v3

    .line 230
    goto :goto_4

    .line 231
    :cond_7
    move v7, v5

    .line 232
    :goto_4
    invoke-direct {v12, v11, v7, v5, v9}, Lcom/friday/paint/model/NoteListEntity;-><init>(Ljava/lang/String;ZZLjava/lang/String;)V

    .line 233
    .line 234
    .line 235
    invoke-interface {v6, v12}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    move v7, v10

    .line 239
    goto :goto_3

    .line 240
    :cond_8
    iget-object v1, v8, Lcom/friday/paint/viewmodel/NewNoteViewModel$getPreviewNoteList$1;->f:Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 241
    .line 242
    invoke-static {v1}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->p(Lcom/friday/paint/viewmodel/NewNoteViewModel;)Lvd/k;

    .line 243
    .line 244
    .line 245
    move-result-object v1

    .line 246
    invoke-static {p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object p1

    .line 250
    iput-object p1, v8, Lcom/friday/paint/viewmodel/NewNoteViewModel$getPreviewNoteList$1;->c:Ljava/lang/Object;

    .line 251
    .line 252
    invoke-static {v6}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object p1

    .line 256
    iput-object p1, v8, Lcom/friday/paint/viewmodel/NewNoteViewModel$getPreviewNoteList$1;->d:Ljava/lang/Object;

    .line 257
    .line 258
    iput v2, v8, Lcom/friday/paint/viewmodel/NewNoteViewModel$getPreviewNoteList$1;->e:I

    .line 259
    .line 260
    invoke-interface {v1, v6, p0}, Lvd/k;->emit(Ljava/lang/Object;Lvc/c;)Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object p1
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    .line 264
    if-ne p1, v0, :cond_9

    .line 265
    .line 266
    :goto_5
    return-object v0

    .line 267
    :catch_2
    move-exception v0

    .line 268
    move-object v8, p0

    .line 269
    goto/16 :goto_2

    .line 270
    .line 271
    :goto_6
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 272
    .line 273
    .line 274
    :cond_9
    :goto_7
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 275
    .line 276
    return-object p1
.end method
