.class public final Lcom/zykj/blackboard/core/canvas/control/DrawControl$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln4/k;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/blackboard/core/canvas/control/DrawControl;-><init>(Lcom/zykj/blackboard/bean/BoardConfig;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/zykj/blackboard/core/canvas/control/DrawControl;


# direct methods
.method public constructor <init>(Lcom/zykj/blackboard/core/canvas/control/DrawControl;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl$a;->a:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(Landroid/graphics/RectF;Landroid/graphics/RectF;)V
    .locals 1

    .line 1
    const-string v0, "renderRectF"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "visibleRectF"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public b(Landroid/graphics/Matrix;)V
    .locals 1

    .line 1
    const-string v0, "matrix"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl$a;->a:Lcom/zykj/blackboard/core/canvas/control/DrawControl;

    .line 7
    .line 8
    invoke-static {p1}, Lcom/zykj/blackboard/core/canvas/control/DrawControl;->a(Lcom/zykj/blackboard/core/canvas/control/DrawControl;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
