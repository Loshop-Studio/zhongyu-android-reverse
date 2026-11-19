.class public abstract Li6/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Ljava/util/List;)Ljava/util/List;
    .locals 13

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_4

    .line 20
    .line 21
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Li6/b;

    .line 26
    .line 27
    new-instance v2, Landroidx/collection/ArrayMap;

    .line 28
    .line 29
    invoke-direct {v2}, Landroidx/collection/ArrayMap;-><init>()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Li6/b;->e()Ljava/util/List;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    if-eqz v3, :cond_3

    .line 45
    .line 46
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    check-cast v3, Li6/l;

    .line 51
    .line 52
    invoke-virtual {v3}, Li6/l;->f()J

    .line 53
    .line 54
    .line 55
    move-result-wide v4

    .line 56
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    invoke-interface {v2, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    if-nez v4, :cond_0

    .line 65
    .line 66
    invoke-virtual {v3}, Li6/l;->f()J

    .line 67
    .line 68
    .line 69
    move-result-wide v4

    .line 70
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    new-instance v5, Lcom/zykj/evaluation/bean/CommitTaskAnswer;

    .line 75
    .line 76
    invoke-virtual {v3}, Li6/l;->f()J

    .line 77
    .line 78
    .line 79
    move-result-wide v6

    .line 80
    const/4 v10, 0x6

    .line 81
    const/4 v11, 0x0

    .line 82
    const/4 v8, 0x0

    .line 83
    const/4 v9, 0x0

    .line 84
    invoke-direct/range {v5 .. v11}, Lcom/zykj/evaluation/bean/CommitTaskAnswer;-><init>(JLjava/lang/String;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 85
    .line 86
    .line 87
    invoke-interface {v2, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    :cond_0
    invoke-virtual {v3}, Li6/l;->f()J

    .line 91
    .line 92
    .line 93
    move-result-wide v4

    .line 94
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 95
    .line 96
    .line 97
    move-result-object v4

    .line 98
    invoke-virtual {v3}, Li6/l;->f()J

    .line 99
    .line 100
    .line 101
    move-result-wide v5

    .line 102
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 103
    .line 104
    .line 105
    move-result-object v5

    .line 106
    invoke-virtual {v2, v5}, Landroidx/collection/ArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v5

    .line 110
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    move-object v6, v5

    .line 114
    check-cast v6, Lcom/zykj/evaluation/bean/CommitTaskAnswer;

    .line 115
    .line 116
    new-instance v10, Ljava/util/ArrayList;

    .line 117
    .line 118
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v3}, Li6/l;->f()J

    .line 122
    .line 123
    .line 124
    move-result-wide v7

    .line 125
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 126
    .line 127
    .line 128
    move-result-object v5

    .line 129
    invoke-virtual {v2, v5}, Landroidx/collection/ArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v5

    .line 133
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    check-cast v5, Lcom/zykj/evaluation/bean/CommitTaskAnswer;

    .line 137
    .line 138
    invoke-virtual {v5}, Lcom/zykj/evaluation/bean/CommitTaskAnswer;->getAnswers()Ljava/util/List;

    .line 139
    .line 140
    .line 141
    move-result-object v5

    .line 142
    invoke-virtual {v10, v5}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 143
    .line 144
    .line 145
    invoke-virtual {v3}, Li6/l;->g()I

    .line 146
    .line 147
    .line 148
    move-result v5

    .line 149
    sget-object v7, Li6/p0$c$a;->b:Li6/p0$c$a;

    .line 150
    .line 151
    invoke-virtual {v7}, Li6/p0;->a()I

    .line 152
    .line 153
    .line 154
    move-result v7

    .line 155
    if-eq v5, v7, :cond_2

    .line 156
    .line 157
    invoke-virtual {v3}, Li6/l;->g()I

    .line 158
    .line 159
    .line 160
    move-result v5

    .line 161
    sget-object v7, Li6/p0$a;->b:Li6/p0$a;

    .line 162
    .line 163
    invoke-virtual {v7}, Li6/p0;->a()I

    .line 164
    .line 165
    .line 166
    move-result v7

    .line 167
    if-ne v5, v7, :cond_1

    .line 168
    .line 169
    goto :goto_2

    .line 170
    :cond_1
    invoke-virtual {v3}, Li6/l;->d()Ljava/util/List;

    .line 171
    .line 172
    .line 173
    move-result-object v5

    .line 174
    goto :goto_3

    .line 175
    :cond_2
    :goto_2
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 176
    .line 177
    .line 178
    move-result-object v5

    .line 179
    :goto_3
    new-instance v7, Lcom/zykj/evaluation/bean/CommitAnswer;

    .line 180
    .line 181
    invoke-virtual {v3}, Li6/l;->i()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v3

    .line 185
    invoke-direct {v7, v3, v5}, Lcom/zykj/evaluation/bean/CommitAnswer;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v10, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 189
    .line 190
    .line 191
    sget-object v3, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 192
    .line 193
    const/4 v11, 0x3

    .line 194
    const/4 v12, 0x0

    .line 195
    const-wide/16 v7, 0x0

    .line 196
    .line 197
    const/4 v9, 0x0

    .line 198
    invoke-static/range {v6 .. v12}, Lcom/zykj/evaluation/bean/CommitTaskAnswer;->copy$default(Lcom/zykj/evaluation/bean/CommitTaskAnswer;JLjava/lang/String;Ljava/util/List;ILjava/lang/Object;)Lcom/zykj/evaluation/bean/CommitTaskAnswer;

    .line 199
    .line 200
    .line 201
    move-result-object v3

    .line 202
    invoke-interface {v2, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    goto/16 :goto_1

    .line 206
    .line 207
    :cond_3
    invoke-virtual {v2}, Landroidx/collection/ArrayMap;->values()Ljava/util/Collection;

    .line 208
    .line 209
    .line 210
    move-result-object v1

    .line 211
    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 212
    .line 213
    .line 214
    goto/16 :goto_0

    .line 215
    .line 216
    :cond_4
    return-object v0
.end method

.method public static final b(Ljava/util/List;ZLjava/util/Map;)Ljava/util/List;
    .locals 37

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    const-string v2, "<this>"

    .line 6
    .line 7
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const-string v2, "localAnswerMap"

    .line 11
    .line 12
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    new-instance v2, Ljava/util/ArrayList;

    .line 16
    .line 17
    const/16 v3, 0xa

    .line 18
    .line 19
    invoke-static {v0, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 24
    .line 25
    .line 26
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    if-eqz v3, :cond_14

    .line 35
    .line 36
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    check-cast v3, Lcom/zykj/evaluation/bean/GuideGroup;

    .line 41
    .line 42
    invoke-virtual {v3}, Lcom/zykj/evaluation/bean/GuideGroup;->getTitle()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    invoke-virtual {v3}, Lcom/zykj/evaluation/bean/GuideGroup;->getQstCount()I

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    if-eqz p1, :cond_0

    .line 51
    .line 52
    invoke-virtual {v3}, Lcom/zykj/evaluation/bean/GuideGroup;->getScore()D

    .line 53
    .line 54
    .line 55
    move-result-wide v6

    .line 56
    new-instance v8, Ljava/lang/StringBuilder;

    .line 57
    .line 58
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 59
    .line 60
    .line 61
    const-string v9, "\uff0c\u5171"

    .line 62
    .line 63
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v8, v6, v7}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    const-string v6, "\u5206\uff09"

    .line 70
    .line 71
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v6

    .line 78
    goto :goto_1

    .line 79
    :cond_0
    const-string v6, "\uff09"

    .line 80
    .line 81
    :goto_1
    new-instance v7, Ljava/lang/StringBuilder;

    .line 82
    .line 83
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 84
    .line 85
    .line 86
    const-string v8, "\uff08\u5171"

    .line 87
    .line 88
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    const-string v5, "\u9898"

    .line 95
    .line 96
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v5

    .line 106
    invoke-virtual {v3}, Lcom/zykj/evaluation/bean/GuideGroup;->getDescription()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v6

    .line 110
    const-string v7, ""

    .line 111
    .line 112
    if-nez v6, :cond_1

    .line 113
    .line 114
    move-object v6, v7

    .line 115
    :cond_1
    new-instance v8, Ljava/util/ArrayList;

    .line 116
    .line 117
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v3}, Lcom/zykj/evaluation/bean/GuideGroup;->getQuestions()Ljava/util/List;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 125
    .line 126
    .line 127
    move-result-object v3

    .line 128
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 129
    .line 130
    .line 131
    move-result v9

    .line 132
    if-eqz v9, :cond_13

    .line 133
    .line 134
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v9

    .line 138
    check-cast v9, Lcom/zykj/evaluation/bean/GuideNoStemQuestion;

    .line 139
    .line 140
    invoke-virtual {v9}, Lcom/zykj/evaluation/bean/GuideNoStemQuestion;->getAnswerWithQuestion()Z

    .line 141
    .line 142
    .line 143
    move-result v10

    .line 144
    if-eqz v10, :cond_7

    .line 145
    .line 146
    new-instance v11, Li6/l;

    .line 147
    .line 148
    invoke-virtual {v9}, Lcom/zykj/evaluation/bean/GuideNoStemQuestion;->getQstFlows()Ljava/util/List;

    .line 149
    .line 150
    .line 151
    move-result-object v10

    .line 152
    invoke-static {v10}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v10

    .line 156
    check-cast v10, Lcom/zykj/evaluation/bean/GuideSubQuestion;

    .line 157
    .line 158
    if-eqz v10, :cond_3

    .line 159
    .line 160
    invoke-virtual {v10}, Lcom/zykj/evaluation/bean/GuideSubQuestion;->getUuid()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v10

    .line 164
    if-nez v10, :cond_2

    .line 165
    .line 166
    goto :goto_4

    .line 167
    :cond_2
    :goto_3
    move-object v12, v10

    .line 168
    goto :goto_5

    .line 169
    :cond_3
    :goto_4
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 170
    .line 171
    .line 172
    move-result-object v10

    .line 173
    invoke-virtual {v10}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v10

    .line 177
    const-string v12, "toString(...)"

    .line 178
    .line 179
    invoke-static {v10, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    goto :goto_3

    .line 183
    :goto_5
    invoke-virtual {v9}, Lcom/zykj/evaluation/bean/BaseGuideQuestion;->getId()J

    .line 184
    .line 185
    .line 186
    move-result-wide v13

    .line 187
    invoke-virtual {v9}, Lcom/zykj/evaluation/bean/BaseGuideQuestion;->getAskForHelp()Z

    .line 188
    .line 189
    .line 190
    move-result v16

    .line 191
    sget-object v10, Li6/p0$c$a;->b:Li6/p0$c$a;

    .line 192
    .line 193
    invoke-virtual {v10}, Li6/p0;->a()I

    .line 194
    .line 195
    .line 196
    move-result v17

    .line 197
    invoke-virtual {v9}, Lcom/zykj/evaluation/bean/BaseGuideQuestion;->getTitle()Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v18

    .line 201
    invoke-virtual {v9}, Lcom/zykj/evaluation/bean/GuideNoStemQuestion;->getQstFlows()Ljava/util/List;

    .line 202
    .line 203
    .line 204
    move-result-object v9

    .line 205
    invoke-static {v9}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v9

    .line 209
    check-cast v9, Lcom/zykj/evaluation/bean/GuideSubQuestion;

    .line 210
    .line 211
    if-eqz v9, :cond_4

    .line 212
    .line 213
    invoke-virtual {v9}, Lcom/zykj/evaluation/bean/GuideSubQuestion;->getUuid()Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v9

    .line 217
    goto :goto_6

    .line 218
    :cond_4
    const/4 v9, 0x0

    .line 219
    :goto_6
    invoke-interface {v1, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v9

    .line 223
    check-cast v9, Ljava/util/List;

    .line 224
    .line 225
    if-nez v9, :cond_5

    .line 226
    .line 227
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 228
    .line 229
    .line 230
    move-result-object v9

    .line 231
    :cond_5
    move-object/from16 v20, v9

    .line 232
    .line 233
    const/16 v21, 0x40

    .line 234
    .line 235
    const/16 v22, 0x0

    .line 236
    .line 237
    const/4 v15, 0x1

    .line 238
    const/16 v19, 0x0

    .line 239
    .line 240
    invoke-direct/range {v11 .. v22}, Li6/l;-><init>(Ljava/lang/String;JZZILjava/lang/String;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v8, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 244
    .line 245
    .line 246
    :cond_6
    move-object/from16 v25, v0

    .line 247
    .line 248
    move-object/from16 v36, v3

    .line 249
    .line 250
    goto/16 :goto_f

    .line 251
    .line 252
    :cond_7
    invoke-virtual {v9}, Lcom/zykj/evaluation/bean/GuideNoStemQuestion;->getQstFlows()Ljava/util/List;

    .line 253
    .line 254
    .line 255
    move-result-object v10

    .line 256
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 257
    .line 258
    .line 259
    move-result v10

    .line 260
    const/4 v12, 0x1

    .line 261
    if-le v10, v12, :cond_8

    .line 262
    .line 263
    move v10, v12

    .line 264
    goto :goto_7

    .line 265
    :cond_8
    const/4 v10, 0x0

    .line 266
    :goto_7
    invoke-virtual {v9}, Lcom/zykj/evaluation/bean/GuideNoStemQuestion;->getQstFlows()Ljava/util/List;

    .line 267
    .line 268
    .line 269
    move-result-object v13

    .line 270
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 271
    .line 272
    .line 273
    move-result-object v13

    .line 274
    move/from16 v18, v12

    .line 275
    .line 276
    :goto_8
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 277
    .line 278
    .line 279
    move-result v14

    .line 280
    if-eqz v14, :cond_6

    .line 281
    .line 282
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v14

    .line 286
    check-cast v14, Lcom/zykj/evaluation/bean/GuideSubQuestion;

    .line 287
    .line 288
    invoke-virtual {v9}, Lcom/zykj/evaluation/bean/BaseGuideQuestion;->getTitle()Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object v15

    .line 292
    const-string v11, "."

    .line 293
    .line 294
    if-eqz v10, :cond_9

    .line 295
    .line 296
    invoke-virtual {v14}, Lcom/zykj/evaluation/bean/GuideSubQuestion;->getNumber()I

    .line 297
    .line 298
    .line 299
    move-result v12

    .line 300
    move-object/from16 v25, v0

    .line 301
    .line 302
    new-instance v0, Ljava/lang/StringBuilder;

    .line 303
    .line 304
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 305
    .line 306
    .line 307
    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 308
    .line 309
    .line 310
    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 311
    .line 312
    .line 313
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 314
    .line 315
    .line 316
    move-result-object v0

    .line 317
    goto :goto_9

    .line 318
    :cond_9
    move-object/from16 v25, v0

    .line 319
    .line 320
    move-object v0, v7

    .line 321
    :goto_9
    new-instance v12, Ljava/lang/StringBuilder;

    .line 322
    .line 323
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 324
    .line 325
    .line 326
    invoke-virtual {v12, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 327
    .line 328
    .line 329
    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 330
    .line 331
    .line 332
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 333
    .line 334
    .line 335
    move-result-object v0

    .line 336
    invoke-virtual {v14}, Lcom/zykj/evaluation/bean/GuideSubQuestion;->getType()I

    .line 337
    .line 338
    .line 339
    move-result v12

    .line 340
    if-nez v12, :cond_10

    .line 341
    .line 342
    invoke-virtual {v14}, Lcom/zykj/evaluation/bean/GuideSubQuestion;->getSubQuestions()Ljava/util/List;

    .line 343
    .line 344
    .line 345
    move-result-object v12

    .line 346
    if-eqz v12, :cond_10

    .line 347
    .line 348
    invoke-interface {v12}, Ljava/util/Collection;->isEmpty()Z

    .line 349
    .line 350
    .line 351
    move-result v12

    .line 352
    if-eqz v12, :cond_a

    .line 353
    .line 354
    goto/16 :goto_d

    .line 355
    .line 356
    :cond_a
    invoke-virtual {v14}, Lcom/zykj/evaluation/bean/GuideSubQuestion;->getSubQuestions()Ljava/util/List;

    .line 357
    .line 358
    .line 359
    move-result-object v12

    .line 360
    invoke-interface {v12}, Ljava/util/List;->size()I

    .line 361
    .line 362
    .line 363
    move-result v12

    .line 364
    const/4 v15, 0x1

    .line 365
    if-le v12, v15, :cond_b

    .line 366
    .line 367
    move v12, v15

    .line 368
    goto :goto_a

    .line 369
    :cond_b
    const/4 v12, 0x0

    .line 370
    :goto_a
    invoke-virtual {v14}, Lcom/zykj/evaluation/bean/GuideSubQuestion;->getSubQuestions()Ljava/util/List;

    .line 371
    .line 372
    .line 373
    move-result-object v14

    .line 374
    invoke-interface {v14}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 375
    .line 376
    .line 377
    move-result-object v14

    .line 378
    move/from16 v30, v18

    .line 379
    .line 380
    :goto_b
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 381
    .line 382
    .line 383
    move-result v16

    .line 384
    if-eqz v16, :cond_f

    .line 385
    .line 386
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    move-result-object v16

    .line 390
    check-cast v16, Lcom/zykj/evaluation/bean/GuideSubQuestion;

    .line 391
    .line 392
    if-eqz v12, :cond_c

    .line 393
    .line 394
    invoke-virtual/range {v16 .. v16}, Lcom/zykj/evaluation/bean/GuideSubQuestion;->getNumber()I

    .line 395
    .line 396
    .line 397
    move-result v15

    .line 398
    move-object/from16 v36, v3

    .line 399
    .line 400
    new-instance v3, Ljava/lang/StringBuilder;

    .line 401
    .line 402
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 403
    .line 404
    .line 405
    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 406
    .line 407
    .line 408
    invoke-virtual {v3, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 409
    .line 410
    .line 411
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 412
    .line 413
    .line 414
    move-result-object v3

    .line 415
    goto :goto_c

    .line 416
    :cond_c
    move-object/from16 v36, v3

    .line 417
    .line 418
    move-object v3, v7

    .line 419
    :goto_c
    new-instance v15, Ljava/lang/StringBuilder;

    .line 420
    .line 421
    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    .line 422
    .line 423
    .line 424
    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 425
    .line 426
    .line 427
    invoke-virtual {v15, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 428
    .line 429
    .line 430
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 431
    .line 432
    .line 433
    move-result-object v33

    .line 434
    invoke-virtual/range {v16 .. v16}, Lcom/zykj/evaluation/bean/GuideSubQuestion;->getUuid()Ljava/lang/String;

    .line 435
    .line 436
    .line 437
    move-result-object v27

    .line 438
    invoke-virtual {v9}, Lcom/zykj/evaluation/bean/BaseGuideQuestion;->getId()J

    .line 439
    .line 440
    .line 441
    move-result-wide v28

    .line 442
    sget-object v3, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 443
    .line 444
    invoke-virtual {v9}, Lcom/zykj/evaluation/bean/BaseGuideQuestion;->getAskForHelp()Z

    .line 445
    .line 446
    .line 447
    move-result v31

    .line 448
    invoke-virtual/range {v16 .. v16}, Lcom/zykj/evaluation/bean/GuideSubQuestion;->getQstType()I

    .line 449
    .line 450
    .line 451
    move-result v32

    .line 452
    invoke-virtual/range {v16 .. v16}, Lcom/zykj/evaluation/bean/GuideSubQuestion;->getOptions()Ljava/util/List;

    .line 453
    .line 454
    .line 455
    move-result-object v3

    .line 456
    if-nez v3, :cond_d

    .line 457
    .line 458
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 459
    .line 460
    .line 461
    move-result-object v3

    .line 462
    :cond_d
    move-object/from16 v34, v3

    .line 463
    .line 464
    invoke-virtual/range {v16 .. v16}, Lcom/zykj/evaluation/bean/GuideSubQuestion;->getUuid()Ljava/lang/String;

    .line 465
    .line 466
    .line 467
    move-result-object v3

    .line 468
    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 469
    .line 470
    .line 471
    move-result-object v3

    .line 472
    check-cast v3, Ljava/util/List;

    .line 473
    .line 474
    if-nez v3, :cond_e

    .line 475
    .line 476
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 477
    .line 478
    .line 479
    move-result-object v3

    .line 480
    :cond_e
    move-object/from16 v35, v3

    .line 481
    .line 482
    new-instance v26, Li6/l;

    .line 483
    .line 484
    invoke-direct/range {v26 .. v35}, Li6/l;-><init>(Ljava/lang/String;JZZILjava/lang/String;Ljava/util/List;Ljava/util/List;)V

    .line 485
    .line 486
    .line 487
    move-object/from16 v3, v26

    .line 488
    .line 489
    invoke-virtual {v8, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 490
    .line 491
    .line 492
    move-object/from16 v3, v36

    .line 493
    .line 494
    const/4 v15, 0x1

    .line 495
    const/16 v30, 0x0

    .line 496
    .line 497
    goto :goto_b

    .line 498
    :cond_f
    move-object/from16 v36, v3

    .line 499
    .line 500
    move/from16 v24, v15

    .line 501
    .line 502
    move/from16 v18, v30

    .line 503
    .line 504
    goto :goto_e

    .line 505
    :cond_10
    :goto_d
    move-object/from16 v36, v3

    .line 506
    .line 507
    invoke-virtual {v14}, Lcom/zykj/evaluation/bean/GuideSubQuestion;->getUuid()Ljava/lang/String;

    .line 508
    .line 509
    .line 510
    move-result-object v15

    .line 511
    invoke-virtual {v9}, Lcom/zykj/evaluation/bean/BaseGuideQuestion;->getId()J

    .line 512
    .line 513
    .line 514
    move-result-wide v16

    .line 515
    sget-object v3, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 516
    .line 517
    invoke-virtual {v9}, Lcom/zykj/evaluation/bean/BaseGuideQuestion;->getAskForHelp()Z

    .line 518
    .line 519
    .line 520
    move-result v19

    .line 521
    invoke-virtual {v14}, Lcom/zykj/evaluation/bean/GuideSubQuestion;->getQstType()I

    .line 522
    .line 523
    .line 524
    move-result v20

    .line 525
    invoke-virtual {v14}, Lcom/zykj/evaluation/bean/GuideSubQuestion;->getOptions()Ljava/util/List;

    .line 526
    .line 527
    .line 528
    move-result-object v3

    .line 529
    if-nez v3, :cond_11

    .line 530
    .line 531
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 532
    .line 533
    .line 534
    move-result-object v3

    .line 535
    :cond_11
    move-object/from16 v22, v3

    .line 536
    .line 537
    invoke-virtual {v14}, Lcom/zykj/evaluation/bean/GuideSubQuestion;->getUuid()Ljava/lang/String;

    .line 538
    .line 539
    .line 540
    move-result-object v3

    .line 541
    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 542
    .line 543
    .line 544
    move-result-object v3

    .line 545
    check-cast v3, Ljava/util/List;

    .line 546
    .line 547
    if-nez v3, :cond_12

    .line 548
    .line 549
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 550
    .line 551
    .line 552
    move-result-object v3

    .line 553
    :cond_12
    move-object/from16 v23, v3

    .line 554
    .line 555
    new-instance v14, Li6/l;

    .line 556
    .line 557
    move-object/from16 v21, v0

    .line 558
    .line 559
    const/16 v24, 0x1

    .line 560
    .line 561
    invoke-direct/range {v14 .. v23}, Li6/l;-><init>(Ljava/lang/String;JZZILjava/lang/String;Ljava/util/List;Ljava/util/List;)V

    .line 562
    .line 563
    .line 564
    invoke-virtual {v8, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 565
    .line 566
    .line 567
    const/16 v18, 0x0

    .line 568
    .line 569
    :goto_e
    move/from16 v12, v24

    .line 570
    .line 571
    move-object/from16 v0, v25

    .line 572
    .line 573
    move-object/from16 v3, v36

    .line 574
    .line 575
    goto/16 :goto_8

    .line 576
    .line 577
    :goto_f
    move-object/from16 v0, v25

    .line 578
    .line 579
    move-object/from16 v3, v36

    .line 580
    .line 581
    goto/16 :goto_2

    .line 582
    .line 583
    :cond_13
    move-object/from16 v25, v0

    .line 584
    .line 585
    new-instance v0, Li6/b;

    .line 586
    .line 587
    invoke-direct {v0, v4, v5, v6, v8}, Li6/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 588
    .line 589
    .line 590
    invoke-interface {v2, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 591
    .line 592
    .line 593
    move-object/from16 v0, v25

    .line 594
    .line 595
    goto/16 :goto_0

    .line 596
    .line 597
    :cond_14
    return-object v2
.end method
