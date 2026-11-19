.class public final Lcom/friday/document/view/share/StudentSharePreviewFragment$initData$$inlined$collectOnLifecycle$default$1$1$1$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/view/share/StudentSharePreviewFragment$initData$$inlined$collectOnLifecycle$default$1$1$1;->emit(Ljava/lang/Object;Lvc/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lxc/d;
    c = "com.friday.document.view.share.StudentSharePreviewFragment$initData$$inlined$collectOnLifecycle$default$1$1$1"
    f = "StudentSharePreviewFragment.kt"
    l = {
        0x24,
        0x39
    }
    m = "emit"
.end annotation


# instance fields
.field public synthetic c:Ljava/lang/Object;

.field public d:I

.field public final synthetic e:Lcom/friday/document/view/share/StudentSharePreviewFragment$initData$$inlined$collectOnLifecycle$default$1$1$1;

.field public f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;

.field public h:Ljava/lang/Object;

.field public i:Ljava/lang/Object;

.field public j:I


# direct methods
.method public constructor <init>(Lcom/friday/document/view/share/StudentSharePreviewFragment$initData$$inlined$collectOnLifecycle$default$1$1$1;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/view/share/StudentSharePreviewFragment$initData$$inlined$collectOnLifecycle$default$1$1$1$1;->e:Lcom/friday/document/view/share/StudentSharePreviewFragment$initData$$inlined$collectOnLifecycle$default$1$1$1;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lvc/c;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lcom/friday/document/view/share/StudentSharePreviewFragment$initData$$inlined$collectOnLifecycle$default$1$1$1$1;->c:Ljava/lang/Object;

    iget p1, p0, Lcom/friday/document/view/share/StudentSharePreviewFragment$initData$$inlined$collectOnLifecycle$default$1$1$1$1;->d:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/friday/document/view/share/StudentSharePreviewFragment$initData$$inlined$collectOnLifecycle$default$1$1$1$1;->d:I

    iget-object p1, p0, Lcom/friday/document/view/share/StudentSharePreviewFragment$initData$$inlined$collectOnLifecycle$default$1$1$1$1;->e:Lcom/friday/document/view/share/StudentSharePreviewFragment$initData$$inlined$collectOnLifecycle$default$1$1$1;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lcom/friday/document/view/share/StudentSharePreviewFragment$initData$$inlined$collectOnLifecycle$default$1$1$1;->emit(Ljava/lang/Object;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
