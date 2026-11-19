.class public final synthetic Ld4/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ComposeModifyPasswordDialog;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ComposeModifyPasswordDialog;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld4/t;->a:Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ComposeModifyPasswordDialog;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Ld4/t;->a:Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ComposeModifyPasswordDialog;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ComposeModifyPasswordDialog;->k(Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ComposeModifyPasswordDialog;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
