.class public final Lcom/friday/document/view/share/ShareBaseFileFragment$initObserver$$inlined$collectOnLifecycle$default$3$1$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lvd/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/view/share/ShareBaseFileFragment$initObserver$$inlined$collectOnLifecycle$default$3$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic c:Lcom/friday/document/view/share/ShareBaseFileFragment;


# direct methods
.method public constructor <init>(Lcom/friday/document/view/share/ShareBaseFileFragment;)V
    .locals 0

    iput-object p1, p0, Lcom/friday/document/view/share/ShareBaseFileFragment$initObserver$$inlined$collectOnLifecycle$default$3$1$a;->c:Lcom/friday/document/view/share/ShareBaseFileFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lvc/c;)Ljava/lang/Object;
    .locals 9

    .line 1
    check-cast p1, Lcom/friday/document/model/ShareFile;

    .line 2
    .line 3
    iget-object p2, p0, Lcom/friday/document/view/share/ShareBaseFileFragment$initObserver$$inlined$collectOnLifecycle$default$3$1$a;->c:Lcom/friday/document/view/share/ShareBaseFileFragment;

    .line 4
    .line 5
    invoke-static {p2, p1}, Lcom/friday/document/view/share/ShareBaseFileFragment;->A(Lcom/friday/document/view/share/ShareBaseFileFragment;Lcom/friday/document/model/ShareFile;)V

    .line 6
    .line 7
    .line 8
    iget-object p2, p0, Lcom/friday/document/view/share/ShareBaseFileFragment$initObserver$$inlined$collectOnLifecycle$default$3$1$a;->c:Lcom/friday/document/view/share/ShareBaseFileFragment;

    .line 9
    .line 10
    invoke-static {p2}, Lcom/friday/document/view/share/ShareBaseFileFragment;->w(Lcom/friday/document/view/share/ShareBaseFileFragment;)Lcom/friday/document/databinding/FragmentShareFileBinding;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    iget-object p2, p2, Lcom/friday/document/databinding/FragmentShareFileBinding;->e:Landroid/widget/ImageView;

    .line 15
    .line 16
    const-string v0, "ivMore"

    .line 17
    .line 18
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    const/4 v1, 0x1

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move v1, v0

    .line 27
    :goto_0
    if-eqz v1, :cond_1

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    const/16 v0, 0x8

    .line 31
    .line 32
    :goto_1
    invoke-virtual {p2, v0}, Landroid/view/View;->setVisibility(I)V

    .line 33
    .line 34
    .line 35
    if-eqz p1, :cond_2

    .line 36
    .line 37
    iget-object p2, p0, Lcom/friday/document/view/share/ShareBaseFileFragment$initObserver$$inlined$collectOnLifecycle$default$3$1$a;->c:Lcom/friday/document/view/share/ShareBaseFileFragment;

    .line 38
    .line 39
    invoke-virtual {p2}, Lcom/friday/document/view/share/ShareBaseFileFragment;->E()Lcom/friday/document/viewmodel/ShareFileViewModel;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {p1}, Lcom/friday/document/model/ShareFile;->getFileId()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-virtual {p1}, Lcom/friday/document/model/ShareFile;->getOwnerId()J

    .line 48
    .line 49
    .line 50
    move-result-wide v2

    .line 51
    invoke-virtual {p1}, Lcom/friday/document/model/ShareFile;->getShareTime()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    invoke-virtual {p1}, Lcom/friday/document/model/ShareFile;->getOwnerName()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    const/16 v7, 0x10

    .line 60
    .line 61
    const/4 v8, 0x0

    .line 62
    const/4 v6, 0x0

    .line 63
    invoke-static/range {v0 .. v8}, Lcom/friday/document/viewmodel/ShareFileViewModel;->Q(Lcom/friday/document/viewmodel/ShareFileViewModel;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_2
    iget-object p1, p0, Lcom/friday/document/view/share/ShareBaseFileFragment$initObserver$$inlined$collectOnLifecycle$default$3$1$a;->c:Lcom/friday/document/view/share/ShareBaseFileFragment;

    .line 68
    .line 69
    invoke-virtual {p1}, Lcom/friday/document/view/share/ShareBaseFileFragment;->H()V

    .line 70
    .line 71
    .line 72
    :goto_2
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 73
    .line 74
    return-object p1
.end method
