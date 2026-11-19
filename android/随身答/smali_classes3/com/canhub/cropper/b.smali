.class public final Lcom/canhub/cropper/b;
.super Lcom/canhub/cropper/CropImageView$b;
.source "SourceFile"


# static fields
.field public static final k:Lcom/canhub/cropper/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/canhub/cropper/b;

    invoke-direct {v0}, Lcom/canhub/cropper/b;-><init>()V

    sput-object v0, Lcom/canhub/cropper/b;->k:Lcom/canhub/cropper/b;

    return-void
.end method

.method public constructor <init>()V
    .locals 11

    .line 1
    new-instance v5, Lcom/canhub/cropper/CropException$Cancellation;

    .line 2
    .line 3
    invoke-direct {v5}, Lcom/canhub/cropper/CropException$Cancellation;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    new-array v6, v0, [F

    .line 8
    .line 9
    const/4 v9, 0x0

    .line 10
    const/4 v10, 0x0

    .line 11
    const/4 v1, 0x0

    .line 12
    const/4 v2, 0x0

    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v4, 0x0

    .line 15
    const/4 v7, 0x0

    .line 16
    const/4 v8, 0x0

    .line 17
    move-object v0, p0

    .line 18
    invoke-direct/range {v0 .. v10}, Lcom/canhub/cropper/CropImageView$b;-><init>(Landroid/graphics/Bitmap;Landroid/net/Uri;Landroid/graphics/Bitmap;Landroid/net/Uri;Ljava/lang/Exception;[FLandroid/graphics/Rect;Landroid/graphics/Rect;II)V

    .line 19
    .line 20
    .line 21
    return-void
.end method
