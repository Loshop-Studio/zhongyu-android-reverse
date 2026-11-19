.class public Lcom/canhub/cropper/CropImageView$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/canhub/cropper/CropImageView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public final c:Landroid/graphics/Bitmap;

.field public final d:Landroid/net/Uri;

.field public final e:Landroid/graphics/Bitmap;

.field public final f:Landroid/net/Uri;

.field public final g:Ljava/lang/Exception;

.field public final h:[F

.field public final i:Landroid/graphics/Rect;

.field public final j:Landroid/graphics/Rect;

.field public final k:I

.field public final l:I


# direct methods
.method public constructor <init>(Landroid/graphics/Bitmap;Landroid/net/Uri;Landroid/graphics/Bitmap;Landroid/net/Uri;Ljava/lang/Exception;[FLandroid/graphics/Rect;Landroid/graphics/Rect;II)V
    .locals 1

    .line 1
    const-string v0, "cropPoints"

    .line 2
    .line 3
    invoke-static {p6, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/canhub/cropper/CropImageView$b;->c:Landroid/graphics/Bitmap;

    .line 10
    .line 11
    iput-object p2, p0, Lcom/canhub/cropper/CropImageView$b;->d:Landroid/net/Uri;

    .line 12
    .line 13
    iput-object p3, p0, Lcom/canhub/cropper/CropImageView$b;->e:Landroid/graphics/Bitmap;

    .line 14
    .line 15
    iput-object p4, p0, Lcom/canhub/cropper/CropImageView$b;->f:Landroid/net/Uri;

    .line 16
    .line 17
    iput-object p5, p0, Lcom/canhub/cropper/CropImageView$b;->g:Ljava/lang/Exception;

    .line 18
    .line 19
    iput-object p6, p0, Lcom/canhub/cropper/CropImageView$b;->h:[F

    .line 20
    .line 21
    iput-object p7, p0, Lcom/canhub/cropper/CropImageView$b;->i:Landroid/graphics/Rect;

    .line 22
    .line 23
    iput-object p8, p0, Lcom/canhub/cropper/CropImageView$b;->j:Landroid/graphics/Rect;

    .line 24
    .line 25
    iput p9, p0, Lcom/canhub/cropper/CropImageView$b;->k:I

    .line 26
    .line 27
    iput p10, p0, Lcom/canhub/cropper/CropImageView$b;->l:I

    .line 28
    .line 29
    return-void
.end method


# virtual methods
.method public final a()[F
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView$b;->h:[F

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()Landroid/graphics/Rect;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView$b;->i:Landroid/graphics/Rect;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()Ljava/lang/Exception;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView$b;->g:Ljava/lang/Exception;

    .line 2
    .line 3
    return-object v0
.end method

.method public final g()Landroid/net/Uri;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView$b;->d:Landroid/net/Uri;

    .line 2
    .line 3
    return-object v0
.end method

.method public final h()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/canhub/cropper/CropImageView$b;->k:I

    .line 2
    .line 3
    return v0
.end method

.method public final i()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/canhub/cropper/CropImageView$b;->l:I

    .line 2
    .line 3
    return v0
.end method

.method public final j()Landroid/net/Uri;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView$b;->f:Landroid/net/Uri;

    .line 2
    .line 3
    return-object v0
.end method

.method public final k()Landroid/graphics/Rect;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView$b;->j:Landroid/graphics/Rect;

    .line 2
    .line 3
    return-object v0
.end method
