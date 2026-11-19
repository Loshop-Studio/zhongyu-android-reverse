.class public final Landroidx/navigation/compose/DialogNavigator$Destination;
.super Landroidx/navigation/NavDestination;
.source "SourceFile"

# interfaces
.implements Landroidx/navigation/FloatingWindow;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation build Landroidx/navigation/NavDestination$ClassType;
    value = Landroidx/compose/runtime/Composable;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/navigation/compose/DialogNavigator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Destination"
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

.field private final dialogProperties:Landroidx/compose/ui/window/DialogProperties;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroidx/navigation/compose/DialogNavigator;Landroidx/compose/ui/window/DialogProperties;Lhd/q;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/navigation/compose/DialogNavigator;",
            "Landroidx/compose/ui/window/DialogProperties;",
            "Lhd/q;",
            ")V"
        }
    .end annotation

    .line 3
    invoke-direct {p0, p1}, Landroidx/navigation/NavDestination;-><init>(Landroidx/navigation/Navigator;)V

    .line 4
    iput-object p2, p0, Landroidx/navigation/compose/DialogNavigator$Destination;->dialogProperties:Landroidx/compose/ui/window/DialogProperties;

    .line 5
    iput-object p3, p0, Landroidx/navigation/compose/DialogNavigator$Destination;->content:Lhd/q;

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/navigation/compose/DialogNavigator;Landroidx/compose/ui/window/DialogProperties;Lhd/q;ILkotlin/jvm/internal/n;)V
    .locals 6

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    .line 1
    new-instance v0, Landroidx/compose/ui/window/DialogProperties;

    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Landroidx/compose/ui/window/DialogProperties;-><init>(ZZZILkotlin/jvm/internal/n;)V

    move-object p2, v0

    .line 2
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Landroidx/navigation/compose/DialogNavigator$Destination;-><init>(Landroidx/navigation/compose/DialogNavigator;Landroidx/compose/ui/window/DialogProperties;Lhd/q;)V

    return-void
.end method


# virtual methods
.method public final getContent$navigation_compose_release()Lhd/q;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lhd/q;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/navigation/compose/DialogNavigator$Destination;->content:Lhd/q;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getDialogProperties$navigation_compose_release()Landroidx/compose/ui/window/DialogProperties;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/navigation/compose/DialogNavigator$Destination;->dialogProperties:Landroidx/compose/ui/window/DialogProperties;

    .line 2
    .line 3
    return-object v0
.end method
