.class public final synthetic Lcom/friday/paint/view/six/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Lcom/friday/paint/view/six/NewPaintFragment;

.field public final synthetic d:Lhd/l;

.field public final synthetic e:Lcom/zykj/view/board/board/BoardFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/paint/view/six/NewPaintFragment;Lhd/l;Lcom/zykj/view/board/board/BoardFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/friday/paint/view/six/h;->c:Lcom/friday/paint/view/six/NewPaintFragment;

    iput-object p2, p0, Lcom/friday/paint/view/six/h;->d:Lhd/l;

    iput-object p3, p0, Lcom/friday/paint/view/six/h;->e:Lcom/zykj/view/board/board/BoardFragment;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/friday/paint/view/six/h;->c:Lcom/friday/paint/view/six/NewPaintFragment;

    iget-object v1, p0, Lcom/friday/paint/view/six/h;->d:Lhd/l;

    iget-object v2, p0, Lcom/friday/paint/view/six/h;->e:Lcom/zykj/view/board/board/BoardFragment;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, v1, v2, p1}, Lcom/friday/paint/view/six/NewPaintFragment$save$2;->g(Lcom/friday/paint/view/six/NewPaintFragment;Lhd/l;Lcom/zykj/view/board/board/BoardFragment;Ljava/lang/String;)Lqc/q;

    move-result-object p1

    return-object p1
.end method
