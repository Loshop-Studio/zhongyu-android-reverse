.class Lcom/zykj/paint/record/AudioRecorder$3;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/paint/record/AudioRecorder;->makePCMFile2Amr(Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/zykj/paint/record/AudioRecorder;

.field final synthetic val$encoder:Lcom/zykj/paint/record/AmrEncoder;

.field final synthetic val$pcmFileName:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/zykj/paint/record/AudioRecorder;Lcom/zykj/paint/record/AmrEncoder;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/paint/record/AudioRecorder$3;->this$0:Lcom/zykj/paint/record/AudioRecorder;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/paint/record/AudioRecorder$3;->val$encoder:Lcom/zykj/paint/record/AmrEncoder;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/zykj/paint/record/AudioRecorder$3;->val$pcmFileName:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/record/AudioRecorder$3;->val$encoder:Lcom/zykj/paint/record/AmrEncoder;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/paint/record/AudioRecorder$3;->this$0:Lcom/zykj/paint/record/AudioRecorder;

    .line 4
    .line 5
    invoke-static {v1}, Lcom/zykj/paint/record/AudioRecorder;->access$300(Lcom/zykj/paint/record/AudioRecorder;)Landroid/media/AudioRecord;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Landroid/media/AudioRecord;->getChannelCount()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const v2, 0x3e800

    .line 14
    .line 15
    .line 16
    mul-int/2addr v1, v2

    .line 17
    iget-object v2, p0, Lcom/zykj/paint/record/AudioRecorder$3;->this$0:Lcom/zykj/paint/record/AudioRecorder;

    .line 18
    .line 19
    invoke-static {v2}, Lcom/zykj/paint/record/AudioRecorder;->access$300(Lcom/zykj/paint/record/AudioRecorder;)Landroid/media/AudioRecord;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {v2}, Landroid/media/AudioRecord;->getChannelCount()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    const/16 v3, 0x3e80

    .line 28
    .line 29
    invoke-virtual {v0, v3, v1, v2}, Lcom/zykj/paint/record/AmrEncoder;->init(III)V

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Lcom/zykj/paint/record/AudioRecorder$3;->val$encoder:Lcom/zykj/paint/record/AmrEncoder;

    .line 33
    .line 34
    iget-object v1, p0, Lcom/zykj/paint/record/AudioRecorder$3;->val$pcmFileName:Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Lcom/zykj/paint/record/AmrEncoder;->encode(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method
