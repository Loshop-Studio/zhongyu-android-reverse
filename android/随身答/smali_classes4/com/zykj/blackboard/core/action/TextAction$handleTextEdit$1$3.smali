.class final Lcom/zykj/blackboard/core/action/TextAction$handleTextEdit$1$3;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


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
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/String;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic a:Lcom/zykj/blackboard/core/action/TextAction;

.field public final synthetic b:Z

.field public final synthetic c:Lh5/d;

.field public final synthetic d:Landroid/graphics/PointF;


# direct methods
.method public constructor <init>(Lcom/zykj/blackboard/core/action/TextAction;ZLh5/d;Landroid/graphics/PointF;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/TextAction$handleTextEdit$1$3;->a:Lcom/zykj/blackboard/core/action/TextAction;

    .line 2
    .line 3
    iput-boolean p2, p0, Lcom/zykj/blackboard/core/action/TextAction$handleTextEdit$1$3;->b:Z

    .line 4
    .line 5
    iput-object p3, p0, Lcom/zykj/blackboard/core/action/TextAction$handleTextEdit$1$3;->c:Lh5/d;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/zykj/blackboard/core/action/TextAction$handleTextEdit$1$3;->d:Landroid/graphics/PointF;

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

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/lang/String;)V
    .locals 7

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/TextAction$handleTextEdit$1$3;->a:Lcom/zykj/blackboard/core/action/TextAction;

    iget-boolean v2, p0, Lcom/zykj/blackboard/core/action/TextAction$handleTextEdit$1$3;->b:Z

    iget-object v0, p0, Lcom/zykj/blackboard/core/action/TextAction$handleTextEdit$1$3;->c:Lh5/d;

    invoke-virtual {v0}, Lg5/a;->f()Landroid/graphics/RectF;

    move-result-object v3

    iget-object v0, p0, Lcom/zykj/blackboard/core/action/TextAction$handleTextEdit$1$3;->d:Landroid/graphics/PointF;

    iget v4, v0, Landroid/graphics/PointF;->x:F

    iget v5, v0, Landroid/graphics/PointF;->y:F

    move-object v6, p1

    invoke-static/range {v1 .. v6}, Lcom/zykj/blackboard/core/action/TextAction;->N(Lcom/zykj/blackboard/core/action/TextAction;ZLandroid/graphics/RectF;FFLjava/lang/String;)V

    .line 3
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/TextAction$handleTextEdit$1$3;->a:Lcom/zykj/blackboard/core/action/TextAction;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/zykj/blackboard/core/action/TextAction;->Q(Lcom/zykj/blackboard/core/action/TextAction;Z)V

    return-void
.end method
