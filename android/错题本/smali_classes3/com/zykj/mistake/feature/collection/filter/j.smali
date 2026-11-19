.class public final synthetic Lcom/zykj/mistake/feature/collection/filter/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm7/c0;


# static fields
.field public static final a:Lcom/zykj/mistake/feature/collection/filter/j;

.field private static final descriptor:Lk7/g;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/zykj/mistake/feature/collection/filter/j;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/zykj/mistake/feature/collection/filter/j;->a:Lcom/zykj/mistake/feature/collection/filter/j;

    .line 7
    .line 8
    new-instance v1, Lm7/a1;

    .line 9
    .line 10
    const-string v2, "com.zykj.mistake.feature.collection.filter.MistakeCollectionFilterResultContract.Args"

    .line 11
    .line 12
    const/16 v3, 0x9

    .line 13
    .line 14
    invoke-direct {v1, v2, v0, v3}, Lm7/a1;-><init>(Ljava/lang/String;Lm7/c0;I)V

    .line 15
    .line 16
    .line 17
    const-string v0, "collectionId"

    .line 18
    .line 19
    const/4 v2, 0x1

    .line 20
    invoke-virtual {v1, v0, v2}, Lm7/a1;->j(Ljava/lang/String;Z)V

    .line 21
    .line 22
    .line 23
    const-string v0, "title"

    .line 24
    .line 25
    invoke-virtual {v1, v0, v2}, Lm7/a1;->j(Ljava/lang/String;Z)V

    .line 26
    .line 27
    .line 28
    const-string v0, "currentCount"

    .line 29
    .line 30
    invoke-virtual {v1, v0, v2}, Lm7/a1;->j(Ljava/lang/String;Z)V

    .line 31
    .line 32
    .line 33
    const-string v0, "capacity"

    .line 34
    .line 35
    invoke-virtual {v1, v0, v2}, Lm7/a1;->j(Ljava/lang/String;Z)V

    .line 36
    .line 37
    .line 38
    const-string v0, "mistakeListReq"

    .line 39
    .line 40
    invoke-virtual {v1, v0, v2}, Lm7/a1;->j(Ljava/lang/String;Z)V

    .line 41
    .line 42
    .line 43
    const-string v0, "currentCollectionType"

    .line 44
    .line 45
    invoke-virtual {v1, v0, v2}, Lm7/a1;->j(Ljava/lang/String;Z)V

    .line 46
    .line 47
    .line 48
    const-string v0, "otherCollectionType"

    .line 49
    .line 50
    invoke-virtual {v1, v0, v2}, Lm7/a1;->j(Ljava/lang/String;Z)V

    .line 51
    .line 52
    .line 53
    const-string v0, "showCurrentCollectionFilter"

    .line 54
    .line 55
    invoke-virtual {v1, v0, v2}, Lm7/a1;->j(Ljava/lang/String;Z)V

    .line 56
    .line 57
    .line 58
    const-string v0, "sourceType"

    .line 59
    .line 60
    invoke-virtual {v1, v0, v2}, Lm7/a1;->j(Ljava/lang/String;Z)V

    .line 61
    .line 62
    .line 63
    sput-object v1, Lcom/zykj/mistake/feature/collection/filter/j;->descriptor:Lk7/g;

    .line 64
    .line 65
    return-void
.end method


# virtual methods
.method public final childSerializers()[Li7/b;
    .locals 5

    .line 1
    sget-object v0, Lcom/zykj/mistake/feature/collection/filter/l;->j:[Ld6/e;

    .line 2
    .line 3
    const/16 v1, 0x9

    .line 4
    .line 5
    new-array v1, v1, [Li7/b;

    .line 6
    .line 7
    sget-object v2, Lm7/m1;->a:Lm7/m1;

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    aput-object v2, v1, v3

    .line 11
    .line 12
    const/4 v3, 0x1

    .line 13
    aput-object v2, v1, v3

    .line 14
    .line 15
    sget-object v2, Lm7/j0;->a:Lm7/j0;

    .line 16
    .line 17
    const/4 v3, 0x2

    .line 18
    aput-object v2, v1, v3

    .line 19
    .line 20
    const/4 v3, 0x3

    .line 21
    aput-object v2, v1, v3

    .line 22
    .line 23
    const/4 v3, 0x4

    .line 24
    sget-object v4, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq$$serializer;->INSTANCE:Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq$$serializer;

    .line 25
    .line 26
    aput-object v4, v1, v3

    .line 27
    .line 28
    const/4 v3, 0x5

    .line 29
    aput-object v2, v1, v3

    .line 30
    .line 31
    const/4 v3, 0x6

    .line 32
    aput-object v2, v1, v3

    .line 33
    .line 34
    const/4 v2, 0x7

    .line 35
    sget-object v3, Lm7/g;->a:Lm7/g;

    .line 36
    .line 37
    aput-object v3, v1, v2

    .line 38
    .line 39
    const/16 v2, 0x8

    .line 40
    .line 41
    aget-object v0, v0, v2

    .line 42
    .line 43
    invoke-interface {v0}, Ld6/e;->getValue()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    aput-object v0, v1, v2

    .line 48
    .line 49
    return-object v1
.end method

.method public final deserialize(Ll7/e;)Ljava/lang/Object;
    .locals 31

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const-string v1, "decoder"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sget-object v1, Lcom/zykj/mistake/feature/collection/filter/j;->descriptor:Lk7/g;

    .line 9
    .line 10
    invoke-interface {v0, v1}, Ll7/e;->beginStructure(Lk7/g;)Ll7/c;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sget-object v2, Lcom/zykj/mistake/feature/collection/filter/l;->j:[Ld6/e;

    .line 15
    .line 16
    invoke-interface {v0}, Ll7/c;->decodeSequentially()Z

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    const/4 v4, 0x7

    .line 21
    const/4 v5, 0x6

    .line 22
    const/4 v6, 0x5

    .line 23
    const/4 v7, 0x3

    .line 24
    const/4 v8, 0x4

    .line 25
    const/4 v9, 0x2

    .line 26
    const/16 v10, 0x8

    .line 27
    .line 28
    const/4 v11, 0x1

    .line 29
    const/4 v12, 0x0

    .line 30
    const/4 v13, 0x0

    .line 31
    if-eqz v3, :cond_0

    .line 32
    .line 33
    invoke-interface {v0, v1, v12}, Ll7/c;->decodeStringElement(Lk7/g;I)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-interface {v0, v1, v11}, Ll7/c;->decodeStringElement(Lk7/g;I)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v11

    .line 41
    invoke-interface {v0, v1, v9}, Ll7/c;->decodeIntElement(Lk7/g;I)I

    .line 42
    .line 43
    .line 44
    move-result v9

    .line 45
    invoke-interface {v0, v1, v7}, Ll7/c;->decodeIntElement(Lk7/g;I)I

    .line 46
    .line 47
    .line 48
    move-result v7

    .line 49
    sget-object v12, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq$$serializer;->INSTANCE:Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq$$serializer;

    .line 50
    .line 51
    invoke-interface {v0, v1, v8, v12, v13}, Ll7/c;->decodeSerializableElement(Lk7/g;ILi7/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v8

    .line 55
    check-cast v8, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;

    .line 56
    .line 57
    invoke-interface {v0, v1, v6}, Ll7/c;->decodeIntElement(Lk7/g;I)I

    .line 58
    .line 59
    .line 60
    move-result v6

    .line 61
    invoke-interface {v0, v1, v5}, Ll7/c;->decodeIntElement(Lk7/g;I)I

    .line 62
    .line 63
    .line 64
    move-result v5

    .line 65
    invoke-interface {v0, v1, v4}, Ll7/c;->decodeBooleanElement(Lk7/g;I)Z

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    aget-object v2, v2, v10

    .line 70
    .line 71
    invoke-interface {v2}, Ld6/e;->getValue()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    check-cast v2, Li7/a;

    .line 76
    .line 77
    invoke-interface {v0, v1, v10, v2, v13}, Ll7/c;->decodeSerializableElement(Lk7/g;ILi7/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    check-cast v2, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SourceType;

    .line 82
    .line 83
    const/16 v10, 0x1ff

    .line 84
    .line 85
    move-object/from16 v30, v2

    .line 86
    .line 87
    move-object/from16 v22, v3

    .line 88
    .line 89
    move/from16 v29, v4

    .line 90
    .line 91
    move/from16 v28, v5

    .line 92
    .line 93
    move/from16 v27, v6

    .line 94
    .line 95
    move/from16 v25, v7

    .line 96
    .line 97
    move-object/from16 v26, v8

    .line 98
    .line 99
    move/from16 v24, v9

    .line 100
    .line 101
    move/from16 v21, v10

    .line 102
    .line 103
    move-object/from16 v23, v11

    .line 104
    .line 105
    goto/16 :goto_3

    .line 106
    .line 107
    :cond_0
    move/from16 v19, v11

    .line 108
    .line 109
    move v3, v12

    .line 110
    move v14, v3

    .line 111
    move v15, v14

    .line 112
    move/from16 v16, v15

    .line 113
    .line 114
    move-object v9, v13

    .line 115
    move-object v11, v9

    .line 116
    move-object/from16 v17, v11

    .line 117
    .line 118
    move-object/from16 v18, v17

    .line 119
    .line 120
    move/from16 v13, v16

    .line 121
    .line 122
    :goto_0
    if-eqz v19, :cond_1

    .line 123
    .line 124
    invoke-interface {v0, v1}, Ll7/c;->decodeElementIndex(Lk7/g;)I

    .line 125
    .line 126
    .line 127
    move-result v7

    .line 128
    packed-switch v7, :pswitch_data_0

    .line 129
    .line 130
    .line 131
    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    .line 132
    .line 133
    invoke-direct {v0, v7}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    .line 134
    .line 135
    .line 136
    throw v0

    .line 137
    :pswitch_0
    aget-object v7, v2, v10

    .line 138
    .line 139
    invoke-interface {v7}, Ld6/e;->getValue()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v7

    .line 143
    check-cast v7, Li7/a;

    .line 144
    .line 145
    invoke-interface {v0, v1, v10, v7, v9}, Ll7/c;->decodeSerializableElement(Lk7/g;ILi7/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v7

    .line 149
    move-object v9, v7

    .line 150
    check-cast v9, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SourceType;

    .line 151
    .line 152
    or-int/lit16 v12, v12, 0x100

    .line 153
    .line 154
    :goto_1
    const/4 v7, 0x3

    .line 155
    goto :goto_0

    .line 156
    :pswitch_1
    invoke-interface {v0, v1, v4}, Ll7/c;->decodeBooleanElement(Lk7/g;I)Z

    .line 157
    .line 158
    .line 159
    move-result v3

    .line 160
    or-int/lit16 v12, v12, 0x80

    .line 161
    .line 162
    goto :goto_1

    .line 163
    :pswitch_2
    invoke-interface {v0, v1, v5}, Ll7/c;->decodeIntElement(Lk7/g;I)I

    .line 164
    .line 165
    .line 166
    move-result v13

    .line 167
    or-int/lit8 v12, v12, 0x40

    .line 168
    .line 169
    goto :goto_1

    .line 170
    :pswitch_3
    invoke-interface {v0, v1, v6}, Ll7/c;->decodeIntElement(Lk7/g;I)I

    .line 171
    .line 172
    .line 173
    move-result v14

    .line 174
    or-int/lit8 v12, v12, 0x20

    .line 175
    .line 176
    goto :goto_1

    .line 177
    :pswitch_4
    sget-object v7, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq$$serializer;->INSTANCE:Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq$$serializer;

    .line 178
    .line 179
    invoke-interface {v0, v1, v8, v7, v11}, Ll7/c;->decodeSerializableElement(Lk7/g;ILi7/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v7

    .line 183
    move-object v11, v7

    .line 184
    check-cast v11, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;

    .line 185
    .line 186
    or-int/lit8 v12, v12, 0x10

    .line 187
    .line 188
    goto :goto_1

    .line 189
    :pswitch_5
    const/4 v7, 0x3

    .line 190
    invoke-interface {v0, v1, v7}, Ll7/c;->decodeIntElement(Lk7/g;I)I

    .line 191
    .line 192
    .line 193
    move-result v15

    .line 194
    or-int/lit8 v12, v12, 0x8

    .line 195
    .line 196
    goto :goto_0

    .line 197
    :pswitch_6
    const/4 v4, 0x2

    .line 198
    const/4 v7, 0x3

    .line 199
    invoke-interface {v0, v1, v4}, Ll7/c;->decodeIntElement(Lk7/g;I)I

    .line 200
    .line 201
    .line 202
    move-result v16

    .line 203
    or-int/lit8 v12, v12, 0x4

    .line 204
    .line 205
    :goto_2
    const/4 v4, 0x7

    .line 206
    goto :goto_0

    .line 207
    :pswitch_7
    const/4 v4, 0x1

    .line 208
    const/4 v7, 0x3

    .line 209
    invoke-interface {v0, v1, v4}, Ll7/c;->decodeStringElement(Lk7/g;I)Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v18

    .line 213
    or-int/lit8 v12, v12, 0x2

    .line 214
    .line 215
    goto :goto_2

    .line 216
    :pswitch_8
    const/4 v4, 0x0

    .line 217
    const/4 v7, 0x3

    .line 218
    invoke-interface {v0, v1, v4}, Ll7/c;->decodeStringElement(Lk7/g;I)Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v17

    .line 222
    or-int/lit8 v12, v12, 0x1

    .line 223
    .line 224
    goto :goto_2

    .line 225
    :pswitch_9
    const/4 v4, 0x0

    .line 226
    const/4 v7, 0x3

    .line 227
    move/from16 v19, v4

    .line 228
    .line 229
    goto :goto_2

    .line 230
    :cond_1
    move/from16 v29, v3

    .line 231
    .line 232
    move-object/from16 v30, v9

    .line 233
    .line 234
    move-object/from16 v26, v11

    .line 235
    .line 236
    move/from16 v21, v12

    .line 237
    .line 238
    move/from16 v28, v13

    .line 239
    .line 240
    move/from16 v27, v14

    .line 241
    .line 242
    move/from16 v25, v15

    .line 243
    .line 244
    move/from16 v24, v16

    .line 245
    .line 246
    move-object/from16 v22, v17

    .line 247
    .line 248
    move-object/from16 v23, v18

    .line 249
    .line 250
    :goto_3
    invoke-interface {v0, v1}, Ll7/c;->endStructure(Lk7/g;)V

    .line 251
    .line 252
    .line 253
    new-instance v20, Lcom/zykj/mistake/feature/collection/filter/l;

    .line 254
    .line 255
    invoke-direct/range {v20 .. v30}, Lcom/zykj/mistake/feature/collection/filter/l;-><init>(ILjava/lang/String;Ljava/lang/String;IILcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;IIZLcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SourceType;)V

    .line 256
    .line 257
    .line 258
    return-object v20

    .line 259
    :pswitch_data_0
    .packed-switch -0x1
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

.method public final getDescriptor()Lk7/g;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/mistake/feature/collection/filter/j;->descriptor:Lk7/g;

    .line 2
    .line 3
    return-object v0
.end method

.method public final serialize(Ll7/f;Ljava/lang/Object;)V
    .locals 12

    .line 1
    check-cast p2, Lcom/zykj/mistake/feature/collection/filter/l;

    .line 2
    .line 3
    const-string v0, "value"

    .line 4
    .line 5
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p2, Lcom/zykj/mistake/feature/collection/filter/l;->i:Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SourceType;

    .line 9
    .line 10
    iget-boolean v1, p2, Lcom/zykj/mistake/feature/collection/filter/l;->h:Z

    .line 11
    .line 12
    iget v2, p2, Lcom/zykj/mistake/feature/collection/filter/l;->g:I

    .line 13
    .line 14
    iget v3, p2, Lcom/zykj/mistake/feature/collection/filter/l;->f:I

    .line 15
    .line 16
    iget-object v4, p2, Lcom/zykj/mistake/feature/collection/filter/l;->e:Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;

    .line 17
    .line 18
    iget v5, p2, Lcom/zykj/mistake/feature/collection/filter/l;->d:I

    .line 19
    .line 20
    iget v6, p2, Lcom/zykj/mistake/feature/collection/filter/l;->c:I

    .line 21
    .line 22
    iget-object v7, p2, Lcom/zykj/mistake/feature/collection/filter/l;->b:Ljava/lang/String;

    .line 23
    .line 24
    iget-object p2, p2, Lcom/zykj/mistake/feature/collection/filter/l;->a:Ljava/lang/String;

    .line 25
    .line 26
    sget-object v8, Lcom/zykj/mistake/feature/collection/filter/j;->descriptor:Lk7/g;

    .line 27
    .line 28
    invoke-interface {p1, v8}, Ll7/f;->beginStructure(Lk7/g;)Ll7/d;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    sget-object v9, Lcom/zykj/mistake/feature/collection/filter/l;->j:[Ld6/e;

    .line 33
    .line 34
    const/4 v10, 0x0

    .line 35
    invoke-interface {p1, v8, v10}, Ll7/d;->shouldEncodeElementDefault(Lk7/g;I)Z

    .line 36
    .line 37
    .line 38
    move-result v11

    .line 39
    if-eqz v11, :cond_0

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    const-string v11, ""

    .line 43
    .line 44
    invoke-static {p2, v11}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v11

    .line 48
    if-nez v11, :cond_1

    .line 49
    .line 50
    :goto_0
    invoke-interface {p1, v8, v10, p2}, Ll7/d;->encodeStringElement(Lk7/g;ILjava/lang/String;)V

    .line 51
    .line 52
    .line 53
    :cond_1
    const/4 p2, 0x1

    .line 54
    invoke-interface {p1, v8, p2}, Ll7/d;->shouldEncodeElementDefault(Lk7/g;I)Z

    .line 55
    .line 56
    .line 57
    move-result v10

    .line 58
    if-eqz v10, :cond_2

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_2
    const-string v10, "\u9519\u9898\u96c6"

    .line 62
    .line 63
    invoke-static {v7, v10}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v10

    .line 67
    if-nez v10, :cond_3

    .line 68
    .line 69
    :goto_1
    invoke-interface {p1, v8, p2, v7}, Ll7/d;->encodeStringElement(Lk7/g;ILjava/lang/String;)V

    .line 70
    .line 71
    .line 72
    :cond_3
    const/4 v7, 0x2

    .line 73
    invoke-interface {p1, v8, v7}, Ll7/d;->shouldEncodeElementDefault(Lk7/g;I)Z

    .line 74
    .line 75
    .line 76
    move-result v10

    .line 77
    if-eqz v10, :cond_4

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_4
    if-eqz v6, :cond_5

    .line 81
    .line 82
    :goto_2
    invoke-interface {p1, v8, v7, v6}, Ll7/d;->encodeIntElement(Lk7/g;II)V

    .line 83
    .line 84
    .line 85
    :cond_5
    const/4 v6, 0x3

    .line 86
    invoke-interface {p1, v8, v6}, Ll7/d;->shouldEncodeElementDefault(Lk7/g;I)Z

    .line 87
    .line 88
    .line 89
    move-result v7

    .line 90
    if-eqz v7, :cond_6

    .line 91
    .line 92
    goto :goto_3

    .line 93
    :cond_6
    const/16 v7, 0x64

    .line 94
    .line 95
    if-eq v5, v7, :cond_7

    .line 96
    .line 97
    :goto_3
    invoke-interface {p1, v8, v6, v5}, Ll7/d;->encodeIntElement(Lk7/g;II)V

    .line 98
    .line 99
    .line 100
    :cond_7
    const/4 v5, 0x4

    .line 101
    invoke-interface {p1, v8, v5}, Ll7/d;->shouldEncodeElementDefault(Lk7/g;I)Z

    .line 102
    .line 103
    .line 104
    move-result v6

    .line 105
    if-eqz v6, :cond_8

    .line 106
    .line 107
    goto :goto_4

    .line 108
    :cond_8
    new-instance v6, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;

    .line 109
    .line 110
    invoke-direct {v6}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;-><init>()V

    .line 111
    .line 112
    .line 113
    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v6

    .line 117
    if-nez v6, :cond_9

    .line 118
    .line 119
    :goto_4
    sget-object v6, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq$$serializer;->INSTANCE:Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq$$serializer;

    .line 120
    .line 121
    invoke-interface {p1, v8, v5, v6, v4}, Ll7/d;->encodeSerializableElement(Lk7/g;ILi7/e;Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    :cond_9
    const/4 v4, 0x5

    .line 125
    invoke-interface {p1, v8, v4}, Ll7/d;->shouldEncodeElementDefault(Lk7/g;I)Z

    .line 126
    .line 127
    .line 128
    move-result v5

    .line 129
    if-eqz v5, :cond_a

    .line 130
    .line 131
    goto :goto_5

    .line 132
    :cond_a
    if-eqz v3, :cond_b

    .line 133
    .line 134
    :goto_5
    invoke-interface {p1, v8, v4, v3}, Ll7/d;->encodeIntElement(Lk7/g;II)V

    .line 135
    .line 136
    .line 137
    :cond_b
    const/4 v3, 0x6

    .line 138
    invoke-interface {p1, v8, v3}, Ll7/d;->shouldEncodeElementDefault(Lk7/g;I)Z

    .line 139
    .line 140
    .line 141
    move-result v4

    .line 142
    if-eqz v4, :cond_c

    .line 143
    .line 144
    goto :goto_6

    .line 145
    :cond_c
    if-eq v2, p2, :cond_d

    .line 146
    .line 147
    :goto_6
    invoke-interface {p1, v8, v3, v2}, Ll7/d;->encodeIntElement(Lk7/g;II)V

    .line 148
    .line 149
    .line 150
    :cond_d
    const/4 p2, 0x7

    .line 151
    invoke-interface {p1, v8, p2}, Ll7/d;->shouldEncodeElementDefault(Lk7/g;I)Z

    .line 152
    .line 153
    .line 154
    move-result v2

    .line 155
    if-eqz v2, :cond_e

    .line 156
    .line 157
    goto :goto_7

    .line 158
    :cond_e
    if-eqz v1, :cond_f

    .line 159
    .line 160
    :goto_7
    invoke-interface {p1, v8, p2, v1}, Ll7/d;->encodeBooleanElement(Lk7/g;IZ)V

    .line 161
    .line 162
    .line 163
    :cond_f
    const/16 p2, 0x8

    .line 164
    .line 165
    invoke-interface {p1, v8, p2}, Ll7/d;->shouldEncodeElementDefault(Lk7/g;I)Z

    .line 166
    .line 167
    .line 168
    move-result v1

    .line 169
    if-eqz v1, :cond_10

    .line 170
    .line 171
    goto :goto_8

    .line 172
    :cond_10
    sget-object v1, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SourceType;->CREATE_COLLECTION:Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SourceType;

    .line 173
    .line 174
    if-eq v0, v1, :cond_11

    .line 175
    .line 176
    :goto_8
    aget-object v1, v9, p2

    .line 177
    .line 178
    invoke-interface {v1}, Ld6/e;->getValue()Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    check-cast v1, Li7/e;

    .line 183
    .line 184
    invoke-interface {p1, v8, p2, v1, v0}, Ll7/d;->encodeSerializableElement(Lk7/g;ILi7/e;Ljava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    :cond_11
    invoke-interface {p1, v8}, Ll7/d;->endStructure(Lk7/g;)V

    .line 188
    .line 189
    .line 190
    return-void
.end method

.method public final typeParametersSerializers()[Li7/b;
    .locals 1

    .line 1
    sget-object v0, Lm7/y0;->b:[Li7/b;

    .line 2
    .line 3
    return-object v0
.end method
