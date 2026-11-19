.class public final synthetic Lb4/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function4;


# instance fields
.field public final synthetic a:Lcom/zykj/huiwei/launcher/ui/dialog/ModifyPasswordDialog;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/huiwei/launcher/ui/dialog/ModifyPasswordDialog;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb4/p;->a:Lcom/zykj/huiwei/launcher/ui/dialog/ModifyPasswordDialog;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lb4/p;->a:Lcom/zykj/huiwei/launcher/ui/dialog/ModifyPasswordDialog;

    check-cast p1, Ljava/lang/CharSequence;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    check-cast p4, Ljava/lang/Integer;

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result p4

    invoke-static {v0, p1, p2, p3, p4}, Lcom/zykj/huiwei/launcher/ui/dialog/ModifyPasswordDialog;->n(Lcom/zykj/huiwei/launcher/ui/dialog/ModifyPasswordDialog;Ljava/lang/CharSequence;III)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
