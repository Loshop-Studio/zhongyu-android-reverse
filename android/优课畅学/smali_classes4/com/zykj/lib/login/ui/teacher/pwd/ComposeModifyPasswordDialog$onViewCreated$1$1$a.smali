.class public final Lcom/zykj/lib/login/ui/teacher/pwd/ComposeModifyPasswordDialog$onViewCreated$1$1$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll8/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/lib/login/ui/teacher/pwd/ComposeModifyPasswordDialog$onViewCreated$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/zykj/lib/login/ui/teacher/pwd/ComposeModifyPasswordDialog;


# direct methods
.method public constructor <init>(Lcom/zykj/lib/login/ui/teacher/pwd/ComposeModifyPasswordDialog;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/lib/login/ui/teacher/pwd/ComposeModifyPasswordDialog$onViewCreated$1$1$a;->a:Lcom/zykj/lib/login/ui/teacher/pwd/ComposeModifyPasswordDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final c(Lcom/zykj/lib/login/ui/teacher/pwd/b;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    instance-of p2, p1, Lcom/zykj/lib/login/ui/teacher/pwd/b$b;

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lcom/zykj/lib/login/ui/teacher/pwd/ComposeModifyPasswordDialog$onViewCreated$1$1$a;->a:Lcom/zykj/lib/login/ui/teacher/pwd/ComposeModifyPasswordDialog;

    .line 6
    .line 7
    invoke-static {p1}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, Landroidx/navigation/NavController;->navigateUp()Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    invoke-static {p1}, Lo7/a;->a(Z)Ljava/lang/Boolean;

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    instance-of p2, p1, Lcom/zykj/lib/login/ui/teacher/pwd/b$a;

    .line 20
    .line 21
    if-eqz p2, :cond_1

    .line 22
    .line 23
    check-cast p1, Lcom/zykj/lib/login/ui/teacher/pwd/b$a;

    .line 24
    .line 25
    invoke-virtual {p1}, Lcom/zykj/lib/login/ui/teacher/pwd/b$a;->a()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-static {p1}, Lcom/xuexiang/xui/utils/j;->a(Ljava/lang/CharSequence;)V

    .line 30
    .line 31
    .line 32
    :goto_0
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 33
    .line 34
    return-object p1

    .line 35
    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 36
    .line 37
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 38
    .line 39
    .line 40
    throw p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/zykj/lib/login/ui/teacher/pwd/b;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/zykj/lib/login/ui/teacher/pwd/ComposeModifyPasswordDialog$onViewCreated$1$1$a;->c(Lcom/zykj/lib/login/ui/teacher/pwd/b;Lm7/c;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
