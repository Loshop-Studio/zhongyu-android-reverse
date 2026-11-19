.class public Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/sketch/core/version/ITaskParse;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/sketch/core/version/GraphTaskParseVersion1$WhenMappings;
    }
.end annotation


# instance fields
.field private countTime:J

.field private playEndTime:J

.field private playStartTime:J


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

.method private final parseEventAsTask(Lcom/zykj/sketch/EzyDrawBoard$ActionContent;Lcom/zykj/sketch/core/listener/EventListener;Lcom/zykj/sketch/core/data/RenderTask;Lx7/l;)V
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/sketch/EzyDrawBoard$ActionContent;",
            "Lcom/zykj/sketch/core/listener/EventListener;",
            "Lcom/zykj/sketch/core/data/RenderTask;",
            "Lx7/l;",
            ")V"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v10, p2

    .line 4
    .line 5
    move-object/from16 v11, p3

    .line 6
    .line 7
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->getType()Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    const/4 v1, -0x1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    sget-object v2, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    aget v1, v2, v1

    .line 22
    .line 23
    :goto_0
    const-wide/16 v12, 0x0

    .line 24
    .line 25
    packed-switch v1, :pswitch_data_0

    .line 26
    .line 27
    .line 28
    goto/16 :goto_e

    .line 29
    .line 30
    :pswitch_0
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->getAction()Lcom/google/protobuf/Any;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    const-class v2, Lcom/zykj/sketch/EzyDrawBoard$AudioStopAction;

    .line 35
    .line 36
    invoke-virtual {v1, v2}, Lcom/google/protobuf/Any;->unpack(Ljava/lang/Class;)Lcom/google/protobuf/Message;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    move-object v8, v1

    .line 41
    check-cast v8, Lcom/zykj/sketch/EzyDrawBoard$AudioStopAction;

    .line 42
    .line 43
    invoke-virtual {v11}, Lcom/zykj/sketch/core/data/RenderTask;->getGraphTask()Ljava/util/List;

    .line 44
    .line 45
    .line 46
    move-result-object v9

    .line 47
    new-instance v1, Lcom/zykj/sketch/core/data/GraphTask;

    .line 48
    .line 49
    iget-wide v2, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->playStartTime:J

    .line 50
    .line 51
    cmp-long v2, v2, v12

    .line 52
    .line 53
    if-nez v2, :cond_1

    .line 54
    .line 55
    iget-wide v2, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->countTime:J

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_1
    iget-wide v2, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->countTime:J

    .line 59
    .line 60
    invoke-virtual {v8}, Lcom/zykj/sketch/EzyDrawBoard$AudioStopAction;->getStartTime()J

    .line 61
    .line 62
    .line 63
    move-result-wide v4

    .line 64
    iget-wide v6, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->playStartTime:J

    .line 65
    .line 66
    sub-long/2addr v4, v6

    .line 67
    add-long/2addr v2, v4

    .line 68
    :goto_1
    new-instance v5, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1$parseEventAsTask$22;

    .line 69
    .line 70
    invoke-direct {v5, v10, v8}, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1$parseEventAsTask$22;-><init>(Lcom/zykj/sketch/core/listener/EventListener;Lcom/zykj/sketch/EzyDrawBoard$AudioStopAction;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->hasGraphSnapshot()Z

    .line 74
    .line 75
    .line 76
    move-result v6

    .line 77
    sget-object v7, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1$parseEventAsTask$23;->INSTANCE:Lcom/zykj/sketch/core/version/GraphTaskParseVersion1$parseEventAsTask$23;

    .line 78
    .line 79
    move-object/from16 v4, p1

    .line 80
    .line 81
    invoke-direct/range {v1 .. v7}, Lcom/zykj/sketch/core/data/GraphTask;-><init>(JLcom/zykj/sketch/EzyDrawBoard$ActionContent;Lx7/a;ZLx7/a;)V

    .line 82
    .line 83
    .line 84
    invoke-interface {v9, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    invoke-virtual {v8}, Lcom/zykj/sketch/EzyDrawBoard$AudioStopAction;->getStartTime()J

    .line 88
    .line 89
    .line 90
    move-result-wide v1

    .line 91
    iget-wide v3, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->countTime:J

    .line 92
    .line 93
    iget-wide v5, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->playStartTime:J

    .line 94
    .line 95
    sub-long/2addr v1, v5

    .line 96
    add-long/2addr v3, v1

    .line 97
    iput-wide v3, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->countTime:J

    .line 98
    .line 99
    iput-wide v12, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->playStartTime:J

    .line 100
    .line 101
    iput-wide v12, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->playEndTime:J

    .line 102
    .line 103
    return-void

    .line 104
    :pswitch_1
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->getAction()Lcom/google/protobuf/Any;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    const-class v2, Lcom/zykj/sketch/EzyDrawBoard$AudioStartAction;

    .line 109
    .line 110
    invoke-virtual {v1, v2}, Lcom/google/protobuf/Any;->unpack(Ljava/lang/Class;)Lcom/google/protobuf/Message;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    move-object v8, v1

    .line 115
    check-cast v8, Lcom/zykj/sketch/EzyDrawBoard$AudioStartAction;

    .line 116
    .line 117
    invoke-virtual {v8}, Lcom/zykj/sketch/EzyDrawBoard$AudioStartAction;->getStartTime()J

    .line 118
    .line 119
    .line 120
    move-result-wide v1

    .line 121
    iput-wide v1, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->playStartTime:J

    .line 122
    .line 123
    invoke-virtual {v8}, Lcom/zykj/sketch/EzyDrawBoard$AudioStartAction;->getStartTime()J

    .line 124
    .line 125
    .line 126
    move-result-wide v1

    .line 127
    iput-wide v1, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->playEndTime:J

    .line 128
    .line 129
    invoke-virtual {v11}, Lcom/zykj/sketch/core/data/RenderTask;->getGraphTask()Ljava/util/List;

    .line 130
    .line 131
    .line 132
    move-result-object v9

    .line 133
    new-instance v1, Lcom/zykj/sketch/core/data/GraphTask;

    .line 134
    .line 135
    iget-wide v2, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->playStartTime:J

    .line 136
    .line 137
    cmp-long v2, v2, v12

    .line 138
    .line 139
    if-nez v2, :cond_2

    .line 140
    .line 141
    iget-wide v2, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->countTime:J

    .line 142
    .line 143
    goto :goto_2

    .line 144
    :cond_2
    iget-wide v2, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->countTime:J

    .line 145
    .line 146
    invoke-virtual {v8}, Lcom/zykj/sketch/EzyDrawBoard$AudioStartAction;->getStartTime()J

    .line 147
    .line 148
    .line 149
    move-result-wide v4

    .line 150
    iget-wide v6, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->playStartTime:J

    .line 151
    .line 152
    sub-long/2addr v4, v6

    .line 153
    add-long/2addr v2, v4

    .line 154
    :goto_2
    new-instance v5, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1$parseEventAsTask$20;

    .line 155
    .line 156
    invoke-direct {v5, v10, v8}, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1$parseEventAsTask$20;-><init>(Lcom/zykj/sketch/core/listener/EventListener;Lcom/zykj/sketch/EzyDrawBoard$AudioStartAction;)V

    .line 157
    .line 158
    .line 159
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->hasGraphSnapshot()Z

    .line 160
    .line 161
    .line 162
    move-result v6

    .line 163
    sget-object v7, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1$parseEventAsTask$21;->INSTANCE:Lcom/zykj/sketch/core/version/GraphTaskParseVersion1$parseEventAsTask$21;

    .line 164
    .line 165
    move-object/from16 v4, p1

    .line 166
    .line 167
    invoke-direct/range {v1 .. v7}, Lcom/zykj/sketch/core/data/GraphTask;-><init>(JLcom/zykj/sketch/EzyDrawBoard$ActionContent;Lx7/a;ZLx7/a;)V

    .line 168
    .line 169
    .line 170
    invoke-interface {v9, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    invoke-virtual {v11}, Lcom/zykj/sketch/core/data/RenderTask;->getAudioTaskList()Ljava/util/List;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    new-instance v9, Lcom/zykj/sketch/core/data/AudioTask;

    .line 178
    .line 179
    iget-wide v10, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->countTime:J

    .line 180
    .line 181
    invoke-virtual {v8}, Lcom/zykj/sketch/EzyDrawBoard$AudioStartAction;->getFileName()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v12

    .line 185
    const-string v2, "action.fileName"

    .line 186
    .line 187
    invoke-static {v12, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    const/16 v15, 0xc

    .line 191
    .line 192
    const/16 v16, 0x0

    .line 193
    .line 194
    const/4 v13, 0x0

    .line 195
    const/4 v14, 0x0

    .line 196
    invoke-direct/range {v9 .. v16}, Lcom/zykj/sketch/core/data/AudioTask;-><init>(JLjava/lang/String;Ljava/lang/String;IILkotlin/jvm/internal/n;)V

    .line 197
    .line 198
    .line 199
    invoke-interface {v1, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    return-void

    .line 203
    :pswitch_2
    move-object/from16 v4, p1

    .line 204
    .line 205
    invoke-virtual {v4}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->getAction()Lcom/google/protobuf/Any;

    .line 206
    .line 207
    .line 208
    move-result-object v1

    .line 209
    const-class v2, Lcom/zykj/sketch/EzyDrawBoard$ActionClearBoard;

    .line 210
    .line 211
    invoke-virtual {v1, v2}, Lcom/google/protobuf/Any;->unpack(Ljava/lang/Class;)Lcom/google/protobuf/Message;

    .line 212
    .line 213
    .line 214
    move-result-object v1

    .line 215
    check-cast v1, Lcom/zykj/sketch/EzyDrawBoard$ActionClearBoard;

    .line 216
    .line 217
    move-object v2, v1

    .line 218
    new-instance v1, Lcom/zykj/sketch/core/data/GraphTask;

    .line 219
    .line 220
    iget-wide v5, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->playStartTime:J

    .line 221
    .line 222
    cmp-long v3, v5, v12

    .line 223
    .line 224
    if-nez v3, :cond_3

    .line 225
    .line 226
    iget-wide v2, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->countTime:J

    .line 227
    .line 228
    goto :goto_3

    .line 229
    :cond_3
    iget-wide v5, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->countTime:J

    .line 230
    .line 231
    invoke-virtual {v2}, Lcom/zykj/sketch/EzyDrawBoard$ActionClearBoard;->getStartTime()J

    .line 232
    .line 233
    .line 234
    move-result-wide v2

    .line 235
    iget-wide v7, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->playStartTime:J

    .line 236
    .line 237
    sub-long/2addr v2, v7

    .line 238
    add-long/2addr v2, v5

    .line 239
    :goto_3
    new-instance v5, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1$parseEventAsTask$17;

    .line 240
    .line 241
    invoke-direct {v5, v10, v4}, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1$parseEventAsTask$17;-><init>(Lcom/zykj/sketch/core/listener/EventListener;Lcom/zykj/sketch/EzyDrawBoard$ActionContent;)V

    .line 242
    .line 243
    .line 244
    invoke-virtual {v4}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->hasGraphSnapshot()Z

    .line 245
    .line 246
    .line 247
    move-result v6

    .line 248
    new-instance v7, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1$parseEventAsTask$18;

    .line 249
    .line 250
    invoke-direct {v7, v10, v4}, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1$parseEventAsTask$18;-><init>(Lcom/zykj/sketch/core/listener/EventListener;Lcom/zykj/sketch/EzyDrawBoard$ActionContent;)V

    .line 251
    .line 252
    .line 253
    invoke-direct/range {v1 .. v7}, Lcom/zykj/sketch/core/data/GraphTask;-><init>(JLcom/zykj/sketch/EzyDrawBoard$ActionContent;Lx7/a;ZLx7/a;)V

    .line 254
    .line 255
    .line 256
    invoke-virtual {v11}, Lcom/zykj/sketch/core/data/RenderTask;->getGraphTask()Ljava/util/List;

    .line 257
    .line 258
    .line 259
    move-result-object v2

    .line 260
    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 261
    .line 262
    .line 263
    invoke-virtual {v11, v1}, Lcom/zykj/sketch/core/data/RenderTask;->setLastSnapshot(Lcom/zykj/sketch/core/data/GraphTask;)V

    .line 264
    .line 265
    .line 266
    return-void

    .line 267
    :pswitch_3
    move-object/from16 v4, p1

    .line 268
    .line 269
    invoke-virtual {v4}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->getAction()Lcom/google/protobuf/Any;

    .line 270
    .line 271
    .line 272
    move-result-object v1

    .line 273
    const-class v2, Lcom/zykj/sketch/EzyDrawBoard$ActionNextAction;

    .line 274
    .line 275
    invoke-virtual {v1, v2}, Lcom/google/protobuf/Any;->unpack(Ljava/lang/Class;)Lcom/google/protobuf/Message;

    .line 276
    .line 277
    .line 278
    move-result-object v1

    .line 279
    check-cast v1, Lcom/zykj/sketch/EzyDrawBoard$ActionNextAction;

    .line 280
    .line 281
    move-object v2, v1

    .line 282
    new-instance v1, Lcom/zykj/sketch/core/data/GraphTask;

    .line 283
    .line 284
    iget-wide v5, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->playStartTime:J

    .line 285
    .line 286
    cmp-long v3, v5, v12

    .line 287
    .line 288
    if-nez v3, :cond_4

    .line 289
    .line 290
    iget-wide v2, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->countTime:J

    .line 291
    .line 292
    goto :goto_4

    .line 293
    :cond_4
    iget-wide v5, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->countTime:J

    .line 294
    .line 295
    invoke-virtual {v2}, Lcom/zykj/sketch/EzyDrawBoard$ActionNextAction;->getStartTime()J

    .line 296
    .line 297
    .line 298
    move-result-wide v2

    .line 299
    iget-wide v7, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->playStartTime:J

    .line 300
    .line 301
    sub-long/2addr v2, v7

    .line 302
    add-long/2addr v2, v5

    .line 303
    :goto_4
    new-instance v5, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1$parseEventAsTask$14;

    .line 304
    .line 305
    invoke-direct {v5, v10, v4}, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1$parseEventAsTask$14;-><init>(Lcom/zykj/sketch/core/listener/EventListener;Lcom/zykj/sketch/EzyDrawBoard$ActionContent;)V

    .line 306
    .line 307
    .line 308
    invoke-virtual {v4}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->hasGraphSnapshot()Z

    .line 309
    .line 310
    .line 311
    move-result v6

    .line 312
    new-instance v7, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1$parseEventAsTask$15;

    .line 313
    .line 314
    invoke-direct {v7, v10, v4}, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1$parseEventAsTask$15;-><init>(Lcom/zykj/sketch/core/listener/EventListener;Lcom/zykj/sketch/EzyDrawBoard$ActionContent;)V

    .line 315
    .line 316
    .line 317
    invoke-direct/range {v1 .. v7}, Lcom/zykj/sketch/core/data/GraphTask;-><init>(JLcom/zykj/sketch/EzyDrawBoard$ActionContent;Lx7/a;ZLx7/a;)V

    .line 318
    .line 319
    .line 320
    invoke-virtual {v11}, Lcom/zykj/sketch/core/data/RenderTask;->getGraphTask()Ljava/util/List;

    .line 321
    .line 322
    .line 323
    move-result-object v2

    .line 324
    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 325
    .line 326
    .line 327
    invoke-virtual {v11, v1}, Lcom/zykj/sketch/core/data/RenderTask;->setLastSnapshot(Lcom/zykj/sketch/core/data/GraphTask;)V

    .line 328
    .line 329
    .line 330
    return-void

    .line 331
    :pswitch_4
    move-object/from16 v4, p1

    .line 332
    .line 333
    invoke-virtual {v4}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->getAction()Lcom/google/protobuf/Any;

    .line 334
    .line 335
    .line 336
    move-result-object v1

    .line 337
    const-class v2, Lcom/zykj/sketch/EzyDrawBoard$ActionPrevAction;

    .line 338
    .line 339
    invoke-virtual {v1, v2}, Lcom/google/protobuf/Any;->unpack(Ljava/lang/Class;)Lcom/google/protobuf/Message;

    .line 340
    .line 341
    .line 342
    move-result-object v1

    .line 343
    check-cast v1, Lcom/zykj/sketch/EzyDrawBoard$ActionPrevAction;

    .line 344
    .line 345
    move-object v2, v1

    .line 346
    new-instance v1, Lcom/zykj/sketch/core/data/GraphTask;

    .line 347
    .line 348
    iget-wide v5, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->playStartTime:J

    .line 349
    .line 350
    cmp-long v3, v5, v12

    .line 351
    .line 352
    if-nez v3, :cond_5

    .line 353
    .line 354
    iget-wide v2, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->countTime:J

    .line 355
    .line 356
    goto :goto_5

    .line 357
    :cond_5
    iget-wide v5, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->countTime:J

    .line 358
    .line 359
    invoke-virtual {v2}, Lcom/zykj/sketch/EzyDrawBoard$ActionPrevAction;->getStartTime()J

    .line 360
    .line 361
    .line 362
    move-result-wide v2

    .line 363
    iget-wide v7, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->playStartTime:J

    .line 364
    .line 365
    sub-long/2addr v2, v7

    .line 366
    add-long/2addr v2, v5

    .line 367
    :goto_5
    new-instance v5, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1$parseEventAsTask$11;

    .line 368
    .line 369
    invoke-direct {v5, v10, v4}, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1$parseEventAsTask$11;-><init>(Lcom/zykj/sketch/core/listener/EventListener;Lcom/zykj/sketch/EzyDrawBoard$ActionContent;)V

    .line 370
    .line 371
    .line 372
    invoke-virtual {v4}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->hasGraphSnapshot()Z

    .line 373
    .line 374
    .line 375
    move-result v6

    .line 376
    new-instance v7, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1$parseEventAsTask$12;

    .line 377
    .line 378
    invoke-direct {v7, v10, v4}, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1$parseEventAsTask$12;-><init>(Lcom/zykj/sketch/core/listener/EventListener;Lcom/zykj/sketch/EzyDrawBoard$ActionContent;)V

    .line 379
    .line 380
    .line 381
    invoke-direct/range {v1 .. v7}, Lcom/zykj/sketch/core/data/GraphTask;-><init>(JLcom/zykj/sketch/EzyDrawBoard$ActionContent;Lx7/a;ZLx7/a;)V

    .line 382
    .line 383
    .line 384
    invoke-virtual {v11}, Lcom/zykj/sketch/core/data/RenderTask;->getGraphTask()Ljava/util/List;

    .line 385
    .line 386
    .line 387
    move-result-object v2

    .line 388
    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 389
    .line 390
    .line 391
    invoke-virtual {v11, v1}, Lcom/zykj/sketch/core/data/RenderTask;->setLastSnapshot(Lcom/zykj/sketch/core/data/GraphTask;)V

    .line 392
    .line 393
    .line 394
    return-void

    .line 395
    :pswitch_5
    move-object/from16 v4, p1

    .line 396
    .line 397
    invoke-virtual {v4}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->getAction()Lcom/google/protobuf/Any;

    .line 398
    .line 399
    .line 400
    move-result-object v1

    .line 401
    const-class v2, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;

    .line 402
    .line 403
    invoke-virtual {v1, v2}, Lcom/google/protobuf/Any;->unpack(Ljava/lang/Class;)Lcom/google/protobuf/Message;

    .line 404
    .line 405
    .line 406
    move-result-object v1

    .line 407
    check-cast v1, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;

    .line 408
    .line 409
    move-object v2, v1

    .line 410
    new-instance v1, Lcom/zykj/sketch/core/data/GraphTask;

    .line 411
    .line 412
    iget-wide v5, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->playStartTime:J

    .line 413
    .line 414
    cmp-long v3, v5, v12

    .line 415
    .line 416
    if-nez v3, :cond_6

    .line 417
    .line 418
    iget-wide v2, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->countTime:J

    .line 419
    .line 420
    goto :goto_6

    .line 421
    :cond_6
    iget-wide v5, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->countTime:J

    .line 422
    .line 423
    invoke-virtual {v2}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;->getStartTime()J

    .line 424
    .line 425
    .line 426
    move-result-wide v2

    .line 427
    iget-wide v7, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->playStartTime:J

    .line 428
    .line 429
    sub-long/2addr v2, v7

    .line 430
    add-long/2addr v2, v5

    .line 431
    :goto_6
    new-instance v5, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1$parseEventAsTask$8;

    .line 432
    .line 433
    invoke-direct {v5, v10, v4}, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1$parseEventAsTask$8;-><init>(Lcom/zykj/sketch/core/listener/EventListener;Lcom/zykj/sketch/EzyDrawBoard$ActionContent;)V

    .line 434
    .line 435
    .line 436
    invoke-virtual {v4}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->hasGraphSnapshot()Z

    .line 437
    .line 438
    .line 439
    move-result v6

    .line 440
    new-instance v7, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1$parseEventAsTask$9;

    .line 441
    .line 442
    invoke-direct {v7, v10, v4}, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1$parseEventAsTask$9;-><init>(Lcom/zykj/sketch/core/listener/EventListener;Lcom/zykj/sketch/EzyDrawBoard$ActionContent;)V

    .line 443
    .line 444
    .line 445
    invoke-direct/range {v1 .. v7}, Lcom/zykj/sketch/core/data/GraphTask;-><init>(JLcom/zykj/sketch/EzyDrawBoard$ActionContent;Lx7/a;ZLx7/a;)V

    .line 446
    .line 447
    .line 448
    invoke-virtual {v11}, Lcom/zykj/sketch/core/data/RenderTask;->getGraphTask()Ljava/util/List;

    .line 449
    .line 450
    .line 451
    move-result-object v2

    .line 452
    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 453
    .line 454
    .line 455
    invoke-virtual {v11, v1}, Lcom/zykj/sketch/core/data/RenderTask;->setLastSnapshot(Lcom/zykj/sketch/core/data/GraphTask;)V

    .line 456
    .line 457
    .line 458
    return-void

    .line 459
    :pswitch_6
    move-object/from16 v4, p1

    .line 460
    .line 461
    invoke-virtual {v4}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->getAction()Lcom/google/protobuf/Any;

    .line 462
    .line 463
    .line 464
    move-result-object v1

    .line 465
    const-class v2, Lcom/zykj/sketch/EzyDrawBoard$ActionWebViewConfig;

    .line 466
    .line 467
    invoke-virtual {v1, v2}, Lcom/google/protobuf/Any;->unpack(Ljava/lang/Class;)Lcom/google/protobuf/Message;

    .line 468
    .line 469
    .line 470
    move-result-object v1

    .line 471
    check-cast v1, Lcom/zykj/sketch/EzyDrawBoard$ActionWebViewConfig;

    .line 472
    .line 473
    invoke-virtual {v11}, Lcom/zykj/sketch/core/data/RenderTask;->getGraphTask()Ljava/util/List;

    .line 474
    .line 475
    .line 476
    move-result-object v8

    .line 477
    new-instance v2, Lcom/zykj/sketch/core/data/GraphTask;

    .line 478
    .line 479
    iget-wide v5, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->playStartTime:J

    .line 480
    .line 481
    cmp-long v3, v5, v12

    .line 482
    .line 483
    iget-wide v5, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->countTime:J

    .line 484
    .line 485
    if-nez v3, :cond_7

    .line 486
    .line 487
    goto :goto_7

    .line 488
    :cond_7
    invoke-virtual {v1}, Lcom/zykj/sketch/EzyDrawBoard$ActionWebViewConfig;->getStartTime()J

    .line 489
    .line 490
    .line 491
    move-result-wide v11

    .line 492
    iget-wide v13, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->playStartTime:J

    .line 493
    .line 494
    sub-long/2addr v11, v13

    .line 495
    add-long/2addr v5, v11

    .line 496
    :goto_7
    new-instance v3, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1$parseEventAsTask$6;

    .line 497
    .line 498
    move-object/from16 v7, p4

    .line 499
    .line 500
    invoke-direct {v3, v10, v1, v7}, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1$parseEventAsTask$6;-><init>(Lcom/zykj/sketch/core/listener/EventListener;Lcom/zykj/sketch/EzyDrawBoard$ActionWebViewConfig;Lx7/l;)V

    .line 501
    .line 502
    .line 503
    move-object v1, v2

    .line 504
    move-wide/from16 v19, v5

    .line 505
    .line 506
    move-object v5, v3

    .line 507
    move-wide/from16 v2, v19

    .line 508
    .line 509
    invoke-virtual {v4}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->hasGraphSnapshot()Z

    .line 510
    .line 511
    .line 512
    move-result v6

    .line 513
    new-instance v7, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1$parseEventAsTask$7;

    .line 514
    .line 515
    invoke-direct {v7, v10, v4}, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1$parseEventAsTask$7;-><init>(Lcom/zykj/sketch/core/listener/EventListener;Lcom/zykj/sketch/EzyDrawBoard$ActionContent;)V

    .line 516
    .line 517
    .line 518
    invoke-direct/range {v1 .. v7}, Lcom/zykj/sketch/core/data/GraphTask;-><init>(JLcom/zykj/sketch/EzyDrawBoard$ActionContent;Lx7/a;ZLx7/a;)V

    .line 519
    .line 520
    .line 521
    invoke-interface {v8, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 522
    .line 523
    .line 524
    return-void

    .line 525
    :pswitch_7
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->getAction()Lcom/google/protobuf/Any;

    .line 526
    .line 527
    .line 528
    move-result-object v1

    .line 529
    const-class v2, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;

    .line 530
    .line 531
    invoke-virtual {v1, v2}, Lcom/google/protobuf/Any;->unpack(Ljava/lang/Class;)Lcom/google/protobuf/Message;

    .line 532
    .line 533
    .line 534
    move-result-object v1

    .line 535
    check-cast v1, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;

    .line 536
    .line 537
    invoke-virtual {v11}, Lcom/zykj/sketch/core/data/RenderTask;->getGraphTask()Ljava/util/List;

    .line 538
    .line 539
    .line 540
    move-result-object v8

    .line 541
    new-instance v2, Lcom/zykj/sketch/core/data/GraphTask;

    .line 542
    .line 543
    iget-wide v3, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->playStartTime:J

    .line 544
    .line 545
    cmp-long v3, v3, v12

    .line 546
    .line 547
    if-nez v3, :cond_8

    .line 548
    .line 549
    iget-wide v3, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->countTime:J

    .line 550
    .line 551
    goto :goto_8

    .line 552
    :cond_8
    iget-wide v3, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->countTime:J

    .line 553
    .line 554
    invoke-virtual {v1}, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;->getStartTime()J

    .line 555
    .line 556
    .line 557
    move-result-wide v5

    .line 558
    iget-wide v11, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->playStartTime:J

    .line 559
    .line 560
    sub-long/2addr v5, v11

    .line 561
    add-long/2addr v3, v5

    .line 562
    :goto_8
    new-instance v5, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1$parseEventAsTask$4;

    .line 563
    .line 564
    invoke-direct {v5, v10, v1}, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1$parseEventAsTask$4;-><init>(Lcom/zykj/sketch/core/listener/EventListener;Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;)V

    .line 565
    .line 566
    .line 567
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->hasGraphSnapshot()Z

    .line 568
    .line 569
    .line 570
    move-result v6

    .line 571
    sget-object v7, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1$parseEventAsTask$5;->INSTANCE:Lcom/zykj/sketch/core/version/GraphTaskParseVersion1$parseEventAsTask$5;

    .line 572
    .line 573
    move-object v1, v2

    .line 574
    move-wide v2, v3

    .line 575
    move-object/from16 v4, p1

    .line 576
    .line 577
    invoke-direct/range {v1 .. v7}, Lcom/zykj/sketch/core/data/GraphTask;-><init>(JLcom/zykj/sketch/EzyDrawBoard$ActionContent;Lx7/a;ZLx7/a;)V

    .line 578
    .line 579
    .line 580
    invoke-interface {v8, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 581
    .line 582
    .line 583
    return-void

    .line 584
    :pswitch_8
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->getAction()Lcom/google/protobuf/Any;

    .line 585
    .line 586
    .line 587
    move-result-object v1

    .line 588
    const-class v2, Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig;

    .line 589
    .line 590
    invoke-virtual {v1, v2}, Lcom/google/protobuf/Any;->unpack(Ljava/lang/Class;)Lcom/google/protobuf/Message;

    .line 591
    .line 592
    .line 593
    move-result-object v1

    .line 594
    check-cast v1, Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig;

    .line 595
    .line 596
    invoke-virtual {v11}, Lcom/zykj/sketch/core/data/RenderTask;->getGraphTask()Ljava/util/List;

    .line 597
    .line 598
    .line 599
    move-result-object v8

    .line 600
    new-instance v2, Lcom/zykj/sketch/core/data/GraphTask;

    .line 601
    .line 602
    iget-wide v3, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->playStartTime:J

    .line 603
    .line 604
    cmp-long v3, v3, v12

    .line 605
    .line 606
    if-nez v3, :cond_9

    .line 607
    .line 608
    iget-wide v3, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->countTime:J

    .line 609
    .line 610
    goto :goto_9

    .line 611
    :cond_9
    iget-wide v3, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->countTime:J

    .line 612
    .line 613
    invoke-virtual {v1}, Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig;->getStartTime()J

    .line 614
    .line 615
    .line 616
    move-result-wide v5

    .line 617
    iget-wide v11, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->playStartTime:J

    .line 618
    .line 619
    sub-long/2addr v5, v11

    .line 620
    add-long/2addr v3, v5

    .line 621
    :goto_9
    new-instance v5, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1$parseEventAsTask$2;

    .line 622
    .line 623
    invoke-direct {v5, v10, v1}, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1$parseEventAsTask$2;-><init>(Lcom/zykj/sketch/core/listener/EventListener;Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig;)V

    .line 624
    .line 625
    .line 626
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->hasGraphSnapshot()Z

    .line 627
    .line 628
    .line 629
    move-result v6

    .line 630
    sget-object v7, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1$parseEventAsTask$3;->INSTANCE:Lcom/zykj/sketch/core/version/GraphTaskParseVersion1$parseEventAsTask$3;

    .line 631
    .line 632
    move-object v1, v2

    .line 633
    move-wide v2, v3

    .line 634
    move-object/from16 v4, p1

    .line 635
    .line 636
    invoke-direct/range {v1 .. v7}, Lcom/zykj/sketch/core/data/GraphTask;-><init>(JLcom/zykj/sketch/EzyDrawBoard$ActionContent;Lx7/a;ZLx7/a;)V

    .line 637
    .line 638
    .line 639
    invoke-interface {v8, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 640
    .line 641
    .line 642
    return-void

    .line 643
    :pswitch_9
    move-object/from16 v4, p1

    .line 644
    .line 645
    invoke-virtual {v4}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->getAction()Lcom/google/protobuf/Any;

    .line 646
    .line 647
    .line 648
    move-result-object v1

    .line 649
    const-class v2, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent;

    .line 650
    .line 651
    invoke-virtual {v1, v2}, Lcom/google/protobuf/Any;->unpack(Ljava/lang/Class;)Lcom/google/protobuf/Message;

    .line 652
    .line 653
    .line 654
    move-result-object v1

    .line 655
    move-object v14, v1

    .line 656
    check-cast v14, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent;

    .line 657
    .line 658
    invoke-virtual {v14}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent;->getTouchEventList()Ljava/util/List;

    .line 659
    .line 660
    .line 661
    move-result-object v1

    .line 662
    const-string v2, "action.touchEventList"

    .line 663
    .line 664
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 665
    .line 666
    .line 667
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 668
    .line 669
    .line 670
    move-result-object v15

    .line 671
    const/4 v1, 0x0

    .line 672
    :goto_a
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    .line 673
    .line 674
    .line 675
    move-result v2

    .line 676
    if-eqz v2, :cond_e

    .line 677
    .line 678
    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 679
    .line 680
    .line 681
    move-result-object v2

    .line 682
    add-int/lit8 v16, v1, 0x1

    .line 683
    .line 684
    if-gez v1, :cond_a

    .line 685
    .line 686
    invoke-static {}, Li7/v;->w()V

    .line 687
    .line 688
    .line 689
    :cond_a
    check-cast v2, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;

    .line 690
    .line 691
    invoke-virtual {v14}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent;->getTouchEventCount()I

    .line 692
    .line 693
    .line 694
    move-result v3

    .line 695
    add-int/lit8 v3, v3, -0x1

    .line 696
    .line 697
    if-ne v1, v3, :cond_c

    .line 698
    .line 699
    new-instance v1, Lcom/zykj/sketch/core/data/GraphTask;

    .line 700
    .line 701
    iget-wide v5, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->playStartTime:J

    .line 702
    .line 703
    cmp-long v3, v5, v12

    .line 704
    .line 705
    iget-wide v5, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->countTime:J

    .line 706
    .line 707
    if-nez v3, :cond_b

    .line 708
    .line 709
    move-wide/from16 v17, v12

    .line 710
    .line 711
    goto :goto_b

    .line 712
    :cond_b
    invoke-virtual {v2}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getEventTime()J

    .line 713
    .line 714
    .line 715
    move-result-wide v7

    .line 716
    move-wide/from16 v17, v12

    .line 717
    .line 718
    iget-wide v12, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->playStartTime:J

    .line 719
    .line 720
    sub-long/2addr v7, v12

    .line 721
    add-long/2addr v5, v7

    .line 722
    :goto_b
    new-instance v3, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1$parseEventAsTask$1$1;

    .line 723
    .line 724
    invoke-direct {v3, v10, v2, v4}, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1$parseEventAsTask$1$1;-><init>(Lcom/zykj/sketch/core/listener/EventListener;Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;Lcom/zykj/sketch/EzyDrawBoard$ActionContent;)V

    .line 725
    .line 726
    .line 727
    new-instance v7, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1$parseEventAsTask$1$2;

    .line 728
    .line 729
    invoke-direct {v7, v10, v4}, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1$parseEventAsTask$1$2;-><init>(Lcom/zykj/sketch/core/listener/EventListener;Lcom/zykj/sketch/EzyDrawBoard$ActionContent;)V

    .line 730
    .line 731
    .line 732
    move-wide/from16 v19, v5

    .line 733
    .line 734
    move-object v5, v3

    .line 735
    move-wide/from16 v2, v19

    .line 736
    .line 737
    const/4 v6, 0x1

    .line 738
    invoke-direct/range {v1 .. v7}, Lcom/zykj/sketch/core/data/GraphTask;-><init>(JLcom/zykj/sketch/EzyDrawBoard$ActionContent;Lx7/a;ZLx7/a;)V

    .line 739
    .line 740
    .line 741
    invoke-virtual {v11}, Lcom/zykj/sketch/core/data/RenderTask;->getGraphTask()Ljava/util/List;

    .line 742
    .line 743
    .line 744
    move-result-object v2

    .line 745
    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 746
    .line 747
    .line 748
    invoke-virtual {v11, v1}, Lcom/zykj/sketch/core/data/RenderTask;->setLastSnapshot(Lcom/zykj/sketch/core/data/GraphTask;)V

    .line 749
    .line 750
    .line 751
    iget-wide v1, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->countTime:J

    .line 752
    .line 753
    invoke-virtual {v11, v1, v2}, Lcom/zykj/sketch/core/data/RenderTask;->setProgress(J)V

    .line 754
    .line 755
    .line 756
    goto :goto_d

    .line 757
    :cond_c
    move-wide/from16 v17, v12

    .line 758
    .line 759
    invoke-virtual {v11}, Lcom/zykj/sketch/core/data/RenderTask;->getGraphTask()Ljava/util/List;

    .line 760
    .line 761
    .line 762
    move-result-object v12

    .line 763
    new-instance v1, Lcom/zykj/sketch/core/data/GraphTask;

    .line 764
    .line 765
    iget-wide v3, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->playStartTime:J

    .line 766
    .line 767
    cmp-long v3, v3, v17

    .line 768
    .line 769
    if-nez v3, :cond_d

    .line 770
    .line 771
    iget-wide v3, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->countTime:J

    .line 772
    .line 773
    goto :goto_c

    .line 774
    :cond_d
    iget-wide v3, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->countTime:J

    .line 775
    .line 776
    invoke-virtual {v2}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getEventTime()J

    .line 777
    .line 778
    .line 779
    move-result-wide v5

    .line 780
    iget-wide v7, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->playStartTime:J

    .line 781
    .line 782
    sub-long/2addr v5, v7

    .line 783
    add-long/2addr v3, v5

    .line 784
    :goto_c
    new-instance v5, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1$parseEventAsTask$1$4;

    .line 785
    .line 786
    invoke-direct {v5, v10, v2}, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1$parseEventAsTask$1$4;-><init>(Lcom/zykj/sketch/core/listener/EventListener;Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)V

    .line 787
    .line 788
    .line 789
    const/16 v8, 0x10

    .line 790
    .line 791
    const/4 v9, 0x0

    .line 792
    const/4 v6, 0x0

    .line 793
    const/4 v7, 0x0

    .line 794
    move-wide v2, v3

    .line 795
    move-object/from16 v4, p1

    .line 796
    .line 797
    invoke-direct/range {v1 .. v9}, Lcom/zykj/sketch/core/data/GraphTask;-><init>(JLcom/zykj/sketch/EzyDrawBoard$ActionContent;Lx7/a;ZLx7/a;ILkotlin/jvm/internal/n;)V

    .line 798
    .line 799
    .line 800
    invoke-interface {v12, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 801
    .line 802
    .line 803
    :goto_d
    move-object/from16 v4, p1

    .line 804
    .line 805
    move/from16 v1, v16

    .line 806
    .line 807
    move-wide/from16 v12, v17

    .line 808
    .line 809
    goto/16 :goto_a

    .line 810
    .line 811
    :cond_e
    :goto_e
    return-void

    .line 812
    nop

    .line 813
    :pswitch_data_0
    .packed-switch 0x1
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


# virtual methods
.method public parse(Ljava/util/List;Lcom/zykj/sketch/core/listener/EventListener;Lx7/l;)Lcom/zykj/sketch/core/data/RenderTask;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/zykj/sketch/EzyDrawBoard$ActionContent;",
            ">;",
            "Lcom/zykj/sketch/core/listener/EventListener;",
            "Lx7/l;",
            ")",
            "Lcom/zykj/sketch/core/data/RenderTask;"
        }
    .end annotation

    .line 1
    const-string v0, "content"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "eventListener"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "viewBack"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance v1, Lcom/zykj/sketch/core/data/RenderTask;

    .line 17
    .line 18
    new-instance v2, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    new-instance v3, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 26
    .line 27
    .line 28
    const/16 v7, 0x8

    .line 29
    .line 30
    const/4 v8, 0x0

    .line 31
    const/4 v4, 0x0

    .line 32
    const-wide/16 v5, 0x0

    .line 33
    .line 34
    invoke-direct/range {v1 .. v8}, Lcom/zykj/sketch/core/data/RenderTask;-><init>(Ljava/util/List;Ljava/util/List;Lcom/zykj/sketch/core/data/GraphTask;JILkotlin/jvm/internal/n;)V

    .line 35
    .line 36
    .line 37
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_0

    .line 46
    .line 47
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    check-cast v0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;

    .line 52
    .line 53
    invoke-direct {p0, v0, p2, v1, p3}, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->parseEventAsTask(Lcom/zykj/sketch/EzyDrawBoard$ActionContent;Lcom/zykj/sketch/core/listener/EventListener;Lcom/zykj/sketch/core/data/RenderTask;Lx7/l;)V

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    iget-wide p1, p0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->countTime:J

    .line 58
    .line 59
    invoke-virtual {v1, p1, p2}, Lcom/zykj/sketch/core/data/RenderTask;->setProgress(J)V

    .line 60
    .line 61
    .line 62
    return-object v1
.end method
