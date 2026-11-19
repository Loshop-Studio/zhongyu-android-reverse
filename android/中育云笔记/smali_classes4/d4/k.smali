.class public final synthetic Ld4/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Landroid/view/View;

.field public final synthetic d:Lcom/friday/paint/view/six/NewPaintFragment;


# direct methods
.method public synthetic constructor <init>(Landroid/view/View;Lcom/friday/paint/view/six/NewPaintFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld4/k;->c:Landroid/view/View;

    iput-object p2, p0, Ld4/k;->d:Lcom/friday/paint/view/six/NewPaintFragment;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Ld4/k;->c:Landroid/view/View;

    iget-object v1, p0, Ld4/k;->d:Lcom/friday/paint/view/six/NewPaintFragment;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, v1, p1}, Lcom/friday/paint/view/six/NewPaintFragment;->a0(Landroid/view/View;Lcom/friday/paint/view/six/NewPaintFragment;Ljava/lang/String;)Lqc/q;

    move-result-object p1

    return-object p1
.end method
