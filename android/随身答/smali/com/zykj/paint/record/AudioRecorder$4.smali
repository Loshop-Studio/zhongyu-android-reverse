.class Lcom/zykj/paint/record/AudioRecorder$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/paint/record/AudioRecorder;->mergePCMFilesToWAVFile(Ljava/util/List;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/zykj/paint/record/AudioRecorder;

.field final synthetic val$filePaths:Ljava/util/List;

.field final synthetic val$isPreview:Z


# direct methods
.method public constructor <init>(Lcom/zykj/paint/record/AudioRecorder;Ljava/util/List;Z)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/paint/record/AudioRecorder$4;->this$0:Lcom/zykj/paint/record/AudioRecorder;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/paint/record/AudioRecorder$4;->val$filePaths:Ljava/util/List;

    .line 4
    .line 5
    iput-boolean p3, p0, Lcom/zykj/paint/record/AudioRecorder$4;->val$isPreview:Z

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/record/AudioRecorder$4;->val$filePaths:Ljava/util/List;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/paint/record/AudioRecorder$4;->this$0:Lcom/zykj/paint/record/AudioRecorder;

    .line 4
    .line 5
    invoke-static {v1}, Lcom/zykj/paint/record/AudioRecorder;->access$400(Lcom/zykj/paint/record/AudioRecorder;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, p0, Lcom/zykj/paint/record/AudioRecorder$4;->this$0:Lcom/zykj/paint/record/AudioRecorder;

    .line 10
    .line 11
    invoke-static {v2}, Lcom/zykj/paint/record/AudioRecorder;->access$500(Lcom/zykj/paint/record/AudioRecorder;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-static {v1, v2}, Lcom/zykj/paint/record/AudioFileUtils;->getWavFileAbsolutePath(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    iget-boolean v2, p0, Lcom/zykj/paint/record/AudioRecorder$4;->val$isPreview:Z

    .line 20
    .line 21
    invoke-static {v0, v1, v2}, Lcom/zykj/paint/record/PcmToWav;->mergePCMFilesToWAVFile(Ljava/util/List;Ljava/lang/String;Z)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    const-string v1, "AudioRecorder"

    .line 26
    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    const-string/jumbo v0, "\u5f55\u97f3\u5408\u6210\u6210\u529f"

    .line 30
    .line 31
    .line 32
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_0
    const-string/jumbo v0, "mergePCMFilesToWAVFile fail"

    .line 37
    .line 38
    .line 39
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 40
    .line 41
    .line 42
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 43
    .line 44
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw v1
.end method
