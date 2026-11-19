.class public final Lcom/canhub/cropper/CropImageView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"

# interfaces
.implements Lcom/canhub/cropper/a0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/canhub/cropper/CropImageView$CropCornerShape;,
        Lcom/canhub/cropper/CropImageView$CropShape;,
        Lcom/canhub/cropper/CropImageView$Guidelines;,
        Lcom/canhub/cropper/CropImageView$RequestSizeOptions;,
        Lcom/canhub/cropper/CropImageView$ScaleType;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00c0\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u0008\n\u0002\u0008\u000f\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0010\u000e\n\u0002\u0008\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0014\n\u0002\u0008\n\u0018\u00002\u00020\u00012\u00020\u0002:\u0011\u009e\u0001\u009f\u0001\u00a0\u0001\u00a1\u0001\u00a2\u0001\u001a\u001e!$\'\u00a3\u0001B\u001d\u0008\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0015\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\t\u00a2\u0006\u0004\u0008\u0011\u0010\rJ\u0015\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u000b2\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u000b2\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u001e\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u000b2\u0008\u0010\u001b\u001a\u0004\u0018\u00010!\u00a2\u0006\u0004\u0008\"\u0010#J\u0017\u0010%\u001a\u00020\u000b2\u0008\u0010\u001b\u001a\u0004\u0018\u00010$\u00a2\u0006\u0004\u0008%\u0010&J\u0017\u0010(\u001a\u00020\u000b2\u0008\u0010\u001b\u001a\u0004\u0018\u00010\'\u00a2\u0006\u0004\u0008(\u0010)J\u0017\u0010,\u001a\u00020\u000b2\u0008\u0010+\u001a\u0004\u0018\u00010*\u00a2\u0006\u0004\u0008,\u0010-J\u0017\u00100\u001a\u00020\u000b2\u0008\u0010/\u001a\u0004\u0018\u00010.\u00a2\u0006\u0004\u00080\u00101R(\u00104\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0018\n\u0004\u00082\u00103\u0012\u0004\u00087\u00108\u001a\u0004\u00084\u00105\"\u0004\u00086\u0010\rR(\u0010>\u001a\u0004\u0018\u00010.2\u0008\u00109\u001a\u0004\u0018\u00010.8\u0006@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u0008:\u0010;\u001a\u0004\u0008<\u0010=R$\u0010B\u001a\u0004\u0018\u00010.8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008?\u0010;\u001a\u0004\u0008@\u0010=\"\u0004\u0008A\u00101R$\u0010D\u001a\u00020C2\u0006\u0010D\u001a\u00020C8F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008E\u0010F\"\u0004\u0008G\u0010HR(\u0010J\u001a\u0004\u0018\u00010I2\u0008\u0010J\u001a\u0004\u0018\u00010I8F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008K\u0010L\"\u0004\u0008M\u0010NR(\u0010P\u001a\u0004\u0018\u00010O2\u0008\u0010P\u001a\u0004\u0018\u00010O8F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008Q\u0010R\"\u0004\u0008S\u0010TR$\u0010V\u001a\u00020\t2\u0006\u0010U\u001a\u00020\t8F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008V\u00105\"\u0004\u0008W\u0010\rR$\u0010Y\u001a\u00020X2\u0006\u0010Y\u001a\u00020X8F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008Z\u0010[\"\u0004\u0008\\\u0010]R$\u0010a\u001a\u00020X2\u0006\u0010^\u001a\u00020X8F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008_\u0010[\"\u0004\u0008`\u0010]R$\u0010c\u001a\u00020\t2\u0006\u0010b\u001a\u00020\t8F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008c\u00105\"\u0004\u0008d\u0010\rR$\u0010f\u001a\u00020\t2\u0006\u0010e\u001a\u00020\t8F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008f\u00105\"\u0004\u0008g\u0010\rR(\u0010i\u001a\u0004\u0018\u00010h2\u0008\u0010i\u001a\u0004\u0018\u00010h8F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008j\u0010k\"\u0004\u0008l\u0010mR\u001d\u0010q\u001a\u000e\u0012\u0004\u0012\u00020X\u0012\u0004\u0012\u00020X0n8F\u00a2\u0006\u0006\u001a\u0004\u0008o\u0010pR$\u0010s\u001a\u00020\t2\u0006\u0010r\u001a\u00020\t8F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008s\u00105\"\u0004\u0008t\u0010\rR$\u0010v\u001a\u00020\t2\u0006\u0010u\u001a\u00020\t8F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008v\u00105\"\u0004\u0008w\u0010\rR$\u0010y\u001a\u00020\t2\u0006\u0010x\u001a\u00020\t8F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008y\u00105\"\u0004\u0008z\u0010\rR%\u0010|\u001a\u00020{2\u0006\u0010|\u001a\u00020{8F@FX\u0086\u000e\u00a2\u0006\r\u001a\u0004\u0008}\u0010~\"\u0005\u0008\u007f\u0010\u0080\u0001R)\u0010\u0085\u0001\u001a\u00020\u00162\u0007\u0010\u0081\u0001\u001a\u00020\u00168F@FX\u0086\u000e\u00a2\u0006\u000f\u001a\u0006\u0008\u0082\u0001\u0010\u0083\u0001\"\u0005\u0008\u0084\u0001\u0010\u0019R(\u0010\u0086\u0001\u001a\u00020X2\u0007\u0010\u0086\u0001\u001a\u00020X8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\u0008\u0087\u0001\u0010[\"\u0005\u0008\u0088\u0001\u0010]R(\u0010\u008c\u0001\u001a\u00020X2\u0007\u0010\u0089\u0001\u001a\u00020X8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\u0008\u008a\u0001\u0010[\"\u0005\u0008\u008b\u0001\u0010]R\u0017\u0010\u0090\u0001\u001a\u0005\u0018\u00010\u008d\u00018F\u00a2\u0006\u0008\u001a\u0006\u0008\u008e\u0001\u0010\u008f\u0001R0\u0010\u0095\u0001\u001a\u0005\u0018\u00010\u008d\u00012\n\u0010\u0091\u0001\u001a\u0005\u0018\u00010\u008d\u00018F@FX\u0086\u000e\u00a2\u0006\u0010\u001a\u0006\u0008\u0092\u0001\u0010\u008f\u0001\"\u0006\u0008\u0093\u0001\u0010\u0094\u0001R\u0017\u0010\u0099\u0001\u001a\u0005\u0018\u00010\u0096\u00018F\u00a2\u0006\u0008\u001a\u0006\u0008\u0097\u0001\u0010\u0098\u0001R\u0015\u0010\u009d\u0001\u001a\u00030\u009a\u00018F\u00a2\u0006\u0008\u001a\u0006\u0008\u009b\u0001\u0010\u009c\u0001\u00a8\u0006\u00a4\u0001"
    }
    d2 = {
        "Lcom/canhub/cropper/CropImageView;",
        "Landroid/widget/FrameLayout;",
        "Lcom/canhub/cropper/a0;",
        "Landroid/content/Context;",
        "context",
        "Landroid/util/AttributeSet;",
        "attrs",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "",
        "multiTouchEnabled",
        "Ld6/s;",
        "setMultiTouchEnabled",
        "(Z)V",
        "centerMoveEnabled",
        "setCenterMoveEnabled",
        "fixAspectRatio",
        "setFixedAspectRatio",
        "Lcom/canhub/cropper/CropImageOptions;",
        "options",
        "setImageCropOptions",
        "(Lcom/canhub/cropper/CropImageOptions;)V",
        "",
        "snapRadius",
        "setSnapRadius",
        "(F)V",
        "Lcom/canhub/cropper/x;",
        "listener",
        "setOnSetCropOverlayReleasedListener",
        "(Lcom/canhub/cropper/x;)V",
        "Lcom/canhub/cropper/w;",
        "setOnSetCropOverlayMovedListener",
        "(Lcom/canhub/cropper/w;)V",
        "Lcom/canhub/cropper/y;",
        "setOnCropWindowChangedListener",
        "(Lcom/canhub/cropper/y;)V",
        "Lcom/canhub/cropper/z;",
        "setOnSetImageUriCompleteListener",
        "(Lcom/canhub/cropper/z;)V",
        "Lcom/canhub/cropper/v;",
        "setOnCropImageCompleteListener",
        "(Lcom/canhub/cropper/v;)V",
        "Landroid/graphics/Bitmap;",
        "bitmap",
        "setImageBitmap",
        "(Landroid/graphics/Bitmap;)V",
        "Landroid/net/Uri;",
        "uri",
        "setImageUriAsync",
        "(Landroid/net/Uri;)V",
        "r",
        "Z",
        "isSaveBitmapToInstanceState",
        "()Z",
        "setSaveBitmapToInstanceState",
        "isSaveBitmapToInstanceState$annotations",
        "()V",
        "value",
        "C",
        "Landroid/net/Uri;",
        "getImageUri",
        "()Landroid/net/Uri;",
        "imageUri",
        "M",
        "getCustomOutputUri",
        "setCustomOutputUri",
        "customOutputUri",
        "Lcom/canhub/cropper/CropImageView$ScaleType;",
        "scaleType",
        "getScaleType",
        "()Lcom/canhub/cropper/CropImageView$ScaleType;",
        "setScaleType",
        "(Lcom/canhub/cropper/CropImageView$ScaleType;)V",
        "Lcom/canhub/cropper/CropImageView$CropShape;",
        "cropShape",
        "getCropShape",
        "()Lcom/canhub/cropper/CropImageView$CropShape;",
        "setCropShape",
        "(Lcom/canhub/cropper/CropImageView$CropShape;)V",
        "Lcom/canhub/cropper/CropImageView$CropCornerShape;",
        "cornerShape",
        "getCornerShape",
        "()Lcom/canhub/cropper/CropImageView$CropCornerShape;",
        "setCornerShape",
        "(Lcom/canhub/cropper/CropImageView$CropCornerShape;)V",
        "autoZoomEnabled",
        "isAutoZoomEnabled",
        "setAutoZoomEnabled",
        "",
        "maxZoom",
        "getMaxZoom",
        "()I",
        "setMaxZoom",
        "(I)V",
        "degrees",
        "getRotatedDegrees",
        "setRotatedDegrees",
        "rotatedDegrees",
        "flipHorizontally",
        "isFlippedHorizontally",
        "setFlippedHorizontally",
        "flipVertically",
        "isFlippedVertically",
        "setFlippedVertically",
        "Lcom/canhub/cropper/CropImageView$Guidelines;",
        "guidelines",
        "getGuidelines",
        "()Lcom/canhub/cropper/CropImageView$Guidelines;",
        "setGuidelines",
        "(Lcom/canhub/cropper/CropImageView$Guidelines;)V",
        "Landroid/util/Pair;",
        "getAspectRatio",
        "()Landroid/util/Pair;",
        "aspectRatio",
        "showProgressBar",
        "isShowProgressBar",
        "setShowProgressBar",
        "showCropOverlay",
        "isShowCropOverlay",
        "setShowCropOverlay",
        "showCropLabel",
        "isShowCropLabel",
        "setShowCropLabel",
        "",
        "cropLabelText",
        "getCropLabelText",
        "()Ljava/lang/String;",
        "setCropLabelText",
        "(Ljava/lang/String;)V",
        "textSize",
        "getCropLabelTextSize",
        "()F",
        "setCropLabelTextSize",
        "cropLabelTextSize",
        "cropLabelTextColor",
        "getCropLabelTextColor",
        "setCropLabelTextColor",
        "resId",
        "getImageResource",
        "setImageResource",
        "imageResource",
        "Landroid/graphics/Rect;",
        "getWholeImageRect",
        "()Landroid/graphics/Rect;",
        "wholeImageRect",
        "rect",
        "getCropRect",
        "setCropRect",
        "(Landroid/graphics/Rect;)V",
        "cropRect",
        "Landroid/graphics/RectF;",
        "getCropWindowRect",
        "()Landroid/graphics/RectF;",
        "cropWindowRect",
        "",
        "getCropPoints",
        "()[F",
        "cropPoints",
        "CropShape",
        "CropCornerShape",
        "ScaleType",
        "Guidelines",
        "RequestSizeOptions",
        "com/canhub/cropper/u",
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
        "SMAP\nCropImageView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CropImageView.kt\ncom/canhub/cropper/CropImageView\n+ 2 ParcelableUtils.kt\ncom/canhub/cropper/ParcelableUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Pair.kt\nandroidx/core/util/PairKt\n*L\n1#1,1896:1\n7#2,5:1897\n7#2,5:1905\n7#2,5:1910\n7#2,5:1915\n7#2,5:1920\n7#2,5:1925\n1#3:1902\n66#4:1903\n78#4:1904\n*S KotlinDebug\n*F\n+ 1 CropImageView.kt\ncom/canhub/cropper/CropImageView\n*L\n1809#1:1897,5\n1134#1:1905,5\n1159#1:1910,5\n1165#1:1915,5\n1171#1:1920,5\n1187#1:1925,5\n1047#1:1903\n1047#1:1904\n*E\n"
    }
.end annotation


# static fields
.field public static final synthetic N:I


# instance fields
.field public A:Lcom/canhub/cropper/z;

.field public B:Lcom/canhub/cropper/v;

.field public C:Landroid/net/Uri;

.field public D:I

.field public E:F

.field public F:F

.field public G:F

.field public H:Landroid/graphics/RectF;

.field public I:I

.field public J:Z

.field public K:Ljava/lang/ref/WeakReference;

.field public L:Ljava/lang/ref/WeakReference;

.field public M:Landroid/net/Uri;

.field public final a:Landroid/widget/ImageView;

.field public final b:Lcom/canhub/cropper/CropOverlayView;

.field public final c:Landroid/graphics/Matrix;

.field public final d:Landroid/graphics/Matrix;

.field public final e:Landroid/widget/ProgressBar;

.field public final f:[F

.field public final g:[F

.field public h:Lcom/canhub/cropper/r;

.field public i:Landroid/graphics/Bitmap;

.field public j:I

.field public k:I

.field public l:Z

.field public m:Z

.field public n:I

.field public o:I

.field public p:I

.field public q:Lcom/canhub/cropper/CropImageView$ScaleType;

.field public r:Z

.field public s:Z

.field public t:Z

.field public u:Ljava/lang/String;

.field public v:F

.field public w:I

.field public x:Z

.field public y:Z

.field public z:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/canhub/cropper/CropImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 51
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    const-string v3, "context"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct/range {p0 .. p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 3
    new-instance v3, Landroid/graphics/Matrix;

    invoke-direct {v3}, Landroid/graphics/Matrix;-><init>()V

    iput-object v3, v1, Lcom/canhub/cropper/CropImageView;->c:Landroid/graphics/Matrix;

    .line 4
    new-instance v3, Landroid/graphics/Matrix;

    invoke-direct {v3}, Landroid/graphics/Matrix;-><init>()V

    iput-object v3, v1, Lcom/canhub/cropper/CropImageView;->d:Landroid/graphics/Matrix;

    const/16 v3, 0x8

    .line 5
    new-array v4, v3, [F

    iput-object v4, v1, Lcom/canhub/cropper/CropImageView;->f:[F

    .line 6
    new-array v3, v3, [F

    iput-object v3, v1, Lcom/canhub/cropper/CropImageView;->g:[F

    const/4 v3, 0x1

    .line 7
    iput-boolean v3, v1, Lcom/canhub/cropper/CropImageView;->s:Z

    .line 8
    const-string v4, ""

    iput-object v4, v1, Lcom/canhub/cropper/CropImageView;->u:Ljava/lang/String;

    const/high16 v4, 0x41a00000    # 20.0f

    .line 9
    iput v4, v1, Lcom/canhub/cropper/CropImageView;->v:F

    const/4 v4, -0x1

    .line 10
    iput v4, v1, Lcom/canhub/cropper/CropImageView;->w:I

    .line 11
    iput-boolean v3, v1, Lcom/canhub/cropper/CropImageView;->x:Z

    .line 12
    iput-boolean v3, v1, Lcom/canhub/cropper/CropImageView;->y:Z

    .line 13
    iput v3, v1, Lcom/canhub/cropper/CropImageView;->D:I

    const/high16 v4, 0x3f800000    # 1.0f

    .line 14
    iput v4, v1, Lcom/canhub/cropper/CropImageView;->E:F

    .line 15
    instance-of v4, v0, Landroid/app/Activity;

    const/4 v5, 0x0

    if-eqz v4, :cond_0

    move-object v4, v0

    check-cast v4, Landroid/app/Activity;

    goto :goto_0

    :cond_0
    move-object v4, v5

    :goto_0
    if-eqz v4, :cond_2

    invoke-virtual {v4}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    if-eqz v4, :cond_2

    const-string v6, "CROP_IMAGE_EXTRA_BUNDLE"

    invoke-virtual {v4, v6}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v4

    if-eqz v4, :cond_2

    const-string v6, "CROP_IMAGE_EXTRA_OPTIONS"

    .line 16
    invoke-virtual {v4, v6}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v4

    instance-of v6, v4, Lcom/canhub/cropper/CropImageOptions;

    if-nez v6, :cond_1

    goto :goto_1

    :cond_1
    move-object v5, v4

    :goto_1
    check-cast v5, Lcom/canhub/cropper/CropImageOptions;

    if-nez v5, :cond_6

    :cond_2
    if-eqz v2, :cond_5

    .line 17
    sget-object v4, Lcom/canhub/cropper/R$styleable;->CropImageView:[I

    const/4 v5, 0x0

    invoke-virtual {v0, v2, v4, v5, v5}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v2

    const-string v4, "obtainStyledAttributes(...)"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    new-instance v6, Lcom/canhub/cropper/CropImageOptions;

    const/16 v47, -0x1

    const/16 v48, 0x3f

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

    const/16 v46, -0x1

    invoke-direct/range {v6 .. v48}, Lcom/canhub/cropper/CropImageOptions;-><init>(Lcom/canhub/cropper/CropImageView$CropShape;Lcom/canhub/cropper/CropImageView$CropCornerShape;FFFLcom/canhub/cropper/CropImageView$Guidelines;Lcom/canhub/cropper/CropImageView$ScaleType;ZZZZZZIFZIIFIFFFIIFIIIIIIIIZZFILjava/lang/String;III)V

    .line 19
    :try_start_0
    sget v4, Lcom/canhub/cropper/R$styleable;->CropImageView_cropSaveBitmapToInstanceState:I

    iget-boolean v7, v1, Lcom/canhub/cropper/CropImageView;->r:Z

    invoke-virtual {v2, v4, v7}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v4

    iput-boolean v4, v1, Lcom/canhub/cropper/CropImageView;->r:Z

    .line 20
    invoke-static {}, Lcom/canhub/cropper/CropImageView$ScaleType;->values()[Lcom/canhub/cropper/CropImageView$ScaleType;

    move-result-object v4

    sget v7, Lcom/canhub/cropper/R$styleable;->CropImageView_cropScaleType:I

    iget-object v8, v6, Lcom/canhub/cropper/CropImageOptions;->i:Lcom/canhub/cropper/CropImageView$ScaleType;

    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    move-result v8

    invoke-virtual {v2, v7, v8}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    aget-object v15, v4, v7

    .line 21
    invoke-static {}, Lcom/canhub/cropper/CropImageView$CropShape;->values()[Lcom/canhub/cropper/CropImageView$CropShape;

    move-result-object v4

    sget v7, Lcom/canhub/cropper/R$styleable;->CropImageView_cropShape:I

    iget-object v8, v6, Lcom/canhub/cropper/CropImageOptions;->c:Lcom/canhub/cropper/CropImageView$CropShape;

    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    move-result v8

    invoke-virtual {v2, v7, v8}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    aget-object v9, v4, v7

    .line 22
    invoke-static {}, Lcom/canhub/cropper/CropImageView$CropCornerShape;->values()[Lcom/canhub/cropper/CropImageView$CropCornerShape;

    move-result-object v4

    sget v7, Lcom/canhub/cropper/R$styleable;->CropImageView_cornerShape:I

    iget-object v8, v6, Lcom/canhub/cropper/CropImageOptions;->d:Lcom/canhub/cropper/CropImageView$CropCornerShape;

    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    move-result v8

    invoke-virtual {v2, v7, v8}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    aget-object v10, v4, v7

    .line 23
    invoke-static {}, Lcom/canhub/cropper/CropImageView$Guidelines;->values()[Lcom/canhub/cropper/CropImageView$Guidelines;

    move-result-object v4

    sget v7, Lcom/canhub/cropper/R$styleable;->CropImageView_cropGuidelines:I

    iget-object v8, v6, Lcom/canhub/cropper/CropImageOptions;->h:Lcom/canhub/cropper/CropImageView$Guidelines;

    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    move-result v8

    invoke-virtual {v2, v7, v8}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    aget-object v14, v4, v7

    .line 24
    sget v4, Lcom/canhub/cropper/R$styleable;->CropImageView_cropAspectRatioX:I

    iget v7, v6, Lcom/canhub/cropper/CropImageOptions;->u:I

    invoke-virtual {v2, v4, v7}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v25

    .line 25
    sget v4, Lcom/canhub/cropper/R$styleable;->CropImageView_cropAspectRatioY:I

    iget v7, v6, Lcom/canhub/cropper/CropImageOptions;->v:I

    invoke-virtual {v2, v4, v7}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v26

    .line 26
    sget v4, Lcom/canhub/cropper/R$styleable;->CropImageView_cropAutoZoomEnabled:I

    iget-boolean v7, v6, Lcom/canhub/cropper/CropImageOptions;->n:Z

    invoke-virtual {v2, v4, v7}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v19

    .line 27
    sget v4, Lcom/canhub/cropper/R$styleable;->CropImageView_cropMultiTouchEnabled:I

    iget-boolean v7, v6, Lcom/canhub/cropper/CropImageOptions;->o:Z

    invoke-virtual {v2, v4, v7}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v20

    .line 28
    sget v4, Lcom/canhub/cropper/R$styleable;->CropImageView_cropCenterMoveEnabled:I

    iget-boolean v7, v6, Lcom/canhub/cropper/CropImageOptions;->p:Z

    invoke-virtual {v2, v4, v7}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v21

    .line 29
    sget v4, Lcom/canhub/cropper/R$styleable;->CropImageView_cropCornerRadius:I

    iget v7, v6, Lcom/canhub/cropper/CropImageOptions;->e:F

    invoke-virtual {v2, v4, v7}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v11

    .line 30
    sget v4, Lcom/canhub/cropper/R$styleable;->CropImageView_cropSnapRadius:I

    iget v7, v6, Lcom/canhub/cropper/CropImageOptions;->f:F

    invoke-virtual {v2, v4, v7}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v12

    .line 31
    sget v4, Lcom/canhub/cropper/R$styleable;->CropImageView_cropTouchRadius:I

    iget v7, v6, Lcom/canhub/cropper/CropImageOptions;->g:F

    invoke-virtual {v2, v4, v7}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v13

    .line 32
    sget v4, Lcom/canhub/cropper/R$styleable;->CropImageView_cropInitialCropWindowPaddingRatio:I

    iget v7, v6, Lcom/canhub/cropper/CropImageOptions;->s:F

    invoke-virtual {v2, v4, v7}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v23

    .line 33
    sget v4, Lcom/canhub/cropper/R$styleable;->CropImageView_cropCornerCircleFillColor:I

    iget v7, v6, Lcom/canhub/cropper/CropImageOptions;->C:I

    invoke-virtual {v2, v4, v7}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v33

    .line 34
    sget v4, Lcom/canhub/cropper/R$styleable;->CropImageView_cropBorderLineThickness:I

    iget v7, v6, Lcom/canhub/cropper/CropImageOptions;->w:F

    invoke-virtual {v2, v4, v7}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v27

    .line 35
    sget v4, Lcom/canhub/cropper/R$styleable;->CropImageView_cropBorderLineColor:I

    iget v7, v6, Lcom/canhub/cropper/CropImageOptions;->x:I

    invoke-virtual {v2, v4, v7}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v28

    .line 36
    sget v4, Lcom/canhub/cropper/R$styleable;->CropImageView_cropBorderCornerThickness:I

    iget v7, v6, Lcom/canhub/cropper/CropImageOptions;->y:F

    invoke-virtual {v2, v4, v7}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v29

    .line 37
    sget v4, Lcom/canhub/cropper/R$styleable;->CropImageView_cropBorderCornerOffset:I

    iget v7, v6, Lcom/canhub/cropper/CropImageOptions;->z:F

    invoke-virtual {v2, v4, v7}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v30

    .line 38
    sget v4, Lcom/canhub/cropper/R$styleable;->CropImageView_cropBorderCornerLength:I

    iget v7, v6, Lcom/canhub/cropper/CropImageOptions;->A:F

    invoke-virtual {v2, v4, v7}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v31

    .line 39
    sget v4, Lcom/canhub/cropper/R$styleable;->CropImageView_cropBorderCornerColor:I

    iget v7, v6, Lcom/canhub/cropper/CropImageOptions;->B:I

    invoke-virtual {v2, v4, v7}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v32

    .line 40
    sget v4, Lcom/canhub/cropper/R$styleable;->CropImageView_cropGuidelinesThickness:I

    iget v7, v6, Lcom/canhub/cropper/CropImageOptions;->D:F

    invoke-virtual {v2, v4, v7}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v34

    .line 41
    sget v4, Lcom/canhub/cropper/R$styleable;->CropImageView_cropGuidelinesColor:I

    iget v7, v6, Lcom/canhub/cropper/CropImageOptions;->E:I

    invoke-virtual {v2, v4, v7}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v35

    .line 42
    sget v4, Lcom/canhub/cropper/R$styleable;->CropImageView_cropBackgroundColor:I

    iget v7, v6, Lcom/canhub/cropper/CropImageOptions;->F:I

    invoke-virtual {v2, v4, v7}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v36

    .line 43
    sget v4, Lcom/canhub/cropper/R$styleable;->CropImageView_cropMinCropWindowWidth:I

    iget v7, v6, Lcom/canhub/cropper/CropImageOptions;->G:I

    int-to-float v7, v7

    invoke-virtual {v2, v4, v7}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v4

    float-to-int v4, v4

    .line 44
    sget v7, Lcom/canhub/cropper/R$styleable;->CropImageView_cropMinCropWindowHeight:I

    iget v8, v6, Lcom/canhub/cropper/CropImageOptions;->H:I

    int-to-float v8, v8

    invoke-virtual {v2, v7, v8}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v7

    float-to-int v7, v7

    .line 45
    sget v8, Lcom/canhub/cropper/R$styleable;->CropImageView_cropMinCropResultWidthPX:I

    iget v5, v6, Lcom/canhub/cropper/CropImageOptions;->I:I

    int-to-float v5, v5

    invoke-virtual {v2, v8, v5}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v5

    float-to-int v5, v5

    .line 46
    sget v8, Lcom/canhub/cropper/R$styleable;->CropImageView_cropMinCropResultHeightPX:I

    iget v3, v6, Lcom/canhub/cropper/CropImageOptions;->J:I

    int-to-float v3, v3

    invoke-virtual {v2, v8, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v3

    float-to-int v3, v3

    .line 47
    sget v8, Lcom/canhub/cropper/R$styleable;->CropImageView_cropMaxCropResultWidthPX:I

    iget v0, v6, Lcom/canhub/cropper/CropImageOptions;->K:I

    int-to-float v0, v0

    invoke-virtual {v2, v8, v0}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    float-to-int v0, v0

    .line 48
    sget v8, Lcom/canhub/cropper/R$styleable;->CropImageView_cropMaxCropResultHeightPX:I

    move/from16 v41, v0

    iget v0, v6, Lcom/canhub/cropper/CropImageOptions;->L:I

    int-to-float v0, v0

    invoke-virtual {v2, v8, v0}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    float-to-int v0, v0

    .line 49
    sget v8, Lcom/canhub/cropper/R$styleable;->CropImageView_cropFlipHorizontally:I

    move/from16 v42, v0

    iget-boolean v0, v6, Lcom/canhub/cropper/CropImageOptions;->e0:Z

    invoke-virtual {v2, v8, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v43

    .line 50
    sget v0, Lcom/canhub/cropper/R$styleable;->CropImageView_cropFlipHorizontally:I

    iget-boolean v8, v6, Lcom/canhub/cropper/CropImageOptions;->f0:Z

    invoke-virtual {v2, v0, v8}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v44

    .line 51
    sget v0, Lcom/canhub/cropper/R$styleable;->CropImageView_cropperLabelTextSize:I

    iget v8, v6, Lcom/canhub/cropper/CropImageOptions;->m0:F

    invoke-virtual {v2, v0, v8}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v45

    .line 52
    sget v0, Lcom/canhub/cropper/R$styleable;->CropImageView_cropperLabelTextColor:I

    iget v8, v6, Lcom/canhub/cropper/CropImageOptions;->n0:I

    invoke-virtual {v2, v0, v8}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v46

    .line 53
    sget v0, Lcom/canhub/cropper/R$styleable;->CropImageView_cropShowLabel:I

    iget-boolean v8, v6, Lcom/canhub/cropper/CropImageOptions;->k:Z

    invoke-virtual {v2, v0, v8}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v17

    .line 54
    sget v0, Lcom/canhub/cropper/R$styleable;->CropImageView_cropMaxZoom:I

    iget v8, v6, Lcom/canhub/cropper/CropImageOptions;->r:I

    invoke-virtual {v2, v0, v8}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v22

    .line 55
    sget v0, Lcom/canhub/cropper/R$styleable;->CropImageView_cropShowCropOverlay:I

    iget-boolean v8, v6, Lcom/canhub/cropper/CropImageOptions;->j:Z

    invoke-virtual {v2, v0, v8}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    .line 56
    sget v8, Lcom/canhub/cropper/R$styleable;->CropImageView_cropShowProgressBar:I

    move/from16 p2, v0

    iget-boolean v0, v6, Lcom/canhub/cropper/CropImageOptions;->l:Z

    invoke-virtual {v2, v8, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v18

    .line 57
    sget v0, Lcom/canhub/cropper/R$styleable;->CropImageView_cropperLabelText:I

    invoke-virtual {v2, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v47

    .line 58
    sget v0, Lcom/canhub/cropper/R$styleable;->CropImageView_cropFixAspectRatio:I

    iget-boolean v6, v6, Lcom/canhub/cropper/CropImageOptions;->t:Z

    invoke-virtual {v2, v0, v6}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    if-nez v0, :cond_4

    sget v0, Lcom/canhub/cropper/R$styleable;->CropImageView_cropAspectRatioX:I

    invoke-virtual {v2, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_3

    sget v0, Lcom/canhub/cropper/R$styleable;->CropImageView_cropAspectRatioX:I

    invoke-virtual {v2, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_2

    :catchall_0
    move-exception v0

    goto :goto_4

    :cond_3
    const/16 v24, 0x0

    goto :goto_3

    :cond_4
    :goto_2
    const/16 v24, 0x1

    .line 59
    :goto_3
    new-instance v8, Lcom/canhub/cropper/CropImageOptions;

    const v49, 0x3f3fffc0    # 0.7499962f

    const/16 v50, 0x3e

    const v48, 0x11003

    move/from16 v16, p2

    move/from16 v40, v3

    move/from16 v37, v4

    move/from16 v39, v5

    move/from16 v38, v7

    invoke-direct/range {v8 .. v50}, Lcom/canhub/cropper/CropImageOptions;-><init>(Lcom/canhub/cropper/CropImageView$CropShape;Lcom/canhub/cropper/CropImageView$CropCornerShape;FFFLcom/canhub/cropper/CropImageView$Guidelines;Lcom/canhub/cropper/CropImageView$ScaleType;ZZZZZZIFZIIFIFFFIIFIIIIIIIIZZFILjava/lang/String;III)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    move-object v5, v8

    goto :goto_5

    :goto_4
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    throw v0

    .line 61
    :cond_5
    new-instance v3, Lcom/canhub/cropper/CropImageOptions;

    const/16 v44, -0x1

    const/16 v45, 0x3f

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

    const/16 v43, -0x1

    invoke-direct/range {v3 .. v45}, Lcom/canhub/cropper/CropImageOptions;-><init>(Lcom/canhub/cropper/CropImageView$CropShape;Lcom/canhub/cropper/CropImageView$CropCornerShape;FFFLcom/canhub/cropper/CropImageView$Guidelines;Lcom/canhub/cropper/CropImageView$ScaleType;ZZZZZZIFZIIFIFFFIIFIIIIIIIIZZFILjava/lang/String;III)V

    move-object v5, v3

    .line 62
    :cond_6
    :goto_5
    iget-object v0, v5, Lcom/canhub/cropper/CropImageOptions;->i:Lcom/canhub/cropper/CropImageView$ScaleType;

    iput-object v0, v1, Lcom/canhub/cropper/CropImageView;->q:Lcom/canhub/cropper/CropImageView$ScaleType;

    .line 63
    iget-boolean v0, v5, Lcom/canhub/cropper/CropImageOptions;->n:Z

    iput-boolean v0, v1, Lcom/canhub/cropper/CropImageView;->y:Z

    .line 64
    iget v0, v5, Lcom/canhub/cropper/CropImageOptions;->r:I

    iput v0, v1, Lcom/canhub/cropper/CropImageView;->z:I

    .line 65
    iget v0, v5, Lcom/canhub/cropper/CropImageOptions;->m0:F

    iput v0, v1, Lcom/canhub/cropper/CropImageView;->v:F

    .line 66
    iget-boolean v0, v5, Lcom/canhub/cropper/CropImageOptions;->k:Z

    iput-boolean v0, v1, Lcom/canhub/cropper/CropImageView;->t:Z

    .line 67
    iget-boolean v0, v5, Lcom/canhub/cropper/CropImageOptions;->j:Z

    iput-boolean v0, v1, Lcom/canhub/cropper/CropImageView;->s:Z

    .line 68
    iget-boolean v0, v5, Lcom/canhub/cropper/CropImageOptions;->l:Z

    iput-boolean v0, v1, Lcom/canhub/cropper/CropImageView;->x:Z

    .line 69
    iget-boolean v0, v5, Lcom/canhub/cropper/CropImageOptions;->e0:Z

    iput-boolean v0, v1, Lcom/canhub/cropper/CropImageView;->l:Z

    .line 70
    iget-boolean v0, v5, Lcom/canhub/cropper/CropImageOptions;->f0:Z

    iput-boolean v0, v1, Lcom/canhub/cropper/CropImageView;->m:Z

    .line 71
    invoke-static/range {p1 .. p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    .line 72
    sget v2, Lcom/canhub/cropper/R$layout;->crop_image_view:I

    const/4 v3, 0x1

    invoke-virtual {v0, v2, v1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    .line 73
    sget v2, Lcom/canhub/cropper/R$id;->ImageView_image:I

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    iput-object v2, v1, Lcom/canhub/cropper/CropImageView;->a:Landroid/widget/ImageView;

    .line 74
    sget-object v3, Landroid/widget/ImageView$ScaleType;->MATRIX:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 75
    sget v2, Lcom/canhub/cropper/R$id;->CropOverlayView:I

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/canhub/cropper/CropOverlayView;

    iput-object v2, v1, Lcom/canhub/cropper/CropImageView;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 76
    invoke-virtual {v2, v1}, Lcom/canhub/cropper/CropOverlayView;->setCropWindowChangeListener(Lcom/canhub/cropper/a0;)V

    .line 77
    invoke-virtual {v2, v5}, Lcom/canhub/cropper/CropOverlayView;->setInitialAttributeValues(Lcom/canhub/cropper/CropImageOptions;)V

    .line 78
    sget v2, Lcom/canhub/cropper/R$id;->CropProgressBar:I

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, v1, Lcom/canhub/cropper/CropImageView;->e:Landroid/widget/ProgressBar;

    .line 79
    iget v2, v5, Lcom/canhub/cropper/CropImageOptions;->m:I

    invoke-static {v2}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/ProgressBar;->setIndeterminateTintList(Landroid/content/res/ColorStateList;)V

    .line 80
    invoke-virtual {v1}, Lcom/canhub/cropper/CropImageView;->i()V

    return-void
.end method


# virtual methods
.method public final a(FFZZ)V
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->i:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    if-eqz v0, :cond_c

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    cmpl-float v2, p1, v1

    .line 7
    .line 8
    if-lez v2, :cond_c

    .line 9
    .line 10
    cmpl-float v2, p2, v1

    .line 11
    .line 12
    if-lez v2, :cond_c

    .line 13
    .line 14
    iget-object v2, p0, Lcom/canhub/cropper/CropImageView;->c:Landroid/graphics/Matrix;

    .line 15
    .line 16
    iget-object v3, p0, Lcom/canhub/cropper/CropImageView;->d:Landroid/graphics/Matrix;

    .line 17
    .line 18
    invoke-virtual {v2, v3}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    .line 19
    .line 20
    .line 21
    iget-object v4, p0, Lcom/canhub/cropper/CropImageView;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 22
    .line 23
    invoke-static {v4}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v4}, Lcom/canhub/cropper/CropOverlayView;->getCropWindowRect()Landroid/graphics/RectF;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    invoke-virtual {v3, v5}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2}, Landroid/graphics/Matrix;->reset()V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    int-to-float v3, v3

    .line 41
    sub-float v3, p1, v3

    .line 42
    .line 43
    const/4 v6, 0x2

    .line 44
    int-to-float v6, v6

    .line 45
    div-float/2addr v3, v6

    .line 46
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    int-to-float v0, v0

    .line 51
    sub-float v0, p2, v0

    .line 52
    .line 53
    div-float/2addr v0, v6

    .line 54
    invoke-virtual {v2, v3, v0}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Lcom/canhub/cropper/CropImageView;->e()V

    .line 58
    .line 59
    .line 60
    iget v0, p0, Lcom/canhub/cropper/CropImageView;->k:I

    .line 61
    .line 62
    iget-object v3, p0, Lcom/canhub/cropper/CropImageView;->f:[F

    .line 63
    .line 64
    if-lez v0, :cond_0

    .line 65
    .line 66
    int-to-float v0, v0

    .line 67
    invoke-static {v3}, Lcom/canhub/cropper/h;->m([F)F

    .line 68
    .line 69
    .line 70
    move-result v7

    .line 71
    invoke-static {v3}, Lcom/canhub/cropper/h;->n([F)F

    .line 72
    .line 73
    .line 74
    move-result v8

    .line 75
    invoke-virtual {v2, v0, v7, v8}, Landroid/graphics/Matrix;->postRotate(FFF)Z

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0}, Lcom/canhub/cropper/CropImageView;->e()V

    .line 79
    .line 80
    .line 81
    :cond_0
    invoke-static {v3}, Lcom/canhub/cropper/h;->t([F)F

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    div-float v0, p1, v0

    .line 86
    .line 87
    invoke-static {v3}, Lcom/canhub/cropper/h;->p([F)F

    .line 88
    .line 89
    .line 90
    move-result v7

    .line 91
    div-float v7, p2, v7

    .line 92
    .line 93
    invoke-static {v0, v7}, Ljava/lang/Math;->min(FF)F

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    iget-object v7, p0, Lcom/canhub/cropper/CropImageView;->q:Lcom/canhub/cropper/CropImageView$ScaleType;

    .line 98
    .line 99
    sget-object v8, Lcom/canhub/cropper/CropImageView$ScaleType;->FIT_CENTER:Lcom/canhub/cropper/CropImageView$ScaleType;

    .line 100
    .line 101
    if-eq v7, v8, :cond_3

    .line 102
    .line 103
    sget-object v8, Lcom/canhub/cropper/CropImageView$ScaleType;->CENTER_INSIDE:Lcom/canhub/cropper/CropImageView$ScaleType;

    .line 104
    .line 105
    const/high16 v9, 0x3f800000    # 1.0f

    .line 106
    .line 107
    if-ne v7, v8, :cond_1

    .line 108
    .line 109
    cmpg-float v8, v0, v9

    .line 110
    .line 111
    if-ltz v8, :cond_3

    .line 112
    .line 113
    :cond_1
    cmpl-float v8, v0, v9

    .line 114
    .line 115
    if-lez v8, :cond_2

    .line 116
    .line 117
    iget-boolean v8, p0, Lcom/canhub/cropper/CropImageView;->y:Z

    .line 118
    .line 119
    if-eqz v8, :cond_2

    .line 120
    .line 121
    goto :goto_0

    .line 122
    :cond_2
    sget-object v0, Lcom/canhub/cropper/CropImageView$ScaleType;->CENTER_CROP:Lcom/canhub/cropper/CropImageView$ScaleType;

    .line 123
    .line 124
    if-ne v7, v0, :cond_4

    .line 125
    .line 126
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 127
    .line 128
    .line 129
    move-result v0

    .line 130
    int-to-float v0, v0

    .line 131
    invoke-static {v3}, Lcom/canhub/cropper/h;->t([F)F

    .line 132
    .line 133
    .line 134
    move-result v7

    .line 135
    div-float/2addr v0, v7

    .line 136
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 137
    .line 138
    .line 139
    move-result v7

    .line 140
    int-to-float v7, v7

    .line 141
    invoke-static {v3}, Lcom/canhub/cropper/h;->p([F)F

    .line 142
    .line 143
    .line 144
    move-result v8

    .line 145
    div-float/2addr v7, v8

    .line 146
    invoke-static {v0, v7}, Ljava/lang/Math;->max(FF)F

    .line 147
    .line 148
    .line 149
    move-result v0

    .line 150
    iput v0, p0, Lcom/canhub/cropper/CropImageView;->E:F

    .line 151
    .line 152
    goto :goto_1

    .line 153
    :cond_3
    :goto_0
    invoke-static {v3}, Lcom/canhub/cropper/h;->m([F)F

    .line 154
    .line 155
    .line 156
    move-result v7

    .line 157
    invoke-static {v3}, Lcom/canhub/cropper/h;->n([F)F

    .line 158
    .line 159
    .line 160
    move-result v8

    .line 161
    invoke-virtual {v2, v0, v0, v7, v8}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 162
    .line 163
    .line 164
    invoke-virtual {p0}, Lcom/canhub/cropper/CropImageView;->e()V

    .line 165
    .line 166
    .line 167
    :cond_4
    :goto_1
    iget-boolean v0, p0, Lcom/canhub/cropper/CropImageView;->l:Z

    .line 168
    .line 169
    if-eqz v0, :cond_5

    .line 170
    .line 171
    iget v0, p0, Lcom/canhub/cropper/CropImageView;->E:F

    .line 172
    .line 173
    neg-float v0, v0

    .line 174
    goto :goto_2

    .line 175
    :cond_5
    iget v0, p0, Lcom/canhub/cropper/CropImageView;->E:F

    .line 176
    .line 177
    :goto_2
    iget-boolean v7, p0, Lcom/canhub/cropper/CropImageView;->m:Z

    .line 178
    .line 179
    if-eqz v7, :cond_6

    .line 180
    .line 181
    iget v7, p0, Lcom/canhub/cropper/CropImageView;->E:F

    .line 182
    .line 183
    neg-float v7, v7

    .line 184
    goto :goto_3

    .line 185
    :cond_6
    iget v7, p0, Lcom/canhub/cropper/CropImageView;->E:F

    .line 186
    .line 187
    :goto_3
    invoke-static {v3}, Lcom/canhub/cropper/h;->m([F)F

    .line 188
    .line 189
    .line 190
    move-result v8

    .line 191
    invoke-static {v3}, Lcom/canhub/cropper/h;->n([F)F

    .line 192
    .line 193
    .line 194
    move-result v9

    .line 195
    invoke-virtual {v2, v0, v7, v8, v9}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 196
    .line 197
    .line 198
    invoke-virtual {p0}, Lcom/canhub/cropper/CropImageView;->e()V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v2, v5}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 202
    .line 203
    .line 204
    iget-object v8, p0, Lcom/canhub/cropper/CropImageView;->q:Lcom/canhub/cropper/CropImageView$ScaleType;

    .line 205
    .line 206
    sget-object v9, Lcom/canhub/cropper/CropImageView$ScaleType;->CENTER_CROP:Lcom/canhub/cropper/CropImageView$ScaleType;

    .line 207
    .line 208
    if-ne v8, v9, :cond_7

    .line 209
    .line 210
    if-eqz p3, :cond_7

    .line 211
    .line 212
    if-nez p4, :cond_7

    .line 213
    .line 214
    iput v1, p0, Lcom/canhub/cropper/CropImageView;->F:F

    .line 215
    .line 216
    iput v1, p0, Lcom/canhub/cropper/CropImageView;->G:F

    .line 217
    .line 218
    goto/16 :goto_6

    .line 219
    .line 220
    :cond_7
    if-eqz p3, :cond_a

    .line 221
    .line 222
    invoke-static {v3}, Lcom/canhub/cropper/h;->t([F)F

    .line 223
    .line 224
    .line 225
    move-result p3

    .line 226
    cmpl-float p3, p1, p3

    .line 227
    .line 228
    if-lez p3, :cond_8

    .line 229
    .line 230
    move p1, v1

    .line 231
    goto :goto_4

    .line 232
    :cond_8
    div-float/2addr p1, v6

    .line 233
    invoke-virtual {v5}, Landroid/graphics/RectF;->centerX()F

    .line 234
    .line 235
    .line 236
    move-result p3

    .line 237
    sub-float/2addr p1, p3

    .line 238
    invoke-static {v3}, Lcom/canhub/cropper/h;->q([F)F

    .line 239
    .line 240
    .line 241
    move-result p3

    .line 242
    neg-float p3, p3

    .line 243
    invoke-static {p1, p3}, Ljava/lang/Math;->min(FF)F

    .line 244
    .line 245
    .line 246
    move-result p1

    .line 247
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 248
    .line 249
    .line 250
    move-result p3

    .line 251
    int-to-float p3, p3

    .line 252
    invoke-static {v3}, Lcom/canhub/cropper/h;->r([F)F

    .line 253
    .line 254
    .line 255
    move-result v8

    .line 256
    sub-float/2addr p3, v8

    .line 257
    invoke-static {p1, p3}, Ljava/lang/Math;->max(FF)F

    .line 258
    .line 259
    .line 260
    move-result p1

    .line 261
    div-float/2addr p1, v0

    .line 262
    :goto_4
    iput p1, p0, Lcom/canhub/cropper/CropImageView;->F:F

    .line 263
    .line 264
    invoke-static {v3}, Lcom/canhub/cropper/h;->p([F)F

    .line 265
    .line 266
    .line 267
    move-result p1

    .line 268
    cmpl-float p1, p2, p1

    .line 269
    .line 270
    if-lez p1, :cond_9

    .line 271
    .line 272
    goto :goto_5

    .line 273
    :cond_9
    div-float/2addr p2, v6

    .line 274
    invoke-virtual {v5}, Landroid/graphics/RectF;->centerY()F

    .line 275
    .line 276
    .line 277
    move-result p1

    .line 278
    sub-float/2addr p2, p1

    .line 279
    invoke-static {v3}, Lcom/canhub/cropper/h;->s([F)F

    .line 280
    .line 281
    .line 282
    move-result p1

    .line 283
    neg-float p1, p1

    .line 284
    invoke-static {p2, p1}, Ljava/lang/Math;->min(FF)F

    .line 285
    .line 286
    .line 287
    move-result p1

    .line 288
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 289
    .line 290
    .line 291
    move-result p2

    .line 292
    int-to-float p2, p2

    .line 293
    invoke-static {v3}, Lcom/canhub/cropper/h;->l([F)F

    .line 294
    .line 295
    .line 296
    move-result p3

    .line 297
    sub-float/2addr p2, p3

    .line 298
    invoke-static {p1, p2}, Ljava/lang/Math;->max(FF)F

    .line 299
    .line 300
    .line 301
    move-result p1

    .line 302
    div-float v1, p1, v7

    .line 303
    .line 304
    :goto_5
    iput v1, p0, Lcom/canhub/cropper/CropImageView;->G:F

    .line 305
    .line 306
    goto :goto_6

    .line 307
    :cond_a
    iget p3, p0, Lcom/canhub/cropper/CropImageView;->F:F

    .line 308
    .line 309
    mul-float/2addr p3, v0

    .line 310
    iget v1, v5, Landroid/graphics/RectF;->left:F

    .line 311
    .line 312
    neg-float v1, v1

    .line 313
    invoke-static {p3, v1}, Ljava/lang/Math;->max(FF)F

    .line 314
    .line 315
    .line 316
    move-result p3

    .line 317
    iget v1, v5, Landroid/graphics/RectF;->right:F

    .line 318
    .line 319
    neg-float v1, v1

    .line 320
    add-float/2addr v1, p1

    .line 321
    invoke-static {p3, v1}, Ljava/lang/Math;->min(FF)F

    .line 322
    .line 323
    .line 324
    move-result p1

    .line 325
    div-float/2addr p1, v0

    .line 326
    iput p1, p0, Lcom/canhub/cropper/CropImageView;->F:F

    .line 327
    .line 328
    iget p1, p0, Lcom/canhub/cropper/CropImageView;->G:F

    .line 329
    .line 330
    mul-float/2addr p1, v7

    .line 331
    iget p3, v5, Landroid/graphics/RectF;->top:F

    .line 332
    .line 333
    neg-float p3, p3

    .line 334
    invoke-static {p1, p3}, Ljava/lang/Math;->max(FF)F

    .line 335
    .line 336
    .line 337
    move-result p1

    .line 338
    iget p3, v5, Landroid/graphics/RectF;->bottom:F

    .line 339
    .line 340
    neg-float p3, p3

    .line 341
    add-float/2addr p3, p2

    .line 342
    invoke-static {p1, p3}, Ljava/lang/Math;->min(FF)F

    .line 343
    .line 344
    .line 345
    move-result p1

    .line 346
    div-float/2addr p1, v7

    .line 347
    iput p1, p0, Lcom/canhub/cropper/CropImageView;->G:F

    .line 348
    .line 349
    :goto_6
    iget p1, p0, Lcom/canhub/cropper/CropImageView;->F:F

    .line 350
    .line 351
    mul-float/2addr p1, v0

    .line 352
    iget p2, p0, Lcom/canhub/cropper/CropImageView;->G:F

    .line 353
    .line 354
    mul-float/2addr p2, v7

    .line 355
    invoke-virtual {v2, p1, p2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 356
    .line 357
    .line 358
    iget p1, p0, Lcom/canhub/cropper/CropImageView;->F:F

    .line 359
    .line 360
    mul-float/2addr p1, v0

    .line 361
    iget p2, p0, Lcom/canhub/cropper/CropImageView;->G:F

    .line 362
    .line 363
    mul-float/2addr p2, v7

    .line 364
    invoke-virtual {v5, p1, p2}, Landroid/graphics/RectF;->offset(FF)V

    .line 365
    .line 366
    .line 367
    invoke-virtual {v4, v5}, Lcom/canhub/cropper/CropOverlayView;->setCropWindowRect(Landroid/graphics/RectF;)V

    .line 368
    .line 369
    .line 370
    invoke-virtual {p0}, Lcom/canhub/cropper/CropImageView;->e()V

    .line 371
    .line 372
    .line 373
    invoke-virtual {v4}, Landroid/view/View;->invalidate()V

    .line 374
    .line 375
    .line 376
    iget-object p1, p0, Lcom/canhub/cropper/CropImageView;->a:Landroid/widget/ImageView;

    .line 377
    .line 378
    const/4 p2, 0x0

    .line 379
    if-eqz p4, :cond_b

    .line 380
    .line 381
    iget-object p3, p0, Lcom/canhub/cropper/CropImageView;->h:Lcom/canhub/cropper/r;

    .line 382
    .line 383
    invoke-static {p3}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 384
    .line 385
    .line 386
    iget-object p4, p3, Lcom/canhub/cropper/r;->d:[F

    .line 387
    .line 388
    const/16 v0, 0x8

    .line 389
    .line 390
    invoke-static {v3, p2, p4, p2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 391
    .line 392
    .line 393
    iget-object p4, p3, Lcom/canhub/cropper/r;->f:Landroid/graphics/RectF;

    .line 394
    .line 395
    iget-object v0, p3, Lcom/canhub/cropper/r;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 396
    .line 397
    invoke-virtual {v0}, Lcom/canhub/cropper/CropOverlayView;->getCropWindowRect()Landroid/graphics/RectF;

    .line 398
    .line 399
    .line 400
    move-result-object v0

    .line 401
    invoke-virtual {p4, v0}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 402
    .line 403
    .line 404
    iget-object p3, p3, Lcom/canhub/cropper/r;->h:[F

    .line 405
    .line 406
    invoke-virtual {v2, p3}, Landroid/graphics/Matrix;->getValues([F)V

    .line 407
    .line 408
    .line 409
    iget-object p3, p0, Lcom/canhub/cropper/CropImageView;->h:Lcom/canhub/cropper/r;

    .line 410
    .line 411
    invoke-virtual {p1, p3}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 412
    .line 413
    .line 414
    goto :goto_7

    .line 415
    :cond_b
    invoke-virtual {p1, v2}, Landroid/widget/ImageView;->setImageMatrix(Landroid/graphics/Matrix;)V

    .line 416
    .line 417
    .line 418
    :goto_7
    invoke-virtual {p0, p2}, Lcom/canhub/cropper/CropImageView;->j(Z)V

    .line 419
    .line 420
    .line 421
    :cond_c
    return-void
.end method

.method public final b()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->i:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget v1, p0, Lcom/canhub/cropper/CropImageView;->p:I

    .line 6
    .line 7
    if-gtz v1, :cond_0

    .line 8
    .line 9
    iget-object v1, p0, Lcom/canhub/cropper/CropImageView;->C:Landroid/net/Uri;

    .line 10
    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    :cond_0
    invoke-static {v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 17
    .line 18
    .line 19
    :cond_1
    const/4 v0, 0x0

    .line 20
    iput-object v0, p0, Lcom/canhub/cropper/CropImageView;->i:Landroid/graphics/Bitmap;

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    iput v1, p0, Lcom/canhub/cropper/CropImageView;->p:I

    .line 24
    .line 25
    iput-object v0, p0, Lcom/canhub/cropper/CropImageView;->C:Landroid/net/Uri;

    .line 26
    .line 27
    const/4 v2, 0x1

    .line 28
    iput v2, p0, Lcom/canhub/cropper/CropImageView;->D:I

    .line 29
    .line 30
    iput v1, p0, Lcom/canhub/cropper/CropImageView;->k:I

    .line 31
    .line 32
    const/high16 v2, 0x3f800000    # 1.0f

    .line 33
    .line 34
    iput v2, p0, Lcom/canhub/cropper/CropImageView;->E:F

    .line 35
    .line 36
    const/4 v2, 0x0

    .line 37
    iput v2, p0, Lcom/canhub/cropper/CropImageView;->F:F

    .line 38
    .line 39
    iput v2, p0, Lcom/canhub/cropper/CropImageView;->G:F

    .line 40
    .line 41
    iget-object v2, p0, Lcom/canhub/cropper/CropImageView;->c:Landroid/graphics/Matrix;

    .line 42
    .line 43
    invoke-virtual {v2}, Landroid/graphics/Matrix;->reset()V

    .line 44
    .line 45
    .line 46
    iput-object v0, p0, Lcom/canhub/cropper/CropImageView;->H:Landroid/graphics/RectF;

    .line 47
    .line 48
    iput v1, p0, Lcom/canhub/cropper/CropImageView;->I:I

    .line 49
    .line 50
    iget-object v1, p0, Lcom/canhub/cropper/CropImageView;->a:Landroid/widget/ImageView;

    .line 51
    .line 52
    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0}, Lcom/canhub/cropper/CropImageView;->h()V

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method public final c(Landroid/graphics/Bitmap$CompressFormat;IIILcom/canhub/cropper/CropImageView$RequestSizeOptions;Landroid/net/Uri;)V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p5

    .line 4
    .line 5
    const-string/jumbo v2, "saveCompressFormat"

    .line 6
    .line 7
    .line 8
    move-object/from16 v3, p1

    .line 9
    .line 10
    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const-string v2, "options"

    .line 14
    .line 15
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-object v2, v0, Lcom/canhub/cropper/CropImageView;->B:Lcom/canhub/cropper/v;

    .line 19
    .line 20
    if-eqz v2, :cond_8

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    iget-object v5, v0, Lcom/canhub/cropper/CropImageView;->i:Landroid/graphics/Bitmap;

    .line 28
    .line 29
    if-eqz v5, :cond_7

    .line 30
    .line 31
    iget-object v6, v0, Lcom/canhub/cropper/CropImageView;->L:Ljava/lang/ref/WeakReference;

    .line 32
    .line 33
    const/4 v7, 0x0

    .line 34
    if-eqz v6, :cond_0

    .line 35
    .line 36
    invoke-virtual {v6}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v6

    .line 40
    check-cast v6, Lcom/canhub/cropper/b;

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    move-object v6, v7

    .line 44
    :goto_0
    if-eqz v6, :cond_1

    .line 45
    .line 46
    iget-object v6, v6, Lcom/canhub/cropper/b;->t:Lkotlinx/coroutines/c1;

    .line 47
    .line 48
    invoke-interface {v6, v7}, Lkotlinx/coroutines/w0;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 49
    .line 50
    .line 51
    :cond_1
    iget v6, v0, Lcom/canhub/cropper/CropImageView;->D:I

    .line 52
    .line 53
    const/4 v8, 0x1

    .line 54
    if-gt v6, v8, :cond_3

    .line 55
    .line 56
    sget-object v6, Lcom/canhub/cropper/CropImageView$RequestSizeOptions;->SAMPLING:Lcom/canhub/cropper/CropImageView$RequestSizeOptions;

    .line 57
    .line 58
    if-ne v1, v6, :cond_2

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_2
    new-instance v6, Landroid/util/Pair;

    .line 62
    .line 63
    invoke-direct {v6, v4, v4}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_3
    :goto_1
    new-instance v6, Landroid/util/Pair;

    .line 68
    .line 69
    invoke-virtual {v5}, Landroid/graphics/Bitmap;->getWidth()I

    .line 70
    .line 71
    .line 72
    move-result v4

    .line 73
    iget v8, v0, Lcom/canhub/cropper/CropImageView;->D:I

    .line 74
    .line 75
    mul-int/2addr v4, v8

    .line 76
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    invoke-virtual {v5}, Landroid/graphics/Bitmap;->getHeight()I

    .line 81
    .line 82
    .line 83
    move-result v8

    .line 84
    iget v9, v0, Lcom/canhub/cropper/CropImageView;->D:I

    .line 85
    .line 86
    mul-int/2addr v8, v9

    .line 87
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 88
    .line 89
    .line 90
    move-result-object v8

    .line 91
    invoke-direct {v6, v4, v8}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    :goto_2
    iget-object v4, v6, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v4, Ljava/lang/Integer;

    .line 97
    .line 98
    iget-object v6, v6, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v6, Ljava/lang/Integer;

    .line 101
    .line 102
    new-instance v8, Ljava/lang/ref/WeakReference;

    .line 103
    .line 104
    new-instance v9, Lcom/canhub/cropper/b;

    .line 105
    .line 106
    move v10, v2

    .line 107
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    const-string v11, "getContext(...)"

    .line 112
    .line 113
    invoke-static {v2, v11}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    new-instance v3, Ljava/lang/ref/WeakReference;

    .line 117
    .line 118
    invoke-direct {v3, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    move-object v11, v4

    .line 122
    iget-object v4, v0, Lcom/canhub/cropper/CropImageView;->C:Landroid/net/Uri;

    .line 123
    .line 124
    move-object v12, v6

    .line 125
    invoke-virtual {v0}, Lcom/canhub/cropper/CropImageView;->getCropPoints()[F

    .line 126
    .line 127
    .line 128
    move-result-object v6

    .line 129
    move-object v13, v7

    .line 130
    iget v7, v0, Lcom/canhub/cropper/CropImageView;->k:I

    .line 131
    .line 132
    invoke-static {v11}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    .line 136
    .line 137
    .line 138
    move-result v11

    .line 139
    invoke-static {v12}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    .line 143
    .line 144
    .line 145
    move-result v12

    .line 146
    iget-object v14, v0, Lcom/canhub/cropper/CropImageView;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 147
    .line 148
    invoke-static {v14}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    move v15, v10

    .line 152
    iget-boolean v10, v14, Lcom/canhub/cropper/CropOverlayView;->z:Z

    .line 153
    .line 154
    move-object/from16 v16, v8

    .line 155
    .line 156
    move v8, v11

    .line 157
    invoke-virtual {v14}, Lcom/canhub/cropper/CropOverlayView;->getAspectRatioX()I

    .line 158
    .line 159
    .line 160
    move-result v11

    .line 161
    invoke-virtual {v14}, Lcom/canhub/cropper/CropOverlayView;->getAspectRatioY()I

    .line 162
    .line 163
    .line 164
    move-result v14

    .line 165
    sget-object v13, Lcom/canhub/cropper/CropImageView$RequestSizeOptions;->NONE:Lcom/canhub/cropper/CropImageView$RequestSizeOptions;

    .line 166
    .line 167
    if-eq v1, v13, :cond_4

    .line 168
    .line 169
    move/from16 v18, p3

    .line 170
    .line 171
    goto :goto_3

    .line 172
    :cond_4
    move/from16 v18, v15

    .line 173
    .line 174
    :goto_3
    if-eq v1, v13, :cond_5

    .line 175
    .line 176
    move/from16 v15, p4

    .line 177
    .line 178
    :cond_5
    iget-boolean v13, v0, Lcom/canhub/cropper/CropImageView;->l:Z

    .line 179
    .line 180
    iget-boolean v1, v0, Lcom/canhub/cropper/CropImageView;->m:Z

    .line 181
    .line 182
    if-nez p6, :cond_6

    .line 183
    .line 184
    move/from16 v19, v1

    .line 185
    .line 186
    iget-object v1, v0, Lcom/canhub/cropper/CropImageView;->M:Landroid/net/Uri;

    .line 187
    .line 188
    move-object/from16 v20, v1

    .line 189
    .line 190
    move-object/from16 v0, v16

    .line 191
    .line 192
    move/from16 v16, v19

    .line 193
    .line 194
    move-object/from16 v17, p5

    .line 195
    .line 196
    move-object v1, v9

    .line 197
    move v9, v12

    .line 198
    move v12, v14

    .line 199
    move v14, v15

    .line 200
    move/from16 v19, p2

    .line 201
    .line 202
    :goto_4
    move v15, v13

    .line 203
    move/from16 v13, v18

    .line 204
    .line 205
    move-object/from16 v18, p1

    .line 206
    .line 207
    goto :goto_5

    .line 208
    :cond_6
    move-object/from16 v20, p6

    .line 209
    .line 210
    move-object/from16 v0, v16

    .line 211
    .line 212
    move/from16 v16, v1

    .line 213
    .line 214
    move/from16 v19, p2

    .line 215
    .line 216
    move-object/from16 v17, p5

    .line 217
    .line 218
    move-object v1, v9

    .line 219
    move v9, v12

    .line 220
    move v12, v14

    .line 221
    move v14, v15

    .line 222
    goto :goto_4

    .line 223
    :goto_5
    invoke-direct/range {v1 .. v20}, Lcom/canhub/cropper/b;-><init>(Landroid/content/Context;Ljava/lang/ref/WeakReference;Landroid/net/Uri;Landroid/graphics/Bitmap;[FIIIZIIIIZZLcom/canhub/cropper/CropImageView$RequestSizeOptions;Landroid/graphics/Bitmap$CompressFormat;ILandroid/net/Uri;)V

    .line 224
    .line 225
    .line 226
    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 227
    .line 228
    .line 229
    move-object/from16 v1, p0

    .line 230
    .line 231
    iput-object v0, v1, Lcom/canhub/cropper/CropImageView;->L:Ljava/lang/ref/WeakReference;

    .line 232
    .line 233
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    invoke-static {v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 238
    .line 239
    .line 240
    check-cast v0, Lcom/canhub/cropper/b;

    .line 241
    .line 242
    sget-object v2, Lkotlinx/coroutines/f0;->a:Lg7/e;

    .line 243
    .line 244
    new-instance v3, Lcom/canhub/cropper/BitmapCroppingWorkerJob$start$1;

    .line 245
    .line 246
    const/4 v13, 0x0

    .line 247
    invoke-direct {v3, v0, v13}, Lcom/canhub/cropper/BitmapCroppingWorkerJob$start$1;-><init>(Lcom/canhub/cropper/b;Lh6/c;)V

    .line 248
    .line 249
    .line 250
    const/4 v4, 0x2

    .line 251
    invoke-static {v0, v2, v13, v3, v4}, Lkotlinx/coroutines/x;->v(Lkotlinx/coroutines/v;Lh6/h;Lkotlinx/coroutines/CoroutineStart;Lr6/e;I)Lkotlinx/coroutines/k1;

    .line 252
    .line 253
    .line 254
    move-result-object v2

    .line 255
    iput-object v2, v0, Lcom/canhub/cropper/b;->t:Lkotlinx/coroutines/c1;

    .line 256
    .line 257
    invoke-virtual {v1}, Lcom/canhub/cropper/CropImageView;->i()V

    .line 258
    .line 259
    .line 260
    return-void

    .line 261
    :cond_7
    move-object v1, v0

    .line 262
    return-void

    .line 263
    :cond_8
    move-object v1, v0

    .line 264
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 265
    .line 266
    const-string v2, "mOnCropImageCompleteListener is not set"

    .line 267
    .line 268
    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 269
    .line 270
    .line 271
    throw v0
.end method

.method public final d(ZZ)V
    .locals 12

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    iget-object v2, p0, Lcom/canhub/cropper/CropImageView;->i:Landroid/graphics/Bitmap;

    .line 10
    .line 11
    if-eqz v2, :cond_a

    .line 12
    .line 13
    if-lez v0, :cond_a

    .line 14
    .line 15
    if-lez v1, :cond_a

    .line 16
    .line 17
    iget-object v2, p0, Lcom/canhub/cropper/CropImageView;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 18
    .line 19
    invoke-static {v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v2}, Lcom/canhub/cropper/CropOverlayView;->getCropWindowRect()Landroid/graphics/RectF;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    const/4 v4, 0x0

    .line 27
    const/4 v5, 0x0

    .line 28
    if-eqz p1, :cond_1

    .line 29
    .line 30
    iget p1, v3, Landroid/graphics/RectF;->left:F

    .line 31
    .line 32
    cmpg-float p1, p1, v5

    .line 33
    .line 34
    if-ltz p1, :cond_0

    .line 35
    .line 36
    iget p1, v3, Landroid/graphics/RectF;->top:F

    .line 37
    .line 38
    cmpg-float p1, p1, v5

    .line 39
    .line 40
    if-ltz p1, :cond_0

    .line 41
    .line 42
    iget p1, v3, Landroid/graphics/RectF;->right:F

    .line 43
    .line 44
    int-to-float p2, v0

    .line 45
    cmpl-float p1, p1, p2

    .line 46
    .line 47
    if-gtz p1, :cond_0

    .line 48
    .line 49
    iget p1, v3, Landroid/graphics/RectF;->bottom:F

    .line 50
    .line 51
    int-to-float p2, v1

    .line 52
    cmpl-float p1, p1, p2

    .line 53
    .line 54
    if-lez p1, :cond_a

    .line 55
    .line 56
    :cond_0
    int-to-float p1, v0

    .line 57
    int-to-float p2, v1

    .line 58
    invoke-virtual {p0, p1, p2, v4, v4}, Lcom/canhub/cropper/CropImageView;->a(FFZZ)V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :cond_1
    iget-boolean p1, p0, Lcom/canhub/cropper/CropImageView;->y:Z

    .line 63
    .line 64
    const/high16 v6, 0x3f800000    # 1.0f

    .line 65
    .line 66
    if-nez p1, :cond_2

    .line 67
    .line 68
    iget p1, p0, Lcom/canhub/cropper/CropImageView;->E:F

    .line 69
    .line 70
    cmpl-float p1, p1, v6

    .line 71
    .line 72
    if-lez p1, :cond_a

    .line 73
    .line 74
    :cond_2
    iget p1, p0, Lcom/canhub/cropper/CropImageView;->E:F

    .line 75
    .line 76
    iget v7, p0, Lcom/canhub/cropper/CropImageView;->z:I

    .line 77
    .line 78
    int-to-float v7, v7

    .line 79
    cmpg-float p1, p1, v7

    .line 80
    .line 81
    if-gez p1, :cond_3

    .line 82
    .line 83
    invoke-virtual {v3}, Landroid/graphics/RectF;->width()F

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    int-to-float v7, v0

    .line 88
    const/high16 v8, 0x3f000000    # 0.5f

    .line 89
    .line 90
    mul-float v9, v7, v8

    .line 91
    .line 92
    cmpg-float p1, p1, v9

    .line 93
    .line 94
    if-gez p1, :cond_3

    .line 95
    .line 96
    invoke-virtual {v3}, Landroid/graphics/RectF;->height()F

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    int-to-float v9, v1

    .line 101
    mul-float/2addr v8, v9

    .line 102
    cmpg-float p1, p1, v8

    .line 103
    .line 104
    if-gez p1, :cond_3

    .line 105
    .line 106
    iget p1, p0, Lcom/canhub/cropper/CropImageView;->z:I

    .line 107
    .line 108
    int-to-float p1, p1

    .line 109
    invoke-virtual {v3}, Landroid/graphics/RectF;->width()F

    .line 110
    .line 111
    .line 112
    move-result v8

    .line 113
    iget v10, p0, Lcom/canhub/cropper/CropImageView;->E:F

    .line 114
    .line 115
    div-float/2addr v8, v10

    .line 116
    const v10, 0x3f23d70a    # 0.64f

    .line 117
    .line 118
    .line 119
    div-float/2addr v8, v10

    .line 120
    div-float/2addr v7, v8

    .line 121
    invoke-virtual {v3}, Landroid/graphics/RectF;->height()F

    .line 122
    .line 123
    .line 124
    move-result v8

    .line 125
    iget v11, p0, Lcom/canhub/cropper/CropImageView;->E:F

    .line 126
    .line 127
    div-float/2addr v8, v11

    .line 128
    div-float/2addr v8, v10

    .line 129
    div-float/2addr v9, v8

    .line 130
    invoke-static {v7, v9}, Ljava/lang/Math;->min(FF)F

    .line 131
    .line 132
    .line 133
    move-result v7

    .line 134
    invoke-static {p1, v7}, Ljava/lang/Math;->min(FF)F

    .line 135
    .line 136
    .line 137
    move-result p1

    .line 138
    goto :goto_0

    .line 139
    :cond_3
    move p1, v5

    .line 140
    :goto_0
    iget v7, p0, Lcom/canhub/cropper/CropImageView;->E:F

    .line 141
    .line 142
    cmpl-float v7, v7, v6

    .line 143
    .line 144
    if-lez v7, :cond_5

    .line 145
    .line 146
    invoke-virtual {v3}, Landroid/graphics/RectF;->width()F

    .line 147
    .line 148
    .line 149
    move-result v7

    .line 150
    int-to-float v8, v0

    .line 151
    const v9, 0x3f266666    # 0.65f

    .line 152
    .line 153
    .line 154
    mul-float v10, v8, v9

    .line 155
    .line 156
    cmpl-float v7, v7, v10

    .line 157
    .line 158
    if-gtz v7, :cond_4

    .line 159
    .line 160
    invoke-virtual {v3}, Landroid/graphics/RectF;->height()F

    .line 161
    .line 162
    .line 163
    move-result v7

    .line 164
    int-to-float v10, v1

    .line 165
    mul-float/2addr v10, v9

    .line 166
    cmpl-float v7, v7, v10

    .line 167
    .line 168
    if-lez v7, :cond_5

    .line 169
    .line 170
    :cond_4
    invoke-virtual {v3}, Landroid/graphics/RectF;->width()F

    .line 171
    .line 172
    .line 173
    move-result p1

    .line 174
    iget v7, p0, Lcom/canhub/cropper/CropImageView;->E:F

    .line 175
    .line 176
    div-float/2addr p1, v7

    .line 177
    const v7, 0x3f028f5c    # 0.51f

    .line 178
    .line 179
    .line 180
    div-float/2addr p1, v7

    .line 181
    div-float/2addr v8, p1

    .line 182
    int-to-float p1, v1

    .line 183
    invoke-virtual {v3}, Landroid/graphics/RectF;->height()F

    .line 184
    .line 185
    .line 186
    move-result v3

    .line 187
    iget v9, p0, Lcom/canhub/cropper/CropImageView;->E:F

    .line 188
    .line 189
    div-float/2addr v3, v9

    .line 190
    div-float/2addr v3, v7

    .line 191
    div-float/2addr p1, v3

    .line 192
    invoke-static {v8, p1}, Ljava/lang/Math;->min(FF)F

    .line 193
    .line 194
    .line 195
    move-result p1

    .line 196
    invoke-static {v6, p1}, Ljava/lang/Math;->max(FF)F

    .line 197
    .line 198
    .line 199
    move-result p1

    .line 200
    :cond_5
    iget-boolean v3, p0, Lcom/canhub/cropper/CropImageView;->y:Z

    .line 201
    .line 202
    if-nez v3, :cond_6

    .line 203
    .line 204
    goto :goto_1

    .line 205
    :cond_6
    move v6, p1

    .line 206
    :goto_1
    cmpl-float p1, v6, v5

    .line 207
    .line 208
    if-lez p1, :cond_a

    .line 209
    .line 210
    iget p1, p0, Lcom/canhub/cropper/CropImageView;->E:F

    .line 211
    .line 212
    cmpg-float p1, v6, p1

    .line 213
    .line 214
    if-nez p1, :cond_7

    .line 215
    .line 216
    goto :goto_2

    .line 217
    :cond_7
    if-eqz p2, :cond_9

    .line 218
    .line 219
    iget-object p1, p0, Lcom/canhub/cropper/CropImageView;->h:Lcom/canhub/cropper/r;

    .line 220
    .line 221
    if-nez p1, :cond_8

    .line 222
    .line 223
    new-instance p1, Lcom/canhub/cropper/r;

    .line 224
    .line 225
    iget-object v3, p0, Lcom/canhub/cropper/CropImageView;->a:Landroid/widget/ImageView;

    .line 226
    .line 227
    invoke-direct {p1, v3, v2}, Lcom/canhub/cropper/r;-><init>(Landroid/widget/ImageView;Lcom/canhub/cropper/CropOverlayView;)V

    .line 228
    .line 229
    .line 230
    iput-object p1, p0, Lcom/canhub/cropper/CropImageView;->h:Lcom/canhub/cropper/r;

    .line 231
    .line 232
    :cond_8
    iget-object p1, p0, Lcom/canhub/cropper/CropImageView;->h:Lcom/canhub/cropper/r;

    .line 233
    .line 234
    invoke-static {p1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 235
    .line 236
    .line 237
    const-string v2, "boundPoints"

    .line 238
    .line 239
    iget-object v3, p0, Lcom/canhub/cropper/CropImageView;->f:[F

    .line 240
    .line 241
    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    const-string v2, "imageMatrix"

    .line 245
    .line 246
    iget-object v5, p0, Lcom/canhub/cropper/CropImageView;->c:Landroid/graphics/Matrix;

    .line 247
    .line 248
    invoke-static {v5, v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {p1}, Landroid/view/animation/Animation;->reset()V

    .line 252
    .line 253
    .line 254
    iget-object v2, p1, Lcom/canhub/cropper/r;->c:[F

    .line 255
    .line 256
    const/16 v7, 0x8

    .line 257
    .line 258
    invoke-static {v3, v4, v2, v4, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 259
    .line 260
    .line 261
    iget-object v2, p1, Lcom/canhub/cropper/r;->e:Landroid/graphics/RectF;

    .line 262
    .line 263
    iget-object v3, p1, Lcom/canhub/cropper/r;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 264
    .line 265
    invoke-virtual {v3}, Lcom/canhub/cropper/CropOverlayView;->getCropWindowRect()Landroid/graphics/RectF;

    .line 266
    .line 267
    .line 268
    move-result-object v3

    .line 269
    invoke-virtual {v2, v3}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 270
    .line 271
    .line 272
    iget-object p1, p1, Lcom/canhub/cropper/r;->g:[F

    .line 273
    .line 274
    invoke-virtual {v5, p1}, Landroid/graphics/Matrix;->getValues([F)V

    .line 275
    .line 276
    .line 277
    :cond_9
    iput v6, p0, Lcom/canhub/cropper/CropImageView;->E:F

    .line 278
    .line 279
    int-to-float p1, v0

    .line 280
    int-to-float v0, v1

    .line 281
    const/4 v1, 0x1

    .line 282
    invoke-virtual {p0, p1, v0, v1, p2}, Lcom/canhub/cropper/CropImageView;->a(FFZZ)V

    .line 283
    .line 284
    .line 285
    :cond_a
    :goto_2
    return-void
.end method

.method public final e()V
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->f:[F

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    aput v2, v0, v1

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    aput v2, v0, v3

    .line 9
    .line 10
    iget-object v4, p0, Lcom/canhub/cropper/CropImageView;->i:Landroid/graphics/Bitmap;

    .line 11
    .line 12
    invoke-static {v4}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getWidth()I

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    int-to-float v4, v4

    .line 20
    const/4 v5, 0x2

    .line 21
    aput v4, v0, v5

    .line 22
    .line 23
    const/4 v4, 0x3

    .line 24
    aput v2, v0, v4

    .line 25
    .line 26
    iget-object v6, p0, Lcom/canhub/cropper/CropImageView;->i:Landroid/graphics/Bitmap;

    .line 27
    .line 28
    invoke-static {v6}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getWidth()I

    .line 32
    .line 33
    .line 34
    move-result v6

    .line 35
    int-to-float v6, v6

    .line 36
    const/4 v7, 0x4

    .line 37
    aput v6, v0, v7

    .line 38
    .line 39
    iget-object v6, p0, Lcom/canhub/cropper/CropImageView;->i:Landroid/graphics/Bitmap;

    .line 40
    .line 41
    invoke-static {v6}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getHeight()I

    .line 45
    .line 46
    .line 47
    move-result v6

    .line 48
    int-to-float v6, v6

    .line 49
    const/4 v8, 0x5

    .line 50
    aput v6, v0, v8

    .line 51
    .line 52
    const/4 v6, 0x6

    .line 53
    aput v2, v0, v6

    .line 54
    .line 55
    iget-object v9, p0, Lcom/canhub/cropper/CropImageView;->i:Landroid/graphics/Bitmap;

    .line 56
    .line 57
    invoke-static {v9}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v9}, Landroid/graphics/Bitmap;->getHeight()I

    .line 61
    .line 62
    .line 63
    move-result v9

    .line 64
    int-to-float v9, v9

    .line 65
    const/4 v10, 0x7

    .line 66
    aput v9, v0, v10

    .line 67
    .line 68
    iget-object v9, p0, Lcom/canhub/cropper/CropImageView;->c:Landroid/graphics/Matrix;

    .line 69
    .line 70
    invoke-virtual {v9, v0}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 71
    .line 72
    .line 73
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->g:[F

    .line 74
    .line 75
    aput v2, v0, v1

    .line 76
    .line 77
    aput v2, v0, v3

    .line 78
    .line 79
    const/high16 v1, 0x42c80000    # 100.0f

    .line 80
    .line 81
    aput v1, v0, v5

    .line 82
    .line 83
    aput v2, v0, v4

    .line 84
    .line 85
    aput v1, v0, v7

    .line 86
    .line 87
    aput v1, v0, v8

    .line 88
    .line 89
    aput v2, v0, v6

    .line 90
    .line 91
    aput v1, v0, v10

    .line 92
    .line 93
    invoke-virtual {v9, v0}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 94
    .line 95
    .line 96
    return-void
.end method

.method public final f(I)V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lcom/canhub/cropper/CropImageView;->i:Landroid/graphics/Bitmap;

    .line 6
    .line 7
    if-eqz v2, :cond_6

    .line 8
    .line 9
    if-gez v1, :cond_0

    .line 10
    .line 11
    rem-int/lit16 v1, v1, 0x168

    .line 12
    .line 13
    add-int/lit16 v1, v1, 0x168

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    rem-int/lit16 v1, v1, 0x168

    .line 17
    .line 18
    :goto_0
    iget-object v2, v0, Lcom/canhub/cropper/CropImageView;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 19
    .line 20
    invoke-static {v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    iget-boolean v3, v2, Lcom/canhub/cropper/CropOverlayView;->z:Z

    .line 24
    .line 25
    const/4 v4, 0x1

    .line 26
    const/4 v5, 0x0

    .line 27
    if-nez v3, :cond_2

    .line 28
    .line 29
    const/16 v3, 0x2e

    .line 30
    .line 31
    if-gt v3, v1, :cond_1

    .line 32
    .line 33
    const/16 v3, 0x87

    .line 34
    .line 35
    if-ge v1, v3, :cond_1

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    const/16 v3, 0xd8

    .line 39
    .line 40
    if-gt v3, v1, :cond_2

    .line 41
    .line 42
    const/16 v3, 0x131

    .line 43
    .line 44
    if-ge v1, v3, :cond_2

    .line 45
    .line 46
    :goto_1
    move v3, v4

    .line 47
    goto :goto_2

    .line 48
    :cond_2
    move v3, v5

    .line 49
    :goto_2
    sget-object v6, Lcom/canhub/cropper/h;->c:Landroid/graphics/RectF;

    .line 50
    .line 51
    invoke-virtual {v2}, Lcom/canhub/cropper/CropOverlayView;->getCropWindowRect()Landroid/graphics/RectF;

    .line 52
    .line 53
    .line 54
    move-result-object v7

    .line 55
    invoke-virtual {v6, v7}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 56
    .line 57
    .line 58
    if-eqz v3, :cond_3

    .line 59
    .line 60
    invoke-virtual {v6}, Landroid/graphics/RectF;->height()F

    .line 61
    .line 62
    .line 63
    move-result v7

    .line 64
    goto :goto_3

    .line 65
    :cond_3
    invoke-virtual {v6}, Landroid/graphics/RectF;->width()F

    .line 66
    .line 67
    .line 68
    move-result v7

    .line 69
    :goto_3
    const/high16 v8, 0x40000000    # 2.0f

    .line 70
    .line 71
    div-float/2addr v7, v8

    .line 72
    if-eqz v3, :cond_4

    .line 73
    .line 74
    invoke-virtual {v6}, Landroid/graphics/RectF;->width()F

    .line 75
    .line 76
    .line 77
    move-result v9

    .line 78
    goto :goto_4

    .line 79
    :cond_4
    invoke-virtual {v6}, Landroid/graphics/RectF;->height()F

    .line 80
    .line 81
    .line 82
    move-result v9

    .line 83
    :goto_4
    div-float/2addr v9, v8

    .line 84
    if-eqz v3, :cond_5

    .line 85
    .line 86
    iget-boolean v3, v0, Lcom/canhub/cropper/CropImageView;->l:Z

    .line 87
    .line 88
    iget-boolean v8, v0, Lcom/canhub/cropper/CropImageView;->m:Z

    .line 89
    .line 90
    iput-boolean v8, v0, Lcom/canhub/cropper/CropImageView;->l:Z

    .line 91
    .line 92
    iput-boolean v3, v0, Lcom/canhub/cropper/CropImageView;->m:Z

    .line 93
    .line 94
    :cond_5
    iget-object v3, v0, Lcom/canhub/cropper/CropImageView;->c:Landroid/graphics/Matrix;

    .line 95
    .line 96
    iget-object v8, v0, Lcom/canhub/cropper/CropImageView;->d:Landroid/graphics/Matrix;

    .line 97
    .line 98
    invoke-virtual {v3, v8}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    .line 99
    .line 100
    .line 101
    sget-object v10, Lcom/canhub/cropper/h;->d:[F

    .line 102
    .line 103
    invoke-virtual {v6}, Landroid/graphics/RectF;->centerX()F

    .line 104
    .line 105
    .line 106
    move-result v11

    .line 107
    aput v11, v10, v5

    .line 108
    .line 109
    invoke-virtual {v6}, Landroid/graphics/RectF;->centerY()F

    .line 110
    .line 111
    .line 112
    move-result v11

    .line 113
    aput v11, v10, v4

    .line 114
    .line 115
    const/4 v11, 0x2

    .line 116
    const/4 v12, 0x0

    .line 117
    aput v12, v10, v11

    .line 118
    .line 119
    const/4 v13, 0x3

    .line 120
    aput v12, v10, v13

    .line 121
    .line 122
    const/4 v14, 0x4

    .line 123
    const/high16 v15, 0x3f800000    # 1.0f

    .line 124
    .line 125
    aput v15, v10, v14

    .line 126
    .line 127
    const/16 v16, 0x5

    .line 128
    .line 129
    aput v12, v10, v16

    .line 130
    .line 131
    invoke-virtual {v8, v10}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 132
    .line 133
    .line 134
    iget v8, v0, Lcom/canhub/cropper/CropImageView;->k:I

    .line 135
    .line 136
    add-int/2addr v8, v1

    .line 137
    rem-int/lit16 v8, v8, 0x168

    .line 138
    .line 139
    iput v8, v0, Lcom/canhub/cropper/CropImageView;->k:I

    .line 140
    .line 141
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 142
    .line 143
    .line 144
    move-result v1

    .line 145
    int-to-float v1, v1

    .line 146
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 147
    .line 148
    .line 149
    move-result v8

    .line 150
    int-to-float v8, v8

    .line 151
    invoke-virtual {v0, v1, v8, v4, v5}, Lcom/canhub/cropper/CropImageView;->a(FFZZ)V

    .line 152
    .line 153
    .line 154
    sget-object v1, Lcom/canhub/cropper/h;->e:[F

    .line 155
    .line 156
    invoke-virtual {v3, v1, v10}, Landroid/graphics/Matrix;->mapPoints([F[F)V

    .line 157
    .line 158
    .line 159
    iget v8, v0, Lcom/canhub/cropper/CropImageView;->E:F

    .line 160
    .line 161
    aget v12, v1, v14

    .line 162
    .line 163
    aget v17, v1, v11

    .line 164
    .line 165
    sub-float v12, v12, v17

    .line 166
    .line 167
    move/from16 p1, v11

    .line 168
    .line 169
    float-to-double v11, v12

    .line 170
    move/from16 v17, v13

    .line 171
    .line 172
    move/from16 v18, v14

    .line 173
    .line 174
    const-wide/high16 v13, 0x4000000000000000L    # 2.0

    .line 175
    .line 176
    invoke-static {v11, v12, v13, v14}, Ljava/lang/Math;->pow(DD)D

    .line 177
    .line 178
    .line 179
    move-result-wide v11

    .line 180
    aget v19, v1, v16

    .line 181
    .line 182
    aget v20, v1, v17

    .line 183
    .line 184
    sub-float v4, v19, v20

    .line 185
    .line 186
    move-object/from16 v20, v6

    .line 187
    .line 188
    float-to-double v5, v4

    .line 189
    invoke-static {v5, v6, v13, v14}, Ljava/lang/Math;->pow(DD)D

    .line 190
    .line 191
    .line 192
    move-result-wide v4

    .line 193
    add-double/2addr v4, v11

    .line 194
    invoke-static {v4, v5}, Ljava/lang/Math;->sqrt(D)D

    .line 195
    .line 196
    .line 197
    move-result-wide v4

    .line 198
    double-to-float v4, v4

    .line 199
    div-float/2addr v8, v4

    .line 200
    iput v8, v0, Lcom/canhub/cropper/CropImageView;->E:F

    .line 201
    .line 202
    invoke-static {v8, v15}, Ljava/lang/Math;->max(FF)F

    .line 203
    .line 204
    .line 205
    move-result v4

    .line 206
    iput v4, v0, Lcom/canhub/cropper/CropImageView;->E:F

    .line 207
    .line 208
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 209
    .line 210
    .line 211
    move-result v4

    .line 212
    int-to-float v4, v4

    .line 213
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 214
    .line 215
    .line 216
    move-result v5

    .line 217
    int-to-float v5, v5

    .line 218
    const/4 v6, 0x1

    .line 219
    const/4 v8, 0x0

    .line 220
    invoke-virtual {v0, v4, v5, v6, v8}, Lcom/canhub/cropper/CropImageView;->a(FFZZ)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v3, v1, v10}, Landroid/graphics/Matrix;->mapPoints([F[F)V

    .line 224
    .line 225
    .line 226
    aget v3, v1, v18

    .line 227
    .line 228
    aget v4, v1, p1

    .line 229
    .line 230
    sub-float/2addr v3, v4

    .line 231
    float-to-double v3, v3

    .line 232
    invoke-static {v3, v4, v13, v14}, Ljava/lang/Math;->pow(DD)D

    .line 233
    .line 234
    .line 235
    move-result-wide v3

    .line 236
    aget v5, v1, v16

    .line 237
    .line 238
    aget v6, v1, v17

    .line 239
    .line 240
    sub-float/2addr v5, v6

    .line 241
    float-to-double v5, v5

    .line 242
    invoke-static {v5, v6, v13, v14}, Ljava/lang/Math;->pow(DD)D

    .line 243
    .line 244
    .line 245
    move-result-wide v5

    .line 246
    add-double/2addr v5, v3

    .line 247
    invoke-static {v5, v6}, Ljava/lang/Math;->sqrt(D)D

    .line 248
    .line 249
    .line 250
    move-result-wide v3

    .line 251
    double-to-float v3, v3

    .line 252
    mul-float/2addr v7, v3

    .line 253
    mul-float/2addr v9, v3

    .line 254
    const/16 v19, 0x0

    .line 255
    .line 256
    aget v3, v1, v19

    .line 257
    .line 258
    sub-float v4, v3, v7

    .line 259
    .line 260
    const/4 v6, 0x1

    .line 261
    aget v1, v1, v6

    .line 262
    .line 263
    sub-float v5, v1, v9

    .line 264
    .line 265
    add-float/2addr v3, v7

    .line 266
    add-float/2addr v1, v9

    .line 267
    move-object/from16 v7, v20

    .line 268
    .line 269
    invoke-virtual {v7, v4, v5, v3, v1}, Landroid/graphics/RectF;->set(FFFF)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {v2}, Lcom/canhub/cropper/CropOverlayView;->g()V

    .line 273
    .line 274
    .line 275
    invoke-virtual {v2, v7}, Lcom/canhub/cropper/CropOverlayView;->setCropWindowRect(Landroid/graphics/RectF;)V

    .line 276
    .line 277
    .line 278
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 279
    .line 280
    .line 281
    move-result v1

    .line 282
    int-to-float v1, v1

    .line 283
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 284
    .line 285
    .line 286
    move-result v3

    .line 287
    int-to-float v3, v3

    .line 288
    const/4 v8, 0x0

    .line 289
    invoke-virtual {v0, v1, v3, v6, v8}, Lcom/canhub/cropper/CropImageView;->a(FFZZ)V

    .line 290
    .line 291
    .line 292
    invoke-virtual {v0, v8, v8}, Lcom/canhub/cropper/CropImageView;->d(ZZ)V

    .line 293
    .line 294
    .line 295
    invoke-virtual {v2}, Lcom/canhub/cropper/CropOverlayView;->getCropWindowRect()Landroid/graphics/RectF;

    .line 296
    .line 297
    .line 298
    move-result-object v1

    .line 299
    invoke-virtual {v2, v1}, Lcom/canhub/cropper/CropOverlayView;->e(Landroid/graphics/RectF;)V

    .line 300
    .line 301
    .line 302
    iget-object v2, v2, Lcom/canhub/cropper/CropOverlayView;->g:Lcom/canhub/cropper/e0;

    .line 303
    .line 304
    iget-object v2, v2, Lcom/canhub/cropper/e0;->a:Landroid/graphics/RectF;

    .line 305
    .line 306
    invoke-virtual {v2, v1}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 307
    .line 308
    .line 309
    :cond_6
    return-void
.end method

.method public final g(Landroid/graphics/Bitmap;ILandroid/net/Uri;II)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->i:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    :cond_0
    invoke-virtual {p0}, Lcom/canhub/cropper/CropImageView;->b()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/canhub/cropper/CropImageView;->i:Landroid/graphics/Bitmap;

    .line 15
    .line 16
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->a:Landroid/widget/ImageView;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 19
    .line 20
    .line 21
    iput-object p3, p0, Lcom/canhub/cropper/CropImageView;->C:Landroid/net/Uri;

    .line 22
    .line 23
    iput p2, p0, Lcom/canhub/cropper/CropImageView;->p:I

    .line 24
    .line 25
    iput p4, p0, Lcom/canhub/cropper/CropImageView;->D:I

    .line 26
    .line 27
    iput p5, p0, Lcom/canhub/cropper/CropImageView;->k:I

    .line 28
    .line 29
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    int-to-float p1, p1

    .line 34
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 35
    .line 36
    .line 37
    move-result p2

    .line 38
    int-to-float p2, p2

    .line 39
    const/4 p3, 0x1

    .line 40
    const/4 p4, 0x0

    .line 41
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/canhub/cropper/CropImageView;->a(FFZZ)V

    .line 42
    .line 43
    .line 44
    iget-object p1, p0, Lcom/canhub/cropper/CropImageView;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 45
    .line 46
    if-eqz p1, :cond_1

    .line 47
    .line 48
    invoke-virtual {p1}, Lcom/canhub/cropper/CropOverlayView;->g()V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Lcom/canhub/cropper/CropImageView;->h()V

    .line 52
    .line 53
    .line 54
    :cond_1
    return-void
.end method

.method public final getAspectRatio()Landroid/util/Pair;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroid/util/Pair<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    new-instance v0, Landroid/util/Pair;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/canhub/cropper/CropImageView;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 4
    .line 5
    invoke-static {v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1}, Lcom/canhub/cropper/CropOverlayView;->getAspectRatioX()I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-virtual {v1}, Lcom/canhub/cropper/CropOverlayView;->getAspectRatioY()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-direct {v0, v2, v1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    return-object v0
.end method

.method public final getCornerShape()Lcom/canhub/cropper/CropImageView$CropCornerShape;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 2
    .line 3
    invoke-static {v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Lcom/canhub/cropper/CropOverlayView;->getCornerShape()Lcom/canhub/cropper/CropImageView$CropCornerShape;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0
.end method

.method public final getCropLabelText()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->u:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getCropLabelTextColor()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/canhub/cropper/CropImageView;->w:I

    .line 2
    .line 3
    return v0
.end method

.method public final getCropLabelTextSize()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/canhub/cropper/CropImageView;->v:F

    .line 2
    .line 3
    return v0
.end method

.method public final getCropPoints()[F
    .locals 8
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 2
    .line 3
    invoke-static {v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Lcom/canhub/cropper/CropOverlayView;->getCropWindowRect()Landroid/graphics/RectF;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget v1, v0, Landroid/graphics/RectF;->left:F

    .line 11
    .line 12
    iget v2, v0, Landroid/graphics/RectF;->top:F

    .line 13
    .line 14
    iget v3, v0, Landroid/graphics/RectF;->right:F

    .line 15
    .line 16
    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    .line 17
    .line 18
    const/16 v4, 0x8

    .line 19
    .line 20
    new-array v5, v4, [F

    .line 21
    .line 22
    const/4 v6, 0x0

    .line 23
    aput v1, v5, v6

    .line 24
    .line 25
    const/4 v7, 0x1

    .line 26
    aput v2, v5, v7

    .line 27
    .line 28
    const/4 v7, 0x2

    .line 29
    aput v3, v5, v7

    .line 30
    .line 31
    const/4 v7, 0x3

    .line 32
    aput v2, v5, v7

    .line 33
    .line 34
    const/4 v2, 0x4

    .line 35
    aput v3, v5, v2

    .line 36
    .line 37
    const/4 v2, 0x5

    .line 38
    aput v0, v5, v2

    .line 39
    .line 40
    const/4 v2, 0x6

    .line 41
    aput v1, v5, v2

    .line 42
    .line 43
    const/4 v1, 0x7

    .line 44
    aput v0, v5, v1

    .line 45
    .line 46
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->c:Landroid/graphics/Matrix;

    .line 47
    .line 48
    iget-object v1, p0, Lcom/canhub/cropper/CropImageView;->d:Landroid/graphics/Matrix;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1, v5}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 54
    .line 55
    .line 56
    new-array v0, v4, [F

    .line 57
    .line 58
    :goto_0
    if-ge v6, v4, :cond_0

    .line 59
    .line 60
    aget v1, v5, v6

    .line 61
    .line 62
    iget v2, p0, Lcom/canhub/cropper/CropImageView;->D:I

    .line 63
    .line 64
    int-to-float v2, v2

    .line 65
    mul-float/2addr v1, v2

    .line 66
    aput v1, v0, v6

    .line 67
    .line 68
    add-int/lit8 v6, v6, 0x1

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_0
    return-object v0
.end method

.method public final getCropRect()Landroid/graphics/Rect;
    .locals 8
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget v0, p0, Lcom/canhub/cropper/CropImageView;->D:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/canhub/cropper/CropImageView;->i:Landroid/graphics/Bitmap;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    return-object v0

    .line 9
    :cond_0
    move-object v2, v1

    .line 10
    invoke-virtual {p0}, Lcom/canhub/cropper/CropImageView;->getCropPoints()[F

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    mul-int/2addr v3, v0

    .line 19
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    mul-int/2addr v2, v0

    .line 24
    sget-object v0, Lcom/canhub/cropper/h;->a:Landroid/graphics/Rect;

    .line 25
    .line 26
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 27
    .line 28
    invoke-static {v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iget-boolean v4, v0, Lcom/canhub/cropper/CropOverlayView;->z:Z

    .line 32
    .line 33
    invoke-virtual {v0}, Lcom/canhub/cropper/CropOverlayView;->getAspectRatioX()I

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    invoke-virtual {v0}, Lcom/canhub/cropper/CropOverlayView;->getAspectRatioY()I

    .line 38
    .line 39
    .line 40
    move-result v6

    .line 41
    move v7, v3

    .line 42
    move v3, v2

    .line 43
    move v2, v7

    .line 44
    invoke-static/range {v1 .. v6}, Lcom/canhub/cropper/h;->o([FIIZII)Landroid/graphics/Rect;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    return-object v0
.end method

.method public final getCropShape()Lcom/canhub/cropper/CropImageView$CropShape;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 2
    .line 3
    invoke-static {v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Lcom/canhub/cropper/CropOverlayView;->getCropShape()Lcom/canhub/cropper/CropImageView$CropShape;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0
.end method

.method public final getCropWindowRect()Landroid/graphics/RectF;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/canhub/cropper/CropOverlayView;->getCropWindowRect()Landroid/graphics/RectF;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
.end method

.method public final getCroppedImage()Landroid/graphics/Bitmap;
    .locals 18
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, Lcom/canhub/cropper/CropImageView$RequestSizeOptions;->RESIZE_INSIDE:Lcom/canhub/cropper/CropImageView$RequestSizeOptions;

    .line 4
    .line 5
    const-string v2, "options"

    .line 6
    .line 7
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object v3, v0, Lcom/canhub/cropper/CropImageView;->i:Landroid/graphics/Bitmap;

    .line 11
    .line 12
    if-eqz v3, :cond_2

    .line 13
    .line 14
    iget-object v2, v0, Lcom/canhub/cropper/CropImageView;->C:Landroid/net/Uri;

    .line 15
    .line 16
    iget-object v4, v0, Lcom/canhub/cropper/CropImageView;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 17
    .line 18
    const/4 v14, 0x0

    .line 19
    const/4 v15, 0x0

    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    iget v2, v0, Lcom/canhub/cropper/CropImageView;->D:I

    .line 23
    .line 24
    const/4 v5, 0x1

    .line 25
    if-gt v2, v5, :cond_0

    .line 26
    .line 27
    sget-object v2, Lcom/canhub/cropper/CropImageView$RequestSizeOptions;->SAMPLING:Lcom/canhub/cropper/CropImageView$RequestSizeOptions;

    .line 28
    .line 29
    if-ne v1, v2, :cond_1

    .line 30
    .line 31
    :cond_0
    sget-object v2, Lcom/canhub/cropper/h;->a:Landroid/graphics/Rect;

    .line 32
    .line 33
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    const-string v2, "getContext(...)"

    .line 38
    .line 39
    invoke-static {v5, v2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    iget-object v6, v0, Lcom/canhub/cropper/CropImageView;->C:Landroid/net/Uri;

    .line 43
    .line 44
    invoke-virtual {v0}, Lcom/canhub/cropper/CropImageView;->getCropPoints()[F

    .line 45
    .line 46
    .line 47
    move-result-object v7

    .line 48
    iget v8, v0, Lcom/canhub/cropper/CropImageView;->k:I

    .line 49
    .line 50
    iget-object v2, v0, Lcom/canhub/cropper/CropImageView;->i:Landroid/graphics/Bitmap;

    .line 51
    .line 52
    invoke-static {v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    iget v3, v0, Lcom/canhub/cropper/CropImageView;->D:I

    .line 60
    .line 61
    mul-int v9, v2, v3

    .line 62
    .line 63
    iget-object v2, v0, Lcom/canhub/cropper/CropImageView;->i:Landroid/graphics/Bitmap;

    .line 64
    .line 65
    invoke-static {v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    iget v3, v0, Lcom/canhub/cropper/CropImageView;->D:I

    .line 73
    .line 74
    mul-int v10, v2, v3

    .line 75
    .line 76
    invoke-static {v4}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    iget-boolean v11, v4, Lcom/canhub/cropper/CropOverlayView;->z:Z

    .line 80
    .line 81
    invoke-virtual {v4}, Lcom/canhub/cropper/CropOverlayView;->getAspectRatioX()I

    .line 82
    .line 83
    .line 84
    move-result v12

    .line 85
    invoke-virtual {v4}, Lcom/canhub/cropper/CropOverlayView;->getAspectRatioY()I

    .line 86
    .line 87
    .line 88
    move-result v13

    .line 89
    iget-boolean v2, v0, Lcom/canhub/cropper/CropImageView;->l:Z

    .line 90
    .line 91
    iget-boolean v3, v0, Lcom/canhub/cropper/CropImageView;->m:Z

    .line 92
    .line 93
    move/from16 v16, v2

    .line 94
    .line 95
    move/from16 v17, v3

    .line 96
    .line 97
    invoke-static/range {v5 .. v17}, Lcom/canhub/cropper/h;->c(Landroid/content/Context;Landroid/net/Uri;[FIIIZIIIIZZ)Lcom/canhub/cropper/e;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    iget-object v2, v2, Lcom/canhub/cropper/e;->a:Landroid/graphics/Bitmap;

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_1
    sget-object v2, Lcom/canhub/cropper/h;->a:Landroid/graphics/Rect;

    .line 105
    .line 106
    invoke-virtual {v0}, Lcom/canhub/cropper/CropImageView;->getCropPoints()[F

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    iget v5, v0, Lcom/canhub/cropper/CropImageView;->k:I

    .line 111
    .line 112
    invoke-static {v4}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    iget-boolean v6, v4, Lcom/canhub/cropper/CropOverlayView;->z:Z

    .line 116
    .line 117
    invoke-virtual {v4}, Lcom/canhub/cropper/CropOverlayView;->getAspectRatioX()I

    .line 118
    .line 119
    .line 120
    move-result v7

    .line 121
    invoke-virtual {v4}, Lcom/canhub/cropper/CropOverlayView;->getAspectRatioY()I

    .line 122
    .line 123
    .line 124
    move-result v8

    .line 125
    iget-boolean v9, v0, Lcom/canhub/cropper/CropImageView;->l:Z

    .line 126
    .line 127
    iget-boolean v10, v0, Lcom/canhub/cropper/CropImageView;->m:Z

    .line 128
    .line 129
    move-object v4, v2

    .line 130
    invoke-static/range {v3 .. v10}, Lcom/canhub/cropper/h;->e(Landroid/graphics/Bitmap;[FIZIIZZ)Lcom/canhub/cropper/e;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    iget-object v2, v2, Lcom/canhub/cropper/e;->a:Landroid/graphics/Bitmap;

    .line 135
    .line 136
    :goto_0
    invoke-static {v2, v14, v15, v1}, Lcom/canhub/cropper/h;->u(Landroid/graphics/Bitmap;IILcom/canhub/cropper/CropImageView$RequestSizeOptions;)Landroid/graphics/Bitmap;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    return-object v1

    .line 141
    :cond_2
    const/4 v1, 0x0

    .line 142
    return-object v1
.end method

.method public final getCustomOutputUri()Landroid/net/Uri;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->M:Landroid/net/Uri;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getGuidelines()Lcom/canhub/cropper/CropImageView$Guidelines;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 2
    .line 3
    invoke-static {v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Lcom/canhub/cropper/CropOverlayView;->getGuidelines()Lcom/canhub/cropper/CropImageView$Guidelines;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0
.end method

.method public final getImageResource()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/canhub/cropper/CropImageView;->p:I

    .line 2
    .line 3
    return v0
.end method

.method public final getImageUri()Landroid/net/Uri;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->C:Landroid/net/Uri;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getMaxZoom()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/canhub/cropper/CropImageView;->z:I

    .line 2
    .line 3
    return v0
.end method

.method public final getRotatedDegrees()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/canhub/cropper/CropImageView;->k:I

    .line 2
    .line 3
    return v0
.end method

.method public final getScaleType()Lcom/canhub/cropper/CropImageView$ScaleType;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->q:Lcom/canhub/cropper/CropImageView$ScaleType;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getWholeImageRect()Landroid/graphics/Rect;
    .locals 4
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget v0, p0, Lcom/canhub/cropper/CropImageView;->D:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/canhub/cropper/CropImageView;->i:Landroid/graphics/Bitmap;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    return-object v0

    .line 9
    :cond_0
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    mul-int/2addr v2, v0

    .line 14
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    mul-int/2addr v1, v0

    .line 19
    new-instance v0, Landroid/graphics/Rect;

    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    invoke-direct {v0, v3, v3, v2, v1}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 23
    .line 24
    .line 25
    return-object v0
.end method

.method public final h()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-boolean v1, p0, Lcom/canhub/cropper/CropImageView;->s:Z

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iget-object v1, p0, Lcom/canhub/cropper/CropImageView;->i:Landroid/graphics/Bitmap;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v1, 0x4

    .line 16
    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 17
    .line 18
    .line 19
    :cond_1
    return-void
.end method

.method public final i()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/canhub/cropper/CropImageView;->x:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_2

    .line 5
    .line 6
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->i:Landroid/graphics/Bitmap;

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->K:Ljava/lang/ref/WeakReference;

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->L:Ljava/lang/ref/WeakReference;

    .line 15
    .line 16
    if-eqz v0, :cond_2

    .line 17
    .line 18
    :cond_1
    const/4 v0, 0x1

    .line 19
    goto :goto_0

    .line 20
    :cond_2
    move v0, v1

    .line 21
    :goto_0
    if-eqz v0, :cond_3

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_3
    const/4 v1, 0x4

    .line 25
    :goto_1
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->e:Landroid/widget/ProgressBar;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final j(Z)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->i:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/canhub/cropper/CropImageView;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    iget v0, p0, Lcom/canhub/cropper/CropImageView;->D:I

    .line 10
    .line 11
    int-to-float v0, v0

    .line 12
    const/high16 v2, 0x42c80000    # 100.0f

    .line 13
    .line 14
    mul-float/2addr v0, v2

    .line 15
    iget-object v3, p0, Lcom/canhub/cropper/CropImageView;->g:[F

    .line 16
    .line 17
    invoke-static {v3}, Lcom/canhub/cropper/h;->t([F)F

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    div-float/2addr v0, v4

    .line 22
    iget v4, p0, Lcom/canhub/cropper/CropImageView;->D:I

    .line 23
    .line 24
    int-to-float v4, v4

    .line 25
    mul-float/2addr v4, v2

    .line 26
    invoke-static {v3}, Lcom/canhub/cropper/h;->p([F)F

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    div-float/2addr v4, v2

    .line 31
    invoke-static {v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    int-to-float v2, v2

    .line 39
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    int-to-float v3, v3

    .line 44
    iget-object v5, v1, Lcom/canhub/cropper/CropOverlayView;->g:Lcom/canhub/cropper/e0;

    .line 45
    .line 46
    iput v2, v5, Lcom/canhub/cropper/e0;->e:F

    .line 47
    .line 48
    iput v3, v5, Lcom/canhub/cropper/e0;->f:F

    .line 49
    .line 50
    iput v0, v5, Lcom/canhub/cropper/e0;->k:F

    .line 51
    .line 52
    iput v4, v5, Lcom/canhub/cropper/e0;->l:F

    .line 53
    .line 54
    :cond_0
    invoke-static {v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    if-eqz p1, :cond_1

    .line 58
    .line 59
    const/4 p1, 0x0

    .line 60
    goto :goto_0

    .line 61
    :cond_1
    iget-object p1, p0, Lcom/canhub/cropper/CropImageView;->f:[F

    .line 62
    .line 63
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    invoke-virtual {v1, p1, v0, v2}, Lcom/canhub/cropper/CropOverlayView;->h([FII)V

    .line 72
    .line 73
    .line 74
    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 3

    .line 1
    invoke-super/range {p0 .. p5}, Landroid/widget/FrameLayout;->onLayout(ZIIII)V

    .line 2
    .line 3
    .line 4
    move-object p1, p0

    .line 5
    iget v0, p1, Lcom/canhub/cropper/CropImageView;->n:I

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    if-lez v0, :cond_6

    .line 9
    .line 10
    iget v0, p1, Lcom/canhub/cropper/CropImageView;->o:I

    .line 11
    .line 12
    if-lez v0, :cond_6

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget v2, p1, Lcom/canhub/cropper/CropImageView;->n:I

    .line 19
    .line 20
    iput v2, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 21
    .line 22
    iget v2, p1, Lcom/canhub/cropper/CropImageView;->o:I

    .line 23
    .line 24
    iput v2, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 25
    .line 26
    invoke-virtual {p0, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 27
    .line 28
    .line 29
    iget-object v0, p1, Lcom/canhub/cropper/CropImageView;->i:Landroid/graphics/Bitmap;

    .line 30
    .line 31
    if-eqz v0, :cond_5

    .line 32
    .line 33
    sub-int/2addr p4, p2

    .line 34
    int-to-float p2, p4

    .line 35
    sub-int/2addr p5, p3

    .line 36
    int-to-float p3, p5

    .line 37
    const/4 p4, 0x0

    .line 38
    invoke-virtual {p0, p2, p3, v1, p4}, Lcom/canhub/cropper/CropImageView;->a(FFZZ)V

    .line 39
    .line 40
    .line 41
    iget-object p5, p1, Lcom/canhub/cropper/CropImageView;->H:Landroid/graphics/RectF;

    .line 42
    .line 43
    if-eqz p5, :cond_3

    .line 44
    .line 45
    iget v0, p1, Lcom/canhub/cropper/CropImageView;->I:I

    .line 46
    .line 47
    iget v2, p1, Lcom/canhub/cropper/CropImageView;->j:I

    .line 48
    .line 49
    if-eq v0, v2, :cond_0

    .line 50
    .line 51
    iput v0, p1, Lcom/canhub/cropper/CropImageView;->k:I

    .line 52
    .line 53
    invoke-virtual {p0, p2, p3, v1, p4}, Lcom/canhub/cropper/CropImageView;->a(FFZZ)V

    .line 54
    .line 55
    .line 56
    iput p4, p1, Lcom/canhub/cropper/CropImageView;->I:I

    .line 57
    .line 58
    :cond_0
    iget-object p2, p1, Lcom/canhub/cropper/CropImageView;->c:Landroid/graphics/Matrix;

    .line 59
    .line 60
    iget-object p3, p1, Lcom/canhub/cropper/CropImageView;->H:Landroid/graphics/RectF;

    .line 61
    .line 62
    invoke-virtual {p2, p3}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 63
    .line 64
    .line 65
    iget-object p2, p1, Lcom/canhub/cropper/CropImageView;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 66
    .line 67
    if-eqz p2, :cond_1

    .line 68
    .line 69
    invoke-virtual {p2, p5}, Lcom/canhub/cropper/CropOverlayView;->setCropWindowRect(Landroid/graphics/RectF;)V

    .line 70
    .line 71
    .line 72
    :cond_1
    invoke-virtual {p0, p4, p4}, Lcom/canhub/cropper/CropImageView;->d(ZZ)V

    .line 73
    .line 74
    .line 75
    if-eqz p2, :cond_2

    .line 76
    .line 77
    invoke-virtual {p2}, Lcom/canhub/cropper/CropOverlayView;->getCropWindowRect()Landroid/graphics/RectF;

    .line 78
    .line 79
    .line 80
    move-result-object p3

    .line 81
    invoke-virtual {p2, p3}, Lcom/canhub/cropper/CropOverlayView;->e(Landroid/graphics/RectF;)V

    .line 82
    .line 83
    .line 84
    iget-object p2, p2, Lcom/canhub/cropper/CropOverlayView;->g:Lcom/canhub/cropper/e0;

    .line 85
    .line 86
    iget-object p2, p2, Lcom/canhub/cropper/e0;->a:Landroid/graphics/RectF;

    .line 87
    .line 88
    invoke-virtual {p2, p3}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 89
    .line 90
    .line 91
    :cond_2
    const/4 p2, 0x0

    .line 92
    iput-object p2, p1, Lcom/canhub/cropper/CropImageView;->H:Landroid/graphics/RectF;

    .line 93
    .line 94
    return-void

    .line 95
    :cond_3
    iget-boolean p2, p1, Lcom/canhub/cropper/CropImageView;->J:Z

    .line 96
    .line 97
    if-eqz p2, :cond_4

    .line 98
    .line 99
    iput-boolean p4, p1, Lcom/canhub/cropper/CropImageView;->J:Z

    .line 100
    .line 101
    invoke-virtual {p0, p4, p4}, Lcom/canhub/cropper/CropImageView;->d(ZZ)V

    .line 102
    .line 103
    .line 104
    :cond_4
    return-void

    .line 105
    :cond_5
    invoke-virtual {p0, v1}, Lcom/canhub/cropper/CropImageView;->j(Z)V

    .line 106
    .line 107
    .line 108
    return-void

    .line 109
    :cond_6
    invoke-virtual {p0, v1}, Lcom/canhub/cropper/CropImageView;->j(Z)V

    .line 110
    .line 111
    .line 112
    return-void
.end method

.method public final onMeasure(II)V
    .locals 12

    .line 1
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onMeasure(II)V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    iget-object v2, p0, Lcom/canhub/cropper/CropImageView;->i:Landroid/graphics/Bitmap;

    .line 21
    .line 22
    if-eqz v2, :cond_9

    .line 23
    .line 24
    if-nez p2, :cond_0

    .line 25
    .line 26
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    :cond_0
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    const-wide/high16 v4, 0x7ff0000000000000L    # Double.POSITIVE_INFINITY

    .line 35
    .line 36
    if-ge p1, v3, :cond_1

    .line 37
    .line 38
    int-to-double v6, p1

    .line 39
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    int-to-double v8, v3

    .line 44
    div-double/2addr v6, v8

    .line 45
    goto :goto_0

    .line 46
    :cond_1
    move-wide v6, v4

    .line 47
    :goto_0
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    if-ge p2, v3, :cond_2

    .line 52
    .line 53
    int-to-double v8, p2

    .line 54
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    int-to-double v10, v3

    .line 59
    div-double/2addr v8, v10

    .line 60
    goto :goto_1

    .line 61
    :cond_2
    move-wide v8, v4

    .line 62
    :goto_1
    cmpg-double v3, v6, v4

    .line 63
    .line 64
    if-nez v3, :cond_3

    .line 65
    .line 66
    cmpg-double v3, v8, v4

    .line 67
    .line 68
    if-nez v3, :cond_3

    .line 69
    .line 70
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    goto :goto_2

    .line 79
    :cond_3
    cmpg-double v3, v6, v8

    .line 80
    .line 81
    if-gtz v3, :cond_4

    .line 82
    .line 83
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    int-to-double v2, v2

    .line 88
    mul-double/2addr v2, v6

    .line 89
    double-to-int v2, v2

    .line 90
    move v3, p1

    .line 91
    goto :goto_2

    .line 92
    :cond_4
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 93
    .line 94
    .line 95
    move-result v2

    .line 96
    int-to-double v2, v2

    .line 97
    mul-double/2addr v2, v8

    .line 98
    double-to-int v3, v2

    .line 99
    move v2, p2

    .line 100
    :goto_2
    const/high16 v4, 0x40000000    # 2.0f

    .line 101
    .line 102
    const/high16 v5, -0x80000000

    .line 103
    .line 104
    if-eq v0, v5, :cond_5

    .line 105
    .line 106
    if-eq v0, v4, :cond_6

    .line 107
    .line 108
    move p1, v3

    .line 109
    goto :goto_3

    .line 110
    :cond_5
    invoke-static {v3, p1}, Ljava/lang/Math;->min(II)I

    .line 111
    .line 112
    .line 113
    move-result p1

    .line 114
    :cond_6
    :goto_3
    if-eq v1, v5, :cond_7

    .line 115
    .line 116
    if-eq v1, v4, :cond_8

    .line 117
    .line 118
    move p2, v2

    .line 119
    goto :goto_4

    .line 120
    :cond_7
    invoke-static {v2, p2}, Ljava/lang/Math;->min(II)I

    .line 121
    .line 122
    .line 123
    move-result p2

    .line 124
    :cond_8
    :goto_4
    iput p1, p0, Lcom/canhub/cropper/CropImageView;->n:I

    .line 125
    .line 126
    iput p2, p0, Lcom/canhub/cropper/CropImageView;->o:I

    .line 127
    .line 128
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 129
    .line 130
    .line 131
    return-void

    .line 132
    :cond_9
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 133
    .line 134
    .line 135
    return-void
.end method

.method public final onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 9

    .line 1
    const-string/jumbo v0, "state"

    .line 2
    .line 3
    .line 4
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    instance-of v0, p1, Landroid/os/Bundle;

    .line 8
    .line 9
    if-eqz v0, :cond_10

    .line 10
    .line 11
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->K:Ljava/lang/ref/WeakReference;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    if-nez v0, :cond_e

    .line 15
    .line 16
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->C:Landroid/net/Uri;

    .line 17
    .line 18
    if-nez v0, :cond_e

    .line 19
    .line 20
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->i:Landroid/graphics/Bitmap;

    .line 21
    .line 22
    if-nez v0, :cond_e

    .line 23
    .line 24
    iget v0, p0, Lcom/canhub/cropper/CropImageView;->p:I

    .line 25
    .line 26
    if-nez v0, :cond_e

    .line 27
    .line 28
    move-object v0, p1

    .line 29
    check-cast v0, Landroid/os/Bundle;

    .line 30
    .line 31
    const-string v2, "LOADED_IMAGE_URI"

    .line 32
    .line 33
    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    instance-of v3, v2, Landroid/net/Uri;

    .line 38
    .line 39
    if-nez v3, :cond_0

    .line 40
    .line 41
    move-object v2, v1

    .line 42
    :cond_0
    move-object v6, v2

    .line 43
    check-cast v6, Landroid/net/Uri;

    .line 44
    .line 45
    if-eqz v6, :cond_4

    .line 46
    .line 47
    const-string v2, "LOADED_IMAGE_STATE_BITMAP_KEY"

    .line 48
    .line 49
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    sget-object v3, Lcom/canhub/cropper/h;->a:Landroid/graphics/Rect;

    .line 56
    .line 57
    sget-object v3, Lcom/canhub/cropper/h;->g:Landroid/util/Pair;

    .line 58
    .line 59
    if-eqz v3, :cond_2

    .line 60
    .line 61
    iget-object v4, v3, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 62
    .line 63
    invoke-static {v4, v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    if-eqz v2, :cond_1

    .line 68
    .line 69
    iget-object v2, v3, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v2, Ljava/lang/ref/WeakReference;

    .line 72
    .line 73
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    check-cast v2, Landroid/graphics/Bitmap;

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_1
    move-object v2, v1

    .line 81
    :goto_0
    move-object v4, v2

    .line 82
    goto :goto_1

    .line 83
    :cond_2
    move-object v4, v1

    .line 84
    :goto_1
    sput-object v1, Lcom/canhub/cropper/h;->g:Landroid/util/Pair;

    .line 85
    .line 86
    if-eqz v4, :cond_3

    .line 87
    .line 88
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    if-nez v2, :cond_3

    .line 93
    .line 94
    const-string v2, "LOADED_SAMPLE_SIZE"

    .line 95
    .line 96
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 97
    .line 98
    .line 99
    move-result v7

    .line 100
    const/4 v8, 0x0

    .line 101
    const/4 v5, 0x0

    .line 102
    move-object v3, p0

    .line 103
    invoke-virtual/range {v3 .. v8}, Lcom/canhub/cropper/CropImageView;->g(Landroid/graphics/Bitmap;ILandroid/net/Uri;II)V

    .line 104
    .line 105
    .line 106
    goto :goto_2

    .line 107
    :cond_3
    move-object v3, p0

    .line 108
    :goto_2
    iget-object v2, v3, Lcom/canhub/cropper/CropImageView;->C:Landroid/net/Uri;

    .line 109
    .line 110
    if-nez v2, :cond_7

    .line 111
    .line 112
    invoke-virtual {p0, v6}, Lcom/canhub/cropper/CropImageView;->setImageUriAsync(Landroid/net/Uri;)V

    .line 113
    .line 114
    .line 115
    goto :goto_3

    .line 116
    :cond_4
    move-object v3, p0

    .line 117
    const-string v2, "LOADED_IMAGE_RESOURCE"

    .line 118
    .line 119
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 120
    .line 121
    .line 122
    move-result v2

    .line 123
    if-lez v2, :cond_5

    .line 124
    .line 125
    invoke-virtual {p0, v2}, Lcom/canhub/cropper/CropImageView;->setImageResource(I)V

    .line 126
    .line 127
    .line 128
    goto :goto_3

    .line 129
    :cond_5
    const-string v2, "LOADING_IMAGE_URI"

    .line 130
    .line 131
    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    instance-of v4, v2, Landroid/net/Uri;

    .line 136
    .line 137
    if-nez v4, :cond_6

    .line 138
    .line 139
    move-object v2, v1

    .line 140
    :cond_6
    check-cast v2, Landroid/net/Uri;

    .line 141
    .line 142
    if-eqz v2, :cond_7

    .line 143
    .line 144
    invoke-virtual {p0, v2}, Lcom/canhub/cropper/CropImageView;->setImageUriAsync(Landroid/net/Uri;)V

    .line 145
    .line 146
    .line 147
    :cond_7
    :goto_3
    const-string v2, "DEGREES_ROTATED"

    .line 148
    .line 149
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 150
    .line 151
    .line 152
    move-result v2

    .line 153
    iput v2, v3, Lcom/canhub/cropper/CropImageView;->I:I

    .line 154
    .line 155
    iput v2, v3, Lcom/canhub/cropper/CropImageView;->k:I

    .line 156
    .line 157
    const-string v2, "INITIAL_CROP_RECT"

    .line 158
    .line 159
    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    instance-of v4, v2, Landroid/graphics/Rect;

    .line 164
    .line 165
    if-nez v4, :cond_8

    .line 166
    .line 167
    move-object v2, v1

    .line 168
    :cond_8
    check-cast v2, Landroid/graphics/Rect;

    .line 169
    .line 170
    iget-object v4, v3, Lcom/canhub/cropper/CropImageView;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 171
    .line 172
    if-eqz v2, :cond_a

    .line 173
    .line 174
    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    .line 175
    .line 176
    .line 177
    move-result v5

    .line 178
    if-gtz v5, :cond_9

    .line 179
    .line 180
    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    .line 181
    .line 182
    .line 183
    move-result v5

    .line 184
    if-lez v5, :cond_a

    .line 185
    .line 186
    :cond_9
    invoke-static {v4}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v4, v2}, Lcom/canhub/cropper/CropOverlayView;->setInitialCropWindowRect(Landroid/graphics/Rect;)V

    .line 190
    .line 191
    .line 192
    :cond_a
    const-string v2, "CROP_WINDOW_RECT"

    .line 193
    .line 194
    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 195
    .line 196
    .line 197
    move-result-object v2

    .line 198
    instance-of v5, v2, Landroid/graphics/RectF;

    .line 199
    .line 200
    if-nez v5, :cond_b

    .line 201
    .line 202
    move-object v2, v1

    .line 203
    :cond_b
    check-cast v2, Landroid/graphics/RectF;

    .line 204
    .line 205
    if-eqz v2, :cond_d

    .line 206
    .line 207
    invoke-virtual {v2}, Landroid/graphics/RectF;->width()F

    .line 208
    .line 209
    .line 210
    move-result v5

    .line 211
    const/4 v6, 0x0

    .line 212
    cmpl-float v5, v5, v6

    .line 213
    .line 214
    if-gtz v5, :cond_c

    .line 215
    .line 216
    invoke-virtual {v2}, Landroid/graphics/RectF;->height()F

    .line 217
    .line 218
    .line 219
    move-result v5

    .line 220
    cmpl-float v5, v5, v6

    .line 221
    .line 222
    if-lez v5, :cond_d

    .line 223
    .line 224
    :cond_c
    iput-object v2, v3, Lcom/canhub/cropper/CropImageView;->H:Landroid/graphics/RectF;

    .line 225
    .line 226
    :cond_d
    invoke-static {v4}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 227
    .line 228
    .line 229
    const-string v2, "CROP_SHAPE"

    .line 230
    .line 231
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v2

    .line 235
    invoke-static {v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 236
    .line 237
    .line 238
    invoke-static {v2}, Lcom/canhub/cropper/CropImageView$CropShape;->valueOf(Ljava/lang/String;)Lcom/canhub/cropper/CropImageView$CropShape;

    .line 239
    .line 240
    .line 241
    move-result-object v2

    .line 242
    invoke-virtual {v4, v2}, Lcom/canhub/cropper/CropOverlayView;->setCropShape(Lcom/canhub/cropper/CropImageView$CropShape;)V

    .line 243
    .line 244
    .line 245
    const-string v2, "CROP_AUTO_ZOOM_ENABLED"

    .line 246
    .line 247
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 248
    .line 249
    .line 250
    move-result v2

    .line 251
    iput-boolean v2, v3, Lcom/canhub/cropper/CropImageView;->y:Z

    .line 252
    .line 253
    const-string v2, "CROP_MAX_ZOOM"

    .line 254
    .line 255
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 256
    .line 257
    .line 258
    move-result v2

    .line 259
    iput v2, v3, Lcom/canhub/cropper/CropImageView;->z:I

    .line 260
    .line 261
    const-string v2, "CROP_FLIP_HORIZONTALLY"

    .line 262
    .line 263
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 264
    .line 265
    .line 266
    move-result v2

    .line 267
    iput-boolean v2, v3, Lcom/canhub/cropper/CropImageView;->l:Z

    .line 268
    .line 269
    const-string v2, "CROP_FLIP_VERTICALLY"

    .line 270
    .line 271
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 272
    .line 273
    .line 274
    move-result v2

    .line 275
    iput-boolean v2, v3, Lcom/canhub/cropper/CropImageView;->m:Z

    .line 276
    .line 277
    const-string v2, "SHOW_CROP_LABEL"

    .line 278
    .line 279
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 280
    .line 281
    .line 282
    move-result v0

    .line 283
    iput-boolean v0, v3, Lcom/canhub/cropper/CropImageView;->t:Z

    .line 284
    .line 285
    invoke-virtual {v4, v0}, Lcom/canhub/cropper/CropOverlayView;->setCropperTextLabelVisibility(Z)V

    .line 286
    .line 287
    .line 288
    goto :goto_4

    .line 289
    :cond_e
    move-object v3, p0

    .line 290
    :goto_4
    check-cast p1, Landroid/os/Bundle;

    .line 291
    .line 292
    const-string v0, "instanceState"

    .line 293
    .line 294
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 295
    .line 296
    .line 297
    move-result-object p1

    .line 298
    if-nez p1, :cond_f

    .line 299
    .line 300
    goto :goto_5

    .line 301
    :cond_f
    move-object v1, p1

    .line 302
    :goto_5
    invoke-super {p0, v1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 303
    .line 304
    .line 305
    return-void

    .line 306
    :cond_10
    move-object v3, p0

    .line 307
    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 308
    .line 309
    .line 310
    return-void
.end method

.method public final onSaveInstanceState()Landroid/os/Parcelable;
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->C:Landroid/net/Uri;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->i:Landroid/graphics/Bitmap;

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iget v0, p0, Lcom/canhub/cropper/CropImageView;->p:I

    .line 11
    .line 12
    if-ge v0, v1, :cond_0

    .line 13
    .line 14
    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    return-object v0

    .line 19
    :cond_0
    new-instance v0, Landroid/os/Bundle;

    .line 20
    .line 21
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 22
    .line 23
    .line 24
    iget-boolean v2, p0, Lcom/canhub/cropper/CropImageView;->r:Z

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    iget-object v2, p0, Lcom/canhub/cropper/CropImageView;->C:Landroid/net/Uri;

    .line 30
    .line 31
    if-nez v2, :cond_1

    .line 32
    .line 33
    iget v2, p0, Lcom/canhub/cropper/CropImageView;->p:I

    .line 34
    .line 35
    if-ge v2, v1, :cond_1

    .line 36
    .line 37
    sget-object v1, Lcom/canhub/cropper/h;->a:Landroid/graphics/Rect;

    .line 38
    .line 39
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    const-string v2, "getContext(...)"

    .line 44
    .line 45
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    iget-object v2, p0, Lcom/canhub/cropper/CropImageView;->i:Landroid/graphics/Bitmap;

    .line 49
    .line 50
    iget-object v4, p0, Lcom/canhub/cropper/CropImageView;->M:Landroid/net/Uri;

    .line 51
    .line 52
    :try_start_0
    invoke-static {v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    sget-object v5, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    .line 56
    .line 57
    const/16 v6, 0x5f

    .line 58
    .line 59
    invoke-static {v1, v2, v5, v6, v4}, Lcom/canhub/cropper/h;->v(Landroid/content/Context;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap$CompressFormat;ILandroid/net/Uri;)Landroid/net/Uri;

    .line 60
    .line 61
    .line 62
    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 63
    goto :goto_0

    .line 64
    :catch_0
    move-exception v1

    .line 65
    const-string v2, "AIC"

    .line 66
    .line 67
    const-string v4, "Failed to write bitmap to temp file for image-cropper save instance state"

    .line 68
    .line 69
    invoke-static {v2, v4, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 70
    .line 71
    .line 72
    move-object v1, v3

    .line 73
    goto :goto_0

    .line 74
    :cond_1
    iget-object v1, p0, Lcom/canhub/cropper/CropImageView;->C:Landroid/net/Uri;

    .line 75
    .line 76
    :goto_0
    if-eqz v1, :cond_2

    .line 77
    .line 78
    iget-object v2, p0, Lcom/canhub/cropper/CropImageView;->i:Landroid/graphics/Bitmap;

    .line 79
    .line 80
    if-eqz v2, :cond_2

    .line 81
    .line 82
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    const-string/jumbo v4, "toString(...)"

    .line 91
    .line 92
    .line 93
    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    sget-object v4, Lcom/canhub/cropper/h;->a:Landroid/graphics/Rect;

    .line 97
    .line 98
    new-instance v4, Landroid/util/Pair;

    .line 99
    .line 100
    new-instance v5, Ljava/lang/ref/WeakReference;

    .line 101
    .line 102
    iget-object v6, p0, Lcom/canhub/cropper/CropImageView;->i:Landroid/graphics/Bitmap;

    .line 103
    .line 104
    invoke-direct {v5, v6}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    invoke-direct {v4, v2, v5}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    sput-object v4, Lcom/canhub/cropper/h;->g:Landroid/util/Pair;

    .line 111
    .line 112
    const-string v4, "LOADED_IMAGE_STATE_BITMAP_KEY"

    .line 113
    .line 114
    invoke-virtual {v0, v4, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    :cond_2
    iget-object v2, p0, Lcom/canhub/cropper/CropImageView;->K:Ljava/lang/ref/WeakReference;

    .line 118
    .line 119
    if-eqz v2, :cond_3

    .line 120
    .line 121
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    move-object v3, v2

    .line 126
    check-cast v3, Lcom/canhub/cropper/d;

    .line 127
    .line 128
    :cond_3
    if-eqz v3, :cond_4

    .line 129
    .line 130
    const-string v2, "LOADING_IMAGE_URI"

    .line 131
    .line 132
    iget-object v3, v3, Lcom/canhub/cropper/d;->b:Landroid/net/Uri;

    .line 133
    .line 134
    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 135
    .line 136
    .line 137
    :cond_4
    const-string v2, "instanceState"

    .line 138
    .line 139
    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    .line 140
    .line 141
    .line 142
    move-result-object v3

    .line 143
    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 144
    .line 145
    .line 146
    const-string v2, "LOADED_IMAGE_URI"

    .line 147
    .line 148
    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 149
    .line 150
    .line 151
    const-string v1, "LOADED_IMAGE_RESOURCE"

    .line 152
    .line 153
    iget v2, p0, Lcom/canhub/cropper/CropImageView;->p:I

    .line 154
    .line 155
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 156
    .line 157
    .line 158
    const-string v1, "LOADED_SAMPLE_SIZE"

    .line 159
    .line 160
    iget v2, p0, Lcom/canhub/cropper/CropImageView;->D:I

    .line 161
    .line 162
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 163
    .line 164
    .line 165
    const-string v1, "DEGREES_ROTATED"

    .line 166
    .line 167
    iget v2, p0, Lcom/canhub/cropper/CropImageView;->k:I

    .line 168
    .line 169
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 170
    .line 171
    .line 172
    iget-object v1, p0, Lcom/canhub/cropper/CropImageView;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 173
    .line 174
    invoke-static {v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v1}, Lcom/canhub/cropper/CropOverlayView;->getInitialCropWindowRect()Landroid/graphics/Rect;

    .line 178
    .line 179
    .line 180
    move-result-object v2

    .line 181
    const-string v3, "INITIAL_CROP_RECT"

    .line 182
    .line 183
    invoke-virtual {v0, v3, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 184
    .line 185
    .line 186
    sget-object v2, Lcom/canhub/cropper/h;->c:Landroid/graphics/RectF;

    .line 187
    .line 188
    invoke-virtual {v1}, Lcom/canhub/cropper/CropOverlayView;->getCropWindowRect()Landroid/graphics/RectF;

    .line 189
    .line 190
    .line 191
    move-result-object v3

    .line 192
    invoke-virtual {v2, v3}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 193
    .line 194
    .line 195
    iget-object v3, p0, Lcom/canhub/cropper/CropImageView;->c:Landroid/graphics/Matrix;

    .line 196
    .line 197
    iget-object v4, p0, Lcom/canhub/cropper/CropImageView;->d:Landroid/graphics/Matrix;

    .line 198
    .line 199
    invoke-virtual {v3, v4}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    .line 200
    .line 201
    .line 202
    invoke-virtual {v4, v2}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 203
    .line 204
    .line 205
    const-string v3, "CROP_WINDOW_RECT"

    .line 206
    .line 207
    invoke-virtual {v0, v3, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v1}, Lcom/canhub/cropper/CropOverlayView;->getCropShape()Lcom/canhub/cropper/CropImageView$CropShape;

    .line 211
    .line 212
    .line 213
    move-result-object v1

    .line 214
    invoke-static {v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v1

    .line 221
    const-string v2, "CROP_SHAPE"

    .line 222
    .line 223
    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    const-string v1, "CROP_AUTO_ZOOM_ENABLED"

    .line 227
    .line 228
    iget-boolean v2, p0, Lcom/canhub/cropper/CropImageView;->y:Z

    .line 229
    .line 230
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 231
    .line 232
    .line 233
    const-string v1, "CROP_MAX_ZOOM"

    .line 234
    .line 235
    iget v2, p0, Lcom/canhub/cropper/CropImageView;->z:I

    .line 236
    .line 237
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 238
    .line 239
    .line 240
    const-string v1, "CROP_FLIP_HORIZONTALLY"

    .line 241
    .line 242
    iget-boolean v2, p0, Lcom/canhub/cropper/CropImageView;->l:Z

    .line 243
    .line 244
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 245
    .line 246
    .line 247
    const-string v1, "CROP_FLIP_VERTICALLY"

    .line 248
    .line 249
    iget-boolean v2, p0, Lcom/canhub/cropper/CropImageView;->m:Z

    .line 250
    .line 251
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 252
    .line 253
    .line 254
    const-string v1, "SHOW_CROP_LABEL"

    .line 255
    .line 256
    iget-boolean v2, p0, Lcom/canhub/cropper/CropImageView;->t:Z

    .line 257
    .line 258
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 259
    .line 260
    .line 261
    return-object v0
.end method

.method public final onSizeChanged(IIII)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 2
    .line 3
    .line 4
    if-lez p3, :cond_0

    .line 5
    .line 6
    if-lez p4, :cond_0

    .line 7
    .line 8
    const/4 p1, 0x1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p1, 0x0

    .line 11
    :goto_0
    iput-boolean p1, p0, Lcom/canhub/cropper/CropImageView;->J:Z

    .line 12
    .line 13
    return-void
.end method

.method public final setAutoZoomEnabled(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/canhub/cropper/CropImageView;->y:Z

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput-boolean p1, p0, Lcom/canhub/cropper/CropImageView;->y:Z

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    invoke-virtual {p0, p1, p1}, Lcom/canhub/cropper/CropImageView;->d(ZZ)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/canhub/cropper/CropImageView;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 12
    .line 13
    invoke-static {p1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public final setCenterMoveEnabled(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 2
    .line 3
    invoke-static {v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-boolean v1, v0, Lcom/canhub/cropper/CropOverlayView;->f:Z

    .line 7
    .line 8
    if-eq v1, p1, :cond_0

    .line 9
    .line 10
    iput-boolean p1, v0, Lcom/canhub/cropper/CropOverlayView;->f:Z

    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    invoke-virtual {p0, p1, p1}, Lcom/canhub/cropper/CropImageView;->d(ZZ)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public final setCornerShape(Lcom/canhub/cropper/CropImageView$CropCornerShape;)V
    .locals 1
    .param p1    # Lcom/canhub/cropper/CropImageView$CropCornerShape;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 2
    .line 3
    invoke-static {v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lcom/canhub/cropper/CropOverlayView;->setCropCornerShape(Lcom/canhub/cropper/CropImageView$CropCornerShape;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final setCropLabelText(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "cropLabelText"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/canhub/cropper/CropImageView;->u:Ljava/lang/String;

    .line 7
    .line 8
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Lcom/canhub/cropper/CropOverlayView;->setCropLabelText(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public final setCropLabelTextColor(I)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/canhub/cropper/CropImageView;->w:I

    .line 2
    .line 3
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lcom/canhub/cropper/CropOverlayView;->setCropLabelTextColor(I)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public final setCropLabelTextSize(F)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/canhub/cropper/CropImageView;->getCropLabelTextSize()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iput v0, p0, Lcom/canhub/cropper/CropImageView;->v:F

    .line 6
    .line 7
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Lcom/canhub/cropper/CropOverlayView;->setCropLabelTextSize(F)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public final setCropRect(Landroid/graphics/Rect;)V
    .locals 1
    .param p1    # Landroid/graphics/Rect;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 2
    .line 3
    invoke-static {v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Lcom/canhub/cropper/CropOverlayView;->setInitialCropWindowRect(Landroid/graphics/Rect;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final setCropShape(Lcom/canhub/cropper/CropImageView$CropShape;)V
    .locals 1
    .param p1    # Lcom/canhub/cropper/CropImageView$CropShape;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 2
    .line 3
    invoke-static {v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lcom/canhub/cropper/CropOverlayView;->setCropShape(Lcom/canhub/cropper/CropImageView$CropShape;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final setCustomOutputUri(Landroid/net/Uri;)V
    .locals 0
    .param p1    # Landroid/net/Uri;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/canhub/cropper/CropImageView;->M:Landroid/net/Uri;

    .line 2
    .line 3
    return-void
.end method

.method public final setFixedAspectRatio(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 2
    .line 3
    invoke-static {v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Lcom/canhub/cropper/CropOverlayView;->setFixedAspectRatio(Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final setFlippedHorizontally(Z)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/canhub/cropper/CropImageView;->l:Z

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput-boolean p1, p0, Lcom/canhub/cropper/CropImageView;->l:Z

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    int-to-float p1, p1

    .line 12
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    int-to-float v0, v0

    .line 17
    const/4 v1, 0x1

    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-virtual {p0, p1, v0, v1, v2}, Lcom/canhub/cropper/CropImageView;->a(FFZZ)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public final setFlippedVertically(Z)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/canhub/cropper/CropImageView;->m:Z

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput-boolean p1, p0, Lcom/canhub/cropper/CropImageView;->m:Z

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    int-to-float p1, p1

    .line 12
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    int-to-float v0, v0

    .line 17
    const/4 v1, 0x1

    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-virtual {p0, p1, v0, v1, v2}, Lcom/canhub/cropper/CropImageView;->a(FFZZ)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public final setGuidelines(Lcom/canhub/cropper/CropImageView$Guidelines;)V
    .locals 1
    .param p1    # Lcom/canhub/cropper/CropImageView$Guidelines;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 2
    .line 3
    invoke-static {v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lcom/canhub/cropper/CropOverlayView;->setGuidelines(Lcom/canhub/cropper/CropImageView$Guidelines;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final setImageBitmap(Landroid/graphics/Bitmap;)V
    .locals 8
    .param p1    # Landroid/graphics/Bitmap;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 2
    .line 3
    invoke-static {v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {v0, v1}, Lcom/canhub/cropper/CropOverlayView;->setInitialCropWindowRect(Landroid/graphics/Rect;)V

    .line 8
    .line 9
    .line 10
    const/4 v6, 0x1

    .line 11
    const/4 v7, 0x0

    .line 12
    const/4 v4, 0x0

    .line 13
    const/4 v5, 0x0

    .line 14
    move-object v2, p0

    .line 15
    move-object v3, p1

    .line 16
    invoke-virtual/range {v2 .. v7}, Lcom/canhub/cropper/CropImageView;->g(Landroid/graphics/Bitmap;ILandroid/net/Uri;II)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final setImageCropOptions(Lcom/canhub/cropper/CropImageOptions;)V
    .locals 3
    .param p1    # Lcom/canhub/cropper/CropImageOptions;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "options"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p1, Lcom/canhub/cropper/CropImageOptions;->l:Z

    .line 7
    .line 8
    iget-boolean v1, p1, Lcom/canhub/cropper/CropImageOptions;->j:Z

    .line 9
    .line 10
    iget-object v2, p1, Lcom/canhub/cropper/CropImageOptions;->i:Lcom/canhub/cropper/CropImageView$ScaleType;

    .line 11
    .line 12
    invoke-virtual {p0, v2}, Lcom/canhub/cropper/CropImageView;->setScaleType(Lcom/canhub/cropper/CropImageView$ScaleType;)V

    .line 13
    .line 14
    .line 15
    iget-object v2, p1, Lcom/canhub/cropper/CropImageOptions;->P:Landroid/net/Uri;

    .line 16
    .line 17
    iput-object v2, p0, Lcom/canhub/cropper/CropImageView;->M:Landroid/net/Uri;

    .line 18
    .line 19
    iget-object v2, p0, Lcom/canhub/cropper/CropImageView;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 20
    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    invoke-virtual {v2, p1}, Lcom/canhub/cropper/CropOverlayView;->setInitialAttributeValues(Lcom/canhub/cropper/CropImageOptions;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    iget-boolean v2, p1, Lcom/canhub/cropper/CropImageOptions;->o:Z

    .line 27
    .line 28
    invoke-virtual {p0, v2}, Lcom/canhub/cropper/CropImageView;->setMultiTouchEnabled(Z)V

    .line 29
    .line 30
    .line 31
    iget-boolean v2, p1, Lcom/canhub/cropper/CropImageOptions;->p:Z

    .line 32
    .line 33
    invoke-virtual {p0, v2}, Lcom/canhub/cropper/CropImageView;->setCenterMoveEnabled(Z)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, v1}, Lcom/canhub/cropper/CropImageView;->setShowCropOverlay(Z)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0, v0}, Lcom/canhub/cropper/CropImageView;->setShowProgressBar(Z)V

    .line 40
    .line 41
    .line 42
    iget-boolean v2, p1, Lcom/canhub/cropper/CropImageOptions;->n:Z

    .line 43
    .line 44
    invoke-virtual {p0, v2}, Lcom/canhub/cropper/CropImageView;->setAutoZoomEnabled(Z)V

    .line 45
    .line 46
    .line 47
    iget v2, p1, Lcom/canhub/cropper/CropImageOptions;->r:I

    .line 48
    .line 49
    invoke-virtual {p0, v2}, Lcom/canhub/cropper/CropImageView;->setMaxZoom(I)V

    .line 50
    .line 51
    .line 52
    iget-boolean v2, p1, Lcom/canhub/cropper/CropImageOptions;->e0:Z

    .line 53
    .line 54
    invoke-virtual {p0, v2}, Lcom/canhub/cropper/CropImageView;->setFlippedHorizontally(Z)V

    .line 55
    .line 56
    .line 57
    iget-boolean v2, p1, Lcom/canhub/cropper/CropImageOptions;->f0:Z

    .line 58
    .line 59
    invoke-virtual {p0, v2}, Lcom/canhub/cropper/CropImageView;->setFlippedVertically(Z)V

    .line 60
    .line 61
    .line 62
    iget-boolean v2, p1, Lcom/canhub/cropper/CropImageOptions;->n:Z

    .line 63
    .line 64
    iput-boolean v2, p0, Lcom/canhub/cropper/CropImageView;->y:Z

    .line 65
    .line 66
    iput-boolean v1, p0, Lcom/canhub/cropper/CropImageView;->s:Z

    .line 67
    .line 68
    iput-boolean v0, p0, Lcom/canhub/cropper/CropImageView;->x:Z

    .line 69
    .line 70
    iget p1, p1, Lcom/canhub/cropper/CropImageOptions;->m:I

    .line 71
    .line 72
    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->e:Landroid/widget/ProgressBar;

    .line 77
    .line 78
    invoke-virtual {v0, p1}, Landroid/widget/ProgressBar;->setIndeterminateTintList(Landroid/content/res/ColorStateList;)V

    .line 79
    .line 80
    .line 81
    return-void
.end method

.method public final setImageResource(I)V
    .locals 7

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 4
    .line 5
    invoke-static {v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-virtual {v0, v1}, Lcom/canhub/cropper/CropOverlayView;->setInitialCropWindowRect(Landroid/graphics/Rect;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-static {v0, p1}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    const/4 v5, 0x1

    .line 21
    const/4 v6, 0x0

    .line 22
    const/4 v4, 0x0

    .line 23
    move-object v1, p0

    .line 24
    move v3, p1

    .line 25
    invoke-virtual/range {v1 .. v6}, Lcom/canhub/cropper/CropImageView;->g(Landroid/graphics/Bitmap;ILandroid/net/Uri;II)V

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void
.end method

.method public final setImageUriAsync(Landroid/net/Uri;)V
    .locals 5
    .param p1    # Landroid/net/Uri;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->K:Ljava/lang/ref/WeakReference;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lcom/canhub/cropper/d;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    iget-object v0, v0, Lcom/canhub/cropper/d;->f:Lkotlinx/coroutines/c1;

    .line 17
    .line 18
    invoke-interface {v0, v1}, Lkotlinx/coroutines/w0;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    invoke-virtual {p0}, Lcom/canhub/cropper/CropImageView;->b()V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 25
    .line 26
    invoke-static {v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v1}, Lcom/canhub/cropper/CropOverlayView;->setInitialCropWindowRect(Landroid/graphics/Rect;)V

    .line 30
    .line 31
    .line 32
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 33
    .line 34
    new-instance v2, Lcom/canhub/cropper/d;

    .line 35
    .line 36
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    const-string v4, "getContext(...)"

    .line 41
    .line 42
    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-direct {v2, v3, p0, p1}, Lcom/canhub/cropper/d;-><init>(Landroid/content/Context;Lcom/canhub/cropper/CropImageView;Landroid/net/Uri;)V

    .line 46
    .line 47
    .line 48
    invoke-direct {v0, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    iput-object v0, p0, Lcom/canhub/cropper/CropImageView;->K:Ljava/lang/ref/WeakReference;

    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    check-cast p1, Lcom/canhub/cropper/d;

    .line 58
    .line 59
    if-eqz p1, :cond_1

    .line 60
    .line 61
    sget-object v0, Lkotlinx/coroutines/f0;->a:Lg7/e;

    .line 62
    .line 63
    new-instance v2, Lcom/canhub/cropper/BitmapLoadingWorkerJob$start$1;

    .line 64
    .line 65
    invoke-direct {v2, p1, v1}, Lcom/canhub/cropper/BitmapLoadingWorkerJob$start$1;-><init>(Lcom/canhub/cropper/d;Lh6/c;)V

    .line 66
    .line 67
    .line 68
    const/4 v3, 0x2

    .line 69
    invoke-static {p1, v0, v1, v2, v3}, Lkotlinx/coroutines/x;->v(Lkotlinx/coroutines/v;Lh6/h;Lkotlinx/coroutines/CoroutineStart;Lr6/e;I)Lkotlinx/coroutines/k1;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    iput-object v0, p1, Lcom/canhub/cropper/d;->f:Lkotlinx/coroutines/c1;

    .line 74
    .line 75
    :cond_1
    invoke-virtual {p0}, Lcom/canhub/cropper/CropImageView;->i()V

    .line 76
    .line 77
    .line 78
    :cond_2
    return-void
.end method

.method public final setMaxZoom(I)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/canhub/cropper/CropImageView;->z:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    if-lez p1, :cond_0

    .line 6
    .line 7
    iput p1, p0, Lcom/canhub/cropper/CropImageView;->z:I

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    invoke-virtual {p0, p1, p1}, Lcom/canhub/cropper/CropImageView;->d(ZZ)V

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, Lcom/canhub/cropper/CropImageView;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 14
    .line 15
    invoke-static {p1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method public final setMultiTouchEnabled(Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 2
    .line 3
    invoke-static {v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-boolean v1, v0, Lcom/canhub/cropper/CropOverlayView;->e:Z

    .line 7
    .line 8
    if-eq v1, p1, :cond_1

    .line 9
    .line 10
    iput-boolean p1, v0, Lcom/canhub/cropper/CropOverlayView;->e:Z

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    iget-object p1, v0, Lcom/canhub/cropper/CropOverlayView;->d:Landroid/view/ScaleGestureDetector;

    .line 15
    .line 16
    if-nez p1, :cond_0

    .line 17
    .line 18
    new-instance p1, Landroid/view/ScaleGestureDetector;

    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    new-instance v2, Lcom/canhub/cropper/b0;

    .line 25
    .line 26
    invoke-direct {v2, v0}, Lcom/canhub/cropper/b0;-><init>(Lcom/canhub/cropper/CropOverlayView;)V

    .line 27
    .line 28
    .line 29
    invoke-direct {p1, v1, v2}, Landroid/view/ScaleGestureDetector;-><init>(Landroid/content/Context;Landroid/view/ScaleGestureDetector$OnScaleGestureListener;)V

    .line 30
    .line 31
    .line 32
    iput-object p1, v0, Lcom/canhub/cropper/CropOverlayView;->d:Landroid/view/ScaleGestureDetector;

    .line 33
    .line 34
    :cond_0
    const/4 p1, 0x0

    .line 35
    invoke-virtual {p0, p1, p1}, Lcom/canhub/cropper/CropImageView;->d(ZZ)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 39
    .line 40
    .line 41
    :cond_1
    return-void
.end method

.method public final setOnCropImageCompleteListener(Lcom/canhub/cropper/v;)V
    .locals 0
    .param p1    # Lcom/canhub/cropper/v;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/canhub/cropper/CropImageView;->B:Lcom/canhub/cropper/v;

    .line 2
    .line 3
    return-void
.end method

.method public final setOnCropWindowChangedListener(Lcom/canhub/cropper/y;)V
    .locals 0
    .param p1    # Lcom/canhub/cropper/y;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    return-void
.end method

.method public final setOnSetCropOverlayMovedListener(Lcom/canhub/cropper/w;)V
    .locals 0
    .param p1    # Lcom/canhub/cropper/w;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    return-void
.end method

.method public final setOnSetCropOverlayReleasedListener(Lcom/canhub/cropper/x;)V
    .locals 0
    .param p1    # Lcom/canhub/cropper/x;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    return-void
.end method

.method public final setOnSetImageUriCompleteListener(Lcom/canhub/cropper/z;)V
    .locals 0
    .param p1    # Lcom/canhub/cropper/z;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/canhub/cropper/CropImageView;->A:Lcom/canhub/cropper/z;

    .line 2
    .line 3
    return-void
.end method

.method public final setRotatedDegrees(I)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/canhub/cropper/CropImageView;->k:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    sub-int/2addr p1, v0

    .line 6
    invoke-virtual {p0, p1}, Lcom/canhub/cropper/CropImageView;->f(I)V

    .line 7
    .line 8
    .line 9
    :cond_0
    return-void
.end method

.method public final setSaveBitmapToInstanceState(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/canhub/cropper/CropImageView;->r:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setScaleType(Lcom/canhub/cropper/CropImageView$ScaleType;)V
    .locals 1
    .param p1    # Lcom/canhub/cropper/CropImageView$ScaleType;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string/jumbo v0, "scaleType"

    .line 2
    .line 3
    .line 4
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->q:Lcom/canhub/cropper/CropImageView$ScaleType;

    .line 8
    .line 9
    if-eq p1, v0, :cond_1

    .line 10
    .line 11
    iput-object p1, p0, Lcom/canhub/cropper/CropImageView;->q:Lcom/canhub/cropper/CropImageView$ScaleType;

    .line 12
    .line 13
    const/high16 p1, 0x3f800000    # 1.0f

    .line 14
    .line 15
    iput p1, p0, Lcom/canhub/cropper/CropImageView;->E:F

    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    iput p1, p0, Lcom/canhub/cropper/CropImageView;->G:F

    .line 19
    .line 20
    iput p1, p0, Lcom/canhub/cropper/CropImageView;->F:F

    .line 21
    .line 22
    iget-object p1, p0, Lcom/canhub/cropper/CropImageView;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 23
    .line 24
    if-eqz p1, :cond_0

    .line 25
    .line 26
    invoke-virtual {p1}, Lcom/canhub/cropper/CropOverlayView;->g()V

    .line 27
    .line 28
    .line 29
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 30
    .line 31
    .line 32
    :cond_1
    return-void
.end method

.method public final setShowCropLabel(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/canhub/cropper/CropImageView;->t:Z

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput-boolean p1, p0, Lcom/canhub/cropper/CropImageView;->t:Z

    .line 6
    .line 7
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Lcom/canhub/cropper/CropOverlayView;->setCropperTextLabelVisibility(Z)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public final setShowCropOverlay(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/canhub/cropper/CropImageView;->s:Z

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput-boolean p1, p0, Lcom/canhub/cropper/CropImageView;->s:Z

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/canhub/cropper/CropImageView;->h()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public final setShowProgressBar(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/canhub/cropper/CropImageView;->x:Z

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput-boolean p1, p0, Lcom/canhub/cropper/CropImageView;->x:Z

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/canhub/cropper/CropImageView;->i()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public final setSnapRadius(F)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpl-float v0, p1, v0

    .line 3
    .line 4
    if-ltz v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView;->b:Lcom/canhub/cropper/CropOverlayView;

    .line 7
    .line 8
    invoke-static {v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Lcom/canhub/cropper/CropOverlayView;->setSnapRadius(F)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method
