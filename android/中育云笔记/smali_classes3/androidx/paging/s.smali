.class public final synthetic Landroidx/paging/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# instance fields
.field public final synthetic c:Landroidx/paging/LoadType;

.field public final synthetic d:Landroidx/paging/ViewportHint;


# direct methods
.method public synthetic constructor <init>(Landroidx/paging/LoadType;Landroidx/paging/ViewportHint;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/paging/s;->c:Landroidx/paging/LoadType;

    iput-object p2, p0, Landroidx/paging/s;->d:Landroidx/paging/ViewportHint;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/paging/s;->c:Landroidx/paging/LoadType;

    iget-object v1, p0, Landroidx/paging/s;->d:Landroidx/paging/ViewportHint;

    check-cast p1, Landroidx/paging/HintHandler$HintFlow;

    check-cast p2, Landroidx/paging/HintHandler$HintFlow;

    invoke-static {v0, v1, p1, p2}, Landroidx/paging/HintHandler;->b(Landroidx/paging/LoadType;Landroidx/paging/ViewportHint;Landroidx/paging/HintHandler$HintFlow;Landroidx/paging/HintHandler$HintFlow;)Lqc/q;

    move-result-object p1

    return-object p1
.end method
