.class Lcom/zykj/paint/record/AudioRecorder$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/paint/record/AudioRecorder;->startRecord()V
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
    iput-object p1, p0, Lcom/zykj/paint/record/AudioRecorder$2;->this$0:Lcom/zykj/paint/record/AudioRecorder;

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
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/record/AudioRecorder$2;->this$0:Lcom/zykj/paint/record/AudioRecorder;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, Lcom/zykj/paint/record/AudioRecorder;->access$200(Lcom/zykj/paint/record/AudioRecorder;Lcom/zykj/paint/record/RecordStreamListener;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method
