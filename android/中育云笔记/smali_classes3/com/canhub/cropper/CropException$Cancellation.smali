.class public final Lcom/canhub/cropper/CropException$Cancellation;
.super Lcom/canhub/cropper/CropException;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/canhub/cropper/CropException;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Cancellation"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/canhub/cropper/CropException$Cancellation$a;
    }
.end annotation


# static fields
.field public static final d:Lcom/canhub/cropper/CropException$Cancellation$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/canhub/cropper/CropException$Cancellation$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/canhub/cropper/CropException$Cancellation$a;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcom/canhub/cropper/CropException$Cancellation;->d:Lcom/canhub/cropper/CropException$Cancellation$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    const-string v0, "crop: cropping has been cancelled by the user"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {p0, v0, v1}, Lcom/canhub/cropper/CropException;-><init>(Ljava/lang/String;Lkotlin/jvm/internal/n;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method
