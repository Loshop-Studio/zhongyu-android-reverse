.class public abstract Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime;
.super Lcom/zykj/student/dialogue/bean/resp/FilterType$Time;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/student/dialogue/bean/resp/FilterType$Time;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "JoinedTime"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime$Custom;,
        Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime$ThisMonth;,
        Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime$ThisWeek;,
        Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime$Unlimited;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u00002\u00020\u0001:\u0004\u0010\u0011\u0012\u0013B+\u0008\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000f\u0082\u0001\u0004\u0014\u0015\u0016\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime;",
        "Lcom/zykj/student/dialogue/bean/resp/FilterType$Time;",
        "timeRange",
        "",
        "start",
        "end",
        "uuid",
        "Ljava/util/UUID;",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/UUID;)V",
        "getTimeRange",
        "()Ljava/lang/String;",
        "getStart",
        "getEnd",
        "getUuid",
        "()Ljava/util/UUID;",
        "Unlimited",
        "ThisWeek",
        "ThisMonth",
        "Custom",
        "Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime$Custom;",
        "Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime$ThisMonth;",
        "Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime$ThisWeek;",
        "Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime$Unlimited;",
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
.field public static final $stable:I = 0x8


# instance fields
.field private final end:Ljava/lang/String;

.field private final start:Ljava/lang/String;

.field private final timeRange:Ljava/lang/String;

.field private final uuid:Ljava/util/UUID;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/UUID;)V
    .locals 1

    const/4 v0, 0x0

    .line 4
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    iput-object p1, p0, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime;->timeRange:Ljava/lang/String;

    .line 6
    iput-object p2, p0, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime;->start:Ljava/lang/String;

    .line 7
    iput-object p3, p0, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime;->end:Ljava/lang/String;

    .line 8
    iput-object p4, p0, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime;->uuid:Ljava/util/UUID;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/UUID;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    .line 2
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object p4

    const-string p5, "randomUUID(...)"

    invoke-static {p4, p5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    move-object v4, p4

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    .line 3
    invoke-direct/range {v0 .. v5}, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/UUID;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/UUID;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/UUID;)V

    return-void
.end method


# virtual methods
.method public final getEnd()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime;->end:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getStart()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime;->start:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getTimeRange()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime;->timeRange:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getUuid()Ljava/util/UUID;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime;->uuid:Ljava/util/UUID;

    .line 2
    .line 3
    return-object v0
.end method
