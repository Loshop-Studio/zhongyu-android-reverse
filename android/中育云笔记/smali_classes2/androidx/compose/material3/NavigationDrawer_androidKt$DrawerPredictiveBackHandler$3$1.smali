.class final Landroidx/compose/material3/NavigationDrawer_androidKt$DrawerPredictiveBackHandler$3$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material3/NavigationDrawer_androidKt;->DrawerPredictiveBackHandler(Landroidx/compose/material3/DrawerState;Lhd/q;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lhd/p;"
    }
.end annotation

.annotation runtime Lxc/d;
    c = "androidx.compose.material3.NavigationDrawer_androidKt$DrawerPredictiveBackHandler$3$1"
    f = "NavigationDrawer.android.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $drawerPredictiveBackState:Landroidx/compose/material3/DrawerPredictiveBackState;

.field final synthetic $drawerState:Landroidx/compose/material3/DrawerState;

.field label:I


# direct methods
.method public constructor <init>(Landroidx/compose/material3/DrawerState;Landroidx/compose/material3/DrawerPredictiveBackState;Lvc/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/material3/DrawerState;",
            "Landroidx/compose/material3/DrawerPredictiveBackState;",
            "Lvc/c<",
            "-",
            "Landroidx/compose/material3/NavigationDrawer_androidKt$DrawerPredictiveBackHandler$3$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/material3/NavigationDrawer_androidKt$DrawerPredictiveBackHandler$3$1;->$drawerState:Landroidx/compose/material3/DrawerState;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/material3/NavigationDrawer_androidKt$DrawerPredictiveBackHandler$3$1;->$drawerPredictiveBackState:Landroidx/compose/material3/DrawerPredictiveBackState;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lvc/c<",
            "*>;)",
            "Lvc/c<",
            "Lqc/q;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance p1, Landroidx/compose/material3/NavigationDrawer_androidKt$DrawerPredictiveBackHandler$3$1;

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/compose/material3/NavigationDrawer_androidKt$DrawerPredictiveBackHandler$3$1;->$drawerState:Landroidx/compose/material3/DrawerState;

    .line 4
    .line 5
    iget-object v1, p0, Landroidx/compose/material3/NavigationDrawer_androidKt$DrawerPredictiveBackHandler$3$1;->$drawerPredictiveBackState:Landroidx/compose/material3/DrawerPredictiveBackState;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Landroidx/compose/material3/NavigationDrawer_androidKt$DrawerPredictiveBackHandler$3$1;-><init>(Landroidx/compose/material3/DrawerState;Landroidx/compose/material3/DrawerPredictiveBackState;Lvc/c;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/material3/NavigationDrawer_androidKt$DrawerPredictiveBackHandler$3$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsd/i0;",
            "Lvc/c<",
            "-",
            "Lqc/q;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Landroidx/compose/material3/NavigationDrawer_androidKt$DrawerPredictiveBackHandler$3$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Landroidx/compose/material3/NavigationDrawer_androidKt$DrawerPredictiveBackHandler$3$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Landroidx/compose/material3/NavigationDrawer_androidKt$DrawerPredictiveBackHandler$3$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Landroidx/compose/material3/NavigationDrawer_androidKt$DrawerPredictiveBackHandler$3$1;->label:I

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Landroidx/compose/material3/NavigationDrawer_androidKt$DrawerPredictiveBackHandler$3$1;->$drawerState:Landroidx/compose/material3/DrawerState;

    .line 12
    .line 13
    invoke-virtual {p1}, Landroidx/compose/material3/DrawerState;->isClosed()Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    iget-object p1, p0, Landroidx/compose/material3/NavigationDrawer_androidKt$DrawerPredictiveBackHandler$3$1;->$drawerPredictiveBackState:Landroidx/compose/material3/DrawerPredictiveBackState;

    .line 20
    .line 21
    invoke-virtual {p1}, Landroidx/compose/material3/DrawerPredictiveBackState;->clear()V

    .line 22
    .line 23
    .line 24
    :cond_0
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 25
    .line 26
    return-object p1

    .line 27
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 28
    .line 29
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 30
    .line 31
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw p1
.end method
