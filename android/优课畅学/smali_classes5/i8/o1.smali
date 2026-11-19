.class public final Li8/o1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final a:Lkotlinx/coroutines/CoroutineDispatcher;

.field public final b:Li8/j;


# direct methods
.method public constructor <init>(Lkotlinx/coroutines/CoroutineDispatcher;Li8/j;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Li8/o1;->a:Lkotlinx/coroutines/CoroutineDispatcher;

    .line 5
    .line 6
    iput-object p2, p0, Li8/o1;->b:Li8/j;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Li8/o1;->b:Li8/j;

    .line 2
    .line 3
    iget-object v1, p0, Li8/o1;->a:Lkotlinx/coroutines/CoroutineDispatcher;

    .line 4
    .line 5
    sget-object v2, Lh7/p;->a:Lh7/p;

    .line 6
    .line 7
    invoke-interface {v0, v1, v2}, Li8/j;->q(Lkotlinx/coroutines/CoroutineDispatcher;Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
