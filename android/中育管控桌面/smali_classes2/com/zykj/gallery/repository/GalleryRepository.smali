.class public final Lcom/zykj/gallery/repository/GalleryRepository;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lcom/zykj/gallery/api/PictureService;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/zykj/gallery/api/PictureService;)V
    .locals 1

    .line 1
    const-string v0, "pictureService"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/zykj/gallery/repository/GalleryRepository;->a:Lcom/zykj/gallery/api/PictureService;

    .line 10
    .line 11
    return-void
.end method

.method public static final synthetic a(Lcom/zykj/gallery/repository/GalleryRepository;Ljava/lang/String;Lcom/zykj/gallery/oss/FileType;Ljava/lang/String;Lcom/zykj/gallery/oss/FileResource;Ljava/lang/String;Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual/range {p0 .. p9}, Lcom/zykj/gallery/repository/GalleryRepository;->h(Ljava/lang/String;Lcom/zykj/gallery/oss/FileType;Ljava/lang/String;Lcom/zykj/gallery/oss/FileResource;Ljava/lang/String;Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic g(Lcom/zykj/gallery/repository/GalleryRepository;Ljava/lang/String;Lcom/zykj/gallery/oss/FileType;Ljava/lang/String;Lcom/zykj/gallery/oss/FileResource;Ljava/lang/String;Ljava/lang/String;JLkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    and-int/lit8 v0, p10, 0x4

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string v0, ""

    .line 6
    .line 7
    move-object v4, v0

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move-object/from16 v4, p3

    .line 10
    .line 11
    :goto_0
    and-int/lit8 v0, p10, 0x10

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    const-string v0, "0"

    .line 16
    .line 17
    move-object v6, v0

    .line 18
    goto :goto_1

    .line 19
    :cond_1
    move-object/from16 v6, p5

    .line 20
    .line 21
    :goto_1
    and-int/lit8 v0, p10, 0x20

    .line 22
    .line 23
    if-eqz v0, :cond_2

    .line 24
    .line 25
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v7

    .line 33
    const-string v0, "toString(...)"

    .line 34
    .line 35
    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    const/4 v11, 0x4

    .line 39
    const/4 v12, 0x0

    .line 40
    const-string v8, "-"

    .line 41
    .line 42
    const-string v9, ""

    .line 43
    .line 44
    const/4 v10, 0x0

    .line 45
    invoke-static/range {v7 .. v12}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    move-object v7, v0

    .line 50
    goto :goto_2

    .line 51
    :cond_2
    move-object/from16 v7, p6

    .line 52
    .line 53
    :goto_2
    and-int/lit8 v0, p10, 0x40

    .line 54
    .line 55
    if-eqz v0, :cond_3

    .line 56
    .line 57
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 58
    .line 59
    .line 60
    move-result-wide v0

    .line 61
    move-wide v8, v0

    .line 62
    move-object v2, p1

    .line 63
    move-object v3, p2

    .line 64
    move-object/from16 v5, p4

    .line 65
    .line 66
    move-object/from16 v10, p9

    .line 67
    .line 68
    move-object v1, p0

    .line 69
    goto :goto_3

    .line 70
    :cond_3
    move-wide/from16 v8, p7

    .line 71
    .line 72
    move-object v1, p0

    .line 73
    move-object v2, p1

    .line 74
    move-object v3, p2

    .line 75
    move-object/from16 v5, p4

    .line 76
    .line 77
    move-object/from16 v10, p9

    .line 78
    .line 79
    :goto_3
    invoke-virtual/range {v1 .. v10}, Lcom/zykj/gallery/repository/GalleryRepository;->f(Ljava/lang/String;Lcom/zykj/gallery/oss/FileType;Ljava/lang/String;Lcom/zykj/gallery/oss/FileResource;Ljava/lang/String;Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    return-object p0
.end method


# virtual methods
.method public final b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p5

    .line 6
    .line 7
    instance-of v3, v2, Lcom/zykj/gallery/repository/GalleryRepository$addPictureAsync$1;

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    move-object v3, v2

    .line 12
    check-cast v3, Lcom/zykj/gallery/repository/GalleryRepository$addPictureAsync$1;

    .line 13
    .line 14
    iget v4, v3, Lcom/zykj/gallery/repository/GalleryRepository$addPictureAsync$1;->h:I

    .line 15
    .line 16
    const/high16 v5, -0x80000000

    .line 17
    .line 18
    and-int v6, v4, v5

    .line 19
    .line 20
    if-eqz v6, :cond_0

    .line 21
    .line 22
    sub-int/2addr v4, v5

    .line 23
    iput v4, v3, Lcom/zykj/gallery/repository/GalleryRepository$addPictureAsync$1;->h:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v3, Lcom/zykj/gallery/repository/GalleryRepository$addPictureAsync$1;

    .line 27
    .line 28
    invoke-direct {v3, v0, v2}, Lcom/zykj/gallery/repository/GalleryRepository$addPictureAsync$1;-><init>(Lcom/zykj/gallery/repository/GalleryRepository;Lkotlin/coroutines/Continuation;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v2, v3, Lcom/zykj/gallery/repository/GalleryRepository$addPictureAsync$1;->f:Ljava/lang/Object;

    .line 32
    .line 33
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    iget v5, v3, Lcom/zykj/gallery/repository/GalleryRepository$addPictureAsync$1;->h:I

    .line 38
    .line 39
    const/4 v6, 0x2

    .line 40
    const/4 v7, 0x1

    .line 41
    if-eqz v5, :cond_3

    .line 42
    .line 43
    if-eq v5, v7, :cond_2

    .line 44
    .line 45
    if-ne v5, v6, :cond_1

    .line 46
    .line 47
    iget-object v1, v3, Lcom/zykj/gallery/repository/GalleryRepository$addPictureAsync$1;->e:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v1, Lcom/zykj/gallery/bean/GalleryBody;

    .line 50
    .line 51
    iget-object v1, v3, Lcom/zykj/gallery/repository/GalleryRepository$addPictureAsync$1;->d:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v1, Ljava/lang/String;

    .line 54
    .line 55
    iget-object v1, v3, Lcom/zykj/gallery/repository/GalleryRepository$addPictureAsync$1;->c:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v1, Ljava/lang/String;

    .line 58
    .line 59
    iget-object v1, v3, Lcom/zykj/gallery/repository/GalleryRepository$addPictureAsync$1;->b:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v1, Ljava/lang/String;

    .line 62
    .line 63
    iget-object v1, v3, Lcom/zykj/gallery/repository/GalleryRepository$addPictureAsync$1;->a:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v1, Ljava/lang/String;

    .line 66
    .line 67
    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    goto/16 :goto_3

    .line 71
    .line 72
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 73
    .line 74
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 75
    .line 76
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    throw v1

    .line 80
    :cond_2
    iget-object v1, v3, Lcom/zykj/gallery/repository/GalleryRepository$addPictureAsync$1;->e:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v1, Lcom/zykj/gallery/bean/GalleryBody;

    .line 83
    .line 84
    iget-object v5, v3, Lcom/zykj/gallery/repository/GalleryRepository$addPictureAsync$1;->d:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v5, Ljava/lang/String;

    .line 87
    .line 88
    iget-object v7, v3, Lcom/zykj/gallery/repository/GalleryRepository$addPictureAsync$1;->c:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v7, Ljava/lang/String;

    .line 91
    .line 92
    iget-object v8, v3, Lcom/zykj/gallery/repository/GalleryRepository$addPictureAsync$1;->b:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v8, Ljava/lang/String;

    .line 95
    .line 96
    iget-object v9, v3, Lcom/zykj/gallery/repository/GalleryRepository$addPictureAsync$1;->a:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v9, Ljava/lang/String;

    .line 99
    .line 100
    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    move-object/from16 v16, v2

    .line 104
    .line 105
    move-object v2, v1

    .line 106
    move-object v1, v8

    .line 107
    move-object/from16 v8, v16

    .line 108
    .line 109
    move-object/from16 v16, v9

    .line 110
    .line 111
    move-object v9, v5

    .line 112
    move-object/from16 v5, v16

    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_3
    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    new-instance v2, Lcom/zykj/gallery/bean/GalleryBody;

    .line 119
    .line 120
    move-object/from16 v5, p1

    .line 121
    .line 122
    move-object/from16 v8, p3

    .line 123
    .line 124
    move-object/from16 v9, p4

    .line 125
    .line 126
    invoke-direct {v2, v5, v1, v8, v9}, Lcom/zykj/gallery/bean/GalleryBody;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    iget-object v10, v0, Lcom/zykj/gallery/repository/GalleryRepository;->a:Lcom/zykj/gallery/api/PictureService;

    .line 130
    .line 131
    invoke-static {v5}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v11

    .line 135
    iput-object v11, v3, Lcom/zykj/gallery/repository/GalleryRepository$addPictureAsync$1;->a:Ljava/lang/Object;

    .line 136
    .line 137
    iput-object v1, v3, Lcom/zykj/gallery/repository/GalleryRepository$addPictureAsync$1;->b:Ljava/lang/Object;

    .line 138
    .line 139
    invoke-static {v8}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v11

    .line 143
    iput-object v11, v3, Lcom/zykj/gallery/repository/GalleryRepository$addPictureAsync$1;->c:Ljava/lang/Object;

    .line 144
    .line 145
    invoke-static {v9}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v11

    .line 149
    iput-object v11, v3, Lcom/zykj/gallery/repository/GalleryRepository$addPictureAsync$1;->d:Ljava/lang/Object;

    .line 150
    .line 151
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v11

    .line 155
    iput-object v11, v3, Lcom/zykj/gallery/repository/GalleryRepository$addPictureAsync$1;->e:Ljava/lang/Object;

    .line 156
    .line 157
    iput v7, v3, Lcom/zykj/gallery/repository/GalleryRepository$addPictureAsync$1;->h:I

    .line 158
    .line 159
    invoke-interface {v10, v2, v3}, Lcom/zykj/gallery/api/PictureService;->addPicture(Lcom/zykj/gallery/bean/GalleryBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v7

    .line 163
    if-ne v7, v4, :cond_4

    .line 164
    .line 165
    goto :goto_2

    .line 166
    :cond_4
    move-object/from16 v16, v8

    .line 167
    .line 168
    move-object v8, v7

    .line 169
    move-object/from16 v7, v16

    .line 170
    .line 171
    :goto_1
    check-cast v8, Lcom/zykj/http/bean/ApiResp;

    .line 172
    .line 173
    invoke-static {v8}, La3/a;->b(Lcom/zykj/http/bean/ApiResp;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    iget-object v8, v0, Lcom/zykj/gallery/repository/GalleryRepository;->a:Lcom/zykj/gallery/api/PictureService;

    .line 177
    .line 178
    new-instance v10, Lcom/zykj/gallery/bean/RecordImgBean;

    .line 179
    .line 180
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    .line 181
    .line 182
    .line 183
    move-result-object v13

    .line 184
    const/4 v14, 0x3

    .line 185
    const/4 v15, 0x0

    .line 186
    const/4 v11, 0x0

    .line 187
    const/4 v12, 0x0

    .line 188
    invoke-direct/range {v10 .. v15}, Lcom/zykj/gallery/bean/RecordImgBean;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 189
    .line 190
    .line 191
    invoke-static {v5}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v5

    .line 195
    iput-object v5, v3, Lcom/zykj/gallery/repository/GalleryRepository$addPictureAsync$1;->a:Ljava/lang/Object;

    .line 196
    .line 197
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v1

    .line 201
    iput-object v1, v3, Lcom/zykj/gallery/repository/GalleryRepository$addPictureAsync$1;->b:Ljava/lang/Object;

    .line 202
    .line 203
    invoke-static {v7}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v1

    .line 207
    iput-object v1, v3, Lcom/zykj/gallery/repository/GalleryRepository$addPictureAsync$1;->c:Ljava/lang/Object;

    .line 208
    .line 209
    invoke-static {v9}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v1

    .line 213
    iput-object v1, v3, Lcom/zykj/gallery/repository/GalleryRepository$addPictureAsync$1;->d:Ljava/lang/Object;

    .line 214
    .line 215
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v1

    .line 219
    iput-object v1, v3, Lcom/zykj/gallery/repository/GalleryRepository$addPictureAsync$1;->e:Ljava/lang/Object;

    .line 220
    .line 221
    iput v6, v3, Lcom/zykj/gallery/repository/GalleryRepository$addPictureAsync$1;->h:I

    .line 222
    .line 223
    invoke-interface {v8, v10, v3}, Lcom/zykj/gallery/api/PictureService;->recordPicturesAsync(Lcom/zykj/gallery/bean/RecordImgBean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v1

    .line 227
    if-ne v1, v4, :cond_5

    .line 228
    .line 229
    :goto_2
    return-object v4

    .line 230
    :cond_5
    :goto_3
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 231
    .line 232
    return-object v1
.end method

.method public final c(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p2, Lcom/zykj/gallery/repository/GalleryRepository$deletePicture$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lcom/zykj/gallery/repository/GalleryRepository$deletePicture$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/gallery/repository/GalleryRepository$deletePicture$1;->d:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcom/zykj/gallery/repository/GalleryRepository$deletePicture$1;->d:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/gallery/repository/GalleryRepository$deletePicture$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lcom/zykj/gallery/repository/GalleryRepository$deletePicture$1;-><init>(Lcom/zykj/gallery/repository/GalleryRepository;Lkotlin/coroutines/Continuation;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lcom/zykj/gallery/repository/GalleryRepository$deletePicture$1;->b:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/gallery/repository/GalleryRepository$deletePicture$1;->d:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    iget-object p1, v0, Lcom/zykj/gallery/repository/GalleryRepository$deletePicture$1;->a:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p1, Ljava/util/List;

    .line 41
    .line 42
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 47
    .line 48
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p1

    .line 54
    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    iget-object p2, p0, Lcom/zykj/gallery/repository/GalleryRepository;->a:Lcom/zykj/gallery/api/PictureService;

    .line 58
    .line 59
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    iput-object v2, v0, Lcom/zykj/gallery/repository/GalleryRepository$deletePicture$1;->a:Ljava/lang/Object;

    .line 64
    .line 65
    iput v3, v0, Lcom/zykj/gallery/repository/GalleryRepository$deletePicture$1;->d:I

    .line 66
    .line 67
    invoke-interface {p2, p1, v0}, Lcom/zykj/gallery/api/PictureService;->deletePicture(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    if-ne p2, v1, :cond_3

    .line 72
    .line 73
    return-object v1

    .line 74
    :cond_3
    :goto_1
    check-cast p2, Lcom/zykj/http/bean/ApiResp;

    .line 75
    .line 76
    invoke-static {p2}, La3/a;->b(Lcom/zykj/http/bean/ApiResp;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 80
    .line 81
    return-object p1
.end method

.method public final d(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p1, Lcom/zykj/gallery/repository/GalleryRepository$deletePictureClear$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lcom/zykj/gallery/repository/GalleryRepository$deletePictureClear$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/gallery/repository/GalleryRepository$deletePictureClear$1;->c:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcom/zykj/gallery/repository/GalleryRepository$deletePictureClear$1;->c:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/gallery/repository/GalleryRepository$deletePictureClear$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lcom/zykj/gallery/repository/GalleryRepository$deletePictureClear$1;-><init>(Lcom/zykj/gallery/repository/GalleryRepository;Lkotlin/coroutines/Continuation;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lcom/zykj/gallery/repository/GalleryRepository$deletePictureClear$1;->a:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/gallery/repository/GalleryRepository$deletePictureClear$1;->c:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 43
    .line 44
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    iget-object p1, p0, Lcom/zykj/gallery/repository/GalleryRepository;->a:Lcom/zykj/gallery/api/PictureService;

    .line 54
    .line 55
    iput v3, v0, Lcom/zykj/gallery/repository/GalleryRepository$deletePictureClear$1;->c:I

    .line 56
    .line 57
    invoke-interface {p1, v0}, Lcom/zykj/gallery/api/PictureService;->deleteClear(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    if-ne p1, v1, :cond_3

    .line 62
    .line 63
    return-object v1

    .line 64
    :cond_3
    :goto_1
    check-cast p1, Lcom/zykj/http/bean/ApiResp;

    .line 65
    .line 66
    invoke-static {p1}, La3/a;->b(Lcom/zykj/http/bean/ApiResp;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 70
    .line 71
    return-object p1
.end method

.method public final e(IIZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p4, Lcom/zykj/gallery/repository/GalleryRepository$getGalleryList$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, Lcom/zykj/gallery/repository/GalleryRepository$getGalleryList$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/gallery/repository/GalleryRepository$getGalleryList$1;->f:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcom/zykj/gallery/repository/GalleryRepository$getGalleryList$1;->f:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/gallery/repository/GalleryRepository$getGalleryList$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p4}, Lcom/zykj/gallery/repository/GalleryRepository$getGalleryList$1;-><init>(Lcom/zykj/gallery/repository/GalleryRepository;Lkotlin/coroutines/Continuation;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, Lcom/zykj/gallery/repository/GalleryRepository$getGalleryList$1;->d:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/gallery/repository/GalleryRepository$getGalleryList$1;->f:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 43
    .line 44
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_2
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    iget-object p4, p0, Lcom/zykj/gallery/repository/GalleryRepository;->a:Lcom/zykj/gallery/api/PictureService;

    .line 54
    .line 55
    iput p1, v0, Lcom/zykj/gallery/repository/GalleryRepository$getGalleryList$1;->a:I

    .line 56
    .line 57
    iput p2, v0, Lcom/zykj/gallery/repository/GalleryRepository$getGalleryList$1;->b:I

    .line 58
    .line 59
    iput-boolean p3, v0, Lcom/zykj/gallery/repository/GalleryRepository$getGalleryList$1;->c:Z

    .line 60
    .line 61
    iput v3, v0, Lcom/zykj/gallery/repository/GalleryRepository$getGalleryList$1;->f:I

    .line 62
    .line 63
    invoke-interface {p4, p1, p2, p3, v0}, Lcom/zykj/gallery/api/PictureService;->getGarryList(IIZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p4

    .line 67
    if-ne p4, v1, :cond_3

    .line 68
    .line 69
    return-object v1

    .line 70
    :cond_3
    :goto_1
    check-cast p4, Lcom/zykj/http/bean/ApiResp;

    .line 71
    .line 72
    invoke-static {p4}, La3/a;->b(Lcom/zykj/http/bean/ApiResp;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    check-cast p1, Lcom/zykj/gallery/bean/PagedData;

    .line 77
    .line 78
    new-instance p2, Lcom/zykj/gallery/bean/PagedData;

    .line 79
    .line 80
    if-eqz p1, :cond_4

    .line 81
    .line 82
    invoke-virtual {p1}, Lcom/zykj/gallery/bean/PagedData;->getItems()Ljava/util/List;

    .line 83
    .line 84
    .line 85
    move-result-object p3

    .line 86
    if-nez p3, :cond_5

    .line 87
    .line 88
    :cond_4
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 89
    .line 90
    .line 91
    move-result-object p3

    .line 92
    :cond_5
    if-eqz p1, :cond_6

    .line 93
    .line 94
    invoke-virtual {p1}, Lcom/zykj/gallery/bean/PagedData;->getTotalCount()I

    .line 95
    .line 96
    .line 97
    move-result p1

    .line 98
    goto :goto_2

    .line 99
    :cond_6
    const/4 p1, 0x0

    .line 100
    :goto_2
    invoke-direct {p2, p3, p1}, Lcom/zykj/gallery/bean/PagedData;-><init>(Ljava/util/List;I)V

    .line 101
    .line 102
    .line 103
    return-object p2
.end method

.method public final f(Ljava/lang/String;Lcom/zykj/gallery/oss/FileType;Ljava/lang/String;Lcom/zykj/gallery/oss/FileResource;Ljava/lang/String;Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 12

    .line 1
    move-object/from16 v0, p9

    .line 2
    .line 3
    instance-of v1, v0, Lcom/zykj/gallery/repository/GalleryRepository$getOssDataStream$1;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, Lcom/zykj/gallery/repository/GalleryRepository$getOssDataStream$1;

    .line 9
    .line 10
    iget v2, v1, Lcom/zykj/gallery/repository/GalleryRepository$getOssDataStream$1;->j:I

    .line 11
    .line 12
    const/high16 v3, -0x80000000

    .line 13
    .line 14
    and-int v4, v2, v3

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    sub-int/2addr v2, v3

    .line 19
    iput v2, v1, Lcom/zykj/gallery/repository/GalleryRepository$getOssDataStream$1;->j:I

    .line 20
    .line 21
    :goto_0
    move-object v11, v1

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    new-instance v1, Lcom/zykj/gallery/repository/GalleryRepository$getOssDataStream$1;

    .line 24
    .line 25
    invoke-direct {v1, p0, v0}, Lcom/zykj/gallery/repository/GalleryRepository$getOssDataStream$1;-><init>(Lcom/zykj/gallery/repository/GalleryRepository;Lkotlin/coroutines/Continuation;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :goto_1
    iget-object v0, v11, Lcom/zykj/gallery/repository/GalleryRepository$getOssDataStream$1;->h:Ljava/lang/Object;

    .line 30
    .line 31
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    iget v3, v11, Lcom/zykj/gallery/repository/GalleryRepository$getOssDataStream$1;->j:I

    .line 36
    .line 37
    const/4 v4, 0x1

    .line 38
    if-eqz v3, :cond_2

    .line 39
    .line 40
    if-ne v3, v4, :cond_1

    .line 41
    .line 42
    iget-wide v3, v11, Lcom/zykj/gallery/repository/GalleryRepository$getOssDataStream$1;->g:J

    .line 43
    .line 44
    iget-object v1, v11, Lcom/zykj/gallery/repository/GalleryRepository$getOssDataStream$1;->f:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v1, Ljava/lang/String;

    .line 47
    .line 48
    iget-object v5, v11, Lcom/zykj/gallery/repository/GalleryRepository$getOssDataStream$1;->e:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v5, Ljava/lang/String;

    .line 51
    .line 52
    iget-object v6, v11, Lcom/zykj/gallery/repository/GalleryRepository$getOssDataStream$1;->d:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v6, Lcom/zykj/gallery/oss/FileResource;

    .line 55
    .line 56
    iget-object v7, v11, Lcom/zykj/gallery/repository/GalleryRepository$getOssDataStream$1;->c:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v7, Ljava/lang/String;

    .line 59
    .line 60
    iget-object v8, v11, Lcom/zykj/gallery/repository/GalleryRepository$getOssDataStream$1;->b:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v8, Lcom/zykj/gallery/oss/FileType;

    .line 63
    .line 64
    iget-object v9, v11, Lcom/zykj/gallery/repository/GalleryRepository$getOssDataStream$1;->a:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v9, Ljava/lang/String;

    .line 67
    .line 68
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 73
    .line 74
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 75
    .line 76
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    throw v0

    .line 80
    :cond_2
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    iput-object p1, v11, Lcom/zykj/gallery/repository/GalleryRepository$getOssDataStream$1;->a:Ljava/lang/Object;

    .line 84
    .line 85
    iput-object p2, v11, Lcom/zykj/gallery/repository/GalleryRepository$getOssDataStream$1;->b:Ljava/lang/Object;

    .line 86
    .line 87
    iput-object p3, v11, Lcom/zykj/gallery/repository/GalleryRepository$getOssDataStream$1;->c:Ljava/lang/Object;

    .line 88
    .line 89
    move-object/from16 v6, p4

    .line 90
    .line 91
    iput-object v6, v11, Lcom/zykj/gallery/repository/GalleryRepository$getOssDataStream$1;->d:Ljava/lang/Object;

    .line 92
    .line 93
    move-object/from16 v7, p5

    .line 94
    .line 95
    iput-object v7, v11, Lcom/zykj/gallery/repository/GalleryRepository$getOssDataStream$1;->e:Ljava/lang/Object;

    .line 96
    .line 97
    move-object/from16 v8, p6

    .line 98
    .line 99
    iput-object v8, v11, Lcom/zykj/gallery/repository/GalleryRepository$getOssDataStream$1;->f:Ljava/lang/Object;

    .line 100
    .line 101
    move-wide/from16 v9, p7

    .line 102
    .line 103
    iput-wide v9, v11, Lcom/zykj/gallery/repository/GalleryRepository$getOssDataStream$1;->g:J

    .line 104
    .line 105
    iput v4, v11, Lcom/zykj/gallery/repository/GalleryRepository$getOssDataStream$1;->j:I

    .line 106
    .line 107
    move-object v2, p0

    .line 108
    move-object v3, p1

    .line 109
    move-object v4, p2

    .line 110
    move-object v5, p3

    .line 111
    invoke-virtual/range {v2 .. v11}, Lcom/zykj/gallery/repository/GalleryRepository;->h(Ljava/lang/String;Lcom/zykj/gallery/oss/FileType;Ljava/lang/String;Lcom/zykj/gallery/oss/FileResource;Ljava/lang/String;Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    if-ne v0, v1, :cond_3

    .line 116
    .line 117
    return-object v1

    .line 118
    :cond_3
    move-object v9, p1

    .line 119
    move-object v8, p2

    .line 120
    move-object v7, p3

    .line 121
    move-object/from16 v6, p4

    .line 122
    .line 123
    move-object/from16 v5, p5

    .line 124
    .line 125
    move-object/from16 v1, p6

    .line 126
    .line 127
    move-wide/from16 v3, p7

    .line 128
    .line 129
    :goto_2
    check-cast v0, Lcom/zykj/gallery/oss/OssToken;

    .line 130
    .line 131
    if-eqz v0, :cond_7

    .line 132
    .line 133
    invoke-virtual {v6}, Lcom/zykj/gallery/oss/FileResource;->getName()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    new-instance v10, Ljava/lang/StringBuilder;

    .line 138
    .line 139
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 140
    .line 141
    .line 142
    const-string v11, "imagestore_v2"

    .line 143
    .line 144
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    const-string v11, "/"

    .line 148
    .line 149
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v2

    .line 165
    const-string v9, "0"

    .line 166
    .line 167
    invoke-static {v5, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    move-result v9

    .line 171
    if-eqz v9, :cond_4

    .line 172
    .line 173
    const-string v5, "yyyyMMdd"

    .line 174
    .line 175
    invoke-static {v5}, Lcom/blankj/utilcode/util/j0;->c(Ljava/lang/String;)Ljava/text/SimpleDateFormat;

    .line 176
    .line 177
    .line 178
    move-result-object v5

    .line 179
    invoke-static {v3, v4, v5}, Lcom/blankj/utilcode/util/j0;->d(JLjava/text/DateFormat;)Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v5

    .line 183
    :cond_4
    sget-object v3, Lcom/zykj/gallery/oss/FileResource$Log;->INSTANCE:Lcom/zykj/gallery/oss/FileResource$Log;

    .line 184
    .line 185
    invoke-static {v6, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    move-result v3

    .line 189
    if-eqz v3, :cond_5

    .line 190
    .line 191
    const-string v1, ""

    .line 192
    .line 193
    goto :goto_3

    .line 194
    :cond_5
    sget-object v3, Lcom/zykj/gallery/oss/FileType$File;->INSTANCE:Lcom/zykj/gallery/oss/FileType$File;

    .line 195
    .line 196
    invoke-static {v8, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 197
    .line 198
    .line 199
    move-result v3

    .line 200
    if-eqz v3, :cond_6

    .line 201
    .line 202
    new-instance v3, Ljava/lang/StringBuilder;

    .line 203
    .line 204
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 208
    .line 209
    .line 210
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 211
    .line 212
    .line 213
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v1

    .line 217
    :cond_6
    :goto_3
    new-instance v3, Lcom/zykj/gallery/oss/OssData;

    .line 218
    .line 219
    new-instance v4, Ljava/lang/StringBuilder;

    .line 220
    .line 221
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 222
    .line 223
    .line 224
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 225
    .line 226
    .line 227
    invoke-virtual {v4, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 228
    .line 229
    .line 230
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 231
    .line 232
    .line 233
    invoke-virtual {v4, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 234
    .line 235
    .line 236
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 237
    .line 238
    .line 239
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object v1

    .line 243
    invoke-static {v1, v11}, Lkotlin/text/StringsKt;->removeSuffix(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v1

    .line 247
    invoke-direct {v3, v0, v1}, Lcom/zykj/gallery/oss/OssData;-><init>(Lcom/zykj/gallery/oss/OssToken;Ljava/lang/String;)V

    .line 248
    .line 249
    .line 250
    return-object v3

    .line 251
    :cond_7
    const/4 v0, 0x0

    .line 252
    return-object v0
.end method

.method public final h(Ljava/lang/String;Lcom/zykj/gallery/oss/FileType;Ljava/lang/String;Lcom/zykj/gallery/oss/FileResource;Ljava/lang/String;Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-wide/from16 v8, p7

    .line 4
    .line 5
    move-object/from16 v1, p9

    .line 6
    .line 7
    instance-of v2, v1, Lcom/zykj/gallery/repository/GalleryRepository$getOssTokenFlow$1;

    .line 8
    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    move-object v2, v1

    .line 12
    check-cast v2, Lcom/zykj/gallery/repository/GalleryRepository$getOssTokenFlow$1;

    .line 13
    .line 14
    iget v3, v2, Lcom/zykj/gallery/repository/GalleryRepository$getOssTokenFlow$1;->o:I

    .line 15
    .line 16
    const/high16 v4, -0x80000000

    .line 17
    .line 18
    and-int v5, v3, v4

    .line 19
    .line 20
    if-eqz v5, :cond_0

    .line 21
    .line 22
    sub-int/2addr v3, v4

    .line 23
    iput v3, v2, Lcom/zykj/gallery/repository/GalleryRepository$getOssTokenFlow$1;->o:I

    .line 24
    .line 25
    :goto_0
    move-object v13, v2

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    new-instance v2, Lcom/zykj/gallery/repository/GalleryRepository$getOssTokenFlow$1;

    .line 28
    .line 29
    invoke-direct {v2, v0, v1}, Lcom/zykj/gallery/repository/GalleryRepository$getOssTokenFlow$1;-><init>(Lcom/zykj/gallery/repository/GalleryRepository;Lkotlin/coroutines/Continuation;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :goto_1
    iget-object v1, v13, Lcom/zykj/gallery/repository/GalleryRepository$getOssTokenFlow$1;->m:Ljava/lang/Object;

    .line 34
    .line 35
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v14

    .line 39
    iget v2, v13, Lcom/zykj/gallery/repository/GalleryRepository$getOssTokenFlow$1;->o:I

    .line 40
    .line 41
    const/4 v15, 0x1

    .line 42
    if-eqz v2, :cond_2

    .line 43
    .line 44
    if-ne v2, v15, :cond_1

    .line 45
    .line 46
    iget-object v2, v13, Lcom/zykj/gallery/repository/GalleryRepository$getOssTokenFlow$1;->k:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v2, Lcom/zykj/gallery/oss/TokenReq;

    .line 49
    .line 50
    iget-object v2, v13, Lcom/zykj/gallery/repository/GalleryRepository$getOssTokenFlow$1;->j:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v2, Ljava/lang/String;

    .line 53
    .line 54
    iget-object v2, v13, Lcom/zykj/gallery/repository/GalleryRepository$getOssTokenFlow$1;->i:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v2, Ljava/lang/String;

    .line 57
    .line 58
    iget-object v2, v13, Lcom/zykj/gallery/repository/GalleryRepository$getOssTokenFlow$1;->h:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v2, Ljava/lang/String;

    .line 61
    .line 62
    iget-object v2, v13, Lcom/zykj/gallery/repository/GalleryRepository$getOssTokenFlow$1;->g:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v2, Ljava/lang/String;

    .line 65
    .line 66
    iget-object v2, v13, Lcom/zykj/gallery/repository/GalleryRepository$getOssTokenFlow$1;->f:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v2, Ljava/lang/String;

    .line 69
    .line 70
    iget-object v2, v13, Lcom/zykj/gallery/repository/GalleryRepository$getOssTokenFlow$1;->e:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v2, Ljava/lang/String;

    .line 73
    .line 74
    iget-object v2, v13, Lcom/zykj/gallery/repository/GalleryRepository$getOssTokenFlow$1;->d:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v2, Lcom/zykj/gallery/oss/FileResource;

    .line 77
    .line 78
    iget-object v2, v13, Lcom/zykj/gallery/repository/GalleryRepository$getOssTokenFlow$1;->c:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v2, Ljava/lang/String;

    .line 81
    .line 82
    iget-object v2, v13, Lcom/zykj/gallery/repository/GalleryRepository$getOssTokenFlow$1;->b:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v2, Lcom/zykj/gallery/oss/FileType;

    .line 85
    .line 86
    iget-object v2, v13, Lcom/zykj/gallery/repository/GalleryRepository$getOssTokenFlow$1;->a:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v2, Ljava/lang/String;

    .line 89
    .line 90
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    goto/16 :goto_2

    .line 94
    .line 95
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 96
    .line 97
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 98
    .line 99
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    throw v1

    .line 103
    :cond_2
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual/range {p4 .. p4}, Lcom/zykj/gallery/oss/FileResource;->getName()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    invoke-virtual/range {p2 .. p2}, Lcom/zykj/gallery/oss/FileType;->getValue()I

    .line 111
    .line 112
    .line 113
    move-result v2

    .line 114
    new-instance v3, Ljava/lang/StringBuilder;

    .line 115
    .line 116
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 117
    .line 118
    .line 119
    move-object/from16 v4, p1

    .line 120
    .line 121
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    const-string v5, "+"

    .line 125
    .line 126
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    const-string v6, "imagestore_v2"

    .line 130
    .line 131
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    move-object/from16 v2, p3

    .line 150
    .line 151
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    move-object/from16 v7, p5

    .line 158
    .line 159
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    move-object/from16 v10, p6

    .line 166
    .line 167
    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v3, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v16

    .line 180
    invoke-static/range {v16 .. v16}, Lcom/blankj/utilcode/util/j;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v10

    .line 184
    move-object v3, v1

    .line 185
    new-instance v1, Lcom/zykj/gallery/oss/TokenReq;

    .line 186
    .line 187
    move-object v5, v3

    .line 188
    invoke-virtual/range {p2 .. p2}, Lcom/zykj/gallery/oss/FileType;->getValue()I

    .line 189
    .line 190
    .line 191
    move-result v3

    .line 192
    move-object v11, v5

    .line 193
    invoke-virtual/range {p4 .. p4}, Lcom/zykj/gallery/oss/FileResource;->getValue()I

    .line 194
    .line 195
    .line 196
    move-result v5

    .line 197
    invoke-static {v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 198
    .line 199
    .line 200
    move-object v12, v11

    .line 201
    const/4 v11, 0x1

    .line 202
    move-object/from16 v17, v12

    .line 203
    .line 204
    const/4 v12, 0x0

    .line 205
    const/4 v2, 0x0

    .line 206
    move-object/from16 v4, p3

    .line 207
    .line 208
    move-object/from16 v18, v6

    .line 209
    .line 210
    move-object v6, v7

    .line 211
    move-object/from16 v7, p6

    .line 212
    .line 213
    invoke-direct/range {v1 .. v12}, Lcom/zykj/gallery/oss/TokenReq;-><init>(IILjava/lang/String;ILjava/lang/String;Ljava/lang/String;JLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 214
    .line 215
    .line 216
    iget-object v2, v0, Lcom/zykj/gallery/repository/GalleryRepository;->a:Lcom/zykj/gallery/api/PictureService;

    .line 217
    .line 218
    invoke-static/range {p1 .. p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v3

    .line 222
    iput-object v3, v13, Lcom/zykj/gallery/repository/GalleryRepository$getOssTokenFlow$1;->a:Ljava/lang/Object;

    .line 223
    .line 224
    invoke-static/range {p2 .. p2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v3

    .line 228
    iput-object v3, v13, Lcom/zykj/gallery/repository/GalleryRepository$getOssTokenFlow$1;->b:Ljava/lang/Object;

    .line 229
    .line 230
    invoke-static/range {p3 .. p3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v3

    .line 234
    iput-object v3, v13, Lcom/zykj/gallery/repository/GalleryRepository$getOssTokenFlow$1;->c:Ljava/lang/Object;

    .line 235
    .line 236
    invoke-static/range {p4 .. p4}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v3

    .line 240
    iput-object v3, v13, Lcom/zykj/gallery/repository/GalleryRepository$getOssTokenFlow$1;->d:Ljava/lang/Object;

    .line 241
    .line 242
    invoke-static/range {p5 .. p5}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v3

    .line 246
    iput-object v3, v13, Lcom/zykj/gallery/repository/GalleryRepository$getOssTokenFlow$1;->e:Ljava/lang/Object;

    .line 247
    .line 248
    invoke-static/range {p6 .. p6}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object v3

    .line 252
    iput-object v3, v13, Lcom/zykj/gallery/repository/GalleryRepository$getOssTokenFlow$1;->f:Ljava/lang/Object;

    .line 253
    .line 254
    invoke-static/range {v18 .. v18}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v3

    .line 258
    iput-object v3, v13, Lcom/zykj/gallery/repository/GalleryRepository$getOssTokenFlow$1;->g:Ljava/lang/Object;

    .line 259
    .line 260
    invoke-static/range {v17 .. v17}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v3

    .line 264
    iput-object v3, v13, Lcom/zykj/gallery/repository/GalleryRepository$getOssTokenFlow$1;->h:Ljava/lang/Object;

    .line 265
    .line 266
    invoke-static/range {v16 .. v16}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object v3

    .line 270
    iput-object v3, v13, Lcom/zykj/gallery/repository/GalleryRepository$getOssTokenFlow$1;->i:Ljava/lang/Object;

    .line 271
    .line 272
    invoke-static {v10}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object v3

    .line 276
    iput-object v3, v13, Lcom/zykj/gallery/repository/GalleryRepository$getOssTokenFlow$1;->j:Ljava/lang/Object;

    .line 277
    .line 278
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v3

    .line 282
    iput-object v3, v13, Lcom/zykj/gallery/repository/GalleryRepository$getOssTokenFlow$1;->k:Ljava/lang/Object;

    .line 283
    .line 284
    iput-wide v8, v13, Lcom/zykj/gallery/repository/GalleryRepository$getOssTokenFlow$1;->l:J

    .line 285
    .line 286
    iput v15, v13, Lcom/zykj/gallery/repository/GalleryRepository$getOssTokenFlow$1;->o:I

    .line 287
    .line 288
    invoke-interface {v2, v1, v13}, Lcom/zykj/gallery/api/PictureService;->getGeneratorTokenTypeV2(Lcom/zykj/gallery/oss/TokenReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object v1

    .line 292
    if-ne v1, v14, :cond_3

    .line 293
    .line 294
    return-object v14

    .line 295
    :cond_3
    :goto_2
    check-cast v1, Lcom/zykj/http/bean/ApiResp;

    .line 296
    .line 297
    invoke-static {v1}, La3/a;->b(Lcom/zykj/http/bean/ApiResp;)Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    move-result-object v1

    .line 301
    return-object v1
.end method

.method public final i(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p2, Lcom/zykj/gallery/repository/GalleryRepository$moveToRecycleBinAsync$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lcom/zykj/gallery/repository/GalleryRepository$moveToRecycleBinAsync$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/gallery/repository/GalleryRepository$moveToRecycleBinAsync$1;->d:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcom/zykj/gallery/repository/GalleryRepository$moveToRecycleBinAsync$1;->d:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/gallery/repository/GalleryRepository$moveToRecycleBinAsync$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lcom/zykj/gallery/repository/GalleryRepository$moveToRecycleBinAsync$1;-><init>(Lcom/zykj/gallery/repository/GalleryRepository;Lkotlin/coroutines/Continuation;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lcom/zykj/gallery/repository/GalleryRepository$moveToRecycleBinAsync$1;->b:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/gallery/repository/GalleryRepository$moveToRecycleBinAsync$1;->d:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    iget-object p1, v0, Lcom/zykj/gallery/repository/GalleryRepository$moveToRecycleBinAsync$1;->a:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p1, Ljava/util/List;

    .line 41
    .line 42
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 47
    .line 48
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p1

    .line 54
    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    iget-object p2, p0, Lcom/zykj/gallery/repository/GalleryRepository;->a:Lcom/zykj/gallery/api/PictureService;

    .line 58
    .line 59
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    iput-object v2, v0, Lcom/zykj/gallery/repository/GalleryRepository$moveToRecycleBinAsync$1;->a:Ljava/lang/Object;

    .line 64
    .line 65
    iput v3, v0, Lcom/zykj/gallery/repository/GalleryRepository$moveToRecycleBinAsync$1;->d:I

    .line 66
    .line 67
    invoke-interface {p2, p1, v0}, Lcom/zykj/gallery/api/PictureService;->moveToRecycleBinAsync(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    if-ne p2, v1, :cond_3

    .line 72
    .line 73
    return-object v1

    .line 74
    :cond_3
    :goto_1
    check-cast p2, Lcom/zykj/http/bean/ApiResp;

    .line 75
    .line 76
    invoke-static {p2}, La3/a;->b(Lcom/zykj/http/bean/ApiResp;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 80
    .line 81
    return-object p1
.end method

.method public final j(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p2, Lcom/zykj/gallery/repository/GalleryRepository$receiverPicture$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lcom/zykj/gallery/repository/GalleryRepository$receiverPicture$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/gallery/repository/GalleryRepository$receiverPicture$1;->d:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcom/zykj/gallery/repository/GalleryRepository$receiverPicture$1;->d:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/gallery/repository/GalleryRepository$receiverPicture$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lcom/zykj/gallery/repository/GalleryRepository$receiverPicture$1;-><init>(Lcom/zykj/gallery/repository/GalleryRepository;Lkotlin/coroutines/Continuation;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lcom/zykj/gallery/repository/GalleryRepository$receiverPicture$1;->b:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/gallery/repository/GalleryRepository$receiverPicture$1;->d:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    iget-object p1, v0, Lcom/zykj/gallery/repository/GalleryRepository$receiverPicture$1;->a:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p1, Ljava/util/List;

    .line 41
    .line 42
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 47
    .line 48
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p1

    .line 54
    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    iget-object p2, p0, Lcom/zykj/gallery/repository/GalleryRepository;->a:Lcom/zykj/gallery/api/PictureService;

    .line 58
    .line 59
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    iput-object v2, v0, Lcom/zykj/gallery/repository/GalleryRepository$receiverPicture$1;->a:Ljava/lang/Object;

    .line 64
    .line 65
    iput v3, v0, Lcom/zykj/gallery/repository/GalleryRepository$receiverPicture$1;->d:I

    .line 66
    .line 67
    invoke-interface {p2, p1, v0}, Lcom/zykj/gallery/api/PictureService;->receiverPicture(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    if-ne p2, v1, :cond_3

    .line 72
    .line 73
    return-object v1

    .line 74
    :cond_3
    :goto_1
    check-cast p2, Lcom/zykj/http/bean/ApiResp;

    .line 75
    .line 76
    invoke-static {p2}, La3/a;->b(Lcom/zykj/http/bean/ApiResp;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 80
    .line 81
    return-object p1
.end method
