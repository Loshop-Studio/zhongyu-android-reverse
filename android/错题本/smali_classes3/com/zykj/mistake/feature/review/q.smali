.class public final Lcom/zykj/mistake/feature/review/q;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/zykj/mistake/feature/review/q;

.field public static final b:Ljava/util/LinkedHashMap;

.field public static final c:Ljava/util/LinkedHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/mistake/feature/review/q;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/zykj/mistake/feature/review/q;->a:Lcom/zykj/mistake/feature/review/q;

    .line 7
    .line 8
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lcom/zykj/mistake/feature/review/q;->b:Ljava/util/LinkedHashMap;

    .line 14
    .line 15
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lcom/zykj/mistake/feature/review/q;->c:Ljava/util/LinkedHashMap;

    .line 21
    .line 22
    return-void
.end method

.method public static a(Lcom/zykj/mistake/entity/resp/MistakeDetail;Ljava/util/ArrayList;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    move v2, v1

    .line 7
    :cond_0
    const/4 v3, 0x0

    .line 8
    if-ge v2, v0, :cond_1

    .line 9
    .line 10
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v4

    .line 14
    add-int/lit8 v2, v2, 0x1

    .line 15
    .line 16
    move-object v5, v4

    .line 17
    check-cast v5, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 18
    .line 19
    invoke-virtual {v5}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getLocalType()I

    .line 20
    .line 21
    .line 22
    move-result v5

    .line 23
    if-nez v5, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    move-object v4, v3

    .line 27
    :goto_0
    check-cast v4, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 28
    .line 29
    if-eqz v4, :cond_2

    .line 30
    .line 31
    invoke-virtual {v4}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getId()J

    .line 32
    .line 33
    .line 34
    move-result-wide v4

    .line 35
    long-to-int v0, v4

    .line 36
    goto :goto_1

    .line 37
    :cond_2
    move v0, v1

    .line 38
    :goto_1
    invoke-virtual {p0, v0}, Lcom/zykj/mistake/entity/resp/MistakeDetail;->setDiff(I)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    move v2, v1

    .line 46
    :cond_3
    if-ge v2, v0, :cond_4

    .line 47
    .line 48
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    add-int/lit8 v2, v2, 0x1

    .line 53
    .line 54
    move-object v5, v4

    .line 55
    check-cast v5, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 56
    .line 57
    invoke-virtual {v5}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getLocalType()I

    .line 58
    .line 59
    .line 60
    move-result v5

    .line 61
    const/4 v6, 0x1

    .line 62
    if-ne v5, v6, :cond_3

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_4
    move-object v4, v3

    .line 66
    :goto_2
    check-cast v4, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 67
    .line 68
    if-eqz v4, :cond_5

    .line 69
    .line 70
    invoke-virtual {v4}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getId()J

    .line 71
    .line 72
    .line 73
    move-result-wide v4

    .line 74
    long-to-int v0, v4

    .line 75
    goto :goto_3

    .line 76
    :cond_5
    move v0, v1

    .line 77
    :goto_3
    invoke-virtual {p0, v0}, Lcom/zykj/mistake/entity/resp/MistakeDetail;->setAttainedLevel(I)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    move v2, v1

    .line 85
    :cond_6
    if-ge v2, v0, :cond_7

    .line 86
    .line 87
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    add-int/lit8 v2, v2, 0x1

    .line 92
    .line 93
    move-object v5, v4

    .line 94
    check-cast v5, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 95
    .line 96
    invoke-virtual {v5}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getLocalType()I

    .line 97
    .line 98
    .line 99
    move-result v5

    .line 100
    const/4 v6, 0x2

    .line 101
    if-ne v5, v6, :cond_6

    .line 102
    .line 103
    move-object v3, v4

    .line 104
    :cond_7
    check-cast v3, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 105
    .line 106
    if-eqz v3, :cond_8

    .line 107
    .line 108
    invoke-virtual {v3}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getId()J

    .line 109
    .line 110
    .line 111
    move-result-wide v2

    .line 112
    long-to-int v0, v2

    .line 113
    goto :goto_4

    .line 114
    :cond_8
    move v0, v1

    .line 115
    :goto_4
    invoke-virtual {p0, v0}, Lcom/zykj/mistake/entity/resp/MistakeDetail;->setErrorReason(I)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p0}, Lcom/zykj/mistake/entity/resp/MistakeDetail;->getMistakeTags()Ljava/util/ArrayList;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 123
    .line 124
    .line 125
    invoke-virtual {p0}, Lcom/zykj/mistake/entity/resp/MistakeDetail;->getMistakeTags()Ljava/util/ArrayList;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    new-instance v0, Ljava/util/ArrayList;

    .line 130
    .line 131
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 132
    .line 133
    .line 134
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 135
    .line 136
    .line 137
    move-result v2

    .line 138
    :cond_9
    :goto_5
    if-ge v1, v2, :cond_a

    .line 139
    .line 140
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v3

    .line 144
    add-int/lit8 v1, v1, 0x1

    .line 145
    .line 146
    move-object v4, v3

    .line 147
    check-cast v4, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 148
    .line 149
    invoke-virtual {v4}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getLocalType()I

    .line 150
    .line 151
    .line 152
    move-result v4

    .line 153
    const/4 v5, -0x1

    .line 154
    if-ne v4, v5, :cond_9

    .line 155
    .line 156
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    goto :goto_5

    .line 160
    :cond_a
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 161
    .line 162
    .line 163
    return-void
.end method

.method public static b(ILjava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    const-string p1, ":"

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method

.method public static f(Ljava/lang/String;)Lcom/zykj/mistake/feature/review/o;
    .locals 2

    .line 1
    const-string v0, "sessionId"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lcom/zykj/mistake/feature/review/q;->b:Ljava/util/LinkedHashMap;

    .line 7
    .line 8
    invoke-virtual {v0, p0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Lcom/zykj/mistake/feature/review/n;

    .line 13
    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    iget-object p0, p0, Lcom/zykj/mistake/feature/review/n;->e:Lcom/zykj/mistake/feature/review/o;

    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_0
    new-instance p0, Lcom/zykj/mistake/feature/review/o;

    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    const/16 v1, 0x3f

    .line 23
    .line 24
    invoke-direct {p0, v0, v1}, Lcom/zykj/mistake/feature/review/o;-><init>(II)V

    .line 25
    .line 26
    .line 27
    return-object p0
.end method

.method public static g(Ljava/lang/String;ILjava/util/ArrayList;)V
    .locals 5

    .line 1
    sget-object v0, Lcom/zykj/mistake/feature/review/q;->c:Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-static {p1, p0}, Lcom/zykj/mistake/feature/review/q;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {v0, p0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Lcom/zykj/mistake/feature/review/l;

    .line 12
    .line 13
    if-nez p0, :cond_0

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_0
    iget-object v0, p0, Lcom/zykj/mistake/feature/review/l;->a:Lcom/zykj/mistake/entity/resp/MistakeDetail;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    invoke-static {v0, p2}, Lcom/zykj/mistake/feature/review/q;->a(Lcom/zykj/mistake/entity/resp/MistakeDetail;Ljava/util/ArrayList;)V

    .line 21
    .line 22
    .line 23
    :cond_1
    iget-object p0, p0, Lcom/zykj/mistake/feature/review/l;->b:Ljava/util/List;

    .line 24
    .line 25
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    :cond_2
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_3

    .line 34
    .line 35
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    check-cast v0, Lcom/zykj/mistake/entity/resp/MistakeDetail;

    .line 40
    .line 41
    invoke-virtual {v0}, Lcom/zykj/mistake/entity/resp/MistakeDetail;->getItemId()J

    .line 42
    .line 43
    .line 44
    move-result-wide v1

    .line 45
    int-to-long v3, p1

    .line 46
    cmp-long v1, v1, v3

    .line 47
    .line 48
    if-nez v1, :cond_2

    .line 49
    .line 50
    invoke-static {v0, p2}, Lcom/zykj/mistake/feature/review/q;->a(Lcom/zykj/mistake/entity/resp/MistakeDetail;Ljava/util/ArrayList;)V

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_3
    :goto_1
    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/String;ZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    instance-of v3, v2, Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$requestNextRound$1;

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    move-object v3, v2

    .line 12
    check-cast v3, Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$requestNextRound$1;

    .line 13
    .line 14
    iget v4, v3, Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$requestNextRound$1;->label:I

    .line 15
    .line 16
    const/high16 v5, -0x80000000

    .line 17
    .line 18
    and-int v6, v4, v5

    .line 19
    .line 20
    if-eqz v6, :cond_0

    .line 21
    .line 22
    sub-int/2addr v4, v5

    .line 23
    iput v4, v3, Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$requestNextRound$1;->label:I

    .line 24
    .line 25
    move-object/from16 v4, p0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    new-instance v3, Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$requestNextRound$1;

    .line 29
    .line 30
    move-object/from16 v4, p0

    .line 31
    .line 32
    invoke-direct {v3, v4, v2}, Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$requestNextRound$1;-><init>(Lcom/zykj/mistake/feature/review/q;Lh6/c;)V

    .line 33
    .line 34
    .line 35
    :goto_0
    iget-object v2, v3, Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$requestNextRound$1;->result:Ljava/lang/Object;

    .line 36
    .line 37
    sget-object v5, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 38
    .line 39
    iget v6, v3, Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$requestNextRound$1;->label:I

    .line 40
    .line 41
    sget-object v7, Lcom/zykj/mistake/feature/review/q;->b:Ljava/util/LinkedHashMap;

    .line 42
    .line 43
    const/4 v8, 0x1

    .line 44
    const/4 v9, 0x0

    .line 45
    if-eqz v6, :cond_2

    .line 46
    .line 47
    if-ne v6, v8, :cond_1

    .line 48
    .line 49
    iget-boolean v0, v3, Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$requestNextRound$1;->Z$0:Z

    .line 50
    .line 51
    iget-object v1, v3, Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$requestNextRound$1;->L$1:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v1, Lcom/zykj/mistake/feature/review/n;

    .line 54
    .line 55
    iget-object v3, v3, Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$requestNextRound$1;->L$0:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v3, Ljava/lang/String;

    .line 58
    .line 59
    invoke-static {v2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    check-cast v2, Lkotlin/Result;

    .line 63
    .line 64
    invoke-virtual {v2}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    move-object v10, v1

    .line 69
    move v1, v0

    .line 70
    move-object v0, v3

    .line 71
    goto :goto_1

    .line 72
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 73
    .line 74
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 75
    .line 76
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    throw v0

    .line 80
    :cond_2
    invoke-static {v2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v7, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    check-cast v2, Lcom/zykj/mistake/feature/review/n;

    .line 88
    .line 89
    if-nez v2, :cond_3

    .line 90
    .line 91
    goto/16 :goto_8

    .line 92
    .line 93
    :cond_3
    invoke-static {v0}, Lkotlin/text/w;->E(Ljava/lang/String;)Ljava/lang/Long;

    .line 94
    .line 95
    .line 96
    move-result-object v6

    .line 97
    if-eqz v6, :cond_c

    .line 98
    .line 99
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    .line 100
    .line 101
    .line 102
    move-result-wide v10

    .line 103
    new-instance v6, Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$requestNextRound$response$1;

    .line 104
    .line 105
    invoke-direct {v6, v10, v11, v1, v9}, Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$requestNextRound$response$1;-><init>(JZLh6/c;)V

    .line 106
    .line 107
    .line 108
    new-instance v12, Lcom/zykj/mistake/feature/notebook/list/k1;

    .line 109
    .line 110
    const/4 v13, 0x1

    .line 111
    invoke-direct {v12, v13}, Lcom/zykj/mistake/feature/notebook/list/k1;-><init>(I)V

    .line 112
    .line 113
    .line 114
    iput-object v0, v3, Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$requestNextRound$1;->L$0:Ljava/lang/Object;

    .line 115
    .line 116
    iput-object v2, v3, Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$requestNextRound$1;->L$1:Ljava/lang/Object;

    .line 117
    .line 118
    iput-boolean v1, v3, Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$requestNextRound$1;->Z$0:Z

    .line 119
    .line 120
    iput-wide v10, v3, Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$requestNextRound$1;->J$0:J

    .line 121
    .line 122
    iput v8, v3, Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$requestNextRound$1;->label:I

    .line 123
    .line 124
    invoke-static {v6, v12, v3}, Lcom/zykj/mistake/data/e;->b(Lr6/c;Lr6/c;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v3

    .line 128
    if-ne v3, v5, :cond_4

    .line 129
    .line 130
    return-object v5

    .line 131
    :cond_4
    move-object v10, v2

    .line 132
    move-object v2, v3

    .line 133
    :goto_1
    invoke-static {v2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    check-cast v2, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;

    .line 137
    .line 138
    if-eqz v2, :cond_c

    .line 139
    .line 140
    invoke-virtual {v2}, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->toNavItem()Lp4/e;

    .line 141
    .line 142
    .line 143
    move-result-object v3

    .line 144
    if-eqz v3, :cond_c

    .line 145
    .line 146
    iget v5, v3, Lp4/e;->a:I

    .line 147
    .line 148
    if-lez v5, :cond_5

    .line 149
    .line 150
    goto :goto_2

    .line 151
    :cond_5
    move-object v3, v9

    .line 152
    :goto_2
    if-nez v3, :cond_6

    .line 153
    .line 154
    goto :goto_8

    .line 155
    :cond_6
    invoke-virtual {v2}, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->getQuestionDetails()Ljava/util/List;

    .line 156
    .line 157
    .line 158
    move-result-object v5

    .line 159
    if-nez v5, :cond_7

    .line 160
    .line 161
    sget-object v5, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 162
    .line 163
    :cond_7
    invoke-virtual {v2}, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->getQuestionDetail()Lcom/zykj/mistake/entity/resp/MistakeDetail;

    .line 164
    .line 165
    .line 166
    move-result-object v6

    .line 167
    if-nez v6, :cond_8

    .line 168
    .line 169
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    .line 170
    .line 171
    .line 172
    move-result v6

    .line 173
    if-eqz v6, :cond_8

    .line 174
    .line 175
    goto :goto_3

    .line 176
    :cond_8
    new-instance v9, Lcom/zykj/mistake/feature/review/l;

    .line 177
    .line 178
    invoke-virtual {v2}, Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;->getQuestionDetail()Lcom/zykj/mistake/entity/resp/MistakeDetail;

    .line 179
    .line 180
    .line 181
    move-result-object v2

    .line 182
    invoke-direct {v9, v2, v5}, Lcom/zykj/mistake/feature/review/l;-><init>(Lcom/zykj/mistake/entity/resp/MistakeDetail;Ljava/util/List;)V

    .line 183
    .line 184
    .line 185
    :goto_3
    if-eqz v9, :cond_9

    .line 186
    .line 187
    iget v2, v3, Lp4/e;->a:I

    .line 188
    .line 189
    invoke-static {v2, v0}, Lcom/zykj/mistake/feature/review/q;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v2

    .line 193
    sget-object v5, Lcom/zykj/mistake/feature/review/q;->c:Ljava/util/LinkedHashMap;

    .line 194
    .line 195
    invoke-interface {v5, v2, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    :cond_9
    if-eqz v1, :cond_a

    .line 199
    .line 200
    iget v2, v10, Lcom/zykj/mistake/feature/review/n;->d:I

    .line 201
    .line 202
    add-int/2addr v2, v8

    .line 203
    :goto_4
    move v11, v2

    .line 204
    goto :goto_5

    .line 205
    :cond_a
    iget v2, v10, Lcom/zykj/mistake/feature/review/n;->d:I

    .line 206
    .line 207
    goto :goto_4

    .line 208
    :goto_5
    if-eqz v1, :cond_b

    .line 209
    .line 210
    iget-object v1, v10, Lcom/zykj/mistake/feature/review/n;->e:Lcom/zykj/mistake/feature/review/o;

    .line 211
    .line 212
    iget v1, v1, Lcom/zykj/mistake/feature/review/o;->a:I

    .line 213
    .line 214
    :goto_6
    move v13, v1

    .line 215
    goto :goto_7

    .line 216
    :cond_b
    iget v1, v10, Lcom/zykj/mistake/feature/review/n;->f:I

    .line 217
    .line 218
    goto :goto_6

    .line 219
    :goto_7
    const/16 v16, 0x0

    .line 220
    .line 221
    const/16 v17, 0x17

    .line 222
    .line 223
    const/4 v12, 0x0

    .line 224
    const/4 v14, 0x0

    .line 225
    const/4 v15, 0x0

    .line 226
    invoke-static/range {v10 .. v17}, Lcom/zykj/mistake/feature/review/n;->a(Lcom/zykj/mistake/feature/review/n;ILcom/zykj/mistake/feature/review/o;IIZZI)Lcom/zykj/mistake/feature/review/n;

    .line 227
    .line 228
    .line 229
    move-result-object v1

    .line 230
    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    new-instance v1, Lcom/zykj/mistake/feature/review/m;

    .line 234
    .line 235
    const-string v2, "review_round_"

    .line 236
    .line 237
    invoke-static {v11, v2}, Landroid/support/v4/media/f;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v2

    .line 241
    invoke-static {v3}, Lkotlin/collections/u;->y(Ljava/lang/Object;)Ljava/util/List;

    .line 242
    .line 243
    .line 244
    move-result-object v3

    .line 245
    iget-object v5, v10, Lcom/zykj/mistake/feature/review/n;->c:Lcom/zykj/mistake/feature/review/ReviewContract$PracticeScene;

    .line 246
    .line 247
    invoke-direct {v1, v0, v2, v3, v5}, Lcom/zykj/mistake/feature/review/m;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/zykj/mistake/feature/review/ReviewContract$PracticeScene;)V

    .line 248
    .line 249
    .line 250
    return-object v1

    .line 251
    :cond_c
    :goto_8
    return-object v9
.end method

.method public final d(ILkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    instance-of v3, v2, Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$startPractice$1;

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    move-object v3, v2

    .line 12
    check-cast v3, Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$startPractice$1;

    .line 13
    .line 14
    iget v4, v3, Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$startPractice$1;->label:I

    .line 15
    .line 16
    const/high16 v5, -0x80000000

    .line 17
    .line 18
    and-int v6, v4, v5

    .line 19
    .line 20
    if-eqz v6, :cond_0

    .line 21
    .line 22
    sub-int/2addr v4, v5

    .line 23
    iput v4, v3, Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$startPractice$1;->label:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v3, Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$startPractice$1;

    .line 27
    .line 28
    invoke-direct {v3, v0, v2}, Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$startPractice$1;-><init>(Lcom/zykj/mistake/feature/review/q;Lh6/c;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v2, v3, Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$startPractice$1;->result:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v4, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 34
    .line 35
    iget v5, v3, Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$startPractice$1;->label:I

    .line 36
    .line 37
    const/4 v6, 0x2

    .line 38
    const/4 v7, 0x1

    .line 39
    const/4 v8, 0x0

    .line 40
    if-eqz v5, :cond_4

    .line 41
    .line 42
    if-eq v5, v7, :cond_2

    .line 43
    .line 44
    if-ne v5, v6, :cond_1

    .line 45
    .line 46
    iget-object v1, v3, Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$startPractice$1;->L$2:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v1, Lcom/zykj/mistake/feature/review/ReviewContract$PracticeScene;

    .line 49
    .line 50
    iget-object v1, v3, Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$startPractice$1;->L$1:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v1, Ljava/lang/String;

    .line 53
    .line 54
    iget-object v1, v3, Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$startPractice$1;->L$0:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v1, Lcom/zykj/mistake/entity/resp/StartReviewSessionResult;

    .line 57
    .line 58
    invoke-static {v2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    return-object v2

    .line 62
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 63
    .line 64
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 65
    .line 66
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    throw v1

    .line 70
    :cond_2
    iget v1, v3, Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$startPractice$1;->I$0:I

    .line 71
    .line 72
    invoke-static {v2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    check-cast v2, Lkotlin/Result;

    .line 76
    .line 77
    invoke-virtual {v2}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    :cond_3
    move v11, v1

    .line 82
    goto :goto_1

    .line 83
    :cond_4
    invoke-static {v2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    new-instance v2, Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$startPractice$start$1;

    .line 87
    .line 88
    invoke-direct {v2, v1, v8}, Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$startPractice$start$1;-><init>(ILh6/c;)V

    .line 89
    .line 90
    .line 91
    new-instance v5, Lcom/zykj/mistake/feature/notebook/list/k1;

    .line 92
    .line 93
    const/4 v9, 0x2

    .line 94
    invoke-direct {v5, v9}, Lcom/zykj/mistake/feature/notebook/list/k1;-><init>(I)V

    .line 95
    .line 96
    .line 97
    iput v1, v3, Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$startPractice$1;->I$0:I

    .line 98
    .line 99
    iput v7, v3, Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$startPractice$1;->label:I

    .line 100
    .line 101
    invoke-static {v2, v5, v3}, Lcom/zykj/mistake/data/e;->b(Lr6/c;Lr6/c;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    if-ne v2, v4, :cond_3

    .line 106
    .line 107
    goto :goto_4

    .line 108
    :goto_1
    invoke-static {v2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    check-cast v2, Lcom/zykj/mistake/entity/resp/StartReviewSessionResult;

    .line 112
    .line 113
    invoke-virtual {v2}, Lcom/zykj/mistake/entity/resp/StartReviewSessionResult;->getHasQuestion()Z

    .line 114
    .line 115
    .line 116
    move-result v1

    .line 117
    if-eqz v1, :cond_8

    .line 118
    .line 119
    invoke-virtual {v2}, Lcom/zykj/mistake/entity/resp/StartReviewSessionResult;->getSessionId()J

    .line 120
    .line 121
    .line 122
    move-result-wide v9

    .line 123
    const-wide/16 v12, 0x0

    .line 124
    .line 125
    cmp-long v1, v9, v12

    .line 126
    .line 127
    if-gtz v1, :cond_5

    .line 128
    .line 129
    goto :goto_5

    .line 130
    :cond_5
    invoke-virtual {v2}, Lcom/zykj/mistake/entity/resp/StartReviewSessionResult;->getSessionId()J

    .line 131
    .line 132
    .line 133
    move-result-wide v9

    .line 134
    invoke-static {v9, v10}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v10

    .line 138
    if-ne v11, v7, :cond_6

    .line 139
    .line 140
    sget-object v1, Lcom/zykj/mistake/feature/review/ReviewContract$PracticeScene;->RECOMMEND:Lcom/zykj/mistake/feature/review/ReviewContract$PracticeScene;

    .line 141
    .line 142
    :goto_2
    move-object v12, v1

    .line 143
    goto :goto_3

    .line 144
    :cond_6
    sget-object v1, Lcom/zykj/mistake/feature/review/ReviewContract$PracticeScene;->POOL:Lcom/zykj/mistake/feature/review/ReviewContract$PracticeScene;

    .line 145
    .line 146
    goto :goto_2

    .line 147
    :goto_3
    new-instance v9, Lcom/zykj/mistake/feature/review/n;

    .line 148
    .line 149
    new-instance v14, Lcom/zykj/mistake/feature/review/o;

    .line 150
    .line 151
    invoke-virtual {v2}, Lcom/zykj/mistake/entity/resp/StartReviewSessionResult;->getTotalCount()I

    .line 152
    .line 153
    .line 154
    move-result v1

    .line 155
    const/16 v2, 0x1f

    .line 156
    .line 157
    invoke-direct {v14, v1, v2}, Lcom/zykj/mistake/feature/review/o;-><init>(II)V

    .line 158
    .line 159
    .line 160
    const/16 v17, 0x0

    .line 161
    .line 162
    const/16 v18, 0x0

    .line 163
    .line 164
    const/4 v13, 0x0

    .line 165
    const/4 v15, 0x0

    .line 166
    const/16 v16, 0x0

    .line 167
    .line 168
    invoke-direct/range {v9 .. v18}, Lcom/zykj/mistake/feature/review/n;-><init>(Ljava/lang/String;ILcom/zykj/mistake/feature/review/ReviewContract$PracticeScene;ILcom/zykj/mistake/feature/review/o;IIZZ)V

    .line 169
    .line 170
    .line 171
    sget-object v1, Lcom/zykj/mistake/feature/review/q;->b:Ljava/util/LinkedHashMap;

    .line 172
    .line 173
    invoke-interface {v1, v10, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    iput-object v8, v3, Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$startPractice$1;->L$0:Ljava/lang/Object;

    .line 177
    .line 178
    iput-object v8, v3, Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$startPractice$1;->L$1:Ljava/lang/Object;

    .line 179
    .line 180
    iput-object v8, v3, Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$startPractice$1;->L$2:Ljava/lang/Object;

    .line 181
    .line 182
    iput v11, v3, Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$startPractice$1;->I$0:I

    .line 183
    .line 184
    iput v6, v3, Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$startPractice$1;->label:I

    .line 185
    .line 186
    const/4 v1, 0x0

    .line 187
    invoke-virtual {v0, v10, v1, v3}, Lcom/zykj/mistake/feature/review/q;->c(Ljava/lang/String;ZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v1

    .line 191
    if-ne v1, v4, :cond_7

    .line 192
    .line 193
    :goto_4
    return-object v4

    .line 194
    :cond_7
    return-object v1

    .line 195
    :cond_8
    :goto_5
    return-object v8
.end method

.method public final e(Ljava/lang/String;ILcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerResult;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p4

    .line 4
    .line 5
    instance-of v2, v1, Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$submitAnswer$1;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$submitAnswer$1;

    .line 11
    .line 12
    iget v3, v2, Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$submitAnswer$1;->label:I

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
    iput v3, v2, Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$submitAnswer$1;->label:I

    .line 22
    .line 23
    move-object/from16 v3, p0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v2, Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$submitAnswer$1;

    .line 27
    .line 28
    move-object/from16 v3, p0

    .line 29
    .line 30
    invoke-direct {v2, v3, v1}, Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$submitAnswer$1;-><init>(Lcom/zykj/mistake/feature/review/q;Lh6/c;)V

    .line 31
    .line 32
    .line 33
    :goto_0
    iget-object v1, v2, Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$submitAnswer$1;->result:Ljava/lang/Object;

    .line 34
    .line 35
    sget-object v4, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 36
    .line 37
    iget v5, v2, Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$submitAnswer$1;->label:I

    .line 38
    .line 39
    const/4 v6, 0x0

    .line 40
    sget-object v7, Lcom/zykj/mistake/feature/review/q;->b:Ljava/util/LinkedHashMap;

    .line 41
    .line 42
    const/4 v8, 0x1

    .line 43
    if-eqz v5, :cond_2

    .line 44
    .line 45
    if-ne v5, v8, :cond_1

    .line 46
    .line 47
    iget-object v0, v2, Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$submitAnswer$1;->L$2:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v0, Lcom/zykj/mistake/feature/review/n;

    .line 50
    .line 51
    iget-object v4, v2, Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$submitAnswer$1;->L$1:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v4, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerResult;

    .line 54
    .line 55
    iget-object v2, v2, Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$submitAnswer$1;->L$0:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v2, Ljava/lang/String;

    .line 58
    .line 59
    invoke-static {v1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    check-cast v1, Lkotlin/Result;

    .line 63
    .line 64
    invoke-virtual {v1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    move-object v8, v0

    .line 69
    move-object v0, v2

    .line 70
    goto :goto_1

    .line 71
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 72
    .line 73
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 74
    .line 75
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    throw v0

    .line 79
    :cond_2
    invoke-static {v1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v7, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    check-cast v1, Lcom/zykj/mistake/feature/review/n;

    .line 87
    .line 88
    if-nez v1, :cond_3

    .line 89
    .line 90
    new-instance v0, Lcom/zykj/mistake/feature/review/o;

    .line 91
    .line 92
    const/16 v1, 0x3f

    .line 93
    .line 94
    invoke-direct {v0, v6, v1}, Lcom/zykj/mistake/feature/review/o;-><init>(II)V

    .line 95
    .line 96
    .line 97
    return-object v0

    .line 98
    :cond_3
    invoke-static {v0}, Lkotlin/text/w;->E(Ljava/lang/String;)Ljava/lang/Long;

    .line 99
    .line 100
    .line 101
    move-result-object v5

    .line 102
    if-eqz v5, :cond_6

    .line 103
    .line 104
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 105
    .line 106
    .line 107
    move-result-wide v10

    .line 108
    new-instance v9, Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$submitAnswer$response$1;

    .line 109
    .line 110
    const/4 v14, 0x0

    .line 111
    move/from16 v12, p2

    .line 112
    .line 113
    move-object/from16 v13, p3

    .line 114
    .line 115
    invoke-direct/range {v9 .. v14}, Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$submitAnswer$response$1;-><init>(JILcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerResult;Lh6/c;)V

    .line 116
    .line 117
    .line 118
    new-instance v5, Lcom/zykj/mistake/feature/notebook/list/k1;

    .line 119
    .line 120
    const/4 v12, 0x3

    .line 121
    invoke-direct {v5, v12}, Lcom/zykj/mistake/feature/notebook/list/k1;-><init>(I)V

    .line 122
    .line 123
    .line 124
    iput-object v0, v2, Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$submitAnswer$1;->L$0:Ljava/lang/Object;

    .line 125
    .line 126
    const/4 v12, 0x0

    .line 127
    iput-object v12, v2, Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$submitAnswer$1;->L$1:Ljava/lang/Object;

    .line 128
    .line 129
    iput-object v1, v2, Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$submitAnswer$1;->L$2:Ljava/lang/Object;

    .line 130
    .line 131
    move/from16 v12, p2

    .line 132
    .line 133
    iput v12, v2, Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$submitAnswer$1;->I$0:I

    .line 134
    .line 135
    iput-wide v10, v2, Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$submitAnswer$1;->J$0:J

    .line 136
    .line 137
    iput v8, v2, Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$submitAnswer$1;->label:I

    .line 138
    .line 139
    invoke-static {v9, v5, v2}, Lcom/zykj/mistake/data/e;->b(Lr6/c;Lr6/c;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    if-ne v2, v4, :cond_4

    .line 144
    .line 145
    return-object v4

    .line 146
    :cond_4
    move-object v8, v1

    .line 147
    move-object v1, v2

    .line 148
    :goto_1
    invoke-static {v1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    check-cast v1, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;

    .line 152
    .line 153
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->getSummary()Lcom/zykj/mistake/entity/resp/ReviewResultSummary;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    invoke-virtual {v2}, Lcom/zykj/mistake/entity/resp/ReviewResultSummary;->getSubmittedCount()I

    .line 158
    .line 159
    .line 160
    move-result v10

    .line 161
    new-instance v9, Lcom/zykj/mistake/feature/review/o;

    .line 162
    .line 163
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->getSummary()Lcom/zykj/mistake/entity/resp/ReviewResultSummary;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    invoke-virtual {v2}, Lcom/zykj/mistake/entity/resp/ReviewResultSummary;->getRightCount()I

    .line 168
    .line 169
    .line 170
    move-result v11

    .line 171
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->getSummary()Lcom/zykj/mistake/entity/resp/ReviewResultSummary;

    .line 172
    .line 173
    .line 174
    move-result-object v2

    .line 175
    invoke-virtual {v2}, Lcom/zykj/mistake/entity/resp/ReviewResultSummary;->getWrongCount()I

    .line 176
    .line 177
    .line 178
    move-result v12

    .line 179
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->getSummary()Lcom/zykj/mistake/entity/resp/ReviewResultSummary;

    .line 180
    .line 181
    .line 182
    move-result-object v2

    .line 183
    invoke-virtual {v2}, Lcom/zykj/mistake/entity/resp/ReviewResultSummary;->getPromotedCount()I

    .line 184
    .line 185
    .line 186
    move-result v13

    .line 187
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->getSummary()Lcom/zykj/mistake/entity/resp/ReviewResultSummary;

    .line 188
    .line 189
    .line 190
    move-result-object v2

    .line 191
    invoke-virtual {v2}, Lcom/zykj/mistake/entity/resp/ReviewResultSummary;->getMasteredCount()I

    .line 192
    .line 193
    .line 194
    move-result v14

    .line 195
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->getSummary()Lcom/zykj/mistake/entity/resp/ReviewResultSummary;

    .line 196
    .line 197
    .line 198
    move-result-object v2

    .line 199
    invoke-virtual {v2}, Lcom/zykj/mistake/entity/resp/ReviewResultSummary;->getTotalCount()I

    .line 200
    .line 201
    .line 202
    move-result v15

    .line 203
    invoke-direct/range {v9 .. v15}, Lcom/zykj/mistake/feature/review/o;-><init>(IIIIII)V

    .line 204
    .line 205
    .line 206
    iget v2, v8, Lcom/zykj/mistake/feature/review/n;->f:I

    .line 207
    .line 208
    sub-int/2addr v10, v2

    .line 209
    if-gez v10, :cond_5

    .line 210
    .line 211
    move v12, v6

    .line 212
    goto :goto_2

    .line 213
    :cond_5
    move v12, v10

    .line 214
    :goto_2
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->isCurrentRoundCompleted()Z

    .line 215
    .line 216
    .line 217
    move-result v13

    .line 218
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->isAllCompleted()Z

    .line 219
    .line 220
    .line 221
    move-result v14

    .line 222
    const/16 v15, 0x2f

    .line 223
    .line 224
    move-object v10, v9

    .line 225
    const/4 v9, 0x0

    .line 226
    const/4 v11, 0x0

    .line 227
    invoke-static/range {v8 .. v15}, Lcom/zykj/mistake/feature/review/n;->a(Lcom/zykj/mistake/feature/review/n;ILcom/zykj/mistake/feature/review/o;IIZZI)Lcom/zykj/mistake/feature/review/n;

    .line 228
    .line 229
    .line 230
    move-result-object v1

    .line 231
    move-object v9, v10

    .line 232
    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    return-object v9

    .line 236
    :cond_6
    iget-object v0, v1, Lcom/zykj/mistake/feature/review/n;->e:Lcom/zykj/mistake/feature/review/o;

    .line 237
    .line 238
    return-object v0
.end method
