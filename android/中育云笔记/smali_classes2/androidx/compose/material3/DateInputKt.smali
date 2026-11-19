.class public final Landroidx/compose/material3/DateInputKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final InputTextFieldPadding:Landroidx/compose/foundation/layout/PaddingValues;

.field private static final InputTextNonErroneousBottomPadding:F


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    const/16 v0, 0x18

    .line 2
    .line 3
    int-to-float v0, v0

    .line 4
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    const/16 v0, 0xa

    .line 13
    .line 14
    int-to-float v0, v0

    .line 15
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    const/16 v5, 0x8

    .line 20
    .line 21
    const/4 v6, 0x0

    .line 22
    const/4 v4, 0x0

    .line 23
    invoke-static/range {v1 .. v6}, Landroidx/compose/foundation/layout/PaddingKt;->PaddingValues-a9UjIt4$default(FFFFILjava/lang/Object;)Landroidx/compose/foundation/layout/PaddingValues;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    sput-object v0, Landroidx/compose/material3/DateInputKt;->InputTextFieldPadding:Landroidx/compose/foundation/layout/PaddingValues;

    .line 28
    .line 29
    const/16 v0, 0x10

    .line 30
    .line 31
    int-to-float v0, v0

    .line 32
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    sput v0, Landroidx/compose/material3/DateInputKt;->InputTextNonErroneousBottomPadding:F

    .line 37
    .line 38
    return-void
.end method

.method public static final DateInputContent(Ljava/lang/Long;Lhd/l;Landroidx/compose/material3/internal/CalendarModel;Lnd/j;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V
    .locals 19
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableTarget;
        applier = "androidx.compose.ui.UiComposable"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Long;",
            "Lhd/l;",
            "Landroidx/compose/material3/internal/CalendarModel;",
            "Lnd/j;",
            "Landroidx/compose/material3/DatePickerFormatter;",
            "Landroidx/compose/material3/SelectableDates;",
            "Landroidx/compose/material3/DatePickerColors;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v3, p2

    .line 4
    .line 5
    move-object/from16 v8, p4

    .line 6
    .line 7
    move/from16 v0, p8

    .line 8
    .line 9
    const v2, 0x26585ea9

    .line 10
    .line 11
    .line 12
    move-object/from16 v4, p7

    .line 13
    .line 14
    invoke-interface {v4, v2}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    and-int/lit8 v5, v0, 0x6

    .line 19
    .line 20
    if-nez v5, :cond_1

    .line 21
    .line 22
    invoke-interface {v4, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v5

    .line 26
    if-eqz v5, :cond_0

    .line 27
    .line 28
    const/4 v5, 0x4

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 v5, 0x2

    .line 31
    :goto_0
    or-int/2addr v5, v0

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    move v5, v0

    .line 34
    :goto_1
    and-int/lit8 v6, v0, 0x30

    .line 35
    .line 36
    if-nez v6, :cond_3

    .line 37
    .line 38
    move-object/from16 v6, p1

    .line 39
    .line 40
    invoke-interface {v4, v6}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v7

    .line 44
    if-eqz v7, :cond_2

    .line 45
    .line 46
    const/16 v7, 0x20

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_2
    const/16 v7, 0x10

    .line 50
    .line 51
    :goto_2
    or-int/2addr v5, v7

    .line 52
    goto :goto_3

    .line 53
    :cond_3
    move-object/from16 v6, p1

    .line 54
    .line 55
    :goto_3
    and-int/lit16 v7, v0, 0x180

    .line 56
    .line 57
    if-nez v7, :cond_5

    .line 58
    .line 59
    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v7

    .line 63
    if-eqz v7, :cond_4

    .line 64
    .line 65
    const/16 v7, 0x100

    .line 66
    .line 67
    goto :goto_4

    .line 68
    :cond_4
    const/16 v7, 0x80

    .line 69
    .line 70
    :goto_4
    or-int/2addr v5, v7

    .line 71
    :cond_5
    and-int/lit16 v7, v0, 0xc00

    .line 72
    .line 73
    if-nez v7, :cond_7

    .line 74
    .line 75
    move-object/from16 v7, p3

    .line 76
    .line 77
    invoke-interface {v4, v7}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v9

    .line 81
    if-eqz v9, :cond_6

    .line 82
    .line 83
    const/16 v9, 0x800

    .line 84
    .line 85
    goto :goto_5

    .line 86
    :cond_6
    const/16 v9, 0x400

    .line 87
    .line 88
    :goto_5
    or-int/2addr v5, v9

    .line 89
    goto :goto_6

    .line 90
    :cond_7
    move-object/from16 v7, p3

    .line 91
    .line 92
    :goto_6
    and-int/lit16 v9, v0, 0x6000

    .line 93
    .line 94
    const v11, 0x8000

    .line 95
    .line 96
    .line 97
    if-nez v9, :cond_a

    .line 98
    .line 99
    and-int v9, v0, v11

    .line 100
    .line 101
    if-nez v9, :cond_8

    .line 102
    .line 103
    invoke-interface {v4, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v9

    .line 107
    goto :goto_7

    .line 108
    :cond_8
    invoke-interface {v4, v8}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v9

    .line 112
    :goto_7
    if-eqz v9, :cond_9

    .line 113
    .line 114
    const/16 v9, 0x4000

    .line 115
    .line 116
    goto :goto_8

    .line 117
    :cond_9
    const/16 v9, 0x2000

    .line 118
    .line 119
    :goto_8
    or-int/2addr v5, v9

    .line 120
    :cond_a
    const/high16 v9, 0x30000

    .line 121
    .line 122
    and-int/2addr v9, v0

    .line 123
    if-nez v9, :cond_c

    .line 124
    .line 125
    move-object/from16 v9, p5

    .line 126
    .line 127
    invoke-interface {v4, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v12

    .line 131
    if-eqz v12, :cond_b

    .line 132
    .line 133
    const/high16 v12, 0x20000

    .line 134
    .line 135
    goto :goto_9

    .line 136
    :cond_b
    const/high16 v12, 0x10000

    .line 137
    .line 138
    :goto_9
    or-int/2addr v5, v12

    .line 139
    goto :goto_a

    .line 140
    :cond_c
    move-object/from16 v9, p5

    .line 141
    .line 142
    :goto_a
    const/high16 v12, 0x180000

    .line 143
    .line 144
    and-int/2addr v12, v0

    .line 145
    if-nez v12, :cond_e

    .line 146
    .line 147
    move-object/from16 v12, p6

    .line 148
    .line 149
    invoke-interface {v4, v12}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result v13

    .line 153
    if-eqz v13, :cond_d

    .line 154
    .line 155
    const/high16 v13, 0x100000

    .line 156
    .line 157
    goto :goto_b

    .line 158
    :cond_d
    const/high16 v13, 0x80000

    .line 159
    .line 160
    :goto_b
    or-int/2addr v5, v13

    .line 161
    goto :goto_c

    .line 162
    :cond_e
    move-object/from16 v12, p6

    .line 163
    .line 164
    :goto_c
    const v13, 0x92493

    .line 165
    .line 166
    .line 167
    and-int/2addr v13, v5

    .line 168
    const v14, 0x92492

    .line 169
    .line 170
    .line 171
    if-ne v13, v14, :cond_10

    .line 172
    .line 173
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 174
    .line 175
    .line 176
    move-result v13

    .line 177
    if-nez v13, :cond_f

    .line 178
    .line 179
    goto :goto_d

    .line 180
    :cond_f
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 181
    .line 182
    .line 183
    move-object v2, v4

    .line 184
    goto/16 :goto_12

    .line 185
    .line 186
    :cond_10
    :goto_d
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 187
    .line 188
    .line 189
    move-result v13

    .line 190
    if-eqz v13, :cond_11

    .line 191
    .line 192
    const/4 v13, -0x1

    .line 193
    const-string v14, "androidx.compose.material3.DateInputContent (DateInput.kt:60)"

    .line 194
    .line 195
    invoke-static {v2, v5, v13, v14}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 196
    .line 197
    .line 198
    :cond_11
    const/4 v2, 0x0

    .line 199
    invoke-static {v4, v2}, Landroidx/compose/material3/CalendarLocale_androidKt;->defaultLocale(Landroidx/compose/runtime/Composer;I)Ljava/util/Locale;

    .line 200
    .line 201
    .line 202
    move-result-object v13

    .line 203
    invoke-interface {v4, v13}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 204
    .line 205
    .line 206
    move-result v14

    .line 207
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v15

    .line 211
    if-nez v14, :cond_12

    .line 212
    .line 213
    sget-object v14, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 214
    .line 215
    invoke-virtual {v14}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v14

    .line 219
    if-ne v15, v14, :cond_13

    .line 220
    .line 221
    :cond_12
    invoke-virtual {v3, v13}, Landroidx/compose/material3/internal/CalendarModel;->getDateInputFormat(Ljava/util/Locale;)Landroidx/compose/material3/internal/DateInputFormat;

    .line 222
    .line 223
    .line 224
    move-result-object v15

    .line 225
    invoke-interface {v4, v15}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 226
    .line 227
    .line 228
    :cond_13
    check-cast v15, Landroidx/compose/material3/internal/DateInputFormat;

    .line 229
    .line 230
    sget-object v14, Landroidx/compose/material3/internal/Strings;->Companion:Landroidx/compose/material3/internal/Strings$Companion;

    .line 231
    .line 232
    sget v14, Landroidx/compose/material3/R$string;->m3c_date_input_invalid_for_pattern:I

    .line 233
    .line 234
    invoke-static {v14}, Landroidx/compose/material3/internal/Strings;->constructor-impl(I)I

    .line 235
    .line 236
    .line 237
    move-result v14

    .line 238
    invoke-static {v14, v4, v2}, Landroidx/compose/material3/internal/Strings_androidKt;->getString-2EP1pXo(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v14

    .line 242
    sget v16, Landroidx/compose/material3/R$string;->m3c_date_input_invalid_year_range:I

    .line 243
    .line 244
    move/from16 p7, v11

    .line 245
    .line 246
    invoke-static/range {v16 .. v16}, Landroidx/compose/material3/internal/Strings;->constructor-impl(I)I

    .line 247
    .line 248
    .line 249
    move-result v11

    .line 250
    invoke-static {v11, v4, v2}, Landroidx/compose/material3/internal/Strings_androidKt;->getString-2EP1pXo(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v11

    .line 254
    sget v16, Landroidx/compose/material3/R$string;->m3c_date_input_invalid_not_allowed:I

    .line 255
    .line 256
    invoke-static/range {v16 .. v16}, Landroidx/compose/material3/internal/Strings;->constructor-impl(I)I

    .line 257
    .line 258
    .line 259
    move-result v10

    .line 260
    invoke-static {v10, v4, v2}, Landroidx/compose/material3/internal/Strings_androidKt;->getString-2EP1pXo(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v10

    .line 264
    invoke-interface {v4, v15}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 265
    .line 266
    .line 267
    move-result v16

    .line 268
    const v18, 0xe000

    .line 269
    .line 270
    .line 271
    and-int v2, v5, v18

    .line 272
    .line 273
    move-object/from16 v18, v13

    .line 274
    .line 275
    const/16 v13, 0x4000

    .line 276
    .line 277
    if-eq v2, v13, :cond_15

    .line 278
    .line 279
    and-int v2, v5, p7

    .line 280
    .line 281
    if-eqz v2, :cond_14

    .line 282
    .line 283
    invoke-interface {v4, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 284
    .line 285
    .line 286
    move-result v2

    .line 287
    if-eqz v2, :cond_14

    .line 288
    .line 289
    goto :goto_e

    .line 290
    :cond_14
    const/4 v2, 0x0

    .line 291
    goto :goto_f

    .line 292
    :cond_15
    :goto_e
    const/4 v2, 0x1

    .line 293
    :goto_f
    or-int v2, v16, v2

    .line 294
    .line 295
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object v13

    .line 299
    if-nez v2, :cond_16

    .line 300
    .line 301
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 302
    .line 303
    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    move-result-object v2

    .line 307
    if-ne v13, v2, :cond_17

    .line 308
    .line 309
    :cond_16
    move-object v2, v4

    .line 310
    goto :goto_10

    .line 311
    :cond_17
    move-object v2, v4

    .line 312
    move/from16 v17, v5

    .line 313
    .line 314
    move-object v7, v15

    .line 315
    const/4 v0, 0x1

    .line 316
    goto :goto_11

    .line 317
    :goto_10
    new-instance v4, Landroidx/compose/material3/DateInputValidator;

    .line 318
    .line 319
    move-object v7, v15

    .line 320
    const/16 v15, 0x300

    .line 321
    .line 322
    const/16 v16, 0x0

    .line 323
    .line 324
    const-string v12, ""

    .line 325
    .line 326
    const/4 v13, 0x0

    .line 327
    move-object v9, v14

    .line 328
    const/4 v14, 0x0

    .line 329
    move-object v0, v11

    .line 330
    move-object v11, v10

    .line 331
    move-object v10, v0

    .line 332
    move-object/from16 v6, p5

    .line 333
    .line 334
    move/from16 v17, v5

    .line 335
    .line 336
    const/4 v0, 0x1

    .line 337
    move-object/from16 v5, p3

    .line 338
    .line 339
    invoke-direct/range {v4 .. v16}, Landroidx/compose/material3/DateInputValidator;-><init>(Lnd/j;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/internal/DateInputFormat;Landroidx/compose/material3/DatePickerFormatter;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;ILkotlin/jvm/internal/n;)V

    .line 340
    .line 341
    .line 342
    invoke-interface {v2, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 343
    .line 344
    .line 345
    move-object v13, v4

    .line 346
    :goto_11
    check-cast v13, Landroidx/compose/material3/DateInputValidator;

    .line 347
    .line 348
    invoke-virtual {v7}, Landroidx/compose/material3/internal/DateInputFormat;->getPatternWithDelimiters()Ljava/lang/String;

    .line 349
    .line 350
    .line 351
    move-result-object v4

    .line 352
    sget-object v5, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 353
    .line 354
    invoke-virtual {v4, v5}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 355
    .line 356
    .line 357
    move-result-object v4

    .line 358
    const-string/jumbo v5, "this as java.lang.String).toUpperCase(Locale.ROOT)"

    .line 359
    .line 360
    .line 361
    invoke-static {v4, v5}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 362
    .line 363
    .line 364
    sget v5, Landroidx/compose/material3/R$string;->m3c_date_input_label:I

    .line 365
    .line 366
    invoke-static {v5}, Landroidx/compose/material3/internal/Strings;->constructor-impl(I)I

    .line 367
    .line 368
    .line 369
    move-result v5

    .line 370
    const/4 v6, 0x0

    .line 371
    invoke-static {v5, v2, v6}, Landroidx/compose/material3/internal/Strings_androidKt;->getString-2EP1pXo(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    .line 372
    .line 373
    .line 374
    move-result-object v5

    .line 375
    sget-object v6, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 376
    .line 377
    const/4 v8, 0x0

    .line 378
    const/4 v9, 0x0

    .line 379
    invoke-static {v6, v8, v0, v9}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 380
    .line 381
    .line 382
    move-result-object v6

    .line 383
    sget-object v8, Landroidx/compose/material3/DateInputKt;->InputTextFieldPadding:Landroidx/compose/foundation/layout/PaddingValues;

    .line 384
    .line 385
    invoke-static {v6, v8}, Landroidx/compose/foundation/layout/PaddingKt;->padding(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;)Landroidx/compose/ui/Modifier;

    .line 386
    .line 387
    .line 388
    move-result-object v6

    .line 389
    sget-object v8, Landroidx/compose/material3/InputIdentifier;->Companion:Landroidx/compose/material3/InputIdentifier$Companion;

    .line 390
    .line 391
    invoke-virtual {v8}, Landroidx/compose/material3/InputIdentifier$Companion;->getSingleDateInput-J2x2o4M()I

    .line 392
    .line 393
    .line 394
    move-result v8

    .line 395
    invoke-virtual {v13, v1}, Landroidx/compose/material3/DateInputValidator;->setCurrentStartDateMillis$material3_release(Ljava/lang/Long;)V

    .line 396
    .line 397
    .line 398
    new-instance v9, Landroidx/compose/material3/DateInputKt$DateInputContent$2;

    .line 399
    .line 400
    invoke-direct {v9, v5, v4}, Landroidx/compose/material3/DateInputKt$DateInputContent$2;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 401
    .line 402
    .line 403
    const v5, -0x6c6bf7d5

    .line 404
    .line 405
    .line 406
    const/16 v10, 0x36

    .line 407
    .line 408
    invoke-static {v5, v0, v9, v2, v10}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 409
    .line 410
    .line 411
    move-result-object v5

    .line 412
    new-instance v9, Landroidx/compose/material3/DateInputKt$DateInputContent$3;

    .line 413
    .line 414
    invoke-direct {v9, v4}, Landroidx/compose/material3/DateInputKt$DateInputContent$3;-><init>(Ljava/lang/String;)V

    .line 415
    .line 416
    .line 417
    const v4, -0x21a18394

    .line 418
    .line 419
    .line 420
    invoke-static {v4, v0, v9, v2, v10}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 421
    .line 422
    .line 423
    move-result-object v0

    .line 424
    shl-int/lit8 v4, v17, 0x3

    .line 425
    .line 426
    and-int/lit8 v9, v4, 0x70

    .line 427
    .line 428
    const v10, 0x1b6006

    .line 429
    .line 430
    .line 431
    or-int/2addr v9, v10

    .line 432
    and-int/lit16 v10, v4, 0x380

    .line 433
    .line 434
    or-int/2addr v9, v10

    .line 435
    and-int/lit16 v4, v4, 0x1c00

    .line 436
    .line 437
    or-int v12, v9, v4

    .line 438
    .line 439
    shr-int/lit8 v4, v17, 0x12

    .line 440
    .line 441
    and-int/lit8 v4, v4, 0xe

    .line 442
    .line 443
    move-object v9, v5

    .line 444
    move-object v5, v0

    .line 445
    move-object v0, v6

    .line 446
    move v6, v8

    .line 447
    move-object v8, v7

    .line 448
    move-object v7, v13

    .line 449
    move v13, v4

    .line 450
    move-object v4, v9

    .line 451
    move-object/from16 v10, p6

    .line 452
    .line 453
    move-object v11, v2

    .line 454
    move-object/from16 v9, v18

    .line 455
    .line 456
    move-object/from16 v2, p1

    .line 457
    .line 458
    invoke-static/range {v0 .. v13}, Landroidx/compose/material3/DateInputKt;->DateInputTextField-tQNruF0(Landroidx/compose/ui/Modifier;Ljava/lang/Long;Lhd/l;Landroidx/compose/material3/internal/CalendarModel;Lhd/p;Lhd/p;ILandroidx/compose/material3/DateInputValidator;Landroidx/compose/material3/internal/DateInputFormat;Ljava/util/Locale;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;II)V

    .line 459
    .line 460
    .line 461
    move-object v2, v11

    .line 462
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 463
    .line 464
    .line 465
    move-result v0

    .line 466
    if-eqz v0, :cond_18

    .line 467
    .line 468
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 469
    .line 470
    .line 471
    :cond_18
    :goto_12
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 472
    .line 473
    .line 474
    move-result-object v9

    .line 475
    if-eqz v9, :cond_19

    .line 476
    .line 477
    new-instance v0, Landroidx/compose/material3/DateInputKt$DateInputContent$4;

    .line 478
    .line 479
    move-object/from16 v1, p0

    .line 480
    .line 481
    move-object/from16 v2, p1

    .line 482
    .line 483
    move-object/from16 v3, p2

    .line 484
    .line 485
    move-object/from16 v4, p3

    .line 486
    .line 487
    move-object/from16 v5, p4

    .line 488
    .line 489
    move-object/from16 v6, p5

    .line 490
    .line 491
    move-object/from16 v7, p6

    .line 492
    .line 493
    move/from16 v8, p8

    .line 494
    .line 495
    invoke-direct/range {v0 .. v8}, Landroidx/compose/material3/DateInputKt$DateInputContent$4;-><init>(Ljava/lang/Long;Lhd/l;Landroidx/compose/material3/internal/CalendarModel;Lnd/j;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;I)V

    .line 496
    .line 497
    .line 498
    invoke-interface {v9, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lhd/p;)V

    .line 499
    .line 500
    .line 501
    :cond_19
    return-void
.end method

.method public static final DateInputTextField-tQNruF0(Landroidx/compose/ui/Modifier;Ljava/lang/Long;Lhd/l;Landroidx/compose/material3/internal/CalendarModel;Lhd/p;Lhd/p;ILandroidx/compose/material3/DateInputValidator;Landroidx/compose/material3/internal/DateInputFormat;Ljava/util/Locale;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;II)V
    .locals 42
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Ljava/lang/Long;",
            "Lhd/l;",
            "Landroidx/compose/material3/internal/CalendarModel;",
            "Lhd/p;",
            "Lhd/p;",
            "I",
            "Landroidx/compose/material3/DateInputValidator;",
            "Landroidx/compose/material3/internal/DateInputFormat;",
            "Ljava/util/Locale;",
            "Landroidx/compose/material3/DatePickerColors;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move-object/from16 v4, p3

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move/from16 v12, p12

    const v0, -0x3314e9cd

    move-object/from16 v1, p11

    .line 1
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v1

    and-int/lit8 v3, v12, 0x6

    if-nez v3, :cond_1

    move-object/from16 v3, p0

    invoke-interface {v1, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    const/4 v7, 0x4

    goto :goto_0

    :cond_0
    const/4 v7, 0x2

    :goto_0
    or-int/2addr v7, v12

    goto :goto_1

    :cond_1
    move-object/from16 v3, p0

    move v7, v12

    :goto_1
    and-int/lit8 v8, v12, 0x30

    if-nez v8, :cond_3

    invoke-interface {v1, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2

    const/16 v8, 0x20

    goto :goto_2

    :cond_2
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v7, v8

    :cond_3
    and-int/lit16 v8, v12, 0x180

    if-nez v8, :cond_5

    move-object/from16 v8, p2

    invoke-interface {v1, v8}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_4

    const/16 v14, 0x100

    goto :goto_3

    :cond_4
    const/16 v14, 0x80

    :goto_3
    or-int/2addr v7, v14

    goto :goto_4

    :cond_5
    move-object/from16 v8, p2

    :goto_4
    and-int/lit16 v14, v12, 0xc00

    if-nez v14, :cond_7

    invoke-interface {v1, v4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_6

    const/16 v14, 0x800

    goto :goto_5

    :cond_6
    const/16 v14, 0x400

    :goto_5
    or-int/2addr v7, v14

    :cond_7
    and-int/lit16 v14, v12, 0x6000

    if-nez v14, :cond_9

    move-object/from16 v14, p4

    invoke-interface {v1, v14}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_8

    const/16 v15, 0x4000

    goto :goto_6

    :cond_8
    const/16 v15, 0x2000

    :goto_6
    or-int/2addr v7, v15

    goto :goto_7

    :cond_9
    move-object/from16 v14, p4

    :goto_7
    const/high16 v15, 0x30000

    and-int/2addr v15, v12

    if-nez v15, :cond_b

    move-object/from16 v15, p5

    invoke-interface {v1, v15}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_a

    const/high16 v16, 0x20000

    goto :goto_8

    :cond_a
    const/high16 v16, 0x10000

    :goto_8
    or-int v7, v7, v16

    goto :goto_9

    :cond_b
    move-object/from16 v15, p5

    :goto_9
    const/high16 v16, 0x180000

    and-int v16, v12, v16

    move/from16 v5, p6

    if-nez v16, :cond_d

    invoke-interface {v1, v5}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v16

    if-eqz v16, :cond_c

    const/high16 v16, 0x100000

    goto :goto_a

    :cond_c
    const/high16 v16, 0x80000

    :goto_a
    or-int v7, v7, v16

    :cond_d
    const/high16 v16, 0xc00000

    and-int v16, v12, v16

    move-object/from16 v11, p7

    if-nez v16, :cond_f

    invoke-interface {v1, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_e

    const/high16 v16, 0x800000

    goto :goto_b

    :cond_e
    const/high16 v16, 0x400000

    :goto_b
    or-int v7, v7, v16

    :cond_f
    const/high16 v16, 0x6000000

    and-int v16, v12, v16

    if-nez v16, :cond_11

    invoke-interface {v1, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_10

    const/high16 v16, 0x4000000

    goto :goto_c

    :cond_10
    const/high16 v16, 0x2000000

    :goto_c
    or-int v7, v7, v16

    :cond_11
    const/high16 v16, 0x30000000

    and-int v16, v12, v16

    if-nez v16, :cond_13

    invoke-interface {v1, v10}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_12

    const/high16 v16, 0x20000000

    goto :goto_d

    :cond_12
    const/high16 v16, 0x10000000

    :goto_d
    or-int v7, v7, v16

    :cond_13
    and-int/lit8 v16, p13, 0x6

    move-object/from16 v14, p10

    if-nez v16, :cond_15

    invoke-interface {v1, v14}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_14

    const/16 v17, 0x4

    goto :goto_e

    :cond_14
    const/16 v17, 0x2

    :goto_e
    or-int v17, p13, v17

    move/from16 v13, v17

    goto :goto_f

    :cond_15
    move/from16 v13, p13

    :goto_f
    const v17, 0x12492493

    and-int v0, v7, v17

    const v6, 0x12492492

    if-ne v0, v6, :cond_17

    and-int/lit8 v0, v13, 0x3

    const/4 v6, 0x2

    if-ne v0, v6, :cond_17

    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v0

    if-nez v0, :cond_16

    goto :goto_10

    .line 2
    :cond_16
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object/from16 v17, v1

    goto/16 :goto_1b

    .line 3
    :cond_17
    :goto_10
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_18

    const-string v0, "androidx.compose.material3.DateInputTextField (DateInput.kt:121)"

    const v6, -0x3314e9cd

    invoke-static {v6, v7, v13, v0}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_18
    const/4 v0, 0x0

    new-array v13, v0, [Ljava/lang/Object;

    const/high16 v6, 0x4000000

    .line 4
    sget-object v16, Landroidx/compose/material3/DateInputKt$DateInputTextField$errorText$1;->INSTANCE:Landroidx/compose/material3/DateInputKt$DateInputTextField$errorText$1;

    const/16 v18, 0xc00

    const/16 v19, 0x6

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object/from16 v17, v1

    const/16 v1, 0x100

    invoke-static/range {v13 .. v19}, Landroidx/compose/runtime/saveable/RememberSaveableKt;->rememberSaveable([Ljava/lang/Object;Landroidx/compose/runtime/saveable/Saver;Ljava/lang/String;Lhd/a;Landroidx/compose/runtime/Composer;II)Ljava/lang/Object;

    move-result-object v13

    move-object/from16 v14, v17

    check-cast v13, Landroidx/compose/runtime/MutableState;

    move-object v15, v13

    new-array v13, v0, [Ljava/lang/Object;

    .line 5
    sget-object v16, Landroidx/compose/ui/text/input/TextFieldValue;->Companion:Landroidx/compose/ui/text/input/TextFieldValue$Companion;

    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/text/input/TextFieldValue$Companion;->getSaver()Landroidx/compose/runtime/saveable/Saver;

    move-result-object v16

    and-int/lit8 v0, v7, 0x70

    const/16 v1, 0x20

    if-ne v0, v1, :cond_19

    const/4 v0, 0x1

    goto :goto_11

    :cond_19
    const/4 v0, 0x0

    :goto_11
    invoke-interface {v14, v4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v0, v1

    const/high16 v1, 0xe000000

    and-int/2addr v1, v7

    if-ne v1, v6, :cond_1a

    const/16 v17, 0x1

    goto :goto_12

    :cond_1a
    const/16 v17, 0x0

    :goto_12
    or-int v0, v0, v17

    invoke-interface {v14, v10}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v17

    or-int v0, v0, v17

    .line 6
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v6

    if-nez v0, :cond_1b

    .line 7
    sget-object v0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v0

    if-ne v6, v0, :cond_1c

    .line 8
    :cond_1b
    new-instance v6, Landroidx/compose/material3/DateInputKt$DateInputTextField$text$2$1;

    invoke-direct {v6, v2, v4, v9, v10}, Landroidx/compose/material3/DateInputKt$DateInputTextField$text$2$1;-><init>(Ljava/lang/Long;Landroidx/compose/material3/internal/CalendarModel;Landroidx/compose/material3/internal/DateInputFormat;Ljava/util/Locale;)V

    .line 9
    invoke-interface {v14, v6}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 10
    :cond_1c
    check-cast v6, Lhd/a;

    const/16 v18, 0x0

    const/16 v19, 0x4

    move-object v0, v15

    const/4 v15, 0x0

    move-object/from16 v17, v14

    move-object/from16 v14, v16

    move-object/from16 v16, v6

    invoke-static/range {v13 .. v19}, Landroidx/compose/runtime/saveable/RememberSaveableKt;->rememberSaveable([Ljava/lang/Object;Landroidx/compose/runtime/saveable/Saver;Ljava/lang/String;Lhd/a;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/MutableState;

    move-result-object v6

    move-object/from16 v13, v17

    .line 11
    invoke-static {v6}, Landroidx/compose/material3/DateInputKt;->DateInputTextField_tQNruF0$lambda$4(Landroidx/compose/runtime/MutableState;)Landroidx/compose/ui/text/input/TextFieldValue;

    move-result-object v25

    const/high16 v14, 0x4000000

    if-ne v1, v14, :cond_1d

    const/4 v1, 0x1

    goto :goto_13

    :cond_1d
    const/4 v1, 0x0

    .line 12
    :goto_13
    invoke-interface {v13, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v14

    or-int/2addr v1, v14

    invoke-interface {v13, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v14

    or-int/2addr v1, v14

    and-int/lit16 v14, v7, 0x380

    const/16 v15, 0x100

    if-ne v14, v15, :cond_1e

    const/4 v14, 0x1

    goto :goto_14

    :cond_1e
    const/4 v14, 0x0

    :goto_14
    or-int/2addr v1, v14

    invoke-interface {v13, v4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v14

    or-int/2addr v1, v14

    const/high16 v14, 0x1c00000

    and-int/2addr v14, v7

    const/high16 v15, 0x800000

    if-ne v14, v15, :cond_1f

    const/4 v14, 0x1

    goto :goto_15

    :cond_1f
    const/4 v14, 0x0

    :goto_15
    or-int/2addr v1, v14

    const/high16 v14, 0x380000

    and-int/2addr v14, v7

    const/high16 v15, 0x100000

    if-ne v14, v15, :cond_20

    const/4 v14, 0x1

    goto :goto_16

    :cond_20
    const/4 v14, 0x0

    :goto_16
    or-int/2addr v1, v14

    invoke-interface {v13, v10}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v14

    or-int/2addr v1, v14

    .line 13
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v14

    if-nez v1, :cond_22

    .line 14
    sget-object v1, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v1}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v1

    if-ne v14, v1, :cond_21

    goto :goto_17

    :cond_21
    move-object v5, v0

    move v0, v7

    goto :goto_18

    .line 15
    :cond_22
    :goto_17
    new-instance v3, Landroidx/compose/material3/DateInputKt$DateInputTextField$1$1;

    move/from16 v41, v5

    move-object v5, v0

    move v0, v7

    move-object v7, v4

    move-object v4, v9

    move/from16 v9, v41

    move-object/from16 v41, v11

    move-object v11, v6

    move-object v6, v8

    move-object/from16 v8, v41

    invoke-direct/range {v3 .. v11}, Landroidx/compose/material3/DateInputKt$DateInputTextField$1$1;-><init>(Landroidx/compose/material3/internal/DateInputFormat;Landroidx/compose/runtime/MutableState;Lhd/l;Landroidx/compose/material3/internal/CalendarModel;Landroidx/compose/material3/DateInputValidator;ILjava/util/Locale;Landroidx/compose/runtime/MutableState;)V

    move-object v9, v4

    .line 16
    invoke-interface {v13, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    move-object v14, v3

    .line 17
    :goto_18
    move-object v1, v14

    check-cast v1, Lhd/l;

    .line 18
    invoke-interface {v5}, Landroidx/compose/runtime/MutableState;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/CharSequence;

    invoke-static {v3}, Lqd/c0;->h0(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_23

    const/4 v3, 0x0

    int-to-float v4, v3

    .line 19
    invoke-static {v4}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v3

    :goto_19
    move/from16 v17, v3

    goto :goto_1a

    .line 20
    :cond_23
    sget v3, Landroidx/compose/material3/DateInputKt;->InputTextNonErroneousBottomPadding:F

    goto :goto_19

    :goto_1a
    const/16 v18, 0x7

    const/16 v19, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object v3, v13

    move-object/from16 v13, p0

    .line 21
    invoke-static/range {v13 .. v19}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    .line 22
    invoke-interface {v3, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v6

    .line 23
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v7

    if-nez v6, :cond_24

    .line 24
    sget-object v6, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v6}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v6

    if-ne v7, v6, :cond_25

    .line 25
    :cond_24
    new-instance v7, Landroidx/compose/material3/DateInputKt$DateInputTextField$2$1;

    invoke-direct {v7, v5}, Landroidx/compose/material3/DateInputKt$DateInputTextField$2$1;-><init>(Landroidx/compose/runtime/MutableState;)V

    .line 26
    invoke-interface {v3, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 27
    :cond_25
    check-cast v7, Lhd/l;

    const/4 v6, 0x0

    const/4 v8, 0x1

    const/4 v10, 0x0

    invoke-static {v4, v10, v7, v8, v6}, Landroidx/compose/ui/semantics/SemanticsModifierKt;->semantics$default(Landroidx/compose/ui/Modifier;ZLhd/l;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v15

    .line 28
    new-instance v4, Landroidx/compose/material3/DateInputKt$DateInputTextField$3;

    invoke-direct {v4, v5}, Landroidx/compose/material3/DateInputKt$DateInputTextField$3;-><init>(Landroidx/compose/runtime/MutableState;)V

    const/16 v6, 0x36

    const v7, -0x234914a6

    invoke-static {v7, v8, v4, v3, v6}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v4

    .line 29
    invoke-interface {v5}, Landroidx/compose/runtime/MutableState;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/CharSequence;

    invoke-static {v5}, Lqd/c0;->h0(Ljava/lang/CharSequence;)Z

    move-result v5

    xor-int/lit8 v26, v5, 0x1

    .line 30
    new-instance v5, Landroidx/compose/material3/DateVisualTransformation;

    invoke-direct {v5, v9}, Landroidx/compose/material3/DateVisualTransformation;-><init>(Landroidx/compose/material3/internal/DateInputFormat;)V

    .line 31
    new-instance v27, Landroidx/compose/foundation/text/KeyboardOptions;

    .line 32
    sget-object v29, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 33
    sget-object v6, Landroidx/compose/ui/text/input/KeyboardType;->Companion:Landroidx/compose/ui/text/input/KeyboardType$Companion;

    invoke-virtual {v6}, Landroidx/compose/ui/text/input/KeyboardType$Companion;->getNumber-PjHm6EE()I

    move-result v30

    .line 34
    sget-object v6, Landroidx/compose/ui/text/input/ImeAction;->Companion:Landroidx/compose/ui/text/input/ImeAction$Companion;

    invoke-virtual {v6}, Landroidx/compose/ui/text/input/ImeAction$Companion;->getDone-eUduSuo()I

    move-result v31

    const/16 v35, 0x71

    const/16 v36, 0x0

    const/16 v28, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    .line 35
    invoke-direct/range {v27 .. v36}, Landroidx/compose/foundation/text/KeyboardOptions;-><init>(ILjava/lang/Boolean;IILandroidx/compose/ui/text/input/PlatformImeOptions;Ljava/lang/Boolean;Landroidx/compose/ui/text/intl/LocaleList;ILkotlin/jvm/internal/n;)V

    .line 36
    invoke-virtual/range {p10 .. p10}, Landroidx/compose/material3/DatePickerColors;->getDateTextFieldColors()Landroidx/compose/material3/TextFieldColors;

    move-result-object v35

    shl-int/lit8 v0, v0, 0x6

    const/high16 v6, 0x1f80000

    and-int v37, v0, v6

    const/16 v39, 0x0

    const v40, 0x3d0f38

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x1

    const/16 v31, 0x0

    const/16 v32, 0x0

    const v38, 0xc30180

    move-object/from16 v19, p4

    move-object/from16 v20, p5

    move-object v14, v1

    move-object/from16 v36, v3

    move-object/from16 v13, v25

    move-object/from16 v28, v27

    move-object/from16 v25, v4

    move-object/from16 v27, v5

    .line 37
    invoke-static/range {v13 .. v40}, Landroidx/compose/material3/OutlinedTextFieldKt;->OutlinedTextField(Landroidx/compose/ui/text/input/TextFieldValue;Lhd/l;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lhd/p;Lhd/p;Lhd/p;Lhd/p;Lhd/p;Lhd/p;Lhd/p;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/runtime/Composer;IIII)V

    move-object/from16 v17, v36

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_26

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 38
    :cond_26
    :goto_1b
    invoke-interface/range {v17 .. v17}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v14

    if-eqz v14, :cond_27

    new-instance v0, Landroidx/compose/material3/DateInputKt$DateInputTextField$4;

    move-object/from16 v1, p0

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move/from16 v13, p13

    invoke-direct/range {v0 .. v13}, Landroidx/compose/material3/DateInputKt$DateInputTextField$4;-><init>(Landroidx/compose/ui/Modifier;Ljava/lang/Long;Lhd/l;Landroidx/compose/material3/internal/CalendarModel;Lhd/p;Lhd/p;ILandroidx/compose/material3/DateInputValidator;Landroidx/compose/material3/internal/DateInputFormat;Ljava/util/Locale;Landroidx/compose/material3/DatePickerColors;II)V

    invoke-interface {v14, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lhd/p;)V

    :cond_27
    return-void
.end method

.method private static final DateInputTextField_tQNruF0$lambda$4(Landroidx/compose/runtime/MutableState;)Landroidx/compose/ui/text/input/TextFieldValue;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/MutableState<",
            "Landroidx/compose/ui/text/input/TextFieldValue;",
            ">;)",
            "Landroidx/compose/ui/text/input/TextFieldValue;"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Landroidx/compose/ui/text/input/TextFieldValue;

    .line 6
    .line 7
    return-object p0
.end method

.method private static final DateInputTextField_tQNruF0$lambda$5(Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/text/input/TextFieldValue;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/MutableState<",
            "Landroidx/compose/ui/text/input/TextFieldValue;",
            ">;",
            "Landroidx/compose/ui/text/input/TextFieldValue;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-interface {p0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$DateInputTextField_tQNruF0$lambda$5(Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/text/input/TextFieldValue;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/compose/material3/DateInputKt;->DateInputTextField_tQNruF0$lambda$5(Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/text/input/TextFieldValue;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final getInputTextFieldPadding()Landroidx/compose/foundation/layout/PaddingValues;
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/material3/DateInputKt;->InputTextFieldPadding:Landroidx/compose/foundation/layout/PaddingValues;

    .line 2
    .line 3
    return-object v0
.end method
