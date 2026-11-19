.class public final Lcom/zykj/mistake/feature/review/r;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public final a(Ljava/lang/String;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    instance-of v2, v1, Lcom/zykj/mistake/feature/review/ReviewRepository$getReviewHome$1;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, Lcom/zykj/mistake/feature/review/ReviewRepository$getReviewHome$1;

    .line 11
    .line 12
    iget v3, v2, Lcom/zykj/mistake/feature/review/ReviewRepository$getReviewHome$1;->label:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, Lcom/zykj/mistake/feature/review/ReviewRepository$getReviewHome$1;->label:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, Lcom/zykj/mistake/feature/review/ReviewRepository$getReviewHome$1;

    .line 25
    .line 26
    invoke-direct {v2, v0, v1}, Lcom/zykj/mistake/feature/review/ReviewRepository$getReviewHome$1;-><init>(Lcom/zykj/mistake/feature/review/r;Lh6/c;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v1, v2, Lcom/zykj/mistake/feature/review/ReviewRepository$getReviewHome$1;->result:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 32
    .line 33
    iget v4, v2, Lcom/zykj/mistake/feature/review/ReviewRepository$getReviewHome$1;->label:I

    .line 34
    .line 35
    const/4 v5, 0x1

    .line 36
    if-eqz v4, :cond_2

    .line 37
    .line 38
    if-ne v4, v5, :cond_1

    .line 39
    .line 40
    iget-object v2, v2, Lcom/zykj/mistake/feature/review/ReviewRepository$getReviewHome$1;->L$0:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v2, Ljava/lang/String;

    .line 43
    .line 44
    invoke-static {v1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    check-cast v1, Lkotlin/Result;

    .line 48
    .line 49
    invoke-virtual {v1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    move-object v5, v2

    .line 54
    goto :goto_1

    .line 55
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 56
    .line 57
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 58
    .line 59
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw v1

    .line 63
    :cond_2
    invoke-static {v1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    new-instance v1, Lcom/zykj/mistake/feature/review/ReviewRepository$getReviewHome$result$1;

    .line 67
    .line 68
    const/4 v4, 0x0

    .line 69
    invoke-direct {v1, v0, v4}, Lcom/zykj/mistake/feature/review/ReviewRepository$getReviewHome$result$1;-><init>(Lcom/zykj/mistake/feature/review/r;Lh6/c;)V

    .line 70
    .line 71
    .line 72
    new-instance v4, Lcom/zykj/mistake/feature/notebook/list/k1;

    .line 73
    .line 74
    const/4 v6, 0x4

    .line 75
    invoke-direct {v4, v6}, Lcom/zykj/mistake/feature/notebook/list/k1;-><init>(I)V

    .line 76
    .line 77
    .line 78
    move-object/from16 v6, p1

    .line 79
    .line 80
    iput-object v6, v2, Lcom/zykj/mistake/feature/review/ReviewRepository$getReviewHome$1;->L$0:Ljava/lang/Object;

    .line 81
    .line 82
    iput v5, v2, Lcom/zykj/mistake/feature/review/ReviewRepository$getReviewHome$1;->label:I

    .line 83
    .line 84
    invoke-static {v1, v4, v2}, Lcom/zykj/mistake/data/e;->b(Lr6/c;Lr6/c;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    if-ne v1, v3, :cond_3

    .line 89
    .line 90
    return-object v3

    .line 91
    :cond_3
    move-object v5, v6

    .line 92
    :goto_1
    invoke-static {v1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    check-cast v1, Lcom/zykj/mistake/entity/resp/ReviewHomeResult;

    .line 96
    .line 97
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/ReviewHomeResult;->getNeedStrengthen()Lcom/zykj/mistake/entity/resp/ReviewPracticeMode;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    invoke-virtual {v2}, Lcom/zykj/mistake/entity/resp/ReviewPracticeMode;->getCount()I

    .line 102
    .line 103
    .line 104
    move-result v11

    .line 105
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/ReviewHomeResult;->getConsolidating()Lcom/zykj/mistake/entity/resp/ReviewPracticeMode;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    invoke-virtual {v2}, Lcom/zykj/mistake/entity/resp/ReviewPracticeMode;->getCount()I

    .line 110
    .line 111
    .line 112
    move-result v14

    .line 113
    new-instance v4, Lcom/zykj/mistake/feature/review/k;

    .line 114
    .line 115
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/ReviewHomeResult;->getPerformance()Lcom/zykj/mistake/entity/resp/ReviewPerformance;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    invoke-virtual {v2}, Lcom/zykj/mistake/entity/resp/ReviewPerformance;->getSummaryText()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v6

    .line 123
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/ReviewHomeResult;->getRecommend()Lcom/zykj/mistake/entity/resp/ReviewPracticeMode;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    invoke-virtual {v2}, Lcom/zykj/mistake/entity/resp/ReviewPracticeMode;->getDescription()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v7

    .line 131
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/ReviewHomeResult;->getRecommend()Lcom/zykj/mistake/entity/resp/ReviewPracticeMode;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    invoke-virtual {v2}, Lcom/zykj/mistake/entity/resp/ReviewPracticeMode;->getCount()I

    .line 136
    .line 137
    .line 138
    move-result v8

    .line 139
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/ReviewHomeResult;->getRecommend()Lcom/zykj/mistake/entity/resp/ReviewPracticeMode;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    invoke-virtual {v2}, Lcom/zykj/mistake/entity/resp/ReviewPracticeMode;->getCanPractice()Z

    .line 144
    .line 145
    .line 146
    move-result v9

    .line 147
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/ReviewHomeResult;->getNeedStrengthen()Lcom/zykj/mistake/entity/resp/ReviewPracticeMode;

    .line 148
    .line 149
    .line 150
    move-result-object v2

    .line 151
    invoke-virtual {v2}, Lcom/zykj/mistake/entity/resp/ReviewPracticeMode;->getDescription()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v10

    .line 155
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/ReviewHomeResult;->getNeedStrengthen()Lcom/zykj/mistake/entity/resp/ReviewPracticeMode;

    .line 156
    .line 157
    .line 158
    move-result-object v2

    .line 159
    invoke-virtual {v2}, Lcom/zykj/mistake/entity/resp/ReviewPracticeMode;->getCanPractice()Z

    .line 160
    .line 161
    .line 162
    move-result v12

    .line 163
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/ReviewHomeResult;->getConsolidating()Lcom/zykj/mistake/entity/resp/ReviewPracticeMode;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    invoke-virtual {v2}, Lcom/zykj/mistake/entity/resp/ReviewPracticeMode;->getDescription()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v13

    .line 171
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/ReviewHomeResult;->getConsolidating()Lcom/zykj/mistake/entity/resp/ReviewPracticeMode;

    .line 172
    .line 173
    .line 174
    move-result-object v2

    .line 175
    invoke-virtual {v2}, Lcom/zykj/mistake/entity/resp/ReviewPracticeMode;->getCanPractice()Z

    .line 176
    .line 177
    .line 178
    move-result v15

    .line 179
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/ReviewHomeResult;->getMastered()Lcom/zykj/mistake/entity/resp/ReviewPracticeMode;

    .line 180
    .line 181
    .line 182
    move-result-object v2

    .line 183
    invoke-virtual {v2}, Lcom/zykj/mistake/entity/resp/ReviewPracticeMode;->getDescription()Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v16

    .line 187
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/ReviewHomeResult;->getMastered()Lcom/zykj/mistake/entity/resp/ReviewPracticeMode;

    .line 188
    .line 189
    .line 190
    move-result-object v2

    .line 191
    invoke-virtual {v2}, Lcom/zykj/mistake/entity/resp/ReviewPracticeMode;->getCount()I

    .line 192
    .line 193
    .line 194
    move-result v17

    .line 195
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/ReviewHomeResult;->getMastered()Lcom/zykj/mistake/entity/resp/ReviewPracticeMode;

    .line 196
    .line 197
    .line 198
    move-result-object v2

    .line 199
    invoke-virtual {v2}, Lcom/zykj/mistake/entity/resp/ReviewPracticeMode;->getCanPractice()Z

    .line 200
    .line 201
    .line 202
    move-result v18

    .line 203
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/ReviewHomeResult;->getPerformance()Lcom/zykj/mistake/entity/resp/ReviewPerformance;

    .line 204
    .line 205
    .line 206
    move-result-object v2

    .line 207
    invoke-virtual {v2}, Lcom/zykj/mistake/entity/resp/ReviewPerformance;->getNewMistakeCount()I

    .line 208
    .line 209
    .line 210
    move-result v2

    .line 211
    new-instance v3, Ljava/lang/Integer;

    .line 212
    .line 213
    invoke-direct {v3, v2}, Ljava/lang/Integer;-><init>(I)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/ReviewHomeResult;->getPerformance()Lcom/zykj/mistake/entity/resp/ReviewPerformance;

    .line 217
    .line 218
    .line 219
    move-result-object v2

    .line 220
    invoke-virtual {v2}, Lcom/zykj/mistake/entity/resp/ReviewPerformance;->getPracticeQuestionCount()I

    .line 221
    .line 222
    .line 223
    move-result v20

    .line 224
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/ReviewHomeResult;->getPerformance()Lcom/zykj/mistake/entity/resp/ReviewPerformance;

    .line 225
    .line 226
    .line 227
    move-result-object v2

    .line 228
    invoke-virtual {v2}, Lcom/zykj/mistake/entity/resp/ReviewPerformance;->getPracticeDayCount()I

    .line 229
    .line 230
    .line 231
    move-result v21

    .line 232
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/ReviewHomeResult;->getPerformance()Lcom/zykj/mistake/entity/resp/ReviewPerformance;

    .line 233
    .line 234
    .line 235
    move-result-object v2

    .line 236
    invoke-virtual {v2}, Lcom/zykj/mistake/entity/resp/ReviewPerformance;->getConsolidatingItemCount()I

    .line 237
    .line 238
    .line 239
    move-result v22

    .line 240
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/ReviewHomeResult;->getPerformance()Lcom/zykj/mistake/entity/resp/ReviewPerformance;

    .line 241
    .line 242
    .line 243
    move-result-object v2

    .line 244
    invoke-virtual {v2}, Lcom/zykj/mistake/entity/resp/ReviewPerformance;->getMasteredItemCount()I

    .line 245
    .line 246
    .line 247
    move-result v23

    .line 248
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/ReviewHomeResult;->getShouldDefaultReviewTab()Z

    .line 249
    .line 250
    .line 251
    move-result v24

    .line 252
    move-object/from16 v19, v3

    .line 253
    .line 254
    invoke-direct/range {v4 .. v24}, Lcom/zykj/mistake/feature/review/k;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLjava/lang/String;IZLjava/lang/String;IZLjava/lang/String;IZLjava/lang/Integer;IIIIZ)V

    .line 255
    .line 256
    .line 257
    return-object v4
.end method
