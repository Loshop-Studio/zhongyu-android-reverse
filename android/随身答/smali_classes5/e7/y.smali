.class public final synthetic Le7/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/zykj/view/board/play/SketchPlayFragment;

.field public final synthetic b:J


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/view/board/play/SketchPlayFragment;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le7/y;->a:Lcom/zykj/view/board/play/SketchPlayFragment;

    iput-wide p2, p0, Le7/y;->b:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Le7/y;->a:Lcom/zykj/view/board/play/SketchPlayFragment;

    iget-wide v1, p0, Le7/y;->b:J

    invoke-static {v0, v1, v2}, Lcom/zykj/view/board/play/SketchPlayFragment$g;->d(Lcom/zykj/view/board/play/SketchPlayFragment;J)V

    return-void
.end method
