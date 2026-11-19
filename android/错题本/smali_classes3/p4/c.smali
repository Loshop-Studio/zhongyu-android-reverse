.class public final synthetic Lp4/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm7/c0;


# static fields
.field public static final a:Lp4/c;

.field private static final descriptor:Lk7/g;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lp4/c;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lp4/c;->a:Lp4/c;

    .line 7
    .line 8
    new-instance v1, Lm7/a1;

    .line 9
    .line 10
    const-string v2, "com.zykj.mistake.feature.mistake.model.MistakeNavItem"

    .line 11
    .line 12
    const/16 v3, 0xb

    .line 13
    .line 14
    invoke-direct {v1, v2, v0, v3}, Lm7/a1;-><init>(Ljava/lang/String;Lm7/c0;I)V

    .line 15
    .line 16
    .line 17
    const-string v0, "itemId"

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-virtual {v1, v0, v2}, Lm7/a1;->j(Ljava/lang/String;Z)V

    .line 21
    .line 22
    .line 23
    const-string v0, "topicId"

    .line 24
    .line 25
    const/4 v2, 0x1

    .line 26
    invoke-virtual {v1, v0, v2}, Lm7/a1;->j(Ljava/lang/String;Z)V

    .line 27
    .line 28
    .line 29
    const-string v0, "subject"

    .line 30
    .line 31
    invoke-virtual {v1, v0, v2}, Lm7/a1;->j(Ljava/lang/String;Z)V

    .line 32
    .line 33
    .line 34
    const-string v0, "examName"

    .line 35
    .line 36
    invoke-virtual {v1, v0, v2}, Lm7/a1;->j(Ljava/lang/String;Z)V

    .line 37
    .line 38
    .line 39
    const-string v0, "title"

    .line 40
    .line 41
    invoke-virtual {v1, v0, v2}, Lm7/a1;->j(Ljava/lang/String;Z)V

    .line 42
    .line 43
    .line 44
    const-string v0, "stemShoot"

    .line 45
    .line 46
    invoke-virtual {v1, v0, v2}, Lm7/a1;->j(Ljava/lang/String;Z)V

    .line 47
    .line 48
    .line 49
    const-string v0, "isCustomMistake"

    .line 50
    .line 51
    invoke-virtual {v1, v0, v2}, Lm7/a1;->j(Ljava/lang/String;Z)V

    .line 52
    .line 53
    .line 54
    const-string v0, "isRelatedQstGroup"

    .line 55
    .line 56
    invoke-virtual {v1, v0, v2}, Lm7/a1;->j(Ljava/lang/String;Z)V

    .line 57
    .line 58
    .line 59
    const-string v0, "hasStem"

    .line 60
    .line 61
    invoke-virtual {v1, v0, v2}, Lm7/a1;->j(Ljava/lang/String;Z)V

    .line 62
    .line 63
    .line 64
    const-string v0, "isMastered"

    .line 65
    .line 66
    invoke-virtual {v1, v0, v2}, Lm7/a1;->j(Ljava/lang/String;Z)V

    .line 67
    .line 68
    .line 69
    const-string v0, "tags"

    .line 70
    .line 71
    invoke-virtual {v1, v0, v2}, Lm7/a1;->j(Ljava/lang/String;Z)V

    .line 72
    .line 73
    .line 74
    sput-object v1, Lp4/c;->descriptor:Lk7/g;

    .line 75
    .line 76
    return-void
.end method


# virtual methods
.method public final childSerializers()[Li7/b;
    .locals 4

    .line 1
    sget-object v0, Lp4/e;->l:[Ld6/e;

    .line 2
    .line 3
    const/16 v1, 0xb

    .line 4
    .line 5
    new-array v1, v1, [Li7/b;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    sget-object v3, Lm7/j0;->a:Lm7/j0;

    .line 9
    .line 10
    aput-object v3, v1, v2

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    sget-object v3, Lm7/o0;->a:Lm7/o0;

    .line 14
    .line 15
    aput-object v3, v1, v2

    .line 16
    .line 17
    sget-object v2, Lm7/m1;->a:Lm7/m1;

    .line 18
    .line 19
    const/4 v3, 0x2

    .line 20
    aput-object v2, v1, v3

    .line 21
    .line 22
    const/4 v3, 0x3

    .line 23
    aput-object v2, v1, v3

    .line 24
    .line 25
    const/4 v3, 0x4

    .line 26
    aput-object v2, v1, v3

    .line 27
    .line 28
    const/4 v3, 0x5

    .line 29
    aput-object v2, v1, v3

    .line 30
    .line 31
    sget-object v2, Lm7/g;->a:Lm7/g;

    .line 32
    .line 33
    const/4 v3, 0x6

    .line 34
    aput-object v2, v1, v3

    .line 35
    .line 36
    const/4 v3, 0x7

    .line 37
    aput-object v2, v1, v3

    .line 38
    .line 39
    const/16 v3, 0x8

    .line 40
    .line 41
    aput-object v2, v1, v3

    .line 42
    .line 43
    const/16 v3, 0x9

    .line 44
    .line 45
    aput-object v2, v1, v3

    .line 46
    .line 47
    const/16 v2, 0xa

    .line 48
    .line 49
    aget-object v0, v0, v2

    .line 50
    .line 51
    invoke-interface {v0}, Ld6/e;->getValue()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    aput-object v0, v1, v2

    .line 56
    .line 57
    return-object v1
.end method

.method public final deserialize(Ll7/e;)Ljava/lang/Object;
    .locals 41

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
    sget-object v1, Lp4/c;->descriptor:Lk7/g;

    .line 9
    .line 10
    invoke-interface {v0, v1}, Ll7/e;->beginStructure(Lk7/g;)Ll7/c;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sget-object v2, Lp4/e;->l:[Ld6/e;

    .line 15
    .line 16
    invoke-interface {v0}, Ll7/c;->decodeSequentially()Z

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    const/16 v4, 0x9

    .line 21
    .line 22
    const/4 v5, 0x7

    .line 23
    const/4 v6, 0x6

    .line 24
    const/4 v7, 0x5

    .line 25
    const/4 v8, 0x3

    .line 26
    const/16 v9, 0x8

    .line 27
    .line 28
    const/4 v10, 0x4

    .line 29
    const/4 v11, 0x2

    .line 30
    const/16 v12, 0xa

    .line 31
    .line 32
    const/4 v13, 0x1

    .line 33
    const/4 v14, 0x0

    .line 34
    const/4 v15, 0x0

    .line 35
    if-eqz v3, :cond_0

    .line 36
    .line 37
    invoke-interface {v0, v1, v14}, Ll7/c;->decodeIntElement(Lk7/g;I)I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    invoke-interface {v0, v1, v13}, Ll7/c;->decodeLongElement(Lk7/g;I)J

    .line 42
    .line 43
    .line 44
    move-result-wide v13

    .line 45
    invoke-interface {v0, v1, v11}, Ll7/c;->decodeStringElement(Lk7/g;I)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v11

    .line 49
    invoke-interface {v0, v1, v8}, Ll7/c;->decodeStringElement(Lk7/g;I)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v8

    .line 53
    invoke-interface {v0, v1, v10}, Ll7/c;->decodeStringElement(Lk7/g;I)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v10

    .line 57
    invoke-interface {v0, v1, v7}, Ll7/c;->decodeStringElement(Lk7/g;I)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v7

    .line 61
    invoke-interface {v0, v1, v6}, Ll7/c;->decodeBooleanElement(Lk7/g;I)Z

    .line 62
    .line 63
    .line 64
    move-result v6

    .line 65
    invoke-interface {v0, v1, v5}, Ll7/c;->decodeBooleanElement(Lk7/g;I)Z

    .line 66
    .line 67
    .line 68
    move-result v5

    .line 69
    invoke-interface {v0, v1, v9}, Ll7/c;->decodeBooleanElement(Lk7/g;I)Z

    .line 70
    .line 71
    .line 72
    move-result v9

    .line 73
    invoke-interface {v0, v1, v4}, Ll7/c;->decodeBooleanElement(Lk7/g;I)Z

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    aget-object v2, v2, v12

    .line 78
    .line 79
    invoke-interface {v2}, Ld6/e;->getValue()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    check-cast v2, Li7/a;

    .line 84
    .line 85
    invoke-interface {v0, v1, v12, v2, v15}, Ll7/c;->decodeSerializableElement(Lk7/g;ILi7/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    check-cast v2, Ljava/util/List;

    .line 90
    .line 91
    const/16 v12, 0x7ff

    .line 92
    .line 93
    move-object/from16 v40, v2

    .line 94
    .line 95
    move/from16 v39, v4

    .line 96
    .line 97
    move/from16 v37, v5

    .line 98
    .line 99
    move/from16 v36, v6

    .line 100
    .line 101
    move-object/from16 v35, v7

    .line 102
    .line 103
    move-object/from16 v33, v8

    .line 104
    .line 105
    move/from16 v38, v9

    .line 106
    .line 107
    move-object/from16 v34, v10

    .line 108
    .line 109
    move-object/from16 v32, v11

    .line 110
    .line 111
    move/from16 v28, v12

    .line 112
    .line 113
    move-wide/from16 v30, v13

    .line 114
    .line 115
    :goto_0
    move/from16 v29, v3

    .line 116
    .line 117
    goto/16 :goto_4

    .line 118
    .line 119
    :cond_0
    const-wide/16 v16, 0x0

    .line 120
    .line 121
    move/from16 v26, v13

    .line 122
    .line 123
    move v3, v14

    .line 124
    move/from16 v18, v3

    .line 125
    .line 126
    move-object v13, v15

    .line 127
    move-object/from16 v21, v13

    .line 128
    .line 129
    move-object/from16 v22, v21

    .line 130
    .line 131
    move-object/from16 v23, v22

    .line 132
    .line 133
    move-object/from16 v24, v23

    .line 134
    .line 135
    move-wide/from16 v19, v16

    .line 136
    .line 137
    move/from16 v15, v18

    .line 138
    .line 139
    move/from16 v16, v15

    .line 140
    .line 141
    move/from16 v17, v16

    .line 142
    .line 143
    :goto_1
    if-eqz v26, :cond_1

    .line 144
    .line 145
    invoke-interface {v0, v1}, Ll7/c;->decodeElementIndex(Lk7/g;)I

    .line 146
    .line 147
    .line 148
    move-result v11

    .line 149
    packed-switch v11, :pswitch_data_0

    .line 150
    .line 151
    .line 152
    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    .line 153
    .line 154
    invoke-direct {v0, v11}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    .line 155
    .line 156
    .line 157
    throw v0

    .line 158
    :pswitch_0
    aget-object v11, v2, v12

    .line 159
    .line 160
    invoke-interface {v11}, Ld6/e;->getValue()Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v11

    .line 164
    check-cast v11, Li7/a;

    .line 165
    .line 166
    invoke-interface {v0, v1, v12, v11, v13}, Ll7/c;->decodeSerializableElement(Lk7/g;ILi7/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v11

    .line 170
    move-object v13, v11

    .line 171
    check-cast v13, Ljava/util/List;

    .line 172
    .line 173
    or-int/lit16 v14, v14, 0x400

    .line 174
    .line 175
    :goto_2
    const/4 v11, 0x2

    .line 176
    goto :goto_1

    .line 177
    :pswitch_1
    invoke-interface {v0, v1, v4}, Ll7/c;->decodeBooleanElement(Lk7/g;I)Z

    .line 178
    .line 179
    .line 180
    move-result v15

    .line 181
    or-int/lit16 v14, v14, 0x200

    .line 182
    .line 183
    goto :goto_2

    .line 184
    :pswitch_2
    invoke-interface {v0, v1, v9}, Ll7/c;->decodeBooleanElement(Lk7/g;I)Z

    .line 185
    .line 186
    .line 187
    move-result v18

    .line 188
    or-int/lit16 v14, v14, 0x100

    .line 189
    .line 190
    goto :goto_2

    .line 191
    :pswitch_3
    invoke-interface {v0, v1, v5}, Ll7/c;->decodeBooleanElement(Lk7/g;I)Z

    .line 192
    .line 193
    .line 194
    move-result v16

    .line 195
    or-int/lit16 v14, v14, 0x80

    .line 196
    .line 197
    goto :goto_2

    .line 198
    :pswitch_4
    invoke-interface {v0, v1, v6}, Ll7/c;->decodeBooleanElement(Lk7/g;I)Z

    .line 199
    .line 200
    .line 201
    move-result v17

    .line 202
    or-int/lit8 v14, v14, 0x40

    .line 203
    .line 204
    goto :goto_2

    .line 205
    :pswitch_5
    invoke-interface {v0, v1, v7}, Ll7/c;->decodeStringElement(Lk7/g;I)Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v24

    .line 209
    or-int/lit8 v14, v14, 0x20

    .line 210
    .line 211
    goto :goto_2

    .line 212
    :pswitch_6
    invoke-interface {v0, v1, v10}, Ll7/c;->decodeStringElement(Lk7/g;I)Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v23

    .line 216
    or-int/lit8 v14, v14, 0x10

    .line 217
    .line 218
    goto :goto_2

    .line 219
    :pswitch_7
    invoke-interface {v0, v1, v8}, Ll7/c;->decodeStringElement(Lk7/g;I)Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object v22

    .line 223
    or-int/lit8 v14, v14, 0x8

    .line 224
    .line 225
    goto :goto_2

    .line 226
    :pswitch_8
    const/4 v11, 0x2

    .line 227
    invoke-interface {v0, v1, v11}, Ll7/c;->decodeStringElement(Lk7/g;I)Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v21

    .line 231
    or-int/lit8 v14, v14, 0x4

    .line 232
    .line 233
    goto :goto_1

    .line 234
    :pswitch_9
    const/4 v4, 0x1

    .line 235
    const/4 v11, 0x2

    .line 236
    invoke-interface {v0, v1, v4}, Ll7/c;->decodeLongElement(Lk7/g;I)J

    .line 237
    .line 238
    .line 239
    move-result-wide v19

    .line 240
    or-int/lit8 v14, v14, 0x2

    .line 241
    .line 242
    :goto_3
    const/16 v4, 0x9

    .line 243
    .line 244
    goto :goto_1

    .line 245
    :pswitch_a
    const/4 v3, 0x0

    .line 246
    const/4 v4, 0x1

    .line 247
    const/4 v11, 0x2

    .line 248
    invoke-interface {v0, v1, v3}, Ll7/c;->decodeIntElement(Lk7/g;I)I

    .line 249
    .line 250
    .line 251
    move-result v25

    .line 252
    or-int/lit8 v14, v14, 0x1

    .line 253
    .line 254
    move/from16 v3, v25

    .line 255
    .line 256
    goto :goto_3

    .line 257
    :pswitch_b
    const/4 v4, 0x1

    .line 258
    const/4 v11, 0x2

    .line 259
    const/16 v25, 0x0

    .line 260
    .line 261
    move/from16 v26, v25

    .line 262
    .line 263
    goto :goto_3

    .line 264
    :cond_1
    move-object/from16 v40, v13

    .line 265
    .line 266
    move/from16 v28, v14

    .line 267
    .line 268
    move/from16 v39, v15

    .line 269
    .line 270
    move/from16 v37, v16

    .line 271
    .line 272
    move/from16 v36, v17

    .line 273
    .line 274
    move/from16 v38, v18

    .line 275
    .line 276
    move-wide/from16 v30, v19

    .line 277
    .line 278
    move-object/from16 v32, v21

    .line 279
    .line 280
    move-object/from16 v33, v22

    .line 281
    .line 282
    move-object/from16 v34, v23

    .line 283
    .line 284
    move-object/from16 v35, v24

    .line 285
    .line 286
    goto/16 :goto_0

    .line 287
    .line 288
    :goto_4
    invoke-interface {v0, v1}, Ll7/c;->endStructure(Lk7/g;)V

    .line 289
    .line 290
    .line 291
    new-instance v27, Lp4/e;

    .line 292
    .line 293
    invoke-direct/range {v27 .. v40}, Lp4/e;-><init>(IIJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZLjava/util/List;)V

    .line 294
    .line 295
    .line 296
    return-object v27

    .line 297
    :pswitch_data_0
    .packed-switch -0x1
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
    sget-object v0, Lp4/c;->descriptor:Lk7/g;

    .line 2
    .line 3
    return-object v0
.end method

.method public final serialize(Ll7/f;Ljava/lang/Object;)V
    .locals 18

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    check-cast v0, Lp4/e;

    .line 4
    .line 5
    const-string v1, "value"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    sget-object v1, Lp4/c;->descriptor:Lk7/g;

    .line 11
    .line 12
    move-object/from16 v2, p1

    .line 13
    .line 14
    invoke-interface {v2, v1}, Ll7/f;->beginStructure(Lk7/g;)Ll7/d;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    sget-object v3, Lp4/e;->l:[Ld6/e;

    .line 19
    .line 20
    iget v4, v0, Lp4/e;->a:I

    .line 21
    .line 22
    iget-object v5, v0, Lp4/e;->k:Ljava/util/List;

    .line 23
    .line 24
    iget-boolean v6, v0, Lp4/e;->j:Z

    .line 25
    .line 26
    iget-boolean v7, v0, Lp4/e;->i:Z

    .line 27
    .line 28
    iget-boolean v8, v0, Lp4/e;->h:Z

    .line 29
    .line 30
    iget-boolean v9, v0, Lp4/e;->g:Z

    .line 31
    .line 32
    iget-object v10, v0, Lp4/e;->f:Ljava/lang/String;

    .line 33
    .line 34
    iget-object v11, v0, Lp4/e;->e:Ljava/lang/String;

    .line 35
    .line 36
    iget-object v12, v0, Lp4/e;->d:Ljava/lang/String;

    .line 37
    .line 38
    iget-object v13, v0, Lp4/e;->c:Ljava/lang/String;

    .line 39
    .line 40
    iget-wide v14, v0, Lp4/e;->b:J

    .line 41
    .line 42
    const/4 v0, 0x0

    .line 43
    invoke-interface {v2, v1, v0, v4}, Ll7/d;->encodeIntElement(Lk7/g;II)V

    .line 44
    .line 45
    .line 46
    const/4 v0, 0x1

    .line 47
    invoke-interface {v2, v1, v0}, Ll7/d;->shouldEncodeElementDefault(Lk7/g;I)Z

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    if-eqz v4, :cond_0

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    const-wide/16 v16, 0x0

    .line 55
    .line 56
    cmp-long v4, v14, v16

    .line 57
    .line 58
    if-eqz v4, :cond_1

    .line 59
    .line 60
    :goto_0
    invoke-interface {v2, v1, v0, v14, v15}, Ll7/d;->encodeLongElement(Lk7/g;IJ)V

    .line 61
    .line 62
    .line 63
    :cond_1
    const/4 v4, 0x2

    .line 64
    invoke-interface {v2, v1, v4}, Ll7/d;->shouldEncodeElementDefault(Lk7/g;I)Z

    .line 65
    .line 66
    .line 67
    move-result v14

    .line 68
    const-string v15, ""

    .line 69
    .line 70
    if-eqz v14, :cond_2

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_2
    invoke-static {v13, v15}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v14

    .line 77
    if-nez v14, :cond_3

    .line 78
    .line 79
    :goto_1
    invoke-interface {v2, v1, v4, v13}, Ll7/d;->encodeStringElement(Lk7/g;ILjava/lang/String;)V

    .line 80
    .line 81
    .line 82
    :cond_3
    const/4 v4, 0x3

    .line 83
    invoke-interface {v2, v1, v4}, Ll7/d;->shouldEncodeElementDefault(Lk7/g;I)Z

    .line 84
    .line 85
    .line 86
    move-result v13

    .line 87
    if-eqz v13, :cond_4

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_4
    invoke-static {v12, v15}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v13

    .line 94
    if-nez v13, :cond_5

    .line 95
    .line 96
    :goto_2
    invoke-interface {v2, v1, v4, v12}, Ll7/d;->encodeStringElement(Lk7/g;ILjava/lang/String;)V

    .line 97
    .line 98
    .line 99
    :cond_5
    const/4 v4, 0x4

    .line 100
    invoke-interface {v2, v1, v4}, Ll7/d;->shouldEncodeElementDefault(Lk7/g;I)Z

    .line 101
    .line 102
    .line 103
    move-result v12

    .line 104
    if-eqz v12, :cond_6

    .line 105
    .line 106
    goto :goto_3

    .line 107
    :cond_6
    invoke-static {v11, v15}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result v12

    .line 111
    if-nez v12, :cond_7

    .line 112
    .line 113
    :goto_3
    invoke-interface {v2, v1, v4, v11}, Ll7/d;->encodeStringElement(Lk7/g;ILjava/lang/String;)V

    .line 114
    .line 115
    .line 116
    :cond_7
    const/4 v4, 0x5

    .line 117
    invoke-interface {v2, v1, v4}, Ll7/d;->shouldEncodeElementDefault(Lk7/g;I)Z

    .line 118
    .line 119
    .line 120
    move-result v11

    .line 121
    if-eqz v11, :cond_8

    .line 122
    .line 123
    goto :goto_4

    .line 124
    :cond_8
    invoke-static {v10, v15}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v11

    .line 128
    if-nez v11, :cond_9

    .line 129
    .line 130
    :goto_4
    invoke-interface {v2, v1, v4, v10}, Ll7/d;->encodeStringElement(Lk7/g;ILjava/lang/String;)V

    .line 131
    .line 132
    .line 133
    :cond_9
    const/4 v4, 0x6

    .line 134
    invoke-interface {v2, v1, v4}, Ll7/d;->shouldEncodeElementDefault(Lk7/g;I)Z

    .line 135
    .line 136
    .line 137
    move-result v10

    .line 138
    if-eqz v10, :cond_a

    .line 139
    .line 140
    goto :goto_5

    .line 141
    :cond_a
    if-eqz v9, :cond_b

    .line 142
    .line 143
    :goto_5
    invoke-interface {v2, v1, v4, v9}, Ll7/d;->encodeBooleanElement(Lk7/g;IZ)V

    .line 144
    .line 145
    .line 146
    :cond_b
    const/4 v4, 0x7

    .line 147
    invoke-interface {v2, v1, v4}, Ll7/d;->shouldEncodeElementDefault(Lk7/g;I)Z

    .line 148
    .line 149
    .line 150
    move-result v9

    .line 151
    if-eqz v9, :cond_c

    .line 152
    .line 153
    goto :goto_6

    .line 154
    :cond_c
    if-eqz v8, :cond_d

    .line 155
    .line 156
    :goto_6
    invoke-interface {v2, v1, v4, v8}, Ll7/d;->encodeBooleanElement(Lk7/g;IZ)V

    .line 157
    .line 158
    .line 159
    :cond_d
    const/16 v4, 0x8

    .line 160
    .line 161
    invoke-interface {v2, v1, v4}, Ll7/d;->shouldEncodeElementDefault(Lk7/g;I)Z

    .line 162
    .line 163
    .line 164
    move-result v8

    .line 165
    if-eqz v8, :cond_e

    .line 166
    .line 167
    goto :goto_7

    .line 168
    :cond_e
    if-eq v7, v0, :cond_f

    .line 169
    .line 170
    :goto_7
    invoke-interface {v2, v1, v4, v7}, Ll7/d;->encodeBooleanElement(Lk7/g;IZ)V

    .line 171
    .line 172
    .line 173
    :cond_f
    const/16 v0, 0x9

    .line 174
    .line 175
    invoke-interface {v2, v1, v0}, Ll7/d;->shouldEncodeElementDefault(Lk7/g;I)Z

    .line 176
    .line 177
    .line 178
    move-result v4

    .line 179
    if-eqz v4, :cond_10

    .line 180
    .line 181
    goto :goto_8

    .line 182
    :cond_10
    if-eqz v6, :cond_11

    .line 183
    .line 184
    :goto_8
    invoke-interface {v2, v1, v0, v6}, Ll7/d;->encodeBooleanElement(Lk7/g;IZ)V

    .line 185
    .line 186
    .line 187
    :cond_11
    const/16 v0, 0xa

    .line 188
    .line 189
    invoke-interface {v2, v1, v0}, Ll7/d;->shouldEncodeElementDefault(Lk7/g;I)Z

    .line 190
    .line 191
    .line 192
    move-result v4

    .line 193
    if-eqz v4, :cond_12

    .line 194
    .line 195
    goto :goto_9

    .line 196
    :cond_12
    sget-object v4, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 197
    .line 198
    invoke-static {v5, v4}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    move-result v4

    .line 202
    if-nez v4, :cond_13

    .line 203
    .line 204
    :goto_9
    aget-object v3, v3, v0

    .line 205
    .line 206
    invoke-interface {v3}, Ld6/e;->getValue()Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v3

    .line 210
    check-cast v3, Li7/e;

    .line 211
    .line 212
    invoke-interface {v2, v1, v0, v3, v5}, Ll7/d;->encodeSerializableElement(Lk7/g;ILi7/e;Ljava/lang/Object;)V

    .line 213
    .line 214
    .line 215
    :cond_13
    invoke-interface {v2, v1}, Ll7/d;->endStructure(Lk7/g;)V

    .line 216
    .line 217
    .line 218
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
