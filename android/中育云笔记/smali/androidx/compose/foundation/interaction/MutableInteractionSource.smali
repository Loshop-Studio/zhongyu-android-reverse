.class public interface abstract Landroidx/compose/foundation/interaction/MutableInteractionSource;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/foundation/interaction/InteractionSource;


# annotations
.annotation build Landroidx/compose/runtime/Stable;
.end annotation


# virtual methods
.method public abstract emit(Landroidx/compose/foundation/interaction/Interaction;Lvc/c;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/interaction/Interaction;",
            "Lvc/c<",
            "-",
            "Lqc/q;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract tryEmit(Landroidx/compose/foundation/interaction/Interaction;)Z
.end method
