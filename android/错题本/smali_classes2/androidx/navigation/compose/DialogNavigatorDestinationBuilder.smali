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

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B:\u0008\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t\u00a2\u0006\u0002\u0008\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000fB[\u0008\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0006\u001a\u0006\u0012\u0002\u0008\u00030\u0010\u0012\u001b\u0010\u0015\u001a\u0017\u0012\u0004\u0012\u00020\u0012\u0012\r\u0012\u000b\u0012\u0002\u0008\u00030\u0013\u00a2\u0006\u0002\u0008\u00140\u0011\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t\u00a2\u0006\u0002\u0008\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0014\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u0008\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\u001bR%\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t\u00a2\u0006\u0002\u0008\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u001c\u00a8\u0006\u001d"
    }
    d2 = {
        "Landroidx/navigation/compose/DialogNavigatorDestinationBuilder;",
        "Landroidx/navigation/NavDestinationBuilder;",
        "Landroidx/navigation/compose/DialogNavigator$Destination;",
        "Landroidx/navigation/compose/DialogNavigator;",
        "navigator",
        "",
        "route",
        "Landroidx/compose/ui/window/DialogProperties;",
        "dialogProperties",
        "Lkotlin/Function1;",
        "Landroidx/navigation/NavBackStackEntry;",
        "Ld6/s;",
        "Landroidx/compose/runtime/Composable;",
        "content",
        "<init>",
        "(Landroidx/navigation/compose/DialogNavigator;Ljava/lang/String;Landroidx/compose/ui/window/DialogProperties;Lr6/f;)V",
        "Ly6/c;",
        "",
        "Ly6/q;",
        "Landroidx/navigation/NavType;",
        "Lkotlin/jvm/JvmSuppressWildcards;",
        "typeMap",
        "(Landroidx/navigation/compose/DialogNavigator;Ly6/c;Ljava/util/Map;Landroidx/compose/ui/window/DialogProperties;Lr6/f;)V",
        "instantiateDestination",
        "()Landroidx/navigation/compose/DialogNavigator$Destination;",
        "dialogNavigator",
        "Landroidx/navigation/compose/DialogNavigator;",
        "Landroidx/compose/ui/window/DialogProperties;",
        "Lr6/f;",
        "navigation-compose_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final content:Lr6/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr6/f;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final dialogNavigator:Landroidx/navigation/compose/DialogNavigator;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final dialogProperties:Landroidx/compose/ui/window/DialogProperties;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/navigation/compose/DialogNavigator;Ljava/lang/String;Landroidx/compose/ui/window/DialogProperties;Lr6/f;)V
    .locals 0
    .param p1    # Landroidx/navigation/compose/DialogNavigator;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Landroidx/compose/ui/window/DialogProperties;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lr6/f;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/navigation/compose/DialogNavigator;",
            "Ljava/lang/String;",
            "Landroidx/compose/ui/window/DialogProperties;",
            "Lr6/f;",
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
    iput-object p4, p0, Landroidx/navigation/compose/DialogNavigatorDestinationBuilder;->content:Lr6/f;

    return-void
.end method

.method public constructor <init>(Landroidx/navigation/compose/DialogNavigator;Ly6/c;Ljava/util/Map;Landroidx/compose/ui/window/DialogProperties;Lr6/f;)V
    .locals 0
    .param p1    # Landroidx/navigation/compose/DialogNavigator;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ly6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/util/Map;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Landroidx/compose/ui/window/DialogProperties;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lr6/f;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/navigation/compose/DialogNavigator;",
            "Ly6/c;",
            "Ljava/util/Map<",
            "Ly6/q;",
            "Landroidx/navigation/NavType<",
            "*>;>;",
            "Landroidx/compose/ui/window/DialogProperties;",
            "Lr6/f;",
            ")V"
        }
    .end annotation

    .line 5
    invoke-direct {p0, p1, p2, p3}, Landroidx/navigation/NavDestinationBuilder;-><init>(Landroidx/navigation/Navigator;Ly6/c;Ljava/util/Map;)V

    .line 6
    iput-object p1, p0, Landroidx/navigation/compose/DialogNavigatorDestinationBuilder;->dialogNavigator:Landroidx/navigation/compose/DialogNavigator;

    .line 7
    iput-object p4, p0, Landroidx/navigation/compose/DialogNavigatorDestinationBuilder;->dialogProperties:Landroidx/compose/ui/window/DialogProperties;

    .line 8
    iput-object p5, p0, Landroidx/navigation/compose/DialogNavigatorDestinationBuilder;->content:Lr6/f;

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
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 2
    new-instance v0, Landroidx/navigation/compose/DialogNavigator$Destination;

    iget-object v1, p0, Landroidx/navigation/compose/DialogNavigatorDestinationBuilder;->dialogNavigator:Landroidx/navigation/compose/DialogNavigator;

    iget-object v2, p0, Landroidx/navigation/compose/DialogNavigatorDestinationBuilder;->dialogProperties:Landroidx/compose/ui/window/DialogProperties;

    iget-object v3, p0, Landroidx/navigation/compose/DialogNavigatorDestinationBuilder;->content:Lr6/f;

    invoke-direct {v0, v1, v2, v3}, Landroidx/navigation/compose/DialogNavigator$Destination;-><init>(Landroidx/navigation/compose/DialogNavigator;Landroidx/compose/ui/window/DialogProperties;Lr6/f;)V

    return-object v0
.end method
