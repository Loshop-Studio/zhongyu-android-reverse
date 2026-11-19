.class public final Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime$Unlimited;
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
    name = "Unlimited"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime$Unlimited;",
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

.field public static final INSTANCE:Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime$Unlimited;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime$Unlimited;

    invoke-direct {v0}, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime$Unlimited;-><init>()V

    sput-object v0, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime$Unlimited;->INSTANCE:Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime$Unlimited;

    const/16 v0, 0x8

    sput v0, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime$Unlimited;->$stable:I

    return-void
.end method

.method private constructor <init>()V
    .locals 7

    .line 1
    const/16 v5, 0x8

    .line 2
    .line 3
    const/4 v6, 0x0

    .line 4
    const-string v1, "\u4e0d\u9650"

    .line 5
    .line 6
    const-string v2, ""

    .line 7
    .line 8
    const-string v3, ""

    .line 9
    .line 10
    const/4 v4, 0x0

    .line 11
    move-object v0, p0

    .line 12
    invoke-direct/range {v0 .. v6}, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/UUID;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method
