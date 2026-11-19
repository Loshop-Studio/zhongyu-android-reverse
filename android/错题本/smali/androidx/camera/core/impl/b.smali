.class public final synthetic Landroidx/camera/core/impl/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/CameraFilter;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/camera/core/impl/b;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final filter(Ljava/util/List;)Ljava/util/List;
    .locals 1

    .line 1
    iget v0, p0, Landroidx/camera/core/impl/b;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-static {p1}, Landroidx/camera/core/impl/CameraFilters;->b(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-static {p1}, Landroidx/camera/core/impl/CameraFilters;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
