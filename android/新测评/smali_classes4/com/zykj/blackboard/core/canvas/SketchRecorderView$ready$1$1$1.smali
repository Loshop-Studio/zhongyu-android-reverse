.class final Lcom/zykj/blackboard/core/canvas/SketchRecorderView$ready$1$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/blackboard/core/canvas/SketchRecorderView;->c(Lcom/zykj/blackboard/core/canvas/SketchRecorderView;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Ljava/lang/Boolean;",
        "Ljava/lang/Long;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n\u00a2\u0006\u0002\u0008\u0006"
    }
    d2 = {
        "<anonymous>",
        "",
        "haveCache",
        "",
        "duration",
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
.field public final synthetic a:Lcom/zykj/blackboard/core/canvas/SketchRecorderView;

.field public final synthetic b:Lkotlin/jvm/functions/Function3;

.field public final synthetic c:Lcom/zykj/blackboard/core/edit/BoardControl;


# direct methods
.method public constructor <init>(Lcom/zykj/blackboard/core/canvas/SketchRecorderView;Lkotlin/jvm/functions/Function3;Lcom/zykj/blackboard/core/edit/BoardControl;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/blackboard/core/canvas/SketchRecorderView$ready$1$1$1;->a:Lcom/zykj/blackboard/core/canvas/SketchRecorderView;

    iput-object p2, p0, Lcom/zykj/blackboard/core/canvas/SketchRecorderView$ready$1$1$1;->b:Lkotlin/jvm/functions/Function3;

    iput-object p3, p0, Lcom/zykj/blackboard/core/canvas/SketchRecorderView$ready$1$1$1;->c:Lcom/zykj/blackboard/core/edit/BoardControl;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function3;Lcom/zykj/blackboard/core/edit/BoardControl;ZJ)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/zykj/blackboard/core/canvas/SketchRecorderView$ready$1$1$1;->f(Lkotlin/jvm/functions/Function3;Lcom/zykj/blackboard/core/edit/BoardControl;ZJ)V

    return-void
.end method

.method public static final f(Lkotlin/jvm/functions/Function3;Lcom/zykj/blackboard/core/edit/BoardControl;ZJ)V
    .locals 1

    .line 1
    const-string v0, "$success"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$this_apply"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 16
    .line 17
    .line 18
    move-result-object p3

    .line 19
    invoke-interface {p0, p1, p2, p3}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-virtual {p0, p1, v0, v1}, Lcom/zykj/blackboard/core/canvas/SketchRecorderView$ready$1$1$1;->invoke(ZJ)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(ZJ)V
    .locals 7

    .line 2
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/SketchRecorderView$ready$1$1$1;->a:Lcom/zykj/blackboard/core/canvas/SketchRecorderView;

    iget-object v2, p0, Lcom/zykj/blackboard/core/canvas/SketchRecorderView$ready$1$1$1;->b:Lkotlin/jvm/functions/Function3;

    iget-object v3, p0, Lcom/zykj/blackboard/core/canvas/SketchRecorderView$ready$1$1$1;->c:Lcom/zykj/blackboard/core/edit/BoardControl;

    new-instance v1, Lcom/zykj/blackboard/core/canvas/a;

    move v4, p1

    move-wide v5, p2

    invoke-direct/range {v1 .. v6}, Lcom/zykj/blackboard/core/canvas/a;-><init>(Lkotlin/jvm/functions/Function3;Lcom/zykj/blackboard/core/edit/BoardControl;ZJ)V

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
