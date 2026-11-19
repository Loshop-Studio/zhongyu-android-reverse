.class public final synthetic Lbe/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/q;


# instance fields
.field public final synthetic c:Lkotlinx/coroutines/sync/MutexImpl;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lkotlinx/coroutines/sync/MutexImpl;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbe/c;->c:Lkotlinx/coroutines/sync/MutexImpl;

    iput-object p2, p0, Lbe/c;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lbe/c;->c:Lkotlinx/coroutines/sync/MutexImpl;

    iget-object v1, p0, Lbe/c;->d:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Throwable;

    check-cast p3, Lkotlin/coroutines/d;

    invoke-static {v0, v1, p1, p2, p3}, Lkotlinx/coroutines/sync/MutexImpl;->t(Lkotlinx/coroutines/sync/MutexImpl;Ljava/lang/Object;Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/d;)Lqc/q;

    move-result-object p1

    return-object p1
.end method
