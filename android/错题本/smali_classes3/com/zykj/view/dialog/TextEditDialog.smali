.class public final Lcom/zykj/view/dialog/TextEditDialog;
.super Landroid/app/Dialog;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\t\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\nJ\u0017\u0010\u000e\u001a\u00020\u00082\u0006\u0010\r\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\u00082\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0014\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0008H\u0014\u00a2\u0006\u0004\u0008\u0017\u0010\nJ\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019H\u0016\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJK\u0010%\u001a\u00020\u00082\u0006\u0010\u001f\u001a\u00020\u001e2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00080 2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00080 2\u000c\u0010$\u001a\u0008\u0012\u0004\u0012\u00020\u00080#\u00a2\u0006\u0004\u0008%\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\'R\u0016\u0010)\u001a\u00020(8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008)\u0010*R\"\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00080 8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008+\u0010,R\"\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00080 8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\"\u0010,R\u001c\u0010$\u001a\u0008\u0012\u0004\u0012\u00020\u00080#8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008$\u0010-R\u0016\u0010.\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008.\u0010/R\u0016\u00100\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00080\u0010/\u00a8\u00061"
    }
    d2 = {
        "Lcom/zykj/view/dialog/TextEditDialog;",
        "Landroid/app/Dialog;",
        "Landroid/content/Context;",
        "activity",
        "",
        "themeResId",
        "<init>",
        "(Landroid/content/Context;I)V",
        "Ld6/s;",
        "setWindow",
        "()V",
        "calculateStatusBarHeight",
        "Landroid/view/View;",
        "activeView",
        "forceCloseKeyboard",
        "(Landroid/view/View;)V",
        "Landroid/app/Activity;",
        "showSoftInputForce",
        "(Landroid/app/Activity;)V",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "onCreate",
        "(Landroid/os/Bundle;)V",
        "onStart",
        "keyCode",
        "Landroid/view/KeyEvent;",
        "event",
        "",
        "onKeyDown",
        "(ILandroid/view/KeyEvent;)Z",
        "",
        "initText",
        "Lkotlin/Function1;",
        "afterTextChangeCallback",
        "doneCallback",
        "Lkotlin/Function0;",
        "cancelCallback",
        "showDialog",
        "(Ljava/lang/String;Lr6/c;Lr6/c;Lr6/a;)V",
        "Landroid/content/Context;",
        "Lcom/zykj/view/databinding/ViewDialogTextEditBinding;",
        "mBinding",
        "Lcom/zykj/view/databinding/ViewDialogTextEditBinding;",
        "afterTextChangedCallback",
        "Lr6/c;",
        "Lr6/a;",
        "statusBarHeight",
        "I",
        "keyboardHeight",
        "view_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final activity:Landroid/content/Context;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private afterTextChangedCallback:Lr6/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr6/c;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private cancelCallback:Lr6/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr6/a;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private doneCallback:Lr6/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr6/c;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private keyboardHeight:I

.field private mBinding:Lcom/zykj/view/databinding/ViewDialogTextEditBinding;

.field private statusBarHeight:I


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0, p1, p2}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 4
    iput-object p1, p0, Lcom/zykj/view/dialog/TextEditDialog;->activity:Landroid/content/Context;

    .line 5
    new-instance p1, Lcom/zykj/mistake/feature/notebook/list/k1;

    const/16 p2, 0x16

    invoke-direct {p1, p2}, Lcom/zykj/mistake/feature/notebook/list/k1;-><init>(I)V

    iput-object p1, p0, Lcom/zykj/view/dialog/TextEditDialog;->afterTextChangedCallback:Lr6/c;

    .line 6
    new-instance p1, Lcom/zykj/mistake/feature/notebook/list/k1;

    const/16 p2, 0x17

    invoke-direct {p1, p2}, Lcom/zykj/mistake/feature/notebook/list/k1;-><init>(I)V

    iput-object p1, p0, Lcom/zykj/view/dialog/TextEditDialog;->doneCallback:Lr6/c;

    .line 7
    new-instance p1, Lcom/zykj/view/board/play/b;

    const/4 p2, 0x3

    invoke-direct {p1, p2}, Lcom/zykj/view/board/play/b;-><init>(I)V

    iput-object p1, p0, Lcom/zykj/view/dialog/TextEditDialog;->cancelCallback:Lr6/a;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;IILkotlin/jvm/internal/e;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 1
    sget p2, Lcom/zykj/view/R$style;->AppTheme_Dialog:I

    .line 2
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/zykj/view/dialog/TextEditDialog;-><init>(Landroid/content/Context;I)V

    return-void
.end method

.method public static synthetic a(Lcom/zykj/view/dialog/TextEditDialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/dialog/TextEditDialog;->onCreate$lambda$4(Lcom/zykj/view/dialog/TextEditDialog;Landroid/view/View;)V

    return-void
.end method

.method public static final synthetic access$getAfterTextChangedCallback$p(Lcom/zykj/view/dialog/TextEditDialog;)Lr6/c;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/view/dialog/TextEditDialog;->afterTextChangedCallback:Lr6/c;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getMBinding$p(Lcom/zykj/view/dialog/TextEditDialog;)Lcom/zykj/view/databinding/ViewDialogTextEditBinding;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/view/dialog/TextEditDialog;->mBinding:Lcom/zykj/view/databinding/ViewDialogTextEditBinding;

    .line 2
    .line 3
    return-object p0
.end method

.method private static final afterTextChangedCallback$lambda$0(Ljava/lang/String;)Ld6/s;
    .locals 1

    .line 1
    const-string v0, "<unused var>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object p0, Ld6/s;->a:Ld6/s;

    .line 7
    .line 8
    return-object p0
.end method

.method public static synthetic b(Lcom/zykj/view/dialog/TextEditDialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/dialog/TextEditDialog;->onCreate$lambda$5(Lcom/zykj/view/dialog/TextEditDialog;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic c(Ljava/lang/String;)Ld6/s;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/view/dialog/TextEditDialog;->afterTextChangedCallback$lambda$0(Ljava/lang/String;)Ld6/s;

    move-result-object p0

    return-object p0
.end method

.method private final calculateStatusBarHeight()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "getResources(...)"

    .line 10
    .line 11
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-string v1, "dimen"

    .line 15
    .line 16
    const-string v2, "android"

    .line 17
    .line 18
    const-string v3, "status_bar_height"

    .line 19
    .line 20
    invoke-virtual {v0, v3, v1, v2}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iput v0, p0, Lcom/zykj/view/dialog/TextEditDialog;->statusBarHeight:I

    .line 29
    .line 30
    return-void
.end method

.method private static final cancelCallback$lambda$2()Ld6/s;
    .locals 1

    .line 1
    sget-object v0, Ld6/s;->a:Ld6/s;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic d(Landroid/view/Window;Lcom/zykj/view/dialog/TextEditDialog;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/dialog/TextEditDialog;->setWindow$lambda$9$lambda$8(Landroid/view/Window;Lcom/zykj/view/dialog/TextEditDialog;)V

    return-void
.end method

.method private static final doneCallback$lambda$1(Ljava/lang/String;)Ld6/s;
    .locals 1

    .line 1
    const-string v0, "<unused var>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object p0, Ld6/s;->a:Ld6/s;

    .line 7
    .line 8
    return-object p0
.end method

.method public static synthetic e(Ljava/lang/String;)Ld6/s;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/view/dialog/TextEditDialog;->doneCallback$lambda$1(Ljava/lang/String;)Ld6/s;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f()Ld6/s;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/view/dialog/TextEditDialog;->cancelCallback$lambda$2()Ld6/s;

    move-result-object v0

    return-object v0
.end method

.method private final forceCloseKeyboard(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "input_method"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager"

    .line 12
    .line 13
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    const/4 v1, 0x0

    .line 23
    invoke-virtual {v0, p1, v1}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public static synthetic g(Lcom/zykj/view/dialog/TextEditDialog;)Ld6/s;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/view/dialog/TextEditDialog;->onCreate$lambda$4$lambda$3(Lcom/zykj/view/dialog/TextEditDialog;)Ld6/s;

    move-result-object p0

    return-object p0
.end method

.method private static final onCreate$lambda$4(Lcom/zykj/view/dialog/TextEditDialog;Landroid/view/View;)V
    .locals 4

    .line 1
    iget-object p1, p0, Lcom/zykj/view/dialog/TextEditDialog;->mBinding:Lcom/zykj/view/databinding/ViewDialogTextEditBinding;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p1, :cond_1

    .line 5
    .line 6
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewDialogTextEditBinding;->etInput:Lcom/zykj/view/widget/LimitEditText;

    .line 7
    .line 8
    invoke-static {}, Lcom/blankj/utilcode/util/c;->d()Landroid/app/Application;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const-string v2, "input_method"

    .line 13
    .line 14
    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Landroid/view/inputmethod/InputMethodManager;

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    if-nez v1, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {v1, p1, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 29
    .line 30
    .line 31
    :goto_0
    new-instance p1, Lcom/zykj/view/dialog/CommonTipDialog;

    .line 32
    .line 33
    iget-object v1, p0, Lcom/zykj/view/dialog/TextEditDialog;->activity:Landroid/content/Context;

    .line 34
    .line 35
    const/4 v3, 0x2

    .line 36
    invoke-direct {p1, v1, v2, v3, v0}, Lcom/zykj/view/dialog/CommonTipDialog;-><init>(Landroid/content/Context;IILkotlin/jvm/internal/e;)V

    .line 37
    .line 38
    .line 39
    new-instance v0, Landroidx/navigation/b;

    .line 40
    .line 41
    const/16 v1, 0xb

    .line 42
    .line 43
    invoke-direct {v0, p0, v1}, Landroidx/navigation/b;-><init>(Ljava/lang/Object;I)V

    .line 44
    .line 45
    .line 46
    const-string p0, "\u662f\u5426\u53d6\u6d88\u6b64\u6b21\u7f16\u8f91"

    .line 47
    .line 48
    const/4 v1, 0x1

    .line 49
    invoke-virtual {p1, p0, v1, v0, v1}, Lcom/zykj/view/dialog/CommonTipDialog;->showDialog(Ljava/lang/String;ZLr6/a;Z)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_1
    const-string p0, "mBinding"

    .line 54
    .line 55
    invoke-static {p0}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw v0
.end method

.method private static final onCreate$lambda$4$lambda$3(Lcom/zykj/view/dialog/TextEditDialog;)Ld6/s;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/dialog/TextEditDialog;->cancelCallback:Lr6/a;

    .line 2
    .line 3
    invoke-interface {v0}, Lr6/a;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 7
    .line 8
    .line 9
    sget-object p0, Ld6/s;->a:Ld6/s;

    .line 10
    .line 11
    return-object p0
.end method

.method private static final onCreate$lambda$5(Lcom/zykj/view/dialog/TextEditDialog;Landroid/view/View;)V
    .locals 4

    .line 1
    iget-object p1, p0, Lcom/zykj/view/dialog/TextEditDialog;->mBinding:Lcom/zykj/view/databinding/ViewDialogTextEditBinding;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const-string v1, "mBinding"

    .line 5
    .line 6
    if-eqz p1, :cond_3

    .line 7
    .line 8
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewDialogTextEditBinding;->etInput:Lcom/zykj/view/widget/LimitEditText;

    .line 9
    .line 10
    invoke-virtual {p1}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    const/4 v3, 0x0

    .line 23
    if-nez v2, :cond_0

    .line 24
    .line 25
    const-string p0, "\u5185\u5bb9\u4e0d\u80fd\u4e3a\u7a7a"

    .line 26
    .line 27
    new-array p1, v3, [Ljava/lang/Object;

    .line 28
    .line 29
    invoke-static {p0, p1}, Lcom/blankj/utilcode/util/x;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_0
    iget-object v2, p0, Lcom/zykj/view/dialog/TextEditDialog;->doneCallback:Lr6/c;

    .line 34
    .line 35
    invoke-interface {v2, p1}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    iget-object p1, p0, Lcom/zykj/view/dialog/TextEditDialog;->mBinding:Lcom/zykj/view/databinding/ViewDialogTextEditBinding;

    .line 39
    .line 40
    if-eqz p1, :cond_2

    .line 41
    .line 42
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewDialogTextEditBinding;->etInput:Lcom/zykj/view/widget/LimitEditText;

    .line 43
    .line 44
    invoke-static {}, Lcom/blankj/utilcode/util/c;->d()Landroid/app/Application;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    const-string v1, "input_method"

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 55
    .line 56
    if-nez v0, :cond_1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-virtual {v0, p1, v3}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 64
    .line 65
    .line 66
    :goto_0
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :cond_2
    invoke-static {v1}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    throw v0

    .line 74
    :cond_3
    invoke-static {v1}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    throw v0
.end method

.method private final setWindow()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/16 v1, 0x10

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    new-instance v2, Lcom/zykj/view/dialog/c;

    .line 21
    .line 22
    invoke-direct {v2, v0, p0}, Lcom/zykj/view/dialog/c;-><init>(Landroid/view/Window;Lcom/zykj/view/dialog/TextEditDialog;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, v2}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void
.end method

.method private static final setWindow$lambda$9$lambda$8(Landroid/view/Window;Lcom/zykj/view/dialog/TextEditDialog;)V
    .locals 6

    .line 1
    new-instance v0, Landroid/graphics/Rect;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1, v0}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    .line 11
    .line 12
    .line 13
    iget v1, v0, Landroid/graphics/Rect;->bottom:I

    .line 14
    .line 15
    iget v0, v0, Landroid/graphics/Rect;->top:I

    .line 16
    .line 17
    sub-int/2addr v1, v0

    .line 18
    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    int-to-double v2, v1

    .line 27
    int-to-double v4, p0

    .line 28
    div-double/2addr v2, v4

    .line 29
    const-wide v4, 0x3fe999999999999aL    # 0.8

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    cmpg-double v0, v2, v4

    .line 35
    .line 36
    const/4 v2, 0x0

    .line 37
    const-string v3, "mBinding"

    .line 38
    .line 39
    if-gez v0, :cond_3

    .line 40
    .line 41
    if-eqz v1, :cond_3

    .line 42
    .line 43
    sub-int/2addr p0, v1

    .line 44
    iget v0, p1, Lcom/zykj/view/dialog/TextEditDialog;->keyboardHeight:I

    .line 45
    .line 46
    invoke-static {p0, v0}, Ljava/lang/Math;->max(II)I

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    iput p0, p1, Lcom/zykj/view/dialog/TextEditDialog;->keyboardHeight:I

    .line 51
    .line 52
    iget-object p0, p1, Lcom/zykj/view/dialog/TextEditDialog;->mBinding:Lcom/zykj/view/databinding/ViewDialogTextEditBinding;

    .line 53
    .line 54
    if-eqz p0, :cond_2

    .line 55
    .line 56
    iget-object v0, p0, Lcom/zykj/view/databinding/ViewDialogTextEditBinding;->viewSolid:Landroid/view/View;

    .line 57
    .line 58
    if-eqz p0, :cond_1

    .line 59
    .line 60
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    iget v1, p1, Lcom/zykj/view/dialog/TextEditDialog;->keyboardHeight:I

    .line 65
    .line 66
    iput v1, p0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 67
    .line 68
    invoke-virtual {v0, p0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 69
    .line 70
    .line 71
    iget p0, p1, Lcom/zykj/view/dialog/TextEditDialog;->keyboardHeight:I

    .line 72
    .line 73
    new-instance v0, Ljava/lang/StringBuilder;

    .line 74
    .line 75
    const-string v1, "keyboardHeight-> "

    .line 76
    .line 77
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    const-string v0, "TextEditDialog"

    .line 88
    .line 89
    invoke-static {v0, p0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 90
    .line 91
    .line 92
    iget-object p0, p1, Lcom/zykj/view/dialog/TextEditDialog;->mBinding:Lcom/zykj/view/databinding/ViewDialogTextEditBinding;

    .line 93
    .line 94
    if-eqz p0, :cond_0

    .line 95
    .line 96
    iget-object p0, p0, Lcom/zykj/view/databinding/ViewDialogTextEditBinding;->viewSolid:Landroid/view/View;

    .line 97
    .line 98
    const/4 p1, 0x0

    .line 99
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 100
    .line 101
    .line 102
    return-void

    .line 103
    :cond_0
    invoke-static {v3}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    throw v2

    .line 107
    :cond_1
    invoke-static {v3}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    throw v2

    .line 111
    :cond_2
    invoke-static {v3}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    throw v2

    .line 115
    :cond_3
    iget-object p0, p1, Lcom/zykj/view/dialog/TextEditDialog;->mBinding:Lcom/zykj/view/databinding/ViewDialogTextEditBinding;

    .line 116
    .line 117
    if-eqz p0, :cond_4

    .line 118
    .line 119
    iget-object p0, p0, Lcom/zykj/view/databinding/ViewDialogTextEditBinding;->viewSolid:Landroid/view/View;

    .line 120
    .line 121
    const/16 p1, 0x8

    .line 122
    .line 123
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 124
    .line 125
    .line 126
    return-void

    .line 127
    :cond_4
    invoke-static {v3}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    throw v2
.end method

.method private final showSoftInputForce(Landroid/app/Activity;)V
    .locals 2

    .line 1
    const-string v0, "input_method"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Landroid/view/inputmethod/InputMethodManager;

    .line 8
    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    const/4 v0, 0x2

    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-virtual {p1, v0, v1}, Landroid/view/inputmethod/InputMethodManager;->toggleSoftInput(II)V

    .line 15
    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 4
    .param p1    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-super {p0, p1}, Landroid/app/Dialog;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/zykj/view/dialog/TextEditDialog;->setWindow()V

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, Lcom/zykj/view/dialog/TextEditDialog;->activity:Landroid/content/Context;

    .line 8
    .line 9
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    sget v0, Lcom/zykj/view/R$layout;->view_dialog_text_edit:I

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-static {p1, v0, v2, v1}, Landroidx/databinding/DataBindingUtil;->inflate(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;Z)Landroidx/databinding/ViewDataBinding;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const-string v0, "inflate(...)"

    .line 22
    .line 23
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    check-cast p1, Lcom/zykj/view/databinding/ViewDialogTextEditBinding;

    .line 27
    .line 28
    iput-object p1, p0, Lcom/zykj/view/dialog/TextEditDialog;->mBinding:Lcom/zykj/view/databinding/ViewDialogTextEditBinding;

    .line 29
    .line 30
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewDialogTextEditBinding;->root:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 31
    .line 32
    invoke-virtual {p0, p1}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 33
    .line 34
    .line 35
    iget-object p1, p0, Lcom/zykj/view/dialog/TextEditDialog;->mBinding:Lcom/zykj/view/databinding/ViewDialogTextEditBinding;

    .line 36
    .line 37
    const-string v0, "mBinding"

    .line 38
    .line 39
    if-eqz p1, :cond_3

    .line 40
    .line 41
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewDialogTextEditBinding;->etInput:Lcom/zykj/view/widget/LimitEditText;

    .line 42
    .line 43
    new-instance v1, Lcom/zykj/view/dialog/TextEditDialog$onCreate$1;

    .line 44
    .line 45
    invoke-direct {v1, p0}, Lcom/zykj/view/dialog/TextEditDialog$onCreate$1;-><init>(Lcom/zykj/view/dialog/TextEditDialog;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 49
    .line 50
    .line 51
    iget-object p1, p0, Lcom/zykj/view/dialog/TextEditDialog;->mBinding:Lcom/zykj/view/databinding/ViewDialogTextEditBinding;

    .line 52
    .line 53
    if-eqz p1, :cond_2

    .line 54
    .line 55
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewDialogTextEditBinding;->etInput:Lcom/zykj/view/widget/LimitEditText;

    .line 56
    .line 57
    new-instance v1, Lcom/zykj/view/dialog/TextEditDialog$onCreate$2;

    .line 58
    .line 59
    invoke-direct {v1, p0}, Lcom/zykj/view/dialog/TextEditDialog$onCreate$2;-><init>(Lcom/zykj/view/dialog/TextEditDialog;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 63
    .line 64
    .line 65
    iget-object p1, p0, Lcom/zykj/view/dialog/TextEditDialog;->mBinding:Lcom/zykj/view/databinding/ViewDialogTextEditBinding;

    .line 66
    .line 67
    if-eqz p1, :cond_1

    .line 68
    .line 69
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewDialogTextEditBinding;->btnCancel:Landroid/widget/Button;

    .line 70
    .line 71
    new-instance v1, Lcom/zykj/view/dialog/b;

    .line 72
    .line 73
    const/4 v3, 0x0

    .line 74
    invoke-direct {v1, p0, v3}, Lcom/zykj/view/dialog/b;-><init>(Lcom/zykj/view/dialog/TextEditDialog;I)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 78
    .line 79
    .line 80
    iget-object p1, p0, Lcom/zykj/view/dialog/TextEditDialog;->mBinding:Lcom/zykj/view/databinding/ViewDialogTextEditBinding;

    .line 81
    .line 82
    if-eqz p1, :cond_0

    .line 83
    .line 84
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewDialogTextEditBinding;->btnConfirm:Landroid/widget/Button;

    .line 85
    .line 86
    new-instance v0, Lcom/zykj/view/dialog/b;

    .line 87
    .line 88
    const/4 v1, 0x1

    .line 89
    invoke-direct {v0, p0, v1}, Lcom/zykj/view/dialog/b;-><init>(Lcom/zykj/view/dialog/TextEditDialog;I)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 93
    .line 94
    .line 95
    return-void

    .line 96
    :cond_0
    invoke-static {v0}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    throw v2

    .line 100
    :cond_1
    invoke-static {v0}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    throw v2

    .line 104
    :cond_2
    invoke-static {v0}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    throw v2

    .line 108
    :cond_3
    invoke-static {v0}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    throw v2
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1
    .param p2    # Landroid/view/KeyEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x4

    .line 7
    if-ne p1, v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/zykj/view/dialog/TextEditDialog;->cancelCallback:Lr6/a;

    .line 10
    .line 11
    invoke-interface {v0}, Lr6/a;->invoke()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    invoke-super {p0, p1, p2}, Landroid/app/Dialog;->onKeyDown(ILandroid/view/KeyEvent;)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    return p1

    .line 19
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/app/Dialog;->onKeyDown(ILandroid/view/KeyEvent;)Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    return p1
.end method

.method public onStart()V
    .locals 4

    .line 1
    invoke-super {p0}, Landroid/app/Dialog;->onStart()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/graphics/Rect;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-virtual {v2, v0}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    .line 20
    .line 21
    .line 22
    invoke-direct {p0}, Lcom/zykj/view/dialog/TextEditDialog;->calculateStatusBarHeight()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    iget v3, p0, Lcom/zykj/view/dialog/TextEditDialog;->statusBarHeight:I

    .line 34
    .line 35
    sub-int/2addr v0, v3

    .line 36
    invoke-virtual {v1, v2, v0}, Landroid/view/Window;->setLayout(II)V

    .line 37
    .line 38
    .line 39
    :cond_0
    return-void
.end method

.method public final showDialog(Ljava/lang/String;Lr6/c;Lr6/c;Lr6/a;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lr6/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lr6/c;",
            "Lr6/c;",
            "Lr6/a;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "initText"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "afterTextChangeCallback"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "doneCallback"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "cancelCallback"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    iput-object p2, p0, Lcom/zykj/view/dialog/TextEditDialog;->afterTextChangedCallback:Lr6/c;

    .line 22
    .line 23
    iput-object p3, p0, Lcom/zykj/view/dialog/TextEditDialog;->doneCallback:Lr6/c;

    .line 24
    .line 25
    iput-object p4, p0, Lcom/zykj/view/dialog/TextEditDialog;->cancelCallback:Lr6/a;

    .line 26
    .line 27
    invoke-virtual {p0}, Landroid/app/Dialog;->show()V

    .line 28
    .line 29
    .line 30
    iget-object p2, p0, Lcom/zykj/view/dialog/TextEditDialog;->mBinding:Lcom/zykj/view/databinding/ViewDialogTextEditBinding;

    .line 31
    .line 32
    const/4 p3, 0x0

    .line 33
    const-string p4, "mBinding"

    .line 34
    .line 35
    if-eqz p2, :cond_2

    .line 36
    .line 37
    iget-object p2, p2, Lcom/zykj/view/databinding/ViewDialogTextEditBinding;->etInput:Lcom/zykj/view/widget/LimitEditText;

    .line 38
    .line 39
    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 40
    .line 41
    .line 42
    iget-object p1, p0, Lcom/zykj/view/dialog/TextEditDialog;->mBinding:Lcom/zykj/view/databinding/ViewDialogTextEditBinding;

    .line 43
    .line 44
    if-eqz p1, :cond_1

    .line 45
    .line 46
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewDialogTextEditBinding;->etInput:Lcom/zykj/view/widget/LimitEditText;

    .line 47
    .line 48
    invoke-static {p1}, Lcom/blankj/utilcode/util/c;->o(Landroid/view/View;)V

    .line 49
    .line 50
    .line 51
    iget-object p1, p0, Lcom/zykj/view/dialog/TextEditDialog;->mBinding:Lcom/zykj/view/databinding/ViewDialogTextEditBinding;

    .line 52
    .line 53
    if-eqz p1, :cond_0

    .line 54
    .line 55
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewDialogTextEditBinding;->etInput:Lcom/zykj/view/widget/LimitEditText;

    .line 56
    .line 57
    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :cond_0
    invoke-static {p4}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw p3

    .line 65
    :cond_1
    invoke-static {p4}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw p3

    .line 69
    :cond_2
    invoke-static {p4}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    throw p3
.end method
