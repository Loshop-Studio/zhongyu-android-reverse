.class public final Landroidx/constraintlayout/compose/SpringBoundary;
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
        Landroidx/constraintlayout/compose/SpringBoundary$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\u0008\u0007\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u000f\u0008\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0008"
    }
    d2 = {
        "Landroidx/constraintlayout/compose/SpringBoundary;",
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

.field private static final BounceBoth:Landroidx/constraintlayout/compose/SpringBoundary;

.field private static final BounceEnd:Landroidx/constraintlayout/compose/SpringBoundary;

.field private static final BounceStart:Landroidx/constraintlayout/compose/SpringBoundary;

.field public static final Companion:Landroidx/constraintlayout/compose/SpringBoundary$Companion;

.field private static final Overshoot:Landroidx/constraintlayout/compose/SpringBoundary;


# instance fields
.field private final name:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroidx/constraintlayout/compose/SpringBoundary$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Landroidx/constraintlayout/compose/SpringBoundary$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Landroidx/constraintlayout/compose/SpringBoundary;->Companion:Landroidx/constraintlayout/compose/SpringBoundary$Companion;

    .line 8
    .line 9
    new-instance v0, Landroidx/constraintlayout/compose/SpringBoundary;

    .line 10
    .line 11
    const-string/jumbo v1, "overshoot"

    .line 12
    .line 13
    .line 14
    invoke-direct {v0, v1}, Landroidx/constraintlayout/compose/SpringBoundary;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Landroidx/constraintlayout/compose/SpringBoundary;->Overshoot:Landroidx/constraintlayout/compose/SpringBoundary;

    .line 18
    .line 19
    new-instance v0, Landroidx/constraintlayout/compose/SpringBoundary;

    .line 20
    .line 21
    const-string v1, "bounceStart"

    .line 22
    .line 23
    invoke-direct {v0, v1}, Landroidx/constraintlayout/compose/SpringBoundary;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    sput-object v0, Landroidx/constraintlayout/compose/SpringBoundary;->BounceStart:Landroidx/constraintlayout/compose/SpringBoundary;

    .line 27
    .line 28
    new-instance v0, Landroidx/constraintlayout/compose/SpringBoundary;

    .line 29
    .line 30
    const-string v1, "bounceEnd"

    .line 31
    .line 32
    invoke-direct {v0, v1}, Landroidx/constraintlayout/compose/SpringBoundary;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sput-object v0, Landroidx/constraintlayout/compose/SpringBoundary;->BounceEnd:Landroidx/constraintlayout/compose/SpringBoundary;

    .line 36
    .line 37
    new-instance v0, Landroidx/constraintlayout/compose/SpringBoundary;

    .line 38
    .line 39
    const-string v1, "bounceBoth"

    .line 40
    .line 41
    invoke-direct {v0, v1}, Landroidx/constraintlayout/compose/SpringBoundary;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    sput-object v0, Landroidx/constraintlayout/compose/SpringBoundary;->BounceBoth:Landroidx/constraintlayout/compose/SpringBoundary;

    .line 45
    .line 46
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/constraintlayout/compose/SpringBoundary;->name:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method public static final synthetic access$getBounceBoth$cp()Landroidx/constraintlayout/compose/SpringBoundary;
    .locals 1

    .line 1
    sget-object v0, Landroidx/constraintlayout/compose/SpringBoundary;->BounceBoth:Landroidx/constraintlayout/compose/SpringBoundary;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic access$getBounceEnd$cp()Landroidx/constraintlayout/compose/SpringBoundary;
    .locals 1

    .line 1
    sget-object v0, Landroidx/constraintlayout/compose/SpringBoundary;->BounceEnd:Landroidx/constraintlayout/compose/SpringBoundary;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic access$getBounceStart$cp()Landroidx/constraintlayout/compose/SpringBoundary;
    .locals 1

    .line 1
    sget-object v0, Landroidx/constraintlayout/compose/SpringBoundary;->BounceStart:Landroidx/constraintlayout/compose/SpringBoundary;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic access$getOvershoot$cp()Landroidx/constraintlayout/compose/SpringBoundary;
    .locals 1

    .line 1
    sget-object v0, Landroidx/constraintlayout/compose/SpringBoundary;->Overshoot:Landroidx/constraintlayout/compose/SpringBoundary;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public final getName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/SpringBoundary;->name:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
