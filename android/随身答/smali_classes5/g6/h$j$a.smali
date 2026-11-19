.class public final Lg6/h$j$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz7/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg6/h$j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Lg6/h$h;

.field public final b:Lg6/h$d;

.field public final c:Lg6/h$j;

.field public final d:I


# direct methods
.method public constructor <init>(Lg6/h$h;Lg6/h$d;Lg6/h$j;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lg6/h$j$a;->a:Lg6/h$h;

    .line 5
    .line 6
    iput-object p2, p0, Lg6/h$j$a;->b:Lg6/h$d;

    .line 7
    .line 8
    iput-object p3, p0, Lg6/h$j$a;->c:Lg6/h$j;

    .line 9
    .line 10
    iput p4, p0, Lg6/h$j$a;->d:I

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public get()Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lg6/h$j$a;->d:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/lang/AssertionError;

    .line 7
    .line 8
    iget v1, p0, Lg6/h$j$a;->d:I

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(I)V

    .line 11
    .line 12
    .line 13
    throw v0

    .line 14
    :pswitch_0
    new-instance v0, Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel;

    .line 15
    .line 16
    iget-object v1, p0, Lg6/h$j$a;->a:Lg6/h$h;

    .line 17
    .line 18
    iget-object v1, v1, Lg6/h$h;->j:Lz7/f;

    .line 19
    .line 20
    invoke-interface {v1}, Lh8/a;->get()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Lk6/g;

    .line 25
    .line 26
    iget-object v2, p0, Lg6/h$j$a;->a:Lg6/h$h;

    .line 27
    .line 28
    iget-object v2, v2, Lg6/h$h;->h:Lz7/f;

    .line 29
    .line 30
    invoke-interface {v2}, Lh8/a;->get()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    check-cast v2, Lcom/zykj/student/dialogue/upload/OssTaskManger;

    .line 35
    .line 36
    invoke-direct {v0, v1, v2}, Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel;-><init>(Lk6/g;Lcom/zykj/student/dialogue/upload/OssTaskManger;)V

    .line 37
    .line 38
    .line 39
    return-object v0

    .line 40
    :pswitch_1
    new-instance v0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel;

    .line 41
    .line 42
    iget-object v1, p0, Lg6/h$j$a;->a:Lg6/h$h;

    .line 43
    .line 44
    iget-object v1, v1, Lg6/h$h;->j:Lz7/f;

    .line 45
    .line 46
    invoke-interface {v1}, Lh8/a;->get()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    check-cast v1, Lk6/g;

    .line 51
    .line 52
    iget-object v2, p0, Lg6/h$j$a;->a:Lg6/h$h;

    .line 53
    .line 54
    iget-object v2, v2, Lg6/h$h;->k:Lz7/f;

    .line 55
    .line 56
    invoke-interface {v2}, Lh8/a;->get()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    check-cast v2, Landroidx/work/WorkManager;

    .line 61
    .line 62
    iget-object v3, p0, Lg6/h$j$a;->a:Lg6/h$h;

    .line 63
    .line 64
    iget-object v3, v3, Lg6/h$h;->h:Lz7/f;

    .line 65
    .line 66
    invoke-interface {v3}, Lh8/a;->get()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    check-cast v3, Lcom/zykj/student/dialogue/upload/OssTaskManger;

    .line 71
    .line 72
    iget-object v4, p0, Lg6/h$j$a;->a:Lg6/h$h;

    .line 73
    .line 74
    invoke-static {v4}, Lg6/h$h;->d(Lg6/h$h;)Lx7/a;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    invoke-static {v4}, Lx7/b;->a(Lx7/a;)Landroid/app/Application;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel;-><init>(Lk6/g;Landroidx/work/WorkManager;Lcom/zykj/student/dialogue/upload/OssTaskManger;Landroid/app/Application;)V

    .line 83
    .line 84
    .line 85
    return-object v0

    .line 86
    :pswitch_2
    new-instance v0, Lcom/zykj/student/dialogue/ui/MainViewModel;

    .line 87
    .line 88
    iget-object v1, p0, Lg6/h$j$a;->a:Lg6/h$h;

    .line 89
    .line 90
    iget-object v1, v1, Lg6/h$h;->c:Lz7/f;

    .line 91
    .line 92
    invoke-interface {v1}, Lh8/a;->get()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    check-cast v1, Lcom/zykj/http/bean/HeaderLiveData;

    .line 97
    .line 98
    iget-object v2, p0, Lg6/h$j$a;->a:Lg6/h$h;

    .line 99
    .line 100
    iget-object v2, v2, Lg6/h$h;->g:Lz7/f;

    .line 101
    .line 102
    invoke-interface {v2}, Lh8/a;->get()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    check-cast v2, Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 107
    .line 108
    iget-object v3, p0, Lg6/h$j$a;->a:Lg6/h$h;

    .line 109
    .line 110
    iget-object v3, v3, Lg6/h$h;->h:Lz7/f;

    .line 111
    .line 112
    invoke-interface {v3}, Lh8/a;->get()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    check-cast v3, Lcom/zykj/student/dialogue/upload/OssTaskManger;

    .line 117
    .line 118
    invoke-direct {v0, v1, v2, v3}, Lcom/zykj/student/dialogue/ui/MainViewModel;-><init>(Lcom/zykj/http/bean/HeaderLiveData;Lkotlinx/coroutines/flow/MutableStateFlow;Lcom/zykj/student/dialogue/upload/OssTaskManger;)V

    .line 119
    .line 120
    .line 121
    return-object v0

    .line 122
    :pswitch_3
    new-instance v0, Lcom/zykj/student/dialogue/ui/home/HomeViewModel;

    .line 123
    .line 124
    iget-object v1, p0, Lg6/h$j$a;->a:Lg6/h$h;

    .line 125
    .line 126
    iget-object v1, v1, Lg6/h$h;->j:Lz7/f;

    .line 127
    .line 128
    invoke-interface {v1}, Lh8/a;->get()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    check-cast v1, Lk6/g;

    .line 133
    .line 134
    iget-object v2, p0, Lg6/h$j$a;->a:Lg6/h$h;

    .line 135
    .line 136
    iget-object v2, v2, Lg6/h$h;->c:Lz7/f;

    .line 137
    .line 138
    invoke-interface {v2}, Lh8/a;->get()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    check-cast v2, Lcom/zykj/http/bean/HeaderLiveData;

    .line 143
    .line 144
    iget-object v3, p0, Lg6/h$j$a;->a:Lg6/h$h;

    .line 145
    .line 146
    iget-object v3, v3, Lg6/h$h;->g:Lz7/f;

    .line 147
    .line 148
    invoke-interface {v3}, Lh8/a;->get()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v3

    .line 152
    check-cast v3, Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 153
    .line 154
    iget-object v4, p0, Lg6/h$j$a;->a:Lg6/h$h;

    .line 155
    .line 156
    invoke-static {v4}, Lg6/h$h;->d(Lg6/h$h;)Lx7/a;

    .line 157
    .line 158
    .line 159
    move-result-object v4

    .line 160
    invoke-static {v4}, Lx7/b;->a(Lx7/a;)Landroid/app/Application;

    .line 161
    .line 162
    .line 163
    move-result-object v4

    .line 164
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/zykj/student/dialogue/ui/home/HomeViewModel;-><init>(Lk6/g;Lcom/zykj/http/bean/HeaderLiveData;Lkotlinx/coroutines/flow/MutableStateFlow;Landroid/app/Application;)V

    .line 165
    .line 166
    .line 167
    return-object v0

    .line 168
    :pswitch_4
    new-instance v0, Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel;

    .line 169
    .line 170
    iget-object v1, p0, Lg6/h$j$a;->a:Lg6/h$h;

    .line 171
    .line 172
    iget-object v1, v1, Lg6/h$h;->j:Lz7/f;

    .line 173
    .line 174
    invoke-interface {v1}, Lh8/a;->get()Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v1

    .line 178
    check-cast v1, Lk6/g;

    .line 179
    .line 180
    invoke-direct {v0, v1}, Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel;-><init>(Lk6/g;)V

    .line 181
    .line 182
    .line 183
    return-object v0

    .line 184
    :pswitch_5
    new-instance v0, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel;

    .line 185
    .line 186
    iget-object v1, p0, Lg6/h$j$a;->a:Lg6/h$h;

    .line 187
    .line 188
    iget-object v1, v1, Lg6/h$h;->j:Lz7/f;

    .line 189
    .line 190
    invoke-interface {v1}, Lh8/a;->get()Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v1

    .line 194
    check-cast v1, Lk6/g;

    .line 195
    .line 196
    invoke-direct {v0, v1}, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel;-><init>(Lk6/g;)V

    .line 197
    .line 198
    .line 199
    return-object v0

    .line 200
    :pswitch_6
    new-instance v0, Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel;

    .line 201
    .line 202
    iget-object v1, p0, Lg6/h$j$a;->a:Lg6/h$h;

    .line 203
    .line 204
    iget-object v1, v1, Lg6/h$h;->j:Lz7/f;

    .line 205
    .line 206
    invoke-interface {v1}, Lh8/a;->get()Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v1

    .line 210
    check-cast v1, Lk6/g;

    .line 211
    .line 212
    invoke-direct {v0, v1}, Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel;-><init>(Lk6/g;)V

    .line 213
    .line 214
    .line 215
    return-object v0

    .line 216
    :pswitch_7
    new-instance v0, Lcom/zykj/student/dialogue/ui/editType/EditCategoryViewModel;

    .line 217
    .line 218
    iget-object v1, p0, Lg6/h$j$a;->a:Lg6/h$h;

    .line 219
    .line 220
    iget-object v1, v1, Lg6/h$h;->j:Lz7/f;

    .line 221
    .line 222
    invoke-interface {v1}, Lh8/a;->get()Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v1

    .line 226
    check-cast v1, Lk6/g;

    .line 227
    .line 228
    invoke-direct {v0, v1}, Lcom/zykj/student/dialogue/ui/editType/EditCategoryViewModel;-><init>(Lk6/g;)V

    .line 229
    .line 230
    .line 231
    return-object v0

    .line 232
    :pswitch_8
    new-instance v0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/DetailTabViewModel;

    .line 233
    .line 234
    iget-object v1, p0, Lg6/h$j$a;->a:Lg6/h$h;

    .line 235
    .line 236
    iget-object v1, v1, Lg6/h$h;->j:Lz7/f;

    .line 237
    .line 238
    invoke-interface {v1}, Lh8/a;->get()Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v1

    .line 242
    check-cast v1, Lk6/g;

    .line 243
    .line 244
    iget-object v2, p0, Lg6/h$j$a;->a:Lg6/h$h;

    .line 245
    .line 246
    iget-object v2, v2, Lg6/h$h;->g:Lz7/f;

    .line 247
    .line 248
    invoke-interface {v2}, Lh8/a;->get()Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object v2

    .line 252
    check-cast v2, Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 253
    .line 254
    invoke-direct {v0, v1, v2}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/DetailTabViewModel;-><init>(Lk6/g;Lkotlinx/coroutines/flow/MutableStateFlow;)V

    .line 255
    .line 256
    .line 257
    return-object v0

    .line 258
    :pswitch_9
    new-instance v0, Lcom/zykj/student/dialogue/ui/collect/CollectHistoryViewModel;

    .line 259
    .line 260
    iget-object v1, p0, Lg6/h$j$a;->a:Lg6/h$h;

    .line 261
    .line 262
    iget-object v1, v1, Lg6/h$h;->j:Lz7/f;

    .line 263
    .line 264
    invoke-interface {v1}, Lh8/a;->get()Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object v1

    .line 268
    check-cast v1, Lk6/g;

    .line 269
    .line 270
    invoke-direct {v0, v1}, Lcom/zykj/student/dialogue/ui/collect/CollectHistoryViewModel;-><init>(Lk6/g;)V

    .line 271
    .line 272
    .line 273
    return-object v0

    .line 274
    :pswitch_a
    new-instance v0, Lcom/zykj/student/dialogue/ui/ask/AskQuestionViewModel;

    .line 275
    .line 276
    iget-object v1, p0, Lg6/h$j$a;->a:Lg6/h$h;

    .line 277
    .line 278
    iget-object v1, v1, Lg6/h$h;->j:Lz7/f;

    .line 279
    .line 280
    invoke-interface {v1}, Lh8/a;->get()Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object v1

    .line 284
    check-cast v1, Lk6/g;

    .line 285
    .line 286
    invoke-direct {v0, v1}, Lcom/zykj/student/dialogue/ui/ask/AskQuestionViewModel;-><init>(Lk6/g;)V

    .line 287
    .line 288
    .line 289
    return-object v0

    .line 290
    :pswitch_b
    new-instance v0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;

    .line 291
    .line 292
    iget-object v1, p0, Lg6/h$j$a;->a:Lg6/h$h;

    .line 293
    .line 294
    iget-object v1, v1, Lg6/h$h;->j:Lz7/f;

    .line 295
    .line 296
    invoke-interface {v1}, Lh8/a;->get()Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v1

    .line 300
    check-cast v1, Lk6/g;

    .line 301
    .line 302
    iget-object v2, p0, Lg6/h$j$a;->a:Lg6/h$h;

    .line 303
    .line 304
    invoke-static {v2}, Lg6/h$h;->d(Lg6/h$h;)Lx7/a;

    .line 305
    .line 306
    .line 307
    move-result-object v2

    .line 308
    invoke-static {v2}, Lx7/b;->a(Lx7/a;)Landroid/app/Application;

    .line 309
    .line 310
    .line 311
    move-result-object v2

    .line 312
    iget-object v3, p0, Lg6/h$j$a;->a:Lg6/h$h;

    .line 313
    .line 314
    iget-object v3, v3, Lg6/h$h;->g:Lz7/f;

    .line 315
    .line 316
    invoke-interface {v3}, Lh8/a;->get()Ljava/lang/Object;

    .line 317
    .line 318
    .line 319
    move-result-object v3

    .line 320
    check-cast v3, Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 321
    .line 322
    invoke-direct {v0, v1, v2, v3}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;-><init>(Lk6/g;Landroid/app/Application;Lkotlinx/coroutines/flow/MutableStateFlow;)V

    .line 323
    .line 324
    .line 325
    return-object v0

    .line 326
    nop

    .line 327
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
