.class public final synthetic Ll4/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/zykj/mistake/dialog/ImageDialogFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/mistake/dialog/ImageDialogFragment;I)V
    .locals 0

    .line 1
    iput p2, p0, Ll4/g;->a:I

    iput-object p1, p0, Ll4/g;->b:Lcom/zykj/mistake/dialog/ImageDialogFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 0

    .line 1
    iget p1, p0, Ll4/g;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Ll4/g;->b:Lcom/zykj/mistake/dialog/ImageDialogFragment;

    .line 7
    .line 8
    iget-object p1, p1, Lcom/zykj/mistake/dialog/ImageDialogFragment;->d:Lr6/a;

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    invoke-interface {p1}, Lr6/a;->invoke()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void

    .line 16
    :pswitch_0
    iget-object p1, p0, Ll4/g;->b:Lcom/zykj/mistake/dialog/ImageDialogFragment;

    .line 17
    .line 18
    invoke-virtual {p1}, Lcom/zykj/mistake/dialog/BaseDialogFragment;->dismiss()V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
