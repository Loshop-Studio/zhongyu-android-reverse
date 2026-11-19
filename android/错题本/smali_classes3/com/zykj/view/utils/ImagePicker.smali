.class public final Lcom/zykj/view/utils/ImagePicker;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001B\u001f\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007JC\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u000e\"\u0004\u0008\u0000\u0010\u0008\"\u0004\u0008\u0001\u0010\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n2\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u000cH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001d\u0010\u0014\u001a\u00020\u00122\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u0011H\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J7\u0010\u001b\u001a\u00020\u00122\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u00162\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u00182\u0014\u0010\u0013\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u00120\u001a\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ7\u0010\u001d\u001a\u00020\u00122\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u00162\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u00182\u0014\u0010\u0013\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u00120\u001a\u00a2\u0006\u0004\u0008\u001d\u0010\u001cJ-\u0010\u001e\u001a\u00020\u00122\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u00182\u0014\u0010\u0013\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u00120\u001a\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ+\u0010 \u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00162\u0014\u0010\u0013\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u00120\u001a\u00a2\u0006\u0004\u0008 \u0010!R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\"R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010#R&\u0010$\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008$\u0010%R\u001a\u0010&\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008&\u0010\'R$\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008(\u0010%R\u001a\u0010)\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008)\u0010\'R&\u0010*\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008*\u0010%R\u001a\u0010,\u001a\u0008\u0012\u0004\u0012\u00020+0\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008,\u0010\'R&\u0010-\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008-\u0010%R\u001a\u0010/\u001a\u0008\u0012\u0004\u0012\u00020.0\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008/\u0010\'R\u001e\u00100\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00080\u00101R\u001a\u00103\u001a\u0008\u0012\u0004\u0012\u0002020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00083\u0010\'R\u0017\u00105\u001a\u0002048\u0006\u00a2\u0006\u000c\n\u0004\u00085\u00106\u001a\u0004\u00087\u00108\u00a8\u00069"
    }
    d2 = {
        "Lcom/zykj/view/utils/ImagePicker;",
        "",
        "Landroidx/fragment/app/Fragment;",
        "fragment",
        "Landroidx/activity/ComponentActivity;",
        "activity",
        "<init>",
        "(Landroidx/fragment/app/Fragment;Landroidx/activity/ComponentActivity;)V",
        "I",
        "O",
        "Landroidx/activity/result/contract/ActivityResultContract;",
        "contract",
        "Landroidx/activity/result/ActivityResultCallback;",
        "callback",
        "Landroidx/activity/result/ActivityResultLauncher;",
        "registerForActivityResult",
        "(Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/ActivityResultLauncher;",
        "Lkotlin/Function0;",
        "Ld6/s;",
        "successCallback",
        "checkCameraPermission",
        "(Lr6/a;)V",
        "Landroid/net/Uri;",
        "uri",
        "",
        "needCrop",
        "Lkotlin/Function1;",
        "startCapture",
        "(Landroid/net/Uri;ZLr6/c;)V",
        "startSystemCamera",
        "startGallery",
        "(ZLr6/c;)V",
        "startCrop",
        "(Landroid/net/Uri;Lr6/c;)V",
        "Landroidx/fragment/app/Fragment;",
        "Landroidx/activity/ComponentActivity;",
        "tempCameraCallback",
        "Lr6/c;",
        "cameraLauncher",
        "Landroidx/activity/result/ActivityResultLauncher;",
        "tempSystemCameraCallback",
        "systemCameraLauncher",
        "tempGalleryCallback",
        "Landroidx/activity/result/PickVisualMediaRequest;",
        "galleryLauncher",
        "tempCropForImageCallback",
        "Lcom/zykj/view/ui/crop/EzyCropContract$CropRequestOptions;",
        "cropForImageLauncher",
        "tempPermissionCallback",
        "Lr6/a;",
        "",
        "permissionLauncher",
        "Lcom/canhub/cropper/CropImageOptions;",
        "cropImageOptions",
        "Lcom/canhub/cropper/CropImageOptions;",
        "getCropImageOptions",
        "()Lcom/canhub/cropper/CropImageOptions;",
        "view_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final activity:Landroidx/activity/ComponentActivity;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final cameraLauncher:Landroidx/activity/result/ActivityResultLauncher;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/activity/result/ActivityResultLauncher<",
            "Landroid/net/Uri;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final cropForImageLauncher:Landroidx/activity/result/ActivityResultLauncher;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/activity/result/ActivityResultLauncher<",
            "Lcom/zykj/view/ui/crop/EzyCropContract$CropRequestOptions;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final cropImageOptions:Lcom/canhub/cropper/CropImageOptions;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final fragment:Landroidx/fragment/app/Fragment;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final galleryLauncher:Landroidx/activity/result/ActivityResultLauncher;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/activity/result/ActivityResultLauncher<",
            "Landroidx/activity/result/PickVisualMediaRequest;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final permissionLauncher:Landroidx/activity/result/ActivityResultLauncher;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/activity/result/ActivityResultLauncher<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final systemCameraLauncher:Landroidx/activity/result/ActivityResultLauncher;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/activity/result/ActivityResultLauncher<",
            "Landroid/net/Uri;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private tempCameraCallback:Lr6/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr6/c;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private tempCropForImageCallback:Lr6/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr6/c;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private tempGalleryCallback:Lr6/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr6/c;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private tempPermissionCallback:Lr6/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr6/a;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private tempSystemCameraCallback:Lr6/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr6/c;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x3

    invoke-direct {p0, v0, v0, v1, v0}, Lcom/zykj/view/utils/ImagePicker;-><init>(Landroidx/fragment/app/Fragment;Landroidx/activity/ComponentActivity;ILkotlin/jvm/internal/e;)V

    return-void
.end method

.method public constructor <init>(Landroidx/fragment/app/Fragment;Landroidx/activity/ComponentActivity;)V
    .locals 45
    .param p1    # Landroidx/fragment/app/Fragment;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Landroidx/activity/ComponentActivity;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    move-object/from16 v0, p0

    .line 2
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    move-object/from16 v1, p1

    .line 3
    iput-object v1, v0, Lcom/zykj/view/utils/ImagePicker;->fragment:Landroidx/fragment/app/Fragment;

    move-object/from16 v1, p2

    .line 4
    iput-object v1, v0, Lcom/zykj/view/utils/ImagePicker;->activity:Landroidx/activity/ComponentActivity;

    .line 5
    new-instance v1, Lcom/zykj/view/ui/camera/EzyCameraContract$StartCameraForResult;

    invoke-direct {v1}, Lcom/zykj/view/ui/camera/EzyCameraContract$StartCameraForResult;-><init>()V

    .line 6
    new-instance v2, Lcom/zykj/view/utils/e;

    const/4 v3, 0x0

    invoke-direct {v2, v0, v3}, Lcom/zykj/view/utils/e;-><init>(Lcom/zykj/view/utils/ImagePicker;I)V

    invoke-direct {v0, v1, v2}, Lcom/zykj/view/utils/ImagePicker;->registerForActivityResult(Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/ActivityResultLauncher;

    move-result-object v1

    iput-object v1, v0, Lcom/zykj/view/utils/ImagePicker;->cameraLauncher:Landroidx/activity/result/ActivityResultLauncher;

    .line 7
    new-instance v1, Landroidx/activity/result/contract/ActivityResultContracts$TakePicture;

    invoke-direct {v1}, Landroidx/activity/result/contract/ActivityResultContracts$TakePicture;-><init>()V

    .line 8
    new-instance v2, Lcom/zykj/view/utils/e;

    const/4 v3, 0x1

    invoke-direct {v2, v0, v3}, Lcom/zykj/view/utils/e;-><init>(Lcom/zykj/view/utils/ImagePicker;I)V

    invoke-direct {v0, v1, v2}, Lcom/zykj/view/utils/ImagePicker;->registerForActivityResult(Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/ActivityResultLauncher;

    move-result-object v1

    iput-object v1, v0, Lcom/zykj/view/utils/ImagePicker;->systemCameraLauncher:Landroidx/activity/result/ActivityResultLauncher;

    .line 9
    new-instance v1, Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia;

    invoke-direct {v1}, Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia;-><init>()V

    .line 10
    new-instance v2, Lcom/zykj/view/utils/e;

    const/4 v3, 0x2

    invoke-direct {v2, v0, v3}, Lcom/zykj/view/utils/e;-><init>(Lcom/zykj/view/utils/ImagePicker;I)V

    invoke-direct {v0, v1, v2}, Lcom/zykj/view/utils/ImagePicker;->registerForActivityResult(Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/ActivityResultLauncher;

    move-result-object v1

    iput-object v1, v0, Lcom/zykj/view/utils/ImagePicker;->galleryLauncher:Landroidx/activity/result/ActivityResultLauncher;

    .line 11
    new-instance v1, Lcom/zykj/view/ui/crop/EzyCropContract$StartCropForResult;

    invoke-direct {v1}, Lcom/zykj/view/ui/crop/EzyCropContract$StartCropForResult;-><init>()V

    .line 12
    new-instance v2, Lcom/zykj/view/utils/e;

    const/4 v3, 0x3

    invoke-direct {v2, v0, v3}, Lcom/zykj/view/utils/e;-><init>(Lcom/zykj/view/utils/ImagePicker;I)V

    invoke-direct {v0, v1, v2}, Lcom/zykj/view/utils/ImagePicker;->registerForActivityResult(Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/ActivityResultLauncher;

    move-result-object v1

    iput-object v1, v0, Lcom/zykj/view/utils/ImagePicker;->cropForImageLauncher:Landroidx/activity/result/ActivityResultLauncher;

    .line 13
    new-instance v1, Landroidx/activity/result/contract/ActivityResultContracts$RequestPermission;

    invoke-direct {v1}, Landroidx/activity/result/contract/ActivityResultContracts$RequestPermission;-><init>()V

    .line 14
    new-instance v2, Lcom/zykj/view/utils/e;

    const/4 v3, 0x4

    invoke-direct {v2, v0, v3}, Lcom/zykj/view/utils/e;-><init>(Lcom/zykj/view/utils/ImagePicker;I)V

    invoke-direct {v0, v1, v2}, Lcom/zykj/view/utils/ImagePicker;->registerForActivityResult(Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/ActivityResultLauncher;

    move-result-object v1

    iput-object v1, v0, Lcom/zykj/view/utils/ImagePicker;->permissionLauncher:Landroidx/activity/result/ActivityResultLauncher;

    .line 15
    new-instance v2, Lcom/canhub/cropper/CropImageOptions;

    const/16 v43, -0x1

    const/16 v44, 0x3f

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, -0x1

    invoke-direct/range {v2 .. v44}, Lcom/canhub/cropper/CropImageOptions;-><init>(Lcom/canhub/cropper/CropImageView$CropShape;Lcom/canhub/cropper/CropImageView$CropCornerShape;FFFLcom/canhub/cropper/CropImageView$Guidelines;Lcom/canhub/cropper/CropImageView$ScaleType;ZZZZZZIFZIIFIFFFIIFIIIIIIIIZZFILjava/lang/String;III)V

    const/4 v1, 0x1

    .line 16
    iput-boolean v1, v2, Lcom/canhub/cropper/CropImageOptions;->n:Z

    .line 17
    iput-boolean v1, v2, Lcom/canhub/cropper/CropImageOptions;->o:Z

    .line 18
    invoke-static {}, Lcom/blankj/utilcode/util/c;->d()Landroid/app/Application;

    move-result-object v1

    sget v3, Lcom/zykj/view/R$color;->colorPrimary:I

    invoke-virtual {v1, v3}, Landroid/content/Context;->getColor(I)I

    move-result v1

    iput v1, v2, Lcom/canhub/cropper/CropImageOptions;->x:I

    .line 19
    invoke-static {}, Lcom/blankj/utilcode/util/c;->d()Landroid/app/Application;

    move-result-object v1

    sget v3, Lcom/zykj/view/R$color;->colorPrimary:I

    invoke-virtual {v1, v3}, Landroid/content/Context;->getColor(I)I

    move-result v1

    iput v1, v2, Lcom/canhub/cropper/CropImageOptions;->B:I

    .line 20
    invoke-static {}, Lcom/blankj/utilcode/util/c;->d()Landroid/app/Application;

    move-result-object v1

    sget v3, Lcom/zykj/view/R$color;->colorPrimary:I

    invoke-virtual {v1, v3}, Landroid/content/Context;->getColor(I)I

    move-result v1

    iput v1, v2, Lcom/canhub/cropper/CropImageOptions;->m:I

    const v1, 0x3dcccccd    # 0.1f

    .line 21
    iput v1, v2, Lcom/canhub/cropper/CropImageOptions;->s:F

    .line 22
    iput-object v2, v0, Lcom/zykj/view/utils/ImagePicker;->cropImageOptions:Lcom/canhub/cropper/CropImageOptions;

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/fragment/app/Fragment;Landroidx/activity/ComponentActivity;ILkotlin/jvm/internal/e;)V
    .locals 1

    and-int/lit8 p4, p3, 0x1

    const/4 v0, 0x0

    if-eqz p4, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    move-object p2, v0

    .line 23
    :cond_1
    invoke-direct {p0, p1, p2}, Lcom/zykj/view/utils/ImagePicker;-><init>(Landroidx/fragment/app/Fragment;Landroidx/activity/ComponentActivity;)V

    return-void
.end method

.method public static synthetic a(Lcom/zykj/view/utils/ImagePicker;Landroid/net/Uri;ZLr6/c;)Ld6/s;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/view/utils/ImagePicker;->startSystemCamera$lambda$11(Lcom/zykj/view/utils/ImagePicker;Landroid/net/Uri;ZLr6/c;)Ld6/s;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/zykj/view/utils/ImagePicker;Landroid/net/Uri;ZLr6/c;)Ld6/s;
    .locals 0

    .line 1
    invoke-static {p2, p0, p3, p1}, Lcom/zykj/view/utils/ImagePicker;->startCapture$lambda$8$lambda$7(ZLcom/zykj/view/utils/ImagePicker;Lr6/c;Landroid/net/Uri;)Ld6/s;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/zykj/view/utils/ImagePicker;Landroid/net/Uri;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/utils/ImagePicker;->galleryLauncher$lambda$2(Lcom/zykj/view/utils/ImagePicker;Landroid/net/Uri;)V

    return-void
.end method

.method private static final cameraLauncher$lambda$0(Lcom/zykj/view/utils/ImagePicker;Landroid/net/Uri;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/utils/ImagePicker;->tempCameraCallback:Lr6/c;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    :cond_0
    const/4 p1, 0x0

    .line 9
    iput-object p1, p0, Lcom/zykj/view/utils/ImagePicker;->tempCameraCallback:Lr6/c;

    .line 10
    .line 11
    return-void
.end method

.method private final checkCameraPermission(Lr6/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr6/a;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/view/utils/ImagePicker;->tempPermissionCallback:Lr6/a;

    .line 2
    .line 3
    iget-object p1, p0, Lcom/zykj/view/utils/ImagePicker;->permissionLauncher:Landroidx/activity/result/ActivityResultLauncher;

    .line 4
    .line 5
    const-string v0, "android.permission.CAMERA"

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Landroidx/activity/result/ActivityResultLauncher;->launch(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private static final cropForImageLauncher$lambda$3(Lcom/zykj/view/utils/ImagePicker;Landroid/net/Uri;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/utils/ImagePicker;->tempCropForImageCallback:Lr6/c;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    :cond_0
    const/4 p1, 0x0

    .line 9
    iput-object p1, p0, Lcom/zykj/view/utils/ImagePicker;->tempCropForImageCallback:Lr6/c;

    .line 10
    .line 11
    return-void
.end method

.method public static synthetic d(Lcom/zykj/view/utils/ImagePicker;Z)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/utils/ImagePicker;->permissionLauncher$lambda$4(Lcom/zykj/view/utils/ImagePicker;Z)V

    return-void
.end method

.method public static synthetic e(Lcom/zykj/view/utils/ImagePicker;Landroid/net/Uri;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/utils/ImagePicker;->cameraLauncher$lambda$0(Lcom/zykj/view/utils/ImagePicker;Landroid/net/Uri;)V

    return-void
.end method

.method public static synthetic f(Lr6/c;Landroid/net/Uri;)Ld6/s;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/utils/ImagePicker;->startCrop$lambda$13(Lr6/c;Landroid/net/Uri;)Ld6/s;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lcom/zykj/view/utils/ImagePicker;Landroid/net/Uri;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/utils/ImagePicker;->cropForImageLauncher$lambda$3(Lcom/zykj/view/utils/ImagePicker;Landroid/net/Uri;)V

    return-void
.end method

.method private static final galleryLauncher$lambda$2(Lcom/zykj/view/utils/ImagePicker;Landroid/net/Uri;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/utils/ImagePicker;->tempGalleryCallback:Lr6/c;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    :cond_0
    const/4 p1, 0x0

    .line 9
    iput-object p1, p0, Lcom/zykj/view/utils/ImagePicker;->tempGalleryCallback:Lr6/c;

    .line 10
    .line 11
    return-void
.end method

.method public static synthetic h(Lcom/zykj/view/utils/ImagePicker;Landroid/net/Uri;ZLr6/c;)Ld6/s;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/view/utils/ImagePicker;->startCapture$lambda$8(Lcom/zykj/view/utils/ImagePicker;Landroid/net/Uri;ZLr6/c;)Ld6/s;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Landroid/net/Uri;Lr6/c;Landroid/net/Uri;)Ld6/s;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/view/utils/ImagePicker;->startCapture$lambda$8$lambda$7$lambda$6(Landroid/net/Uri;Lr6/c;Landroid/net/Uri;)Ld6/s;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lcom/zykj/view/utils/ImagePicker;Z)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/utils/ImagePicker;->systemCameraLauncher$lambda$1(Lcom/zykj/view/utils/ImagePicker;Z)V

    return-void
.end method

.method public static synthetic k(Lcom/zykj/view/utils/ImagePicker;Landroid/net/Uri;ZLr6/c;)Ld6/s;
    .locals 0

    .line 1
    invoke-static {p2, p0, p3, p1}, Lcom/zykj/view/utils/ImagePicker;->startGallery$lambda$12(ZLcom/zykj/view/utils/ImagePicker;Lr6/c;Landroid/net/Uri;)Ld6/s;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Landroid/net/Uri;Lr6/c;Landroid/net/Uri;)Ld6/s;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/view/utils/ImagePicker;->startSystemCamera$lambda$11$lambda$10$lambda$9(Landroid/net/Uri;Lr6/c;Landroid/net/Uri;)Ld6/s;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(ZLcom/zykj/view/utils/ImagePicker;Landroid/net/Uri;Lr6/c;Z)Ld6/s;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/zykj/view/utils/ImagePicker;->startSystemCamera$lambda$11$lambda$10(ZLcom/zykj/view/utils/ImagePicker;Landroid/net/Uri;Lr6/c;Z)Ld6/s;

    move-result-object p0

    return-object p0
.end method

.method private static final permissionLauncher$lambda$4(Lcom/zykj/view/utils/ImagePicker;Z)V
    .locals 0

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object p1, p0, Lcom/zykj/view/utils/ImagePicker;->tempPermissionCallback:Lr6/a;

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-interface {p1}, Lr6/a;->invoke()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    :cond_0
    const/4 p1, 0x0

    .line 11
    iput-object p1, p0, Lcom/zykj/view/utils/ImagePicker;->tempPermissionCallback:Lr6/a;

    .line 12
    .line 13
    return-void

    .line 14
    :cond_1
    const/4 p0, 0x0

    .line 15
    new-array p0, p0, [Ljava/lang/Object;

    .line 16
    .line 17
    const-string p1, "\u6743\u9650\u672a\u83b7\u53d6\u6210\u529f"

    .line 18
    .line 19
    invoke-static {p1, p0}, Lcom/blankj/utilcode/util/x;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method private final registerForActivityResult(Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/ActivityResultLauncher;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<I:",
            "Ljava/lang/Object;",
            "O:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/activity/result/contract/ActivityResultContract<",
            "TI;TO;>;",
            "Landroidx/activity/result/ActivityResultCallback<",
            "TO;>;)",
            "Landroidx/activity/result/ActivityResultLauncher<",
            "TI;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/view/utils/ImagePicker;->fragment:Landroidx/fragment/app/Fragment;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Landroidx/fragment/app/Fragment;->registerForActivityResult(Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/ActivityResultLauncher;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    return-object v0

    .line 13
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/zykj/view/utils/ImagePicker;->activity:Landroidx/activity/ComponentActivity;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1, p2}, Landroidx/activity/ComponentActivity;->registerForActivityResult(Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/ActivityResultLauncher;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1
.end method

.method public static synthetic startCapture$default(Lcom/zykj/view/utils/ImagePicker;Landroid/net/Uri;ZLr6/c;ILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p5, p4, 0x1

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/zykj/view/utils/ImagePickerKt;->getRandomUri()Landroid/net/Uri;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    :cond_0
    and-int/lit8 p4, p4, 0x2

    .line 10
    .line 11
    if-eqz p4, :cond_1

    .line 12
    .line 13
    const/4 p2, 0x0

    .line 14
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/view/utils/ImagePicker;->startCapture(Landroid/net/Uri;ZLr6/c;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method private static final startCapture$lambda$8(Lcom/zykj/view/utils/ImagePicker;Landroid/net/Uri;ZLr6/c;)Ld6/s;
    .locals 2

    .line 1
    new-instance v0, Lcom/zykj/view/utils/d;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, p2, p0, p3, v1}, Lcom/zykj/view/utils/d;-><init>(ZLcom/zykj/view/utils/ImagePicker;Lr6/c;I)V

    .line 5
    .line 6
    .line 7
    iput-object v0, p0, Lcom/zykj/view/utils/ImagePicker;->tempCameraCallback:Lr6/c;

    .line 8
    .line 9
    iget-object p0, p0, Lcom/zykj/view/utils/ImagePicker;->cameraLauncher:Landroidx/activity/result/ActivityResultLauncher;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Landroidx/activity/result/ActivityResultLauncher;->launch(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    sget-object p0, Ld6/s;->a:Ld6/s;

    .line 15
    .line 16
    return-object p0
.end method

.method private static final startCapture$lambda$8$lambda$7(ZLcom/zykj/view/utils/ImagePicker;Lr6/c;Landroid/net/Uri;)Ld6/s;
    .locals 1

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    new-instance p0, Lcom/zykj/view/utils/c;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-direct {p0, p3, p2, v0}, Lcom/zykj/view/utils/c;-><init>(Landroid/net/Uri;Lr6/c;I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1, p3, p0}, Lcom/zykj/view/utils/ImagePicker;->startCrop(Landroid/net/Uri;Lr6/c;)V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-interface {p2, p3}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    :goto_0
    sget-object p0, Ld6/s;->a:Ld6/s;

    .line 19
    .line 20
    return-object p0
.end method

.method private static final startCapture$lambda$8$lambda$7$lambda$6(Landroid/net/Uri;Lr6/c;Landroid/net/Uri;)Ld6/s;
    .locals 0

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    invoke-static {p0}, Lcom/blankj/utilcode/util/c;->s(Landroid/net/Uri;)Ljava/io/File;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    :goto_0
    invoke-static {p0}, Lcom/blankj/utilcode/util/e;->e(Ljava/io/File;)Z

    .line 10
    .line 11
    .line 12
    invoke-interface {p1, p2}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    sget-object p0, Ld6/s;->a:Ld6/s;

    .line 16
    .line 17
    return-object p0
.end method

.method private static final startCrop$lambda$13(Lr6/c;Landroid/net/Uri;)Ld6/s;
    .locals 0

    .line 1
    invoke-interface {p0, p1}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    sget-object p0, Ld6/s;->a:Ld6/s;

    .line 5
    .line 6
    return-object p0
.end method

.method public static synthetic startGallery$default(Lcom/zykj/view/utils/ImagePicker;ZLr6/c;ILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x1

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/utils/ImagePicker;->startGallery(ZLr6/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private static final startGallery$lambda$12(ZLcom/zykj/view/utils/ImagePicker;Lr6/c;Landroid/net/Uri;)Ld6/s;
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1, p3, p2}, Lcom/zykj/view/utils/ImagePicker;->startCrop(Landroid/net/Uri;Lr6/c;)V

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    invoke-interface {p2, p3}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    :goto_0
    sget-object p0, Ld6/s;->a:Ld6/s;

    .line 13
    .line 14
    return-object p0
.end method

.method public static synthetic startSystemCamera$default(Lcom/zykj/view/utils/ImagePicker;Landroid/net/Uri;ZLr6/c;ILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p5, p4, 0x1

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/zykj/view/utils/ImagePickerKt;->getRandomUri()Landroid/net/Uri;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    :cond_0
    and-int/lit8 p4, p4, 0x2

    .line 10
    .line 11
    if-eqz p4, :cond_1

    .line 12
    .line 13
    const/4 p2, 0x0

    .line 14
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/view/utils/ImagePicker;->startSystemCamera(Landroid/net/Uri;ZLr6/c;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method private static final startSystemCamera$lambda$11(Lcom/zykj/view/utils/ImagePicker;Landroid/net/Uri;ZLr6/c;)Ld6/s;
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/view/utils/a;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2, p3}, Lcom/zykj/view/utils/a;-><init>(Lcom/zykj/view/utils/ImagePicker;Landroid/net/Uri;ZLr6/c;)V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lcom/zykj/view/utils/ImagePicker;->tempSystemCameraCallback:Lr6/c;

    .line 7
    .line 8
    iget-object p0, p0, Lcom/zykj/view/utils/ImagePicker;->systemCameraLauncher:Landroidx/activity/result/ActivityResultLauncher;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Landroidx/activity/result/ActivityResultLauncher;->launch(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    sget-object p0, Ld6/s;->a:Ld6/s;

    .line 14
    .line 15
    return-object p0
.end method

.method private static final startSystemCamera$lambda$11$lambda$10(ZLcom/zykj/view/utils/ImagePicker;Landroid/net/Uri;Lr6/c;Z)Ld6/s;
    .locals 0

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    new-instance p0, Lcom/zykj/view/utils/c;

    .line 6
    .line 7
    const/4 p4, 0x1

    .line 8
    invoke-direct {p0, p2, p3, p4}, Lcom/zykj/view/utils/c;-><init>(Landroid/net/Uri;Lr6/c;I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1, p2, p0}, Lcom/zykj/view/utils/ImagePicker;->startCrop(Landroid/net/Uri;Lr6/c;)V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    invoke-interface {p3, p0}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    invoke-interface {p3, p2}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    :goto_0
    sget-object p0, Ld6/s;->a:Ld6/s;

    .line 24
    .line 25
    return-object p0
.end method

.method private static final startSystemCamera$lambda$11$lambda$10$lambda$9(Landroid/net/Uri;Lr6/c;Landroid/net/Uri;)Ld6/s;
    .locals 0

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    invoke-static {p0}, Lcom/blankj/utilcode/util/c;->s(Landroid/net/Uri;)Ljava/io/File;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    :goto_0
    invoke-static {p0}, Lcom/blankj/utilcode/util/e;->e(Ljava/io/File;)Z

    .line 10
    .line 11
    .line 12
    invoke-interface {p1, p2}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    sget-object p0, Ld6/s;->a:Ld6/s;

    .line 16
    .line 17
    return-object p0
.end method

.method private static final systemCameraLauncher$lambda$1(Lcom/zykj/view/utils/ImagePicker;Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/utils/ImagePicker;->tempSystemCameraCallback:Lr6/c;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-interface {v0, p1}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    :cond_0
    const/4 p1, 0x0

    .line 13
    iput-object p1, p0, Lcom/zykj/view/utils/ImagePicker;->tempSystemCameraCallback:Lr6/c;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final getCropImageOptions()Lcom/canhub/cropper/CropImageOptions;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/view/utils/ImagePicker;->cropImageOptions:Lcom/canhub/cropper/CropImageOptions;

    .line 2
    .line 3
    return-object v0
.end method

.method public final startCapture(Landroid/net/Uri;ZLr6/c;)V
    .locals 7
    .param p1    # Landroid/net/Uri;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "Z",
            "Lr6/c;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "uri"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "successCallback"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v1, Lcom/zykj/view/utils/b;

    .line 12
    .line 13
    const/4 v6, 0x0

    .line 14
    move-object v2, p0

    .line 15
    move-object v3, p1

    .line 16
    move v4, p2

    .line 17
    move-object v5, p3

    .line 18
    invoke-direct/range {v1 .. v6}, Lcom/zykj/view/utils/b;-><init>(Lcom/zykj/view/utils/ImagePicker;Landroid/net/Uri;ZLr6/c;I)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0, v1}, Lcom/zykj/view/utils/ImagePicker;->checkCameraPermission(Lr6/a;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public final startCrop(Landroid/net/Uri;Lr6/c;)V
    .locals 2
    .param p1    # Landroid/net/Uri;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "Lr6/c;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "uri"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "successCallback"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lcom/zykj/mistake/feature/notebook/detail/m4;

    .line 12
    .line 13
    const/16 v1, 0xb

    .line 14
    .line 15
    invoke-direct {v0, p2, v1}, Lcom/zykj/mistake/feature/notebook/detail/m4;-><init>(Lr6/c;I)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lcom/zykj/view/utils/ImagePicker;->tempCropForImageCallback:Lr6/c;

    .line 19
    .line 20
    iget-object p2, p0, Lcom/zykj/view/utils/ImagePicker;->cropForImageLauncher:Landroidx/activity/result/ActivityResultLauncher;

    .line 21
    .line 22
    new-instance v0, Lcom/zykj/view/ui/crop/EzyCropContract$CropRequestOptions;

    .line 23
    .line 24
    iget-object v1, p0, Lcom/zykj/view/utils/ImagePicker;->cropImageOptions:Lcom/canhub/cropper/CropImageOptions;

    .line 25
    .line 26
    invoke-direct {v0, p1, v1}, Lcom/zykj/view/ui/crop/EzyCropContract$CropRequestOptions;-><init>(Landroid/net/Uri;Lcom/canhub/cropper/CropImageOptions;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p2, v0}, Landroidx/activity/result/ActivityResultLauncher;->launch(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final startGallery(ZLr6/c;)V
    .locals 2
    .param p2    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lr6/c;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "successCallback"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/zykj/view/utils/d;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-direct {v0, p1, p0, p2, v1}, Lcom/zykj/view/utils/d;-><init>(ZLcom/zykj/view/utils/ImagePicker;Lr6/c;I)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lcom/zykj/view/utils/ImagePicker;->tempGalleryCallback:Lr6/c;

    .line 13
    .line 14
    iget-object p1, p0, Lcom/zykj/view/utils/ImagePicker;->galleryLauncher:Landroidx/activity/result/ActivityResultLauncher;

    .line 15
    .line 16
    new-instance p2, Landroidx/activity/result/PickVisualMediaRequest$Builder;

    .line 17
    .line 18
    invoke-direct {p2}, Landroidx/activity/result/PickVisualMediaRequest$Builder;-><init>()V

    .line 19
    .line 20
    .line 21
    sget-object v0, Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$ImageOnly;->INSTANCE:Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$ImageOnly;

    .line 22
    .line 23
    invoke-virtual {p2, v0}, Landroidx/activity/result/PickVisualMediaRequest$Builder;->setMediaType(Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;)Landroidx/activity/result/PickVisualMediaRequest$Builder;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    invoke-virtual {p2}, Landroidx/activity/result/PickVisualMediaRequest$Builder;->build()Landroidx/activity/result/PickVisualMediaRequest;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    invoke-virtual {p1, p2}, Landroidx/activity/result/ActivityResultLauncher;->launch(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public final startSystemCamera(Landroid/net/Uri;ZLr6/c;)V
    .locals 7
    .param p1    # Landroid/net/Uri;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "Z",
            "Lr6/c;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "uri"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "successCallback"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v1, Lcom/zykj/view/utils/b;

    .line 12
    .line 13
    const/4 v6, 0x1

    .line 14
    move-object v2, p0

    .line 15
    move-object v3, p1

    .line 16
    move v4, p2

    .line 17
    move-object v5, p3

    .line 18
    invoke-direct/range {v1 .. v6}, Lcom/zykj/view/utils/b;-><init>(Lcom/zykj/view/utils/ImagePicker;Landroid/net/Uri;ZLr6/c;I)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0, v1}, Lcom/zykj/view/utils/ImagePicker;->checkCameraPermission(Lr6/a;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method
