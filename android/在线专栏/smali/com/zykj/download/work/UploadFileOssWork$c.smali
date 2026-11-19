.class public final Lcom/zykj/download/work/UploadFileOssWork$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/http/listener/UploadProgressListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/download/work/UploadFileOssWork;->uploadFile$suspendImpl(Lcom/zykj/download/work/UploadFileOssWork;Lq2/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/zykj/download/work/UploadFileOssWork;


# direct methods
.method constructor <init>(Lcom/zykj/download/work/UploadFileOssWork;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/download/work/UploadFileOssWork$c;->a:Lcom/zykj/download/work/UploadFileOssWork;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onProgressUpdate(JJ)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/download/work/UploadFileOssWork$c;->a:Lcom/zykj/download/work/UploadFileOssWork;

    invoke-virtual {v0}, Lcom/zykj/download/work/UploadFileWork;->getReceiverLengthLiveData()Landroidx/lifecycle/s;

    move-result-object v0

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/lifecycle/s;->postValue(Ljava/lang/Object;)V

    .line 2
    iget-object v0, p0, Lcom/zykj/download/work/UploadFileOssWork$c;->a:Lcom/zykj/download/work/UploadFileOssWork;

    invoke-virtual {v0}, Lcom/zykj/download/work/UploadFileWork;->getProgressLiveData()Landroidx/lifecycle/s;

    move-result-object v0

    long-to-float p1, p1

    const/high16 p2, 0x42c80000    # 100.0f

    mul-float p1, p1, p2

    long-to-float p2, p3

    div-float/2addr p1, p2

    float-to-int p1, p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroidx/lifecycle/s;->postValue(Ljava/lang/Object;)V

    return-void
.end method
