.class public final Lcom/zykj/view/ui/crop/EzyCropActivity;
.super Landroidx/appcompat/app/AppCompatActivity;
.source "SourceFile"

# interfaces
.implements Lcom/canhub/cropper/z;
.implements Lcom/canhub/cropper/v;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0005J\u000f\u0010\u0008\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\u0005J\u0019\u0010\u000b\u001a\u00020\u00062\u0008\u0010\n\u001a\u0004\u0018\u00010\tH\u0014\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ/\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u000e\u0010\u0013\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u0012H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020 8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008!\u0010\"R\u0016\u0010&\u001a\u0004\u0018\u00010\u000f8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008$\u0010%\u00a8\u0006\'"
    }
    d2 = {
        "Lcom/zykj/view/ui/crop/EzyCropActivity;",
        "Landroidx/appcompat/app/AppCompatActivity;",
        "Lcom/canhub/cropper/z;",
        "Lcom/canhub/cropper/v;",
        "<init>",
        "()V",
        "Ld6/s;",
        "initClickListener",
        "initCropView",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "onCreate",
        "(Landroid/os/Bundle;)V",
        "Lcom/canhub/cropper/CropImageView;",
        "view",
        "Landroid/net/Uri;",
        "uri",
        "Ljava/lang/Exception;",
        "Lkotlin/Exception;",
        "error",
        "onSetImageUriComplete",
        "(Lcom/canhub/cropper/CropImageView;Landroid/net/Uri;Ljava/lang/Exception;)V",
        "Lcom/canhub/cropper/u;",
        "result",
        "onCropImageComplete",
        "(Lcom/canhub/cropper/CropImageView;Lcom/canhub/cropper/u;)V",
        "",
        "isSetImageCompleted",
        "Z",
        "Lcom/zykj/view/databinding/ViewActivityEzyCropBinding;",
        "mBinding",
        "Lcom/zykj/view/databinding/ViewActivityEzyCropBinding;",
        "Lcom/canhub/cropper/CropImageOptions;",
        "getCropImageOptions",
        "()Lcom/canhub/cropper/CropImageOptions;",
        "cropImageOptions",
        "getImageUri",
        "()Landroid/net/Uri;",
        "imageUri",
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
.field private isSetImageCompleted:Z

.field private mBinding:Lcom/zykj/view/databinding/ViewActivityEzyCropBinding;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final getCropImageOptions()Lcom/canhub/cropper/CropImageOptions;
    .locals 44

    .line 1
    invoke-virtual/range {p0 .. p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    const-string v1, "CropImageOptions"

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Lcom/canhub/cropper/CropImageOptions;

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    return-object v0

    .line 19
    :cond_1
    :goto_0
    new-instance v1, Lcom/canhub/cropper/CropImageOptions;

    .line 20
    .line 21
    const/16 v42, -0x1

    .line 22
    .line 23
    const/16 v43, 0x3f

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    const/4 v3, 0x0

    .line 27
    const/4 v4, 0x0

    .line 28
    const/4 v5, 0x0

    .line 29
    const/4 v6, 0x0

    .line 30
    const/4 v7, 0x0

    .line 31
    const/4 v8, 0x0

    .line 32
    const/4 v9, 0x0

    .line 33
    const/4 v10, 0x0

    .line 34
    const/4 v11, 0x0

    .line 35
    const/4 v12, 0x0

    .line 36
    const/4 v13, 0x0

    .line 37
    const/4 v14, 0x0

    .line 38
    const/4 v15, 0x0

    .line 39
    const/16 v16, 0x0

    .line 40
    .line 41
    const/16 v17, 0x0

    .line 42
    .line 43
    const/16 v18, 0x0

    .line 44
    .line 45
    const/16 v19, 0x0

    .line 46
    .line 47
    const/16 v20, 0x0

    .line 48
    .line 49
    const/16 v21, 0x0

    .line 50
    .line 51
    const/16 v22, 0x0

    .line 52
    .line 53
    const/16 v23, 0x0

    .line 54
    .line 55
    const/16 v24, 0x0

    .line 56
    .line 57
    const/16 v25, 0x0

    .line 58
    .line 59
    const/16 v26, 0x0

    .line 60
    .line 61
    const/16 v27, 0x0

    .line 62
    .line 63
    const/16 v28, 0x0

    .line 64
    .line 65
    const/16 v29, 0x0

    .line 66
    .line 67
    const/16 v30, 0x0

    .line 68
    .line 69
    const/16 v31, 0x0

    .line 70
    .line 71
    const/16 v32, 0x0

    .line 72
    .line 73
    const/16 v33, 0x0

    .line 74
    .line 75
    const/16 v34, 0x0

    .line 76
    .line 77
    const/16 v35, 0x0

    .line 78
    .line 79
    const/16 v36, 0x0

    .line 80
    .line 81
    const/16 v37, 0x0

    .line 82
    .line 83
    const/16 v38, 0x0

    .line 84
    .line 85
    const/16 v39, 0x0

    .line 86
    .line 87
    const/16 v40, 0x0

    .line 88
    .line 89
    const/16 v41, -0x1

    .line 90
    .line 91
    invoke-direct/range {v1 .. v43}, Lcom/canhub/cropper/CropImageOptions;-><init>(Lcom/canhub/cropper/CropImageView$CropShape;Lcom/canhub/cropper/CropImageView$CropCornerShape;FFFLcom/canhub/cropper/CropImageView$Guidelines;Lcom/canhub/cropper/CropImageView$ScaleType;ZZZZZZIFZIIFIFFFIIFIIIIIIIIZZFILjava/lang/String;III)V

    .line 92
    .line 93
    .line 94
    return-object v1
.end method

.method private final getImageUri()Landroid/net/Uri;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-string v1, "Uri"

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Landroid/net/Uri;

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    return-object v0
.end method

.method private final initClickListener()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/zykj/view/ui/crop/EzyCropActivity;->mBinding:Lcom/zykj/view/databinding/ViewActivityEzyCropBinding;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "mBinding"

    .line 5
    .line 6
    if-eqz v0, :cond_2

    .line 7
    .line 8
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewActivityEzyCropBinding;->confirmCrop:Landroid/widget/ImageView;

    .line 9
    .line 10
    new-instance v3, Lh5/a;

    .line 11
    .line 12
    const/4 v4, 0x0

    .line 13
    invoke-direct {v3, p0, v4}, Lh5/a;-><init>(Lcom/zykj/view/ui/crop/EzyCropActivity;I)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lcom/zykj/view/ui/crop/EzyCropActivity;->mBinding:Lcom/zykj/view/databinding/ViewActivityEzyCropBinding;

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewActivityEzyCropBinding;->cancel:Landroid/widget/ImageView;

    .line 24
    .line 25
    new-instance v3, Lh5/a;

    .line 26
    .line 27
    const/4 v4, 0x1

    .line 28
    invoke-direct {v3, p0, v4}, Lh5/a;-><init>(Lcom/zykj/view/ui/crop/EzyCropActivity;I)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Lcom/zykj/view/ui/crop/EzyCropActivity;->mBinding:Lcom/zykj/view/databinding/ViewActivityEzyCropBinding;

    .line 35
    .line 36
    if-eqz v0, :cond_0

    .line 37
    .line 38
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewActivityEzyCropBinding;->rotate:Landroid/widget/ImageView;

    .line 39
    .line 40
    new-instance v1, Lh5/a;

    .line 41
    .line 42
    const/4 v2, 0x2

    .line 43
    invoke-direct {v1, p0, v2}, Lh5/a;-><init>(Lcom/zykj/view/ui/crop/EzyCropActivity;I)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :cond_0
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw v1

    .line 54
    :cond_1
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    throw v1

    .line 58
    :cond_2
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    throw v1
.end method

.method private static final initClickListener$lambda$1(Lcom/zykj/view/ui/crop/EzyCropActivity;Landroid/view/View;)V
    .locals 7

    .line 1
    iget-object p1, p0, Lcom/zykj/view/ui/crop/EzyCropActivity;->mBinding:Lcom/zykj/view/databinding/ViewActivityEzyCropBinding;

    .line 2
    .line 3
    if-eqz p1, :cond_1

    .line 4
    .line 5
    iget-object v0, p1, Lcom/zykj/view/databinding/ViewActivityEzyCropBinding;->cropImageView:Lcom/canhub/cropper/CropImageView;

    .line 6
    .line 7
    iget-boolean p0, p0, Lcom/zykj/view/ui/crop/EzyCropActivity;->isSetImageCompleted:Z

    .line 8
    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    new-array p0, p0, [Ljava/lang/Object;

    .line 13
    .line 14
    const-string p1, "\u56fe\u7247\u5c1a\u672a\u52a0\u8f7d\u5b8c\u6210"

    .line 15
    .line 16
    invoke-static {p1, p0}, Lcom/blankj/utilcode/util/x;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    invoke-static {}, Lcom/zykj/view/utils/ImagePickerKt;->getRandomUri()Landroid/net/Uri;

    .line 21
    .line 22
    .line 23
    move-result-object v6

    .line 24
    sget p0, Lcom/canhub/cropper/CropImageView;->N:I

    .line 25
    .line 26
    sget-object v1, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    .line 27
    .line 28
    const/4 v4, 0x0

    .line 29
    sget-object v5, Lcom/canhub/cropper/CropImageView$RequestSizeOptions;->RESIZE_INSIDE:Lcom/canhub/cropper/CropImageView$RequestSizeOptions;

    .line 30
    .line 31
    const/16 v2, 0x5a

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    invoke-virtual/range {v0 .. v6}, Lcom/canhub/cropper/CropImageView;->c(Landroid/graphics/Bitmap$CompressFormat;IIILcom/canhub/cropper/CropImageView$RequestSizeOptions;Landroid/net/Uri;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_1
    const-string p0, "mBinding"

    .line 39
    .line 40
    invoke-static {p0}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    const/4 p0, 0x0

    .line 44
    throw p0
.end method

.method private static final initClickListener$lambda$2(Lcom/zykj/view/ui/crop/EzyCropActivity;Landroid/view/View;)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    invoke-virtual {p0, p1}, Landroid/app/Activity;->setResult(I)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private static final initClickListener$lambda$3(Lcom/zykj/view/ui/crop/EzyCropActivity;Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/view/ui/crop/EzyCropActivity;->mBinding:Lcom/zykj/view/databinding/ViewActivityEzyCropBinding;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lcom/zykj/view/databinding/ViewActivityEzyCropBinding;->cropImageView:Lcom/canhub/cropper/CropImageView;

    .line 6
    .line 7
    const/16 p1, -0x5a

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lcom/canhub/cropper/CropImageView;->f(I)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    const-string p0, "mBinding"

    .line 14
    .line 15
    invoke-static {p0}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const/4 p0, 0x0

    .line 19
    throw p0
.end method

.method private final initCropView()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/zykj/view/ui/crop/EzyCropActivity;->isSetImageCompleted:Z

    .line 3
    .line 4
    iget-object v0, p0, Lcom/zykj/view/ui/crop/EzyCropActivity;->mBinding:Lcom/zykj/view/databinding/ViewActivityEzyCropBinding;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewActivityEzyCropBinding;->cropImageView:Lcom/canhub/cropper/CropImageView;

    .line 9
    .line 10
    invoke-direct {p0}, Lcom/zykj/view/ui/crop/EzyCropActivity;->getCropImageOptions()Lcom/canhub/cropper/CropImageOptions;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Lcom/canhub/cropper/CropImageView;->setImageCropOptions(Lcom/canhub/cropper/CropImageOptions;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p0}, Lcom/canhub/cropper/CropImageView;->setOnSetImageUriCompleteListener(Lcom/canhub/cropper/z;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p0}, Lcom/canhub/cropper/CropImageView;->setOnCropImageCompleteListener(Lcom/canhub/cropper/v;)V

    .line 21
    .line 22
    .line 23
    invoke-direct {p0}, Lcom/zykj/view/ui/crop/EzyCropActivity;->getImageUri()Landroid/net/Uri;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v0, v1}, Lcom/canhub/cropper/CropImageView;->setImageUriAsync(Landroid/net/Uri;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    const-string v0, "mBinding"

    .line 32
    .line 33
    invoke-static {v0}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const/4 v0, 0x0

    .line 37
    throw v0
.end method

.method public static synthetic o(Lcom/zykj/view/ui/crop/EzyCropActivity;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/ui/crop/EzyCropActivity;->initClickListener$lambda$2(Lcom/zykj/view/ui/crop/EzyCropActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic p(Lcom/zykj/view/ui/crop/EzyCropActivity;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/ui/crop/EzyCropActivity;->initClickListener$lambda$1(Lcom/zykj/view/ui/crop/EzyCropActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic q(Lcom/zykj/view/ui/crop/EzyCropActivity;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/ui/crop/EzyCropActivity;->initClickListener$lambda$3(Lcom/zykj/view/ui/crop/EzyCropActivity;Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/FragmentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    # RE layout layout/view_activity_ezy_crop (0x7f0c00e9), APK res/SW.xml
    sget p1, Lcom/zykj/view/R$layout;->view_activity_ezy_crop:I

    .line 5
    .line 6
    invoke-static {p0, p1}, Landroidx/databinding/DataBindingUtil;->setContentView(Landroid/app/Activity;I)Landroidx/databinding/ViewDataBinding;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    const-string v0, "setContentView(...)"

    .line 11
    .line 12
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    check-cast p1, Lcom/zykj/view/databinding/ViewActivityEzyCropBinding;

    .line 16
    .line 17
    iput-object p1, p0, Lcom/zykj/view/ui/crop/EzyCropActivity;->mBinding:Lcom/zykj/view/databinding/ViewActivityEzyCropBinding;

    .line 18
    .line 19
    invoke-direct {p0}, Lcom/zykj/view/ui/crop/EzyCropActivity;->initClickListener()V

    .line 20
    .line 21
    .line 22
    invoke-direct {p0}, Lcom/zykj/view/ui/crop/EzyCropActivity;->initCropView()V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public onCropImageComplete(Lcom/canhub/cropper/CropImageView;Lcom/canhub/cropper/u;)V
    .locals 1
    .param p1    # Lcom/canhub/cropper/CropImageView;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/canhub/cropper/u;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "result"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance p1, Landroid/content/Intent;

    .line 12
    .line 13
    invoke-direct {p1}, Landroid/content/Intent;-><init>()V

    .line 14
    .line 15
    .line 16
    const-string v0, "ResultUri"

    .line 17
    .line 18
    iget-object p2, p2, Lcom/canhub/cropper/u;->b:Landroid/net/Uri;

    .line 19
    .line 20
    invoke-virtual {p1, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 21
    .line 22
    .line 23
    const/4 p2, -0x1

    .line 24
    invoke-virtual {p0, p2, p1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public onSetImageUriComplete(Lcom/canhub/cropper/CropImageView;Landroid/net/Uri;Ljava/lang/Exception;)V
    .locals 1
    .param p1    # Lcom/canhub/cropper/CropImageView;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/net/Uri;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/Exception;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "uri"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    if-nez p3, :cond_0

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    iput-boolean p1, p0, Lcom/zykj/view/ui/crop/EzyCropActivity;->isSetImageCompleted:Z

    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    const/4 p1, 0x0

    .line 18
    new-array p1, p1, [Ljava/lang/Object;

    .line 19
    .line 20
    const-string p2, "\u56fe\u7247\u52a0\u8f7d\u5931\u8d25"

    .line 21
    .line 22
    invoke-static {p2, p1}, Lcom/blankj/utilcode/util/x;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method
