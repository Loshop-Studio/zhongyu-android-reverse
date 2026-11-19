.class public final Lcom/zykj/view/ui/camera/ImagePickFragment$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/view/ui/camera/ImagePickFragment;->j()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroid/view/View;

.field public final synthetic b:Lcom/zykj/view/ui/camera/ImagePickFragment;


# direct methods
.method public constructor <init>(Landroid/view/View;Lcom/zykj/view/ui/camera/ImagePickFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/view/ui/camera/ImagePickFragment$b;->a:Landroid/view/View;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/view/ui/camera/ImagePickFragment$b;->b:Lcom/zykj/view/ui/camera/ImagePickFragment;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/view/ui/camera/ImagePickFragment$b;->a:Landroid/view/View;

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
    iget-object v0, p0, Lcom/zykj/view/ui/camera/ImagePickFragment$b;->a:Landroid/view/View;

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
    iget-object v0, p0, Lcom/zykj/view/ui/camera/ImagePickFragment$b;->a:Landroid/view/View;

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
    iget-object v0, p0, Lcom/zykj/view/ui/camera/ImagePickFragment$b;->b:Lcom/zykj/view/ui/camera/ImagePickFragment;

    .line 27
    .line 28
    invoke-static {v0}, Lcom/zykj/view/ui/camera/ImagePickFragment;->i(Lcom/zykj/view/ui/camera/ImagePickFragment;)Lcom/zykj/view/databinding/ViewFragmentImagePickBinding;

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
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const/4 v0, 0x0

    .line 40
    :cond_0
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentImagePickBinding;->f:Landroidx/camera/view/PreviewView;

    .line 41
    .line 42
    new-instance v1, Lcom/zykj/view/ui/camera/ImagePickFragment$c;

    .line 43
    .line 44
    iget-object v2, p0, Lcom/zykj/view/ui/camera/ImagePickFragment$b;->b:Lcom/zykj/view/ui/camera/ImagePickFragment;

    .line 45
    .line 46
    invoke-direct {v1, v2}, Lcom/zykj/view/ui/camera/ImagePickFragment$c;-><init>(Lcom/zykj/view/ui/camera/ImagePickFragment;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 50
    .line 51
    .line 52
    :cond_1
    return-void
.end method
