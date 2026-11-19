.class public final synthetic Landroidx/work/multiprocess/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lkotlinx/coroutines/n;

.field public final synthetic b:I

.field public final synthetic c:Landroidx/work/multiprocess/IWorkManagerImplCallback;


# direct methods
.method public synthetic constructor <init>(Lkotlinx/coroutines/n;ILandroidx/work/multiprocess/IWorkManagerImplCallback;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/work/multiprocess/a;->a:Lkotlinx/coroutines/n;

    iput p2, p0, Landroidx/work/multiprocess/a;->b:I

    iput-object p3, p0, Landroidx/work/multiprocess/a;->c:Landroidx/work/multiprocess/IWorkManagerImplCallback;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/work/multiprocess/a;->a:Lkotlinx/coroutines/n;

    iget v1, p0, Landroidx/work/multiprocess/a;->b:I

    iget-object v2, p0, Landroidx/work/multiprocess/a;->c:Landroidx/work/multiprocess/IWorkManagerImplCallback;

    invoke-static {v0, v1, v2}, Landroidx/work/multiprocess/ListenableWorkerImpl;->k(Lkotlinx/coroutines/n;ILandroidx/work/multiprocess/IWorkManagerImplCallback;)V

    return-void
.end method
