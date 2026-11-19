.class public final Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;
.super Landroidx/lifecycle/ViewModel;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;",
        "Landroidx/lifecycle/ViewModel;",
        "<init>",
        "()V",
        "app_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nMistakeCollectionFilterResultViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MistakeCollectionFilterResultViewModel.kt\ncom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,516:1\n230#2,5:517\n230#2,3:522\n233#2,2:528\n230#2,5:530\n230#2,5:535\n230#2,5:540\n230#2,5:545\n230#2,5:550\n230#2,5:555\n230#2,5:560\n230#2,5:565\n230#2,5:570\n230#2,5:575\n230#2,5:580\n230#2,5:585\n230#2,5:590\n230#2,5:595\n230#2,5:600\n230#2,5:605\n230#2,5:610\n230#2,5:615\n230#2,3:620\n233#2,2:630\n230#2,3:632\n233#2,2:642\n230#2,5:644\n230#2,5:649\n230#2,5:659\n230#2,5:664\n230#2,5:669\n230#2,5:674\n230#2,5:687\n230#2,5:692\n1761#3,3:525\n774#3:623\n865#3,2:624\n1563#3:626\n1634#3,3:627\n774#3:635\n865#3,2:636\n1563#3:638\n1634#3,3:639\n1563#3:655\n1634#3,3:656\n1563#3:679\n1634#3,3:680\n1563#3:683\n1634#3,3:684\n1#4:654\n*S KotlinDebug\n*F\n+ 1 MistakeCollectionFilterResultViewModel.kt\ncom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel\n*L\n41#1:517,5\n48#1:522,3\n48#1:528,2\n66#1:530,5\n71#1:535,5\n75#1:540,5\n80#1:545,5\n90#1:550,5\n111#1:555,5\n117#1:560,5\n128#1:565,5\n132#1:570,5\n135#1:575,5\n144#1:580,5\n147#1:585,5\n150#1:590,5\n153#1:595,5\n156#1:600,5\n159#1:605,5\n162#1:610,5\n165#1:615,5\n182#1:620,3\n182#1:630,2\n214#1:632,3\n214#1:642,2\n242#1:644,5\n262#1:649,5\n304#1:659,5\n313#1:664,5\n416#1:669,5\n490#1:674,5\n402#1:687,5\n404#1:692,5\n49#1:525,3\n203#1:623\n203#1:624,2\n203#1:626\n203#1:627,3\n228#1:635\n228#1:636,2\n228#1:638\n228#1:639,3\n289#1:655\n289#1:656,3\n396#1:679\n396#1:680,3\n399#1:683\n399#1:684,3\n*E\n"
    }
.end annotation


# instance fields
.field public final a:Lcom/zykj/mistake/data/a;

.field public final b:Lo2/a;

.field public final c:Lkotlinx/coroutines/flow/n0;

.field public final d:Lkotlinx/coroutines/flow/a0;

.field public final e:Lkotlinx/coroutines/channels/b;

.field public final f:Lkotlinx/coroutines/flow/c;

.field public g:Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;


# direct methods
.method public constructor <init>()V
    .locals 38

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-direct {v0}, Landroidx/lifecycle/ViewModel;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lcom/zykj/mistake/data/a;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-direct {v1, v2}, Lcom/zykj/mistake/data/a;-><init>(I)V

    .line 10
    .line 11
    .line 12
    iput-object v1, v0, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;->a:Lcom/zykj/mistake/data/a;

    .line 13
    .line 14
    new-instance v1, Lo2/a;

    .line 15
    .line 16
    const/16 v2, 0xa

    .line 17
    .line 18
    invoke-direct {v1, v2}, Lo2/a;-><init>(I)V

    .line 19
    .line 20
    .line 21
    iput-object v1, v0, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;->b:Lo2/a;

    .line 22
    .line 23
    new-instance v3, Lcom/zykj/mistake/feature/collection/filter/s0;

    .line 24
    .line 25
    new-instance v8, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;

    .line 26
    .line 27
    invoke-direct {v8}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;-><init>()V

    .line 28
    .line 29
    .line 30
    sget-object v10, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 31
    .line 32
    sget-object v12, Lkotlin/collections/EmptySet;->INSTANCE:Lkotlin/collections/EmptySet;

    .line 33
    .line 34
    sget-object v14, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SortType;->TIME:Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SortType;

    .line 35
    .line 36
    const/16 v36, 0x0

    .line 37
    .line 38
    sget-object v37, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SourceType;->CREATE_COLLECTION:Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SourceType;

    .line 39
    .line 40
    const-string v4, ""

    .line 41
    .line 42
    const-string v5, "\u9519\u9898\u96c6"

    .line 43
    .line 44
    const/4 v6, 0x0

    .line 45
    const/16 v7, 0x64

    .line 46
    .line 47
    const/4 v9, 0x1

    .line 48
    const/4 v11, 0x0

    .line 49
    const/4 v15, 0x0

    .line 50
    const/16 v16, 0x0

    .line 51
    .line 52
    const/16 v17, 0x0

    .line 53
    .line 54
    const/16 v18, 0x0

    .line 55
    .line 56
    const/16 v19, 0x1

    .line 57
    .line 58
    const/16 v20, 0x0

    .line 59
    .line 60
    const/16 v21, 0x0

    .line 61
    .line 62
    const/16 v24, 0x1

    .line 63
    .line 64
    const/16 v25, 0x0

    .line 65
    .line 66
    const/16 v26, 0x0

    .line 67
    .line 68
    const/16 v27, 0x0

    .line 69
    .line 70
    const/16 v29, 0x0

    .line 71
    .line 72
    const/16 v30, 0x0

    .line 73
    .line 74
    const/16 v31, 0x0

    .line 75
    .line 76
    const/16 v32, 0x0

    .line 77
    .line 78
    const/16 v33, 0x1

    .line 79
    .line 80
    const/16 v34, 0x0

    .line 81
    .line 82
    move-object v13, v12

    .line 83
    move-object/from16 v22, v10

    .line 84
    .line 85
    move-object/from16 v23, v10

    .line 86
    .line 87
    move-object/from16 v28, v12

    .line 88
    .line 89
    move-object/from16 v35, v12

    .line 90
    .line 91
    invoke-direct/range {v3 .. v37}, Lcom/zykj/mistake/feature/collection/filter/s0;-><init>(Ljava/lang/String;Ljava/lang/String;IILcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;ILjava/util/List;ILjava/util/Set;Ljava/util/Set;Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SortType;ZZZZZZZLjava/util/List;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIZLjava/util/Set;ZLcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SourceType;)V

    .line 92
    .line 93
    .line 94
    invoke-static {v3}, Lkotlinx/coroutines/flow/h;->b(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n0;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    iput-object v1, v0, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;->c:Lkotlinx/coroutines/flow/n0;

    .line 99
    .line 100
    new-instance v2, Lkotlinx/coroutines/flow/a0;

    .line 101
    .line 102
    invoke-direct {v2, v1}, Lkotlinx/coroutines/flow/a0;-><init>(Lkotlinx/coroutines/flow/y;)V

    .line 103
    .line 104
    .line 105
    iput-object v2, v0, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;->d:Lkotlinx/coroutines/flow/a0;

    .line 106
    .line 107
    const/4 v1, 0x0

    .line 108
    const/4 v2, 0x7

    .line 109
    const/4 v3, 0x0

    .line 110
    invoke-static {v1, v2, v3}, Lkotlinx/coroutines/channels/k;->a(IILkotlinx/coroutines/channels/BufferOverflow;)Lkotlinx/coroutines/channels/b;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    iput-object v1, v0, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;->e:Lkotlinx/coroutines/channels/b;

    .line 115
    .line 116
    invoke-static {v1}, Lkotlinx/coroutines/flow/h;->l(Lkotlinx/coroutines/channels/b;)Lkotlinx/coroutines/flow/c;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    iput-object v1, v0, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;->f:Lkotlinx/coroutines/flow/c;

    .line 121
    .line 122
    new-instance v1, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;

    .line 123
    .line 124
    invoke-direct {v1}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;-><init>()V

    .line 125
    .line 126
    .line 127
    iput-object v1, v0, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;->g:Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;

    .line 128
    .line 129
    return-void
.end method

.method public static b(Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;)Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;
    .locals 3

    .line 1
    new-instance v0, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->getCollectionId()Ljava/lang/Integer;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->setCollectionId(Ljava/lang/Integer;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->getTimeRange()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-virtual {v0, v1}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->setTimeRange(I)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->getStartTime()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v0, v1}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->setStartTime(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->getEndTime()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v0, v1}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->setEndTime(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->getTopicIds()Ljava/util/ArrayList;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {p0}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->getTopicIds()Ljava/util/ArrayList;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->getDiff()Ljava/util/ArrayList;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {p0}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->getDiff()Ljava/util/ArrayList;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->getAttainedLevel()Ljava/util/ArrayList;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-virtual {p0}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->getAttainedLevel()Ljava/util/ArrayList;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->getErrorReason()Ljava/util/ArrayList;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-virtual {p0}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->getErrorReason()Ljava/util/ArrayList;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->getCurrentCollectionStatus()I

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    invoke-virtual {v0, v1}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->setCurrentCollectionStatus(I)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->getOtherCollectionStatus()I

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    invoke-virtual {v0, v1}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->setOtherCollectionStatus(I)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->getTagIdList()Ljava/util/ArrayList;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    invoke-virtual {p0}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->getTagIdList()Ljava/util/ArrayList;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 101
    .line 102
    .line 103
    invoke-virtual {p0}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->getSortType()I

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    invoke-virtual {v0, v1}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->setSortType(I)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p0}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->getSkipCount()I

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    invoke-virtual {v0, v1}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->setSkipCount(I)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {p0}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->getMaxResultCount()I

    .line 118
    .line 119
    .line 120
    move-result p0

    .line 121
    invoke-virtual {v0, p0}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->setMaxResultCount(I)V

    .line 122
    .line 123
    .line 124
    return-object v0
.end method


# virtual methods
.method public final a()V
    .locals 42

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;->c:Lkotlinx/coroutines/flow/n0;

    .line 4
    .line 5
    invoke-virtual {v1}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    check-cast v2, Lcom/zykj/mistake/feature/collection/filter/s0;

    .line 10
    .line 11
    new-instance v3, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;

    .line 12
    .line 13
    invoke-direct {v3}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;-><init>()V

    .line 14
    .line 15
    .line 16
    iget-object v4, v2, Lcom/zykj/mistake/feature/collection/filter/s0;->a:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v4}, Lkotlin/text/w;->D(Ljava/lang/String;)Ljava/lang/Integer;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    invoke-virtual {v3, v4}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->setCollectionId(Ljava/lang/Integer;)V

    .line 23
    .line 24
    .line 25
    iget v4, v2, Lcom/zykj/mistake/feature/collection/filter/s0;->u:I

    .line 26
    .line 27
    invoke-virtual {v3, v4}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->setTimeRange(I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v3}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->getTimeRange()I

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    const/4 v5, 0x3

    .line 35
    if-ne v4, v5, :cond_0

    .line 36
    .line 37
    iget-object v4, v2, Lcom/zykj/mistake/feature/collection/filter/s0;->v:Ljava/lang/String;

    .line 38
    .line 39
    invoke-virtual {v3, v4}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->setStartTime(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    iget-object v4, v2, Lcom/zykj/mistake/feature/collection/filter/s0;->w:Ljava/lang/String;

    .line 43
    .line 44
    invoke-virtual {v3, v4}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->setEndTime(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    :cond_0
    invoke-virtual {v3}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->getTopicIds()Ljava/util/ArrayList;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    iget-object v5, v2, Lcom/zykj/mistake/feature/collection/filter/s0;->y:Ljava/util/Set;

    .line 52
    .line 53
    check-cast v5, Ljava/util/Collection;

    .line 54
    .line 55
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 56
    .line 57
    .line 58
    iget-object v4, v2, Lcom/zykj/mistake/feature/collection/filter/s0;->z:Ljava/lang/Integer;

    .line 59
    .line 60
    if-eqz v4, :cond_1

    .line 61
    .line 62
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    invoke-virtual {v3}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->getDiff()Ljava/util/ArrayList;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    :cond_1
    iget-object v4, v2, Lcom/zykj/mistake/feature/collection/filter/s0;->A:Ljava/lang/Integer;

    .line 78
    .line 79
    if-eqz v4, :cond_2

    .line 80
    .line 81
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 82
    .line 83
    .line 84
    move-result v4

    .line 85
    invoke-virtual {v3}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->getAttainedLevel()Ljava/util/ArrayList;

    .line 86
    .line 87
    .line 88
    move-result-object v5

    .line 89
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    :cond_2
    iget-object v4, v2, Lcom/zykj/mistake/feature/collection/filter/s0;->B:Ljava/lang/Integer;

    .line 97
    .line 98
    if-eqz v4, :cond_3

    .line 99
    .line 100
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 101
    .line 102
    .line 103
    move-result v4

    .line 104
    invoke-virtual {v3}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->getErrorReason()Ljava/util/ArrayList;

    .line 105
    .line 106
    .line 107
    move-result-object v5

    .line 108
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 109
    .line 110
    .line 111
    move-result-object v4

    .line 112
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    :cond_3
    iget v4, v2, Lcom/zykj/mistake/feature/collection/filter/s0;->C:I

    .line 116
    .line 117
    invoke-virtual {v3, v4}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->setCurrentCollectionStatus(I)V

    .line 118
    .line 119
    .line 120
    iget v4, v2, Lcom/zykj/mistake/feature/collection/filter/s0;->D:I

    .line 121
    .line 122
    invoke-virtual {v3, v4}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->setOtherCollectionStatus(I)V

    .line 123
    .line 124
    .line 125
    iget-boolean v4, v2, Lcom/zykj/mistake/feature/collection/filter/s0;->E:Z

    .line 126
    .line 127
    const/4 v5, 0x0

    .line 128
    if-eqz v4, :cond_4

    .line 129
    .line 130
    invoke-virtual {v3}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->getTagIdList()Ljava/util/ArrayList;

    .line 131
    .line 132
    .line 133
    move-result-object v4

    .line 134
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 135
    .line 136
    .line 137
    move-result-object v6

    .line 138
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    :cond_4
    invoke-virtual {v3}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->getTagIdList()Ljava/util/ArrayList;

    .line 142
    .line 143
    .line 144
    move-result-object v4

    .line 145
    iget-object v6, v2, Lcom/zykj/mistake/feature/collection/filter/s0;->F:Ljava/util/Set;

    .line 146
    .line 147
    check-cast v6, Ljava/lang/Iterable;

    .line 148
    .line 149
    new-instance v7, Ljava/util/ArrayList;

    .line 150
    .line 151
    const/16 v8, 0xa

    .line 152
    .line 153
    invoke-static {v6, v8}, Lkotlin/collections/u;->p(Ljava/lang/Iterable;I)I

    .line 154
    .line 155
    .line 156
    move-result v8

    .line 157
    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 158
    .line 159
    .line 160
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 161
    .line 162
    .line 163
    move-result-object v6

    .line 164
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 165
    .line 166
    .line 167
    move-result v8

    .line 168
    if-eqz v8, :cond_5

    .line 169
    .line 170
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v8

    .line 174
    check-cast v8, Ljava/lang/Number;

    .line 175
    .line 176
    invoke-virtual {v8}, Ljava/lang/Number;->longValue()J

    .line 177
    .line 178
    .line 179
    move-result-wide v8

    .line 180
    long-to-int v8, v8

    .line 181
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 182
    .line 183
    .line 184
    move-result-object v8

    .line 185
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    goto :goto_0

    .line 189
    :cond_5
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 190
    .line 191
    .line 192
    iget-object v2, v2, Lcom/zykj/mistake/feature/collection/filter/s0;->k:Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SortType;

    .line 193
    .line 194
    sget-object v4, Lcom/zykj/mistake/feature/collection/filter/z0;->a:[I

    .line 195
    .line 196
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 197
    .line 198
    .line 199
    move-result v2

    .line 200
    aget v2, v4, v2

    .line 201
    .line 202
    const/4 v4, 0x1

    .line 203
    if-eq v2, v4, :cond_7

    .line 204
    .line 205
    const/4 v6, 0x2

    .line 206
    if-ne v2, v6, :cond_6

    .line 207
    .line 208
    move v2, v4

    .line 209
    goto :goto_1

    .line 210
    :cond_6
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    .line 211
    .line 212
    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 213
    .line 214
    .line 215
    throw v1

    .line 216
    :cond_7
    move v2, v5

    .line 217
    :goto_1
    invoke-virtual {v3, v2}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->setSortType(I)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v3, v5}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->setSkipCount(I)V

    .line 221
    .line 222
    .line 223
    const/16 v2, 0x14

    .line 224
    .line 225
    invoke-virtual {v3, v2}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->setMaxResultCount(I)V

    .line 226
    .line 227
    .line 228
    iput-object v3, v0, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;->g:Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;

    .line 229
    .line 230
    :cond_8
    invoke-virtual {v1}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v2

    .line 234
    move-object v5, v2

    .line 235
    check-cast v5, Lcom/zykj/mistake/feature/collection/filter/s0;

    .line 236
    .line 237
    sget-object v15, Lkotlin/collections/EmptySet;->INSTANCE:Lkotlin/collections/EmptySet;

    .line 238
    .line 239
    iget-object v10, v0, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;->g:Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;

    .line 240
    .line 241
    iget v11, v5, Lcom/zykj/mistake/feature/collection/filter/s0;->D:I

    .line 242
    .line 243
    const/16 v40, -0xa31

    .line 244
    .line 245
    const/16 v41, 0x3

    .line 246
    .line 247
    const/4 v6, 0x0

    .line 248
    const/4 v7, 0x0

    .line 249
    const/4 v8, 0x0

    .line 250
    const/4 v9, 0x0

    .line 251
    const/4 v12, 0x0

    .line 252
    const/4 v13, 0x0

    .line 253
    const/4 v14, 0x0

    .line 254
    const/16 v16, 0x0

    .line 255
    .line 256
    const/16 v17, 0x0

    .line 257
    .line 258
    const/16 v18, 0x0

    .line 259
    .line 260
    const/16 v19, 0x0

    .line 261
    .line 262
    const/16 v20, 0x0

    .line 263
    .line 264
    const/16 v21, 0x0

    .line 265
    .line 266
    const/16 v22, 0x0

    .line 267
    .line 268
    const/16 v23, 0x0

    .line 269
    .line 270
    const/16 v24, 0x0

    .line 271
    .line 272
    const/16 v25, 0x0

    .line 273
    .line 274
    const/16 v26, 0x0

    .line 275
    .line 276
    const/16 v27, 0x0

    .line 277
    .line 278
    const/16 v28, 0x0

    .line 279
    .line 280
    const/16 v29, 0x0

    .line 281
    .line 282
    const/16 v30, 0x0

    .line 283
    .line 284
    const/16 v31, 0x0

    .line 285
    .line 286
    const/16 v32, 0x0

    .line 287
    .line 288
    const/16 v33, 0x0

    .line 289
    .line 290
    const/16 v34, 0x0

    .line 291
    .line 292
    const/16 v35, 0x0

    .line 293
    .line 294
    const/16 v36, 0x0

    .line 295
    .line 296
    const/16 v37, 0x0

    .line 297
    .line 298
    const/16 v38, 0x0

    .line 299
    .line 300
    const/16 v39, 0x0

    .line 301
    .line 302
    invoke-static/range {v5 .. v41}, Lcom/zykj/mistake/feature/collection/filter/s0;->a(Lcom/zykj/mistake/feature/collection/filter/s0;Ljava/lang/String;Ljava/lang/String;IILcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;ILjava/util/ArrayList;ILjava/util/Set;Ljava/util/Set;Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SortType;ZZZZZZZLjava/util/ArrayList;Ljava/util/ArrayList;ILjava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIZLjava/util/Set;ZLcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SourceType;II)Lcom/zykj/mistake/feature/collection/filter/s0;

    .line 303
    .line 304
    .line 305
    move-result-object v3

    .line 306
    invoke-virtual {v1, v2, v3}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 307
    .line 308
    .line 309
    move-result v2

    .line 310
    if-eqz v2, :cond_8

    .line 311
    .line 312
    iget-object v1, v0, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;->g:Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;

    .line 313
    .line 314
    invoke-virtual {v0, v1, v4}, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;->e(Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;Z)V

    .line 315
    .line 316
    .line 317
    return-void
.end method

.method public final c(Lcom/zykj/mistake/feature/collection/filter/r0;)V
    .locals 48

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 7
    .line 8
    .line 9
    move-result-object v3

    .line 10
    instance-of v4, v1, Lcom/zykj/mistake/feature/collection/filter/z;

    .line 11
    .line 12
    const/4 v6, 0x3

    .line 13
    const/4 v7, 0x1

    .line 14
    iget-object v8, v0, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;->c:Lkotlinx/coroutines/flow/n0;

    .line 15
    .line 16
    if-eqz v4, :cond_8

    .line 17
    .line 18
    check-cast v1, Lcom/zykj/mistake/feature/collection/filter/z;

    .line 19
    .line 20
    iget-object v4, v1, Lcom/zykj/mistake/feature/collection/filter/z;->a:Lcom/zykj/mistake/feature/collection/filter/l;

    .line 21
    .line 22
    iget-object v1, v4, Lcom/zykj/mistake/feature/collection/filter/l;->e:Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;

    .line 23
    .line 24
    invoke-static {v1}, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;->b(Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;)Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;

    .line 25
    .line 26
    .line 27
    move-result-object v9

    .line 28
    iget-object v1, v4, Lcom/zykj/mistake/feature/collection/filter/l;->a:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v1}, Lkotlin/text/w;->D(Ljava/lang/String;)Ljava/lang/Integer;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v9, v1}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->setCollectionId(Ljava/lang/Integer;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v9}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->getSortType()I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    invoke-static {v1, v2, v7}, Lkotlin/collections/u;->m(III)I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    invoke-virtual {v9, v1}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->setSortType(I)V

    .line 46
    .line 47
    .line 48
    const/16 v1, 0x14

    .line 49
    .line 50
    invoke-virtual {v9, v1}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->setMaxResultCount(I)V

    .line 51
    .line 52
    .line 53
    iput-object v9, v0, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;->g:Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;

    .line 54
    .line 55
    :goto_0
    invoke-virtual {v8}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    move-object v10, v1

    .line 60
    check-cast v10, Lcom/zykj/mistake/feature/collection/filter/s0;

    .line 61
    .line 62
    iget-object v11, v4, Lcom/zykj/mistake/feature/collection/filter/l;->a:Ljava/lang/String;

    .line 63
    .line 64
    iget-object v12, v4, Lcom/zykj/mistake/feature/collection/filter/l;->b:Ljava/lang/String;

    .line 65
    .line 66
    iget v13, v4, Lcom/zykj/mistake/feature/collection/filter/l;->c:I

    .line 67
    .line 68
    iget v14, v4, Lcom/zykj/mistake/feature/collection/filter/l;->d:I

    .line 69
    .line 70
    invoke-static {v9}, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;->b(Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;)Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;

    .line 71
    .line 72
    .line 73
    move-result-object v15

    .line 74
    iget v2, v4, Lcom/zykj/mistake/feature/collection/filter/l;->g:I

    .line 75
    .line 76
    iget-boolean v7, v4, Lcom/zykj/mistake/feature/collection/filter/l;->h:Z

    .line 77
    .line 78
    invoke-virtual {v9}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->getTimeRange()I

    .line 79
    .line 80
    .line 81
    move-result v31

    .line 82
    invoke-virtual {v9}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->getStartTime()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v32

    .line 86
    invoke-virtual {v9}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->getEndTime()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v33

    .line 90
    invoke-virtual {v9}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->getTimeRange()I

    .line 91
    .line 92
    .line 93
    move-result v5

    .line 94
    if-ne v5, v6, :cond_2

    .line 95
    .line 96
    invoke-virtual {v9}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->getStartTime()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v5

    .line 100
    if-eqz v5, :cond_2

    .line 101
    .line 102
    invoke-static {v5}, Lkotlin/text/p;->P(Ljava/lang/CharSequence;)Z

    .line 103
    .line 104
    .line 105
    move-result v5

    .line 106
    if-eqz v5, :cond_0

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_0
    invoke-virtual {v9}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->getEndTime()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v5

    .line 113
    if-eqz v5, :cond_2

    .line 114
    .line 115
    invoke-static {v5}, Lkotlin/text/p;->P(Ljava/lang/CharSequence;)Z

    .line 116
    .line 117
    .line 118
    move-result v5

    .line 119
    if-eqz v5, :cond_1

    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_1
    const/16 v34, 0x1

    .line 123
    .line 124
    goto :goto_2

    .line 125
    :cond_2
    :goto_1
    const/16 v34, 0x0

    .line 126
    .line 127
    :goto_2
    invoke-virtual {v9}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->getTopicIds()Ljava/util/ArrayList;

    .line 128
    .line 129
    .line 130
    move-result-object v5

    .line 131
    invoke-static {v5}, Lkotlin/collections/t;->H0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 132
    .line 133
    .line 134
    move-result-object v35

    .line 135
    invoke-virtual {v9}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->getDiff()Ljava/util/ArrayList;

    .line 136
    .line 137
    .line 138
    move-result-object v5

    .line 139
    invoke-static {v5}, Lkotlin/collections/t;->i0(Ljava/util/List;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v5

    .line 143
    move-object/from16 v36, v5

    .line 144
    .line 145
    check-cast v36, Ljava/lang/Integer;

    .line 146
    .line 147
    invoke-virtual {v9}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->getAttainedLevel()Ljava/util/ArrayList;

    .line 148
    .line 149
    .line 150
    move-result-object v5

    .line 151
    invoke-static {v5}, Lkotlin/collections/t;->i0(Ljava/util/List;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v5

    .line 155
    move-object/from16 v37, v5

    .line 156
    .line 157
    check-cast v37, Ljava/lang/Integer;

    .line 158
    .line 159
    invoke-virtual {v9}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->getErrorReason()Ljava/util/ArrayList;

    .line 160
    .line 161
    .line 162
    move-result-object v5

    .line 163
    invoke-static {v5}, Lkotlin/collections/t;->i0(Ljava/util/List;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v5

    .line 167
    move-object/from16 v38, v5

    .line 168
    .line 169
    check-cast v38, Ljava/lang/Integer;

    .line 170
    .line 171
    iget v5, v4, Lcom/zykj/mistake/feature/collection/filter/l;->f:I

    .line 172
    .line 173
    iget v6, v4, Lcom/zykj/mistake/feature/collection/filter/l;->g:I

    .line 174
    .line 175
    move/from16 v16, v2

    .line 176
    .line 177
    invoke-virtual {v9}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->getTagIdList()Ljava/util/ArrayList;

    .line 178
    .line 179
    .line 180
    move-result-object v2

    .line 181
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    move-result v41

    .line 185
    invoke-virtual {v9}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->getTagIdList()Ljava/util/ArrayList;

    .line 186
    .line 187
    .line 188
    move-result-object v2

    .line 189
    move/from16 v39, v5

    .line 190
    .line 191
    new-instance v5, Ljava/util/ArrayList;

    .line 192
    .line 193
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 194
    .line 195
    .line 196
    move/from16 v40, v6

    .line 197
    .line 198
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 199
    .line 200
    .line 201
    move-result v6

    .line 202
    move/from16 v23, v7

    .line 203
    .line 204
    const/4 v7, 0x0

    .line 205
    :goto_3
    if-ge v7, v6, :cond_4

    .line 206
    .line 207
    move/from16 p1, v6

    .line 208
    .line 209
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v6

    .line 213
    add-int/lit8 v7, v7, 0x1

    .line 214
    .line 215
    move-object/from16 v17, v6

    .line 216
    .line 217
    check-cast v17, Ljava/lang/Number;

    .line 218
    .line 219
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Number;->intValue()I

    .line 220
    .line 221
    .line 222
    move-result v17

    .line 223
    if-eqz v17, :cond_3

    .line 224
    .line 225
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 226
    .line 227
    .line 228
    :cond_3
    move/from16 v6, p1

    .line 229
    .line 230
    goto :goto_3

    .line 231
    :cond_4
    new-instance v2, Ljava/util/ArrayList;

    .line 232
    .line 233
    const/16 v6, 0xa

    .line 234
    .line 235
    invoke-static {v5, v6}, Lkotlin/collections/u;->p(Ljava/lang/Iterable;I)I

    .line 236
    .line 237
    .line 238
    move-result v7

    .line 239
    invoke-direct {v2, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 243
    .line 244
    .line 245
    move-result v6

    .line 246
    const/4 v7, 0x0

    .line 247
    :goto_4
    if-ge v7, v6, :cond_5

    .line 248
    .line 249
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v17

    .line 253
    add-int/lit8 v7, v7, 0x1

    .line 254
    .line 255
    check-cast v17, Ljava/lang/Number;

    .line 256
    .line 257
    move-object/from16 p1, v5

    .line 258
    .line 259
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Number;->intValue()I

    .line 260
    .line 261
    .line 262
    move-result v5

    .line 263
    move/from16 v17, v6

    .line 264
    .line 265
    int-to-long v5, v5

    .line 266
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 267
    .line 268
    .line 269
    move-result-object v5

    .line 270
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 271
    .line 272
    .line 273
    move-object/from16 v5, p1

    .line 274
    .line 275
    move/from16 v6, v17

    .line 276
    .line 277
    goto :goto_4

    .line 278
    :cond_5
    invoke-static {v2}, Lkotlin/collections/t;->H0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 279
    .line 280
    .line 281
    move-result-object v42

    .line 282
    invoke-virtual {v9}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->getSortType()I

    .line 283
    .line 284
    .line 285
    move-result v2

    .line 286
    const/4 v5, 0x1

    .line 287
    if-ne v2, v5, :cond_6

    .line 288
    .line 289
    sget-object v2, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SortType;->SUBJECT:Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SortType;

    .line 290
    .line 291
    :goto_5
    move-object/from16 v21, v2

    .line 292
    .line 293
    goto :goto_6

    .line 294
    :cond_6
    sget-object v2, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SortType;->TIME:Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SortType;

    .line 295
    .line 296
    goto :goto_5

    .line 297
    :goto_6
    iget-object v2, v4, Lcom/zykj/mistake/feature/collection/filter/l;->i:Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SourceType;

    .line 298
    .line 299
    const v45, 0xfebc0

    .line 300
    .line 301
    .line 302
    const/16 v46, 0x1

    .line 303
    .line 304
    const/16 v17, 0x0

    .line 305
    .line 306
    const/16 v18, 0x0

    .line 307
    .line 308
    const/16 v19, 0x0

    .line 309
    .line 310
    const/16 v20, 0x0

    .line 311
    .line 312
    const/16 v22, 0x0

    .line 313
    .line 314
    const/16 v24, 0x0

    .line 315
    .line 316
    const/16 v25, 0x0

    .line 317
    .line 318
    const/16 v26, 0x0

    .line 319
    .line 320
    const/16 v27, 0x0

    .line 321
    .line 322
    const/16 v28, 0x0

    .line 323
    .line 324
    const/16 v29, 0x0

    .line 325
    .line 326
    const/16 v30, 0x0

    .line 327
    .line 328
    const/16 v43, 0x0

    .line 329
    .line 330
    move-object/from16 v44, v2

    .line 331
    .line 332
    invoke-static/range {v10 .. v46}, Lcom/zykj/mistake/feature/collection/filter/s0;->a(Lcom/zykj/mistake/feature/collection/filter/s0;Ljava/lang/String;Ljava/lang/String;IILcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;ILjava/util/ArrayList;ILjava/util/Set;Ljava/util/Set;Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SortType;ZZZZZZZLjava/util/ArrayList;Ljava/util/ArrayList;ILjava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIZLjava/util/Set;ZLcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SourceType;II)Lcom/zykj/mistake/feature/collection/filter/s0;

    .line 333
    .line 334
    .line 335
    move-result-object v2

    .line 336
    invoke-virtual {v8, v1, v2}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 337
    .line 338
    .line 339
    move-result v1

    .line 340
    if-eqz v1, :cond_7

    .line 341
    .line 342
    invoke-virtual {v0}, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;->d()V

    .line 343
    .line 344
    .line 345
    const/4 v5, 0x1

    .line 346
    invoke-virtual {v0, v9, v5}, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;->e(Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;Z)V

    .line 347
    .line 348
    .line 349
    return-void

    .line 350
    :cond_7
    const/4 v2, 0x0

    .line 351
    const/4 v6, 0x3

    .line 352
    const/4 v7, 0x1

    .line 353
    goto/16 :goto_0

    .line 354
    .line 355
    :cond_8
    sget-object v2, Lcom/zykj/mistake/feature/collection/filter/s;->a:Lcom/zykj/mistake/feature/collection/filter/s;

    .line 356
    .line 357
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 358
    .line 359
    .line 360
    move-result v2

    .line 361
    if-eqz v2, :cond_9

    .line 362
    .line 363
    sget-object v1, Lcom/zykj/mistake/feature/collection/filter/n;->a:Lcom/zykj/mistake/feature/collection/filter/n;

    .line 364
    .line 365
    invoke-virtual {v0, v1}, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;->f(Lcom/zykj/mistake/feature/collection/filter/q;)V

    .line 366
    .line 367
    .line 368
    return-void

    .line 369
    :cond_9
    sget-object v2, Lcom/zykj/mistake/feature/collection/filter/m0;->a:Lcom/zykj/mistake/feature/collection/filter/m0;

    .line 370
    .line 371
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 372
    .line 373
    .line 374
    move-result v2

    .line 375
    if-eqz v2, :cond_c

    .line 376
    .line 377
    :cond_a
    invoke-virtual {v8}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 378
    .line 379
    .line 380
    move-result-object v1

    .line 381
    move-object v9, v1

    .line 382
    check-cast v9, Lcom/zykj/mistake/feature/collection/filter/s0;

    .line 383
    .line 384
    invoke-virtual {v9}, Lcom/zykj/mistake/feature/collection/filter/s0;->c()Z

    .line 385
    .line 386
    .line 387
    move-result v2

    .line 388
    if-eqz v2, :cond_b

    .line 389
    .line 390
    sget-object v2, Lkotlin/collections/EmptySet;->INSTANCE:Lkotlin/collections/EmptySet;

    .line 391
    .line 392
    :goto_7
    move-object/from16 v19, v2

    .line 393
    .line 394
    goto :goto_8

    .line 395
    :cond_b
    iget-object v2, v9, Lcom/zykj/mistake/feature/collection/filter/s0;->i:Ljava/util/Set;

    .line 396
    .line 397
    goto :goto_7

    .line 398
    :goto_8
    const/16 v44, -0x201

    .line 399
    .line 400
    const/16 v45, 0x3

    .line 401
    .line 402
    const/4 v10, 0x0

    .line 403
    const/4 v11, 0x0

    .line 404
    const/4 v12, 0x0

    .line 405
    const/4 v13, 0x0

    .line 406
    const/4 v14, 0x0

    .line 407
    const/4 v15, 0x0

    .line 408
    const/16 v16, 0x0

    .line 409
    .line 410
    const/16 v17, 0x0

    .line 411
    .line 412
    const/16 v18, 0x0

    .line 413
    .line 414
    const/16 v20, 0x0

    .line 415
    .line 416
    const/16 v21, 0x0

    .line 417
    .line 418
    const/16 v22, 0x0

    .line 419
    .line 420
    const/16 v23, 0x0

    .line 421
    .line 422
    const/16 v24, 0x0

    .line 423
    .line 424
    const/16 v25, 0x0

    .line 425
    .line 426
    const/16 v26, 0x0

    .line 427
    .line 428
    const/16 v27, 0x0

    .line 429
    .line 430
    const/16 v28, 0x0

    .line 431
    .line 432
    const/16 v29, 0x0

    .line 433
    .line 434
    const/16 v30, 0x0

    .line 435
    .line 436
    const/16 v31, 0x0

    .line 437
    .line 438
    const/16 v32, 0x0

    .line 439
    .line 440
    const/16 v33, 0x0

    .line 441
    .line 442
    const/16 v34, 0x0

    .line 443
    .line 444
    const/16 v35, 0x0

    .line 445
    .line 446
    const/16 v36, 0x0

    .line 447
    .line 448
    const/16 v37, 0x0

    .line 449
    .line 450
    const/16 v38, 0x0

    .line 451
    .line 452
    const/16 v39, 0x0

    .line 453
    .line 454
    const/16 v40, 0x0

    .line 455
    .line 456
    const/16 v41, 0x0

    .line 457
    .line 458
    const/16 v42, 0x0

    .line 459
    .line 460
    const/16 v43, 0x0

    .line 461
    .line 462
    invoke-static/range {v9 .. v45}, Lcom/zykj/mistake/feature/collection/filter/s0;->a(Lcom/zykj/mistake/feature/collection/filter/s0;Ljava/lang/String;Ljava/lang/String;IILcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;ILjava/util/ArrayList;ILjava/util/Set;Ljava/util/Set;Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SortType;ZZZZZZZLjava/util/ArrayList;Ljava/util/ArrayList;ILjava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIZLjava/util/Set;ZLcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SourceType;II)Lcom/zykj/mistake/feature/collection/filter/s0;

    .line 463
    .line 464
    .line 465
    move-result-object v2

    .line 466
    invoke-virtual {v8, v1, v2}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 467
    .line 468
    .line 469
    move-result v1

    .line 470
    if-eqz v1, :cond_a

    .line 471
    .line 472
    goto/16 :goto_12

    .line 473
    .line 474
    :cond_c
    instance-of v2, v1, Lcom/zykj/mistake/feature/collection/filter/n0;

    .line 475
    .line 476
    if-eqz v2, :cond_12

    .line 477
    .line 478
    :cond_d
    invoke-virtual {v8}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 479
    .line 480
    .line 481
    move-result-object v2

    .line 482
    move-object v9, v2

    .line 483
    check-cast v9, Lcom/zykj/mistake/feature/collection/filter/s0;

    .line 484
    .line 485
    iget-object v3, v9, Lcom/zykj/mistake/feature/collection/filter/s0;->g:Ljava/util/List;

    .line 486
    .line 487
    if-eqz v3, :cond_e

    .line 488
    .line 489
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 490
    .line 491
    .line 492
    move-result v4

    .line 493
    if-eqz v4, :cond_e

    .line 494
    .line 495
    goto :goto_9

    .line 496
    :cond_e
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 497
    .line 498
    .line 499
    move-result-object v3

    .line 500
    :cond_f
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 501
    .line 502
    .line 503
    move-result v4

    .line 504
    if-eqz v4, :cond_10

    .line 505
    .line 506
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 507
    .line 508
    .line 509
    move-result-object v4

    .line 510
    check-cast v4, Lp4/b;

    .line 511
    .line 512
    iget v5, v4, Lp4/b;->c:I

    .line 513
    .line 514
    move-object v6, v1

    .line 515
    check-cast v6, Lcom/zykj/mistake/feature/collection/filter/n0;

    .line 516
    .line 517
    iget v6, v6, Lcom/zykj/mistake/feature/collection/filter/n0;->a:I

    .line 518
    .line 519
    if-ne v5, v6, :cond_f

    .line 520
    .line 521
    iget-boolean v4, v4, Lp4/b;->n:Z

    .line 522
    .line 523
    if-eqz v4, :cond_f

    .line 524
    .line 525
    goto :goto_a

    .line 526
    :cond_10
    :goto_9
    iget-object v3, v9, Lcom/zykj/mistake/feature/collection/filter/s0;->j:Ljava/util/Set;

    .line 527
    .line 528
    check-cast v3, Ljava/lang/Iterable;

    .line 529
    .line 530
    invoke-static {v3}, Lkotlin/collections/t;->G0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 531
    .line 532
    .line 533
    move-result-object v3

    .line 534
    move-object v4, v1

    .line 535
    check-cast v4, Lcom/zykj/mistake/feature/collection/filter/n0;

    .line 536
    .line 537
    iget v4, v4, Lcom/zykj/mistake/feature/collection/filter/n0;->a:I

    .line 538
    .line 539
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 540
    .line 541
    .line 542
    move-result-object v5

    .line 543
    invoke-interface {v3, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 544
    .line 545
    .line 546
    move-result v5

    .line 547
    if-nez v5, :cond_11

    .line 548
    .line 549
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 550
    .line 551
    .line 552
    move-result-object v4

    .line 553
    invoke-interface {v3, v4}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 554
    .line 555
    .line 556
    :cond_11
    const/16 v44, -0x201

    .line 557
    .line 558
    const/16 v45, 0x3

    .line 559
    .line 560
    const/4 v10, 0x0

    .line 561
    const/4 v11, 0x0

    .line 562
    const/4 v12, 0x0

    .line 563
    const/4 v13, 0x0

    .line 564
    const/4 v14, 0x0

    .line 565
    const/4 v15, 0x0

    .line 566
    const/16 v16, 0x0

    .line 567
    .line 568
    const/16 v17, 0x0

    .line 569
    .line 570
    const/16 v18, 0x0

    .line 571
    .line 572
    const/16 v20, 0x0

    .line 573
    .line 574
    const/16 v21, 0x0

    .line 575
    .line 576
    const/16 v22, 0x0

    .line 577
    .line 578
    const/16 v23, 0x0

    .line 579
    .line 580
    const/16 v24, 0x0

    .line 581
    .line 582
    const/16 v25, 0x0

    .line 583
    .line 584
    const/16 v26, 0x0

    .line 585
    .line 586
    const/16 v27, 0x0

    .line 587
    .line 588
    const/16 v28, 0x0

    .line 589
    .line 590
    const/16 v29, 0x0

    .line 591
    .line 592
    const/16 v30, 0x0

    .line 593
    .line 594
    const/16 v31, 0x0

    .line 595
    .line 596
    const/16 v32, 0x0

    .line 597
    .line 598
    const/16 v33, 0x0

    .line 599
    .line 600
    const/16 v34, 0x0

    .line 601
    .line 602
    const/16 v35, 0x0

    .line 603
    .line 604
    const/16 v36, 0x0

    .line 605
    .line 606
    const/16 v37, 0x0

    .line 607
    .line 608
    const/16 v38, 0x0

    .line 609
    .line 610
    const/16 v39, 0x0

    .line 611
    .line 612
    const/16 v40, 0x0

    .line 613
    .line 614
    const/16 v41, 0x0

    .line 615
    .line 616
    const/16 v42, 0x0

    .line 617
    .line 618
    const/16 v43, 0x0

    .line 619
    .line 620
    move-object/from16 v19, v3

    .line 621
    .line 622
    invoke-static/range {v9 .. v45}, Lcom/zykj/mistake/feature/collection/filter/s0;->a(Lcom/zykj/mistake/feature/collection/filter/s0;Ljava/lang/String;Ljava/lang/String;IILcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;ILjava/util/ArrayList;ILjava/util/Set;Ljava/util/Set;Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SortType;ZZZZZZZLjava/util/ArrayList;Ljava/util/ArrayList;ILjava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIZLjava/util/Set;ZLcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SourceType;II)Lcom/zykj/mistake/feature/collection/filter/s0;

    .line 623
    .line 624
    .line 625
    move-result-object v9

    .line 626
    :goto_a
    invoke-virtual {v8, v2, v9}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 627
    .line 628
    .line 629
    move-result v2

    .line 630
    if-eqz v2, :cond_d

    .line 631
    .line 632
    goto/16 :goto_12

    .line 633
    .line 634
    :cond_12
    sget-object v2, Lcom/zykj/mistake/feature/collection/filter/o0;->a:Lcom/zykj/mistake/feature/collection/filter/o0;

    .line 635
    .line 636
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 637
    .line 638
    .line 639
    move-result v2

    .line 640
    if-eqz v2, :cond_17

    .line 641
    .line 642
    invoke-virtual {v8}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 643
    .line 644
    .line 645
    move-result-object v1

    .line 646
    check-cast v1, Lcom/zykj/mistake/feature/collection/filter/s0;

    .line 647
    .line 648
    iget-object v1, v1, Lcom/zykj/mistake/feature/collection/filter/s0;->k:Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SortType;

    .line 649
    .line 650
    sget-object v2, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SortType;->TIME:Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SortType;

    .line 651
    .line 652
    if-ne v1, v2, :cond_13

    .line 653
    .line 654
    sget-object v2, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SortType;->SUBJECT:Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SortType;

    .line 655
    .line 656
    :cond_13
    move-object/from16 v20, v2

    .line 657
    .line 658
    iget-object v1, v0, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;->g:Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;

    .line 659
    .line 660
    sget-object v2, Lcom/zykj/mistake/feature/collection/filter/z0;->a:[I

    .line 661
    .line 662
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Enum;->ordinal()I

    .line 663
    .line 664
    .line 665
    move-result v3

    .line 666
    aget v2, v2, v3

    .line 667
    .line 668
    const/4 v5, 0x1

    .line 669
    if-eq v2, v5, :cond_15

    .line 670
    .line 671
    const/4 v3, 0x2

    .line 672
    if-ne v2, v3, :cond_14

    .line 673
    .line 674
    const/4 v2, 0x1

    .line 675
    goto :goto_b

    .line 676
    :cond_14
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    .line 677
    .line 678
    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 679
    .line 680
    .line 681
    throw v1

    .line 682
    :cond_15
    const/4 v2, 0x0

    .line 683
    :goto_b
    invoke-virtual {v1, v2}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->setSortType(I)V

    .line 684
    .line 685
    .line 686
    :cond_16
    invoke-virtual {v8}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 687
    .line 688
    .line 689
    move-result-object v1

    .line 690
    move-object v9, v1

    .line 691
    check-cast v9, Lcom/zykj/mistake/feature/collection/filter/s0;

    .line 692
    .line 693
    sget-object v19, Lkotlin/collections/EmptySet;->INSTANCE:Lkotlin/collections/EmptySet;

    .line 694
    .line 695
    const/16 v44, -0x601

    .line 696
    .line 697
    const/16 v45, 0x3

    .line 698
    .line 699
    const/4 v10, 0x0

    .line 700
    const/4 v11, 0x0

    .line 701
    const/4 v12, 0x0

    .line 702
    const/4 v13, 0x0

    .line 703
    const/4 v14, 0x0

    .line 704
    const/4 v15, 0x0

    .line 705
    const/16 v16, 0x0

    .line 706
    .line 707
    const/16 v17, 0x0

    .line 708
    .line 709
    const/16 v18, 0x0

    .line 710
    .line 711
    const/16 v21, 0x0

    .line 712
    .line 713
    const/16 v22, 0x0

    .line 714
    .line 715
    const/16 v23, 0x0

    .line 716
    .line 717
    const/16 v24, 0x0

    .line 718
    .line 719
    const/16 v25, 0x0

    .line 720
    .line 721
    const/16 v26, 0x0

    .line 722
    .line 723
    const/16 v27, 0x0

    .line 724
    .line 725
    const/16 v28, 0x0

    .line 726
    .line 727
    const/16 v29, 0x0

    .line 728
    .line 729
    const/16 v30, 0x0

    .line 730
    .line 731
    const/16 v31, 0x0

    .line 732
    .line 733
    const/16 v32, 0x0

    .line 734
    .line 735
    const/16 v33, 0x0

    .line 736
    .line 737
    const/16 v34, 0x0

    .line 738
    .line 739
    const/16 v35, 0x0

    .line 740
    .line 741
    const/16 v36, 0x0

    .line 742
    .line 743
    const/16 v37, 0x0

    .line 744
    .line 745
    const/16 v38, 0x0

    .line 746
    .line 747
    const/16 v39, 0x0

    .line 748
    .line 749
    const/16 v40, 0x0

    .line 750
    .line 751
    const/16 v41, 0x0

    .line 752
    .line 753
    const/16 v42, 0x0

    .line 754
    .line 755
    const/16 v43, 0x0

    .line 756
    .line 757
    invoke-static/range {v9 .. v45}, Lcom/zykj/mistake/feature/collection/filter/s0;->a(Lcom/zykj/mistake/feature/collection/filter/s0;Ljava/lang/String;Ljava/lang/String;IILcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;ILjava/util/ArrayList;ILjava/util/Set;Ljava/util/Set;Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SortType;ZZZZZZZLjava/util/ArrayList;Ljava/util/ArrayList;ILjava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIZLjava/util/Set;ZLcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SourceType;II)Lcom/zykj/mistake/feature/collection/filter/s0;

    .line 758
    .line 759
    .line 760
    move-result-object v2

    .line 761
    invoke-virtual {v8, v1, v2}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 762
    .line 763
    .line 764
    move-result v1

    .line 765
    if-eqz v1, :cond_16

    .line 766
    .line 767
    iget-object v1, v0, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;->g:Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;

    .line 768
    .line 769
    const/4 v5, 0x1

    .line 770
    invoke-virtual {v0, v1, v5}, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;->e(Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;Z)V

    .line 771
    .line 772
    .line 773
    return-void

    .line 774
    :cond_17
    sget-object v2, Lcom/zykj/mistake/feature/collection/filter/b0;->a:Lcom/zykj/mistake/feature/collection/filter/b0;

    .line 775
    .line 776
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 777
    .line 778
    .line 779
    move-result v2

    .line 780
    if-eqz v2, :cond_20

    .line 781
    .line 782
    iget-object v1, v0, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;->g:Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;

    .line 783
    .line 784
    invoke-static {v1}, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;->b(Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;)Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;

    .line 785
    .line 786
    .line 787
    move-result-object v2

    .line 788
    :cond_18
    invoke-virtual {v8}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 789
    .line 790
    .line 791
    move-result-object v1

    .line 792
    move-object v9, v1

    .line 793
    check-cast v9, Lcom/zykj/mistake/feature/collection/filter/s0;

    .line 794
    .line 795
    invoke-virtual {v2}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->getTimeRange()I

    .line 796
    .line 797
    .line 798
    move-result v30

    .line 799
    invoke-virtual {v2}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->getStartTime()Ljava/lang/String;

    .line 800
    .line 801
    .line 802
    move-result-object v31

    .line 803
    invoke-virtual {v2}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->getEndTime()Ljava/lang/String;

    .line 804
    .line 805
    .line 806
    move-result-object v32

    .line 807
    invoke-virtual {v2}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->getTimeRange()I

    .line 808
    .line 809
    .line 810
    move-result v4

    .line 811
    const/4 v5, 0x3

    .line 812
    if-ne v4, v5, :cond_1b

    .line 813
    .line 814
    invoke-virtual {v2}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->getStartTime()Ljava/lang/String;

    .line 815
    .line 816
    .line 817
    move-result-object v4

    .line 818
    if-eqz v4, :cond_1b

    .line 819
    .line 820
    invoke-static {v4}, Lkotlin/text/p;->P(Ljava/lang/CharSequence;)Z

    .line 821
    .line 822
    .line 823
    move-result v4

    .line 824
    if-eqz v4, :cond_19

    .line 825
    .line 826
    goto :goto_c

    .line 827
    :cond_19
    invoke-virtual {v2}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->getEndTime()Ljava/lang/String;

    .line 828
    .line 829
    .line 830
    move-result-object v4

    .line 831
    if-eqz v4, :cond_1b

    .line 832
    .line 833
    invoke-static {v4}, Lkotlin/text/p;->P(Ljava/lang/CharSequence;)Z

    .line 834
    .line 835
    .line 836
    move-result v4

    .line 837
    if-eqz v4, :cond_1a

    .line 838
    .line 839
    goto :goto_c

    .line 840
    :cond_1a
    const/16 v33, 0x1

    .line 841
    .line 842
    goto :goto_d

    .line 843
    :cond_1b
    :goto_c
    const/16 v33, 0x0

    .line 844
    .line 845
    :goto_d
    invoke-virtual {v2}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->getTopicIds()Ljava/util/ArrayList;

    .line 846
    .line 847
    .line 848
    move-result-object v4

    .line 849
    invoke-static {v4}, Lkotlin/collections/t;->H0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 850
    .line 851
    .line 852
    move-result-object v34

    .line 853
    invoke-virtual {v2}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->getDiff()Ljava/util/ArrayList;

    .line 854
    .line 855
    .line 856
    move-result-object v4

    .line 857
    invoke-static {v4}, Lkotlin/collections/t;->i0(Ljava/util/List;)Ljava/lang/Object;

    .line 858
    .line 859
    .line 860
    move-result-object v4

    .line 861
    move-object/from16 v35, v4

    .line 862
    .line 863
    check-cast v35, Ljava/lang/Integer;

    .line 864
    .line 865
    invoke-virtual {v2}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->getAttainedLevel()Ljava/util/ArrayList;

    .line 866
    .line 867
    .line 868
    move-result-object v4

    .line 869
    invoke-static {v4}, Lkotlin/collections/t;->i0(Ljava/util/List;)Ljava/lang/Object;

    .line 870
    .line 871
    .line 872
    move-result-object v4

    .line 873
    move-object/from16 v36, v4

    .line 874
    .line 875
    check-cast v36, Ljava/lang/Integer;

    .line 876
    .line 877
    invoke-virtual {v2}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->getErrorReason()Ljava/util/ArrayList;

    .line 878
    .line 879
    .line 880
    move-result-object v4

    .line 881
    invoke-static {v4}, Lkotlin/collections/t;->i0(Ljava/util/List;)Ljava/lang/Object;

    .line 882
    .line 883
    .line 884
    move-result-object v4

    .line 885
    move-object/from16 v37, v4

    .line 886
    .line 887
    check-cast v37, Ljava/lang/Integer;

    .line 888
    .line 889
    invoke-virtual {v2}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->getCurrentCollectionStatus()I

    .line 890
    .line 891
    .line 892
    move-result v38

    .line 893
    invoke-virtual {v2}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->getOtherCollectionStatus()I

    .line 894
    .line 895
    .line 896
    move-result v39

    .line 897
    invoke-virtual {v2}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->getTagIdList()Ljava/util/ArrayList;

    .line 898
    .line 899
    .line 900
    move-result-object v4

    .line 901
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 902
    .line 903
    .line 904
    move-result v40

    .line 905
    invoke-virtual {v2}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->getTagIdList()Ljava/util/ArrayList;

    .line 906
    .line 907
    .line 908
    move-result-object v4

    .line 909
    new-instance v5, Ljava/util/ArrayList;

    .line 910
    .line 911
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 912
    .line 913
    .line 914
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 915
    .line 916
    .line 917
    move-result v6

    .line 918
    const/4 v7, 0x0

    .line 919
    :cond_1c
    :goto_e
    if-ge v7, v6, :cond_1d

    .line 920
    .line 921
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 922
    .line 923
    .line 924
    move-result-object v10

    .line 925
    add-int/lit8 v7, v7, 0x1

    .line 926
    .line 927
    move-object v11, v10

    .line 928
    check-cast v11, Ljava/lang/Number;

    .line 929
    .line 930
    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    .line 931
    .line 932
    .line 933
    move-result v11

    .line 934
    if-eqz v11, :cond_1c

    .line 935
    .line 936
    invoke-virtual {v5, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 937
    .line 938
    .line 939
    goto :goto_e

    .line 940
    :cond_1d
    new-instance v4, Ljava/util/ArrayList;

    .line 941
    .line 942
    const/16 v6, 0xa

    .line 943
    .line 944
    invoke-static {v5, v6}, Lkotlin/collections/u;->p(Ljava/lang/Iterable;I)I

    .line 945
    .line 946
    .line 947
    move-result v7

    .line 948
    invoke-direct {v4, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 949
    .line 950
    .line 951
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 952
    .line 953
    .line 954
    move-result v7

    .line 955
    const/4 v10, 0x0

    .line 956
    :goto_f
    if-ge v10, v7, :cond_1e

    .line 957
    .line 958
    invoke-virtual {v5, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 959
    .line 960
    .line 961
    move-result-object v11

    .line 962
    add-int/lit8 v10, v10, 0x1

    .line 963
    .line 964
    check-cast v11, Ljava/lang/Number;

    .line 965
    .line 966
    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    .line 967
    .line 968
    .line 969
    move-result v11

    .line 970
    int-to-long v11, v11

    .line 971
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 972
    .line 973
    .line 974
    move-result-object v11

    .line 975
    invoke-virtual {v4, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 976
    .line 977
    .line 978
    goto :goto_f

    .line 979
    :cond_1e
    invoke-static {v4}, Lkotlin/collections/t;->H0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 980
    .line 981
    .line 982
    move-result-object v41

    .line 983
    const v44, 0xfffff

    .line 984
    .line 985
    .line 986
    const/16 v45, 0x3

    .line 987
    .line 988
    const/4 v10, 0x0

    .line 989
    const/4 v11, 0x0

    .line 990
    const/4 v12, 0x0

    .line 991
    const/4 v13, 0x0

    .line 992
    const/4 v14, 0x0

    .line 993
    const/4 v15, 0x0

    .line 994
    const/16 v16, 0x0

    .line 995
    .line 996
    const/16 v17, 0x0

    .line 997
    .line 998
    const/16 v18, 0x0

    .line 999
    .line 1000
    const/16 v19, 0x0

    .line 1001
    .line 1002
    const/16 v20, 0x0

    .line 1003
    .line 1004
    const/16 v21, 0x0

    .line 1005
    .line 1006
    const/16 v22, 0x0

    .line 1007
    .line 1008
    const/16 v23, 0x0

    .line 1009
    .line 1010
    const/16 v24, 0x0

    .line 1011
    .line 1012
    const/16 v25, 0x0

    .line 1013
    .line 1014
    const/16 v26, 0x0

    .line 1015
    .line 1016
    const/16 v27, 0x0

    .line 1017
    .line 1018
    const/16 v28, 0x0

    .line 1019
    .line 1020
    const/16 v29, 0x0

    .line 1021
    .line 1022
    const/16 v42, 0x0

    .line 1023
    .line 1024
    const/16 v43, 0x0

    .line 1025
    .line 1026
    invoke-static/range {v9 .. v45}, Lcom/zykj/mistake/feature/collection/filter/s0;->a(Lcom/zykj/mistake/feature/collection/filter/s0;Ljava/lang/String;Ljava/lang/String;IILcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;ILjava/util/ArrayList;ILjava/util/Set;Ljava/util/Set;Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SortType;ZZZZZZZLjava/util/ArrayList;Ljava/util/ArrayList;ILjava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIZLjava/util/Set;ZLcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SourceType;II)Lcom/zykj/mistake/feature/collection/filter/s0;

    .line 1027
    .line 1028
    .line 1029
    move-result-object v4

    .line 1030
    invoke-virtual {v8, v1, v4}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1031
    .line 1032
    .line 1033
    move-result v1

    .line 1034
    if-eqz v1, :cond_18

    .line 1035
    .line 1036
    :cond_1f
    invoke-virtual {v8}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 1037
    .line 1038
    .line 1039
    move-result-object v1

    .line 1040
    move-object v9, v1

    .line 1041
    check-cast v9, Lcom/zykj/mistake/feature/collection/filter/s0;

    .line 1042
    .line 1043
    const/16 v44, -0x801

    .line 1044
    .line 1045
    const/16 v45, 0x3

    .line 1046
    .line 1047
    const/4 v10, 0x0

    .line 1048
    const/4 v11, 0x0

    .line 1049
    const/4 v12, 0x0

    .line 1050
    const/4 v13, 0x0

    .line 1051
    const/4 v14, 0x0

    .line 1052
    const/4 v15, 0x0

    .line 1053
    const/16 v16, 0x0

    .line 1054
    .line 1055
    const/16 v17, 0x0

    .line 1056
    .line 1057
    const/16 v18, 0x0

    .line 1058
    .line 1059
    const/16 v19, 0x0

    .line 1060
    .line 1061
    const/16 v20, 0x0

    .line 1062
    .line 1063
    const/16 v21, 0x1

    .line 1064
    .line 1065
    const/16 v22, 0x0

    .line 1066
    .line 1067
    const/16 v23, 0x0

    .line 1068
    .line 1069
    const/16 v24, 0x0

    .line 1070
    .line 1071
    const/16 v25, 0x0

    .line 1072
    .line 1073
    const/16 v26, 0x0

    .line 1074
    .line 1075
    const/16 v27, 0x0

    .line 1076
    .line 1077
    const/16 v28, 0x0

    .line 1078
    .line 1079
    const/16 v29, 0x0

    .line 1080
    .line 1081
    const/16 v30, 0x0

    .line 1082
    .line 1083
    const/16 v31, 0x0

    .line 1084
    .line 1085
    const/16 v32, 0x0

    .line 1086
    .line 1087
    const/16 v33, 0x0

    .line 1088
    .line 1089
    const/16 v34, 0x0

    .line 1090
    .line 1091
    const/16 v35, 0x0

    .line 1092
    .line 1093
    const/16 v36, 0x0

    .line 1094
    .line 1095
    const/16 v37, 0x0

    .line 1096
    .line 1097
    const/16 v38, 0x0

    .line 1098
    .line 1099
    const/16 v39, 0x0

    .line 1100
    .line 1101
    const/16 v40, 0x0

    .line 1102
    .line 1103
    const/16 v41, 0x0

    .line 1104
    .line 1105
    const/16 v42, 0x0

    .line 1106
    .line 1107
    const/16 v43, 0x0

    .line 1108
    .line 1109
    invoke-static/range {v9 .. v45}, Lcom/zykj/mistake/feature/collection/filter/s0;->a(Lcom/zykj/mistake/feature/collection/filter/s0;Ljava/lang/String;Ljava/lang/String;IILcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;ILjava/util/ArrayList;ILjava/util/Set;Ljava/util/Set;Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SortType;ZZZZZZZLjava/util/ArrayList;Ljava/util/ArrayList;ILjava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIZLjava/util/Set;ZLcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SourceType;II)Lcom/zykj/mistake/feature/collection/filter/s0;

    .line 1110
    .line 1111
    .line 1112
    move-result-object v2

    .line 1113
    invoke-virtual {v8, v1, v2}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1114
    .line 1115
    .line 1116
    move-result v1

    .line 1117
    if-eqz v1, :cond_1f

    .line 1118
    .line 1119
    invoke-virtual {v0}, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;->d()V

    .line 1120
    .line 1121
    .line 1122
    return-void

    .line 1123
    :cond_20
    sget-object v2, Lcom/zykj/mistake/feature/collection/filter/v;->a:Lcom/zykj/mistake/feature/collection/filter/v;

    .line 1124
    .line 1125
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1126
    .line 1127
    .line 1128
    move-result v2

    .line 1129
    if-eqz v2, :cond_22

    .line 1130
    .line 1131
    :cond_21
    invoke-virtual {v8}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 1132
    .line 1133
    .line 1134
    move-result-object v1

    .line 1135
    move-object v9, v1

    .line 1136
    check-cast v9, Lcom/zykj/mistake/feature/collection/filter/s0;

    .line 1137
    .line 1138
    const/16 v44, -0x801

    .line 1139
    .line 1140
    const/16 v45, 0x3

    .line 1141
    .line 1142
    const/4 v10, 0x0

    .line 1143
    const/4 v11, 0x0

    .line 1144
    const/4 v12, 0x0

    .line 1145
    const/4 v13, 0x0

    .line 1146
    const/4 v14, 0x0

    .line 1147
    const/4 v15, 0x0

    .line 1148
    const/16 v16, 0x0

    .line 1149
    .line 1150
    const/16 v17, 0x0

    .line 1151
    .line 1152
    const/16 v18, 0x0

    .line 1153
    .line 1154
    const/16 v19, 0x0

    .line 1155
    .line 1156
    const/16 v20, 0x0

    .line 1157
    .line 1158
    const/16 v21, 0x0

    .line 1159
    .line 1160
    const/16 v22, 0x0

    .line 1161
    .line 1162
    const/16 v23, 0x0

    .line 1163
    .line 1164
    const/16 v24, 0x0

    .line 1165
    .line 1166
    const/16 v25, 0x0

    .line 1167
    .line 1168
    const/16 v26, 0x0

    .line 1169
    .line 1170
    const/16 v27, 0x0

    .line 1171
    .line 1172
    const/16 v28, 0x0

    .line 1173
    .line 1174
    const/16 v29, 0x0

    .line 1175
    .line 1176
    const/16 v30, 0x0

    .line 1177
    .line 1178
    const/16 v31, 0x0

    .line 1179
    .line 1180
    const/16 v32, 0x0

    .line 1181
    .line 1182
    const/16 v33, 0x0

    .line 1183
    .line 1184
    const/16 v34, 0x0

    .line 1185
    .line 1186
    const/16 v35, 0x0

    .line 1187
    .line 1188
    const/16 v36, 0x0

    .line 1189
    .line 1190
    const/16 v37, 0x0

    .line 1191
    .line 1192
    const/16 v38, 0x0

    .line 1193
    .line 1194
    const/16 v39, 0x0

    .line 1195
    .line 1196
    const/16 v40, 0x0

    .line 1197
    .line 1198
    const/16 v41, 0x0

    .line 1199
    .line 1200
    const/16 v42, 0x0

    .line 1201
    .line 1202
    const/16 v43, 0x0

    .line 1203
    .line 1204
    invoke-static/range {v9 .. v45}, Lcom/zykj/mistake/feature/collection/filter/s0;->a(Lcom/zykj/mistake/feature/collection/filter/s0;Ljava/lang/String;Ljava/lang/String;IILcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;ILjava/util/ArrayList;ILjava/util/Set;Ljava/util/Set;Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SortType;ZZZZZZZLjava/util/ArrayList;Ljava/util/ArrayList;ILjava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIZLjava/util/Set;ZLcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SourceType;II)Lcom/zykj/mistake/feature/collection/filter/s0;

    .line 1205
    .line 1206
    .line 1207
    move-result-object v2

    .line 1208
    invoke-virtual {v8, v1, v2}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1209
    .line 1210
    .line 1211
    move-result v1

    .line 1212
    if-eqz v1, :cond_21

    .line 1213
    .line 1214
    goto/16 :goto_12

    .line 1215
    .line 1216
    :cond_22
    sget-object v2, Lcom/zykj/mistake/feature/collection/filter/e0;->a:Lcom/zykj/mistake/feature/collection/filter/e0;

    .line 1217
    .line 1218
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1219
    .line 1220
    .line 1221
    move-result v2

    .line 1222
    if-eqz v2, :cond_26

    .line 1223
    .line 1224
    invoke-virtual {v8}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 1225
    .line 1226
    .line 1227
    move-result-object v1

    .line 1228
    check-cast v1, Lcom/zykj/mistake/feature/collection/filter/s0;

    .line 1229
    .line 1230
    iget-object v2, v1, Lcom/zykj/mistake/feature/collection/filter/s0;->H:Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SourceType;

    .line 1231
    .line 1232
    sget-object v3, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SourceType;->CREATE_COLLECTION:Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SourceType;

    .line 1233
    .line 1234
    if-eq v2, v3, :cond_24

    .line 1235
    .line 1236
    iget-boolean v1, v1, Lcom/zykj/mistake/feature/collection/filter/s0;->m:Z

    .line 1237
    .line 1238
    if-nez v1, :cond_23

    .line 1239
    .line 1240
    goto :goto_10

    .line 1241
    :cond_23
    const/16 v38, 0x1

    .line 1242
    .line 1243
    goto :goto_11

    .line 1244
    :cond_24
    :goto_10
    const/16 v38, 0x0

    .line 1245
    .line 1246
    :cond_25
    :goto_11
    invoke-virtual {v8}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 1247
    .line 1248
    .line 1249
    move-result-object v1

    .line 1250
    move-object v9, v1

    .line 1251
    check-cast v9, Lcom/zykj/mistake/feature/collection/filter/s0;

    .line 1252
    .line 1253
    sget-object v34, Lkotlin/collections/EmptySet;->INSTANCE:Lkotlin/collections/EmptySet;

    .line 1254
    .line 1255
    const v44, 0xfffff

    .line 1256
    .line 1257
    .line 1258
    const/16 v45, 0x3

    .line 1259
    .line 1260
    const/4 v10, 0x0

    .line 1261
    const/4 v11, 0x0

    .line 1262
    const/4 v12, 0x0

    .line 1263
    const/4 v13, 0x0

    .line 1264
    const/4 v14, 0x0

    .line 1265
    const/4 v15, 0x0

    .line 1266
    const/16 v16, 0x0

    .line 1267
    .line 1268
    const/16 v17, 0x0

    .line 1269
    .line 1270
    const/16 v18, 0x0

    .line 1271
    .line 1272
    const/16 v19, 0x0

    .line 1273
    .line 1274
    const/16 v20, 0x0

    .line 1275
    .line 1276
    const/16 v21, 0x0

    .line 1277
    .line 1278
    const/16 v22, 0x0

    .line 1279
    .line 1280
    const/16 v23, 0x0

    .line 1281
    .line 1282
    const/16 v24, 0x0

    .line 1283
    .line 1284
    const/16 v25, 0x0

    .line 1285
    .line 1286
    const/16 v26, 0x0

    .line 1287
    .line 1288
    const/16 v27, 0x0

    .line 1289
    .line 1290
    const/16 v28, 0x0

    .line 1291
    .line 1292
    const/16 v29, 0x0

    .line 1293
    .line 1294
    const/16 v30, 0x1

    .line 1295
    .line 1296
    const/16 v31, 0x0

    .line 1297
    .line 1298
    const/16 v32, 0x0

    .line 1299
    .line 1300
    const/16 v33, 0x0

    .line 1301
    .line 1302
    const/16 v35, 0x0

    .line 1303
    .line 1304
    const/16 v36, 0x0

    .line 1305
    .line 1306
    const/16 v37, 0x0

    .line 1307
    .line 1308
    const/16 v39, 0x1

    .line 1309
    .line 1310
    const/16 v40, 0x0

    .line 1311
    .line 1312
    const/16 v42, 0x0

    .line 1313
    .line 1314
    const/16 v43, 0x0

    .line 1315
    .line 1316
    move-object/from16 v41, v34

    .line 1317
    .line 1318
    invoke-static/range {v9 .. v45}, Lcom/zykj/mistake/feature/collection/filter/s0;->a(Lcom/zykj/mistake/feature/collection/filter/s0;Ljava/lang/String;Ljava/lang/String;IILcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;ILjava/util/ArrayList;ILjava/util/Set;Ljava/util/Set;Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SortType;ZZZZZZZLjava/util/ArrayList;Ljava/util/ArrayList;ILjava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIZLjava/util/Set;ZLcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SourceType;II)Lcom/zykj/mistake/feature/collection/filter/s0;

    .line 1319
    .line 1320
    .line 1321
    move-result-object v2

    .line 1322
    invoke-virtual {v8, v1, v2}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1323
    .line 1324
    .line 1325
    move-result v1

    .line 1326
    if-eqz v1, :cond_25

    .line 1327
    .line 1328
    goto/16 :goto_12

    .line 1329
    .line 1330
    :cond_26
    sget-object v2, Lcom/zykj/mistake/feature/collection/filter/x;->a:Lcom/zykj/mistake/feature/collection/filter/x;

    .line 1331
    .line 1332
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1333
    .line 1334
    .line 1335
    move-result v2

    .line 1336
    if-eqz v2, :cond_27

    .line 1337
    .line 1338
    invoke-virtual {v0}, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;->a()V

    .line 1339
    .line 1340
    .line 1341
    return-void

    .line 1342
    :cond_27
    instance-of v2, v1, Lcom/zykj/mistake/feature/collection/filter/w;

    .line 1343
    .line 1344
    if-eqz v2, :cond_29

    .line 1345
    .line 1346
    :cond_28
    invoke-virtual {v8}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 1347
    .line 1348
    .line 1349
    move-result-object v2

    .line 1350
    move-object v9, v2

    .line 1351
    check-cast v9, Lcom/zykj/mistake/feature/collection/filter/s0;

    .line 1352
    .line 1353
    move-object v3, v1

    .line 1354
    check-cast v3, Lcom/zykj/mistake/feature/collection/filter/w;

    .line 1355
    .line 1356
    iget-object v4, v3, Lcom/zykj/mistake/feature/collection/filter/w;->a:Ljava/lang/String;

    .line 1357
    .line 1358
    iget-object v3, v3, Lcom/zykj/mistake/feature/collection/filter/w;->b:Ljava/lang/String;

    .line 1359
    .line 1360
    const v44, -0xf00001

    .line 1361
    .line 1362
    .line 1363
    const/16 v45, 0x3

    .line 1364
    .line 1365
    const/4 v10, 0x0

    .line 1366
    const/4 v11, 0x0

    .line 1367
    const/4 v12, 0x0

    .line 1368
    const/4 v13, 0x0

    .line 1369
    const/4 v14, 0x0

    .line 1370
    const/4 v15, 0x0

    .line 1371
    const/16 v16, 0x0

    .line 1372
    .line 1373
    const/16 v17, 0x0

    .line 1374
    .line 1375
    const/16 v18, 0x0

    .line 1376
    .line 1377
    const/16 v19, 0x0

    .line 1378
    .line 1379
    const/16 v20, 0x0

    .line 1380
    .line 1381
    const/16 v21, 0x0

    .line 1382
    .line 1383
    const/16 v22, 0x0

    .line 1384
    .line 1385
    const/16 v23, 0x0

    .line 1386
    .line 1387
    const/16 v24, 0x0

    .line 1388
    .line 1389
    const/16 v25, 0x0

    .line 1390
    .line 1391
    const/16 v26, 0x0

    .line 1392
    .line 1393
    const/16 v27, 0x0

    .line 1394
    .line 1395
    const/16 v28, 0x0

    .line 1396
    .line 1397
    const/16 v29, 0x0

    .line 1398
    .line 1399
    const/16 v30, 0x3

    .line 1400
    .line 1401
    const/16 v33, 0x1

    .line 1402
    .line 1403
    const/16 v34, 0x0

    .line 1404
    .line 1405
    const/16 v35, 0x0

    .line 1406
    .line 1407
    const/16 v36, 0x0

    .line 1408
    .line 1409
    const/16 v37, 0x0

    .line 1410
    .line 1411
    const/16 v38, 0x0

    .line 1412
    .line 1413
    const/16 v39, 0x0

    .line 1414
    .line 1415
    const/16 v40, 0x0

    .line 1416
    .line 1417
    const/16 v41, 0x0

    .line 1418
    .line 1419
    const/16 v42, 0x0

    .line 1420
    .line 1421
    const/16 v43, 0x0

    .line 1422
    .line 1423
    move-object/from16 v32, v3

    .line 1424
    .line 1425
    move-object/from16 v31, v4

    .line 1426
    .line 1427
    invoke-static/range {v9 .. v45}, Lcom/zykj/mistake/feature/collection/filter/s0;->a(Lcom/zykj/mistake/feature/collection/filter/s0;Ljava/lang/String;Ljava/lang/String;IILcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;ILjava/util/ArrayList;ILjava/util/Set;Ljava/util/Set;Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SortType;ZZZZZZZLjava/util/ArrayList;Ljava/util/ArrayList;ILjava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIZLjava/util/Set;ZLcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SourceType;II)Lcom/zykj/mistake/feature/collection/filter/s0;

    .line 1428
    .line 1429
    .line 1430
    move-result-object v3

    .line 1431
    invoke-virtual {v8, v2, v3}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1432
    .line 1433
    .line 1434
    move-result v2

    .line 1435
    if-eqz v2, :cond_28

    .line 1436
    .line 1437
    goto/16 :goto_12

    .line 1438
    .line 1439
    :cond_29
    sget-object v2, Lcom/zykj/mistake/feature/collection/filter/d0;->a:Lcom/zykj/mistake/feature/collection/filter/d0;

    .line 1440
    .line 1441
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1442
    .line 1443
    .line 1444
    move-result v2

    .line 1445
    if-eqz v2, :cond_2b

    .line 1446
    .line 1447
    :cond_2a
    invoke-virtual {v8}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 1448
    .line 1449
    .line 1450
    move-result-object v1

    .line 1451
    move-object v9, v1

    .line 1452
    check-cast v9, Lcom/zykj/mistake/feature/collection/filter/s0;

    .line 1453
    .line 1454
    const v44, -0xf00001

    .line 1455
    .line 1456
    .line 1457
    const/16 v45, 0x3

    .line 1458
    .line 1459
    const/4 v10, 0x0

    .line 1460
    const/4 v11, 0x0

    .line 1461
    const/4 v12, 0x0

    .line 1462
    const/4 v13, 0x0

    .line 1463
    const/4 v14, 0x0

    .line 1464
    const/4 v15, 0x0

    .line 1465
    const/16 v16, 0x0

    .line 1466
    .line 1467
    const/16 v17, 0x0

    .line 1468
    .line 1469
    const/16 v18, 0x0

    .line 1470
    .line 1471
    const/16 v19, 0x0

    .line 1472
    .line 1473
    const/16 v20, 0x0

    .line 1474
    .line 1475
    const/16 v21, 0x0

    .line 1476
    .line 1477
    const/16 v22, 0x0

    .line 1478
    .line 1479
    const/16 v23, 0x0

    .line 1480
    .line 1481
    const/16 v24, 0x0

    .line 1482
    .line 1483
    const/16 v25, 0x0

    .line 1484
    .line 1485
    const/16 v26, 0x0

    .line 1486
    .line 1487
    const/16 v27, 0x0

    .line 1488
    .line 1489
    const/16 v28, 0x0

    .line 1490
    .line 1491
    const/16 v29, 0x0

    .line 1492
    .line 1493
    const/16 v30, 0x1

    .line 1494
    .line 1495
    const/16 v31, 0x0

    .line 1496
    .line 1497
    const/16 v32, 0x0

    .line 1498
    .line 1499
    const/16 v33, 0x0

    .line 1500
    .line 1501
    const/16 v34, 0x0

    .line 1502
    .line 1503
    const/16 v35, 0x0

    .line 1504
    .line 1505
    const/16 v36, 0x0

    .line 1506
    .line 1507
    const/16 v37, 0x0

    .line 1508
    .line 1509
    const/16 v38, 0x0

    .line 1510
    .line 1511
    const/16 v39, 0x0

    .line 1512
    .line 1513
    const/16 v40, 0x0

    .line 1514
    .line 1515
    const/16 v41, 0x0

    .line 1516
    .line 1517
    const/16 v42, 0x0

    .line 1518
    .line 1519
    const/16 v43, 0x0

    .line 1520
    .line 1521
    invoke-static/range {v9 .. v45}, Lcom/zykj/mistake/feature/collection/filter/s0;->a(Lcom/zykj/mistake/feature/collection/filter/s0;Ljava/lang/String;Ljava/lang/String;IILcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;ILjava/util/ArrayList;ILjava/util/Set;Ljava/util/Set;Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SortType;ZZZZZZZLjava/util/ArrayList;Ljava/util/ArrayList;ILjava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIZLjava/util/Set;ZLcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SourceType;II)Lcom/zykj/mistake/feature/collection/filter/s0;

    .line 1522
    .line 1523
    .line 1524
    move-result-object v2

    .line 1525
    invoke-virtual {v8, v1, v2}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1526
    .line 1527
    .line 1528
    move-result v1

    .line 1529
    if-eqz v1, :cond_2a

    .line 1530
    .line 1531
    goto/16 :goto_12

    .line 1532
    .line 1533
    :cond_2b
    sget-object v2, Lcom/zykj/mistake/feature/collection/filter/c0;->a:Lcom/zykj/mistake/feature/collection/filter/c0;

    .line 1534
    .line 1535
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1536
    .line 1537
    .line 1538
    move-result v2

    .line 1539
    if-eqz v2, :cond_2c

    .line 1540
    .line 1541
    iget-object v1, v0, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;->g:Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;

    .line 1542
    .line 1543
    const/4 v5, 0x1

    .line 1544
    invoke-virtual {v0, v1, v5}, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;->e(Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;Z)V

    .line 1545
    .line 1546
    .line 1547
    return-void

    .line 1548
    :cond_2c
    sget-object v2, Lcom/zykj/mistake/feature/collection/filter/a0;->a:Lcom/zykj/mistake/feature/collection/filter/a0;

    .line 1549
    .line 1550
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1551
    .line 1552
    .line 1553
    move-result v2

    .line 1554
    if-eqz v2, :cond_2e

    .line 1555
    .line 1556
    invoke-virtual {v8}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 1557
    .line 1558
    .line 1559
    move-result-object v1

    .line 1560
    check-cast v1, Lcom/zykj/mistake/feature/collection/filter/s0;

    .line 1561
    .line 1562
    iget-boolean v2, v1, Lcom/zykj/mistake/feature/collection/filter/s0;->p:Z

    .line 1563
    .line 1564
    if-eqz v2, :cond_4e

    .line 1565
    .line 1566
    iget-boolean v2, v1, Lcom/zykj/mistake/feature/collection/filter/s0;->o:Z

    .line 1567
    .line 1568
    if-nez v2, :cond_4e

    .line 1569
    .line 1570
    iget-object v1, v1, Lcom/zykj/mistake/feature/collection/filter/s0;->g:Ljava/util/List;

    .line 1571
    .line 1572
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 1573
    .line 1574
    .line 1575
    move-result v1

    .line 1576
    if-eqz v1, :cond_2d

    .line 1577
    .line 1578
    goto/16 :goto_12

    .line 1579
    .line 1580
    :cond_2d
    iget-object v1, v0, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;->g:Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;

    .line 1581
    .line 1582
    const/4 v2, 0x0

    .line 1583
    invoke-virtual {v0, v1, v2}, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;->e(Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;Z)V

    .line 1584
    .line 1585
    .line 1586
    return-void

    .line 1587
    :cond_2e
    sget-object v2, Lcom/zykj/mistake/feature/collection/filter/r;->a:Lcom/zykj/mistake/feature/collection/filter/r;

    .line 1588
    .line 1589
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1590
    .line 1591
    .line 1592
    move-result v2

    .line 1593
    if-eqz v2, :cond_34

    .line 1594
    .line 1595
    invoke-virtual {v8}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 1596
    .line 1597
    .line 1598
    move-result-object v1

    .line 1599
    check-cast v1, Lcom/zykj/mistake/feature/collection/filter/s0;

    .line 1600
    .line 1601
    invoke-virtual {v1}, Lcom/zykj/mistake/feature/collection/filter/s0;->b()Z

    .line 1602
    .line 1603
    .line 1604
    move-result v2

    .line 1605
    if-nez v2, :cond_2f

    .line 1606
    .line 1607
    goto/16 :goto_12

    .line 1608
    .line 1609
    :cond_2f
    iget v2, v1, Lcom/zykj/mistake/feature/collection/filter/s0;->c:I

    .line 1610
    .line 1611
    iget-object v3, v1, Lcom/zykj/mistake/feature/collection/filter/s0;->j:Ljava/util/Set;

    .line 1612
    .line 1613
    invoke-interface {v3}, Ljava/util/Set;->size()I

    .line 1614
    .line 1615
    .line 1616
    move-result v3

    .line 1617
    add-int/2addr v3, v2

    .line 1618
    iget v1, v1, Lcom/zykj/mistake/feature/collection/filter/s0;->d:I

    .line 1619
    .line 1620
    if-le v3, v1, :cond_31

    .line 1621
    .line 1622
    :cond_30
    invoke-virtual {v8}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 1623
    .line 1624
    .line 1625
    move-result-object v1

    .line 1626
    move-object v9, v1

    .line 1627
    check-cast v9, Lcom/zykj/mistake/feature/collection/filter/s0;

    .line 1628
    .line 1629
    const/16 v44, -0x1

    .line 1630
    .line 1631
    const/16 v45, 0x2

    .line 1632
    .line 1633
    const/4 v10, 0x0

    .line 1634
    const/4 v11, 0x0

    .line 1635
    const/4 v12, 0x0

    .line 1636
    const/4 v13, 0x0

    .line 1637
    const/4 v14, 0x0

    .line 1638
    const/4 v15, 0x0

    .line 1639
    const/16 v16, 0x0

    .line 1640
    .line 1641
    const/16 v17, 0x0

    .line 1642
    .line 1643
    const/16 v18, 0x0

    .line 1644
    .line 1645
    const/16 v19, 0x0

    .line 1646
    .line 1647
    const/16 v20, 0x0

    .line 1648
    .line 1649
    const/16 v21, 0x0

    .line 1650
    .line 1651
    const/16 v22, 0x0

    .line 1652
    .line 1653
    const/16 v23, 0x0

    .line 1654
    .line 1655
    const/16 v24, 0x0

    .line 1656
    .line 1657
    const/16 v25, 0x0

    .line 1658
    .line 1659
    const/16 v26, 0x0

    .line 1660
    .line 1661
    const/16 v27, 0x0

    .line 1662
    .line 1663
    const/16 v28, 0x0

    .line 1664
    .line 1665
    const/16 v29, 0x0

    .line 1666
    .line 1667
    const/16 v30, 0x0

    .line 1668
    .line 1669
    const/16 v31, 0x0

    .line 1670
    .line 1671
    const/16 v32, 0x0

    .line 1672
    .line 1673
    const/16 v33, 0x0

    .line 1674
    .line 1675
    const/16 v34, 0x0

    .line 1676
    .line 1677
    const/16 v35, 0x0

    .line 1678
    .line 1679
    const/16 v36, 0x0

    .line 1680
    .line 1681
    const/16 v37, 0x0

    .line 1682
    .line 1683
    const/16 v38, 0x0

    .line 1684
    .line 1685
    const/16 v39, 0x0

    .line 1686
    .line 1687
    const/16 v40, 0x0

    .line 1688
    .line 1689
    const/16 v41, 0x0

    .line 1690
    .line 1691
    const/16 v42, 0x1

    .line 1692
    .line 1693
    const/16 v43, 0x0

    .line 1694
    .line 1695
    invoke-static/range {v9 .. v45}, Lcom/zykj/mistake/feature/collection/filter/s0;->a(Lcom/zykj/mistake/feature/collection/filter/s0;Ljava/lang/String;Ljava/lang/String;IILcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;ILjava/util/ArrayList;ILjava/util/Set;Ljava/util/Set;Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SortType;ZZZZZZZLjava/util/ArrayList;Ljava/util/ArrayList;ILjava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIZLjava/util/Set;ZLcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SourceType;II)Lcom/zykj/mistake/feature/collection/filter/s0;

    .line 1696
    .line 1697
    .line 1698
    move-result-object v2

    .line 1699
    invoke-virtual {v8, v1, v2}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1700
    .line 1701
    .line 1702
    move-result v1

    .line 1703
    if-eqz v1, :cond_30

    .line 1704
    .line 1705
    goto/16 :goto_12

    .line 1706
    .line 1707
    :cond_31
    invoke-virtual {v8}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 1708
    .line 1709
    .line 1710
    move-result-object v1

    .line 1711
    check-cast v1, Lcom/zykj/mistake/feature/collection/filter/s0;

    .line 1712
    .line 1713
    iget-object v2, v1, Lcom/zykj/mistake/feature/collection/filter/s0;->a:Ljava/lang/String;

    .line 1714
    .line 1715
    invoke-static {v2}, Lkotlin/text/w;->D(Ljava/lang/String;)Ljava/lang/Integer;

    .line 1716
    .line 1717
    .line 1718
    move-result-object v2

    .line 1719
    if-nez v2, :cond_32

    .line 1720
    .line 1721
    new-instance v1, Lcom/zykj/mistake/feature/collection/filter/p;

    .line 1722
    .line 1723
    const-string v2, "\u9519\u9898\u96c6\u4fe1\u606f\u5f02\u5e38"

    .line 1724
    .line 1725
    invoke-direct {v1, v2}, Lcom/zykj/mistake/feature/collection/filter/p;-><init>(Ljava/lang/String;)V

    .line 1726
    .line 1727
    .line 1728
    invoke-virtual {v0, v1}, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;->f(Lcom/zykj/mistake/feature/collection/filter/q;)V

    .line 1729
    .line 1730
    .line 1731
    return-void

    .line 1732
    :cond_32
    iget-object v1, v1, Lcom/zykj/mistake/feature/collection/filter/s0;->j:Ljava/util/Set;

    .line 1733
    .line 1734
    check-cast v1, Ljava/lang/Iterable;

    .line 1735
    .line 1736
    invoke-static {v1}, Lkotlin/collections/t;->D0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 1737
    .line 1738
    .line 1739
    move-result-object v3

    .line 1740
    :cond_33
    invoke-virtual {v8}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 1741
    .line 1742
    .line 1743
    move-result-object v1

    .line 1744
    move-object v9, v1

    .line 1745
    check-cast v9, Lcom/zykj/mistake/feature/collection/filter/s0;

    .line 1746
    .line 1747
    const v44, -0x20001

    .line 1748
    .line 1749
    .line 1750
    const/16 v45, 0x3

    .line 1751
    .line 1752
    const/4 v10, 0x0

    .line 1753
    const/4 v11, 0x0

    .line 1754
    const/4 v12, 0x0

    .line 1755
    const/4 v13, 0x0

    .line 1756
    const/4 v14, 0x0

    .line 1757
    const/4 v15, 0x0

    .line 1758
    const/16 v16, 0x0

    .line 1759
    .line 1760
    const/16 v17, 0x0

    .line 1761
    .line 1762
    const/16 v18, 0x0

    .line 1763
    .line 1764
    const/16 v19, 0x0

    .line 1765
    .line 1766
    const/16 v20, 0x0

    .line 1767
    .line 1768
    const/16 v21, 0x0

    .line 1769
    .line 1770
    const/16 v22, 0x0

    .line 1771
    .line 1772
    const/16 v23, 0x0

    .line 1773
    .line 1774
    const/16 v24, 0x0

    .line 1775
    .line 1776
    const/16 v25, 0x0

    .line 1777
    .line 1778
    const/16 v26, 0x0

    .line 1779
    .line 1780
    const/16 v27, 0x1

    .line 1781
    .line 1782
    const/16 v28, 0x0

    .line 1783
    .line 1784
    const/16 v29, 0x0

    .line 1785
    .line 1786
    const/16 v30, 0x0

    .line 1787
    .line 1788
    const/16 v31, 0x0

    .line 1789
    .line 1790
    const/16 v32, 0x0

    .line 1791
    .line 1792
    const/16 v33, 0x0

    .line 1793
    .line 1794
    const/16 v34, 0x0

    .line 1795
    .line 1796
    const/16 v35, 0x0

    .line 1797
    .line 1798
    const/16 v36, 0x0

    .line 1799
    .line 1800
    const/16 v37, 0x0

    .line 1801
    .line 1802
    const/16 v38, 0x0

    .line 1803
    .line 1804
    const/16 v39, 0x0

    .line 1805
    .line 1806
    const/16 v40, 0x0

    .line 1807
    .line 1808
    const/16 v41, 0x0

    .line 1809
    .line 1810
    const/16 v42, 0x0

    .line 1811
    .line 1812
    const/16 v43, 0x0

    .line 1813
    .line 1814
    invoke-static/range {v9 .. v45}, Lcom/zykj/mistake/feature/collection/filter/s0;->a(Lcom/zykj/mistake/feature/collection/filter/s0;Ljava/lang/String;Ljava/lang/String;IILcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;ILjava/util/ArrayList;ILjava/util/Set;Ljava/util/Set;Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SortType;ZZZZZZZLjava/util/ArrayList;Ljava/util/ArrayList;ILjava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIZLjava/util/Set;ZLcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SourceType;II)Lcom/zykj/mistake/feature/collection/filter/s0;

    .line 1815
    .line 1816
    .line 1817
    move-result-object v4

    .line 1818
    invoke-virtual {v8, v1, v4}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1819
    .line 1820
    .line 1821
    move-result v1

    .line 1822
    if-eqz v1, :cond_33

    .line 1823
    .line 1824
    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/v;

    .line 1825
    .line 1826
    .line 1827
    move-result-object v1

    .line 1828
    new-instance v4, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel$addToCollection$2;

    .line 1829
    .line 1830
    const/4 v5, 0x0

    .line 1831
    invoke-direct {v4, v0, v2, v3, v5}, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel$addToCollection$2;-><init>(Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;Ljava/lang/Integer;Ljava/util/List;Lh6/c;)V

    .line 1832
    .line 1833
    .line 1834
    const/4 v2, 0x3

    .line 1835
    invoke-static {v1, v5, v5, v4, v2}, Lkotlinx/coroutines/x;->v(Lkotlinx/coroutines/v;Lh6/h;Lkotlinx/coroutines/CoroutineStart;Lr6/e;I)Lkotlinx/coroutines/k1;

    .line 1836
    .line 1837
    .line 1838
    return-void

    .line 1839
    :cond_34
    sget-object v2, Lcom/zykj/mistake/feature/collection/filter/y;->a:Lcom/zykj/mistake/feature/collection/filter/y;

    .line 1840
    .line 1841
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1842
    .line 1843
    .line 1844
    move-result v2

    .line 1845
    if-eqz v2, :cond_36

    .line 1846
    .line 1847
    :cond_35
    invoke-virtual {v8}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 1848
    .line 1849
    .line 1850
    move-result-object v1

    .line 1851
    move-object v9, v1

    .line 1852
    check-cast v9, Lcom/zykj/mistake/feature/collection/filter/s0;

    .line 1853
    .line 1854
    const/16 v44, -0x1

    .line 1855
    .line 1856
    const/16 v45, 0x2

    .line 1857
    .line 1858
    const/4 v10, 0x0

    .line 1859
    const/4 v11, 0x0

    .line 1860
    const/4 v12, 0x0

    .line 1861
    const/4 v13, 0x0

    .line 1862
    const/4 v14, 0x0

    .line 1863
    const/4 v15, 0x0

    .line 1864
    const/16 v16, 0x0

    .line 1865
    .line 1866
    const/16 v17, 0x0

    .line 1867
    .line 1868
    const/16 v18, 0x0

    .line 1869
    .line 1870
    const/16 v19, 0x0

    .line 1871
    .line 1872
    const/16 v20, 0x0

    .line 1873
    .line 1874
    const/16 v21, 0x0

    .line 1875
    .line 1876
    const/16 v22, 0x0

    .line 1877
    .line 1878
    const/16 v23, 0x0

    .line 1879
    .line 1880
    const/16 v24, 0x0

    .line 1881
    .line 1882
    const/16 v25, 0x0

    .line 1883
    .line 1884
    const/16 v26, 0x0

    .line 1885
    .line 1886
    const/16 v27, 0x0

    .line 1887
    .line 1888
    const/16 v28, 0x0

    .line 1889
    .line 1890
    const/16 v29, 0x0

    .line 1891
    .line 1892
    const/16 v30, 0x0

    .line 1893
    .line 1894
    const/16 v31, 0x0

    .line 1895
    .line 1896
    const/16 v32, 0x0

    .line 1897
    .line 1898
    const/16 v33, 0x0

    .line 1899
    .line 1900
    const/16 v34, 0x0

    .line 1901
    .line 1902
    const/16 v35, 0x0

    .line 1903
    .line 1904
    const/16 v36, 0x0

    .line 1905
    .line 1906
    const/16 v37, 0x0

    .line 1907
    .line 1908
    const/16 v38, 0x0

    .line 1909
    .line 1910
    const/16 v39, 0x0

    .line 1911
    .line 1912
    const/16 v40, 0x0

    .line 1913
    .line 1914
    const/16 v41, 0x0

    .line 1915
    .line 1916
    const/16 v42, 0x0

    .line 1917
    .line 1918
    const/16 v43, 0x0

    .line 1919
    .line 1920
    invoke-static/range {v9 .. v45}, Lcom/zykj/mistake/feature/collection/filter/s0;->a(Lcom/zykj/mistake/feature/collection/filter/s0;Ljava/lang/String;Ljava/lang/String;IILcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;ILjava/util/ArrayList;ILjava/util/Set;Ljava/util/Set;Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SortType;ZZZZZZZLjava/util/ArrayList;Ljava/util/ArrayList;ILjava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIZLjava/util/Set;ZLcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SourceType;II)Lcom/zykj/mistake/feature/collection/filter/s0;

    .line 1921
    .line 1922
    .line 1923
    move-result-object v2

    .line 1924
    invoke-virtual {v8, v1, v2}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1925
    .line 1926
    .line 1927
    move-result v1

    .line 1928
    if-eqz v1, :cond_35

    .line 1929
    .line 1930
    goto/16 :goto_12

    .line 1931
    .line 1932
    :cond_36
    instance-of v2, v1, Lcom/zykj/mistake/feature/collection/filter/l0;

    .line 1933
    .line 1934
    if-eqz v2, :cond_38

    .line 1935
    .line 1936
    move-object v2, v1

    .line 1937
    check-cast v2, Lcom/zykj/mistake/feature/collection/filter/l0;

    .line 1938
    .line 1939
    iget v1, v2, Lcom/zykj/mistake/feature/collection/filter/l0;->a:I

    .line 1940
    .line 1941
    const/4 v5, 0x3

    .line 1942
    if-ne v1, v5, :cond_37

    .line 1943
    .line 1944
    new-instance v1, Lcom/zykj/mistake/feature/collection/filter/o;

    .line 1945
    .line 1946
    invoke-virtual {v8}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 1947
    .line 1948
    .line 1949
    move-result-object v2

    .line 1950
    check-cast v2, Lcom/zykj/mistake/feature/collection/filter/s0;

    .line 1951
    .line 1952
    iget-object v2, v2, Lcom/zykj/mistake/feature/collection/filter/s0;->v:Ljava/lang/String;

    .line 1953
    .line 1954
    invoke-virtual {v8}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 1955
    .line 1956
    .line 1957
    move-result-object v3

    .line 1958
    check-cast v3, Lcom/zykj/mistake/feature/collection/filter/s0;

    .line 1959
    .line 1960
    iget-object v3, v3, Lcom/zykj/mistake/feature/collection/filter/s0;->w:Ljava/lang/String;

    .line 1961
    .line 1962
    invoke-direct {v1, v2, v3}, Lcom/zykj/mistake/feature/collection/filter/o;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 1963
    .line 1964
    .line 1965
    invoke-virtual {v0, v1}, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;->f(Lcom/zykj/mistake/feature/collection/filter/q;)V

    .line 1966
    .line 1967
    .line 1968
    return-void

    .line 1969
    :cond_37
    invoke-virtual {v8}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 1970
    .line 1971
    .line 1972
    move-result-object v1

    .line 1973
    move-object v9, v1

    .line 1974
    check-cast v9, Lcom/zykj/mistake/feature/collection/filter/s0;

    .line 1975
    .line 1976
    iget v3, v2, Lcom/zykj/mistake/feature/collection/filter/l0;->a:I

    .line 1977
    .line 1978
    const v44, -0x100001

    .line 1979
    .line 1980
    .line 1981
    const/16 v45, 0x3

    .line 1982
    .line 1983
    const/4 v10, 0x0

    .line 1984
    const/4 v11, 0x0

    .line 1985
    const/4 v12, 0x0

    .line 1986
    const/4 v13, 0x0

    .line 1987
    const/4 v14, 0x0

    .line 1988
    const/4 v15, 0x0

    .line 1989
    const/16 v16, 0x0

    .line 1990
    .line 1991
    const/16 v17, 0x0

    .line 1992
    .line 1993
    const/16 v18, 0x0

    .line 1994
    .line 1995
    const/16 v19, 0x0

    .line 1996
    .line 1997
    const/16 v20, 0x0

    .line 1998
    .line 1999
    const/16 v21, 0x0

    .line 2000
    .line 2001
    const/16 v22, 0x0

    .line 2002
    .line 2003
    const/16 v23, 0x0

    .line 2004
    .line 2005
    const/16 v24, 0x0

    .line 2006
    .line 2007
    const/16 v25, 0x0

    .line 2008
    .line 2009
    const/16 v26, 0x0

    .line 2010
    .line 2011
    const/16 v27, 0x0

    .line 2012
    .line 2013
    const/16 v28, 0x0

    .line 2014
    .line 2015
    const/16 v29, 0x0

    .line 2016
    .line 2017
    const/16 v31, 0x0

    .line 2018
    .line 2019
    const/16 v32, 0x0

    .line 2020
    .line 2021
    const/16 v33, 0x0

    .line 2022
    .line 2023
    const/16 v34, 0x0

    .line 2024
    .line 2025
    const/16 v35, 0x0

    .line 2026
    .line 2027
    const/16 v36, 0x0

    .line 2028
    .line 2029
    const/16 v37, 0x0

    .line 2030
    .line 2031
    const/16 v38, 0x0

    .line 2032
    .line 2033
    const/16 v39, 0x0

    .line 2034
    .line 2035
    const/16 v40, 0x0

    .line 2036
    .line 2037
    const/16 v41, 0x0

    .line 2038
    .line 2039
    const/16 v42, 0x0

    .line 2040
    .line 2041
    const/16 v43, 0x0

    .line 2042
    .line 2043
    move/from16 v30, v3

    .line 2044
    .line 2045
    invoke-static/range {v9 .. v45}, Lcom/zykj/mistake/feature/collection/filter/s0;->a(Lcom/zykj/mistake/feature/collection/filter/s0;Ljava/lang/String;Ljava/lang/String;IILcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;ILjava/util/ArrayList;ILjava/util/Set;Ljava/util/Set;Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SortType;ZZZZZZZLjava/util/ArrayList;Ljava/util/ArrayList;ILjava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIZLjava/util/Set;ZLcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SourceType;II)Lcom/zykj/mistake/feature/collection/filter/s0;

    .line 2046
    .line 2047
    .line 2048
    move-result-object v3

    .line 2049
    invoke-virtual {v8, v1, v3}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2050
    .line 2051
    .line 2052
    move-result v1

    .line 2053
    if-eqz v1, :cond_37

    .line 2054
    .line 2055
    goto/16 :goto_12

    .line 2056
    .line 2057
    :cond_38
    sget-object v2, Lcom/zykj/mistake/feature/collection/filter/t;->a:Lcom/zykj/mistake/feature/collection/filter/t;

    .line 2058
    .line 2059
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2060
    .line 2061
    .line 2062
    move-result v2

    .line 2063
    if-eqz v2, :cond_3a

    .line 2064
    .line 2065
    :cond_39
    invoke-virtual {v8}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 2066
    .line 2067
    .line 2068
    move-result-object v1

    .line 2069
    move-object v9, v1

    .line 2070
    check-cast v9, Lcom/zykj/mistake/feature/collection/filter/s0;

    .line 2071
    .line 2072
    sget-object v34, Lkotlin/collections/EmptySet;->INSTANCE:Lkotlin/collections/EmptySet;

    .line 2073
    .line 2074
    const v44, -0x1000001

    .line 2075
    .line 2076
    .line 2077
    const/16 v45, 0x3

    .line 2078
    .line 2079
    const/4 v10, 0x0

    .line 2080
    const/4 v11, 0x0

    .line 2081
    const/4 v12, 0x0

    .line 2082
    const/4 v13, 0x0

    .line 2083
    const/4 v14, 0x0

    .line 2084
    const/4 v15, 0x0

    .line 2085
    const/16 v16, 0x0

    .line 2086
    .line 2087
    const/16 v17, 0x0

    .line 2088
    .line 2089
    const/16 v18, 0x0

    .line 2090
    .line 2091
    const/16 v19, 0x0

    .line 2092
    .line 2093
    const/16 v20, 0x0

    .line 2094
    .line 2095
    const/16 v21, 0x0

    .line 2096
    .line 2097
    const/16 v22, 0x0

    .line 2098
    .line 2099
    const/16 v23, 0x0

    .line 2100
    .line 2101
    const/16 v24, 0x0

    .line 2102
    .line 2103
    const/16 v25, 0x0

    .line 2104
    .line 2105
    const/16 v26, 0x0

    .line 2106
    .line 2107
    const/16 v27, 0x0

    .line 2108
    .line 2109
    const/16 v28, 0x0

    .line 2110
    .line 2111
    const/16 v29, 0x0

    .line 2112
    .line 2113
    const/16 v30, 0x0

    .line 2114
    .line 2115
    const/16 v31, 0x0

    .line 2116
    .line 2117
    const/16 v32, 0x0

    .line 2118
    .line 2119
    const/16 v33, 0x0

    .line 2120
    .line 2121
    const/16 v35, 0x0

    .line 2122
    .line 2123
    const/16 v36, 0x0

    .line 2124
    .line 2125
    const/16 v37, 0x0

    .line 2126
    .line 2127
    const/16 v38, 0x0

    .line 2128
    .line 2129
    const/16 v39, 0x0

    .line 2130
    .line 2131
    const/16 v40, 0x0

    .line 2132
    .line 2133
    const/16 v41, 0x0

    .line 2134
    .line 2135
    const/16 v42, 0x0

    .line 2136
    .line 2137
    const/16 v43, 0x0

    .line 2138
    .line 2139
    invoke-static/range {v9 .. v45}, Lcom/zykj/mistake/feature/collection/filter/s0;->a(Lcom/zykj/mistake/feature/collection/filter/s0;Ljava/lang/String;Ljava/lang/String;IILcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;ILjava/util/ArrayList;ILjava/util/Set;Ljava/util/Set;Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SortType;ZZZZZZZLjava/util/ArrayList;Ljava/util/ArrayList;ILjava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIZLjava/util/Set;ZLcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SourceType;II)Lcom/zykj/mistake/feature/collection/filter/s0;

    .line 2140
    .line 2141
    .line 2142
    move-result-object v2

    .line 2143
    invoke-virtual {v8, v1, v2}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2144
    .line 2145
    .line 2146
    move-result v1

    .line 2147
    if-eqz v1, :cond_39

    .line 2148
    .line 2149
    goto/16 :goto_12

    .line 2150
    .line 2151
    :cond_3a
    instance-of v2, v1, Lcom/zykj/mistake/feature/collection/filter/p0;

    .line 2152
    .line 2153
    if-eqz v2, :cond_3d

    .line 2154
    .line 2155
    :cond_3b
    invoke-virtual {v8}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 2156
    .line 2157
    .line 2158
    move-result-object v2

    .line 2159
    move-object v9, v2

    .line 2160
    check-cast v9, Lcom/zykj/mistake/feature/collection/filter/s0;

    .line 2161
    .line 2162
    iget-object v3, v9, Lcom/zykj/mistake/feature/collection/filter/s0;->y:Ljava/util/Set;

    .line 2163
    .line 2164
    check-cast v3, Ljava/lang/Iterable;

    .line 2165
    .line 2166
    invoke-static {v3}, Lkotlin/collections/t;->G0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 2167
    .line 2168
    .line 2169
    move-result-object v3

    .line 2170
    move-object v4, v1

    .line 2171
    check-cast v4, Lcom/zykj/mistake/feature/collection/filter/p0;

    .line 2172
    .line 2173
    iget-wide v4, v4, Lcom/zykj/mistake/feature/collection/filter/p0;->a:J

    .line 2174
    .line 2175
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2176
    .line 2177
    .line 2178
    move-result-object v6

    .line 2179
    invoke-interface {v3, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 2180
    .line 2181
    .line 2182
    move-result v6

    .line 2183
    if-nez v6, :cond_3c

    .line 2184
    .line 2185
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2186
    .line 2187
    .line 2188
    move-result-object v4

    .line 2189
    invoke-interface {v3, v4}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 2190
    .line 2191
    .line 2192
    :cond_3c
    const v44, -0x1000001

    .line 2193
    .line 2194
    .line 2195
    const/16 v45, 0x3

    .line 2196
    .line 2197
    const/4 v10, 0x0

    .line 2198
    const/4 v11, 0x0

    .line 2199
    const/4 v12, 0x0

    .line 2200
    const/4 v13, 0x0

    .line 2201
    const/4 v14, 0x0

    .line 2202
    const/4 v15, 0x0

    .line 2203
    const/16 v16, 0x0

    .line 2204
    .line 2205
    const/16 v17, 0x0

    .line 2206
    .line 2207
    const/16 v18, 0x0

    .line 2208
    .line 2209
    const/16 v19, 0x0

    .line 2210
    .line 2211
    const/16 v20, 0x0

    .line 2212
    .line 2213
    const/16 v21, 0x0

    .line 2214
    .line 2215
    const/16 v22, 0x0

    .line 2216
    .line 2217
    const/16 v23, 0x0

    .line 2218
    .line 2219
    const/16 v24, 0x0

    .line 2220
    .line 2221
    const/16 v25, 0x0

    .line 2222
    .line 2223
    const/16 v26, 0x0

    .line 2224
    .line 2225
    const/16 v27, 0x0

    .line 2226
    .line 2227
    const/16 v28, 0x0

    .line 2228
    .line 2229
    const/16 v29, 0x0

    .line 2230
    .line 2231
    const/16 v30, 0x0

    .line 2232
    .line 2233
    const/16 v31, 0x0

    .line 2234
    .line 2235
    const/16 v32, 0x0

    .line 2236
    .line 2237
    const/16 v33, 0x0

    .line 2238
    .line 2239
    const/16 v35, 0x0

    .line 2240
    .line 2241
    const/16 v36, 0x0

    .line 2242
    .line 2243
    const/16 v37, 0x0

    .line 2244
    .line 2245
    const/16 v38, 0x0

    .line 2246
    .line 2247
    const/16 v39, 0x0

    .line 2248
    .line 2249
    const/16 v40, 0x0

    .line 2250
    .line 2251
    const/16 v41, 0x0

    .line 2252
    .line 2253
    const/16 v42, 0x0

    .line 2254
    .line 2255
    const/16 v43, 0x0

    .line 2256
    .line 2257
    move-object/from16 v34, v3

    .line 2258
    .line 2259
    invoke-static/range {v9 .. v45}, Lcom/zykj/mistake/feature/collection/filter/s0;->a(Lcom/zykj/mistake/feature/collection/filter/s0;Ljava/lang/String;Ljava/lang/String;IILcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;ILjava/util/ArrayList;ILjava/util/Set;Ljava/util/Set;Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SortType;ZZZZZZZLjava/util/ArrayList;Ljava/util/ArrayList;ILjava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIZLjava/util/Set;ZLcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SourceType;II)Lcom/zykj/mistake/feature/collection/filter/s0;

    .line 2260
    .line 2261
    .line 2262
    move-result-object v3

    .line 2263
    invoke-virtual {v8, v2, v3}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2264
    .line 2265
    .line 2266
    move-result v2

    .line 2267
    if-eqz v2, :cond_3b

    .line 2268
    .line 2269
    goto/16 :goto_12

    .line 2270
    .line 2271
    :cond_3d
    instance-of v2, v1, Lcom/zykj/mistake/feature/collection/filter/h0;

    .line 2272
    .line 2273
    if-eqz v2, :cond_3f

    .line 2274
    .line 2275
    :cond_3e
    invoke-virtual {v8}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 2276
    .line 2277
    .line 2278
    move-result-object v2

    .line 2279
    move-object v9, v2

    .line 2280
    check-cast v9, Lcom/zykj/mistake/feature/collection/filter/s0;

    .line 2281
    .line 2282
    move-object v3, v1

    .line 2283
    check-cast v3, Lcom/zykj/mistake/feature/collection/filter/h0;

    .line 2284
    .line 2285
    iget-object v3, v3, Lcom/zykj/mistake/feature/collection/filter/h0;->a:Ljava/lang/Integer;

    .line 2286
    .line 2287
    const v44, -0x2000001

    .line 2288
    .line 2289
    .line 2290
    const/16 v45, 0x3

    .line 2291
    .line 2292
    const/4 v10, 0x0

    .line 2293
    const/4 v11, 0x0

    .line 2294
    const/4 v12, 0x0

    .line 2295
    const/4 v13, 0x0

    .line 2296
    const/4 v14, 0x0

    .line 2297
    const/4 v15, 0x0

    .line 2298
    const/16 v16, 0x0

    .line 2299
    .line 2300
    const/16 v17, 0x0

    .line 2301
    .line 2302
    const/16 v18, 0x0

    .line 2303
    .line 2304
    const/16 v19, 0x0

    .line 2305
    .line 2306
    const/16 v20, 0x0

    .line 2307
    .line 2308
    const/16 v21, 0x0

    .line 2309
    .line 2310
    const/16 v22, 0x0

    .line 2311
    .line 2312
    const/16 v23, 0x0

    .line 2313
    .line 2314
    const/16 v24, 0x0

    .line 2315
    .line 2316
    const/16 v25, 0x0

    .line 2317
    .line 2318
    const/16 v26, 0x0

    .line 2319
    .line 2320
    const/16 v27, 0x0

    .line 2321
    .line 2322
    const/16 v28, 0x0

    .line 2323
    .line 2324
    const/16 v29, 0x0

    .line 2325
    .line 2326
    const/16 v30, 0x0

    .line 2327
    .line 2328
    const/16 v31, 0x0

    .line 2329
    .line 2330
    const/16 v32, 0x0

    .line 2331
    .line 2332
    const/16 v33, 0x0

    .line 2333
    .line 2334
    const/16 v34, 0x0

    .line 2335
    .line 2336
    const/16 v36, 0x0

    .line 2337
    .line 2338
    const/16 v37, 0x0

    .line 2339
    .line 2340
    const/16 v38, 0x0

    .line 2341
    .line 2342
    const/16 v39, 0x0

    .line 2343
    .line 2344
    const/16 v40, 0x0

    .line 2345
    .line 2346
    const/16 v41, 0x0

    .line 2347
    .line 2348
    const/16 v42, 0x0

    .line 2349
    .line 2350
    const/16 v43, 0x0

    .line 2351
    .line 2352
    move-object/from16 v35, v3

    .line 2353
    .line 2354
    invoke-static/range {v9 .. v45}, Lcom/zykj/mistake/feature/collection/filter/s0;->a(Lcom/zykj/mistake/feature/collection/filter/s0;Ljava/lang/String;Ljava/lang/String;IILcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;ILjava/util/ArrayList;ILjava/util/Set;Ljava/util/Set;Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SortType;ZZZZZZZLjava/util/ArrayList;Ljava/util/ArrayList;ILjava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIZLjava/util/Set;ZLcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SourceType;II)Lcom/zykj/mistake/feature/collection/filter/s0;

    .line 2355
    .line 2356
    .line 2357
    move-result-object v3

    .line 2358
    invoke-virtual {v8, v2, v3}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2359
    .line 2360
    .line 2361
    move-result v2

    .line 2362
    if-eqz v2, :cond_3e

    .line 2363
    .line 2364
    goto/16 :goto_12

    .line 2365
    .line 2366
    :cond_3f
    instance-of v2, v1, Lcom/zykj/mistake/feature/collection/filter/f0;

    .line 2367
    .line 2368
    if-eqz v2, :cond_41

    .line 2369
    .line 2370
    :cond_40
    invoke-virtual {v8}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 2371
    .line 2372
    .line 2373
    move-result-object v2

    .line 2374
    move-object v9, v2

    .line 2375
    check-cast v9, Lcom/zykj/mistake/feature/collection/filter/s0;

    .line 2376
    .line 2377
    move-object v3, v1

    .line 2378
    check-cast v3, Lcom/zykj/mistake/feature/collection/filter/f0;

    .line 2379
    .line 2380
    iget-object v3, v3, Lcom/zykj/mistake/feature/collection/filter/f0;->a:Ljava/lang/Integer;

    .line 2381
    .line 2382
    const v44, -0x4000001

    .line 2383
    .line 2384
    .line 2385
    const/16 v45, 0x3

    .line 2386
    .line 2387
    const/4 v10, 0x0

    .line 2388
    const/4 v11, 0x0

    .line 2389
    const/4 v12, 0x0

    .line 2390
    const/4 v13, 0x0

    .line 2391
    const/4 v14, 0x0

    .line 2392
    const/4 v15, 0x0

    .line 2393
    const/16 v16, 0x0

    .line 2394
    .line 2395
    const/16 v17, 0x0

    .line 2396
    .line 2397
    const/16 v18, 0x0

    .line 2398
    .line 2399
    const/16 v19, 0x0

    .line 2400
    .line 2401
    const/16 v20, 0x0

    .line 2402
    .line 2403
    const/16 v21, 0x0

    .line 2404
    .line 2405
    const/16 v22, 0x0

    .line 2406
    .line 2407
    const/16 v23, 0x0

    .line 2408
    .line 2409
    const/16 v24, 0x0

    .line 2410
    .line 2411
    const/16 v25, 0x0

    .line 2412
    .line 2413
    const/16 v26, 0x0

    .line 2414
    .line 2415
    const/16 v27, 0x0

    .line 2416
    .line 2417
    const/16 v28, 0x0

    .line 2418
    .line 2419
    const/16 v29, 0x0

    .line 2420
    .line 2421
    const/16 v30, 0x0

    .line 2422
    .line 2423
    const/16 v31, 0x0

    .line 2424
    .line 2425
    const/16 v32, 0x0

    .line 2426
    .line 2427
    const/16 v33, 0x0

    .line 2428
    .line 2429
    const/16 v34, 0x0

    .line 2430
    .line 2431
    const/16 v35, 0x0

    .line 2432
    .line 2433
    const/16 v37, 0x0

    .line 2434
    .line 2435
    const/16 v38, 0x0

    .line 2436
    .line 2437
    const/16 v39, 0x0

    .line 2438
    .line 2439
    const/16 v40, 0x0

    .line 2440
    .line 2441
    const/16 v41, 0x0

    .line 2442
    .line 2443
    const/16 v42, 0x0

    .line 2444
    .line 2445
    const/16 v43, 0x0

    .line 2446
    .line 2447
    move-object/from16 v36, v3

    .line 2448
    .line 2449
    invoke-static/range {v9 .. v45}, Lcom/zykj/mistake/feature/collection/filter/s0;->a(Lcom/zykj/mistake/feature/collection/filter/s0;Ljava/lang/String;Ljava/lang/String;IILcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;ILjava/util/ArrayList;ILjava/util/Set;Ljava/util/Set;Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SortType;ZZZZZZZLjava/util/ArrayList;Ljava/util/ArrayList;ILjava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIZLjava/util/Set;ZLcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SourceType;II)Lcom/zykj/mistake/feature/collection/filter/s0;

    .line 2450
    .line 2451
    .line 2452
    move-result-object v3

    .line 2453
    invoke-virtual {v8, v2, v3}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2454
    .line 2455
    .line 2456
    move-result v2

    .line 2457
    if-eqz v2, :cond_40

    .line 2458
    .line 2459
    goto/16 :goto_12

    .line 2460
    .line 2461
    :cond_41
    instance-of v2, v1, Lcom/zykj/mistake/feature/collection/filter/i0;

    .line 2462
    .line 2463
    if-eqz v2, :cond_43

    .line 2464
    .line 2465
    :cond_42
    invoke-virtual {v8}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 2466
    .line 2467
    .line 2468
    move-result-object v2

    .line 2469
    move-object v9, v2

    .line 2470
    check-cast v9, Lcom/zykj/mistake/feature/collection/filter/s0;

    .line 2471
    .line 2472
    move-object v3, v1

    .line 2473
    check-cast v3, Lcom/zykj/mistake/feature/collection/filter/i0;

    .line 2474
    .line 2475
    iget-object v3, v3, Lcom/zykj/mistake/feature/collection/filter/i0;->a:Ljava/lang/Integer;

    .line 2476
    .line 2477
    const v44, -0x8000001

    .line 2478
    .line 2479
    .line 2480
    const/16 v45, 0x3

    .line 2481
    .line 2482
    const/4 v10, 0x0

    .line 2483
    const/4 v11, 0x0

    .line 2484
    const/4 v12, 0x0

    .line 2485
    const/4 v13, 0x0

    .line 2486
    const/4 v14, 0x0

    .line 2487
    const/4 v15, 0x0

    .line 2488
    const/16 v16, 0x0

    .line 2489
    .line 2490
    const/16 v17, 0x0

    .line 2491
    .line 2492
    const/16 v18, 0x0

    .line 2493
    .line 2494
    const/16 v19, 0x0

    .line 2495
    .line 2496
    const/16 v20, 0x0

    .line 2497
    .line 2498
    const/16 v21, 0x0

    .line 2499
    .line 2500
    const/16 v22, 0x0

    .line 2501
    .line 2502
    const/16 v23, 0x0

    .line 2503
    .line 2504
    const/16 v24, 0x0

    .line 2505
    .line 2506
    const/16 v25, 0x0

    .line 2507
    .line 2508
    const/16 v26, 0x0

    .line 2509
    .line 2510
    const/16 v27, 0x0

    .line 2511
    .line 2512
    const/16 v28, 0x0

    .line 2513
    .line 2514
    const/16 v29, 0x0

    .line 2515
    .line 2516
    const/16 v30, 0x0

    .line 2517
    .line 2518
    const/16 v31, 0x0

    .line 2519
    .line 2520
    const/16 v32, 0x0

    .line 2521
    .line 2522
    const/16 v33, 0x0

    .line 2523
    .line 2524
    const/16 v34, 0x0

    .line 2525
    .line 2526
    const/16 v35, 0x0

    .line 2527
    .line 2528
    const/16 v36, 0x0

    .line 2529
    .line 2530
    const/16 v38, 0x0

    .line 2531
    .line 2532
    const/16 v39, 0x0

    .line 2533
    .line 2534
    const/16 v40, 0x0

    .line 2535
    .line 2536
    const/16 v41, 0x0

    .line 2537
    .line 2538
    const/16 v42, 0x0

    .line 2539
    .line 2540
    const/16 v43, 0x0

    .line 2541
    .line 2542
    move-object/from16 v37, v3

    .line 2543
    .line 2544
    invoke-static/range {v9 .. v45}, Lcom/zykj/mistake/feature/collection/filter/s0;->a(Lcom/zykj/mistake/feature/collection/filter/s0;Ljava/lang/String;Ljava/lang/String;IILcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;ILjava/util/ArrayList;ILjava/util/Set;Ljava/util/Set;Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SortType;ZZZZZZZLjava/util/ArrayList;Ljava/util/ArrayList;ILjava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIZLjava/util/Set;ZLcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SourceType;II)Lcom/zykj/mistake/feature/collection/filter/s0;

    .line 2545
    .line 2546
    .line 2547
    move-result-object v3

    .line 2548
    invoke-virtual {v8, v2, v3}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2549
    .line 2550
    .line 2551
    move-result v2

    .line 2552
    if-eqz v2, :cond_42

    .line 2553
    .line 2554
    goto/16 :goto_12

    .line 2555
    .line 2556
    :cond_43
    instance-of v2, v1, Lcom/zykj/mistake/feature/collection/filter/g0;

    .line 2557
    .line 2558
    if-eqz v2, :cond_45

    .line 2559
    .line 2560
    :cond_44
    invoke-virtual {v8}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 2561
    .line 2562
    .line 2563
    move-result-object v2

    .line 2564
    move-object v9, v2

    .line 2565
    check-cast v9, Lcom/zykj/mistake/feature/collection/filter/s0;

    .line 2566
    .line 2567
    move-object v3, v1

    .line 2568
    check-cast v3, Lcom/zykj/mistake/feature/collection/filter/g0;

    .line 2569
    .line 2570
    iget v3, v3, Lcom/zykj/mistake/feature/collection/filter/g0;->a:I

    .line 2571
    .line 2572
    const v44, -0x10000001

    .line 2573
    .line 2574
    .line 2575
    const/16 v45, 0x3

    .line 2576
    .line 2577
    const/4 v10, 0x0

    .line 2578
    const/4 v11, 0x0

    .line 2579
    const/4 v12, 0x0

    .line 2580
    const/4 v13, 0x0

    .line 2581
    const/4 v14, 0x0

    .line 2582
    const/4 v15, 0x0

    .line 2583
    const/16 v16, 0x0

    .line 2584
    .line 2585
    const/16 v17, 0x0

    .line 2586
    .line 2587
    const/16 v18, 0x0

    .line 2588
    .line 2589
    const/16 v19, 0x0

    .line 2590
    .line 2591
    const/16 v20, 0x0

    .line 2592
    .line 2593
    const/16 v21, 0x0

    .line 2594
    .line 2595
    const/16 v22, 0x0

    .line 2596
    .line 2597
    const/16 v23, 0x0

    .line 2598
    .line 2599
    const/16 v24, 0x0

    .line 2600
    .line 2601
    const/16 v25, 0x0

    .line 2602
    .line 2603
    const/16 v26, 0x0

    .line 2604
    .line 2605
    const/16 v27, 0x0

    .line 2606
    .line 2607
    const/16 v28, 0x0

    .line 2608
    .line 2609
    const/16 v29, 0x0

    .line 2610
    .line 2611
    const/16 v30, 0x0

    .line 2612
    .line 2613
    const/16 v31, 0x0

    .line 2614
    .line 2615
    const/16 v32, 0x0

    .line 2616
    .line 2617
    const/16 v33, 0x0

    .line 2618
    .line 2619
    const/16 v34, 0x0

    .line 2620
    .line 2621
    const/16 v35, 0x0

    .line 2622
    .line 2623
    const/16 v36, 0x0

    .line 2624
    .line 2625
    const/16 v37, 0x0

    .line 2626
    .line 2627
    const/16 v39, 0x0

    .line 2628
    .line 2629
    const/16 v40, 0x0

    .line 2630
    .line 2631
    const/16 v41, 0x0

    .line 2632
    .line 2633
    const/16 v42, 0x0

    .line 2634
    .line 2635
    const/16 v43, 0x0

    .line 2636
    .line 2637
    move/from16 v38, v3

    .line 2638
    .line 2639
    invoke-static/range {v9 .. v45}, Lcom/zykj/mistake/feature/collection/filter/s0;->a(Lcom/zykj/mistake/feature/collection/filter/s0;Ljava/lang/String;Ljava/lang/String;IILcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;ILjava/util/ArrayList;ILjava/util/Set;Ljava/util/Set;Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SortType;ZZZZZZZLjava/util/ArrayList;Ljava/util/ArrayList;ILjava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIZLjava/util/Set;ZLcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SourceType;II)Lcom/zykj/mistake/feature/collection/filter/s0;

    .line 2640
    .line 2641
    .line 2642
    move-result-object v3

    .line 2643
    invoke-virtual {v8, v2, v3}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2644
    .line 2645
    .line 2646
    move-result v2

    .line 2647
    if-eqz v2, :cond_44

    .line 2648
    .line 2649
    goto/16 :goto_12

    .line 2650
    .line 2651
    :cond_45
    instance-of v2, v1, Lcom/zykj/mistake/feature/collection/filter/k0;

    .line 2652
    .line 2653
    if-eqz v2, :cond_47

    .line 2654
    .line 2655
    :cond_46
    invoke-virtual {v8}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 2656
    .line 2657
    .line 2658
    move-result-object v2

    .line 2659
    move-object v9, v2

    .line 2660
    check-cast v9, Lcom/zykj/mistake/feature/collection/filter/s0;

    .line 2661
    .line 2662
    move-object v3, v1

    .line 2663
    check-cast v3, Lcom/zykj/mistake/feature/collection/filter/k0;

    .line 2664
    .line 2665
    iget v3, v3, Lcom/zykj/mistake/feature/collection/filter/k0;->a:I

    .line 2666
    .line 2667
    const v44, -0x20000001

    .line 2668
    .line 2669
    .line 2670
    const/16 v45, 0x3

    .line 2671
    .line 2672
    const/4 v10, 0x0

    .line 2673
    const/4 v11, 0x0

    .line 2674
    const/4 v12, 0x0

    .line 2675
    const/4 v13, 0x0

    .line 2676
    const/4 v14, 0x0

    .line 2677
    const/4 v15, 0x0

    .line 2678
    const/16 v16, 0x0

    .line 2679
    .line 2680
    const/16 v17, 0x0

    .line 2681
    .line 2682
    const/16 v18, 0x0

    .line 2683
    .line 2684
    const/16 v19, 0x0

    .line 2685
    .line 2686
    const/16 v20, 0x0

    .line 2687
    .line 2688
    const/16 v21, 0x0

    .line 2689
    .line 2690
    const/16 v22, 0x0

    .line 2691
    .line 2692
    const/16 v23, 0x0

    .line 2693
    .line 2694
    const/16 v24, 0x0

    .line 2695
    .line 2696
    const/16 v25, 0x0

    .line 2697
    .line 2698
    const/16 v26, 0x0

    .line 2699
    .line 2700
    const/16 v27, 0x0

    .line 2701
    .line 2702
    const/16 v28, 0x0

    .line 2703
    .line 2704
    const/16 v29, 0x0

    .line 2705
    .line 2706
    const/16 v30, 0x0

    .line 2707
    .line 2708
    const/16 v31, 0x0

    .line 2709
    .line 2710
    const/16 v32, 0x0

    .line 2711
    .line 2712
    const/16 v33, 0x0

    .line 2713
    .line 2714
    const/16 v34, 0x0

    .line 2715
    .line 2716
    const/16 v35, 0x0

    .line 2717
    .line 2718
    const/16 v36, 0x0

    .line 2719
    .line 2720
    const/16 v37, 0x0

    .line 2721
    .line 2722
    const/16 v38, 0x0

    .line 2723
    .line 2724
    const/16 v40, 0x0

    .line 2725
    .line 2726
    const/16 v41, 0x0

    .line 2727
    .line 2728
    const/16 v42, 0x0

    .line 2729
    .line 2730
    const/16 v43, 0x0

    .line 2731
    .line 2732
    move/from16 v39, v3

    .line 2733
    .line 2734
    invoke-static/range {v9 .. v45}, Lcom/zykj/mistake/feature/collection/filter/s0;->a(Lcom/zykj/mistake/feature/collection/filter/s0;Ljava/lang/String;Ljava/lang/String;IILcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;ILjava/util/ArrayList;ILjava/util/Set;Ljava/util/Set;Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SortType;ZZZZZZZLjava/util/ArrayList;Ljava/util/ArrayList;ILjava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIZLjava/util/Set;ZLcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SourceType;II)Lcom/zykj/mistake/feature/collection/filter/s0;

    .line 2735
    .line 2736
    .line 2737
    move-result-object v3

    .line 2738
    invoke-virtual {v8, v2, v3}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2739
    .line 2740
    .line 2741
    move-result v2

    .line 2742
    if-eqz v2, :cond_46

    .line 2743
    .line 2744
    goto/16 :goto_12

    .line 2745
    .line 2746
    :cond_47
    sget-object v2, Lcom/zykj/mistake/feature/collection/filter/u;->a:Lcom/zykj/mistake/feature/collection/filter/u;

    .line 2747
    .line 2748
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2749
    .line 2750
    .line 2751
    move-result v2

    .line 2752
    if-eqz v2, :cond_49

    .line 2753
    .line 2754
    :cond_48
    invoke-virtual {v8}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 2755
    .line 2756
    .line 2757
    move-result-object v1

    .line 2758
    move-object v9, v1

    .line 2759
    check-cast v9, Lcom/zykj/mistake/feature/collection/filter/s0;

    .line 2760
    .line 2761
    invoke-static {}, Lkotlin/collections/j0;->v()Lkotlin/collections/EmptySet;

    .line 2762
    .line 2763
    .line 2764
    move-result-object v41

    .line 2765
    const v44, 0x3fffffff    # 1.9999999f

    .line 2766
    .line 2767
    .line 2768
    const/16 v45, 0x3

    .line 2769
    .line 2770
    const/4 v10, 0x0

    .line 2771
    const/4 v11, 0x0

    .line 2772
    const/4 v12, 0x0

    .line 2773
    const/4 v13, 0x0

    .line 2774
    const/4 v14, 0x0

    .line 2775
    const/4 v15, 0x0

    .line 2776
    const/16 v16, 0x0

    .line 2777
    .line 2778
    const/16 v17, 0x0

    .line 2779
    .line 2780
    const/16 v18, 0x0

    .line 2781
    .line 2782
    const/16 v19, 0x0

    .line 2783
    .line 2784
    const/16 v20, 0x0

    .line 2785
    .line 2786
    const/16 v21, 0x0

    .line 2787
    .line 2788
    const/16 v22, 0x0

    .line 2789
    .line 2790
    const/16 v23, 0x0

    .line 2791
    .line 2792
    const/16 v24, 0x0

    .line 2793
    .line 2794
    const/16 v25, 0x0

    .line 2795
    .line 2796
    const/16 v26, 0x0

    .line 2797
    .line 2798
    const/16 v27, 0x0

    .line 2799
    .line 2800
    const/16 v28, 0x0

    .line 2801
    .line 2802
    const/16 v29, 0x0

    .line 2803
    .line 2804
    const/16 v30, 0x0

    .line 2805
    .line 2806
    const/16 v31, 0x0

    .line 2807
    .line 2808
    const/16 v32, 0x0

    .line 2809
    .line 2810
    const/16 v33, 0x0

    .line 2811
    .line 2812
    const/16 v34, 0x0

    .line 2813
    .line 2814
    const/16 v35, 0x0

    .line 2815
    .line 2816
    const/16 v36, 0x0

    .line 2817
    .line 2818
    const/16 v37, 0x0

    .line 2819
    .line 2820
    const/16 v38, 0x0

    .line 2821
    .line 2822
    const/16 v39, 0x0

    .line 2823
    .line 2824
    const/16 v40, 0x0

    .line 2825
    .line 2826
    const/16 v42, 0x0

    .line 2827
    .line 2828
    const/16 v43, 0x0

    .line 2829
    .line 2830
    invoke-static/range {v9 .. v45}, Lcom/zykj/mistake/feature/collection/filter/s0;->a(Lcom/zykj/mistake/feature/collection/filter/s0;Ljava/lang/String;Ljava/lang/String;IILcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;ILjava/util/ArrayList;ILjava/util/Set;Ljava/util/Set;Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SortType;ZZZZZZZLjava/util/ArrayList;Ljava/util/ArrayList;ILjava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIZLjava/util/Set;ZLcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SourceType;II)Lcom/zykj/mistake/feature/collection/filter/s0;

    .line 2831
    .line 2832
    .line 2833
    move-result-object v2

    .line 2834
    invoke-virtual {v8, v1, v2}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2835
    .line 2836
    .line 2837
    move-result v1

    .line 2838
    if-eqz v1, :cond_48

    .line 2839
    .line 2840
    goto/16 :goto_12

    .line 2841
    .line 2842
    :cond_49
    sget-object v2, Lcom/zykj/mistake/feature/collection/filter/j0;->a:Lcom/zykj/mistake/feature/collection/filter/j0;

    .line 2843
    .line 2844
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2845
    .line 2846
    .line 2847
    move-result v2

    .line 2848
    if-eqz v2, :cond_4b

    .line 2849
    .line 2850
    :cond_4a
    invoke-virtual {v8}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 2851
    .line 2852
    .line 2853
    move-result-object v1

    .line 2854
    move-object v9, v1

    .line 2855
    check-cast v9, Lcom/zykj/mistake/feature/collection/filter/s0;

    .line 2856
    .line 2857
    iget-boolean v2, v9, Lcom/zykj/mistake/feature/collection/filter/s0;->E:Z

    .line 2858
    .line 2859
    const/16 v47, 0x1

    .line 2860
    .line 2861
    xor-int/lit8 v40, v2, 0x1

    .line 2862
    .line 2863
    const v44, -0x40000001    # -1.9999999f

    .line 2864
    .line 2865
    .line 2866
    const/16 v45, 0x3

    .line 2867
    .line 2868
    const/4 v10, 0x0

    .line 2869
    const/4 v11, 0x0

    .line 2870
    const/4 v12, 0x0

    .line 2871
    const/4 v13, 0x0

    .line 2872
    const/4 v14, 0x0

    .line 2873
    const/4 v15, 0x0

    .line 2874
    const/16 v16, 0x0

    .line 2875
    .line 2876
    const/16 v17, 0x0

    .line 2877
    .line 2878
    const/16 v18, 0x0

    .line 2879
    .line 2880
    const/16 v19, 0x0

    .line 2881
    .line 2882
    const/16 v20, 0x0

    .line 2883
    .line 2884
    const/16 v21, 0x0

    .line 2885
    .line 2886
    const/16 v22, 0x0

    .line 2887
    .line 2888
    const/16 v23, 0x0

    .line 2889
    .line 2890
    const/16 v24, 0x0

    .line 2891
    .line 2892
    const/16 v25, 0x0

    .line 2893
    .line 2894
    const/16 v26, 0x0

    .line 2895
    .line 2896
    const/16 v27, 0x0

    .line 2897
    .line 2898
    const/16 v28, 0x0

    .line 2899
    .line 2900
    const/16 v29, 0x0

    .line 2901
    .line 2902
    const/16 v30, 0x0

    .line 2903
    .line 2904
    const/16 v31, 0x0

    .line 2905
    .line 2906
    const/16 v32, 0x0

    .line 2907
    .line 2908
    const/16 v33, 0x0

    .line 2909
    .line 2910
    const/16 v34, 0x0

    .line 2911
    .line 2912
    const/16 v35, 0x0

    .line 2913
    .line 2914
    const/16 v36, 0x0

    .line 2915
    .line 2916
    const/16 v37, 0x0

    .line 2917
    .line 2918
    const/16 v38, 0x0

    .line 2919
    .line 2920
    const/16 v39, 0x0

    .line 2921
    .line 2922
    const/16 v41, 0x0

    .line 2923
    .line 2924
    const/16 v42, 0x0

    .line 2925
    .line 2926
    const/16 v43, 0x0

    .line 2927
    .line 2928
    invoke-static/range {v9 .. v45}, Lcom/zykj/mistake/feature/collection/filter/s0;->a(Lcom/zykj/mistake/feature/collection/filter/s0;Ljava/lang/String;Ljava/lang/String;IILcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;ILjava/util/ArrayList;ILjava/util/Set;Ljava/util/Set;Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SortType;ZZZZZZZLjava/util/ArrayList;Ljava/util/ArrayList;ILjava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIZLjava/util/Set;ZLcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SourceType;II)Lcom/zykj/mistake/feature/collection/filter/s0;

    .line 2929
    .line 2930
    .line 2931
    move-result-object v2

    .line 2932
    invoke-virtual {v8, v1, v2}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2933
    .line 2934
    .line 2935
    move-result v1

    .line 2936
    if-eqz v1, :cond_4a

    .line 2937
    .line 2938
    goto :goto_12

    .line 2939
    :cond_4b
    instance-of v2, v1, Lcom/zykj/mistake/feature/collection/filter/q0;

    .line 2940
    .line 2941
    if-eqz v2, :cond_4f

    .line 2942
    .line 2943
    :cond_4c
    invoke-virtual {v8}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 2944
    .line 2945
    .line 2946
    move-result-object v2

    .line 2947
    move-object v9, v2

    .line 2948
    check-cast v9, Lcom/zykj/mistake/feature/collection/filter/s0;

    .line 2949
    .line 2950
    iget-object v3, v9, Lcom/zykj/mistake/feature/collection/filter/s0;->F:Ljava/util/Set;

    .line 2951
    .line 2952
    check-cast v3, Ljava/lang/Iterable;

    .line 2953
    .line 2954
    invoke-static {v3}, Lkotlin/collections/t;->G0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 2955
    .line 2956
    .line 2957
    move-result-object v3

    .line 2958
    move-object v4, v1

    .line 2959
    check-cast v4, Lcom/zykj/mistake/feature/collection/filter/q0;

    .line 2960
    .line 2961
    iget-wide v4, v4, Lcom/zykj/mistake/feature/collection/filter/q0;->a:J

    .line 2962
    .line 2963
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2964
    .line 2965
    .line 2966
    move-result-object v6

    .line 2967
    invoke-interface {v3, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 2968
    .line 2969
    .line 2970
    move-result v6

    .line 2971
    if-nez v6, :cond_4d

    .line 2972
    .line 2973
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2974
    .line 2975
    .line 2976
    move-result-object v4

    .line 2977
    invoke-interface {v3, v4}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 2978
    .line 2979
    .line 2980
    :cond_4d
    const v44, 0x7fffffff

    .line 2981
    .line 2982
    .line 2983
    const/16 v45, 0x3

    .line 2984
    .line 2985
    const/4 v10, 0x0

    .line 2986
    const/4 v11, 0x0

    .line 2987
    const/4 v12, 0x0

    .line 2988
    const/4 v13, 0x0

    .line 2989
    const/4 v14, 0x0

    .line 2990
    const/4 v15, 0x0

    .line 2991
    const/16 v16, 0x0

    .line 2992
    .line 2993
    const/16 v17, 0x0

    .line 2994
    .line 2995
    const/16 v18, 0x0

    .line 2996
    .line 2997
    const/16 v19, 0x0

    .line 2998
    .line 2999
    const/16 v20, 0x0

    .line 3000
    .line 3001
    const/16 v21, 0x0

    .line 3002
    .line 3003
    const/16 v22, 0x0

    .line 3004
    .line 3005
    const/16 v23, 0x0

    .line 3006
    .line 3007
    const/16 v24, 0x0

    .line 3008
    .line 3009
    const/16 v25, 0x0

    .line 3010
    .line 3011
    const/16 v26, 0x0

    .line 3012
    .line 3013
    const/16 v27, 0x0

    .line 3014
    .line 3015
    const/16 v28, 0x0

    .line 3016
    .line 3017
    const/16 v29, 0x0

    .line 3018
    .line 3019
    const/16 v30, 0x0

    .line 3020
    .line 3021
    const/16 v31, 0x0

    .line 3022
    .line 3023
    const/16 v32, 0x0

    .line 3024
    .line 3025
    const/16 v33, 0x0

    .line 3026
    .line 3027
    const/16 v34, 0x0

    .line 3028
    .line 3029
    const/16 v35, 0x0

    .line 3030
    .line 3031
    const/16 v36, 0x0

    .line 3032
    .line 3033
    const/16 v37, 0x0

    .line 3034
    .line 3035
    const/16 v38, 0x0

    .line 3036
    .line 3037
    const/16 v39, 0x0

    .line 3038
    .line 3039
    const/16 v40, 0x0

    .line 3040
    .line 3041
    const/16 v42, 0x0

    .line 3042
    .line 3043
    const/16 v43, 0x0

    .line 3044
    .line 3045
    move-object/from16 v41, v3

    .line 3046
    .line 3047
    invoke-static/range {v9 .. v45}, Lcom/zykj/mistake/feature/collection/filter/s0;->a(Lcom/zykj/mistake/feature/collection/filter/s0;Ljava/lang/String;Ljava/lang/String;IILcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;ILjava/util/ArrayList;ILjava/util/Set;Ljava/util/Set;Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SortType;ZZZZZZZLjava/util/ArrayList;Ljava/util/ArrayList;ILjava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIZLjava/util/Set;ZLcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SourceType;II)Lcom/zykj/mistake/feature/collection/filter/s0;

    .line 3048
    .line 3049
    .line 3050
    move-result-object v3

    .line 3051
    invoke-virtual {v8, v2, v3}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 3052
    .line 3053
    .line 3054
    move-result v2

    .line 3055
    if-eqz v2, :cond_4c

    .line 3056
    .line 3057
    :cond_4e
    :goto_12
    return-void

    .line 3058
    :cond_4f
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    .line 3059
    .line 3060
    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 3061
    .line 3062
    .line 3063
    throw v1
.end method

.method public final d()V
    .locals 44

    .line 1
    move-object/from16 v4, p0

    .line 2
    .line 3
    new-instance v1, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel$loadFilterOptions$1;

    .line 4
    .line 5
    const/4 v6, 0x0

    .line 6
    invoke-direct {v1, v4, v6}, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel$loadFilterOptions$1;-><init>(Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;Lh6/c;)V

    .line 7
    .line 8
    .line 9
    new-instance v2, Landroidx/navigation/i;

    .line 10
    .line 11
    const/4 v0, 0x5

    .line 12
    invoke-direct {v2, v4, v0}, Landroidx/navigation/i;-><init>(Ljava/lang/Object;I)V

    .line 13
    .line 14
    .line 15
    new-instance v3, Landroidx/navigation/b;

    .line 16
    .line 17
    const/16 v0, 0x8

    .line 18
    .line 19
    invoke-direct {v3, v4, v0}, Landroidx/navigation/b;-><init>(Ljava/lang/Object;I)V

    .line 20
    .line 21
    .line 22
    :goto_0
    iget-object v0, v4, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;->c:Lkotlinx/coroutines/flow/n0;

    .line 23
    .line 24
    invoke-virtual {v0}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v5

    .line 28
    move-object v7, v5

    .line 29
    check-cast v7, Lcom/zykj/mistake/feature/collection/filter/s0;

    .line 30
    .line 31
    const v42, -0x10001

    .line 32
    .line 33
    .line 34
    const/16 v43, 0x3

    .line 35
    .line 36
    const/4 v8, 0x0

    .line 37
    const/4 v9, 0x0

    .line 38
    const/4 v10, 0x0

    .line 39
    const/4 v11, 0x0

    .line 40
    const/4 v12, 0x0

    .line 41
    const/4 v13, 0x0

    .line 42
    const/4 v14, 0x0

    .line 43
    const/4 v15, 0x0

    .line 44
    const/16 v16, 0x0

    .line 45
    .line 46
    const/16 v17, 0x0

    .line 47
    .line 48
    const/16 v18, 0x0

    .line 49
    .line 50
    const/16 v19, 0x0

    .line 51
    .line 52
    const/16 v20, 0x0

    .line 53
    .line 54
    const/16 v21, 0x0

    .line 55
    .line 56
    const/16 v22, 0x0

    .line 57
    .line 58
    const/16 v23, 0x0

    .line 59
    .line 60
    const/16 v24, 0x1

    .line 61
    .line 62
    const/16 v25, 0x0

    .line 63
    .line 64
    const/16 v26, 0x0

    .line 65
    .line 66
    const/16 v27, 0x0

    .line 67
    .line 68
    const/16 v28, 0x0

    .line 69
    .line 70
    const/16 v29, 0x0

    .line 71
    .line 72
    const/16 v30, 0x0

    .line 73
    .line 74
    const/16 v31, 0x0

    .line 75
    .line 76
    const/16 v32, 0x0

    .line 77
    .line 78
    const/16 v33, 0x0

    .line 79
    .line 80
    const/16 v34, 0x0

    .line 81
    .line 82
    const/16 v35, 0x0

    .line 83
    .line 84
    const/16 v36, 0x0

    .line 85
    .line 86
    const/16 v37, 0x0

    .line 87
    .line 88
    const/16 v38, 0x0

    .line 89
    .line 90
    const/16 v39, 0x0

    .line 91
    .line 92
    const/16 v40, 0x0

    .line 93
    .line 94
    const/16 v41, 0x0

    .line 95
    .line 96
    invoke-static/range {v7 .. v43}, Lcom/zykj/mistake/feature/collection/filter/s0;->a(Lcom/zykj/mistake/feature/collection/filter/s0;Ljava/lang/String;Ljava/lang/String;IILcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;ILjava/util/ArrayList;ILjava/util/Set;Ljava/util/Set;Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SortType;ZZZZZZZLjava/util/ArrayList;Ljava/util/ArrayList;ILjava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIZLjava/util/Set;ZLcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SourceType;II)Lcom/zykj/mistake/feature/collection/filter/s0;

    .line 97
    .line 98
    .line 99
    move-result-object v7

    .line 100
    invoke-virtual {v0, v5, v7}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    if-eqz v0, :cond_0

    .line 105
    .line 106
    invoke-static {v4}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/v;

    .line 107
    .line 108
    .line 109
    move-result-object v7

    .line 110
    new-instance v0, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel$requestApi$2;

    .line 111
    .line 112
    const/4 v5, 0x0

    .line 113
    invoke-direct/range {v0 .. v5}, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel$requestApi$2;-><init>(Lr6/c;Lr6/c;Lr6/a;Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;Lh6/c;)V

    .line 114
    .line 115
    .line 116
    const/4 v1, 0x3

    .line 117
    invoke-static {v7, v6, v6, v0, v1}, Lkotlinx/coroutines/x;->v(Lkotlinx/coroutines/v;Lh6/h;Lkotlinx/coroutines/CoroutineStart;Lr6/e;I)Lkotlinx/coroutines/k1;

    .line 118
    .line 119
    .line 120
    return-void

    .line 121
    :cond_0
    move-object/from16 v4, p0

    .line 122
    .line 123
    goto :goto_0
.end method

.method public final e(Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;Z)V
    .locals 42

    .line 1
    move-object/from16 v3, p1

    .line 2
    .line 3
    move-object/from16 v2, p0

    .line 4
    .line 5
    iget-object v0, v2, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;->c:Lkotlinx/coroutines/flow/n0;

    .line 6
    .line 7
    invoke-virtual {v0}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, Lcom/zykj/mistake/feature/collection/filter/s0;

    .line 12
    .line 13
    if-eqz p2, :cond_0

    .line 14
    .line 15
    iget-boolean v4, v1, Lcom/zykj/mistake/feature/collection/filter/s0;->n:Z

    .line 16
    .line 17
    if-eqz v4, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    if-nez p2, :cond_2

    .line 21
    .line 22
    iget-boolean v4, v1, Lcom/zykj/mistake/feature/collection/filter/s0;->n:Z

    .line 23
    .line 24
    if-nez v4, :cond_1

    .line 25
    .line 26
    iget-boolean v4, v1, Lcom/zykj/mistake/feature/collection/filter/s0;->o:Z

    .line 27
    .line 28
    if-eqz v4, :cond_2

    .line 29
    .line 30
    :cond_1
    :goto_0
    return-void

    .line 31
    :cond_2
    if-eqz p2, :cond_3

    .line 32
    .line 33
    const/4 v1, 0x0

    .line 34
    :goto_1
    move v4, v1

    .line 35
    goto :goto_2

    .line 36
    :cond_3
    iget-object v1, v1, Lcom/zykj/mistake/feature/collection/filter/s0;->g:Ljava/util/List;

    .line 37
    .line 38
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    goto :goto_1

    .line 43
    :goto_2
    invoke-virtual {v3, v4}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->setSkipCount(I)V

    .line 44
    .line 45
    .line 46
    const/16 v1, 0x14

    .line 47
    .line 48
    invoke-virtual {v3, v1}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->setMaxResultCount(I)V

    .line 49
    .line 50
    .line 51
    if-eqz p2, :cond_5

    .line 52
    .line 53
    :cond_4
    invoke-virtual {v0}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    move-object v5, v1

    .line 58
    check-cast v5, Lcom/zykj/mistake/feature/collection/filter/s0;

    .line 59
    .line 60
    sget-object v15, Lkotlin/collections/EmptySet;->INSTANCE:Lkotlin/collections/EmptySet;

    .line 61
    .line 62
    const v40, -0x1a201

    .line 63
    .line 64
    .line 65
    const/16 v41, 0x3

    .line 66
    .line 67
    const/4 v6, 0x0

    .line 68
    const/4 v7, 0x0

    .line 69
    const/4 v8, 0x0

    .line 70
    const/4 v9, 0x0

    .line 71
    const/4 v10, 0x0

    .line 72
    const/4 v11, 0x0

    .line 73
    const/4 v12, 0x0

    .line 74
    const/4 v13, 0x0

    .line 75
    const/4 v14, 0x0

    .line 76
    const/16 v16, 0x0

    .line 77
    .line 78
    const/16 v17, 0x0

    .line 79
    .line 80
    const/16 v18, 0x0

    .line 81
    .line 82
    const/16 v19, 0x1

    .line 83
    .line 84
    const/16 v20, 0x0

    .line 85
    .line 86
    const/16 v21, 0x1

    .line 87
    .line 88
    const/16 v22, 0x1

    .line 89
    .line 90
    const/16 v23, 0x0

    .line 91
    .line 92
    const/16 v24, 0x0

    .line 93
    .line 94
    const/16 v25, 0x0

    .line 95
    .line 96
    const/16 v26, 0x0

    .line 97
    .line 98
    const/16 v27, 0x0

    .line 99
    .line 100
    const/16 v28, 0x0

    .line 101
    .line 102
    const/16 v29, 0x0

    .line 103
    .line 104
    const/16 v30, 0x0

    .line 105
    .line 106
    const/16 v31, 0x0

    .line 107
    .line 108
    const/16 v32, 0x0

    .line 109
    .line 110
    const/16 v33, 0x0

    .line 111
    .line 112
    const/16 v34, 0x0

    .line 113
    .line 114
    const/16 v35, 0x0

    .line 115
    .line 116
    const/16 v36, 0x0

    .line 117
    .line 118
    const/16 v37, 0x0

    .line 119
    .line 120
    const/16 v38, 0x0

    .line 121
    .line 122
    const/16 v39, 0x0

    .line 123
    .line 124
    invoke-static/range {v5 .. v41}, Lcom/zykj/mistake/feature/collection/filter/s0;->a(Lcom/zykj/mistake/feature/collection/filter/s0;Ljava/lang/String;Ljava/lang/String;IILcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;ILjava/util/ArrayList;ILjava/util/Set;Ljava/util/Set;Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SortType;ZZZZZZZLjava/util/ArrayList;Ljava/util/ArrayList;ILjava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIZLjava/util/Set;ZLcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SourceType;II)Lcom/zykj/mistake/feature/collection/filter/s0;

    .line 125
    .line 126
    .line 127
    move-result-object v5

    .line 128
    invoke-virtual {v0, v1, v5}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result v1

    .line 132
    if-eqz v1, :cond_4

    .line 133
    .line 134
    goto :goto_4

    .line 135
    :cond_5
    :goto_3
    invoke-virtual {v0}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    move-object v5, v1

    .line 140
    check-cast v5, Lcom/zykj/mistake/feature/collection/filter/s0;

    .line 141
    .line 142
    const/16 v40, -0x4001

    .line 143
    .line 144
    const/16 v41, 0x3

    .line 145
    .line 146
    const/4 v6, 0x0

    .line 147
    const/4 v7, 0x0

    .line 148
    const/4 v8, 0x0

    .line 149
    const/4 v9, 0x0

    .line 150
    const/4 v10, 0x0

    .line 151
    const/4 v11, 0x0

    .line 152
    const/4 v12, 0x0

    .line 153
    const/4 v13, 0x0

    .line 154
    const/4 v14, 0x0

    .line 155
    const/4 v15, 0x0

    .line 156
    const/16 v16, 0x0

    .line 157
    .line 158
    const/16 v17, 0x0

    .line 159
    .line 160
    const/16 v18, 0x0

    .line 161
    .line 162
    const/16 v19, 0x0

    .line 163
    .line 164
    const/16 v20, 0x1

    .line 165
    .line 166
    const/16 v21, 0x0

    .line 167
    .line 168
    const/16 v22, 0x0

    .line 169
    .line 170
    const/16 v23, 0x0

    .line 171
    .line 172
    const/16 v24, 0x0

    .line 173
    .line 174
    const/16 v25, 0x0

    .line 175
    .line 176
    const/16 v26, 0x0

    .line 177
    .line 178
    const/16 v27, 0x0

    .line 179
    .line 180
    const/16 v28, 0x0

    .line 181
    .line 182
    const/16 v29, 0x0

    .line 183
    .line 184
    const/16 v30, 0x0

    .line 185
    .line 186
    const/16 v31, 0x0

    .line 187
    .line 188
    const/16 v32, 0x0

    .line 189
    .line 190
    const/16 v33, 0x0

    .line 191
    .line 192
    const/16 v34, 0x0

    .line 193
    .line 194
    const/16 v35, 0x0

    .line 195
    .line 196
    const/16 v36, 0x0

    .line 197
    .line 198
    const/16 v37, 0x0

    .line 199
    .line 200
    const/16 v38, 0x0

    .line 201
    .line 202
    const/16 v39, 0x0

    .line 203
    .line 204
    invoke-static/range {v5 .. v41}, Lcom/zykj/mistake/feature/collection/filter/s0;->a(Lcom/zykj/mistake/feature/collection/filter/s0;Ljava/lang/String;Ljava/lang/String;IILcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;ILjava/util/ArrayList;ILjava/util/Set;Ljava/util/Set;Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SortType;ZZZZZZZLjava/util/ArrayList;Ljava/util/ArrayList;ILjava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIZLjava/util/Set;ZLcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SourceType;II)Lcom/zykj/mistake/feature/collection/filter/s0;

    .line 205
    .line 206
    .line 207
    move-result-object v5

    .line 208
    invoke-virtual {v0, v1, v5}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    move-result v1

    .line 212
    if-eqz v1, :cond_6

    .line 213
    .line 214
    :goto_4
    invoke-static {v2}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/v;

    .line 215
    .line 216
    .line 217
    move-result-object v6

    .line 218
    new-instance v0, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel$requestFilterResult$3;

    .line 219
    .line 220
    const/4 v5, 0x0

    .line 221
    move/from16 v1, p2

    .line 222
    .line 223
    invoke-direct/range {v0 .. v5}, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel$requestFilterResult$3;-><init>(ZLcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;ILh6/c;)V

    .line 224
    .line 225
    .line 226
    const/4 v1, 0x3

    .line 227
    const/4 v2, 0x0

    .line 228
    invoke-static {v6, v2, v2, v0, v1}, Lkotlinx/coroutines/x;->v(Lkotlinx/coroutines/v;Lh6/h;Lkotlinx/coroutines/CoroutineStart;Lr6/e;I)Lkotlinx/coroutines/k1;

    .line 229
    .line 230
    .line 231
    return-void

    .line 232
    :cond_6
    move-object/from16 v2, p0

    .line 233
    .line 234
    move-object/from16 v3, p1

    .line 235
    .line 236
    goto :goto_3
.end method

.method public final f(Lcom/zykj/mistake/feature/collection/filter/q;)V
    .locals 3

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/v;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel$sendEffect$1;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p0, p1, v2}, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel$sendEffect$1;-><init>(Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;Lcom/zykj/mistake/feature/collection/filter/q;Lh6/c;)V

    .line 9
    .line 10
    .line 11
    const/4 p1, 0x3

    .line 12
    invoke-static {v0, v2, v2, v1, p1}, Lkotlinx/coroutines/x;->v(Lkotlinx/coroutines/v;Lh6/h;Lkotlinx/coroutines/CoroutineStart;Lr6/e;I)Lkotlinx/coroutines/k1;

    .line 13
    .line 14
    .line 15
    return-void
.end method
