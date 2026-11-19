.class public final Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/study/ui/home/my/CourseContentFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "JsToJava"
.end annotation


# instance fields
.field public final a:Lcom/zykj/study/ui/home/my/CourseContentFragmentArgs;

.field public final synthetic b:Lcom/zykj/study/ui/home/my/CourseContentFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/study/ui/home/my/CourseContentFragment;Lcom/zykj/study/ui/home/my/CourseContentFragmentArgs;)V
    .locals 1

    .line 1
    const-string v0, "fragmentArgs"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava;->b:Lcom/zykj/study/ui/home/my/CourseContentFragment;

    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p2, p0, Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava;->a:Lcom/zykj/study/ui/home/my/CourseContentFragmentArgs;

    .line 12
    .line 13
    return-void
.end method

.method public static synthetic a(Ljava/lang/String;Ljava/lang/String;Lcom/zykj/study/ui/home/my/CourseContentFragment;Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava;->b(Ljava/lang/String;Ljava/lang/String;Lcom/zykj/study/ui/home/my/CourseContentFragment;Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Ljava/lang/String;Ljava/lang/String;Lcom/zykj/study/ui/home/my/CourseContentFragment;Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava;)Lh7/p;
    .locals 10

    .line 1
    :try_start_0
    new-instance v0, Lorg/json/JSONArray;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 7
    .line 8
    .line 9
    move-result p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    const/4 v1, 0x0

    .line 11
    const/4 v2, 0x0

    .line 12
    const-string v3, "getViewLifecycleOwner(...)"

    .line 13
    .line 14
    sparse-switch p0, :sswitch_data_0

    .line 15
    .line 16
    .line 17
    goto/16 :goto_1

    .line 18
    .line 19
    :sswitch_0
    :try_start_1
    const-string p0, "exercise"

    .line 20
    .line 21
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    if-nez p0, :cond_0

    .line 26
    .line 27
    goto/16 :goto_1

    .line 28
    .line 29
    :cond_0
    invoke-virtual {p2}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-static {p0, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    invoke-static {}, Li8/i0;->c()Li8/h1;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    new-instance v7, Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava$_callHandler$1$2;

    .line 45
    .line 46
    invoke-direct {v7, p2, v0, v2}, Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava$_callHandler$1$2;-><init>(Lcom/zykj/study/ui/home/my/CourseContentFragment;Lorg/json/JSONArray;Lm7/c;)V

    .line 47
    .line 48
    .line 49
    const/4 v8, 0x2

    .line 50
    const/4 v9, 0x0

    .line 51
    const/4 v6, 0x0

    .line 52
    invoke-static/range {v4 .. v9}, Li8/f;->d(Li8/b0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 53
    .line 54
    .line 55
    goto/16 :goto_1

    .line 56
    .line 57
    :catch_0
    move-exception v0

    .line 58
    move-object p0, v0

    .line 59
    goto/16 :goto_0

    .line 60
    .line 61
    :sswitch_1
    const-string p0, "open_file"

    .line 62
    .line 63
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result p0

    .line 67
    if-nez p0, :cond_1

    .line 68
    .line 69
    goto/16 :goto_1

    .line 70
    .line 71
    :cond_1
    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    invoke-virtual {p2}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-static {p1, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    invoke-static {p1}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    invoke-static {}, Li8/i0;->c()Li8/h1;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    new-instance v7, Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava$_callHandler$1$7$1;

    .line 95
    .line 96
    invoke-direct {v7, p2, p0, v2}, Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava$_callHandler$1$7$1;-><init>(Lcom/zykj/study/ui/home/my/CourseContentFragment;Ljava/lang/String;Lm7/c;)V

    .line 97
    .line 98
    .line 99
    const/4 v8, 0x2

    .line 100
    const/4 v9, 0x0

    .line 101
    const/4 v6, 0x0

    .line 102
    invoke-static/range {v4 .. v9}, Li8/f;->d(Li8/b0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 103
    .line 104
    .line 105
    goto/16 :goto_1

    .line 106
    .line 107
    :sswitch_2
    const-string p0, "micro_play"

    .line 108
    .line 109
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result p0

    .line 113
    if-nez p0, :cond_2

    .line 114
    .line 115
    goto/16 :goto_1

    .line 116
    .line 117
    :cond_2
    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    invoke-virtual {p2}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    invoke-static {p1, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    invoke-static {p1}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 133
    .line 134
    .line 135
    move-result-object v4

    .line 136
    invoke-static {}, Li8/i0;->c()Li8/h1;

    .line 137
    .line 138
    .line 139
    move-result-object v5

    .line 140
    new-instance v7, Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava$_callHandler$1$1$1;

    .line 141
    .line 142
    invoke-direct {v7, p2, p0, v2}, Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava$_callHandler$1$1$1;-><init>(Lcom/zykj/study/ui/home/my/CourseContentFragment;Ljava/lang/String;Lm7/c;)V

    .line 143
    .line 144
    .line 145
    const/4 v8, 0x2

    .line 146
    const/4 v9, 0x0

    .line 147
    const/4 v6, 0x0

    .line 148
    invoke-static/range {v4 .. v9}, Li8/f;->d(Li8/b0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 149
    .line 150
    .line 151
    goto/16 :goto_1

    .line 152
    .line 153
    :sswitch_3
    const-string p0, "micro_add"

    .line 154
    .line 155
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    goto/16 :goto_1

    .line 159
    .line 160
    :sswitch_4
    const-string p0, "exercise_statistic"

    .line 161
    .line 162
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result p0

    .line 166
    if-nez p0, :cond_3

    .line 167
    .line 168
    goto/16 :goto_1

    .line 169
    .line 170
    :cond_3
    iget-object p0, p3, Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava;->a:Lcom/zykj/study/ui/home/my/CourseContentFragmentArgs;

    .line 171
    .line 172
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/CourseContentFragmentArgs;->e()Z

    .line 173
    .line 174
    .line 175
    move-result p0

    .line 176
    if-eqz p0, :cond_4

    .line 177
    .line 178
    invoke-virtual {p2}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 179
    .line 180
    .line 181
    move-result-object p0

    .line 182
    invoke-static {p0, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 186
    .line 187
    .line 188
    move-result-object p0

    .line 189
    new-instance p1, Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava$_callHandler$1$3;

    .line 190
    .line 191
    invoke-direct {p1, p2, v0, p3, v2}, Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava$_callHandler$1$3;-><init>(Lcom/zykj/study/ui/home/my/CourseContentFragment;Lorg/json/JSONArray;Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava;Lm7/c;)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {p0, p1}, Landroidx/lifecycle/LifecycleCoroutineScope;->launchWhenResumed(Lx7/p;)Lkotlinx/coroutines/n;

    .line 195
    .line 196
    .line 197
    goto/16 :goto_1

    .line 198
    .line 199
    :cond_4
    invoke-virtual {p2}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 200
    .line 201
    .line 202
    move-result-object p0

    .line 203
    invoke-static {p0, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 207
    .line 208
    .line 209
    move-result-object v4

    .line 210
    invoke-static {}, Li8/i0;->c()Li8/h1;

    .line 211
    .line 212
    .line 213
    move-result-object v5

    .line 214
    new-instance v7, Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava$_callHandler$1$4;

    .line 215
    .line 216
    invoke-direct {v7, p3, v0, p2, v2}, Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava$_callHandler$1$4;-><init>(Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava;Lorg/json/JSONArray;Lcom/zykj/study/ui/home/my/CourseContentFragment;Lm7/c;)V

    .line 217
    .line 218
    .line 219
    const/4 v8, 0x2

    .line 220
    const/4 v9, 0x0

    .line 221
    const/4 v6, 0x0

    .line 222
    invoke-static/range {v4 .. v9}, Li8/f;->d(Li8/b0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 223
    .line 224
    .line 225
    goto :goto_1

    .line 226
    :sswitch_5
    const-string p0, "exercise_view"

    .line 227
    .line 228
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 229
    .line 230
    .line 231
    move-result p0

    .line 232
    if-nez p0, :cond_5

    .line 233
    .line 234
    goto :goto_1

    .line 235
    :cond_5
    invoke-virtual {p2}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 236
    .line 237
    .line 238
    move-result-object p0

    .line 239
    invoke-static {p0, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 240
    .line 241
    .line 242
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 243
    .line 244
    .line 245
    move-result-object v4

    .line 246
    invoke-static {}, Li8/i0;->c()Li8/h1;

    .line 247
    .line 248
    .line 249
    move-result-object v5

    .line 250
    new-instance v7, Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava$_callHandler$1$5;

    .line 251
    .line 252
    invoke-direct {v7, v0, p3, p2, v2}, Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava$_callHandler$1$5;-><init>(Lorg/json/JSONArray;Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava;Lcom/zykj/study/ui/home/my/CourseContentFragment;Lm7/c;)V

    .line 253
    .line 254
    .line 255
    const/4 v8, 0x2

    .line 256
    const/4 v9, 0x0

    .line 257
    const/4 v6, 0x0

    .line 258
    invoke-static/range {v4 .. v9}, Li8/f;->d(Li8/b0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 259
    .line 260
    .line 261
    goto :goto_1

    .line 262
    :sswitch_6
    const-string p0, "video_play"

    .line 263
    .line 264
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 265
    .line 266
    .line 267
    move-result p0

    .line 268
    if-nez p0, :cond_6

    .line 269
    .line 270
    goto :goto_1

    .line 271
    :cond_6
    new-instance p0, Landroid/content/Intent;

    .line 272
    .line 273
    invoke-virtual {p2}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 274
    .line 275
    .line 276
    move-result-object p1

    .line 277
    const-class p3, Lcom/zykj/study/ui/SuperPlayerActivity;

    .line 278
    .line 279
    invoke-direct {p0, p1, p3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 280
    .line 281
    .line 282
    const-string p1, "path"

    .line 283
    .line 284
    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object p3

    .line 288
    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object p3

    .line 292
    invoke-virtual {p0, p1, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 293
    .line 294
    .line 295
    invoke-virtual {p2, p0}, Landroidx/fragment/app/Fragment;->startActivity(Landroid/content/Intent;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 296
    .line 297
    .line 298
    goto :goto_1

    .line 299
    :goto_0
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 300
    .line 301
    .line 302
    sget-object p0, Lcom/zykj/base/utils/XToastUtils;->INSTANCE:Lcom/zykj/base/utils/XToastUtils;

    .line 303
    .line 304
    sget p1, Lcom/zykj/study/R$string;->option_fail:I

    .line 305
    .line 306
    invoke-virtual {p2, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    move-result-object p1

    .line 310
    const-string p2, "getString(...)"

    .line 311
    .line 312
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 313
    .line 314
    .line 315
    invoke-static {p0, p1}, Le5/o;->d(Lcom/zykj/base/utils/XToastUtils;Ljava/lang/String;)V

    .line 316
    .line 317
    .line 318
    :goto_1
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 319
    .line 320
    return-object p0

    .line 321
    :sswitch_data_0
    .sparse-switch
        -0x60703b88 -> :sswitch_6
        -0x5d0fa754 -> :sswitch_5
        -0x15d1f857 -> :sswitch_4
        -0x5a71b5a -> :sswitch_3
        0x50ca9fcf -> :sswitch_2
        0x5c24e651 -> :sswitch_1
        0x7a9101d8 -> :sswitch_0
    .end sparse-switch
.end method


# virtual methods
.method public final _callHandler(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "all"
        }
    .end annotation

    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    const-string v0, "handlerName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "callHandlerID"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string p2, "args"

    .line 12
    .line 13
    invoke-static {p3, p2}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    sget-object p2, Lh5/c;->b:Lh5/c;

    .line 17
    .line 18
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava;->b:Lcom/zykj/study/ui/home/my/CourseContentFragment;

    .line 19
    .line 20
    new-instance v1, Lb5/n;

    .line 21
    .line 22
    invoke-direct {v1, p3, p1, v0, p0}, Lb5/n;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/zykj/study/ui/home/my/CourseContentFragment;Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p2, v1}, Lh5/c;->a(Lx7/a;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final c()Lcom/zykj/study/ui/home/my/CourseContentFragmentArgs;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava;->a:Lcom/zykj/study/ui/home/my/CourseContentFragmentArgs;

    .line 2
    .line 3
    return-object v0
.end method
