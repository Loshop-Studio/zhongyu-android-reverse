.class final Lcom/zykj/blackboard/core/canvas/SketchRecorderView$ready$2$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/blackboard/core/canvas/SketchRecorderView;->ready$lambda-4(Lcom/zykj/blackboard/core/canvas/SketchRecorderView;Lx7/l;Lx7/l;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lx7/p;"
    }
.end annotation


# instance fields
.field final synthetic $callBack:Lx7/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx7/l;"
        }
    .end annotation
.end field

.field final synthetic $this_apply:Lcom/zykj/blackboard/core/edit/BoardControl;

.field final synthetic this$0:Lcom/zykj/blackboard/core/canvas/SketchRecorderView;


# direct methods
.method public constructor <init>(Lcom/zykj/blackboard/core/canvas/SketchRecorderView;Lx7/l;Lcom/zykj/blackboard/core/edit/BoardControl;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/blackboard/core/canvas/SketchRecorderView;",
            "Lx7/l;",
            "Lcom/zykj/blackboard/core/edit/BoardControl;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/blackboard/core/canvas/SketchRecorderView$ready$2$1$1;->this$0:Lcom/zykj/blackboard/core/canvas/SketchRecorderView;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/blackboard/core/canvas/SketchRecorderView$ready$2$1$1;->$callBack:Lx7/l;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/zykj/blackboard/core/canvas/SketchRecorderView$ready$2$1$1;->$this_apply:Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public static synthetic a(Lx7/l;Lcom/zykj/blackboard/core/edit/BoardControl;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/blackboard/core/canvas/SketchRecorderView$ready$2$1$1;->invoke$lambda-0(Lx7/l;Lcom/zykj/blackboard/core/edit/BoardControl;)V

    return-void
.end method

.method private static final invoke$lambda-0(Lx7/l;Lcom/zykj/blackboard/core/edit/BoardControl;)V
    .locals 1

    .line 1
    const-string v0, "$callBack"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$this_apply"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p0, p1}, Lx7/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
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

    invoke-virtual {p0, p1, v0, v1}, Lcom/zykj/blackboard/core/canvas/SketchRecorderView$ready$2$1$1;->invoke(ZJ)V

    sget-object p1, Lh7/p;->a:Lh7/p;

    return-object p1
.end method

.method public final invoke(ZJ)V
    .locals 1

    .line 2
    iget-object p1, p0, Lcom/zykj/blackboard/core/canvas/SketchRecorderView$ready$2$1$1;->this$0:Lcom/zykj/blackboard/core/canvas/SketchRecorderView;

    iget-object p2, p0, Lcom/zykj/blackboard/core/canvas/SketchRecorderView$ready$2$1$1;->$callBack:Lx7/l;

    iget-object p3, p0, Lcom/zykj/blackboard/core/canvas/SketchRecorderView$ready$2$1$1;->$this_apply:Lcom/zykj/blackboard/core/edit/BoardControl;

    new-instance v0, Lcom/zykj/blackboard/core/canvas/f;

    invoke-direct {v0, p2, p3}, Lcom/zykj/blackboard/core/canvas/f;-><init>(Lx7/l;Lcom/zykj/blackboard/core/edit/BoardControl;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
