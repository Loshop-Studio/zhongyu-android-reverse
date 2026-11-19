.class public abstract Lcom/zykj/evaluation/ui/sheet/preview/PreviewPageKt;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final A(Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Landroidx/navigation/NavController;)Lkotlin/Unit;
    .locals 9

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x0

    .line 4
    invoke-static {p0, v2, v0, v1}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->p(Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;IILjava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->N()V

    .line 8
    .line 9
    .line 10
    const/4 v7, 0x6

    .line 11
    const/4 v8, 0x0

    .line 12
    const-string v4, "ANSWER_SHEET"

    .line 13
    .line 14
    const/4 v5, 0x0

    .line 15
    const/4 v6, 0x0

    .line 16
    move-object v3, p1

    .line 17
    invoke-static/range {v3 .. v8}, Landroidx/navigation/NavController;->navigate$default(Landroidx/navigation/NavController;Ljava/lang/String;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;ILjava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 21
    .line 22
    return-object p0
.end method

.method public static final B(Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Lkotlin/jvm/functions/Function0;Landroidx/navigation/NavController;)Lkotlin/Unit;
    .locals 1

    .line 1
    new-instance v0, Ly6/d;

    .line 2
    .line 3
    invoke-direct {v0, p2}, Ly6/d;-><init>(Landroidx/navigation/NavController;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1, v0}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->r(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V

    .line 7
    .line 8
    .line 9
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 10
    .line 11
    return-object p0
.end method

.method public static final C(Landroidx/navigation/NavController;)Lkotlin/Unit;
    .locals 8

    .line 1
    sget-object v0, Lcom/zykj/base/utils/XToastUtils;->INSTANCE:Lcom/zykj/base/utils/XToastUtils;

    .line 2
    .line 3
    const v1, 0x7f120045

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, v1}, Lcom/zykj/base/utils/XToastUtils;->error(I)V

    .line 7
    .line 8
    .line 9
    const/4 v6, 0x6

    .line 10
    const/4 v7, 0x0

    .line 11
    const-string v3, "ANSWER_SHEET_CORRECT_DATA"

    .line 12
    .line 13
    const/4 v4, 0x0

    .line 14
    const/4 v5, 0x0

    .line 15
    move-object v2, p0

    .line 16
    invoke-static/range {v2 .. v7}, Landroidx/navigation/NavController;->navigate$default(Landroidx/navigation/NavController;Ljava/lang/String;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;ILjava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 20
    .line 21
    return-object p0
.end method

.method public static final D(Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Landroidx/navigation/NavController;Ljava/util/List;)Lkotlin/Unit;
    .locals 6

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    instance-of v0, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    check-cast p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;

    .line 11
    .line 12
    invoke-static {p2}, Lv6/y;->b(Ljava/util/List;)Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    invoke-virtual {p0, p2}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->U0(Ljava/util/List;)V

    .line 17
    .line 18
    .line 19
    const/4 v4, 0x6

    .line 20
    const/4 v5, 0x0

    .line 21
    const-string v1, "ANSWER_SHEET_CORRECT_DATA"

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    const/4 v3, 0x0

    .line 25
    move-object v0, p1

    .line 26
    invoke-static/range {v0 .. v5}, Landroidx/navigation/NavController;->navigate$default(Landroidx/navigation/NavController;Ljava/lang/String;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;ILjava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 30
    .line 31
    return-object p0
.end method

.method public static final E(Landroidx/navigation/NavController;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Lkotlin/jvm/functions/Function0;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Lcom/zykj/evaluation/ui/sheet/preview/PreviewPageKt;->w(Landroidx/navigation/NavController;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final F(Landroidx/navigation/NavController;Lcom/zykj/evaluation/ui/sheet/a;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Landroidx/compose/runtime/DisposableEffectScope;)Landroidx/compose/runtime/DisposableEffectResult;
    .locals 2

    .line 1
    const-string v0, "$this$DisposableEffect"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/navigation/NavController;->getCurrentBackStackEntry()Landroidx/navigation/NavBackStackEntry;

    .line 7
    .line 8
    .line 9
    move-result-object p3

    .line 10
    const/4 v0, 0x0

    .line 11
    if-eqz p3, :cond_0

    .line 12
    .line 13
    invoke-virtual {p3}, Landroidx/navigation/NavBackStackEntry;->getSavedStateHandle()Landroidx/lifecycle/SavedStateHandle;

    .line 14
    .line 15
    .line 16
    move-result-object p3

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move-object p3, v0

    .line 19
    :goto_0
    new-instance v1, Ly6/j;

    .line 20
    .line 21
    invoke-direct {v1, p1, p0, p3, p2}, Ly6/j;-><init>(Lcom/zykj/evaluation/ui/sheet/a;Landroidx/navigation/NavController;Landroidx/lifecycle/SavedStateHandle;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;)V

    .line 22
    .line 23
    .line 24
    if-eqz p3, :cond_1

    .line 25
    .line 26
    const-string p1, "ANSWER_SHEET_KEY_BACK"

    .line 27
    .line 28
    invoke-virtual {p3, p1}, Landroidx/lifecycle/SavedStateHandle;->getLiveData(Ljava/lang/String;)Landroidx/lifecycle/MutableLiveData;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    :cond_1
    if-eqz v0, :cond_2

    .line 33
    .line 34
    invoke-virtual {p0}, Landroidx/navigation/NavController;->getCurrentBackStackEntry()Landroidx/navigation/NavBackStackEntry;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, p0, v1}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 42
    .line 43
    .line 44
    :cond_2
    new-instance p0, Lcom/zykj/evaluation/ui/sheet/preview/PreviewPageKt$PreviewPage$lambda$4$lambda$3$$inlined$onDispose$1;

    .line 45
    .line 46
    invoke-direct {p0, v0, v1}, Lcom/zykj/evaluation/ui/sheet/preview/PreviewPageKt$PreviewPage$lambda$4$lambda$3$$inlined$onDispose$1;-><init>(Landroidx/lifecycle/MutableLiveData;Landroidx/lifecycle/Observer;)V

    .line 47
    .line 48
    .line 49
    return-object p0
.end method

.method public static final G(Lcom/zykj/evaluation/ui/sheet/a;Landroidx/navigation/NavController;Landroidx/lifecycle/SavedStateHandle;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Ljava/lang/String;)V
    .locals 18

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    move-object/from16 v1, p4

    .line 4
    .line 5
    if-eqz v1, :cond_9

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    const v3, 0x2c6f4a0e

    .line 12
    .line 13
    .line 14
    const/4 v4, 0x0

    .line 15
    const-string v5, "ANSWER_SHEET_KEY_BACK"

    .line 16
    .line 17
    if-eq v2, v3, :cond_7

    .line 18
    .line 19
    const v3, 0x3e65afab

    .line 20
    .line 21
    .line 22
    if-eq v2, v3, :cond_2

    .line 23
    .line 24
    const v3, 0x6a19426f

    .line 25
    .line 26
    .line 27
    if-eq v2, v3, :cond_0

    .line 28
    .line 29
    goto/16 :goto_1

    .line 30
    .line 31
    :cond_0
    const-string v2, "ANSWER_SHEET_KEY_BACK_RE_TAKE_PHOTO"

    .line 32
    .line 33
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-nez v1, :cond_1

    .line 38
    .line 39
    goto/16 :goto_1

    .line 40
    .line 41
    :cond_1
    const-string v1, "\u91cd\u62cd\u70b9\u51fb\u8fd4\u56de\u89e6\u53d1\u524d\u5f80\u62cd\u7167\u9875\u9762"

    .line 42
    .line 43
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-static {v1}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    const/4 v10, 0x6

    .line 51
    const/4 v11, 0x0

    .line 52
    const-string v7, "ANSWER_SHEET"

    .line 53
    .line 54
    const/4 v8, 0x0

    .line 55
    const/4 v9, 0x0

    .line 56
    move-object/from16 v6, p1

    .line 57
    .line 58
    invoke-static/range {v6 .. v11}, Landroidx/navigation/NavController;->navigate$default(Landroidx/navigation/NavController;Ljava/lang/String;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;ILjava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    if-eqz v0, :cond_9

    .line 62
    .line 63
    invoke-virtual {v0, v5, v4}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :cond_2
    const-string v2, "ANSWER_SHEET_KEY_BACK_TAKE_PHOTO_RESULT"

    .line 68
    .line 69
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    if-eqz v1, :cond_9

    .line 74
    .line 75
    const-string v1, "\u62cd\u7167\u7ed3\u679c\u8fd4\u56de"

    .line 76
    .line 77
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-static {v1}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual/range {p0 .. p0}, Lcom/zykj/evaluation/ui/sheet/a;->g()Lcom/zykj/evaluation/ui/sheet/b;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    instance-of v1, v1, Lcom/zykj/evaluation/ui/sheet/b$d;

    .line 89
    .line 90
    if-eqz v1, :cond_3

    .line 91
    .line 92
    const-wide/16 v1, 0xc8

    .line 93
    .line 94
    invoke-static {v1, v2}, Lcom/blankj/utilcode/util/VibrateUtils;->vibrate(J)V

    .line 95
    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_3
    invoke-virtual/range {p0 .. p0}, Lcom/zykj/evaluation/ui/sheet/a;->g()Lcom/zykj/evaluation/ui/sheet/b;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    instance-of v1, v1, Lcom/zykj/evaluation/ui/sheet/b$c;

    .line 103
    .line 104
    if-eqz v1, :cond_6

    .line 105
    .line 106
    invoke-virtual/range {p0 .. p0}, Lcom/zykj/evaluation/ui/sheet/a;->g()Lcom/zykj/evaluation/ui/sheet/b;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    check-cast v1, Lcom/zykj/evaluation/ui/sheet/b$c;

    .line 111
    .line 112
    invoke-virtual {v1}, Lcom/zykj/evaluation/ui/sheet/b$c;->c()Z

    .line 113
    .line 114
    .line 115
    move-result v1

    .line 116
    if-eqz v1, :cond_4

    .line 117
    .line 118
    const-string v1, "\u89e6\u53d1\u626b\u63cf\u5931\u8d25\u663e\u793a\u5f39\u7a97"

    .line 119
    .line 120
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    invoke-static {v1}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    const/16 v16, 0x6

    .line 128
    .line 129
    const/16 v17, 0x0

    .line 130
    .line 131
    const-string v13, "ANSWER_SHEET_SCAN_FAILED"

    .line 132
    .line 133
    const/4 v14, 0x0

    .line 134
    const/4 v15, 0x0

    .line 135
    move-object/from16 v12, p1

    .line 136
    .line 137
    invoke-static/range {v12 .. v17}, Landroidx/navigation/NavController;->navigate$default(Landroidx/navigation/NavController;Ljava/lang/String;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;ILjava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    goto :goto_0

    .line 141
    :cond_4
    invoke-virtual/range {p0 .. p0}, Lcom/zykj/evaluation/ui/sheet/a;->g()Lcom/zykj/evaluation/ui/sheet/b;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    check-cast v1, Lcom/zykj/evaluation/ui/sheet/b$c;

    .line 146
    .line 147
    invoke-virtual {v1}, Lcom/zykj/evaluation/ui/sheet/b$c;->d()Z

    .line 148
    .line 149
    .line 150
    move-result v1

    .line 151
    if-eqz v1, :cond_5

    .line 152
    .line 153
    const/16 v16, 0x6

    .line 154
    .line 155
    const/16 v17, 0x0

    .line 156
    .line 157
    const-string v13, "ANSWER_SHEET_SERIAL_NUM_ERROR"

    .line 158
    .line 159
    const/4 v14, 0x0

    .line 160
    const/4 v15, 0x0

    .line 161
    move-object/from16 v12, p1

    .line 162
    .line 163
    invoke-static/range {v12 .. v17}, Landroidx/navigation/NavController;->navigate$default(Landroidx/navigation/NavController;Ljava/lang/String;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;ILjava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    goto :goto_0

    .line 167
    :cond_5
    invoke-virtual/range {p0 .. p0}, Lcom/zykj/evaluation/ui/sheet/a;->g()Lcom/zykj/evaluation/ui/sheet/b;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    check-cast v1, Lcom/zykj/evaluation/ui/sheet/b$c;

    .line 172
    .line 173
    invoke-virtual {v1}, Lcom/zykj/evaluation/ui/sheet/b$c;->b()Z

    .line 174
    .line 175
    .line 176
    move-result v1

    .line 177
    if-eqz v1, :cond_6

    .line 178
    .line 179
    const/16 v16, 0x6

    .line 180
    .line 181
    const/16 v17, 0x0

    .line 182
    .line 183
    const-string v13, "ANSWER_SHEET_PAGE_ERROR"

    .line 184
    .line 185
    const/4 v14, 0x0

    .line 186
    const/4 v15, 0x0

    .line 187
    move-object/from16 v12, p1

    .line 188
    .line 189
    invoke-static/range {v12 .. v17}, Landroidx/navigation/NavController;->navigate$default(Landroidx/navigation/NavController;Ljava/lang/String;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;ILjava/lang/Object;)V

    .line 190
    .line 191
    .line 192
    :cond_6
    :goto_0
    if-eqz v0, :cond_9

    .line 193
    .line 194
    invoke-virtual {v0, v5, v4}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 195
    .line 196
    .line 197
    return-void

    .line 198
    :cond_7
    const-string v2, "ANSWER_SHEET_KEY_BACK_MANUAL_POINT"

    .line 199
    .line 200
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    move-result v1

    .line 204
    if-nez v1, :cond_8

    .line 205
    .line 206
    goto :goto_1

    .line 207
    :cond_8
    invoke-virtual/range {p3 .. p3}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->I()V

    .line 208
    .line 209
    .line 210
    const-string v1, "\u5b9a\u4f4d\u70b9\u51fb\u8fd4\u56de\u89e6\u53d1\u524d\u5f80\u5b9a\u4f4d\u9875\u9762"

    .line 211
    .line 212
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v1

    .line 216
    invoke-static {v1}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 217
    .line 218
    .line 219
    const/16 v16, 0x6

    .line 220
    .line 221
    const/16 v17, 0x0

    .line 222
    .line 223
    const-string v13, "ANSWER_SHEET_MANUAL_POINT"

    .line 224
    .line 225
    const/4 v14, 0x0

    .line 226
    const/4 v15, 0x0

    .line 227
    move-object/from16 v12, p1

    .line 228
    .line 229
    invoke-static/range {v12 .. v17}, Landroidx/navigation/NavController;->navigate$default(Landroidx/navigation/NavController;Ljava/lang/String;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;ILjava/lang/Object;)V

    .line 230
    .line 231
    .line 232
    if-eqz v0, :cond_9

    .line 233
    .line 234
    invoke-virtual {v0, v5, v4}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 235
    .line 236
    .line 237
    :cond_9
    :goto_1
    return-void
.end method

.method public static final H(Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/evaluation/base/BaseViewModel;->c()V

    .line 2
    .line 3
    .line 4
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 5
    .line 6
    return-object p0
.end method

.method public static synthetic a(Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Landroidx/navigation/NavController;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/evaluation/ui/sheet/preview/PreviewPageKt;->D(Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Landroidx/navigation/NavController;Ljava/util/List;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/Modifier;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p10}, Lcom/zykj/evaluation/ui/sheet/preview/PreviewPageKt;->q(Landroidx/compose/ui/Modifier;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/navigation/NavController;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/evaluation/ui/sheet/preview/PreviewPageKt;->z(Landroidx/navigation/NavController;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Landroidx/compose/ui/Modifier;Ljava/util/List;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p6}, Lcom/zykj/evaluation/ui/sheet/preview/PreviewPageKt;->t(Landroidx/compose/ui/Modifier;Ljava/util/List;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Landroidx/navigation/NavController;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/evaluation/ui/sheet/preview/PreviewPageKt;->A(Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Landroidx/navigation/NavController;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Landroidx/navigation/NavController;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Lkotlin/jvm/functions/Function0;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Lcom/zykj/evaluation/ui/sheet/preview/PreviewPageKt;->E(Landroidx/navigation/NavController;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Lkotlin/jvm/functions/Function0;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/evaluation/ui/sheet/preview/PreviewPageKt;->H(Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lcom/zykj/evaluation/ui/sheet/a;Landroidx/navigation/NavController;Landroidx/lifecycle/SavedStateHandle;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/zykj/evaluation/ui/sheet/preview/PreviewPageKt;->G(Lcom/zykj/evaluation/ui/sheet/a;Landroidx/navigation/NavController;Landroidx/lifecycle/SavedStateHandle;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic i(Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Lkotlin/jvm/functions/Function0;Landroidx/navigation/NavController;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/evaluation/ui/sheet/preview/PreviewPageKt;->B(Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Lkotlin/jvm/functions/Function0;Landroidx/navigation/NavController;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Landroidx/compose/ui/Modifier;Landroid/graphics/Bitmap;Ljava/util/List;Lb7/t0;Lcom/zykj/evaluation/ui/sheet/b;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p9}, Lcom/zykj/evaluation/ui/sheet/preview/PreviewPageKt;->v(Landroidx/compose/ui/Modifier;Landroid/graphics/Bitmap;Ljava/util/List;Lb7/t0;Lcom/zykj/evaluation/ui/sheet/b;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lkotlin/jvm/functions/Function1;Lv6/z;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/evaluation/ui/sheet/preview/PreviewPageKt;->s(Lkotlin/jvm/functions/Function1;Lv6/z;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Landroidx/navigation/NavController;Lcom/zykj/evaluation/ui/sheet/a;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Landroidx/compose/runtime/DisposableEffectScope;)Landroidx/compose/runtime/DisposableEffectResult;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/evaluation/ui/sheet/preview/PreviewPageKt;->F(Landroidx/navigation/NavController;Lcom/zykj/evaluation/ui/sheet/a;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Landroidx/compose/runtime/DisposableEffectScope;)Landroidx/compose/runtime/DisposableEffectResult;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Landroidx/navigation/NavController;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/evaluation/ui/sheet/preview/PreviewPageKt;->C(Landroidx/navigation/NavController;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Lcom/zykj/evaluation/ui/sheet/a;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Landroidx/navigation/NavController;Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p6}, Lcom/zykj/evaluation/ui/sheet/preview/PreviewPageKt;->x(Lcom/zykj/evaluation/ui/sheet/a;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Landroidx/navigation/NavController;Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o(Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Lv6/z;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/evaluation/ui/sheet/preview/PreviewPageKt;->y(Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Lv6/z;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final p(Landroidx/compose/ui/Modifier;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V
    .locals 23

    .line 1
    move-object/from16 v4, p3

    .line 2
    .line 3
    move/from16 v5, p4

    .line 4
    .line 5
    move-object/from16 v6, p5

    .line 6
    .line 7
    move-object/from16 v7, p6

    .line 8
    .line 9
    move/from16 v8, p8

    .line 10
    .line 11
    const v0, -0x4b78b5a9

    .line 12
    .line 13
    .line 14
    move-object/from16 v1, p7

    .line 15
    .line 16
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 17
    .line 18
    .line 19
    move-result-object v12

    .line 20
    and-int/lit8 v1, p9, 0x1

    .line 21
    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    or-int/lit8 v2, v8, 0x6

    .line 25
    .line 26
    move v3, v2

    .line 27
    move-object/from16 v2, p0

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_0
    and-int/lit8 v2, v8, 0x6

    .line 31
    .line 32
    if-nez v2, :cond_2

    .line 33
    .line 34
    move-object/from16 v2, p0

    .line 35
    .line 36
    invoke-interface {v12, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-eqz v3, :cond_1

    .line 41
    .line 42
    const/4 v3, 0x4

    .line 43
    goto :goto_0

    .line 44
    :cond_1
    const/4 v3, 0x2

    .line 45
    :goto_0
    or-int/2addr v3, v8

    .line 46
    goto :goto_1

    .line 47
    :cond_2
    move-object/from16 v2, p0

    .line 48
    .line 49
    move v3, v8

    .line 50
    :goto_1
    and-int/lit8 v9, v8, 0x30

    .line 51
    .line 52
    move-object/from16 v10, p1

    .line 53
    .line 54
    if-nez v9, :cond_4

    .line 55
    .line 56
    invoke-interface {v12, v10}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v9

    .line 60
    if-eqz v9, :cond_3

    .line 61
    .line 62
    const/16 v9, 0x20

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_3
    const/16 v9, 0x10

    .line 66
    .line 67
    :goto_2
    or-int/2addr v3, v9

    .line 68
    :cond_4
    and-int/lit16 v9, v8, 0x180

    .line 69
    .line 70
    move-object/from16 v11, p2

    .line 71
    .line 72
    if-nez v9, :cond_6

    .line 73
    .line 74
    invoke-interface {v12, v11}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v9

    .line 78
    if-eqz v9, :cond_5

    .line 79
    .line 80
    const/16 v9, 0x100

    .line 81
    .line 82
    goto :goto_3

    .line 83
    :cond_5
    const/16 v9, 0x80

    .line 84
    .line 85
    :goto_3
    or-int/2addr v3, v9

    .line 86
    :cond_6
    and-int/lit16 v9, v8, 0xc00

    .line 87
    .line 88
    if-nez v9, :cond_8

    .line 89
    .line 90
    invoke-interface {v12, v4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v9

    .line 94
    if-eqz v9, :cond_7

    .line 95
    .line 96
    const/16 v9, 0x800

    .line 97
    .line 98
    goto :goto_4

    .line 99
    :cond_7
    const/16 v9, 0x400

    .line 100
    .line 101
    :goto_4
    or-int/2addr v3, v9

    .line 102
    :cond_8
    and-int/lit16 v9, v8, 0x6000

    .line 103
    .line 104
    if-nez v9, :cond_a

    .line 105
    .line 106
    invoke-interface {v12, v5}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 107
    .line 108
    .line 109
    move-result v9

    .line 110
    if-eqz v9, :cond_9

    .line 111
    .line 112
    const/16 v9, 0x4000

    .line 113
    .line 114
    goto :goto_5

    .line 115
    :cond_9
    const/16 v9, 0x2000

    .line 116
    .line 117
    :goto_5
    or-int/2addr v3, v9

    .line 118
    :cond_a
    const/high16 v9, 0x30000

    .line 119
    .line 120
    and-int/2addr v9, v8

    .line 121
    if-nez v9, :cond_c

    .line 122
    .line 123
    invoke-interface {v12, v6}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result v9

    .line 127
    if-eqz v9, :cond_b

    .line 128
    .line 129
    const/high16 v9, 0x20000

    .line 130
    .line 131
    goto :goto_6

    .line 132
    :cond_b
    const/high16 v9, 0x10000

    .line 133
    .line 134
    :goto_6
    or-int/2addr v3, v9

    .line 135
    :cond_c
    const/high16 v9, 0x180000

    .line 136
    .line 137
    and-int/2addr v9, v8

    .line 138
    if-nez v9, :cond_e

    .line 139
    .line 140
    invoke-interface {v12, v7}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result v9

    .line 144
    if-eqz v9, :cond_d

    .line 145
    .line 146
    const/high16 v9, 0x100000

    .line 147
    .line 148
    goto :goto_7

    .line 149
    :cond_d
    const/high16 v9, 0x80000

    .line 150
    .line 151
    :goto_7
    or-int/2addr v3, v9

    .line 152
    :cond_e
    const v9, 0x92493

    .line 153
    .line 154
    .line 155
    and-int/2addr v9, v3

    .line 156
    const v13, 0x92492

    .line 157
    .line 158
    .line 159
    const/4 v14, 0x0

    .line 160
    if-eq v9, v13, :cond_f

    .line 161
    .line 162
    const/4 v9, 0x1

    .line 163
    goto :goto_8

    .line 164
    :cond_f
    move v9, v14

    .line 165
    :goto_8
    and-int/lit8 v13, v3, 0x1

    .line 166
    .line 167
    invoke-interface {v12, v9, v13}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 168
    .line 169
    .line 170
    move-result v9

    .line 171
    if-eqz v9, :cond_18

    .line 172
    .line 173
    if-eqz v1, :cond_10

    .line 174
    .line 175
    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 176
    .line 177
    move-object/from16 v16, v1

    .line 178
    .line 179
    goto :goto_9

    .line 180
    :cond_10
    move-object/from16 v16, v2

    .line 181
    .line 182
    :goto_9
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 183
    .line 184
    .line 185
    move-result v1

    .line 186
    if-eqz v1, :cond_11

    .line 187
    .line 188
    const/4 v1, -0x1

    .line 189
    const-string v2, "com.zykj.evaluation.ui.sheet.preview.PreviewButton (PreviewPage.kt:264)"

    .line 190
    .line 191
    invoke-static {v0, v3, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 192
    .line 193
    .line 194
    :cond_11
    sget-object v0, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 195
    .line 196
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    .line 197
    .line 198
    .line 199
    move-result-wide v17

    .line 200
    const/16 v20, 0x2

    .line 201
    .line 202
    const/16 v21, 0x0

    .line 203
    .line 204
    const/16 v19, 0x0

    .line 205
    .line 206
    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/BackgroundKt;->background-bw27NRU$default(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    sget-object v1, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 211
    .line 212
    invoke-virtual {v1}, Landroidx/compose/ui/Alignment$Companion;->getCenterVertically()Landroidx/compose/ui/Alignment$Vertical;

    .line 213
    .line 214
    .line 215
    move-result-object v1

    .line 216
    sget-object v2, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 217
    .line 218
    invoke-virtual {v2}, Landroidx/compose/foundation/layout/Arrangement;->getStart()Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    .line 219
    .line 220
    .line 221
    move-result-object v2

    .line 222
    const/16 v9, 0x30

    .line 223
    .line 224
    invoke-static {v2, v1, v12, v9}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 225
    .line 226
    .line 227
    move-result-object v1

    .line 228
    invoke-static {v12, v14}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 229
    .line 230
    .line 231
    move-result v2

    .line 232
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 233
    .line 234
    .line 235
    move-result-object v9

    .line 236
    invoke-static {v12, v0}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 237
    .line 238
    .line 239
    move-result-object v0

    .line 240
    sget-object v13, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 241
    .line 242
    invoke-virtual {v13}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    .line 243
    .line 244
    .line 245
    move-result-object v14

    .line 246
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 247
    .line 248
    .line 249
    move-result-object v17

    .line 250
    if-nez v17, :cond_12

    .line 251
    .line 252
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 253
    .line 254
    .line 255
    :cond_12
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 256
    .line 257
    .line 258
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 259
    .line 260
    .line 261
    move-result v17

    .line 262
    if-eqz v17, :cond_13

    .line 263
    .line 264
    invoke-interface {v12, v14}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    .line 265
    .line 266
    .line 267
    goto :goto_a

    .line 268
    :cond_13
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 269
    .line 270
    .line 271
    :goto_a
    invoke-static {v12}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 272
    .line 273
    .line 274
    move-result-object v14

    .line 275
    invoke-virtual {v13}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    .line 276
    .line 277
    .line 278
    move-result-object v15

    .line 279
    invoke-static {v14, v1, v15}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 280
    .line 281
    .line 282
    invoke-virtual {v13}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    .line 283
    .line 284
    .line 285
    move-result-object v1

    .line 286
    invoke-static {v14, v9, v1}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 287
    .line 288
    .line 289
    invoke-virtual {v13}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    .line 290
    .line 291
    .line 292
    move-result-object v1

    .line 293
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 294
    .line 295
    .line 296
    move-result v9

    .line 297
    if-nez v9, :cond_14

    .line 298
    .line 299
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    move-result-object v9

    .line 303
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 304
    .line 305
    .line 306
    move-result-object v15

    .line 307
    invoke-static {v9, v15}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 308
    .line 309
    .line 310
    move-result v9

    .line 311
    if-nez v9, :cond_15

    .line 312
    .line 313
    :cond_14
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 314
    .line 315
    .line 316
    move-result-object v9

    .line 317
    invoke-interface {v14, v9}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 318
    .line 319
    .line 320
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 321
    .line 322
    .line 323
    move-result-object v2

    .line 324
    invoke-interface {v14, v2, v1}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 325
    .line 326
    .line 327
    :cond_15
    invoke-virtual {v13}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    .line 328
    .line 329
    .line 330
    move-result-object v1

    .line 331
    invoke-static {v14, v0, v1}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 332
    .line 333
    .line 334
    sget-object v17, Landroidx/compose/foundation/layout/RowScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/RowScopeInstance;

    .line 335
    .line 336
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 337
    .line 338
    const/4 v1, 0x5

    .line 339
    int-to-float v1, v1

    .line 340
    const/16 v2, 0x258

    .line 341
    .line 342
    int-to-float v2, v2

    .line 343
    div-float/2addr v1, v2

    .line 344
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 345
    .line 346
    .line 347
    move-result-object v2

    .line 348
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 349
    .line 350
    .line 351
    move-result-object v2

    .line 352
    iget v9, v2, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 353
    .line 354
    iget v2, v2, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 355
    .line 356
    invoke-static {v9, v2}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 357
    .line 358
    .line 359
    move-result v2

    .line 360
    int-to-float v2, v2

    .line 361
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 362
    .line 363
    .line 364
    move-result-object v9

    .line 365
    invoke-virtual {v9}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 366
    .line 367
    .line 368
    move-result-object v9

    .line 369
    iget v9, v9, Landroid/util/DisplayMetrics;->density:F

    .line 370
    .line 371
    div-float/2addr v2, v9

    .line 372
    mul-float/2addr v2, v1

    .line 373
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 374
    .line 375
    .line 376
    move-result v2

    .line 377
    invoke-static {v0, v2}, Landroidx/compose/foundation/layout/SizeKt;->width-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 378
    .line 379
    .line 380
    move-result-object v2

    .line 381
    const/4 v15, 0x6

    .line 382
    invoke-static {v2, v12, v15}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 383
    .line 384
    .line 385
    const/4 v2, 0x0

    .line 386
    const/4 v9, 0x0

    .line 387
    const/4 v13, 0x1

    .line 388
    invoke-static {v0, v2, v13, v9}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxHeight$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 389
    .line 390
    .line 391
    move-result-object v18

    .line 392
    const/16 v21, 0x2

    .line 393
    .line 394
    const/16 v22, 0x0

    .line 395
    .line 396
    const/high16 v19, 0x3f800000    # 1.0f

    .line 397
    .line 398
    const/16 v20, 0x0

    .line 399
    .line 400
    invoke-static/range {v17 .. v22}, Landroidx/compose/foundation/layout/RowScope;->weight$default(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/ui/Modifier;FZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 401
    .line 402
    .line 403
    move-result-object v9

    .line 404
    and-int/lit16 v13, v3, 0x3f0

    .line 405
    .line 406
    const/4 v14, 0x0

    .line 407
    invoke-static/range {v9 .. v14}, Lcom/zykj/evaluation/ui/sheet/preview/PreviewPageKt;->r(Landroidx/compose/ui/Modifier;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    .line 408
    .line 409
    .line 410
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 411
    .line 412
    .line 413
    move-result-object v2

    .line 414
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 415
    .line 416
    .line 417
    move-result-object v2

    .line 418
    iget v9, v2, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 419
    .line 420
    iget v2, v2, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 421
    .line 422
    invoke-static {v9, v2}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 423
    .line 424
    .line 425
    move-result v2

    .line 426
    int-to-float v2, v2

    .line 427
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 428
    .line 429
    .line 430
    move-result-object v9

    .line 431
    invoke-virtual {v9}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 432
    .line 433
    .line 434
    move-result-object v9

    .line 435
    iget v9, v9, Landroid/util/DisplayMetrics;->density:F

    .line 436
    .line 437
    div-float/2addr v2, v9

    .line 438
    mul-float/2addr v2, v1

    .line 439
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 440
    .line 441
    .line 442
    move-result v2

    .line 443
    invoke-static {v0, v2}, Landroidx/compose/foundation/layout/SizeKt;->width-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 444
    .line 445
    .line 446
    move-result-object v2

    .line 447
    invoke-static {v2, v12, v15}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 448
    .line 449
    .line 450
    const v2, 0x7f12017e

    .line 451
    .line 452
    .line 453
    invoke-static {v2, v12, v15}, Landroidx/compose/ui/res/StringResources_androidKt;->stringResource(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    .line 454
    .line 455
    .line 456
    move-result-object v2

    .line 457
    shr-int/lit8 v9, v3, 0x6

    .line 458
    .line 459
    and-int/lit8 v9, v9, 0x70

    .line 460
    .line 461
    invoke-static {v2, v4, v12, v9}, Lb7/s0;->e(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V

    .line 462
    .line 463
    .line 464
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 465
    .line 466
    .line 467
    move-result-object v2

    .line 468
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 469
    .line 470
    .line 471
    move-result-object v2

    .line 472
    iget v9, v2, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 473
    .line 474
    iget v2, v2, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 475
    .line 476
    invoke-static {v9, v2}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 477
    .line 478
    .line 479
    move-result v2

    .line 480
    int-to-float v2, v2

    .line 481
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 482
    .line 483
    .line 484
    move-result-object v9

    .line 485
    invoke-virtual {v9}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 486
    .line 487
    .line 488
    move-result-object v9

    .line 489
    iget v9, v9, Landroid/util/DisplayMetrics;->density:F

    .line 490
    .line 491
    div-float/2addr v2, v9

    .line 492
    mul-float/2addr v2, v1

    .line 493
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 494
    .line 495
    .line 496
    move-result v2

    .line 497
    invoke-static {v0, v2}, Landroidx/compose/foundation/layout/SizeKt;->width-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 498
    .line 499
    .line 500
    move-result-object v2

    .line 501
    invoke-static {v2, v12, v15}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 502
    .line 503
    .line 504
    if-eqz v5, :cond_16

    .line 505
    .line 506
    const v2, 0x6428e84f

    .line 507
    .line 508
    .line 509
    invoke-interface {v12, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 510
    .line 511
    .line 512
    const v2, 0x7f12018f

    .line 513
    .line 514
    .line 515
    invoke-static {v2, v12, v15}, Landroidx/compose/ui/res/StringResources_androidKt;->stringResource(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    .line 516
    .line 517
    .line 518
    move-result-object v2

    .line 519
    shr-int/lit8 v3, v3, 0xf

    .line 520
    .line 521
    and-int/lit8 v3, v3, 0x70

    .line 522
    .line 523
    invoke-static {v2, v7, v12, v3}, Lb7/s0;->h(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V

    .line 524
    .line 525
    .line 526
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 527
    .line 528
    .line 529
    goto :goto_b

    .line 530
    :cond_16
    const v2, 0x642bc7d5

    .line 531
    .line 532
    .line 533
    invoke-interface {v12, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 534
    .line 535
    .line 536
    const v2, 0x7f1201bf

    .line 537
    .line 538
    .line 539
    invoke-static {v2, v12, v15}, Landroidx/compose/ui/res/StringResources_androidKt;->stringResource(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    .line 540
    .line 541
    .line 542
    move-result-object v2

    .line 543
    shr-int/lit8 v3, v3, 0xc

    .line 544
    .line 545
    and-int/lit8 v3, v3, 0x70

    .line 546
    .line 547
    invoke-static {v2, v6, v12, v3}, Lb7/s0;->e(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V

    .line 548
    .line 549
    .line 550
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 551
    .line 552
    .line 553
    :goto_b
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 554
    .line 555
    .line 556
    move-result-object v2

    .line 557
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 558
    .line 559
    .line 560
    move-result-object v2

    .line 561
    iget v3, v2, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 562
    .line 563
    iget v2, v2, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 564
    .line 565
    invoke-static {v3, v2}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 566
    .line 567
    .line 568
    move-result v2

    .line 569
    int-to-float v2, v2

    .line 570
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 571
    .line 572
    .line 573
    move-result-object v3

    .line 574
    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 575
    .line 576
    .line 577
    move-result-object v3

    .line 578
    iget v3, v3, Landroid/util/DisplayMetrics;->density:F

    .line 579
    .line 580
    div-float/2addr v2, v3

    .line 581
    mul-float/2addr v1, v2

    .line 582
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 583
    .line 584
    .line 585
    move-result v1

    .line 586
    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/SizeKt;->width-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 587
    .line 588
    .line 589
    move-result-object v0

    .line 590
    invoke-static {v0, v12, v15}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 591
    .line 592
    .line 593
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 594
    .line 595
    .line 596
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 597
    .line 598
    .line 599
    move-result v0

    .line 600
    if-eqz v0, :cond_17

    .line 601
    .line 602
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 603
    .line 604
    .line 605
    :cond_17
    move-object/from16 v1, v16

    .line 606
    .line 607
    goto :goto_c

    .line 608
    :cond_18
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 609
    .line 610
    .line 611
    move-object v1, v2

    .line 612
    :goto_c
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 613
    .line 614
    .line 615
    move-result-object v10

    .line 616
    if-eqz v10, :cond_19

    .line 617
    .line 618
    new-instance v0, Ly6/c;

    .line 619
    .line 620
    move-object/from16 v2, p1

    .line 621
    .line 622
    move-object/from16 v3, p2

    .line 623
    .line 624
    move/from16 v9, p9

    .line 625
    .line 626
    invoke-direct/range {v0 .. v9}, Ly6/c;-><init>(Landroidx/compose/ui/Modifier;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;II)V

    .line 627
    .line 628
    .line 629
    invoke-interface {v10, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 630
    .line 631
    .line 632
    :cond_19
    return-void
.end method

.method public static final q(Landroidx/compose/ui/Modifier;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 11

    .line 1
    or-int/lit8 v0, p7, 0x1

    invoke-static {v0}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v9

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v10, p8

    move-object/from16 v8, p9

    invoke-static/range {v1 .. v10}, Lcom/zykj/evaluation/ui/sheet/preview/PreviewPageKt;->p(Landroidx/compose/ui/Modifier;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final r(Landroidx/compose/ui/Modifier;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 63

    .line 1
    move-object/from16 v2, p1

    .line 2
    .line 3
    move-object/from16 v3, p2

    .line 4
    .line 5
    move/from16 v4, p4

    .line 6
    .line 7
    const v0, -0x2f2d7aca

    .line 8
    .line 9
    .line 10
    move-object/from16 v1, p3

    .line 11
    .line 12
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    and-int/lit8 v5, p5, 0x1

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    or-int/lit8 v6, v4, 0x6

    .line 21
    .line 22
    move v7, v6

    .line 23
    move-object/from16 v6, p0

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_0
    and-int/lit8 v6, v4, 0x6

    .line 27
    .line 28
    if-nez v6, :cond_2

    .line 29
    .line 30
    move-object/from16 v6, p0

    .line 31
    .line 32
    invoke-interface {v1, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v7

    .line 36
    if-eqz v7, :cond_1

    .line 37
    .line 38
    const/4 v7, 0x4

    .line 39
    goto :goto_0

    .line 40
    :cond_1
    const/4 v7, 0x2

    .line 41
    :goto_0
    or-int/2addr v7, v4

    .line 42
    goto :goto_1

    .line 43
    :cond_2
    move-object/from16 v6, p0

    .line 44
    .line 45
    move v7, v4

    .line 46
    :goto_1
    and-int/lit8 v8, v4, 0x30

    .line 47
    .line 48
    if-nez v8, :cond_4

    .line 49
    .line 50
    invoke-interface {v1, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v8

    .line 54
    if-eqz v8, :cond_3

    .line 55
    .line 56
    const/16 v8, 0x20

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_3
    const/16 v8, 0x10

    .line 60
    .line 61
    :goto_2
    or-int/2addr v7, v8

    .line 62
    :cond_4
    and-int/lit16 v8, v4, 0x180

    .line 63
    .line 64
    if-nez v8, :cond_6

    .line 65
    .line 66
    invoke-interface {v1, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v8

    .line 70
    if-eqz v8, :cond_5

    .line 71
    .line 72
    const/16 v8, 0x100

    .line 73
    .line 74
    goto :goto_3

    .line 75
    :cond_5
    const/16 v8, 0x80

    .line 76
    .line 77
    :goto_3
    or-int/2addr v7, v8

    .line 78
    :cond_6
    and-int/lit16 v8, v7, 0x93

    .line 79
    .line 80
    const/16 v10, 0x92

    .line 81
    .line 82
    const/4 v11, 0x0

    .line 83
    const/4 v12, 0x1

    .line 84
    if-eq v8, v10, :cond_7

    .line 85
    .line 86
    move v8, v12

    .line 87
    goto :goto_4

    .line 88
    :cond_7
    move v8, v11

    .line 89
    :goto_4
    and-int/lit8 v10, v7, 0x1

    .line 90
    .line 91
    invoke-interface {v1, v8, v10}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 92
    .line 93
    .line 94
    move-result v8

    .line 95
    if-eqz v8, :cond_19

    .line 96
    .line 97
    if-eqz v5, :cond_8

    .line 98
    .line 99
    sget-object v5, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 100
    .line 101
    move-object v13, v5

    .line 102
    goto :goto_5

    .line 103
    :cond_8
    move-object v13, v6

    .line 104
    :goto_5
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 105
    .line 106
    .line 107
    move-result v5

    .line 108
    if-eqz v5, :cond_9

    .line 109
    .line 110
    const/4 v5, -0x1

    .line 111
    const-string v6, "com.zykj.evaluation.ui.sheet.preview.PreviewButtonIndexView (PreviewPage.kt:319)"

    .line 112
    .line 113
    invoke-static {v0, v7, v5, v6}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 114
    .line 115
    .line 116
    :cond_9
    invoke-static {v11, v1, v11, v12}, Landroidx/compose/foundation/ScrollKt;->rememberScrollState(ILandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/ScrollState;

    .line 117
    .line 118
    .line 119
    move-result-object v14

    .line 120
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 121
    .line 122
    invoke-interface {v1, v14}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result v5

    .line 126
    invoke-interface {v1, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result v6

    .line 130
    or-int/2addr v5, v6

    .line 131
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v6

    .line 135
    if-nez v5, :cond_a

    .line 136
    .line 137
    sget-object v5, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 138
    .line 139
    invoke-virtual {v5}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v5

    .line 143
    if-ne v6, v5, :cond_b

    .line 144
    .line 145
    :cond_a
    new-instance v6, Lcom/zykj/evaluation/ui/sheet/preview/PreviewPageKt$PreviewButtonIndexView$1$1;

    .line 146
    .line 147
    const/4 v5, 0x0

    .line 148
    invoke-direct {v6, v14, v2, v5}, Lcom/zykj/evaluation/ui/sheet/preview/PreviewPageKt$PreviewButtonIndexView$1$1;-><init>(Landroidx/compose/foundation/ScrollState;Ljava/util/List;Lkotlin/coroutines/Continuation;)V

    .line 149
    .line 150
    .line 151
    invoke-interface {v1, v6}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    :cond_b
    check-cast v6, Lkotlin/jvm/functions/Function2;

    .line 155
    .line 156
    const/4 v5, 0x6

    .line 157
    invoke-static {v0, v6, v1, v5}, Landroidx/compose/runtime/EffectsKt;->LaunchedEffect(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    .line 158
    .line 159
    .line 160
    const/16 v18, 0xe

    .line 161
    .line 162
    const/16 v19, 0x0

    .line 163
    .line 164
    const/4 v15, 0x0

    .line 165
    const/16 v16, 0x0

    .line 166
    .line 167
    const/16 v17, 0x0

    .line 168
    .line 169
    invoke-static/range {v13 .. v19}, Landroidx/compose/foundation/ScrollKt;->horizontalScroll$default(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/ScrollState;ZLandroidx/compose/foundation/gestures/FlingBehavior;ZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    move-object/from16 v30, v13

    .line 174
    .line 175
    sget-object v6, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 176
    .line 177
    invoke-virtual {v6}, Landroidx/compose/ui/Alignment$Companion;->getCenterVertically()Landroidx/compose/ui/Alignment$Vertical;

    .line 178
    .line 179
    .line 180
    move-result-object v6

    .line 181
    sget-object v8, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 182
    .line 183
    invoke-virtual {v8}, Landroidx/compose/foundation/layout/Arrangement;->getStart()Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    .line 184
    .line 185
    .line 186
    move-result-object v8

    .line 187
    const/16 v10, 0x30

    .line 188
    .line 189
    invoke-static {v8, v6, v1, v10}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 190
    .line 191
    .line 192
    move-result-object v6

    .line 193
    invoke-static {v1, v11}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 194
    .line 195
    .line 196
    move-result v8

    .line 197
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 198
    .line 199
    .line 200
    move-result-object v10

    .line 201
    invoke-static {v1, v0}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    sget-object v13, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 206
    .line 207
    invoke-virtual {v13}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    .line 208
    .line 209
    .line 210
    move-result-object v14

    .line 211
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 212
    .line 213
    .line 214
    move-result-object v15

    .line 215
    if-nez v15, :cond_c

    .line 216
    .line 217
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 218
    .line 219
    .line 220
    :cond_c
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 221
    .line 222
    .line 223
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 224
    .line 225
    .line 226
    move-result v15

    .line 227
    if-eqz v15, :cond_d

    .line 228
    .line 229
    invoke-interface {v1, v14}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    .line 230
    .line 231
    .line 232
    goto :goto_6

    .line 233
    :cond_d
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 234
    .line 235
    .line 236
    :goto_6
    invoke-static {v1}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 237
    .line 238
    .line 239
    move-result-object v14

    .line 240
    invoke-virtual {v13}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    .line 241
    .line 242
    .line 243
    move-result-object v15

    .line 244
    invoke-static {v14, v6, v15}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {v13}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    .line 248
    .line 249
    .line 250
    move-result-object v6

    .line 251
    invoke-static {v14, v10, v6}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {v13}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    .line 255
    .line 256
    .line 257
    move-result-object v6

    .line 258
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 259
    .line 260
    .line 261
    move-result v10

    .line 262
    if-nez v10, :cond_e

    .line 263
    .line 264
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object v10

    .line 268
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 269
    .line 270
    .line 271
    move-result-object v15

    .line 272
    invoke-static {v10, v15}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 273
    .line 274
    .line 275
    move-result v10

    .line 276
    if-nez v10, :cond_f

    .line 277
    .line 278
    :cond_e
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 279
    .line 280
    .line 281
    move-result-object v10

    .line 282
    invoke-interface {v14, v10}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 283
    .line 284
    .line 285
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 286
    .line 287
    .line 288
    move-result-object v8

    .line 289
    invoke-interface {v14, v8, v6}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 290
    .line 291
    .line 292
    :cond_f
    invoke-virtual {v13}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    .line 293
    .line 294
    .line 295
    move-result-object v6

    .line 296
    invoke-static {v14, v0, v6}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 297
    .line 298
    .line 299
    sget-object v0, Landroidx/compose/foundation/layout/RowScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/RowScopeInstance;

    .line 300
    .line 301
    const v0, -0x3a03e785

    .line 302
    .line 303
    .line 304
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 305
    .line 306
    .line 307
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 308
    .line 309
    .line 310
    move-result-object v0

    .line 311
    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 312
    .line 313
    .line 314
    move-result v6

    .line 315
    if-eqz v6, :cond_17

    .line 316
    .line 317
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    move-result-object v6

    .line 321
    check-cast v6, Lv6/z;

    .line 322
    .line 323
    sget-object v8, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 324
    .line 325
    const/16 v10, 0xe

    .line 326
    .line 327
    int-to-float v10, v10

    .line 328
    const/16 v13, 0x258

    .line 329
    .line 330
    int-to-float v13, v13

    .line 331
    div-float/2addr v10, v13

    .line 332
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 333
    .line 334
    .line 335
    move-result-object v14

    .line 336
    invoke-virtual {v14}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 337
    .line 338
    .line 339
    move-result-object v14

    .line 340
    iget v15, v14, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 341
    .line 342
    iget v14, v14, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 343
    .line 344
    invoke-static {v15, v14}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 345
    .line 346
    .line 347
    move-result v14

    .line 348
    int-to-float v14, v14

    .line 349
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 350
    .line 351
    .line 352
    move-result-object v15

    .line 353
    invoke-virtual {v15}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 354
    .line 355
    .line 356
    move-result-object v15

    .line 357
    iget v15, v15, Landroid/util/DisplayMetrics;->density:F

    .line 358
    .line 359
    div-float/2addr v14, v15

    .line 360
    mul-float/2addr v10, v14

    .line 361
    invoke-static {v10}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 362
    .line 363
    .line 364
    move-result v10

    .line 365
    invoke-static {v8, v10}, Landroidx/compose/foundation/layout/SizeKt;->size-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 366
    .line 367
    .line 368
    move-result-object v10

    .line 369
    invoke-virtual {v6}, Lv6/z;->d()Lcom/zykj/evaluation/ui/sheet/c;

    .line 370
    .line 371
    .line 372
    move-result-object v14

    .line 373
    invoke-virtual {v14}, Lcom/zykj/evaluation/ui/sheet/c;->a()J

    .line 374
    .line 375
    .line 376
    move-result-wide v14

    .line 377
    move/from16 p0, v5

    .line 378
    .line 379
    const/4 v5, 0x7

    .line 380
    int-to-float v5, v5

    .line 381
    div-float/2addr v5, v13

    .line 382
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 383
    .line 384
    .line 385
    move-result-object v16

    .line 386
    invoke-virtual/range {v16 .. v16}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 387
    .line 388
    .line 389
    move-result-object v11

    .line 390
    iget v9, v11, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 391
    .line 392
    iget v11, v11, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 393
    .line 394
    invoke-static {v9, v11}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 395
    .line 396
    .line 397
    move-result v9

    .line 398
    int-to-float v9, v9

    .line 399
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 400
    .line 401
    .line 402
    move-result-object v11

    .line 403
    invoke-virtual {v11}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 404
    .line 405
    .line 406
    move-result-object v11

    .line 407
    iget v11, v11, Landroid/util/DisplayMetrics;->density:F

    .line 408
    .line 409
    div-float/2addr v9, v11

    .line 410
    mul-float/2addr v9, v5

    .line 411
    invoke-static {v9}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 412
    .line 413
    .line 414
    move-result v9

    .line 415
    invoke-static {v9}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape-0680j_4(F)Landroidx/compose/foundation/shape/RoundedCornerShape;

    .line 416
    .line 417
    .line 418
    move-result-object v9

    .line 419
    invoke-static {v10, v14, v15, v9}, Landroidx/compose/foundation/BackgroundKt;->background-bw27NRU(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;

    .line 420
    .line 421
    .line 422
    move-result-object v9

    .line 423
    int-to-float v10, v12

    .line 424
    invoke-static {v10}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 425
    .line 426
    .line 427
    move-result v10

    .line 428
    invoke-virtual {v6}, Lv6/z;->d()Lcom/zykj/evaluation/ui/sheet/c;

    .line 429
    .line 430
    .line 431
    move-result-object v11

    .line 432
    invoke-virtual {v11}, Lcom/zykj/evaluation/ui/sheet/c;->b()J

    .line 433
    .line 434
    .line 435
    move-result-wide v14

    .line 436
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 437
    .line 438
    .line 439
    move-result-object v11

    .line 440
    invoke-virtual {v11}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 441
    .line 442
    .line 443
    move-result-object v11

    .line 444
    move/from16 v17, v12

    .line 445
    .line 446
    iget v12, v11, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 447
    .line 448
    iget v11, v11, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 449
    .line 450
    invoke-static {v12, v11}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 451
    .line 452
    .line 453
    move-result v11

    .line 454
    int-to-float v11, v11

    .line 455
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 456
    .line 457
    .line 458
    move-result-object v12

    .line 459
    invoke-virtual {v12}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 460
    .line 461
    .line 462
    move-result-object v12

    .line 463
    iget v12, v12, Landroid/util/DisplayMetrics;->density:F

    .line 464
    .line 465
    div-float/2addr v11, v12

    .line 466
    mul-float/2addr v5, v11

    .line 467
    invoke-static {v5}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 468
    .line 469
    .line 470
    move-result v5

    .line 471
    invoke-static {v5}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape-0680j_4(F)Landroidx/compose/foundation/shape/RoundedCornerShape;

    .line 472
    .line 473
    .line 474
    move-result-object v5

    .line 475
    invoke-static {v9, v10, v14, v15, v5}, Landroidx/compose/foundation/BorderKt;->border-xT4_qwU(Landroidx/compose/ui/Modifier;FJLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;

    .line 476
    .line 477
    .line 478
    move-result-object v5

    .line 479
    invoke-virtual {v6}, Lv6/z;->d()Lcom/zykj/evaluation/ui/sheet/c;

    .line 480
    .line 481
    .line 482
    move-result-object v9

    .line 483
    instance-of v9, v9, Lcom/zykj/evaluation/ui/sheet/c$b;

    .line 484
    .line 485
    and-int/lit16 v10, v7, 0x380

    .line 486
    .line 487
    const/16 v11, 0x100

    .line 488
    .line 489
    if-ne v10, v11, :cond_10

    .line 490
    .line 491
    move/from16 v10, v17

    .line 492
    .line 493
    goto :goto_8

    .line 494
    :cond_10
    const/4 v10, 0x0

    .line 495
    :goto_8
    invoke-interface {v1, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 496
    .line 497
    .line 498
    move-result v12

    .line 499
    or-int/2addr v10, v12

    .line 500
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 501
    .line 502
    .line 503
    move-result-object v12

    .line 504
    if-nez v10, :cond_11

    .line 505
    .line 506
    sget-object v10, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 507
    .line 508
    invoke-virtual {v10}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 509
    .line 510
    .line 511
    move-result-object v10

    .line 512
    if-ne v12, v10, :cond_12

    .line 513
    .line 514
    :cond_11
    new-instance v12, Ly6/e;

    .line 515
    .line 516
    invoke-direct {v12, v3, v6}, Ly6/e;-><init>(Lkotlin/jvm/functions/Function1;Lv6/z;)V

    .line 517
    .line 518
    .line 519
    invoke-interface {v1, v12}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 520
    .line 521
    .line 522
    :cond_12
    check-cast v12, Lkotlin/jvm/functions/Function0;

    .line 523
    .line 524
    invoke-static {v5, v9, v12}, Lg7/i;->e(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;)Landroidx/compose/ui/Modifier;

    .line 525
    .line 526
    .line 527
    move-result-object v5

    .line 528
    sget-object v9, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 529
    .line 530
    invoke-virtual {v9}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 531
    .line 532
    .line 533
    move-result-object v10

    .line 534
    const/4 v12, 0x0

    .line 535
    invoke-static {v10, v12}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 536
    .line 537
    .line 538
    move-result-object v10

    .line 539
    invoke-static {v1, v12}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 540
    .line 541
    .line 542
    move-result v14

    .line 543
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 544
    .line 545
    .line 546
    move-result-object v15

    .line 547
    invoke-static {v1, v5}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 548
    .line 549
    .line 550
    move-result-object v5

    .line 551
    sget-object v16, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 552
    .line 553
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    .line 554
    .line 555
    .line 556
    move-result-object v11

    .line 557
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 558
    .line 559
    .line 560
    move-result-object v19

    .line 561
    if-nez v19, :cond_13

    .line 562
    .line 563
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 564
    .line 565
    .line 566
    :cond_13
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 567
    .line 568
    .line 569
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 570
    .line 571
    .line 572
    move-result v19

    .line 573
    if-eqz v19, :cond_14

    .line 574
    .line 575
    invoke-interface {v1, v11}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    .line 576
    .line 577
    .line 578
    goto :goto_9

    .line 579
    :cond_14
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 580
    .line 581
    .line 582
    :goto_9
    invoke-static {v1}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 583
    .line 584
    .line 585
    move-result-object v11

    .line 586
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    .line 587
    .line 588
    .line 589
    move-result-object v12

    .line 590
    invoke-static {v11, v10, v12}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 591
    .line 592
    .line 593
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    .line 594
    .line 595
    .line 596
    move-result-object v10

    .line 597
    invoke-static {v11, v15, v10}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 598
    .line 599
    .line 600
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    .line 601
    .line 602
    .line 603
    move-result-object v10

    .line 604
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 605
    .line 606
    .line 607
    move-result v12

    .line 608
    if-nez v12, :cond_15

    .line 609
    .line 610
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 611
    .line 612
    .line 613
    move-result-object v12

    .line 614
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 615
    .line 616
    .line 617
    move-result-object v15

    .line 618
    invoke-static {v12, v15}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 619
    .line 620
    .line 621
    move-result v12

    .line 622
    if-nez v12, :cond_16

    .line 623
    .line 624
    :cond_15
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 625
    .line 626
    .line 627
    move-result-object v12

    .line 628
    invoke-interface {v11, v12}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 629
    .line 630
    .line 631
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 632
    .line 633
    .line 634
    move-result-object v12

    .line 635
    invoke-interface {v11, v12, v10}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 636
    .line 637
    .line 638
    :cond_16
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    .line 639
    .line 640
    .line 641
    move-result-object v10

    .line 642
    invoke-static {v11, v5, v10}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 643
    .line 644
    .line 645
    sget-object v5, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 646
    .line 647
    invoke-virtual {v9}, Landroidx/compose/ui/Alignment$Companion;->getCenter()Landroidx/compose/ui/Alignment;

    .line 648
    .line 649
    .line 650
    move-result-object v9

    .line 651
    invoke-interface {v5, v8, v9}, Landroidx/compose/foundation/layout/BoxScope;->align(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;)Landroidx/compose/ui/Modifier;

    .line 652
    .line 653
    .line 654
    move-result-object v5

    .line 655
    invoke-virtual {v6}, Lv6/z;->c()I

    .line 656
    .line 657
    .line 658
    move-result v9

    .line 659
    add-int/lit8 v9, v9, 0x1

    .line 660
    .line 661
    invoke-static {v9}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 662
    .line 663
    .line 664
    move-result-object v9

    .line 665
    new-instance v31, Landroidx/compose/ui/text/TextStyle;

    .line 666
    .line 667
    invoke-virtual {v6}, Lv6/z;->d()Lcom/zykj/evaluation/ui/sheet/c;

    .line 668
    .line 669
    .line 670
    move-result-object v6

    .line 671
    invoke-virtual {v6}, Lcom/zykj/evaluation/ui/sheet/c;->c()J

    .line 672
    .line 673
    .line 674
    move-result-wide v32

    .line 675
    invoke-static/range {p0 .. p0}, Lo5/e;->k(I)J

    .line 676
    .line 677
    .line 678
    move-result-wide v34

    .line 679
    const v61, 0xfffffc

    .line 680
    .line 681
    .line 682
    const/16 v62, 0x0

    .line 683
    .line 684
    const/16 v36, 0x0

    .line 685
    .line 686
    const/16 v37, 0x0

    .line 687
    .line 688
    const/16 v38, 0x0

    .line 689
    .line 690
    const/16 v39, 0x0

    .line 691
    .line 692
    const/16 v40, 0x0

    .line 693
    .line 694
    const-wide/16 v41, 0x0

    .line 695
    .line 696
    const/16 v43, 0x0

    .line 697
    .line 698
    const/16 v44, 0x0

    .line 699
    .line 700
    const/16 v45, 0x0

    .line 701
    .line 702
    const-wide/16 v46, 0x0

    .line 703
    .line 704
    const/16 v48, 0x0

    .line 705
    .line 706
    const/16 v49, 0x0

    .line 707
    .line 708
    const/16 v50, 0x0

    .line 709
    .line 710
    const/16 v51, 0x0

    .line 711
    .line 712
    const/16 v52, 0x0

    .line 713
    .line 714
    const-wide/16 v53, 0x0

    .line 715
    .line 716
    const/16 v55, 0x0

    .line 717
    .line 718
    const/16 v56, 0x0

    .line 719
    .line 720
    const/16 v57, 0x0

    .line 721
    .line 722
    const/16 v58, 0x0

    .line 723
    .line 724
    const/16 v59, 0x0

    .line 725
    .line 726
    const/16 v60, 0x0

    .line 727
    .line 728
    invoke-direct/range {v31 .. v62}, Landroidx/compose/ui/text/TextStyle;-><init>(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 729
    .line 730
    .line 731
    const/16 v28, 0x0

    .line 732
    .line 733
    const v29, 0xfffc

    .line 734
    .line 735
    .line 736
    move v6, v7

    .line 737
    move-object v10, v8

    .line 738
    const-wide/16 v7, 0x0

    .line 739
    .line 740
    move v12, v6

    .line 741
    move-object v11, v10

    .line 742
    move-object v6, v5

    .line 743
    move-object v5, v9

    .line 744
    const-wide/16 v9, 0x0

    .line 745
    .line 746
    move-object v14, v11

    .line 747
    const/4 v11, 0x0

    .line 748
    move v15, v12

    .line 749
    const/4 v12, 0x0

    .line 750
    move/from16 v16, v13

    .line 751
    .line 752
    const/4 v13, 0x0

    .line 753
    move-object/from16 v20, v14

    .line 754
    .line 755
    move/from16 v19, v15

    .line 756
    .line 757
    const-wide/16 v14, 0x0

    .line 758
    .line 759
    move/from16 v21, v16

    .line 760
    .line 761
    const/16 v16, 0x0

    .line 762
    .line 763
    move/from16 v22, v17

    .line 764
    .line 765
    const/16 v17, 0x0

    .line 766
    .line 767
    move/from16 v23, v19

    .line 768
    .line 769
    const/16 v24, 0x100

    .line 770
    .line 771
    const-wide/16 v18, 0x0

    .line 772
    .line 773
    move-object/from16 v25, v20

    .line 774
    .line 775
    const/16 v20, 0x0

    .line 776
    .line 777
    move/from16 v26, v21

    .line 778
    .line 779
    const/16 v21, 0x0

    .line 780
    .line 781
    move/from16 v27, v22

    .line 782
    .line 783
    const/16 v22, 0x0

    .line 784
    .line 785
    move/from16 v32, v23

    .line 786
    .line 787
    const/16 v23, 0x0

    .line 788
    .line 789
    move/from16 v33, v24

    .line 790
    .line 791
    const/16 v24, 0x0

    .line 792
    .line 793
    move/from16 v34, v27

    .line 794
    .line 795
    const/16 v27, 0x0

    .line 796
    .line 797
    move-object/from16 v35, v0

    .line 798
    .line 799
    move/from16 v0, p0

    .line 800
    .line 801
    move-object/from16 p0, v35

    .line 802
    .line 803
    move/from16 v35, v26

    .line 804
    .line 805
    move-object/from16 v26, v1

    .line 806
    .line 807
    move-object/from16 v1, v25

    .line 808
    .line 809
    move-object/from16 v25, v31

    .line 810
    .line 811
    move/from16 v31, v35

    .line 812
    .line 813
    move/from16 v35, v34

    .line 814
    .line 815
    const/16 v34, 0x0

    .line 816
    .line 817
    invoke-static/range {v5 .. v29}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 818
    .line 819
    .line 820
    move-object/from16 v5, v26

    .line 821
    .line 822
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 823
    .line 824
    .line 825
    const/4 v6, 0x5

    .line 826
    int-to-float v6, v6

    .line 827
    div-float v6, v6, v31

    .line 828
    .line 829
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 830
    .line 831
    .line 832
    move-result-object v7

    .line 833
    invoke-virtual {v7}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 834
    .line 835
    .line 836
    move-result-object v7

    .line 837
    iget v8, v7, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 838
    .line 839
    iget v7, v7, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 840
    .line 841
    invoke-static {v8, v7}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 842
    .line 843
    .line 844
    move-result v7

    .line 845
    int-to-float v7, v7

    .line 846
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 847
    .line 848
    .line 849
    move-result-object v8

    .line 850
    invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 851
    .line 852
    .line 853
    move-result-object v8

    .line 854
    iget v8, v8, Landroid/util/DisplayMetrics;->density:F

    .line 855
    .line 856
    div-float/2addr v7, v8

    .line 857
    mul-float/2addr v6, v7

    .line 858
    invoke-static {v6}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 859
    .line 860
    .line 861
    move-result v6

    .line 862
    invoke-static {v1, v6}, Landroidx/compose/foundation/layout/SizeKt;->width-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 863
    .line 864
    .line 865
    move-result-object v1

    .line 866
    invoke-static {v1, v5, v0}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 867
    .line 868
    .line 869
    move-object v1, v5

    .line 870
    move/from16 v7, v32

    .line 871
    .line 872
    move/from16 v11, v34

    .line 873
    .line 874
    move/from16 v12, v35

    .line 875
    .line 876
    move v5, v0

    .line 877
    move-object/from16 v0, p0

    .line 878
    .line 879
    goto/16 :goto_7

    .line 880
    .line 881
    :cond_17
    move-object v5, v1

    .line 882
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 883
    .line 884
    .line 885
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 886
    .line 887
    .line 888
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 889
    .line 890
    .line 891
    move-result v0

    .line 892
    if-eqz v0, :cond_18

    .line 893
    .line 894
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 895
    .line 896
    .line 897
    :cond_18
    move-object/from16 v1, v30

    .line 898
    .line 899
    goto :goto_a

    .line 900
    :cond_19
    move-object v5, v1

    .line 901
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 902
    .line 903
    .line 904
    move-object v1, v6

    .line 905
    :goto_a
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 906
    .line 907
    .line 908
    move-result-object v6

    .line 909
    if-eqz v6, :cond_1a

    .line 910
    .line 911
    new-instance v0, Ly6/f;

    .line 912
    .line 913
    move/from16 v5, p5

    .line 914
    .line 915
    invoke-direct/range {v0 .. v5}, Ly6/f;-><init>(Landroidx/compose/ui/Modifier;Ljava/util/List;Lkotlin/jvm/functions/Function1;II)V

    .line 916
    .line 917
    .line 918
    invoke-interface {v6, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 919
    .line 920
    .line 921
    :cond_1a
    return-void
.end method

.method public static final s(Lkotlin/jvm/functions/Function1;Lv6/z;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 5
    .line 6
    return-object p0
.end method

.method public static final t(Landroidx/compose/ui/Modifier;Ljava/util/List;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 6

    .line 1
    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lcom/zykj/evaluation/ui/sheet/preview/PreviewPageKt;->r(Landroidx/compose/ui/Modifier;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final u(Landroidx/compose/ui/Modifier;Landroid/graphics/Bitmap;Ljava/util/List;Lb7/t0;Lcom/zykj/evaluation/ui/sheet/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 46

    .line 1
    move-object/from16 v5, p4

    .line 2
    .line 3
    move/from16 v7, p7

    .line 4
    .line 5
    const v0, 0x64c1b863

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p6

    .line 9
    .line 10
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 11
    .line 12
    .line 13
    move-result-object v13

    .line 14
    and-int/lit8 v1, p8, 0x1

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    or-int/lit8 v2, v7, 0x6

    .line 19
    .line 20
    move v3, v2

    .line 21
    move-object/from16 v2, p0

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_0
    and-int/lit8 v2, v7, 0x6

    .line 25
    .line 26
    if-nez v2, :cond_2

    .line 27
    .line 28
    move-object/from16 v2, p0

    .line 29
    .line 30
    invoke-interface {v13, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    if-eqz v3, :cond_1

    .line 35
    .line 36
    const/4 v3, 0x4

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    const/4 v3, 0x2

    .line 39
    :goto_0
    or-int/2addr v3, v7

    .line 40
    goto :goto_1

    .line 41
    :cond_2
    move-object/from16 v2, p0

    .line 42
    .line 43
    move v3, v7

    .line 44
    :goto_1
    and-int/lit8 v4, v7, 0x30

    .line 45
    .line 46
    if-nez v4, :cond_4

    .line 47
    .line 48
    move-object/from16 v4, p1

    .line 49
    .line 50
    invoke-interface {v13, v4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v6

    .line 54
    if-eqz v6, :cond_3

    .line 55
    .line 56
    const/16 v6, 0x20

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_3
    const/16 v6, 0x10

    .line 60
    .line 61
    :goto_2
    or-int/2addr v3, v6

    .line 62
    goto :goto_3

    .line 63
    :cond_4
    move-object/from16 v4, p1

    .line 64
    .line 65
    :goto_3
    and-int/lit16 v6, v7, 0x180

    .line 66
    .line 67
    if-nez v6, :cond_6

    .line 68
    .line 69
    move-object/from16 v6, p2

    .line 70
    .line 71
    invoke-interface {v13, v6}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v8

    .line 75
    if-eqz v8, :cond_5

    .line 76
    .line 77
    const/16 v8, 0x100

    .line 78
    .line 79
    goto :goto_4

    .line 80
    :cond_5
    const/16 v8, 0x80

    .line 81
    .line 82
    :goto_4
    or-int/2addr v3, v8

    .line 83
    goto :goto_5

    .line 84
    :cond_6
    move-object/from16 v6, p2

    .line 85
    .line 86
    :goto_5
    and-int/lit16 v8, v7, 0xc00

    .line 87
    .line 88
    if-nez v8, :cond_8

    .line 89
    .line 90
    move-object/from16 v8, p3

    .line 91
    .line 92
    invoke-interface {v13, v8}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v9

    .line 96
    if-eqz v9, :cond_7

    .line 97
    .line 98
    const/16 v9, 0x800

    .line 99
    .line 100
    goto :goto_6

    .line 101
    :cond_7
    const/16 v9, 0x400

    .line 102
    .line 103
    :goto_6
    or-int/2addr v3, v9

    .line 104
    goto :goto_7

    .line 105
    :cond_8
    move-object/from16 v8, p3

    .line 106
    .line 107
    :goto_7
    and-int/lit16 v9, v7, 0x6000

    .line 108
    .line 109
    if-nez v9, :cond_a

    .line 110
    .line 111
    invoke-interface {v13, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v9

    .line 115
    if-eqz v9, :cond_9

    .line 116
    .line 117
    const/16 v9, 0x4000

    .line 118
    .line 119
    goto :goto_8

    .line 120
    :cond_9
    const/16 v9, 0x2000

    .line 121
    .line 122
    :goto_8
    or-int/2addr v3, v9

    .line 123
    :cond_a
    const/high16 v9, 0x30000

    .line 124
    .line 125
    and-int/2addr v9, v7

    .line 126
    if-nez v9, :cond_c

    .line 127
    .line 128
    move-object/from16 v9, p5

    .line 129
    .line 130
    invoke-interface {v13, v9}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result v10

    .line 134
    if-eqz v10, :cond_b

    .line 135
    .line 136
    const/high16 v10, 0x20000

    .line 137
    .line 138
    goto :goto_9

    .line 139
    :cond_b
    const/high16 v10, 0x10000

    .line 140
    .line 141
    :goto_9
    or-int/2addr v3, v10

    .line 142
    goto :goto_a

    .line 143
    :cond_c
    move-object/from16 v9, p5

    .line 144
    .line 145
    :goto_a
    const v10, 0x12493

    .line 146
    .line 147
    .line 148
    and-int/2addr v10, v3

    .line 149
    const v11, 0x12492

    .line 150
    .line 151
    .line 152
    const/4 v12, 0x0

    .line 153
    if-eq v10, v11, :cond_d

    .line 154
    .line 155
    const/4 v10, 0x1

    .line 156
    goto :goto_b

    .line 157
    :cond_d
    move v10, v12

    .line 158
    :goto_b
    and-int/lit8 v11, v3, 0x1

    .line 159
    .line 160
    invoke-interface {v13, v10, v11}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 161
    .line 162
    .line 163
    move-result v10

    .line 164
    if-eqz v10, :cond_20

    .line 165
    .line 166
    if-eqz v1, :cond_e

    .line 167
    .line 168
    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 169
    .line 170
    move-object v15, v1

    .line 171
    goto :goto_c

    .line 172
    :cond_e
    move-object v15, v2

    .line 173
    :goto_c
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 174
    .line 175
    .line 176
    move-result v1

    .line 177
    if-eqz v1, :cond_f

    .line 178
    .line 179
    const/4 v1, -0x1

    .line 180
    const-string v2, "com.zykj.evaluation.ui.sheet.preview.PreviewImage (PreviewPage.kt:202)"

    .line 181
    .line 182
    invoke-static {v0, v3, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 183
    .line 184
    .line 185
    :cond_f
    const-wide v0, 0xffd8d8d8L

    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    invoke-static {v0, v1}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 191
    .line 192
    .line 193
    move-result-wide v16

    .line 194
    const/16 v19, 0x2

    .line 195
    .line 196
    const/16 v20, 0x0

    .line 197
    .line 198
    const/16 v18, 0x0

    .line 199
    .line 200
    invoke-static/range {v15 .. v20}, Landroidx/compose/foundation/BackgroundKt;->background-bw27NRU$default(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    move-object v1, v15

    .line 205
    sget-object v2, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 206
    .line 207
    invoke-virtual {v2}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 208
    .line 209
    .line 210
    move-result-object v10

    .line 211
    invoke-static {v10, v12}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 212
    .line 213
    .line 214
    move-result-object v10

    .line 215
    invoke-static {v13, v12}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 216
    .line 217
    .line 218
    move-result v11

    .line 219
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 220
    .line 221
    .line 222
    move-result-object v15

    .line 223
    invoke-static {v13, v0}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    sget-object v18, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 228
    .line 229
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    .line 230
    .line 231
    .line 232
    move-result-object v12

    .line 233
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 234
    .line 235
    .line 236
    move-result-object v16

    .line 237
    if-nez v16, :cond_10

    .line 238
    .line 239
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 240
    .line 241
    .line 242
    :cond_10
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 243
    .line 244
    .line 245
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 246
    .line 247
    .line 248
    move-result v16

    .line 249
    if-eqz v16, :cond_11

    .line 250
    .line 251
    invoke-interface {v13, v12}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    .line 252
    .line 253
    .line 254
    goto :goto_d

    .line 255
    :cond_11
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 256
    .line 257
    .line 258
    :goto_d
    invoke-static {v13}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 259
    .line 260
    .line 261
    move-result-object v12

    .line 262
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    .line 263
    .line 264
    .line 265
    move-result-object v14

    .line 266
    invoke-static {v12, v10, v14}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 267
    .line 268
    .line 269
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    .line 270
    .line 271
    .line 272
    move-result-object v10

    .line 273
    invoke-static {v12, v15, v10}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 274
    .line 275
    .line 276
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    .line 277
    .line 278
    .line 279
    move-result-object v10

    .line 280
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 281
    .line 282
    .line 283
    move-result v14

    .line 284
    if-nez v14, :cond_12

    .line 285
    .line 286
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    move-result-object v14

    .line 290
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 291
    .line 292
    .line 293
    move-result-object v15

    .line 294
    invoke-static {v14, v15}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 295
    .line 296
    .line 297
    move-result v14

    .line 298
    if-nez v14, :cond_13

    .line 299
    .line 300
    :cond_12
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 301
    .line 302
    .line 303
    move-result-object v14

    .line 304
    invoke-interface {v12, v14}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 305
    .line 306
    .line 307
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 308
    .line 309
    .line 310
    move-result-object v11

    .line 311
    invoke-interface {v12, v11, v10}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 312
    .line 313
    .line 314
    :cond_13
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    .line 315
    .line 316
    .line 317
    move-result-object v10

    .line 318
    invoke-static {v12, v0, v10}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 319
    .line 320
    .line 321
    sget-object v0, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 322
    .line 323
    sget-object v10, Lcom/zykj/evaluation/ui/sheet/b$d;->b:Lcom/zykj/evaluation/ui/sheet/b$d;

    .line 324
    .line 325
    invoke-static {v5, v10}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 326
    .line 327
    .line 328
    move-result v10

    .line 329
    const/16 v12, 0x258

    .line 330
    .line 331
    const/4 v14, 0x0

    .line 332
    const/4 v15, 0x0

    .line 333
    if-nez v10, :cond_14

    .line 334
    .line 335
    instance-of v10, v5, Lcom/zykj/evaluation/ui/sheet/b$c;

    .line 336
    .line 337
    if-eqz v10, :cond_15

    .line 338
    .line 339
    :cond_14
    move-object/from16 p0, v1

    .line 340
    .line 341
    const/4 v1, 0x6

    .line 342
    const/4 v8, 0x3

    .line 343
    goto/16 :goto_10

    .line 344
    .line 345
    :cond_15
    sget-object v3, Lcom/zykj/evaluation/ui/sheet/b$b;->b:Lcom/zykj/evaluation/ui/sheet/b$b;

    .line 346
    .line 347
    invoke-static {v5, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 348
    .line 349
    .line 350
    move-result v3

    .line 351
    if-eqz v3, :cond_1a

    .line 352
    .line 353
    const v3, -0xf1031c3

    .line 354
    .line 355
    .line 356
    invoke-interface {v13, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 357
    .line 358
    .line 359
    sget-object v3, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 360
    .line 361
    const/4 v10, 0x1

    .line 362
    invoke-static {v3, v15, v10, v14}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxSize$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 363
    .line 364
    .line 365
    move-result-object v10

    .line 366
    invoke-virtual {v2}, Landroidx/compose/ui/Alignment$Companion;->getCenter()Landroidx/compose/ui/Alignment;

    .line 367
    .line 368
    .line 369
    move-result-object v14

    .line 370
    const/4 v15, 0x0

    .line 371
    invoke-static {v14, v15}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 372
    .line 373
    .line 374
    move-result-object v14

    .line 375
    invoke-static {v13, v15}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 376
    .line 377
    .line 378
    move-result v16

    .line 379
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 380
    .line 381
    .line 382
    move-result-object v11

    .line 383
    invoke-static {v13, v10}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 384
    .line 385
    .line 386
    move-result-object v10

    .line 387
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    .line 388
    .line 389
    .line 390
    move-result-object v15

    .line 391
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 392
    .line 393
    .line 394
    move-result-object v17

    .line 395
    if-nez v17, :cond_16

    .line 396
    .line 397
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 398
    .line 399
    .line 400
    :cond_16
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 401
    .line 402
    .line 403
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 404
    .line 405
    .line 406
    move-result v17

    .line 407
    if-eqz v17, :cond_17

    .line 408
    .line 409
    invoke-interface {v13, v15}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    .line 410
    .line 411
    .line 412
    goto :goto_e

    .line 413
    :cond_17
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 414
    .line 415
    .line 416
    :goto_e
    invoke-static {v13}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 417
    .line 418
    .line 419
    move-result-object v15

    .line 420
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    .line 421
    .line 422
    .line 423
    move-result-object v9

    .line 424
    invoke-static {v15, v14, v9}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 425
    .line 426
    .line 427
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    .line 428
    .line 429
    .line 430
    move-result-object v9

    .line 431
    invoke-static {v15, v11, v9}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 432
    .line 433
    .line 434
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    .line 435
    .line 436
    .line 437
    move-result-object v9

    .line 438
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 439
    .line 440
    .line 441
    move-result v11

    .line 442
    if-nez v11, :cond_18

    .line 443
    .line 444
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 445
    .line 446
    .line 447
    move-result-object v11

    .line 448
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 449
    .line 450
    .line 451
    move-result-object v14

    .line 452
    invoke-static {v11, v14}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 453
    .line 454
    .line 455
    move-result v11

    .line 456
    if-nez v11, :cond_19

    .line 457
    .line 458
    :cond_18
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 459
    .line 460
    .line 461
    move-result-object v11

    .line 462
    invoke-interface {v15, v11}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 463
    .line 464
    .line 465
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 466
    .line 467
    .line 468
    move-result-object v11

    .line 469
    invoke-interface {v15, v11, v9}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 470
    .line 471
    .line 472
    :cond_19
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    .line 473
    .line 474
    .line 475
    move-result-object v9

    .line 476
    invoke-static {v15, v10, v9}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 477
    .line 478
    .line 479
    const/16 v9, 0x12c

    .line 480
    .line 481
    int-to-float v9, v9

    .line 482
    int-to-float v10, v12

    .line 483
    div-float/2addr v9, v10

    .line 484
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 485
    .line 486
    .line 487
    move-result-object v10

    .line 488
    invoke-virtual {v10}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 489
    .line 490
    .line 491
    move-result-object v10

    .line 492
    iget v11, v10, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 493
    .line 494
    iget v10, v10, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 495
    .line 496
    invoke-static {v11, v10}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 497
    .line 498
    .line 499
    move-result v10

    .line 500
    int-to-float v10, v10

    .line 501
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 502
    .line 503
    .line 504
    move-result-object v11

    .line 505
    invoke-virtual {v11}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 506
    .line 507
    .line 508
    move-result-object v11

    .line 509
    iget v11, v11, Landroid/util/DisplayMetrics;->density:F

    .line 510
    .line 511
    div-float/2addr v10, v11

    .line 512
    mul-float/2addr v9, v10

    .line 513
    invoke-static {v9}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 514
    .line 515
    .line 516
    move-result v9

    .line 517
    invoke-static {v3, v9}, Landroidx/compose/foundation/layout/SizeKt;->size-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 518
    .line 519
    .line 520
    move-result-object v10

    .line 521
    const v3, 0x7f080169

    .line 522
    .line 523
    .line 524
    const/4 v9, 0x6

    .line 525
    invoke-static {v3, v13, v9}, Landroidx/compose/ui/res/PainterResources_androidKt;->painterResource(ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;

    .line 526
    .line 527
    .line 528
    move-result-object v3

    .line 529
    const/16 v16, 0x1b0

    .line 530
    .line 531
    const/16 v17, 0x78

    .line 532
    .line 533
    move v11, v9

    .line 534
    const/4 v9, 0x0

    .line 535
    move v14, v11

    .line 536
    const/4 v11, 0x0

    .line 537
    move v15, v12

    .line 538
    const/4 v12, 0x0

    .line 539
    move-object/from16 v29, v13

    .line 540
    .line 541
    const/4 v13, 0x0

    .line 542
    move/from16 v19, v14

    .line 543
    .line 544
    const/4 v14, 0x0

    .line 545
    move-object/from16 p0, v1

    .line 546
    .line 547
    move-object v8, v3

    .line 548
    move/from16 v1, v19

    .line 549
    .line 550
    move-object/from16 v15, v29

    .line 551
    .line 552
    const/4 v3, 0x3

    .line 553
    invoke-static/range {v8 .. v17}, Landroidx/compose/foundation/ImageKt;->Image(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/runtime/Composer;II)V

    .line 554
    .line 555
    .line 556
    move-object v13, v15

    .line 557
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 558
    .line 559
    .line 560
    :goto_f
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 561
    .line 562
    .line 563
    goto :goto_11

    .line 564
    :cond_1a
    move-object/from16 p0, v1

    .line 565
    .line 566
    const/4 v1, 0x6

    .line 567
    const/4 v3, 0x3

    .line 568
    const v8, -0xf8c597b

    .line 569
    .line 570
    .line 571
    invoke-interface {v13, v8}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 572
    .line 573
    .line 574
    goto :goto_f

    .line 575
    :goto_10
    const v9, -0xf1553a1

    .line 576
    .line 577
    .line 578
    invoke-interface {v13, v9}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 579
    .line 580
    .line 581
    sget-object v9, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 582
    .line 583
    const/4 v10, 0x1

    .line 584
    invoke-static {v9, v15, v10, v14}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxSize$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 585
    .line 586
    .line 587
    move-result-object v9

    .line 588
    and-int/lit8 v10, v3, 0x70

    .line 589
    .line 590
    or-int/2addr v10, v1

    .line 591
    and-int/lit16 v11, v3, 0x380

    .line 592
    .line 593
    or-int/2addr v10, v11

    .line 594
    and-int/lit16 v11, v3, 0x1c00

    .line 595
    .line 596
    or-int/2addr v10, v11

    .line 597
    const v11, 0xe000

    .line 598
    .line 599
    .line 600
    shr-int/2addr v3, v8

    .line 601
    and-int/2addr v3, v11

    .line 602
    or-int v14, v10, v3

    .line 603
    .line 604
    const/4 v15, 0x0

    .line 605
    move-object/from16 v11, p3

    .line 606
    .line 607
    move-object/from16 v12, p5

    .line 608
    .line 609
    move-object v10, v6

    .line 610
    move v3, v8

    .line 611
    move-object v8, v9

    .line 612
    move-object v9, v4

    .line 613
    invoke-static/range {v8 .. v15}, Lcom/zykj/evaluation/ui/sheet/widget/AnswerSheetCorrectViewKt;->e(Landroidx/compose/ui/Modifier;Landroid/graphics/Bitmap;Ljava/util/List;Lb7/t0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    .line 614
    .line 615
    .line 616
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 617
    .line 618
    .line 619
    :goto_11
    sget-object v20, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 620
    .line 621
    const/4 v4, 0x5

    .line 622
    int-to-float v4, v4

    .line 623
    const/16 v15, 0x258

    .line 624
    .line 625
    int-to-float v6, v15

    .line 626
    div-float/2addr v4, v6

    .line 627
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 628
    .line 629
    .line 630
    move-result-object v8

    .line 631
    invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 632
    .line 633
    .line 634
    move-result-object v8

    .line 635
    iget v9, v8, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 636
    .line 637
    iget v8, v8, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 638
    .line 639
    invoke-static {v9, v8}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 640
    .line 641
    .line 642
    move-result v8

    .line 643
    int-to-float v8, v8

    .line 644
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 645
    .line 646
    .line 647
    move-result-object v9

    .line 648
    invoke-virtual {v9}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 649
    .line 650
    .line 651
    move-result-object v9

    .line 652
    iget v9, v9, Landroid/util/DisplayMetrics;->density:F

    .line 653
    .line 654
    div-float/2addr v8, v9

    .line 655
    mul-float/2addr v4, v8

    .line 656
    invoke-static {v4}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 657
    .line 658
    .line 659
    move-result v24

    .line 660
    const/16 v25, 0x7

    .line 661
    .line 662
    const/16 v26, 0x0

    .line 663
    .line 664
    const/16 v21, 0x0

    .line 665
    .line 666
    const/16 v22, 0x0

    .line 667
    .line 668
    const/16 v23, 0x0

    .line 669
    .line 670
    invoke-static/range {v20 .. v26}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 671
    .line 672
    .line 673
    move-result-object v4

    .line 674
    move-object/from16 v8, v20

    .line 675
    .line 676
    invoke-virtual {v2}, Landroidx/compose/ui/Alignment$Companion;->getBottomCenter()Landroidx/compose/ui/Alignment;

    .line 677
    .line 678
    .line 679
    move-result-object v9

    .line 680
    invoke-interface {v0, v4, v9}, Landroidx/compose/foundation/layout/BoxScope;->align(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;)Landroidx/compose/ui/Modifier;

    .line 681
    .line 682
    .line 683
    move-result-object v4

    .line 684
    const/high16 v9, 0x4e000000    # 5.368709E8f

    .line 685
    .line 686
    invoke-static {v9}, Landroidx/compose/ui/graphics/ColorKt;->Color(I)J

    .line 687
    .line 688
    .line 689
    move-result-wide v9

    .line 690
    const/16 v11, 0xe

    .line 691
    .line 692
    int-to-float v11, v11

    .line 693
    div-float/2addr v11, v6

    .line 694
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 695
    .line 696
    .line 697
    move-result-object v12

    .line 698
    invoke-virtual {v12}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 699
    .line 700
    .line 701
    move-result-object v12

    .line 702
    iget v14, v12, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 703
    .line 704
    iget v12, v12, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 705
    .line 706
    invoke-static {v14, v12}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 707
    .line 708
    .line 709
    move-result v12

    .line 710
    int-to-float v12, v12

    .line 711
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 712
    .line 713
    .line 714
    move-result-object v14

    .line 715
    invoke-virtual {v14}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 716
    .line 717
    .line 718
    move-result-object v14

    .line 719
    iget v14, v14, Landroid/util/DisplayMetrics;->density:F

    .line 720
    .line 721
    div-float/2addr v12, v14

    .line 722
    mul-float/2addr v11, v12

    .line 723
    invoke-static {v11}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 724
    .line 725
    .line 726
    move-result v11

    .line 727
    invoke-static {v11}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape-0680j_4(F)Landroidx/compose/foundation/shape/RoundedCornerShape;

    .line 728
    .line 729
    .line 730
    move-result-object v11

    .line 731
    invoke-static {v4, v9, v10, v11}, Landroidx/compose/foundation/BackgroundKt;->background-bw27NRU(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;

    .line 732
    .line 733
    .line 734
    move-result-object v4

    .line 735
    int-to-float v3, v3

    .line 736
    div-float/2addr v3, v6

    .line 737
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 738
    .line 739
    .line 740
    move-result-object v9

    .line 741
    invoke-virtual {v9}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 742
    .line 743
    .line 744
    move-result-object v9

    .line 745
    iget v10, v9, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 746
    .line 747
    iget v9, v9, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 748
    .line 749
    invoke-static {v10, v9}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 750
    .line 751
    .line 752
    move-result v9

    .line 753
    int-to-float v9, v9

    .line 754
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 755
    .line 756
    .line 757
    move-result-object v10

    .line 758
    invoke-virtual {v10}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 759
    .line 760
    .line 761
    move-result-object v10

    .line 762
    iget v10, v10, Landroid/util/DisplayMetrics;->density:F

    .line 763
    .line 764
    div-float/2addr v9, v10

    .line 765
    mul-float/2addr v3, v9

    .line 766
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 767
    .line 768
    .line 769
    move-result v3

    .line 770
    int-to-float v1, v1

    .line 771
    div-float/2addr v1, v6

    .line 772
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 773
    .line 774
    .line 775
    move-result-object v6

    .line 776
    invoke-virtual {v6}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 777
    .line 778
    .line 779
    move-result-object v6

    .line 780
    iget v9, v6, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 781
    .line 782
    iget v6, v6, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 783
    .line 784
    invoke-static {v9, v6}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 785
    .line 786
    .line 787
    move-result v6

    .line 788
    int-to-float v6, v6

    .line 789
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 790
    .line 791
    .line 792
    move-result-object v9

    .line 793
    invoke-virtual {v9}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 794
    .line 795
    .line 796
    move-result-object v9

    .line 797
    iget v9, v9, Landroid/util/DisplayMetrics;->density:F

    .line 798
    .line 799
    div-float/2addr v6, v9

    .line 800
    mul-float/2addr v1, v6

    .line 801
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 802
    .line 803
    .line 804
    move-result v1

    .line 805
    invoke-static {v4, v1, v3}, Landroidx/compose/foundation/layout/PaddingKt;->padding-VpY3zN4(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    .line 806
    .line 807
    .line 808
    move-result-object v1

    .line 809
    invoke-virtual {v2}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 810
    .line 811
    .line 812
    move-result-object v3

    .line 813
    const/4 v15, 0x0

    .line 814
    invoke-static {v3, v15}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 815
    .line 816
    .line 817
    move-result-object v3

    .line 818
    invoke-static {v13, v15}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 819
    .line 820
    .line 821
    move-result v4

    .line 822
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 823
    .line 824
    .line 825
    move-result-object v6

    .line 826
    invoke-static {v13, v1}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 827
    .line 828
    .line 829
    move-result-object v1

    .line 830
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    .line 831
    .line 832
    .line 833
    move-result-object v9

    .line 834
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 835
    .line 836
    .line 837
    move-result-object v10

    .line 838
    if-nez v10, :cond_1b

    .line 839
    .line 840
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 841
    .line 842
    .line 843
    :cond_1b
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 844
    .line 845
    .line 846
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 847
    .line 848
    .line 849
    move-result v10

    .line 850
    if-eqz v10, :cond_1c

    .line 851
    .line 852
    invoke-interface {v13, v9}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    .line 853
    .line 854
    .line 855
    goto :goto_12

    .line 856
    :cond_1c
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 857
    .line 858
    .line 859
    :goto_12
    invoke-static {v13}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 860
    .line 861
    .line 862
    move-result-object v9

    .line 863
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    .line 864
    .line 865
    .line 866
    move-result-object v10

    .line 867
    invoke-static {v9, v3, v10}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 868
    .line 869
    .line 870
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    .line 871
    .line 872
    .line 873
    move-result-object v3

    .line 874
    invoke-static {v9, v6, v3}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 875
    .line 876
    .line 877
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    .line 878
    .line 879
    .line 880
    move-result-object v3

    .line 881
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 882
    .line 883
    .line 884
    move-result v6

    .line 885
    if-nez v6, :cond_1d

    .line 886
    .line 887
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 888
    .line 889
    .line 890
    move-result-object v6

    .line 891
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 892
    .line 893
    .line 894
    move-result-object v10

    .line 895
    invoke-static {v6, v10}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 896
    .line 897
    .line 898
    move-result v6

    .line 899
    if-nez v6, :cond_1e

    .line 900
    .line 901
    :cond_1d
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 902
    .line 903
    .line 904
    move-result-object v6

    .line 905
    invoke-interface {v9, v6}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 906
    .line 907
    .line 908
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 909
    .line 910
    .line 911
    move-result-object v4

    .line 912
    invoke-interface {v9, v4, v3}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 913
    .line 914
    .line 915
    :cond_1e
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    .line 916
    .line 917
    .line 918
    move-result-object v3

    .line 919
    invoke-static {v9, v1, v3}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 920
    .line 921
    .line 922
    invoke-virtual {v2}, Landroidx/compose/ui/Alignment$Companion;->getCenter()Landroidx/compose/ui/Alignment;

    .line 923
    .line 924
    .line 925
    move-result-object v1

    .line 926
    invoke-interface {v0, v8, v1}, Landroidx/compose/foundation/layout/BoxScope;->align(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;)Landroidx/compose/ui/Modifier;

    .line 927
    .line 928
    .line 929
    move-result-object v9

    .line 930
    invoke-virtual {v5}, Lcom/zykj/evaluation/ui/sheet/b;->a()Ljava/lang/String;

    .line 931
    .line 932
    .line 933
    move-result-object v8

    .line 934
    new-instance v28, Landroidx/compose/ui/text/TextStyle;

    .line 935
    .line 936
    sget-object v0, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 937
    .line 938
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    .line 939
    .line 940
    .line 941
    move-result-wide v15

    .line 942
    const/4 v0, 0x7

    .line 943
    invoke-static {v0}, Lo5/e;->k(I)J

    .line 944
    .line 945
    .line 946
    move-result-wide v17

    .line 947
    const v44, 0xfffffc

    .line 948
    .line 949
    .line 950
    const/16 v45, 0x0

    .line 951
    .line 952
    const/16 v19, 0x0

    .line 953
    .line 954
    const/16 v20, 0x0

    .line 955
    .line 956
    const/16 v21, 0x0

    .line 957
    .line 958
    const/16 v22, 0x0

    .line 959
    .line 960
    const/16 v23, 0x0

    .line 961
    .line 962
    const-wide/16 v24, 0x0

    .line 963
    .line 964
    const/16 v26, 0x0

    .line 965
    .line 966
    const/16 v27, 0x0

    .line 967
    .line 968
    move-object/from16 v14, v28

    .line 969
    .line 970
    const/16 v28, 0x0

    .line 971
    .line 972
    const-wide/16 v29, 0x0

    .line 973
    .line 974
    const/16 v31, 0x0

    .line 975
    .line 976
    const/16 v32, 0x0

    .line 977
    .line 978
    const/16 v33, 0x0

    .line 979
    .line 980
    const/16 v34, 0x0

    .line 981
    .line 982
    const/16 v35, 0x0

    .line 983
    .line 984
    const-wide/16 v36, 0x0

    .line 985
    .line 986
    const/16 v38, 0x0

    .line 987
    .line 988
    const/16 v39, 0x0

    .line 989
    .line 990
    const/16 v40, 0x0

    .line 991
    .line 992
    const/16 v41, 0x0

    .line 993
    .line 994
    const/16 v42, 0x0

    .line 995
    .line 996
    const/16 v43, 0x0

    .line 997
    .line 998
    invoke-direct/range {v14 .. v45}, Landroidx/compose/ui/text/TextStyle;-><init>(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 999
    .line 1000
    .line 1001
    const/high16 v31, 0x180000

    .line 1002
    .line 1003
    const v32, 0xfffc

    .line 1004
    .line 1005
    .line 1006
    const-wide/16 v10, 0x0

    .line 1007
    .line 1008
    move-object/from16 v29, v13

    .line 1009
    .line 1010
    const-wide/16 v12, 0x0

    .line 1011
    .line 1012
    move-object/from16 v28, v14

    .line 1013
    .line 1014
    const/4 v14, 0x0

    .line 1015
    const/4 v15, 0x0

    .line 1016
    const/16 v16, 0x0

    .line 1017
    .line 1018
    const-wide/16 v17, 0x0

    .line 1019
    .line 1020
    const-wide/16 v21, 0x0

    .line 1021
    .line 1022
    const/16 v23, 0x0

    .line 1023
    .line 1024
    const/16 v24, 0x0

    .line 1025
    .line 1026
    const/16 v25, 0x0

    .line 1027
    .line 1028
    const/16 v26, 0x0

    .line 1029
    .line 1030
    const/16 v30, 0x0

    .line 1031
    .line 1032
    invoke-static/range {v8 .. v32}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 1033
    .line 1034
    .line 1035
    move-object/from16 v13, v29

    .line 1036
    .line 1037
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 1038
    .line 1039
    .line 1040
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 1041
    .line 1042
    .line 1043
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 1044
    .line 1045
    .line 1046
    move-result v0

    .line 1047
    if-eqz v0, :cond_1f

    .line 1048
    .line 1049
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 1050
    .line 1051
    .line 1052
    :cond_1f
    move-object/from16 v1, p0

    .line 1053
    .line 1054
    goto :goto_13

    .line 1055
    :cond_20
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 1056
    .line 1057
    .line 1058
    move-object v1, v2

    .line 1059
    :goto_13
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 1060
    .line 1061
    .line 1062
    move-result-object v9

    .line 1063
    if-eqz v9, :cond_21

    .line 1064
    .line 1065
    new-instance v0, Ly6/b;

    .line 1066
    .line 1067
    move-object/from16 v2, p1

    .line 1068
    .line 1069
    move-object/from16 v3, p2

    .line 1070
    .line 1071
    move-object/from16 v4, p3

    .line 1072
    .line 1073
    move-object/from16 v6, p5

    .line 1074
    .line 1075
    move/from16 v8, p8

    .line 1076
    .line 1077
    invoke-direct/range {v0 .. v8}, Ly6/b;-><init>(Landroidx/compose/ui/Modifier;Landroid/graphics/Bitmap;Ljava/util/List;Lb7/t0;Lcom/zykj/evaluation/ui/sheet/b;Lkotlin/jvm/functions/Function1;II)V

    .line 1078
    .line 1079
    .line 1080
    invoke-interface {v9, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 1081
    .line 1082
    .line 1083
    :cond_21
    return-void
.end method

.method public static final v(Landroidx/compose/ui/Modifier;Landroid/graphics/Bitmap;Ljava/util/List;Lb7/t0;Lcom/zykj/evaluation/ui/sheet/b;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 10

    .line 1
    or-int/lit8 v0, p6, 0x1

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 4
    .line 5
    .line 6
    move-result v8

    .line 7
    move-object v1, p0

    .line 8
    move-object v2, p1

    .line 9
    move-object v3, p2

    .line 10
    move-object v4, p3

    .line 11
    move-object v5, p4

    .line 12
    move-object v6, p5

    .line 13
    move/from16 v9, p7

    .line 14
    .line 15
    move-object/from16 v7, p8

    .line 16
    .line 17
    invoke-static/range {v1 .. v9}, Lcom/zykj/evaluation/ui/sheet/preview/PreviewPageKt;->u(Landroidx/compose/ui/Modifier;Landroid/graphics/Bitmap;Ljava/util/List;Lb7/t0;Lcom/zykj/evaluation/ui/sheet/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    .line 18
    .line 19
    .line 20
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 21
    .line 22
    return-object p0
.end method

.method public static final w(Landroidx/navigation/NavController;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V
    .locals 8

    .line 1
    const-string v0, "navController"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "viewModel"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "onBackHandle"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const v0, -0x4af3d152

    .line 17
    .line 18
    .line 19
    invoke-interface {p3, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 20
    .line 21
    .line 22
    move-result-object v5

    .line 23
    and-int/lit8 p3, p4, 0x6

    .line 24
    .line 25
    if-nez p3, :cond_1

    .line 26
    .line 27
    invoke-interface {v5, p0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p3

    .line 31
    if-eqz p3, :cond_0

    .line 32
    .line 33
    const/4 p3, 0x4

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    const/4 p3, 0x2

    .line 36
    :goto_0
    or-int/2addr p3, p4

    .line 37
    goto :goto_1

    .line 38
    :cond_1
    move p3, p4

    .line 39
    :goto_1
    and-int/lit8 v1, p4, 0x30

    .line 40
    .line 41
    if-nez v1, :cond_3

    .line 42
    .line 43
    invoke-interface {v5, p1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-eqz v1, :cond_2

    .line 48
    .line 49
    const/16 v1, 0x20

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_2
    const/16 v1, 0x10

    .line 53
    .line 54
    :goto_2
    or-int/2addr p3, v1

    .line 55
    :cond_3
    and-int/lit16 v1, p4, 0x180

    .line 56
    .line 57
    if-nez v1, :cond_5

    .line 58
    .line 59
    invoke-interface {v5, p2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-eqz v1, :cond_4

    .line 64
    .line 65
    const/16 v1, 0x100

    .line 66
    .line 67
    goto :goto_3

    .line 68
    :cond_4
    const/16 v1, 0x80

    .line 69
    .line 70
    :goto_3
    or-int/2addr p3, v1

    .line 71
    :cond_5
    and-int/lit16 v1, p3, 0x93

    .line 72
    .line 73
    const/16 v2, 0x92

    .line 74
    .line 75
    const/4 v3, 0x1

    .line 76
    if-eq v1, v2, :cond_6

    .line 77
    .line 78
    move v1, v3

    .line 79
    goto :goto_4

    .line 80
    :cond_6
    const/4 v1, 0x0

    .line 81
    :goto_4
    and-int/lit8 v2, p3, 0x1

    .line 82
    .line 83
    invoke-interface {v5, v1, v2}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    if-eqz v1, :cond_e

    .line 88
    .line 89
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    if-eqz v1, :cond_7

    .line 94
    .line 95
    const/4 v1, -0x1

    .line 96
    const-string v2, "com.zykj.evaluation.ui.sheet.preview.PreviewPage (PreviewPage.kt:63)"

    .line 97
    .line 98
    invoke-static {v0, p3, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 99
    .line 100
    .line 101
    :cond_7
    sget-object p3, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 102
    .line 103
    invoke-interface {v5, p1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    invoke-interface {v5, p0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    or-int/2addr v0, v1

    .line 112
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    if-nez v0, :cond_8

    .line 117
    .line 118
    sget-object v0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 119
    .line 120
    invoke-virtual {v0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    if-ne v1, v0, :cond_9

    .line 125
    .line 126
    :cond_8
    new-instance v1, Lcom/zykj/evaluation/ui/sheet/preview/PreviewPageKt$PreviewPage$1$1;

    .line 127
    .line 128
    const/4 v0, 0x0

    .line 129
    invoke-direct {v1, p1, p0, v0}, Lcom/zykj/evaluation/ui/sheet/preview/PreviewPageKt$PreviewPage$1$1;-><init>(Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Landroidx/navigation/NavController;Lkotlin/coroutines/Continuation;)V

    .line 130
    .line 131
    .line 132
    invoke-interface {v5, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    :cond_9
    check-cast v1, Lkotlin/jvm/functions/Function2;

    .line 136
    .line 137
    const/4 v0, 0x6

    .line 138
    invoke-static {p3, v1, v5, v0}, Landroidx/compose/runtime/EffectsKt;->LaunchedEffect(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {p1}, Lcom/zykj/evaluation/base/BaseViewModel;->b()Ll5/c;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    invoke-virtual {p1}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->D()Lcom/zykj/evaluation/ui/sheet/a;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    invoke-interface {v5, p0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result v4

    .line 153
    invoke-interface {v5, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result v6

    .line 157
    or-int/2addr v4, v6

    .line 158
    invoke-interface {v5, p1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result v6

    .line 162
    or-int/2addr v4, v6

    .line 163
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v6

    .line 167
    if-nez v4, :cond_a

    .line 168
    .line 169
    sget-object v4, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 170
    .line 171
    invoke-virtual {v4}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v4

    .line 175
    if-ne v6, v4, :cond_b

    .line 176
    .line 177
    :cond_a
    new-instance v6, Ly6/a;

    .line 178
    .line 179
    invoke-direct {v6, p0, v2, p1}, Ly6/a;-><init>(Landroidx/navigation/NavController;Lcom/zykj/evaluation/ui/sheet/a;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;)V

    .line 180
    .line 181
    .line 182
    invoke-interface {v5, v6}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 183
    .line 184
    .line 185
    :cond_b
    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 186
    .line 187
    invoke-static {p3, v6, v5, v0}, Landroidx/compose/runtime/EffectsKt;->DisposableEffect(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v1}, Ll5/c;->c()Z

    .line 191
    .line 192
    .line 193
    move-result v1

    .line 194
    invoke-interface {v5, p1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    move-result p3

    .line 198
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    if-nez p3, :cond_c

    .line 203
    .line 204
    sget-object p3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 205
    .line 206
    invoke-virtual {p3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object p3

    .line 210
    if-ne v0, p3, :cond_d

    .line 211
    .line 212
    :cond_c
    new-instance v0, Ly6/g;

    .line 213
    .line 214
    invoke-direct {v0, p1}, Ly6/g;-><init>(Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;)V

    .line 215
    .line 216
    .line 217
    invoke-interface {v5, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 218
    .line 219
    .line 220
    :cond_d
    check-cast v0, Lkotlin/jvm/functions/Function0;

    .line 221
    .line 222
    new-instance p3, Ly6/h;

    .line 223
    .line 224
    invoke-direct {p3, v2, p1, p0, p2}, Ly6/h;-><init>(Lcom/zykj/evaluation/ui/sheet/a;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Landroidx/navigation/NavController;Lkotlin/jvm/functions/Function0;)V

    .line 225
    .line 226
    .line 227
    const/16 v2, 0x36

    .line 228
    .line 229
    const v4, 0x4388f00d

    .line 230
    .line 231
    .line 232
    invoke-static {v4, v3, p3, v5, v2}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 233
    .line 234
    .line 235
    move-result-object v4

    .line 236
    const/16 v6, 0xc00

    .line 237
    .line 238
    const/4 v7, 0x2

    .line 239
    const/4 v2, 0x0

    .line 240
    move-object v3, v0

    .line 241
    invoke-static/range {v1 .. v7}, Le7/h;->d(ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    .line 242
    .line 243
    .line 244
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 245
    .line 246
    .line 247
    move-result p3

    .line 248
    if-eqz p3, :cond_f

    .line 249
    .line 250
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 251
    .line 252
    .line 253
    goto :goto_5

    .line 254
    :cond_e
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 255
    .line 256
    .line 257
    :cond_f
    :goto_5
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 258
    .line 259
    .line 260
    move-result-object p3

    .line 261
    if-eqz p3, :cond_10

    .line 262
    .line 263
    new-instance v0, Ly6/i;

    .line 264
    .line 265
    invoke-direct {v0, p0, p1, p2, p4}, Ly6/i;-><init>(Landroidx/navigation/NavController;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Lkotlin/jvm/functions/Function0;I)V

    .line 266
    .line 267
    .line 268
    invoke-interface {p3, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 269
    .line 270
    .line 271
    :cond_10
    return-void
.end method

.method public static final x(Lcom/zykj/evaluation/ui/sheet/a;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Landroidx/navigation/NavController;Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 21

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    move-object/from16 v9, p5

    .line 8
    .line 9
    move/from16 v3, p6

    .line 10
    .line 11
    const-string v4, "$this$BoxWithLoadState"

    .line 12
    .line 13
    move-object/from16 v5, p4

    .line 14
    .line 15
    invoke-static {v5, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    and-int/lit8 v4, v3, 0x11

    .line 19
    .line 20
    const/16 v5, 0x10

    .line 21
    .line 22
    const/4 v6, 0x0

    .line 23
    const/4 v12, 0x1

    .line 24
    if-eq v4, v5, :cond_0

    .line 25
    .line 26
    move v4, v12

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move v4, v6

    .line 29
    :goto_0
    and-int/lit8 v5, v3, 0x1

    .line 30
    .line 31
    invoke-interface {v9, v4, v5}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    if-eqz v4, :cond_10

    .line 36
    .line 37
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    if-eqz v4, :cond_1

    .line 42
    .line 43
    const/4 v4, -0x1

    .line 44
    const-string v5, "com.zykj.evaluation.ui.sheet.preview.PreviewPage.<anonymous> (PreviewPage.kt:136)"

    .line 45
    .line 46
    const v7, 0x4388f00d

    .line 47
    .line 48
    .line 49
    invoke-static {v7, v3, v4, v5}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 50
    .line 51
    .line 52
    :cond_1
    sget-object v13, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 53
    .line 54
    sget-object v3, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 55
    .line 56
    invoke-virtual {v3}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    sget-object v4, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 61
    .line 62
    invoke-virtual {v4}, Landroidx/compose/ui/Alignment$Companion;->getStart()Landroidx/compose/ui/Alignment$Horizontal;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    invoke-static {v3, v4, v9, v6}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    invoke-static {v9, v6}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 71
    .line 72
    .line 73
    move-result v4

    .line 74
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    invoke-static {v9, v13}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 79
    .line 80
    .line 81
    move-result-object v6

    .line 82
    sget-object v7, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 83
    .line 84
    invoke-virtual {v7}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    .line 85
    .line 86
    .line 87
    move-result-object v8

    .line 88
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 89
    .line 90
    .line 91
    move-result-object v10

    .line 92
    if-nez v10, :cond_2

    .line 93
    .line 94
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 95
    .line 96
    .line 97
    :cond_2
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 98
    .line 99
    .line 100
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 101
    .line 102
    .line 103
    move-result v10

    .line 104
    if-eqz v10, :cond_3

    .line 105
    .line 106
    invoke-interface {v9, v8}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    .line 107
    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_3
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 111
    .line 112
    .line 113
    :goto_1
    invoke-static {v9}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 114
    .line 115
    .line 116
    move-result-object v8

    .line 117
    invoke-virtual {v7}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    .line 118
    .line 119
    .line 120
    move-result-object v10

    .line 121
    invoke-static {v8, v3, v10}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v7}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    .line 125
    .line 126
    .line 127
    move-result-object v3

    .line 128
    invoke-static {v8, v5, v3}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v7}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    .line 132
    .line 133
    .line 134
    move-result-object v3

    .line 135
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 136
    .line 137
    .line 138
    move-result v5

    .line 139
    if-nez v5, :cond_4

    .line 140
    .line 141
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v5

    .line 145
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 146
    .line 147
    .line 148
    move-result-object v10

    .line 149
    invoke-static {v5, v10}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result v5

    .line 153
    if-nez v5, :cond_5

    .line 154
    .line 155
    :cond_4
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 156
    .line 157
    .line 158
    move-result-object v5

    .line 159
    invoke-interface {v8, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 163
    .line 164
    .line 165
    move-result-object v4

    .line 166
    invoke-interface {v8, v4, v3}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 167
    .line 168
    .line 169
    :cond_5
    invoke-virtual {v7}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    .line 170
    .line 171
    .line 172
    move-result-object v3

    .line 173
    invoke-static {v8, v6, v3}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 174
    .line 175
    .line 176
    sget-object v14, Landroidx/compose/foundation/layout/ColumnScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    .line 177
    .line 178
    const/4 v3, 0x0

    .line 179
    const/4 v4, 0x0

    .line 180
    invoke-static {v13, v3, v12, v4}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 181
    .line 182
    .line 183
    move-result-object v15

    .line 184
    const/16 v18, 0x2

    .line 185
    .line 186
    const/16 v19, 0x0

    .line 187
    .line 188
    const/high16 v16, 0x3f800000    # 1.0f

    .line 189
    .line 190
    const/16 v17, 0x0

    .line 191
    .line 192
    invoke-static/range {v14 .. v19}, Landroidx/compose/foundation/layout/ColumnScope;->weight$default(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/ui/Modifier;FZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 193
    .line 194
    .line 195
    move-result-object v5

    .line 196
    move-object v6, v4

    .line 197
    invoke-virtual/range {p0 .. p0}, Lcom/zykj/evaluation/ui/sheet/a;->f()Landroid/graphics/Bitmap;

    .line 198
    .line 199
    .line 200
    move-result-object v4

    .line 201
    move v7, v3

    .line 202
    move-object v3, v5

    .line 203
    invoke-virtual/range {p0 .. p0}, Lcom/zykj/evaluation/ui/sheet/a;->c()Ljava/util/List;

    .line 204
    .line 205
    .line 206
    move-result-object v5

    .line 207
    move-object v8, v6

    .line 208
    invoke-virtual/range {p0 .. p0}, Lcom/zykj/evaluation/ui/sheet/a;->d()Lb7/t0;

    .line 209
    .line 210
    .line 211
    move-result-object v6

    .line 212
    move v10, v7

    .line 213
    invoke-virtual/range {p0 .. p0}, Lcom/zykj/evaluation/ui/sheet/a;->g()Lcom/zykj/evaluation/ui/sheet/b;

    .line 214
    .line 215
    .line 216
    move-result-object v7

    .line 217
    invoke-interface {v9, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 218
    .line 219
    .line 220
    move-result v11

    .line 221
    invoke-interface {v9, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    move-result v14

    .line 225
    or-int/2addr v11, v14

    .line 226
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v14

    .line 230
    if-nez v11, :cond_6

    .line 231
    .line 232
    sget-object v11, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 233
    .line 234
    invoke-virtual {v11}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v11

    .line 238
    if-ne v14, v11, :cond_7

    .line 239
    .line 240
    :cond_6
    new-instance v14, Ly6/k;

    .line 241
    .line 242
    invoke-direct {v14, v0, v1}, Ly6/k;-><init>(Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Landroidx/navigation/NavController;)V

    .line 243
    .line 244
    .line 245
    invoke-interface {v9, v14}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 246
    .line 247
    .line 248
    :cond_7
    check-cast v14, Lkotlin/jvm/functions/Function1;

    .line 249
    .line 250
    move v11, v10

    .line 251
    const/4 v10, 0x0

    .line 252
    move v15, v11

    .line 253
    const/4 v11, 0x0

    .line 254
    move-object/from16 v20, v14

    .line 255
    .line 256
    move-object v14, v8

    .line 257
    move-object/from16 v8, v20

    .line 258
    .line 259
    invoke-static/range {v3 .. v11}, Lcom/zykj/evaluation/ui/sheet/preview/PreviewPageKt;->u(Landroidx/compose/ui/Modifier;Landroid/graphics/Bitmap;Ljava/util/List;Lb7/t0;Lcom/zykj/evaluation/ui/sheet/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    .line 260
    .line 261
    .line 262
    invoke-static {v13, v15, v12, v14}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 263
    .line 264
    .line 265
    move-result-object v3

    .line 266
    const/16 v4, 0x1e

    .line 267
    .line 268
    int-to-float v4, v4

    .line 269
    const/16 v5, 0x258

    .line 270
    .line 271
    int-to-float v5, v5

    .line 272
    div-float/2addr v4, v5

    .line 273
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 274
    .line 275
    .line 276
    move-result-object v5

    .line 277
    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 278
    .line 279
    .line 280
    move-result-object v5

    .line 281
    iget v6, v5, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 282
    .line 283
    iget v5, v5, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 284
    .line 285
    invoke-static {v6, v5}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 286
    .line 287
    .line 288
    move-result v5

    .line 289
    int-to-float v5, v5

    .line 290
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 291
    .line 292
    .line 293
    move-result-object v6

    .line 294
    invoke-virtual {v6}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 295
    .line 296
    .line 297
    move-result-object v6

    .line 298
    iget v6, v6, Landroid/util/DisplayMetrics;->density:F

    .line 299
    .line 300
    div-float/2addr v5, v6

    .line 301
    mul-float/2addr v4, v5

    .line 302
    invoke-static {v4}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 303
    .line 304
    .line 305
    move-result v4

    .line 306
    invoke-static {v3, v4}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 307
    .line 308
    .line 309
    move-result-object v3

    .line 310
    invoke-virtual/range {p0 .. p0}, Lcom/zykj/evaluation/ui/sheet/a;->e()Ljava/util/List;

    .line 311
    .line 312
    .line 313
    move-result-object v4

    .line 314
    invoke-virtual/range {p0 .. p0}, Lcom/zykj/evaluation/ui/sheet/a;->h()Z

    .line 315
    .line 316
    .line 317
    move-result v5

    .line 318
    invoke-interface {v9, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 319
    .line 320
    .line 321
    move-result v6

    .line 322
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    move-result-object v7

    .line 326
    if-nez v6, :cond_8

    .line 327
    .line 328
    sget-object v6, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 329
    .line 330
    invoke-virtual {v6}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    move-result-object v6

    .line 334
    if-ne v7, v6, :cond_9

    .line 335
    .line 336
    :cond_8
    new-instance v7, Ly6/l;

    .line 337
    .line 338
    invoke-direct {v7, v0}, Ly6/l;-><init>(Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;)V

    .line 339
    .line 340
    .line 341
    invoke-interface {v9, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 342
    .line 343
    .line 344
    :cond_9
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 345
    .line 346
    invoke-interface {v9, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 347
    .line 348
    .line 349
    move-result v6

    .line 350
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 351
    .line 352
    .line 353
    move-result-object v8

    .line 354
    if-nez v6, :cond_a

    .line 355
    .line 356
    sget-object v6, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 357
    .line 358
    invoke-virtual {v6}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 359
    .line 360
    .line 361
    move-result-object v6

    .line 362
    if-ne v8, v6, :cond_b

    .line 363
    .line 364
    :cond_a
    new-instance v8, Ly6/m;

    .line 365
    .line 366
    invoke-direct {v8, v1}, Ly6/m;-><init>(Landroidx/navigation/NavController;)V

    .line 367
    .line 368
    .line 369
    invoke-interface {v9, v8}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 370
    .line 371
    .line 372
    :cond_b
    check-cast v8, Lkotlin/jvm/functions/Function0;

    .line 373
    .line 374
    invoke-interface {v9, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 375
    .line 376
    .line 377
    move-result v6

    .line 378
    invoke-interface {v9, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 379
    .line 380
    .line 381
    move-result v10

    .line 382
    or-int/2addr v6, v10

    .line 383
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 384
    .line 385
    .line 386
    move-result-object v10

    .line 387
    if-nez v6, :cond_c

    .line 388
    .line 389
    sget-object v6, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 390
    .line 391
    invoke-virtual {v6}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 392
    .line 393
    .line 394
    move-result-object v6

    .line 395
    if-ne v10, v6, :cond_d

    .line 396
    .line 397
    :cond_c
    new-instance v10, Ly6/n;

    .line 398
    .line 399
    invoke-direct {v10, v0, v1}, Ly6/n;-><init>(Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Landroidx/navigation/NavController;)V

    .line 400
    .line 401
    .line 402
    invoke-interface {v9, v10}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 403
    .line 404
    .line 405
    :cond_d
    check-cast v10, Lkotlin/jvm/functions/Function0;

    .line 406
    .line 407
    invoke-interface {v9, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 408
    .line 409
    .line 410
    move-result v6

    .line 411
    invoke-interface {v9, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 412
    .line 413
    .line 414
    move-result v11

    .line 415
    or-int/2addr v6, v11

    .line 416
    invoke-interface {v9, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 417
    .line 418
    .line 419
    move-result v11

    .line 420
    or-int/2addr v6, v11

    .line 421
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 422
    .line 423
    .line 424
    move-result-object v11

    .line 425
    if-nez v6, :cond_e

    .line 426
    .line 427
    sget-object v6, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 428
    .line 429
    invoke-virtual {v6}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 430
    .line 431
    .line 432
    move-result-object v6

    .line 433
    if-ne v11, v6, :cond_f

    .line 434
    .line 435
    :cond_e
    new-instance v11, Ly6/o;

    .line 436
    .line 437
    invoke-direct {v11, v0, v2, v1}, Ly6/o;-><init>(Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Lkotlin/jvm/functions/Function0;Landroidx/navigation/NavController;)V

    .line 438
    .line 439
    .line 440
    invoke-interface {v9, v11}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 441
    .line 442
    .line 443
    :cond_f
    move-object v6, v11

    .line 444
    check-cast v6, Lkotlin/jvm/functions/Function0;

    .line 445
    .line 446
    move-object v0, v3

    .line 447
    move-object v3, v8

    .line 448
    const/4 v8, 0x6

    .line 449
    const/4 v9, 0x0

    .line 450
    move-object v1, v4

    .line 451
    move v4, v5

    .line 452
    move-object v2, v7

    .line 453
    move-object v5, v10

    .line 454
    move-object/from16 v7, p5

    .line 455
    .line 456
    invoke-static/range {v0 .. v9}, Lcom/zykj/evaluation/ui/sheet/preview/PreviewPageKt;->p(Landroidx/compose/ui/Modifier;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V

    .line 457
    .line 458
    .line 459
    invoke-interface/range {p5 .. p5}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 460
    .line 461
    .line 462
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 463
    .line 464
    .line 465
    move-result v0

    .line 466
    if-eqz v0, :cond_11

    .line 467
    .line 468
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 469
    .line 470
    .line 471
    goto :goto_2

    .line 472
    :cond_10
    invoke-interface/range {p5 .. p5}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 473
    .line 474
    .line 475
    :cond_11
    :goto_2
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 476
    .line 477
    return-object v0
.end method

.method public static final y(Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Lv6/z;)Lkotlin/Unit;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lv6/z;->c()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    invoke-virtual {p0, p1}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->o(I)V

    .line 11
    .line 12
    .line 13
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 14
    .line 15
    return-object p0
.end method

.method public static final z(Landroidx/navigation/NavController;)Lkotlin/Unit;
    .locals 6

    .line 1
    const/4 v4, 0x6

    .line 2
    const/4 v5, 0x0

    .line 3
    const-string v1, "ANSWER_SHEET"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    move-object v0, p0

    .line 8
    invoke-static/range {v0 .. v5}, Landroidx/navigation/NavController;->navigate$default(Landroidx/navigation/NavController;Ljava/lang/String;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;ILjava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 12
    .line 13
    return-object p0
.end method
