.class public final synthetic Lb5/n5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;


# instance fields
.field public final synthetic a:Lcom/zykj/study/ui/home/my/TeacherFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/study/ui/home/my/TeacherFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb5/n5;->a:Lcom/zykj/study/ui/home/my/TeacherFragment;

    return-void
.end method


# virtual methods
.method public final onRefresh()V
    .locals 1

    .line 1
    iget-object v0, p0, Lb5/n5;->a:Lcom/zykj/study/ui/home/my/TeacherFragment;

    invoke-static {v0}, Lcom/zykj/study/ui/home/my/TeacherFragment;->h(Lcom/zykj/study/ui/home/my/TeacherFragment;)V

    return-void
.end method
