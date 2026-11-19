.class public final synthetic Lu4/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm7/c0;


# static fields
.field public static final a:Lu4/e;

.field private static final descriptor:Lk7/g;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lu4/e;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lu4/e;->a:Lu4/e;

    .line 7
    .line 8
    new-instance v1, Lm7/a1;

    .line 9
    .line 10
    const-string v2, "com.zykj.mistake.navigation.args.MistakeDetailRouteArgs"

    .line 11
    .line 12
    const/16 v3, 0x12

    .line 13
    .line 14
    invoke-direct {v1, v2, v0, v3}, Lm7/a1;-><init>(Ljava/lang/String;Lm7/c0;I)V

    .line 15
    .line 16
    .line 17
    const-string v0, "bookId"

    .line 18
    .line 19
    const/4 v2, 0x1

    .line 20
    invoke-virtual {v1, v0, v2}, Lm7/a1;->j(Ljava/lang/String;Z)V

    .line 21
    .line 22
    .line 23
    const-string v0, "itemId"

    .line 24
    .line 25
    invoke-virtual {v1, v0, v2}, Lm7/a1;->j(Ljava/lang/String;Z)V

    .line 26
    .line 27
    .line 28
    const-string v0, "topicId"

    .line 29
    .line 30
    invoke-virtual {v1, v0, v2}, Lm7/a1;->j(Ljava/lang/String;Z)V

    .line 31
    .line 32
    .line 33
    const-string v0, "subject"

    .line 34
    .line 35
    invoke-virtual {v1, v0, v2}, Lm7/a1;->j(Ljava/lang/String;Z)V

    .line 36
    .line 37
    .line 38
    const-string v0, "examName"

    .line 39
    .line 40
    invoke-virtual {v1, v0, v2}, Lm7/a1;->j(Ljava/lang/String;Z)V

    .line 41
    .line 42
    .line 43
    const-string v0, "title"

    .line 44
    .line 45
    invoke-virtual {v1, v0, v2}, Lm7/a1;->j(Ljava/lang/String;Z)V

    .line 46
    .line 47
    .line 48
    const-string v0, "stemShoot"

    .line 49
    .line 50
    invoke-virtual {v1, v0, v2}, Lm7/a1;->j(Ljava/lang/String;Z)V

    .line 51
    .line 52
    .line 53
    const-string v0, "hasStem"

    .line 54
    .line 55
    invoke-virtual {v1, v0, v2}, Lm7/a1;->j(Ljava/lang/String;Z)V

    .line 56
    .line 57
    .line 58
    const-string v0, "isCustomMistake"

    .line 59
    .line 60
    invoke-virtual {v1, v0, v2}, Lm7/a1;->j(Ljava/lang/String;Z)V

    .line 61
    .line 62
    .line 63
    const-string v0, "isRelatedQstGroup"

    .line 64
    .line 65
    invoke-virtual {v1, v0, v2}, Lm7/a1;->j(Ljava/lang/String;Z)V

    .line 66
    .line 67
    .line 68
    const-string v0, "tags"

    .line 69
    .line 70
    invoke-virtual {v1, v0, v2}, Lm7/a1;->j(Ljava/lang/String;Z)V

    .line 71
    .line 72
    .line 73
    const-string v0, "navigationKey"

    .line 74
    .line 75
    invoke-virtual {v1, v0, v2}, Lm7/a1;->j(Ljava/lang/String;Z)V

    .line 76
    .line 77
    .line 78
    const-string v0, "navIndex"

    .line 79
    .line 80
    invoke-virtual {v1, v0, v2}, Lm7/a1;->j(Ljava/lang/String;Z)V

    .line 81
    .line 82
    .line 83
    const-string v0, "entryMode"

    .line 84
    .line 85
    invoke-virtual {v1, v0, v2}, Lm7/a1;->j(Ljava/lang/String;Z)V

    .line 86
    .line 87
    .line 88
    const-string v0, "reviewPracticeSessionId"

    .line 89
    .line 90
    invoke-virtual {v1, v0, v2}, Lm7/a1;->j(Ljava/lang/String;Z)V

    .line 91
    .line 92
    .line 93
    const-string v0, "reviewPracticeRoundId"

    .line 94
    .line 95
    invoke-virtual {v1, v0, v2}, Lm7/a1;->j(Ljava/lang/String;Z)V

    .line 96
    .line 97
    .line 98
    const-string v0, "reviewPracticeScene"

    .line 99
    .line 100
    invoke-virtual {v1, v0, v2}, Lm7/a1;->j(Ljava/lang/String;Z)V

    .line 101
    .line 102
    .line 103
    const-string v0, "reviewPracticePoolType"

    .line 104
    .line 105
    invoke-virtual {v1, v0, v2}, Lm7/a1;->j(Ljava/lang/String;Z)V

    .line 106
    .line 107
    .line 108
    sput-object v1, Lu4/e;->descriptor:Lk7/g;

    .line 109
    .line 110
    return-void
.end method


# virtual methods
.method public final childSerializers()[Li7/b;
    .locals 6

    .line 1
    sget-object v0, Lu4/g;->s:[Ld6/e;

    .line 2
    .line 3
    const/16 v1, 0x12

    .line 4
    .line 5
    new-array v1, v1, [Li7/b;

    .line 6
    .line 7
    sget-object v2, Lm7/j0;->a:Lm7/j0;

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
    const/4 v3, 0x2

    .line 16
    sget-object v4, Lm7/o0;->a:Lm7/o0;

    .line 17
    .line 18
    aput-object v4, v1, v3

    .line 19
    .line 20
    sget-object v3, Lm7/m1;->a:Lm7/m1;

    .line 21
    .line 22
    const/4 v4, 0x3

    .line 23
    aput-object v3, v1, v4

    .line 24
    .line 25
    const/4 v4, 0x4

    .line 26
    aput-object v3, v1, v4

    .line 27
    .line 28
    const/4 v4, 0x5

    .line 29
    aput-object v3, v1, v4

    .line 30
    .line 31
    const/4 v4, 0x6

    .line 32
    aput-object v3, v1, v4

    .line 33
    .line 34
    sget-object v4, Lm7/g;->a:Lm7/g;

    .line 35
    .line 36
    const/4 v5, 0x7

    .line 37
    aput-object v4, v1, v5

    .line 38
    .line 39
    const/16 v5, 0x8

    .line 40
    .line 41
    aput-object v4, v1, v5

    .line 42
    .line 43
    const/16 v5, 0x9

    .line 44
    .line 45
    aput-object v4, v1, v5

    .line 46
    .line 47
    const/16 v4, 0xa

    .line 48
    .line 49
    aget-object v5, v0, v4

    .line 50
    .line 51
    invoke-interface {v5}, Ld6/e;->getValue()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    aput-object v5, v1, v4

    .line 56
    .line 57
    const/16 v4, 0xb

    .line 58
    .line 59
    aput-object v3, v1, v4

    .line 60
    .line 61
    const/16 v4, 0xc

    .line 62
    .line 63
    aput-object v2, v1, v4

    .line 64
    .line 65
    const/16 v2, 0xd

    .line 66
    .line 67
    aget-object v4, v0, v2

    .line 68
    .line 69
    invoke-interface {v4}, Ld6/e;->getValue()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    aput-object v4, v1, v2

    .line 74
    .line 75
    const/16 v2, 0xe

    .line 76
    .line 77
    aput-object v3, v1, v2

    .line 78
    .line 79
    const/16 v2, 0xf

    .line 80
    .line 81
    aput-object v3, v1, v2

    .line 82
    .line 83
    const/16 v2, 0x10

    .line 84
    .line 85
    aget-object v3, v0, v2

    .line 86
    .line 87
    invoke-interface {v3}, Ld6/e;->getValue()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    aput-object v3, v1, v2

    .line 92
    .line 93
    const/16 v2, 0x11

    .line 94
    .line 95
    aget-object v0, v0, v2

    .line 96
    .line 97
    invoke-interface {v0}, Ld6/e;->getValue()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    check-cast v0, Li7/b;

    .line 102
    .line 103
    invoke-static {v0}, Lkotlin/collections/u;->v(Li7/b;)Li7/b;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    aput-object v0, v1, v2

    .line 108
    .line 109
    return-object v1
.end method

.method public final deserialize(Ll7/e;)Ljava/lang/Object;
    .locals 59

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
    sget-object v1, Lu4/e;->descriptor:Lk7/g;

    .line 9
    .line 10
    invoke-interface {v0, v1}, Ll7/e;->beginStructure(Lk7/g;)Ll7/c;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sget-object v2, Lu4/g;->s:[Ld6/e;

    .line 15
    .line 16
    invoke-interface {v0}, Ll7/c;->decodeSequentially()Z

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    const/16 v8, 0x9

    .line 21
    .line 22
    const/4 v9, 0x7

    .line 23
    const/4 v10, 0x6

    .line 24
    const/4 v11, 0x5

    .line 25
    const/4 v12, 0x3

    .line 26
    const/16 v13, 0x8

    .line 27
    .line 28
    const/4 v14, 0x4

    .line 29
    const/4 v15, 0x2

    .line 30
    const/16 v16, 0x11

    .line 31
    .line 32
    const/16 v5, 0xa

    .line 33
    .line 34
    const/16 v18, 0xd

    .line 35
    .line 36
    const/16 v19, 0x10

    .line 37
    .line 38
    const/4 v4, 0x1

    .line 39
    const/4 v6, 0x0

    .line 40
    const/4 v7, 0x0

    .line 41
    if-eqz v3, :cond_0

    .line 42
    .line 43
    invoke-interface {v0, v1, v6}, Ll7/c;->decodeIntElement(Lk7/g;I)I

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    invoke-interface {v0, v1, v4}, Ll7/c;->decodeIntElement(Lk7/g;I)I

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    invoke-interface {v0, v1, v15}, Ll7/c;->decodeLongElement(Lk7/g;I)J

    .line 52
    .line 53
    .line 54
    move-result-wide v21

    .line 55
    invoke-interface {v0, v1, v12}, Ll7/c;->decodeStringElement(Lk7/g;I)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    invoke-interface {v0, v1, v14}, Ll7/c;->decodeStringElement(Lk7/g;I)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v12

    .line 63
    invoke-interface {v0, v1, v11}, Ll7/c;->decodeStringElement(Lk7/g;I)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v11

    .line 67
    invoke-interface {v0, v1, v10}, Ll7/c;->decodeStringElement(Lk7/g;I)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v10

    .line 71
    invoke-interface {v0, v1, v9}, Ll7/c;->decodeBooleanElement(Lk7/g;I)Z

    .line 72
    .line 73
    .line 74
    move-result v9

    .line 75
    invoke-interface {v0, v1, v13}, Ll7/c;->decodeBooleanElement(Lk7/g;I)Z

    .line 76
    .line 77
    .line 78
    move-result v13

    .line 79
    invoke-interface {v0, v1, v8}, Ll7/c;->decodeBooleanElement(Lk7/g;I)Z

    .line 80
    .line 81
    .line 82
    move-result v8

    .line 83
    aget-object v14, v2, v5

    .line 84
    .line 85
    invoke-interface {v14}, Ld6/e;->getValue()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v14

    .line 89
    check-cast v14, Li7/a;

    .line 90
    .line 91
    invoke-interface {v0, v1, v5, v14, v7}, Ll7/c;->decodeSerializableElement(Lk7/g;ILi7/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v5

    .line 95
    check-cast v5, Ljava/util/List;

    .line 96
    .line 97
    const/16 v14, 0xb

    .line 98
    .line 99
    invoke-interface {v0, v1, v14}, Ll7/c;->decodeStringElement(Lk7/g;I)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v14

    .line 103
    const/16 v15, 0xc

    .line 104
    .line 105
    invoke-interface {v0, v1, v15}, Ll7/c;->decodeIntElement(Lk7/g;I)I

    .line 106
    .line 107
    .line 108
    move-result v15

    .line 109
    aget-object v20, v2, v18

    .line 110
    .line 111
    invoke-interface/range {v20 .. v20}, Ld6/e;->getValue()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v20

    .line 115
    move-object/from16 v23, v2

    .line 116
    .line 117
    move-object/from16 v2, v20

    .line 118
    .line 119
    check-cast v2, Li7/a;

    .line 120
    .line 121
    move/from16 v20, v3

    .line 122
    .line 123
    move/from16 v3, v18

    .line 124
    .line 125
    invoke-interface {v0, v1, v3, v2, v7}, Ll7/c;->decodeSerializableElement(Lk7/g;ILi7/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    check-cast v2, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$EntryMode;

    .line 130
    .line 131
    const/16 v3, 0xe

    .line 132
    .line 133
    invoke-interface {v0, v1, v3}, Ll7/c;->decodeStringElement(Lk7/g;I)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v3

    .line 137
    const/16 v7, 0xf

    .line 138
    .line 139
    invoke-interface {v0, v1, v7}, Ll7/c;->decodeStringElement(Lk7/g;I)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v7

    .line 143
    aget-object v17, v23, v19

    .line 144
    .line 145
    invoke-interface/range {v17 .. v17}, Ld6/e;->getValue()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v17

    .line 149
    move-object/from16 p1, v2

    .line 150
    .line 151
    move-object/from16 v2, v17

    .line 152
    .line 153
    check-cast v2, Li7/a;

    .line 154
    .line 155
    move-object/from16 v17, v3

    .line 156
    .line 157
    move-object/from16 v18, v6

    .line 158
    .line 159
    move/from16 v3, v19

    .line 160
    .line 161
    const/4 v6, 0x0

    .line 162
    invoke-interface {v0, v1, v3, v2, v6}, Ll7/c;->decodeSerializableElement(Lk7/g;ILi7/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v2

    .line 166
    check-cast v2, Lcom/zykj/mistake/feature/review/ReviewContract$PracticeScene;

    .line 167
    .line 168
    aget-object v3, v23, v16

    .line 169
    .line 170
    invoke-interface {v3}, Ld6/e;->getValue()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v3

    .line 174
    check-cast v3, Li7/a;

    .line 175
    .line 176
    move-object/from16 v19, v2

    .line 177
    .line 178
    move/from16 v2, v16

    .line 179
    .line 180
    invoke-interface {v0, v1, v2, v3, v6}, Ll7/c;->decodeNullableSerializableElement(Lk7/g;ILi7/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v2

    .line 184
    check-cast v2, Lcom/zykj/mistake/feature/review/ReviewContract$PracticePoolType;

    .line 185
    .line 186
    const v3, 0x3ffff

    .line 187
    .line 188
    .line 189
    move-object/from16 v54, p1

    .line 190
    .line 191
    move-object/from16 v58, v2

    .line 192
    .line 193
    move/from16 v41, v4

    .line 194
    .line 195
    move-object/from16 v51, v5

    .line 196
    .line 197
    move-object/from16 v56, v7

    .line 198
    .line 199
    move/from16 v50, v8

    .line 200
    .line 201
    move/from16 v48, v9

    .line 202
    .line 203
    move-object/from16 v47, v10

    .line 204
    .line 205
    move-object/from16 v46, v11

    .line 206
    .line 207
    move-object/from16 v45, v12

    .line 208
    .line 209
    move/from16 v49, v13

    .line 210
    .line 211
    move-object/from16 v52, v14

    .line 212
    .line 213
    move/from16 v53, v15

    .line 214
    .line 215
    move-object/from16 v55, v17

    .line 216
    .line 217
    move-object/from16 v44, v18

    .line 218
    .line 219
    move-object/from16 v57, v19

    .line 220
    .line 221
    move/from16 v40, v20

    .line 222
    .line 223
    move-wide/from16 v42, v21

    .line 224
    .line 225
    :goto_0
    move/from16 v39, v3

    .line 226
    .line 227
    goto/16 :goto_5

    .line 228
    .line 229
    :cond_0
    move-object/from16 v23, v2

    .line 230
    .line 231
    move v2, v6

    .line 232
    move-object v6, v7

    .line 233
    const-wide/16 v21, 0x0

    .line 234
    .line 235
    move v3, v2

    .line 236
    move v7, v3

    .line 237
    move/from16 v31, v7

    .line 238
    .line 239
    move/from16 v32, v31

    .line 240
    .line 241
    move/from16 v33, v32

    .line 242
    .line 243
    move/from16 v34, v33

    .line 244
    .line 245
    move/from16 v37, v4

    .line 246
    .line 247
    move-object v4, v6

    .line 248
    move-object v12, v4

    .line 249
    move-object v15, v12

    .line 250
    move-object/from16 v24, v15

    .line 251
    .line 252
    move-object/from16 v25, v24

    .line 253
    .line 254
    move-object/from16 v27, v25

    .line 255
    .line 256
    move-object/from16 v29, v27

    .line 257
    .line 258
    move-object/from16 v30, v29

    .line 259
    .line 260
    move-wide/from16 v35, v21

    .line 261
    .line 262
    move/from16 v6, v34

    .line 263
    .line 264
    move-object/from16 v2, v30

    .line 265
    .line 266
    move-object/from16 v21, v2

    .line 267
    .line 268
    move-object/from16 v22, v21

    .line 269
    .line 270
    :goto_1
    if-eqz v37, :cond_1

    .line 271
    .line 272
    invoke-interface {v0, v1}, Ll7/c;->decodeElementIndex(Lk7/g;)I

    .line 273
    .line 274
    .line 275
    move-result v14

    .line 276
    packed-switch v14, :pswitch_data_0

    .line 277
    .line 278
    .line 279
    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    .line 280
    .line 281
    invoke-direct {v0, v14}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    .line 282
    .line 283
    .line 284
    throw v0

    .line 285
    :pswitch_0
    const/16 v14, 0x11

    .line 286
    .line 287
    aget-object v16, v23, v14

    .line 288
    .line 289
    invoke-interface/range {v16 .. v16}, Ld6/e;->getValue()Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object v16

    .line 293
    move-object/from16 v11, v16

    .line 294
    .line 295
    check-cast v11, Li7/a;

    .line 296
    .line 297
    invoke-interface {v0, v1, v14, v11, v12}, Ll7/c;->decodeNullableSerializableElement(Lk7/g;ILi7/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    move-result-object v11

    .line 301
    move-object v12, v11

    .line 302
    check-cast v12, Lcom/zykj/mistake/feature/review/ReviewContract$PracticePoolType;

    .line 303
    .line 304
    const/high16 v11, 0x20000

    .line 305
    .line 306
    or-int/2addr v3, v11

    .line 307
    :goto_2
    const/4 v11, 0x5

    .line 308
    :goto_3
    const/4 v14, 0x4

    .line 309
    goto :goto_1

    .line 310
    :pswitch_1
    const/16 v11, 0x10

    .line 311
    .line 312
    const/16 v14, 0x11

    .line 313
    .line 314
    aget-object v16, v23, v11

    .line 315
    .line 316
    invoke-interface/range {v16 .. v16}, Ld6/e;->getValue()Ljava/lang/Object;

    .line 317
    .line 318
    .line 319
    move-result-object v16

    .line 320
    move-object/from16 v14, v16

    .line 321
    .line 322
    check-cast v14, Li7/a;

    .line 323
    .line 324
    invoke-interface {v0, v1, v11, v14, v15}, Ll7/c;->decodeSerializableElement(Lk7/g;ILi7/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 325
    .line 326
    .line 327
    move-result-object v14

    .line 328
    move-object v15, v14

    .line 329
    check-cast v15, Lcom/zykj/mistake/feature/review/ReviewContract$PracticeScene;

    .line 330
    .line 331
    const/high16 v14, 0x10000

    .line 332
    .line 333
    or-int/2addr v3, v14

    .line 334
    goto :goto_2

    .line 335
    :pswitch_2
    const/16 v11, 0x10

    .line 336
    .line 337
    const/16 v14, 0xf

    .line 338
    .line 339
    invoke-interface {v0, v1, v14}, Ll7/c;->decodeStringElement(Lk7/g;I)Ljava/lang/String;

    .line 340
    .line 341
    .line 342
    move-result-object v30

    .line 343
    const v16, 0x8000

    .line 344
    .line 345
    .line 346
    or-int v3, v3, v16

    .line 347
    .line 348
    goto :goto_2

    .line 349
    :pswitch_3
    const/16 v11, 0xe

    .line 350
    .line 351
    const/16 v14, 0xf

    .line 352
    .line 353
    invoke-interface {v0, v1, v11}, Ll7/c;->decodeStringElement(Lk7/g;I)Ljava/lang/String;

    .line 354
    .line 355
    .line 356
    move-result-object v29

    .line 357
    or-int/lit16 v3, v3, 0x4000

    .line 358
    .line 359
    goto :goto_2

    .line 360
    :pswitch_4
    const/16 v11, 0xd

    .line 361
    .line 362
    const/16 v14, 0xf

    .line 363
    .line 364
    aget-object v16, v23, v11

    .line 365
    .line 366
    invoke-interface/range {v16 .. v16}, Ld6/e;->getValue()Ljava/lang/Object;

    .line 367
    .line 368
    .line 369
    move-result-object v16

    .line 370
    move-object/from16 v14, v16

    .line 371
    .line 372
    check-cast v14, Li7/a;

    .line 373
    .line 374
    invoke-interface {v0, v1, v11, v14, v4}, Ll7/c;->decodeSerializableElement(Lk7/g;ILi7/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 375
    .line 376
    .line 377
    move-result-object v4

    .line 378
    check-cast v4, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$EntryMode;

    .line 379
    .line 380
    or-int/lit16 v3, v3, 0x2000

    .line 381
    .line 382
    goto :goto_2

    .line 383
    :pswitch_5
    const/16 v11, 0xd

    .line 384
    .line 385
    const/16 v14, 0xc

    .line 386
    .line 387
    invoke-interface {v0, v1, v14}, Ll7/c;->decodeIntElement(Lk7/g;I)I

    .line 388
    .line 389
    .line 390
    move-result v34

    .line 391
    or-int/lit16 v3, v3, 0x1000

    .line 392
    .line 393
    goto :goto_2

    .line 394
    :pswitch_6
    const/16 v11, 0xb

    .line 395
    .line 396
    const/16 v14, 0xc

    .line 397
    .line 398
    invoke-interface {v0, v1, v11}, Ll7/c;->decodeStringElement(Lk7/g;I)Ljava/lang/String;

    .line 399
    .line 400
    .line 401
    move-result-object v27

    .line 402
    or-int/lit16 v3, v3, 0x800

    .line 403
    .line 404
    goto :goto_2

    .line 405
    :pswitch_7
    const/16 v11, 0xb

    .line 406
    .line 407
    const/16 v14, 0xc

    .line 408
    .line 409
    aget-object v20, v23, v5

    .line 410
    .line 411
    invoke-interface/range {v20 .. v20}, Ld6/e;->getValue()Ljava/lang/Object;

    .line 412
    .line 413
    .line 414
    move-result-object v20

    .line 415
    move-object/from16 v11, v20

    .line 416
    .line 417
    check-cast v11, Li7/a;

    .line 418
    .line 419
    invoke-interface {v0, v1, v5, v11, v2}, Ll7/c;->decodeSerializableElement(Lk7/g;ILi7/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 420
    .line 421
    .line 422
    move-result-object v2

    .line 423
    check-cast v2, Ljava/util/List;

    .line 424
    .line 425
    or-int/lit16 v3, v3, 0x400

    .line 426
    .line 427
    goto :goto_2

    .line 428
    :pswitch_8
    const/16 v14, 0xc

    .line 429
    .line 430
    invoke-interface {v0, v1, v8}, Ll7/c;->decodeBooleanElement(Lk7/g;I)Z

    .line 431
    .line 432
    .line 433
    move-result v31

    .line 434
    or-int/lit16 v3, v3, 0x200

    .line 435
    .line 436
    goto/16 :goto_2

    .line 437
    .line 438
    :pswitch_9
    const/16 v14, 0xc

    .line 439
    .line 440
    invoke-interface {v0, v1, v13}, Ll7/c;->decodeBooleanElement(Lk7/g;I)Z

    .line 441
    .line 442
    .line 443
    move-result v33

    .line 444
    or-int/lit16 v3, v3, 0x100

    .line 445
    .line 446
    goto/16 :goto_2

    .line 447
    .line 448
    :pswitch_a
    const/16 v14, 0xc

    .line 449
    .line 450
    invoke-interface {v0, v1, v9}, Ll7/c;->decodeBooleanElement(Lk7/g;I)Z

    .line 451
    .line 452
    .line 453
    move-result v32

    .line 454
    or-int/lit16 v3, v3, 0x80

    .line 455
    .line 456
    goto/16 :goto_2

    .line 457
    .line 458
    :pswitch_b
    const/16 v14, 0xc

    .line 459
    .line 460
    invoke-interface {v0, v1, v10}, Ll7/c;->decodeStringElement(Lk7/g;I)Ljava/lang/String;

    .line 461
    .line 462
    .line 463
    move-result-object v25

    .line 464
    or-int/lit8 v3, v3, 0x40

    .line 465
    .line 466
    goto/16 :goto_2

    .line 467
    .line 468
    :pswitch_c
    const/16 v14, 0xc

    .line 469
    .line 470
    invoke-interface {v0, v1, v11}, Ll7/c;->decodeStringElement(Lk7/g;I)Ljava/lang/String;

    .line 471
    .line 472
    .line 473
    move-result-object v24

    .line 474
    or-int/lit8 v3, v3, 0x20

    .line 475
    .line 476
    goto/16 :goto_3

    .line 477
    .line 478
    :pswitch_d
    const/4 v5, 0x4

    .line 479
    const/16 v14, 0xc

    .line 480
    .line 481
    invoke-interface {v0, v1, v5}, Ll7/c;->decodeStringElement(Lk7/g;I)Ljava/lang/String;

    .line 482
    .line 483
    .line 484
    move-result-object v22

    .line 485
    or-int/lit8 v3, v3, 0x10

    .line 486
    .line 487
    move v14, v5

    .line 488
    const/16 v5, 0xa

    .line 489
    .line 490
    goto/16 :goto_1

    .line 491
    .line 492
    :pswitch_e
    const/4 v5, 0x3

    .line 493
    const/16 v14, 0xc

    .line 494
    .line 495
    invoke-interface {v0, v1, v5}, Ll7/c;->decodeStringElement(Lk7/g;I)Ljava/lang/String;

    .line 496
    .line 497
    .line 498
    move-result-object v21

    .line 499
    or-int/lit8 v3, v3, 0x8

    .line 500
    .line 501
    :goto_4
    const/16 v5, 0xa

    .line 502
    .line 503
    goto/16 :goto_3

    .line 504
    .line 505
    :pswitch_f
    const/4 v5, 0x2

    .line 506
    const/16 v14, 0xc

    .line 507
    .line 508
    invoke-interface {v0, v1, v5}, Ll7/c;->decodeLongElement(Lk7/g;I)J

    .line 509
    .line 510
    .line 511
    move-result-wide v35

    .line 512
    or-int/lit8 v3, v3, 0x4

    .line 513
    .line 514
    goto :goto_4

    .line 515
    :pswitch_10
    const/4 v5, 0x2

    .line 516
    const/4 v7, 0x1

    .line 517
    const/16 v14, 0xc

    .line 518
    .line 519
    invoke-interface {v0, v1, v7}, Ll7/c;->decodeIntElement(Lk7/g;I)I

    .line 520
    .line 521
    .line 522
    move-result v28

    .line 523
    or-int/lit8 v3, v3, 0x2

    .line 524
    .line 525
    move/from16 v7, v28

    .line 526
    .line 527
    goto :goto_4

    .line 528
    :pswitch_11
    const/4 v5, 0x2

    .line 529
    const/4 v6, 0x0

    .line 530
    const/16 v14, 0xc

    .line 531
    .line 532
    const/16 v28, 0x1

    .line 533
    .line 534
    invoke-interface {v0, v1, v6}, Ll7/c;->decodeIntElement(Lk7/g;I)I

    .line 535
    .line 536
    .line 537
    move-result v26

    .line 538
    or-int/lit8 v3, v3, 0x1

    .line 539
    .line 540
    move/from16 v6, v26

    .line 541
    .line 542
    goto :goto_4

    .line 543
    :pswitch_12
    const/16 v26, 0x0

    .line 544
    .line 545
    const/16 v28, 0x1

    .line 546
    .line 547
    move/from16 v37, v26

    .line 548
    .line 549
    goto/16 :goto_3

    .line 550
    .line 551
    :cond_1
    move-object/from16 v51, v2

    .line 552
    .line 553
    move-object/from16 v54, v4

    .line 554
    .line 555
    move/from16 v40, v6

    .line 556
    .line 557
    move/from16 v41, v7

    .line 558
    .line 559
    move-object/from16 v58, v12

    .line 560
    .line 561
    move-object/from16 v57, v15

    .line 562
    .line 563
    move-object/from16 v44, v21

    .line 564
    .line 565
    move-object/from16 v45, v22

    .line 566
    .line 567
    move-object/from16 v46, v24

    .line 568
    .line 569
    move-object/from16 v47, v25

    .line 570
    .line 571
    move-object/from16 v52, v27

    .line 572
    .line 573
    move-object/from16 v55, v29

    .line 574
    .line 575
    move-object/from16 v56, v30

    .line 576
    .line 577
    move/from16 v50, v31

    .line 578
    .line 579
    move/from16 v48, v32

    .line 580
    .line 581
    move/from16 v49, v33

    .line 582
    .line 583
    move/from16 v53, v34

    .line 584
    .line 585
    move-wide/from16 v42, v35

    .line 586
    .line 587
    goto/16 :goto_0

    .line 588
    .line 589
    :goto_5
    invoke-interface {v0, v1}, Ll7/c;->endStructure(Lk7/g;)V

    .line 590
    .line 591
    .line 592
    new-instance v38, Lu4/g;

    .line 593
    .line 594
    invoke-direct/range {v38 .. v58}, Lu4/g;-><init>(IIIJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLjava/util/List;Ljava/lang/String;ILcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$EntryMode;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/mistake/feature/review/ReviewContract$PracticeScene;Lcom/zykj/mistake/feature/review/ReviewContract$PracticePoolType;)V

    .line 595
    .line 596
    .line 597
    return-object v38

    .line 598
    nop

    .line 599
    :pswitch_data_0
    .packed-switch -0x1
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

.method public final getDescriptor()Lk7/g;
    .locals 1

    .line 1
    sget-object v0, Lu4/e;->descriptor:Lk7/g;

    .line 2
    .line 3
    return-object v0
.end method

.method public final serialize(Ll7/f;Ljava/lang/Object;)V
    .locals 24

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    check-cast v0, Lu4/g;

    .line 4
    .line 5
    const-string v1, "value"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object v1, v0, Lu4/g;->r:Lcom/zykj/mistake/feature/review/ReviewContract$PracticePoolType;

    .line 11
    .line 12
    iget-object v2, v0, Lu4/g;->q:Lcom/zykj/mistake/feature/review/ReviewContract$PracticeScene;

    .line 13
    .line 14
    iget-object v3, v0, Lu4/g;->p:Ljava/lang/String;

    .line 15
    .line 16
    iget-object v4, v0, Lu4/g;->o:Ljava/lang/String;

    .line 17
    .line 18
    iget-object v5, v0, Lu4/g;->n:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$EntryMode;

    .line 19
    .line 20
    iget v6, v0, Lu4/g;->m:I

    .line 21
    .line 22
    iget-object v7, v0, Lu4/g;->l:Ljava/lang/String;

    .line 23
    .line 24
    iget-object v8, v0, Lu4/g;->k:Ljava/util/List;

    .line 25
    .line 26
    iget-boolean v9, v0, Lu4/g;->j:Z

    .line 27
    .line 28
    iget-boolean v10, v0, Lu4/g;->i:Z

    .line 29
    .line 30
    iget-boolean v11, v0, Lu4/g;->h:Z

    .line 31
    .line 32
    iget-object v12, v0, Lu4/g;->g:Ljava/lang/String;

    .line 33
    .line 34
    iget-object v13, v0, Lu4/g;->f:Ljava/lang/String;

    .line 35
    .line 36
    iget-object v14, v0, Lu4/g;->e:Ljava/lang/String;

    .line 37
    .line 38
    iget-object v15, v0, Lu4/g;->d:Ljava/lang/String;

    .line 39
    .line 40
    move-object/from16 p2, v1

    .line 41
    .line 42
    move-object/from16 v16, v2

    .line 43
    .line 44
    iget-wide v1, v0, Lu4/g;->c:J

    .line 45
    .line 46
    move-object/from16 v17, v3

    .line 47
    .line 48
    iget v3, v0, Lu4/g;->b:I

    .line 49
    .line 50
    iget v0, v0, Lu4/g;->a:I

    .line 51
    .line 52
    move-object/from16 v18, v4

    .line 53
    .line 54
    sget-object v4, Lu4/e;->descriptor:Lk7/g;

    .line 55
    .line 56
    move-object/from16 v19, v5

    .line 57
    .line 58
    move-object/from16 v5, p1

    .line 59
    .line 60
    invoke-interface {v5, v4}, Ll7/f;->beginStructure(Lk7/g;)Ll7/d;

    .line 61
    .line 62
    .line 63
    move-result-object v5

    .line 64
    sget-object v20, Lu4/g;->s:[Ld6/e;

    .line 65
    .line 66
    move/from16 v21, v6

    .line 67
    .line 68
    const/4 v6, 0x0

    .line 69
    invoke-interface {v5, v4, v6}, Ll7/d;->shouldEncodeElementDefault(Lk7/g;I)Z

    .line 70
    .line 71
    .line 72
    move-result v22

    .line 73
    if-eqz v22, :cond_0

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_0
    if-eqz v0, :cond_1

    .line 77
    .line 78
    :goto_0
    invoke-interface {v5, v4, v6, v0}, Ll7/d;->encodeIntElement(Lk7/g;II)V

    .line 79
    .line 80
    .line 81
    :cond_1
    const/4 v0, 0x1

    .line 82
    invoke-interface {v5, v4, v0}, Ll7/d;->shouldEncodeElementDefault(Lk7/g;I)Z

    .line 83
    .line 84
    .line 85
    move-result v6

    .line 86
    if-eqz v6, :cond_2

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_2
    if-eqz v3, :cond_3

    .line 90
    .line 91
    :goto_1
    invoke-interface {v5, v4, v0, v3}, Ll7/d;->encodeIntElement(Lk7/g;II)V

    .line 92
    .line 93
    .line 94
    :cond_3
    const/4 v3, 0x2

    .line 95
    invoke-interface {v5, v4, v3}, Ll7/d;->shouldEncodeElementDefault(Lk7/g;I)Z

    .line 96
    .line 97
    .line 98
    move-result v6

    .line 99
    if-eqz v6, :cond_4

    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_4
    const-wide/16 v22, 0x0

    .line 103
    .line 104
    cmp-long v6, v1, v22

    .line 105
    .line 106
    if-eqz v6, :cond_5

    .line 107
    .line 108
    :goto_2
    invoke-interface {v5, v4, v3, v1, v2}, Ll7/d;->encodeLongElement(Lk7/g;IJ)V

    .line 109
    .line 110
    .line 111
    :cond_5
    const/4 v1, 0x3

    .line 112
    invoke-interface {v5, v4, v1}, Ll7/d;->shouldEncodeElementDefault(Lk7/g;I)Z

    .line 113
    .line 114
    .line 115
    move-result v2

    .line 116
    const-string v3, ""

    .line 117
    .line 118
    if-eqz v2, :cond_6

    .line 119
    .line 120
    goto :goto_3

    .line 121
    :cond_6
    invoke-static {v15, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v2

    .line 125
    if-nez v2, :cond_7

    .line 126
    .line 127
    :goto_3
    invoke-interface {v5, v4, v1, v15}, Ll7/d;->encodeStringElement(Lk7/g;ILjava/lang/String;)V

    .line 128
    .line 129
    .line 130
    :cond_7
    const/4 v1, 0x4

    .line 131
    invoke-interface {v5, v4, v1}, Ll7/d;->shouldEncodeElementDefault(Lk7/g;I)Z

    .line 132
    .line 133
    .line 134
    move-result v2

    .line 135
    if-eqz v2, :cond_8

    .line 136
    .line 137
    goto :goto_4

    .line 138
    :cond_8
    invoke-static {v14, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result v2

    .line 142
    if-nez v2, :cond_9

    .line 143
    .line 144
    :goto_4
    invoke-interface {v5, v4, v1, v14}, Ll7/d;->encodeStringElement(Lk7/g;ILjava/lang/String;)V

    .line 145
    .line 146
    .line 147
    :cond_9
    const/4 v1, 0x5

    .line 148
    invoke-interface {v5, v4, v1}, Ll7/d;->shouldEncodeElementDefault(Lk7/g;I)Z

    .line 149
    .line 150
    .line 151
    move-result v2

    .line 152
    if-eqz v2, :cond_a

    .line 153
    .line 154
    goto :goto_5

    .line 155
    :cond_a
    invoke-static {v13, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result v2

    .line 159
    if-nez v2, :cond_b

    .line 160
    .line 161
    :goto_5
    invoke-interface {v5, v4, v1, v13}, Ll7/d;->encodeStringElement(Lk7/g;ILjava/lang/String;)V

    .line 162
    .line 163
    .line 164
    :cond_b
    const/4 v1, 0x6

    .line 165
    invoke-interface {v5, v4, v1}, Ll7/d;->shouldEncodeElementDefault(Lk7/g;I)Z

    .line 166
    .line 167
    .line 168
    move-result v2

    .line 169
    if-eqz v2, :cond_c

    .line 170
    .line 171
    goto :goto_6

    .line 172
    :cond_c
    invoke-static {v12, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result v2

    .line 176
    if-nez v2, :cond_d

    .line 177
    .line 178
    :goto_6
    invoke-interface {v5, v4, v1, v12}, Ll7/d;->encodeStringElement(Lk7/g;ILjava/lang/String;)V

    .line 179
    .line 180
    .line 181
    :cond_d
    const/4 v1, 0x7

    .line 182
    invoke-interface {v5, v4, v1}, Ll7/d;->shouldEncodeElementDefault(Lk7/g;I)Z

    .line 183
    .line 184
    .line 185
    move-result v2

    .line 186
    if-eqz v2, :cond_e

    .line 187
    .line 188
    goto :goto_7

    .line 189
    :cond_e
    if-eq v11, v0, :cond_f

    .line 190
    .line 191
    :goto_7
    invoke-interface {v5, v4, v1, v11}, Ll7/d;->encodeBooleanElement(Lk7/g;IZ)V

    .line 192
    .line 193
    .line 194
    :cond_f
    const/16 v0, 0x8

    .line 195
    .line 196
    invoke-interface {v5, v4, v0}, Ll7/d;->shouldEncodeElementDefault(Lk7/g;I)Z

    .line 197
    .line 198
    .line 199
    move-result v1

    .line 200
    if-eqz v1, :cond_10

    .line 201
    .line 202
    goto :goto_8

    .line 203
    :cond_10
    if-eqz v10, :cond_11

    .line 204
    .line 205
    :goto_8
    invoke-interface {v5, v4, v0, v10}, Ll7/d;->encodeBooleanElement(Lk7/g;IZ)V

    .line 206
    .line 207
    .line 208
    :cond_11
    const/16 v0, 0x9

    .line 209
    .line 210
    invoke-interface {v5, v4, v0}, Ll7/d;->shouldEncodeElementDefault(Lk7/g;I)Z

    .line 211
    .line 212
    .line 213
    move-result v1

    .line 214
    if-eqz v1, :cond_12

    .line 215
    .line 216
    goto :goto_9

    .line 217
    :cond_12
    if-eqz v9, :cond_13

    .line 218
    .line 219
    :goto_9
    invoke-interface {v5, v4, v0, v9}, Ll7/d;->encodeBooleanElement(Lk7/g;IZ)V

    .line 220
    .line 221
    .line 222
    :cond_13
    const/16 v0, 0xa

    .line 223
    .line 224
    invoke-interface {v5, v4, v0}, Ll7/d;->shouldEncodeElementDefault(Lk7/g;I)Z

    .line 225
    .line 226
    .line 227
    move-result v1

    .line 228
    if-eqz v1, :cond_14

    .line 229
    .line 230
    goto :goto_a

    .line 231
    :cond_14
    sget-object v1, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 232
    .line 233
    invoke-static {v8, v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    move-result v1

    .line 237
    if-nez v1, :cond_15

    .line 238
    .line 239
    :goto_a
    aget-object v1, v20, v0

    .line 240
    .line 241
    invoke-interface {v1}, Ld6/e;->getValue()Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object v1

    .line 245
    check-cast v1, Li7/e;

    .line 246
    .line 247
    invoke-interface {v5, v4, v0, v1, v8}, Ll7/d;->encodeSerializableElement(Lk7/g;ILi7/e;Ljava/lang/Object;)V

    .line 248
    .line 249
    .line 250
    :cond_15
    const/16 v0, 0xb

    .line 251
    .line 252
    invoke-interface {v5, v4, v0}, Ll7/d;->shouldEncodeElementDefault(Lk7/g;I)Z

    .line 253
    .line 254
    .line 255
    move-result v1

    .line 256
    if-eqz v1, :cond_16

    .line 257
    .line 258
    goto :goto_b

    .line 259
    :cond_16
    invoke-static {v7, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 260
    .line 261
    .line 262
    move-result v1

    .line 263
    if-nez v1, :cond_17

    .line 264
    .line 265
    :goto_b
    invoke-interface {v5, v4, v0, v7}, Ll7/d;->encodeStringElement(Lk7/g;ILjava/lang/String;)V

    .line 266
    .line 267
    .line 268
    :cond_17
    const/16 v0, 0xc

    .line 269
    .line 270
    invoke-interface {v5, v4, v0}, Ll7/d;->shouldEncodeElementDefault(Lk7/g;I)Z

    .line 271
    .line 272
    .line 273
    move-result v1

    .line 274
    if-eqz v1, :cond_18

    .line 275
    .line 276
    :goto_c
    move/from16 v1, v21

    .line 277
    .line 278
    goto :goto_d

    .line 279
    :cond_18
    if-eqz v21, :cond_19

    .line 280
    .line 281
    goto :goto_c

    .line 282
    :goto_d
    invoke-interface {v5, v4, v0, v1}, Ll7/d;->encodeIntElement(Lk7/g;II)V

    .line 283
    .line 284
    .line 285
    :cond_19
    const/16 v0, 0xd

    .line 286
    .line 287
    invoke-interface {v5, v4, v0}, Ll7/d;->shouldEncodeElementDefault(Lk7/g;I)Z

    .line 288
    .line 289
    .line 290
    move-result v1

    .line 291
    if-eqz v1, :cond_1a

    .line 292
    .line 293
    move-object/from16 v2, v19

    .line 294
    .line 295
    goto :goto_e

    .line 296
    :cond_1a
    sget-object v1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$EntryMode;->NORMAL:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$EntryMode;

    .line 297
    .line 298
    move-object/from16 v2, v19

    .line 299
    .line 300
    if-eq v2, v1, :cond_1b

    .line 301
    .line 302
    :goto_e
    aget-object v1, v20, v0

    .line 303
    .line 304
    invoke-interface {v1}, Ld6/e;->getValue()Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    move-result-object v1

    .line 308
    check-cast v1, Li7/e;

    .line 309
    .line 310
    invoke-interface {v5, v4, v0, v1, v2}, Ll7/d;->encodeSerializableElement(Lk7/g;ILi7/e;Ljava/lang/Object;)V

    .line 311
    .line 312
    .line 313
    :cond_1b
    const/16 v0, 0xe

    .line 314
    .line 315
    invoke-interface {v5, v4, v0}, Ll7/d;->shouldEncodeElementDefault(Lk7/g;I)Z

    .line 316
    .line 317
    .line 318
    move-result v1

    .line 319
    if-eqz v1, :cond_1c

    .line 320
    .line 321
    move-object/from16 v1, v18

    .line 322
    .line 323
    goto :goto_f

    .line 324
    :cond_1c
    move-object/from16 v1, v18

    .line 325
    .line 326
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 327
    .line 328
    .line 329
    move-result v2

    .line 330
    if-nez v2, :cond_1d

    .line 331
    .line 332
    :goto_f
    invoke-interface {v5, v4, v0, v1}, Ll7/d;->encodeStringElement(Lk7/g;ILjava/lang/String;)V

    .line 333
    .line 334
    .line 335
    :cond_1d
    const/16 v0, 0xf

    .line 336
    .line 337
    invoke-interface {v5, v4, v0}, Ll7/d;->shouldEncodeElementDefault(Lk7/g;I)Z

    .line 338
    .line 339
    .line 340
    move-result v1

    .line 341
    if-eqz v1, :cond_1e

    .line 342
    .line 343
    move-object/from16 v1, v17

    .line 344
    .line 345
    goto :goto_10

    .line 346
    :cond_1e
    move-object/from16 v1, v17

    .line 347
    .line 348
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 349
    .line 350
    .line 351
    move-result v2

    .line 352
    if-nez v2, :cond_1f

    .line 353
    .line 354
    :goto_10
    invoke-interface {v5, v4, v0, v1}, Ll7/d;->encodeStringElement(Lk7/g;ILjava/lang/String;)V

    .line 355
    .line 356
    .line 357
    :cond_1f
    const/16 v0, 0x10

    .line 358
    .line 359
    invoke-interface {v5, v4, v0}, Ll7/d;->shouldEncodeElementDefault(Lk7/g;I)Z

    .line 360
    .line 361
    .line 362
    move-result v1

    .line 363
    if-eqz v1, :cond_20

    .line 364
    .line 365
    move-object/from16 v2, v16

    .line 366
    .line 367
    goto :goto_11

    .line 368
    :cond_20
    sget-object v1, Lcom/zykj/mistake/feature/review/ReviewContract$PracticeScene;->RECOMMEND:Lcom/zykj/mistake/feature/review/ReviewContract$PracticeScene;

    .line 369
    .line 370
    move-object/from16 v2, v16

    .line 371
    .line 372
    if-eq v2, v1, :cond_21

    .line 373
    .line 374
    :goto_11
    aget-object v1, v20, v0

    .line 375
    .line 376
    invoke-interface {v1}, Ld6/e;->getValue()Ljava/lang/Object;

    .line 377
    .line 378
    .line 379
    move-result-object v1

    .line 380
    check-cast v1, Li7/e;

    .line 381
    .line 382
    invoke-interface {v5, v4, v0, v1, v2}, Ll7/d;->encodeSerializableElement(Lk7/g;ILi7/e;Ljava/lang/Object;)V

    .line 383
    .line 384
    .line 385
    :cond_21
    const/16 v0, 0x11

    .line 386
    .line 387
    invoke-interface {v5, v4, v0}, Ll7/d;->shouldEncodeElementDefault(Lk7/g;I)Z

    .line 388
    .line 389
    .line 390
    move-result v1

    .line 391
    if-eqz v1, :cond_22

    .line 392
    .line 393
    goto :goto_12

    .line 394
    :cond_22
    if-eqz p2, :cond_23

    .line 395
    .line 396
    :goto_12
    aget-object v1, v20, v0

    .line 397
    .line 398
    invoke-interface {v1}, Ld6/e;->getValue()Ljava/lang/Object;

    .line 399
    .line 400
    .line 401
    move-result-object v1

    .line 402
    check-cast v1, Li7/e;

    .line 403
    .line 404
    move-object/from16 v2, p2

    .line 405
    .line 406
    invoke-interface {v5, v4, v0, v1, v2}, Ll7/d;->encodeNullableSerializableElement(Lk7/g;ILi7/e;Ljava/lang/Object;)V

    .line 407
    .line 408
    .line 409
    :cond_23
    invoke-interface {v5, v4}, Ll7/d;->endStructure(Lk7/g;)V

    .line 410
    .line 411
    .line 412
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
