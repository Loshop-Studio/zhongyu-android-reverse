.class public final synthetic Lc4/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc4/o;->a:Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lc4/o;->a:Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lcom/zykj/huiwei/launcher/ui/dialog/Login/ResetPasswordDialogContentKt;->a(Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
