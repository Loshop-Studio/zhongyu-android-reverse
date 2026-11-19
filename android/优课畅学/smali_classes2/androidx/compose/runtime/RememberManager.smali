.class public interface abstract Landroidx/compose/runtime/RememberManager;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract deactivating(Landroidx/compose/runtime/ComposeNodeLifecycleCallback;III)V
.end method

.method public abstract endResumingScope(Landroidx/compose/runtime/RecomposeScopeImpl;)V
.end method

.method public abstract forgetting(Landroidx/compose/runtime/RememberObserverHolder;III)V
.end method

.method public abstract releasing(Landroidx/compose/runtime/ComposeNodeLifecycleCallback;III)V
.end method

.method public abstract rememberPausingScope(Landroidx/compose/runtime/RecomposeScopeImpl;)V
.end method

.method public abstract remembering(Landroidx/compose/runtime/RememberObserverHolder;)V
.end method

.method public abstract sideEffect(Lx7/a;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx7/a;",
            ")V"
        }
    .end annotation
.end method

.method public abstract startResumingScope(Landroidx/compose/runtime/RecomposeScopeImpl;)V
.end method
