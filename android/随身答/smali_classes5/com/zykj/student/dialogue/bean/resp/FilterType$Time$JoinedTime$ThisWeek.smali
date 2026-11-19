.class public final Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime$ThisWeek;
.super Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ThisWeek"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime$ThisWeek;",
        "Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime;",
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


# static fields
.field public static final $stable:I

.field public static final INSTANCE:Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime$ThisWeek;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime$ThisWeek;

    invoke-direct {v0}, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime$ThisWeek;-><init>()V

    sput-object v0, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime$ThisWeek;->INSTANCE:Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime$ThisWeek;

    const/16 v0, 0x8

    sput v0, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime$ThisWeek;->$stable:I

    return-void
.end method

.method private constructor <init>()V
    .locals 10

    .line 1
    sget-object v0, Lz6/a;->a:Lz6/a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    invoke-static {v0, v1, v2, v1}, Lz6/a;->d(Lz6/a;Ljava/text/SimpleDateFormat;ILjava/lang/Object;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v5

    .line 9
    const/16 v8, 0x8

    .line 10
    .line 11
    const/4 v9, 0x0

    .line 12
    const-string v4, "\u672c\u5468"

    .line 13
    .line 14
    const-string v6, ""

    .line 15
    .line 16
    const/4 v7, 0x0

    .line 17
    move-object v3, p0

    .line 18
    invoke-direct/range {v3 .. v9}, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/UUID;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method
