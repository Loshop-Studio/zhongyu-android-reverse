.class public final synthetic Lcom/zykj/study/ui/home/my/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# instance fields
.field public final synthetic a:Lcom/zykj/study/ui/home/my/TeacherFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/study/ui/home/my/TeacherFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/study/ui/home/my/q;->a:Lcom/zykj/study/ui/home/my/TeacherFragment;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/q;->a:Lcom/zykj/study/ui/home/my/TeacherFragment;

    invoke-static {v0}, Lcom/zykj/study/ui/home/my/TeacherFragment$initData$4;->c(Lcom/zykj/study/ui/home/my/TeacherFragment;)Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    move-result-object v0

    return-object v0
.end method
