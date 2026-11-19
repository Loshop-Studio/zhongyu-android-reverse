.class public final synthetic Ll4/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/zykj/mistake/dialog/PictureNoteDeleteDialogFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/mistake/dialog/PictureNoteDeleteDialogFragment;I)V
    .locals 0

    .line 1
    iput p2, p0, Ll4/j;->a:I

    iput-object p1, p0, Ll4/j;->b:Lcom/zykj/mistake/dialog/PictureNoteDeleteDialogFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 0

    .line 1
    iget p1, p0, Ll4/j;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Ll4/j;->b:Lcom/zykj/mistake/dialog/PictureNoteDeleteDialogFragment;

    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/zykj/mistake/dialog/BaseDialogFragment;->dismiss()V

    .line 9
    .line 10
    .line 11
    iget-object p1, p1, Lcom/zykj/mistake/dialog/PictureNoteDeleteDialogFragment;->c:Lr6/a;

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    invoke-interface {p1}, Lr6/a;->invoke()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void

    .line 19
    :pswitch_0
    iget-object p1, p0, Ll4/j;->b:Lcom/zykj/mistake/dialog/PictureNoteDeleteDialogFragment;

    .line 20
    .line 21
    invoke-virtual {p1}, Lcom/zykj/mistake/dialog/BaseDialogFragment;->dismiss()V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
