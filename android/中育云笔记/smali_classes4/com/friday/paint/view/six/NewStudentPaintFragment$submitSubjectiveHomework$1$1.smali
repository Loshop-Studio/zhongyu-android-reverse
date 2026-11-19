.class final Lcom/friday/paint/view/six/NewStudentPaintFragment$submitSubjectiveHomework$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/paint/view/six/NewStudentPaintFragment;->submitSubjectiveHomework()V
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
    c = "com.friday.paint.view.six.NewStudentPaintFragment$submitSubjectiveHomework$1$1"
    f = "NewStudentPaintFragment.kt"
    l = {
        0x1cf,
        0x1d6
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:I

.field public final synthetic f:Ljava/lang/String;

.field public final synthetic g:Lcom/friday/paint/view/six/NewStudentPaintFragment;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/friday/paint/view/six/NewStudentPaintFragment;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment$submitSubjectiveHomework$1$1;->f:Ljava/lang/String;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment$submitSubjectiveHomework$1$1;->g:Lcom/friday/paint/view/six/NewStudentPaintFragment;

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
    new-instance p1, Lcom/friday/paint/view/six/NewStudentPaintFragment$submitSubjectiveHomework$1$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment$submitSubjectiveHomework$1$1;->f:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment$submitSubjectiveHomework$1$1;->g:Lcom/friday/paint/view/six/NewStudentPaintFragment;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/friday/paint/view/six/NewStudentPaintFragment$submitSubjectiveHomework$1$1;-><init>(Ljava/lang/String;Lcom/friday/paint/view/six/NewStudentPaintFragment;Lvc/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/friday/paint/view/six/NewStudentPaintFragment$submitSubjectiveHomework$1$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/paint/view/six/NewStudentPaintFragment$submitSubjectiveHomework$1$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/paint/view/six/NewStudentPaintFragment$submitSubjectiveHomework$1$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/paint/view/six/NewStudentPaintFragment$submitSubjectiveHomework$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v1, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment$submitSubjectiveHomework$1$1;->e:I

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    const/4 v3, 0x1

    .line 9
    const/4 v4, 0x0

    .line 10
    if-eqz v1, :cond_2

    .line 11
    .line 12
    if-eq v1, v3, :cond_1

    .line 13
    .line 14
    if-ne v1, v2, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment$submitSubjectiveHomework$1$1;->d:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Ljava/lang/String;

    .line 19
    .line 20
    iget-object v1, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment$submitSubjectiveHomework$1$1;->c:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v1, Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    goto/16 :goto_2

    .line 28
    .line 29
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 30
    .line 31
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 32
    .line 33
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw p1

    .line 37
    :cond_1
    iget-object v0, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment$submitSubjectiveHomework$1$1;->c:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v0, Ljava/lang/String;

    .line 40
    .line 41
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    iget-object p1, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment$submitSubjectiveHomework$1$1;->f:Ljava/lang/String;

    .line 49
    .line 50
    if-eqz p1, :cond_a

    .line 51
    .line 52
    invoke-static {p1}, Lqd/c0;->h0(Ljava/lang/CharSequence;)Z

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    if-eqz p1, :cond_3

    .line 57
    .line 58
    goto/16 :goto_6

    .line 59
    .line 60
    :cond_3
    iget-object p1, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment$submitSubjectiveHomework$1$1;->g:Lcom/friday/paint/view/six/NewStudentPaintFragment;

    .line 61
    .line 62
    invoke-static {p1}, Lcom/friday/paint/view/six/NewStudentPaintFragment;->access$getViewModel2(Lcom/friday/paint/view/six/NewStudentPaintFragment;)Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    iget-object v1, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment$submitSubjectiveHomework$1$1;->f:Ljava/lang/String;

    .line 67
    .line 68
    invoke-virtual {p1, v1}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->J(Ljava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-static {p1}, Lcom/blankj/utilcode/util/FileUtils;->isFileExists(Ljava/lang/String;)Z

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    if-nez v1, :cond_5

    .line 77
    .line 78
    invoke-static {}, Lsd/r0;->c()Lsd/t1;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    new-instance v2, Lcom/friday/paint/view/six/NewStudentPaintFragment$submitSubjectiveHomework$1$1$1;

    .line 83
    .line 84
    iget-object v5, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment$submitSubjectiveHomework$1$1;->g:Lcom/friday/paint/view/six/NewStudentPaintFragment;

    .line 85
    .line 86
    invoke-direct {v2, v5, v4}, Lcom/friday/paint/view/six/NewStudentPaintFragment$submitSubjectiveHomework$1$1$1;-><init>(Lcom/friday/paint/view/six/NewStudentPaintFragment;Lvc/c;)V

    .line 87
    .line 88
    .line 89
    invoke-static {p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    iput-object p1, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment$submitSubjectiveHomework$1$1;->c:Ljava/lang/Object;

    .line 94
    .line 95
    iput v3, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment$submitSubjectiveHomework$1$1;->e:I

    .line 96
    .line 97
    invoke-static {v1, v2, p0}, Lsd/f;->g(Lkotlin/coroutines/d;Lhd/p;Lvc/c;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    if-ne p1, v0, :cond_4

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_4
    :goto_0
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 105
    .line 106
    return-object p1

    .line 107
    :cond_5
    invoke-static {}, Lk2/u;->a()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    new-instance v5, Ljava/lang/StringBuilder;

    .line 112
    .line 113
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    const-string v1, ".jpg"

    .line 120
    .line 121
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    invoke-static {}, Lsd/r0;->b()Lsd/e0;

    .line 129
    .line 130
    .line 131
    move-result-object v5

    .line 132
    new-instance v6, Lcom/friday/paint/view/six/NewStudentPaintFragment$submitSubjectiveHomework$1$1$uploadStatus$1;

    .line 133
    .line 134
    invoke-direct {v6, v1, p1, v4}, Lcom/friday/paint/view/six/NewStudentPaintFragment$submitSubjectiveHomework$1$1$uploadStatus$1;-><init>(Ljava/lang/String;Ljava/lang/String;Lvc/c;)V

    .line 135
    .line 136
    .line 137
    invoke-static {p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    iput-object p1, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment$submitSubjectiveHomework$1$1;->c:Ljava/lang/Object;

    .line 142
    .line 143
    iput-object v1, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment$submitSubjectiveHomework$1$1;->d:Ljava/lang/Object;

    .line 144
    .line 145
    iput v2, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment$submitSubjectiveHomework$1$1;->e:I

    .line 146
    .line 147
    invoke-static {v5, v6, p0}, Lsd/f;->g(Lkotlin/coroutines/d;Lhd/p;Lvc/c;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    if-ne p1, v0, :cond_6

    .line 152
    .line 153
    :goto_1
    return-object v0

    .line 154
    :cond_6
    move-object v0, v1

    .line 155
    :goto_2
    check-cast p1, Ljava/lang/Boolean;

    .line 156
    .line 157
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 158
    .line 159
    .line 160
    move-result p1

    .line 161
    if-eqz p1, :cond_7

    .line 162
    .line 163
    :goto_3
    move-object v6, v0

    .line 164
    goto :goto_4

    .line 165
    :cond_7
    const-string v0, ""

    .line 166
    .line 167
    goto :goto_3

    .line 168
    :goto_4
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 169
    .line 170
    .line 171
    move-result p1

    .line 172
    if-eqz p1, :cond_8

    .line 173
    .line 174
    const-string p1, "\u4f5c\u4e1a\u4e0a\u4f20\u5931\u8d25"

    .line 175
    .line 176
    invoke-static {p1}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 177
    .line 178
    .line 179
    iget-object p1, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment$submitSubjectiveHomework$1$1;->g:Lcom/friday/paint/view/six/NewStudentPaintFragment;

    .line 180
    .line 181
    const/4 v0, 0x0

    .line 182
    invoke-virtual {p1, v0}, Lcom/friday/common/base/BaseFragment;->isShowLoading(Z)V

    .line 183
    .line 184
    .line 185
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 186
    .line 187
    return-object p1

    .line 188
    :cond_8
    const-class p1, Lcom/friday/common/entity/MqttEntity;

    .line 189
    .line 190
    invoke-static {p1}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/Class;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    new-instance v0, Lcom/friday/common/entity/MqttEntity;

    .line 195
    .line 196
    sget-object v1, Lcom/friday/common/entity/MqttType;->REQUEST_SUBMIT_HOMEWORK:Lcom/friday/common/entity/MqttType;

    .line 197
    .line 198
    new-instance v2, Lcom/friday/common/classtest/MqttResponse;

    .line 199
    .line 200
    iget-object v5, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment$submitSubjectiveHomework$1$1;->g:Lcom/friday/paint/view/six/NewStudentPaintFragment;

    .line 201
    .line 202
    invoke-static {v5}, Lcom/friday/paint/view/six/NewStudentPaintFragment;->access$getViewModel(Lcom/friday/paint/view/six/NewStudentPaintFragment;)Lcom/friday/paint/viewmodel/DoHomeworkViewModel;

    .line 203
    .line 204
    .line 205
    move-result-object v5

    .line 206
    invoke-virtual {v5}, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->l()Lcom/friday/common/classtest/MqttResponse;

    .line 207
    .line 208
    .line 209
    move-result-object v5

    .line 210
    if-eqz v5, :cond_9

    .line 211
    .line 212
    invoke-virtual {v5}, Lcom/friday/common/classtest/MqttResponse;->getGuid()Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v5

    .line 216
    goto :goto_5

    .line 217
    :cond_9
    move-object v5, v4

    .line 218
    :goto_5
    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v13

    .line 222
    new-instance v5, Lcom/friday/common/classtest/MqttResponse$Data;

    .line 223
    .line 224
    iget-object v7, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment$submitSubjectiveHomework$1$1;->g:Lcom/friday/paint/view/six/NewStudentPaintFragment;

    .line 225
    .line 226
    invoke-static {v7}, Lcom/friday/paint/view/six/NewStudentPaintFragment;->access$getQstType$p(Lcom/friday/paint/view/six/NewStudentPaintFragment;)I

    .line 227
    .line 228
    .line 229
    move-result v7

    .line 230
    new-instance v9, Lcom/friday/common/classtest/MqttResponse$Student;

    .line 231
    .line 232
    sget-object v8, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 233
    .line 234
    invoke-virtual {v8}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 235
    .line 236
    .line 237
    move-result-object v10

    .line 238
    invoke-virtual {v10}, Lcom/friday/common/helper/b;->u()Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v10

    .line 242
    invoke-virtual {v8}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 243
    .line 244
    .line 245
    move-result-object v8

    .line 246
    invoke-virtual {v8}, Lcom/friday/common/helper/b;->t()J

    .line 247
    .line 248
    .line 249
    move-result-wide v11

    .line 250
    invoke-static {v11, v12}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v8

    .line 254
    invoke-direct {v9, v10, v8}, Lcom/friday/common/classtest/MqttResponse$Student;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 255
    .line 256
    .line 257
    new-instance v10, Ljava/util/ArrayList;

    .line 258
    .line 259
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 260
    .line 261
    .line 262
    const/4 v11, 0x1

    .line 263
    const/4 v12, 0x0

    .line 264
    const/4 v8, 0x1

    .line 265
    invoke-direct/range {v5 .. v12}, Lcom/friday/common/classtest/MqttResponse$Data;-><init>(Ljava/lang/String;IILcom/friday/common/classtest/MqttResponse$Student;Ljava/util/List;ZLcom/friday/common/classtest/MqttResponse$QuestionInfo;)V

    .line 266
    .line 267
    .line 268
    invoke-direct {v2, v13, v3, v5}, Lcom/friday/common/classtest/MqttResponse;-><init>(Ljava/lang/String;ILcom/friday/common/classtest/MqttResponse$Data;)V

    .line 269
    .line 270
    .line 271
    invoke-static {v2}, Lcom/blankj/utilcode/util/GsonUtils;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object v9

    .line 275
    const-string v2, "toJson(...)"

    .line 276
    .line 277
    invoke-static {v9, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 278
    .line 279
    .line 280
    const/4 v11, 0x4

    .line 281
    const/4 v10, 0x0

    .line 282
    move-object v7, v0

    .line 283
    move-object v8, v1

    .line 284
    invoke-direct/range {v7 .. v12}, Lcom/friday/common/entity/MqttEntity;-><init>(Lcom/friday/common/entity/MqttType;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/n;)V

    .line 285
    .line 286
    .line 287
    invoke-interface {p1, v7}, Lcom/jeremyliao/liveeventbus/core/Observable;->post(Ljava/lang/Object;)V

    .line 288
    .line 289
    .line 290
    const-string p1, "submitHomeworkOver"

    .line 291
    .line 292
    invoke-static {p1}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 293
    .line 294
    .line 295
    move-result-object p1

    .line 296
    invoke-interface {p1, v4}, Lcom/jeremyliao/liveeventbus/core/Observable;->post(Ljava/lang/Object;)V

    .line 297
    .line 298
    .line 299
    :cond_a
    :goto_6
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 300
    .line 301
    return-object p1
.end method
