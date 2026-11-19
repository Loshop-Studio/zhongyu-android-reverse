.class public final Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime$ThisMonth;
.super Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ThisMonth"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime$ThisMonth;",
        "Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime;",
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

.field public static final INSTANCE:Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime$ThisMonth;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime$ThisMonth;

    invoke-direct {v0}, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime$ThisMonth;-><init>()V

    sput-object v0, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime$ThisMonth;->INSTANCE:Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime$ThisMonth;

    return-void
.end method

.method private constructor <init>()V
    .locals 4

    .line 1
    sget-object v0, Lz6/a;->a:Lz6/a;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-static {v0, v2, v1, v2}, Lz6/a;->b(Lz6/a;Ljava/text/SimpleDateFormat;ILjava/lang/Object;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, ""

    .line 10
    .line 11
    const-string v3, "\u672c\u6708"

    .line 12
    .line 13
    invoke-direct {p0, v3, v0, v1, v2}, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
