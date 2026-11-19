.class public final synthetic Lcom/zykj/view/utils/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/zykj/view/utils/ImagePicker;

.field public final synthetic c:Landroid/net/Uri;

.field public final synthetic d:Z

.field public final synthetic e:Lr6/c;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/view/utils/ImagePicker;Landroid/net/Uri;ZLr6/c;I)V
    .locals 0

    .line 1
    iput p5, p0, Lcom/zykj/view/utils/b;->a:I

    iput-object p1, p0, Lcom/zykj/view/utils/b;->b:Lcom/zykj/view/utils/ImagePicker;

    iput-object p2, p0, Lcom/zykj/view/utils/b;->c:Landroid/net/Uri;

    iput-boolean p3, p0, Lcom/zykj/view/utils/b;->d:Z

    iput-object p4, p0, Lcom/zykj/view/utils/b;->e:Lr6/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lcom/zykj/view/utils/b;->a:I

    packed-switch v0, :pswitch_data_0

    iget-boolean v0, p0, Lcom/zykj/view/utils/b;->d:Z

    iget-object v1, p0, Lcom/zykj/view/utils/b;->e:Lr6/c;

    iget-object v2, p0, Lcom/zykj/view/utils/b;->b:Lcom/zykj/view/utils/ImagePicker;

    iget-object v3, p0, Lcom/zykj/view/utils/b;->c:Landroid/net/Uri;

    invoke-static {v2, v3, v0, v1}, Lcom/zykj/view/utils/ImagePicker;->a(Lcom/zykj/view/utils/ImagePicker;Landroid/net/Uri;ZLr6/c;)Ld6/s;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-boolean v0, p0, Lcom/zykj/view/utils/b;->d:Z

    iget-object v1, p0, Lcom/zykj/view/utils/b;->e:Lr6/c;

    iget-object v2, p0, Lcom/zykj/view/utils/b;->b:Lcom/zykj/view/utils/ImagePicker;

    iget-object v3, p0, Lcom/zykj/view/utils/b;->c:Landroid/net/Uri;

    invoke-static {v2, v3, v0, v1}, Lcom/zykj/view/utils/ImagePicker;->h(Lcom/zykj/view/utils/ImagePicker;Landroid/net/Uri;ZLr6/c;)Ld6/s;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
