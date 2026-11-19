.class public final synthetic Landroidx/camera/core/streamsharing/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/impl/utils/futures/AsyncFunction;


# instance fields
.field public final synthetic a:Landroidx/camera/core/streamsharing/VirtualCameraControl;

.field public final synthetic b:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/core/streamsharing/VirtualCameraControl;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/core/streamsharing/d;->a:Landroidx/camera/core/streamsharing/VirtualCameraControl;

    iput-object p2, p0, Landroidx/camera/core/streamsharing/d;->b:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Le1/a;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/camera/core/streamsharing/d;->b:Ljava/util/List;

    check-cast p1, Ljava/lang/Void;

    iget-object v1, p0, Landroidx/camera/core/streamsharing/d;->a:Landroidx/camera/core/streamsharing/VirtualCameraControl;

    invoke-static {v1, v0, p1}, Landroidx/camera/core/streamsharing/VirtualCameraControl;->a(Landroidx/camera/core/streamsharing/VirtualCameraControl;Ljava/util/List;Ljava/lang/Void;)Le1/a;

    move-result-object p1

    return-object p1
.end method
