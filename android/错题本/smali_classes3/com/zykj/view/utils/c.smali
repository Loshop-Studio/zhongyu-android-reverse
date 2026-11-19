.class public final synthetic Lcom/zykj/view/utils/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/c;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroid/net/Uri;

.field public final synthetic c:Lr6/c;


# direct methods
.method public synthetic constructor <init>(Landroid/net/Uri;Lr6/c;I)V
    .locals 0

    .line 1
    iput p3, p0, Lcom/zykj/view/utils/c;->a:I

    iput-object p1, p0, Lcom/zykj/view/utils/c;->b:Landroid/net/Uri;

    iput-object p2, p0, Lcom/zykj/view/utils/c;->c:Lr6/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lcom/zykj/view/utils/c;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/zykj/view/utils/c;->c:Lr6/c;

    check-cast p1, Landroid/net/Uri;

    iget-object v1, p0, Lcom/zykj/view/utils/c;->b:Landroid/net/Uri;

    invoke-static {v1, v0, p1}, Lcom/zykj/view/utils/ImagePicker;->l(Landroid/net/Uri;Lr6/c;Landroid/net/Uri;)Ld6/s;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lcom/zykj/view/utils/c;->c:Lr6/c;

    check-cast p1, Landroid/net/Uri;

    iget-object v1, p0, Lcom/zykj/view/utils/c;->b:Landroid/net/Uri;

    invoke-static {v1, v0, p1}, Lcom/zykj/view/utils/ImagePicker;->i(Landroid/net/Uri;Lr6/c;Landroid/net/Uri;)Ld6/s;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
