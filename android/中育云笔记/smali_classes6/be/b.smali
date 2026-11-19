.class public final synthetic Lbe/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/q;


# instance fields
.field public final synthetic c:Lkotlinx/coroutines/sync/MutexImpl;


# direct methods
.method public synthetic constructor <init>(Lkotlinx/coroutines/sync/MutexImpl;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbe/b;->c:Lkotlinx/coroutines/sync/MutexImpl;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lbe/b;->c:Lkotlinx/coroutines/sync/MutexImpl;

    check-cast p1, Lae/k;

    invoke-static {v0, p1, p2, p3}, Lkotlinx/coroutines/sync/MutexImpl;->u(Lkotlinx/coroutines/sync/MutexImpl;Lae/k;Ljava/lang/Object;Ljava/lang/Object;)Lhd/q;

    move-result-object p1

    return-object p1
.end method
