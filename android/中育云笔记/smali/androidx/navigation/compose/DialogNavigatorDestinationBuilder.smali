.class public final Landroidx/navigation/compose/DialogNavigatorDestinationBuilder;
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
        "Landroidx/navigation/compose/DialogNavigator$Destination;",
        ">;"
    }
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final content:Lhd/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/q;"
        }
    .end annotation
.end field

.field private final dialogNavigator:Landroidx/navigation/compose/DialogNavigator;

.field private final dialogProperties:Landroidx/compose/ui/window/DialogProperties;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroidx/navigation/compose/DialogNavigator;Ljava/lang/String;Landroidx/compose/ui/window/DialogProperties;Lhd/q;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/navigation/compose/DialogNavigator;",
            "Ljava/lang/String;",
            "Landroidx/compose/ui/window/DialogProperties;",
            "Lhd/q;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Landroidx/navigation/NavDestinationBuilder;-><init>(Landroidx/navigation/Navigator;Ljava/lang/String;)V

    .line 2
    iput-object p1, p0, Landroidx/navigation/compose/DialogNavigatorDestinationBuilder;->dialogNavigator:Landroidx/navigation/compose/DialogNavigator;

    .line 3
    iput-object p3, p0, Landroidx/navigation/compose/DialogNavigatorDestinationBuilder;->dialogProperties:Landroidx/compose/ui/window/DialogProperties;

    .line 4
    iput-object p4, p0, Landroidx/navigation/compose/DialogNavigatorDestinationBuilder;->content:Lhd/q;

    return-void
.end method

.method public constructor <init>(Landroidx/navigation/compose/DialogNavigator;Lod/c;Ljava/util/Map;Landroidx/compose/ui/window/DialogProperties;Lhd/q;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/navigation/compose/DialogNavigator;",
            "Lod/c;",
            "Ljava/util/Map<",
            "Lod/o;",
            "Landroidx/navigation/NavType<",
            "*>;>;",
            "Landroidx/compose/ui/window/DialogProperties;",
            "Lhd/q;",
            ")V"
        }
    .end annotation

    .line 5
    invoke-direct {p0, p1, p2, p3}, Landroidx/navigation/NavDestinationBuilder;-><init>(Landroidx/navigation/Navigator;Lod/c;Ljava/util/Map;)V

    .line 6
    iput-object p1, p0, Landroidx/navigation/compose/DialogNavigatorDestinationBuilder;->dialogNavigator:Landroidx/navigation/compose/DialogNavigator;

    .line 7
    iput-object p4, p0, Landroidx/navigation/compose/DialogNavigatorDestinationBuilder;->dialogProperties:Landroidx/compose/ui/window/DialogProperties;

    .line 8
    iput-object p5, p0, Landroidx/navigation/compose/DialogNavigatorDestinationBuilder;->content:Lhd/q;

    return-void
.end method


# virtual methods
.method public bridge synthetic instantiateDestination()Landroidx/navigation/NavDestination;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/navigation/compose/DialogNavigatorDestinationBuilder;->instantiateDestination()Landroidx/navigation/compose/DialogNavigator$Destination;

    move-result-object v0

    return-object v0
.end method

.method public instantiateDestination()Landroidx/navigation/compose/DialogNavigator$Destination;
    .locals 4

    .line 2
    new-instance v0, Landroidx/navigation/compose/DialogNavigator$Destination;

    iget-object v1, p0, Landroidx/navigation/compose/DialogNavigatorDestinationBuilder;->dialogNavigator:Landroidx/navigation/compose/DialogNavigator;

    iget-object v2, p0, Landroidx/navigation/compose/DialogNavigatorDestinationBuilder;->dialogProperties:Landroidx/compose/ui/window/DialogProperties;

    iget-object v3, p0, Landroidx/navigation/compose/DialogNavigatorDestinationBuilder;->content:Lhd/q;

    invoke-direct {v0, v1, v2, v3}, Landroidx/navigation/compose/DialogNavigator$Destination;-><init>(Landroidx/navigation/compose/DialogNavigator;Landroidx/compose/ui/window/DialogProperties;Lhd/q;)V

    return-object v0
.end method
