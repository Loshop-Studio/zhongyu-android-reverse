.class final Lcom/zykj/blackboard/core/canvas/SketchRecorderView$ready$2$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/blackboard/core/canvas/SketchRecorderView;->ready$lambda-4(Lcom/zykj/blackboard/core/canvas/SketchRecorderView;Lr6/c;Lr6/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lr6/e;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "",
        "<anonymous parameter 0>",
        "",
        "<anonymous parameter 1>",
        "Ld6/s;",
        "invoke",
        "(ZJ)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# instance fields
.field final synthetic $callBack:Lr6/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr6/c;"
        }
    .end annotation
.end field

.field final synthetic $this_apply:Lcom/zykj/blackboard/core/edit/BoardControl;

.field final synthetic this$0:Lcom/zykj/blackboard/core/canvas/SketchRecorderView;


# direct methods
.method public constructor <init>(Lcom/zykj/blackboard/core/canvas/SketchRecorderView;Lr6/c;Lcom/zykj/blackboard/core/edit/BoardControl;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/blackboard/core/canvas/SketchRecorderView;",
            "Lr6/c;",
            "Lcom/zykj/blackboard/core/edit/BoardControl;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/blackboard/core/canvas/SketchRecorderView$ready$2$1$1;->this$0:Lcom/zykj/blackboard/core/canvas/SketchRecorderView;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/blackboard/core/canvas/SketchRecorderView$ready$2$1$1;->$callBack:Lr6/c;

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

.method public static synthetic a(Lcom/zykj/blackboard/core/edit/BoardControl;Lr6/c;)V
    .locals 0

    .line 1
    invoke-static {p1, p0}, Lcom/zykj/blackboard/core/canvas/SketchRecorderView$ready$2$1$1;->invoke$lambda-0(Lr6/c;Lcom/zykj/blackboard/core/edit/BoardControl;)V

    return-void
.end method

.method private static final invoke$lambda-0(Lr6/c;Lcom/zykj/blackboard/core/edit/BoardControl;)V
    .locals 1

    .line 1
    const-string v0, "$callBack"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$this_apply"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p0, p1}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

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

    sget-object p1, Ld6/s;->a:Ld6/s;

    return-object p1
.end method

.method public final invoke(ZJ)V
    .locals 1

    .line 2
    iget-object p1, p0, Lcom/zykj/blackboard/core/canvas/SketchRecorderView$ready$2$1$1;->this$0:Lcom/zykj/blackboard/core/canvas/SketchRecorderView;

    iget-object p2, p0, Lcom/zykj/blackboard/core/canvas/SketchRecorderView$ready$2$1$1;->$callBack:Lr6/c;

    iget-object p3, p0, Lcom/zykj/blackboard/core/canvas/SketchRecorderView$ready$2$1$1;->$this_apply:Lcom/zykj/blackboard/core/edit/BoardControl;

    new-instance v0, Lcom/zykj/blackboard/core/canvas/c;

    invoke-direct {v0, p3, p2}, Lcom/zykj/blackboard/core/canvas/c;-><init>(Lcom/zykj/blackboard/core/edit/BoardControl;Lr6/c;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
