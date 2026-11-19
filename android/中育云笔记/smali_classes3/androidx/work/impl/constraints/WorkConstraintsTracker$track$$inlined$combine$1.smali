.class public final Landroidx/work/impl/constraints/WorkConstraintsTracker$track$$inlined$combine$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lvd/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/work/impl/constraints/WorkConstraintsTracker;->track(Landroidx/work/impl/model/WorkSpec;)Lvd/c;
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
.field final synthetic $flowArray$inlined:[Lvd/c;


# direct methods
.method public constructor <init>([Lvd/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/work/impl/constraints/WorkConstraintsTracker$track$$inlined$combine$1;->$flowArray$inlined:[Lvd/c;

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
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/work/impl/constraints/WorkConstraintsTracker$track$$inlined$combine$1;->$flowArray$inlined:[Lvd/c;

    .line 2
    .line 3
    new-instance v1, Landroidx/work/impl/constraints/WorkConstraintsTracker$track$$inlined$combine$1$2;

    .line 4
    .line 5
    invoke-direct {v1, v0}, Landroidx/work/impl/constraints/WorkConstraintsTracker$track$$inlined$combine$1$2;-><init>([Lvd/c;)V

    .line 6
    .line 7
    .line 8
    new-instance v2, Landroidx/work/impl/constraints/WorkConstraintsTracker$track$$inlined$combine$1$3;

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-direct {v2, v3}, Landroidx/work/impl/constraints/WorkConstraintsTracker$track$$inlined$combine$1$3;-><init>(Lvc/c;)V

    .line 12
    .line 13
    .line 14
    invoke-static {p1, v0, v1, v2, p2}, Lkotlinx/coroutines/flow/internal/CombineKt;->a(Lvd/d;[Lvd/c;Lhd/a;Lhd/q;Lvc/c;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    if-ne p1, p2, :cond_0

    .line 23
    .line 24
    return-object p1

    .line 25
    :cond_0
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 26
    .line 27
    return-object p1
.end method
