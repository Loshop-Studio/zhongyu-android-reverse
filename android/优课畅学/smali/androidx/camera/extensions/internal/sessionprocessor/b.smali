.class public final synthetic Landroidx/camera/extensions/internal/sessionprocessor/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/extensions/internal/sessionprocessor/PreviewProcessor$OnCaptureResultCallback;


# instance fields
.field public final synthetic a:Landroidx/camera/extensions/internal/sessionprocessor/BasicExtenderSessionProcessor;

.field public final synthetic b:Landroidx/camera/core/impl/SessionProcessor$CaptureCallback;

.field public final synthetic c:I

.field public final synthetic d:Landroidx/camera/core/impl/TagBundle;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/extensions/internal/sessionprocessor/BasicExtenderSessionProcessor;Landroidx/camera/core/impl/SessionProcessor$CaptureCallback;ILandroidx/camera/core/impl/TagBundle;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/extensions/internal/sessionprocessor/b;->a:Landroidx/camera/extensions/internal/sessionprocessor/BasicExtenderSessionProcessor;

    iput-object p2, p0, Landroidx/camera/extensions/internal/sessionprocessor/b;->b:Landroidx/camera/core/impl/SessionProcessor$CaptureCallback;

    iput p3, p0, Landroidx/camera/extensions/internal/sessionprocessor/b;->c:I

    iput-object p4, p0, Landroidx/camera/extensions/internal/sessionprocessor/b;->d:Landroidx/camera/core/impl/TagBundle;

    return-void
.end method


# virtual methods
.method public final onCaptureResult(JLjava/util/List;)V
    .locals 7

    .line 1
    iget-object v0, p0, Landroidx/camera/extensions/internal/sessionprocessor/b;->a:Landroidx/camera/extensions/internal/sessionprocessor/BasicExtenderSessionProcessor;

    iget-object v1, p0, Landroidx/camera/extensions/internal/sessionprocessor/b;->b:Landroidx/camera/core/impl/SessionProcessor$CaptureCallback;

    iget v2, p0, Landroidx/camera/extensions/internal/sessionprocessor/b;->c:I

    iget-object v3, p0, Landroidx/camera/extensions/internal/sessionprocessor/b;->d:Landroidx/camera/core/impl/TagBundle;

    move-wide v4, p1

    move-object v6, p3

    invoke-static/range {v0 .. v6}, Landroidx/camera/extensions/internal/sessionprocessor/BasicExtenderSessionProcessor;->c(Landroidx/camera/extensions/internal/sessionprocessor/BasicExtenderSessionProcessor;Landroidx/camera/core/impl/SessionProcessor$CaptureCallback;ILandroidx/camera/core/impl/TagBundle;JLjava/util/List;)V

    return-void
.end method
