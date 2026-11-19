.class public abstract synthetic Lcom/zykj/download/work/DownloadFileWorkProxy$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/download/work/DownloadFileWorkProxy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1001
    name = "b"
.end annotation


# static fields
.field public static final synthetic a:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    invoke-static {}, Lcom/zykj/download/DownloadFlag;->values()[Lcom/zykj/download/DownloadFlag;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sget-object v1, Lcom/zykj/download/DownloadFlag;->DOWNLOAD_SUCCESS:Lcom/zykj/download/DownloadFlag;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1

    sget-object v1, Lcom/zykj/download/DownloadFlag;->DOWNLOADING:Lcom/zykj/download/DownloadFlag;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1

    sput-object v0, Lcom/zykj/download/work/DownloadFileWorkProxy$b;->a:[I

    return-void
.end method
