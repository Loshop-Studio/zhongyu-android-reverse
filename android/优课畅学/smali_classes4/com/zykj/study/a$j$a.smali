# RE note 本类字节码直接引用的读写或显示接口包括DataStore。
.class public final Lcom/zykj/study/a$j$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll6/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/study/a$j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Lcom/zykj/study/a$h;

.field public final b:Lcom/zykj/study/a$d;

.field public final c:Lcom/zykj/study/a$j;

.field public final d:I


# direct methods
.method public constructor <init>(Lcom/zykj/study/a$h;Lcom/zykj/study/a$d;Lcom/zykj/study/a$j;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/zykj/study/a$j$a;->a:Lcom/zykj/study/a$h;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/zykj/study/a$j$a;->b:Lcom/zykj/study/a$d;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/zykj/study/a$j$a;->c:Lcom/zykj/study/a$j;

    .line 9
    .line 10
    iput p4, p0, Lcom/zykj/study/a$j$a;->d:I

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public get()Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lcom/zykj/study/a$j$a;->d:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/lang/AssertionError;

    .line 7
    .line 8
    iget v1, p0, Lcom/zykj/study/a$j$a;->d:I

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(I)V

    .line 11
    .line 12
    .line 13
    throw v0

    .line 14
    :pswitch_0
    new-instance v0, Lcom/zykj/study/viewmodels/WebViewControlViewModel;

    .line 15
    .line 16
    invoke-direct {v0}, Lcom/zykj/study/viewmodels/WebViewControlViewModel;-><init>()V

    .line 17
    .line 18
    .line 19
    return-object v0

    .line 20
    :pswitch_1
    new-instance v0, Lcom/zykj/lib/ota/viewmodel/VersionViewModel;

    .line 21
    .line 22
    iget-object v1, p0, Lcom/zykj/study/a$j$a;->a:Lcom/zykj/study/a$h;

    .line 23
    .line 24
    iget-object v1, v1, Lcom/zykj/study/a$h;->O:Ll6/f;

    .line 25
    .line 26
    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Lv3/a;

    .line 31
    .line 32
    iget-object v2, p0, Lcom/zykj/study/a$j$a;->a:Lcom/zykj/study/a$h;

    .line 33
    .line 34
    iget-object v2, v2, Lcom/zykj/study/a$h;->P:Ll6/f;

    .line 35
    .line 36
    invoke-interface {v2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    check-cast v2, Landroidx/datastore/core/DataStore;

    .line 41
    .line 42
    invoke-direct {v0, v1, v2}, Lcom/zykj/lib/ota/viewmodel/VersionViewModel;-><init>(Lv3/a;Landroidx/datastore/core/DataStore;)V

    .line 43
    .line 44
    .line 45
    return-object v0

    .line 46
    :pswitch_2
    new-instance v0, Lcom/zykj/study/viewmodels/TrainSingleChoiceViewModel;

    .line 47
    .line 48
    iget-object v1, p0, Lcom/zykj/study/a$j$a;->a:Lcom/zykj/study/a$h;

    .line 49
    .line 50
    iget-object v1, v1, Lcom/zykj/study/a$h;->t:Ll6/f;

    .line 51
    .line 52
    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    check-cast v1, Lcom/zykj/study/repository/ExerciseRepository;

    .line 57
    .line 58
    invoke-direct {v0, v1}, Lcom/zykj/study/viewmodels/TrainSingleChoiceViewModel;-><init>(Lcom/zykj/study/repository/ExerciseRepository;)V

    .line 59
    .line 60
    .line 61
    return-object v0

    .line 62
    :pswitch_3
    new-instance v0, Lcom/zykj/study/viewmodels/TrainMultipleChoiceViewModel;

    .line 63
    .line 64
    iget-object v1, p0, Lcom/zykj/study/a$j$a;->a:Lcom/zykj/study/a$h;

    .line 65
    .line 66
    iget-object v1, v1, Lcom/zykj/study/a$h;->t:Ll6/f;

    .line 67
    .line 68
    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    check-cast v1, Lcom/zykj/study/repository/ExerciseRepository;

    .line 73
    .line 74
    invoke-direct {v0, v1}, Lcom/zykj/study/viewmodels/TrainMultipleChoiceViewModel;-><init>(Lcom/zykj/study/repository/ExerciseRepository;)V

    .line 75
    .line 76
    .line 77
    return-object v0

    .line 78
    :pswitch_4
    new-instance v0, Lcom/zykj/study/viewmodels/TrainAnswerMicroViewModel;

    .line 79
    .line 80
    iget-object v1, p0, Lcom/zykj/study/a$j$a;->a:Lcom/zykj/study/a$h;

    .line 81
    .line 82
    iget-object v1, v1, Lcom/zykj/study/a$h;->t:Ll6/f;

    .line 83
    .line 84
    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    check-cast v1, Lcom/zykj/study/repository/ExerciseRepository;

    .line 89
    .line 90
    invoke-direct {v0, v1}, Lcom/zykj/study/viewmodels/TrainAnswerMicroViewModel;-><init>(Lcom/zykj/study/repository/ExerciseRepository;)V

    .line 91
    .line 92
    .line 93
    return-object v0

    .line 94
    :pswitch_5
    new-instance v0, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel;

    .line 95
    .line 96
    iget-object v1, p0, Lcom/zykj/study/a$j$a;->a:Lcom/zykj/study/a$h;

    .line 97
    .line 98
    iget-object v1, v1, Lcom/zykj/study/a$h;->q:Ll6/f;

    .line 99
    .line 100
    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    check-cast v1, Lp3/a;

    .line 105
    .line 106
    iget-object v2, p0, Lcom/zykj/study/a$j$a;->a:Lcom/zykj/study/a$h;

    .line 107
    .line 108
    iget-object v2, v2, Lcom/zykj/study/a$h;->j:Ll6/f;

    .line 109
    .line 110
    invoke-interface {v2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    check-cast v2, Landroidx/datastore/core/DataStore;

    .line 115
    .line 116
    iget-object v3, p0, Lcom/zykj/study/a$j$a;->a:Lcom/zykj/study/a$h;

    .line 117
    .line 118
    iget-object v3, v3, Lcom/zykj/study/a$h;->r:Ll6/f;

    .line 119
    .line 120
    invoke-interface {v3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    check-cast v3, Landroidx/datastore/core/DataStore;

    .line 125
    .line 126
    invoke-direct {v0, v1, v2, v3}, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel;-><init>(Lp3/a;Landroidx/datastore/core/DataStore;Landroidx/datastore/core/DataStore;)V

    .line 127
    .line 128
    .line 129
    return-object v0

    .line 130
    :pswitch_6
    new-instance v0, Lcom/zykj/study/viewmodels/TeachDetailsViewModel;

    .line 131
    .line 132
    iget-object v1, p0, Lcom/zykj/study/a$j$a;->a:Lcom/zykj/study/a$h;

    .line 133
    .line 134
    iget-object v1, v1, Lcom/zykj/study/a$h;->x:Ll6/f;

    .line 135
    .line 136
    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    check-cast v1, Lcom/zykj/study/repository/TeachCourseRepository;

    .line 141
    .line 142
    invoke-direct {v0, v1}, Lcom/zykj/study/viewmodels/TeachDetailsViewModel;-><init>(Lcom/zykj/study/repository/TeachCourseRepository;)V

    .line 143
    .line 144
    .line 145
    return-object v0

    .line 146
    :pswitch_7
    new-instance v0, Lcom/zykj/study/viewmodels/StudyViewModel;

    .line 147
    .line 148
    iget-object v1, p0, Lcom/zykj/study/a$j$a;->a:Lcom/zykj/study/a$h;

    .line 149
    .line 150
    iget-object v1, v1, Lcom/zykj/study/a$h;->v:Ll6/f;

    .line 151
    .line 152
    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    check-cast v1, Lcom/zykj/study/repository/CourseRepository;

    .line 157
    .line 158
    iget-object v2, p0, Lcom/zykj/study/a$j$a;->a:Lcom/zykj/study/a$h;

    .line 159
    .line 160
    iget-object v2, v2, Lcom/zykj/study/a$h;->r:Ll6/f;

    .line 161
    .line 162
    invoke-interface {v2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v2

    .line 166
    check-cast v2, Landroidx/datastore/core/DataStore;

    .line 167
    .line 168
    iget-object v3, p0, Lcom/zykj/study/a$j$a;->a:Lcom/zykj/study/a$h;

    .line 169
    .line 170
    iget-object v3, v3, Lcom/zykj/study/a$h;->h:Ll6/f;

    .line 171
    .line 172
    invoke-interface {v3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v3

    .line 176
    check-cast v3, Ll8/h;

    .line 177
    .line 178
    invoke-direct {v0, v1, v2, v3}, Lcom/zykj/study/viewmodels/StudyViewModel;-><init>(Lcom/zykj/study/repository/CourseRepository;Landroidx/datastore/core/DataStore;Ll8/h;)V

    .line 179
    .line 180
    .line 181
    return-object v0

    .line 182
    :pswitch_8
    new-instance v0, Lcom/zykj/study/viewmodels/StudentViewViewModel;

    .line 183
    .line 184
    iget-object v1, p0, Lcom/zykj/study/a$j$a;->a:Lcom/zykj/study/a$h;

    .line 185
    .line 186
    iget-object v1, v1, Lcom/zykj/study/a$h;->x:Ll6/f;

    .line 187
    .line 188
    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v1

    .line 192
    check-cast v1, Lcom/zykj/study/repository/TeachCourseRepository;

    .line 193
    .line 194
    invoke-direct {v0, v1}, Lcom/zykj/study/viewmodels/StudentViewViewModel;-><init>(Lcom/zykj/study/repository/TeachCourseRepository;)V

    .line 195
    .line 196
    .line 197
    return-object v0

    .line 198
    :pswitch_9
    new-instance v0, Lcom/zykj/study/viewmodels/StudentViewContentViewModel;

    .line 199
    .line 200
    iget-object v1, p0, Lcom/zykj/study/a$j$a;->a:Lcom/zykj/study/a$h;

    .line 201
    .line 202
    iget-object v1, v1, Lcom/zykj/study/a$h;->r:Ll6/f;

    .line 203
    .line 204
    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v1

    .line 208
    check-cast v1, Landroidx/datastore/core/DataStore;

    .line 209
    .line 210
    iget-object v2, p0, Lcom/zykj/study/a$j$a;->a:Lcom/zykj/study/a$h;

    .line 211
    .line 212
    iget-object v2, v2, Lcom/zykj/study/a$h;->x:Ll6/f;

    .line 213
    .line 214
    invoke-interface {v2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v2

    .line 218
    check-cast v2, Lcom/zykj/study/repository/TeachCourseRepository;

    .line 219
    .line 220
    invoke-direct {v0, v1, v2}, Lcom/zykj/study/viewmodels/StudentViewContentViewModel;-><init>(Landroidx/datastore/core/DataStore;Lcom/zykj/study/repository/TeachCourseRepository;)V

    .line 221
    .line 222
    .line 223
    return-object v0

    .line 224
    :pswitch_a
    new-instance v0, Lcom/zykj/study/viewmodels/StudentExercisesViewModel;

    .line 225
    .line 226
    iget-object v1, p0, Lcom/zykj/study/a$j$a;->a:Lcom/zykj/study/a$h;

    .line 227
    .line 228
    iget-object v1, v1, Lcom/zykj/study/a$h;->t:Ll6/f;

    .line 229
    .line 230
    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v1

    .line 234
    check-cast v1, Lcom/zykj/study/repository/ExerciseRepository;

    .line 235
    .line 236
    invoke-direct {v0, v1}, Lcom/zykj/study/viewmodels/StudentExercisesViewModel;-><init>(Lcom/zykj/study/repository/ExerciseRepository;)V

    .line 237
    .line 238
    .line 239
    return-object v0

    .line 240
    :pswitch_b
    new-instance v0, Lcom/zykj/study/viewmodels/SettingViewModel;

    .line 241
    .line 242
    invoke-direct {v0}, Lcom/zykj/study/viewmodels/SettingViewModel;-><init>()V

    .line 243
    .line 244
    .line 245
    return-object v0

    .line 246
    :pswitch_c
    new-instance v0, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel;

    .line 247
    .line 248
    iget-object v1, p0, Lcom/zykj/study/a$j$a;->a:Lcom/zykj/study/a$h;

    .line 249
    .line 250
    iget-object v1, v1, Lcom/zykj/study/a$h;->q:Ll6/f;

    .line 251
    .line 252
    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v1

    .line 256
    check-cast v1, Lp3/a;

    .line 257
    .line 258
    invoke-direct {v0, v1}, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel;-><init>(Lp3/a;)V

    .line 259
    .line 260
    .line 261
    return-object v0

    .line 262
    :pswitch_d
    new-instance v0, Lcom/zykj/study/viewmodels/SearchViewModel;

    .line 263
    .line 264
    iget-object v1, p0, Lcom/zykj/study/a$j$a;->a:Lcom/zykj/study/a$h;

    .line 265
    .line 266
    iget-object v1, v1, Lcom/zykj/study/a$h;->M:Ll6/f;

    .line 267
    .line 268
    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v1

    .line 272
    check-cast v1, Lcom/zykj/study/repository/SearchHistoryRepository;

    .line 273
    .line 274
    iget-object v2, p0, Lcom/zykj/study/a$j$a;->a:Lcom/zykj/study/a$h;

    .line 275
    .line 276
    iget-object v2, v2, Lcom/zykj/study/a$h;->N:Ll6/f;

    .line 277
    .line 278
    invoke-interface {v2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v2

    .line 282
    check-cast v2, Lt4/g;

    .line 283
    .line 284
    iget-object v3, p0, Lcom/zykj/study/a$j$a;->a:Lcom/zykj/study/a$h;

    .line 285
    .line 286
    iget-object v3, v3, Lcom/zykj/study/a$h;->r:Ll6/f;

    .line 287
    .line 288
    invoke-interface {v3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object v3

    .line 292
    check-cast v3, Landroidx/datastore/core/DataStore;

    .line 293
    .line 294
    invoke-direct {v0, v1, v2, v3}, Lcom/zykj/study/viewmodels/SearchViewModel;-><init>(Lcom/zykj/study/repository/SearchHistoryRepository;Lt4/g;Landroidx/datastore/core/DataStore;)V

    .line 295
    .line 296
    .line 297
    return-object v0

    .line 298
    :pswitch_e
    new-instance v0, Lcom/zykj/study/viewmodels/PDFViewModel;

    .line 299
    .line 300
    iget-object v1, p0, Lcom/zykj/study/a$j$a;->a:Lcom/zykj/study/a$h;

    .line 301
    .line 302
    iget-object v1, v1, Lcom/zykj/study/a$h;->K:Ll6/f;

    .line 303
    .line 304
    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    move-result-object v1

    .line 308
    check-cast v1, Lcom/zykj/study/data/PdfDao;

    .line 309
    .line 310
    invoke-direct {v0, v1}, Lcom/zykj/study/viewmodels/PDFViewModel;-><init>(Lcom/zykj/study/data/PdfDao;)V

    .line 311
    .line 312
    .line 313
    return-object v0

    .line 314
    :pswitch_f
    new-instance v0, Lcom/zykj/study/viewmodels/OssTokenViewModel;

    .line 315
    .line 316
    iget-object v1, p0, Lcom/zykj/study/a$j$a;->a:Lcom/zykj/study/a$h;

    .line 317
    .line 318
    iget-object v1, v1, Lcom/zykj/study/a$h;->J:Ll6/f;

    .line 319
    .line 320
    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    move-result-object v1

    .line 324
    check-cast v1, Lt4/k;

    .line 325
    .line 326
    iget-object v2, p0, Lcom/zykj/study/a$j$a;->a:Lcom/zykj/study/a$h;

    .line 327
    .line 328
    iget-object v2, v2, Lcom/zykj/study/a$h;->r:Ll6/f;

    .line 329
    .line 330
    invoke-interface {v2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    move-result-object v2

    .line 334
    check-cast v2, Landroidx/datastore/core/DataStore;

    .line 335
    .line 336
    invoke-direct {v0, v1, v2}, Lcom/zykj/study/viewmodels/OssTokenViewModel;-><init>(Lt4/k;Landroidx/datastore/core/DataStore;)V

    .line 337
    .line 338
    .line 339
    return-object v0

    .line 340
    :pswitch_10
    new-instance v0, Lcom/zykj/study/viewmodels/NotifyDataChangedViewModel;

    .line 341
    .line 342
    invoke-direct {v0}, Lcom/zykj/study/viewmodels/NotifyDataChangedViewModel;-><init>()V

    .line 343
    .line 344
    .line 345
    return-object v0

    .line 346
    :pswitch_11
    new-instance v0, Lcom/zykj/study/viewmodels/MyTeachCourseViewModel;

    .line 347
    .line 348
    iget-object v1, p0, Lcom/zykj/study/a$j$a;->a:Lcom/zykj/study/a$h;

    .line 349
    .line 350
    iget-object v1, v1, Lcom/zykj/study/a$h;->x:Ll6/f;

    .line 351
    .line 352
    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    move-result-object v1

    .line 356
    check-cast v1, Lcom/zykj/study/repository/TeachCourseRepository;

    .line 357
    .line 358
    invoke-direct {v0, v1}, Lcom/zykj/study/viewmodels/MyTeachCourseViewModel;-><init>(Lcom/zykj/study/repository/TeachCourseRepository;)V

    .line 359
    .line 360
    .line 361
    return-object v0

    .line 362
    :pswitch_12
    new-instance v0, Lcom/zykj/study/viewmodels/MyCourseViewModel;

    .line 363
    .line 364
    iget-object v1, p0, Lcom/zykj/study/a$j$a;->a:Lcom/zykj/study/a$h;

    .line 365
    .line 366
    iget-object v1, v1, Lcom/zykj/study/a$h;->v:Ll6/f;

    .line 367
    .line 368
    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 369
    .line 370
    .line 371
    move-result-object v1

    .line 372
    check-cast v1, Lcom/zykj/study/repository/CourseRepository;

    .line 373
    .line 374
    iget-object v2, p0, Lcom/zykj/study/a$j$a;->a:Lcom/zykj/study/a$h;

    .line 375
    .line 376
    iget-object v2, v2, Lcom/zykj/study/a$h;->r:Ll6/f;

    .line 377
    .line 378
    invoke-interface {v2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 379
    .line 380
    .line 381
    move-result-object v2

    .line 382
    check-cast v2, Landroidx/datastore/core/DataStore;

    .line 383
    .line 384
    invoke-direct {v0, v1, v2}, Lcom/zykj/study/viewmodels/MyCourseViewModel;-><init>(Lcom/zykj/study/repository/CourseRepository;Landroidx/datastore/core/DataStore;)V

    .line 385
    .line 386
    .line 387
    return-object v0

    .line 388
    :pswitch_13
    new-instance v0, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;

    .line 389
    .line 390
    iget-object v1, p0, Lcom/zykj/study/a$j$a;->a:Lcom/zykj/study/a$h;

    .line 391
    .line 392
    iget-object v1, v1, Lcom/zykj/study/a$h;->v:Ll6/f;

    .line 393
    .line 394
    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 395
    .line 396
    .line 397
    move-result-object v1

    .line 398
    check-cast v1, Lcom/zykj/study/repository/CourseRepository;

    .line 399
    .line 400
    iget-object v2, p0, Lcom/zykj/study/a$j$a;->a:Lcom/zykj/study/a$h;

    .line 401
    .line 402
    iget-object v2, v2, Lcom/zykj/study/a$h;->r:Ll6/f;

    .line 403
    .line 404
    invoke-interface {v2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    move-result-object v2

    .line 408
    check-cast v2, Landroidx/datastore/core/DataStore;

    .line 409
    .line 410
    iget-object v3, p0, Lcom/zykj/study/a$j$a;->a:Lcom/zykj/study/a$h;

    .line 411
    .line 412
    iget-object v3, v3, Lcom/zykj/study/a$h;->h:Ll6/f;

    .line 413
    .line 414
    invoke-interface {v3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 415
    .line 416
    .line 417
    move-result-object v3

    .line 418
    check-cast v3, Ll8/h;

    .line 419
    .line 420
    invoke-direct {v0, v1, v2, v3}, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;-><init>(Lcom/zykj/study/repository/CourseRepository;Landroidx/datastore/core/DataStore;Ll8/h;)V

    .line 421
    .line 422
    .line 423
    return-object v0

    .line 424
    :pswitch_14
    new-instance v0, Lcom/zykj/study/viewmodels/MicroExtraViewModel;

    .line 425
    .line 426
    invoke-direct {v0}, Lcom/zykj/study/viewmodels/MicroExtraViewModel;-><init>()V

    .line 427
    .line 428
    .line 429
    return-object v0

    .line 430
    :pswitch_15
    new-instance v0, Lcom/zykj/study/viewmodels/MicroEditViewModel;

    .line 431
    .line 432
    iget-object v1, p0, Lcom/zykj/study/a$j$a;->a:Lcom/zykj/study/a$h;

    .line 433
    .line 434
    iget-object v1, v1, Lcom/zykj/study/a$h;->t:Ll6/f;

    .line 435
    .line 436
    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 437
    .line 438
    .line 439
    move-result-object v1

    .line 440
    check-cast v1, Lcom/zykj/study/repository/ExerciseRepository;

    .line 441
    .line 442
    invoke-direct {v0, v1}, Lcom/zykj/study/viewmodels/MicroEditViewModel;-><init>(Lcom/zykj/study/repository/ExerciseRepository;)V

    .line 443
    .line 444
    .line 445
    return-object v0

    .line 446
    :pswitch_16
    new-instance v0, Lcom/zykj/study/viewmodels/MicroCodeViewModel;

    .line 447
    .line 448
    iget-object v1, p0, Lcom/zykj/study/a$j$a;->a:Lcom/zykj/study/a$h;

    .line 449
    .line 450
    iget-object v1, v1, Lcom/zykj/study/a$h;->H:Ll6/f;

    .line 451
    .line 452
    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 453
    .line 454
    .line 455
    move-result-object v1

    .line 456
    check-cast v1, Lcom/zykj/study/repository/QuickCodeRepository;

    .line 457
    .line 458
    invoke-direct {v0, v1}, Lcom/zykj/study/viewmodels/MicroCodeViewModel;-><init>(Lcom/zykj/study/repository/QuickCodeRepository;)V

    .line 459
    .line 460
    .line 461
    return-object v0

    .line 462
    :pswitch_17
    new-instance v0, Lcom/zykj/study/viewmodels/ManagementSubscribeViewModel;

    .line 463
    .line 464
    iget-object v1, p0, Lcom/zykj/study/a$j$a;->c:Lcom/zykj/study/a$j;

    .line 465
    .line 466
    invoke-virtual {v1}, Lcom/zykj/study/a$j;->f()Lcom/zykj/study/repository/SubscribeRepository;

    .line 467
    .line 468
    .line 469
    move-result-object v1

    .line 470
    invoke-direct {v0, v1}, Lcom/zykj/study/viewmodels/ManagementSubscribeViewModel;-><init>(Lcom/zykj/study/repository/SubscribeRepository;)V

    .line 471
    .line 472
    .line 473
    return-object v0

    .line 474
    :pswitch_18
    new-instance v0, Lcom/zykj/study/viewmodels/MainViewModel;

    .line 475
    .line 476
    iget-object v1, p0, Lcom/zykj/study/a$j$a;->a:Lcom/zykj/study/a$h;

    .line 477
    .line 478
    iget-object v1, v1, Lcom/zykj/study/a$h;->h:Ll6/f;

    .line 479
    .line 480
    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 481
    .line 482
    .line 483
    move-result-object v1

    .line 484
    check-cast v1, Ll8/h;

    .line 485
    .line 486
    iget-object v2, p0, Lcom/zykj/study/a$j$a;->a:Lcom/zykj/study/a$h;

    .line 487
    .line 488
    iget-object v2, v2, Lcom/zykj/study/a$h;->j:Ll6/f;

    .line 489
    .line 490
    invoke-interface {v2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 491
    .line 492
    .line 493
    move-result-object v2

    .line 494
    check-cast v2, Landroidx/datastore/core/DataStore;

    .line 495
    .line 496
    invoke-direct {v0, v1, v2}, Lcom/zykj/study/viewmodels/MainViewModel;-><init>(Ll8/h;Landroidx/datastore/core/DataStore;)V

    .line 497
    .line 498
    .line 499
    return-object v0

    .line 500
    :pswitch_19
    new-instance v0, Lcom/zykj/lib/login/ui/main/LoginViewModel;

    .line 501
    .line 502
    iget-object v1, p0, Lcom/zykj/study/a$j$a;->a:Lcom/zykj/study/a$h;

    .line 503
    .line 504
    iget-object v1, v1, Lcom/zykj/study/a$h;->j:Ll6/f;

    .line 505
    .line 506
    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 507
    .line 508
    .line 509
    move-result-object v1

    .line 510
    check-cast v1, Landroidx/datastore/core/DataStore;

    .line 511
    .line 512
    iget-object v2, p0, Lcom/zykj/study/a$j$a;->a:Lcom/zykj/study/a$h;

    .line 513
    .line 514
    iget-object v2, v2, Lcom/zykj/study/a$h;->r:Ll6/f;

    .line 515
    .line 516
    invoke-interface {v2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 517
    .line 518
    .line 519
    move-result-object v2

    .line 520
    check-cast v2, Landroidx/datastore/core/DataStore;

    .line 521
    .line 522
    invoke-direct {v0, v1, v2}, Lcom/zykj/lib/login/ui/main/LoginViewModel;-><init>(Landroidx/datastore/core/DataStore;Landroidx/datastore/core/DataStore;)V

    .line 523
    .line 524
    .line 525
    return-object v0

    .line 526
    :pswitch_1a
    new-instance v0, Lcom/zykj/study/viewmodels/HomeViewModel;

    .line 527
    .line 528
    iget-object v1, p0, Lcom/zykj/study/a$j$a;->a:Lcom/zykj/study/a$h;

    .line 529
    .line 530
    iget-object v1, v1, Lcom/zykj/study/a$h;->r:Ll6/f;

    .line 531
    .line 532
    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 533
    .line 534
    .line 535
    move-result-object v1

    .line 536
    check-cast v1, Landroidx/datastore/core/DataStore;

    .line 537
    .line 538
    iget-object v2, p0, Lcom/zykj/study/a$j$a;->a:Lcom/zykj/study/a$h;

    .line 539
    .line 540
    iget-object v2, v2, Lcom/zykj/study/a$h;->E:Ll6/f;

    .line 541
    .line 542
    invoke-interface {v2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 543
    .line 544
    .line 545
    move-result-object v2

    .line 546
    check-cast v2, Lo4/k;

    .line 547
    .line 548
    invoke-direct {v0, v1, v2}, Lcom/zykj/study/viewmodels/HomeViewModel;-><init>(Landroidx/datastore/core/DataStore;Lo4/k;)V

    .line 549
    .line 550
    .line 551
    return-object v0

    .line 552
    :pswitch_1b
    new-instance v0, Lcom/zykj/study/viewmodels/ExerciseViewerViewModel;

    .line 553
    .line 554
    iget-object v1, p0, Lcom/zykj/study/a$j$a;->a:Lcom/zykj/study/a$h;

    .line 555
    .line 556
    iget-object v1, v1, Lcom/zykj/study/a$h;->t:Ll6/f;

    .line 557
    .line 558
    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 559
    .line 560
    .line 561
    move-result-object v1

    .line 562
    check-cast v1, Lcom/zykj/study/repository/ExerciseRepository;

    .line 563
    .line 564
    iget-object v2, p0, Lcom/zykj/study/a$j$a;->a:Lcom/zykj/study/a$h;

    .line 565
    .line 566
    iget-object v2, v2, Lcom/zykj/study/a$h;->r:Ll6/f;

    .line 567
    .line 568
    invoke-interface {v2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 569
    .line 570
    .line 571
    move-result-object v2

    .line 572
    check-cast v2, Landroidx/datastore/core/DataStore;

    .line 573
    .line 574
    invoke-direct {v0, v1, v2}, Lcom/zykj/study/viewmodels/ExerciseViewerViewModel;-><init>(Lcom/zykj/study/repository/ExerciseRepository;Landroidx/datastore/core/DataStore;)V

    .line 575
    .line 576
    .line 577
    return-object v0

    .line 578
    :pswitch_1c
    new-instance v0, Lcom/zykj/study/viewmodels/ExerciseViewModel;

    .line 579
    .line 580
    iget-object v1, p0, Lcom/zykj/study/a$j$a;->a:Lcom/zykj/study/a$h;

    .line 581
    .line 582
    iget-object v1, v1, Lcom/zykj/study/a$h;->t:Ll6/f;

    .line 583
    .line 584
    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 585
    .line 586
    .line 587
    move-result-object v1

    .line 588
    check-cast v1, Lcom/zykj/study/repository/ExerciseRepository;

    .line 589
    .line 590
    invoke-direct {v0, v1}, Lcom/zykj/study/viewmodels/ExerciseViewModel;-><init>(Lcom/zykj/study/repository/ExerciseRepository;)V

    .line 591
    .line 592
    .line 593
    return-object v0

    .line 594
    :pswitch_1d
    new-instance v0, Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;

    .line 595
    .line 596
    iget-object v1, p0, Lcom/zykj/study/a$j$a;->a:Lcom/zykj/study/a$h;

    .line 597
    .line 598
    iget-object v1, v1, Lcom/zykj/study/a$h;->t:Ll6/f;

    .line 599
    .line 600
    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 601
    .line 602
    .line 603
    move-result-object v1

    .line 604
    check-cast v1, Lcom/zykj/study/repository/ExerciseRepository;

    .line 605
    .line 606
    iget-object v2, p0, Lcom/zykj/study/a$j$a;->a:Lcom/zykj/study/a$h;

    .line 607
    .line 608
    iget-object v2, v2, Lcom/zykj/study/a$h;->D:Ll6/f;

    .line 609
    .line 610
    invoke-interface {v2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 611
    .line 612
    .line 613
    move-result-object v2

    .line 614
    check-cast v2, Lcom/zykj/study/bean/DataStoreManager;

    .line 615
    .line 616
    invoke-direct {v0, v1, v2}, Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;-><init>(Lcom/zykj/study/repository/ExerciseRepository;Lcom/zykj/study/bean/DataStoreManager;)V

    .line 617
    .line 618
    .line 619
    return-object v0

    .line 620
    :pswitch_1e
    new-instance v0, Lcom/zykj/study/viewmodels/ExerciseStudentHistoryViewModel;

    .line 621
    .line 622
    iget-object v1, p0, Lcom/zykj/study/a$j$a;->a:Lcom/zykj/study/a$h;

    .line 623
    .line 624
    iget-object v1, v1, Lcom/zykj/study/a$h;->t:Ll6/f;

    .line 625
    .line 626
    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 627
    .line 628
    .line 629
    move-result-object v1

    .line 630
    check-cast v1, Lcom/zykj/study/repository/ExerciseRepository;

    .line 631
    .line 632
    invoke-direct {v0, v1}, Lcom/zykj/study/viewmodels/ExerciseStudentHistoryViewModel;-><init>(Lcom/zykj/study/repository/ExerciseRepository;)V

    .line 633
    .line 634
    .line 635
    return-object v0

    .line 636
    :pswitch_1f
    new-instance v0, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;

    .line 637
    .line 638
    iget-object v1, p0, Lcom/zykj/study/a$j$a;->a:Lcom/zykj/study/a$h;

    .line 639
    .line 640
    iget-object v1, v1, Lcom/zykj/study/a$h;->x:Ll6/f;

    .line 641
    .line 642
    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 643
    .line 644
    .line 645
    move-result-object v1

    .line 646
    check-cast v1, Lcom/zykj/study/repository/TeachCourseRepository;

    .line 647
    .line 648
    invoke-direct {v0, v1}, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;-><init>(Lcom/zykj/study/repository/TeachCourseRepository;)V

    .line 649
    .line 650
    .line 651
    return-object v0

    .line 652
    :pswitch_20
    new-instance v0, Lcom/zykj/study/viewmodels/ExerciseHistoryViewModel;

    .line 653
    .line 654
    iget-object v1, p0, Lcom/zykj/study/a$j$a;->a:Lcom/zykj/study/a$h;

    .line 655
    .line 656
    iget-object v1, v1, Lcom/zykj/study/a$h;->t:Ll6/f;

    .line 657
    .line 658
    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 659
    .line 660
    .line 661
    move-result-object v1

    .line 662
    check-cast v1, Lcom/zykj/study/repository/ExerciseRepository;

    .line 663
    .line 664
    iget-object v2, p0, Lcom/zykj/study/a$j$a;->a:Lcom/zykj/study/a$h;

    .line 665
    .line 666
    iget-object v2, v2, Lcom/zykj/study/a$h;->r:Ll6/f;

    .line 667
    .line 668
    invoke-interface {v2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 669
    .line 670
    .line 671
    move-result-object v2

    .line 672
    check-cast v2, Landroidx/datastore/core/DataStore;

    .line 673
    .line 674
    invoke-direct {v0, v1, v2}, Lcom/zykj/study/viewmodels/ExerciseHistoryViewModel;-><init>(Lcom/zykj/study/repository/ExerciseRepository;Landroidx/datastore/core/DataStore;)V

    .line 675
    .line 676
    .line 677
    return-object v0

    .line 678
    :pswitch_21
    new-instance v0, Lcom/zykj/study/viewmodels/EditCourseViewModel;

    .line 679
    .line 680
    iget-object v1, p0, Lcom/zykj/study/a$j$a;->a:Lcom/zykj/study/a$h;

    .line 681
    .line 682
    iget-object v1, v1, Lcom/zykj/study/a$h;->v:Ll6/f;

    .line 683
    .line 684
    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 685
    .line 686
    .line 687
    move-result-object v1

    .line 688
    check-cast v1, Lcom/zykj/study/repository/CourseRepository;

    .line 689
    .line 690
    iget-object v2, p0, Lcom/zykj/study/a$j$a;->a:Lcom/zykj/study/a$h;

    .line 691
    .line 692
    iget-object v2, v2, Lcom/zykj/study/a$h;->r:Ll6/f;

    .line 693
    .line 694
    invoke-interface {v2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 695
    .line 696
    .line 697
    move-result-object v2

    .line 698
    check-cast v2, Landroidx/datastore/core/DataStore;

    .line 699
    .line 700
    invoke-direct {v0, v1, v2}, Lcom/zykj/study/viewmodels/EditCourseViewModel;-><init>(Lcom/zykj/study/repository/CourseRepository;Landroidx/datastore/core/DataStore;)V

    .line 701
    .line 702
    .line 703
    return-object v0

    .line 704
    :pswitch_22
    new-instance v0, Lcom/zykj/study/viewmodels/DictViewModel;

    .line 705
    .line 706
    iget-object v1, p0, Lcom/zykj/study/a$j$a;->a:Lcom/zykj/study/a$h;

    .line 707
    .line 708
    iget-object v1, v1, Lcom/zykj/study/a$h;->C:Ll6/f;

    .line 709
    .line 710
    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 711
    .line 712
    .line 713
    move-result-object v1

    .line 714
    check-cast v1, Lcom/zykj/study/repository/DictRepository;

    .line 715
    .line 716
    invoke-direct {v0, v1}, Lcom/zykj/study/viewmodels/DictViewModel;-><init>(Lcom/zykj/study/repository/DictRepository;)V

    .line 717
    .line 718
    .line 719
    return-object v0

    .line 720
    :pswitch_23
    new-instance v0, Lcom/zykj/study/viewmodels/CourseViewViewModel;

    .line 721
    .line 722
    iget-object v1, p0, Lcom/zykj/study/a$j$a;->a:Lcom/zykj/study/a$h;

    .line 723
    .line 724
    iget-object v1, v1, Lcom/zykj/study/a$h;->x:Ll6/f;

    .line 725
    .line 726
    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 727
    .line 728
    .line 729
    move-result-object v1

    .line 730
    check-cast v1, Lcom/zykj/study/repository/TeachCourseRepository;

    .line 731
    .line 732
    iget-object v2, p0, Lcom/zykj/study/a$j$a;->a:Lcom/zykj/study/a$h;

    .line 733
    .line 734
    iget-object v2, v2, Lcom/zykj/study/a$h;->h:Ll6/f;

    .line 735
    .line 736
    invoke-interface {v2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 737
    .line 738
    .line 739
    move-result-object v2

    .line 740
    check-cast v2, Ll8/h;

    .line 741
    .line 742
    invoke-direct {v0, v1, v2}, Lcom/zykj/study/viewmodels/CourseViewViewModel;-><init>(Lcom/zykj/study/repository/TeachCourseRepository;Ll8/h;)V

    .line 743
    .line 744
    .line 745
    return-object v0

    .line 746
    :pswitch_24
    new-instance v0, Lcom/zykj/study/viewmodels/CourseViewModel;

    .line 747
    .line 748
    iget-object v1, p0, Lcom/zykj/study/a$j$a;->a:Lcom/zykj/study/a$h;

    .line 749
    .line 750
    iget-object v1, v1, Lcom/zykj/study/a$h;->v:Ll6/f;

    .line 751
    .line 752
    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 753
    .line 754
    .line 755
    move-result-object v1

    .line 756
    check-cast v1, Lcom/zykj/study/repository/CourseRepository;

    .line 757
    .line 758
    invoke-direct {v0, v1}, Lcom/zykj/study/viewmodels/CourseViewModel;-><init>(Lcom/zykj/study/repository/CourseRepository;)V

    .line 759
    .line 760
    .line 761
    return-object v0

    .line 762
    :pswitch_25
    new-instance v0, Lcom/zykj/study/viewmodels/CourseManageVewModel;

    .line 763
    .line 764
    iget-object v1, p0, Lcom/zykj/study/a$j$a;->a:Lcom/zykj/study/a$h;

    .line 765
    .line 766
    iget-object v1, v1, Lcom/zykj/study/a$h;->l:Ll6/f;

    .line 767
    .line 768
    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 769
    .line 770
    .line 771
    move-result-object v1

    .line 772
    check-cast v1, Lo4/b;

    .line 773
    .line 774
    invoke-direct {v0, v1}, Lcom/zykj/study/viewmodels/CourseManageVewModel;-><init>(Lo4/b;)V

    .line 775
    .line 776
    .line 777
    return-object v0

    .line 778
    :pswitch_26
    new-instance v0, Lcom/zykj/study/viewmodels/CourseDetailsViewModel;

    .line 779
    .line 780
    iget-object v1, p0, Lcom/zykj/study/a$j$a;->a:Lcom/zykj/study/a$h;

    .line 781
    .line 782
    iget-object v1, v1, Lcom/zykj/study/a$h;->v:Ll6/f;

    .line 783
    .line 784
    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 785
    .line 786
    .line 787
    move-result-object v1

    .line 788
    check-cast v1, Lcom/zykj/study/repository/CourseRepository;

    .line 789
    .line 790
    iget-object v2, p0, Lcom/zykj/study/a$j$a;->a:Lcom/zykj/study/a$h;

    .line 791
    .line 792
    iget-object v2, v2, Lcom/zykj/study/a$h;->r:Ll6/f;

    .line 793
    .line 794
    invoke-interface {v2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 795
    .line 796
    .line 797
    move-result-object v2

    .line 798
    check-cast v2, Landroidx/datastore/core/DataStore;

    .line 799
    .line 800
    iget-object v3, p0, Lcom/zykj/study/a$j$a;->a:Lcom/zykj/study/a$h;

    .line 801
    .line 802
    iget-object v3, v3, Lcom/zykj/study/a$h;->h:Ll6/f;

    .line 803
    .line 804
    invoke-interface {v3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 805
    .line 806
    .line 807
    move-result-object v3

    .line 808
    check-cast v3, Ll8/h;

    .line 809
    .line 810
    invoke-direct {v0, v1, v2, v3}, Lcom/zykj/study/viewmodels/CourseDetailsViewModel;-><init>(Lcom/zykj/study/repository/CourseRepository;Landroidx/datastore/core/DataStore;Ll8/h;)V

    .line 811
    .line 812
    .line 813
    return-object v0

    .line 814
    :pswitch_27
    new-instance v0, Lcom/zykj/study/viewmodels/CourseContentViewModel;

    .line 815
    .line 816
    iget-object v1, p0, Lcom/zykj/study/a$j$a;->a:Lcom/zykj/study/a$h;

    .line 817
    .line 818
    iget-object v1, v1, Lcom/zykj/study/a$h;->r:Ll6/f;

    .line 819
    .line 820
    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 821
    .line 822
    .line 823
    move-result-object v1

    .line 824
    check-cast v1, Landroidx/datastore/core/DataStore;

    .line 825
    .line 826
    iget-object v2, p0, Lcom/zykj/study/a$j$a;->a:Lcom/zykj/study/a$h;

    .line 827
    .line 828
    iget-object v2, v2, Lcom/zykj/study/a$h;->t:Ll6/f;

    .line 829
    .line 830
    invoke-interface {v2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 831
    .line 832
    .line 833
    move-result-object v2

    .line 834
    check-cast v2, Lcom/zykj/study/repository/ExerciseRepository;

    .line 835
    .line 836
    invoke-direct {v0, v1, v2}, Lcom/zykj/study/viewmodels/CourseContentViewModel;-><init>(Landroidx/datastore/core/DataStore;Lcom/zykj/study/repository/ExerciseRepository;)V

    .line 837
    .line 838
    .line 839
    return-object v0

    .line 840
    :pswitch_28
    new-instance v0, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel;

    .line 841
    .line 842
    iget-object v1, p0, Lcom/zykj/study/a$j$a;->a:Lcom/zykj/study/a$h;

    .line 843
    .line 844
    iget-object v1, v1, Lcom/zykj/study/a$h;->q:Ll6/f;

    .line 845
    .line 846
    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 847
    .line 848
    .line 849
    move-result-object v1

    .line 850
    check-cast v1, Lp3/a;

    .line 851
    .line 852
    invoke-direct {v0, v1}, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel;-><init>(Lp3/a;)V

    .line 853
    .line 854
    .line 855
    return-object v0

    .line 856
    :pswitch_29
    new-instance v0, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel;

    .line 857
    .line 858
    iget-object v1, p0, Lcom/zykj/study/a$j$a;->a:Lcom/zykj/study/a$h;

    .line 859
    .line 860
    iget-object v1, v1, Lcom/zykj/study/a$h;->q:Ll6/f;

    .line 861
    .line 862
    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 863
    .line 864
    .line 865
    move-result-object v1

    .line 866
    check-cast v1, Lp3/a;

    .line 867
    .line 868
    iget-object v2, p0, Lcom/zykj/study/a$j$a;->c:Lcom/zykj/study/a$j;

    .line 869
    .line 870
    invoke-static {v2}, Lcom/zykj/study/a$j;->c(Lcom/zykj/study/a$j;)Landroidx/lifecycle/SavedStateHandle;

    .line 871
    .line 872
    .line 873
    move-result-object v2

    .line 874
    invoke-direct {v0, v1, v2}, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePsdViewModel;-><init>(Lp3/a;Landroidx/lifecycle/SavedStateHandle;)V

    .line 875
    .line 876
    .line 877
    return-object v0

    .line 878
    :pswitch_2a
    new-instance v0, Lcom/zykj/study/viewmodels/CatalogViewModel;

    .line 879
    .line 880
    invoke-direct {v0}, Lcom/zykj/study/viewmodels/CatalogViewModel;-><init>()V

    .line 881
    .line 882
    .line 883
    return-object v0

    .line 884
    :pswitch_2b
    new-instance v0, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;

    .line 885
    .line 886
    iget-object v1, p0, Lcom/zykj/study/a$j$a;->a:Lcom/zykj/study/a$h;

    .line 887
    .line 888
    iget-object v1, v1, Lcom/zykj/study/a$h;->m:Ll6/f;

    .line 889
    .line 890
    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 891
    .line 892
    .line 893
    move-result-object v1

    .line 894
    check-cast v1, Lt4/a;

    .line 895
    .line 896
    invoke-direct {v0, v1}, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;-><init>(Lt4/a;)V

    .line 897
    .line 898
    .line 899
    return-object v0

    .line 900
    :pswitch_2c
    new-instance v0, Lcom/zykj/study/viewmodels/AnswerAreaViewModel;

    .line 901
    .line 902
    invoke-direct {v0}, Lcom/zykj/study/viewmodels/AnswerAreaViewModel;-><init>()V

    .line 903
    .line 904
    .line 905
    return-object v0

    .line 906
    nop

    .line 907
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
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
