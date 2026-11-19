.class public final synthetic Lc4/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/focus/FocusRequester;

.field public final synthetic b:Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;

.field public final synthetic c:Landroidx/compose/ui/platform/SoftwareKeyboardController;

.field public final synthetic d:Landroidx/compose/ui/focus/FocusManager;

.field public final synthetic e:Landroidx/compose/runtime/State;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/focus/FocusRequester;Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;Landroidx/compose/ui/platform/SoftwareKeyboardController;Landroidx/compose/ui/focus/FocusManager;Landroidx/compose/runtime/State;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc4/m;->a:Landroidx/compose/ui/focus/FocusRequester;

    iput-object p2, p0, Lc4/m;->b:Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;

    iput-object p3, p0, Lc4/m;->c:Landroidx/compose/ui/platform/SoftwareKeyboardController;

    iput-object p4, p0, Lc4/m;->d:Landroidx/compose/ui/focus/FocusManager;

    iput-object p5, p0, Lc4/m;->e:Landroidx/compose/runtime/State;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, Lc4/m;->a:Landroidx/compose/ui/focus/FocusRequester;

    iget-object v1, p0, Lc4/m;->b:Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;

    iget-object v2, p0, Lc4/m;->c:Landroidx/compose/ui/platform/SoftwareKeyboardController;

    iget-object v3, p0, Lc4/m;->d:Landroidx/compose/ui/focus/FocusManager;

    iget-object v4, p0, Lc4/m;->e:Landroidx/compose/runtime/State;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v0 .. v6}, Lcom/zykj/huiwei/launcher/ui/dialog/Login/ResetPasswordDialogContentKt;->c(Landroidx/compose/ui/focus/FocusRequester;Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;Landroidx/compose/ui/platform/SoftwareKeyboardController;Landroidx/compose/ui/focus/FocusManager;Landroidx/compose/runtime/State;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
