.class public final synthetic Lc4/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;

.field public final synthetic b:Lkotlin/jvm/functions/Function0;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;Lkotlin/jvm/functions/Function0;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc4/j;->a:Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;

    iput-object p2, p0, Lc4/j;->b:Lkotlin/jvm/functions/Function0;

    iput p3, p0, Lc4/j;->c:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lc4/j;->a:Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;

    iget-object v1, p0, Lc4/j;->b:Lkotlin/jvm/functions/Function0;

    iget v2, p0, Lc4/j;->c:I

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, v2, p1, p2}, Lcom/zykj/huiwei/launcher/ui/dialog/Login/ResetPasswordDialogContentKt;->n(Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;Lkotlin/jvm/functions/Function0;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
