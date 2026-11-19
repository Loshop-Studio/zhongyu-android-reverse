.class public final synthetic Lt5/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lcom/zykj/view/board/simple/SimpleFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/view/board/simple/SimpleFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt5/d;->a:Lcom/zykj/view/board/simple/SimpleFragment;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lt5/d;->a:Lcom/zykj/view/board/simple/SimpleFragment;

    invoke-static {v0, p1}, Lcom/zykj/view/board/simple/SimpleFragment;->q(Lcom/zykj/view/board/simple/SimpleFragment;Landroid/view/View;)V

    return-void
.end method
