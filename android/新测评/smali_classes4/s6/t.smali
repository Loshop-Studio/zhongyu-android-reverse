.class public final synthetic Ls6/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Ljava/util/List;

.field public final synthetic b:Landroidx/compose/foundation/pager/PagerState;

.field public final synthetic c:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Landroidx/compose/foundation/pager/PagerState;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls6/t;->a:Ljava/util/List;

    iput-object p2, p0, Ls6/t;->b:Landroidx/compose/foundation/pager/PagerState;

    iput-object p3, p0, Ls6/t;->c:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Ls6/t;->a:Ljava/util/List;

    iget-object v1, p0, Ls6/t;->b:Landroidx/compose/foundation/pager/PagerState;

    iget-object v2, p0, Ls6/t;->c:Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, v2, p1, p2}, Lcom/zykj/evaluation/ui/home/HomeMainKt;->a(Ljava/util/List;Landroidx/compose/foundation/pager/PagerState;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
