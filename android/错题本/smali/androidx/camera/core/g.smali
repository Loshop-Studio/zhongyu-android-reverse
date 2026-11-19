.class public final synthetic Landroidx/camera/core/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/impl/SessionConfig$ErrorListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroidx/camera/core/UseCase;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/core/UseCase;I)V
    .locals 0

    .line 1
    iput p2, p0, Landroidx/camera/core/g;->a:I

    iput-object p1, p0, Landroidx/camera/core/g;->b:Landroidx/camera/core/UseCase;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onError(Landroidx/camera/core/impl/SessionConfig;Landroidx/camera/core/impl/SessionConfig$SessionError;)V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/camera/core/g;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Landroidx/camera/core/g;->b:Landroidx/camera/core/UseCase;

    check-cast v0, Landroidx/camera/core/Preview;

    invoke-static {v0, p1, p2}, Landroidx/camera/core/Preview;->a(Landroidx/camera/core/Preview;Landroidx/camera/core/impl/SessionConfig;Landroidx/camera/core/impl/SessionConfig$SessionError;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Landroidx/camera/core/g;->b:Landroidx/camera/core/UseCase;

    check-cast v0, Landroidx/camera/core/ImageCapture;

    invoke-static {v0, p1, p2}, Landroidx/camera/core/ImageCapture;->c(Landroidx/camera/core/ImageCapture;Landroidx/camera/core/impl/SessionConfig;Landroidx/camera/core/impl/SessionConfig$SessionError;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Landroidx/camera/core/g;->b:Landroidx/camera/core/UseCase;

    check-cast v0, Landroidx/camera/core/ImageAnalysis;

    invoke-static {v0, p1, p2}, Landroidx/camera/core/ImageAnalysis;->a(Landroidx/camera/core/ImageAnalysis;Landroidx/camera/core/impl/SessionConfig;Landroidx/camera/core/impl/SessionConfig$SessionError;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
