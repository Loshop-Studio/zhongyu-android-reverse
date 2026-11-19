.class final Lcom/friday/document/view/NewestPreviewFragment$onClick$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/view/NewestPreviewFragment;->onClick(Landroid/view/View;)V
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
    c = "com.friday.document.view.NewestPreviewFragment$onClick$2"
    f = "NewestPreviewFragment.kt"
    l = {
        0xf8,
        0x106
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;

.field public g:I

.field public h:I

.field public final synthetic i:Lcom/friday/document/view/NewestPreviewFragment;


# direct methods
.method public constructor <init>(Lcom/friday/document/view/NewestPreviewFragment;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/view/NewestPreviewFragment$onClick$2;->i:Lcom/friday/document/view/NewestPreviewFragment;

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
    new-instance p1, Lcom/friday/document/view/NewestPreviewFragment$onClick$2;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/document/view/NewestPreviewFragment$onClick$2;->i:Lcom/friday/document/view/NewestPreviewFragment;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcom/friday/document/view/NewestPreviewFragment$onClick$2;-><init>(Lcom/friday/document/view/NewestPreviewFragment;Lvc/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/friday/document/view/NewestPreviewFragment$onClick$2;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/view/NewestPreviewFragment$onClick$2;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/document/view/NewestPreviewFragment$onClick$2;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/document/view/NewestPreviewFragment$onClick$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v1, p0, Lcom/friday/document/view/NewestPreviewFragment$onClick$2;->h:I

    .line 6
    .line 7
    const-string v2, "\u70b9\u51fb\u4e8b\u4ef6\uff1aFabEdit->\u6587\u4ef6\u672a\u4e0b\u8f7d\u6210\u529f"

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x2

    .line 11
    const/4 v5, 0x1

    .line 12
    if-eqz v1, :cond_2

    .line 13
    .line 14
    if-eq v1, v5, :cond_1

    .line 15
    .line 16
    if-ne v1, v4, :cond_0

    .line 17
    .line 18
    iget-object v0, p0, Lcom/friday/document/view/NewestPreviewFragment$onClick$2;->f:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Lcom/friday/common/entity/FileEntity;

    .line 21
    .line 22
    iget-object v1, p0, Lcom/friday/document/view/NewestPreviewFragment$onClick$2;->e:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v1, Lcom/friday/document/view/NewestPreviewFragment;

    .line 25
    .line 26
    iget-object v4, p0, Lcom/friday/document/view/NewestPreviewFragment$onClick$2;->d:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v4, Lcom/friday/common/entity/FileEntity;

    .line 29
    .line 30
    iget-object v4, p0, Lcom/friday/document/view/NewestPreviewFragment$onClick$2;->c:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v4, Lcom/friday/common/entity/FileEntity;

    .line 33
    .line 34
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    goto/16 :goto_2

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
    iget-object v0, p0, Lcom/friday/document/view/NewestPreviewFragment$onClick$2;->f:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v0, Lcom/friday/common/entity/FileEntity;

    .line 50
    .line 51
    iget-object v1, p0, Lcom/friday/document/view/NewestPreviewFragment$onClick$2;->e:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v1, Lcom/friday/document/view/NewestPreviewFragment;

    .line 54
    .line 55
    iget-object v4, p0, Lcom/friday/document/view/NewestPreviewFragment$onClick$2;->d:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v4, Lcom/friday/common/entity/FileEntity;

    .line 58
    .line 59
    iget-object v4, p0, Lcom/friday/document/view/NewestPreviewFragment$onClick$2;->c:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v4, Lcom/friday/common/entity/FileEntity;

    .line 62
    .line 63
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    const-string p1, "\u70b9\u51fb\u4e8b\u4ef6\uff1aFabEdit->"

    .line 71
    .line 72
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    iget-object p1, p0, Lcom/friday/document/view/NewestPreviewFragment$onClick$2;->i:Lcom/friday/document/view/NewestPreviewFragment;

    .line 80
    .line 81
    invoke-static {p1}, Lcom/friday/document/view/NewestPreviewFragment;->H(Lcom/friday/document/view/NewestPreviewFragment;)Lcom/friday/document/viewmodel/NewestViewModel;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    invoke-virtual {p1}, Lcom/friday/document/viewmodel/BaseFileViewModel;->W()Lcom/friday/common/entity/FileEntity;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    if-eqz p1, :cond_9

    .line 90
    .line 91
    iget-object v1, p0, Lcom/friday/document/view/NewestPreviewFragment$onClick$2;->i:Lcom/friday/document/view/NewestPreviewFragment;

    .line 92
    .line 93
    const-string v6, "6"

    .line 94
    .line 95
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getFileType()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v7

    .line 99
    invoke-static {v6, v7}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v6

    .line 103
    const/4 v7, 0x0

    .line 104
    if-eqz v6, :cond_5

    .line 105
    .line 106
    invoke-static {v1}, Lcom/friday/document/view/NewestPreviewFragment;->H(Lcom/friday/document/view/NewestPreviewFragment;)Lcom/friday/document/viewmodel/NewestViewModel;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    invoke-static {p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v6

    .line 114
    iput-object v6, p0, Lcom/friday/document/view/NewestPreviewFragment$onClick$2;->c:Ljava/lang/Object;

    .line 115
    .line 116
    iput-object p1, p0, Lcom/friday/document/view/NewestPreviewFragment$onClick$2;->d:Ljava/lang/Object;

    .line 117
    .line 118
    iput-object v1, p0, Lcom/friday/document/view/NewestPreviewFragment$onClick$2;->e:Ljava/lang/Object;

    .line 119
    .line 120
    iput-object p1, p0, Lcom/friday/document/view/NewestPreviewFragment$onClick$2;->f:Ljava/lang/Object;

    .line 121
    .line 122
    iput v7, p0, Lcom/friday/document/view/NewestPreviewFragment$onClick$2;->g:I

    .line 123
    .line 124
    iput v5, p0, Lcom/friday/document/view/NewestPreviewFragment$onClick$2;->h:I

    .line 125
    .line 126
    invoke-virtual {v4, p1, p0}, Lcom/friday/document/viewmodel/BaseFileViewModel;->u(Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v4

    .line 130
    if-ne v4, v0, :cond_3

    .line 131
    .line 132
    goto :goto_1

    .line 133
    :cond_3
    move-object v0, p1

    .line 134
    move-object p1, v4

    .line 135
    :goto_0
    check-cast p1, Ljava/lang/Boolean;

    .line 136
    .line 137
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 138
    .line 139
    .line 140
    move-result p1

    .line 141
    if-eqz p1, :cond_4

    .line 142
    .line 143
    sget-object v4, Lcom/friday/common/helper/c;->a:Lcom/friday/common/helper/c;

    .line 144
    .line 145
    invoke-virtual {v0}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v5

    .line 149
    invoke-virtual {v0}, Lcom/friday/common/entity/FileEntity;->getParentId()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v6

    .line 153
    invoke-virtual {v0}, Lcom/friday/common/entity/FileEntity;->getFileName()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v7

    .line 157
    sget-object v8, Lcom/friday/common/entity/FromPage;->FROM_NEWEST:Lcom/friday/common/entity/FromPage;

    .line 158
    .line 159
    const/16 v12, 0x70

    .line 160
    .line 161
    const/4 v13, 0x0

    .line 162
    const/4 v9, 0x0

    .line 163
    const/4 v10, 0x0

    .line 164
    const/4 v11, 0x0

    .line 165
    invoke-static/range {v4 .. v13}, Lcom/friday/common/helper/c;->q(Lcom/friday/common/helper/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/friday/common/entity/FromPage;Ljava/lang/String;ZLjava/lang/String;ILjava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    goto/16 :goto_3

    .line 169
    .line 170
    :cond_4
    invoke-static {v1}, Lcom/friday/document/view/NewestPreviewFragment;->H(Lcom/friday/document/view/NewestPreviewFragment;)Lcom/friday/document/viewmodel/NewestViewModel;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    invoke-virtual {p1, v3}, Lcom/friday/document/viewmodel/BaseFileViewModel;->t0(Lcom/friday/common/entity/FileEntity;)V

    .line 175
    .line 176
    .line 177
    const-string p1, "\u6587\u672c\u7f13\u5b58\u88ab\u6e05\u9664\uff0c\u8bf7\u4e0b\u8f7d\u540e\u518d\u8bd5"

    .line 178
    .line 179
    invoke-static {p1}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 180
    .line 181
    .line 182
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    goto/16 :goto_3

    .line 190
    .line 191
    :cond_5
    invoke-static {v1}, Lcom/friday/document/view/NewestPreviewFragment;->H(Lcom/friday/document/view/NewestPreviewFragment;)Lcom/friday/document/viewmodel/NewestViewModel;

    .line 192
    .line 193
    .line 194
    move-result-object v5

    .line 195
    invoke-static {p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v6

    .line 199
    iput-object v6, p0, Lcom/friday/document/view/NewestPreviewFragment$onClick$2;->c:Ljava/lang/Object;

    .line 200
    .line 201
    iput-object p1, p0, Lcom/friday/document/view/NewestPreviewFragment$onClick$2;->d:Ljava/lang/Object;

    .line 202
    .line 203
    iput-object v1, p0, Lcom/friday/document/view/NewestPreviewFragment$onClick$2;->e:Ljava/lang/Object;

    .line 204
    .line 205
    iput-object p1, p0, Lcom/friday/document/view/NewestPreviewFragment$onClick$2;->f:Ljava/lang/Object;

    .line 206
    .line 207
    iput v7, p0, Lcom/friday/document/view/NewestPreviewFragment$onClick$2;->g:I

    .line 208
    .line 209
    iput v4, p0, Lcom/friday/document/view/NewestPreviewFragment$onClick$2;->h:I

    .line 210
    .line 211
    invoke-virtual {v5, p1, p0}, Lcom/friday/document/viewmodel/BaseFileViewModel;->w(Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v4

    .line 215
    if-ne v4, v0, :cond_6

    .line 216
    .line 217
    :goto_1
    return-object v0

    .line 218
    :cond_6
    move-object v0, p1

    .line 219
    move-object p1, v4

    .line 220
    :goto_2
    check-cast p1, Ljava/lang/Boolean;

    .line 221
    .line 222
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 223
    .line 224
    .line 225
    move-result p1

    .line 226
    if-eqz p1, :cond_8

    .line 227
    .line 228
    const-string p1, "1"

    .line 229
    .line 230
    invoke-virtual {v0}, Lcom/friday/common/entity/FileEntity;->getFileType()Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v1

    .line 234
    invoke-static {p1, v1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 235
    .line 236
    .line 237
    move-result p1

    .line 238
    if-eqz p1, :cond_7

    .line 239
    .line 240
    sget-object p1, Lcom/friday/common/helper/c;->a:Lcom/friday/common/helper/c;

    .line 241
    .line 242
    invoke-virtual {v0}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v1

    .line 246
    invoke-virtual {v0}, Lcom/friday/common/entity/FileEntity;->getParentId()Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v2

    .line 250
    invoke-virtual {v0}, Lcom/friday/common/entity/FileEntity;->getFileName()Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    sget-object v3, Lcom/friday/common/entity/FromPage;->FROM_NEWEST:Lcom/friday/common/entity/FromPage;

    .line 255
    .line 256
    invoke-virtual {p1, v1, v2, v0, v3}, Lcom/friday/common/helper/c;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/friday/common/entity/FromPage;)V

    .line 257
    .line 258
    .line 259
    goto :goto_3

    .line 260
    :cond_7
    const-string p1, "\u70b9\u51fb\u4e8b\u4ef6\uff1aFabEdit->\u6587\u4ef6\u4e0b\u8f7d\u6210\u529f,\u8df3\u8f6cNewNoteActivity"

    .line 261
    .line 262
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object p1

    .line 266
    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    .line 267
    .line 268
    .line 269
    sget-object p1, Lcom/friday/common/helper/c;->a:Lcom/friday/common/helper/c;

    .line 270
    .line 271
    invoke-virtual {v0}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object v1

    .line 275
    invoke-virtual {v0}, Lcom/friday/common/entity/FileEntity;->getParentId()Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object v2

    .line 279
    invoke-virtual {v0}, Lcom/friday/common/entity/FileEntity;->getFileName()Ljava/lang/String;

    .line 280
    .line 281
    .line 282
    move-result-object v0

    .line 283
    sget-object v3, Lcom/friday/common/entity/FromPage;->FROM_NEWEST:Lcom/friday/common/entity/FromPage;

    .line 284
    .line 285
    invoke-virtual {p1, v1, v2, v0, v3}, Lcom/friday/common/helper/c;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/friday/common/entity/FromPage;)V

    .line 286
    .line 287
    .line 288
    goto :goto_3

    .line 289
    :cond_8
    invoke-static {v1}, Lcom/friday/document/view/NewestPreviewFragment;->H(Lcom/friday/document/view/NewestPreviewFragment;)Lcom/friday/document/viewmodel/NewestViewModel;

    .line 290
    .line 291
    .line 292
    move-result-object p1

    .line 293
    invoke-virtual {p1, v3}, Lcom/friday/document/viewmodel/BaseFileViewModel;->t0(Lcom/friday/common/entity/FileEntity;)V

    .line 294
    .line 295
    .line 296
    const-string p1, "\u7b14\u8bb0\u7f13\u5b58\u88ab\u6e05\u9664\uff0c\u8bf7\u4e0b\u8f7d\u540e\u518d\u8bd5"

    .line 297
    .line 298
    invoke-static {p1}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 299
    .line 300
    .line 301
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move-result-object p1

    .line 305
    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    .line 306
    .line 307
    .line 308
    :cond_9
    :goto_3
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 309
    .line 310
    return-object p1
.end method
