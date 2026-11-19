.class public final Lcom/zykj/view/ui/camera/ImagePickFragment$bindCameraUseCases$$inlined$afterMeasured$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/view/ui/camera/ImagePickFragment;->bindCameraUseCases()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005\u00b8\u0006\u0000"
    }
    d2 = {
        "com/zykj/view/ui/camera/ImagePickFragmentKt$afterMeasured$1",
        "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;",
        "Ld6/s;",
        "onGlobalLayout",
        "()V",
        "view_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nImagePickFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImagePickFragment.kt\ncom/zykj/view/ui/camera/ImagePickFragmentKt$afterMeasured$1\n+ 2 ImagePickFragment.kt\ncom/zykj/view/ui/camera/ImagePickFragment\n*L\n1#1,284:1\n236#2:285\n264#2:286\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $this_afterMeasured:Landroid/view/View;

.field final synthetic this$0:Lcom/zykj/view/ui/camera/ImagePickFragment;


# direct methods
.method public constructor <init>(Landroid/view/View;Lcom/zykj/view/ui/camera/ImagePickFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/view/ui/camera/ImagePickFragment$bindCameraUseCases$$inlined$afterMeasured$1;->$this_afterMeasured:Landroid/view/View;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/view/ui/camera/ImagePickFragment$bindCameraUseCases$$inlined$afterMeasured$1;->this$0:Lcom/zykj/view/ui/camera/ImagePickFragment;

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
    iget-object v0, p0, Lcom/zykj/view/ui/camera/ImagePickFragment$bindCameraUseCases$$inlined$afterMeasured$1;->$this_afterMeasured:Landroid/view/View;

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
    iget-object v0, p0, Lcom/zykj/view/ui/camera/ImagePickFragment$bindCameraUseCases$$inlined$afterMeasured$1;->$this_afterMeasured:Landroid/view/View;

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
    iget-object v0, p0, Lcom/zykj/view/ui/camera/ImagePickFragment$bindCameraUseCases$$inlined$afterMeasured$1;->$this_afterMeasured:Landroid/view/View;

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
    iget-object v0, p0, Lcom/zykj/view/ui/camera/ImagePickFragment$bindCameraUseCases$$inlined$afterMeasured$1;->this$0:Lcom/zykj/view/ui/camera/ImagePickFragment;

    .line 27
    .line 28
    invoke-static {v0}, Lcom/zykj/view/ui/camera/ImagePickFragment;->access$getMBindView$p(Lcom/zykj/view/ui/camera/ImagePickFragment;)Lcom/zykj/view/databinding/ViewFragmentImagePickBinding;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    if-eqz v0, :cond_0

    .line 33
    .line 34
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentImagePickBinding;->prevView:Landroidx/camera/view/PreviewView;

    .line 35
    .line 36
    new-instance v1, Lcom/zykj/view/ui/camera/ImagePickFragment$bindCameraUseCases$2$1;

    .line 37
    .line 38
    iget-object v2, p0, Lcom/zykj/view/ui/camera/ImagePickFragment$bindCameraUseCases$$inlined$afterMeasured$1;->this$0:Lcom/zykj/view/ui/camera/ImagePickFragment;

    .line 39
    .line 40
    invoke-direct {v1, v2}, Lcom/zykj/view/ui/camera/ImagePickFragment$bindCameraUseCases$2$1;-><init>(Lcom/zykj/view/ui/camera/ImagePickFragment;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_0
    const-string v0, "mBindView"

    .line 48
    .line 49
    invoke-static {v0}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    const/4 v0, 0x0

    .line 53
    throw v0

    .line 54
    :cond_1
    return-void
.end method
