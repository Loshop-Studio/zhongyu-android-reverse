.class public final synthetic Lcom/zykj/study/ui/home/my/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly2/h;


# instance fields
.field public final synthetic a:Lcom/zykj/study/ui/home/my/TeacherFragment;

.field public final synthetic b:Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/study/ui/home/my/TeacherFragment;Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/study/ui/home/my/r;->a:Lcom/zykj/study/ui/home/my/TeacherFragment;

    iput-object p2, p0, Lcom/zykj/study/ui/home/my/r;->b:Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;

    return-void
.end method


# virtual methods
.method public final a(Ly2/f;Ly2/f;I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/r;->a:Lcom/zykj/study/ui/home/my/TeacherFragment;

    iget-object v1, p0, Lcom/zykj/study/ui/home/my/r;->b:Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;

    invoke-static {v0, v1, p1, p2, p3}, Lcom/zykj/study/ui/home/my/TeacherFragment$initView$3;->c(Lcom/zykj/study/ui/home/my/TeacherFragment;Lcom/yanzhenjie/recyclerview/SwipeRecyclerView;Ly2/f;Ly2/f;I)V

    return-void
.end method
