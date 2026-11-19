.class public final Lh2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/xuexiang/xui/widget/dialog/BaseDialog;


# direct methods
.method public synthetic constructor <init>(Lcom/xuexiang/xui/widget/dialog/BaseDialog;I)V
    .locals 0

    .line 1
    iput p2, p0, Lh2/a;->a:I

    iput-object p1, p0, Lh2/a;->b:Lcom/xuexiang/xui/widget/dialog/BaseDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 1

    .line 1
    iget p1, p0, Lh2/a;->a:I

    .line 2
    .line 3
    iget-object v0, p0, Lh2/a;->b:Lcom/xuexiang/xui/widget/dialog/BaseDialog;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast v0, Lcom/xuexiang/xui/widget/dialog/MiniLoadingDialog;

    .line 9
    .line 10
    sget p1, Lcom/xuexiang/xui/widget/dialog/MiniLoadingDialog;->a:I

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    check-cast v0, Lcom/xuexiang/xui/widget/dialog/LoadingDialog;

    .line 17
    .line 18
    sget p1, Lcom/xuexiang/xui/widget/dialog/LoadingDialog;->a:I

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
