.class public Lio/microshow/rxffmpeg/RxFFmpegInvoke;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static volatile b:Lio/microshow/rxffmpeg/RxFFmpegInvoke;


# instance fields
.field public a:Lcom/zykj/blackboard/utils/AudioUtils$audioCut$i$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "rxffmpeg-core"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "rxffmpeg-invoke"

    .line 7
    .line 8
    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public native runFFmpegCmd([Ljava/lang/String;)I
.end method
