.class public final synthetic Landroidx/camera/video/internal/encoder/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c:Landroidx/camera/video/internal/encoder/EncoderCallback;

.field public final synthetic d:I

.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:Ljava/lang/Throwable;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/video/internal/encoder/EncoderCallback;ILjava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/video/internal/encoder/c;->c:Landroidx/camera/video/internal/encoder/EncoderCallback;

    iput p2, p0, Landroidx/camera/video/internal/encoder/c;->d:I

    iput-object p3, p0, Landroidx/camera/video/internal/encoder/c;->e:Ljava/lang/String;

    iput-object p4, p0, Landroidx/camera/video/internal/encoder/c;->f:Ljava/lang/Throwable;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/camera/video/internal/encoder/c;->c:Landroidx/camera/video/internal/encoder/EncoderCallback;

    iget v1, p0, Landroidx/camera/video/internal/encoder/c;->d:I

    iget-object v2, p0, Landroidx/camera/video/internal/encoder/c;->e:Ljava/lang/String;

    iget-object v3, p0, Landroidx/camera/video/internal/encoder/c;->f:Ljava/lang/Throwable;

    invoke-static {v0, v1, v2, v3}, Landroidx/camera/video/internal/encoder/EncoderImpl;->j(Landroidx/camera/video/internal/encoder/EncoderCallback;ILjava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
