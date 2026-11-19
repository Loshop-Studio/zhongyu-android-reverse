.class public final Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq$$serializer;,
        Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0018\u0002\n\u0002\u0008\u001a\u0008\u0007\u0018\u0000 L2\u00020\u0001:\u0002MLB\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003B\u00b9\u0001\u0008\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0008\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u000b\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0014\u001a\u00020\u0004\u0012\u0006\u0010\u0015\u001a\u00020\u0004\u0012\u0006\u0010\u0016\u001a\u00020\u0004\u0012\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u00a2\u0006\u0004\u0008\u0002\u0010\u0019J\'\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001\u00a2\u0006\u0004\u0008 \u0010!R$\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0006\u0010#\u001a\u0004\u0008$\u0010%\"\u0004\u0008&\u0010\'R\"\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0007\u0010(\u001a\u0004\u0008)\u0010*\"\u0004\u0008+\u0010,R$\u0010\t\u001a\u0004\u0018\u00010\u00088\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\t\u0010-\u001a\u0004\u0008.\u0010/\"\u0004\u00080\u00101R$\u0010\n\u001a\u0004\u0018\u00010\u00088\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\n\u0010-\u001a\u0004\u00082\u0010/\"\u0004\u00083\u00101R2\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000c0\u000bj\u0008\u0012\u0004\u0012\u00020\u000c`48\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\r\u00105\u001a\u0004\u00086\u00107\"\u0004\u00088\u00109R2\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u000bj\u0008\u0012\u0004\u0012\u00020\u0004`48\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000e\u00105\u001a\u0004\u0008:\u00107\"\u0004\u0008;\u00109R2\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u000bj\u0008\u0012\u0004\u0012\u00020\u0004`48\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000f\u00105\u001a\u0004\u0008<\u00107\"\u0004\u0008=\u00109R2\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u000bj\u0008\u0012\u0004\u0012\u00020\u0004`48\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0010\u00105\u001a\u0004\u0008>\u00107\"\u0004\u0008?\u00109R\"\u0010\u0011\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0011\u0010(\u001a\u0004\u0008@\u0010*\"\u0004\u0008A\u0010,R\"\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0012\u0010(\u001a\u0004\u0008B\u0010*\"\u0004\u0008C\u0010,R2\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u000bj\u0008\u0012\u0004\u0012\u00020\u0004`48\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0013\u00105\u001a\u0004\u0008D\u00107\"\u0004\u0008E\u00109R\"\u0010\u0014\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0014\u0010(\u001a\u0004\u0008F\u0010*\"\u0004\u0008G\u0010,R\"\u0010\u0015\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0015\u0010(\u001a\u0004\u0008H\u0010*\"\u0004\u0008I\u0010,R\"\u0010\u0016\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0016\u0010(\u001a\u0004\u0008J\u0010*\"\u0004\u0008K\u0010,\u00a8\u0006N"
    }
    d2 = {
        "Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;",
        "",
        "<init>",
        "()V",
        "",
        "seen0",
        "collectionId",
        "timeRange",
        "",
        "startTime",
        "endTime",
        "Ljava/util/ArrayList;",
        "",
        "topicIds",
        "diff",
        "attainedLevel",
        "errorReason",
        "currentCollectionStatus",
        "otherCollectionStatus",
        "tagIdList",
        "sortType",
        "skipCount",
        "maxResultCount",
        "Lm7/i1;",
        "serializationConstructorMarker",
        "(ILjava/lang/Integer;ILjava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;IILjava/util/ArrayList;IIILm7/i1;)V",
        "self",
        "Ll7/d;",
        "output",
        "Lk7/g;",
        "serialDesc",
        "Ld6/s;",
        "write$Self$app_release",
        "(Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;Ll7/d;Lk7/g;)V",
        "write$Self",
        "Ljava/lang/Integer;",
        "getCollectionId",
        "()Ljava/lang/Integer;",
        "setCollectionId",
        "(Ljava/lang/Integer;)V",
        "I",
        "getTimeRange",
        "()I",
        "setTimeRange",
        "(I)V",
        "Ljava/lang/String;",
        "getStartTime",
        "()Ljava/lang/String;",
        "setStartTime",
        "(Ljava/lang/String;)V",
        "getEndTime",
        "setEndTime",
        "Lkotlin/collections/ArrayList;",
        "Ljava/util/ArrayList;",
        "getTopicIds",
        "()Ljava/util/ArrayList;",
        "setTopicIds",
        "(Ljava/util/ArrayList;)V",
        "getDiff",
        "setDiff",
        "getAttainedLevel",
        "setAttainedLevel",
        "getErrorReason",
        "setErrorReason",
        "getCurrentCollectionStatus",
        "setCurrentCollectionStatus",
        "getOtherCollectionStatus",
        "setOtherCollectionStatus",
        "getTagIdList",
        "setTagIdList",
        "getSortType",
        "setSortType",
        "getSkipCount",
        "setSkipCount",
        "getMaxResultCount",
        "setMaxResultCount",
        "Companion",
        "$serializer",
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

.annotation runtime Lkotlinx/serialization/Serializable;
.end annotation


# static fields
.field private static final $childSerializers:[Ld6/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ld6/e;"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmField;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final $stable:I

.field public static final Companion:Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field private attainedLevel:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private collectionId:Ljava/lang/Integer;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private currentCollectionStatus:I

.field private diff:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private endTime:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private errorReason:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private maxResultCount:I

.field private otherCollectionStatus:I

.field private skipCount:I

.field private sortType:I

.field private startTime:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private tagIdList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private timeRange:I

.field private topicIds:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 13

    .line 1
    new-instance v0, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq$Companion;-><init>(Lkotlin/jvm/internal/e;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->Companion:Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq$Companion;

    .line 8
    .line 9
    const/16 v0, 0x8

    .line 10
    .line 11
    sput v0, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->$stable:I

    .line 12
    .line 13
    sget-object v2, Lkotlin/LazyThreadSafetyMode;->PUBLICATION:Lkotlin/LazyThreadSafetyMode;

    .line 14
    .line 15
    new-instance v3, Lcom/zykj/view/board/play/b;

    .line 16
    .line 17
    const/16 v4, 0xb

    .line 18
    .line 19
    invoke-direct {v3, v4}, Lcom/zykj/view/board/play/b;-><init>(I)V

    .line 20
    .line 21
    .line 22
    invoke-static {v2, v3}, Lkotlin/a;->a(Lkotlin/LazyThreadSafetyMode;Lr6/a;)Ld6/e;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    new-instance v5, Lcom/zykj/view/board/play/b;

    .line 27
    .line 28
    const/16 v6, 0xc

    .line 29
    .line 30
    invoke-direct {v5, v6}, Lcom/zykj/view/board/play/b;-><init>(I)V

    .line 31
    .line 32
    .line 33
    invoke-static {v2, v5}, Lkotlin/a;->a(Lkotlin/LazyThreadSafetyMode;Lr6/a;)Ld6/e;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    new-instance v7, Lcom/zykj/view/board/play/b;

    .line 38
    .line 39
    const/16 v8, 0xd

    .line 40
    .line 41
    invoke-direct {v7, v8}, Lcom/zykj/view/board/play/b;-><init>(I)V

    .line 42
    .line 43
    .line 44
    invoke-static {v2, v7}, Lkotlin/a;->a(Lkotlin/LazyThreadSafetyMode;Lr6/a;)Ld6/e;

    .line 45
    .line 46
    .line 47
    move-result-object v7

    .line 48
    new-instance v9, Lcom/zykj/view/board/play/b;

    .line 49
    .line 50
    const/16 v10, 0xe

    .line 51
    .line 52
    invoke-direct {v9, v10}, Lcom/zykj/view/board/play/b;-><init>(I)V

    .line 53
    .line 54
    .line 55
    invoke-static {v2, v9}, Lkotlin/a;->a(Lkotlin/LazyThreadSafetyMode;Lr6/a;)Ld6/e;

    .line 56
    .line 57
    .line 58
    move-result-object v9

    .line 59
    new-instance v11, Lcom/zykj/view/board/play/b;

    .line 60
    .line 61
    const/16 v12, 0xf

    .line 62
    .line 63
    invoke-direct {v11, v12}, Lcom/zykj/view/board/play/b;-><init>(I)V

    .line 64
    .line 65
    .line 66
    invoke-static {v2, v11}, Lkotlin/a;->a(Lkotlin/LazyThreadSafetyMode;Lr6/a;)Ld6/e;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    new-array v10, v10, [Ld6/e;

    .line 71
    .line 72
    const/4 v11, 0x0

    .line 73
    aput-object v1, v10, v11

    .line 74
    .line 75
    const/4 v11, 0x1

    .line 76
    aput-object v1, v10, v11

    .line 77
    .line 78
    const/4 v11, 0x2

    .line 79
    aput-object v1, v10, v11

    .line 80
    .line 81
    const/4 v11, 0x3

    .line 82
    aput-object v1, v10, v11

    .line 83
    .line 84
    const/4 v11, 0x4

    .line 85
    aput-object v3, v10, v11

    .line 86
    .line 87
    const/4 v3, 0x5

    .line 88
    aput-object v5, v10, v3

    .line 89
    .line 90
    const/4 v3, 0x6

    .line 91
    aput-object v7, v10, v3

    .line 92
    .line 93
    const/4 v3, 0x7

    .line 94
    aput-object v9, v10, v3

    .line 95
    .line 96
    aput-object v1, v10, v0

    .line 97
    .line 98
    const/16 v0, 0x9

    .line 99
    .line 100
    aput-object v1, v10, v0

    .line 101
    .line 102
    const/16 v0, 0xa

    .line 103
    .line 104
    aput-object v2, v10, v0

    .line 105
    .line 106
    aput-object v1, v10, v4

    .line 107
    .line 108
    aput-object v1, v10, v6

    .line 109
    .line 110
    aput-object v1, v10, v8

    .line 111
    .line 112
    sput-object v10, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->$childSerializers:[Ld6/e;

    .line 113
    .line 114
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->topicIds:Ljava/util/ArrayList;

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->diff:Ljava/util/ArrayList;

    .line 4
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->attainedLevel:Ljava/util/ArrayList;

    .line 5
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->errorReason:Ljava/util/ArrayList;

    .line 6
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->tagIdList:Ljava/util/ArrayList;

    const/16 v0, 0x14

    .line 7
    iput v0, p0, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->maxResultCount:I

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Integer;ILjava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;IILjava/util/ArrayList;IIILm7/i1;)V
    .locals 2

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 v0, p1, 0x1

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iput-object v1, p0, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->collectionId:Ljava/lang/Integer;

    goto :goto_0

    :cond_0
    iput-object p2, p0, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->collectionId:Ljava/lang/Integer;

    :goto_0
    and-int/lit8 p2, p1, 0x2

    const/4 v0, 0x0

    if-nez p2, :cond_1

    iput v0, p0, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->timeRange:I

    goto :goto_1

    :cond_1
    iput p3, p0, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->timeRange:I

    :goto_1
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    iput-object v1, p0, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->startTime:Ljava/lang/String;

    goto :goto_2

    :cond_2
    iput-object p4, p0, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->startTime:Ljava/lang/String;

    :goto_2
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_3

    iput-object v1, p0, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->endTime:Ljava/lang/String;

    goto :goto_3

    :cond_3
    iput-object p5, p0, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->endTime:Ljava/lang/String;

    :goto_3
    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_4

    .line 9
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 10
    iput-object p2, p0, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->topicIds:Ljava/util/ArrayList;

    goto :goto_4

    :cond_4
    iput-object p6, p0, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->topicIds:Ljava/util/ArrayList;

    :goto_4
    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_5

    .line 11
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 12
    iput-object p2, p0, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->diff:Ljava/util/ArrayList;

    goto :goto_5

    :cond_5
    iput-object p7, p0, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->diff:Ljava/util/ArrayList;

    :goto_5
    and-int/lit8 p2, p1, 0x40

    if-nez p2, :cond_6

    .line 13
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 14
    iput-object p2, p0, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->attainedLevel:Ljava/util/ArrayList;

    goto :goto_6

    :cond_6
    iput-object p8, p0, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->attainedLevel:Ljava/util/ArrayList;

    :goto_6
    and-int/lit16 p2, p1, 0x80

    if-nez p2, :cond_7

    .line 15
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 16
    iput-object p2, p0, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->errorReason:Ljava/util/ArrayList;

    goto :goto_7

    :cond_7
    iput-object p9, p0, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->errorReason:Ljava/util/ArrayList;

    :goto_7
    and-int/lit16 p2, p1, 0x100

    if-nez p2, :cond_8

    iput v0, p0, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->currentCollectionStatus:I

    goto :goto_8

    :cond_8
    iput p10, p0, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->currentCollectionStatus:I

    :goto_8
    and-int/lit16 p2, p1, 0x200

    if-nez p2, :cond_9

    iput v0, p0, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->otherCollectionStatus:I

    goto :goto_9

    :cond_9
    iput p11, p0, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->otherCollectionStatus:I

    :goto_9
    and-int/lit16 p2, p1, 0x400

    if-nez p2, :cond_a

    .line 17
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 18
    iput-object p2, p0, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->tagIdList:Ljava/util/ArrayList;

    goto :goto_a

    :cond_a
    iput-object p12, p0, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->tagIdList:Ljava/util/ArrayList;

    :goto_a
    and-int/lit16 p2, p1, 0x800

    if-nez p2, :cond_b

    iput v0, p0, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->sortType:I

    goto :goto_b

    :cond_b
    iput p13, p0, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->sortType:I

    :goto_b
    and-int/lit16 p2, p1, 0x1000

    if-nez p2, :cond_c

    iput v0, p0, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->skipCount:I

    goto :goto_c

    :cond_c
    move/from16 p2, p14

    iput p2, p0, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->skipCount:I

    :goto_c
    and-int/lit16 p1, p1, 0x2000

    if-nez p1, :cond_d

    const/16 p1, 0x14

    :goto_d
    iput p1, p0, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->maxResultCount:I

    return-void

    :cond_d
    move/from16 p1, p15

    goto :goto_d
.end method

.method private static final synthetic _childSerializers$_anonymous_()Li7/b;
    .locals 3

    .line 1
    new-instance v0, Lm7/d;

    sget-object v1, Lm7/o0;->a:Lm7/o0;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lm7/d;-><init>(Li7/b;I)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Li7/b;
    .locals 3

    .line 1
    new-instance v0, Lm7/d;

    sget-object v1, Lm7/j0;->a:Lm7/j0;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lm7/d;-><init>(Li7/b;I)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$1()Li7/b;
    .locals 3

    .line 1
    new-instance v0, Lm7/d;

    sget-object v1, Lm7/j0;->a:Lm7/j0;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lm7/d;-><init>(Li7/b;I)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$2()Li7/b;
    .locals 3

    .line 1
    new-instance v0, Lm7/d;

    sget-object v1, Lm7/j0;->a:Lm7/j0;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lm7/d;-><init>(Li7/b;I)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$3()Li7/b;
    .locals 3

    .line 1
    new-instance v0, Lm7/d;

    sget-object v1, Lm7/j0;->a:Lm7/j0;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lm7/d;-><init>(Li7/b;I)V

    return-object v0
.end method

.method public static synthetic a()Li7/b;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->_childSerializers$_anonymous_$1()Li7/b;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ld6/e;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->$childSerializers:[Ld6/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic b()Li7/b;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->_childSerializers$_anonymous_$0()Li7/b;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Li7/b;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->_childSerializers$_anonymous_()Li7/b;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic d()Li7/b;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->_childSerializers$_anonymous_$3()Li7/b;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic e()Li7/b;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->_childSerializers$_anonymous_$2()Li7/b;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic write$Self$app_release(Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;Ll7/d;Lk7/g;)V
    .locals 4
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->$childSerializers:[Ld6/e;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-interface {p1, p2, v1}, Ll7/d;->shouldEncodeElementDefault(Lk7/g;I)Z

    .line 5
    .line 6
    .line 7
    move-result v2

    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    iget-object v2, p0, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->collectionId:Ljava/lang/Integer;

    .line 12
    .line 13
    if-eqz v2, :cond_1

    .line 14
    .line 15
    :goto_0
    sget-object v2, Lm7/j0;->a:Lm7/j0;

    .line 16
    .line 17
    iget-object v3, p0, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->collectionId:Ljava/lang/Integer;

    .line 18
    .line 19
    invoke-interface {p1, p2, v1, v2, v3}, Ll7/d;->encodeNullableSerializableElement(Lk7/g;ILi7/e;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    :cond_1
    const/4 v1, 0x1

    .line 23
    invoke-interface {p1, p2, v1}, Ll7/d;->shouldEncodeElementDefault(Lk7/g;I)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_2

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_2
    iget v2, p0, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->timeRange:I

    .line 31
    .line 32
    if-eqz v2, :cond_3

    .line 33
    .line 34
    :goto_1
    iget v2, p0, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->timeRange:I

    .line 35
    .line 36
    invoke-interface {p1, p2, v1, v2}, Ll7/d;->encodeIntElement(Lk7/g;II)V

    .line 37
    .line 38
    .line 39
    :cond_3
    const/4 v1, 0x2

    .line 40
    invoke-interface {p1, p2, v1}, Ll7/d;->shouldEncodeElementDefault(Lk7/g;I)Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-eqz v2, :cond_4

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_4
    iget-object v2, p0, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->startTime:Ljava/lang/String;

    .line 48
    .line 49
    if-eqz v2, :cond_5

    .line 50
    .line 51
    :goto_2
    sget-object v2, Lm7/m1;->a:Lm7/m1;

    .line 52
    .line 53
    iget-object v3, p0, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->startTime:Ljava/lang/String;

    .line 54
    .line 55
    invoke-interface {p1, p2, v1, v2, v3}, Ll7/d;->encodeNullableSerializableElement(Lk7/g;ILi7/e;Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    :cond_5
    const/4 v1, 0x3

    .line 59
    invoke-interface {p1, p2, v1}, Ll7/d;->shouldEncodeElementDefault(Lk7/g;I)Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-eqz v2, :cond_6

    .line 64
    .line 65
    goto :goto_3

    .line 66
    :cond_6
    iget-object v2, p0, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->endTime:Ljava/lang/String;

    .line 67
    .line 68
    if-eqz v2, :cond_7

    .line 69
    .line 70
    :goto_3
    sget-object v2, Lm7/m1;->a:Lm7/m1;

    .line 71
    .line 72
    iget-object v3, p0, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->endTime:Ljava/lang/String;

    .line 73
    .line 74
    invoke-interface {p1, p2, v1, v2, v3}, Ll7/d;->encodeNullableSerializableElement(Lk7/g;ILi7/e;Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    :cond_7
    const/4 v1, 0x4

    .line 78
    invoke-interface {p1, p2, v1}, Ll7/d;->shouldEncodeElementDefault(Lk7/g;I)Z

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    if-eqz v2, :cond_8

    .line 83
    .line 84
    goto :goto_4

    .line 85
    :cond_8
    iget-object v2, p0, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->topicIds:Ljava/util/ArrayList;

    .line 86
    .line 87
    new-instance v3, Ljava/util/ArrayList;

    .line 88
    .line 89
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 90
    .line 91
    .line 92
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v2

    .line 96
    if-nez v2, :cond_9

    .line 97
    .line 98
    :goto_4
    aget-object v2, v0, v1

    .line 99
    .line 100
    invoke-interface {v2}, Ld6/e;->getValue()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    check-cast v2, Li7/e;

    .line 105
    .line 106
    iget-object v3, p0, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->topicIds:Ljava/util/ArrayList;

    .line 107
    .line 108
    invoke-interface {p1, p2, v1, v2, v3}, Ll7/d;->encodeSerializableElement(Lk7/g;ILi7/e;Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    :cond_9
    const/4 v1, 0x5

    .line 112
    invoke-interface {p1, p2, v1}, Ll7/d;->shouldEncodeElementDefault(Lk7/g;I)Z

    .line 113
    .line 114
    .line 115
    move-result v2

    .line 116
    if-eqz v2, :cond_a

    .line 117
    .line 118
    goto :goto_5

    .line 119
    :cond_a
    iget-object v2, p0, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->diff:Ljava/util/ArrayList;

    .line 120
    .line 121
    new-instance v3, Ljava/util/ArrayList;

    .line 122
    .line 123
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 124
    .line 125
    .line 126
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result v2

    .line 130
    if-nez v2, :cond_b

    .line 131
    .line 132
    :goto_5
    aget-object v2, v0, v1

    .line 133
    .line 134
    invoke-interface {v2}, Ld6/e;->getValue()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    check-cast v2, Li7/e;

    .line 139
    .line 140
    iget-object v3, p0, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->diff:Ljava/util/ArrayList;

    .line 141
    .line 142
    invoke-interface {p1, p2, v1, v2, v3}, Ll7/d;->encodeSerializableElement(Lk7/g;ILi7/e;Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    :cond_b
    const/4 v1, 0x6

    .line 146
    invoke-interface {p1, p2, v1}, Ll7/d;->shouldEncodeElementDefault(Lk7/g;I)Z

    .line 147
    .line 148
    .line 149
    move-result v2

    .line 150
    if-eqz v2, :cond_c

    .line 151
    .line 152
    goto :goto_6

    .line 153
    :cond_c
    iget-object v2, p0, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->attainedLevel:Ljava/util/ArrayList;

    .line 154
    .line 155
    new-instance v3, Ljava/util/ArrayList;

    .line 156
    .line 157
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 158
    .line 159
    .line 160
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    move-result v2

    .line 164
    if-nez v2, :cond_d

    .line 165
    .line 166
    :goto_6
    aget-object v2, v0, v1

    .line 167
    .line 168
    invoke-interface {v2}, Ld6/e;->getValue()Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    check-cast v2, Li7/e;

    .line 173
    .line 174
    iget-object v3, p0, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->attainedLevel:Ljava/util/ArrayList;

    .line 175
    .line 176
    invoke-interface {p1, p2, v1, v2, v3}, Ll7/d;->encodeSerializableElement(Lk7/g;ILi7/e;Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    :cond_d
    const/4 v1, 0x7

    .line 180
    invoke-interface {p1, p2, v1}, Ll7/d;->shouldEncodeElementDefault(Lk7/g;I)Z

    .line 181
    .line 182
    .line 183
    move-result v2

    .line 184
    if-eqz v2, :cond_e

    .line 185
    .line 186
    goto :goto_7

    .line 187
    :cond_e
    iget-object v2, p0, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->errorReason:Ljava/util/ArrayList;

    .line 188
    .line 189
    new-instance v3, Ljava/util/ArrayList;

    .line 190
    .line 191
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 192
    .line 193
    .line 194
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    move-result v2

    .line 198
    if-nez v2, :cond_f

    .line 199
    .line 200
    :goto_7
    aget-object v2, v0, v1

    .line 201
    .line 202
    invoke-interface {v2}, Ld6/e;->getValue()Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v2

    .line 206
    check-cast v2, Li7/e;

    .line 207
    .line 208
    iget-object v3, p0, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->errorReason:Ljava/util/ArrayList;

    .line 209
    .line 210
    invoke-interface {p1, p2, v1, v2, v3}, Ll7/d;->encodeSerializableElement(Lk7/g;ILi7/e;Ljava/lang/Object;)V

    .line 211
    .line 212
    .line 213
    :cond_f
    const/16 v1, 0x8

    .line 214
    .line 215
    invoke-interface {p1, p2, v1}, Ll7/d;->shouldEncodeElementDefault(Lk7/g;I)Z

    .line 216
    .line 217
    .line 218
    move-result v2

    .line 219
    if-eqz v2, :cond_10

    .line 220
    .line 221
    goto :goto_8

    .line 222
    :cond_10
    iget v2, p0, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->currentCollectionStatus:I

    .line 223
    .line 224
    if-eqz v2, :cond_11

    .line 225
    .line 226
    :goto_8
    iget v2, p0, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->currentCollectionStatus:I

    .line 227
    .line 228
    invoke-interface {p1, p2, v1, v2}, Ll7/d;->encodeIntElement(Lk7/g;II)V

    .line 229
    .line 230
    .line 231
    :cond_11
    const/16 v1, 0x9

    .line 232
    .line 233
    invoke-interface {p1, p2, v1}, Ll7/d;->shouldEncodeElementDefault(Lk7/g;I)Z

    .line 234
    .line 235
    .line 236
    move-result v2

    .line 237
    if-eqz v2, :cond_12

    .line 238
    .line 239
    goto :goto_9

    .line 240
    :cond_12
    iget v2, p0, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->otherCollectionStatus:I

    .line 241
    .line 242
    if-eqz v2, :cond_13

    .line 243
    .line 244
    :goto_9
    iget v2, p0, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->otherCollectionStatus:I

    .line 245
    .line 246
    invoke-interface {p1, p2, v1, v2}, Ll7/d;->encodeIntElement(Lk7/g;II)V

    .line 247
    .line 248
    .line 249
    :cond_13
    const/16 v1, 0xa

    .line 250
    .line 251
    invoke-interface {p1, p2, v1}, Ll7/d;->shouldEncodeElementDefault(Lk7/g;I)Z

    .line 252
    .line 253
    .line 254
    move-result v2

    .line 255
    if-eqz v2, :cond_14

    .line 256
    .line 257
    goto :goto_a

    .line 258
    :cond_14
    iget-object v2, p0, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->tagIdList:Ljava/util/ArrayList;

    .line 259
    .line 260
    new-instance v3, Ljava/util/ArrayList;

    .line 261
    .line 262
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 263
    .line 264
    .line 265
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 266
    .line 267
    .line 268
    move-result v2

    .line 269
    if-nez v2, :cond_15

    .line 270
    .line 271
    :goto_a
    aget-object v0, v0, v1

    .line 272
    .line 273
    invoke-interface {v0}, Ld6/e;->getValue()Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object v0

    .line 277
    check-cast v0, Li7/e;

    .line 278
    .line 279
    iget-object v2, p0, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->tagIdList:Ljava/util/ArrayList;

    .line 280
    .line 281
    invoke-interface {p1, p2, v1, v0, v2}, Ll7/d;->encodeSerializableElement(Lk7/g;ILi7/e;Ljava/lang/Object;)V

    .line 282
    .line 283
    .line 284
    :cond_15
    const/16 v0, 0xb

    .line 285
    .line 286
    invoke-interface {p1, p2, v0}, Ll7/d;->shouldEncodeElementDefault(Lk7/g;I)Z

    .line 287
    .line 288
    .line 289
    move-result v1

    .line 290
    if-eqz v1, :cond_16

    .line 291
    .line 292
    goto :goto_b

    .line 293
    :cond_16
    iget v1, p0, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->sortType:I

    .line 294
    .line 295
    if-eqz v1, :cond_17

    .line 296
    .line 297
    :goto_b
    iget v1, p0, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->sortType:I

    .line 298
    .line 299
    invoke-interface {p1, p2, v0, v1}, Ll7/d;->encodeIntElement(Lk7/g;II)V

    .line 300
    .line 301
    .line 302
    :cond_17
    const/16 v0, 0xc

    .line 303
    .line 304
    invoke-interface {p1, p2, v0}, Ll7/d;->shouldEncodeElementDefault(Lk7/g;I)Z

    .line 305
    .line 306
    .line 307
    move-result v1

    .line 308
    if-eqz v1, :cond_18

    .line 309
    .line 310
    goto :goto_c

    .line 311
    :cond_18
    iget v1, p0, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->skipCount:I

    .line 312
    .line 313
    if-eqz v1, :cond_19

    .line 314
    .line 315
    :goto_c
    iget v1, p0, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->skipCount:I

    .line 316
    .line 317
    invoke-interface {p1, p2, v0, v1}, Ll7/d;->encodeIntElement(Lk7/g;II)V

    .line 318
    .line 319
    .line 320
    :cond_19
    const/16 v0, 0xd

    .line 321
    .line 322
    invoke-interface {p1, p2, v0}, Ll7/d;->shouldEncodeElementDefault(Lk7/g;I)Z

    .line 323
    .line 324
    .line 325
    move-result v1

    .line 326
    if-eqz v1, :cond_1a

    .line 327
    .line 328
    goto :goto_d

    .line 329
    :cond_1a
    iget v1, p0, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->maxResultCount:I

    .line 330
    .line 331
    const/16 v2, 0x14

    .line 332
    .line 333
    if-eq v1, v2, :cond_1b

    .line 334
    .line 335
    :goto_d
    iget p0, p0, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->maxResultCount:I

    .line 336
    .line 337
    invoke-interface {p1, p2, v0, p0}, Ll7/d;->encodeIntElement(Lk7/g;II)V

    .line 338
    .line 339
    .line 340
    :cond_1b
    return-void
.end method


# virtual methods
.method public final getAttainedLevel()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->attainedLevel:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getCollectionId()Ljava/lang/Integer;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->collectionId:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getCurrentCollectionStatus()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->currentCollectionStatus:I

    .line 2
    .line 3
    return v0
.end method

.method public final getDiff()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->diff:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getEndTime()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->endTime:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getErrorReason()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->errorReason:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getMaxResultCount()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->maxResultCount:I

    .line 2
    .line 3
    return v0
.end method

.method public final getOtherCollectionStatus()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->otherCollectionStatus:I

    .line 2
    .line 3
    return v0
.end method

.method public final getSkipCount()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->skipCount:I

    .line 2
    .line 3
    return v0
.end method

.method public final getSortType()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->sortType:I

    .line 2
    .line 3
    return v0
.end method

.method public final getStartTime()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->startTime:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getTagIdList()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->tagIdList:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getTimeRange()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->timeRange:I

    .line 2
    .line 3
    return v0
.end method

.method public final getTopicIds()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->topicIds:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object v0
.end method

.method public final setAttainedLevel(Ljava/util/ArrayList;)V
    .locals 1
    .param p1    # Ljava/util/ArrayList;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->attainedLevel:Ljava/util/ArrayList;

    .line 7
    .line 8
    return-void
.end method

.method public final setCollectionId(Ljava/lang/Integer;)V
    .locals 0
    .param p1    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->collectionId:Ljava/lang/Integer;

    .line 2
    .line 3
    return-void
.end method

.method public final setCurrentCollectionStatus(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->currentCollectionStatus:I

    .line 2
    .line 3
    return-void
.end method

.method public final setDiff(Ljava/util/ArrayList;)V
    .locals 1
    .param p1    # Ljava/util/ArrayList;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->diff:Ljava/util/ArrayList;

    .line 7
    .line 8
    return-void
.end method

.method public final setEndTime(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->endTime:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setErrorReason(Ljava/util/ArrayList;)V
    .locals 1
    .param p1    # Ljava/util/ArrayList;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->errorReason:Ljava/util/ArrayList;

    .line 7
    .line 8
    return-void
.end method

.method public final setMaxResultCount(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->maxResultCount:I

    .line 2
    .line 3
    return-void
.end method

.method public final setOtherCollectionStatus(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->otherCollectionStatus:I

    .line 2
    .line 3
    return-void
.end method

.method public final setSkipCount(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->skipCount:I

    .line 2
    .line 3
    return-void
.end method

.method public final setSortType(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->sortType:I

    .line 2
    .line 3
    return-void
.end method

.method public final setStartTime(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->startTime:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setTagIdList(Ljava/util/ArrayList;)V
    .locals 1
    .param p1    # Ljava/util/ArrayList;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->tagIdList:Ljava/util/ArrayList;

    .line 7
    .line 8
    return-void
.end method

.method public final setTimeRange(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->timeRange:I

    .line 2
    .line 3
    return-void
.end method

.method public final setTopicIds(Ljava/util/ArrayList;)V
    .locals 1
    .param p1    # Ljava/util/ArrayList;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->topicIds:Ljava/util/ArrayList;

    .line 7
    .line 8
    return-void
.end method
