.class public final synthetic Lc4/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/platform/SoftwareKeyboardController;

.field public final synthetic b:Landroidx/compose/ui/focus/FocusManager;

.field public final synthetic c:Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/platform/SoftwareKeyboardController;Landroidx/compose/ui/focus/FocusManager;Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc4/q;->a:Landroidx/compose/ui/platform/SoftwareKeyboardController;

    iput-object p2, p0, Lc4/q;->b:Landroidx/compose/ui/focus/FocusManager;

    iput-object p3, p0, Lc4/q;->c:Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lc4/q;->a:Landroidx/compose/ui/platform/SoftwareKeyboardController;

    iget-object v1, p0, Lc4/q;->b:Landroidx/compose/ui/focus/FocusManager;

    iget-object v2, p0, Lc4/q;->c:Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;

    invoke-static {v0, v1, v2}, Lcom/zykj/huiwei/launcher/ui/dialog/Login/ResetPasswordDialogContentKt;->b(Landroidx/compose/ui/platform/SoftwareKeyboardController;Landroidx/compose/ui/focus/FocusManager;Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
