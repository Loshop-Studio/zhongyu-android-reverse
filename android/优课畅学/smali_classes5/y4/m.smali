.class public final synthetic Ly4/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# instance fields
.field public final synthetic a:Lcom/zykj/study/ui/home/find/CourseFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/study/ui/home/find/CourseFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly4/m;->a:Lcom/zykj/study/ui/home/find/CourseFragment;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Ly4/m;->a:Lcom/zykj/study/ui/home/find/CourseFragment;

    check-cast p1, Lcom/zykj/study/bean/course/CourseSimpleBean;

    invoke-static {v0, p1}, Lcom/zykj/study/ui/home/find/CourseFragment;->g(Lcom/zykj/study/ui/home/find/CourseFragment;Lcom/zykj/study/bean/course/CourseSimpleBean;)Lh7/p;

    move-result-object p1

    return-object p1
.end method
