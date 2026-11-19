.class public final Lcom/friday/login/view/LoginActivity$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/blankj/utilcode/util/PermissionUtils$SimpleCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/login/view/LoginActivity;->b0(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/friday/login/view/LoginActivity;

.field public final synthetic b:Landroid/view/View;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/friday/login/view/LoginActivity;Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/login/view/LoginActivity$a;->a:Lcom/friday/login/view/LoginActivity;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/login/view/LoginActivity$a;->b:Landroid/view/View;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/friday/login/view/LoginActivity$a;->c:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/friday/login/view/LoginActivity$a;->d:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p5, p0, Lcom/friday/login/view/LoginActivity$a;->e:Ljava/lang/String;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
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
    const-string v1, "\u7b14\u8bb0\u5b58\u50a8\u9700\u8981\u6743\u9650"

    .line 5
    .line 6
    invoke-static {v1, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showShort(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public onGranted()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/friday/login/view/LoginActivity$a;->a:Lcom/friday/login/view/LoginActivity;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Lcom/friday/common/base/BaseActivity;->isShowLoading(Z)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lcom/friday/login/view/LoginActivity$a;->b:Landroid/view/View;

    .line 8
    .line 9
    invoke-static {v0}, Lcom/blankj/utilcode/util/KeyboardUtils;->hideSoftInput(Landroid/view/View;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lcom/friday/login/view/LoginActivity$a;->a:Lcom/friday/login/view/LoginActivity;

    .line 13
    .line 14
    invoke-static {v0}, Lcom/friday/login/view/LoginActivity;->S(Lcom/friday/login/view/LoginActivity;)Lcom/friday/login/viewmodel/LoginViewModel;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v1, p0, Lcom/friday/login/view/LoginActivity$a;->c:Ljava/lang/String;

    .line 19
    .line 20
    iget-object v2, p0, Lcom/friday/login/view/LoginActivity$a;->d:Ljava/lang/String;

    .line 21
    .line 22
    iget-object v3, p0, Lcom/friday/login/view/LoginActivity$a;->e:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {v0, v1, v2, v3}, Lcom/friday/login/viewmodel/LoginViewModel;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method
