.class public final Landroidx/compose/animation/SharedTransitionScopeImpl$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/animation/SharedTransitionScopeImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/n;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/compose/animation/SharedTransitionScopeImpl$Companion;-><init>()V

    return-void
.end method

.method public static final synthetic access$getSharedTransitionObserver(Landroidx/compose/animation/SharedTransitionScopeImpl$Companion;)Landroidx/compose/runtime/snapshots/SnapshotStateObserver;
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/compose/animation/SharedTransitionScopeImpl$Companion;->getSharedTransitionObserver()Landroidx/compose/runtime/snapshots/SnapshotStateObserver;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final getSharedTransitionObserver()Landroidx/compose/runtime/snapshots/SnapshotStateObserver;
    .locals 1

    .line 1
    invoke-static {}, Landroidx/compose/animation/SharedTransitionScopeImpl;->access$getSharedTransitionObserver$delegate$cp()Lqc/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Lqc/d;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Landroidx/compose/runtime/snapshots/SnapshotStateObserver;

    .line 10
    .line 11
    return-object v0
.end method
