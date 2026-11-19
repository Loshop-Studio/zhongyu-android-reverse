.class public final Lcom/friday/common/camera/ImagePickFragment$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/common/camera/ImagePickFragment;->D()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic c:Landroid/view/View;

.field public final synthetic d:Lcom/friday/common/camera/ImagePickFragment;

.field public final synthetic e:Landroid/view/ScaleGestureDetector;


# direct methods
.method public constructor <init>(Landroid/view/View;Lcom/friday/common/camera/ImagePickFragment;Landroid/view/ScaleGestureDetector;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/common/camera/ImagePickFragment$b;->c:Landroid/view/View;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/common/camera/ImagePickFragment$b;->d:Lcom/friday/common/camera/ImagePickFragment;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/friday/common/camera/ImagePickFragment$b;->e:Landroid/view/ScaleGestureDetector;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/friday/common/camera/ImagePickFragment$b;->c:Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-lez v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Lcom/friday/common/camera/ImagePickFragment$b;->c:Landroid/view/View;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-lez v0, :cond_1

    .line 16
    .line 17
    iget-object v0, p0, Lcom/friday/common/camera/ImagePickFragment$b;->c:Landroid/view/View;

    .line 18
    .line 19
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lcom/friday/common/camera/ImagePickFragment$b;->d:Lcom/friday/common/camera/ImagePickFragment;

    .line 27
    .line 28
    invoke-static {v0}, Lcom/friday/common/camera/ImagePickFragment;->z(Lcom/friday/common/camera/ImagePickFragment;)Lcom/friday/common/databinding/FragmentImagePickBinding;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    if-nez v0, :cond_0

    .line 33
    .line 34
    const-string v0, "mBindView"

    .line 35
    .line 36
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const/4 v0, 0x0

    .line 40
    :cond_0
    iget-object v0, v0, Lcom/friday/common/databinding/FragmentImagePickBinding;->j:Landroidx/camera/view/PreviewView;

    .line 41
    .line 42
    new-instance v1, Lcom/friday/common/camera/ImagePickFragment$c;

    .line 43
    .line 44
    iget-object v2, p0, Lcom/friday/common/camera/ImagePickFragment$b;->d:Lcom/friday/common/camera/ImagePickFragment;

    .line 45
    .line 46
    iget-object v3, p0, Lcom/friday/common/camera/ImagePickFragment$b;->e:Landroid/view/ScaleGestureDetector;

    .line 47
    .line 48
    invoke-direct {v1, v2, v3}, Lcom/friday/common/camera/ImagePickFragment$c;-><init>(Lcom/friday/common/camera/ImagePickFragment;Landroid/view/ScaleGestureDetector;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 52
    .line 53
    .line 54
    :cond_1
    return-void
.end method
