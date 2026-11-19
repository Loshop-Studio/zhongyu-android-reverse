.class public final synthetic Lcom/friday/paint/view/six/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Lcom/friday/paint/view/six/NewPaintFragment;

.field public final synthetic d:Ljava/lang/Integer;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/paint/view/six/NewPaintFragment;Ljava/lang/Integer;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/friday/paint/view/six/d;->c:Lcom/friday/paint/view/six/NewPaintFragment;

    iput-object p2, p0, Lcom/friday/paint/view/six/d;->d:Ljava/lang/Integer;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/friday/paint/view/six/d;->c:Lcom/friday/paint/view/six/NewPaintFragment;

    iget-object v1, p0, Lcom/friday/paint/view/six/d;->d:Ljava/lang/Integer;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, v1, p1}, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$4$1;->g(Lcom/friday/paint/view/six/NewPaintFragment;Ljava/lang/Integer;Ljava/lang/String;)Lqc/q;

    move-result-object p1

    return-object p1
.end method
