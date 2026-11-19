.class public final Ls6/k0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/List;

.field public final b:Ljava/util/List;

.field public final c:Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState;

.field public final d:Lcom/zykj/student/dialogue/bean/resp/FilterType$Subject;

.field public final e:Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime;

.field public final f:Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime;

.field public final g:Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime;

.field public final h:Lcom/zykj/student/dialogue/bean/resp/FilterType$Sort;

.field public final i:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(Ljava/util/List;Ljava/util/List;Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState;Lcom/zykj/student/dialogue/bean/resp/FilterType$Subject;Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime;Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime;Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime;Lcom/zykj/student/dialogue/bean/resp/FilterType$Sort;Ljava/lang/String;)V
    .locals 1

    const-string v0, "checkedViewStatus"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "checkedTeacherViewStatus"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "checkedQuestionState"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "checkedSubject"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "checkedJoinedTime"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "checkedUpdatedTime"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "checkedFavoriteTime"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "checkedSortType"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "searchedKeyword"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ls6/k0;->a:Ljava/util/List;

    .line 3
    iput-object p2, p0, Ls6/k0;->b:Ljava/util/List;

    .line 4
    iput-object p3, p0, Ls6/k0;->c:Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState;

    .line 5
    iput-object p4, p0, Ls6/k0;->d:Lcom/zykj/student/dialogue/bean/resp/FilterType$Subject;

    .line 6
    iput-object p5, p0, Ls6/k0;->e:Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime;

    .line 7
    iput-object p6, p0, Ls6/k0;->f:Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime;

    .line 8
    iput-object p7, p0, Ls6/k0;->g:Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime;

    .line 9
    iput-object p8, p0, Ls6/k0;->h:Lcom/zykj/student/dialogue/bean/resp/FilterType$Sort;

    .line 10
    iput-object p9, p0, Ls6/k0;->i:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Ljava/util/List;Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState;Lcom/zykj/student/dialogue/bean/resp/FilterType$Subject;Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime;Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime;Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime;Lcom/zykj/student/dialogue/bean/resp/FilterType$Sort;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p11, p10, 0x1

    if-eqz p11, :cond_0

    .line 11
    invoke-static {}, Lcom/zykj/student/dialogue/bean/resp/HomeKt;->getInitialViewStatus()Ljava/util/List;

    move-result-object p1

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    .line 12
    invoke-static {}, Lcom/zykj/student/dialogue/bean/resp/HomeKt;->getInitialTeacherViewStatus()Ljava/util/List;

    move-result-object p2

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    .line 13
    invoke-static {}, Lcom/zykj/student/dialogue/bean/resp/HomeKt;->getInitialQuestionState()Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState$Unlimited;

    move-result-object p3

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    .line 14
    invoke-static {}, Lcom/zykj/student/dialogue/bean/resp/HomeKt;->getInitialSubject()Lcom/zykj/student/dialogue/bean/resp/FilterType$Subject;

    move-result-object p4

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    .line 15
    invoke-static {}, Lcom/zykj/student/dialogue/bean/resp/HomeKt;->getInitialJoinedTime()Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime$Unlimited;

    move-result-object p5

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    .line 16
    invoke-static {}, Lcom/zykj/student/dialogue/bean/resp/HomeKt;->getInitialUpdatedTime()Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime$Unlimited;

    move-result-object p6

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    .line 17
    invoke-static {}, Lcom/zykj/student/dialogue/bean/resp/HomeKt;->getInitialFavoriteTime()Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime$Unlimited;

    move-result-object p7

    :cond_6
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_7

    .line 18
    invoke-static {}, Lcom/zykj/student/dialogue/bean/resp/HomeKt;->getInitialSortType()Lcom/zykj/student/dialogue/bean/resp/FilterType$Sort$SortByUpdatedTime;

    move-result-object p8

    :cond_7
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_8

    .line 19
    const-string p9, ""

    :cond_8
    move-object p10, p8

    move-object p11, p9

    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    .line 20
    invoke-direct/range {p2 .. p11}, Ls6/k0;-><init>(Ljava/util/List;Ljava/util/List;Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState;Lcom/zykj/student/dialogue/bean/resp/FilterType$Subject;Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime;Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime;Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime;Lcom/zykj/student/dialogue/bean/resp/FilterType$Sort;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic b(Ls6/k0;Ljava/util/List;Ljava/util/List;Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState;Lcom/zykj/student/dialogue/bean/resp/FilterType$Subject;Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime;Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime;Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime;Lcom/zykj/student/dialogue/bean/resp/FilterType$Sort;Ljava/lang/String;ILjava/lang/Object;)Ls6/k0;
    .locals 0

    .line 1
    and-int/lit8 p11, p10, 0x1

    .line 2
    .line 3
    if-eqz p11, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Ls6/k0;->a:Ljava/util/List;

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p11, p10, 0x2

    .line 8
    .line 9
    if-eqz p11, :cond_1

    .line 10
    .line 11
    iget-object p2, p0, Ls6/k0;->b:Ljava/util/List;

    .line 12
    .line 13
    :cond_1
    and-int/lit8 p11, p10, 0x4

    .line 14
    .line 15
    if-eqz p11, :cond_2

    .line 16
    .line 17
    iget-object p3, p0, Ls6/k0;->c:Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState;

    .line 18
    .line 19
    :cond_2
    and-int/lit8 p11, p10, 0x8

    .line 20
    .line 21
    if-eqz p11, :cond_3

    .line 22
    .line 23
    iget-object p4, p0, Ls6/k0;->d:Lcom/zykj/student/dialogue/bean/resp/FilterType$Subject;

    .line 24
    .line 25
    :cond_3
    and-int/lit8 p11, p10, 0x10

    .line 26
    .line 27
    if-eqz p11, :cond_4

    .line 28
    .line 29
    iget-object p5, p0, Ls6/k0;->e:Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime;

    .line 30
    .line 31
    :cond_4
    and-int/lit8 p11, p10, 0x20

    .line 32
    .line 33
    if-eqz p11, :cond_5

    .line 34
    .line 35
    iget-object p6, p0, Ls6/k0;->f:Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime;

    .line 36
    .line 37
    :cond_5
    and-int/lit8 p11, p10, 0x40

    .line 38
    .line 39
    if-eqz p11, :cond_6

    .line 40
    .line 41
    iget-object p7, p0, Ls6/k0;->g:Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime;

    .line 42
    .line 43
    :cond_6
    and-int/lit16 p11, p10, 0x80

    .line 44
    .line 45
    if-eqz p11, :cond_7

    .line 46
    .line 47
    iget-object p8, p0, Ls6/k0;->h:Lcom/zykj/student/dialogue/bean/resp/FilterType$Sort;

    .line 48
    .line 49
    :cond_7
    and-int/lit16 p10, p10, 0x100

    .line 50
    .line 51
    if-eqz p10, :cond_8

    .line 52
    .line 53
    iget-object p9, p0, Ls6/k0;->i:Ljava/lang/String;

    .line 54
    .line 55
    :cond_8
    move-object p10, p8

    .line 56
    move-object p11, p9

    .line 57
    move-object p8, p6

    .line 58
    move-object p9, p7

    .line 59
    move-object p6, p4

    .line 60
    move-object p7, p5

    .line 61
    move-object p4, p2

    .line 62
    move-object p5, p3

    .line 63
    move-object p2, p0

    .line 64
    move-object p3, p1

    .line 65
    invoke-virtual/range {p2 .. p11}, Ls6/k0;->a(Ljava/util/List;Ljava/util/List;Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState;Lcom/zykj/student/dialogue/bean/resp/FilterType$Subject;Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime;Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime;Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime;Lcom/zykj/student/dialogue/bean/resp/FilterType$Sort;Ljava/lang/String;)Ls6/k0;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    return-object p0
.end method


# virtual methods
.method public final a(Ljava/util/List;Ljava/util/List;Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState;Lcom/zykj/student/dialogue/bean/resp/FilterType$Subject;Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime;Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime;Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime;Lcom/zykj/student/dialogue/bean/resp/FilterType$Sort;Ljava/lang/String;)Ls6/k0;
    .locals 11

    .line 1
    const-string v0, "checkedViewStatus"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "checkedTeacherViewStatus"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "checkedQuestionState"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "checkedSubject"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "checkedJoinedTime"

    .line 22
    .line 23
    move-object/from16 v6, p5

    .line 24
    .line 25
    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const-string v0, "checkedUpdatedTime"

    .line 29
    .line 30
    move-object/from16 v7, p6

    .line 31
    .line 32
    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    const-string v0, "checkedFavoriteTime"

    .line 36
    .line 37
    move-object/from16 v8, p7

    .line 38
    .line 39
    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    const-string v0, "checkedSortType"

    .line 43
    .line 44
    move-object/from16 v9, p8

    .line 45
    .line 46
    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    const-string v0, "searchedKeyword"

    .line 50
    .line 51
    move-object/from16 v10, p9

    .line 52
    .line 53
    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    new-instance v1, Ls6/k0;

    .line 57
    .line 58
    move-object v2, p1

    .line 59
    move-object v3, p2

    .line 60
    move-object v4, p3

    .line 61
    move-object v5, p4

    .line 62
    invoke-direct/range {v1 .. v10}, Ls6/k0;-><init>(Ljava/util/List;Ljava/util/List;Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState;Lcom/zykj/student/dialogue/bean/resp/FilterType$Subject;Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime;Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime;Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime;Lcom/zykj/student/dialogue/bean/resp/FilterType$Sort;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    return-object v1
.end method

.method public final c()I
    .locals 6

    .line 1
    iget-object v0, p0, Ls6/k0;->a:Ljava/util/List;

    .line 2
    .line 3
    invoke-static {}, Lcom/zykj/student/dialogue/bean/resp/HomeKt;->getInitialViewStatus()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    xor-int/lit8 v0, v0, 0x1

    .line 12
    .line 13
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-object v1, p0, Ls6/k0;->b:Ljava/util/List;

    .line 18
    .line 19
    invoke-static {}, Lcom/zykj/student/dialogue/bean/resp/HomeKt;->getInitialTeacherViewStatus()Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    xor-int/lit8 v1, v1, 0x1

    .line 28
    .line 29
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    iget-object v2, p0, Ls6/k0;->c:Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState;

    .line 34
    .line 35
    invoke-static {}, Lcom/zykj/student/dialogue/bean/resp/HomeKt;->getInitialQuestionState()Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState$Unlimited;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    xor-int/lit8 v2, v2, 0x1

    .line 44
    .line 45
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    iget-object v3, p0, Ls6/k0;->e:Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime;

    .line 50
    .line 51
    invoke-static {}, Lcom/zykj/student/dialogue/bean/resp/HomeKt;->getInitialJoinedTime()Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime$Unlimited;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    xor-int/lit8 v3, v3, 0x1

    .line 60
    .line 61
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    iget-object v4, p0, Ls6/k0;->f:Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime;

    .line 66
    .line 67
    invoke-static {}, Lcom/zykj/student/dialogue/bean/resp/HomeKt;->getInitialUpdatedTime()Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime$Unlimited;

    .line 68
    .line 69
    .line 70
    move-result-object v5

    .line 71
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v4

    .line 75
    xor-int/lit8 v4, v4, 0x1

    .line 76
    .line 77
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    filled-new-array {v0, v1, v2, v3, v4}, [Ljava/lang/Boolean;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    const/4 v1, 0x0

    .line 90
    if-eqz v0, :cond_0

    .line 91
    .line 92
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 93
    .line 94
    .line 95
    move-result v2

    .line 96
    if-eqz v2, :cond_0

    .line 97
    .line 98
    return v1

    .line 99
    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    if-eqz v2, :cond_2

    .line 108
    .line 109
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    check-cast v2, Ljava/lang/Boolean;

    .line 114
    .line 115
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 116
    .line 117
    .line 118
    move-result v2

    .line 119
    if-eqz v2, :cond_1

    .line 120
    .line 121
    add-int/lit8 v1, v1, 0x1

    .line 122
    .line 123
    if-gez v1, :cond_1

    .line 124
    .line 125
    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwCountOverflow()V

    .line 126
    .line 127
    .line 128
    goto :goto_0

    .line 129
    :cond_2
    return v1
.end method

.method public final d()Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime;
    .locals 1

    .line 1
    iget-object v0, p0, Ls6/k0;->g:Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e()Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime;
    .locals 1

    .line 1
    iget-object v0, p0, Ls6/k0;->e:Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime;

    .line 2
    .line 3
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Ls6/k0;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Ls6/k0;

    .line 12
    .line 13
    iget-object v1, p0, Ls6/k0;->a:Ljava/util/List;

    .line 14
    .line 15
    iget-object v3, p1, Ls6/k0;->a:Ljava/util/List;

    .line 16
    .line 17
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    iget-object v1, p0, Ls6/k0;->b:Ljava/util/List;

    .line 25
    .line 26
    iget-object v3, p1, Ls6/k0;->b:Ljava/util/List;

    .line 27
    .line 28
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_3

    .line 33
    .line 34
    return v2

    .line 35
    :cond_3
    iget-object v1, p0, Ls6/k0;->c:Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState;

    .line 36
    .line 37
    iget-object v3, p1, Ls6/k0;->c:Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState;

    .line 38
    .line 39
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-nez v1, :cond_4

    .line 44
    .line 45
    return v2

    .line 46
    :cond_4
    iget-object v1, p0, Ls6/k0;->d:Lcom/zykj/student/dialogue/bean/resp/FilterType$Subject;

    .line 47
    .line 48
    iget-object v3, p1, Ls6/k0;->d:Lcom/zykj/student/dialogue/bean/resp/FilterType$Subject;

    .line 49
    .line 50
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-nez v1, :cond_5

    .line 55
    .line 56
    return v2

    .line 57
    :cond_5
    iget-object v1, p0, Ls6/k0;->e:Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime;

    .line 58
    .line 59
    iget-object v3, p1, Ls6/k0;->e:Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime;

    .line 60
    .line 61
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-nez v1, :cond_6

    .line 66
    .line 67
    return v2

    .line 68
    :cond_6
    iget-object v1, p0, Ls6/k0;->f:Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime;

    .line 69
    .line 70
    iget-object v3, p1, Ls6/k0;->f:Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime;

    .line 71
    .line 72
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    if-nez v1, :cond_7

    .line 77
    .line 78
    return v2

    .line 79
    :cond_7
    iget-object v1, p0, Ls6/k0;->g:Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime;

    .line 80
    .line 81
    iget-object v3, p1, Ls6/k0;->g:Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime;

    .line 82
    .line 83
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    if-nez v1, :cond_8

    .line 88
    .line 89
    return v2

    .line 90
    :cond_8
    iget-object v1, p0, Ls6/k0;->h:Lcom/zykj/student/dialogue/bean/resp/FilterType$Sort;

    .line 91
    .line 92
    iget-object v3, p1, Ls6/k0;->h:Lcom/zykj/student/dialogue/bean/resp/FilterType$Sort;

    .line 93
    .line 94
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    if-nez v1, :cond_9

    .line 99
    .line 100
    return v2

    .line 101
    :cond_9
    iget-object v1, p0, Ls6/k0;->i:Ljava/lang/String;

    .line 102
    .line 103
    iget-object p1, p1, Ls6/k0;->i:Ljava/lang/String;

    .line 104
    .line 105
    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    if-nez p1, :cond_a

    .line 110
    .line 111
    return v2

    .line 112
    :cond_a
    return v0
.end method

.method public final f()Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState;
    .locals 1

    .line 1
    iget-object v0, p0, Ls6/k0;->c:Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState;

    .line 2
    .line 3
    return-object v0
.end method

.method public final g()Lcom/zykj/student/dialogue/bean/resp/FilterType$Sort;
    .locals 1

    .line 1
    iget-object v0, p0, Ls6/k0;->h:Lcom/zykj/student/dialogue/bean/resp/FilterType$Sort;

    .line 2
    .line 3
    return-object v0
.end method

.method public final h()Lcom/zykj/student/dialogue/bean/resp/FilterType$Subject;
    .locals 1

    .line 1
    iget-object v0, p0, Ls6/k0;->d:Lcom/zykj/student/dialogue/bean/resp/FilterType$Subject;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Ls6/k0;->a:Ljava/util/List;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object v1, p0, Ls6/k0;->b:Ljava/util/List;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/2addr v0, v1

    .line 16
    mul-int/lit8 v0, v0, 0x1f

    .line 17
    .line 18
    iget-object v1, p0, Ls6/k0;->c:Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    add-int/2addr v0, v1

    .line 25
    mul-int/lit8 v0, v0, 0x1f

    .line 26
    .line 27
    iget-object v1, p0, Ls6/k0;->d:Lcom/zykj/student/dialogue/bean/resp/FilterType$Subject;

    .line 28
    .line 29
    invoke-virtual {v1}, Lcom/zykj/student/dialogue/bean/resp/FilterType$Subject;->hashCode()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    add-int/2addr v0, v1

    .line 34
    mul-int/lit8 v0, v0, 0x1f

    .line 35
    .line 36
    iget-object v1, p0, Ls6/k0;->e:Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime;

    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    add-int/2addr v0, v1

    .line 43
    mul-int/lit8 v0, v0, 0x1f

    .line 44
    .line 45
    iget-object v1, p0, Ls6/k0;->f:Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime;

    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    add-int/2addr v0, v1

    .line 52
    mul-int/lit8 v0, v0, 0x1f

    .line 53
    .line 54
    iget-object v1, p0, Ls6/k0;->g:Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime;

    .line 55
    .line 56
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    add-int/2addr v0, v1

    .line 61
    mul-int/lit8 v0, v0, 0x1f

    .line 62
    .line 63
    iget-object v1, p0, Ls6/k0;->h:Lcom/zykj/student/dialogue/bean/resp/FilterType$Sort;

    .line 64
    .line 65
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    add-int/2addr v0, v1

    .line 70
    mul-int/lit8 v0, v0, 0x1f

    .line 71
    .line 72
    iget-object v1, p0, Ls6/k0;->i:Ljava/lang/String;

    .line 73
    .line 74
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    add-int/2addr v0, v1

    .line 79
    return v0
.end method

.method public final i()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Ls6/k0;->b:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final j()Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime;
    .locals 1

    .line 1
    iget-object v0, p0, Ls6/k0;->f:Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime;

    .line 2
    .line 3
    return-object v0
.end method

.method public final k()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Ls6/k0;->a:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final l()Z
    .locals 2

    .line 1
    iget-object v0, p0, Ls6/k0;->h:Lcom/zykj/student/dialogue/bean/resp/FilterType$Sort;

    .line 2
    .line 3
    sget-object v1, Lcom/zykj/student/dialogue/bean/resp/FilterType$Sort$SortByJoinedTime;->INSTANCE:Lcom/zykj/student/dialogue/bean/resp/FilterType$Sort$SortByJoinedTime;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public final m()Z
    .locals 2

    .line 1
    iget-object v0, p0, Ls6/k0;->d:Lcom/zykj/student/dialogue/bean/resp/FilterType$Subject;

    .line 2
    .line 3
    invoke-static {}, Lcom/zykj/student/dialogue/bean/resp/HomeKt;->getInitialSubject()Lcom/zykj/student/dialogue/bean/resp/FilterType$Subject;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    xor-int/lit8 v0, v0, 0x1

    .line 12
    .line 13
    return v0
.end method

.method public final n()Lcom/zykj/student/dialogue/bean/req/CollectSessionReq;
    .locals 6

    .line 1
    new-instance v0, Lcom/zykj/student/dialogue/bean/req/CollectSessionReq;

    .line 2
    .line 3
    iget-object v1, p0, Ls6/k0;->i:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Ls6/k0;->d:Lcom/zykj/student/dialogue/bean/resp/FilterType$Subject;

    .line 6
    .line 7
    invoke-virtual {v2}, Lcom/zykj/student/dialogue/bean/resp/FilterType$Subject;->getTopicId()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    new-instance v3, Lcom/zykj/student/dialogue/bean/req/JoinTimeReq;

    .line 12
    .line 13
    iget-object v4, p0, Ls6/k0;->g:Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime;

    .line 14
    .line 15
    invoke-virtual {v4}, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime;->getStart()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    iget-object v5, p0, Ls6/k0;->g:Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime;

    .line 20
    .line 21
    invoke-virtual {v5}, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime;->getEnd()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    invoke-direct {v3, v4, v5}, Lcom/zykj/student/dialogue/bean/req/JoinTimeReq;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const/4 v4, 0x0

    .line 29
    const/16 v5, 0x14

    .line 30
    .line 31
    invoke-direct/range {v0 .. v5}, Lcom/zykj/student/dialogue/bean/req/CollectSessionReq;-><init>(Ljava/lang/String;ILcom/zykj/student/dialogue/bean/req/JoinTimeReq;II)V

    .line 32
    .line 33
    .line 34
    return-object v0
.end method

.method public final o(J)Lcom/zykj/student/dialogue/bean/req/SessionsReq;
    .locals 12

    .line 1
    iget-object v1, p0, Ls6/k0;->i:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v0, p0, Ls6/k0;->d:Lcom/zykj/student/dialogue/bean/resp/FilterType$Subject;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/student/dialogue/bean/resp/FilterType$Subject;->getTopicId()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    new-instance v4, Lcom/zykj/student/dialogue/bean/req/JoinTimeReq;

    .line 14
    .line 15
    iget-object p1, p0, Ls6/k0;->e:Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime;

    .line 16
    .line 17
    invoke-virtual {p1}, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime;->getStart()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iget-object p2, p0, Ls6/k0;->e:Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime;

    .line 22
    .line 23
    invoke-virtual {p2}, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime;->getEnd()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    invoke-direct {v4, p1, p2}, Lcom/zykj/student/dialogue/bean/req/JoinTimeReq;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    new-instance v5, Lcom/zykj/student/dialogue/bean/req/UpdateTimeReq;

    .line 31
    .line 32
    iget-object p1, p0, Ls6/k0;->f:Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime;

    .line 33
    .line 34
    invoke-virtual {p1}, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime;->getStart()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iget-object p2, p0, Ls6/k0;->f:Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime;

    .line 39
    .line 40
    invoke-virtual {p2}, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime;->getEnd()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    invoke-direct {v5, p1, p2}, Lcom/zykj/student/dialogue/bean/req/UpdateTimeReq;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    iget-object p1, p0, Ls6/k0;->a:Ljava/util/List;

    .line 48
    .line 49
    new-instance v6, Ljava/util/ArrayList;

    .line 50
    .line 51
    const/16 p2, 0xa

    .line 52
    .line 53
    invoke-static {p1, p2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    invoke-direct {v6, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 58
    .line 59
    .line 60
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-eqz v0, :cond_0

    .line 69
    .line 70
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    check-cast v0, Lcom/zykj/student/dialogue/bean/resp/FilterType$ViewStatus;

    .line 75
    .line 76
    invoke-virtual {v0}, Lcom/zykj/student/dialogue/bean/resp/FilterType$ViewStatus;->getKey()I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-interface {v6, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_0
    iget-object p1, p0, Ls6/k0;->b:Ljava/util/List;

    .line 89
    .line 90
    new-instance v7, Ljava/util/ArrayList;

    .line 91
    .line 92
    invoke-static {p1, p2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 93
    .line 94
    .line 95
    move-result p2

    .line 96
    invoke-direct {v7, p2}, Ljava/util/ArrayList;-><init>(I)V

    .line 97
    .line 98
    .line 99
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 104
    .line 105
    .line 106
    move-result p2

    .line 107
    if-eqz p2, :cond_1

    .line 108
    .line 109
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object p2

    .line 113
    check-cast p2, Lcom/zykj/student/dialogue/bean/resp/FilterType$TeacherViewStatus;

    .line 114
    .line 115
    invoke-virtual {p2}, Lcom/zykj/student/dialogue/bean/resp/FilterType$TeacherViewStatus;->getKey()I

    .line 116
    .line 117
    .line 118
    move-result p2

    .line 119
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 120
    .line 121
    .line 122
    move-result-object p2

    .line 123
    invoke-interface {v7, p2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_1
    iget-object p1, p0, Ls6/k0;->h:Lcom/zykj/student/dialogue/bean/resp/FilterType$Sort;

    .line 128
    .line 129
    invoke-virtual {p1}, Lcom/zykj/student/dialogue/bean/resp/FilterType$Sort;->getSortKey()I

    .line 130
    .line 131
    .line 132
    move-result v8

    .line 133
    iget-object p1, p0, Ls6/k0;->c:Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState;

    .line 134
    .line 135
    invoke-virtual {p1}, Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState;->getQuoraState()I

    .line 136
    .line 137
    .line 138
    move-result v11

    .line 139
    new-instance v0, Lcom/zykj/student/dialogue/bean/req/SessionsReq;

    .line 140
    .line 141
    const/4 v9, 0x0

    .line 142
    const/16 v10, 0x14

    .line 143
    .line 144
    invoke-direct/range {v0 .. v11}, Lcom/zykj/student/dialogue/bean/req/SessionsReq;-><init>(Ljava/lang/String;ILjava/lang/Long;Lcom/zykj/student/dialogue/bean/req/JoinTimeReq;Lcom/zykj/student/dialogue/bean/req/UpdateTimeReq;Ljava/util/List;Ljava/util/List;IIII)V

    .line 145
    .line 146
    .line 147
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    .line 1
    iget-object v0, p0, Ls6/k0;->a:Ljava/util/List;

    .line 2
    .line 3
    iget-object v1, p0, Ls6/k0;->b:Ljava/util/List;

    .line 4
    .line 5
    iget-object v2, p0, Ls6/k0;->c:Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState;

    .line 6
    .line 7
    iget-object v3, p0, Ls6/k0;->d:Lcom/zykj/student/dialogue/bean/resp/FilterType$Subject;

    .line 8
    .line 9
    iget-object v4, p0, Ls6/k0;->e:Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime;

    .line 10
    .line 11
    iget-object v5, p0, Ls6/k0;->f:Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime;

    .line 12
    .line 13
    iget-object v6, p0, Ls6/k0;->g:Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime;

    .line 14
    .line 15
    iget-object v7, p0, Ls6/k0;->h:Lcom/zykj/student/dialogue/bean/resp/FilterType$Sort;

    .line 16
    .line 17
    iget-object v8, p0, Ls6/k0;->i:Ljava/lang/String;

    .line 18
    .line 19
    new-instance v9, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    .line 23
    .line 24
    const-string v10, "FilterConditions(checkedViewStatus="

    .line 25
    .line 26
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string v0, ", checkedTeacherViewStatus="

    .line 33
    .line 34
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v0, ", checkedQuestionState="

    .line 41
    .line 42
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-string v0, ", checkedSubject="

    .line 49
    .line 50
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    const-string v0, ", checkedJoinedTime="

    .line 57
    .line 58
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    const-string v0, ", checkedUpdatedTime="

    .line 65
    .line 66
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    const-string v0, ", checkedFavoriteTime="

    .line 73
    .line 74
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    const-string v0, ", checkedSortType="

    .line 81
    .line 82
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    const-string v0, ", searchedKeyword="

    .line 89
    .line 90
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    const-string v0, ")"

    .line 97
    .line 98
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    return-object v0
.end method
