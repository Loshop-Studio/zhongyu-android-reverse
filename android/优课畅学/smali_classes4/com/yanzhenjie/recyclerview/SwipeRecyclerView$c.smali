.class public Lcom/yanzhenjie/recyclerview/SwipeRecyclerView$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly2/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field public a:Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;

.field public b:Ly2/c;


# direct methods
.method public constructor <init>(Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;Ly2/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView$c;->a:Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView$c;->b:Ly2/c;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView$c;->a:Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;->getHeaderCount()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    sub-int/2addr p2, v0

    .line 8
    if-ltz p2, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lcom/yanzhenjie/recyclerview/SwipeRecyclerView$c;->b:Ly2/c;

    .line 11
    .line 12
    invoke-interface {v0, p1, p2}, Ly2/c;->a(Landroid/view/View;I)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method
