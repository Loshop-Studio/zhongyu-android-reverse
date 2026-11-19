.class public final synthetic Lcom/zykj/view/utils/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/activity/result/ActivityResultCallback;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/zykj/view/utils/ImagePicker;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/view/utils/ImagePicker;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/zykj/view/utils/e;->a:I

    iput-object p1, p0, Lcom/zykj/view/utils/e;->b:Lcom/zykj/view/utils/ImagePicker;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onActivityResult(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/view/utils/e;->a:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lcom/zykj/view/utils/e;->b:Lcom/zykj/view/utils/ImagePicker;

    invoke-static {v0, p1}, Lcom/zykj/view/utils/ImagePicker;->d(Lcom/zykj/view/utils/ImagePicker;Z)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lcom/zykj/view/utils/e;->b:Lcom/zykj/view/utils/ImagePicker;

    check-cast p1, Landroid/net/Uri;

    invoke-static {v0, p1}, Lcom/zykj/view/utils/ImagePicker;->g(Lcom/zykj/view/utils/ImagePicker;Landroid/net/Uri;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lcom/zykj/view/utils/e;->b:Lcom/zykj/view/utils/ImagePicker;

    check-cast p1, Landroid/net/Uri;

    invoke-static {v0, p1}, Lcom/zykj/view/utils/ImagePicker;->c(Lcom/zykj/view/utils/ImagePicker;Landroid/net/Uri;)V

    return-void

    :pswitch_2
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lcom/zykj/view/utils/e;->b:Lcom/zykj/view/utils/ImagePicker;

    invoke-static {v0, p1}, Lcom/zykj/view/utils/ImagePicker;->j(Lcom/zykj/view/utils/ImagePicker;Z)V

    return-void

    :pswitch_3
    iget-object v0, p0, Lcom/zykj/view/utils/e;->b:Lcom/zykj/view/utils/ImagePicker;

    check-cast p1, Landroid/net/Uri;

    invoke-static {v0, p1}, Lcom/zykj/view/utils/ImagePicker;->e(Lcom/zykj/view/utils/ImagePicker;Landroid/net/Uri;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
