.class public final Lcom/zykj/mistake/feature/home/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/coroutines/flow/g;


# instance fields
.field public final synthetic a:Lcom/zykj/mistake/main/MainShellViewModel;

.field public final synthetic b:Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;

.field public final synthetic c:Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel;

.field public final synthetic d:Lcom/zykj/mistake/feature/review/ReviewViewModel;


# direct methods
.method public constructor <init>(Lcom/zykj/mistake/main/MainShellViewModel;Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel;Lcom/zykj/mistake/feature/review/ReviewViewModel;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/mistake/feature/home/h;->a:Lcom/zykj/mistake/main/MainShellViewModel;

    iput-object p2, p0, Lcom/zykj/mistake/feature/home/h;->b:Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;

    iput-object p3, p0, Lcom/zykj/mistake/feature/home/h;->c:Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel;

    iput-object p4, p0, Lcom/zykj/mistake/feature/home/h;->d:Lcom/zykj/mistake/feature/review/ReviewViewModel;

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lh6/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p1, Lcom/zykj/mistake/main/e;

    .line 2
    .line 3
    sget-object p2, Ld6/s;->a:Ld6/s;

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    return-object p2

    .line 8
    :cond_0
    iget v0, p1, Lcom/zykj/mistake/main/e;->c:I

    .line 9
    .line 10
    iget-object p1, p1, Lcom/zykj/mistake/main/e;->b:Ljava/lang/String;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    iget-object v2, p0, Lcom/zykj/mistake/feature/home/h;->a:Lcom/zykj/mistake/main/MainShellViewModel;

    .line 14
    .line 15
    iput-object v1, v2, Lcom/zykj/mistake/main/MainShellViewModel;->g:Lcom/zykj/mistake/main/p;

    .line 16
    .line 17
    invoke-virtual {v2}, Lcom/zykj/mistake/main/MainShellViewModel;->a()V

    .line 18
    .line 19
    .line 20
    new-instance v1, Lcom/zykj/mistake/feature/notebook/list/z;

    .line 21
    .line 22
    invoke-direct {v1, v0}, Lcom/zykj/mistake/feature/notebook/list/z;-><init>(I)V

    .line 23
    .line 24
    .line 25
    iget-object v2, p0, Lcom/zykj/mistake/feature/home/h;->b:Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;

    .line 26
    .line 27
    invoke-virtual {v2, v1}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->c(Lcom/zykj/mistake/feature/notebook/list/d1;)V

    .line 28
    .line 29
    .line 30
    new-instance v1, Lcom/zykj/mistake/feature/collection/list/h;

    .line 31
    .line 32
    invoke-direct {v1, v0}, Lcom/zykj/mistake/feature/collection/list/h;-><init>(I)V

    .line 33
    .line 34
    .line 35
    iget-object v2, p0, Lcom/zykj/mistake/feature/home/h;->c:Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel;

    .line 36
    .line 37
    invoke-virtual {v2, v1}, Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel;->a(Lcom/zykj/mistake/feature/collection/list/u;)V

    .line 38
    .line 39
    .line 40
    new-instance v1, Lcom/zykj/mistake/feature/review/d;

    .line 41
    .line 42
    invoke-direct {v1, v0, p1}, Lcom/zykj/mistake/feature/review/d;-><init>(ILjava/lang/String;)V

    .line 43
    .line 44
    .line 45
    iget-object p1, p0, Lcom/zykj/mistake/feature/home/h;->d:Lcom/zykj/mistake/feature/review/ReviewViewModel;

    .line 46
    .line 47
    invoke-virtual {p1, v1}, Lcom/zykj/mistake/feature/review/ReviewViewModel;->a(Lcom/zykj/mistake/feature/review/h;)V

    .line 48
    .line 49
    .line 50
    return-object p2
.end method
