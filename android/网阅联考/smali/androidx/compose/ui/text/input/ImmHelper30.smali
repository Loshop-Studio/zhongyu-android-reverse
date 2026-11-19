.class final Landroidx/compose/ui/text/input/ImmHelper30;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/text/input/ImmHelper;


# annotations
.annotation build Landroidx/annotation/RequiresApi;
    value = 0x1e
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0017J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0017J\u000f\u0010\u0013\u001a\u0004\u0018\u00010\u0014*\u00020\u0015H\u0082\u0010J\u000e\u0010\u0013\u001a\u0004\u0018\u00010\u0014*\u00020\u0003H\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u00068BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\tR\u0016\u0010\n\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"
    }
    d2 = {
        "Landroidx/compose/ui/text/input/ImmHelper30;",
        "Landroidx/compose/ui/text/input/ImmHelper;",
        "view",
        "Landroid/view/View;",
        "(Landroid/view/View;)V",
        "_immHelper21",
        "Landroidx/compose/ui/text/input/ImmHelper21;",
        "immHelper21",
        "getImmHelper21",
        "()Landroidx/compose/ui/text/input/ImmHelper21;",
        "insetsControllerCompat",
        "Landroidx/core/view/WindowInsetsControllerCompat;",
        "getInsetsControllerCompat",
        "()Landroidx/core/view/WindowInsetsControllerCompat;",
        "hideSoftInput",
        "",
        "imm",
        "Landroid/view/inputmethod/InputMethodManager;",
        "showSoftInput",
        "findWindow",
        "Landroid/view/Window;",
        "Landroid/content/Context;",
        "ui_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nInputMethodManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InputMethodManager.kt\nandroidx/compose/ui/text/input/ImmHelper30\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,169:1\n1#2:170\n*E\n"
    }
.end annotation


# instance fields
.field private _immHelper21:Landroidx/compose/ui/text/input/ImmHelper21;

.field private final view:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    .line 1
    const-string/jumbo v0, "view"

    .line 2
    .line 3
    .line 4
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Landroidx/compose/ui/text/input/ImmHelper30;->view:Landroid/view/View;

    .line 11
    .line 12
    return-void
.end method

.method private final findWindow(Landroid/content/Context;)Landroid/view/Window;
    .locals 1

    .line 3
    :goto_0
    instance-of v0, p1, Landroid/app/Activity;

    if-eqz v0, :cond_0

    check-cast p1, Landroid/app/Activity;

    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, Landroid/content/ContextWrapper;

    if-eqz v0, :cond_1

    check-cast p1, Landroid/content/ContextWrapper;

    invoke-virtual {p1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object p1

    const-string v0, "baseContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_1
    return-object p1
.end method

.method private final findWindow(Landroid/view/View;)Landroid/view/Window;
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    instance-of v1, v0, Landroidx/compose/ui/window/DialogWindowProvider;

    if-eqz v1, :cond_0

    check-cast v0, Landroidx/compose/ui/window/DialogWindowProvider;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-interface {v0}, Landroidx/compose/ui/window/DialogWindowProvider;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-nez v0, :cond_2

    .line 2
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Landroidx/compose/ui/text/input/ImmHelper30;->findWindow(Landroid/content/Context;)Landroid/view/Window;

    move-result-object v0

    :cond_2
    return-object v0
.end method

.method private final getImmHelper21()Landroidx/compose/ui/text/input/ImmHelper21;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/text/input/ImmHelper30;->_immHelper21:Landroidx/compose/ui/text/input/ImmHelper21;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroidx/compose/ui/text/input/ImmHelper21;

    .line 6
    .line 7
    iget-object v1, p0, Landroidx/compose/ui/text/input/ImmHelper30;->view:Landroid/view/View;

    .line 8
    .line 9
    invoke-direct {v0, v1}, Landroidx/compose/ui/text/input/ImmHelper21;-><init>(Landroid/view/View;)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Landroidx/compose/ui/text/input/ImmHelper30;->_immHelper21:Landroidx/compose/ui/text/input/ImmHelper21;

    .line 13
    .line 14
    :cond_0
    return-object v0
.end method

.method private final getInsetsControllerCompat()Landroidx/core/view/WindowInsetsControllerCompat;
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/text/input/ImmHelper30;->view:Landroid/view/View;

    .line 2
    .line 3
    invoke-direct {p0, v0}, Landroidx/compose/ui/text/input/ImmHelper30;->findWindow(Landroid/view/View;)Landroid/view/Window;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance v1, Landroidx/core/view/WindowInsetsControllerCompat;

    .line 10
    .line 11
    iget-object v2, p0, Landroidx/compose/ui/text/input/ImmHelper30;->view:Landroid/view/View;

    .line 12
    .line 13
    invoke-direct {v1, v0, v2}, Landroidx/core/view/WindowInsetsControllerCompat;-><init>(Landroid/view/Window;Landroid/view/View;)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v1, 0x0

    .line 18
    :goto_0
    return-object v1
.end method


# virtual methods
.method public hideSoftInput(Landroid/view/inputmethod/InputMethodManager;)V
    .locals 1
    .annotation build Landroidx/annotation/DoNotInline;
    .end annotation

    .line 1
    const-string v0, "imm"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Landroidx/compose/ui/text/input/ImmHelper30;->getInsetsControllerCompat()Landroidx/core/view/WindowInsetsControllerCompat;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-static {}, Landroidx/core/view/WindowInsetsCompat$Type;->ime()I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    invoke-virtual {v0, p1}, Landroidx/core/view/WindowInsetsControllerCompat;->hide(I)V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-direct {p0}, Landroidx/compose/ui/text/input/ImmHelper30;->getImmHelper21()Landroidx/compose/ui/text/input/ImmHelper21;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0, p1}, Landroidx/compose/ui/text/input/ImmHelper21;->hideSoftInput(Landroid/view/inputmethod/InputMethodManager;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    return-void
.end method

.method public showSoftInput(Landroid/view/inputmethod/InputMethodManager;)V
    .locals 1
    .annotation build Landroidx/annotation/DoNotInline;
    .end annotation

    .line 1
    const-string v0, "imm"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Landroidx/compose/ui/text/input/ImmHelper30;->getInsetsControllerCompat()Landroidx/core/view/WindowInsetsControllerCompat;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-static {}, Landroidx/core/view/WindowInsetsCompat$Type;->ime()I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    invoke-virtual {v0, p1}, Landroidx/core/view/WindowInsetsControllerCompat;->show(I)V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-direct {p0}, Landroidx/compose/ui/text/input/ImmHelper30;->getImmHelper21()Landroidx/compose/ui/text/input/ImmHelper21;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0, p1}, Landroidx/compose/ui/text/input/ImmHelper21;->showSoftInput(Landroid/view/inputmethod/InputMethodManager;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    return-void
.end method
