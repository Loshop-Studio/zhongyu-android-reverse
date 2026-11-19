# RE note 本类字节码直接引用的读写或显示接口包括文件流。
.class final Lcom/friday/lecture/floatwindow/homework/HomeworkLayout$arrangeTask$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->x()V
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
    c = "com.friday.lecture.floatwindow.homework.HomeworkLayout$arrangeTask$1"
    f = "HomeworkLayout.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public final synthetic d:Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;


# direct methods
.method public constructor <init>(Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout$arrangeTask$1;->d:Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;

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

.method public static synthetic g(Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout$arrangeTask$1;->m(Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;)V

    return-void
.end method

.method public static final m(Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->v(Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    sget-object p0, Ld3/a;->a:Ld3/a;

    .line 8
    .line 9
    invoke-virtual {p0}, Ld3/a;->l()V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    sget-object p0, Ld3/a;->a:Ld3/a;

    .line 14
    .line 15
    invoke-virtual {p0}, Ld3/a;->h()V

    .line 16
    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 1

    .line 1
    new-instance p1, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout$arrangeTask$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout$arrangeTask$1;->d:Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout$arrangeTask$1;-><init>(Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;Lvc/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout$arrangeTask$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout$arrangeTask$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout$arrangeTask$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout$arrangeTask$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout$arrangeTask$1;->c:I

    .line 5
    .line 6
    if-nez v0, :cond_6

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    :try_start_0
    const-string p1, ""

    .line 12
    .line 13
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout$arrangeTask$1;->d:Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {v0}, Lk2/k;->k(Landroid/content/Context;)Lk2/k;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const-string v1, "\u6b63\u5728\u5e03\u7f6e\u968f\u5802\u6d4b"

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Lk2/k;->o(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout$arrangeTask$1;->d:Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;

    .line 29
    .line 30
    invoke-static {v0}, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->p(Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;)Landroid/graphics/Bitmap;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    if-eqz v0, :cond_0

    .line 35
    .line 36
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout$arrangeTask$1;->d:Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;

    .line 37
    .line 38
    invoke-static {}, Lk2/u;->a()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    new-instance v2, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string v1, ".jpg"

    .line 51
    .line 52
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-static {}, Lcom/blankj/utilcode/util/PathUtils;->getExternalAppCachePath()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    new-instance v3, Ljava/lang/StringBuilder;

    .line 64
    .line 65
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    const-string v2, "/"

    .line 72
    .line 73
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    invoke-static {v0}, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->p(Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;)Landroid/graphics/Bitmap;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    sget-object v3, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    .line 88
    .line 89
    invoke-static {v0, v2, v3}, Lcom/blankj/utilcode/util/ImageUtils;->save(Landroid/graphics/Bitmap;Ljava/lang/String;Landroid/graphics/Bitmap$CompressFormat;)Z

    .line 90
    .line 91
    .line 92
    new-instance v0, Ljava/io/File;

    .line 93
    .line 94
    invoke-direct {v0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    sget-object v2, Lk2/q;->a:Lk2/q;

    .line 98
    .line 99
    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    new-instance v4, Ljava/io/FileInputStream;

    .line 104
    .line 105
    invoke-direct {v4, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v2, v3, v4}, Lk2/q;->c(Ljava/lang/String;Ljava/io/InputStream;)Z

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    if-eqz v0, :cond_0

    .line 113
    .line 114
    move-object p1, v1

    .line 115
    :cond_0
    move-object v1, p1

    .line 116
    goto :goto_0

    .line 117
    :catch_0
    move-exception v0

    .line 118
    move-object p1, v0

    .line 119
    goto/16 :goto_5

    .line 120
    .line 121
    :goto_0
    sget-object p1, Lcom/friday/lecture/model/ClassTestHelper;->INSTANCE:Lcom/friday/lecture/model/ClassTestHelper;

    .line 122
    .line 123
    new-instance v8, Lcom/friday/common/classtest/MqttResponse;

    .line 124
    .line 125
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 126
    .line 127
    .line 128
    move-result-wide v2

    .line 129
    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v9

    .line 133
    new-instance v0, Lcom/friday/common/classtest/MqttResponse$Data;

    .line 134
    .line 135
    iget-object v2, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout$arrangeTask$1;->d:Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;

    .line 136
    .line 137
    invoke-static {v2}, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->v(Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;)Z

    .line 138
    .line 139
    .line 140
    move-result v2

    .line 141
    const/4 v10, 0x0

    .line 142
    if-eqz v2, :cond_1

    .line 143
    .line 144
    move v2, v10

    .line 145
    goto :goto_1

    .line 146
    :cond_1
    iget-object v2, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout$arrangeTask$1;->d:Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;

    .line 147
    .line 148
    invoke-static {v2}, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->u(Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;)Z

    .line 149
    .line 150
    .line 151
    move-result v2

    .line 152
    if-eqz v2, :cond_2

    .line 153
    .line 154
    const/4 v2, 0x1

    .line 155
    goto :goto_1

    .line 156
    :cond_2
    const/4 v2, 0x2

    .line 157
    :goto_1
    iget-object v3, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout$arrangeTask$1;->d:Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;

    .line 158
    .line 159
    invoke-static {v3}, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->v(Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;)Z

    .line 160
    .line 161
    .line 162
    move-result v3

    .line 163
    if-eqz v3, :cond_3

    .line 164
    .line 165
    move v3, v10

    .line 166
    goto :goto_2

    .line 167
    :cond_3
    iget-object v3, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout$arrangeTask$1;->d:Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;

    .line 168
    .line 169
    invoke-static {v3}, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->s(Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;)I

    .line 170
    .line 171
    .line 172
    move-result v3

    .line 173
    :goto_2
    new-instance v5, Ljava/util/ArrayList;

    .line 174
    .line 175
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 176
    .line 177
    .line 178
    new-instance v7, Lcom/friday/common/classtest/MqttResponse$QuestionInfo;

    .line 179
    .line 180
    iget-object v4, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout$arrangeTask$1;->d:Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;

    .line 181
    .line 182
    invoke-static {v4}, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->v(Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;)Z

    .line 183
    .line 184
    .line 185
    move-result v4

    .line 186
    if-eqz v4, :cond_4

    .line 187
    .line 188
    move v4, v10

    .line 189
    goto :goto_3

    .line 190
    :cond_4
    iget-object v4, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout$arrangeTask$1;->d:Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;

    .line 191
    .line 192
    invoke-static {v4}, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->t(Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;)I

    .line 193
    .line 194
    .line 195
    move-result v4

    .line 196
    :goto_3
    iget-object v6, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout$arrangeTask$1;->d:Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;

    .line 197
    .line 198
    invoke-static {v6}, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->v(Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;)Z

    .line 199
    .line 200
    .line 201
    move-result v6

    .line 202
    if-eqz v6, :cond_5

    .line 203
    .line 204
    move v6, v10

    .line 205
    goto :goto_4

    .line 206
    :cond_5
    iget-object v6, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout$arrangeTask$1;->d:Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;

    .line 207
    .line 208
    invoke-static {v6}, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->s(Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;)I

    .line 209
    .line 210
    .line 211
    move-result v6

    .line 212
    :goto_4
    invoke-direct {v7, v4, v6}, Lcom/friday/common/classtest/MqttResponse$QuestionInfo;-><init>(II)V

    .line 213
    .line 214
    .line 215
    const/4 v4, 0x0

    .line 216
    const/4 v6, 0x1

    .line 217
    invoke-direct/range {v0 .. v7}, Lcom/friday/common/classtest/MqttResponse$Data;-><init>(Ljava/lang/String;IILcom/friday/common/classtest/MqttResponse$Student;Ljava/util/List;ZLcom/friday/common/classtest/MqttResponse$QuestionInfo;)V

    .line 218
    .line 219
    .line 220
    invoke-direct {v8, v9, v10, v0}, Lcom/friday/common/classtest/MqttResponse;-><init>(Ljava/lang/String;ILcom/friday/common/classtest/MqttResponse$Data;)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {p1, v8}, Lcom/friday/lecture/model/ClassTestHelper;->setRecentlyHomework(Lcom/friday/common/classtest/MqttResponse;)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {p1}, Lcom/friday/lecture/model/ClassTestHelper;->getRecentlyHomework()Lcom/friday/common/classtest/MqttResponse;

    .line 227
    .line 228
    .line 229
    move-result-object p1

    .line 230
    invoke-static {p1}, Lcom/blankj/utilcode/util/GsonUtils;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v2

    .line 234
    const-class p1, Lcom/friday/common/entity/MqttEntity;

    .line 235
    .line 236
    invoke-static {p1}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/Class;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 237
    .line 238
    .line 239
    move-result-object p1

    .line 240
    new-instance v0, Lcom/friday/common/entity/MqttEntity;

    .line 241
    .line 242
    sget-object v1, Lcom/friday/common/entity/MqttType;->ARRANGE_HOMEWORK:Lcom/friday/common/entity/MqttType;

    .line 243
    .line 244
    invoke-static {v2}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 245
    .line 246
    .line 247
    const/4 v4, 0x4

    .line 248
    const/4 v5, 0x0

    .line 249
    const/4 v3, 0x0

    .line 250
    invoke-direct/range {v0 .. v5}, Lcom/friday/common/entity/MqttEntity;-><init>(Lcom/friday/common/entity/MqttType;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/n;)V

    .line 251
    .line 252
    .line 253
    invoke-interface {p1, v0}, Lcom/jeremyliao/liveeventbus/core/Observable;->post(Ljava/lang/Object;)V

    .line 254
    .line 255
    .line 256
    iget-object p1, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout$arrangeTask$1;->d:Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;

    .line 257
    .line 258
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 259
    .line 260
    .line 261
    move-result-object p1

    .line 262
    invoke-static {p1}, Lk2/k;->k(Landroid/content/Context;)Lk2/k;

    .line 263
    .line 264
    .line 265
    move-result-object p1

    .line 266
    invoke-virtual {p1}, Lk2/k;->l()V

    .line 267
    .line 268
    .line 269
    iget-object p1, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout$arrangeTask$1;->d:Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;

    .line 270
    .line 271
    new-instance v0, Lcom/friday/lecture/floatwindow/homework/a;

    .line 272
    .line 273
    invoke-direct {v0, p1}, Lcom/friday/lecture/floatwindow/homework/a;-><init>(Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;)V

    .line 274
    .line 275
    .line 276
    invoke-static {v0}, Lcom/blankj/utilcode/util/ThreadUtils;->runOnUiThread(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 277
    .line 278
    .line 279
    goto :goto_6

    .line 280
    :goto_5
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 281
    .line 282
    .line 283
    iget-object p1, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout$arrangeTask$1;->d:Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;

    .line 284
    .line 285
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 286
    .line 287
    .line 288
    move-result-object p1

    .line 289
    invoke-static {p1}, Lk2/k;->k(Landroid/content/Context;)Lk2/k;

    .line 290
    .line 291
    .line 292
    move-result-object p1

    .line 293
    const-string v0, "\u5e03\u7f6e\u968f\u5802\u6d4b\u5931\u8d25"

    .line 294
    .line 295
    invoke-virtual {p1, v0}, Lk2/k;->n(Ljava/lang/String;)V

    .line 296
    .line 297
    .line 298
    :goto_6
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 299
    .line 300
    return-object p1

    .line 301
    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 302
    .line 303
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 304
    .line 305
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 306
    .line 307
    .line 308
    throw p1
.end method
