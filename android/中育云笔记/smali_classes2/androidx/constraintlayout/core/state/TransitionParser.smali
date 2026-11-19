.class public Landroidx/constraintlayout/core/state/TransitionParser;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static varargs map(Ljava/lang/String;[Ljava/lang/String;)I
    .locals 3

    const/4 v0, 0x0

    move v1, v0

    .line 1
    :goto_0
    array-length v2, p1

    if-ge v1, v2, :cond_1

    .line 2
    aget-object v2, p1, v1

    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return v1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v0
.end method

.method private static varargs map(Landroidx/constraintlayout/core/motion/utils/TypedBundle;ILjava/lang/String;[Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x0

    .line 3
    :goto_0
    array-length v1, p3

    if-ge v0, v1, :cond_1

    .line 4
    aget-object v1, p3, v0

    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 5
    invoke-virtual {p0, p1, v0}, Landroidx/constraintlayout/core/motion/utils/TypedBundle;->add(II)V

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static parse(Landroidx/constraintlayout/core/parser/CLObject;Landroidx/constraintlayout/core/state/Transition;)V
    .locals 10
    .param p0    # Landroidx/constraintlayout/core/parser/CLObject;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Landroidx/constraintlayout/core/state/Transition;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/RestrictTo;
        value = {
            .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY_GROUP:Landroidx/annotation/RestrictTo$Scope;
        }
    .end annotation

    .line 2
    invoke-virtual {p1}, Landroidx/constraintlayout/core/state/Transition;->resetProperties()V

    .line 3
    const-string/jumbo v0, "pathMotionArc"

    invoke-virtual {p0, v0}, Landroidx/constraintlayout/core/parser/CLContainer;->getStringOrNull(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 4
    new-instance v1, Landroidx/constraintlayout/core/motion/utils/TypedBundle;

    invoke-direct {v1}, Landroidx/constraintlayout/core/motion/utils/TypedBundle;-><init>()V

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v0, :cond_6

    .line 5
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v4

    const/4 v5, 0x5

    const/4 v6, 0x4

    const/4 v7, 0x3

    const/4 v8, 0x2

    const/4 v9, -0x1

    sparse-switch v4, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v4, "below"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    move v9, v5

    goto :goto_0

    :sswitch_1
    const-string v4, "above"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    move v9, v6

    goto :goto_0

    :sswitch_2
    const-string v4, "none"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    move v9, v7

    goto :goto_0

    :sswitch_3
    const-string v4, "flip"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    move v9, v8

    goto :goto_0

    :sswitch_4
    const-string/jumbo v4, "startHorizontal"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    move v9, v2

    goto :goto_0

    :sswitch_5
    const-string/jumbo v4, "startVertical"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_0

    :cond_5
    move v9, v3

    :goto_0
    const/16 v0, 0x1fd

    packed-switch v9, :pswitch_data_0

    goto :goto_1

    .line 6
    :pswitch_0
    invoke-virtual {v1, v0, v6}, Landroidx/constraintlayout/core/motion/utils/TypedBundle;->add(II)V

    goto :goto_1

    .line 7
    :pswitch_1
    invoke-virtual {v1, v0, v5}, Landroidx/constraintlayout/core/motion/utils/TypedBundle;->add(II)V

    goto :goto_1

    .line 8
    :pswitch_2
    invoke-virtual {v1, v0, v3}, Landroidx/constraintlayout/core/motion/utils/TypedBundle;->add(II)V

    goto :goto_1

    .line 9
    :pswitch_3
    invoke-virtual {v1, v0, v7}, Landroidx/constraintlayout/core/motion/utils/TypedBundle;->add(II)V

    goto :goto_1

    .line 10
    :pswitch_4
    invoke-virtual {v1, v0, v8}, Landroidx/constraintlayout/core/motion/utils/TypedBundle;->add(II)V

    goto :goto_1

    .line 11
    :pswitch_5
    invoke-virtual {v1, v0, v2}, Landroidx/constraintlayout/core/motion/utils/TypedBundle;->add(II)V

    :goto_1
    move v3, v2

    .line 12
    :cond_6
    const-string v0, "interpolator"

    invoke-virtual {p0, v0}, Landroidx/constraintlayout/core/parser/CLContainer;->getStringOrNull(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_7

    const/16 v3, 0x2c1

    .line 13
    invoke-virtual {v1, v3, v0}, Landroidx/constraintlayout/core/motion/utils/TypedBundle;->add(ILjava/lang/String;)V

    move v3, v2

    .line 14
    :cond_7
    const-string/jumbo v0, "staggered"

    invoke-virtual {p0, v0}, Landroidx/constraintlayout/core/parser/CLContainer;->getFloatOrNaN(Ljava/lang/String;)F

    move-result v0

    .line 15
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v4

    if-nez v4, :cond_8

    const/16 v3, 0x2c2

    .line 16
    invoke-virtual {v1, v3, v0}, Landroidx/constraintlayout/core/motion/utils/TypedBundle;->add(IF)V

    goto :goto_2

    :cond_8
    move v2, v3

    :goto_2
    if-eqz v2, :cond_9

    .line 17
    invoke-virtual {p1, v1}, Landroidx/constraintlayout/core/state/Transition;->setTransitionProperties(Landroidx/constraintlayout/core/motion/utils/TypedBundle;)V

    .line 18
    :cond_9
    const-string/jumbo v0, "onSwipe"

    invoke-virtual {p0, v0}, Landroidx/constraintlayout/core/parser/CLContainer;->getObjectOrNull(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLObject;

    move-result-object v0

    if-eqz v0, :cond_a

    .line 19
    invoke-static {v0, p1}, Landroidx/constraintlayout/core/state/TransitionParser;->parseOnSwipe(Landroidx/constraintlayout/core/parser/CLContainer;Landroidx/constraintlayout/core/state/Transition;)V

    .line 20
    :cond_a
    invoke-static {p0, p1}, Landroidx/constraintlayout/core/state/TransitionParser;->parseKeyFrames(Landroidx/constraintlayout/core/parser/CLObject;Landroidx/constraintlayout/core/state/Transition;)V

    return-void

    :sswitch_data_0
    .sparse-switch
        -0x6eaff208 -> :sswitch_5
        -0x3c0665da -> :sswitch_4
        0x30006d -> :sswitch_3
        0x33af38 -> :sswitch_2
        0x585239d -> :sswitch_1
        0x5948c31 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static parse(Landroidx/constraintlayout/core/parser/CLObject;Landroidx/constraintlayout/core/state/Transition;Landroidx/constraintlayout/core/state/CorePixelDp;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-static {p0, p1}, Landroidx/constraintlayout/core/state/TransitionParser;->parse(Landroidx/constraintlayout/core/parser/CLObject;Landroidx/constraintlayout/core/state/Transition;)V

    return-void
.end method

.method private static parseKeyAttribute(Landroidx/constraintlayout/core/parser/CLObject;Landroidx/constraintlayout/core/state/Transition;)V
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const-string/jumbo v2, "target"

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v2}, Landroidx/constraintlayout/core/parser/CLContainer;->getArrayOrNull(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLArray;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    if-nez v2, :cond_0

    .line 13
    .line 14
    goto/16 :goto_11

    .line 15
    .line 16
    :cond_0
    const-string v3, "frames"

    .line 17
    .line 18
    invoke-virtual {v0, v3}, Landroidx/constraintlayout/core/parser/CLContainer;->getArrayOrNull(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLArray;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    if-nez v3, :cond_1

    .line 23
    .line 24
    goto/16 :goto_11

    .line 25
    .line 26
    :cond_1
    const-string/jumbo v4, "transitionEasing"

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v4}, Landroidx/constraintlayout/core/parser/CLContainer;->getStringOrNull(Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    const-string/jumbo v12, "rotationZ"

    .line 34
    .line 35
    .line 36
    const-string v13, "alpha"

    .line 37
    .line 38
    const-string/jumbo v5, "scaleX"

    .line 39
    .line 40
    .line 41
    const-string/jumbo v6, "scaleY"

    .line 42
    .line 43
    .line 44
    const-string/jumbo v7, "translationX"

    .line 45
    .line 46
    .line 47
    const-string/jumbo v8, "translationY"

    .line 48
    .line 49
    .line 50
    const-string/jumbo v9, "translationZ"

    .line 51
    .line 52
    .line 53
    const-string/jumbo v10, "rotationX"

    .line 54
    .line 55
    .line 56
    const-string/jumbo v11, "rotationY"

    .line 57
    .line 58
    .line 59
    filled-new-array/range {v5 .. v13}, [Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v5

    .line 63
    const/16 v6, 0x9

    .line 64
    .line 65
    new-array v7, v6, [I

    .line 66
    .line 67
    fill-array-data v7, :array_0

    .line 68
    .line 69
    .line 70
    new-array v8, v6, [Z

    .line 71
    .line 72
    fill-array-data v8, :array_1

    .line 73
    .line 74
    .line 75
    invoke-virtual {v3}, Landroidx/constraintlayout/core/parser/CLContainer;->size()I

    .line 76
    .line 77
    .line 78
    move-result v9

    .line 79
    new-array v10, v9, [Landroidx/constraintlayout/core/motion/utils/TypedBundle;

    .line 80
    .line 81
    const/4 v12, 0x0

    .line 82
    :goto_0
    invoke-virtual {v3}, Landroidx/constraintlayout/core/parser/CLContainer;->size()I

    .line 83
    .line 84
    .line 85
    move-result v13

    .line 86
    if-ge v12, v13, :cond_2

    .line 87
    .line 88
    new-instance v13, Landroidx/constraintlayout/core/motion/utils/TypedBundle;

    .line 89
    .line 90
    invoke-direct {v13}, Landroidx/constraintlayout/core/motion/utils/TypedBundle;-><init>()V

    .line 91
    .line 92
    .line 93
    aput-object v13, v10, v12

    .line 94
    .line 95
    add-int/lit8 v12, v12, 0x1

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_2
    const/4 v12, 0x0

    .line 99
    :goto_1
    if-ge v12, v6, :cond_a

    .line 100
    .line 101
    aget-object v13, v5, v12

    .line 102
    .line 103
    aget v14, v7, v12

    .line 104
    .line 105
    aget-boolean v15, v8, v12

    .line 106
    .line 107
    invoke-virtual {v0, v13}, Landroidx/constraintlayout/core/parser/CLContainer;->getArrayOrNull(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLArray;

    .line 108
    .line 109
    .line 110
    move-result-object v6

    .line 111
    const/16 v16, 0x0

    .line 112
    .line 113
    if-eqz v6, :cond_4

    .line 114
    .line 115
    invoke-virtual {v6}, Landroidx/constraintlayout/core/parser/CLContainer;->size()I

    .line 116
    .line 117
    .line 118
    move-result v11

    .line 119
    if-ne v11, v9, :cond_3

    .line 120
    .line 121
    goto :goto_2

    .line 122
    :cond_3
    new-instance v1, Landroidx/constraintlayout/core/parser/CLParsingException;

    .line 123
    .line 124
    new-instance v2, Ljava/lang/StringBuilder;

    .line 125
    .line 126
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 127
    .line 128
    .line 129
    const-string v3, "incorrect size for "

    .line 130
    .line 131
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    const-string v3, " array, not matching targets array!"

    .line 138
    .line 139
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    invoke-direct {v1, v2, v0}, Landroidx/constraintlayout/core/parser/CLParsingException;-><init>(Ljava/lang/String;Landroidx/constraintlayout/core/parser/CLElement;)V

    .line 147
    .line 148
    .line 149
    throw v1

    .line 150
    :cond_4
    :goto_2
    if-eqz v6, :cond_7

    .line 151
    .line 152
    move/from16 v11, v16

    .line 153
    .line 154
    :goto_3
    if-ge v11, v9, :cond_6

    .line 155
    .line 156
    invoke-virtual {v6, v11}, Landroidx/constraintlayout/core/parser/CLContainer;->getFloat(I)F

    .line 157
    .line 158
    .line 159
    move-result v13

    .line 160
    move-object/from16 v17, v5

    .line 161
    .line 162
    if-eqz v15, :cond_5

    .line 163
    .line 164
    iget-object v5, v1, Landroidx/constraintlayout/core/state/Transition;->mToPixel:Landroidx/constraintlayout/core/state/CorePixelDp;

    .line 165
    .line 166
    invoke-interface {v5, v13}, Landroidx/constraintlayout/core/state/CorePixelDp;->toPixels(F)F

    .line 167
    .line 168
    .line 169
    move-result v13

    .line 170
    :cond_5
    aget-object v5, v10, v11

    .line 171
    .line 172
    invoke-virtual {v5, v14, v13}, Landroidx/constraintlayout/core/motion/utils/TypedBundle;->add(IF)V

    .line 173
    .line 174
    .line 175
    add-int/lit8 v11, v11, 0x1

    .line 176
    .line 177
    move-object/from16 v5, v17

    .line 178
    .line 179
    goto :goto_3

    .line 180
    :cond_6
    move-object/from16 v17, v5

    .line 181
    .line 182
    goto :goto_5

    .line 183
    :cond_7
    move-object/from16 v17, v5

    .line 184
    .line 185
    invoke-virtual {v0, v13}, Landroidx/constraintlayout/core/parser/CLContainer;->getFloatOrNaN(Ljava/lang/String;)F

    .line 186
    .line 187
    .line 188
    move-result v5

    .line 189
    invoke-static {v5}, Ljava/lang/Float;->isNaN(F)Z

    .line 190
    .line 191
    .line 192
    move-result v6

    .line 193
    if-nez v6, :cond_9

    .line 194
    .line 195
    if-eqz v15, :cond_8

    .line 196
    .line 197
    iget-object v6, v1, Landroidx/constraintlayout/core/state/Transition;->mToPixel:Landroidx/constraintlayout/core/state/CorePixelDp;

    .line 198
    .line 199
    invoke-interface {v6, v5}, Landroidx/constraintlayout/core/state/CorePixelDp;->toPixels(F)F

    .line 200
    .line 201
    .line 202
    move-result v5

    .line 203
    :cond_8
    move/from16 v6, v16

    .line 204
    .line 205
    :goto_4
    if-ge v6, v9, :cond_9

    .line 206
    .line 207
    aget-object v11, v10, v6

    .line 208
    .line 209
    invoke-virtual {v11, v14, v5}, Landroidx/constraintlayout/core/motion/utils/TypedBundle;->add(IF)V

    .line 210
    .line 211
    .line 212
    add-int/lit8 v6, v6, 0x1

    .line 213
    .line 214
    goto :goto_4

    .line 215
    :cond_9
    :goto_5
    add-int/lit8 v12, v12, 0x1

    .line 216
    .line 217
    move-object/from16 v5, v17

    .line 218
    .line 219
    const/16 v6, 0x9

    .line 220
    .line 221
    goto :goto_1

    .line 222
    :cond_a
    const/16 v16, 0x0

    .line 223
    .line 224
    const-string v5, "custom"

    .line 225
    .line 226
    invoke-virtual {v0, v5}, Landroidx/constraintlayout/core/parser/CLContainer;->getOrNull(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLElement;

    .line 227
    .line 228
    .line 229
    move-result-object v5

    .line 230
    if-eqz v5, :cond_11

    .line 231
    .line 232
    instance-of v7, v5, Landroidx/constraintlayout/core/parser/CLObject;

    .line 233
    .line 234
    if-eqz v7, :cond_11

    .line 235
    .line 236
    check-cast v5, Landroidx/constraintlayout/core/parser/CLObject;

    .line 237
    .line 238
    invoke-virtual {v5}, Landroidx/constraintlayout/core/parser/CLContainer;->size()I

    .line 239
    .line 240
    .line 241
    move-result v7

    .line 242
    invoke-virtual {v3}, Landroidx/constraintlayout/core/parser/CLContainer;->size()I

    .line 243
    .line 244
    .line 245
    move-result v8

    .line 246
    const/4 v11, 0x2

    .line 247
    new-array v11, v11, [I

    .line 248
    .line 249
    const/4 v12, 0x1

    .line 250
    aput v7, v11, v12

    .line 251
    .line 252
    aput v8, v11, v16

    .line 253
    .line 254
    const-class v8, Landroidx/constraintlayout/core/motion/CustomVariable;

    .line 255
    .line 256
    invoke-static {v8, v11}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v8

    .line 260
    check-cast v8, [[Landroidx/constraintlayout/core/motion/CustomVariable;

    .line 261
    .line 262
    move/from16 v11, v16

    .line 263
    .line 264
    :goto_6
    if-ge v11, v7, :cond_12

    .line 265
    .line 266
    invoke-virtual {v5, v11}, Landroidx/constraintlayout/core/parser/CLContainer;->get(I)Landroidx/constraintlayout/core/parser/CLElement;

    .line 267
    .line 268
    .line 269
    move-result-object v12

    .line 270
    check-cast v12, Landroidx/constraintlayout/core/parser/CLKey;

    .line 271
    .line 272
    invoke-virtual {v12}, Landroidx/constraintlayout/core/parser/CLElement;->content()Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object v13

    .line 276
    invoke-virtual {v12}, Landroidx/constraintlayout/core/parser/CLKey;->getValue()Landroidx/constraintlayout/core/parser/CLElement;

    .line 277
    .line 278
    .line 279
    move-result-object v14

    .line 280
    instance-of v14, v14, Landroidx/constraintlayout/core/parser/CLArray;

    .line 281
    .line 282
    const-wide/16 v17, -0x1

    .line 283
    .line 284
    const/16 v6, 0x385

    .line 285
    .line 286
    if-eqz v14, :cond_f

    .line 287
    .line 288
    invoke-virtual {v12}, Landroidx/constraintlayout/core/parser/CLKey;->getValue()Landroidx/constraintlayout/core/parser/CLElement;

    .line 289
    .line 290
    .line 291
    move-result-object v12

    .line 292
    check-cast v12, Landroidx/constraintlayout/core/parser/CLArray;

    .line 293
    .line 294
    invoke-virtual {v12}, Landroidx/constraintlayout/core/parser/CLContainer;->size()I

    .line 295
    .line 296
    .line 297
    move-result v14

    .line 298
    if-ne v14, v9, :cond_b

    .line 299
    .line 300
    if-lez v14, :cond_b

    .line 301
    .line 302
    move/from16 v14, v16

    .line 303
    .line 304
    invoke-virtual {v12, v14}, Landroidx/constraintlayout/core/parser/CLContainer;->get(I)Landroidx/constraintlayout/core/parser/CLElement;

    .line 305
    .line 306
    .line 307
    move-result-object v15

    .line 308
    instance-of v15, v15, Landroidx/constraintlayout/core/parser/CLNumber;

    .line 309
    .line 310
    if-eqz v15, :cond_c

    .line 311
    .line 312
    move v15, v14

    .line 313
    :goto_7
    if-ge v15, v9, :cond_b

    .line 314
    .line 315
    aget-object v16, v8, v15

    .line 316
    .line 317
    new-instance v14, Landroidx/constraintlayout/core/motion/CustomVariable;

    .line 318
    .line 319
    invoke-virtual {v12, v15}, Landroidx/constraintlayout/core/parser/CLContainer;->get(I)Landroidx/constraintlayout/core/parser/CLElement;

    .line 320
    .line 321
    .line 322
    move-result-object v17

    .line 323
    move-object/from16 v19, v5

    .line 324
    .line 325
    invoke-virtual/range {v17 .. v17}, Landroidx/constraintlayout/core/parser/CLElement;->getFloat()F

    .line 326
    .line 327
    .line 328
    move-result v5

    .line 329
    invoke-direct {v14, v13, v6, v5}, Landroidx/constraintlayout/core/motion/CustomVariable;-><init>(Ljava/lang/String;IF)V

    .line 330
    .line 331
    .line 332
    aput-object v14, v16, v11

    .line 333
    .line 334
    add-int/lit8 v15, v15, 0x1

    .line 335
    .line 336
    move-object/from16 v5, v19

    .line 337
    .line 338
    const/4 v14, 0x0

    .line 339
    goto :goto_7

    .line 340
    :cond_b
    move-object/from16 v19, v5

    .line 341
    .line 342
    goto :goto_a

    .line 343
    :cond_c
    move-object/from16 v19, v5

    .line 344
    .line 345
    const/4 v5, 0x0

    .line 346
    :goto_8
    if-ge v5, v9, :cond_e

    .line 347
    .line 348
    invoke-virtual {v12, v5}, Landroidx/constraintlayout/core/parser/CLContainer;->get(I)Landroidx/constraintlayout/core/parser/CLElement;

    .line 349
    .line 350
    .line 351
    move-result-object v6

    .line 352
    invoke-virtual {v6}, Landroidx/constraintlayout/core/parser/CLElement;->content()Ljava/lang/String;

    .line 353
    .line 354
    .line 355
    move-result-object v6

    .line 356
    invoke-static {v6}, Landroidx/constraintlayout/core/state/ConstraintSetParser;->parseColorString(Ljava/lang/String;)J

    .line 357
    .line 358
    .line 359
    move-result-wide v14

    .line 360
    cmp-long v6, v14, v17

    .line 361
    .line 362
    if-eqz v6, :cond_d

    .line 363
    .line 364
    aget-object v6, v8, v5

    .line 365
    .line 366
    move/from16 v20, v5

    .line 367
    .line 368
    new-instance v5, Landroidx/constraintlayout/core/motion/CustomVariable;

    .line 369
    .line 370
    long-to-int v14, v14

    .line 371
    const/16 v15, 0x386

    .line 372
    .line 373
    invoke-direct {v5, v13, v15, v14}, Landroidx/constraintlayout/core/motion/CustomVariable;-><init>(Ljava/lang/String;II)V

    .line 374
    .line 375
    .line 376
    aput-object v5, v6, v11

    .line 377
    .line 378
    goto :goto_9

    .line 379
    :cond_d
    move/from16 v20, v5

    .line 380
    .line 381
    :goto_9
    add-int/lit8 v5, v20, 0x1

    .line 382
    .line 383
    goto :goto_8

    .line 384
    :cond_e
    :goto_a
    move/from16 v17, v7

    .line 385
    .line 386
    goto :goto_d

    .line 387
    :cond_f
    move-object/from16 v19, v5

    .line 388
    .line 389
    invoke-virtual {v12}, Landroidx/constraintlayout/core/parser/CLKey;->getValue()Landroidx/constraintlayout/core/parser/CLElement;

    .line 390
    .line 391
    .line 392
    move-result-object v5

    .line 393
    instance-of v12, v5, Landroidx/constraintlayout/core/parser/CLNumber;

    .line 394
    .line 395
    if-eqz v12, :cond_10

    .line 396
    .line 397
    invoke-virtual {v5}, Landroidx/constraintlayout/core/parser/CLElement;->getFloat()F

    .line 398
    .line 399
    .line 400
    move-result v5

    .line 401
    const/4 v12, 0x0

    .line 402
    :goto_b
    if-ge v12, v9, :cond_e

    .line 403
    .line 404
    aget-object v14, v8, v12

    .line 405
    .line 406
    new-instance v15, Landroidx/constraintlayout/core/motion/CustomVariable;

    .line 407
    .line 408
    invoke-direct {v15, v13, v6, v5}, Landroidx/constraintlayout/core/motion/CustomVariable;-><init>(Ljava/lang/String;IF)V

    .line 409
    .line 410
    .line 411
    aput-object v15, v14, v11

    .line 412
    .line 413
    add-int/lit8 v12, v12, 0x1

    .line 414
    .line 415
    goto :goto_b

    .line 416
    :cond_10
    invoke-virtual {v5}, Landroidx/constraintlayout/core/parser/CLElement;->content()Ljava/lang/String;

    .line 417
    .line 418
    .line 419
    move-result-object v5

    .line 420
    invoke-static {v5}, Landroidx/constraintlayout/core/state/ConstraintSetParser;->parseColorString(Ljava/lang/String;)J

    .line 421
    .line 422
    .line 423
    move-result-wide v5

    .line 424
    cmp-long v12, v5, v17

    .line 425
    .line 426
    if-eqz v12, :cond_e

    .line 427
    .line 428
    const/4 v12, 0x0

    .line 429
    :goto_c
    if-ge v12, v9, :cond_e

    .line 430
    .line 431
    aget-object v14, v8, v12

    .line 432
    .line 433
    new-instance v15, Landroidx/constraintlayout/core/motion/CustomVariable;

    .line 434
    .line 435
    move/from16 v17, v7

    .line 436
    .line 437
    long-to-int v7, v5

    .line 438
    move-wide/from16 v20, v5

    .line 439
    .line 440
    const/16 v5, 0x386

    .line 441
    .line 442
    invoke-direct {v15, v13, v5, v7}, Landroidx/constraintlayout/core/motion/CustomVariable;-><init>(Ljava/lang/String;II)V

    .line 443
    .line 444
    .line 445
    aput-object v15, v14, v11

    .line 446
    .line 447
    add-int/lit8 v12, v12, 0x1

    .line 448
    .line 449
    move/from16 v7, v17

    .line 450
    .line 451
    move-wide/from16 v5, v20

    .line 452
    .line 453
    goto :goto_c

    .line 454
    :goto_d
    add-int/lit8 v11, v11, 0x1

    .line 455
    .line 456
    move/from16 v7, v17

    .line 457
    .line 458
    move-object/from16 v5, v19

    .line 459
    .line 460
    const/16 v16, 0x0

    .line 461
    .line 462
    goto/16 :goto_6

    .line 463
    .line 464
    :cond_11
    const/4 v8, 0x0

    .line 465
    :cond_12
    const-string v5, "curveFit"

    .line 466
    .line 467
    invoke-virtual {v0, v5}, Landroidx/constraintlayout/core/parser/CLContainer;->getStringOrNull(Ljava/lang/String;)Ljava/lang/String;

    .line 468
    .line 469
    .line 470
    move-result-object v0

    .line 471
    const/4 v5, 0x0

    .line 472
    :goto_e
    invoke-virtual {v2}, Landroidx/constraintlayout/core/parser/CLContainer;->size()I

    .line 473
    .line 474
    .line 475
    move-result v6

    .line 476
    if-ge v5, v6, :cond_16

    .line 477
    .line 478
    const/4 v6, 0x0

    .line 479
    :goto_f
    if-ge v6, v9, :cond_15

    .line 480
    .line 481
    invoke-virtual {v2, v5}, Landroidx/constraintlayout/core/parser/CLContainer;->getString(I)Ljava/lang/String;

    .line 482
    .line 483
    .line 484
    move-result-object v7

    .line 485
    aget-object v11, v10, v6

    .line 486
    .line 487
    if-eqz v0, :cond_13

    .line 488
    .line 489
    const-string/jumbo v12, "spline"

    .line 490
    .line 491
    .line 492
    const-string v13, "linear"

    .line 493
    .line 494
    filled-new-array {v12, v13}, [Ljava/lang/String;

    .line 495
    .line 496
    .line 497
    move-result-object v12

    .line 498
    invoke-static {v0, v12}, Landroidx/constraintlayout/core/state/TransitionParser;->map(Ljava/lang/String;[Ljava/lang/String;)I

    .line 499
    .line 500
    .line 501
    move-result v12

    .line 502
    const/16 v13, 0x1fc

    .line 503
    .line 504
    invoke-virtual {v11, v13, v12}, Landroidx/constraintlayout/core/motion/utils/TypedBundle;->add(II)V

    .line 505
    .line 506
    .line 507
    :cond_13
    const/16 v12, 0x1f5

    .line 508
    .line 509
    invoke-virtual {v11, v12, v4}, Landroidx/constraintlayout/core/motion/utils/TypedBundle;->addIfNotNull(ILjava/lang/String;)V

    .line 510
    .line 511
    .line 512
    invoke-virtual {v3, v6}, Landroidx/constraintlayout/core/parser/CLContainer;->getInt(I)I

    .line 513
    .line 514
    .line 515
    move-result v12

    .line 516
    const/16 v13, 0x64

    .line 517
    .line 518
    invoke-virtual {v11, v13, v12}, Landroidx/constraintlayout/core/motion/utils/TypedBundle;->add(II)V

    .line 519
    .line 520
    .line 521
    if-eqz v8, :cond_14

    .line 522
    .line 523
    aget-object v12, v8, v6

    .line 524
    .line 525
    goto :goto_10

    .line 526
    :cond_14
    const/4 v12, 0x0

    .line 527
    :goto_10
    invoke-virtual {v1, v7, v11, v12}, Landroidx/constraintlayout/core/state/Transition;->addKeyAttribute(Ljava/lang/String;Landroidx/constraintlayout/core/motion/utils/TypedBundle;[Landroidx/constraintlayout/core/motion/CustomVariable;)V

    .line 528
    .line 529
    .line 530
    add-int/lit8 v6, v6, 0x1

    .line 531
    .line 532
    goto :goto_f

    .line 533
    :cond_15
    add-int/lit8 v5, v5, 0x1

    .line 534
    .line 535
    goto :goto_e

    .line 536
    :cond_16
    :goto_11
    return-void

    .line 537
    :array_0
    .array-data 4
        0x137
        0x138
        0x130
        0x131
        0x132
        0x134
        0x135
        0x136
        0x12f
    .end array-data

    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    :array_1
    .array-data 1
        0x0t
        0x0t
        0x1t
        0x1t
        0x1t
        0x0t
        0x0t
        0x0t
        0x0t
    .end array-data
.end method

.method private static parseKeyCycle(Landroidx/constraintlayout/core/parser/CLObject;Landroidx/constraintlayout/core/state/Transition;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const-string/jumbo v2, "target"

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v2}, Landroidx/constraintlayout/core/parser/CLContainer;->getArray(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLArray;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    const-string v3, "frames"

    .line 13
    .line 14
    invoke-virtual {v0, v3}, Landroidx/constraintlayout/core/parser/CLContainer;->getArray(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLArray;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    const-string/jumbo v4, "transitionEasing"

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v4}, Landroidx/constraintlayout/core/parser/CLContainer;->getStringOrNull(Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    const-string v15, "offset"

    .line 26
    .line 27
    const-string/jumbo v16, "phase"

    .line 28
    .line 29
    .line 30
    const-string/jumbo v5, "scaleX"

    .line 31
    .line 32
    .line 33
    const-string/jumbo v6, "scaleY"

    .line 34
    .line 35
    .line 36
    const-string/jumbo v7, "translationX"

    .line 37
    .line 38
    .line 39
    const-string/jumbo v8, "translationY"

    .line 40
    .line 41
    .line 42
    const-string/jumbo v9, "translationZ"

    .line 43
    .line 44
    .line 45
    const-string/jumbo v10, "rotationX"

    .line 46
    .line 47
    .line 48
    const-string/jumbo v11, "rotationY"

    .line 49
    .line 50
    .line 51
    const-string/jumbo v12, "rotationZ"

    .line 52
    .line 53
    .line 54
    const-string v13, "alpha"

    .line 55
    .line 56
    const-string/jumbo v14, "period"

    .line 57
    .line 58
    .line 59
    filled-new-array/range {v5 .. v16}, [Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v5

    .line 63
    const/16 v6, 0xc

    .line 64
    .line 65
    new-array v7, v6, [I

    .line 66
    .line 67
    fill-array-data v7, :array_0

    .line 68
    .line 69
    .line 70
    new-array v8, v6, [I

    .line 71
    .line 72
    fill-array-data v8, :array_1

    .line 73
    .line 74
    .line 75
    invoke-virtual {v3}, Landroidx/constraintlayout/core/parser/CLContainer;->size()I

    .line 76
    .line 77
    .line 78
    move-result v9

    .line 79
    new-array v10, v9, [Landroidx/constraintlayout/core/motion/utils/TypedBundle;

    .line 80
    .line 81
    const/4 v12, 0x0

    .line 82
    :goto_0
    if-ge v12, v9, :cond_0

    .line 83
    .line 84
    new-instance v13, Landroidx/constraintlayout/core/motion/utils/TypedBundle;

    .line 85
    .line 86
    invoke-direct {v13}, Landroidx/constraintlayout/core/motion/utils/TypedBundle;-><init>()V

    .line 87
    .line 88
    .line 89
    aput-object v13, v10, v12

    .line 90
    .line 91
    add-int/lit8 v12, v12, 0x1

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_0
    const/4 v12, 0x0

    .line 95
    const/4 v13, 0x0

    .line 96
    :goto_1
    const/4 v14, 0x1

    .line 97
    if-ge v12, v6, :cond_2

    .line 98
    .line 99
    aget-object v15, v5, v12

    .line 100
    .line 101
    invoke-virtual {v0, v15}, Landroidx/constraintlayout/core/parser/CLContainer;->has(Ljava/lang/String;)Z

    .line 102
    .line 103
    .line 104
    move-result v15

    .line 105
    if-eqz v15, :cond_1

    .line 106
    .line 107
    aget v15, v8, v12

    .line 108
    .line 109
    if-ne v15, v14, :cond_1

    .line 110
    .line 111
    move v13, v14

    .line 112
    :cond_1
    add-int/lit8 v12, v12, 0x1

    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_2
    const/4 v12, 0x0

    .line 116
    :goto_2
    if-ge v12, v6, :cond_c

    .line 117
    .line 118
    aget-object v15, v5, v12

    .line 119
    .line 120
    aget v6, v7, v12

    .line 121
    .line 122
    aget v11, v8, v12

    .line 123
    .line 124
    invoke-virtual {v0, v15}, Landroidx/constraintlayout/core/parser/CLContainer;->getArrayOrNull(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLArray;

    .line 125
    .line 126
    .line 127
    move-result-object v14

    .line 128
    move-object/from16 v17, v5

    .line 129
    .line 130
    if-eqz v14, :cond_4

    .line 131
    .line 132
    invoke-virtual {v14}, Landroidx/constraintlayout/core/parser/CLContainer;->size()I

    .line 133
    .line 134
    .line 135
    move-result v5

    .line 136
    if-ne v5, v9, :cond_3

    .line 137
    .line 138
    goto :goto_3

    .line 139
    :cond_3
    new-instance v1, Landroidx/constraintlayout/core/parser/CLParsingException;

    .line 140
    .line 141
    const-string v2, "incorrect size for $attrName array, not matching targets array!"

    .line 142
    .line 143
    invoke-direct {v1, v2, v0}, Landroidx/constraintlayout/core/parser/CLParsingException;-><init>(Ljava/lang/String;Landroidx/constraintlayout/core/parser/CLElement;)V

    .line 144
    .line 145
    .line 146
    throw v1

    .line 147
    :cond_4
    :goto_3
    if-eqz v14, :cond_8

    .line 148
    .line 149
    const/4 v15, 0x0

    .line 150
    :goto_4
    if-ge v15, v9, :cond_7

    .line 151
    .line 152
    invoke-virtual {v14, v15}, Landroidx/constraintlayout/core/parser/CLContainer;->getFloat(I)F

    .line 153
    .line 154
    .line 155
    move-result v5

    .line 156
    move-object/from16 v18, v7

    .line 157
    .line 158
    const/4 v7, 0x1

    .line 159
    if-ne v11, v7, :cond_5

    .line 160
    .line 161
    iget-object v7, v1, Landroidx/constraintlayout/core/state/Transition;->mToPixel:Landroidx/constraintlayout/core/state/CorePixelDp;

    .line 162
    .line 163
    invoke-interface {v7, v5}, Landroidx/constraintlayout/core/state/CorePixelDp;->toPixels(F)F

    .line 164
    .line 165
    .line 166
    move-result v5

    .line 167
    goto :goto_5

    .line 168
    :cond_5
    const/4 v7, 0x2

    .line 169
    if-ne v11, v7, :cond_6

    .line 170
    .line 171
    if-eqz v13, :cond_6

    .line 172
    .line 173
    iget-object v7, v1, Landroidx/constraintlayout/core/state/Transition;->mToPixel:Landroidx/constraintlayout/core/state/CorePixelDp;

    .line 174
    .line 175
    invoke-interface {v7, v5}, Landroidx/constraintlayout/core/state/CorePixelDp;->toPixels(F)F

    .line 176
    .line 177
    .line 178
    move-result v5

    .line 179
    :cond_6
    :goto_5
    aget-object v7, v10, v15

    .line 180
    .line 181
    invoke-virtual {v7, v6, v5}, Landroidx/constraintlayout/core/motion/utils/TypedBundle;->add(IF)V

    .line 182
    .line 183
    .line 184
    add-int/lit8 v15, v15, 0x1

    .line 185
    .line 186
    move-object/from16 v7, v18

    .line 187
    .line 188
    goto :goto_4

    .line 189
    :cond_7
    move-object/from16 v18, v7

    .line 190
    .line 191
    goto :goto_8

    .line 192
    :cond_8
    move-object/from16 v18, v7

    .line 193
    .line 194
    invoke-virtual {v0, v15}, Landroidx/constraintlayout/core/parser/CLContainer;->getFloatOrNaN(Ljava/lang/String;)F

    .line 195
    .line 196
    .line 197
    move-result v5

    .line 198
    invoke-static {v5}, Ljava/lang/Float;->isNaN(F)Z

    .line 199
    .line 200
    .line 201
    move-result v7

    .line 202
    if-nez v7, :cond_b

    .line 203
    .line 204
    const/4 v7, 0x1

    .line 205
    if-ne v11, v7, :cond_9

    .line 206
    .line 207
    iget-object v7, v1, Landroidx/constraintlayout/core/state/Transition;->mToPixel:Landroidx/constraintlayout/core/state/CorePixelDp;

    .line 208
    .line 209
    invoke-interface {v7, v5}, Landroidx/constraintlayout/core/state/CorePixelDp;->toPixels(F)F

    .line 210
    .line 211
    .line 212
    move-result v5

    .line 213
    goto :goto_6

    .line 214
    :cond_9
    const/4 v7, 0x2

    .line 215
    if-ne v11, v7, :cond_a

    .line 216
    .line 217
    if-eqz v13, :cond_a

    .line 218
    .line 219
    iget-object v7, v1, Landroidx/constraintlayout/core/state/Transition;->mToPixel:Landroidx/constraintlayout/core/state/CorePixelDp;

    .line 220
    .line 221
    invoke-interface {v7, v5}, Landroidx/constraintlayout/core/state/CorePixelDp;->toPixels(F)F

    .line 222
    .line 223
    .line 224
    move-result v5

    .line 225
    :cond_a
    :goto_6
    const/4 v7, 0x0

    .line 226
    :goto_7
    if-ge v7, v9, :cond_b

    .line 227
    .line 228
    aget-object v11, v10, v7

    .line 229
    .line 230
    invoke-virtual {v11, v6, v5}, Landroidx/constraintlayout/core/motion/utils/TypedBundle;->add(IF)V

    .line 231
    .line 232
    .line 233
    add-int/lit8 v7, v7, 0x1

    .line 234
    .line 235
    goto :goto_7

    .line 236
    :cond_b
    :goto_8
    add-int/lit8 v12, v12, 0x1

    .line 237
    .line 238
    move-object/from16 v5, v17

    .line 239
    .line 240
    move-object/from16 v7, v18

    .line 241
    .line 242
    const/16 v6, 0xc

    .line 243
    .line 244
    const/4 v14, 0x1

    .line 245
    goto/16 :goto_2

    .line 246
    .line 247
    :cond_c
    const-string v5, "curveFit"

    .line 248
    .line 249
    invoke-virtual {v0, v5}, Landroidx/constraintlayout/core/parser/CLContainer;->getStringOrNull(Ljava/lang/String;)Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v5

    .line 253
    const-string v6, "easing"

    .line 254
    .line 255
    invoke-virtual {v0, v6}, Landroidx/constraintlayout/core/parser/CLContainer;->getStringOrNull(Ljava/lang/String;)Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object v6

    .line 259
    const-string/jumbo v7, "waveShape"

    .line 260
    .line 261
    .line 262
    invoke-virtual {v0, v7}, Landroidx/constraintlayout/core/parser/CLContainer;->getStringOrNull(Ljava/lang/String;)Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v7

    .line 266
    const-string v8, "customWave"

    .line 267
    .line 268
    invoke-virtual {v0, v8}, Landroidx/constraintlayout/core/parser/CLContainer;->getStringOrNull(Ljava/lang/String;)Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    const/4 v8, 0x0

    .line 273
    :goto_9
    invoke-virtual {v2}, Landroidx/constraintlayout/core/parser/CLContainer;->size()I

    .line 274
    .line 275
    .line 276
    move-result v11

    .line 277
    if-ge v8, v11, :cond_14

    .line 278
    .line 279
    const/4 v11, 0x0

    .line 280
    :goto_a
    if-ge v11, v9, :cond_13

    .line 281
    .line 282
    invoke-virtual {v2, v8}, Landroidx/constraintlayout/core/parser/CLContainer;->getString(I)Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object v12

    .line 286
    aget-object v13, v10, v11

    .line 287
    .line 288
    if-eqz v5, :cond_d

    .line 289
    .line 290
    const-string v14, "linear"

    .line 291
    .line 292
    invoke-virtual {v5, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 293
    .line 294
    .line 295
    move-result v14

    .line 296
    const/16 v15, 0x191

    .line 297
    .line 298
    if-nez v14, :cond_f

    .line 299
    .line 300
    const-string/jumbo v14, "spline"

    .line 301
    .line 302
    .line 303
    invoke-virtual {v5, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 304
    .line 305
    .line 306
    move-result v14

    .line 307
    if-nez v14, :cond_e

    .line 308
    .line 309
    :cond_d
    :goto_b
    const/4 v14, 0x1

    .line 310
    goto :goto_c

    .line 311
    :cond_e
    const/4 v14, 0x0

    .line 312
    invoke-virtual {v13, v15, v14}, Landroidx/constraintlayout/core/motion/utils/TypedBundle;->add(II)V

    .line 313
    .line 314
    .line 315
    goto :goto_b

    .line 316
    :cond_f
    const/4 v14, 0x1

    .line 317
    invoke-virtual {v13, v15, v14}, Landroidx/constraintlayout/core/motion/utils/TypedBundle;->add(II)V

    .line 318
    .line 319
    .line 320
    :goto_c
    const/16 v15, 0x1f5

    .line 321
    .line 322
    invoke-virtual {v13, v15, v4}, Landroidx/constraintlayout/core/motion/utils/TypedBundle;->addIfNotNull(ILjava/lang/String;)V

    .line 323
    .line 324
    .line 325
    if-eqz v6, :cond_10

    .line 326
    .line 327
    const/16 v15, 0x1a4

    .line 328
    .line 329
    invoke-virtual {v13, v15, v6}, Landroidx/constraintlayout/core/motion/utils/TypedBundle;->add(ILjava/lang/String;)V

    .line 330
    .line 331
    .line 332
    :cond_10
    if-eqz v7, :cond_11

    .line 333
    .line 334
    const/16 v15, 0x1a5

    .line 335
    .line 336
    invoke-virtual {v13, v15, v7}, Landroidx/constraintlayout/core/motion/utils/TypedBundle;->add(ILjava/lang/String;)V

    .line 337
    .line 338
    .line 339
    :cond_11
    if-eqz v0, :cond_12

    .line 340
    .line 341
    const/16 v15, 0x1a6

    .line 342
    .line 343
    invoke-virtual {v13, v15, v0}, Landroidx/constraintlayout/core/motion/utils/TypedBundle;->add(ILjava/lang/String;)V

    .line 344
    .line 345
    .line 346
    :cond_12
    invoke-virtual {v3, v11}, Landroidx/constraintlayout/core/parser/CLContainer;->getInt(I)I

    .line 347
    .line 348
    .line 349
    move-result v15

    .line 350
    const/16 v14, 0x64

    .line 351
    .line 352
    invoke-virtual {v13, v14, v15}, Landroidx/constraintlayout/core/motion/utils/TypedBundle;->add(II)V

    .line 353
    .line 354
    .line 355
    invoke-virtual {v1, v12, v13}, Landroidx/constraintlayout/core/state/Transition;->addKeyCycle(Ljava/lang/String;Landroidx/constraintlayout/core/motion/utils/TypedBundle;)V

    .line 356
    .line 357
    .line 358
    add-int/lit8 v11, v11, 0x1

    .line 359
    .line 360
    goto :goto_a

    .line 361
    :cond_13
    add-int/lit8 v8, v8, 0x1

    .line 362
    .line 363
    goto :goto_9

    .line 364
    :cond_14
    return-void

    .line 365
    :array_0
    .array-data 4
        0x137
        0x138
        0x130
        0x131
        0x132
        0x134
        0x135
        0x136
        0x193
        0x1a7
        0x1a8
        0x1a9
    .end array-data

    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    :array_1
    .array-data 4
        0x0
        0x0
        0x1
        0x1
        0x1
        0x0
        0x0
        0x0
        0x0
        0x0
        0x2
        0x0
    .end array-data
.end method

.method public static parseKeyFrames(Landroidx/constraintlayout/core/parser/CLObject;Landroidx/constraintlayout/core/state/Transition;)V
    .locals 5

    .line 1
    const-string v0, "KeyFrames"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroidx/constraintlayout/core/parser/CLContainer;->getObjectOrNull(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLObject;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    goto :goto_3

    .line 10
    :cond_0
    const-string v0, "KeyPositions"

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Landroidx/constraintlayout/core/parser/CLContainer;->getArrayOrNull(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLArray;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const/4 v1, 0x0

    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    move v2, v1

    .line 20
    :goto_0
    invoke-virtual {v0}, Landroidx/constraintlayout/core/parser/CLContainer;->size()I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-ge v2, v3, :cond_2

    .line 25
    .line 26
    invoke-virtual {v0, v2}, Landroidx/constraintlayout/core/parser/CLContainer;->get(I)Landroidx/constraintlayout/core/parser/CLElement;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    instance-of v4, v3, Landroidx/constraintlayout/core/parser/CLObject;

    .line 31
    .line 32
    if-eqz v4, :cond_1

    .line 33
    .line 34
    check-cast v3, Landroidx/constraintlayout/core/parser/CLObject;

    .line 35
    .line 36
    invoke-static {v3, p1}, Landroidx/constraintlayout/core/state/TransitionParser;->parseKeyPosition(Landroidx/constraintlayout/core/parser/CLObject;Landroidx/constraintlayout/core/state/Transition;)V

    .line 37
    .line 38
    .line 39
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    const-string v0, "KeyAttributes"

    .line 43
    .line 44
    invoke-virtual {p0, v0}, Landroidx/constraintlayout/core/parser/CLContainer;->getArrayOrNull(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLArray;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    if-eqz v0, :cond_4

    .line 49
    .line 50
    move v2, v1

    .line 51
    :goto_1
    invoke-virtual {v0}, Landroidx/constraintlayout/core/parser/CLContainer;->size()I

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    if-ge v2, v3, :cond_4

    .line 56
    .line 57
    invoke-virtual {v0, v2}, Landroidx/constraintlayout/core/parser/CLContainer;->get(I)Landroidx/constraintlayout/core/parser/CLElement;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    instance-of v4, v3, Landroidx/constraintlayout/core/parser/CLObject;

    .line 62
    .line 63
    if-eqz v4, :cond_3

    .line 64
    .line 65
    check-cast v3, Landroidx/constraintlayout/core/parser/CLObject;

    .line 66
    .line 67
    invoke-static {v3, p1}, Landroidx/constraintlayout/core/state/TransitionParser;->parseKeyAttribute(Landroidx/constraintlayout/core/parser/CLObject;Landroidx/constraintlayout/core/state/Transition;)V

    .line 68
    .line 69
    .line 70
    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_4
    const-string v0, "KeyCycles"

    .line 74
    .line 75
    invoke-virtual {p0, v0}, Landroidx/constraintlayout/core/parser/CLContainer;->getArrayOrNull(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLArray;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    if-eqz p0, :cond_6

    .line 80
    .line 81
    :goto_2
    invoke-virtual {p0}, Landroidx/constraintlayout/core/parser/CLContainer;->size()I

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-ge v1, v0, :cond_6

    .line 86
    .line 87
    invoke-virtual {p0, v1}, Landroidx/constraintlayout/core/parser/CLContainer;->get(I)Landroidx/constraintlayout/core/parser/CLElement;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    instance-of v2, v0, Landroidx/constraintlayout/core/parser/CLObject;

    .line 92
    .line 93
    if-eqz v2, :cond_5

    .line 94
    .line 95
    check-cast v0, Landroidx/constraintlayout/core/parser/CLObject;

    .line 96
    .line 97
    invoke-static {v0, p1}, Landroidx/constraintlayout/core/state/TransitionParser;->parseKeyCycle(Landroidx/constraintlayout/core/parser/CLObject;Landroidx/constraintlayout/core/state/Transition;)V

    .line 98
    .line 99
    .line 100
    :cond_5
    add-int/lit8 v1, v1, 0x1

    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_6
    :goto_3
    return-void
.end method

.method private static parseKeyPosition(Landroidx/constraintlayout/core/parser/CLObject;Landroidx/constraintlayout/core/state/Transition;)V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Landroidx/constraintlayout/core/motion/utils/TypedBundle;

    .line 4
    .line 5
    invoke-direct {v1}, Landroidx/constraintlayout/core/motion/utils/TypedBundle;-><init>()V

    .line 6
    .line 7
    .line 8
    const-string/jumbo v2, "target"

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v2}, Landroidx/constraintlayout/core/parser/CLContainer;->getArray(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLArray;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    const-string v3, "frames"

    .line 16
    .line 17
    invoke-virtual {v0, v3}, Landroidx/constraintlayout/core/parser/CLContainer;->getArray(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLArray;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    const-string/jumbo v4, "percentX"

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v4}, Landroidx/constraintlayout/core/parser/CLContainer;->getArrayOrNull(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLArray;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    const-string/jumbo v5, "percentY"

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v5}, Landroidx/constraintlayout/core/parser/CLContainer;->getArrayOrNull(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLArray;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    const-string/jumbo v6, "percentWidth"

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v6}, Landroidx/constraintlayout/core/parser/CLContainer;->getArrayOrNull(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLArray;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    const-string/jumbo v7, "percentHeight"

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v7}, Landroidx/constraintlayout/core/parser/CLContainer;->getArrayOrNull(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLArray;

    .line 46
    .line 47
    .line 48
    move-result-object v7

    .line 49
    const-string/jumbo v8, "pathMotionArc"

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v8}, Landroidx/constraintlayout/core/parser/CLContainer;->getStringOrNull(Ljava/lang/String;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v8

    .line 56
    const-string/jumbo v9, "transitionEasing"

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, v9}, Landroidx/constraintlayout/core/parser/CLContainer;->getStringOrNull(Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v9

    .line 63
    const-string v10, "curveFit"

    .line 64
    .line 65
    invoke-virtual {v0, v10}, Landroidx/constraintlayout/core/parser/CLContainer;->getStringOrNull(Ljava/lang/String;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v10

    .line 69
    const-string/jumbo v11, "type"

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0, v11}, Landroidx/constraintlayout/core/parser/CLContainer;->getStringOrNull(Ljava/lang/String;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    const-string/jumbo v11, "parentRelative"

    .line 77
    .line 78
    .line 79
    if-nez v0, :cond_0

    .line 80
    .line 81
    move-object v0, v11

    .line 82
    :cond_0
    if-eqz v4, :cond_1

    .line 83
    .line 84
    invoke-virtual {v3}, Landroidx/constraintlayout/core/parser/CLContainer;->size()I

    .line 85
    .line 86
    .line 87
    move-result v12

    .line 88
    invoke-virtual {v4}, Landroidx/constraintlayout/core/parser/CLContainer;->size()I

    .line 89
    .line 90
    .line 91
    move-result v13

    .line 92
    if-eq v12, v13, :cond_1

    .line 93
    .line 94
    goto/16 :goto_2

    .line 95
    .line 96
    :cond_1
    if-eqz v5, :cond_2

    .line 97
    .line 98
    invoke-virtual {v3}, Landroidx/constraintlayout/core/parser/CLContainer;->size()I

    .line 99
    .line 100
    .line 101
    move-result v12

    .line 102
    invoke-virtual {v5}, Landroidx/constraintlayout/core/parser/CLContainer;->size()I

    .line 103
    .line 104
    .line 105
    move-result v13

    .line 106
    if-eq v12, v13, :cond_2

    .line 107
    .line 108
    goto/16 :goto_2

    .line 109
    .line 110
    :cond_2
    const/4 v13, 0x0

    .line 111
    :goto_0
    invoke-virtual {v2}, Landroidx/constraintlayout/core/parser/CLContainer;->size()I

    .line 112
    .line 113
    .line 114
    move-result v14

    .line 115
    if-ge v13, v14, :cond_6

    .line 116
    .line 117
    invoke-virtual {v2, v13}, Landroidx/constraintlayout/core/parser/CLContainer;->getString(I)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v14

    .line 121
    const-string v15, "deltaRelative"

    .line 122
    .line 123
    const-string/jumbo v12, "pathRelative"

    .line 124
    .line 125
    .line 126
    filled-new-array {v15, v12, v11}, [Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v12

    .line 130
    invoke-static {v0, v12}, Landroidx/constraintlayout/core/state/TransitionParser;->map(Ljava/lang/String;[Ljava/lang/String;)I

    .line 131
    .line 132
    .line 133
    move-result v12

    .line 134
    invoke-virtual {v1}, Landroidx/constraintlayout/core/motion/utils/TypedBundle;->clear()V

    .line 135
    .line 136
    .line 137
    const/16 v15, 0x1fe

    .line 138
    .line 139
    invoke-virtual {v1, v15, v12}, Landroidx/constraintlayout/core/motion/utils/TypedBundle;->add(II)V

    .line 140
    .line 141
    .line 142
    if-eqz v10, :cond_3

    .line 143
    .line 144
    const-string/jumbo v12, "spline"

    .line 145
    .line 146
    .line 147
    const-string v15, "linear"

    .line 148
    .line 149
    filled-new-array {v12, v15}, [Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v12

    .line 153
    const/16 v15, 0x1fc

    .line 154
    .line 155
    invoke-static {v1, v15, v10, v12}, Landroidx/constraintlayout/core/state/TransitionParser;->map(Landroidx/constraintlayout/core/motion/utils/TypedBundle;ILjava/lang/String;[Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    :cond_3
    const/16 v12, 0x1f5

    .line 159
    .line 160
    invoke-virtual {v1, v12, v9}, Landroidx/constraintlayout/core/motion/utils/TypedBundle;->addIfNotNull(ILjava/lang/String;)V

    .line 161
    .line 162
    .line 163
    if-eqz v8, :cond_4

    .line 164
    .line 165
    const-string v19, "below"

    .line 166
    .line 167
    const-string v20, "above"

    .line 168
    .line 169
    const-string v15, "none"

    .line 170
    .line 171
    const-string/jumbo v16, "startVertical"

    .line 172
    .line 173
    .line 174
    const-string/jumbo v17, "startHorizontal"

    .line 175
    .line 176
    .line 177
    const-string v18, "flip"

    .line 178
    .line 179
    filled-new-array/range {v15 .. v20}, [Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v12

    .line 183
    const/16 v15, 0x1fd

    .line 184
    .line 185
    invoke-static {v1, v15, v8, v12}, Landroidx/constraintlayout/core/state/TransitionParser;->map(Landroidx/constraintlayout/core/motion/utils/TypedBundle;ILjava/lang/String;[Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    :cond_4
    const/4 v12, 0x0

    .line 189
    :goto_1
    invoke-virtual {v3}, Landroidx/constraintlayout/core/parser/CLContainer;->size()I

    .line 190
    .line 191
    .line 192
    move-result v15

    .line 193
    if-ge v12, v15, :cond_5

    .line 194
    .line 195
    invoke-virtual {v3, v12}, Landroidx/constraintlayout/core/parser/CLContainer;->getInt(I)I

    .line 196
    .line 197
    .line 198
    move-result v15

    .line 199
    move-object/from16 v16, v0

    .line 200
    .line 201
    const/16 v0, 0x64

    .line 202
    .line 203
    invoke-virtual {v1, v0, v15}, Landroidx/constraintlayout/core/motion/utils/TypedBundle;->add(II)V

    .line 204
    .line 205
    .line 206
    const/16 v0, 0x1fa

    .line 207
    .line 208
    invoke-static {v1, v0, v4, v12}, Landroidx/constraintlayout/core/state/TransitionParser;->set(Landroidx/constraintlayout/core/motion/utils/TypedBundle;ILandroidx/constraintlayout/core/parser/CLArray;I)V

    .line 209
    .line 210
    .line 211
    const/16 v0, 0x1fb

    .line 212
    .line 213
    invoke-static {v1, v0, v5, v12}, Landroidx/constraintlayout/core/state/TransitionParser;->set(Landroidx/constraintlayout/core/motion/utils/TypedBundle;ILandroidx/constraintlayout/core/parser/CLArray;I)V

    .line 214
    .line 215
    .line 216
    const/16 v0, 0x1f7

    .line 217
    .line 218
    invoke-static {v1, v0, v6, v12}, Landroidx/constraintlayout/core/state/TransitionParser;->set(Landroidx/constraintlayout/core/motion/utils/TypedBundle;ILandroidx/constraintlayout/core/parser/CLArray;I)V

    .line 219
    .line 220
    .line 221
    const/16 v0, 0x1f8

    .line 222
    .line 223
    invoke-static {v1, v0, v7, v12}, Landroidx/constraintlayout/core/state/TransitionParser;->set(Landroidx/constraintlayout/core/motion/utils/TypedBundle;ILandroidx/constraintlayout/core/parser/CLArray;I)V

    .line 224
    .line 225
    .line 226
    move-object/from16 v0, p1

    .line 227
    .line 228
    invoke-virtual {v0, v14, v1}, Landroidx/constraintlayout/core/state/Transition;->addKeyPosition(Ljava/lang/String;Landroidx/constraintlayout/core/motion/utils/TypedBundle;)V

    .line 229
    .line 230
    .line 231
    add-int/lit8 v12, v12, 0x1

    .line 232
    .line 233
    move-object/from16 v0, v16

    .line 234
    .line 235
    goto :goto_1

    .line 236
    :cond_5
    move-object/from16 v16, v0

    .line 237
    .line 238
    move-object/from16 v0, p1

    .line 239
    .line 240
    add-int/lit8 v13, v13, 0x1

    .line 241
    .line 242
    move-object/from16 v0, v16

    .line 243
    .line 244
    goto/16 :goto_0

    .line 245
    .line 246
    :cond_6
    :goto_2
    return-void
.end method

.method private static parseOnSwipe(Landroidx/constraintlayout/core/parser/CLContainer;Landroidx/constraintlayout/core/state/Transition;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-string v1, "anchor"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroidx/constraintlayout/core/parser/CLContainer;->getStringOrNull(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-string/jumbo v2, "side"

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v2}, Landroidx/constraintlayout/core/parser/CLContainer;->getStringOrNull(Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    sget-object v3, Landroidx/constraintlayout/core/state/Transition$OnSwipe;->SIDES:[Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v2, v3}, Landroidx/constraintlayout/core/state/TransitionParser;->map(Ljava/lang/String;[Ljava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    const-string v3, "direction"

    .line 23
    .line 24
    invoke-virtual {v0, v3}, Landroidx/constraintlayout/core/parser/CLContainer;->getStringOrNull(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    sget-object v4, Landroidx/constraintlayout/core/state/Transition$OnSwipe;->DIRECTIONS:[Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v3, v4}, Landroidx/constraintlayout/core/state/TransitionParser;->map(Ljava/lang/String;[Ljava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    const-string/jumbo v4, "scale"

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v4}, Landroidx/constraintlayout/core/parser/CLContainer;->getFloatOrNaN(Ljava/lang/String;)F

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    const-string/jumbo v5, "threshold"

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v5}, Landroidx/constraintlayout/core/parser/CLContainer;->getFloatOrNaN(Ljava/lang/String;)F

    .line 45
    .line 46
    .line 47
    move-result v5

    .line 48
    const-string v6, "maxVelocity"

    .line 49
    .line 50
    invoke-virtual {v0, v6}, Landroidx/constraintlayout/core/parser/CLContainer;->getFloatOrNaN(Ljava/lang/String;)F

    .line 51
    .line 52
    .line 53
    move-result v6

    .line 54
    const-string v7, "maxAccel"

    .line 55
    .line 56
    invoke-virtual {v0, v7}, Landroidx/constraintlayout/core/parser/CLContainer;->getFloatOrNaN(Ljava/lang/String;)F

    .line 57
    .line 58
    .line 59
    move-result v7

    .line 60
    const-string v8, "limitBounds"

    .line 61
    .line 62
    invoke-virtual {v0, v8}, Landroidx/constraintlayout/core/parser/CLContainer;->getStringOrNull(Ljava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v8

    .line 66
    const-string v9, "mode"

    .line 67
    .line 68
    invoke-virtual {v0, v9}, Landroidx/constraintlayout/core/parser/CLContainer;->getStringOrNull(Ljava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v9

    .line 72
    sget-object v10, Landroidx/constraintlayout/core/state/Transition$OnSwipe;->MODE:[Ljava/lang/String;

    .line 73
    .line 74
    invoke-static {v9, v10}, Landroidx/constraintlayout/core/state/TransitionParser;->map(Ljava/lang/String;[Ljava/lang/String;)I

    .line 75
    .line 76
    .line 77
    move-result v9

    .line 78
    const-string/jumbo v10, "touchUp"

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0, v10}, Landroidx/constraintlayout/core/parser/CLContainer;->getStringOrNull(Ljava/lang/String;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v10

    .line 85
    sget-object v11, Landroidx/constraintlayout/core/state/Transition$OnSwipe;->TOUCH_UP:[Ljava/lang/String;

    .line 86
    .line 87
    invoke-static {v10, v11}, Landroidx/constraintlayout/core/state/TransitionParser;->map(Ljava/lang/String;[Ljava/lang/String;)I

    .line 88
    .line 89
    .line 90
    move-result v10

    .line 91
    const-string/jumbo v11, "springMass"

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0, v11}, Landroidx/constraintlayout/core/parser/CLContainer;->getFloatOrNaN(Ljava/lang/String;)F

    .line 95
    .line 96
    .line 97
    move-result v11

    .line 98
    const-string/jumbo v12, "springStiffness"

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0, v12}, Landroidx/constraintlayout/core/parser/CLContainer;->getFloatOrNaN(Ljava/lang/String;)F

    .line 102
    .line 103
    .line 104
    move-result v12

    .line 105
    const-string/jumbo v13, "springDamping"

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0, v13}, Landroidx/constraintlayout/core/parser/CLContainer;->getFloatOrNaN(Ljava/lang/String;)F

    .line 109
    .line 110
    .line 111
    move-result v13

    .line 112
    const-string/jumbo v14, "stopThreshold"

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0, v14}, Landroidx/constraintlayout/core/parser/CLContainer;->getFloatOrNaN(Ljava/lang/String;)F

    .line 116
    .line 117
    .line 118
    move-result v14

    .line 119
    const-string/jumbo v15, "springBoundary"

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0, v15}, Landroidx/constraintlayout/core/parser/CLContainer;->getStringOrNull(Ljava/lang/String;)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v15

    .line 126
    move/from16 v16, v14

    .line 127
    .line 128
    sget-object v14, Landroidx/constraintlayout/core/state/Transition$OnSwipe;->BOUNDARY:[Ljava/lang/String;

    .line 129
    .line 130
    invoke-static {v15, v14}, Landroidx/constraintlayout/core/state/TransitionParser;->map(Ljava/lang/String;[Ljava/lang/String;)I

    .line 131
    .line 132
    .line 133
    move-result v14

    .line 134
    const-string v15, "around"

    .line 135
    .line 136
    invoke-virtual {v0, v15}, Landroidx/constraintlayout/core/parser/CLContainer;->getStringOrNull(Ljava/lang/String;)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    invoke-virtual/range {p1 .. p1}, Landroidx/constraintlayout/core/state/Transition;->createOnSwipe()Landroidx/constraintlayout/core/state/Transition$OnSwipe;

    .line 141
    .line 142
    .line 143
    move-result-object v15

    .line 144
    invoke-virtual {v15, v1}, Landroidx/constraintlayout/core/state/Transition$OnSwipe;->setAnchorId(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v15, v2}, Landroidx/constraintlayout/core/state/Transition$OnSwipe;->setAnchorSide(I)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v15, v3}, Landroidx/constraintlayout/core/state/Transition$OnSwipe;->setDragDirection(I)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v15, v4}, Landroidx/constraintlayout/core/state/Transition$OnSwipe;->setDragScale(F)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v15, v5}, Landroidx/constraintlayout/core/state/Transition$OnSwipe;->setDragThreshold(F)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v15, v6}, Landroidx/constraintlayout/core/state/Transition$OnSwipe;->setMaxVelocity(F)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v15, v7}, Landroidx/constraintlayout/core/state/Transition$OnSwipe;->setMaxAcceleration(F)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v15, v8}, Landroidx/constraintlayout/core/state/Transition$OnSwipe;->setLimitBoundsTo(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v15, v9}, Landroidx/constraintlayout/core/state/Transition$OnSwipe;->setAutoCompleteMode(I)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v15, v10}, Landroidx/constraintlayout/core/state/Transition$OnSwipe;->setOnTouchUp(I)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v15, v11}, Landroidx/constraintlayout/core/state/Transition$OnSwipe;->setSpringMass(F)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v15, v12}, Landroidx/constraintlayout/core/state/Transition$OnSwipe;->setSpringStiffness(F)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v15, v13}, Landroidx/constraintlayout/core/state/Transition$OnSwipe;->setSpringDamping(F)V

    .line 181
    .line 182
    .line 183
    move/from16 v1, v16

    .line 184
    .line 185
    invoke-virtual {v15, v1}, Landroidx/constraintlayout/core/state/Transition$OnSwipe;->setSpringStopThreshold(F)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v15, v14}, Landroidx/constraintlayout/core/state/Transition$OnSwipe;->setSpringBoundary(I)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v15, v0}, Landroidx/constraintlayout/core/state/Transition$OnSwipe;->setRotationCenterId(Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    return-void
.end method

.method private static set(Landroidx/constraintlayout/core/motion/utils/TypedBundle;ILandroidx/constraintlayout/core/parser/CLArray;I)V
    .locals 0

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p2, p3}, Landroidx/constraintlayout/core/parser/CLContainer;->getFloat(I)F

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    invoke-virtual {p0, p1, p2}, Landroidx/constraintlayout/core/motion/utils/TypedBundle;->add(IF)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method
