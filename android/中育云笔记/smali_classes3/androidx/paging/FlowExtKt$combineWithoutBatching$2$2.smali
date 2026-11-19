.class public final Landroidx/paging/FlowExtKt$combineWithoutBatching$2$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/paging/FlowExtKt$combineWithoutBatching$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lhd/a;"
    }
.end annotation


# instance fields
.field final synthetic $parentJob:Lsd/v;


# direct methods
.method public constructor <init>(Lsd/v;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/paging/FlowExtKt$combineWithoutBatching$2$2;->$parentJob:Lsd/v;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/paging/FlowExtKt$combineWithoutBatching$2$2;->invoke()V

    sget-object v0, Lqc/q;->a:Lqc/q;

    return-object v0
.end method

.method public final invoke()V
    .locals 3

    .line 2
    iget-object v0, p0, Landroidx/paging/FlowExtKt$combineWithoutBatching$2$2;->$parentJob:Lsd/v;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, Lkotlinx/coroutines/g$a;->a(Lkotlinx/coroutines/g;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    return-void
.end method
