.class public final Landroidx/work/impl/workers/ConstraintTrackingWorkerKt$awaitConstraintsNotMet$$inlined$filterIsInstance$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lvd/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/work/impl/workers/ConstraintTrackingWorkerKt;->awaitConstraintsNotMet(Landroidx/work/impl/constraints/WorkConstraintsTracker;Landroidx/work/impl/model/WorkSpec;Lvc/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lvd/c;"
    }
.end annotation


# instance fields
.field final synthetic $this_unsafeTransform$inlined:Lvd/c;


# direct methods
.method public constructor <init>(Lvd/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/work/impl/workers/ConstraintTrackingWorkerKt$awaitConstraintsNotMet$$inlined$filterIsInstance$1;->$this_unsafeTransform$inlined:Lvd/c;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public collect(Lvd/d;Lvc/c;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/work/impl/workers/ConstraintTrackingWorkerKt$awaitConstraintsNotMet$$inlined$filterIsInstance$1;->$this_unsafeTransform$inlined:Lvd/c;

    .line 2
    .line 3
    new-instance v1, Landroidx/work/impl/workers/ConstraintTrackingWorkerKt$awaitConstraintsNotMet$$inlined$filterIsInstance$1$2;

    .line 4
    .line 5
    invoke-direct {v1, p1}, Landroidx/work/impl/workers/ConstraintTrackingWorkerKt$awaitConstraintsNotMet$$inlined$filterIsInstance$1$2;-><init>(Lvd/d;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, v1, p2}, Lvd/c;->collect(Lvd/d;Lvc/c;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    if-ne p1, p2, :cond_0

    .line 17
    .line 18
    return-object p1

    .line 19
    :cond_0
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 20
    .line 21
    return-object p1
.end method
