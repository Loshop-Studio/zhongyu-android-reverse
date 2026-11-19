.class public final synthetic Landroidx/camera/camera2/interop/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/impl/Config$OptionMatcher;
.implements Landroidx/concurrent/futures/CallbackToFutureAdapter$Resolver;
.implements Landroidx/compose/foundation/text/TextRangeScopeMeasurePolicy;


# instance fields
.field public final synthetic a:Ljava/lang/Object;

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/camera/camera2/interop/d;->a:Ljava/lang/Object;

    iput-object p2, p0, Landroidx/camera/camera2/interop/d;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public attachCompleter(Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/interop/d;->a:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/lifecycle/ProcessCameraProvider;

    iget-object v1, p0, Landroidx/camera/camera2/interop/d;->b:Ljava/lang/Object;

    check-cast v1, Landroidx/camera/core/CameraX;

    invoke-static {v0, v1, p1}, Landroidx/camera/lifecycle/ProcessCameraProvider;->c(Landroidx/camera/lifecycle/ProcessCameraProvider;Landroidx/camera/core/CameraX;Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public measure(Landroidx/compose/foundation/text/TextRangeLayoutMeasureScope;)Landroidx/compose/foundation/text/TextRangeLayoutMeasureResult;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/interop/d;->a:Ljava/lang/Object;

    check-cast v0, Landroidx/compose/foundation/text/TextLinkScope;

    iget-object v1, p0, Landroidx/camera/camera2/interop/d;->b:Ljava/lang/Object;

    check-cast v1, Landroidx/compose/ui/text/AnnotatedString$Range;

    invoke-static {v0, v1, p1}, Landroidx/compose/foundation/text/TextLinkScope;->a(Landroidx/compose/foundation/text/TextLinkScope;Landroidx/compose/ui/text/AnnotatedString$Range;Landroidx/compose/foundation/text/TextRangeLayoutMeasureScope;)Landroidx/compose/foundation/text/TextRangeLayoutMeasureResult;

    move-result-object p1

    return-object p1
.end method

.method public onOptionMatched(Landroidx/camera/core/impl/Config$Option;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/interop/d;->a:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/camera2/interop/CaptureRequestOptions$Builder;

    iget-object v1, p0, Landroidx/camera/camera2/interop/d;->b:Ljava/lang/Object;

    check-cast v1, Landroidx/camera/core/impl/Config;

    invoke-static {v0, v1, p1}, Landroidx/camera/camera2/interop/CaptureRequestOptions$Builder;->a(Landroidx/camera/camera2/interop/CaptureRequestOptions$Builder;Landroidx/camera/core/impl/Config;Landroidx/camera/core/impl/Config$Option;)Z

    move-result p1

    return p1
.end method
