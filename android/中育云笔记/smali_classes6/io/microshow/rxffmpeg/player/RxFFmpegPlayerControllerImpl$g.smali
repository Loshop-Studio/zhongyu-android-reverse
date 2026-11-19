.class public Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/microshow/rxffmpeg/player/b$a;
.implements Lio/microshow/rxffmpeg/player/b$b;
.implements Lio/microshow/rxffmpeg/player/b$c;
.implements Lio/microshow/rxffmpeg/player/b$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "g"
.end annotation


# instance fields
.field public a:Ljava/lang/ref/WeakReference;


# direct methods
.method public constructor <init>(Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl$g;->a:Ljava/lang/ref/WeakReference;

    .line 10
    .line 11
    return-void
.end method
