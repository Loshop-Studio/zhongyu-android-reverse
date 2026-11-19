.class public final synthetic Landroidx/camera/video/internal/encoder/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroidx/camera/video/internal/encoder/EncoderImpl;

.field public final synthetic b:J

.field public final synthetic c:J


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/video/internal/encoder/EncoderImpl;JJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/video/internal/encoder/b;->a:Landroidx/camera/video/internal/encoder/EncoderImpl;

    iput-wide p2, p0, Landroidx/camera/video/internal/encoder/b;->b:J

    iput-wide p4, p0, Landroidx/camera/video/internal/encoder/b;->c:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget-wide v0, p0, Landroidx/camera/video/internal/encoder/b;->b:J

    iget-wide v2, p0, Landroidx/camera/video/internal/encoder/b;->c:J

    iget-object v4, p0, Landroidx/camera/video/internal/encoder/b;->a:Landroidx/camera/video/internal/encoder/EncoderImpl;

    invoke-static {v4, v0, v1, v2, v3}, Landroidx/camera/video/internal/encoder/EncoderImpl;->k(Landroidx/camera/video/internal/encoder/EncoderImpl;JJ)V

    return-void
.end method
