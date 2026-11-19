.class public interface abstract Landroidx/compose/foundation/gestures/TargetedFlingBehavior;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/foundation/gestures/FlingBehavior;


# annotations
.annotation build Landroidx/compose/runtime/Stable;
.end annotation


# direct methods
.method public static synthetic performFling$suspendImpl(Landroidx/compose/foundation/gestures/TargetedFlingBehavior;Landroidx/compose/foundation/gestures/ScrollScope;FLvc/c;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/gestures/TargetedFlingBehavior;",
            "Landroidx/compose/foundation/gestures/ScrollScope;",
            "F",
            "Lvc/c<",
            "-",
            "Ljava/lang/Float;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-static {}, Landroidx/compose/foundation/gestures/TargetedFlingBehaviorKt;->access$getNoOnReport$p()Lhd/l;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {p0, p1, p2, v0, p3}, Landroidx/compose/foundation/gestures/TargetedFlingBehavior;->performFling(Landroidx/compose/foundation/gestures/ScrollScope;FLhd/l;Lvc/c;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method


# virtual methods
.method public abstract performFling(Landroidx/compose/foundation/gestures/ScrollScope;FLhd/l;Lvc/c;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/gestures/ScrollScope;",
            "F",
            "Lhd/l;",
            "Lvc/c<",
            "-",
            "Ljava/lang/Float;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public performFling(Landroidx/compose/foundation/gestures/ScrollScope;FLvc/c;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/gestures/ScrollScope;",
            "F",
            "Lvc/c<",
            "-",
            "Ljava/lang/Float;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-static {p0, p1, p2, p3}, Landroidx/compose/foundation/gestures/TargetedFlingBehavior;->performFling$suspendImpl(Landroidx/compose/foundation/gestures/TargetedFlingBehavior;Landroidx/compose/foundation/gestures/ScrollScope;FLvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
