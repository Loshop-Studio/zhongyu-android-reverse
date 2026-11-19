.class public final Lm7/n;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroidx/fragment/app/Fragment;

.field public final b:Landroidx/activity/ComponentActivity;

.field public c:Lkotlin/jvm/functions/Function1;

.field public final d:Landroidx/activity/result/ActivityResultLauncher;

.field public e:Lkotlin/jvm/functions/Function1;

.field public final f:Landroidx/activity/result/ActivityResultLauncher;

.field public g:Lkotlin/jvm/functions/Function1;

.field public final h:Landroidx/activity/result/ActivityResultLauncher;

.field public i:Lkotlin/jvm/functions/Function1;

.field public final j:Landroidx/activity/result/ActivityResultLauncher;

.field public k:Lkotlin/jvm/functions/Function0;

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
    iput-object v1, v0, Lm7/n;->a:Landroidx/fragment/app/Fragment;

    move-object/from16 v1, p2

    .line 3
    iput-object v1, v0, Lm7/n;->b:Landroidx/activity/ComponentActivity;

    .line 4
    new-instance v1, Lcom/zykj/view/ui/camera/EzyCameraContract$StartCameraForResult;

    invoke-direct {v1}, Lcom/zykj/view/ui/camera/EzyCameraContract$StartCameraForResult;-><init>()V

    .line 5
    new-instance v2, Lm7/d;

    invoke-direct {v2, v0}, Lm7/d;-><init>(Lm7/n;)V

    invoke-virtual {v0, v1, v2}, Lm7/n;->p(Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/ActivityResultLauncher;

    move-result-object v1

    iput-object v1, v0, Lm7/n;->d:Landroidx/activity/result/ActivityResultLauncher;

    .line 6
    new-instance v1, Landroidx/activity/result/contract/ActivityResultContracts$TakePicture;

    invoke-direct {v1}, Landroidx/activity/result/contract/ActivityResultContracts$TakePicture;-><init>()V

    .line 7
    new-instance v2, Lm7/e;

    invoke-direct {v2, v0}, Lm7/e;-><init>(Lm7/n;)V

    invoke-virtual {v0, v1, v2}, Lm7/n;->p(Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/ActivityResultLauncher;

    move-result-object v1

    iput-object v1, v0, Lm7/n;->f:Landroidx/activity/result/ActivityResultLauncher;

    .line 8
    new-instance v1, Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia;

    invoke-direct {v1}, Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia;-><init>()V

    .line 9
    new-instance v2, Lm7/f;

    invoke-direct {v2, v0}, Lm7/f;-><init>(Lm7/n;)V

    invoke-virtual {v0, v1, v2}, Lm7/n;->p(Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/ActivityResultLauncher;

    move-result-object v1

    iput-object v1, v0, Lm7/n;->h:Landroidx/activity/result/ActivityResultLauncher;

    .line 10
    new-instance v1, Lcom/zykj/view/ui/crop/EzyCropContract$StartCropForResult;

    invoke-direct {v1}, Lcom/zykj/view/ui/crop/EzyCropContract$StartCropForResult;-><init>()V

    .line 11
    new-instance v2, Lm7/g;

    invoke-direct {v2, v0}, Lm7/g;-><init>(Lm7/n;)V

    invoke-virtual {v0, v1, v2}, Lm7/n;->p(Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/ActivityResultLauncher;

    move-result-object v1

    iput-object v1, v0, Lm7/n;->j:Landroidx/activity/result/ActivityResultLauncher;

    .line 12
    new-instance v1, Landroidx/activity/result/contract/ActivityResultContracts$RequestPermission;

    invoke-direct {v1}, Landroidx/activity/result/contract/ActivityResultContracts$RequestPermission;-><init>()V

    .line 13
    new-instance v2, Lm7/h;

    invoke-direct {v2, v0}, Lm7/h;-><init>(Lm7/n;)V

    invoke-virtual {v0, v1, v2}, Lm7/n;->p(Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/ActivityResultLauncher;

    move-result-object v1

    iput-object v1, v0, Lm7/n;->l:Landroidx/activity/result/ActivityResultLauncher;

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

    invoke-direct/range {v2 .. v76}, Lcom/canhub/cropper/CropImageOptions;-><init>(ZZLcom/canhub/cropper/CropImageView$CropShape;Lcom/canhub/cropper/CropImageView$CropCornerShape;FFFLcom/canhub/cropper/CropImageView$Guidelines;Lcom/canhub/cropper/CropImageView$ScaleType;ZZZIZZZZIFZIIFIFFFIIFIIIIIIIILjava/lang/CharSequence;ILjava/lang/Integer;Landroid/net/Uri;Landroid/graphics/Bitmap$CompressFormat;IIILcom/canhub/cropper/CropImageView$RequestSizeOptions;ZLandroid/graphics/Rect;IZZZIZZLjava/lang/CharSequence;IZZLjava/lang/String;Ljava/util/List;FILjava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v1, 0x1

    .line 15
    iput-boolean v1, v2, Lcom/canhub/cropper/CropImageOptions;->n:Z

    .line 16
    iput-boolean v1, v2, Lcom/canhub/cropper/CropImageOptions;->o:Z

    .line 17
    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->getApp()Landroid/app/Application;

    move-result-object v1

    sget v3, Lcom/zykj/view/R$color;->colorPrimary:I

    invoke-virtual {v1, v3}, Landroid/content/Context;->getColor(I)I

    move-result v1

    iput v1, v2, Lcom/canhub/cropper/CropImageOptions;->x:I

    .line 18
    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->getApp()Landroid/app/Application;

    move-result-object v1

    sget v3, Lcom/zykj/view/R$color;->colorPrimary:I

    invoke-virtual {v1, v3}, Landroid/content/Context;->getColor(I)I

    move-result v1

    iput v1, v2, Lcom/canhub/cropper/CropImageOptions;->B:I

    .line 19
    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->getApp()Landroid/app/Application;

    move-result-object v1

    sget v3, Lcom/zykj/view/R$color;->colorPrimary:I

    invoke-virtual {v1, v3}, Landroid/content/Context;->getColor(I)I

    move-result v1

    iput v1, v2, Lcom/canhub/cropper/CropImageOptions;->m:I

    const v1, 0x3dcccccd    # 0.1f

    .line 20
    iput v1, v2, Lcom/canhub/cropper/CropImageOptions;->s:F

    .line 21
    iput-object v2, v0, Lm7/n;->m:Lcom/canhub/cropper/CropImageOptions;

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/fragment/app/Fragment;Landroidx/activity/ComponentActivity;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
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
    invoke-direct {p0, p1, p2}, Lm7/n;-><init>(Landroidx/fragment/app/Fragment;Landroidx/activity/ComponentActivity;)V

    return-void
.end method

.method public static final A(ZLm7/n;Landroid/net/Uri;Lcom/zykj/view/ui/crop/EzyCropTheme;Lkotlin/jvm/functions/Function1;Z)Lkotlin/Unit;
    .locals 0

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    new-instance p0, Lm7/m;

    .line 6
    .line 7
    invoke-direct {p0, p2, p4}, Lm7/m;-><init>(Landroid/net/Uri;Lkotlin/jvm/functions/Function1;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1, p2, p3, p0}, Lm7/n;->q(Landroid/net/Uri;Lcom/zykj/view/ui/crop/EzyCropTheme;Lkotlin/jvm/functions/Function1;)V

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    invoke-interface {p4, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    invoke-interface {p4, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    :goto_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 23
    .line 24
    return-object p0
.end method

.method public static final B(Landroid/net/Uri;Lkotlin/jvm/functions/Function1;Landroid/net/Uri;)Lkotlin/Unit;
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
    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 12
    .line 13
    return-object p0
.end method

.method public static final C(Lm7/n;Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lm7/n;->e:Lkotlin/jvm/functions/Function1;

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
    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    :cond_0
    const/4 p1, 0x0

    .line 13
    iput-object p1, p0, Lm7/n;->e:Lkotlin/jvm/functions/Function1;

    .line 14
    .line 15
    return-void
.end method

.method public static synthetic a(ZLm7/n;Landroid/net/Uri;Lcom/zykj/view/ui/crop/EzyCropTheme;Lkotlin/jvm/functions/Function1;Z)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Lm7/n;->A(ZLm7/n;Landroid/net/Uri;Lcom/zykj/view/ui/crop/EzyCropTheme;Lkotlin/jvm/functions/Function1;Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lm7/n;Landroid/net/Uri;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lm7/n;->n(Lm7/n;Landroid/net/Uri;)V

    return-void
.end method

.method public static synthetic c(Lm7/n;Z)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lm7/n;->o(Lm7/n;Z)V

    return-void
.end method

.method public static synthetic d(Lm7/n;Landroid/net/Uri;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lm7/n;->k(Lm7/n;Landroid/net/Uri;)V

    return-void
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function1;Landroid/net/Uri;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lm7/n;->s(Lkotlin/jvm/functions/Function1;Landroid/net/Uri;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lm7/n;Landroid/net/Uri;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lm7/n;->m(Lm7/n;Landroid/net/Uri;)V

    return-void
.end method

.method public static synthetic g(Lm7/n;Z)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lm7/n;->C(Lm7/n;Z)V

    return-void
.end method

.method public static synthetic h(Lm7/n;Landroid/net/Uri;ZLcom/zykj/view/ui/crop/EzyCropTheme;Lkotlin/jvm/functions/Function1;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lm7/n;->z(Lm7/n;Landroid/net/Uri;ZLcom/zykj/view/ui/crop/EzyCropTheme;Lkotlin/jvm/functions/Function1;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Landroid/net/Uri;Lkotlin/jvm/functions/Function1;Landroid/net/Uri;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lm7/n;->B(Landroid/net/Uri;Lkotlin/jvm/functions/Function1;Landroid/net/Uri;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(ZLm7/n;Lcom/zykj/view/ui/crop/EzyCropTheme;Lkotlin/jvm/functions/Function1;Landroid/net/Uri;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lm7/n;->v(ZLm7/n;Lcom/zykj/view/ui/crop/EzyCropTheme;Lkotlin/jvm/functions/Function1;Landroid/net/Uri;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final k(Lm7/n;Landroid/net/Uri;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lm7/n;->c:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    :cond_0
    const/4 p1, 0x0

    .line 9
    iput-object p1, p0, Lm7/n;->c:Lkotlin/jvm/functions/Function1;

    .line 10
    .line 11
    return-void
.end method

.method public static final m(Lm7/n;Landroid/net/Uri;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lm7/n;->i:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    :cond_0
    const/4 p1, 0x0

    .line 9
    iput-object p1, p0, Lm7/n;->i:Lkotlin/jvm/functions/Function1;

    .line 10
    .line 11
    return-void
.end method

.method public static final n(Lm7/n;Landroid/net/Uri;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lm7/n;->g:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    :cond_0
    const/4 p1, 0x0

    .line 9
    iput-object p1, p0, Lm7/n;->g:Lkotlin/jvm/functions/Function1;

    .line 10
    .line 11
    return-void
.end method

.method public static final o(Lm7/n;Z)V
    .locals 0

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object p1, p0, Lm7/n;->k:Lkotlin/jvm/functions/Function0;

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    :cond_0
    const/4 p1, 0x0

    .line 11
    iput-object p1, p0, Lm7/n;->k:Lkotlin/jvm/functions/Function0;

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

.method public static final s(Lkotlin/jvm/functions/Function1;Landroid/net/Uri;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 5
    .line 6
    return-object p0
.end method

.method public static final v(ZLm7/n;Lcom/zykj/view/ui/crop/EzyCropTheme;Lkotlin/jvm/functions/Function1;Landroid/net/Uri;)Lkotlin/Unit;
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1, p4, p2, p3}, Lm7/n;->q(Landroid/net/Uri;Lcom/zykj/view/ui/crop/EzyCropTheme;Lkotlin/jvm/functions/Function1;)V

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    invoke-interface {p3, p4}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    :goto_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 13
    .line 14
    return-object p0
.end method

.method public static synthetic y(Lm7/n;Landroid/net/Uri;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p5, p4, 0x1

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lm7/o;->a()Landroid/net/Uri;

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
    invoke-virtual {p0, p1, p2, p3}, Lm7/n;->x(Landroid/net/Uri;ZLkotlin/jvm/functions/Function1;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public static final z(Lm7/n;Landroid/net/Uri;ZLcom/zykj/view/ui/crop/EzyCropTheme;Lkotlin/jvm/functions/Function1;)Lkotlin/Unit;
    .locals 6

    .line 1
    new-instance v0, Lm7/k;

    .line 2
    .line 3
    move-object v2, p0

    .line 4
    move-object v3, p1

    .line 5
    move v1, p2

    .line 6
    move-object v4, p3

    .line 7
    move-object v5, p4

    .line 8
    invoke-direct/range {v0 .. v5}, Lm7/k;-><init>(ZLm7/n;Landroid/net/Uri;Lcom/zykj/view/ui/crop/EzyCropTheme;Lkotlin/jvm/functions/Function1;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, v2, Lm7/n;->e:Lkotlin/jvm/functions/Function1;

    .line 12
    .line 13
    iget-object p0, v2, Lm7/n;->f:Landroidx/activity/result/ActivityResultLauncher;

    .line 14
    .line 15
    invoke-virtual {p0, v3}, Landroidx/activity/result/ActivityResultLauncher;->launch(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 19
    .line 20
    return-object p0
.end method


# virtual methods
.method public final l(Lkotlin/jvm/functions/Function0;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lm7/n;->k:Lkotlin/jvm/functions/Function0;

    .line 2
    .line 3
    iget-object p1, p0, Lm7/n;->l:Landroidx/activity/result/ActivityResultLauncher;

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
    iget-object v0, p0, Lm7/n;->a:Landroidx/fragment/app/Fragment;

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
    iget-object v0, p0, Lm7/n;->b:Landroidx/activity/ComponentActivity;

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

.method public final q(Landroid/net/Uri;Lcom/zykj/view/ui/crop/EzyCropTheme;Lkotlin/jvm/functions/Function1;)V
    .locals 2

    .line 1
    const-string v0, "uri"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "cropTheme"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "successCallback"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance v0, Lm7/j;

    .line 17
    .line 18
    invoke-direct {v0, p3}, Lm7/j;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Lm7/n;->i:Lkotlin/jvm/functions/Function1;

    .line 22
    .line 23
    iget-object p3, p0, Lm7/n;->j:Landroidx/activity/result/ActivityResultLauncher;

    .line 24
    .line 25
    new-instance v0, Ll7/d;

    .line 26
    .line 27
    iget-object v1, p0, Lm7/n;->m:Lcom/canhub/cropper/CropImageOptions;

    .line 28
    .line 29
    invoke-direct {v0, p1, v1, p2}, Ll7/d;-><init>(Landroid/net/Uri;Lcom/canhub/cropper/CropImageOptions;Lcom/zykj/view/ui/crop/EzyCropTheme;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p3, v0}, Landroidx/activity/result/ActivityResultLauncher;->launch(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public final r(Landroid/net/Uri;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    const-string v0, "uri"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "successCallback"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, Lcom/zykj/view/ui/crop/EzyCropTheme;->a:Lcom/zykj/view/ui/crop/EzyCropTheme;

    .line 12
    .line 13
    invoke-virtual {p0, p1, v0, p2}, Lm7/n;->q(Landroid/net/Uri;Lcom/zykj/view/ui/crop/EzyCropTheme;Lkotlin/jvm/functions/Function1;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final t(ZLcom/zykj/view/ui/crop/EzyCropTheme;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    const-string v0, "cropTheme"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "successCallback"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lm7/l;

    .line 12
    .line 13
    invoke-direct {v0, p1, p0, p2, p3}, Lm7/l;-><init>(ZLm7/n;Lcom/zykj/view/ui/crop/EzyCropTheme;Lkotlin/jvm/functions/Function1;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lm7/n;->g:Lkotlin/jvm/functions/Function1;

    .line 17
    .line 18
    iget-object p1, p0, Lm7/n;->h:Landroidx/activity/result/ActivityResultLauncher;

    .line 19
    .line 20
    new-instance p2, Landroidx/activity/result/PickVisualMediaRequest$Builder;

    .line 21
    .line 22
    invoke-direct {p2}, Landroidx/activity/result/PickVisualMediaRequest$Builder;-><init>()V

    .line 23
    .line 24
    .line 25
    sget-object p3, Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$ImageOnly;->INSTANCE:Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$ImageOnly;

    .line 26
    .line 27
    invoke-virtual {p2, p3}, Landroidx/activity/result/PickVisualMediaRequest$Builder;->setMediaType(Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;)Landroidx/activity/result/PickVisualMediaRequest$Builder;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    invoke-virtual {p2}, Landroidx/activity/result/PickVisualMediaRequest$Builder;->build()Landroidx/activity/result/PickVisualMediaRequest;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    invoke-virtual {p1, p2}, Landroidx/activity/result/ActivityResultLauncher;->launch(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final u(ZLkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    const-string v0, "successCallback"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lcom/zykj/view/ui/crop/EzyCropTheme;->a:Lcom/zykj/view/ui/crop/EzyCropTheme;

    .line 7
    .line 8
    invoke-virtual {p0, p1, v0, p2}, Lm7/n;->t(ZLcom/zykj/view/ui/crop/EzyCropTheme;Lkotlin/jvm/functions/Function1;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final w(Landroid/net/Uri;ZLcom/zykj/view/ui/crop/EzyCropTheme;Lkotlin/jvm/functions/Function1;)V
    .locals 7

    .line 1
    const-string v0, "uri"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "cropTheme"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "successCallback"

    .line 12
    .line 13
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance v1, Lm7/i;

    .line 17
    .line 18
    move-object v2, p0

    .line 19
    move-object v3, p1

    .line 20
    move v4, p2

    .line 21
    move-object v5, p3

    .line 22
    move-object v6, p4

    .line 23
    invoke-direct/range {v1 .. v6}, Lm7/i;-><init>(Lm7/n;Landroid/net/Uri;ZLcom/zykj/view/ui/crop/EzyCropTheme;Lkotlin/jvm/functions/Function1;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, v1}, Lm7/n;->l(Lkotlin/jvm/functions/Function0;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final x(Landroid/net/Uri;ZLkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    const-string v0, "uri"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "successCallback"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, Lcom/zykj/view/ui/crop/EzyCropTheme;->a:Lcom/zykj/view/ui/crop/EzyCropTheme;

    .line 12
    .line 13
    invoke-virtual {p0, p1, p2, v0, p3}, Lm7/n;->w(Landroid/net/Uri;ZLcom/zykj/view/ui/crop/EzyCropTheme;Lkotlin/jvm/functions/Function1;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
