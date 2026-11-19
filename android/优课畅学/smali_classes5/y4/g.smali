.class public final synthetic Ly4/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# instance fields
.field public final synthetic a:Landroidx/recyclerview/widget/RecyclerView;


# direct methods
.method public synthetic constructor <init>(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly4/g;->a:Landroidx/recyclerview/widget/RecyclerView;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Ly4/g;->a:Landroidx/recyclerview/widget/RecyclerView;

    check-cast p1, Lcom/zykj/study/bean/course/CatalogBean;

    invoke-static {v0, p1}, Lcom/zykj/study/ui/home/find/CourseDetailsFragment;->k(Landroidx/recyclerview/widget/RecyclerView;Lcom/zykj/study/bean/course/CatalogBean;)Lh7/p;

    move-result-object p1

    return-object p1
.end method
