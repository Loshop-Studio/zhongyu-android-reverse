.class public final Landroidx/constraintlayout/compose/SwipeSide;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation

.annotation build Landroidx/constraintlayout/compose/ExperimentalMotionApi;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/constraintlayout/compose/SwipeSide$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\u0008\u0007\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u000f\u0008\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0008"
    }
    d2 = {
        "Landroidx/constraintlayout/compose/SwipeSide;",
        "",
        "name",
        "",
        "(Ljava/lang/String;)V",
        "getName",
        "()Ljava/lang/String;",
        "Companion",
        "constraintlayout-compose_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I

.field private static final Bottom:Landroidx/constraintlayout/compose/SwipeSide;

.field public static final Companion:Landroidx/constraintlayout/compose/SwipeSide$Companion;

.field private static final End:Landroidx/constraintlayout/compose/SwipeSide;

.field private static final Left:Landroidx/constraintlayout/compose/SwipeSide;

.field private static final Middle:Landroidx/constraintlayout/compose/SwipeSide;

.field private static final Right:Landroidx/constraintlayout/compose/SwipeSide;

.field private static final Start:Landroidx/constraintlayout/compose/SwipeSide;

.field private static final Top:Landroidx/constraintlayout/compose/SwipeSide;


# instance fields
.field private final name:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroidx/constraintlayout/compose/SwipeSide$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Landroidx/constraintlayout/compose/SwipeSide$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Landroidx/constraintlayout/compose/SwipeSide;->Companion:Landroidx/constraintlayout/compose/SwipeSide$Companion;

    .line 8
    .line 9
    new-instance v0, Landroidx/constraintlayout/compose/SwipeSide;

    .line 10
    .line 11
    const-string/jumbo v1, "top"

    .line 12
    .line 13
    .line 14
    invoke-direct {v0, v1}, Landroidx/constraintlayout/compose/SwipeSide;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Landroidx/constraintlayout/compose/SwipeSide;->Top:Landroidx/constraintlayout/compose/SwipeSide;

    .line 18
    .line 19
    new-instance v0, Landroidx/constraintlayout/compose/SwipeSide;

    .line 20
    .line 21
    const-string/jumbo v1, "left"

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, v1}, Landroidx/constraintlayout/compose/SwipeSide;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    sput-object v0, Landroidx/constraintlayout/compose/SwipeSide;->Left:Landroidx/constraintlayout/compose/SwipeSide;

    .line 28
    .line 29
    new-instance v0, Landroidx/constraintlayout/compose/SwipeSide;

    .line 30
    .line 31
    const-string/jumbo v1, "right"

    .line 32
    .line 33
    .line 34
    invoke-direct {v0, v1}, Landroidx/constraintlayout/compose/SwipeSide;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    sput-object v0, Landroidx/constraintlayout/compose/SwipeSide;->Right:Landroidx/constraintlayout/compose/SwipeSide;

    .line 38
    .line 39
    new-instance v0, Landroidx/constraintlayout/compose/SwipeSide;

    .line 40
    .line 41
    const-string v1, "bottom"

    .line 42
    .line 43
    invoke-direct {v0, v1}, Landroidx/constraintlayout/compose/SwipeSide;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    sput-object v0, Landroidx/constraintlayout/compose/SwipeSide;->Bottom:Landroidx/constraintlayout/compose/SwipeSide;

    .line 47
    .line 48
    new-instance v0, Landroidx/constraintlayout/compose/SwipeSide;

    .line 49
    .line 50
    const-string/jumbo v1, "middle"

    .line 51
    .line 52
    .line 53
    invoke-direct {v0, v1}, Landroidx/constraintlayout/compose/SwipeSide;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    sput-object v0, Landroidx/constraintlayout/compose/SwipeSide;->Middle:Landroidx/constraintlayout/compose/SwipeSide;

    .line 57
    .line 58
    new-instance v0, Landroidx/constraintlayout/compose/SwipeSide;

    .line 59
    .line 60
    const-string/jumbo v1, "start"

    .line 61
    .line 62
    .line 63
    invoke-direct {v0, v1}, Landroidx/constraintlayout/compose/SwipeSide;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    sput-object v0, Landroidx/constraintlayout/compose/SwipeSide;->Start:Landroidx/constraintlayout/compose/SwipeSide;

    .line 67
    .line 68
    new-instance v0, Landroidx/constraintlayout/compose/SwipeSide;

    .line 69
    .line 70
    const-string v1, "end"

    .line 71
    .line 72
    invoke-direct {v0, v1}, Landroidx/constraintlayout/compose/SwipeSide;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    sput-object v0, Landroidx/constraintlayout/compose/SwipeSide;->End:Landroidx/constraintlayout/compose/SwipeSide;

    .line 76
    .line 77
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/constraintlayout/compose/SwipeSide;->name:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method public static final synthetic access$getBottom$cp()Landroidx/constraintlayout/compose/SwipeSide;
    .locals 1

    .line 1
    sget-object v0, Landroidx/constraintlayout/compose/SwipeSide;->Bottom:Landroidx/constraintlayout/compose/SwipeSide;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic access$getEnd$cp()Landroidx/constraintlayout/compose/SwipeSide;
    .locals 1

    .line 1
    sget-object v0, Landroidx/constraintlayout/compose/SwipeSide;->End:Landroidx/constraintlayout/compose/SwipeSide;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic access$getLeft$cp()Landroidx/constraintlayout/compose/SwipeSide;
    .locals 1

    .line 1
    sget-object v0, Landroidx/constraintlayout/compose/SwipeSide;->Left:Landroidx/constraintlayout/compose/SwipeSide;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic access$getMiddle$cp()Landroidx/constraintlayout/compose/SwipeSide;
    .locals 1

    .line 1
    sget-object v0, Landroidx/constraintlayout/compose/SwipeSide;->Middle:Landroidx/constraintlayout/compose/SwipeSide;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic access$getRight$cp()Landroidx/constraintlayout/compose/SwipeSide;
    .locals 1

    .line 1
    sget-object v0, Landroidx/constraintlayout/compose/SwipeSide;->Right:Landroidx/constraintlayout/compose/SwipeSide;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic access$getStart$cp()Landroidx/constraintlayout/compose/SwipeSide;
    .locals 1

    .line 1
    sget-object v0, Landroidx/constraintlayout/compose/SwipeSide;->Start:Landroidx/constraintlayout/compose/SwipeSide;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic access$getTop$cp()Landroidx/constraintlayout/compose/SwipeSide;
    .locals 1

    .line 1
    sget-object v0, Landroidx/constraintlayout/compose/SwipeSide;->Top:Landroidx/constraintlayout/compose/SwipeSide;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public final getName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/SwipeSide;->name:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
