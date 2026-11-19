.class public final synthetic Lp5/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lcom/zykj/view/board/board/BoardFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/view/board/board/BoardFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp5/m;->a:Lcom/zykj/view/board/board/BoardFragment;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lp5/m;->a:Lcom/zykj/view/board/board/BoardFragment;

    invoke-static {v0, p1}, Lcom/zykj/view/board/board/BoardFragment;->n(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V

    return-void
.end method
