.class Lio/microshow/rxffmpeg/RxFFmpegInvoke$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/microshow/rxffmpeg/RxFFmpegInvoke;->runCommandAsync([Ljava/lang/String;Lio/microshow/rxffmpeg/RxFFmpegInvoke$IFFmpegListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lio/microshow/rxffmpeg/RxFFmpegInvoke;

.field final synthetic val$command:[Ljava/lang/String;


# direct methods
.method public constructor <init>(Lio/microshow/rxffmpeg/RxFFmpegInvoke;[Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lio/microshow/rxffmpeg/RxFFmpegInvoke$1;->this$0:Lio/microshow/rxffmpeg/RxFFmpegInvoke;

    .line 2
    .line 3
    iput-object p2, p0, Lio/microshow/rxffmpeg/RxFFmpegInvoke$1;->val$command:[Ljava/lang/String;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/microshow/rxffmpeg/RxFFmpegInvoke$1;->this$0:Lio/microshow/rxffmpeg/RxFFmpegInvoke;

    .line 2
    .line 3
    iget-object v1, p0, Lio/microshow/rxffmpeg/RxFFmpegInvoke$1;->val$command:[Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lio/microshow/rxffmpeg/RxFFmpegInvoke;->runFFmpegCmd([Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lio/microshow/rxffmpeg/RxFFmpegInvoke$1;->this$0:Lio/microshow/rxffmpeg/RxFFmpegInvoke;

    .line 9
    .line 10
    invoke-virtual {v0}, Lio/microshow/rxffmpeg/RxFFmpegInvoke;->onClean()V

    .line 11
    .line 12
    .line 13
    return-void
.end method
