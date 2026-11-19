.class public final Lcom/canhub/cropper/CropImageOptions;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0087\u0008\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"
    }
    d2 = {
        "Lcom/canhub/cropper/CropImageOptions;",
        "Landroid/os/Parcelable;",
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
        "SMAP\nCropImageOptions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CropImageOptions.kt\ncom/canhub/cropper/CropImageOptions\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,130:1\n1#2:131\n*E\n"
    }
.end annotation

.annotation build Lkotlinx/parcelize/Parcelize;
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/canhub/cropper/CropImageOptions;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final A:F

.field public B:I

.field public final C:I

.field public final D:F

.field public final E:I

.field public final F:I

.field public final G:I

.field public final H:I

.field public final I:I

.field public final J:I

.field public final K:I

.field public final L:I

.field public final M:Ljava/lang/CharSequence;

.field public final N:I

.field public final O:Ljava/lang/Integer;

.field public final P:Landroid/net/Uri;

.field public final Q:Landroid/graphics/Bitmap$CompressFormat;

.field public final R:I

.field public final S:I

.field public final T:I

.field public final U:Lcom/canhub/cropper/CropImageView$RequestSizeOptions;

.field public final V:Z

.field public final W:Landroid/graphics/Rect;

.field public final X:I

.field public final Y:Z

.field public final Z:Z

.field public final a:Z

.field public final b:Z

.field public final c:Lcom/canhub/cropper/CropImageView$CropShape;

.field public final c0:Z

.field public final d:Lcom/canhub/cropper/CropImageView$CropCornerShape;

.field public final d0:I

.field public final e:F

.field public final e0:Z

.field public final f:F

.field public final f0:Z

.field public final g:F

.field public final g0:Ljava/lang/CharSequence;

.field public final h:Lcom/canhub/cropper/CropImageView$Guidelines;

.field public final h0:I

.field public final i:Lcom/canhub/cropper/CropImageView$ScaleType;

.field public final i0:Z

.field public final j:Z

.field public final j0:Z

.field public final k:Z

.field public final k0:Ljava/lang/String;

.field public final l:Z

.field public final l0:Ljava/util/List;

.field public m:I

.field public final m0:F

.field public n:Z

.field public final n0:I

.field public o:Z

.field public final o0:Ljava/lang/String;

.field public final p:Z

.field public final p0:I

.field public final q:Z

.field public final q0:Ljava/lang/Integer;

.field public final r:I

.field public final r0:Ljava/lang/Integer;

.field public s:F

.field public final s0:Ljava/lang/Integer;

.field public final t:Z

.field public final t0:Ljava/lang/Integer;

.field public final u:I

.field public final v:I

.field public final w:F

.field public x:I

.field public final y:F

.field public final z:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/canhub/cropper/t;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/canhub/cropper/CropImageOptions;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Lcom/canhub/cropper/CropImageView$CropShape;Lcom/canhub/cropper/CropImageView$CropCornerShape;FFFLcom/canhub/cropper/CropImageView$Guidelines;Lcom/canhub/cropper/CropImageView$ScaleType;ZZZZZZIFZIIFIFFFIIFIIIIIIIIZZFILjava/lang/String;III)V
    .locals 73

    move/from16 v0, p40

    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_0

    .line 89
    sget-object v1, Lcom/canhub/cropper/CropImageView$CropShape;->RECTANGLE:Lcom/canhub/cropper/CropImageView$CropShape;

    move-object v5, v1

    goto :goto_0

    :cond_0
    move-object/from16 v5, p1

    :goto_0
    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_1

    .line 90
    sget-object v1, Lcom/canhub/cropper/CropImageView$CropCornerShape;->RECTANGLE:Lcom/canhub/cropper/CropImageView$CropCornerShape;

    move-object v6, v1

    goto :goto_1

    :cond_1
    move-object/from16 v6, p2

    :goto_1
    and-int/lit8 v1, v0, 0x10

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    .line 91
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    const/high16 v3, 0x41200000    # 10.0f

    invoke-static {v2, v3, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v1

    move v7, v1

    goto :goto_2

    :cond_2
    move/from16 v7, p3

    :goto_2
    and-int/lit8 v1, v0, 0x20

    const/high16 v3, 0x40400000    # 3.0f

    if-eqz v1, :cond_3

    .line 92
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    invoke-static {v2, v3, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v1

    move v8, v1

    goto :goto_3

    :cond_3
    move/from16 v8, p4

    :goto_3
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_4

    .line 93
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    const/high16 v4, 0x41c00000    # 24.0f

    invoke-static {v2, v4, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v1

    move v9, v1

    goto :goto_4

    :cond_4
    move/from16 v9, p5

    :goto_4
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_5

    .line 94
    sget-object v1, Lcom/canhub/cropper/CropImageView$Guidelines;->ON:Lcom/canhub/cropper/CropImageView$Guidelines;

    move-object v10, v1

    goto :goto_5

    :cond_5
    move-object/from16 v10, p6

    :goto_5
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_6

    .line 95
    sget-object v1, Lcom/canhub/cropper/CropImageView$ScaleType;->FIT_CENTER:Lcom/canhub/cropper/CropImageView$ScaleType;

    move-object v11, v1

    goto :goto_6

    :cond_6
    move-object/from16 v11, p7

    :goto_6
    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_7

    move v12, v2

    goto :goto_7

    :cond_7
    move/from16 v12, p8

    :goto_7
    and-int/lit16 v1, v0, 0x400

    if-eqz v1, :cond_8

    const/4 v13, 0x0

    goto :goto_8

    :cond_8
    move/from16 v13, p9

    :goto_8
    and-int/lit16 v1, v0, 0x800

    if-eqz v1, :cond_9

    move v14, v2

    goto :goto_9

    :cond_9
    move/from16 v14, p10

    :goto_9
    const/16 v1, 0x33

    const/16 v15, 0x99

    .line 96
    invoke-static {v15, v1, v15}, Landroid/graphics/Color;->rgb(III)I

    move-result v15

    and-int/lit16 v1, v0, 0x2000

    if-eqz v1, :cond_a

    move/from16 v16, v2

    goto :goto_a

    :cond_a
    move/from16 v16, p11

    :goto_a
    and-int/lit16 v1, v0, 0x4000

    if-eqz v1, :cond_b

    const/16 v17, 0x0

    goto :goto_b

    :cond_b
    move/from16 v17, p12

    :goto_b
    const v1, 0x8000

    and-int/2addr v1, v0

    if-eqz v1, :cond_c

    move/from16 v18, v2

    goto :goto_c

    :cond_c
    move/from16 v18, p13

    :goto_c
    const/high16 v1, 0x20000

    and-int/2addr v1, v0

    if-eqz v1, :cond_d

    const/4 v1, 0x4

    move/from16 v20, v1

    goto :goto_d

    :cond_d
    move/from16 v20, p14

    :goto_d
    const/high16 v1, 0x40000

    and-int/2addr v1, v0

    if-eqz v1, :cond_e

    const/4 v1, 0x0

    move/from16 v21, v1

    goto :goto_e

    :cond_e
    move/from16 v21, p15

    :goto_e
    const/high16 v1, 0x80000

    and-int/2addr v1, v0

    if-eqz v1, :cond_f

    const/16 v22, 0x0

    goto :goto_f

    :cond_f
    move/from16 v22, p16

    :goto_f
    const/high16 v1, 0x100000

    and-int/2addr v1, v0

    if-eqz v1, :cond_10

    move/from16 v23, v2

    goto :goto_10

    :cond_10
    move/from16 v23, p17

    :goto_10
    const/high16 v1, 0x200000

    and-int/2addr v1, v0

    if-eqz v1, :cond_11

    move/from16 v24, v2

    goto :goto_11

    :cond_11
    move/from16 v24, p18

    :goto_11
    const/high16 v1, 0x400000

    and-int v19, v0, v1

    if-eqz v19, :cond_12

    .line 97
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v19

    move/from16 p1, v1

    invoke-virtual/range {v19 .. v19}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    invoke-static {v2, v3, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v1

    move/from16 v25, v1

    goto :goto_12

    :cond_12
    move/from16 p1, v1

    move/from16 v25, p19

    :goto_12
    const/high16 v1, 0x800000

    and-int v3, v0, v1

    move/from16 p2, v1

    const/16 v1, 0xaa

    const/16 v4, 0xff

    if-eqz v3, :cond_13

    .line 98
    invoke-static {v1, v4, v4, v4}, Landroid/graphics/Color;->argb(IIII)I

    move-result v3

    move/from16 v26, v3

    goto :goto_13

    :cond_13
    move/from16 v26, p20

    :goto_13
    const/high16 v3, 0x1000000

    and-int/2addr v3, v0

    if-eqz v3, :cond_14

    .line 99
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v3

    const/high16 v1, 0x40000000    # 2.0f

    invoke-static {v2, v1, v3}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v1

    move/from16 v27, v1

    goto :goto_14

    :cond_14
    move/from16 v27, p21

    :goto_14
    const/high16 v1, 0x2000000

    and-int/2addr v1, v0

    if-eqz v1, :cond_15

    .line 100
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    const/high16 v3, 0x40a00000    # 5.0f

    invoke-static {v2, v3, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v1

    move/from16 v28, v1

    goto :goto_15

    :cond_15
    move/from16 v28, p22

    :goto_15
    const/high16 v1, 0x4000000

    and-int/2addr v1, v0

    if-eqz v1, :cond_16

    .line 101
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    const/high16 v3, 0x41600000    # 14.0f

    invoke-static {v2, v3, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v1

    move/from16 v29, v1

    goto :goto_16

    :cond_16
    move/from16 v29, p23

    :goto_16
    const/high16 v1, 0x8000000

    and-int/2addr v1, v0

    if-eqz v1, :cond_17

    const/16 v30, -0x1

    goto :goto_17

    :cond_17
    move/from16 v30, p24

    :goto_17
    const/high16 v1, 0x10000000

    and-int/2addr v1, v0

    if-eqz v1, :cond_18

    const/16 v31, -0x1

    goto :goto_18

    :cond_18
    move/from16 v31, p25

    :goto_18
    const/high16 v1, 0x20000000

    and-int/2addr v1, v0

    if-eqz v1, :cond_19

    .line 102
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v2, v3, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v1

    move/from16 v32, v1

    goto :goto_19

    :cond_19
    move/from16 v32, p26

    :goto_19
    const/high16 v1, 0x40000000    # 2.0f

    and-int v3, v0, v1

    if-eqz v3, :cond_1a

    const/16 v3, 0xaa

    .line 103
    invoke-static {v3, v4, v4, v4}, Landroid/graphics/Color;->argb(IIII)I

    move-result v3

    move/from16 v33, v3

    goto :goto_1a

    :cond_1a
    move/from16 v33, p27

    :goto_1a
    const/high16 v3, -0x80000000

    and-int/2addr v0, v3

    if-eqz v0, :cond_1b

    const/16 v0, 0x77

    const/4 v4, 0x0

    .line 104
    invoke-static {v0, v4, v4, v4}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    move/from16 v34, v0

    goto :goto_1b

    :cond_1b
    const/4 v4, 0x0

    move/from16 v34, p28

    :goto_1b
    and-int/lit8 v0, p41, 0x1

    move/from16 p3, v1

    const/high16 v1, 0x42280000    # 42.0f

    if-eqz v0, :cond_1c

    .line 105
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    invoke-static {v2, v1, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v0

    float-to-int v0, v0

    move/from16 v35, v0

    goto :goto_1c

    :cond_1c
    move/from16 v35, p29

    :goto_1c
    and-int/lit8 v0, p41, 0x2

    if-eqz v0, :cond_1d

    .line 106
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    invoke-static {v2, v1, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v0

    float-to-int v0, v0

    move/from16 v36, v0

    goto :goto_1d

    :cond_1d
    move/from16 v36, p30

    :goto_1d
    and-int/lit8 v0, p41, 0x4

    const/16 v1, 0x28

    if-eqz v0, :cond_1e

    move/from16 v37, v1

    goto :goto_1e

    :cond_1e
    move/from16 v37, p31

    :goto_1e
    and-int/lit8 v0, p41, 0x8

    if-eqz v0, :cond_1f

    move/from16 v38, v1

    goto :goto_1f

    :cond_1f
    move/from16 v38, p32

    :goto_1f
    and-int/lit8 v0, p41, 0x10

    const v1, 0x1869f

    if-eqz v0, :cond_20

    move/from16 v39, v1

    goto :goto_20

    :cond_20
    move/from16 v39, p33

    :goto_20
    and-int/lit8 v0, p41, 0x20

    if-eqz v0, :cond_21

    move/from16 v40, v1

    goto :goto_21

    :cond_21
    move/from16 v40, p34

    .line 107
    :goto_21
    sget-object v45, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    .line 108
    sget-object v49, Lcom/canhub/cropper/CropImageView$RequestSizeOptions;->NONE:Lcom/canhub/cropper/CropImageView$RequestSizeOptions;

    and-int v0, p41, p1

    if-eqz v0, :cond_22

    move/from16 v57, v4

    goto :goto_22

    :cond_22
    move/from16 v57, p35

    :goto_22
    and-int v0, p41, p2

    if-eqz v0, :cond_23

    move/from16 v58, v4

    goto :goto_23

    :cond_23
    move/from16 v58, p36

    .line 109
    :goto_23
    sget-object v64, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    and-int v0, p41, p3

    if-eqz v0, :cond_24

    .line 110
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    const/4 v1, 0x2

    const/high16 v4, 0x41a00000    # 20.0f

    invoke-static {v1, v4, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v0

    move/from16 v65, v0

    goto :goto_24

    :cond_24
    move/from16 v65, p37

    :goto_24
    and-int v0, p41, v3

    if-eqz v0, :cond_25

    const/16 v66, -0x1

    goto :goto_25

    :cond_25
    move/from16 v66, p38

    :goto_25
    and-int/lit8 v0, p42, 0x1

    if-eqz v0, :cond_26

    .line 111
    const-string v0, ""

    move-object/from16 v67, v0

    goto :goto_26

    :cond_26
    move-object/from16 v67, p39

    :goto_26
    const/16 v68, -0x1

    const/4 v3, 0x1

    const/4 v4, 0x1

    const/16 v19, 0x1

    .line 112
    const-string v41, ""

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v46, 0x5a

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v52, -0x1

    const/16 v53, 0x1

    const/16 v54, 0x1

    const/16 v55, 0x0

    const/16 v56, 0x5a

    const/16 v59, 0x0

    const/16 v60, 0x0

    const/16 v61, 0x0

    const/16 v62, 0x0

    const/16 v63, 0x0

    const/16 v69, 0x0

    const/16 v70, 0x0

    const/16 v71, 0x0

    const/16 v72, 0x0

    move-object/from16 v2, p0

    invoke-direct/range {v2 .. v72}, Lcom/canhub/cropper/CropImageOptions;-><init>(ZZLcom/canhub/cropper/CropImageView$CropShape;Lcom/canhub/cropper/CropImageView$CropCornerShape;FFFLcom/canhub/cropper/CropImageView$Guidelines;Lcom/canhub/cropper/CropImageView$ScaleType;ZZZIZZZZIFZIIFIFFFIIFIIIIIIIILjava/lang/CharSequence;ILjava/lang/Integer;Landroid/net/Uri;Landroid/graphics/Bitmap$CompressFormat;IIILcom/canhub/cropper/CropImageView$RequestSizeOptions;ZLandroid/graphics/Rect;IZZZIZZLjava/lang/CharSequence;IZZLjava/lang/String;Ljava/util/List;FILjava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V

    return-void
.end method

.method public constructor <init>(ZZLcom/canhub/cropper/CropImageView$CropShape;Lcom/canhub/cropper/CropImageView$CropCornerShape;FFFLcom/canhub/cropper/CropImageView$Guidelines;Lcom/canhub/cropper/CropImageView$ScaleType;ZZZIZZZZIFZIIFIFFFIIFIIIIIIIILjava/lang/CharSequence;ILjava/lang/Integer;Landroid/net/Uri;Landroid/graphics/Bitmap$CompressFormat;IIILcom/canhub/cropper/CropImageView$RequestSizeOptions;ZLandroid/graphics/Rect;IZZZIZZLjava/lang/CharSequence;IZZLjava/lang/String;Ljava/util/List;FILjava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    move-object/from16 v2, p4

    move/from16 v3, p7

    move-object/from16 v4, p8

    move-object/from16 v5, p9

    move/from16 v6, p18

    move/from16 v7, p19

    move/from16 v8, p21

    move/from16 v9, p22

    move/from16 v10, p23

    move/from16 v11, p25

    move-object/from16 v15, p39

    move-object/from16 v14, p43

    move-object/from16 v13, p47

    const-string v12, "cropShape"

    invoke-static {v1, v12}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "cornerShape"

    invoke-static {v2, v12}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "guidelines"

    invoke-static {v4, v12}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v12, "scaleType"

    invoke-static {v5, v12}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "activityTitle"

    invoke-static {v15, v12}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "outputCompressFormat"

    invoke-static {v14, v12}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "outputRequestSizeOptions"

    invoke-static {v13, v12}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    move/from16 v12, p1

    .line 2
    iput-boolean v12, v0, Lcom/canhub/cropper/CropImageOptions;->a:Z

    move/from16 v12, p2

    .line 3
    iput-boolean v12, v0, Lcom/canhub/cropper/CropImageOptions;->b:Z

    .line 4
    iput-object v1, v0, Lcom/canhub/cropper/CropImageOptions;->c:Lcom/canhub/cropper/CropImageView$CropShape;

    .line 5
    iput-object v2, v0, Lcom/canhub/cropper/CropImageOptions;->d:Lcom/canhub/cropper/CropImageView$CropCornerShape;

    move/from16 v1, p5

    .line 6
    iput v1, v0, Lcom/canhub/cropper/CropImageOptions;->e:F

    move/from16 v1, p6

    .line 7
    iput v1, v0, Lcom/canhub/cropper/CropImageOptions;->f:F

    .line 8
    iput v3, v0, Lcom/canhub/cropper/CropImageOptions;->g:F

    .line 9
    iput-object v4, v0, Lcom/canhub/cropper/CropImageOptions;->h:Lcom/canhub/cropper/CropImageView$Guidelines;

    .line 10
    iput-object v5, v0, Lcom/canhub/cropper/CropImageOptions;->i:Lcom/canhub/cropper/CropImageView$ScaleType;

    move/from16 v1, p10

    .line 11
    iput-boolean v1, v0, Lcom/canhub/cropper/CropImageOptions;->j:Z

    move/from16 v1, p11

    .line 12
    iput-boolean v1, v0, Lcom/canhub/cropper/CropImageOptions;->k:Z

    move/from16 v1, p12

    .line 13
    iput-boolean v1, v0, Lcom/canhub/cropper/CropImageOptions;->l:Z

    move/from16 v1, p13

    .line 14
    iput v1, v0, Lcom/canhub/cropper/CropImageOptions;->m:I

    move/from16 v1, p14

    .line 15
    iput-boolean v1, v0, Lcom/canhub/cropper/CropImageOptions;->n:Z

    move/from16 v1, p15

    .line 16
    iput-boolean v1, v0, Lcom/canhub/cropper/CropImageOptions;->o:Z

    move/from16 v1, p16

    .line 17
    iput-boolean v1, v0, Lcom/canhub/cropper/CropImageOptions;->p:Z

    move/from16 v1, p17

    .line 18
    iput-boolean v1, v0, Lcom/canhub/cropper/CropImageOptions;->q:Z

    .line 19
    iput v6, v0, Lcom/canhub/cropper/CropImageOptions;->r:I

    .line 20
    iput v7, v0, Lcom/canhub/cropper/CropImageOptions;->s:F

    move/from16 v1, p20

    .line 21
    iput-boolean v1, v0, Lcom/canhub/cropper/CropImageOptions;->t:Z

    .line 22
    iput v8, v0, Lcom/canhub/cropper/CropImageOptions;->u:I

    .line 23
    iput v9, v0, Lcom/canhub/cropper/CropImageOptions;->v:I

    .line 24
    iput v10, v0, Lcom/canhub/cropper/CropImageOptions;->w:F

    move/from16 v1, p24

    .line 25
    iput v1, v0, Lcom/canhub/cropper/CropImageOptions;->x:I

    .line 26
    iput v11, v0, Lcom/canhub/cropper/CropImageOptions;->y:F

    move/from16 v1, p26

    .line 27
    iput v1, v0, Lcom/canhub/cropper/CropImageOptions;->z:F

    move/from16 v1, p27

    .line 28
    iput v1, v0, Lcom/canhub/cropper/CropImageOptions;->A:F

    move/from16 v1, p28

    .line 29
    iput v1, v0, Lcom/canhub/cropper/CropImageOptions;->B:I

    move/from16 v1, p29

    .line 30
    iput v1, v0, Lcom/canhub/cropper/CropImageOptions;->C:I

    move/from16 v12, p30

    .line 31
    iput v12, v0, Lcom/canhub/cropper/CropImageOptions;->D:F

    move/from16 v1, p31

    .line 32
    iput v1, v0, Lcom/canhub/cropper/CropImageOptions;->E:I

    move/from16 v1, p32

    .line 33
    iput v1, v0, Lcom/canhub/cropper/CropImageOptions;->F:I

    move/from16 v1, p33

    .line 34
    iput v1, v0, Lcom/canhub/cropper/CropImageOptions;->G:I

    move/from16 v1, p34

    .line 35
    iput v1, v0, Lcom/canhub/cropper/CropImageOptions;->H:I

    move/from16 v2, p35

    .line 36
    iput v2, v0, Lcom/canhub/cropper/CropImageOptions;->I:I

    move/from16 v4, p36

    .line 37
    iput v4, v0, Lcom/canhub/cropper/CropImageOptions;->J:I

    move/from16 v5, p37

    .line 38
    iput v5, v0, Lcom/canhub/cropper/CropImageOptions;->K:I

    move/from16 v1, p38

    .line 39
    iput v1, v0, Lcom/canhub/cropper/CropImageOptions;->L:I

    .line 40
    iput-object v15, v0, Lcom/canhub/cropper/CropImageOptions;->M:Ljava/lang/CharSequence;

    move/from16 v15, p40

    .line 41
    iput v15, v0, Lcom/canhub/cropper/CropImageOptions;->N:I

    move-object/from16 v15, p41

    .line 42
    iput-object v15, v0, Lcom/canhub/cropper/CropImageOptions;->O:Ljava/lang/Integer;

    move-object/from16 v15, p42

    .line 43
    iput-object v15, v0, Lcom/canhub/cropper/CropImageOptions;->P:Landroid/net/Uri;

    .line 44
    iput-object v14, v0, Lcom/canhub/cropper/CropImageOptions;->Q:Landroid/graphics/Bitmap$CompressFormat;

    move/from16 v14, p44

    .line 45
    iput v14, v0, Lcom/canhub/cropper/CropImageOptions;->R:I

    move/from16 v14, p45

    .line 46
    iput v14, v0, Lcom/canhub/cropper/CropImageOptions;->S:I

    move/from16 v15, p46

    .line 47
    iput v15, v0, Lcom/canhub/cropper/CropImageOptions;->T:I

    .line 48
    iput-object v13, v0, Lcom/canhub/cropper/CropImageOptions;->U:Lcom/canhub/cropper/CropImageView$RequestSizeOptions;

    move/from16 v13, p48

    .line 49
    iput-boolean v13, v0, Lcom/canhub/cropper/CropImageOptions;->V:Z

    move-object/from16 v13, p49

    .line 50
    iput-object v13, v0, Lcom/canhub/cropper/CropImageOptions;->W:Landroid/graphics/Rect;

    move/from16 v13, p50

    .line 51
    iput v13, v0, Lcom/canhub/cropper/CropImageOptions;->X:I

    move/from16 v13, p51

    .line 52
    iput-boolean v13, v0, Lcom/canhub/cropper/CropImageOptions;->Y:Z

    move/from16 v13, p52

    .line 53
    iput-boolean v13, v0, Lcom/canhub/cropper/CropImageOptions;->Z:Z

    move/from16 v13, p53

    .line 54
    iput-boolean v13, v0, Lcom/canhub/cropper/CropImageOptions;->c0:Z

    move/from16 v13, p54

    .line 55
    iput v13, v0, Lcom/canhub/cropper/CropImageOptions;->d0:I

    move/from16 v3, p55

    .line 56
    iput-boolean v3, v0, Lcom/canhub/cropper/CropImageOptions;->e0:Z

    move/from16 v3, p56

    .line 57
    iput-boolean v3, v0, Lcom/canhub/cropper/CropImageOptions;->f0:Z

    move-object/from16 v3, p57

    .line 58
    iput-object v3, v0, Lcom/canhub/cropper/CropImageOptions;->g0:Ljava/lang/CharSequence;

    move/from16 v3, p58

    .line 59
    iput v3, v0, Lcom/canhub/cropper/CropImageOptions;->h0:I

    move/from16 v3, p59

    .line 60
    iput-boolean v3, v0, Lcom/canhub/cropper/CropImageOptions;->i0:Z

    move/from16 v3, p60

    .line 61
    iput-boolean v3, v0, Lcom/canhub/cropper/CropImageOptions;->j0:Z

    move-object/from16 v3, p61

    .line 62
    iput-object v3, v0, Lcom/canhub/cropper/CropImageOptions;->k0:Ljava/lang/String;

    move-object/from16 v3, p62

    .line 63
    iput-object v3, v0, Lcom/canhub/cropper/CropImageOptions;->l0:Ljava/util/List;

    move/from16 v3, p63

    .line 64
    iput v3, v0, Lcom/canhub/cropper/CropImageOptions;->m0:F

    move/from16 v3, p64

    .line 65
    iput v3, v0, Lcom/canhub/cropper/CropImageOptions;->n0:I

    move-object/from16 v3, p65

    .line 66
    iput-object v3, v0, Lcom/canhub/cropper/CropImageOptions;->o0:Ljava/lang/String;

    move/from16 v3, p66

    .line 67
    iput v3, v0, Lcom/canhub/cropper/CropImageOptions;->p0:I

    move-object/from16 v3, p67

    .line 68
    iput-object v3, v0, Lcom/canhub/cropper/CropImageOptions;->q0:Ljava/lang/Integer;

    move-object/from16 v3, p68

    .line 69
    iput-object v3, v0, Lcom/canhub/cropper/CropImageOptions;->r0:Ljava/lang/Integer;

    move-object/from16 v3, p69

    .line 70
    iput-object v3, v0, Lcom/canhub/cropper/CropImageOptions;->s0:Ljava/lang/Integer;

    move-object/from16 v3, p70

    .line 71
    iput-object v3, v0, Lcom/canhub/cropper/CropImageOptions;->t0:Ljava/lang/Integer;

    if-ltz v6, :cond_f

    const/4 v3, 0x0

    cmpl-float v6, p7, v3

    if-ltz v6, :cond_e

    cmpg-float v6, v7, v3

    if-ltz v6, :cond_d

    float-to-double v6, v7

    const-wide/high16 v16, 0x3fe0000000000000L    # 0.5

    cmpl-double v6, v6, v16

    if-gez v6, :cond_d

    .line 72
    const-string v6, "Cannot set aspect ratio value to a number less than or equal to 0."

    if-lez v8, :cond_c

    if-lez v9, :cond_b

    cmpl-float v6, v10, v3

    if-ltz v6, :cond_a

    cmpl-float v6, v11, v3

    if-ltz v6, :cond_9

    cmpl-float v3, v12, v3

    if-ltz v3, :cond_8

    if-ltz p34, :cond_7

    if-ltz v2, :cond_6

    if-ltz v4, :cond_5

    if-lt v5, v2, :cond_4

    if-lt v1, v4, :cond_3

    if-ltz v14, :cond_2

    if-ltz v15, :cond_1

    if-ltz v13, :cond_0

    const/16 v1, 0x168

    if-gt v13, v1, :cond_0

    return-void

    .line 73
    :cond_0
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Cannot set rotation degrees value to a number < 0 or > 360"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 74
    :cond_1
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Cannot set request height value to a number < 0 "

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 75
    :cond_2
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Cannot set request width value to a number < 0 "

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 76
    :cond_3
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Cannot set max crop result height to smaller value than min crop result height"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 77
    :cond_4
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Cannot set max crop result width to smaller value than min crop result width"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 78
    :cond_5
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Cannot set min crop result height value to a number < 0 "

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 79
    :cond_6
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Cannot set min crop result width value to a number < 0 "

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 80
    :cond_7
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Cannot set min crop window height value to a number < 0 "

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 81
    :cond_8
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Cannot set guidelines thickness value to a number less than 0."

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 82
    :cond_9
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Cannot set corner thickness value to a number less than 0."

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 83
    :cond_a
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Cannot set line thickness value to a number less than 0."

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 84
    :cond_b
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-direct {v1, v6}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 85
    :cond_c
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-direct {v1, v6}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 86
    :cond_d
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Cannot set initial crop window padding value to a number < 0 or >= 0.5"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 87
    :cond_e
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Cannot set touch radius value to a number <= 0 "

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 88
    :cond_f
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Cannot set max zoom to a number < 1"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method


# virtual methods
.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/canhub/cropper/CropImageOptions;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/canhub/cropper/CropImageOptions;

    iget-boolean v1, p0, Lcom/canhub/cropper/CropImageOptions;->a:Z

    iget-boolean v3, p1, Lcom/canhub/cropper/CropImageOptions;->a:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lcom/canhub/cropper/CropImageOptions;->b:Z

    iget-boolean v3, p1, Lcom/canhub/cropper/CropImageOptions;->b:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/canhub/cropper/CropImageOptions;->c:Lcom/canhub/cropper/CropImageView$CropShape;

    iget-object v3, p1, Lcom/canhub/cropper/CropImageOptions;->c:Lcom/canhub/cropper/CropImageView$CropShape;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/canhub/cropper/CropImageOptions;->d:Lcom/canhub/cropper/CropImageView$CropCornerShape;

    iget-object v3, p1, Lcom/canhub/cropper/CropImageOptions;->d:Lcom/canhub/cropper/CropImageView$CropCornerShape;

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/canhub/cropper/CropImageOptions;->e:F

    iget v3, p1, Lcom/canhub/cropper/CropImageOptions;->e:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/canhub/cropper/CropImageOptions;->f:F

    iget v3, p1, Lcom/canhub/cropper/CropImageOptions;->f:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/canhub/cropper/CropImageOptions;->g:F

    iget v3, p1, Lcom/canhub/cropper/CropImageOptions;->g:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/canhub/cropper/CropImageOptions;->h:Lcom/canhub/cropper/CropImageView$Guidelines;

    iget-object v3, p1, Lcom/canhub/cropper/CropImageOptions;->h:Lcom/canhub/cropper/CropImageView$Guidelines;

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/canhub/cropper/CropImageOptions;->i:Lcom/canhub/cropper/CropImageView$ScaleType;

    iget-object v3, p1, Lcom/canhub/cropper/CropImageOptions;->i:Lcom/canhub/cropper/CropImageView$ScaleType;

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget-boolean v1, p0, Lcom/canhub/cropper/CropImageOptions;->j:Z

    iget-boolean v3, p1, Lcom/canhub/cropper/CropImageOptions;->j:Z

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget-boolean v1, p0, Lcom/canhub/cropper/CropImageOptions;->k:Z

    iget-boolean v3, p1, Lcom/canhub/cropper/CropImageOptions;->k:Z

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget-boolean v1, p0, Lcom/canhub/cropper/CropImageOptions;->l:Z

    iget-boolean v3, p1, Lcom/canhub/cropper/CropImageOptions;->l:Z

    if-eq v1, v3, :cond_d

    return v2

    :cond_d
    iget v1, p0, Lcom/canhub/cropper/CropImageOptions;->m:I

    iget v3, p1, Lcom/canhub/cropper/CropImageOptions;->m:I

    if-eq v1, v3, :cond_e

    return v2

    :cond_e
    iget-boolean v1, p0, Lcom/canhub/cropper/CropImageOptions;->n:Z

    iget-boolean v3, p1, Lcom/canhub/cropper/CropImageOptions;->n:Z

    if-eq v1, v3, :cond_f

    return v2

    :cond_f
    iget-boolean v1, p0, Lcom/canhub/cropper/CropImageOptions;->o:Z

    iget-boolean v3, p1, Lcom/canhub/cropper/CropImageOptions;->o:Z

    if-eq v1, v3, :cond_10

    return v2

    :cond_10
    iget-boolean v1, p0, Lcom/canhub/cropper/CropImageOptions;->p:Z

    iget-boolean v3, p1, Lcom/canhub/cropper/CropImageOptions;->p:Z

    if-eq v1, v3, :cond_11

    return v2

    :cond_11
    iget-boolean v1, p0, Lcom/canhub/cropper/CropImageOptions;->q:Z

    iget-boolean v3, p1, Lcom/canhub/cropper/CropImageOptions;->q:Z

    if-eq v1, v3, :cond_12

    return v2

    :cond_12
    iget v1, p0, Lcom/canhub/cropper/CropImageOptions;->r:I

    iget v3, p1, Lcom/canhub/cropper/CropImageOptions;->r:I

    if-eq v1, v3, :cond_13

    return v2

    :cond_13
    iget v1, p0, Lcom/canhub/cropper/CropImageOptions;->s:F

    iget v3, p1, Lcom/canhub/cropper/CropImageOptions;->s:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_14

    return v2

    :cond_14
    iget-boolean v1, p0, Lcom/canhub/cropper/CropImageOptions;->t:Z

    iget-boolean v3, p1, Lcom/canhub/cropper/CropImageOptions;->t:Z

    if-eq v1, v3, :cond_15

    return v2

    :cond_15
    iget v1, p0, Lcom/canhub/cropper/CropImageOptions;->u:I

    iget v3, p1, Lcom/canhub/cropper/CropImageOptions;->u:I

    if-eq v1, v3, :cond_16

    return v2

    :cond_16
    iget v1, p0, Lcom/canhub/cropper/CropImageOptions;->v:I

    iget v3, p1, Lcom/canhub/cropper/CropImageOptions;->v:I

    if-eq v1, v3, :cond_17

    return v2

    :cond_17
    iget v1, p0, Lcom/canhub/cropper/CropImageOptions;->w:F

    iget v3, p1, Lcom/canhub/cropper/CropImageOptions;->w:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_18

    return v2

    :cond_18
    iget v1, p0, Lcom/canhub/cropper/CropImageOptions;->x:I

    iget v3, p1, Lcom/canhub/cropper/CropImageOptions;->x:I

    if-eq v1, v3, :cond_19

    return v2

    :cond_19
    iget v1, p0, Lcom/canhub/cropper/CropImageOptions;->y:F

    iget v3, p1, Lcom/canhub/cropper/CropImageOptions;->y:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_1a

    return v2

    :cond_1a
    iget v1, p0, Lcom/canhub/cropper/CropImageOptions;->z:F

    iget v3, p1, Lcom/canhub/cropper/CropImageOptions;->z:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_1b

    return v2

    :cond_1b
    iget v1, p0, Lcom/canhub/cropper/CropImageOptions;->A:F

    iget v3, p1, Lcom/canhub/cropper/CropImageOptions;->A:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_1c

    return v2

    :cond_1c
    iget v1, p0, Lcom/canhub/cropper/CropImageOptions;->B:I

    iget v3, p1, Lcom/canhub/cropper/CropImageOptions;->B:I

    if-eq v1, v3, :cond_1d

    return v2

    :cond_1d
    iget v1, p0, Lcom/canhub/cropper/CropImageOptions;->C:I

    iget v3, p1, Lcom/canhub/cropper/CropImageOptions;->C:I

    if-eq v1, v3, :cond_1e

    return v2

    :cond_1e
    iget v1, p0, Lcom/canhub/cropper/CropImageOptions;->D:F

    iget v3, p1, Lcom/canhub/cropper/CropImageOptions;->D:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_1f

    return v2

    :cond_1f
    iget v1, p0, Lcom/canhub/cropper/CropImageOptions;->E:I

    iget v3, p1, Lcom/canhub/cropper/CropImageOptions;->E:I

    if-eq v1, v3, :cond_20

    return v2

    :cond_20
    iget v1, p0, Lcom/canhub/cropper/CropImageOptions;->F:I

    iget v3, p1, Lcom/canhub/cropper/CropImageOptions;->F:I

    if-eq v1, v3, :cond_21

    return v2

    :cond_21
    iget v1, p0, Lcom/canhub/cropper/CropImageOptions;->G:I

    iget v3, p1, Lcom/canhub/cropper/CropImageOptions;->G:I

    if-eq v1, v3, :cond_22

    return v2

    :cond_22
    iget v1, p0, Lcom/canhub/cropper/CropImageOptions;->H:I

    iget v3, p1, Lcom/canhub/cropper/CropImageOptions;->H:I

    if-eq v1, v3, :cond_23

    return v2

    :cond_23
    iget v1, p0, Lcom/canhub/cropper/CropImageOptions;->I:I

    iget v3, p1, Lcom/canhub/cropper/CropImageOptions;->I:I

    if-eq v1, v3, :cond_24

    return v2

    :cond_24
    iget v1, p0, Lcom/canhub/cropper/CropImageOptions;->J:I

    iget v3, p1, Lcom/canhub/cropper/CropImageOptions;->J:I

    if-eq v1, v3, :cond_25

    return v2

    :cond_25
    iget v1, p0, Lcom/canhub/cropper/CropImageOptions;->K:I

    iget v3, p1, Lcom/canhub/cropper/CropImageOptions;->K:I

    if-eq v1, v3, :cond_26

    return v2

    :cond_26
    iget v1, p0, Lcom/canhub/cropper/CropImageOptions;->L:I

    iget v3, p1, Lcom/canhub/cropper/CropImageOptions;->L:I

    if-eq v1, v3, :cond_27

    return v2

    :cond_27
    iget-object v1, p0, Lcom/canhub/cropper/CropImageOptions;->M:Ljava/lang/CharSequence;

    iget-object v3, p1, Lcom/canhub/cropper/CropImageOptions;->M:Ljava/lang/CharSequence;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_28

    return v2

    :cond_28
    iget v1, p0, Lcom/canhub/cropper/CropImageOptions;->N:I

    iget v3, p1, Lcom/canhub/cropper/CropImageOptions;->N:I

    if-eq v1, v3, :cond_29

    return v2

    :cond_29
    iget-object v1, p0, Lcom/canhub/cropper/CropImageOptions;->O:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/canhub/cropper/CropImageOptions;->O:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2a

    return v2

    :cond_2a
    iget-object v1, p0, Lcom/canhub/cropper/CropImageOptions;->P:Landroid/net/Uri;

    iget-object v3, p1, Lcom/canhub/cropper/CropImageOptions;->P:Landroid/net/Uri;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2b

    return v2

    :cond_2b
    iget-object v1, p0, Lcom/canhub/cropper/CropImageOptions;->Q:Landroid/graphics/Bitmap$CompressFormat;

    iget-object v3, p1, Lcom/canhub/cropper/CropImageOptions;->Q:Landroid/graphics/Bitmap$CompressFormat;

    if-eq v1, v3, :cond_2c

    return v2

    :cond_2c
    iget v1, p0, Lcom/canhub/cropper/CropImageOptions;->R:I

    iget v3, p1, Lcom/canhub/cropper/CropImageOptions;->R:I

    if-eq v1, v3, :cond_2d

    return v2

    :cond_2d
    iget v1, p0, Lcom/canhub/cropper/CropImageOptions;->S:I

    iget v3, p1, Lcom/canhub/cropper/CropImageOptions;->S:I

    if-eq v1, v3, :cond_2e

    return v2

    :cond_2e
    iget v1, p0, Lcom/canhub/cropper/CropImageOptions;->T:I

    iget v3, p1, Lcom/canhub/cropper/CropImageOptions;->T:I

    if-eq v1, v3, :cond_2f

    return v2

    :cond_2f
    iget-object v1, p0, Lcom/canhub/cropper/CropImageOptions;->U:Lcom/canhub/cropper/CropImageView$RequestSizeOptions;

    iget-object v3, p1, Lcom/canhub/cropper/CropImageOptions;->U:Lcom/canhub/cropper/CropImageView$RequestSizeOptions;

    if-eq v1, v3, :cond_30

    return v2

    :cond_30
    iget-boolean v1, p0, Lcom/canhub/cropper/CropImageOptions;->V:Z

    iget-boolean v3, p1, Lcom/canhub/cropper/CropImageOptions;->V:Z

    if-eq v1, v3, :cond_31

    return v2

    :cond_31
    iget-object v1, p0, Lcom/canhub/cropper/CropImageOptions;->W:Landroid/graphics/Rect;

    iget-object v3, p1, Lcom/canhub/cropper/CropImageOptions;->W:Landroid/graphics/Rect;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_32

    return v2

    :cond_32
    iget v1, p0, Lcom/canhub/cropper/CropImageOptions;->X:I

    iget v3, p1, Lcom/canhub/cropper/CropImageOptions;->X:I

    if-eq v1, v3, :cond_33

    return v2

    :cond_33
    iget-boolean v1, p0, Lcom/canhub/cropper/CropImageOptions;->Y:Z

    iget-boolean v3, p1, Lcom/canhub/cropper/CropImageOptions;->Y:Z

    if-eq v1, v3, :cond_34

    return v2

    :cond_34
    iget-boolean v1, p0, Lcom/canhub/cropper/CropImageOptions;->Z:Z

    iget-boolean v3, p1, Lcom/canhub/cropper/CropImageOptions;->Z:Z

    if-eq v1, v3, :cond_35

    return v2

    :cond_35
    iget-boolean v1, p0, Lcom/canhub/cropper/CropImageOptions;->c0:Z

    iget-boolean v3, p1, Lcom/canhub/cropper/CropImageOptions;->c0:Z

    if-eq v1, v3, :cond_36

    return v2

    :cond_36
    iget v1, p0, Lcom/canhub/cropper/CropImageOptions;->d0:I

    iget v3, p1, Lcom/canhub/cropper/CropImageOptions;->d0:I

    if-eq v1, v3, :cond_37

    return v2

    :cond_37
    iget-boolean v1, p0, Lcom/canhub/cropper/CropImageOptions;->e0:Z

    iget-boolean v3, p1, Lcom/canhub/cropper/CropImageOptions;->e0:Z

    if-eq v1, v3, :cond_38

    return v2

    :cond_38
    iget-boolean v1, p0, Lcom/canhub/cropper/CropImageOptions;->f0:Z

    iget-boolean v3, p1, Lcom/canhub/cropper/CropImageOptions;->f0:Z

    if-eq v1, v3, :cond_39

    return v2

    :cond_39
    iget-object v1, p0, Lcom/canhub/cropper/CropImageOptions;->g0:Ljava/lang/CharSequence;

    iget-object v3, p1, Lcom/canhub/cropper/CropImageOptions;->g0:Ljava/lang/CharSequence;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3a

    return v2

    :cond_3a
    iget v1, p0, Lcom/canhub/cropper/CropImageOptions;->h0:I

    iget v3, p1, Lcom/canhub/cropper/CropImageOptions;->h0:I

    if-eq v1, v3, :cond_3b

    return v2

    :cond_3b
    iget-boolean v1, p0, Lcom/canhub/cropper/CropImageOptions;->i0:Z

    iget-boolean v3, p1, Lcom/canhub/cropper/CropImageOptions;->i0:Z

    if-eq v1, v3, :cond_3c

    return v2

    :cond_3c
    iget-boolean v1, p0, Lcom/canhub/cropper/CropImageOptions;->j0:Z

    iget-boolean v3, p1, Lcom/canhub/cropper/CropImageOptions;->j0:Z

    if-eq v1, v3, :cond_3d

    return v2

    :cond_3d
    iget-object v1, p0, Lcom/canhub/cropper/CropImageOptions;->k0:Ljava/lang/String;

    iget-object v3, p1, Lcom/canhub/cropper/CropImageOptions;->k0:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3e

    return v2

    :cond_3e
    iget-object v1, p0, Lcom/canhub/cropper/CropImageOptions;->l0:Ljava/util/List;

    iget-object v3, p1, Lcom/canhub/cropper/CropImageOptions;->l0:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3f

    return v2

    :cond_3f
    iget v1, p0, Lcom/canhub/cropper/CropImageOptions;->m0:F

    iget v3, p1, Lcom/canhub/cropper/CropImageOptions;->m0:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_40

    return v2

    :cond_40
    iget v1, p0, Lcom/canhub/cropper/CropImageOptions;->n0:I

    iget v3, p1, Lcom/canhub/cropper/CropImageOptions;->n0:I

    if-eq v1, v3, :cond_41

    return v2

    :cond_41
    iget-object v1, p0, Lcom/canhub/cropper/CropImageOptions;->o0:Ljava/lang/String;

    iget-object v3, p1, Lcom/canhub/cropper/CropImageOptions;->o0:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_42

    return v2

    :cond_42
    iget v1, p0, Lcom/canhub/cropper/CropImageOptions;->p0:I

    iget v3, p1, Lcom/canhub/cropper/CropImageOptions;->p0:I

    if-eq v1, v3, :cond_43

    return v2

    :cond_43
    iget-object v1, p0, Lcom/canhub/cropper/CropImageOptions;->q0:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/canhub/cropper/CropImageOptions;->q0:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_44

    return v2

    :cond_44
    iget-object v1, p0, Lcom/canhub/cropper/CropImageOptions;->r0:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/canhub/cropper/CropImageOptions;->r0:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_45

    return v2

    :cond_45
    iget-object v1, p0, Lcom/canhub/cropper/CropImageOptions;->s0:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/canhub/cropper/CropImageOptions;->s0:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_46

    return v2

    :cond_46
    iget-object v1, p0, Lcom/canhub/cropper/CropImageOptions;->t0:Ljava/lang/Integer;

    iget-object p1, p1, Lcom/canhub/cropper/CropImageOptions;->t0:Ljava/lang/Integer;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_47

    return v2

    :cond_47
    return v0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/canhub/cropper/CropImageOptions;->a:Z

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget-boolean v2, p0, Lcom/canhub/cropper/CropImageOptions;->b:Z

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, Lcom/canhub/cropper/CropImageOptions;->c:Lcom/canhub/cropper/CropImageView$CropShape;

    .line 17
    .line 18
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    add-int/2addr v2, v0

    .line 23
    mul-int/2addr v2, v1

    .line 24
    iget-object v0, p0, Lcom/canhub/cropper/CropImageOptions;->d:Lcom/canhub/cropper/CropImageView$CropCornerShape;

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    add-int/2addr v0, v2

    .line 31
    mul-int/2addr v0, v1

    .line 32
    iget v2, p0, Lcom/canhub/cropper/CropImageOptions;->e:F

    .line 33
    .line 34
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->b(FII)I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    iget v2, p0, Lcom/canhub/cropper/CropImageOptions;->f:F

    .line 39
    .line 40
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->b(FII)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    iget v2, p0, Lcom/canhub/cropper/CropImageOptions;->g:F

    .line 45
    .line 46
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->b(FII)I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    iget-object v2, p0, Lcom/canhub/cropper/CropImageOptions;->h:Lcom/canhub/cropper/CropImageView$Guidelines;

    .line 51
    .line 52
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    add-int/2addr v2, v0

    .line 57
    mul-int/2addr v2, v1

    .line 58
    iget-object v0, p0, Lcom/canhub/cropper/CropImageOptions;->i:Lcom/canhub/cropper/CropImageView$ScaleType;

    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    add-int/2addr v0, v2

    .line 65
    mul-int/2addr v0, v1

    .line 66
    iget-boolean v2, p0, Lcom/canhub/cropper/CropImageOptions;->j:Z

    .line 67
    .line 68
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    iget-boolean v2, p0, Lcom/canhub/cropper/CropImageOptions;->k:Z

    .line 73
    .line 74
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    iget-boolean v2, p0, Lcom/canhub/cropper/CropImageOptions;->l:Z

    .line 79
    .line 80
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    iget v2, p0, Lcom/canhub/cropper/CropImageOptions;->m:I

    .line 85
    .line 86
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->c(III)I

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    iget-boolean v2, p0, Lcom/canhub/cropper/CropImageOptions;->n:Z

    .line 91
    .line 92
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    iget-boolean v2, p0, Lcom/canhub/cropper/CropImageOptions;->o:Z

    .line 97
    .line 98
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    iget-boolean v2, p0, Lcom/canhub/cropper/CropImageOptions;->p:Z

    .line 103
    .line 104
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    iget-boolean v2, p0, Lcom/canhub/cropper/CropImageOptions;->q:Z

    .line 109
    .line 110
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    iget v2, p0, Lcom/canhub/cropper/CropImageOptions;->r:I

    .line 115
    .line 116
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->c(III)I

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    iget v2, p0, Lcom/canhub/cropper/CropImageOptions;->s:F

    .line 121
    .line 122
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->b(FII)I

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    iget-boolean v2, p0, Lcom/canhub/cropper/CropImageOptions;->t:Z

    .line 127
    .line 128
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    iget v2, p0, Lcom/canhub/cropper/CropImageOptions;->u:I

    .line 133
    .line 134
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->c(III)I

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    iget v2, p0, Lcom/canhub/cropper/CropImageOptions;->v:I

    .line 139
    .line 140
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->c(III)I

    .line 141
    .line 142
    .line 143
    move-result v0

    .line 144
    iget v2, p0, Lcom/canhub/cropper/CropImageOptions;->w:F

    .line 145
    .line 146
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->b(FII)I

    .line 147
    .line 148
    .line 149
    move-result v0

    .line 150
    iget v2, p0, Lcom/canhub/cropper/CropImageOptions;->x:I

    .line 151
    .line 152
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->c(III)I

    .line 153
    .line 154
    .line 155
    move-result v0

    .line 156
    iget v2, p0, Lcom/canhub/cropper/CropImageOptions;->y:F

    .line 157
    .line 158
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->b(FII)I

    .line 159
    .line 160
    .line 161
    move-result v0

    .line 162
    iget v2, p0, Lcom/canhub/cropper/CropImageOptions;->z:F

    .line 163
    .line 164
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->b(FII)I

    .line 165
    .line 166
    .line 167
    move-result v0

    .line 168
    iget v2, p0, Lcom/canhub/cropper/CropImageOptions;->A:F

    .line 169
    .line 170
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->b(FII)I

    .line 171
    .line 172
    .line 173
    move-result v0

    .line 174
    iget v2, p0, Lcom/canhub/cropper/CropImageOptions;->B:I

    .line 175
    .line 176
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->c(III)I

    .line 177
    .line 178
    .line 179
    move-result v0

    .line 180
    iget v2, p0, Lcom/canhub/cropper/CropImageOptions;->C:I

    .line 181
    .line 182
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->c(III)I

    .line 183
    .line 184
    .line 185
    move-result v0

    .line 186
    iget v2, p0, Lcom/canhub/cropper/CropImageOptions;->D:F

    .line 187
    .line 188
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->b(FII)I

    .line 189
    .line 190
    .line 191
    move-result v0

    .line 192
    iget v2, p0, Lcom/canhub/cropper/CropImageOptions;->E:I

    .line 193
    .line 194
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->c(III)I

    .line 195
    .line 196
    .line 197
    move-result v0

    .line 198
    iget v2, p0, Lcom/canhub/cropper/CropImageOptions;->F:I

    .line 199
    .line 200
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->c(III)I

    .line 201
    .line 202
    .line 203
    move-result v0

    .line 204
    iget v2, p0, Lcom/canhub/cropper/CropImageOptions;->G:I

    .line 205
    .line 206
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->c(III)I

    .line 207
    .line 208
    .line 209
    move-result v0

    .line 210
    iget v2, p0, Lcom/canhub/cropper/CropImageOptions;->H:I

    .line 211
    .line 212
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->c(III)I

    .line 213
    .line 214
    .line 215
    move-result v0

    .line 216
    iget v2, p0, Lcom/canhub/cropper/CropImageOptions;->I:I

    .line 217
    .line 218
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->c(III)I

    .line 219
    .line 220
    .line 221
    move-result v0

    .line 222
    iget v2, p0, Lcom/canhub/cropper/CropImageOptions;->J:I

    .line 223
    .line 224
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->c(III)I

    .line 225
    .line 226
    .line 227
    move-result v0

    .line 228
    iget v2, p0, Lcom/canhub/cropper/CropImageOptions;->K:I

    .line 229
    .line 230
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->c(III)I

    .line 231
    .line 232
    .line 233
    move-result v0

    .line 234
    iget v2, p0, Lcom/canhub/cropper/CropImageOptions;->L:I

    .line 235
    .line 236
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->c(III)I

    .line 237
    .line 238
    .line 239
    move-result v0

    .line 240
    iget-object v2, p0, Lcom/canhub/cropper/CropImageOptions;->M:Ljava/lang/CharSequence;

    .line 241
    .line 242
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 243
    .line 244
    .line 245
    move-result v2

    .line 246
    add-int/2addr v2, v0

    .line 247
    mul-int/2addr v2, v1

    .line 248
    iget v0, p0, Lcom/canhub/cropper/CropImageOptions;->N:I

    .line 249
    .line 250
    invoke-static {v0, v2, v1}, Landroidx/collection/a;->c(III)I

    .line 251
    .line 252
    .line 253
    move-result v0

    .line 254
    const/4 v2, 0x0

    .line 255
    iget-object v3, p0, Lcom/canhub/cropper/CropImageOptions;->O:Ljava/lang/Integer;

    .line 256
    .line 257
    if-nez v3, :cond_0

    .line 258
    .line 259
    move v3, v2

    .line 260
    goto :goto_0

    .line 261
    :cond_0
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 262
    .line 263
    .line 264
    move-result v3

    .line 265
    :goto_0
    add-int/2addr v0, v3

    .line 266
    mul-int/2addr v0, v1

    .line 267
    iget-object v3, p0, Lcom/canhub/cropper/CropImageOptions;->P:Landroid/net/Uri;

    .line 268
    .line 269
    if-nez v3, :cond_1

    .line 270
    .line 271
    move v3, v2

    .line 272
    goto :goto_1

    .line 273
    :cond_1
    invoke-virtual {v3}, Landroid/net/Uri;->hashCode()I

    .line 274
    .line 275
    .line 276
    move-result v3

    .line 277
    :goto_1
    add-int/2addr v0, v3

    .line 278
    mul-int/2addr v0, v1

    .line 279
    iget-object v3, p0, Lcom/canhub/cropper/CropImageOptions;->Q:Landroid/graphics/Bitmap$CompressFormat;

    .line 280
    .line 281
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 282
    .line 283
    .line 284
    move-result v3

    .line 285
    add-int/2addr v3, v0

    .line 286
    mul-int/2addr v3, v1

    .line 287
    iget v0, p0, Lcom/canhub/cropper/CropImageOptions;->R:I

    .line 288
    .line 289
    invoke-static {v0, v3, v1}, Landroidx/collection/a;->c(III)I

    .line 290
    .line 291
    .line 292
    move-result v0

    .line 293
    iget v3, p0, Lcom/canhub/cropper/CropImageOptions;->S:I

    .line 294
    .line 295
    invoke-static {v3, v0, v1}, Landroidx/collection/a;->c(III)I

    .line 296
    .line 297
    .line 298
    move-result v0

    .line 299
    iget v3, p0, Lcom/canhub/cropper/CropImageOptions;->T:I

    .line 300
    .line 301
    invoke-static {v3, v0, v1}, Landroidx/collection/a;->c(III)I

    .line 302
    .line 303
    .line 304
    move-result v0

    .line 305
    iget-object v3, p0, Lcom/canhub/cropper/CropImageOptions;->U:Lcom/canhub/cropper/CropImageView$RequestSizeOptions;

    .line 306
    .line 307
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 308
    .line 309
    .line 310
    move-result v3

    .line 311
    add-int/2addr v3, v0

    .line 312
    mul-int/2addr v3, v1

    .line 313
    iget-boolean v0, p0, Lcom/canhub/cropper/CropImageOptions;->V:Z

    .line 314
    .line 315
    invoke-static {v0, v3, v1}, Landroidx/collection/a;->i(ZII)I

    .line 316
    .line 317
    .line 318
    move-result v0

    .line 319
    iget-object v3, p0, Lcom/canhub/cropper/CropImageOptions;->W:Landroid/graphics/Rect;

    .line 320
    .line 321
    if-nez v3, :cond_2

    .line 322
    .line 323
    move v3, v2

    .line 324
    goto :goto_2

    .line 325
    :cond_2
    invoke-virtual {v3}, Landroid/graphics/Rect;->hashCode()I

    .line 326
    .line 327
    .line 328
    move-result v3

    .line 329
    :goto_2
    add-int/2addr v0, v3

    .line 330
    mul-int/2addr v0, v1

    .line 331
    iget v3, p0, Lcom/canhub/cropper/CropImageOptions;->X:I

    .line 332
    .line 333
    invoke-static {v3, v0, v1}, Landroidx/collection/a;->c(III)I

    .line 334
    .line 335
    .line 336
    move-result v0

    .line 337
    iget-boolean v3, p0, Lcom/canhub/cropper/CropImageOptions;->Y:Z

    .line 338
    .line 339
    invoke-static {v3, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 340
    .line 341
    .line 342
    move-result v0

    .line 343
    iget-boolean v3, p0, Lcom/canhub/cropper/CropImageOptions;->Z:Z

    .line 344
    .line 345
    invoke-static {v3, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 346
    .line 347
    .line 348
    move-result v0

    .line 349
    iget-boolean v3, p0, Lcom/canhub/cropper/CropImageOptions;->c0:Z

    .line 350
    .line 351
    invoke-static {v3, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 352
    .line 353
    .line 354
    move-result v0

    .line 355
    iget v3, p0, Lcom/canhub/cropper/CropImageOptions;->d0:I

    .line 356
    .line 357
    invoke-static {v3, v0, v1}, Landroidx/collection/a;->c(III)I

    .line 358
    .line 359
    .line 360
    move-result v0

    .line 361
    iget-boolean v3, p0, Lcom/canhub/cropper/CropImageOptions;->e0:Z

    .line 362
    .line 363
    invoke-static {v3, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 364
    .line 365
    .line 366
    move-result v0

    .line 367
    iget-boolean v3, p0, Lcom/canhub/cropper/CropImageOptions;->f0:Z

    .line 368
    .line 369
    invoke-static {v3, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 370
    .line 371
    .line 372
    move-result v0

    .line 373
    iget-object v3, p0, Lcom/canhub/cropper/CropImageOptions;->g0:Ljava/lang/CharSequence;

    .line 374
    .line 375
    if-nez v3, :cond_3

    .line 376
    .line 377
    move v3, v2

    .line 378
    goto :goto_3

    .line 379
    :cond_3
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 380
    .line 381
    .line 382
    move-result v3

    .line 383
    :goto_3
    add-int/2addr v0, v3

    .line 384
    mul-int/2addr v0, v1

    .line 385
    iget v3, p0, Lcom/canhub/cropper/CropImageOptions;->h0:I

    .line 386
    .line 387
    invoke-static {v3, v0, v1}, Landroidx/collection/a;->c(III)I

    .line 388
    .line 389
    .line 390
    move-result v0

    .line 391
    iget-boolean v3, p0, Lcom/canhub/cropper/CropImageOptions;->i0:Z

    .line 392
    .line 393
    invoke-static {v3, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 394
    .line 395
    .line 396
    move-result v0

    .line 397
    iget-boolean v3, p0, Lcom/canhub/cropper/CropImageOptions;->j0:Z

    .line 398
    .line 399
    invoke-static {v3, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 400
    .line 401
    .line 402
    move-result v0

    .line 403
    iget-object v3, p0, Lcom/canhub/cropper/CropImageOptions;->k0:Ljava/lang/String;

    .line 404
    .line 405
    if-nez v3, :cond_4

    .line 406
    .line 407
    move v3, v2

    .line 408
    goto :goto_4

    .line 409
    :cond_4
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 410
    .line 411
    .line 412
    move-result v3

    .line 413
    :goto_4
    add-int/2addr v0, v3

    .line 414
    mul-int/2addr v0, v1

    .line 415
    iget-object v3, p0, Lcom/canhub/cropper/CropImageOptions;->l0:Ljava/util/List;

    .line 416
    .line 417
    if-nez v3, :cond_5

    .line 418
    .line 419
    move v3, v2

    .line 420
    goto :goto_5

    .line 421
    :cond_5
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 422
    .line 423
    .line 424
    move-result v3

    .line 425
    :goto_5
    add-int/2addr v0, v3

    .line 426
    mul-int/2addr v0, v1

    .line 427
    iget v3, p0, Lcom/canhub/cropper/CropImageOptions;->m0:F

    .line 428
    .line 429
    invoke-static {v3, v0, v1}, Landroidx/collection/a;->b(FII)I

    .line 430
    .line 431
    .line 432
    move-result v0

    .line 433
    iget v3, p0, Lcom/canhub/cropper/CropImageOptions;->n0:I

    .line 434
    .line 435
    invoke-static {v3, v0, v1}, Landroidx/collection/a;->c(III)I

    .line 436
    .line 437
    .line 438
    move-result v0

    .line 439
    iget-object v3, p0, Lcom/canhub/cropper/CropImageOptions;->o0:Ljava/lang/String;

    .line 440
    .line 441
    if-nez v3, :cond_6

    .line 442
    .line 443
    move v3, v2

    .line 444
    goto :goto_6

    .line 445
    :cond_6
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 446
    .line 447
    .line 448
    move-result v3

    .line 449
    :goto_6
    add-int/2addr v0, v3

    .line 450
    mul-int/2addr v0, v1

    .line 451
    iget v3, p0, Lcom/canhub/cropper/CropImageOptions;->p0:I

    .line 452
    .line 453
    invoke-static {v3, v0, v1}, Landroidx/collection/a;->c(III)I

    .line 454
    .line 455
    .line 456
    move-result v0

    .line 457
    iget-object v3, p0, Lcom/canhub/cropper/CropImageOptions;->q0:Ljava/lang/Integer;

    .line 458
    .line 459
    if-nez v3, :cond_7

    .line 460
    .line 461
    move v3, v2

    .line 462
    goto :goto_7

    .line 463
    :cond_7
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 464
    .line 465
    .line 466
    move-result v3

    .line 467
    :goto_7
    add-int/2addr v0, v3

    .line 468
    mul-int/2addr v0, v1

    .line 469
    iget-object v3, p0, Lcom/canhub/cropper/CropImageOptions;->r0:Ljava/lang/Integer;

    .line 470
    .line 471
    if-nez v3, :cond_8

    .line 472
    .line 473
    move v3, v2

    .line 474
    goto :goto_8

    .line 475
    :cond_8
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 476
    .line 477
    .line 478
    move-result v3

    .line 479
    :goto_8
    add-int/2addr v0, v3

    .line 480
    mul-int/2addr v0, v1

    .line 481
    iget-object v3, p0, Lcom/canhub/cropper/CropImageOptions;->s0:Ljava/lang/Integer;

    .line 482
    .line 483
    if-nez v3, :cond_9

    .line 484
    .line 485
    move v3, v2

    .line 486
    goto :goto_9

    .line 487
    :cond_9
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 488
    .line 489
    .line 490
    move-result v3

    .line 491
    :goto_9
    add-int/2addr v0, v3

    .line 492
    mul-int/2addr v0, v1

    .line 493
    iget-object v1, p0, Lcom/canhub/cropper/CropImageOptions;->t0:Ljava/lang/Integer;

    .line 494
    .line 495
    if-nez v1, :cond_a

    .line 496
    .line 497
    goto :goto_a

    .line 498
    :cond_a
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 499
    .line 500
    .line 501
    move-result v2

    .line 502
    :goto_a
    add-int/2addr v0, v2

    .line 503
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 11

    .line 1
    iget v0, p0, Lcom/canhub/cropper/CropImageOptions;->m:I

    .line 2
    .line 3
    iget-boolean v1, p0, Lcom/canhub/cropper/CropImageOptions;->n:Z

    .line 4
    .line 5
    iget-boolean v2, p0, Lcom/canhub/cropper/CropImageOptions;->o:Z

    .line 6
    .line 7
    iget v3, p0, Lcom/canhub/cropper/CropImageOptions;->s:F

    .line 8
    .line 9
    iget v4, p0, Lcom/canhub/cropper/CropImageOptions;->x:I

    .line 10
    .line 11
    iget v5, p0, Lcom/canhub/cropper/CropImageOptions;->B:I

    .line 12
    .line 13
    new-instance v6, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v7, "CropImageOptions(imageSourceIncludeGallery="

    .line 16
    .line 17
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iget-boolean v7, p0, Lcom/canhub/cropper/CropImageOptions;->a:Z

    .line 21
    .line 22
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v7, ", imageSourceIncludeCamera="

    .line 26
    .line 27
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    iget-boolean v7, p0, Lcom/canhub/cropper/CropImageOptions;->b:Z

    .line 31
    .line 32
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string v7, ", cropShape="

    .line 36
    .line 37
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    iget-object v7, p0, Lcom/canhub/cropper/CropImageOptions;->c:Lcom/canhub/cropper/CropImageView$CropShape;

    .line 41
    .line 42
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string v7, ", cornerShape="

    .line 46
    .line 47
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    iget-object v7, p0, Lcom/canhub/cropper/CropImageOptions;->d:Lcom/canhub/cropper/CropImageView$CropCornerShape;

    .line 51
    .line 52
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string v7, ", cropCornerRadius="

    .line 56
    .line 57
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    iget v7, p0, Lcom/canhub/cropper/CropImageOptions;->e:F

    .line 61
    .line 62
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    const-string v7, ", snapRadius="

    .line 66
    .line 67
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    iget v7, p0, Lcom/canhub/cropper/CropImageOptions;->f:F

    .line 71
    .line 72
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    const-string v7, ", touchRadius="

    .line 76
    .line 77
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    iget v7, p0, Lcom/canhub/cropper/CropImageOptions;->g:F

    .line 81
    .line 82
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    const-string v7, ", guidelines="

    .line 86
    .line 87
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    iget-object v7, p0, Lcom/canhub/cropper/CropImageOptions;->h:Lcom/canhub/cropper/CropImageView$Guidelines;

    .line 91
    .line 92
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    const-string v7, ", scaleType="

    .line 96
    .line 97
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    iget-object v7, p0, Lcom/canhub/cropper/CropImageOptions;->i:Lcom/canhub/cropper/CropImageView$ScaleType;

    .line 101
    .line 102
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    const-string v7, ", showCropOverlay="

    .line 106
    .line 107
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    iget-boolean v7, p0, Lcom/canhub/cropper/CropImageOptions;->j:Z

    .line 111
    .line 112
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    const-string v7, ", showCropLabel="

    .line 116
    .line 117
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    const-string v7, ", showProgressBar="

    .line 121
    .line 122
    const-string v8, ", progressBarColor="

    .line 123
    .line 124
    iget-boolean v9, p0, Lcom/canhub/cropper/CropImageOptions;->k:Z

    .line 125
    .line 126
    iget-boolean v10, p0, Lcom/canhub/cropper/CropImageOptions;->l:Z

    .line 127
    .line 128
    invoke-static {v7, v8, v6, v9, v10}, Landroidx/compose/material3/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    const-string v0, ", autoZoomEnabled="

    .line 135
    .line 136
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    const-string v0, ", multiTouchEnabled="

    .line 143
    .line 144
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    const-string v0, ", centerMoveEnabled="

    .line 148
    .line 149
    const-string v1, ", canChangeCropWindow="

    .line 150
    .line 151
    iget-boolean v7, p0, Lcom/canhub/cropper/CropImageOptions;->p:Z

    .line 152
    .line 153
    invoke-static {v0, v1, v6, v2, v7}, Landroidx/compose/material3/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 154
    .line 155
    .line 156
    iget-boolean v0, p0, Lcom/canhub/cropper/CropImageOptions;->q:Z

    .line 157
    .line 158
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    const-string v0, ", maxZoom="

    .line 162
    .line 163
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    iget v0, p0, Lcom/canhub/cropper/CropImageOptions;->r:I

    .line 167
    .line 168
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    const-string v0, ", initialCropWindowPaddingRatio="

    .line 172
    .line 173
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    const-string v0, ", fixAspectRatio="

    .line 180
    .line 181
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    iget-boolean v0, p0, Lcom/canhub/cropper/CropImageOptions;->t:Z

    .line 185
    .line 186
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    const-string v0, ", aspectRatioX="

    .line 190
    .line 191
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    const-string v0, ", aspectRatioY="

    .line 195
    .line 196
    const-string v1, ", borderLineThickness="

    .line 197
    .line 198
    iget v2, p0, Lcom/canhub/cropper/CropImageOptions;->u:I

    .line 199
    .line 200
    iget v3, p0, Lcom/canhub/cropper/CropImageOptions;->v:I

    .line 201
    .line 202
    invoke-static {v6, v2, v0, v3, v1}, Landroidx/compose/material3/c;->w(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    .line 203
    .line 204
    .line 205
    iget v0, p0, Lcom/canhub/cropper/CropImageOptions;->w:F

    .line 206
    .line 207
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 208
    .line 209
    .line 210
    const-string v0, ", borderLineColor="

    .line 211
    .line 212
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 213
    .line 214
    .line 215
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    .line 218
    const-string v0, ", borderCornerThickness="

    .line 219
    .line 220
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 221
    .line 222
    .line 223
    iget v0, p0, Lcom/canhub/cropper/CropImageOptions;->y:F

    .line 224
    .line 225
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 226
    .line 227
    .line 228
    const-string v0, ", borderCornerOffset="

    .line 229
    .line 230
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 231
    .line 232
    .line 233
    iget v0, p0, Lcom/canhub/cropper/CropImageOptions;->z:F

    .line 234
    .line 235
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 236
    .line 237
    .line 238
    const-string v0, ", borderCornerLength="

    .line 239
    .line 240
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 241
    .line 242
    .line 243
    iget v0, p0, Lcom/canhub/cropper/CropImageOptions;->A:F

    .line 244
    .line 245
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 246
    .line 247
    .line 248
    const-string v0, ", borderCornerColor="

    .line 249
    .line 250
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 251
    .line 252
    .line 253
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 254
    .line 255
    .line 256
    const-string v0, ", circleCornerFillColorHexValue="

    .line 257
    .line 258
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 259
    .line 260
    .line 261
    iget v0, p0, Lcom/canhub/cropper/CropImageOptions;->C:I

    .line 262
    .line 263
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 264
    .line 265
    .line 266
    const-string v0, ", guidelinesThickness="

    .line 267
    .line 268
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 269
    .line 270
    .line 271
    iget v0, p0, Lcom/canhub/cropper/CropImageOptions;->D:F

    .line 272
    .line 273
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 274
    .line 275
    .line 276
    const-string v0, ", guidelinesColor="

    .line 277
    .line 278
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 279
    .line 280
    .line 281
    const-string v0, ", backgroundColor="

    .line 282
    .line 283
    const-string v1, ", minCropWindowWidth="

    .line 284
    .line 285
    iget v2, p0, Lcom/canhub/cropper/CropImageOptions;->E:I

    .line 286
    .line 287
    iget v3, p0, Lcom/canhub/cropper/CropImageOptions;->F:I

    .line 288
    .line 289
    invoke-static {v6, v2, v0, v3, v1}, Landroidx/compose/material3/c;->w(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    .line 290
    .line 291
    .line 292
    const-string v0, ", minCropWindowHeight="

    .line 293
    .line 294
    const-string v1, ", minCropResultWidth="

    .line 295
    .line 296
    iget v2, p0, Lcom/canhub/cropper/CropImageOptions;->G:I

    .line 297
    .line 298
    iget v3, p0, Lcom/canhub/cropper/CropImageOptions;->H:I

    .line 299
    .line 300
    invoke-static {v6, v2, v0, v3, v1}, Landroidx/compose/material3/c;->w(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    .line 301
    .line 302
    .line 303
    const-string v0, ", minCropResultHeight="

    .line 304
    .line 305
    const-string v1, ", maxCropResultWidth="

    .line 306
    .line 307
    iget v2, p0, Lcom/canhub/cropper/CropImageOptions;->I:I

    .line 308
    .line 309
    iget v3, p0, Lcom/canhub/cropper/CropImageOptions;->J:I

    .line 310
    .line 311
    invoke-static {v6, v2, v0, v3, v1}, Landroidx/compose/material3/c;->w(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    .line 312
    .line 313
    .line 314
    const-string v0, ", maxCropResultHeight="

    .line 315
    .line 316
    const-string v1, ", activityTitle="

    .line 317
    .line 318
    iget v2, p0, Lcom/canhub/cropper/CropImageOptions;->K:I

    .line 319
    .line 320
    iget v3, p0, Lcom/canhub/cropper/CropImageOptions;->L:I

    .line 321
    .line 322
    invoke-static {v6, v2, v0, v3, v1}, Landroidx/compose/material3/c;->w(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    .line 323
    .line 324
    .line 325
    iget-object v0, p0, Lcom/canhub/cropper/CropImageOptions;->M:Ljava/lang/CharSequence;

    .line 326
    .line 327
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 328
    .line 329
    .line 330
    const-string v0, ", activityMenuIconColor="

    .line 331
    .line 332
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 333
    .line 334
    .line 335
    iget v0, p0, Lcom/canhub/cropper/CropImageOptions;->N:I

    .line 336
    .line 337
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 338
    .line 339
    .line 340
    const-string v0, ", activityMenuTextColor="

    .line 341
    .line 342
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 343
    .line 344
    .line 345
    iget-object v0, p0, Lcom/canhub/cropper/CropImageOptions;->O:Ljava/lang/Integer;

    .line 346
    .line 347
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 348
    .line 349
    .line 350
    const-string v0, ", customOutputUri="

    .line 351
    .line 352
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 353
    .line 354
    .line 355
    iget-object v0, p0, Lcom/canhub/cropper/CropImageOptions;->P:Landroid/net/Uri;

    .line 356
    .line 357
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 358
    .line 359
    .line 360
    const-string v0, ", outputCompressFormat="

    .line 361
    .line 362
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 363
    .line 364
    .line 365
    iget-object v0, p0, Lcom/canhub/cropper/CropImageOptions;->Q:Landroid/graphics/Bitmap$CompressFormat;

    .line 366
    .line 367
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 368
    .line 369
    .line 370
    const-string v0, ", outputCompressQuality="

    .line 371
    .line 372
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 373
    .line 374
    .line 375
    iget v0, p0, Lcom/canhub/cropper/CropImageOptions;->R:I

    .line 376
    .line 377
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 378
    .line 379
    .line 380
    const-string v0, ", outputRequestWidth="

    .line 381
    .line 382
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 383
    .line 384
    .line 385
    const-string v0, ", outputRequestHeight="

    .line 386
    .line 387
    const-string v1, ", outputRequestSizeOptions="

    .line 388
    .line 389
    iget v2, p0, Lcom/canhub/cropper/CropImageOptions;->S:I

    .line 390
    .line 391
    iget v3, p0, Lcom/canhub/cropper/CropImageOptions;->T:I

    .line 392
    .line 393
    invoke-static {v6, v2, v0, v3, v1}, Landroidx/compose/material3/c;->w(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    .line 394
    .line 395
    .line 396
    iget-object v0, p0, Lcom/canhub/cropper/CropImageOptions;->U:Lcom/canhub/cropper/CropImageView$RequestSizeOptions;

    .line 397
    .line 398
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 399
    .line 400
    .line 401
    const-string v0, ", noOutputImage="

    .line 402
    .line 403
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 404
    .line 405
    .line 406
    iget-boolean v0, p0, Lcom/canhub/cropper/CropImageOptions;->V:Z

    .line 407
    .line 408
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 409
    .line 410
    .line 411
    const-string v0, ", initialCropWindowRectangle="

    .line 412
    .line 413
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 414
    .line 415
    .line 416
    iget-object v0, p0, Lcom/canhub/cropper/CropImageOptions;->W:Landroid/graphics/Rect;

    .line 417
    .line 418
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 419
    .line 420
    .line 421
    const-string v0, ", initialRotation="

    .line 422
    .line 423
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 424
    .line 425
    .line 426
    iget v0, p0, Lcom/canhub/cropper/CropImageOptions;->X:I

    .line 427
    .line 428
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 429
    .line 430
    .line 431
    const-string v0, ", allowRotation="

    .line 432
    .line 433
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 434
    .line 435
    .line 436
    const-string v0, ", allowFlipping="

    .line 437
    .line 438
    const-string v1, ", allowCounterRotation="

    .line 439
    .line 440
    iget-boolean v2, p0, Lcom/canhub/cropper/CropImageOptions;->Y:Z

    .line 441
    .line 442
    iget-boolean v3, p0, Lcom/canhub/cropper/CropImageOptions;->Z:Z

    .line 443
    .line 444
    invoke-static {v0, v1, v6, v2, v3}, Landroidx/compose/material3/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 445
    .line 446
    .line 447
    iget-boolean v0, p0, Lcom/canhub/cropper/CropImageOptions;->c0:Z

    .line 448
    .line 449
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 450
    .line 451
    .line 452
    const-string v0, ", rotationDegrees="

    .line 453
    .line 454
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 455
    .line 456
    .line 457
    iget v0, p0, Lcom/canhub/cropper/CropImageOptions;->d0:I

    .line 458
    .line 459
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 460
    .line 461
    .line 462
    const-string v0, ", flipHorizontally="

    .line 463
    .line 464
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 465
    .line 466
    .line 467
    const-string v0, ", flipVertically="

    .line 468
    .line 469
    const-string v1, ", cropMenuCropButtonTitle="

    .line 470
    .line 471
    iget-boolean v2, p0, Lcom/canhub/cropper/CropImageOptions;->e0:Z

    .line 472
    .line 473
    iget-boolean v3, p0, Lcom/canhub/cropper/CropImageOptions;->f0:Z

    .line 474
    .line 475
    invoke-static {v0, v1, v6, v2, v3}, Landroidx/compose/material3/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 476
    .line 477
    .line 478
    iget-object v0, p0, Lcom/canhub/cropper/CropImageOptions;->g0:Ljava/lang/CharSequence;

    .line 479
    .line 480
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 481
    .line 482
    .line 483
    const-string v0, ", cropMenuCropButtonIcon="

    .line 484
    .line 485
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 486
    .line 487
    .line 488
    iget v0, p0, Lcom/canhub/cropper/CropImageOptions;->h0:I

    .line 489
    .line 490
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 491
    .line 492
    .line 493
    const-string v0, ", skipEditing="

    .line 494
    .line 495
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 496
    .line 497
    .line 498
    const-string v0, ", showIntentChooser="

    .line 499
    .line 500
    const-string v1, ", intentChooserTitle="

    .line 501
    .line 502
    iget-boolean v2, p0, Lcom/canhub/cropper/CropImageOptions;->i0:Z

    .line 503
    .line 504
    iget-boolean v3, p0, Lcom/canhub/cropper/CropImageOptions;->j0:Z

    .line 505
    .line 506
    invoke-static {v0, v1, v6, v2, v3}, Landroidx/compose/material3/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 507
    .line 508
    .line 509
    iget-object v0, p0, Lcom/canhub/cropper/CropImageOptions;->k0:Ljava/lang/String;

    .line 510
    .line 511
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 512
    .line 513
    .line 514
    const-string v0, ", intentChooserPriorityList="

    .line 515
    .line 516
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 517
    .line 518
    .line 519
    iget-object v0, p0, Lcom/canhub/cropper/CropImageOptions;->l0:Ljava/util/List;

    .line 520
    .line 521
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 522
    .line 523
    .line 524
    const-string v0, ", cropperLabelTextSize="

    .line 525
    .line 526
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 527
    .line 528
    .line 529
    iget v0, p0, Lcom/canhub/cropper/CropImageOptions;->m0:F

    .line 530
    .line 531
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 532
    .line 533
    .line 534
    const-string v0, ", cropperLabelTextColor="

    .line 535
    .line 536
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 537
    .line 538
    .line 539
    iget v0, p0, Lcom/canhub/cropper/CropImageOptions;->n0:I

    .line 540
    .line 541
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 542
    .line 543
    .line 544
    const-string v0, ", cropperLabelText="

    .line 545
    .line 546
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 547
    .line 548
    .line 549
    iget-object v0, p0, Lcom/canhub/cropper/CropImageOptions;->o0:Ljava/lang/String;

    .line 550
    .line 551
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 552
    .line 553
    .line 554
    const-string v0, ", activityBackgroundColor="

    .line 555
    .line 556
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 557
    .line 558
    .line 559
    iget v0, p0, Lcom/canhub/cropper/CropImageOptions;->p0:I

    .line 560
    .line 561
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 562
    .line 563
    .line 564
    const-string v0, ", toolbarColor="

    .line 565
    .line 566
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 567
    .line 568
    .line 569
    iget-object v0, p0, Lcom/canhub/cropper/CropImageOptions;->q0:Ljava/lang/Integer;

    .line 570
    .line 571
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 572
    .line 573
    .line 574
    const-string v0, ", toolbarTitleColor="

    .line 575
    .line 576
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 577
    .line 578
    .line 579
    iget-object v0, p0, Lcom/canhub/cropper/CropImageOptions;->r0:Ljava/lang/Integer;

    .line 580
    .line 581
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 582
    .line 583
    .line 584
    const-string v0, ", toolbarBackButtonColor="

    .line 585
    .line 586
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 587
    .line 588
    .line 589
    iget-object v0, p0, Lcom/canhub/cropper/CropImageOptions;->s0:Ljava/lang/Integer;

    .line 590
    .line 591
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 592
    .line 593
    .line 594
    const-string v0, ", toolbarTintColor="

    .line 595
    .line 596
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 597
    .line 598
    .line 599
    iget-object v0, p0, Lcom/canhub/cropper/CropImageOptions;->t0:Ljava/lang/Integer;

    .line 600
    .line 601
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 602
    .line 603
    .line 604
    const-string v0, ")"

    .line 605
    .line 606
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 607
    .line 608
    .line 609
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 610
    .line 611
    .line 612
    move-result-object v0

    .line 613
    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    .line 1
    const-string v0, "dest"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lcom/canhub/cropper/CropImageOptions;->a:Z

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 9
    .line 10
    .line 11
    iget-boolean v0, p0, Lcom/canhub/cropper/CropImageOptions;->b:Z

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/canhub/cropper/CropImageOptions;->c:Lcom/canhub/cropper/CropImageView$CropShape;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Lcom/canhub/cropper/CropImageOptions;->d:Lcom/canhub/cropper/CropImageView$CropCornerShape;

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    iget v0, p0, Lcom/canhub/cropper/CropImageOptions;->e:F

    .line 35
    .line 36
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    .line 37
    .line 38
    .line 39
    iget v0, p0, Lcom/canhub/cropper/CropImageOptions;->f:F

    .line 40
    .line 41
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    .line 42
    .line 43
    .line 44
    iget v0, p0, Lcom/canhub/cropper/CropImageOptions;->g:F

    .line 45
    .line 46
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    .line 47
    .line 48
    .line 49
    iget-object v0, p0, Lcom/canhub/cropper/CropImageOptions;->h:Lcom/canhub/cropper/CropImageView$Guidelines;

    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    iget-object v0, p0, Lcom/canhub/cropper/CropImageOptions;->i:Lcom/canhub/cropper/CropImageView$ScaleType;

    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    iget-boolean v0, p0, Lcom/canhub/cropper/CropImageOptions;->j:Z

    .line 68
    .line 69
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 70
    .line 71
    .line 72
    iget-boolean v0, p0, Lcom/canhub/cropper/CropImageOptions;->k:Z

    .line 73
    .line 74
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 75
    .line 76
    .line 77
    iget-boolean v0, p0, Lcom/canhub/cropper/CropImageOptions;->l:Z

    .line 78
    .line 79
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 80
    .line 81
    .line 82
    iget v0, p0, Lcom/canhub/cropper/CropImageOptions;->m:I

    .line 83
    .line 84
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 85
    .line 86
    .line 87
    iget-boolean v0, p0, Lcom/canhub/cropper/CropImageOptions;->n:Z

    .line 88
    .line 89
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 90
    .line 91
    .line 92
    iget-boolean v0, p0, Lcom/canhub/cropper/CropImageOptions;->o:Z

    .line 93
    .line 94
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 95
    .line 96
    .line 97
    iget-boolean v0, p0, Lcom/canhub/cropper/CropImageOptions;->p:Z

    .line 98
    .line 99
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 100
    .line 101
    .line 102
    iget-boolean v0, p0, Lcom/canhub/cropper/CropImageOptions;->q:Z

    .line 103
    .line 104
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 105
    .line 106
    .line 107
    iget v0, p0, Lcom/canhub/cropper/CropImageOptions;->r:I

    .line 108
    .line 109
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 110
    .line 111
    .line 112
    iget v0, p0, Lcom/canhub/cropper/CropImageOptions;->s:F

    .line 113
    .line 114
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    .line 115
    .line 116
    .line 117
    iget-boolean v0, p0, Lcom/canhub/cropper/CropImageOptions;->t:Z

    .line 118
    .line 119
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 120
    .line 121
    .line 122
    iget v0, p0, Lcom/canhub/cropper/CropImageOptions;->u:I

    .line 123
    .line 124
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 125
    .line 126
    .line 127
    iget v0, p0, Lcom/canhub/cropper/CropImageOptions;->v:I

    .line 128
    .line 129
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 130
    .line 131
    .line 132
    iget v0, p0, Lcom/canhub/cropper/CropImageOptions;->w:F

    .line 133
    .line 134
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    .line 135
    .line 136
    .line 137
    iget v0, p0, Lcom/canhub/cropper/CropImageOptions;->x:I

    .line 138
    .line 139
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 140
    .line 141
    .line 142
    iget v0, p0, Lcom/canhub/cropper/CropImageOptions;->y:F

    .line 143
    .line 144
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    .line 145
    .line 146
    .line 147
    iget v0, p0, Lcom/canhub/cropper/CropImageOptions;->z:F

    .line 148
    .line 149
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    .line 150
    .line 151
    .line 152
    iget v0, p0, Lcom/canhub/cropper/CropImageOptions;->A:F

    .line 153
    .line 154
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    .line 155
    .line 156
    .line 157
    iget v0, p0, Lcom/canhub/cropper/CropImageOptions;->B:I

    .line 158
    .line 159
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 160
    .line 161
    .line 162
    iget v0, p0, Lcom/canhub/cropper/CropImageOptions;->C:I

    .line 163
    .line 164
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 165
    .line 166
    .line 167
    iget v0, p0, Lcom/canhub/cropper/CropImageOptions;->D:F

    .line 168
    .line 169
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    .line 170
    .line 171
    .line 172
    iget v0, p0, Lcom/canhub/cropper/CropImageOptions;->E:I

    .line 173
    .line 174
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 175
    .line 176
    .line 177
    iget v0, p0, Lcom/canhub/cropper/CropImageOptions;->F:I

    .line 178
    .line 179
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 180
    .line 181
    .line 182
    iget v0, p0, Lcom/canhub/cropper/CropImageOptions;->G:I

    .line 183
    .line 184
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 185
    .line 186
    .line 187
    iget v0, p0, Lcom/canhub/cropper/CropImageOptions;->H:I

    .line 188
    .line 189
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 190
    .line 191
    .line 192
    iget v0, p0, Lcom/canhub/cropper/CropImageOptions;->I:I

    .line 193
    .line 194
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 195
    .line 196
    .line 197
    iget v0, p0, Lcom/canhub/cropper/CropImageOptions;->J:I

    .line 198
    .line 199
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 200
    .line 201
    .line 202
    iget v0, p0, Lcom/canhub/cropper/CropImageOptions;->K:I

    .line 203
    .line 204
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 205
    .line 206
    .line 207
    iget v0, p0, Lcom/canhub/cropper/CropImageOptions;->L:I

    .line 208
    .line 209
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 210
    .line 211
    .line 212
    iget-object v0, p0, Lcom/canhub/cropper/CropImageOptions;->M:Ljava/lang/CharSequence;

    .line 213
    .line 214
    invoke-static {v0, p1, p2}, Landroid/text/TextUtils;->writeToParcel(Ljava/lang/CharSequence;Landroid/os/Parcel;I)V

    .line 215
    .line 216
    .line 217
    iget v0, p0, Lcom/canhub/cropper/CropImageOptions;->N:I

    .line 218
    .line 219
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 220
    .line 221
    .line 222
    const/4 v0, 0x1

    .line 223
    const/4 v1, 0x0

    .line 224
    iget-object v2, p0, Lcom/canhub/cropper/CropImageOptions;->O:Ljava/lang/Integer;

    .line 225
    .line 226
    if-nez v2, :cond_0

    .line 227
    .line 228
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 229
    .line 230
    .line 231
    goto :goto_0

    .line 232
    :cond_0
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 236
    .line 237
    .line 238
    move-result v2

    .line 239
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 240
    .line 241
    .line 242
    :goto_0
    iget-object v2, p0, Lcom/canhub/cropper/CropImageOptions;->P:Landroid/net/Uri;

    .line 243
    .line 244
    invoke-virtual {p1, v2, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 245
    .line 246
    .line 247
    iget-object v2, p0, Lcom/canhub/cropper/CropImageOptions;->Q:Landroid/graphics/Bitmap$CompressFormat;

    .line 248
    .line 249
    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v2

    .line 253
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    iget v2, p0, Lcom/canhub/cropper/CropImageOptions;->R:I

    .line 257
    .line 258
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 259
    .line 260
    .line 261
    iget v2, p0, Lcom/canhub/cropper/CropImageOptions;->S:I

    .line 262
    .line 263
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 264
    .line 265
    .line 266
    iget v2, p0, Lcom/canhub/cropper/CropImageOptions;->T:I

    .line 267
    .line 268
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 269
    .line 270
    .line 271
    iget-object v2, p0, Lcom/canhub/cropper/CropImageOptions;->U:Lcom/canhub/cropper/CropImageView$RequestSizeOptions;

    .line 272
    .line 273
    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v2

    .line 277
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 278
    .line 279
    .line 280
    iget-boolean v2, p0, Lcom/canhub/cropper/CropImageOptions;->V:Z

    .line 281
    .line 282
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 283
    .line 284
    .line 285
    iget-object v2, p0, Lcom/canhub/cropper/CropImageOptions;->W:Landroid/graphics/Rect;

    .line 286
    .line 287
    invoke-virtual {p1, v2, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 288
    .line 289
    .line 290
    iget v2, p0, Lcom/canhub/cropper/CropImageOptions;->X:I

    .line 291
    .line 292
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 293
    .line 294
    .line 295
    iget-boolean v2, p0, Lcom/canhub/cropper/CropImageOptions;->Y:Z

    .line 296
    .line 297
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 298
    .line 299
    .line 300
    iget-boolean v2, p0, Lcom/canhub/cropper/CropImageOptions;->Z:Z

    .line 301
    .line 302
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 303
    .line 304
    .line 305
    iget-boolean v2, p0, Lcom/canhub/cropper/CropImageOptions;->c0:Z

    .line 306
    .line 307
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 308
    .line 309
    .line 310
    iget v2, p0, Lcom/canhub/cropper/CropImageOptions;->d0:I

    .line 311
    .line 312
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 313
    .line 314
    .line 315
    iget-boolean v2, p0, Lcom/canhub/cropper/CropImageOptions;->e0:Z

    .line 316
    .line 317
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 318
    .line 319
    .line 320
    iget-boolean v2, p0, Lcom/canhub/cropper/CropImageOptions;->f0:Z

    .line 321
    .line 322
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 323
    .line 324
    .line 325
    iget-object v2, p0, Lcom/canhub/cropper/CropImageOptions;->g0:Ljava/lang/CharSequence;

    .line 326
    .line 327
    invoke-static {v2, p1, p2}, Landroid/text/TextUtils;->writeToParcel(Ljava/lang/CharSequence;Landroid/os/Parcel;I)V

    .line 328
    .line 329
    .line 330
    iget p2, p0, Lcom/canhub/cropper/CropImageOptions;->h0:I

    .line 331
    .line 332
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 333
    .line 334
    .line 335
    iget-boolean p2, p0, Lcom/canhub/cropper/CropImageOptions;->i0:Z

    .line 336
    .line 337
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 338
    .line 339
    .line 340
    iget-boolean p2, p0, Lcom/canhub/cropper/CropImageOptions;->j0:Z

    .line 341
    .line 342
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 343
    .line 344
    .line 345
    iget-object p2, p0, Lcom/canhub/cropper/CropImageOptions;->k0:Ljava/lang/String;

    .line 346
    .line 347
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 348
    .line 349
    .line 350
    iget-object p2, p0, Lcom/canhub/cropper/CropImageOptions;->l0:Ljava/util/List;

    .line 351
    .line 352
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    .line 353
    .line 354
    .line 355
    iget p2, p0, Lcom/canhub/cropper/CropImageOptions;->m0:F

    .line 356
    .line 357
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeFloat(F)V

    .line 358
    .line 359
    .line 360
    iget p2, p0, Lcom/canhub/cropper/CropImageOptions;->n0:I

    .line 361
    .line 362
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 363
    .line 364
    .line 365
    iget-object p2, p0, Lcom/canhub/cropper/CropImageOptions;->o0:Ljava/lang/String;

    .line 366
    .line 367
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 368
    .line 369
    .line 370
    iget p2, p0, Lcom/canhub/cropper/CropImageOptions;->p0:I

    .line 371
    .line 372
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 373
    .line 374
    .line 375
    iget-object p2, p0, Lcom/canhub/cropper/CropImageOptions;->q0:Ljava/lang/Integer;

    .line 376
    .line 377
    if-nez p2, :cond_1

    .line 378
    .line 379
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 380
    .line 381
    .line 382
    goto :goto_1

    .line 383
    :cond_1
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 384
    .line 385
    .line 386
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 387
    .line 388
    .line 389
    move-result p2

    .line 390
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 391
    .line 392
    .line 393
    :goto_1
    iget-object p2, p0, Lcom/canhub/cropper/CropImageOptions;->r0:Ljava/lang/Integer;

    .line 394
    .line 395
    if-nez p2, :cond_2

    .line 396
    .line 397
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 398
    .line 399
    .line 400
    goto :goto_2

    .line 401
    :cond_2
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 402
    .line 403
    .line 404
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 405
    .line 406
    .line 407
    move-result p2

    .line 408
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 409
    .line 410
    .line 411
    :goto_2
    iget-object p2, p0, Lcom/canhub/cropper/CropImageOptions;->s0:Ljava/lang/Integer;

    .line 412
    .line 413
    if-nez p2, :cond_3

    .line 414
    .line 415
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 416
    .line 417
    .line 418
    goto :goto_3

    .line 419
    :cond_3
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 420
    .line 421
    .line 422
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 423
    .line 424
    .line 425
    move-result p2

    .line 426
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 427
    .line 428
    .line 429
    :goto_3
    iget-object p2, p0, Lcom/canhub/cropper/CropImageOptions;->t0:Ljava/lang/Integer;

    .line 430
    .line 431
    if-nez p2, :cond_4

    .line 432
    .line 433
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 434
    .line 435
    .line 436
    return-void

    .line 437
    :cond_4
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 438
    .line 439
    .line 440
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 441
    .line 442
    .line 443
    move-result p2

    .line 444
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 445
    .line 446
    .line 447
    return-void
.end method
