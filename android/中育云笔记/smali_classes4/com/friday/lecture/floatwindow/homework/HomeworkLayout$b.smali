.class public final Lcom/friday/lecture/floatwindow/homework/HomeworkLayout$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/blankj/utilcode/util/PermissionUtils$SimpleCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->A()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public onDenied()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    const-string v1, "\u6ca1\u6709\u62cd\u7167\u6743\u9650"

    .line 5
    .line 6
    invoke-static {v1, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showShort(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public onGranted()V
    .locals 2

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
    invoke-virtual {v0}, Lcom/friday/lecture/floatwindow/homework/b;->g()V

    .line 8
    .line 9
    .line 10
    sget-object v0, Lk2/n;->a:Lk2/n$a;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-virtual {v0, v1}, Lk2/n$a;->f(I)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
