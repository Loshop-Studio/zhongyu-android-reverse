.class public final Lcom/zykj/student/dialogue/bean/resp/FilterType$ViewStatus$NotViewed;
.super Lcom/zykj/student/dialogue/bean/resp/FilterType$ViewStatus;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/student/dialogue/bean/resp/FilterType$ViewStatus;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "NotViewed"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcom/zykj/student/dialogue/bean/resp/FilterType$ViewStatus$NotViewed;",
        "Lcom/zykj/student/dialogue/bean/resp/FilterType$ViewStatus;",
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

.field public static final INSTANCE:Lcom/zykj/student/dialogue/bean/resp/FilterType$ViewStatus$NotViewed;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/zykj/student/dialogue/bean/resp/FilterType$ViewStatus$NotViewed;

    invoke-direct {v0}, Lcom/zykj/student/dialogue/bean/resp/FilterType$ViewStatus$NotViewed;-><init>()V

    sput-object v0, Lcom/zykj/student/dialogue/bean/resp/FilterType$ViewStatus$NotViewed;->INSTANCE:Lcom/zykj/student/dialogue/bean/resp/FilterType$ViewStatus$NotViewed;

    return-void
.end method

.method private constructor <init>()V
    .locals 3

    .line 1
    const-string v0, "\u6211\u672a\u67e5\u770b"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x4

    .line 5
    invoke-direct {p0, v2, v0, v1}, Lcom/zykj/student/dialogue/bean/resp/FilterType$ViewStatus;-><init>(ILjava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
