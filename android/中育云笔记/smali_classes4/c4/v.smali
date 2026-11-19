.class public final synthetic Lc4/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic c:Lcom/friday/paint/databinding/ItemPaintPenColorBinding;

.field public final synthetic d:Lcom/friday/paint/view/ThePaintFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/paint/databinding/ItemPaintPenColorBinding;Lcom/friday/paint/view/ThePaintFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc4/v;->c:Lcom/friday/paint/databinding/ItemPaintPenColorBinding;

    iput-object p2, p0, Lc4/v;->d:Lcom/friday/paint/view/ThePaintFragment;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lc4/v;->c:Lcom/friday/paint/databinding/ItemPaintPenColorBinding;

    iget-object v1, p0, Lc4/v;->d:Lcom/friday/paint/view/ThePaintFragment;

    invoke-static {v0, v1, p1}, Lcom/friday/paint/view/ThePaintFragment;->R(Lcom/friday/paint/databinding/ItemPaintPenColorBinding;Lcom/friday/paint/view/ThePaintFragment;Landroid/view/View;)V

    return-void
.end method
