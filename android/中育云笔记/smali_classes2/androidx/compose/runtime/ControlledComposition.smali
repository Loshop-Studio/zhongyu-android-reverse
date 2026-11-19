.class public interface abstract Landroidx/compose/runtime/ControlledComposition;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/runtime/Composition;


# virtual methods
.method public abstract abandonChanges()V
.end method

.method public abstract applyChanges()V
.end method

.method public abstract applyLateChanges()V
.end method

.method public abstract changesApplied()V
.end method

.method public abstract composeContent(Lhd/p;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/p;",
            ")V"
        }
    .end annotation
.end method

.method public abstract delegateInvalidations(Landroidx/compose/runtime/ControlledComposition;ILhd/a;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/compose/runtime/ControlledComposition;",
            "I",
            "Lhd/a;",
            ")TR;"
        }
    .end annotation
.end method

.method public abstract disposeUnusedMovableContent(Landroidx/compose/runtime/MovableContentState;)V
    .annotation build Landroidx/compose/runtime/InternalComposeApi;
    .end annotation
.end method

.method public abstract getAndSetShouldPauseCallback(Landroidx/compose/runtime/ShouldPauseCallback;)Landroidx/compose/runtime/ShouldPauseCallback;
.end method

.method public abstract getHasPendingChanges()Z
.end method

.method public abstract insertMovableContent(Ljava/util/List;)V
    .annotation build Landroidx/compose/runtime/InternalComposeApi;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lkotlin/Pair<",
            "Landroidx/compose/runtime/MovableContentStateReference;",
            "Landroidx/compose/runtime/MovableContentStateReference;",
            ">;>;)V"
        }
    .end annotation
.end method

.method public abstract invalidateAll()V
.end method

.method public abstract isComposing()Z
.end method

.method public abstract observesAnyOf(Ljava/util/Set;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "+",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation
.end method

.method public abstract prepareCompose(Lhd/a;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/a;",
            ")V"
        }
    .end annotation
.end method

.method public abstract recompose()Z
.end method

.method public abstract recordModificationsOf(Ljava/util/Set;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract recordReadOf(Ljava/lang/Object;)V
.end method

.method public abstract recordWriteOf(Ljava/lang/Object;)V
.end method

.method public abstract verifyConsistent()V
    .annotation build Landroidx/compose/runtime/InternalComposeApi;
    .end annotation
.end method
