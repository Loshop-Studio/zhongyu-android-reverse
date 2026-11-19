.class public interface abstract Landroidx/compose/foundation/OverscrollEffect;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/Stable;
.end annotation


# direct methods
.method public static synthetic getEffectModifier$annotations()V
    .locals 0
    .annotation runtime Lqc/a;
    .end annotation

    return-void
.end method


# virtual methods
.method public abstract applyToFling-BMRW4eQ(JLhd/p;Lvc/c;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lhd/p;",
            "Lvc/c<",
            "-",
            "Lqc/q;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract applyToScroll-Rhakbz0(JILhd/l;)J
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JI",
            "Lhd/l;",
            ")J"
        }
    .end annotation
.end method

.method public getEffectModifier()Landroidx/compose/ui/Modifier;
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 2
    .line 3
    return-object v0
.end method

.method public getNode()Landroidx/compose/ui/node/DelegatableNode;
    .locals 1

    .line 1
    new-instance v0, Landroidx/compose/foundation/OverscrollEffect$node$1;

    .line 2
    .line 3
    invoke-direct {v0}, Landroidx/compose/foundation/OverscrollEffect$node$1;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public abstract isInProgress()Z
.end method
