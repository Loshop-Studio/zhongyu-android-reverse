.class public Lcom/luck/picture/lib/widget/SlideSelectTouchListener$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/luck/picture/lib/widget/SlideSelectTouchListener;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic c:Lcom/luck/picture/lib/widget/SlideSelectTouchListener;


# direct methods
.method public constructor <init>(Lcom/luck/picture/lib/widget/SlideSelectTouchListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener$a;->c:Lcom/luck/picture/lib/widget/SlideSelectTouchListener;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener$a;->c:Lcom/luck/picture/lib/widget/SlideSelectTouchListener;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->a(Lcom/luck/picture/lib/widget/SlideSelectTouchListener;)Landroid/widget/OverScroller;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener$a;->c:Lcom/luck/picture/lib/widget/SlideSelectTouchListener;

    .line 10
    .line 11
    invoke-static {v0}, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->a(Lcom/luck/picture/lib/widget/SlideSelectTouchListener;)Landroid/widget/OverScroller;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Landroid/widget/OverScroller;->computeScrollOffset()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    iget-object v0, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener$a;->c:Lcom/luck/picture/lib/widget/SlideSelectTouchListener;

    .line 22
    .line 23
    invoke-static {v0}, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->b(Lcom/luck/picture/lib/widget/SlideSelectTouchListener;)I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    invoke-static {v0, v1}, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->c(Lcom/luck/picture/lib/widget/SlideSelectTouchListener;I)V

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener$a;->c:Lcom/luck/picture/lib/widget/SlideSelectTouchListener;

    .line 31
    .line 32
    invoke-static {v0}, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->d(Lcom/luck/picture/lib/widget/SlideSelectTouchListener;)Landroidx/recyclerview/widget/RecyclerView;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iget-object v1, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener$a;->c:Lcom/luck/picture/lib/widget/SlideSelectTouchListener;

    .line 37
    .line 38
    invoke-static {v1}, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->e(Lcom/luck/picture/lib/widget/SlideSelectTouchListener;)Ljava/lang/Runnable;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-static {v0, v1}, Landroidx/core/view/ViewCompat;->postOnAnimation(Landroid/view/View;Ljava/lang/Runnable;)V

    .line 43
    .line 44
    .line 45
    :cond_0
    return-void
.end method
