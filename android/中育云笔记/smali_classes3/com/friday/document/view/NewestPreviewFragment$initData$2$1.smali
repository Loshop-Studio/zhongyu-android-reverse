.class final Lcom/friday/document/view/NewestPreviewFragment$initData$2$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/view/NewestPreviewFragment;->initData()V
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
    c = "com.friday.document.view.NewestPreviewFragment$initData$2$1"
    f = "NewestPreviewFragment.kt"
    l = {
        0x4a,
        0x4e,
        0x55,
        0x61,
        0x69
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:I

.field public f:I

.field public final synthetic g:Lcom/friday/common/entity/FileEntity;

.field public final synthetic h:Lcom/friday/document/view/NewestPreviewFragment;


# direct methods
.method public constructor <init>(Lcom/friday/common/entity/FileEntity;Lcom/friday/document/view/NewestPreviewFragment;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/view/NewestPreviewFragment$initData$2$1;->g:Lcom/friday/common/entity/FileEntity;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/document/view/NewestPreviewFragment$initData$2$1;->h:Lcom/friday/document/view/NewestPreviewFragment;

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
    new-instance p1, Lcom/friday/document/view/NewestPreviewFragment$initData$2$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/document/view/NewestPreviewFragment$initData$2$1;->g:Lcom/friday/common/entity/FileEntity;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/friday/document/view/NewestPreviewFragment$initData$2$1;->h:Lcom/friday/document/view/NewestPreviewFragment;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/friday/document/view/NewestPreviewFragment$initData$2$1;-><init>(Lcom/friday/common/entity/FileEntity;Lcom/friday/document/view/NewestPreviewFragment;Lvc/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/friday/document/view/NewestPreviewFragment$initData$2$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/view/NewestPreviewFragment$initData$2$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/document/view/NewestPreviewFragment$initData$2$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/document/view/NewestPreviewFragment$initData$2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/friday/document/view/NewestPreviewFragment$initData$2$1;->f:I

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x5

    .line 9
    const/4 v4, 0x4

    .line 10
    const/4 v5, 0x3

    .line 11
    const/4 v6, 0x2

    .line 12
    const/4 v7, 0x1

    .line 13
    if-eqz v1, :cond_5

    .line 14
    .line 15
    if-eq v1, v7, :cond_4

    .line 16
    .line 17
    if-eq v1, v6, :cond_3

    .line 18
    .line 19
    if-eq v1, v5, :cond_2

    .line 20
    .line 21
    if-eq v1, v4, :cond_1

    .line 22
    .line 23
    if-ne v1, v3, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 27
    .line 28
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 29
    .line 30
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    throw p1

    .line 34
    :cond_1
    iget-object v0, p0, Lcom/friday/document/view/NewestPreviewFragment$initData$2$1;->c:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v0, Ljava/lang/String;

    .line 37
    .line 38
    :goto_0
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto/16 :goto_5

    .line 42
    .line 43
    :cond_2
    iget-object v0, p0, Lcom/friday/document/view/NewestPreviewFragment$initData$2$1;->d:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v0, Ljava/util/List;

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_3
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    goto/16 :goto_2

    .line 52
    .line 53
    :cond_4
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    goto/16 :goto_1

    .line 57
    .line 58
    :cond_5
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    iget-object p1, p0, Lcom/friday/document/view/NewestPreviewFragment$initData$2$1;->g:Lcom/friday/common/entity/FileEntity;

    .line 62
    .line 63
    if-nez p1, :cond_6

    .line 64
    .line 65
    iget-object p1, p0, Lcom/friday/document/view/NewestPreviewFragment$initData$2$1;->h:Lcom/friday/document/view/NewestPreviewFragment;

    .line 66
    .line 67
    invoke-static {p1}, Lcom/friday/document/view/NewestPreviewFragment;->B(Lcom/friday/document/view/NewestPreviewFragment;)V

    .line 68
    .line 69
    .line 70
    goto/16 :goto_6

    .line 71
    .line 72
    :cond_6
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getFileType()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    const/16 v8, 0x30

    .line 81
    .line 82
    if-eq v1, v8, :cond_10

    .line 83
    .line 84
    const/16 v8, 0x31

    .line 85
    .line 86
    if-eq v1, v8, :cond_b

    .line 87
    .line 88
    const/16 v8, 0x36

    .line 89
    .line 90
    if-eq v1, v8, :cond_8

    .line 91
    .line 92
    const/16 v4, 0x621

    .line 93
    .line 94
    if-eq v1, v4, :cond_7

    .line 95
    .line 96
    goto/16 :goto_3

    .line 97
    .line 98
    :cond_7
    const-string v1, "12"

    .line 99
    .line 100
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    if-nez p1, :cond_c

    .line 105
    .line 106
    goto/16 :goto_3

    .line 107
    .line 108
    :cond_8
    const-string v1, "6"

    .line 109
    .line 110
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result p1

    .line 114
    if-nez p1, :cond_9

    .line 115
    .line 116
    goto/16 :goto_3

    .line 117
    .line 118
    :cond_9
    iget-object p1, p0, Lcom/friday/document/view/NewestPreviewFragment$initData$2$1;->g:Lcom/friday/common/entity/FileEntity;

    .line 119
    .line 120
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getTxtFilePath()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    invoke-static {p1}, Lcom/blankj/utilcode/util/FileUtils;->isFileExists(Ljava/lang/String;)Z

    .line 125
    .line 126
    .line 127
    move-result v1

    .line 128
    if-nez v1, :cond_a

    .line 129
    .line 130
    iget-object p1, p0, Lcom/friday/document/view/NewestPreviewFragment$initData$2$1;->h:Lcom/friday/document/view/NewestPreviewFragment;

    .line 131
    .line 132
    invoke-static {p1}, Lcom/friday/document/view/NewestPreviewFragment;->B(Lcom/friday/document/view/NewestPreviewFragment;)V

    .line 133
    .line 134
    .line 135
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 136
    .line 137
    return-object p1

    .line 138
    :cond_a
    iget-object v1, p0, Lcom/friday/document/view/NewestPreviewFragment$initData$2$1;->h:Lcom/friday/document/view/NewestPreviewFragment;

    .line 139
    .line 140
    iget-object v2, p0, Lcom/friday/document/view/NewestPreviewFragment$initData$2$1;->g:Lcom/friday/common/entity/FileEntity;

    .line 141
    .line 142
    invoke-static {p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    iput-object p1, p0, Lcom/friday/document/view/NewestPreviewFragment$initData$2$1;->c:Ljava/lang/Object;

    .line 147
    .line 148
    iput v4, p0, Lcom/friday/document/view/NewestPreviewFragment$initData$2$1;->f:I

    .line 149
    .line 150
    invoke-static {v1, v2, p0}, Lcom/friday/document/view/NewestPreviewFragment;->E(Lcom/friday/document/view/NewestPreviewFragment;Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    if-ne p1, v0, :cond_12

    .line 155
    .line 156
    goto/16 :goto_4

    .line 157
    .line 158
    :cond_b
    const-string v1, "1"

    .line 159
    .line 160
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    move-result p1

    .line 164
    if-nez p1, :cond_c

    .line 165
    .line 166
    goto :goto_3

    .line 167
    :cond_c
    iget-object p1, p0, Lcom/friday/document/view/NewestPreviewFragment$initData$2$1;->h:Lcom/friday/document/view/NewestPreviewFragment;

    .line 168
    .line 169
    invoke-static {p1}, Lcom/friday/document/view/NewestPreviewFragment;->H(Lcom/friday/document/view/NewestPreviewFragment;)Lcom/friday/document/viewmodel/NewestViewModel;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    iget-object v1, p0, Lcom/friday/document/view/NewestPreviewFragment$initData$2$1;->g:Lcom/friday/common/entity/FileEntity;

    .line 174
    .line 175
    iput v7, p0, Lcom/friday/document/view/NewestPreviewFragment$initData$2$1;->f:I

    .line 176
    .line 177
    invoke-virtual {p1, v1, p0}, Lcom/friday/document/viewmodel/BaseFileViewModel;->w(Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    if-ne p1, v0, :cond_d

    .line 182
    .line 183
    goto :goto_4

    .line 184
    :cond_d
    :goto_1
    check-cast p1, Ljava/lang/Boolean;

    .line 185
    .line 186
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 187
    .line 188
    .line 189
    move-result p1

    .line 190
    if-nez p1, :cond_e

    .line 191
    .line 192
    iget-object p1, p0, Lcom/friday/document/view/NewestPreviewFragment$initData$2$1;->h:Lcom/friday/document/view/NewestPreviewFragment;

    .line 193
    .line 194
    invoke-static {p1}, Lcom/friday/document/view/NewestPreviewFragment;->B(Lcom/friday/document/view/NewestPreviewFragment;)V

    .line 195
    .line 196
    .line 197
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 198
    .line 199
    return-object p1

    .line 200
    :cond_e
    invoke-static {}, Lsd/r0;->b()Lsd/e0;

    .line 201
    .line 202
    .line 203
    move-result-object p1

    .line 204
    new-instance v1, Lcom/friday/document/view/NewestPreviewFragment$initData$2$1$1;

    .line 205
    .line 206
    iget-object v3, p0, Lcom/friday/document/view/NewestPreviewFragment$initData$2$1;->g:Lcom/friday/common/entity/FileEntity;

    .line 207
    .line 208
    iget-object v4, p0, Lcom/friday/document/view/NewestPreviewFragment$initData$2$1;->h:Lcom/friday/document/view/NewestPreviewFragment;

    .line 209
    .line 210
    invoke-direct {v1, v3, v4, v2}, Lcom/friday/document/view/NewestPreviewFragment$initData$2$1$1;-><init>(Lcom/friday/common/entity/FileEntity;Lcom/friday/document/view/NewestPreviewFragment;Lvc/c;)V

    .line 211
    .line 212
    .line 213
    iput v6, p0, Lcom/friday/document/view/NewestPreviewFragment$initData$2$1;->f:I

    .line 214
    .line 215
    invoke-static {p1, v1, p0}, Lsd/f;->g(Lkotlin/coroutines/d;Lhd/p;Lvc/c;)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object p1

    .line 219
    if-ne p1, v0, :cond_f

    .line 220
    .line 221
    goto :goto_4

    .line 222
    :cond_f
    :goto_2
    iget-object v1, p0, Lcom/friday/document/view/NewestPreviewFragment$initData$2$1;->h:Lcom/friday/document/view/NewestPreviewFragment;

    .line 223
    .line 224
    move-object v3, p1

    .line 225
    check-cast v3, Ljava/util/List;

    .line 226
    .line 227
    invoke-static {}, Lsd/r0;->c()Lsd/t1;

    .line 228
    .line 229
    .line 230
    move-result-object v4

    .line 231
    new-instance v6, Lcom/friday/document/view/NewestPreviewFragment$initData$2$1$2$1;

    .line 232
    .line 233
    invoke-direct {v6, v1, v3, v2}, Lcom/friday/document/view/NewestPreviewFragment$initData$2$1$2$1;-><init>(Lcom/friday/document/view/NewestPreviewFragment;Ljava/util/List;Lvc/c;)V

    .line 234
    .line 235
    .line 236
    iput-object p1, p0, Lcom/friday/document/view/NewestPreviewFragment$initData$2$1;->c:Ljava/lang/Object;

    .line 237
    .line 238
    invoke-static {v3}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object p1

    .line 242
    iput-object p1, p0, Lcom/friday/document/view/NewestPreviewFragment$initData$2$1;->d:Ljava/lang/Object;

    .line 243
    .line 244
    const/4 p1, 0x0

    .line 245
    iput p1, p0, Lcom/friday/document/view/NewestPreviewFragment$initData$2$1;->e:I

    .line 246
    .line 247
    iput v5, p0, Lcom/friday/document/view/NewestPreviewFragment$initData$2$1;->f:I

    .line 248
    .line 249
    invoke-static {v4, v6, p0}, Lsd/f;->g(Lkotlin/coroutines/d;Lhd/p;Lvc/c;)Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object p1

    .line 253
    if-ne p1, v0, :cond_12

    .line 254
    .line 255
    goto :goto_4

    .line 256
    :cond_10
    const-string v1, "0"

    .line 257
    .line 258
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 259
    .line 260
    .line 261
    move-result p1

    .line 262
    if-nez p1, :cond_11

    .line 263
    .line 264
    :goto_3
    iget-object p1, p0, Lcom/friday/document/view/NewestPreviewFragment$initData$2$1;->h:Lcom/friday/document/view/NewestPreviewFragment;

    .line 265
    .line 266
    iget-object v1, p0, Lcom/friday/document/view/NewestPreviewFragment$initData$2$1;->g:Lcom/friday/common/entity/FileEntity;

    .line 267
    .line 268
    iput v3, p0, Lcom/friday/document/view/NewestPreviewFragment$initData$2$1;->f:I

    .line 269
    .line 270
    invoke-static {p1, v1, p0}, Lcom/friday/document/view/NewestPreviewFragment;->C(Lcom/friday/document/view/NewestPreviewFragment;Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object p1

    .line 274
    if-ne p1, v0, :cond_12

    .line 275
    .line 276
    :goto_4
    return-object v0

    .line 277
    :cond_11
    iget-object p1, p0, Lcom/friday/document/view/NewestPreviewFragment$initData$2$1;->h:Lcom/friday/document/view/NewestPreviewFragment;

    .line 278
    .line 279
    invoke-static {p1}, Lcom/friday/document/view/NewestPreviewFragment;->B(Lcom/friday/document/view/NewestPreviewFragment;)V

    .line 280
    .line 281
    .line 282
    :cond_12
    :goto_5
    iget-object p1, p0, Lcom/friday/document/view/NewestPreviewFragment$initData$2$1;->h:Lcom/friday/document/view/NewestPreviewFragment;

    .line 283
    .line 284
    iget-object v0, p0, Lcom/friday/document/view/NewestPreviewFragment$initData$2$1;->g:Lcom/friday/common/entity/FileEntity;

    .line 285
    .line 286
    invoke-static {p1, v0}, Lcom/friday/document/view/NewestPreviewFragment;->I(Lcom/friday/document/view/NewestPreviewFragment;Lcom/friday/common/entity/FileEntity;)V

    .line 287
    .line 288
    .line 289
    iget-object p1, p0, Lcom/friday/document/view/NewestPreviewFragment$initData$2$1;->h:Lcom/friday/document/view/NewestPreviewFragment;

    .line 290
    .line 291
    invoke-static {p1}, Lcom/friday/document/view/NewestPreviewFragment;->F(Lcom/friday/document/view/NewestPreviewFragment;)Lcom/friday/document/databinding/PreviewFragmentBinding;

    .line 292
    .line 293
    .line 294
    move-result-object p1

    .line 295
    iget-object p1, p1, Lcom/friday/document/databinding/PreviewFragmentBinding;->d:Lcom/friday/document/databinding/LayoutNotePreviewBinding;

    .line 296
    .line 297
    iget-object p1, p1, Lcom/friday/document/databinding/LayoutNotePreviewBinding;->j:Landroid/widget/TextView;

    .line 298
    .line 299
    iget-object v0, p0, Lcom/friday/document/view/NewestPreviewFragment$initData$2$1;->g:Lcom/friday/common/entity/FileEntity;

    .line 300
    .line 301
    invoke-virtual {v0}, Lcom/friday/common/entity/FileEntity;->getFileName()Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object v0

    .line 305
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 306
    .line 307
    .line 308
    :goto_6
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 309
    .line 310
    return-object p1
.end method
