.class public abstract Lv6/y;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lorg/json/JSONObject;IILv6/m0;)V
    .locals 2

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "scanQuestionType"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, Lp7/a;->a:Lp7/a;

    .line 12
    .line 13
    const-string v1, "Pages"

    .line 14
    .line 15
    invoke-virtual {v0, p0, v1}, Lp7/a;->b(Lorg/json/JSONObject;Ljava/lang/String;)Lorg/json/JSONArray;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {v0, p0, p1}, Lp7/a;->c(Lorg/json/JSONArray;I)Lorg/json/JSONObject;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    const-string p1, "Questions"

    .line 24
    .line 25
    invoke-virtual {v0, p0, p1}, Lp7/a;->b(Lorg/json/JSONObject;Ljava/lang/String;)Lorg/json/JSONArray;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-virtual {v0, p0, p2}, Lp7/a;->c(Lorg/json/JSONArray;I)Lorg/json/JSONObject;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    if-eqz p0, :cond_0

    .line 34
    .line 35
    const-string p1, "Type"

    .line 36
    .line 37
    invoke-virtual {p3}, Lv6/m0;->a()I

    .line 38
    .line 39
    .line 40
    move-result p2

    .line 41
    invoke-virtual {p0, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 42
    .line 43
    .line 44
    :cond_0
    return-void
.end method

.method public static final b(Ljava/util/List;)Ljava/util/List;
    .locals 18

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    new-instance v0, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_6

    .line 22
    .line 23
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    check-cast v2, Le7/b;

    .line 28
    .line 29
    invoke-virtual {v2}, Le7/b;->c()Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    const/4 v4, 0x0

    .line 38
    const/4 v5, 0x1

    .line 39
    if-le v3, v5, :cond_1

    .line 40
    .line 41
    move v7, v5

    .line 42
    goto :goto_0

    .line 43
    :cond_1
    move v7, v4

    .line 44
    :goto_0
    invoke-virtual {v2}, Le7/b;->c()Ljava/util/List;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    :cond_2
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 53
    .line 54
    .line 55
    move-result v6

    .line 56
    if-eqz v6, :cond_0

    .line 57
    .line 58
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v6

    .line 62
    check-cast v6, Le7/c;

    .line 63
    .line 64
    invoke-virtual {v6}, Le7/c;->f()Lcom/zykj/evaluation/bean/PaperSelect;

    .line 65
    .line 66
    .line 67
    move-result-object v8

    .line 68
    if-eqz v8, :cond_2

    .line 69
    .line 70
    invoke-virtual {v6}, Le7/c;->f()Lcom/zykj/evaluation/bean/PaperSelect;

    .line 71
    .line 72
    .line 73
    move-result-object v8

    .line 74
    invoke-virtual {v8}, Lcom/zykj/evaluation/bean/PaperSelect;->getOptions()Ljava/util/List;

    .line 75
    .line 76
    .line 77
    move-result-object v8

    .line 78
    new-instance v11, Ljava/util/ArrayList;

    .line 79
    .line 80
    const/16 v9, 0xa

    .line 81
    .line 82
    invoke-static {v8, v9}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 83
    .line 84
    .line 85
    move-result v9

    .line 86
    invoke-direct {v11, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 87
    .line 88
    .line 89
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 90
    .line 91
    .line 92
    move-result-object v8

    .line 93
    :goto_2
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 94
    .line 95
    .line 96
    move-result v9

    .line 97
    if-eqz v9, :cond_4

    .line 98
    .line 99
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v9

    .line 103
    check-cast v9, Lcom/zykj/evaluation/bean/PaperOption;

    .line 104
    .line 105
    new-instance v10, Lx6/c;

    .line 106
    .line 107
    invoke-virtual {v9}, Lcom/zykj/evaluation/bean/PaperOption;->getLabel()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v12

    .line 111
    invoke-virtual {v6}, Le7/c;->c()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v13

    .line 115
    invoke-virtual {v9}, Lcom/zykj/evaluation/bean/PaperOption;->getLabel()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v9

    .line 119
    const/4 v14, 0x2

    .line 120
    const/4 v15, 0x0

    .line 121
    invoke-static {v13, v9, v4, v14, v15}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v9

    .line 125
    if-eqz v9, :cond_3

    .line 126
    .line 127
    sget-object v9, Lv6/l0$b;->c:Lv6/l0$b;

    .line 128
    .line 129
    goto :goto_3

    .line 130
    :cond_3
    sget-object v9, Lv6/l0$a;->c:Lv6/l0$a;

    .line 131
    .line 132
    :goto_3
    invoke-direct {v10, v12, v9}, Lx6/c;-><init>(Ljava/lang/String;Lv6/l0;)V

    .line 133
    .line 134
    .line 135
    invoke-interface {v11, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    goto :goto_2

    .line 139
    :cond_4
    new-instance v8, Lx6/d;

    .line 140
    .line 141
    move-object v9, v6

    .line 142
    move-object v6, v8

    .line 143
    invoke-virtual {v2}, Le7/b;->e()I

    .line 144
    .line 145
    .line 146
    move-result v8

    .line 147
    move-object v10, v9

    .line 148
    invoke-virtual {v10}, Le7/c;->e()I

    .line 149
    .line 150
    .line 151
    move-result v9

    .line 152
    invoke-virtual {v2}, Le7/b;->h()I

    .line 153
    .line 154
    .line 155
    move-result v12

    .line 156
    sget-object v13, Lcom/zykj/evaluation/bean/constant/QuestionTypeEnum;->MULTIPLE:Lcom/zykj/evaluation/bean/constant/QuestionTypeEnum;

    .line 157
    .line 158
    invoke-virtual {v13}, Lcom/zykj/evaluation/bean/constant/QuestionTypeEnum;->getType()I

    .line 159
    .line 160
    .line 161
    move-result v13

    .line 162
    if-eq v12, v13, :cond_5

    .line 163
    .line 164
    move-object v12, v10

    .line 165
    move v10, v5

    .line 166
    goto :goto_4

    .line 167
    :cond_5
    move-object v12, v10

    .line 168
    move v10, v4

    .line 169
    :goto_4
    invoke-virtual {v2}, Le7/b;->g()J

    .line 170
    .line 171
    .line 172
    move-result-wide v13

    .line 173
    invoke-virtual {v12}, Le7/c;->g()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v12

    .line 177
    move-wide/from16 v16, v13

    .line 178
    .line 179
    move-object v14, v12

    .line 180
    move-wide/from16 v12, v16

    .line 181
    .line 182
    invoke-direct/range {v6 .. v14}, Lx6/d;-><init>(ZIIZLjava/util/List;JLjava/lang/String;)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    goto/16 :goto_1

    .line 189
    .line 190
    :cond_6
    return-object v0
.end method

.method public static final c(Lcom/zykj/evaluation/bean/PaperQuestion;)Z
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/evaluation/bean/PaperQuestion;->getType()I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    sget-object v0, Lcom/zykj/evaluation/bean/constant/QuestionTypeEnum;->FILLINBLANK:Lcom/zykj/evaluation/bean/constant/QuestionTypeEnum;

    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/zykj/evaluation/bean/constant/QuestionTypeEnum;->getType()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-ne p0, v0, :cond_0

    .line 17
    .line 18
    const/4 p0, 0x1

    .line 19
    return p0

    .line 20
    :cond_0
    const/4 p0, 0x0

    .line 21
    return p0
.end method

.method public static final d(Lcom/zykj/evaluation/bean/PaperQuestion;)Z
    .locals 2

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/evaluation/bean/PaperQuestion;->getType()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    sget-object v1, Lcom/zykj/evaluation/bean/constant/QuestionTypeEnum;->QSTANDANSWER:Lcom/zykj/evaluation/bean/constant/QuestionTypeEnum;

    .line 11
    .line 12
    invoke-virtual {v1}, Lcom/zykj/evaluation/bean/constant/QuestionTypeEnum;->getType()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eq v0, v1, :cond_1

    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/zykj/evaluation/bean/PaperQuestion;->getType()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    sget-object v1, Lcom/zykj/evaluation/bean/constant/QuestionTypeEnum;->WRITING:Lcom/zykj/evaluation/bean/constant/QuestionTypeEnum;

    .line 23
    .line 24
    invoke-virtual {v1}, Lcom/zykj/evaluation/bean/constant/QuestionTypeEnum;->getType()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eq v0, v1, :cond_1

    .line 29
    .line 30
    invoke-virtual {p0}, Lcom/zykj/evaluation/bean/PaperQuestion;->getType()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    sget-object v1, Lcom/zykj/evaluation/bean/constant/QuestionTypeEnum;->COMPOSITION:Lcom/zykj/evaluation/bean/constant/QuestionTypeEnum;

    .line 35
    .line 36
    invoke-virtual {v1}, Lcom/zykj/evaluation/bean/constant/QuestionTypeEnum;->getType()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-eq v0, v1, :cond_1

    .line 41
    .line 42
    invoke-virtual {p0}, Lcom/zykj/evaluation/bean/PaperQuestion;->getType()I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    sget-object v1, Lcom/zykj/evaluation/bean/constant/QuestionTypeEnum;->COMPREHENSION:Lcom/zykj/evaluation/bean/constant/QuestionTypeEnum;

    .line 47
    .line 48
    invoke-virtual {v1}, Lcom/zykj/evaluation/bean/constant/QuestionTypeEnum;->getType()I

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-ne v0, v1, :cond_0

    .line 53
    .line 54
    invoke-virtual {p0}, Lcom/zykj/evaluation/bean/PaperQuestion;->getSelects()Ljava/util/List;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    if-eqz p0, :cond_1

    .line 59
    .line 60
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 61
    .line 62
    .line 63
    move-result p0

    .line 64
    if-eqz p0, :cond_0

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_0
    const/4 p0, 0x0

    .line 68
    return p0

    .line 69
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 70
    return p0
.end method

.method public static final e(Lcom/zykj/evaluation/bean/PaperQuestion;)Z
    .locals 2

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/evaluation/bean/PaperQuestion;->getType()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    sget-object v1, Lcom/zykj/evaluation/bean/constant/QuestionTypeEnum;->SINGLE:Lcom/zykj/evaluation/bean/constant/QuestionTypeEnum;

    .line 11
    .line 12
    invoke-virtual {v1}, Lcom/zykj/evaluation/bean/constant/QuestionTypeEnum;->getType()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eq v0, v1, :cond_1

    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/zykj/evaluation/bean/PaperQuestion;->getType()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    sget-object v1, Lcom/zykj/evaluation/bean/constant/QuestionTypeEnum;->MULTIPLE:Lcom/zykj/evaluation/bean/constant/QuestionTypeEnum;

    .line 23
    .line 24
    invoke-virtual {v1}, Lcom/zykj/evaluation/bean/constant/QuestionTypeEnum;->getType()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eq v0, v1, :cond_1

    .line 29
    .line 30
    invoke-virtual {p0}, Lcom/zykj/evaluation/bean/PaperQuestion;->getType()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    sget-object v1, Lcom/zykj/evaluation/bean/constant/QuestionTypeEnum;->TRUEORFALSE:Lcom/zykj/evaluation/bean/constant/QuestionTypeEnum;

    .line 35
    .line 36
    invoke-virtual {v1}, Lcom/zykj/evaluation/bean/constant/QuestionTypeEnum;->getType()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-eq v0, v1, :cond_1

    .line 41
    .line 42
    invoke-virtual {p0}, Lcom/zykj/evaluation/bean/PaperQuestion;->getType()I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    sget-object v1, Lcom/zykj/evaluation/bean/constant/QuestionTypeEnum;->READING:Lcom/zykj/evaluation/bean/constant/QuestionTypeEnum;

    .line 47
    .line 48
    invoke-virtual {v1}, Lcom/zykj/evaluation/bean/constant/QuestionTypeEnum;->getType()I

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eq v0, v1, :cond_1

    .line 53
    .line 54
    invoke-virtual {p0}, Lcom/zykj/evaluation/bean/PaperQuestion;->getType()I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    sget-object v1, Lcom/zykj/evaluation/bean/constant/QuestionTypeEnum;->SEVENCHOICESFIVE:Lcom/zykj/evaluation/bean/constant/QuestionTypeEnum;

    .line 59
    .line 60
    invoke-virtual {v1}, Lcom/zykj/evaluation/bean/constant/QuestionTypeEnum;->getType()I

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    if-eq v0, v1, :cond_1

    .line 65
    .line 66
    invoke-virtual {p0}, Lcom/zykj/evaluation/bean/PaperQuestion;->getType()I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    sget-object v1, Lcom/zykj/evaluation/bean/constant/QuestionTypeEnum;->COMPREHENSION:Lcom/zykj/evaluation/bean/constant/QuestionTypeEnum;

    .line 71
    .line 72
    invoke-virtual {v1}, Lcom/zykj/evaluation/bean/constant/QuestionTypeEnum;->getType()I

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    if-ne v0, v1, :cond_0

    .line 77
    .line 78
    invoke-virtual {p0}, Lcom/zykj/evaluation/bean/PaperQuestion;->getSelects()Ljava/util/List;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    if-eqz p0, :cond_0

    .line 83
    .line 84
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 85
    .line 86
    .line 87
    move-result p0

    .line 88
    if-eqz p0, :cond_1

    .line 89
    .line 90
    :cond_0
    const/4 p0, 0x0

    .line 91
    return p0

    .line 92
    :cond_1
    const/4 p0, 0x1

    .line 93
    return p0
.end method

.method public static final f(Lcom/zykj/evaluation/bean/PaperPosition;FF)Lcom/zykj/evaluation/bean/PaperPosition;
    .locals 4

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/zykj/evaluation/bean/PaperPosition;

    .line 7
    .line 8
    new-instance v1, Lcom/zykj/evaluation/bean/PaperPoint;

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/zykj/evaluation/bean/PaperPosition;->getStart()Lcom/zykj/evaluation/bean/PaperPoint;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/PaperPoint;->getXRate()F

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    add-float/2addr v2, p1

    .line 19
    invoke-virtual {p0}, Lcom/zykj/evaluation/bean/PaperPosition;->getStart()Lcom/zykj/evaluation/bean/PaperPoint;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-virtual {v3}, Lcom/zykj/evaluation/bean/PaperPoint;->getYRate()F

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    add-float/2addr v3, p2

    .line 28
    invoke-direct {v1, v2, v3}, Lcom/zykj/evaluation/bean/PaperPoint;-><init>(FF)V

    .line 29
    .line 30
    .line 31
    new-instance v2, Lcom/zykj/evaluation/bean/PaperPoint;

    .line 32
    .line 33
    invoke-virtual {p0}, Lcom/zykj/evaluation/bean/PaperPosition;->getEnd()Lcom/zykj/evaluation/bean/PaperPoint;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-virtual {v3}, Lcom/zykj/evaluation/bean/PaperPoint;->getXRate()F

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    add-float/2addr v3, p1

    .line 42
    invoke-virtual {p0}, Lcom/zykj/evaluation/bean/PaperPosition;->getEnd()Lcom/zykj/evaluation/bean/PaperPoint;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-virtual {p0}, Lcom/zykj/evaluation/bean/PaperPoint;->getYRate()F

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    add-float/2addr p0, p2

    .line 51
    invoke-direct {v2, v3, p0}, Lcom/zykj/evaluation/bean/PaperPoint;-><init>(FF)V

    .line 52
    .line 53
    .line 54
    invoke-direct {v0, v1, v2}, Lcom/zykj/evaluation/bean/PaperPosition;-><init>(Lcom/zykj/evaluation/bean/PaperPoint;Lcom/zykj/evaluation/bean/PaperPoint;)V

    .line 55
    .line 56
    .line 57
    return-object v0
.end method

.method public static final g(Lcom/zykj/evaluation/bean/PaperPosition;)Landroid/graphics/RectF;
    .locals 4

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroid/graphics/RectF;

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/zykj/evaluation/bean/PaperPosition;->getStart()Lcom/zykj/evaluation/bean/PaperPoint;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Lcom/zykj/evaluation/bean/PaperPoint;->getXRate()F

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    invoke-virtual {p0}, Lcom/zykj/evaluation/bean/PaperPosition;->getStart()Lcom/zykj/evaluation/bean/PaperPoint;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/PaperPoint;->getYRate()F

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    invoke-virtual {p0}, Lcom/zykj/evaluation/bean/PaperPosition;->getEnd()Lcom/zykj/evaluation/bean/PaperPoint;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-virtual {v3}, Lcom/zykj/evaluation/bean/PaperPoint;->getXRate()F

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    invoke-virtual {p0}, Lcom/zykj/evaluation/bean/PaperPosition;->getEnd()Lcom/zykj/evaluation/bean/PaperPoint;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-virtual {p0}, Lcom/zykj/evaluation/bean/PaperPoint;->getYRate()F

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    invoke-direct {v0, v1, v2, v3, p0}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 41
    .line 42
    .line 43
    return-object v0
.end method
