.class public final synthetic Lcom/canhub/cropper/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/activity/result/ActivityResultCallback;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/canhub/cropper/CropImageActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/canhub/cropper/CropImageActivity;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/canhub/cropper/n;->a:I

    iput-object p1, p0, Lcom/canhub/cropper/n;->b:Lcom/canhub/cropper/CropImageActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onActivityResult(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/canhub/cropper/n;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/canhub/cropper/n;->b:Lcom/canhub/cropper/CropImageActivity;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Ljava/lang/Boolean;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    sget v0, Lcom/canhub/cropper/CropImageActivity;->h:I

    .line 15
    .line 16
    if-eqz p1, :cond_1

    .line 17
    .line 18
    iget-object p1, v1, Lcom/canhub/cropper/CropImageActivity;->e:Landroid/net/Uri;

    .line 19
    .line 20
    if-nez p1, :cond_0

    .line 21
    .line 22
    invoke-virtual {v1}, Lcom/canhub/cropper/CropImageActivity;->q()V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    iput-object p1, v1, Lcom/canhub/cropper/CropImageActivity;->a:Landroid/net/Uri;

    .line 27
    .line 28
    iget-object v0, v1, Lcom/canhub/cropper/CropImageActivity;->c:Lcom/canhub/cropper/CropImageView;

    .line 29
    .line 30
    if-eqz v0, :cond_2

    .line 31
    .line 32
    invoke-virtual {v0, p1}, Lcom/canhub/cropper/CropImageView;->setImageUriAsync(Landroid/net/Uri;)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    invoke-virtual {v1}, Lcom/canhub/cropper/CropImageActivity;->q()V

    .line 37
    .line 38
    .line 39
    :cond_2
    :goto_0
    return-void

    .line 40
    :pswitch_0
    check-cast p1, Landroid/net/Uri;

    .line 41
    .line 42
    sget v0, Lcom/canhub/cropper/CropImageActivity;->h:I

    .line 43
    .line 44
    if-nez p1, :cond_3

    .line 45
    .line 46
    invoke-virtual {v1}, Lcom/canhub/cropper/CropImageActivity;->q()V

    .line 47
    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_3
    iput-object p1, v1, Lcom/canhub/cropper/CropImageActivity;->a:Landroid/net/Uri;

    .line 51
    .line 52
    iget-object v0, v1, Lcom/canhub/cropper/CropImageActivity;->c:Lcom/canhub/cropper/CropImageView;

    .line 53
    .line 54
    if-eqz v0, :cond_4

    .line 55
    .line 56
    invoke-virtual {v0, p1}, Lcom/canhub/cropper/CropImageView;->setImageUriAsync(Landroid/net/Uri;)V

    .line 57
    .line 58
    .line 59
    :cond_4
    :goto_1
    return-void

    .line 60
    nop

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
