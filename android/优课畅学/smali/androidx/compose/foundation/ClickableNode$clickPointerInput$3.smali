.class final Landroidx/compose/foundation/ClickableNode$clickPointerInput$3;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/ClickableNode;->clickPointerInput$suspendImpl(Landroidx/compose/foundation/ClickableNode;Landroidx/compose/ui/input/pointer/PointerInputScope;Lm7/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lx7/l;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Landroidx/compose/foundation/ClickableNode;


# direct methods
.method public constructor <init>(Landroidx/compose/foundation/ClickableNode;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/ClickableNode$clickPointerInput$3;->this$0:Landroidx/compose/foundation/ClickableNode;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, Landroidx/compose/ui/geometry/Offset;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroidx/compose/ui/geometry/Offset;->unbox-impl()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    invoke-virtual {p0, v0, v1}, Landroidx/compose/foundation/ClickableNode$clickPointerInput$3;->invoke-k-4lQ0M(J)V

    .line 8
    .line 9
    .line 10
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 11
    .line 12
    return-object p1
.end method

.method public final invoke-k-4lQ0M(J)V
    .locals 0

    .line 1
    iget-object p1, p0, Landroidx/compose/foundation/ClickableNode$clickPointerInput$3;->this$0:Landroidx/compose/foundation/ClickableNode;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroidx/compose/foundation/AbstractClickableNode;->getEnabled()Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, Landroidx/compose/foundation/ClickableNode$clickPointerInput$3;->this$0:Landroidx/compose/foundation/ClickableNode;

    .line 10
    .line 11
    invoke-virtual {p1}, Landroidx/compose/foundation/AbstractClickableNode;->getOnClick()Lx7/a;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-interface {p1}, Lx7/a;->invoke()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method
