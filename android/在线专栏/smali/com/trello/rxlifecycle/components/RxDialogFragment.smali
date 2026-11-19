.class public abstract Lcom/trello/rxlifecycle/components/RxDialogFragment;
.super Landroid/app/DialogFragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/app/DialogFragment;"
    }
.end annotation


# instance fields
.field private final a:Lrx/subjects/BehaviorSubject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lrx/subjects/BehaviorSubject<",
            "Lu1/b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroid/app/DialogFragment;-><init>()V

    .line 2
    invoke-static {}, Lrx/subjects/BehaviorSubject;->create()Lrx/subjects/BehaviorSubject;

    move-result-object v0

    iput-object v0, p0, Lcom/trello/rxlifecycle/components/RxDialogFragment;->a:Lrx/subjects/BehaviorSubject;

    return-void
.end method


# virtual methods
.method public onAttach(Landroid/app/Activity;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/app/DialogFragment;->onAttach(Landroid/app/Activity;)V

    .line 2
    iget-object p1, p0, Lcom/trello/rxlifecycle/components/RxDialogFragment;->a:Lrx/subjects/BehaviorSubject;

    sget-object v0, Lu1/b;->a:Lu1/b;

    invoke-virtual {p1, v0}, Lrx/subjects/BehaviorSubject;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/app/DialogFragment;->onCreate(Landroid/os/Bundle;)V

    .line 2
    iget-object p1, p0, Lcom/trello/rxlifecycle/components/RxDialogFragment;->a:Lrx/subjects/BehaviorSubject;

    sget-object v0, Lu1/b;->b:Lu1/b;

    invoke-virtual {p1, v0}, Lrx/subjects/BehaviorSubject;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/trello/rxlifecycle/components/RxDialogFragment;->a:Lrx/subjects/BehaviorSubject;

    sget-object v1, Lu1/b;->i:Lu1/b;

    invoke-virtual {v0, v1}, Lrx/subjects/BehaviorSubject;->onNext(Ljava/lang/Object;)V

    .line 2
    invoke-super {p0}, Landroid/app/DialogFragment;->onDestroy()V

    return-void
.end method

.method public onDestroyView()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/trello/rxlifecycle/components/RxDialogFragment;->a:Lrx/subjects/BehaviorSubject;

    sget-object v1, Lu1/b;->h:Lu1/b;

    invoke-virtual {v0, v1}, Lrx/subjects/BehaviorSubject;->onNext(Ljava/lang/Object;)V

    .line 2
    invoke-super {p0}, Landroid/app/DialogFragment;->onDestroyView()V

    return-void
.end method

.method public onDetach()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/trello/rxlifecycle/components/RxDialogFragment;->a:Lrx/subjects/BehaviorSubject;

    sget-object v1, Lu1/b;->j:Lu1/b;

    invoke-virtual {v0, v1}, Lrx/subjects/BehaviorSubject;->onNext(Ljava/lang/Object;)V

    .line 2
    invoke-super {p0}, Landroid/app/DialogFragment;->onDetach()V

    return-void
.end method

.method public onPause()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/trello/rxlifecycle/components/RxDialogFragment;->a:Lrx/subjects/BehaviorSubject;

    sget-object v1, Lu1/b;->f:Lu1/b;

    invoke-virtual {v0, v1}, Lrx/subjects/BehaviorSubject;->onNext(Ljava/lang/Object;)V

    .line 2
    invoke-super {p0}, Landroid/app/DialogFragment;->onPause()V

    return-void
.end method

.method public onResume()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/app/DialogFragment;->onResume()V

    .line 2
    iget-object v0, p0, Lcom/trello/rxlifecycle/components/RxDialogFragment;->a:Lrx/subjects/BehaviorSubject;

    sget-object v1, Lu1/b;->e:Lu1/b;

    invoke-virtual {v0, v1}, Lrx/subjects/BehaviorSubject;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method public onStart()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/app/DialogFragment;->onStart()V

    .line 2
    iget-object v0, p0, Lcom/trello/rxlifecycle/components/RxDialogFragment;->a:Lrx/subjects/BehaviorSubject;

    sget-object v1, Lu1/b;->d:Lu1/b;

    invoke-virtual {v0, v1}, Lrx/subjects/BehaviorSubject;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method public onStop()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/trello/rxlifecycle/components/RxDialogFragment;->a:Lrx/subjects/BehaviorSubject;

    sget-object v1, Lu1/b;->g:Lu1/b;

    invoke-virtual {v0, v1}, Lrx/subjects/BehaviorSubject;->onNext(Ljava/lang/Object;)V

    .line 2
    invoke-super {p0}, Landroid/app/DialogFragment;->onStop()V

    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroid/app/DialogFragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 2
    iget-object p1, p0, Lcom/trello/rxlifecycle/components/RxDialogFragment;->a:Lrx/subjects/BehaviorSubject;

    sget-object p2, Lu1/b;->c:Lu1/b;

    invoke-virtual {p1, p2}, Lrx/subjects/BehaviorSubject;->onNext(Ljava/lang/Object;)V

    return-void
.end method
