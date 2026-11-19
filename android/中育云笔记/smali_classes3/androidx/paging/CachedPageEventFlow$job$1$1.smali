.class final Landroidx/paging/CachedPageEventFlow$job$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lvd/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/paging/CachedPageEventFlow$job$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lvd/d;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Landroidx/paging/CachedPageEventFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/paging/CachedPageEventFlow<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/paging/CachedPageEventFlow;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/CachedPageEventFlow<",
            "TT;>;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/paging/CachedPageEventFlow$job$1$1;->this$0:Landroidx/paging/CachedPageEventFlow;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic emit(Ljava/lang/Object;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lrc/k0;

    invoke-virtual {p0, p1, p2}, Landroidx/paging/CachedPageEventFlow$job$1$1;->emit(Lrc/k0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final emit(Lrc/k0;Lvc/c;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lrc/k0;",
            "Lvc/c<",
            "-",
            "Lqc/q;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Landroidx/paging/CachedPageEventFlow$job$1$1$emit$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Landroidx/paging/CachedPageEventFlow$job$1$1$emit$1;

    iget v1, v0, Landroidx/paging/CachedPageEventFlow$job$1$1$emit$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Landroidx/paging/CachedPageEventFlow$job$1$1$emit$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Landroidx/paging/CachedPageEventFlow$job$1$1$emit$1;

    invoke-direct {v0, p0, p2}, Landroidx/paging/CachedPageEventFlow$job$1$1$emit$1;-><init>(Landroidx/paging/CachedPageEventFlow$job$1$1;Lvc/c;)V

    :goto_0
    iget-object p2, v0, Landroidx/paging/CachedPageEventFlow$job$1$1$emit$1;->result:Ljava/lang/Object;

    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    move-result-object v1

    .line 2
    iget v2, v0, Landroidx/paging/CachedPageEventFlow$job$1$1$emit$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Landroidx/paging/CachedPageEventFlow$job$1$1$emit$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lrc/k0;

    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 3
    iget-object p2, p0, Landroidx/paging/CachedPageEventFlow$job$1$1;->this$0:Landroidx/paging/CachedPageEventFlow;

    invoke-static {p2}, Landroidx/paging/CachedPageEventFlow;->access$getMutableSharedSrc$p(Landroidx/paging/CachedPageEventFlow;)Lvd/k;

    move-result-object p2

    iput-object p1, v0, Landroidx/paging/CachedPageEventFlow$job$1$1$emit$1;->L$0:Ljava/lang/Object;

    iput v4, v0, Landroidx/paging/CachedPageEventFlow$job$1$1$emit$1;->label:I

    invoke-interface {p2, p1, v0}, Lvd/k;->emit(Ljava/lang/Object;Lvc/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    goto :goto_2

    .line 4
    :cond_4
    :goto_1
    iget-object p2, p0, Landroidx/paging/CachedPageEventFlow$job$1$1;->this$0:Landroidx/paging/CachedPageEventFlow;

    invoke-static {p2}, Landroidx/paging/CachedPageEventFlow;->access$getPageController$p(Landroidx/paging/CachedPageEventFlow;)Landroidx/paging/FlattenedPageController;

    move-result-object p2

    const/4 v2, 0x0

    iput-object v2, v0, Landroidx/paging/CachedPageEventFlow$job$1$1$emit$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Landroidx/paging/CachedPageEventFlow$job$1$1$emit$1;->label:I

    invoke-virtual {p2, p1, v0}, Landroidx/paging/FlattenedPageController;->record(Lrc/k0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    .line 5
    :cond_5
    :goto_3
    sget-object p1, Lqc/q;->a:Lqc/q;

    return-object p1
.end method
