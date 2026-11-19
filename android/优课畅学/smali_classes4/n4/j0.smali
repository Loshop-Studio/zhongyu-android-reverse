.class public final synthetic Ln4/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lcom/zykj/study/adapter/MyCourseAdapter;

.field public final synthetic b:Lcom/zykj/study/data/MyCourseEntity;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/study/adapter/MyCourseAdapter;Lcom/zykj/study/data/MyCourseEntity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln4/j0;->a:Lcom/zykj/study/adapter/MyCourseAdapter;

    iput-object p2, p0, Ln4/j0;->b:Lcom/zykj/study/data/MyCourseEntity;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object v0, p0, Ln4/j0;->a:Lcom/zykj/study/adapter/MyCourseAdapter;

    iget-object v1, p0, Ln4/j0;->b:Lcom/zykj/study/data/MyCourseEntity;

    invoke-static {v0, v1, p1}, Lcom/zykj/study/adapter/MyCourseAdapter;->c(Lcom/zykj/study/adapter/MyCourseAdapter;Lcom/zykj/study/data/MyCourseEntity;Landroid/view/View;)V

    return-void
.end method
