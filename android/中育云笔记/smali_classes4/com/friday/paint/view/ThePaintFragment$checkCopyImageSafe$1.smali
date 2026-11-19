.class final Lcom/friday/paint/view/ThePaintFragment$checkCopyImageSafe$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/paint/view/ThePaintFragment;->p0(Ljava/lang/String;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lxc/d;
    c = "com.friday.paint.view.ThePaintFragment"
    f = "ThePaintFragment.kt"
    l = {
        0x28e,
        0x28f,
        0x298
    }
    m = "checkCopyImageSafe"
.end annotation


# instance fields
.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;

.field public h:Ljava/lang/Object;

.field public i:Ljava/lang/Object;

.field public j:Ljava/lang/Object;

.field public k:I

.field public l:I

.field public synthetic m:Ljava/lang/Object;

.field public final synthetic n:Lcom/friday/paint/view/ThePaintFragment;

.field public o:I


# direct methods
.method public constructor <init>(Lcom/friday/paint/view/ThePaintFragment;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/paint/view/ThePaintFragment$checkCopyImageSafe$1;->n:Lcom/friday/paint/view/ThePaintFragment;

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

    iput-object p1, p0, Lcom/friday/paint/view/ThePaintFragment$checkCopyImageSafe$1;->m:Ljava/lang/Object;

    iget p1, p0, Lcom/friday/paint/view/ThePaintFragment$checkCopyImageSafe$1;->o:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/friday/paint/view/ThePaintFragment$checkCopyImageSafe$1;->o:I

    iget-object p1, p0, Lcom/friday/paint/view/ThePaintFragment$checkCopyImageSafe$1;->n:Lcom/friday/paint/view/ThePaintFragment;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0, p0}, Lcom/friday/paint/view/ThePaintFragment;->c0(Lcom/friday/paint/view/ThePaintFragment;Ljava/lang/String;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
