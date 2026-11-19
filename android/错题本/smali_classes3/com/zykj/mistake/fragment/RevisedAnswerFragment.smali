.class public final Lcom/zykj/mistake/fragment/RevisedAnswerFragment;
.super Lcom/zykj/mistake/base/BaseFragment;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/zykj/mistake/base/BaseFragment<",
        "Lcom/zykj/mistake/databinding/FragmentRevisedAnswerBinding;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Lcom/zykj/mistake/fragment/RevisedAnswerFragment;",
        "Lcom/zykj/mistake/base/BaseFragment;",
        "Lcom/zykj/mistake/databinding/FragmentRevisedAnswerBinding;",
        "<init>",
        "()V",
        "app_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nRevisedAnswerFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RevisedAnswerFragment.kt\ncom/zykj/mistake/fragment/RevisedAnswerFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,369:1\n1869#2,2:370\n1869#2,2:372\n1869#2,2:374\n1761#2,3:376\n1869#2,2:379\n1869#2:381\n1870#2:383\n1869#2:384\n1869#2,2:385\n1870#2:387\n1869#2:388\n774#2:389\n865#2,2:390\n774#2:392\n865#2,2:393\n1870#2:395\n1869#2,2:396\n1869#2,2:398\n1#3:382\n*S KotlinDebug\n*F\n+ 1 RevisedAnswerFragment.kt\ncom/zykj/mistake/fragment/RevisedAnswerFragment\n*L\n75#1:370,2\n78#1:372,2\n81#1:374,2\n107#1:376,3\n127#1:379,2\n140#1:381\n140#1:383\n180#1:384\n182#1:385,2\n180#1:387\n200#1:388\n206#1:389\n206#1:390,2\n208#1:392\n208#1:393,2\n200#1:395\n292#1:396,2\n329#1:398,2\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Ljava/util/ArrayList;

.field public final c:Ljava/util/ArrayList;

.field public final d:Ljava/util/ArrayList;

.field public e:Landroid/widget/LinearLayout;

.field public f:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/zykj/mistake/base/BaseFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/zykj/mistake/fragment/RevisedAnswerFragment;->b:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/zykj/mistake/fragment/RevisedAnswerFragment;->c:Ljava/util/ArrayList;

    .line 17
    .line 18
    new-instance v0, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lcom/zykj/mistake/fragment/RevisedAnswerFragment;->d:Ljava/util/ArrayList;

    .line 24
    .line 25
    const/4 v0, -0x1

    .line 26
    iput v0, p0, Lcom/zykj/mistake/fragment/RevisedAnswerFragment;->f:I

    .line 27
    .line 28
    return-void
.end method

.method public static synthetic i(Lcom/zykj/mistake/fragment/RevisedAnswerFragment;Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->getRevisingAnswers()Ljava/util/ArrayList;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->getRevisingComments()Ljava/util/ArrayList;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-string v2, ""

    .line 10
    .line 11
    invoke-virtual {p0, p1, v0, v1, v2}, Lcom/zykj/mistake/fragment/RevisedAnswerFragment;->h(Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final e()I
    .locals 1

    .line 1
    sget v0, Lcom/zykj/mistake/R$layout;->fragment_revised_answer:I

    .line 2
    .line 3
    return v0
.end method

.method public final g(Landroid/view/View;)V
    .locals 11

    .line 1
    sget v0, Lcom/zykj/mistake/R$id;->ll_answer:I

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const-string v0, "findViewById(...)"

    .line 8
    .line 9
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    check-cast p1, Landroid/widget/LinearLayout;

    .line 13
    .line 14
    iput-object p1, p0, Lcom/zykj/mistake/fragment/RevisedAnswerFragment;->e:Landroid/widget/LinearLayout;

    .line 15
    .line 16
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireArguments()Landroid/os/Bundle;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    const-string v0, "itemType"

    .line 21
    .line 22
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    iput p1, p0, Lcom/zykj/mistake/fragment/RevisedAnswerFragment;->f:I

    .line 27
    .line 28
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireArguments()Landroid/os/Bundle;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    const-string v0, "answerInfoList"

    .line 33
    .line 34
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireArguments()Landroid/os/Bundle;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    const-string v1, "qstFlowList"

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireArguments()Landroid/os/Bundle;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    const-string v2, "microClassForScreenList"

    .line 53
    .line 54
    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireArguments()Landroid/os/Bundle;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    const-string v3, "isShowAnswer"

    .line 63
    .line 64
    invoke-virtual {v2, v3}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    iget-object v3, p0, Lcom/zykj/mistake/fragment/RevisedAnswerFragment;->b:Ljava/util/ArrayList;

    .line 69
    .line 70
    const/4 v4, 0x0

    .line 71
    if-eqz p1, :cond_0

    .line 72
    .line 73
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 74
    .line 75
    .line 76
    move-result v5

    .line 77
    move v6, v4

    .line 78
    :goto_0
    if-ge v6, v5, :cond_0

    .line 79
    .line 80
    invoke-virtual {p1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v7

    .line 84
    add-int/lit8 v6, v6, 0x1

    .line 85
    .line 86
    check-cast v7, Ljava/lang/String;

    .line 87
    .line 88
    new-instance v8, Lcom/google/gson/g;

    .line 89
    .line 90
    invoke-direct {v8}, Lcom/google/gson/g;-><init>()V

    .line 91
    .line 92
    .line 93
    new-instance v9, Lk1/a;

    .line 94
    .line 95
    const-class v10, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;

    .line 96
    .line 97
    invoke-direct {v9, v10}, Lk1/a;-><init>(Ljava/lang/reflect/Type;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v8, v7, v9}, Lcom/google/gson/g;->c(Ljava/lang/String;Lk1/a;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v7

    .line 104
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_0
    if-eqz v0, :cond_1

    .line 109
    .line 110
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 111
    .line 112
    .line 113
    move-result p1

    .line 114
    move v5, v4

    .line 115
    :goto_1
    if-ge v5, p1, :cond_1

    .line 116
    .line 117
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v6

    .line 121
    add-int/lit8 v5, v5, 0x1

    .line 122
    .line 123
    check-cast v6, Ljava/lang/String;

    .line 124
    .line 125
    new-instance v7, Lcom/google/gson/g;

    .line 126
    .line 127
    invoke-direct {v7}, Lcom/google/gson/g;-><init>()V

    .line 128
    .line 129
    .line 130
    new-instance v8, Lk1/a;

    .line 131
    .line 132
    const-class v9, Lcom/zykj/mistake/entity/resp/MistakeDetail$QstFlowBean;

    .line 133
    .line 134
    invoke-direct {v8, v9}, Lk1/a;-><init>(Ljava/lang/reflect/Type;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v7, v6, v8}, Lcom/google/gson/g;->c(Ljava/lang/String;Lk1/a;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v6

    .line 141
    iget-object v7, p0, Lcom/zykj/mistake/fragment/RevisedAnswerFragment;->c:Ljava/util/ArrayList;

    .line 142
    .line 143
    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    goto :goto_1

    .line 147
    :cond_1
    if-eqz v1, :cond_2

    .line 148
    .line 149
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 150
    .line 151
    .line 152
    move-result p1

    .line 153
    move v0, v4

    .line 154
    :goto_2
    if-ge v0, p1, :cond_2

    .line 155
    .line 156
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v5

    .line 160
    add-int/lit8 v0, v0, 0x1

    .line 161
    .line 162
    check-cast v5, Ljava/lang/String;

    .line 163
    .line 164
    new-instance v6, Lcom/google/gson/g;

    .line 165
    .line 166
    invoke-direct {v6}, Lcom/google/gson/g;-><init>()V

    .line 167
    .line 168
    .line 169
    new-instance v7, Lk1/a;

    .line 170
    .line 171
    const-class v8, Lcom/zykj/mistake/entity/resp/MistakeDetail$QstMicroLessonBean;

    .line 172
    .line 173
    invoke-direct {v7, v8}, Lk1/a;-><init>(Ljava/lang/reflect/Type;)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v6, v5, v7}, Lcom/google/gson/g;->c(Ljava/lang/String;Lk1/a;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v5

    .line 180
    iget-object v6, p0, Lcom/zykj/mistake/fragment/RevisedAnswerFragment;->d:Ljava/util/ArrayList;

    .line 181
    .line 182
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    goto :goto_2

    .line 186
    :cond_2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireArguments()Landroid/os/Bundle;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    const-string v0, "isGroup"

    .line 191
    .line 192
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 193
    .line 194
    .line 195
    move-result p1

    .line 196
    const/4 v0, 0x0

    .line 197
    sget-object v1, Lcom/zykj/mistake/utils/d;->d:[Ljava/lang/String;

    .line 198
    .line 199
    const/4 v5, 0x1

    .line 200
    if-eqz p1, :cond_f

    .line 201
    .line 202
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 203
    .line 204
    .line 205
    move-result p1

    .line 206
    move v6, v4

    .line 207
    :goto_3
    if-ge v6, p1, :cond_e

    .line 208
    .line 209
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v7

    .line 213
    add-int/lit8 v6, v6, 0x1

    .line 214
    .line 215
    check-cast v7, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;

    .line 216
    .line 217
    invoke-virtual {v7}, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->getItemType()I

    .line 218
    .line 219
    .line 220
    move-result v8

    .line 221
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 222
    .line 223
    .line 224
    move-result-object v9

    .line 225
    if-eqz v8, :cond_3

    .line 226
    .line 227
    goto :goto_4

    .line 228
    :cond_3
    move-object v9, v0

    .line 229
    :goto_4
    if-eqz v9, :cond_4

    .line 230
    .line 231
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 232
    .line 233
    .line 234
    move-result v8

    .line 235
    goto :goto_5

    .line 236
    :cond_4
    iget v8, p0, Lcom/zykj/mistake/fragment/RevisedAnswerFragment;->f:I

    .line 237
    .line 238
    :goto_5
    sget-object v9, Lcom/zykj/mistake/utils/QuestionType;->TYPE_SINGLE:Lcom/zykj/mistake/utils/QuestionType;

    .line 239
    .line 240
    invoke-virtual {v9}, Lcom/zykj/mistake/utils/QuestionType;->getType()I

    .line 241
    .line 242
    .line 243
    move-result v9

    .line 244
    if-eq v8, v9, :cond_d

    .line 245
    .line 246
    sget-object v9, Lcom/zykj/mistake/utils/QuestionType;->TYPE_CLOZE:Lcom/zykj/mistake/utils/QuestionType;

    .line 247
    .line 248
    invoke-virtual {v9}, Lcom/zykj/mistake/utils/QuestionType;->getType()I

    .line 249
    .line 250
    .line 251
    move-result v9

    .line 252
    if-eq v8, v9, :cond_d

    .line 253
    .line 254
    sget-object v9, Lcom/zykj/mistake/utils/QuestionType;->TYPE_MULTIPLE:Lcom/zykj/mistake/utils/QuestionType;

    .line 255
    .line 256
    invoke-virtual {v9}, Lcom/zykj/mistake/utils/QuestionType;->getType()I

    .line 257
    .line 258
    .line 259
    move-result v9

    .line 260
    if-eq v8, v9, :cond_d

    .line 261
    .line 262
    sget-object v9, Lcom/zykj/mistake/utils/QuestionType;->TYPE_LISTEN:Lcom/zykj/mistake/utils/QuestionType;

    .line 263
    .line 264
    invoke-virtual {v9}, Lcom/zykj/mistake/utils/QuestionType;->getType()I

    .line 265
    .line 266
    .line 267
    move-result v9

    .line 268
    if-eq v8, v9, :cond_d

    .line 269
    .line 270
    sget-object v9, Lcom/zykj/mistake/utils/QuestionType;->TYPE_SEVEN_CHOICES_FIVE:Lcom/zykj/mistake/utils/QuestionType;

    .line 271
    .line 272
    invoke-virtual {v9}, Lcom/zykj/mistake/utils/QuestionType;->getType()I

    .line 273
    .line 274
    .line 275
    move-result v9

    .line 276
    if-eq v8, v9, :cond_d

    .line 277
    .line 278
    sget-object v9, Lcom/zykj/mistake/utils/QuestionType;->TYPE_JUDGE:Lcom/zykj/mistake/utils/QuestionType;

    .line 279
    .line 280
    invoke-virtual {v9}, Lcom/zykj/mistake/utils/QuestionType;->getType()I

    .line 281
    .line 282
    .line 283
    move-result v9

    .line 284
    if-ne v8, v9, :cond_5

    .line 285
    .line 286
    goto/16 :goto_6

    .line 287
    .line 288
    :cond_5
    sget-object v9, Lcom/zykj/mistake/utils/QuestionType;->TYPE_COMPREHENSION:Lcom/zykj/mistake/utils/QuestionType;

    .line 289
    .line 290
    invoke-virtual {v9}, Lcom/zykj/mistake/utils/QuestionType;->getType()I

    .line 291
    .line 292
    .line 293
    move-result v9

    .line 294
    if-ne v8, v9, :cond_b

    .line 295
    .line 296
    invoke-virtual {v7}, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->getExamAnswers()Ljava/util/ArrayList;

    .line 297
    .line 298
    .line 299
    move-result-object v8

    .line 300
    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    .line 301
    .line 302
    .line 303
    move-result v8

    .line 304
    if-nez v8, :cond_6

    .line 305
    .line 306
    invoke-virtual {v7}, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->getExamAnswers()Ljava/util/ArrayList;

    .line 307
    .line 308
    .line 309
    move-result-object v8

    .line 310
    invoke-virtual {v8, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    move-result-object v8

    .line 314
    check-cast v8, Ljava/lang/String;

    .line 315
    .line 316
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 317
    .line 318
    .line 319
    move-result v8

    .line 320
    if-ne v8, v5, :cond_6

    .line 321
    .line 322
    invoke-virtual {v7}, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->getExamAnswers()Ljava/util/ArrayList;

    .line 323
    .line 324
    .line 325
    move-result-object v8

    .line 326
    invoke-virtual {v8, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    move-result-object v8

    .line 330
    invoke-static {v1, v8}, Lkotlin/collections/q;->v([Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 331
    .line 332
    .line 333
    move-result v8

    .line 334
    if-nez v8, :cond_9

    .line 335
    .line 336
    :cond_6
    invoke-virtual {v7}, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->getExamComments()Ljava/util/ArrayList;

    .line 337
    .line 338
    .line 339
    move-result-object v8

    .line 340
    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    .line 341
    .line 342
    .line 343
    move-result v8

    .line 344
    if-nez v8, :cond_7

    .line 345
    .line 346
    invoke-virtual {v7}, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->getExamComments()Ljava/util/ArrayList;

    .line 347
    .line 348
    .line 349
    move-result-object v8

    .line 350
    invoke-virtual {v8, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 351
    .line 352
    .line 353
    move-result-object v8

    .line 354
    check-cast v8, Ljava/lang/String;

    .line 355
    .line 356
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 357
    .line 358
    .line 359
    move-result v8

    .line 360
    if-ne v8, v5, :cond_7

    .line 361
    .line 362
    invoke-virtual {v7}, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->getExamComments()Ljava/util/ArrayList;

    .line 363
    .line 364
    .line 365
    move-result-object v8

    .line 366
    invoke-virtual {v8, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 367
    .line 368
    .line 369
    move-result-object v8

    .line 370
    invoke-static {v1, v8}, Lkotlin/collections/q;->v([Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 371
    .line 372
    .line 373
    move-result v8

    .line 374
    if-nez v8, :cond_9

    .line 375
    .line 376
    :cond_7
    invoke-virtual {v7}, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->getRevisingAnswers()Ljava/util/ArrayList;

    .line 377
    .line 378
    .line 379
    move-result-object v8

    .line 380
    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    .line 381
    .line 382
    .line 383
    move-result v8

    .line 384
    if-nez v8, :cond_8

    .line 385
    .line 386
    invoke-virtual {v7}, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->getRevisingAnswers()Ljava/util/ArrayList;

    .line 387
    .line 388
    .line 389
    move-result-object v8

    .line 390
    invoke-virtual {v8, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 391
    .line 392
    .line 393
    move-result-object v8

    .line 394
    check-cast v8, Ljava/lang/String;

    .line 395
    .line 396
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 397
    .line 398
    .line 399
    move-result v8

    .line 400
    if-ne v8, v5, :cond_8

    .line 401
    .line 402
    invoke-virtual {v7}, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->getRevisingAnswers()Ljava/util/ArrayList;

    .line 403
    .line 404
    .line 405
    move-result-object v8

    .line 406
    invoke-virtual {v8, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 407
    .line 408
    .line 409
    move-result-object v8

    .line 410
    invoke-static {v1, v8}, Lkotlin/collections/q;->v([Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 411
    .line 412
    .line 413
    move-result v8

    .line 414
    if-nez v8, :cond_9

    .line 415
    .line 416
    :cond_8
    invoke-virtual {v7}, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->getRevisingComments()Ljava/util/ArrayList;

    .line 417
    .line 418
    .line 419
    move-result-object v8

    .line 420
    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    .line 421
    .line 422
    .line 423
    move-result v8

    .line 424
    if-nez v8, :cond_a

    .line 425
    .line 426
    invoke-virtual {v7}, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->getRevisingComments()Ljava/util/ArrayList;

    .line 427
    .line 428
    .line 429
    move-result-object v8

    .line 430
    invoke-virtual {v8, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 431
    .line 432
    .line 433
    move-result-object v8

    .line 434
    check-cast v8, Ljava/lang/String;

    .line 435
    .line 436
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 437
    .line 438
    .line 439
    move-result v8

    .line 440
    if-ne v8, v5, :cond_a

    .line 441
    .line 442
    invoke-virtual {v7}, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->getRevisingComments()Ljava/util/ArrayList;

    .line 443
    .line 444
    .line 445
    move-result-object v8

    .line 446
    invoke-virtual {v8, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 447
    .line 448
    .line 449
    move-result-object v8

    .line 450
    invoke-static {v1, v8}, Lkotlin/collections/q;->v([Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 451
    .line 452
    .line 453
    move-result v8

    .line 454
    if-eqz v8, :cond_a

    .line 455
    .line 456
    :cond_9
    invoke-virtual {p0, v7, v2}, Lcom/zykj/mistake/fragment/RevisedAnswerFragment;->j(Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;Z)V

    .line 457
    .line 458
    .line 459
    goto/16 :goto_3

    .line 460
    .line 461
    :cond_a
    invoke-static {p0, v7}, Lcom/zykj/mistake/fragment/RevisedAnswerFragment;->i(Lcom/zykj/mistake/fragment/RevisedAnswerFragment;Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;)V

    .line 462
    .line 463
    .line 464
    goto/16 :goto_3

    .line 465
    .line 466
    :cond_b
    sget-object v9, Lcom/zykj/mistake/utils/QuestionType;->TYPE_UNKNOW:Lcom/zykj/mistake/utils/QuestionType;

    .line 467
    .line 468
    invoke-virtual {v9}, Lcom/zykj/mistake/utils/QuestionType;->getType()I

    .line 469
    .line 470
    .line 471
    move-result v9

    .line 472
    if-ne v8, v9, :cond_c

    .line 473
    .line 474
    invoke-static {p0, v7}, Lcom/zykj/mistake/fragment/RevisedAnswerFragment;->i(Lcom/zykj/mistake/fragment/RevisedAnswerFragment;Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;)V

    .line 475
    .line 476
    .line 477
    goto/16 :goto_3

    .line 478
    .line 479
    :cond_c
    invoke-static {p0, v7}, Lcom/zykj/mistake/fragment/RevisedAnswerFragment;->i(Lcom/zykj/mistake/fragment/RevisedAnswerFragment;Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;)V

    .line 480
    .line 481
    .line 482
    goto/16 :goto_3

    .line 483
    .line 484
    :cond_d
    :goto_6
    invoke-virtual {p0, v7, v2}, Lcom/zykj/mistake/fragment/RevisedAnswerFragment;->j(Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;Z)V

    .line 485
    .line 486
    .line 487
    goto/16 :goto_3

    .line 488
    .line 489
    :cond_e
    invoke-virtual {p0}, Lcom/zykj/mistake/fragment/RevisedAnswerFragment;->l()V

    .line 490
    .line 491
    .line 492
    return-void

    .line 493
    :cond_f
    iget p1, p0, Lcom/zykj/mistake/fragment/RevisedAnswerFragment;->f:I

    .line 494
    .line 495
    sget-object v6, Lcom/zykj/mistake/utils/QuestionType;->TYPE_SINGLE:Lcom/zykj/mistake/utils/QuestionType;

    .line 496
    .line 497
    invoke-virtual {v6}, Lcom/zykj/mistake/utils/QuestionType;->getType()I

    .line 498
    .line 499
    .line 500
    move-result v6

    .line 501
    if-eq p1, v6, :cond_1c

    .line 502
    .line 503
    sget-object v6, Lcom/zykj/mistake/utils/QuestionType;->TYPE_CLOZE:Lcom/zykj/mistake/utils/QuestionType;

    .line 504
    .line 505
    invoke-virtual {v6}, Lcom/zykj/mistake/utils/QuestionType;->getType()I

    .line 506
    .line 507
    .line 508
    move-result v6

    .line 509
    if-eq p1, v6, :cond_1c

    .line 510
    .line 511
    sget-object v6, Lcom/zykj/mistake/utils/QuestionType;->TYPE_MULTIPLE:Lcom/zykj/mistake/utils/QuestionType;

    .line 512
    .line 513
    invoke-virtual {v6}, Lcom/zykj/mistake/utils/QuestionType;->getType()I

    .line 514
    .line 515
    .line 516
    move-result v6

    .line 517
    if-eq p1, v6, :cond_1c

    .line 518
    .line 519
    sget-object v6, Lcom/zykj/mistake/utils/QuestionType;->TYPE_LISTEN:Lcom/zykj/mistake/utils/QuestionType;

    .line 520
    .line 521
    invoke-virtual {v6}, Lcom/zykj/mistake/utils/QuestionType;->getType()I

    .line 522
    .line 523
    .line 524
    move-result v6

    .line 525
    if-eq p1, v6, :cond_1c

    .line 526
    .line 527
    sget-object v6, Lcom/zykj/mistake/utils/QuestionType;->TYPE_SEVEN_CHOICES_FIVE:Lcom/zykj/mistake/utils/QuestionType;

    .line 528
    .line 529
    invoke-virtual {v6}, Lcom/zykj/mistake/utils/QuestionType;->getType()I

    .line 530
    .line 531
    .line 532
    move-result v6

    .line 533
    if-eq p1, v6, :cond_1c

    .line 534
    .line 535
    sget-object v6, Lcom/zykj/mistake/utils/QuestionType;->TYPE_JUDGE:Lcom/zykj/mistake/utils/QuestionType;

    .line 536
    .line 537
    invoke-virtual {v6}, Lcom/zykj/mistake/utils/QuestionType;->getType()I

    .line 538
    .line 539
    .line 540
    move-result v6

    .line 541
    if-ne p1, v6, :cond_10

    .line 542
    .line 543
    goto/16 :goto_a

    .line 544
    .line 545
    :cond_10
    sget-object v6, Lcom/zykj/mistake/utils/QuestionType;->TYPE_SUMMARY:Lcom/zykj/mistake/utils/QuestionType;

    .line 546
    .line 547
    invoke-virtual {v6}, Lcom/zykj/mistake/utils/QuestionType;->getType()I

    .line 548
    .line 549
    .line 550
    move-result v6

    .line 551
    if-eq p1, v6, :cond_1b

    .line 552
    .line 553
    sget-object v6, Lcom/zykj/mistake/utils/QuestionType;->TYPE_COMPOSITION:Lcom/zykj/mistake/utils/QuestionType;

    .line 554
    .line 555
    invoke-virtual {v6}, Lcom/zykj/mistake/utils/QuestionType;->getType()I

    .line 556
    .line 557
    .line 558
    move-result v6

    .line 559
    if-eq p1, v6, :cond_1b

    .line 560
    .line 561
    sget-object v6, Lcom/zykj/mistake/utils/QuestionType;->TYPE_BLANK:Lcom/zykj/mistake/utils/QuestionType;

    .line 562
    .line 563
    invoke-virtual {v6}, Lcom/zykj/mistake/utils/QuestionType;->getType()I

    .line 564
    .line 565
    .line 566
    move-result v6

    .line 567
    if-eq p1, v6, :cond_1b

    .line 568
    .line 569
    sget-object v6, Lcom/zykj/mistake/utils/QuestionType;->TYPE_MIX:Lcom/zykj/mistake/utils/QuestionType;

    .line 570
    .line 571
    invoke-virtual {v6}, Lcom/zykj/mistake/utils/QuestionType;->getType()I

    .line 572
    .line 573
    .line 574
    move-result v6

    .line 575
    if-ne p1, v6, :cond_11

    .line 576
    .line 577
    goto/16 :goto_9

    .line 578
    .line 579
    :cond_11
    sget-object v6, Lcom/zykj/mistake/utils/QuestionType;->TYPE_COMPREHENSION:Lcom/zykj/mistake/utils/QuestionType;

    .line 580
    .line 581
    invoke-virtual {v6}, Lcom/zykj/mistake/utils/QuestionType;->getType()I

    .line 582
    .line 583
    .line 584
    move-result v6

    .line 585
    if-ne p1, v6, :cond_19

    .line 586
    .line 587
    if-eqz v3, :cond_12

    .line 588
    .line 589
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 590
    .line 591
    .line 592
    move-result p1

    .line 593
    if-eqz p1, :cond_12

    .line 594
    .line 595
    goto/16 :goto_8

    .line 596
    .line 597
    :cond_12
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 598
    .line 599
    .line 600
    move-result p1

    .line 601
    move v0, v4

    .line 602
    :cond_13
    if-ge v0, p1, :cond_18

    .line 603
    .line 604
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 605
    .line 606
    .line 607
    move-result-object v6

    .line 608
    add-int/lit8 v0, v0, 0x1

    .line 609
    .line 610
    check-cast v6, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;

    .line 611
    .line 612
    invoke-virtual {v6}, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->getExamAnswers()Ljava/util/ArrayList;

    .line 613
    .line 614
    .line 615
    move-result-object v7

    .line 616
    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    .line 617
    .line 618
    .line 619
    move-result v7

    .line 620
    if-nez v7, :cond_14

    .line 621
    .line 622
    invoke-virtual {v6}, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->getExamAnswers()Ljava/util/ArrayList;

    .line 623
    .line 624
    .line 625
    move-result-object v7

    .line 626
    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 627
    .line 628
    .line 629
    move-result-object v7

    .line 630
    check-cast v7, Ljava/lang/String;

    .line 631
    .line 632
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 633
    .line 634
    .line 635
    move-result v7

    .line 636
    if-ne v7, v5, :cond_14

    .line 637
    .line 638
    invoke-virtual {v6}, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->getExamAnswers()Ljava/util/ArrayList;

    .line 639
    .line 640
    .line 641
    move-result-object v7

    .line 642
    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 643
    .line 644
    .line 645
    move-result-object v7

    .line 646
    invoke-static {v1, v7}, Lkotlin/collections/q;->v([Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 647
    .line 648
    .line 649
    move-result v7

    .line 650
    if-nez v7, :cond_17

    .line 651
    .line 652
    :cond_14
    invoke-virtual {v6}, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->getExamComments()Ljava/util/ArrayList;

    .line 653
    .line 654
    .line 655
    move-result-object v7

    .line 656
    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    .line 657
    .line 658
    .line 659
    move-result v7

    .line 660
    if-nez v7, :cond_15

    .line 661
    .line 662
    invoke-virtual {v6}, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->getExamComments()Ljava/util/ArrayList;

    .line 663
    .line 664
    .line 665
    move-result-object v7

    .line 666
    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 667
    .line 668
    .line 669
    move-result-object v7

    .line 670
    check-cast v7, Ljava/lang/String;

    .line 671
    .line 672
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 673
    .line 674
    .line 675
    move-result v7

    .line 676
    if-ne v7, v5, :cond_15

    .line 677
    .line 678
    invoke-virtual {v6}, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->getExamComments()Ljava/util/ArrayList;

    .line 679
    .line 680
    .line 681
    move-result-object v7

    .line 682
    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 683
    .line 684
    .line 685
    move-result-object v7

    .line 686
    invoke-static {v1, v7}, Lkotlin/collections/q;->v([Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 687
    .line 688
    .line 689
    move-result v7

    .line 690
    if-nez v7, :cond_17

    .line 691
    .line 692
    :cond_15
    invoke-virtual {v6}, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->getRevisingAnswers()Ljava/util/ArrayList;

    .line 693
    .line 694
    .line 695
    move-result-object v7

    .line 696
    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    .line 697
    .line 698
    .line 699
    move-result v7

    .line 700
    if-nez v7, :cond_16

    .line 701
    .line 702
    invoke-virtual {v6}, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->getRevisingAnswers()Ljava/util/ArrayList;

    .line 703
    .line 704
    .line 705
    move-result-object v7

    .line 706
    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 707
    .line 708
    .line 709
    move-result-object v7

    .line 710
    check-cast v7, Ljava/lang/String;

    .line 711
    .line 712
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 713
    .line 714
    .line 715
    move-result v7

    .line 716
    if-ne v7, v5, :cond_16

    .line 717
    .line 718
    invoke-virtual {v6}, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->getRevisingAnswers()Ljava/util/ArrayList;

    .line 719
    .line 720
    .line 721
    move-result-object v7

    .line 722
    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 723
    .line 724
    .line 725
    move-result-object v7

    .line 726
    invoke-static {v1, v7}, Lkotlin/collections/q;->v([Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 727
    .line 728
    .line 729
    move-result v7

    .line 730
    if-nez v7, :cond_17

    .line 731
    .line 732
    :cond_16
    invoke-virtual {v6}, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->getRevisingComments()Ljava/util/ArrayList;

    .line 733
    .line 734
    .line 735
    move-result-object v7

    .line 736
    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    .line 737
    .line 738
    .line 739
    move-result v7

    .line 740
    if-nez v7, :cond_13

    .line 741
    .line 742
    invoke-virtual {v6}, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->getRevisingComments()Ljava/util/ArrayList;

    .line 743
    .line 744
    .line 745
    move-result-object v7

    .line 746
    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 747
    .line 748
    .line 749
    move-result-object v7

    .line 750
    check-cast v7, Ljava/lang/String;

    .line 751
    .line 752
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 753
    .line 754
    .line 755
    move-result v7

    .line 756
    if-ne v7, v5, :cond_13

    .line 757
    .line 758
    invoke-virtual {v6}, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->getRevisingComments()Ljava/util/ArrayList;

    .line 759
    .line 760
    .line 761
    move-result-object v6

    .line 762
    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 763
    .line 764
    .line 765
    move-result-object v6

    .line 766
    invoke-static {v1, v6}, Lkotlin/collections/q;->v([Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 767
    .line 768
    .line 769
    move-result v6

    .line 770
    if-eqz v6, :cond_13

    .line 771
    .line 772
    :cond_17
    iget-object p1, p0, Lcom/zykj/mistake/fragment/RevisedAnswerFragment;->b:Ljava/util/ArrayList;

    .line 773
    .line 774
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 775
    .line 776
    .line 777
    move-result v0

    .line 778
    :goto_7
    if-ge v4, v0, :cond_1d

    .line 779
    .line 780
    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 781
    .line 782
    .line 783
    move-result-object v1

    .line 784
    add-int/lit8 v4, v4, 0x1

    .line 785
    .line 786
    check-cast v1, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;

    .line 787
    .line 788
    invoke-virtual {p0, v1, v2}, Lcom/zykj/mistake/fragment/RevisedAnswerFragment;->j(Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;Z)V

    .line 789
    .line 790
    .line 791
    goto :goto_7

    .line 792
    :cond_18
    :goto_8
    invoke-virtual {p0}, Lcom/zykj/mistake/fragment/RevisedAnswerFragment;->k()V

    .line 793
    .line 794
    .line 795
    goto :goto_c

    .line 796
    :cond_19
    sget-object v1, Lcom/zykj/mistake/utils/QuestionType;->TYPE_UNKNOW:Lcom/zykj/mistake/utils/QuestionType;

    .line 797
    .line 798
    invoke-virtual {v1}, Lcom/zykj/mistake/utils/QuestionType;->getType()I

    .line 799
    .line 800
    .line 801
    move-result v1

    .line 802
    if-ne p1, v1, :cond_1d

    .line 803
    .line 804
    new-instance p1, Landroid/widget/LinearLayout;

    .line 805
    .line 806
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 807
    .line 808
    .line 809
    move-result-object v1

    .line 810
    invoke-direct {p1, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 811
    .line 812
    .line 813
    new-instance v1, Landroid/view/ViewGroup$LayoutParams;

    .line 814
    .line 815
    const/4 v2, -0x1

    .line 816
    const/4 v3, -0x2

    .line 817
    invoke-direct {v1, v2, v3}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 818
    .line 819
    .line 820
    invoke-virtual {p1, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 821
    .line 822
    .line 823
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 824
    .line 825
    .line 826
    move-result-object v1

    .line 827
    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 828
    .line 829
    .line 830
    move-result-object v1

    .line 831
    sget v2, Lcom/zykj/mistake/R$layout;->item_answer_subjective:I

    .line 832
    .line 833
    invoke-virtual {v1, v2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 834
    .line 835
    .line 836
    move-result-object v1

    .line 837
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 838
    .line 839
    .line 840
    iget-object v1, p0, Lcom/zykj/mistake/fragment/RevisedAnswerFragment;->e:Landroid/widget/LinearLayout;

    .line 841
    .line 842
    if-eqz v1, :cond_1a

    .line 843
    .line 844
    invoke-virtual {v1, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 845
    .line 846
    .line 847
    goto :goto_c

    .line 848
    :cond_1a
    const-string p1, "answerContent"

    .line 849
    .line 850
    invoke-static {p1}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 851
    .line 852
    .line 853
    throw v0

    .line 854
    :cond_1b
    :goto_9
    invoke-virtual {p0}, Lcom/zykj/mistake/fragment/RevisedAnswerFragment;->k()V

    .line 855
    .line 856
    .line 857
    goto :goto_c

    .line 858
    :cond_1c
    :goto_a
    iget-object p1, p0, Lcom/zykj/mistake/fragment/RevisedAnswerFragment;->b:Ljava/util/ArrayList;

    .line 859
    .line 860
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 861
    .line 862
    .line 863
    move-result v0

    .line 864
    :goto_b
    if-ge v4, v0, :cond_1d

    .line 865
    .line 866
    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 867
    .line 868
    .line 869
    move-result-object v1

    .line 870
    add-int/lit8 v4, v4, 0x1

    .line 871
    .line 872
    check-cast v1, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;

    .line 873
    .line 874
    invoke-virtual {p0, v1, v2}, Lcom/zykj/mistake/fragment/RevisedAnswerFragment;->j(Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;Z)V

    .line 875
    .line 876
    .line 877
    goto :goto_b

    .line 878
    :cond_1d
    :goto_c
    invoke-virtual {p0}, Lcom/zykj/mistake/fragment/RevisedAnswerFragment;->l()V

    .line 879
    .line 880
    .line 881
    return-void
.end method

.method public final h(Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;)V
    .locals 10

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz p2, :cond_1

    .line 5
    .line 6
    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    check-cast p2, Ljava/lang/String;

    .line 18
    .line 19
    move-object v4, p2

    .line 20
    goto :goto_1

    .line 21
    :cond_1
    :goto_0
    move-object v4, v0

    .line 22
    :goto_1
    invoke-static {v4}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    if-eqz p3, :cond_3

    .line 26
    .line 27
    invoke-interface {p3}, Ljava/util/Collection;->isEmpty()Z

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    if-eqz p2, :cond_2

    .line 32
    .line 33
    goto :goto_2

    .line 34
    :cond_2
    invoke-virtual {p3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    move-object v0, p2

    .line 39
    check-cast v0, Ljava/lang/String;

    .line 40
    .line 41
    :cond_3
    :goto_2
    move-object v6, v0

    .line 42
    invoke-static {v6}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 46
    .line 47
    .line 48
    move-result p2

    .line 49
    const/4 p3, 0x1

    .line 50
    const-string v0, "corrected"

    .line 51
    .line 52
    if-lez p2, :cond_4

    .line 53
    .line 54
    invoke-static {v6, v0, v1}, Lkotlin/text/p;->F(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 55
    .line 56
    .line 57
    move-result p2

    .line 58
    if-nez p2, :cond_4

    .line 59
    .line 60
    invoke-virtual {v6, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result p2

    .line 64
    if-nez p2, :cond_4

    .line 65
    .line 66
    move v5, p3

    .line 67
    goto :goto_3

    .line 68
    :cond_4
    move v5, v1

    .line 69
    :goto_3
    new-instance p2, Landroid/widget/LinearLayout;

    .line 70
    .line 71
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    invoke-direct {p2, v2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 76
    .line 77
    .line 78
    new-instance v2, Landroid/view/ViewGroup$LayoutParams;

    .line 79
    .line 80
    const/4 v3, -0x1

    .line 81
    const/4 v7, -0x2

    .line 82
    invoke-direct {v2, v3, v7}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p2, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 86
    .line 87
    .line 88
    new-instance v2, Landroid/widget/TextView;

    .line 89
    .line 90
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    invoke-direct {v2, v3}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 95
    .line 96
    .line 97
    new-instance v3, Landroid/view/ViewGroup$LayoutParams;

    .line 98
    .line 99
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    .line 100
    .line 101
    .line 102
    move-result-object v8

    .line 103
    sget v9, Lcom/zykj/mistake/R$dimen;->view_18:I

    .line 104
    .line 105
    invoke-virtual {v8, v9}, Landroid/content/res/Resources;->getDimension(I)F

    .line 106
    .line 107
    .line 108
    move-result v8

    .line 109
    float-to-int v8, v8

    .line 110
    invoke-direct {v3, v8, v7}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v2, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 114
    .line 115
    .line 116
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    .line 117
    .line 118
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 119
    .line 120
    .line 121
    move-result-object v7

    .line 122
    invoke-direct {v3, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    .line 123
    .line 124
    .line 125
    const/16 v7, 0x10

    .line 126
    .line 127
    iput v7, v3, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 128
    .line 129
    invoke-virtual {v2, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {p1}, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->getIndex()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    new-instance v3, Ljava/lang/StringBuilder;

    .line 137
    .line 138
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    sget p4, Lcom/zykj/mistake/R$dimen;->text_7:I

    .line 159
    .line 160
    invoke-virtual {p1, p4}, Landroid/content/res/Resources;->getDimension(I)F

    .line 161
    .line 162
    .line 163
    move-result p1

    .line 164
    invoke-virtual {v2, v1, p1}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {p2, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    sget p4, Lcom/zykj/mistake/R$layout;->item_answer_subjective:I

    .line 179
    .line 180
    const/4 v8, 0x0

    .line 181
    invoke-virtual {p1, p4, v8}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    sget p4, Lcom/zykj/mistake/R$id;->tv_no_answer:I

    .line 186
    .line 187
    invoke-virtual {p1, p4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 188
    .line 189
    .line 190
    move-result-object p4

    .line 191
    const-string v2, "findViewById(...)"

    .line 192
    .line 193
    invoke-static {p4, v2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    check-cast p4, Landroid/widget/TextView;

    .line 197
    .line 198
    sget v3, Lcom/zykj/mistake/R$id;->iv_answer:I

    .line 199
    .line 200
    invoke-virtual {p1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 201
    .line 202
    .line 203
    move-result-object v3

    .line 204
    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    check-cast v3, Landroid/widget/ImageView;

    .line 208
    .line 209
    sget v7, Lcom/zykj/mistake/R$id;->iv_comment:I

    .line 210
    .line 211
    invoke-virtual {p1, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 212
    .line 213
    .line 214
    move-result-object v7

    .line 215
    invoke-static {v7, v2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 216
    .line 217
    .line 218
    check-cast v7, Landroid/widget/ImageView;

    .line 219
    .line 220
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 221
    .line 222
    .line 223
    move-result v2

    .line 224
    const/16 v9, 0x8

    .line 225
    .line 226
    if-nez v2, :cond_6

    .line 227
    .line 228
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 229
    .line 230
    .line 231
    move-result v2

    .line 232
    if-nez v2, :cond_5

    .line 233
    .line 234
    goto :goto_4

    .line 235
    :cond_5
    invoke-static {v6, v0, v1}, Lkotlin/text/p;->F(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 236
    .line 237
    .line 238
    move-result v0

    .line 239
    if-eqz v0, :cond_6

    .line 240
    .line 241
    :goto_4
    invoke-virtual {p4, v1}, Landroid/view/View;->setVisibility(I)V

    .line 242
    .line 243
    .line 244
    sget p3, Lcom/zykj/mistake/R$string;->no_revised_answer:I

    .line 245
    .line 246
    invoke-virtual {p0, p3}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object p3

    .line 250
    invoke-virtual {p4, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {v3, v9}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 254
    .line 255
    .line 256
    invoke-virtual {v7, v9}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 257
    .line 258
    .line 259
    move-object v3, p0

    .line 260
    goto :goto_6

    .line 261
    :cond_6
    invoke-virtual {p4, v9}, Landroid/view/View;->setVisibility(I)V

    .line 262
    .line 263
    .line 264
    invoke-virtual {v3, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 265
    .line 266
    .line 267
    if-eqz v5, :cond_7

    .line 268
    .line 269
    goto :goto_5

    .line 270
    :cond_7
    move v1, v9

    .line 271
    :goto_5
    invoke-virtual {v7, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 272
    .line 273
    .line 274
    invoke-static {p0}, Lcom/bumptech/glide/b;->f(Landroidx/fragment/app/Fragment;)Lcom/bumptech/glide/h;

    .line 275
    .line 276
    .line 277
    move-result-object p4

    .line 278
    invoke-virtual {p4, v4}, Lcom/bumptech/glide/h;->l(Ljava/lang/String;)Lcom/bumptech/glide/f;

    .line 279
    .line 280
    .line 281
    move-result-object p4

    .line 282
    new-instance v0, Lq4/k;

    .line 283
    .line 284
    invoke-direct {v0, v3}, Lq4/k;-><init>(Landroid/widget/ImageView;)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {p4, v0}, Lcom/bumptech/glide/f;->z(Ls0/i;)V

    .line 288
    .line 289
    .line 290
    if-eqz v5, :cond_8

    .line 291
    .line 292
    invoke-static {p0}, Lcom/bumptech/glide/b;->f(Landroidx/fragment/app/Fragment;)Lcom/bumptech/glide/h;

    .line 293
    .line 294
    .line 295
    move-result-object p4

    .line 296
    invoke-virtual {p4}, Lcom/bumptech/glide/h;->j()Lcom/bumptech/glide/f;

    .line 297
    .line 298
    .line 299
    move-result-object p4

    .line 300
    iput-object v6, p4, Lcom/bumptech/glide/f;->w:Ljava/lang/Object;

    .line 301
    .line 302
    iput-boolean p3, p4, Lcom/bumptech/glide/f;->y:Z

    .line 303
    .line 304
    new-instance p3, Lq4/l;

    .line 305
    .line 306
    invoke-direct {p3, v7}, Lq4/l;-><init>(Landroid/widget/ImageView;)V

    .line 307
    .line 308
    .line 309
    invoke-virtual {p4, p3}, Lcom/bumptech/glide/f;->z(Ls0/i;)V

    .line 310
    .line 311
    .line 312
    :cond_8
    new-instance v2, Lq4/g;

    .line 313
    .line 314
    const/4 v7, 0x1

    .line 315
    move-object v3, p0

    .line 316
    invoke-direct/range {v2 .. v7}, Lq4/g;-><init>(Lcom/zykj/mistake/base/BaseFragment;Ljava/lang/String;ZLjava/lang/String;I)V

    .line 317
    .line 318
    .line 319
    invoke-virtual {p1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 320
    .line 321
    .line 322
    :goto_6
    invoke-virtual {p2, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 323
    .line 324
    .line 325
    iget-object p1, v3, Lcom/zykj/mistake/fragment/RevisedAnswerFragment;->e:Landroid/widget/LinearLayout;

    .line 326
    .line 327
    if-eqz p1, :cond_9

    .line 328
    .line 329
    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 330
    .line 331
    .line 332
    return-void

    .line 333
    :cond_9
    const-string p1, "answerContent"

    .line 334
    .line 335
    invoke-static {p1}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 336
    .line 337
    .line 338
    throw v8
.end method

.method public final j(Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;Z)V
    .locals 10

    .line 1
    invoke-virtual {p1}, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->getRevisingAnswers()Ljava/util/ArrayList;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->getRevisingComments()Ljava/util/ArrayList;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    new-instance v2, Landroid/widget/LinearLayout;

    .line 10
    .line 11
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    invoke-direct {v2, v3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 16
    .line 17
    .line 18
    new-instance v3, Landroid/view/ViewGroup$LayoutParams;

    .line 19
    .line 20
    const/4 v4, -0x1

    .line 21
    const/4 v5, -0x2

    .line 22
    invoke-direct {v3, v4, v5}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v2, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 26
    .line 27
    .line 28
    new-instance v3, Landroid/widget/TextView;

    .line 29
    .line 30
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 31
    .line 32
    .line 33
    move-result-object v6

    .line 34
    invoke-direct {v3, v6}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 35
    .line 36
    .line 37
    new-instance v6, Landroid/view/ViewGroup$LayoutParams;

    .line 38
    .line 39
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    .line 40
    .line 41
    .line 42
    move-result-object v7

    .line 43
    sget v8, Lcom/zykj/mistake/R$dimen;->view_18:I

    .line 44
    .line 45
    invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getDimension(I)F

    .line 46
    .line 47
    .line 48
    move-result v7

    .line 49
    float-to-int v7, v7

    .line 50
    invoke-direct {v6, v7, v4}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v3, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 54
    .line 55
    .line 56
    const/16 v6, 0x10

    .line 57
    .line 58
    invoke-virtual {v3, v6}, Landroid/widget/TextView;->setGravity(I)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    .line 62
    .line 63
    .line 64
    move-result-object v6

    .line 65
    sget v7, Lcom/zykj/mistake/R$dimen;->text_7:I

    .line 66
    .line 67
    invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getDimension(I)F

    .line 68
    .line 69
    .line 70
    move-result v6

    .line 71
    const/4 v7, 0x0

    .line 72
    invoke-virtual {v3, v7, v6}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1}, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->getIndex()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-virtual {v3, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 83
    .line 84
    .line 85
    new-instance p1, Lcom/zykj/mistake/widget/WrapLinearLayout;

    .line 86
    .line 87
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    invoke-direct {p1, v3}, Lcom/zykj/mistake/widget/WrapLinearLayout;-><init>(Landroid/content/Context;)V

    .line 92
    .line 93
    .line 94
    const/4 v3, 0x1

    .line 95
    invoke-virtual {p1, v3}, Lcom/zykj/mistake/widget/WrapLinearLayout;->setGravity(I)V

    .line 96
    .line 97
    .line 98
    new-instance v6, Landroid/view/ViewGroup$LayoutParams;

    .line 99
    .line 100
    invoke-direct {v6, v4, v5}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p1, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 107
    .line 108
    .line 109
    move-result v4

    .line 110
    const/4 v5, 0x0

    .line 111
    if-eqz v4, :cond_0

    .line 112
    .line 113
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 114
    .line 115
    .line 116
    move-result-object p2

    .line 117
    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 118
    .line 119
    .line 120
    move-result-object p2

    .line 121
    sget v0, Lcom/zykj/mistake/R$layout;->item_answer:I

    .line 122
    .line 123
    invoke-virtual {p2, v0, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 124
    .line 125
    .line 126
    move-result-object p2

    .line 127
    sget v0, Lcom/zykj/mistake/R$id;->text:I

    .line 128
    .line 129
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    check-cast v0, Landroid/widget/TextView;

    .line 134
    .line 135
    sget v1, Lcom/zykj/mistake/R$string;->no_revising:I

    .line 136
    .line 137
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 145
    .line 146
    .line 147
    goto :goto_3

    .line 148
    :cond_0
    invoke-virtual {v0, v1}, Ljava/util/AbstractCollection;->containsAll(Ljava/util/Collection;)Z

    .line 149
    .line 150
    .line 151
    move-result v4

    .line 152
    if-eqz v4, :cond_1

    .line 153
    .line 154
    invoke-virtual {v1, v0}, Ljava/util/AbstractCollection;->containsAll(Ljava/util/Collection;)Z

    .line 155
    .line 156
    .line 157
    move-result v1

    .line 158
    if-eqz v1, :cond_1

    .line 159
    .line 160
    move v1, v3

    .line 161
    goto :goto_0

    .line 162
    :cond_1
    move v1, v7

    .line 163
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 164
    .line 165
    .line 166
    move-result v4

    .line 167
    :goto_1
    if-ge v7, v4, :cond_4

    .line 168
    .line 169
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v6

    .line 173
    add-int/lit8 v7, v7, 0x1

    .line 174
    .line 175
    check-cast v6, Ljava/lang/String;

    .line 176
    .line 177
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 178
    .line 179
    .line 180
    move-result-object v8

    .line 181
    invoke-static {v8}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 182
    .line 183
    .line 184
    move-result-object v8

    .line 185
    sget v9, Lcom/zykj/mistake/R$layout;->item_answer:I

    .line 186
    .line 187
    invoke-virtual {v8, v9, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 188
    .line 189
    .line 190
    move-result-object v8

    .line 191
    sget v9, Lcom/zykj/mistake/R$id;->text:I

    .line 192
    .line 193
    invoke-virtual {v8, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 194
    .line 195
    .line 196
    move-result-object v9

    .line 197
    check-cast v9, Landroid/widget/TextView;

    .line 198
    .line 199
    invoke-virtual {v9, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 200
    .line 201
    .line 202
    if-eqz p2, :cond_3

    .line 203
    .line 204
    if-eqz v1, :cond_2

    .line 205
    .line 206
    sget v6, Lcom/zykj/mistake/R$id;->text:I

    .line 207
    .line 208
    invoke-virtual {v8, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 209
    .line 210
    .line 211
    move-result-object v6

    .line 212
    check-cast v6, Landroid/widget/TextView;

    .line 213
    .line 214
    invoke-virtual {v6, v3}, Landroid/view/View;->setActivated(Z)V

    .line 215
    .line 216
    .line 217
    goto :goto_2

    .line 218
    :cond_2
    sget v6, Lcom/zykj/mistake/R$id;->text:I

    .line 219
    .line 220
    invoke-virtual {v8, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 221
    .line 222
    .line 223
    move-result-object v6

    .line 224
    check-cast v6, Landroid/widget/TextView;

    .line 225
    .line 226
    invoke-virtual {v6, v3}, Landroid/widget/TextView;->setSelected(Z)V

    .line 227
    .line 228
    .line 229
    :cond_3
    :goto_2
    invoke-virtual {p1, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 230
    .line 231
    .line 232
    goto :goto_1

    .line 233
    :cond_4
    :goto_3
    invoke-virtual {v2, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 234
    .line 235
    .line 236
    iget-object p1, p0, Lcom/zykj/mistake/fragment/RevisedAnswerFragment;->e:Landroid/widget/LinearLayout;

    .line 237
    .line 238
    if-eqz p1, :cond_5

    .line 239
    .line 240
    invoke-virtual {p1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 241
    .line 242
    .line 243
    return-void

    .line 244
    :cond_5
    const-string p1, "answerContent"

    .line 245
    .line 246
    invoke-static {p1}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    throw v5
.end method

.method public final k()V
    .locals 9

    .line 1
    iget v0, p0, Lcom/zykj/mistake/fragment/RevisedAnswerFragment;->f:I

    .line 2
    .line 3
    sget-object v1, Lcom/zykj/mistake/utils/QuestionType;->TYPE_BLANK:Lcom/zykj/mistake/utils/QuestionType;

    .line 4
    .line 5
    invoke-virtual {v1}, Lcom/zykj/mistake/utils/QuestionType;->getType()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const-string v2, ""

    .line 10
    .line 11
    if-ne v0, v1, :cond_3

    .line 12
    .line 13
    iget-object v0, p0, Lcom/zykj/mistake/fragment/RevisedAnswerFragment;->c:Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const/4 v3, 0x0

    .line 20
    :cond_0
    :goto_0
    if-ge v3, v1, :cond_2

    .line 21
    .line 22
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    add-int/lit8 v3, v3, 0x1

    .line 27
    .line 28
    check-cast v4, Lcom/zykj/mistake/entity/resp/MistakeDetail$QstFlowBean;

    .line 29
    .line 30
    invoke-virtual {v4}, Lcom/zykj/mistake/entity/resp/MistakeDetail$QstFlowBean;->getType()I

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    if-nez v5, :cond_1

    .line 35
    .line 36
    invoke-virtual {v4}, Lcom/zykj/mistake/entity/resp/MistakeDetail$QstFlowBean;->getSubQuestions()Ljava/util/List;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    if-eqz v5, :cond_0

    .line 41
    .line 42
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result v6

    .line 50
    if-eqz v6, :cond_0

    .line 51
    .line 52
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v6

    .line 56
    check-cast v6, Lcom/zykj/mistake/entity/resp/MistakeDetail$SubQuestionsBean;

    .line 57
    .line 58
    invoke-virtual {v6}, Lcom/zykj/mistake/entity/resp/MistakeDetail$SubQuestionsBean;->getUuid()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v6

    .line 62
    invoke-virtual {v4}, Lcom/zykj/mistake/entity/resp/MistakeDetail$QstFlowBean;->getNumber()I

    .line 63
    .line 64
    .line 65
    move-result v7

    .line 66
    new-instance v8, Ljava/lang/StringBuilder;

    .line 67
    .line 68
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    const-string v7, "."

    .line 75
    .line 76
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v7

    .line 83
    invoke-virtual {p0, v6, v7}, Lcom/zykj/mistake/fragment/RevisedAnswerFragment;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_1
    invoke-virtual {v4}, Lcom/zykj/mistake/entity/resp/MistakeDetail$QstFlowBean;->getType()I

    .line 88
    .line 89
    .line 90
    move-result v5

    .line 91
    const/4 v6, 0x1

    .line 92
    if-ne v5, v6, :cond_0

    .line 93
    .line 94
    invoke-virtual {v4}, Lcom/zykj/mistake/entity/resp/MistakeDetail$QstFlowBean;->getUuid()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v4

    .line 98
    invoke-virtual {p0, v4, v2}, Lcom/zykj/mistake/fragment/RevisedAnswerFragment;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_2
    return-void

    .line 103
    :cond_3
    const/4 v0, 0x0

    .line 104
    invoke-virtual {p0, v0, v2}, Lcom/zykj/mistake/fragment/RevisedAnswerFragment;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    return-void
.end method

.method public final l()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/fragment/RevisedAnswerFragment;->d:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_1

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Lcom/zykj/mistake/entity/resp/MistakeDetail$QstMicroLessonBean;

    .line 24
    .line 25
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    sget v2, Lcom/zykj/mistake/R$layout;->item_micro_lesson_screen:I

    .line 34
    .line 35
    const/4 v3, 0x0

    .line 36
    invoke-virtual {v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    new-instance v2, La5/f;

    .line 41
    .line 42
    const/16 v4, 0xc

    .line 43
    .line 44
    invoke-direct {v2, v4, p0, v0}, La5/f;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 48
    .line 49
    .line 50
    iget-object v0, p0, Lcom/zykj/mistake/fragment/RevisedAnswerFragment;->e:Landroid/widget/LinearLayout;

    .line 51
    .line 52
    if-eqz v0, :cond_0

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :cond_0
    const-string v0, "answerContent"

    .line 59
    .line 60
    invoke-static {v0}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    throw v3

    .line 64
    :cond_1
    return-void
.end method

.method public final m(Ljava/lang/String;Ljava/lang/String;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lcom/zykj/mistake/fragment/RevisedAnswerFragment;->b:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    const/4 v4, 0x1

    .line 12
    const/4 v5, 0x0

    .line 13
    move v6, v5

    .line 14
    :goto_0
    if-ge v6, v3, :cond_d

    .line 15
    .line 16
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v7

    .line 20
    add-int/lit8 v6, v6, 0x1

    .line 21
    .line 22
    check-cast v7, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;

    .line 23
    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    invoke-virtual {v7}, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->getUuid()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v8

    .line 30
    invoke-virtual {v1, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v8

    .line 34
    if-eqz v8, :cond_0

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_0
    :goto_1
    move-object/from16 v9, p2

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    :goto_2
    if-nez v4, :cond_2

    .line 41
    .line 42
    iget v8, v0, Lcom/zykj/mistake/fragment/RevisedAnswerFragment;->f:I

    .line 43
    .line 44
    sget-object v9, Lcom/zykj/mistake/utils/QuestionType;->TYPE_SUMMARY:Lcom/zykj/mistake/utils/QuestionType;

    .line 45
    .line 46
    invoke-virtual {v9}, Lcom/zykj/mistake/utils/QuestionType;->getType()I

    .line 47
    .line 48
    .line 49
    move-result v9

    .line 50
    if-eq v8, v9, :cond_0

    .line 51
    .line 52
    iget v8, v0, Lcom/zykj/mistake/fragment/RevisedAnswerFragment;->f:I

    .line 53
    .line 54
    sget-object v9, Lcom/zykj/mistake/utils/QuestionType;->TYPE_MIX:Lcom/zykj/mistake/utils/QuestionType;

    .line 55
    .line 56
    invoke-virtual {v9}, Lcom/zykj/mistake/utils/QuestionType;->getType()I

    .line 57
    .line 58
    .line 59
    move-result v9

    .line 60
    if-eq v8, v9, :cond_0

    .line 61
    .line 62
    iget v8, v0, Lcom/zykj/mistake/fragment/RevisedAnswerFragment;->f:I

    .line 63
    .line 64
    sget-object v9, Lcom/zykj/mistake/utils/QuestionType;->TYPE_COMPREHENSION:Lcom/zykj/mistake/utils/QuestionType;

    .line 65
    .line 66
    invoke-virtual {v9}, Lcom/zykj/mistake/utils/QuestionType;->getType()I

    .line 67
    .line 68
    .line 69
    move-result v9

    .line 70
    if-ne v8, v9, :cond_2

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_2
    iget v4, v0, Lcom/zykj/mistake/fragment/RevisedAnswerFragment;->f:I

    .line 74
    .line 75
    sget-object v8, Lcom/zykj/mistake/utils/QuestionType;->TYPE_SUMMARY:Lcom/zykj/mistake/utils/QuestionType;

    .line 76
    .line 77
    invoke-virtual {v8}, Lcom/zykj/mistake/utils/QuestionType;->getType()I

    .line 78
    .line 79
    .line 80
    move-result v8

    .line 81
    if-eq v4, v8, :cond_4

    .line 82
    .line 83
    iget v4, v0, Lcom/zykj/mistake/fragment/RevisedAnswerFragment;->f:I

    .line 84
    .line 85
    sget-object v8, Lcom/zykj/mistake/utils/QuestionType;->TYPE_MIX:Lcom/zykj/mistake/utils/QuestionType;

    .line 86
    .line 87
    invoke-virtual {v8}, Lcom/zykj/mistake/utils/QuestionType;->getType()I

    .line 88
    .line 89
    .line 90
    move-result v8

    .line 91
    if-eq v4, v8, :cond_4

    .line 92
    .line 93
    iget v4, v0, Lcom/zykj/mistake/fragment/RevisedAnswerFragment;->f:I

    .line 94
    .line 95
    sget-object v8, Lcom/zykj/mistake/utils/QuestionType;->TYPE_COMPREHENSION:Lcom/zykj/mistake/utils/QuestionType;

    .line 96
    .line 97
    invoke-virtual {v8}, Lcom/zykj/mistake/utils/QuestionType;->getType()I

    .line 98
    .line 99
    .line 100
    move-result v8

    .line 101
    if-ne v4, v8, :cond_3

    .line 102
    .line 103
    goto :goto_4

    .line 104
    :cond_3
    invoke-virtual {v7}, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->getRevisingAnswers()Ljava/util/ArrayList;

    .line 105
    .line 106
    .line 107
    move-result-object v4

    .line 108
    invoke-virtual {v7}, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->getRevisingComments()Ljava/util/ArrayList;

    .line 109
    .line 110
    .line 111
    move-result-object v8

    .line 112
    :goto_3
    move-object/from16 v9, p2

    .line 113
    .line 114
    goto/16 :goto_8

    .line 115
    .line 116
    :cond_4
    :goto_4
    new-instance v4, Ljava/util/ArrayList;

    .line 117
    .line 118
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 122
    .line 123
    .line 124
    move-result v8

    .line 125
    move v9, v5

    .line 126
    :cond_5
    :goto_5
    const-string v10, "http"

    .line 127
    .line 128
    const-string v11, "get(...)"

    .line 129
    .line 130
    if-ge v9, v8, :cond_7

    .line 131
    .line 132
    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v12

    .line 136
    add-int/lit8 v9, v9, 0x1

    .line 137
    .line 138
    move-object v13, v12

    .line 139
    check-cast v13, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;

    .line 140
    .line 141
    invoke-virtual {v13}, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->getRevisingAnswers()Ljava/util/ArrayList;

    .line 142
    .line 143
    .line 144
    move-result-object v14

    .line 145
    if-eqz v14, :cond_5

    .line 146
    .line 147
    invoke-interface {v14}, Ljava/util/Collection;->isEmpty()Z

    .line 148
    .line 149
    .line 150
    move-result v14

    .line 151
    if-eqz v14, :cond_6

    .line 152
    .line 153
    goto :goto_5

    .line 154
    :cond_6
    invoke-virtual {v13}, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->getRevisingAnswers()Ljava/util/ArrayList;

    .line 155
    .line 156
    .line 157
    move-result-object v13

    .line 158
    invoke-virtual {v13, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v13

    .line 162
    invoke-static {v13, v11}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    check-cast v13, Ljava/lang/CharSequence;

    .line 166
    .line 167
    invoke-static {v13, v10, v5}, Lkotlin/text/p;->F(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 168
    .line 169
    .line 170
    move-result v10

    .line 171
    if-eqz v10, :cond_5

    .line 172
    .line 173
    invoke-virtual {v4, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    goto :goto_5

    .line 177
    :cond_7
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 178
    .line 179
    .line 180
    move-result v8

    .line 181
    if-nez v8, :cond_8

    .line 182
    .line 183
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v4

    .line 187
    check-cast v4, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;

    .line 188
    .line 189
    invoke-virtual {v4}, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->getRevisingAnswers()Ljava/util/ArrayList;

    .line 190
    .line 191
    .line 192
    move-result-object v4

    .line 193
    goto :goto_6

    .line 194
    :cond_8
    new-instance v4, Ljava/util/ArrayList;

    .line 195
    .line 196
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 197
    .line 198
    .line 199
    :goto_6
    new-instance v8, Ljava/util/ArrayList;

    .line 200
    .line 201
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 205
    .line 206
    .line 207
    move-result v9

    .line 208
    move v12, v5

    .line 209
    :cond_9
    :goto_7
    if-ge v12, v9, :cond_b

    .line 210
    .line 211
    invoke-virtual {v2, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v13

    .line 215
    add-int/lit8 v12, v12, 0x1

    .line 216
    .line 217
    move-object v14, v13

    .line 218
    check-cast v14, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;

    .line 219
    .line 220
    invoke-virtual {v14}, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->getRevisingComments()Ljava/util/ArrayList;

    .line 221
    .line 222
    .line 223
    move-result-object v15

    .line 224
    if-eqz v15, :cond_9

    .line 225
    .line 226
    invoke-interface {v15}, Ljava/util/Collection;->isEmpty()Z

    .line 227
    .line 228
    .line 229
    move-result v15

    .line 230
    if-eqz v15, :cond_a

    .line 231
    .line 232
    goto :goto_7

    .line 233
    :cond_a
    invoke-virtual {v14}, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->getRevisingComments()Ljava/util/ArrayList;

    .line 234
    .line 235
    .line 236
    move-result-object v14

    .line 237
    invoke-virtual {v14, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v14

    .line 241
    invoke-static {v14, v11}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    check-cast v14, Ljava/lang/CharSequence;

    .line 245
    .line 246
    invoke-static {v14, v10, v5}, Lkotlin/text/p;->F(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 247
    .line 248
    .line 249
    move-result v14

    .line 250
    if-eqz v14, :cond_9

    .line 251
    .line 252
    invoke-virtual {v8, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 253
    .line 254
    .line 255
    goto :goto_7

    .line 256
    :cond_b
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    .line 257
    .line 258
    .line 259
    move-result v9

    .line 260
    if-nez v9, :cond_c

    .line 261
    .line 262
    invoke-virtual {v8, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v8

    .line 266
    check-cast v8, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;

    .line 267
    .line 268
    invoke-virtual {v8}, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->getRevisingComments()Ljava/util/ArrayList;

    .line 269
    .line 270
    .line 271
    move-result-object v8

    .line 272
    goto/16 :goto_3

    .line 273
    .line 274
    :cond_c
    new-instance v8, Ljava/util/ArrayList;

    .line 275
    .line 276
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 277
    .line 278
    .line 279
    goto/16 :goto_3

    .line 280
    .line 281
    :goto_8
    invoke-virtual {v0, v7, v4, v8, v9}, Lcom/zykj/mistake/fragment/RevisedAnswerFragment;->h(Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;)V

    .line 282
    .line 283
    .line 284
    move v4, v5

    .line 285
    goto/16 :goto_0

    .line 286
    .line 287
    :cond_d
    return-void
.end method
