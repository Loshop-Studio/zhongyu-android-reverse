.class public final synthetic Lu6/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Lu6/p;

.field public final synthetic b:Landroidx/compose/foundation/pager/PagerState;

.field public final synthetic c:F

.field public final synthetic d:F

.field public final synthetic e:Lkotlinx/coroutines/CoroutineScope;


# direct methods
.method public synthetic constructor <init>(Lu6/p;Landroidx/compose/foundation/pager/PagerState;FFLkotlinx/coroutines/CoroutineScope;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu6/d;->a:Lu6/p;

    iput-object p2, p0, Lu6/d;->b:Landroidx/compose/foundation/pager/PagerState;

    iput p3, p0, Lu6/d;->c:F

    iput p4, p0, Lu6/d;->d:F

    iput-object p5, p0, Lu6/d;->e:Lkotlinx/coroutines/CoroutineScope;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, Lu6/d;->a:Lu6/p;

    iget-object v1, p0, Lu6/d;->b:Landroidx/compose/foundation/pager/PagerState;

    iget v2, p0, Lu6/d;->c:F

    iget v3, p0, Lu6/d;->d:F

    iget-object v4, p0, Lu6/d;->e:Lkotlinx/coroutines/CoroutineScope;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v0 .. v6}, Lcom/zykj/evaluation/ui/progress/ProgressPageKt;->g(Lu6/p;Landroidx/compose/foundation/pager/PagerState;FFLkotlinx/coroutines/CoroutineScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
