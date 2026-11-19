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

    sget-object v0, Lcom/zykj/download/UploadResultType;->DOWNLOADING:Lcom/zykj/download/UploadResultType;

    sget-object v1, Lcom/zykj/download/UploadResultType;->DOWNLOAD_SUCCESS:Lcom/zykj/download/UploadResultType;

    sget-object v2, Lcom/zykj/download/UploadResultType;->DOWNLOAD_FAIL:Lcom/zykj/download/UploadResultType;

    filled-new-array {v0, v1, v2}, [Lcom/zykj/download/UploadResultType;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/zykj/download/UploadResultType;

    .line 2
    .line 3
    const-string v1, "DOWNLOADING"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lcom/zykj/download/UploadResultType;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lcom/zykj/download/UploadResultType;->DOWNLOADING:Lcom/zykj/download/UploadResultType;

    .line 10
    .line 11
    new-instance v0, Lcom/zykj/download/UploadResultType;

    .line 12
    .line 13
    const-string v1, "DOWNLOAD_SUCCESS"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2}, Lcom/zykj/download/UploadResultType;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lcom/zykj/download/UploadResultType;->DOWNLOAD_SUCCESS:Lcom/zykj/download/UploadResultType;

    .line 20
    .line 21
    new-instance v0, Lcom/zykj/download/UploadResultType;

    .line 22
    .line 23
    const-string v1, "DOWNLOAD_FAIL"

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    invoke-direct {v0, v1, v2}, Lcom/zykj/download/UploadResultType;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Lcom/zykj/download/UploadResultType;->DOWNLOAD_FAIL:Lcom/zykj/download/UploadResultType;

    .line 30
    .line 31
    invoke-static {}, Lcom/zykj/download/UploadResultType;->$values()[Lcom/zykj/download/UploadResultType;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sput-object v0, Lcom/zykj/download/UploadResultType;->$VALUES:[Lcom/zykj/download/UploadResultType;

    .line 36
    .line 37
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
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
