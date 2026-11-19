.class public Lcom/alibaba/sdk/android/tbrest/request/BizResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final DENY_SERVICE:I = 0x6b

.field static final NGX_ADASH_DENY_SERVICE:I = 0x74

.field static final NGX_ADASH_DISABLE_RTLOG:I = 0x73

.field static final NGX_ADASH_DOWNGRADE_V1:I = 0x6d

.field static final NO_ERROR:I = 0x0

.field static final UNKNOWN_ERROR:I = -0x1


# instance fields
.field public data:Ljava/lang/String;

.field errCode:I

.field rt:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, Lcom/alibaba/sdk/android/tbrest/request/BizResponse;->errCode:I

    .line 6
    .line 7
    const-wide/16 v0, 0x0

    .line 8
    .line 9
    iput-wide v0, p0, Lcom/alibaba/sdk/android/tbrest/request/BizResponse;->rt:J

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public isSuccess()Z
    .locals 1

    .line 1
    iget v0, p0, Lcom/alibaba/sdk/android/tbrest/request/BizResponse;->errCode:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method
