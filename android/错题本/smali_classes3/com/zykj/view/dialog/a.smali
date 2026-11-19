.class public final synthetic Lcom/zykj/view/dialog/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/zykj/view/dialog/CommonTipDialog;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/view/dialog/CommonTipDialog;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/zykj/view/dialog/a;->a:I

    iput-object p1, p0, Lcom/zykj/view/dialog/a;->b:Lcom/zykj/view/dialog/CommonTipDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/view/dialog/a;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/zykj/view/dialog/a;->b:Lcom/zykj/view/dialog/CommonTipDialog;

    invoke-static {v0, p1}, Lcom/zykj/view/dialog/CommonTipDialog;->c(Lcom/zykj/view/dialog/CommonTipDialog;Landroid/view/View;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lcom/zykj/view/dialog/a;->b:Lcom/zykj/view/dialog/CommonTipDialog;

    invoke-static {v0, p1}, Lcom/zykj/view/dialog/CommonTipDialog;->a(Lcom/zykj/view/dialog/CommonTipDialog;Landroid/view/View;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
