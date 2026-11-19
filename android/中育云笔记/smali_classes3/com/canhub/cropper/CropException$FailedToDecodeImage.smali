.class public final Lcom/canhub/cropper/CropException$FailedToDecodeImage;
.super Lcom/canhub/cropper/CropException;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/canhub/cropper/CropException;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "FailedToDecodeImage"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/canhub/cropper/CropException$FailedToDecodeImage$a;
    }
.end annotation


# static fields
.field public static final d:Lcom/canhub/cropper/CropException$FailedToDecodeImage$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/canhub/cropper/CropException$FailedToDecodeImage$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/canhub/cropper/CropException$FailedToDecodeImage$a;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcom/canhub/cropper/CropException$FailedToDecodeImage;->d:Lcom/canhub/cropper/CropException$FailedToDecodeImage$a;

    return-void
.end method

.method public constructor <init>(Landroid/net/Uri;)V
    .locals 2

    .line 1
    const-string v0, "uri"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 9
    .line 10
    .line 11
    const-string v1, "crop: Failed to decode image: "

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    const/4 v0, 0x0

    .line 24
    invoke-direct {p0, p1, v0}, Lcom/canhub/cropper/CropException;-><init>(Ljava/lang/String;Lkotlin/jvm/internal/n;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method
