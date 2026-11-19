.class public final enum Lcom/zykj/download/UploadResultType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/zykj/download/UploadResultType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/zykj/download/UploadResultType;

.field public static final enum DOWNLOADING:Lcom/zykj/download/UploadResultType;

.field public static final enum DOWNLOAD_FAIL:Lcom/zykj/download/UploadResultType;

.field public static final enum DOWNLOAD_SUCCESS:Lcom/zykj/download/UploadResultType;


# direct methods
.method private static final synthetic $values()[Lcom/zykj/download/UploadResultType;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Lcom/zykj/download/UploadResultType;

    sget-object v1, Lcom/zykj/download/UploadResultType;->DOWNLOADING:Lcom/zykj/download/UploadResultType;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/zykj/download/UploadResultType;->DOWNLOAD_SUCCESS:Lcom/zykj/download/UploadResultType;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/zykj/download/UploadResultType;->DOWNLOAD_FAIL:Lcom/zykj/download/UploadResultType;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/zykj/download/UploadResultType;

    const-string v1, "DOWNLOADING"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/zykj/download/UploadResultType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/zykj/download/UploadResultType;->DOWNLOADING:Lcom/zykj/download/UploadResultType;

    .line 2
    new-instance v0, Lcom/zykj/download/UploadResultType;

    const-string v1, "DOWNLOAD_SUCCESS"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/zykj/download/UploadResultType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/zykj/download/UploadResultType;->DOWNLOAD_SUCCESS:Lcom/zykj/download/UploadResultType;

    .line 3
    new-instance v0, Lcom/zykj/download/UploadResultType;

    const-string v1, "DOWNLOAD_FAIL"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/zykj/download/UploadResultType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/zykj/download/UploadResultType;->DOWNLOAD_FAIL:Lcom/zykj/download/UploadResultType;

    invoke-static {}, Lcom/zykj/download/UploadResultType;->$values()[Lcom/zykj/download/UploadResultType;

    move-result-object v0

    sput-object v0, Lcom/zykj/download/UploadResultType;->$VALUES:[Lcom/zykj/download/UploadResultType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/zykj/download/UploadResultType;
    .locals 1

    const-class v0, Lcom/zykj/download/UploadResultType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/zykj/download/UploadResultType;

    return-object p0
.end method

.method public static values()[Lcom/zykj/download/UploadResultType;
    .locals 1

    sget-object v0, Lcom/zykj/download/UploadResultType;->$VALUES:[Lcom/zykj/download/UploadResultType;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/zykj/download/UploadResultType;

    return-object v0
.end method
