.class final Landroidx/compose/foundation/text/ContextMenu_androidKt$ContextMenuArea$2$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/text/ContextMenu_androidKt$ContextMenuArea$2$1;->invoke()V
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
    c = "androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$2$1$1"
    f = "ContextMenu.android.kt"
    l = {
        0x38
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $manager:Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;

.field final synthetic $menuItemsAvailability:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Landroidx/compose/foundation/text/MenuItemsAvailability;",
            ">;"
        }
    .end annotation
.end field

.field L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Landroidx/compose/runtime/MutableState;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Lvc/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/MutableState<",
            "Landroidx/compose/foundation/text/MenuItemsAvailability;",
            ">;",
            "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;",
            "Lvc/c<",
            "-",
            "Landroidx/compose/foundation/text/ContextMenu_androidKt$ContextMenuArea$2$1$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/text/ContextMenu_androidKt$ContextMenuArea$2$1$1;->$menuItemsAvailability:Landroidx/compose/runtime/MutableState;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/foundation/text/ContextMenu_androidKt$ContextMenuArea$2$1$1;->$manager:Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;

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
    new-instance p1, Landroidx/compose/foundation/text/ContextMenu_androidKt$ContextMenuArea$2$1$1;

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/compose/foundation/text/ContextMenu_androidKt$ContextMenuArea$2$1$1;->$menuItemsAvailability:Landroidx/compose/runtime/MutableState;

    .line 4
    .line 5
    iget-object v1, p0, Landroidx/compose/foundation/text/ContextMenu_androidKt$ContextMenuArea$2$1$1;->$manager:Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Landroidx/compose/foundation/text/ContextMenu_androidKt$ContextMenuArea$2$1$1;-><init>(Landroidx/compose/runtime/MutableState;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Lvc/c;)V

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

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/text/ContextMenu_androidKt$ContextMenuArea$2$1$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/text/ContextMenu_androidKt$ContextMenuArea$2$1$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Landroidx/compose/foundation/text/ContextMenu_androidKt$ContextMenuArea$2$1$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Landroidx/compose/foundation/text/ContextMenu_androidKt$ContextMenuArea$2$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Landroidx/compose/foundation/text/ContextMenu_androidKt$ContextMenuArea$2$1$1;->label:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Landroidx/compose/foundation/text/ContextMenu_androidKt$ContextMenuArea$2$1$1;->L$0:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Landroidx/compose/runtime/MutableState;

    .line 15
    .line 16
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 21
    .line 22
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 23
    .line 24
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw p1

    .line 28
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, Landroidx/compose/foundation/text/ContextMenu_androidKt$ContextMenuArea$2$1$1;->$menuItemsAvailability:Landroidx/compose/runtime/MutableState;

    .line 32
    .line 33
    iget-object v1, p0, Landroidx/compose/foundation/text/ContextMenu_androidKt$ContextMenuArea$2$1$1;->$manager:Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;

    .line 34
    .line 35
    iput-object p1, p0, Landroidx/compose/foundation/text/ContextMenu_androidKt$ContextMenuArea$2$1$1;->L$0:Ljava/lang/Object;

    .line 36
    .line 37
    iput v2, p0, Landroidx/compose/foundation/text/ContextMenu_androidKt$ContextMenuArea$2$1$1;->label:I

    .line 38
    .line 39
    invoke-static {v1, p0}, Landroidx/compose/foundation/text/ContextMenu_androidKt;->getContextMenuItemsAvailability(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Lvc/c;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    if-ne v1, v0, :cond_2

    .line 44
    .line 45
    return-object v0

    .line 46
    :cond_2
    move-object v0, p1

    .line 47
    move-object p1, v1

    .line 48
    :goto_0
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 52
    .line 53
    return-object p1
.end method
