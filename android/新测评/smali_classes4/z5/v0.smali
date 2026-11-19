.class public final synthetic Lz5/v0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Landroidx/compose/material3/DrawerState;

.field public final synthetic b:Lkotlinx/coroutines/CoroutineScope;

.field public final synthetic c:Lkotlin/jvm/functions/Function0;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/material3/DrawerState;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz5/v0;->a:Landroidx/compose/material3/DrawerState;

    iput-object p2, p0, Lz5/v0;->b:Lkotlinx/coroutines/CoroutineScope;

    iput-object p3, p0, Lz5/v0;->c:Lkotlin/jvm/functions/Function0;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lz5/v0;->a:Landroidx/compose/material3/DrawerState;

    iget-object v1, p0, Lz5/v0;->b:Lkotlinx/coroutines/CoroutineScope;

    iget-object v2, p0, Lz5/v0;->c:Lkotlin/jvm/functions/Function0;

    invoke-static {v0, v1, v2}, Lcom/zykj/evaluation/ui/detail/mistake/MistakePageKt;->o(Landroidx/compose/material3/DrawerState;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
