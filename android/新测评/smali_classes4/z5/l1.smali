.class public final Lz5/l1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/List;

.field public final b:J

.field public final c:Z

.field public final d:Ljava/lang/String;

.field public final e:Ljava/util/List;

.field public final f:Z

.field public final g:Ljava/util/List;

.field public final h:Ljava/util/List;

.field public final i:Ljava/util/List;

.field public final j:Ljava/util/List;

.field public final k:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(Ljava/util/List;JZLjava/lang/String;Ljava/util/List;ZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
    .locals 1

    const-string v0, "topicList"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stemList"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "diffList"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attainedLevelList"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorReasonList"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "customTagList"

    invoke-static {p11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectedTagList"

    invoke-static {p12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lz5/l1;->a:Ljava/util/List;

    .line 3
    iput-wide p2, p0, Lz5/l1;->b:J

    .line 4
    iput-boolean p4, p0, Lz5/l1;->c:Z

    .line 5
    iput-object p5, p0, Lz5/l1;->d:Ljava/lang/String;

    .line 6
    iput-object p6, p0, Lz5/l1;->e:Ljava/util/List;

    .line 7
    iput-boolean p7, p0, Lz5/l1;->f:Z

    .line 8
    iput-object p8, p0, Lz5/l1;->g:Ljava/util/List;

    .line 9
    iput-object p9, p0, Lz5/l1;->h:Ljava/util/List;

    .line 10
    iput-object p10, p0, Lz5/l1;->i:Ljava/util/List;

    .line 11
    iput-object p11, p0, Lz5/l1;->j:Ljava/util/List;

    .line 12
    iput-object p12, p0, Lz5/l1;->k:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;JZLjava/lang/String;Ljava/util/List;ZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 22

    move/from16 v0, p13

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    .line 13
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object/from16 v1, p1

    :goto_0
    and-int/lit8 v2, v0, 0x2

    if-eqz v2, :cond_1

    const-wide/16 v2, -0x1

    goto :goto_1

    :cond_1
    move-wide/from16 v2, p2

    :goto_1
    and-int/lit8 v4, v0, 0x4

    const/4 v5, 0x0

    if-eqz v4, :cond_2

    move v4, v5

    goto :goto_2

    :cond_2
    move/from16 v4, p4

    :goto_2
    and-int/lit8 v6, v0, 0x8

    if-eqz v6, :cond_3

    .line 14
    const-string v6, ""

    goto :goto_3

    :cond_3
    move-object/from16 v6, p5

    :goto_3
    and-int/lit8 v7, v0, 0x10

    if-eqz v7, :cond_4

    .line 15
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v7

    goto :goto_4

    :cond_4
    move-object/from16 v7, p6

    :goto_4
    and-int/lit8 v8, v0, 0x20

    if-eqz v8, :cond_5

    move v8, v5

    goto :goto_5

    :cond_5
    move/from16 v8, p7

    :goto_5
    and-int/lit8 v9, v0, 0x40

    const/4 v10, 0x3

    const/4 v11, 0x2

    const/16 v12, 0xa

    const/4 v13, 0x1

    if-eqz v9, :cond_6

    .line 16
    new-array v9, v10, [Lcom/zykj/evaluation/bean/constant/MistakeTag$Diff;

    sget-object v14, Lcom/zykj/evaluation/bean/constant/MistakeTag$Diff$Easy;->INSTANCE:Lcom/zykj/evaluation/bean/constant/MistakeTag$Diff$Easy;

    aput-object v14, v9, v5

    sget-object v14, Lcom/zykj/evaluation/bean/constant/MistakeTag$Diff$Normal;->INSTANCE:Lcom/zykj/evaluation/bean/constant/MistakeTag$Diff$Normal;

    aput-object v14, v9, v13

    sget-object v14, Lcom/zykj/evaluation/bean/constant/MistakeTag$Diff$Hard;->INSTANCE:Lcom/zykj/evaluation/bean/constant/MistakeTag$Diff$Hard;

    aput-object v14, v9, v11

    .line 17
    invoke-static {v9}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v9

    .line 18
    new-instance v14, Ljava/util/ArrayList;

    invoke-static {v9, v12}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v15

    invoke-direct {v14, v15}, Ljava/util/ArrayList;-><init>(I)V

    .line 19
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_6
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_7

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    .line 20
    check-cast v15, Lcom/zykj/evaluation/bean/constant/MistakeTag$Diff;

    .line 21
    new-instance v16, Lcom/zykj/evaluation/ui/detail/mistake/TagData;

    .line 22
    invoke-virtual {v15}, Lcom/zykj/evaluation/bean/constant/MistakeTag;->getId()J

    move-result-wide v17

    .line 23
    invoke-virtual {v15}, Lcom/zykj/evaluation/bean/constant/MistakeTag;->getName()Ljava/lang/String;

    move-result-object v15

    const/16 v19, 0x4

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-object/from16 p4, v15

    move-object/from16 p1, v16

    move-wide/from16 p2, v17

    move/from16 p6, v19

    move-object/from16 p7, v20

    move/from16 p5, v21

    .line 24
    invoke-direct/range {p1 .. p7}, Lcom/zykj/evaluation/ui/detail/mistake/TagData;-><init>(JLjava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v15, p1

    .line 25
    invoke-interface {v14, v15}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_6
    move-object/from16 v14, p8

    :cond_7
    and-int/lit16 v9, v0, 0x80

    if-eqz v9, :cond_8

    .line 26
    new-array v9, v10, [Lcom/zykj/evaluation/bean/constant/MistakeTag$AttainedLevel;

    sget-object v15, Lcom/zykj/evaluation/bean/constant/MistakeTag$AttainedLevel$Unknown;->INSTANCE:Lcom/zykj/evaluation/bean/constant/MistakeTag$AttainedLevel$Unknown;

    aput-object v15, v9, v5

    sget-object v15, Lcom/zykj/evaluation/bean/constant/MistakeTag$AttainedLevel$Generally;->INSTANCE:Lcom/zykj/evaluation/bean/constant/MistakeTag$AttainedLevel$Generally;

    aput-object v15, v9, v13

    sget-object v15, Lcom/zykj/evaluation/bean/constant/MistakeTag$AttainedLevel$Obviously;->INSTANCE:Lcom/zykj/evaluation/bean/constant/MistakeTag$AttainedLevel$Obviously;

    aput-object v15, v9, v11

    .line 27
    invoke-static {v9}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v9

    .line 28
    new-instance v15, Ljava/util/ArrayList;

    move/from16 p1, v5

    invoke-static {v9, v12}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v15, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 29
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_7
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_9

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    .line 30
    check-cast v9, Lcom/zykj/evaluation/bean/constant/MistakeTag$AttainedLevel;

    .line 31
    new-instance v16, Lcom/zykj/evaluation/ui/detail/mistake/TagData;

    .line 32
    invoke-virtual {v9}, Lcom/zykj/evaluation/bean/constant/MistakeTag;->getId()J

    move-result-wide v17

    .line 33
    invoke-virtual {v9}, Lcom/zykj/evaluation/bean/constant/MistakeTag;->getName()Ljava/lang/String;

    move-result-object v9

    const/16 v19, 0x4

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-object/from16 p5, v9

    move-object/from16 p2, v16

    move-wide/from16 p3, v17

    move/from16 p7, v19

    move-object/from16 p8, v20

    move/from16 p6, v21

    .line 34
    invoke-direct/range {p2 .. p8}, Lcom/zykj/evaluation/ui/detail/mistake/TagData;-><init>(JLjava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v9, p2

    .line 35
    invoke-interface {v15, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_7

    :cond_8
    move/from16 p1, v5

    move-object/from16 v15, p9

    :cond_9
    and-int/lit16 v5, v0, 0x100

    if-eqz v5, :cond_a

    const/4 v5, 0x4

    .line 36
    new-array v5, v5, [Lcom/zykj/evaluation/bean/constant/MistakeTag$ErrorReason;

    sget-object v9, Lcom/zykj/evaluation/bean/constant/MistakeTag$ErrorReason$Concept;->INSTANCE:Lcom/zykj/evaluation/bean/constant/MistakeTag$ErrorReason$Concept;

    aput-object v9, v5, p1

    sget-object v9, Lcom/zykj/evaluation/bean/constant/MistakeTag$ErrorReason$Examination;->INSTANCE:Lcom/zykj/evaluation/bean/constant/MistakeTag$ErrorReason$Examination;

    aput-object v9, v5, v13

    sget-object v9, Lcom/zykj/evaluation/bean/constant/MistakeTag$ErrorReason$Calculate;->INSTANCE:Lcom/zykj/evaluation/bean/constant/MistakeTag$ErrorReason$Calculate;

    aput-object v9, v5, v11

    sget-object v9, Lcom/zykj/evaluation/bean/constant/MistakeTag$ErrorReason$Careless;->INSTANCE:Lcom/zykj/evaluation/bean/constant/MistakeTag$ErrorReason$Careless;

    aput-object v9, v5, v10

    .line 37
    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    .line 38
    new-instance v9, Ljava/util/ArrayList;

    invoke-static {v5, v12}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v10

    invoke-direct {v9, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 39
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_8
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_b

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    .line 40
    check-cast v10, Lcom/zykj/evaluation/bean/constant/MistakeTag$ErrorReason;

    .line 41
    new-instance v11, Lcom/zykj/evaluation/ui/detail/mistake/TagData;

    .line 42
    invoke-virtual {v10}, Lcom/zykj/evaluation/bean/constant/MistakeTag;->getId()J

    move-result-wide v12

    .line 43
    invoke-virtual {v10}, Lcom/zykj/evaluation/bean/constant/MistakeTag;->getName()Ljava/lang/String;

    move-result-object v10

    const/16 v16, 0x4

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 p4, v10

    move-object/from16 p1, v11

    move-wide/from16 p2, v12

    move/from16 p6, v16

    move-object/from16 p7, v17

    move/from16 p5, v18

    .line 44
    invoke-direct/range {p1 .. p7}, Lcom/zykj/evaluation/ui/detail/mistake/TagData;-><init>(JLjava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v10, p1

    .line 45
    invoke-interface {v9, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_8

    :cond_a
    move-object/from16 v9, p10

    :cond_b
    and-int/lit16 v5, v0, 0x200

    if-eqz v5, :cond_c

    .line 46
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v5

    goto :goto_9

    :cond_c
    move-object/from16 v5, p11

    :goto_9
    and-int/lit16 v0, v0, 0x400

    if-eqz v0, :cond_d

    .line 47
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    move-object/from16 p13, v0

    :goto_a
    move-object/from16 p1, p0

    move-object/from16 p2, v1

    move-wide/from16 p3, v2

    move/from16 p5, v4

    move-object/from16 p12, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move/from16 p8, v8

    move-object/from16 p11, v9

    move-object/from16 p9, v14

    move-object/from16 p10, v15

    goto :goto_b

    :cond_d
    move-object/from16 p13, p12

    goto :goto_a

    .line 48
    :goto_b
    invoke-direct/range {p1 .. p13}, Lz5/l1;-><init>(Ljava/util/List;JZLjava/lang/String;Ljava/util/List;ZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic b(Lz5/l1;Ljava/util/List;JZLjava/lang/String;Ljava/util/List;ZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ILjava/lang/Object;)Lz5/l1;
    .locals 0

    .line 1
    and-int/lit8 p14, p13, 0x1

    .line 2
    .line 3
    if-eqz p14, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lz5/l1;->a:Ljava/util/List;

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p14, p13, 0x2

    .line 8
    .line 9
    if-eqz p14, :cond_1

    .line 10
    .line 11
    iget-wide p2, p0, Lz5/l1;->b:J

    .line 12
    .line 13
    :cond_1
    and-int/lit8 p14, p13, 0x4

    .line 14
    .line 15
    if-eqz p14, :cond_2

    .line 16
    .line 17
    iget-boolean p4, p0, Lz5/l1;->c:Z

    .line 18
    .line 19
    :cond_2
    and-int/lit8 p14, p13, 0x8

    .line 20
    .line 21
    if-eqz p14, :cond_3

    .line 22
    .line 23
    iget-object p5, p0, Lz5/l1;->d:Ljava/lang/String;

    .line 24
    .line 25
    :cond_3
    and-int/lit8 p14, p13, 0x10

    .line 26
    .line 27
    if-eqz p14, :cond_4

    .line 28
    .line 29
    iget-object p6, p0, Lz5/l1;->e:Ljava/util/List;

    .line 30
    .line 31
    :cond_4
    and-int/lit8 p14, p13, 0x20

    .line 32
    .line 33
    if-eqz p14, :cond_5

    .line 34
    .line 35
    iget-boolean p7, p0, Lz5/l1;->f:Z

    .line 36
    .line 37
    :cond_5
    and-int/lit8 p14, p13, 0x40

    .line 38
    .line 39
    if-eqz p14, :cond_6

    .line 40
    .line 41
    iget-object p8, p0, Lz5/l1;->g:Ljava/util/List;

    .line 42
    .line 43
    :cond_6
    and-int/lit16 p14, p13, 0x80

    .line 44
    .line 45
    if-eqz p14, :cond_7

    .line 46
    .line 47
    iget-object p9, p0, Lz5/l1;->h:Ljava/util/List;

    .line 48
    .line 49
    :cond_7
    and-int/lit16 p14, p13, 0x100

    .line 50
    .line 51
    if-eqz p14, :cond_8

    .line 52
    .line 53
    iget-object p10, p0, Lz5/l1;->i:Ljava/util/List;

    .line 54
    .line 55
    :cond_8
    and-int/lit16 p14, p13, 0x200

    .line 56
    .line 57
    if-eqz p14, :cond_9

    .line 58
    .line 59
    iget-object p11, p0, Lz5/l1;->j:Ljava/util/List;

    .line 60
    .line 61
    :cond_9
    and-int/lit16 p13, p13, 0x400

    .line 62
    .line 63
    if-eqz p13, :cond_a

    .line 64
    .line 65
    iget-object p12, p0, Lz5/l1;->k:Ljava/util/List;

    .line 66
    .line 67
    :cond_a
    move-object p13, p11

    .line 68
    move-object p14, p12

    .line 69
    move-object p11, p9

    .line 70
    move-object p12, p10

    .line 71
    move p9, p7

    .line 72
    move-object p10, p8

    .line 73
    move-object p7, p5

    .line 74
    move-object p8, p6

    .line 75
    move p6, p4

    .line 76
    move-wide p4, p2

    .line 77
    move-object p2, p0

    .line 78
    move-object p3, p1

    .line 79
    invoke-virtual/range {p2 .. p14}, Lz5/l1;->a(Ljava/util/List;JZLjava/lang/String;Ljava/util/List;ZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lz5/l1;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    return-object p0
.end method


# virtual methods
.method public final a(Ljava/util/List;JZLjava/lang/String;Ljava/util/List;ZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lz5/l1;
    .locals 14

    .line 1
    const-string v0, "topicList"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "title"

    .line 7
    .line 8
    move-object/from16 v6, p5

    .line 9
    .line 10
    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const-string v0, "stemList"

    .line 14
    .line 15
    move-object/from16 v7, p6

    .line 16
    .line 17
    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const-string v0, "diffList"

    .line 21
    .line 22
    move-object/from16 v9, p8

    .line 23
    .line 24
    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const-string v0, "attainedLevelList"

    .line 28
    .line 29
    move-object/from16 v10, p9

    .line 30
    .line 31
    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    const-string v0, "errorReasonList"

    .line 35
    .line 36
    move-object/from16 v11, p10

    .line 37
    .line 38
    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    const-string v0, "customTagList"

    .line 42
    .line 43
    move-object/from16 v12, p11

    .line 44
    .line 45
    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    const-string v0, "selectedTagList"

    .line 49
    .line 50
    move-object/from16 v13, p12

    .line 51
    .line 52
    invoke-static {v13, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    new-instance v1, Lz5/l1;

    .line 56
    .line 57
    move-object v2, p1

    .line 58
    move-wide/from16 v3, p2

    .line 59
    .line 60
    move/from16 v5, p4

    .line 61
    .line 62
    move/from16 v8, p7

    .line 63
    .line 64
    invoke-direct/range {v1 .. v13}, Lz5/l1;-><init>(Ljava/util/List;JZLjava/lang/String;Ljava/util/List;ZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 65
    .line 66
    .line 67
    return-object v1
.end method

.method public final c()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lz5/l1;->h:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lz5/l1;->f:Z

    .line 2
    .line 3
    return v0
.end method

.method public final e()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lz5/l1;->j:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lz5/l1;

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
    check-cast p1, Lz5/l1;

    .line 12
    .line 13
    iget-object v1, p0, Lz5/l1;->a:Ljava/util/List;

    .line 14
    .line 15
    iget-object v3, p1, Lz5/l1;->a:Ljava/util/List;

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
    iget-wide v3, p0, Lz5/l1;->b:J

    .line 25
    .line 26
    iget-wide v5, p1, Lz5/l1;->b:J

    .line 27
    .line 28
    cmp-long v1, v3, v5

    .line 29
    .line 30
    if-eqz v1, :cond_3

    .line 31
    .line 32
    return v2

    .line 33
    :cond_3
    iget-boolean v1, p0, Lz5/l1;->c:Z

    .line 34
    .line 35
    iget-boolean v3, p1, Lz5/l1;->c:Z

    .line 36
    .line 37
    if-eq v1, v3, :cond_4

    .line 38
    .line 39
    return v2

    .line 40
    :cond_4
    iget-object v1, p0, Lz5/l1;->d:Ljava/lang/String;

    .line 41
    .line 42
    iget-object v3, p1, Lz5/l1;->d:Ljava/lang/String;

    .line 43
    .line 44
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-nez v1, :cond_5

    .line 49
    .line 50
    return v2

    .line 51
    :cond_5
    iget-object v1, p0, Lz5/l1;->e:Ljava/util/List;

    .line 52
    .line 53
    iget-object v3, p1, Lz5/l1;->e:Ljava/util/List;

    .line 54
    .line 55
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-nez v1, :cond_6

    .line 60
    .line 61
    return v2

    .line 62
    :cond_6
    iget-boolean v1, p0, Lz5/l1;->f:Z

    .line 63
    .line 64
    iget-boolean v3, p1, Lz5/l1;->f:Z

    .line 65
    .line 66
    if-eq v1, v3, :cond_7

    .line 67
    .line 68
    return v2

    .line 69
    :cond_7
    iget-object v1, p0, Lz5/l1;->g:Ljava/util/List;

    .line 70
    .line 71
    iget-object v3, p1, Lz5/l1;->g:Ljava/util/List;

    .line 72
    .line 73
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    if-nez v1, :cond_8

    .line 78
    .line 79
    return v2

    .line 80
    :cond_8
    iget-object v1, p0, Lz5/l1;->h:Ljava/util/List;

    .line 81
    .line 82
    iget-object v3, p1, Lz5/l1;->h:Ljava/util/List;

    .line 83
    .line 84
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    if-nez v1, :cond_9

    .line 89
    .line 90
    return v2

    .line 91
    :cond_9
    iget-object v1, p0, Lz5/l1;->i:Ljava/util/List;

    .line 92
    .line 93
    iget-object v3, p1, Lz5/l1;->i:Ljava/util/List;

    .line 94
    .line 95
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    if-nez v1, :cond_a

    .line 100
    .line 101
    return v2

    .line 102
    :cond_a
    iget-object v1, p0, Lz5/l1;->j:Ljava/util/List;

    .line 103
    .line 104
    iget-object v3, p1, Lz5/l1;->j:Ljava/util/List;

    .line 105
    .line 106
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v1

    .line 110
    if-nez v1, :cond_b

    .line 111
    .line 112
    return v2

    .line 113
    :cond_b
    iget-object v1, p0, Lz5/l1;->k:Ljava/util/List;

    .line 114
    .line 115
    iget-object p1, p1, Lz5/l1;->k:Ljava/util/List;

    .line 116
    .line 117
    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result p1

    .line 121
    if-nez p1, :cond_c

    .line 122
    .line 123
    return v2

    .line 124
    :cond_c
    return v0
.end method

.method public final f()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lz5/l1;->g:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final g()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lz5/l1;->i:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final h()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lz5/l1;->k:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lz5/l1;->a:Ljava/util/List;

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
    iget-wide v1, p0, Lz5/l1;->b:J

    .line 10
    .line 11
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

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
    iget-boolean v1, p0, Lz5/l1;->c:Z

    .line 19
    .line 20
    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

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
    iget-object v1, p0, Lz5/l1;->d:Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

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
    iget-object v1, p0, Lz5/l1;->e:Ljava/util/List;

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
    iget-boolean v1, p0, Lz5/l1;->f:Z

    .line 46
    .line 47
    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

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
    iget-object v1, p0, Lz5/l1;->g:Ljava/util/List;

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
    iget-object v1, p0, Lz5/l1;->h:Ljava/util/List;

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
    iget-object v1, p0, Lz5/l1;->i:Ljava/util/List;

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
    iget-object v1, p0, Lz5/l1;->j:Ljava/util/List;

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
    iget-object v1, p0, Lz5/l1;->k:Ljava/util/List;

    .line 91
    .line 92
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    add-int/2addr v0, v1

    .line 97
    return v0
.end method

.method public final i()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lz5/l1;->b:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final j()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lz5/l1;->e:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final k()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lz5/l1;->d:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final l()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lz5/l1;->a:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final m()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lz5/l1;->c:Z

    .line 2
    .line 3
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 14

    .line 1
    iget-object v0, p0, Lz5/l1;->a:Ljava/util/List;

    .line 2
    .line 3
    iget-wide v1, p0, Lz5/l1;->b:J

    .line 4
    .line 5
    iget-boolean v3, p0, Lz5/l1;->c:Z

    .line 6
    .line 7
    iget-object v4, p0, Lz5/l1;->d:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v5, p0, Lz5/l1;->e:Ljava/util/List;

    .line 10
    .line 11
    iget-boolean v6, p0, Lz5/l1;->f:Z

    .line 12
    .line 13
    iget-object v7, p0, Lz5/l1;->g:Ljava/util/List;

    .line 14
    .line 15
    iget-object v8, p0, Lz5/l1;->h:Ljava/util/List;

    .line 16
    .line 17
    iget-object v9, p0, Lz5/l1;->i:Ljava/util/List;

    .line 18
    .line 19
    iget-object v10, p0, Lz5/l1;->j:Ljava/util/List;

    .line 20
    .line 21
    iget-object v11, p0, Lz5/l1;->k:Ljava/util/List;

    .line 22
    .line 23
    new-instance v12, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 26
    .line 27
    .line 28
    const-string v13, "MistakeUIState(topicList="

    .line 29
    .line 30
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string v0, ", selectedTopicId="

    .line 37
    .line 38
    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v12, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string v0, ", isShowTopicDiffTip="

    .line 45
    .line 46
    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string v0, ", title="

    .line 53
    .line 54
    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    const-string v0, ", stemList="

    .line 61
    .line 62
    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v12, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    const-string v0, ", canOpenCamera="

    .line 69
    .line 70
    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    const-string v0, ", diffList="

    .line 77
    .line 78
    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    const-string v0, ", attainedLevelList="

    .line 85
    .line 86
    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    const-string v0, ", errorReasonList="

    .line 93
    .line 94
    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    const-string v0, ", customTagList="

    .line 101
    .line 102
    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    const-string v0, ", selectedTagList="

    .line 109
    .line 110
    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    const-string v0, ")"

    .line 117
    .line 118
    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    return-object v0
.end method
