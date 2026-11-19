.class public final synthetic Lz5/g1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;

.field public final synthetic b:Lkotlinx/coroutines/CoroutineScope;

.field public final synthetic c:Landroidx/compose/material3/DrawerState;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/material3/DrawerState;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz5/g1;->a:Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;

    iput-object p2, p0, Lz5/g1;->b:Lkotlinx/coroutines/CoroutineScope;

    iput-object p3, p0, Lz5/g1;->c:Landroidx/compose/material3/DrawerState;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lz5/g1;->a:Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;

    iget-object v1, p0, Lz5/g1;->b:Lkotlinx/coroutines/CoroutineScope;

    iget-object v2, p0, Lz5/g1;->c:Landroidx/compose/material3/DrawerState;

    check-cast p1, Lcom/zykj/evaluation/ui/detail/mistake/TagData;

    invoke-static {v0, v1, v2, p1}, Lcom/zykj/evaluation/ui/detail/mistake/MistakePageKt;->k(Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/material3/DrawerState;Lcom/zykj/evaluation/ui/detail/mistake/TagData;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
