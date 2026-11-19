.class final Lcom/zykj/blackboard/core/action/TextAction$handleTextEdit$1$3;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/blackboard/core/action/TextAction;->d0(FFZ)V
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
.field public final synthetic c:Lcom/zykj/blackboard/core/action/TextAction;

.field public final synthetic d:Z

.field public final synthetic e:Lca/d;

.field public final synthetic f:Landroid/graphics/PointF;


# direct methods
.method public constructor <init>(Lcom/zykj/blackboard/core/action/TextAction;ZLca/d;Landroid/graphics/PointF;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/TextAction$handleTextEdit$1$3;->c:Lcom/zykj/blackboard/core/action/TextAction;

    .line 2
    .line 3
    iput-boolean p2, p0, Lcom/zykj/blackboard/core/action/TextAction$handleTextEdit$1$3;->d:Z

    .line 4
    .line 5
    iput-object p3, p0, Lcom/zykj/blackboard/core/action/TextAction$handleTextEdit$1$3;->e:Lca/d;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/zykj/blackboard/core/action/TextAction$handleTextEdit$1$3;->f:Landroid/graphics/PointF;

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/action/TextAction$handleTextEdit$1$3;->invoke(Ljava/lang/String;)V

    sget-object p1, Lqc/q;->a:Lqc/q;

    return-object p1
.end method

.method public final invoke(Ljava/lang/String;)V
    .locals 7

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/TextAction$handleTextEdit$1$3;->c:Lcom/zykj/blackboard/core/action/TextAction;

    iget-boolean v2, p0, Lcom/zykj/blackboard/core/action/TextAction$handleTextEdit$1$3;->d:Z

    iget-object v0, p0, Lcom/zykj/blackboard/core/action/TextAction$handleTextEdit$1$3;->e:Lca/d;

    invoke-virtual {v0}, Lba/a;->g()Landroid/graphics/RectF;

    move-result-object v3

    iget-object v0, p0, Lcom/zykj/blackboard/core/action/TextAction$handleTextEdit$1$3;->f:Landroid/graphics/PointF;

    iget v4, v0, Landroid/graphics/PointF;->x:F

    iget v5, v0, Landroid/graphics/PointF;->y:F

    move-object v6, p1

    invoke-static/range {v1 .. v6}, Lcom/zykj/blackboard/core/action/TextAction;->N(Lcom/zykj/blackboard/core/action/TextAction;ZLandroid/graphics/RectF;FFLjava/lang/String;)V

    .line 3
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/TextAction$handleTextEdit$1$3;->c:Lcom/zykj/blackboard/core/action/TextAction;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/zykj/blackboard/core/action/TextAction;->Q(Lcom/zykj/blackboard/core/action/TextAction;Z)V

    return-void
.end method
