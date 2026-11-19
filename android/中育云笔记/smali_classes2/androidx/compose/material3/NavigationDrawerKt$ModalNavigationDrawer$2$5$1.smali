.class final Landroidx/compose/material3/NavigationDrawerKt$ModalNavigationDrawer$2$5$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material3/NavigationDrawerKt;->ModalNavigationDrawer-FHprtrg(Lhd/p;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/DrawerState;ZJLhd/p;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lhd/l;"
    }
.end annotation


# instance fields
.field final synthetic $drawerState:Landroidx/compose/material3/DrawerState;

.field final synthetic $navigationMenu:Ljava/lang/String;

.field final synthetic $scope:Lsd/i0;


# direct methods
.method public constructor <init>(Ljava/lang/String;Landroidx/compose/material3/DrawerState;Lsd/i0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/material3/NavigationDrawerKt$ModalNavigationDrawer$2$5$1;->$navigationMenu:Ljava/lang/String;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/material3/NavigationDrawerKt$ModalNavigationDrawer$2$5$1;->$drawerState:Landroidx/compose/material3/DrawerState;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/compose/material3/NavigationDrawerKt$ModalNavigationDrawer$2$5$1;->$scope:Lsd/i0;

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;

    invoke-virtual {p0, p1}, Landroidx/compose/material3/NavigationDrawerKt$ModalNavigationDrawer$2$5$1;->invoke(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V

    sget-object p1, Lqc/q;->a:Lqc/q;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V
    .locals 3

    .line 2
    iget-object v0, p0, Landroidx/compose/material3/NavigationDrawerKt$ModalNavigationDrawer$2$5$1;->$navigationMenu:Ljava/lang/String;

    invoke-static {p1, v0}, Landroidx/compose/ui/semantics/SemanticsPropertiesKt;->setPaneTitle(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Landroidx/compose/material3/NavigationDrawerKt$ModalNavigationDrawer$2$5$1;->$drawerState:Landroidx/compose/material3/DrawerState;

    invoke-virtual {v0}, Landroidx/compose/material3/DrawerState;->isOpen()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    new-instance v0, Landroidx/compose/material3/NavigationDrawerKt$ModalNavigationDrawer$2$5$1$1;

    iget-object v1, p0, Landroidx/compose/material3/NavigationDrawerKt$ModalNavigationDrawer$2$5$1;->$drawerState:Landroidx/compose/material3/DrawerState;

    iget-object v2, p0, Landroidx/compose/material3/NavigationDrawerKt$ModalNavigationDrawer$2$5$1;->$scope:Lsd/i0;

    invoke-direct {v0, v1, v2}, Landroidx/compose/material3/NavigationDrawerKt$ModalNavigationDrawer$2$5$1$1;-><init>(Landroidx/compose/material3/DrawerState;Lsd/i0;)V

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {p1, v2, v0, v1, v2}, Landroidx/compose/ui/semantics/SemanticsPropertiesKt;->dismiss$default(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Ljava/lang/String;Lhd/a;ILjava/lang/Object;)V

    :cond_0
    return-void
.end method
