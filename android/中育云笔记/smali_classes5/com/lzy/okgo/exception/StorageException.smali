.class public Lcom/lzy/okgo/exception/StorageException;
.super Ljava/lang/Exception;
.source "SourceFile"


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static a()Lcom/lzy/okgo/exception/StorageException;
    .locals 2

    .line 1
    new-instance v0, Lcom/lzy/okgo/exception/StorageException;

    .line 2
    .line 3
    const-string v1, "SDCard isn\'t available, please check SD card and permission: WRITE_EXTERNAL_STORAGE, and you must pay attention to Android6.0 RunTime Permissions!"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lcom/lzy/okgo/exception/StorageException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method
