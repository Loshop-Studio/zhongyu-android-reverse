.class public Lcom/canhub/cropper/CropImageActivity;
.super Landroidx/appcompat/app/AppCompatActivity;
.source "SourceFile"

# interfaces
.implements Lcom/canhub/cropper/z;
.implements Lcom/canhub/cropper/v;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/canhub/cropper/CropImageActivity$Source;
    }
.end annotation

.annotation runtime Lkotlin/Deprecated;
    message = "\n  Create your own Activity and use the CropImageView directly.\n  This way you can customize everything and have utter control of everything.\n  Feel free to use this Activity Code to create your own Activity.\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/canhub/cropper/CropImageActivity;",
        "Landroidx/appcompat/app/AppCompatActivity;",
        "Lcom/canhub/cropper/z;",
        "Lcom/canhub/cropper/v;",
        "<init>",
        "()V",
        "Source",
        "cropper_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nCropImageActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CropImageActivity.kt\ncom/canhub/cropper/CropImageActivity\n+ 2 ParcelableUtils.kt\ncom/canhub/cropper/ParcelableUtilsKt\n+ 3 Uri.kt\nandroidx/core/net/UriKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,488:1\n7#2,5:489\n7#2,5:494\n29#3:499\n1#4:500\n*S KotlinDebug\n*F\n+ 1 CropImageActivity.kt\ncom/canhub/cropper/CropImageActivity\n*L\n73#1:489,5\n75#1:494,5\n94#1:499\n*E\n"
    }
.end annotation


# static fields
.field public static final synthetic h:I


# instance fields
.field public a:Landroid/net/Uri;

.field public b:Lcom/canhub/cropper/CropImageOptions;

.field public c:Lcom/canhub/cropper/CropImageView;

.field public d:Lcom/canhub/cropper/databinding/CropImageActivityBinding;

.field public e:Landroid/net/Uri;

.field public final f:Landroidx/activity/result/ActivityResultLauncher;

.field public final g:Landroidx/activity/result/ActivityResultLauncher;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroidx/activity/result/contract/ActivityResultContracts$GetContent;

    .line 5
    .line 6
    invoke-direct {v0}, Landroidx/activity/result/contract/ActivityResultContracts$GetContent;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance v1, Lcom/canhub/cropper/n;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-direct {v1, p0, v2}, Lcom/canhub/cropper/n;-><init>(Lcom/canhub/cropper/CropImageActivity;I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v0, v1}, Landroidx/activity/ComponentActivity;->registerForActivityResult(Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/ActivityResultLauncher;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iput-object v0, p0, Lcom/canhub/cropper/CropImageActivity;->f:Landroidx/activity/result/ActivityResultLauncher;

    .line 20
    .line 21
    new-instance v0, Landroidx/activity/result/contract/ActivityResultContracts$TakePicture;

    .line 22
    .line 23
    invoke-direct {v0}, Landroidx/activity/result/contract/ActivityResultContracts$TakePicture;-><init>()V

    .line 24
    .line 25
    .line 26
    new-instance v1, Lcom/canhub/cropper/n;

    .line 27
    .line 28
    const/4 v2, 0x1

    .line 29
    invoke-direct {v1, p0, v2}, Lcom/canhub/cropper/n;-><init>(Lcom/canhub/cropper/CropImageActivity;I)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, v0, v1}, Landroidx/activity/ComponentActivity;->registerForActivityResult(Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/ActivityResultLauncher;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iput-object v0, p0, Lcom/canhub/cropper/CropImageActivity;->g:Landroidx/activity/result/ActivityResultLauncher;

    .line 37
    .line 38
    return-void
.end method

.method public static r(Landroid/view/Menu;II)V
    .locals 1

    .line 1
    invoke-interface {p0, p1}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-interface {p0}, Landroid/view/MenuItem;->getIcon()Landroid/graphics/drawable/Drawable;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    :try_start_0
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 14
    .line 15
    .line 16
    sget-object v0, Landroidx/core/graphics/BlendModeCompat;->SRC_ATOP:Landroidx/core/graphics/BlendModeCompat;

    .line 17
    .line 18
    invoke-static {p2, v0}, Landroidx/core/graphics/BlendModeColorFilterCompat;->createBlendModeColorFilterCompat(ILandroidx/core/graphics/BlendModeCompat;)Landroid/graphics/ColorFilter;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    invoke-virtual {p1, p2}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 23
    .line 24
    .line 25
    invoke-interface {p0, p1}, Landroid/view/MenuItem;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :catch_0
    move-exception p0

    .line 30
    const-string p1, "AIC"

    .line 31
    .line 32
    const-string p2, "Failed to update menu item color"

    .line 33
    .line 34
    invoke-static {p1, p2, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 35
    .line 36
    .line 37
    :cond_0
    return-void
.end method


# virtual methods
.method public final o()V
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/canhub/cropper/CropImageActivity;->b:Lcom/canhub/cropper/CropImageOptions;

    .line 2
    .line 3
    const-string v1, "cropImageOptions"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v0, :cond_8

    .line 7
    .line 8
    iget-boolean v3, v0, Lcom/canhub/cropper/CropImageOptions;->V:Z

    .line 9
    .line 10
    if-eqz v3, :cond_0

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    invoke-virtual {p0, v2, v2, v0}, Lcom/canhub/cropper/CropImageActivity;->p(Landroid/net/Uri;Ljava/lang/Exception;I)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    iget-object v3, p0, Lcom/canhub/cropper/CropImageActivity;->c:Lcom/canhub/cropper/CropImageView;

    .line 18
    .line 19
    if-eqz v3, :cond_7

    .line 20
    .line 21
    if-eqz v0, :cond_6

    .line 22
    .line 23
    iget-object v4, v0, Lcom/canhub/cropper/CropImageOptions;->Q:Landroid/graphics/Bitmap$CompressFormat;

    .line 24
    .line 25
    if-eqz v0, :cond_5

    .line 26
    .line 27
    iget v5, v0, Lcom/canhub/cropper/CropImageOptions;->R:I

    .line 28
    .line 29
    if-eqz v0, :cond_4

    .line 30
    .line 31
    iget v6, v0, Lcom/canhub/cropper/CropImageOptions;->S:I

    .line 32
    .line 33
    if-eqz v0, :cond_3

    .line 34
    .line 35
    iget v7, v0, Lcom/canhub/cropper/CropImageOptions;->T:I

    .line 36
    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    iget-object v8, v0, Lcom/canhub/cropper/CropImageOptions;->U:Lcom/canhub/cropper/CropImageView$RequestSizeOptions;

    .line 40
    .line 41
    if-eqz v0, :cond_1

    .line 42
    .line 43
    iget-object v9, v0, Lcom/canhub/cropper/CropImageOptions;->P:Landroid/net/Uri;

    .line 44
    .line 45
    invoke-virtual/range {v3 .. v9}, Lcom/canhub/cropper/CropImageView;->c(Landroid/graphics/Bitmap$CompressFormat;IIILcom/canhub/cropper/CropImageView$RequestSizeOptions;Landroid/net/Uri;)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_1
    invoke-static {v1}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw v2

    .line 53
    :cond_2
    invoke-static {v1}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw v2

    .line 57
    :cond_3
    invoke-static {v1}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw v2

    .line 61
    :cond_4
    invoke-static {v1}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw v2

    .line 65
    :cond_5
    invoke-static {v1}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw v2

    .line 69
    :cond_6
    invoke-static {v1}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    throw v2

    .line 73
    :cond_7
    return-void

    .line 74
    :cond_8
    invoke-static {v1}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    throw v2
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 49

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    invoke-super/range {p0 .. p1}, Landroidx/fragment/app/FragmentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    # RE layout layout/crop_image_activity (0x7f0c002e), APK res/st.xml
    sget v3, Lcom/canhub/cropper/R$layout;->crop_image_activity:I

    .line 13
    .line 14
    const/4 v4, 0x0

    .line 15
    const/4 v5, 0x0

    .line 16
    invoke-virtual {v2, v3, v4, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    if-eqz v2, :cond_2b

    .line 21
    .line 22
    check-cast v2, Lcom/canhub/cropper/CropImageView;

    .line 23
    .line 24
    new-instance v3, Lcom/canhub/cropper/databinding/CropImageActivityBinding;

    .line 25
    .line 26
    invoke-direct {v3, v2, v2}, Lcom/canhub/cropper/databinding/CropImageActivityBinding;-><init>(Lcom/canhub/cropper/CropImageView;Lcom/canhub/cropper/CropImageView;)V

    .line 27
    .line 28
    .line 29
    iput-object v3, v1, Lcom/canhub/cropper/CropImageActivity;->d:Lcom/canhub/cropper/databinding/CropImageActivityBinding;

    .line 30
    .line 31
    invoke-virtual {v1, v2}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(Landroid/view/View;)V

    .line 32
    .line 33
    .line 34
    iget-object v2, v1, Lcom/canhub/cropper/CropImageActivity;->d:Lcom/canhub/cropper/databinding/CropImageActivityBinding;

    .line 35
    .line 36
    const-string v3, "binding"

    .line 37
    .line 38
    if-eqz v2, :cond_2a

    .line 39
    .line 40
    iget-object v2, v2, Lcom/canhub/cropper/databinding/CropImageActivityBinding;->b:Lcom/canhub/cropper/CropImageView;

    .line 41
    .line 42
    iput-object v2, v1, Lcom/canhub/cropper/CropImageActivity;->c:Lcom/canhub/cropper/CropImageView;

    .line 43
    .line 44
    invoke-virtual {v1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    const-string v6, "CROP_IMAGE_EXTRA_BUNDLE"

    .line 49
    .line 50
    invoke-virtual {v2, v6}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    if-eqz v2, :cond_1

    .line 55
    .line 56
    const-string v6, "CROP_IMAGE_EXTRA_SOURCE"

    .line 57
    .line 58
    invoke-virtual {v2, v6}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 59
    .line 60
    .line 61
    move-result-object v6

    .line 62
    instance-of v7, v6, Landroid/net/Uri;

    .line 63
    .line 64
    if-nez v7, :cond_0

    .line 65
    .line 66
    move-object v6, v4

    .line 67
    :cond_0
    check-cast v6, Landroid/net/Uri;

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_1
    move-object v6, v4

    .line 71
    :goto_0
    iput-object v6, v1, Lcom/canhub/cropper/CropImageActivity;->a:Landroid/net/Uri;

    .line 72
    .line 73
    if-eqz v2, :cond_3

    .line 74
    .line 75
    const-string v6, "CROP_IMAGE_EXTRA_OPTIONS"

    .line 76
    .line 77
    invoke-virtual {v2, v6}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    instance-of v6, v2, Lcom/canhub/cropper/CropImageOptions;

    .line 82
    .line 83
    if-nez v6, :cond_2

    .line 84
    .line 85
    move-object v2, v4

    .line 86
    :cond_2
    check-cast v2, Lcom/canhub/cropper/CropImageOptions;

    .line 87
    .line 88
    if-nez v2, :cond_4

    .line 89
    .line 90
    :cond_3
    new-instance v6, Lcom/canhub/cropper/CropImageOptions;

    .line 91
    .line 92
    const/16 v47, -0x1

    .line 93
    .line 94
    const/16 v48, 0x3f

    .line 95
    .line 96
    const/4 v7, 0x0

    .line 97
    const/4 v8, 0x0

    .line 98
    const/4 v9, 0x0

    .line 99
    const/4 v10, 0x0

    .line 100
    const/4 v11, 0x0

    .line 101
    const/4 v12, 0x0

    .line 102
    const/4 v13, 0x0

    .line 103
    const/4 v14, 0x0

    .line 104
    const/4 v15, 0x0

    .line 105
    const/16 v16, 0x0

    .line 106
    .line 107
    const/16 v17, 0x0

    .line 108
    .line 109
    const/16 v18, 0x0

    .line 110
    .line 111
    const/16 v19, 0x0

    .line 112
    .line 113
    const/16 v20, 0x0

    .line 114
    .line 115
    const/16 v21, 0x0

    .line 116
    .line 117
    const/16 v22, 0x0

    .line 118
    .line 119
    const/16 v23, 0x0

    .line 120
    .line 121
    const/16 v24, 0x0

    .line 122
    .line 123
    const/16 v25, 0x0

    .line 124
    .line 125
    const/16 v26, 0x0

    .line 126
    .line 127
    const/16 v27, 0x0

    .line 128
    .line 129
    const/16 v28, 0x0

    .line 130
    .line 131
    const/16 v29, 0x0

    .line 132
    .line 133
    const/16 v30, 0x0

    .line 134
    .line 135
    const/16 v31, 0x0

    .line 136
    .line 137
    const/16 v32, 0x0

    .line 138
    .line 139
    const/16 v33, 0x0

    .line 140
    .line 141
    const/16 v34, 0x0

    .line 142
    .line 143
    const/16 v35, 0x0

    .line 144
    .line 145
    const/16 v36, 0x0

    .line 146
    .line 147
    const/16 v37, 0x0

    .line 148
    .line 149
    const/16 v38, 0x0

    .line 150
    .line 151
    const/16 v39, 0x0

    .line 152
    .line 153
    const/16 v40, 0x0

    .line 154
    .line 155
    const/16 v41, 0x0

    .line 156
    .line 157
    const/16 v42, 0x0

    .line 158
    .line 159
    const/16 v43, 0x0

    .line 160
    .line 161
    const/16 v44, 0x0

    .line 162
    .line 163
    const/16 v45, 0x0

    .line 164
    .line 165
    const/16 v46, -0x1

    .line 166
    .line 167
    invoke-direct/range {v6 .. v48}, Lcom/canhub/cropper/CropImageOptions;-><init>(Lcom/canhub/cropper/CropImageView$CropShape;Lcom/canhub/cropper/CropImageView$CropCornerShape;FFFLcom/canhub/cropper/CropImageView$Guidelines;Lcom/canhub/cropper/CropImageView$ScaleType;ZZZZZZIFZIIFIFFFIIFIIIIIIIIZZFILjava/lang/String;III)V

    .line 168
    .line 169
    .line 170
    move-object v2, v6

    .line 171
    :cond_4
    iput-object v2, v1, Lcom/canhub/cropper/CropImageActivity;->b:Lcom/canhub/cropper/CropImageOptions;

    .line 172
    .line 173
    const/16 v2, 0x21

    .line 174
    .line 175
    const/4 v6, 0x1

    .line 176
    const-string v7, "cropImageOptions"

    .line 177
    .line 178
    if-nez v0, :cond_1d

    .line 179
    .line 180
    iget-object v0, v1, Lcom/canhub/cropper/CropImageActivity;->a:Landroid/net/Uri;

    .line 181
    .line 182
    if-eqz v0, :cond_7

    .line 183
    .line 184
    sget-object v8, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    .line 185
    .line 186
    invoke-virtual {v0, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    move-result v0

    .line 190
    if-eqz v0, :cond_5

    .line 191
    .line 192
    goto :goto_1

    .line 193
    :cond_5
    iget-object v0, v1, Lcom/canhub/cropper/CropImageActivity;->c:Lcom/canhub/cropper/CropImageView;

    .line 194
    .line 195
    if-eqz v0, :cond_6

    .line 196
    .line 197
    iget-object v8, v1, Lcom/canhub/cropper/CropImageActivity;->a:Landroid/net/Uri;

    .line 198
    .line 199
    invoke-virtual {v0, v8}, Lcom/canhub/cropper/CropImageView;->setImageUriAsync(Landroid/net/Uri;)V

    .line 200
    .line 201
    .line 202
    :cond_6
    move-object/from16 v17, v3

    .line 203
    .line 204
    move-object/from16 v16, v4

    .line 205
    .line 206
    goto/16 :goto_d

    .line 207
    .line 208
    :cond_7
    :goto_1
    iget-object v0, v1, Lcom/canhub/cropper/CropImageActivity;->b:Lcom/canhub/cropper/CropImageOptions;

    .line 209
    .line 210
    if-eqz v0, :cond_1c

    .line 211
    .line 212
    iget-boolean v8, v0, Lcom/canhub/cropper/CropImageOptions;->j0:Z

    .line 213
    .line 214
    const-string v9, ".png"

    .line 215
    .line 216
    const-string/jumbo v10, "tmp_image_file"

    .line 217
    .line 218
    .line 219
    const-string v11, "image/*"

    .line 220
    .line 221
    if-eqz v8, :cond_18

    .line 222
    .line 223
    new-instance v8, Lcom/canhub/cropper/s;

    .line 224
    .line 225
    new-instance v0, Lo2/a;

    .line 226
    .line 227
    const/16 v12, 0x8

    .line 228
    .line 229
    invoke-direct {v0, v1, v12}, Lo2/a;-><init>(Ljava/lang/Object;I)V

    .line 230
    .line 231
    .line 232
    invoke-direct {v8, v1, v0}, Lcom/canhub/cropper/s;-><init>(Lcom/canhub/cropper/CropImageActivity;Lo2/a;)V

    .line 233
    .line 234
    .line 235
    iget-object v0, v1, Lcom/canhub/cropper/CropImageActivity;->b:Lcom/canhub/cropper/CropImageOptions;

    .line 236
    .line 237
    if-eqz v0, :cond_17

    .line 238
    .line 239
    iget-boolean v12, v0, Lcom/canhub/cropper/CropImageOptions;->b:Z

    .line 240
    .line 241
    iget-object v13, v0, Lcom/canhub/cropper/CropImageOptions;->k0:Ljava/lang/String;

    .line 242
    .line 243
    if-eqz v13, :cond_9

    .line 244
    .line 245
    invoke-static {v13}, Lkotlin/text/p;->P(Ljava/lang/CharSequence;)Z

    .line 246
    .line 247
    .line 248
    move-result v14

    .line 249
    if-nez v14, :cond_8

    .line 250
    .line 251
    goto :goto_2

    .line 252
    :cond_8
    move-object v13, v4

    .line 253
    :goto_2
    if-eqz v13, :cond_9

    .line 254
    .line 255
    iput-object v13, v8, Lcom/canhub/cropper/s;->b:Ljava/lang/String;

    .line 256
    .line 257
    :cond_9
    iget-object v13, v0, Lcom/canhub/cropper/CropImageOptions;->l0:Ljava/util/List;

    .line 258
    .line 259
    if-eqz v13, :cond_b

    .line 260
    .line 261
    invoke-interface {v13}, Ljava/util/Collection;->isEmpty()Z

    .line 262
    .line 263
    .line 264
    move-result v14

    .line 265
    if-nez v14, :cond_a

    .line 266
    .line 267
    goto :goto_3

    .line 268
    :cond_a
    move-object v13, v4

    .line 269
    :goto_3
    if-eqz v13, :cond_b

    .line 270
    .line 271
    iput-object v13, v8, Lcom/canhub/cropper/s;->c:Ljava/util/List;

    .line 272
    .line 273
    :cond_b
    if-eqz v12, :cond_c

    .line 274
    .line 275
    invoke-virtual {v1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 276
    .line 277
    .line 278
    move-result-object v13

    .line 279
    invoke-static {v10, v9, v13}, Ljava/io/File;->createTempFile(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    .line 280
    .line 281
    .line 282
    move-result-object v9

    .line 283
    invoke-virtual {v9}, Ljava/io/File;->createNewFile()Z

    .line 284
    .line 285
    .line 286
    invoke-virtual {v9}, Ljava/io/File;->deleteOnExit()V

    .line 287
    .line 288
    .line 289
    invoke-static {v1, v9}, La/a;->k(Landroid/content/Context;Ljava/io/File;)Landroid/net/Uri;

    .line 290
    .line 291
    .line 292
    move-result-object v9

    .line 293
    goto :goto_4

    .line 294
    :cond_c
    move-object v9, v4

    .line 295
    :goto_4
    iget-boolean v10, v0, Lcom/canhub/cropper/CropImageOptions;->a:Z

    .line 296
    .line 297
    iput-object v9, v8, Lcom/canhub/cropper/s;->d:Landroid/net/Uri;

    .line 298
    .line 299
    new-instance v9, Ljava/util/ArrayList;

    .line 300
    .line 301
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 302
    .line 303
    .line 304
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 305
    .line 306
    .line 307
    move-result-object v13

    .line 308
    const-string v0, "android.permission.CAMERA"

    .line 309
    .line 310
    sget v14, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 311
    .line 312
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 313
    .line 314
    .line 315
    move-result-object v15

    .line 316
    move-object/from16 v16, v4

    .line 317
    .line 318
    const/16 v4, 0x1000

    .line 319
    .line 320
    if-lt v14, v2, :cond_d

    .line 321
    .line 322
    :try_start_0
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 323
    .line 324
    .line 325
    move-result-object v14
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_1

    .line 326
    move-object/from16 v17, v3

    .line 327
    .line 328
    int-to-long v2, v4

    .line 329
    :try_start_1
    invoke-static {v2, v3}, Landroidx/core/text/util/b;->c(J)Landroid/content/pm/PackageManager$PackageInfoFlags;

    .line 330
    .line 331
    .line 332
    move-result-object v2

    .line 333
    invoke-static {v14, v15, v2}, Landroidx/core/text/util/b;->b(Landroid/content/pm/PackageManager;Ljava/lang/String;Landroid/content/pm/PackageManager$PackageInfoFlags;)Landroid/content/pm/PackageInfo;

    .line 334
    .line 335
    .line 336
    move-result-object v2

    .line 337
    goto :goto_5

    .line 338
    :catch_0
    move-exception v0

    .line 339
    goto :goto_7

    .line 340
    :catch_1
    move-exception v0

    .line 341
    move-object/from16 v17, v3

    .line 342
    .line 343
    goto :goto_7

    .line 344
    :cond_d
    move-object/from16 v17, v3

    .line 345
    .line 346
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 347
    .line 348
    .line 349
    move-result-object v2

    .line 350
    invoke-virtual {v2, v15, v4}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 351
    .line 352
    .line 353
    move-result-object v2

    .line 354
    :goto_5
    iget-object v2, v2, Landroid/content/pm/PackageInfo;->requestedPermissions:[Ljava/lang/String;

    .line 355
    .line 356
    if-eqz v2, :cond_f

    .line 357
    .line 358
    array-length v3, v2

    .line 359
    move v4, v5

    .line 360
    :goto_6
    if-ge v4, v3, :cond_f

    .line 361
    .line 362
    aget-object v14, v2, v4

    .line 363
    .line 364
    if-eqz v14, :cond_e

    .line 365
    .line 366
    invoke-virtual {v14, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 367
    .line 368
    .line 369
    move-result v14
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_0

    .line 370
    if-ne v14, v6, :cond_e

    .line 371
    .line 372
    invoke-virtual {v1, v0}, Landroid/content/Context;->checkSelfPermission(Ljava/lang/String;)I

    .line 373
    .line 374
    .line 375
    move-result v0

    .line 376
    if-eqz v0, :cond_f

    .line 377
    .line 378
    goto :goto_a

    .line 379
    :cond_e
    add-int/lit8 v4, v4, 0x1

    .line 380
    .line 381
    goto :goto_6

    .line 382
    :goto_7
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 383
    .line 384
    .line 385
    :cond_f
    if-eqz v12, :cond_12

    .line 386
    .line 387
    invoke-static {v13}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 388
    .line 389
    .line 390
    new-instance v0, Ljava/util/ArrayList;

    .line 391
    .line 392
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 393
    .line 394
    .line 395
    new-instance v2, Landroid/content/Intent;

    .line 396
    .line 397
    const-string v3, "android.media.action.IMAGE_CAPTURE"

    .line 398
    .line 399
    invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 400
    .line 401
    .line 402
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 403
    .line 404
    const/16 v4, 0x21

    .line 405
    .line 406
    if-lt v3, v4, :cond_10

    .line 407
    .line 408
    int-to-long v3, v5

    .line 409
    invoke-static {v3, v4}, Landroidx/core/text/util/b;->d(J)Landroid/content/pm/PackageManager$ResolveInfoFlags;

    .line 410
    .line 411
    .line 412
    move-result-object v3

    .line 413
    invoke-static {v13, v2, v3}, Landroidx/core/text/util/b;->h(Landroid/content/pm/PackageManager;Landroid/content/Intent;Landroid/content/pm/PackageManager$ResolveInfoFlags;)Ljava/util/List;

    .line 414
    .line 415
    .line 416
    move-result-object v3

    .line 417
    goto :goto_8

    .line 418
    :cond_10
    invoke-virtual {v13, v2, v5}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    .line 419
    .line 420
    .line 421
    move-result-object v3

    .line 422
    :goto_8
    invoke-static {v3}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 423
    .line 424
    .line 425
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 426
    .line 427
    .line 428
    move-result-object v3

    .line 429
    :goto_9
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 430
    .line 431
    .line 432
    move-result v4

    .line 433
    if-eqz v4, :cond_11

    .line 434
    .line 435
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 436
    .line 437
    .line 438
    move-result-object v4

    .line 439
    check-cast v4, Landroid/content/pm/ResolveInfo;

    .line 440
    .line 441
    new-instance v12, Landroid/content/Intent;

    .line 442
    .line 443
    invoke-direct {v12, v2}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    .line 444
    .line 445
    .line 446
    new-instance v14, Landroid/content/ComponentName;

    .line 447
    .line 448
    iget-object v15, v4, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    .line 449
    .line 450
    iget-object v6, v15, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    .line 451
    .line 452
    iget-object v15, v15, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    .line 453
    .line 454
    invoke-direct {v14, v6, v15}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 455
    .line 456
    .line 457
    invoke-virtual {v12, v14}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 458
    .line 459
    .line 460
    iget-object v6, v4, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    .line 461
    .line 462
    iget-object v6, v6, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    .line 463
    .line 464
    invoke-virtual {v12, v6}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 465
    .line 466
    .line 467
    iget-object v4, v4, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    .line 468
    .line 469
    iget-object v4, v4, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    .line 470
    .line 471
    iget-object v6, v8, Lcom/canhub/cropper/s;->d:Landroid/net/Uri;

    .line 472
    .line 473
    const/4 v14, 0x3

    .line 474
    invoke-virtual {v1, v4, v6, v14}, Landroid/content/Context;->grantUriPermission(Ljava/lang/String;Landroid/net/Uri;I)V

    .line 475
    .line 476
    .line 477
    const-string v4, "output"

    .line 478
    .line 479
    iget-object v6, v8, Lcom/canhub/cropper/s;->d:Landroid/net/Uri;

    .line 480
    .line 481
    invoke-virtual {v12, v4, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 482
    .line 483
    .line 484
    invoke-virtual {v0, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 485
    .line 486
    .line 487
    const/4 v6, 0x1

    .line 488
    goto :goto_9

    .line 489
    :cond_11
    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 490
    .line 491
    .line 492
    :cond_12
    :goto_a
    const-string v0, "android.intent.action.PICK"

    .line 493
    .line 494
    if-eqz v10, :cond_14

    .line 495
    .line 496
    invoke-static {v13}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 497
    .line 498
    .line 499
    const-string v2, "android.intent.action.GET_CONTENT"

    .line 500
    .line 501
    invoke-virtual {v8, v13, v2}, Lcom/canhub/cropper/s;->a(Landroid/content/pm/PackageManager;Ljava/lang/String;)Ljava/util/ArrayList;

    .line 502
    .line 503
    .line 504
    move-result-object v2

    .line 505
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 506
    .line 507
    .line 508
    move-result v3

    .line 509
    if-eqz v3, :cond_13

    .line 510
    .line 511
    invoke-virtual {v8, v13, v0}, Lcom/canhub/cropper/s;->a(Landroid/content/pm/PackageManager;Ljava/lang/String;)Ljava/util/ArrayList;

    .line 512
    .line 513
    .line 514
    move-result-object v2

    .line 515
    :cond_13
    invoke-virtual {v9, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 516
    .line 517
    .line 518
    :cond_14
    invoke-virtual {v9}, Ljava/util/ArrayList;->isEmpty()Z

    .line 519
    .line 520
    .line 521
    move-result v2

    .line 522
    if-eqz v2, :cond_15

    .line 523
    .line 524
    new-instance v0, Landroid/content/Intent;

    .line 525
    .line 526
    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 527
    .line 528
    .line 529
    goto :goto_b

    .line 530
    :cond_15
    new-instance v2, Landroid/content/Intent;

    .line 531
    .line 532
    const-string v3, "android.intent.action.CHOOSER"

    .line 533
    .line 534
    sget-object v4, Landroid/provider/MediaStore$Images$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    .line 535
    .line 536
    invoke-direct {v2, v3, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 537
    .line 538
    .line 539
    if-eqz v10, :cond_16

    .line 540
    .line 541
    invoke-virtual {v2, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 542
    .line 543
    .line 544
    invoke-virtual {v2, v11}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 545
    .line 546
    .line 547
    :cond_16
    move-object v0, v2

    .line 548
    :goto_b
    iget-object v2, v8, Lcom/canhub/cropper/s;->b:Ljava/lang/String;

    .line 549
    .line 550
    invoke-static {v0, v2}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    .line 551
    .line 552
    .line 553
    move-result-object v0

    .line 554
    new-array v2, v5, [Landroid/os/Parcelable;

    .line 555
    .line 556
    invoke-virtual {v9, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 557
    .line 558
    .line 559
    move-result-object v2

    .line 560
    check-cast v2, [Landroid/os/Parcelable;

    .line 561
    .line 562
    const-string v3, "android.intent.extra.INITIAL_INTENTS"

    .line 563
    .line 564
    invoke-virtual {v0, v3, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 565
    .line 566
    .line 567
    iget-object v2, v8, Lcom/canhub/cropper/s;->e:Landroidx/activity/result/ActivityResultLauncher;

    .line 568
    .line 569
    invoke-virtual {v2, v0}, Landroidx/activity/result/ActivityResultLauncher;->launch(Ljava/lang/Object;)V

    .line 570
    .line 571
    .line 572
    goto/16 :goto_d

    .line 573
    .line 574
    :cond_17
    move-object/from16 v16, v4

    .line 575
    .line 576
    invoke-static {v7}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 577
    .line 578
    .line 579
    throw v16

    .line 580
    :cond_18
    move-object/from16 v17, v3

    .line 581
    .line 582
    move-object/from16 v16, v4

    .line 583
    .line 584
    iget-boolean v2, v0, Lcom/canhub/cropper/CropImageOptions;->a:Z

    .line 585
    .line 586
    if-eqz v2, :cond_19

    .line 587
    .line 588
    iget-boolean v3, v0, Lcom/canhub/cropper/CropImageOptions;->b:Z

    .line 589
    .line 590
    if-eqz v3, :cond_19

    .line 591
    .line 592
    new-instance v0, Lcom/canhub/cropper/CropImageActivity$onCreate$1;

    .line 593
    .line 594
    invoke-direct {v0, v1}, Lcom/canhub/cropper/CropImageActivity$onCreate$1;-><init>(Ljava/lang/Object;)V

    .line 595
    .line 596
    .line 597
    new-instance v2, Landroidx/appcompat/app/AlertDialog$Builder;

    .line 598
    .line 599
    invoke-direct {v2, v1}, Landroidx/appcompat/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 600
    .line 601
    .line 602
    invoke-virtual {v2, v5}, Landroidx/appcompat/app/AlertDialog$Builder;->setCancelable(Z)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 603
    .line 604
    .line 605
    move-result-object v2

    .line 606
    new-instance v3, Lcom/canhub/cropper/o;

    .line 607
    .line 608
    invoke-direct {v3, v1}, Lcom/canhub/cropper/o;-><init>(Lcom/canhub/cropper/CropImageActivity;)V

    .line 609
    .line 610
    .line 611
    invoke-virtual {v2, v3}, Landroidx/appcompat/app/AlertDialog$Builder;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 612
    .line 613
    .line 614
    move-result-object v2

    .line 615
    sget v3, Lcom/canhub/cropper/R$string;->pick_image_chooser_title:I

    .line 616
    .line 617
    invoke-virtual {v2, v3}, Landroidx/appcompat/app/AlertDialog$Builder;->setTitle(I)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 618
    .line 619
    .line 620
    move-result-object v2

    .line 621
    sget v3, Lcom/canhub/cropper/R$string;->pick_image_camera:I

    .line 622
    .line 623
    invoke-virtual {v1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 624
    .line 625
    .line 626
    move-result-object v3

    .line 627
    sget v4, Lcom/canhub/cropper/R$string;->pick_image_gallery:I

    .line 628
    .line 629
    invoke-virtual {v1, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 630
    .line 631
    .line 632
    move-result-object v4

    .line 633
    filled-new-array {v3, v4}, [Ljava/lang/String;

    .line 634
    .line 635
    .line 636
    move-result-object v3

    .line 637
    check-cast v3, [Ljava/lang/CharSequence;

    .line 638
    .line 639
    new-instance v4, Lcom/canhub/cropper/p;

    .line 640
    .line 641
    const/4 v6, 0x0

    .line 642
    invoke-direct {v4, v0, v6}, Lcom/canhub/cropper/p;-><init>(Ljava/lang/Object;I)V

    .line 643
    .line 644
    .line 645
    invoke-virtual {v2, v3, v4}, Landroidx/appcompat/app/AlertDialog$Builder;->setItems([Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 646
    .line 647
    .line 648
    move-result-object v0

    .line 649
    invoke-virtual {v0}, Landroidx/appcompat/app/AlertDialog$Builder;->show()Landroidx/appcompat/app/AlertDialog;

    .line 650
    .line 651
    .line 652
    goto :goto_d

    .line 653
    :cond_19
    if-eqz v2, :cond_1a

    .line 654
    .line 655
    iget-object v0, v1, Lcom/canhub/cropper/CropImageActivity;->f:Landroidx/activity/result/ActivityResultLauncher;

    .line 656
    .line 657
    invoke-virtual {v0, v11}, Landroidx/activity/result/ActivityResultLauncher;->launch(Ljava/lang/Object;)V

    .line 658
    .line 659
    .line 660
    goto :goto_d

    .line 661
    :cond_1a
    iget-boolean v0, v0, Lcom/canhub/cropper/CropImageOptions;->b:Z

    .line 662
    .line 663
    if-eqz v0, :cond_1b

    .line 664
    .line 665
    invoke-virtual {v1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 666
    .line 667
    .line 668
    move-result-object v0

    .line 669
    invoke-static {v10, v9, v0}, Ljava/io/File;->createTempFile(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    .line 670
    .line 671
    .line 672
    move-result-object v0

    .line 673
    invoke-virtual {v0}, Ljava/io/File;->createNewFile()Z

    .line 674
    .line 675
    .line 676
    invoke-virtual {v0}, Ljava/io/File;->deleteOnExit()V

    .line 677
    .line 678
    .line 679
    invoke-static {v1, v0}, La/a;->k(Landroid/content/Context;Ljava/io/File;)Landroid/net/Uri;

    .line 680
    .line 681
    .line 682
    move-result-object v0

    .line 683
    iput-object v0, v1, Lcom/canhub/cropper/CropImageActivity;->e:Landroid/net/Uri;

    .line 684
    .line 685
    iget-object v2, v1, Lcom/canhub/cropper/CropImageActivity;->g:Landroidx/activity/result/ActivityResultLauncher;

    .line 686
    .line 687
    invoke-virtual {v2, v0}, Landroidx/activity/result/ActivityResultLauncher;->launch(Ljava/lang/Object;)V

    .line 688
    .line 689
    .line 690
    goto :goto_d

    .line 691
    :cond_1b
    invoke-virtual {v1}, Landroid/app/Activity;->finish()V

    .line 692
    .line 693
    .line 694
    goto :goto_d

    .line 695
    :cond_1c
    move-object/from16 v16, v4

    .line 696
    .line 697
    invoke-static {v7}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 698
    .line 699
    .line 700
    throw v16

    .line 701
    :cond_1d
    move-object/from16 v17, v3

    .line 702
    .line 703
    move-object/from16 v16, v4

    .line 704
    .line 705
    const-string v2, "bundle_key_tmp_uri"

    .line 706
    .line 707
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 708
    .line 709
    .line 710
    move-result-object v0

    .line 711
    if-eqz v0, :cond_1e

    .line 712
    .line 713
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 714
    .line 715
    .line 716
    move-result-object v0

    .line 717
    goto :goto_c

    .line 718
    :cond_1e
    move-object/from16 v0, v16

    .line 719
    .line 720
    :goto_c
    iput-object v0, v1, Lcom/canhub/cropper/CropImageActivity;->e:Landroid/net/Uri;

    .line 721
    .line 722
    :goto_d
    iget-object v0, v1, Lcom/canhub/cropper/CropImageActivity;->b:Lcom/canhub/cropper/CropImageOptions;

    .line 723
    .line 724
    if-eqz v0, :cond_29

    .line 725
    .line 726
    iget v0, v0, Lcom/canhub/cropper/CropImageOptions;->p0:I

    .line 727
    .line 728
    iget-object v2, v1, Lcom/canhub/cropper/CropImageActivity;->d:Lcom/canhub/cropper/databinding/CropImageActivityBinding;

    .line 729
    .line 730
    if-eqz v2, :cond_28

    .line 731
    .line 732
    iget-object v2, v2, Lcom/canhub/cropper/databinding/CropImageActivityBinding;->a:Lcom/canhub/cropper/CropImageView;

    .line 733
    .line 734
    invoke-virtual {v2, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 735
    .line 736
    .line 737
    invoke-virtual {v1}, Landroidx/appcompat/app/AppCompatActivity;->getSupportActionBar()Landroidx/appcompat/app/ActionBar;

    .line 738
    .line 739
    .line 740
    move-result-object v0

    .line 741
    if-eqz v0, :cond_27

    .line 742
    .line 743
    iget-object v2, v1, Lcom/canhub/cropper/CropImageActivity;->b:Lcom/canhub/cropper/CropImageOptions;

    .line 744
    .line 745
    if-eqz v2, :cond_26

    .line 746
    .line 747
    iget-object v2, v2, Lcom/canhub/cropper/CropImageOptions;->M:Ljava/lang/CharSequence;

    .line 748
    .line 749
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    .line 750
    .line 751
    .line 752
    move-result v3

    .line 753
    if-nez v3, :cond_1f

    .line 754
    .line 755
    const-string v2, ""

    .line 756
    .line 757
    :cond_1f
    invoke-virtual {v1, v2}, Landroid/app/Activity;->setTitle(Ljava/lang/CharSequence;)V

    .line 758
    .line 759
    .line 760
    const/4 v2, 0x1

    .line 761
    invoke-virtual {v0, v2}, Landroidx/appcompat/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    .line 762
    .line 763
    .line 764
    iget-object v2, v1, Lcom/canhub/cropper/CropImageActivity;->b:Lcom/canhub/cropper/CropImageOptions;

    .line 765
    .line 766
    if-eqz v2, :cond_25

    .line 767
    .line 768
    iget-object v2, v2, Lcom/canhub/cropper/CropImageOptions;->q0:Ljava/lang/Integer;

    .line 769
    .line 770
    if-eqz v2, :cond_20

    .line 771
    .line 772
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 773
    .line 774
    .line 775
    move-result v2

    .line 776
    new-instance v3, Landroid/graphics/drawable/ColorDrawable;

    .line 777
    .line 778
    invoke-direct {v3, v2}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 779
    .line 780
    .line 781
    invoke-virtual {v0, v3}, Landroidx/appcompat/app/ActionBar;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 782
    .line 783
    .line 784
    :cond_20
    iget-object v2, v1, Lcom/canhub/cropper/CropImageActivity;->b:Lcom/canhub/cropper/CropImageOptions;

    .line 785
    .line 786
    if-eqz v2, :cond_24

    .line 787
    .line 788
    iget-object v2, v2, Lcom/canhub/cropper/CropImageOptions;->r0:Ljava/lang/Integer;

    .line 789
    .line 790
    if-eqz v2, :cond_21

    .line 791
    .line 792
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 793
    .line 794
    .line 795
    move-result v2

    .line 796
    new-instance v3, Landroid/text/SpannableString;

    .line 797
    .line 798
    invoke-virtual {v1}, Landroid/app/Activity;->getTitle()Ljava/lang/CharSequence;

    .line 799
    .line 800
    .line 801
    move-result-object v4

    .line 802
    invoke-direct {v3, v4}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 803
    .line 804
    .line 805
    new-instance v4, Landroid/text/style/ForegroundColorSpan;

    .line 806
    .line 807
    invoke-direct {v4, v2}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 808
    .line 809
    .line 810
    invoke-virtual {v3}, Landroid/text/SpannableString;->length()I

    .line 811
    .line 812
    .line 813
    move-result v2

    .line 814
    const/16 v6, 0x21

    .line 815
    .line 816
    invoke-virtual {v3, v4, v5, v2, v6}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 817
    .line 818
    .line 819
    invoke-virtual {v1, v3}, Landroid/app/Activity;->setTitle(Ljava/lang/CharSequence;)V

    .line 820
    .line 821
    .line 822
    :cond_21
    iget-object v2, v1, Lcom/canhub/cropper/CropImageActivity;->b:Lcom/canhub/cropper/CropImageOptions;

    .line 823
    .line 824
    if-eqz v2, :cond_23

    .line 825
    .line 826
    iget-object v2, v2, Lcom/canhub/cropper/CropImageOptions;->s0:Ljava/lang/Integer;

    .line 827
    .line 828
    if-eqz v2, :cond_27

    .line 829
    .line 830
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 831
    .line 832
    .line 833
    move-result v2

    .line 834
    :try_start_2
    sget v3, Lcom/canhub/cropper/R$drawable;->ic_arrow_back_24:I

    .line 835
    .line 836
    invoke-static {v1, v3}, Landroidx/core/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 837
    .line 838
    .line 839
    move-result-object v3

    .line 840
    if-eqz v3, :cond_22

    .line 841
    .line 842
    new-instance v4, Landroid/graphics/PorterDuffColorFilter;

    .line 843
    .line 844
    sget-object v5, Landroid/graphics/PorterDuff$Mode;->SRC_ATOP:Landroid/graphics/PorterDuff$Mode;

    .line 845
    .line 846
    invoke-direct {v4, v2, v5}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    .line 847
    .line 848
    .line 849
    invoke-virtual {v3, v4}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 850
    .line 851
    .line 852
    goto :goto_e

    .line 853
    :catch_2
    move-exception v0

    .line 854
    goto :goto_f

    .line 855
    :cond_22
    :goto_e
    invoke-virtual {v0, v3}, Landroidx/appcompat/app/ActionBar;->setHomeAsUpIndicator(Landroid/graphics/drawable/Drawable;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 856
    .line 857
    .line 858
    goto :goto_10

    .line 859
    :goto_f
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 860
    .line 861
    .line 862
    goto :goto_10

    .line 863
    :cond_23
    invoke-static {v7}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 864
    .line 865
    .line 866
    throw v16

    .line 867
    :cond_24
    invoke-static {v7}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 868
    .line 869
    .line 870
    throw v16

    .line 871
    :cond_25
    invoke-static {v7}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 872
    .line 873
    .line 874
    throw v16

    .line 875
    :cond_26
    invoke-static {v7}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 876
    .line 877
    .line 878
    throw v16

    .line 879
    :cond_27
    :goto_10
    invoke-virtual {v1}, Landroidx/activity/ComponentActivity;->getOnBackPressedDispatcher()Landroidx/activity/OnBackPressedDispatcher;

    .line 880
    .line 881
    .line 882
    move-result-object v2

    .line 883
    new-instance v5, Landroidx/navigation/i;

    .line 884
    .line 885
    const/4 v0, 0x3

    .line 886
    invoke-direct {v5, v1, v0}, Landroidx/navigation/i;-><init>(Ljava/lang/Object;I)V

    .line 887
    .line 888
    .line 889
    const/4 v6, 0x3

    .line 890
    const/4 v7, 0x0

    .line 891
    const/4 v3, 0x0

    .line 892
    const/4 v4, 0x0

    .line 893
    invoke-static/range {v2 .. v7}, Landroidx/activity/OnBackPressedDispatcherKt;->addCallback$default(Landroidx/activity/OnBackPressedDispatcher;Landroidx/lifecycle/LifecycleOwner;ZLr6/c;ILjava/lang/Object;)Landroidx/activity/OnBackPressedCallback;

    .line 894
    .line 895
    .line 896
    return-void

    .line 897
    :cond_28
    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 898
    .line 899
    .line 900
    throw v16

    .line 901
    :cond_29
    invoke-static {v7}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 902
    .line 903
    .line 904
    throw v16

    .line 905
    :cond_2a
    move-object/from16 v17, v3

    .line 906
    .line 907
    move-object/from16 v16, v4

    .line 908
    .line 909
    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 910
    .line 911
    .line 912
    throw v16

    .line 913
    :cond_2b
    new-instance v0, Ljava/lang/NullPointerException;

    .line 914
    .line 915
    const-string/jumbo v2, "rootView"

    .line 916
    .line 917
    .line 918
    invoke-direct {v0, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 919
    .line 920
    .line 921
    throw v0
.end method

.method public final onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 11

    .line 1
    const-string v1, "AIC"

    .line 2
    .line 3
    const-string v0, "menu"

    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/canhub/cropper/CropImageActivity;->b:Lcom/canhub/cropper/CropImageOptions;

    .line 9
    .line 10
    const-string v2, "cropImageOptions"

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    if-eqz v0, :cond_14

    .line 14
    .line 15
    iget-boolean v0, v0, Lcom/canhub/cropper/CropImageOptions;->i0:Z

    .line 16
    .line 17
    const/4 v4, 0x1

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    goto/16 :goto_6

    .line 21
    .line 22
    :cond_0
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getMenuInflater()Landroid/view/MenuInflater;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    sget v5, Lcom/canhub/cropper/R$menu;->crop_image_menu:I

    .line 27
    .line 28
    invoke-virtual {v0, v5, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lcom/canhub/cropper/CropImageActivity;->b:Lcom/canhub/cropper/CropImageOptions;

    .line 32
    .line 33
    if-eqz v0, :cond_13

    .line 34
    .line 35
    iget-boolean v5, v0, Lcom/canhub/cropper/CropImageOptions;->Y:Z

    .line 36
    .line 37
    if-nez v5, :cond_1

    .line 38
    .line 39
    sget v0, Lcom/canhub/cropper/R$id;->ic_rotate_left_24:I

    .line 40
    .line 41
    invoke-interface {p1, v0}, Landroid/view/Menu;->removeItem(I)V

    .line 42
    .line 43
    .line 44
    sget v0, Lcom/canhub/cropper/R$id;->ic_rotate_right_24:I

    .line 45
    .line 46
    invoke-interface {p1, v0}, Landroid/view/Menu;->removeItem(I)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    iget-boolean v0, v0, Lcom/canhub/cropper/CropImageOptions;->c0:Z

    .line 51
    .line 52
    if-eqz v0, :cond_2

    .line 53
    .line 54
    sget v0, Lcom/canhub/cropper/R$id;->ic_rotate_left_24:I

    .line 55
    .line 56
    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-interface {v0, v4}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 61
    .line 62
    .line 63
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/canhub/cropper/CropImageActivity;->b:Lcom/canhub/cropper/CropImageOptions;

    .line 64
    .line 65
    if-eqz v0, :cond_12

    .line 66
    .line 67
    iget-boolean v0, v0, Lcom/canhub/cropper/CropImageOptions;->Z:Z

    .line 68
    .line 69
    if-nez v0, :cond_3

    .line 70
    .line 71
    sget v0, Lcom/canhub/cropper/R$id;->ic_flip_24:I

    .line 72
    .line 73
    invoke-interface {p1, v0}, Landroid/view/Menu;->removeItem(I)V

    .line 74
    .line 75
    .line 76
    :cond_3
    iget-object v0, p0, Lcom/canhub/cropper/CropImageActivity;->b:Lcom/canhub/cropper/CropImageOptions;

    .line 77
    .line 78
    if-eqz v0, :cond_11

    .line 79
    .line 80
    iget-object v0, v0, Lcom/canhub/cropper/CropImageOptions;->g0:Ljava/lang/CharSequence;

    .line 81
    .line 82
    if-eqz v0, :cond_5

    .line 83
    .line 84
    sget v0, Lcom/canhub/cropper/R$id;->crop_image_menu_crop:I

    .line 85
    .line 86
    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    iget-object v5, p0, Lcom/canhub/cropper/CropImageActivity;->b:Lcom/canhub/cropper/CropImageOptions;

    .line 91
    .line 92
    if-eqz v5, :cond_4

    .line 93
    .line 94
    iget-object v5, v5, Lcom/canhub/cropper/CropImageOptions;->g0:Ljava/lang/CharSequence;

    .line 95
    .line 96
    invoke-interface {v0, v5}, Landroid/view/MenuItem;->setTitle(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    .line 97
    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_4
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    throw v3

    .line 104
    :cond_5
    :goto_1
    :try_start_0
    iget-object v0, p0, Lcom/canhub/cropper/CropImageActivity;->b:Lcom/canhub/cropper/CropImageOptions;

    .line 105
    .line 106
    if-eqz v0, :cond_7

    .line 107
    .line 108
    iget v0, v0, Lcom/canhub/cropper/CropImageOptions;->h0:I

    .line 109
    .line 110
    if-eqz v0, :cond_6

    .line 111
    .line 112
    invoke-static {p0, v0}, Landroidx/core/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 113
    .line 114
    .line 115
    move-result-object v5
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 116
    :try_start_1
    sget v0, Lcom/canhub/cropper/R$id;->crop_image_menu_crop:I

    .line 117
    .line 118
    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    invoke-interface {v0, v5}, Landroid/view/MenuItem;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 123
    .line 124
    .line 125
    goto :goto_3

    .line 126
    :catch_0
    move-exception v0

    .line 127
    goto :goto_2

    .line 128
    :catch_1
    move-exception v0

    .line 129
    move-object v5, v3

    .line 130
    goto :goto_2

    .line 131
    :cond_6
    move-object v5, v3

    .line 132
    goto :goto_3

    .line 133
    :cond_7
    :try_start_2
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    throw v3
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 137
    :goto_2
    const-string v6, "Failed to read menu crop drawable"

    .line 138
    .line 139
    invoke-static {v1, v6, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 140
    .line 141
    .line 142
    :goto_3
    iget-object v0, p0, Lcom/canhub/cropper/CropImageActivity;->b:Lcom/canhub/cropper/CropImageOptions;

    .line 143
    .line 144
    if-eqz v0, :cond_10

    .line 145
    .line 146
    iget v0, v0, Lcom/canhub/cropper/CropImageOptions;->N:I

    .line 147
    .line 148
    if-eqz v0, :cond_b

    .line 149
    .line 150
    sget v6, Lcom/canhub/cropper/R$id;->ic_rotate_left_24:I

    .line 151
    .line 152
    invoke-static {p1, v6, v0}, Lcom/canhub/cropper/CropImageActivity;->r(Landroid/view/Menu;II)V

    .line 153
    .line 154
    .line 155
    sget v0, Lcom/canhub/cropper/R$id;->ic_rotate_right_24:I

    .line 156
    .line 157
    iget-object v6, p0, Lcom/canhub/cropper/CropImageActivity;->b:Lcom/canhub/cropper/CropImageOptions;

    .line 158
    .line 159
    if-eqz v6, :cond_a

    .line 160
    .line 161
    iget v6, v6, Lcom/canhub/cropper/CropImageOptions;->N:I

    .line 162
    .line 163
    invoke-static {p1, v0, v6}, Lcom/canhub/cropper/CropImageActivity;->r(Landroid/view/Menu;II)V

    .line 164
    .line 165
    .line 166
    sget v0, Lcom/canhub/cropper/R$id;->ic_flip_24:I

    .line 167
    .line 168
    iget-object v6, p0, Lcom/canhub/cropper/CropImageActivity;->b:Lcom/canhub/cropper/CropImageOptions;

    .line 169
    .line 170
    if-eqz v6, :cond_9

    .line 171
    .line 172
    iget v6, v6, Lcom/canhub/cropper/CropImageOptions;->N:I

    .line 173
    .line 174
    invoke-static {p1, v0, v6}, Lcom/canhub/cropper/CropImageActivity;->r(Landroid/view/Menu;II)V

    .line 175
    .line 176
    .line 177
    if-eqz v5, :cond_b

    .line 178
    .line 179
    sget v0, Lcom/canhub/cropper/R$id;->crop_image_menu_crop:I

    .line 180
    .line 181
    iget-object v5, p0, Lcom/canhub/cropper/CropImageActivity;->b:Lcom/canhub/cropper/CropImageOptions;

    .line 182
    .line 183
    if-eqz v5, :cond_8

    .line 184
    .line 185
    iget v5, v5, Lcom/canhub/cropper/CropImageOptions;->N:I

    .line 186
    .line 187
    invoke-static {p1, v0, v5}, Lcom/canhub/cropper/CropImageActivity;->r(Landroid/view/Menu;II)V

    .line 188
    .line 189
    .line 190
    goto :goto_4

    .line 191
    :cond_8
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    throw v3

    .line 195
    :cond_9
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    throw v3

    .line 199
    :cond_a
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    throw v3

    .line 203
    :cond_b
    :goto_4
    iget-object v0, p0, Lcom/canhub/cropper/CropImageActivity;->b:Lcom/canhub/cropper/CropImageOptions;

    .line 204
    .line 205
    if-eqz v0, :cond_f

    .line 206
    .line 207
    iget-object v0, v0, Lcom/canhub/cropper/CropImageOptions;->O:Ljava/lang/Integer;

    .line 208
    .line 209
    if-eqz v0, :cond_e

    .line 210
    .line 211
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 212
    .line 213
    .line 214
    move-result v2

    .line 215
    sget v0, Lcom/canhub/cropper/R$id;->ic_rotate_left_24:I

    .line 216
    .line 217
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 218
    .line 219
    .line 220
    move-result-object v5

    .line 221
    sget v0, Lcom/canhub/cropper/R$id;->ic_rotate_right_24:I

    .line 222
    .line 223
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 224
    .line 225
    .line 226
    move-result-object v6

    .line 227
    sget v0, Lcom/canhub/cropper/R$id;->ic_flip_24:I

    .line 228
    .line 229
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 230
    .line 231
    .line 232
    move-result-object v7

    .line 233
    sget v0, Lcom/canhub/cropper/R$id;->ic_flip_24_horizontally:I

    .line 234
    .line 235
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 236
    .line 237
    .line 238
    move-result-object v8

    .line 239
    sget v0, Lcom/canhub/cropper/R$id;->ic_flip_24_vertically:I

    .line 240
    .line 241
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 242
    .line 243
    .line 244
    move-result-object v9

    .line 245
    sget v0, Lcom/canhub/cropper/R$id;->crop_image_menu_crop:I

    .line 246
    .line 247
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 248
    .line 249
    .line 250
    move-result-object v10

    .line 251
    filled-new-array/range {v5 .. v10}, [Ljava/lang/Integer;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    invoke-static {v0}, Lkotlin/collections/u;->z([Ljava/lang/Object;)Ljava/util/List;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 260
    .line 261
    .line 262
    move-result-object v3

    .line 263
    :cond_c
    :goto_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 264
    .line 265
    .line 266
    move-result v0

    .line 267
    if-eqz v0, :cond_e

    .line 268
    .line 269
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v0

    .line 273
    check-cast v0, Ljava/lang/Number;

    .line 274
    .line 275
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 276
    .line 277
    .line 278
    move-result v0

    .line 279
    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    .line 280
    .line 281
    .line 282
    move-result-object v0

    .line 283
    if-nez v0, :cond_d

    .line 284
    .line 285
    goto :goto_5

    .line 286
    :cond_d
    invoke-interface {v0}, Landroid/view/MenuItem;->getTitle()Ljava/lang/CharSequence;

    .line 287
    .line 288
    .line 289
    move-result-object v5

    .line 290
    if-eqz v5, :cond_c

    .line 291
    .line 292
    invoke-static {v5}, Lkotlin/text/p;->P(Ljava/lang/CharSequence;)Z

    .line 293
    .line 294
    .line 295
    move-result v6

    .line 296
    xor-int/2addr v6, v4

    .line 297
    if-ne v6, v4, :cond_c

    .line 298
    .line 299
    :try_start_3
    new-instance v6, Landroid/text/SpannableString;

    .line 300
    .line 301
    invoke-direct {v6, v5}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 302
    .line 303
    .line 304
    new-instance v5, Landroid/text/style/ForegroundColorSpan;

    .line 305
    .line 306
    invoke-direct {v5, v2}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 307
    .line 308
    .line 309
    invoke-virtual {v6}, Landroid/text/SpannableString;->length()I

    .line 310
    .line 311
    .line 312
    move-result v7

    .line 313
    const/16 v8, 0x21

    .line 314
    .line 315
    const/4 v9, 0x0

    .line 316
    invoke-virtual {v6, v5, v9, v7, v8}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 317
    .line 318
    .line 319
    invoke-interface {v0, v6}, Landroid/view/MenuItem;->setTitle(Ljava/lang/CharSequence;)Landroid/view/MenuItem;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    .line 320
    .line 321
    .line 322
    goto :goto_5

    .line 323
    :catch_2
    move-exception v0

    .line 324
    const-string v5, "Failed to update menu item color"

    .line 325
    .line 326
    invoke-static {v1, v5, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 327
    .line 328
    .line 329
    goto :goto_5

    .line 330
    :cond_e
    :goto_6
    return v4

    .line 331
    :cond_f
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 332
    .line 333
    .line 334
    throw v3

    .line 335
    :cond_10
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 336
    .line 337
    .line 338
    throw v3

    .line 339
    :cond_11
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 340
    .line 341
    .line 342
    throw v3

    .line 343
    :cond_12
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 344
    .line 345
    .line 346
    throw v3

    .line 347
    :cond_13
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 348
    .line 349
    .line 350
    throw v3

    .line 351
    :cond_14
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 352
    .line 353
    .line 354
    throw v3
.end method

.method public final onCropImageComplete(Lcom/canhub/cropper/CropImageView;Lcom/canhub/cropper/u;)V
    .locals 1

    .line 1
    iget-object p1, p2, Lcom/canhub/cropper/u;->b:Landroid/net/Uri;

    .line 2
    .line 3
    iget-object v0, p2, Lcom/canhub/cropper/u;->c:Ljava/lang/Exception;

    .line 4
    .line 5
    iget p2, p2, Lcom/canhub/cropper/u;->h:I

    .line 6
    .line 7
    invoke-virtual {p0, p1, v0, p2}, Lcom/canhub/cropper/CropImageActivity;->p(Landroid/net/Uri;Ljava/lang/Exception;I)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 5

    .line 1
    const-string v0, "item"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    sget v1, Lcom/canhub/cropper/R$id;->crop_image_menu_crop:I

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/canhub/cropper/CropImageActivity;->o()V

    .line 16
    .line 17
    .line 18
    return v2

    .line 19
    :cond_0
    sget v1, Lcom/canhub/cropper/R$id;->ic_rotate_left_24:I

    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    const-string v4, "cropImageOptions"

    .line 23
    .line 24
    if-ne v0, v1, :cond_2

    .line 25
    .line 26
    iget-object p1, p0, Lcom/canhub/cropper/CropImageActivity;->b:Lcom/canhub/cropper/CropImageOptions;

    .line 27
    .line 28
    if-eqz p1, :cond_1

    .line 29
    .line 30
    iget p1, p1, Lcom/canhub/cropper/CropImageOptions;->d0:I

    .line 31
    .line 32
    neg-int p1, p1

    .line 33
    iget-object v0, p0, Lcom/canhub/cropper/CropImageActivity;->c:Lcom/canhub/cropper/CropImageView;

    .line 34
    .line 35
    if-eqz v0, :cond_6

    .line 36
    .line 37
    invoke-virtual {v0, p1}, Lcom/canhub/cropper/CropImageView;->f(I)V

    .line 38
    .line 39
    .line 40
    return v2

    .line 41
    :cond_1
    invoke-static {v4}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    throw v3

    .line 45
    :cond_2
    sget v1, Lcom/canhub/cropper/R$id;->ic_rotate_right_24:I

    .line 46
    .line 47
    if-ne v0, v1, :cond_4

    .line 48
    .line 49
    iget-object p1, p0, Lcom/canhub/cropper/CropImageActivity;->b:Lcom/canhub/cropper/CropImageOptions;

    .line 50
    .line 51
    if-eqz p1, :cond_3

    .line 52
    .line 53
    iget p1, p1, Lcom/canhub/cropper/CropImageOptions;->d0:I

    .line 54
    .line 55
    iget-object v0, p0, Lcom/canhub/cropper/CropImageActivity;->c:Lcom/canhub/cropper/CropImageView;

    .line 56
    .line 57
    if-eqz v0, :cond_6

    .line 58
    .line 59
    invoke-virtual {v0, p1}, Lcom/canhub/cropper/CropImageView;->f(I)V

    .line 60
    .line 61
    .line 62
    return v2

    .line 63
    :cond_3
    invoke-static {v4}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    throw v3

    .line 67
    :cond_4
    sget v1, Lcom/canhub/cropper/R$id;->ic_flip_24_horizontally:I

    .line 68
    .line 69
    const/4 v3, 0x0

    .line 70
    if-ne v0, v1, :cond_5

    .line 71
    .line 72
    iget-object p1, p0, Lcom/canhub/cropper/CropImageActivity;->c:Lcom/canhub/cropper/CropImageView;

    .line 73
    .line 74
    if-eqz p1, :cond_6

    .line 75
    .line 76
    iget-boolean v0, p1, Lcom/canhub/cropper/CropImageView;->l:Z

    .line 77
    .line 78
    xor-int/2addr v0, v2

    .line 79
    iput-boolean v0, p1, Lcom/canhub/cropper/CropImageView;->l:Z

    .line 80
    .line 81
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    int-to-float v0, v0

    .line 86
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    int-to-float v1, v1

    .line 91
    invoke-virtual {p1, v0, v1, v2, v3}, Lcom/canhub/cropper/CropImageView;->a(FFZZ)V

    .line 92
    .line 93
    .line 94
    return v2

    .line 95
    :cond_5
    sget v1, Lcom/canhub/cropper/R$id;->ic_flip_24_vertically:I

    .line 96
    .line 97
    if-ne v0, v1, :cond_7

    .line 98
    .line 99
    iget-object p1, p0, Lcom/canhub/cropper/CropImageActivity;->c:Lcom/canhub/cropper/CropImageView;

    .line 100
    .line 101
    if-eqz p1, :cond_6

    .line 102
    .line 103
    iget-boolean v0, p1, Lcom/canhub/cropper/CropImageView;->m:Z

    .line 104
    .line 105
    xor-int/2addr v0, v2

    .line 106
    iput-boolean v0, p1, Lcom/canhub/cropper/CropImageView;->m:Z

    .line 107
    .line 108
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    int-to-float v0, v0

    .line 113
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 114
    .line 115
    .line 116
    move-result v1

    .line 117
    int-to-float v1, v1

    .line 118
    invoke-virtual {p1, v0, v1, v2, v3}, Lcom/canhub/cropper/CropImageView;->a(FFZZ)V

    .line 119
    .line 120
    .line 121
    :cond_6
    return v2

    .line 122
    :cond_7
    const v1, 0x102002c

    .line 123
    .line 124
    .line 125
    if-ne v0, v1, :cond_8

    .line 126
    .line 127
    invoke-virtual {p0}, Lcom/canhub/cropper/CropImageActivity;->q()V

    .line 128
    .line 129
    .line 130
    return v2

    .line 131
    :cond_8
    invoke-super {p0, p1}, Landroid/app/Activity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    .line 132
    .line 133
    .line 134
    move-result p1

    .line 135
    return p1
.end method

.method public final onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    const-string v0, "outState"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Landroidx/activity/ComponentActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcom/canhub/cropper/CropImageActivity;->e:Landroid/net/Uri;

    .line 10
    .line 11
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, "bundle_key_tmp_uri"

    .line 16
    .line 17
    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final onSetImageUriComplete(Lcom/canhub/cropper/CropImageView;Landroid/net/Uri;Ljava/lang/Exception;)V
    .locals 1

    .line 1
    const/4 p1, 0x0

    .line 2
    if-nez p3, :cond_6

    .line 3
    .line 4
    iget-object p2, p0, Lcom/canhub/cropper/CropImageActivity;->b:Lcom/canhub/cropper/CropImageOptions;

    .line 5
    .line 6
    const-string p3, "cropImageOptions"

    .line 7
    .line 8
    if-eqz p2, :cond_5

    .line 9
    .line 10
    iget-object p2, p2, Lcom/canhub/cropper/CropImageOptions;->W:Landroid/graphics/Rect;

    .line 11
    .line 12
    if-eqz p2, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lcom/canhub/cropper/CropImageActivity;->c:Lcom/canhub/cropper/CropImageView;

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {v0, p2}, Lcom/canhub/cropper/CropImageView;->setCropRect(Landroid/graphics/Rect;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    iget-object p2, p0, Lcom/canhub/cropper/CropImageActivity;->b:Lcom/canhub/cropper/CropImageOptions;

    .line 22
    .line 23
    if-eqz p2, :cond_4

    .line 24
    .line 25
    iget p2, p2, Lcom/canhub/cropper/CropImageOptions;->X:I

    .line 26
    .line 27
    if-lez p2, :cond_1

    .line 28
    .line 29
    iget-object v0, p0, Lcom/canhub/cropper/CropImageActivity;->c:Lcom/canhub/cropper/CropImageView;

    .line 30
    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    invoke-virtual {v0, p2}, Lcom/canhub/cropper/CropImageView;->setRotatedDegrees(I)V

    .line 34
    .line 35
    .line 36
    :cond_1
    iget-object p2, p0, Lcom/canhub/cropper/CropImageActivity;->b:Lcom/canhub/cropper/CropImageOptions;

    .line 37
    .line 38
    if-eqz p2, :cond_3

    .line 39
    .line 40
    iget-boolean p1, p2, Lcom/canhub/cropper/CropImageOptions;->i0:Z

    .line 41
    .line 42
    if-eqz p1, :cond_2

    .line 43
    .line 44
    invoke-virtual {p0}, Lcom/canhub/cropper/CropImageActivity;->o()V

    .line 45
    .line 46
    .line 47
    :cond_2
    return-void

    .line 48
    :cond_3
    invoke-static {p3}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw p1

    .line 52
    :cond_4
    invoke-static {p3}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw p1

    .line 56
    :cond_5
    invoke-static {p3}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw p1

    .line 60
    :cond_6
    const/4 p2, 0x1

    .line 61
    invoke-virtual {p0, p1, p3, p2}, Lcom/canhub/cropper/CropImageActivity;->p(Landroid/net/Uri;Ljava/lang/Exception;I)V

    .line 62
    .line 63
    .line 64
    return-void
.end method

.method public final onStart()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->onStart()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/canhub/cropper/CropImageActivity;->c:Lcom/canhub/cropper/CropImageView;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0, p0}, Lcom/canhub/cropper/CropImageView;->setOnSetImageUriCompleteListener(Lcom/canhub/cropper/z;)V

    .line 9
    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lcom/canhub/cropper/CropImageActivity;->c:Lcom/canhub/cropper/CropImageView;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {v0, p0}, Lcom/canhub/cropper/CropImageView;->setOnCropImageCompleteListener(Lcom/canhub/cropper/v;)V

    .line 16
    .line 17
    .line 18
    :cond_1
    return-void
.end method

.method public final onStop()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->onStop()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/canhub/cropper/CropImageActivity;->c:Lcom/canhub/cropper/CropImageView;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lcom/canhub/cropper/CropImageView;->setOnSetImageUriCompleteListener(Lcom/canhub/cropper/z;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lcom/canhub/cropper/CropImageActivity;->c:Lcom/canhub/cropper/CropImageView;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Lcom/canhub/cropper/CropImageView;->setOnCropImageCompleteListener(Lcom/canhub/cropper/v;)V

    .line 17
    .line 18
    .line 19
    :cond_1
    return-void
.end method

.method public final p(Landroid/net/Uri;Ljava/lang/Exception;I)V
    .locals 10

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    const/16 v0, 0xcc

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const/4 v0, -0x1

    .line 7
    :goto_0
    new-instance v1, Lcom/canhub/cropper/CropImage$ActivityResult;

    .line 8
    .line 9
    iget-object v2, p0, Lcom/canhub/cropper/CropImageActivity;->c:Lcom/canhub/cropper/CropImageView;

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    if-eqz v2, :cond_1

    .line 13
    .line 14
    invoke-virtual {v2}, Lcom/canhub/cropper/CropImageView;->getImageUri()Landroid/net/Uri;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    goto :goto_1

    .line 19
    :cond_1
    move-object v2, v3

    .line 20
    :goto_1
    iget-object v4, p0, Lcom/canhub/cropper/CropImageActivity;->c:Lcom/canhub/cropper/CropImageView;

    .line 21
    .line 22
    if-eqz v4, :cond_2

    .line 23
    .line 24
    invoke-virtual {v4}, Lcom/canhub/cropper/CropImageView;->getCropPoints()[F

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    move-object v5, v4

    .line 29
    goto :goto_2

    .line 30
    :cond_2
    move-object v5, v3

    .line 31
    :goto_2
    iget-object v4, p0, Lcom/canhub/cropper/CropImageActivity;->c:Lcom/canhub/cropper/CropImageView;

    .line 32
    .line 33
    if-eqz v4, :cond_3

    .line 34
    .line 35
    invoke-virtual {v4}, Lcom/canhub/cropper/CropImageView;->getCropRect()Landroid/graphics/Rect;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    move-object v6, v4

    .line 40
    goto :goto_3

    .line 41
    :cond_3
    move-object v6, v3

    .line 42
    :goto_3
    iget-object v4, p0, Lcom/canhub/cropper/CropImageActivity;->c:Lcom/canhub/cropper/CropImageView;

    .line 43
    .line 44
    if-eqz v4, :cond_4

    .line 45
    .line 46
    invoke-virtual {v4}, Lcom/canhub/cropper/CropImageView;->getRotatedDegrees()I

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    :goto_4
    move v8, v4

    .line 51
    goto :goto_5

    .line 52
    :cond_4
    const/4 v4, 0x0

    .line 53
    goto :goto_4

    .line 54
    :goto_5
    iget-object v4, p0, Lcom/canhub/cropper/CropImageActivity;->c:Lcom/canhub/cropper/CropImageView;

    .line 55
    .line 56
    if-eqz v4, :cond_5

    .line 57
    .line 58
    invoke-virtual {v4}, Lcom/canhub/cropper/CropImageView;->getWholeImageRect()Landroid/graphics/Rect;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    :cond_5
    move-object v7, v3

    .line 63
    invoke-static {v5}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    move-object v3, p1

    .line 67
    move-object v4, p2

    .line 68
    move v9, p3

    .line 69
    invoke-direct/range {v1 .. v9}, Lcom/canhub/cropper/u;-><init>(Landroid/net/Uri;Landroid/net/Uri;Ljava/lang/Exception;[FLandroid/graphics/Rect;Landroid/graphics/Rect;II)V

    .line 70
    .line 71
    .line 72
    new-instance p1, Landroid/content/Intent;

    .line 73
    .line 74
    invoke-direct {p1}, Landroid/content/Intent;-><init>()V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    if-eqz p2, :cond_6

    .line 82
    .line 83
    invoke-virtual {p1, p2}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 84
    .line 85
    .line 86
    :cond_6
    const-string p2, "CROP_IMAGE_EXTRA_RESULT"

    .line 87
    .line 88
    invoke-virtual {p1, p2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 89
    .line 90
    .line 91
    invoke-virtual {p0, v0, p1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 95
    .line 96
    .line 97
    return-void
.end method

.method public final q()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Landroid/app/Activity;->setResult(I)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 6
    .line 7
    .line 8
    return-void
.end method
