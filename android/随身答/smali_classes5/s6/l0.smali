.class public final Ls6/l0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Ljava/util/List;

.field public final c:Ljava/util/List;

.field public final d:Ljava/util/List;

.field public final e:Ljava/util/List;

.field public final f:Ljava/util/List;

.field public final g:Ljava/util/List;

.field public final h:Ljava/util/List;

.field public final i:Ljava/util/List;

.field public final j:Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState;

.field public final k:Lcom/zykj/student/dialogue/bean/resp/FilterType$Subject;

.field public final l:Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime;

.field public final m:Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime;

.field public final n:Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime;

.field public final o:Lcom/zykj/student/dialogue/bean/resp/FilterType$Sort;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState;Lcom/zykj/student/dialogue/bean/resp/FilterType$Subject;Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime;Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime;Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime;Lcom/zykj/student/dialogue/bean/resp/FilterType$Sort;)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    move-object/from16 v4, p5

    move-object/from16 v5, p6

    move-object/from16 v6, p7

    move-object/from16 v7, p8

    move-object/from16 v8, p9

    move-object/from16 v9, p10

    move-object/from16 v10, p11

    move-object/from16 v11, p12

    move-object/from16 v12, p13

    move-object/from16 v13, p14

    move-object/from16 v14, p15

    const-string v15, "updatedTimeData"

    invoke-static {v1, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "joinedTimeData"

    invoke-static {v2, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "favoriteTimeData"

    invoke-static {v3, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "viewStatusData"

    invoke-static {v4, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "teacherViewStatusData"

    invoke-static {v5, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "questionStateData"

    invoke-static {v6, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "checkedViewStatus"

    invoke-static {v7, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "checkedTeacherViewStatus"

    invoke-static {v8, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "checkedQuestionState"

    invoke-static {v9, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "checkedSubject"

    invoke-static {v10, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "checkedJoinedTime"

    invoke-static {v11, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "checkedUpdatedTime"

    invoke-static {v12, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "checkedFavoriteTime"

    invoke-static {v13, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "checkedSortType"

    invoke-static {v14, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    move-object/from16 v15, p1

    .line 2
    iput-object v15, v0, Ls6/l0;->a:Ljava/lang/Object;

    .line 3
    iput-object v1, v0, Ls6/l0;->b:Ljava/util/List;

    .line 4
    iput-object v2, v0, Ls6/l0;->c:Ljava/util/List;

    .line 5
    iput-object v3, v0, Ls6/l0;->d:Ljava/util/List;

    .line 6
    iput-object v4, v0, Ls6/l0;->e:Ljava/util/List;

    .line 7
    iput-object v5, v0, Ls6/l0;->f:Ljava/util/List;

    .line 8
    iput-object v6, v0, Ls6/l0;->g:Ljava/util/List;

    .line 9
    iput-object v7, v0, Ls6/l0;->h:Ljava/util/List;

    .line 10
    iput-object v8, v0, Ls6/l0;->i:Ljava/util/List;

    .line 11
    iput-object v9, v0, Ls6/l0;->j:Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState;

    .line 12
    iput-object v10, v0, Ls6/l0;->k:Lcom/zykj/student/dialogue/bean/resp/FilterType$Subject;

    .line 13
    iput-object v11, v0, Ls6/l0;->l:Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime;

    .line 14
    iput-object v12, v0, Ls6/l0;->m:Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime;

    .line 15
    iput-object v13, v0, Ls6/l0;->n:Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime;

    .line 16
    iput-object v14, v0, Ls6/l0;->o:Lcom/zykj/student/dialogue/bean/resp/FilterType$Sort;

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/Result;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState;Lcom/zykj/student/dialogue/bean/resp/FilterType$Subject;Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime;Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime;Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime;Lcom/zykj/student/dialogue/bean/resp/FilterType$Sort;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 15

    move/from16 v0, p16

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    .line 17
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object/from16 v1, p1

    :goto_0
    and-int/lit8 v2, v0, 0x2

    const/4 v3, 0x4

    const/4 v4, 0x0

    const/4 v5, 0x2

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-eqz v2, :cond_1

    .line 18
    new-instance v2, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime$Custom;

    invoke-direct {v2, v7, v7, v6, v7}, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime$Custom;-><init>(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-array v9, v3, [Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime;

    sget-object v10, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime$Unlimited;->INSTANCE:Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime$Unlimited;

    aput-object v10, v9, v4

    sget-object v10, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime$ThisWeek;->INSTANCE:Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime$ThisWeek;

    aput-object v10, v9, v8

    sget-object v10, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime$ThisMonth;->INSTANCE:Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime$ThisMonth;

    aput-object v10, v9, v5

    aput-object v2, v9, v6

    .line 19
    invoke-static {v9}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    goto :goto_1

    :cond_1
    move-object/from16 v2, p2

    :goto_1
    and-int/lit8 v9, v0, 0x4

    if-eqz v9, :cond_2

    .line 20
    new-instance v9, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime$Custom;

    invoke-direct {v9, v7, v7, v6, v7}, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime$Custom;-><init>(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-array v10, v3, [Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime;

    sget-object v11, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime$Unlimited;->INSTANCE:Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime$Unlimited;

    aput-object v11, v10, v4

    sget-object v11, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime$ThisWeek;->INSTANCE:Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime$ThisWeek;

    aput-object v11, v10, v8

    sget-object v11, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime$ThisMonth;->INSTANCE:Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime$ThisMonth;

    aput-object v11, v10, v5

    aput-object v9, v10, v6

    .line 21
    invoke-static {v10}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v9

    goto :goto_2

    :cond_2
    move-object/from16 v9, p3

    :goto_2
    and-int/lit8 v10, v0, 0x8

    if-eqz v10, :cond_3

    .line 22
    new-instance v10, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime$Custom;

    invoke-direct {v10, v7, v7, v6, v7}, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime$Custom;-><init>(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-array v7, v3, [Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime;

    sget-object v11, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime$Unlimited;->INSTANCE:Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime$Unlimited;

    aput-object v11, v7, v4

    sget-object v11, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime$ThisWeek;->INSTANCE:Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime$ThisWeek;

    aput-object v11, v7, v8

    sget-object v11, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime$ThisMonth;->INSTANCE:Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime$ThisMonth;

    aput-object v11, v7, v5

    aput-object v10, v7, v6

    .line 23
    invoke-static {v7}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    goto :goto_3

    :cond_3
    move-object/from16 v7, p4

    :goto_3
    and-int/lit8 v10, v0, 0x10

    if-eqz v10, :cond_4

    const/4 v10, 0x5

    .line 24
    new-array v10, v10, [Lcom/zykj/student/dialogue/bean/resp/FilterType$ViewStatus;

    sget-object v11, Lcom/zykj/student/dialogue/bean/resp/FilterType$ViewStatus$Unlimited;->INSTANCE:Lcom/zykj/student/dialogue/bean/resp/FilterType$ViewStatus$Unlimited;

    aput-object v11, v10, v4

    sget-object v11, Lcom/zykj/student/dialogue/bean/resp/FilterType$ViewStatus$MyQuestion;->INSTANCE:Lcom/zykj/student/dialogue/bean/resp/FilterType$ViewStatus$MyQuestion;

    aput-object v11, v10, v8

    sget-object v11, Lcom/zykj/student/dialogue/bean/resp/FilterType$ViewStatus$Replied;->INSTANCE:Lcom/zykj/student/dialogue/bean/resp/FilterType$ViewStatus$Replied;

    aput-object v11, v10, v5

    sget-object v11, Lcom/zykj/student/dialogue/bean/resp/FilterType$ViewStatus$Unanswered;->INSTANCE:Lcom/zykj/student/dialogue/bean/resp/FilterType$ViewStatus$Unanswered;

    aput-object v11, v10, v6

    sget-object v11, Lcom/zykj/student/dialogue/bean/resp/FilterType$ViewStatus$NotViewed;->INSTANCE:Lcom/zykj/student/dialogue/bean/resp/FilterType$ViewStatus$NotViewed;

    aput-object v11, v10, v3

    .line 25
    invoke-static {v10}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    goto :goto_4

    :cond_4
    move-object/from16 v3, p5

    :goto_4
    and-int/lit8 v10, v0, 0x20

    if-eqz v10, :cond_5

    .line 26
    new-array v10, v6, [Lcom/zykj/student/dialogue/bean/resp/FilterType$TeacherViewStatus;

    sget-object v11, Lcom/zykj/student/dialogue/bean/resp/FilterType$TeacherViewStatus$Unlimited;->INSTANCE:Lcom/zykj/student/dialogue/bean/resp/FilterType$TeacherViewStatus$Unlimited;

    aput-object v11, v10, v4

    sget-object v11, Lcom/zykj/student/dialogue/bean/resp/FilterType$TeacherViewStatus$Started;->INSTANCE:Lcom/zykj/student/dialogue/bean/resp/FilterType$TeacherViewStatus$Started;

    aput-object v11, v10, v8

    sget-object v11, Lcom/zykj/student/dialogue/bean/resp/FilterType$TeacherViewStatus$Replied;->INSTANCE:Lcom/zykj/student/dialogue/bean/resp/FilterType$TeacherViewStatus$Replied;

    aput-object v11, v10, v5

    .line 27
    invoke-static {v10}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v10

    goto :goto_5

    :cond_5
    move-object/from16 v10, p6

    :goto_5
    and-int/lit8 v11, v0, 0x40

    if-eqz v11, :cond_6

    .line 28
    new-array v6, v6, [Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState;

    sget-object v11, Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState$Unlimited;->INSTANCE:Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState$Unlimited;

    aput-object v11, v6, v4

    sget-object v4, Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState$Ongoing;->INSTANCE:Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState$Ongoing;

    aput-object v4, v6, v8

    sget-object v4, Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState$Closed;->INSTANCE:Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState$Closed;

    aput-object v4, v6, v5

    .line 29
    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    goto :goto_6

    :cond_6
    move-object/from16 v4, p7

    :goto_6
    and-int/lit16 v5, v0, 0x80

    if-eqz v5, :cond_7

    .line 30
    invoke-static {}, Lcom/zykj/student/dialogue/bean/resp/HomeKt;->getInitialViewStatus()Ljava/util/List;

    move-result-object v5

    goto :goto_7

    :cond_7
    move-object/from16 v5, p8

    :goto_7
    and-int/lit16 v6, v0, 0x100

    if-eqz v6, :cond_8

    .line 31
    invoke-static {}, Lcom/zykj/student/dialogue/bean/resp/HomeKt;->getInitialTeacherViewStatus()Ljava/util/List;

    move-result-object v6

    goto :goto_8

    :cond_8
    move-object/from16 v6, p9

    :goto_8
    and-int/lit16 v8, v0, 0x200

    if-eqz v8, :cond_9

    .line 32
    invoke-static {}, Lcom/zykj/student/dialogue/bean/resp/HomeKt;->getInitialQuestionState()Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState$Unlimited;

    move-result-object v8

    goto :goto_9

    :cond_9
    move-object/from16 v8, p10

    :goto_9
    and-int/lit16 v11, v0, 0x400

    if-eqz v11, :cond_a

    .line 33
    invoke-static {}, Lcom/zykj/student/dialogue/bean/resp/HomeKt;->getInitialSubject()Lcom/zykj/student/dialogue/bean/resp/FilterType$Subject;

    move-result-object v11

    goto :goto_a

    :cond_a
    move-object/from16 v11, p11

    :goto_a
    and-int/lit16 v12, v0, 0x800

    if-eqz v12, :cond_b

    .line 34
    invoke-static {}, Lcom/zykj/student/dialogue/bean/resp/HomeKt;->getInitialJoinedTime()Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime$Unlimited;

    move-result-object v12

    goto :goto_b

    :cond_b
    move-object/from16 v12, p12

    :goto_b
    and-int/lit16 v13, v0, 0x1000

    if-eqz v13, :cond_c

    .line 35
    invoke-static {}, Lcom/zykj/student/dialogue/bean/resp/HomeKt;->getInitialUpdatedTime()Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime$Unlimited;

    move-result-object v13

    goto :goto_c

    :cond_c
    move-object/from16 v13, p13

    :goto_c
    and-int/lit16 v14, v0, 0x2000

    if-eqz v14, :cond_d

    .line 36
    invoke-static {}, Lcom/zykj/student/dialogue/bean/resp/HomeKt;->getInitialFavoriteTime()Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime$Unlimited;

    move-result-object v14

    goto :goto_d

    :cond_d
    move-object/from16 v14, p14

    :goto_d
    and-int/lit16 v0, v0, 0x4000

    if-eqz v0, :cond_e

    .line 37
    invoke-static {}, Lcom/zykj/student/dialogue/bean/resp/HomeKt;->getInitialSortType()Lcom/zykj/student/dialogue/bean/resp/FilterType$Sort$SortByUpdatedTime;

    move-result-object v0

    goto :goto_e

    :cond_e
    move-object/from16 v0, p15

    .line 38
    :goto_e
    invoke-virtual {v1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 p1, p0

    move-object/from16 p16, v0

    move-object/from16 p2, v1

    move-object/from16 p3, v2

    move-object/from16 p6, v3

    move-object/from16 p8, v4

    move-object/from16 p9, v5

    move-object/from16 p10, v6

    move-object/from16 p5, v7

    move-object/from16 p11, v8

    move-object/from16 p4, v9

    move-object/from16 p7, v10

    move-object/from16 p12, v11

    move-object/from16 p13, v12

    move-object/from16 p14, v13

    move-object/from16 p15, v14

    invoke-direct/range {p1 .. p16}, Ls6/l0;-><init>(Ljava/lang/Object;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState;Lcom/zykj/student/dialogue/bean/resp/FilterType$Subject;Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime;Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime;Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime;Lcom/zykj/student/dialogue/bean/resp/FilterType$Sort;)V

    return-void
.end method

.method public static synthetic b(Ls6/l0;Lkotlin/Result;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState;Lcom/zykj/student/dialogue/bean/resp/FilterType$Subject;Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime;Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime;Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime;Lcom/zykj/student/dialogue/bean/resp/FilterType$Sort;ILjava/lang/Object;)Ls6/l0;
    .locals 16

    move-object/from16 v0, p0

    move/from16 v1, p16

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    .line 1
    iget-object v2, v0, Ls6/l0;->a:Ljava/lang/Object;

    invoke-static {v2}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Ls6/l0;->b:Ljava/util/List;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Ls6/l0;->c:Ljava/util/List;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Ls6/l0;->d:Ljava/util/List;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Ls6/l0;->e:Ljava/util/List;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Ls6/l0;->f:Ljava/util/List;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Ls6/l0;->g:Ljava/util/List;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Ls6/l0;->h:Ljava/util/List;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Ls6/l0;->i:Ljava/util/List;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Ls6/l0;->j:Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Ls6/l0;->k:Lcom/zykj/student/dialogue/bean/resp/FilterType$Subject;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Ls6/l0;->l:Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Ls6/l0;->m:Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Ls6/l0;->n:Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    and-int/lit16 v1, v1, 0x4000

    if-eqz v1, :cond_e

    iget-object v1, v0, Ls6/l0;->o:Lcom/zykj/student/dialogue/bean/resp/FilterType$Sort;

    goto :goto_e

    :cond_e
    move-object/from16 v1, p15

    :goto_e
    invoke-virtual {v2}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v2

    move-object/from16 p1, v0

    move-object/from16 p16, v1

    move-object/from16 p2, v2

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move-object/from16 p9, v9

    move-object/from16 p10, v10

    move-object/from16 p11, v11

    move-object/from16 p12, v12

    move-object/from16 p13, v13

    move-object/from16 p14, v14

    move-object/from16 p15, v15

    invoke-virtual/range {p1 .. p16}, Ls6/l0;->a(Ljava/lang/Object;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState;Lcom/zykj/student/dialogue/bean/resp/FilterType$Subject;Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime;Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime;Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime;Lcom/zykj/student/dialogue/bean/resp/FilterType$Sort;)Ls6/l0;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState;Lcom/zykj/student/dialogue/bean/resp/FilterType$Subject;Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime;Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime;Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime;Lcom/zykj/student/dialogue/bean/resp/FilterType$Sort;)Ls6/l0;
    .locals 17

    .line 1
    const-string v0, "updatedTimeData"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "joinedTimeData"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "favoriteTimeData"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewStatusData"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "teacherViewStatusData"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "questionStateData"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "checkedViewStatus"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "checkedTeacherViewStatus"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "checkedQuestionState"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "checkedSubject"

    move-object/from16 v12, p11

    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "checkedJoinedTime"

    move-object/from16 v13, p12

    invoke-static {v13, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "checkedUpdatedTime"

    move-object/from16 v14, p13

    invoke-static {v14, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "checkedFavoriteTime"

    move-object/from16 v15, p14

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "checkedSortType"

    move-object/from16 v1, p15

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ls6/l0;

    move-object/from16 v2, p1

    move-object/from16 v16, p15

    invoke-direct/range {v1 .. v16}, Ls6/l0;-><init>(Ljava/lang/Object;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState;Lcom/zykj/student/dialogue/bean/resp/FilterType$Subject;Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime;Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime;Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime;Lcom/zykj/student/dialogue/bean/resp/FilterType$Sort;)V

    return-object v1
.end method

.method public final c()Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime;
    .locals 1

    .line 1
    iget-object v0, p0, Ls6/l0;->n:Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d()Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime;
    .locals 1

    .line 1
    iget-object v0, p0, Ls6/l0;->l:Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e()Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState;
    .locals 1

    .line 1
    iget-object v0, p0, Ls6/l0;->j:Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState;

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
    instance-of v1, p1, Ls6/l0;

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
    check-cast p1, Ls6/l0;

    .line 12
    .line 13
    iget-object v1, p0, Ls6/l0;->a:Ljava/lang/Object;

    .line 14
    .line 15
    iget-object v3, p1, Ls6/l0;->a:Ljava/lang/Object;

    .line 16
    .line 17
    invoke-static {v1, v3}, Lkotlin/Result;->equals-impl0(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-object v1, p0, Ls6/l0;->b:Ljava/util/List;

    .line 25
    .line 26
    iget-object v3, p1, Ls6/l0;->b:Ljava/util/List;

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
    iget-object v1, p0, Ls6/l0;->c:Ljava/util/List;

    .line 36
    .line 37
    iget-object v3, p1, Ls6/l0;->c:Ljava/util/List;

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
    iget-object v1, p0, Ls6/l0;->d:Ljava/util/List;

    .line 47
    .line 48
    iget-object v3, p1, Ls6/l0;->d:Ljava/util/List;

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
    iget-object v1, p0, Ls6/l0;->e:Ljava/util/List;

    .line 58
    .line 59
    iget-object v3, p1, Ls6/l0;->e:Ljava/util/List;

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
    iget-object v1, p0, Ls6/l0;->f:Ljava/util/List;

    .line 69
    .line 70
    iget-object v3, p1, Ls6/l0;->f:Ljava/util/List;

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
    iget-object v1, p0, Ls6/l0;->g:Ljava/util/List;

    .line 80
    .line 81
    iget-object v3, p1, Ls6/l0;->g:Ljava/util/List;

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
    iget-object v1, p0, Ls6/l0;->h:Ljava/util/List;

    .line 91
    .line 92
    iget-object v3, p1, Ls6/l0;->h:Ljava/util/List;

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
    iget-object v1, p0, Ls6/l0;->i:Ljava/util/List;

    .line 102
    .line 103
    iget-object v3, p1, Ls6/l0;->i:Ljava/util/List;

    .line 104
    .line 105
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    if-nez v1, :cond_a

    .line 110
    .line 111
    return v2

    .line 112
    :cond_a
    iget-object v1, p0, Ls6/l0;->j:Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState;

    .line 113
    .line 114
    iget-object v3, p1, Ls6/l0;->j:Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState;

    .line 115
    .line 116
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    if-nez v1, :cond_b

    .line 121
    .line 122
    return v2

    .line 123
    :cond_b
    iget-object v1, p0, Ls6/l0;->k:Lcom/zykj/student/dialogue/bean/resp/FilterType$Subject;

    .line 124
    .line 125
    iget-object v3, p1, Ls6/l0;->k:Lcom/zykj/student/dialogue/bean/resp/FilterType$Subject;

    .line 126
    .line 127
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v1

    .line 131
    if-nez v1, :cond_c

    .line 132
    .line 133
    return v2

    .line 134
    :cond_c
    iget-object v1, p0, Ls6/l0;->l:Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime;

    .line 135
    .line 136
    iget-object v3, p1, Ls6/l0;->l:Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime;

    .line 137
    .line 138
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result v1

    .line 142
    if-nez v1, :cond_d

    .line 143
    .line 144
    return v2

    .line 145
    :cond_d
    iget-object v1, p0, Ls6/l0;->m:Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime;

    .line 146
    .line 147
    iget-object v3, p1, Ls6/l0;->m:Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime;

    .line 148
    .line 149
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result v1

    .line 153
    if-nez v1, :cond_e

    .line 154
    .line 155
    return v2

    .line 156
    :cond_e
    iget-object v1, p0, Ls6/l0;->n:Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime;

    .line 157
    .line 158
    iget-object v3, p1, Ls6/l0;->n:Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime;

    .line 159
    .line 160
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    move-result v1

    .line 164
    if-nez v1, :cond_f

    .line 165
    .line 166
    return v2

    .line 167
    :cond_f
    iget-object v1, p0, Ls6/l0;->o:Lcom/zykj/student/dialogue/bean/resp/FilterType$Sort;

    .line 168
    .line 169
    iget-object p1, p1, Ls6/l0;->o:Lcom/zykj/student/dialogue/bean/resp/FilterType$Sort;

    .line 170
    .line 171
    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    move-result p1

    .line 175
    if-nez p1, :cond_10

    .line 176
    .line 177
    return v2

    .line 178
    :cond_10
    return v0
.end method

.method public final f()Lcom/zykj/student/dialogue/bean/resp/FilterType$Sort;
    .locals 1

    .line 1
    iget-object v0, p0, Ls6/l0;->o:Lcom/zykj/student/dialogue/bean/resp/FilterType$Sort;

    .line 2
    .line 3
    return-object v0
.end method

.method public final g()Lcom/zykj/student/dialogue/bean/resp/FilterType$Subject;
    .locals 1

    .line 1
    iget-object v0, p0, Ls6/l0;->k:Lcom/zykj/student/dialogue/bean/resp/FilterType$Subject;

    .line 2
    .line 3
    return-object v0
.end method

.method public final h()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Ls6/l0;->i:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Ls6/l0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-static {v0}, Lkotlin/Result;->hashCode-impl(Ljava/lang/Object;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object v1, p0, Ls6/l0;->b:Ljava/util/List;

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
    iget-object v1, p0, Ls6/l0;->c:Ljava/util/List;

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
    iget-object v1, p0, Ls6/l0;->d:Ljava/util/List;

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

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
    iget-object v1, p0, Ls6/l0;->e:Ljava/util/List;

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
    iget-object v1, p0, Ls6/l0;->f:Ljava/util/List;

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
    iget-object v1, p0, Ls6/l0;->g:Ljava/util/List;

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
    iget-object v1, p0, Ls6/l0;->h:Ljava/util/List;

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
    iget-object v1, p0, Ls6/l0;->i:Ljava/util/List;

    .line 73
    .line 74
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    add-int/2addr v0, v1

    .line 79
    mul-int/lit8 v0, v0, 0x1f

    .line 80
    .line 81
    iget-object v1, p0, Ls6/l0;->j:Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState;

    .line 82
    .line 83
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    add-int/2addr v0, v1

    .line 88
    mul-int/lit8 v0, v0, 0x1f

    .line 89
    .line 90
    iget-object v1, p0, Ls6/l0;->k:Lcom/zykj/student/dialogue/bean/resp/FilterType$Subject;

    .line 91
    .line 92
    invoke-virtual {v1}, Lcom/zykj/student/dialogue/bean/resp/FilterType$Subject;->hashCode()I

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    add-int/2addr v0, v1

    .line 97
    mul-int/lit8 v0, v0, 0x1f

    .line 98
    .line 99
    iget-object v1, p0, Ls6/l0;->l:Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime;

    .line 100
    .line 101
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    add-int/2addr v0, v1

    .line 106
    mul-int/lit8 v0, v0, 0x1f

    .line 107
    .line 108
    iget-object v1, p0, Ls6/l0;->m:Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime;

    .line 109
    .line 110
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    add-int/2addr v0, v1

    .line 115
    mul-int/lit8 v0, v0, 0x1f

    .line 116
    .line 117
    iget-object v1, p0, Ls6/l0;->n:Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime;

    .line 118
    .line 119
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 120
    .line 121
    .line 122
    move-result v1

    .line 123
    add-int/2addr v0, v1

    .line 124
    mul-int/lit8 v0, v0, 0x1f

    .line 125
    .line 126
    iget-object v1, p0, Ls6/l0;->o:Lcom/zykj/student/dialogue/bean/resp/FilterType$Sort;

    .line 127
    .line 128
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 129
    .line 130
    .line 131
    move-result v1

    .line 132
    add-int/2addr v0, v1

    .line 133
    return v0
.end method

.method public final i()Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime;
    .locals 1

    .line 1
    iget-object v0, p0, Ls6/l0;->m:Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime;

    .line 2
    .line 3
    return-object v0
.end method

.method public final j()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Ls6/l0;->h:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final k()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Ls6/l0;->d:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final l()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Ls6/l0;->c:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final m()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Ls6/l0;->g:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final n()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Ls6/l0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method

.method public final o()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Ls6/l0;->f:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final p()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Ls6/l0;->b:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final q()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Ls6/l0;->e:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Ls6/l0;->a:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-static {v1}, Lkotlin/Result;->toString-impl(Ljava/lang/Object;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, v0, Ls6/l0;->b:Ljava/util/List;

    .line 10
    .line 11
    iget-object v3, v0, Ls6/l0;->c:Ljava/util/List;

    .line 12
    .line 13
    iget-object v4, v0, Ls6/l0;->d:Ljava/util/List;

    .line 14
    .line 15
    iget-object v5, v0, Ls6/l0;->e:Ljava/util/List;

    .line 16
    .line 17
    iget-object v6, v0, Ls6/l0;->f:Ljava/util/List;

    .line 18
    .line 19
    iget-object v7, v0, Ls6/l0;->g:Ljava/util/List;

    .line 20
    .line 21
    iget-object v8, v0, Ls6/l0;->h:Ljava/util/List;

    .line 22
    .line 23
    iget-object v9, v0, Ls6/l0;->i:Ljava/util/List;

    .line 24
    .line 25
    iget-object v10, v0, Ls6/l0;->j:Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState;

    .line 26
    .line 27
    iget-object v11, v0, Ls6/l0;->k:Lcom/zykj/student/dialogue/bean/resp/FilterType$Subject;

    .line 28
    .line 29
    iget-object v12, v0, Ls6/l0;->l:Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime;

    .line 30
    .line 31
    iget-object v13, v0, Ls6/l0;->m:Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime;

    .line 32
    .line 33
    iget-object v14, v0, Ls6/l0;->n:Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime;

    .line 34
    .line 35
    iget-object v15, v0, Ls6/l0;->o:Lcom/zykj/student/dialogue/bean/resp/FilterType$Sort;

    .line 36
    .line 37
    new-instance v0, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 40
    .line 41
    .line 42
    move-object/from16 v16, v15

    .line 43
    .line 44
    const-string v15, "FilterUiState(subjectList="

    .line 45
    .line 46
    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string v1, ", updatedTimeData="

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    const-string v1, ", joinedTimeData="

    .line 61
    .line 62
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    const-string v1, ", favoriteTimeData="

    .line 69
    .line 70
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    const-string v1, ", viewStatusData="

    .line 77
    .line 78
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    const-string v1, ", teacherViewStatusData="

    .line 85
    .line 86
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    const-string v1, ", questionStateData="

    .line 93
    .line 94
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    const-string v1, ", checkedViewStatus="

    .line 101
    .line 102
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    const-string v1, ", checkedTeacherViewStatus="

    .line 109
    .line 110
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    const-string v1, ", checkedQuestionState="

    .line 117
    .line 118
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    const-string v1, ", checkedSubject="

    .line 125
    .line 126
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    const-string v1, ", checkedJoinedTime="

    .line 133
    .line 134
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    const-string v1, ", checkedUpdatedTime="

    .line 141
    .line 142
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    const-string v1, ", checkedFavoriteTime="

    .line 149
    .line 150
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    const-string v1, ", checkedSortType="

    .line 157
    .line 158
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    move-object/from16 v1, v16

    .line 162
    .line 163
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    const-string v1, ")"

    .line 167
    .line 168
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    return-object v0
.end method
