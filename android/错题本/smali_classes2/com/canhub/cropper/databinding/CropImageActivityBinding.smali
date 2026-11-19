.class public final Lcom/canhub/cropper/databinding/CropImageActivityBinding;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/viewbinding/ViewBinding;


# instance fields
.field public final a:Lcom/canhub/cropper/CropImageView;

.field public final b:Lcom/canhub/cropper/CropImageView;


# direct methods
.method public constructor <init>(Lcom/canhub/cropper/CropImageView;Lcom/canhub/cropper/CropImageView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/canhub/cropper/databinding/CropImageActivityBinding;->a:Lcom/canhub/cropper/CropImageView;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/canhub/cropper/databinding/CropImageActivityBinding;->b:Lcom/canhub/cropper/CropImageView;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final getRoot()Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/canhub/cropper/databinding/CropImageActivityBinding;->a:Lcom/canhub/cropper/CropImageView;

    .line 2
    .line 3
    return-object v0
.end method
