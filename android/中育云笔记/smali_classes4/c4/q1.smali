.class public final synthetic Lc4/q1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/Observer;


# instance fields
.field public final synthetic c:Lcom/friday/paint/view/TheSketchFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/paint/view/TheSketchFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc4/q1;->c:Lcom/friday/paint/view/TheSketchFragment;

    return-void
.end method


# virtual methods
.method public final onChanged(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc4/q1;->c:Lcom/friday/paint/view/TheSketchFragment;

    invoke-static {v0, p1}, Lcom/friday/paint/view/TheSketchFragment;->A(Lcom/friday/paint/view/TheSketchFragment;Ljava/lang/Object;)V

    return-void
.end method
