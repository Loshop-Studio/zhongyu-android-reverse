.class public final Lcom/canhub/cropper/CropImageContract;
.super Landroidx/activity/result/contract/ActivityResultContract;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/activity/result/contract/ActivityResultContract<",
        "Lf1/h;",
        "Lcom/canhub/cropper/CropImageView$b;",
        ">;"
    }
.end annotation

.annotation runtime Lqc/a;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/activity/result/contract/ActivityResultContract;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Lf1/h;)Landroid/content/Intent;
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "input"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance p2, Landroid/content/Intent;

    .line 12
    .line 13
    const-class v0, Lcom/canhub/cropper/CropImageActivity;

    .line 14
    .line 15
    invoke-direct {p2, p1, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 16
    .line 17
    .line 18
    new-instance p1, Landroid/os/Bundle;

    .line 19
    .line 20
    const/4 p2, 0x2

    .line 21
    invoke-direct {p1, p2}, Landroid/os/Bundle;-><init>(I)V

    .line 22
    .line 23
    .line 24
    const/4 p1, 0x0

    .line 25
    throw p1
.end method

.method public b(ILandroid/content/Intent;)Lcom/canhub/cropper/CropImageView$b;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p2, :cond_1

    .line 3
    .line 4
    const-string v1, "CROP_IMAGE_EXTRA_RESULT"

    .line 5
    .line 6
    invoke-virtual {p2, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    instance-of v1, p2, Lcom/canhub/cropper/CropImage$ActivityResult;

    .line 11
    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-object v0, p2

    .line 16
    :goto_0
    check-cast v0, Lcom/canhub/cropper/CropImage$ActivityResult;

    .line 17
    .line 18
    :cond_1
    if-eqz v0, :cond_3

    .line 19
    .line 20
    if-nez p1, :cond_2

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_2
    return-object v0

    .line 24
    :cond_3
    :goto_1
    sget-object p1, Lcom/canhub/cropper/b;->m:Lcom/canhub/cropper/b;

    .line 25
    .line 26
    return-object p1
.end method

.method public bridge synthetic createIntent(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent;
    .locals 0

    .line 1
    invoke-static {p2}, Lk/r;->a(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    const/4 p2, 0x0

    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/canhub/cropper/CropImageContract;->a(Landroid/content/Context;Lf1/h;)Landroid/content/Intent;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public bridge synthetic parseResult(ILandroid/content/Intent;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/canhub/cropper/CropImageContract;->b(ILandroid/content/Intent;)Lcom/canhub/cropper/CropImageView$b;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
