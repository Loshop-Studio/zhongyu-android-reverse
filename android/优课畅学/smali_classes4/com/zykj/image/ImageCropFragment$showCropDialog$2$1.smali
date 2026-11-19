.class final Lcom/zykj/image/ImageCropFragment$showCropDialog$2$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/image/ImageCropFragment;->showCropDialog$lambda-4(Lcom/zykj/image/ImageCropFragment;Landroid/content/DialogInterface;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lx7/p;"
    }
.end annotation

.annotation runtime Lo7/d;
    c = "com.zykj.image.ImageCropFragment$showCropDialog$2$1"
    f = "ImageCropFragment.kt"
    l = {
        0x79,
        0x8d
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:I

.field public synthetic f:Ljava/lang/Object;

.field public final synthetic g:Lcom/zykj/image/ImageCropFragment;

.field public final synthetic h:Landroid/content/DialogInterface;


# direct methods
.method public constructor <init>(Lcom/zykj/image/ImageCropFragment;Landroid/content/DialogInterface;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/image/ImageCropFragment$showCropDialog$2$1;->g:Lcom/zykj/image/ImageCropFragment;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/image/ImageCropFragment$showCropDialog$2$1;->h:Landroid/content/DialogInterface;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILm7/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm7/c;)Lm7/c;
    .locals 3

    .line 1
    new-instance v0, Lcom/zykj/image/ImageCropFragment$showCropDialog$2$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/image/ImageCropFragment$showCropDialog$2$1;->g:Lcom/zykj/image/ImageCropFragment;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/zykj/image/ImageCropFragment$showCropDialog$2$1;->h:Landroid/content/DialogInterface;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p2}, Lcom/zykj/image/ImageCropFragment$showCropDialog$2$1;-><init>(Lcom/zykj/image/ImageCropFragment;Landroid/content/DialogInterface;Lm7/c;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, Lcom/zykj/image/ImageCropFragment$showCropDialog$2$1;->f:Ljava/lang/Object;

    .line 11
    .line 12
    return-object v0
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/image/ImageCropFragment$showCropDialog$2$1;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/image/ImageCropFragment$showCropDialog$2$1;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/image/ImageCropFragment$showCropDialog$2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/image/ImageCropFragment$showCropDialog$2$1;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/image/ImageCropFragment$showCropDialog$2$1;->e:I

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x2

    .line 9
    const/4 v4, 0x1

    .line 10
    if-eqz v1, :cond_2

    .line 11
    .line 12
    if-eq v1, v4, :cond_1

    .line 13
    .line 14
    if-ne v1, v3, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, Lcom/zykj/image/ImageCropFragment$showCropDialog$2$1;->d:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 19
    .line 20
    iget-object v1, p0, Lcom/zykj/image/ImageCropFragment$showCropDialog$2$1;->c:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v1, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 23
    .line 24
    iget-object v2, p0, Lcom/zykj/image/ImageCropFragment$showCropDialog$2$1;->b:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v2, Landroid/content/DialogInterface;

    .line 27
    .line 28
    iget-object v3, p0, Lcom/zykj/image/ImageCropFragment$showCropDialog$2$1;->a:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v3, Lcom/zykj/image/ImageCropFragment;

    .line 31
    .line 32
    iget-object v4, p0, Lcom/zykj/image/ImageCropFragment$showCropDialog$2$1;->f:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v4, Landroid/graphics/Bitmap;

    .line 35
    .line 36
    :try_start_0
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 37
    .line 38
    .line 39
    goto/16 :goto_4

    .line 40
    .line 41
    :catch_0
    move-exception v0

    .line 42
    :goto_0
    move-object p1, v0

    .line 43
    goto/16 :goto_6

    .line 44
    .line 45
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 46
    .line 47
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw p1

    .line 53
    :cond_1
    iget-object v1, p0, Lcom/zykj/image/ImageCropFragment$showCropDialog$2$1;->d:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v1, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 56
    .line 57
    iget-object v4, p0, Lcom/zykj/image/ImageCropFragment$showCropDialog$2$1;->c:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v4, Landroid/content/DialogInterface;

    .line 60
    .line 61
    iget-object v5, p0, Lcom/zykj/image/ImageCropFragment$showCropDialog$2$1;->b:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v5, Lcom/zykj/image/ImageCropFragment;

    .line 64
    .line 65
    iget-object v6, p0, Lcom/zykj/image/ImageCropFragment$showCropDialog$2$1;->a:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v6, Landroid/graphics/Bitmap;

    .line 68
    .line 69
    iget-object v7, p0, Lcom/zykj/image/ImageCropFragment$showCropDialog$2$1;->f:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v7, Li8/b0;

    .line 72
    .line 73
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    move-object p1, v6

    .line 77
    :goto_1
    move-object v6, v7

    .line 78
    goto/16 :goto_2

    .line 79
    .line 80
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    iget-object p1, p0, Lcom/zykj/image/ImageCropFragment$showCropDialog$2$1;->f:Ljava/lang/Object;

    .line 84
    .line 85
    move-object v7, p1

    .line 86
    check-cast v7, Li8/b0;

    .line 87
    .line 88
    iget-object p1, p0, Lcom/zykj/image/ImageCropFragment$showCropDialog$2$1;->g:Lcom/zykj/image/ImageCropFragment;

    .line 89
    .line 90
    invoke-virtual {p1}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    check-cast p1, Lcom/zykj/image/databinding/FragmentImageCropBinding;

    .line 95
    .line 96
    iget-object p1, p1, Lcom/zykj/image/databinding/FragmentImageCropBinding;->d:Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;

    .line 97
    .line 98
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/imageview/crop/CropImageView;->getCroppedImage()Landroid/graphics/Bitmap;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    if-nez p1, :cond_3

    .line 103
    .line 104
    sget-object p1, Lcom/zykj/base/utils/XToastUtils;->INSTANCE:Lcom/zykj/base/utils/XToastUtils;

    .line 105
    .line 106
    iget-object v0, p0, Lcom/zykj/image/ImageCropFragment$showCropDialog$2$1;->g:Lcom/zykj/image/ImageCropFragment;

    .line 107
    .line 108
    sget v1, Lcom/zykj/image/R$string;->crop_fail:I

    .line 109
    .line 110
    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    const-string v1, "getString(R.string.crop_fail)"

    .line 115
    .line 116
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {p1, v0}, Lcom/zykj/base/utils/XToastUtils;->error(Ljava/lang/CharSequence;)V

    .line 120
    .line 121
    .line 122
    iget-object p1, p0, Lcom/zykj/image/ImageCropFragment$showCropDialog$2$1;->h:Landroid/content/DialogInterface;

    .line 123
    .line 124
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 125
    .line 126
    .line 127
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 128
    .line 129
    return-object p1

    .line 130
    :cond_3
    iget-object v1, p0, Lcom/zykj/image/ImageCropFragment$showCropDialog$2$1;->g:Lcom/zykj/image/ImageCropFragment;

    .line 131
    .line 132
    invoke-static {v1}, Lcom/zykj/image/ImageCropFragment;->access$getLocalFilePath$p(Lcom/zykj/image/ImageCropFragment;)Landroidx/lifecycle/MutableLiveData;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    invoke-virtual {v1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    check-cast v1, Ljava/lang/String;

    .line 141
    .line 142
    if-nez v1, :cond_4

    .line 143
    .line 144
    goto/16 :goto_8

    .line 145
    .line 146
    :cond_4
    iget-object v5, p0, Lcom/zykj/image/ImageCropFragment$showCropDialog$2$1;->g:Lcom/zykj/image/ImageCropFragment;

    .line 147
    .line 148
    iget-object v6, p0, Lcom/zykj/image/ImageCropFragment$showCropDialog$2$1;->h:Landroid/content/DialogInterface;

    .line 149
    .line 150
    new-instance v8, Ljava/io/File;

    .line 151
    .line 152
    invoke-direct {v8, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    new-instance v1, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 156
    .line 157
    invoke-direct {v1}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 158
    .line 159
    .line 160
    new-instance v9, Ljava/io/File;

    .line 161
    .line 162
    invoke-virtual {v8}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 163
    .line 164
    .line 165
    move-result-object v10

    .line 166
    new-instance v11, Ljava/lang/StringBuilder;

    .line 167
    .line 168
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 169
    .line 170
    .line 171
    invoke-static {v8}, Lt7/h;->f(Ljava/io/File;)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v12

    .line 175
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    const-string v12, "_crop."

    .line 179
    .line 180
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    invoke-static {v8}, Lt7/h;->e(Ljava/io/File;)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v8

    .line 187
    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v8

    .line 194
    invoke-direct {v9, v10, v8}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    iput-object v9, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->a:Ljava/lang/Object;

    .line 198
    .line 199
    invoke-static {}, Li8/i0;->b()Lkotlinx/coroutines/CoroutineDispatcher;

    .line 200
    .line 201
    .line 202
    move-result-object v8

    .line 203
    new-instance v9, Lcom/zykj/image/ImageCropFragment$showCropDialog$2$1$1$1;

    .line 204
    .line 205
    invoke-direct {v9, v5, p1, v1, v2}, Lcom/zykj/image/ImageCropFragment$showCropDialog$2$1$1$1;-><init>(Lcom/zykj/image/ImageCropFragment;Landroid/graphics/Bitmap;Lkotlin/jvm/internal/Ref$ObjectRef;Lm7/c;)V

    .line 206
    .line 207
    .line 208
    iput-object v7, p0, Lcom/zykj/image/ImageCropFragment$showCropDialog$2$1;->f:Ljava/lang/Object;

    .line 209
    .line 210
    iput-object p1, p0, Lcom/zykj/image/ImageCropFragment$showCropDialog$2$1;->a:Ljava/lang/Object;

    .line 211
    .line 212
    iput-object v5, p0, Lcom/zykj/image/ImageCropFragment$showCropDialog$2$1;->b:Ljava/lang/Object;

    .line 213
    .line 214
    iput-object v6, p0, Lcom/zykj/image/ImageCropFragment$showCropDialog$2$1;->c:Ljava/lang/Object;

    .line 215
    .line 216
    iput-object v1, p0, Lcom/zykj/image/ImageCropFragment$showCropDialog$2$1;->d:Ljava/lang/Object;

    .line 217
    .line 218
    iput v4, p0, Lcom/zykj/image/ImageCropFragment$showCropDialog$2$1;->e:I

    .line 219
    .line 220
    invoke-static {v8, v9, p0}, Li8/f;->g(Lkotlin/coroutines/d;Lx7/p;Lm7/c;)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v4

    .line 224
    if-ne v4, v0, :cond_5

    .line 225
    .line 226
    goto :goto_3

    .line 227
    :cond_5
    move-object v4, v6

    .line 228
    goto/16 :goto_1

    .line 229
    .line 230
    :goto_2
    iget-object v7, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->a:Ljava/lang/Object;

    .line 231
    .line 232
    check-cast v7, Ljava/io/File;

    .line 233
    .line 234
    invoke-virtual {v7}, Ljava/io/File;->exists()Z

    .line 235
    .line 236
    .line 237
    move-result v7

    .line 238
    if-nez v7, :cond_6

    .line 239
    .line 240
    sget-object p1, Lcom/zykj/base/utils/XToastUtils;->INSTANCE:Lcom/zykj/base/utils/XToastUtils;

    .line 241
    .line 242
    sget v0, Lcom/zykj/image/R$string;->image_save_fail:I

    .line 243
    .line 244
    invoke-virtual {v5, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    const-string v1, "getString(R.string.image_save_fail)"

    .line 249
    .line 250
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {p1, v0}, Lcom/zykj/base/utils/XToastUtils;->error(Ljava/lang/CharSequence;)V

    .line 254
    .line 255
    .line 256
    invoke-interface {v4}, Landroid/content/DialogInterface;->dismiss()V

    .line 257
    .line 258
    .line 259
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 260
    .line 261
    return-object p1

    .line 262
    :cond_6
    invoke-static {v5}, Lcom/zykj/image/ImageCropFragment;->access$getArgs(Lcom/zykj/image/ImageCropFragment;)Lcom/zykj/image/ImageCropFragmentArgs;

    .line 263
    .line 264
    .line 265
    move-result-object v7

    .line 266
    invoke-virtual {v7}, Lcom/zykj/image/ImageCropFragmentArgs;->a()Z

    .line 267
    .line 268
    .line 269
    move-result v7

    .line 270
    if-eqz v7, :cond_8

    .line 271
    .line 272
    :try_start_1
    new-instance v9, Lcom/zykj/image/ImageCropFragment$showCropDialog$2$1$1$get$1;

    .line 273
    .line 274
    invoke-direct {v9, v1, v5, v2}, Lcom/zykj/image/ImageCropFragment$showCropDialog$2$1$1$get$1;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/zykj/image/ImageCropFragment;Lm7/c;)V

    .line 275
    .line 276
    .line 277
    const/4 v10, 0x3

    .line 278
    const/4 v11, 0x0

    .line 279
    const/4 v7, 0x0

    .line 280
    const/4 v8, 0x0

    .line 281
    invoke-static/range {v6 .. v11}, Li8/f;->b(Li8/b0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lx7/p;ILjava/lang/Object;)Li8/e0;

    .line 282
    .line 283
    .line 284
    move-result-object v2

    .line 285
    iput-object p1, p0, Lcom/zykj/image/ImageCropFragment$showCropDialog$2$1;->f:Ljava/lang/Object;

    .line 286
    .line 287
    iput-object v5, p0, Lcom/zykj/image/ImageCropFragment$showCropDialog$2$1;->a:Ljava/lang/Object;

    .line 288
    .line 289
    iput-object v4, p0, Lcom/zykj/image/ImageCropFragment$showCropDialog$2$1;->b:Ljava/lang/Object;

    .line 290
    .line 291
    iput-object v1, p0, Lcom/zykj/image/ImageCropFragment$showCropDialog$2$1;->c:Ljava/lang/Object;

    .line 292
    .line 293
    iput-object v1, p0, Lcom/zykj/image/ImageCropFragment$showCropDialog$2$1;->d:Ljava/lang/Object;

    .line 294
    .line 295
    iput v3, p0, Lcom/zykj/image/ImageCropFragment$showCropDialog$2$1;->e:I

    .line 296
    .line 297
    invoke-interface {v2, p0}, Li8/e0;->u(Lm7/c;)Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    move-result-object v2
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 301
    if-ne v2, v0, :cond_7

    .line 302
    .line 303
    :goto_3
    return-object v0

    .line 304
    :cond_7
    move-object v0, v4

    .line 305
    move-object v4, p1

    .line 306
    move-object p1, v2

    .line 307
    move-object v2, v0

    .line 308
    move-object v0, v1

    .line 309
    move-object v3, v5

    .line 310
    :goto_4
    :try_start_2
    const-string v5, "get.await()"

    .line 311
    .line 312
    invoke-static {p1, v5}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 313
    .line 314
    .line 315
    check-cast p1, Ljava/util/List;

    .line 316
    .line 317
    invoke-static {p1}, Li7/f0;->x0(Ljava/util/List;)Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    move-result-object p1

    .line 321
    const-string v5, "get.await().last()"

    .line 322
    .line 323
    invoke-static {p1, v5}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 324
    .line 325
    .line 326
    iput-object p1, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->a:Ljava/lang/Object;

    .line 327
    .line 328
    const-string p1, "\u538b\u7f29\u540e\u6210\u529f->"

    .line 329
    .line 330
    iget-object v0, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->a:Ljava/lang/Object;

    .line 331
    .line 332
    check-cast v0, Ljava/io/File;

    .line 333
    .line 334
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 335
    .line 336
    .line 337
    move-result-object v0

    .line 338
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->p(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 339
    .line 340
    .line 341
    move-result-object p1

    .line 342
    invoke-static {p1}, Lw0/a;->a(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 343
    .line 344
    .line 345
    :goto_5
    move-object v5, v3

    .line 346
    move-object p1, v4

    .line 347
    move-object v4, v2

    .line 348
    goto :goto_7

    .line 349
    :catch_1
    move-exception v0

    .line 350
    move-object v2, v4

    .line 351
    move-object v3, v5

    .line 352
    move-object v4, p1

    .line 353
    goto/16 :goto_0

    .line 354
    .line 355
    :goto_6
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 356
    .line 357
    .line 358
    iget-object p1, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->a:Ljava/lang/Object;

    .line 359
    .line 360
    check-cast p1, Ljava/io/File;

    .line 361
    .line 362
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 363
    .line 364
    .line 365
    move-result-object p1

    .line 366
    const-string v0, "\u56fe\u7247\u538b\u7f29\u5931\u8d25"

    .line 367
    .line 368
    invoke-static {v0, p1}, Lkotlin/jvm/internal/u;->p(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 369
    .line 370
    .line 371
    move-result-object p1

    .line 372
    invoke-static {p1}, Lw0/a;->c(Ljava/lang/Object;)V

    .line 373
    .line 374
    .line 375
    sget-object p1, Lcom/zykj/base/utils/XToastUtils;->INSTANCE:Lcom/zykj/base/utils/XToastUtils;

    .line 376
    .line 377
    sget v0, Lcom/zykj/image/R$string;->image_compress_fail:I

    .line 378
    .line 379
    invoke-virtual {v3, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 380
    .line 381
    .line 382
    move-result-object v0

    .line 383
    const-string v5, "getString(R.string.image_compress_fail)"

    .line 384
    .line 385
    invoke-static {v0, v5}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 386
    .line 387
    .line 388
    invoke-virtual {p1, v0}, Lcom/zykj/base/utils/XToastUtils;->error(Ljava/lang/CharSequence;)V

    .line 389
    .line 390
    .line 391
    goto :goto_5

    .line 392
    :cond_8
    :goto_7
    invoke-interface {v4}, Landroid/content/DialogInterface;->dismiss()V

    .line 393
    .line 394
    .line 395
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->recycle()V

    .line 396
    .line 397
    .line 398
    iget-object p1, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->a:Ljava/lang/Object;

    .line 399
    .line 400
    check-cast p1, Ljava/io/File;

    .line 401
    .line 402
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 403
    .line 404
    .line 405
    move-result-object p1

    .line 406
    const-string v0, "result_image_crop_path"

    .line 407
    .line 408
    invoke-static {v0, p1}, Lh7/f;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 409
    .line 410
    .line 411
    move-result-object p1

    .line 412
    filled-new-array {p1}, [Lkotlin/Pair;

    .line 413
    .line 414
    .line 415
    move-result-object p1

    .line 416
    invoke-static {p1}, Landroidx/core/os/BundleKt;->bundleOf([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 417
    .line 418
    .line 419
    move-result-object p1

    .line 420
    const-string v0, "result_image_crop_key"

    .line 421
    .line 422
    invoke-static {v5, v0, p1}, Landroidx/fragment/app/FragmentKt;->setFragmentResult(Landroidx/fragment/app/Fragment;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 423
    .line 424
    .line 425
    invoke-static {v5}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    .line 426
    .line 427
    .line 428
    move-result-object p1

    .line 429
    invoke-virtual {p1}, Landroidx/navigation/NavController;->navigateUp()Z

    .line 430
    .line 431
    .line 432
    :goto_8
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 433
    .line 434
    return-object p1
.end method
