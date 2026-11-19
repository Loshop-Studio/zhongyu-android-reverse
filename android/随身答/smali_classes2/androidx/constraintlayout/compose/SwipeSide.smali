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
    const-string v1, "left"

    .line 22
    .line 23
    invoke-direct {v0, v1}, Landroidx/constraintlayout/compose/SwipeSide;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    sput-object v0, Landroidx/constraintlayout/compose/SwipeSide;->Left:Landroidx/constraintlayout/compose/SwipeSide;

    .line 27
    .line 28
    new-instance v0, Landroidx/constraintlayout/compose/SwipeSide;

    .line 29
    .line 30
    const-string/jumbo v1, "right"

    .line 31
    .line 32
    .line 33
    invoke-direct {v0, v1}, Landroidx/constraintlayout/compose/SwipeSide;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    sput-object v0, Landroidx/constraintlayout/compose/SwipeSide;->Right:Landroidx/constraintlayout/compose/SwipeSide;

    .line 37
    .line 38
    new-instance v0, Landroidx/constraintlayout/compose/SwipeSide;

    .line 39
    .line 40
    const-string v1, "bottom"

    .line 41
    .line 42
    invoke-direct {v0, v1}, Landroidx/constraintlayout/compose/SwipeSide;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    sput-object v0, Landroidx/constraintlayout/compose/SwipeSide;->Bottom:Landroidx/constraintlayout/compose/SwipeSide;

    .line 46
    .line 47
    new-instance v0, Landroidx/constraintlayout/compose/SwipeSide;

    .line 48
    .line 49
    const-string/jumbo v1, "middle"

    .line 50
    .line 51
    .line 52
    invoke-direct {v0, v1}, Landroidx/constraintlayout/compose/SwipeSide;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    sput-object v0, Landroidx/constraintlayout/compose/SwipeSide;->Middle:Landroidx/constraintlayout/compose/SwipeSide;

    .line 56
    .line 57
    new-instance v0, Landroidx/constraintlayout/compose/SwipeSide;

    .line 58
    .line 59
    const-string/jumbo v1, "start"

    .line 60
    .line 61
    .line 62
    invoke-direct {v0, v1}, Landroidx/constraintlayout/compose/SwipeSide;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    sput-object v0, Landroidx/constraintlayout/compose/SwipeSide;->Start:Landroidx/constraintlayout/compose/SwipeSide;

    .line 66
    .line 67
    new-instance v0, Landroidx/constraintlayout/compose/SwipeSide;

    .line 68
    .line 69
    const-string v1, "end"

    .line 70
    .line 71
    invoke-direct {v0, v1}, Landroidx/constraintlayout/compose/SwipeSide;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    sput-object v0, Landroidx/constraintlayout/compose/SwipeSide;->End:Landroidx/constraintlayout/compose/SwipeSide;

    .line 75
    .line 76
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
