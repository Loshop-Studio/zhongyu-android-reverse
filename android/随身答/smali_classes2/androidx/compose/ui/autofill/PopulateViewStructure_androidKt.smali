.class public final Landroidx/compose/ui/autofill/PopulateViewStructure_androidKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a.\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00082\u0006\u0010\t\u001a\u00020\nH\u0001\u00a8\u0006\u000b"
    }
    d2 = {
        "populate",
        "",
        "Landroid/view/ViewStructure;",
        "semanticsInfo",
        "Landroidx/compose/ui/semantics/SemanticsInfo;",
        "rootAutofillId",
        "Landroid/view/autofill/AutofillId;",
        "packageName",
        "",
        "rectManager",
        "Landroidx/compose/ui/spatial/RectManager;",
        "ui_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nPopulateViewStructure.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PopulateViewStructure.android.kt\nandroidx/compose/ui/autofill/PopulateViewStructure_androidKt\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,192:1\n357#2,4:193\n329#2,6:197\n339#2,3:204\n342#2,9:208\n361#2:217\n357#2,4:218\n329#2,6:222\n339#2,3:229\n342#2,9:233\n361#2:242\n1399#3:203\n1270#3:207\n1399#3:228\n1270#3:232\n1#4:243\n34#5,6:244\n*S KotlinDebug\n*F\n+ 1 PopulateViewStructure.android.kt\nandroidx/compose/ui/autofill/PopulateViewStructure_androidKt\n*L\n70#1:193,4\n70#1:197,6\n70#1:204,3\n70#1:208,9\n70#1:217\n93#1:218,4\n93#1:222,6\n93#1:229,3\n93#1:233,9\n93#1:242\n70#1:203\n70#1:207\n93#1:228\n93#1:232\n160#1:244,6\n*E\n"
    }
.end annotation


# direct methods
.method public static final populate(Landroid/view/ViewStructure;Landroidx/compose/ui/semantics/SemanticsInfo;Landroid/view/autofill/AutofillId;Ljava/lang/String;Landroidx/compose/ui/spatial/RectManager;)V
    .locals 38
    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x1a
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    sget-object v0, Landroidx/compose/ui/autofill/AutofillApi26Helper;->INSTANCE:Landroidx/compose/ui/autofill/AutofillApi26Helper;

    .line 4
    .line 5
    sget-object v2, Landroidx/compose/ui/semantics/SemanticsProperties;->INSTANCE:Landroidx/compose/ui/semantics/SemanticsProperties;

    .line 6
    .line 7
    sget-object v3, Landroidx/compose/ui/semantics/SemanticsActions;->INSTANCE:Landroidx/compose/ui/semantics/SemanticsActions;

    .line 8
    .line 9
    invoke-interface/range {p1 .. p1}, Landroidx/compose/ui/semantics/SemanticsInfo;->getSemanticsConfiguration()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    const/4 v10, 0x2

    .line 14
    const/16 v13, 0x8

    .line 15
    .line 16
    const-wide/16 v16, 0x80

    .line 17
    .line 18
    if-eqz v4, :cond_13

    .line 19
    .line 20
    invoke-virtual {v4}, Landroidx/compose/ui/semantics/SemanticsConfiguration;->getProps$ui_release()Landroidx/collection/MutableScatterMap;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    if-eqz v4, :cond_13

    .line 25
    .line 26
    iget-object v5, v4, Landroidx/collection/ScatterMap;->keys:[Ljava/lang/Object;

    .line 27
    .line 28
    const-wide/16 v18, 0xff

    .line 29
    .line 30
    iget-object v7, v4, Landroidx/collection/ScatterMap;->values:[Ljava/lang/Object;

    .line 31
    .line 32
    iget-object v4, v4, Landroidx/collection/ScatterMap;->metadata:[J

    .line 33
    .line 34
    array-length v8, v4

    .line 35
    sub-int/2addr v8, v10

    .line 36
    move/from16 v30, v10

    .line 37
    .line 38
    if-ltz v8, :cond_11

    .line 39
    .line 40
    const/4 v9, 0x0

    .line 41
    const/16 v20, 0x7

    .line 42
    .line 43
    const/16 v21, 0x0

    .line 44
    .line 45
    const/16 v22, 0x0

    .line 46
    .line 47
    const/16 v23, 0x0

    .line 48
    .line 49
    const/16 v24, 0x0

    .line 50
    .line 51
    const/16 v25, 0x0

    .line 52
    .line 53
    const/16 v26, 0x0

    .line 54
    .line 55
    const/16 v27, 0x0

    .line 56
    .line 57
    const/16 v28, 0x0

    .line 58
    .line 59
    const/16 v29, 0x0

    .line 60
    .line 61
    const-wide v31, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    :goto_0
    aget-wide v10, v4, v9

    .line 67
    .line 68
    move-object/from16 v33, v7

    .line 69
    .line 70
    not-long v6, v10

    .line 71
    shl-long v6, v6, v20

    .line 72
    .line 73
    and-long/2addr v6, v10

    .line 74
    and-long v6, v6, v31

    .line 75
    .line 76
    cmp-long v6, v6, v31

    .line 77
    .line 78
    if-eqz v6, :cond_10

    .line 79
    .line 80
    sub-int v6, v9, v8

    .line 81
    .line 82
    not-int v6, v6

    .line 83
    ushr-int/lit8 v6, v6, 0x1f

    .line 84
    .line 85
    rsub-int/lit8 v6, v6, 0x8

    .line 86
    .line 87
    const/4 v7, 0x0

    .line 88
    :goto_1
    if-ge v7, v6, :cond_f

    .line 89
    .line 90
    and-long v34, v10, v18

    .line 91
    .line 92
    cmp-long v34, v34, v16

    .line 93
    .line 94
    if-gez v34, :cond_d

    .line 95
    .line 96
    shl-int/lit8 v34, v9, 0x3

    .line 97
    .line 98
    add-int v34, v34, v7

    .line 99
    .line 100
    aget-object v35, v5, v34

    .line 101
    .line 102
    aget-object v12, v33, v34

    .line 103
    .line 104
    move-object/from16 v15, v35

    .line 105
    .line 106
    check-cast v15, Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    .line 107
    .line 108
    move/from16 v35, v13

    .line 109
    .line 110
    invoke-virtual {v2}, Landroidx/compose/ui/semantics/SemanticsProperties;->getContentDataType()Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    .line 111
    .line 112
    .line 113
    move-result-object v13

    .line 114
    invoke-static {v15, v13}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v13

    .line 118
    if-eqz v13, :cond_0

    .line 119
    .line 120
    const-string/jumbo v13, "null cannot be cast to non-null type androidx.compose.ui.autofill.ContentDataType"

    .line 121
    .line 122
    .line 123
    invoke-static {v12, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    move-object/from16 v21, v12

    .line 127
    .line 128
    check-cast v21, Landroidx/compose/ui/autofill/ContentDataType;

    .line 129
    .line 130
    goto/16 :goto_2

    .line 131
    .line 132
    :cond_0
    invoke-virtual {v2}, Landroidx/compose/ui/semantics/SemanticsProperties;->getContentDescription()Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    .line 133
    .line 134
    .line 135
    move-result-object v13

    .line 136
    invoke-static {v15, v13}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-result v13

    .line 140
    if-eqz v13, :cond_1

    .line 141
    .line 142
    const-string/jumbo v13, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>"

    .line 143
    .line 144
    .line 145
    invoke-static {v12, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    check-cast v12, Ljava/util/List;

    .line 149
    .line 150
    invoke-static {v12}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v12

    .line 154
    check-cast v12, Ljava/lang/String;

    .line 155
    .line 156
    if-eqz v12, :cond_e

    .line 157
    .line 158
    invoke-virtual {v0, v1, v12}, Landroidx/compose/ui/autofill/AutofillApi26Helper;->setContentDescription(Landroid/view/ViewStructure;Ljava/lang/CharSequence;)V

    .line 159
    .line 160
    .line 161
    goto/16 :goto_2

    .line 162
    .line 163
    :cond_1
    invoke-virtual {v2}, Landroidx/compose/ui/semantics/SemanticsProperties;->getContentType()Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    .line 164
    .line 165
    .line 166
    move-result-object v13

    .line 167
    invoke-static {v15, v13}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    move-result v13

    .line 171
    if-eqz v13, :cond_2

    .line 172
    .line 173
    const-string/jumbo v13, "null cannot be cast to non-null type androidx.compose.ui.autofill.ContentType"

    .line 174
    .line 175
    .line 176
    invoke-static {v12, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    move-object/from16 v24, v12

    .line 180
    .line 181
    check-cast v24, Landroidx/compose/ui/autofill/ContentType;

    .line 182
    .line 183
    goto/16 :goto_2

    .line 184
    .line 185
    :cond_2
    invoke-virtual {v2}, Landroidx/compose/ui/semantics/SemanticsProperties;->getEditableText()Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    .line 186
    .line 187
    .line 188
    move-result-object v13

    .line 189
    invoke-static {v15, v13}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    move-result v13

    .line 193
    if-eqz v13, :cond_3

    .line 194
    .line 195
    const-string/jumbo v13, "null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString"

    .line 196
    .line 197
    .line 198
    invoke-static {v12, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    move-object/from16 v29, v12

    .line 202
    .line 203
    check-cast v29, Landroidx/compose/ui/text/AnnotatedString;

    .line 204
    .line 205
    goto/16 :goto_2

    .line 206
    .line 207
    :cond_3
    invoke-virtual {v2}, Landroidx/compose/ui/semantics/SemanticsProperties;->getFocused()Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    .line 208
    .line 209
    .line 210
    move-result-object v13

    .line 211
    invoke-static {v15, v13}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    move-result v13

    .line 215
    const-string/jumbo v14, "null cannot be cast to non-null type kotlin.Boolean"

    .line 216
    .line 217
    .line 218
    if-eqz v13, :cond_4

    .line 219
    .line 220
    invoke-static {v12, v14}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    check-cast v12, Ljava/lang/Boolean;

    .line 224
    .line 225
    invoke-virtual {v12}, Ljava/lang/Boolean;->booleanValue()Z

    .line 226
    .line 227
    .line 228
    move-result v12

    .line 229
    invoke-virtual {v0, v1, v12}, Landroidx/compose/ui/autofill/AutofillApi26Helper;->setFocused(Landroid/view/ViewStructure;Z)V

    .line 230
    .line 231
    .line 232
    goto/16 :goto_2

    .line 233
    .line 234
    :cond_4
    invoke-virtual {v2}, Landroidx/compose/ui/semantics/SemanticsProperties;->getMaxTextLength()Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    .line 235
    .line 236
    .line 237
    move-result-object v13

    .line 238
    invoke-static {v15, v13}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 239
    .line 240
    .line 241
    move-result v13

    .line 242
    if-eqz v13, :cond_5

    .line 243
    .line 244
    const-string/jumbo v13, "null cannot be cast to non-null type kotlin.Int"

    .line 245
    .line 246
    .line 247
    invoke-static {v12, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 248
    .line 249
    .line 250
    move-object/from16 v28, v12

    .line 251
    .line 252
    check-cast v28, Ljava/lang/Integer;

    .line 253
    .line 254
    goto/16 :goto_2

    .line 255
    .line 256
    :cond_5
    invoke-virtual {v2}, Landroidx/compose/ui/semantics/SemanticsProperties;->getPassword()Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    .line 257
    .line 258
    .line 259
    move-result-object v13

    .line 260
    invoke-static {v15, v13}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 261
    .line 262
    .line 263
    move-result v13

    .line 264
    if-eqz v13, :cond_6

    .line 265
    .line 266
    const/16 v27, 0x1

    .line 267
    .line 268
    goto/16 :goto_2

    .line 269
    .line 270
    :cond_6
    invoke-virtual {v2}, Landroidx/compose/ui/semantics/SemanticsProperties;->getRole()Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    .line 271
    .line 272
    .line 273
    move-result-object v13

    .line 274
    invoke-static {v15, v13}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 275
    .line 276
    .line 277
    move-result v13

    .line 278
    if-eqz v13, :cond_7

    .line 279
    .line 280
    const-string/jumbo v13, "null cannot be cast to non-null type androidx.compose.ui.semantics.Role"

    .line 281
    .line 282
    .line 283
    invoke-static {v12, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 284
    .line 285
    .line 286
    move-object/from16 v26, v12

    .line 287
    .line 288
    check-cast v26, Landroidx/compose/ui/semantics/Role;

    .line 289
    .line 290
    goto :goto_2

    .line 291
    :cond_7
    invoke-virtual {v2}, Landroidx/compose/ui/semantics/SemanticsProperties;->getSelected()Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    .line 292
    .line 293
    .line 294
    move-result-object v13

    .line 295
    invoke-static {v15, v13}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 296
    .line 297
    .line 298
    move-result v13

    .line 299
    if-eqz v13, :cond_8

    .line 300
    .line 301
    invoke-static {v12, v14}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 302
    .line 303
    .line 304
    move-object/from16 v25, v12

    .line 305
    .line 306
    check-cast v25, Ljava/lang/Boolean;

    .line 307
    .line 308
    goto :goto_2

    .line 309
    :cond_8
    invoke-virtual {v2}, Landroidx/compose/ui/semantics/SemanticsProperties;->getToggleableState()Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    .line 310
    .line 311
    .line 312
    move-result-object v13

    .line 313
    invoke-static {v15, v13}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 314
    .line 315
    .line 316
    move-result v13

    .line 317
    if-eqz v13, :cond_9

    .line 318
    .line 319
    const-string/jumbo v13, "null cannot be cast to non-null type androidx.compose.ui.state.ToggleableState"

    .line 320
    .line 321
    .line 322
    invoke-static {v12, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 323
    .line 324
    .line 325
    move-object/from16 v23, v12

    .line 326
    .line 327
    check-cast v23, Landroidx/compose/ui/state/ToggleableState;

    .line 328
    .line 329
    goto :goto_2

    .line 330
    :cond_9
    invoke-virtual {v3}, Landroidx/compose/ui/semantics/SemanticsActions;->getOnClick()Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    .line 331
    .line 332
    .line 333
    move-result-object v12

    .line 334
    invoke-static {v15, v12}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 335
    .line 336
    .line 337
    move-result v12

    .line 338
    if-eqz v12, :cond_a

    .line 339
    .line 340
    const/4 v12, 0x1

    .line 341
    invoke-virtual {v0, v1, v12}, Landroidx/compose/ui/autofill/AutofillApi26Helper;->setClickable(Landroid/view/ViewStructure;Z)V

    .line 342
    .line 343
    .line 344
    goto :goto_2

    .line 345
    :cond_a
    const/4 v12, 0x1

    .line 346
    invoke-virtual {v3}, Landroidx/compose/ui/semantics/SemanticsActions;->getOnLongClick()Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    .line 347
    .line 348
    .line 349
    move-result-object v13

    .line 350
    invoke-static {v15, v13}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 351
    .line 352
    .line 353
    move-result v13

    .line 354
    if-eqz v13, :cond_b

    .line 355
    .line 356
    invoke-virtual {v0, v1, v12}, Landroidx/compose/ui/autofill/AutofillApi26Helper;->setLongClickable(Landroid/view/ViewStructure;Z)V

    .line 357
    .line 358
    .line 359
    goto :goto_2

    .line 360
    :cond_b
    invoke-virtual {v3}, Landroidx/compose/ui/semantics/SemanticsActions;->getRequestFocus()Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    .line 361
    .line 362
    .line 363
    move-result-object v13

    .line 364
    invoke-static {v15, v13}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 365
    .line 366
    .line 367
    move-result v13

    .line 368
    if-eqz v13, :cond_c

    .line 369
    .line 370
    invoke-virtual {v0, v1, v12}, Landroidx/compose/ui/autofill/AutofillApi26Helper;->setFocusable(Landroid/view/ViewStructure;Z)V

    .line 371
    .line 372
    .line 373
    goto :goto_2

    .line 374
    :cond_c
    invoke-virtual {v3}, Landroidx/compose/ui/semantics/SemanticsActions;->getSetText()Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    .line 375
    .line 376
    .line 377
    move-result-object v12

    .line 378
    invoke-static {v15, v12}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 379
    .line 380
    .line 381
    move-result v12

    .line 382
    if-eqz v12, :cond_e

    .line 383
    .line 384
    const/16 v22, 0x1

    .line 385
    .line 386
    goto :goto_2

    .line 387
    :cond_d
    move/from16 v35, v13

    .line 388
    .line 389
    :cond_e
    :goto_2
    shr-long v10, v10, v35

    .line 390
    .line 391
    add-int/lit8 v7, v7, 0x1

    .line 392
    .line 393
    move/from16 v13, v35

    .line 394
    .line 395
    goto/16 :goto_1

    .line 396
    .line 397
    :cond_f
    move v7, v13

    .line 398
    if-ne v6, v7, :cond_12

    .line 399
    .line 400
    :cond_10
    if-eq v9, v8, :cond_12

    .line 401
    .line 402
    add-int/lit8 v9, v9, 0x1

    .line 403
    .line 404
    move-object/from16 v7, v33

    .line 405
    .line 406
    const/16 v13, 0x8

    .line 407
    .line 408
    goto/16 :goto_0

    .line 409
    .line 410
    :cond_11
    const/16 v20, 0x7

    .line 411
    .line 412
    const-wide v31, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    const/16 v21, 0x0

    .line 418
    .line 419
    const/16 v22, 0x0

    .line 420
    .line 421
    const/16 v23, 0x0

    .line 422
    .line 423
    const/16 v24, 0x0

    .line 424
    .line 425
    const/16 v25, 0x0

    .line 426
    .line 427
    const/16 v26, 0x0

    .line 428
    .line 429
    const/16 v27, 0x0

    .line 430
    .line 431
    const/16 v28, 0x0

    .line 432
    .line 433
    const/16 v29, 0x0

    .line 434
    .line 435
    :cond_12
    move-object/from16 v6, v23

    .line 436
    .line 437
    goto :goto_3

    .line 438
    :cond_13
    move/from16 v30, v10

    .line 439
    .line 440
    const-wide/16 v18, 0xff

    .line 441
    .line 442
    const/16 v20, 0x7

    .line 443
    .line 444
    const-wide v31, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    const/4 v6, 0x0

    .line 450
    const/16 v21, 0x0

    .line 451
    .line 452
    const/16 v22, 0x0

    .line 453
    .line 454
    const/16 v24, 0x0

    .line 455
    .line 456
    const/16 v25, 0x0

    .line 457
    .line 458
    const/16 v26, 0x0

    .line 459
    .line 460
    const/16 v27, 0x0

    .line 461
    .line 462
    const/16 v28, 0x0

    .line 463
    .line 464
    const/16 v29, 0x0

    .line 465
    .line 466
    :goto_3
    invoke-static/range {p1 .. p1}, Landroidx/compose/ui/semantics/SemanticsInfoKt;->mergedSemanticsConfiguration(Landroidx/compose/ui/semantics/SemanticsInfo;)Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 467
    .line 468
    .line 469
    move-result-object v3

    .line 470
    if-eqz v3, :cond_19

    .line 471
    .line 472
    invoke-virtual {v3}, Landroidx/compose/ui/semantics/SemanticsConfiguration;->getProps$ui_release()Landroidx/collection/MutableScatterMap;

    .line 473
    .line 474
    .line 475
    move-result-object v3

    .line 476
    if-eqz v3, :cond_19

    .line 477
    .line 478
    iget-object v4, v3, Landroidx/collection/ScatterMap;->keys:[Ljava/lang/Object;

    .line 479
    .line 480
    iget-object v5, v3, Landroidx/collection/ScatterMap;->values:[Ljava/lang/Object;

    .line 481
    .line 482
    iget-object v3, v3, Landroidx/collection/ScatterMap;->metadata:[J

    .line 483
    .line 484
    array-length v7, v3

    .line 485
    add-int/lit8 v7, v7, -0x2

    .line 486
    .line 487
    if-ltz v7, :cond_19

    .line 488
    .line 489
    const/4 v8, 0x0

    .line 490
    const/4 v9, 0x0

    .line 491
    :goto_4
    aget-wide v10, v3, v8

    .line 492
    .line 493
    not-long v12, v10

    .line 494
    shl-long v12, v12, v20

    .line 495
    .line 496
    and-long/2addr v12, v10

    .line 497
    and-long v12, v12, v31

    .line 498
    .line 499
    cmp-long v12, v12, v31

    .line 500
    .line 501
    if-eqz v12, :cond_18

    .line 502
    .line 503
    sub-int v12, v8, v7

    .line 504
    .line 505
    not-int v12, v12

    .line 506
    ushr-int/lit8 v12, v12, 0x1f

    .line 507
    .line 508
    const/16 v35, 0x8

    .line 509
    .line 510
    rsub-int/lit8 v13, v12, 0x8

    .line 511
    .line 512
    const/4 v12, 0x0

    .line 513
    :goto_5
    if-ge v12, v13, :cond_17

    .line 514
    .line 515
    and-long v14, v10, v18

    .line 516
    .line 517
    cmp-long v14, v14, v16

    .line 518
    .line 519
    if-gez v14, :cond_16

    .line 520
    .line 521
    shl-int/lit8 v14, v8, 0x3

    .line 522
    .line 523
    add-int/2addr v14, v12

    .line 524
    aget-object v15, v4, v14

    .line 525
    .line 526
    aget-object v14, v5, v14

    .line 527
    .line 528
    check-cast v15, Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    .line 529
    .line 530
    move-object/from16 v23, v2

    .line 531
    .line 532
    invoke-virtual/range {v23 .. v23}, Landroidx/compose/ui/semantics/SemanticsProperties;->getDisabled()Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    .line 533
    .line 534
    .line 535
    move-result-object v2

    .line 536
    invoke-static {v15, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 537
    .line 538
    .line 539
    move-result v2

    .line 540
    if-eqz v2, :cond_14

    .line 541
    .line 542
    const/4 v2, 0x0

    .line 543
    invoke-virtual {v0, v1, v2}, Landroidx/compose/ui/autofill/AutofillApi26Helper;->setEnabled(Landroid/view/ViewStructure;Z)V

    .line 544
    .line 545
    .line 546
    goto :goto_6

    .line 547
    :cond_14
    invoke-virtual/range {v23 .. v23}, Landroidx/compose/ui/semantics/SemanticsProperties;->getText()Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    .line 548
    .line 549
    .line 550
    move-result-object v2

    .line 551
    invoke-static {v15, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 552
    .line 553
    .line 554
    move-result v2

    .line 555
    if-eqz v2, :cond_15

    .line 556
    .line 557
    const-string/jumbo v2, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString>"

    .line 558
    .line 559
    .line 560
    invoke-static {v14, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 561
    .line 562
    .line 563
    move-object v9, v14

    .line 564
    check-cast v9, Ljava/util/List;

    .line 565
    .line 566
    :cond_15
    :goto_6
    const/16 v2, 0x8

    .line 567
    .line 568
    goto :goto_7

    .line 569
    :cond_16
    move-object/from16 v23, v2

    .line 570
    .line 571
    goto :goto_6

    .line 572
    :goto_7
    shr-long/2addr v10, v2

    .line 573
    add-int/lit8 v12, v12, 0x1

    .line 574
    .line 575
    move-object/from16 v2, v23

    .line 576
    .line 577
    goto :goto_5

    .line 578
    :cond_17
    move-object/from16 v23, v2

    .line 579
    .line 580
    const/16 v2, 0x8

    .line 581
    .line 582
    if-ne v13, v2, :cond_1a

    .line 583
    .line 584
    goto :goto_8

    .line 585
    :cond_18
    move-object/from16 v23, v2

    .line 586
    .line 587
    const/16 v2, 0x8

    .line 588
    .line 589
    :goto_8
    if-eq v8, v7, :cond_1a

    .line 590
    .line 591
    add-int/lit8 v8, v8, 0x1

    .line 592
    .line 593
    move-object/from16 v2, v23

    .line 594
    .line 595
    goto :goto_4

    .line 596
    :cond_19
    const/4 v9, 0x0

    .line 597
    :cond_1a
    invoke-interface/range {p1 .. p1}, Landroidx/compose/ui/layout/LayoutInfo;->getSemanticsId()I

    .line 598
    .line 599
    .line 600
    move-result v2

    .line 601
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 602
    .line 603
    .line 604
    move-result-object v2

    .line 605
    invoke-interface/range {p1 .. p1}, Landroidx/compose/ui/semantics/SemanticsInfo;->getParentInfo()Landroidx/compose/ui/semantics/SemanticsInfo;

    .line 606
    .line 607
    .line 608
    move-result-object v3

    .line 609
    if-nez v3, :cond_1b

    .line 610
    .line 611
    const/4 v2, 0x0

    .line 612
    :cond_1b
    if-eqz v2, :cond_1c

    .line 613
    .line 614
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 615
    .line 616
    .line 617
    move-result v2

    .line 618
    :goto_9
    move-object/from16 v3, p2

    .line 619
    .line 620
    goto :goto_a

    .line 621
    :cond_1c
    const/4 v2, -0x1

    .line 622
    goto :goto_9

    .line 623
    :goto_a
    invoke-virtual {v0, v1, v3, v2}, Landroidx/compose/ui/autofill/AutofillApi26Helper;->setAutofillId(Landroid/view/ViewStructure;Landroid/view/autofill/AutofillId;I)V

    .line 624
    .line 625
    .line 626
    const/4 v4, 0x0

    .line 627
    const/4 v5, 0x0

    .line 628
    move-object/from16 v3, p3

    .line 629
    .line 630
    const/16 v36, 0x0

    .line 631
    .line 632
    invoke-virtual/range {v0 .. v5}, Landroidx/compose/ui/autofill/AutofillApi26Helper;->setId(Landroid/view/ViewStructure;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 633
    .line 634
    .line 635
    if-eqz v21, :cond_1d

    .line 636
    .line 637
    invoke-static/range {v21 .. v21}, Landroidx/compose/ui/autofill/ContentDataType_androidKt;->getDataType(Landroidx/compose/ui/autofill/ContentDataType;)I

    .line 638
    .line 639
    .line 640
    move-result v2

    .line 641
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 642
    .line 643
    .line 644
    move-result-object v15

    .line 645
    goto :goto_b

    .line 646
    :cond_1d
    if-eqz v22, :cond_1e

    .line 647
    .line 648
    const/16 v37, 0x1

    .line 649
    .line 650
    invoke-static/range {v37 .. v37}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 651
    .line 652
    .line 653
    move-result-object v15

    .line 654
    goto :goto_b

    .line 655
    :cond_1e
    if-eqz v6, :cond_1f

    .line 656
    .line 657
    invoke-static/range {v30 .. v30}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 658
    .line 659
    .line 660
    move-result-object v15

    .line 661
    goto :goto_b

    .line 662
    :cond_1f
    const/4 v15, 0x0

    .line 663
    :goto_b
    if-eqz v15, :cond_20

    .line 664
    .line 665
    invoke-virtual {v15}, Ljava/lang/Number;->intValue()I

    .line 666
    .line 667
    .line 668
    move-result v2

    .line 669
    invoke-virtual {v0, v1, v2}, Landroidx/compose/ui/autofill/AutofillApi26Helper;->setAutofillType(Landroid/view/ViewStructure;I)V

    .line 670
    .line 671
    .line 672
    :cond_20
    if-eqz v24, :cond_21

    .line 673
    .line 674
    invoke-static/range {v24 .. v24}, Landroidx/compose/ui/autofill/ContentType_androidKt;->getContentHints(Landroidx/compose/ui/autofill/ContentType;)[Ljava/lang/String;

    .line 675
    .line 676
    .line 677
    move-result-object v2

    .line 678
    if-eqz v2, :cond_21

    .line 679
    .line 680
    invoke-virtual {v0, v1, v2}, Landroidx/compose/ui/autofill/AutofillApi26Helper;->setAutofillHints(Landroid/view/ViewStructure;[Ljava/lang/String;)V

    .line 681
    .line 682
    .line 683
    :cond_21
    invoke-virtual/range {p4 .. p4}, Landroidx/compose/ui/spatial/RectManager;->getRects()Landroidx/compose/ui/spatial/RectList;

    .line 684
    .line 685
    .line 686
    move-result-object v2

    .line 687
    invoke-interface/range {p1 .. p1}, Landroidx/compose/ui/layout/LayoutInfo;->getSemanticsId()I

    .line 688
    .line 689
    .line 690
    move-result v3

    .line 691
    new-instance v4, Landroidx/compose/ui/autofill/PopulateViewStructure_androidKt$populate$5;

    .line 692
    .line 693
    invoke-direct {v4, v0, v1}, Landroidx/compose/ui/autofill/PopulateViewStructure_androidKt$populate$5;-><init>(Landroidx/compose/ui/autofill/AutofillApi26Helper;Landroid/view/ViewStructure;)V

    .line 694
    .line 695
    .line 696
    invoke-virtual {v2, v3, v4}, Landroidx/compose/ui/spatial/RectList;->withRect(ILkotlin/jvm/functions/Function4;)Z

    .line 697
    .line 698
    .line 699
    if-eqz v25, :cond_22

    .line 700
    .line 701
    invoke-virtual/range {v25 .. v25}, Ljava/lang/Boolean;->booleanValue()Z

    .line 702
    .line 703
    .line 704
    move-result v2

    .line 705
    invoke-virtual {v0, v1, v2}, Landroidx/compose/ui/autofill/AutofillApi26Helper;->setSelected(Landroid/view/ViewStructure;Z)V

    .line 706
    .line 707
    .line 708
    :cond_22
    if-eqz v6, :cond_24

    .line 709
    .line 710
    const/4 v12, 0x1

    .line 711
    invoke-virtual {v0, v1, v12}, Landroidx/compose/ui/autofill/AutofillApi26Helper;->setCheckable(Landroid/view/ViewStructure;Z)V

    .line 712
    .line 713
    .line 714
    sget-object v2, Landroidx/compose/ui/state/ToggleableState;->On:Landroidx/compose/ui/state/ToggleableState;

    .line 715
    .line 716
    if-ne v6, v2, :cond_23

    .line 717
    .line 718
    const/4 v2, 0x1

    .line 719
    goto :goto_c

    .line 720
    :cond_23
    move/from16 v2, v36

    .line 721
    .line 722
    :goto_c
    invoke-virtual {v0, v1, v2}, Landroidx/compose/ui/autofill/AutofillApi26Helper;->setChecked(Landroid/view/ViewStructure;Z)V

    .line 723
    .line 724
    .line 725
    goto :goto_e

    .line 726
    :cond_24
    if-eqz v25, :cond_26

    .line 727
    .line 728
    sget-object v2, Landroidx/compose/ui/semantics/Role;->Companion:Landroidx/compose/ui/semantics/Role$Companion;

    .line 729
    .line 730
    invoke-virtual {v2}, Landroidx/compose/ui/semantics/Role$Companion;->getTab-o7Vup1c()I

    .line 731
    .line 732
    .line 733
    move-result v2

    .line 734
    if-nez v26, :cond_25

    .line 735
    .line 736
    move/from16 v2, v36

    .line 737
    .line 738
    goto :goto_d

    .line 739
    :cond_25
    invoke-virtual/range {v26 .. v26}, Landroidx/compose/ui/semantics/Role;->unbox-impl()I

    .line 740
    .line 741
    .line 742
    move-result v3

    .line 743
    invoke-static {v3, v2}, Landroidx/compose/ui/semantics/Role;->equals-impl0(II)Z

    .line 744
    .line 745
    .line 746
    move-result v2

    .line 747
    :goto_d
    if-nez v2, :cond_26

    .line 748
    .line 749
    const/4 v12, 0x1

    .line 750
    invoke-virtual {v0, v1, v12}, Landroidx/compose/ui/autofill/AutofillApi26Helper;->setCheckable(Landroid/view/ViewStructure;Z)V

    .line 751
    .line 752
    .line 753
    invoke-virtual/range {v25 .. v25}, Ljava/lang/Boolean;->booleanValue()Z

    .line 754
    .line 755
    .line 756
    move-result v2

    .line 757
    invoke-virtual {v0, v1, v2}, Landroidx/compose/ui/autofill/AutofillApi26Helper;->setChecked(Landroid/view/ViewStructure;Z)V

    .line 758
    .line 759
    .line 760
    :cond_26
    :goto_e
    sget-object v2, Landroidx/compose/ui/autofill/ContentType;->Companion:Landroidx/compose/ui/autofill/ContentType$Companion;

    .line 761
    .line 762
    invoke-virtual {v2}, Landroidx/compose/ui/autofill/ContentType$Companion;->getPassword()Landroidx/compose/ui/autofill/ContentType;

    .line 763
    .line 764
    .line 765
    move-result-object v2

    .line 766
    invoke-static {v2}, Landroidx/compose/ui/autofill/ContentType_androidKt;->getContentHints(Landroidx/compose/ui/autofill/ContentType;)[Ljava/lang/String;

    .line 767
    .line 768
    .line 769
    move-result-object v2

    .line 770
    invoke-static {v2}, Lkotlin/collections/ArraysKt;->first([Ljava/lang/Object;)Ljava/lang/Object;

    .line 771
    .line 772
    .line 773
    move-result-object v2

    .line 774
    check-cast v2, Ljava/lang/String;

    .line 775
    .line 776
    if-eqz v24, :cond_27

    .line 777
    .line 778
    invoke-static/range {v24 .. v24}, Landroidx/compose/ui/autofill/ContentType_androidKt;->getContentHints(Landroidx/compose/ui/autofill/ContentType;)[Ljava/lang/String;

    .line 779
    .line 780
    .line 781
    move-result-object v3

    .line 782
    if-eqz v3, :cond_27

    .line 783
    .line 784
    invoke-static {v3, v2}, Lkotlin/collections/ArraysKt;->contains([Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 785
    .line 786
    .line 787
    move-result v2

    .line 788
    const/4 v12, 0x1

    .line 789
    if-ne v2, v12, :cond_27

    .line 790
    .line 791
    const/4 v2, 0x1

    .line 792
    goto :goto_f

    .line 793
    :cond_27
    move/from16 v2, v36

    .line 794
    .line 795
    :goto_f
    if-nez v27, :cond_29

    .line 796
    .line 797
    if-eqz v2, :cond_28

    .line 798
    .line 799
    goto :goto_10

    .line 800
    :cond_28
    move/from16 v2, v36

    .line 801
    .line 802
    goto :goto_11

    .line 803
    :cond_29
    :goto_10
    const/4 v2, 0x1

    .line 804
    :goto_11
    if-eqz v2, :cond_2a

    .line 805
    .line 806
    const/4 v12, 0x1

    .line 807
    invoke-virtual {v0, v1, v12}, Landroidx/compose/ui/autofill/AutofillApi26Helper;->setDataIsSensitive(Landroid/view/ViewStructure;Z)V

    .line 808
    .line 809
    .line 810
    :cond_2a
    invoke-interface/range {p1 .. p1}, Landroidx/compose/ui/semantics/SemanticsInfo;->isTransparent()Z

    .line 811
    .line 812
    .line 813
    move-result v3

    .line 814
    if-eqz v3, :cond_2b

    .line 815
    .line 816
    const/4 v3, 0x4

    .line 817
    goto :goto_12

    .line 818
    :cond_2b
    move/from16 v3, v36

    .line 819
    .line 820
    :goto_12
    invoke-virtual {v0, v1, v3}, Landroidx/compose/ui/autofill/AutofillApi26Helper;->setVisibility(Landroid/view/ViewStructure;I)V

    .line 821
    .line 822
    .line 823
    if-eqz v9, :cond_2d

    .line 824
    .line 825
    invoke-interface {v9}, Ljava/util/Collection;->size()I

    .line 826
    .line 827
    .line 828
    move-result v3

    .line 829
    const-string v4, ""

    .line 830
    .line 831
    move/from16 v6, v36

    .line 832
    .line 833
    :goto_13
    if-ge v6, v3, :cond_2c

    .line 834
    .line 835
    invoke-interface {v9, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 836
    .line 837
    .line 838
    move-result-object v5

    .line 839
    check-cast v5, Landroidx/compose/ui/text/AnnotatedString;

    .line 840
    .line 841
    new-instance v7, Ljava/lang/StringBuilder;

    .line 842
    .line 843
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 844
    .line 845
    .line 846
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 847
    .line 848
    .line 849
    invoke-virtual {v5}, Landroidx/compose/ui/text/AnnotatedString;->getText()Ljava/lang/String;

    .line 850
    .line 851
    .line 852
    move-result-object v4

    .line 853
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 854
    .line 855
    .line 856
    const/16 v4, 0xa

    .line 857
    .line 858
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 859
    .line 860
    .line 861
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 862
    .line 863
    .line 864
    move-result-object v4

    .line 865
    add-int/lit8 v6, v6, 0x1

    .line 866
    .line 867
    goto :goto_13

    .line 868
    :cond_2c
    invoke-virtual {v0, v1, v4}, Landroidx/compose/ui/autofill/AutofillApi26Helper;->setText(Landroid/view/ViewStructure;Ljava/lang/CharSequence;)V

    .line 869
    .line 870
    .line 871
    const-string v3, "android.widget.TextView"

    .line 872
    .line 873
    invoke-virtual {v0, v1, v3}, Landroidx/compose/ui/autofill/AutofillApi26Helper;->setClassName(Landroid/view/ViewStructure;Ljava/lang/String;)V

    .line 874
    .line 875
    .line 876
    :cond_2d
    invoke-interface/range {p1 .. p1}, Landroidx/compose/ui/semantics/SemanticsInfo;->getChildrenInfo()Ljava/util/List;

    .line 877
    .line 878
    .line 879
    move-result-object v3

    .line 880
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 881
    .line 882
    .line 883
    move-result v3

    .line 884
    if-eqz v3, :cond_2e

    .line 885
    .line 886
    if-eqz v26, :cond_2e

    .line 887
    .line 888
    invoke-virtual/range {v26 .. v26}, Landroidx/compose/ui/semantics/Role;->unbox-impl()I

    .line 889
    .line 890
    .line 891
    move-result v3

    .line 892
    invoke-static {v3}, Landroidx/compose/ui/platform/SemanticsUtils_androidKt;->toLegacyClassName-V4PA4sw(I)Ljava/lang/String;

    .line 893
    .line 894
    .line 895
    move-result-object v3

    .line 896
    if-eqz v3, :cond_2e

    .line 897
    .line 898
    invoke-virtual {v0, v1, v3}, Landroidx/compose/ui/autofill/AutofillApi26Helper;->setClassName(Landroid/view/ViewStructure;Ljava/lang/String;)V

    .line 899
    .line 900
    .line 901
    :cond_2e
    if-eqz v22, :cond_31

    .line 902
    .line 903
    const-string v3, "android.widget.EditText"

    .line 904
    .line 905
    invoke-virtual {v0, v1, v3}, Landroidx/compose/ui/autofill/AutofillApi26Helper;->setClassName(Landroid/view/ViewStructure;Ljava/lang/String;)V

    .line 906
    .line 907
    .line 908
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 909
    .line 910
    const/16 v4, 0x1c

    .line 911
    .line 912
    if-lt v3, v4, :cond_2f

    .line 913
    .line 914
    if-eqz v28, :cond_2f

    .line 915
    .line 916
    invoke-virtual/range {v28 .. v28}, Ljava/lang/Number;->intValue()I

    .line 917
    .line 918
    .line 919
    move-result v3

    .line 920
    sget-object v4, Landroidx/compose/ui/autofill/AutofillApi28Helper;->INSTANCE:Landroidx/compose/ui/autofill/AutofillApi28Helper;

    .line 921
    .line 922
    invoke-virtual {v4, v1, v3}, Landroidx/compose/ui/autofill/AutofillApi28Helper;->setMaxTextLength(Landroid/view/ViewStructure;I)V

    .line 923
    .line 924
    .line 925
    :cond_2f
    if-eqz v29, :cond_30

    .line 926
    .line 927
    invoke-virtual/range {v29 .. v29}, Landroidx/compose/ui/text/AnnotatedString;->getText()Ljava/lang/String;

    .line 928
    .line 929
    .line 930
    move-result-object v3

    .line 931
    invoke-virtual {v0, v3}, Landroidx/compose/ui/autofill/AutofillApi26Helper;->getAutofillTextValue(Ljava/lang/String;)Landroid/view/autofill/AutofillValue;

    .line 932
    .line 933
    .line 934
    move-result-object v3

    .line 935
    invoke-virtual {v0, v1, v3}, Landroidx/compose/ui/autofill/AutofillApi26Helper;->setAutofillValue(Landroid/view/ViewStructure;Landroid/view/autofill/AutofillValue;)V

    .line 936
    .line 937
    .line 938
    :cond_30
    if-eqz v2, :cond_31

    .line 939
    .line 940
    const/16 v2, 0x81

    .line 941
    .line 942
    invoke-virtual {v0, v1, v2}, Landroidx/compose/ui/autofill/AutofillApi26Helper;->setInputType(Landroid/view/ViewStructure;I)V

    .line 943
    .line 944
    .line 945
    :cond_31
    return-void
.end method
