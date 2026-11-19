.class public final synthetic Lp3/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# instance fields
.field public final synthetic a:Lcom/zykj/lib/login/ui/teacher/TeacherLoginFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/lib/login/ui/teacher/TeacherLoginFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp3/b;->a:Lcom/zykj/lib/login/ui/teacher/TeacherLoginFragment;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lp3/b;->a:Lcom/zykj/lib/login/ui/teacher/TeacherLoginFragment;

    check-cast p1, Landroidx/activity/OnBackPressedCallback;

    invoke-static {v0, p1}, Lcom/zykj/lib/login/ui/teacher/TeacherLoginFragment;->g(Lcom/zykj/lib/login/ui/teacher/TeacherLoginFragment;Landroidx/activity/OnBackPressedCallback;)Lh7/p;

    move-result-object p1

    return-object p1
.end method
