.class Lcom/zykj/paint/record/AudioRecorder$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/paint/record/AudioRecorder;->makePCMFileToWAVFile()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/zykj/paint/record/AudioRecorder;


# direct methods
.method public constructor <init>(Lcom/zykj/paint/record/AudioRecorder;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/paint/record/AudioRecorder$5;->this$0:Lcom/zykj/paint/record/AudioRecorder;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/record/AudioRecorder$5;->this$0:Lcom/zykj/paint/record/AudioRecorder;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/zykj/paint/record/AudioRecorder;->access$500(Lcom/zykj/paint/record/AudioRecorder;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lcom/zykj/paint/record/AudioFileUtils;->getPcmFileAbsolutePath(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v1, p0, Lcom/zykj/paint/record/AudioRecorder$5;->this$0:Lcom/zykj/paint/record/AudioRecorder;

    .line 12
    .line 13
    invoke-static {v1}, Lcom/zykj/paint/record/AudioRecorder;->access$400(Lcom/zykj/paint/record/AudioRecorder;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iget-object v2, p0, Lcom/zykj/paint/record/AudioRecorder$5;->this$0:Lcom/zykj/paint/record/AudioRecorder;

    .line 18
    .line 19
    invoke-static {v2}, Lcom/zykj/paint/record/AudioRecorder;->access$500(Lcom/zykj/paint/record/AudioRecorder;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-static {v1, v2}, Lcom/zykj/paint/record/AudioFileUtils;->getWavFileAbsolutePath(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    const/4 v2, 0x1

    .line 28
    invoke-static {v0, v1, v2}, Lcom/zykj/paint/record/PcmToWav;->makePCMFileToWAVFile(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_0

    .line 33
    .line 34
    iget-object v0, p0, Lcom/zykj/paint/record/AudioRecorder$5;->this$0:Lcom/zykj/paint/record/AudioRecorder;

    .line 35
    .line 36
    const/4 v1, 0x0

    .line 37
    invoke-static {v0, v1}, Lcom/zykj/paint/record/AudioRecorder;->access$502(Lcom/zykj/paint/record/AudioRecorder;Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_0
    const-string v0, "AudioRecorder"

    .line 42
    .line 43
    const-string/jumbo v1, "makePCMFileToWAVFile fail"

    .line 44
    .line 45
    .line 46
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 47
    .line 48
    .line 49
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 50
    .line 51
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw v0
.end method
