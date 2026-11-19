.class public final Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/evaluation/upload/MultiAnswerUploadWork;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(JJILjava/util/List;)Landroidx/work/OneTimeWorkRequest$Builder;
    .locals 3

    .line 1
    const-string v0, "uploadAnswerList"

    .line 2
    .line 3
    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroidx/work/OneTimeWorkRequest$Builder;

    .line 7
    .line 8
    const-class v1, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork;

    .line 9
    .line 10
    invoke-direct {v0, v1}, Landroidx/work/OneTimeWorkRequest$Builder;-><init>(Ljava/lang/Class;)V

    .line 11
    .line 12
    .line 13
    new-instance v1, Landroidx/work/Data$Builder;

    .line 14
    .line 15
    invoke-direct {v1}, Landroidx/work/Data$Builder;-><init>()V

    .line 16
    .line 17
    .line 18
    const-string v2, "USER_ID"

    .line 19
    .line 20
    invoke-virtual {v1, v2, p1, p2}, Landroidx/work/Data$Builder;->putLong(Ljava/lang/String;J)Landroidx/work/Data$Builder;

    .line 21
    .line 22
    .line 23
    const-string p1, "TASK_ID"

    .line 24
    .line 25
    invoke-virtual {v1, p1, p3, p4}, Landroidx/work/Data$Builder;->putLong(Ljava/lang/String;J)Landroidx/work/Data$Builder;

    .line 26
    .line 27
    .line 28
    const-string p1, "TASK_STATE"

    .line 29
    .line 30
    invoke-virtual {v1, p1, p5}, Landroidx/work/Data$Builder;->putInt(Ljava/lang/String;I)Landroidx/work/Data$Builder;

    .line 31
    .line 32
    .line 33
    new-instance p1, Ljava/util/ArrayList;

    .line 34
    .line 35
    const/16 p2, 0xa

    .line 36
    .line 37
    invoke-static {p6, p2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 38
    .line 39
    .line 40
    move-result p2

    .line 41
    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(I)V

    .line 42
    .line 43
    .line 44
    invoke-interface {p6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result p3

    .line 52
    if-eqz p3, :cond_0

    .line 53
    .line 54
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p3

    .line 58
    check-cast p3, Lkotlin/Pair;

    .line 59
    .line 60
    invoke-static {p3}, Lcom/blankj/utilcode/util/GsonUtils;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p3

    .line 64
    invoke-interface {p1, p3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_0
    const/4 p2, 0x0

    .line 69
    new-array p2, p2, [Ljava/lang/String;

    .line 70
    .line 71
    invoke-interface {p1, p2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    check-cast p1, [Ljava/lang/String;

    .line 76
    .line 77
    const-string p2, "ANSWER_DATA"

    .line 78
    .line 79
    invoke-virtual {v1, p2, p1}, Landroidx/work/Data$Builder;->putStringArray(Ljava/lang/String;[Ljava/lang/String;)Landroidx/work/Data$Builder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1}, Landroidx/work/Data$Builder;->build()Landroidx/work/Data;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    invoke-virtual {v0, p1}, Landroidx/work/WorkRequest$Builder;->setInputData(Landroidx/work/Data;)Landroidx/work/WorkRequest$Builder;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    check-cast p1, Landroidx/work/OneTimeWorkRequest$Builder;

    .line 91
    .line 92
    return-object p1
.end method
