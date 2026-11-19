# RE note 本类字节码直接引用的读写或显示接口包括文件流。
.class final Lcom/friday/paint/view/six/NewStudentPaintFragment$submitSubjectiveHomework$1$1$uploadStatus$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/paint/view/six/NewStudentPaintFragment$submitSubjectiveHomework$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lhd/p;"
    }
.end annotation

.annotation runtime Lxc/d;
    c = "com.friday.paint.view.six.NewStudentPaintFragment$submitSubjectiveHomework$1$1$uploadStatus$1"
    f = "NewStudentPaintFragment.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment$submitSubjectiveHomework$1$1$uploadStatus$1;->d:Ljava/lang/String;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment$submitSubjectiveHomework$1$1$uploadStatus$1;->e:Ljava/lang/String;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 2

    .line 1
    new-instance p1, Lcom/friday/paint/view/six/NewStudentPaintFragment$submitSubjectiveHomework$1$1$uploadStatus$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment$submitSubjectiveHomework$1$1$uploadStatus$1;->d:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment$submitSubjectiveHomework$1$1$uploadStatus$1;->e:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/friday/paint/view/six/NewStudentPaintFragment$submitSubjectiveHomework$1$1$uploadStatus$1;-><init>(Ljava/lang/String;Ljava/lang/String;Lvc/c;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/friday/paint/view/six/NewStudentPaintFragment$submitSubjectiveHomework$1$1$uploadStatus$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/paint/view/six/NewStudentPaintFragment$submitSubjectiveHomework$1$1$uploadStatus$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/paint/view/six/NewStudentPaintFragment$submitSubjectiveHomework$1$1$uploadStatus$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/paint/view/six/NewStudentPaintFragment$submitSubjectiveHomework$1$1$uploadStatus$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment$submitSubjectiveHomework$1$1$uploadStatus$1;->c:I

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    sget-object p1, Lk2/q;->a:Lk2/q;

    .line 12
    .line 13
    iget-object v0, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment$submitSubjectiveHomework$1$1$uploadStatus$1;->d:Ljava/lang/String;

    .line 14
    .line 15
    new-instance v1, Ljava/io/FileInputStream;

    .line 16
    .line 17
    new-instance v2, Ljava/io/File;

    .line 18
    .line 19
    iget-object v3, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment$submitSubjectiveHomework$1$1$uploadStatus$1;->e:Ljava/lang/String;

    .line 20
    .line 21
    invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-direct {v1, v2}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, v0, v1}, Lk2/q;->c(Ljava/lang/String;Ljava/io/InputStream;)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    invoke-static {p1}, Lxc/a;->a(Z)Ljava/lang/Boolean;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1

    .line 36
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 37
    .line 38
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 39
    .line 40
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    throw p1
.end method
