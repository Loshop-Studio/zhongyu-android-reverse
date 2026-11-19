.class public final Lcom/friday/paint/view/ThePaintFragment$initDrawerRight$2;
.super Landroidx/drawerlayout/widget/DrawerLayout$SimpleDrawerListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/paint/view/ThePaintFragment;->initDrawerRight()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/friday/paint/view/ThePaintFragment;


# direct methods
.method public constructor <init>(Lcom/friday/paint/view/ThePaintFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/paint/view/ThePaintFragment$initDrawerRight$2;->a:Lcom/friday/paint/view/ThePaintFragment;

    .line 2
    .line 3
    invoke-direct {p0}, Landroidx/drawerlayout/widget/DrawerLayout$SimpleDrawerListener;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onDrawerOpened(Landroid/view/View;)V
    .locals 6

    .line 1
    const-string v0, "drawerView"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/friday/paint/view/ThePaintFragment$initDrawerRight$2;->a:Lcom/friday/paint/view/ThePaintFragment;

    .line 7
    .line 8
    invoke-static {p1}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    new-instance v3, Lcom/friday/paint/view/ThePaintFragment$initDrawerRight$2$onDrawerOpened$1;

    .line 13
    .line 14
    iget-object p1, p0, Lcom/friday/paint/view/ThePaintFragment$initDrawerRight$2;->a:Lcom/friday/paint/view/ThePaintFragment;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-direct {v3, p1, v1}, Lcom/friday/paint/view/ThePaintFragment$initDrawerRight$2$onDrawerOpened$1;-><init>(Lcom/friday/paint/view/ThePaintFragment;Lvc/c;)V

    .line 18
    .line 19
    .line 20
    const/4 v4, 0x3

    .line 21
    const/4 v5, 0x0

    .line 22
    const/4 v2, 0x0

    .line 23
    invoke-static/range {v0 .. v5}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 24
    .line 25
    .line 26
    return-void
.end method
