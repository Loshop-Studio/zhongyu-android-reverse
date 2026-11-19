.class public Lcom/alibaba/sdk/android/oss/signer/SignParameters;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final AUTHORIZATION_PREFIX:Ljava/lang/String; = "OSS "

.field public static final NEW_LINE:Ljava/lang/String; = "\n"

.field public static final SIGNED_PARAMTERS:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 28

    .line 1
    const-string/jumbo v26, "tagging"

    .line 2
    .line 3
    .line 4
    const-string v27, "objectMeta"

    .line 5
    .line 6
    const-string v1, "bucketInfo"

    .line 7
    .line 8
    const-string v2, "acl"

    .line 9
    .line 10
    const-string/jumbo v3, "uploads"

    .line 11
    .line 12
    .line 13
    const-string v4, "location"

    .line 14
    .line 15
    const-string v5, "cors"

    .line 16
    .line 17
    const-string v6, "logging"

    .line 18
    .line 19
    const-string/jumbo v7, "website"

    .line 20
    .line 21
    .line 22
    const-string v8, "referer"

    .line 23
    .line 24
    const-string v9, "lifecycle"

    .line 25
    .line 26
    const-string v10, "delete"

    .line 27
    .line 28
    const-string v11, "append"

    .line 29
    .line 30
    const-string/jumbo v12, "uploadId"

    .line 31
    .line 32
    .line 33
    const-string v13, "partNumber"

    .line 34
    .line 35
    const-string/jumbo v14, "security-token"

    .line 36
    .line 37
    .line 38
    const-string v15, "position"

    .line 39
    .line 40
    const-string/jumbo v16, "response-cache-control"

    .line 41
    .line 42
    .line 43
    const-string/jumbo v17, "response-content-disposition"

    .line 44
    .line 45
    .line 46
    const-string/jumbo v18, "response-content-encoding"

    .line 47
    .line 48
    .line 49
    const-string/jumbo v19, "response-content-language"

    .line 50
    .line 51
    .line 52
    const-string/jumbo v20, "response-content-type"

    .line 53
    .line 54
    .line 55
    const-string/jumbo v21, "response-expires"

    .line 56
    .line 57
    .line 58
    const-string/jumbo v22, "x-oss-process"

    .line 59
    .line 60
    .line 61
    const-string/jumbo v23, "sequential"

    .line 62
    .line 63
    .line 64
    const-string/jumbo v24, "symlink"

    .line 65
    .line 66
    .line 67
    const-string/jumbo v25, "restore"

    .line 68
    .line 69
    .line 70
    filled-new-array/range {v1 .. v27}, [Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    sput-object v0, Lcom/alibaba/sdk/android/oss/signer/SignParameters;->SIGNED_PARAMTERS:Ljava/util/List;

    .line 79
    .line 80
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method
