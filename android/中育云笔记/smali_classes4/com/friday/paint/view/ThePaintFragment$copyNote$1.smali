.class final Lcom/friday/paint/view/ThePaintFragment$copyNote$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/paint/view/ThePaintFragment;->copyNote(I)V
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
    c = "com.friday.paint.view.ThePaintFragment$copyNote$1"
    f = "ThePaintFragment.kt"
    l = {
        0x21f,
        0x224,
        0x22f,
        0x231
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:I

.field public final synthetic g:Lcom/friday/paint/view/ThePaintFragment;

.field public final synthetic h:I


# direct methods
.method public constructor <init>(Lcom/friday/paint/view/ThePaintFragment;ILvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/paint/view/ThePaintFragment$copyNote$1;->g:Lcom/friday/paint/view/ThePaintFragment;

    .line 2
    .line 3
    iput p2, p0, Lcom/friday/paint/view/ThePaintFragment$copyNote$1;->h:I

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
    new-instance p1, Lcom/friday/paint/view/ThePaintFragment$copyNote$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/paint/view/ThePaintFragment$copyNote$1;->g:Lcom/friday/paint/view/ThePaintFragment;

    .line 4
    .line 5
    iget v1, p0, Lcom/friday/paint/view/ThePaintFragment$copyNote$1;->h:I

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/friday/paint/view/ThePaintFragment$copyNote$1;-><init>(Lcom/friday/paint/view/ThePaintFragment;ILvc/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/friday/paint/view/ThePaintFragment$copyNote$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/paint/view/ThePaintFragment$copyNote$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/paint/view/ThePaintFragment$copyNote$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/paint/view/ThePaintFragment$copyNote$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/friday/paint/view/ThePaintFragment$copyNote$1;->f:I

    .line 6
    .line 7
    const/4 v2, 0x4

    .line 8
    const/4 v3, 0x3

    .line 9
    const/4 v4, 0x2

    .line 10
    const/4 v5, 0x0

    .line 11
    const/4 v6, 0x1

    .line 12
    if-eqz v1, :cond_4

    .line 13
    .line 14
    if-eq v1, v6, :cond_3

    .line 15
    .line 16
    if-eq v1, v4, :cond_2

    .line 17
    .line 18
    if-eq v1, v3, :cond_1

    .line 19
    .line 20
    if-ne v1, v2, :cond_0

    .line 21
    .line 22
    iget-object v0, p0, Lcom/friday/paint/view/ThePaintFragment$copyNote$1;->e:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Ljava/lang/String;

    .line 25
    .line 26
    iget-object v0, p0, Lcom/friday/paint/view/ThePaintFragment$copyNote$1;->d:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, Ljava/lang/String;

    .line 29
    .line 30
    iget-object v0, p0, Lcom/friday/paint/view/ThePaintFragment$copyNote$1;->c:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, Lcom/friday/paint/model/PaintEntity;

    .line 33
    .line 34
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    goto/16 :goto_4

    .line 38
    .line 39
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 40
    .line 41
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 42
    .line 43
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    throw p1

    .line 47
    :cond_1
    iget-object v1, p0, Lcom/friday/paint/view/ThePaintFragment$copyNote$1;->e:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v1, Ljava/lang/String;

    .line 50
    .line 51
    iget-object v3, p0, Lcom/friday/paint/view/ThePaintFragment$copyNote$1;->d:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v3, Ljava/lang/String;

    .line 54
    .line 55
    iget-object v4, p0, Lcom/friday/paint/view/ThePaintFragment$copyNote$1;->c:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v4, Lcom/friday/paint/model/PaintEntity;

    .line 58
    .line 59
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    goto/16 :goto_2

    .line 63
    .line 64
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_3
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_4
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    iget-object p1, p0, Lcom/friday/paint/view/ThePaintFragment$copyNote$1;->g:Lcom/friday/paint/view/ThePaintFragment;

    .line 76
    .line 77
    invoke-virtual {p1}, Lcom/friday/paint/view/ThePaintFragment;->u0()Lcom/friday/paint/adapter/ThumbnailListAdapter;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-virtual {p1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getItemCount()I

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    const/16 v1, 0x63

    .line 86
    .line 87
    if-lt p1, v1, :cond_6

    .line 88
    .line 89
    invoke-static {}, Lsd/r0;->c()Lsd/t1;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    new-instance v1, Lcom/friday/paint/view/ThePaintFragment$copyNote$1$1;

    .line 94
    .line 95
    invoke-direct {v1, v5}, Lcom/friday/paint/view/ThePaintFragment$copyNote$1$1;-><init>(Lvc/c;)V

    .line 96
    .line 97
    .line 98
    iput v6, p0, Lcom/friday/paint/view/ThePaintFragment$copyNote$1;->f:I

    .line 99
    .line 100
    invoke-static {p1, v1, p0}, Lsd/f;->g(Lkotlin/coroutines/d;Lhd/p;Lvc/c;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    if-ne p1, v0, :cond_5

    .line 105
    .line 106
    goto/16 :goto_3

    .line 107
    .line 108
    :cond_5
    :goto_0
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 109
    .line 110
    return-object p1

    .line 111
    :cond_6
    invoke-static {}, Lsd/r0;->c()Lsd/t1;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    new-instance v1, Lcom/friday/paint/view/ThePaintFragment$copyNote$1$2;

    .line 116
    .line 117
    iget-object v7, p0, Lcom/friday/paint/view/ThePaintFragment$copyNote$1;->g:Lcom/friday/paint/view/ThePaintFragment;

    .line 118
    .line 119
    invoke-direct {v1, v7, v5}, Lcom/friday/paint/view/ThePaintFragment$copyNote$1$2;-><init>(Lcom/friday/paint/view/ThePaintFragment;Lvc/c;)V

    .line 120
    .line 121
    .line 122
    iput v4, p0, Lcom/friday/paint/view/ThePaintFragment$copyNote$1;->f:I

    .line 123
    .line 124
    invoke-static {p1, v1, p0}, Lsd/f;->g(Lkotlin/coroutines/d;Lhd/p;Lvc/c;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    if-ne p1, v0, :cond_7

    .line 129
    .line 130
    goto/16 :goto_3

    .line 131
    .line 132
    :cond_7
    :goto_1
    iget-object p1, p0, Lcom/friday/paint/view/ThePaintFragment$copyNote$1;->g:Lcom/friday/paint/view/ThePaintFragment;

    .line 133
    .line 134
    invoke-virtual {p1}, Lcom/friday/paint/view/ThePaintFragment;->t0()Lcom/friday/paint/adapter/NoteFragmentStateAdapter;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    invoke-virtual {p1}, Lcom/friday/paint/adapter/NoteFragmentStateAdapter;->getData()Ljava/util/List;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    iget v1, p0, Lcom/friday/paint/view/ThePaintFragment$copyNote$1;->h:I

    .line 143
    .line 144
    sub-int/2addr v1, v6

    .line 145
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    move-object v4, p1

    .line 150
    check-cast v4, Lcom/friday/paint/model/PaintEntity;

    .line 151
    .line 152
    invoke-virtual {v4}, Lcom/friday/paint/model/PaintEntity;->getPath()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    invoke-static {}, Lcom/blankj/utilcode/util/PathUtils;->getExternalAppDocumentsPath()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    sget-object v6, Ljava/io/File;->separator:Ljava/lang/String;

    .line 161
    .line 162
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 163
    .line 164
    .line 165
    move-result-wide v7

    .line 166
    new-instance v9, Ljava/lang/StringBuilder;

    .line 167
    .line 168
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v9, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    invoke-static {v1}, Lcom/blankj/utilcode/util/FileUtils;->createOrExistsDir(Ljava/lang/String;)Z

    .line 185
    .line 186
    .line 187
    move-result v6

    .line 188
    if-eqz v6, :cond_8

    .line 189
    .line 190
    invoke-static {p1, v1}, Lcom/blankj/utilcode/util/FileUtils;->copy(Ljava/lang/String;Ljava/lang/String;)Z

    .line 191
    .line 192
    .line 193
    :cond_8
    sget-object v6, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 194
    .line 195
    invoke-virtual {v6}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 196
    .line 197
    .line 198
    move-result-object v6

    .line 199
    invoke-virtual {v6}, Lcom/friday/common/helper/b;->v()Z

    .line 200
    .line 201
    .line 202
    move-result v6

    .line 203
    if-eqz v6, :cond_a

    .line 204
    .line 205
    iget-object v6, p0, Lcom/friday/paint/view/ThePaintFragment$copyNote$1;->g:Lcom/friday/paint/view/ThePaintFragment;

    .line 206
    .line 207
    invoke-static {v4}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v7

    .line 211
    iput-object v7, p0, Lcom/friday/paint/view/ThePaintFragment$copyNote$1;->c:Ljava/lang/Object;

    .line 212
    .line 213
    invoke-static {p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v7

    .line 217
    iput-object v7, p0, Lcom/friday/paint/view/ThePaintFragment$copyNote$1;->d:Ljava/lang/Object;

    .line 218
    .line 219
    iput-object v1, p0, Lcom/friday/paint/view/ThePaintFragment$copyNote$1;->e:Ljava/lang/Object;

    .line 220
    .line 221
    iput v3, p0, Lcom/friday/paint/view/ThePaintFragment$copyNote$1;->f:I

    .line 222
    .line 223
    invoke-static {v6, p1, v1, p0}, Lcom/friday/paint/view/ThePaintFragment;->c0(Lcom/friday/paint/view/ThePaintFragment;Ljava/lang/String;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v3

    .line 227
    if-ne v3, v0, :cond_9

    .line 228
    .line 229
    goto :goto_3

    .line 230
    :cond_9
    move-object v3, p1

    .line 231
    :goto_2
    move-object p1, v3

    .line 232
    :cond_a
    invoke-static {}, Lsd/r0;->c()Lsd/t1;

    .line 233
    .line 234
    .line 235
    move-result-object v3

    .line 236
    new-instance v6, Lcom/friday/paint/view/ThePaintFragment$copyNote$1$3;

    .line 237
    .line 238
    iget-object v7, p0, Lcom/friday/paint/view/ThePaintFragment$copyNote$1;->g:Lcom/friday/paint/view/ThePaintFragment;

    .line 239
    .line 240
    iget v8, p0, Lcom/friday/paint/view/ThePaintFragment$copyNote$1;->h:I

    .line 241
    .line 242
    invoke-direct {v6, v7, v8, v1, v5}, Lcom/friday/paint/view/ThePaintFragment$copyNote$1$3;-><init>(Lcom/friday/paint/view/ThePaintFragment;ILjava/lang/String;Lvc/c;)V

    .line 243
    .line 244
    .line 245
    invoke-static {v4}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v4

    .line 249
    iput-object v4, p0, Lcom/friday/paint/view/ThePaintFragment$copyNote$1;->c:Ljava/lang/Object;

    .line 250
    .line 251
    invoke-static {p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object p1

    .line 255
    iput-object p1, p0, Lcom/friday/paint/view/ThePaintFragment$copyNote$1;->d:Ljava/lang/Object;

    .line 256
    .line 257
    invoke-static {v1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object p1

    .line 261
    iput-object p1, p0, Lcom/friday/paint/view/ThePaintFragment$copyNote$1;->e:Ljava/lang/Object;

    .line 262
    .line 263
    iput v2, p0, Lcom/friday/paint/view/ThePaintFragment$copyNote$1;->f:I

    .line 264
    .line 265
    invoke-static {v3, v6, p0}, Lsd/f;->g(Lkotlin/coroutines/d;Lhd/p;Lvc/c;)Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object p1

    .line 269
    if-ne p1, v0, :cond_b

    .line 270
    .line 271
    :goto_3
    return-object v0

    .line 272
    :cond_b
    :goto_4
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 273
    .line 274
    return-object p1
.end method
