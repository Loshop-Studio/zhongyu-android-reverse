# RE note 本类字节码直接引用的读写或显示接口包括文件流。
.class final Lcom/friday/paint/view/StudentPaintFragment$initObserver$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/paint/view/StudentPaintFragment;->initObserver()V
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
    c = "com.friday.paint.view.StudentPaintFragment$initObserver$1$1"
    f = "StudentPaintFragment.kt"
    l = {
        0x1be,
        0x1e0
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public d:I

.field public e:I

.field public f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;

.field public h:I

.field public final synthetic i:Lcom/friday/paint/view/StudentPaintFragment;


# direct methods
.method public constructor <init>(Lcom/friday/paint/view/StudentPaintFragment;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/paint/view/StudentPaintFragment$initObserver$1$1;->i:Lcom/friday/paint/view/StudentPaintFragment;

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
    new-instance p1, Lcom/friday/paint/view/StudentPaintFragment$initObserver$1$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/paint/view/StudentPaintFragment$initObserver$1$1;->i:Lcom/friday/paint/view/StudentPaintFragment;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcom/friday/paint/view/StudentPaintFragment$initObserver$1$1;-><init>(Lcom/friday/paint/view/StudentPaintFragment;Lvc/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/friday/paint/view/StudentPaintFragment$initObserver$1$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/paint/view/StudentPaintFragment$initObserver$1$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/paint/view/StudentPaintFragment$initObserver$1$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/paint/view/StudentPaintFragment$initObserver$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget v2, v0, Lcom/friday/paint/view/StudentPaintFragment$initObserver$1$1;->h:I

    .line 8
    .line 9
    const/4 v3, 0x2

    .line 10
    const/4 v4, 0x1

    .line 11
    if-eqz v2, :cond_2

    .line 12
    .line 13
    if-eq v2, v4, :cond_1

    .line 14
    .line 15
    if-ne v2, v3, :cond_0

    .line 16
    .line 17
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    goto/16 :goto_5

    .line 21
    .line 22
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 23
    .line 24
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 25
    .line 26
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw v1

    .line 30
    :cond_1
    iget-object v1, v0, Lcom/friday/paint/view/StudentPaintFragment$initObserver$1$1;->g:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v1, Ljava/io/File;

    .line 33
    .line 34
    iget-object v1, v0, Lcom/friday/paint/view/StudentPaintFragment$initObserver$1$1;->f:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v1, Ljava/lang/String;

    .line 37
    .line 38
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    iget-object v2, v0, Lcom/friday/paint/view/StudentPaintFragment$initObserver$1$1;->i:Lcom/friday/paint/view/StudentPaintFragment;

    .line 46
    .line 47
    invoke-static {v2}, Lcom/friday/paint/view/StudentPaintFragment;->u1(Lcom/friday/paint/view/StudentPaintFragment;)Lcom/friday/paint/viewmodel/NoteViewModel;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-virtual {v2}, Lcom/friday/paint/viewmodel/NoteViewModel;->x()Landroidx/lifecycle/MutableLiveData;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-virtual {v2}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    check-cast v2, Ljava/lang/Integer;

    .line 60
    .line 61
    const/4 v5, 0x0

    .line 62
    if-eqz v2, :cond_8

    .line 63
    .line 64
    iget-object v6, v0, Lcom/friday/paint/view/StudentPaintFragment$initObserver$1$1;->i:Lcom/friday/paint/view/StudentPaintFragment;

    .line 65
    .line 66
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    invoke-virtual {v6}, Lcom/friday/paint/view/ThePaintFragment;->t0()Lcom/friday/paint/adapter/NoteFragmentStateAdapter;

    .line 71
    .line 72
    .line 73
    move-result-object v7

    .line 74
    invoke-virtual {v7}, Lcom/friday/paint/adapter/NoteFragmentStateAdapter;->getData()Ljava/util/List;

    .line 75
    .line 76
    .line 77
    move-result-object v7

    .line 78
    invoke-interface {v7, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v7

    .line 82
    check-cast v7, Lcom/friday/paint/model/PaintEntity;

    .line 83
    .line 84
    invoke-virtual {v7}, Lcom/friday/paint/model/PaintEntity;->getPath()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v7

    .line 88
    new-instance v8, Ljava/io/File;

    .line 89
    .line 90
    const-string v9, "thumbnail.jpg"

    .line 91
    .line 92
    invoke-direct {v8, v7, v9}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v8}, Ljava/io/File;->exists()Z

    .line 96
    .line 97
    .line 98
    move-result v9

    .line 99
    const/4 v10, 0x0

    .line 100
    if-nez v9, :cond_4

    .line 101
    .line 102
    invoke-static {}, Lsd/r0;->c()Lsd/t1;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    new-instance v9, Lcom/friday/paint/view/StudentPaintFragment$initObserver$1$1$1$1$1;

    .line 107
    .line 108
    invoke-direct {v9, v6, v5}, Lcom/friday/paint/view/StudentPaintFragment$initObserver$1$1$1$1$1;-><init>(Lcom/friday/paint/view/StudentPaintFragment;Lvc/c;)V

    .line 109
    .line 110
    .line 111
    invoke-static {v7}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v5

    .line 115
    iput-object v5, v0, Lcom/friday/paint/view/StudentPaintFragment$initObserver$1$1;->f:Ljava/lang/Object;

    .line 116
    .line 117
    invoke-static {v8}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v5

    .line 121
    iput-object v5, v0, Lcom/friday/paint/view/StudentPaintFragment$initObserver$1$1;->g:Ljava/lang/Object;

    .line 122
    .line 123
    iput v2, v0, Lcom/friday/paint/view/StudentPaintFragment$initObserver$1$1;->c:I

    .line 124
    .line 125
    iput v10, v0, Lcom/friday/paint/view/StudentPaintFragment$initObserver$1$1;->d:I

    .line 126
    .line 127
    iput v10, v0, Lcom/friday/paint/view/StudentPaintFragment$initObserver$1$1;->e:I

    .line 128
    .line 129
    iput v4, v0, Lcom/friday/paint/view/StudentPaintFragment$initObserver$1$1;->h:I

    .line 130
    .line 131
    invoke-static {v3, v9, v0}, Lsd/f;->g(Lkotlin/coroutines/d;Lhd/p;Lvc/c;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    if-ne v2, v1, :cond_3

    .line 136
    .line 137
    goto/16 :goto_4

    .line 138
    .line 139
    :cond_3
    :goto_0
    sget-object v1, Lqc/q;->a:Lqc/q;

    .line 140
    .line 141
    return-object v1

    .line 142
    :cond_4
    invoke-static {}, Lk2/u;->a()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    new-instance v7, Ljava/lang/StringBuilder;

    .line 147
    .line 148
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    const-string v2, ".jpg"

    .line 155
    .line 156
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    sget-object v7, Lk2/q;->a:Lk2/q;

    .line 164
    .line 165
    new-instance v9, Ljava/io/FileInputStream;

    .line 166
    .line 167
    invoke-direct {v9, v8}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v7, v2, v9}, Lk2/q;->c(Ljava/lang/String;Ljava/io/InputStream;)Z

    .line 171
    .line 172
    .line 173
    move-result v7

    .line 174
    if-eqz v7, :cond_5

    .line 175
    .line 176
    :goto_1
    move-object v12, v2

    .line 177
    goto :goto_2

    .line 178
    :cond_5
    const-string v2, ""

    .line 179
    .line 180
    goto :goto_1

    .line 181
    :goto_2
    invoke-static {v12}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 182
    .line 183
    .line 184
    move-result v2

    .line 185
    if-eqz v2, :cond_6

    .line 186
    .line 187
    const-string v1, "\u4f5c\u4e1a\u4e0a\u4f20\u5931\u8d25"

    .line 188
    .line 189
    invoke-static {v1}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v6, v10}, Lcom/friday/common/base/BaseFragment;->isShowLoading(Z)V

    .line 193
    .line 194
    .line 195
    sget-object v1, Lqc/q;->a:Lqc/q;

    .line 196
    .line 197
    return-object v1

    .line 198
    :cond_6
    const-class v2, Lcom/friday/common/entity/MqttEntity;

    .line 199
    .line 200
    invoke-static {v2}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/Class;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 201
    .line 202
    .line 203
    move-result-object v2

    .line 204
    new-instance v7, Lcom/friday/common/entity/MqttEntity;

    .line 205
    .line 206
    sget-object v8, Lcom/friday/common/entity/MqttType;->REQUEST_SUBMIT_HOMEWORK:Lcom/friday/common/entity/MqttType;

    .line 207
    .line 208
    new-instance v9, Lcom/friday/common/classtest/MqttResponse;

    .line 209
    .line 210
    invoke-static {v6}, Lcom/friday/paint/view/StudentPaintFragment;->t1(Lcom/friday/paint/view/StudentPaintFragment;)Lcom/friday/paint/viewmodel/DoHomeworkViewModel;

    .line 211
    .line 212
    .line 213
    move-result-object v10

    .line 214
    invoke-virtual {v10}, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->l()Lcom/friday/common/classtest/MqttResponse;

    .line 215
    .line 216
    .line 217
    move-result-object v10

    .line 218
    if-eqz v10, :cond_7

    .line 219
    .line 220
    invoke-virtual {v10}, Lcom/friday/common/classtest/MqttResponse;->getGuid()Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v10

    .line 224
    goto :goto_3

    .line 225
    :cond_7
    move-object v10, v5

    .line 226
    :goto_3
    invoke-static {v10}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v10

    .line 230
    new-instance v11, Lcom/friday/common/classtest/MqttResponse$Data;

    .line 231
    .line 232
    invoke-static {v6}, Lcom/friday/paint/view/StudentPaintFragment;->s1(Lcom/friday/paint/view/StudentPaintFragment;)I

    .line 233
    .line 234
    .line 235
    move-result v13

    .line 236
    new-instance v15, Lcom/friday/common/classtest/MqttResponse$Student;

    .line 237
    .line 238
    sget-object v6, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 239
    .line 240
    invoke-virtual {v6}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 241
    .line 242
    .line 243
    move-result-object v14

    .line 244
    invoke-virtual {v14}, Lcom/friday/common/helper/b;->u()Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object v14

    .line 248
    invoke-virtual {v6}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 249
    .line 250
    .line 251
    move-result-object v6

    .line 252
    invoke-virtual {v6}, Lcom/friday/common/helper/b;->t()J

    .line 253
    .line 254
    .line 255
    move-result-wide v16

    .line 256
    invoke-static/range {v16 .. v17}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v6

    .line 260
    invoke-direct {v15, v14, v6}, Lcom/friday/common/classtest/MqttResponse$Student;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 261
    .line 262
    .line 263
    new-instance v16, Ljava/util/ArrayList;

    .line 264
    .line 265
    invoke-direct/range {v16 .. v16}, Ljava/util/ArrayList;-><init>()V

    .line 266
    .line 267
    .line 268
    const/16 v17, 0x1

    .line 269
    .line 270
    const/16 v18, 0x0

    .line 271
    .line 272
    const/4 v14, 0x1

    .line 273
    invoke-direct/range {v11 .. v18}, Lcom/friday/common/classtest/MqttResponse$Data;-><init>(Ljava/lang/String;IILcom/friday/common/classtest/MqttResponse$Student;Ljava/util/List;ZLcom/friday/common/classtest/MqttResponse$QuestionInfo;)V

    .line 274
    .line 275
    .line 276
    invoke-direct {v9, v10, v4, v11}, Lcom/friday/common/classtest/MqttResponse;-><init>(Ljava/lang/String;ILcom/friday/common/classtest/MqttResponse$Data;)V

    .line 277
    .line 278
    .line 279
    invoke-static {v9}, Lcom/blankj/utilcode/util/GsonUtils;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    .line 280
    .line 281
    .line 282
    move-result-object v15

    .line 283
    const-string v4, "toJson(...)"

    .line 284
    .line 285
    invoke-static {v15, v4}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 286
    .line 287
    .line 288
    const/16 v17, 0x4

    .line 289
    .line 290
    const/16 v16, 0x0

    .line 291
    .line 292
    move-object v13, v7

    .line 293
    move-object v14, v8

    .line 294
    invoke-direct/range {v13 .. v18}, Lcom/friday/common/entity/MqttEntity;-><init>(Lcom/friday/common/entity/MqttType;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/n;)V

    .line 295
    .line 296
    .line 297
    invoke-interface {v2, v13}, Lcom/jeremyliao/liveeventbus/core/Observable;->post(Ljava/lang/Object;)V

    .line 298
    .line 299
    .line 300
    const-string v2, "submitHomeworkOver"

    .line 301
    .line 302
    invoke-static {v2}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 303
    .line 304
    .line 305
    move-result-object v2

    .line 306
    invoke-interface {v2, v5}, Lcom/jeremyliao/liveeventbus/core/Observable;->post(Ljava/lang/Object;)V

    .line 307
    .line 308
    .line 309
    :cond_8
    invoke-static {}, Lsd/r0;->c()Lsd/t1;

    .line 310
    .line 311
    .line 312
    move-result-object v2

    .line 313
    new-instance v4, Lcom/friday/paint/view/StudentPaintFragment$initObserver$1$1$2;

    .line 314
    .line 315
    iget-object v6, v0, Lcom/friday/paint/view/StudentPaintFragment$initObserver$1$1;->i:Lcom/friday/paint/view/StudentPaintFragment;

    .line 316
    .line 317
    invoke-direct {v4, v6, v5}, Lcom/friday/paint/view/StudentPaintFragment$initObserver$1$1$2;-><init>(Lcom/friday/paint/view/StudentPaintFragment;Lvc/c;)V

    .line 318
    .line 319
    .line 320
    iput v3, v0, Lcom/friday/paint/view/StudentPaintFragment$initObserver$1$1;->h:I

    .line 321
    .line 322
    invoke-static {v2, v4, v0}, Lsd/f;->g(Lkotlin/coroutines/d;Lhd/p;Lvc/c;)Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    move-result-object v2

    .line 326
    if-ne v2, v1, :cond_9

    .line 327
    .line 328
    :goto_4
    return-object v1

    .line 329
    :cond_9
    :goto_5
    sget-object v1, Lqc/q;->a:Lqc/q;

    .line 330
    .line 331
    return-object v1
.end method
