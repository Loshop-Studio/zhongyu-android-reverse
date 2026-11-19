.class public final Lcom/zykj/view/ui/crop/EzyCropActivity;
.super Landroidx/appcompat/app/AppCompatActivity;
.source "SourceFile"

# interfaces
.implements Lcom/canhub/cropper/CropImageView$g;
.implements Lcom/canhub/cropper/CropImageView$c;


# instance fields
.field public a:Z

.field public b:Lcom/zykj/view/databinding/ViewActivityEzyCropBinding;


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

.method public static synthetic m(Lcom/zykj/view/ui/crop/EzyCropActivity;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/ui/crop/EzyCropActivity;->t(Lcom/zykj/view/ui/crop/EzyCropActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic n(Lcom/zykj/view/ui/crop/EzyCropActivity;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/ui/crop/EzyCropActivity;->s(Lcom/zykj/view/ui/crop/EzyCropActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic o(Lcom/zykj/view/ui/crop/EzyCropActivity;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/ui/crop/EzyCropActivity;->u(Lcom/zykj/view/ui/crop/EzyCropActivity;Landroid/view/View;)V

    return-void
.end method

.method public static final s(Lcom/zykj/view/ui/crop/EzyCropActivity;Landroid/view/View;)V
    .locals 9

    .line 1
    iget-object p1, p0, Lcom/zykj/view/ui/crop/EzyCropActivity;->b:Lcom/zykj/view/databinding/ViewActivityEzyCropBinding;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    const-string p1, "mBinding"

    .line 6
    .line 7
    invoke-static {p1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    :cond_0
    iget-object v0, p1, Lcom/zykj/view/databinding/ViewActivityEzyCropBinding;->c:Lcom/canhub/cropper/CropImageView;

    .line 12
    .line 13
    iget-boolean p0, p0, Lcom/zykj/view/ui/crop/EzyCropActivity;->a:Z

    .line 14
    .line 15
    if-nez p0, :cond_1

    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    new-array p0, p0, [Ljava/lang/Object;

    .line 19
    .line 20
    const-string p1, "\u56fe\u7247\u5c1a\u672a\u52a0\u8f7d\u5b8c\u6210"

    .line 21
    .line 22
    invoke-static {p1, p0}, Lcom/blankj/utilcode/util/ToastUtils;->s(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_1
    invoke-static {}, La6/m;->a()Landroid/net/Uri;

    .line 27
    .line 28
    .line 29
    move-result-object v6

    .line 30
    const/16 v7, 0x1f

    .line 31
    .line 32
    const/4 v8, 0x0

    .line 33
    const/4 v1, 0x0

    .line 34
    const/4 v2, 0x0

    .line 35
    const/4 v3, 0x0

    .line 36
    const/4 v4, 0x0

    .line 37
    const/4 v5, 0x0

    .line 38
    invoke-static/range {v0 .. v8}, Lcom/canhub/cropper/CropImageView;->e(Lcom/canhub/cropper/CropImageView;Landroid/graphics/Bitmap$CompressFormat;IIILcom/canhub/cropper/CropImageView$RequestSizeOptions;Landroid/net/Uri;ILjava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public static final t(Lcom/zykj/view/ui/crop/EzyCropActivity;Landroid/view/View;)V
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

.method public static final u(Lcom/zykj/view/ui/crop/EzyCropActivity;Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/view/ui/crop/EzyCropActivity;->b:Lcom/zykj/view/databinding/ViewActivityEzyCropBinding;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const-string p0, "mBinding"

    .line 6
    .line 7
    invoke-static {p0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/4 p0, 0x0

    .line 11
    :cond_0
    iget-object p0, p0, Lcom/zykj/view/databinding/ViewActivityEzyCropBinding;->c:Lcom/canhub/cropper/CropImageView;

    .line 12
    .line 13
    const/16 p1, -0x5a

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Lcom/canhub/cropper/CropImageView;->n(I)V

    .line 16
    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public a(Lcom/canhub/cropper/CropImageView;Lcom/canhub/cropper/CropImageView$b;)V
    .locals 1

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "result"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

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
    invoke-virtual {p2}, Lcom/canhub/cropper/CropImageView$b;->j()Landroid/net/Uri;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    invoke-virtual {p1, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 23
    .line 24
    .line 25
    sget-object p2, Lh7/p;->a:Lh7/p;

    .line 26
    .line 27
    const/4 p2, -0x1

    .line 28
    invoke-virtual {p0, p2, p1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public b(Lcom/canhub/cropper/CropImageView;Landroid/net/Uri;Ljava/lang/Exception;)V
    .locals 1

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "uri"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    if-nez p3, :cond_0

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    iput-boolean p1, p0, Lcom/zykj/view/ui/crop/EzyCropActivity;->a:Z

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
    invoke-static {p2, p1}, Lcom/blankj/utilcode/util/ToastUtils;->s(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/FragmentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    # RE layout layout/view_activity_ezy_crop (0x7f0c014f), APK res/SW.xml
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
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    check-cast p1, Lcom/zykj/view/databinding/ViewActivityEzyCropBinding;

    .line 16
    .line 17
    iput-object p1, p0, Lcom/zykj/view/ui/crop/EzyCropActivity;->b:Lcom/zykj/view/databinding/ViewActivityEzyCropBinding;

    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/zykj/view/ui/crop/EzyCropActivity;->r()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Lcom/zykj/view/ui/crop/EzyCropActivity;->v()V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public final p()Lcom/canhub/cropper/CropImageOptions;
    .locals 76

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
    const/16 v74, 0x3f

    .line 22
    .line 23
    const/16 v75, 0x0

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
    const/16 v41, 0x0

    .line 90
    .line 91
    const/16 v42, 0x0

    .line 92
    .line 93
    const/16 v43, 0x0

    .line 94
    .line 95
    const/16 v44, 0x0

    .line 96
    .line 97
    const/16 v45, 0x0

    .line 98
    .line 99
    const/16 v46, 0x0

    .line 100
    .line 101
    const/16 v47, 0x0

    .line 102
    .line 103
    const/16 v48, 0x0

    .line 104
    .line 105
    const/16 v49, 0x0

    .line 106
    .line 107
    const/16 v50, 0x0

    .line 108
    .line 109
    const/16 v51, 0x0

    .line 110
    .line 111
    const/16 v52, 0x0

    .line 112
    .line 113
    const/16 v53, 0x0

    .line 114
    .line 115
    const/16 v54, 0x0

    .line 116
    .line 117
    const/16 v55, 0x0

    .line 118
    .line 119
    const/16 v56, 0x0

    .line 120
    .line 121
    const/16 v57, 0x0

    .line 122
    .line 123
    const/16 v58, 0x0

    .line 124
    .line 125
    const/16 v59, 0x0

    .line 126
    .line 127
    const/16 v60, 0x0

    .line 128
    .line 129
    const/16 v61, 0x0

    .line 130
    .line 131
    const/16 v62, 0x0

    .line 132
    .line 133
    const/16 v63, 0x0

    .line 134
    .line 135
    const/16 v64, 0x0

    .line 136
    .line 137
    const/16 v65, 0x0

    .line 138
    .line 139
    const/16 v66, 0x0

    .line 140
    .line 141
    const/16 v67, 0x0

    .line 142
    .line 143
    const/16 v68, 0x0

    .line 144
    .line 145
    const/16 v69, 0x0

    .line 146
    .line 147
    const/16 v70, 0x0

    .line 148
    .line 149
    const/16 v71, 0x0

    .line 150
    .line 151
    const/16 v72, -0x1

    .line 152
    .line 153
    const/16 v73, -0x1

    .line 154
    .line 155
    invoke-direct/range {v1 .. v75}, Lcom/canhub/cropper/CropImageOptions;-><init>(ZZLcom/canhub/cropper/CropImageView$CropShape;Lcom/canhub/cropper/CropImageView$CropCornerShape;FFFLcom/canhub/cropper/CropImageView$Guidelines;Lcom/canhub/cropper/CropImageView$ScaleType;ZZZIZZZZIFZIIFIFFFIIFIIIIIIIILjava/lang/CharSequence;ILjava/lang/Integer;Landroid/net/Uri;Landroid/graphics/Bitmap$CompressFormat;IIILcom/canhub/cropper/CropImageView$RequestSizeOptions;ZLandroid/graphics/Rect;IZZZIZZLjava/lang/CharSequence;IZZLjava/lang/String;Ljava/util/List;FILjava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIILkotlin/jvm/internal/n;)V

    .line 156
    .line 157
    .line 158
    return-object v1
.end method

.method public final q()Landroid/net/Uri;
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

.method public final r()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/view/ui/crop/EzyCropActivity;->b:Lcom/zykj/view/databinding/ViewActivityEzyCropBinding;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "mBinding"

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    move-object v0, v1

    .line 12
    :cond_0
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewActivityEzyCropBinding;->b:Landroid/widget/ImageView;

    .line 13
    .line 14
    new-instance v3, Lz5/a;

    .line 15
    .line 16
    invoke-direct {v3, p0}, Lz5/a;-><init>(Lcom/zykj/view/ui/crop/EzyCropActivity;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lcom/zykj/view/ui/crop/EzyCropActivity;->b:Lcom/zykj/view/databinding/ViewActivityEzyCropBinding;

    .line 23
    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    move-object v0, v1

    .line 30
    :cond_1
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewActivityEzyCropBinding;->a:Landroid/widget/ImageView;

    .line 31
    .line 32
    new-instance v3, Lz5/b;

    .line 33
    .line 34
    invoke-direct {v3, p0}, Lz5/b;-><init>(Lcom/zykj/view/ui/crop/EzyCropActivity;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 38
    .line 39
    .line 40
    iget-object v0, p0, Lcom/zykj/view/ui/crop/EzyCropActivity;->b:Lcom/zykj/view/databinding/ViewActivityEzyCropBinding;

    .line 41
    .line 42
    if-nez v0, :cond_2

    .line 43
    .line 44
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    move-object v1, v0

    .line 49
    :goto_0
    iget-object v0, v1, Lcom/zykj/view/databinding/ViewActivityEzyCropBinding;->e:Landroid/widget/ImageView;

    .line 50
    .line 51
    new-instance v1, Lz5/c;

    .line 52
    .line 53
    invoke-direct {v1, p0}, Lz5/c;-><init>(Lcom/zykj/view/ui/crop/EzyCropActivity;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 57
    .line 58
    .line 59
    return-void
.end method

.method public final v()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/zykj/view/ui/crop/EzyCropActivity;->a:Z

    .line 3
    .line 4
    iget-object v0, p0, Lcom/zykj/view/ui/crop/EzyCropActivity;->b:Lcom/zykj/view/databinding/ViewActivityEzyCropBinding;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    const-string v0, "mBinding"

    .line 9
    .line 10
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    :cond_0
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewActivityEzyCropBinding;->c:Lcom/canhub/cropper/CropImageView;

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/zykj/view/ui/crop/EzyCropActivity;->p()Lcom/canhub/cropper/CropImageOptions;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v0, v1}, Lcom/canhub/cropper/CropImageView;->setImageCropOptions(Lcom/canhub/cropper/CropImageOptions;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, p0}, Lcom/canhub/cropper/CropImageView;->setOnSetImageUriCompleteListener(Lcom/canhub/cropper/CropImageView$g;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, p0}, Lcom/canhub/cropper/CropImageView;->setOnCropImageCompleteListener(Lcom/canhub/cropper/CropImageView$c;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Lcom/zykj/view/ui/crop/EzyCropActivity;->q()Landroid/net/Uri;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v0, v1}, Lcom/canhub/cropper/CropImageView;->setImageUriAsync(Landroid/net/Uri;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method
