.class public final Landroidx/compose/ui/platform/AndroidTextToolbar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/platform/TextToolbar;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private actionMode:Landroid/view/ActionMode;

.field private status:Landroidx/compose/ui/platform/TextToolbarStatus;

.field private final textActionModeCallback:Landroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback;

.field private final view:Landroid/view/View;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/view/View;)V
    .locals 10

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/ui/platform/AndroidTextToolbar;->view:Landroid/view/View;

    .line 5
    .line 6
    new-instance v0, Landroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback;

    .line 7
    .line 8
    new-instance v1, Landroidx/compose/ui/platform/AndroidTextToolbar$textActionModeCallback$1;

    .line 9
    .line 10
    invoke-direct {v1, p0}, Landroidx/compose/ui/platform/AndroidTextToolbar$textActionModeCallback$1;-><init>(Landroidx/compose/ui/platform/AndroidTextToolbar;)V

    .line 11
    .line 12
    .line 13
    const/16 v8, 0x7e

    .line 14
    .line 15
    const/4 v9, 0x0

    .line 16
    const/4 v2, 0x0

    .line 17
    const/4 v3, 0x0

    .line 18
    const/4 v4, 0x0

    .line 19
    const/4 v5, 0x0

    .line 20
    const/4 v6, 0x0

    .line 21
    const/4 v7, 0x0

    .line 22
    invoke-direct/range {v0 .. v9}, Landroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback;-><init>(Lhd/a;Landroidx/compose/ui/geometry/Rect;Lhd/a;Lhd/a;Lhd/a;Lhd/a;Lhd/a;ILkotlin/jvm/internal/n;)V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidTextToolbar;->textActionModeCallback:Landroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback;

    .line 26
    .line 27
    sget-object p1, Landroidx/compose/ui/platform/TextToolbarStatus;->Hidden:Landroidx/compose/ui/platform/TextToolbarStatus;

    .line 28
    .line 29
    iput-object p1, p0, Landroidx/compose/ui/platform/AndroidTextToolbar;->status:Landroidx/compose/ui/platform/TextToolbarStatus;

    .line 30
    .line 31
    return-void
.end method

.method public static final synthetic access$setActionMode$p(Landroidx/compose/ui/platform/AndroidTextToolbar;Landroid/view/ActionMode;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/platform/AndroidTextToolbar;->actionMode:Landroid/view/ActionMode;

    .line 2
    .line 3
    return-void
.end method


# virtual methods
.method public getStatus()Landroidx/compose/ui/platform/TextToolbarStatus;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidTextToolbar;->status:Landroidx/compose/ui/platform/TextToolbarStatus;

    .line 2
    .line 3
    return-object v0
.end method

.method public hide()V
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/ui/platform/TextToolbarStatus;->Hidden:Landroidx/compose/ui/platform/TextToolbarStatus;

    .line 2
    .line 3
    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidTextToolbar;->status:Landroidx/compose/ui/platform/TextToolbarStatus;

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidTextToolbar;->actionMode:Landroid/view/ActionMode;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/ActionMode;->finish()V

    .line 10
    .line 11
    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidTextToolbar;->actionMode:Landroid/view/ActionMode;

    .line 14
    .line 15
    return-void
.end method

.method public showMenu(Landroidx/compose/ui/geometry/Rect;Lhd/a;Lhd/a;Lhd/a;Lhd/a;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/geometry/Rect;",
            "Lhd/a;",
            "Lhd/a;",
            "Lhd/a;",
            "Lhd/a;",
            ")V"
        }
    .end annotation

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    .line 15
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/platform/AndroidTextToolbar;->showMenu(Landroidx/compose/ui/geometry/Rect;Lhd/a;Lhd/a;Lhd/a;Lhd/a;Lhd/a;)V

    return-void
.end method

.method public showMenu(Landroidx/compose/ui/geometry/Rect;Lhd/a;Lhd/a;Lhd/a;Lhd/a;Lhd/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/geometry/Rect;",
            "Lhd/a;",
            "Lhd/a;",
            "Lhd/a;",
            "Lhd/a;",
            "Lhd/a;",
            ")V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidTextToolbar;->textActionModeCallback:Landroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback;

    invoke-virtual {v0, p1}, Landroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback;->setRect(Landroidx/compose/ui/geometry/Rect;)V

    .line 2
    iget-object p1, p0, Landroidx/compose/ui/platform/AndroidTextToolbar;->textActionModeCallback:Landroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback;

    invoke-virtual {p1, p2}, Landroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback;->setOnCopyRequested(Lhd/a;)V

    .line 3
    iget-object p1, p0, Landroidx/compose/ui/platform/AndroidTextToolbar;->textActionModeCallback:Landroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback;

    invoke-virtual {p1, p4}, Landroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback;->setOnCutRequested(Lhd/a;)V

    .line 4
    iget-object p1, p0, Landroidx/compose/ui/platform/AndroidTextToolbar;->textActionModeCallback:Landroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback;

    invoke-virtual {p1, p3}, Landroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback;->setOnPasteRequested(Lhd/a;)V

    .line 5
    iget-object p1, p0, Landroidx/compose/ui/platform/AndroidTextToolbar;->textActionModeCallback:Landroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback;

    invoke-virtual {p1, p5}, Landroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback;->setOnSelectAllRequested(Lhd/a;)V

    .line 6
    iget-object p1, p0, Landroidx/compose/ui/platform/AndroidTextToolbar;->textActionModeCallback:Landroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback;

    invoke-virtual {p1, p6}, Landroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback;->setOnAutofillRequested(Lhd/a;)V

    .line 7
    iget-object p1, p0, Landroidx/compose/ui/platform/AndroidTextToolbar;->actionMode:Landroid/view/ActionMode;

    if-nez p1, :cond_0

    .line 8
    sget-object p1, Landroidx/compose/ui/platform/TextToolbarStatus;->Shown:Landroidx/compose/ui/platform/TextToolbarStatus;

    iput-object p1, p0, Landroidx/compose/ui/platform/AndroidTextToolbar;->status:Landroidx/compose/ui/platform/TextToolbarStatus;

    .line 9
    sget-object p1, Landroidx/compose/ui/platform/TextToolbarHelperMethods;->INSTANCE:Landroidx/compose/ui/platform/TextToolbarHelperMethods;

    .line 10
    iget-object p2, p0, Landroidx/compose/ui/platform/AndroidTextToolbar;->view:Landroid/view/View;

    .line 11
    new-instance p3, Landroidx/compose/ui/platform/actionmodecallback/FloatingTextActionModeCallback;

    iget-object p4, p0, Landroidx/compose/ui/platform/AndroidTextToolbar;->textActionModeCallback:Landroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback;

    invoke-direct {p3, p4}, Landroidx/compose/ui/platform/actionmodecallback/FloatingTextActionModeCallback;-><init>(Landroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback;)V

    const/4 p4, 0x1

    .line 12
    invoke-virtual {p1, p2, p3, p4}, Landroidx/compose/ui/platform/TextToolbarHelperMethods;->startActionMode(Landroid/view/View;Landroid/view/ActionMode$Callback;I)Landroid/view/ActionMode;

    move-result-object p1

    .line 13
    iput-object p1, p0, Landroidx/compose/ui/platform/AndroidTextToolbar;->actionMode:Landroid/view/ActionMode;

    return-void

    :cond_0
    if-eqz p1, :cond_1

    .line 14
    invoke-virtual {p1}, Landroid/view/ActionMode;->invalidate()V

    :cond_1
    return-void
.end method
