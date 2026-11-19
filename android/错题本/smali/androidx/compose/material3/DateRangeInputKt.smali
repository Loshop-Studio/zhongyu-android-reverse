.class public final Landroidx/compose/material3/DateRangeInputKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0087\u0001\u0010\u0014\u001a\u00020\u00082\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u00002:\u0010\t\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u0000\u00a2\u0006\u000c\u0008\u0004\u0012\u0008\u0008\u0005\u0012\u0004\u0008\u0008(\u0006\u0012\u0015\u0012\u0013\u0018\u00010\u0000\u00a2\u0006\u000c\u0008\u0004\u0012\u0008\u0008\u0005\u0012\u0004\u0008\u0008(\u0007\u0012\u0004\u0012\u00020\u00080\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001\u00a2\u0006\u0004\u0008\u0014\u0010\u0015\"\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u0019"
    }
    d2 = {
        "",
        "selectedStartDateMillis",
        "selectedEndDateMillis",
        "Lkotlin/Function2;",
        "Lkotlin/ParameterName;",
        "name",
        "startDateMillis",
        "endDateMillis",
        "Ld6/s;",
        "onDatesSelectionChange",
        "Landroidx/compose/material3/internal/CalendarModel;",
        "calendarModel",
        "Lx6/f;",
        "yearRange",
        "Landroidx/compose/material3/DatePickerFormatter;",
        "dateFormatter",
        "Landroidx/compose/material3/SelectableDates;",
        "selectableDates",
        "Landroidx/compose/material3/DatePickerColors;",
        "colors",
        "DateRangeInputContent",
        "(Ljava/lang/Long;Ljava/lang/Long;Lr6/e;Landroidx/compose/material3/internal/CalendarModel;Lx6/f;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V",
        "Landroidx/compose/ui/unit/Dp;",
        "TextFieldSpacing",
        "F",
        "material3_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nDateRangeInput.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateRangeInput.kt\nandroidx/compose/material3/DateRangeInputKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Strings.android.kt\nandroidx/compose/material3/internal/Strings$Companion\n+ 4 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,125:1\n1223#2,6:126\n1223#2,6:136\n1223#2,6:178\n1223#2,6:185\n141#3:132\n144#3:133\n138#3:134\n174#3:135\n156#3:177\n159#3:184\n98#4:142\n96#4,5:143\n101#4:176\n105#4:194\n78#5,6:148\n85#5,4:163\n89#5,2:173\n93#5:193\n368#6,9:154\n377#6:175\n378#6,2:191\n4032#7,6:167\n148#8:195\n*S KotlinDebug\n*F\n+ 1 DateRangeInput.kt\nandroidx/compose/material3/DateRangeInputKt\n*L\n48#1:126,6\n54#1:136,6\n89#1:178,6\n111#1:185,6\n49#1:132\n50#1:133\n51#1:134\n52#1:135\n76#1:177\n99#1:184\n71#1:142\n71#1:143,5\n71#1:176\n71#1:194\n71#1:148,6\n71#1:163,4\n71#1:173,2\n71#1:193\n71#1:154,9\n71#1:175\n71#1:191,2\n71#1:167,6\n124#1:195\n*E\n"
    }
.end annotation


# static fields
.field private static final TextFieldSpacing:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    int-to-float v0, v0

    .line 4
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    sput v0, Landroidx/compose/material3/DateRangeInputKt;->TextFieldSpacing:F

    .line 9
    .line 10
    return-void
.end method

.method public static final DateRangeInputContent(Ljava/lang/Long;Ljava/lang/Long;Lr6/e;Landroidx/compose/material3/internal/CalendarModel;Lx6/f;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V
    .locals 31
    .param p0    # Ljava/lang/Long;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p1    # Ljava/lang/Long;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lr6/e;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Landroidx/compose/material3/internal/CalendarModel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lx6/f;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Landroidx/compose/material3/DatePickerFormatter;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Landroidx/compose/material3/SelectableDates;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p7    # Landroidx/compose/material3/DatePickerColors;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p8    # Landroidx/compose/runtime/Composer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableTarget;
        applier = "androidx.compose.ui.UiComposable"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Long;",
            "Ljava/lang/Long;",
            "Lr6/e;",
            "Landroidx/compose/material3/internal/CalendarModel;",
            "Lx6/f;",
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
    move-object/from16 v14, p1

    .line 4
    .line 5
    move-object/from16 v15, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    move-object/from16 v6, p5

    .line 10
    .line 11
    move/from16 v0, p9

    .line 12
    .line 13
    const v2, -0x2435b34e

    .line 14
    .line 15
    .line 16
    move-object/from16 v4, p8

    .line 17
    .line 18
    invoke-interface {v4, v2}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 19
    .line 20
    .line 21
    move-result-object v11

    .line 22
    and-int/lit8 v4, v0, 0x6

    .line 23
    .line 24
    if-nez v4, :cond_1

    .line 25
    .line 26
    invoke-interface {v11, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    if-eqz v4, :cond_0

    .line 31
    .line 32
    const/4 v4, 0x4

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const/4 v4, 0x2

    .line 35
    :goto_0
    or-int/2addr v4, v0

    .line 36
    goto :goto_1

    .line 37
    :cond_1
    move v4, v0

    .line 38
    :goto_1
    and-int/lit8 v7, v0, 0x30

    .line 39
    .line 40
    if-nez v7, :cond_3

    .line 41
    .line 42
    invoke-interface {v11, v14}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v7

    .line 46
    if-eqz v7, :cond_2

    .line 47
    .line 48
    const/16 v7, 0x20

    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_2
    const/16 v7, 0x10

    .line 52
    .line 53
    :goto_2
    or-int/2addr v4, v7

    .line 54
    :cond_3
    and-int/lit16 v7, v0, 0x180

    .line 55
    .line 56
    if-nez v7, :cond_5

    .line 57
    .line 58
    invoke-interface {v11, v15}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v7

    .line 62
    if-eqz v7, :cond_4

    .line 63
    .line 64
    const/16 v7, 0x100

    .line 65
    .line 66
    goto :goto_3

    .line 67
    :cond_4
    const/16 v7, 0x80

    .line 68
    .line 69
    :goto_3
    or-int/2addr v4, v7

    .line 70
    :cond_5
    and-int/lit16 v7, v0, 0xc00

    .line 71
    .line 72
    if-nez v7, :cond_7

    .line 73
    .line 74
    invoke-interface {v11, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v7

    .line 78
    if-eqz v7, :cond_6

    .line 79
    .line 80
    const/16 v7, 0x800

    .line 81
    .line 82
    goto :goto_4

    .line 83
    :cond_6
    const/16 v7, 0x400

    .line 84
    .line 85
    :goto_4
    or-int/2addr v4, v7

    .line 86
    :cond_7
    and-int/lit16 v7, v0, 0x6000

    .line 87
    .line 88
    if-nez v7, :cond_9

    .line 89
    .line 90
    move-object/from16 v7, p4

    .line 91
    .line 92
    invoke-interface {v11, v7}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v10

    .line 96
    if-eqz v10, :cond_8

    .line 97
    .line 98
    const/16 v10, 0x4000

    .line 99
    .line 100
    goto :goto_5

    .line 101
    :cond_8
    const/16 v10, 0x2000

    .line 102
    .line 103
    :goto_5
    or-int/2addr v4, v10

    .line 104
    goto :goto_6

    .line 105
    :cond_9
    move-object/from16 v7, p4

    .line 106
    .line 107
    :goto_6
    const/high16 v10, 0x30000

    .line 108
    .line 109
    and-int/2addr v10, v0

    .line 110
    const/high16 v12, 0x20000

    .line 111
    .line 112
    const/high16 v13, 0x40000

    .line 113
    .line 114
    if-nez v10, :cond_c

    .line 115
    .line 116
    and-int v10, v0, v13

    .line 117
    .line 118
    if-nez v10, :cond_a

    .line 119
    .line 120
    invoke-interface {v11, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v10

    .line 124
    goto :goto_7

    .line 125
    :cond_a
    invoke-interface {v11, v6}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result v10

    .line 129
    :goto_7
    if-eqz v10, :cond_b

    .line 130
    .line 131
    move v10, v12

    .line 132
    goto :goto_8

    .line 133
    :cond_b
    const/high16 v10, 0x10000

    .line 134
    .line 135
    :goto_8
    or-int/2addr v4, v10

    .line 136
    :cond_c
    const/high16 v10, 0x180000

    .line 137
    .line 138
    and-int/2addr v10, v0

    .line 139
    if-nez v10, :cond_e

    .line 140
    .line 141
    move-object/from16 v10, p6

    .line 142
    .line 143
    invoke-interface {v11, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    move-result v16

    .line 147
    if-eqz v16, :cond_d

    .line 148
    .line 149
    const/high16 v16, 0x100000

    .line 150
    .line 151
    goto :goto_9

    .line 152
    :cond_d
    const/high16 v16, 0x80000

    .line 153
    .line 154
    :goto_9
    or-int v4, v4, v16

    .line 155
    .line 156
    goto :goto_a

    .line 157
    :cond_e
    move-object/from16 v10, p6

    .line 158
    .line 159
    :goto_a
    const/high16 v16, 0xc00000

    .line 160
    .line 161
    and-int v16, v0, v16

    .line 162
    .line 163
    move-object/from16 v5, p7

    .line 164
    .line 165
    if-nez v16, :cond_10

    .line 166
    .line 167
    invoke-interface {v11, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    move-result v16

    .line 171
    if-eqz v16, :cond_f

    .line 172
    .line 173
    const/high16 v16, 0x800000

    .line 174
    .line 175
    goto :goto_b

    .line 176
    :cond_f
    const/high16 v16, 0x400000

    .line 177
    .line 178
    :goto_b
    or-int v4, v4, v16

    .line 179
    .line 180
    :cond_10
    const v16, 0x492493

    .line 181
    .line 182
    .line 183
    move/from16 v17, v13

    .line 184
    .line 185
    and-int v13, v4, v16

    .line 186
    .line 187
    const v8, 0x492492

    .line 188
    .line 189
    .line 190
    if-ne v13, v8, :cond_12

    .line 191
    .line 192
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 193
    .line 194
    .line 195
    move-result v8

    .line 196
    if-nez v8, :cond_11

    .line 197
    .line 198
    goto :goto_c

    .line 199
    :cond_11
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 200
    .line 201
    .line 202
    goto/16 :goto_15

    .line 203
    .line 204
    :cond_12
    :goto_c
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 205
    .line 206
    .line 207
    move-result v8

    .line 208
    if-eqz v8, :cond_13

    .line 209
    .line 210
    const/4 v8, -0x1

    .line 211
    const-string v13, "androidx.compose.material3.DateRangeInputContent (DateRangeInput.kt:43)"

    .line 212
    .line 213
    invoke-static {v2, v4, v8, v13}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 214
    .line 215
    .line 216
    :cond_13
    const/4 v2, 0x0

    .line 217
    invoke-static {v11, v2}, Landroidx/compose/material3/CalendarLocale_androidKt;->defaultLocale(Landroidx/compose/runtime/Composer;I)Ljava/util/Locale;

    .line 218
    .line 219
    .line 220
    move-result-object v8

    .line 221
    invoke-interface {v11, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    move-result v13

    .line 225
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v9

    .line 229
    if-nez v13, :cond_14

    .line 230
    .line 231
    sget-object v13, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 232
    .line 233
    invoke-virtual {v13}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v13

    .line 237
    if-ne v9, v13, :cond_15

    .line 238
    .line 239
    :cond_14
    invoke-virtual {v3, v8}, Landroidx/compose/material3/internal/CalendarModel;->getDateInputFormat(Ljava/util/Locale;)Landroidx/compose/material3/internal/DateInputFormat;

    .line 240
    .line 241
    .line 242
    move-result-object v9

    .line 243
    invoke-interface {v11, v9}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 244
    .line 245
    .line 246
    :cond_15
    check-cast v9, Landroidx/compose/material3/internal/DateInputFormat;

    .line 247
    .line 248
    sget-object v13, Landroidx/compose/material3/internal/Strings;->Companion:Landroidx/compose/material3/internal/Strings$Companion;

    .line 249
    .line 250
    sget v13, Landroidx/compose/material3/R$string;->m3c_date_input_invalid_for_pattern:I

    .line 251
    .line 252
    invoke-static {v13}, Landroidx/compose/material3/internal/Strings;->constructor-impl(I)I

    .line 253
    .line 254
    .line 255
    move-result v13

    .line 256
    invoke-static {v13, v11, v2}, Landroidx/compose/material3/internal/Strings_androidKt;->getString-2EP1pXo(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v21

    .line 260
    sget v13, Landroidx/compose/material3/R$string;->m3c_date_input_invalid_year_range:I

    .line 261
    .line 262
    invoke-static {v13}, Landroidx/compose/material3/internal/Strings;->constructor-impl(I)I

    .line 263
    .line 264
    .line 265
    move-result v13

    .line 266
    invoke-static {v13, v11, v2}, Landroidx/compose/material3/internal/Strings_androidKt;->getString-2EP1pXo(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v22

    .line 270
    sget v13, Landroidx/compose/material3/R$string;->m3c_date_input_invalid_not_allowed:I

    .line 271
    .line 272
    invoke-static {v13}, Landroidx/compose/material3/internal/Strings;->constructor-impl(I)I

    .line 273
    .line 274
    .line 275
    move-result v13

    .line 276
    invoke-static {v13, v11, v2}, Landroidx/compose/material3/internal/Strings_androidKt;->getString-2EP1pXo(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object v23

    .line 280
    sget v13, Landroidx/compose/material3/R$string;->m3c_date_range_input_invalid_range_input:I

    .line 281
    .line 282
    invoke-static {v13}, Landroidx/compose/material3/internal/Strings;->constructor-impl(I)I

    .line 283
    .line 284
    .line 285
    move-result v13

    .line 286
    invoke-static {v13, v11, v2}, Landroidx/compose/material3/internal/Strings_androidKt;->getString-2EP1pXo(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object v24

    .line 290
    invoke-interface {v11, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 291
    .line 292
    .line 293
    move-result v13

    .line 294
    const/high16 v16, 0x70000

    .line 295
    .line 296
    and-int v2, v4, v16

    .line 297
    .line 298
    if-eq v2, v12, :cond_17

    .line 299
    .line 300
    and-int v2, v4, v17

    .line 301
    .line 302
    if-eqz v2, :cond_16

    .line 303
    .line 304
    invoke-interface {v11, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 305
    .line 306
    .line 307
    move-result v2

    .line 308
    if-eqz v2, :cond_16

    .line 309
    .line 310
    goto :goto_d

    .line 311
    :cond_16
    const/4 v2, 0x0

    .line 312
    goto :goto_e

    .line 313
    :cond_17
    :goto_d
    const/4 v2, 0x1

    .line 314
    :goto_e
    or-int/2addr v2, v13

    .line 315
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    move-result-object v12

    .line 319
    if-nez v2, :cond_19

    .line 320
    .line 321
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 322
    .line 323
    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    move-result-object v2

    .line 327
    if-ne v12, v2, :cond_18

    .line 328
    .line 329
    goto :goto_f

    .line 330
    :cond_18
    move-object/from16 v19, v9

    .line 331
    .line 332
    goto :goto_10

    .line 333
    :cond_19
    :goto_f
    new-instance v16, Landroidx/compose/material3/DateInputValidator;

    .line 334
    .line 335
    const/16 v27, 0x300

    .line 336
    .line 337
    const/16 v28, 0x0

    .line 338
    .line 339
    const/16 v25, 0x0

    .line 340
    .line 341
    const/16 v26, 0x0

    .line 342
    .line 343
    move-object/from16 v20, v6

    .line 344
    .line 345
    move-object/from16 v17, v7

    .line 346
    .line 347
    move-object/from16 v19, v9

    .line 348
    .line 349
    move-object/from16 v18, v10

    .line 350
    .line 351
    invoke-direct/range {v16 .. v28}, Landroidx/compose/material3/DateInputValidator;-><init>(Lx6/f;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/internal/DateInputFormat;Landroidx/compose/material3/DatePickerFormatter;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;ILkotlin/jvm/internal/e;)V

    .line 352
    .line 353
    .line 354
    move-object/from16 v12, v16

    .line 355
    .line 356
    invoke-interface {v11, v12}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 357
    .line 358
    .line 359
    :goto_10
    move-object v7, v12

    .line 360
    check-cast v7, Landroidx/compose/material3/DateInputValidator;

    .line 361
    .line 362
    invoke-virtual {v7, v1}, Landroidx/compose/material3/DateInputValidator;->setCurrentStartDateMillis$material3_release(Ljava/lang/Long;)V

    .line 363
    .line 364
    .line 365
    invoke-virtual {v7, v14}, Landroidx/compose/material3/DateInputValidator;->setCurrentEndDateMillis$material3_release(Ljava/lang/Long;)V

    .line 366
    .line 367
    .line 368
    sget-object v2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 369
    .line 370
    invoke-static {}, Landroidx/compose/material3/DateInputKt;->getInputTextFieldPadding()Landroidx/compose/foundation/layout/PaddingValues;

    .line 371
    .line 372
    .line 373
    move-result-object v6

    .line 374
    invoke-static {v2, v6}, Landroidx/compose/foundation/layout/PaddingKt;->padding(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;)Landroidx/compose/ui/Modifier;

    .line 375
    .line 376
    .line 377
    move-result-object v6

    .line 378
    sget-object v9, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 379
    .line 380
    sget v10, Landroidx/compose/material3/DateRangeInputKt;->TextFieldSpacing:F

    .line 381
    .line 382
    invoke-virtual {v9, v10}, Landroidx/compose/foundation/layout/Arrangement;->spacedBy-0680j_4(F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    .line 383
    .line 384
    .line 385
    move-result-object v9

    .line 386
    sget-object v10, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 387
    .line 388
    invoke-virtual {v10}, Landroidx/compose/ui/Alignment$Companion;->getTop()Landroidx/compose/ui/Alignment$Vertical;

    .line 389
    .line 390
    .line 391
    move-result-object v10

    .line 392
    const/4 v12, 0x6

    .line 393
    invoke-static {v9, v10, v11, v12}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 394
    .line 395
    .line 396
    move-result-object v9

    .line 397
    const/4 v10, 0x0

    .line 398
    invoke-static {v11, v10}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 399
    .line 400
    .line 401
    move-result v12

    .line 402
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 403
    .line 404
    .line 405
    move-result-object v10

    .line 406
    invoke-static {v11, v6}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 407
    .line 408
    .line 409
    move-result-object v6

    .line 410
    sget-object v13, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 411
    .line 412
    invoke-virtual {v13}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 413
    .line 414
    .line 415
    move-result-object v0

    .line 416
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 417
    .line 418
    .line 419
    move-result-object v17

    .line 420
    if-nez v17, :cond_1a

    .line 421
    .line 422
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 423
    .line 424
    .line 425
    :cond_1a
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 426
    .line 427
    .line 428
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 429
    .line 430
    .line 431
    move-result v17

    .line 432
    if-eqz v17, :cond_1b

    .line 433
    .line 434
    invoke-interface {v11, v0}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 435
    .line 436
    .line 437
    goto :goto_11

    .line 438
    :cond_1b
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 439
    .line 440
    .line 441
    :goto_11
    invoke-static {v11}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 442
    .line 443
    .line 444
    move-result-object v0

    .line 445
    invoke-static {v13, v0, v9, v0, v10}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 446
    .line 447
    .line 448
    move-result-object v9

    .line 449
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 450
    .line 451
    .line 452
    move-result v10

    .line 453
    if-nez v10, :cond_1c

    .line 454
    .line 455
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 456
    .line 457
    .line 458
    move-result-object v10

    .line 459
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 460
    .line 461
    .line 462
    move-result-object v1

    .line 463
    invoke-static {v10, v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 464
    .line 465
    .line 466
    move-result v1

    .line 467
    if-nez v1, :cond_1d

    .line 468
    .line 469
    :cond_1c
    invoke-static {v12, v0, v12, v9}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 470
    .line 471
    .line 472
    :cond_1d
    invoke-virtual {v13}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 473
    .line 474
    .line 475
    move-result-object v1

    .line 476
    invoke-static {v0, v6, v1}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 477
    .line 478
    .line 479
    sget-object v20, Landroidx/compose/foundation/layout/RowScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/RowScopeInstance;

    .line 480
    .line 481
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/material3/internal/DateInputFormat;->getPatternWithDelimiters()Ljava/lang/String;

    .line 482
    .line 483
    .line 484
    move-result-object v0

    .line 485
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 486
    .line 487
    invoke-virtual {v0, v1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 488
    .line 489
    .line 490
    move-result-object v0

    .line 491
    const-string/jumbo v1, "this as java.lang.String).toUpperCase(Locale.ROOT)"

    .line 492
    .line 493
    .line 494
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 495
    .line 496
    .line 497
    sget v1, Landroidx/compose/material3/R$string;->m3c_date_range_picker_start_headline:I

    .line 498
    .line 499
    invoke-static {v1}, Landroidx/compose/material3/internal/Strings;->constructor-impl(I)I

    .line 500
    .line 501
    .line 502
    move-result v1

    .line 503
    const/4 v10, 0x0

    .line 504
    invoke-static {v1, v11, v10}, Landroidx/compose/material3/internal/Strings_androidKt;->getString-2EP1pXo(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    .line 505
    .line 506
    .line 507
    move-result-object v1

    .line 508
    const/16 v24, 0x2

    .line 509
    .line 510
    const/16 v25, 0x0

    .line 511
    .line 512
    const/high16 v22, 0x3f000000    # 0.5f

    .line 513
    .line 514
    const/16 v23, 0x0

    .line 515
    .line 516
    move-object/from16 v21, v2

    .line 517
    .line 518
    invoke-static/range {v20 .. v25}, Landroidx/compose/foundation/layout/RowScope;->weight$default(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/ui/Modifier;FZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 519
    .line 520
    .line 521
    move-result-object v2

    .line 522
    sget-object v17, Landroidx/compose/material3/InputIdentifier;->Companion:Landroidx/compose/material3/InputIdentifier$Companion;

    .line 523
    .line 524
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/material3/InputIdentifier$Companion;->getStartDateInput-J2x2o4M()I

    .line 525
    .line 526
    .line 527
    move-result v6

    .line 528
    and-int/lit16 v9, v4, 0x380

    .line 529
    .line 530
    const/16 v12, 0x100

    .line 531
    .line 532
    if-ne v9, v12, :cond_1e

    .line 533
    .line 534
    const/4 v13, 0x1

    .line 535
    goto :goto_12

    .line 536
    :cond_1e
    move v13, v10

    .line 537
    :goto_12
    move-object/from16 v18, v2

    .line 538
    .line 539
    and-int/lit8 v2, v4, 0x70

    .line 540
    .line 541
    const/16 v10, 0x20

    .line 542
    .line 543
    if-ne v2, v10, :cond_1f

    .line 544
    .line 545
    const/4 v10, 0x1

    .line 546
    goto :goto_13

    .line 547
    :cond_1f
    const/4 v10, 0x0

    .line 548
    :goto_13
    or-int/2addr v10, v13

    .line 549
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 550
    .line 551
    .line 552
    move-result-object v13

    .line 553
    if-nez v10, :cond_20

    .line 554
    .line 555
    sget-object v10, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 556
    .line 557
    invoke-virtual {v10}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 558
    .line 559
    .line 560
    move-result-object v10

    .line 561
    if-ne v13, v10, :cond_21

    .line 562
    .line 563
    :cond_20
    new-instance v13, Landroidx/compose/material3/DateRangeInputKt$DateRangeInputContent$2$1$1;

    .line 564
    .line 565
    invoke-direct {v13, v15, v14}, Landroidx/compose/material3/DateRangeInputKt$DateRangeInputContent$2$1$1;-><init>(Lr6/e;Ljava/lang/Long;)V

    .line 566
    .line 567
    .line 568
    invoke-interface {v11, v13}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 569
    .line 570
    .line 571
    :cond_21
    check-cast v13, Lr6/c;

    .line 572
    .line 573
    new-instance v10, Landroidx/compose/material3/DateRangeInputKt$DateRangeInputContent$2$2;

    .line 574
    .line 575
    invoke-direct {v10, v1, v0}, Landroidx/compose/material3/DateRangeInputKt$DateRangeInputContent$2$2;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 576
    .line 577
    .line 578
    const v1, 0x2fc4eb8c

    .line 579
    .line 580
    .line 581
    const/16 v14, 0x36

    .line 582
    .line 583
    const/4 v12, 0x1

    .line 584
    invoke-static {v1, v12, v10, v11, v14}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 585
    .line 586
    .line 587
    move-result-object v1

    .line 588
    new-instance v10, Landroidx/compose/material3/DateRangeInputKt$DateRangeInputContent$2$3;

    .line 589
    .line 590
    invoke-direct {v10, v0}, Landroidx/compose/material3/DateRangeInputKt$DateRangeInputContent$2$3;-><init>(Ljava/lang/String;)V

    .line 591
    .line 592
    .line 593
    move-object/from16 v16, v0

    .line 594
    .line 595
    const v0, 0x27a94eeb

    .line 596
    .line 597
    .line 598
    invoke-static {v0, v12, v10, v11, v14}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 599
    .line 600
    .line 601
    move-result-object v0

    .line 602
    shl-int/lit8 v10, v4, 0x3

    .line 603
    .line 604
    and-int/lit8 v10, v10, 0x70

    .line 605
    .line 606
    const v26, 0x1b6000

    .line 607
    .line 608
    .line 609
    or-int v10, v10, v26

    .line 610
    .line 611
    and-int/lit16 v14, v4, 0x1c00

    .line 612
    .line 613
    or-int/2addr v10, v14

    .line 614
    shr-int/lit8 v22, v4, 0x15

    .line 615
    .line 616
    and-int/lit8 v22, v22, 0xe

    .line 617
    .line 618
    move/from16 v30, v9

    .line 619
    .line 620
    move v12, v10

    .line 621
    move/from16 v28, v14

    .line 622
    .line 623
    move-object/from16 v29, v16

    .line 624
    .line 625
    const/4 v14, 0x0

    .line 626
    move/from16 v16, v4

    .line 627
    .line 628
    move-object v10, v5

    .line 629
    move-object v9, v8

    .line 630
    move-object/from16 v8, v19

    .line 631
    .line 632
    move-object v5, v0

    .line 633
    move-object v4, v1

    .line 634
    move-object/from16 v0, v18

    .line 635
    .line 636
    move-object/from16 v1, p0

    .line 637
    .line 638
    move/from16 v18, v2

    .line 639
    .line 640
    move-object v2, v13

    .line 641
    move/from16 v13, v22

    .line 642
    .line 643
    invoke-static/range {v0 .. v13}, Landroidx/compose/material3/DateInputKt;->DateInputTextField-tQNruF0(Landroidx/compose/ui/Modifier;Ljava/lang/Long;Lr6/c;Landroidx/compose/material3/internal/CalendarModel;Lr6/e;Lr6/e;ILandroidx/compose/material3/DateInputValidator;Landroidx/compose/material3/internal/DateInputFormat;Ljava/util/Locale;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;II)V

    .line 644
    .line 645
    .line 646
    move-object v0, v1

    .line 647
    sget v1, Landroidx/compose/material3/R$string;->m3c_date_range_picker_end_headline:I

    .line 648
    .line 649
    invoke-static {v1}, Landroidx/compose/material3/internal/Strings;->constructor-impl(I)I

    .line 650
    .line 651
    .line 652
    move-result v1

    .line 653
    invoke-static {v1, v11, v14}, Landroidx/compose/material3/internal/Strings_androidKt;->getString-2EP1pXo(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    .line 654
    .line 655
    .line 656
    move-result-object v1

    .line 657
    const/16 v24, 0x2

    .line 658
    .line 659
    const/16 v25, 0x0

    .line 660
    .line 661
    const/high16 v22, 0x3f000000    # 0.5f

    .line 662
    .line 663
    const/16 v23, 0x0

    .line 664
    .line 665
    invoke-static/range {v20 .. v25}, Landroidx/compose/foundation/layout/RowScope;->weight$default(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/ui/Modifier;FZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 666
    .line 667
    .line 668
    move-result-object v2

    .line 669
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/material3/InputIdentifier$Companion;->getEndDateInput-J2x2o4M()I

    .line 670
    .line 671
    .line 672
    move-result v6

    .line 673
    move/from16 v3, v30

    .line 674
    .line 675
    const/16 v12, 0x100

    .line 676
    .line 677
    if-ne v3, v12, :cond_22

    .line 678
    .line 679
    const/4 v3, 0x1

    .line 680
    goto :goto_14

    .line 681
    :cond_22
    move v3, v14

    .line 682
    :goto_14
    and-int/lit8 v4, v16, 0xe

    .line 683
    .line 684
    const/4 v5, 0x4

    .line 685
    if-ne v4, v5, :cond_23

    .line 686
    .line 687
    const/4 v14, 0x1

    .line 688
    :cond_23
    or-int/2addr v3, v14

    .line 689
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 690
    .line 691
    .line 692
    move-result-object v4

    .line 693
    if-nez v3, :cond_24

    .line 694
    .line 695
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 696
    .line 697
    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 698
    .line 699
    .line 700
    move-result-object v3

    .line 701
    if-ne v4, v3, :cond_25

    .line 702
    .line 703
    :cond_24
    new-instance v4, Landroidx/compose/material3/DateRangeInputKt$DateRangeInputContent$2$4$1;

    .line 704
    .line 705
    invoke-direct {v4, v15, v0}, Landroidx/compose/material3/DateRangeInputKt$DateRangeInputContent$2$4$1;-><init>(Lr6/e;Ljava/lang/Long;)V

    .line 706
    .line 707
    .line 708
    invoke-interface {v11, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 709
    .line 710
    .line 711
    :cond_25
    check-cast v4, Lr6/c;

    .line 712
    .line 713
    new-instance v3, Landroidx/compose/material3/DateRangeInputKt$DateRangeInputContent$2$5;

    .line 714
    .line 715
    move-object/from16 v5, v29

    .line 716
    .line 717
    invoke-direct {v3, v1, v5}, Landroidx/compose/material3/DateRangeInputKt$DateRangeInputContent$2$5;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 718
    .line 719
    .line 720
    const v1, 0x36543135

    .line 721
    .line 722
    .line 723
    const/16 v10, 0x36

    .line 724
    .line 725
    const/4 v12, 0x1

    .line 726
    invoke-static {v1, v12, v3, v11, v10}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 727
    .line 728
    .line 729
    move-result-object v1

    .line 730
    new-instance v3, Landroidx/compose/material3/DateRangeInputKt$DateRangeInputContent$2$6;

    .line 731
    .line 732
    invoke-direct {v3, v5}, Landroidx/compose/material3/DateRangeInputKt$DateRangeInputContent$2$6;-><init>(Ljava/lang/String;)V

    .line 733
    .line 734
    .line 735
    const v5, -0x3952c72c

    .line 736
    .line 737
    .line 738
    invoke-static {v5, v12, v3, v11, v10}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 739
    .line 740
    .line 741
    move-result-object v5

    .line 742
    or-int v3, v18, v26

    .line 743
    .line 744
    or-int v12, v3, v28

    .line 745
    .line 746
    move-object/from16 v3, p3

    .line 747
    .line 748
    move-object/from16 v10, p7

    .line 749
    .line 750
    move-object v0, v2

    .line 751
    move-object v2, v4

    .line 752
    move-object v4, v1

    .line 753
    move-object/from16 v1, p1

    .line 754
    .line 755
    invoke-static/range {v0 .. v13}, Landroidx/compose/material3/DateInputKt;->DateInputTextField-tQNruF0(Landroidx/compose/ui/Modifier;Ljava/lang/Long;Lr6/c;Landroidx/compose/material3/internal/CalendarModel;Lr6/e;Lr6/e;ILandroidx/compose/material3/DateInputValidator;Landroidx/compose/material3/internal/DateInputFormat;Ljava/util/Locale;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;II)V

    .line 756
    .line 757
    .line 758
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 759
    .line 760
    .line 761
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 762
    .line 763
    .line 764
    move-result v0

    .line 765
    if-eqz v0, :cond_26

    .line 766
    .line 767
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 768
    .line 769
    .line 770
    :cond_26
    :goto_15
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 771
    .line 772
    .line 773
    move-result-object v10

    .line 774
    if-eqz v10, :cond_27

    .line 775
    .line 776
    new-instance v0, Landroidx/compose/material3/DateRangeInputKt$DateRangeInputContent$3;

    .line 777
    .line 778
    move-object/from16 v1, p0

    .line 779
    .line 780
    move-object/from16 v2, p1

    .line 781
    .line 782
    move-object/from16 v4, p3

    .line 783
    .line 784
    move-object/from16 v5, p4

    .line 785
    .line 786
    move-object/from16 v6, p5

    .line 787
    .line 788
    move-object/from16 v7, p6

    .line 789
    .line 790
    move-object/from16 v8, p7

    .line 791
    .line 792
    move/from16 v9, p9

    .line 793
    .line 794
    move-object v3, v15

    .line 795
    invoke-direct/range {v0 .. v9}, Landroidx/compose/material3/DateRangeInputKt$DateRangeInputContent$3;-><init>(Ljava/lang/Long;Ljava/lang/Long;Lr6/e;Landroidx/compose/material3/internal/CalendarModel;Lx6/f;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;I)V

    .line 796
    .line 797
    .line 798
    invoke-interface {v10, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 799
    .line 800
    .line 801
    :cond_27
    return-void
.end method
