.class public final Lcom/zykj/student/dialogue/bean/resp/HomeKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0011\u0010\u0000\u001a\u00020\u0001\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0002\u0010\u0003\"\u0017\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008\"\u0017\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\n0\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u0008\"\u0011\u0010\u000c\u001a\u00020\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000f\"\u0011\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013\"\u0011\u0010\u0014\u001a\u00020\u0015\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017\"\u0011\u0010\u0018\u001a\u00020\u0019\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u001b\"\u0011\u0010\u001c\u001a\u00020\u001d\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u001f\u00a8\u0006 "
    }
    d2 = {
        "InitialSubject",
        "Lcom/zykj/student/dialogue/bean/resp/FilterType$Subject;",
        "getInitialSubject",
        "()Lcom/zykj/student/dialogue/bean/resp/FilterType$Subject;",
        "InitialViewStatus",
        "",
        "Lcom/zykj/student/dialogue/bean/resp/FilterType$ViewStatus;",
        "getInitialViewStatus",
        "()Ljava/util/List;",
        "InitialTeacherViewStatus",
        "Lcom/zykj/student/dialogue/bean/resp/FilterType$TeacherViewStatus;",
        "getInitialTeacherViewStatus",
        "InitialQuestionState",
        "Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState$Unlimited;",
        "getInitialQuestionState",
        "()Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState$Unlimited;",
        "InitialJoinedTime",
        "Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime$Unlimited;",
        "getInitialJoinedTime",
        "()Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime$Unlimited;",
        "InitialFavoriteTime",
        "Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime$Unlimited;",
        "getInitialFavoriteTime",
        "()Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime$Unlimited;",
        "InitialUpdatedTime",
        "Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime$Unlimited;",
        "getInitialUpdatedTime",
        "()Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime$Unlimited;",
        "InitialSortType",
        "Lcom/zykj/student/dialogue/bean/resp/FilterType$Sort$SortByUpdatedTime;",
        "getInitialSortType",
        "()Lcom/zykj/student/dialogue/bean/resp/FilterType$Sort$SortByUpdatedTime;",
        "app_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final InitialFavoriteTime:Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime$Unlimited;

.field private static final InitialJoinedTime:Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime$Unlimited;

.field private static final InitialQuestionState:Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState$Unlimited;

.field private static final InitialSortType:Lcom/zykj/student/dialogue/bean/resp/FilterType$Sort$SortByUpdatedTime;

.field private static final InitialSubject:Lcom/zykj/student/dialogue/bean/resp/FilterType$Subject;

.field private static final InitialTeacherViewStatus:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/zykj/student/dialogue/bean/resp/FilterType$TeacherViewStatus;",
            ">;"
        }
    .end annotation
.end field

.field private static final InitialUpdatedTime:Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime$Unlimited;

.field private static final InitialViewStatus:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/zykj/student/dialogue/bean/resp/FilterType$ViewStatus;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/zykj/student/dialogue/bean/resp/FilterType$Subject;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "\u5168\u90e8\u79d1\u76ee"

    .line 5
    .line 6
    invoke-direct {v0, v1, v2}, Lcom/zykj/student/dialogue/bean/resp/FilterType$Subject;-><init>(ILjava/lang/String;)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lcom/zykj/student/dialogue/bean/resp/HomeKt;->InitialSubject:Lcom/zykj/student/dialogue/bean/resp/FilterType$Subject;

    .line 10
    .line 11
    sget-object v0, Lcom/zykj/student/dialogue/bean/resp/FilterType$ViewStatus$Unlimited;->INSTANCE:Lcom/zykj/student/dialogue/bean/resp/FilterType$ViewStatus$Unlimited;

    .line 12
    .line 13
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, Lcom/zykj/student/dialogue/bean/resp/HomeKt;->InitialViewStatus:Ljava/util/List;

    .line 18
    .line 19
    sget-object v0, Lcom/zykj/student/dialogue/bean/resp/FilterType$TeacherViewStatus$Unlimited;->INSTANCE:Lcom/zykj/student/dialogue/bean/resp/FilterType$TeacherViewStatus$Unlimited;

    .line 20
    .line 21
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, Lcom/zykj/student/dialogue/bean/resp/HomeKt;->InitialTeacherViewStatus:Ljava/util/List;

    .line 26
    .line 27
    sget-object v0, Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState$Unlimited;->INSTANCE:Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState$Unlimited;

    .line 28
    .line 29
    sput-object v0, Lcom/zykj/student/dialogue/bean/resp/HomeKt;->InitialQuestionState:Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState$Unlimited;

    .line 30
    .line 31
    sget-object v0, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime$Unlimited;->INSTANCE:Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime$Unlimited;

    .line 32
    .line 33
    sput-object v0, Lcom/zykj/student/dialogue/bean/resp/HomeKt;->InitialJoinedTime:Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime$Unlimited;

    .line 34
    .line 35
    sget-object v0, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime$Unlimited;->INSTANCE:Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime$Unlimited;

    .line 36
    .line 37
    sput-object v0, Lcom/zykj/student/dialogue/bean/resp/HomeKt;->InitialFavoriteTime:Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime$Unlimited;

    .line 38
    .line 39
    sget-object v0, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime$Unlimited;->INSTANCE:Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime$Unlimited;

    .line 40
    .line 41
    sput-object v0, Lcom/zykj/student/dialogue/bean/resp/HomeKt;->InitialUpdatedTime:Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime$Unlimited;

    .line 42
    .line 43
    sget-object v0, Lcom/zykj/student/dialogue/bean/resp/FilterType$Sort$SortByUpdatedTime;->INSTANCE:Lcom/zykj/student/dialogue/bean/resp/FilterType$Sort$SortByUpdatedTime;

    .line 44
    .line 45
    sput-object v0, Lcom/zykj/student/dialogue/bean/resp/HomeKt;->InitialSortType:Lcom/zykj/student/dialogue/bean/resp/FilterType$Sort$SortByUpdatedTime;

    .line 46
    .line 47
    return-void
.end method

.method public static final getInitialFavoriteTime()Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime$Unlimited;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/student/dialogue/bean/resp/HomeKt;->InitialFavoriteTime:Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime$Unlimited;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final getInitialJoinedTime()Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime$Unlimited;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/student/dialogue/bean/resp/HomeKt;->InitialJoinedTime:Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime$Unlimited;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final getInitialQuestionState()Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState$Unlimited;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/student/dialogue/bean/resp/HomeKt;->InitialQuestionState:Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState$Unlimited;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final getInitialSortType()Lcom/zykj/student/dialogue/bean/resp/FilterType$Sort$SortByUpdatedTime;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/student/dialogue/bean/resp/HomeKt;->InitialSortType:Lcom/zykj/student/dialogue/bean/resp/FilterType$Sort$SortByUpdatedTime;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final getInitialSubject()Lcom/zykj/student/dialogue/bean/resp/FilterType$Subject;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/student/dialogue/bean/resp/HomeKt;->InitialSubject:Lcom/zykj/student/dialogue/bean/resp/FilterType$Subject;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final getInitialTeacherViewStatus()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/student/dialogue/bean/resp/FilterType$TeacherViewStatus;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/student/dialogue/bean/resp/HomeKt;->InitialTeacherViewStatus:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final getInitialUpdatedTime()Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime$Unlimited;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/student/dialogue/bean/resp/HomeKt;->InitialUpdatedTime:Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime$Unlimited;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final getInitialViewStatus()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/student/dialogue/bean/resp/FilterType$ViewStatus;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/student/dialogue/bean/resp/HomeKt;->InitialViewStatus:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method
