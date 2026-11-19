.class public final synthetic Landroidx/paging/j1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Landroidx/paging/LoadType;

.field public final synthetic d:Landroidx/paging/RemoteMediator$MediatorResult;


# direct methods
.method public synthetic constructor <init>(Landroidx/paging/LoadType;Landroidx/paging/RemoteMediator$MediatorResult;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/paging/j1;->c:Landroidx/paging/LoadType;

    iput-object p2, p0, Landroidx/paging/j1;->d:Landroidx/paging/RemoteMediator$MediatorResult;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/paging/j1;->c:Landroidx/paging/LoadType;

    iget-object v1, p0, Landroidx/paging/j1;->d:Landroidx/paging/RemoteMediator$MediatorResult;

    check-cast p1, Landroidx/paging/AccessorState;

    invoke-static {v0, v1, p1}, Landroidx/paging/RemoteMediatorAccessImpl$launchBoundary$1$1;->n(Landroidx/paging/LoadType;Landroidx/paging/RemoteMediator$MediatorResult;Landroidx/paging/AccessorState;)Lqc/q;

    move-result-object p1

    return-object p1
.end method
