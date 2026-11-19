.class public final synthetic Lb2/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/canhub/cropper/CropImageView$g;


# instance fields
.field public final synthetic c:Lcom/friday/common/camera/ImageCropFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/common/camera/ImageCropFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb2/g;->c:Lcom/friday/common/camera/ImageCropFragment;

    return-void
.end method


# virtual methods
.method public final v(Lcom/canhub/cropper/CropImageView;Landroid/net/Uri;Ljava/lang/Exception;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lb2/g;->c:Lcom/friday/common/camera/ImageCropFragment;

    invoke-static {v0, p1, p2, p3}, Lcom/friday/common/camera/ImageCropFragment;->t(Lcom/friday/common/camera/ImageCropFragment;Lcom/canhub/cropper/CropImageView;Landroid/net/Uri;Ljava/lang/Exception;)V

    return-void
.end method
