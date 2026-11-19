.class public final synthetic Landroidx/work/multiprocess/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c:Lkotlinx/coroutines/g;

.field public final synthetic d:I

.field public final synthetic e:Landroidx/work/multiprocess/IWorkManagerImplCallback;


# direct methods
.method public synthetic constructor <init>(Lkotlinx/coroutines/g;ILandroidx/work/multiprocess/IWorkManagerImplCallback;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/work/multiprocess/a;->c:Lkotlinx/coroutines/g;

    iput p2, p0, Landroidx/work/multiprocess/a;->d:I

    iput-object p3, p0, Landroidx/work/multiprocess/a;->e:Landroidx/work/multiprocess/IWorkManagerImplCallback;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/work/multiprocess/a;->c:Lkotlinx/coroutines/g;

    iget v1, p0, Landroidx/work/multiprocess/a;->d:I

    iget-object v2, p0, Landroidx/work/multiprocess/a;->e:Landroidx/work/multiprocess/IWorkManagerImplCallback;

    invoke-static {v0, v1, v2}, Landroidx/work/multiprocess/ListenableWorkerImpl;->l(Lkotlinx/coroutines/g;ILandroidx/work/multiprocess/IWorkManagerImplCallback;)V

    return-void
.end method
