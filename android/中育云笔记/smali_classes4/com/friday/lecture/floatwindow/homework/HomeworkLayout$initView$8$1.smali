.class public final Lcom/friday/lecture/floatwindow/homework/HomeworkLayout$initView$8$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq6/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->A()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;


# direct methods
.method public constructor <init>(Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout$initView$8$1;->a:Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(Ljava/util/ArrayList;)V
    .locals 6

    .line 1
    invoke-static {}, Lkotlinx/coroutines/d;->b()Lsd/i0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v3, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout$initView$8$1$onResult$1;

    .line 6
    .line 7
    iget-object v1, p0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout$initView$8$1;->a:Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-direct {v3, p1, v1, v2}, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout$initView$8$1$onResult$1;-><init>(Ljava/util/ArrayList;Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;Lvc/c;)V

    .line 11
    .line 12
    .line 13
    const/4 v4, 0x3

    .line 14
    const/4 v5, 0x0

    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-static/range {v0 .. v5}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public onCancel()V
    .locals 1

    .line 1
    sget-object v0, Lcom/friday/lecture/floatwindow/homework/b;->d:Lcom/friday/lecture/floatwindow/homework/b$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/friday/lecture/floatwindow/homework/b$a;->a()Lcom/friday/lecture/floatwindow/homework/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lcom/friday/lecture/floatwindow/homework/b;->i()V

    .line 8
    .line 9
    .line 10
    return-void
.end method
