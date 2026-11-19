.class public final Landroidx/navigation/compose/ComposeNavGraphNavigator$ComposeNavGraph;
.super Landroidx/navigation/NavGraph;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/navigation/compose/ComposeNavGraphNavigator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ComposeNavGraph"
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
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

.method public constructor <init>(Landroidx/navigation/Navigator;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/navigation/Navigator<",
            "+",
            "Landroidx/navigation/NavGraph;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Landroidx/navigation/NavGraph;-><init>(Landroidx/navigation/Navigator;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final getEnterTransition$navigation_compose_release()Lhd/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lhd/l;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/navigation/compose/ComposeNavGraphNavigator$ComposeNavGraph;->enterTransition:Lhd/l;

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
    iget-object v0, p0, Landroidx/navigation/compose/ComposeNavGraphNavigator$ComposeNavGraph;->exitTransition:Lhd/l;

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
    iget-object v0, p0, Landroidx/navigation/compose/ComposeNavGraphNavigator$ComposeNavGraph;->popEnterTransition:Lhd/l;

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
    iget-object v0, p0, Landroidx/navigation/compose/ComposeNavGraphNavigator$ComposeNavGraph;->popExitTransition:Lhd/l;

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
    iget-object v0, p0, Landroidx/navigation/compose/ComposeNavGraphNavigator$ComposeNavGraph;->sizeTransform:Lhd/l;

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
    iput-object p1, p0, Landroidx/navigation/compose/ComposeNavGraphNavigator$ComposeNavGraph;->enterTransition:Lhd/l;

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
    iput-object p1, p0, Landroidx/navigation/compose/ComposeNavGraphNavigator$ComposeNavGraph;->exitTransition:Lhd/l;

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
    iput-object p1, p0, Landroidx/navigation/compose/ComposeNavGraphNavigator$ComposeNavGraph;->popEnterTransition:Lhd/l;

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
    iput-object p1, p0, Landroidx/navigation/compose/ComposeNavGraphNavigator$ComposeNavGraph;->popExitTransition:Lhd/l;

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
    iput-object p1, p0, Landroidx/navigation/compose/ComposeNavGraphNavigator$ComposeNavGraph;->sizeTransform:Lhd/l;

    .line 2
    .line 3
    return-void
.end method
