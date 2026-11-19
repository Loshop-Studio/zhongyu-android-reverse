.class public final synthetic Lc4/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function4;


# instance fields
.field public final synthetic a:Lkotlin/jvm/functions/Function0;

.field public final synthetic b:Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function0;Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc4/c;->a:Lkotlin/jvm/functions/Function0;

    iput-object p2, p0, Lc4/c;->b:Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, Lc4/c;->a:Lkotlin/jvm/functions/Function0;

    iget-object v1, p0, Lc4/c;->b:Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;

    move-object v2, p1

    check-cast v2, Landroidx/compose/animation/AnimatedContentScope;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    move-object v4, p3

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Integer;

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-static/range {v0 .. v5}, Lcom/zykj/huiwei/launcher/ui/dialog/Login/ResetPasswordDialogContentKt;->e(Lkotlin/jvm/functions/Function0;Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;Landroidx/compose/animation/AnimatedContentScope;ZLandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
