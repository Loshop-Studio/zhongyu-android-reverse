.class public final Landroidx/navigation/compose/ComposeNavigator$Destination;
.super Landroidx/navigation/NavDestination;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation build Landroidx/navigation/NavDestination$ClassType;
    value = Landroidx/compose/runtime/Composable;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/navigation/compose/ComposeNavigator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Destination"
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final content:Lhd/r;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/r;"
        }
    .end annotation
.end field

.field private enterTransition:Lhd/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/l;"
        }
    .end annotation
.end field

.field private exitTransition:Lhd/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/l;"
        }
    .end annotation
.end field

.field private popEnterTransition:Lhd/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/l;"
        }
    .end annotation
.end field

.field private popExitTransition:Lhd/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/l;"
        }
    .end annotation
.end field

.field private sizeTransform:Lhd/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/l;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/navigation/compose/ComposeNavigator;Lhd/q;)V
    .locals 2
    .annotation runtime Lqc/a;
    .end annotation

    .line 3
    new-instance v0, Landroidx/navigation/compose/ComposeNavigator$Destination$1;

    invoke-direct {v0, p2}, Landroidx/navigation/compose/ComposeNavigator$Destination$1;-><init>(Lhd/q;)V

    const p2, 0x5ea6493e

    const/4 v1, 0x1

    invoke-static {p2, v1, v0}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Landroidx/navigation/compose/ComposeNavigator$Destination;-><init>(Landroidx/navigation/compose/ComposeNavigator;Lhd/r;)V

    return-void
.end method

.method public constructor <init>(Landroidx/navigation/compose/ComposeNavigator;Lhd/r;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/navigation/compose/ComposeNavigator;",
            "Lhd/r;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Landroidx/navigation/NavDestination;-><init>(Landroidx/navigation/Navigator;)V

    .line 2
    iput-object p2, p0, Landroidx/navigation/compose/ComposeNavigator$Destination;->content:Lhd/r;

    return-void
.end method


# virtual methods
.method public final getContent$navigation_compose_release()Lhd/r;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lhd/r;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/navigation/compose/ComposeNavigator$Destination;->content:Lhd/r;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getEnterTransition$navigation_compose_release()Lhd/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lhd/l;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/navigation/compose/ComposeNavigator$Destination;->enterTransition:Lhd/l;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getExitTransition$navigation_compose_release()Lhd/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lhd/l;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/navigation/compose/ComposeNavigator$Destination;->exitTransition:Lhd/l;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getPopEnterTransition$navigation_compose_release()Lhd/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lhd/l;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/navigation/compose/ComposeNavigator$Destination;->popEnterTransition:Lhd/l;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getPopExitTransition$navigation_compose_release()Lhd/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lhd/l;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/navigation/compose/ComposeNavigator$Destination;->popExitTransition:Lhd/l;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getSizeTransform$navigation_compose_release()Lhd/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lhd/l;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/navigation/compose/ComposeNavigator$Destination;->sizeTransform:Lhd/l;

    .line 2
    .line 3
    return-object v0
.end method

.method public final setEnterTransition$navigation_compose_release(Lhd/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/l;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/navigation/compose/ComposeNavigator$Destination;->enterTransition:Lhd/l;

    .line 2
    .line 3
    return-void
.end method

.method public final setExitTransition$navigation_compose_release(Lhd/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/l;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/navigation/compose/ComposeNavigator$Destination;->exitTransition:Lhd/l;

    .line 2
    .line 3
    return-void
.end method

.method public final setPopEnterTransition$navigation_compose_release(Lhd/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/l;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/navigation/compose/ComposeNavigator$Destination;->popEnterTransition:Lhd/l;

    .line 2
    .line 3
    return-void
.end method

.method public final setPopExitTransition$navigation_compose_release(Lhd/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/l;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/navigation/compose/ComposeNavigator$Destination;->popExitTransition:Lhd/l;

    .line 2
    .line 3
    return-void
.end method

.method public final setSizeTransform$navigation_compose_release(Lhd/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/l;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/navigation/compose/ComposeNavigator$Destination;->sizeTransform:Lhd/l;

    .line 2
    .line 3
    return-void
.end method
