.class public final Landroidx/constraintlayout/compose/SwipeDirection;
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
        Landroidx/constraintlayout/compose/SwipeDirection$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\u0008\u0007\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u000f\u0008\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0008"
    }
    d2 = {
        "Landroidx/constraintlayout/compose/SwipeDirection;",
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

.field private static final Clockwise:Landroidx/constraintlayout/compose/SwipeDirection;

.field public static final Companion:Landroidx/constraintlayout/compose/SwipeDirection$Companion;

.field private static final Counterclockwise:Landroidx/constraintlayout/compose/SwipeDirection;

.field private static final Down:Landroidx/constraintlayout/compose/SwipeDirection;

.field private static final End:Landroidx/constraintlayout/compose/SwipeDirection;

.field private static final Left:Landroidx/constraintlayout/compose/SwipeDirection;

.field private static final Right:Landroidx/constraintlayout/compose/SwipeDirection;

.field private static final Start:Landroidx/constraintlayout/compose/SwipeDirection;

.field private static final Up:Landroidx/constraintlayout/compose/SwipeDirection;


# instance fields
.field private final name:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroidx/constraintlayout/compose/SwipeDirection$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Landroidx/constraintlayout/compose/SwipeDirection$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Landroidx/constraintlayout/compose/SwipeDirection;->Companion:Landroidx/constraintlayout/compose/SwipeDirection$Companion;

    .line 8
    .line 9
    new-instance v0, Landroidx/constraintlayout/compose/SwipeDirection;

    .line 10
    .line 11
    const-string/jumbo v1, "up"

    .line 12
    .line 13
    .line 14
    invoke-direct {v0, v1}, Landroidx/constraintlayout/compose/SwipeDirection;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Landroidx/constraintlayout/compose/SwipeDirection;->Up:Landroidx/constraintlayout/compose/SwipeDirection;

    .line 18
    .line 19
    new-instance v0, Landroidx/constraintlayout/compose/SwipeDirection;

    .line 20
    .line 21
    const-string v1, "down"

    .line 22
    .line 23
    invoke-direct {v0, v1}, Landroidx/constraintlayout/compose/SwipeDirection;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    sput-object v0, Landroidx/constraintlayout/compose/SwipeDirection;->Down:Landroidx/constraintlayout/compose/SwipeDirection;

    .line 27
    .line 28
    new-instance v0, Landroidx/constraintlayout/compose/SwipeDirection;

    .line 29
    .line 30
    const-string/jumbo v1, "left"

    .line 31
    .line 32
    .line 33
    invoke-direct {v0, v1}, Landroidx/constraintlayout/compose/SwipeDirection;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    sput-object v0, Landroidx/constraintlayout/compose/SwipeDirection;->Left:Landroidx/constraintlayout/compose/SwipeDirection;

    .line 37
    .line 38
    new-instance v0, Landroidx/constraintlayout/compose/SwipeDirection;

    .line 39
    .line 40
    const-string/jumbo v1, "right"

    .line 41
    .line 42
    .line 43
    invoke-direct {v0, v1}, Landroidx/constraintlayout/compose/SwipeDirection;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    sput-object v0, Landroidx/constraintlayout/compose/SwipeDirection;->Right:Landroidx/constraintlayout/compose/SwipeDirection;

    .line 47
    .line 48
    new-instance v0, Landroidx/constraintlayout/compose/SwipeDirection;

    .line 49
    .line 50
    const-string/jumbo v1, "start"

    .line 51
    .line 52
    .line 53
    invoke-direct {v0, v1}, Landroidx/constraintlayout/compose/SwipeDirection;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    sput-object v0, Landroidx/constraintlayout/compose/SwipeDirection;->Start:Landroidx/constraintlayout/compose/SwipeDirection;

    .line 57
    .line 58
    new-instance v0, Landroidx/constraintlayout/compose/SwipeDirection;

    .line 59
    .line 60
    const-string v1, "end"

    .line 61
    .line 62
    invoke-direct {v0, v1}, Landroidx/constraintlayout/compose/SwipeDirection;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    sput-object v0, Landroidx/constraintlayout/compose/SwipeDirection;->End:Landroidx/constraintlayout/compose/SwipeDirection;

    .line 66
    .line 67
    new-instance v0, Landroidx/constraintlayout/compose/SwipeDirection;

    .line 68
    .line 69
    const-string v1, "clockwise"

    .line 70
    .line 71
    invoke-direct {v0, v1}, Landroidx/constraintlayout/compose/SwipeDirection;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    sput-object v0, Landroidx/constraintlayout/compose/SwipeDirection;->Clockwise:Landroidx/constraintlayout/compose/SwipeDirection;

    .line 75
    .line 76
    new-instance v0, Landroidx/constraintlayout/compose/SwipeDirection;

    .line 77
    .line 78
    const-string v1, "anticlockwise"

    .line 79
    .line 80
    invoke-direct {v0, v1}, Landroidx/constraintlayout/compose/SwipeDirection;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    sput-object v0, Landroidx/constraintlayout/compose/SwipeDirection;->Counterclockwise:Landroidx/constraintlayout/compose/SwipeDirection;

    .line 84
    .line 85
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/constraintlayout/compose/SwipeDirection;->name:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method public static final synthetic access$getClockwise$cp()Landroidx/constraintlayout/compose/SwipeDirection;
    .locals 1

    .line 1
    sget-object v0, Landroidx/constraintlayout/compose/SwipeDirection;->Clockwise:Landroidx/constraintlayout/compose/SwipeDirection;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic access$getCounterclockwise$cp()Landroidx/constraintlayout/compose/SwipeDirection;
    .locals 1

    .line 1
    sget-object v0, Landroidx/constraintlayout/compose/SwipeDirection;->Counterclockwise:Landroidx/constraintlayout/compose/SwipeDirection;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic access$getDown$cp()Landroidx/constraintlayout/compose/SwipeDirection;
    .locals 1

    .line 1
    sget-object v0, Landroidx/constraintlayout/compose/SwipeDirection;->Down:Landroidx/constraintlayout/compose/SwipeDirection;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic access$getEnd$cp()Landroidx/constraintlayout/compose/SwipeDirection;
    .locals 1

    .line 1
    sget-object v0, Landroidx/constraintlayout/compose/SwipeDirection;->End:Landroidx/constraintlayout/compose/SwipeDirection;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic access$getLeft$cp()Landroidx/constraintlayout/compose/SwipeDirection;
    .locals 1

    .line 1
    sget-object v0, Landroidx/constraintlayout/compose/SwipeDirection;->Left:Landroidx/constraintlayout/compose/SwipeDirection;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic access$getRight$cp()Landroidx/constraintlayout/compose/SwipeDirection;
    .locals 1

    .line 1
    sget-object v0, Landroidx/constraintlayout/compose/SwipeDirection;->Right:Landroidx/constraintlayout/compose/SwipeDirection;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic access$getStart$cp()Landroidx/constraintlayout/compose/SwipeDirection;
    .locals 1

    .line 1
    sget-object v0, Landroidx/constraintlayout/compose/SwipeDirection;->Start:Landroidx/constraintlayout/compose/SwipeDirection;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic access$getUp$cp()Landroidx/constraintlayout/compose/SwipeDirection;
    .locals 1

    .line 1
    sget-object v0, Landroidx/constraintlayout/compose/SwipeDirection;->Up:Landroidx/constraintlayout/compose/SwipeDirection;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public final getName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/SwipeDirection;->name:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
