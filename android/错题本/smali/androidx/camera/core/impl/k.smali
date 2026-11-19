.class public final synthetic Landroidx/camera/core/impl/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/impl/UseCaseAttachState$AttachStateFilter;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/camera/core/impl/k;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final filter(Landroidx/camera/core/impl/UseCaseAttachState$UseCaseAttachInfo;)Z
    .locals 1

    .line 1
    iget v0, p0, Landroidx/camera/core/impl/k;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-static {p1}, Landroidx/camera/core/impl/UseCaseAttachState;->a(Landroidx/camera/core/impl/UseCaseAttachState$UseCaseAttachInfo;)Z

    move-result p1

    return p1

    :pswitch_0
    invoke-static {p1}, Landroidx/camera/core/impl/UseCaseAttachState;->d(Landroidx/camera/core/impl/UseCaseAttachState$UseCaseAttachInfo;)Z

    move-result p1

    return p1

    :pswitch_1
    invoke-static {p1}, Landroidx/camera/core/impl/UseCaseAttachState;->c(Landroidx/camera/core/impl/UseCaseAttachState$UseCaseAttachInfo;)Z

    move-result p1

    return p1

    :pswitch_2
    invoke-static {p1}, Landroidx/camera/core/impl/UseCaseAttachState;->b(Landroidx/camera/core/impl/UseCaseAttachState$UseCaseAttachInfo;)Z

    move-result p1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
