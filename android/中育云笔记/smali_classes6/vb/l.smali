.class public final Lvb/l;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroidx/fragment/app/Fragment;

.field public final b:Landroidx/activity/ComponentActivity;

.field public c:Lhd/l;

.field public final d:Landroidx/activity/result/ActivityResultLauncher;

.field public e:Lhd/l;

.field public final f:Landroidx/activity/result/ActivityResultLauncher;

.field public g:Lhd/l;

.field public final h:Landroidx/activity/result/ActivityResultLauncher;

.field public i:Lhd/l;

.field public final j:Landroidx/activity/result/ActivityResultLauncher;

.field public k:Lhd/a;

.field public final l:Landroidx/activity/result/ActivityResultLauncher;

.field public final m:Lcom/canhub/cropper/CropImageOptions;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/Fragment;Landroidx/activity/ComponentActivity;)V
    .locals 77

    move-object/from16 v0, p0

    .line 1
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    move-object/from16 v1, p1

    .line 2
    iput-object v1, v0, Lvb/l;->a:Landroidx/fragment/app/Fragment;

    move-object/from16 v1, p2

    .line 3
    iput-object v1, v0, Lvb/l;->b:Landroidx/activity/ComponentActivity;

    .line 4
    new-instance v1, Lcom/zykj/view/ui/camera/EzyCameraContract$StartCameraForResult;

    invoke-direct {v1}, Lcom/zykj/view/ui/camera/EzyCameraContract$StartCameraForResult;-><init>()V

    .line 5
    new-instance v2, Lvb/b;

    invoke-direct {v2, v0}, Lvb/b;-><init>(Lvb/l;)V

    invoke-virtual {v0, v1, v2}, Lvb/l;->p(Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/ActivityResultLauncher;

    move-result-object v1

    iput-object v1, v0, Lvb/l;->d:Landroidx/activity/result/ActivityResultLauncher;

    .line 6
    new-instance v1, Landroidx/activity/result/contract/ActivityResultContracts$TakePicture;

    invoke-direct {v1}, Landroidx/activity/result/contract/ActivityResultContracts$TakePicture;-><init>()V

    .line 7
    new-instance v2, Lvb/c;

    invoke-direct {v2, v0}, Lvb/c;-><init>(Lvb/l;)V

    invoke-virtual {v0, v1, v2}, Lvb/l;->p(Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/ActivityResultLauncher;

    move-result-object v1

    iput-object v1, v0, Lvb/l;->f:Landroidx/activity/result/ActivityResultLauncher;

    .line 8
    new-instance v1, Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia;

    invoke-direct {v1}, Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia;-><init>()V

    .line 9
    new-instance v2, Lvb/d;

    invoke-direct {v2, v0}, Lvb/d;-><init>(Lvb/l;)V

    invoke-virtual {v0, v1, v2}, Lvb/l;->p(Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/ActivityResultLauncher;

    move-result-object v1

    iput-object v1, v0, Lvb/l;->h:Landroidx/activity/result/ActivityResultLauncher;

    .line 10
    new-instance v1, Lcom/zykj/view/ui/crop/EzyCropContract$StartCropForResult;

    invoke-direct {v1}, Lcom/zykj/view/ui/crop/EzyCropContract$StartCropForResult;-><init>()V

    .line 11
    new-instance v2, Lvb/e;

    invoke-direct {v2, v0}, Lvb/e;-><init>(Lvb/l;)V

    invoke-virtual {v0, v1, v2}, Lvb/l;->p(Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/ActivityResultLauncher;

    move-result-object v1

    iput-object v1, v0, Lvb/l;->j:Landroidx/activity/result/ActivityResultLauncher;

    .line 12
    new-instance v1, Landroidx/activity/result/contract/ActivityResultContracts$RequestPermission;

    invoke-direct {v1}, Landroidx/activity/result/contract/ActivityResultContracts$RequestPermission;-><init>()V

    .line 13
    new-instance v2, Lvb/f;

    invoke-direct {v2, v0}, Lvb/f;-><init>(Lvb/l;)V

    invoke-virtual {v0, v1, v2}, Lvb/l;->p(Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/ActivityResultLauncher;

    move-result-object v1

    iput-object v1, v0, Lvb/l;->l:Landroidx/activity/result/ActivityResultLauncher;

    .line 14
    new-instance v2, Lcom/canhub/cropper/CropImageOptions;

    const/16 v75, 0x3f

    const/16 v76, 0x0

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

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const/16 v54, 0x0

    const/16 v55, 0x0

    const/16 v56, 0x0

    const/16 v57, 0x0

    const/16 v58, 0x0

    const/16 v59, 0x0

    const/16 v60, 0x0

    const/16 v61, 0x0

    const/16 v62, 0x0

    const/16 v63, 0x0

    const/16 v64, 0x0

    const/16 v65, 0x0

    const/16 v66, 0x0

    const/16 v67, 0x0

    const/16 v68, 0x0

    const/16 v69, 0x0

    const/16 v70, 0x0

    const/16 v71, 0x0

    const/16 v72, 0x0

    const/16 v73, -0x1

    const/16 v74, -0x1

    invoke-direct/range {v2 .. v76}, Lcom/canhub/cropper/CropImageOptions;-><init>(ZZLcom/canhub/cropper/CropImageView$CropShape;Lcom/canhub/cropper/CropImageView$CropCornerShape;FFFLcom/canhub/cropper/CropImageView$Guidelines;Lcom/canhub/cropper/CropImageView$ScaleType;ZZZIZZZZIFZIIFIFFFIIFIIIIIIIILjava/lang/CharSequence;ILjava/lang/Integer;Landroid/net/Uri;Landroid/graphics/Bitmap$CompressFormat;IIILcom/canhub/cropper/CropImageView$RequestSizeOptions;ZLandroid/graphics/Rect;IZZZIZZLjava/lang/CharSequence;IZZLjava/lang/String;Ljava/util/List;FILjava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIILkotlin/jvm/internal/n;)V

    const/4 v1, 0x1

    .line 15
    iput-boolean v1, v2, Lcom/canhub/cropper/CropImageOptions;->p:Z

    .line 16
    iput-boolean v1, v2, Lcom/canhub/cropper/CropImageOptions;->q:Z

    .line 17
    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->getApp()Landroid/app/Application;

    move-result-object v1

    sget v3, Lcom/zykj/view/R$color;->colorPrimary:I

    invoke-virtual {v1, v3}, Landroid/content/Context;->getColor(I)I

    move-result v1

    iput v1, v2, Lcom/canhub/cropper/CropImageOptions;->z:I

    .line 18
    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->getApp()Landroid/app/Application;

    move-result-object v1

    sget v3, Lcom/zykj/view/R$color;->colorPrimary:I

    invoke-virtual {v1, v3}, Landroid/content/Context;->getColor(I)I

    move-result v1

    iput v1, v2, Lcom/canhub/cropper/CropImageOptions;->D:I

    .line 19
    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->getApp()Landroid/app/Application;

    move-result-object v1

    sget v3, Lcom/zykj/view/R$color;->colorPrimary:I

    invoke-virtual {v1, v3}, Landroid/content/Context;->getColor(I)I

    move-result v1

    iput v1, v2, Lcom/canhub/cropper/CropImageOptions;->o:I

    const v1, 0x3dcccccd    # 0.1f

    .line 20
    iput v1, v2, Lcom/canhub/cropper/CropImageOptions;->u:F

    .line 21
    iput-object v2, v0, Lvb/l;->m:Lcom/canhub/cropper/CropImageOptions;

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/fragment/app/Fragment;Landroidx/activity/ComponentActivity;ILkotlin/jvm/internal/n;)V
    .locals 1

    and-int/lit8 p4, p3, 0x1

    const/4 v0, 0x0

    if-eqz p4, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    move-object p2, v0

    .line 22
    :cond_1
    invoke-direct {p0, p1, p2}, Lvb/l;-><init>(Landroidx/fragment/app/Fragment;Landroidx/activity/ComponentActivity;)V

    return-void
.end method

.method public static synthetic a(Lvb/l;Landroid/net/Uri;ZLhd/l;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lvb/l;->w(Lvb/l;Landroid/net/Uri;ZLhd/l;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lvb/l;Landroid/net/Uri;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lvb/l;->n(Lvb/l;Landroid/net/Uri;)V

    return-void
.end method

.method public static synthetic c(Lvb/l;Z)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lvb/l;->o(Lvb/l;Z)V

    return-void
.end method

.method public static synthetic d(Lvb/l;Landroid/net/Uri;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lvb/l;->k(Lvb/l;Landroid/net/Uri;)V

    return-void
.end method

.method public static synthetic e(Lhd/l;Landroid/net/Uri;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lvb/l;->r(Lhd/l;Landroid/net/Uri;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lvb/l;Landroid/net/Uri;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lvb/l;->m(Lvb/l;Landroid/net/Uri;)V

    return-void
.end method

.method public static synthetic g(Lvb/l;Z)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lvb/l;->z(Lvb/l;Z)V

    return-void
.end method

.method public static synthetic h(ZLvb/l;Lhd/l;Landroid/net/Uri;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lvb/l;->t(ZLvb/l;Lhd/l;Landroid/net/Uri;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Landroid/net/Uri;Lhd/l;Landroid/net/Uri;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lvb/l;->y(Landroid/net/Uri;Lhd/l;Landroid/net/Uri;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(ZLvb/l;Landroid/net/Uri;Lhd/l;Z)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lvb/l;->x(ZLvb/l;Landroid/net/Uri;Lhd/l;Z)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static final k(Lvb/l;Landroid/net/Uri;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lvb/l;->c:Lhd/l;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    :cond_0
    const/4 p1, 0x0

    .line 9
    iput-object p1, p0, Lvb/l;->c:Lhd/l;

    .line 10
    .line 11
    return-void
.end method

.method public static final m(Lvb/l;Landroid/net/Uri;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lvb/l;->i:Lhd/l;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    :cond_0
    const/4 p1, 0x0

    .line 9
    iput-object p1, p0, Lvb/l;->i:Lhd/l;

    .line 10
    .line 11
    return-void
.end method

.method public static final n(Lvb/l;Landroid/net/Uri;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lvb/l;->g:Lhd/l;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    :cond_0
    const/4 p1, 0x0

    .line 9
    iput-object p1, p0, Lvb/l;->g:Lhd/l;

    .line 10
    .line 11
    return-void
.end method

.method public static final o(Lvb/l;Z)V
    .locals 0

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object p1, p0, Lvb/l;->k:Lhd/a;

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-interface {p1}, Lhd/a;->invoke()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    :cond_0
    const/4 p1, 0x0

    .line 11
    iput-object p1, p0, Lvb/l;->k:Lhd/a;

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
    invoke-static {p1, p0}, Lcom/blankj/utilcode/util/ToastUtils;->showShort(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public static final r(Lhd/l;Landroid/net/Uri;)Lqc/q;
    .locals 0

    .line 1
    invoke-interface {p0, p1}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 5
    .line 6
    return-object p0
.end method

.method public static final t(ZLvb/l;Lhd/l;Landroid/net/Uri;)Lqc/q;
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1, p3, p2}, Lvb/l;->q(Landroid/net/Uri;Lhd/l;)V

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    invoke-interface {p2, p3}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    :goto_0
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 13
    .line 14
    return-object p0
.end method

.method public static synthetic v(Lvb/l;Landroid/net/Uri;ZLhd/l;ILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p5, p4, 0x1

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lvb/m;->a()Landroid/net/Uri;

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
    invoke-virtual {p0, p1, p2, p3}, Lvb/l;->u(Landroid/net/Uri;ZLhd/l;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public static final w(Lvb/l;Landroid/net/Uri;ZLhd/l;)Lqc/q;
    .locals 1

    .line 1
    new-instance v0, Lvb/h;

    .line 2
    .line 3
    invoke-direct {v0, p2, p0, p1, p3}, Lvb/h;-><init>(ZLvb/l;Landroid/net/Uri;Lhd/l;)V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lvb/l;->e:Lhd/l;

    .line 7
    .line 8
    iget-object p0, p0, Lvb/l;->f:Landroidx/activity/result/ActivityResultLauncher;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Landroidx/activity/result/ActivityResultLauncher;->launch(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 14
    .line 15
    return-object p0
.end method

.method public static final x(ZLvb/l;Landroid/net/Uri;Lhd/l;Z)Lqc/q;
    .locals 0

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    new-instance p0, Lvb/k;

    .line 6
    .line 7
    invoke-direct {p0, p2, p3}, Lvb/k;-><init>(Landroid/net/Uri;Lhd/l;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1, p2, p0}, Lvb/l;->q(Landroid/net/Uri;Lhd/l;)V

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    invoke-interface {p3, p0}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    invoke-interface {p3, p2}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    :goto_0
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 23
    .line 24
    return-object p0
.end method

.method public static final y(Landroid/net/Uri;Lhd/l;Landroid/net/Uri;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/blankj/utilcode/util/UriUtils;->uri2FileNoCacheCopy(Landroid/net/Uri;)Ljava/io/File;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Lcom/blankj/utilcode/util/FileUtils;->delete(Ljava/io/File;)Z

    .line 6
    .line 7
    .line 8
    invoke-interface {p1, p2}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 12
    .line 13
    return-object p0
.end method

.method public static final z(Lvb/l;Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lvb/l;->e:Lhd/l;

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
    invoke-interface {v0, p1}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    :cond_0
    const/4 p1, 0x0

    .line 13
    iput-object p1, p0, Lvb/l;->e:Lhd/l;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final l(Lhd/a;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lvb/l;->k:Lhd/a;

    .line 2
    .line 3
    iget-object p1, p0, Lvb/l;->l:Landroidx/activity/result/ActivityResultLauncher;

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

.method public final p(Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/ActivityResultLauncher;
    .locals 1

    .line 1
    iget-object v0, p0, Lvb/l;->a:Landroidx/fragment/app/Fragment;

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
    iget-object v0, p0, Lvb/l;->b:Landroidx/activity/ComponentActivity;

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

.method public final q(Landroid/net/Uri;Lhd/l;)V
    .locals 2

    .line 1
    const-string v0, "uri"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "successCallback"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lvb/j;

    .line 12
    .line 13
    invoke-direct {v0, p2}, Lvb/j;-><init>(Lhd/l;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lvb/l;->i:Lhd/l;

    .line 17
    .line 18
    iget-object p2, p0, Lvb/l;->j:Landroidx/activity/result/ActivityResultLauncher;

    .line 19
    .line 20
    new-instance v0, Lub/d;

    .line 21
    .line 22
    iget-object v1, p0, Lvb/l;->m:Lcom/canhub/cropper/CropImageOptions;

    .line 23
    .line 24
    invoke-direct {v0, p1, v1}, Lub/d;-><init>(Landroid/net/Uri;Lcom/canhub/cropper/CropImageOptions;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p2, v0}, Landroidx/activity/result/ActivityResultLauncher;->launch(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final s(ZLhd/l;)V
    .locals 1

    .line 1
    const-string v0, "successCallback"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lvb/i;

    .line 7
    .line 8
    invoke-direct {v0, p1, p0, p2}, Lvb/i;-><init>(ZLvb/l;Lhd/l;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lvb/l;->g:Lhd/l;

    .line 12
    .line 13
    iget-object p1, p0, Lvb/l;->h:Landroidx/activity/result/ActivityResultLauncher;

    .line 14
    .line 15
    new-instance p2, Landroidx/activity/result/PickVisualMediaRequest$Builder;

    .line 16
    .line 17
    invoke-direct {p2}, Landroidx/activity/result/PickVisualMediaRequest$Builder;-><init>()V

    .line 18
    .line 19
    .line 20
    sget-object v0, Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$ImageOnly;->INSTANCE:Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$ImageOnly;

    .line 21
    .line 22
    invoke-virtual {p2, v0}, Landroidx/activity/result/PickVisualMediaRequest$Builder;->setMediaType(Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;)Landroidx/activity/result/PickVisualMediaRequest$Builder;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    invoke-virtual {p2}, Landroidx/activity/result/PickVisualMediaRequest$Builder;->build()Landroidx/activity/result/PickVisualMediaRequest;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    invoke-virtual {p1, p2}, Landroidx/activity/result/ActivityResultLauncher;->launch(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public final u(Landroid/net/Uri;ZLhd/l;)V
    .locals 1

    .line 1
    const-string v0, "uri"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "successCallback"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lvb/g;

    .line 12
    .line 13
    invoke-direct {v0, p0, p1, p2, p3}, Lvb/g;-><init>(Lvb/l;Landroid/net/Uri;ZLhd/l;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0}, Lvb/l;->l(Lhd/a;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method
