.class public final Lcom/zykj/download/work/UploadFileOssWork$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/http/listener/UploadProgressListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/download/work/UploadFileOssWork;->uploadFile$suspendImpl(Lcom/zykj/download/work/UploadFileOssWork;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/zykj/download/work/UploadFileOssWork;


# direct methods
.method public constructor <init>(Lcom/zykj/download/work/UploadFileOssWork;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/download/work/UploadFileOssWork$c;->a:Lcom/zykj/download/work/UploadFileOssWork;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onProgressUpdate(JJ)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/download/work/UploadFileOssWork$c;->a:Lcom/zykj/download/work/UploadFileOssWork;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/download/work/UploadFileWork;->getReceiverLengthLiveData()Landroidx/lifecycle/MutableLiveData;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v0, v1}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lcom/zykj/download/work/UploadFileOssWork$c;->a:Lcom/zykj/download/work/UploadFileOssWork;

    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/zykj/download/work/UploadFileWork;->getProgressLiveData()Landroidx/lifecycle/MutableLiveData;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    long-to-float p1, p1

    .line 21
    const/high16 p2, 0x42c80000    # 100.0f

    .line 22
    .line 23
    mul-float/2addr p1, p2

    .line 24
    long-to-float p2, p3

    .line 25
    div-float/2addr p1, p2

    .line 26
    float-to-int p1, p1

    .line 27
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {v0, p1}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method
