.class public final Lcom/blankj/utilcode/util/CrashUtils$CrashInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/blankj/utilcode/util/CrashUtils;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "CrashInfo"
.end annotation


# instance fields
.field private mFileHeadProvider:Lcom/blankj/utilcode/util/UtilsBridge$FileHead;

.field private mThrowable:Ljava/lang/Throwable;


# direct methods
.method private constructor <init>(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p2, p0, Lcom/blankj/utilcode/util/CrashUtils$CrashInfo;->mThrowable:Ljava/lang/Throwable;

    .line 4
    new-instance p2, Lcom/blankj/utilcode/util/UtilsBridge$FileHead;

    const-string v0, "Crash"

    invoke-direct {p2, v0}, Lcom/blankj/utilcode/util/UtilsBridge$FileHead;-><init>(Ljava/lang/String;)V

    iput-object p2, p0, Lcom/blankj/utilcode/util/CrashUtils$CrashInfo;->mFileHeadProvider:Lcom/blankj/utilcode/util/UtilsBridge$FileHead;

    .line 5
    const-string v0, "Time Of Crash"

    invoke-virtual {p2, v0, p1}, Lcom/blankj/utilcode/util/UtilsBridge$FileHead;->addFirst(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/Throwable;Lcom/blankj/utilcode/util/CrashUtils$1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/blankj/utilcode/util/CrashUtils$CrashInfo;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method


# virtual methods
.method public final addExtraHead(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/blankj/utilcode/util/CrashUtils$CrashInfo;->mFileHeadProvider:Lcom/blankj/utilcode/util/UtilsBridge$FileHead;

    invoke-virtual {v0, p1, p2}, Lcom/blankj/utilcode/util/UtilsBridge$FileHead;->append(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final addExtraHead(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/blankj/utilcode/util/CrashUtils$CrashInfo;->mFileHeadProvider:Lcom/blankj/utilcode/util/UtilsBridge$FileHead;

    invoke-virtual {v0, p1}, Lcom/blankj/utilcode/util/UtilsBridge$FileHead;->append(Ljava/util/Map;)V

    return-void
.end method

.method public final getThrowable()Ljava/lang/Throwable;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/blankj/utilcode/util/CrashUtils$CrashInfo;->mThrowable:Ljava/lang/Throwable;

    .line 2
    .line 3
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/blankj/utilcode/util/CrashUtils$CrashInfo;->mFileHeadProvider:Lcom/blankj/utilcode/util/UtilsBridge$FileHead;

    .line 7
    .line 8
    invoke-virtual {v1}, Lcom/blankj/utilcode/util/UtilsBridge$FileHead;->toString()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    iget-object v1, p0, Lcom/blankj/utilcode/util/CrashUtils$CrashInfo;->mThrowable:Ljava/lang/Throwable;

    .line 16
    .line 17
    invoke-static {v1}, Lcom/blankj/utilcode/util/UtilsBridge;->getFullStackTrace(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    return-object v0
.end method
