.class public final synthetic Lz4/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# instance fields
.field public final synthetic a:Lcom/zykj/study/ui/home/find/search/SearchResultFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/study/ui/home/find/search/SearchResultFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz4/j;->a:Lcom/zykj/study/ui/home/find/search/SearchResultFragment;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lz4/j;->a:Lcom/zykj/study/ui/home/find/search/SearchResultFragment;

    check-cast p1, Lcom/zykj/study/bean/course/CourseSimpleBean;

    invoke-static {v0, p1}, Lcom/zykj/study/ui/home/find/search/SearchResultFragment;->i(Lcom/zykj/study/ui/home/find/search/SearchResultFragment;Lcom/zykj/study/bean/course/CourseSimpleBean;)Lh7/p;

    move-result-object p1

    return-object p1
.end method
