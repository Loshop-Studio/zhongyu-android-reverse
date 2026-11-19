.class public final synthetic Ls6/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lkotlinx/coroutines/CoroutineScope;

.field public final synthetic b:Landroidx/compose/foundation/pager/PagerState;


# direct methods
.method public synthetic constructor <init>(Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/foundation/pager/PagerState;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls6/m;->a:Lkotlinx/coroutines/CoroutineScope;

    iput-object p2, p0, Ls6/m;->b:Landroidx/compose/foundation/pager/PagerState;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Ls6/m;->a:Lkotlinx/coroutines/CoroutineScope;

    iget-object v1, p0, Ls6/m;->b:Landroidx/compose/foundation/pager/PagerState;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {v0, v1, p1}, Lcom/zykj/evaluation/ui/home/HomeMainKt;->l(Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/foundation/pager/PagerState;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
