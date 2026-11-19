.class public final synthetic Lw2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;


# instance fields
.field public final synthetic a:Lcom/friday/document/view/preview/NotePreviewFragment;

.field public final synthetic b:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/document/view/preview/NotePreviewFragment;Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw2/d;->a:Lcom/friday/document/view/preview/NotePreviewFragment;

    iput-object p2, p0, Lw2/d;->b:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    return-void
.end method


# virtual methods
.method public final onRefresh()V
    .locals 2

    .line 1
    iget-object v0, p0, Lw2/d;->a:Lcom/friday/document/view/preview/NotePreviewFragment;

    iget-object v1, p0, Lw2/d;->b:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    invoke-static {v0, v1}, Lcom/friday/document/view/preview/NotePreviewFragment;->q(Lcom/friday/document/view/preview/NotePreviewFragment;Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;)V

    return-void
.end method
