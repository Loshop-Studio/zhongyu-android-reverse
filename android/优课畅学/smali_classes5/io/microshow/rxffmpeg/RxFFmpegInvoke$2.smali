.class Lio/microshow/rxffmpeg/RxFFmpegInvoke$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls6/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/microshow/rxffmpeg/RxFFmpegInvoke;->runCommandRxJava([Ljava/lang/String;)Ls6/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ls6/d;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lio/microshow/rxffmpeg/RxFFmpegInvoke;

.field final synthetic val$command:[Ljava/lang/String;


# direct methods
.method public constructor <init>(Lio/microshow/rxffmpeg/RxFFmpegInvoke;[Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lio/microshow/rxffmpeg/RxFFmpegInvoke$2;->this$0:Lio/microshow/rxffmpeg/RxFFmpegInvoke;

    .line 2
    .line 3
    iput-object p2, p0, Lio/microshow/rxffmpeg/RxFFmpegInvoke$2;->val$command:[Ljava/lang/String;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public subscribe(Ls6/c;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ls6/c;",
            ")V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lio/microshow/rxffmpeg/RxFFmpegInvoke$2;->this$0:Lio/microshow/rxffmpeg/RxFFmpegInvoke;

    .line 2
    .line 3
    new-instance v1, Lio/microshow/rxffmpeg/RxFFmpegInvoke$2$1;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1}, Lio/microshow/rxffmpeg/RxFFmpegInvoke$2$1;-><init>(Lio/microshow/rxffmpeg/RxFFmpegInvoke$2;Ls6/c;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lio/microshow/rxffmpeg/RxFFmpegInvoke;->setFFmpegListener(Lio/microshow/rxffmpeg/RxFFmpegInvoke$IFFmpegListener;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lio/microshow/rxffmpeg/RxFFmpegInvoke$2;->this$0:Lio/microshow/rxffmpeg/RxFFmpegInvoke;

    .line 12
    .line 13
    iget-object v0, p0, Lio/microshow/rxffmpeg/RxFFmpegInvoke$2;->val$command:[Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {p1, v0}, Lio/microshow/rxffmpeg/RxFFmpegInvoke;->runFFmpegCmd([Ljava/lang/String;)I

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lio/microshow/rxffmpeg/RxFFmpegInvoke$2;->this$0:Lio/microshow/rxffmpeg/RxFFmpegInvoke;

    .line 19
    .line 20
    invoke-virtual {p1}, Lio/microshow/rxffmpeg/RxFFmpegInvoke;->onClean()V

    .line 21
    .line 22
    .line 23
    return-void
.end method
