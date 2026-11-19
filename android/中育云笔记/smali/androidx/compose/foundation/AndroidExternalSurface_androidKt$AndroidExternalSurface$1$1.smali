.class final Landroidx/compose/foundation/AndroidExternalSurface_androidKt$AndroidExternalSurface$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/AndroidExternalSurface_androidKt;->AndroidExternalSurface-58FFMhA(Landroidx/compose/ui/Modifier;ZJIZLhd/l;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lhd/l;"
    }
.end annotation


# instance fields
.field final synthetic $onInit:Lhd/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/l;"
        }
    .end annotation
.end field

.field final synthetic $state:Landroidx/compose/foundation/AndroidExternalSurfaceState;


# direct methods
.method public constructor <init>(Lhd/l;Landroidx/compose/foundation/AndroidExternalSurfaceState;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/l;",
            "Landroidx/compose/foundation/AndroidExternalSurfaceState;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/AndroidExternalSurface_androidKt$AndroidExternalSurface$1$1;->$onInit:Lhd/l;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/foundation/AndroidExternalSurface_androidKt$AndroidExternalSurface$1$1;->$state:Landroidx/compose/foundation/AndroidExternalSurfaceState;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final invoke(Landroid/content/Context;)Landroid/view/SurfaceView;
    .locals 2

    .line 2
    new-instance v0, Landroid/view/SurfaceView;

    invoke-direct {v0, p1}, Landroid/view/SurfaceView;-><init>(Landroid/content/Context;)V

    iget-object p1, p0, Landroidx/compose/foundation/AndroidExternalSurface_androidKt$AndroidExternalSurface$1$1;->$onInit:Lhd/l;

    iget-object v1, p0, Landroidx/compose/foundation/AndroidExternalSurface_androidKt$AndroidExternalSurface$1$1;->$state:Landroidx/compose/foundation/AndroidExternalSurfaceState;

    .line 3
    invoke-interface {p1, v1}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    invoke-virtual {v0}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object p1

    invoke-interface {p1, v1}, Landroid/view/SurfaceHolder;->addCallback(Landroid/view/SurfaceHolder$Callback;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroid/content/Context;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/AndroidExternalSurface_androidKt$AndroidExternalSurface$1$1;->invoke(Landroid/content/Context;)Landroid/view/SurfaceView;

    move-result-object p1

    return-object p1
.end method
