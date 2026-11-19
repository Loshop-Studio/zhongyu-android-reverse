.class public final synthetic Ls6/y0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lkotlinx/coroutines/CoroutineScope;

.field public final synthetic b:Landroidx/compose/material3/DrawerState;


# direct methods
.method public synthetic constructor <init>(Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/material3/DrawerState;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls6/y0;->a:Lkotlinx/coroutines/CoroutineScope;

    iput-object p2, p0, Ls6/y0;->b:Landroidx/compose/material3/DrawerState;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Ls6/y0;->a:Lkotlinx/coroutines/CoroutineScope;

    iget-object v1, p0, Ls6/y0;->b:Landroidx/compose/material3/DrawerState;

    invoke-static {v0, v1}, Lcom/zykj/evaluation/ui/home/HomePageKt;->c(Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/material3/DrawerState;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
