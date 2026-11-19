.class public final synthetic Lnb/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Lcom/zykj/view/board/play/SketchPlayFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/view/board/play/SketchPlayFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnb/k;->c:Lcom/zykj/view/board/play/SketchPlayFragment;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lnb/k;->c:Lcom/zykj/view/board/play/SketchPlayFragment;

    check-cast p1, Ljava/lang/Double;

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/zykj/view/board/play/SketchPlayFragment;->y(Lcom/zykj/view/board/play/SketchPlayFragment;D)Lqc/q;

    move-result-object p1

    return-object p1
.end method
