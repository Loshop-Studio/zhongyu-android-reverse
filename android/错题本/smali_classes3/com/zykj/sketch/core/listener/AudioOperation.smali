.class public interface abstract Lcom/zykj/sketch/core/listener/AudioOperation;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008f\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\u0008\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u0008\u0010\u0004J\u0019\u0010\u000b\u001a\u00020\u00022\u0008\u0010\n\u001a\u0004\u0018\u00010\tH&\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/zykj/sketch/core/listener/AudioOperation;",
        "",
        "Ld6/s;",
        "startRecord",
        "()V",
        "",
        "isRecord",
        "()Z",
        "stopRecord",
        "Lcom/zykj/sketch/core/listener/ProgressListener;",
        "listener",
        "setProgressListener",
        "(Lcom/zykj/sketch/core/listener/ProgressListener;)V",
        "sketch_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract isRecord()Z
.end method

.method public abstract setProgressListener(Lcom/zykj/sketch/core/listener/ProgressListener;)V
    .param p1    # Lcom/zykj/sketch/core/listener/ProgressListener;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
.end method

.method public abstract startRecord()V
.end method

.method public abstract stopRecord()V
.end method
