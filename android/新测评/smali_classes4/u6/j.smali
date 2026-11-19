.class public final synthetic Lu6/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lkotlinx/coroutines/CoroutineScope;

.field public final synthetic b:Landroidx/compose/foundation/pager/PagerState;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/foundation/pager/PagerState;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu6/j;->a:Lkotlinx/coroutines/CoroutineScope;

    iput-object p2, p0, Lu6/j;->b:Landroidx/compose/foundation/pager/PagerState;

    iput p3, p0, Lu6/j;->c:I

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lu6/j;->a:Lkotlinx/coroutines/CoroutineScope;

    iget-object v1, p0, Lu6/j;->b:Landroidx/compose/foundation/pager/PagerState;

    iget v2, p0, Lu6/j;->c:I

    invoke-static {v0, v1, v2}, Lcom/zykj/evaluation/ui/progress/ProgressPageKt;->i(Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/foundation/pager/PagerState;I)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
