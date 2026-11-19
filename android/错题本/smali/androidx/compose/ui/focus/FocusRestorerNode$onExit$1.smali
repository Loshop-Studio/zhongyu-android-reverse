.class final Landroidx/compose/ui/focus/FocusRestorerNode$onExit$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lr6/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/focus/FocusRestorerNode;-><init>(Landroidx/compose/ui/focus/FocusRequester;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lr6/c;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Landroidx/compose/ui/focus/FocusEnterExitScope;",
        "Ld6/s;",
        "invoke",
        "(Landroidx/compose/ui/focus/FocusEnterExitScope;)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x9,
        0x0
    }
.end annotation


# instance fields
.field final synthetic this$0:Landroidx/compose/ui/focus/FocusRestorerNode;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/focus/FocusRestorerNode;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/focus/FocusRestorerNode$onExit$1;->this$0:Landroidx/compose/ui/focus/FocusRestorerNode;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/ui/focus/FocusEnterExitScope;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/focus/FocusRestorerNode$onExit$1;->invoke(Landroidx/compose/ui/focus/FocusEnterExitScope;)V

    sget-object p1, Ld6/s;->a:Ld6/s;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/ui/focus/FocusEnterExitScope;)V
    .locals 1

    .line 2
    iget-object p1, p0, Landroidx/compose/ui/focus/FocusRestorerNode$onExit$1;->this$0:Landroidx/compose/ui/focus/FocusRestorerNode;

    invoke-static {p1}, Landroidx/compose/ui/focus/FocusRequesterModifierNodeKt;->saveFocusedChild(Landroidx/compose/ui/focus/FocusRequesterModifierNode;)Z

    .line 3
    iget-object p1, p0, Landroidx/compose/ui/focus/FocusRestorerNode$onExit$1;->this$0:Landroidx/compose/ui/focus/FocusRestorerNode;

    invoke-static {p1}, Landroidx/compose/ui/focus/FocusRestorerNode;->access$getPinnedHandle$p(Landroidx/compose/ui/focus/FocusRestorerNode;)Landroidx/compose/ui/layout/PinnableContainer$PinnedHandle;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p1}, Landroidx/compose/ui/layout/PinnableContainer$PinnedHandle;->release()V

    .line 4
    :cond_0
    iget-object p1, p0, Landroidx/compose/ui/focus/FocusRestorerNode$onExit$1;->this$0:Landroidx/compose/ui/focus/FocusRestorerNode;

    invoke-static {p1}, Landroidx/compose/ui/focus/FocusRequesterModifierNodeKt;->pinFocusedChild(Landroidx/compose/ui/focus/FocusRequesterModifierNode;)Landroidx/compose/ui/layout/PinnableContainer$PinnedHandle;

    move-result-object v0

    invoke-static {p1, v0}, Landroidx/compose/ui/focus/FocusRestorerNode;->access$setPinnedHandle$p(Landroidx/compose/ui/focus/FocusRestorerNode;Landroidx/compose/ui/layout/PinnableContainer$PinnedHandle;)V

    return-void
.end method
