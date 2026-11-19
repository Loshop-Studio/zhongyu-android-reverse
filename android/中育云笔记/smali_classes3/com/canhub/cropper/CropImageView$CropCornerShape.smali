.class public final enum Lcom/canhub/cropper/CropImageView$CropCornerShape;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/canhub/cropper/CropImageView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "CropCornerShape"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/canhub/cropper/CropImageView$CropCornerShape;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum c:Lcom/canhub/cropper/CropImageView$CropCornerShape;

.field public static final enum d:Lcom/canhub/cropper/CropImageView$CropCornerShape;

.field public static final synthetic e:[Lcom/canhub/cropper/CropImageView$CropCornerShape;

.field public static final synthetic f:Lyc/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/canhub/cropper/CropImageView$CropCornerShape;

    .line 2
    .line 3
    const-string v1, "RECTANGLE"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lcom/canhub/cropper/CropImageView$CropCornerShape;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lcom/canhub/cropper/CropImageView$CropCornerShape;->c:Lcom/canhub/cropper/CropImageView$CropCornerShape;

    .line 10
    .line 11
    new-instance v0, Lcom/canhub/cropper/CropImageView$CropCornerShape;

    .line 12
    .line 13
    const-string v1, "OVAL"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2}, Lcom/canhub/cropper/CropImageView$CropCornerShape;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lcom/canhub/cropper/CropImageView$CropCornerShape;->d:Lcom/canhub/cropper/CropImageView$CropCornerShape;

    .line 20
    .line 21
    invoke-static {}, Lcom/canhub/cropper/CropImageView$CropCornerShape;->a()[Lcom/canhub/cropper/CropImageView$CropCornerShape;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, Lcom/canhub/cropper/CropImageView$CropCornerShape;->e:[Lcom/canhub/cropper/CropImageView$CropCornerShape;

    .line 26
    .line 27
    invoke-static {v0}, Lkotlin/enums/a;->a([Ljava/lang/Enum;)Lyc/a;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, Lcom/canhub/cropper/CropImageView$CropCornerShape;->f:Lyc/a;

    .line 32
    .line 33
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic a()[Lcom/canhub/cropper/CropImageView$CropCornerShape;
    .locals 2

    .line 1
    sget-object v0, Lcom/canhub/cropper/CropImageView$CropCornerShape;->c:Lcom/canhub/cropper/CropImageView$CropCornerShape;

    sget-object v1, Lcom/canhub/cropper/CropImageView$CropCornerShape;->d:Lcom/canhub/cropper/CropImageView$CropCornerShape;

    filled-new-array {v0, v1}, [Lcom/canhub/cropper/CropImageView$CropCornerShape;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/canhub/cropper/CropImageView$CropCornerShape;
    .locals 1

    .line 1
    const-class v0, Lcom/canhub/cropper/CropImageView$CropCornerShape;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/canhub/cropper/CropImageView$CropCornerShape;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lcom/canhub/cropper/CropImageView$CropCornerShape;
    .locals 1

    .line 1
    sget-object v0, Lcom/canhub/cropper/CropImageView$CropCornerShape;->e:[Lcom/canhub/cropper/CropImageView$CropCornerShape;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lcom/canhub/cropper/CropImageView$CropCornerShape;

    .line 8
    .line 9
    return-object v0
.end method
