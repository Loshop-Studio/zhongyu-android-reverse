.class public final Landroidx/constraintlayout/compose/SwipeTouchUp;
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
        Landroidx/constraintlayout/compose/SwipeTouchUp$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\u0008\u0007\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u000f\u0008\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0008"
    }
    d2 = {
        "Landroidx/constraintlayout/compose/SwipeTouchUp;",
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

.field private static final AutoComplete:Landroidx/constraintlayout/compose/SwipeTouchUp;

.field public static final Companion:Landroidx/constraintlayout/compose/SwipeTouchUp$Companion;

.field private static final Decelerate:Landroidx/constraintlayout/compose/SwipeTouchUp;

.field private static final NeverCompleteEnd:Landroidx/constraintlayout/compose/SwipeTouchUp;

.field private static final NeverCompleteStart:Landroidx/constraintlayout/compose/SwipeTouchUp;

.field private static final Stop:Landroidx/constraintlayout/compose/SwipeTouchUp;

.field private static final ToEnd:Landroidx/constraintlayout/compose/SwipeTouchUp;

.field private static final ToStart:Landroidx/constraintlayout/compose/SwipeTouchUp;


# instance fields
.field private final name:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroidx/constraintlayout/compose/SwipeTouchUp$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Landroidx/constraintlayout/compose/SwipeTouchUp$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Landroidx/constraintlayout/compose/SwipeTouchUp;->Companion:Landroidx/constraintlayout/compose/SwipeTouchUp$Companion;

    .line 8
    .line 9
    new-instance v0, Landroidx/constraintlayout/compose/SwipeTouchUp;

    .line 10
    .line 11
    const-string v1, "autocomplete"

    .line 12
    .line 13
    invoke-direct {v0, v1}, Landroidx/constraintlayout/compose/SwipeTouchUp;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    sput-object v0, Landroidx/constraintlayout/compose/SwipeTouchUp;->AutoComplete:Landroidx/constraintlayout/compose/SwipeTouchUp;

    .line 17
    .line 18
    new-instance v0, Landroidx/constraintlayout/compose/SwipeTouchUp;

    .line 19
    .line 20
    const-string/jumbo v1, "toStart"

    .line 21
    .line 22
    .line 23
    invoke-direct {v0, v1}, Landroidx/constraintlayout/compose/SwipeTouchUp;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    sput-object v0, Landroidx/constraintlayout/compose/SwipeTouchUp;->ToStart:Landroidx/constraintlayout/compose/SwipeTouchUp;

    .line 27
    .line 28
    new-instance v0, Landroidx/constraintlayout/compose/SwipeTouchUp;

    .line 29
    .line 30
    const-string/jumbo v1, "toEnd"

    .line 31
    .line 32
    .line 33
    invoke-direct {v0, v1}, Landroidx/constraintlayout/compose/SwipeTouchUp;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    sput-object v0, Landroidx/constraintlayout/compose/SwipeTouchUp;->ToEnd:Landroidx/constraintlayout/compose/SwipeTouchUp;

    .line 37
    .line 38
    new-instance v0, Landroidx/constraintlayout/compose/SwipeTouchUp;

    .line 39
    .line 40
    const-string/jumbo v1, "stop"

    .line 41
    .line 42
    .line 43
    invoke-direct {v0, v1}, Landroidx/constraintlayout/compose/SwipeTouchUp;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    sput-object v0, Landroidx/constraintlayout/compose/SwipeTouchUp;->Stop:Landroidx/constraintlayout/compose/SwipeTouchUp;

    .line 47
    .line 48
    new-instance v0, Landroidx/constraintlayout/compose/SwipeTouchUp;

    .line 49
    .line 50
    const-string v1, "decelerate"

    .line 51
    .line 52
    invoke-direct {v0, v1}, Landroidx/constraintlayout/compose/SwipeTouchUp;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    sput-object v0, Landroidx/constraintlayout/compose/SwipeTouchUp;->Decelerate:Landroidx/constraintlayout/compose/SwipeTouchUp;

    .line 56
    .line 57
    new-instance v0, Landroidx/constraintlayout/compose/SwipeTouchUp;

    .line 58
    .line 59
    const-string/jumbo v1, "neverCompleteStart"

    .line 60
    .line 61
    .line 62
    invoke-direct {v0, v1}, Landroidx/constraintlayout/compose/SwipeTouchUp;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    sput-object v0, Landroidx/constraintlayout/compose/SwipeTouchUp;->NeverCompleteStart:Landroidx/constraintlayout/compose/SwipeTouchUp;

    .line 66
    .line 67
    new-instance v0, Landroidx/constraintlayout/compose/SwipeTouchUp;

    .line 68
    .line 69
    const-string/jumbo v1, "neverCompleteEnd"

    .line 70
    .line 71
    .line 72
    invoke-direct {v0, v1}, Landroidx/constraintlayout/compose/SwipeTouchUp;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    sput-object v0, Landroidx/constraintlayout/compose/SwipeTouchUp;->NeverCompleteEnd:Landroidx/constraintlayout/compose/SwipeTouchUp;

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
    iput-object p1, p0, Landroidx/constraintlayout/compose/SwipeTouchUp;->name:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method public static final synthetic access$getAutoComplete$cp()Landroidx/constraintlayout/compose/SwipeTouchUp;
    .locals 1

    .line 1
    sget-object v0, Landroidx/constraintlayout/compose/SwipeTouchUp;->AutoComplete:Landroidx/constraintlayout/compose/SwipeTouchUp;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic access$getDecelerate$cp()Landroidx/constraintlayout/compose/SwipeTouchUp;
    .locals 1

    .line 1
    sget-object v0, Landroidx/constraintlayout/compose/SwipeTouchUp;->Decelerate:Landroidx/constraintlayout/compose/SwipeTouchUp;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic access$getNeverCompleteEnd$cp()Landroidx/constraintlayout/compose/SwipeTouchUp;
    .locals 1

    .line 1
    sget-object v0, Landroidx/constraintlayout/compose/SwipeTouchUp;->NeverCompleteEnd:Landroidx/constraintlayout/compose/SwipeTouchUp;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic access$getNeverCompleteStart$cp()Landroidx/constraintlayout/compose/SwipeTouchUp;
    .locals 1

    .line 1
    sget-object v0, Landroidx/constraintlayout/compose/SwipeTouchUp;->NeverCompleteStart:Landroidx/constraintlayout/compose/SwipeTouchUp;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic access$getStop$cp()Landroidx/constraintlayout/compose/SwipeTouchUp;
    .locals 1

    .line 1
    sget-object v0, Landroidx/constraintlayout/compose/SwipeTouchUp;->Stop:Landroidx/constraintlayout/compose/SwipeTouchUp;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic access$getToEnd$cp()Landroidx/constraintlayout/compose/SwipeTouchUp;
    .locals 1

    .line 1
    sget-object v0, Landroidx/constraintlayout/compose/SwipeTouchUp;->ToEnd:Landroidx/constraintlayout/compose/SwipeTouchUp;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic access$getToStart$cp()Landroidx/constraintlayout/compose/SwipeTouchUp;
    .locals 1

    .line 1
    sget-object v0, Landroidx/constraintlayout/compose/SwipeTouchUp;->ToStart:Landroidx/constraintlayout/compose/SwipeTouchUp;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public final getName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/SwipeTouchUp;->name:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
