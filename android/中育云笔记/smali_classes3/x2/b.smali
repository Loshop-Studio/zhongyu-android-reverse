.class public final synthetic Lx2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;


# instance fields
.field public final synthetic a:Lcom/friday/document/view/share/ShareBaseFileFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/document/view/share/ShareBaseFileFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx2/b;->a:Lcom/friday/document/view/share/ShareBaseFileFragment;

    return-void
.end method


# virtual methods
.method public final onRefresh()V
    .locals 1

    .line 1
    iget-object v0, p0, Lx2/b;->a:Lcom/friday/document/view/share/ShareBaseFileFragment;

    invoke-static {v0}, Lcom/friday/document/view/share/ShareBaseFileFragment;->v(Lcom/friday/document/view/share/ShareBaseFileFragment;)V

    return-void
.end method
