.class public final synthetic Landroidx/camera/core/processing/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroidx/camera/core/processing/SurfaceEdge;

.field public final synthetic b:I

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/core/processing/SurfaceEdge;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/core/processing/m;->a:Landroidx/camera/core/processing/SurfaceEdge;

    iput p2, p0, Landroidx/camera/core/processing/m;->b:I

    iput p3, p0, Landroidx/camera/core/processing/m;->c:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget v0, p0, Landroidx/camera/core/processing/m;->b:I

    iget v1, p0, Landroidx/camera/core/processing/m;->c:I

    iget-object v2, p0, Landroidx/camera/core/processing/m;->a:Landroidx/camera/core/processing/SurfaceEdge;

    invoke-static {v2, v0, v1}, Landroidx/camera/core/processing/SurfaceEdge;->c(Landroidx/camera/core/processing/SurfaceEdge;II)V

    return-void
.end method
