.class public final synthetic Lcom/zykj/view/utils/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/c;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Z

.field public final synthetic c:Lcom/zykj/view/utils/ImagePicker;

.field public final synthetic d:Lr6/c;


# direct methods
.method public synthetic constructor <init>(ZLcom/zykj/view/utils/ImagePicker;Lr6/c;I)V
    .locals 0

    .line 1
    iput p4, p0, Lcom/zykj/view/utils/d;->a:I

    iput-boolean p1, p0, Lcom/zykj/view/utils/d;->b:Z

    iput-object p2, p0, Lcom/zykj/view/utils/d;->c:Lcom/zykj/view/utils/ImagePicker;

    iput-object p3, p0, Lcom/zykj/view/utils/d;->d:Lr6/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lcom/zykj/view/utils/d;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/zykj/view/utils/d;->d:Lr6/c;

    check-cast p1, Landroid/net/Uri;

    iget-object v1, p0, Lcom/zykj/view/utils/d;->c:Lcom/zykj/view/utils/ImagePicker;

    iget-boolean v2, p0, Lcom/zykj/view/utils/d;->b:Z

    invoke-static {v1, p1, v2, v0}, Lcom/zykj/view/utils/ImagePicker;->b(Lcom/zykj/view/utils/ImagePicker;Landroid/net/Uri;ZLr6/c;)Ld6/s;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lcom/zykj/view/utils/d;->d:Lr6/c;

    check-cast p1, Landroid/net/Uri;

    iget-object v1, p0, Lcom/zykj/view/utils/d;->c:Lcom/zykj/view/utils/ImagePicker;

    iget-boolean v2, p0, Lcom/zykj/view/utils/d;->b:Z

    invoke-static {v1, p1, v2, v0}, Lcom/zykj/view/utils/ImagePicker;->k(Lcom/zykj/view/utils/ImagePicker;Landroid/net/Uri;ZLr6/c;)Ld6/s;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
