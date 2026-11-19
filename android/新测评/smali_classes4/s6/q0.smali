.class public final synthetic Ls6/q0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Lcom/zykj/evaluation/ui/home/HomeViewModel;

.field public final synthetic b:Lkotlin/jvm/functions/Function3;

.field public final synthetic c:Lkotlinx/coroutines/CoroutineScope;

.field public final synthetic d:Landroidx/compose/material3/DrawerState;

.field public final synthetic e:Landroidx/compose/runtime/State;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/evaluation/ui/home/HomeViewModel;Lkotlin/jvm/functions/Function3;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/material3/DrawerState;Landroidx/compose/runtime/State;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls6/q0;->a:Lcom/zykj/evaluation/ui/home/HomeViewModel;

    iput-object p2, p0, Ls6/q0;->b:Lkotlin/jvm/functions/Function3;

    iput-object p3, p0, Ls6/q0;->c:Lkotlinx/coroutines/CoroutineScope;

    iput-object p4, p0, Ls6/q0;->d:Landroidx/compose/material3/DrawerState;

    iput-object p5, p0, Ls6/q0;->e:Landroidx/compose/runtime/State;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, Ls6/q0;->a:Lcom/zykj/evaluation/ui/home/HomeViewModel;

    iget-object v1, p0, Ls6/q0;->b:Lkotlin/jvm/functions/Function3;

    iget-object v2, p0, Ls6/q0;->c:Lkotlinx/coroutines/CoroutineScope;

    iget-object v3, p0, Ls6/q0;->d:Landroidx/compose/material3/DrawerState;

    iget-object v4, p0, Ls6/q0;->e:Landroidx/compose/runtime/State;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v0 .. v6}, Lcom/zykj/evaluation/ui/home/HomePageKt;->p(Lcom/zykj/evaluation/ui/home/HomeViewModel;Lkotlin/jvm/functions/Function3;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/material3/DrawerState;Landroidx/compose/runtime/State;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
