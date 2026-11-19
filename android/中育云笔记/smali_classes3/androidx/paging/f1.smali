.class public final synthetic Landroidx/paging/f1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Landroidx/paging/RemoteMediatorAccessImpl;

.field public final synthetic d:Landroidx/paging/PagingState;


# direct methods
.method public synthetic constructor <init>(Landroidx/paging/RemoteMediatorAccessImpl;Landroidx/paging/PagingState;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/paging/f1;->c:Landroidx/paging/RemoteMediatorAccessImpl;

    iput-object p2, p0, Landroidx/paging/f1;->d:Landroidx/paging/PagingState;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/paging/f1;->c:Landroidx/paging/RemoteMediatorAccessImpl;

    iget-object v1, p0, Landroidx/paging/f1;->d:Landroidx/paging/PagingState;

    check-cast p1, Landroidx/paging/AccessorState;

    invoke-static {v0, v1, p1}, Landroidx/paging/RemoteMediatorAccessImpl;->c(Landroidx/paging/RemoteMediatorAccessImpl;Landroidx/paging/PagingState;Landroidx/paging/AccessorState;)Lqc/q;

    move-result-object p1

    return-object p1
.end method
