.class public abstract Lcom/zykj/student/dialogue/bean/resp/FilterType$Time;
.super Lcom/zykj/student/dialogue/bean/resp/FilterType;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/student/dialogue/bean/resp/FilterType;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Time"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime;,
        Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime;,
        Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u00002\u00020\u0001:\u0003\r\u000e\u000fB!\u0008\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0006\u0010\u000b\u001a\u00020\u0003J\u0006\u0010\u000c\u001a\u00020\u0003R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\t\u0082\u0001\u0003\u0010\u0011\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/zykj/student/dialogue/bean/resp/FilterType$Time;",
        "Lcom/zykj/student/dialogue/bean/resp/FilterType;",
        "time",
        "",
        "startDateTime",
        "endDateTime",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
        "getStartDateTime",
        "()Ljava/lang/String;",
        "getEndDateTime",
        "parseStartTime",
        "parseEndTime",
        "JoinedTime",
        "UpdatedTime",
        "FavoriteTime",
        "Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime;",
        "Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime;",
        "Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime;",
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


# static fields
.field public static final $stable:I


# instance fields
.field private final endDateTime:Ljava/lang/String;

.field private final startDateTime:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, v0}, Lcom/zykj/student/dialogue/bean/resp/FilterType;-><init>(Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 3
    iput-object p2, p0, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time;->startDateTime:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time;->endDateTime:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final getEndDateTime()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time;->endDateTime:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getStartDateTime()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time;->startDateTime:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final parseEndTime()Ljava/lang/String;
    .locals 3

    .line 1
    instance-of v0, p0, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime$Custom;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    instance-of v0, p0, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime$Custom;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    instance-of v0, p0, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime$Custom;

    .line 10
    .line 11
    if-eqz v0, :cond_2

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time;->endDateTime:Ljava/lang/String;

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-lez v0, :cond_2

    .line 20
    .line 21
    iget-object v0, p0, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time;->endDateTime:Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    const/16 v1, 0x13

    .line 28
    .line 29
    if-ne v0, v1, :cond_1

    .line 30
    .line 31
    iget-object v0, p0, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time;->endDateTime:Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    add-int/lit8 v1, v1, -0x3

    .line 38
    .line 39
    const/4 v2, 0x0

    .line 40
    invoke-virtual {v0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    const-string v1, "substring(...)"

    .line 45
    .line 46
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    return-object v0

    .line 50
    :cond_1
    iget-object v0, p0, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time;->endDateTime:Ljava/lang/String;

    .line 51
    .line 52
    return-object v0

    .line 53
    :cond_2
    iget-object v0, p0, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time;->endDateTime:Ljava/lang/String;

    .line 54
    .line 55
    return-object v0
.end method

.method public final parseStartTime()Ljava/lang/String;
    .locals 3

    .line 1
    instance-of v0, p0, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime$Custom;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    instance-of v0, p0, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime$Custom;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    instance-of v0, p0, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime$Custom;

    .line 10
    .line 11
    if-eqz v0, :cond_2

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time;->startDateTime:Ljava/lang/String;

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-lez v0, :cond_2

    .line 20
    .line 21
    iget-object v0, p0, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time;->startDateTime:Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    const/16 v1, 0x13

    .line 28
    .line 29
    if-ne v0, v1, :cond_1

    .line 30
    .line 31
    iget-object v0, p0, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time;->startDateTime:Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    add-int/lit8 v1, v1, -0x3

    .line 38
    .line 39
    const/4 v2, 0x0

    .line 40
    invoke-virtual {v0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    const-string v1, "substring(...)"

    .line 45
    .line 46
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    return-object v0

    .line 50
    :cond_1
    iget-object v0, p0, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time;->startDateTime:Ljava/lang/String;

    .line 51
    .line 52
    return-object v0

    .line 53
    :cond_2
    iget-object v0, p0, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time;->startDateTime:Ljava/lang/String;

    .line 54
    .line 55
    return-object v0
.end method
