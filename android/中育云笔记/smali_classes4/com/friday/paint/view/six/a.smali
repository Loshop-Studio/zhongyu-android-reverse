.class public final synthetic Lcom/friday/paint/view/six/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c:Lcom/friday/paint/view/six/NewPaintFragment;

.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(Lcom/friday/paint/view/six/NewPaintFragment;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/friday/paint/view/six/a;->c:Lcom/friday/paint/view/six/NewPaintFragment;

    iput p2, p0, Lcom/friday/paint/view/six/a;->d:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/friday/paint/view/six/a;->c:Lcom/friday/paint/view/six/NewPaintFragment;

    iget v1, p0, Lcom/friday/paint/view/six/a;->d:I

    invoke-static {v0, v1}, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->g(Lcom/friday/paint/view/six/NewPaintFragment;I)V

    return-void
.end method
