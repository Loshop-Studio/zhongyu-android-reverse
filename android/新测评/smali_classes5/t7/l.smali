.class public final synthetic Lt7/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lcom/zykj/view/board/play/SketchPlayFragment;

.field public final synthetic b:Z

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:I

.field public final synthetic e:Lkotlin/jvm/functions/Function1;

.field public final synthetic f:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/view/board/play/SketchPlayFragment;ZLjava/lang/String;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt7/l;->a:Lcom/zykj/view/board/play/SketchPlayFragment;

    iput-boolean p2, p0, Lt7/l;->b:Z

    iput-object p3, p0, Lt7/l;->c:Ljava/lang/String;

    iput p4, p0, Lt7/l;->d:I

    iput-object p5, p0, Lt7/l;->e:Lkotlin/jvm/functions/Function1;

    iput-object p6, p0, Lt7/l;->f:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, Lt7/l;->a:Lcom/zykj/view/board/play/SketchPlayFragment;

    iget-boolean v1, p0, Lt7/l;->b:Z

    iget-object v2, p0, Lt7/l;->c:Ljava/lang/String;

    iget v3, p0, Lt7/l;->d:I

    iget-object v4, p0, Lt7/l;->e:Lkotlin/jvm/functions/Function1;

    iget-object v5, p0, Lt7/l;->f:Lkotlin/jvm/functions/Function1;

    invoke-static/range {v0 .. v5}, Lcom/zykj/view/board/play/SketchPlayFragment;->g(Lcom/zykj/view/board/play/SketchPlayFragment;ZLjava/lang/String;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
