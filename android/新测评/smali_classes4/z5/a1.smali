.class public final synthetic Lz5/a1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Landroidx/compose/material3/DrawerState;

.field public final synthetic b:Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;

.field public final synthetic c:Landroidx/navigation/NavController;

.field public final synthetic d:Lkotlinx/coroutines/CoroutineScope;

.field public final synthetic e:Landroidx/compose/runtime/State;

.field public final synthetic f:Lkotlin/jvm/functions/Function1;

.field public final synthetic g:Landroid/content/Context;

.field public final synthetic h:Lkotlin/jvm/functions/Function0;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/material3/DrawerState;Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;Landroidx/navigation/NavController;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/runtime/State;Lkotlin/jvm/functions/Function1;Landroid/content/Context;Lkotlin/jvm/functions/Function0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz5/a1;->a:Landroidx/compose/material3/DrawerState;

    iput-object p2, p0, Lz5/a1;->b:Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;

    iput-object p3, p0, Lz5/a1;->c:Landroidx/navigation/NavController;

    iput-object p4, p0, Lz5/a1;->d:Lkotlinx/coroutines/CoroutineScope;

    iput-object p5, p0, Lz5/a1;->e:Landroidx/compose/runtime/State;

    iput-object p6, p0, Lz5/a1;->f:Lkotlin/jvm/functions/Function1;

    iput-object p7, p0, Lz5/a1;->g:Landroid/content/Context;

    iput-object p8, p0, Lz5/a1;->h:Lkotlin/jvm/functions/Function0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-object v0, p0, Lz5/a1;->a:Landroidx/compose/material3/DrawerState;

    iget-object v1, p0, Lz5/a1;->b:Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;

    iget-object v2, p0, Lz5/a1;->c:Landroidx/navigation/NavController;

    iget-object v3, p0, Lz5/a1;->d:Lkotlinx/coroutines/CoroutineScope;

    iget-object v4, p0, Lz5/a1;->e:Landroidx/compose/runtime/State;

    iget-object v5, p0, Lz5/a1;->f:Lkotlin/jvm/functions/Function1;

    iget-object v6, p0, Lz5/a1;->g:Landroid/content/Context;

    iget-object v7, p0, Lz5/a1;->h:Lkotlin/jvm/functions/Function0;

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    invoke-static/range {v0 .. v9}, Lcom/zykj/evaluation/ui/detail/mistake/MistakePageKt;->d(Landroidx/compose/material3/DrawerState;Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;Landroidx/navigation/NavController;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/runtime/State;Lkotlin/jvm/functions/Function1;Landroid/content/Context;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
