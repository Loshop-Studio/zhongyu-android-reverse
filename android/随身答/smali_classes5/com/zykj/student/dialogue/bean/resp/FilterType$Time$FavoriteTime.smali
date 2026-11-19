.class public abstract Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime;
.super Lcom/zykj/student/dialogue/bean/resp/FilterType$Time;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/student/dialogue/bean/resp/FilterType$Time;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "FavoriteTime"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime$Custom;,
        Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime$ThisMonth;,
        Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime$ThisWeek;,
        Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime$Unlimited;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u00002\u00020\u0001:\u0004\u000c\r\u000e\u000fB!\u0008\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\t\u0082\u0001\u0004\u0010\u0011\u0012\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime;",
        "Lcom/zykj/student/dialogue/bean/resp/FilterType$Time;",
        "timeRange",
        "",
        "start",
        "end",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
        "getTimeRange",
        "()Ljava/lang/String;",
        "getStart",
        "getEnd",
        "Unlimited",
        "ThisWeek",
        "ThisMonth",
        "Custom",
        "Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime$Custom;",
        "Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime$ThisMonth;",
        "Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime$ThisWeek;",
        "Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime$Unlimited;",
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
.field private final end:Ljava/lang/String;

.field private final start:Ljava/lang/String;

.field private final timeRange:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 3
    iput-object p1, p0, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime;->timeRange:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime;->start:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime;->end:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final getEnd()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime;->end:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getStart()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime;->start:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getTimeRange()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime;->timeRange:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
