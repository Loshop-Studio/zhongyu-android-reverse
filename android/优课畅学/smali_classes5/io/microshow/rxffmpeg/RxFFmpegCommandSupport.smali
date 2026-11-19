.class public Lio/microshow/rxffmpeg/RxFFmpegCommandSupport;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static getBoxblur(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)[Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Lio/microshow/rxffmpeg/RxFFmpegCommandList;

    .line 2
    .line 3
    invoke-direct {v0}, Lio/microshow/rxffmpeg/RxFFmpegCommandList;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "-i"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lio/microshow/rxffmpeg/RxFFmpegCommandList;->append(Ljava/lang/String;)Lio/microshow/rxffmpeg/RxFFmpegCommandList;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p0}, Lio/microshow/rxffmpeg/RxFFmpegCommandList;->append(Ljava/lang/String;)Lio/microshow/rxffmpeg/RxFFmpegCommandList;

    .line 12
    .line 13
    .line 14
    const-string p0, "-vf"

    .line 15
    .line 16
    invoke-virtual {v0, p0}, Lio/microshow/rxffmpeg/RxFFmpegCommandList;->append(Ljava/lang/String;)Lio/microshow/rxffmpeg/RxFFmpegCommandList;

    .line 17
    .line 18
    .line 19
    new-instance p0, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    .line 23
    .line 24
    const-string v1, "boxblur="

    .line 25
    .line 26
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_0

    .line 34
    .line 35
    const-string p2, "5:1"

    .line 36
    .line 37
    :cond_0
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-virtual {v0, p0}, Lio/microshow/rxffmpeg/RxFFmpegCommandList;->append(Ljava/lang/String;)Lio/microshow/rxffmpeg/RxFFmpegCommandList;

    .line 45
    .line 46
    .line 47
    const-string p0, "-preset"

    .line 48
    .line 49
    invoke-virtual {v0, p0}, Lio/microshow/rxffmpeg/RxFFmpegCommandList;->append(Ljava/lang/String;)Lio/microshow/rxffmpeg/RxFFmpegCommandList;

    .line 50
    .line 51
    .line 52
    const-string p0, "superfast"

    .line 53
    .line 54
    invoke-virtual {v0, p0}, Lio/microshow/rxffmpeg/RxFFmpegCommandList;->append(Ljava/lang/String;)Lio/microshow/rxffmpeg/RxFFmpegCommandList;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, p1}, Lio/microshow/rxffmpeg/RxFFmpegCommandList;->append(Ljava/lang/String;)Lio/microshow/rxffmpeg/RxFFmpegCommandList;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, p3}, Lio/microshow/rxffmpeg/RxFFmpegCommandList;->build(Z)[Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    return-object p0
.end method
