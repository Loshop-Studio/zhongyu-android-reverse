.class public final Lcom/friday/paint/view/TheSketchFragment$initData$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/sketch/core/listener/ImageDeleteListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/paint/view/TheSketchFragment;->initData()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/friday/paint/view/TheSketchFragment;


# direct methods
.method public constructor <init>(Lcom/friday/paint/view/TheSketchFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/paint/view/TheSketchFragment$initData$1;->a:Lcom/friday/paint/view/TheSketchFragment;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onDeleteImagePath(Ljava/lang/String;)V
    .locals 7

    .line 1
    const-string v0, "fileName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/friday/paint/view/TheSketchFragment$initData$1;->a:Lcom/friday/paint/view/TheSketchFragment;

    .line 7
    .line 8
    invoke-static {v0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    new-instance v4, Lcom/friday/paint/view/TheSketchFragment$initData$1$onDeleteImagePath$1;

    .line 13
    .line 14
    iget-object v0, p0, Lcom/friday/paint/view/TheSketchFragment$initData$1;->a:Lcom/friday/paint/view/TheSketchFragment;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-direct {v4, v0, p1, v2}, Lcom/friday/paint/view/TheSketchFragment$initData$1$onDeleteImagePath$1;-><init>(Lcom/friday/paint/view/TheSketchFragment;Ljava/lang/String;Lvc/c;)V

    .line 18
    .line 19
    .line 20
    const/4 v5, 0x3

    .line 21
    const/4 v6, 0x0

    .line 22
    const/4 v3, 0x0

    .line 23
    invoke-static/range {v1 .. v6}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 24
    .line 25
    .line 26
    return-void
.end method
