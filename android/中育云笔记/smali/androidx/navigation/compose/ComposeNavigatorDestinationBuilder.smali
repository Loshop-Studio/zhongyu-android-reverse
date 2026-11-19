.class public final Landroidx/navigation/compose/ComposeNavigatorDestinationBuilder;
.super Landroidx/navigation/NavDestinationBuilder;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Landroidx/navigation/NavDestinationDsl;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/navigation/NavDestinationBuilder<",
        "Landroidx/navigation/compose/ComposeNavigator$Destination;",
        ">;"
    }
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final composeNavigator:Landroidx/navigation/compose/ComposeNavigator;

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

.method public constructor <init>(Landroidx/navigation/compose/ComposeNavigator;Ljava/lang/String;Lhd/r;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/navigation/compose/ComposeNavigator;",
            "Ljava/lang/String;",
            "Lhd/r;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Landroidx/navigation/NavDestinationBuilder;-><init>(Landroidx/navigation/Navigator;Ljava/lang/String;)V

    .line 2
    iput-object p1, p0, Landroidx/navigation/compose/ComposeNavigatorDestinationBuilder;->composeNavigator:Landroidx/navigation/compose/ComposeNavigator;

    .line 3
    iput-object p3, p0, Landroidx/navigation/compose/ComposeNavigatorDestinationBuilder;->content:Lhd/r;

    return-void
.end method

.method public constructor <init>(Landroidx/navigation/compose/ComposeNavigator;Lod/c;Ljava/util/Map;Lhd/r;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/navigation/compose/ComposeNavigator;",
            "Lod/c;",
            "Ljava/util/Map<",
            "Lod/o;",
            "Landroidx/navigation/NavType<",
            "*>;>;",
            "Lhd/r;",
            ")V"
        }
    .end annotation

    .line 4
    invoke-direct {p0, p1, p2, p3}, Landroidx/navigation/NavDestinationBuilder;-><init>(Landroidx/navigation/Navigator;Lod/c;Ljava/util/Map;)V

    .line 5
    iput-object p1, p0, Landroidx/navigation/compose/ComposeNavigatorDestinationBuilder;->composeNavigator:Landroidx/navigation/compose/ComposeNavigator;

    .line 6
    iput-object p4, p0, Landroidx/navigation/compose/ComposeNavigatorDestinationBuilder;->content:Lhd/r;

    return-void
.end method


# virtual methods
.method public bridge synthetic build()Landroidx/navigation/NavDestination;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/navigation/compose/ComposeNavigatorDestinationBuilder;->build()Landroidx/navigation/compose/ComposeNavigator$Destination;

    move-result-object v0

    return-object v0
.end method

.method public build()Landroidx/navigation/compose/ComposeNavigator$Destination;
    .locals 2

    .line 2
    invoke-super {p0}, Landroidx/navigation/NavDestinationBuilder;->build()Landroidx/navigation/NavDestination;

    move-result-object v0

    check-cast v0, Landroidx/navigation/compose/ComposeNavigator$Destination;

    .line 3
    iget-object v1, p0, Landroidx/navigation/compose/ComposeNavigatorDestinationBuilder;->enterTransition:Lhd/l;

    invoke-virtual {v0, v1}, Landroidx/navigation/compose/ComposeNavigator$Destination;->setEnterTransition$navigation_compose_release(Lhd/l;)V

    .line 4
    iget-object v1, p0, Landroidx/navigation/compose/ComposeNavigatorDestinationBuilder;->exitTransition:Lhd/l;

    invoke-virtual {v0, v1}, Landroidx/navigation/compose/ComposeNavigator$Destination;->setExitTransition$navigation_compose_release(Lhd/l;)V

    .line 5
    iget-object v1, p0, Landroidx/navigation/compose/ComposeNavigatorDestinationBuilder;->popEnterTransition:Lhd/l;

    invoke-virtual {v0, v1}, Landroidx/navigation/compose/ComposeNavigator$Destination;->setPopEnterTransition$navigation_compose_release(Lhd/l;)V

    .line 6
    iget-object v1, p0, Landroidx/navigation/compose/ComposeNavigatorDestinationBuilder;->popExitTransition:Lhd/l;

    invoke-virtual {v0, v1}, Landroidx/navigation/compose/ComposeNavigator$Destination;->setPopExitTransition$navigation_compose_release(Lhd/l;)V

    .line 7
    iget-object v1, p0, Landroidx/navigation/compose/ComposeNavigatorDestinationBuilder;->sizeTransform:Lhd/l;

    invoke-virtual {v0, v1}, Landroidx/navigation/compose/ComposeNavigator$Destination;->setSizeTransform$navigation_compose_release(Lhd/l;)V

    return-object v0
.end method

.method public final getEnterTransition()Lhd/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lhd/l;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/navigation/compose/ComposeNavigatorDestinationBuilder;->enterTransition:Lhd/l;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getExitTransition()Lhd/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lhd/l;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/navigation/compose/ComposeNavigatorDestinationBuilder;->exitTransition:Lhd/l;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getPopEnterTransition()Lhd/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lhd/l;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/navigation/compose/ComposeNavigatorDestinationBuilder;->popEnterTransition:Lhd/l;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getPopExitTransition()Lhd/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lhd/l;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/navigation/compose/ComposeNavigatorDestinationBuilder;->popExitTransition:Lhd/l;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getSizeTransform()Lhd/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lhd/l;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/navigation/compose/ComposeNavigatorDestinationBuilder;->sizeTransform:Lhd/l;

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge synthetic instantiateDestination()Landroidx/navigation/NavDestination;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/navigation/compose/ComposeNavigatorDestinationBuilder;->instantiateDestination()Landroidx/navigation/compose/ComposeNavigator$Destination;

    move-result-object v0

    return-object v0
.end method

.method public instantiateDestination()Landroidx/navigation/compose/ComposeNavigator$Destination;
    .locals 3

    .line 2
    new-instance v0, Landroidx/navigation/compose/ComposeNavigator$Destination;

    iget-object v1, p0, Landroidx/navigation/compose/ComposeNavigatorDestinationBuilder;->composeNavigator:Landroidx/navigation/compose/ComposeNavigator;

    iget-object v2, p0, Landroidx/navigation/compose/ComposeNavigatorDestinationBuilder;->content:Lhd/r;

    invoke-direct {v0, v1, v2}, Landroidx/navigation/compose/ComposeNavigator$Destination;-><init>(Landroidx/navigation/compose/ComposeNavigator;Lhd/r;)V

    return-object v0
.end method

.method public final setEnterTransition(Lhd/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/l;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/navigation/compose/ComposeNavigatorDestinationBuilder;->enterTransition:Lhd/l;

    .line 2
    .line 3
    return-void
.end method

.method public final setExitTransition(Lhd/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/l;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/navigation/compose/ComposeNavigatorDestinationBuilder;->exitTransition:Lhd/l;

    .line 2
    .line 3
    return-void
.end method

.method public final setPopEnterTransition(Lhd/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/l;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/navigation/compose/ComposeNavigatorDestinationBuilder;->popEnterTransition:Lhd/l;

    .line 2
    .line 3
    return-void
.end method

.method public final setPopExitTransition(Lhd/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/l;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/navigation/compose/ComposeNavigatorDestinationBuilder;->popExitTransition:Lhd/l;

    .line 2
    .line 3
    return-void
.end method

.method public final setSizeTransform(Lhd/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/l;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/navigation/compose/ComposeNavigatorDestinationBuilder;->sizeTransform:Lhd/l;

    .line 2
    .line 3
    return-void
.end method
