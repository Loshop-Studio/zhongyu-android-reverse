.class public abstract La1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lcom/chad/library/adapter/base/BaseQuickAdapter;

.field public b:Z

.field public final c:Landroidx/recyclerview/widget/ItemTouchHelper;

.field public final d:Lcom/chad/library/adapter/base/dragswipe/DragAndSwipeCallback;

.field public e:Lq4/f;


# direct methods
.method public constructor <init>(Lcom/chad/library/adapter/base/BaseQuickAdapter;)V
    .locals 1

    .line 1
    const-string v0, "baseQuickAdapter"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, La1/a;->a:Lcom/chad/library/adapter/base/BaseQuickAdapter;

    .line 10
    .line 11
    new-instance p1, Lcom/chad/library/adapter/base/dragswipe/DragAndSwipeCallback;

    .line 12
    .line 13
    invoke-direct {p1}, Landroidx/recyclerview/widget/ItemTouchHelper$Callback;-><init>()V

    .line 14
    .line 15
    .line 16
    const v0, 0x3dcccccd    # 0.1f

    .line 17
    .line 18
    .line 19
    iput v0, p1, Lcom/chad/library/adapter/base/dragswipe/DragAndSwipeCallback;->b:F

    .line 20
    .line 21
    const v0, 0x3f333333    # 0.7f

    .line 22
    .line 23
    .line 24
    iput v0, p1, Lcom/chad/library/adapter/base/dragswipe/DragAndSwipeCallback;->c:F

    .line 25
    .line 26
    const/16 v0, 0xf

    .line 27
    .line 28
    iput v0, p1, Lcom/chad/library/adapter/base/dragswipe/DragAndSwipeCallback;->d:I

    .line 29
    .line 30
    const/16 v0, 0x20

    .line 31
    .line 32
    iput v0, p1, Lcom/chad/library/adapter/base/dragswipe/DragAndSwipeCallback;->e:I

    .line 33
    .line 34
    move-object v0, p0

    .line 35
    check-cast v0, Lf5/a;

    .line 36
    .line 37
    iput-object v0, p1, Lcom/chad/library/adapter/base/dragswipe/DragAndSwipeCallback;->a:Lf5/a;

    .line 38
    .line 39
    iput-object p1, p0, La1/a;->d:Lcom/chad/library/adapter/base/dragswipe/DragAndSwipeCallback;

    .line 40
    .line 41
    new-instance v0, Landroidx/recyclerview/widget/ItemTouchHelper;

    .line 42
    .line 43
    invoke-direct {v0, p1}, Landroidx/recyclerview/widget/ItemTouchHelper;-><init>(Landroidx/recyclerview/widget/ItemTouchHelper$Callback;)V

    .line 44
    .line 45
    .line 46
    iput-object v0, p0, La1/a;->c:Landroidx/recyclerview/widget/ItemTouchHelper;

    .line 47
    .line 48
    return-void
.end method
