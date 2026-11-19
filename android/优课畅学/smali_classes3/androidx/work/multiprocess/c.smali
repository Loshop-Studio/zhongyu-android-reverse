.class public final synthetic Landroidx/work/multiprocess/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/work/multiprocess/RemoteDispatcher;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Landroidx/work/multiprocess/RemoteListenableDelegatingWorker;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Landroidx/work/multiprocess/RemoteListenableDelegatingWorker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/work/multiprocess/c;->a:Ljava/lang/String;

    iput-object p2, p0, Landroidx/work/multiprocess/c;->b:Landroidx/work/multiprocess/RemoteListenableDelegatingWorker;

    return-void
.end method


# virtual methods
.method public final execute(Ljava/lang/Object;Landroidx/work/multiprocess/IWorkManagerImplCallback;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/work/multiprocess/c;->a:Ljava/lang/String;

    iget-object v1, p0, Landroidx/work/multiprocess/c;->b:Landroidx/work/multiprocess/RemoteListenableDelegatingWorker;

    check-cast p1, Landroidx/work/multiprocess/IListenableWorkerImpl;

    invoke-static {v0, v1, p1, p2}, Landroidx/work/multiprocess/RemoteListenableDelegatingWorker$startWork$1;->c(Ljava/lang/String;Landroidx/work/multiprocess/RemoteListenableDelegatingWorker;Landroidx/work/multiprocess/IListenableWorkerImpl;Landroidx/work/multiprocess/IWorkManagerImplCallback;)V

    return-void
.end method
